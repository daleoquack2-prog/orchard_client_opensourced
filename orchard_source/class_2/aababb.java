package nsc;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1293;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_6880;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class aababb extends abbaabbaa {
   private static final long ba;
   private static final ababbbbaa aaa;
   private static final long[] aab;
   private static final ababbbbaa aba;
   private static final long abb;
   private int baa;
   private static final ababbbbaa bab;
   private final bababa bba;
   private static final long bbb;
   private final bababa aaaa;
   private static final ababbbbaa aaab;
   private long aaba;
   private int aabb;
   private static final Integer[] abaa;
   private static final ababbbbaa abab;
   private long abba;
   private final List abbb;
   private static final float baaa = 0.5F;
   private static final List baab;
   private float ab;
   private long baba;
   private class_1268 babb;
   private static final long bbaa;
   private static final long bbab;
   private static final double bbba = 1.0;
   private static final int[] aabbbb;
   private static final long[] bbbb;
   private final abbaaaaa aaaaa;
   private final abbaaaaa aaaab;
   private int aaaba;
   private static final String[] aaabb;
   private boolean aabaa;
   private long aabab;
   private static final ababbbbaa aabba;
   private final abbaaaaa aabbb;
   private long abaaa;
   private final bababa abaab;
   private final bababa ababa;
   private static final String[] abaaaa;
   private static final ababbbbaa ababb;
   private bbbabab abbaa;
   private final baabaab abbab;
   private long abbba;
   private static final Long[] abbbb;
   private long baaaa;
   private final abbaaaaa baaab;
   private class_243 baaba;
   private static final ababbbbaa baabb;
   private static final long babaa;
   private static final ababbbbaa babab;
   private static final long babba;
   private final abbaaaaa babbb;
   private static final String[] bbaaa;
   private static final ababbbbaa bb;
   private final aaabbbab bbaab;
   private final ababbbbba bbaba;
   private boolean bbabb;
   private static final ababbbbaa bbbaa;
   private static final Object[] abaaab;
   private static final double aa = 1.0E-4;
   private static final int bbbab;
   private class_1799 bbbba;
   private static final int bbbbb;
   private long aaaaaa;
   private int aaaaab;
   private final baaaabaa aaaaba;
   private float aaaabb;
   private static final ababbbbaa aaabaa;
   private final aaabbbab aaabab;
   private int aaabba;
   private static final double aaabbb = 0.05;
   private final abaabbbb aabaaa;
   private static final ababbbbaa aabaab;
   private static final int aababa;
   private static final long aababb;
   private float aabbaa;
   private static final ababbbbaa aabbab;
   private int aabbba;

   private ababbbbaa aa(class_6880 param1, class_1293 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 2
      // 004: invokevirtual net/minecraft/class_1293.method_5578 ()I
      // 007: istore 4
      // 009: istore 3
      // 00a: aload 1
      // 00b: iload 3
      // 00c: ifne 034
      // 00f: getstatic net/minecraft/class_1294.field_5904 Lnet/minecraft/class_6880;
      // 012: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 017: ifeq 033
      // 01a: goto 01e
      // 01d: athrow
      // 01e: iload 4
      // 020: bipush 1
      // 021: if_icmplt 02f
      // 024: goto 028
      // 027: athrow
      // 028: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.ababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 02b: goto 032
      // 02e: athrow
      // 02f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 032: areturn
      // 033: aload 1
      // 034: getstatic net/minecraft/class_1294.field_5910 Lnet/minecraft/class_6880;
      // 037: iload 3
      // 038: ifne 068
      // 03b: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 040: ifeq 05c
      // 043: goto 047
      // 046: athrow
      // 047: iload 4
      // 049: bipush 1
      // 04a: if_icmplt 058
      // 04d: goto 051
      // 050: athrow
      // 051: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 054: goto 05b
      // 057: athrow
      // 058: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 05b: areturn
      // 05c: aload 1
      // 05d: iload 3
      // 05e: ifne 076
      // 061: getstatic net/minecraft/class_1294.field_5918 Lnet/minecraft/class_6880;
      // 064: goto 068
      // 067: athrow
      // 068: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 06d: ifeq 075
      // 070: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 073: areturn
      // 074: athrow
      // 075: aload 1
      // 076: getstatic net/minecraft/class_1294.field_5924 Lnet/minecraft/class_6880;
      // 079: iload 3
      // 07a: ifne 0a2
      // 07d: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 082: ifeq 09e
      // 085: goto 089
      // 088: athrow
      // 089: iload 4
      // 08b: bipush 1
      // 08c: if_icmplt 09a
      // 08f: goto 093
      // 092: athrow
      // 093: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaabaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 096: goto 09d
      // 099: athrow
      // 09a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 09d: areturn
      // 09e: aload 1
      // 09f: getstatic net/minecraft/class_1294.field_5913 Lnet/minecraft/class_6880;
      // 0a2: iload 3
      // 0a3: ifne 0d3
      // 0a6: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 0ab: ifeq 0c7
      // 0ae: goto 0b2
      // 0b1: athrow
      // 0b2: iload 4
      // 0b4: bipush 1
      // 0b5: if_icmplt 0c3
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0bf: goto 0c6
      // 0c2: athrow
      // 0c3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0c6: areturn
      // 0c7: aload 1
      // 0c8: iload 3
      // 0c9: ifne 0e1
      // 0cc: getstatic net/minecraft/class_1294.field_5923 Lnet/minecraft/class_6880;
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 0d8: ifeq 0e0
      // 0db: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0de: areturn
      // 0df: athrow
      // 0e0: aload 1
      // 0e1: getstatic net/minecraft/class_1294.field_5925 Lnet/minecraft/class_6880;
      // 0e4: iload 3
      // 0e5: ifne 0fd
      // 0e8: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 0ed: ifeq 0f9
      // 0f0: goto 0f4
      // 0f3: athrow
      // 0f4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0f7: areturn
      // 0f8: athrow
      // 0f9: aload 1
      // 0fa: getstatic net/minecraft/class_1294.field_5905 Lnet/minecraft/class_6880;
      // 0fd: iload 3
      // 0fe: ifne 116
      // 101: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 106: ifeq 112
      // 109: goto 10d
      // 10c: athrow
      // 10d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 110: areturn
      // 111: athrow
      // 112: aload 1
      // 113: getstatic net/minecraft/class_1294.field_5906 Lnet/minecraft/class_6880;
      // 116: iload 3
      // 117: ifne 12f
      // 11a: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 11f: ifeq 12b
      // 122: goto 126
      // 125: athrow
      // 126: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 129: areturn
      // 12a: athrow
      // 12b: aload 1
      // 12c: getstatic net/minecraft/class_1294.field_5926 Lnet/minecraft/class_6880;
      // 12f: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 134: ifeq 13c
      // 137: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 13a: areturn
      // 13b: athrow
      // 13c: aconst_null
      // 13d: areturn
   }

   private boolean ab(class_6880 param1, class_1293 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aa (Lnet/minecraft/class_6880;Lnet/minecraft/class_1293;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 09: astore 4
      // 0b: istore 3
      // 0c: aload 4
      // 0e: ifnull 2d
      // 11: aload 0
      // 12: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 15: aload 4
      // 17: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 1a: iload 3
      // 1b: ifne 2a
      // 1e: goto 22
      // 21: athrow
      // 22: ifeq 2d
      // 25: goto 29
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 2e
      // 2d: bipush 0
      // 2e: ireturn
   }

   private static boolean ba() {
      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = -1404666533;
      String[] var25 = new String[10];
      int var24 = "η樇皦祱溾糔\uee94欛깄暄Ẕ猺\ude11簷麘睇⚢瓑뺼焴庒疻뙃梤嚑綺丐旗ꚛ濇횡欱纸炔횗減홃秄䚔箚⸖焷㚟熇暥拱⚽禔皓掻噁簄뺑椚阖懷躙榇皥碑욿琴嚒窻㹁斤\ue692杺\ude16璗躞篇\ue6a4睱蚻檔亓眛왇籤暐浚丗眷纚暧\ueea3殱麼淴暗璛ṅ攤躒疺鸖纷뚙栧溦疑隻摴뚑摛久翄\uf697潺\uee16梷뚘繇꺦椱\udeb9璴\uee96粛虀檤㚒禚瘐燷횟栧躤旱Ế珴㺗攻晁溄庐烺혓缷隚皧욣敱㚽櫔暒懻왇穤嚑猺且翷溜晧횤烱纼笴䚕添โ眄㚐揺ꘐ摷ᚚ璧ꚠ柑纽椴ꚕ扛陂繤ᚔ稺嘓涗麝戇隦殱躹濔暖摻乂獄\ue693慺︒恗蚛炇纣睱㺻簴ﺗ戻湀瓤嚓繚㸐曗ẝ楇\ueea5砑㚹维\ue693瞛晆澄庐紺渓笗⺟樧庢朑⚺梔ڒ烻♆涄ᚔ瀚蘗猷⺙淧ᚡ曑㚹硴溒掻ๆ櫄Ẕ篺☗烗뺞穇㚦燑꺼䄴ẟ䘛Ṋ僄⚘岚\ufe1c噗亐帇㺨彑康嘴\uee9d剻蹋䡤暞唚ᘚ价ڒ宧⚭啱麷䄔ﺘ䄻뙈䣄\uf69b多鸝嵗库媇뚮墱욲刔ນ墻\ude49嘄隙帚혞䮷㺑䘇ສ喱ặ䤔᚛䅛乍䆄溛䍚\uf61a哷\ue694䔇㚭埑\ue6b1巴횜䒛ํ䮤皘宺嘙䄷纗大險䠑⺵䂴욜䁻鹊倄⚘堚ᘘ佷뚒万ꚫ娱\uf6b1忔ẙ䘛왋埤亙坺縛套麑亇욮䃑ꚱ亴躞孛\ue64e喤뚟呚ꘛ价暒䷧\uf6a8䤑ິ塴隟嫻陊䂄暘䈚昞啷溔䋇ຨ妑Ẵ場溙帻义囄躚䠚ผ唷\uf691忇ẩ嚱ڲ䣔\ude98䁛홈䬄蚜䭚嘜僷욑䒇纨忑뺰廔暜䭛ꙏ䠤ﺘ伺蘞垷⺔將ﺭ䏑康䅔蚞䚻癎䞄캛劚縛店⚔䕧嚫丱蚳場亚䫛㹉圤\ude9e䅚蘚䐗\uf695䗇䚪䪱\uf6b3䟔蚘仛ꙍ䆄麘峚\uf618䡗隐孧京䰱躲坔麜寛乍乄㚞岚ꘟ䍗䚔嶧亪䄱ື䶴\ude9d䭛蹍䥄嚟凚\uee1e堷캑䚇뚯䛑皵临욚岻\uee4d㈄溅⻚䘇⑷䚏㿇麷㉱\uf6aaℴ亅↛ꙓ⎄\uee81⯚万⑷ꚉㄇ\udeb4⤱캪⯴Ẁ⠻噗\u20c4⺇⪚긁⹗暉㟇亳☱䚭㒔⚄⤻湖㐤ກ㝚瘃㽷ᚎ㞇纳⭑\ueeac⪴⚁ㇻ왕∄ຂ➚鸄㖗ຍ⑇纶㾱⚪㡴⺆⬻癑㬄㺂♚\ude07☗⺎㒧溴≑\udeaf⧔ᚅ◛蹕㥄⚂㣚䘆㜷麊ⲧ暲⤱효ㅔ\uf686㮛\ue656╄ᚆ㾚\uf600ㅗ隋⥇ᚶ⩱躮⭔暃⏻㹓㢤\u0e80㴚昁㝗\ue68d㟧皱㑑횩㹴꺁⓻화㴤뺀⇚ᘀ⣷蚋㫧㚷⡑隭㴔ځ⁛\uee56㳤亂┚긂⢷麎➇\ueeb4㷱뺩㆔ꚁ㽻蹑㺤蚀⯚嘁㥗蚎㬇䚴◑ꚮ㫴캃㳛\uf653⛄隇⤚渇㉗꺎㢇溲㺑躯㤔꺀㢻幓⦤䚂\u2d7a옅㫗⚏⹇Ẵ㒱躯㉔溂↻\uee56㏄溇ℚ\uee01✷ᚊょ꺵㜱麪㌔\ue686⇻䙕㍄⚇ㄚ嘇㼷ډ㲧㺱⾑뚬∔뚂⫻﹐㐤욁⭚渂㎗麏㣧暰㡑享㚴욂⌛㹑㗄蚃✚☆ⲷ嚌✧皱㦑ᚨ⎔隃㞻깓㚤⚅♚阄ܗ亂ᴇ\ue6bfᦑ亣ᄴ횈ಛ⹝٤暈᳚긎୷꺃Ꮗ\uf6baᇑ隧ᯔẍЛ繟ྤ뚈៚\ude0f᎗횄᫇꺾ᓱ座ᰔڋᕻ虛ኄ躉Ꮪḉ᳗욁Ꮗ⚽±ᚣၴẎᔛ乙ࢤᚌӚ\uf609ᅷ\uf682Χڻᗑຠྴ暍Ꮋ♝ᇤڍᏚ긊ᆗ躅ᝧ\uf6bfᲱ꺣ᇔ䚈ṻ홚ᡄ蚌ᦺ䘍ॗ\uf686᱇皺۱庥є皍ѻ乞ܤڋ᭺瘈\u1757隁܇\udebbñ캡᱔ڋ৻繟ᐄ嚏\u16fa\uee0fᴗ\u0e83Ӈ⚼б캡\u0cb4욋࠻홛ᕤ㺌᩺䘈ᖗ溃ᝧ\udebdᏑ皦औ캈\u173b﹚ਤ㚊Ժ踌ࡷ\u0e85ầ횹ᆱ\ue6a7ᮔ⺏\u09db湞ᇤ躉ᔚ㸋\u1bf7뚄༧\udeb8ı⚢᜔㚎ᗛ乞ᇤ\ude8f\u197a鸍ۗ麆ধ皾\u0d11ꚧڴ亊˛깛\u0b04庉ᇚ嘉᧗!꧵㈐늃爊뼆숧뵩꫶랶⨣걨㪢ꣅ㈩ꝕ툕꽣쨎낆숢꞉ዴ둖툦뢈窠ꨅ눨ꗵ舕곃∏ꈦ \udcb6닌애싔킥⋿췪鈨웕㫹쓫⩾픦拱쬖닎였鋐쳥뫿킪쨬텕⫹퇫≺삦嫳\udff6ꋊ췠\u0ad3틅諺\udeca䨫팵틾싫㉾짆勱\udc76頻콠諕\udec5櫻컊㈭쁵\uaaf9\udaab\uda7f젆\ufaf7\udf36嫊와ˑ쁅櫼쒊투쟕\ufaf8흋橸퐦૱켖ૌ퀀뫔큥틹\udc6aꨮ풵\ufafe\udaeb扻젆櫳픖櫊펀\uaad5퇥櫻쒪먮\ud8f5\ue2f9훋퉹픆\ufaf2폖髉\ude60鋓콅諽\ude6a樬쯵苹쳫䩾\udc86\uf2f0컖\uaacfퟠ\uead0욥⫿싪㈩\ud815ꋹ휫扼퇦嫴휖틍\udd80鋑쨅ꋾ햪﨨\udc95髾틫剼풦拴\ud856狌\udac0狗\ud965䫿킊鈮숕⫹짫特앦鋰솶苍\udfc0⋔쒅\uaaf9\n\u0c11יּ༇錢ࢢ\udb0fᖭ珛ђ묋\u0010逿낛蚉뢆蟬좩驣䁼軜ギ鋂ꀬ馏碡轿碞\n츣瞉촵ᾒ쪐垿힟ｫ왠㞻p畯ﲠ湙ᒸ獜\uec95挓瑀穌钗磒萑睟粟縏貢汹쒼恼Ა犓瑆翌ⲗ羲ᰑ怿\uec9b熏풧桙钿羼钔灓籅瑌첑橒\uec13泿钞禯뒥愹첺濜撕稳呇悌\uec94枲䰗樟粞濏撢猹풽格璓浳呂紬㲕暲㐓猿\udc9c栏撣簙풼檜\ue490晳豆禬⒗狒Е殿沜灏겤愙\udcbe欜풐糓\udc44揌җ稒\udc12掟粞懏\ue4a5捙꒻果咒槓\uec46梌Ⲕ玒谔燿처\n㤱댴㨧\udb2f㶂錂₍㯖ㅲ\uf306\u0010䛟¨䈉킱仌碘冣偊䕼삟䀢렛䯯邔䱿炨\n紋붥縝햾禸鶓撷㕇畈ﶗ"
         .length();
      int var27 = 0;
      int var26 = 0;
      String var23 = "η樇皦祱溾糔\uee94欛깄暄Ẕ猺\ude11簷麘睇⚢瓑뺼焴庒疻뙃梤嚑綺丐旗ꚛ濇횡欱纸炔횗減홃秄䚔箚⸖焷㚟熇暥拱⚽禔皓掻噁簄뺑椚阖懷躙榇皥碑욿琴嚒窻㹁斤\ue692杺\ude16璗躞篇\ue6a4睱蚻檔亓眛왇籤暐浚丗眷纚暧\ueea3殱麼淴暗璛ṅ攤躒疺鸖纷뚙栧溦疑隻摴뚑摛久翄\uf697潺\uee16梷뚘繇꺦椱\udeb9璴\uee96粛虀檤㚒禚瘐燷횟栧躤旱Ế珴㺗攻晁溄庐烺혓缷隚皧욣敱㚽櫔暒懻왇穤嚑猺且翷溜晧횤烱纼笴䚕添โ眄㚐揺ꘐ摷ᚚ璧ꚠ柑纽椴ꚕ扛陂繤ᚔ稺嘓涗麝戇隦殱躹濔暖摻乂獄\ue693慺︒恗蚛炇纣睱㺻簴ﺗ戻湀瓤嚓繚㸐曗ẝ楇\ueea5砑㚹维\ue693瞛晆澄庐紺渓笗⺟樧庢朑⚺梔ڒ烻♆涄ᚔ瀚蘗猷⺙淧ᚡ曑㚹硴溒掻ๆ櫄Ẕ篺☗烗뺞穇㚦燑꺼䄴ẟ䘛Ṋ僄⚘岚\ufe1c噗亐帇㺨彑康嘴\uee9d剻蹋䡤暞唚ᘚ价ڒ宧⚭啱麷䄔ﺘ䄻뙈䣄\uf69b多鸝嵗库媇뚮墱욲刔ນ墻\ude49嘄隙帚혞䮷㺑䘇ສ喱ặ䤔᚛䅛乍䆄溛䍚\uf61a哷\ue694䔇㚭埑\ue6b1巴횜䒛ํ䮤皘宺嘙䄷纗大險䠑⺵䂴욜䁻鹊倄⚘堚ᘘ佷뚒万ꚫ娱\uf6b1忔ẙ䘛왋埤亙坺縛套麑亇욮䃑ꚱ亴躞孛\ue64e喤뚟呚ꘛ价暒䷧\uf6a8䤑ິ塴隟嫻陊䂄暘䈚昞啷溔䋇ຨ妑Ẵ場溙帻义囄躚䠚ผ唷\uf691忇ẩ嚱ڲ䣔\ude98䁛홈䬄蚜䭚嘜僷욑䒇纨忑뺰廔暜䭛ꙏ䠤ﺘ伺蘞垷⺔將ﺭ䏑康䅔蚞䚻癎䞄캛劚縛店⚔䕧嚫丱蚳場亚䫛㹉圤\ude9e䅚蘚䐗\uf695䗇䚪䪱\uf6b3䟔蚘仛ꙍ䆄麘峚\uf618䡗隐孧京䰱躲坔麜寛乍乄㚞岚ꘟ䍗䚔嶧亪䄱ື䶴\ude9d䭛蹍䥄嚟凚\uee1e堷캑䚇뚯䛑皵临욚岻\uee4d㈄溅⻚䘇⑷䚏㿇麷㉱\uf6aaℴ亅↛ꙓ⎄\uee81⯚万⑷ꚉㄇ\udeb4⤱캪⯴Ẁ⠻噗\u20c4⺇⪚긁⹗暉㟇亳☱䚭㒔⚄⤻湖㐤ກ㝚瘃㽷ᚎ㞇纳⭑\ueeac⪴⚁ㇻ왕∄ຂ➚鸄㖗ຍ⑇纶㾱⚪㡴⺆⬻癑㬄㺂♚\ude07☗⺎㒧溴≑\udeaf⧔ᚅ◛蹕㥄⚂㣚䘆㜷麊ⲧ暲⤱효ㅔ\uf686㮛\ue656╄ᚆ㾚\uf600ㅗ隋⥇ᚶ⩱躮⭔暃⏻㹓㢤\u0e80㴚昁㝗\ue68d㟧皱㑑횩㹴꺁⓻화㴤뺀⇚ᘀ⣷蚋㫧㚷⡑隭㴔ځ⁛\uee56㳤亂┚긂⢷麎➇\ueeb4㷱뺩㆔ꚁ㽻蹑㺤蚀⯚嘁㥗蚎㬇䚴◑ꚮ㫴캃㳛\uf653⛄隇⤚渇㉗꺎㢇溲㺑躯㤔꺀㢻幓⦤䚂\u2d7a옅㫗⚏⹇Ẵ㒱躯㉔溂↻\uee56㏄溇ℚ\uee01✷ᚊょ꺵㜱麪㌔\ue686⇻䙕㍄⚇ㄚ嘇㼷ډ㲧㺱⾑뚬∔뚂⫻﹐㐤욁⭚渂㎗麏㣧暰㡑享㚴욂⌛㹑㗄蚃✚☆ⲷ嚌✧皱㦑ᚨ⎔隃㞻깓㚤⚅♚阄ܗ亂ᴇ\ue6bfᦑ亣ᄴ횈ಛ⹝٤暈᳚긎୷꺃Ꮗ\uf6baᇑ隧ᯔẍЛ繟ྤ뚈៚\ude0f᎗횄᫇꺾ᓱ座ᰔڋᕻ虛ኄ躉Ꮪḉ᳗욁Ꮗ⚽±ᚣၴẎᔛ乙ࢤᚌӚ\uf609ᅷ\uf682Χڻᗑຠྴ暍Ꮋ♝ᇤڍᏚ긊ᆗ躅ᝧ\uf6bfᲱ꺣ᇔ䚈ṻ홚ᡄ蚌ᦺ䘍ॗ\uf686᱇皺۱庥є皍ѻ乞ܤڋ᭺瘈\u1757隁܇\udebbñ캡᱔ڋ৻繟ᐄ嚏\u16fa\uee0fᴗ\u0e83Ӈ⚼б캡\u0cb4욋࠻홛ᕤ㺌᩺䘈ᖗ溃ᝧ\udebdᏑ皦औ캈\u173b﹚ਤ㚊Ժ踌ࡷ\u0e85ầ횹ᆱ\ue6a7ᮔ⺏\u09db湞ᇤ躉ᔚ㸋\u1bf7뚄༧\udeb8ı⚢᜔㚎ᗛ乞ᇤ\ude8f\u197a鸍ۗ麆ধ皾\u0d11ꚧڴ亊˛깛\u0b04庉ᇚ嘉᧗!꧵㈐늃爊뼆숧뵩꫶랶⨣걨㪢ꣅ㈩ꝕ툕꽣쨎낆숢꞉ዴ둖툦뢈窠ꨅ눨ꗵ舕곃∏ꈦ \udcb6닌애싔킥⋿췪鈨웕㫹쓫⩾픦拱쬖닎였鋐쳥뫿킪쨬텕⫹퇫≺삦嫳\udff6ꋊ췠\u0ad3틅諺\udeca䨫팵틾싫㉾짆勱\udc76頻콠諕\udec5櫻컊㈭쁵\uaaf9\udaab\uda7f젆\ufaf7\udf36嫊와ˑ쁅櫼쒊투쟕\ufaf8흋橸퐦૱켖ૌ퀀뫔큥틹\udc6aꨮ풵\ufafe\udaeb扻젆櫳픖櫊펀\uaad5퇥櫻쒪먮\ud8f5\ue2f9훋퉹픆\ufaf2폖髉\ude60鋓콅諽\ude6a樬쯵苹쳫䩾\udc86\uf2f0컖\uaacfퟠ\uead0욥⫿싪㈩\ud815ꋹ휫扼퇦嫴휖틍\udd80鋑쨅ꋾ햪﨨\udc95髾틫剼풦拴\ud856狌\udac0狗\ud965䫿킊鈮숕⫹짫特앦鋰솶苍\udfc0⋔쒅\uaaf9\n\u0c11יּ༇錢ࢢ\udb0fᖭ珛ђ묋\u0010逿낛蚉뢆蟬좩驣䁼軜ギ鋂ꀬ馏碡轿碞\n츣瞉촵ᾒ쪐垿힟ｫ왠㞻p畯ﲠ湙ᒸ獜\uec95挓瑀穌钗磒萑睟粟縏貢汹쒼恼Ა犓瑆翌ⲗ羲ᰑ怿\uec9b熏풧桙钿羼钔灓籅瑌첑橒\uec13泿钞禯뒥愹첺濜撕稳呇悌\uec94枲䰗樟粞濏撢猹풽格璓浳呂紬㲕暲㐓猿\udc9c栏撣簙풼檜\ue490晳豆禬⒗狒Е殿沜灏겤愙\udcbe欜풐糓\udc44揌җ稒\udc12掟粞懏\ue4a5捙꒻果咒槓\uec46梌Ⲕ玒谔燿처\n㤱댴㨧\udb2f㶂錂₍㯖ㅲ\uf306\u0010䛟¨䈉킱仌碘冣偊䕼삟䀢렛䯯邔䱿炨\n紋붥縝햾禸鶓撷㕇畈ﶗ";
      short var28 = 6998;

      do {
         char var10000 = var23.charAt(var27);
         int var31 = 0;
         char var29 = var10000;
         char[] var30 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 7) {
               default -> 30;
               case 1 -> 253;
               case 2 -> 200;
               case 3 -> 227;
               case 4 -> 77;
               case 5 -> 206;
               case 6 -> 194;
            }) ^ var32;
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 5 | var32 << 11) & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 5 | var32 >>> 11) & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      abaaaa = var25;
      abaaab = new Object[var25.length];
      int var40 = 0;
      int var10001 = 0;
      aabbbb = new int[456];
      byte[] var10002 = "$ \u001aw\u0014\u000f<Ü<(ÅgmV\u0090\u009br£-d7ºÀ\u0017IÚÒ\u001bÙ2:\u0092þëÈ\u0091\u0006tî7\u0093ÊþW$âújwª\u0010 ªµnÙ\u0091\u0094\u001b_òÂ²\u0086ÍÇN\u0005Ü\u001f´÷O±ý/\\Ô\u008ea£7d\u0091AX\u0016\u000e+Þ\u001a7\u0097\u0019n\u009348\u0090¶~\u0001\u0098ÙÕÌoÀ:bxb±È=Ä{\u0098\u00944\u0006¥D\u001bSü'î.kð¥\np\u009a:¡\r§t\u0004nÝá\u007fâ\u001d\u00adÛpì\u0081\u009dPe z\u0013ìG³ì']\u0080]Nw\u0017±÷\r2\n´rRU\u0001\u0013³Ó¹@üaAb'Cíwíù7ï\u0001\u0000\u0080i\u0082\u0001\u009a=e\u0015î§¬jîé\u001e<â'Ãñr>\u001ev/Çà1`¦6\u000b°\u0084·Ø`)òp\u0085Kµç÷¸\u0013Jî¾¼'f@\u0015o\\ýÆôÀ\u001eË]Ûë>Ê\u0087>«\u008e×C/\u0007El\f\u0013`%7Þ(\u009d\u0097úµw\u000f\rû\u0001\u00148\u0091\u001c\u0095\u00adÚË4~¯\u009f§'8\u00ad\"\u0090ñxv\u0086Þ\u0088\u0012å\u0006@¤¾Ph0\u0088FÁúè²sHY\u007f3Á£Ðªº\u007fí\nÎ\u000bèmÄ¾i}\b\u001c¶I\u008a~á$ÌÈ_7¡Ñ])\u008a\\ ä\u0080vP\u001a`£\f¨\u009f\u000bb\u0015X¾Uu\u0082ò\u0081&<îa&\u0018}<1f;ÿß\u0002~ùYk\u0014A:\u0013\u0010q\u0088Ø[ßñlò2î7¯vBNGd\u0087m?û`R¿K°\u000b6[ö\rá¨¥¶ÿµto.^Â:[¡\u0090£®\u0086Cû\u0084ô)Ò\u008eÓW\u008ah\u00adKv\u0095Ûj\u0007\nÌë@Fô!\u0089]W\b\u008bàF\u0007\u009e§Ø´æ~ó;ºèjì5\u009et&\u0016¸ÔdoF\u0082}ý«'\u0099_ªÛviæª¨Úz1\u00adóÅ\u0002#ë$<Ú\u000e¤)\nu:-Q\"â(þ/\u0015k\u001d¨\u0002-=C¢·%é,\u0094=\u0095\u009ex\u0080\u0083Å\u0097À\u008f\u0018\u0096\u00972Õ\fA¤*Qhµ\u0083¤æí\fº¯¢6%\u001dØ\u008eL\tb\u0013¤\u0081Âð««M\u009b\u0083´zv0}iH\u0098;Ã\u0001.r\u00069Î \u0017\u0014i8\f%þ¥ãú£\n-ó.Vþ<Q\tH²\u0010Y3GÛ|¢tÑßñÌÕñ2\u00030\u0081¤\u008a\u0015æÒ_\u008d®\u0094UßLz7\u0002ÙLØ\u009f\u00183îe»æú¼y»\u009d½ûa\u001eB/±zê4æô\u000b,^ßêòC\u0096¸\"wc\u0002[\u0012\u0095/ó\u0006\u0094ÿÁ\u001cº\u001f¯Äw4\u0012ÝS \u0007Ï\u001c\u009bí\u009edé\nuò\u0013Ck^\u0098JÉÄ»»\u0017¥\u001aê\u001fÁÅ\u0094\n~\u008f\u009e{Y£\u008aèï\u0097\t\u008b\f!g>k£ß=Õ^¸\u008c\u0019\u0083Ë[z,Ý*\u0006$\u0012å\u008c¨zÀ:\u009aÔ\u0092Á¤\u001b;\u008f1hâh\u0000z«))\rA°\u0019Õè[\u009a2\u0096Òdõ\u0082æ\u009e\u001d.ÆÌ\u0004fòZ8\u0098Ý \u0096\u00884\u009d\u0010lçN\u001e%üÃ\u0015}b&ò\r\u0019ðýÄ\u0080ô\u0089Áº!4r8/¤b\tf\u0084°×\u0090Ð)Ãã3%Ïgæ\u0007k1h\u0016\fÏ ÎéäÊó\u0086\u001c\u008cd' OÖ<E&ÖýQ£í\u0016å.váý³Þ©\u0010\u0018í\u009cµ0ÛD«VZ\u0010>\u00874æ_ã\u009c\u000fy\u008b a\u0084\u0092\u0019,\u0098ïÓ6<Ñ*\u007fúØg¤B\u0086Ò\u0086{\u0010 Ò\f=\u0087Æz'Ö¹¥\n*°ï¥=\u0095\u0011~U\u008cµæØ}ò.½Õ¾\u009cUOâ b<nÈ8éÂDdË¶<Äh\u0012d$p¡Z!ºo´\u009d\u008fl¿·\u0085\u0001Í:jìöÉ\u001f<rÄA\u000f}¾þæ1Ù\u0001«U\u009b_\u009eÚÄ\u008dé«Ý\u0081\f\u0089åÏ¢\t»µ\u0094\u0011\u0085º\u0019{ÂÊY2é*®~@wõ|YÎ\u0083b8\u000eûÍIì\u0089è\u009fE rüP:\u0093À\u0083»p\u009eZ\u0095»éÉo¼\u0085;çÂÊíØ¤©v[_½u\u001e0\u0096\u0019\u0007ë\u0098DÕµZà\u009aÁ*§öü\u001c\u0019Ö\u008dí@¨\u000e\u001aõýþ\u0000\u0099î\f.Ö\u008e\u009b¢\u009bê\u0082«\u0085?\u008am\u0000Ø\u0090K\u00adò\u0003À\u0015<H\u0017{Æ\u0085\u000b\"\u008e\u001f±áRÕú\u0089>q?Yû|PTëòí\u008fø\u0097èT\u008a\u0000dc\u0093È\t©B&Xñ(Âj>¾U\u0011'Þ¹÷bZs\u0013WõZ\u0082ûNVæL\bº\u0006\u0013A=æÜ¹\u001cú\u0018Â/Q\u0016U-\u001b$®\u0017êyb\u009dT\u008d*n\u0098¤\u0098°¢)ÝÖ\u000fØ\u0099R\u0093fJ±\u009bg]\u001f\u001b\u0014\u0092\u008cÒ=0_0.\u0014ç¶³ô\u0004\u0019YmAH\u0096\u0098\u000bc¯^W8ò|d\u0082\u007f\u009c\u0098\u0010kº#s¾3$ß¾uLa]\u000f;ÚÆ\u007fjt\u0080ò_5ó^\u0000\u008e2[º¶\u009cèÐ\u0096nèðð\u0091Z©Òkûçs[Ú©hr\u0092!Ç_\u0097EhP\u001dÓðø)\u000f®ÄF\u0084Ï\u008aÆágòÙ\u0004kV-\u009a\u0088TJ8ë`-¤\r3ý\u0019\u009d\b\u009f±\u0004Ï\u0012*½ÿRéK\u008d°K²éä\u001de\rV¤Ê\u008b\u0095)¬o\u0012\u0091HCÆ\tôÛZË&¹þlÚ\u0003ö\u0085õIDH\u001b}¬¼èþÊa\u0019(±jsò[,~\u009f\u0007(sÙ5,\u007f\u001f\u0084÷\u007fë¶\u0018\rJ\u001b^\u0006*±b*Òã\u0095ËÌ°\u0006dhR\u008f¤¶\u008f\u0082©\u00923òÎlÑg²cªëARÒNÕûá÷Lê¶ÀP¹÷rNÀ\u001b\u008cïÅ+§.\u0099§k@](L\u0001HÎ±\u007føÎhÈ¹ý7i¼¨h9\b\nèD!.4ª)ÿ\u009eøI\u000eñ»«/E«ùLkTÁG°Ekuí\u0091C\u0000äQ&Ù\u0088v¬'ÛÄ}zºV\u0013º¼ØqV\u0017ÏÌ\\lF=Ç\u008cV\u0004úT\u00888Dê n;Á.AaG\u0083Þ\u001eüö\u008cú3¸l\u00ad+É\u008aÌ\u0089¶ì+\u0091è¸^.ð1\u009aÀã\u009d7.Ú±5\u0095Ð\u0099\u0099\u009e\u009f\u0086,\u001bÐ£\u0092\u0089&0EC\u008aoo¬qR=H\u0006=4\u008fR2\u0015\u0013\u0000ÂT+\u0000\u0087=ßb>¸gS´h\u009c\f\u0097\u001e4Pîª[¤°^ãf.;W"
         .getBytes("ISO-8859-1");

      int var89;
      do {
         aabbbb[var40] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 554766320;
         var40 += 1;
         var89 = var10001 + 4;
         var10001 += 4;
      } while (var89 < var10002.length);

      String[] var21 = new String[bbbaa(30969730, var33 ^ 285217541)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = bbbab('㉏', (short)17634, (byte)-72, '뉰', (short)-2786, 1031293421)).length();
      int var17 = bbbaa(30969729, var33 ^ 990543502);
      int var37 = -1;

      label144:
      while (true) {
         String var41 = var18.substring(++var37, var37 + var17);
         var10001 = (byte)-1;

         while (true) {
            label139: {
               char[] var51 = var41.toCharArray();
               var89 = var51.length;
               int var22 = 0;
               var72 = var51;
               var10001 = var89;
               char[] var93;
               int var111;
               if (var89 <= 1) {
                  var93 = var51;
                  var111 = var22;
               } else {
                  var72 = var51;
                  var10001 = var89;
                  if (var89 <= var22) {
                     break label139;
                  }

                  var93 = var51;
                  var111 = var22;
               }

               while (true) {
                  var93[var111] = (char)(var93[var111] ^ switch (var22 % bbbaa(30969734, var33 ^ 1221488744)) {
                     case 0 -> bbbaa(30969733, var33 ^ 846305476);
                     case 1 -> bbbaa(30969732, var33 ^ 1435424161);
                     case 2 -> bbbaa(30969755, var33 ^ 399565176);
                     case 3 -> bbbaa(30969754, var33 ^ 1208129241);
                     case 4 -> bbbaa(30969753, var33 ^ 1359901687);
                     case 5 -> bbbaa(30969752, var33 ^ 1765858642);
                     default -> bbbaa(30969759, var33 ^ 926608310);
                  });
                  var22++;
                  if (var10001 == 0) {
                     var111 = var10001;
                     var93 = var72;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var93 = var72;
                     var111 = var22;
                  }
               }
            }

            String var100 = new String(var72).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var100;
                  if ((var37 += var17) >= var20) {
                     bbaaa = var21;
                     aaabb = new String[bbbaa(30969735, var33 ^ 1167082445)];
                     long var8 = 5098312361859306834L;
                     long[] var14 = new long[bbbaa(30969758, var33 ^ 154494577)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = bbbab('爟', (short)8887, (byte)-22, 20224, (short)-23583, 1031293423)).length();
                     byte var10 = 0;

                     label118:
                     while (true) {
                        int var58 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var58, var10).getBytes(bbbab((char)'騙', (short)-1550, (byte)11, '셡', (short)-8242, 1031293422));
                        long[] var43 = var14;
                        var58 = var11++;
                        long var78 = (var15[0] & 255L) << bbbaa(30969757, var33 ^ 1313154717)
                           | (var15[1] & 255L) << bbbaa(30969756, var33 ^ 1705365976)
                           | (var15[2] & 255L) << bbbaa(30969747, var33 ^ -856126963)
                           | (var15[3] & 255L) << bbbaa(30969746, var33 ^ -717095718)
                           | (var15[4] & 255L) << bbbaa(30969745, var33 ^ -1266580274)
                           | (var15[5] & 255L) << bbbaa(30969744, var33 ^ -983304478)
                           | (var15[bbbaa(30969751, var33 ^ 332029793)] & 255L) << bbbaa(30969750, var33 ^ 1893680583)
                           | var15[bbbaa(30969749, var33 ^ 1275905142)] & 255L;
                        byte var101 = -1;

                        while (true) {
                           long var113 = var78 ^ var8;
                           switch (var101) {
                              case 0:
                                 var43[var58] = var113;
                                 if (var10 >= var13) {
                                    bbbb = var14;
                                    abaa = new Integer[bbbaa(30969763, var33 ^ -1507292725)];
                                    bbbab = bba(bbbaa(30969762, var33 ^ -1869179953), 8586897486798475218L);
                                    bbbbb = bba(bbbaa(30969761, var33 ^ 1641016655), 8586897486798475218L);
                                    aababa = bba(bbbaa(30969760, var33 ^ -1770327822), 6456353797699266149L);
                                    long var0 = 8024791035901797167L;
                                    long[] var6 = new long[bbbaa(30969767, var33 ^ -1944678095)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = bbbab(16452, (short)-8197, (byte)112, '\uf41c', (short)-6828, 1031293419)).length();
                                    byte var2 = 0;

                                    label108:
                                    while (true) {
                                       int var61 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var61, var2).getBytes(bbbab('舢', (short)-9377, (byte)-9, '产', (short)-27441, 1031293418));
                                       long[] var44 = var6;
                                       var61 = var3++;
                                       long var80 = (var7[0] & 255L) << bbbaa(30969766, var33 ^ -1571163889)
                                          | (var7[1] & 255L) << bbbaa(30969765, var33 ^ 773100829)
                                          | (var7[2] & 255L) << bbbaa(30969764, var33 ^ 654983372)
                                          | (var7[3] & 255L) << bbbaa(30969787, var33 ^ -510679295)
                                          | (var7[4] & 255L) << bbbaa(30969786, var33 ^ -954036949)
                                          | (var7[5] & 255L) << bbbaa(30969785, var33 ^ 1285178219)
                                          | (var7[bbbaa(30969784, var33 ^ -1678460487)] & 255L) << bbbaa(30969791, var33 ^ -2018643614)
                                          | var7[bbbaa(30969790, var33 ^ 1030630904)] & 255L;
                                       var101 = -1;

                                       while (true) {
                                          var113 = var80 ^ var0;
                                          switch (var101) {
                                             case 0:
                                                var44[var61] = var113;
                                                if (var2 >= var5) {
                                                   aab = var6;
                                                   abbbb = new Long[bbbaa(30969780, var33 ^ -1649892969)];
                                                   aababb = abbbb(bbbaa(30969803, var33 ^ 2079150536), 6402940760196002606L);
                                                   bbb = abbbb(bbbaa(30969802, var33 ^ -1613168928), 6402940760196002606L);
                                                   abb = abbbb(bbbaa(30969801, var33 ^ 242507157), 907359801716399290L);
                                                   babba = abbbb(bbbaa(30969800, var33 ^ -1791205886), 6480734930637391917L);
                                                   bbaa = abbbb(bbbaa(30969807, var33 ^ -1969478288), 8606639704184854641L);
                                                   babaa = abbbb(bbbaa(30969806, var33 ^ 1783866865), 1894338174086598884L);
                                                   bbab = abbbb(bbbaa(30969805, var33 ^ 1989655890), 4507995051435504098L);
                                                   ba = abbbb(bbbaa(30969804, var33 ^ -577156324), 9161585291719987533L);
                                                   aabba = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969795, var33 ^ -1750348662), bbbaa(30969794, var33 ^ 1727420200))
                                                   );
                                                   var40 = bbbaa(30969793, var33 ^ -670939127);
                                                   ababb = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969792, var33 ^ 338426425), bbbaa(30969799, var33 ^ 782682173))
                                                   );
                                                   abab = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969798, var33 ^ -2091385896), bbbaa(30969797, var33 ^ -535368839))
                                                   );
                                                   aaa = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969796, var33 ^ 401096316), bbbaa(30969819, var33 ^ -1751404486))
                                                   );
                                                   babab = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969818, var33 ^ 1588744811), bbbaa(30969817, var33 ^ -1130269852))
                                                   );
                                                   aba = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969816, var33 ^ 977049142), bbbaa(30969823, var33 ^ -1781131217))
                                                   );
                                                   aaabaa = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969822, var33 ^ -1004930418), bbbaa(30969821, var33 ^ 283054198))
                                                   );
                                                   aaab = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969820, var33 ^ -1266868456), bbbaa(30969811, var33 ^ 250656227))
                                                   );
                                                   baabb = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969810, var33 ^ -1662724070), bbbaa(30969809, var33 ^ -13547468))
                                                   );
                                                   bab = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969808, var33 ^ 1395726273), bbbaa(30969815, var33 ^ 305002594))
                                                   );
                                                   bb = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969814, var33 ^ 1447632201), bbbaa(30969813, var33 ^ 133214216))
                                                   );
                                                   aabaab = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969812, var33 ^ -1183040492), bbbaa(30969835, var33 ^ -45964618))
                                                   );
                                                   aabbab = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969834, var33 ^ 974359136), bbbaa(30969833, var33 ^ -451011088))
                                                   );
                                                   bbbaa = aabbaaaba.aaab(
                                                      aaaa(bbbaa(30969832, var33 ^ 2082355390), bbbaa(30969839, var33 ^ 1592040246))
                                                   );
                                                   aaaa[] var46 = new aaaa[bba(
                                                      var40, 8998312621007996810L
                                                   )];
                                                   var46[0] = new aaaa(
                                                      aabba,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969838, var33 ^ -2836026), bbbaa(30969837, var33 ^ -453134218))
                                                      )
                                                   );
                                                   var46[1] = new aaaa(
                                                      ababb,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969836, var33 ^ 1271985649), bbbaa(30969827, var33 ^ -455158703))
                                                      )
                                                   );
                                                   var46[2] = new aaaa(
                                                      abab,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969826, var33 ^ 2088192772), bbbaa(30969825, var33 ^ -575401242))
                                                      )
                                                   );
                                                   var46[3] = new aaaa(
                                                      aaa,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969824, var33 ^ 1124443220), bbbaa(30969831, var33 ^ -344085091))
                                                      )
                                                   );
                                                   var46[4] = new aaaa(
                                                      babab,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969830, var33 ^ -405188719), bbbaa(30969829, var33 ^ -81463528))
                                                      )
                                                   );
                                                   var46[5] = new aaaa(
                                                      aba,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969828, var33 ^ 1743736604), bbbaa(30969851, var33 ^ -2118331358))
                                                      )
                                                   );
                                                   var46[bba(bbbaa(30969850, var33 ^ 294094705), 2270116572502387433L)] = new aaaa(
                                                      aaabaa,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969849, var33 ^ -2009042607), bbbaa(30969848, var33 ^ -829445091))
                                                      )
                                                   );
                                                   var46[bba(bbbaa(30969855, var33 ^ -956126130), 6271407463762589369L)] = new aaaa(
                                                      aaab,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969854, var33 ^ 1046906542), bbbaa(30969853, var33 ^ -377236852))
                                                      )
                                                   );
                                                   var46[bba(bbbaa(30969852, var33 ^ 1174710877), 3598291445015927242L)] = new aaaa(
                                                      baabb,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969843, var33 ^ 551579689), bbbaa(30969842, var33 ^ 993229950))
                                                      )
                                                   );
                                                   var46[bba(bbbaa(30969841, var33 ^ 2018781672), 8720600249136157708L)] = new aaaa(
                                                      bab,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969840, var33 ^ -1439261492), bbbaa(30969847, var33 ^ -1452055428))
                                                      )
                                                   );
                                                   var46[bba(bbbaa(30969846, var33 ^ 2043049493), 3578978759810144098L)] = new aaaa(
                                                      bb,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969845, var33 ^ -1745694742), bbbaa(30969844, var33 ^ -1685165725))
                                                      )
                                                   );
                                                   var46[bba(bbbaa(30969611, var33 ^ -1784159719), 4637417222461797666L)] = new aaaa(
                                                      aabaab,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969610, var33 ^ -8570505), bbbaa(30969609, var33 ^ -233827428))
                                                      )
                                                   );
                                                   var46[bba(bbbaa(30969608, var33 ^ -11134107), 2853132100089759832L)] = new aaaa(
                                                      aabbab,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969615, var33 ^ -208607399), bbbaa(30969614, var33 ^ 211491612))
                                                      )
                                                   );
                                                   var46[bba(bbbaa(30969613, var33 ^ -2117795736), 3560783533210496499L)] = new aaaa(
                                                      bbbaa,
                                                      aabbaaaba.aaab(
                                                         aaaa(bbbaa(30969612, var33 ^ -1968843972), bbbaa(30969603, var33 ^ 1503808477))
                                                      )
                                                   );
                                                   baab = List.of(var46);
                                                   return;
                                                }
                                                break;
                                             default:
                                                var44[var61] = var113;
                                                if (var2 < var5) {
                                                   continue label108;
                                                }

                                                var5 = (var4 = bbbab((char)'馾', (short)-30315, (byte)-48, '勞', 6607, 1031293413)).length();
                                                var2 = 0;
                                          }

                                          byte var63 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var63, var2)
                                             .getBytes(bbbab((char)'\ud9b6', (short)-6668, (byte)43, (char)'ﯛ', (short)27007, 1031293412));
                                          var44 = var6;
                                          var61 = var3++;
                                          var80 = (var7[0] & 255L) << bbbaa(30969789, var33 ^ 1980121598)
                                             | (var7[1] & 255L) << bbbaa(30969788, var33 ^ -1277786886)
                                             | (var7[2] & 255L) << bbbaa(30969779, var33 ^ -589589341)
                                             | (var7[3] & 255L) << bbbaa(30969778, var33 ^ 1627424527)
                                             | (var7[4] & 255L) << bbbaa(30969777, var33 ^ 1692136739)
                                             | (var7[5] & 255L) << bbbaa(30969776, var33 ^ -387126046)
                                             | (var7[bbbaa(30969783, var33 ^ -2061091563)] & 255L) << bbbaa(30969782, var33 ^ -729917514)
                                             | var7[bbbaa(30969781, var33 ^ -424558221)] & 255L;
                                          var101 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var43[var58] = var113;
                                 if (var10 < var13) {
                                    continue label118;
                                 }

                                 var13 = (var12 = bbbab(30853, (short)-412, (byte)-27, (char)'\ue7cd', (short)-26638, 1031293417)).length();
                                 var10 = 0;
                           }

                           byte var60 = var10;
                           var10 += 8;
                           var15 = var12.substring(var60, var10).getBytes(bbbab(19846, 17600, (byte)-107, (char)'\ue3bf', (short)-460, 1031293416));
                           var43 = var14;
                           var58 = var11++;
                           var78 = (var15[0] & 255L) << bbbaa(30969748, var33 ^ 316008989)
                              | (var15[1] & 255L) << bbbaa(30969771, var33 ^ 1699090477)
                              | (var15[2] & 255L) << bbbaa(30969770, var33 ^ 162830474)
                              | (var15[3] & 255L) << bbbaa(30969769, var33 ^ 1180870439)
                              | (var15[4] & 255L) << bbbaa(30969768, var33 ^ 637084773)
                              | (var15[5] & 255L) << bbbaa(30969775, var33 ^ 838492421)
                              | (var15[bbbaa(30969774, var33 ^ 446068929)] & 255L) << bbbaa(30969773, var33 ^ 348891866)
                              | var15[bbbaa(30969772, var33 ^ -697309698)] & 255L;
                           var101 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var37);
                  break;
               default:
                  var21[var19++] = var100;
                  if ((var37 += var17) < var20) {
                     var17 = var18.charAt(var37);
                     continue label144;
                  }

                  var20 = (var18 = bbbab('偗', 32366, (byte)-125, 6649, (short)-28508, 1031293420)).length();
                  var17 = bbbaa(30969728, var33 ^ -1226468428);
                  var37 = -1;
            }

            var41 = var18.substring(++var37, var37 + var17);
            var10001 = (byte)0;
         }
      }
   }

   private boolean bb(class_310 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 009: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 00c: checkcast java/lang/Boolean
      // 00f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 012: iload 4
      // 014: ifne 034
      // 017: ifeq 033
      // 01a: goto 01e
      // 01d: athrow
      // 01e: aload 0
      // 01f: aload 1
      // 020: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba (Lnet/minecraft/class_310;)Z
      // 023: iload 4
      // 025: ifne 034
      // 028: goto 02c
      // 02b: athrow
      // 02c: ifne 035
      // 02f: goto 033
      // 032: athrow
      // 033: bipush 0
      // 034: ireturn
      // 035: aload 1
      // 036: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 039: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 03c: fstore 5
      // 03e: aload 1
      // 03f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 042: invokevirtual net/minecraft/class_746.method_6063 ()F
      // 045: fstore 6
      // 047: fload 5
      // 049: iload 4
      // 04b: ifne 06c
      // 04e: fload 6
      // 050: ldc_w 0.25
      // 053: fsub
      // 054: fcmpl
      // 055: iflt 063
      // 058: goto 05c
      // 05b: athrow
      // 05c: aload 0
      // 05d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbb ()V
      // 060: bipush 0
      // 061: ireturn
      // 062: athrow
      // 063: aload 0
      // 064: aload 1
      // 065: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 068: lload 2
      // 069: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babaa (Lnet/minecraft/class_746;J)F
      // 06c: fstore 7
      // 06e: fload 7
      // 070: f2d
      // 071: aload 0
      // 072: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 075: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 078: checkcast java/lang/Double
      // 07b: invokevirtual java/lang/Double.doubleValue ()D
      // 07e: dcmpg
      // 07f: iload 4
      // 081: ifne 08c
      // 084: ifgt 08f
      // 087: goto 08b
      // 08a: athrow
      // 08b: bipush 1
      // 08c: goto 090
      // 08f: bipush 0
      // 090: istore 8
      // 092: iload 8
      // 094: iload 4
      // 096: ifne 0c3
      // 099: ifeq 0bd
      // 09c: goto 0a0
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: lload 2
      // 0a2: ldc_w 30969483
      // 0a5: ldc_w -1155660993
      // 0a8: ldc_w -1082692612
      // 0ab: ixor
      // 0ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 0af: ldc2_w 4678792593577263579
      // 0b2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbbb (IJ)J
      // 0b5: ladd
      // 0b6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbba J
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: lload 2
      // 0be: aload 0
      // 0bf: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbba J
      // 0c2: lcmp
      // 0c3: iload 4
      // 0c5: ifne 0d0
      // 0c8: ifgt 0d3
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: bipush 1
      // 0d0: goto 0d4
      // 0d3: bipush 0
      // 0d4: istore 9
      // 0d6: iload 9
      // 0d8: iload 4
      // 0da: ifne 0f1
      // 0dd: ifeq 101
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: fload 7
      // 0e6: fload 6
      // 0e8: ldc_w 0.25
      // 0eb: fsub
      // 0ec: fcmpg
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: iload 4
      // 0f3: ifne 0fe
      // 0f6: ifge 101
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: bipush 1
      // 0fe: goto 102
      // 101: bipush 0
      // 102: istore 10
      // 104: iload 8
      // 106: iload 4
      // 108: ifne 12e
      // 10b: ifne 124
      // 10e: goto 112
      // 111: athrow
      // 112: iload 9
      // 114: iload 4
      // 116: ifne 161
      // 119: goto 11d
      // 11c: athrow
      // 11d: ifeq 15f
      // 120: goto 124
      // 123: athrow
      // 124: aload 0
      // 125: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa J
      // 128: lconst_0
      // 129: lcmp
      // 12a: goto 12e
      // 12d: athrow
      // 12e: iload 4
      // 130: ifne 161
      // 133: ifle 15f
      // 136: goto 13a
      // 139: athrow
      // 13a: fload 7
      // 13c: f2d
      // 13d: aload 0
      // 13e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 141: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 144: checkcast java/lang/Double
      // 147: invokevirtual java/lang/Double.doubleValue ()D
      // 14a: dcmpl
      // 14b: iload 4
      // 14d: ifne 161
      // 150: goto 154
      // 153: athrow
      // 154: ifle 15f
      // 157: goto 15b
      // 15a: athrow
      // 15b: iload 10
      // 15d: ireturn
      // 15e: athrow
      // 15f: iload 8
      // 161: iload 4
      // 163: ifne 180
      // 166: ifne 17f
      // 169: goto 16d
      // 16c: athrow
      // 16d: iload 10
      // 16f: iload 4
      // 171: ifne 180
      // 174: goto 178
      // 177: athrow
      // 178: ifeq 183
      // 17b: goto 17f
      // 17e: athrow
      // 17f: bipush 1
      // 180: goto 184
      // 183: bipush 0
      // 184: ireturn
   }

   private boolean aaa() {
      int var1 = baaabbaa.bba;

      try {
         boolean var10000 = (Boolean)this.baaab.abbb();
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

   private boolean aab(class_310 param1) {
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
      // 09: aload 1
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba (Lnet/minecraft/class_310;)Z
      // 0d: ifne 17
      // 10: goto 14
      // 13: athrow
      // 14: bipush 0
      // 15: ireturn
      // 16: athrow
      // 17: aload 0
      // 18: aload 1
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbaab (Lnet/minecraft/class_310;)F
      // 1c: fstore 3
      // 1d: aload 0
      // 1e: aload 1
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaab (Lnet/minecraft/class_310;)F
      // 22: fstore 4
      // 24: aload 0
      // 25: dup
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abba J
      // 29: lconst_1
      // 2a: ladd
      // 2b: dup2_x1
      // 2c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abba J
      // 2f: lstore 5
      // 31: aload 1
      // 32: ldc_w 30969482
      // 35: ldc_w 1427534103
      // 38: ldc_w 1641042531
      // 3b: ixor
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 3f: ldc2_w 1490516785785308451
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba (IJ)I
      // 45: fload 3
      // 46: fload 4
      // 48: aload 0
      // 49: lload 5
      // 4b: aload 1
      // 4c: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb;JLnet/minecraft/class_310;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aba (JLnet/minecraft/class_310;)Z, ()Z ]
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.b (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 54: ireturn
   }

   private boolean aba(long param1, class_310 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 0c: if_acmpne 25
      // 0f: lload 1
      // 10: aload 0
      // 11: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abba J
      // 14: lcmp
      // 15: iload 4
      // 17: ifne 36
      // 1a: goto 1e
      // 1d: athrow
      // 1e: ifeq 28
      // 21: goto 25
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
      // 27: athrow
      // 28: aload 0
      // 29: iload 4
      // 2b: ifne 3a
      // 2e: aload 3
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbaaa (Lnet/minecraft/class_310;)Z
      // 32: goto 36
      // 35: athrow
      // 36: ifne 41
      // 39: aload 0
      // 3a: aload 3
      // 3b: bipush 0
      // 3c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbba (Lnet/minecraft/class_310;Z)V
      // 3f: bipush 0
      // 40: ireturn
      // 41: aload 3
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbbb (Lnet/minecraft/class_310;)V
      // 45: aload 3
      // 46: aload 0
      // 47: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb Lnet/minecraft/class_1268;
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;
      // 4d: astore 5
      // 4f: aload 5
      // 51: iload 4
      // 53: ifne 5f
      // 56: ifnull 74
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 5
      // 5f: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 64: iload 4
      // 66: ifne 71
      // 69: ifeq 74
      // 6c: goto 70
      // 6f: athrow
      // 70: bipush 1
      // 71: goto 75
      // 74: bipush 0
      // 75: istore 6
      // 77: aload 0
      // 78: aload 3
      // 79: iload 6
      // 7b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbba (Lnet/minecraft/class_310;Z)V
      // 7e: iload 6
      // 80: ireturn
   }

   private void abb(class_310 var1) {
      this.b(var1);
   }

   private bbbaaabb bab(class_746 param1, class_1799 param2, int param3, long param4, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 7
      // 005: aload 0
      // 006: iload 7
      // 008: ifne 020
      // 00b: aload 2
      // 00c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabb (Lnet/minecraft/class_1799;)Z
      // 00f: ifne 019
      // 012: goto 016
      // 015: athrow
      // 016: aconst_null
      // 017: areturn
      // 018: athrow
      // 019: aload 2
      // 01a: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
      // 01d: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 020: checkcast net/minecraft/class_1844
      // 023: astore 8
      // 025: bipush 0
      // 026: istore 9
      // 028: bipush 0
      // 029: istore 10
      // 02b: fconst_0
      // 02c: fstore 11
      // 02e: bipush 0
      // 02f: aload 0
      // 030: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 033: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 036: checkcast java/lang/Double
      // 039: invokevirtual java/lang/Double.doubleValue ()D
      // 03c: ldc2_w 20.0
      // 03f: dmul
      // 040: invokestatic java/lang/Math.round (D)J
      // 043: l2i
      // 044: invokestatic java/lang/Math.max (II)I
      // 047: istore 12
      // 049: aload 8
      // 04b: invokevirtual net/minecraft/class_1844.method_57397 ()Ljava/lang/Iterable;
      // 04e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 053: astore 13
      // 055: aload 13
      // 057: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05c: ifeq 1af
      // 05f: aload 13
      // 061: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 066: checkcast net/minecraft/class_1293
      // 069: astore 14
      // 06b: iload 7
      // 06d: ifne 1c0
      // 070: aload 14
      // 072: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
      // 075: astore 15
      // 077: aload 15
      // 079: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
      // 07e: checkcast net/minecraft/class_1291
      // 081: astore 16
      // 083: aload 16
      // 085: invokevirtual net/minecraft/class_1291.method_18792 ()Lnet/minecraft/class_4081;
      // 088: iload 7
      // 08a: ifne 0a8
      // 08d: getstatic net/minecraft/class_4081.field_18272 Lnet/minecraft/class_4081;
      // 090: if_acmpne 09a
      // 093: goto 097
      // 096: athrow
      // 097: aconst_null
      // 098: areturn
      // 099: athrow
      // 09a: aload 16
      // 09c: iload 7
      // 09e: ifne 0b9
      // 0a1: invokevirtual net/minecraft/class_1291.method_18792 ()Lnet/minecraft/class_4081;
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: getstatic net/minecraft/class_4081.field_18271 Lnet/minecraft/class_4081;
      // 0ab: if_acmpeq 0b7
      // 0ae: iload 7
      // 0b0: ifeq 055
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: aload 16
      // 0b9: invokevirtual net/minecraft/class_1291.method_5561 ()Z
      // 0bc: iload 7
      // 0be: ifne 0f7
      // 0c1: ifeq 0ef
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: aload 14
      // 0cb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaab (Lnet/minecraft/class_1293;)F
      // 0ce: fstore 17
      // 0d0: iload 7
      // 0d2: ifne 0ea
      // 0d5: fload 17
      // 0d7: fconst_0
      // 0d8: fcmpl
      // 0d9: ifle 055
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: fload 11
      // 0e2: fload 17
      // 0e4: fadd
      // 0e5: fstore 11
      // 0e7: bipush 1
      // 0e8: istore 10
      // 0ea: iload 7
      // 0ec: ifeq 055
      // 0ef: aload 0
      // 0f0: aload 15
      // 0f2: aload 14
      // 0f4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.ab (Lnet/minecraft/class_6880;Lnet/minecraft/class_1293;)Z
      // 0f7: iload 7
      // 0f9: ifne 10d
      // 0fc: ifne 10c
      // 0ff: goto 103
      // 102: athrow
      // 103: iload 7
      // 105: ifeq 055
      // 108: goto 10c
      // 10b: athrow
      // 10c: bipush 1
      // 10d: istore 10
      // 10f: aload 1
      // 110: aload 15
      // 112: invokevirtual net/minecraft/class_746.method_6112 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1293;
      // 115: astore 17
      // 117: aload 17
      // 119: iload 7
      // 11b: ifne 133
      // 11e: ifnonnull 131
      // 121: goto 125
      // 124: athrow
      // 125: iinc 9 120
      // 128: iload 7
      // 12a: ifeq 055
      // 12d: goto 131
      // 130: athrow
      // 131: aload 14
      // 133: iload 7
      // 135: ifne 186
      // 138: invokevirtual net/minecraft/class_1293.method_5578 ()I
      // 13b: aload 17
      // 13d: invokevirtual net/minecraft/class_1293.method_5578 ()I
      // 140: if_icmple 184
      // 143: goto 147
      // 146: athrow
      // 147: iload 9
      // 149: ldc_w 30969481
      // 14c: ldc_w 52423971
      // 14f: ldc_w 536757682
      // 152: ixor
      // 153: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 156: ldc2_w 8754115277195867120
      // 159: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba (IJ)I
      // 15c: aload 14
      // 15e: invokevirtual net/minecraft/class_1293.method_5578 ()I
      // 161: aload 17
      // 163: invokevirtual net/minecraft/class_1293.method_5578 ()I
      // 166: isub
      // 167: ldc_w 30969480
      // 16a: ldc_w 52423971
      // 16d: ldc_w 1317014798
      // 170: ixor
      // 171: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 174: ldc2_w 2428266300171544130
      // 177: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba (IJ)I
      // 17a: imul
      // 17b: iadd
      // 17c: iadd
      // 17d: istore 9
      // 17f: iload 7
      // 181: ifeq 055
      // 184: aload 17
      // 186: iload 7
      // 188: ifne 19b
      // 18b: invokevirtual net/minecraft/class_1293.method_48559 ()Z
      // 18e: ifne 1aa
      // 191: goto 195
      // 194: athrow
      // 195: aload 17
      // 197: goto 19b
      // 19a: athrow
      // 19b: invokevirtual net/minecraft/class_1293.method_5584 ()I
      // 19e: iload 12
      // 1a0: if_icmpgt 1aa
      // 1a3: iinc 9 55
      // 1a6: goto 1aa
      // 1a9: athrow
      // 1aa: iload 7
      // 1ac: ifeq 055
      // 1af: iload 10
      // 1b1: iload 7
      // 1b3: ifne 1c4
      // 1b6: ifne 1c0
      // 1b9: goto 1bd
      // 1bc: athrow
      // 1bd: aconst_null
      // 1be: areturn
      // 1bf: athrow
      // 1c0: fload 11
      // 1c2: fconst_0
      // 1c3: fcmpl
      // 1c4: iload 7
      // 1c6: ifne 2d1
      // 1c9: ifle 2cf
      // 1cc: goto 1d0
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: aload 1
      // 1d2: lload 4
      // 1d4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babaa (Lnet/minecraft/class_746;J)F
      // 1d7: fstore 13
      // 1d9: fload 13
      // 1db: iload 7
      // 1dd: ifne 1fc
      // 1e0: f2d
      // 1e1: aload 0
      // 1e2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 1e5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 1e8: checkcast java/lang/Double
      // 1eb: invokevirtual java/lang/Double.doubleValue ()D
      // 1ee: dcmpg
      // 1ef: ifgt 215
      // 1f2: goto 1f6
      // 1f5: athrow
      // 1f6: fload 13
      // 1f8: goto 1fc
      // 1fb: athrow
      // 1fc: aload 1
      // 1fd: invokevirtual net/minecraft/class_746.method_6063 ()F
      // 200: ldc_w 0.25
      // 203: fsub
      // 204: fcmpg
      // 205: iload 7
      // 207: ifne 212
      // 20a: ifge 215
      // 20d: goto 211
      // 210: athrow
      // 211: bipush 1
      // 212: goto 216
      // 215: bipush 0
      // 216: istore 14
      // 218: aload 0
      // 219: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 21c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 21f: checkcast java/lang/Boolean
      // 222: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 225: iload 7
      // 227: ifne 253
      // 22a: ifeq 251
      // 22d: goto 231
      // 230: athrow
      // 231: iload 6
      // 233: iload 7
      // 235: ifne 245
      // 238: goto 23c
      // 23b: athrow
      // 23c: ifne 26b
      // 23f: goto 243
      // 242: athrow
      // 243: iload 14
      // 245: iload 7
      // 247: ifne 253
      // 24a: ifne 26b
      // 24d: goto 251
      // 250: athrow
      // 251: iload 9
      // 253: ifle 269
      // 256: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb
      // 259: dup
      // 25a: iload 3
      // 25b: iload 9
      // 25d: fconst_0
      // 25e: aload 2
      // 25f: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
      // 262: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.<init> (IIFLnet/minecraft/class_1799;)V
      // 265: goto 26a
      // 268: athrow
      // 269: aconst_null
      // 26a: areturn
      // 26b: fconst_0
      // 26c: aload 1
      // 26d: invokevirtual net/minecraft/class_746.method_6063 ()F
      // 270: fload 13
      // 272: fsub
      // 273: invokestatic java/lang/Math.max (FF)F
      // 276: fstore 15
      // 278: fload 15
      // 27a: ldc_w 0.25
      // 27d: fcmpg
      // 27e: iload 7
      // 280: ifne 2cd
      // 283: ifgt 2a8
      // 286: goto 28a
      // 289: athrow
      // 28a: iload 9
      // 28c: ifle 2a6
      // 28f: goto 293
      // 292: athrow
      // 293: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb
      // 296: dup
      // 297: iload 3
      // 298: iload 9
      // 29a: fconst_0
      // 29b: aload 2
      // 29c: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
      // 29f: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.<init> (IIFLnet/minecraft/class_1799;)V
      // 2a2: goto 2a7
      // 2a5: athrow
      // 2a6: aconst_null
      // 2a7: areturn
      // 2a8: iload 9
      // 2aa: ldc_w 30969487
      // 2ad: ldc_w 52423971
      // 2b0: ldc_w 1366674612
      // 2b3: ixor
      // 2b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 2b7: ldc2_w 4050907206391502086
      // 2ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba (IJ)I
      // 2bd: fload 11
      // 2bf: fload 15
      // 2c1: invokestatic java/lang/Math.min (FF)F
      // 2c4: ldc_w 20.0
      // 2c7: fmul
      // 2c8: invokestatic java/lang/Math.round (F)I
      // 2cb: iadd
      // 2cc: iadd
      // 2cd: istore 9
      // 2cf: iload 9
      // 2d1: ifle 2e8
      // 2d4: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb
      // 2d7: dup
      // 2d8: iload 3
      // 2d9: iload 9
      // 2db: fload 11
      // 2dd: aload 2
      // 2de: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
      // 2e1: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.<init> (IIFLnet/minecraft/class_1799;)V
      // 2e4: goto 2e9
      // 2e7: athrow
      // 2e8: aconst_null
      // 2e9: areturn
   }

   private static int bba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ bbbaa(30969486, 123635802 ^ 271401802);
      if (abaa[var3] == null) {
         abaa[var3] = (int)(bbbb[var3] ^ var1);
      }

      return abaa[var3];
   }

   @Override
   public void bbaabb(class_310 param1) {
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
      // 06: ifne 19
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 0f: if_acmpne 18
      // 12: goto 16
      // 15: athrow
      // 16: return
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba (Lnet/minecraft/class_310;)Z
      // 1d: iload 2
      // 1e: ifne 33
      // 21: ifne 2f
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: aload 1
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 2d: return
      // 2e: athrow
      // 2f: aload 1
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 33: iload 2
      // 34: ifne 52
      // 37: ifeq 45
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 0
      // 3f: aload 1
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 43: return
      // 44: athrow
      // 45: aload 0
      // 46: iload 2
      // 47: ifne 5d
      // 4a: aload 1
      // 4b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa (Lnet/minecraft/class_310;)Z
      // 4e: goto 52
      // 51: athrow
      // 52: ifne 5c
      // 55: aload 0
      // 56: aload 1
      // 57: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 5a: return
      // 5b: athrow
      // 5c: aload 0
      // 5d: aload 1
      // 5e: invokestatic java/lang/System.currentTimeMillis ()J
      // 61: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaba (Lnet/minecraft/class_310;J)V
      // 64: return
   }

   private boolean bbb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 07: astore 4
      // 09: istore 2
      // 0a: aload 4
      // 0c: iload 2
      // 0d: ifne 20
      // 10: instanceof net/minecraft/class_3965
      // 13: ifeq 33
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 4
      // 1c: goto 20
      // 1f: athrow
      // 20: checkcast net/minecraft/class_3965
      // 23: astore 3
      // 24: aload 3
      // 25: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 28: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 2b: if_acmpne 33
      // 2e: bipush 1
      // 2f: goto 34
      // 32: athrow
      // 33: bipush 0
      // 34: ireturn
   }

   private static String bbbab(char var0, short var1, byte var2, char var3, short var4, int var5) {
      int var10 = var5 ^ 1031293421;
      char[] var9 = abaaaa[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])abaaab[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         abaaab[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 63703;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 15) {
            default -> 104;
            case 1 -> 140;
            case 2 -> 114;
            case 3 -> 93;
            case 4 -> 58;
            case 5 -> 71;
            case 6 -> 217;
            case 7 -> 209;
            case 8 -> 65;
            case 9 -> 14;
            case 10 -> 242;
            case 11 -> 177;
            case 12 -> 115;
            case 13 -> 237;
            case 14 -> 197;
         } ^ 7841 ^ var8 ^ var4 ^ var7 ^ var5 ^ var3 ^ var2 ^ var0 ^ var1);
      }

      return new String(var9).intern();
   }

   private static String aaaa(int var0, int var1) {
      int var9 = 602553545;
      int var2 = (var0 ^ bbbaa(30969485, var9 ^ 1257893963)) & bbbaa(30969484, var9 ^ -636356873);
      if (aaabb[var2] == null) {
         char[] var3 = bbaaa[var2].toCharArray();

         int var4 = switch (var3[0] & bbbaa(30969475, var9 ^ -37160965)) {
            case 0 -> bbbaa(30969474, var9 ^ 89641415);
            case 1 -> bbbaa(30969473, var9 ^ -1863728442);
            case 2 -> bbbaa(30969472, var9 ^ 667010732);
            case 3 -> bbbaa(30969479, var9 ^ 1955146901);
            case 4 -> bbbaa(30969478, var9 ^ -1449766605);
            case 5 -> bbbaa(30969477, var9 ^ -1833491386);
            case 6 -> bbbaa(30969476, var9 ^ -236876196);
            case 7 -> bbbaa(30969499, var9 ^ -823889191);
            case 8 -> bbbaa(30969498, var9 ^ -549681025);
            case 9 -> bbbaa(30969497, var9 ^ 1284686319);
            case 10 -> bbbaa(30969496, var9 ^ 1610068703);
            case 11 -> bbbaa(30969503, var9 ^ -1609279422);
            case 12 -> bbbaa(30969502, var9 ^ 1115367807);
            case 13 -> bbbaa(30969501, var9 ^ 687679003);
            case 14 -> bbbaa(30969500, var9 ^ -1808117186);
            case 15 -> bbbaa(30969491, var9 ^ 924561373);
            case 16 -> bbbaa(30969490, var9 ^ 2099423112);
            case 17 -> bbbaa(30969489, var9 ^ -688959395);
            case 18 -> bbbaa(30969488, var9 ^ 960579461);
            case 19 -> bbbaa(30969495, var9 ^ -1293221189);
            case 20 -> bbbaa(30969494, var9 ^ 2025564939);
            case 21 -> bbbaa(30969493, var9 ^ 92698787);
            case 22 -> bbbaa(30969492, var9 ^ 1356798072);
            case 23 -> bbbaa(30969515, var9 ^ 759746556);
            case 24 -> bbbaa(30969514, var9 ^ 156477116);
            case 25 -> bbbaa(30969513, var9 ^ -1574003891);
            case 26 -> bbbaa(30969512, var9 ^ 122544401);
            case 27 -> bbbaa(30969519, var9 ^ 2093032073);
            case 28 -> bbbaa(30969518, var9 ^ -665594966);
            case 29 -> 2;
            case 30 -> bbbaa(30969517, var9 ^ -1636607363);
            case 31 -> bbbaa(30969516, var9 ^ 2033242984);
            case 32 -> bbbaa(30969507, var9 ^ -1328605164);
            case 33 -> bbbaa(30969506, var9 ^ -2088865420);
            case 34 -> bbbaa(30969505, var9 ^ 345163874);
            case 35 -> 1;
            case 36 -> bbbaa(30969504, var9 ^ 824806160);
            case 37 -> bbbaa(30969511, var9 ^ 1366703646);
            case 38 -> bbbaa(30969510, var9 ^ -1326414192);
            case 39 -> bbbaa(30969509, var9 ^ -12419502);
            case 40 -> bbbaa(30969508, var9 ^ 610325093);
            case 41 -> bbbaa(30969531, var9 ^ -287700756);
            case 42 -> bbbaa(30969530, var9 ^ 35897173);
            case 43 -> bbbaa(30969529, var9 ^ -2128435854);
            case 44 -> bbbaa(30969528, var9 ^ 1714868558);
            case 45 -> bbbaa(30969535, var9 ^ -1354116650);
            case 46 -> bbbaa(30969534, var9 ^ 488627565);
            case 47 -> bbbaa(30969533, var9 ^ -1059959480);
            case 48 -> bbbaa(30969532, var9 ^ 492114780);
            case 49 -> bbbaa(30969523, var9 ^ -485335275);
            case 50 -> bbbaa(30969522, var9 ^ 891849742);
            case 51 -> bbbaa(30969521, var9 ^ -1258594308);
            case 52 -> bbbaa(30969520, var9 ^ -246171201);
            case 53 -> bbbaa(30969527, var9 ^ -1228616891);
            case 54 -> bbbaa(30969526, var9 ^ 275370523);
            case 55 -> bbbaa(30969525, var9 ^ -1090233868);
            case 56 -> bbbaa(30969524, var9 ^ 374105054);
            case 57 -> bbbaa(30969547, var9 ^ -975700213);
            case 58 -> bbbaa(30969546, var9 ^ -931207973);
            case 59 -> bbbaa(30969545, var9 ^ 1038727295);
            case 60 -> bbbaa(30969544, var9 ^ -1464997884);
            case 61 -> bbbaa(30969551, var9 ^ 740588028);
            case 62 -> bbbaa(30969550, var9 ^ 254827694);
            case 63 -> bbbaa(30969549, var9 ^ 889000966);
            case 64 -> bbbaa(30969548, var9 ^ -1797682578);
            case 65 -> bbbaa(30969539, var9 ^ 204391547);
            case 66 -> bbbaa(30969538, var9 ^ 387690125);
            case 67 -> bbbaa(30969537, var9 ^ -1769019867);
            case 68 -> bbbaa(30969536, var9 ^ 928879476);
            case 69 -> bbbaa(30969543, var9 ^ -1543240632);
            case 70 -> bbbaa(30969542, var9 ^ 565431793);
            case 71 -> bbbaa(30969541, var9 ^ 1973805457);
            case 72 -> bbbaa(30969540, var9 ^ 298203400);
            case 73 -> bbbaa(30969563, var9 ^ -1482854568);
            case 74 -> bbbaa(30969562, var9 ^ 866875794);
            case 75 -> bbbaa(30969561, var9 ^ -104100530);
            case 76 -> bbbaa(30969560, var9 ^ 1266303107);
            case 77 -> bbbaa(30969567, var9 ^ -1031737437);
            case 78 -> bbbaa(30969566, var9 ^ -1185099251);
            case 79 -> bbbaa(30969565, var9 ^ -852962300);
            case 80 -> bbbaa(30969564, var9 ^ -945990115);
            case 81 -> bbbaa(30969555, var9 ^ 188713519);
            case 82 -> bbbaa(30969554, var9 ^ -1990337076);
            case 83 -> bbbaa(30969553, var9 ^ -806658002);
            case 84 -> bbbaa(30969552, var9 ^ -1561173352);
            case 85 -> bbbaa(30969559, var9 ^ -1988124842);
            case 86 -> bbbaa(30969558, var9 ^ -2091552981);
            case 87 -> bbbaa(30969557, var9 ^ 1669346167);
            case 88 -> bbbaa(30969556, var9 ^ -1675076267);
            case 89 -> bbbaa(30969579, var9 ^ 1537042848);
            case 90 -> bbbaa(30969578, var9 ^ -2116960662);
            case 91 -> bbbaa(30969577, var9 ^ 1070423431);
            case 92 -> bbbaa(30969576, var9 ^ 459145990);
            case 93 -> bbbaa(30969583, var9 ^ 1696120932);
            case 94 -> bbbaa(30969582, var9 ^ 22922813);
            case 95 -> bbbaa(30969581, var9 ^ 1748467308);
            case 96 -> bbbaa(30969580, var9 ^ 271797580);
            case 97 -> bbbaa(30969571, var9 ^ -612835229);
            case 98 -> bbbaa(30969570, var9 ^ 1875971457);
            case 99 -> bbbaa(30969569, var9 ^ 881609156);
            case 100 -> bbbaa(30969568, var9 ^ 1298421851);
            case 101 -> bbbaa(30969575, var9 ^ 1847379195);
            case 102 -> bbbaa(30969574, var9 ^ 1369207990);
            case 103 -> bbbaa(30969573, var9 ^ 135620394);
            case 104 -> bbbaa(30969572, var9 ^ 247633806);
            case 105 -> bbbaa(30969595, var9 ^ -1243838030);
            case 106 -> bbbaa(30969594, var9 ^ 1812816335);
            case 107 -> bbbaa(30969593, var9 ^ 964205863);
            case 108 -> bbbaa(30969592, var9 ^ -1601324304);
            case 109 -> bbbaa(30969599, var9 ^ -123221086);
            case 110 -> bbbaa(30969598, var9 ^ -777130794);
            case 111 -> bbbaa(30969597, var9 ^ -1991536380);
            case 112 -> bbbaa(30969596, var9 ^ 1974920424);
            case 113 -> bbbaa(30969587, var9 ^ 69858280);
            case 114 -> bbbaa(30969586, var9 ^ 1130744708);
            case 115 -> bbbaa(30969585, var9 ^ -1971427174);
            case 116 -> bbbaa(30969584, var9 ^ -2000455382);
            case 117 -> bbbaa(30969591, var9 ^ -1652234265);
            case 118 -> bbbaa(30969590, var9 ^ -446837738);
            case 119 -> bbbaa(30969589, var9 ^ -1177856551);
            case 120 -> 5;
            case 121 -> bbbaa(30969588, var9 ^ 918375373);
            case 122 -> 3;
            case 123 -> bbbaa(30969355, var9 ^ 362539963);
            case 124 -> bbbaa(30969354, var9 ^ 1818606885);
            case 125 -> bbbaa(30969353, var9 ^ -24635159);
            case 126 -> bbbaa(30969352, var9 ^ 1552540700);
            case 127 -> bbbaa(30969359, var9 ^ 1791333809);
            case 128 -> bbbaa(30969358, var9 ^ -648475154);
            case 129 -> bbbaa(30969357, var9 ^ -253346520);
            case 130 -> bbbaa(30969356, var9 ^ -402194203);
            case 131 -> bbbaa(30969347, var9 ^ 226956589);
            case 132 -> bbbaa(30969346, var9 ^ 1981354259);
            case 133 -> bbbaa(30969345, var9 ^ 566302492);
            case 134 -> bbbaa(30969344, var9 ^ 741758083);
            case 135 -> bbbaa(30969351, var9 ^ -1423895977);
            case 136 -> bbbaa(30969350, var9 ^ 1082231574);
            case 137 -> bbbaa(30969349, var9 ^ -368071853);
            case 138 -> bbbaa(30969348, var9 ^ -1765980161);
            case 139 -> bbbaa(30969371, var9 ^ -2132367294);
            case 140 -> bbbaa(30969370, var9 ^ -1942246730);
            case 141 -> bbbaa(30969369, var9 ^ 838218657);
            case 142 -> bbbaa(30969368, var9 ^ -1492554407);
            case 143 -> bbbaa(30969375, var9 ^ -1230988442);
            case 144 -> bbbaa(30969374, var9 ^ -298875600);
            case 145 -> bbbaa(30969373, var9 ^ -1592452506);
            case 146 -> bbbaa(30969372, var9 ^ -609390559);
            case 147 -> bbbaa(30969363, var9 ^ 1630574771);
            case 148 -> bbbaa(30969362, var9 ^ -1043098410);
            case 149 -> bbbaa(30969361, var9 ^ 1320729613);
            case 150 -> bbbaa(30969360, var9 ^ 2035617706);
            case 151 -> bbbaa(30969367, var9 ^ 1785440229);
            case 152 -> bbbaa(30969366, var9 ^ -1071509244);
            case 153 -> bbbaa(30969365, var9 ^ 85651733);
            case 154 -> bbbaa(30969364, var9 ^ 339170566);
            case 155 -> bbbaa(30969387, var9 ^ 252101149);
            case 156 -> bbbaa(30969386, var9 ^ -522609607);
            case 157 -> bbbaa(30969385, var9 ^ 785388138);
            case 158 -> bbbaa(30969384, var9 ^ -48271652);
            case 159 -> bbbaa(30969391, var9 ^ 1267806090);
            case 160 -> bbbaa(30969390, var9 ^ 811919356);
            case 161 -> bbbaa(30969389, var9 ^ -1588073022);
            case 162 -> bbbaa(30969388, var9 ^ -219157968);
            case 163 -> bbbaa(30969379, var9 ^ 824184600);
            case 164 -> bbbaa(30969378, var9 ^ -1482085858);
            case 165 -> bbbaa(30969377, var9 ^ -780357215);
            case 166 -> bbbaa(30969376, var9 ^ -1753816947);
            case 167 -> bbbaa(30969383, var9 ^ 2031369584);
            case 168 -> 4;
            case 169 -> bbbaa(30969382, var9 ^ 1341890798);
            case 170 -> bbbaa(30969381, var9 ^ 818764291);
            case 171 -> bbbaa(30969380, var9 ^ -438729898);
            case 172 -> bbbaa(30969403, var9 ^ -1195474323);
            case 173 -> bbbaa(30969402, var9 ^ 1648197063);
            case 174 -> bbbaa(30969401, var9 ^ -1302735442);
            case 175 -> bbbaa(30969400, var9 ^ -438881030);
            case 176 -> bbbaa(30969407, var9 ^ 1576850700);
            case 177 -> bbbaa(30969406, var9 ^ 1085638649);
            case 178 -> bbbaa(30969405, var9 ^ 1950366995);
            case 179 -> bbbaa(30969404, var9 ^ 297144514);
            case 180 -> bbbaa(30969395, var9 ^ 95928432);
            case 181 -> bbbaa(30969394, var9 ^ 530129140);
            case 182 -> bbbaa(30969393, var9 ^ -950793243);
            case 183 -> bbbaa(30969392, var9 ^ -563044545);
            case 184 -> bbbaa(30969399, var9 ^ -868244318);
            case 185 -> bbbaa(30969398, var9 ^ -1656236345);
            case 186 -> bbbaa(30969397, var9 ^ 1993420587);
            case 187 -> bbbaa(30969396, var9 ^ 1753065396);
            case 188 -> bbbaa(30969419, var9 ^ -890796959);
            case 189 -> bbbaa(30969418, var9 ^ 344335666);
            case 190 -> bbbaa(30969417, var9 ^ 484637154);
            case 191 -> bbbaa(30969416, var9 ^ 157134964);
            case 192 -> bbbaa(30969423, var9 ^ 2021301270);
            case 193 -> bbbaa(30969422, var9 ^ -338908304);
            case 194 -> bbbaa(30969421, var9 ^ -2010177914);
            case 195 -> 0;
            case 196 -> bbbaa(30969420, var9 ^ 1028168779);
            case 197 -> bbbaa(30969411, var9 ^ 1056334572);
            case 198 -> bbbaa(30969410, var9 ^ -1891976073);
            case 199 -> bbbaa(30969409, var9 ^ 1482232021);
            case 200 -> bbbaa(30969408, var9 ^ 690297761);
            case 201 -> bbbaa(30969415, var9 ^ -424700108);
            case 202 -> bbbaa(30969414, var9 ^ -1021729475);
            case 203 -> bbbaa(30969413, var9 ^ -1847420228);
            case 204 -> bbbaa(30969412, var9 ^ 950800097);
            case 205 -> bbbaa(30969435, var9 ^ -515162181);
            case 206 -> bbbaa(30969434, var9 ^ -1475733959);
            case 207 -> bbbaa(30969433, var9 ^ 1116939734);
            case 208 -> bbbaa(30969432, var9 ^ -344414783);
            case 209 -> bbbaa(30969439, var9 ^ -1779345271);
            case 210 -> bbbaa(30969438, var9 ^ -2117754478);
            case 211 -> bbbaa(30969437, var9 ^ 770044879);
            case 212 -> bbbaa(30969436, var9 ^ 1708221857);
            case 213 -> bbbaa(30969427, var9 ^ -1677811950);
            case 214 -> bbbaa(30969426, var9 ^ -1961385274);
            case 215 -> bbbaa(30969425, var9 ^ 1875145136);
            case 216 -> bbbaa(30969424, var9 ^ 652213424);
            case 217 -> bbbaa(30969431, var9 ^ 2118195940);
            case 218 -> bbbaa(30969430, var9 ^ 238735355);
            case 219 -> bbbaa(30969429, var9 ^ -945566853);
            case 220 -> bbbaa(30969428, var9 ^ -1030152891);
            case 221 -> bbbaa(30969451, var9 ^ 1897599169);
            case 222 -> bbbaa(30969450, var9 ^ 1630165682);
            case 223 -> bbbaa(30969449, var9 ^ -1275810673);
            case 224 -> bbbaa(30969448, var9 ^ 719379496);
            case 225 -> bbbaa(30969455, var9 ^ 653023370);
            case 226 -> bbbaa(30969454, var9 ^ 71831227);
            case 227 -> bbbaa(30969453, var9 ^ 355463253);
            case 228 -> bbbaa(30969452, var9 ^ -842344314);
            case 229 -> bbbaa(30969443, var9 ^ -257613570);
            case 230 -> bbbaa(30969442, var9 ^ 1728323415);
            case 231 -> bbbaa(30969441, var9 ^ -719357220);
            case 232 -> bbbaa(30969440, var9 ^ -706843094);
            case 233 -> bbbaa(30969447, var9 ^ -298460436);
            case 234 -> bbbaa(30969446, var9 ^ 1975698138);
            case 235 -> bbbaa(30969445, var9 ^ -578146383);
            case 236 -> bbbaa(30969444, var9 ^ -289437110);
            case 237 -> bbbaa(30969467, var9 ^ -664299619);
            case 238 -> bbbaa(30969466, var9 ^ 1496514828);
            case 239 -> bbbaa(30969465, var9 ^ 935682857);
            case 240 -> bbbaa(30969464, var9 ^ -1624488473);
            case 241 -> bbbaa(30969471, var9 ^ -1555907799);
            case 242 -> bbbaa(30969470, var9 ^ 437232850);
            case 243 -> bbbaa(30969469, var9 ^ -803929168);
            case 244 -> bbbaa(30969468, var9 ^ 693946111);
            case 245 -> bbbaa(30969459, var9 ^ 1686600985);
            case 246 -> bbbaa(30969458, var9 ^ -777697323);
            case 247 -> bbbaa(30969457, var9 ^ -1544473775);
            case 248 -> bbbaa(30969456, var9 ^ -2065349334);
            case 249 -> bbbaa(30969463, var9 ^ -711288297);
            case 250 -> bbbaa(30969462, var9 ^ 697552980);
            case 251 -> bbbaa(30969461, var9 ^ 1052126901);
            case 252 -> bbbaa(30969460, var9 ^ 1454344656);
            case 253 -> bbbaa(30969739, var9 ^ -614544317);
            case 254 -> bbbaa(30969738, var9 ^ -1091141565);
            default -> bbbaa(30969737, var9 ^ 1449974934);
         };
         int var5 = (var1 & bbbaa(30969736, var9 ^ 1629442217)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & bbbaa(30969743, var9 ^ 1003097890)) >>> bbbaa(30969742, var9 ^ 1743292642)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & bbbaa(30969741, var9 ^ -951374848);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & bbbaa(30969740, var9 ^ 659791679);
            }
         }

         aaabb[var2] = new String(var3).intern();
      }

      return aaabb[var2];
   }

   private float aaab(class_1293 param1) {
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
      // 06: ifne 1f
      // 09: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
      // 0c: getstatic net/minecraft/class_1294.field_5915 Lnet/minecraft/class_6880;
      // 0f: invokeinterface net/minecraft/class_6880.equals (Ljava/lang/Object;)Z 2
      // 14: ifne 1e
      // 17: goto 1b
      // 1a: athrow
      // 1b: fconst_0
      // 1c: freturn
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokevirtual net/minecraft/class_1293.method_5578 ()I
      // 22: bipush 1
      // 23: if_icmplt 2d
      // 26: ldc_w 7.0
      // 29: goto 30
      // 2c: athrow
      // 2d: ldc_w 3.0
      // 30: freturn
   }

   private boolean aaba(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbb Ljava/util/List;
      // 07: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0c: astore 3
      // 0d: istore 2
      // 0e: aload 3
      // 0f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 14: ifeq 41
      // 17: aload 3
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast net/minecraft/class_1799
      // 20: astore 4
      // 22: aload 4
      // 24: aload 1
      // 25: invokestatic net/minecraft/class_1799.method_31577 (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 28: iload 2
      // 29: ifne 42
      // 2c: iload 2
      // 2d: ifne 3c
      // 30: goto 34
      // 33: athrow
      // 34: ifeq 3d
      // 37: goto 3b
      // 3a: athrow
      // 3b: bipush 1
      // 3c: ireturn
      // 3d: iload 2
      // 3e: ifeq 0e
      // 41: bipush 0
      // 42: ireturn
   }

   private boolean aabb(class_1799 param1) {
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
      // 09: ifnull 35
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 14: iload 2
      // 15: ifne 3a
      // 18: ifne 35
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: iload 2
      // 21: ifne 42
      // 24: goto 28
      // 27: athrow
      // 28: getstatic net/minecraft/class_1802.field_8436 Lnet/minecraft/class_1792;
      // 2b: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 2e: ifne 3b
      // 31: goto 35
      // 34: athrow
      // 35: bipush 0
      // 36: goto 3a
      // 39: athrow
      // 3a: ireturn
      // 3b: aload 1
      // 3c: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
      // 3f: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 42: checkcast net/minecraft/class_1844
      // 45: astore 3
      // 46: aload 3
      // 47: iload 2
      // 48: ifne 53
      // 4b: ifnull 61
      // 4e: goto 52
      // 51: athrow
      // 52: aload 3
      // 53: iload 2
      // 54: ifne 65
      // 57: invokevirtual net/minecraft/class_1844.method_57405 ()Z
      // 5a: ifne 64
      // 5d: goto 61
      // 60: athrow
      // 61: bipush 0
      // 62: ireturn
      // 63: athrow
      // 64: aload 3
      // 65: invokevirtual net/minecraft/class_1844.method_57397 ()Ljava/lang/Iterable;
      // 68: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 6d: astore 4
      // 6f: aload 4
      // 71: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 76: ifeq a6
      // 79: aload 4
      // 7b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 80: checkcast net/minecraft/class_1293
      // 83: astore 5
      // 85: aload 5
      // 87: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
      // 8a: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
      // 8f: checkcast net/minecraft/class_1291
      // 92: astore 6
      // 94: aload 6
      // 96: invokevirtual net/minecraft/class_1291.method_18792 ()Lnet/minecraft/class_4081;
      // 99: getstatic net/minecraft/class_4081.field_18272 Lnet/minecraft/class_4081;
      // 9c: if_acmpne a2
      // 9f: bipush 0
      // a0: ireturn
      // a1: athrow
      // a2: iload 2
      // a3: ifeq 6f
      // a6: bipush 1
      // a7: ireturn
   }

   private long abaa(aaabbbab var1) {
      double var2 = var1.bab();
      double var4 = var1.abb();

      try {
         if (var2 == var4) {
            return Math.max(0L, Math.round(var2));
         }
      } catch (MatchException var6) {
         throw var6;
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private bbbaaabb abab(class_746 param1, long param2, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: lload 2
      // 03: iload 4
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baabb (Lnet/minecraft/class_746;JZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb;
      // 08: astore 6
      // 0a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0d: bipush 0
      // 0e: istore 7
      // 10: istore 5
      // 12: iload 7
      // 14: ldc_w 30969731
      // 17: ldc_w 1416793353
      // 1a: ldc_w -1426144063
      // 1d: ixor
      // 1e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 21: ldc2_w 1046420959357774965
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba (IJ)I
      // 27: if_icmpge e0
      // 2a: aload 1
      // 2b: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 2e: iload 7
      // 30: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 33: astore 8
      // 35: aload 0
      // 36: aload 1
      // 37: aload 8
      // 39: iload 7
      // 3b: lload 2
      // 3c: iload 4
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bab (Lnet/minecraft/class_746;Lnet/minecraft/class_1799;IJZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb;
      // 41: iload 5
      // 43: ifne e2
      // 46: astore 9
      // 48: iload 5
      // 4a: ifne db
      // 4d: aload 9
      // 4f: ifnull d8
      // 52: goto 56
      // 55: athrow
      // 56: aload 9
      // 58: iload 5
      // 5a: ifne 7a
      // 5d: goto 61
      // 60: athrow
      // 61: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.ab ()I
      // 64: ifgt 74
      // 67: goto 6b
      // 6a: athrow
      // 6b: iload 5
      // 6d: ifeq d8
      // 70: goto 74
      // 73: athrow
      // 74: aload 9
      // 76: goto 7a
      // 79: athrow
      // 7a: iload 5
      // 7c: ifne aa
      // 7f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.b ()F
      // 82: fconst_0
      // 83: fcmpg
      // 84: ifgt a4
      // 87: goto 8b
      // 8a: athrow
      // 8b: aload 0
      // 8c: aload 9
      // 8e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.ba ()Lnet/minecraft/class_1799;
      // 91: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaba (Lnet/minecraft/class_1799;)Z
      // 94: ifeq a4
      // 97: goto 9b
      // 9a: athrow
      // 9b: iload 5
      // 9d: ifeq d8
      // a0: goto a4
      // a3: athrow
      // a4: aload 6
      // a6: goto aa
      // a9: athrow
      // aa: iload 5
      // ac: ifne d6
      // af: ifnull d0
      // b2: goto b6
      // b5: athrow
      // b6: aload 9
      // b8: iload 5
      // ba: ifne d6
      // bd: goto c1
      // c0: athrow
      // c1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.ab ()I
      // c4: aload 6
      // c6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.ab ()I
      // c9: if_icmple d8
      // cc: goto d0
      // cf: athrow
      // d0: aload 9
      // d2: goto d6
      // d5: athrow
      // d6: astore 6
      // d8: iinc 7 1
      // db: iload 5
      // dd: ifeq 12
      // e0: aload 6
      // e2: areturn
   }

   private double abba(class_310 param1, class_1309 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 1
      // 005: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 008: ifnull 01b
      // 00b: aload 2
      // 00c: iload 3
      // 00d: ifne 021
      // 010: goto 014
      // 013: athrow
      // 014: ifnonnull 020
      // 017: goto 01b
      // 01a: athrow
      // 01b: ldc2_w Infinity
      // 01e: dreturn
      // 01f: athrow
      // 020: aload 2
      // 021: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
      // 024: astore 4
      // 026: aload 4
      // 028: getfield net/minecraft/class_238.field_1322 D
      // 02b: dstore 5
      // 02d: aload 4
      // 02f: getfield net/minecraft/class_238.field_1323 D
      // 032: ldc2_w 0.05
      // 035: dadd
      // 036: aload 4
      // 038: getfield net/minecraft/class_238.field_1323 D
      // 03b: aload 4
      // 03d: getfield net/minecraft/class_238.field_1320 D
      // 040: dadd
      // 041: ldc2_w 0.5
      // 044: dmul
      // 045: invokestatic java/lang/Math.min (DD)D
      // 048: dstore 7
      // 04a: aload 4
      // 04c: getfield net/minecraft/class_238.field_1320 D
      // 04f: ldc2_w 0.05
      // 052: dsub
      // 053: aload 4
      // 055: getfield net/minecraft/class_238.field_1323 D
      // 058: aload 4
      // 05a: getfield net/minecraft/class_238.field_1320 D
      // 05d: dadd
      // 05e: ldc2_w 0.5
      // 061: dmul
      // 062: invokestatic java/lang/Math.max (DD)D
      // 065: dstore 9
      // 067: aload 4
      // 069: getfield net/minecraft/class_238.field_1321 D
      // 06c: ldc2_w 0.05
      // 06f: dadd
      // 070: aload 4
      // 072: getfield net/minecraft/class_238.field_1321 D
      // 075: aload 4
      // 077: getfield net/minecraft/class_238.field_1324 D
      // 07a: dadd
      // 07b: ldc2_w 0.5
      // 07e: dmul
      // 07f: invokestatic java/lang/Math.min (DD)D
      // 082: dstore 11
      // 084: aload 4
      // 086: getfield net/minecraft/class_238.field_1324 D
      // 089: ldc2_w 0.05
      // 08c: dsub
      // 08d: aload 4
      // 08f: getfield net/minecraft/class_238.field_1321 D
      // 092: aload 4
      // 094: getfield net/minecraft/class_238.field_1324 D
      // 097: dadd
      // 098: ldc2_w 0.5
      // 09b: dmul
      // 09c: invokestatic java/lang/Math.max (DD)D
      // 09f: dstore 13
      // 0a1: aload 4
      // 0a3: getfield net/minecraft/class_238.field_1323 D
      // 0a6: aload 4
      // 0a8: getfield net/minecraft/class_238.field_1320 D
      // 0ab: dadd
      // 0ac: ldc2_w 0.5
      // 0af: dmul
      // 0b0: dstore 15
      // 0b2: aload 4
      // 0b4: getfield net/minecraft/class_238.field_1321 D
      // 0b7: aload 4
      // 0b9: getfield net/minecraft/class_238.field_1324 D
      // 0bc: dadd
      // 0bd: ldc2_w 0.5
      // 0c0: dmul
      // 0c1: dstore 17
      // 0c3: bipush 3
      // 0c4: newarray 7
      // 0c6: dup
      // 0c7: bipush 0
      // 0c8: dload 7
      // 0ca: dastore
      // 0cb: dup
      // 0cc: bipush 1
      // 0cd: dload 15
      // 0cf: dastore
      // 0d0: dup
      // 0d1: bipush 2
      // 0d2: dload 9
      // 0d4: dastore
      // 0d5: astore 19
      // 0d7: bipush 3
      // 0d8: newarray 7
      // 0da: dup
      // 0db: bipush 0
      // 0dc: dload 11
      // 0de: dastore
      // 0df: dup
      // 0e0: bipush 1
      // 0e1: dload 17
      // 0e3: dastore
      // 0e4: dup
      // 0e5: bipush 2
      // 0e6: dload 13
      // 0e8: dastore
      // 0e9: astore 20
      // 0eb: dload 5
      // 0ed: ldc2_w 1.0E-4
      // 0f0: dsub
      // 0f1: invokestatic java/lang/Math.floor (D)D
      // 0f4: d2i
      // 0f5: istore 21
      // 0f7: aload 1
      // 0f8: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0fb: invokevirtual net/minecraft/class_638.method_31607 ()I
      // 0fe: dload 5
      // 100: dconst_1
      // 101: dsub
      // 102: dconst_1
      // 103: dsub
      // 104: invokestatic java/lang/Math.floor (D)D
      // 107: d2i
      // 108: invokestatic java/lang/Math.max (II)I
      // 10b: istore 22
      // 10d: ldc2_w Infinity
      // 110: dstore 23
      // 112: aload 19
      // 114: astore 25
      // 116: aload 25
      // 118: arraylength
      // 119: istore 26
      // 11b: bipush 0
      // 11c: istore 27
      // 11e: iload 27
      // 120: iload 26
      // 122: if_icmpge 202
      // 125: aload 25
      // 127: iload 27
      // 129: daload
      // 12a: iload 3
      // 12b: ifne 204
      // 12e: dstore 28
      // 130: aload 20
      // 132: astore 30
      // 134: aload 30
      // 136: arraylength
      // 137: istore 31
      // 139: bipush 0
      // 13a: istore 32
      // 13c: iload 32
      // 13e: iload 31
      // 140: if_icmpge 1fb
      // 143: aload 30
      // 145: iload 32
      // 147: iload 3
      // 148: ifne 129
      // 14b: daload
      // 14c: dstore 33
      // 14e: iload 21
      // 150: istore 35
      // 152: iload 35
      // 154: iload 22
      // 156: if_icmplt 1f4
      // 159: iload 3
      // 15a: ifne 1f7
      // 15d: dload 28
      // 15f: iload 35
      // 161: i2d
      // 162: dload 33
      // 164: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 167: astore 36
      // 169: aload 1
      // 16a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16d: aload 36
      // 16f: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 172: astore 37
      // 174: aload 37
      // 176: iload 3
      // 177: ifne 192
      // 17a: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 17d: ifeq 18c
      // 180: goto 184
      // 183: athrow
      // 184: iload 3
      // 185: ifeq 1ed
      // 188: goto 18c
      // 18b: athrow
      // 18c: aload 37
      // 18e: goto 192
      // 191: athrow
      // 192: aload 1
      // 193: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 196: aload 36
      // 198: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 19b: astore 38
      // 19d: aload 38
      // 19f: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 1a2: iload 3
      // 1a3: ifne 1be
      // 1a6: ifeq 1b5
      // 1a9: goto 1ad
      // 1ac: athrow
      // 1ad: iload 3
      // 1ae: ifeq 1ed
      // 1b1: goto 1b5
      // 1b4: athrow
      // 1b5: aload 36
      // 1b7: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 1ba: goto 1be
      // 1bd: athrow
      // 1be: i2d
      // 1bf: aload 38
      // 1c1: getstatic net/minecraft/class_2350$class_2351.field_11052 Lnet/minecraft/class_2350$class_2351;
      // 1c4: invokevirtual net/minecraft/class_265.method_1105 (Lnet/minecraft/class_2350$class_2351;)D
      // 1c7: dadd
      // 1c8: dstore 39
      // 1ca: iload 3
      // 1cb: dconst_0
      // 1cc: dload 5
      // 1ce: dload 39
      // 1d0: dsub
      // 1d1: invokestatic java/lang/Math.max (DD)D
      // 1d4: dstore 41
      // 1d6: ifne 1f0
      // 1d9: dload 23
      // 1db: dload 41
      // 1dd: invokestatic java/lang/Math.min (DD)D
      // 1e0: dstore 23
      // 1e2: dload 23
      // 1e4: dconst_1
      // 1e5: dcmpg
      // 1e6: ifge 1ed
      // 1e9: dload 23
      // 1eb: dreturn
      // 1ec: athrow
      // 1ed: iinc 35 -1
      // 1f0: iload 3
      // 1f1: ifeq 152
      // 1f4: iinc 32 1
      // 1f7: iload 3
      // 1f8: ifeq 13c
      // 1fb: iinc 27 1
      // 1fe: iload 3
      // 1ff: ifeq 11e
      // 202: dload 23
      // 204: dreturn
   }

   private void abbb() {
      this.abaaa = 0L;
      this.aaaabb = 0.0F;
      this.abbba = 0L;
   }

   private boolean baaa(class_310 param1) {
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
      // 05: aload 1
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba (Lnet/minecraft/class_310;)Z
      // 09: iload 2
      // 0a: ifne 15
      // 0d: ifne 16
      // 10: goto 14
      // 13: athrow
      // 14: bipush 0
      // 15: ireturn
      // 16: aload 1
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbbb (Lnet/minecraft/class_310;)V
      // 1a: aload 1
      // 1b: aload 0
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb Lnet/minecraft/class_1268;
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;
      // 22: astore 3
      // 23: aload 3
      // 24: iload 2
      // 25: ifne 30
      // 28: ifnull 44
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 3
      // 30: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 35: iload 2
      // 36: ifne 41
      // 39: ifeq 44
      // 3c: goto 40
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 45
      // 44: bipush 0
      // 45: istore 4
      // 47: iload 4
      // 49: iload 2
      // 4a: ifne 5f
      // 4d: ifeq 5d
      // 50: goto 54
      // 53: athrow
      // 54: aload 0
      // 55: aload 1
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbab (Lnet/minecraft/class_310;)V
      // 59: goto 5d
      // 5c: athrow
      // 5d: iload 4
      // 5f: ireturn
   }

   private static int bbbaa(int var0, int var1) {
      int var2 = aabbbb[var0 ^ 30969483] ^ var1 ^ var0;
      var2 ^= 30967;
      var2 -= 33753;
      var2 ^= 18522;
      var2 += 43012;
      var2 += 23922;
      var2 += 25837;
      var2 ^= 34771;
      var2 -= 61375;
      return var2 ^ 16154;
   }

   private boolean baab(class_310 param1, class_1309 param2) {
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
      // 09: ifnull 61
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: iload 3
      // 15: ifne 20
      // 18: ifnull 61
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 2
      // 20: iload 3
      // 21: ifne 2c
      // 24: ifnull 61
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 2
      // 2c: iload 3
      // 2d: ifne 44
      // 30: aload 1
      // 31: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 34: if_acmpeq 61
      // 37: goto 3b
      // 3a: athrow
      // 3b: aload 2
      // 3c: iload 3
      // 3d: ifne 4f
      // 40: goto 44
      // 43: athrow
      // 44: invokevirtual net/minecraft/class_1309.method_5805 ()Z
      // 47: ifeq 61
      // 4a: aload 2
      // 4b: goto 4f
      // 4e: athrow
      // 4f: invokevirtual net/minecraft/class_1309.method_31481 ()Z
      // 52: iload 3
      // 53: ifne 5e
      // 56: ifne 61
      // 59: goto 5d
      // 5c: athrow
      // 5d: bipush 1
      // 5e: goto 62
      // 61: bipush 0
      // 62: ireturn
   }

   private boolean baba(class_310 param1) {
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
      // 09: ifnull 9b
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 9b
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnull 9b
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 3e: ifnull 9b
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: iload 2
      // 4b: ifne 5d
      // 4e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 51: ifnull 9b
      // 54: goto 58
      // 57: athrow
      // 58: aload 1
      // 59: goto 5d
      // 5c: athrow
      // 5d: iload 2
      // 5e: ifne 73
      // 61: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 64: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 67: ifnull 9b
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 1
      // 6f: goto 73
      // 72: athrow
      // 73: iload 2
      // 74: ifne 86
      // 77: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 7a: ifnonnull 9b
      // 7d: goto 81
      // 80: athrow
      // 81: aload 1
      // 82: goto 86
      // 85: athrow
      // 86: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 89: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 8c: iload 2
      // 8d: ifne 98
      // 90: ifeq 9b
      // 93: goto 97
      // 96: athrow
      // 97: bipush 1
      // 98: goto 9c
      // 9b: bipush 0
      // 9c: ireturn
   }

   private void babb(class_310 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 0
      // 006: iload 4
      // 008: ifne 03a
      // 00b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabaa Z
      // 00e: ifeq 039
      // 011: goto 015
      // 014: athrow
      // 015: aload 0
      // 016: iload 4
      // 018: ifne 03a
      // 01b: goto 01f
      // 01e: athrow
      // 01f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 022: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 025: checkcast java/lang/Boolean
      // 028: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02b: ifne 039
      // 02e: goto 032
      // 031: athrow
      // 032: aload 0
      // 033: aload 1
      // 034: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 037: return
      // 038: athrow
      // 039: aload 0
      // 03a: iload 4
      // 03c: ifne 052
      // 03f: aload 1
      // 040: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbaaa (Lnet/minecraft/class_310;)Z
      // 043: ifne 051
      // 046: goto 04a
      // 049: athrow
      // 04a: aload 0
      // 04b: aload 1
      // 04c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 04f: return
      // 050: athrow
      // 051: aload 0
      // 052: iload 4
      // 054: ifne 117
      // 057: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabaa Z
      // 05a: ifeq 116
      // 05d: goto 061
      // 060: athrow
      // 061: aload 0
      // 062: iload 4
      // 064: ifne 0d1
      // 067: goto 06b
      // 06a: athrow
      // 06b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 06e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 071: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaab;
      // 074: if_acmpne 0cc
      // 077: goto 07b
      // 07a: athrow
      // 07b: aload 0
      // 07c: iload 4
      // 07e: ifne 0c1
      // 081: goto 085
      // 084: athrow
      // 085: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 088: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 08b: if_acmpeq 0c0
      // 08e: goto 092
      // 091: athrow
      // 092: aload 1
      // 093: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 096: astore 6
      // 098: aload 0
      // 099: aload 6
      // 09b: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 09e: dconst_0
      // 09f: ldc2_w -2.0
      // 0a2: dconst_0
      // 0a3: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 0a6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaba Lnet/minecraft/class_243;
      // 0a9: aload 0
      // 0aa: lload 2
      // 0ab: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaba J
      // 0ae: aload 0
      // 0af: bipush 0
      // 0b0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaba I
      // 0b3: aload 0
      // 0b4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 0b7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 0ba: aload 0
      // 0bb: lload 2
      // 0bc: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaaa J
      // 0bf: return
      // 0c0: aload 0
      // 0c1: aload 1
      // 0c2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babba (Lnet/minecraft/class_310;)Z
      // 0c5: istore 5
      // 0c7: iload 4
      // 0c9: ifeq 11d
      // 0cc: aload 0
      // 0cd: goto 0d1
      // 0d0: athrow
      // 0d1: aload 1
      // 0d2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aab (Lnet/minecraft/class_310;)Z
      // 0d5: istore 5
      // 0d7: iload 4
      // 0d9: ifne 107
      // 0dc: iload 5
      // 0de: ifeq 10c
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: aload 1
      // 0e7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbab (Lnet/minecraft/class_310;)V
      // 0ea: aload 0
      // 0eb: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 0ee: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 0f1: aload 0
      // 0f2: lload 2
      // 0f3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaaa J
      // 0f6: aload 0
      // 0f7: aload 1
      // 0f8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0fb: getfield net/minecraft/class_746.field_6012 I
      // 0fe: bipush 1
      // 0ff: iadd
      // 100: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baa I
      // 103: goto 107
      // 106: athrow
      // 107: iload 4
      // 109: ifeq 115
      // 10c: aload 0
      // 10d: aload 1
      // 10e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.b (Lnet/minecraft/class_310;)V
      // 111: goto 115
      // 114: athrow
      // 115: return
      // 116: aload 0
      // 117: aload 1
      // 118: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaa (Lnet/minecraft/class_310;)Z
      // 11b: istore 5
      // 11d: aload 0
      // 11e: aload 1
      // 11f: iload 5
      // 121: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbba (Lnet/minecraft/class_310;Z)V
      // 124: return
   }

   public aababb() {
      this(null);
   }

   private void bbab(class_310 param1) {
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
      // 09: ifnull 35
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnull 35
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 27: iload 2
      // 28: ifne 45
      // 2b: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 2e: ifnonnull 37
      // 31: goto 35
      // 34: athrow
      // 35: return
      // 36: athrow
      // 37: aload 1
      // 38: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 3b: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababaa (Lnet/minecraft/class_304;)V
      // 41: aload 1
      // 42: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 45: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 48: bipush 0
      // 49: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 4c: return
   }

   private void bbba(class_310 param1, boolean param2) {
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
      // 005: iload 3
      // 006: ifne 040
      // 009: ldc_w 30969602
      // 00c: ldc_w -180119451
      // 00f: ldc_w 507914411
      // 012: ixor
      // 013: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 016: ldc2_w 8612713963505555398
      // 019: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba (IJ)I
      // 01c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baa I
      // 01f: iload 2
      // 020: ifeq 03b
      // 023: goto 027
      // 026: athrow
      // 027: aload 0
      // 028: iload 3
      // 029: ifne 040
      // 02c: goto 030
      // 02f: athrow
      // 030: aload 1
      // 031: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba (Lnet/minecraft/class_310;)Z
      // 034: ifne 045
      // 037: goto 03b
      // 03a: athrow
      // 03b: aload 0
      // 03c: goto 040
      // 03f: athrow
      // 040: aload 1
      // 041: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.b (Lnet/minecraft/class_310;)V
      // 044: return
      // 045: aload 1
      // 046: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 049: astore 4
      // 04b: invokestatic java/lang/System.currentTimeMillis ()J
      // 04e: lstore 5
      // 050: aload 0
      // 051: lload 5
      // 053: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba J
      // 056: aload 0
      // 057: iload 3
      // 058: ifne 094
      // 05b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabbaa F
      // 05e: fconst_0
      // 05f: fcmpg
      // 060: ifgt 07c
      // 063: goto 067
      // 066: athrow
      // 067: aload 0
      // 068: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbb Ljava/util/List;
      // 06b: aload 0
      // 06c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbba Lnet/minecraft/class_1799;
      // 06f: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
      // 072: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 077: pop
      // 078: goto 07c
      // 07b: athrow
      // 07c: aload 0
      // 07d: lload 5
      // 07f: aload 0
      // 080: aload 0
      // 081: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaabab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 084: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 087: ladd
      // 088: iload 3
      // 089: ifne 135
      // 08c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabab J
      // 08f: aload 0
      // 090: goto 094
      // 093: athrow
      // 094: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabbaa F
      // 097: fconst_0
      // 098: fcmpl
      // 099: ifle 12b
      // 09c: aload 0
      // 09d: aload 4
      // 09f: iload 3
      // 0a0: ifne 13b
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: invokevirtual net/minecraft/class_746.method_6063 ()F
      // 0aa: aload 4
      // 0ac: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 0af: aload 0
      // 0b0: aload 4
      // 0b2: lload 5
      // 0b4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babaa (Lnet/minecraft/class_746;J)F
      // 0b7: invokestatic java/lang/Math.max (FF)F
      // 0ba: aload 0
      // 0bb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabbaa F
      // 0be: fadd
      // 0bf: invokestatic java/lang/Math.min (FF)F
      // 0c2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaabb F
      // 0c5: aload 0
      // 0c6: lload 5
      // 0c8: ldc_w 30969601
      // 0cb: ldc_w -180119451
      // 0ce: ldc_w -1310545200
      // 0d1: ixor
      // 0d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 0d5: ldc2_w 5692506402856885951
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbbb (IJ)J
      // 0db: ladd
      // 0dc: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa J
      // 0df: aload 0
      // 0e0: lload 5
      // 0e2: ldc_w 30969600
      // 0e5: ldc_w -180119451
      // 0e8: ldc_w -1899810233
      // 0eb: ixor
      // 0ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 0ef: ldc2_w 7303040607523701572
      // 0f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbbb (IJ)J
      // 0f5: ladd
      // 0f6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbba J
      // 0f9: aload 0
      // 0fa: aload 4
      // 0fc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbba (Lnet/minecraft/class_746;)Z
      // 0ff: ifne 12b
      // 102: goto 106
      // 105: athrow
      // 106: aload 0
      // 107: aload 0
      // 108: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabab J
      // 10b: lload 5
      // 10d: ldc_w 30969607
      // 110: ldc_w -180119451
      // 113: ldc_w 2081994239
      // 116: ixor
      // 117: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 11a: ldc2_w 2369808602356067335
      // 11d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbbb (IJ)J
      // 120: ladd
      // 121: invokestatic java/lang/Math.max (JJ)J
      // 124: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabab J
      // 127: goto 12b
      // 12a: athrow
      // 12b: aload 0
      // 12c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 12f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 132: aload 0
      // 133: lload 5
      // 135: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaaa J
      // 138: aload 0
      // 139: aload 4
      // 13b: getfield net/minecraft/class_746.field_6012 I
      // 13e: bipush 1
      // 13f: iadd
      // 140: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaabba I
      // 143: return
   }

   private boolean bbbb(bbbaaabb var1, long var2) {
      try {
         if (var1.aa() != class_1268.field_5810) {
            this.babb = class_1268.field_5808;
            return false;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      this.babb = class_1268.field_5810;
      this.aaaaab = -1;
      this.aabbba = -1;
      this.baaaa = var2;
      return true;
   }

   private boolean aaaaa(long param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa J
      // 08: lconst_0
      // 09: lcmp
      // 0a: iload 3
      // 0b: ifne 54
      // 0e: ifeq 53
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba J
      // 19: lconst_0
      // 1a: lcmp
      // 1b: iload 3
      // 1c: ifne 54
      // 1f: goto 23
      // 22: athrow
      // 23: ifle 53
      // 26: goto 2a
      // 29: athrow
      // 2a: lload 1
      // 2b: aload 0
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba J
      // 2f: lsub
      // 30: ldc_w 30969606
      // 33: ldc_w 290121053
      // 36: ldc_w -1096375
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 3d: ldc2_w 1133192107983691550
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbbb (IJ)J
      // 43: lcmp
      // 44: iload 3
      // 45: ifne 54
      // 48: goto 4c
      // 4b: athrow
      // 4c: iflt 57
      // 4f: goto 53
      // 52: athrow
      // 53: bipush 1
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   private float aaaab(class_310 var1) {
      return 90.0F;
   }

   public aababb(baaaabaa var1) {
      int var2 = -1617044030;
      super(
         aabbaaaba.aaab(aaaa(bbbaa(30969605, var2 ^ 221735040), bbbaa(30969604, var2 ^ 33148717))),
         bbaabbba.aa,
         aabbaaaba.aaab(aaaa(bbbaa(30969627, var2 ^ 1789862813), bbbaa(30969626, var2 ^ -205636564)))
      );
      this.baaab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaaa(bbbaa(30969625, var2 ^ -269666888), bbbaa(30969624, var2 ^ -241933352))), false
         )
      );
      this.abbab = (baabaab)this.abbbaaa(
         (baabaab)new baabaab(
               aabbaaaba.aaab(aaaa(bbbaa(30969631, var2 ^ 1351739858), bbbaa(30969630, var2 ^ -1848820187))),
               aaaaaab.class,
               aaaaaab.aa
            )
            .babb(this.baaab::abbb)
      );
      this.abaab = (bababa)this.abbbaaa(
         (bababa)new bababa(
               aabbaaaba.aaab(aaaa(bbbaa(30969629, var2 ^ -16127348), bbbaa(30969628, var2 ^ 1105446126))),
               75.0,
               30.0,
               90.0,
               1.0
            )
            .bba(aabbaaaba.aaab(aaaa(bbbaa(30969619, var2 ^ -1062466387), bbbaa(30969618, var2 ^ 2012024434))))
            .babb(this::aaa)
      );
      this.bbaab = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(aaaa(bbbaa(30969617, var2 ^ -689411262), bbbaa(30969616, var2 ^ -2040737649))),
               55.0,
               60.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(aaaa(bbbaa(30969623, var2 ^ -76157710), bbbaa(30969622, var2 ^ 360530633))))
      );
      this.aaabab = (aaabbbab)this.abbbaaa(
         (aaabbbab)new aaabbbab(
               aabbaaaba.aaab(aaaa(bbbaa(30969621, var2 ^ 1193135146), bbbaa(30969620, var2 ^ -83857223))),
               0.0,
               0.0,
               0.0,
               250.0,
               1.0
            )
            .bbb(aabbaaaba.aaab(aaaa(bbbaa(30969643, var2 ^ 346918757), bbbaa(30969642, var2 ^ -342546023))))
            .babb(aababb::ba)
      );
      this.aaaa = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aaaa(bbbaa(30969641, var2 ^ -96487688), bbbaa(30969640, var2 ^ 773301050))), 3.0, 0.0, 30.0, 0.5
            )
            .bba(aabbaaaba.aaab(aaaa(bbbaa(30969647, var2 ^ -294511976), bbbaa(30969646, var2 ^ 906451722))))
      );
      this.aaaab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaaa(bbbaa(30969645, var2 ^ 2066331712), bbbaa(30969644, var2 ^ 381195373))), true
         )
      );
      this.bba = (bababa)this.abbbaaa(
         (bababa)new bababa(
               aabbaaaba.aaab(aaaa(bbbaa(30969635, var2 ^ 1730516125), bbbaa(30969634, var2 ^ -1889051299))),
               10.0,
               1.0,
               20.0,
               0.5
            )
            .bba(aabbaaaba.aaab(aaaa(bbbaa(30969633, var2 ^ -110557854), bbbaa(30969632, var2 ^ -380609710))))
            .babb(this.aaaab::abbb)
      );
      this.aaaaa = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaaa(bbbaa(30969639, var2 ^ 929859259), bbbaa(30969638, var2 ^ 523946949))), false
         )
      );
      this.aabaaa = (abaabbbb)this.abbbaaa(
         new abaabbbb(
            aabbaaaba.aaab(aaaa(bbbaa(30969637, var2 ^ -1860852830), bbbaa(30969636, var2 ^ -1015678747))),
            baab,
            Set.of(ababb, aaa, babab)
         )
      );
      this.babbb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaaa(bbbaa(30969659, var2 ^ 1238906983), bbbaa(30969658, var2 ^ -121138159))), true
         )
      );
      this.aabbb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaaa(bbbaa(30969657, var2 ^ 1994264182), bbbaa(30969656, var2 ^ -163105700))), true
         )
      );
      this.ababa = (bababa)this.abbbaaa(
         (bababa)new bababa(
               aabbaaaba.aaab(aaaa(bbbaa(30969663, var2 ^ 1475124443), bbbaa(30969662, var2 ^ -1332049453))),
               50.0,
               1.0,
               100.0,
               1.0
            )
            .babb(this::aabab)
      );
      this.bbaba = new ababbbbba();
      this.abbaa = bbbabab.aa;
      this.bbbba = class_1799.field_8037;
      this.aaaaab = -1;
      this.aabb = -1;
      this.babb = class_1268.field_5808;
      this.aaabba = bba(bbbaa(30969661, var2 ^ 1556721810), 7391657697804185934L);
      this.aabbba = -1;
      this.baa = bba(bbbaa(30969660, var2 ^ 1709566113), 8612713963505555398L);
      this.abbb = new ArrayList();
      this.aaaaba = var1;
   }

   public boolean aaaba() {
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
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babbaab ()Z
      // 0c: ifeq 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 1e: if_acmpeq 26
      // 21: bipush 1
      // 22: goto 27
      // 25: athrow
      // 26: bipush 0
      // 27: ireturn
   }

   private void aaabb(class_746 param1, long param2) {
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
      // 06: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 09: aload 1
      // 0a: invokevirtual net/minecraft/class_746.method_6063 ()F
      // 0d: ldc_w 0.25
      // 10: fsub
      // 11: fcmpl
      // 12: iload 4
      // 14: ifne 33
      // 17: iflt 24
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbb ()V
      // 22: return
      // 23: athrow
      // 24: aload 0
      // 25: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba J
      // 28: iload 4
      // 2a: ifne b3
      // 2d: lconst_0
      // 2e: lcmp
      // 2f: goto 33
      // 32: athrow
      // 33: ifle b2
      // 36: lload 2
      // 37: aload 0
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba J
      // 3b: iload 4
      // 3d: ifne b7
      // 40: goto 44
      // 43: athrow
      // 44: lsub
      // 45: ldc_w 30969651
      // 48: ldc_w 67295107
      // 4b: ldc_w -195936421
      // 4e: ixor
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 52: ldc2_w 1133192107983691550
      // 55: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbbb (IJ)J
      // 58: lcmp
      // 59: iflt b2
      // 5c: goto 60
      // 5f: athrow
      // 60: aload 1
      // 61: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 64: f2d
      // 65: aload 0
      // 66: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 69: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 6c: checkcast java/lang/Double
      // 6f: invokevirtual java/lang/Double.doubleValue ()D
      // 72: dcmpg
      // 73: iload 4
      // 75: ifne b8
      // 78: goto 7c
      // 7b: athrow
      // 7c: ifgt b2
      // 7f: goto 83
      // 82: athrow
      // 83: aload 0
      // 84: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaabb F
      // 87: f2d
      // 88: aload 0
      // 89: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 8c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 8f: checkcast java/lang/Double
      // 92: invokevirtual java/lang/Double.doubleValue ()D
      // 95: dcmpg
      // 96: iload 4
      // 98: ifne b8
      // 9b: goto 9f
      // 9e: athrow
      // 9f: ifgt b2
      // a2: goto a6
      // a5: athrow
      // a6: aload 0
      // a7: lconst_0
      // a8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa J
      // ab: aload 0
      // ac: fconst_0
      // ad: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaabb F
      // b0: return
      // b1: athrow
      // b2: lload 2
      // b3: aload 0
      // b4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa J
      // b7: lcmp
      // b8: ifle c9
      // bb: aload 0
      // bc: lconst_0
      // bd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa J
      // c0: aload 0
      // c1: fconst_0
      // c2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaabb F
      // c5: goto c9
      // c8: athrow
      // c9: return
   }

   private boolean aabab() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 08: iload 1
      // 09: ifne 27
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifeq 32
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 23: goto 27
      // 26: athrow
      // 27: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaab;
      // 2a: if_acmpne 32
      // 2d: bipush 1
      // 2e: goto 33
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
   }

   private void aabba(class_310 var1, int var2) {
      aabbabbbb.bbabab(var1, this, var2);
   }

   private boolean abaaa(class_310 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0b: checkcast java/lang/Boolean
      // 0e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 11: iload 2
      // 12: ifne 46
      // 15: ifeq 45
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 1
      // 1d: iload 2
      // 1e: ifne 34
      // 21: goto 25
      // 24: athrow
      // 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 28: ifnull 49
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 1
      // 30: goto 34
      // 33: athrow
      // 34: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 37: invokevirtual net/minecraft/class_746.method_24828 ()Z
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

   private boolean ababb(class_310 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 0
      // 006: aload 1
      // 007: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa (Lnet/minecraft/class_310;)Z
      // 00a: iload 4
      // 00c: ifne 031
      // 00f: ifeq 02c
      // 012: goto 016
      // 015: athrow
      // 016: aload 0
      // 017: iload 4
      // 019: ifne 033
      // 01c: goto 020
      // 01f: athrow
      // 020: aload 1
      // 021: lload 2
      // 022: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaab (Lnet/minecraft/class_310;J)Z
      // 025: ifne 032
      // 028: goto 02c
      // 02b: athrow
      // 02c: bipush 0
      // 02d: goto 031
      // 030: athrow
      // 031: ireturn
      // 032: aload 0
      // 033: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabaa Z
      // 036: iload 4
      // 038: ifne 090
      // 03b: ifeq 07a
      // 03e: goto 042
      // 041: athrow
      // 042: aload 0
      // 043: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 046: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 049: checkcast java/lang/Boolean
      // 04c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04f: iload 4
      // 051: ifne 079
      // 054: goto 058
      // 057: athrow
      // 058: ifeq 074
      // 05b: goto 05f
      // 05e: athrow
      // 05f: aload 0
      // 060: aload 1
      // 061: iload 4
      // 063: ifne 0b9
      // 066: goto 06a
      // 069: athrow
      // 06a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbab (Lnet/minecraft/class_310;)Z
      // 06d: ifne 0b7
      // 070: goto 074
      // 073: athrow
      // 074: bipush 0
      // 075: goto 079
      // 078: athrow
      // 079: ireturn
      // 07a: aload 1
      // 07b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 07e: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 081: f2d
      // 082: aload 0
      // 083: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 086: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 089: checkcast java/lang/Double
      // 08c: invokevirtual java/lang/Double.doubleValue ()D
      // 08f: dcmpg
      // 090: iload 4
      // 092: ifne 0b6
      // 095: iflt 0b1
      // 098: goto 09c
      // 09b: athrow
      // 09c: aload 0
      // 09d: iload 4
      // 09f: ifne 0b8
      // 0a2: goto 0a6
      // 0a5: athrow
      // 0a6: aload 1
      // 0a7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbb (Lnet/minecraft/class_310;)Z
      // 0aa: ifne 0b7
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: bipush 0
      // 0b2: goto 0b6
      // 0b5: athrow
      // 0b6: ireturn
      // 0b7: aload 0
      // 0b8: aload 1
      // 0b9: lload 2
      // 0ba: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bb (Lnet/minecraft/class_310;J)Z
      // 0bd: istore 5
      // 0bf: aload 0
      // 0c0: aload 1
      // 0c1: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c4: lload 2
      // 0c5: iload 5
      // 0c7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abab (Lnet/minecraft/class_746;JZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb;
      // 0ca: astore 6
      // 0cc: aload 6
      // 0ce: ifnull 0fa
      // 0d1: iload 5
      // 0d3: iload 4
      // 0d5: ifne 103
      // 0d8: goto 0dc
      // 0db: athrow
      // 0dc: ifeq 0fd
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: aload 6
      // 0e5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.b ()F
      // 0e8: fconst_0
      // 0e9: fcmpg
      // 0ea: iload 4
      // 0ec: ifne 103
      // 0ef: goto 0f3
      // 0f2: athrow
      // 0f3: ifgt 0fd
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: bipush 0
      // 0fb: ireturn
      // 0fc: athrow
      // 0fd: lload 2
      // 0fe: aload 0
      // 0ff: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabab J
      // 102: lcmp
      // 103: iload 4
      // 105: ifne 134
      // 108: ifge 112
      // 10b: goto 10f
      // 10e: athrow
      // 10f: bipush 1
      // 110: ireturn
      // 111: athrow
      // 112: aload 0
      // 113: aload 6
      // 115: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.b ()F
      // 118: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabbaa F
      // 11b: aload 0
      // 11c: aload 6
      // 11e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.ba ()Lnet/minecraft/class_1799;
      // 121: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbba Lnet/minecraft/class_1799;
      // 124: aload 0
      // 125: iload 4
      // 127: ifne 14a
      // 12a: aload 6
      // 12c: lload 2
      // 12d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb;J)Z
      // 130: goto 134
      // 133: athrow
      // 134: ifeq 140
      // 137: aload 0
      // 138: aload 1
      // 139: lload 2
      // 13a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb (Lnet/minecraft/class_310;J)V
      // 13d: bipush 1
      // 13e: ireturn
      // 13f: athrow
      // 140: aload 0
      // 141: aload 6
      // 143: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.a ()I
      // 146: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaab I
      // 149: aload 0
      // 14a: iload 4
      // 14c: ifne 194
      // 14f: aload 1
      // 150: aload 0
      // 151: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaab I
      // 154: lload 2
      // 155: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babbb (Lnet/minecraft/class_310;IJ)V
      // 158: aload 1
      // 159: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 15c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 15f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 162: aload 0
      // 163: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaab I
      // 166: if_icmpne 18c
      // 169: goto 16d
      // 16c: athrow
      // 16d: lload 2
      // 16e: aload 0
      // 16f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaaa J
      // 172: lcmp
      // 173: iload 4
      // 175: ifne 199
      // 178: goto 17c
      // 17b: athrow
      // 17c: iflt 18c
      // 17f: goto 183
      // 182: athrow
      // 183: aload 0
      // 184: aload 1
      // 185: lload 2
      // 186: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb (Lnet/minecraft/class_310;J)V
      // 189: bipush 1
      // 18a: ireturn
      // 18b: athrow
      // 18c: aload 0
      // 18d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 190: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 193: aload 0
      // 194: lload 2
      // 195: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaaa J
      // 198: bipush 1
      // 199: ireturn
   }

   private void abbaa() {
      this.abba++;
      this.abbaa = bbbabab.aa;
      this.aaaaaa = 0L;
      this.baaaa = 0L;
      this.aaabba = bba(bbbaa(30969650, -863705753 ^ 1942720119), 1403072368948890738L);
      this.aabbba = -1;
      this.aabbaa = 0.0F;
      this.bbbba = class_1799.field_8037;
      this.aaaaab = -1;
      this.aabb = -1;
      this.babb = class_1268.field_5808;
      this.baa = bba(bbbaa(30969649, -863705753 ^ -1022275421), 3920131165534793486L);
      this.aabaa = false;
      this.bbabb = false;
      this.abbb.clear();
      this.baaba = null;
      this.aaba = 0L;
      this.aaaba = 0;
   }

   private boolean abbab(class_310 param1) {
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
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 23
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 26: astore 3
      // 27: aload 3
      // 28: iload 2
      // 29: ifne 3a
      // 2c: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 2f: ifeq 39
      // 32: goto 36
      // 35: athrow
      // 36: bipush 1
      // 37: ireturn
      // 38: athrow
      // 39: aload 3
      // 3a: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 3d: getfield net/minecraft/class_243.field_1351 D
      // 40: dconst_0
      // 41: dcmpg
      // 42: iload 2
      // 43: ifne 4e
      // 46: ifge 51
      // 49: goto 4d
      // 4c: athrow
      // 4d: bipush 1
      // 4e: goto 52
      // 51: bipush 0
      // 52: ireturn
   }

   private boolean abbba(class_746 param1) {
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
      // 05: ifnull 28
      // 08: aload 0
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaabb F
      // 0c: aload 1
      // 0d: invokevirtual net/minecraft/class_746.method_6063 ()F
      // 10: ldc_w 0.25
      // 13: fsub
      // 14: fcmpg
      // 15: iload 2
      // 16: ifne 25
      // 19: goto 1d
      // 1c: athrow
      // 1d: ifge 28
      // 20: goto 24
      // 23: athrow
      // 24: bipush 1
      // 25: goto 29
      // 28: bipush 0
      // 29: ireturn
   }

   private static long abbbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ bbbaa(30969648, -1997410945 ^ 1912052334)) & bbbaa(30969655, -1997410945 ^ 576189380);
      if (abbbb[var3] == null) {
         abbbb[var3] = aab[var3] ^ var1;
      }

      return abbbb[var3];
   }

   private class_1309 baaaa(class_310 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 1a
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 0e: ifnull 23
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.bba ()Lnet/minecraft/class_1309;
      // 20: goto 24
      // 23: aconst_null
      // 24: astore 5
      // 26: aload 0
      // 27: iload 4
      // 29: ifne 3e
      // 2c: aload 1
      // 2d: aload 5
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // 32: ifeq 3d
      // 35: goto 39
      // 38: athrow
      // 39: aload 5
      // 3b: areturn
      // 3c: athrow
      // 3d: aload 0
      // 3e: iload 4
      // 40: ifne 52
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 46: ifnull 5b
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 0
      // 4e: goto 52
      // 51: athrow
      // 52: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 55: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.bbb ()Lnet/minecraft/class_1309;
      // 58: goto 5c
      // 5b: aconst_null
      // 5c: astore 5
      // 5e: aload 0
      // 5f: iload 4
      // 61: ifne 73
      // 64: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 67: ifnull ac
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 0
      // 6f: goto 73
      // 72: athrow
      // 73: iload 4
      // 75: ifne 9f
      // 78: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 7b: lload 2
      // 7c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.baa (J)J
      // 7f: ldc_w 30969654
      // 82: ldc_w -160839912
      // 85: ldc_w -1477274443
      // 88: ixor
      // 89: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 8c: ldc2_w 1494113831885397052
      // 8f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbbb (IJ)J
      // 92: lcmp
      // 93: ifgt ac
      // 96: goto 9a
      // 99: athrow
      // 9a: aload 0
      // 9b: goto 9f
      // 9e: athrow
      // 9f: aload 1
      // a0: aload 5
      // a2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baab (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)Z
      // a5: ifeq ac
      // a8: aload 5
      // aa: areturn
      // ab: athrow
      // ac: aconst_null
      // ad: areturn
   }

   private boolean baaab(class_310 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 1
      // 05: lload 2
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaaa (Lnet/minecraft/class_310;J)Lnet/minecraft/class_1309;
      // 09: astore 5
      // 0b: istore 4
      // 0d: aload 5
      // 0f: ifnull 2b
      // 12: aload 0
      // 13: aload 1
      // 14: aload 5
      // 16: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abba (Lnet/minecraft/class_310;Lnet/minecraft/class_1309;)D
      // 19: dconst_1
      // 1a: dcmpg
      // 1b: iload 4
      // 1d: ifne 2c
      // 20: goto 24
      // 23: athrow
      // 24: ifge 2f
      // 27: goto 2b
      // 2a: athrow
      // 2b: bipush 1
      // 2c: goto 30
      // 2f: bipush 0
      // 30: ireturn
   }

   private void baaba(class_310 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 0
      // 006: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 009: iload 4
      // 00b: ifne 102
      // 00e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 011: if_acmpne 0f5
      // 014: goto 018
      // 017: athrow
      // 018: aload 0
      // 019: iload 4
      // 01b: ifne 07e
      // 01e: goto 022
      // 021: athrow
      // 022: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaab I
      // 025: iflt 07d
      // 028: goto 02c
      // 02b: athrow
      // 02c: aload 0
      // 02d: iload 4
      // 02f: ifne 07e
      // 032: goto 036
      // 035: athrow
      // 036: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaab I
      // 039: ldc_w 30969653
      // 03c: ldc_w 2038813188
      // 03f: ldc_w -1601257407
      // 042: ixor
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 046: ldc2_w 1046420959357774965
      // 049: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba (IJ)I
      // 04c: if_icmpge 07d
      // 04f: goto 053
      // 052: athrow
      // 053: lload 2
      // 054: aload 0
      // 055: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaaa J
      // 058: lsub
      // 059: ldc_w 30969652
      // 05c: ldc_w 2038813188
      // 05f: ldc_w 192853561
      // 062: ixor
      // 063: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 066: ldc2_w 1474660900059860927
      // 069: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbbb (IJ)J
      // 06c: lcmp
      // 06d: iload 4
      // 06f: ifne 08d
      // 072: goto 076
      // 075: athrow
      // 076: ifle 083
      // 079: goto 07d
      // 07c: athrow
      // 07d: aload 0
      // 07e: aload 1
      // 07f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 082: return
      // 083: aload 1
      // 084: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 087: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 08a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 08d: iload 4
      // 08f: ifne 0a7
      // 092: aload 0
      // 093: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaab I
      // 096: if_icmpne 0eb
      // 099: goto 09d
      // 09c: athrow
      // 09d: lload 2
      // 09e: aload 0
      // 09f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaaa J
      // 0a2: lcmp
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: iload 4
      // 0a9: ifne 0ca
      // 0ac: ifge 0b4
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: return
      // 0b4: aload 0
      // 0b5: iload 4
      // 0b7: ifne 0e5
      // 0ba: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0bd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0c0: checkcast java/lang/Boolean
      // 0c3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c6: goto 0ca
      // 0c9: athrow
      // 0ca: ifeq 0e4
      // 0cd: aload 0
      // 0ce: iload 4
      // 0d0: ifne 0e5
      // 0d3: goto 0d7
      // 0d6: athrow
      // 0d7: aload 1
      // 0d8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbab (Lnet/minecraft/class_310;)Z
      // 0db: ifne 0e4
      // 0de: goto 0e2
      // 0e1: athrow
      // 0e2: return
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: aload 1
      // 0e6: lload 2
      // 0e7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb (Lnet/minecraft/class_310;J)V
      // 0ea: return
      // 0eb: aload 0
      // 0ec: aload 1
      // 0ed: aload 0
      // 0ee: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaab I
      // 0f1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabba (Lnet/minecraft/class_310;I)V
      // 0f4: return
      // 0f5: aload 0
      // 0f6: iload 4
      // 0f8: ifne 1b2
      // 0fb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 0fe: goto 102
      // 101: athrow
      // 102: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 105: if_acmpne 1b1
      // 108: lload 2
      // 109: aload 0
      // 10a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaba J
      // 10d: lsub
      // 10e: ldc_w 30969675
      // 111: ldc_w 2038813188
      // 114: ldc_w 1502516791
      // 117: ixor
      // 118: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 11b: ldc2_w 3417863730434223805
      // 11e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbbb (IJ)J
      // 121: lcmp
      // 122: iflt 131
      // 125: goto 129
      // 128: athrow
      // 129: aload 0
      // 12a: aload 1
      // 12b: lload 2
      // 12c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb (Lnet/minecraft/class_310;J)V
      // 12f: return
      // 130: athrow
      // 131: aload 0
      // 132: iload 4
      // 134: ifne 14a
      // 137: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaba Lnet/minecraft/class_243;
      // 13a: ifnonnull 149
      // 13d: goto 141
      // 140: athrow
      // 141: aload 0
      // 142: aload 1
      // 143: lload 2
      // 144: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb (Lnet/minecraft/class_310;J)V
      // 147: return
      // 148: athrow
      // 149: aload 0
      // 14a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 14d: aload 1
      // 14e: aload 0
      // 14f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaba Lnet/minecraft/class_243;
      // 152: aload 0
      // 153: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.ababa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 156: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 159: checkcast java/lang/Double
      // 15c: invokevirtual java/lang/Double.floatValue ()F
      // 15f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.baaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_243;F)F
      // 162: fstore 5
      // 164: aload 0
      // 165: iload 4
      // 167: ifne 1ab
      // 16a: dup
      // 16b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaba I
      // 16e: bipush 1
      // 16f: iadd
      // 170: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaba I
      // 173: fload 5
      // 175: ldc 0.5
      // 177: fcmpg
      // 178: ifle 1a6
      // 17b: goto 17f
      // 17e: athrow
      // 17f: aload 0
      // 180: iload 4
      // 182: ifne 1ab
      // 185: goto 189
      // 188: athrow
      // 189: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaba I
      // 18c: ldc_w 30969674
      // 18f: ldc_w 2038813188
      // 192: ldc_w 1506534459
      // 195: ixor
      // 196: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 199: ldc2_w 2626519809547763890
      // 19c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba (IJ)I
      // 19f: if_icmplt 1b0
      // 1a2: goto 1a6
      // 1a5: athrow
      // 1a6: aload 0
      // 1a7: goto 1ab
      // 1aa: athrow
      // 1ab: aload 1
      // 1ac: lload 2
      // 1ad: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb (Lnet/minecraft/class_310;J)V
      // 1b0: return
      // 1b1: aload 0
      // 1b2: iload 4
      // 1b4: ifne 1eb
      // 1b7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 1ba: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 1bd: if_acmpne 1ea
      // 1c0: goto 1c4
      // 1c3: athrow
      // 1c4: aload 1
      // 1c5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c8: getfield net/minecraft/class_746.field_6012 I
      // 1cb: aload 0
      // 1cc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baa I
      // 1cf: if_icmplt 1e9
      // 1d2: goto 1d6
      // 1d5: athrow
      // 1d6: aload 0
      // 1d7: dup
      // 1d8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abba J
      // 1db: lconst_1
      // 1dc: ladd
      // 1dd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abba J
      // 1e0: aload 0
      // 1e1: aload 1
      // 1e2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abb (Lnet/minecraft/class_310;)V
      // 1e5: goto 1e9
      // 1e8: athrow
      // 1e9: return
      // 1ea: aload 0
      // 1eb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 1ee: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 1f1: if_acmpne 22b
      // 1f4: aload 1
      // 1f5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1f8: getfield net/minecraft/class_746.field_6012 I
      // 1fb: iload 4
      // 1fd: ifne 222
      // 200: goto 204
      // 203: athrow
      // 204: aload 0
      // 205: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaabba I
      // 208: if_icmplt 22b
      // 20b: goto 20f
      // 20e: athrow
      // 20f: aload 0
      // 210: iload 4
      // 212: ifne 227
      // 215: goto 219
      // 218: athrow
      // 219: aload 1
      // 21a: lload 2
      // 21b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.ababb (Lnet/minecraft/class_310;J)Z
      // 21e: goto 222
      // 221: athrow
      // 222: ifeq 226
      // 225: return
      // 226: aload 0
      // 227: aload 1
      // 228: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.b (Lnet/minecraft/class_310;)V
      // 22b: return
   }

   private bbbaaabb baabb(class_746 param1, long param2, boolean param4) {
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
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0c: checkcast java/lang/Boolean
      // 0f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 12: iload 5
      // 14: ifne 26
      // 17: ifeq 29
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // 22: goto 26
      // 25: athrow
      // 26: ifeq 2c
      // 29: aconst_null
      // 2a: areturn
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 1
      // 2e: aload 1
      // 2f: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 32: ldc_w 30969673
      // 35: ldc_w 392660790
      // 38: ldc_w 1435502338
      // 3b: ixor
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 3f: ldc2_w 1624384673193021251
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bba (IJ)I
      // 45: lload 2
      // 46: iload 4
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bab (Lnet/minecraft/class_746;Lnet/minecraft/class_1799;IJZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb;
      // 4b: astore 6
      // 4d: aload 6
      // 4f: iload 5
      // 51: ifne 5d
      // 54: ifnull 6c
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 6
      // 5d: iload 5
      // 5f: ifne 71
      // 62: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.ab ()I
      // 65: ifgt 6f
      // 68: goto 6c
      // 6b: athrow
      // 6c: aconst_null
      // 6d: areturn
      // 6e: athrow
      // 6f: aload 6
      // 71: iload 5
      // 73: ifne 97
      // 76: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.b ()F
      // 79: fconst_0
      // 7a: fcmpg
      // 7b: ifgt 95
      // 7e: goto 82
      // 81: athrow
      // 82: aload 0
      // 83: aload 6
      // 85: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.ba ()Lnet/minecraft/class_1799;
      // 88: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaba (Lnet/minecraft/class_1799;)Z
      // 8b: ifeq 95
      // 8e: goto 92
      // 91: athrow
      // 92: aconst_null
      // 93: areturn
      // 94: athrow
      // 95: aload 6
      // 97: areturn
   }

   @Override
   public void abbbba(class_310 param1) {
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
      // 005: aload 1
      // 006: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba (Lnet/minecraft/class_310;)Z
      // 009: iload 2
      // 00a: ifne 023
      // 00d: ifne 01f
      // 010: goto 014
      // 013: athrow
      // 014: aload 0
      // 015: aload 1
      // 016: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 019: aload 0
      // 01a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbb ()V
      // 01d: return
      // 01e: athrow
      // 01f: aload 1
      // 020: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 023: ifeq 02d
      // 026: aload 0
      // 027: aload 1
      // 028: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 02b: return
      // 02c: athrow
      // 02d: invokestatic java/lang/System.currentTimeMillis ()J
      // 030: lstore 3
      // 031: aload 0
      // 032: iload 2
      // 033: ifne 055
      // 036: aload 1
      // 037: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03a: lload 3
      // 03b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaabb (Lnet/minecraft/class_746;J)V
      // 03e: aload 0
      // 03f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 042: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 045: if_acmpeq 054
      // 048: goto 04c
      // 04b: athrow
      // 04c: aload 0
      // 04d: aload 1
      // 04e: lload 3
      // 04f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaba (Lnet/minecraft/class_310;J)V
      // 052: return
      // 053: athrow
      // 054: aload 0
      // 055: aload 1
      // 056: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa (Lnet/minecraft/class_310;)Z
      // 059: iload 2
      // 05a: ifne 07b
      // 05d: ifne 065
      // 060: goto 064
      // 063: athrow
      // 064: return
      // 065: aload 1
      // 066: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 069: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 06c: f2d
      // 06d: aload 0
      // 06e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 071: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 074: checkcast java/lang/Double
      // 077: invokevirtual java/lang/Double.doubleValue ()D
      // 07a: dcmpl
      // 07b: iload 2
      // 07c: ifne 08f
      // 07f: iflt 09e
      // 082: goto 086
      // 085: athrow
      // 086: aload 0
      // 087: aload 1
      // 088: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbb (Lnet/minecraft/class_310;)Z
      // 08b: goto 08f
      // 08e: athrow
      // 08f: iload 2
      // 090: ifne 09b
      // 093: ifeq 09e
      // 096: goto 09a
      // 099: athrow
      // 09a: bipush 1
      // 09b: goto 09f
      // 09e: bipush 0
      // 09f: istore 5
      // 0a1: aload 0
      // 0a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0a5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0a8: checkcast java/lang/Boolean
      // 0ab: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ae: istore 6
      // 0b0: aload 0
      // 0b1: aload 1
      // 0b2: lload 3
      // 0b3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bb (Lnet/minecraft/class_310;J)Z
      // 0b6: istore 7
      // 0b8: lload 3
      // 0b9: aload 0
      // 0ba: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabab J
      // 0bd: lcmp
      // 0be: iload 2
      // 0bf: ifne 0f1
      // 0c2: ifge 0ef
      // 0c5: goto 0c9
      // 0c8: athrow
      // 0c9: iload 7
      // 0cb: iload 2
      // 0cc: ifne 0e3
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: ifeq 0ee
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: aload 0
      // 0db: lload 3
      // 0dc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaa (J)Z
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: iload 2
      // 0e4: ifne 0f1
      // 0e7: ifne 0ef
      // 0ea: goto 0ee
      // 0ed: athrow
      // 0ee: return
      // 0ef: iload 5
      // 0f1: iload 2
      // 0f2: ifne 110
      // 0f5: ifne 10e
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: iload 6
      // 0fe: iload 2
      // 0ff: ifne 110
      // 102: goto 106
      // 105: athrow
      // 106: ifne 10e
      // 109: goto 10d
      // 10c: athrow
      // 10d: return
      // 10e: iload 6
      // 110: iload 2
      // 111: ifne 13f
      // 114: ifeq 131
      // 117: goto 11b
      // 11a: athrow
      // 11b: aload 0
      // 11c: iload 2
      // 11d: ifne 132
      // 120: goto 124
      // 123: athrow
      // 124: aload 1
      // 125: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbab (Lnet/minecraft/class_310;)Z
      // 128: ifne 131
      // 12b: goto 12f
      // 12e: athrow
      // 12f: return
      // 130: athrow
      // 131: aload 0
      // 132: iload 2
      // 133: ifne 144
      // 136: aload 1
      // 137: lload 3
      // 138: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaab (Lnet/minecraft/class_310;J)Z
      // 13b: goto 13f
      // 13e: athrow
      // 13f: ifne 143
      // 142: return
      // 143: aload 0
      // 144: aload 1
      // 145: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 148: lload 3
      // 149: iload 7
      // 14b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abab (Lnet/minecraft/class_746;JZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb;
      // 14e: astore 8
      // 150: aload 8
      // 152: ifnonnull 157
      // 155: return
      // 156: athrow
      // 157: iload 7
      // 159: iload 2
      // 15a: ifne 17d
      // 15d: ifeq 17b
      // 160: goto 164
      // 163: athrow
      // 164: aload 8
      // 166: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.b ()F
      // 169: fconst_0
      // 16a: fcmpg
      // 16b: iload 2
      // 16c: ifne 17d
      // 16f: goto 173
      // 172: athrow
      // 173: ifgt 17b
      // 176: goto 17a
      // 179: athrow
      // 17a: return
      // 17b: iload 5
      // 17d: iload 2
      // 17e: ifne 18a
      // 181: ifne 199
      // 184: goto 188
      // 187: athrow
      // 188: iload 6
      // 18a: iload 2
      // 18b: ifne 196
      // 18e: ifeq 199
      // 191: goto 195
      // 194: athrow
      // 195: bipush 1
      // 196: goto 19a
      // 199: bipush 0
      // 19a: istore 9
      // 19c: aload 0
      // 19d: aload 1
      // 19e: aload 8
      // 1a0: lload 3
      // 1a1: iload 9
      // 1a3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbaba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb;JZ)V
      // 1a6: return
   }

   private float babaa(class_746 var1, long var2) {
      try {
         if (var2 <= this.abaaa) {
            return Math.max(var1.method_6032(), this.aaaabb);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      this.abaaa = 0L;
      this.aaaabb = 0.0F;
      return var1.method_6032();
   }

   @Override
   public void aabaa() {
      this.bbabb(class_310.method_1551());
      this.abbb();
      this.aabab = 0L;
      this.baaaa = 0L;
      this.baba = 0L;
      this.bbaba.aaaa();
   }

   @Override
   public void abaab() {
      this.abbaa();
      this.abbb();
      this.aabab = 0L;
      this.baaaa = 0L;
      this.baba = 0L;
      this.bbaba.babbbb();
   }

   private void babab(class_310 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0c: checkcast java/lang/Boolean
      // 0f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 12: iload 4
      // 14: ifne 25
      // 17: ifne 1f
      // 1a: goto 1e
      // 1d: athrow
      // 1e: return
      // 1f: lload 2
      // 20: aload 0
      // 21: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabab J
      // 24: lcmp
      // 25: iload 4
      // 27: ifne 40
      // 2a: ifge 32
      // 2d: goto 31
      // 30: athrow
      // 31: return
      // 32: aload 0
      // 33: aload 1
      // 34: iload 4
      // 36: ifne 52
      // 39: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa (Lnet/minecraft/class_310;)Z
      // 3c: goto 40
      // 3f: athrow
      // 40: ifeq 6e
      // 43: aload 0
      // 44: iload 4
      // 46: ifne 5d
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 1
      // 4e: goto 52
      // 51: athrow
      // 52: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbab (Lnet/minecraft/class_310;)Z
      // 55: ifeq 6e
      // 58: aload 0
      // 59: goto 5d
      // 5c: athrow
      // 5d: iload 4
      // 5f: ifne 71
      // 62: aload 1
      // 63: lload 2
      // 64: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaab (Lnet/minecraft/class_310;J)Z
      // 67: ifne 70
      // 6a: goto 6e
      // 6d: athrow
      // 6e: return
      // 6f: athrow
      // 70: aload 0
      // 71: aload 1
      // 72: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 75: lload 2
      // 76: bipush 0
      // 77: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abab (Lnet/minecraft/class_746;JZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb;
      // 7a: astore 5
      // 7c: aload 5
      // 7e: iload 4
      // 80: ifne 8c
      // 83: ifnull 94
      // 86: goto 8a
      // 89: athrow
      // 8a: aload 5
      // 8c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.b ()F
      // 8f: fconst_0
      // 90: fcmpl
      // 91: ifle 96
      // 94: return
      // 95: athrow
      // 96: aload 0
      // 97: aload 1
      // 98: aload 5
      // 9a: lload 2
      // 9b: bipush 1
      // 9c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbaba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb;JZ)V
      // 9f: return
   }

   private boolean babba(class_310 param1) {
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
      // 09: aload 1
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba (Lnet/minecraft/class_310;)Z
      // 0d: ifne 17
      // 10: goto 14
      // 13: athrow
      // 14: bipush 0
      // 15: ireturn
      // 16: athrow
      // 17: aload 0
      // 18: iload 2
      // 19: ifne 36
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb Z
      // 1f: ifne 35
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: aload 1
      // 28: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2b: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 2e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.ab F
      // 31: goto 35
      // 34: athrow
      // 35: aload 0
      // 36: bipush 1
      // 37: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb Z
      // 3a: aload 1
      // 3b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3e: ldc_w 90.0
      // 41: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // 44: aload 1
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababbbb (Lnet/minecraft/class_310;)V
      // 48: aload 1
      // 49: aload 0
      // 4a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb Lnet/minecraft/class_1268;
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;
      // 50: astore 3
      // 51: aload 3
      // 52: iload 2
      // 53: ifne 5e
      // 56: ifnull 72
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 3
      // 5e: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 63: iload 2
      // 64: ifne 6f
      // 67: ifeq 72
      // 6a: goto 6e
      // 6d: athrow
      // 6e: bipush 1
      // 6f: goto 73
      // 72: bipush 0
      // 73: istore 4
      // 75: iload 4
      // 77: iload 2
      // 78: ifne 8d
      // 7b: ifeq 8b
      // 7e: goto 82
      // 81: athrow
      // 82: aload 0
      // 83: aload 1
      // 84: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbab (Lnet/minecraft/class_310;)V
      // 87: goto 8b
      // 8a: athrow
      // 8b: iload 4
      // 8d: ireturn
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
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 0
      // 09: aload 2
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba (Lnet/minecraft/class_310;)Z
      // 0d: iload 1
      // 0e: ifne 27
      // 11: ifne 23
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: aload 2
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 1d: aload 0
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbb ()V
      // 21: return
      // 22: athrow
      // 23: aload 2
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 27: ifeq 31
      // 2a: aload 0
      // 2b: aload 2
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 2f: return
      // 30: athrow
      // 31: invokestatic java/lang/System.currentTimeMillis ()J
      // 34: lstore 3
      // 35: aload 0
      // 36: iload 1
      // 37: ifne 59
      // 3a: aload 2
      // 3b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3e: lload 3
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaabb (Lnet/minecraft/class_746;J)V
      // 42: aload 0
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 46: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 49: if_acmpne 58
      // 4c: goto 50
      // 4f: athrow
      // 50: aload 0
      // 51: aload 2
      // 52: lload 3
      // 53: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babab (Lnet/minecraft/class_310;J)V
      // 56: return
      // 57: athrow
      // 58: aload 0
      // 59: iload 1
      // 5a: ifne 89
      // 5d: aload 2
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa (Lnet/minecraft/class_310;)Z
      // 61: ifne 88
      // 64: goto 68
      // 67: athrow
      // 68: aload 0
      // 69: iload 1
      // 6a: ifne 83
      // 6d: goto 71
      // 70: athrow
      // 71: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 74: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 77: if_acmpeq 87
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 0
      // 7f: goto 83
      // 82: athrow
      // 83: aload 2
      // 84: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb (Lnet/minecraft/class_310;)V
      // 87: return
      // 88: aload 0
      // 89: iload 1
      // 8a: ifne 9f
      // 8d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 90: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 93: if_acmpeq a5
      // 96: goto 9a
      // 99: athrow
      // 9a: aload 0
      // 9b: goto 9f
      // 9e: athrow
      // 9f: aload 2
      // a0: lload 3
      // a1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaba (Lnet/minecraft/class_310;J)V
      // a4: return
      // a5: return
   }

   private void babbb(class_310 param1, int param2, long param3) {
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
      // 06: iload 5
      // 08: ifne 54
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabbba I
      // 0e: iload 2
      // 0f: if_icmpeq 53
      // 12: goto 16
      // 15: athrow
      // 16: aload 1
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 1a: iload 5
      // 1c: ifne 30
      // 1f: goto 23
      // 22: athrow
      // 23: iload 2
      // 24: if_icmpeq 33
      // 27: goto 2b
      // 2a: athrow
      // 2b: bipush 1
      // 2c: goto 30
      // 2f: athrow
      // 30: goto 34
      // 33: bipush 0
      // 34: istore 6
      // 36: aload 0
      // 37: lload 3
      // 38: iload 6
      // 3a: ifeq 49
      // 3d: aload 0
      // 3e: aload 0
      // 3f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 45: goto 4a
      // 48: athrow
      // 49: lconst_0
      // 4a: ladd
      // 4b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaaa J
      // 4e: aload 0
      // 4f: iload 2
      // 50: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabbba I
      // 53: aload 0
      // 54: aload 1
      // 55: iload 2
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabba (Lnet/minecraft/class_310;I)V
      // 59: return
   }

   @Override
   public void abbbab(JsonObject var1) {
      super.abbbab(var1);
      this.bbabaaa(
         var1,
         aabbaaaba.abba(aaaa(bbbaa(30969672, -1770795425 ^ -452019836), bbbaa(30969679, -1770795425 ^ 1171417913))),
         new aaabbbab[]{this.aaabab}
      );
      this.bbabaaa(
         var1,
         aabbaaaba.abba(aaaa(bbbaa(30969678, -1770795425 ^ -430670859), bbbaa(30969677, -1770795425 ^ 302656720))),
         new aaabbbab[]{this.aaabab}
      );
   }

   private boolean bbaaa(class_310 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb Lnet/minecraft/class_1268;
      // 08: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 0b: if_acmpne 2b
      // 0e: aload 1
      // 0f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 12: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbba Lnet/minecraft/class_1799;
      // 19: invokestatic net/minecraft/class_1799.method_31577 (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 1c: iload 2
      // 1d: ifne 2c
      // 20: goto 24
      // 23: athrow
      // 24: ifeq 2f
      // 27: goto 2b
      // 2a: athrow
      // 2b: bipush 1
      // 2c: goto 30
      // 2f: bipush 0
      // 30: ireturn
   }

   private float bbaab(class_310 var1) {
      return var1.field_1724.method_36454();
   }

   private void bbaba(class_310 param1, bbbaaabb param2, long param3, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 6
      // 05: aload 1
      // 06: iload 6
      // 08: ifne 1a
      // 0b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0e: ifnull 23
      // 11: goto 15
      // 14: athrow
      // 15: aload 1
      // 16: goto 1a
      // 19: athrow
      // 1a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 1d: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 20: ifnonnull 25
      // 23: return
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abaaa (Lnet/minecraft/class_310;)Z
      // 2a: ifne 2f
      // 2d: return
      // 2e: athrow
      // 2f: aload 1
      // 30: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 33: astore 7
      // 35: iload 6
      // 37: aload 0
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbb Ljava/util/List;
      // 3b: invokeinterface java/util/List.clear ()V 1
      // 40: ifne 95
      // 43: aload 0
      // 44: aload 7
      // 46: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 49: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 4c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabb I
      // 4f: aload 0
      // 50: aload 2
      // 51: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.b ()F
      // 54: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabbaa F
      // 57: aload 0
      // 58: aload 2
      // 59: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.ba ()Lnet/minecraft/class_1799;
      // 5c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbba Lnet/minecraft/class_1799;
      // 5f: aload 0
      // 60: iload 5
      // 62: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabaa Z
      // 65: aload 0
      // 66: aload 2
      // 67: lload 3
      // 68: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb;J)Z
      // 6b: ifeq 7a
      // 6e: goto 72
      // 71: athrow
      // 72: aload 0
      // 73: aload 1
      // 74: lload 3
      // 75: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb (Lnet/minecraft/class_310;J)V
      // 78: return
      // 79: athrow
      // 7a: aload 0
      // 7b: iload 6
      // 7d: ifne c1
      // 80: aload 2
      // 81: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaabb.a ()I
      // 84: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaab I
      // 87: aload 0
      // 88: aload 1
      // 89: aload 0
      // 8a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaab I
      // 8d: lload 3
      // 8e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babbb (Lnet/minecraft/class_310;IJ)V
      // 91: goto 95
      // 94: athrow
      // 95: aload 7
      // 97: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 9d: aload 0
      // 9e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaab I
      // a1: if_icmpne b9
      // a4: lload 3
      // a5: aload 0
      // a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baaaa J
      // a9: lcmp
      // aa: iflt b9
      // ad: goto b1
      // b0: athrow
      // b1: aload 0
      // b2: aload 1
      // b3: lload 3
      // b4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babb (Lnet/minecraft/class_310;J)V
      // b7: return
      // b8: athrow
      // b9: aload 0
      // ba: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // bd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // c0: aload 0
      // c1: lload 3
      // c2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aaaaaa J
      // c5: return
   }

   public boolean a() {
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
      // 06: ifne 17
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.babbaab ()Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 2c
      // 1b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 1e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabab;
      // 21: if_acmpeq 2b
      // 24: goto 28
      // 27: athrow
      // 28: bipush 1
      // 29: ireturn
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba J
      // 2f: lconst_0
      // 30: iload 1
      // 31: ifne 5b
      // 34: lcmp
      // 35: ifle 6b
      // 38: goto 3c
      // 3b: athrow
      // 3c: invokestatic java/lang/System.currentTimeMillis ()J
      // 3f: aload 0
      // 40: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.baba J
      // 43: lsub
      // 44: ldc_w 30969676
      // 47: ldc_w 1252485579
      // 4a: ldc_w 205530091
      // 4d: ixor
      // 4e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbbaa (II)I
      // 51: ldc2_w 490296416384602038
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbbb (IJ)J
      // 57: goto 5b
      // 5a: athrow
      // 5b: lcmp
      // 5c: iload 1
      // 5d: ifne 68
      // 60: ifge 6b
      // 63: goto 67
      // 66: athrow
      // 67: bipush 1
      // 68: goto 6c
      // 6b: bipush 0
      // 6c: ireturn
   }

   private void b(class_310 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb Z
      // 08: ifeq 46
      // 0b: aload 1
      // 0c: iload 2
      // 0d: ifne 47
      // 10: goto 14
      // 13: athrow
      // 14: ifnull 46
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 1
      // 1c: iload 2
      // 1d: ifne 47
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 27: ifnull 46
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 1
      // 2f: aload 1
      // 30: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 33: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 36: aload 0
      // 37: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.ab F
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbbbba (Lnet/minecraft/class_310;FF)V
      // 3d: aload 0
      // 3e: bipush 0
      // 3f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb Z
      // 42: goto 46
      // 45: athrow
      // 46: aload 1
      // 47: aload 0
      // 48: aload 0
      // 49: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 4f: checkcast java/lang/Boolean
      // 52: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 55: ifeq 5f
      // 58: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 5b: goto 62
      // 5e: athrow
      // 5f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 62: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 65: aload 0
      // 66: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa ()V
      // 69: return
   }

   private void bbabb(class_310 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.bbabb Z
      // 08: ifeq 41
      // 0b: aload 1
      // 0c: iload 2
      // 0d: ifne 42
      // 10: goto 14
      // 13: athrow
      // 14: ifnull 41
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 1
      // 1c: iload 2
      // 1d: ifne 42
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 27: ifnull 41
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 1
      // 2f: aload 1
      // 30: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 33: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 36: aload 0
      // 37: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.ab F
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbbbba (Lnet/minecraft/class_310;FF)V
      // 3d: goto 41
      // 40: athrow
      // 41: aload 1
      // 42: aload 0
      // 43: aload 0
      // 44: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.aabbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 47: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 4a: checkcast java/lang/Boolean
      // 4d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 50: ifeq 5a
      // 53: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 56: goto 5d
      // 59: athrow
      // 5a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 5d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 60: aload 0
      // 61: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababb.abbaa ()V
      // 64: return
   }
}
