package nsc;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_640;
import net.minecraft.class_7920;
import net.minecraft.class_8685;
import net.minecraft.class_12079.class_10726;

@Environment(EnvType.CLIENT)
public final class baaaaaab extends abbaabbaa {
   private final baabaab ba;
   private static final long[] aaa;
   private static final Object[] babab;
   private long aab;
   private volatile Pattern aba;
   private final baabaab abb;
   private static final String[] baa;
   private final baabaab bb;
   private final ababbbba bab;
   private final baabaab bba;
   private static final int bbb;
   private static volatile baaaaaab aaaa;
   private String aaab;
   private static final Long[] aaba;
   private String aabb;
   private String abaa;
   private static final int abab;
   private static final ababbbbaa abba;
   private static final Integer[] abbb;
   private final baabaab baaa;
   private volatile Map baab;
   private final Map baba;
   private static final ababbbbaa ab;
   private final baabaab babb;
   private final AtomicInteger bbaa;
   private static final ababbbbaa aa;
   private volatile boolean bbab;
   private static final ababbbbaa bbba;
   private UUID bbbb;
   private static final int aaaaa;
   private final baabaab aaaab;
   private final Map aaaba;
   private static final HttpClient aaabb;
   private final Map aabaa;
   private String aabab;
   private final abbaaaaa aabba;
   private static final long[] aabbb;
   private String abaaa;
   private String abaab;
   private static final int ababa;
   private final abbaaaaa ababb;
   private volatile Object abbaa;
   private String abbab;
   private static final String[] abbba;
   private static final int[] baabb;
   private Pattern abbbb;
   private final ababbbba baaaa;
   private final baabaab baaab;
   private static final String[] babaa;
   private String baaba;

   private boolean aa() {
      try {
         if (this.baaa.abbb() != babbabba.aba) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw var1;
      }

      return false;
   }

