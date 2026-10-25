package nsc;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class aabbaabab {
   private volatile ababbabab aa;
   private volatile long ab;
   private static final Duration ba;
   private volatile boolean bb;
   private boolean aaa;
   private static final long[] aab;
   private static final int aba;
   private static final long abb;
   private static final String[] bbba;
   private static final int baa;
   private static final int[] bbab;
   private volatile String bab;
   private static final Integer[] bba;
   private volatile Supplier bbb;
   private volatile abaabbb aaaa;
   private volatile boolean aaab;
   private volatile long aaba;
   private static final Gson aabb;
   private static final long[] a;
   private static final String[] abaa;
   private volatile String abab;
   private static final Long[] abba;
   private volatile String abbb;
   private static final String[] baaa;
   private static final int baab;
   private final HttpClient b = HttpClient.newBuilder()
      .connectTimeout(Duration.ofSeconds(baaa(a(-1002230427, 1079452033 ^ 1988366160), 4646680954641046851L)))
      .followRedirects(Redirect.NEVER)
      .build();
   private static final long baba;
   private static final Object[] bbbb;
   private static final int babb;
   private volatile String bbaa;

   static boolean aa(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc -1879374884
      // 02: istore 2
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 06: istore 1
      // 07: aload 0
      // 08: iload 1
      // 09: ifne 14
      // 0c: ifnull bf
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: ldc -1002230673
      // 16: iload 2
      // 17: ldc 1537611473
      // 19: ixor
      // 1a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 1d: ldc -1002230674
      // 1f: iload 2
      // 20: ldc -1971516574
      // 22: ixor
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f: iload 1
      // 30: ifne bc
      // 33: ifne bb
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: ldc -1002230675
      // 3d: iload 2
      // 3e: ldc -78467205
      // 40: ixor
      // 41: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 44: ldc -1002230676
      // 46: iload 2
      // 47: ldc 1208547675
      // 49: ixor
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 53: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 56: iload 1
      // 57: ifne bc
      // 5a: goto 5e
      // 5d: athrow
      // 5e: ifne bb
      // 61: goto 65
      // 64: athrow
      // 65: aload 0
      // 66: ldc -1002230677
      // 68: iload 2
      // 69: ldc 1762690639
      // 6b: ixor
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 6f: ldc -1002230678
      // 71: iload 2
      // 72: ldc -2015759478
      // 74: ixor
      // 75: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 78: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 7e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 81: iload 1
      // 82: ifne bc
      // 85: goto 89
      // 88: athrow
      // 89: ifne bb
      // 8c: goto 90
      // 8f: athrow
      // 90: aload 0
      // 91: ldc -1002230679
      // 93: iload 2
      // 94: ldc -1507011926
      // 96: ixor
      // 97: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 9a: ldc -1002230680
      // 9c: iload 2
      // 9d: ldc -1503729667
      // 9f: ixor
      // a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // a9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // ac: iload 1
      // ad: ifne bc
      // b0: goto b4
      // b3: athrow
      // b4: ifeq bf
      // b7: goto bb
      // ba: athrow
      // bb: bipush 1
      // bc: goto c0
      // bf: bipush 0
      // c0: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -852855259;
      short var34 = 5327;
      int var32 = 0;
      int var33 = 0;
      int var30 = "ƺ喎乚娎幚婾乕唎\ufe53寞九姞\ude5c圎乘娮깞城﹒匎Ṝ峎\uee52彾繐哎乕奾⹓吾㹗咎幒央깒帾\ude51匾⹒唎㹞幞蹘嚎㹐吞칑噎﹖嵞幙儞繙峎칚垞幓州﹒坮蹞嶮鹗塎\ude50叾⹘唎繘寎칔帎㹖姮\ude5f堞칑卞칒嵾Ṕ卮⹑啎乙噎㹒屾ṓ娮乓嚮⹕廎也唎蹘刞Ṕ廎Ṓ兾㹘媞幟婎깔唾\ude5b喎빞岮幚嫞\ude59孮鹟嗞繜庎鹟僮๙姎칔刞繖微乔叾\ude5d倎⹔塎빞呎빐倮친幾乐囎湚冎繖冎깑寮幑娞乜婾⹒傾치彾湐寎⹚咮깙呞繗娎빑坾\u2e5e卮\u0e5c噎\u0e5f奎ṟ偎\ude54埾\ude52宎칑忮⹖嗮﹙剾칗峾㹔嫎빔埮\ude56冞湜嗎빐峮湚庞칗庞깑幎幘娾鹗媎繘弾蹐咾๓忎\uee5c偞繘卮﹒嚾Ṙ偞幐嵾蹗华๗差﹕倮빑婮湑宾Ṓ娮﹛幞깛幮칗塮蹟吞\u0e5f嶾鹞幞幔幾㹟忾๔寮⹕卮\ude59嶾﹘䓞乁䲮蹅丮繁䟞繋䕞繈䬞้䰞⹃䌎\uee41仞㹌䡞깃䕮繋䘮鹉䌮鹃䆮湄䗾칃䳮Ṋ䔞칈䈮깇䶎⹎䪎湆䴾幁䋾⹄䑾久䶞깍䵎깇䃎湂䄎\uee41䱾繈伎๊䔎蹏䩎幉䥮ṇ䶮鹉䦎\ude45䉎之䣾幅䙾\ude45䋎ํ䰮鹅伾⹎䠞㹂䡎\ude45䍎﹄䚮칍佮김䁾湏䕎⹁䮞ṁ䕞깎䕾幃䬮湋䓾\ude4f䅾鹈䍎乌伾빁仮ṋ䂎\uee42䢮⹃䊞之䐎깈䷞乂䍮幋䘎깆䝎乊䋾蹊䙎乂䫎鹅䮎빌䱮鹃䏎㹊䕾\uee41䫞칄䳮칆䜮ṋ䄾㹅䥎义亾乊䥮湅䓮\ude48䣮乁䊎빍䩾빂䋮๋䝎깄䞾幉䓞깉䫎乃䙎ṏ䄞ใ䥮⹇䳾ṃ䈮繅䶞빌!\uf415嗶\uf8a5◰\uf765痶ﶕ嗷\uf2c5痵\uf8d5헾蝹㗽\uf055◻\uf445藱Ｅ\uf5f4\uf275痲\uf8e5旰％䗹\uf3e5뗳ﺅ䗷\uf5e5藸\uf565\u0090杖٢泖噧汖ꙧ汶٭昆䙢榖晤擖♧氖뙨朶虥濦Ꙧ怆㙭梖噦濆䙣抶홦殖噧憖왮旖♡怶٣摖噪杦䙠楆㙤樦♦惖ᙨ欶\ue667润陧抦٧掆왬潶왧时䙯朆٫枆뙣洆\uf663椶ꙩ棶ꙫ愖噥滶\uf664橆癢攖왭扖㙤椦㙣梦噤櫆癭武ꙭ檖٦槆虡揶٥朆뙥氦٩榆♩櫖虠梖٫戶虧濖院泖䙣槖癨框晪斆홧斖ꙧ濶\uf667惖噢枖ᙤ楶ᙥ暦噠惶\uf66c扶癣櫶뙩愶뙫曦晫湶왦武\uf669架ꙣ枆陪\n២䈞ἂ눟ᆢ刜ᦒ划ᄂ鈕\u0010ಥԌԕ蔅ڵ䔏\u0a55┏വ씄ӕ딃థ㔇क씏\n娇ꝓ勧坒屇띑呷띟峧睘0疡ᅹ突ⅵ璁共犡酼畡兴癑\uf171羱ᅿ籁셶矑ꅹ突ꅿ籡ㅴ痑ⅼ獱腹碱\uf178燡ᅶ缡ꅲ瞑煱紱셴秡腸珡䅾竡ㅻ窑腳羑셷琑텽\n䱷흅䒗❄䨷읇䈇읉䪗ݎ\u0010\udd89짙힙ঢ়\uda49㧒킙觖\udfe9槞\udab9맖탩\u09da\udd89秔\n涮\u0e64敎﹥毮Ṧ揞Ṩ歎\ude6f"
         .length();
      String[] var31 = new String[10];
      String var29 = "ƺ喎乚娎幚婾乕唎\ufe53寞九姞\ude5c圎乘娮깞城﹒匎Ṝ峎\uee52彾繐哎乕奾⹓吾㹗咎幒央깒帾\ude51匾⹒唎㹞幞蹘嚎㹐吞칑噎﹖嵞幙儞繙峎칚垞幓州﹒坮蹞嶮鹗塎\ude50叾⹘唎繘寎칔帎㹖姮\ude5f堞칑卞칒嵾Ṕ卮⹑啎乙噎㹒屾ṓ娮乓嚮⹕廎也唎蹘刞Ṕ廎Ṓ兾㹘媞幟婎깔唾\ude5b喎빞岮幚嫞\ude59孮鹟嗞繜庎鹟僮๙姎칔刞繖微乔叾\ude5d倎⹔塎빞呎빐倮친幾乐囎湚冎繖冎깑寮幑娞乜婾⹒傾치彾湐寎⹚咮깙呞繗娎빑坾\u2e5e卮\u0e5c噎\u0e5f奎ṟ偎\ude54埾\ude52宎칑忮⹖嗮﹙剾칗峾㹔嫎빔埮\ude56冞湜嗎빐峮湚庞칗庞깑幎幘娾鹗媎繘弾蹐咾๓忎\uee5c偞繘卮﹒嚾Ṙ偞幐嵾蹗华๗差﹕倮빑婮湑宾Ṓ娮﹛幞깛幮칗塮蹟吞\u0e5f嶾鹞幞幔幾㹟忾๔寮⹕卮\ude59嶾﹘䓞乁䲮蹅丮繁䟞繋䕞繈䬞้䰞⹃䌎\uee41仞㹌䡞깃䕮繋䘮鹉䌮鹃䆮湄䗾칃䳮Ṋ䔞칈䈮깇䶎⹎䪎湆䴾幁䋾⹄䑾久䶞깍䵎깇䃎湂䄎\uee41䱾繈伎๊䔎蹏䩎幉䥮ṇ䶮鹉䦎\ude45䉎之䣾幅䙾\ude45䋎ํ䰮鹅伾⹎䠞㹂䡎\ude45䍎﹄䚮칍佮김䁾湏䕎⹁䮞ṁ䕞깎䕾幃䬮湋䓾\ude4f䅾鹈䍎乌伾빁仮ṋ䂎\uee42䢮⹃䊞之䐎깈䷞乂䍮幋䘎깆䝎乊䋾蹊䙎乂䫎鹅䮎빌䱮鹃䏎㹊䕾\uee41䫞칄䳮칆䜮ṋ䄾㹅䥎义亾乊䥮湅䓮\ude48䣮乁䊎빍䩾빂䋮๋䝎깄䞾幉䓞깉䫎乃䙎ṏ䄞ใ䥮⹇䳾ṃ䈮繅䶞빌!\uf415嗶\uf8a5◰\uf765痶ﶕ嗷\uf2c5痵\uf8d5헾蝹㗽\uf055◻\uf445藱Ｅ\uf5f4\uf275痲\uf8e5旰％䗹\uf3e5뗳ﺅ䗷\uf5e5藸\uf565\u0090杖٢泖噧汖ꙧ汶٭昆䙢榖晤擖♧氖뙨朶虥濦Ꙧ怆㙭梖噦濆䙣抶홦殖噧憖왮旖♡怶٣摖噪杦䙠楆㙤樦♦惖ᙨ欶\ue667润陧抦٧掆왬潶왧时䙯朆٫枆뙣洆\uf663椶ꙩ棶ꙫ愖噥滶\uf664橆癢攖왭扖㙤椦㙣梦噤櫆癭武ꙭ檖٦槆虡揶٥朆뙥氦٩榆♩櫖虠梖٫戶虧濖院泖䙣槖癨框晪斆홧斖ꙧ濶\uf667惖噢枖ᙤ楶ᙥ暦噠惶\uf66c扶癣櫶뙩愶뙫曦晫湶왦武\uf669架ꙣ枆陪\n២䈞ἂ눟ᆢ刜ᦒ划ᄂ鈕\u0010ಥԌԕ蔅ڵ䔏\u0a55┏വ씄ӕ딃థ㔇क씏\n娇ꝓ勧坒屇띑呷띟峧睘0疡ᅹ突ⅵ璁共犡酼畡兴癑\uf171羱ᅿ籁셶矑ꅹ突ꅿ籡ㅴ痑ⅼ獱腹碱\uf178燡ᅶ缡ꅲ瞑煱紱셴秡腸珡䅾竡ㅻ窑腳羑셷琑텽\n䱷흅䒗❄䨷읇䈇읉䪗ݎ\u0010\udd89짙힙ঢ়\uda49㧒킙觖\udfe9槞\udab9맖탩\u09da\udd89秔\n涮\u0e64敎﹥毮Ṧ揞Ṩ歎\ude6f";

      do {
         int var37 = 0;
         char var35 = var29.charAt(var33);
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            char var38 = var36[var37];
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 4 | var38 << '\f') & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 4 | var38 >>> '\f') & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      bbba = var31;
      bbbb = new Object[var31.length];
      int var25 = 1253369607;
      byte[] var23 = "¥U?2\u008bqÖ¸\u0005¡\u0086\u0091I\u0004\u000bÇ\u0097ã¬¿y*ÉXXßøS§RY<\rÿø²\u009c|Q`8F\u0002üJ\u0089)ÒHsËTØ!\u0086\u00adÀrO\u0082F\b\u0086Ñ\u009e\u0085Â!¯<\u0095\u00935ÿé§IfmøÒOE¯~Ç\tf\u0091<`¡Í|¡]{Phj\u0015\"ÉçÐ\ni\u001f?÷iSÛwVk»ñdyK\u001bà üáGÕ+ýì\u0087G[\u008fM\u008c\u008få´c3l\u000eÕÌ\\\u0003\u0088\u0002ó¾ÑI&\u0019\u0002\u001cækùW3ç/\u008c\u0093¹øßl¿Éé\u001fXs\u0085#½0Ü\u009b\u0015\u009eQ\u0083\u0018]ò\u0000.uó\u0003wX$Âvø)u\u001b\"û7å·ã°\u0089Ø«\u0084\u0084Ýuæ7\rk¶¢HÕ\f\u001d×aè³ÕmhÓ\u0014¢Ej\n´\u0098\r{zté hs«\u0001^~uÒ\u0012Êy\u0093GÂ+Û}\u008ah-ä¹ \u009bf\u009fÍ\u0012\u0092ß§éúé«/\u008e\u000bMÏÂ5Á)ûG\u0089Ã\u000fuæX¹\u0091+cô\u0098ÓëC\u0002þ\u008c\u0088\u0094\u001c,õ>¥>Æ¶ü\u001e¶Ñ\u0094eX\u0099\u0005\u008aËg\u008f\u001dô5*k´¹Å\tKX·¬\u0015¶$èÕCä\u009e\u0007\u0091\u0011Õ\u008aÒ\u0085´Ë³»®TyQ\u0097±k²¨ìnC\u009bÔ¢¹\bl¥»ÉöËj¼\u0084\u0012:·\u0003;5IVÖ\u0082'ÍIöz¶¬vU,¡uùéc1HÙÇZÞKÄ\u0004\u0010ýâ\u0012]mkÿ§Ý ßêÄ~³\tpG\u0090\u0089\u008dÄ@wé(öÈÊû~Tï´ð\u0095ôÓ¬¶(Àcûe\u0000>\u0087ïËïaJö®\u009bG;F\u0012&\u0011\f22¦\u009b\u008a\u0094Fßõþ\u0004jH¿|\u0098¦\u000b\u0000\u0016²ß¾Û/¯µRÊ?¥Ð\u009b\u008c|\t\u001fÙ]·ñK-o\u000bô\u0088\u0005;\u001c´t\u001b4\u0083°¥#\u0097w\u001aòzð[©Õà \u0010oÃB\u0091\u0081\u0094kuêï\u0001\u001e¤«H EÛK\u008f´}\u009cýÀ6\u001f/ÇE¯wôûåî6~C;É\u0002?HkëYQºvYIÀ\r}oXýHÝ¢N.ó<\u0000?Ù|\tqcR%ª57\b\u001d\u001c%)Êà×\u0080\u0019\u0007,\"clµ\u0081ðôv\u0096\u0086Ä?ÖH\u0007ì³9I\u008f\u008bU\u001có\u009d\u008a\u0001\rÔ&8õ÷\u00ad\u0098ÑõVë\u0013h7Á\u0086.K¥¿ë\bÍ\u0095áÔ\u0014»\u0014gº®\u0091²ªªº,'ù\"Âw\u001e3ãËF%\u0099ã0àibtì¼\u0084\u001ef²\u0010k\"}\u0092ím\u001a\u0002\u009eâ\u0086Ñº!\u001fB[)Ê\u009fo)ÈÈQ¦Óò\u001fSp U\u0082{>Ç\u0000°x\u0093Ot§oÚ¿xQ\u0013\t}§1Ón¨Ðúxá+\u0095AEÈË¾\u000bçL¥Ùÿ0¸\u0094\u0002p\u0003÷x\u0015úØ\u0012q\u0002òò`µ\u0007pß\u001d\u0099gv\u0002qêY\u0090²C«\u001eö\u0099²-p+amWv\u001cI÷ß:\u0095º©\u0092\u0018û\u0014\u0011ûJA\bÑ\t¡sÿø\u0011\u0000F\u008fîÎ\u0098g\u00102\"·æ9ÿ\u008b;¶Êë%©\u0092ÆQe¬%&'ð/¬_l\u0018Í\"y6\u008d;Z\u001e·]å\fq9F\u0000ºé0ðõ3¶\u0006\u0006'qÎ¢\u0003\u000fü,\u001a\\k\u008aoÐXÜ\u0085Ú\u0090qí\u0093sTÏðàÍ\u0001ugâBcáðÊ×£/k\u0083\u009b\u0005Û¬'äc\u0080BRÛ³fà@I\u000fï¨o\b·ÊA¡Â\u0018\u0097Y\b)j\u0095¼¯Ûã±åiÊd>I\u0017\b\u0003*¸ .\u009d·û\u0000O\u0017¸\r¿\u0011}hHógÐWà±ó\u0093\u001b?ÞZÿ1¸$@É¾íÐ\u0098\u009c]ò¨5ºÉs*é\u0085Æ¡ô¨\u008bw;Ã\u0013\u008dHÅ\f9Â\u0000ØbHµoþ¡>\u009aã+§\u0084C[{ë\u000bÊ¬ÙõùI\u001fþv¶\u0085\u00047wÓeòò·åÙÿåed6SC\u0006\u0088\u008eE&Ç\u0004þÚ°Ëe\u0000d»F\u0007\u009a\u009dìÎ\u009b0Ø\u0007\u001dC\u0014Æ¶ÚÎ#ÎmnâÈH¥Ë¶>¹zDXV\u0005áÝY\u0003qÛ\u0018Ìû~\"~½EZ\u0085S\u008eËHüeïÓ3¦\u0000ÜWO\u000e\u0011C×?Tó¶y×¶\u0095\u0081\u0085 ÙKº¡\" 9\u000eBu\u001eáÐ¢ Þ\u008cMó\u008aYOÏ\u00ad+\u0019\u001f$(´Ð\u009bTð6\u0080\u0003U\u000e¸E;Ã¹xæ\t\t,pà¯bg\u008c§\u00108P\r£0¿\"¬Bû¶R\u000eÿ\u000e´æ\u009eX\tE^Ì\u001aÿ4\u0090'ê\u0086\u007f]S\u0007eÀêÆ ¹\u000b\u0092ÒçËMÕ&;bè¢\u0002÷\b\u0098·\u008bð¹É\u0099¡ÑjY¥y\rÊÞ\u0002OÛY\u00adÿeü\u00126\u0000ÈÊñ,Aø¯\u0080\u0093Fè!\u001a¨y$ü\u0099¤çÜ#ê\u008f\u0087àà»\tL\u0095\u0098\u0098\u00054Rq\u0096á\u0003Ä,ÃëË\"\u0095÷kAö¤4\u001f»£<Á\u001aÍÈBoJ%RDL%ç\f}oFô\f'\u0018÷o1½Eú\u008bú÷\u008c\u0003>ëÀ\u007fbà\u00adN$ÔÅÂ}\u00904\u0018¶Cjß%\u0007úÎ ¨|Ì#\u00839ä\u001f*\u008fÞWî\u0081ÃDÔ\u0018\u0013\u0005¶+ed¤ÏyÌæ\u00ad²|ÉºP\u0012äãÎt'<\u0096w\u0016u«ÏC;þy¹b~ô\u000eø\u008a\tf\bÐ\u0019Ò.¦nËb6þ"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      bbab = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         bbab[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[a(-1002230430, var39 ^ 1986478990)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aabab((byte)-86, (short)-31829, (byte)-128, 1655458324)).length();
      int var17 = a(-1002230431, var39 ^ 1765019437);
      int var43 = -1;

      label127:
      while (true) {
         String var10000 = var18.substring(++var43, var43 + var17);
         int var10001 = -1;

         while (true) {
            char[] var64;
            label122: {
               char[] var49 = var10000.toCharArray();
               int var10003 = var49.length;
               int var22 = 0;
               var64 = var49;
               var10001 = var10003;
               char[] var76;
               int var10004;
               if (var10003 <= 1) {
                  var76 = var49;
                  var10004 = var22;
               } else {
                  var64 = var49;
                  var10001 = var10003;
                  if (var10003 <= var22) {
                     break label122;
                  }

                  var76 = var49;
                  var10004 = var22;
               }

               while (true) {
                  var76[var10004] = (char)(var76[var10004] ^ switch (var22 % a(-1002230402, var39 ^ -829075461)) {
                     case 0 -> a(-1002230403, var39 ^ 2048887356);
                     case 1 -> a(-1002230404, var39 ^ 563429088);
                     case 2 -> a(-1002230405, var39 ^ -1115900634);
                     case 3 -> a(-1002230406, var39 ^ -1594479581);
                     case 4 -> a(-1002230407, var39 ^ 8843638);
                     case 5 -> a(-1002230408, var39 ^ 1209476676);
                     default -> a(-1002230409, var39 ^ -1239104853);
                  });
                  var22++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var76 = var64;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var76 = var64;
                     var10004 = var22;
                  }
               }
            }

            String var83 = new String(var64).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var83;
                  if ((var43 += var17) >= var20) {
                     baaa = var21;
                     abaa = new String[a(-1002230401, var39 ^ 887507443)];
                     long var8 = 7878552288062587851L;
                     long[] var14 = new long[a(-1002230410, var39 ^ -1112851359)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = aabab((byte)-29, (short)-252, 43, 1655458326)).length();
                     byte var10 = 0;

                     label101:
                     while (true) {
                        int var56 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var56, var10).getBytes(aabab(103, (short)18272, (byte)81, 1655458327));
                        long[] var46 = var14;
                        var56 = var11++;
                        long var70 = (var15[0] & 255L) << a(-1002230411, var39 ^ 1206582360)
                           | (var15[1] & 255L) << a(-1002230412, var39 ^ 640645429)
                           | (var15[2] & 255L) << a(-1002230413, var39 ^ -1509657224)
                           | (var15[3] & 255L) << a(-1002230414, var39 ^ 649706695)
                           | (var15[4] & 255L) << a(-1002230415, var39 ^ 14352993)
                           | (var15[5] & 255L) << a(-1002230416, var39 ^ 117132770)
                           | (var15[a(-1002230449, var39 ^ -1123599860)] & 255L) << a(-1002230450, var39 ^ 652078715)
                           | var15[a(-1002230451, var39 ^ 98177113)] & 255L;
                        byte var84 = -1;

                        while (true) {
                           long var89 = var70 ^ var8;
                           switch (var84) {
                              case 0:
                                 var46[var56] = var89;
                                 if (var10 >= var13) {
                                    aab = var14;
                                    bba = new Integer[a(-1002230461, var39 ^ 1527869871)];
                                    baab = bba(a(-1002230462, var39 ^ 1638096845), 5218640082040778419L);
                                    aba = bba(a(-1002230463, var39 ^ 425227688), 6074403973621258059L);
                                    baa = bba(a(-1002230464, var39 ^ -2003468942), 381937291951063866L);
                                    babb = bba(a(-1002230433, var39 ^ -1408344473), 7711632762424770302L);
                                    long var0 = 1268932003555778787L;
                                    long[] var6 = new long[a(-1002230434, var39 ^ 1124195743)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = aabab(121, 28963, 39, 1655458322)).length();
                                    byte var2 = 0;

                                    label91:
                                    while (true) {
                                       int var59 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var59, var2).getBytes(aabab((byte)-70, 4775, (byte)-10, 1655458323));
                                       long[] var47 = var6;
                                       var59 = var3++;
                                       long var72 = (var7[0] & 255L) << a(-1002230435, var39 ^ 1305266292)
                                          | (var7[1] & 255L) << a(-1002230436, var39 ^ 2089383964)
                                          | (var7[2] & 255L) << a(-1002230437, var39 ^ 973749280)
                                          | (var7[3] & 255L) << a(-1002230438, var39 ^ -1034409371)
                                          | (var7[4] & 255L) << a(-1002230439, var39 ^ 140979173)
                                          | (var7[5] & 255L) << a(-1002230440, var39 ^ -471563124)
                                          | (var7[a(-1002230441, var39 ^ 918776591)] & 255L) << a(-1002230442, var39 ^ -511880108)
                                          | var7[a(-1002230443, var39 ^ 237895813)] & 255L;
                                       byte var86 = -1;

                                       while (true) {
                                          var89 = var72 ^ var0;
                                          switch (var86) {
                                             case 0:
                                                var47[var59] = var89;
                                                if (var2 >= var5) {
                                                   a = var6;
                                                   abba = new Long[a(-1002230485, var39 ^ 2072872710)];
                                                   baba = baaa(a(-1002230486, var39 ^ 1935806793), 130668039853847773L);
                                                   abb = baaa(a(-1002230487, var39 ^ 19306186), 6097782207659631999L);
                                                   aabb = new Gson();
                                                   ba = Duration.ofSeconds(baaa(a(-1002230488, var39 ^ 1294078179), 5477715494124740395L));
                                                   return;
                                                }
                                                break;
                                             default:
                                                var47[var59] = var89;
                                                if (var2 < var5) {
                                                   continue label91;
                                                }

                                                var5 = (var4 = aabab((byte)-15, (short)1050, 62, 1655458332)).length();
                                                var2 = 0;
                                          }

                                          byte var61 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var61, var2).getBytes(aabab((byte)-26, (short)-32535, (byte)-9, 1655458333));
                                          var47 = var6;
                                          var59 = var3++;
                                          var72 = (var7[0] & 255L) << a(-1002230444, var39 ^ 202516097)
                                             | (var7[1] & 255L) << a(-1002230445, var39 ^ 1522708365)
                                             | (var7[2] & 255L) << a(-1002230446, var39 ^ -150138392)
                                             | (var7[3] & 255L) << a(-1002230447, var39 ^ -1276441932)
                                             | (var7[4] & 255L) << a(-1002230448, var39 ^ 382939787)
                                             | (var7[5] & 255L) << a(-1002230481, var39 ^ 2015245249)
                                             | (var7[a(-1002230482, var39 ^ -1512799350)] & 255L) << a(-1002230483, var39 ^ 859645377)
                                             | var7[a(-1002230484, var39 ^ 609299893)] & 255L;
                                          var86 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var46[var56] = var89;
                                 if (var10 < var13) {
                                    continue label101;
                                 }

                                 var13 = (var12 = aabab((byte)-119, (short)13890, (byte)-25, 1655458320)).length();
                                 var10 = 0;
                           }

                           byte var58 = var10;
                           var10 += 8;
                           var15 = var12.substring(var58, var10).getBytes(aabab((byte)16, 5109, (byte)107, 1655458321));
                           var46 = var14;
                           var56 = var11++;
                           var70 = (var15[0] & 255L) << a(-1002230452, var39 ^ -1357705086)
                              | (var15[1] & 255L) << a(-1002230453, var39 ^ -1680173314)
                              | (var15[2] & 255L) << a(-1002230454, var39 ^ 1461402750)
                              | (var15[3] & 255L) << a(-1002230455, var39 ^ -1912716094)
                              | (var15[4] & 255L) << a(-1002230456, var39 ^ 759120542)
                              | (var15[5] & 255L) << a(-1002230457, var39 ^ -434750225)
                              | (var15[a(-1002230458, var39 ^ -89665898)] & 255L) << a(-1002230459, var39 ^ 366504726)
                              | var15[a(-1002230460, var39 ^ 450820886)] & 255L;
                           var84 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var83;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label127;
                  }

                  var20 = (var18 = aabab((byte)-38, (short)-14791, (byte)11, 1655458325)).length();
                  var17 = a(-1002230432, var39 ^ -500620683);
                  var43 = -1;
            }

            var10000 = var18.substring(++var43, var43 + var17);
            var10001 = 0;
         }
      }
   }

   private void ab(String var1) {
      this.bab = null;
      int var10000 = aabbabbab.ab;
      this.aaba(var1);
      int var2 = var10000;
      Path var3 = baa();

      try {
         if (var2 != 0 || var3 == null) {
            return;
         }
      } catch (Exception var6) {
         throw var6;
      }

      try {
         Files.deleteIfExists(var3);
      } catch (Exception var5) {
      }
   }

   private static String ba() {
      return null;
   }

   private static JsonObject bb(String param0) {
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
      // 06: ifne 1f
      // 09: ifnonnull 15
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: goto 22
      // 14: athrow
      // 15: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aabb Lcom/google/gson/Gson;
      // 18: aload 0
      // 19: ldc_w com/google/gson/JsonObject
      // 1c: invokevirtual com/google/gson/Gson.fromJson (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 1f: checkcast com/google/gson/JsonObject
      // 22: areturn
      // 23: astore 2
      // 24: aload 2
      // 25: pop
      // 26: aconst_null
      // 27: areturn
   }

   private static String aaa(int var0, int var1) {
      int var9 = -1312517521;
      int var2 = (var0 ^ a(-1002230681, var9 ^ -852278278)) & a(-1002230682, var9 ^ -1555153203);
      if (abaa[var2] == null) {
         char[] var3 = baaa[var2].toCharArray();

         int var4 = switch (var3[0] & a(-1002230683, var9 ^ 125135954)) {
            case 0 -> a(-1002230684, var9 ^ 1975142183);
            case 1 -> a(-1002230685, var9 ^ 2000725148);
            case 2 -> a(-1002230686, var9 ^ -418191085);
            case 3 -> a(-1002230687, var9 ^ -12509131);
            case 4 -> a(-1002230688, var9 ^ 2033969336);
            case 5 -> a(-1002230657, var9 ^ -1581866212);
            case 6 -> a(-1002230658, var9 ^ -1878000792);
            case 7 -> a(-1002230659, var9 ^ 181176300);
            case 8 -> a(-1002230660, var9 ^ 1985282972);
            case 9 -> a(-1002230661, var9 ^ -310629769);
            case 10 -> a(-1002230662, var9 ^ 1106536502);
            case 11 -> a(-1002230663, var9 ^ -1374744825);
            case 12 -> a(-1002230664, var9 ^ -229650660);
            case 13 -> a(-1002230665, var9 ^ 1147341170);
            case 14 -> a(-1002230666, var9 ^ 705800050);
            case 15 -> a(-1002230667, var9 ^ -281475210);
            case 16 -> a(-1002230668, var9 ^ 12847003);
            case 17 -> a(-1002230669, var9 ^ -465291427);
            case 18 -> a(-1002230670, var9 ^ -2067658232);
            case 19 -> a(-1002230671, var9 ^ 1948815087);
            case 20 -> a(-1002230672, var9 ^ -1009637263);
            case 21 -> a(-1002230705, var9 ^ 349081006);
            case 22 -> a(-1002230706, var9 ^ 2020142685);
            case 23 -> a(-1002230707, var9 ^ -1279489169);
            case 24 -> a(-1002230708, var9 ^ 1543504870);
            case 25 -> a(-1002230709, var9 ^ -352371398);
            case 26 -> a(-1002230710, var9 ^ -1221485482);
            case 27 -> a(-1002230711, var9 ^ -293975861);
            case 28 -> a(-1002230712, var9 ^ 1026525353);
            case 29 -> a(-1002230713, var9 ^ -966500966);
            case 30 -> 5;
            case 31 -> a(-1002230714, var9 ^ 281017665);
            case 32 -> a(-1002230715, var9 ^ -940833990);
            case 33 -> a(-1002230716, var9 ^ -153456344);
            case 34 -> a(-1002230717, var9 ^ 1287015682);
            case 35 -> a(-1002230718, var9 ^ 267384146);
            case 36 -> a(-1002230719, var9 ^ -1587352249);
            case 37 -> a(-1002230720, var9 ^ 1656840469);
            case 38 -> a(-1002230689, var9 ^ 1254124778);
            case 39 -> a(-1002230690, var9 ^ 1729604794);
            case 40 -> a(-1002230691, var9 ^ -954590261);
            case 41 -> a(-1002230692, var9 ^ 499668733);
            case 42 -> a(-1002230693, var9 ^ -1999577220);
            case 43 -> a(-1002230694, var9 ^ -409408828);
            case 44 -> a(-1002230695, var9 ^ -498694049);
            case 45 -> a(-1002230696, var9 ^ 844683285);
            case 46 -> 4;
            case 47 -> a(-1002230697, var9 ^ 2011587277);
            case 48 -> a(-1002230698, var9 ^ -397244898);
            case 49 -> a(-1002230699, var9 ^ -362936756);
            case 50 -> a(-1002230700, var9 ^ 730934066);
            case 51 -> a(-1002230701, var9 ^ 898103585);
            case 52 -> a(-1002230702, var9 ^ 1145641562);
            case 53 -> a(-1002230703, var9 ^ -1621418511);
            case 54 -> a(-1002230704, var9 ^ 1047335075);
            case 55 -> a(-1002230737, var9 ^ -316560631);
            case 56 -> a(-1002230738, var9 ^ -1401639799);
            case 57 -> a(-1002230739, var9 ^ -464590077);
            case 58 -> a(-1002230740, var9 ^ 316135412);
            case 59 -> a(-1002230741, var9 ^ -1537868090);
            case 60 -> a(-1002230742, var9 ^ 765571381);
            case 61 -> a(-1002230743, var9 ^ -691435940);
            case 62 -> a(-1002230744, var9 ^ 280847725);
            case 63 -> a(-1002230745, var9 ^ -252617754);
            case 64 -> a(-1002230746, var9 ^ 382216206);
            case 65 -> a(-1002230747, var9 ^ -63171439);
            case 66 -> a(-1002230748, var9 ^ 1737162652);
            case 67 -> a(-1002230749, var9 ^ 1556608747);
            case 68 -> a(-1002230750, var9 ^ -730829608);
            case 69 -> a(-1002230751, var9 ^ -1279525998);
            case 70 -> a(-1002230752, var9 ^ 331763811);
            case 71 -> a(-1002230721, var9 ^ 32888873);
            case 72 -> a(-1002230722, var9 ^ 562413167);
            case 73 -> a(-1002230723, var9 ^ 1517025350);
            case 74 -> a(-1002230724, var9 ^ -1242035780);
            case 75 -> a(-1002230725, var9 ^ 583488633);
            case 76 -> a(-1002230726, var9 ^ 1418188948);
            case 77 -> a(-1002230727, var9 ^ 913848819);
            case 78 -> a(-1002230728, var9 ^ -1826170836);
            case 79 -> a(-1002230729, var9 ^ -672783621);
            case 80 -> a(-1002230730, var9 ^ -1590362367);
            case 81 -> a(-1002230731, var9 ^ -356928615);
            case 82 -> a(-1002230732, var9 ^ -1946627339);
            case 83 -> a(-1002230733, var9 ^ -1855514933);
            case 84 -> a(-1002230734, var9 ^ -1467873921);
            case 85 -> a(-1002230735, var9 ^ -1746992707);
            case 86 -> a(-1002230736, var9 ^ -1528312676);
            case 87 -> a(-1002230769, var9 ^ 929024626);
            case 88 -> a(-1002230770, var9 ^ -154819203);
            case 89 -> a(-1002230771, var9 ^ -2085127130);
            case 90 -> a(-1002230772, var9 ^ -2010098396);
            case 91 -> a(-1002230773, var9 ^ 1986377870);
            case 92 -> a(-1002230774, var9 ^ 419309548);
            case 93 -> a(-1002230775, var9 ^ 1166393986);
            case 94 -> a(-1002230776, var9 ^ 1780465705);
            case 95 -> a(-1002230777, var9 ^ -958791043);
            case 96 -> a(-1002230778, var9 ^ 2011866641);
            case 97 -> a(-1002230779, var9 ^ -512187061);
            case 98 -> a(-1002230780, var9 ^ 802063210);
            case 99 -> a(-1002230781, var9 ^ 1650328908);
            case 100 -> a(-1002230782, var9 ^ -1729212822);
            case 101 -> a(-1002230783, var9 ^ -705228447);
            case 102 -> a(-1002230784, var9 ^ 910370492);
            case 103 -> a(-1002230753, var9 ^ -1229019781);
            case 104 -> a(-1002230754, var9 ^ 1222265225);
            case 105 -> a(-1002230755, var9 ^ -134636993);
            case 106 -> a(-1002230756, var9 ^ 1809634697);
            case 107 -> a(-1002230757, var9 ^ -1429753108);
            case 108 -> a(-1002230758, var9 ^ -1994677929);
            case 109 -> a(-1002230759, var9 ^ -1000968671);
            case 110 -> a(-1002230760, var9 ^ -1193499616);
            case 111 -> a(-1002230761, var9 ^ 1585027023);
            case 112 -> a(-1002230762, var9 ^ -1535879732);
            case 113 -> a(-1002230763, var9 ^ 756383499);
            case 114 -> a(-1002230764, var9 ^ 218220605);
            case 115 -> a(-1002230765, var9 ^ -1247336529);
            case 116 -> a(-1002230766, var9 ^ -892507571);
            case 117 -> a(-1002230767, var9 ^ 2005668538);
            case 118 -> a(-1002230768, var9 ^ -1724354912);
            case 119 -> a(-1002230545, var9 ^ -1913859899);
            case 120 -> a(-1002230546, var9 ^ 278715306);
            case 121 -> 1;
            case 122 -> a(-1002230547, var9 ^ -183711003);
            case 123 -> a(-1002230548, var9 ^ -1530978928);
            case 124 -> a(-1002230549, var9 ^ 552221740);
            case 125 -> a(-1002230550, var9 ^ -830976772);
            case 126 -> a(-1002230551, var9 ^ 885516085);
            case 127 -> a(-1002230552, var9 ^ 70243781);
            case 128 -> a(-1002230553, var9 ^ 604499394);
            case 129 -> a(-1002230554, var9 ^ -1710163909);
            case 130 -> a(-1002230555, var9 ^ 633412473);
            case 131 -> a(-1002230556, var9 ^ 1687861928);
            case 132 -> a(-1002230557, var9 ^ 522387592);
            case 133 -> a(-1002230558, var9 ^ 2107826259);
            case 134 -> a(-1002230559, var9 ^ 1413907603);
            case 135 -> a(-1002230560, var9 ^ 1043186988);
            case 136 -> a(-1002230529, var9 ^ 1997744874);
            case 137 -> a(-1002230530, var9 ^ 1958533780);
            case 138 -> a(-1002230531, var9 ^ -1546736089);
            case 139 -> a(-1002230532, var9 ^ 538749259);
            case 140 -> a(-1002230533, var9 ^ -1874552096);
            case 141 -> a(-1002230534, var9 ^ -623028037);
            case 142 -> a(-1002230535, var9 ^ 2080942239);
            case 143 -> a(-1002230536, var9 ^ 8062158);
            case 144 -> a(-1002230537, var9 ^ 1717753017);
            case 145 -> a(-1002230538, var9 ^ 1719315970);
            case 146 -> a(-1002230539, var9 ^ 1113340245);
            case 147 -> a(-1002230540, var9 ^ 2012138549);
            case 148 -> a(-1002230541, var9 ^ 297819558);
            case 149 -> a(-1002230542, var9 ^ 15340278);
            case 150 -> a(-1002230543, var9 ^ 1313878938);
            case 151 -> a(-1002230544, var9 ^ -1794746696);
            case 152 -> a(-1002230577, var9 ^ 573524739);
            case 153 -> a(-1002230578, var9 ^ -170674018);
            case 154 -> a(-1002230579, var9 ^ 640959078);
            case 155 -> a(-1002230580, var9 ^ 1549786041);
            case 156 -> a(-1002230581, var9 ^ -809035597);
            case 157 -> a(-1002230582, var9 ^ -1174970829);
            case 158 -> a(-1002230583, var9 ^ 1999930014);
            case 159 -> a(-1002230584, var9 ^ 108719616);
            case 160 -> a(-1002230585, var9 ^ 1781502473);
            case 161 -> a(-1002230586, var9 ^ -1254988917);
            case 162 -> a(-1002230587, var9 ^ 420191021);
            case 163 -> a(-1002230588, var9 ^ -1834242020);
            case 164 -> a(-1002230589, var9 ^ 1775795541);
            case 165 -> a(-1002230590, var9 ^ 150137161);
            case 166 -> a(-1002230591, var9 ^ 1956044387);
            case 167 -> a(-1002230592, var9 ^ 939455553);
            case 168 -> a(-1002230561, var9 ^ -349711330);
            case 169 -> a(-1002230562, var9 ^ 1485426541);
            case 170 -> a(-1002230563, var9 ^ -1919302499);
            case 171 -> a(-1002230564, var9 ^ 320116911);
            case 172 -> a(-1002230565, var9 ^ -45846298);
            case 173 -> a(-1002230566, var9 ^ -587716372);
            case 174 -> a(-1002230567, var9 ^ -1496293727);
            case 175 -> a(-1002230568, var9 ^ 1448156147);
            case 176 -> a(-1002230569, var9 ^ -2085126246);
            case 177 -> a(-1002230570, var9 ^ -1927083358);
            case 178 -> a(-1002230571, var9 ^ 1117881183);
            case 179 -> a(-1002230572, var9 ^ 624033614);
            case 180 -> a(-1002230573, var9 ^ -1176316810);
            case 181 -> a(-1002230574, var9 ^ 544290249);
            case 182 -> a(-1002230575, var9 ^ -173277125);
            case 183 -> 0;
            case 184 -> a(-1002230576, var9 ^ -134529033);
            case 185 -> a(-1002230609, var9 ^ -322867155);
            case 186 -> a(-1002230610, var9 ^ 1326658655);
            case 187 -> a(-1002230611, var9 ^ 1141745978);
            case 188 -> a(-1002230612, var9 ^ -1890845346);
            case 189 -> a(-1002230613, var9 ^ 1267990913);
            case 190 -> a(-1002230614, var9 ^ -2142555945);
            case 191 -> a(-1002230615, var9 ^ 911132947);
            case 192 -> a(-1002230616, var9 ^ -329398538);
            case 193 -> a(-1002230617, var9 ^ -984907562);
            case 194 -> a(-1002230618, var9 ^ -1435358550);
            case 195 -> a(-1002230619, var9 ^ -192058877);
            case 196 -> a(-1002230620, var9 ^ 1939257177);
            case 197 -> 2;
            case 198 -> 3;
            case 199 -> a(-1002230621, var9 ^ 260831925);
            case 200 -> a(-1002230622, var9 ^ 1328585028);
            case 201 -> a(-1002230623, var9 ^ 717863367);
            case 202 -> a(-1002230624, var9 ^ 1311874209);
            case 203 -> a(-1002230593, var9 ^ 1602644347);
            case 204 -> a(-1002230594, var9 ^ -533792594);
            case 205 -> a(-1002230595, var9 ^ 1227955962);
            case 206 -> a(-1002230596, var9 ^ 1722014965);
            case 207 -> a(-1002230597, var9 ^ -1808951144);
            case 208 -> a(-1002230598, var9 ^ -1927405775);
            case 209 -> a(-1002230599, var9 ^ 1583233401);
            case 210 -> a(-1002230600, var9 ^ 595236374);
            case 211 -> a(-1002230601, var9 ^ 94821183);
            case 212 -> a(-1002230602, var9 ^ -1389652702);
            case 213 -> a(-1002230603, var9 ^ 784868654);
            case 214 -> a(-1002230604, var9 ^ 937584340);
            case 215 -> a(-1002230605, var9 ^ 1288477128);
            case 216 -> a(-1002230606, var9 ^ 1064693267);
            case 217 -> a(-1002230607, var9 ^ -240449853);
            case 218 -> a(-1002230608, var9 ^ 219273709);
            case 219 -> a(-1002230641, var9 ^ 114091359);
            case 220 -> a(-1002230642, var9 ^ -1980134660);
            case 221 -> a(-1002230643, var9 ^ -1767790341);
            case 222 -> a(-1002230644, var9 ^ 1520388895);
            case 223 -> a(-1002230645, var9 ^ 415449333);
            case 224 -> a(-1002230646, var9 ^ 1616869108);
            case 225 -> a(-1002230647, var9 ^ 491411611);
            case 226 -> a(-1002230648, var9 ^ 74022775);
            case 227 -> a(-1002230649, var9 ^ 1658219935);
            case 228 -> a(-1002230650, var9 ^ 108359169);
            case 229 -> a(-1002230651, var9 ^ -704405903);
            case 230 -> a(-1002230652, var9 ^ 210069577);
            case 231 -> a(-1002230653, var9 ^ 407019654);
            case 232 -> a(-1002230654, var9 ^ 1010602513);
            case 233 -> a(-1002230655, var9 ^ 628032994);
            case 234 -> a(-1002230656, var9 ^ 1357067883);
            case 235 -> a(-1002230625, var9 ^ -1159073354);
            case 236 -> a(-1002230626, var9 ^ -761258658);
            case 237 -> a(-1002230627, var9 ^ -255619406);
            case 238 -> a(-1002230628, var9 ^ 1044777444);
            case 239 -> a(-1002230629, var9 ^ 2102431622);
            case 240 -> a(-1002230630, var9 ^ -169554676);
            case 241 -> a(-1002230631, var9 ^ 1420883015);
            case 242 -> a(-1002230632, var9 ^ -459322892);
            case 243 -> a(-1002230633, var9 ^ 1555246329);
            case 244 -> a(-1002230634, var9 ^ -461371610);
            case 245 -> a(-1002230635, var9 ^ 2138726799);
            case 246 -> a(-1002230636, var9 ^ -1755552232);
            case 247 -> a(-1002230637, var9 ^ -177025069);
            case 248 -> a(-1002230638, var9 ^ 665073433);
            case 249 -> a(-1002230639, var9 ^ 374993934);
            case 250 -> a(-1002230640, var9 ^ -1863807567);
            case 251 -> a(-1002230417, var9 ^ -631592372);
            case 252 -> a(-1002230418, var9 ^ 24803543);
            case 253 -> a(-1002230419, var9 ^ 1008326565);
            case 254 -> a(-1002230420, var9 ^ 296671195);
            default -> a(-1002230421, var9 ^ 1065121726);
         };
         int var5 = (var1 & a(-1002230422, var9 ^ 848068316)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-1002230423, var9 ^ 1467653573)) >>> a(-1002230424, var9 ^ -278622691)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-1002230425, var9 ^ -861899629);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-1002230426, var9 ^ -513175396);
            }
         }

         abaa[var2] = new String(var3).intern();
      }

      return abaa[var2];
   }

   public boolean aab() {
      try {
         if (this.aa == null) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      return false;
   }

   public boolean aba() {
      try {
         if (this.aa == null) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      return false;
   }

   public aabbaabab() {
      this.bbb = aabbaabab::ba;
      this.aaaa = abaabbb.b;
      this.abbb = "";
   }

   private static String abb(JsonObject param0, String param1, int param2) {
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
      // 22: ifnull 50
      // 25: goto 29
      // 28: athrow
      // 29: aload 4
      // 2b: iload 3
      // 2c: ifne 3f
      // 2f: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 32: ifeq 50
      // 35: goto 39
      // 38: athrow
      // 39: aload 4
      // 3b: goto 3f
      // 3e: athrow
      // 3f: iload 3
      // 40: ifne 55
      // 43: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 46: invokevirtual com/google/gson/JsonPrimitive.isString ()Z
      // 49: ifne 53
      // 4c: goto 50
      // 4f: athrow
      // 50: aconst_null
      // 51: areturn
      // 52: athrow
      // 53: aload 4
      // 55: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 58: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 5b: astore 5
      // 5d: aload 5
      // 5f: iload 3
      // 60: ifne 73
      // 63: invokevirtual java/lang/String.isEmpty ()Z
      // 66: ifne 8e
      // 69: goto 6d
      // 6c: athrow
      // 6d: aload 5
      // 6f: goto 73
      // 72: athrow
      // 73: iload 3
      // 74: ifne 88
      // 77: invokevirtual java/lang/String.length ()I
      // 7a: iload 2
      // 7b: if_icmpgt 8e
      // 7e: goto 82
      // 81: athrow
      // 82: aload 5
      // 84: goto 88
      // 87: athrow
      // 88: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaab (Ljava/lang/String;)Z
      // 8b: ifne 93
      // 8e: aconst_null
      // 8f: goto 95
      // 92: athrow
      // 93: aload 5
      // 95: areturn
   }

   private static Path baa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa.ab ()Ljava/nio/file/Path;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 1a
      // 0d: ifnonnull 19
      // 10: goto 14
      // 13: athrow
      // 14: aconst_null
      // 15: goto 3f
      // 18: athrow
      // 19: aload 1
      // 1a: ldc_w -1002230428
      // 1d: ldc_w 1570449460
      // 20: ldc_w -1837182058
      // 23: ixor
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 27: ldc_w -1002230429
      // 2a: ldc_w 1570449460
      // 2d: ldc_w 1328628795
      // 30: ixor
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 3a: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 3f: areturn
   }

   private void bab() {
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
      // 06: ifne 16
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa Z
      // 0c: ifeq 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: bipush 1
      // 17: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa Z
      // 1a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.baa ()Ljava/nio/file/Path;
      // 1d: astore 2
      // 1e: aload 2
      // 1f: iload 1
      // 20: ifne 2b
      // 23: ifnull 3d
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 2
      // 2b: iload 1
      // 2c: ifne 40
      // 2f: bipush 0
      // 30: anewarray 1005
      // 33: invokestatic java/nio/file/Files.isRegularFile (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 36: ifne 3f
      // 39: goto 3d
      // 3c: athrow
      // 3d: return
      // 3e: athrow
      // 3f: aload 2
      // 40: iload 1
      // 41: ifne 64
      // 44: invokestatic java/nio/file/Files.size (Ljava/nio/file/Path;)J
      // 47: ldc_w -1002230489
      // 4a: ldc_w -757390384
      // 4d: ldc_w -1162689063
      // 50: ixor
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 54: ldc2_w 6528746449495967762
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.baaa (IJ)J
      // 5a: lcmp
      // 5b: ifle 63
      // 5e: goto 62
      // 61: athrow
      // 62: return
      // 63: aload 2
      // 64: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 67: invokestatic java/nio/file/Files.readString (Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;
      // 6a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 6d: astore 3
      // 6e: aload 3
      // 6f: iload 1
      // 70: ifne 82
      // 73: invokevirtual java/lang/String.isEmpty ()Z
      // 76: ifne 98
      // 79: goto 7d
      // 7c: athrow
      // 7d: aload 3
      // 7e: goto 82
      // 81: athrow
      // 82: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaab (Ljava/lang/String;)Z
      // 85: ifeq 98
      // 88: aload 0
      // 89: aload 3
      // 8a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bab Ljava/lang/String;
      // 8d: aload 0
      // 8e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 91: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 94: goto 98
      // 97: athrow
      // 98: goto 9c
      // 9b: astore 3
      // 9c: return
   }

   private static int bba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1002230490, -767587332 ^ 429322580);
      if (bba[var3] == null) {
         bba[var3] = (int)(aab[var3] ^ var1);
      }

      return bba[var3];
   }

   private static String bbb() {
      return null;
   }

   private static String aaaa() {
      return aabbaaaba.abba(aaa(a(-1002230491, -742617909 ^ 1568683138), a(-1002230492, -742617909 ^ -1211295461)));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static JsonObject aaab(String var0) {
      int var1 = aabbabbab.ab;

      label31: {
         label30: {
            String var10000;
            label29: {
               try {
                  var10000 = var0;
                  if (var1 != 0) {
                     break label29;
                  }

                  if (var0 == null) {
                     break label30;
                  }
               } catch (RuntimeException var5) {
                  throw var5;
               }

               var10000 = var0;
            }

            try {
               if (!var10000.isBlank()) {
                  break label31;
               }
            } catch (RuntimeException var4) {
               throw var4;
            }
         }

         try {
            return null;
         } catch (RuntimeException var3) {
            throw var3;
         }
      }

      JsonObject var2 = new JsonObject();
      var2.addProperty(
         aabbaaaba.abba(aaa(a(-1002230493, -1982752091 ^ -1411459322), a(-1002230494, -1982752091 ^ 304039938))), var0
      );
      return var2;
   }

   private void aaba(String var1) {
      int var10000 = aabbabbab.ab;
      this.aaaa = abaabbb.b;
      int var2 = var10000;

      String var10001;
      label22: {
         label21: {
            try {
               this.bbaa = null;
               this.abab = null;
               this.bb = false;
               var4 = this;
               var10001 = var1;
               if (var2 != 0) {
                  break label22;
               }

               if (var1 == null) {
                  break label21;
               }
            } catch (RuntimeException var3) {
               throw var3;
            }

            var10001 = var1;
            break label22;
         }

         var10001 = "";
      }

      var4.abbb = var10001;
   }

   private static String aabab(byte var0, short var1, byte var2, int var3) {
      int var8 = var3 ^ 1655458324;
      char[] var7 = bbba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])bbbb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         bbbb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 34563;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 28) {
            default -> 169;
            case 1 -> 40;
            case 2 -> 35;
            case 3 -> 75;
            case 4 -> 184;
            case 5 -> 102;
            case 6 -> 52;
            case 7 -> 133;
            case 8 -> 171;
            case 9 -> 255;
            case 10 -> 85;
            case 11 -> 215;
            case 12 -> 38;
            case 13 -> 102;
            case 14 -> 44;
            case 15 -> 175;
            case 16 -> 147;
            case 17 -> 12;
            case 18 -> 204;
            case 19 -> 172;
            case 20 -> 148;
            case 21 -> 211;
            case 22 -> 160;
            case 23 -> 76;
            case 24 -> 194;
            case 25 -> 169;
            case 26 -> 198;
            case 27 -> 243;
         } ^ var6 ^ 4965 ^ var0 ^ var3 ^ var1 ^ var5 ^ var2);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   public void aabb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabab;
      // 0c: ifnonnull 21
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 1e: if_acmpeq 23
      // 21: return
      // 22: athrow
      // 23: invokestatic java/lang/System.currentTimeMillis ()J
      // 26: lstore 3
      // 27: iload 2
      // 28: ifne 41
      // 2b: lload 3
      // 2c: aload 0
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaba J
      // 30: lcmp
      // 31: ifle 42
      // 34: goto 38
      // 37: athrow
      // 38: aload 0
      // 39: aconst_null
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaba (Ljava/lang/String;)V
      // 3d: goto 41
      // 40: athrow
      // 41: return
      // 42: aload 0
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bbaa Ljava/lang/String;
      // 46: astore 5
      // 48: aload 5
      // 4a: ifnull 6d
      // 4d: aload 0
      // 4e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaab Z
      // 51: iload 2
      // 52: ifne 6a
      // 55: goto 59
      // 58: athrow
      // 59: ifne 6d
      // 5c: goto 60
      // 5f: athrow
      // 60: lload 3
      // 61: aload 0
      // 62: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.ab J
      // 65: lcmp
      // 66: goto 6a
      // 69: athrow
      // 6a: ifge 6e
      // 6d: return
      // 6e: aload 0
      // 6f: bipush 1
      // 70: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaab Z
      // 73: aload 0
      // 74: lload 3
      // 75: ldc_w -1002230495
      // 78: ldc_w -626808259
      // 7b: ldc_w 1606843089
      // 7e: ixor
      // 7f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 82: ldc2_w 6893850060420054042
      // 85: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.baaa (IJ)J
      // 88: ladd
      // 89: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.ab J
      // 8c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa ()Ljava/lang/String;
      // 8f: ldc_w -1002230496
      // 92: ldc_w -626808259
      // 95: ldc_w 1625708291
      // 98: ixor
      // 99: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 9c: ldc_w -1002230465
      // 9f: ldc_w -626808259
      // a2: ldc_w -1865854753
      // a5: ixor
      // a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // af: aload 5
      // b1: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // b4: invokestatic java/net/URLEncoder.encode (Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
      // b7: astore 9
      // b9: astore 8
      // bb: astore 7
      // bd: new java/lang/StringBuilder
      // c0: dup
      // c1: invokespecial java/lang/StringBuilder.<init> ()V
      // c4: aload 7
      // c6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // c9: aload 8
      // cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // ce: aload 9
      // d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // d3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d6: astore 6
      // d8: aload 0
      // d9: aload 6
      // db: aload 5
      // dd: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abba (Ljava/lang/String;Ljava/lang/String;)V, ()V ]
      // e2: invokestatic java/util/concurrent/CompletableFuture.runAsync (Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;
      // e5: pop
      // e6: return
   }

   public String abaa() {
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
      // 06: ifne 1c
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bb Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: athrow
      // 16: aload 0
      // 17: bipush 0
      // 18: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bb Z
      // 1b: aload 0
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abab Ljava/lang/String;
      // 1f: areturn
   }

   public void abab() {
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
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabab;
      // 0c: ifnonnull 29
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: iload 1
      // 19: ifne 3a
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 1f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 22: if_acmpne 2b
      // 25: goto 29
      // 28: athrow
      // 29: return
      // 2a: athrow
      // 2b: aload 0
      // 2c: ldc_w ""
      // 2f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abbb Ljava/lang/String;
      // 32: aload 0
      // 33: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 36: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 39: aload 0
      // 3a: invokestatic java/lang/System.currentTimeMillis ()J
      // 3d: ldc_w -1002230466
      // 40: ldc_w -1468189005
      // 43: ldc_w 612211487
      // 46: ixor
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 4a: ldc2_w 5950415390500920312
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.baaa (IJ)J
      // 50: ladd
      // 51: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaba J
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa ()Ljava/lang/String;
      // 57: ldc_w -1002230467
      // 5a: ldc_w -1468189005
      // 5d: ldc_w 1862200952
      // 60: ixor
      // 61: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 64: ldc_w -1002230468
      // 67: ldc_w -1468189005
      // 6a: ldc_w 283937661
      // 6d: ixor
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 71: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 74: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 77: astore 4
      // 79: astore 3
      // 7a: new java/lang/StringBuilder
      // 7d: dup
      // 7e: invokespecial java/lang/StringBuilder.<init> ()V
      // 81: aload 3
      // 82: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 85: aload 4
      // 87: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8d: astore 2
      // 8e: aload 0
      // 8f: aload 2
      // 90: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab;Ljava/lang/String;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.b (Ljava/lang/String;)V, ()V ]
      // 95: invokestatic java/util/concurrent/CompletableFuture.runAsync (Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;
      // 98: pop
      // 99: return
   }

   private static int a(int var0, int var1) {
      int var2 = bbab[var0 ^ -1002230673] ^ var1 ^ var0;
      var2 += 22624;
      var2 -= 20196;
      var2 += 19225;
      var2 -= 50915;
      var2 ^= 5764;
      return var2 + 11566;
   }

   private void abba(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1844223152
      // 003: istore 7
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: istore 3
      // 009: aload 0
      // 00a: ldc_w -1002230469
      // 00d: iload 7
      // 00f: ldc_w 1992102566
      // 012: ixor
      // 013: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 016: ldc_w -1002230470
      // 019: iload 7
      // 01b: ldc_w 288241237
      // 01e: ixor
      // 01f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 022: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 025: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 028: aload 1
      // 029: aconst_null
      // 02a: aconst_null
      // 02b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bbaa (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab;
      // 02e: astore 4
      // 030: iload 3
      // 031: ifne 05e
      // 034: aload 0
      // 035: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 038: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 03b: if_acmpne 059
      // 03e: goto 042
      // 041: athrow
      // 042: aload 2
      // 043: aload 0
      // 044: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bbaa Ljava/lang/String;
      // 047: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 04a: iload 3
      // 04b: ifne 06c
      // 04e: goto 052
      // 051: athrow
      // 052: ifne 05f
      // 055: goto 059
      // 058: athrow
      // 059: aload 0
      // 05a: bipush 0
      // 05b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaab Z
      // 05e: return
      // 05f: aload 4
      // 061: iload 3
      // 062: ifne 087
      // 065: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.ba ()I
      // 068: goto 06c
      // 06b: athrow
      // 06c: ldc_w -1002230471
      // 06f: iload 7
      // 071: ldc_w -1396666689
      // 074: ixor
      // 075: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 078: ldc2_w 6744918968306437916
      // 07b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 07e: if_icmpeq 0bb
      // 081: aload 4
      // 083: goto 087
      // 086: athrow
      // 087: iload 3
      // 088: ifne 09b
      // 08b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.ba ()I
      // 08e: ifeq 0bb
      // 091: goto 095
      // 094: athrow
      // 095: aload 4
      // 097: goto 09b
      // 09a: athrow
      // 09b: iload 3
      // 09c: ifne 0c3
      // 09f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.ba ()I
      // 0a2: ldc_w -1002230472
      // 0a5: iload 7
      // 0a7: ldc_w 478026856
      // 0aa: ixor
      // 0ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 0ae: ldc2_w 8474592989685724844
      // 0b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 0b4: if_icmplt 0c1
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: bipush 0
      // 0bd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaab Z
      // 0c0: return
      // 0c1: aload 4
      // 0c3: iload 3
      // 0c4: ifne 0d7
      // 0c7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.ab ()Z
      // 0ca: ifeq 113
      // 0cd: goto 0d1
      // 0d0: athrow
      // 0d1: aload 4
      // 0d3: goto 0d7
      // 0d6: athrow
      // 0d7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.aa ()Ljava/lang/String;
      // 0da: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bb (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 0dd: ldc_w -1002230473
      // 0e0: iload 7
      // 0e2: ldc_w 719617833
      // 0e5: ixor
      // 0e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 0e9: ldc_w -1002230474
      // 0ec: iload 7
      // 0ee: ldc_w 305619173
      // 0f1: ixor
      // 0f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 0f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0fb: ldc_w -1002230475
      // 0fe: iload 7
      // 100: ldc_w 1285256209
      // 103: ixor
      // 104: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 107: ldc2_w 3831865284123467729
      // 10a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abb (Lcom/google/gson/JsonObject;Ljava/lang/String;I)Ljava/lang/String;
      // 110: goto 114
      // 113: aconst_null
      // 114: astore 5
      // 116: iload 3
      // 117: ifne 159
      // 11a: aload 5
      // 11c: ifnonnull 132
      // 11f: goto 123
      // 122: athrow
      // 123: aload 0
      // 124: aload 4
      // 126: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.bb ()Ljava/lang/String;
      // 129: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaba (Ljava/lang/String;)V
      // 12c: aload 0
      // 12d: bipush 0
      // 12e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaab Z
      // 131: return
      // 132: aload 0
      // 133: aload 5
      // 135: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bab Ljava/lang/String;
      // 138: aload 0
      // 139: aconst_null
      // 13a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bbaa Ljava/lang/String;
      // 13d: aload 0
      // 13e: aconst_null
      // 13f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abab Ljava/lang/String;
      // 142: aload 0
      // 143: bipush 0
      // 144: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bb Z
      // 147: aload 0
      // 148: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 14b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 14e: aload 0
      // 14f: aload 5
      // 151: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaabb (Ljava/lang/String;)V
      // 154: aload 0
      // 155: bipush 0
      // 156: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaab Z
      // 159: goto 166
      // 15c: astore 6
      // 15e: aload 0
      // 15f: bipush 0
      // 160: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaab Z
      // 163: aload 6
      // 165: athrow
      // 166: return
   }

   public void abbb() {
      this.ab(null);
   }

   private static long baaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1002230476, -1461276140 ^ -835690822)) & a(-1002230477, -1461276140 ^ 1597321754);
      if (abba[var3] == null) {
         abba[var3] = a[var3] ^ var1;
      }

      return abba[var3];
   }

   private void b(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1367175906
      // 003: istore 7
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: aload 0
      // 009: ldc_w -1002230478
      // 00c: iload 7
      // 00e: ldc_w 2070772318
      // 011: ixor
      // 012: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 015: ldc_w -1002230479
      // 018: iload 7
      // 01a: ldc_w 889529196
      // 01d: ixor
      // 01e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 021: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 024: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 027: aload 1
      // 028: ldc_w -1002230480
      // 02b: iload 7
      // 02d: ldc_w 1060220714
      // 030: ixor
      // 031: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 034: ldc_w -1002230513
      // 037: iload 7
      // 039: ldc_w -1242715982
      // 03c: ixor
      // 03d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 040: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 046: aconst_null
      // 047: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bbaa (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab;
      // 04a: astore 3
      // 04b: istore 2
      // 04c: aload 0
      // 04d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 050: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 053: if_acmpeq 058
      // 056: return
      // 057: athrow
      // 058: aload 3
      // 059: iload 2
      // 05a: ifne 06c
      // 05d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.ab ()Z
      // 060: ifeq 075
      // 063: goto 067
      // 066: athrow
      // 067: aload 3
      // 068: goto 06c
      // 06b: athrow
      // 06c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.aa ()Ljava/lang/String;
      // 06f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bb (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 072: goto 076
      // 075: aconst_null
      // 076: astore 4
      // 078: iload 2
      // 079: aload 4
      // 07b: ldc_w -1002230514
      // 07e: iload 7
      // 080: ldc_w -338111285
      // 083: ixor
      // 084: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 087: ldc_w -1002230515
      // 08a: iload 7
      // 08c: ldc_w -1049187869
      // 08f: ixor
      // 090: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 093: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 096: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 099: ldc_w -1002230516
      // 09c: iload 7
      // 09e: ldc_w -476175722
      // 0a1: ixor
      // 0a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 0a5: ldc2_w 7498241596003258875
      // 0a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 0ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abb (Lcom/google/gson/JsonObject;Ljava/lang/String;I)Ljava/lang/String;
      // 0ae: astore 5
      // 0b0: aload 4
      // 0b2: ldc_w -1002230517
      // 0b5: iload 7
      // 0b7: ldc_w 1249758741
      // 0ba: ixor
      // 0bb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 0be: ldc_w -1002230518
      // 0c1: iload 7
      // 0c3: ldc_w 690925084
      // 0c6: ixor
      // 0c7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 0ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 0cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d0: ldc_w -1002230519
      // 0d3: iload 7
      // 0d5: ldc_w -1680422186
      // 0d8: ixor
      // 0d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 0dc: ldc2_w 1249816708544863363
      // 0df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 0e2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abb (Lcom/google/gson/JsonObject;Ljava/lang/String;I)Ljava/lang/String;
      // 0e5: astore 6
      // 0e7: ifne 118
      // 0ea: aload 5
      // 0ec: ifnull 10c
      // 0ef: goto 0f3
      // 0f2: athrow
      // 0f3: aload 6
      // 0f5: iload 2
      // 0f6: ifne 106
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: ifnull 10c
      // 100: goto 104
      // 103: athrow
      // 104: aload 5
      // 106: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bbba (Ljava/lang/String;)Z
      // 109: ifne 119
      // 10c: aload 0
      // 10d: aload 3
      // 10e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.bb ()Ljava/lang/String;
      // 111: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaba (Ljava/lang/String;)V
      // 114: goto 118
      // 117: athrow
      // 118: return
      // 119: aload 0
      // 11a: aload 5
      // 11c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abab Ljava/lang/String;
      // 11f: aload 0
      // 120: aload 6
      // 122: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bbaa Ljava/lang/String;
      // 125: aload 0
      // 126: invokestatic java/lang/System.currentTimeMillis ()J
      // 129: ldc_w -1002230520
      // 12c: iload 7
      // 12e: ldc_w 985190063
      // 131: ixor
      // 132: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 135: ldc2_w 8520643786538683087
      // 138: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.baaa (IJ)J
      // 13b: ladd
      // 13c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.ab J
      // 13f: aload 0
      // 140: bipush 1
      // 141: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bb Z
      // 144: return
   }

   private JsonObject baab(String param1, String param2, String param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: aload 1
      // 05: aload 2
      // 06: aload 3
      // 07: aload 4
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bbaa (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab;
      // 0c: astore 6
      // 0e: istore 5
      // 10: aload 4
      // 12: aload 0
      // 13: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bab Ljava/lang/String;
      // 16: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 19: iload 5
      // 1b: ifne 36
      // 1e: ifne 28
      // 21: goto 25
      // 24: athrow
      // 25: aconst_null
      // 26: areturn
      // 27: athrow
      // 28: aload 6
      // 2a: iload 5
      // 2c: ifne 73
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.ba ()I
      // 32: goto 36
      // 35: athrow
      // 36: ldc_w -1002230521
      // 39: ldc_w -258057537
      // 3c: ldc_w 287555818
      // 3f: ixor
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 43: ldc2_w 1603717958363154570
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 49: if_icmpne 71
      // 4c: aload 6
      // 4e: iload 5
      // 50: ifne 73
      // 53: goto 57
      // 56: athrow
      // 57: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.a ()Ljava/lang/String;
      // 5a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aa (Ljava/lang/String;)Z
      // 5d: ifeq 71
      // 60: goto 64
      // 63: athrow
      // 64: aload 0
      // 65: aload 6
      // 67: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.bb ()Ljava/lang/String;
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.ab (Ljava/lang/String;)V
      // 6d: goto 71
      // 70: athrow
      // 71: aload 6
      // 73: iload 5
      // 75: ifne 9a
      // 78: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.ab ()Z
      // 7b: ifne 8c
      // 7e: goto 82
      // 81: athrow
      // 82: aload 6
      // 84: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.bb ()Ljava/lang/String;
      // 87: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaab (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 8a: areturn
      // 8b: athrow
      // 8c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aabb Lcom/google/gson/Gson;
      // 8f: aload 6
      // 91: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.aa ()Ljava/lang/String;
      // 94: ldc_w com/google/gson/JsonObject
      // 97: invokevirtual com/google/gson/Gson.fromJson (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 9a: checkcast com/google/gson/JsonObject
      // 9d: areturn
      // 9e: astore 7
      // a0: aload 7
      // a2: pop
      // a3: aconst_null
      // a4: areturn
   }

   public void baba() {
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
      // 06: ifne 1b
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 0f: if_acmpne 1f
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: goto 1b
      // 1a: athrow
      // 1b: aconst_null
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaba (Ljava/lang/String;)V
      // 1f: return
   }

   public boolean babb() {
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
      // 06: ifne 2f
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabab;
      // 0c: ifnull 2a
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bbb Ljava/util/function/Supplier;
      // 17: invokeinterface java/util/function/Supplier.get ()Ljava/lang/Object; 1
      // 1c: ifnull 28
      // 1f: goto 23
      // 22: athrow
      // 23: bipush 1
      // 24: goto 29
      // 27: athrow
      // 28: bipush 0
      // 29: ireturn
      // 2a: aload 0
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bab ()V
      // 2e: aload 0
      // 2f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bab Ljava/lang/String;
      // 32: ifnull 3a
      // 35: bipush 1
      // 36: goto 3b
      // 39: athrow
      // 3a: bipush 0
      // 3b: ireturn
   }

   private abbbbaab bbaa(String param1, String param2, String param3, String param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1412935915
      // 003: istore 14
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: istore 5
      // 00a: aload 2
      // 00b: invokestatic java/net/URI.create (Ljava/lang/String;)Ljava/net/URI;
      // 00e: invokestatic java/net/http/HttpRequest.newBuilder (Ljava/net/URI;)Ljava/net/http/HttpRequest$Builder;
      // 011: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.ba Ljava/time/Duration;
      // 014: invokeinterface java/net/http/HttpRequest$Builder.timeout (Ljava/time/Duration;)Ljava/net/http/HttpRequest$Builder; 2
      // 019: ldc_w -1002230522
      // 01c: iload 14
      // 01e: ldc_w -1634975050
      // 021: ixor
      // 022: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 025: ldc_w -1002230523
      // 028: iload 14
      // 02a: ldc_w 692234706
      // 02d: ixor
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 031: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 034: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 037: ldc_w -1002230524
      // 03a: iload 14
      // 03c: ldc_w 785137743
      // 03f: ixor
      // 040: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 043: ldc_w -1002230525
      // 046: iload 14
      // 048: ldc_w -766502535
      // 04b: ixor
      // 04c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 04f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 052: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 055: invokeinterface java/net/http/HttpRequest$Builder.header (Ljava/lang/String;Ljava/lang/String;)Ljava/net/http/HttpRequest$Builder; 3
      // 05a: astore 6
      // 05c: aload 4
      // 05e: iload 5
      // 060: ifne 0cd
      // 063: ifnull 0cc
      // 066: goto 06a
      // 069: athrow
      // 06a: aload 6
      // 06c: ldc_w -1002230526
      // 06f: iload 14
      // 071: ldc_w -1623527497
      // 074: ixor
      // 075: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 078: ldc_w -1002230527
      // 07b: iload 14
      // 07d: ldc_w -760017945
      // 080: ixor
      // 081: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 084: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 087: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 08a: ldc_w -1002230528
      // 08d: iload 14
      // 08f: ldc_w 822089785
      // 092: ixor
      // 093: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 096: ldc_w -1002230497
      // 099: iload 14
      // 09b: ldc_w -980223771
      // 09e: ixor
      // 09f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 0a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 0a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0a8: aload 4
      // 0aa: astore 13
      // 0ac: astore 12
      // 0ae: new java/lang/StringBuilder
      // 0b1: dup
      // 0b2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b5: aload 12
      // 0b7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0ba: aload 13
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0bf: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c2: invokeinterface java/net/http/HttpRequest$Builder.header (Ljava/lang/String;Ljava/lang/String;)Ljava/net/http/HttpRequest$Builder; 3
      // 0c7: pop
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: aload 3
      // 0cd: ifnonnull 0e5
      // 0d0: aload 6
      // 0d2: aload 1
      // 0d3: invokestatic java/net/http/HttpRequest$BodyPublishers.noBody ()Ljava/net/http/HttpRequest$BodyPublisher;
      // 0d6: invokeinterface java/net/http/HttpRequest$Builder.method (Ljava/lang/String;Ljava/net/http/HttpRequest$BodyPublisher;)Ljava/net/http/HttpRequest$Builder; 3
      // 0db: pop
      // 0dc: iload 5
      // 0de: ifeq 0f6
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: aload 6
      // 0e7: aload 1
      // 0e8: aload 3
      // 0e9: invokestatic java/net/http/HttpRequest$BodyPublishers.ofString (Ljava/lang/String;)Ljava/net/http/HttpRequest$BodyPublisher;
      // 0ec: invokeinterface java/net/http/HttpRequest$Builder.method (Ljava/lang/String;Ljava/net/http/HttpRequest$BodyPublisher;)Ljava/net/http/HttpRequest$Builder; 3
      // 0f1: pop
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: aload 0
      // 0f7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.b Ljava/net/http/HttpClient;
      // 0fa: aload 6
      // 0fc: invokeinterface java/net/http/HttpRequest$Builder.build ()Ljava/net/http/HttpRequest; 1
      // 101: invokestatic java/net/http/HttpResponse$BodyHandlers.ofInputStream ()Ljava/net/http/HttpResponse$BodyHandler;
      // 104: invokevirtual java/net/http/HttpClient.send (Ljava/net/http/HttpRequest;Ljava/net/http/HttpResponse$BodyHandler;)Ljava/net/http/HttpResponse;
      // 107: astore 7
      // 109: aload 7
      // 10b: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 110: checkcast java/io/InputStream
      // 113: astore 9
      // 115: aload 9
      // 117: ldc_w -1002230498
      // 11a: iload 14
      // 11c: ldc_w -235239041
      // 11f: ixor
      // 120: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 123: ldc2_w 6627824031214154653
      // 126: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 129: invokevirtual java/io/InputStream.readNBytes (I)[B
      // 12c: astore 10
      // 12e: aload 10
      // 130: arraylength
      // 131: ldc_w -1002230499
      // 134: iload 14
      // 136: ldc_w -1257519473
      // 139: ixor
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 13d: ldc2_w 7241248796993708662
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 143: if_icmple 16b
      // 146: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab
      // 149: dup
      // 14a: bipush 0
      // 14b: ldc_w ""
      // 14e: aconst_null
      // 14f: aconst_null
      // 150: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 153: astore 11
      // 155: aload 9
      // 157: iload 5
      // 159: ifne 165
      // 15c: ifnull 168
      // 15f: goto 163
      // 162: athrow
      // 163: aload 9
      // 165: invokevirtual java/io/InputStream.close ()V
      // 168: aload 11
      // 16a: areturn
      // 16b: new java/lang/String
      // 16e: dup
      // 16f: aload 10
      // 171: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 174: invokespecial java/lang/String.<init> ([BLjava/nio/charset/Charset;)V
      // 177: astore 8
      // 179: iload 5
      // 17b: ifne 18c
      // 17e: aload 9
      // 180: ifnull 1b3
      // 183: aload 9
      // 185: invokevirtual java/io/InputStream.close ()V
      // 188: goto 18c
      // 18b: athrow
      // 18c: goto 1b3
      // 18f: astore 10
      // 191: iload 5
      // 193: ifne 1a4
      // 196: aload 9
      // 198: ifnull 1b0
      // 19b: goto 19f
      // 19e: athrow
      // 19f: aload 9
      // 1a1: invokevirtual java/io/InputStream.close ()V
      // 1a4: goto 1b0
      // 1a7: astore 11
      // 1a9: aload 10
      // 1ab: aload 11
      // 1ad: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 1b0: aload 10
      // 1b2: athrow
      // 1b3: aload 7
      // 1b5: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 1ba: istore 9
      // 1bc: iload 9
      // 1be: iload 5
      // 1c0: ifne 1e2
      // 1c3: ldc_w -1002230500
      // 1c6: iload 14
      // 1c8: ldc_w 1716896116
      // 1cb: ixor
      // 1cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 1cf: ldc2_w 418419983850349869
      // 1d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 1d5: if_icmplt 205
      // 1d8: goto 1dc
      // 1db: athrow
      // 1dc: iload 9
      // 1de: goto 1e2
      // 1e1: athrow
      // 1e2: ldc_w -1002230501
      // 1e5: iload 14
      // 1e7: ldc_w 583366119
      // 1ea: ixor
      // 1eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 1ee: ldc2_w 6510462572302650961
      // 1f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 1f4: if_icmpge 205
      // 1f7: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab
      // 1fa: dup
      // 1fb: iload 9
      // 1fd: aload 8
      // 1ff: aconst_null
      // 200: aconst_null
      // 201: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 204: areturn
      // 205: aload 8
      // 207: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bb (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 20a: astore 10
      // 20c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab
      // 20f: dup
      // 210: iload 9
      // 212: aload 8
      // 214: aload 10
      // 216: ldc_w -1002230502
      // 219: iload 14
      // 21b: ldc_w 1924966473
      // 21e: ixor
      // 21f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 222: ldc_w -1002230503
      // 225: iload 14
      // 227: ldc_w -1509514337
      // 22a: ixor
      // 22b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 22e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 231: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 234: ldc_w -1002230504
      // 237: iload 14
      // 239: ldc_w 263194703
      // 23c: ixor
      // 23d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 240: ldc2_w 5062427977636768396
      // 243: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 246: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abb (Lcom/google/gson/JsonObject;Ljava/lang/String;I)Ljava/lang/String;
      // 249: aload 10
      // 24b: ldc_w -1002230505
      // 24e: iload 14
      // 250: ldc_w 876717843
      // 253: ixor
      // 254: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 257: ldc_w -1002230506
      // 25a: iload 14
      // 25c: ldc_w -249066107
      // 25f: ixor
      // 260: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 263: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 266: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 269: ldc_w -1002230507
      // 26c: iload 14
      // 26e: ldc_w -1827388552
      // 271: ixor
      // 272: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 275: ldc2_w 6529001561663543954
      // 278: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 27b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abb (Lcom/google/gson/JsonObject;Ljava/lang/String;I)Ljava/lang/String;
      // 27e: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 281: areturn
      // 282: astore 6
      // 284: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab
      // 287: dup
      // 288: bipush 0
      // 289: ldc_w ""
      // 28c: aconst_null
      // 28d: aconst_null
      // 28e: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.<init> (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 291: areturn
   }

   public String bbab() {
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
      // 06: ifne 1b
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 0f: if_acmpne 21
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: goto 1b
      // 1a: athrow
      // 1b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.abab Ljava/lang/String;
      // 1e: goto 22
      // 21: aconst_null
      // 22: areturn
   }

   static boolean bbba(String param0) {
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
      // 05: invokestatic java/net/URI.create (Ljava/lang/String;)Ljava/net/URI;
      // 08: astore 2
      // 09: ldc_w -1002230508
      // 0c: ldc_w 724174569
      // 0f: ldc_w -18000005
      // 12: ixor
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 16: ldc_w -1002230509
      // 19: ldc_w 724174569
      // 1c: ldc_w -1131441468
      // 1f: ixor
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 29: iload 1
      // 2a: ifne 5f
      // 2d: aload 2
      // 2e: invokevirtual java/net/URI.getScheme ()Ljava/lang/String;
      // 31: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 34: ifeq 75
      // 37: goto 3b
      // 3a: athrow
      // 3b: ldc_w -1002230510
      // 3e: ldc_w 724174569
      // 41: ldc_w -1818722608
      // 44: ixor
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 48: ldc_w -1002230511
      // 4b: ldc_w 724174569
      // 4e: ldc_w -1094588834
      // 51: ixor
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 55: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 5b: goto 5f
      // 5e: athrow
      // 5f: aload 2
      // 60: invokevirtual java/net/URI.getHost ()Ljava/lang/String;
      // 63: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 66: iload 1
      // 67: ifne 72
      // 6a: ifeq 75
      // 6d: goto 71
      // 70: athrow
      // 71: bipush 1
      // 72: goto 76
      // 75: bipush 0
      // 76: ireturn
      // 77: astore 2
      // 78: bipush 0
      // 79: ireturn
   }

   public abaabbb bbbb() {
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
      // 06: ifne 26
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabab;
      // 0c: ifnull 19
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 17: areturn
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifne 34
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bab ()V
      // 21: aload 0
      // 22: goto 26
      // 25: athrow
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bab Ljava/lang/String;
      // 29: ifnull 33
      // 2c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 2f: goto 37
      // 32: athrow
      // 33: aload 0
      // 34: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbb;
      // 37: areturn
   }

   public CompletableFuture aaaaa(String param1, String param2, JsonObject param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabab;
      // 07: astore 5
      // 09: istore 4
      // 0b: aload 5
      // 0d: iload 4
      // 0f: ifne 1b
      // 12: ifnull 24
      // 15: goto 19
      // 18: athrow
      // 19: aload 5
      // 1b: aload 1
      // 1c: aload 2
      // 1d: aload 3
      // 1e: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbabab.a (Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonObject;)Ljava/util/concurrent/CompletableFuture; 4
      // 23: areturn
      // 24: aload 0
      // 25: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bab Ljava/lang/String;
      // 28: astore 6
      // 2a: aload 6
      // 2c: ifnonnull 35
      // 2f: aconst_null
      // 30: invokestatic java/util/concurrent/CompletableFuture.completedFuture (Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;
      // 33: areturn
      // 34: athrow
      // 35: aload 3
      // 36: ifnonnull 3e
      // 39: aconst_null
      // 3a: goto 45
      // 3d: athrow
      // 3e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aabb Lcom/google/gson/Gson;
      // 41: aload 3
      // 42: invokevirtual com/google/gson/Gson.toJson (Lcom/google/gson/JsonElement;)Ljava/lang/String;
      // 45: astore 7
      // 47: aload 7
      // 49: iload 4
      // 4b: ifne 8a
      // 4e: ifnull 87
      // 51: goto 55
      // 54: athrow
      // 55: aload 7
      // 57: iload 4
      // 59: ifne 8a
      // 5c: goto 60
      // 5f: athrow
      // 60: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 63: invokevirtual java/lang/String.getBytes (Ljava/nio/charset/Charset;)[B
      // 66: arraylength
      // 67: ldc_w -1002230512
      // 6a: ldc_w -1078580586
      // 6d: ldc_w 377344079
      // 70: ixor
      // 71: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 74: ldc2_w 1236284345105226224
      // 77: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 7a: if_icmple 87
      // 7d: goto 81
      // 80: athrow
      // 81: aconst_null
      // 82: invokestatic java/util/concurrent/CompletableFuture.completedFuture (Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;
      // 85: areturn
      // 86: athrow
      // 87: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaaa ()Ljava/lang/String;
      // 8a: ldc_w -1002230289
      // 8d: ldc_w -1078580586
      // 90: ldc_w -657741079
      // 93: ixor
      // 94: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 97: ldc_w -1002230290
      // 9a: ldc_w -1078580586
      // 9d: ldc_w 1920605680
      // a0: ixor
      // a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // aa: aload 2
      // ab: iload 4
      // ad: ifne ba
      // b0: ifnonnull bd
      // b3: goto b7
      // b6: athrow
      // b7: ldc_w ""
      // ba: goto be
      // bd: aload 2
      // be: astore 11
      // c0: astore 10
      // c2: astore 9
      // c4: new java/lang/StringBuilder
      // c7: dup
      // c8: invokespecial java/lang/StringBuilder.<init> ()V
      // cb: aload 9
      // cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // d0: aload 10
      // d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // d5: aload 11
      // d7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // dd: astore 8
      // df: aload 0
      // e0: aload 1
      // e1: aload 8
      // e3: aload 7
      // e5: aload 6
      // e7: invokedynamic get (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.baab (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonObject;, ()Lcom/google/gson/JsonObject; ]
      // ec: invokestatic java/util/concurrent/CompletableFuture.supplyAsync (Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;
      // ef: areturn
   }

   private static boolean aaaab(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: bipush 0
      // 04: istore 2
      // 05: istore 1
      // 06: iload 2
      // 07: aload 0
      // 08: invokevirtual java/lang/String.length ()I
      // 0b: if_icmpge 8a
      // 0e: aload 0
      // 0f: iload 2
      // 10: invokevirtual java/lang/String.charAt (I)C
      // 13: iload 1
      // 14: ifne 8b
      // 17: istore 3
      // 18: iload 3
      // 19: iload 1
      // 1a: ifne 82
      // 1d: ldc_w -1002230291
      // 20: ldc_w 1362575848
      // 23: ldc_w 1721944725
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 2a: ldc2_w 3913124493435519318
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 30: if_icmplt 7d
      // 33: goto 37
      // 36: athrow
      // 37: iload 3
      // 38: iload 1
      // 39: ifne 82
      // 3c: goto 40
      // 3f: athrow
      // 40: ldc_w -1002230292
      // 43: ldc_w 1362575848
      // 46: ldc_w -784814959
      // 49: ixor
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 4d: ldc2_w 2835785160815055627
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 53: if_icmpeq 7d
      // 56: goto 5a
      // 59: athrow
      // 5a: iload 3
      // 5b: iload 1
      // 5c: ifne 82
      // 5f: goto 63
      // 62: athrow
      // 63: ldc_w -1002230293
      // 66: ldc_w 1362575848
      // 69: ldc_w -1178048560
      // 6c: ixor
      // 6d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 70: ldc2_w 13764675409560526
      // 73: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.bba (IJ)I
      // 76: if_icmpne 83
      // 79: goto 7d
      // 7c: athrow
      // 7d: bipush 0
      // 7e: goto 82
      // 81: athrow
      // 82: ireturn
      // 83: iinc 2 1
      // 86: iload 1
      // 87: ifeq 06
      // 8a: bipush 1
      // 8b: ireturn
   }

   public String aaaba() {
      return this.abbb;
   }

   private void aaabb(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: iload 2
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.baa ()Ljava/nio/file/Path;
      // 08: astore 3
      // 09: ifne 24
      // 0c: aload 3
      // 0d: ifnonnull 16
      // 10: goto 14
      // 13: athrow
      // 14: return
      // 15: athrow
      // 16: aload 3
      // 17: invokeinterface java/nio/file/Path.getParent ()Ljava/nio/file/Path; 1
      // 1c: bipush 0
      // 1d: anewarray 1467
      // 20: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 23: pop
      // 24: aload 3
      // 25: aload 3
      // 26: invokeinterface java/nio/file/Path.getFileName ()Ljava/nio/file/Path; 1
      // 2b: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 2e: ldc_w -1002230294
      // 31: ldc_w 391967480
      // 34: ldc_w -1267041217
      // 37: ixor
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 3b: ldc_w -1002230295
      // 3e: ldc_w 391967480
      // 41: ldc_w 1388923873
      // 44: ixor
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.a (II)I
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabab.aaa (II)Ljava/lang/String;
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 4e: astore 6
      // 50: astore 5
      // 52: new java/lang/StringBuilder
      // 55: dup
      // 56: invokespecial java/lang/StringBuilder.<init> ()V
      // 59: aload 5
      // 5b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 5e: aload 6
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 63: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 66: invokeinterface java/nio/file/Path.resolveSibling (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 6b: astore 4
      // 6d: aload 4
      // 6f: aload 1
      // 70: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 73: bipush 0
      // 74: anewarray 1487
      // 77: invokestatic java/nio/file/Files.writeString (Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
      // 7a: pop
      // 7b: aload 4
      // 7d: aload 3
      // 7e: bipush 2
      // 7f: anewarray 1493
      // 82: dup
      // 83: bipush 0
      // 84: getstatic java/nio/file/StandardCopyOption.REPLACE_EXISTING Ljava/nio/file/StandardCopyOption;
      // 87: aastore
      // 88: dup
      // 89: bipush 1
      // 8a: getstatic java/nio/file/StandardCopyOption.ATOMIC_MOVE Ljava/nio/file/StandardCopyOption;
      // 8d: aastore
      // 8e: invokestatic java/nio/file/Files.move (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
      // 91: pop
      // 92: goto 97
      // 95: astore 4
      // 97: return
   }

   public void aabaa(ababbabab var1, Supplier var2) {
      int var3 = aabbabbab.ab;

      aabbaabab var10000;
      Supplier var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = var2;
               if (var3 != 0) {
                  break label22;
               }

               if (var2 == null) {
                  break label21;
               }
            } catch (RuntimeException var4) {
               throw var4;
            }

            var10001 = var2;
            break label22;
         }

         var10001 = aabbaabab::bbb;
      }

      var10000.bbb = var10001;
      this.aa = var1;
   }
}
