package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_5321;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class abbabbb extends abbaabbaa {
   private int aa;
   private static final int ab;
   private static final int ba;
   private static final int bb;
   private static final String[] aaa;
   private boolean aab;
   private static final long[] aba;
   private static final String[] babb;
   private static final Integer[] abb;
   private static final long[] baa;
   private final abbaaaaa bab;
   private int bba;
   private static final Long[] bbb;
   private boolean aaaa;
   private static String[] aaab;
   private static final int[] baba;
   private final abbaaaaa aaba;
   private final baabaab aabb;
   private long abaa;
   private long abab;
   private int abba;
   private static final Object[] bbaa;
   private static final String[] abbb;
   private static final int baaa;
   private final aaabbbab baab;

   private static int a(int var0, int var1) {
      int var2 = baba[var0 ^ 128301765] ^ var1 ^ var0;
      var2 ^= 22545;
      var2 -= 56719;
      var2 -= 49302;
      var2 -= 19685;
      var2 += 6848;
      return var2 - 30456;
   }

   private void aa(class_310 param1, class_746 param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 004: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 007: iload 3
      // 008: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 00b: checkcast net/minecraft/class_1735
      // 00e: astore 5
      // 010: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 013: aload 5
      // 015: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 018: astore 6
      // 01a: istore 4
      // 01c: iload 3
      // 01d: iload 4
      // 01f: ifne 093
      // 022: ldc 128301765
      // 024: ldc -1972820273
      // 026: ldc 1902878553
      // 028: ixor
      // 029: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 02c: ldc2_w 9146004191784347093
      // 02f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 032: if_icmpne 08d
      // 035: goto 039
      // 038: athrow
      // 039: aload 0
      // 03a: iload 4
      // 03c: ifne 08e
      // 03f: goto 043
      // 042: athrow
      // 043: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 046: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 049: checkcast java/lang/Boolean
      // 04c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04f: ifeq 08d
      // 052: goto 056
      // 055: athrow
      // 056: aload 0
      // 057: iload 4
      // 059: ifne 06f
      // 05c: goto 060
      // 05f: athrow
      // 060: aload 6
      // 062: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaa (Lnet/minecraft/class_1799;)Z
      // 065: ifeq 06e
      // 068: goto 06c
      // 06b: athrow
      // 06c: return
      // 06d: athrow
      // 06e: aload 0
      // 06f: aload 2
      // 070: aload 5
      // 072: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abbb (Lnet/minecraft/class_746;Lnet/minecraft/class_1735;)I
      // 075: iload 4
      // 077: ifne 093
      // 07a: istore 7
      // 07c: iload 7
      // 07e: iflt 08d
      // 081: aload 0
      // 082: aload 1
      // 083: aload 2
      // 084: iload 7
      // 086: iload 3
      // 087: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abb (Lnet/minecraft/class_310;Lnet/minecraft/class_746;II)Z
      // 08a: pop
      // 08b: return
      // 08c: athrow
      // 08d: aload 0
      // 08e: aload 6
      // 090: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bbb (Lnet/minecraft/class_1799;)I
      // 093: istore 7
      // 095: ldc 128301764
      // 097: ldc -1972820273
      // 099: ldc 1361055464
      // 09b: ixor
      // 09c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 09f: bipush -1
      // 0a0: istore 8
      // 0a2: ldc2_w 7280740476724291050
      // 0a5: iload 7
      // 0a7: istore 9
      // 0a9: ldc2_w -1.0
      // 0ac: dstore 10
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 0b1: istore 12
      // 0b3: iload 12
      // 0b5: ldc 128301767
      // 0b7: ldc -1972820273
      // 0b9: ldc 1699778140
      // 0bb: ixor
      // 0bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 0bf: ldc2_w 7534014478489938583
      // 0c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 0c5: if_icmpge 188
      // 0c8: aload 2
      // 0c9: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 0cc: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 0cf: iload 12
      // 0d1: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 0d4: checkcast net/minecraft/class_1735
      // 0d7: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 0da: astore 13
      // 0dc: iload 4
      // 0de: ifne 1a1
      // 0e1: aload 13
      // 0e3: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 0e6: iload 4
      // 0e8: ifne 100
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: ifeq 0f9
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: goto 180
      // 0f9: aload 5
      // 0fb: aload 13
      // 0fd: invokevirtual net/minecraft/class_1735.method_7680 (Lnet/minecraft/class_1799;)Z
      // 100: iload 4
      // 102: ifne 115
      // 105: ifne 10f
      // 108: goto 10c
      // 10b: athrow
      // 10c: goto 180
      // 10f: aload 0
      // 110: aload 13
      // 112: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bbb (Lnet/minecraft/class_1799;)I
      // 115: istore 14
      // 117: iload 14
      // 119: iload 4
      // 11b: ifne 12a
      // 11e: ifgt 128
      // 121: goto 125
      // 124: athrow
      // 125: goto 180
      // 128: iload 14
      // 12a: iload 7
      // 12c: if_icmpgt 133
      // 12f: goto 180
      // 132: athrow
      // 133: aload 0
      // 134: aload 13
      // 136: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bba (Lnet/minecraft/class_1799;)D
      // 139: dstore 15
      // 13b: iload 4
      // 13d: ifne 17c
      // 140: iload 14
      // 142: iload 9
      // 144: if_icmpgt 174
      // 147: goto 14b
      // 14a: athrow
      // 14b: iload 14
      // 14d: iload 4
      // 14f: ifne 171
      // 152: goto 156
      // 155: athrow
      // 156: iload 9
      // 158: if_icmpne 180
      // 15b: goto 15f
      // 15e: athrow
      // 15f: dload 15
      // 161: iload 4
      // 163: ifne 17a
      // 166: goto 16a
      // 169: athrow
      // 16a: dload 10
      // 16c: dcmpl
      // 16d: goto 171
      // 170: athrow
      // 171: ifle 180
      // 174: iload 14
      // 176: istore 9
      // 178: dload 15
      // 17a: dstore 10
      // 17c: iload 12
      // 17e: istore 8
      // 180: iinc 12 1
      // 183: iload 4
      // 185: ifeq 0b3
      // 188: iload 8
      // 18a: iload 4
      // 18c: ifne 1a0
      // 18f: ifge 197
      // 192: goto 196
      // 195: athrow
      // 196: return
      // 197: aload 0
      // 198: aload 1
      // 199: aload 2
      // 19a: iload 8
      // 19c: iload 3
      // 19d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abb (Lnet/minecraft/class_310;Lnet/minecraft/class_746;II)Z
      // 1a0: pop
      // 1a1: return
   }

   private boolean ab(class_310 var1) {
      try {
         switch (bbababa.b[((bbaaab)this.aabb.abbb()).ordinal()]) {
            case 1:
               return bbbbbbaa.baa(var1);
            case 2:
               return bbbbbbaa.a(var1);
            case 3:
               return bbbbbbaa.abb(var1);
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var2) {
         throw var2;
      }
   }

   private static long ba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(128301766, -1194909775 ^ 1597325629)) & a(128301761, -1194909775 ^ -568178335);
      if (bbb[var3] == null) {
         bbb[var3] = aba[var3] ^ var1;
      }

      return bbb[var3];
   }

   private long bb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 04: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bab ()D
      // 07: dstore 2
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0b: aload 0
      // 0c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 0f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.abb ()D
      // 12: dstore 4
      // 14: istore 1
      // 15: dload 2
      // 16: iload 1
      // 17: ifne 33
      // 1a: dload 4
      // 1c: dcmpl
      // 1d: ifne 2a
      // 20: goto 24
      // 23: athrow
      // 24: dload 2
      // 25: invokestatic java/lang/Math.round (D)J
      // 28: lreturn
      // 29: athrow
      // 2a: invokestatic java/util/concurrent/ThreadLocalRandom.current ()Ljava/util/concurrent/ThreadLocalRandom;
      // 2d: dload 2
      // 2e: dload 4
      // 30: invokevirtual java/util/concurrent/ThreadLocalRandom.nextDouble (DD)D
      // 33: invokestatic java/lang/Math.round (D)J
      // 36: lreturn
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
      // 24: getstatic net/minecraft/class_1802.field_8833 Lnet/minecraft/class_1792;
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

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = -649972164;
      String[] var25 = new String[10];
      int var26 = 0;
      int var24 = "ĝ䪞靅㖱ᦰ鰔댜遰◉꒰㳲ῥ\u0adc\ua878\ue9c2㖩\uf494䄟謁㨅鐪㙘\ue338貇\ue07a\ue1dd黗䨭肔哝ṏ蹊\u2e63\uf0ed젺\u009a\udf7e²䊎恜⨑ぬ\ue1e6迭받梔Ίꛂ孂磢玼斷呈䚧꓃\uf373뻍砪椌笯灓彇䲼狡惑뵼뺦ꏝ췀魲芤甒⤖ꓶ\ue19d\u008a穞뇇ဩ︃驪ᨡ\uec19ㇳ⢳䃙绖\uf443訏쩹ᄙỆ\ue9ed\uecb2盉푐빓ⓡ깠\ud980\uf0c9鯃葸ܝ葤疷斪ꊂ艽ￊ⼩稝床䛹ꨌ읥䁛\ue5e3ｿ봧呐௱╺㇄偾즧\uf6f3磘ḻ\ua4c8鿍ﱳ\ue0eb⤰썾橦彐巘⛷⚮됹㥥䍳欂\uee37ృ畱䪳檤䑟ｨ듒특ຝꝝ닑祈㊞璓鮟詑䆰\ude56䔝⒗뫪紉\udbe5䃚釄\ue43b켑⭜ꁍ⬦믧匝㑤衺鼥\uf2dc\u2072赵봑悱ﭥ牉競휦ᒗᒖʓ\ue6bb喖敷︠\ued54\ueb07ꨙ\ue805忚鐚\uf2b9⇶炕聆ﻇ캲麤䀐뎂켳㒃讦쓏噫鞠\uf846＞迟궛䵤铔ꎶ\uea35鿃鮓豯ᇊ쿉\ue2d6봂킌苒㮂킈賂ꥉ茌恩嘦븿竎ﳳᩰ뾮㫣毿觩ܥ楆ᩋ㺛砬\u2fdfଷ\uec66ᝢ㥟Lῥ쪫ᢍ㈰\ueb3c보릧靼鏣岓茉ꙿ\uf627ꂦ\u0ff9᜔\uf50e⺅䞜쾐꾔፦买\u0cfe귱䋾\u001d\ua82e봱泪તǍ묑쎺绑㣚㍾浊︆䤓䁝緯\ude45厵㖣\ueba1닸\udb58ყÕ\uee62\uf1fc\udeb0꿸뼐篜ƀ裻츢蹲\uee4d蠈깭裖\ueef1蠤컴踻临踒蹜輘蹽語滼諤仺輣踲蠒\uee42赘\u2e6a襮\u0ee8貄滬註긶袂九躠蹢觾\u0ef0譤컼詫ั蠚蹌袀\uee60踆仵責⻤身⸱譊\uee58赘칰詶仸覤⻪谓긠詒湍軰乩谞仪輜滺衣踡辢⹗覈\uee60赖컷誌軫觓\u0e3e角⹓蠨\uee73诞仮赌\u0eea躣临跲칛踠乮赦컬輼\u0eef訳긢謺蹏蹈\uee7b賆컳賜\ueef6豛⸧衊김躈乮裾\u0ee3贴\ueef9貛\uee38观칐誠칲辞⻠謬仴较\uee3e趪乆褘\uee72赶\ueee1訜껰讣主觪칄辈\uee64贆껩讄커輣踡袲깟輀칬觮껻覄껹賳긯輪湓蹠\u2e61蹆컩趄껹諫\uee29辊蹚訐깠訞컱衔⻱訃\uee37迒湇衸\u2e68軖滥辴껾踻踾赚蹆蹠\uee60贆컨訌\ueefc謋츰襒칀輸\u0e7d跖滨踄軪衛渺輒⹂袀乥辆⻭豴\ueef5身ฺ蠺乍贸\uee6b裾커賜껪裫⸮踂乆谐\u0e70踮⻬訌以躻츤誺๐譸\uee6c迖\ueefb趼\ueee2諫踫衒湉轨湢达滷詜\ueef4讫ร蹚\uee51贠\u0e77賦滷轌컵訃渢褒깈裠乶衮\u0ef3踜軴裣踧褪๕赈乣試⻯说껫註긿迚乏輸蹮贾껭趼\ueee4觫ห質湘褈\uee69讞\ueee2返\ueeea迋丰蠂蹝譈\uee62跾滣说컲裃丯贺\uee52躐\uee76袞滤説仭褣츢躒\uee5c諐湷覎컯贄\u0ef9蹫\uee34襊湗诈湹觞滩諴軽褋츾觪湈袀蹦賎껠趴滫进ⸯ裺⹌迀칮謦件貌仪诫\uee2b轺湑謠칷誖⻱趬\u0ef4譋⸶谚๑\n☂좉⇫\ue8e7⛹裈∯ꡂ➝ࡕ\u0010\u245f\u1c8f✦㳭⑤ﳕ⑺ﱛ⋨届\u244fᲙ₎볹⑼᳂\n\u0c45퐠\u0bac\uf44eಾ鑡ࡨ듫ේᓼx魶멡黗\uda11魵ᨤ鵳骩驑缾鬦婿鹟降髭騸鵳몫驙窴齶\u1a7e饧\uda15颍騤鲳骭駹㪰鸾婺飗娊鮥ᨰ鴋媣鰑᪩鯶驹魷㨅鶕稤鲛목鰁媨鯮㩪黯\uda04鹵\uda28飳骲飉\udab4鶶\uda68鲧稘騵㨣騃窠鶩ᪿ领\uda79駟\u1a1c鯭稻鰫몶鵩\udaad鿾\uda66鹇먔鵍\uda22鼛\udab1頩画鿖며饟먄鹥稸飫謁鶱\udab6鷞穪鴯먌魍娰鹫\udab5餩\udaa4颞驾黧塚鲥騶鷳㪦飱着\n釛깖防踸鄠\uee17闶캝遄溊\u0010䅪\ue91d䛻ꥳ䑁\ua958䅷꧒䍵ৈ䘒褖䅃楢䃱॑\n錓蹝铺긳鏨츜霾\uee96銌亁"
         .length();
      short var28 = 12270;
      int var27 = 0;
      String var23 = "ĝ䪞靅㖱ᦰ鰔댜遰◉꒰㳲ῥ\u0adc\ua878\ue9c2㖩\uf494䄟謁㨅鐪㙘\ue338貇\ue07a\ue1dd黗䨭肔哝ṏ蹊\u2e63\uf0ed젺\u009a\udf7e²䊎恜⨑ぬ\ue1e6迭받梔Ίꛂ孂磢玼斷呈䚧꓃\uf373뻍砪椌笯灓彇䲼狡惑뵼뺦ꏝ췀魲芤甒⤖ꓶ\ue19d\u008a穞뇇ဩ︃驪ᨡ\uec19ㇳ⢳䃙绖\uf443訏쩹ᄙỆ\ue9ed\uecb2盉푐빓ⓡ깠\ud980\uf0c9鯃葸ܝ葤疷斪ꊂ艽ￊ⼩稝床䛹ꨌ읥䁛\ue5e3ｿ봧呐௱╺㇄偾즧\uf6f3磘ḻ\ua4c8鿍ﱳ\ue0eb⤰썾橦彐巘⛷⚮됹㥥䍳欂\uee37ృ畱䪳檤䑟ｨ듒특ຝꝝ닑祈㊞璓鮟詑䆰\ude56䔝⒗뫪紉\udbe5䃚釄\ue43b켑⭜ꁍ⬦믧匝㑤衺鼥\uf2dc\u2072赵봑悱ﭥ牉競휦ᒗᒖʓ\ue6bb喖敷︠\ued54\ueb07ꨙ\ue805忚鐚\uf2b9⇶炕聆ﻇ캲麤䀐뎂켳㒃讦쓏噫鞠\uf846＞迟궛䵤铔ꎶ\uea35鿃鮓豯ᇊ쿉\ue2d6봂킌苒㮂킈賂ꥉ茌恩嘦븿竎ﳳᩰ뾮㫣毿觩ܥ楆ᩋ㺛砬\u2fdfଷ\uec66ᝢ㥟Lῥ쪫ᢍ㈰\ueb3c보릧靼鏣岓茉ꙿ\uf627ꂦ\u0ff9᜔\uf50e⺅䞜쾐꾔፦买\u0cfe귱䋾\u001d\ua82e봱泪તǍ묑쎺绑㣚㍾浊︆䤓䁝緯\ude45厵㖣\ueba1닸\udb58ყÕ\uee62\uf1fc\udeb0꿸뼐篜ƀ裻츢蹲\uee4d蠈깭裖\ueef1蠤컴踻临踒蹜輘蹽語滼諤仺輣踲蠒\uee42赘\u2e6a襮\u0ee8貄滬註긶袂九躠蹢觾\u0ef0譤컼詫ั蠚蹌袀\uee60踆仵責⻤身⸱譊\uee58赘칰詶仸覤⻪谓긠詒湍軰乩谞仪輜滺衣踡辢⹗覈\uee60赖컷誌軫觓\u0e3e角⹓蠨\uee73诞仮赌\u0eea躣临跲칛踠乮赦컬輼\u0eef訳긢謺蹏蹈\uee7b賆컳賜\ueef6豛⸧衊김躈乮裾\u0ee3贴\ueef9貛\uee38观칐誠칲辞⻠謬仴较\uee3e趪乆褘\uee72赶\ueee1訜껰讣主觪칄辈\uee64贆껩讄커輣踡袲깟輀칬觮껻覄껹賳긯輪湓蹠\u2e61蹆컩趄껹諫\uee29辊蹚訐깠訞컱衔⻱訃\uee37迒湇衸\u2e68軖滥辴껾踻踾赚蹆蹠\uee60贆컨訌\ueefc謋츰襒칀輸\u0e7d跖滨踄軪衛渺輒⹂袀乥辆⻭豴\ueef5身ฺ蠺乍贸\uee6b裾커賜껪裫⸮踂乆谐\u0e70踮⻬訌以躻츤誺๐譸\uee6c迖\ueefb趼\ueee2諫踫衒湉轨湢达滷詜\ueef4讫ร蹚\uee51贠\u0e77賦滷轌컵訃渢褒깈裠乶衮\u0ef3踜軴裣踧褪๕赈乣試⻯说껫註긿迚乏輸蹮贾껭趼\ueee4觫ห質湘褈\uee69讞\ueee2返\ueeea迋丰蠂蹝譈\uee62跾滣说컲裃丯贺\uee52躐\uee76袞滤説仭褣츢躒\uee5c諐湷覎컯贄\u0ef9蹫\uee34襊湗诈湹觞滩諴軽褋츾觪湈袀蹦賎껠趴滫进ⸯ裺⹌迀칮謦件貌仪诫\uee2b轺湑謠칷誖⻱趬\u0ef4譋⸶谚๑\n☂좉⇫\ue8e7⛹裈∯ꡂ➝ࡕ\u0010\u245f\u1c8f✦㳭⑤ﳕ⑺ﱛ⋨届\u244fᲙ₎볹⑼᳂\n\u0c45퐠\u0bac\uf44eಾ鑡ࡨ듫ේᓼx魶멡黗\uda11魵ᨤ鵳骩驑缾鬦婿鹟降髭騸鵳몫驙窴齶\u1a7e饧\uda15颍騤鲳骭駹㪰鸾婺飗娊鮥ᨰ鴋媣鰑᪩鯶驹魷㨅鶕稤鲛목鰁媨鯮㩪黯\uda04鹵\uda28飳骲飉\udab4鶶\uda68鲧稘騵㨣騃窠鶩ᪿ领\uda79駟\u1a1c鯭稻鰫몶鵩\udaad鿾\uda66鹇먔鵍\uda22鼛\udab1頩画鿖며饟먄鹥稸飫謁鶱\udab6鷞穪鴯먌魍娰鹫\udab5餩\udaa4颞驾黧塚鲥騶鷳㪦飱着\n釛깖防踸鄠\uee17闶캝遄溊\u0010䅪\ue91d䛻ꥳ䑁\ua958䅷꧒䍵ৈ䘒褖䅃楢䃱॑\n錓蹝铺긳鏨츜霾\uee96銌亁";

      do {
         char var29 = var23.charAt(var27);
         int var31 = 0;
         char[] var30 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 5) {
               default -> 64;
               case 1 -> 5;
               case 2 -> 193;
               case 3 -> 103;
               case 4 -> 195;
            }) ^ var32;
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 3 | var32 << 13) & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 3 | var32 >>> 13) & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      babb = var25;
      bbaa = new Object[var25.length];
      byte var39 = 0;
      baba = new int[419];
      int var10001 = 0;
      byte[] var10002 = "å1OËÅzÞ`ñ\nc/ùÁ¦\u0089xÖÛ\u0080\u0080¸D+Añ\u0092¸ðý\u0006+É×2ñCÁ(\u0091²X|\u0088!Ø\u0016e'ë\u0005|¥R¥\u0001\u0088óM!;cuÑ\u0088;[ÃÜÃ\u0018¦u\u0002\"ïkÀ\u0001ÕVz\b7æÜêòæ«ø}I\u0081Z\u0099å#G;\r\u0015Á\u008eÐ;ï\u008fÞR=\u001a½g\u008a\u000fëê\u0099\u0011F\u0004\u001d\t\u0019Q\u0090¬\u0007ßÇ£Ê\u0096QJ\u0011\u0018\u007f\u0091XÁrà\u001d\u0088\u001cMËÛ\u001c\u0083eLù\fØþ¥4\u0084|\u0006v\u008eI Î~\u009c\u001c\u0080\t\u001c\u0002I\t\u0087e×»y$\u000fr´\u0089Òÿ¢ã¹)à¼í\u000bÕáÝèì\u00880ø\u0092ÿ \u009e\u0000Q{Hîu\u0088\u0083»\nô\f!\u00adÝ\u0097&QÇ(£hÆ\u001aÌI\u001d\u0081¯\u009f\u0083ØÊ\u0094hM08²\u001a\u001d/}z¶Ê®Ã+1\u001c\u0002Ø7n4i0LWäNÂêZÛâ§\u008cÃ\u0096C\u0093Ó3\u00071\u0004\u0017öú\u0002Õ=h= 'ÂW\u0012\u0096À°Æ3\u0011vlC¯1àZ\u0080ðJÕÓ\u001båPÏYÜb\u0097¹3,uC\u00032BØ^´\u007f\u0005{rñB[\u0011áÏí\u0000<gøn{-$Ï\u0010õ[õ*ì\u0000x\u0081\u0090\u001dÛ\u009cØoFàJAÇaÒã4\u0007Ì{\u0014&2\fqUyA\u0000ñM\u0013ÁKØ}a|}\u009e¨\u009c¶\u00adúO¸\u00049K\u001a0å4M\u0081\u009d)\u000f\u009f¡T³È\u00adh\u008bbd(1<2¢\\¸i¦Í'ÜÔó÷8\u0083Úy\u0000S\u001aWIÞ\u001cJfóç3X\u0018S\u0006Ø\u009b\u0086©nx§N«Òð#®\u008e§0ìùq/E\u0094ÌÜ¾¬\u0001\n{dýg\u0097Ô\u0084,Vþ%`ÿR¤0Æ.-\u008c\u000b@\u0096;\\2\u0090\u008aÛü×fî\u0018K7¬\u0089lªÔ\u0083\u0007Ã\u0011\u0082ðfñ¬vMßLTD\u0092¡4P\u0005\u0083·\u000f¹kvóùËÑ=ÝÚ¤\u0002å\u00044\u0006£¼½l\u0084ÙÍºp¨&\u001e\u0013u\u0005¼Ó\u0012~nPM>J;Î\u0092±{Û\u0099gºR÷\f\u0015k¤v\u0017ÿÐ·\u001d%g\u001a´´\u0086»/\u001fL\u0088ìÉY?ù\u008bæ;\u0091IÞ5ìs\u0084j¹·\u0002á\u0011\u000fl[°{®\u0081\u0097N´öÐ\u000fÃâ\u00ad\u0005ú#M\u0002\u009eá\u001b¯S°EdÎ¾\u009c\u009ccS\u0017¨=µbÝ*éR9\u0089±c\\nRÎd\u009c±¢évS³Q\u0084\u0094\u009bq\u0012å\u000eÖ\u0018øà«Õà\u000bP\u00adÃÿgxD\u0085aÕÈ\u00136]E·\fYâ\u0088\u0086Ä8\u0083¥&\fe^\u008f\u001c÷ ¨\u0098eIÔY\u0083\u00182*©Ú\u0011w)G\u000e4\u0099úùæn±ÊÍÖ\u0099R`9ÇH\u0099,ÙûtÕ\u0089éö rÎ©\u0086¨Ù\u0087U\u0019%ò\u0096\u0003Ö×sîìPª0-ü\u0081\u008cB6âa¨t\u0019µ°¤c$\u009bs\u0098õF¥È\u001ewäÐ\u009eìmNô\u00ad\u001f\u0018\u0087\u0016Â°\u00893Ô¸\u0007º~÷6J`\u0012\u008e\u0081d\u000e8\u0012ã¡¿8\u0016]å§)b ÌyØçÛNü~0{Á31t)Æ\u009fæ>\u001cÏ\u009eÃ³I¹O! Ý\u0096pÿ0\u00adÎ¼\u009eÁ´ÆÊn.³\u001cü}×\u008f/Oò\u00868b`§ª\u008câ·/\u009bt%\u0019\u0010Õc\u009eÅ~UmM#Å.õ Þ\u008c\"ªrí\u00830í½\u0018õµÙ4¥u¾Ò,\u0097\u00034¯Mÿ``ì\u001c\u0090K\u008a\u0019¢ Ñk\rÉ8\u0097OâÃß~\u009d\\R\u0019O\u008c->ÀÆÔÞ \u0010\u0095\u001d¦§Y÷\u0098Â.×\u001coÛ%ÿÅ\u0015\u0090ç\u0094\u008eçOóC\u0002¶\u00918ð=\f\u0007°Q^~e'\u0012ÔebÛÀZàþÜ?Ø4\b\u009bÒÊJó\u001c@Pö<\u0011\bOÏÍ\tûÆ«§}Å«Ú`rð\u0081/c&\\ØkyñÉº\u0004ýõhR\u0003\u0006½³?\u0018d\u009cQ2\u0018ü\u0081n¢w£\u000esí\u001e\u0094\u0017Ç\u0001\u0091\u001f¾\tæ\u0013\u0094&\u0080¶¶xä\u007f´ÿñÞi°=\u0002ÚÃQµ\u0081?\u009d\u008eØ>J´¯\u009eÚ\u009cï\u0093çObTÔ\u0091Æ\u0010ä?B\u008a%\u0088~\bÍ\bòÛÚ#áz\u0083\u0089/ù3\u007f\u0002¥\u0091ÏúA\u0005KÉ Î\u0014\u0096 \u00146t\r\u0089ÈÄB\u0014\u0004ô~\u0015ÆãO\u0098À=\u00905Íw\u008cP\\\u001e@N\u0012ÂÏ\u0095ãçÙlÍE\u001a\u009dÆî2s£7ûÚ\u0086²\u0082N\u009fªTµ\"ù¨\u001c¦ÃS`ý³lÃ\u000fcæ·Ä\u008e IÇ¹\u0017\u0098¢±ª\u001ckb{¥\u0019®\u0083[eh\u0099\u0081¸_º%eð\u001d7Â\u008cÔ\tÀ\u0002íc'ê¤Ã¬q\u0001\u0007¦?Xrf\u0097\u0099¦\u001b\u001fEÍ.\u0017Ög¢\u0014\u008cõ¡)\u001aOÚ\u0017\u0088\u0095Û·\u0090·q\u0010Ã\u0082¯=â¬ºú¨\u001e¡ôÆ\u000f {§¼á\u0080I\u001fc®Y¬õ*7³\u0088nè\u008b»Â9<Ê\u008cÌBµ#\u0092\u0084\foiæ<«®i\u0012õUÊèÓ\u0011=]VÑm¸\u0080L\u009c\b\u0086V\u0095Ï\u001b²X:\u0080 \u0092´'6+ÀîKæT¿ÁËoä\u0088\u0085i\u008ag§\u0018S·\u0088«\u0005~Þ\bk_¹<\n\\\u0010ÛL$4+\u0097}+\u0002§¡Â¾\f¢b¸\u001c]\u0012\u008a»ûë\u0093ìW\u001d\u00167\u0019\u00198êòq¤\u000eP\u0096xõ\u008e\r8uî\u009c\u009bëä¨$\u008d¾\u0098\bRjaæï\u0092_÷tX\u0090\u0089CP\u00adÓöoÎÎûÚ\u0015Uù2¥!\u0086\u0002¨*0e\u0096\u008fB\u0088»\u0090g\u0004ÑÐÛló\u001e\u0099Ì\u0099Sÿ\u0001·\u00872\u008f'Så\u0085P\u0002ïy[\u0002¾n}\u0010(\u0091\u001b&\u00027×rcW\u0082ù}FØ2à×4}£V«\u0013ÖÐ§Ô<\"*m\u0099"
         .getBytes("ISO-8859-1");

      int var98;
      do {
         baba[var39] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 429172929;
         var39 += 1;
         var98 = var10001 + 4;
         var10001 += 4;
      } while (var98 < var10002.length);

      String[] var21 = new String[a(128301760, var33 ^ 1204387669)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b(-213381991, var33 ^ 1103979077)).length();
      int var17 = a(128301763, var33 ^ -2038388259);
      int var37 = -1;

      label137:
      while (true) {
         String var40 = var18.substring(++var37, var37 + var17);
         var10001 = (byte)-1;

         while (true) {
            label132: {
               char[] var52 = var40.toCharArray();
               var98 = var52.length;
               int var22 = 0;
               var77 = var52;
               var10001 = var98;
               char[] var102;
               int var120;
               if (var98 <= 1) {
                  var102 = var52;
                  var120 = var22;
               } else {
                  var77 = var52;
                  var10001 = var98;
                  if (var98 <= var22) {
                     break label132;
                  }

                  var102 = var52;
                  var120 = var22;
               }

               while (true) {
                  var102[var120] = (char)(var102[var120] ^ switch (var22 % a(128301772, var33 ^ -2068835336)) {
                     case 0 -> a(128301775, var33 ^ 1965639482);
                     case 1 -> a(128301774, var33 ^ -425120292);
                     case 2 -> a(128301769, var33 ^ -526762448);
                     case 3 -> a(128301768, var33 ^ 1646501520);
                     case 4 -> a(128301771, var33 ^ 1333950103);
                     case 5 -> a(128301770, var33 ^ -65909081);
                     default -> a(128301781, var33 ^ 1330274428);
                  });
                  var22++;
                  if (var10001 == 0) {
                     var120 = var10001;
                     var102 = var77;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var102 = var77;
                     var120 = var22;
                  }
               }
            }

            String var109 = new String(var77).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var109;
                  if ((var37 += var17) >= var20) {
                     aaa = var21;
                     abbb = new String[a(128301773, var33 ^ 245762434)];
                     long var8 = 3349374750048365107L;
                     long[] var14 = new long[a(128301780, var33 ^ 464659434)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = b(-213381989, var33 ^ -1005251158)).length();
                     byte var10 = 0;

                     label111:
                     while (true) {
                        int var59 = var10;
                        var10 += 8;
                        String var42 = var12.substring(var59, var10);
                        var59 = -213381990;
                        int var83 = var33 ^ -241883370;
                        byte[] var15 = var42.getBytes("ISO-8859-1");
                        long[] var43 = var14;
                        var59 = var11++;
                        long var84 = (var15[0] & 255L) << a(128301783, var33 ^ -1301079634)
                           | (var15[1] & 255L) << a(128301782, var33 ^ -1397671267)
                           | (var15[2] & 255L) << a(128301777, var33 ^ -1861536928)
                           | (var15[3] & 255L) << a(128301776, var33 ^ 565039532)
                           | (var15[4] & 255L) << a(128301779, var33 ^ 567984920)
                           | (var15[5] & 255L) << a(128301778, var33 ^ -1896848907)
                           | (var15[a(128301789, var33 ^ 575831106)] & 255L) << a(128301788, var33 ^ -899351820)
                           | var15[a(128301791, var33 ^ 390780149)] & 255L;
                        byte var110 = -1;

                        while (true) {
                           long var122 = var84 ^ var8;
                           switch (var110) {
                              case 0:
                                 var43[var59] = var122;
                                 if (var10 >= var13) {
                                    baa = var14;
                                    abb = new Integer[a(128301793, var33 ^ -621205708)];
                                    ab = baab(a(128301792, var33 ^ 212470861), 6246681062090929472L);
                                    baaa = baab(a(128301795, var33 ^ -1573007592), 2667174420153913857L);
                                    bb = baab(a(128301794, var33 ^ 529500610), 2775410299444943208L);
                                    ba = baab(a(128301805, var33 ^ 1124988062), 2480516233476773728L);
                                    long var0 = 6552523383909486616L;
                                    long[] var6 = new long[a(128301804, var33 ^ 1228413853)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = b(-213381985, var33 ^ 1711630680)).length();
                                    byte var2 = 0;

                                    label101:
                                    while (true) {
                                       int var64 = var2;
                                       var2 += 8;
                                       String var45 = var4.substring(var64, var2);
                                       var64 = -213381986;
                                       int var87 = var33 ^ -949077586;
                                       byte[] var7 = var45.getBytes("ISO-8859-1");
                                       long[] var46 = var6;
                                       var64 = var3++;
                                       long var88 = (var7[0] & 255L) << a(128301807, var33 ^ -1175640071)
                                          | (var7[1] & 255L) << a(128301806, var33 ^ -831702727)
                                          | (var7[2] & 255L) << a(128301801, var33 ^ -822714696)
                                          | (var7[3] & 255L) << a(128301800, var33 ^ 2080907113)
                                          | (var7[4] & 255L) << a(128301803, var33 ^ -1245334897)
                                          | (var7[5] & 255L) << a(128301802, var33 ^ 953407725)
                                          | (var7[a(128301813, var33 ^ -292452420)] & 255L) << a(128301812, var33 ^ -861611377)
                                          | var7[a(128301815, var33 ^ 798864226)] & 255L;
                                       var110 = -1;

                                       while (true) {
                                          var122 = var88 ^ var0;
                                          switch (var110) {
                                             case 0:
                                                var46[var64] = var122;
                                                if (var2 >= var5) {
                                                   aba = var6;
                                                   bbb = new Long[a(128301817, var33 ^ 532393774)];
                                                   aaab = new String[baab(a(128301816, var33 ^ -1975401980), 8076951250661666722L)];
                                                   baaa();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var46[var64] = var122;
                                                if (var2 < var5) {
                                                   continue label101;
                                                }

                                                var5 = (var4 = b(-213381999, var33 ^ -43485254)).length();
                                                var2 = 0;
                                          }

                                          int var67 = var2;
                                          var2 += 8;
                                          String var47 = var4.substring(var67, var2);
                                          var67 = -213382000;
                                          int var90 = var33 ^ -952694545;
                                          var7 = var47.getBytes("ISO-8859-1");
                                          var46 = var6;
                                          var64 = var3++;
                                          var88 = (var7[0] & 255L) << a(128301814, var33 ^ 1071891648)
                                             | (var7[1] & 255L) << a(128301809, var33 ^ 1500604948)
                                             | (var7[2] & 255L) << a(128301808, var33 ^ -1885384962)
                                             | (var7[3] & 255L) << a(128301811, var33 ^ 1154101641)
                                             | (var7[4] & 255L) << a(128301810, var33 ^ -883911015)
                                             | (var7[5] & 255L) << a(128301821, var33 ^ 1347906180)
                                             | (var7[a(128301820, var33 ^ -271428706)] & 255L) << a(128301823, var33 ^ -574787004)
                                             | var7[a(128301822, var33 ^ 1188996312)] & 255L;
                                          var110 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var43[var59] = var122;
                                 if (var10 < var13) {
                                    continue label111;
                                 }

                                 var13 = (var12 = b(-213381987, var33 ^ 1360209843)).length();
                                 var10 = 0;
                           }

                           int var62 = var10;
                           var10 += 8;
                           String var44 = var12.substring(var62, var10);
                           var62 = -213381988;
                           int var86 = var33 ^ 350050988;
                           var15 = var44.getBytes("ISO-8859-1");
                           var43 = var14;
                           var59 = var11++;
                           var84 = (var15[0] & 255L) << a(128301790, var33 ^ 421725778)
                              | (var15[1] & 255L) << a(128301785, var33 ^ 2048307528)
                              | (var15[2] & 255L) << a(128301784, var33 ^ 748397135)
                              | (var15[3] & 255L) << a(128301787, var33 ^ -2123028900)
                              | (var15[4] & 255L) << a(128301786, var33 ^ -568284224)
                              | (var15[5] & 255L) << a(128301797, var33 ^ -1062273800)
                              | (var15[a(128301796, var33 ^ 233269770)] & 255L) << a(128301799, var33 ^ -697744176)
                              | var15[a(128301798, var33 ^ -1615836765)] & 255L;
                           var110 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var37);
                  break;
               default:
                  var21[var19++] = var109;
                  if ((var37 += var17) < var20) {
                     var17 = var18.charAt(var37);
                     continue label137;
                  }

                  var20 = (var18 = b(-213381992, var33 ^ -1078518569)).length();
                  var17 = a(128301762, var33 ^ 931937623);
                  var37 = -1;
            }

            var40 = var18.substring(++var37, var37 + var17);
            var10001 = (byte)0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var3 = var0 ^ -213381991;
      char[] var4 = babb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bbaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bbaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2066239228;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 6;
            case 1 -> 178;
            case 2 -> 237;
            case 3 -> 173;
            case 4 -> 120;
            case 5 -> 251;
            case 6 -> 247;
            case 7 -> 163;
            case 8 -> 85;
            case 9 -> 6;
            case 10 -> 139;
            case 11 -> 173;
            case 12 -> 85;
            case 13 -> 240;
            case 14 -> 15;
            case 15 -> 181;
            case 16 -> 223;
            case 17 -> 23;
            case 18 -> 114;
            case 19 -> 117;
            case 20 -> 159;
            case 21 -> 120;
            case 22 -> 97;
            case 23 -> 162;
            case 24 -> 64;
            case 25 -> 119;
            case 26 -> 156;
            case 27 -> 58;
            case 28 -> 146;
            case 29 -> 41;
            case 30 -> 173;
            case 31 -> 96;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private void aab(class_310 param1, class_746 param2) {
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
      // 06: ifne 1e
      // 09: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0c: instanceof net/minecraft/class_490
      // 0f: ifeq 1d
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: bipush 0
      // 18: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaaa Z
      // 1b: return
      // 1c: athrow
      // 1d: aload 1
      // 1e: new net/minecraft/class_490
      // 21: dup
      // 22: aload 2
      // 23: invokespecial net/minecraft/class_490.<init> (Lnet/minecraft/class_1657;)V
      // 26: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // 29: aload 0
      // 2a: bipush 1
      // 2b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaaa Z
      // 2e: return
   }

   private boolean aba() {
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
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abba I
      // 0c: iflt 2a
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aa I
      // 1b: iload 1
      // 1c: ifne 27
      // 1f: iflt 2a
      // 22: goto 26
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: ireturn
   }

   private boolean abb(class_310 param1, class_746 param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 09: iload 5
      // 0b: ifne 4b
      // 0e: instanceof net/minecraft/class_490
      // 11: ifeq 3b
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: iload 5
      // 1b: ifne 31
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bab (Lnet/minecraft/class_310;)Z
      // 26: ifne 30
      // 29: goto 2d
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
      // 2f: athrow
      // 30: aload 0
      // 31: iload 3
      // 32: iload 4
      // 34: aload 2
      // 35: aload 1
      // 36: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abab (IILnet/minecraft/class_746;Lnet/minecraft/class_310;)V
      // 39: bipush 1
      // 3a: ireturn
      // 3b: aload 0
      // 3c: iload 5
      // 3e: ifne 58
      // 41: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 44: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 47: goto 4b
      // 4a: athrow
      // 4b: checkcast java/lang/Boolean
      // 4e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 51: ifeq 57
      // 54: bipush 0
      // 55: ireturn
      // 56: athrow
      // 57: aload 0
      // 58: iload 5
      // 5a: ifne 6c
      // 5d: aload 1
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bab (Lnet/minecraft/class_310;)Z
      // 61: ifne 6b
      // 64: goto 68
      // 67: athrow
      // 68: bipush 0
      // 69: ireturn
      // 6a: athrow
      // 6b: aload 0
      // 6c: iload 3
      // 6d: iload 4
      // 6f: aload 2
      // 70: aload 1
      // 71: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abab (IILnet/minecraft/class_746;Lnet/minecraft/class_310;)V
      // 74: bipush 1
      // 75: ireturn
   }

   private boolean bab(class_310 param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaba ()Z
      // 08: iload 2
      // 09: ifne 3c
      // 0c: ifeq 30
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: iload 2
      // 16: ifne 2c
      // 19: goto 1d
      // 1c: athrow
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaaa (Lnet/minecraft/class_310;)Z
      // 20: ifne 2a
      // 23: goto 27
      // 26: athrow
      // 27: bipush 0
      // 28: ireturn
      // 29: athrow
      // 2a: aload 0
      // 2b: aload 1
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.ab (Lnet/minecraft/class_310;)Z
      // 2f: ireturn
      // 30: aload 1
      // 31: iload 2
      // 32: ifne 43
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aaaaa (Lnet/minecraft/class_310;)Z
      // 38: goto 3c
      // 3b: athrow
      // 3c: ifne 42
      // 3f: bipush 0
      // 40: ireturn
      // 41: athrow
      // 42: aload 1
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.abaa (Lnet/minecraft/class_310;)Z
      // 46: ireturn
   }

   private double bba(class_1799 param1) {
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
      // 09: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 0c: ifne 39
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: iload 2
      // 19: ifne 2b
      // 1c: invokevirtual net/minecraft/class_1799.method_7963 ()Z
      // 1f: ifeq 39
      // 22: goto 26
      // 25: athrow
      // 26: aload 1
      // 27: goto 2b
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifne 3d
      // 2f: invokevirtual net/minecraft/class_1799.method_7936 ()I
      // 32: ifgt 3c
      // 35: goto 39
      // 38: athrow
      // 39: dconst_1
      // 3a: dreturn
      // 3b: athrow
      // 3c: aload 1
      // 3d: invokevirtual net/minecraft/class_1799.method_7936 ()I
      // 40: aload 1
      // 41: invokevirtual net/minecraft/class_1799.method_7919 ()I
      // 44: isub
      // 45: i2d
      // 46: aload 1
      // 47: invokevirtual net/minecraft/class_1799.method_7936 ()I
      // 4a: i2d
      // 4b: ddiv
      // 4c: dreturn
   }

   @Override
   public void aabaa() {
      this.aaab(class_310.method_1551());
      this.aabb();
   }

   private int bbb(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1589850607
      // 003: istore 10
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 1
      // 00a: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 00d: iload 2
      // 00e: ifne 01c
      // 011: ifeq 01b
      // 014: goto 018
      // 017: athrow
      // 018: bipush -1
      // 019: ireturn
      // 01a: athrow
      // 01b: bipush 0
      // 01c: istore 3
      // 01d: aload 1
      // 01e: getstatic net/minecraft/class_9334.field_49636 Lnet/minecraft/class_9331;
      // 021: getstatic net/minecraft/class_9285.field_49326 Lnet/minecraft/class_9285;
      // 024: invokevirtual net/minecraft/class_1799.method_58695 (Lnet/minecraft/class_9331;Ljava/lang/Object;)Ljava/lang/Object;
      // 027: checkcast net/minecraft/class_9285
      // 02a: astore 4
      // 02c: aload 4
      // 02e: invokevirtual net/minecraft/class_9285.comp_2393 ()Ljava/util/List;
      // 031: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 036: astore 5
      // 038: aload 5
      // 03a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03f: ifeq 0b2
      // 042: aload 5
      // 044: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 049: iload 2
      // 04a: ifne 0ca
      // 04d: checkcast net/minecraft/class_9285$class_9287
      // 050: astore 6
      // 052: aload 6
      // 054: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
      // 057: getstatic net/minecraft/class_5134.field_23724 Lnet/minecraft/class_6880;
      // 05a: iload 2
      // 05b: ifne 08a
      // 05e: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 063: ifeq 07e
      // 066: goto 06a
      // 069: athrow
      // 06a: iload 3
      // 06b: aload 6
      // 06d: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
      // 070: invokevirtual net/minecraft/class_1322.comp_2449 ()D
      // 073: ldc2_w 10.0
      // 076: dmul
      // 077: d2i
      // 078: iadd
      // 079: istore 3
      // 07a: iload 2
      // 07b: ifeq 0ae
      // 07e: aload 6
      // 080: invokevirtual net/minecraft/class_9285$class_9287.comp_2395 ()Lnet/minecraft/class_6880;
      // 083: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // 086: goto 08a
      // 089: athrow
      // 08a: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 08f: iload 2
      // 090: ifne 0ad
      // 093: ifeq 0ae
      // 096: goto 09a
      // 099: athrow
      // 09a: iload 3
      // 09b: aload 6
      // 09d: invokevirtual net/minecraft/class_9285$class_9287.comp_2396 ()Lnet/minecraft/class_1322;
      // 0a0: invokevirtual net/minecraft/class_1322.comp_2449 ()D
      // 0a3: ldc2_w 5.0
      // 0a6: dmul
      // 0a7: d2i
      // 0a8: iadd
      // 0a9: goto 0ad
      // 0ac: athrow
      // 0ad: istore 3
      // 0ae: iload 2
      // 0af: ifeq 038
      // 0b2: iload 3
      // 0b3: iload 2
      // 0b4: ifne 0bf
      // 0b7: ifne 0c0
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: bipush -1
      // 0bf: ireturn
      // 0c0: aload 1
      // 0c1: getstatic net/minecraft/class_9334.field_49633 Lnet/minecraft/class_9331;
      // 0c4: getstatic net/minecraft/class_9304.field_49385 Lnet/minecraft/class_9304;
      // 0c7: invokevirtual net/minecraft/class_1799.method_58695 (Lnet/minecraft/class_9331;Ljava/lang/Object;)Ljava/lang/Object;
      // 0ca: checkcast net/minecraft/class_9304
      // 0cd: astore 5
      // 0cf: aload 5
      // 0d1: invokevirtual net/minecraft/class_9304.method_57534 ()Ljava/util/Set;
      // 0d4: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 0d9: astore 6
      // 0db: aload 6
      // 0dd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e2: ifeq 33f
      // 0e5: aload 6
      // 0e7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ec: checkcast net/minecraft/class_6880
      // 0ef: astore 7
      // 0f1: aload 7
      // 0f3: invokeinterface net/minecraft/class_6880.method_40230 ()Ljava/util/Optional; 1
      // 0f8: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bbba (Lnet/minecraft/class_5321;)Ljava/lang/String;, (Lnet/minecraft/class_5321;)Ljava/lang/String; ]
      // 0fd: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 100: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 103: ldc_w 128301819
      // 106: iload 10
      // 108: ldc_w -1525541100
      // 10b: ixor
      // 10c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 10f: ldc2_w 7280740476724291050
      // 112: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 115: aaload
      // 116: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 119: checkcast java/lang/String
      // 11c: astore 8
      // 11e: aload 5
      // 120: aload 7
      // 122: invokevirtual net/minecraft/class_9304.method_57536 (Lnet/minecraft/class_6880;)I
      // 125: iload 2
      // 126: ifne 340
      // 129: istore 9
      // 12b: aload 8
      // 12d: iload 2
      // 12e: ifne 165
      // 131: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 134: ldc_w 128301818
      // 137: iload 10
      // 139: ldc_w -977695987
      // 13c: ixor
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 140: ldc2_w 8375227846316207775
      // 143: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 146: aaload
      // 147: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 14a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14d: ifeq 15f
      // 150: goto 154
      // 153: athrow
      // 154: iload 3
      // 155: iload 9
      // 157: bipush 3
      // 158: imul
      // 159: iadd
      // 15a: istore 3
      // 15b: iload 2
      // 15c: ifeq 33b
      // 15f: aload 8
      // 161: goto 165
      // 164: athrow
      // 165: iload 2
      // 166: ifne 19d
      // 169: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 16c: ldc_w 128301701
      // 16f: iload 10
      // 171: ldc_w 2082762944
      // 174: ixor
      // 175: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 178: ldc2_w 8375227846316207775
      // 17b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 17e: aaload
      // 17f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 182: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 185: ifeq 197
      // 188: goto 18c
      // 18b: athrow
      // 18c: iload 3
      // 18d: iload 9
      // 18f: bipush 2
      // 190: imul
      // 191: iadd
      // 192: istore 3
      // 193: iload 2
      // 194: ifeq 33b
      // 197: aload 8
      // 199: goto 19d
      // 19c: athrow
      // 19d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 1a0: ldc_w 128301700
      // 1a3: iload 10
      // 1a5: ldc_w -1109982934
      // 1a8: ixor
      // 1a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 1ac: ldc2_w 1342098169458014820
      // 1af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 1b2: aaload
      // 1b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1b6: iload 2
      // 1b7: ifne 1f4
      // 1ba: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1bd: ifeq 1cd
      // 1c0: goto 1c4
      // 1c3: athrow
      // 1c4: iload 3
      // 1c5: iload 9
      // 1c7: iadd
      // 1c8: istore 3
      // 1c9: iload 2
      // 1ca: ifeq 33b
      // 1cd: aload 8
      // 1cf: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 1d2: ldc_w 128301703
      // 1d5: iload 10
      // 1d7: ldc_w -1956195755
      // 1da: ixor
      // 1db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 1de: ldc2_w 8591825000063717313
      // 1e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 1e4: aaload
      // 1e5: iload 2
      // 1e6: ifne 224
      // 1e9: goto 1ed
      // 1ec: athrow
      // 1ed: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1f0: goto 1f4
      // 1f3: athrow
      // 1f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1f7: ifeq 205
      // 1fa: iinc 3 2
      // 1fd: iload 2
      // 1fe: ifeq 33b
      // 201: goto 205
      // 204: athrow
      // 205: aload 8
      // 207: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 20a: ldc_w 128301702
      // 20d: iload 10
      // 20f: ldc_w -387222441
      // 212: ixor
      // 213: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 216: ldc2_w 8990134458531981162
      // 219: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 21c: aaload
      // 21d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 220: goto 224
      // 223: athrow
      // 224: iload 2
      // 225: ifne 264
      // 228: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 22b: ifeq 23d
      // 22e: goto 232
      // 231: athrow
      // 232: iload 3
      // 233: iload 9
      // 235: bipush 2
      // 236: imul
      // 237: iadd
      // 238: istore 3
      // 239: iload 2
      // 23a: ifeq 33b
      // 23d: aload 8
      // 23f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 242: iload 2
      // 243: ifne 27c
      // 246: goto 24a
      // 249: athrow
      // 24a: ldc_w 128301697
      // 24d: iload 10
      // 24f: ldc_w 1431693328
      // 252: ixor
      // 253: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 256: ldc2_w 8128516969672089789
      // 259: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 25c: aaload
      // 25d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 260: goto 264
      // 263: athrow
      // 264: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 267: ifeq 273
      // 26a: iload 3
      // 26b: iload 9
      // 26d: iadd
      // 26e: istore 3
      // 26f: iload 2
      // 270: ifeq 33b
      // 273: aload 8
      // 275: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 278: goto 27c
      // 27b: athrow
      // 27c: iload 2
      // 27d: ifne 2b4
      // 280: ldc_w 128301696
      // 283: iload 10
      // 285: ldc_w 411247003
      // 288: ixor
      // 289: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 28c: ldc2_w 8726955207285166025
      // 28f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 292: aaload
      // 293: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 296: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 299: ifeq 2ab
      // 29c: goto 2a0
      // 29f: athrow
      // 2a0: iload 3
      // 2a1: iload 9
      // 2a3: bipush 2
      // 2a4: imul
      // 2a5: iadd
      // 2a6: istore 3
      // 2a7: iload 2
      // 2a8: ifeq 33b
      // 2ab: aload 8
      // 2ad: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 2b0: goto 2b4
      // 2b3: athrow
      // 2b4: ldc_w 128301699
      // 2b7: iload 10
      // 2b9: ldc_w -56827295
      // 2bc: ixor
      // 2bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 2c0: ldc2_w 4169064519634206007
      // 2c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 2c6: aaload
      // 2c7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2ca: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2cd: iload 2
      // 2ce: ifne 33a
      // 2d1: ifne 332
      // 2d4: goto 2d8
      // 2d7: athrow
      // 2d8: aload 8
      // 2da: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 2dd: ldc_w 128301698
      // 2e0: iload 10
      // 2e2: ldc_w -1203839405
      // 2e5: ixor
      // 2e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 2e9: ldc2_w 1389661379023783479
      // 2ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 2ef: aaload
      // 2f0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2f3: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f6: iload 2
      // 2f7: ifne 33a
      // 2fa: goto 2fe
      // 2fd: athrow
      // 2fe: ifne 332
      // 301: goto 305
      // 304: athrow
      // 305: aload 8
      // 307: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab [Ljava/lang/String;
      // 30a: ldc_w 128301709
      // 30d: iload 10
      // 30f: ldc_w 1240804384
      // 312: ixor
      // 313: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 316: ldc2_w 4974644924513203097
      // 319: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 31c: aaload
      // 31d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 320: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 323: iload 2
      // 324: ifne 33a
      // 327: goto 32b
      // 32a: athrow
      // 32b: ifeq 33b
      // 32e: goto 332
      // 331: athrow
      // 332: iload 3
      // 333: iload 9
      // 335: iadd
      // 336: goto 33a
      // 339: athrow
      // 33a: istore 3
      // 33b: iload 2
      // 33c: ifeq 0db
      // 33f: iload 3
      // 340: ireturn
   }

   private boolean aaaa(class_310 var1) {
      try {
         switch (bbababa.b[((bbaaab)this.aabb.abbb()).ordinal()]) {
            case 1:
               return bbbbbbaa.bbbb(var1);
            case 2:
               return bbbbbbaa.aaba(var1);
            case 3:
               return bbbbbbaa.aba(var1);
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var2) {
         throw var2;
      }
   }

   private void aaab(class_310 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaaa Z
      // 08: ifne 0d
      // 0b: return
      // 0c: athrow
      // 0d: aload 1
      // 0e: iload 2
      // 0f: ifne 1a
      // 12: ifnull 34
      // 15: goto 19
      // 18: athrow
      // 19: aload 1
      // 1a: iload 2
      // 1b: ifne 30
      // 1e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 21: instanceof net/minecraft/class_490
      // 24: ifeq 34
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 1
      // 2c: goto 30
      // 2f: athrow
      // 30: aconst_null
      // 31: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // 34: aload 0
      // 35: bipush 0
      // 36: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaaa Z
      // 39: return
   }

   private boolean aaba() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0b: checkcast java/lang/Boolean
      // 0e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11: iload 1
      // 12: ifne 20
      // 15: ifeq 1f
      // 18: goto 1c
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: athrow
      // 1f: bipush 1
      // 20: ireturn
   }

   private void aabb() {
      this.abba = -1;
      this.aa = -1;
      this.bba = baab(a(128301708, -939801377 ^ -459226072), 7488357220477533968L);
      this.aab = false;
      this.aaaa = false;
   }

   private boolean abaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 07: astore 3
      // 08: aload 3
      // 09: iload 2
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 3
      // 15: iload 2
      // 16: ifne 27
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 26
      // 1f: goto 23
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: athrow
      // 26: aload 3
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbababab;
      // 2d: astore 4
      // 2f: aload 4
      // 31: iload 2
      // 32: ifne 3e
      // 35: ifnull 51
      // 38: goto 3c
      // 3b: athrow
      // 3c: aload 4
      // 3e: aload 1
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbababab.bbba (Lnet/minecraft/class_310;)Z
      // 42: iload 2
      // 43: ifne 4e
      // 46: ifeq 51
      // 49: goto 4d
      // 4c: athrow
      // 4d: bipush 1
      // 4e: goto 52
      // 51: bipush 0
      // 52: ireturn
   }

   private void abab(int param1, int param2, class_746 param3, class_310 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 0
      // 06: iload 1
      // 07: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abba I
      // 0a: aload 0
      // 0b: iload 5
      // 0d: ifne 4d
      // 10: iload 2
      // 11: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aa I
      // 14: aload 0
      // 15: aload 3
      // 16: getfield net/minecraft/class_746.field_6012 I
      // 19: bipush 1
      // 1a: iadd
      // 1b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bba I
      // 1e: aload 0
      // 1f: bipush 1
      // 20: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aab Z
      // 23: aload 0
      // 24: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 2a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaab;
      // 2d: if_acmpne 42
      // 30: goto 34
      // 33: athrow
      // 34: aload 4
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bbab (Lnet/minecraft/class_310;)V
      // 39: iload 5
      // 3b: ifeq 5c
      // 3e: goto 42
      // 41: athrow
      // 42: aload 0
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 46: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 49: goto 4d
      // 4c: athrow
      // 4d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaab.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaab;
      // 50: if_acmpne 5c
      // 53: aload 4
      // 55: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bbb (Lnet/minecraft/class_310;)V
      // 58: goto 5c
      // 5b: athrow
      // 5c: return
   }

   private void abba(class_310 param1, class_746 param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 2
      // 06: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 09: getfield net/minecraft/class_1723.field_7763 I
      // 0c: istore 6
      // 0e: aload 1
      // 0f: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 12: iload 6
      // 14: iload 3
      // 15: bipush 0
      // 16: getstatic net/minecraft/class_1713.field_7790 Lnet/minecraft/class_1713;
      // 19: aload 2
      // 1a: iload 5
      // 1c: ifne 53
      // 1f: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 26: iload 6
      // 28: iload 4
      // 2a: bipush 0
      // 2b: getstatic net/minecraft/class_1713.field_7790 Lnet/minecraft/class_1713;
      // 2e: aload 2
      // 2f: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 32: aload 2
      // 33: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 36: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 39: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 3c: ifne 56
      // 3f: goto 43
      // 42: athrow
      // 43: aload 1
      // 44: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 47: iload 6
      // 49: iload 3
      // 4a: bipush 0
      // 4b: getstatic net/minecraft/class_1713.field_7790 Lnet/minecraft/class_1713;
      // 4e: aload 2
      // 4f: goto 53
      // 52: athrow
      // 53: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 56: return
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
      // 003: istore 1
      // 004: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 007: astore 2
      // 008: iload 1
      // 009: ifne 03d
      // 00c: aload 2
      // 00d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 010: ifnull 035
      // 013: goto 017
      // 016: athrow
      // 017: aload 2
      // 018: iload 1
      // 019: ifne 02f
      // 01c: goto 020
      // 01f: athrow
      // 020: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 023: ifnull 035
      // 026: goto 02a
      // 029: athrow
      // 02a: aload 2
      // 02b: goto 02f
      // 02e: athrow
      // 02f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 032: ifnonnull 03e
      // 035: aload 0
      // 036: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aabb ()V
      // 039: goto 03d
      // 03c: athrow
      // 03d: return
      // 03e: aload 0
      // 03f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaaa Z
      // 042: iload 1
      // 043: ifne 058
      // 046: ifeq 067
      // 049: goto 04d
      // 04c: athrow
      // 04d: aload 2
      // 04e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 051: instanceof net/minecraft/class_490
      // 054: goto 058
      // 057: athrow
      // 058: iload 1
      // 059: ifne 064
      // 05c: ifeq 067
      // 05f: goto 063
      // 062: athrow
      // 063: bipush 1
      // 064: goto 068
      // 067: bipush 0
      // 068: istore 3
      // 069: aload 0
      // 06a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 06d: iload 1
      // 06e: ifne 0ac
      // 071: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 074: checkcast java/lang/Boolean
      // 077: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07a: ifeq 09d
      // 07d: goto 081
      // 080: athrow
      // 081: aload 2
      // 082: iload 1
      // 083: ifne 0ac
      // 086: goto 08a
      // 089: athrow
      // 08a: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 08d: instanceof net/minecraft/class_490
      // 090: ifne 09d
      // 093: goto 097
      // 096: athrow
      // 097: aload 0
      // 098: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aabb ()V
      // 09b: return
      // 09c: athrow
      // 09d: aload 0
      // 09e: iload 1
      // 09f: ifne 0e8
      // 0a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0a5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: checkcast java/lang/Boolean
      // 0af: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b2: ifne 0e7
      // 0b5: aload 2
      // 0b6: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0b9: ifnull 0e7
      // 0bc: goto 0c0
      // 0bf: athrow
      // 0c0: iload 3
      // 0c1: iload 1
      // 0c2: ifne 0ec
      // 0c5: goto 0c9
      // 0c8: athrow
      // 0c9: ifne 0e7
      // 0cc: goto 0d0
      // 0cf: athrow
      // 0d0: aload 2
      // 0d1: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0d4: instanceof net/minecraft/class_490
      // 0d7: iload 1
      // 0d8: ifne 0ec
      // 0db: goto 0df
      // 0de: athrow
      // 0df: ifne 0e7
      // 0e2: goto 0e6
      // 0e5: athrow
      // 0e6: return
      // 0e7: aload 0
      // 0e8: aload 2
      // 0e9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abaa (Lnet/minecraft/class_310;)Z
      // 0ec: ifeq 0f0
      // 0ef: return
      // 0f0: aload 2
      // 0f1: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0f4: astore 4
      // 0f6: aload 0
      // 0f7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aba ()Z
      // 0fa: iload 1
      // 0fb: ifne 1c6
      // 0fe: ifeq 1bb
      // 101: goto 105
      // 104: athrow
      // 105: aload 0
      // 106: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aab Z
      // 109: iload 1
      // 10a: ifne 14a
      // 10d: goto 111
      // 110: athrow
      // 111: ifeq 143
      // 114: goto 118
      // 117: athrow
      // 118: aload 4
      // 11a: getfield net/minecraft/class_746.field_6012 I
      // 11d: iload 1
      // 11e: ifne 13f
      // 121: goto 125
      // 124: athrow
      // 125: aload 0
      // 126: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bba I
      // 129: if_icmpge 132
      // 12c: goto 130
      // 12f: athrow
      // 130: return
      // 131: athrow
      // 132: aload 0
      // 133: iload 1
      // 134: ifne 15c
      // 137: aload 2
      // 138: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bab (Lnet/minecraft/class_310;)Z
      // 13b: goto 13f
      // 13e: athrow
      // 13f: ifne 15b
      // 142: return
      // 143: aload 2
      // 144: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 147: instanceof net/minecraft/class_490
      // 14a: iload 1
      // 14b: ifne 167
      // 14e: ifne 15b
      // 151: goto 155
      // 154: athrow
      // 155: aload 0
      // 156: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aabb ()V
      // 159: return
      // 15a: athrow
      // 15b: aload 0
      // 15c: iload 1
      // 15d: ifne 1a7
      // 160: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aab Z
      // 163: goto 167
      // 166: athrow
      // 167: ifne 180
      // 16a: aload 0
      // 16b: iload 1
      // 16c: ifne 1a7
      // 16f: goto 173
      // 172: athrow
      // 173: aload 2
      // 174: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bab (Lnet/minecraft/class_310;)Z
      // 177: ifne 180
      // 17a: goto 17e
      // 17d: athrow
      // 17e: return
      // 17f: athrow
      // 180: aload 0
      // 181: aload 2
      // 182: aload 4
      // 184: aload 0
      // 185: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abba I
      // 188: aload 0
      // 189: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aa I
      // 18c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abba (Lnet/minecraft/class_310;Lnet/minecraft/class_746;II)V
      // 18f: iload 1
      // 190: aload 0
      // 191: invokestatic java/lang/System.currentTimeMillis ()J
      // 194: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abaa J
      // 197: aload 0
      // 198: aload 0
      // 199: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bb ()J
      // 19c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abab J
      // 19f: ifne 1ba
      // 1a2: aload 0
      // 1a3: goto 1a7
      // 1a6: athrow
      // 1a7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaaa Z
      // 1aa: ifeq 1b6
      // 1ad: aload 0
      // 1ae: aload 2
      // 1af: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaab (Lnet/minecraft/class_310;)V
      // 1b2: goto 1b6
      // 1b5: athrow
      // 1b6: aload 0
      // 1b7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aabb ()V
      // 1ba: return
      // 1bb: aload 4
      // 1bd: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 1c0: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 1c3: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 1c6: iload 1
      // 1c7: ifne 1df
      // 1ca: ifne 1d2
      // 1cd: goto 1d1
      // 1d0: athrow
      // 1d1: return
      // 1d2: invokestatic java/lang/System.currentTimeMillis ()J
      // 1d5: aload 0
      // 1d6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abaa J
      // 1d9: lsub
      // 1da: aload 0
      // 1db: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.abab J
      // 1de: lcmp
      // 1df: iload 1
      // 1e0: ifne 1ff
      // 1e3: ifge 1eb
      // 1e6: goto 1ea
      // 1e9: athrow
      // 1ea: return
      // 1eb: aload 0
      // 1ec: aload 2
      // 1ed: aload 4
      // 1ef: iload 1
      // 1f0: ifne 207
      // 1f3: bipush 5
      // 1f4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aa (Lnet/minecraft/class_310;Lnet/minecraft/class_746;I)V
      // 1f7: aload 0
      // 1f8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aba ()Z
      // 1fb: goto 1ff
      // 1fe: athrow
      // 1ff: ifeq 203
      // 202: return
      // 203: aload 0
      // 204: aload 2
      // 205: aload 4
      // 207: ldc_w 128301711
      // 20a: ldc_w -447373210
      // 20d: ldc_w -593231517
      // 210: ixor
      // 211: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 214: ldc2_w 9146004191784347093
      // 217: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 21a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aa (Lnet/minecraft/class_310;Lnet/minecraft/class_746;I)V
      // 21d: aload 0
      // 21e: iload 1
      // 21f: ifne 251
      // 222: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aba ()Z
      // 225: ifeq 22e
      // 228: goto 22c
      // 22b: athrow
      // 22c: return
      // 22d: athrow
      // 22e: aload 0
      // 22f: aload 2
      // 230: iload 1
      // 231: ifne 25b
      // 234: aload 4
      // 236: ldc_w 128301710
      // 239: ldc_w -447373210
      // 23c: ldc_w 1839611058
      // 23f: ixor
      // 240: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 243: ldc2_w 8726955207285166025
      // 246: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 249: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aa (Lnet/minecraft/class_310;Lnet/minecraft/class_746;I)V
      // 24c: aload 0
      // 24d: goto 251
      // 250: athrow
      // 251: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aba ()Z
      // 254: ifeq 259
      // 257: return
      // 258: athrow
      // 259: aload 0
      // 25a: aload 2
      // 25b: aload 4
      // 25d: ldc_w 128301705
      // 260: ldc_w -447373210
      // 263: ldc_w -931661300
      // 266: ixor
      // 267: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 26a: ldc2_w 8591825000063717313
      // 26d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 270: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aa (Lnet/minecraft/class_310;Lnet/minecraft/class_746;I)V
      // 273: return
   }

   @Override
   public void abaab() {
      this.abaa = 0L;
      this.abab = this.bb();
      this.aabb();
   }

   private int abbb(class_746 param1, class_1735 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush -1
      // 01: istore 4
      // 03: ldc2_w -1.0
      // 06: dstore 5
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0b: ldc_w 128301704
      // 0e: ldc_w -435174110
      // 11: ldc_w -1147993399
      // 14: ixor
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 18: ldc2_w 7280740476724291050
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 1e: istore 7
      // 20: istore 3
      // 21: iload 7
      // 23: ldc_w 128301707
      // 26: ldc_w -435174110
      // 29: ldc_w -1564734916
      // 2c: ixor
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.a (II)I
      // 30: ldc2_w 5586806415650716984
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.baab (IJ)I
      // 36: if_icmpge af
      // 39: aload 1
      // 3a: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 3d: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 40: iload 7
      // 42: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 45: checkcast net/minecraft/class_1735
      // 48: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 4b: astore 8
      // 4d: iload 3
      // 4e: ifne ab
      // 51: aload 0
      // 52: aload 8
      // 54: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.aaa (Lnet/minecraft/class_1799;)Z
      // 57: iload 3
      // 58: ifne b1
      // 5b: goto 5f
      // 5e: athrow
      // 5f: ifeq a8
      // 62: goto 66
      // 65: athrow
      // 66: aload 2
      // 67: aload 8
      // 69: invokevirtual net/minecraft/class_1735.method_7680 (Lnet/minecraft/class_1799;)Z
      // 6c: ifne 77
      // 6f: goto 73
      // 72: athrow
      // 73: goto a8
      // 76: athrow
      // 77: aload 0
      // 78: aload 8
      // 7a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbb.bba (Lnet/minecraft/class_1799;)D
      // 7d: dstore 9
      // 7f: iload 3
      // 80: ifne a4
      // 83: iload 4
      // 85: iflt a0
      // 88: goto 8c
      // 8b: athrow
      // 8c: dload 9
      // 8e: iload 3
      // 8f: ifne a6
      // 92: goto 96
      // 95: athrow
      // 96: dload 5
      // 98: dcmpl
      // 99: ifle a8
      // 9c: goto a0
      // 9f: athrow
      // a0: iload 7
      // a2: istore 4
      // a4: dload 9
      // a6: dstore 5
      // a8: iinc 7 1
      // ab: iload 3
      // ac: ifeq 21
      // af: iload 4
      // b1: ireturn
   }

   private static void baaa() {
      int var0 = -1138652466;
      aaab[0] = babb(
         bbab(a(128301706, var0 ^ 2009184407), a(128301717, var0 ^ -220340818)).toCharArray(),
         ba(a(128301716, var0 ^ -1064962878), 336397801925291243L),
         baab(a(128301719, var0 ^ -1905797112), 8711586537941091477L)
      );
      aaab[1] = babb(
         bbab(a(128301718, var0 ^ -1873773772), a(128301713, var0 ^ 376279558)).toCharArray(),
         ba(a(128301712, var0 ^ -790364999), 7345802766128078321L),
         baab(a(128301715, var0 ^ -1275884088), 1394570788229573527L)
      );
      aaab[2] = babb(
         bbab(a(128301714, var0 ^ -1573993316), a(128301725, var0 ^ -865521712)).toCharArray(),
         ba(a(128301724, var0 ^ 1828871070), 6803194273497632213L),
         baab(a(128301727, var0 ^ 1463347388), 5949907247247895560L)
      );
      aaab[3] = babb(
         bbab(a(128301726, var0 ^ -627887252), a(128301721, var0 ^ 2039385518)).toCharArray(),
         ba(a(128301720, var0 ^ -453852816), 7601069367912427177L),
         baab(a(128301723, var0 ^ 1702072584), 7016740769776397523L)
      );
      aaab[4] = babb(
         bbab(a(128301722, var0 ^ -1776980203), a(128301733, var0 ^ -1238042421)).toCharArray(),
         ba(a(128301732, var0 ^ -750318438), 279343296832701633L),
         baab(a(128301735, var0 ^ -1562122160), 7759340416660622967L)
      );
      aaab[5] = babb(
         bbab(a(128301734, var0 ^ 1666808622), a(128301729, var0 ^ -1016147128)).toCharArray(),
         ba(a(128301728, var0 ^ 177093344), 6243534283194691436L),
         baab(a(128301731, var0 ^ 1482537697), 7849731255355059160L)
      );
      aaab[baab(a(128301730, var0 ^ -1688659402), 5309852379125983628L)] = babb(
         bbab(a(128301741, var0 ^ 1193733846), a(128301740, var0 ^ 1060888997)).toCharArray(),
         ba(a(128301743, var0 ^ 54977271), 1374622486012698778L),
         baab(a(128301742, var0 ^ 259717846), 4584263303957428542L)
      );
      aaab[baab(a(128301737, var0 ^ -969246508), 1073590011128877782L)] = babb(
         bbab(a(128301736, var0 ^ -1867448343), a(128301739, var0 ^ -877360577)).toCharArray(),
         ba(a(128301738, var0 ^ 2126942166), 6219704848624557964L),
         baab(a(128301749, var0 ^ -1701716019), 1685306763765394698L)
      );
      aaab[baab(a(128301748, var0 ^ -1572779869), 2795401876025940972L)] = babb(
         bbab(a(128301751, var0 ^ -338903281), a(128301750, var0 ^ -991852451)).toCharArray(),
         ba(a(128301745, var0 ^ -100005576), 3273841231147415966L),
         baab(a(128301744, var0 ^ 2055808262), 3990989331884264314L)
      );
      aaab[baab(a(128301747, var0 ^ -865460783), 2086888302672831018L)] = babb(
         "".toCharArray(), ba(a(128301746, var0 ^ 163618496), 2212724640473484762L), baab(a(128301757, var0 ^ 211612917), 1233592339709009145L)
      );
      aaab[baab(a(128301756, var0 ^ 1324033671), 768772721946205964L)] = babb(
         bbab(a(128301759, var0 ^ -410620016), a(128301758, var0 ^ 482258051)).toCharArray(),
         ba(a(128301753, var0 ^ -646547596), 1714470706386594227L),
         baab(a(128301752, var0 ^ 902225739), 5870939507439633538L)
      );
      aaab[baab(a(128301755, var0 ^ -185836210), 227588530863546779L)] = babb(
         bbab(a(128301754, var0 ^ 1564477297), a(128301637, var0 ^ 1681718704)).toCharArray(),
         ba(a(128301636, var0 ^ -1454236956), 4262309794083762075L),
         baab(a(128301639, var0 ^ -31395406), 7664850481197681365L)
      );
      aaab[baab(a(128301638, var0 ^ 2045657982), 780512431654034474L)] = babb(
         bbab(a(128301633, var0 ^ 1275783320), a(128301632, var0 ^ 245074465)).toCharArray(),
         ba(a(128301635, var0 ^ 1989233064), 326586623439318062L),
         baab(a(128301634, var0 ^ -1282362944), 6455498470928149071L)
      );
      aaab[baab(a(128301645, var0 ^ 1405012929), 3076809466078062156L)] = babb(
         bbab(a(128301644, var0 ^ 2103375871), a(128301647, var0 ^ 817091975)).toCharArray(),
         ba(a(128301646, var0 ^ -1483613412), 7933891080177061845L),
         baab(a(128301641, var0 ^ 460944497), 5389702284855061333L)
      );
      aaab[baab(a(128301640, var0 ^ 1540978693), 5724970183856386772L)] = babb(
         bbab(a(128301643, var0 ^ 2143815604), a(128301642, var0 ^ 1192561359)).toCharArray(),
         ba(a(128301653, var0 ^ 28232881), 4375844710186090631L),
         baab(a(128301652, var0 ^ 650880459), 2544584957449220143L)
      );
      aaab[baab(a(128301655, var0 ^ -759513515), 8562040031443304479L)] = babb(
         bbab(a(128301654, var0 ^ -1318607334), a(128301649, var0 ^ 1895888545)).toCharArray(),
         ba(a(128301648, var0 ^ -228640070), 1536721417994770341L),
         baab(a(128301651, var0 ^ -1713597435), 4602623062734024536L)
      );
      aaab[baab(a(128301650, var0 ^ -641075975), 1268190352482973265L)] = babb(
         bbab(a(128301661, var0 ^ 406869152), a(128301660, var0 ^ -1216702763)).toCharArray(),
         ba(a(128301663, var0 ^ -1242727710), 5269400094945560583L),
         baab(a(128301662, var0 ^ -1086863921), 924392480662670235L)
      );
   }

   private static int baab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(128301657, 2047426988 ^ -795994689);
      if (abb[var3] == null) {
         abb[var3] = (int)(baa[var3] ^ var1);
      }

      return abb[var3];
   }

   private boolean baba() {
      int var1 = baaabbaa.bba;

      try {
         boolean var10000 = (Boolean)this.aaba.abbb();
         if (var1 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   private static String babb(char[] var0, long var1, int var3) {
      int var4 = baab(a(128301656, -1347941113 ^ -1635491297), 8317000149976969504L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & baab(a(128301659, -1347941113 ^ 1565699399), 7924924723579862142L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public abbabbb() {
      super(
         aabbaaaba.aaab(aaab[1]),
         bbaabbba.bba,
         aabbaaaba.aaab(aaab[2])
      );
      this.baab = (aaabbbab)this.abbbaaa(
         new aaabbbab(aabbaaaba.aaab(aaab[3]), 75.0, 75.0, 0.0, 500.0, 5.0)
            .aaa(aabbaaaba.abba(aaab[4]))
      );
      this.aabb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aaab[baab(a(128301658, -1083294327 ^ 1490431344), 9146004191784347093L)]),
            bbaaab.class,
            bbaaab.aaa
         )
      );
      this.aaba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(aabbaaaba.aaab(aaab[0]), false)
      );
      this.bab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(aabbaaaba.aaab(aaab[5]), false)
      );
      this.abba = -1;
      this.aa = -1;
      this.bba = baab(a(128301669, -1083294327 ^ 806667206), 8311866137427309405L);
      this.aabb.babb(this::baba);
   }

   private static String bbab(int var0, int var1) {
      int var9 = -1446040201;
      int var2 = (var0 ^ a(128301668, var9 ^ 1536131160)) & a(128301671, var9 ^ 239739488);
      if (abbb[var2] == null) {
         char[] var3 = aaa[var2].toCharArray();

         int var4 = switch (var3[0] & a(128301670, var9 ^ -1494006821)) {
            case 0 -> a(128301665, var9 ^ 126324425);
            case 1 -> a(128301664, var9 ^ 548574410);
            case 2 -> 0;
            case 3 -> a(128301667, var9 ^ 1744038937);
            case 4 -> a(128301666, var9 ^ 452581974);
            case 5 -> a(128301677, var9 ^ -83968322);
            case 6 -> a(128301676, var9 ^ -1403814837);
            case 7 -> 1;
            case 8 -> a(128301679, var9 ^ -224861898);
            case 9 -> a(128301678, var9 ^ 727729104);
            case 10 -> a(128301673, var9 ^ -1605100062);
            case 11 -> a(128301672, var9 ^ -719254799);
            case 12 -> a(128301675, var9 ^ -440031672);
            case 13 -> a(128301674, var9 ^ -727694958);
            case 14 -> a(128301685, var9 ^ 2040050538);
            case 15 -> a(128301684, var9 ^ 353720738);
            case 16 -> a(128301687, var9 ^ 78490475);
            case 17 -> a(128301686, var9 ^ 747451073);
            case 18 -> a(128301681, var9 ^ -1188415246);
            case 19 -> a(128301680, var9 ^ 1465382313);
            case 20 -> a(128301683, var9 ^ -1129542332);
            case 21 -> a(128301682, var9 ^ 1218140411);
            case 22 -> a(128301693, var9 ^ 849212902);
            case 23 -> a(128301692, var9 ^ -1530236243);
            case 24 -> a(128301695, var9 ^ 15759723);
            case 25 -> a(128301694, var9 ^ 1065020377);
            case 26 -> a(128301689, var9 ^ 878249558);
            case 27 -> a(128301688, var9 ^ -761090201);
            case 28 -> a(128301691, var9 ^ 1079805771);
            case 29 -> a(128301690, var9 ^ -759827374);
            case 30 -> a(128301573, var9 ^ 887362266);
            case 31 -> a(128301572, var9 ^ 505819484);
            case 32 -> a(128301575, var9 ^ -1631899918);
            case 33 -> a(128301574, var9 ^ 772200840);
            case 34 -> a(128301569, var9 ^ -649206402);
            case 35 -> a(128301568, var9 ^ 1634038393);
            case 36 -> a(128301571, var9 ^ -1908709154);
            case 37 -> a(128301570, var9 ^ -1692017838);
            case 38 -> a(128301581, var9 ^ 1651885665);
            case 39 -> a(128301580, var9 ^ 395243096);
            case 40 -> a(128301583, var9 ^ 827652485);
            case 41 -> a(128301582, var9 ^ -488307415);
            case 42 -> a(128301577, var9 ^ 570422945);
            case 43 -> 4;
            case 44 -> a(128301576, var9 ^ -1005403182);
            case 45 -> a(128301579, var9 ^ 499911973);
            case 46 -> a(128301578, var9 ^ 913334864);
            case 47 -> a(128301589, var9 ^ 1436387347);
            case 48 -> a(128301588, var9 ^ -1370910514);
            case 49 -> a(128301591, var9 ^ -723993669);
            case 50 -> a(128301590, var9 ^ 789145890);
            case 51 -> a(128301585, var9 ^ 2145540218);
            case 52 -> a(128301584, var9 ^ 1734528118);
            case 53 -> a(128301587, var9 ^ -116879922);
            case 54 -> a(128301586, var9 ^ -1350878875);
            case 55 -> a(128301597, var9 ^ 125115469);
            case 56 -> a(128301596, var9 ^ 268146161);
            case 57 -> a(128301599, var9 ^ 1087006177);
            case 58 -> a(128301598, var9 ^ -1519210758);
            case 59 -> a(128301593, var9 ^ -1178324420);
            case 60 -> a(128301592, var9 ^ 373495741);
            case 61 -> a(128301595, var9 ^ -367425367);
            case 62 -> a(128301594, var9 ^ -706941938);
            case 63 -> a(128301605, var9 ^ 1864104755);
            case 64 -> a(128301604, var9 ^ 1266815125);
            case 65 -> a(128301607, var9 ^ 1993281943);
            case 66 -> a(128301606, var9 ^ -1640320923);
            case 67 -> a(128301601, var9 ^ -1981747314);
            case 68 -> a(128301600, var9 ^ 1951361461);
            case 69 -> a(128301603, var9 ^ -119701290);
            case 70 -> a(128301602, var9 ^ 562880285);
            case 71 -> a(128301613, var9 ^ 439524573);
            case 72 -> a(128301612, var9 ^ 1984489843);
            case 73 -> a(128301615, var9 ^ -640508780);
            case 74 -> a(128301614, var9 ^ 1266808864);
            case 75 -> a(128301609, var9 ^ -1733045590);
            case 76 -> a(128301608, var9 ^ -1885450451);
            case 77 -> a(128301611, var9 ^ 493931898);
            case 78 -> a(128301610, var9 ^ -1738058641);
            case 79 -> a(128301621, var9 ^ -1360202477);
            case 80 -> a(128301620, var9 ^ 691625492);
            case 81 -> a(128301623, var9 ^ -625931185);
            case 82 -> a(128301622, var9 ^ -1727430448);
            case 83 -> a(128301617, var9 ^ 1004440235);
            case 84 -> a(128301616, var9 ^ 1518280542);
            case 85 -> a(128301619, var9 ^ 182770232);
            case 86 -> a(128301618, var9 ^ 1858635132);
            case 87 -> a(128301629, var9 ^ 154012840);
            case 88 -> a(128301628, var9 ^ -1261924495);
            case 89 -> a(128301631, var9 ^ 1218199704);
            case 90 -> a(128301630, var9 ^ -1418957918);
            case 91 -> a(128301625, var9 ^ -1369571108);
            case 92 -> a(128301624, var9 ^ -588125892);
            case 93 -> a(128301627, var9 ^ 548651687);
            case 94 -> a(128301626, var9 ^ 1753398559);
            case 95 -> a(128302021, var9 ^ -437948899);
            case 96 -> a(128302020, var9 ^ -1698500977);
            case 97 -> a(128302023, var9 ^ 1663176308);
            case 98 -> a(128302022, var9 ^ 585205668);
            case 99 -> a(128302017, var9 ^ -301221535);
            case 100 -> a(128302016, var9 ^ -1725222396);
            case 101 -> a(128302019, var9 ^ 1826214313);
            case 102 -> a(128302018, var9 ^ -1569929609);
            case 103 -> a(128302029, var9 ^ 958099154);
            case 104 -> a(128302028, var9 ^ -184641737);
            case 105 -> a(128302031, var9 ^ -1895031586);
            case 106 -> a(128302030, var9 ^ -1337167720);
            case 107 -> a(128302025, var9 ^ -912718085);
            case 108 -> a(128302024, var9 ^ 1670988740);
            case 109 -> a(128302027, var9 ^ 2007420548);
            case 110 -> a(128302026, var9 ^ 1808005413);
            case 111 -> a(128302037, var9 ^ -1083704186);
            case 112 -> a(128302036, var9 ^ -49332884);
            case 113 -> a(128302039, var9 ^ -418767455);
            case 114 -> a(128302038, var9 ^ -1078727158);
            case 115 -> a(128302033, var9 ^ -1106778351);
            case 116 -> a(128302032, var9 ^ 276949953);
            case 117 -> a(128302035, var9 ^ 1838961518);
            case 118 -> a(128302034, var9 ^ 919814800);
            case 119 -> a(128302045, var9 ^ -349943212);
            case 120 -> a(128302044, var9 ^ 1177918227);
            case 121 -> a(128302047, var9 ^ 1242122643);
            case 122 -> a(128302046, var9 ^ -1258646550);
            case 123 -> a(128302041, var9 ^ -1998305952);
            case 124 -> a(128302040, var9 ^ -422692571);
            case 125 -> a(128302043, var9 ^ 915571549);
            case 126 -> a(128302042, var9 ^ 351425059);
            case 127 -> a(128302053, var9 ^ -1452788143);
            case 128 -> 2;
            case 129 -> a(128302052, var9 ^ -1234354662);
            case 130 -> a(128302055, var9 ^ -1105579498);
            case 131 -> a(128302054, var9 ^ -1854105730);
            case 132 -> a(128302049, var9 ^ -820486494);
            case 133 -> a(128302048, var9 ^ 1208877008);
            case 134 -> a(128302051, var9 ^ 130098152);
            case 135 -> a(128302050, var9 ^ 1957534719);
            case 136 -> a(128302061, var9 ^ -2006864021);
            case 137 -> a(128302060, var9 ^ -1984522876);
            case 138 -> a(128302063, var9 ^ 690404733);
            case 139 -> a(128302062, var9 ^ 605777536);
            case 140 -> a(128302057, var9 ^ -483872538);
            case 141 -> a(128302056, var9 ^ -1491591452);
            case 142 -> a(128302059, var9 ^ 1037674885);
            case 143 -> a(128302058, var9 ^ -1087297258);
            case 144 -> a(128302069, var9 ^ 1814430281);
            case 145 -> a(128302068, var9 ^ -847271750);
            case 146 -> a(128302071, var9 ^ 1322213087);
            case 147 -> a(128302070, var9 ^ 309191047);
            case 148 -> a(128302065, var9 ^ -151426546);
            case 149 -> a(128302064, var9 ^ -1758317237);
            case 150 -> a(128302067, var9 ^ 401086515);
            case 151 -> a(128302066, var9 ^ -1166677684);
            case 152 -> a(128302077, var9 ^ -169335494);
            case 153 -> a(128302076, var9 ^ -907417844);
            case 154 -> a(128302079, var9 ^ -127606375);
            case 155 -> a(128302078, var9 ^ 667544671);
            case 156 -> a(128302073, var9 ^ 1001159957);
            case 157 -> a(128302072, var9 ^ -139316397);
            case 158 -> a(128302075, var9 ^ 2020199847);
            case 159 -> a(128302074, var9 ^ 1854991444);
            case 160 -> a(128301957, var9 ^ -1386092334);
            case 161 -> a(128301956, var9 ^ -2054192503);
            case 162 -> a(128301959, var9 ^ 1277601635);
            case 163 -> a(128301958, var9 ^ 900903356);
            case 164 -> a(128301953, var9 ^ -481751847);
            case 165 -> a(128301952, var9 ^ 534808828);
            case 166 -> a(128301955, var9 ^ -459482055);
            case 167 -> a(128301954, var9 ^ -616616226);
            case 168 -> a(128301965, var9 ^ 1363928543);
            case 169 -> a(128301964, var9 ^ 397797100);
            case 170 -> a(128301967, var9 ^ -1604025591);
            case 171 -> a(128301966, var9 ^ 501238335);
            case 172 -> a(128301961, var9 ^ -866568131);
            case 173 -> a(128301960, var9 ^ 883377179);
            case 174 -> a(128301963, var9 ^ 779983311);
            case 175 -> a(128301962, var9 ^ 232342570);
            case 176 -> a(128301973, var9 ^ -1429478645);
            case 177 -> a(128301972, var9 ^ 1677058441);
            case 178 -> a(128301975, var9 ^ 1520372171);
            case 179 -> a(128301974, var9 ^ 322929257);
            case 180 -> a(128301969, var9 ^ -1225029695);
            case 181 -> 3;
            case 182 -> a(128301968, var9 ^ -275888261);
            case 183 -> a(128301971, var9 ^ 777665172);
            case 184 -> a(128301970, var9 ^ -231665718);
            case 185 -> a(128301981, var9 ^ 1637581724);
            case 186 -> a(128301980, var9 ^ 990478440);
            case 187 -> a(128301983, var9 ^ -1380715499);
            case 188 -> a(128301982, var9 ^ 1063910014);
            case 189 -> a(128301977, var9 ^ 659250997);
            case 190 -> a(128301976, var9 ^ 1954451020);
            case 191 -> a(128301979, var9 ^ 1431346081);
            case 192 -> a(128301978, var9 ^ 534937659);
            case 193 -> a(128301989, var9 ^ 1911750916);
            case 194 -> a(128301988, var9 ^ 272679156);
            case 195 -> a(128301991, var9 ^ -18660785);
            case 196 -> a(128301990, var9 ^ -296692486);
            case 197 -> a(128301985, var9 ^ -2142263003);
            case 198 -> a(128301984, var9 ^ 1601673883);
            case 199 -> a(128301987, var9 ^ -1899959341);
            case 200 -> a(128301986, var9 ^ 2076087362);
            case 201 -> a(128301997, var9 ^ 628632858);
            case 202 -> a(128301996, var9 ^ -568713731);
            case 203 -> a(128301999, var9 ^ 429208349);
            case 204 -> a(128301998, var9 ^ -499725938);
            case 205 -> a(128301993, var9 ^ -1497269003);
            case 206 -> a(128301992, var9 ^ 1720818148);
            case 207 -> a(128301995, var9 ^ -77584755);
            case 208 -> a(128301994, var9 ^ -513151410);
            case 209 -> a(128302005, var9 ^ 94640982);
            case 210 -> a(128302004, var9 ^ 393123215);
            case 211 -> a(128302007, var9 ^ -2116558410);
            case 212 -> a(128302006, var9 ^ -65374912);
            case 213 -> a(128302001, var9 ^ 1983336055);
            case 214 -> a(128302000, var9 ^ 1064912956);
            case 215 -> a(128302003, var9 ^ -799327787);
            case 216 -> a(128302002, var9 ^ 7637609);
            case 217 -> a(128302013, var9 ^ -920508002);
            case 218 -> a(128302012, var9 ^ -398126529);
            case 219 -> a(128302015, var9 ^ -336790891);
            case 220 -> a(128302014, var9 ^ -1815607906);
            case 221 -> a(128302009, var9 ^ -891870385);
            case 222 -> a(128302008, var9 ^ 373198873);
            case 223 -> a(128302011, var9 ^ 362714657);
            case 224 -> a(128302010, var9 ^ -353459059);
            case 225 -> a(128301893, var9 ^ 1276621409);
            case 226 -> a(128301892, var9 ^ -522110735);
            case 227 -> a(128301895, var9 ^ -1360717337);
            case 228 -> a(128301894, var9 ^ 1166902607);
            case 229 -> a(128301889, var9 ^ -412460562);
            case 230 -> a(128301888, var9 ^ 972101906);
            case 231 -> a(128301891, var9 ^ 1499511398);
            case 232 -> a(128301890, var9 ^ 1398015487);
            case 233 -> a(128301901, var9 ^ 157559067);
            case 234 -> a(128301900, var9 ^ -576862198);
            case 235 -> a(128301903, var9 ^ 631494220);
            case 236 -> a(128301902, var9 ^ -278091738);
            case 237 -> a(128301897, var9 ^ -414059829);
            case 238 -> a(128301896, var9 ^ -667750579);
            case 239 -> 5;
            case 240 -> a(128301899, var9 ^ 1844017940);
            case 241 -> a(128301898, var9 ^ -2057760900);
            case 242 -> a(128301909, var9 ^ -1252783190);
            case 243 -> a(128301908, var9 ^ -764760533);
            case 244 -> a(128301911, var9 ^ 1061663198);
            case 245 -> a(128301910, var9 ^ -1288834612);
            case 246 -> a(128301905, var9 ^ -619757692);
            case 247 -> a(128301904, var9 ^ 2070246103);
            case 248 -> a(128301907, var9 ^ -1236555303);
            case 249 -> a(128301906, var9 ^ 953908513);
            case 250 -> a(128301917, var9 ^ 850142054);
            case 251 -> a(128301916, var9 ^ -827907168);
            case 252 -> a(128301919, var9 ^ -645841197);
            case 253 -> a(128301918, var9 ^ 652675312);
            case 254 -> a(128301913, var9 ^ -2144644231);
            default -> a(128301912, var9 ^ -528558077);
         };
         int var5 = (var1 & a(128301915, var9 ^ -249291683)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(128301914, var9 ^ 1623809055)) >>> a(128301925, var9 ^ -514379170)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(128301924, var9 ^ 1734081214);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(128301927, var9 ^ -1781120232);
            }
         }

         abbb[var2] = new String(var3).intern();
      }

      return abbb[var2];
   }

   private static String bbba(class_5321 var0) {
      return var0.method_29177().method_12832();
   }
}
