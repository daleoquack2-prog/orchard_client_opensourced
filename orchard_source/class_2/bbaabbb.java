package nsc;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.metadata.ModMetadata;

@Environment(EnvType.CLIENT)
public final class bbaabbb {
   private static final ababbbbaa aa;
   private static final int[] abbb;
   private static final String[] ab;
   private final aababbaaa ba = abb();
   private static final Duration bb;
   static final boolean aaa = false;
   static final ababbbbaa aab;
   private static final Integer[] aba;
   private static final ababbbbaa abb;
   private static final ababbbbaa baa;
   private static final ababbbbaa bab;
   static final ababbbbaa bba;
   private volatile CompletableFuture b;
   static final ababbbbaa bbb;
   private static final long a;
   private static final String[] aaaa;
   static final ababbbbaa aaab;
   private static final HttpClient aaba;
   private static final long[] aabb;
   private static final String[] baaa;
   private static final int abaa;
   private static final Object[] baab;
   private volatile aabaaba abab = aabaaba.b(this.ba);
   private volatile long abba;

   private Void aa(HttpResponse param1, Throwable param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 2
      // 05: ifnonnull 5e
      // 08: aload 1
      // 09: iload 3
      // 0a: ifne 19
      // 0d: goto 11
      // 10: athrow
      // 11: ifnull 5e
      // 14: goto 18
      // 17: athrow
      // 18: aload 1
      // 19: iload 3
      // 1a: ifne 3e
      // 1d: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 22: ldc 1390899570
      // 24: ldc 1241777380
      // 26: ldc -628866843
      // 28: ixor
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.a (II)I
      // 2c: ldc2_w 650622709252397121
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bab (IJ)I
      // 32: if_icmplt 5e
      // 35: goto 39
      // 38: athrow
      // 39: aload 1
      // 3a: goto 3e
      // 3d: athrow
      // 3e: iload 3
      // 3f: ifne 72
      // 42: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 47: ldc 1390899571
      // 49: ldc 1241777380
      // 4b: ldc -21634582
      // 4d: ixor
      // 4e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.a (II)I
      // 51: ldc2_w 3315532199564237229
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bab (IJ)I
      // 57: if_icmplt 6c
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 0
      // 60: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa;
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba.bb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba;
      // 66: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba;
      // 69: aconst_null
      // 6a: areturn
      // 6b: athrow
      // 6c: aload 1
      // 6d: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 72: checkcast java/lang/String
      // 75: astore 4
      // 77: iload 3
      // 78: ifne cb
      // 7b: aload 4
      // 7d: ifnull bc
      // 80: goto 84
      // 83: athrow
      // 84: aload 4
      // 86: iload 3
      // 87: ifne 9e
      // 8a: goto 8e
      // 8d: athrow
      // 8e: invokevirtual java/lang/String.isBlank ()Z
      // 91: ifne bc
      // 94: goto 98
      // 97: athrow
      // 98: aload 4
      // 9a: goto 9e
      // 9d: athrow
      // 9e: iload 3
      // 9f: ifne cf
      // a2: invokevirtual java/lang/String.length ()I
      // a5: ldc 1390899568
      // a7: ldc 1241777380
      // a9: ldc 1201837588
      // ab: ixor
      // ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.a (II)I
      // af: ldc2_w 724100529237657847
      // b2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bab (IJ)I
      // b5: if_icmple cd
      // b8: goto bc
      // bb: athrow
      // bc: aload 0
      // bd: aload 0
      // be: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa;
      // c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba.bb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba;
      // c4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba;
      // c7: goto cb
      // ca: athrow
      // cb: aconst_null
      // cc: areturn
      // cd: aload 4
      // cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.baa (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbab;
      // d2: astore 5
      // d4: aload 0
      // d5: aload 0
      // d6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa;
      // d9: aload 5
      // db: aload 0
      // dc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa;
      // df: aload 5
      // e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.aba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbab;)Z
      // e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba.aaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbab;Z)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba;
      // e7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba;
      // ea: goto fa
      // ed: astore 5
      // ef: aload 0
      // f0: aload 0
      // f1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa;
      // f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba.bb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba;
      // f7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaba;
      // fa: aconst_null
      // fb: areturn
   }

   private static int a(int var0, int var1) {
      int var2 = abbb[var0 ^ 1390899570] ^ var1 ^ var0;
      var2 ^= 28194;
      var2 += 46170;
      var2 -= 35239;
      var2 -= 18224;
      var2 ^= 4003;
      var2 += 4950;
      var2 -= 50196;
      var2 += 12704;
      return var2 + 45772;
   }

