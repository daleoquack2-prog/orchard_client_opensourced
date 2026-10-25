package nsc;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class abbb implements ModInitializer {
   private static final Object[] bab;
   private static final long[] aa;
   private static final Integer[] ab;
   public static final Logger ba;
   private static String[] b;
   private static final String[] baa;
   private static final String[] bb;
   private static final long[] aaa;
   private static final Long[] aab;
   private static final int[] abb;
   public static final String aba;
   private static final String[] a;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = 176089904;
      String[] var10000 = new String[7];
      int var26 = 0;
      String[] var25 = var10000;
      int var24 = "\u001f\ude61ⲡ鎠떤줾罏蹕껒ﵑ㛦㚤腏葑꽿⛖얟牰뚈菦筤浍焸\uf0e2穙菱箩뒽箜뙉㭖뛟\u0010࿕큘བ郬ี逴\u0eeb個\u0dcb탑భ큤ෲ郕\u0e61連\nꂼ誗ꄳ쨵ꌘ\u0ad8ꂮ쫸ꄢਡ\u0010∑튨≖ል∉ዞ↿ዣ⁃鈜⊥\u12bf⍦툺⁹틖\n鱼襛鷳짹鿘औ鱮줴鷢৭\u0010\udb87봱\ud9b0綫\ud8eb絹\ud9c1뵱\uda85ﶯ\ud9cf봗\ud9cc㶄\ud853絣\n凜薁偓씣剸\u05ce凎엮偂Է"
         .length();
      String var23 = "\u001f\ude61ⲡ鎠떤줾罏蹕껒ﵑ㛦㚤腏葑꽿⛖얟牰뚈菦筤浍焸\uf0e2穙菱箩뒽箜뙉㭖뛟\u0010࿕큘བ郬ี逴\u0eeb個\u0dcb탑భ큤ෲ郕\u0e61連\nꂼ誗ꄳ쨵ꌘ\u0ad8ꂮ쫸ꄢਡ\u0010∑튨≖ል∉ዞ↿ዣ⁃鈜⊥\u12bf⍦툺⁹틖\n鱼襛鷳짹鿘औ鱮줴鷢৭\u0010\udb87봱\ud9b0綫\ud8eb絹\ud9c1뵱\uda85ﶯ\ud9cf봗\ud9cc㶄\ud853絣\n凜薁偓씣剸\u05ce凎엮偂Է";
      int var27 = 0;
      short var28 = 20844;

      do {
         char var29 = var23.charAt(var27);
         char[] var37 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();
         int var31 = 0;
         char[] var30 = var37;

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 5) {
               default -> 252;
               case 1 -> 174;
               case 2 -> 239;
               case 3 -> 2;
               case 4 -> 60;
            }) ^ var32;
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 2 | var32 << 14) & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 2 | var32 >>> 14) & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      baa = var25;
      bab = new Object[var25.length];
      byte var39 = 0;
      int var10001 = 0;
      byte[] var10002 = "ÔP\u0016PÏ\u0081¶¬V¹\u0087\u0080\u0017há%\u0016\u009b\u0018 ýÑøF\u001a«Ú|¥Ê\u0011çÿè\u0004N¯7h;*\u0012¶óT\u0005ôe©L\nß&ô,\u0089ÃÖ\u000eE)<ü^\u0019TWGCrK§<E\u001e\u000b\u007f\u00059ä\u009cÇö{\u00194\n¦\u008a§Õº\u008c\u0095n\u0090Y³4Ôt\u001bPùI\u0018¯SÙ²ÇQ²ã{\u008d\u009d¹]£\u0010*'g\u008eÔ×¹\u0010eNm\u008dÙT6t¼¢L>\u001d\u0016Æ1\u00194Ô\u008f\u001dp µH4Rcå\u0083}Ûl\u0000\u008c6A&~Ïÿ\u0098íñxý\u0083\u009e\u0085á+ÛÃ\u0007\\\u0006Râ[\u000f3´N\u008fZIÀFg\t9\u0086½·µ9Ã¡ÝReÙÈ-ø)K4qkúÔ,R1\u0095.\u000e§\u0012\t·\u009f\u0004V:\u009cÓg\u009fe´\u0085ñ÷\u0092\u0013\u0084qX£xe\u0013Ëè´çEYC\u0005ÊÝ\nó+MääÉ\u009cø\u000bÄ\u00860Ýûï>ìõXÎ\u000bÃ\u0085y³h\u0017Ö\t5D5\u0003\u0018G>@:¸I\u0085ò\u007f\u009c\u001fþÃÜµkdv\u0086Ã\u0084AÏsLí2¸õ\u009aM\t1!\u0015cÖg-\u009d6\u001b¡\u001ctËOnKÌ\u008fËÐ\n$v!Î\u001cuüù\u00066öNF®]&ã²\u0094rÌAtÎá?ö ¨ã%}\u001a3ÑµÏf\u009alÿk@vyòQN\u0095¾\u0010\u0081Ö\u0080DJöß\u0086\u001fùÚ\u001e\u001e\u0014\u009b;l&V#\u0019E¾ä¿\u008b\u0019Úb.\u0085\u0010±ÍîdJÆ\u00adì\t¥ÆU$«Ãgbç\u0084*¥e\u0014.\u0082\u0014+?\u0099\u0012\u000e\u009aIp\u00ad¨\u000ekb\u008c>âZð\u0017¥\u0089_+.¡ãúô\u0011:ýå\u0097\t\u008eò|§\býS\u0086P7\u0011ãc£\u008d·©~wsÒ\u009fý\u0012]²8Ðbü\u0005_¨\u0015Æ6a-êié\u0084Õ;\u0002Z«àÉ¾\u0086ÏæuÍÎ_\u000f^~\u0014è.ÿÝa#\u0016k\u001aÿÌ¯\r¿oØ\u0016\u00194Êû¦d\u009bò(\u009dÄ<\u001dÕ\nZ1Û:,ÅàÊëÓEU`\u0002\u0003g\u0018\u0090²\u0002t¢]\u0091KW\u008b X)¦;\u0011ÂKx5Ê=&]4ëß\u001c£O\u008eeÓ\u001dç±ÅÅ\u009eé\rÙ\u0097\u0007T\u0013\u009bç±\u009e\u008eÁ\u000e\u008atä&/¿\u001d]ØX#M\rJ6\"*QÚ_F\u0086J?\u00114Vsh\t|hª\u0002\u0082ù¶\u0090.Èb\b\u0097\bÍb&\u008bßÛæã¹}\u0085>À´Õ\u001br3öåÒÈA'§+¢\u0084É\u0011{¤ò&Ú\u008d?Ûtz\u008ckct~\u0016\u00900¸!\u008b%ø;CóW\u009dK_ò\u0000¥®x¶iº$ä\u0004\u000f\u009bÏ\u0098/é×ä!\u0082\u009dÀ5Î-\u001b\u0094}\u001d¦V@\u0080ñt \u0086>Ã\u007f\u0006ñ\u0094#OÛ-¡\u000bb7÷ö\u0001\u001ax\u0000\u009a\u001bow\u0016å³þ\u0014\u000fÓ%\u0099¸®\u0019\u0016©èc\r\u008f\u0010õ×3á(\u007fF\u0012j\u0016¥\u0090\rµ\u0015]g_uÌë\u0011\u009c\u0007_zE:·í\u0086\u0098\u000f»º~3\u0007äÌáÄÒÜ\u0007÷\u0089Áµçuo>\u001eA0\u0007«\u0019=ºI³\u0096X\u0015ä\u0086/!±õsÝJ\u0018üe\u0084\u0019U_Àú\u008e\tÔî\u000e\u009fp8ýÓúÔÚ\u00883.R\u0094\u0007\u009b=\u008cÁÄ²\u0005Ò¤¹±È\u0012[·ä\u0011Û\u0092 gn\u0017\u0000\u0006{\u001fðZ\u0017%\u0091ZæéEy)M8\taþ{¯þ\u000bWâüÊ+{×¡Ì¾\u00026ti@\u0093Ñ\u0093â¥z½Ju\u000e%\\5Q\u007f\u0011Ð\u0018Ó8\u0082{Ë¶\u0086Õßx!.\bÿOøûØ&&©U®\u001aa\u0089\u0018ï¶9#s\fÛ=©WHêgv3+W\u0001\u0018\u008e\u00991Ï¢ó3W\u007f¼\u009609\u0096sÍè$Öå\u0000GL\u0099\u0018\u001e¡9Ê®\u001f¾w3Sdî\u0010·\n¾Qôÿ®Q\u0098.Ö\u0099\u0083\u008f^ºÔ_ýçdÍýe\"¹ø\u0005K\u0017áâÀ\u00ad32wKÑç~E\u009bIR\u0001'\u000bÂÚ\u008eG\u0086ú»4\u008aøävUÝÍ\u0012ï\u009d«ÂSÞOK£ì\u0015q0bT*._ãçi\b\u0095{üË\u008e[\u0099DD¶´NOãé>Mb\u001cí|P×Á_¦u«\u0019\t\u001däv\u0080}Ê"
         .getBytes("ISO-8859-1");
      abb = new int[308];

      int var86;
      do {
         abb[var39] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 841338574;
         var39 += 1;
         var86 = var10001 + 4;
         var10001 += 4;
      } while (var86 < var10002.length);

      String[] var21 = new String[3];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aaa(-617979112, var33 ^ 624209770)).length();
      int var17 = a(815484693, var33 ^ 594442144);
      int var16 = -1;

      while (true) {
         label118: {
            char[] var46 = var18.substring(++var16, var16 + var17).toCharArray();
            var86 = var46.length;
            int var22 = 0;
            var69 = var46;
            var10001 = var86;
            char[] var90;
            int var107;
            if (var86 <= 1) {
               var90 = var46;
               var107 = var22;
            } else {
               var69 = var46;
               var10001 = var86;
               if (var86 <= var22) {
                  break label118;
               }

               var90 = var46;
               var107 = var22;
            }

            while (true) {
               var90[var107] = (char)(var90[var107] ^ switch (var22 % a(815484694, var33 ^ -531199430)) {
                  case 0 -> 1;
                  case 1 -> a(815484689, var33 ^ -509250675);
                  case 2 -> a(815484688, var33 ^ 183472920);
                  case 3 -> a(815484691, var33 ^ -308956850);
                  case 4 -> a(815484690, var33 ^ 1391751666);
                  case 5 -> a(815484701, var33 ^ 148270961);
                  default -> a(815484700, var33 ^ 1476987281);
               });
               var22++;
               if (var10001 == 0) {
                  var107 = var10001;
                  var90 = var69;
               } else {
                  if (var10001 <= var22) {
                     break;
                  }

                  var90 = var69;
                  var107 = var22;
               }
            }
         }

         String var97 = new String(var69).intern();
         int var53 = -1;
         var21[var19++] = var97;
         if ((var16 += var17) >= var20) {
            a = var21;
            bb = new String[3];
            aba = ba(a(815484692, var33 ^ 951956318), a(815484695, var33 ^ -1585183038));
            long var8 = 6421487326263067320L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12;
            int var13 = (var12 = aaa(-617979111, var33 ^ -1946233367)).length();
            byte var10 = 0;

            label102:
            while (true) {
               var53 = var10;
               var10 += 8;
               String var40 = var12.substring(var53, var10);
               var53 = -617979110;
               int var74 = var33 ^ -521951543;
               byte[] var15 = var40.getBytes("ISO-8859-1");
               long[] var41 = var14;
               var53 = var11++;
               long var75 = (var15[0] & 255L) << a(815484703, var33 ^ -584263954)
                  | (var15[1] & 255L) << a(815484702, var33 ^ -1556376191)
                  | (var15[2] & 255L) << a(815484697, var33 ^ 1584556916)
                  | (var15[3] & 255L) << a(815484696, var33 ^ -775271109)
                  | (var15[4] & 255L) << a(815484699, var33 ^ 887648188)
                  | (var15[5] & 255L) << a(815484698, var33 ^ -570253922)
                  | (var15[a(815484677, var33 ^ -295027626)] & 255L) << a(815484676, var33 ^ -1270079311)
                  | var15[a(815484679, var33 ^ -881101563)] & 255L;
               byte var98 = -1;

               while (true) {
                  long var109 = var75 ^ var8;
                  switch (var98) {
                     case 0:
                        var41[var53] = var109;
                        if (var10 >= var13) {
                           aa = var14;
                           ab = new Integer[4];
                           long var0 = 5414049598883118043L;
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = aaa(-617979107, var33 ^ 1047838867)).length();
                           byte var2 = 0;

                           do {
                              int var59 = var2;
                              var2 += 8;
                              String var43 = var4.substring(var59, var2);
                              var59 = -617979106;
                              int var78 = var33 ^ -591662444;
                              byte[] var7 = var43.getBytes("ISO-8859-1");
                              var59 = var3++;
                              var109 = (
                                    (var7[0] & 255L) << a(815484681, var33 ^ 1172118406)
                                       | (var7[1] & 255L) << a(815484680, var33 ^ 1787247697)
                                       | (var7[2] & 255L) << a(815484683, var33 ^ -418101538)
                                       | (var7[3] & 255L) << a(815484682, var33 ^ 2045425177)
                                       | (var7[4] & 255L) << a(815484725, var33 ^ -413454406)
                                       | (var7[5] & 255L) << a(815484724, var33 ^ 2061972952)
                                       | (var7[a(815484727, var33 ^ -2088580753)] & 255L) << a(815484726, var33 ^ -920420894)
                                       | var7[a(815484721, var33 ^ -970498068)] & 255L
                                 )
                                 ^ var0;
                              var98 = -1;
                              var6[var59] = var109;
                           } while (var2 < var5);

                           aaa = var6;
                           aab = new Long[2];
                           b = new String[2];
                           ab();
                           ba = LoggerFactory.getLogger(b[0]);
                           return;
                        }
                        break;
                     default:
                        var41[var53] = var109;
                        if (var10 < var13) {
                           continue label102;
                        }

                        var13 = (var12 = aaa(-617979109, var33 ^ -2131304491)).length();
                        var10 = 0;
                  }

                  int var57 = var10;
                  var10 += 8;
                  String var42 = var12.substring(var57, var10);
                  var57 = -617979108;
                  int var77 = var33 ^ -271320327;
                  var15 = var42.getBytes("ISO-8859-1");
                  var41 = var14;
                  var53 = var11++;
                  var75 = (var15[0] & 255L) << a(815484678, var33 ^ -2009376288)
                     | (var15[1] & 255L) << a(815484673, var33 ^ 1811519360)
                     | (var15[2] & 255L) << a(815484672, var33 ^ -301307116)
                     | (var15[3] & 255L) << a(815484675, var33 ^ 2107225107)
                     | (var15[4] & 255L) << a(815484674, var33 ^ 2074808176)
                     | (var15[5] & 255L) << a(815484685, var33 ^ -1366469373)
                     | (var15[a(815484684, var33 ^ -2094711839)] & 255L) << a(815484687, var33 ^ -1104755634)
                     | var15[a(815484686, var33 ^ 780971094)] & 255L;
                  var98 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   private static int a(int var0, int var1) {
      int var2 = abb[var0 ^ 815484693] ^ var1 ^ var0;
      var2 += 41118;
      var2 += 20842;
      var2 ^= 20002;
      var2 ^= 48072;
      var2 += 60482;
      var2 += 55885;
      var2 ^= 16045;
      var2 += 13754;
      var2 += 7545;
      return var2 ^ 17723;
   }

   private static long aa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(815484720, -578052239 ^ -1345051217)) & a(815484723, -578052239 ^ -1786716191);
      if (aab[var3] == null) {
         aab[var3] = aaa[var3] ^ var1;
      }

      return aab[var3];
   }

   public void onInitialize() {
      ba.info(b[1]);
   }

   private static String aaa(int var0, int var1) {
      int var3 = var0 ^ -617979112;
      char[] var4 = baa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -56286043;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 40;
            case 1 -> 196;
            case 2 -> 73;
            case 3 -> 131;
            case 4 -> 128;
            case 5 -> 217;
            case 6 -> 68;
            case 7 -> 23;
            case 8 -> 20;
            case 9 -> 52;
            case 10 -> 23;
            case 11 -> 194;
            case 12 -> 240;
            case 13 -> 105;
            case 14 -> 234;
            case 15 -> 193;
            case 16 -> 241;
            case 17 -> 34;
            case 18 -> 14;
            case 19 -> 194;
            case 20 -> 195;
            case 21 -> 172;
            case 22 -> 227;
            case 23 -> 250;
            case 24 -> 218;
            case 25 -> 246;
            case 26 -> 248;
            case 27 -> 83;
            case 28 -> 191;
            case 29 -> 124;
            case 30 -> 106;
            case 31 -> 90;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static String b(char[] var0, long var1, int var3) {
      int var4 = bb(a(815484722, -1154838318 ^ 629959951), 3699196499308719364L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & bb(a(815484733, -1154838318 ^ -1660551414), 431274313845038409L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static void ab() {
      int var0 = 1639121003;
      b[0] = b(
         ba(a(815484732, var0 ^ -1431254792), a(815484735, var0 ^ 1393551719)).toCharArray(),
         aa(a(815484734, var0 ^ 1837680425), 6592823094974150285L),
         bb(a(815484729, var0 ^ 41257691), 5863584300666602583L)
      );
      b[1] = b(
         ba(a(815484728, var0 ^ 1194519027), a(815484731, var0 ^ -1700587718)).toCharArray(),
         aa(a(815484730, var0 ^ -1815991840), 1783193106507748236L),
         bb(a(815484709, var0 ^ 329921478), 2471169121722390135L)
      );
   }

   private static String ba(int var0, int var1) {
      int var9 = 101015882;
      int var2 = (var0 ^ a(815484708, var9 ^ -1121941845)) & a(815484711, var9 ^ 2113610281);
      if (bb[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         int var4 = switch (var3[0] & a(815484710, var9 ^ -1031422144)) {
            case 0 -> a(815484705, var9 ^ -1457506103);
            case 1 -> a(815484704, var9 ^ -692205504);
            case 2 -> a(815484707, var9 ^ -818449052);
            case 3 -> a(815484706, var9 ^ 795456344);
            case 4 -> 0;
            case 5 -> a(815484717, var9 ^ 1852313759);
            case 6 -> a(815484716, var9 ^ -380872966);
            case 7 -> a(815484719, var9 ^ -15719424);
            case 8 -> a(815484718, var9 ^ 673349220);
            case 9 -> a(815484713, var9 ^ 1338240822);
            case 10 -> a(815484712, var9 ^ 1767269736);
            case 11 -> a(815484715, var9 ^ -1545168639);
            case 12 -> a(815484714, var9 ^ -393349528);
            case 13 -> a(815484757, var9 ^ 469976985);
            case 14 -> a(815484756, var9 ^ -24167303);
            case 15 -> a(815484759, var9 ^ 141470945);
            case 16 -> a(815484758, var9 ^ 529300987);
            case 17 -> a(815484753, var9 ^ -259876722);
            case 18 -> a(815484752, var9 ^ 649989715);
            case 19 -> a(815484755, var9 ^ 397456139);
            case 20 -> a(815484754, var9 ^ -259628014);
            case 21 -> a(815484765, var9 ^ 1210973196);
            case 22 -> a(815484764, var9 ^ -227321123);
            case 23 -> a(815484767, var9 ^ -128078674);
            case 24 -> a(815484766, var9 ^ -1149281921);
            case 25 -> 4;
            case 26 -> a(815484761, var9 ^ 2125960205);
            case 27 -> a(815484760, var9 ^ -457646756);
            case 28 -> a(815484763, var9 ^ 1311603437);
            case 29 -> a(815484762, var9 ^ 2105907875);
            case 30 -> a(815484741, var9 ^ 875998715);
            case 31 -> a(815484740, var9 ^ -906158172);
            case 32 -> a(815484743, var9 ^ -1236477160);
            case 33 -> 1;
            case 34 -> a(815484742, var9 ^ -299485374);
            case 35 -> a(815484737, var9 ^ -690430483);
            case 36 -> a(815484736, var9 ^ 1515874925);
            case 37 -> a(815484739, var9 ^ -1272209363);
            case 38 -> a(815484738, var9 ^ 1955475830);
            case 39 -> a(815484749, var9 ^ -550253997);
            case 40 -> a(815484748, var9 ^ -416278763);
            case 41 -> a(815484751, var9 ^ -42789065);
            case 42 -> a(815484750, var9 ^ -1108851773);
            case 43 -> a(815484745, var9 ^ 418679434);
            case 44 -> a(815484744, var9 ^ 923232919);
            case 45 -> a(815484747, var9 ^ 444209108);
            case 46 -> a(815484746, var9 ^ 1403337632);
            case 47 -> a(815484789, var9 ^ -512372958);
            case 48 -> a(815484788, var9 ^ 874546409);
            case 49 -> a(815484791, var9 ^ 70082062);
            case 50 -> a(815484790, var9 ^ -2102112307);
            case 51 -> a(815484785, var9 ^ 1862007639);
            case 52 -> a(815484784, var9 ^ 767974064);
            case 53 -> a(815484787, var9 ^ 228169904);
            case 54 -> a(815484786, var9 ^ 43778302);
            case 55 -> a(815484797, var9 ^ -270607800);
            case 56 -> a(815484796, var9 ^ -586138146);
            case 57 -> a(815484799, var9 ^ -1090845382);
            case 58 -> a(815484798, var9 ^ 1885324523);
            case 59 -> a(815484793, var9 ^ -708775458);
            case 60 -> a(815484792, var9 ^ 917213102);
            case 61 -> a(815484795, var9 ^ 1038617995);
            case 62 -> a(815484794, var9 ^ 1585692301);
            case 63 -> a(815484773, var9 ^ 1350993491);
            case 64 -> a(815484772, var9 ^ 482459968);
            case 65 -> a(815484775, var9 ^ -1638805628);
            case 66 -> a(815484774, var9 ^ -278060559);
            case 67 -> a(815484769, var9 ^ -381123526);
            case 68 -> a(815484768, var9 ^ -1947486543);
            case 69 -> a(815484771, var9 ^ -1876466140);
            case 70 -> a(815484770, var9 ^ 421326511);
            case 71 -> a(815484781, var9 ^ 1590476401);
            case 72 -> a(815484780, var9 ^ -706216640);
            case 73 -> a(815484783, var9 ^ 257219535);
            case 74 -> a(815484782, var9 ^ 517019639);
            case 75 -> a(815484777, var9 ^ 154748509);
            case 76 -> a(815484776, var9 ^ 102131476);
            case 77 -> a(815484779, var9 ^ -866909449);
            case 78 -> a(815484778, var9 ^ 1489524287);
            case 79 -> a(815484821, var9 ^ -2060358246);
            case 80 -> a(815484820, var9 ^ 1689842578);
            case 81 -> a(815484823, var9 ^ 1232941474);
            case 82 -> a(815484822, var9 ^ 121683484);
            case 83 -> a(815484817, var9 ^ -293590947);
            case 84 -> a(815484816, var9 ^ -693340270);
            case 85 -> a(815484819, var9 ^ 2140199654);
            case 86 -> a(815484818, var9 ^ -1578237536);
            case 87 -> a(815484829, var9 ^ 1170264506);
            case 88 -> a(815484828, var9 ^ -1903677501);
            case 89 -> a(815484831, var9 ^ -199516205);
            case 90 -> a(815484830, var9 ^ 325787190);
            case 91 -> a(815484825, var9 ^ -1704527973);
            case 92 -> a(815484824, var9 ^ -507892455);
            case 93 -> a(815484827, var9 ^ -151351703);
            case 94 -> a(815484826, var9 ^ -312530180);
            case 95 -> a(815484805, var9 ^ 14711470);
            case 96 -> 3;
            case 97 -> a(815484804, var9 ^ 158237520);
            case 98 -> a(815484807, var9 ^ -950285443);
            case 99 -> a(815484806, var9 ^ -1585986203);
            case 100 -> a(815484801, var9 ^ -679476991);
            case 101 -> a(815484800, var9 ^ 278310512);
            case 102 -> a(815484803, var9 ^ -1689787775);
            case 103 -> a(815484802, var9 ^ -472470522);
            case 104 -> a(815484813, var9 ^ -1880865809);
            case 105 -> a(815484812, var9 ^ -1341024958);
            case 106 -> a(815484815, var9 ^ -1552959376);
            case 107 -> a(815484814, var9 ^ -360207666);
            case 108 -> a(815484809, var9 ^ -829432591);
            case 109 -> a(815484808, var9 ^ -1502541230);
            case 110 -> a(815484811, var9 ^ -404401701);
            case 111 -> a(815484810, var9 ^ -1634272140);
            case 112 -> a(815484853, var9 ^ 1249911918);
            case 113 -> a(815484852, var9 ^ 306722833);
            case 114 -> a(815484855, var9 ^ -65931034);
            case 115 -> a(815484854, var9 ^ 485782592);
            case 116 -> a(815484849, var9 ^ 978021291);
            case 117 -> a(815484848, var9 ^ 526634537);
            case 118 -> a(815484851, var9 ^ -434620019);
            case 119 -> a(815484850, var9 ^ -670503754);
            case 120 -> a(815484861, var9 ^ -848835624);
            case 121 -> a(815484860, var9 ^ 555394872);
            case 122 -> a(815484863, var9 ^ -1317466290);
            case 123 -> a(815484862, var9 ^ -1389005225);
            case 124 -> a(815484857, var9 ^ -2026982327);
            case 125 -> a(815484856, var9 ^ 2042603654);
            case 126 -> a(815484859, var9 ^ -712145984);
            case 127 -> a(815484858, var9 ^ 1816997063);
            case 128 -> a(815484837, var9 ^ -573686254);
            case 129 -> a(815484836, var9 ^ 497440905);
            case 130 -> a(815484839, var9 ^ 2122001313);
            case 131 -> 5;
            case 132 -> a(815484838, var9 ^ 777874584);
            case 133 -> a(815484833, var9 ^ 228604348);
            case 134 -> a(815484832, var9 ^ -1167964529);
            case 135 -> a(815484835, var9 ^ 1505831150);
            case 136 -> a(815484834, var9 ^ -2132612050);
            case 137 -> a(815484845, var9 ^ 566809795);
            case 138 -> a(815484844, var9 ^ -1891670341);
            case 139 -> a(815484847, var9 ^ -1741580937);
            case 140 -> a(815484846, var9 ^ 1802852808);
            case 141 -> a(815484841, var9 ^ 1885595139);
            case 142 -> a(815484840, var9 ^ -1196078606);
            case 143 -> a(815484843, var9 ^ -1340478304);
            case 144 -> a(815484842, var9 ^ 1592498495);
            case 145 -> a(815484885, var9 ^ -1828963624);
            case 146 -> a(815484884, var9 ^ -11898528);
            case 147 -> a(815484887, var9 ^ 1667889081);
            case 148 -> a(815484886, var9 ^ 526883907);
            case 149 -> a(815484881, var9 ^ 997207984);
            case 150 -> a(815484880, var9 ^ -523082997);
            case 151 -> a(815484883, var9 ^ 1561567592);
            case 152 -> a(815484882, var9 ^ 171065064);
            case 153 -> a(815484893, var9 ^ -981033222);
            case 154 -> a(815484892, var9 ^ 181519035);
            case 155 -> a(815484895, var9 ^ 543932215);
            case 156 -> a(815484894, var9 ^ -1720576402);
            case 157 -> a(815484889, var9 ^ -94607827);
            case 158 -> a(815484888, var9 ^ 1633586893);
            case 159 -> a(815484891, var9 ^ -308040307);
            case 160 -> a(815484890, var9 ^ -280348583);
            case 161 -> a(815484869, var9 ^ 1660858447);
            case 162 -> a(815484868, var9 ^ -303040900);
            case 163 -> a(815484871, var9 ^ -154595629);
            case 164 -> a(815484870, var9 ^ 745930768);
            case 165 -> a(815484865, var9 ^ -2080371650);
            case 166 -> a(815484864, var9 ^ -304057921);
            case 167 -> a(815484867, var9 ^ 1313914014);
            case 168 -> a(815484866, var9 ^ -1540346575);
            case 169 -> a(815484877, var9 ^ -354818413);
            case 170 -> a(815484876, var9 ^ -2130500369);
            case 171 -> a(815484879, var9 ^ 381907806);
            case 172 -> a(815484878, var9 ^ 1090494384);
            case 173 -> a(815484873, var9 ^ -56547414);
            case 174 -> a(815484872, var9 ^ 1066713634);
            case 175 -> a(815484875, var9 ^ 214949786);
            case 176 -> a(815484874, var9 ^ 472944337);
            case 177 -> a(815484917, var9 ^ -452668961);
            case 178 -> a(815484916, var9 ^ 1348412355);
            case 179 -> a(815484919, var9 ^ -1292531604);
            case 180 -> a(815484918, var9 ^ -291410675);
            case 181 -> a(815484913, var9 ^ -621538172);
            case 182 -> a(815484912, var9 ^ 638579642);
            case 183 -> a(815484915, var9 ^ -1631455002);
            case 184 -> a(815484914, var9 ^ -1534782977);
            case 185 -> a(815484925, var9 ^ -225374316);
            case 186 -> a(815484924, var9 ^ 1681250679);
            case 187 -> a(815484927, var9 ^ 683622377);
            case 188 -> a(815484926, var9 ^ 1937060024);
            case 189 -> a(815484921, var9 ^ 1866565070);
            case 190 -> a(815484920, var9 ^ 2005392090);
            case 191 -> a(815484923, var9 ^ -23640832);
            case 192 -> a(815484922, var9 ^ 1250818337);
            case 193 -> a(815484901, var9 ^ 1285681165);
            case 194 -> a(815484900, var9 ^ 1768323330);
            case 195 -> a(815484903, var9 ^ -330950618);
            case 196 -> a(815484902, var9 ^ -457854685);
            case 197 -> a(815484897, var9 ^ -556483585);
            case 198 -> a(815484896, var9 ^ 302212910);
            case 199 -> a(815484899, var9 ^ -1233250496);
            case 200 -> a(815484898, var9 ^ 87929267);
            case 201 -> a(815484909, var9 ^ -267256808);
            case 202 -> a(815484908, var9 ^ 829329569);
            case 203 -> a(815484911, var9 ^ 1518952357);
            case 204 -> a(815484910, var9 ^ -852330718);
            case 205 -> a(815484905, var9 ^ 1754762629);
            case 206 -> a(815484904, var9 ^ 1581210789);
            case 207 -> a(815484907, var9 ^ -1907868868);
            case 208 -> a(815484906, var9 ^ -837328393);
            case 209 -> a(815484437, var9 ^ 727528302);
            case 210 -> a(815484436, var9 ^ 2034117620);
            case 211 -> a(815484439, var9 ^ 2106605327);
            case 212 -> a(815484438, var9 ^ -630462282);
            case 213 -> 2;
            case 214 -> a(815484433, var9 ^ -1262675148);
            case 215 -> a(815484432, var9 ^ -580695717);
            case 216 -> a(815484435, var9 ^ 1432124965);
            case 217 -> a(815484434, var9 ^ -475376073);
            case 218 -> a(815484445, var9 ^ -667489118);
            case 219 -> a(815484444, var9 ^ -957563401);
            case 220 -> a(815484447, var9 ^ 287479350);
            case 221 -> a(815484446, var9 ^ -804069028);
            case 222 -> a(815484441, var9 ^ 1977408339);
            case 223 -> a(815484440, var9 ^ 1505045734);
            case 224 -> a(815484443, var9 ^ -2063955519);
            case 225 -> a(815484442, var9 ^ -1026528162);
            case 226 -> a(815484421, var9 ^ 325139583);
            case 227 -> a(815484420, var9 ^ -83712508);
            case 228 -> a(815484423, var9 ^ -480556043);
            case 229 -> a(815484422, var9 ^ 837549960);
            case 230 -> a(815484417, var9 ^ -1938376680);
            case 231 -> a(815484416, var9 ^ 357914391);
            case 232 -> a(815484419, var9 ^ 1158946349);
            case 233 -> a(815484418, var9 ^ 1427403493);
            case 234 -> a(815484429, var9 ^ 769419517);
            case 235 -> a(815484428, var9 ^ -1510001646);
            case 236 -> a(815484431, var9 ^ 111314150);
            case 237 -> a(815484430, var9 ^ 102811695);
            case 238 -> a(815484425, var9 ^ 54569807);
            case 239 -> a(815484424, var9 ^ 447012681);
            case 240 -> a(815484427, var9 ^ -931686551);
            case 241 -> a(815484426, var9 ^ 715298004);
            case 242 -> a(815484469, var9 ^ 1611446441);
            case 243 -> a(815484468, var9 ^ -598859094);
            case 244 -> a(815484471, var9 ^ 1963091704);
            case 245 -> a(815484470, var9 ^ 1081171971);
            case 246 -> a(815484465, var9 ^ 523482503);
            case 247 -> a(815484464, var9 ^ 911536200);
            case 248 -> a(815484467, var9 ^ 1350847742);
            case 249 -> a(815484466, var9 ^ -1274132097);
            case 250 -> a(815484477, var9 ^ -298373151);
            case 251 -> a(815484476, var9 ^ -1351627144);
            case 252 -> a(815484479, var9 ^ 413303776);
            case 253 -> a(815484478, var9 ^ 1849564406);
            case 254 -> a(815484473, var9 ^ 1964930041);
            default -> a(815484472, var9 ^ -1074569518);
         };
         int var5 = (var1 & a(815484475, var9 ^ -1264191810)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(815484474, var9 ^ -1239119764)) >>> a(815484453, var9 ^ -2028652660)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(815484452, var9 ^ -1528796620);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(815484455, var9 ^ -498138504);
            }
         }

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(815484454, -1266106276 ^ 1061921571);
      if (ab[var3] == null) {
         ab[var3] = (int)(aa[var3] ^ var1);
      }

      return ab[var3];
   }
}
