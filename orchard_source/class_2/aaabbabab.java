package nsc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class aaabbabab implements InvocationHandler {
   private static final Object[] abb;
   private static final String[] aa;
   private static String[] ab;
   private static final int[] b;
   private static final Long[] a;
   private static final String[] aba;
   private static final Integer[] ba;
   private static final long[] bb;
   private static final long[] aaa;
   private static final String[] aab;

   private static String aaa(int var0, int var1, int var2) {
      int var3 = var2 ^ 37816;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         abb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 3956;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\uf168';
         var10 += 1136;
         var10 -= 63756;
         var10 += 12281;
         var10 += 3704;
         var10 ^= 44072;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static String aa(int var0, int var1) {
      int var9 = -1443562342;
      int var2 = (var0 ^ a(94189149, var9 ^ 1530759985)) & a(94189148, var9 ^ 1440753272);
      if (aa[var2] == null) {
         char[] var3 = aab[var2].toCharArray();

         int var4 = switch (var3[0] & a(94189151, var9 ^ 274035367)) {
            case 0 -> a(94189150, var9 ^ 735140904);
            case 1 -> a(94189145, var9 ^ -1824656295);
            case 2 -> a(94189144, var9 ^ -1897512599);
            case 3 -> a(94189147, var9 ^ 311192872);
            case 4 -> a(94189146, var9 ^ -1336550409);
            case 5 -> a(94189141, var9 ^ -644025997);
            case 6 -> a(94189140, var9 ^ 1120377008);
            case 7 -> a(94189143, var9 ^ -506938467);
            case 8 -> a(94189142, var9 ^ -1749459698);
            case 9 -> a(94189137, var9 ^ -848157900);
            case 10 -> a(94189136, var9 ^ -822395037);
            case 11 -> a(94189139, var9 ^ 272708691);
            case 12 -> a(94189138, var9 ^ -449307831);
            case 13 -> a(94189133, var9 ^ -969674439);
            case 14 -> a(94189132, var9 ^ -1385046080);
            case 15 -> a(94189135, var9 ^ -1147290166);
            case 16 -> a(94189134, var9 ^ -1863111805);
            case 17 -> a(94189129, var9 ^ -1269656669);
            case 18 -> a(94189128, var9 ^ 621429858);
            case 19 -> a(94189131, var9 ^ -1042194361);
            case 20 -> a(94189130, var9 ^ 2027737985);
            case 21 -> a(94189125, var9 ^ -373301177);
            case 22 -> a(94189124, var9 ^ 1314951179);
            case 23 -> a(94189127, var9 ^ 1105132735);
            case 24 -> a(94189126, var9 ^ -1630957708);
            case 25 -> a(94189121, var9 ^ 2025241869);
            case 26 -> 2;
            case 27 -> a(94189120, var9 ^ -1097644282);
            case 28 -> a(94189123, var9 ^ 1358656357);
            case 29 -> a(94189122, var9 ^ -1406238727);
            case 30 -> a(94189181, var9 ^ 1326215961);
            case 31 -> a(94189180, var9 ^ 888423910);
            case 32 -> a(94189183, var9 ^ 2109178028);
            case 33 -> a(94189182, var9 ^ 438343532);
            case 34 -> a(94189177, var9 ^ -1694011128);
            case 35 -> a(94189176, var9 ^ -759462202);
            case 36 -> a(94189179, var9 ^ 232262585);
            case 37 -> a(94189178, var9 ^ 1952331094);
            case 38 -> a(94189173, var9 ^ -20464051);
            case 39 -> a(94189172, var9 ^ -127786315);
            case 40 -> a(94189175, var9 ^ 1454823407);
            case 41 -> a(94189174, var9 ^ -892052767);
            case 42 -> a(94189169, var9 ^ 1875486710);
            case 43 -> a(94189168, var9 ^ 844795406);
            case 44 -> a(94189171, var9 ^ 1070880765);
            case 45 -> a(94189170, var9 ^ -1691040975);
            case 46 -> a(94189165, var9 ^ 1634939508);
            case 47 -> a(94189164, var9 ^ 504014073);
            case 48 -> a(94189167, var9 ^ 1861374572);
            case 49 -> a(94189166, var9 ^ -191224868);
            case 50 -> a(94189161, var9 ^ -1248324145);
            case 51 -> a(94189160, var9 ^ -1581729629);
            case 52 -> a(94189163, var9 ^ -761540143);
            case 53 -> a(94189162, var9 ^ 1285096807);
            case 54 -> a(94189157, var9 ^ 530318353);
            case 55 -> a(94189156, var9 ^ 423601943);
            case 56 -> a(94189159, var9 ^ 1391696580);
            case 57 -> a(94189158, var9 ^ -381622975);
            case 58 -> a(94189153, var9 ^ -1268348465);
            case 59 -> a(94189152, var9 ^ -107539209);
            case 60 -> a(94189155, var9 ^ 1082411228);
            case 61 -> a(94189154, var9 ^ -1394459823);
            case 62 -> a(94189085, var9 ^ -1656183331);
            case 63 -> a(94189084, var9 ^ 1065639845);
            case 64 -> a(94189087, var9 ^ -824548008);
            case 65 -> a(94189086, var9 ^ 1581901711);
            case 66 -> a(94189081, var9 ^ 711797022);
            case 67 -> a(94189080, var9 ^ -1656468828);
            case 68 -> a(94189083, var9 ^ 73597838);
            case 69 -> a(94189082, var9 ^ 808540704);
            case 70 -> a(94189077, var9 ^ 1039438124);
            case 71 -> a(94189076, var9 ^ 951540323);
            case 72 -> a(94189079, var9 ^ 793410037);
            case 73 -> a(94189078, var9 ^ 1471337016);
            case 74 -> a(94189073, var9 ^ -1497249784);
            case 75 -> a(94189072, var9 ^ 1084575761);
            case 76 -> a(94189075, var9 ^ 245159220);
            case 77 -> a(94189074, var9 ^ -976715105);
            case 78 -> a(94189069, var9 ^ 1661979378);
            case 79 -> a(94189068, var9 ^ -2055272831);
            case 80 -> a(94189071, var9 ^ -451822678);
            case 81 -> a(94189070, var9 ^ -1816130410);
            case 82 -> a(94189065, var9 ^ 560612088);
            case 83 -> a(94189064, var9 ^ -1688676680);
            case 84 -> a(94189067, var9 ^ -1777769559);
            case 85 -> a(94189066, var9 ^ -1376976040);
            case 86 -> a(94189061, var9 ^ 1946997708);
            case 87 -> a(94189060, var9 ^ -919383383);
            case 88 -> a(94189063, var9 ^ -778831017);
            case 89 -> a(94189062, var9 ^ -561942969);
            case 90 -> a(94189057, var9 ^ 1822775301);
            case 91 -> a(94189056, var9 ^ 453629193);
            case 92 -> a(94189059, var9 ^ 1037751271);
            case 93 -> a(94189058, var9 ^ -1209917711);
            case 94 -> a(94189117, var9 ^ 356531232);
            case 95 -> a(94189116, var9 ^ -495941590);
            case 96 -> a(94189119, var9 ^ -1012432776);
            case 97 -> a(94189118, var9 ^ 1770274536);
            case 98 -> a(94189113, var9 ^ -495738865);
            case 99 -> a(94189112, var9 ^ -1786222463);
            case 100 -> a(94189115, var9 ^ 1717572116);
            case 101 -> a(94189114, var9 ^ 555673169);
            case 102 -> a(94189109, var9 ^ -72438662);
            case 103 -> a(94189108, var9 ^ -833841805);
            case 104 -> a(94189111, var9 ^ 422925244);
            case 105 -> 3;
            case 106 -> a(94189110, var9 ^ 796434968);
            case 107 -> a(94189105, var9 ^ -350409724);
            case 108 -> a(94189104, var9 ^ 1079252751);
            case 109 -> a(94189107, var9 ^ -1803275435);
            case 110 -> a(94189106, var9 ^ 680853475);
            case 111 -> a(94189101, var9 ^ 1243278199);
            case 112 -> a(94189100, var9 ^ 1942901657);
            case 113 -> a(94189103, var9 ^ -290657664);
            case 114 -> a(94189102, var9 ^ 2100779892);
            case 115 -> a(94189097, var9 ^ 698869008);
            case 116 -> a(94189096, var9 ^ -1682390042);
            case 117 -> a(94189099, var9 ^ 618774256);
            case 118 -> a(94189098, var9 ^ 590052794);
            case 119 -> a(94189093, var9 ^ -1629987041);
            case 120 -> a(94189092, var9 ^ -1915424741);
            case 121 -> a(94189095, var9 ^ -175954539);
            case 122 -> a(94189094, var9 ^ -1810494629);
            case 123 -> a(94189089, var9 ^ 845745263);
            case 124 -> a(94189088, var9 ^ -1820573400);
            case 125 -> a(94189091, var9 ^ 1186609573);
            case 126 -> a(94189090, var9 ^ 1421382558);
            case 127 -> a(94189277, var9 ^ 1335921413);
            case 128 -> a(94189276, var9 ^ 1470194741);
            case 129 -> a(94189279, var9 ^ 753361321);
            case 130 -> a(94189278, var9 ^ -866322268);
            case 131 -> a(94189273, var9 ^ 1032532242);
            case 132 -> a(94189272, var9 ^ 2017724261);
            case 133 -> a(94189275, var9 ^ 43108245);
            case 134 -> a(94189274, var9 ^ 534712698);
            case 135 -> a(94189269, var9 ^ 848593429);
            case 136 -> a(94189268, var9 ^ 954805205);
            case 137 -> a(94189271, var9 ^ -1182506803);
            case 138 -> a(94189270, var9 ^ -327752784);
            case 139 -> a(94189265, var9 ^ 397167729);
            case 140 -> a(94189264, var9 ^ 1325520922);
            case 141 -> a(94189267, var9 ^ -1279208328);
            case 142 -> a(94189266, var9 ^ -708393186);
            case 143 -> a(94189261, var9 ^ -987923618);
            case 144 -> a(94189260, var9 ^ -1520331155);
            case 145 -> a(94189263, var9 ^ 1975203934);
            case 146 -> a(94189262, var9 ^ -520348319);
            case 147 -> a(94189257, var9 ^ 210663156);
            case 148 -> a(94189256, var9 ^ -1951338187);
            case 149 -> a(94189259, var9 ^ 450272213);
            case 150 -> a(94189258, var9 ^ -906146253);
            case 151 -> a(94189253, var9 ^ -387622799);
            case 152 -> a(94189252, var9 ^ -359230654);
            case 153 -> a(94189255, var9 ^ 326148780);
            case 154 -> a(94189254, var9 ^ -1156135571);
            case 155 -> a(94189249, var9 ^ 1686188879);
            case 156 -> a(94189248, var9 ^ 2077039205);
            case 157 -> a(94189251, var9 ^ 388918980);
            case 158 -> a(94189250, var9 ^ -1961580775);
            case 159 -> a(94189309, var9 ^ 484167738);
            case 160 -> 5;
            case 161 -> a(94189308, var9 ^ 656445082);
            case 162 -> a(94189311, var9 ^ 197642891);
            case 163 -> a(94189310, var9 ^ -991088725);
            case 164 -> a(94189305, var9 ^ 763160862);
            case 165 -> a(94189304, var9 ^ 1638039616);
            case 166 -> a(94189307, var9 ^ 1837069430);
            case 167 -> a(94189306, var9 ^ 2094828922);
            case 168 -> a(94189301, var9 ^ 340272415);
            case 169 -> a(94189300, var9 ^ -2138455251);
            case 170 -> 4;
            case 171 -> a(94189303, var9 ^ 1279997281);
            case 172 -> a(94189302, var9 ^ -1248089349);
            case 173 -> a(94189297, var9 ^ -567355692);
            case 174 -> a(94189296, var9 ^ -1501920278);
            case 175 -> a(94189299, var9 ^ -123586382);
            case 176 -> a(94189298, var9 ^ 1804016303);
            case 177 -> a(94189293, var9 ^ 677849094);
            case 178 -> a(94189292, var9 ^ 440675667);
            case 179 -> a(94189295, var9 ^ -255464230);
            case 180 -> a(94189294, var9 ^ 582953722);
            case 181 -> a(94189289, var9 ^ -1061802668);
            case 182 -> a(94189288, var9 ^ -1091566610);
            case 183 -> a(94189291, var9 ^ -1684208075);
            case 184 -> a(94189290, var9 ^ 1647254230);
            case 185 -> a(94189285, var9 ^ -1243703624);
            case 186 -> a(94189284, var9 ^ 961114780);
            case 187 -> a(94189287, var9 ^ -1519103632);
            case 188 -> a(94189286, var9 ^ 1953055689);
            case 189 -> a(94189281, var9 ^ 1378936873);
            case 190 -> a(94189280, var9 ^ 290484567);
            case 191 -> a(94189283, var9 ^ 1121452315);
            case 192 -> a(94189282, var9 ^ 792781763);
            case 193 -> a(94189213, var9 ^ -200804525);
            case 194 -> a(94189212, var9 ^ 1902691918);
            case 195 -> 1;
            case 196 -> a(94189215, var9 ^ -1704876176);
            case 197 -> a(94189214, var9 ^ -20190498);
            case 198 -> a(94189209, var9 ^ 1348620705);
            case 199 -> a(94189208, var9 ^ -1001187647);
            case 200 -> a(94189211, var9 ^ -1214982745);
            case 201 -> a(94189210, var9 ^ 1021465541);
            case 202 -> a(94189205, var9 ^ 2024812394);
            case 203 -> a(94189204, var9 ^ -1745454013);
            case 204 -> a(94189207, var9 ^ -1081342377);
            case 205 -> a(94189206, var9 ^ -2051169050);
            case 206 -> a(94189201, var9 ^ 404966906);
            case 207 -> a(94189200, var9 ^ -1399585467);
            case 208 -> a(94189203, var9 ^ 354144215);
            case 209 -> a(94189202, var9 ^ 700404319);
            case 210 -> a(94189197, var9 ^ -2083711401);
            case 211 -> a(94189196, var9 ^ 167193833);
            case 212 -> a(94189199, var9 ^ -1122392644);
            case 213 -> a(94189198, var9 ^ -1168556943);
            case 214 -> a(94189193, var9 ^ -797237532);
            case 215 -> a(94189192, var9 ^ 447427815);
            case 216 -> a(94189195, var9 ^ -327347998);
            case 217 -> a(94189194, var9 ^ -1078023822);
            case 218 -> a(94189189, var9 ^ -96171282);
            case 219 -> a(94189188, var9 ^ -1692277459);
            case 220 -> a(94189191, var9 ^ -1388005033);
            case 221 -> a(94189190, var9 ^ -1228958840);
            case 222 -> a(94189185, var9 ^ -794946602);
            case 223 -> a(94189184, var9 ^ 775720710);
            case 224 -> a(94189187, var9 ^ -75067399);
            case 225 -> a(94189186, var9 ^ -1894899464);
            case 226 -> a(94189245, var9 ^ 771391975);
            case 227 -> a(94189244, var9 ^ -1461043510);
            case 228 -> a(94189247, var9 ^ -1833081423);
            case 229 -> a(94189246, var9 ^ -587451009);
            case 230 -> a(94189241, var9 ^ 1361512655);
            case 231 -> a(94189240, var9 ^ 1163751579);
            case 232 -> a(94189243, var9 ^ -925762942);
            case 233 -> a(94189242, var9 ^ -1306043032);
            case 234 -> a(94189237, var9 ^ 1765230641);
            case 235 -> a(94189236, var9 ^ -928668453);
            case 236 -> a(94189239, var9 ^ 1381345601);
            case 237 -> a(94189238, var9 ^ -421766180);
            case 238 -> a(94189233, var9 ^ -1781381158);
            case 239 -> a(94189232, var9 ^ -2132318949);
            case 240 -> a(94189235, var9 ^ 1372743225);
            case 241 -> a(94189234, var9 ^ 2057028862);
            case 242 -> a(94189229, var9 ^ -1988080781);
            case 243 -> a(94189228, var9 ^ 1855977459);
            case 244 -> a(94189231, var9 ^ -1063818385);
            case 245 -> 0;
            case 246 -> a(94189230, var9 ^ 1369315460);
            case 247 -> a(94189225, var9 ^ 1091621963);
            case 248 -> a(94189224, var9 ^ -421182007);
            case 249 -> a(94189227, var9 ^ 2067825305);
            case 250 -> a(94189226, var9 ^ 630621508);
            case 251 -> a(94189221, var9 ^ 1087926256);
            case 252 -> a(94189220, var9 ^ 1830283404);
            case 253 -> a(94189223, var9 ^ -1072601106);
            case 254 -> a(94189222, var9 ^ -2062003831);
            default -> a(94189217, var9 ^ 2049420627);
         };
         int var5 = (var1 & a(94189216, var9 ^ -986799691)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(94189219, var9 ^ 1457360375)) >>> a(94189218, var9 ^ 2134209370)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(94189405, var9 ^ 73416922);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(94189404, var9 ^ -1770487254);
            }
         }

         aa[var2] = new String(var3).intern();
      }

      return aa[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = -2018131540;
      char[] var25 = "⼵⼋⼚⼰⼪⼰⼪⼰⼪⼰".toCharArray();
      String var24 = "儯拑噤\ud9f7̠醏ũ슬⮟㕖ル콑簇\ue7b1䂳쿴噁珖ᖹప㣊⾵ꓞ\u2e6c墽驏磯䯬栉Ө貝쭝㭔\ue885쳌柪ǹ唀⦚᭱䤠嵞ῐ⩟ᵏ胀∗絜呉\udfb5\udf02\ue03fꕸ\udeae꿄ᾟ칯맥\uf533\ueae8雵\ue24d\ue531ᠩ㺱㽎㺪㼶㺏㹥㻶㽄㽡㽿㻩㹦㼻㻍㻙㽢㻤㼩㺡㻎㻍㼘㽬㾭㻺㽉㺘㾈㽚㼫㻋㺮剬刔削劕券勑刨劎勨剡넶놋녕넓낚끃냪냁녀넃냝놎뇒녹녭넃\uef77\uef1b\uef55\uef96\uef3b\uefd2\uef2b\uef75\uefeb\uef6aࡅࡺ߲ࣤࡁࣀࣝޛ࠷ࡿࡱ܀ࡴࠟࡸࠗྜྷ࿉\u0fdf࿄ྵཛྷྐྵ\u0fffྐྵ\u0ff0嬥嫑嬅媷孬寧嫂嬰字孎嬋宱媶嬦嬃媎흗훻흵횶훛혲훋횕훋횊";
      short var23 = 12090;
      byte var30 = -1;
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         int var28 = 0;
         int var29 = 0;
         if (var30 == 0) {
            aba = var26;
            abb = new Object[var26.length];
            byte var40 = 0;
            b = new int[326];
            int var10001 = 0;
            byte[] var10002 = "\u000bë|\u0089\u00055³®@\u0083àr{\u0007Î9Ãëf¿Þ0×QBZÿQà\u0083Il\u0089Jg}\u0012\u0011\u000e¹±\u001e)ÍÇoÏX\u009d¤±c\u009e-©\u000f@\u0097¦Ôµî\u0089J\u0096åg\u0011ý§I£ëK/qÀ%¹xä\u0084\u0001ÊuÜÒ`\u00917ön(\nF[¹iu\u0086\u001e¶\u0002J\u0011\bj§Î\u001f\u001d\u0084(`(\u009fîEÕ\u008f\u0000-å@üøê\u0011\u001fÚæÀd\"×³-a\u0012%Jö\u0001#ËÑãU\u0082m\u0010â]\u000e\u009eZ$\u0088 ±®\u0011(a¨´°\u000b\u0006`E*\u009a\u0002È}?\u001f5ob\u008c\u001c\u0086o\u0002ÅeËâQ 1¥¦iNÜ2Õ>$ÀÝ¤L±\u001dåN\u0087¾ñn-m\u0082MD-\u001cO\u0097ïOJ\u0091ÕIé5^\u0002%\b\u0085¹\u0096qHä°\u001fÏ©A\u0085ï\u0010RÚ>ü4©ÝÍ\u009e3\u008coRÍP\u009e\f÷´\u000e\u009fq¡z»¼\u009cÍ\u0092ØxTµ\u0095ÿ`çÈ*m\"\u0003ÉhaÈ\u0086\u007f\u009cëÃ\u0007d@îö\u0017Z·\u0010sÆ_^JG4\u0095\u001e\u0017\u00143ÙXØÕ©\u0090µµÇ)¿Ã\u0016\u009a¦q¼×>Ë\u008eBÅÆßñ\u000eý;\u0092>$ÚEú\u0099åÇ2\u0081Emg\u008eWü\u0084<sÊÞKß@«m\fA\bç4\u008c\nE\u0096®¦²¦\u001cx\u0093q\u0016\u00039R¨\u0095²¥2¼Å^þÐ6¶\u0080ÝqÈsç«x>\u001c\u009e\u009a\u0000ÈIãÅÓ\u007f®0~»Ëº\u001b\u0010\u0082\u0085ºÄR¡bxBi\u0094\u001aÌyr#\u0018Áj¾z{Ñ-áÍ\u001dyqtFËnQÐt7,,sýï\u0092Î\u000eÉ\fÝ\u0002e®¥U·üÄÀ\u0099\u0088b¿\u009d4ÃªÓÃ\u0016l«\u0093\u0004n\u0001\f\u001fv\u001dô\u0007wö\u0017|1ó\u0092\u009c\u008aj·m]£Ù(\u0092\u0095\fRGV7O\t\u0083xbB\u0014ùh?¾\u008féRña¼ vÏGzÚ÷\u001f×Nøã\u0016Fc\u0085\u0010U3\u0095Ëé\u008cõ·\u0004\u001b%m©æ°*\u008fJ\\Xä\u0017Ûfc@J\u0000\t \u0099+Ø»¸3Êµº@\u0001\u009dC¦7¾ëÀSÏ4W¥Ø+\u001b\u008f\u0002GøüÞÛÂ5'L\rB'wö\u001c3[\u0011\\K\u0094;¹h}ª|51t\u0016ñ=©æA,\n\u001f¥D\u009e³ÞÐ_VM\u001c\u009d XåM8Î\u008eøD/ö¬\u0011¢¨t\u00ad×;Q\u0088Tx±º\u0004J\u0092¸\u001f \u0013y©ri¸\u0019\u0090`»öî&\u0095RËK\u0094\u00022ù\u008cfå\b\u0003\u008di\u009fçÐõ¢Ã\u0099$¿Ñ¬\u0002æ}ZA\u0086ã¡\u0012\u000e\u0097Í\u007f\u0096q\u0002¤Ña\u0088!¾P\u0093Ê·6\u0099®\u001d\u007fÚ\u0000´ÅJ\u0094\u0085\u0083ôçBGnl4Ç.(f½HÇ îØïZ\u0094\u0016Õk2KHõßéüB\u0097ÉEÍ]oyiÀtÓ\u001b\u0082©Y!¹ðíÏ0\u00adê\u008f®ë\u0080\u00ad\u008c\u0096J}¦d¼«\u0085úïh;#ª\u0092\u0018\u0086Ë÷wTý\u0092+Üæi\u0005C\u0080H\u0085?~ê\u001dg«P\u001dmßØ²É},\u0013 ø<¨\u0011Âk÷\u0085\u008c*§É\u0001ñ\u009e>\u0015\u008bâÄ\u0098\u0007oèâñÏR9áÙð\u0098s2\f\u0002\u0083;0¶\nÉÞÅ\u0004Ö\u0016Ð1ó\u0091\u0001\u0004ó/*MR'ÙVÙÝ>IeB\u0090Aù\u0002\u0001H\u008d\u0081\u0011ÆF5¶3×Ý+\u0096\u0010Ôu@\u0017ÿ\u0010\u000eúö=Á~E\u0090Çõ\u008eÕÎÃò*ñ?ë\u0095ø3\u009f\u0006\b\u0018Þ/ãæ-T¶Ó\rÆ®\u0011üq\u0085?\u008f9\u009e\u001c¸\u0089&9äz$VÄ/½Ö=á\u0005¥¬\u0091®½i:º\u000b\u0090\u00adDMm\u0091×&ÝÜ³QÑ-1\u0003¯k¤UÉG\u0017øKxòtg®)\u000b\u0013Ud8È¾Ô¡ !iÂ\u0093ýÉôÖ\u009c\nËz\u0083\u0014¶7_\u0003\u0080\u0090Èz\u008a÷Ñ\u0090;b!z\u0005§\u0014\u0011\f¯`Oÿ¯kº¤¶\u001a \u001b¹\u0097£\u0087®tÿÝEydø9\u0099\u0082¶\"q*\u0094\u0017wh\u0014\u0004\u0080Xßå¨Rl\u0004uYº\toR\u001dü\u000b\u0000×±\u0003|@d?\"Ai©;è\u0004²ÙÁÿ\u000fîß\u00854QÚsaQ«®\u0091`Ï,\u001b\u000b(\u0091%×2\u007f$¯ä\u000f³\rÀl\u0094-û\u0085\bië¹\u0089÷¨êZ\u00adt2º\u001aþ\u0080Zë\u0081¦5\u009d\u001f\u009bÂy~=#÷q×\f\u0096qü\u0019ÒÏ!\r¼Å+\u0083ò\u0006\\ìwHUìIÖ¸"
               .getBytes("ISO-8859-1");

            int var99;
            do {
               b[var40] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -54619193;
               var40 += 1;
               var99 = var10001 + 4;
               var10001 += 4;
            } while (var99 < var10002.length);

            String[] var21 = new String[4];
            int var19 = 0;
            String var18;
            int var20 = (var18 = aaa(var34 ^ 451468009, 53, 37816)).length();
            int var17 = a(94189400, var34 ^ 78905209);
            int var38 = -1;

            label144:
            while (true) {
               String var41 = var18.substring(++var38, var38 + var17);
               var10001 = (byte)-1;

               while (true) {
                  label139: {
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
                           break label139;
                        }

                        var103 = var53;
                        var125 = var22;
                     }

                     while (true) {
                        var103[var125] = (char)(var103[var125] ^ switch (var22 % a(94189402, var34 ^ -1617818606)) {
                           case 0 -> a(94189397, var34 ^ -281471784);
                           case 1 -> a(94189396, var34 ^ 1143841201);
                           case 2 -> a(94189399, var34 ^ -741087438);
                           case 3 -> a(94189398, var34 ^ -280982305);
                           case 4 -> a(94189393, var34 ^ -1574635483);
                           case 5 -> a(94189392, var34 ^ 1403431868);
                           default -> 1;
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
                           aab = var21;
                           aa = new String[4];
                           long var8 = 2260126384260650054L;
                           long[] var14 = new long[a(94189395, var34 ^ 355728511)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = aaa(var34 ^ -1238591318, 25335, 37818)).length();
                           byte var10 = 0;

                           label118:
                           while (true) {
                              int var60 = var10;
                              var10 += 8;
                              String var43 = var12.substring(var60, var10);
                              var60 = var34 ^ -2105039712;
                              short var84 = 27428;
                              char var111 = '鎻';
                              byte[] var15 = var43.getBytes("ISO-8859-1");
                              long[] var44 = var14;
                              var60 = var11++;
                              long var85 = (var15[0] & 255L) << a(94189394, var34 ^ 964711018)
                                 | (var15[1] & 255L) << a(94189389, var34 ^ 107339297)
                                 | (var15[2] & 255L) << a(94189388, var34 ^ -792812772)
                                 | (var15[3] & 255L) << a(94189391, var34 ^ 737382684)
                                 | (var15[4] & 255L) << a(94189390, var34 ^ -1069348611)
                                 | (var15[5] & 255L) << a(94189385, var34 ^ 1610509169)
                                 | (var15[a(94189384, var34 ^ -2090967685)] & 255L) << a(94189387, var34 ^ -493002030)
                                 | var15[a(94189386, var34 ^ -41738343)] & 255L;
                              byte var112 = -1;

                              while (true) {
                                 long var127 = var85 ^ var8;
                                 switch (var112) {
                                    case 0:
                                       var44[var60] = var127;
                                       if (var10 >= var13) {
                                          aaa = var14;
                                          ba = new Integer[a(94189436, var34 ^ 174617820)];
                                          long var0 = 7929405013896688004L;
                                          long[] var6 = new long[4];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = aaa(var34 ^ -2028029659, 42141, 37822)).length();
                                          byte var2 = 0;

                                          label108:
                                          while (true) {
                                             int var65 = var2;
                                             var2 += 8;
                                             String var46 = var4.substring(var65, var2);
                                             var65 = var34 ^ 2034497470;
                                             short var88 = 21075;
                                             var111 = '鎿';
                                             byte[] var7 = var46.getBytes("ISO-8859-1");
                                             long[] var47 = var6;
                                             var65 = var3++;
                                             long var89 = (var7[0] & 255L) << a(94189439, var34 ^ 133386805)
                                                | (var7[1] & 255L) << a(94189438, var34 ^ -418046889)
                                                | (var7[2] & 255L) << a(94189433, var34 ^ 264059949)
                                                | (var7[3] & 255L) << a(94189432, var34 ^ 167755239)
                                                | (var7[4] & 255L) << a(94189435, var34 ^ -19958259)
                                                | (var7[5] & 255L) << a(94189434, var34 ^ -691681835)
                                                | (var7[a(94189429, var34 ^ 198054809)] & 255L) << a(94189428, var34 ^ 298169451)
                                                | var7[a(94189431, var34 ^ 1972862498)] & 255L;
                                             byte var116 = -1;

                                             while (true) {
                                                var127 = var89 ^ var0;
                                                switch (var116) {
                                                   case 0:
                                                      var47[var65] = var127;
                                                      if (var2 >= var5) {
                                                         bb = var6;
                                                         a = new Long[4];
                                                         ab = new String[4];
                                                         bb();
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var47[var65] = var127;
                                                      if (var2 < var5) {
                                                         continue label108;
                                                      }

                                                      var5 = (var4 = aaa(var34 ^ 1622465642, 36889, 37808)).length();
                                                      var2 = 0;
                                                }

                                                int var68 = var2;
                                                var2 += 8;
                                                String var48 = var4.substring(var68, var2);
                                                var68 = var34 ^ 499887525;
                                                short var91 = 29069;
                                                var111 = '鎱';
                                                var7 = var48.getBytes("ISO-8859-1");
                                                var47 = var6;
                                                var65 = var3++;
                                                var89 = (var7[0] & 255L) << a(94189430, var34 ^ 2112612961)
                                                   | (var7[1] & 255L) << a(94189425, var34 ^ 1102441235)
                                                   | (var7[2] & 255L) << a(94189424, var34 ^ -676577225)
                                                   | (var7[3] & 255L) << a(94189427, var34 ^ -867276777)
                                                   | (var7[4] & 255L) << a(94189426, var34 ^ 1903785572)
                                                   | (var7[5] & 255L) << a(94189421, var34 ^ 1254519733)
                                                   | (var7[a(94189420, var34 ^ 533070375)] & 255L) << a(94189423, var34 ^ -268999008)
                                                   | var7[a(94189422, var34 ^ 1704755483)] & 255L;
                                                var116 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var44[var60] = var127;
                                       if (var10 < var13) {
                                          continue label118;
                                       }

                                       var13 = (var12 = aaa(var34 ^ 1659292071, 10282, 37820)).length();
                                       var10 = 0;
                                 }

                                 int var63 = var10;
                                 var10 += 8;
                                 String var45 = var12.substring(var63, var10);
                                 var63 = var34 ^ 50127777;
                                 short var87 = 1626;
                                 var111 = '鎽';
                                 var15 = var45.getBytes("ISO-8859-1");
                                 var44 = var14;
                                 var60 = var11++;
                                 var85 = (var15[0] & 255L) << a(94189381, var34 ^ 563358374)
                                    | (var15[1] & 255L) << a(94189380, var34 ^ -1225973576)
                                    | (var15[2] & 255L) << a(94189383, var34 ^ -1358458010)
                                    | (var15[3] & 255L) << a(94189382, var34 ^ 1609411706)
                                    | (var15[4] & 255L) << a(94189377, var34 ^ 1787209085)
                                    | (var15[5] & 255L) << a(94189376, var34 ^ 517494340)
                                    | (var15[a(94189379, var34 ^ 355274000)] & 255L) << a(94189378, var34 ^ 1681371672)
                                    | var15[a(94189437, var34 ^ -382456265)] & 255L;
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
                           continue label144;
                        }

                        var20 = (var18 = aaa(var34 ^ 532063771, 9356, 37817)).length();
                        var17 = a(94189403, var34 ^ 1361739301);
                        var38 = -1;
                  }

                  var41 = var18.substring(++var38, var38 + var17);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var29 = var25[var27] ^ var23;
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               short var33 = switch (var32 % 6) {
                  default -> 92;
                  case 1 -> 14;
                  case 2 -> 100;
                  case 3 -> 25;
                  case 4 -> 71;
                  case 5 -> 174;
               };
               var31[var32] = (char)(var31[var32] ^ var33);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private aaabbabab() {
   }

   @Override
   public Object invoke(Object param1, Method param2, Object[] param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 2
      // 006: iload 4
      // 008: ifne 01c
      // 00b: invokevirtual java/lang/reflect/Method.getDeclaringClass ()Ljava/lang/Class;
      // 00e: ldc java/lang/Object
      // 010: if_acmpne 11b
      // 013: goto 017
      // 016: athrow
      // 017: aload 2
      // 018: goto 01c
      // 01b: athrow
      // 01c: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 01f: astore 5
      // 021: bipush -1
      // 022: istore 6
      // 024: aload 5
      // 026: invokevirtual java/lang/String.hashCode ()I
      // 029: iload 4
      // 02b: ifne 0b4
      // 02e: lookupswitch 132 3 -1776922004 35 -1295482945 103 147696667 69
      // 050: athrow
      // 051: aload 5
      // 053: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabab.ab [Ljava/lang/String;
      // 056: bipush 3
      // 057: aaload
      // 058: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 05b: iload 4
      // 05d: ifne 0b4
      // 060: goto 064
      // 063: athrow
      // 064: ifeq 0b2
      // 067: goto 06b
      // 06a: athrow
      // 06b: bipush 0
      // 06c: istore 6
      // 06e: iload 4
      // 070: ifeq 0b2
      // 073: aload 5
      // 075: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabab.ab [Ljava/lang/String;
      // 078: bipush 0
      // 079: aaload
      // 07a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07d: iload 4
      // 07f: ifne 0b4
      // 082: goto 086
      // 085: athrow
      // 086: ifeq 0b2
      // 089: goto 08d
      // 08c: athrow
      // 08d: bipush 1
      // 08e: istore 6
      // 090: iload 4
      // 092: ifeq 0b2
      // 095: aload 5
      // 097: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabab.ab [Ljava/lang/String;
      // 09a: bipush 1
      // 09b: aaload
      // 09c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 09f: iload 4
      // 0a1: ifne 0b4
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: ifeq 0b2
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: bipush 2
      // 0b0: istore 6
      // 0b2: iload 6
      // 0b4: tableswitch 101 0 2 28 40 50
      // 0d0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabab.ab [Ljava/lang/String;
      // 0d3: bipush 2
      // 0d4: aaload
      // 0d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d8: goto 11a
      // 0db: athrow
      // 0dc: aload 1
      // 0dd: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 0e0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e3: goto 11a
      // 0e6: aload 1
      // 0e7: aload 3
      // 0e8: iload 4
      // 0ea: ifne 0f5
      // 0ed: ifnull 102
      // 0f0: goto 0f4
      // 0f3: athrow
      // 0f4: aload 3
      // 0f5: iload 4
      // 0f7: ifne 108
      // 0fa: arraylength
      // 0fb: ifne 107
      // 0fe: goto 102
      // 101: athrow
      // 102: aconst_null
      // 103: goto 10a
      // 106: athrow
      // 107: aload 3
      // 108: bipush 0
      // 109: aaload
      // 10a: if_acmpne 112
      // 10d: bipush 1
      // 10e: goto 113
      // 111: athrow
      // 112: bipush 0
      // 113: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 116: goto 11a
      // 119: aconst_null
      // 11a: areturn
      // 11b: aload 3
      // 11c: iload 4
      // 11e: ifne 129
      // 121: ifnull 140
      // 124: goto 128
      // 127: athrow
      // 128: aload 3
      // 129: iload 4
      // 12b: ifne 13d
      // 12e: arraylength
      // 12f: ifle 140
      // 132: goto 136
      // 135: athrow
      // 136: aload 3
      // 137: bipush 0
      // 138: aaload
      // 139: goto 13d
      // 13c: athrow
      // 13d: goto 141
      // 140: aconst_null
      // 141: astore 5
      // 143: aload 5
      // 145: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.bba (Ljava/lang/Object;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab;
      // 148: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbababa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab;
      // 14b: aconst_null
      // 14c: areturn
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(94189407, 599755114 ^ -1424440099)) & a(94189406, 599755114 ^ -486507108);
      if (a[var3] == null) {
         a[var3] = bb[var3] ^ var1;
      }

      return a[var3];
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(94189401, 1793288300 ^ 451354996);
      if (ba[var3] == null) {
         ba[var3] = (int)(aaa[var3] ^ var1);
      }

      return ba[var3];
   }

   private static String ba(char[] var0, long var1, int var3) {
      int var4 = b(a(94189417, 1375287724 ^ -1928576614), 3907307363596703383L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & b(a(94189416, 1375287724 ^ -1938512676), 2030337866197470270L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 94189149] ^ var1 ^ var0;
      var2 ^= 14883;
      var2 -= 36627;
      var2 ^= 22232;
      var2 += 41941;
      var2 -= 55270;
      var2 -= 19126;
      var2 ^= 65304;
      var2 ^= 52987;
      return var2 - 33682;
   }

   private static void bb() {
      int var0 = -965891977;
      ab[0] = ba(
         aa(a(94189419, var0 ^ -1941806540), a(94189418, var0 ^ -1419636688)).toCharArray(),
         ab(a(94189413, var0 ^ 925238881), 2026618138668113917L),
         b(a(94189412, var0 ^ -1229429729), 1023208853978529342L)
      );
      ab[1] = ba(
         aa(a(94189415, var0 ^ 1709364829), a(94189414, var0 ^ -2058009278)).toCharArray(),
         ab(a(94189409, var0 ^ 1705278252), 1446927132705775856L),
         b(a(94189408, var0 ^ 181598738), 1853890227238087088L)
      );
      ab[2] = ba(
         aa(a(94189411, var0 ^ -46736276), a(94189410, var0 ^ 481846589)).toCharArray(),
         ab(a(94189341, var0 ^ 869903502), 6498043584615878534L),
         b(a(94189340, var0 ^ 647925525), 2904052499341559939L)
      );
      ab[3] = ba(
         aa(a(94189343, var0 ^ 854812429), a(94189342, var0 ^ -1128460958)).toCharArray(),
         ab(a(94189337, var0 ^ -751257467), 5952900093759649499L),
         b(a(94189336, var0 ^ -754581157), 7022196629408188329L)
      );
   }
}
