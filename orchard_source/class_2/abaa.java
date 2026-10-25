package nsc;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_6367;

@Environment(EnvType.CLIENT)
public final class abaa extends abbaabbaa {
   private class_6367 aa;
   private final abbaaaaa ab;
   private static final ababbbbaa ba;
   private static final ababbbbaa bb;
   private static final Integer[] aaa;
   private final baabaab aab;
   private static final long aba;
   private final abbaaaaa abb;
   private static final int[] abaa;
   private static final String[] abab;
   private static final String[] baa;
   private static final Object[] abba;
   private static final String[] bab;
   private GpuBuffer bba;
   private static final long[] bbb;
   private static final ababbbbaa aaaa;
   private final abaabaaab aaab;
   private static final ababbbbaa aaba;
   private final ByteBuffer aabb;

   private static String aa(int var0, int var1) {
      int var9 = -1265724330;
      int var2 = (var0 ^ a(1791047174, var9 ^ 1093963136)) & a(1791047175, var9 ^ -1596256057);
      if (baa[var2] == null) {
         char[] var3 = bab[var2].toCharArray();

         int var4 = switch (var3[0] & a(1791047172, var9 ^ 428108695)) {
            case 0 -> a(1791047173, var9 ^ -186988133);
            case 1 -> a(1791047170, var9 ^ -506341281);
            case 2 -> a(1791047171, var9 ^ -2144160964);
            case 3 -> a(1791047168, var9 ^ -403614511);
            case 4 -> a(1791047169, var9 ^ 2084180540);
            case 5 -> a(1791047182, var9 ^ -232523749);
            case 6 -> a(1791047183, var9 ^ 791231466);
            case 7 -> a(1791047180, var9 ^ 640118122);
            case 8 -> a(1791047181, var9 ^ 781985766);
            case 9 -> a(1791047178, var9 ^ -44822338);
            case 10 -> a(1791047179, var9 ^ -535548830);
            case 11 -> a(1791047176, var9 ^ -1378073736);
            case 12 -> a(1791047177, var9 ^ -1295765433);
            case 13 -> a(1791047190, var9 ^ -1874584361);
            case 14 -> a(1791047191, var9 ^ -615008333);
            case 15 -> a(1791047188, var9 ^ 839196950);
            case 16 -> a(1791047189, var9 ^ 485797147);
            case 17 -> a(1791047186, var9 ^ 286704211);
            case 18 -> a(1791047187, var9 ^ 1970550746);
            case 19 -> a(1791047184, var9 ^ -1439497757);
            case 20 -> a(1791047185, var9 ^ -1550780599);
            case 21 -> a(1791047198, var9 ^ -637295625);
            case 22 -> a(1791047199, var9 ^ -743963539);
            case 23 -> a(1791047196, var9 ^ -1824503826);
            case 24 -> a(1791047197, var9 ^ 1584831350);
            case 25 -> a(1791047194, var9 ^ -1242734647);
            case 26 -> a(1791047195, var9 ^ -1373397120);
            case 27 -> a(1791047192, var9 ^ -1619957302);
            case 28 -> a(1791047193, var9 ^ 1756541126);
            case 29 -> a(1791047206, var9 ^ 249943659);
            case 30 -> a(1791047207, var9 ^ -1126093640);
            case 31 -> a(1791047204, var9 ^ -1444800106);
            case 32 -> a(1791047205, var9 ^ 387135053);
            case 33 -> a(1791047202, var9 ^ 1013892092);
            case 34 -> a(1791047203, var9 ^ -729398646);
            case 35 -> a(1791047200, var9 ^ 1302051414);
            case 36 -> a(1791047201, var9 ^ 181664532);
            case 37 -> a(1791047214, var9 ^ -153942536);
            case 38 -> a(1791047215, var9 ^ 1563736500);
            case 39 -> a(1791047212, var9 ^ 2140882476);
            case 40 -> a(1791047213, var9 ^ 755681322);
            case 41 -> a(1791047210, var9 ^ 49306328);
            case 42 -> a(1791047211, var9 ^ -1720849758);
            case 43 -> a(1791047208, var9 ^ 1305480548);
            case 44 -> a(1791047209, var9 ^ 1721043652);
            case 45 -> a(1791047222, var9 ^ -640135218);
            case 46 -> a(1791047223, var9 ^ -659264793);
            case 47 -> a(1791047220, var9 ^ 1736726477);
            case 48 -> a(1791047221, var9 ^ -555558252);
            case 49 -> a(1791047218, var9 ^ 1334961157);
            case 50 -> a(1791047219, var9 ^ 340771706);
            case 51 -> a(1791047216, var9 ^ 2037661391);
            case 52 -> a(1791047217, var9 ^ -771840536);
            case 53 -> a(1791047230, var9 ^ -1481669825);
            case 54 -> a(1791047231, var9 ^ 1581854882);
            case 55 -> 0;
            case 56 -> a(1791047228, var9 ^ -932503634);
            case 57 -> a(1791047229, var9 ^ -1378818469);
            case 58 -> a(1791047226, var9 ^ -1756080706);
            case 59 -> a(1791047227, var9 ^ 1359888223);
            case 60 -> a(1791047224, var9 ^ -1475927492);
            case 61 -> a(1791047225, var9 ^ 1121263717);
            case 62 -> a(1791047238, var9 ^ 865636771);
            case 63 -> a(1791047239, var9 ^ 1242216917);
            case 64 -> a(1791047236, var9 ^ 1137319620);
            case 65 -> a(1791047237, var9 ^ 1172024187);
            case 66 -> a(1791047234, var9 ^ -568483635);
            case 67 -> a(1791047235, var9 ^ 820919829);
            case 68 -> a(1791047232, var9 ^ 1641061900);
            case 69 -> a(1791047233, var9 ^ -476749831);
            case 70 -> a(1791047246, var9 ^ -1043499538);
            case 71 -> a(1791047247, var9 ^ 516757597);
            case 72 -> a(1791047244, var9 ^ -1799577001);
            case 73 -> a(1791047245, var9 ^ -360258471);
            case 74 -> a(1791047242, var9 ^ -772429232);
            case 75 -> a(1791047243, var9 ^ -2106193745);
            case 76 -> a(1791047240, var9 ^ -1655326047);
            case 77 -> a(1791047241, var9 ^ -981066604);
            case 78 -> a(1791047254, var9 ^ -1837591466);
            case 79 -> a(1791047255, var9 ^ 1984022110);
            case 80 -> a(1791047252, var9 ^ 779330176);
            case 81 -> a(1791047253, var9 ^ 880693982);
            case 82 -> a(1791047250, var9 ^ -2099662536);
            case 83 -> a(1791047251, var9 ^ -1152194902);
            case 84 -> a(1791047248, var9 ^ 1360682275);
            case 85 -> a(1791047249, var9 ^ 1062599593);
            case 86 -> a(1791047262, var9 ^ 441165625);
            case 87 -> a(1791047263, var9 ^ -463912441);
            case 88 -> a(1791047260, var9 ^ -2120095922);
            case 89 -> 2;
            case 90 -> a(1791047261, var9 ^ 1571186522);
            case 91 -> a(1791047258, var9 ^ -252991074);
            case 92 -> a(1791047259, var9 ^ -867311604);
            case 93 -> a(1791047256, var9 ^ -551097298);
            case 94 -> a(1791047257, var9 ^ 1576519457);
            case 95 -> a(1791047270, var9 ^ 927158538);
            case 96 -> a(1791047271, var9 ^ 335646155);
            case 97 -> a(1791047268, var9 ^ 1121291208);
            case 98 -> a(1791047269, var9 ^ -101595892);
            case 99 -> a(1791047266, var9 ^ -39291819);
            case 100 -> a(1791047267, var9 ^ -1926641846);
            case 101 -> a(1791047264, var9 ^ 1976705227);
            case 102 -> a(1791047265, var9 ^ 68430345);
            case 103 -> a(1791047278, var9 ^ 1631894447);
            case 104 -> a(1791047279, var9 ^ 1222527844);
            case 105 -> a(1791047276, var9 ^ 422896597);
            case 106 -> a(1791047277, var9 ^ 13584774);
            case 107 -> a(1791047274, var9 ^ -1669603416);
            case 108 -> a(1791047275, var9 ^ -935721259);
            case 109 -> a(1791047272, var9 ^ 1130981958);
            case 110 -> a(1791047273, var9 ^ 904397289);
            case 111 -> a(1791047286, var9 ^ -2024995077);
            case 112 -> a(1791047287, var9 ^ 1367716115);
            case 113 -> a(1791047284, var9 ^ -1064263163);
            case 114 -> a(1791047285, var9 ^ 1692343482);
            case 115 -> a(1791047282, var9 ^ 286918671);
            case 116 -> a(1791047283, var9 ^ 1828755047);
            case 117 -> a(1791047280, var9 ^ -994853481);
            case 118 -> a(1791047281, var9 ^ -938380970);
            case 119 -> a(1791047294, var9 ^ -791053013);
            case 120 -> a(1791047295, var9 ^ -1305126682);
            case 121 -> a(1791047292, var9 ^ 1085366372);
            case 122 -> a(1791047293, var9 ^ 1755968560);
            case 123 -> a(1791047290, var9 ^ -1871903480);
            case 124 -> a(1791047291, var9 ^ -1167384594);
            case 125 -> a(1791047288, var9 ^ 326623795);
            case 126 -> 1;
            case 127 -> a(1791047289, var9 ^ 2105040618);
            case 128 -> a(1791047302, var9 ^ 1820578982);
            case 129 -> a(1791047303, var9 ^ 735178584);
            case 130 -> a(1791047300, var9 ^ 1455499901);
            case 131 -> a(1791047301, var9 ^ 1022073536);
            case 132 -> a(1791047298, var9 ^ 596491930);
            case 133 -> a(1791047299, var9 ^ -457801016);
            case 134 -> a(1791047296, var9 ^ 1576794500);
            case 135 -> a(1791047297, var9 ^ -978556361);
            case 136 -> a(1791047310, var9 ^ 2090755580);
            case 137 -> a(1791047311, var9 ^ 643228899);
            case 138 -> a(1791047308, var9 ^ 60355799);
            case 139 -> a(1791047309, var9 ^ 209246007);
            case 140 -> a(1791047306, var9 ^ 870087919);
            case 141 -> a(1791047307, var9 ^ -1327999784);
            case 142 -> a(1791047304, var9 ^ 885297888);
            case 143 -> a(1791047305, var9 ^ 1959528615);
            case 144 -> a(1791047318, var9 ^ -266055719);
            case 145 -> a(1791047319, var9 ^ 1003564734);
            case 146 -> a(1791047316, var9 ^ -1873486417);
            case 147 -> a(1791047317, var9 ^ -554421929);
            case 148 -> a(1791047314, var9 ^ 804861711);
            case 149 -> a(1791047315, var9 ^ 2028732004);
            case 150 -> a(1791047312, var9 ^ 740230420);
            case 151 -> a(1791047313, var9 ^ 800233531);
            case 152 -> a(1791047326, var9 ^ 614491117);
            case 153 -> a(1791047327, var9 ^ 977405266);
            case 154 -> a(1791047324, var9 ^ 332787459);
            case 155 -> a(1791047325, var9 ^ 730395167);
            case 156 -> a(1791047322, var9 ^ 2017473766);
            case 157 -> a(1791047323, var9 ^ 2052419802);
            case 158 -> a(1791047320, var9 ^ -836496756);
            case 159 -> a(1791047321, var9 ^ -1430824261);
            case 160 -> a(1791047334, var9 ^ -544521794);
            case 161 -> a(1791047335, var9 ^ -417996329);
            case 162 -> a(1791047332, var9 ^ 1758892488);
            case 163 -> 5;
            case 164 -> a(1791047333, var9 ^ 1894944069);
            case 165 -> a(1791047330, var9 ^ -474823685);
            case 166 -> a(1791047331, var9 ^ -282430932);
            case 167 -> a(1791047328, var9 ^ 241200758);
            case 168 -> a(1791047329, var9 ^ -1423236860);
            case 169 -> a(1791047342, var9 ^ -849264154);
            case 170 -> 3;
            case 171 -> a(1791047343, var9 ^ -1608559627);
            case 172 -> a(1791047340, var9 ^ 1681906893);
            case 173 -> a(1791047341, var9 ^ 229841803);
            case 174 -> a(1791047338, var9 ^ -1341586563);
            case 175 -> a(1791047339, var9 ^ -1752962824);
            case 176 -> a(1791047336, var9 ^ -1752602233);
            case 177 -> a(1791047337, var9 ^ 293114009);
            case 178 -> a(1791047350, var9 ^ 685735297);
            case 179 -> a(1791047351, var9 ^ 2120434586);
            case 180 -> a(1791047348, var9 ^ 2087537629);
            case 181 -> a(1791047349, var9 ^ 506884399);
            case 182 -> a(1791047346, var9 ^ 1957467647);
            case 183 -> a(1791047347, var9 ^ 314391695);
            case 184 -> a(1791047344, var9 ^ -1376282740);
            case 185 -> a(1791047345, var9 ^ -46122271);
            case 186 -> a(1791047358, var9 ^ 832566910);
            case 187 -> a(1791047359, var9 ^ -1393547108);
            case 188 -> a(1791047356, var9 ^ -1274683138);
            case 189 -> a(1791047357, var9 ^ -556575923);
            case 190 -> a(1791047354, var9 ^ -279652200);
            case 191 -> a(1791047355, var9 ^ 859259364);
            case 192 -> a(1791047352, var9 ^ -1916025932);
            case 193 -> a(1791047353, var9 ^ -1726149392);
            case 194 -> a(1791047366, var9 ^ -1117996414);
            case 195 -> a(1791047367, var9 ^ 1640197502);
            case 196 -> a(1791047364, var9 ^ 1385365442);
            case 197 -> a(1791047365, var9 ^ -1890851225);
            case 198 -> a(1791047362, var9 ^ 1293648654);
            case 199 -> a(1791047363, var9 ^ -1051352704);
            case 200 -> a(1791047360, var9 ^ -625510546);
            case 201 -> a(1791047361, var9 ^ 505809390);
            case 202 -> a(1791047374, var9 ^ 796670828);
            case 203 -> a(1791047375, var9 ^ 468264032);
            case 204 -> a(1791047372, var9 ^ -1124562007);
            case 205 -> a(1791047373, var9 ^ 314315157);
            case 206 -> a(1791047370, var9 ^ -1465840787);
            case 207 -> a(1791047371, var9 ^ 547203169);
            case 208 -> a(1791047368, var9 ^ 807309498);
            case 209 -> a(1791047369, var9 ^ -384777035);
            case 210 -> a(1791047382, var9 ^ -1870474027);
            case 211 -> a(1791047383, var9 ^ 848291303);
            case 212 -> a(1791047380, var9 ^ 668446962);
            case 213 -> a(1791047381, var9 ^ -322534060);
            case 214 -> a(1791047378, var9 ^ 241753258);
            case 215 -> a(1791047379, var9 ^ 541075735);
            case 216 -> a(1791047376, var9 ^ -1569241003);
            case 217 -> a(1791047377, var9 ^ 2036517141);
            case 218 -> a(1791047390, var9 ^ 1400050272);
            case 219 -> a(1791047391, var9 ^ 708478172);
            case 220 -> a(1791047388, var9 ^ 1658808702);
            case 221 -> 4;
            case 222 -> a(1791047389, var9 ^ 278425221);
            case 223 -> a(1791047386, var9 ^ -701450786);
            case 224 -> a(1791047387, var9 ^ 2035685297);
            case 225 -> a(1791047384, var9 ^ 1874478845);
            case 226 -> a(1791047385, var9 ^ -1207260706);
            case 227 -> a(1791047398, var9 ^ -1403287650);
            case 228 -> a(1791047399, var9 ^ 1677467907);
            case 229 -> a(1791047396, var9 ^ -1019928593);
            case 230 -> a(1791047397, var9 ^ 1521058301);
            case 231 -> a(1791047394, var9 ^ -1429502285);
            case 232 -> a(1791047395, var9 ^ -450725965);
            case 233 -> a(1791047392, var9 ^ 289547837);
            case 234 -> a(1791047393, var9 ^ 726164204);
            case 235 -> a(1791047406, var9 ^ 1155124199);
            case 236 -> a(1791047407, var9 ^ 1431859077);
            case 237 -> a(1791047404, var9 ^ -138782631);
            case 238 -> a(1791047405, var9 ^ -1205937207);
            case 239 -> a(1791047402, var9 ^ -243229445);
            case 240 -> a(1791047403, var9 ^ 1181007743);
            case 241 -> a(1791047400, var9 ^ -1644420993);
            case 242 -> a(1791047401, var9 ^ 1163382586);
            case 243 -> a(1791047414, var9 ^ 1446357258);
            case 244 -> a(1791047415, var9 ^ 577068957);
            case 245 -> a(1791047412, var9 ^ -1772471505);
            case 246 -> a(1791047413, var9 ^ -2102964454);
            case 247 -> a(1791047410, var9 ^ 1144516503);
            case 248 -> a(1791047411, var9 ^ 1479137592);
            case 249 -> a(1791047408, var9 ^ 1024698833);
            case 250 -> a(1791047409, var9 ^ 56594800);
            case 251 -> a(1791047422, var9 ^ 583901476);
            case 252 -> a(1791047423, var9 ^ -76468083);
            case 253 -> a(1791047420, var9 ^ -49034466);
            case 254 -> a(1791047421, var9 ^ 964075424);
            default -> a(1791047418, var9 ^ -224865053);
         };
         int var5 = (var1 & a(1791047419, var9 ^ 802068461)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1791047416, var9 ^ 86536344)) >>> a(1791047417, var9 ^ -1925875576)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1791047430, var9 ^ -2032526865);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1791047431, var9 ^ -766201184);
            }
         }

         baa[var2] = new String(var3).intern();
      }

      return baa[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = -1057371552;
      String var24 = "ꐥꐐꐢꑔ꒿ꐘꓪꑚꑎꓱꐍ꓀ꓹꒅꑸ꓆ꒉꒌꓼ꓄ꑕꒈꑉꐌꐋ꓆ꓹꓧ꒧꒾ꐮ꒙ꐌ꒚\ua4ceꐪꒄ\ua4ce꒣꓄ꑦꐄꐴꒋꓢꓽ꒐ꑆꐵ꓁ꓕꐵꐪ꒗ꐥꐦ꒹ꓲ\ua48eꒉ꒩ꐟꑶꓔꓩꑆꓫ꒡ꐇꑎ꒨ꑮ꒭ꐈꑁꓟꓠꐣ꒸ꑸꓚꓷꑤ꒣꒳\ua4caꑌꐑꒂꐆꐃꓡ꓃ꐑꐞ꒷ꐈ꒻꒩ꑪ꒱ꐐꐵ꓁ꑊꐷꑼꒆꓵꑩꐱꐎꑾ꓃꓆\ua48fꐛꑸ꒺ꐥ꒓꓁ꐙꑹ\ua4cbꓧ꒣ꐋꓦꓰꐫ꒕꒱ꑱꐥ꒶ꒁꒂꑡꑃꑠꑳꓼ\ua4cfꓶꑷ\ua4cdꑮꑁꑟꒄꐁꐤ꒹ꐙꐞꑎꑌꓶꑅ꒙ꓺꓐ꒐ꓩꓴꒀꓛꑿꓳ\ua4ccꑰ꒱꒴ꑠꐆꑣ꒐ꓵ\ua4cb꒖ꒅꐃꐮꓖꑁ꒙ꐄ꒒ꑞꓺꑞꑜꑮ\ua4c8꒽ꑭꓘꓵꓲꑞꓙꐴ꒑꒣ꒉꐫꑎꒌꑘ\ua4cbꑲꓫꑝꐗꒊ꒡ꑘꒇ费赋跗跫跬趠趾趘跦贖贔贺趋起贽败贐赣跄跅跺跬跉跴跖赧趿趋赙贱赗贂跞묱뭂뭈묚뮏뭀뮖묝뮌뭆뭽묋믔뮭묏뭑믱뭬뭄믜뭧뭆뭌믡텊퇖퇓톷텸턜터톺톻톡䞖䞴䞲䟯䜕䜊䜠䞾䜇䝴䟂䞖䟡䜇䟝䝩ஹଥଠୄ\u0b8b௯\u0bc3\u0b49ୈ\u0b52";
      char[] var25 = "ⲬⱖⱯⱽⱧⱽ".toCharArray();
      short var23 = 11383;
      byte var30 = -1;
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         int var28 = 0;
         int var29 = 0;
         if (var30 == 0) {
            abab = var26;
            abba = new Object[var26.length];
            int var19 = 1480780251;
            byte[] var17 = "Ç8B?&×Z¯\u009f\u0089\"ür×\u0080\u008fgÜ\u0092ô\u0006?ùIaü\u001e\u001fú7X±t.²ÿ©$qs *'Ñ¨\u0091m.{YYôf\u0019fÄ+Ñ\t\f4ÉzÐ\u0016IUÖ]Zý\u0010´\bh^\u009aùçÊ\u0097\u001b\u008bbóy}n,>Kx%\u009d½Ï\\\u000eéFU¥N\u0007\u0015M\u000e×Ø{ÑÓ3à\u0016ã(.Ö²\u0019|#oî¿úX\u0088è\u009c®:ìfw/ïPé\u0091\u001e|\u009bºc\u008aÛR\u008b\u000báË\u0096óW\u008cÞ±\u0083pÞO\u0000Û9ó\"ù\u0096\u000fL«\u0007\u0082µ\u0084ý\u0013 \u001f` ìËÝGÎà\u0098Cñ_Õ\u0006â^¹ Há\u0089\u001eÑXï\u0090\u0002É\u009c®ñ\u0092B\u0089úÿytjWóï\f!¢Ê_ØDy\u0095NfUh+Ý¬å\u0011Y\u001c«×\u0003vZ.\nk1ÄØj«µ\u0095Ø×Ì\u0007ðÃÅÇTûÃÖáØX\u0010ê)¶ãw\u001fçÝÔ³e\u0098\u0016´GÀ?B\u0098ÀQH\u0012±èÚl\u008b®ûWøàe\u0004{Aü\u001bXð\u0004C\u008bV\u0017\u0014uÝWðL\u008cÙ¨~è¥²s\u0018P\u0004Ôûà=_¯÷×\u0017\u0017Ó¹X±\u0001\u009cFî2bT\b(\u0007¬\u00adêÛ«.WvæàêJ@©\u001aY+¦\u0001Ûú\u008d\n±N\u001bÈ\u0092\fÇZÄØÂ\u009a\u007fü\u008f×{¥>£\u000b$\u008dHóßj\u0001\u0082\u0019`\u0095çIòÂÎÓ\u0002\u001f\u009f9ª \u0086Â\u0000Ö\u001av\u0095\"N7L\u0004Åd#A³åKg\u0001@OÐ×\u0088øUF\u009dè\u0015âÒU\u008a\u0097\u0017B\u0005ë\rß+B¾÷BN\u001c8&VÔ4\u001a48\u0011\u0082Æ¼)\u001cî¤¾\u0091\u0016`Ly<fU*\u0095z¨\u0088ûu\u0014ôê\u008e\u009eì\u00adÜ¦óÐÌ`\u001cºæÐÁ¥\u0080ô´b»ËUÛö³ïC¡#\u0082ú\u0093,1 [®ñ\u0085\u0095¾Ò\u008au\u009d\u0018µÑ5.6Õ\u001e\u008a²ÉÛ_òÁA\tv)\u0006\u0001½Üd¸\u0016Y\u0097FXùx\u009b©ô~\u008eþæ·×ª\u0012Op©¿ÒÉ¢\u00ad*9¼OLÍ\u0095Ø¦Ç\u00ad\u0085¸øþM~¨üX:½H)Xø,º\u0010\u009eY\u0086\u000bka\u0018«¿îÛÛâöÿÄïe¿\u0089Âi'8t\u0088m'Ñ-&hºKl\u000bÒ&\u0012\u0019¯â2\u00955\u008b¾Qù6\u0004I\u000f\u0011\u008e¢û\u0011\u0084#\u0094\u0097uÚR®Ò4\u001aøn\nkú`\u0001È\u0098;;*ò¡Üf\u0094°vØ+úÞo{Mpß·\u0092¼!*ýa12\bªÄXÞ\u0019AiY\u00912µ:\u000bÀ\u000bÆ\u008a5\u001f\u0010F\u0089;Qð\u0093çÎ'tÔ\u009fµï\tF¬xË\u0016É¬GXèN\\º>À\u0098+@\r©qr\u0088\u009dän<:õÂ^\u0094±[Ð.¬A\"¦\u0090áë¶\u0013Úòo\u001d\u008dz\u0016\u008f\u009eÐ´\u0082¯\u009b¡ÚúîjËÏS\u0088e\u0095<¦McI$z\u0001Úÿo\u0080ÎÕ~[ù¬7Í'äÒ ´\u0096\u0095'QP=ÿªÿ[]\u0014é·\u000f8>\u0007ãÅ*VÍ©åñhÞE8UÌÜ¤Ë\u0088,ÆÌ(c/>E\u0097OlA\u00adE+>ÂÔ\u0081\u009bÓU%£q·\u0012~>\u0013\u0091Õw\u008dÖeÀiö¬\u001bñiÁÃZ\u0085\rÐ8ã\f¤h\u0015\u0094\u0010WqB\u0004ª\u0005\u0089Â:¥\u0097Þ$\u0093%»\u001eã\u0094\u0085RÛ\\¤Àë[}|yT{\u001e\u0082Þ¿{Ö\u001ft\u0095\u009d\u001b©ÃÞy\u0083$:\u000f\u000b82\u0015\u0000×Q\u0086TYúÈÝ\u0019û8\t²p\u0094qÚxqnñÉaó{Ýrá¨\u009cõk.ÚÌO\u000fG¾jY¦È0xz\u0093eñ¾ó\u0013\u0090)LØb\u008bÔPïÃ½Ôí\u0016ä\u000b0t\u0085¬bå%\u0097\u0098\u00977k\u0017Pbîo\u0080EÔ\u0090c\u0011\u001c\u00ad\nY\u009bÅ\u0003: Qg½\u0087\"¿\u0083ý\u0001´2èMô\r\u0098ìÿRpÅÙà\u0001â¹¬þ)\u0018\u009cä\u00adøH/ý\\å5oÿ?@\u0018¶\u0015í¯÷\u0083\u0015\u00846vhð\u0004²\u0018®/@U=\u009e·\u0018y\u0006ArÞ=s]7\u0017BãÌ\u0095 Y¬ÕÏ,oc¶\u0018E¹\u000b,À$òÓ£[ý¼Ù\u0004k\u001f.?\u0085Ûè\u001f\u001c ûÆýðÆ\u008dbO¿þ\u0091ÿßA\u001d"
               .getBytes("ISO-8859-1");
            int var18 = var17.length / 4;
            abaa = new int[var18];
            byte var20 = 0;
            int var21 = 0;

            do {
               int var22 = (var17[var20] & 255) << 24 | (var17[var20 + 1] & 255) << 16 | (var17[var20 + 2] & 255) << 8 | var17[var20 + 3] & 255;
               var22 ^= var19;
               abaa[var21] = var22;
               var20 += 4;
            } while (++var21 < var18);

            String[] var15 = new String[a(1791047442, var34 ^ -1720892124)];
            int var13 = 0;
            String var12;
            int var14 = (var12 = b(-1582290894, 32085, (short)-5587, (byte)-63, (byte)95, (byte)-124)).length();
            int var11 = a(1791047443, var34 ^ 471176468);
            int var37 = -1;

            label118:
            while (true) {
               String var40 = var12.substring(++var37, var37 + var11);
               int var10001 = -1;

               while (true) {
                  char[] var57;
                  label113: {
                     char[] var44 = var40.toCharArray();
                     int var10003 = var44.length;
                     int var16 = 0;
                     var57 = var44;
                     var10001 = var10003;
                     char[] var68;
                     int var10004;
                     if (var10003 <= 1) {
                        var68 = var44;
                        var10004 = var16;
                     } else {
                        var57 = var44;
                        var10001 = var10003;
                        if (var10003 <= var16) {
                           break label113;
                        }

                        var68 = var44;
                        var10004 = var16;
                     }

                     while (true) {
                        var68[var10004] = (char)(var68[var10004] ^ switch (var16 % a(1791047454, var34 ^ 1774130805)) {
                           case 0 -> a(1791047455, var34 ^ -768904465);
                           case 1 -> a(1791047452, var34 ^ 1968745064);
                           case 2 -> a(1791047453, var34 ^ 259760607);
                           case 3 -> a(1791047450, var34 ^ 439869931);
                           case 4 -> a(1791047451, var34 ^ 1788275395);
                           case 5 -> a(1791047448, var34 ^ -2101359533);
                           default -> a(1791047449, var34 ^ -208098258);
                        });
                        var16++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var68 = var57;
                        } else {
                           if (var10001 <= var16) {
                              break;
                           }

                           var68 = var57;
                           var10004 = var16;
                        }
                     }
                  }

                  String var75 = new String(var57).intern();
                  switch (var10001) {
                     case 0:
                        var15[var13++] = var75;
                        if ((var37 += var11) >= var14) {
                           bab = var15;
                           baa = new String[a(1791047441, var34 ^ -287891684)];
                           long var2 = 1841188160811818483L;
                           long[] var8 = new long[5];
                           int var5 = 0;
                           String var6;
                           int var7 = (var6 = b(-1582290896, (short)-6350, (short)-28565, 91, (byte)105, (byte)-69)).length();
                           byte var4 = 0;

                           label92:
                           while (true) {
                              int var51 = var4;
                              var4 += 8;
                              byte[] var9 = var6.substring(var51, var4).getBytes(b(-1582290895, (short)-19678, 20825, 22, (byte)-74, (byte)-70));
                              long[] var42 = var8;
                              var51 = var5++;
                              long var63 = (var9[0] & 255L) << a(1791047462, var34 ^ 206769432)
                                 | (var9[1] & 255L) << a(1791047463, var34 ^ 383249861)
                                 | (var9[2] & 255L) << a(1791047460, var34 ^ -578336397)
                                 | (var9[3] & 255L) << a(1791047461, var34 ^ -954864992)
                                 | (var9[4] & 255L) << a(1791047458, var34 ^ -1302158475)
                                 | (var9[5] & 255L) << a(1791047459, var34 ^ 534110954)
                                 | (var9[a(1791047456, var34 ^ -402775290)] & 255L) << a(1791047457, var34 ^ -1702227519)
                                 | var9[a(1791047470, var34 ^ -355190209)] & 255L;
                              byte var76 = -1;

                              while (true) {
                                 long var79 = var63 ^ var2;
                                 switch (var76) {
                                    case 0:
                                       var42[var51] = var79;
                                       if (var4 >= var7) {
                                          bbb = var8;
                                          aaa = new Integer[5];
                                          long var0 = 7505784002045612551L;
                                          long var65 = 7505784002045612567L ^ var0;
                                          byte var54 = -1;
                                          aba = var65;
                                          aaaa = aabbaaaba.aaab(
                                             aa(a(1791047476, var34 ^ 567855941), a(1791047477, var34 ^ 1319312978))
                                          );
                                          ba = aabbaaaba.aaab(
                                             aa(a(1791047474, var34 ^ -313151687), a(1791047475, var34 ^ 697457936))
                                          );
                                          bb = aabbaaaba.aaab(
                                             aa(a(1791047472, var34 ^ 1384142406), a(1791047473, var34 ^ 45918502))
                                          );
                                          aaba = aabbaaaba.aaab(
                                             aa(a(1791047486, var34 ^ -1111200209), a(1791047487, var34 ^ 228932780))
                                          );
                                          return;
                                       }
                                       break;
                                    default:
                                       var42[var51] = var79;
                                       if (var4 < var7) {
                                          continue label92;
                                       }

                                       var7 = (var6 = b(-1582290890, (short)-25031, (short)-5605, (byte)-65, (byte)16, (byte)-8)).length();
                                       var4 = 0;
                                 }

                                 byte var53 = var4;
                                 var4 += 8;
                                 var9 = var6.substring(var53, var4).getBytes(b(-1582290889, (short)19428, (short)-29533, (byte)-97, 14, 66));
                                 var42 = var8;
                                 var51 = var5++;
                                 var63 = (var9[0] & 255L) << a(1791047471, var34 ^ -1488483526)
                                    | (var9[1] & 255L) << a(1791047468, var34 ^ -368897081)
                                    | (var9[2] & 255L) << a(1791047469, var34 ^ -2136725268)
                                    | (var9[3] & 255L) << a(1791047466, var34 ^ -1353907502)
                                    | (var9[4] & 255L) << a(1791047467, var34 ^ 297173193)
                                    | (var9[5] & 255L) << a(1791047464, var34 ^ -1411989331)
                                    | (var9[a(1791047465, var34 ^ -569018673)] & 255L) << a(1791047478, var34 ^ -364925841)
                                    | var9[a(1791047479, var34 ^ -558222956)] & 255L;
                                 var76 = 0;
                              }
                           }
                        }

                        var11 = var12.charAt(var37);
                        break;
                     default:
                        var15[var13++] = var75;
                        if ((var37 += var11) < var14) {
                           var11 = var12.charAt(var37);
                           continue label118;
                        }

                        var14 = (var12 = b(-1582290893, 2096, (short)18871, 84, (byte)-83, 97)).length();
                        var11 = a(1791047440, var34 ^ 652899919);
                        var37 = -1;
                  }

                  var40 = var12.substring(++var37, var37 + var11);
                  var10001 = 0;
               }
            }
         }

         do {
            var29 = var25[var27] ^ var23;
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               short var33 = switch (var32 % 6) {
                  default -> 14;
                  case 1 -> 137;
                  case 2 -> 147;
                  case 3 -> 148;
                  case 4 -> 73;
                  case 5 -> 44;
               };
               var31[var32] = (char)(var31[var32] ^ var33);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1791047428, -1649753766 ^ 1915822086);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(bbb[var3] ^ var1);
      }

      return aaa[var3];
   }

   public void ba(class_310 param1, Runnable param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: aload 1
      // 004: invokevirtual net/minecraft/class_310.method_1522 ()Lnet/minecraft/class_276;
      // 007: astore 4
      // 009: istore 3
      // 00a: getstatic com/mojang/blaze3d/systems/RenderSystem.outputColorTextureOverride Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 00d: astore 5
      // 00f: getstatic com/mojang/blaze3d/systems/RenderSystem.outputDepthTextureOverride Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 012: astore 6
      // 014: aload 5
      // 016: iload 3
      // 017: ifne 023
      // 01a: ifnull 026
      // 01d: goto 021
      // 020: athrow
      // 021: aload 5
      // 023: goto 02b
      // 026: aload 4
      // 028: invokevirtual net/minecraft/class_276.method_71639 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 02b: astore 7
      // 02d: iload 3
      // 02e: ifne 064
      // 031: aload 7
      // 033: ifnull 05a
      // 036: goto 03a
      // 039: athrow
      // 03a: aload 4
      // 03c: iload 3
      // 03d: ifne 054
      // 040: goto 044
      // 043: athrow
      // 044: getfield net/minecraft/class_276.field_1482 I
      // 047: ifle 05a
      // 04a: goto 04e
      // 04d: athrow
      // 04e: aload 4
      // 050: goto 054
      // 053: athrow
      // 054: getfield net/minecraft/class_276.field_1481 I
      // 057: ifgt 065
      // 05a: aload 2
      // 05b: invokeinterface java/lang/Runnable.run ()V 1
      // 060: goto 064
      // 063: athrow
      // 064: return
      // 065: aload 0
      // 066: aload 4
      // 068: getfield net/minecraft/class_276.field_1482 I
      // 06b: aload 4
      // 06d: getfield net/minecraft/class_276.field_1481 I
      // 070: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aab (II)V
      // 073: aload 1
      // 074: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 077: invokevirtual net/minecraft/class_757.method_72911 ()Lnet/minecraft/class_11684;
      // 07a: invokevirtual net/minecraft/class_11684.method_73002 ()V
      // 07d: aload 1
      // 07e: invokevirtual net/minecraft/class_310.method_22940 ()Lnet/minecraft/class_4599;
      // 081: invokevirtual net/minecraft/class_4599.method_23000 ()Lnet/minecraft/class_4597$class_4598;
      // 084: invokevirtual net/minecraft/class_4597$class_4598.method_22993 ()V
      // 087: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 08a: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
      // 08f: aload 0
      // 090: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 093: invokevirtual net/minecraft/class_6367.method_30277 ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 096: bipush 0
      // 097: aload 0
      // 098: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 09b: invokevirtual net/minecraft/class_6367.method_30278 ()Lcom/mojang/blaze3d/textures/GpuTexture;
      // 09e: dconst_1
      // 09f: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.clearColorAndDepthTextures (Lcom/mojang/blaze3d/textures/GpuTexture;ILcom/mojang/blaze3d/textures/GpuTexture;D)V 6
      // 0a4: goto 0b0
      // 0a7: astore 8
      // 0a9: aload 2
      // 0aa: invokeinterface java/lang/Runnable.run ()V 1
      // 0af: return
      // 0b0: aload 0
      // 0b1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 0b4: invokevirtual net/minecraft/class_6367.method_71639 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0b7: putstatic com/mojang/blaze3d/systems/RenderSystem.outputColorTextureOverride Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0ba: aload 0
      // 0bb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 0be: invokevirtual net/minecraft/class_6367.method_71640 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0c1: putstatic com/mojang/blaze3d/systems/RenderSystem.outputDepthTextureOverride Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0c4: aload 2
      // 0c5: invokeinterface java/lang/Runnable.run ()V 1
      // 0ca: aload 5
      // 0cc: putstatic com/mojang/blaze3d/systems/RenderSystem.outputColorTextureOverride Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0cf: aload 6
      // 0d1: putstatic com/mojang/blaze3d/systems/RenderSystem.outputDepthTextureOverride Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0d4: goto 0e6
      // 0d7: astore 9
      // 0d9: aload 5
      // 0db: putstatic com/mojang/blaze3d/systems/RenderSystem.outputColorTextureOverride Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0de: aload 6
      // 0e0: putstatic com/mojang/blaze3d/systems/RenderSystem.outputDepthTextureOverride Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 0e3: aload 9
      // 0e5: athrow
      // 0e6: aload 6
      // 0e8: ifnonnull 10c
      // 0eb: aload 4
      // 0ed: iload 3
      // 0ee: ifne 105
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: getfield net/minecraft/class_276.field_1478 Z
      // 0f8: ifeq 10c
      // 0fb: goto 0ff
      // 0fe: athrow
      // 0ff: aload 4
      // 101: goto 105
      // 104: athrow
      // 105: aload 0
      // 106: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 109: invokevirtual net/minecraft/class_276.method_29329 (Lnet/minecraft/class_276;)V
      // 10c: aload 0
      // 10d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba ()V
      // 110: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 113: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
      // 118: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 11b: dup
      // 11c: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 11f: pop
      // 120: invokedynamic get (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 125: aload 7
      // 127: invokestatic java/util/OptionalInt.empty ()Ljava/util/OptionalInt;
      // 12a: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.createRenderPass (Ljava/util/function/Supplier;Lcom/mojang/blaze3d/textures/GpuTextureView;Ljava/util/OptionalInt;)Lcom/mojang/blaze3d/systems/RenderPass; 4
      // 12f: astore 8
      // 131: aload 8
      // 133: aload 0
      // 134: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 137: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 13a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabab
      // 13d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabab.bb Lcom/mojang/blaze3d/pipeline/RenderPipeline;
      // 140: invokeinterface com/mojang/blaze3d/systems/RenderPass.setPipeline (Lcom/mojang/blaze3d/pipeline/RenderPipeline;)V 2
      // 145: iload 3
      // 146: aload 8
      // 148: invokestatic com/mojang/blaze3d/systems/RenderSystem.bindDefaultUniforms (Lcom/mojang/blaze3d/systems/RenderPass;)V
      // 14b: aload 8
      // 14d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 150: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 153: aload 0
      // 154: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 157: invokeinterface com/mojang/blaze3d/systems/RenderPass.setUniform (Ljava/lang/String;Lcom/mojang/blaze3d/buffers/GpuBuffer;)V 3
      // 15c: aload 8
      // 15e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 161: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 164: aload 0
      // 165: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 168: invokevirtual net/minecraft/class_6367.method_71639 ()Lcom/mojang/blaze3d/textures/GpuTextureView;
      // 16b: invokestatic com/mojang/blaze3d/systems/RenderSystem.getSamplerCache ()Lnet/minecraft/class_12136;
      // 16e: getstatic com/mojang/blaze3d/textures/FilterMode.LINEAR Lcom/mojang/blaze3d/textures/FilterMode;
      // 171: invokevirtual net/minecraft/class_12136.method_75294 (Lcom/mojang/blaze3d/textures/FilterMode;)Lnet/minecraft/class_12137;
      // 174: invokeinterface com/mojang/blaze3d/systems/RenderPass.bindTexture (Ljava/lang/String;Lcom/mojang/blaze3d/textures/GpuTextureView;Lnet/minecraft/class_12137;)V 4
      // 179: aload 8
      // 17b: bipush 0
      // 17c: bipush 3
      // 17d: invokeinterface com/mojang/blaze3d/systems/RenderPass.draw (II)V 3
      // 182: ifne 195
      // 185: aload 8
      // 187: ifnull 1bd
      // 18a: aload 8
      // 18c: invokeinterface com/mojang/blaze3d/systems/RenderPass.close ()V 1
      // 191: goto 195
      // 194: athrow
      // 195: goto 1bd
      // 198: astore 9
      // 19a: iload 3
      // 19b: ifne 1ae
      // 19e: aload 8
      // 1a0: ifnull 1ba
      // 1a3: goto 1a7
      // 1a6: athrow
      // 1a7: aload 8
      // 1a9: invokeinterface com/mojang/blaze3d/systems/RenderPass.close ()V 1
      // 1ae: goto 1ba
      // 1b1: astore 10
      // 1b3: aload 9
      // 1b5: aload 10
      // 1b7: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 1ba: aload 9
      // 1bc: athrow
      // 1bd: goto 1cb
      // 1c0: astore 8
      // 1c2: aload 0
      // 1c3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 1c6: aload 7
      // 1c8: invokevirtual net/minecraft/class_6367.method_68445 (Lcom/mojang/blaze3d/textures/GpuTextureView;)V
      // 1cb: return
   }

   public abaa() {
      int var1 = 593537074;
      super(
         aabbaaaba.aaab(aa(a(1791047429, var1 ^ 407929417), a(1791047426, var1 ^ 1614353256))),
         bbaabbba.bab,
         aabbaaaba.aaab(aa(a(1791047427, var1 ^ 2131966909), a(1791047424, var1 ^ -493285517)))
      );
      this.aab = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aa(a(1791047425, var1 ^ -263557593), a(1791047438, var1 ^ 2060205754))),
            abaaabab.class,
            abaaabab.b
         )
      );
      this.ab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aa(a(1791047439, var1 ^ 1592636772), a(1791047436, var1 ^ 2075853223))), true
         )
      );
      this.abb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aa(a(1791047437, var1 ^ 563775555), a(1791047434, var1 ^ 1947381077))), false
         )
      );
      this.aaab = (abaabaaab)this.abbbaaa(
         new abaabaaab(
            aabbaaaba.aaab(aa(a(1791047435, var1 ^ 41081747), a(1791047432, var1 ^ -914255002))),
            new Color(
               ab(a(1791047433, var1 ^ 1091373067), 3165812572444425893L),
               ab(a(1791047446, var1 ^ -988817051), 5506756622996992588L),
               ab(a(1791047447, var1 ^ 450017753), 3116212601628750699L)
            )
         )
      );
      this.aabb = ByteBuffer.allocateDirect(ab(a(1791047444, var1 ^ -1115662236), 3343028019027149583L)).order(ByteOrder.nativeOrder());
      this.abb.babb(this::aaa);
      this.aaab.babb(this::aba);
   }

   private static Color bb(boolean param0, boolean param1, Color param2, Color param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: iload 0
      // 06: iload 4
      // 08: ifne 2c
      // 0b: ifeq 2b
      // 0e: goto 12
      // 11: athrow
      // 12: aload 3
      // 13: iload 4
      // 15: ifne 26
      // 18: goto 1c
      // 1b: athrow
      // 1c: ifnonnull 29
      // 1f: goto 23
      // 22: athrow
      // 23: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 26: goto 2a
      // 29: aload 3
      // 2a: areturn
      // 2b: iload 1
      // 2c: ifeq 4b
      // 2f: aload 2
      // 30: iload 4
      // 32: ifne 48
      // 35: goto 39
      // 38: athrow
      // 39: ifnonnull 47
      // 3c: goto 40
      // 3f: athrow
      // 40: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 43: goto 4c
      // 46: athrow
      // 47: aload 2
      // 48: goto 4c
      // 4b: aconst_null
      // 4c: areturn
   }

   @Override
   public String ababa() {
      return ((abaaabab)this.aab.abbb()).toString();
   }

   private boolean aaa() {
      int var1 = aabbabbab.ab;

      try {
         boolean var10000 = (Boolean)this.ab.abbb();
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (RuntimeException var2) {
         throw var2;
      }

      return false;
   }

   private void aab(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 34
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 0c: ifnonnull 2f
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: new net/minecraft/class_6367
      // 17: dup
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 1e: iload 1
      // 1f: iload 2
      // 20: bipush 1
      // 21: invokespecial net/minecraft/class_6367.<init> (Ljava/lang/String;IIZ)V
      // 24: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 27: iload 3
      // 28: ifeq 6a
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 0
      // 30: goto 34
      // 33: athrow
      // 34: iload 3
      // 35: ifne 62
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 3b: getfield net/minecraft/class_6367.field_1482 I
      // 3e: iload 1
      // 3f: if_icmpne 5d
      // 42: goto 46
      // 45: athrow
      // 46: aload 0
      // 47: iload 3
      // 48: ifne 62
      // 4b: goto 4f
      // 4e: athrow
      // 4f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 52: getfield net/minecraft/class_6367.field_1481 I
      // 55: iload 2
      // 56: if_icmpeq 6a
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 0
      // 5e: goto 62
      // 61: athrow
      // 62: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 65: iload 1
      // 66: iload 2
      // 67: invokevirtual net/minecraft/class_6367.method_1234 (II)V
      // 6a: return
   }

   private boolean aba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 27
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifne 3c
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 23: goto 27
      // 26: athrow
      // 27: checkcast java/lang/Boolean
      // 2a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2d: iload 1
      // 2e: ifne 39
      // 31: ifeq 3c
      // 34: goto 38
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
   }

   private static String b(int var0, short var1, short var2, byte var3, byte var4, byte var5) {
      int var10 = var0 ^ -1582290894;
      char[] var9 = abab[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])abba[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         abba[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 44152;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ var8 ^ var4 ^ var0 ^ var2 ^ var5 ^ var7 ^ var3 ^ var1);
      }

      return new String(var9).intern();
   }

   @Override
   public void aabaa() {
      int var1 = aabbabbab.ab;

      try {
         if (RenderSystem.isOnRenderThread()) {
            this.abb();
            if (var1 == 0) {
               return;
            }
         }
      } catch (RuntimeException var4) {
         throw var4;
      }

      class_310 var2 = class_310.method_1551();

      class_310 var10000;
      label26: {
         try {
            var10000 = var2;
            if (var1 != 0) {
               break label26;
            }

            if (var2 == null) {
               return;
            }
         } catch (RuntimeException var3) {
            throw var3;
         }

         var10000 = var2;
      }

      var10000.execute(this::abb);
   }

   private void abb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 2c
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 0c: ifnull 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 17: invokevirtual net/minecraft/class_6367.method_1238 ()V
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 0
      // 1f: aconst_null
      // 20: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 23: iload 1
      // 24: ifne 3e
      // 27: aload 0
      // 28: goto 2c
      // 2b: athrow
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 2f: ifnull 7c
      // 32: aload 0
      // 33: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 36: invokevirtual com/mojang/blaze3d/buffers/GpuBuffer.close ()V
      // 39: aload 0
      // 3a: aconst_null
      // 3b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 3e: goto 49
      // 41: astore 2
      // 42: aload 0
      // 43: aconst_null
      // 44: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 47: aload 2
      // 48: athrow
      // 49: goto 7c
      // 4c: astore 3
      // 4d: iload 1
      // 4e: ifne 6d
      // 51: aload 0
      // 52: aconst_null
      // 53: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aa Lnet/minecraft/class_6367;
      // 56: aload 0
      // 57: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 5a: ifnull 7a
      // 5d: goto 61
      // 60: athrow
      // 61: aload 0
      // 62: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 65: invokevirtual com/mojang/blaze3d/buffers/GpuBuffer.close ()V
      // 68: aload 0
      // 69: aconst_null
      // 6a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 6d: goto 7a
      // 70: astore 4
      // 72: aload 0
      // 73: aconst_null
      // 74: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 77: aload 4
      // 79: athrow
      // 7a: aload 3
      // 7b: athrow
      // 7c: return
   }

   private static int a(int var0, int var1) {
      int var2 = abaa[var0 ^ 1791047174] ^ var1 ^ var0;
      var2 ^= 64643;
      var2 += 1551;
      var2 -= 33347;
      var2 += 40391;
      var2 -= 58022;
      return var2 - 15439;
   }

   public boolean bab(class_310 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 0
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.babbaab ()Z
      // 08: iload 3
      // 09: ifne 14
      // 0c: ifeq b8
      // 0f: goto 13
      // 12: athrow
      // 13: iload 2
      // 14: ifne b8
      // 17: aload 1
      // 18: iload 3
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnull b8
      // 23: goto 27
      // 26: athrow
      // 27: aload 1
      // 28: iload 3
      // 29: ifne 3b
      // 2c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2f: ifnull b8
      // 32: goto 36
      // 35: athrow
      // 36: aload 1
      // 37: goto 3b
      // 3a: athrow
      // 3b: iload 3
      // 3c: ifne 4e
      // 3f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 42: ifnull b8
      // 45: goto 49
      // 48: athrow
      // 49: aload 1
      // 4a: goto 4e
      // 4d: athrow
      // 4e: iload 3
      // 4f: ifne 61
      // 52: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 55: ifnull b8
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 1
      // 5d: goto 61
      // 60: athrow
      // 61: iload 3
      // 62: ifne 77
      // 65: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 68: getfield net/minecraft/class_315.field_1842 Z
      // 6b: ifne b8
      // 6e: goto 72
      // 71: athrow
      // 72: aload 1
      // 73: goto 77
      // 76: athrow
      // 77: iload 3
      // 78: ifne 91
      // 7b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7e: invokevirtual net/minecraft/class_746.method_7325 ()Z
      // 81: ifne b8
      // 84: goto 88
      // 87: athrow
      // 88: aload 1
      // 89: iload 3
      // 8a: ifne a0
      // 8d: goto 91
      // 90: athrow
      // 91: invokevirtual net/minecraft/class_310.method_1560 ()Lnet/minecraft/class_1297;
      // 94: aload 1
      // 95: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 98: if_acmpne b8
      // 9b: aload 1
      // 9c: goto a0
      // 9f: athrow
      // a0: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // a3: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
      // a6: invokevirtual net/minecraft/class_5498.method_31034 ()Z
      // a9: iload 3
      // aa: ifne b5
      // ad: ifeq b8
      // b0: goto b4
      // b3: athrow
      // b4: bipush 1
      // b5: goto b9
      // b8: bipush 0
      // b9: ireturn
   }

   private void bba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: aconst_null
      // 004: astore 2
      // 005: istore 1
      // 006: aload 0
      // 007: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 00d: checkcast java/lang/Boolean
      // 010: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 013: ifeq 05a
      // 016: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 019: astore 3
      // 01a: aload 3
      // 01b: iload 1
      // 01c: ifne 027
      // 01f: ifnull 05a
      // 022: goto 026
      // 025: athrow
      // 026: aload 3
      // 027: iload 1
      // 028: ifne 03a
      // 02b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 02e: ifnull 05a
      // 031: goto 035
      // 034: athrow
      // 035: aload 3
      // 036: goto 03a
      // 039: athrow
      // 03a: iload 1
      // 03b: ifne 050
      // 03e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 041: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab;
      // 044: ifnull 05a
      // 047: goto 04b
      // 04a: athrow
      // 04b: aload 3
      // 04c: goto 050
      // 04f: athrow
      // 050: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 053: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab;
      // 056: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab.aabab ()Ljava/awt/Color;
      // 059: astore 2
      // 05a: aload 0
      // 05b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 05e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 061: checkcast java/lang/Boolean
      // 064: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 067: aload 0
      // 068: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 06b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 06e: checkcast java/lang/Boolean
      // 071: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 074: aload 0
      // 075: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab;
      // 078: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.abbb ()Ljava/lang/Object;
      // 07b: checkcast java/awt/Color
      // 07e: aload 2
      // 07f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bb (ZZLjava/awt/Color;Ljava/awt/Color;)Ljava/awt/Color;
      // 082: astore 3
      // 083: aload 0
      // 084: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aabb Ljava/nio/ByteBuffer;
      // 087: invokevirtual java/nio/ByteBuffer.clear ()Ljava/nio/ByteBuffer;
      // 08a: pop
      // 08b: aload 0
      // 08c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aabb Ljava/nio/ByteBuffer;
      // 08f: aload 3
      // 090: iload 1
      // 091: ifne 0a1
      // 094: ifnonnull 0a0
      // 097: goto 09b
      // 09a: athrow
      // 09b: fconst_1
      // 09c: goto 0a9
      // 09f: athrow
      // 0a0: aload 3
      // 0a1: invokevirtual java/awt/Color.getRed ()I
      // 0a4: i2f
      // 0a5: ldc_w 255.0
      // 0a8: fdiv
      // 0a9: invokevirtual java/nio/ByteBuffer.putFloat (F)Ljava/nio/ByteBuffer;
      // 0ac: pop
      // 0ad: aload 0
      // 0ae: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aabb Ljava/nio/ByteBuffer;
      // 0b1: aload 3
      // 0b2: iload 1
      // 0b3: ifne 0c3
      // 0b6: ifnonnull 0c2
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: fconst_1
      // 0be: goto 0cb
      // 0c1: athrow
      // 0c2: aload 3
      // 0c3: invokevirtual java/awt/Color.getGreen ()I
      // 0c6: i2f
      // 0c7: ldc_w 255.0
      // 0ca: fdiv
      // 0cb: invokevirtual java/nio/ByteBuffer.putFloat (F)Ljava/nio/ByteBuffer;
      // 0ce: pop
      // 0cf: aload 0
      // 0d0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aabb Ljava/nio/ByteBuffer;
      // 0d3: aload 3
      // 0d4: iload 1
      // 0d5: ifne 0e5
      // 0d8: ifnonnull 0e4
      // 0db: goto 0df
      // 0de: athrow
      // 0df: fconst_1
      // 0e0: goto 0ed
      // 0e3: athrow
      // 0e4: aload 3
      // 0e5: invokevirtual java/awt/Color.getBlue ()I
      // 0e8: i2f
      // 0e9: ldc_w 255.0
      // 0ec: fdiv
      // 0ed: invokevirtual java/nio/ByteBuffer.putFloat (F)Ljava/nio/ByteBuffer;
      // 0f0: pop
      // 0f1: aload 0
      // 0f2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aabb Ljava/nio/ByteBuffer;
      // 0f5: aload 3
      // 0f6: ifnonnull 0fe
      // 0f9: fconst_0
      // 0fa: goto 0ff
      // 0fd: athrow
      // 0fe: fconst_1
      // 0ff: invokevirtual java/nio/ByteBuffer.putFloat (F)Ljava/nio/ByteBuffer;
      // 102: pop
      // 103: iload 1
      // 104: ifne 165
      // 107: aload 0
      // 108: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aabb Ljava/nio/ByteBuffer;
      // 10b: invokevirtual java/nio/ByteBuffer.flip ()Ljava/nio/ByteBuffer;
      // 10e: pop
      // 10f: aload 0
      // 110: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 113: ifnonnull 14d
      // 116: goto 11a
      // 119: athrow
      // 11a: aload 0
      // 11b: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 11e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 121: dup
      // 122: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 125: pop
      // 126: invokedynamic get (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;, ()Ljava/lang/String; ]
      // 12b: ldc_w 1791047445
      // 12e: ldc_w 1832400449
      // 131: ldc_w -937243175
      // 134: ixor
      // 135: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.a (II)I
      // 138: ldc2_w 6432147733396253525
      // 13b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.ab (IJ)I
      // 13e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aba J
      // 141: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createBuffer (Ljava/util/function/Supplier;IJ)Lcom/mojang/blaze3d/buffers/GpuBuffer; 5
      // 146: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 149: goto 14d
      // 14c: athrow
      // 14d: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
      // 150: invokeinterface com/mojang/blaze3d/systems/GpuDevice.createCommandEncoder ()Lcom/mojang/blaze3d/systems/CommandEncoder; 1
      // 155: aload 0
      // 156: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.bba Lcom/mojang/blaze3d/buffers/GpuBuffer;
      // 159: invokevirtual com/mojang/blaze3d/buffers/GpuBuffer.slice ()Lcom/mojang/blaze3d/buffers/GpuBufferSlice;
      // 15c: aload 0
      // 15d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaa.aabb Ljava/nio/ByteBuffer;
      // 160: invokeinterface com/mojang/blaze3d/systems/CommandEncoder.writeToBuffer (Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Ljava/nio/ByteBuffer;)V 3
      // 165: return
   }
}
