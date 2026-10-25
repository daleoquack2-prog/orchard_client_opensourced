package nsc;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3675;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;

@Environment(EnvType.CLIENT)
public final class abbaabbab extends baaabbaa {
   private static final int[] abb;
   private static final String[] aa;
   private static final Integer[] ab;
   private static final Long[] ba;
   private static final Object[] aaba;
   private static final long[] bb;
   private static String[] aaa;
   private static final String[] aab;
   private static final long[] aba;
   private static final String[] aaab;

   public abbaabbab(String var1) {
      this((Object)var1);
   }

   private static String bab(int var0, int var1, int var2) {
      int var3 = var2 ^ 13921;
      char[] var4 = aaab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 3394;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 5961;
         var10 += 56978;
         var10 += 7186;
         var10 -= 25398;
         var10 -= 31639;
         var10 ^= 22913;
         var10 ^= 18718;
         var10 ^= 55648;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static void aa() {
      int var0 = 760691015;
      aaa[0] = aaa(
         b(a(1107648110, var0 ^ 953874508), a(1107648111, var0 ^ -1071931048)).toCharArray(),
         baa(a(1107648108, var0 ^ 403781180), 1250234998039890330L),
         ba(a(1107648109, var0 ^ -1373680918), 693320833515655813L)
      );
      aaa[1] = aaa(
         b(a(1107648106, var0 ^ 2047133956), a(1107648107, var0 ^ 1110144541)).toCharArray(),
         baa(a(1107648104, var0 ^ -1733482415), 8012445737007123451L),
         ba(a(1107648105, var0 ^ 1759175595), 8415315972284807732L)
      );
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1107648102, 394757498 ^ -1848467969);
      if (ab[var3] == null) {
         ab[var3] = (int)(bb[var3] ^ var1);
      }

      return ab[var3];
   }

   private static int a(int var0, int var1) {
      int var2 = abb[var0 ^ 1107648110] ^ var1 ^ var0;
      var2 ^= 57037;
      var2 ^= 19893;
      var2 -= 417;
      var2 += 34440;
      var2 ^= 3529;
      var2 -= 6568;
      var2 += 56583;
      return var2 ^ 30116;
   }

   public void bb(class_306 var1) {
      int var2 = baaabbaa.bba;

      abbaabbab var10000;
      class_306 var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = var1;
               if (var2 != 0) {
                  break label22;
               }

               if (var1 == null) {
                  break label21;
               }
            } catch (MatchException var3) {
               throw var3;
            }

