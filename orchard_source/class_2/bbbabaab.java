package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbbabaab {
   private static final long[] aa;
   private static final String[] bba;
   private static String[] ab;
   private static final long[] b;
   public static final bbbabaab ba;
   private static final int[] bab;
   private static final Long[] bb;
   private static final bbbabaab[] aaa;
   public static final bbbabaab a;
   private static final Integer[] aab;
   public static final bbbabaab aba;
   private static final Object[] bbb;
   private static final String[] abb;
   private static final String[] baa;

   private static void aa() {
      int var0 = -1154080629;
      ab[0] = aaa(
         b(a(-1956972731, var0 ^ -1444850654), a(-1956972732, var0 ^ -778950736)).toCharArray(),
         aab(a(-1956972729, var0 ^ 544531487), 6513556324418554218L),
         bb(a(-1956972730, var0 ^ 1810151726), 1757857209618367404L)
      );
      ab[1] = aaa(
         b(a(-1956972735, var0 ^ -2007073688), a(-1956972736, var0 ^ 1373918085)).toCharArray(),
         aab(a(-1956972733, var0 ^ 1401703977), 7087022008375075350L),
         bb(a(-1956972734, var0 ^ -799914219), 3867540771478924241L)
      );
      ab[2] = aaa(
         b(a(-1956972723, var0 ^ -328445456), a(-1956972724, var0 ^ -784947419)).toCharArray(),
         aab(a(-1956972721, var0 ^ -1011690109), 3887470620017559941L),
         bb(a(-1956972722, var0 ^ -2101226558), 680738111153445533L)
      );
   }

   private static String aba(int var0, int var1, int var2) {
      int var7 = var2 ^ -537296308;
      char[] var6 = bba[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])bbb[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         bbb[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 24834;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 14) {
            default -> 18;
            case 1 -> 32;
            case 2 -> 136;
            case 3 -> 10;
            case 4 -> 143;
            case 5 -> 38;
            case 6 -> 97;
            case 7 -> 139;
            case 8 -> 187;
            case 9 -> 15;
            case 10 -> 76;
            case 11 -> 58;
            case 12 -> 227;
            case 13 -> 78;
         } ^ var4 ^ var0 ^ var2 ^ var1);
      }

      return new String(var6).intern();
   }

   public static bbbabaab ab(String var0) {
      return Enum.valueOf(bbbabaab.class, var0);
   }

   private static bbbabaab[] ba() {
      return new bbbabaab[]{ba, aba, a};
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1956972727, 1123539546 ^ -1324930708);
      if (aab[var3] == null) {
         aab[var3] = (int)(aa[var3] ^ var1);
      }

      return aab[var3];
   }

   private static String aaa(char[] var0, long var1, int var3) {
      int var4 = bb(a(-1956972728, -242600413 ^ -799257381), 7607768024911560421L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & bb(a(-1956972725, -242600413 ^ 526763429), 5723116187211903316L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static long aab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1956972726, -743981584 ^ -307384254)) & a(-1956972715, -743981584 ^ 491783679);
      if (bb[var3] == null) {
         bb[var3] = b[var3] ^ var1;
      }

      return bb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = 233396554;
      int var10001 = "\u0011Ⳟ阕듧\uf5a2晈Ꙇ杄ﰶటව쟌ⵋ̞効乱拾\uf8b0\u0018呗奾凑姻取\ud97f嘷㥵務᧥凶륦假㥮叉맵嘖饦哯㥼发溺坎ᥫ\n\uf436忢\uf078\udf64\uf3cf￦\uf44e翺\uf2f0ｧ\u0010앀朵엾➲쇉蜱샀✶쀆ꞽ욙Ꜣ썰朥셆䞨\n踌똊詂㚌觵ᘎ蹴阒裊ᚏ\u0018稨䗅籶\ue541糡\ue5d2糐旇縎敋絁\ue5c2窐䗊笮\u0557紙\ue5db稈䗋絮\ue551籡旘\n텟ﭷ픑篱횦孳턧\udb6f힙寲"
         .length();
      String[] var31 = new String[7];
      int var33 = 0;
      int var30 = var10001;
      short var34 = 22473;
      int var32 = 0;
      String var29 = "\u0011Ⳟ阕듧\uf5a2晈Ꙇ杄ﰶటව쟌ⵋ̞効乱拾\uf8b0\u0018呗奾凑姻取\ud97f嘷㥵務᧥凶륦假㥮叉맵嘖饦哯㥼发溺坎ᥫ\n\uf436忢\uf078\udf64\uf3cf￦\uf44e翺\uf2f0ｧ\u0010앀朵엾➲쇉蜱샀✶쀆ꞽ욙Ꜣ썰朥셆䞨\n踌똊詂㚌觵ᘎ蹴阒裊ᚏ\u0018稨䗅籶\ue541糡\ue5d2糐旇縎敋絁\ue5c2窐䗊笮\u0557紙\ue5db稈䗋絮\ue551籡旘\n텟ﭷ픑篱횦孳턧\udb6f힙寲";

      do {
         int var37 = 0;
         char var35 = var29.charAt(var33);
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            int var38 = var36[var37];

            var38 = (char)(switch (var37 % 6) {
               default -> 161;
               case 1 -> 53;
               case 2 -> 15;
               case 3 -> 185;
               case 4 -> 56;
               case 5 -> 60;
            }) ^ var38;
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 3 | var38 << 13) & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 3 | var38 >>> 13) & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      bba = var31;
      bbb = new Object[var31.length];
      int var25 = -1025671324;
      byte[] var23 = "[P\u001d\u009f##m@ÒÇ-ñ\u0099Worzï5Þ£WÈÝ¡?ª,\"á¹D\u001eÝ\u0018G#\u0085e\u009f1\u0001\u001c:pr\u001c¦ºu\u0005QhSvû§jöÓw\u008fï<\u0087rXB¾|\u0014må\u0000rÿf´¨\u0004m\u0095¤¶J\u0099F\u009cÉ;\u0089\u000152UâZÿ\u0010Ù½:A\u0082®o·Äñ~\u0096\u0012\u0015Oj\u0097ZÔhþÄ0¹H-8ü_Wzj\\ñ1\u008f\u0007\u009fþRPBë{\u008b{\u0092þ\u0018¼f\u0004Ì¬\u0004\u008e7ZÜa¹\u0086ö¶K÷ð¥\u0081\u008b½5a[Ö×\r\u0096UHm\u0019S&\u0090/`È\u001fz¤o°L±©=M\u0095mwa»u}´ê2µ\nß|nh\u001a :è\u0014QÝ!ß\n\u0082:ËñëÂ)\u0089Ó\u0088\u008fÐì~\u0080ÑM¸\u0001\u0013¨©-ç\fLÊ¹8W²IKî-I~:¶©®\u008fO \u0010È½\u0084û\u0090ù\u008e\u0001F<{\u0092\u0092Æú½Æ§8Óy `%\u0019J¨Ñ\u00892WÞ\u0099À¿Éà\u000bùÙØñÃTufeX£õ\u001cÇ°ÞºüpÙ\u0015âkj\u0083£ï+ .¡<}µÒj\u009d ³TpI\u0086Óxñ,/S\u0096^Ö[Y\u001a/N\u009c\u00830yíQ±ã\rÐB\u000bÖÑà\n\u00ad\bÓñ£ÎT©ú\u009d¸³î\u0087ù+ÝBí\u008co¸\u0013Ö¸kÒ¾>ò\u008aS\u007fíÅ¶ Ù}4±\u0083\u001cf(K½s\u0099Ü¼}¹·À\u009aj+\u0081i\u0093\u00988Ç\u0096zÕ\u007f¼*ùV~Ø0\u0012Å:1[¡,8[¥Ô\u008ez±Mê.â\u0081\u0091©Pö\u0093éÏM\u0091h\u0084äf\u0089ï\u001c\u009b¢H¹\u000eM\u0014\u0006\u0007\u000e\u0003\u0092\u000f\u0019\u000fíñ 1³«\u0096Î\u008bë8T]øvµ\u0097+\u008eúÄ\u0087A\u008f Øe\u0086f(>¾¿Ér³W¯¦'A\u0016;ÒãÑ7_ßv·ÒIfbxÞmJ\u0096ÛJ«\u0080(zE\u001aE\u001b\u001dËû m¥ñ¤\u000fWþýT\u0018jÙhû\nsÅÓÞxn\u0018§\"A\u0094)´N¡©JÝd\u009d\u0005Æ!b\u0087½ü9\u0002òAzxuµG\u0001\u001b\u001d\u0007*ðk´òì\"s\u0088Ãø|R\u0001Ç\u0017« \u001cF®q¦\bï£\u0095µZN\u001d@\u001cÝ\u000e`îZ\u00998PÏ¡ÿîÕw'V«[Ï\u0094ô\u00977ÂuS¹ÔÜ)?Cëºãè\u0016òç!=Ç\u0014\u00ad¤ÚGµ/#.U\u0017«Ç\b~\u0098\u008d\u0085oÈ&ßA\u0015ª*c6×$F¨!\u0007\u0098|§\u007fN<sp\u008b\u0001¿\u000f\u0001Ôæ¡ÛM\u0017\u0092\b\u0080ÌA\u008dD¥\u00adHÉý¹¨õ¼°Mrï\u0098\r2J7\r\u0010Ñ÷\u0098e\u009d;\u001a\u0092Ô!\u0088 \\óã»î\u0089»\u001f\u0010!Õ#±\u0083\u0016ÚZý\u0004w và\u0004À\bá§*o\u0007Nq3ù\u0010®\u0085S/\u001cJ$Âñ!\u001e\u008bº\u00123H\u0018ë´üþÅJìRái[\u0094¥lª\\\u0012zj¨²®\u001aöb\u0010Õ?j÷r\u0088ÔW±Q\u0000åugmgZ\u0087mXÍh\u009b\u001d·\u001c\u0005éÈÈ[®=M5\u0091\u0017DG\u0007\u008bOoLG\u009flvò\u008cx'P\u000bJøá¢W±\u000b\u0018À<»8%\u0087^¶cUpÉ£á\u0015}/%Ò\u001b¿\fLë\u001cm^\u0099±Að\u008e®cÉ\u009bE\u0097Mú=\r=\u0090r2\u001b\u0007´Z5fN\u000e-«\u009f{ßgù\u0019Mî_\u0083¥\u000bÂ3á7\u008e\u009e<QæKf:\nsn°ª\u000b)óücª¼\u0007\u0097M\u0093_dêB¬Ê9]Dÿ\u0081Ëí\u009fØ£\u000b#\u0003w9M\u0011\u0012îù\u008esöÐü\u0093|K¦\u008däÍ\u000bõ\u009e`.\u0019Þ?¶FÈtàX±2àHýÔÎ]åæTtï\"\u008byëoÁ>dôBQ\u001fÊ]æ¯\u0090I#VÞx\u0007¤s3ã\u008bRU\u0006\"ü\u0000£\u0096¯C_\u000fi¨^\u0000Îê¿¯tÃX\u0000\f¹ÁX}\u0001î\u0086)ÇJ\u0085ék\u001cÓÜáYó\u009bÒ\u0004¯IÎ\u0096'.\u0087\bD \u000eÄCMò,äE©]½AÓ\u009cÈJ²uBN 0Ìbýì)Ð9Ò\u008b\u001bö\t\"¾\u0082´\u001bþ\\Iñå\u0086\u001d!^\r\u008bÏ«\u0095íÎ²\u0019"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      bab = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         bab[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[3];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aba(-1677005033, 950962651, -537296308)).length();
      int var17 = a(-1956972970, var39 ^ 813935111);
      int var16 = -1;

      while (true) {
         char[] var65;
         label116: {
            char[] var48 = var18.substring(++var16, var16 + var17).toCharArray();
            int var10003 = var48.length;
            int var22 = 0;
            var65 = var48;
            var10001 = var10003;
            char[] var77;
            int var10004;
            if (var10003 <= 1) {
               var77 = var48;
               var10004 = var22;
            } else {
               var65 = var48;
               var10001 = var10003;
               if (var10003 <= var22) {
                  break label116;
               }

               var77 = var48;
               var10004 = var22;
            }

            while (true) {
               var77[var10004] = (char)(var77[var10004] ^ switch (var22 % a(-1956972975, var39 ^ 1032316746)) {
                  case 0 -> a(-1956972976, var39 ^ 2047376581);
                  case 1 -> a(-1956972973, var39 ^ 359875270);
                  case 2 -> a(-1956972974, var39 ^ -1564272337);
                  case 3 -> a(-1956972963, var39 ^ 1731876581);
                  case 4 -> a(-1956972964, var39 ^ 1137244776);
                  case 5 -> a(-1956972961, var39 ^ -1477977406);
                  default -> a(-1956972962, var39 ^ 1112437966);
               });
               var22++;
               if (var10001 == 0) {
                  var10004 = var10001;
                  var77 = var65;
               } else {
                  if (var10001 <= var22) {
                     break;
                  }

                  var77 = var65;
                  var10004 = var22;
               }
            }
         }

         String var84 = new String(var65).intern();
         int var55 = -1;
         var21[var19++] = var84;
         if ((var16 += var17) >= var20) {
            abb = var21;
            baa = new String[3];
            long var8 = 8410965799095452106L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12;
            int var13 = (var12 = aba(1003022867, -963533151, -537296307)).length();
            byte var10 = 0;

            label100:
            while (true) {
               var55 = var10;
               var10 += 8;
               String var44 = var12.substring(var55, var10);
               var55 = -1669338833;
               int var70 = -1750756936;
               int var85 = -537296306;
               byte[] var15 = var44.getBytes("ISO-8859-1");
               long[] var45 = var14;
               var55 = var11++;
               long var71 = (var15[0] & 255L) << a(-1956972967, var39 ^ -403036279)
                  | (var15[1] & 255L) << a(-1956972968, var39 ^ 459530523)
                  | (var15[2] & 255L) << a(-1956972965, var39 ^ 443303506)
                  | (var15[3] & 255L) << a(-1956972966, var39 ^ -71041950)
                  | (var15[4] & 255L) << a(-1956972955, var39 ^ 476873775)
                  | (var15[5] & 255L) << a(-1956972956, var39 ^ -2060126802)
                  | (var15[a(-1956972953, var39 ^ -1427463811)] & 255L) << a(-1956972954, var39 ^ 250175950)
                  | var15[a(-1956972959, var39 ^ 1488933978)] & 255L;
               byte var86 = -1;

               while (true) {
                  long var92 = var71 ^ var8;
                  switch (var86) {
                     case 0:
                        var45[var55] = var92;
                        if (var10 >= var13) {
                           aa = var14;
                           aab = new Integer[5];
                           long var0 = 7043263963594645697L;
                           long[] var6 = new long[3];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = aba(-1179876839, 1474439992, -537296311)).length();
                           byte var2 = 0;

                           do {
                              int var61 = var2;
                              var2 += 8;
                              var44 = var4.substring(var61, var2);
                              var61 = -2020834019;
                              int var74 = -366094045;
                              int var89 = -537296310;
                              byte[] var7 = var44.getBytes("ISO-8859-1");
                              var61 = var3++;
                              var92 = (
                                    (var7[0] & 255L) << a(-1956972949, var39 ^ 1956702725)
                                       | (var7[1] & 255L) << a(-1956972950, var39 ^ -1471850312)
                                       | (var7[2] & 255L) << a(-1956972939, var39 ^ -1763208352)
                                       | (var7[3] & 255L) << a(-1956972940, var39 ^ 1296971277)
                                       | (var7[4] & 255L) << a(-1956972937, var39 ^ -260606248)
                                       | (var7[5] & 255L) << a(-1956972938, var39 ^ 228420923)
                                       | (var7[a(-1956972943, var39 ^ 1498273441)] & 255L) << a(-1956972944, var39 ^ -811392218)
                                       | var7[a(-1956972941, var39 ^ -1448985936)] & 255L
                                 )
                                 ^ var0;
                              byte var90 = -1;
                              var6[var61] = var92;
                           } while (var2 < var5);

                           b = var6;
                           bb = new Long[3];
                           ab = new String[3];
                           aa();
                           ba = new bbbabaab();
                           aba = new bbbabaab();
                           a = new bbbabaab();
                           aaa = ba();
                           return;
                        }
                        break;
                     default:
                        var45[var55] = var92;
                        if (var10 < var13) {
                           continue label100;
                        }

                        var13 = (var12 = aba(-936294167, -1186138499, -537296305)).length();
                        var10 = 0;
                  }

                  int var59 = var10;
                  var10 += 8;
                  var44 = var12.substring(var59, var10);
                  var59 = 1322789902;
                  int var73 = 470359000;
                  int var88 = -537296312;
                  var15 = var44.getBytes("ISO-8859-1");
                  var45 = var14;
                  var55 = var11++;
                  var71 = (var15[0] & 255L) << a(-1956972960, var39 ^ 496964385)
                     | (var15[1] & 255L) << a(-1956972957, var39 ^ 1086570822)
                     | (var15[2] & 255L) << a(-1956972958, var39 ^ -766794234)
                     | (var15[3] & 255L) << a(-1956972947, var39 ^ 1277733016)
                     | (var15[4] & 255L) << a(-1956972948, var39 ^ -2144352915)
                     | (var15[5] & 255L) << a(-1956972945, var39 ^ 1753795853)
                     | (var15[a(-1956972946, var39 ^ 433178976)] & 255L) << a(-1956972951, var39 ^ -660291048)
                     | var15[a(-1956972952, var39 ^ 825149074)] & 255L;
                  var86 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   private static String b(int var0, int var1) {
      int var9 = 531006849;
      int var2 = (var0 ^ a(-1956972716, var9 ^ -396494645)) & a(-1956972713, var9 ^ -1289709775);
      if (baa[var2] == null) {
         char[] var3 = abb[var2].toCharArray();

         int var4 = switch (var3[0] & a(-1956972714, var9 ^ 815267019)) {
            case 0 -> a(-1956972719, var9 ^ 1001844772);
            case 1 -> a(-1956972720, var9 ^ 481956383);
            case 2 -> a(-1956972717, var9 ^ -1625760379);
            case 3 -> a(-1956972718, var9 ^ 1662058829);
            case 4 -> a(-1956972707, var9 ^ 215762392);
            case 5 -> a(-1956972708, var9 ^ -350677691);
            case 6 -> a(-1956972705, var9 ^ -129178782);
            case 7 -> a(-1956972706, var9 ^ -1487027510);
            case 8 -> a(-1956972711, var9 ^ 1131167249);
            case 9 -> a(-1956972712, var9 ^ 217529346);
            case 10 -> a(-1956972709, var9 ^ -1844187758);
            case 11 -> a(-1956972710, var9 ^ 2065410351);
            case 12 -> a(-1956972699, var9 ^ 22625928);
            case 13 -> a(-1956972700, var9 ^ -1491936650);
            case 14 -> a(-1956972697, var9 ^ -908261655);
            case 15 -> 4;
            case 16 -> 0;
            case 17 -> a(-1956972698, var9 ^ 348663629);
            case 18 -> a(-1956972703, var9 ^ 766618114);
            case 19 -> a(-1956972704, var9 ^ -364556182);
            case 20 -> 5;
            case 21 -> a(-1956972701, var9 ^ -98051335);
            case 22 -> a(-1956972702, var9 ^ 218051988);
            case 23 -> a(-1956972691, var9 ^ -791289139);
            case 24 -> a(-1956972692, var9 ^ -1579945780);
            case 25 -> a(-1956972689, var9 ^ -576823278);
            case 26 -> a(-1956972690, var9 ^ 234193693);
            case 27 -> a(-1956972695, var9 ^ -1066001147);
            case 28 -> a(-1956972696, var9 ^ 1332769409);
            case 29 -> a(-1956972693, var9 ^ 2034474232);
            case 30 -> a(-1956972694, var9 ^ 747060030);
            case 31 -> a(-1956972683, var9 ^ 445840483);
            case 32 -> a(-1956972684, var9 ^ 464927156);
            case 33 -> a(-1956972681, var9 ^ 932716561);
            case 34 -> a(-1956972682, var9 ^ -490117585);
            case 35 -> a(-1956972687, var9 ^ 1560029276);
            case 36 -> a(-1956972688, var9 ^ 1043985589);
            case 37 -> a(-1956972685, var9 ^ -1103690477);
            case 38 -> a(-1956972686, var9 ^ 2013027893);
            case 39 -> a(-1956972675, var9 ^ 1827185822);
            case 40 -> a(-1956972676, var9 ^ -1811227387);
            case 41 -> a(-1956972673, var9 ^ -559118917);
            case 42 -> a(-1956972674, var9 ^ 681805273);
            case 43 -> a(-1956972679, var9 ^ -299743421);
            case 44 -> a(-1956972680, var9 ^ -15814031);
            case 45 -> a(-1956972677, var9 ^ 451538319);
            case 46 -> a(-1956972678, var9 ^ 26287520);
            case 47 -> a(-1956972795, var9 ^ -1207034611);
            case 48 -> a(-1956972796, var9 ^ 1821768884);
            case 49 -> a(-1956972793, var9 ^ -647170808);
            case 50 -> a(-1956972794, var9 ^ -1633759052);
            case 51 -> a(-1956972799, var9 ^ -958735779);
            case 52 -> a(-1956972800, var9 ^ 270479359);
            case 53 -> a(-1956972797, var9 ^ -991580279);
            case 54 -> a(-1956972798, var9 ^ -1870369635);
            case 55 -> a(-1956972787, var9 ^ 788739146);
            case 56 -> a(-1956972788, var9 ^ 1332345907);
            case 57 -> a(-1956972785, var9 ^ -552533100);
            case 58 -> a(-1956972786, var9 ^ -807146755);
            case 59 -> a(-1956972791, var9 ^ -1238848280);
            case 60 -> a(-1956972792, var9 ^ -1898801540);
            case 61 -> a(-1956972789, var9 ^ 591736941);
            case 62 -> a(-1956972790, var9 ^ -170505732);
            case 63 -> a(-1956972779, var9 ^ -419566035);
            case 64 -> a(-1956972780, var9 ^ 653935035);
            case 65 -> a(-1956972777, var9 ^ 1028249573);
            case 66 -> a(-1956972778, var9 ^ -1190595443);
            case 67 -> a(-1956972783, var9 ^ -148952772);
            case 68 -> a(-1956972784, var9 ^ -2075539120);
            case 69 -> a(-1956972781, var9 ^ -445176468);
            case 70 -> a(-1956972782, var9 ^ -789566371);
            case 71 -> a(-1956972771, var9 ^ 2047608701);
            case 72 -> a(-1956972772, var9 ^ 150277715);
            case 73 -> a(-1956972769, var9 ^ 1275861541);
            case 74 -> a(-1956972770, var9 ^ -720163614);
            case 75 -> a(-1956972775, var9 ^ 127055841);
            case 76 -> 1;
            case 77 -> a(-1956972776, var9 ^ -2040438867);
            case 78 -> a(-1956972773, var9 ^ -2017239475);
            case 79 -> a(-1956972774, var9 ^ 1592829274);
            case 80 -> a(-1956972763, var9 ^ -1736966749);
            case 81 -> a(-1956972764, var9 ^ -878975280);
            case 82 -> a(-1956972761, var9 ^ -774209703);
            case 83 -> a(-1956972762, var9 ^ 349100243);
            case 84 -> a(-1956972767, var9 ^ -298810459);
            case 85 -> a(-1956972768, var9 ^ 1039264386);
            case 86 -> a(-1956972765, var9 ^ -1532426658);
            case 87 -> 3;
            case 88 -> a(-1956972766, var9 ^ -1142496692);
            case 89 -> a(-1956972755, var9 ^ -1889640220);
            case 90 -> a(-1956972756, var9 ^ -717278476);
            case 91 -> a(-1956972753, var9 ^ 496903990);
            case 92 -> a(-1956972754, var9 ^ -1969280880);
            case 93 -> a(-1956972759, var9 ^ -505164265);
            case 94 -> a(-1956972760, var9 ^ 2107784345);
            case 95 -> a(-1956972757, var9 ^ -837053459);
            case 96 -> a(-1956972758, var9 ^ 754330262);
            case 97 -> a(-1956972747, var9 ^ 2094662340);
            case 98 -> a(-1956972748, var9 ^ -1911339417);
            case 99 -> a(-1956972745, var9 ^ 1813122909);
            case 100 -> a(-1956972746, var9 ^ 2048593773);
            case 101 -> a(-1956972751, var9 ^ -2102579698);
            case 102 -> a(-1956972752, var9 ^ 466189297);
            case 103 -> a(-1956972749, var9 ^ -676135826);
            case 104 -> a(-1956972750, var9 ^ -1599029871);
            case 105 -> a(-1956972739, var9 ^ 464666080);
            case 106 -> a(-1956972740, var9 ^ -1304044131);
            case 107 -> a(-1956972737, var9 ^ 1253635766);
            case 108 -> a(-1956972738, var9 ^ -282256898);
            case 109 -> a(-1956972743, var9 ^ 1344559730);
            case 110 -> a(-1956972744, var9 ^ -1003729410);
            case 111 -> a(-1956972741, var9 ^ -1143835446);
            case 112 -> a(-1956972742, var9 ^ -444022244);
            case 113 -> a(-1956972603, var9 ^ -574067486);
            case 114 -> a(-1956972604, var9 ^ 198910486);
            case 115 -> a(-1956972601, var9 ^ -1056384433);
            case 116 -> a(-1956972602, var9 ^ -1834740634);
            case 117 -> a(-1956972607, var9 ^ 1996173568);
            case 118 -> a(-1956972608, var9 ^ 806054652);
            case 119 -> a(-1956972605, var9 ^ -370530659);
            case 120 -> a(-1956972606, var9 ^ 26014294);
            case 121 -> a(-1956972595, var9 ^ 389377865);
            case 122 -> a(-1956972596, var9 ^ -1242405918);
            case 123 -> a(-1956972593, var9 ^ -1990859817);
            case 124 -> a(-1956972594, var9 ^ 524629914);
            case 125 -> a(-1956972599, var9 ^ -2008146300);
            case 126 -> a(-1956972600, var9 ^ -1922433270);
            case 127 -> a(-1956972597, var9 ^ 2119766446);
            case 128 -> a(-1956972598, var9 ^ 322455972);
            case 129 -> a(-1956972587, var9 ^ -1392297715);
            case 130 -> a(-1956972588, var9 ^ -1484301651);
            case 131 -> a(-1956972585, var9 ^ -1461845975);
            case 132 -> a(-1956972586, var9 ^ 1023032452);
            case 133 -> a(-1956972591, var9 ^ 1548784006);
            case 134 -> a(-1956972592, var9 ^ -2007287249);
            case 135 -> a(-1956972589, var9 ^ -251587464);
            case 136 -> a(-1956972590, var9 ^ 2140609053);
            case 137 -> a(-1956972579, var9 ^ -9860647);
            case 138 -> a(-1956972580, var9 ^ -886664633);
            case 139 -> a(-1956972577, var9 ^ 883222974);
            case 140 -> a(-1956972578, var9 ^ 1864476269);
            case 141 -> a(-1956972583, var9 ^ 744169557);
            case 142 -> a(-1956972584, var9 ^ 287461141);
            case 143 -> a(-1956972581, var9 ^ 1359586522);
            case 144 -> a(-1956972582, var9 ^ -489572255);
            case 145 -> a(-1956972571, var9 ^ 632002497);
            case 146 -> a(-1956972572, var9 ^ 712070470);
            case 147 -> a(-1956972569, var9 ^ 1099494489);
            case 148 -> a(-1956972570, var9 ^ 277685753);
            case 149 -> a(-1956972575, var9 ^ 1590490671);
            case 150 -> a(-1956972576, var9 ^ -478602699);
            case 151 -> a(-1956972573, var9 ^ 373262729);
            case 152 -> a(-1956972574, var9 ^ 919408382);
            case 153 -> a(-1956972563, var9 ^ 1853070086);
            case 154 -> a(-1956972564, var9 ^ -1446149970);
            case 155 -> a(-1956972561, var9 ^ 1903558518);
            case 156 -> a(-1956972562, var9 ^ -1716019071);
            case 157 -> a(-1956972567, var9 ^ 1642143879);
            case 158 -> a(-1956972568, var9 ^ -268989972);
            case 159 -> a(-1956972565, var9 ^ 1767948087);
            case 160 -> a(-1956972566, var9 ^ -1244970377);
            case 161 -> a(-1956972555, var9 ^ -1325242326);
            case 162 -> a(-1956972556, var9 ^ 1116664092);
            case 163 -> a(-1956972553, var9 ^ 295074668);
            case 164 -> a(-1956972554, var9 ^ 2021016169);
            case 165 -> a(-1956972559, var9 ^ -1859441869);
            case 166 -> a(-1956972560, var9 ^ -609862803);
            case 167 -> a(-1956972557, var9 ^ 1895568657);
            case 168 -> a(-1956972558, var9 ^ -66504930);
            case 169 -> a(-1956972547, var9 ^ -2130242727);
            case 170 -> a(-1956972548, var9 ^ 1998900272);
            case 171 -> a(-1956972545, var9 ^ -245622224);
            case 172 -> a(-1956972546, var9 ^ 626253594);
            case 173 -> a(-1956972551, var9 ^ -382970536);
            case 174 -> a(-1956972552, var9 ^ -1333621011);
            case 175 -> a(-1956972549, var9 ^ 1102142679);
            case 176 -> a(-1956972550, var9 ^ -1704797839);
            case 177 -> a(-1956972667, var9 ^ -208790383);
            case 178 -> a(-1956972668, var9 ^ -1415906099);
            case 179 -> a(-1956972665, var9 ^ -359458462);
            case 180 -> a(-1956972666, var9 ^ -1178904078);
            case 181 -> a(-1956972671, var9 ^ 471095623);
            case 182 -> a(-1956972672, var9 ^ -2016097225);
            case 183 -> a(-1956972669, var9 ^ -887599381);
            case 184 -> a(-1956972670, var9 ^ -2113741747);
            case 185 -> a(-1956972659, var9 ^ 181450615);
            case 186 -> a(-1956972660, var9 ^ -1196757350);
            case 187 -> a(-1956972657, var9 ^ 1174569229);
            case 188 -> a(-1956972658, var9 ^ -408927604);
            case 189 -> a(-1956972663, var9 ^ 215896136);
            case 190 -> a(-1956972664, var9 ^ 1985328328);
            case 191 -> a(-1956972661, var9 ^ -1775520327);
            case 192 -> a(-1956972662, var9 ^ 2085376733);
            case 193 -> a(-1956972651, var9 ^ 655404192);
            case 194 -> a(-1956972652, var9 ^ -123336944);
            case 195 -> a(-1956972649, var9 ^ 1248424133);
            case 196 -> 2;
            case 197 -> a(-1956972650, var9 ^ -1493022058);
            case 198 -> a(-1956972655, var9 ^ -332306651);
            case 199 -> a(-1956972656, var9 ^ 1321787414);
            case 200 -> a(-1956972653, var9 ^ -1461314037);
            case 201 -> a(-1956972654, var9 ^ 79838478);
            case 202 -> a(-1956972643, var9 ^ -1031391132);
            case 203 -> a(-1956972644, var9 ^ 170995361);
            case 204 -> a(-1956972641, var9 ^ -23987710);
            case 205 -> a(-1956972642, var9 ^ -1606335428);
            case 206 -> a(-1956972647, var9 ^ 1766433634);
            case 207 -> a(-1956972648, var9 ^ -554237118);
            case 208 -> a(-1956972645, var9 ^ 119779693);
            case 209 -> a(-1956972646, var9 ^ 827208564);
            case 210 -> a(-1956972635, var9 ^ -783413951);
            case 211 -> a(-1956972636, var9 ^ 1052264926);
            case 212 -> a(-1956972633, var9 ^ 1244052580);
            case 213 -> a(-1956972634, var9 ^ -1636238396);
            case 214 -> a(-1956972639, var9 ^ 454477116);
            case 215 -> a(-1956972640, var9 ^ 308564513);
            case 216 -> a(-1956972637, var9 ^ 424417444);
            case 217 -> a(-1956972638, var9 ^ -917560482);
            case 218 -> a(-1956972627, var9 ^ -631541030);
            case 219 -> a(-1956972628, var9 ^ 1567206655);
            case 220 -> a(-1956972625, var9 ^ -193665679);
            case 221 -> a(-1956972626, var9 ^ 1323526273);
            case 222 -> a(-1956972631, var9 ^ 1845941081);
            case 223 -> a(-1956972632, var9 ^ -532676393);
            case 224 -> a(-1956972629, var9 ^ -1618955007);
            case 225 -> a(-1956972630, var9 ^ 722235486);
            case 226 -> a(-1956972619, var9 ^ 1302091920);
            case 227 -> a(-1956972620, var9 ^ -1119929995);
            case 228 -> a(-1956972617, var9 ^ -812509931);
            case 229 -> a(-1956972618, var9 ^ -661833810);
            case 230 -> a(-1956972623, var9 ^ -848903476);
            case 231 -> a(-1956972624, var9 ^ -1407297082);
            case 232 -> a(-1956972621, var9 ^ -967743784);
            case 233 -> a(-1956972622, var9 ^ 1368854117);
            case 234 -> a(-1956972611, var9 ^ 812473238);
            case 235 -> a(-1956972612, var9 ^ -37998710);
            case 236 -> a(-1956972609, var9 ^ 836390217);
            case 237 -> a(-1956972610, var9 ^ -1199777869);
            case 238 -> a(-1956972615, var9 ^ 1575052806);
            case 239 -> a(-1956972616, var9 ^ 1638779509);
            case 240 -> a(-1956972613, var9 ^ 130359006);
            case 241 -> a(-1956972614, var9 ^ 1814636272);
            case 242 -> a(-1956972987, var9 ^ -427204968);
            case 243 -> a(-1956972988, var9 ^ -1512098239);
            case 244 -> a(-1956972985, var9 ^ -366689657);
            case 245 -> a(-1956972986, var9 ^ -981716673);
            case 246 -> a(-1956972991, var9 ^ 344956540);
            case 247 -> a(-1956972992, var9 ^ 191343610);
            case 248 -> a(-1956972989, var9 ^ -1647392251);
            case 249 -> a(-1956972990, var9 ^ -181897687);
            case 250 -> a(-1956972979, var9 ^ 555358269);
            case 251 -> a(-1956972980, var9 ^ 1154330097);
            case 252 -> a(-1956972977, var9 ^ 634750267);
            case 253 -> a(-1956972978, var9 ^ -983622095);
            case 254 -> a(-1956972983, var9 ^ -607676187);
            default -> a(-1956972984, var9 ^ -1547881081);
         };
         int var5 = (var1 & a(-1956972981, var9 ^ 1342007908)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-1956972982, var9 ^ 283676723)) >>> a(-1956972971, var9 ^ 244475581)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-1956972972, var9 ^ 517898499);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-1956972969, var9 ^ 197571482);
            }
         }

         baa[var2] = new String(var3).intern();
      }

      return baa[var2];
   }

   private static int a(int var0, int var1) {
      int var2 = bab[var0 ^ -1956972731] ^ var1 ^ var0;
      var2 -= 16122;
      var2 -= 16807;
      var2 -= 16113;
      var2 -= 31247;
      var2 -= 6992;
      var2 -= 35157;
      var2 += 20272;
      var2 -= 4515;
      return var2 ^ 47164;
   }
}
