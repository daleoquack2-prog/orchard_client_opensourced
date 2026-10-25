package nsc;

import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class aaababbba extends abbaabbaa {
   private static final int[] aabb;
   private static final int aa;
   private long ab;
   private static final Long[] ba;
   private static final long[] bb;
   private static final String[] aaa;
   private int aab;
   private static final long aba;
   private final aaabbbab abb;
   private static final int baa;
   private static final Object[] abab;
   private static final long[] bab;
   private long bba;
   private int bbb;
   private static final Integer[] aaaa;
   private static final String[] abaa;
   private static final String[] aaab;
   private long aaba;

   private static String b(int var0, char var1, short var2) {
      int var3 = var1 ^ '쬀';
      char[] var4 = abaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         abab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 401;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '过';
         var10 += 34878;
         var10 += 18186;
         var10 -= 10946;
         var10 += 64550;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private boolean aa(class_746 param1) {
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
      // 14: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 1a: istore 3
      // 1b: aload 0
      // 1c: aload 1
      // 1d: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 20: iload 3
      // 21: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 24: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaa (Lnet/minecraft/class_1799;)Z
      // 27: iload 2
      // 28: ifne 5c
      // 2b: ifne 5b
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: aload 1
      // 34: iload 3
      // 35: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaaa (Lnet/minecraft/class_746;I)I
      // 38: iload 2
      // 39: ifne 5c
      // 3c: goto 40
      // 3f: athrow
      // 40: ifge 5b
      // 43: goto 47
      // 46: athrow
      // 47: aload 0
      // 48: aload 1
      // 49: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bba (Lnet/minecraft/class_746;)I
      // 4c: iload 2
      // 4d: ifne 5c
      // 50: goto 54
      // 53: athrow
      // 54: iflt 5f
      // 57: goto 5b
      // 5a: athrow
      // 5b: bipush 1
      // 5c: goto 60
      // 5f: bipush 0
      // 60: ireturn
   }

   private boolean ab(class_310 param1, class_746 param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 2
      // 04: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 07: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 0a: istore 6
      // 0c: istore 5
      // 0e: aload 0
      // 0f: iload 5
      // 11: ifne 2b
      // 14: aload 2
      // 15: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 18: iload 6
      // 1a: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaa (Lnet/minecraft/class_1799;)Z
      // 20: ifeq 2a
      // 23: goto 27
      // 26: athrow
      // 27: bipush 1
      // 28: ireturn
      // 29: athrow
      // 2a: aload 0
      // 2b: aload 2
      // 2c: iload 6
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bb (Lnet/minecraft/class_746;I)I
      // 31: istore 7
      // 33: aload 0
      // 34: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb I
      // 37: iload 5
      // 39: ifne 7f
      // 3c: iflt 7d
      // 3f: goto 43
      // 42: athrow
      // 43: lload 3
      // 44: aload 0
      // 45: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bba J
      // 48: lcmp
      // 49: iload 5
      // 4b: ifne 5e
      // 4e: goto 52
      // 51: athrow
      // 52: ifge 5c
      // 55: goto 59
      // 58: athrow
      // 59: bipush 0
      // 5a: ireturn
      // 5b: athrow
      // 5c: iload 7
      // 5e: iload 5
      // 60: ifne 7c
      // 63: iflt 74
      // 66: goto 6a
      // 69: athrow
      // 6a: aload 1
      // 6b: iload 7
      // 6d: bipush 1
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaaa (Lnet/minecraft/class_310;IZ)V
      // 71: bipush 1
      // 72: ireturn
      // 73: athrow
      // 74: aload 0
      // 75: aload 1
      // 76: aload 2
      // 77: iload 6
      // 79: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bab (Lnet/minecraft/class_310;Lnet/minecraft/class_746;I)Z
      // 7c: ireturn
      // 7d: iload 7
      // 7f: iload 5
      // 81: ifne c9
      // 84: iflt c1
      // 87: goto 8b
      // 8a: athrow
      // 8b: aload 0
      // 8c: iload 7
      // 8e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb I
      // 91: iload 5
      // 93: aload 0
      // 94: lload 3
      // 95: aload 0
      // 96: aload 0
      // 97: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 9a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 9d: ladd
      // 9e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bba J
      // a1: ifne bf
      // a4: goto a8
      // a7: athrow
      // a8: lload 3
      // a9: aload 0
      // aa: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bba J
      // ad: lcmp
      // ae: ifge b8
      // b1: goto b5
      // b4: athrow
      // b5: bipush 0
      // b6: ireturn
      // b7: athrow
      // b8: aload 1
      // b9: iload 7
      // bb: bipush 1
      // bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaaa (Lnet/minecraft/class_310;IZ)V
      // bf: bipush 1
      // c0: ireturn
      // c1: aload 0
      // c2: aload 1
      // c3: aload 2
      // c4: iload 6
      // c6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bab (Lnet/minecraft/class_310;Lnet/minecraft/class_746;I)Z
      // c9: ireturn
   }

   private static String ba(int var0, int var1) {
      int var9 = 459920106;
      int var2 = (var0 ^ a(1232796113, var9 ^ 1849922203)) & a(1232796112, var9 ^ 1941662263);
      if (aaab[var2] == null) {
         char[] var3 = aaa[var2].toCharArray();

         int var4 = switch (var3[0] & a(1232796119, var9 ^ -2089070251)) {
            case 0 -> a(1232796118, var9 ^ 899676362);
            case 1 -> a(1232796117, var9 ^ -1211699292);
            case 2 -> a(1232796116, var9 ^ -1344800731);
            case 3 -> a(1232796123, var9 ^ 939346725);
            case 4 -> a(1232796122, var9 ^ -704769331);
            case 5 -> 2;
            case 6 -> a(1232796121, var9 ^ 2089548400);
            case 7 -> a(1232796120, var9 ^ 440031771);
            case 8 -> a(1232796127, var9 ^ 830049320);
            case 9 -> a(1232796126, var9 ^ -743825578);
            case 10 -> a(1232796125, var9 ^ -1236038137);
            case 11 -> a(1232796124, var9 ^ -1035156325);
            case 12 -> a(1232796067, var9 ^ 175906775);
            case 13 -> a(1232796066, var9 ^ 1298435939);
            case 14 -> a(1232796065, var9 ^ -186230917);
            case 15 -> a(1232796064, var9 ^ -1486126423);
            case 16 -> a(1232796071, var9 ^ -1828616347);
            case 17 -> a(1232796070, var9 ^ -700161925);
            case 18 -> a(1232796069, var9 ^ -889443148);
            case 19 -> a(1232796068, var9 ^ 836723278);
            case 20 -> a(1232796075, var9 ^ 1971120253);
            case 21 -> 4;
            case 22 -> a(1232796074, var9 ^ -54540605);
            case 23 -> a(1232796073, var9 ^ 1838744599);
            case 24 -> 3;
            case 25 -> a(1232796072, var9 ^ 2115396970);
            case 26 -> a(1232796079, var9 ^ -1439177794);
            case 27 -> a(1232796078, var9 ^ -1784818223);
            case 28 -> a(1232796077, var9 ^ 464858129);
            case 29 -> a(1232796076, var9 ^ 425094720);
            case 30 -> a(1232796083, var9 ^ -1130114583);
            case 31 -> a(1232796082, var9 ^ -1054748566);
            case 32 -> a(1232796081, var9 ^ -22469727);
            case 33 -> a(1232796080, var9 ^ 483356874);
            case 34 -> a(1232796087, var9 ^ 1778510056);
            case 35 -> a(1232796086, var9 ^ 728303905);
            case 36 -> a(1232796085, var9 ^ -571901508);
            case 37 -> a(1232796084, var9 ^ 1010629797);
            case 38 -> a(1232796091, var9 ^ -1042994004);
            case 39 -> a(1232796090, var9 ^ -1408225627);
            case 40 -> a(1232796089, var9 ^ -715539734);
            case 41 -> a(1232796088, var9 ^ -1254335769);
            case 42 -> a(1232796095, var9 ^ 706287430);
            case 43 -> a(1232796094, var9 ^ 407773872);
            case 44 -> a(1232796093, var9 ^ 970584073);
            case 45 -> a(1232796092, var9 ^ -176952053);
            case 46 -> a(1232796035, var9 ^ -324927010);
            case 47 -> a(1232796034, var9 ^ -610151713);
            case 48 -> a(1232796033, var9 ^ -1690218255);
            case 49 -> a(1232796032, var9 ^ 450061292);
            case 50 -> a(1232796039, var9 ^ -1011509913);
            case 51 -> a(1232796038, var9 ^ 1958751198);
            case 52 -> a(1232796037, var9 ^ 439801148);
            case 53 -> a(1232796036, var9 ^ -1116116159);
            case 54 -> a(1232796043, var9 ^ 1554523663);
            case 55 -> a(1232796042, var9 ^ -645901606);
            case 56 -> a(1232796041, var9 ^ 1020748155);
            case 57 -> a(1232796040, var9 ^ -146173432);
            case 58 -> a(1232796047, var9 ^ 1061739459);
            case 59 -> a(1232796046, var9 ^ -1964532454);
            case 60 -> a(1232796045, var9 ^ 1451291396);
            case 61 -> a(1232796044, var9 ^ -494592166);
            case 62 -> a(1232796051, var9 ^ 1971106505);
            case 63 -> a(1232796050, var9 ^ -241750754);
            case 64 -> a(1232796049, var9 ^ -1279152222);
            case 65 -> a(1232796048, var9 ^ 1208065593);
            case 66 -> a(1232796055, var9 ^ 1288865165);
            case 67 -> a(1232796054, var9 ^ -1395561008);
            case 68 -> a(1232796053, var9 ^ -350703771);
            case 69 -> a(1232796052, var9 ^ 1427832408);
            case 70 -> a(1232796059, var9 ^ -2090281344);
            case 71 -> a(1232796058, var9 ^ -1041966291);
            case 72 -> a(1232796057, var9 ^ -1583732988);
            case 73 -> a(1232796056, var9 ^ -1680462694);
            case 74 -> a(1232796063, var9 ^ 170201212);
            case 75 -> a(1232796062, var9 ^ -39185457);
            case 76 -> a(1232796061, var9 ^ -901044758);
            case 77 -> a(1232796060, var9 ^ -50228481);
            case 78 -> a(1232796003, var9 ^ -12479368);
            case 79 -> a(1232796002, var9 ^ -1411735029);
            case 80 -> a(1232796001, var9 ^ -95853172);
            case 81 -> a(1232796000, var9 ^ 1429404061);
            case 82 -> a(1232796007, var9 ^ -885668458);
            case 83 -> a(1232796006, var9 ^ 772428843);
            case 84 -> a(1232796005, var9 ^ 1166424024);
            case 85 -> a(1232796004, var9 ^ 486582490);
            case 86 -> a(1232796011, var9 ^ 1892710167);
            case 87 -> a(1232796010, var9 ^ -266701594);
            case 88 -> a(1232796009, var9 ^ 1918025838);
            case 89 -> a(1232796008, var9 ^ 372182365);
            case 90 -> a(1232796015, var9 ^ -868285015);
            case 91 -> a(1232796014, var9 ^ -143416446);
            case 92 -> a(1232796013, var9 ^ 621137831);
            case 93 -> a(1232796012, var9 ^ -378370289);
            case 94 -> a(1232796019, var9 ^ 965556244);
            case 95 -> a(1232796018, var9 ^ 713310564);
            case 96 -> a(1232796017, var9 ^ -565626918);
            case 97 -> a(1232796016, var9 ^ 1463692390);
            case 98 -> a(1232796023, var9 ^ -1342285977);
            case 99 -> a(1232796022, var9 ^ -1145466838);
            case 100 -> a(1232796021, var9 ^ 70382262);
            case 101 -> a(1232796020, var9 ^ 261856940);
            case 102 -> a(1232796027, var9 ^ -1344134528);
            case 103 -> a(1232796026, var9 ^ 212335568);
            case 104 -> a(1232796025, var9 ^ -1412253513);
            case 105 -> a(1232796024, var9 ^ -415495331);
            case 106 -> a(1232796031, var9 ^ 1380010850);
            case 107 -> a(1232796030, var9 ^ 172148813);
            case 108 -> a(1232796029, var9 ^ 630788439);
            case 109 -> a(1232796028, var9 ^ -728159289);
            case 110 -> a(1232795971, var9 ^ 2031851645);
            case 111 -> a(1232795970, var9 ^ 97776903);
            case 112 -> a(1232795969, var9 ^ 499475796);
            case 113 -> 0;
            case 114 -> a(1232795968, var9 ^ -776349508);
            case 115 -> a(1232795975, var9 ^ 817437357);
            case 116 -> a(1232795974, var9 ^ -1744048842);
            case 117 -> a(1232795973, var9 ^ 16600549);
            case 118 -> a(1232795972, var9 ^ -1840655594);
            case 119 -> a(1232795979, var9 ^ -265060962);
            case 120 -> a(1232795978, var9 ^ 842348396);
            case 121 -> a(1232795977, var9 ^ -492262020);
            case 122 -> a(1232795976, var9 ^ 662845205);
            case 123 -> a(1232795983, var9 ^ -1216470710);
            case 124 -> a(1232795982, var9 ^ 1837345247);
            case 125 -> a(1232795981, var9 ^ -973450828);
            case 126 -> a(1232795980, var9 ^ -1684013411);
            case 127 -> a(1232795987, var9 ^ 258204071);
            case 128 -> a(1232795986, var9 ^ 1500158639);
            case 129 -> a(1232795985, var9 ^ -836695534);
            case 130 -> a(1232795984, var9 ^ 1572191899);
            case 131 -> a(1232795991, var9 ^ -81350806);
            case 132 -> a(1232795990, var9 ^ 1075845276);
            case 133 -> a(1232795989, var9 ^ 2111769142);
            case 134 -> a(1232795988, var9 ^ -645419710);
            case 135 -> a(1232795995, var9 ^ 1187353237);
            case 136 -> a(1232795994, var9 ^ 1882431689);
            case 137 -> a(1232795993, var9 ^ 1224454996);
            case 138 -> a(1232795992, var9 ^ 959325844);
            case 139 -> a(1232795999, var9 ^ 480093751);
            case 140 -> a(1232795998, var9 ^ 1049825288);
            case 141 -> a(1232795997, var9 ^ -1872324817);
            case 142 -> a(1232795996, var9 ^ 598173040);
            case 143 -> a(1232795939, var9 ^ 566965284);
            case 144 -> a(1232795938, var9 ^ -1479693992);
            case 145 -> a(1232795937, var9 ^ 1523045831);
            case 146 -> a(1232795936, var9 ^ -1311002380);
            case 147 -> a(1232795943, var9 ^ 1084681665);
            case 148 -> a(1232795942, var9 ^ -685900103);
            case 149 -> a(1232795941, var9 ^ 624534982);
            case 150 -> a(1232795940, var9 ^ 806575669);
            case 151 -> a(1232795947, var9 ^ -15187637);
            case 152 -> a(1232795946, var9 ^ 62451270);
            case 153 -> a(1232795945, var9 ^ -664989096);
            case 154 -> a(1232795944, var9 ^ 2094853389);
            case 155 -> a(1232795951, var9 ^ 1024231608);
            case 156 -> a(1232795950, var9 ^ 369784793);
            case 157 -> a(1232795949, var9 ^ 674509121);
            case 158 -> a(1232795948, var9 ^ 1608098525);
            case 159 -> a(1232795955, var9 ^ -310308757);
            case 160 -> a(1232795954, var9 ^ 1569259301);
            case 161 -> a(1232795953, var9 ^ -1071118344);
            case 162 -> a(1232795952, var9 ^ -427932174);
            case 163 -> a(1232795959, var9 ^ -2035275097);
            case 164 -> a(1232795958, var9 ^ 811653773);
            case 165 -> a(1232795957, var9 ^ 566426240);
            case 166 -> 5;
            case 167 -> a(1232795956, var9 ^ 2019972318);
            case 168 -> a(1232795963, var9 ^ 1766419412);
            case 169 -> a(1232795962, var9 ^ 569410601);
            case 170 -> a(1232795961, var9 ^ -2039108256);
            case 171 -> a(1232795960, var9 ^ -2060417651);
            case 172 -> a(1232795967, var9 ^ 1461986126);
            case 173 -> a(1232795966, var9 ^ -1555541249);
            case 174 -> a(1232795965, var9 ^ 1480728005);
            case 175 -> a(1232795964, var9 ^ 326739956);
            case 176 -> a(1232795907, var9 ^ -1954173609);
            case 177 -> a(1232795906, var9 ^ 1882905610);
            case 178 -> a(1232795905, var9 ^ 1362548655);
            case 179 -> a(1232795904, var9 ^ -52010100);
            case 180 -> a(1232795911, var9 ^ 1943210010);
            case 181 -> a(1232795910, var9 ^ -532752634);
            case 182 -> a(1232795909, var9 ^ 1654273116);
            case 183 -> a(1232795908, var9 ^ -214436644);
            case 184 -> a(1232795915, var9 ^ 1217593601);
            case 185 -> a(1232795914, var9 ^ 717475233);
            case 186 -> a(1232795913, var9 ^ 14482565);
            case 187 -> a(1232795912, var9 ^ -635558211);
            case 188 -> a(1232795919, var9 ^ -2010336819);
            case 189 -> a(1232795918, var9 ^ -450753591);
            case 190 -> a(1232795917, var9 ^ 1532373575);
            case 191 -> a(1232795916, var9 ^ 1591096776);
            case 192 -> a(1232795923, var9 ^ 662543457);
            case 193 -> a(1232795922, var9 ^ 445626594);
            case 194 -> a(1232795921, var9 ^ 1645516991);
            case 195 -> a(1232795920, var9 ^ -1633869080);
            case 196 -> a(1232795927, var9 ^ 619788469);
            case 197 -> a(1232795926, var9 ^ 1266574149);
            case 198 -> a(1232795925, var9 ^ 299596171);
            case 199 -> a(1232795924, var9 ^ 1405586913);
            case 200 -> a(1232795931, var9 ^ -542448126);
            case 201 -> a(1232795930, var9 ^ -333968573);
            case 202 -> a(1232795929, var9 ^ 1144282550);
            case 203 -> a(1232795928, var9 ^ 621296718);
            case 204 -> a(1232795935, var9 ^ 1458286995);
            case 205 -> a(1232795934, var9 ^ 1870059285);
            case 206 -> a(1232795933, var9 ^ -1569831260);
            case 207 -> a(1232795932, var9 ^ -669086442);
            case 208 -> a(1232795875, var9 ^ 911565393);
            case 209 -> a(1232795874, var9 ^ 648760296);
            case 210 -> a(1232795873, var9 ^ -17107522);
            case 211 -> a(1232795872, var9 ^ -976497119);
            case 212 -> a(1232795879, var9 ^ -1389330865);
            case 213 -> a(1232795878, var9 ^ 1369628236);
            case 214 -> a(1232795877, var9 ^ -780247416);
            case 215 -> a(1232795876, var9 ^ 531303410);
            case 216 -> a(1232795883, var9 ^ 1262757884);
            case 217 -> a(1232795882, var9 ^ -1843566398);
            case 218 -> a(1232795881, var9 ^ -2122572273);
            case 219 -> a(1232795880, var9 ^ 1909971624);
            case 220 -> a(1232795887, var9 ^ 1227522721);
            case 221 -> a(1232795886, var9 ^ -1836174849);
            case 222 -> a(1232795885, var9 ^ 495130892);
            case 223 -> a(1232795884, var9 ^ -761376552);
            case 224 -> a(1232795891, var9 ^ 1641673586);
            case 225 -> a(1232795890, var9 ^ -1266937518);
            case 226 -> a(1232795889, var9 ^ 773257834);
            case 227 -> a(1232795888, var9 ^ 974630098);
            case 228 -> a(1232795895, var9 ^ -1003194339);
            case 229 -> a(1232795894, var9 ^ -616942225);
            case 230 -> a(1232795893, var9 ^ -1368672078);
            case 231 -> a(1232795892, var9 ^ 1483690328);
            case 232 -> a(1232795899, var9 ^ -1588915017);
            case 233 -> a(1232795898, var9 ^ 1270270188);
            case 234 -> a(1232795897, var9 ^ 657892345);
            case 235 -> a(1232795896, var9 ^ -609712649);
            case 236 -> a(1232795903, var9 ^ -1493863099);
            case 237 -> a(1232795902, var9 ^ 464191289);
            case 238 -> a(1232795901, var9 ^ 2040273285);
            case 239 -> a(1232795900, var9 ^ 305200451);
            case 240 -> a(1232795843, var9 ^ 361992891);
            case 241 -> a(1232795842, var9 ^ -1207662704);
            case 242 -> a(1232795841, var9 ^ -736693118);
            case 243 -> a(1232795840, var9 ^ -937659876);
            case 244 -> a(1232795847, var9 ^ 83817954);
            case 245 -> a(1232795846, var9 ^ -301695025);
            case 246 -> a(1232795845, var9 ^ 1498516628);
            case 247 -> a(1232795844, var9 ^ -501384695);
            case 248 -> 1;
            case 249 -> a(1232795851, var9 ^ 2070357694);
            case 250 -> a(1232795850, var9 ^ 1210586358);
            case 251 -> a(1232795849, var9 ^ -69924276);
            case 252 -> a(1232795848, var9 ^ -1134952671);
            case 253 -> a(1232795855, var9 ^ 987460807);
            case 254 -> a(1232795854, var9 ^ 1648966007);
            default -> a(1232795853, var9 ^ -1774817591);
         };
         int var5 = (var1 & a(1232795852, var9 ^ -229806244)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1232795859, var9 ^ -946814885)) >>> a(1232795858, var9 ^ -535302027)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1232795857, var9 ^ -1234821855);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1232795856, var9 ^ -1354569057);
            }
         }

         aaab[var2] = new String(var3).intern();
      }

      return aaab[var2];
   }

   private int bb(class_746 param1, int param2) {
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
      // 06: ifne 72
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb I
      // 0c: iflt 71
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 3
      // 15: ifne 72
      // 18: goto 1c
      // 1b: athrow
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb I
      // 1f: ldc_w 1232795863
      // 22: ldc_w 1099666163
      // 25: ldc_w -326472156
      // 28: ixor
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.a (II)I
      // 2c: ldc2_w 6662199869544112379
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.abb (IJ)I
      // 32: if_icmpge 71
      // 35: goto 39
      // 38: athrow
      // 39: aload 0
      // 3a: iload 3
      // 3b: ifne 72
      // 3e: goto 42
      // 41: athrow
      // 42: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb I
      // 45: iload 2
      // 46: if_icmpeq 71
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 0
      // 4e: iload 3
      // 4f: ifne 72
      // 52: goto 56
      // 55: athrow
      // 56: aload 1
      // 57: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 5a: aload 0
      // 5b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb I
      // 5e: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 61: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaa (Lnet/minecraft/class_1799;)Z
      // 64: ifeq 71
      // 67: goto 6b
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb I
      // 6f: ireturn
      // 70: athrow
      // 71: aload 0
      // 72: aload 1
      // 73: iload 2
      // 74: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaaa (Lnet/minecraft/class_746;I)I
      // 77: ireturn
   }

   private boolean aaa(class_1799 param1) {
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
      // 06: ifne 11
      // 09: ifnull 39
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 18: ifne 39
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
      // 27: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 2a: iload 2
      // 2b: ifne 36
      // 2e: ifeq 39
      // 31: goto 35
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   @Override
   public void abbbab(JsonObject var1) {
      super.abbbab(var1);
      this.bbabaaa(
         var1,
         aabbaaaba.abba(ba(a(1232795862, 509886855 ^ -1525023866), a(1232795861, 509886855 ^ -876428647))),
         new aaabbbab[]{this.abb}
      );
   }

   @Override
   public void aabaa() {
      this.aab = abb(a(1232795860, 86204174 ^ -1748386951), 1618658197676259975L);
      this.aba();
   }

   public boolean aab() {
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
      // 06: ifne 18
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.babbaab ()Z
      // 0c: ifeq 3e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaba J
      // 1b: ldc_w 1232795867
      // 1e: ldc_w 1712735179
      // 21: ldc_w -423032927
      // 24: ixor
      // 25: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.a (II)I
      // 28: ldc2_w 3880986169881156226
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb (IJ)J
      // 2e: lcmp
      // 2f: iload 1
      // 30: ifne 3b
      // 33: ifeq 3e
      // 36: goto 3a
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   private void aba() {
      this.aaba = bbb(a(1232795866, 2020144314 ^ -513035911), 3880986169881156226L);
      this.bba = bbb(a(1232795865, 2020144314 ^ -1932629111), 3880986169881156226L);
      this.ab = bbb(a(1232795864, 2020144314 ^ 1859196914), 3880986169881156226L);
      this.bbb = -1;
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1232795871, -183920059 ^ 704272366);
      if (aaaa[var3] == null) {
         aaaa[var3] = (int)(bb[var3] ^ var1);
      }

      return aaaa[var3];
   }

   private boolean bab(class_310 param1, class_746 param2, int param3) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bba (Lnet/minecraft/class_746;)I
      // 08: istore 5
      // 0a: istore 4
      // 0c: iload 5
      // 0e: iload 4
      // 10: ifne 27
      // 13: ifge 1d
      // 16: goto 1a
      // 19: athrow
      // 1a: bipush 1
      // 1b: ireturn
      // 1c: athrow
      // 1d: aload 2
      // 1e: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 21: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 24: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 27: iload 4
      // 29: ifne 43
      // 2c: ifne 36
      // 2f: goto 33
      // 32: athrow
      // 33: bipush 0
      // 34: ireturn
      // 35: athrow
      // 36: aload 1
      // 37: iload 4
      // 39: ifne 4a
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aba (Lnet/minecraft/class_310;)Z
      // 3f: goto 43
      // 42: athrow
      // 43: ifne 49
      // 46: bipush 0
      // 47: ireturn
      // 48: athrow
      // 49: aload 1
      // 4a: iload 4
      // 4c: ifne 62
      // 4f: bipush 3
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.abba (Lnet/minecraft/class_310;I)Z
      // 53: ifne 5d
      // 56: goto 5a
      // 59: athrow
      // 5a: bipush 0
      // 5b: ireturn
      // 5c: athrow
      // 5d: aload 1
      // 5e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.baab (Lnet/minecraft/class_310;)V
      // 61: aload 1
      // 62: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 65: aload 2
      // 66: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 69: getfield net/minecraft/class_1723.field_7763 I
      // 6c: iload 5
      // 6e: iload 3
      // 6f: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
      // 72: aload 2
      // 73: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 76: bipush 1
      // 77: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = 639371480;
      int var30 = "n듅雐뀽雛뛍雙넕\uf6d5놭ᛐ냽뛶넵㛈럭뛕됍뛓뜵㛁뉥뛐끅㛙늕뛚뚅囎낝盒똭囝낽훒늵ᛴ늝ᛝ똕㛀둝\uf6d0눵훆똽뛅뵕\uf6da똭훈뉝囂럅㛉뜝囙뙅훌뛅雜띝ᛂ럽\uf6f7돽雀끕㛄눽雄농直랕㛋댍\uf6d3뚥\uf6cb낽囅냽盇냍雚럵ᛴ뷅雷눽\uf6d5닽盇됥囊뜥훅뇕盟놕ᛛ듭㛴됕㛁뷽뛘띝囷됍훊!䴇ᴒ䆧ﴴ䐏\udd0f䉗崊䍿\udd02䋧ᴊ䅯ﴂ䂯㴐䅿ﴉ䷏鴀䒏㴉䍷㴈䶏紴䅏㴄䉿봘䉧봜䌏0耼툓贄ሐ腌㈀蓴툜茼爅蕤㈶趄\uf21a肴㈷趌刘肔㈎跼눷葼\uf201聼\uf21b肤鈒芬툙蒼ም聜눞趬눉苜ም胜鈞芔ሞ趄划臌㈋莤\uf234\n藆娔薶驢頾褐飦ᩡ颦᩠\u0010㞭듓㈝㓀ㄝ듕フᓚ㈍瓛㎽듊ヅᓶ㜵ᓚ\n搜ﯨﭞ믡ﬖ寬אַ㯬\uf86e㯭\u0010√ꢎ⅒\ue89c☚좋↲袑⌲\ue881♺좈∢袇⏚袄\n锒\u0a57闢즣梊⦢梲䦢棲䦣\u0010掔\uf18c涤醈惼醚暴\uf19a洤熴淼ㆄ搬톊洼熕\n\uf525휩\uf555ᜡ좝眢종霢졅霥"
         .length();
      String[] var31 = new String[10];
      int var32 = 0;
      short var34 = 25264;
      int var33 = 0;
      String var29 = "n듅雐뀽雛뛍雙넕\uf6d5놭ᛐ냽뛶넵㛈럭뛕됍뛓뜵㛁뉥뛐끅㛙늕뛚뚅囎낝盒똭囝낽훒늵ᛴ늝ᛝ똕㛀둝\uf6d0눵훆똽뛅뵕\uf6da똭훈뉝囂럅㛉뜝囙뙅훌뛅雜띝ᛂ럽\uf6f7돽雀끕㛄눽雄농直랕㛋댍\uf6d3뚥\uf6cb낽囅냽盇냍雚럵ᛴ뷅雷눽\uf6d5닽盇됥囊뜥훅뇕盟놕ᛛ듭㛴됕㛁뷽뛘띝囷됍훊!䴇ᴒ䆧ﴴ䐏\udd0f䉗崊䍿\udd02䋧ᴊ䅯ﴂ䂯㴐䅿ﴉ䷏鴀䒏㴉䍷㴈䶏紴䅏㴄䉿봘䉧봜䌏0耼툓贄ሐ腌㈀蓴툜茼爅蕤㈶趄\uf21a肴㈷趌刘肔㈎跼눷葼\uf201聼\uf21b肤鈒芬툙蒼ም聜눞趬눉苜ም胜鈞芔ሞ趄划臌㈋莤\uf234\n藆娔薶驢頾褐飦ᩡ颦᩠\u0010㞭듓㈝㓀ㄝ듕フᓚ㈍瓛㎽듊ヅᓶ㜵ᓚ\n搜ﯨﭞ믡ﬖ寬אַ㯬\uf86e㯭\u0010√ꢎ⅒\ue89c☚좋↲袑⌲\ue881♺좈∢袇⏚袄\n锒\u0a57闢즣梊⦢梲䦢棲䦣\u0010掔\uf18c涤醈惼醚暴\uf19a洤熴淼ㆄ搬톊洼熕\n\uf525휩\uf555ᜡ좝眢종霢졅霥";

      do {
         char var35 = var29.charAt(var33);
         int var37 = 0;
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            char var38 = var36[var37];
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 3 | var38 << '\r') & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 3 | var38 >>> '\r') & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      abaa = var31;
      abab = new Object[var31.length];
      int var25 = -237006998;
      byte[] var23 = "û::\u008fÀä¹WÚ\u0016¼Û`%\u001cõý¶±\u0088\\Ì&Ê.¼4n\n\u00914ÌÎ&,ß\u001e\u009f18\u008dvLèö©Å\u001dËT:V\u009f\u0019|7}\u008b\u0016\u0019æ\u0087ö\u0086Ì¸\u0093ÙÑf6åùq.csõÄ¢F½[Ù¸Ez«.£Ë\u008cû¿ãÈ\u000b\u0096\\(} º\u0006\u0083w\u0082M¾.ÅÌºe\u0091²:ðJÌÂgá§oðpñ`'õü\u0018J\u007fP`\u008f\u001bUuÕ½V¶áã§yÌ?½¢\u0016Èc3L\u0085ÝËø³\u0094\u001b\u0087\nQ\u0007\u0084Ò\u0088\u0088| ãÌb\u0000N\u009d°mº@\u008f-?ýp¹\u0092þ\u0094ï´ªúPc2qc\n/\u0088ù\u008bßH\u0083îi¬)\u0091ëõ=#óä(îkÎ\u009a\u001e\u0089ÍÃà ¸7ÚF\t\u008b\u0013mJ\\õ\u008f\u0099Ð×ê`A\u0082\u009e\u007f\u0016×VOÎ\u0090\u0011W^;¨Õ\u0085\u007fûXMiÏ2U@\u008aw±?\u0096Ïý÷mì²Ë)O:l \u008c\u0017ç1ªÔ\u009c\"%´1ö\u000435É®\u0005BG\u0086üÉEe¼wà\u0090\u0003\u0015\u009d\u0012\u00019¢\u009añ\u0093@ü o628pwZÛÞ\u0081Ú©?`\u000f-Ä\u009dæýßð#þ6\u0089jk\u009aé\u000f\u0088èv*Ø¥D}ò\u0016eê À©@=\u008e°\u0091Óæ\u0087\u0092\u0003ðÇr\u0080KFà²ÿ\u009f\u0086Z·(óû\u007fF\u0005\u0005¢áJ¹|\u0000\u009bëö\u0085³\u0082}`ä³¶«z@4c{\t\u0002ÖÔLI\n³<Ê¾¶ÒÝ)Oc±\u00ad¤ý\u0090ïò`\\\u00142O(\u0010áTùðâ I·+\u007fä\t),\u008bß[\u0007\u0097\u009d×\u0016²ý©÷íÇåýçV\u0016Á1¡\u0099ÃA\u0096x÷ã¡2C\u008b£rY\u001a÷éoa¦z´.\t\u00014\u0080\u0097\u0006\u0017Lr9\u0084w\u0019µærA3gç,ã¦\u0083¬)¥[.a\u0012¡J\u001cÜß\u0090\f×z«@r6y6\u0000\u0090µAV\u0092e¾êÆv·\u0091(\u0082zæi\u000b\rýÏóÍ\u0098Kç\u008a_\bX\u0002\"ãS¨O6óÑó6P\u0094*~÷ái\u0000»\u000fÚà\u000er\u009b\u000bVq\u0019èyªÃ\u008a\u0088ªæ¿%(J¡Yà$µAö´ì\u008d\u008a\u0015öl\u008aÕ\u0084Ä8?Û\\Î\u009d\u0092Îz\u0001ý¬\u0000¯jn\u0006úX¾\u009b|æ{±çGëMîc1°{!\u0099É\u0080\u0010Ç¬1ºSP0%\u0005YU«\u0092\u0012ÛÉ\u0001\u0086lo§\u0015~Ð\u001c\u0013ÕÌ!ìÚ_\u0085´\u007f¥\u001aö@_,\u0000qg\u0014Èc.e\u001dôn@®k\u0010b Â\u0005ÌUEÑ\u007f\u0094·µ}øåàûþx\u0082\u0006ô\u0007Xíè`ø\u001c\u0095<\u001a\u008b.,\by\nu\u0094l \u0093\u0016£+\u0090\u009d_\u008b#l\u0084nÃô ï\"pa?X¢J9§êt\u0007ã,\u0003ês/±²Ý;\u0001».Á\u009c\u001b×ìºM\u0094<Ú\u0083ûelS\bð}ñ()$U\u0085a5z¹u}ÃU\u0081ÚFb3Ù\u0003TY\u000b\u0017ñ4ÿ{\u009fÏ\u0004qÌxOJh\u008a×¶}c,\t\f\u0019\r\u0005\u0006! Õ²\b/àØ5¼\r\u0005F>©å\u009d¯\u0004;\u0088\u0014 Ó£vð\u001c#\\ï3é\u0086-ô#Ô\u001faú¹\u0011Ú\u001b\u0007eå+\u0002åä2{NLYF¼w®>'HÔÂ®òêxÂé$\u0017M³`Mè¨R\u000fô\\r\u0083\u0099)q°+Ùñ\u0018\u0007\u0092òy;ñ)\nØ~å3E\u0006ðþ]\u0097a\u0084-]\tjf®»z\u0098\u0087s¢É%\u0080\u0099ø\u0007ëñ\u0003\u00ad\u0019\r\u0091\u0010û\u008dM\u008døC\u0098Ø\u008b\u0017wô\u0089Î.¸ÚÝOÏø-ä\u000bS\u0015\u0019Q\u000fÎ½â\u0089A°ÊW\u008e\u00ad\u0081E=ê?\u008cèOÀ\u0091r%4ÿf$\u007f\u0088\u0098\u0007©\u0091\u0087\tä¦òXi1\u0004\\\u0082ÀýxÇ\u0000\u0017\u0085\u001b^{\u0005pµ\u0087\u009bImúÆ¥3G\u0099,\u007f%¯ÊÊN\u0003,¦I A5ä7I5\u0088%%e\u0094/¾ XÍ&o²7¬§\u0005b]F¾.©j'T÷A\u0014\u001bÇQ§æÚjàj/Efè¥&>zè\u0089Ê\u0005¢\b®~¼ü\u009b£Rä¼$!\u0098êUÎ\u009cóq9#\u0015¤=Mü&\u0098ym\u0003I\u008dÕ°\u0010Á8zã\u0007!¦â¯L\u00038\\®\u001cD&\u009b©³\u0097\u008cõ\u0019¢=bIXóQg\u00834\u0001þ\nEp/\u00140\u008cºmÉCjk<\u001c·}cvàùÅ\u001eù\u007f\t¸²*jÿM>Ê\u0016Ø\u008f\u0004r£Ù)\u0017oöG\u0018`\u001cë~:ºwQÞ¶å¹Q\u000e\u001f%<mYýÔn\u009b\u0096±\u0000"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      aabb = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         aabb[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[5];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b(var39 ^ 2139764862, '쬀', (short)'\uda75')).length();
      int var17 = a(1232796131, var39 ^ -1703137207);
      int var43 = -1;

      label130:
      while (true) {
         String var10000 = var18.substring(++var43, var43 + var17);
         int var10001 = -1;

         while (true) {
            char[] var72;
            label125: {
               char[] var53 = var10000.toCharArray();
               int var10003 = var53.length;
               int var22 = 0;
               var72 = var53;
               var10001 = var10003;
               char[] var88;
               int var10004;
               if (var10003 <= 1) {
                  var88 = var53;
                  var10004 = var22;
               } else {
                  var72 = var53;
                  var10001 = var10003;
                  if (var10003 <= var22) {
                     break label125;
                  }

                  var88 = var53;
                  var10004 = var22;
               }

               while (true) {
                  var88[var10004] = (char)(var88[var10004] ^ switch (var22 % a(1232796129, var39 ^ -1152337972)) {
                     case 0 -> 1;
                     case 1 -> a(1232796128, var39 ^ 23270937);
                     case 2 -> a(1232796135, var39 ^ -1661944980);
                     case 3 -> a(1232796134, var39 ^ 1032467322);
                     case 4 -> a(1232796133, var39 ^ 1341800087);
                     case 5 -> a(1232796132, var39 ^ 1809260925);
                     default -> a(1232796139, var39 ^ -1352653281);
                  });
                  var22++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var88 = var72;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var88 = var72;
                     var10004 = var22;
                  }
               }
            }

            String var95 = new String(var72).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var95;
                  if ((var43 += var17) >= var20) {
                     aaa = var21;
                     aaab = new String[5];
                     long var8 = 4700908338919327345L;
                     long[] var14 = new long[a(1232796138, var39 ^ 2144943071)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = b(var39 ^ -341288192, '쬂', (short)'ꠤ')).length();
                     byte var10 = 0;

                     label104:
                     while (true) {
                        int var60 = var10;
                        var10 += 8;
                        var10000 = var12.substring(var60, var10);
                        var60 = var39 ^ -2127991873;
                        char var78 = '쬃';
                        short var96 = 876;
                        byte[] var15 = var10000.getBytes("ISO-8859-1");
                        long[] var47 = var14;
                        var60 = var11++;
                        long var79 = (var15[0] & 255L) << a(1232796137, var39 ^ -332380644)
                           | (var15[1] & 255L) << a(1232796136, var39 ^ -1745891792)
                           | (var15[2] & 255L) << a(1232796143, var39 ^ -1441648492)
                           | (var15[3] & 255L) << a(1232796142, var39 ^ -27298100)
                           | (var15[4] & 255L) << a(1232796141, var39 ^ 483204361)
                           | (var15[5] & 255L) << a(1232796140, var39 ^ -2017330097)
                           | (var15[a(1232796147, var39 ^ -1375823651)] & 255L) << a(1232796146, var39 ^ -1340064742)
                           | var15[a(1232796145, var39 ^ -1741216412)] & 255L;
                        byte var97 = -1;

                        while (true) {
                           long var105 = var79 ^ var8;
                           switch (var97) {
                              case 0:
                                 var47[var60] = var105;
                                 if (var10 >= var13) {
                                    bb = var14;
                                    aaaa = new Integer[a(1232796159, var39 ^ -618423488)];
                                    aa = abb(a(1232796158, var39 ^ 1538670197), 4097758548142228201L);
                                    baa = abb(a(1232796157, var39 ^ 1558062848), 4094509691478681378L);
                                    long var0 = 3262186457163548643L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = b(var39 ^ -1611712527, '쬆', (short)'\ue881')).length();
                                    byte var2 = 0;

                                    label94:
                                    while (true) {
                                       int var65 = var2;
                                       var2 += 8;
                                       var10000 = var4.substring(var65, var2);
                                       var65 = var39 ^ 982349349;
                                       char var82 = '쬇';
                                       short var100 = 15058;
                                       byte[] var7 = var10000.getBytes("ISO-8859-1");
                                       long[] var50 = var6;
                                       var65 = var3++;
                                       long var83 = (var7[0] & 255L) << a(1232796156, var39 ^ 246839824)
                                          | (var7[1] & 255L) << a(1232796099, var39 ^ 23199482)
                                          | (var7[2] & 255L) << a(1232796098, var39 ^ 2030859711)
                                          | (var7[3] & 255L) << a(1232796097, var39 ^ 29954433)
                                          | (var7[4] & 255L) << a(1232796096, var39 ^ 345224811)
                                          | (var7[5] & 255L) << a(1232796103, var39 ^ -676861627)
                                          | (var7[a(1232796102, var39 ^ 411710604)] & 255L) << a(1232796101, var39 ^ -1018117461)
                                          | var7[a(1232796100, var39 ^ 1376423663)] & 255L;
                                       byte var101 = -1;

                                       while (true) {
                                          var105 = var83 ^ var0;
                                          switch (var101) {
                                             case 0:
                                                var50[var65] = var105;
                                                if (var2 >= var5) {
                                                   bab = var6;
                                                   ba = new Long[4];
                                                   aba = bbb(a(1232796114, var39 ^ 876869371), 8818169013936726181L);
                                                   return;
                                                }
                                                break;
                                             default:
                                                var50[var65] = var105;
                                                if (var2 < var5) {
                                                   continue label94;
                                                }

                                                var5 = (var4 = b(var39 ^ 318179483, '쬈', (short)'굷')).length();
                                                var2 = 0;
                                          }

                                          int var68 = var2;
                                          var2 += 8;
                                          var10000 = var4.substring(var68, var2);
                                          var68 = var39 ^ 214974150;
                                          char var85 = '쬉';
                                          char var103 = 'ꂁ';
                                          var7 = var10000.getBytes("ISO-8859-1");
                                          var50 = var6;
                                          var65 = var3++;
                                          var83 = (var7[0] & 255L) << a(1232796107, var39 ^ -1430341310)
                                             | (var7[1] & 255L) << a(1232796106, var39 ^ 2059469150)
                                             | (var7[2] & 255L) << a(1232796105, var39 ^ 1724045420)
                                             | (var7[3] & 255L) << a(1232796104, var39 ^ -382031298)
                                             | (var7[4] & 255L) << a(1232796111, var39 ^ -1390146692)
                                             | (var7[5] & 255L) << a(1232796110, var39 ^ -50960559)
                                             | (var7[a(1232796109, var39 ^ 566830597)] & 255L) << a(1232796108, var39 ^ -1674136749)
                                             | var7[a(1232796115, var39 ^ -1613568879)] & 255L;
                                          var101 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var47[var60] = var105;
                                 if (var10 < var13) {
                                    continue label104;
                                 }

                                 var13 = (var12 = b(var39 ^ -322739870, '쬄', (short)31121)).length();
                                 var10 = 0;
                           }

                           int var63 = var10;
                           var10 += 8;
                           var10000 = var12.substring(var63, var10);
                           var63 = var39 ^ 1424063733;
                           char var81 = '쬅';
                           char var99 = '\uda8f';
                           var15 = var10000.getBytes("ISO-8859-1");
                           var47 = var14;
                           var60 = var11++;
                           var79 = (var15[0] & 255L) << a(1232796144, var39 ^ 313773647)
                              | (var15[1] & 255L) << a(1232796151, var39 ^ 670781675)
                              | (var15[2] & 255L) << a(1232796150, var39 ^ -654086032)
                              | (var15[3] & 255L) << a(1232796149, var39 ^ 1340457324)
                              | (var15[4] & 255L) << a(1232796148, var39 ^ -1694897983)
                              | (var15[5] & 255L) << a(1232796155, var39 ^ 1792038646)
                              | (var15[a(1232796154, var39 ^ 484880651)] & 255L) << a(1232796153, var39 ^ -500070215)
                              | var15[a(1232796152, var39 ^ -546779454)] & 255L;
                           var97 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var95;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label130;
                  }

                  var20 = (var18 = b(var39 ^ -1820305471, '쬁', (short)18539)).length();
                  var17 = a(1232796130, var39 ^ -1583172708);
                  var43 = -1;
            }

            var10000 = var18.substring(++var43, var43 + var17);
            var10001 = 0;
         }
      }
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
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1a
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.babbaab ()Z
      // 0c: ifne 19
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aba ()V
      // 17: return
      // 18: athrow
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaba J
      // 1d: ldc_w 1232795870
      // 20: ldc_w -1321736909
      // 23: ldc_w -2056823815
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.a (II)I
      // 2a: ldc2_w 3880986169881156226
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb (IJ)J
      // 30: lcmp
      // 31: ifne 36
      // 34: return
      // 35: athrow
      // 36: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 39: astore 2
      // 3a: invokestatic java/lang/System.currentTimeMillis ()J
      // 3d: lstore 3
      // 3e: lload 3
      // 3f: aload 0
      // 40: iload 1
      // 41: ifne 6b
      // 44: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.ab J
      // 47: lsub
      // 48: ldc_w 1232795869
      // 4b: ldc_w -1321736909
      // 4e: ldc_w 888171853
      // 51: ixor
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.a (II)I
      // 55: ldc2_w 1832531947539987453
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb (IJ)J
      // 5b: lcmp
      // 5c: ifle 69
      // 5f: goto 63
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aba ()V
      // 67: return
      // 68: athrow
      // 69: lload 3
      // 6a: aload 0
      // 6b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaba J
      // 6e: lcmp
      // 6f: ifge 74
      // 72: return
      // 73: athrow
      // 74: aload 2
      // 75: iload 1
      // 76: ifne 81
      // 79: ifnull ad
      // 7c: goto 80
      // 7f: athrow
      // 80: aload 2
      // 81: iload 1
      // 82: ifne 94
      // 85: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 88: ifnull ad
      // 8b: goto 8f
      // 8e: athrow
      // 8f: aload 2
      // 90: goto 94
      // 93: athrow
      // 94: iload 1
      // 95: ifne a7
      // 98: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 9b: ifnull ad
      // 9e: goto a2
      // a1: athrow
      // a2: aload 2
      // a3: goto a7
      // a6: athrow
      // a7: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // aa: ifnull af
      // ad: return
      // ae: athrow
      // af: aload 0
      // b0: aload 2
      // b1: iload 1
      // b2: ifne d2
      // b5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // b8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aa (Lnet/minecraft/class_746;)Z
      // bb: ifne c8
      // be: goto c2
      // c1: athrow
      // c2: aload 0
      // c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aba ()V
      // c6: return
      // c7: athrow
      // c8: aload 0
      // c9: iload 1
      // ca: ifne e2
      // cd: aload 2
      // ce: goto d2
      // d1: athrow
      // d2: aload 2
      // d3: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // d6: lload 3
      // d7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.ab (Lnet/minecraft/class_310;Lnet/minecraft/class_746;J)Z
      // da: ifeq e5
      // dd: aload 0
      // de: goto e2
      // e1: athrow
      // e2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aba ()V
      // e5: return
   }

   public aaababbba() {
      int var1 = 2144346133;
      super(
         aabbaaaba.aaab(ba(a(1232795868, var1 ^ -874879520), a(1232795811, var1 ^ 210451539))),
         bbaabbba.aa,
         aabbaaaba.aaab(ba(a(1232795810, var1 ^ 2113613071), a(1232795809, var1 ^ -134668082)))
      );
      this.abb = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(ba(a(1232795808, var1 ^ -238524301), a(1232795815, var1 ^ 77034534))),
               55.0,
               60.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(ba(a(1232795814, var1 ^ 1543365345), a(1232795813, var1 ^ -40505269))))
      );
      this.aab = abb(a(1232795812, var1 ^ -825415517), 5448864638065063975L);
      this.aaba = bbb(a(1232795819, var1 ^ 1383401035), 7752970898373275086L);
      this.bba = bbb(a(1232795818, var1 ^ 224616326), 3880986169881156226L);
      this.ab = bbb(a(1232795817, var1 ^ -1022941997), 3880986169881156226L);
      this.bbb = -1;
   }

   private int bba(class_746 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 07: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 0a: invokevirtual net/minecraft/class_2371.size ()I
      // 0d: istore 3
      // 0e: istore 2
      // 0f: ldc_w 1232795816
      // 12: ldc_w -1852648156
      // 15: ldc_w 2097649
      // 18: ixor
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.a (II)I
      // 1c: ldc2_w 7140910813369711420
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.abb (IJ)I
      // 22: istore 4
      // 24: iload 4
      // 26: ldc_w 1232795823
      // 29: ldc_w -1852648156
      // 2c: ldc_w 1848599241
      // 2f: ixor
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.a (II)I
      // 33: ldc2_w 7183226156116856490
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.abb (IJ)I
      // 39: iload 3
      // 3a: invokestatic java/lang/Math.min (II)I
      // 3d: if_icmpge 78
      // 40: aload 1
      // 41: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 44: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 47: iload 4
      // 49: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 4c: checkcast net/minecraft/class_1735
      // 4f: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 52: astore 5
      // 54: iload 2
      // 55: ifne 74
      // 58: aload 0
      // 59: aload 5
      // 5b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaa (Lnet/minecraft/class_1799;)Z
      // 5e: iload 2
      // 5f: ifne 79
      // 62: goto 66
      // 65: athrow
      // 66: ifeq 71
      // 69: goto 6d
      // 6c: athrow
      // 6d: iload 4
      // 6f: ireturn
      // 70: athrow
      // 71: iinc 4 1
      // 74: iload 2
      // 75: ifeq 24
      // 78: bipush -1
      // 79: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = aabb[var0 ^ 1232796131] ^ var1 ^ var0;
      var2 ^= 59314;
      var2 += 40878;
      var2 ^= 48367;
      var2 += 18314;
      var2 -= 24878;
      var2 ^= 6845;
      var2 += 55257;
      var2 -= 58277;
      return var2 ^ 25161;
   }

   private static long bbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(1232795822, 2051316488 ^ -698307029)) & a(1232795821, 2051316488 ^ -1246722667);
      if (ba[var3] == null) {
         ba[var3] = bab[var3] ^ var1;
      }

      return ba[var3];
   }

   private int aaaa(class_746 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: bipush 0
      // 04: istore 4
      // 06: istore 3
      // 07: iload 4
      // 09: ldc_w 1232795820
      // 0c: ldc_w 757655110
      // 0f: ldc_w 1882486441
      // 12: ixor
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.a (II)I
      // 16: ldc2_w 6662199869544112379
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.abb (IJ)I
      // 1c: if_icmpge 5b
      // 1f: iload 4
      // 21: iload 3
      // 22: ifne 5c
      // 25: iload 3
      // 26: ifne 46
      // 29: goto 2d
      // 2c: athrow
      // 2d: iload 2
      // 2e: if_icmpeq 54
      // 31: goto 35
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 3a: iload 4
      // 3c: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaa (Lnet/minecraft/class_1799;)Z
      // 42: goto 46
      // 45: athrow
      // 46: iload 3
      // 47: ifne 53
      // 4a: ifeq 54
      // 4d: goto 51
      // 50: athrow
      // 51: iload 4
      // 53: ireturn
      // 54: iinc 4 1
      // 57: iload 3
      // 58: ifeq 07
      // 5b: bipush -1
      // 5c: ireturn
   }

   private long aaab(aaabbbab param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: dconst_0
      // 04: aload 1
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bab ()D
      // 08: aload 1
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.abb ()D
      // 0c: invokestatic java/lang/Math.min (DD)D
      // 0f: invokestatic java/lang/Math.max (DD)D
      // 12: dstore 3
      // 13: istore 2
      // 14: dload 3
      // 15: aload 1
      // 16: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bab ()D
      // 19: aload 1
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.abb ()D
      // 1d: invokestatic java/lang/Math.max (DD)D
      // 20: invokestatic java/lang/Math.max (DD)D
      // 23: dstore 5
      // 25: dload 3
      // 26: iload 2
      // 27: ifne 43
      // 2a: dload 5
      // 2c: dcmpl
      // 2d: ifne 3a
      // 30: goto 34
      // 33: athrow
      // 34: dload 3
      // 35: invokestatic java/lang/Math.round (D)J
      // 38: lreturn
      // 39: athrow
      // 3a: invokestatic java/util/concurrent/ThreadLocalRandom.current ()Ljava/util/concurrent/ThreadLocalRandom;
      // 3d: dload 3
      // 3e: dload 5
      // 40: invokevirtual java/util/concurrent/ThreadLocalRandom.nextDouble (DD)D
      // 43: invokestatic java/lang/Math.round (D)J
      // 46: lreturn
   }

   private boolean aaba(class_746 param1) {
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
      // 14: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 1a: istore 3
      // 1b: iload 3
      // 1c: iload 2
      // 1d: ifne 28
      // 20: iflt 65
      // 23: goto 27
      // 26: athrow
      // 27: iload 3
      // 28: iload 2
      // 29: ifne 56
      // 2c: ldc_w 1232795827
      // 2f: ldc_w -1070112902
      // 32: ldc_w 1740088041
      // 35: ixor
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.a (II)I
      // 39: ldc2_w 6662199869544112379
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.abb (IJ)I
      // 3f: if_icmpge 65
      // 42: goto 46
      // 45: athrow
      // 46: aload 0
      // 47: aload 1
      // 48: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 4b: iload 3
      // 4c: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 4f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaa (Lnet/minecraft/class_1799;)Z
      // 52: goto 56
      // 55: athrow
      // 56: iload 2
      // 57: ifne 62
      // 5a: ifeq 65
      // 5d: goto 61
      // 60: athrow
      // 61: bipush 1
      // 62: goto 66
      // 65: bipush 0
      // 66: ireturn
   }

   @Override
   public void abbaaba(class_1297 param1, byte param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 4
      // 008: istore 3
      // 009: aload 0
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.babbaab ()Z
      // 00d: ifeq 093
      // 010: aload 4
      // 012: iload 3
      // 013: ifne 023
      // 016: goto 01a
      // 019: athrow
      // 01a: ifnull 093
      // 01d: goto 021
      // 020: athrow
      // 021: aload 4
      // 023: iload 3
      // 024: ifne 037
      // 027: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 02a: ifnull 093
      // 02d: goto 031
      // 030: athrow
      // 031: aload 4
      // 033: goto 037
      // 036: athrow
      // 037: iload 3
      // 038: ifne 04b
      // 03b: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 03e: ifnull 093
      // 041: goto 045
      // 044: athrow
      // 045: aload 4
      // 047: goto 04b
      // 04a: athrow
      // 04b: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 04e: ifnonnull 093
      // 051: iload 2
      // 052: ldc_w 1232795826
      // 055: ldc_w 1319825543
      // 058: ldc_w -1343048399
      // 05b: ixor
      // 05c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.a (II)I
      // 05f: ldc2_w 7107584100062072731
      // 062: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.abb (IJ)I
      // 065: if_icmpne 093
      // 068: goto 06c
      // 06b: athrow
      // 06c: aload 1
      // 06d: iload 3
      // 06e: ifne 07d
      // 071: goto 075
      // 074: athrow
      // 075: ifnull 093
      // 078: goto 07c
      // 07b: athrow
      // 07c: aload 1
      // 07d: invokevirtual net/minecraft/class_1297.method_5628 ()I
      // 080: aload 4
      // 082: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 085: iload 3
      // 086: ifne 0a6
      // 089: invokevirtual net/minecraft/class_746.method_5628 ()I
      // 08c: if_icmpeq 095
      // 08f: goto 093
      // 092: athrow
      // 093: return
      // 094: athrow
      // 095: aload 0
      // 096: iload 3
      // 097: ifne 0c3
      // 09a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aab I
      // 09d: aload 4
      // 09f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a2: goto 0a6
      // 0a5: athrow
      // 0a6: getfield net/minecraft/class_746.field_6012 I
      // 0a9: if_icmpne 0ae
      // 0ac: return
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: aload 4
      // 0b1: iload 3
      // 0b2: ifne 0df
      // 0b5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0b8: getfield net/minecraft/class_746.field_6012 I
      // 0bb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aab I
      // 0be: aload 0
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: aload 4
      // 0c5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaba (Lnet/minecraft/class_746;)Z
      // 0cb: ifeq 0d4
      // 0ce: aload 0
      // 0cf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aba ()V
      // 0d2: return
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: iload 3
      // 0d6: ifne 0ed
      // 0d9: aload 4
      // 0db: goto 0df
      // 0de: athrow
      // 0df: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aa (Lnet/minecraft/class_746;)Z
      // 0e5: ifne 0f1
      // 0e8: aload 0
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aba ()V
      // 0f0: return
      // 0f1: invokestatic java/lang/System.currentTimeMillis ()J
      // 0f4: lstore 5
      // 0f6: aload 0
      // 0f7: lload 5
      // 0f9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.ab J
      // 0fc: aload 0
      // 0fd: lload 5
      // 0ff: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.aaba J
      // 102: aload 0
      // 103: ldc_w 1232795825
      // 106: ldc_w 1319825543
      // 109: ldc_w 1838802560
      // 10c: ixor
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.a (II)I
      // 110: ldc2_w 3880986169881156226
      // 113: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb (IJ)J
      // 116: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bba J
      // 119: aload 0
      // 11a: bipush -1
      // 11b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbba.bbb I
      // 11e: return
   }
}