            var10001 = var1;
            break label22;
         }

         var10001 = class_3675.field_16237;
      }

      var10000.aab(var10001);
   }

   @Override
   public void aab(Object var1) {
      this.bb((class_306)var1);
   }

   public abbaabbab(Object var1, class_306 var2) {
      super(var1, var2);
   }

   private static String aaa(char[] var0, long var1, int var3) {
      int var4 = ba(a(1107648103, -929077512 ^ 1415742071), 2171236728125440365L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ba(a(1107648100, -929077512 ^ -544650371), 3841088410853359844L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public abbaabbab(Object var1) {
      this(var1, class_3675.field_16237);
   }

   public boolean abb() {
      int var1 = baaabbaa.bba;

      try {
         boolean var10000 = aabbabbbb.bbaaaaa((class_306)this.abbb());
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

   @Override
   public JsonElement aba() {
      int var1 = baaabbaa.bba;
      JsonElement var2 = aabbabbbb.aaaabbb((class_306)this.abbb());

      label30: {
         try {
            if (var1 != 0) {
               return var2;
            }

            if (var2 == null) {
               break label30;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         return var2;
      }

      JsonObject var3 = new JsonObject();
      var3.addProperty(aabbaaaba.abba(aaa[1]), class_307.field_1668.name());
      var3.addProperty(aabbaaaba.abba(aaa[0]), -1);
      return var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = -2011611756;
      char[] var25 = "ⱼⱽⱧⱽⱧⱽⱧ".toCharArray();
      short var23 = 11373;
      String var24 = "ꤑ砼ᄽㅙ뮄䁿\ueb13灔\u0895\ue0cc殮ꄮ텴ꋩ呎ᙳḭ倒儱偰傃僛倝傦傏偠偑僲凤兞傇凔凒ẖὨṶᾡἵᾴἂἎῐᾅ产佴侼乣佂丙估亘乔乪佘侭伾仱乽侦ॱॏঙৎऒওभऩিল樁槈椠楎榔椰槀樿楱椳榊櫏槵樅櫬楳笸笖篐稇筛篚筤筠究篻";
      byte var30 = -1;
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         int var28 = 0;
         int var29 = 0;
         if (var30 == 0) {
            aaab = var26;
            aaba = new Object[var26.length];
            abb = new int[307];
            byte var38 = 0;
            int var10001 = 0;
            byte[] var10002 = "\r\u008c\tEõM\u0005F-FN\u0016\u009bIåÅOR?¤w}Ñ°\u00adû\u008e\u001f]\u008cD²\u009eT\u009fb\u0084ý¤\u0018\u000f\u0016m\u008b×kjlD©^\u008aü\u000e:\u0018 \u008d×ÆO°\u009d.Èa\u0010x»\u000e-ò\u000bÚ[+åV\u0092\u0015$\u00189ÐqÍy¶\u0092=«`cò\";îrk¶ªÐ\u000f+\u0090Ä¿\u0013±ý¦.^°¾Ën\u00963}Ê\u0002¿L$øXç¸\u0007\t¨ÓRæ½Ú¬\u0082Ûr\u0090ÓgI\"\u0019\u0017$rî=,)Y·\\ôÑ¥\u008f$gkýÃ¤\f»\u0096:\u0016'ñrç\u001f\u000b3Ág\u0002Q\u0094'\u009af2ïöÙ\u0011ëAYl\u0017Ï\u0086\u001c\u0018óg\u0087b\u009b©¹\u0080Å¤-·\"X¾,ïpôªèÔ\u0090`cò\u000b¶ÀG\u0012LT8\u008dñM\u0014BttÜfÕçc\u009f\u008e¹\u009e\u0081Q0sé¦y1Âhä´á\u0094\u0015ÈP\u0006>\u009c\fÙU\u0083\u008fSm\u0016\"\u000eNê\u008cÞ½PZÃ8ÑÝ÷^\"ÎÔ Ô³³\u0088}ÌPìWJ²á \u001c\u0095ñ;¶ýºoX&d\u008c¶=>dwþÍ$\u0018T¨\u0088÷\u0091Rm°\u001a\r\u0087§t\nBÂ\u0007#\u001dzëµeÆF~U\u0002\u0012²\u0082^xÛ%y\u0092FfLRº3f\u001bÝË½ÚL÷#\u0007®æ\u0014i\u008bVc\nH\u0091:«u\u0083²\u008c2ÝÛÐÐrÍkZþ\u0085ù\\Þ\u009b2O«|ä\u0090áÆC¥\u009bÐ\u0098)\u0093\bíbçû\u008dæÏâ«Ñr&\u0086`¥½ªVó\"Ëø×d¢\u008duDÿ2õ\u0006î= «/\u001f·½F\u0005Eáy\u0006\u0011í¥¼\u008aÝá¦`4·[Çæ´¤íW\u008bÖ\u0098¶\bJI\u0080ø®HçÎ¯û©%\u000fdý\u001b«cyøÐ»\u009aé\u0086úbåÎ\u0090B\u0093\u000fôuPP7\u0081\u00adÞÀ\u0098`úAK&á\u000båÁ·JòG\"\u0001W)¹PÅ\u001d·\u0086ÌÁ½E,ã?¨\u008bY(ý?R\u0018Ù3àÎ\u0095+âbå?\u000fïF[÷Z\u008d{uP·¤g«ÌgÝW\u009aEÙö'^\u0080¤´±vFGxLáò¶\u0013Nvx\u0081*fÛ\u0006_èÎ-\u0012;q:gÛ\u0081\b\u008eÚ¤\u007fam2¿ø\u0082\u0086\u001cOmÒ'\u0081ë\u0084T\u0014ãmï\u0015ùµlþ\u0012e!¤xÚô«\u0002(bHo£åO\u0082\u0096QjÑ¯ó¹¹Ë_U\u0093Is\r8\\/\u0000¯÷zs)¿Hä+2=\nEÍ)ã\u001f\u000bÕÂn.#}\u0000v\u0002º\u0007ÃY\u008cñ#µã\u0014\u0092Qí\u0081³¶¤4\u008dæD=¾æ-\u0014¿Õ]\u009f)\u0014\u0080\u0080Å¨p\u007f®iÒÕ\u008fz_Å[ÈíéÞÄé¡õ\u009fau\u009eÏ+FNGêdäãM\u001e\u0081é³LìR 3²\"þVþjÿä\u0016±®øÿ\u0097ßL\u0098\u008coa\u0088Hjë\\ñ5[\u0002ÛÕò\u001fê\u0097¿\u008aÉ\u008e\u0003\u008fÿk!ø¿\u0005¢\tÀ\u0013Kã\u000f!OÌl^¨ÆÇ\u0081Yß\u00adÖâÐ\bx\u0087ÈWò.Z\u0006_Ä\u009dx\u009e\u0086ÌøsìÉ\u001d\u0006d)\bégæÝ9\u0091¨']Ï\u007fV\u0092\u008a¦C\tÍ\u0005rîÌ\u009e\u0084PÆþæ÷Ay\u0015l\u000fx¬½ý!ÊÓêa%O&b\u0011A\u0080¨\u0094à\u009au\u009dÄ¬{\u000e\u008dñZ\u0085wsh\u0086V\u009e\u0091 \u0002\u0095TÌE\u000f¤Ü\u009aJ\\ó±çb°ÆU\u009a}\u009b\u0005â\b@ú}\f_©Ø}äÏ\u008b*ÆS&Ñ¡\u0000'ç\u0015\u0089&¼?àzçt¼W\u009cP\u008c7\u000f\u008bcµ¬\u0006Ç\u0002¯À~&\u008d.\fc'}7WÚo\u009eà\u008e/Éä½ñ,\u00ad\u001cLïM\u0088jGIàü=u\u0092\u001fª}\u008d\u001b³2Im\u0014íBçü\u000e\u0002¢\u0007\u0080{s¿\u007fi_\bË\u000f,å7*iØ\u0000\u00067vµh\u0013\u008f&]\u00adÑI\u000eÒ\u0091¯-Ü¬\u008bÞV·ïÑÐ¯O\u0004>\u001e\u0006ù\u0095\u00adö2ø¾kº3ý\u0016N+³Ûô¥ýÛìi\u001a`ÖL¯|\u0096JÍ\u0086¥ªSuL\u0099Ð4\u0090_\u0000#j\u008cVç\u007fN[½\u0016%ó¶ñ\u0005!B<Ì£+¦\u0091Mt\fðo\u008a"
               .getBytes("ISO-8859-1");

            int var85;
            do {
               abb[var38] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1510293830;
               var38 += 1;
               var85 = var10001 + 4;
               var10001 += 4;
            } while (var85 < var10002.length);

            String[] var21 = new String[2];
            int var19 = 0;
            String var18;
            int var20 = (var18 = bab(53171, var34 ^ -2061805077, 13921)).length();
            int var17 = a(1107648353, var34 ^ 1894074591);
            int var16 = -1;

            while (true) {
               label118: {
                  char[] var45 = var18.substring(++var16, var16 + var17).toCharArray();
                  var85 = var45.length;
                  int var22 = 0;
                  var68 = var45;
                  var10001 = var85;
                  char[] var89;
                  int var109;
                  if (var85 <= 1) {
                     var89 = var45;
                     var109 = var22;
                  } else {
                     var68 = var45;
                     var10001 = var85;
                     if (var85 <= var22) {
                        break label118;
                     }

                     var89 = var45;
                     var109 = var22;
                  }

                  while (true) {
                     var89[var109] = (char)(var89[var109] ^ switch (var22 % a(1107648382, var34 ^ 34004979)) {
                        case 0 -> a(1107648383, var34 ^ 486721302);
                        case 1 -> a(1107648380, var34 ^ -646684395);
                        case 2 -> a(1107648381, var34 ^ -755070932);
                        case 3 -> a(1107648378, var34 ^ -1833209315);
                        case 4 -> a(1107648379, var34 ^ -345322753);
                        case 5 -> a(1107648376, var34 ^ -112820962);
                        default -> a(1107648377, var34 ^ -1623879575);
                     });
                     var22++;
                     if (var10001 == 0) {
                        var109 = var10001;
                        var89 = var68;
                     } else {
                        if (var10001 <= var22) {
                           break;
                        }

                        var89 = var68;
                        var109 = var22;
                     }
                  }
               }

               String var96 = new String(var68).intern();
               int var52 = -1;
               var21[var19++] = var96;
               if ((var16 += var17) >= var20) {
                  aa = var21;
                  aab = new String[2];
                  long var8 = 7066995021479154351L;
                  long[] var14 = new long[4];
                  int var11 = 0;
                  String var12;
                  int var13 = (var12 = bab(25256, var34 ^ 1907963939, 13920)).length();
                  byte var10 = 0;

                  label102:
                  while (true) {
                     var52 = var10;
                     var10 += 8;
                     String var39 = var12.substring(var52, var10);
                     var52 = (short)8712;
                     int var73 = var34 ^ 1207467795;
                     short var97 = 13923;
                     byte[] var15 = var39.getBytes("ISO-8859-1");
                     long[] var40 = var14;
                     var52 = var11++;
                     long var74 = (var15[0] & 255L) << a(1107648374, var34 ^ -1167021011)
                        | (var15[1] & 255L) << a(1107648375, var34 ^ -1775369599)
                        | (var15[2] & 255L) << a(1107648372, var34 ^ -133498119)
                        | (var15[3] & 255L) << a(1107648373, var34 ^ -843799185)
                        | (var15[4] & 255L) << a(1107648370, var34 ^ -1630804954)
                        | (var15[5] & 255L) << a(1107648371, var34 ^ -1111107301)
                        | (var15[a(1107648368, var34 ^ 1313849962)] & 255L) << a(1107648369, var34 ^ 1103747829)
                        | var15[a(1107648334, var34 ^ -1809355848)] & 255L;
                     short var98 = -1;

                     while (true) {
                        long var111 = var74 ^ var8;
                        switch (var98) {
                           case 0:
                              var40[var52] = var111;
                              if (var10 >= var13) {
                                 bb = var14;
                                 ab = new Integer[4];
                                 long var0 = 6899536029541251282L;
                                 long[] var6 = new long[2];
                                 int var3 = 0;
                                 String var4;
                                 int var5 = (var4 = bab(58906, var34 ^ -823640550, 13924)).length();
                                 byte var2 = 0;

                                 do {
                                    int var58 = var2;
                                    var2 += 8;
                                    String var42 = var4.substring(var58, var2);
                                    var58 = (short)5992;
                                    int var77 = var34 ^ 788144748;
                                    var98 = 13927;
                                    byte[] var7 = var42.getBytes("ISO-8859-1");
                                    var58 = var3++;
                                    var111 = (
                                          (var7[0] & 255L) << a(1107648324, var34 ^ -595549141)
                                             | (var7[1] & 255L) << a(1107648325, var34 ^ 4617253)
                                             | (var7[2] & 255L) << a(1107648322, var34 ^ -90889458)
                                             | (var7[3] & 255L) << a(1107648323, var34 ^ -279498835)
                                             | (var7[4] & 255L) << a(1107648320, var34 ^ -2042853875)
                                             | (var7[5] & 255L) << a(1107648321, var34 ^ 1629246688)
                                             | (var7[a(1107648350, var34 ^ -1395272064)] & 255L) << a(1107648351, var34 ^ 914897120)
                                             | var7[a(1107648348, var34 ^ -1662445018)] & 255L
                                       )
                                       ^ var0;
                                    byte var102 = -1;
                                    var6[var58] = var111;
                                 } while (var2 < var5);

                                 aba = var6;
                                 ba = new Long[2];
                                 aaa = new String[2];
                                 aa();
                                 return;
                              }
                              break;
                           default:
                              var40[var52] = var111;
                              if (var10 < var13) {
                                 continue label102;
                              }

                              var13 = (var12 = bab(35066, var34 ^ -1651491705, 13922)).length();
                              var10 = 0;
                        }

                        byte var56 = var10;
                        var10 += 8;
                        String var41 = var12.substring(var56, var10);
                        char var57 = '艀';
                        int var76 = var34 ^ -912577877;
                        var98 = 13925;
                        var15 = var41.getBytes("ISO-8859-1");
                        var40 = var14;
                        var52 = var11++;
                        var74 = (var15[0] & 255L) << a(1107648335, var34 ^ 1770838498)
                           | (var15[1] & 255L) << a(1107648332, var34 ^ -1562260892)
                           | (var15[2] & 255L) << a(1107648333, var34 ^ 707430640)
                           | (var15[3] & 255L) << a(1107648330, var34 ^ -567097406)
                           | (var15[4] & 255L) << a(1107648331, var34 ^ 1690077291)
                           | (var15[5] & 255L) << a(1107648328, var34 ^ 2087743435)
                           | (var15[a(1107648329, var34 ^ 1180031680)] & 255L) << a(1107648326, var34 ^ 106149899)
                           | var15[a(1107648327, var34 ^ 900933314)] & 255L;
                        var98 = 0;
                     }
                  }
               }

               var17 = var18.charAt(var16);
            }
         }

         do {
            var29 = var25[var27] ^ var23;
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               short var33 = switch (var32 % 6) {
                  default -> 111;
                  case 1 -> 103;
                  case 2 -> 133;
                  case 3 -> 244;
                  case 4 -> 93;
                  case 5 -> 220;
               };
               var31[var32] = (char)(var31[var32] ^ var33);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private static long baa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(1107648101, 1094167087 ^ -1906488408)) & a(1107648098, 1094167087 ^ 496976203);
      if (ba[var3] == null) {
         ba[var3] = aba[var3] ^ var1;
      }

      return ba[var3];
   }

   public abbaabbab(String var1, class_306 var2) {
      this((Object)var1, var2);
   }

   private static String b(int var0, int var1) {
      int var9 = -95788924;
      int var2 = (var0 ^ a(1107648099, var9 ^ 507876722)) & a(1107648096, var9 ^ 1120371374);
      if (aab[var2] == null) {
         char[] var3 = aa[var2].toCharArray();

         int var4 = switch (var3[0] & a(1107648097, var9 ^ -1376077497)) {
            case 0 -> a(1107648126, var9 ^ 707474539);
            case 1 -> a(1107648127, var9 ^ 1497630146);
            case 2 -> a(1107648124, var9 ^ -376406212);
            case 3 -> a(1107648125, var9 ^ 119323619);
            case 4 -> a(1107648122, var9 ^ -967700366);
            case 5 -> a(1107648123, var9 ^ -1819848631);
            case 6 -> a(1107648120, var9 ^ 1886880411);
            case 7 -> a(1107648121, var9 ^ -2118645233);
            case 8 -> a(1107648118, var9 ^ 205016848);
            case 9 -> a(1107648119, var9 ^ 1218063199);
            case 10 -> a(1107648116, var9 ^ 1921948585);
            case 11 -> a(1107648117, var9 ^ 1404538794);
            case 12 -> a(1107648114, var9 ^ -1124428021);
            case 13 -> a(1107648115, var9 ^ -1931733133);
            case 14 -> a(1107648112, var9 ^ 675845794);
            case 15 -> a(1107648113, var9 ^ -961381142);
            case 16 -> a(1107648078, var9 ^ 1515004017);
            case 17 -> a(1107648079, var9 ^ 823706245);
            case 18 -> a(1107648076, var9 ^ 954640000);
            case 19 -> a(1107648077, var9 ^ -1864698024);
            case 20 -> 5;
            case 21 -> a(1107648074, var9 ^ -1419235105);
            case 22 -> a(1107648075, var9 ^ -969357331);
            case 23 -> a(1107648072, var9 ^ -832340490);
            case 24 -> a(1107648073, var9 ^ -1094781472);
            case 25 -> a(1107648070, var9 ^ 1835945491);
            case 26 -> a(1107648071, var9 ^ 529108418);
            case 27 -> a(1107648068, var9 ^ 1507594775);
            case 28 -> a(1107648069, var9 ^ -977577069);
            case 29 -> a(1107648066, var9 ^ -46064683);
            case 30 -> a(1107648067, var9 ^ -2058849022);
            case 31 -> a(1107648064, var9 ^ -976207238);
            case 32 -> a(1107648065, var9 ^ 230486207);
            case 33 -> a(1107648094, var9 ^ 151747853);
            case 34 -> a(1107648095, var9 ^ -175788113);
            case 35 -> a(1107648092, var9 ^ -88519056);
            case 36 -> a(1107648093, var9 ^ -2133753743);
            case 37 -> a(1107648090, var9 ^ 1653575110);
            case 38 -> a(1107648091, var9 ^ 1432908137);
            case 39 -> a(1107648088, var9 ^ -828025640);
            case 40 -> a(1107648089, var9 ^ 1218638069);
            case 41 -> a(1107648086, var9 ^ -2111187301);
            case 42 -> a(1107648087, var9 ^ 1418358370);
            case 43 -> a(1107648084, var9 ^ -1373761033);
            case 44 -> a(1107648085, var9 ^ 319238257);
            case 45 -> a(1107648082, var9 ^ -1774258919);
            case 46 -> a(1107648083, var9 ^ 934103627);
            case 47 -> a(1107648080, var9 ^ 1827911543);
            case 48 -> a(1107648081, var9 ^ -1283826703);
            case 49 -> a(1107648046, var9 ^ 1144199413);
            case 50 -> a(1107648047, var9 ^ -1968267957);
            case 51 -> a(1107648044, var9 ^ 1985995148);
            case 52 -> a(1107648045, var9 ^ -462113335);
            case 53 -> a(1107648042, var9 ^ 991930218);
            case 54 -> a(1107648043, var9 ^ -1322827849);
            case 55 -> a(1107648040, var9 ^ -335232228);
            case 56 -> a(1107648041, var9 ^ 1022850168);
            case 57 -> a(1107648038, var9 ^ 561182090);
            case 58 -> a(1107648039, var9 ^ 353633970);
            case 59 -> a(1107648036, var9 ^ 921370046);
            case 60 -> a(1107648037, var9 ^ 1371691398);
            case 61 -> a(1107648034, var9 ^ -1297714310);
            case 62 -> a(1107648035, var9 ^ 1353386442);
            case 63 -> a(1107648032, var9 ^ 2008748705);
            case 64 -> a(1107648033, var9 ^ 535840394);
            case 65 -> a(1107648062, var9 ^ -1003575140);
            case 66 -> a(1107648063, var9 ^ -546029479);
            case 67 -> a(1107648060, var9 ^ 478609444);
            case 68 -> a(1107648061, var9 ^ -1226661736);
            case 69 -> a(1107648058, var9 ^ 1930970134);
            case 70 -> 0;
            case 71 -> a(1107648059, var9 ^ -129520000);
            case 72 -> a(1107648056, var9 ^ -1774163168);
            case 73 -> a(1107648057, var9 ^ -446090030);
            case 74 -> a(1107648054, var9 ^ 167726499);
            case 75 -> a(1107648055, var9 ^ -1540063900);
            case 76 -> a(1107648052, var9 ^ -252139932);
            case 77 -> a(1107648053, var9 ^ -1701772966);
            case 78 -> a(1107648050, var9 ^ 1879855056);
            case 79 -> a(1107648051, var9 ^ -1326441744);
            case 80 -> a(1107648048, var9 ^ -107483150);
            case 81 -> a(1107648049, var9 ^ 939974298);
            case 82 -> a(1107648014, var9 ^ -437989401);
            case 83 -> a(1107648015, var9 ^ -1950256531);
            case 84 -> a(1107648012, var9 ^ -402475692);
            case 85 -> a(1107648013, var9 ^ 1228909212);
            case 86 -> a(1107648010, var9 ^ 1853421852);
            case 87 -> a(1107648011, var9 ^ 848976520);
            case 88 -> a(1107648008, var9 ^ -1995385085);
            case 89 -> a(1107648009, var9 ^ 454490045);
            case 90 -> a(1107648006, var9 ^ -804945198);
            case 91 -> a(1107648007, var9 ^ 115000740);
            case 92 -> 1;
            case 93 -> a(1107648004, var9 ^ -1578126436);
            case 94 -> a(1107648005, var9 ^ 2053356282);
            case 95 -> a(1107648002, var9 ^ 254332537);
            case 96 -> a(1107648003, var9 ^ 1873603360);
            case 97 -> a(1107648000, var9 ^ 1234916956);
            case 98 -> a(1107648001, var9 ^ 1680509987);
            case 99 -> a(1107648030, var9 ^ 1209850728);
            case 100 -> a(1107648031, var9 ^ 699593660);
            case 101 -> a(1107648028, var9 ^ 1086807109);
            case 102 -> a(1107648029, var9 ^ 494457195);
            case 103 -> a(1107648026, var9 ^ 209159370);
            case 104 -> a(1107648027, var9 ^ -850026506);
            case 105 -> a(1107648024, var9 ^ -1538298434);
            case 106 -> a(1107648025, var9 ^ -1689503298);
            case 107 -> a(1107648022, var9 ^ 1207346153);
            case 108 -> a(1107648023, var9 ^ 65816673);
            case 109 -> a(1107648020, var9 ^ 1427235640);
            case 110 -> a(1107648021, var9 ^ 1458488491);
            case 111 -> a(1107648018, var9 ^ 1771879535);
            case 112 -> a(1107648019, var9 ^ -369074011);
            case 113 -> a(1107648016, var9 ^ 451174730);
            case 114 -> a(1107648017, var9 ^ 753259091);
            case 115 -> a(1107648238, var9 ^ -951759362);
            case 116 -> a(1107648239, var9 ^ -102676603);
            case 117 -> a(1107648236, var9 ^ 446340894);
            case 118 -> a(1107648237, var9 ^ 197975697);
            case 119 -> a(1107648234, var9 ^ 126137551);
            case 120 -> a(1107648235, var9 ^ 1900404069);
            case 121 -> a(1107648232, var9 ^ -1306910916);
            case 122 -> a(1107648233, var9 ^ 1335157883);
            case 123 -> a(1107648230, var9 ^ -2102368902);
            case 124 -> a(1107648231, var9 ^ -995417575);
            case 125 -> a(1107648228, var9 ^ 603811429);
            case 126 -> a(1107648229, var9 ^ -1519901326);
            case 127 -> a(1107648226, var9 ^ -873237255);
            case 128 -> a(1107648227, var9 ^ -151593);
            case 129 -> a(1107648224, var9 ^ 603417710);
            case 130 -> a(1107648225, var9 ^ 24478027);
            case 131 -> a(1107648254, var9 ^ -1151151012);
            case 132 -> a(1107648255, var9 ^ -1336741494);
            case 133 -> a(1107648252, var9 ^ 42253519);
            case 134 -> a(1107648253, var9 ^ 2673689);
            case 135 -> a(1107648250, var9 ^ -307928396);
            case 136 -> a(1107648251, var9 ^ 353412223);
            case 137 -> a(1107648248, var9 ^ -1759863065);
            case 138 -> a(1107648249, var9 ^ -2048793293);
            case 139 -> a(1107648246, var9 ^ 1058913975);
            case 140 -> a(1107648247, var9 ^ 1002180117);
            case 141 -> a(1107648244, var9 ^ 1659805141);
            case 142 -> a(1107648245, var9 ^ -1811127371);
            case 143 -> a(1107648242, var9 ^ -1364468898);
            case 144 -> a(1107648243, var9 ^ -251371745);
            case 145 -> a(1107648240, var9 ^ 1667252819);
            case 146 -> a(1107648241, var9 ^ -468336166);
            case 147 -> 4;
            case 148 -> a(1107648206, var9 ^ -816311784);
            case 149 -> a(1107648207, var9 ^ -668077368);
            case 150 -> a(1107648204, var9 ^ -356191305);
            case 151 -> a(1107648205, var9 ^ -1658108925);
            case 152 -> a(1107648202, var9 ^ 1571989045);
            case 153 -> a(1107648203, var9 ^ -33209216);
            case 154 -> 3;
            case 155 -> a(1107648200, var9 ^ -976502166);
            case 156 -> a(1107648201, var9 ^ -1235302438);
            case 157 -> a(1107648198, var9 ^ 224383282);
            case 158 -> a(1107648199, var9 ^ -1900790938);
            case 159 -> a(1107648196, var9 ^ -1007792043);
            case 160 -> a(1107648197, var9 ^ 383855283);
            case 161 -> a(1107648194, var9 ^ -2147334421);
            case 162 -> a(1107648195, var9 ^ 117812202);
            case 163 -> a(1107648192, var9 ^ -1289684855);
            case 164 -> a(1107648193, var9 ^ 301178138);
            case 165 -> a(1107648222, var9 ^ -1121994943);
            case 166 -> a(1107648223, var9 ^ -1857613391);
            case 167 -> a(1107648220, var9 ^ -850754017);
            case 168 -> a(1107648221, var9 ^ -1741094703);
            case 169 -> a(1107648218, var9 ^ -1431433315);
            case 170 -> a(1107648219, var9 ^ -549428798);
            case 171 -> a(1107648216, var9 ^ -878102785);
            case 172 -> a(1107648217, var9 ^ 931678924);
            case 173 -> a(1107648214, var9 ^ -1053350798);
            case 174 -> 2;
            case 175 -> a(1107648215, var9 ^ -521130291);
            case 176 -> a(1107648212, var9 ^ -1144596044);
            case 177 -> a(1107648213, var9 ^ 1470705710);
            case 178 -> a(1107648210, var9 ^ -1280857961);
            case 179 -> a(1107648211, var9 ^ 1424887964);
            case 180 -> a(1107648208, var9 ^ 68031566);
            case 181 -> a(1107648209, var9 ^ 73871444);
            case 182 -> a(1107648174, var9 ^ 924300972);
            case 183 -> a(1107648175, var9 ^ -154490486);
            case 184 -> a(1107648172, var9 ^ 1245337275);
            case 185 -> a(1107648173, var9 ^ -1952911073);
            case 186 -> a(1107648170, var9 ^ -1743396449);
            case 187 -> a(1107648171, var9 ^ 715636875);
            case 188 -> a(1107648168, var9 ^ 648251511);
            case 189 -> a(1107648169, var9 ^ 2099993735);
            case 190 -> a(1107648166, var9 ^ 761356977);
            case 191 -> a(1107648167, var9 ^ -1516224366);
            case 192 -> a(1107648164, var9 ^ 17250188);
            case 193 -> a(1107648165, var9 ^ 200893914);
            case 194 -> a(1107648162, var9 ^ -1335223558);
            case 195 -> a(1107648163, var9 ^ -1061912629);
            case 196 -> a(1107648160, var9 ^ -2001351423);
            case 197 -> a(1107648161, var9 ^ 1407507545);
            case 198 -> a(1107648190, var9 ^ 1972725803);
            case 199 -> a(1107648191, var9 ^ 1847937175);
            case 200 -> a(1107648188, var9 ^ -1440690391);
            case 201 -> a(1107648189, var9 ^ 327122864);
            case 202 -> a(1107648186, var9 ^ 966776487);
            case 203 -> a(1107648187, var9 ^ 148740919);
            case 204 -> a(1107648184, var9 ^ 734275414);
            case 205 -> a(1107648185, var9 ^ 488704192);
            case 206 -> a(1107648182, var9 ^ 1565494064);
            case 207 -> a(1107648183, var9 ^ 576286616);
            case 208 -> a(1107648180, var9 ^ -311728420);
            case 209 -> a(1107648181, var9 ^ -1911259100);
            case 210 -> a(1107648178, var9 ^ 634089665);
            case 211 -> a(1107648179, var9 ^ 1335675802);
            case 212 -> a(1107648176, var9 ^ -365780197);
            case 213 -> a(1107648177, var9 ^ -1246229887);
            case 214 -> a(1107648142, var9 ^ -468324914);
            case 215 -> a(1107648143, var9 ^ -1697340903);
            case 216 -> a(1107648140, var9 ^ 439993690);
            case 217 -> a(1107648141, var9 ^ -11779977);
            case 218 -> a(1107648138, var9 ^ -358396324);
            case 219 -> a(1107648139, var9 ^ 1064547711);
            case 220 -> a(1107648136, var9 ^ -988289531);
            case 221 -> a(1107648137, var9 ^ -1260870901);
            case 222 -> a(1107648134, var9 ^ -1589386206);
            case 223 -> a(1107648135, var9 ^ -1868241427);
            case 224 -> a(1107648132, var9 ^ 1713041359);
            case 225 -> a(1107648133, var9 ^ 79521864);
            case 226 -> a(1107648130, var9 ^ -148494647);
            case 227 -> a(1107648131, var9 ^ 1324866004);
            case 228 -> a(1107648128, var9 ^ 681165764);
            case 229 -> a(1107648129, var9 ^ -955969669);
            case 230 -> a(1107648158, var9 ^ -217340877);
            case 231 -> a(1107648159, var9 ^ 1990901386);
            case 232 -> a(1107648156, var9 ^ 2140047396);
            case 233 -> a(1107648157, var9 ^ -322448126);
            case 234 -> a(1107648154, var9 ^ 1732074072);
            case 235 -> a(1107648155, var9 ^ 1679603625);
            case 236 -> a(1107648152, var9 ^ -1035420632);
            case 237 -> a(1107648153, var9 ^ 772744725);
            case 238 -> a(1107648150, var9 ^ 1053847191);
            case 239 -> a(1107648151, var9 ^ 301715064);
            case 240 -> a(1107648148, var9 ^ 1384938680);
            case 241 -> a(1107648149, var9 ^ -1613681427);
            case 242 -> a(1107648146, var9 ^ -368389158);
            case 243 -> a(1107648147, var9 ^ -300580647);
            case 244 -> a(1107648144, var9 ^ -1615926317);
            case 245 -> a(1107648145, var9 ^ -930317800);
            case 246 -> a(1107648366, var9 ^ 871049477);
            case 247 -> a(1107648367, var9 ^ 90153395);
            case 248 -> a(1107648364, var9 ^ 1584776570);
            case 249 -> a(1107648365, var9 ^ 87987578);
            case 250 -> a(1107648362, var9 ^ 2115676516);
            case 251 -> a(1107648363, var9 ^ -306100602);
            case 252 -> a(1107648360, var9 ^ 1313664558);
            case 253 -> a(1107648361, var9 ^ 1300912912);
            case 254 -> a(1107648358, var9 ^ 1868833983);
            default -> a(1107648359, var9 ^ -986246572);
         };
         int var5 = (var1 & a(1107648356, var9 ^ 941996940)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1107648357, var9 ^ 1818598793)) >>> a(1107648354, var9 ^ 1606091796)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1107648355, var9 ^ -33109466);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1107648352, var9 ^ 1780507169);
            }
         }

         aab[var2] = new String(var3).intern();
      }

      return aab[var2];
   }

   @Override
   public void ab(JsonElement var1) {
      this.bb(aabbabbbb.ab(var1));
   }
}
