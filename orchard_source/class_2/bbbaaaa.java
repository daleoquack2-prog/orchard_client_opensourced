package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class bbbaaaa extends abbaabbaa {
   private final baabaab aa;
   private static String[] ab;
   private static final Object[] baab;
   private static final long[] ba;
   private static final Integer[] bb;
   private final bababa aaa;
   private static final long[] aab;
   private static final int[] abbb;
   private final abbaaaaa aba;
   private final bababa abb;
   private final bababa baa;
   private static final String[] bab;
   private static final double bba = 8.0;
   private static final float bbb = 0.01F;
   private volatile float aaaa;
   private static final String[] baaa;
   private final bababa aaab;
   private final bababa aaba;
   private final bababa aabb;
   private final bababa abaa;
   private static final Long[] abab;
   private static final String[] abba;

   private static String b(char var0, int var1, int var2) {
      int var3 = var1 ^ 12178;
      char[] var4 = baaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])baab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         baab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 25960;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 21322;
         var10 -= 22494;
         var10 -= 39200;
         var10 -= 18782;
         var10 ^= 47311;
         var10 ^= 36905;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public boolean aa() {
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
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.babbaab ()Z
      // 0c: ifeq 32
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaaa F
      // 1b: fconst_1
      // 1c: fsub
      // 1d: invokestatic java/lang/Math.abs (F)F
      // 20: ldc 0.01
      // 22: fcmpl
      // 23: iload 1
      // 24: ifne 2f
      // 27: ifle 32
      // 2a: goto 2e
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   @Override
   public void aabaa() {
      this.aaaa = 1.0F;
   }

   public bbbaaaa() {
      int var1 = 891667460;
      super(
         aabbaaaba.aaab(ab[0]),
         bbaabbba.aa,
         aabbaaaba.aaab(ab[ba(a(351381292, var1 ^ -1650068273), 8638441115219131570L)])
      );
      this.aa = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(ab[ba(a(351381293, var1 ^ -1399939004), 3874671124566200382L)]),
            bbbabaab.class,
            bbbabaab.ba
         )
      );
      this.aaab = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(ab[1]), 8.0, 2.0, 12.0, 0.25)
            .bb(aabbaaaba.abba(ab[2]))
      );
      this.aaa = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(ab[ba(a(351381294, var1 ^ 1408276063), 7469522157813999629L)]), 9.0, 1.0, 35.0, 0.5
            )
            .bb(aabbaaaba.abba(ab[ba(a(351381295, var1 ^ -1267869471), 1698784621707980744L)]))
      );
      this.abaa = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(ab[3]), 0.55, 0.1, 1.0, 0.05)
      );
      this.aaba = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(ab[5]), 1.08, 0.5, 1.5, 0.05)
      );
      this.aabb = (bababa)this.abbbaaa(
         new bababa(
            aabbaaaba.aaab(ab[ba(a(351381288, var1 ^ 1911037063), 2130465247448097511L)]), 1.0, 0.5, 1.5, 0.05
         )
      );
      this.abb = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(ab[ba(a(351381289, var1 ^ -1360565129), 4264498963871541796L)]), 0.05, 0.0, 0.5, 0.01
            )
            .bb(aabbaaaba.abba(ab[2]))
      );
      this.baa = (bababa)this.abbbaaa(
         new bababa(
            aabbaaaba.aaab(ab[ba(a(351381290, var1 ^ 201320435), 8953331657647963789L)]), 0.22, 0.05, 0.6, 0.01
         )
      );
      this.aba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(aabbaaaba.aaab(ab[4]), true)
      );
      this.aaaa = 1.0F;
   }

   private double ab(class_243 param1, class_243 param2) {
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
      // 05: invokevirtual net/minecraft/class_243.method_1033 ()D
      // 08: dstore 4
      // 0a: dload 4
      // 0c: iload 3
      // 0d: ifne 31
      // 10: ldc2_w 1.0E-6
      // 13: dcmpg
      // 14: ifgt 1e
      // 17: goto 1b
      // 1a: athrow
      // 1b: dconst_0
      // 1c: dreturn
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: dconst_1
      // 21: dload 4
      // 23: ddiv
      // 24: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 27: invokevirtual net/minecraft/class_243.method_1026 (Lnet/minecraft/class_243;)D
      // 2a: ldc2_w -1.0
      // 2d: dconst_1
      // 2e: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
      // 31: dstore 6
      // 33: dload 6
      // 35: invokestatic java/lang/Math.acos (D)D
      // 38: invokestatic java/lang/Math.toDegrees (D)D
      // 3b: dreturn
   }

   private static int a(int var0, int var1) {
      int var2 = abbb[var0 ^ 351381292] ^ var1 ^ var0;
      var2 ^= 44544;
      var2 ^= 14748;
      var2 -= 4492;
      var2 += 15845;
      var2 += 22656;
      var2 ^= 59903;
      return var2 - 57966;
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(351381291, 1689568104 ^ 806653613);
      if (bb[var3] == null) {
         bb[var3] = (int)(aab[var3] ^ var1);
      }

      return bb[var3];
   }

   private static String bb(char[] var0, long var1, int var3) {
      int var4 = ba(a(351381284, 1987441209 ^ 1649706414), 3403164995173428064L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ba(a(351381285, 1987441209 ^ -1013567374), 4114748975382975812L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -1935931337;
      int var30 = "Ě\udf3f金빫㣨\ue7f9树胄㉜ׂ㾫儫㣳䞄ꡕ봃ꌒ괅和都又䘃\ud804\ufadcꢠ\uaa3a兜뱺龜̬菛눼峨䟖䑎\ue275鈄謏췔霘⋙垤둽\uf67c䊽櫕\ue6b4䙖뀔熽쭽Ꙍ译纪ﰫ쥉\uece9괏ᴏ镞\uf37d笡䤑씿ꮚ邚별מ됡厮\ueaaf곁\ude90⽧5튠惂⬂\ue22c啹嘊ᑛᔗ\udaf8臛\ue9edힾ칗쥉ꨟ繡祝\ue0a3䛥\ue2e9ᅪ쾌琐둕퉨膀⑳㓸য়\uded3셴깓襶ូ̟甌痼纷캟ᰃ郛촩☋뒮\ue257֬ꬬ뎠뙬廻ᕚ嵧ⲟ䖖૦⧤鵻㿻撥輲䗥מ⡳배꺯ꦰ㉨Ꝺ౯ᒸ쏷⦝\ue6b5♝髥ա䜂ჼ\ud9f9轅ą\ude89\uf710㍴檤\ueb21瘃\ueaa9콖Ꮙ≉磮㵬邼꺩\uabfd봡愘⫻\uf14d쎞丳掤䖣頥쨻ퟍ\ue6c4裕考\u0ee6䒧\udd1a\ue1f0㝉傝祑꺯\ud9aaꭃഽ㯏룊봯䊈ⰳ桞ࢧㅲ턍ᐼ䈓䬾䋛땱፲啼\u1ad1독㍳춝ꁉẤ⅙瓯൳\ueded\uf76b㚧둽噡嚅㋴㟐䚆\uea33巆ꗬ맕⎴楗녡\uef1b琵ꭼ漶愉\u1f4e敇ᰰ횶쇀\uf7a6慂딼림\u139f혋\ue6fd둍꿚ቩ嘫⁒㕲ḯ㩊岻鞤ĺ\ue64a퓥荼鏖꽏\uf1ca︀쏸Ჷǲ냞䝂➁抲쥖᳠\uf732\uf634\u0019ꈾ\ue6f1Ⰿﻸဪ蚊효ᴩ\uf299ꈋį䢰롔뙢\ue022ᤀ\u0acf䄕똬栎뙱ꗭℜ\udf39嫕à洃ᚖ欃嘋測혐没雥浗횑溤雽涅ᛅ泳雸渟陦泜ᘃ檅ᛗ湋隒氐ᛸ淅ᚶ涟\u16fe檣ᘁ欌홱淡嚶泣嚵洰隍欉固殓횞汳홽沼陥汝嚺活嚄欤隍洕嚨湷ᚐ殣阁泰噥汉ᛦ浏횗汌隕泙雂氧雼檏ᙣ歘噧歭隽涫障泰嚇毩횶檋횅淧噡泌阃殉雋淣嚐欠훹泱ᛁ每ᛧ浫噫泔홿欵囄涛\u16f9泸囥歝훓洓ᛩ涧阍歈ᘐ氹囎沧雬洀횄滥隰歃囦欿혀淠홣次隹渿᚛毬훼滕雐洗횓泣ᙫ毨阐殥ᛆ湛횘涄团涕훺涣雧気ᙰ洌혩毱嚿洏훮淰隫溁횲気ᛨ毛噮沜ᘚ歕훘死囯樀훺殱훴泇零歛홯浀阑檉훒涧훬氼隟氩훏櫳᛬氃阈淴阘沝隭海횖欨雾泙훓洯훯涣홳泄阈氅隴浯嚈沐ᛣ毭囚\n덐\ueb1d댼殏돟⯵둞欿돈歩\u0010歪蛮浞蘅檡蘒汘ۇ渂웧氵ڒ汤蛙湖䚚\n巈旸嵤\ue56a巇ꔔ巆\ue5de嶐\ue58cXᢌ⅑\u1778ℐ\u1943ꆱᝊ憑ᢴꄩᤳ懩ᙦꆂ\u177cꆫᩨꇞᦋ⅐៊←ᥰꇋ᠓⇗ᠾꅫᩨꆽᢈ愬ᣇ\ue1b0ᝊꆏ᩠⇃ᜯ\ue120\u187e憏ᠠ\ue1b2ᢐK\u175fⅫ᥊ꆅᜰ\ue1d0᧯ꇌឮ慪ᣬꆢᦀΩᚗꅘᤚꆤᩤ\ue1d5ᣓ懇ឆ\ue18eᩴ⅐ᥬ\ue116ᤷ慞\u1ada\ue188ᚨ\ue1c5᠗ꇗᡶꅫᢤꆬ\u181c\ue110\n醭㤶釁릠鄢栗酣뤐鄵륂\u0010렧᮰럟嬱뛨魇롩\udb8a럣ᬢ릤ᯨ랭ᮂ멿宥\n쌵받쎙㳵쎺糳쏻㰹쑭㱯"
         .length();
      int var33 = 0;
      short var34 = 20646;
      String var29 = "Ě\udf3f金빫㣨\ue7f9树胄㉜ׂ㾫儫㣳䞄ꡕ봃ꌒ괅和都又䘃\ud804\ufadcꢠ\uaa3a兜뱺龜̬菛눼峨䟖䑎\ue275鈄謏췔霘⋙垤둽\uf67c䊽櫕\ue6b4䙖뀔熽쭽Ꙍ译纪ﰫ쥉\uece9괏ᴏ镞\uf37d笡䤑씿ꮚ邚별מ됡厮\ueaaf곁\ude90⽧5튠惂⬂\ue22c啹嘊ᑛᔗ\udaf8臛\ue9edힾ칗쥉ꨟ繡祝\ue0a3䛥\ue2e9ᅪ쾌琐둕퉨膀⑳㓸য়\uded3셴깓襶ូ̟甌痼纷캟ᰃ郛촩☋뒮\ue257֬ꬬ뎠뙬廻ᕚ嵧ⲟ䖖૦⧤鵻㿻撥輲䗥מ⡳배꺯ꦰ㉨Ꝺ౯ᒸ쏷⦝\ue6b5♝髥ա䜂ჼ\ud9f9轅ą\ude89\uf710㍴檤\ueb21瘃\ueaa9콖Ꮙ≉磮㵬邼꺩\uabfd봡愘⫻\uf14d쎞丳掤䖣頥쨻ퟍ\ue6c4裕考\u0ee6䒧\udd1a\ue1f0㝉傝祑꺯\ud9aaꭃഽ㯏룊봯䊈ⰳ桞ࢧㅲ턍ᐼ䈓䬾䋛땱፲啼\u1ad1독㍳춝ꁉẤ⅙瓯൳\ueded\uf76b㚧둽噡嚅㋴㟐䚆\uea33巆ꗬ맕⎴楗녡\uef1b琵ꭼ漶愉\u1f4e敇ᰰ횶쇀\uf7a6慂딼림\u139f혋\ue6fd둍꿚ቩ嘫⁒㕲ḯ㩊岻鞤ĺ\ue64a퓥荼鏖꽏\uf1ca︀쏸Ჷǲ냞䝂➁抲쥖᳠\uf732\uf634\u0019ꈾ\ue6f1Ⰿﻸဪ蚊효ᴩ\uf299ꈋį䢰롔뙢\ue022ᤀ\u0acf䄕똬栎뙱ꗭℜ\udf39嫕à洃ᚖ欃嘋測혐没雥浗횑溤雽涅ᛅ泳雸渟陦泜ᘃ檅ᛗ湋隒氐ᛸ淅ᚶ涟\u16fe檣ᘁ欌홱淡嚶泣嚵洰隍欉固殓횞汳홽沼陥汝嚺活嚄欤隍洕嚨湷ᚐ殣阁泰噥汉ᛦ浏횗汌隕泙雂氧雼檏ᙣ歘噧歭隽涫障泰嚇毩횶檋횅淧噡泌阃殉雋淣嚐欠훹泱ᛁ每ᛧ浫噫泔홿欵囄涛\u16f9泸囥歝훓洓ᛩ涧阍歈ᘐ氹囎沧雬洀횄滥隰歃囦欿혀淠홣次隹渿᚛毬훼滕雐洗횓泣ᙫ毨阐殥ᛆ湛횘涄团涕훺涣雧気ᙰ洌혩毱嚿洏훮淰隫溁횲気ᛨ毛噮沜ᘚ歕훘死囯樀훺殱훴泇零歛홯浀阑檉훒涧훬氼隟氩훏櫳᛬氃阈淴阘沝隭海횖欨雾泙훓洯훯涣홳泄阈氅隴浯嚈沐ᛣ毭囚\n덐\ueb1d댼殏돟⯵둞欿돈歩\u0010歪蛮浞蘅檡蘒汘ۇ渂웧氵ڒ汤蛙湖䚚\n巈旸嵤\ue56a巇ꔔ巆\ue5de嶐\ue58cXᢌ⅑\u1778ℐ\u1943ꆱᝊ憑ᢴꄩᤳ懩ᙦꆂ\u177cꆫᩨꇞᦋ⅐៊←ᥰꇋ᠓⇗ᠾꅫᩨꆽᢈ愬ᣇ\ue1b0ᝊꆏ᩠⇃ᜯ\ue120\u187e憏ᠠ\ue1b2ᢐK\u175fⅫ᥊ꆅᜰ\ue1d0᧯ꇌឮ慪ᣬꆢᦀΩᚗꅘᤚꆤᩤ\ue1d5ᣓ懇ឆ\ue18eᩴ⅐ᥬ\ue116ᤷ慞\u1ada\ue188ᚨ\ue1c5᠗ꇗᡶꅫᢤꆬ\u181c\ue110\n醭㤶釁릠鄢栗酣뤐鄵륂\u0010렧᮰럟嬱뛨魇롩\udb8a럣ᬢ릤ᯨ랭ᮂ멿宥\n쌵받쎙㳵쎺糳쏻㰹쑭㱯";
      String[] var10000 = new String[10];
      int var32 = 0;
      String[] var31 = var10000;

      do {
         int var37 = 0;
         char var35 = var29.charAt(var33);
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            int var38 = var36[var37];

            var38 = (char)(switch (var37 % 7) {
               default -> 6;
               case 1 -> 46;
               case 2 -> 82;
               case 3 -> 177;
               case 4 -> 77;
               case 5 -> 204;
               case 6 -> 24;
            }) ^ var38;
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 2 | var38 << 14) & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 2 | var38 >>> 14) & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      baaa = var31;
      baab = new Object[var31.length];
      int var25 = -14730409;
      byte[] var23 = "¼\u0091·\u0085rD\u001f\u009e\u008d:\u0011\u00ad\u0095Y\u009eRPÜ\u00ad\u0011p-å\u008aÕ5r\u009c¿OYÚÿÎ4\u008e^\f\u008f\u001c\u0094ûÕª\u0011\u0098Ä<P¼$7\u00ad`37\u00975\u0086HÛüTÆ{áï\u008a<Çóh-Í¡Õ8ZøE½@\u0016Æsm\"\u009c¢Ýo)ã+Ý¼q~oðNPÄìÃ(\u0011néá>\u0086mlÀ\u001fØYã«`\u008aw\u0097ô\rÅc\u0013Ô\u001eÓË~w\u0093\u0087üÚ@\u007f\u000e\u0097¿[ßºdÒV5\u0019\u0004A|%\u0003Í?SÇ]µ¥\u0085Ä£\u009b¥&\u001e\u009aU\u001cjVs)\u00ad[ïÆÊ\u009c\u0090×\u0014É¥¾ëòw{»~Ô\u0081OÏ%\u0015)[ú\u009eÒÌn¹÷ì\u0005\u0006Ö\u008f85\u000e\u0017Ã\u0092ù=·¨©MyBu\u0018²'\\â\u001a/¶Ø\u0011\u0007Ó\u0012>¼¢6\u001aÌ³Âoiòá*,¾\u008f¿\u0092\u0014åí\u008e^Ù\r¢±\u001b\u0092u`Õ«äjZè:Ù.æ\u0005£\u008b*\u0006ÃçD^\u009cÞw\n°+\u0083\u0096æádÀ#L\u009e_ÍI|LhÙb¶ØÄ\u0004b)}ê¬!lh_¯¸U\u001e\tD\u0014¾ÃÚ÷\u0084ÕÍ\u0096\u009câ³\u0010Íñï\u008f\u009düÿ\u0090×\u001a\u0099Á/Kà\u0080\n¦íÎ]$Á#\u0019\u001bi©8\u0002àza\u000e=¤(9û\rd\tÁ¢BJ¢S8IÃÈÍ\u0091\u009e%!\r\u0014\u0092\\V\u00adJý¼Rn\u000f-CP?]æ9²]^È-¨\u008f.\u001a\u0096ßö\u008dS¹¦Ýð\u0014Qö@\u0017\u0015²ç(h\"Oà%÷×\u0002Øä\u008aÙ\u00adY¾Ñ\u0010\u0097\u008f+\u007f6Á\u0090r\u008e¹ç^\u008b>\u0017Ô*¿½<\u0093\u00895\u0086\u0087©ÞJÌøªµ\u009eÞ`ÛóCëb\u007fh\u0096\u000bô0wJ\u0093M$¡\u008di-üº°a\u009fO\u001f*¨ÇÝð\u007feé\fíUâ=Å\u000b\u0017\u001bÊ\u008aüÔrÝf\u000e\u0093ä?®º\u0004\u0098f¢ÞÔA\u001a\u0094\u0094\u000eb¥\u009eDÿL øÇñí_\u0002\u009emïc4êo~§\u008aJ\u0004%·s(O\u0005ÿ)\u009a\u00191\r¾Á¿×,´¸9\u0014\u0011o5Öµ Ðº¨ð¬Îôcåw\u0019M\u0006vðüß\u0016\u0096A\rÏ×oú¸E[\u0000²Ñ\u0012óÆ/s\u001bé\u0019°8äx\u0096\bô!õÒ\u009e\u0004Ç\u0090çxjæ9=³sr`3\u000e\u001brN»Ñ¡D÷ê]ì\u0095¶85ýAÑ:ê\u009aèá§\rö\u0082\u0010\u0012\r½áÿe'v\u009d\u0093Í\u0093~ØÞ\u001e\u0013c[þY\u008cjØ{\u0095\u001e\u0096\u001f0\u0088ÓÈøê\u0002Ïzï\u0092\u009b*\u001b+\u008a\u008aµ¸\u009c÷¥\u008a\u008cï k¡\u0088ý«l`Íqþ]®\u009a\u0013S¿\u0005\u0087ñX=Ë\u0007SK;\u0007Ã0\u009a\u001dSö0Ãò\u000bÅ¦0ò\u0098±vxÁ¿-Q\u001b\u009f\tÒ\u0081~±\u0006Ñh¼úÉ B×£\u008e÷\u0015\u0005\u0016\u0091ú\u0090\u008f\u0094A\u0097+ç\u0086I¡l¶¨Ô\u0084IOò\u001dë©Mþï<$:>\u0012»}«|ßx9 ¯\u009fæ#ªv\u0098O÷F\u000e\u000e¸\u000e\u008cU\u0097Sÿ\bÐK,iã\u0099Ý1¥B\u000b[pdíî1©Ø^\fb\u0092\u000e\u0012Ôâ\u0092úÂ/\u001b\u008d»®\u0089Ä¨k/«¾\u0003Û$fHVÔk¤\u0089\u0013\u0093Kò|Z+×\u009d<\"õSQÝª`5.\u009c?\u0082\u0016\u008aK9W\u0090k\u009c\rì×\u007f+&G¹?ãF!ôº\u0084\u0015F3\u0001\u0016q\u001dThWR~ÃÊÓ«»ó¬#©Ê}måz± Ð%ª\u0099\u0088<\u008d\"\u001d^N\u0003µX\u0005ç{\u009eèßø\u009fû³'Q#ô§\u0091¢ù%Å·\u0019Î\u0001\u0010þi\u009bÔô,K¡\u0087-ày\u0080¥¡XÙtv±½&ùßR\u0085S`°\u0097²=^'ª\u009aðÁKÔ¡¼\u0083[\u0001\u0088ö\u000f>Òê\\ïÒV}Z\u008eªó\fä7\u00893f%1Öî\u0097J\u001d\u0006o\u000f\rÑ\u008f¦\u001bV\u001aR-\u0018Ò\u000b \u000e\u0080\u0096!Î½2þäcË4\u0001D£TBzm\u0016\fs\t¬¿è\u0098÷}£·* O\n*Æ\u001b@0B¿'\u000b\u0094.Ó(¤(\u0089\u000e«ñ[\u0089OÆPhd\u0080 -\u000f!s}\u008aã?%\u001aK±L[NLõÊCêãA©\n\u001f,T\u0015~|\u0099\u009aTÌ)Ùz¶\u0006p§]\u0012\u0082Ù6YAaí\u009cc\u007f©'Å¶YÜ\u000f¬z(<\u0013ô¾\u00ad\u0006^\u001c?®³2É'óN½¡\u0081*Zúè2\u0082®ài>F\u007f\u009e\u001a\u008aìþö\"[\u009d)\u009c\u008eMñÐ2\u009aY\u0088\u008eíCÉ\u0085c=»Þ¡c\u0083oªÅs hÿ¤\u0010N\u0001@Í\u007fÇ\u0006Ö\u000fýv»÷\u0015 CâN\u008a_nò!M¤¬äv%P\u0014\u009b<\u0016\u009aÇÞ\u0082\u0013\u008e\u0098\u0087@Ñ=%\u0087õé\u009dy¶ÏÖ\u00adg:?\u001b\u0016÷Öðrm¯\u001d_éÏ&~e½Ø\u0089 ¿\u0099øÜ\u000er ý\rÚöC÷\u000eeiè\u0083\u0088ë\u0089\u0006n^Y\u0090Óä\u0014\u0007Y·AX\u0092Ýï41\u008e>(ó{Û\r\u0097¨ÃMsvÿ¶S{\u0016ôo{ü\u0089û\u001aÅ]Uç-®\u001b\u0084\u0003m\u0019½|\u0091Y5\u0086_v\u0010rA\u001fð`lG\u0000\u008a:ø"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      abbb = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         abbb[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[a(351381093, var39 ^ 1719379561)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b('鍆', 12178, var39 ^ -171301418)).length();
      int var17 = a(351381094, var39 ^ 94640304);
      int var43 = -1;

      label140:
      while (true) {
         String var47 = var18.substring(++var43, var43 + var17);
         int var10001 = -1;

         while (true) {
            char[] var75;
            label135: {
               char[] var56 = var47.toCharArray();
               int var10003 = var56.length;
               int var22 = 0;
               var75 = var56;
               var10001 = var10003;
               char[] var91;
               int var10004;
               if (var10003 <= 1) {
                  var91 = var56;
                  var10004 = var22;
               } else {
                  var75 = var56;
                  var10001 = var10003;
                  if (var10003 <= var22) {
                     break label135;
                  }

                  var91 = var56;
                  var10004 = var22;
               }

               while (true) {
                  var91[var10004] = (char)(var91[var10004] ^ switch (var22 % a(351381089, var39 ^ 1976454569)) {
                     case 0 -> a(351381090, var39 ^ -72335423);
                     case 1 -> a(351381091, var39 ^ 971900853);
                     case 2 -> a(351381116, var39 ^ 843642676);
                     case 3 -> a(351381117, var39 ^ -260955923);
                     case 4 -> a(351381118, var39 ^ -695417855);
                     case 5 -> 2;
                     default -> a(351381119, var39 ^ -414547453);
                  });
                  var22++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var91 = var75;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var91 = var75;
                     var10004 = var22;
                  }
               }
            }

            String var98 = new String(var75).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var98;
                  if ((var43 += var17) >= var20) {
                     abba = var21;
                     bab = new String[a(351381088, var39 ^ 47451321)];
                     long var8 = 9116358878816682535L;
                     long[] var14 = new long[a(351381112, var39 ^ -1754205531)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = b('뜞', 12176, var39 ^ 1468423118)).length();
                     byte var10 = 0;

                     label114:
                     while (true) {
                        int var63 = var10;
                        var10 += 8;
                        String var49 = var12.substring(var63, var10);
                        int var64 = 56484;
                        short var81 = 12177;
                        int var99 = var39 ^ 1453725148;
                        byte[] var15 = var49.getBytes("ISO-8859-1");
                        long[] var50 = var14;
                        var63 = var11++;
                        long var82 = (var15[0] & 255L) << a(351381113, var39 ^ 1872241734)
                           | (var15[1] & 255L) << a(351381114, var39 ^ 2059603537)
                           | (var15[2] & 255L) << a(351381115, var39 ^ -159406758)
                           | (var15[3] & 255L) << a(351381108, var39 ^ 1008820326)
                           | (var15[4] & 255L) << a(351381109, var39 ^ -1109552974)
                           | (var15[5] & 255L) << a(351381110, var39 ^ -1533337883)
                           | (var15[a(351381111, var39 ^ 1175426999)] & 255L) << a(351381104, var39 ^ 705773)
                           | var15[a(351381105, var39 ^ -1515715639)] & 255L;
                        byte var100 = -1;

                        while (true) {
                           long var108 = var82 ^ var8;
                           switch (var100) {
                              case 0:
                                 var50[var63] = var108;
                                 if (var10 >= var13) {
                                    aab = var14;
                                    bb = new Integer[a(351381067, var39 ^ 1702911707)];
                                    long var0 = 7783016821378735275L;
                                    long[] var6 = new long[a(351381060, var39 ^ -612726154)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = b('\ue028', 12180, var39 ^ 1438402259)).length();
                                    byte var2 = 0;

                                    label104:
                                    while (true) {
                                       short var68 = var2;
                                       var2 += 8;
                                       String var52 = var4.substring(var68, var2);
                                       var68 = 5982;
                                       short var85 = 12181;
                                       int var103 = var39 ^ 1152080035;
                                       byte[] var7 = var52.getBytes("ISO-8859-1");
                                       long[] var53 = var6;
                                       var64 = var3++;
                                       long var86 = (var7[0] & 255L) << a(351381061, var39 ^ -245037135)
                                          | (var7[1] & 255L) << a(351381062, var39 ^ 1929675356)
                                          | (var7[2] & 255L) << a(351381063, var39 ^ -959179528)
                                          | (var7[3] & 255L) << a(351381056, var39 ^ 2090435453)
                                          | (var7[4] & 255L) << a(351381057, var39 ^ 801954959)
                                          | (var7[5] & 255L) << a(351381058, var39 ^ 1164095527)
                                          | (var7[a(351381059, var39 ^ 380873982)] & 255L) << a(351381084, var39 ^ -480867961)
                                          | var7[a(351381085, var39 ^ 810469731)] & 255L;
                                       byte var104 = -1;

                                       while (true) {
                                          var108 = var86 ^ var0;
                                          switch (var104) {
                                             case 0:
                                                var53[var64] = var108;
                                                if (var2 >= var5) {
                                                   ba = var6;
                                                   abab = new Long[a(351381079, var39 ^ 1760421959)];
                                                   ab = new String[ba(a(351381072, var39 ^ 1744373302), 1799703630836638435L)];
                                                   bba();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var53[var64] = var108;
                                                if (var2 < var5) {
                                                   continue label104;
                                                }

                                                var5 = (var4 = b('\uf6f0', 12186, var39 ^ 1003453724)).length();
                                                var2 = 0;
                                          }

                                          short var71 = var2;
                                          var2 += 8;
                                          String var54 = var4.substring(var71, var2);
                                          var71 = 1219;
                                          short var88 = 12187;
                                          int var106 = var39 ^ 1121483431;
                                          var7 = var54.getBytes("ISO-8859-1");
                                          var53 = var6;
                                          var64 = var3++;
                                          var86 = (var7[0] & 255L) << a(351381086, var39 ^ -294505871)
                                             | (var7[1] & 255L) << a(351381087, var39 ^ -476352444)
                                             | (var7[2] & 255L) << a(351381080, var39 ^ -479130161)
                                             | (var7[3] & 255L) << a(351381081, var39 ^ -2109154968)
                                             | (var7[4] & 255L) << a(351381082, var39 ^ 2141202973)
                                             | (var7[5] & 255L) << a(351381083, var39 ^ 479127830)
                                             | (var7[a(351381076, var39 ^ 636556611)] & 255L) << a(351381077, var39 ^ -1391731857)
                                             | var7[a(351381078, var39 ^ -1996503804)] & 255L;
                                          var104 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var50[var63] = var108;
                                 if (var10 < var13) {
                                    continue label114;
                                 }

                                 var13 = (var12 = b('᪳', 12182, var39 ^ 979258161)).length();
                                 var10 = 0;
                           }

                           byte var66 = var10;
                           var10 += 8;
                           String var51 = var12.substring(var66, var10);
                           char var67 = '큶';
                           short var84 = 12183;
                           int var102 = var39 ^ 1961524097;
                           var15 = var51.getBytes("ISO-8859-1");
                           var50 = var14;
                           var63 = var11++;
                           var82 = (var15[0] & 255L) << a(351381106, var39 ^ 1896938936)
                              | (var15[1] & 255L) << a(351381107, var39 ^ 1465592160)
                              | (var15[2] & 255L) << a(351381068, var39 ^ -1565352138)
                              | (var15[3] & 255L) << a(351381069, var39 ^ 1868264539)
                              | (var15[4] & 255L) << a(351381070, var39 ^ -182281907)
                              | (var15[5] & 255L) << a(351381071, var39 ^ 1900192357)
                              | (var15[a(351381064, var39 ^ -47162225)] & 255L) << a(351381065, var39 ^ 942808573)
                              | var15[a(351381066, var39 ^ 1149498919)] & 255L;
                           var100 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var98;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label140;
                  }

                  var20 = (var18 = b('ⷓ', 12179, var39 ^ 397433814)).length();
                  var17 = a(351381095, var39 ^ -713272295);
                  var43 = -1;
            }

            var47 = var18.substring(++var43, var43 + var17);
            var10001 = 0;
         }
      }
   }

   private boolean aaa(class_310 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0b: checkcast java/lang/Boolean
      // 0e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11: iload 2
      // 12: ifne 1d
      // 15: ifne 1e
      // 18: goto 1c
      // 1b: athrow
      // 1c: bipush 1
      // 1d: ireturn
      // 1e: aload 1
      // 1f: iload 2
      // 20: ifne 32
      // 23: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 26: ifnull 60
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 1
      // 2e: goto 32
      // 31: athrow
      // 32: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 35: iload 2
      // 36: ifne 4b
      // 39: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 3c: ifnull 60
      // 3f: goto 43
      // 42: athrow
      // 43: aload 1
      // 44: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 47: goto 4b
      // 4a: athrow
      // 4b: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 4e: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 51: iload 2
      // 52: ifne 5d
      // 55: ifeq 60
      // 58: goto 5c
      // 5b: athrow
      // 5c: bipush 1
      // 5d: goto 61
      // 60: bipush 0
      // 61: ireturn
   }

   private float aab(class_310 param1) {
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
      // 006: ifne 01f
      // 009: aload 1
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaa (Lnet/minecraft/class_310;)Z
      // 00d: ifne 026
      // 010: goto 014
      // 013: athrow
      // 014: aload 0
      // 015: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 018: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 01b: goto 01f
      // 01e: athrow
      // 01f: checkcast java/lang/Double
      // 022: invokevirtual java/lang/Double.floatValue ()F
      // 025: freturn
      // 026: aload 1
      // 027: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 02a: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 02d: astore 3
      // 02e: aload 1
      // 02f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 032: fconst_1
      // 033: invokevirtual net/minecraft/class_746.method_5828 (F)Lnet/minecraft/class_243;
      // 036: invokevirtual net/minecraft/class_243.method_1029 ()Lnet/minecraft/class_243;
      // 039: astore 4
      // 03b: ldc2_w 0.1
      // 03e: aload 0
      // 03f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 042: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 045: checkcast java/lang/Double
      // 048: invokevirtual java/lang/Double.doubleValue ()D
      // 04b: invokestatic java/lang/Math.max (DD)D
      // 04e: dstore 5
      // 050: aload 3
      // 051: aload 4
      // 053: dload 5
      // 055: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 058: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 05b: astore 7
      // 05d: aload 0
      // 05e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 061: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 064: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaab
      // 067: astore 8
      // 069: dconst_0
      // 06a: aload 0
      // 06b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 06e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 071: checkcast java/lang/Double
      // 074: invokevirtual java/lang/Double.doubleValue ()D
      // 077: invokestatic java/lang/Math.max (DD)D
      // 07a: dstore 9
      // 07c: ldc2_w 0.1
      // 07f: aload 0
      // 080: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 083: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 086: checkcast java/lang/Double
      // 089: invokevirtual java/lang/Double.doubleValue ()D
      // 08c: invokestatic java/lang/Math.max (DD)D
      // 08f: dstore 11
      // 091: dconst_0
      // 092: dstore 13
      // 094: aload 1
      // 095: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 098: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
      // 09b: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0a0: astore 15
      // 0a2: aload 15
      // 0a4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a9: ifeq 1a5
      // 0ac: aload 15
      // 0ae: iload 2
      // 0af: ifne 1ac
      // 0b2: goto 0b6
      // 0b5: athrow
      // 0b6: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bb: checkcast net/minecraft/class_1297
      // 0be: astore 16
      // 0c0: aload 16
      // 0c2: iload 2
      // 0c3: ifne 0d2
      // 0c6: instanceof net/minecraft/class_1309
      // 0c9: ifeq 0a2
      // 0cc: goto 0d0
      // 0cf: athrow
      // 0d0: aload 16
      // 0d2: checkcast net/minecraft/class_1309
      // 0d5: astore 17
      // 0d7: aload 17
      // 0d9: iload 2
      // 0da: ifne 0ea
      // 0dd: aload 1
      // 0de: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e1: if_acmpeq 0a2
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: aload 17
      // 0ea: iload 2
      // 0eb: ifne 0fa
      // 0ee: invokevirtual net/minecraft/class_1309.method_5805 ()Z
      // 0f1: ifeq 0a2
      // 0f4: goto 0f8
      // 0f7: athrow
      // 0f8: aload 17
      // 0fa: invokevirtual net/minecraft/class_1309.method_31481 ()Z
      // 0fd: iload 2
      // 0fe: ifne 110
      // 101: ifne 0a2
      // 104: goto 108
      // 107: athrow
      // 108: aload 0
      // 109: aload 17
      // 10b: aload 8
      // 10d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaab (Lnet/minecraft/class_1309;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaab;)Z
      // 110: iload 2
      // 111: ifne 132
      // 114: ifeq 0a2
      // 117: goto 11b
      // 11a: athrow
      // 11b: aload 1
      // 11c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 11f: iload 2
      // 120: ifne 13a
      // 123: aload 17
      // 125: invokevirtual net/minecraft/class_746.method_5858 (Lnet/minecraft/class_1297;)D
      // 128: dload 5
      // 12a: dload 5
      // 12c: dmul
      // 12d: dcmpl
      // 12e: goto 132
      // 131: athrow
      // 132: ifle 138
      // 135: goto 0a2
      // 138: aload 17
      // 13a: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
      // 13d: dload 9
      // 13f: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 142: astore 18
      // 144: aload 18
      // 146: iload 2
      // 147: ifne 165
      // 14a: aload 3
      // 14b: aload 7
      // 14d: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
      // 150: invokevirtual java/util/Optional.isPresent ()Z
      // 153: ifeq 16c
      // 156: goto 15a
      // 159: athrow
      // 15a: aload 0
      // 15b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 15e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 161: goto 165
      // 164: athrow
      // 165: checkcast java/lang/Double
      // 168: invokevirtual java/lang/Double.floatValue ()F
      // 16b: freturn
      // 16c: aload 0
      // 16d: aload 3
      // 16e: aload 4
      // 170: aload 18
      // 172: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_238;)D
      // 175: dstore 19
      // 177: dload 19
      // 179: iload 2
      // 17a: ifne 192
      // 17d: dload 11
      // 17f: dcmpg
      // 180: ifgt 1a1
      // 183: goto 187
      // 186: athrow
      // 187: dconst_1
      // 188: dload 19
      // 18a: dload 11
      // 18c: ddiv
      // 18d: dsub
      // 18e: goto 192
      // 191: athrow
      // 192: dstore 21
      // 194: dload 13
      // 196: aload 0
      // 197: dload 21
      // 199: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.bab (D)D
      // 19c: invokestatic java/lang/Math.max (DD)D
      // 19f: dstore 13
      // 1a1: iload 2
      // 1a2: ifeq 0a2
      // 1a5: aload 0
      // 1a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 1a9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 1ac: checkcast java/lang/Double
      // 1af: invokevirtual java/lang/Double.floatValue ()F
      // 1b2: fstore 15
      // 1b4: dload 13
      // 1b6: dconst_0
      // 1b7: dcmpg
      // 1b8: ifgt 1bf
      // 1bb: fload 15
      // 1bd: freturn
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 1c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 1c6: checkcast java/lang/Double
      // 1c9: invokevirtual java/lang/Double.floatValue ()F
      // 1cc: fstore 16
      // 1ce: dload 13
      // 1d0: fload 15
      // 1d2: f2d
      // 1d3: fload 16
      // 1d5: f2d
      // 1d6: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
      // 1d9: d2f
      // 1da: freturn
   }

   private void aba(float param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0b: checkcast java/lang/Double
      // 0e: invokevirtual java/lang/Double.floatValue ()F
      // 11: ldc 0.01
      // 13: fconst_1
      // 14: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 17: fstore 3
      // 18: aload 0
      // 19: fload 3
      // 1a: iload 2
      // 1b: ifne 43
      // 1e: aload 0
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaaa F
      // 22: fload 1
      // 23: invokestatic net/minecraft/class_3532.method_16439 (FFF)F
      // 26: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaaa F
      // 29: aload 0
      // 2a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaaa F
      // 2d: fload 1
      // 2e: fsub
      // 2f: invokestatic java/lang/Math.abs (F)F
      // 32: ldc_w 0.001
      // 35: fcmpg
      // 36: ifge 46
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 0
      // 3e: fload 1
      // 3f: goto 43
      // 42: athrow
      // 43: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaaa F
      // 46: return
   }

   private static String abb(int var0, int var1) {
      int var9 = -799351249;
      int var2 = (var0 ^ a(351381286, var9 ^ -1353824734)) & a(351381287, var9 ^ 707565382);
      if (bab[var2] == null) {
         char[] var3 = abba[var2].toCharArray();

         int var4 = switch (var3[0] & a(351381280, var9 ^ -1795722166)) {
            case 0 -> a(351381281, var9 ^ 1764450552);
            case 1 -> a(351381282, var9 ^ 1400821024);
            case 2 -> a(351381283, var9 ^ 532088728);
            case 3 -> a(351381308, var9 ^ -1079328874);
            case 4 -> a(351381309, var9 ^ -125001680);
            case 5 -> a(351381310, var9 ^ -377032017);
            case 6 -> a(351381311, var9 ^ -65950737);
            case 7 -> a(351381304, var9 ^ 2030781779);
            case 8 -> a(351381305, var9 ^ -1222217468);
            case 9 -> a(351381306, var9 ^ 1721121997);
            case 10 -> a(351381307, var9 ^ 660639439);
            case 11 -> a(351381300, var9 ^ -1254802340);
            case 12 -> a(351381301, var9 ^ -1977903312);
            case 13 -> a(351381302, var9 ^ 123945489);
            case 14 -> a(351381303, var9 ^ 766143781);
            case 15 -> a(351381296, var9 ^ -1457024076);
            case 16 -> a(351381297, var9 ^ 470986756);
            case 17 -> a(351381298, var9 ^ -1530845988);
            case 18 -> 2;
            case 19 -> a(351381299, var9 ^ 809932132);
            case 20 -> 1;
            case 21 -> a(351381260, var9 ^ -677425415);
            case 22 -> a(351381261, var9 ^ 255141066);
            case 23 -> a(351381262, var9 ^ 1136101815);
            case 24 -> a(351381263, var9 ^ -1153054791);
            case 25 -> a(351381256, var9 ^ -1617630836);
            case 26 -> a(351381257, var9 ^ 371025211);
            case 27 -> a(351381258, var9 ^ -1073074362);
            case 28 -> a(351381259, var9 ^ -947490951);
            case 29 -> a(351381252, var9 ^ 51832359);
            case 30 -> a(351381253, var9 ^ 1099952172);
            case 31 -> a(351381254, var9 ^ 1634553196);
            case 32 -> a(351381255, var9 ^ -1856554598);
            case 33 -> a(351381248, var9 ^ -1218249181);
            case 34 -> a(351381249, var9 ^ 730700274);
            case 35 -> a(351381250, var9 ^ 1419528033);
            case 36 -> a(351381251, var9 ^ 1643493471);
            case 37 -> a(351381276, var9 ^ -1288639645);
            case 38 -> a(351381277, var9 ^ 281680898);
            case 39 -> a(351381278, var9 ^ -513901846);
            case 40 -> a(351381279, var9 ^ 1054179594);
            case 41 -> a(351381272, var9 ^ -1426938737);
            case 42 -> a(351381273, var9 ^ -1051884189);
            case 43 -> a(351381274, var9 ^ -58827389);
            case 44 -> a(351381275, var9 ^ 131705449);
            case 45 -> a(351381268, var9 ^ 1944320671);
            case 46 -> a(351381269, var9 ^ -1123473841);
            case 47 -> a(351381270, var9 ^ 1986793264);
            case 48 -> a(351381271, var9 ^ -563813105);
            case 49 -> a(351381264, var9 ^ -716405969);
            case 50 -> a(351381265, var9 ^ -84413992);
            case 51 -> a(351381266, var9 ^ -561520495);
            case 52 -> a(351381267, var9 ^ -1423793800);
            case 53 -> a(351381356, var9 ^ -295178958);
            case 54 -> a(351381357, var9 ^ 2077836446);
            case 55 -> a(351381358, var9 ^ 700780181);
            case 56 -> a(351381359, var9 ^ -907418955);
            case 57 -> a(351381352, var9 ^ 1446916279);
            case 58 -> a(351381353, var9 ^ 1873754687);
            case 59 -> a(351381354, var9 ^ 745638409);
            case 60 -> a(351381355, var9 ^ 575598642);
            case 61 -> a(351381348, var9 ^ -296906745);
            case 62 -> a(351381349, var9 ^ -2146054943);
            case 63 -> a(351381350, var9 ^ -1287527484);
            case 64 -> a(351381351, var9 ^ 1205712353);
            case 65 -> a(351381344, var9 ^ -1601474427);
            case 66 -> a(351381345, var9 ^ 1511300708);
            case 67 -> a(351381346, var9 ^ -1207485695);
            case 68 -> a(351381347, var9 ^ -1493333150);
            case 69 -> a(351381372, var9 ^ -1071023366);
            case 70 -> a(351381373, var9 ^ 786920141);
            case 71 -> a(351381374, var9 ^ -1407909900);
            case 72 -> a(351381375, var9 ^ -1856677130);
            case 73 -> a(351381368, var9 ^ -789212261);
            case 74 -> a(351381369, var9 ^ 869238346);
            case 75 -> a(351381370, var9 ^ 1389867380);
            case 76 -> a(351381371, var9 ^ -729374275);
            case 77 -> a(351381364, var9 ^ 1272360083);
            case 78 -> a(351381365, var9 ^ 1419528504);
            case 79 -> a(351381366, var9 ^ 90445918);
            case 80 -> a(351381367, var9 ^ 1145173701);
            case 81 -> a(351381360, var9 ^ 169244450);
            case 82 -> a(351381361, var9 ^ -414037824);
            case 83 -> a(351381362, var9 ^ 1836274345);
            case 84 -> a(351381363, var9 ^ -1104519894);
            case 85 -> a(351381324, var9 ^ 1617127984);
            case 86 -> a(351381325, var9 ^ -919643585);
            case 87 -> a(351381326, var9 ^ 1711872324);
            case 88 -> a(351381327, var9 ^ -1754064145);
            case 89 -> a(351381320, var9 ^ 210157967);
            case 90 -> a(351381321, var9 ^ -513122790);
            case 91 -> a(351381322, var9 ^ 1444349225);
            case 92 -> a(351381323, var9 ^ -1900614590);
            case 93 -> a(351381316, var9 ^ -1438352071);
            case 94 -> a(351381317, var9 ^ -1804333563);
            case 95 -> a(351381318, var9 ^ -34009394);
            case 96 -> a(351381319, var9 ^ 208075685);
            case 97 -> a(351381312, var9 ^ -363739787);
            case 98 -> a(351381313, var9 ^ 851837064);
            case 99 -> a(351381314, var9 ^ 1654039455);
            case 100 -> a(351381315, var9 ^ -1782771623);
            case 101 -> a(351381340, var9 ^ -772164607);
            case 102 -> a(351381341, var9 ^ -1402396793);
            case 103 -> a(351381342, var9 ^ -507738279);
            case 104 -> 4;
            case 105 -> a(351381343, var9 ^ 481286785);
            case 106 -> a(351381336, var9 ^ 1762848025);
            case 107 -> a(351381337, var9 ^ -723722386);
            case 108 -> a(351381338, var9 ^ -1149398462);
            case 109 -> a(351381339, var9 ^ -1228543411);
            case 110 -> a(351381332, var9 ^ -1698665041);
            case 111 -> a(351381333, var9 ^ 274853836);
            case 112 -> a(351381334, var9 ^ -120005949);
            case 113 -> a(351381335, var9 ^ 1120729606);
            case 114 -> a(351381328, var9 ^ -1903711402);
            case 115 -> a(351381329, var9 ^ 1909820932);
            case 116 -> a(351381330, var9 ^ 532156516);
            case 117 -> a(351381331, var9 ^ -1506526424);
            case 118 -> a(351381420, var9 ^ -809540831);
            case 119 -> a(351381421, var9 ^ -1898439271);
            case 120 -> a(351381422, var9 ^ 1707489843);
            case 121 -> a(351381423, var9 ^ 955376539);
            case 122 -> a(351381416, var9 ^ 1527008314);
            case 123 -> a(351381417, var9 ^ 1821150766);
            case 124 -> a(351381418, var9 ^ -1154565551);
            case 125 -> a(351381419, var9 ^ 689877295);
            case 126 -> a(351381412, var9 ^ 20989121);
            case 127 -> a(351381413, var9 ^ 247574330);
            case 128 -> a(351381414, var9 ^ -1231669781);
            case 129 -> a(351381415, var9 ^ 1471114462);
            case 130 -> a(351381408, var9 ^ 2119158010);
            case 131 -> a(351381409, var9 ^ 1721075606);
            case 132 -> a(351381410, var9 ^ -555760463);
            case 133 -> a(351381411, var9 ^ -1494299340);
            case 134 -> a(351381436, var9 ^ 990376757);
            case 135 -> a(351381437, var9 ^ 62569952);
            case 136 -> a(351381438, var9 ^ -959103283);
            case 137 -> a(351381439, var9 ^ -1484801729);
            case 138 -> a(351381432, var9 ^ -1158882995);
            case 139 -> a(351381433, var9 ^ -1066474314);
            case 140 -> a(351381434, var9 ^ -335259976);
            case 141 -> a(351381435, var9 ^ -305051087);
            case 142 -> a(351381428, var9 ^ -906653012);
            case 143 -> a(351381429, var9 ^ 325576681);
            case 144 -> a(351381430, var9 ^ -44088885);
            case 145 -> a(351381431, var9 ^ -241310407);
            case 146 -> a(351381424, var9 ^ 351403004);
            case 147 -> a(351381425, var9 ^ 1753589542);
            case 148 -> a(351381426, var9 ^ 557599257);
            case 149 -> a(351381427, var9 ^ -1036147819);
            case 150 -> a(351381388, var9 ^ 459130207);
            case 151 -> a(351381389, var9 ^ -914061338);
            case 152 -> a(351381390, var9 ^ 1056118218);
            case 153 -> a(351381391, var9 ^ -990280975);
            case 154 -> a(351381384, var9 ^ 932019289);
            case 155 -> a(351381385, var9 ^ -543012231);
            case 156 -> a(351381386, var9 ^ -55629779);
            case 157 -> 3;
            case 158 -> a(351381387, var9 ^ -859868893);
            case 159 -> a(351381380, var9 ^ 383080229);
            case 160 -> a(351381381, var9 ^ 1420569529);
            case 161 -> a(351381382, var9 ^ 577924355);
            case 162 -> a(351381383, var9 ^ -1220988158);
            case 163 -> a(351381376, var9 ^ -900718269);
            case 164 -> a(351381377, var9 ^ 2140860974);
            case 165 -> a(351381378, var9 ^ 866193039);
            case 166 -> a(351381379, var9 ^ 1375561910);
            case 167 -> a(351381404, var9 ^ 956990057);
            case 168 -> a(351381405, var9 ^ 785496144);
            case 169 -> a(351381406, var9 ^ 1665574329);
            case 170 -> a(351381407, var9 ^ -732340636);
            case 171 -> a(351381400, var9 ^ 632567212);
            case 172 -> a(351381401, var9 ^ -1294548769);
            case 173 -> a(351381402, var9 ^ 1463126846);
            case 174 -> a(351381403, var9 ^ -631753736);
            case 175 -> a(351381396, var9 ^ 974314708);
            case 176 -> a(351381397, var9 ^ 472958376);
            case 177 -> a(351381398, var9 ^ 1381261333);
            case 178 -> a(351381399, var9 ^ 394505184);
            case 179 -> a(351381392, var9 ^ -964417123);
            case 180 -> 5;
            case 181 -> a(351381393, var9 ^ 1456503101);
            case 182 -> a(351381394, var9 ^ -272508480);
            case 183 -> a(351381395, var9 ^ 2094507832);
            case 184 -> a(351381484, var9 ^ 1321713635);
            case 185 -> a(351381485, var9 ^ -1343563766);
            case 186 -> a(351381486, var9 ^ 1864840064);
            case 187 -> a(351381487, var9 ^ -1246425568);
            case 188 -> a(351381480, var9 ^ 1582826340);
            case 189 -> a(351381481, var9 ^ -1043553575);
            case 190 -> a(351381482, var9 ^ -109029474);
            case 191 -> a(351381483, var9 ^ -1888463722);
            case 192 -> a(351381476, var9 ^ -187609531);
            case 193 -> a(351381477, var9 ^ 846958831);
            case 194 -> a(351381478, var9 ^ -812714296);
            case 195 -> a(351381479, var9 ^ 919855843);
            case 196 -> a(351381472, var9 ^ -1131746114);
            case 197 -> a(351381473, var9 ^ -1789866874);
            case 198 -> a(351381474, var9 ^ 382348910);
            case 199 -> a(351381475, var9 ^ -1030079493);
            case 200 -> a(351381500, var9 ^ 1048768667);
            case 201 -> a(351381501, var9 ^ 334028265);
            case 202 -> a(351381502, var9 ^ -783399434);
            case 203 -> a(351381503, var9 ^ 1054596337);
            case 204 -> a(351381496, var9 ^ -2049148149);
            case 205 -> a(351381497, var9 ^ 1107489229);
            case 206 -> a(351381498, var9 ^ 1927514088);
            case 207 -> a(351381499, var9 ^ -1929076367);
            case 208 -> a(351381492, var9 ^ 803348194);
            case 209 -> a(351381493, var9 ^ 729249665);
            case 210 -> a(351381494, var9 ^ -94771168);
            case 211 -> a(351381495, var9 ^ 1865912212);
            case 212 -> a(351381488, var9 ^ -43253936);
            case 213 -> a(351381489, var9 ^ 577305061);
            case 214 -> a(351381490, var9 ^ 1543808097);
            case 215 -> a(351381491, var9 ^ -901387412);
            case 216 -> a(351381452, var9 ^ 1209975876);
            case 217 -> a(351381453, var9 ^ 994279566);
            case 218 -> a(351381454, var9 ^ -400379033);
            case 219 -> a(351381455, var9 ^ 427489017);
            case 220 -> a(351381448, var9 ^ -821026019);
            case 221 -> a(351381449, var9 ^ 698704384);
            case 222 -> a(351381450, var9 ^ 471162679);
            case 223 -> a(351381451, var9 ^ 1447379370);
            case 224 -> a(351381444, var9 ^ 651799029);
            case 225 -> a(351381445, var9 ^ -347021969);
            case 226 -> a(351381446, var9 ^ 1791136887);
            case 227 -> a(351381447, var9 ^ -1352336562);
            case 228 -> a(351381440, var9 ^ -946833447);
            case 229 -> a(351381441, var9 ^ -1944222476);
            case 230 -> a(351381442, var9 ^ 1623343966);
            case 231 -> a(351381443, var9 ^ -1883689189);
            case 232 -> a(351381468, var9 ^ -274936331);
            case 233 -> 0;
            case 234 -> a(351381469, var9 ^ -423755767);
            case 235 -> a(351381470, var9 ^ 434189108);
            case 236 -> a(351381471, var9 ^ -354980809);
            case 237 -> a(351381464, var9 ^ -759097248);
            case 238 -> a(351381465, var9 ^ -1814349824);
            case 239 -> a(351381466, var9 ^ -911767642);
            case 240 -> a(351381467, var9 ^ -278063993);
            case 241 -> a(351381460, var9 ^ -72870599);
            case 242 -> a(351381461, var9 ^ 821155594);
            case 243 -> a(351381462, var9 ^ -2106043902);
            case 244 -> a(351381463, var9 ^ -1252653895);
            case 245 -> a(351381456, var9 ^ -1827066465);
            case 246 -> a(351381457, var9 ^ 244906217);
            case 247 -> a(351381458, var9 ^ 937914556);
            case 248 -> a(351381459, var9 ^ 238435933);
            case 249 -> a(351381036, var9 ^ -1090883093);
            case 250 -> a(351381037, var9 ^ -505296026);
            case 251 -> a(351381038, var9 ^ -121212731);
            case 252 -> a(351381039, var9 ^ -1710927514);
            case 253 -> a(351381032, var9 ^ -1672563245);
            case 254 -> a(351381033, var9 ^ 1520668005);
            default -> a(351381034, var9 ^ 1538318885);
         };
         int var5 = (var1 & a(351381035, var9 ^ -1788303919)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(351381028, var9 ^ -1441354916)) >>> a(351381029, var9 ^ 33311679)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(351381030, var9 ^ -983847150);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(351381031, var9 ^ 1604298070);
            }
         }

         bab[var2] = new String(var3).intern();
      }

      return bab[var2];
   }

   private double bab(double var1) {
      double var3 = class_3532.method_15350(var1, 0.0, 1.0);
      return var3 * var3 * (3.0 - 2.0 * var3);
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
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 2
      // 08: iload 1
      // 09: ifne 3b
      // 0c: aload 2
      // 0d: ifnull 32
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 2c
      // 19: goto 1d
      // 1c: athrow
      // 1d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 20: ifnull 32
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: goto 2c
      // 2b: athrow
      // 2c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2f: ifnonnull 3c
      // 32: aload 0
      // 33: fconst_1
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aba (F)V
      // 37: goto 3b
      // 3a: athrow
      // 3b: return
      // 3c: aload 0
      // 3d: aload 0
      // 3e: aload 2
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aab (Lnet/minecraft/class_310;)F
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aba (F)V
      // 45: return
   }

   @Override
   public void abaab() {
      this.aaaa = ((Double)this.aabb.abbb()).floatValue();
   }

   private static void bba() {
      int var0 = 672331078;
      ab[0] = bb(
         abb(a(351381024, var0 ^ -2007220533), a(351381025, var0 ^ -595938630)).toCharArray(),
         bbb(a(351381026, var0 ^ 1655009553), 2068309594984583830L),
         ba(a(351381027, var0 ^ -1253297901), 7381746312381154739L)
      );
      ab[1] = bb(
         abb(a(351381052, var0 ^ 975367015), a(351381053, var0 ^ -1868730829)).toCharArray(),
         bbb(a(351381054, var0 ^ 1908471547), 516418984218956603L),
         ba(a(351381055, var0 ^ -1768323739), 2353528592649973257L)
      );
      ab[2] = bb(
         abb(a(351381048, var0 ^ -2010572709), a(351381049, var0 ^ 1084746298)).toCharArray(),
         bbb(a(351381050, var0 ^ 905087712), 2072512331881191247L),
         ba(a(351381051, var0 ^ 698438241), 8079434874226419211L)
      );
      ab[3] = bb(
         abb(a(351381044, var0 ^ -1786715267), a(351381045, var0 ^ -1762651271)).toCharArray(),
         bbb(a(351381046, var0 ^ -193664053), 2960976958463320019L),
         ba(a(351381047, var0 ^ -422824946), 205389229917701105L)
      );
      ab[4] = bb(
         abb(a(351381040, var0 ^ 1421321450), a(351381041, var0 ^ 1393319508)).toCharArray(),
         bbb(a(351381042, var0 ^ 1281068463), 3640624945192985868L),
         ba(a(351381043, var0 ^ -642803132), 4993456034399824754L)
      );
      ab[5] = bb(
         abb(a(351381004, var0 ^ 301373915), a(351381005, var0 ^ 1131128403)).toCharArray(),
         bbb(a(351381006, var0 ^ 2127520547), 443783045199064079L),
         ba(a(351381007, var0 ^ 1606965941), 3508312642511337259L)
      );
      ab[ba(a(351381000, var0 ^ 2023761172), 7528448243830685013L)] = bb(
         abb(a(351381001, var0 ^ -1181700154), a(351381002, var0 ^ 1326106111)).toCharArray(),
         bbb(a(351381003, var0 ^ -728009663), 5518966712461084046L),
         ba(a(351380996, var0 ^ 1615499254), 3324572398769715560L)
      );
      ab[ba(a(351380997, var0 ^ -1929933510), 6258822209952168190L)] = bb(
         abb(a(351380998, var0 ^ -658667105), a(351380999, var0 ^ -2094783471)).toCharArray(),
         bbb(a(351380992, var0 ^ -315714953), 5590038784921338153L),
         ba(a(351380993, var0 ^ -344685359), 1547863438871190142L)
      );
      ab[ba(a(351380994, var0 ^ -849807191), 8242562538383143664L)] = bb(
         abb(a(351380995, var0 ^ 95277498), a(351381020, var0 ^ 1130207082)).toCharArray(),
         bbb(a(351381021, var0 ^ -493968285), 7563399555256950853L),
         ba(a(351381022, var0 ^ 549631043), 8834447399336762713L)
      );
      ab[ba(a(351381023, var0 ^ 2008206348), 5146828722093383751L)] = bb(
         abb(a(351381016, var0 ^ -1917760496), a(351381017, var0 ^ -2145967720)).toCharArray(),
         bbb(a(351381018, var0 ^ 1794606523), 744606667153137093L),
         ba(a(351381019, var0 ^ 1746274320), 1220241919554809357L)
      );
      ab[ba(a(351381012, var0 ^ -1516688621), 2705786398578794688L)] = bb(
         abb(a(351381013, var0 ^ -366689438), a(351381014, var0 ^ -980600203)).toCharArray(),
         bbb(a(351381015, var0 ^ -780188400), 1478001767802986115L),
         ba(a(351381008, var0 ^ -1698903502), 2620917101286827219L)
      );
      ab[ba(a(351381009, var0 ^ 1604251838), 2527842835523063948L)] = bb(
         abb(a(351381010, var0 ^ -466088049), a(351381011, var0 ^ -536032911)).toCharArray(),
         bbb(a(351381100, var0 ^ -339633191), 46978506885886613L),
         ba(a(351381101, var0 ^ 2102444419), 1451621850542348493L)
      );
      ab[ba(a(351381102, var0 ^ -540906410), 7282631282416037662L)] = bb(
         abb(a(351381103, var0 ^ -248209828), a(351381096, var0 ^ 1925117621)).toCharArray(),
         bbb(a(351381097, var0 ^ -374917623), 467019923557366727L),
         ba(a(351381098, var0 ^ 243347287), 3418838231421313730L)
      );
   }

   private static long bbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(351381099, 12269304 ^ -2106966937)) & a(351381092, 12269304 ^ 1968091138);
      if (abab[var3] == null) {
         abab[var3] = ba[var3] ^ var1;
      }

      return abab[var3];
   }

   public float aaaa() {
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
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.babbaab ()Z
      // 0c: ifeq 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaaa.aaaa F
      // 1b: goto 1f
      // 1e: fconst_1
      // 1f: freturn
   }

   private boolean aaab(class_1309 param1, bbbabaab param2) {
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
      // 05: instanceof net/minecraft/class_1657
      // 08: istore 4
      // 0a: aload 2
      // 0b: iload 3
      // 0c: ifne 1e
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaab;
      // 12: if_acmpeq 55
      // 15: goto 19
      // 18: athrow
      // 19: aload 2
      // 1a: goto 1e
      // 1d: athrow
      // 1e: iload 3
      // 1f: ifne 3e
      // 22: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaab;
      // 25: if_acmpne 3d
      // 28: goto 2c
      // 2b: athrow
      // 2c: iload 4
      // 2e: iload 3
      // 2f: ifne 56
      // 32: goto 36
      // 35: athrow
      // 36: ifne 55
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 2
      // 3e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaab;
      // 41: if_acmpne 59
      // 44: iload 4
      // 46: iload 3
      // 47: ifne 56
      // 4a: goto 4e
      // 4d: athrow
      // 4e: ifne 59
      // 51: goto 55
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5a
      // 59: bipush 0
      // 5a: ireturn
   }

   private double aaba(class_243 var1, class_243 var2, class_238 var3) {
      class_243 var4 = var3.method_1005();
      class_243 var5 = new class_243(var4.field_1352, var3.field_1322 + (var3.field_1325 - var3.field_1322) * 0.72, var4.field_1350);
      class_243 var6 = new class_243(var4.field_1352, var3.field_1322 + (var3.field_1325 - var3.field_1322) * 0.38, var4.field_1350);
      return Math.min(this.ab(var2, var4.method_1020(var1)), Math.min(this.ab(var2, var5.method_1020(var1)), this.ab(var2, var6.method_1020(var1))));
   }
}
