package nsc;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class bb extends baaabbaa {
   private static final String[] aba;
   private static final int[] aab;
   private static final String[] aa;
   private static final String[] ab;
   private static final Object[] abb;
   private final ababbbbaa ba;
   private List bb;
   private final List aaa;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1448602321;
      int var10001 = "\t套귑䈗嗔卷㷖嘗ⷔ亗".length();
      short var18 = 1404;
      int var16 = 0;
      String[] var15 = new String[1];
      int var17 = 0;
      int var14 = var10001;
      String var13 = "\t套귑䈗嗔卷㷖嘗ⷔ亗";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aba = var15;
      abb = new Object[var15.length];
      int var9 = -1614022983;
      byte[] var7 = "´\u009a`jß\u008eà'fß\u0013ó\u001aÏ\u008as(\u009a\u00140ö«_\u001fíT\u0013Ë'ÇûË\u009dþl8\u0007C¯\u0080ý\u0016É²<¸\u0002Ç¢á\u0081GßÒ\u00adð=r\u0005Úc]ù¯A\bç\u00069ë\u0097Z\u0080ä.Â}Yjå\u0080÷\u008f!*é\u0082¡UÖz\u0006ËgÒ\u008cCß±U1ñÿïZ#P¥Ö5íO3c5ÔùÉê\u001eÞÂä\u001f9ê9H¿¥´{ì,í\u008cWd²¿¼3àJ\u001b\u0099\u0081\u009a\u0093³wO9Ú¾ëÖÄ\u0007 )4Õ¶k\u0094Î*\u0084Ì\u0093e·Ë\u0093=nÂ'35Æ¡\u0097F\u0099\u0093â±|8(Þ¾%&ý\u000eX¹Å#,\u00068Ü¼]6ñº\u0099\u009a\u008aÎ½ï\u0006D¾\u0085\u0098K¾\u0089\u0014\u000fäÉ\u0083Ï«Ëlö\b\u000f0Ù«^ô:\u0096Vü±R\u0097÷\u0007çr_\u0098ó¦\u0086±.\u0006{¯9Äf>1\u0085âé\u0099l\u0085\r\u0084C_\u0006Ã\u001eO\u000e¹c\u000fXñºbò\u0095²«\u000bä;>\u001b7mJh\u008dm£f\u0092£3\u00adö~\u000eT\u0097¬ä\u0098â\u0093\u0099Z^\u009e³2QÛ6ãM\u001aþV45\u008a²+Ù¤\u0012K[Ù\u009dÃPu\u0001ï\u0002{¢PúZ\u0002\u0004×Ü-\u0093¯RØx}*;\u0004öh\u0084_\u0096LzÖô\u0084\u0000ðJ\u0002\u008f_Ô|À\u0017²ë\u0013\n\u0015á}¨É\u0082ÉðdÓ\tç'p£ð\u000eo\u0014\u009b\u0019\u0092U\u008aÆû;\"gÁ\u0098\u008cb\u0017ës+\u000eb\u00965Î\u0005ð\u0092¦\td\u000fZ¹B\u000f\u0083\u001dÿ\u009b¿=\u0007\u0098©\u00008)·\u0013Æ\u0092\u009e\u00144\u0013ü\u0004RÈ]\u009aDT4\u00841}.õIã`µ\u0086½u\u001bË·\u000e\u001b\u0004a5óZöÀL\u000eV7\u008aÆ²\u0000\u0093Óe\u0016Âb\u00927Ù\u0014Ê\u0016B\u009f\u008d°úAt}\u001e÷\u0014U\u0002\u0019\u0017\u0080\n\u0094<ÜÚ\u0095gO¡µ0¸\u0090\u009b\u0097^vì=J\u000bÔ4}ýÃíe'Ç:Þ\u0017\u0017l¤\u0019\u008eâ\u0013(9\u008bÂ)¹\u008aç]\n\u0080qk\u0092*Y\u009a\u008bç\u008d\u0083n\u000bÐ¼¸¼7$%2º¬3f\u0005µOa3mÓ\"\u008a\t9ø`\n¹(;\u0083V\u0012\u0011\u0006\u0084(ó\u001e\u009ch\u001d\u001aaÖßÀÏçËO\u000eçÎµÞ¾WÂaÂ\u001a\u001d¦\nðýÃÛËr£«/«\tÛ]~RH ¢¸í\u000fÛ\u0099-Va¿\u0000\u00040\u008aï¾kÃ´-\u0013üv|¼¨\u0093\"çJºû¡\u0092\u001d\u0091°Øå\u001e0m\u00ad\u0016~\u0088óézäæ©I\u0010^\u0001MÃ\b)Rc\u001a\u0013\u0002\u001c\u009d\u0098\u001aWØå4\u0099\u008a\u0087>\u000b\u008d\u0095ö\n<s\u0014Á=]\\G\u001e\u001a\u0080Ý~rþ½dÅÊã\u0080!8\u0011!Gs¬Iê\u0082¼\u001bùõ\u0003ÎrMë\u008cÇ\u0085\u009f[x\u008c§$s4Ïç¶\u0003h\u0097Ï\u009cÁT\u0014E\u0095º\u0086\u0010\u0080ZÐ\u0088M/Àg¯4Ìì]:¸\u0019\u0013þU³\u0085Vê\u000fõÈ\u0016ïÑ\u009d7ó¹~éÌÙCÄd\u0088«\u0004U²\u0013HJéu>eP\u00847è\u008b.î\b8·áÏ«gî\u0084\u008c\u001dK^!r-¯ã`\u001cg\u0085Î4£\u0082né\u001d\u001e2N\u0089RÛ,\u001dÁ,ªSWßÕsâ'ýÅÞ\u0017\u008a\u001b§ÿÓ06¼\u000fò[Ô\u0097\u0087úño\n3ÍÑJnÐµscv\u00172Ù\u00ad\u008b¦\u0011I\u000eö\u008a\u0002tù\u0089\u0016rÛ\u008d\u008e§\u0090\u0003k Wh¼Ã\\+¶§VP_\u001fe.\u0003\u001cD\u008fn\u009aNÓ[\u001eUÞgÛe\u0094Uàõ_uññI[¸C\u008cü\u0083\u009e`è\u009eÝñ#{á\u001822¤À\u000eX ÚNè¼\r=è\u0010èyèþò\u0094ºª\u009aL\u0014Jy+,\u00ad\u0091"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      aab = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         aab[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = aaaba(1892, (short)-17211, '큽', (short)29781, -2060767317, '\uebd7', -1625472489)).length();
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var35;
         label74: {
            char[] var26 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10003 = var26.length;
            int var6 = 0;
            var35 = var26;
            var10001 = var10003;
            char[] var42;
            int var10004;
            if (var10003 <= 1) {
               var42 = var26;
               var10004 = var6;
            } else {
               var35 = var26;
               var10001 = var10003;
               if (var10003 <= var6) {
                  break label74;
               }

               var42 = var26;
               var10004 = var6;
            }

            while (true) {
               var42[var10004] = (char)(var42[var10004] ^ switch (var6 % a(1745564900, var23 ^ 97553200)) {
                  case 0 -> a(1745564901, var23 ^ -1561635078);
                  case 1 -> a(1745564898, var23 ^ -1225386677);
                  case 2 -> 3;
                  case 3 -> 4;
                  case 4 -> a(1745564899, var23 ^ 2098401911);
                  case 5 -> a(1745564896, var23 ^ 1817860030);
                  default -> a(1745564897, var23 ^ 1345382487);
               });
               var6++;
               if (var10001 == 0) {
                  var10004 = var10001;
                  var42 = var35;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var42 = var35;
                  var10004 = var6;
               }
            }
         }

         String var49 = new String(var35).intern();
         byte var33 = -1;
         var5[var3++] = var49;
         if ((var0 += var1) >= var4) {
            aa = var5;
            ab = new String[2];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static String aa(String param0) {
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
      // 09: ifnonnull 16
      // 0c: goto 10
      // 0f: athrow
      // 10: ldc ""
      // 12: goto 1a
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 1a: areturn
   }

   private static String ba(int var0, int var1) {
      int var9 = 1191350807;
      int var2 = (var0 ^ a(1745565158, var9 ^ -73133496)) & a(1745565159, var9 ^ -1867432202);
      if (ab[var2] == null) {
         char[] var3 = aa[var2].toCharArray();

         int var4 = switch (var3[0] & a(1745565156, var9 ^ 702718497)) {
            case 0 -> a(1745565157, var9 ^ 1441938246);
            case 1 -> a(1745565154, var9 ^ 1739038353);
            case 2 -> a(1745565155, var9 ^ -1181290782);
            case 3 -> a(1745565152, var9 ^ -1570135510);
            case 4 -> a(1745565153, var9 ^ 1761233476);
            case 5 -> a(1745565166, var9 ^ -758915787);
            case 6 -> a(1745565167, var9 ^ 1216224849);
            case 7 -> a(1745565164, var9 ^ -1305773956);
            case 8 -> a(1745565165, var9 ^ 1938142104);
            case 9 -> a(1745565162, var9 ^ -304336708);
            case 10 -> a(1745565163, var9 ^ -1863377776);
            case 11 -> a(1745565160, var9 ^ 1917826112);
            case 12 -> a(1745565161, var9 ^ 744518400);
            case 13 -> a(1745565174, var9 ^ 238381473);
            case 14 -> a(1745565175, var9 ^ 1993745937);
            case 15 -> a(1745565172, var9 ^ -807821490);
            case 16 -> a(1745565173, var9 ^ 845470669);
            case 17 -> a(1745565170, var9 ^ -808829326);
            case 18 -> a(1745565171, var9 ^ 1708405596);
            case 19 -> a(1745565168, var9 ^ 451660611);
            case 20 -> a(1745565169, var9 ^ -2074453958);
            case 21 -> a(1745565182, var9 ^ 216137757);
            case 22 -> a(1745565183, var9 ^ 2127318644);
            case 23 -> a(1745565180, var9 ^ 354345297);
            case 24 -> a(1745565181, var9 ^ -1727505235);
            case 25 -> a(1745565178, var9 ^ 2086568968);
            case 26 -> a(1745565179, var9 ^ -1225499659);
            case 27 -> a(1745565176, var9 ^ -1845537531);
            case 28 -> a(1745565177, var9 ^ 1993836700);
            case 29 -> a(1745565126, var9 ^ -258457881);
            case 30 -> a(1745565127, var9 ^ -1559143247);
            case 31 -> a(1745565124, var9 ^ 408500344);
            case 32 -> a(1745565125, var9 ^ -217165379);
            case 33 -> a(1745565122, var9 ^ 1420046566);
            case 34 -> a(1745565123, var9 ^ -594622805);
            case 35 -> a(1745565120, var9 ^ 1994854220);
            case 36 -> a(1745565121, var9 ^ -1711688154);
            case 37 -> a(1745565134, var9 ^ 1711891651);
            case 38 -> a(1745565135, var9 ^ 615087930);
            case 39 -> a(1745565132, var9 ^ -873389421);
            case 40 -> a(1745565133, var9 ^ -118087065);
            case 41 -> 5;
            case 42 -> a(1745565130, var9 ^ 570398253);
            case 43 -> a(1745565131, var9 ^ 2063274009);
            case 44 -> a(1745565128, var9 ^ 161751552);
            case 45 -> a(1745565129, var9 ^ -29259268);
            case 46 -> a(1745565142, var9 ^ -1853647656);
            case 47 -> a(1745565143, var9 ^ -1305220756);
            case 48 -> a(1745565140, var9 ^ -1977705051);
            case 49 -> a(1745565141, var9 ^ 2011237706);
            case 50 -> a(1745565138, var9 ^ 2043415305);
            case 51 -> a(1745565139, var9 ^ -709394539);
            case 52 -> a(1745565136, var9 ^ -1606683285);
            case 53 -> a(1745565137, var9 ^ -895092160);
            case 54 -> a(1745565150, var9 ^ -970342779);
            case 55 -> a(1745565151, var9 ^ -2034350803);
            case 56 -> a(1745565148, var9 ^ -2075048002);
            case 57 -> a(1745565149, var9 ^ 1074615078);
            case 58 -> a(1745565146, var9 ^ 298421215);
            case 59 -> a(1745565147, var9 ^ 432079032);
            case 60 -> a(1745565144, var9 ^ -657803542);
            case 61 -> a(1745565145, var9 ^ 1029843394);
            case 62 -> a(1745565094, var9 ^ -373605419);
            case 63 -> a(1745565095, var9 ^ 1229332059);
            case 64 -> a(1745565092, var9 ^ -1956933821);
            case 65 -> a(1745565093, var9 ^ -891332371);
            case 66 -> a(1745565090, var9 ^ 599309353);
            case 67 -> a(1745565091, var9 ^ 207796043);
            case 68 -> a(1745565088, var9 ^ 1366474618);
            case 69 -> a(1745565089, var9 ^ 741534137);
            case 70 -> a(1745565102, var9 ^ -178306214);
            case 71 -> a(1745565103, var9 ^ -40453409);
            case 72 -> a(1745565100, var9 ^ 1946397430);
            case 73 -> a(1745565101, var9 ^ 578282065);
            case 74 -> a(1745565098, var9 ^ 580835255);
            case 75 -> a(1745565099, var9 ^ -334616739);
            case 76 -> a(1745565096, var9 ^ 825484735);
            case 77 -> a(1745565097, var9 ^ -472307230);
            case 78 -> a(1745565110, var9 ^ -593178388);
            case 79 -> a(1745565111, var9 ^ -779189423);
            case 80 -> a(1745565108, var9 ^ -1811197239);
            case 81 -> a(1745565109, var9 ^ 1438902111);
            case 82 -> a(1745565106, var9 ^ 2058814368);
            case 83 -> a(1745565107, var9 ^ -1768318739);
            case 84 -> a(1745565104, var9 ^ 350497874);
            case 85 -> a(1745565105, var9 ^ 524857418);
            case 86 -> a(1745565118, var9 ^ 1296438035);
            case 87 -> a(1745565119, var9 ^ -1251495036);
            case 88 -> a(1745565116, var9 ^ -1730042014);
            case 89 -> a(1745565117, var9 ^ -529569505);
            case 90 -> a(1745565114, var9 ^ 840403546);
            case 91 -> a(1745565115, var9 ^ -1185598015);
            case 92 -> a(1745565112, var9 ^ -646853858);
            case 93 -> a(1745565113, var9 ^ -1145458388);
            case 94 -> a(1745565062, var9 ^ 88030826);
            case 95 -> a(1745565063, var9 ^ -1690209954);
            case 96 -> a(1745565060, var9 ^ -36265429);
            case 97 -> a(1745565061, var9 ^ 1524430689);
            case 98 -> a(1745565058, var9 ^ -2034272009);
            case 99 -> a(1745565059, var9 ^ 737065085);
            case 100 -> a(1745565056, var9 ^ 1749881596);
            case 101 -> a(1745565057, var9 ^ 1095935254);
            case 102 -> a(1745565070, var9 ^ 1454367865);
            case 103 -> a(1745565071, var9 ^ -1983467094);
            case 104 -> a(1745565068, var9 ^ 687614339);
            case 105 -> a(1745565069, var9 ^ 757750382);
            case 106 -> a(1745565066, var9 ^ 1681123349);
            case 107 -> a(1745565067, var9 ^ 2062791699);
            case 108 -> a(1745565064, var9 ^ -577010758);
            case 109 -> a(1745565065, var9 ^ 1080494333);
            case 110 -> a(1745565078, var9 ^ 1086237901);
            case 111 -> a(1745565079, var9 ^ -729641882);
            case 112 -> a(1745565076, var9 ^ -678121088);
            case 113 -> a(1745565077, var9 ^ 1720361510);
            case 114 -> a(1745565074, var9 ^ -576477797);
            case 115 -> a(1745565075, var9 ^ 1556198885);
            case 116 -> a(1745565072, var9 ^ -2023740651);
            case 117 -> a(1745565073, var9 ^ 453578406);
            case 118 -> a(1745565086, var9 ^ 840123427);
            case 119 -> a(1745565087, var9 ^ -1403190115);
            case 120 -> a(1745565084, var9 ^ -230118745);
            case 121 -> a(1745565085, var9 ^ -130838067);
            case 122 -> a(1745565082, var9 ^ 772293305);
            case 123 -> a(1745565083, var9 ^ -1174536830);
            case 124 -> a(1745565080, var9 ^ 420101068);
            case 125 -> a(1745565081, var9 ^ -46325020);
            case 126 -> a(1745565030, var9 ^ 707490588);
            case 127 -> a(1745565031, var9 ^ -586520357);
            case 128 -> a(1745565028, var9 ^ -2060717105);
            case 129 -> a(1745565029, var9 ^ -1030927439);
            case 130 -> a(1745565026, var9 ^ 994094919);
            case 131 -> a(1745565027, var9 ^ 1533588460);
            case 132 -> a(1745565024, var9 ^ 1488814256);
            case 133 -> a(1745565025, var9 ^ 1944152888);
            case 134 -> 3;
            case 135 -> a(1745565038, var9 ^ 678570885);
            case 136 -> a(1745565039, var9 ^ 2139431245);
            case 137 -> a(1745565036, var9 ^ -664549584);
            case 138 -> a(1745565037, var9 ^ 1920449093);
            case 139 -> a(1745565034, var9 ^ 2067811463);
            case 140 -> a(1745565035, var9 ^ -1571252690);
            case 141 -> a(1745565032, var9 ^ 1977853631);
            case 142 -> a(1745565033, var9 ^ 597272682);
            case 143 -> a(1745565046, var9 ^ -1389454895);
            case 144 -> a(1745565047, var9 ^ -989879395);
            case 145 -> a(1745565044, var9 ^ -975513818);
            case 146 -> a(1745565045, var9 ^ -817046969);
            case 147 -> a(1745565042, var9 ^ 1701056694);
            case 148 -> a(1745565043, var9 ^ -1464847634);
            case 149 -> a(1745565040, var9 ^ 1156386238);
            case 150 -> a(1745565041, var9 ^ -217403883);
            case 151 -> a(1745565054, var9 ^ 2106006916);
            case 152 -> a(1745565055, var9 ^ 691537089);
            case 153 -> a(1745565052, var9 ^ 772725863);
            case 154 -> a(1745565053, var9 ^ 1840756975);
            case 155 -> a(1745565050, var9 ^ -1218593825);
            case 156 -> a(1745565051, var9 ^ 1728459319);
            case 157 -> a(1745565048, var9 ^ 1563211574);
            case 158 -> a(1745565049, var9 ^ 1741591724);
            case 159 -> 0;
            case 160 -> a(1745564998, var9 ^ 656452569);
            case 161 -> a(1745564999, var9 ^ -1713213127);
            case 162 -> a(1745564996, var9 ^ -1460207983);
            case 163 -> a(1745564997, var9 ^ -1460468650);
            case 164 -> a(1745564994, var9 ^ -244681960);
            case 165 -> a(1745564995, var9 ^ -1926779769);
            case 166 -> a(1745564992, var9 ^ 1171082420);
            case 167 -> a(1745564993, var9 ^ -1795767539);
            case 168 -> a(1745565006, var9 ^ -468575575);
            case 169 -> a(1745565007, var9 ^ -1805594684);
            case 170 -> a(1745565004, var9 ^ 119346011);
            case 171 -> a(1745565005, var9 ^ -1573760551);
            case 172 -> 4;
            case 173 -> a(1745565002, var9 ^ 1651232905);
            case 174 -> a(1745565003, var9 ^ 1329168676);
            case 175 -> a(1745565000, var9 ^ -1601971699);
            case 176 -> a(1745565001, var9 ^ -82795834);
            case 177 -> a(1745565014, var9 ^ 960564631);
            case 178 -> a(1745565015, var9 ^ -601926098);
            case 179 -> a(1745565012, var9 ^ -171569029);
            case 180 -> a(1745565013, var9 ^ 1387004213);
            case 181 -> a(1745565010, var9 ^ -1440513570);
            case 182 -> a(1745565011, var9 ^ -500445396);
            case 183 -> a(1745565008, var9 ^ -1126904896);
            case 184 -> a(1745565009, var9 ^ -1449854775);
            case 185 -> 2;
            case 186 -> a(1745565022, var9 ^ 289209457);
            case 187 -> a(1745565023, var9 ^ 1192551223);
            case 188 -> a(1745565020, var9 ^ 1429124025);
            case 189 -> a(1745565021, var9 ^ -760894588);
            case 190 -> a(1745565018, var9 ^ -1747417632);
            case 191 -> a(1745565019, var9 ^ -977629285);
            case 192 -> a(1745565016, var9 ^ -1029158990);
            case 193 -> a(1745565017, var9 ^ 1934533947);
            case 194 -> a(1745564966, var9 ^ 1918954782);
            case 195 -> a(1745564967, var9 ^ 1361513138);
            case 196 -> a(1745564964, var9 ^ 827281214);
            case 197 -> a(1745564965, var9 ^ 737704877);
            case 198 -> a(1745564962, var9 ^ -820202911);
            case 199 -> a(1745564963, var9 ^ 1853538875);
            case 200 -> a(1745564960, var9 ^ 114766727);
            case 201 -> a(1745564961, var9 ^ 1422148744);
            case 202 -> a(1745564974, var9 ^ -2125464488);
            case 203 -> a(1745564975, var9 ^ -1007022105);
            case 204 -> a(1745564972, var9 ^ 340082148);
            case 205 -> a(1745564973, var9 ^ 1800308046);
            case 206 -> a(1745564970, var9 ^ -1467250402);
            case 207 -> a(1745564971, var9 ^ -655217263);
            case 208 -> a(1745564968, var9 ^ 455734351);
            case 209 -> a(1745564969, var9 ^ -172252880);
            case 210 -> a(1745564982, var9 ^ 367868183);
            case 211 -> a(1745564983, var9 ^ 1627248382);
            case 212 -> a(1745564980, var9 ^ 2079415784);
            case 213 -> a(1745564981, var9 ^ 1971693790);
            case 214 -> a(1745564978, var9 ^ -1318569476);
            case 215 -> a(1745564979, var9 ^ 433569530);
            case 216 -> a(1745564976, var9 ^ -2027200974);
            case 217 -> a(1745564977, var9 ^ -771079604);
            case 218 -> a(1745564990, var9 ^ 836009326);
            case 219 -> a(1745564991, var9 ^ 217706173);
            case 220 -> a(1745564988, var9 ^ -465968015);
            case 221 -> a(1745564989, var9 ^ 1551235863);
            case 222 -> a(1745564986, var9 ^ 973336352);
            case 223 -> a(1745564987, var9 ^ -888514098);
            case 224 -> a(1745564984, var9 ^ 1641265461);
            case 225 -> a(1745564985, var9 ^ -119767320);
            case 226 -> a(1745564934, var9 ^ 684920522);
            case 227 -> a(1745564935, var9 ^ 1383526316);
            case 228 -> a(1745564932, var9 ^ 1024468393);
            case 229 -> a(1745564933, var9 ^ 790746641);
            case 230 -> a(1745564930, var9 ^ -2130105889);
            case 231 -> a(1745564931, var9 ^ 567585917);
            case 232 -> a(1745564928, var9 ^ 2104703044);
            case 233 -> a(1745564929, var9 ^ -1810781075);
            case 234 -> a(1745564942, var9 ^ 1670898318);
            case 235 -> a(1745564943, var9 ^ -1863794152);
            case 236 -> a(1745564940, var9 ^ 1757443082);
            case 237 -> a(1745564941, var9 ^ 1488431661);
            case 238 -> a(1745564938, var9 ^ -1326546660);
            case 239 -> a(1745564939, var9 ^ -214809614);
            case 240 -> a(1745564936, var9 ^ -1683343820);
            case 241 -> a(1745564937, var9 ^ -1101874304);
            case 242 -> a(1745564950, var9 ^ -2098413462);
            case 243 -> a(1745564951, var9 ^ -1618427299);
            case 244 -> a(1745564948, var9 ^ 959101080);
            case 245 -> a(1745564949, var9 ^ -491382980);
            case 246 -> a(1745564946, var9 ^ 104037571);
            case 247 -> a(1745564947, var9 ^ 1296648317);
            case 248 -> a(1745564944, var9 ^ 1498376711);
            case 249 -> a(1745564945, var9 ^ -1046863367);
            case 250 -> a(1745564958, var9 ^ 614327909);
            case 251 -> a(1745564959, var9 ^ -201396760);
            case 252 -> a(1745564956, var9 ^ -107288598);
            case 253 -> 1;
            case 254 -> a(1745564957, var9 ^ 270718165);
            default -> a(1745564954, var9 ^ 1277293914);
         };
         int var5 = (var1 & a(1745564955, var9 ^ 564658174)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1745564952, var9 ^ 337742832)) >>> a(1745564953, var9 ^ 686216302)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1745564902, var9 ^ 450708879);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1745564903, var9 ^ 986464664);
            }
         }

         ab[var2] = new String(var3).intern();
      }

      return ab[var2];
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void bb(int var1) {
      int var10000 = baaabbaa.bba;
      ArrayList var3 = new ArrayList(this.bb);
      int var2 = var10000;

      label31: {
         label30: {
            label29: {
               try {
                  var10000 = var1;
                  if (var2 != 0) {
                     break label29;
                  }

                  if (var1 < 0) {
                     break label30;
                  }
               } catch (MatchException var6) {
                  throw var6;
               }

               var10000 = var1;
            }

            try {
               if (var10000 < var3.size()) {
                  break label31;
               }
            } catch (MatchException var5) {
               throw var5;
            }
         }

         try {
            return;
         } catch (MatchException var4) {
            throw var4;
         }
      }

      var3.remove(var1);
      this.aaba(var3);
   }

   @Override
   public Object abbb() {
      return this.aaaa();
   }

   public void aaa(List var1) {
      this.aaba(bab(var1));
   }

   public bb(Object param1, Collection param2, Object param3) {
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
      // 05: invokestatic java/util/List.of ()Ljava/util/List;
      // 08: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.<init> (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0b: istore 4
      // 0d: aload 0
      // 0e: aload 2
      // 0f: iload 4
      // 11: ifne 3a
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.bab (Ljava/util/Collection;)Ljava/util/List;
      // 17: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaa Ljava/util/List;
      // 1a: aload 0
      // 1b: aload 0
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaa Ljava/util/List;
      // 1f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.bb Ljava/util/List;
      // 22: aload 0
      // 23: aload 3
      // 24: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 27: ifeq 39
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 3
      // 2f: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 32: astore 5
      // 34: aload 5
      // 36: goto 84
      // 39: aload 3
      // 3a: iload 4
      // 3c: ifne 47
      // 3f: ifnull 59
      // 42: goto 46
      // 45: athrow
      // 46: aload 3
      // 47: iload 4
      // 49: ifne 7e
      // 4c: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 4f: invokevirtual java/lang/String.isBlank ()Z
      // 52: ifeq 7d
      // 55: goto 59
      // 58: athrow
      // 59: ldc_w 1745564910
      // 5c: ldc_w 1715055171
      // 5f: ldc_w 552466291
      // 62: ixor
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.a (II)I
      // 66: ldc_w 1745564911
      // 69: ldc_w 1715055171
      // 6c: ldc_w 1408061120
      // 6f: ixor
      // 70: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.a (II)I
      // 73: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.ba (II)Ljava/lang/String;
      // 76: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 79: goto 81
      // 7c: athrow
      // 7d: aload 3
      // 7e: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 81: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aa (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 84: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 87: return
   }

   @Override
   public void aab(Object var1) {
      this.aaa((List)var1);
   }

   public void abb(int param1, String param2) {
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
      // 07: aload 0
      // 08: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.bb Ljava/util/List;
      // 0b: invokespecial java/util/ArrayList.<init> (Ljava/util/Collection;)V
      // 0e: astore 4
      // 10: istore 3
      // 11: iload 1
      // 12: iload 3
      // 13: ifne 1e
      // 16: iflt 28
      // 19: goto 1d
      // 1c: athrow
      // 1d: iload 1
      // 1e: aload 4
      // 20: invokeinterface java/util/List.size ()I 1
      // 25: if_icmplt 2a
      // 28: return
      // 29: athrow
      // 2a: aload 2
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aa (Ljava/lang/String;)Ljava/lang/String;
      // 2e: astore 5
      // 30: aload 5
      // 32: iload 3
      // 33: ifne 62
      // 36: invokevirtual java/lang/String.isEmpty ()Z
      // 39: ifeq 51
      // 3c: goto 40
      // 3f: athrow
      // 40: aload 4
      // 42: iload 1
      // 43: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 48: pop
      // 49: iload 3
      // 4a: ifeq 63
      // 4d: goto 51
      // 50: athrow
      // 51: aload 4
      // 53: iload 1
      // 54: aload 5
      // 56: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aa (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 59: invokeinterface java/util/List.set (ILjava/lang/Object;)Ljava/lang/Object; 3
      // 5e: goto 62
      // 61: athrow
      // 62: pop
      // 63: aload 0
      // 64: aload 4
      // 66: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaba (Ljava/util/List;)V
      // 69: return
   }

   private static List baa(List param0) {
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
      // 06: ifne 2c
      // 09: ifnull 25
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 2c
      // 15: goto 19
      // 18: athrow
      // 19: invokeinterface java/util/List.isEmpty ()Z 1
      // 1e: ifeq 2d
      // 21: goto 25
      // 24: athrow
      // 25: invokestatic java/util/List.of ()Ljava/util/List;
      // 28: goto 2c
      // 2b: athrow
      // 2c: areturn
      // 2d: new java/util/ArrayList
      // 30: dup
      // 31: aload 0
      // 32: invokeinterface java/util/List.size ()I 1
      // 37: invokespecial java/util/ArrayList.<init> (I)V
      // 3a: astore 2
      // 3b: aload 0
      // 3c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 41: astore 3
      // 42: aload 3
      // 43: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 48: ifeq 6e
      // 4b: aload 3
      // 4c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 51: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 54: astore 4
      // 56: aload 2
      // 57: iload 1
      // 58: ifne 72
      // 5b: aload 4
      // 5d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 60: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 65: pop
      // 66: iload 1
      // 67: ifeq 42
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 2
      // 6f: invokestatic java/util/List.copyOf (Ljava/util/Collection;)Ljava/util/List;
      // 72: areturn
   }

   private static List bab(Collection param0) {
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
      // 06: ifne 11
      // 09: ifnull 19
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 16: ifeq 1e
      // 19: invokestatic java/util/List.of ()Ljava/util/List;
      // 1c: areturn
      // 1d: athrow
      // 1e: new java/util/ArrayList
      // 21: dup
      // 22: invokespecial java/util/ArrayList.<init> ()V
      // 25: astore 2
      // 26: aload 0
      // 27: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 2c: astore 3
      // 2d: aload 3
      // 2e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 33: ifeq a1
      // 36: aload 3
      // 37: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3c: astore 4
      // 3e: aload 4
      // 40: iload 1
      // 41: ifne 5f
      // 44: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 47: ifeq 5d
      // 4a: goto 4e
      // 4d: athrow
      // 4e: aload 4
      // 50: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 53: astore 6
      // 55: iload 1
      // 56: aload 6
      // 58: astore 5
      // 5a: ifeq 80
      // 5d: aload 4
      // 5f: iload 1
      // 60: ifne 71
      // 63: ifnonnull 6f
      // 66: goto 6a
      // 69: athrow
      // 6a: aconst_null
      // 6b: goto 74
      // 6e: athrow
      // 6f: aload 4
      // 71: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 74: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aa (Ljava/lang/String;)Ljava/lang/String;
      // 77: astore 7
      // 79: aload 7
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.aa (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 7e: astore 5
      // 80: aload 5
      // 82: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.baaa ()Z
      // 85: iload 1
      // 86: ifne 9c
      // 89: ifne 9d
      // 8c: goto 90
      // 8f: athrow
      // 90: aload 2
      // 91: aload 5
      // 93: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 98: goto 9c
      // 9b: athrow
      // 9c: pop
      // 9d: iload 1
      // 9e: ifeq 2d
      // a1: aload 2
      // a2: invokestatic java/util/List.copyOf (Ljava/util/Collection;)Ljava/util/List;
      // a5: areturn
   }

   @Override
   public Object abab() {
      return this.aabb();
   }

   public void bba(String var1) {
      try {
         if (var1 == null) {
            return;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      ArrayList var2 = new ArrayList(this.bb);

      try {
         if (var2.removeIf(bb::aaab)) {
            this.aaba(var2);
         }
      } catch (MatchException var3) {
         throw var3;
      }
   }

   public List bbb() {
      return this.bb;
   }

   public List aaaa() {
      return baa(this.bb);
   }

   public void b(String var1, int var2) {
      int var10000 = baaabbaa.bba;
      String var4 = aa(var1);
      int var3 = var10000;

      try {
         if (var4.isEmpty()) {
            return;
         }
      } catch (MatchException var8) {
         throw var8;
      }

      ArrayList var5 = new ArrayList(this.bb);
      var5.add(0, aabbaaaba.aa(var4));
      int var6 = Math.max(0, var2);

      while (true) {
         if (var5.size() > var6) {
            try {
               if (var3 != 0) {
                  break;
               }

               var5.remove(var5.size() - 1);
               if (var3 == 0) {
                  continue;
               }
            } catch (MatchException var7) {
               throw var7;
            }
         }

         this.aaba(var5);
         break;
      }
   }

   public bb(Object var1, Collection var2) {
      this(var1, var2, aabbaaaba.aaab(ba(a(1745564908, 1369564458 ^ 544602852), a(1745564909, 1369564458 ^ -853029491))));
   }

   private static int a(int var0, int var1) {
      int var2 = aab[var0 ^ 1745565158] ^ var1 ^ var0;
      var2 -= 41173;
      var2 += 64607;
      var2 += 33399;
      var2 ^= 56818;
      var2 += 21410;
      var2 ^= 65081;
      var2 += 24118;
      return var2 ^ 42901;
   }

   @Override
   public JsonElement aba() {
      int var10000 = baaabbaa.bba;
      JsonArray var2 = new JsonArray();
      int var1 = var10000;
      Iterator var3 = this.bb.iterator();

      while (true) {
         if (var3.hasNext()) {
            ababbbbaa var4 = (ababbbbaa)var3.next();

            try {
               var6 = var2;
               if (var1 != 0) {
                  break;
               }

               var2.add(new JsonPrimitive(var4.abab()));
               if (var1 == 0) {
                  continue;
               }
            } catch (MatchException var5) {
               throw var5;
            }
         }

         var6 = var2;
         break;
      }

      return var6;
   }

   private static boolean aaab(String var0, ababbbbaa var1) {
      return var1.baab(var0);
   }

   private void aaba(List param1) {
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
      // 09: ifnonnull 17
      // 0c: goto 10
      // 0f: athrow
      // 10: invokestatic java/util/List.of ()Ljava/util/List;
      // 13: goto 1b
      // 16: athrow
      // 17: aload 1
      // 18: invokestatic java/util/List.copyOf (Ljava/util/Collection;)Ljava/util/List;
      // 1b: astore 3
      // 1c: iload 2
      // 1d: ifne 38
      // 20: aload 0
      // 21: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.bb Ljava/util/List;
      // 24: aload 3
      // 25: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.abaa (Ljava/util/List;Ljava/util/List;)Z
      // 28: ifne 3c
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 3
      // 31: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.bb Ljava/util/List;
      // 34: goto 38
      // 37: athrow
      // 38: aload 0
      // 39: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.bbaa ()V
      // 3c: return
   }

   public List aabb() {
      return baa(this.aaa);
   }

   @Override
   public void abba() {
      this.aaba(this.aaa);
   }

   private static boolean abaa(List param0, List param1) {
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
      // 06: ifne 15
      // 09: aload 1
      // 0a: if_acmpne 14
      // 0d: goto 11
      // 10: athrow
      // 11: bipush 1
      // 12: ireturn
      // 13: athrow
      // 14: aload 0
      // 15: iload 2
      // 16: ifne 21
      // 19: ifnull 43
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 1
      // 21: iload 2
      // 22: ifne 2d
      // 25: ifnull 43
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: invokeinterface java/util/List.size ()I 1
      // 32: iload 2
      // 33: ifne 47
      // 36: aload 1
      // 37: invokeinterface java/util/List.size ()I 1
      // 3c: if_icmpeq 46
      // 3f: goto 43
      // 42: athrow
      // 43: bipush 0
      // 44: ireturn
      // 45: athrow
      // 46: bipush 0
      // 47: istore 3
      // 48: iload 3
      // 49: aload 0
      // 4a: invokeinterface java/util/List.size ()I 1
      // 4f: if_icmpge 85
      // 52: aload 0
      // 53: iload 3
      // 54: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 59: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 5c: aload 1
      // 5d: iload 3
      // 5e: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 63: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 66: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.aaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 69: iload 2
      // 6a: ifne 86
      // 6d: iload 2
      // 6e: ifne 7d
      // 71: goto 75
      // 74: athrow
      // 75: ifne 7e
      // 78: goto 7c
      // 7b: athrow
      // 7c: bipush 0
      // 7d: ireturn
      // 7e: iinc 3 1
      // 81: iload 2
      // 82: ifeq 48
      // 85: bipush 1
      // 86: ireturn
   }

   @Override
   public void ab(JsonElement param1) {
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
      // 12: ifne 29
      // 15: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 18: ifeq 28
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: invokestatic java/util/List.of ()Ljava/util/List;
      // 23: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaa (Ljava/util/List;)V
      // 26: return
      // 27: athrow
      // 28: aload 1
      // 29: iload 2
      // 2a: ifne 9e
      // 2d: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 30: ifeq 9d
      // 33: goto 37
      // 36: athrow
      // 37: new java/util/ArrayList
      // 3a: dup
      // 3b: invokespecial java/util/ArrayList.<init> ()V
      // 3e: astore 3
      // 3f: aload 1
      // 40: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 43: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 46: astore 4
      // 48: aload 4
      // 4a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4f: ifeq 97
      // 52: aload 4
      // 54: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 59: checkcast com/google/gson/JsonElement
      // 5c: astore 5
      // 5e: iload 2
      // 5f: ifne 9c
      // 62: aload 5
      // 64: iload 2
      // 65: ifne 75
      // 68: goto 6c
      // 6b: athrow
      // 6c: ifnull 93
      // 6f: goto 73
      // 72: athrow
      // 73: aload 5
      // 75: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 78: iload 2
      // 79: ifne 92
      // 7c: ifeq 93
      // 7f: goto 83
      // 82: athrow
      // 83: aload 3
      // 84: aload 5
      // 86: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 89: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8e: goto 92
      // 91: athrow
      // 92: pop
      // 93: iload 2
      // 94: ifeq 48
      // 97: aload 0
      // 98: aload 3
      // 99: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaa (Ljava/util/List;)V
      // 9c: return
      // 9d: aload 1
      // 9e: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // a1: ifeq ba
      // a4: aload 0
      // a5: aload 1
      // a6: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // a9: aload 0
      // aa: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // ad: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // b0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.abb (Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
      // b3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaa (Ljava/util/List;)V
      // b6: goto ba
      // b9: athrow
      // ba: return
   }

   public bb(String var1, Collection var2, String var3) {
      this((Object)var1, var2, var3);
   }

   public bb(Object var1, Collection var2, String var3) {
      this(var1, var2, (Object)var3);
   }

   private static String aaaba(short var0, short var1, char var2, short var3, int var4, char var5, int var6) {
      int var11 = var6 ^ -1625472489;
      char[] var10 = aba[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])abb[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         abb[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 20259;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 9) {
            default -> 64;
            case 1 -> 202;
            case 2 -> 156;
            case 3 -> 239;
            case 4 -> 132;
            case 5 -> 39;
            case 6 -> 207;
            case 7 -> 68;
            case 8 -> 1;
         } ^ var5 ^ var4 ^ var1 ^ var8 ^ var0 ^ var3 ^ var2 ^ var6);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   public bb(String var1, Collection var2) {
      this(var1, var2, aabbaaaba.aaab(ba(a(1745564906, -1269350612 ^ -260074388), a(1745564907, -1269350612 ^ -1756928302))));
   }

   public void baaa(String var1) {
      String var2 = aa(var1);

      try {
         if (var2.isEmpty()) {
            return;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      ArrayList var3 = new ArrayList(this.bb);
      var3.add(aabbaaaba.aa(var2));
      this.aaba(var3);
   }
}