   private static String ab(int var0, int var1) {
      int var9 = -1483553851;
      int var2 = (var0 ^ a(-1619051179, var9 ^ -617423495)) & a(-1619051180, var9 ^ -551702011);
      if (abbba[var2] == null) {
         char[] var3 = baa[var2].toCharArray();

         int var4 = switch (var3[0] & a(-1619051177, var9 ^ -915483013)) {
            case 0 -> a(-1619051178, var9 ^ -779638469);
            case 1 -> a(-1619051183, var9 ^ 1919171307);
            case 2 -> a(-1619051184, var9 ^ 273514511);
            case 3 -> a(-1619051181, var9 ^ -1049141296);
            case 4 -> a(-1619051182, var9 ^ 1929547478);
            case 5 -> a(-1619051171, var9 ^ 526160294);
            case 6 -> a(-1619051172, var9 ^ -2002044857);
            case 7 -> a(-1619051169, var9 ^ 117361728);
            case 8 -> a(-1619051170, var9 ^ -559673278);
            case 9 -> a(-1619051175, var9 ^ -1609077774);
            case 10 -> a(-1619051176, var9 ^ 1655789286);
            case 11 -> a(-1619051173, var9 ^ 1116428544);
            case 12 -> a(-1619051174, var9 ^ 710696257);
            case 13 -> a(-1619051195, var9 ^ 59825695);
            case 14 -> a(-1619051196, var9 ^ -729973371);
            case 15 -> a(-1619051193, var9 ^ 1600269563);
            case 16 -> a(-1619051194, var9 ^ -1944486944);
            case 17 -> a(-1619051199, var9 ^ 1392227313);
            case 18 -> a(-1619051200, var9 ^ 390354025);
            case 19 -> a(-1619051197, var9 ^ 1676210604);
            case 20 -> a(-1619051198, var9 ^ 540257498);
            case 21 -> a(-1619051187, var9 ^ -1084772935);
            case 22 -> a(-1619051188, var9 ^ -698644288);
            case 23 -> a(-1619051185, var9 ^ 1981212965);
            case 24 -> a(-1619051186, var9 ^ 964722329);
            case 25 -> a(-1619051191, var9 ^ 1736723783);
            case 26 -> a(-1619051192, var9 ^ 1650342150);
            case 27 -> a(-1619051189, var9 ^ 2129238784);
            case 28 -> a(-1619051190, var9 ^ 1593746652);
            case 29 -> a(-1619051147, var9 ^ -766827414);
            case 30 -> a(-1619051148, var9 ^ -1801966458);
            case 31 -> a(-1619051145, var9 ^ -809416773);
            case 32 -> a(-1619051146, var9 ^ -1496922773);
            case 33 -> a(-1619051151, var9 ^ 655554344);
            case 34 -> a(-1619051152, var9 ^ 884293012);
            case 35 -> a(-1619051149, var9 ^ 510069589);
            case 36 -> a(-1619051150, var9 ^ 994500294);
            case 37 -> a(-1619051139, var9 ^ -2032452046);
            case 38 -> a(-1619051140, var9 ^ 554401103);
            case 39 -> a(-1619051137, var9 ^ 1747828194);
            case 40 -> a(-1619051138, var9 ^ -1083538555);
            case 41 -> a(-1619051143, var9 ^ 2137325469);
            case 42 -> a(-1619051144, var9 ^ 1237750563);
            case 43 -> a(-1619051141, var9 ^ -1732267707);
            case 44 -> a(-1619051142, var9 ^ 1182662236);
            case 45 -> a(-1619051163, var9 ^ 1155030225);
            case 46 -> a(-1619051164, var9 ^ -1700885293);
            case 47 -> a(-1619051161, var9 ^ 394034175);
            case 48 -> a(-1619051162, var9 ^ -1965265535);
            case 49 -> a(-1619051167, var9 ^ -1067976535);
            case 50 -> a(-1619051168, var9 ^ 869716138);
            case 51 -> a(-1619051165, var9 ^ -2044494402);
            case 52 -> a(-1619051166, var9 ^ -1944150547);
            case 53 -> a(-1619051155, var9 ^ -2085057014);
            case 54 -> a(-1619051156, var9 ^ 1712066875);
            case 55 -> a(-1619051153, var9 ^ 961004924);
            case 56 -> a(-1619051154, var9 ^ -783253704);
            case 57 -> a(-1619051159, var9 ^ 1307047503);
            case 58 -> a(-1619051160, var9 ^ 635240328);
            case 59 -> a(-1619051157, var9 ^ 1808046739);
            case 60 -> a(-1619051158, var9 ^ -756932281);
            case 61 -> a(-1619051243, var9 ^ -2129423863);
            case 62 -> a(-1619051244, var9 ^ 219796164);
            case 63 -> a(-1619051241, var9 ^ 165287173);
            case 64 -> a(-1619051242, var9 ^ 1356262415);
            case 65 -> a(-1619051247, var9 ^ 1402976728);
            case 66 -> a(-1619051248, var9 ^ 2123424064);
            case 67 -> a(-1619051245, var9 ^ 554786850);
            case 68 -> a(-1619051246, var9 ^ 697948649);
            case 69 -> a(-1619051235, var9 ^ -290799469);
            case 70 -> a(-1619051236, var9 ^ -1743743626);
            case 71 -> a(-1619051233, var9 ^ -971324514);
            case 72 -> a(-1619051234, var9 ^ -1076922590);
            case 73 -> a(-1619051239, var9 ^ -1528204187);
            case 74 -> a(-1619051240, var9 ^ -942005000);
            case 75 -> a(-1619051237, var9 ^ -448997469);
            case 76 -> a(-1619051238, var9 ^ 1980128155);
            case 77 -> a(-1619051259, var9 ^ 138688969);
            case 78 -> a(-1619051260, var9 ^ -1691161654);
            case 79 -> a(-1619051257, var9 ^ 1231914972);
            case 80 -> a(-1619051258, var9 ^ 169015095);
            case 81 -> a(-1619051263, var9 ^ 1290493940);
            case 82 -> a(-1619051264, var9 ^ -622418812);
            case 83 -> a(-1619051261, var9 ^ -1460913195);
            case 84 -> a(-1619051262, var9 ^ 449537460);
            case 85 -> a(-1619051251, var9 ^ 1663409128);
            case 86 -> a(-1619051252, var9 ^ 613797622);
            case 87 -> a(-1619051249, var9 ^ 715193533);
            case 88 -> a(-1619051250, var9 ^ 338873180);
            case 89 -> a(-1619051255, var9 ^ 508172323);
            case 90 -> a(-1619051256, var9 ^ 2095422162);
            case 91 -> a(-1619051253, var9 ^ 2088291656);
            case 92 -> a(-1619051254, var9 ^ -68275177);
            case 93 -> a(-1619051211, var9 ^ -1110975962);
            case 94 -> a(-1619051212, var9 ^ -1465927437);
            case 95 -> a(-1619051209, var9 ^ -459437586);
            case 96 -> a(-1619051210, var9 ^ 1808503877);
            case 97 -> a(-1619051215, var9 ^ 485254180);
            case 98 -> a(-1619051216, var9 ^ -1719226571);
            case 99 -> a(-1619051213, var9 ^ 939152856);
            case 100 -> a(-1619051214, var9 ^ -348185170);
            case 101 -> a(-1619051203, var9 ^ -412992772);
            case 102 -> a(-1619051204, var9 ^ -1523865245);
            case 103 -> a(-1619051201, var9 ^ -125088774);
            case 104 -> a(-1619051202, var9 ^ 187199933);
            case 105 -> a(-1619051207, var9 ^ -2071247743);
            case 106 -> a(-1619051208, var9 ^ 33116390);
            case 107 -> a(-1619051205, var9 ^ 860747584);
            case 108 -> a(-1619051206, var9 ^ -1564304119);
            case 109 -> a(-1619051227, var9 ^ 170076482);
            case 110 -> a(-1619051228, var9 ^ 1556908422);
            case 111 -> a(-1619051225, var9 ^ -1134961694);
            case 112 -> a(-1619051226, var9 ^ -1245780643);
            case 113 -> a(-1619051231, var9 ^ 1029951105);
            case 114 -> a(-1619051232, var9 ^ 513074172);
            case 115 -> a(-1619051229, var9 ^ -81752289);
            case 116 -> a(-1619051230, var9 ^ -1552354095);
            case 117 -> a(-1619051219, var9 ^ -1872453335);
            case 118 -> a(-1619051220, var9 ^ -490451691);
            case 119 -> a(-1619051217, var9 ^ -1234482053);
            case 120 -> a(-1619051218, var9 ^ 374381791);
            case 121 -> a(-1619051223, var9 ^ -1341107264);
            case 122 -> a(-1619051224, var9 ^ 1332493766);
            case 123 -> a(-1619051221, var9 ^ 905453464);
            case 124 -> a(-1619051222, var9 ^ -1426270926);
            case 125 -> a(-1619051051, var9 ^ -689619332);
            case 126 -> a(-1619051052, var9 ^ -9005117);
            case 127 -> a(-1619051049, var9 ^ 511024984);
            case 128 -> a(-1619051050, var9 ^ -655872647);
            case 129 -> a(-1619051055, var9 ^ 10556551);
            case 130 -> 2;
            case 131 -> a(-1619051056, var9 ^ 1177923900);
            case 132 -> a(-1619051053, var9 ^ 1640006634);
            case 133 -> a(-1619051054, var9 ^ -1258290924);
            case 134 -> a(-1619051043, var9 ^ 1111413059);
            case 135 -> 3;
            case 136 -> 0;
            case 137 -> a(-1619051044, var9 ^ -85435345);
            case 138 -> a(-1619051041, var9 ^ -1667156034);
            case 139 -> a(-1619051042, var9 ^ 2065455019);
            case 140 -> a(-1619051047, var9 ^ 47915130);
            case 141 -> a(-1619051048, var9 ^ 84320156);
            case 142 -> a(-1619051045, var9 ^ -1654727809);
            case 143 -> a(-1619051046, var9 ^ -1233942729);
            case 144 -> a(-1619051067, var9 ^ 560958948);
            case 145 -> a(-1619051068, var9 ^ 192371188);
            case 146 -> a(-1619051065, var9 ^ -940669224);
            case 147 -> a(-1619051066, var9 ^ 543272504);
            case 148 -> a(-1619051071, var9 ^ 1728408267);
            case 149 -> a(-1619051072, var9 ^ 688883951);
            case 150 -> a(-1619051069, var9 ^ 2100913963);
            case 151 -> a(-1619051070, var9 ^ -816950136);
            case 152 -> a(-1619051059, var9 ^ -1971693757);
            case 153 -> a(-1619051060, var9 ^ -2015263296);
            case 154 -> a(-1619051057, var9 ^ -926718595);
            case 155 -> a(-1619051058, var9 ^ 1069357758);
            case 156 -> a(-1619051063, var9 ^ 2001729446);
            case 157 -> a(-1619051064, var9 ^ -2083992268);
            case 158 -> a(-1619051061, var9 ^ -144358718);
            case 159 -> a(-1619051062, var9 ^ 1256588825);
            case 160 -> a(-1619051019, var9 ^ 161271267);
            case 161 -> a(-1619051020, var9 ^ -293008903);
            case 162 -> a(-1619051017, var9 ^ -296105232);
            case 163 -> a(-1619051018, var9 ^ -634365181);
            case 164 -> a(-1619051023, var9 ^ 198031733);
            case 165 -> a(-1619051024, var9 ^ -125290607);
            case 166 -> a(-1619051021, var9 ^ 896912221);
            case 167 -> a(-1619051022, var9 ^ 1273208657);
            case 168 -> a(-1619051011, var9 ^ 554116431);
            case 169 -> a(-1619051012, var9 ^ -497227763);
            case 170 -> a(-1619051009, var9 ^ -1377652844);
            case 171 -> a(-1619051010, var9 ^ 248960559);
            case 172 -> a(-1619051015, var9 ^ -617702458);
            case 173 -> a(-1619051016, var9 ^ -360982614);
            case 174 -> a(-1619051013, var9 ^ -2038780723);
            case 175 -> a(-1619051014, var9 ^ 105446503);
            case 176 -> a(-1619051035, var9 ^ 532129499);
            case 177 -> a(-1619051036, var9 ^ 576724083);
            case 178 -> a(-1619051033, var9 ^ -935431232);
            case 179 -> 4;
            case 180 -> a(-1619051034, var9 ^ -1434233791);
            case 181 -> a(-1619051039, var9 ^ -2083176920);
            case 182 -> a(-1619051040, var9 ^ -390613195);
            case 183 -> a(-1619051037, var9 ^ 550248882);
            case 184 -> a(-1619051038, var9 ^ -2051529777);
            case 185 -> a(-1619051027, var9 ^ -1833088339);
            case 186 -> a(-1619051028, var9 ^ -1574546217);
            case 187 -> a(-1619051025, var9 ^ 2144378408);
            case 188 -> a(-1619051026, var9 ^ -578788720);
            case 189 -> 5;
            case 190 -> a(-1619051031, var9 ^ -1946325766);
            case 191 -> a(-1619051032, var9 ^ 542734600);
            case 192 -> a(-1619051029, var9 ^ -2125513281);
            case 193 -> a(-1619051030, var9 ^ -434388871);
            case 194 -> a(-1619051115, var9 ^ 1840275774);
            case 195 -> a(-1619051116, var9 ^ -931755319);
            case 196 -> a(-1619051113, var9 ^ -326150007);
            case 197 -> a(-1619051114, var9 ^ -868155071);
            case 198 -> a(-1619051119, var9 ^ 965564278);
            case 199 -> a(-1619051120, var9 ^ -2039056963);
            case 200 -> a(-1619051117, var9 ^ 856132581);
            case 201 -> a(-1619051118, var9 ^ 618776552);
            case 202 -> a(-1619051107, var9 ^ -1627265276);
            case 203 -> a(-1619051108, var9 ^ -1081159732);
            case 204 -> a(-1619051105, var9 ^ 1396136223);
            case 205 -> a(-1619051106, var9 ^ -1011550736);
            case 206 -> a(-1619051111, var9 ^ 187533097);
            case 207 -> a(-1619051112, var9 ^ 1743967787);
            case 208 -> a(-1619051109, var9 ^ -869940193);
            case 209 -> a(-1619051110, var9 ^ 816336080);
            case 210 -> a(-1619051131, var9 ^ 121197908);
            case 211 -> a(-1619051132, var9 ^ -1029546975);
            case 212 -> a(-1619051129, var9 ^ -2004521748);
            case 213 -> a(-1619051130, var9 ^ -793966500);
            case 214 -> a(-1619051135, var9 ^ -1879765717);
            case 215 -> a(-1619051136, var9 ^ 1648217201);
            case 216 -> a(-1619051133, var9 ^ -2069823623);
            case 217 -> a(-1619051134, var9 ^ -116787644);
            case 218 -> a(-1619051123, var9 ^ -895292298);
            case 219 -> a(-1619051124, var9 ^ 2051111565);
            case 220 -> a(-1619051121, var9 ^ 932154292);
            case 221 -> 1;
            case 222 -> a(-1619051122, var9 ^ -2053081852);
            case 223 -> a(-1619051127, var9 ^ 526215425);
            case 224 -> a(-1619051128, var9 ^ -1718123229);
            case 225 -> a(-1619051125, var9 ^ -1808196517);
            case 226 -> a(-1619051126, var9 ^ 1257251442);
            case 227 -> a(-1619051083, var9 ^ -1312807605);
            case 228 -> a(-1619051084, var9 ^ -1245832062);
            case 229 -> a(-1619051081, var9 ^ -1774955155);
            case 230 -> a(-1619051082, var9 ^ -897775390);
            case 231 -> a(-1619051087, var9 ^ 726033766);
            case 232 -> a(-1619051088, var9 ^ 1036952471);
            case 233 -> a(-1619051085, var9 ^ -502611797);
            case 234 -> a(-1619051086, var9 ^ -1048674364);
            case 235 -> a(-1619051075, var9 ^ -1144271790);
            case 236 -> a(-1619051076, var9 ^ 1607989821);
            case 237 -> a(-1619051073, var9 ^ 331459960);
            case 238 -> a(-1619051074, var9 ^ 1589021892);
            case 239 -> a(-1619051079, var9 ^ 1840303152);
            case 240 -> a(-1619051080, var9 ^ 2116668263);
            case 241 -> a(-1619051077, var9 ^ 1759756474);
            case 242 -> a(-1619051078, var9 ^ 731594962);
            case 243 -> a(-1619051099, var9 ^ -1665165429);
            case 244 -> a(-1619051100, var9 ^ -1350164410);
            case 245 -> a(-1619051097, var9 ^ -515452041);
            case 246 -> a(-1619051098, var9 ^ 1357483536);
            case 247 -> a(-1619051103, var9 ^ 1009214233);
            case 248 -> a(-1619051104, var9 ^ 1820422853);
            case 249 -> a(-1619051101, var9 ^ -53595627);
            case 250 -> a(-1619051102, var9 ^ -20126708);
            case 251 -> a(-1619051091, var9 ^ 1278304485);
            case 252 -> a(-1619051092, var9 ^ -1114944281);
            case 253 -> a(-1619051089, var9 ^ -718063397);
            case 254 -> a(-1619051090, var9 ^ 760856446);
            default -> a(-1619051095, var9 ^ -1525945573);
         };
         int var5 = (var1 & a(-1619051096, var9 ^ 1538520020)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-1619051093, var9 ^ 844306171)) >>> a(-1619051094, var9 ^ -312591744)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-1619051435, var9 ^ 1912297070);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-1619051436, var9 ^ 1341335916);
            }
         }

         abbba[var2] = new String(var3).intern();
      }

      return abbba[var2];
   }

   @Override
   public void aabaa() {
      this.aaaba.clear();
      this.abbbaa();
      this.abbab = "";
      this.bbbb = null;
      this.aabb = "";
      this.abaab = "";
      this.aab = 0L;
      this.aabaa.clear();
      this.bbaa.set(0);
      this.abaaa = "";
      this.aabbaa();
   }

   private CompletableFuture ba(class_310 var1, String var2) {
      String var3 = var2.trim();
      this.aaab(var3);
      return this.aaaba.computeIfAbsent(var3, this::abaaab);
   }

   private class_640 bb(class_310 param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 2e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 14: ifnull 2e
      // 17: aload 2
      // 18: iload 3
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnull 2e
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: invokevirtual java/lang/String.isBlank ()Z
      // 2b: ifeq 31
      // 2e: aconst_null
      // 2f: areturn
      // 30: athrow
      // 31: aload 1
      // 32: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 35: aload 2
      // 36: invokevirtual net/minecraft/class_634.method_73471 (Ljava/lang/String;)Lnet/minecraft/class_640;
      // 39: areturn
   }

   private static GameProfile aaa(GameProfile param0, HttpResponse param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1795616195
      // 003: istore 10
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: aload 0
      // 009: astore 3
      // 00a: istore 2
      // 00b: aload 1
      // 00c: iload 2
      // 00d: ifne 040
      // 010: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 015: ldc_w -1619051433
      // 018: iload 10
      // 01a: ldc_w 1767763348
      // 01d: ixor
      // 01e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 021: ldc2_w 8436970481166426359
      // 024: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 027: if_icmpne 05e
      // 02a: goto 02e
      // 02d: athrow
      // 02e: aload 1
      // 02f: iload 2
      // 030: ifne 04d
      // 033: goto 037
      // 036: athrow
      // 037: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 03c: goto 040
      // 03f: athrow
      // 040: ifnull 05e
      // 043: aload 1
      // 044: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 049: goto 04d
      // 04c: athrow
      // 04d: iload 2
      // 04e: ifne 067
      // 051: checkcast java/lang/String
      // 054: invokevirtual java/lang/String.isBlank ()Z
      // 057: ifeq 061
      // 05a: goto 05e
      // 05d: athrow
      // 05e: aload 3
      // 05f: areturn
      // 060: athrow
      // 061: aload 1
      // 062: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 067: checkcast java/lang/String
      // 06a: invokestatic com/google/gson/JsonParser.parseString (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 06d: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 070: astore 4
      // 072: aload 4
      // 074: ldc_w -1619051434
      // 077: iload 10
      // 079: ldc_w 1530932474
      // 07c: ixor
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 080: ldc_w -1619051439
      // 083: iload 10
      // 085: ldc_w 532343876
      // 088: ixor
      // 089: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 08c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 08f: iload 2
      // 090: ifne 0c3
      // 093: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 096: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 099: ifne 0a3
      // 09c: goto 0a0
      // 09f: athrow
      // 0a0: aload 3
      // 0a1: areturn
      // 0a2: athrow
      // 0a3: aload 4
      // 0a5: ldc_w -1619051440
      // 0a8: iload 10
      // 0aa: ldc_w 1113876319
      // 0ad: ixor
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0b1: ldc_w -1619051437
      // 0b4: iload 10
      // 0b6: ldc_w 1718887792
      // 0b9: ixor
      // 0ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 0c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0c3: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 0c6: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 0c9: astore 5
      // 0cb: aload 5
      // 0cd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d2: ifeq 244
      // 0d5: aload 5
      // 0d7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0dc: checkcast com/google/gson/JsonElement
      // 0df: astore 6
      // 0e1: aload 6
      // 0e3: iload 2
      // 0e4: ifne 0fb
      // 0e7: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 0ea: ifne 0f9
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: iload 2
      // 0f2: ifeq 0cb
      // 0f5: goto 0f9
      // 0f8: athrow
      // 0f9: aload 6
      // 0fb: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 0fe: astore 7
      // 100: aload 7
      // 102: ldc_w -1619051438
      // 105: iload 10
      // 107: ldc_w -1815790774
      // 10a: ixor
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 10e: ldc_w -1619051427
      // 111: iload 10
      // 113: ldc_w 785401635
      // 116: ixor
      // 117: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 11a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 11d: iload 2
      // 11e: ifne 156
      // 121: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 124: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 127: ifeq 0cb
      // 12a: goto 12e
      // 12d: athrow
      // 12e: aload 7
      // 130: iload 2
      // 131: ifne 187
      // 134: ldc_w -1619051428
      // 137: iload 10
      // 139: ldc_w -1473813791
      // 13c: ixor
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 140: ldc_w -1619051425
      // 143: iload 10
      // 145: ldc_w 230427514
      // 148: ixor
      // 149: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 14c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 14f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 152: goto 156
      // 155: athrow
      // 156: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 159: ifne 164
      // 15c: iload 2
      // 15d: ifeq 0cb
      // 160: goto 164
      // 163: athrow
      // 164: aload 7
      // 166: ldc_w -1619051426
      // 169: iload 10
      // 16b: ldc_w -1373834241
      // 16e: ixor
      // 16f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 172: ldc_w -1619051431
      // 175: iload 10
      // 177: ldc_w 902946355
      // 17a: ixor
      // 17b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 17e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 181: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 184: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 187: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 18a: astore 8
      // 18c: aload 7
      // 18e: ldc_w -1619051432
      // 191: iload 10
      // 193: ldc_w 619695568
      // 196: ixor
      // 197: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 19a: ldc_w -1619051429
      // 19d: iload 10
      // 19f: ldc_w -1046330962
      // 1a2: ixor
      // 1a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 1a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 1a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1ac: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1af: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 1b2: astore 9
      // 1b4: aload 9
      // 1b6: invokevirtual java/lang/String.isBlank ()Z
      // 1b9: iload 2
      // 1ba: ifne 1ef
      // 1bd: ifeq 1cc
      // 1c0: goto 1c4
      // 1c3: athrow
      // 1c4: iload 2
      // 1c5: ifeq 0cb
      // 1c8: goto 1cc
      // 1cb: athrow
      // 1cc: aload 7
      // 1ce: ldc_w -1619051430
      // 1d1: iload 10
      // 1d3: ldc_w -336843717
      // 1d6: ixor
      // 1d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 1da: ldc_w -1619051451
      // 1dd: iload 10
      // 1df: ldc_w 249032129
      // 1e2: ixor
      // 1e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 1e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 1e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1ec: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 1ef: ifeq 22e
      // 1f2: aload 3
      // 1f3: aload 8
      // 1f5: new com/mojang/authlib/properties/Property
      // 1f8: dup
      // 1f9: aload 8
      // 1fb: aload 9
      // 1fd: aload 7
      // 1ff: ldc_w -1619051452
      // 202: iload 10
      // 204: ldc_w -540257678
      // 207: ixor
      // 208: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 20b: ldc_w -1619051449
      // 20e: iload 10
      // 210: ldc_w 1185266795
      // 213: ixor
      // 214: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 217: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 21a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 21d: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 220: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 223: invokespecial com/mojang/authlib/properties/Property.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 226: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aaa (Lcom/mojang/authlib/GameProfile;Ljava/lang/String;Lcom/mojang/authlib/properties/Property;)Lcom/mojang/authlib/GameProfile;
      // 229: astore 3
      // 22a: iload 2
      // 22b: ifeq 240
      // 22e: aload 3
      // 22f: aload 8
      // 231: new com/mojang/authlib/properties/Property
      // 234: dup
      // 235: aload 8
      // 237: aload 9
      // 239: invokespecial com/mojang/authlib/properties/Property.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 23c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aaa (Lcom/mojang/authlib/GameProfile;Ljava/lang/String;Lcom/mojang/authlib/properties/Property;)Lcom/mojang/authlib/GameProfile;
      // 23f: astore 3
      // 240: iload 2
      // 241: ifeq 0cb
      // 244: aload 3
      // 245: areturn
   }

   private void aab(String param1, Throwable param2, Object param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: bipush 0
      // 05: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbab Z
      // 08: istore 4
      // 0a: aload 1
      // 0b: iload 4
      // 0d: ifne 29
      // 10: aload 0
      // 11: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaa Ljava/lang/String;
      // 14: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 17: ifeq 32
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 22: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 25: goto 29
      // 28: athrow
      // 29: checkcast java/lang/Boolean
      // 2c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f: ifne 34
      // 32: return
      // 33: athrow
      // 34: aload 2
      // 35: iload 4
      // 37: ifne 42
      // 3a: ifnonnull 58
      // 3d: goto 41
      // 40: athrow
      // 41: aload 3
      // 42: ifnull 58
      // 45: aload 0
      // 46: aload 3
      // 47: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaa Ljava/lang/Object;
      // 4a: aload 0
      // 4b: ldc_w ""
      // 4e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaab Ljava/lang/String;
      // 51: aload 0
      // 52: lconst_0
      // 53: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aab J
      // 56: return
      // 57: athrow
      // 58: aload 0
      // 59: aconst_null
      // 5a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaa Ljava/lang/Object;
      // 5d: aload 0
      // 5e: aload 1
      // 5f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaab Ljava/lang/String;
      // 62: aload 0
      // 63: invokestatic java/lang/System.currentTimeMillis ()J
      // 66: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aab J
      // 69: aload 0
      // 6a: ldc_w ""
      // 6d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaa Ljava/lang/String;
      // 70: return
   }

   private boolean aba() {
      try {
         if (this.baaa.abbb() != babbabba.aba) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw var1;
      }

      return false;
   }

   private CompletableFuture abb(String var1) {
      String var2 = URLEncoder.encode(var1, StandardCharsets.UTF_8);
      String var4 = abba.abab();
      HttpRequest var3 = HttpRequest.newBuilder(URI.create(var4 + var2))
         .timeout(Duration.ofSeconds(baaa(a(-1619051450, -1432700400 ^ 1352771348), 217708951173032143L)))
         .header(bbba.abab(), aa.abab())
         .GET()
         .build();
      return aaabb.sendAsync(var3, BodyHandlers.ofString()).thenApply(this::aaaabb).exceptionally(baaaaaab::abaaba);
   }

   private static String b(int var0, int var1, int var2) {
      int var3 = var1 ^ 15026;
      char[] var4 = babaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])babab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         babab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 4823;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 27183;
         var10 -= 47750;
         var10 -= 44479;
         var10 ^= 53112;
         var10 ^= 43600;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int bab(int var0) {
      return Math.max(var0, 1);
   }

   private String bba(GameProfile param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 0
      // 004: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abba ()V
      // 007: istore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbab (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 00d: astore 3
      // 00e: aload 3
      // 00f: ifnonnull 018
      // 012: aload 0
      // 013: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaaab ()Ljava/lang/String;
      // 016: areturn
      // 017: athrow
      // 018: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 01b: astore 4
      // 01d: iload 2
      // 01e: ifne 09f
      // 021: aload 4
      // 023: ifnull 092
      // 026: goto 02a
      // 029: athrow
      // 02a: aload 4
      // 02c: iload 2
      // 02d: ifne 0a9
      // 030: goto 034
      // 033: athrow
      // 034: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 037: ifnull 092
      // 03a: goto 03e
      // 03d: athrow
      // 03e: aload 4
      // 040: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 043: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 046: iload 2
      // 047: ifne 0a9
      // 04a: goto 04e
      // 04d: athrow
      // 04e: aload 3
      // 04f: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 052: ifeq 092
      // 055: goto 059
      // 058: athrow
      // 059: aload 0
      // 05a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaa Ljava/util/Map;
      // 05d: aload 3
      // 05e: bipush 1
      // 05f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 062: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 067: pop
      // 068: aload 0
      // 069: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbaa Ljava/util/concurrent/atomic/AtomicInteger;
      // 06c: invokedynamic applyAsInt ()Ljava/util/function/IntUnaryOperator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)I, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bab (I)I, (I)I ]
      // 071: invokevirtual java/util/concurrent/atomic/AtomicInteger.updateAndGet (Ljava/util/function/IntUnaryOperator;)I
      // 074: pop
      // 075: aload 0
      // 076: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaaab ()Ljava/lang/String;
      // 079: astore 7
      // 07b: new java/lang/StringBuilder
      // 07e: dup
      // 07f: invokespecial java/lang/StringBuilder.<init> ()V
      // 082: aload 7
      // 084: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 087: ldc_w "1"
      // 08a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 090: areturn
      // 091: athrow
      // 092: aload 0
      // 093: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbaa Ljava/util/concurrent/atomic/AtomicInteger;
      // 096: invokedynamic applyAsInt ()Ljava/util/function/IntUnaryOperator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)I, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaab (I)I, (I)I ]
      // 09b: invokevirtual java/util/concurrent/atomic/AtomicInteger.updateAndGet (Ljava/util/function/IntUnaryOperator;)I
      // 09e: pop
      // 09f: aload 0
      // 0a0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaa Ljava/util/Map;
      // 0a3: aload 3
      // 0a4: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a9: checkcast java/lang/Integer
      // 0ac: astore 5
      // 0ae: iload 2
      // 0af: ifne 0cf
      // 0b2: aload 5
      // 0b4: ifnonnull 0e9
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: iload 2
      // 0bd: ifne 0ea
      // 0c0: goto 0c4
      // 0c3: athrow
      // 0c4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbaa Ljava/util/concurrent/atomic/AtomicInteger;
      // 0c7: invokevirtual java/util/concurrent/atomic/AtomicInteger.incrementAndGet ()I
      // 0ca: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0cd: astore 5
      // 0cf: aload 0
      // 0d0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaa Ljava/util/Map;
      // 0d3: aload 3
      // 0d4: aload 5
      // 0d6: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0db: checkcast java/lang/Integer
      // 0de: astore 6
      // 0e0: aload 6
      // 0e2: ifnull 0e9
      // 0e5: aload 6
      // 0e7: astore 5
      // 0e9: aload 0
      // 0ea: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaaab ()Ljava/lang/String;
      // 0ed: aload 5
      // 0ef: astore 9
      // 0f1: astore 8
      // 0f3: new java/lang/StringBuilder
      // 0f6: dup
      // 0f7: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fa: aload 8
      // 0fc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0ff: aload 9
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 104: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 107: areturn
   }

   private CompletableFuture bbb(class_310 param1, String param2) {
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
      // 05: iload 3
      // 06: ifne 1d
      // 09: aload 2
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaaa (Ljava/lang/String;)Z
      // 0d: ifeq 1c
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: aload 1
      // 16: aload 2
      // 17: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba (Lnet/minecraft/class_310;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;
      // 1a: areturn
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: aload 2
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bb (Lnet/minecraft/class_310;Ljava/lang/String;)Lnet/minecraft/class_640;
      // 22: astore 4
      // 24: aload 4
      // 26: iload 3
      // 27: ifne 33
      // 2a: ifnull 3a
      // 2d: goto 31
      // 30: athrow
      // 31: aload 4
      // 33: invokevirtual net/minecraft/class_640.method_52810 ()Lnet/minecraft/class_8685;
      // 36: invokestatic java/util/concurrent/CompletableFuture.completedFuture (Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;
      // 39: areturn
      // 3a: aload 0
      // 3b: aload 1
      // 3c: aload 2
      // 3d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaaaa (Lnet/minecraft/class_310;Ljava/lang/String;)Lnet/minecraft/class_1657;
      // 40: astore 5
      // 42: aload 5
      // 44: ifnull 5e
      // 47: aload 1
      // 48: invokevirtual net/minecraft/class_310.method_1582 ()Lnet/minecraft/class_1071;
      // 4b: aload 5
      // 4d: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 50: invokevirtual net/minecraft/class_1071.method_52863 (Lcom/mojang/authlib/GameProfile;)Ljava/util/concurrent/CompletableFuture;
      // 53: aload 0
      // 54: invokedynamic apply (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbbb (Ljava/util/Optional;)Ljava/lang/Object;, (Ljava/util/Optional;)Ljava/lang/Object; ]
      // 59: invokevirtual java/util/concurrent/CompletableFuture.thenApply (Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;
      // 5c: areturn
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 2
      // 60: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbbbb (Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;
      // 63: aload 0
      // 64: aload 1
      // 65: invokedynamic apply (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab;Lnet/minecraft/class_310;)Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baab (Lnet/minecraft/class_310;Lcom/mojang/authlib/GameProfile;)Ljava/util/concurrent/CompletionStage;, (Lcom/mojang/authlib/GameProfile;)Ljava/util/concurrent/CompletionStage; ]
      // 6a: invokevirtual java/util/concurrent/CompletableFuture.thenCompose (Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;
      // 6d: areturn
   }

   private String aaaa(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aba Ljava/util/regex/Pattern;
      // 04: astore 3
      // 05: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 08: aload 0
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baab Ljava/util/Map;
      // 0c: astore 4
      // 0e: istore 2
      // 0f: aload 3
      // 10: ifnull 44
      // 13: aload 4
      // 15: invokeinterface java/util/Map.isEmpty ()Z 1
      // 1a: ifne 44
      // 1d: goto 21
      // 20: athrow
      // 21: aload 1
      // 22: iload 2
      // 23: ifne 49
      // 26: goto 2a
      // 29: athrow
      // 2a: ifnull 44
      // 2d: goto 31
      // 30: athrow
      // 31: aload 1
      // 32: iload 2
      // 33: ifne 4b
      // 36: goto 3a
      // 39: athrow
      // 3a: invokevirtual java/lang/String.isEmpty ()Z
      // 3d: ifeq 4a
      // 40: goto 44
      // 43: athrow
      // 44: aload 1
      // 45: goto 49
      // 48: athrow
      // 49: areturn
      // 4a: aload 1
      // 4b: iload 2
      // 4c: ifne ac
      // 4f: invokevirtual java/lang/String.length ()I
      // 52: ldc_w -1619051455
      // 55: ldc_w -795545603
      // 58: ldc_w -1841662133
      // 5b: ixor
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 5f: ldc2_w 6457217850443536353
      // 62: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 65: if_icmpgt a4
      // 68: goto 6c
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baba Ljava/util/Map;
      // 70: dup
      // 71: astore 5
      // 73: monitorenter
      // 74: aload 0
      // 75: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baba Ljava/util/Map;
      // 78: aload 1
      // 79: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 7e: checkcast java/lang/String
      // 81: astore 6
      // 83: iload 2
      // 84: ifne 99
      // 87: aload 6
      // 89: ifnull 96
      // 8c: goto 90
      // 8f: athrow
      // 90: aload 6
      // 92: aload 5
      // 94: monitorexit
      // 95: areturn
      // 96: aload 5
      // 98: monitorexit
      // 99: goto a4
      // 9c: astore 7
      // 9e: aload 5
      // a0: monitorexit
      // a1: aload 7
      // a3: athrow
      // a4: aload 0
      // a5: aload 1
      // a6: aload 3
      // a7: aload 4
      // a9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babab (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
      // ac: astore 5
      // ae: aload 1
      // af: iload 2
      // b0: ifne f5
      // b3: invokevirtual java/lang/String.length ()I
      // b6: ldc_w -1619051456
      // b9: ldc_w -795545603
      // bc: ldc_w -761714527
      // bf: ixor
      // c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // c3: ldc2_w 7519787770426201653
      // c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // c9: if_icmpgt f3
      // cc: goto d0
      // cf: athrow
      // d0: aload 0
      // d1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baba Ljava/util/Map;
      // d4: dup
      // d5: astore 6
      // d7: monitorenter
      // d8: aload 0
      // d9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baba Ljava/util/Map;
      // dc: aload 1
      // dd: aload 5
      // df: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // e4: pop
      // e5: aload 6
      // e7: monitorexit
      // e8: goto f3
      // eb: astore 8
      // ed: aload 6
      // ef: monitorexit
      // f0: aload 8
      // f2: athrow
      // f3: aload 5
      // f5: areturn
   }

   private void aaab(String param1) {
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
      // 06: ifne 30
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaba Ljava/util/Map;
      // 0c: invokeinterface java/util/Map.size ()I 1
      // 11: ldc_w -1619051453
      // 14: ldc_w 2068209634
      // 17: ldc_w -1826285415
      // 1a: ixor
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 1e: ldc2_w 685110810142117634
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 24: if_icmplt 44
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 30
      // 2f: athrow
      // 30: iload 2
      // 31: ifne 47
      // 34: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaba Ljava/util/Map;
      // 37: aload 1
      // 38: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 3d: ifeq 46
      // 40: goto 44
      // 43: athrow
      // 44: return
      // 45: athrow
      // 46: aload 0
      // 47: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaba Ljava/util/Map;
      // 4a: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 4f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 54: astore 3
      // 55: aload 3
      // 56: iload 2
      // 57: ifne 79
      // 5a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5f: ifeq 7a
      // 62: goto 66
      // 65: athrow
      // 66: aload 0
      // 67: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaba Ljava/util/Map;
      // 6a: aload 3
      // 6b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 70: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 75: goto 79
      // 78: athrow
      // 79: pop
      // 7a: return
   }

   private ab aaba(class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokeinterface net/minecraft/class_2561.method_10851 ()Lnet/minecraft/class_7417; 1
      // 06: astore 3
      // 07: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0a: bipush 0
      // 0b: istore 4
      // 0d: istore 2
      // 0e: aload 1
      // 0f: invokeinterface net/minecraft/class_2561.method_10866 ()Lnet/minecraft/class_2583; 1
      // 14: astore 5
      // 16: aload 3
      // 17: iload 2
      // 18: ifne 8b
      // 1b: instanceof net/minecraft/class_8828
      // 1e: ifeq 8a
      // 21: goto 25
      // 24: athrow
      // 25: aload 3
      // 26: iload 2
      // 27: ifne 8b
      // 2a: goto 2e
      // 2d: athrow
      // 2e: checkcast net/minecraft/class_8828
      // 31: astore 6
      // 33: aload 0
      // 34: aload 5
      // 36: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaaa (Lnet/minecraft/class_2583;)Z
      // 39: ifne 8a
      // 3c: aload 6
      // 3e: iload 2
      // 3f: ifne 8b
      // 42: goto 46
      // 45: athrow
      // 46: invokeinterface net/minecraft/class_8828.comp_737 ()Ljava/lang/String; 1
      // 4b: astore 7
      // 4d: aload 0
      // 4e: aload 7
      // 50: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaa (Ljava/lang/String;)Ljava/lang/String;
      // 53: astore 8
      // 55: aload 7
      // 57: ifnull 8a
      // 5a: aload 8
      // 5c: iload 2
      // 5d: ifne 6d
      // 60: goto 64
      // 63: athrow
      // 64: ifnull 8a
      // 67: goto 6b
      // 6a: athrow
      // 6b: aload 7
      // 6d: iload 2
      // 6e: ifne 83
      // 71: aload 8
      // 73: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 76: ifne 8a
      // 79: goto 7d
      // 7c: athrow
      // 7d: aload 8
      // 7f: goto 83
      // 82: athrow
      // 83: invokestatic net/minecraft/class_8828.method_54232 (Ljava/lang/String;)Lnet/minecraft/class_8828;
      // 86: astore 3
      // 87: bipush 1
      // 88: istore 4
      // 8a: aload 3
      // 8b: invokestatic net/minecraft/class_5250.method_43477 (Lnet/minecraft/class_7417;)Lnet/minecraft/class_5250;
      // 8e: aload 5
      // 90: invokevirtual net/minecraft/class_5250.method_10862 (Lnet/minecraft/class_2583;)Lnet/minecraft/class_5250;
      // 93: astore 6
      // 95: aload 1
      // 96: invokeinterface net/minecraft/class_2561.method_10855 ()Ljava/util/List; 1
      // 9b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // a0: astore 7
      // a2: aload 7
      // a4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // a9: ifeq dd
      // ac: aload 7
      // ae: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // b3: checkcast net/minecraft/class_2561
      // b6: astore 8
      // b8: aload 0
      // b9: aload 8
      // bb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaba (Lnet/minecraft/class_2561;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab;
      // be: iload 2
      // bf: ifne f2
      // c2: astore 9
      // c4: iload 2
      // c5: aload 6
      // c7: aload 9
      // c9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.b ()Lnet/minecraft/class_2561;
      // cc: invokevirtual net/minecraft/class_5250.method_10852 (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
      // cf: pop
      // d0: iload 4
      // d2: aload 9
      // d4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.aa ()Z
      // d7: ior
      // d8: istore 4
      // da: ifeq a2
      // dd: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab
      // e0: dup
      // e1: iload 4
      // e3: ifeq ec
      // e6: aload 6
      // e8: goto ed
      // eb: athrow
      // ec: aload 1
      // ed: iload 4
      // ef: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.<init> (Lnet/minecraft/class_2561;Z)V
      // f2: areturn
   }

   private List aabb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 1
      // 005: ifnonnull 00d
      // 008: invokestatic java/util/List.of ()Ljava/util/List;
      // 00b: areturn
      // 00c: athrow
      // 00d: new java/util/LinkedHashMap
      // 010: dup
      // 011: invokespecial java/util/LinkedHashMap.<init> ()V
      // 014: astore 3
      // 015: aload 1
      // 016: iload 2
      // 017: ifne 035
      // 01a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01d: ifnull 034
      // 020: goto 024
      // 023: athrow
      // 024: aload 0
      // 025: aload 3
      // 026: aload 1
      // 027: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 02a: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 02d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaab (Ljava/util/Map;Lcom/mojang/authlib/GameProfile;)V
      // 030: goto 034
      // 033: athrow
      // 034: aload 1
      // 035: iload 2
      // 036: ifne 083
      // 039: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 03c: ifnull 082
      // 03f: goto 043
      // 042: athrow
      // 043: aload 1
      // 044: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 047: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // 04a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 04f: astore 4
      // 051: aload 4
      // 053: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 058: ifeq 082
      // 05b: aload 4
      // 05d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 062: checkcast net/minecraft/class_1657
      // 065: iload 2
      // 066: ifne 0b4
      // 069: astore 5
      // 06b: aload 5
      // 06d: ifnull 07e
      // 070: aload 0
      // 071: aload 3
      // 072: aload 5
      // 074: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 077: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaab (Ljava/util/Map;Lcom/mojang/authlib/GameProfile;)V
      // 07a: goto 07e
      // 07d: athrow
      // 07e: iload 2
      // 07f: ifeq 051
      // 082: aload 1
      // 083: iload 2
      // 084: ifne 096
      // 087: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 08a: ifnull 0d0
      // 08d: goto 091
      // 090: athrow
      // 091: aload 1
      // 092: goto 096
      // 095: athrow
      // 096: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 099: invokevirtual net/minecraft/class_634.method_2880 ()Ljava/util/Collection;
      // 09c: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0a1: astore 4
      // 0a3: aload 4
      // 0a5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0aa: ifeq 0d0
      // 0ad: aload 4
      // 0af: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b4: checkcast net/minecraft/class_640
      // 0b7: astore 5
      // 0b9: aload 5
      // 0bb: ifnull 0cc
      // 0be: aload 0
      // 0bf: aload 3
      // 0c0: aload 5
      // 0c2: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
      // 0c5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaab (Ljava/util/Map;Lcom/mojang/authlib/GameProfile;)V
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: iload 2
      // 0cd: ifeq 0a3
      // 0d0: new java/util/ArrayList
      // 0d3: dup
      // 0d4: aload 3
      // 0d5: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 0da: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 0dd: astore 4
      // 0df: aload 1
      // 0e0: iload 2
      // 0e1: ifne 0f4
      // 0e4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e7: ifnonnull 0f3
      // 0ea: goto 0ee
      // 0ed: athrow
      // 0ee: aconst_null
      // 0ef: goto 0fa
      // 0f2: athrow
      // 0f3: aload 1
      // 0f4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0f7: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 0fa: astore 5
      // 0fc: aload 4
      // 0fe: aload 0
      // 0ff: aload 5
      // 101: invokedynamic compare (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab;Ljava/util/UUID;)Ljava/util/Comparator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)I, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbab (Ljava/util/UUID;Lcom/mojang/authlib/GameProfile;Lcom/mojang/authlib/GameProfile;)I, (Lcom/mojang/authlib/GameProfile;Lcom/mojang/authlib/GameProfile;)I ]
      // 106: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 10b: aload 4
      // 10d: areturn
   }

   @Override
   public void abaab() {
      this.aaaba.clear();
      this.abaa = "";
      this.aabab = "";
      this.baaba = "";
      this.abbbb = null;
      this.abbab = "";
      this.abaab = "";
      this.aab = 0L;
      this.bbbb = null;
      this.aabb = "";
      this.aabaa.clear();
      this.bbaa.set(0);
      this.abaaa = "";
      this.aabbaa();
   }

   public static void abaa() {
      aaaa = null;
   }

   private CompletableFuture abab(class_310 var1, String var2) {
      HttpRequest var3;
      try {
         var3 = HttpRequest.newBuilder(URI.create(var2))
            .timeout(Duration.ofSeconds(baaa(a(-1619051454, -39140797 ^ -481857016), 1712421568273561679L)))
            .header(bbba.abab(), aa.abab())
            .GET()
            .build();
      } catch (IllegalArgumentException var5) {
         return CompletableFuture.completedFuture(null);
      }

      return aaabb.sendAsync(var3, BodyHandlers.ofByteArray()).thenCompose(this::abbaba).exceptionally(baaaaaab::abaaa);
   }

   private void abba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: iload 1
      // 05: aload 0
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaaab ()Ljava/lang/String;
      // 09: astore 2
      // 0a: ifne 36
      // 0d: aload 2
      // 0e: aload 0
      // 0f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaaa Ljava/lang/String;
      // 12: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 15: ifne 3a
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaa Ljava/util/Map;
      // 20: invokeinterface java/util/Map.clear ()V 1
      // 25: aload 0
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbaa Ljava/util/concurrent/atomic/AtomicInteger;
      // 29: bipush 0
      // 2a: invokevirtual java/util/concurrent/atomic/AtomicInteger.set (I)V
      // 2d: aload 0
      // 2e: aload 2
      // 2f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaaa Ljava/lang/String;
      // 32: goto 36
      // 35: athrow
      // 36: aload 0
      // 37: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabbaa ()V
      // 3a: return
   }

   private boolean abbb(class_1011 param1) {
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
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual net/minecraft/class_1011.method_4307 ()I
      // 17: istore 3
      // 18: aload 1
      // 19: invokevirtual net/minecraft/class_1011.method_4323 ()I
      // 1c: istore 4
      // 1e: iload 3
      // 1f: iload 2
      // 20: ifne 43
      // 23: ldc_w -1619051443
      // 26: ldc_w 1202700112
      // 29: ldc_w 1545354319
      // 2c: ixor
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 30: ldc2_w 7169690871271229661
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 36: if_icmpne 8d
      // 39: goto 3d
      // 3c: athrow
      // 3d: iload 4
      // 3f: goto 43
      // 42: athrow
      // 43: iload 2
      // 44: ifne 8a
      // 47: ldc_w -1619051444
      // 4a: ldc_w 1202700112
      // 4d: ldc_w 987223849
      // 50: ixor
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 54: ldc2_w 1855697228337840982
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 5a: if_icmpeq 85
      // 5d: goto 61
      // 60: athrow
      // 61: iload 4
      // 63: iload 2
      // 64: ifne 8a
      // 67: goto 6b
      // 6a: athrow
      // 6b: ldc_w -1619051441
      // 6e: ldc_w 1202700112
      // 71: ldc_w -2009794927
      // 74: ixor
      // 75: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 78: ldc2_w 7169690871271229661
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 7e: if_icmpne 8d
      // 81: goto 85
      // 84: athrow
      // 85: bipush 1
      // 86: goto 8a
      // 89: athrow
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: ireturn
   }

   private static long baaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1619051442, 296731500 ^ -627019073)) & a(-1619051447, 296731500 ^ 1662988978);
      if (aaba[var3] == null) {
         aaba[var3] = aabbb[var3] ^ var1;
      }

      return aaba[var3];
   }

   private CompletionStage baab(class_310 var1, GameProfile var2) {
      try {
         if (var2 == null) {
            return CompletableFuture.completedFuture(null);
         }
      } catch (IllegalArgumentException var3) {
         throw var3;
      }

      return var1.method_1582().method_52863(var2).thenApply(this::baaab);
   }

   private CompletableFuture baba(GameProfile var1) {
      String var3 = baababbb.bb(var1)
         .toString()
         .replace(aabbaaaba.abba(ab(a(-1619051448, -1162026161 ^ -468037506), a(-1619051445, -1162026161 ^ 1797999640))), "");
      String var5 = ab.abab();
      HttpRequest var4 = HttpRequest.newBuilder(URI.create(var5 + var3))
         .timeout(Duration.ofSeconds(baaa(a(-1619051446, -1162026161 ^ -487228849), 217708951173032143L)))
         .header(bbba.abab(), aa.abab())
         .GET()
         .build();
      return aaabb.sendAsync(var4, BodyHandlers.ofString())
         .thenApply(baaaaaab::aaa)
         .exceptionally(baaaaaab::bbbba);
   }

   private void babb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 020
      // 009: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 00c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 00f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab;
      // 012: if_acmpeq 01f
      // 015: goto 019
      // 018: athrow
      // 019: aload 0
      // 01a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabbaa ()V
      // 01d: return
      // 01e: athrow
      // 01f: aload 0
      // 020: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abba ()V
      // 023: bipush 0
      // 024: istore 3
      // 025: aload 0
      // 026: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaa Ljava/util/Map;
      // 029: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 02e: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 033: astore 4
      // 035: aload 4
      // 037: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03c: ifeq 07f
      // 03f: aload 4
      // 041: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 046: checkcast java/lang/Integer
      // 049: astore 5
      // 04b: iload 2
      // 04c: ifne 0b9
      // 04f: aload 5
      // 051: iload 2
      // 052: ifne 062
      // 055: goto 059
      // 058: athrow
      // 059: ifnull 07b
      // 05c: goto 060
      // 05f: athrow
      // 060: aload 5
      // 062: iload 2
      // 063: ifne 077
      // 066: invokevirtual java/lang/Integer.intValue ()I
      // 069: iload 3
      // 06a: if_icmple 07b
      // 06d: goto 071
      // 070: athrow
      // 071: aload 5
      // 073: goto 077
      // 076: athrow
      // 077: invokevirtual java/lang/Integer.intValue ()I
      // 07a: istore 3
      // 07b: iload 2
      // 07c: ifeq 035
      // 07f: aload 1
      // 080: iload 2
      // 081: ifne 08c
      // 084: ifnull 0b9
      // 087: goto 08b
      // 08a: athrow
      // 08b: aload 1
      // 08c: iload 2
      // 08d: ifne 0b2
      // 090: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 093: ifnull 0b9
      // 096: goto 09a
      // 099: athrow
      // 09a: aload 0
      // 09b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaa Ljava/util/Map;
      // 09e: aload 1
      // 09f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a2: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 0a5: bipush 1
      // 0a6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a9: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ae: goto 0b2
      // 0b1: athrow
      // 0b2: pop
      // 0b3: iload 3
      // 0b4: bipush 1
      // 0b5: invokestatic java/lang/Math.max (II)I
      // 0b8: istore 3
      // 0b9: aload 0
      // 0ba: aload 1
      // 0bb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabb (Lnet/minecraft/class_310;)Ljava/util/List;
      // 0be: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c3: astore 4
      // 0c5: aload 4
      // 0c7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0cc: ifeq 15b
      // 0cf: aload 4
      // 0d1: iload 2
      // 0d2: ifne 0c7
      // 0d5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0da: checkcast com/mojang/authlib/GameProfile
      // 0dd: astore 5
      // 0df: aload 0
      // 0e0: aload 5
      // 0e2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbab (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 0e5: astore 6
      // 0e7: aload 6
      // 0e9: ifnull 0c5
      // 0ec: aload 1
      // 0ed: iload 2
      // 0ee: ifne 0f9
      // 0f1: ifnull 12a
      // 0f4: goto 0f8
      // 0f7: athrow
      // 0f8: aload 1
      // 0f9: iload 2
      // 0fa: ifne 10c
      // 0fd: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 100: ifnull 12a
      // 103: goto 107
      // 106: athrow
      // 107: aload 1
      // 108: goto 10c
      // 10b: athrow
      // 10c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10f: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 112: aload 6
      // 114: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 117: iload 2
      // 118: ifne 13d
      // 11b: ifeq 12a
      // 11e: goto 122
      // 121: athrow
      // 122: iload 2
      // 123: ifeq 0c5
      // 126: goto 12a
      // 129: athrow
      // 12a: aload 0
      // 12b: iload 2
      // 12c: ifne 156
      // 12f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaa Ljava/util/Map;
      // 132: aload 6
      // 134: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 139: goto 13d
      // 13c: athrow
      // 13d: ifne 157
      // 140: aload 0
      // 141: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaa Ljava/util/Map;
      // 144: aload 6
      // 146: iinc 3 1
      // 149: iload 3
      // 14a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 14d: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 152: goto 156
      // 155: athrow
      // 156: pop
      // 157: iload 2
      // 158: ifeq 0c5
      // 15b: iload 3
      // 15c: istore 4
      // 15e: aload 0
      // 15f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbaa Ljava/util/concurrent/atomic/AtomicInteger;
      // 162: iload 4
      // 164: invokedynamic applyAsInt (I)Ljava/util/function/IntUnaryOperator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)I, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ababb (II)I, (I)I ]
      // 169: invokevirtual java/util/concurrent/atomic/AtomicInteger.updateAndGet (Ljava/util/function/IntUnaryOperator;)I
      // 16c: pop
      // 16d: aload 0
      // 16e: aload 1
      // 16f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabab (Lnet/minecraft/class_310;)V
      // 172: return
   }

   private UUID bbab(GameProfile param1) {
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
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: areturn
      // 12: athrow
      // 13: aload 1
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 17: astore 3
      // 18: aload 3
      // 19: iload 2
      // 1a: ifne 25
      // 1d: ifnull 26
      // 20: goto 24
      // 23: athrow
      // 24: aload 3
      // 25: areturn
      // 26: aload 1
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 2a: astore 4
      // 2c: aload 4
      // 2e: iload 2
      // 2f: ifne 3b
      // 32: ifnull 49
      // 35: goto 39
      // 38: athrow
      // 39: aload 4
      // 3b: iload 2
      // 3c: ifne 56
      // 3f: invokevirtual java/lang/String.isBlank ()Z
      // 42: ifeq 4e
      // 45: goto 49
      // 48: athrow
      // 49: aconst_null
      // 4a: goto 5f
      // 4d: athrow
      // 4e: aload 4
      // 50: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 53: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 56: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 59: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 5c: invokestatic java/util/UUID.nameUUIDFromBytes ([B)Ljava/util/UUID;
      // 5f: areturn
   }

   public class_2561 bbba(class_2561 param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babbaab ()Z
      // 08: ifeq 1b
      // 0b: aload 1
      // 0c: iload 2
      // 0d: ifne 2d
      // 10: goto 14
      // 13: athrow
      // 14: ifnonnull 1e
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 1
      // 1c: areturn
      // 1d: athrow
      // 1e: aload 0
      // 1f: iload 2
      // 20: ifne 3b
      // 23: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 29: goto 2d
      // 2c: athrow
      // 2d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab;
      // 30: if_acmpne 3a
      // 33: aload 0
      // 34: aload 1
      // 35: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaabb (Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 38: areturn
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaba (Lnet/minecraft/class_2561;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab;
      // 3f: astore 3
      // 40: aload 3
      // 41: iload 2
      // 42: ifne 54
      // 45: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.aa ()Z
      // 48: ifeq 5a
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 3
      // 50: goto 54
      // 53: athrow
      // 54: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.b ()Lnet/minecraft/class_2561;
      // 57: goto 5b
      // 5a: aload 1
      // 5b: areturn
   }

   private Object bbbb(Optional var1) {
      return this.baaab(var1);
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
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 2
      // 007: istore 1
      // 008: aload 2
      // 009: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 00c: ifnonnull 011
      // 00f: return
      // 010: athrow
      // 011: aload 0
      // 012: aload 2
      // 013: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aababa (Lnet/minecraft/class_310;)Ljava/lang/String;
      // 016: astore 3
      // 017: iload 1
      // 018: aload 0
      // 019: aload 3
      // 01a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbab Ljava/lang/String;
      // 01d: aload 0
      // 01e: aload 2
      // 01f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babb (Lnet/minecraft/class_310;)V
      // 022: aload 0
      // 023: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbbab ()Ljava/lang/String;
      // 026: astore 4
      // 028: aload 4
      // 02a: astore 5
      // 02c: ifne 087
      // 02f: aload 0
      // 030: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 033: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 036: checkcast java/lang/Boolean
      // 039: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03c: ifeq 07f
      // 03f: goto 043
      // 042: athrow
      // 043: aload 5
      // 045: iload 1
      // 046: ifne 05c
      // 049: goto 04d
      // 04c: athrow
      // 04d: invokevirtual java/lang/String.isBlank ()Z
      // 050: ifne 07f
      // 053: goto 057
      // 056: athrow
      // 057: aload 3
      // 058: goto 05c
      // 05b: athrow
      // 05c: iload 1
      // 05d: ifne 070
      // 060: invokevirtual java/lang/String.isBlank ()Z
      // 063: ifne 07f
      // 066: goto 06a
      // 069: athrow
      // 06a: aload 5
      // 06c: goto 070
      // 06f: athrow
      // 070: iload 1
      // 071: ifne 08a
      // 074: aload 3
      // 075: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 078: ifeq 088
      // 07b: goto 07f
      // 07e: athrow
      // 07f: aload 0
      // 080: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbbaa ()V
      // 083: goto 087
      // 086: athrow
      // 087: return
      // 088: aload 5
      // 08a: aload 0
      // 08b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaab Ljava/lang/String;
      // 08e: iload 1
      // 08f: ifne 0ce
      // 092: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 095: ifeq 0c8
      // 098: goto 09c
      // 09b: athrow
      // 09c: invokestatic java/lang/System.currentTimeMillis ()J
      // 09f: aload 0
      // 0a0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aab J
      // 0a3: lsub
      // 0a4: ldc_w -1619051403
      // 0a7: ldc_w -2121311997
      // 0aa: ldc_w 1963883162
      // 0ad: ixor
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0b1: ldc2_w 7513745371510763484
      // 0b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaa (IJ)J
      // 0b7: lcmp
      // 0b8: iload 1
      // 0b9: ifne 0d1
      // 0bc: goto 0c0
      // 0bf: athrow
      // 0c0: ifge 0c8
      // 0c3: goto 0c7
      // 0c6: athrow
      // 0c7: return
      // 0c8: aload 5
      // 0ca: aload 0
      // 0cb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaa Ljava/lang/String;
      // 0ce: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0d1: iload 1
      // 0d2: ifne 0ec
      // 0d5: ifne 0ef
      // 0d8: goto 0dc
      // 0db: athrow
      // 0dc: aload 0
      // 0dd: iload 1
      // 0de: ifne 101
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbab Z
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: ifeq 0f0
      // 0ef: return
      // 0f0: aload 0
      // 0f1: aload 5
      // 0f3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abaa Ljava/lang/String;
      // 0f6: aload 0
      // 0f7: aconst_null
      // 0f8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaa Ljava/lang/Object;
      // 0fb: aload 0
      // 0fc: bipush 1
      // 0fd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbab Z
      // 100: aload 0
      // 101: aload 2
      // 102: aload 5
      // 104: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbb (Lnet/minecraft/class_310;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;
      // 107: aload 0
      // 108: aload 2
      // 109: aload 5
      // 10b: invokedynamic accept (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab;Lnet/minecraft/class_310;Ljava/lang/String;)Ljava/util/function/BiConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbaba (Lnet/minecraft/class_310;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V, (Ljava/lang/Object;Ljava/lang/Throwable;)V ]
      // 110: invokevirtual java/util/concurrent/CompletableFuture.whenComplete (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
      // 113: pop
      // 114: return
   }

   private boolean aaaaa(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 26
      // 15: invokevirtual java/lang/String.isBlank ()Z
      // 18: ifeq 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 26: invokestatic java/net/URI.create (Ljava/lang/String;)Ljava/net/URI;
      // 29: astore 3
      // 2a: aload 3
      // 2b: invokevirtual java/net/URI.getScheme ()Ljava/lang/String;
      // 2e: astore 4
      // 30: ldc_w -1619051404
      // 33: ldc_w -772223887
      // 36: ldc_w 855523519
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 3d: ldc_w -1619051401
      // 40: ldc_w -772223887
      // 43: ldc_w -544766854
      // 46: ixor
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 4d: iload 2
      // 4e: ifne 9c
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 54: aload 4
      // 56: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 59: ifne 94
      // 5c: goto 60
      // 5f: athrow
      // 60: ldc_w -1619051402
      // 63: ldc_w -772223887
      // 66: ldc_w -708130086
      // 69: ixor
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 6d: ldc_w -1619051407
      // 70: ldc_w -772223887
      // 73: ldc_w 1604042088
      // 76: ixor
      // 77: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 7d: iload 2
      // 7e: ifne 9c
      // 81: goto 85
      // 84: athrow
      // 85: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 88: aload 4
      // 8a: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 8d: ifeq a4
      // 90: goto 94
      // 93: athrow
      // 94: aload 3
      // 95: invokevirtual java/net/URI.getHost ()Ljava/lang/String;
      // 98: goto 9c
      // 9b: athrow
      // 9c: ifnull a4
      // 9f: bipush 1
      // a0: goto a5
      // a3: athrow
      // a4: bipush 0
      // a5: ireturn
      // a6: astore 3
      // a7: bipush 0
      // a8: ireturn
   }

   public boolean aaaab() {
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
      // 06: ifne 1d
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab;
      // 12: if_acmpne 1c
      // 15: goto 19
      // 18: athrow
      // 19: bipush 1
      // 1a: ireturn
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbab Ljava/lang/String;
      // 20: invokevirtual java/lang/String.isBlank ()Z
      // 23: iload 1
      // 24: ifne 2f
      // 27: ifne 32
      // 2a: goto 2e
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   private class_2561 aaaba(class_2561 param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 3c
      // 0b: ifnull 3b
      // 0e: goto 12
      // 11: athrow
      // 12: aload 2
      // 13: iload 4
      // 15: ifne 24
      // 18: goto 1c
      // 1b: athrow
      // 1c: ifnull 3b
      // 1f: goto 23
      // 22: athrow
      // 23: aload 2
      // 24: iload 4
      // 26: ifne 38
      // 29: invokevirtual java/lang/String.isBlank ()Z
      // 2c: ifne 3b
      // 2f: goto 33
      // 32: athrow
      // 33: aload 3
      // 34: goto 38
      // 37: athrow
      // 38: ifnonnull 3d
      // 3b: aload 1
      // 3c: areturn
      // 3d: aload 0
      // 3e: aload 1
      // 3f: aload 2
      // 40: aload 3
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaaa (Lnet/minecraft/class_2561;Ljava/lang/String;Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab;
      // 44: astore 5
      // 46: aload 5
      // 48: iload 4
      // 4a: ifne 5d
      // 4d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.aa ()Z
      // 50: ifeq 61
      // 53: goto 57
      // 56: athrow
      // 57: aload 5
      // 59: goto 5d
      // 5c: athrow
      // 5d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.b ()Lnet/minecraft/class_2561;
      // 60: areturn
      // 61: aload 3
      // 62: invokestatic net/minecraft/class_2561.method_43470 (Ljava/lang/String;)Lnet/minecraft/class_5250;
      // 65: aload 1
      // 66: invokeinterface net/minecraft/class_2561.method_10866 ()Lnet/minecraft/class_2583; 1
      // 6b: invokevirtual net/minecraft/class_5250.method_10862 (Lnet/minecraft/class_2583;)Lnet/minecraft/class_5250;
      // 6e: areturn
   }

   private boolean aaabb() {
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
      // 06: ifne 24
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab;
      // 12: if_acmpeq 39
      // 15: goto 19
      // 18: athrow
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 20: goto 24
      // 23: athrow
      // 24: checkcast java/lang/Boolean
      // 27: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2a: iload 1
      // 2b: ifne 36
      // 2e: ifeq 39
      // 31: goto 35
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   private void aabab(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/ArrayList
      // 003: dup
      // 004: invokespecial java/util/ArrayList.<init> ()V
      // 007: astore 3
      // 008: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 00b: new java/util/LinkedHashMap
      // 00e: dup
      // 00f: invokespecial java/util/LinkedHashMap.<init> ()V
      // 012: astore 4
      // 014: istore 2
      // 015: new java/lang/StringBuilder
      // 018: dup
      // 019: invokespecial java/lang/StringBuilder.<init> ()V
      // 01c: astore 5
      // 01e: aload 0
      // 01f: aload 1
      // 020: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabb (Lnet/minecraft/class_310;)Ljava/util/List;
      // 023: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 028: astore 6
      // 02a: aload 6
      // 02c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 031: ifeq 0d1
      // 034: aload 6
      // 036: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03b: checkcast com/mojang/authlib/GameProfile
      // 03e: iload 2
      // 03f: ifne 0f5
      // 042: astore 7
      // 044: aload 7
      // 046: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 049: astore 8
      // 04b: aload 8
      // 04d: iload 2
      // 04e: ifne 05a
      // 051: ifnull 02a
      // 054: goto 058
      // 057: athrow
      // 058: aload 8
      // 05a: iload 2
      // 05b: ifne 076
      // 05e: invokevirtual java/lang/String.isBlank ()Z
      // 061: ifeq 070
      // 064: goto 068
      // 067: athrow
      // 068: iload 2
      // 069: ifeq 02a
      // 06c: goto 070
      // 06f: athrow
      // 070: aload 0
      // 071: aload 7
      // 073: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bba (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 076: astore 9
      // 078: aload 9
      // 07a: iload 2
      // 07b: ifne 087
      // 07e: ifnull 02a
      // 081: goto 085
      // 084: athrow
      // 085: aload 9
      // 087: iload 2
      // 088: ifne 097
      // 08b: invokevirtual java/lang/String.isBlank ()Z
      // 08e: ifne 02a
      // 091: goto 095
      // 094: athrow
      // 095: aload 8
      // 097: iload 2
      // 098: ifne 0ba
      // 09b: aload 9
      // 09d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a0: ifeq 0af
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: iload 2
      // 0a8: ifeq 02a
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: aload 4
      // 0b1: aload 8
      // 0b3: aload 9
      // 0b5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ba: pop
      // 0bb: iload 2
      // 0bc: aload 3
      // 0bd: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba
      // 0c0: dup
      // 0c1: aload 8
      // 0c3: aload 9
      // 0c5: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba.<init> (Ljava/lang/String;Ljava/lang/String;)V
      // 0c8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0cd: pop
      // 0ce: ifeq 02a
      // 0d1: aload 3
      // 0d2: invokedynamic compare ()Ljava/util/Comparator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)I, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaabbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba;)I, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba;)I ]
      // 0d7: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 0dc: aload 3
      // 0dd: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e2: astore 6
      // 0e4: aload 6
      // 0e6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0eb: ifeq 121
      // 0ee: aload 6
      // 0f0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f5: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba
      // 0f8: astore 7
      // 0fa: aload 5
      // 0fc: aload 7
      // 0fe: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba.aa ()Ljava/lang/String;
      // 101: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 104: bipush 0
      // 105: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 108: iload 2
      // 109: ifne 123
      // 10c: aload 7
      // 10e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba.a ()Ljava/lang/String;
      // 111: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 114: bipush 1
      // 115: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 118: pop
      // 119: iload 2
      // 11a: ifeq 0e4
      // 11d: goto 121
      // 120: athrow
      // 121: aload 5
      // 123: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 126: astore 6
      // 128: iload 2
      // 129: ifne 156
      // 12c: aload 6
      // 12e: aload 0
      // 12f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaab Ljava/lang/String;
      // 132: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 135: ifeq 13e
      // 138: goto 13c
      // 13b: athrow
      // 13c: return
      // 13d: athrow
      // 13e: aload 0
      // 13f: aload 6
      // 141: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaab Ljava/lang/String;
      // 144: aload 0
      // 145: aload 4
      // 147: invokestatic java/util/Map.copyOf (Ljava/util/Map;)Ljava/util/Map;
      // 14a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baab Ljava/util/Map;
      // 14d: aload 0
      // 14e: aload 0
      // 14f: aload 3
      // 150: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbbb (Ljava/util/List;)Ljava/util/regex/Pattern;
      // 153: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aba Ljava/util/regex/Pattern;
      // 156: aload 0
      // 157: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baba Ljava/util/Map;
      // 15a: dup
      // 15b: astore 7
      // 15d: monitorenter
      // 15e: aload 0
      // 15f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baba Ljava/util/Map;
      // 162: invokeinterface java/util/Map.clear ()V 1
      // 167: aload 7
      // 169: monitorexit
      // 16a: goto 175
      // 16d: astore 10
      // 16f: aload 7
      // 171: monitorexit
      // 172: aload 10
      // 174: athrow
      // 175: return
   }

   private boolean aabba() {
      try {
         if (this.ba.abbb() == ababaab.a) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw var1;
      }

      return false;
   }

   public baaaaaab() {
      int var1 = -2085827890;
      super(
         aabbaaaba.aaab(ab(a(-1619051471, var1 ^ 591295786), a(-1619051472, var1 ^ -2135680335))),
         bbaabbba.bab,
         aabbaaaba.aaab(ab(a(-1619051469, var1 ^ -2086224205), a(-1619051470, var1 ^ 1343236433)))
      );
      this.ba = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(ab(a(-1619051459, var1 ^ 781141707), a(-1619051460, var1 ^ 1783662018))),
            ababaab.class,
            ababaab.ab
         )
      );
      this.bb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(ab(a(-1619051457, var1 ^ -385563913), a(-1619051458, var1 ^ 1365566957))),
            abbaabbba.class,
            abbaabbba.ab
         )
      );
      this.baaaa = (ababbbba)this.abbbaaa(
         new ababbbba(
            aabbaaaba.aaab(ab(a(-1619051463, var1 ^ 1272380514), a(-1619051464, var1 ^ -2116434319))),
            aabbaaaba.aaab(ab(a(-1619051461, var1 ^ 1440528549), a(-1619051462, var1 ^ -1342452437)))
         )
      );
      this.aabba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(ab(a(-1619051483, var1 ^ 443365394), a(-1619051484, var1 ^ 1110387065))), false
         )
      );
      this.bab = (ababbbba)this.abbbaaa(
         new ababbbba(
            aabbaaaba.aaab(ab(a(-1619051481, var1 ^ -1326125865), a(-1619051482, var1 ^ 828508438))), ""
         )
      );
      this.baaa = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(ab(a(-1619051487, var1 ^ -1053002478), a(-1619051488, var1 ^ 579011078))),
            babbabba.class,
            babbabba.aba
         )
      );
      this.abb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(ab(a(-1619051485, var1 ^ -789263953), a(-1619051486, var1 ^ -1172663136))),
            ababbbaaa.class,
            ababbbaaa.aaaa
         )
      );
      this.ababb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(ab(a(-1619051475, var1 ^ 806639914), a(-1619051476, var1 ^ 468263436))), true
         )
      );
      this.baaab = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(ab(a(-1619051473, var1 ^ 31395901), a(-1619051474, var1 ^ -2117566354))),
            aabbaabba.class,
            aabbaabba.a
         )
      );
      this.babb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(ab(a(-1619051479, var1 ^ 57631058), a(-1619051480, var1 ^ -1326885010))),
            babbaaa.class,
            babbaaa.ba
         )
      );
      this.bba = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(ab(a(-1619051477, var1 ^ 1870388294), a(-1619051478, var1 ^ 1851116733))),
            babbb.class,
            babbb.a
         )
      );
      this.aaaab = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(ab(a(-1619051307, var1 ^ 342893785), a(-1619051308, var1 ^ -537699856))),
            aabbbbbaa.class,
            aabbbbbaa.aa
         )
      );
      this.aaaba = new ConcurrentHashMap();
      this.aabaa = new ConcurrentHashMap();
      this.bbaa = new AtomicInteger();
      this.baba = new aabaabaaa(this, abbabb(a(-1619051305, var1 ^ -722066182), 7454701130574362072L), 0.75F, true);
      this.abaa = "";
      this.abaab = "";
      this.aabab = "";
      this.baaba = "";
      this.abbab = "";
      this.abaaa = "";
      this.aaab = "";
      this.baab = Map.of();
      this.aabb = "";
      this.bb.babb(this::aabba);
      this.aabba.babb(this::babba);
      this.bab.babb(this::aaabb);
      this.abb.babb(this::aba);
      this.ababb.babb(this::bbaab);
      this.baaab.babb(this::aa);
      this.babb.babb(this::aaabba);
      this.bba.babb(this::baabb);
      this.aaaab.babb(this::babaa);
      aaaa = this;
   }

   private static Object abaaa(Throwable var0) {
      return null;
   }

   private static int ababb(int var0, int var1) {
      return Math.max(var1, var0);
   }

   private CompletionStage abbaa(GameProfile var1) {
      try {
         if (var1 == null) {
            return CompletableFuture.completedFuture(null);
         }
      } catch (IllegalArgumentException var2) {
         throw var2;
      }

      return this.baba(var1);
   }

   private int abbab(UUID param1, GameProfile param2, GameProfile param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 2
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbab (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 08: astore 5
      // 0a: aload 0
      // 0b: aload 3
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbab (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 0f: astore 6
      // 11: istore 4
      // 13: aload 1
      // 14: iload 4
      // 16: ifne 21
      // 19: ifnull 36
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 1
      // 21: aload 5
      // 23: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 26: iload 4
      // 28: ifne 33
      // 2b: ifeq 36
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: istore 7
      // 39: aload 1
      // 3a: iload 4
      // 3c: ifne 47
      // 3f: ifnull 5c
      // 42: goto 46
      // 45: athrow
      // 46: aload 1
      // 47: aload 6
      // 49: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 4c: iload 4
      // 4e: ifne 59
      // 51: ifeq 5c
      // 54: goto 58
      // 57: athrow
      // 58: bipush 1
      // 59: goto 5d
      // 5c: bipush 0
      // 5d: istore 8
      // 5f: iload 7
      // 61: iload 4
      // 63: ifne 92
      // 66: iload 8
      // 68: if_icmpeq 87
      // 6b: goto 6f
      // 6e: athrow
      // 6f: iload 7
      // 71: iload 4
      // 73: ifne 82
      // 76: goto 7a
      // 79: athrow
      // 7a: ifeq 85
      // 7d: goto 81
      // 80: athrow
      // 81: bipush -1
      // 82: goto 86
      // 85: bipush 1
      // 86: ireturn
      // 87: aload 2
      // 88: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 8b: aload 3
      // 8c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 8f: invokevirtual java/lang/String.compareToIgnoreCase (Ljava/lang/String;)I
      // 92: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private Object abbba(String var1, byte[] var2) {
      int var15 = 1795236254;
      int var10000 = baaabbaa.bba;
      class_310 var4 = class_310.method_1551();
      int var3 = var10000;

      label65: {
         label60: {
            try {
               var24 = var4;
               if (var3 != 0) {
                  break label60;
               }

               if (var4 == null) {
                  break label65;
               }
            } catch (Throwable var22) {
               throw var22;
            }

            var24 = var4;
         }

         try {
            if (var24.method_1531() == null) {
               break label65;
            }
         } catch (Throwable var21) {
            throw var21;
         }

         class_1011 var5;
         try (ByteArrayInputStream var6 = new ByteArrayInputStream(var2)) {
            var5 = class_1011.method_4309(var6);
         } catch (IOException var19) {
            return null;
         }

         try {
            if (!this.abbb(var5)) {
               var5.close();
               return null;
            }
         } catch (Throwable var20) {
            throw var20;
         }

         String var25 = aabbaaaba.abba(ab(a(-1619051306, var15 ^ -956486403), a(-1619051311, var15 ^ -42891531)));
         String var10001 = aabbaaaba.abba(ab(a(-1619051312, var15 ^ -1185011440), a(-1619051309, var15 ^ -1749945399)));
         String var10002 = Integer.toUnsignedString(var1.hashCode());
         String var10003 = aabbaaaba.abba(ab(a(-1619051310, var15 ^ -1671301605), a(-1619051299, var15 ^ -1532865195)));
         int var10004 = var5.method_4307();
         String var10005 = aabbaaaba.abba(ab(a(-1619051300, var15 ^ 1652108015), a(-1619051297, var15 ^ 787453377)));
         int var14 = var5.method_4323();
         String var13 = var10005;
         int var12 = var10004;
         String var11 = var10003;
         String var10 = var10002;
         String var9 = var10001;
         class_2960 var23 = class_2960.method_60655(var25, var9 + var10 + var11 + var12 + var13 + var14);
         var4.method_1531().method_4616(var23, new class_1043(var23::toString, var5));
         class_10726 var7 = new class_10726(var23, var23);
         return new class_8685(var7, null, null, class_7920.field_41123, false);
      }

      try {
         return null;
      } catch (Throwable var17) {
         throw var17;
      }
   }

   private Pattern abbbb(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 500591396
      // 003: istore 11
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 1
      // 00a: invokeinterface java/util/List.isEmpty ()Z 1
      // 00f: ifeq 015
      // 012: aconst_null
      // 013: areturn
      // 014: athrow
      // 015: new java/lang/StringBuilder
      // 018: dup
      // 019: invokespecial java/lang/StringBuilder.<init> ()V
      // 01c: astore 3
      // 01d: aload 1
      // 01e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 023: astore 4
      // 025: aload 4
      // 027: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 02c: ifeq 076
      // 02f: aload 4
      // 031: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 036: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba
      // 039: astore 5
      // 03b: iload 2
      // 03c: ifne 072
      // 03f: aload 3
      // 040: invokevirtual java/lang/StringBuilder.length ()I
      // 043: ifle 065
      // 046: goto 04a
      // 049: athrow
      // 04a: aload 3
      // 04b: ldc_w -1619051298
      // 04e: iload 11
      // 050: ldc_w 2094854725
      // 053: ixor
      // 054: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 057: ldc2_w 1991016323687156738
      // 05a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 05d: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 060: pop
      // 061: goto 065
      // 064: athrow
      // 065: aload 3
      // 066: aload 5
      // 068: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbba.aa ()Ljava/lang/String;
      // 06b: invokestatic java/util/regex/Pattern.quote (Ljava/lang/String;)Ljava/lang/String;
      // 06e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 071: pop
      // 072: iload 2
      // 073: ifeq 025
      // 076: ldc_w -1619051303
      // 079: iload 11
      // 07b: ldc_w -20205572
      // 07e: ixor
      // 07f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 082: ldc_w -1619051304
      // 085: iload 11
      // 087: ldc_w -738848409
      // 08a: ixor
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 08e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 091: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 094: ldc_w -1619051301
      // 097: iload 11
      // 099: ldc_w 1044598379
      // 09c: ixor
      // 09d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0a0: ldc_w -1619051302
      // 0a3: iload 11
      // 0a5: ldc_w -1756831047
      // 0a8: ixor
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 0af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0b2: aload 3
      // 0b3: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 0b6: ldc_w -1619051323
      // 0b9: iload 11
      // 0bb: ldc_w 1502250969
      // 0be: ixor
      // 0bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0c2: ldc_w -1619051324
      // 0c5: iload 11
      // 0c7: ldc_w -1192234072
      // 0ca: ixor
      // 0cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 0d1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d4: ldc_w -1619051321
      // 0d7: iload 11
      // 0d9: ldc_w -2032166122
      // 0dc: ixor
      // 0dd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0e0: ldc_w -1619051322
      // 0e3: iload 11
      // 0e5: ldc_w -407378772
      // 0e8: ixor
      // 0e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 0ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0f2: astore 10
      // 0f4: astore 9
      // 0f6: astore 8
      // 0f8: astore 7
      // 0fa: astore 6
      // 0fc: new java/lang/StringBuilder
      // 0ff: dup
      // 100: invokespecial java/lang/StringBuilder.<init> ()V
      // 103: aload 6
      // 105: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 108: aload 7
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10d: aload 8
      // 10f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 112: aload 9
      // 114: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 117: aload 10
      // 119: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 11c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 11f: invokestatic java/util/regex/Pattern.compile (Ljava/lang/String;)Ljava/util/regex/Pattern;
      // 122: areturn
   }

   private boolean baaaa(class_2583 var1) {
      int var2 = baaabbaa.bba;

      class_2583 var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label27;
            }

            if (var1 == null) {
               return false;
            }
         } catch (IllegalArgumentException var4) {
            throw var4;
         }

         var10000 = var1;
      }

      try {
         if (var10000.method_27708() != null) {
            return true;
         }
      } catch (IllegalArgumentException var3) {
         throw var3;
      }

      return false;
   }

   private Object baaab(Object var1) {
      Object var3 = var1;
      int var2 = baaabbaa.bba;

      label27: {
         try {
            if (var2 != 0) {
               return var3;
            }

            if (var3 instanceof Optional) {
               break label27;
            }
         } catch (IllegalArgumentException var5) {
            throw var5;
         }

         return var1;
      }

      Optional var4 = (Optional)var1;
      return var4.orElse(null);
   }

   private ab baaba(class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: invokeinterface net/minecraft/class_2561.method_10851 ()Lnet/minecraft/class_7417; 1
      // 09: astore 3
      // 0a: bipush 0
      // 0b: istore 4
      // 0d: aload 1
      // 0e: invokeinterface net/minecraft/class_2561.method_10866 ()Lnet/minecraft/class_2583; 1
      // 13: astore 5
      // 15: istore 2
      // 16: aload 3
      // 17: iload 2
      // 18: ifne 69
      // 1b: instanceof net/minecraft/class_8828
      // 1e: ifeq 68
      // 21: goto 25
      // 24: athrow
      // 25: aload 3
      // 26: iload 2
      // 27: ifne 69
      // 2a: goto 2e
      // 2d: athrow
      // 2e: checkcast net/minecraft/class_8828
      // 31: astore 6
      // 33: aload 0
      // 34: aload 5
      // 36: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaaa (Lnet/minecraft/class_2583;)Z
      // 39: ifne 68
      // 3c: aload 6
      // 3e: iload 2
      // 3f: ifne 69
      // 42: goto 46
      // 45: athrow
      // 46: invokeinterface net/minecraft/class_8828.comp_737 ()Ljava/lang/String; 1
      // 4b: astore 7
      // 4d: aload 0
      // 4e: aload 7
      // 50: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaabab (Ljava/lang/String;)Ljava/lang/String;
      // 53: astore 8
      // 55: aload 7
      // 57: aload 8
      // 59: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 5c: ifne 68
      // 5f: aload 8
      // 61: invokestatic net/minecraft/class_8828.method_54232 (Ljava/lang/String;)Lnet/minecraft/class_8828;
      // 64: astore 3
      // 65: bipush 1
      // 66: istore 4
      // 68: aload 3
      // 69: invokestatic net/minecraft/class_5250.method_43477 (Lnet/minecraft/class_7417;)Lnet/minecraft/class_5250;
      // 6c: aload 5
      // 6e: invokevirtual net/minecraft/class_5250.method_10862 (Lnet/minecraft/class_2583;)Lnet/minecraft/class_5250;
      // 71: astore 6
      // 73: aload 1
      // 74: invokeinterface net/minecraft/class_2561.method_10855 ()Ljava/util/List; 1
      // 79: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 7e: astore 7
      // 80: aload 7
      // 82: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 87: ifeq bb
      // 8a: aload 7
      // 8c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 91: checkcast net/minecraft/class_2561
      // 94: astore 8
      // 96: aload 0
      // 97: aload 8
      // 99: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaba (Lnet/minecraft/class_2561;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab;
      // 9c: iload 2
      // 9d: ifne d0
      // a0: astore 9
      // a2: iload 2
      // a3: aload 6
      // a5: aload 9
      // a7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.b ()Lnet/minecraft/class_2561;
      // aa: invokevirtual net/minecraft/class_5250.method_10852 (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
      // ad: pop
      // ae: iload 4
      // b0: aload 9
      // b2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.aa ()Z
      // b5: ior
      // b6: istore 4
      // b8: ifeq 80
      // bb: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab
      // be: dup
      // bf: iload 4
      // c1: ifeq ca
      // c4: aload 6
      // c6: goto cb
      // c9: athrow
      // ca: aload 1
      // cb: iload 4
      // cd: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.<init> (Lnet/minecraft/class_2561;Z)V
      // d0: areturn
   }

   private boolean baabb() {
      try {
         if (this.baaa.abbb() != babbabba.aba) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw var1;
      }

      return false;
   }

   private boolean babaa() {
      try {
         if (this.baaa.abbb() != babbabba.aba) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw var1;
      }

      return false;
   }

   private String babab(String param1, Pattern param2, Map param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 2
      // 04: aload 1
      // 05: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 08: astore 5
      // 0a: istore 4
      // 0c: aconst_null
      // 0d: astore 6
      // 0f: aload 5
      // 11: invokevirtual java/util/regex/Matcher.find ()Z
      // 14: ifeq 8f
      // 17: aload 3
      // 18: aload 5
      // 1a: ldc_w -1619051327
      // 1d: ldc_w -1493645816
      // 20: ldc_w -802888147
      // 23: ixor
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 27: ldc_w -1619051328
      // 2a: ldc_w -1493645816
      // 2d: ldc_w 766270359
      // 30: ixor
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 3a: invokevirtual java/util/regex/Matcher.group (Ljava/lang/String;)Ljava/lang/String;
      // 3d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 42: checkcast java/lang/String
      // 45: astore 7
      // 47: iload 4
      // 49: ifne a8
      // 4c: aload 7
      // 4e: ifnonnull 5e
      // 51: goto 55
      // 54: athrow
      // 55: iload 4
      // 57: ifeq 0f
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 6
      // 60: iload 4
      // 62: ifne 7b
      // 65: ifnonnull 7d
      // 68: goto 6c
      // 6b: athrow
      // 6c: new java/lang/StringBuffer
      // 6f: dup
      // 70: aload 1
      // 71: invokevirtual java/lang/String.length ()I
      // 74: invokespecial java/lang/StringBuffer.<init> (I)V
      // 77: goto 7b
      // 7a: athrow
      // 7b: astore 6
      // 7d: aload 5
      // 7f: aload 6
      // 81: aload 7
      // 83: invokestatic java/util/regex/Matcher.quoteReplacement (Ljava/lang/String;)Ljava/lang/String;
      // 86: invokevirtual java/util/regex/Matcher.appendReplacement (Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;
      // 89: pop
      // 8a: iload 4
      // 8c: ifeq 0f
      // 8f: aload 6
      // 91: iload 4
      // 93: ifne aa
      // 96: ifnonnull a0
      // 99: goto 9d
      // 9c: athrow
      // 9d: aload 1
      // 9e: areturn
      // 9f: athrow
      // a0: aload 5
      // a2: aload 6
      // a4: invokevirtual java/util/regex/Matcher.appendTail (Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
      // a7: pop
      // a8: aload 6
      // aa: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // ad: areturn
   }

   private boolean babba() {
      try {
         if (this.ba.abbb() != ababaab.b) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw var1;
      }

      return false;
   }

   private String babbb() {
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
      // 06: ifne 1e
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab;
      // 12: if_acmpeq 22
      // 15: goto 19
      // 18: athrow
      // 19: aload 0
      // 1a: goto 1e
      // 1d: athrow
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaaab ()Ljava/lang/String;
      // 21: areturn
      // 22: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 25: astore 2
      // 26: aload 2
      // 27: iload 1
      // 28: ifne 33
      // 2b: ifnull 39
      // 2e: goto 32
      // 31: athrow
      // 32: aload 2
      // 33: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 36: ifnonnull 54
      // 39: aload 0
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaaab ()Ljava/lang/String;
      // 3d: astore 3
      // 3e: new java/lang/StringBuilder
      // 41: dup
      // 42: invokespecial java/lang/StringBuilder.<init> ()V
      // 45: aload 3
      // 46: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 49: ldc_w "1"
      // 4c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 52: areturn
      // 53: athrow
      // 54: aload 0
      // 55: aload 2
      // 56: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 59: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 5c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bba (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 5f: areturn
   }

   public class_2561 bbaaa(GameProfile param1, class_2561 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 0
      // 005: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babbaab ()Z
      // 008: ifeq 02b
      // 00b: aload 2
      // 00c: iload 3
      // 00d: ifne 02c
      // 010: goto 014
      // 013: athrow
      // 014: ifnull 02b
      // 017: goto 01b
      // 01a: athrow
      // 01b: aload 1
      // 01c: iload 3
      // 01d: ifne 03c
      // 020: goto 024
      // 023: athrow
      // 024: ifnonnull 02d
      // 027: goto 02b
      // 02a: athrow
      // 02b: aload 2
      // 02c: areturn
      // 02d: aload 0
      // 02e: iload 3
      // 02f: ifne 0f8
      // 032: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 035: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 038: goto 03c
      // 03b: athrow
      // 03c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab;
      // 03f: if_acmpne 0f7
      // 042: aload 1
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 046: astore 4
      // 048: aload 4
      // 04a: iload 3
      // 04b: ifne 057
      // 04e: ifnull 065
      // 051: goto 055
      // 054: athrow
      // 055: aload 4
      // 057: iload 3
      // 058: ifne 06d
      // 05b: invokevirtual java/lang/String.isBlank ()Z
      // 05e: ifeq 068
      // 061: goto 065
      // 064: athrow
      // 065: aload 2
      // 066: areturn
      // 067: athrow
      // 068: aload 0
      // 069: aload 1
      // 06a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bba (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 06d: astore 5
      // 06f: aload 0
      // 070: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 073: iload 3
      // 074: ifne 097
      // 077: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.ba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 07a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.baaa ()Z
      // 07d: ifeq 088
      // 080: goto 084
      // 083: athrow
      // 084: aload 4
      // 086: astore 5
      // 088: aload 0
      // 089: iload 3
      // 08a: ifne 0ee
      // 08d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 090: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 093: goto 097
      // 096: athrow
      // 097: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabba;
      // 09a: if_acmpeq 0ed
      // 09d: aload 5
      // 09f: aload 0
      // 0a0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0a3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0a6: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabba
      // 0a9: aload 0
      // 0aa: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0ad: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0b0: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaaa
      // 0b3: aload 0
      // 0b4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0b7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0ba: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabba
      // 0bd: aload 0
      // 0be: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0c1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0c4: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaaa
      // 0c7: aload 0
      // 0c8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0cb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0ce: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbb
      // 0d1: aload 0
      // 0d2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0d5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0d8: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbaa
      // 0db: aload 0
      // 0dc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0df: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0e2: checkcast java/lang/Boolean
      // 0e5: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaab.ba (Ljava/lang/String;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbb;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbaa;Z)Lnet/minecraft/class_2561;
      // 0eb: areturn
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: aload 2
      // 0ef: aload 4
      // 0f1: aload 5
      // 0f3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaba (Lnet/minecraft/class_2561;Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2561;
      // 0f6: areturn
      // 0f7: aload 0
      // 0f8: iload 3
      // 0f9: ifne 119
      // 0fc: aload 1
      // 0fd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabbab (Lcom/mojang/authlib/GameProfile;)Z
      // 100: ifne 10a
      // 103: goto 107
      // 106: athrow
      // 107: aload 2
      // 108: areturn
      // 109: athrow
      // 10a: aload 0
      // 10b: iload 3
      // 10c: ifne 196
      // 10f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 112: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 115: goto 119
      // 118: athrow
      // 119: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabba;
      // 11c: if_acmpeq 195
      // 11f: aload 1
      // 120: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 123: astore 4
      // 125: aload 0
      // 126: iload 3
      // 127: ifne 141
      // 12a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 12d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.ba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 130: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.baaa ()Z
      // 133: ifeq 140
      // 136: goto 13a
      // 139: athrow
      // 13a: aload 4
      // 13c: goto 144
      // 13f: athrow
      // 140: aload 0
      // 141: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babbb ()Ljava/lang/String;
      // 144: astore 5
      // 146: aload 5
      // 148: aload 0
      // 149: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 14c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 14f: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabba
      // 152: aload 0
      // 153: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 156: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 159: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaaa
      // 15c: aload 0
      // 15d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 160: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 163: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabba
      // 166: aload 0
      // 167: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 16a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 16d: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaaa
      // 170: aload 0
      // 171: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 174: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 177: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbb
      // 17a: aload 0
      // 17b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 17e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 181: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbaa
      // 184: aload 0
      // 185: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 188: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 18b: checkcast java/lang/Boolean
      // 18e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 191: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaab.ba (Ljava/lang/String;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabba;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbb;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbbaa;Z)Lnet/minecraft/class_2561;
      // 194: areturn
      // 195: aload 0
      // 196: aload 2
      // 197: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbba (Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 19a: areturn
   }

   private boolean bbaab() {
      try {
         if (this.baaa.abbb() != babbabba.aba) {
            return true;
         }
      } catch (IllegalArgumentException var1) {
         throw var1;
      }

      return false;
   }

   private void bbaba(class_310 var1, String var2, Object var3, Throwable var4) {
      var1.execute(this::aab);
   }

   public Object bbabb(GameProfile param1) {
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
      // 06: ifne 1e
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babbaab ()Z
      // 0c: ifeq 2f
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 17: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 1a: goto 1e
      // 1d: athrow
      // 1e: checkcast java/lang/Boolean
      // 21: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 24: ifeq 2f
      // 27: aload 1
      // 28: ifnonnull 32
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aconst_null
      // 30: areturn
      // 31: athrow
      // 32: aload 0
      // 33: iload 2
      // 34: ifne 4a
      // 37: aload 1
      // 38: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabbab (Lcom/mojang/authlib/GameProfile;)Z
      // 3b: ifeq 4d
      // 3e: goto 42
      // 41: athrow
      // 42: aload 0
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaa Ljava/lang/Object;
      // 46: goto 4a
      // 49: athrow
      // 4a: goto 4e
      // 4d: aconst_null
      // 4e: areturn
   }

   private class_1657 bbbaa(class_310 param1) {
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
      // 06: ifne 17
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbbb Ljava/util/UUID;
      // 0c: ifnonnull 16
      // 0f: goto 13
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaabaa (Lnet/minecraft/class_310;)Ljava/lang/Iterable;
      // 1b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 20: astore 3
      // 21: aload 3
      // 22: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 27: ifeq 5d
      // 2a: aload 3
      // 2b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 30: checkcast net/minecraft/class_1657
      // 33: astore 4
      // 35: iload 2
      // 36: ifne 56
      // 39: aload 4
      // 3b: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 3e: aload 0
      // 3f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbbb Ljava/util/UUID;
      // 42: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 45: ifeq 59
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 4
      // 4f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabbbb (Lnet/minecraft/class_1657;)V
      // 52: goto 56
      // 55: athrow
      // 56: aload 4
      // 58: areturn
      // 59: iload 2
      // 5a: ifeq 21
      // 5d: aconst_null
      // 5e: areturn
   }

   private String bbbab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.abb ()Ljava/lang/String;
      // 0a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0d: astore 2
      // 0e: istore 1
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 26
      // 14: invokevirtual java/lang/String.isEmpty ()Z
      // 17: ifeq 29
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaaab ()Ljava/lang/String;
      // 22: goto 26
      // 25: athrow
      // 26: goto 2a
      // 29: aload 2
      // 2a: areturn
   }

   private static GameProfile bbbba(GameProfile var0, Throwable var1) {
      return var0;
   }

   private CompletableFuture bbbbb(String var1) {
      return this.abb(var1).thenCompose(this::abbaa);
   }

   private void aaaaaa(CompletableFuture var1, String var2, HttpResponse var3) {
      try {
         var1.complete(this.abbba(var2, (byte[])var3.body()));
      } catch (LinkageError | RuntimeException var5) {
         var1.complete(null);
         this.bbaabaa(abbabb(a(-1619051325, 1594998704 ^ 694539482), 1312566498962563285L), var5);
      }
   }

   public String aaaaab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.abb ()Ljava/lang/String;
      // 0a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 0d: astore 2
      // 0e: istore 1
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 42
      // 14: invokevirtual java/lang/String.isEmpty ()Z
      // 17: ifeq 45
      // 1a: goto 1e
      // 1d: athrow
      // 1e: ldc_w -1619051326
      // 21: ldc_w 302241489
      // 24: ldc_w -1980269265
      // 27: ixor
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 2b: ldc_w -1619051315
      // 2e: ldc_w 302241489
      // 31: ldc_w 758222990
      // 34: ixor
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 3e: goto 42
      // 41: athrow
      // 42: goto 46
      // 45: aload 2
      // 46: areturn
   }

   private String aaaaba() {
      return this.abbab;
   }

   private GameProfile aaaabb(HttpResponse param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -546724007
      // 003: istore 5
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 1
      // 00a: iload 2
      // 00b: ifne 03e
      // 00e: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 013: ldc_w -1619051316
      // 016: iload 5
      // 018: ldc_w 86475380
      // 01b: ixor
      // 01c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 01f: ldc2_w 8599069795734453784
      // 022: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 025: if_icmpne 05c
      // 028: goto 02c
      // 02b: athrow
      // 02c: aload 1
      // 02d: iload 2
      // 02e: ifne 04b
      // 031: goto 035
      // 034: athrow
      // 035: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 03a: goto 03e
      // 03d: athrow
      // 03e: ifnull 05c
      // 041: aload 1
      // 042: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 047: goto 04b
      // 04a: athrow
      // 04b: iload 2
      // 04c: ifne 065
      // 04f: checkcast java/lang/String
      // 052: invokevirtual java/lang/String.isBlank ()Z
      // 055: ifeq 05f
      // 058: goto 05c
      // 05b: athrow
      // 05c: aconst_null
      // 05d: areturn
      // 05e: athrow
      // 05f: aload 1
      // 060: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 065: checkcast java/lang/String
      // 068: invokestatic com/google/gson/JsonParser.parseString (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 06b: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 06e: astore 3
      // 06f: aload 3
      // 070: iload 2
      // 071: ifne 0a1
      // 074: ldc_w -1619051313
      // 077: iload 5
      // 079: ldc_w 1051680337
      // 07c: ixor
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 080: ldc_w -1619051314
      // 083: iload 5
      // 085: ldc_w -305892757
      // 088: ixor
      // 089: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 08c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 08f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 092: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 095: ifeq 0c5
      // 098: goto 09c
      // 09b: athrow
      // 09c: aload 3
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: ldc_w -1619051319
      // 0a4: iload 5
      // 0a6: ldc_w 100778597
      // 0a9: ixor
      // 0aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0ad: ldc_w -1619051320
      // 0b0: iload 5
      // 0b2: ldc_w 557586721
      // 0b5: ixor
      // 0b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 0bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0bf: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 0c2: ifne 0c8
      // 0c5: aconst_null
      // 0c6: areturn
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: aload 3
      // 0ca: ldc_w -1619051317
      // 0cd: iload 5
      // 0cf: ldc_w -284397553
      // 0d2: ixor
      // 0d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0d6: ldc_w -1619051318
      // 0d9: iload 5
      // 0db: ldc_w -417598012
      // 0de: ixor
      // 0df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0e2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0e8: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0eb: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 0ee: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ababaa (Ljava/lang/String;)Ljava/util/UUID;
      // 0f1: astore 4
      // 0f3: aload 4
      // 0f5: ifnonnull 0fb
      // 0f8: aconst_null
      // 0f9: areturn
      // 0fa: athrow
      // 0fb: new com/mojang/authlib/GameProfile
      // 0fe: dup
      // 0ff: aload 4
      // 101: aload 3
      // 102: ldc_w -1619051275
      // 105: iload 5
      // 107: ldc_w -832541176
      // 10a: ixor
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 10e: ldc_w -1619051276
      // 111: iload 5
      // 113: ldc_w 1501267925
      // 116: ixor
      // 117: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 11a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 11d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 120: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 123: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 126: invokespecial com/mojang/authlib/GameProfile.<init> (Ljava/util/UUID;Ljava/lang/String;)V
      // 129: areturn
   }

   private Iterable aaabaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: new java/util/ArrayList
      // 06: dup
      // 07: invokespecial java/util/ArrayList.<init> ()V
      // 0a: astore 3
      // 0b: istore 2
      // 0c: aload 1
      // 0d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 10: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
      // 13: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 18: astore 4
      // 1a: aload 4
      // 1c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21: ifeq 58
      // 24: aload 4
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: checkcast net/minecraft/class_1297
      // 2e: astore 5
      // 30: aload 5
      // 32: iload 2
      // 33: ifne 46
      // 36: instanceof net/minecraft/class_1657
      // 39: ifeq 54
      // 3c: goto 40
      // 3f: athrow
      // 40: aload 5
      // 42: goto 46
      // 45: athrow
      // 46: checkcast net/minecraft/class_1657
      // 49: astore 6
      // 4b: aload 3
      // 4c: aload 6
      // 4e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 53: pop
      // 54: iload 2
      // 55: ifeq 1a
      // 58: aload 3
      // 59: areturn
   }

   public String aaabab(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babbaab ()Z
      // 008: ifeq 02e
      // 00b: aload 1
      // 00c: iload 2
      // 00d: ifne 033
      // 010: goto 014
      // 013: athrow
      // 014: ifnull 02e
      // 017: goto 01b
      // 01a: athrow
      // 01b: aload 1
      // 01c: iload 2
      // 01d: ifne 043
      // 020: goto 024
      // 023: athrow
      // 024: invokevirtual java/lang/String.isEmpty ()Z
      // 027: ifeq 034
      // 02a: goto 02e
      // 02d: athrow
      // 02e: aload 1
      // 02f: goto 033
      // 032: athrow
      // 033: areturn
      // 034: aload 0
      // 035: iload 2
      // 036: ifne 051
      // 039: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 03c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 03f: goto 043
      // 042: athrow
      // 043: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab;
      // 046: if_acmpne 050
      // 049: aload 0
      // 04a: aload 1
      // 04b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaa (Ljava/lang/String;)Ljava/lang/String;
      // 04e: areturn
      // 04f: athrow
      // 050: aload 0
      // 051: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbab Ljava/lang/String;
      // 054: astore 3
      // 055: aload 0
      // 056: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babbb ()Ljava/lang/String;
      // 059: astore 4
      // 05b: aload 3
      // 05c: iload 2
      // 05d: ifne 098
      // 060: invokevirtual java/lang/String.isBlank ()Z
      // 063: ifne 093
      // 066: goto 06a
      // 069: athrow
      // 06a: aload 4
      // 06c: iload 2
      // 06d: ifne 098
      // 070: goto 074
      // 073: athrow
      // 074: invokevirtual java/lang/String.isBlank ()Z
      // 077: ifne 093
      // 07a: goto 07e
      // 07d: athrow
      // 07e: aload 3
      // 07f: aload 4
      // 081: iload 2
      // 082: ifne 0a6
      // 085: goto 089
      // 088: athrow
      // 089: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 08c: ifeq 099
      // 08f: goto 093
      // 092: athrow
      // 093: aload 1
      // 094: goto 098
      // 097: athrow
      // 098: areturn
      // 099: aload 3
      // 09a: iload 2
      // 09b: ifne 0b2
      // 09e: aload 0
      // 09f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabab Ljava/lang/String;
      // 0a2: goto 0a6
      // 0a5: athrow
      // 0a6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0a9: ifeq 0cf
      // 0ac: aload 4
      // 0ae: goto 0b2
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaba Ljava/lang/String;
      // 0b6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b9: ifeq 0cf
      // 0bc: aload 0
      // 0bd: iload 2
      // 0be: ifne 149
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbbb Ljava/util/regex/Pattern;
      // 0c8: ifnonnull 148
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: aload 3
      // 0d1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabab Ljava/lang/String;
      // 0d4: aload 0
      // 0d5: aload 4
      // 0d7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaba Ljava/lang/String;
      // 0da: aload 0
      // 0db: ldc_w -1619051273
      // 0de: ldc_w -512873599
      // 0e1: ldc_w -529850052
      // 0e4: ixor
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0e8: ldc_w -1619051274
      // 0eb: ldc_w -512873599
      // 0ee: ldc_w 221439658
      // 0f1: ixor
      // 0f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 0f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0fb: aload 3
      // 0fc: invokestatic java/util/regex/Pattern.quote (Ljava/lang/String;)Ljava/lang/String;
      // 0ff: ldc_w -1619051279
      // 102: ldc_w -512873599
      // 105: ldc_w 944020657
      // 108: ixor
      // 109: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 10c: ldc_w -1619051280
      // 10f: ldc_w -512873599
      // 112: ldc_w 1326770578
      // 115: ixor
      // 116: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 119: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 11c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 11f: astore 7
      // 121: astore 6
      // 123: astore 5
      // 125: new java/lang/StringBuilder
      // 128: dup
      // 129: invokespecial java/lang/StringBuilder.<init> ()V
      // 12c: aload 5
      // 12e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 131: aload 6
      // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 136: aload 7
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13e: invokestatic java/util/regex/Pattern.compile (Ljava/lang/String;)Ljava/util/regex/Pattern;
      // 141: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbbb Ljava/util/regex/Pattern;
      // 144: goto 148
      // 147: athrow
      // 148: aload 0
      // 149: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbbb Ljava/util/regex/Pattern;
      // 14c: aload 1
      // 14d: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 150: aload 4
      // 152: invokestatic java/util/regex/Matcher.quoteReplacement (Ljava/lang/String;)Ljava/lang/String;
      // 155: invokevirtual java/util/regex/Matcher.replaceAll (Ljava/lang/String;)Ljava/lang/String;
      // 158: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = -1170581435;
      String[] var10000 = new String[10];
      int var26 = 0;
      String[] var25 = var10000;
      int var27 = 0;
      short var28 = 16697;
      int var24 = "ͱ빕\uf6c5뿵훎뿍훆뀍ᛂ멥뛌뺥\uf6f8뽽\uf6ff뺝훽댍ᛵ뽽盲닍盇뼭훳뎅ᛨ봝㛨닍盁덕후뾅囋밥囲뼥雍뎥\uf6f6넭㛺봭盾뺝ᛂ멥뛄뵝\uf6cf돍㛷냍훷밍盰뺵뛷녝훿냽뛄낥ᛵ볥囅댵뛼덭훎냥\uf6cb뼝囌늅盀붥뛹먍\uf6f1끝\uf6c2뽅뛴뺭ᛨ븕\uf6c3넕\uf6e9뿅뛁돕훿박囹덭뛹뿵雍뽅囨봵㛿뽵盇뵅囋뎭囊멵뛇봅雌뱥盹뿍固냵零뷭围뻝盌낅훆뺥ᛨ뵅\uf6fc늭困먕相넅훴뿥直뿝㛹답雨닽뛻뺝直밭囋븍\uf6c5볥훋뷭뛻냥雃복\uf6c7뇽\u16ff붵훼뻭盿뽭뛁먥훆벅\uf6c1댝훁밥ᛳ봽후댝雾놝\uf6e8댍\uf6f6뺅囊뷵㛻붕뛏닝盷뼍ᛶ뵝盽뺕ᛇ볥훃뎥㛂뾥뛸능雅녥囻뾕盄냭雂뾵\uf6c6뀭ᛋ놝ᛴ낕固뎭\uf6cb돥뛵밍\uf6c5낽雍븥雹낥雩댥\uf6c5뼽훁볍ᛂ낵囿뿽뛼뾽훾밽뛌벽\uf6f2볥훏뿭뛂뼭雨덕雇뼅雼돕盼녵雅벥集븍ᛇ뵕雴븝益뉝\uf6c1붅直덍\uf6fd넥雊댵\uf6f9늅ᛵ뇍盁뷭囉댵ᛊ덵㛉븕ᛲ뇝盇붥盵봍囹먵雀빥㛺늝ᛵ뀝훽뽅囻뉕ᛁ뺅ᛆ뻭ᛀ빵盇붥뛋뾽\uf6fb밥盲뻝雨낵ᛷ뺥ᛲ멽뛼놭뛵끝囃븕囨뉅ᛆ녭㛰뽵雍볥囂뾵盋빝盻덍훻뼝\uf6c3끕훷붅\uf6fc먝㛉뉝ᛶ뽍\uf6c7뽝ᛁ멥雁뇽훶뷝훆붍뛾늍雾먭\uf6c1돝盂뵵ᛉ뎽零뎵雏뉍囿놝훿댕\uf6c3먅\uf6c3뷝益뎽훍뱕雨뇕盻늅雿뿭盋뎭盀댝\uf6f9뺽盵밭ᛶ봕뛹볥囉붥뛷뿝ᛸ끍雂볅\uf6e9빅ᛨ붭\uf6f8뵍㛍볭雁븽盵뷍훲뀥ᛲ뱕盏밽益빝훲븽囵먅囃뺕뛂뽕㛀븕뛅뎥囁넍囹끝뛅돍盆븥\u16fb뿍㛨뾝雩뺵훴볅ᛲ밝盎댕ᛄ늵뛷뀍囁볅훰뱝盍먥ᛀ덅囀뿵\uf6cc뀍\u16fd벭盀넽囲늍零뻝雩뺍훅뻍囻먵ᛸ덽盃냝ᛸ냽뛼멥囉냵㛆늝뛌볽훴밅雇뵕㛨뀥훰븕囊뱍雹뉅\uf6cd뀽ᛁ뼽\uf6c4냭㛌븅盼밝훸뺝囁뀵\uf6cb늭雩끽훁밵囀멭훃늝㛾끕雀밅\uf6f9뱝囌댕图냍㛻뼽뛁뿭囀뵅뛋뿽雼뺵훇벽盨뿅盳녕\uf6f7놝盶볽㛌뉝囱뷍㛳돍\uf6f4뉅\uf6e9뾝盲빕雱늅ᛏ냍盎뻝ᛰ놭囍뇥囸븵훽븕뛲빕\u16fc녭㛾볽훰닍훩뽍雲놝盌닕電뎵뛾벅뛏넥囊븽뛳먍\uf6f3냅ᛁ넕ᛌ먅\u16fa멥뛀놭㛷독㛂뱕雽댥雄덕훻뼵뛷낅\uf6f8뵅\uf6f1뀥囹놥雳먵\uf6c2뼍ᛂ먽㛺뷍雨뼕뛰먍盆냽囆뵅盼먕훸녕㛳뼅囿봕뛶덵뛽넥뛂뼵\u16fb댍뛼뾅ᛏ뱽ᛊ뾵\uf6c7농훨뾝훋뼥㛽뱵盨닥뛽븕㛉뼥훌놥雄뺭뛆뇕뛊넵뛽밥뛆끵뛳넥ᛄ뱭雺닅\uf6f6냵\uf6f3닅㛾먍훨뿭\uf6c6뵍\u16fd먕\uf6c1법囲뼕囹뼝뛄뿍盀끥雿뼅盌뇍ᛄ빍\uf6fa늅盰봍雨뼅图돵\uf6e9뼭盋뷅\u16f9돍\uf6e9뺝雍볥㛏먍뛵멵盌뺵\uf6fe먕뛀뉝훌붥\u16fb뵝훊빥囌멵\uf6c2끍雨뎕㛿봵盏뎽\uf6e8댵뛿뇵雿밽雳뱵\u16fb늵電녅\uf6fc먽雴뾽零댍㛹멥囃벵\uf6c5닭ᛲ돵뛆빵盲닥盎뼭훎뇝뛨늝零끅훺댽㛺멵㛆먅盂볥뛃닥훁밥㛴뱝㛎뻕盄뱽\uf6e9놵뛰늵ᛷ뇭雰뵥㛏뎥\u16fd냭雸넭\uf6f5댅盍뷅ᛰ덝훲닭e胙☋膉昏軹\ue604轹蘴谩\ue639胡昋蹩\ue63d踩ꘊ跑옏輑ꘅ貑옳軙옺菩䘇贱昳輱옊胡☀輁䘱耩蘂赡ꘌ跉\ue604踉ꘆ芙䘻軁옾荱䘼草옸辩昊賙䘺肉蘳跙蘾芙\ue639賁옋菙옾聡옻脡蘀苙\ua63a轑옷趉\ue60f訁،聡ꘋ蹱ؿ股꘩訩昷赡蘍訡䘳菱ؾ谙\ue601辁옷腹옲荙\ua63c輁蘄胹°䯙\ue521䯡ꓗ㙩쓐䢉┭㑡擟䥡ꔤ䫹蓑䧉ꓒ㝩쓉䤡Ӕ䫡쓚㒙\ue4d6㛙\ue4d6㖉蔥䤙\ue4d7㙱蓘㜁쓙䬡䓝㝁蓕䥱蓞㑡ꓛ㗑ꔫ㜑蓞䡁씫㒉\ue52e䮉ꔮ㜁┣䫑䔦㚉\ue4d7㝑┥㗱쓗䣑ꔠ㕉Ӝ㚡擗䬉ⓓ㑑ԩ䯉쓐䬹䓙䮡ԧ䦹擖䭩䔢㜁ꔣ㒑攬䦱\ue521䤱擜䪡ꓐ䦉씣㗉蓙㑹\ue52c㈡䓟㐱ꔧ㜁蓖䧑\ue4d5䧙\ue4dc䮹蔮㈑Ԡ䦹쓞䦡ԥ㐑䔯䫑䓕䢱ⓐ㜉擝䯩ꔪ䫡䓔䣩ⓞ㘉씥㒙\ue4dd㚡씥㞑䔣䦹ꔣ㜱䓑㉩Ԣ䮉쓉䪑\ue4da䮙蓈㘑\ue4dc㝩擑䥹ԡ䥉┡㈡ꔠ䬩䓚䪱┩䢁ԥ䧁擔㝡쓟㔁ӗ䪑┬㚹䔣\n\ue70a殙\ue77aꮉ\ue582\u0b96\ue5aa\u2b96\ue26a⮕\u0010춤匳쌴猃살팺쾤팰스\uf30f찴\uf33f쾬錎쵬팰\n靈扐鞸ꉒ铀ɓ镨≓钨≔\u0010꽲⪌깺쪍ꅢ\uea85귲ꪀ꼚⪇걂ꪀꍊ誎ꀒ\u0ab4\n鿱虰龁䙲鵹\ue675鳑왵鲑왴\u0010㴙蓸㊙Ӻチ蓲㴡ꓺ㳹䓿㱁蓩㼉䓸㊡ӊ\nₔႃ⃤킏“炀‴傀⏴傏"
         .length();
      String var23 = "ͱ빕\uf6c5뿵훎뿍훆뀍ᛂ멥뛌뺥\uf6f8뽽\uf6ff뺝훽댍ᛵ뽽盲닍盇뼭훳뎅ᛨ봝㛨닍盁덕후뾅囋밥囲뼥雍뎥\uf6f6넭㛺봭盾뺝ᛂ멥뛄뵝\uf6cf돍㛷냍훷밍盰뺵뛷녝훿냽뛄낥ᛵ볥囅댵뛼덭훎냥\uf6cb뼝囌늅盀붥뛹먍\uf6f1끝\uf6c2뽅뛴뺭ᛨ븕\uf6c3넕\uf6e9뿅뛁돕훿박囹덭뛹뿵雍뽅囨봵㛿뽵盇뵅囋뎭囊멵뛇봅雌뱥盹뿍固냵零뷭围뻝盌낅훆뺥ᛨ뵅\uf6fc늭困먕相넅훴뿥直뿝㛹답雨닽뛻뺝直밭囋븍\uf6c5볥훋뷭뛻냥雃복\uf6c7뇽\u16ff붵훼뻭盿뽭뛁먥훆벅\uf6c1댝훁밥ᛳ봽후댝雾놝\uf6e8댍\uf6f6뺅囊뷵㛻붕뛏닝盷뼍ᛶ뵝盽뺕ᛇ볥훃뎥㛂뾥뛸능雅녥囻뾕盄냭雂뾵\uf6c6뀭ᛋ놝ᛴ낕固뎭\uf6cb돥뛵밍\uf6c5낽雍븥雹낥雩댥\uf6c5뼽훁볍ᛂ낵囿뿽뛼뾽훾밽뛌벽\uf6f2볥훏뿭뛂뼭雨덕雇뼅雼돕盼녵雅벥集븍ᛇ뵕雴븝益뉝\uf6c1붅直덍\uf6fd넥雊댵\uf6f9늅ᛵ뇍盁뷭囉댵ᛊ덵㛉븕ᛲ뇝盇붥盵봍囹먵雀빥㛺늝ᛵ뀝훽뽅囻뉕ᛁ뺅ᛆ뻭ᛀ빵盇붥뛋뾽\uf6fb밥盲뻝雨낵ᛷ뺥ᛲ멽뛼놭뛵끝囃븕囨뉅ᛆ녭㛰뽵雍볥囂뾵盋빝盻덍훻뼝\uf6c3끕훷붅\uf6fc먝㛉뉝ᛶ뽍\uf6c7뽝ᛁ멥雁뇽훶뷝훆붍뛾늍雾먭\uf6c1돝盂뵵ᛉ뎽零뎵雏뉍囿놝훿댕\uf6c3먅\uf6c3뷝益뎽훍뱕雨뇕盻늅雿뿭盋뎭盀댝\uf6f9뺽盵밭ᛶ봕뛹볥囉붥뛷뿝ᛸ끍雂볅\uf6e9빅ᛨ붭\uf6f8뵍㛍볭雁븽盵뷍훲뀥ᛲ뱕盏밽益빝훲븽囵먅囃뺕뛂뽕㛀븕뛅뎥囁넍囹끝뛅돍盆븥\u16fb뿍㛨뾝雩뺵훴볅ᛲ밝盎댕ᛄ늵뛷뀍囁볅훰뱝盍먥ᛀ덅囀뿵\uf6cc뀍\u16fd벭盀넽囲늍零뻝雩뺍훅뻍囻먵ᛸ덽盃냝ᛸ냽뛼멥囉냵㛆늝뛌볽훴밅雇뵕㛨뀥훰븕囊뱍雹뉅\uf6cd뀽ᛁ뼽\uf6c4냭㛌븅盼밝훸뺝囁뀵\uf6cb늭雩끽훁밵囀멭훃늝㛾끕雀밅\uf6f9뱝囌댕图냍㛻뼽뛁뿭囀뵅뛋뿽雼뺵훇벽盨뿅盳녕\uf6f7놝盶볽㛌뉝囱뷍㛳돍\uf6f4뉅\uf6e9뾝盲빕雱늅ᛏ냍盎뻝ᛰ놭囍뇥囸븵훽븕뛲빕\u16fc녭㛾볽훰닍훩뽍雲놝盌닕電뎵뛾벅뛏넥囊븽뛳먍\uf6f3냅ᛁ넕ᛌ먅\u16fa멥뛀놭㛷독㛂뱕雽댥雄덕훻뼵뛷낅\uf6f8뵅\uf6f1뀥囹놥雳먵\uf6c2뼍ᛂ먽㛺뷍雨뼕뛰먍盆냽囆뵅盼먕훸녕㛳뼅囿봕뛶덵뛽넥뛂뼵\u16fb댍뛼뾅ᛏ뱽ᛊ뾵\uf6c7농훨뾝훋뼥㛽뱵盨닥뛽븕㛉뼥훌놥雄뺭뛆뇕뛊넵뛽밥뛆끵뛳넥ᛄ뱭雺닅\uf6f6냵\uf6f3닅㛾먍훨뿭\uf6c6뵍\u16fd먕\uf6c1법囲뼕囹뼝뛄뿍盀끥雿뼅盌뇍ᛄ빍\uf6fa늅盰봍雨뼅图돵\uf6e9뼭盋뷅\u16f9돍\uf6e9뺝雍볥㛏먍뛵멵盌뺵\uf6fe먕뛀뉝훌붥\u16fb뵝훊빥囌멵\uf6c2끍雨뎕㛿봵盏뎽\uf6e8댵뛿뇵雿밽雳뱵\u16fb늵電녅\uf6fc먽雴뾽零댍㛹멥囃벵\uf6c5닭ᛲ돵뛆빵盲닥盎뼭훎뇝뛨늝零끅훺댽㛺멵㛆먅盂볥뛃닥훁밥㛴뱝㛎뻕盄뱽\uf6e9놵뛰늵ᛷ뇭雰뵥㛏뎥\u16fd냭雸넭\uf6f5댅盍뷅ᛰ덝훲닭e胙☋膉昏軹\ue604轹蘴谩\ue639胡昋蹩\ue63d踩ꘊ跑옏輑ꘅ貑옳軙옺菩䘇贱昳輱옊胡☀輁䘱耩蘂赡ꘌ跉\ue604踉ꘆ芙䘻軁옾荱䘼草옸辩昊賙䘺肉蘳跙蘾芙\ue639賁옋菙옾聡옻脡蘀苙\ua63a轑옷趉\ue60f訁،聡ꘋ蹱ؿ股꘩訩昷赡蘍訡䘳菱ؾ谙\ue601辁옷腹옲荙\ua63c輁蘄胹°䯙\ue521䯡ꓗ㙩쓐䢉┭㑡擟䥡ꔤ䫹蓑䧉ꓒ㝩쓉䤡Ӕ䫡쓚㒙\ue4d6㛙\ue4d6㖉蔥䤙\ue4d7㙱蓘㜁쓙䬡䓝㝁蓕䥱蓞㑡ꓛ㗑ꔫ㜑蓞䡁씫㒉\ue52e䮉ꔮ㜁┣䫑䔦㚉\ue4d7㝑┥㗱쓗䣑ꔠ㕉Ӝ㚡擗䬉ⓓ㑑ԩ䯉쓐䬹䓙䮡ԧ䦹擖䭩䔢㜁ꔣ㒑攬䦱\ue521䤱擜䪡ꓐ䦉씣㗉蓙㑹\ue52c㈡䓟㐱ꔧ㜁蓖䧑\ue4d5䧙\ue4dc䮹蔮㈑Ԡ䦹쓞䦡ԥ㐑䔯䫑䓕䢱ⓐ㜉擝䯩ꔪ䫡䓔䣩ⓞ㘉씥㒙\ue4dd㚡씥㞑䔣䦹ꔣ㜱䓑㉩Ԣ䮉쓉䪑\ue4da䮙蓈㘑\ue4dc㝩擑䥹ԡ䥉┡㈡ꔠ䬩䓚䪱┩䢁ԥ䧁擔㝡쓟㔁ӗ䪑┬㚹䔣\n\ue70a殙\ue77aꮉ\ue582\u0b96\ue5aa\u2b96\ue26a⮕\u0010춤匳쌴猃살팺쾤팰스\uf30f찴\uf33f쾬錎쵬팰\n靈扐鞸ꉒ铀ɓ镨≓钨≔\u0010꽲⪌깺쪍ꅢ\uea85귲ꪀ꼚⪇걂ꪀꍊ誎ꀒ\u0ab4\n鿱虰龁䙲鵹\ue675鳑왵鲑왴\u0010㴙蓸㊙Ӻチ蓲㴡ꓺ㳹䓿㱁蓩㼉䓸㊡ӊ\nₔႃ⃤킏“炀‴傀⏴傏";

      do {
         char var29 = var23.charAt(var27);
         int var10001 = var27 + 1;
         int var10002 = var27 + 1 + var29;
         int var31 = 0;
         char[] var30 = var23.substring(var10001, var10002).toCharArray();

         do {
            char var32 = var30[var31];
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 3 | var32 << '\r') & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 3 | var32 >>> '\r') & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      babaa = var25;
      babab = new Object[var25.length];
      byte var38 = 0;
      int var47 = 0;
      byte[] var69 = "M+Ô\u0082I\u0005¶ù_w×\u0084G\u009e«]ä};\u0001\u0086T\u0082=Wn]Ýå\u001b\u008c\u009b\u0089E\u0093´\u001e²:.\u0090çÈÕH½\u0014¼6\u000eooô¨TªÔ\u0092[\u0011¼E_\u0014\u0095\u0089Ú\u0091Bd\u007fÜÉ{.X\u001a\u0000\u007fhÄâ±Ú\u0081]U\u0091õñðl¶*®\u009a)N¬l@B\u008aÊà\u000fë\u0080¯\u0099z\bñ\u009dIÓôG=\u008cèð\u009f\u0099Èç¥=DR&|\u0002\u0081.ÌYØFH0ßÄ\u0094±\u000böØ¢¬?\u0012\u0088~\t\u007f\u00ad_Ús\u0010Â:\u009a·\u0012\u007fCþ4¼\u0017)s\u0081÷é}ý\u0007ßß\u0091º\u000e¦°¥ÐdüKÒÁ].\f\u0087\u008d\u0014\u0081e\u007fY\u001cÅoíVNúÔ¥ÏÒ%\u0010:\u007f¨\u001a\u0007\u009c\u0013\u0015¡\u008c\u0085ð\u0015\u0013#¯^ÇNGI}DÛþòà³ÅþqýÝ\u009b]Dû ¾\u0017\n\u00903\u009b\u0000ÐÑ\u009fÃ\u0014ºÆÏî\u0014Å\u0086»Êè\u0089ã~·\bb\u0019¿\u0080Û¬x³Ä/\u000e\t\u0094ýP\u0003Â3)Öu\u001d2ðv<QÃ&Äs%Óhà\u001fY\u0084\u009e];\u009c\r+êBßt\u0083\u001e\u009c\u000bóøÚò]\u001dLÿ¥\u0016>õ9Í\u008cÒd\u0006õ<\u009aC²\u008cÌü¼¹þÔ\u0082+É\u0011\u0088S\u001aYêü\u009e'êaÏ²m÷6ö+ÞÞÇ>\u0086º¢r\u0084\u008b ýÒ\u0096\f\u008aõfJ\u000f\u009f\u00ad7¡ãW\u0093}&\u0019Qq{;e32«`n\u0092Iï\u009d1so\u0012\u0092E!\u0097àRÙ¥Tó·4Û\u009fw\u009c:+/ÊÕ\u0088<*@ÙË#§ç#«zÌE\u0088\u008dá\u0087m9\u008dÈ5aõE\u0006}£~tÝIö rNw\u0080I\u009eØ&\tQàÙu?¸£á\u001dÎ<å×ÿ@ü?&io\u0095e\u0088l\u009dzNñ)S\u0096¸\u0016\u001fÐ,³¶÷Ù\u0081]#\u0019\u0000\u007fÔ'ÕFlñ]]\n¸5\\í\u0005UL\u0094Â\"Ý\u0093\u001f\u009d(\u000bGÙ¾ j\u0085¦·v\u008ft\u009dn[^Q÷\u0084\u0017¶xª\u0000ñ\u001chv¿\u0016\u008cçë e\u0012YWVf\u001ccV\t\u0011ø\u0087õ^Úak©¤\u001bðáVöê\u0015ÑÏ¯a|C\u009fÜÿ\u0004\u0096\u009f\u0085ÉÅx\u0090\u000b\rx@ÈSL)YÎ\u009dÔ»Ön\u00915\u0092£lÉ\u008eÝú\u009dÔ·\u001e'JtEê\u001c;û\u00adM\u0098ÏÔâM7\u009fî|bÖÿ\u0010c®#\u0090QøJ\u0089®§\u0092´y\u001eø^'q\u001b<\u009aVæ\u0015Ì<¢~®µï¶Õ#I\u0013¡!3\u0004¤Kñ4?U®éÉ\u009cÔK\u0099f½\u001däm\u008c¶@{\u0010\u0017V?5p\u0002Âúû©`\u0015^o\u008béz\u0096Z;ZX\u0000U¯\u0094U\u0007\u0010ow|¥\u001e\u0089r²øÃ¬\t\u0018æ\t)\u0097ÍfÅ.[èU\u00ad÷\t\u009d4\u0085 ñëÔ¢Z<Æj¦±N~\u0091 Q\u000bT»]\u0010\u001e\u009cmÄF´\n\u0094\u0019ì\u000f\u0087ô$Î¶\u0012¹þgo\u0010ôÑ\\»íFìX{²¡\u0096\u008a\u008c\u0013¹w\u009c\u0089Dh7\u000f\u008e\u0084?\u0002 \u001e9Üé&Z'Ù'¢#§\u001e=\u0000-W-\\d\tÒ½_g¦«×¡\u0016t\u0013Á\u0096Wg~û-ÒÎöÉÎû\t\u0085Ø¯\u008bÈ¯\u008e]û©Èvè0É\u0092þúÂç½\u0082B*\n¦\u0093Õ9\u009f\"Àw_Ñ\"Æð\u008cÍª>a\u0080ú\u0098pRj×3\nhÕæ\u0085Ú(b>+\u0092N+C*<´»@¾j3\u0012ê9ÍªòÔ¤K\u0012ø{G>õçâV\u0093Ùê)\u00903Ñ-Z\u0001Í\n3E7Þ\u0080\u0018éA\u00ad<ù-\u0095ÉH\u001d¸t\\£ÁòªD\u0018W0bÝô\u0091Õ\u001ao]a8~bë7\u009b.\u0095Í±a\nïT[¬\u0003\u0085At\u0084\u001c)é@Ë±\u000bxs%d¥3\u00865yÙè²\t/fP\u008e*8v'LòiÎþ\u0010¼ûú\u0084JæC9·úo-x\u0004à\u001d\r×iÃ\u008fpÅ\u000b<ÛÒ\u008dGÈ?õt!5¹Í¦¿éqX\u000eZÄ.R$\u008d]¬§]-\u000e\u0092¼7\u0093+\fÐb\u0090I\rS\u001f|'¥wÒ\\Ï|6mõëuþ\u0017¸gz\u0093¦3\u0094Î^5å»x`¢\u001e\u0003\u0087\u0095q)\u000e\u000f\u0089¬\u008a\u0090W\u0091ï\u008a\u001a1öI]Vª]#\u0099¾\u009ac×'¢\u00adXL\u0018\u008afE¡¾Ò\u0013\u0096¤Î1¤Ä\u008e\u0091«a\u0093\u0010½.\u0089'ý6¤\u00937pÑ÷W\u000f?.\u008bü\u0088\u009dÑzyTâK\u008eìÉ±²ç\u0089B\u0017\"Ç\u0003\u0018\u0011Ác\u008f\u0007öñg´1\u009af\u0017Õ\u009d¼ÆÅÀ@ËÐî1ß¯b\u009a«Ø\u000eäU¤sôº±¼å<Ã§Î½IÌ]í`µbÜ!hì¹ú&öG/ y\u009eN\u0088d®¶\u0000À²öqAçÎ{ãWjëÑcÅÇ±Øs\u009b#\u009fì\u0007\u009b\u0093ÆÕAÇû\u0091\u0019t\u00922\u0093\u001fÃ1\u0081¿\u0005â7\"\u0019\u009c¨GvØvYA[#ÃkãCÞ\u0093ùñýê3ÿ\u0002üçû¹;\u001dÜñT¨J9µð\tô½\u0002ÓíW\u0083Dg«s\u001bt¾\u0090¥þ;bÓÈ\u0010\b?\u001ab\u00823X§©ÏA\u000e³ø\u0011¦3îë(±H`Ý\u0002Îg~Ý\\ÝÃÜs/6¦W%·mÔ\u007f\u008ffÑ0\u0088\u009cwÆó§ú\u0095öãÔÃ\u0011Í;\u000eõÆë\u001c.þ)æÆ8óÀÚtdý\rP\u0081o\u0088Ò\u0096\u000fuÿ©=¡\u0012\u001eîÝ»\u0015`¦u×'z\u0094³\u0088oª\u0082;ªËê\\FGWë\u0092ºßD\bGÿ\u0086Ðª\u007f`B\u000e»\u0000*ëÄ!ÜÐM2´\u0003'ýzèã®\u008dÏßì!\u0001î\u001cí\tøÍ\u0082 \u0082\u0002Ü·\u0098ré0\u008eÁ ÝÖö è¡|\u0085\u009fó\u0099;x%¸Ò:ÐKWÏ·®\f\u009aÅOí\u0084\u0003\u0012¾ÂTTÂ\f\u0082|ÄB4Q\u009ft\"\u009aþÆ¬\u008e¹\u008e\u0005\u0085ÐUØÂÄ\u0014<GÜ\u0000lG.1\t²yeÍá¿U@¦òGã³qó\u0001Ýê\u0019ÎÖ¬\u0097!p\b"
         .getBytes("ISO-8859-1");
      baabb = new int[443];

      int var99;
      do {
         baabb[var38] = ((var69[var47] & 255) << 24 | (var69[var47 + 1] & 255) << 16 | (var69[var47 + 2] & 255) << 8 | var69[var47 + 3] & 255) ^ -1359726939;
         var38 += 1;
         var99 = var47 + 4;
         var47 += 4;
      } while (var99 < var69.length);

      String[] var21 = new String[a(-1619051408, var33 ^ -2048173011)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b(var33 ^ 1413809917, 15026, 47542)).length();
      int var17 = a(-1619051405, var33 ^ -644541583);
      int var37 = -1;

      label133:
      while (true) {
         String var39 = var18.substring(++var37, var37 + var17);
         var47 = (byte)-1;

         while (true) {
            label128: {
               char[] var52 = var39.toCharArray();
               var99 = var52.length;
               int var22 = 0;
               var78 = var52;
               var47 = var99;
               char[] var103;
               int var125;
               if (var99 <= 1) {
                  var103 = var52;
                  var125 = var22;
               } else {
                  var78 = var52;
                  var47 = var99;
                  if (var99 <= var22) {
                     break label128;
                  }

                  var103 = var52;
                  var125 = var22;
               }

               while (true) {
                  var103[var125] = (char)(var103[var125] ^ switch (var22 % a(-1619051396, var33 ^ 412783244)) {
                     case 0 -> a(-1619051393, var33 ^ -383658225);
                     case 1 -> a(-1619051394, var33 ^ -659626973);
                     case 2 -> a(-1619051399, var33 ^ 784747081);
                     case 3 -> a(-1619051400, var33 ^ 1154330287);
                     case 4 -> a(-1619051397, var33 ^ 2119888353);
                     case 5 -> a(-1619051398, var33 ^ -1677066365);
                     default -> a(-1619051419, var33 ^ 404204969);
                  });
                  var22++;
                  if (var47 == 0) {
                     var125 = var47;
                     var103 = var78;
                  } else {
                     if (var47 <= var22) {
                        break;
                     }

                     var103 = var78;
                     var125 = var22;
                  }
               }
            }

            String var110 = new String(var78).intern();
            switch (var47) {
               case 0:
                  var21[var19++] = var110;
                  if ((var37 += var17) >= var20) {
                     baa = var21;
                     abbba = new String[a(-1619051395, var33 ^ -2061294535)];
                     long var8 = 5722579446809588876L;
                     long[] var14 = new long[a(-1619051420, var33 ^ 1173334990)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = b(var33 ^ -110751951, 15024, 42495)).length();
                     byte var10 = 0;

                     label107:
                     while (true) {
                        int var59 = var10;
                        var10 += 8;
                        String var41 = var12.substring(var59, var10);
                        var59 = var33 ^ -1864892188;
                        short var84 = 15025;
                        short var111 = 4631;
                        byte[] var15 = var41.getBytes("ISO-8859-1");
                        long[] var42 = var14;
                        var59 = var11++;
                        long var85 = (var15[0] & 255L) << a(-1619051417, var33 ^ 818542762)
                           | (var15[1] & 255L) << a(-1619051418, var33 ^ -1783488636)
                           | (var15[2] & 255L) << a(-1619051423, var33 ^ -90664943)
                           | (var15[3] & 255L) << a(-1619051424, var33 ^ 35460279)
                           | (var15[4] & 255L) << a(-1619051421, var33 ^ -601853530)
                           | (var15[5] & 255L) << a(-1619051422, var33 ^ -1853855620)
                           | (var15[a(-1619051411, var33 ^ -689490835)] & 255L) << a(-1619051412, var33 ^ -1473765207)
                           | var15[a(-1619051409, var33 ^ -395920915)] & 255L;
                        byte var112 = -1;

                        while (true) {
                           long var127 = var85 ^ var8;
                           switch (var112) {
                              case 0:
                                 var42[var59] = var127;
                                 if (var10 >= var13) {
                                    aaa = var14;
                                    abbb = new Integer[a(-1619051503, var33 ^ -2071023403)];
                                    abab = abbabb(a(-1619051504, var33 ^ 2000234308), 4501208678818046048L);
                                    aaaaa = abbabb(a(-1619051501, var33 ^ -238478208), 1730722602007015946L);
                                    ababa = abbabb(a(-1619051502, var33 ^ -1069636438), 1730722602007015946L);
                                    bbb = abbabb(a(-1619051491, var33 ^ 973254285), 4695427168251129070L);
                                    long var0 = 7764994214133239804L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = b(var33 ^ -694208785, 15028, 23837)).length();
                                    byte var2 = 0;

                                    label97:
                                    while (true) {
                                       int var64 = var2;
                                       var2 += 8;
                                       String var44 = var4.substring(var64, var2);
                                       var64 = var33 ^ -319928338;
                                       short var88 = 15029;
                                       char var115 = '蔖';
                                       byte[] var7 = var44.getBytes("ISO-8859-1");
                                       long[] var45 = var6;
                                       var64 = var3++;
                                       long var89 = (var7[0] & 255L) << a(-1619051492, var33 ^ -911820108)
                                          | (var7[1] & 255L) << a(-1619051489, var33 ^ -2002155095)
                                          | (var7[2] & 255L) << a(-1619051490, var33 ^ -398550633)
                                          | (var7[3] & 255L) << a(-1619051495, var33 ^ 2060855919)
                                          | (var7[4] & 255L) << a(-1619051496, var33 ^ 299338114)
                                          | (var7[5] & 255L) << a(-1619051493, var33 ^ 369973385)
                                          | (var7[a(-1619051494, var33 ^ 1274107287)] & 255L) << a(-1619051515, var33 ^ 1702904309)
                                          | var7[a(-1619051516, var33 ^ -383044100)] & 255L;
                                       var112 = -1;

                                       while (true) {
                                          var127 = var89 ^ var0;
                                          switch (var112) {
                                             case 0:
                                                var45[var64] = var127;
                                                if (var2 >= var5) {
                                                   aabbb = var6;
                                                   aaba = new Long[4];
                                                   abba = aabbaaaba.aaab(
                                                      ab(a(-1619051506, var33 ^ 64306613), a(-1619051511, var33 ^ -1955557475))
                                                   );
                                                   ab = aabbaaaba.aaab(
                                                      ab(a(-1619051512, var33 ^ -84904765), a(-1619051509, var33 ^ -262961617))
                                                   );
                                                   bbba = aabbaaaba.aaab(
                                                      ab(a(-1619051510, var33 ^ 1616965839), a(-1619051467, var33 ^ 1275188342))
                                                   );
                                                   aa = aabbaaaba.aaab(
                                                      ab(a(-1619051468, var33 ^ 278006984), a(-1619051465, var33 ^ -1943397265))
                                                   );
                                                   aaabb = HttpClient.newBuilder()
                                                      .connectTimeout(Duration.ofSeconds(baaa(a(-1619051466, var33 ^ 1592807234), 7867384686343465148L)))
                                                      .followRedirects(Redirect.NORMAL)
                                                      .build();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var45[var64] = var127;
                                                if (var2 < var5) {
                                                   continue label97;
                                                }

                                                var5 = (var4 = b(var33 ^ -1466604381, 15034, 62777)).length();
                                                var2 = 0;
                                          }

                                          int var67 = var2;
                                          var2 += 8;
                                          String var46 = var4.substring(var67, var2);
                                          var67 = var33 ^ -843969410;
                                          short var91 = 15035;
                                          char var118 = '\uf6ae';
                                          var7 = var46.getBytes("ISO-8859-1");
                                          var45 = var6;
                                          var64 = var3++;
                                          var89 = (var7[0] & 255L) << a(-1619051513, var33 ^ -2057974324)
                                             | (var7[1] & 255L) << a(-1619051514, var33 ^ -129686848)
                                             | (var7[2] & 255L) << a(-1619051519, var33 ^ 928293565)
                                             | (var7[3] & 255L) << a(-1619051520, var33 ^ 746529550)
                                             | (var7[4] & 255L) << a(-1619051517, var33 ^ 1206678316)
                                             | (var7[5] & 255L) << a(-1619051518, var33 ^ 1054032500)
                                             | (var7[a(-1619051507, var33 ^ -480434262)] & 255L) << a(-1619051508, var33 ^ -1387800196)
                                             | var7[a(-1619051505, var33 ^ -1412956063)] & 255L;
                                          var112 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var42[var59] = var127;
                                 if (var10 < var13) {
                                    continue label107;
                                 }

                                 var13 = (var12 = b(var33 ^ 582306010, 15030, 60725)).length();
                                 var10 = 0;
                           }

                           int var62 = var10;
                           var10 += 8;
                           String var43 = var12.substring(var62, var10);
                           var62 = var33 ^ -1422360923;
                           short var87 = 15031;
                           char var114 = '\ue3cf';
                           var15 = var43.getBytes("ISO-8859-1");
                           var42 = var14;
                           var59 = var11++;
                           var85 = (var15[0] & 255L) << a(-1619051410, var33 ^ 652858393)
                              | (var15[1] & 255L) << a(-1619051415, var33 ^ 30924223)
                              | (var15[2] & 255L) << a(-1619051416, var33 ^ 895716737)
                              | (var15[3] & 255L) << a(-1619051413, var33 ^ 796897160)
                              | (var15[4] & 255L) << a(-1619051414, var33 ^ 1329532814)
                              | (var15[5] & 255L) << a(-1619051499, var33 ^ -366833921)
                              | (var15[a(-1619051500, var33 ^ -1523009100)] & 255L) << a(-1619051497, var33 ^ -1122693761)
                              | var15[a(-1619051498, var33 ^ -77567647)] & 255L;
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
                     continue label133;
                  }

                  var20 = (var18 = b(var33 ^ 1994923093, 15027, 8529)).length();
                  var17 = a(-1619051406, var33 ^ 655803144);
                  var37 = -1;
            }

            var39 = var18.substring(++var37, var37 + var17);
            var47 = (byte)0;
         }
      }
   }

   private boolean aaabba() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 08: iload 1
      // 09: ifne 24
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabba;
      // 12: if_acmpeq 39
      // 15: goto 19
      // 18: athrow
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 20: goto 24
      // 23: athrow
      // 24: checkcast java/lang/Boolean
      // 27: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2a: iload 1
      // 2b: ifne 36
      // 2e: ifeq 39
      // 31: goto 35
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   private static int aaabbb(baaabbba var0, baaabbba var1) {
      return Integer.compare(var1.aa().length(), var0.aa().length());
   }

   private ab aabaaa(class_2561 param1, String param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokeinterface net/minecraft/class_2561.method_10851 ()Lnet/minecraft/class_7417; 1
      // 006: astore 5
      // 008: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 00b: bipush 0
      // 00c: istore 6
      // 00e: istore 4
      // 010: aload 1
      // 011: invokeinterface net/minecraft/class_2561.method_10866 ()Lnet/minecraft/class_2583; 1
      // 016: astore 7
      // 018: aload 5
      // 01a: iload 4
      // 01c: ifne 09f
      // 01f: instanceof net/minecraft/class_8828
      // 022: ifeq 09d
      // 025: goto 029
      // 028: athrow
      // 029: aload 5
      // 02b: iload 4
      // 02d: ifne 09f
      // 030: goto 034
      // 033: athrow
      // 034: checkcast net/minecraft/class_8828
      // 037: astore 8
      // 039: aload 0
      // 03a: aload 7
      // 03c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baaaa (Lnet/minecraft/class_2583;)Z
      // 03f: ifne 09d
      // 042: aload 8
      // 044: iload 4
      // 046: ifne 09f
      // 049: goto 04d
      // 04c: athrow
      // 04d: invokeinterface net/minecraft/class_8828.comp_737 ()Ljava/lang/String; 1
      // 052: astore 9
      // 054: aload 9
      // 056: ifnull 09d
      // 059: aload 9
      // 05b: iload 4
      // 05d: ifne 07a
      // 060: goto 064
      // 063: athrow
      // 064: aload 2
      // 065: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 068: ifeq 09d
      // 06b: goto 06f
      // 06e: athrow
      // 06f: aload 9
      // 071: aload 2
      // 072: aload 3
      // 073: invokevirtual java/lang/String.replace (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
      // 076: goto 07a
      // 079: athrow
      // 07a: astore 10
      // 07c: aload 9
      // 07e: iload 4
      // 080: ifne 095
      // 083: aload 10
      // 085: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 088: ifne 09d
      // 08b: goto 08f
      // 08e: athrow
      // 08f: aload 10
      // 091: goto 095
      // 094: athrow
      // 095: invokestatic net/minecraft/class_8828.method_54232 (Ljava/lang/String;)Lnet/minecraft/class_8828;
      // 098: astore 5
      // 09a: bipush 1
      // 09b: istore 6
      // 09d: aload 5
      // 09f: invokestatic net/minecraft/class_5250.method_43477 (Lnet/minecraft/class_7417;)Lnet/minecraft/class_5250;
      // 0a2: aload 7
      // 0a4: invokevirtual net/minecraft/class_5250.method_10862 (Lnet/minecraft/class_2583;)Lnet/minecraft/class_5250;
      // 0a7: astore 8
      // 0a9: aload 1
      // 0aa: invokeinterface net/minecraft/class_2561.method_10855 ()Ljava/util/List; 1
      // 0af: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0b4: astore 9
      // 0b6: aload 9
      // 0b8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0bd: ifeq 0f5
      // 0c0: aload 9
      // 0c2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c7: checkcast net/minecraft/class_2561
      // 0ca: astore 10
      // 0cc: aload 0
      // 0cd: aload 10
      // 0cf: aload 2
      // 0d0: aload 3
      // 0d1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabaaa (Lnet/minecraft/class_2561;Ljava/lang/String;Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab;
      // 0d4: iload 4
      // 0d6: ifne 10a
      // 0d9: astore 11
      // 0db: iload 4
      // 0dd: aload 8
      // 0df: aload 11
      // 0e1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.b ()Lnet/minecraft/class_2561;
      // 0e4: invokevirtual net/minecraft/class_5250.method_10852 (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
      // 0e7: pop
      // 0e8: iload 6
      // 0ea: aload 11
      // 0ec: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.aa ()Z
      // 0ef: ior
      // 0f0: istore 6
      // 0f2: ifeq 0b6
      // 0f5: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab
      // 0f8: dup
      // 0f9: iload 6
      // 0fb: ifeq 104
      // 0fe: aload 8
      // 100: goto 105
      // 103: athrow
      // 104: aload 1
      // 105: iload 6
      // 107: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.<init> (Lnet/minecraft/class_2561;Z)V
      // 10a: areturn
   }

   private static int aabaab(int var0) {
      return Math.max(var0, 1);
   }

   private String aababa(class_310 param1) {
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
      // 05: iload 2
      // 06: ifne 27
      // 09: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c: ifnonnull 18
      // 0f: goto 13
      // 12: athrow
      // 13: ldc_w ""
      // 16: areturn
      // 17: athrow
      // 18: aload 0
      // 19: iload 2
      // 1a: ifne 32
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 23: goto 27
      // 26: athrow
      // 27: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab;
      // 2a: if_acmpne 59
      // 2d: aload 0
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ababba (Lnet/minecraft/class_310;)Lnet/minecraft/class_1657;
      // 36: astore 3
      // 37: iload 2
      // 38: ifne 4c
      // 3b: aload 3
      // 3c: ifnull 54
      // 3f: goto 43
      // 42: athrow
      // 43: aload 0
      // 44: aload 3
      // 45: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabbbb (Lnet/minecraft/class_1657;)V
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 3
      // 4d: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 53: areturn
      // 54: aload 0
      // 55: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabb Ljava/lang/String;
      // 58: areturn
      // 59: aload 1
      // 5a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5d: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 60: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 63: areturn
   }

   @Override
   public void aababb(class_1297 param1) {
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
      // 05: iload 2
      // 06: ifne 18
      // 09: instanceof net/minecraft/class_1657
      // 0c: ifeq 20
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: checkcast net/minecraft/class_1657
      // 1b: astore 3
      // 1c: iload 2
      // 1d: ifeq 22
      // 20: return
      // 21: athrow
      // 22: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 25: astore 4
      // 27: aload 4
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: iload 2
      // 2d: ifne 38
      // 30: ifnull 48
      // 33: goto 37
      // 36: athrow
      // 37: aload 3
      // 38: iload 2
      // 39: ifne 6c
      // 3c: aload 4
      // 3e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 41: if_acmpne 4a
      // 44: goto 48
      // 47: athrow
      // 48: return
      // 49: athrow
      // 4a: aload 0
      // 4b: aload 3
      // 4c: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 4f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbbb Ljava/util/UUID;
      // 52: aload 0
      // 53: aload 3
      // 54: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 5a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabb Ljava/lang/String;
      // 5d: aload 0
      // 5e: iload 2
      // 5f: ifne 85
      // 62: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 65: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 68: goto 6c
      // 6b: athrow
      // 6c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab;
      // 6f: if_acmpne 97
      // 72: aload 0
      // 73: iload 2
      // 74: ifne 90
      // 77: goto 7b
      // 7a: athrow
      // 7b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 7e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 81: goto 85
      // 84: athrow
      // 85: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbba;
      // 88: if_acmpne 97
      // 8b: aload 0
      // 8c: goto 90
      // 8f: athrow
      // 90: aload 0
      // 91: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabb Ljava/lang/String;
      // 94: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbab Ljava/lang/String;
      // 97: return
   }

   private void aabbaa() {
      this.aaab = "";
      this.aba = null;
      this.baab = Map.of();
      synchronized (this.baba) {
         this.baba.clear();
      }
   }

   private static int a(int var0, int var1) {
      int var2 = baabb[var0 ^ -1619051179] ^ var1 ^ var0;
      var2 -= 48236;
      var2 -= 63279;
      var2 ^= 40697;
      var2 += 31467;
      var2 += 53;
      return var2 - 757;
   }

   private boolean aabbab(GameProfile param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 3
      // 007: istore 2
      // 008: aload 3
      // 009: iload 2
      // 00a: ifne 029
      // 00d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 010: ifnonnull 01a
      // 013: goto 017
      // 016: athrow
      // 017: bipush 0
      // 018: ireturn
      // 019: athrow
      // 01a: aload 0
      // 01b: iload 2
      // 01c: ifne 034
      // 01f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 022: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 025: goto 029
      // 028: athrow
      // 029: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaab;
      // 02c: if_acmpne 0f5
      // 02f: aload 0
      // 030: goto 034
      // 033: athrow
      // 034: aload 3
      // 035: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ababba (Lnet/minecraft/class_310;)Lnet/minecraft/class_1657;
      // 038: astore 4
      // 03a: aload 4
      // 03c: iload 2
      // 03d: ifne 049
      // 040: ifnull 09a
      // 043: goto 047
      // 046: athrow
      // 047: aload 4
      // 049: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 04c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 04f: astore 5
      // 051: aload 4
      // 053: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 056: aload 1
      // 057: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 05a: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 05d: iload 2
      // 05e: ifne 095
      // 061: ifne 094
      // 064: goto 068
      // 067: athrow
      // 068: aload 5
      // 06a: iload 2
      // 06b: ifne 082
      // 06e: goto 072
      // 071: athrow
      // 072: invokevirtual java/lang/String.isBlank ()Z
      // 075: ifne 098
      // 078: goto 07c
      // 07b: athrow
      // 07c: aload 5
      // 07e: goto 082
      // 081: athrow
      // 082: aload 1
      // 083: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 086: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 089: iload 2
      // 08a: ifne 095
      // 08d: ifeq 098
      // 090: goto 094
      // 093: athrow
      // 094: bipush 1
      // 095: goto 099
      // 098: bipush 0
      // 099: ireturn
      // 09a: aload 0
      // 09b: iload 2
      // 09c: ifne 0c4
      // 09f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbbb Ljava/util/UUID;
      // 0a2: ifnull 0c3
      // 0a5: goto 0a9
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbbb Ljava/util/UUID;
      // 0ad: aload 1
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 0b1: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 0b4: iload 2
      // 0b5: ifne 0f0
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: ifne 0ef
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: iload 2
      // 0c5: ifne 0da
      // 0c8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabb Ljava/lang/String;
      // 0cb: invokevirtual java/lang/String.isBlank ()Z
      // 0ce: ifne 0f3
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aabb Ljava/lang/String;
      // 0dd: aload 1
      // 0de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 0e1: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0e4: iload 2
      // 0e5: ifne 0f0
      // 0e8: ifeq 0f3
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: bipush 1
      // 0f0: goto 0f4
      // 0f3: bipush 0
      // 0f4: ireturn
      // 0f5: aload 3
      // 0f6: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0f9: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 0fc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 0ff: astore 4
      // 101: aload 3
      // 102: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 105: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 108: aload 1
      // 109: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 10c: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 10f: iload 2
      // 110: ifne 147
      // 113: ifne 146
      // 116: goto 11a
      // 119: athrow
      // 11a: aload 4
      // 11c: iload 2
      // 11d: ifne 134
      // 120: goto 124
      // 123: athrow
      // 124: invokevirtual java/lang/String.isBlank ()Z
      // 127: ifne 14a
      // 12a: goto 12e
      // 12d: athrow
      // 12e: aload 4
      // 130: goto 134
      // 133: athrow
      // 134: aload 1
      // 135: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 138: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 13b: iload 2
      // 13c: ifne 147
      // 13f: ifeq 14a
      // 142: goto 146
      // 145: athrow
      // 146: bipush 1
      // 147: goto 14b
      // 14a: bipush 0
      // 14b: ireturn
   }

   @Override
   public JsonObject aabbba() {
      return super.aabbba();
   }

   private void aabbbb(class_1657 var1) {
      try {
         if (var1 == null) {
            return;
         }
      } catch (IllegalArgumentException var2) {
         throw var2;
      }

      this.bbbb = var1.method_5667();
      this.aabb = baababbb.aab(var1.method_7334());
   }

   private class_1657 abaaaa(class_310 param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 2e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 2e
      // 17: aload 2
      // 18: iload 3
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnull 2e
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: invokevirtual java/lang/String.isBlank ()Z
      // 2b: ifeq 31
      // 2e: aconst_null
      // 2f: areturn
      // 30: athrow
      // 31: aload 1
      // 32: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 35: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // 38: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3d: astore 4
      // 3f: aload 4
      // 41: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 46: ifeq a9
      // 49: aload 4
      // 4b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 50: checkcast net/minecraft/class_1657
      // 53: astore 5
      // 55: aload 5
      // 57: iload 3
      // 58: ifne 64
      // 5b: ifnull 3f
      // 5e: goto 62
      // 61: athrow
      // 62: aload 5
      // 64: iload 3
      // 65: ifne 7c
      // 68: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 6b: ifnonnull 7a
      // 6e: goto 72
      // 71: athrow
      // 72: iload 3
      // 73: ifeq 3f
      // 76: goto 7a
      // 79: athrow
      // 7a: aload 5
      // 7c: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 7f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 82: astore 6
      // 84: aload 6
      // 86: iload 3
      // 87: ifne 9a
      // 8a: invokevirtual java/lang/String.isBlank ()Z
      // 8d: ifne a5
      // 90: goto 94
      // 93: athrow
      // 94: aload 6
      // 96: goto 9a
      // 99: athrow
      // 9a: aload 2
      // 9b: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 9e: ifeq a5
      // a1: aload 5
      // a3: areturn
      // a4: athrow
      // a5: iload 3
      // a6: ifeq 3f
      // a9: aconst_null
      // aa: areturn
   }

   private CompletableFuture abaaab(class_310 var1, String var2) {
      CompletableFuture var3 = this.abab(var1, var2);
      var3.thenAccept(this::ababbb);
      return var3;
   }

   private static GameProfile abaaba(Throwable var0) {
      return null;
   }

   private class_2561 abaabb(class_2561 param1) {
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
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aba Ljava/util/regex/Pattern;
      // 0c: ifnull 2b
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: iload 2
      // 19: ifne 2f
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.baab Ljava/util/Map;
      // 1f: invokeinterface java/util/Map.isEmpty ()Z 1
      // 24: ifeq 2e
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 1
      // 2c: areturn
      // 2d: athrow
      // 2e: aload 0
      // 2f: aload 1
      // 30: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaba (Lnet/minecraft/class_2561;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab;
      // 33: astore 3
      // 34: aload 3
      // 35: iload 2
      // 36: ifne 48
      // 39: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.aa ()Z
      // 3c: ifeq 4e
      // 3f: goto 43
      // 42: athrow
      // 43: aload 3
      // 44: goto 48
      // 47: athrow
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ab.b ()Lnet/minecraft/class_2561;
      // 4b: goto 4f
      // 4e: aload 1
      // 4f: areturn
   }

   private UUID ababaa(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -788808279
      // 003: istore 14
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 1
      // 00a: iload 2
      // 00b: ifne 016
      // 00e: ifnull 036
      // 011: goto 015
      // 014: athrow
      // 015: aload 1
      // 016: iload 2
      // 017: ifne 19f
      // 01a: invokevirtual java/lang/String.length ()I
      // 01d: ldc_w -1619051277
      // 020: iload 14
      // 022: ldc_w -1722544755
      // 025: ixor
      // 026: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 029: ldc2_w 4264277750391179282
      // 02c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 02f: if_icmpeq 039
      // 032: goto 036
      // 035: athrow
      // 036: aconst_null
      // 037: areturn
      // 038: athrow
      // 039: aload 1
      // 03a: bipush 0
      // 03b: ldc_w -1619051278
      // 03e: iload 14
      // 040: ldc_w -610095859
      // 043: ixor
      // 044: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 047: ldc2_w 2115844226175056675
      // 04a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 04d: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 050: ldc_w -1619051267
      // 053: iload 14
      // 055: ldc_w 784848933
      // 058: ixor
      // 059: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 05c: ldc_w -1619051268
      // 05f: iload 14
      // 061: ldc_w 2075414643
      // 064: ixor
      // 065: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 068: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 06b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 06e: aload 1
      // 06f: ldc_w -1619051265
      // 072: iload 14
      // 074: ldc_w 1702042225
      // 077: ixor
      // 078: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 07b: ldc2_w 8635364476219051949
      // 07e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 081: ldc_w -1619051266
      // 084: iload 14
      // 086: ldc_w 589687711
      // 089: ixor
      // 08a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 08d: ldc2_w 6092177429094073907
      // 090: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 093: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 096: ldc_w -1619051271
      // 099: iload 14
      // 09b: ldc_w -302904599
      // 09e: ixor
      // 09f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0a2: ldc_w -1619051272
      // 0a5: iload 14
      // 0a7: ldc_w -1555739131
      // 0aa: ixor
      // 0ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 0b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0b4: aload 1
      // 0b5: ldc_w -1619051269
      // 0b8: iload 14
      // 0ba: ldc_w -1789735708
      // 0bd: ixor
      // 0be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0c1: ldc2_w 3465923583394605794
      // 0c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 0c7: ldc_w -1619051270
      // 0ca: iload 14
      // 0cc: ldc_w 668807321
      // 0cf: ixor
      // 0d0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0d3: ldc2_w 4171266255940977345
      // 0d6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 0d9: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0dc: ldc_w -1619051291
      // 0df: iload 14
      // 0e1: ldc_w 1870001121
      // 0e4: ixor
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0e8: ldc_w -1619051292
      // 0eb: iload 14
      // 0ed: ldc_w -1263936190
      // 0f0: ixor
      // 0f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 0f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 0f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0fa: aload 1
      // 0fb: ldc_w -1619051289
      // 0fe: iload 14
      // 100: ldc_w -179444218
      // 103: ixor
      // 104: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 107: ldc2_w 3075282662809810613
      // 10a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 10d: ldc_w -1619051290
      // 110: iload 14
      // 112: ldc_w -518086600
      // 115: ixor
      // 116: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 119: ldc2_w 2877966177341618681
      // 11c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 11f: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 122: ldc_w -1619051295
      // 125: iload 14
      // 127: ldc_w -797326260
      // 12a: ixor
      // 12b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 12e: ldc_w -1619051296
      // 131: iload 14
      // 133: ldc_w -2067988931
      // 136: ixor
      // 137: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ab (II)Ljava/lang/String;
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 140: aload 1
      // 141: ldc_w -1619051293
      // 144: iload 14
      // 146: ldc_w -1271854197
      // 149: ixor
      // 14a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 14d: ldc2_w 1865063563369624080
      // 150: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 153: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 156: astore 13
      // 158: astore 12
      // 15a: astore 11
      // 15c: astore 10
      // 15e: astore 9
      // 160: astore 8
      // 162: astore 7
      // 164: astore 6
      // 166: astore 5
      // 168: new java/lang/StringBuilder
      // 16b: dup
      // 16c: invokespecial java/lang/StringBuilder.<init> ()V
      // 16f: aload 5
      // 171: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 174: aload 6
      // 176: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 179: aload 7
      // 17b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17e: aload 8
      // 180: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 183: aload 9
      // 185: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 188: aload 10
      // 18a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 18d: aload 11
      // 18f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 192: aload 12
      // 194: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 197: aload 13
      // 199: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 19c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 19f: astore 3
      // 1a0: aload 3
      // 1a1: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 1a4: areturn
      // 1a5: astore 4
      // 1a7: aload 4
      // 1a9: pop
      // 1aa: aconst_null
      // 1ab: areturn
   }

   private class_1657 ababab(class_310 var1) {
      class_1657 var3 = null;
      int var2 = baaabbaa.bba;
      double var4 = Double.MAX_VALUE;
      Iterator var6 = this.aaabaa(var1).iterator();

      class_1657 var10000;
      while (true) {
         if (var6.hasNext()) {
            var10000 = (class_1657)var6.next();
            if (var2 != 0) {
               break;
            }

            class_1657 var7 = var10000;

            label69: {
               try {
                  var10000 = var7;
                  if (var2 != 0) {
                     break label69;
                  }

                  if (var7 == var1.field_1724) {
                     continue;
                  }
               } catch (IllegalArgumentException var13) {
                  throw var13;
               }

               var10000 = var7;
            }

            label63: {
               try {
                  if (var2 != 0) {
                     break label63;
                  }

                  if (!var10000.method_5805()) {
                     continue;
                  }
               } catch (IllegalArgumentException var12) {
                  throw var12;
               }

               var10000 = var7;
            }

            try {
               if (var10000.method_31481() && var2 == 0) {
                  continue;
               }
            } catch (IllegalArgumentException var11) {
               throw var11;
            }

            double var8 = var1.field_1724.method_5858(var7);

            label51: {
               label50: {
                  try {
                     if (var2 != 0) {
                        break label50;
                     }

                     if (!(var8 < var4)) {
                        break label51;
                     }
                  } catch (IllegalArgumentException var10) {
                     throw var10;
                  }

                  var4 = var8;
               }

               var3 = var7;
            }

            if (var2 == 0) {
               continue;
            }
         }

         var10000 = var3;
         break;
      }

      return var10000;
   }

   private class_1657 ababba(class_310 param1) {
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
      // 05: iload 2
      // 06: ifne 18
      // 09: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c: ifnull 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: iload 2
      // 19: ifne 38
      // 1c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1f: ifnonnull 29
      // 22: goto 26
      // 25: athrow
      // 26: aconst_null
      // 27: areturn
      // 28: athrow
      // 29: aload 0
      // 2a: iload 2
      // 2b: ifne 46
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 34: goto 38
      // 37: athrow
      // 38: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbba;
      // 3b: if_acmpne 45
      // 3e: aload 0
      // 3f: aload 1
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.ababab (Lnet/minecraft/class_310;)Lnet/minecraft/class_1657;
      // 43: areturn
      // 44: athrow
      // 45: aload 0
      // 46: aload 1
      // 47: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbbaa (Lnet/minecraft/class_310;)Lnet/minecraft/class_1657;
      // 4a: areturn
   }

   private void ababbb(String var1, CompletableFuture var2, Object var3) {
      try {
         if (var3 == null) {
            this.aaaba.remove(var1, var2);
         }
      } catch (IllegalArgumentException var4) {
         throw var4;
      }
   }

   public static baaaaaab abbaaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: ifnull 2b
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 0
      // 16: ifne 28
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.babbaab ()Z
      // 1c: ifeq 2b
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: goto 28
      // 27: athrow
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: areturn
   }

   private void abbaab(Map param1, GameProfile param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 2
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbab (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 08: astore 4
      // 0a: aload 2
      // 0b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 0e: astore 5
      // 10: istore 3
      // 11: aload 4
      // 13: ifnull 37
      // 16: aload 5
      // 18: iload 3
      // 19: ifne 29
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnull 37
      // 23: goto 27
      // 26: athrow
      // 27: aload 5
      // 29: iload 3
      // 2a: ifne 42
      // 2d: invokevirtual java/lang/String.isBlank ()Z
      // 30: ifeq 39
      // 33: goto 37
      // 36: athrow
      // 37: return
      // 38: athrow
      // 39: aload 1
      // 3a: aload 4
      // 3c: aload 2
      // 3d: invokeinterface java/util/Map.putIfAbsent (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 42: pop
      // 43: return
   }

   private CompletionStage abbaba(class_310 param1, String param2, HttpResponse param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifne 2f
      // 0b: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 10: ldc_w -1619051294
      // 13: ldc_w 1946928700
      // 16: ldc_w 40006034
      // 19: ixor
      // 1a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 1d: ldc2_w 8599069795734453784
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 23: if_icmplt a7
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 3
      // 2b: goto 2f
      // 2e: athrow
      // 2f: iload 4
      // 31: ifne 66
      // 34: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 39: ldc_w -1619051283
      // 3c: ldc_w 1946928700
      // 3f: ldc_w -1233008919
      // 42: ixor
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 46: ldc2_w 2568732119384749944
      // 49: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // 4c: if_icmpge a7
      // 4f: goto 53
      // 52: athrow
      // 53: aload 3
      // 54: iload 4
      // 56: ifne 73
      // 59: goto 5d
      // 5c: athrow
      // 5d: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 62: goto 66
      // 65: athrow
      // 66: ifnull a7
      // 69: aload 3
      // 6a: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 6f: goto 73
      // 72: athrow
      // 73: checkcast [B
      // 76: iload 4
      // 78: ifne 90
      // 7b: arraylength
      // 7c: ifeq a7
      // 7f: goto 83
      // 82: athrow
      // 83: aload 3
      // 84: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 89: checkcast [B
      // 8c: goto 90
      // 8f: athrow
      // 90: arraylength
      // 91: ldc_w -1619051284
      // 94: ldc_w 1946928700
      // 97: ldc_w 1548685332
      // 9a: ixor
      // 9b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.a (II)I
      // 9e: ldc2_w 8366934824064615375
      // a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbabb (IJ)I
      // a4: if_icmple ad
      // a7: aconst_null
      // a8: invokestatic java/util/concurrent/CompletableFuture.completedFuture (Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;
      // ab: areturn
      // ac: athrow
      // ad: new java/util/concurrent/CompletableFuture
      // b0: dup
      // b1: invokespecial java/util/concurrent/CompletableFuture.<init> ()V
      // b4: astore 5
      // b6: aload 1
      // b7: aload 0
      // b8: aload 5
      // ba: aload 2
      // bb: aload 3
      // bc: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab;Ljava/util/concurrent/CompletableFuture;Ljava/lang/String;Ljava/net/http/HttpResponse;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaaaa (Ljava/util/concurrent/CompletableFuture;Ljava/lang/String;Ljava/net/http/HttpResponse;)V, ()V ]
      // c1: invokevirtual net/minecraft/class_310.execute (Ljava/lang/Runnable;)V
      // c4: goto d3
      // c7: astore 6
      // c9: aload 6
      // cb: pop
      // cc: aload 5
      // ce: aconst_null
      // cf: invokevirtual java/util/concurrent/CompletableFuture.complete (Ljava/lang/Object;)Z
      // d2: pop
      // d3: aload 5
      // d5: areturn
   }

   private static int abbabb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1619051281, 1878046535 ^ -916732534);
      if (abbb[var3] == null) {
         abbb[var3] = (int)(aaa[var3] ^ var1);
      }

      return abbb[var3];
   }

   private void abbbaa() {
      this.abbaa = null;
      this.bbab = false;
      this.abaa = "";
   }
}
