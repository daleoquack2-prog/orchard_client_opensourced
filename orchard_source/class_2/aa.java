package nsc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class aa implements InvocationHandler {
   private static final int[] a;
   private static String[] aa;
   private static final String[] b;
   private static final long[] ab;
   private static final Object[] baa;
   private static final String[] abb;
   private static final long[] ba;
   private static final Long[] bb;
   private static final Integer[] aaa;
   private static final String[] aab;
   private final aaaabbbab aba;

   private aa(aaaabbbab var1) {
      this.aba = var1;
   }

   private static int b(int var0, int var1) {
      int var2 = a[var0 ^ 1380450351] ^ var1 ^ var0;
      var2 ^= 61408;
      var2 ^= 21860;
      var2 -= 49158;
      var2 -= 20033;
      var2 += 14354;
      var2 -= 3782;
      var2 ^= 35768;
      var2 -= 50674;
      return var2 ^ 49168;
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(1380450351, -926457907 ^ -887430739);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(ab[var3] ^ var1);
      }

      return aaa[var3];
   }

   private static String aaa(char var0, int var1, char var2, byte var3, short var4, int var5, char var6) {
      int var11 = var5 ^ 1593357681;
      char[] var10 = abb[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])baa[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         baa[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 59775;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ 29297 ^ switch (var9 % 17) {
            default -> 164;
            case 1 -> 222;
            case 2 -> 248;
            case 3 -> 54;
            case 4 -> 17;
            case 5 -> 38;
            case 6 -> 230;
            case 7 -> 157;
            case 8 -> 145;
            case 9 -> 99;
            case 10 -> 81;
            case 11 -> 222;
            case 12 -> 64;
            case 13 -> 88;
            case 14 -> 159;
            case 15 -> 201;
            case 16 -> 33;
         } ^ var5 ^ var0 ^ var1 ^ var3 ^ var4 ^ var8 ^ var6 ^ var2);
      } while (++var9 < var10.length);

      return new String(var10).intern();
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
      // 053: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aa.aa [Ljava/lang/String;
      // 056: bipush 1
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
      // 075: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aa.aa [Ljava/lang/String;
      // 078: bipush 2
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
      // 097: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aa.aa [Ljava/lang/String;
      // 09a: bipush 3
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
      // 0d0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aa.aa [Ljava/lang/String;
      // 0d3: bipush 0
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
      // 143: aload 0
      // 144: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbab;
      // 147: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa
      // 14a: dup
      // 14b: aload 5
      // 14d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaa.<init> (Ljava/lang/Object;)V
      // 150: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbab.a (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;)V 2
      // 155: aconst_null
      // 156: areturn
   }

   private static String ab(int var0, int var1) {
      int var9 = -478275281;
      int var2 = (var0 ^ b(1380450350, var9 ^ -1554426825)) & b(1380450349, var9 ^ -1995487368);
      if (b[var2] == null) {
         char[] var3 = aab[var2].toCharArray();

         int var4 = switch (var3[0] & b(1380450348, var9 ^ -317349408)) {
            case 0 -> b(1380450347, var9 ^ 826660408);
            case 1 -> b(1380450346, var9 ^ -1389494270);
            case 2 -> b(1380450345, var9 ^ 2019615299);
            case 3 -> b(1380450344, var9 ^ 502373357);
            case 4 -> b(1380450343, var9 ^ 1466832834);
            case 5 -> b(1380450342, var9 ^ 2034778363);
            case 6 -> b(1380450341, var9 ^ -1078830678);
            case 7 -> b(1380450340, var9 ^ -411660479);
            case 8 -> b(1380450339, var9 ^ 1391438371);
            case 9 -> b(1380450338, var9 ^ -2132317079);
            case 10 -> b(1380450337, var9 ^ 1630988504);
            case 11 -> b(1380450336, var9 ^ -386992455);
            case 12 -> b(1380450367, var9 ^ 1171866388);
            case 13 -> b(1380450366, var9 ^ 1211832134);
            case 14 -> b(1380450365, var9 ^ -2105650313);
            case 15 -> b(1380450364, var9 ^ 1660958486);
            case 16 -> 4;
            case 17 -> b(1380450363, var9 ^ -1050329682);
            case 18 -> b(1380450362, var9 ^ 205009375);
            case 19 -> b(1380450361, var9 ^ 1476011270);
            case 20 -> b(1380450360, var9 ^ -1094328585);
            case 21 -> b(1380450359, var9 ^ -735484218);
            case 22 -> b(1380450358, var9 ^ -786417825);
            case 23 -> b(1380450357, var9 ^ 1844535916);
            case 24 -> b(1380450356, var9 ^ 293411454);
            case 25 -> b(1380450355, var9 ^ -1050171304);
            case 26 -> b(1380450354, var9 ^ 799141597);
            case 27 -> 1;
            case 28 -> b(1380450353, var9 ^ -182800410);
            case 29 -> b(1380450352, var9 ^ 17666951);
            case 30 -> b(1380450319, var9 ^ -11380385);
            case 31 -> 5;
            case 32 -> b(1380450318, var9 ^ -1048198579);
            case 33 -> b(1380450317, var9 ^ -53245095);
            case 34 -> b(1380450316, var9 ^ -2034871959);
            case 35 -> b(1380450315, var9 ^ -687238269);
            case 36 -> b(1380450314, var9 ^ -847362107);
            case 37 -> b(1380450313, var9 ^ 202048985);
            case 38 -> b(1380450312, var9 ^ 2126850833);
            case 39 -> b(1380450311, var9 ^ 1006953474);
            case 40 -> b(1380450310, var9 ^ -234873911);
            case 41 -> b(1380450309, var9 ^ 1593073361);
            case 42 -> b(1380450308, var9 ^ 1260628865);
            case 43 -> b(1380450307, var9 ^ -358404499);
            case 44 -> b(1380450306, var9 ^ -1093948115);
            case 45 -> b(1380450305, var9 ^ -1928123396);
            case 46 -> b(1380450304, var9 ^ -369969637);
            case 47 -> b(1380450335, var9 ^ -1843618351);
            case 48 -> b(1380450334, var9 ^ -1094318176);
            case 49 -> b(1380450333, var9 ^ -1404315375);
            case 50 -> b(1380450332, var9 ^ 1925454225);
            case 51 -> b(1380450331, var9 ^ 1119210584);
            case 52 -> b(1380450330, var9 ^ 1086396689);
            case 53 -> b(1380450329, var9 ^ 1249363134);
            case 54 -> b(1380450328, var9 ^ 614977629);
            case 55 -> b(1380450327, var9 ^ -218745284);
            case 56 -> b(1380450326, var9 ^ 1461365708);
            case 57 -> b(1380450325, var9 ^ -1640809171);
            case 58 -> b(1380450324, var9 ^ -2078628112);
            case 59 -> b(1380450323, var9 ^ 600591576);
            case 60 -> b(1380450322, var9 ^ 2078554499);
            case 61 -> b(1380450321, var9 ^ -1639979633);
            case 62 -> b(1380450320, var9 ^ -67923700);
            case 63 -> b(1380450415, var9 ^ 141431286);
            case 64 -> b(1380450414, var9 ^ -879191759);
            case 65 -> b(1380450413, var9 ^ -974823831);
            case 66 -> b(1380450412, var9 ^ 293999979);
            case 67 -> b(1380450411, var9 ^ -986132974);
            case 68 -> b(1380450410, var9 ^ -549277165);
            case 69 -> b(1380450409, var9 ^ 167375883);
            case 70 -> b(1380450408, var9 ^ 1342866864);
            case 71 -> b(1380450407, var9 ^ 570450754);
            case 72 -> 0;
            case 73 -> b(1380450406, var9 ^ 923903746);
            case 74 -> b(1380450405, var9 ^ 1334047492);
            case 75 -> b(1380450404, var9 ^ -1911699844);
            case 76 -> b(1380450403, var9 ^ 953680652);
            case 77 -> b(1380450402, var9 ^ -1670540910);
            case 78 -> b(1380450401, var9 ^ 183438215);
            case 79 -> 2;
            case 80 -> b(1380450400, var9 ^ 1234354616);
            case 81 -> b(1380450431, var9 ^ -1534325189);
            case 82 -> b(1380450430, var9 ^ -896119246);
            case 83 -> b(1380450429, var9 ^ 1257487060);
            case 84 -> b(1380450428, var9 ^ 300020701);
            case 85 -> b(1380450427, var9 ^ 1665748043);
            case 86 -> b(1380450426, var9 ^ -1752559815);
            case 87 -> b(1380450425, var9 ^ 441371717);
            case 88 -> b(1380450424, var9 ^ 1282213316);
            case 89 -> b(1380450423, var9 ^ -2035559487);
            case 90 -> b(1380450422, var9 ^ -1960070705);
            case 91 -> b(1380450421, var9 ^ 1797753983);
            case 92 -> b(1380450420, var9 ^ -1403063830);
            case 93 -> b(1380450419, var9 ^ -522025228);
            case 94 -> b(1380450418, var9 ^ -2018143276);
            case 95 -> b(1380450417, var9 ^ -1016305195);
            case 96 -> b(1380450416, var9 ^ 1037953839);
            case 97 -> b(1380450383, var9 ^ -24500305);
            case 98 -> b(1380450382, var9 ^ 1404837298);
            case 99 -> b(1380450381, var9 ^ -471501302);
            case 100 -> b(1380450380, var9 ^ 1183842401);
            case 101 -> b(1380450379, var9 ^ -160321915);
            case 102 -> b(1380450378, var9 ^ 1462759373);
            case 103 -> b(1380450377, var9 ^ 528218312);
            case 104 -> b(1380450376, var9 ^ -128944520);
            case 105 -> b(1380450375, var9 ^ 1286474921);
            case 106 -> b(1380450374, var9 ^ -467974998);
            case 107 -> b(1380450373, var9 ^ 456762602);
            case 108 -> b(1380450372, var9 ^ 1450467369);
            case 109 -> b(1380450371, var9 ^ 261724732);
            case 110 -> b(1380450370, var9 ^ -2109916635);
            case 111 -> b(1380450369, var9 ^ 1762936247);
            case 112 -> b(1380450368, var9 ^ -85228019);
            case 113 -> b(1380450399, var9 ^ 738393207);
            case 114 -> b(1380450398, var9 ^ -731037233);
            case 115 -> b(1380450397, var9 ^ -1939471762);
            case 116 -> b(1380450396, var9 ^ -420290879);
            case 117 -> b(1380450395, var9 ^ -1144908576);
            case 118 -> b(1380450394, var9 ^ 1583227711);
            case 119 -> b(1380450393, var9 ^ -1276062280);
            case 120 -> b(1380450392, var9 ^ -49530732);
            case 121 -> b(1380450391, var9 ^ 390328420);
            case 122 -> b(1380450390, var9 ^ 415532778);
            case 123 -> b(1380450389, var9 ^ -875170342);
            case 124 -> b(1380450388, var9 ^ -203015424);
            case 125 -> b(1380450387, var9 ^ -688168017);
            case 126 -> b(1380450386, var9 ^ 2131838459);
            case 127 -> b(1380450385, var9 ^ 1731975937);
            case 128 -> b(1380450384, var9 ^ 1989668625);
            case 129 -> b(1380450479, var9 ^ -354322337);
            case 130 -> b(1380450478, var9 ^ 1988258567);
            case 131 -> b(1380450477, var9 ^ 825917725);
            case 132 -> b(1380450476, var9 ^ -1816805217);
            case 133 -> b(1380450475, var9 ^ -993615113);
            case 134 -> b(1380450474, var9 ^ 1851404438);
            case 135 -> b(1380450473, var9 ^ 1114308744);
            case 136 -> b(1380450472, var9 ^ 1737987223);
            case 137 -> b(1380450471, var9 ^ 1253743433);
            case 138 -> b(1380450470, var9 ^ -290801805);
            case 139 -> b(1380450469, var9 ^ 2071232792);
            case 140 -> b(1380450468, var9 ^ 1046591186);
            case 141 -> b(1380450467, var9 ^ -127606638);
            case 142 -> b(1380450466, var9 ^ -671103806);
            case 143 -> b(1380450465, var9 ^ 145903020);
            case 144 -> b(1380450464, var9 ^ 1246037356);
            case 145 -> b(1380450495, var9 ^ -862658385);
            case 146 -> b(1380450494, var9 ^ -1984231140);
            case 147 -> b(1380450493, var9 ^ 232757663);
            case 148 -> b(1380450492, var9 ^ -1446224243);
            case 149 -> b(1380450491, var9 ^ -1499071369);
            case 150 -> b(1380450490, var9 ^ -561947228);
            case 151 -> b(1380450489, var9 ^ 1809420231);
            case 152 -> b(1380450488, var9 ^ -1580922083);
            case 153 -> b(1380450487, var9 ^ 1099585469);
            case 154 -> b(1380450486, var9 ^ -1055437357);
            case 155 -> b(1380450485, var9 ^ -1902282710);
            case 156 -> b(1380450484, var9 ^ 673178623);
            case 157 -> 3;
            case 158 -> b(1380450483, var9 ^ -989338191);
            case 159 -> b(1380450482, var9 ^ -644129923);
            case 160 -> b(1380450481, var9 ^ -412132890);
            case 161 -> b(1380450480, var9 ^ 641697850);
            case 162 -> b(1380450447, var9 ^ 1731336406);
            case 163 -> b(1380450446, var9 ^ -1760018383);
            case 164 -> b(1380450445, var9 ^ -612585369);
            case 165 -> b(1380450444, var9 ^ 58563414);
            case 166 -> b(1380450443, var9 ^ -1617250993);
            case 167 -> b(1380450442, var9 ^ 838620853);
            case 168 -> b(1380450441, var9 ^ -1660708303);
            case 169 -> b(1380450440, var9 ^ 1091195541);
            case 170 -> b(1380450439, var9 ^ -1804301046);
            case 171 -> b(1380450438, var9 ^ -1022632470);
            case 172 -> b(1380450437, var9 ^ -1810209408);
            case 173 -> b(1380450436, var9 ^ -2037072328);
            case 174 -> b(1380450435, var9 ^ 1594699612);
            case 175 -> b(1380450434, var9 ^ -67686195);
            case 176 -> b(1380450433, var9 ^ -1373461371);
            case 177 -> b(1380450432, var9 ^ -2076164782);
            case 178 -> b(1380450463, var9 ^ -1356133017);
            case 179 -> b(1380450462, var9 ^ 2015137099);
            case 180 -> b(1380450461, var9 ^ 40388678);
            case 181 -> b(1380450460, var9 ^ 1427147847);
            case 182 -> b(1380450459, var9 ^ 1991588727);
            case 183 -> b(1380450458, var9 ^ -1149589242);
            case 184 -> b(1380450457, var9 ^ -2009371554);
            case 185 -> b(1380450456, var9 ^ 1545993287);
            case 186 -> b(1380450455, var9 ^ -654694831);
            case 187 -> b(1380450454, var9 ^ 2112372859);
            case 188 -> b(1380450453, var9 ^ 913229293);
            case 189 -> b(1380450452, var9 ^ -1502458918);
            case 190 -> b(1380450451, var9 ^ 1572534894);
            case 191 -> b(1380450450, var9 ^ -173222042);
            case 192 -> b(1380450449, var9 ^ -1258405963);
            case 193 -> b(1380450448, var9 ^ 1515830759);
            case 194 -> b(1380450543, var9 ^ -1936793390);
            case 195 -> b(1380450542, var9 ^ 582126599);
            case 196 -> b(1380450541, var9 ^ -137032751);
            case 197 -> b(1380450540, var9 ^ 1460440113);
            case 198 -> b(1380450539, var9 ^ 1475522223);
            case 199 -> b(1380450538, var9 ^ 1029872759);
            case 200 -> b(1380450537, var9 ^ -696283451);
            case 201 -> b(1380450536, var9 ^ -1639400054);
            case 202 -> b(1380450535, var9 ^ -250124598);
            case 203 -> b(1380450534, var9 ^ -568836222);
            case 204 -> b(1380450533, var9 ^ -631953301);
            case 205 -> b(1380450532, var9 ^ -1800428307);
            case 206 -> b(1380450531, var9 ^ -240578804);
            case 207 -> b(1380450530, var9 ^ 822806651);
            case 208 -> b(1380450529, var9 ^ 1511046857);
            case 209 -> b(1380450528, var9 ^ -711592745);
            case 210 -> b(1380450559, var9 ^ 584915765);
            case 211 -> b(1380450558, var9 ^ 1833533656);
            case 212 -> b(1380450557, var9 ^ 641814575);
            case 213 -> b(1380450556, var9 ^ 261973162);
            case 214 -> b(1380450555, var9 ^ -769526267);
            case 215 -> b(1380450554, var9 ^ -829155536);
            case 216 -> b(1380450553, var9 ^ -1076132191);
            case 217 -> b(1380450552, var9 ^ -1362535349);
            case 218 -> b(1380450551, var9 ^ 1381260242);
            case 219 -> b(1380450550, var9 ^ 925776657);
            case 220 -> b(1380450549, var9 ^ -987619135);
            case 221 -> b(1380450548, var9 ^ -814388042);
            case 222 -> b(1380450547, var9 ^ 1113558310);
            case 223 -> b(1380450546, var9 ^ 2134848133);
            case 224 -> b(1380450545, var9 ^ 1679052901);
            case 225 -> b(1380450544, var9 ^ 305521757);
            case 226 -> b(1380450511, var9 ^ 1763061298);
            case 227 -> b(1380450510, var9 ^ -450760393);
            case 228 -> b(1380450509, var9 ^ 1554744696);
            case 229 -> b(1380450508, var9 ^ 125478200);
            case 230 -> b(1380450507, var9 ^ 309875894);
            case 231 -> b(1380450506, var9 ^ 188259433);
            case 232 -> b(1380450505, var9 ^ 2010076282);
            case 233 -> b(1380450504, var9 ^ -1620658873);
            case 234 -> b(1380450503, var9 ^ 1737905998);
            case 235 -> b(1380450502, var9 ^ 794501904);
            case 236 -> b(1380450501, var9 ^ 1180281294);
            case 237 -> b(1380450500, var9 ^ 1264624967);
            case 238 -> b(1380450499, var9 ^ -480974706);
            case 239 -> b(1380450498, var9 ^ -644673689);
            case 240 -> b(1380450497, var9 ^ 648828432);
            case 241 -> b(1380450496, var9 ^ -140550058);
            case 242 -> b(1380450527, var9 ^ 150586410);
            case 243 -> b(1380450526, var9 ^ -508770889);
            case 244 -> b(1380450525, var9 ^ -347122584);
            case 245 -> b(1380450524, var9 ^ -416527304);
            case 246 -> b(1380450523, var9 ^ 170926705);
            case 247 -> b(1380450522, var9 ^ 1803450285);
            case 248 -> b(1380450521, var9 ^ -606015727);
            case 249 -> b(1380450520, var9 ^ 958506545);
            case 250 -> b(1380450519, var9 ^ -979075450);
            case 251 -> b(1380450518, var9 ^ -324317691);
            case 252 -> b(1380450517, var9 ^ 12913074);
            case 253 -> b(1380450516, var9 ^ 1429551645);
            case 254 -> b(1380450515, var9 ^ -1280557938);
            default -> b(1380450514, var9 ^ -27909768);
         };
         int var5 = (var1 & b(1380450513, var9 ^ 257292106)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(1380450512, var9 ^ -1408434743)) >>> b(1380450607, var9 ^ 636952121)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(1380450606, var9 ^ 283897911);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(1380450605, var9 ^ 1398565661);
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   private static void ba() {
      int var0 = -1461766069;
      aa[0] = bb(
         ab(b(1380450604, var0 ^ 568722572), b(1380450603, var0 ^ 555019440)).toCharArray(),
         a(b(1380450602, var0 ^ -1899005158), 1859346167526651839L),
         aa(b(1380450601, var0 ^ -2072554094), 3681453314847136458L)
      );
      aa[1] = bb(
         ab(b(1380450600, var0 ^ -685944343), b(1380450599, var0 ^ -2087122860)).toCharArray(),
         a(b(1380450598, var0 ^ 1536301815), 2243463392917799630L),
         aa(b(1380450597, var0 ^ 1116190276), 3956455882978315000L)
      );
      aa[2] = bb(
         ab(b(1380450596, var0 ^ 926999897), b(1380450595, var0 ^ -486354647)).toCharArray(),
         a(b(1380450594, var0 ^ 124751324), 2803017527121493045L),
         aa(b(1380450593, var0 ^ 1871067945), 4642309759165157864L)
      );
      aa[3] = bb(
         ab(b(1380450592, var0 ^ -544103038), b(1380450623, var0 ^ -368017022)).toCharArray(),
         a(b(1380450622, var0 ^ 1050873797), 999247136973897872L),
         aa(b(1380450621, var0 ^ 1137118896), 6826626337364800382L)
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var40 = -688177392;
      byte var36 = -1;
      String var30 = "땚錗嶐䨳鰓ྌ넜첝苰℅Êຜ툘Ȗ킩남籐㴮싊ꄢ閧펚\udb9b鏦⾣㥔\udaf7\ud9ee眇㖃癷緊϶컥즟槈녾뒞\udd8aࣥ浒㮖ຕῸ䑬㟵융\ue9dd쇓쮸윗\ue424쓥\ue1e2ᎻⳊ똕띟ㄽ蛎➗殢뷰蜍㌃쮰⫡\ue62a왤Έ\u09d3熚f왥妖붤䰱䲲䳩䰛䳿䳓䳘䱥䲨䳁䱓䳶䱝䱸䳚䳭䰑䲿䰳䱳䳦䰦䳲䰢䰡䲂䳩䱓䳱䰛䳳䰣၎ယၻძႉႽ၄ၨ၌ჲ\udeda\ude5c\ude21\udee3\udec8\ude88\udef5\ude4a\ude51\ude16\udea4\udeba\ude8f\ude89\udedf\ude65ꇂꆖꇷꅧꄅꄱꇈꇤꇀꅾ밐밠뱹벺볈뱥벃볍뱰뱅뱤뱘볉볕벸법鈅鉑鈰銠鋂鋶鈏鈣鈇銹ﺋ﹕ﺛﻘﺚﺿﻼﻆﻆﻧ︅︺ﺶﻱﻫ︥\uf855\uf801\uf860\uf8f0\uf892\uf8a6\uf85f\uf873\uf857\uf8e9";
      short var29 = 16179;
      char[] var31 = ";\u0011 \n\u0010\n\u0010\n\u0010\n".toCharArray();
      String[] var32 = new String[var31.length];

      while (true) {
         int var33 = 0;
         char var34 = 0;
         char var35 = '\u0000';
         if (var36 == 0) {
            abb = var32;
            baa = new Object[var32.length];
            int var25 = 560916274;
            byte[] var23 = "pù<\u000b3\u0001\"Ï\u0019Up\u0098}L\u0017\u0001¡\u001c`B=w¶zè9T]\u008d¨-\u000bÇ7 5é\u0011ö\"/ëïew/9@Â¶\u001c\u000e\u0010¾ÚUño^Âx·@#Õ\u0080õÃØb¡Ì\u0012'å4óY\u0080ûQ<\u008bî\u009ca\u0087¬Ç£\u0093ÿ.\u009châDpÐ4Ay\u0081\u007fý¨Ô^\u0081$¬\u0081Q>\u001e\u0004¿øX¨eC\u0019G\u0091T%\u0091o\u000bïTQÜtRl\u008a=\"\u0016ïç\bGP%e]'ñE\u009cR³Nî\u009c\u009dw¬]R_bY¬hÎ\u00adèeÛz\u001dlzú\u0098..\u0092\u001b \u001dJ\u009e\u009by«\u0000×\u0002E+}.\u009f±£<\u0012oïâ\u009d¯øÒìz7Ð\u0098¯\u0006Ú.rµ´þf b¯\u0080eÇC\u001dH\u000ej\u008b¡\u0014C\u0010\u0018³\u0095ú\u008aë½\u008fò\u000efSçkª'\u000f\u00987§)[Á/-U¼è¿\u0081ß£=UaxÇO\u001b\u0004Å\u0099 ByÀS3ì²YÕÝ§H\u0011hßÚEþ\u001eTp\u009a¨\u0081µÌ\f4'q\u009a¶½°ÙËwá4Õ¸ÓZÏøOÚª\f,\u0081¸E@ó\u0010úÛ\u0007Ó¹V\u008a\u0017z²Ü4³1\u0016òe\u007f\u001br\u0007\u0084û~:÷<\u0007FMp»0Û\u0017ì%öS5ßû\u00ad\u0084]ñnÓ\u0091fÃå«Ds¼À\fÖÉ¶Wf(\u0018\u009dÇvX%\u008f\"NKh\tÀtÜ÷º\u0014tBòß\u008b`\u0012>Æ-Ö»\u009fÀ,å\u0012d\u008cwùMó¼j²0ì¼[JXD4÷æ\u001c?´Ív«h4+\u009b¢[Î\u0007\u0095\u0083#©c\u0081mU\u008e?\u0087\u001aFm\u0088\u009d0¨[\u008cC\u0080c¿\u008dvF¢ÕhïHó\\÷bmÆæÎYÉz¸Î\u0007æÛÜr¡c7\u001c\u0003ìvhT\u009f\u0014Cþ\u0003\u00866Ò2¶\u0098÷Î\"TÚã-\\~ó\u0001`ë-7Y®8\u0000Qh=V}G¦rã\u0098ëûôÚ\u001c°©\\ÍV\u00ad\u0019â¿j\u009d\u0086/o9\u0095è)6üJ\u0083NØèyû\u00809³1\u009c½ðÑÓá\u0099QNûA\u001eÄÎE¸FUzU^S\u0002IÂí°w6ïo¶f>à÷k®_\u0007Aö\u0014K%\u0006r\u0093$-V\u000fÃ\u0003\u0005¡¥àC\rZ,WÑSä\u0094\u0004-;:SRk¯\u0004CÓ\u0004\u0016Í\b7ÏT\u0099rk®\u0085+>{\u0012\r\u0014\u0019\u008a\n?r»cèE8·\u00921þÓÅI: æì\u008dî+#\u001fK\u0018bÚxÌ|J\u0088H£\u00907í±öG¦7sD6+ýWÍãL(eõa6$§\u0089\u0092Ê\u0000\u000bH\u001c×V\r²ë:¡g\u008c¼àÇU:\u0080Ç«\u0018À\u00ad;*îF&8t\u000e\u0011\u000b\u0080aNÐßNA\u0089\u0019J\f\u009eZ\u0004ö\u0012Ûað¹ª¡R¿@ÊI\b4EÌBF²\u0084\u00ad\u0005ý\u00106á¶\u0018æ\u0016\u009fÄÒ:Bx@é^Í¡â/\u00821þ>\u0090êÒÂ\ríM§w\u008dÙU{\u0096\u001f_,ÚIÒ\u0006;Iïf\u0084^ôMæ\u0001\u0082lR¨ùO\u0098\u0094uxG$Ìò3s\u0097#\u0012P\u0082!âK\u009ba*Ûç\u0096â.\u000f?\u0003\u0095÷Ïá\u000e¿\u0002\u0095:Ö\u0000\u001f£Û9\u0012]s\r^ªIÊ¹ç¶õà'gÆÖb\u0098 r\u0005qõsÆ{\u0016âìwuú°\u009ai\u0094éû'ÁBK¹X\u0017©x\u0011LUýÈ{|òøS\u0090\u009c¿UÅl\u008c\u008f#õ\u008aýn\u000f\u0097D\u009f\fAV<VÊÔµ®©\"\u0080²GÔÃ\u0005Üýú\u001fR\rúïW¹U4\nÀ_\u008c\u0010m\fä\u0007rXb~6\u0080j\u008fÑ\u0099|Ã¹ì¹³Í8ù\u001f\fÜ\u0097\u001d\u0096´}où\u0004hó\u00101è\u009f]å[\u0083?\u0098?\u0090Øú\u0005³\u0011ìz\u0018¿Ìê4ÛÂHª/ë\u0091\u001cBûsÊ\u0015¶ÿ\u0010È)\u0081¼ïºµ¾á\\\nz\u0087áR\u001fLÔzò#\u0004Ëlð\u009a(`ð\bÕÂO'ö\u009f\u000b\u0097ÉJ\"Þ\u00ad\u0082J\u0081ÀX-íX\u009bú8Y=^BÊ|\u0094\u001c\u0090\u00adÉ\u009aÈèÚXì\u008d×eyuü\u009c¼\u009a\u008cAßý\u00949þä¹Z¿\u0013¯Ãu\u00adÑ\u0097 w®íøãÆîí6y£UÒ\u0086\u0015m;\u0083ÈLÒ=VîkÍÇ)I6{ÞÙ{hêëîn\u0090¢^\tj\u0001d\u0000×\u007f;T\u0006ÓV\u009e\u0091&\u0001\u0019º¸ßö#¹\u0083\u001b¹Ë+z\u0080W$å\u0093{ý"
               .getBytes("ISO-8859-1");
            int var24 = var23.length / 4;
            a = new int[var24];
            byte var26 = 0;
            int var27 = 0;

            do {
               int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
               var28 ^= var25;
               a[var27] = var28;
               var26 += 4;
            } while (++var27 < var24);

            String[] var21 = new String[4];
            int var19 = 0;
            String var18;
            int var20 = (var18 = aaa('귙', 1227731785, (char)'\ue465', 49, 20274, 1593357681, '糪')).length();
            int var17 = b(1380450618, var40 ^ 1765189100);
            int var44 = -1;

            label139:
            while (true) {
               String var47 = var18.substring(++var44, var44 + var17);
               int var10001 = -1;

               while (true) {
                  char[] var67;
                  label134: {
                     char[] var52 = var47.toCharArray();
                     int var10003 = var52.length;
                     int var22 = 0;
                     var67 = var52;
                     var10001 = var10003;
                     char[] var79;
                     int var10004;
                     if (var10003 <= 1) {
                        var79 = var52;
                        var10004 = var22;
                     } else {
                        var67 = var52;
                        var10001 = var10003;
                        if (var10003 <= var22) {
                           break label134;
                        }

                        var79 = var52;
                        var10004 = var22;
                     }

                     while (true) {
                        var79[var10004] = (char)(var79[var10004] ^ switch (var22 % b(1380450616, var40 ^ 1313705328)) {
                           case 0 -> b(1380450615, var40 ^ 1588550503);
                           case 1 -> b(1380450614, var40 ^ 321094141);
                           case 2 -> 3;
                           case 3 -> b(1380450613, var40 ^ -1940050433);
                           case 4 -> b(1380450612, var40 ^ 526987201);
                           case 5 -> b(1380450611, var40 ^ -103355490);
                           default -> b(1380450610, var40 ^ 1150193236);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var79 = var67;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var79 = var67;
                           var10004 = var22;
                        }
                     }
                  }

                  String var86 = new String(var67).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var86;
                        if ((var44 += var17) >= var20) {
                           aab = var21;
                           b = new String[4];
                           long var8 = 1127284679757815792L;
                           long[] var14 = new long[b(1380450609, var40 ^ 1906729759)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = aaa('ᙂ', 1409751018, (char)'걈', 7, (short)-16193, 1593357683, '奡')).length();
                           byte var10 = 0;

                           label113:
                           while (true) {
                              int var59 = var10;
                              var10 += 8;
                              byte[] var15 = var12.substring(var59, var10).getBytes(aaa('윷', 291200816, '岀', (byte)-34, 3153, 1593357682, '彎'));
                              long[] var49 = var14;
                              var59 = var11++;
                              long var73 = (var15[0] & 255L) << b(1380450608, var40 ^ -1592263173)
                                 | (var15[1] & 255L) << b(1380450575, var40 ^ 1073017340)
                                 | (var15[2] & 255L) << b(1380450574, var40 ^ -1391897750)
                                 | (var15[3] & 255L) << b(1380450573, var40 ^ -2111173067)
                                 | (var15[4] & 255L) << b(1380450572, var40 ^ 840293045)
                                 | (var15[5] & 255L) << b(1380450571, var40 ^ 2071007906)
                                 | (var15[b(1380450570, var40 ^ 605866282)] & 255L) << b(1380450569, var40 ^ 1216613112)
                                 | var15[b(1380450568, var40 ^ -1652183972)] & 255L;
                              byte var87 = -1;

                              while (true) {
                                 long var92 = var73 ^ var8;
                                 switch (var87) {
                                    case 0:
                                       var49[var59] = var92;
                                       if (var10 >= var13) {
                                          ab = var14;
                                          aaa = new Integer[b(1380450590, var40 ^ 1722367170)];
                                          long var0 = 6781709912071454512L;
                                          long[] var6 = new long[4];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = aaa((char)'퉁', -1781512792, (char)'퇨', (byte)-11, 11015, 1593357687, 22246)).length();
                                          byte var2 = 0;

                                          label103:
                                          while (true) {
                                             int var62 = var2;
                                             var2 += 8;
                                             byte[] var7 = var4.substring(var62, var2)
                                                .getBytes(aaa(3194, -2009550308, (char)'頄', (byte)-126, (short)-31019, 1593357686, '딼'));
                                             long[] var50 = var6;
                                             var62 = var3++;
                                             long var75 = (var7[0] & 255L) << b(1380450589, var40 ^ 855434888)
                                                | (var7[1] & 255L) << b(1380450588, var40 ^ 1210348249)
                                                | (var7[2] & 255L) << b(1380450587, var40 ^ 1261545289)
                                                | (var7[3] & 255L) << b(1380450586, var40 ^ 109659055)
                                                | (var7[4] & 255L) << b(1380450585, var40 ^ -1330533631)
                                                | (var7[5] & 255L) << b(1380450584, var40 ^ 1838170822)
                                                | (var7[b(1380450583, var40 ^ -214762793)] & 255L) << b(1380450582, var40 ^ 1660278827)
                                                | var7[b(1380450581, var40 ^ -570275740)] & 255L;
                                             byte var89 = -1;

                                             while (true) {
                                                var92 = var75 ^ var0;
                                                switch (var89) {
                                                   case 0:
                                                      var50[var62] = var92;
                                                      if (var2 >= var5) {
                                                         ba = var6;
                                                         bb = new Long[4];
                                                         aa = new String[4];
                                                         ba();
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var50[var62] = var92;
                                                      if (var2 < var5) {
                                                         continue label103;
                                                      }

                                                      var5 = (var4 = aaa(19705, -545170160, '懂', (byte)-63, (short)12790, 1593357689, '㢎')).length();
                                                      var2 = 0;
                                                }

                                                byte var64 = var2;
                                                var2 += 8;
                                                var7 = var4.substring(var64, var2)
                                                   .getBytes(aaa((char)'\uf689', -942421263, 31748, (byte)99, (short)-16523, 1593357688, '缽'));
                                                var50 = var6;
                                                var62 = var3++;
                                                var75 = (var7[0] & 255L) << b(1380450580, var40 ^ -852067647)
                                                   | (var7[1] & 255L) << b(1380450579, var40 ^ -884198578)
                                                   | (var7[2] & 255L) << b(1380450578, var40 ^ -1397321635)
                                                   | (var7[3] & 255L) << b(1380450577, var40 ^ -1525944807)
                                                   | (var7[4] & 255L) << b(1380450576, var40 ^ -237354019)
                                                   | (var7[5] & 255L) << b(1380450671, var40 ^ 994948749)
                                                   | (var7[b(1380450670, var40 ^ -1134155332)] & 255L) << b(1380450669, var40 ^ 1409231077)
                                                   | var7[b(1380450668, var40 ^ -1100654003)] & 255L;
                                                var89 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var49[var59] = var92;
                                       if (var10 < var13) {
                                          continue label113;
                                       }

                                       var13 = (var12 = aaa(13073, 773851467, '➏', (byte)-113, (short)-22560, 1593357685, (char)'\ue3e2')).length();
                                       var10 = 0;
                                 }

                                 byte var61 = var10;
                                 var10 += 8;
                                 var15 = var12.substring(var61, var10).getBytes(aaa('歸', 1019384022, 1517, 7, 1281, 1593357684, '⊉'));
                                 var49 = var14;
                                 var59 = var11++;
                                 var73 = (var15[0] & 255L) << b(1380450567, var40 ^ -417927768)
                                    | (var15[1] & 255L) << b(1380450566, var40 ^ -1186186036)
                                    | (var15[2] & 255L) << b(1380450565, var40 ^ 1058306548)
                                    | (var15[3] & 255L) << b(1380450564, var40 ^ -47178528)
                                    | (var15[4] & 255L) << b(1380450563, var40 ^ -1062869660)
                                    | (var15[5] & 255L) << b(1380450562, var40 ^ 962595437)
                                    | (var15[b(1380450561, var40 ^ -469537640)] & 255L) << b(1380450560, var40 ^ -1675463246)
                                    | var15[b(1380450591, var40 ^ -10255686)] & 255L;
                                 var87 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var44);
                        break;
                     default:
                        var21[var19++] = var86;
                        if ((var44 += var17) < var20) {
                           var17 = var18.charAt(var44);
                           continue label139;
                        }

                        var20 = (var18 = aaa('糟', 800295530, 8710, (byte)-94, (short)6627, 1593357680, '공')).length();
                        var17 = b(1380450617, var40 ^ 1737767709);
                        var44 = -1;
                  }

                  var47 = var18.substring(++var44, var44 + var17);
                  var10001 = 0;
               }
            }
         }

         do {
            var35 = var31[var33];
            char[] var37 = var30.substring(var34, var34 + var35).toCharArray();
            int var38 = 0;

            do {
               byte var39 = switch (var38 % 5) {
                  default -> 12;
                  case 1 -> 56;
                  case 2 -> 99;
                  case 3 -> 95;
                  case 4 -> 15;
               };
               var37[var38] = (char)(var37[var38] ^ var39 ^ var29);
            } while (++var38 < var37.length);

            var32[var33] = new String(var37).intern();
            var34 += var35;
         } while (++var33 < var31.length);

         var36 = 0;
      }
   }

   private static String bb(char[] var0, long var1, int var3) {
      int var4 = aa(b(1380450620, -1536445121 ^ 759841059), 6378172182035749916L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aa(b(1380450619, -1536445121 ^ 993392884), 1039581603801645581L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(1380450667, 1128320273 ^ 1256486867)) & b(1380450666, 1128320273 ^ -705423004);
      if (bb[var3] == null) {
         bb[var3] = ba[var3] ^ var1;
      }

      return bb[var3];
   }
}
