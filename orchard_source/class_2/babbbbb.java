package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum babbbbb {
   private static final Long[] aa;
   public static final babbbbb ab;
   private static final String[] aaab;
   private static final int[] aaaa;
   private static final Object[] aaba;
   private static String[] ba;
   public static final babbbbb b;
   public static final babbbbb bb;
   private static final String[] aaa;
   public static final babbbbb aab;
   private static final String[] aba;
   private static final long[] abb;
   public static final babbbbb baa;
   public static final babbbbb bab;
   private static final Integer[] bba;
   private static final babbbbb[] bbb;
   private static final long[] a;

   private static long aa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(21062512, 948694632 ^ -792697703)) & b(21062513, 948694632 ^ 765792818);
      if (aa[var3] == null) {
         aa[var3] = a[var3] ^ var1;
      }

      return aa[var3];
   }

   private static String ab(char[] var0, long var1, int var3) {
      int var4 = aab(b(21062514, -685142451 ^ 1476292075), 2066364352234657726L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aab(b(21062515, -685142451 ^ -1645994501), 8501271571505191222L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -1454171979;
      int var33 = 0;
      int var10001 = "+롱ᾒ鬳樦질ᚘ톙討ế玭閆옢嚙埯愮㐻拭ሲ䨸겭》輎ꩮ閬臋혆觉坚ꅑꙴ\uf082蒲巨趥\ue49e띹⾤玥ꔮ쎘퇈ቛ蓶\u001b큚旼킌擠粖蓤㖶곷걀册\uf6b7⡵\ued52\ue256䮟슸䠜\ue220遌羷\ud8a2修瘒럱䡝ጦҧ@\ud8ee\uebb1\ud80eᎱ캮鎵짎莳쪎ꎰ큮䮳싎펳\ud96eΰ\ud80eΰ퇮쎰숮\ue3b5킎玵혎\uebb5왎㮶츮殴츮γ쁎宱쌮箴\udf8e\uf3b0캮뎱\udc8e厳\uddceꮶ\udb4e\udbb3킎玱쳎\uf3b0\ud80eꮲ\ud86eꮲ\ude0e뎳퇮㮱\ud9ce쎴콎䮴쭮殷\n輸\uee23銘昣鴘븠蔸옠鯸瘤\u0010싻\u0ef3졛䛷씻뻳퍛雲톻绱튛曶\uda5b껱\ud89b\udef4\nꨔꔪ랴\u2d2a렴\uf529ꀔ贩뻔㴭 Ṥ섃Τ\uf107ῄऀᨄ褃ք\ue107$餃᠄礄Ễ섇ᝄ\ue101ᙄ섂ἄ\ue901ᴤ℅Ḥ脆ᑄꄇτ뤆Ụ礅\n髣飦蝃ღ裃죥郣냥踣á\u0010ﯚຸ\ue3ba\ueebf\uef9a䚽\uefda庹\ue9ba麾\ue1ba뚺\uf15aຼ\ueeba䚾\n텲粴쳒\uf4b4썒ⲷ\udb72咷얲\ue4b3"
         .length();
      short var34 = 23856;
      String[] var10002 = new String[10];
      int var32 = 0;
      String[] var31 = var10002;
      int var30 = var10001;
      String var29 = "+롱ᾒ鬳樦질ᚘ톙討ế玭閆옢嚙埯愮㐻拭ሲ䨸겭》輎ꩮ閬臋혆觉坚ꅑꙴ\uf082蒲巨趥\ue49e띹⾤玥ꔮ쎘퇈ቛ蓶\u001b큚旼킌擠粖蓤㖶곷걀册\uf6b7⡵\ued52\ue256䮟슸䠜\ue220遌羷\ud8a2修瘒럱䡝ጦҧ@\ud8ee\uebb1\ud80eᎱ캮鎵짎莳쪎ꎰ큮䮳싎펳\ud96eΰ\ud80eΰ퇮쎰숮\ue3b5킎玵혎\uebb5왎㮶츮殴츮γ쁎宱쌮箴\udf8e\uf3b0캮뎱\udc8e厳\uddceꮶ\udb4e\udbb3킎玱쳎\uf3b0\ud80eꮲ\ud86eꮲ\ude0e뎳퇮㮱\ud9ce쎴콎䮴쭮殷\n輸\uee23銘昣鴘븠蔸옠鯸瘤\u0010싻\u0ef3졛䛷씻뻳퍛雲톻绱튛曶\uda5b껱\ud89b\udef4\nꨔꔪ랴\u2d2a렴\uf529ꀔ贩뻔㴭 Ṥ섃Τ\uf107ῄऀᨄ褃ք\ue107$餃᠄礄Ễ섇ᝄ\ue101ᙄ섂ἄ\ue901ᴤ℅Ḥ脆ᑄꄇτ뤆Ụ礅\n髣飦蝃ღ裃죥郣냥踣á\u0010ﯚຸ\ue3ba\ueebf\uef9a䚽\uefda庹\ue9ba麾\ue1ba뚺\uf15aຼ\ueeba䚾\n텲粴쳒\uf4b4썒ⲷ\udb72咷얲\ue4b3";

      do {
         char var35 = var29.charAt(var33);
         int var37 = 0;
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            char var38 = var36[var37];
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 5 | var38 << 11) & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 5 | var38 >>> 11) & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      aaab = var31;
      aaba = new Object[var31.length];
      int var25 = -404016664;
      byte[] var23 = "ñ\u001fJq\fzh£\u0099\u0083!\u0084S\u0099%\u0016\u0099þUÂ¶÷\u0090¨\\[ËÀè\u001cfP§'Î/GSûLñH¬4(¡ÿ½7áO)\\Ø2\u009dw\u0089ê\u0090ÅÎ.Ê\u0016wàI\u001a\u001d\u0096\u0001Ô\u0018¿\u008a\u0099B\u001f^9$\u0013òÛXºáLBØìµ¥l\u0013ø\u0018\u0080pV\u008dÊ#,~dWò\u0082\u0082 ÜG\u0087¨\u0010\u0002bñf5Ê<zq\u0006µ\u0099pw\u009aMÞ,\u0014\u007f¢>\u0084\u0003ÀÅ-Ö\u0085i¾¥ \"ìï´Þs#%\u0016º\u00176ÿ\u0003\u0003\u0013Ú-\u000b\u007f'\u0096'\tÿC\u0002å\u000f¬0ú\u0097Û¶4xW;nEÑ%·J?Â\u0012\u009cZËé\u0098xC¶\u0089\u001f@JøñS¨Ã\u008cú¼¸_n=o\u000b3\u009e\u001eUå^\u0004\u008d$øQp|Þ¿P»Üs\u009e'\u0084ofOì´Z´\u000b\u0016\u0088ð\u009a5¾·n\u001eb;ë\u00985stK\u0082¼D¡Sn\u0007÷D\u0010²\u0089Ë?@8\u001e\u0098\u0093[íÅ=\u0001c\u0005XË$A\u008býÍÞm»'oP\u0096ðÝRý±¬2qwÒ»ìKÁ\u0098\u0098à\b\u0087Ðæ.de÷Ñ\u0013G:Í¿È\u0088GN\u00904@\u009eáÕ\u0019Þ$>Ë\u001aKç4ÔÆ\u0014(\né\u0080\"DmþZÐ\u0003`\u0015Ö\" º lvÒ\u0000sò'\u0019ñ¨iES\u008dõéâB~¥D\u0005£¬Yh«Ðûµ\n\u0099³v'À8êßÓÓÿ3\u0018ÍgËôt,À\u0000\u009bá!Lä\u008e\u0094mèÎ¹\u000fì\u0004Í\u0003Gª×£È°ÛµôD\u0015\u0081IK5\u0091\u0012©QÖ\u0003¡HÕobBÅX\u0013Ö\u0094`ª,D¸Ë¿\u0085\u0003aj¼\u009c]:\u0016\u0001Í\u001cX@Õë70\u0018ù;\u001cÿ¹½rÖVÃê?)|\t\u0095ä¦çY\u001a\u0011v8\u001c6üê}9\u007f\u0080cËçN\u008e\u0084}Kyß]O\u000bÖY\u000b]z\u0003n1Ç1\u0084¡Ë~ø!\u0007èû?¡CTn\u0016Ö-©à\bp©\u0018\u0090ZÛ8ù\u008d\u0099Xuu\u0012ú\u008bDK6±`ãnÍ½£Ô\u0099\u00adú³\u0089Ú;\u0007n\u008d¯xM\u0091È@\u009b\\U|\u0004Ò¨*nP]¾©@\u0081µ\u008axK%\u0087Ga»\rTÄ¿,)bJûÀïU\u0005\u0095¾ÆgÒ\u0098\u001fÅ`Ú\u0084PT°?Ó¢Í\u0016´ñ«ê*Ý7\u0094\u0003²#¢\u0093\fu\u0000B.Ù\u008cÎ\u008f\u0088âDz\u0006\u008e¯@Âzg`k¹\u0004\u0017\u0087B\u0019`Ñ\u0017}/}L\u0090øÆð\u001fX¦nÄ@V\u001aO\u0081Fs\bçoüßú\u000b\u0013N@\u0011üþ«üNN\u0017Dÿ¬J\u0082\u0089\t<×Oê\u0094]9fç£Á\t¾+\rr\t-\u009f6ß:\u001aG©+J¯Y\u0081\\\u0010!L\u0095¯u/Ùÿ(æ\u0014¨Ta\u008cÔH\u00ad\u008f\u0085r§VÈ«\u0084\u008f`é])¦dè\u0084Öìù*<ka\u0089ÿÆ\u001d\u0013;°·p§%\u0012\u0013\u008a03À*Xè{ÉÑR%þíx\u001a,\u0019â\u000f\u0099náW\u009aB\u007f©,\u0084ês%oø\u008a\u0090\u0012áÃhzu\u007f)£43#5Ã~7à±Û³Ã\u0097³æ\u008b\u009cPØn¢Æ\u0004\rô\rÎ\u0082\n\u0094e\u0018ID`ë\u008bâ¢ \u001eP\u0080Õò\u000e3Ø+¨±\u0092ØðÙy«7ÚYî\u008a\u008c¬\u001fæg©¸_\u00104$ËÛØb\u0081ß4\bëC»ÖÎ\u0081\u0012w\r\u008c»\u0087ææ¿\u0086Êåk²b\u0099Pù\u0018\u0093\u0092\u0007\u0017½\u0093^o¦1¼3ÁÄ\u0093q\u0081âsENx<³^,ÊVÍ¼M#Ï\u001c\u001fÅá^ýì\u0083º\u0097«Ûú²½\u0017-f\u00900ß)\u0099\u0015üí\u0083ÖÉa\u009e\u001d\u007f©\u0087§d\u008büQ\u0011K@\u001361È\u0013¸Gî)Öôê\u0090U¯Èºe\u008ep¼W\nU2Õ©#ÿeP-\u0085ÈÃk¬¸ë©\u0083|\u0089]l¶ñN\u009b¦Q\u000fv.\u009e\u001f^(»9\u0091ý\u00890®\u008aæå/y\u007f*xp\u0099\u008dwéhÅ\u000f½±ç µ\"ÅFU Ðÿ¯×\u000f\"¿\u0010Í°ÂH÷oò¢\u001eÖìî¨OþxY¶w%¤\u009dÉãSq,\u0091;\u0006Ô\u000f®w\"õ\u0015\u0006\u0017çr&\u0014¿\u009f\u0001Tô\u0018ó@ý9¦\u0087KJ\u000fù¬y!#\u001a[\u0014\r\u000b oÞé¹ËØ\u0010®QvÈf\u0091rº¹Á\u0017Ì\u001dé}\u0081Õæ\u000epÅÅ\u0010\u00863G>z¼#èv¾Ï;³U@Ö¡Ä\u008c{j\u001bm71á»ñ;µmæ~Ø`sÖg!Ç¹.?8\u001bæ#âNáÉsÚT,Õ\u0006`ª\u0018Æ5ÑÈ\u0004\u0014²Æ$\u0017\u0012\u0081ô\u0099Ü³°\u0084Ëf"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      aaaa = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         aaaa[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[b(21062263, var39 ^ 665591369)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aba(11694, 1011742274, '\ue0c5', '\ue357', 16586)).length();
      int var17 = b(21062264, var39 ^ 45798074);
      int var43 = -1;

      label129:
      while (true) {
         String var10000 = var18.substring(++var43, var43 + var17);
         int var48 = -1;

         while (true) {
            label124: {
               char[] var50 = var10000.toCharArray();
               int var10003 = var50.length;
               int var22 = 0;
               var66 = var50;
               var48 = var10003;
               char[] var78;
               int var10004;
               if (var10003 <= 1) {
                  var78 = var50;
                  var10004 = var22;
               } else {
                  var66 = var50;
                  var48 = var10003;
                  if (var10003 <= var22) {
                     break label124;
                  }

                  var78 = var50;
                  var10004 = var22;
               }

               while (true) {
                  var78[var10004] = (char)(var78[var10004] ^ switch (var22 % b(21062267, var39 ^ 1568936823)) {
                     case 0 -> b(21062268, var39 ^ -778446167);
                     case 1 -> b(21062269, var39 ^ 427843704);
                     case 2 -> b(21062270, var39 ^ 1006343537);
                     case 3 -> b(21062271, var39 ^ -79178498);
                     case 4 -> b(21062240, var39 ^ -2117085648);
                     case 5 -> b(21062241, var39 ^ -135664576);
                     default -> b(21062242, var39 ^ 1156404264);
                  });
                  var22++;
                  if (var48 == 0) {
                     var10004 = var48;
                     var78 = var66;
                  } else {
                     if (var48 <= var22) {
                        break;
                     }

                     var78 = var66;
                     var10004 = var22;
                  }
               }
            }

            String var85 = new String(var66).intern();
            switch (var48) {
               case 0:
                  var21[var19++] = var85;
                  if ((var43 += var17) >= var20) {
                     aaa = var21;
                     aba = new String[b(21062266, var39 ^ -1717645246)];
                     long var8 = 8665394233914541922L;
                     long[] var14 = new long[b(21062243, var39 ^ 533692398)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = aba((short)-24524, 1011742272, '踜', '箧', (short)14501)).length();
                     byte var10 = 0;

                     label103:
                     while (true) {
                        int var57 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var57, var10).getBytes(aba(19983, 1011742273, '퐯', (char)'跂', (short)-14326));
                        long[] var46 = var14;
                        var57 = var11++;
                        long var72 = (var15[0] & 255L) << b(21062244, var39 ^ 1048017357)
                           | (var15[1] & 255L) << b(21062245, var39 ^ -1168967834)
                           | (var15[2] & 255L) << b(21062246, var39 ^ 421804749)
                           | (var15[3] & 255L) << b(21062247, var39 ^ -534101495)
                           | (var15[4] & 255L) << b(21062248, var39 ^ 1936484558)
                           | (var15[5] & 255L) << b(21062249, var39 ^ 1538148067)
                           | (var15[b(21062250, var39 ^ 962242840)] & 255L) << b(21062251, var39 ^ 1095327267)
                           | var15[b(21062252, var39 ^ -519523449)] & 255L;
                        byte var86 = -1;

                        while (true) {
                           long var91 = var72 ^ var8;
                           switch (var86) {
                              case 0:
                                 var46[var57] = var91;
                                 if (var10 >= var13) {
                                    abb = var14;
                                    bba = new Integer[b(21062230, var39 ^ 282540561)];
                                    long var0 = 5702292769384336479L;
                                    long[] var6 = new long[b(21062231, var39 ^ 1728636716)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = aba((short)31385, 1011742276, (char)'鱩', (char)'\ue93f', 13441)).length();
                                    byte var2 = 0;

                                    label93:
                                    while (true) {
                                       int var60 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var60, var2).getBytes(aba(17064, 1011742277, '媠', 27207, (short)29965));
                                       long[] var47 = var6;
                                       var60 = var3++;
                                       long var74 = (var7[0] & 255L) << b(21062232, var39 ^ -1597344412)
                                          | (var7[1] & 255L) << b(21062233, var39 ^ -118445443)
                                          | (var7[2] & 255L) << b(21062234, var39 ^ 303633272)
                                          | (var7[3] & 255L) << b(21062235, var39 ^ 1588561923)
                                          | (var7[4] & 255L) << b(21062236, var39 ^ -933334475)
                                          | (var7[5] & 255L) << b(21062237, var39 ^ -1784457118)
                                          | (var7[b(21062238, var39 ^ 1398060214)] & 255L) << b(21062239, var39 ^ 557630309)
                                          | var7[b(21062208, var39 ^ -1079397721)] & 255L;
                                       byte var88 = -1;

                                       while (true) {
                                          var91 = var74 ^ var0;
                                          switch (var88) {
                                             case 0:
                                                var47[var60] = var91;
                                                if (var2 >= var5) {
                                                   a = var6;
                                                   aa = new Long[b(21062218, var39 ^ 1505627734)];
                                                   ba = new String[aab(b(21062219, var39 ^ -1599482586), 484950570553196991L)];
                                                   a();
                                                   bb = new babbbbb();
                                                   ab = new babbbbb();
                                                   b = new babbbbb();
                                                   aab = new babbbbb();
                                                   bab = new babbbbb();
                                                   baa = new babbbbb();
                                                   bbb = bb();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var47[var60] = var91;
                                                if (var2 < var5) {
                                                   continue label93;
                                                }

                                                var5 = (var4 = aba((short)16839, 1011742282, '\udc22', '且', (short)8155)).length();
                                                var2 = 0;
                                          }

                                          byte var62 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var62, var2).getBytes(aba((short)14624, 1011742283, 2378, '鉗', (short)12077));
                                          var47 = var6;
                                          var60 = var3++;
                                          var74 = (var7[0] & 255L) << b(21062209, var39 ^ 1158857640)
                                             | (var7[1] & 255L) << b(21062210, var39 ^ 1467343744)
                                             | (var7[2] & 255L) << b(21062211, var39 ^ 261670105)
                                             | (var7[3] & 255L) << b(21062212, var39 ^ 1142895778)
                                             | (var7[4] & 255L) << b(21062213, var39 ^ 1295934172)
                                             | (var7[5] & 255L) << b(21062214, var39 ^ -78788023)
                                             | (var7[b(21062215, var39 ^ 478078112)] & 255L) << b(21062216, var39 ^ -1436757589)
                                             | var7[b(21062217, var39 ^ -1146639790)] & 255L;
                                          var88 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var46[var57] = var91;
                                 if (var10 < var13) {
                                    continue label103;
                                 }

                                 var13 = (var12 = aba((short)7445, 1011742278, 8452, 6040, (short)-4418)).length();
                                 var10 = 0;
                           }

                           byte var59 = var10;
                           var10 += 8;
                           var15 = var12.substring(var59, var10).getBytes(aba((short)-4329, 1011742279, (char)'\udbc8', '臯', 3063));
                           var46 = var14;
                           var57 = var11++;
                           var72 = (var15[0] & 255L) << b(21062253, var39 ^ 773364667)
                              | (var15[1] & 255L) << b(21062254, var39 ^ 188634181)
                              | (var15[2] & 255L) << b(21062255, var39 ^ 959933227)
                              | (var15[3] & 255L) << b(21062224, var39 ^ 1457711247)
                              | (var15[4] & 255L) << b(21062225, var39 ^ -819086273)
                              | (var15[5] & 255L) << b(21062226, var39 ^ 696955469)
                              | (var15[b(21062227, var39 ^ -658322902)] & 255L) << b(21062228, var39 ^ 31483151)
                              | var15[b(21062229, var39 ^ -1832746043)] & 255L;
                           var86 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var85;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label129;
                  }

                  var20 = (var18 = aba(6998, 1011742275, '\u0b00', 'ⷙ', 27784)).length();
                  var17 = b(21062265, var39 ^ -694684347);
                  var43 = -1;
            }

            var10000 = var18.substring(++var43, var43 + var17);
            var48 = 0;
         }
      }
   }

   private static String ba(int var0, int var1) {
      int var9 = -1846491333;
      int var2 = (var0 ^ b(21062516, var9 ^ 291120121)) & b(21062517, var9 ^ 1045447534);
      if (aba[var2] == null) {
         char[] var3 = aaa[var2].toCharArray();

         int var4 = switch (var3[0] & b(21062518, var9 ^ -721432315)) {
            case 0 -> b(21062519, var9 ^ 1622703882);
            case 1 -> b(21062520, var9 ^ 797168859);
            case 2 -> b(21062521, var9 ^ -805838239);
            case 3 -> b(21062522, var9 ^ 2045556424);
            case 4 -> b(21062523, var9 ^ -1610226560);
            case 5 -> b(21062524, var9 ^ -1085974949);
            case 6 -> b(21062525, var9 ^ -730059856);
            case 7 -> b(21062526, var9 ^ -13766571);
            case 8 -> b(21062527, var9 ^ 1298805821);
            case 9 -> b(21062496, var9 ^ -1630274934);
            case 10 -> b(21062497, var9 ^ -1833333602);
            case 11 -> b(21062498, var9 ^ 1555867350);
            case 12 -> b(21062499, var9 ^ 300287418);
            case 13 -> b(21062500, var9 ^ -1317009140);
            case 14 -> b(21062501, var9 ^ 1409065938);
            case 15 -> b(21062502, var9 ^ -991509997);
            case 16 -> b(21062503, var9 ^ 1023506094);
            case 17 -> b(21062504, var9 ^ 1891408374);
            case 18 -> b(21062505, var9 ^ -567684803);
            case 19 -> b(21062506, var9 ^ -1529184998);
            case 20 -> b(21062507, var9 ^ 2049349632);
            case 21 -> b(21062508, var9 ^ 1424203047);
            case 22 -> b(21062509, var9 ^ -1733919840);
            case 23 -> b(21062510, var9 ^ -292433745);
            case 24 -> b(21062511, var9 ^ -220914648);
            case 25 -> b(21062480, var9 ^ 299134715);
            case 26 -> b(21062481, var9 ^ -981846321);
            case 27 -> b(21062482, var9 ^ -150592509);
            case 28 -> b(21062483, var9 ^ -1956323810);
            case 29 -> b(21062484, var9 ^ 1579249851);
            case 30 -> b(21062485, var9 ^ 763639878);
            case 31 -> b(21062486, var9 ^ 1729152133);
            case 32 -> b(21062487, var9 ^ -1417606094);
            case 33 -> b(21062488, var9 ^ -1617762750);
            case 34 -> b(21062489, var9 ^ -1950891754);
            case 35 -> b(21062490, var9 ^ -2082783546);
            case 36 -> b(21062491, var9 ^ -1347558130);
            case 37 -> b(21062492, var9 ^ -1975446398);
            case 38 -> b(21062493, var9 ^ -1201762998);
            case 39 -> b(21062494, var9 ^ 1049649445);
            case 40 -> b(21062495, var9 ^ -1278583027);
            case 41 -> b(21062464, var9 ^ -1391243032);
            case 42 -> b(21062465, var9 ^ 1253475600);
            case 43 -> b(21062466, var9 ^ 1129153176);
            case 44 -> b(21062467, var9 ^ -887975092);
            case 45 -> b(21062468, var9 ^ -923868648);
            case 46 -> b(21062469, var9 ^ -619914971);
            case 47 -> b(21062470, var9 ^ 1914217179);
            case 48 -> b(21062471, var9 ^ -426150438);
            case 49 -> b(21062472, var9 ^ -1153824970);
            case 50 -> b(21062473, var9 ^ 1845108333);
            case 51 -> b(21062474, var9 ^ -1403238391);
            case 52 -> b(21062475, var9 ^ -193288682);
            case 53 -> b(21062476, var9 ^ 863529309);
            case 54 -> b(21062477, var9 ^ -1356827140);
            case 55 -> b(21062478, var9 ^ -951537954);
            case 56 -> b(21062479, var9 ^ 1018105265);
            case 57 -> b(21062448, var9 ^ 2017341255);
            case 58 -> b(21062449, var9 ^ 1070204672);
            case 59 -> b(21062450, var9 ^ -1286635240);
            case 60 -> b(21062451, var9 ^ -70233856);
            case 61 -> b(21062452, var9 ^ 887143385);
            case 62 -> b(21062453, var9 ^ -425464394);
            case 63 -> b(21062454, var9 ^ -1743351028);
            case 64 -> b(21062455, var9 ^ -1209785623);
            case 65 -> b(21062456, var9 ^ 272056625);
            case 66 -> b(21062457, var9 ^ 1301878850);
            case 67 -> b(21062458, var9 ^ -1912811090);
            case 68 -> b(21062459, var9 ^ -919607445);
            case 69 -> b(21062460, var9 ^ 1456054814);
            case 70 -> b(21062461, var9 ^ -403402970);
            case 71 -> b(21062462, var9 ^ 1442244324);
            case 72 -> b(21062463, var9 ^ 613836892);
            case 73 -> b(21062432, var9 ^ 1512044174);
            case 74 -> b(21062433, var9 ^ 1228702416);
            case 75 -> b(21062434, var9 ^ -2145138179);
            case 76 -> b(21062435, var9 ^ -1497333983);
            case 77 -> b(21062436, var9 ^ 1505189122);
            case 78 -> b(21062437, var9 ^ 1159451586);
            case 79 -> b(21062438, var9 ^ -806712469);
            case 80 -> b(21062439, var9 ^ -935658853);
            case 81 -> b(21062440, var9 ^ -1854259528);
            case 82 -> b(21062441, var9 ^ 1136546155);
            case 83 -> b(21062442, var9 ^ -1133453505);
            case 84 -> b(21062443, var9 ^ -1599147158);
            case 85 -> b(21062444, var9 ^ -1428130136);
            case 86 -> b(21062445, var9 ^ -764143572);
            case 87 -> b(21062446, var9 ^ -1653458789);
            case 88 -> b(21062447, var9 ^ 839153433);
            case 89 -> b(21062416, var9 ^ 1520724683);
            case 90 -> b(21062417, var9 ^ -1346508645);
            case 91 -> b(21062418, var9 ^ -505329414);
            case 92 -> b(21062419, var9 ^ 2102262071);
            case 93 -> 1;
            case 94 -> b(21062420, var9 ^ -167682179);
            case 95 -> b(21062421, var9 ^ 721961037);
            case 96 -> b(21062422, var9 ^ 594862361);
            case 97 -> 3;
            case 98 -> b(21062423, var9 ^ -2109888104);
            case 99 -> b(21062424, var9 ^ -1352392103);
            case 100 -> b(21062425, var9 ^ 1467468036);
            case 101 -> b(21062426, var9 ^ -1145251958);
            case 102 -> 4;
            case 103 -> b(21062427, var9 ^ 1129344301);
            case 104 -> b(21062428, var9 ^ 1218740358);
            case 105 -> b(21062429, var9 ^ -1444348513);
            case 106 -> b(21062430, var9 ^ 482996772);
            case 107 -> b(21062431, var9 ^ 833353382);
            case 108 -> b(21062400, var9 ^ 1168596610);
            case 109 -> b(21062401, var9 ^ 1594348039);
            case 110 -> b(21062402, var9 ^ 1393684053);
            case 111 -> b(21062403, var9 ^ -1658498129);
            case 112 -> b(21062404, var9 ^ -1120597962);
            case 113 -> b(21062405, var9 ^ -646833738);
            case 114 -> b(21062406, var9 ^ -1066305941);
            case 115 -> b(21062407, var9 ^ -899595586);
            case 116 -> b(21062408, var9 ^ 1580235142);
            case 117 -> b(21062409, var9 ^ -1528782364);
            case 118 -> b(21062410, var9 ^ 924916175);
            case 119 -> b(21062411, var9 ^ -501709102);
            case 120 -> b(21062412, var9 ^ -1296951103);
            case 121 -> b(21062413, var9 ^ -1795401245);
            case 122 -> b(21062414, var9 ^ 1670589144);
            case 123 -> b(21062415, var9 ^ 1906247084);
            case 124 -> b(21062640, var9 ^ 823748790);
            case 125 -> b(21062641, var9 ^ -563612676);
            case 126 -> b(21062642, var9 ^ -1579674667);
            case 127 -> b(21062643, var9 ^ 1812135151);
            case 128 -> b(21062644, var9 ^ -1833603098);
            case 129 -> b(21062645, var9 ^ -1802312400);
            case 130 -> b(21062646, var9 ^ -174234003);
            case 131 -> b(21062647, var9 ^ -344982168);
            case 132 -> b(21062648, var9 ^ 102786826);
            case 133 -> b(21062649, var9 ^ -243579815);
            case 134 -> b(21062650, var9 ^ -2089663666);
            case 135 -> 5;
            case 136 -> b(21062651, var9 ^ -706864795);
            case 137 -> b(21062652, var9 ^ -1184683072);
            case 138 -> b(21062653, var9 ^ 695166280);
            case 139 -> b(21062654, var9 ^ -1448873252);
            case 140 -> b(21062655, var9 ^ -1224386316);
            case 141 -> b(21062624, var9 ^ -424489593);
            case 142 -> b(21062625, var9 ^ 558109075);
            case 143 -> b(21062626, var9 ^ 566004205);
            case 144 -> b(21062627, var9 ^ 1402790410);
            case 145 -> b(21062628, var9 ^ 301756143);
            case 146 -> b(21062629, var9 ^ -1705078533);
            case 147 -> b(21062630, var9 ^ -1013798027);
            case 148 -> b(21062631, var9 ^ 1808454752);
            case 149 -> b(21062632, var9 ^ 728793188);
            case 150 -> b(21062633, var9 ^ 1914147744);
            case 151 -> b(21062634, var9 ^ -1281132704);
            case 152 -> b(21062635, var9 ^ 668751782);
            case 153 -> b(21062636, var9 ^ 1088717402);
            case 154 -> b(21062637, var9 ^ -573038913);
            case 155 -> b(21062638, var9 ^ 546206786);
            case 156 -> b(21062639, var9 ^ -719670540);
            case 157 -> b(21062608, var9 ^ 152145962);
            case 158 -> b(21062609, var9 ^ -1014915438);
            case 159 -> b(21062610, var9 ^ -383838526);
            case 160 -> b(21062611, var9 ^ 1276852121);
            case 161 -> b(21062612, var9 ^ -353443755);
            case 162 -> b(21062613, var9 ^ 1743855607);
            case 163 -> b(21062614, var9 ^ 912424028);
            case 164 -> b(21062615, var9 ^ 280747778);
            case 165 -> b(21062616, var9 ^ 1377847889);
            case 166 -> b(21062617, var9 ^ 949733865);
            case 167 -> b(21062618, var9 ^ 1169338229);
            case 168 -> b(21062619, var9 ^ 592326683);
            case 169 -> b(21062620, var9 ^ -1087366711);
            case 170 -> b(21062621, var9 ^ -1425634977);
            case 171 -> b(21062622, var9 ^ -39560275);
            case 172 -> b(21062623, var9 ^ 1361631065);
            case 173 -> b(21062592, var9 ^ 4611618);
            case 174 -> b(21062593, var9 ^ -1909803700);
            case 175 -> b(21062594, var9 ^ 1256095367);
            case 176 -> b(21062595, var9 ^ -484631060);
            case 177 -> b(21062596, var9 ^ 266732248);
            case 178 -> b(21062597, var9 ^ 1504929434);
            case 179 -> b(21062598, var9 ^ -169309505);
            case 180 -> b(21062599, var9 ^ 1314129266);
            case 181 -> b(21062600, var9 ^ 785047525);
            case 182 -> b(21062601, var9 ^ -557951516);
            case 183 -> b(21062602, var9 ^ -824765819);
            case 184 -> b(21062603, var9 ^ -413612967);
            case 185 -> b(21062604, var9 ^ -2085137360);
            case 186 -> b(21062605, var9 ^ -1722226895);
            case 187 -> b(21062606, var9 ^ 1961514990);
            case 188 -> b(21062607, var9 ^ -866404797);
            case 189 -> b(21062576, var9 ^ 170725551);
            case 190 -> b(21062577, var9 ^ 1609298065);
            case 191 -> b(21062578, var9 ^ -711099191);
            case 192 -> b(21062579, var9 ^ 728044507);
            case 193 -> b(21062580, var9 ^ -1549178378);
            case 194 -> b(21062581, var9 ^ -1522848588);
            case 195 -> b(21062582, var9 ^ -1296146951);
            case 196 -> b(21062583, var9 ^ -1544637057);
            case 197 -> b(21062584, var9 ^ 167250498);
            case 198 -> b(21062585, var9 ^ -1003375295);
            case 199 -> b(21062586, var9 ^ -1484921519);
            case 200 -> b(21062587, var9 ^ 1857073689);
            case 201 -> b(21062588, var9 ^ -383201357);
            case 202 -> b(21062589, var9 ^ 623615772);
            case 203 -> b(21062590, var9 ^ 804442401);
            case 204 -> b(21062591, var9 ^ 204176154);
            case 205 -> b(21062560, var9 ^ -712131568);
            case 206 -> b(21062561, var9 ^ 1612762348);
            case 207 -> b(21062562, var9 ^ 1905141298);
            case 208 -> b(21062563, var9 ^ -382868000);
            case 209 -> b(21062564, var9 ^ -1783160297);
            case 210 -> b(21062565, var9 ^ 1070906654);
            case 211 -> b(21062566, var9 ^ -1699246051);
            case 212 -> b(21062567, var9 ^ -1151061047);
            case 213 -> b(21062568, var9 ^ 1625280588);
            case 214 -> b(21062569, var9 ^ -629020756);
            case 215 -> b(21062570, var9 ^ -255969342);
            case 216 -> b(21062571, var9 ^ 1789625178);
            case 217 -> b(21062572, var9 ^ 1777565711);
            case 218 -> b(21062573, var9 ^ -150129090);
            case 219 -> b(21062574, var9 ^ 1658273470);
            case 220 -> b(21062575, var9 ^ 1882098624);
            case 221 -> b(21062544, var9 ^ 1768387000);
            case 222 -> b(21062545, var9 ^ -35966042);
            case 223 -> b(21062546, var9 ^ -1130940224);
            case 224 -> 2;
            case 225 -> 0;
            case 226 -> b(21062547, var9 ^ 1272589756);
            case 227 -> b(21062548, var9 ^ 964667999);
            case 228 -> b(21062549, var9 ^ 521665713);
            case 229 -> b(21062550, var9 ^ 351585210);
            case 230 -> b(21062551, var9 ^ 711073376);
            case 231 -> b(21062552, var9 ^ 2091504862);
            case 232 -> b(21062553, var9 ^ -2110751038);
            case 233 -> b(21062554, var9 ^ -1042253064);
            case 234 -> b(21062555, var9 ^ 54966600);
            case 235 -> b(21062556, var9 ^ -1762354828);
            case 236 -> b(21062557, var9 ^ 2057972315);
            case 237 -> b(21062558, var9 ^ -1559450689);
            case 238 -> b(21062559, var9 ^ 1347732259);
            case 239 -> b(21062528, var9 ^ 596885537);
            case 240 -> b(21062529, var9 ^ 1714329429);
            case 241 -> b(21062530, var9 ^ -1757250037);
            case 242 -> b(21062531, var9 ^ 821758385);
            case 243 -> b(21062532, var9 ^ -1401962491);
            case 244 -> b(21062533, var9 ^ -366623465);
            case 245 -> b(21062534, var9 ^ -2142283291);
            case 246 -> b(21062535, var9 ^ 1584044869);
            case 247 -> b(21062536, var9 ^ -5663021);
            case 248 -> b(21062537, var9 ^ 256048931);
            case 249 -> b(21062538, var9 ^ 242155315);
            case 250 -> b(21062539, var9 ^ 986087474);
            case 251 -> b(21062540, var9 ^ 1908181462);
            case 252 -> b(21062541, var9 ^ -1884052432);
            case 253 -> b(21062542, var9 ^ -691290671);
            case 254 -> b(21062543, var9 ^ 882366580);
            default -> b(21062256, var9 ^ 466983928);
         };
         int var5 = (var1 & b(21062257, var9 ^ -69118534)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(21062258, var9 ^ -1273721619)) >>> b(21062259, var9 ^ 1123211183)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(21062260, var9 ^ -980953893);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(21062261, var9 ^ -1755186536);
            }
         }

         aba[var2] = new String(var3).intern();
      }

      return aba[var2];
   }

   private static int b(int var0, int var1) {
      int var2 = aaaa[var0 ^ 21062512] ^ var1 ^ var0;
      var2 ^= 42567;
      var2 += 35491;
      var2 += 53139;
      var2 ^= 28424;
      var2 += 57160;
      return var2 ^ 52066;
   }

   private static babbbbb[] bb() {
      babbbbb[] var10000 = new babbbbb[aab(
         b(21062262, 2030346311 ^ -1648578960), 470832064366597878L
      )];
      var10000[0] = bb;
      var10000[1] = ab;
      var10000[2] = b;
      var10000[3] = aab;
      var10000[4] = bab;
      var10000[5] = baa;
      return var10000;
   }

   private static String aba(short var0, int var1, char var2, char var3, short var4) {
      int var9 = var1 ^ 1011742274;
      char[] var8 = aaab[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aaba[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         aaba[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 36259;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ switch (var7 % 19) {
            default -> 194;
            case 1 -> 220;
            case 2 -> 41;
            case 3 -> 179;
            case 4 -> 34;
            case 5 -> 221;
            case 6 -> 238;
            case 7 -> 211;
            case 8 -> 0;
            case 9 -> 77;
            case 10 -> 31;
            case 11 -> 159;
            case 12 -> 87;
            case 13 -> 206;
            case 14 -> 138;
            case 15 -> 47;
            case 16 -> 131;
            case 17 -> 73;
            case 18 -> 108;
         } ^ var4 ^ var3 ^ var6 ^ var1 ^ var0 ^ var2);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   public static babbbbb aaa(String var0) {
      return Enum.valueOf(babbbbb.class, var0);
   }

   private static int aab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(21062220, -1803558513 ^ 1162718936);
      if (bba[var3] == null) {
         bba[var3] = (int)(abb[var3] ^ var1);
      }

      return bba[var3];
   }

   private static void a() {
      int var0 = -484785559;
      ba[0] = ab(
         ba(b(21062221, var0 ^ 1089975104), b(21062222, var0 ^ 911445358)).toCharArray(),
         aa(b(21062223, var0 ^ 2073790219), 2811955653468946421L),
         aab(b(21062192, var0 ^ -1970608041), 8833784155342385418L)
      );
      ba[1] = ab(
         ba(b(21062193, var0 ^ 2088580375), b(21062194, var0 ^ -2131558046)).toCharArray(),
         aa(b(21062195, var0 ^ -1930381023), 7549319930900910740L),
         aab(b(21062196, var0 ^ 1226508624), 4560857449326468304L)
      );
      ba[2] = ab(
         ba(b(21062197, var0 ^ 1535835731), b(21062198, var0 ^ -1873307455)).toCharArray(),
         aa(b(21062199, var0 ^ -877744938), 3624761816417448874L),
         aab(b(21062200, var0 ^ -1040501195), 7094863158333260428L)
      );
      ba[3] = ab(
         ba(b(21062201, var0 ^ -2070539693), b(21062202, var0 ^ 741073888)).toCharArray(),
         aa(b(21062203, var0 ^ 1130393602), 3447496801368923608L),
         aab(b(21062204, var0 ^ -509063902), 5482462856445096446L)
      );
      ba[4] = ab(
         ba(b(21062205, var0 ^ -1263551659), b(21062206, var0 ^ 538504383)).toCharArray(),
         aa(b(21062207, var0 ^ -64042992), 4145480981443935895L),
         aab(b(21062176, var0 ^ 1014741905), 2577799408520229488L)
      );
      ba[5] = ab(
         ba(b(21062177, var0 ^ -27606789), b(21062178, var0 ^ -564424482)).toCharArray(),
         aa(b(21062179, var0 ^ 249026415), 3657717509500409931L),
         aab(b(21062180, var0 ^ 1254798043), 1178562518741413084L)
      );
   }
}