   private static String ab(int var0, int var1) {
      int var9 = 108548189;
      int var2 = (var0 ^ a(1390899529, var9 ^ -1963392924)) & a(1390899534, var9 ^ 1610076677);
      if (ab[var2] == null) {
         char[] var3 = aaaa[var2].toCharArray();

         int var4 = switch (var3[0] & a(1390899535, var9 ^ 452778281)) {
            case 0 -> a(1390899532, var9 ^ -1136040908);
            case 1 -> a(1390899533, var9 ^ -265771951);
            case 2 -> a(1390899506, var9 ^ -1362623371);
            case 3 -> a(1390899507, var9 ^ -781108314);
            case 4 -> a(1390899504, var9 ^ -76782397);
            case 5 -> a(1390899505, var9 ^ -1435282586);
            case 6 -> a(1390899510, var9 ^ -1743075538);
            case 7 -> a(1390899511, var9 ^ 884410722);
            case 8 -> a(1390899508, var9 ^ 1368336915);
            case 9 -> a(1390899509, var9 ^ -1954244233);
            case 10 -> a(1390899514, var9 ^ 1888235880);
            case 11 -> a(1390899515, var9 ^ 1555002317);
            case 12 -> a(1390899512, var9 ^ 1069222734);
            case 13 -> 3;
            case 14 -> a(1390899513, var9 ^ 1505502823);
            case 15 -> a(1390899518, var9 ^ 344333819);
            case 16 -> a(1390899519, var9 ^ -1510714903);
            case 17 -> a(1390899516, var9 ^ 240310341);
            case 18 -> a(1390899517, var9 ^ -896901242);
            case 19 -> a(1390899490, var9 ^ -493097003);
            case 20 -> a(1390899491, var9 ^ -1053170163);
            case 21 -> a(1390899488, var9 ^ 173141445);
            case 22 -> a(1390899489, var9 ^ -1047603119);
            case 23 -> a(1390899494, var9 ^ 1923888497);
            case 24 -> a(1390899495, var9 ^ 964882193);
            case 25 -> a(1390899492, var9 ^ -647962465);
            case 26 -> a(1390899493, var9 ^ -1586324367);
            case 27 -> a(1390899498, var9 ^ 1486895988);
            case 28 -> a(1390899499, var9 ^ 593348381);
            case 29 -> a(1390899496, var9 ^ -783825855);
            case 30 -> a(1390899497, var9 ^ 831804607);
            case 31 -> a(1390899502, var9 ^ 581773780);
            case 32 -> a(1390899503, var9 ^ -1264394557);
            case 33 -> a(1390899500, var9 ^ -734081271);
            case 34 -> a(1390899501, var9 ^ -1996263209);
            case 35 -> a(1390899474, var9 ^ 1112029616);
            case 36 -> a(1390899475, var9 ^ 563809765);
            case 37 -> a(1390899472, var9 ^ -1433847752);
            case 38 -> a(1390899473, var9 ^ -286223189);
            case 39 -> a(1390899478, var9 ^ 1197246740);
            case 40 -> a(1390899479, var9 ^ -106632883);
            case 41 -> a(1390899476, var9 ^ 1560215365);
            case 42 -> a(1390899477, var9 ^ 503748780);
            case 43 -> a(1390899482, var9 ^ 251075544);
            case 44 -> a(1390899483, var9 ^ -995462202);
            case 45 -> a(1390899480, var9 ^ 1706128173);
            case 46 -> a(1390899481, var9 ^ -555521916);
            case 47 -> a(1390899486, var9 ^ 1509510349);
            case 48 -> a(1390899487, var9 ^ 225622789);
            case 49 -> a(1390899484, var9 ^ 958131298);
            case 50 -> a(1390899485, var9 ^ 245265978);
            case 51 -> a(1390899458, var9 ^ 1299459828);
            case 52 -> a(1390899459, var9 ^ 1388800236);
            case 53 -> a(1390899456, var9 ^ 1150166686);
            case 54 -> a(1390899457, var9 ^ -1666206523);
            case 55 -> a(1390899462, var9 ^ 1836609854);
            case 56 -> a(1390899463, var9 ^ 200679013);
            case 57 -> a(1390899460, var9 ^ -2077886430);
            case 58 -> a(1390899461, var9 ^ 1284701562);
            case 59 -> a(1390899466, var9 ^ -334757541);
            case 60 -> a(1390899467, var9 ^ -1298917944);
            case 61 -> a(1390899464, var9 ^ -1856143739);
            case 62 -> a(1390899465, var9 ^ 1295164487);
            case 63 -> a(1390899470, var9 ^ 1302314576);
            case 64 -> a(1390899471, var9 ^ 833804450);
            case 65 -> a(1390899468, var9 ^ 1937036266);
            case 66 -> a(1390899469, var9 ^ -1262584758);
            case 67 -> a(1390899698, var9 ^ 49164714);
            case 68 -> a(1390899699, var9 ^ 957178100);
            case 69 -> a(1390899696, var9 ^ 27837003);
            case 70 -> a(1390899697, var9 ^ -684963607);
            case 71 -> a(1390899702, var9 ^ 1156632833);
            case 72 -> a(1390899703, var9 ^ 1757097772);
            case 73 -> a(1390899700, var9 ^ 845939496);
            case 74 -> a(1390899701, var9 ^ 342265450);
            case 75 -> a(1390899706, var9 ^ 281125268);
            case 76 -> a(1390899707, var9 ^ 1381634266);
            case 77 -> a(1390899704, var9 ^ 1400256823);
            case 78 -> a(1390899705, var9 ^ 2121179390);
            case 79 -> a(1390899710, var9 ^ 2124974339);
            case 80 -> a(1390899711, var9 ^ 1479183548);
            case 81 -> a(1390899708, var9 ^ -954664439);
            case 82 -> a(1390899709, var9 ^ -1513335716);
            case 83 -> a(1390899682, var9 ^ 742887363);
            case 84 -> a(1390899683, var9 ^ -297261064);
            case 85 -> a(1390899680, var9 ^ -1979526539);
            case 86 -> a(1390899681, var9 ^ -1965826916);
            case 87 -> a(1390899686, var9 ^ 1360652213);
            case 88 -> a(1390899687, var9 ^ -1845521500);
            case 89 -> a(1390899684, var9 ^ 1981009149);
            case 90 -> a(1390899685, var9 ^ -410279759);
            case 91 -> a(1390899690, var9 ^ -2127592533);
            case 92 -> a(1390899691, var9 ^ -1404915476);
            case 93 -> a(1390899688, var9 ^ -163187752);
            case 94 -> a(1390899689, var9 ^ -994825670);
            case 95 -> a(1390899694, var9 ^ 779059655);
            case 96 -> a(1390899695, var9 ^ -1108036569);
            case 97 -> a(1390899692, var9 ^ 922721560);
            case 98 -> a(1390899693, var9 ^ 1189997302);
            case 99 -> a(1390899666, var9 ^ -818374674);
            case 100 -> a(1390899667, var9 ^ -1977891302);
            case 101 -> a(1390899664, var9 ^ -1950607130);
            case 102 -> a(1390899665, var9 ^ 609380542);
            case 103 -> a(1390899670, var9 ^ -528564745);
            case 104 -> a(1390899671, var9 ^ -1702177120);
            case 105 -> a(1390899668, var9 ^ -219992052);
            case 106 -> a(1390899669, var9 ^ 382073072);
            case 107 -> a(1390899674, var9 ^ 721920312);
            case 108 -> a(1390899675, var9 ^ 1521992023);
            case 109 -> a(1390899672, var9 ^ -1215138409);
            case 110 -> 2;
            case 111 -> a(1390899673, var9 ^ -63480494);
            case 112 -> a(1390899678, var9 ^ 974272801);
            case 113 -> a(1390899679, var9 ^ 1755642782);
            case 114 -> a(1390899676, var9 ^ 470431220);
            case 115 -> a(1390899677, var9 ^ -37038254);
            case 116 -> a(1390899650, var9 ^ -620457351);
            case 117 -> a(1390899651, var9 ^ 1536934287);
            case 118 -> a(1390899648, var9 ^ 1386748089);
            case 119 -> a(1390899649, var9 ^ 868971208);
            case 120 -> a(1390899654, var9 ^ 2025921635);
            case 121 -> a(1390899655, var9 ^ 1922532534);
            case 122 -> a(1390899652, var9 ^ 249161549);
            case 123 -> a(1390899653, var9 ^ -1738236223);
            case 124 -> a(1390899658, var9 ^ -289987194);
            case 125 -> a(1390899659, var9 ^ 1636866300);
            case 126 -> a(1390899656, var9 ^ -186179014);
            case 127 -> a(1390899657, var9 ^ -723781361);
            case 128 -> a(1390899662, var9 ^ 195718686);
            case 129 -> a(1390899663, var9 ^ 433987680);
            case 130 -> a(1390899660, var9 ^ 1842025066);
            case 131 -> a(1390899661, var9 ^ 1593667129);
            case 132 -> a(1390899634, var9 ^ -608204786);
            case 133 -> a(1390899635, var9 ^ -1529577112);
            case 134 -> a(1390899632, var9 ^ -1099622097);
            case 135 -> a(1390899633, var9 ^ -587704278);
            case 136 -> a(1390899638, var9 ^ -1373121188);
            case 137 -> 4;
            case 138 -> a(1390899639, var9 ^ 131723253);
            case 139 -> a(1390899636, var9 ^ -881992162);
            case 140 -> a(1390899637, var9 ^ 2027085795);
            case 141 -> a(1390899642, var9 ^ 1295322311);
            case 142 -> a(1390899643, var9 ^ -1569367986);
            case 143 -> a(1390899640, var9 ^ -274203430);
            case 144 -> a(1390899641, var9 ^ 874263864);
            case 145 -> a(1390899646, var9 ^ -182681796);
            case 146 -> a(1390899647, var9 ^ -400859228);
            case 147 -> a(1390899644, var9 ^ 1231454461);
            case 148 -> 1;
            case 149 -> a(1390899645, var9 ^ -755457473);
            case 150 -> 0;
            case 151 -> a(1390899618, var9 ^ 89829941);
            case 152 -> a(1390899619, var9 ^ -823237555);
            case 153 -> a(1390899616, var9 ^ -1032411552);
            case 154 -> a(1390899617, var9 ^ 706815173);
            case 155 -> a(1390899622, var9 ^ 251880667);
            case 156 -> a(1390899623, var9 ^ -838029013);
            case 157 -> a(1390899620, var9 ^ -1313248150);
            case 158 -> a(1390899621, var9 ^ -449834143);
            case 159 -> a(1390899626, var9 ^ 1981105666);
            case 160 -> a(1390899627, var9 ^ 1063909410);
            case 161 -> a(1390899624, var9 ^ 905017854);
            case 162 -> a(1390899625, var9 ^ 1605633538);
            case 163 -> a(1390899630, var9 ^ 692779687);
            case 164 -> a(1390899631, var9 ^ -2116202169);
            case 165 -> a(1390899628, var9 ^ 863335922);
            case 166 -> a(1390899629, var9 ^ 1185578166);
            case 167 -> a(1390899602, var9 ^ 41178398);
            case 168 -> a(1390899603, var9 ^ -1925313487);
            case 169 -> a(1390899600, var9 ^ 2097504662);
            case 170 -> a(1390899601, var9 ^ -1850086214);
            case 171 -> a(1390899606, var9 ^ 1544901552);
            case 172 -> a(1390899607, var9 ^ 1587756713);
            case 173 -> a(1390899604, var9 ^ 81026679);
            case 174 -> a(1390899605, var9 ^ -1439342251);
            case 175 -> a(1390899610, var9 ^ -684155537);
            case 176 -> a(1390899611, var9 ^ 553333808);
            case 177 -> a(1390899608, var9 ^ 740982608);
            case 178 -> a(1390899609, var9 ^ 57779651);
            case 179 -> a(1390899614, var9 ^ -896903182);
            case 180 -> a(1390899615, var9 ^ 824383832);
            case 181 -> 5;
            case 182 -> a(1390899612, var9 ^ -238589234);
            case 183 -> a(1390899613, var9 ^ 760611315);
            case 184 -> a(1390899586, var9 ^ 2072164353);
            case 185 -> a(1390899587, var9 ^ 1629089442);
            case 186 -> a(1390899584, var9 ^ -1237859055);
            case 187 -> a(1390899585, var9 ^ -213496251);
            case 188 -> a(1390899590, var9 ^ 460717591);
            case 189 -> a(1390899591, var9 ^ 1921658371);
            case 190 -> a(1390899588, var9 ^ -1805760293);
            case 191 -> a(1390899589, var9 ^ 109573263);
            case 192 -> a(1390899594, var9 ^ -286396252);
            case 193 -> a(1390899595, var9 ^ -1169778178);
            case 194 -> a(1390899592, var9 ^ -2015111067);
            case 195 -> a(1390899593, var9 ^ -1444574651);
            case 196 -> a(1390899598, var9 ^ -2115843169);
            case 197 -> a(1390899599, var9 ^ 533098488);
            case 198 -> a(1390899596, var9 ^ 1281486683);
            case 199 -> a(1390899597, var9 ^ -410779409);
            case 200 -> a(1390899314, var9 ^ 718354784);
            case 201 -> a(1390899315, var9 ^ -1185947057);
            case 202 -> a(1390899312, var9 ^ 2008289364);
            case 203 -> a(1390899313, var9 ^ -1539385949);
            case 204 -> a(1390899318, var9 ^ 910622875);
            case 205 -> a(1390899319, var9 ^ 1614128189);
            case 206 -> a(1390899316, var9 ^ -298742321);
            case 207 -> a(1390899317, var9 ^ 1242357365);
            case 208 -> a(1390899322, var9 ^ -1756764209);
            case 209 -> a(1390899323, var9 ^ -554383241);
            case 210 -> a(1390899320, var9 ^ 1008717021);
            case 211 -> a(1390899321, var9 ^ -458043125);
            case 212 -> a(1390899326, var9 ^ 1734803581);
            case 213 -> a(1390899327, var9 ^ -139258319);
            case 214 -> a(1390899324, var9 ^ -1359964176);
            case 215 -> a(1390899325, var9 ^ 2122145223);
            case 216 -> a(1390899298, var9 ^ 406981305);
            case 217 -> a(1390899299, var9 ^ -99024538);
            case 218 -> a(1390899296, var9 ^ -668770128);
            case 219 -> a(1390899297, var9 ^ -1686005105);
            case 220 -> a(1390899302, var9 ^ 1081437475);
            case 221 -> a(1390899303, var9 ^ -1868247185);
            case 222 -> a(1390899300, var9 ^ 1538235813);
            case 223 -> a(1390899301, var9 ^ 842999429);
            case 224 -> a(1390899306, var9 ^ -1909001191);
            case 225 -> a(1390899307, var9 ^ 1384325310);
            case 226 -> a(1390899304, var9 ^ -1998682794);
            case 227 -> a(1390899305, var9 ^ -1943685655);
            case 228 -> a(1390899310, var9 ^ -859281687);
            case 229 -> a(1390899311, var9 ^ -698448560);
            case 230 -> a(1390899308, var9 ^ -1692414281);
            case 231 -> a(1390899309, var9 ^ 1378444972);
            case 232 -> a(1390899282, var9 ^ 1975365607);
            case 233 -> a(1390899283, var9 ^ -1938002174);
            case 234 -> a(1390899280, var9 ^ 633885439);
            case 235 -> a(1390899281, var9 ^ -1084774419);
            case 236 -> a(1390899286, var9 ^ 331293340);
            case 237 -> a(1390899287, var9 ^ 860072708);
            case 238 -> a(1390899284, var9 ^ 769294161);
            case 239 -> a(1390899285, var9 ^ -1027765781);
            case 240 -> a(1390899290, var9 ^ -1787610418);
            case 241 -> a(1390899291, var9 ^ -644224218);
            case 242 -> a(1390899288, var9 ^ -1228231164);
            case 243 -> a(1390899289, var9 ^ 1559691534);
            case 244 -> a(1390899294, var9 ^ 1977537385);
            case 245 -> a(1390899295, var9 ^ -1973097169);
            case 246 -> a(1390899292, var9 ^ -867593625);
            case 247 -> a(1390899293, var9 ^ -272315839);
            case 248 -> a(1390899266, var9 ^ 1443343738);
            case 249 -> a(1390899267, var9 ^ -698872897);
            case 250 -> a(1390899264, var9 ^ 252673442);
            case 251 -> a(1390899265, var9 ^ 62222492);
            case 252 -> a(1390899270, var9 ^ -566996230);
            case 253 -> a(1390899271, var9 ^ 638318938);
            case 254 -> a(1390899268, var9 ^ -2030007895);
            default -> a(1390899269, var9 ^ -1918228663);
         };
         int var5 = (var1 & a(1390899274, var9 ^ -626764121)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1390899275, var9 ^ -1552206466)) >>> a(1390899272, var9 ^ -1735806565)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1390899273, var9 ^ -1588306108);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1390899278, var9 ^ 179286297);
            }
         }

         ab[var2] = new String(var3).intern();
      }

      return ab[var2];
   }

   void ba() {
      this.b = null;
      this.abab = aabaaba.b(this.ba);
   }

   private static String bb(String param0) {
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
      // 06: ifne 47
      // 09: ifnull 23
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 49
      // 15: goto 19
      // 18: athrow
      // 19: invokevirtual java/lang/String.isBlank ()Z
      // 1c: ifeq 48
      // 1f: goto 23
      // 22: athrow
      // 23: ldc_w 1390899279
      // 26: ldc_w -197176587
      // 29: ldc_w 1814723095
      // 2c: ixor
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.a (II)I
      // 30: ldc_w 1390899276
      // 33: ldc_w -197176587
      // 36: ldc_w 1451246951
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.a (II)I
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.ab (II)Ljava/lang/String;
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 43: goto 47
      // 46: athrow
      // 47: areturn
      // 48: aload 0
      // 49: ldc_w 1390899277
      // 4c: ldc_w -197176587
      // 4f: ldc_w -2094823993
      // 52: ixor
      // 53: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.a (II)I
      // 56: ldc2_w 5904061074025545194
      // 59: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bab (IJ)I
      // 5c: invokevirtual java/lang/String.indexOf (I)I
      // 5f: istore 2
      // 60: iload 2
      // 61: iflt 6e
      // 64: aload 0
      // 65: bipush 0
      // 66: iload 2
      // 67: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 6a: goto 6f
      // 6d: athrow
      // 6e: aload 0
      // 6f: areturn
   }

   static String aaa(String param0, int param1) {
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
      // 06: ifne 47
      // 09: ifnull 23
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 4b
      // 15: goto 19
      // 18: athrow
      // 19: invokevirtual java/lang/String.isBlank ()Z
      // 1c: ifeq 4a
      // 1f: goto 23
      // 22: athrow
      // 23: ldc_w 1390899250
      // 26: ldc_w -1966270824
      // 29: ldc_w 263306894
      // 2c: ixor
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.a (II)I
      // 30: ldc_w 1390899251
      // 33: ldc_w -1966270824
      // 36: ldc_w -839331628
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.a (II)I
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.ab (II)Ljava/lang/String;
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 43: goto 47
      // 46: athrow
      // 47: goto 4e
      // 4a: aload 0
      // 4b: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 4e: astore 3
      // 4f: iload 1
      // 50: ifle 98
      // 53: aload 3
      // 54: ldc_w 1390899248
      // 57: ldc_w -1966270824
      // 5a: ldc_w -1327567040
      // 5d: ixor
      // 5e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.a (II)I
      // 61: ldc_w 1390899249
      // 64: ldc_w -1966270824
      // 67: ldc_w -23301574
      // 6a: ixor
      // 6b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.a (II)I
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.ab (II)Ljava/lang/String;
      // 71: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 74: iload 1
      // 75: istore 6
      // 77: astore 5
      // 79: astore 4
      // 7b: new java/lang/StringBuilder
      // 7e: dup
      // 7f: invokespecial java/lang/StringBuilder.<init> ()V
      // 82: aload 4
      // 84: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 87: aload 5
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8c: iload 6
      // 8e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 91: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 94: goto 99
      // 97: athrow
      // 98: aload 3
      // 99: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = 215642584;
      byte var30 = -1;
      short var23 = 11113;
      String var24 = "ﷳ\ufdd8﵊ﴽﵯﴜﵺﶟ\ufde2﵃\ufdc9ﴯﶫ\ufdeaﴣﶽﷅﴌﶮﴺ﵂\ufde2\ufdddﶛﵿ\ufdecﶵﶸﴰ﵍ﵼﴍﴥﴵﶯ﵄﵇ﴰﵖ\ufdcaﷹﷆﷵﴤﷀ﷏ﶅﵒﵮ\ufddcﵖ\ufdddﶅﶰﶸﷹﶅﷻﶣﴵﴭ\ufdecﴨ\ufde7ﷺ\ufddaﵟﵗﶯﵭﴗ\ufdd6ﵶﴠ\ufde5\ufde6\ufdebﴬﶨﴯﵵﶤﴜﵶﵾﷁﶩﵴﴭﵒ\ufdd1ﴄﵵﴨﷆ﵏ﵯﴞﶇ\ufddeﵐ\ufdee\ufdd6\ufdd9ﵩﵧﶎ﵎ﶢﶣﶰﶩﶕﴇﵨﵫﷇ﵏﵅ﶨﴔﵣﶝﶇﶾﷅﴕﴅﶅﷀﵨﶱﵹﴥ\ufde9ﴅﴴﴽﵤﶞﶉﵴﴖ﷏\ufde1ﴇﵹ\ufdd7\ufdeaﶅﴢﵖﶋ﵊ﶤﶏﴴ\ufd90\ufd91\ufdd5ﶉﴷ\ufde3ﴱﴂﵐﴤﵟﴅ\ufde0ﴘﶕﶱﶔﵒﶲ﴾\ufdd3ﷂﵐ\ufdd2ﵵ\ufdccﶽ\ufd91ﶳﴝﴣﶎﷱﴧﵓﷴﴄﴤﷱ﵃\ufde3\ufddeﵭ﵏\ufdd3\ufddeﴴﵸ\ufdd0ﴊﴆ\ufdd1ﶂﶝﴈﷴﴙﷆﶞ\ufde8ﵾﶗﴝ\ufdecﵓ\ufd91ﴙﵨﵸﷻ\ufdeaﶎﴃﵾﵔﷲ\ufde2\ufde8ﷹﶛﴮﴼﶒ\ufdebﷳﵿﶗﴀﵜﴢ\ufde0ﶆﶝﵒ嗓唆唳唹嗪嗝嗜嗧啞啊啛啀喞唷嗉喁嗀喗喒喐啦唞嗦啈啓唪唛唸嗒唑喧啒啕喳嗥嗓啍啀啺嗯喻啚嗅唭唅悏恶惰恚悗惫怢惰悸惄恔怆惛惯怴总悃恎恐惐悒怯恻恠솀섆섐솦섰셢셈셷솏솜\ufae1瞧視喝犯勉﨏行響\ufae3荒嬨画襁諸喝캰츶츠캖츀칒칸칇캿캬ፆ᎑ᎬጰᏇ፺Ꮫᏻጭ፩Ꮘ፟\u139aᏌᏉᏹ鐃钅钓鐥钳铡铋铴鐌鐟";
      char[] var25 = "û-\u0018\n\u0010\n\u0010\n".toCharArray();
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         char var28 = 0;
         char var29 = '\u0000';
         if (var30 == 0) {
            baaa = var26;
            baab = new Object[var26.length];
            byte var39 = 0;
            int var10001 = 0;
            abbb = new int[339];
            byte[] var10002 = "\biqø,X\u0091Q\u0095O\u0098XöÜVÇm|V\u0092N\u0090/1s²Ûy'±hý²ù*O¡\u0002öøá\u0019%-T\u0095$ç@òÉ\u0003\u0002~J,\"\fb:rãì.àh6õ\u0012ú¾Øn\u008d\u0086Ûê\\\fI÷\u009eëg\u0004\u0085Õ\u0097Ö·/¿üj\u0001\u009bB\u0097\u0013nw)¾±Ækn\u0099©KÙ~°÷æëëWO\u0082Þ!µæ\u0006\u008dDk\u0007{Õ%\u008e7î×ú\u0012]\tx\u000e\u0099Ã=[T\u001e\u00100x1$\u0010¯w:Kq\u008e\u0093[_wÄ@\u001dm\u0002?\u009a×¨úà9Î\u009cÀËP1\u000bS{,©û\u0098ët\u0016\t©ôÁ\f>\u0096º#¥hSîo¥tæt\u0099<j\u008a2ÛC*\u0099-\t¥.|ìÒ\u0016¬\u000b\u0012|³BÒÇÊ\u0014h6/Áf\u0000Ð{\u00924ýÝ'\u0089e\u0091FIxÏ¦éÃ°\u001fÖW\u009a\u0002\u0089\u0015Ë\u001d¾¡ùt*\"UÙä[0áø\u0099êêt\u009f\u0011âãá=Á\u009fÿ^Õæ\u00198ÒË\u009auèð\u0089Ä\u009a\u0083wo<5\u000e«ä²\u009c\u0083õ=[ W\u000b{k?\u0000; à5q\u0013ÂØ}Xì=¸¸\u000e\rEÀ\u001cq\u00889ÎÖ}B3*b°))PPú¹ CÃÄúÕÌ3ëµP\u001d\u008dèm\u009d¤#&ÔÊ@õà\u0013ËçÕ\u0016\u008f\u009eF\u0000&2[É\u0098Ê;ç=\u0090\u0012\u0096\u007fhuto\u0099ö-¥Ä\u009e-\u0004ß\u009e\u0005¿\u008d\u0085E8\u0097¡\u0082l\u001ci¢Xu>Áoð\u009b\u000f,\u001aÃ×3©\u0085\u001c%àËæýÁY\u009b\f\u0016\u009c\u001dj\u0098ó\u000eåK\u0015\r-ü\u0010â\u008dbì\u009fÓúø\fð3\u0093²,\\I£,ñSÆPÜ5¸\u0012\u001a\u0001/ÕÐ®ãc\u0080Ü\u0003Xc\u008d2`Æ/\u00ad¶B¥ç%\u009e<^\tÕÂES\u0002ï×u\bc¤q¯Ly34ý:2\u0018Ô¡\u001f\u0000MW\u001fÆd\u00909Daº¦v\u0017\u0004Ä¢¹rM)bû\u008f&Êúël?Lë½1\u00970w5Òð\u0091~\u0082\u0017}!W\u0086åM\u0092àAn©Í,]Õ\u0097+\u001ec¥ÚÇ¥O\u0001l\u0011Ü\u009afKW\u0091p\u001f'\u00838¸®Vz|ëu+æêÒõBE<\u0085M\u0081\u0010PAûä;-\u0093\u008dÝÈw«*\u0091JiL\u0005;Ù,üÖü§ý\u009dY° [|ë5\tÊ\u0016_}dØc\u009c¤:fºj\u007fô:õ,\u001e3ÆÊÜR¥\u009fÞ\u0019¯ñ©\u0013ùiWo·\nLù\nsx\u008fÙÈV\u0000þuv\u0095\u0089Ï´µµ+wjÄ\u0083Bx°Íc\f¥ÿ\u0091?\u0093\u0083çºÑe×ÅºlJß\u001bË0½\u0096µlÏI8\u009bf·=ûª\u00033^\u0019¼\rà,[áeÃ\u001bµ¸\u008eÉ\u0011ñUrØã\u0094r\u0092°\u0089u²r(\bRö³\u0096OÊd4_¹¯\u0080\u0089Ó£\u0018KÍKOÉ nm\u0089\u0080¯b\\\u0089Ð×\u0081î\u0084^þ\u0012\u0017{\u0094$^\u0007\u0015mT\u009f\u0094ü>ÚëKH$\u0017Òà³\u0083gR\u001b\u0098Q'Ä®§c\u001a¸\u0013ìPÞ \u001ck\u008cxð×\u0001(={¾S?Íì\u008eeº³ñË[\u008cü¶VOWA\u0095ÙHMD\u0092\u00adb\u001fwÒ«äºåPMô\u0091\u0090©\u0087/L8ì\u00ad\u001aìU\u009a\u0000w\u0003^×Y(\u001a\u0092(£àz\u001b\u0013ã\u0013äÃÃõ0\u009aøgé\u0019ö\u008f\u0083\u001dþÛ(tåæ\u008d59È\u008bgFà\u008c&\u000e~¨\u0082\u0011-\u000f\u0002\u0095\u0086êí\bK¿ÕaØ!1\u0092\u0016Úü0ÅP9\u0098W)ì\u0015\u0001[wê\u008f_^\u0000+b2õö'4\u0018¿\u009a$\u0010]q >\u0085Ü=p\u0006\tìí\u0096Ýú¼Ï\u009e{\u001a\u001f\u0013±ry,æº\u009bwÒ°¹M\u008cýúïv§!\u001b\u0081vñÊ#\u0000:ÁqTSQõmïX\u0018u3íÌ²é°i\níKYÃ\u00ad¦\u008a¶·0igúq\u001d}3G\u008a\u0001\u0014ÓCÏí\u0012\u0083@D¦¾ÔÞ9K rÑÎæR-GÇL´\u0093Ô£Óeºô\u001dÖÑ¸÷\u0007$×¤B\u0089=\u0099í»\u0014°?kë\n\u0001\u0092\u00ad'\u007f1\u008eª&57iAA·6ç¡na\u0091\u0081bÛ\u009c&¿Z¾ëGe\u0015\u008aæne2ìÄËö»Êºv=êæ®ùçbQÀ:³\u0096kÁ]Ì\u0000üOþÅ©Ï¯\u0010\nG\u009f\u001d\u0095Ï\u007fßÜ¢¿¢ú\u009e½ì¸PU^Ñ\u00834´\u0019î{\u0000ú\u0018&\u000b²¾-\u000e{HcX÷å\u0004Ö}ò°\u008fw¥ò÷çÄüd\u0093§#Y&é;©co\u0000ªüô{¯á\u0092\u0003ôkõÃ"
               .getBytes("ISO-8859-1");

            int var82;
            do {
               abbb[var39] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -905020021;
               var39 += 1;
               var82 = var10001 + 4;
               var10001 += 4;
            } while (var82 < var10002.length);

            String[] var21 = new String[a(1390899569, var34 ^ -1659853437)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = aaab((byte)-44, -817658253, 21431, 107, -380652482, (byte)6)).length();
            int var17 = a(1390899574, var34 ^ 112240043);
            int var37 = -1;

            label134:
            while (true) {
               String var40 = var18.substring(++var37, var37 + var17);
               var10001 = (byte)-1;

               while (true) {
                  label129: {
                     char[] var47 = var40.toCharArray();
                     var82 = var47.length;
                     int var22 = 0;
                     var67 = var47;
                     var10001 = var82;
                     char[] var86;
                     int var103;
                     if (var82 <= 1) {
                        var86 = var47;
                        var103 = var22;
                     } else {
                        var67 = var47;
                        var10001 = var82;
                        if (var82 <= var22) {
                           break label129;
                        }

                        var86 = var47;
                        var103 = var22;
                     }

                     while (true) {
                        var86[var103] = (char)(var86[var103] ^ switch (var22 % a(1390899573, var34 ^ 1283300238)) {
                           case 0 -> a(1390899578, var34 ^ -650782415);
                           case 1 -> a(1390899579, var34 ^ -892454325);
                           case 2 -> a(1390899576, var34 ^ -1965692526);
                           case 3 -> a(1390899577, var34 ^ 1062852504);
                           case 4 -> a(1390899582, var34 ^ 725498419);
                           case 5 -> a(1390899583, var34 ^ 1773307577);
                           default -> a(1390899580, var34 ^ 1237356913);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var103 = var10001;
                           var86 = var67;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var86 = var67;
                           var103 = var22;
                        }
                     }
                  }

                  String var93 = new String(var67).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var93;
                        if ((var37 += var17) >= var20) {
                           aaaa = var21;
                           ab = new String[a(1390899572, var34 ^ 410921016)];
                           long var8 = 5094049134304946381L;
                           long[] var14 = new long[5];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = aaab((byte)76, -817658255, (char)'곬', (byte)13, 1526584937, (byte)-5)).length();
                           byte var10 = 0;

                           label108:
                           while (true) {
                              int var54 = var10;
                              var10 += 8;
                              byte[] var15 = var12.substring(var54, var10).getBytes(aaab((byte)-42, -817658256, 'ᄇ', 94, -989279500, 124));
                              long[] var42 = var14;
                              var54 = var11++;
                              long var73 = (var15[0] & 255L) << a(1390899581, var34 ^ 422518916)
                                 | (var15[1] & 255L) << a(1390899554, var34 ^ -1952122248)
                                 | (var15[2] & 255L) << a(1390899555, var34 ^ 2033601948)
                                 | (var15[3] & 255L) << a(1390899552, var34 ^ 88176004)
                                 | (var15[4] & 255L) << a(1390899553, var34 ^ -2121203937)
                                 | (var15[5] & 255L) << a(1390899558, var34 ^ -1672341426)
                                 | (var15[a(1390899559, var34 ^ 1867065081)] & 255L) << a(1390899556, var34 ^ -1115956004)
                                 | var15[a(1390899557, var34 ^ -1750666504)] & 255L;
                              byte var94 = -1;

                              while (true) {
                                 long var105 = var73 ^ var8;
                                 switch (var94) {
                                    case 0:
                                       var42[var54] = var105;
                                       if (var10 >= var13) {
                                          aabb = var14;
                                          aba = new Integer[5];
                                          abaa = bab(a(1390899539, var34 ^ 436526303), 5152665187310489162L);
                                          long var1 = 5550177986775946039L;
                                          long[] var0 = new long[2];
                                          int var4 = 0;
                                          String var5;
                                          int var6 = (var5 = aaab((byte)-95, -817658251, (char)'踌', (byte)-50, -82671849, (byte)-76)).length();
                                          byte var3 = 0;

                                          do {
                                             int var57 = var3;
                                             var3 += 8;
                                             byte[] var7 = var5.substring(var57, var3).getBytes(aaab((byte)-68, -817658252, '⁷', (byte)-91, 127488431, 65));
                                             var57 = var4++;
                                             var105 = (
                                                   (var7[0] & 255L) << a(1390899536, var34 ^ -1847684722)
                                                      | (var7[1] & 255L) << a(1390899537, var34 ^ 331502973)
                                                      | (var7[2] & 255L) << a(1390899542, var34 ^ 1452779375)
                                                      | (var7[3] & 255L) << a(1390899543, var34 ^ 2080148313)
                                                      | (var7[4] & 255L) << a(1390899540, var34 ^ 1339841556)
                                                      | (var7[5] & 255L) << a(1390899541, var34 ^ 1367835284)
                                                      | (var7[a(1390899546, var34 ^ -124277724)] & 255L) << a(1390899547, var34 ^ -1349718479)
                                                      | var7[a(1390899544, var34 ^ 1777559945)] & 255L
                                                )
                                                ^ var1;
                                             var94 = -1;
                                             var0[var57] = var105;
                                          } while (var3 < var6);

                                          a = var0[0];
                                          bbb = aabbaaaba.aaab(
                                             ab(a(1390899545, var34 ^ 1019869102), a(1390899550, var34 ^ -1521455211))
                                          );
                                          bba = aabbaaaba.aaab(
                                             ab(a(1390899551, var34 ^ -1006494588), a(1390899548, var34 ^ 283168510))
                                          );
                                          aaab = aabbaaaba.aaab(
                                             ab(a(1390899549, var34 ^ 215507962), a(1390899522, var34 ^ 1650833566))
                                          );
                                          aab = aabbaaaba.aaab(
                                             ab(a(1390899523, var34 ^ -1743945370), a(1390899520, var34 ^ -1214882069))
                                          );
                                          baa = aabbaaaba.aaab(
                                             ab(a(1390899521, var34 ^ 2052895420), a(1390899526, var34 ^ -1917290227))
                                          );
                                          aa = aabbaaaba.aaab(
                                             ab(a(1390899527, var34 ^ -21420775), a(1390899524, var34 ^ -686182506))
                                          );
                                          bab = aabbaaaba.aaab(
                                             ab(a(1390899525, var34 ^ -1651099227), a(1390899530, var34 ^ -2028033248))
                                          );
                                          abb = aabbaaaba.aaab(
                                             ab(a(1390899531, var34 ^ -1625199796), a(1390899528, var34 ^ -689835542))
                                          );
                                          bb = Duration.ofSeconds(var0[1]);
                                          aaba = HttpClient.newBuilder().connectTimeout(bb).followRedirects(Redirect.NORMAL).build();
                                          return;
                                       }
                                       break;
                                    default:
                                       var42[var54] = var105;
                                       if (var10 < var13) {
                                          continue label108;
                                       }

                                       var13 = (var12 = aaab(56, -817658249, '읅', (byte)-97, 1724131202, (byte)98)).length();
                                       var10 = 0;
                                 }

                                 byte var56 = var10;
                                 var10 += 8;
                                 var15 = var12.substring(var56, var10).getBytes(aaab((byte)-121, -817658250, '遢', (byte)-45, 1150960793, (byte)-98));
                                 var42 = var14;
                                 var54 = var11++;
                                 var73 = (var15[0] & 255L) << a(1390899562, var34 ^ 693886931)
                                    | (var15[1] & 255L) << a(1390899563, var34 ^ 484799029)
                                    | (var15[2] & 255L) << a(1390899560, var34 ^ -1381524010)
                                    | (var15[3] & 255L) << a(1390899561, var34 ^ -1031329240)
                                    | (var15[4] & 255L) << a(1390899566, var34 ^ -616884814)
                                    | (var15[5] & 255L) << a(1390899567, var34 ^ -2137277278)
                                    | (var15[a(1390899564, var34 ^ -1242741117)] & 255L) << a(1390899565, var34 ^ 1833023233)
                                    | var15[a(1390899538, var34 ^ 1823942257)] & 255L;
                                 var94 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var37);
                        break;
                     default:
                        var21[var19++] = var93;
                        if ((var37 += var17) < var20) {
                           var17 = var18.charAt(var37);
                           continue label134;
                        }

                        var20 = (var18 = aaab((byte)-25, -817658254, '\udd60', (byte)-73, -599747937, (byte)-125)).length();
                        var17 = a(1390899575, var34 ^ 626842633);
                        var37 = -1;
                  }

                  var40 = var18.substring(++var37, var37 + var17);
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
                  default -> 152;
                  case 1 -> 198;
                  case 2 -> 196;
                  case 3 -> 171;
                  case 4 -> 132;
               };
               var31[var32] = (char)(var31[var32] ^ var33 ^ var23);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private static int aab(JsonObject param0, String param1, int param2) {
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
      // 06: ifne 16
      // 09: ifnonnull 15
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: goto 1a
      // 14: athrow
      // 15: aload 0
      // 16: aload 1
      // 17: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1a: astore 4
      // 1c: aload 4
      // 1e: iload 3
      // 1f: ifne 2b
      // 22: ifnull 39
      // 25: goto 29
      // 28: athrow
      // 29: aload 4
      // 2b: iload 3
      // 2c: ifne 3e
      // 2f: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 32: ifeq 3c
      // 35: goto 39
      // 38: athrow
      // 39: iload 2
      // 3a: ireturn
      // 3b: athrow
      // 3c: aload 4
      // 3e: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 41: ireturn
      // 42: astore 5
      // 44: aload 5
      // 46: pop
      // 47: aload 4
      // 49: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 4c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 4f: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 52: ireturn
      // 53: astore 6
      // 55: aload 6
      // 57: pop
      // 58: iload 2
      // 59: ireturn
   }

   static boolean aba(aababbaaa param0, ababbbbab param1) {
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
      // 05: ifnull 18
      // 08: aload 1
      // 09: iload 2
      // 0a: ifne 1c
      // 0d: goto 11
      // 10: athrow
      // 11: ifnonnull 1b
      // 14: goto 18
      // 17: athrow
      // 18: bipush 0
      // 19: ireturn
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbab.b ()Ljava/lang/String;
      // 1f: astore 3
      // 20: aload 3
      // 21: iload 2
      // 22: ifne 2d
      // 25: ifnull 57
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 3
      // 2d: invokevirtual java/lang/String.isBlank ()Z
      // 30: iload 2
      // 31: ifne 5b
      // 34: ifne 57
      // 37: goto 3b
      // 3a: athrow
      // 3b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 3e: aload 3
      // 3f: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.baba (Ljava/lang/CharSequence;)Z
      // 45: iload 2
      // 46: ifne 5b
      // 49: goto 4d
      // 4c: athrow
      // 4d: ifne 57
      // 50: goto 54
      // 53: athrow
      // 54: bipush 0
      // 55: ireturn
      // 56: athrow
      // 57: aload 1
      // 58: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbab.ab ()I
      // 5b: aload 0
      // 5c: iload 2
      // 5d: ifne 7a
      // 60: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa.aa ()I
      // 63: if_icmple 6d
      // 66: goto 6a
      // 69: athrow
      // 6a: bipush 1
      // 6b: ireturn
      // 6c: athrow
      // 6d: aload 1
      // 6e: iload 2
      // 6f: ifne 85
      // 72: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbab.ab ()I
      // 75: aload 0
      // 76: goto 7a
      // 79: athrow
      // 7a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa.aa ()I
      // 7d: if_icmpne 9f
      // 80: aload 1
      // 81: goto 85
      // 84: athrow
      // 85: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbab.aa ()I
      // 88: iload 2
      // 89: ifne 9c
      // 8c: aload 0
      // 8d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa.a ()I
      // 90: if_icmple 9f
      // 93: goto 97
      // 96: athrow
      // 97: bipush 1
      // 98: goto 9c
      // 9b: athrow
      // 9c: goto a0
      // 9f: bipush 0
      // a0: ireturn
   }

   private static aababbaaa abb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 0
      // 004: invokestatic net/fabricmc/loader/api/FabricLoader.getInstance ()Lnet/fabricmc/loader/api/FabricLoader;
      // 007: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 00d: invokeinterface net/fabricmc/loader/api/FabricLoader.getModContainer (Ljava/lang/String;)Ljava/util/Optional; 2
      // 012: astore 1
      // 013: aload 1
      // 014: iload 0
      // 015: ifne 08d
      // 018: invokevirtual java/util/Optional.isPresent ()Z
      // 01b: ifne 08c
      // 01e: goto 022
      // 021: athrow
      // 022: invokestatic net/fabricmc/loader/api/FabricLoader.getInstance ()Lnet/fabricmc/loader/api/FabricLoader;
      // 025: invokeinterface net/fabricmc/loader/api/FabricLoader.getAllMods ()Ljava/util/Collection; 1
      // 02a: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 02f: astore 2
      // 030: aload 2
      // 031: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 036: ifeq 08c
      // 039: aload 2
      // 03a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03f: checkcast net/fabricmc/loader/api/ModContainer
      // 042: astore 3
      // 043: aload 3
      // 044: invokeinterface net/fabricmc/loader/api/ModContainer.getMetadata ()Lnet/fabricmc/loader/api/metadata/ModMetadata; 1
      // 049: iload 0
      // 04a: ifne 0ab
      // 04d: astore 4
      // 04f: iload 0
      // 050: ifne 080
      // 053: aload 4
      // 055: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 058: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 05b: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.containsCustomValue (Ljava/lang/String;)Z 2
      // 060: ifne 07b
      // 063: goto 067
      // 066: athrow
      // 067: aload 4
      // 069: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 06c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 06f: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.containsCustomValue (Ljava/lang/String;)Z 2
      // 074: ifeq 084
      // 077: goto 07b
      // 07a: athrow
      // 07b: aload 3
      // 07c: invokestatic java/util/Optional.of (Ljava/lang/Object;)Ljava/util/Optional;
      // 07f: astore 1
      // 080: iload 0
      // 081: ifeq 08c
      // 084: iload 0
      // 085: ifeq 030
      // 088: goto 08c
      // 08b: athrow
      // 08c: aload 1
      // 08d: iload 0
      // 08e: ifne 0a3
      // 091: invokevirtual java/util/Optional.isPresent ()Z
      // 094: ifeq 110
      // 097: goto 09b
      // 09a: athrow
      // 09b: aload 1
      // 09c: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 09f: goto 0a3
      // 0a2: athrow
      // 0a3: checkcast net/fabricmc/loader/api/ModContainer
      // 0a6: invokeinterface net/fabricmc/loader/api/ModContainer.getMetadata ()Lnet/fabricmc/loader/api/metadata/ModMetadata; 1
      // 0ab: astore 2
      // 0ac: aload 2
      // 0ad: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0b0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 0b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bbb (Lnet/fabricmc/loader/api/metadata/ModMetadata;Ljava/lang/String;)I
      // 0b6: istore 3
      // 0b7: iload 3
      // 0b8: iload 0
      // 0b9: ifne 0d8
      // 0bc: ifgt 0ce
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: aload 2
      // 0c4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0c7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 0ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bbb (Lnet/fabricmc/loader/api/metadata/ModMetadata;Ljava/lang/String;)I
      // 0cd: istore 3
      // 0ce: aload 2
      // 0cf: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0d2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 0d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bbb (Lnet/fabricmc/loader/api/metadata/ModMetadata;Ljava/lang/String;)I
      // 0d8: istore 4
      // 0da: iload 4
      // 0dc: iload 0
      // 0dd: ifne 0f5
      // 0e0: ifgt 0f7
      // 0e3: goto 0e7
      // 0e6: athrow
      // 0e7: aload 2
      // 0e8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0eb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 0ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bbb (Lnet/fabricmc/loader/api/metadata/ModMetadata;Ljava/lang/String;)I
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: istore 4
      // 0f7: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa
      // 0fa: dup
      // 0fb: aload 2
      // 0fc: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.getVersion ()Lnet/fabricmc/loader/api/Version; 1
      // 101: invokeinterface net/fabricmc/loader/api/Version.getFriendlyString ()Ljava/lang/String; 1
      // 106: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bb (Ljava/lang/String;)Ljava/lang/String;
      // 109: iload 3
      // 10a: iload 4
      // 10c: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa.<init> (Ljava/lang/String;II)V
      // 10f: areturn
      // 110: goto 114
      // 113: astore 1
      // 114: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa
      // 117: dup
      // 118: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbb.bbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 11b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 11e: bipush 0
      // 11f: bipush 0
      // 120: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbaaa.<init> (Ljava/lang/String;II)V
      // 123: areturn
   }

   private static String aaab(byte var0, int var1, char var2, byte var3, int var4, byte var5) {
      int var10 = var1 ^ -817658253;
      char[] var9 = baaa[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])baab[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         baab[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 45466;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 13) {
            default -> 249;
            case 1 -> 58;
            case 2 -> 49;
            case 3 -> 139;
            case 4 -> 32;
            case 5 -> 111;
            case 6 -> 21;
            case 7 -> 37;
            case 8 -> 169;
            case 9 -> 136;
            case 10 -> 1;
            case 11 -> 129;
            case 12 -> 53;
         } ^ 50878 ^ var8 ^ var5 ^ var4 ^ var1 ^ var2 ^ var3 ^ var7 ^ var0);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   static ababbbbab baa(String var0) {
      int var2 = 805861245;
      JsonObject var1 = JsonParser.parseString(var0).getAsJsonObject();
      return new ababbbbab(
         aaaa(var1, aabbaaaba.abba(ab(a(1390899254, var2 ^ -164588755), a(1390899255, var2 ^ -486038286)))),
         aab(var1, aabbaaaba.abba(ab(a(1390899252, var2 ^ -1474623435), a(1390899253, var2 ^ -1554794755))), -1),
         aab(var1, aabbaaaba.abba(ab(a(1390899258, var2 ^ -1499834244), a(1390899259, var2 ^ 266950364))), 0),
         aaaa(var1, aabbaaaba.abba(ab(a(1390899256, var2 ^ 2124210842), a(1390899257, var2 ^ 664177801)))),
         aaaa(var1, aabbaaaba.abba(ab(a(1390899262, var2 ^ 1594283233), a(1390899263, var2 ^ -864899680)))),
         aaaa(var1, aabbaaaba.abba(ab(a(1390899260, var2 ^ -238552795), a(1390899261, var2 ^ 25309062))))
      );
   }

   private static int bab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1390899234, 1189181086 ^ 1962192390);
      if (aba[var3] == null) {
         aba[var3] = (int)(aabb[var3] ^ var1);
      }

      return aba[var3];
   }

   aabaaba bba() {
      return this.abab;
   }

   String b() {
      String var10000 = aabbaaaba.aaab(ab(a(1390899235, 1010625633 ^ 187963677), a(1390899232, 1010625633 ^ 1354655984)))
         .abab();
      String var2 = aaa(this.ba.b(), this.ba.a());
      String var1 = var10000;
      return var1 + var2;
   }

   private static int bbb(ModMetadata param0, String param1) {
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
      // 05: ifnull 26
      // 08: aload 1
      // 09: ifnull 26
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 2a
      // 15: goto 19
      // 18: athrow
      // 19: aload 1
      // 1a: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.containsCustomValue (Ljava/lang/String;)Z 2
      // 1f: ifne 29
      // 22: goto 26
      // 25: athrow
      // 26: bipush 0
      // 27: ireturn
      // 28: athrow
      // 29: aload 0
      // 2a: aload 1
      // 2b: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.getCustomValue (Ljava/lang/String;)Lnet/fabricmc/loader/api/metadata/CustomValue; 2
      // 30: astore 3
      // 31: aload 3
      // 32: iload 2
      // 33: ifne 41
      // 36: ifnonnull 40
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: athrow
      // 40: aload 3
      // 41: invokeinterface net/fabricmc/loader/api/metadata/CustomValue.getAsNumber ()Ljava/lang/Number; 1
      // 46: astore 4
      // 48: aload 4
      // 4a: iload 2
      // 4b: ifne 5c
      // 4e: ifnonnull 5a
      // 51: goto 55
      // 54: athrow
      // 55: bipush 0
      // 56: goto 5f
      // 59: athrow
      // 5a: aload 4
      // 5c: invokevirtual java/lang/Number.intValue ()I
      // 5f: ireturn
      // 60: astore 4
      // 62: aload 3
      // 63: invokeinterface net/fabricmc/loader/api/metadata/CustomValue.getAsString ()Ljava/lang/String; 1
      // 68: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 6b: ireturn
      // 6c: astore 5
      // 6e: aload 5
      // 70: pop
      // 71: bipush 0
      // 72: ireturn
   }

   private static String aaaa(JsonObject param0, String param1) {
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
      // 06: ifne 16
      // 09: ifnonnull 15
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: goto 1a
      // 14: athrow
      // 15: aload 0
      // 16: aload 1
      // 17: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1a: astore 3
      // 1b: aload 3
      // 1c: iload 2
      // 1d: ifne 28
      // 20: ifnull 36
      // 23: goto 27
      // 26: athrow
      // 27: aload 3
      // 28: iload 2
      // 29: ifne 3e
      // 2c: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 2f: ifeq 3d
      // 32: goto 36
      // 35: athrow
      // 36: ldc_w ""
      // 39: goto 44
      // 3c: athrow
      // 3d: aload 3
      // 3e: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 41: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 44: areturn
   }
}
