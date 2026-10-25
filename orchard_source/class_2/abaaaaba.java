package nsc;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
public final class abaaaaba extends abbaabbaa {
   private static final int[] baa;
   private static final Long[] aa;
   private static final long[] ab;
   private static final String[] bab;
   private static final Integer[] ba;
   private static final Object[] bba;
   private static String[] bb;
   private final baabaab aaa;
   private static final String[] aab;
   private static final long[] aba;
   private static final String[] abb;

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
      // 06: ifne 18
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.babbaab ()Z
      // 0c: ifeq 1b
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: goto 1c
      // 1b: aconst_null
      // 1c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.aa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;)V
      // 1f: return
   }

   @Override
   public String ababa() {
      return ((aabbabaab)this.aaa.abbb()).aa();
   }

   @Override
   public void abaab() {
      abaaaab.aa(this);
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(201119297, -110953296 ^ -1636644582);
      if (ba[var3] == null) {
         ba[var3] = (int)(ab[var3] ^ var1);
      }

      return ba[var3];
   }

   public aabbabaab ab() {
      return (aabbabaab)this.aaa.abbb();
   }

   public boolean ba(UUID var1) {
      return abaaaab.bab(var1);
   }

   private static String b(byte var0, char var1, int var2, int var3) {
      int var8 = var3 ^ 1361165045;
      char[] var7 = bab[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])bba[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         bba[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 47730;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ '雜' ^ var0 ^ var3 ^ var5 ^ var1 ^ var2);
      }

      return new String(var7).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var40 = -1653965262;
      short var29 = 18489;
      byte var36 = -1;
      char[] var31 = "䠬䡜䠑䠳䠩䠳䠡䠳䠩䠳".toCharArray();
      String var30 = "ā≟헸즽莮㧅怪醈\ue160풕腥摄펕쿋敽拭\ue18f飧쌆\ufdd6\uededඥ콛澹\ueccd\u058b㶧ฌ蒭భ렃\ue693縇쌰槵縠\ud9fa㨨䘹垠ᗈ駨淧㋓ꝟڃ؆퉳\ue2b0\uf2c2鏋 \udc27序⍝溶嘓\ue01a豹ꎔ兺쯵\u0b98ඃ뜯ᩊ梞趱햟ዥ㊥怯ꙸ牢ᔃ쓈䠪즅귡ᓇ\ufdcc鋨用\ueb5c骏\uf4de\u2e69얿毰顇잧逘샎\uf3b9䙨뿴巳\ueb55णႮ႖帆砎⸪ᕔ貗᚛쑣莁\uf838仚掣\uf694\ue78aЁ詌䌒囮㹝\uf851閉ｒ눜닫늀뉪늴뉺늉눔뉝눂늞닕뉏눗닥늄뉰뉪닞눟늯닃뉞닀뉺닑닞닾뉌닚뉎느늘눑단눥뉳늧늴뉚쨝쪱쪒쩭쨚쨿쩡쫛쫰쩱ᢑᡢᣈᠮᡈᡵᢿᡭᢘᡣᣖᡙᠱᢇᢧᡇ鳼鱐鱳鲌鳻鳞鲀鰺鰑鲐擈摷摖摾擻擄撅撕搔搨摅摩摦搌撖擉擬撙撳擋摉摥擇摶坭埁埢圝坪坏圑垫垀圁⫖⨾⩓⩁⨴⩢⨼⪩⩸⪜⩒⩗⫇⩵⩅⫀쾣켏켬쿓쾤쾁쿟콥콎쿏";
      String[] var32 = new String[var31.length];

      while (true) {
         int var33 = 0;
         int var34 = 0;
         int var35 = 0;
         if (var36 == 0) {
            bab = var32;
            bba = new Object[var32.length];
            int var25 = -1655491130;
            byte[] var23 = "\u000e@e\u0015«r7Ý¹\u0099\u0085ÌÎõfì\u0085Y\tîO\r\u0083õ\u007f\u0019^´¹<Së½\"É\u009dk\u001câ¥\u009dúU\u0092\nÈ\u007fÏz¯\u007f8Vg´¦Gé\u008f\u0017X\u0000\u0098¤ìÖOiÜªÛÚ>Ò!±Ú©V{ï\\3vãHd\u00991)\u009eQDUÌ,ÕÎ\\\u008d\u001a%¨\u001a\u009ccQ×\u0098¥ÙÕ´ÇA3\n7\u009c\u0013\f£2Sy|¥ î}U\u0099©-Tü\u0098ÉÍ9W4\u0003'\u0007è\u0006\u0083ZÍ3CÈqO\u001a\u0086ã-\u007f\u0014µQËÔ\u001f×\u0013er\fæÈ\u00ad\u0001j}¸\u0000\u008f\u0080ý¥µ·\u001d\u000b'ÈâqÔ©Í\u0085àþÓ\u0086\u008b°Ò ¦\u0096ì*¢u¿·¨\u007ffÂ¿hÖgDCmzýÇTO\u0090ß\u0091ð¸Óû\u000fMq\u0012\u008f8+L%òT\u00801a´*ã³$ØZÉ\u0019Ê´2'Ù\u0085\u0002âqO\u0087^\u0011²ª\u0085ÄydßÐÏ\u009bw=\u008b+Lð¬»\u0082gW¶Bu¬§j\r·E\u009dÇèÂKÇ(\u009a3*`K¦æÌ¸ê\u009f\u001bþPÆt3\u000e·\u0002ÿÉmüù6q¨k\u0094Ö\u007f}\u0011RÌõ\u0014\u009fº\u0089+ßÄ\u001b\u0091Ìn\u007f|øz×K!¦GèH@\u0088þ1©écTí¡ éþN4\u0019\u008c\u0087ùÈÚÕ\u0003ìFµùQ\u007f¸\u0012Æ\u0004\u009aÆ\u007f_!U\u0095£ÙÍe\u0018B½%\u001eÆ\u009büñ9z\tö0\u001cx\rÜ\u000e[¿N%\u0011\u0099y¼\u0006\u0088¨lWg¡ËH\u0000\u001aH¼$ï_ÿX\u000eî`,\u0003¦ç¯¨\u0017¿Ôñy\u0002\u0081t\u00917rv~õ\u0003\u0013W\u0006àÐ?\u001a¶h\u0089-ü\u0015\u0007hÉ\u000f*P\u0086»\u009d^-\u0016y»\n.ëÝ2\u008c\u0005¿×ì«\u009d]ÎçéÁØ-Å\u0010÷èÁ;åçê[\u0086¬slÈÑzù\u000e\u0091ö\u0007åÊ\u009a~\u0088\u0004inîz\\ø½kÝë\u009a8LòaJçðz«úHe\u009f#våu\u009f¡\u0007\u0098\u0099S»\u0092s\u008a®0¬\u008b)J\u0090ÛC\u00100ó¾UßëH\u007f\u001c=³Ã.Úx.¼¾HWL+¹JÍÆo'LÆ\u0092¢B\u009f\u000e©\u0084íÜ(\u001b¡¢È¥M~3*\u001bn\u001d\"_s\u008cÿ\u0007D\u008cæ\u0087¿\u0007Ô²\u0093Ûº\r¨'Á°ÅHDê7_âhúì6±\\\u0007k]hÎÃÐ¼\u0002\u0097c#Y\u0006\u007f\u009b\u0087¬\u0004!+Ë\u009cø@d(ô²) dù2\u00adú±\u001b]\u008a¹\u009d<x5ÂPÜ¿A,\u0018\u009b2ÈÚ_\u0085mäð?Z!\u0098®7\u0019c\u000fÆ3âÜµ¡\u0019\u009eÁ\u0006Eß ÀÀ±#Xw¯ öTó^Oçk³ÁÿJÃ7wµ\r\u0091\u009fý\u001b³>\u0082jM\u0003\u008eÊ[+\u0099Y\u008c\u009b\u0003T´ex\u0018µõð¹ÓØ¹\u0001À\u0092\u0099\u0089ä\u001acè\b\u0010ÞKÌl\u0097ª\u0006È\u00ad×«\u0000°Ð\n-ÊÎ\u0090iT¯\r\u0087\u001eûÂa0¼\u00962|Aû\u001cLÁÚ§î%\u0090ã\u0087\u0005ý.\u0019Ø\u0018b\u009f8\u0016ç\u009c\u009cåb\u0017Á°\u0090#Ï±\f66\u00153év>ÌWÈÁ[5×Þ\n%²¤\u008bwñÞú\u009dG\n×X\\tã>Ì\u0007eüH¢g\u0095?Wü¸§æÆ>çÞ\u001e\u0081Îª\u0097f\u008a^\u0093\u0091\u0004\u009b=z\u0014©BD\u001aîUÂCW\u0096Re\u008a\u0092Ò¾Fy¾Zê%\u0090Ht\rå\u0083\u0099æú\u0015\"ñdÍ\u009c!ø\u001c õ¨V´¡È£\u009c\u009e´ôð\"²ò\u000f\u0094\u0013\u001a³\u008dc§\u0007ÒÏaýû\u0092\u0000[Äz\u0084\f-\u0014É²YTY©«\u0016\bøý\u0013U\u001e\u0005}ÖÀ\u0015[(¯òHyi¿B;Î¦A-x\u008cNÃ\u000eÓ¿ÝËW_r\u0017ëè\"®ñ\u0006 aÂ\u0010\u0001mþ\u0088\u008azð^ÜÛ\u009aÃxþQ.T\u009bdß\u000e\u009dnPuf)\u0005\u009c»xô®\r\u0099\u008a\u0090t\n\u0087âyüÛ\u0093Õ²>u¯´Ñac7z\u0084÷é\u0095\u000eV6\u0087ê\\É¯ÅÊë\t¥\n\u001b'\u0083C\u000fî\u000eF\u008f¸\u0085à\u009d1\u0000ÜU[F\u0005&¦Ü\u0096,âS:×[s£\u0016ôÉ÷`ÑªTÞ\u009b¤¥\u0019ÏZ«$XG\u0083=Ñ?\u0095V\u0001\u0085°k\u001c\u008f4Å¶ a\u0094\u0080Þ1©5&#õ|:·\rqßÊ\\2\u0018kQ5Tè¦»5Ud«{ P°\u0012È´vª\u001a9uèF~\u0000j0Å[ø\u009d@\u0097|\u008c®¤\u0096ü\u009a]@p\bäd\u0087"
               .getBytes("ISO-8859-1");
            int var24 = var23.length / 4;
            baa = new int[var24];
            byte var26 = 0;
            int var27 = 0;

            do {
               int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
               var28 ^= var25;
               baa[var27] = var28;
               var26 += 4;
            } while (++var27 < var24);

            String[] var21 = new String[4];
            int var19 = 0;
            String var18;
            int var20 = (var18 = b((byte)-14, 16860, -129817886, 1361165045)).length();
            int var17 = a(201119298, var40 ^ 986671563);
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
                        var79[var10004] = (char)(var79[var10004] ^ switch (var22 % a(201119300, var40 ^ -1153987363)) {
                           case 0 -> a(201119303, var40 ^ -1960619600);
                           case 1 -> a(201119302, var40 ^ 1292262629);
                           case 2 -> a(201119305, var40 ^ 1226360572);
                           case 3 -> a(201119304, var40 ^ -1624838723);
                           case 4 -> a(201119307, var40 ^ 1774213884);
                           case 5 -> a(201119306, var40 ^ -17666044);
                           default -> a(201119309, var40 ^ -1902808990);
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
                           abb = var21;
                           aab = new String[4];
                           long var8 = 6940722322821770767L;
                           long[] var14 = new long[a(201119308, var40 ^ -1570915450)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = b((byte)-23, '蠁', 1487702710, 1361165047)).length();
                           byte var10 = 0;

                           label113:
                           while (true) {
                              int var59 = var10;
                              var10 += 8;
                              byte[] var15 = var12.substring(var59, var10).getBytes(b((byte)-11, (char)'켭', 1590539742, 1361165046));
                              long[] var49 = var14;
                              var59 = var11++;
                              long var73 = (var15[0] & 255L) << a(201119311, var40 ^ -1277984559)
                                 | (var15[1] & 255L) << a(201119310, var40 ^ -1405446245)
                                 | (var15[2] & 255L) << a(201119313, var40 ^ 418136225)
                                 | (var15[3] & 255L) << a(201119312, var40 ^ 680580107)
                                 | (var15[4] & 255L) << a(201119315, var40 ^ -890753397)
                                 | (var15[5] & 255L) << a(201119314, var40 ^ 781408632)
                                 | (var15[a(201119317, var40 ^ 459684928)] & 255L) << a(201119316, var40 ^ 393374644)
                                 | var15[a(201119319, var40 ^ -988573334)] & 255L;
                              byte var87 = -1;

                              while (true) {
                                 long var92 = var73 ^ var8;
                                 switch (var87) {
                                    case 0:
                                       var49[var59] = var92;
                                       if (var10 >= var13) {
                                          ab = var14;
                                          ba = new Integer[a(201119329, var40 ^ 440883860)];
                                          long var0 = 1940617369797490142L;
                                          long[] var6 = new long[5];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = b((byte)34, 29562, -1912121128, 1361165043)).length();
                                          byte var2 = 0;

                                          label103:
                                          while (true) {
                                             int var62 = var2;
                                             var2 += 8;
                                             byte[] var7 = var4.substring(var62, var2).getBytes(b((byte)-13, (char)'\uedd3', -1385035182, 1361165042));
                                             long[] var50 = var6;
                                             var62 = var3++;
                                             long var75 = (var7[0] & 255L) << a(201119328, var40 ^ 1561811733)
                                                | (var7[1] & 255L) << a(201119331, var40 ^ 1827914283)
                                                | (var7[2] & 255L) << a(201119330, var40 ^ -1559360292)
                                                | (var7[3] & 255L) << a(201119333, var40 ^ -204338841)
                                                | (var7[4] & 255L) << a(201119332, var40 ^ -1359528882)
                                                | (var7[5] & 255L) << a(201119335, var40 ^ 1011564588)
                                                | (var7[a(201119334, var40 ^ 1926832762)] & 255L) << a(201119337, var40 ^ -527474981)
                                                | var7[a(201119336, var40 ^ 539351063)] & 255L;
                                             byte var89 = -1;

                                             while (true) {
                                                var92 = var75 ^ var0;
                                                switch (var89) {
                                                   case 0:
                                                      var50[var62] = var92;
                                                      if (var2 >= var5) {
                                                         aba = var6;
                                                         aa = new Long[5];
                                                         bb = new String[5];
                                                         aaab();
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var50[var62] = var92;
                                                      if (var2 < var5) {
                                                         continue label103;
                                                      }

                                                      var5 = (var4 = b(44, '뱞', 1303042474, 1361165053)).length();
                                                      var2 = 0;
                                                }

                                                byte var64 = var2;
                                                var2 += 8;
                                                var7 = var4.substring(var64, var2).getBytes(b((byte)17, '䕀', -1824274973, 1361165052));
                                                var50 = var6;
                                                var62 = var3++;
                                                var75 = (var7[0] & 255L) << a(201119339, var40 ^ -1857551612)
                                                   | (var7[1] & 255L) << a(201119338, var40 ^ 1016532593)
                                                   | (var7[2] & 255L) << a(201119341, var40 ^ -1987965061)
                                                   | (var7[3] & 255L) << a(201119340, var40 ^ 1959242328)
                                                   | (var7[4] & 255L) << a(201119343, var40 ^ 1126630433)
                                                   | (var7[5] & 255L) << a(201119342, var40 ^ 1020821227)
                                                   | (var7[a(201119345, var40 ^ 1576504050)] & 255L) << a(201119344, var40 ^ 183077250)
                                                   | var7[a(201119347, var40 ^ 1156067257)] & 255L;
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

                                       var13 = (var12 = b((byte)-33, (char)'댍', 835394543, 1361165041)).length();
                                       var10 = 0;
                                 }

                                 byte var61 = var10;
                                 var10 += 8;
                                 var15 = var12.substring(var61, var10).getBytes(b((byte)-119, (char)'\uf552', -1514350278, 1361165040));
                                 var49 = var14;
                                 var59 = var11++;
                                 var73 = (var15[0] & 255L) << a(201119318, var40 ^ -1334852621)
                                    | (var15[1] & 255L) << a(201119321, var40 ^ 569660325)
                                    | (var15[2] & 255L) << a(201119320, var40 ^ -299915301)
                                    | (var15[3] & 255L) << a(201119323, var40 ^ 1750687245)
                                    | (var15[4] & 255L) << a(201119322, var40 ^ 1822414566)
                                    | (var15[5] & 255L) << a(201119325, var40 ^ 1090342463)
                                    | (var15[a(201119324, var40 ^ -32664788)] & 255L) << a(201119327, var40 ^ -124174987)
                                    | var15[a(201119326, var40 ^ -1924748782)] & 255L;
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

                        var20 = (var18 = b((byte)-18, '큨', 386882268, 1361165044)).length();
                        var17 = a(201119301, var40 ^ 1902315258);
                        var44 = -1;
                  }

                  var47 = var18.substring(++var44, var44 + var17);
                  var10001 = 0;
               }
            }
         }

         do {
            var35 = var31[var33] ^ var29;
            char[] var37 = var30.substring(var34, var34 + var35).toCharArray();
            int var38 = 0;

            do {
               short var39 = switch (var38 % 6) {
                  default -> 42;
                  case 1 -> 156;
                  case 2 -> 163;
                  case 3 -> 62;
                  case 4 -> 92;
                  case 5 -> 121;
               };
               var37[var38] = (char)(var37[var38] ^ var39);
            } while (++var38 < var37.length);

            var32[var33] = new String(var37).intern();
            var34 += var35;
         } while (++var33 < var31.length);

         var36 = 0;
      }
   }

   public abaaaaba() {
      super(
         aabbaaaba.aaab(bb[1]),
         bbaabbba.bab,
         aabbaaaba.aaab(bb[0])
      );
      this.aaa = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(bb[2]),
            aabbabaab.class,
            aabbabaab.ba
         )
      );
   }

   private static long bb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(201119296, -1502963893 ^ 1682474547)) & a(201119299, -1502963893 ^ 1990404162);
      if (aa[var3] == null) {
         aa[var3] = aba[var3] ^ var1;
      }

      return aa[var3];
   }

   public boolean aaa() {
      return false;
   }

   public aaabbaaab aab() {
      return null;
   }

   public boolean aba(class_1657 param1) {
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
      // 05: ifnull 23
      // 08: aload 0
      // 09: aload 1
      // 0a: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 0d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.ba (Ljava/util/UUID;)Z
      // 10: iload 2
      // 11: ifne 20
      // 14: goto 18
      // 17: athrow
      // 18: ifeq 23
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 1
      // 20: goto 24
      // 23: bipush 0
      // 24: ireturn
   }

   private static String abb(char[] var0, long var1, int var3) {
      int var4 = aa(a(201119346, -1279518231 ^ 1275069986), 7440234019964214714L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aa(a(201119349, -1279518231 ^ -1353456130), 7678095381045317485L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public String bab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.get(ArrayList.java:427)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitchOnEnumJ21(SwitchHelper.java:341)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplify(SwitchHelper.java:41)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:388)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 04: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 07: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabaab
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabaab.ordinal ()I
      // 0d: tableswitch 27 0 2 38 57 46
      // 28: new java/lang/MatchException
      // 2b: dup
      // 2c: aconst_null
      // 2d: aconst_null
      // 2e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 31: athrow
      // 32: athrow
      // 33: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.bb [Ljava/lang/String;
      // 36: bipush 3
      // 37: aaload
      // 38: goto 4b
      // 3b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.bb [Ljava/lang/String;
      // 3e: bipush 4
      // 3f: aaload
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 43: goto 4b
      // 46: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.bb [Ljava/lang/String;
      // 49: bipush 3
      // 4a: aaload
      // 4b: areturn
   }

   private static int a(int var0, int var1) {
      int var2 = baa[var0 ^ 201119297] ^ var1 ^ var0;
      var2 -= 5245;
      var2 += 37278;
      var2 += 33726;
      var2 -= 34496;
      var2 -= 41339;
      var2 += 45425;
      return var2 ^ 7338;
   }

   private static String bba(int var0, int var1) {
      int var9 = 1819169153;
      int var2 = (var0 ^ a(201119348, var9 ^ 2052649090)) & a(201119351, var9 ^ -1843950540);
      if (aab[var2] == null) {
         char[] var3 = abb[var2].toCharArray();

         int var4 = switch (var3[0] & a(201119350, var9 ^ 1179867788)) {
            case 0 -> a(201119353, var9 ^ -1033211941);
            case 1 -> a(201119352, var9 ^ -626011274);
            case 2 -> a(201119355, var9 ^ -691720250);
            case 3 -> a(201119354, var9 ^ 1949085477);
            case 4 -> a(201119357, var9 ^ 779224564);
            case 5 -> a(201119356, var9 ^ 1371410722);
            case 6 -> a(201119359, var9 ^ -1324039251);
            case 7 -> a(201119358, var9 ^ 568752754);
            case 8 -> a(201119233, var9 ^ 485790954);
            case 9 -> a(201119232, var9 ^ 585606438);
            case 10 -> a(201119235, var9 ^ -414224389);
            case 11 -> a(201119234, var9 ^ 1529844414);
            case 12 -> a(201119237, var9 ^ -2131076699);
            case 13 -> a(201119236, var9 ^ -621875333);
            case 14 -> a(201119239, var9 ^ 1912843199);
            case 15 -> a(201119238, var9 ^ 1238273139);
            case 16 -> a(201119241, var9 ^ -2024179766);
            case 17 -> a(201119240, var9 ^ 1196133544);
            case 18 -> a(201119243, var9 ^ 1865652042);
            case 19 -> a(201119242, var9 ^ -1728459913);
            case 20 -> a(201119245, var9 ^ 1324943371);
            case 21 -> a(201119244, var9 ^ 907296956);
            case 22 -> a(201119247, var9 ^ -1546064722);
            case 23 -> a(201119246, var9 ^ -274646045);
            case 24 -> a(201119249, var9 ^ 1442337896);
            case 25 -> a(201119248, var9 ^ 193536348);
            case 26 -> a(201119251, var9 ^ -866919293);
            case 27 -> a(201119250, var9 ^ 860850250);
            case 28 -> a(201119253, var9 ^ -1847042186);
            case 29 -> a(201119252, var9 ^ 342682807);
            case 30 -> a(201119255, var9 ^ 295803536);
            case 31 -> a(201119254, var9 ^ 786556030);
            case 32 -> a(201119257, var9 ^ -1796059526);
            case 33 -> a(201119256, var9 ^ 2043042501);
            case 34 -> a(201119259, var9 ^ 1310688982);
            case 35 -> a(201119258, var9 ^ -311008472);
            case 36 -> a(201119261, var9 ^ -82867735);
            case 37 -> a(201119260, var9 ^ 1718275501);
            case 38 -> a(201119263, var9 ^ -1512579535);
            case 39 -> a(201119262, var9 ^ 824683698);
            case 40 -> a(201119265, var9 ^ -50922924);
            case 41 -> a(201119264, var9 ^ 114452175);
            case 42 -> a(201119267, var9 ^ -59809883);
            case 43 -> a(201119266, var9 ^ 402138142);
            case 44 -> a(201119269, var9 ^ -1019117732);
            case 45 -> a(201119268, var9 ^ 1353417690);
            case 46 -> a(201119271, var9 ^ -933545793);
            case 47 -> a(201119270, var9 ^ -1206174389);
            case 48 -> a(201119273, var9 ^ -1631399618);
            case 49 -> a(201119272, var9 ^ 2134365883);
            case 50 -> a(201119275, var9 ^ 424029571);
            case 51 -> a(201119274, var9 ^ 191209323);
            case 52 -> a(201119277, var9 ^ 539998659);
            case 53 -> a(201119276, var9 ^ -1187469145);
            case 54 -> a(201119279, var9 ^ 1768507266);
            case 55 -> a(201119278, var9 ^ -831119299);
            case 56 -> a(201119281, var9 ^ 1300367212);
            case 57 -> a(201119280, var9 ^ 1522628811);
            case 58 -> a(201119283, var9 ^ -346158051);
            case 59 -> a(201119282, var9 ^ -1546023038);
            case 60 -> a(201119285, var9 ^ 310506550);
            case 61 -> a(201119284, var9 ^ 2084348361);
            case 62 -> a(201119287, var9 ^ -1811328389);
            case 63 -> a(201119286, var9 ^ 2076910410);
            case 64 -> a(201119289, var9 ^ 1379451067);
            case 65 -> a(201119288, var9 ^ 975476433);
            case 66 -> a(201119291, var9 ^ -1944854629);
            case 67 -> a(201119290, var9 ^ 39250328);
            case 68 -> a(201119293, var9 ^ 795780611);
            case 69 -> a(201119292, var9 ^ -1738535674);
            case 70 -> a(201119295, var9 ^ 2089101966);
            case 71 -> a(201119294, var9 ^ -287108443);
            case 72 -> a(201119425, var9 ^ 8517564);
            case 73 -> a(201119424, var9 ^ -1365017146);
            case 74 -> a(201119427, var9 ^ -489168493);
            case 75 -> a(201119426, var9 ^ 687551365);
            case 76 -> a(201119429, var9 ^ -302048507);
            case 77 -> a(201119428, var9 ^ -489391124);
            case 78 -> a(201119431, var9 ^ -1454552013);
            case 79 -> a(201119430, var9 ^ -733685455);
            case 80 -> a(201119433, var9 ^ -1798822138);
            case 81 -> a(201119432, var9 ^ -811311576);
            case 82 -> a(201119435, var9 ^ 22499032);
            case 83 -> a(201119434, var9 ^ 2137184285);
            case 84 -> a(201119437, var9 ^ 1860422566);
            case 85 -> a(201119436, var9 ^ 1030935136);
            case 86 -> a(201119439, var9 ^ 1339674713);
            case 87 -> a(201119438, var9 ^ -1362859874);
            case 88 -> a(201119441, var9 ^ -1709353298);
            case 89 -> a(201119440, var9 ^ 1889632716);
            case 90 -> a(201119443, var9 ^ -1649971006);
            case 91 -> a(201119442, var9 ^ -1756517724);
            case 92 -> a(201119445, var9 ^ 898804512);
            case 93 -> a(201119444, var9 ^ 1336867797);
            case 94 -> a(201119447, var9 ^ 353293238);
            case 95 -> a(201119446, var9 ^ 1356974855);
            case 96 -> a(201119449, var9 ^ 2049056126);
            case 97 -> a(201119448, var9 ^ -971965724);
            case 98 -> a(201119451, var9 ^ 729980644);
            case 99 -> a(201119450, var9 ^ 1383205869);
            case 100 -> a(201119453, var9 ^ 1341384378);
            case 101 -> a(201119452, var9 ^ 577955500);
            case 102 -> a(201119455, var9 ^ -1484996793);
            case 103 -> a(201119454, var9 ^ -1397043934);
            case 104 -> a(201119457, var9 ^ 757432775);
            case 105 -> a(201119456, var9 ^ -845451927);
            case 106 -> a(201119459, var9 ^ 907295607);
            case 107 -> a(201119458, var9 ^ 404520926);
            case 108 -> a(201119461, var9 ^ -1983830209);
            case 109 -> 2;
            case 110 -> a(201119460, var9 ^ -1982290138);
            case 111 -> a(201119463, var9 ^ 48927468);
            case 112 -> a(201119462, var9 ^ -561763030);
            case 113 -> a(201119465, var9 ^ 587174025);
            case 114 -> a(201119464, var9 ^ 1299892579);
            case 115 -> a(201119467, var9 ^ 1524386032);
            case 116 -> a(201119466, var9 ^ -385314335);
            case 117 -> 0;
            case 118 -> a(201119469, var9 ^ 39157235);
            case 119 -> a(201119468, var9 ^ -872550219);
            case 120 -> a(201119471, var9 ^ 128533313);
            case 121 -> a(201119470, var9 ^ 1547198417);
            case 122 -> a(201119473, var9 ^ -2104350852);
            case 123 -> a(201119472, var9 ^ 787856580);
            case 124 -> a(201119475, var9 ^ 1163528343);
            case 125 -> a(201119474, var9 ^ -1223229257);
            case 126 -> a(201119477, var9 ^ -66286217);
            case 127 -> a(201119476, var9 ^ -1272611537);
            case 128 -> a(201119479, var9 ^ -1130161149);
            case 129 -> a(201119478, var9 ^ 821850302);
            case 130 -> a(201119481, var9 ^ -1166078845);
            case 131 -> a(201119480, var9 ^ -1643321124);
            case 132 -> a(201119483, var9 ^ 1522224448);
            case 133 -> a(201119482, var9 ^ -184452384);
            case 134 -> a(201119485, var9 ^ -1651501273);
            case 135 -> a(201119484, var9 ^ 1714546185);
            case 136 -> a(201119487, var9 ^ -404581009);
            case 137 -> a(201119486, var9 ^ 480305420);
            case 138 -> a(201119361, var9 ^ 1088520343);
            case 139 -> a(201119360, var9 ^ -980483983);
            case 140 -> a(201119363, var9 ^ 1922138243);
            case 141 -> a(201119362, var9 ^ 1372421710);
            case 142 -> a(201119365, var9 ^ -497708816);
            case 143 -> a(201119364, var9 ^ -93002853);
            case 144 -> a(201119367, var9 ^ 1921723660);
            case 145 -> a(201119366, var9 ^ -1698481319);
            case 146 -> a(201119369, var9 ^ 1002195492);
            case 147 -> a(201119368, var9 ^ 112257691);
            case 148 -> a(201119371, var9 ^ 782727428);
            case 149 -> a(201119370, var9 ^ -1640138877);
            case 150 -> a(201119373, var9 ^ 1615214643);
            case 151 -> a(201119372, var9 ^ -254895852);
            case 152 -> a(201119375, var9 ^ -578346598);
            case 153 -> a(201119374, var9 ^ -1750619859);
            case 154 -> a(201119377, var9 ^ 526239824);
            case 155 -> a(201119376, var9 ^ 367029155);
            case 156 -> a(201119379, var9 ^ 1772718677);
            case 157 -> a(201119378, var9 ^ -845941618);
            case 158 -> a(201119381, var9 ^ 93253870);
            case 159 -> a(201119380, var9 ^ 687140425);
            case 160 -> 3;
            case 161 -> a(201119383, var9 ^ 1818922969);
            case 162 -> a(201119382, var9 ^ -2111775869);
            case 163 -> 1;
            case 164 -> a(201119385, var9 ^ 1678679140);
            case 165 -> a(201119384, var9 ^ 927097173);
            case 166 -> a(201119387, var9 ^ 426959224);
            case 167 -> a(201119386, var9 ^ -1563425368);
            case 168 -> a(201119389, var9 ^ -424073938);
            case 169 -> a(201119388, var9 ^ 724039758);
            case 170 -> a(201119391, var9 ^ 1738610798);
            case 171 -> a(201119390, var9 ^ -492651436);
            case 172 -> a(201119393, var9 ^ 1730797948);
            case 173 -> a(201119392, var9 ^ -1793200368);
            case 174 -> a(201119395, var9 ^ 151525099);
            case 175 -> a(201119394, var9 ^ 920082084);
            case 176 -> a(201119397, var9 ^ -915806078);
            case 177 -> a(201119396, var9 ^ 1577842653);
            case 178 -> a(201119399, var9 ^ 253465197);
            case 179 -> a(201119398, var9 ^ -1907764775);
            case 180 -> a(201119401, var9 ^ -6068253);
            case 181 -> a(201119400, var9 ^ -765034652);
            case 182 -> a(201119403, var9 ^ -436147143);
            case 183 -> a(201119402, var9 ^ 1623353377);
            case 184 -> a(201119405, var9 ^ 1655381769);
            case 185 -> a(201119404, var9 ^ -108624117);
            case 186 -> a(201119407, var9 ^ -1023359156);
            case 187 -> a(201119406, var9 ^ 465563267);
            case 188 -> a(201119409, var9 ^ -1839682961);
            case 189 -> a(201119408, var9 ^ -1766906852);
            case 190 -> a(201119411, var9 ^ 943993926);
            case 191 -> a(201119410, var9 ^ 1199192584);
            case 192 -> a(201119413, var9 ^ 1358717817);
            case 193 -> a(201119412, var9 ^ -1821620901);
            case 194 -> a(201119415, var9 ^ -1746100492);
            case 195 -> a(201119414, var9 ^ 2088794662);
            case 196 -> 4;
            case 197 -> a(201119417, var9 ^ 548301003);
            case 198 -> a(201119416, var9 ^ 148611892);
            case 199 -> a(201119419, var9 ^ -473680554);
            case 200 -> a(201119418, var9 ^ -195367584);
            case 201 -> a(201119421, var9 ^ 616971469);
            case 202 -> a(201119420, var9 ^ -258574765);
            case 203 -> a(201119423, var9 ^ -1527348261);
            case 204 -> a(201119422, var9 ^ -1685400436);
            case 205 -> a(201119553, var9 ^ 663539967);
            case 206 -> a(201119552, var9 ^ -1859306655);
            case 207 -> a(201119555, var9 ^ -2007136601);
            case 208 -> a(201119554, var9 ^ -672055046);
            case 209 -> a(201119557, var9 ^ -22273566);
            case 210 -> a(201119556, var9 ^ -1052465916);
            case 211 -> a(201119559, var9 ^ 673901387);
            case 212 -> a(201119558, var9 ^ 1550481415);
            case 213 -> a(201119561, var9 ^ -1373099613);
            case 214 -> 5;
            case 215 -> a(201119560, var9 ^ -131237907);
            case 216 -> a(201119563, var9 ^ 4454246);
            case 217 -> a(201119562, var9 ^ 275057078);
            case 218 -> a(201119565, var9 ^ -143239078);
            case 219 -> a(201119564, var9 ^ -1166271987);
            case 220 -> a(201119567, var9 ^ -1551954034);
            case 221 -> a(201119566, var9 ^ -1989090778);
            case 222 -> a(201119569, var9 ^ -696124303);
            case 223 -> a(201119568, var9 ^ 1382109970);
            case 224 -> a(201119571, var9 ^ -287964287);
            case 225 -> a(201119570, var9 ^ -197656214);
            case 226 -> a(201119573, var9 ^ -953278237);
            case 227 -> a(201119572, var9 ^ -71914640);
            case 228 -> a(201119575, var9 ^ -178192907);
            case 229 -> a(201119574, var9 ^ -1610786312);
            case 230 -> a(201119577, var9 ^ 1410364740);
            case 231 -> a(201119576, var9 ^ 1642147811);
            case 232 -> a(201119579, var9 ^ 1802392607);
            case 233 -> a(201119578, var9 ^ 742112766);
            case 234 -> a(201119581, var9 ^ 2110427070);
            case 235 -> a(201119580, var9 ^ -1665879768);
            case 236 -> a(201119583, var9 ^ 263832404);
            case 237 -> a(201119582, var9 ^ -102387178);
            case 238 -> a(201119585, var9 ^ -1224715195);
            case 239 -> a(201119584, var9 ^ -1309720340);
            case 240 -> a(201119587, var9 ^ 843359804);
            case 241 -> a(201119586, var9 ^ -324325595);
            case 242 -> a(201119589, var9 ^ 867814386);
            case 243 -> a(201119588, var9 ^ -862853913);
            case 244 -> a(201119591, var9 ^ -298351481);
            case 245 -> a(201119590, var9 ^ 504996392);
            case 246 -> a(201119593, var9 ^ 181415707);
            case 247 -> a(201119592, var9 ^ -1970887445);
            case 248 -> a(201119595, var9 ^ -1743838777);
            case 249 -> a(201119594, var9 ^ 1348822976);
            case 250 -> a(201119597, var9 ^ 597228860);
            case 251 -> a(201119596, var9 ^ 702313062);
            case 252 -> a(201119599, var9 ^ -765111602);
            case 253 -> a(201119598, var9 ^ 332064856);
            case 254 -> a(201119601, var9 ^ 1710197708);
            default -> a(201119600, var9 ^ -609909417);
         };
         int var5 = (var1 & a(201119603, var9 ^ 485587935)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(201119602, var9 ^ -560353802)) >>> a(201119605, var9 ^ 955194922)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(201119604, var9 ^ 1396679875);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(201119607, var9 ^ 1847766596);
            }
         }

         aab[var2] = new String(var3).intern();
      }

      return aab[var2];
   }

   @Override
   public void aabaa() {
      abaaaab.aa(null);
   }

   public boolean bbb(GameProfile param1) {
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
      // 05: ifnull 23
      // 08: aload 0
      // 09: aload 1
      // 0a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 0d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.ba (Ljava/util/UUID;)Z
      // 10: iload 2
      // 11: ifne 20
      // 14: goto 18
      // 17: athrow
      // 18: ifeq 23
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 1
      // 20: goto 24
      // 23: bipush 0
      // 24: ireturn
   }

   public String aaaa() {
      return null;
   }

   private static void aaab() {
      int var0 = 1735581028;
      bb[0] = abb(
         bba(a(201119606, var0 ^ -879484994), a(201119609, var0 ^ -1700650355)).toCharArray(),
         bb(a(201119608, var0 ^ -1491621128), 430231796374565422L),
         aa(a(201119611, var0 ^ -77675827), 1834713935754685687L)
      );
      bb[1] = abb(
         bba(a(201119610, var0 ^ 55795742), a(201119613, var0 ^ 1376807630)).toCharArray(),
         bb(a(201119612, var0 ^ 1595391803), 7703355150797738270L),
         aa(a(201119615, var0 ^ -1466316027), 1472686139656959724L)
      );
      bb[2] = abb(
         bba(a(201119614, var0 ^ 1787413617), a(201119489, var0 ^ 1586647660)).toCharArray(),
         bb(a(201119488, var0 ^ -1168870194), 6337428468193404081L),
         aa(a(201119491, var0 ^ 928455681), 4306548872402397360L)
      );
      bb[3] = abb("".toCharArray(), bb(a(201119490, var0 ^ 1881328429), 5613507015315548137L), aa(a(201119493, var0 ^ -881257779), 2922519232824794433L));
      bb[4] = abb(
         bba(a(201119492, var0 ^ 1320534820), a(201119495, var0 ^ -1601766564)).toCharArray(),
         bb(a(201119494, var0 ^ -1803554344), 5766175267615037208L),
         aa(a(201119497, var0 ^ 113699384), 1476032362940696160L)
      );
   }
}
