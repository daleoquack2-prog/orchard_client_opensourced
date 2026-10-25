package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bbbaa {
   private static final String[] bab;
   public static final bbbaa aa;
   private static final Integer[] ab;
   private static final String[] ba;
   private static String[] bb;
   private static final int[] baa;
   private static final bbbaa[] b;
   private static final Object[] bba;
   private static final long[] a;
   private static final Long[] aaa;
   private static final String[] aab;
   public static final bbbaa aba;
   private static final long[] abb;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-605903829, 71202469 ^ 1180924314);
      if (ab[var3] == null) {
         ab[var3] = (int)(a[var3] ^ var1);
      }

      return ab[var3];
   }

   public static bbbaa ab(String var0) {
      return Enum.valueOf(bbbaa.class, var0);
   }

   private static long ba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-605903830, -644798842 ^ 899428045)) & a(-605903831, -644798842 ^ -1010063680);
      if (aaa[var3] == null) {
         aaa[var3] = abb[var3] ^ var1;
      }

      return aaa[var3];
   }

   private static void bb() {
      int var0 = 65982327;
      bb[0] = aaa(
         aab(a(-605903832, var0 ^ -62830431), a(-605903825, var0 ^ 570872317)).toCharArray(),
         ba(a(-605903826, var0 ^ 2017164946), 2713904837210583666L),
         aa(a(-605903827, var0 ^ 23493725), 5233600345315492347L)
      );
      bb[1] = aaa(
         aab(a(-605903828, var0 ^ 1356576012), a(-605903837, var0 ^ -140179242)).toCharArray(),
         ba(a(-605903838, var0 ^ 682433131), 282828135953788449L),
         aa(a(-605903839, var0 ^ 511699971), 8278835367964554122L)
      );
   }

   private static bbbaa[] b() {
      return new bbbaa[]{aba, aa};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = 8696730;
      int var32 = 0;
      int var33 = 0;
      String[] var31 = new String[7];
      int var30 = "#社\ue219\uf5f0蓽ק珰핗㿺侤悗\ufe75ᨪ芿ᩞ\uf54f潹꿉\ue2ff胂ಇ鐣״菐ਗ䥞汪䦤奘ᢥ煄㼏༢\ue677죋\udf79\u0010ᦣ瀨ᴗ\uf366Ḍ郟ᤛ뎝ᷧ卧Ṍナᨫ뀬\u1977㍦\n偦씖倲ԇ樱┗櫆藽欢蔇\u0010펖܀퀚쟬흹蜎\ueb2e✉흲\ue7eb횙蟣퀦䜂ힲꟷ\n롚㚶롎\uece6ላ쳷ጼ氝ፘ泧\u0010资ᇜ袈躊输캋貔깭袐⺘援캙衬\uf1dd賰躻\n⎌泝⎘궉䣛趜俬\u2d76䢈ⶔ"
         .length();
      String var29 = "#社\ue219\uf5f0蓽ק珰핗㿺侤悗\ufe75ᨪ芿ᩞ\uf54f潹꿉\ue2ff胂ಇ鐣״菐ਗ䥞汪䦤奘ᢥ煄㼏༢\ue677죋\udf79\u0010ᦣ瀨ᴗ\uf366Ḍ郟ᤛ뎝ᷧ卧Ṍナᨫ뀬\u1977㍦\n偦씖倲ԇ樱┗櫆藽欢蔇\u0010펖܀퀚쟬흹蜎\ueb2e✉흲\ue7eb횙蟣퀦䜂ힲꟷ\n롚㚶롎\uece6ላ쳷ጼ氝ፘ泧\u0010资ᇜ袈躊输캋貔깭袐⺘援캙衬\uf1dd賰躻\n⎌泝⎘궉䣛趜俬\u2d76䢈ⶔ";
      short var34 = 3680;

      do {
         int var37 = 0;
         char var35 = var29.charAt(var33);
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            int var38 = var36[var37];

            var38 = (char)(switch (var37 % 6) {
               default -> 199;
               case 1 -> 85;
               case 2 -> 227;
               case 3 -> 168;
               case 4 -> 56;
               case 5 -> 191;
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

      bab = var31;
      bba = new Object[var31.length];
      int var25 = 1320754312;
      byte[] var23 = "(ù¡»\u0086¨À*pÿÑ&\u0095\n\u0080\u0087KL\u0093R\u0011q\u000b\u0011h-ÜÑ9\u0090})\u009eí\u009c\u009cAæ³\u0016w5\u009eqß\b\u0080\u0085«îòTªÌã´',vÊ\u001f\bÉÇ\u009b«à×zÎÈ½IµEþ\u001f\u0017ð\u0002Nl\u009e+\u0004\u0085p\u0005\u0089?þGÔÞ§tHÆvo\"ëÝ\u0006\u009f\u00ad«ì(~âè\u0080ÛàZY'\u009a\u007fz®<ÛuÞÅ:\u008e9.PþCZçê0 ôqê\u0094Úå=¶d\u001fE\u0006\u0013od%\u0011\u0007/þèEàòZÚ7\u0095ãa\u0011\u0001DÈ\u0093ãö%kÎ\u00887¨3»\u0019%g»BçÝ*d<\u0087ëÉº\u0088åEu\u0006\u0015æõy÷\u0088Æ¶\u0006[^n\u008b\u001f£w XÞ£É+5¢p4V\u001cJØ\u007f\\*,\u00ad\u001f\u009aÖa\u001c°\f\u0002U\f°gVo\u0007þ¾c\u000fçÉrOÑhh\u0085Fû4ÁÄ\u001d¼§\n\u0001b\u0086ü0Mcû±ø\u0092í\nn\u0083y\u0003Æwe¯ï¾¯\u008c\u0010\u0019Ð]õ\u00168AvýË-<\u0003ó%1K«Æ\u0086\u0090Í²#ó\u009ejfÂ\u007fÞVz+È\u0083±èîb%*×\u0016?¼#Ðp¼òhIVt£³ÚÞ¯\f¼çjÀo6üåÂ¬ðKÁL\u008eÑ|º\u009cªd\u0083m~\u0088ÅN~±8Gì\u0082\u0085fW\r\u00937¡è\u0080s\u0081à¸ìp\u0002wðr\u0018-\u000b\u009dë;©pE!\u008b×\u008fÁÒ\u009e\u001fû\u001c\u00adÿ\u0096\u0092¬óz\u0095\u009f\u0002\u000b´\u0098ñ\u0083%\u0095\u008cH\u0006\u009e\u001db¯\u0016âl\u0018/S\u0082\u0015L\u0011öp³k\u0091=ânq\tu`îÇ\u001b\u009aC\n¤ Ãî\u001dDo\u0097Zcæ´VCèX\"\u008b+\u009aVN¥q''^ðY7'>U\u009d2~ñb¥\t\u0087`¥câï\u0015\u0097\u009fÃI\u0089\u0007\u009b1\u0096\u008b\r\f9\u0096O Ò\u009c\u0088Jí@ ë\"¿s\u0094P&ã\u0018\n\u0017üþ\u008b¡(;yoÎý\u008a\u000bÿ\rz±v£x¹v¥/\r)8*Á4©6\tEð\u0083¾\u0014\u008f\u0004ÀñÀÈ\u00970Ô?Î¶cê?\u001b}s\u0005\u001f\u009dù\u008dô,õòµÓÆ5\\`4Äµ\u0094\u008fõ2\u0094ç·{\u0007\u0080þMïeá¼l\u0017+\u009a èÒ\u000b×G\u0015Ã\u0004öÌ9\u009cù\u008d`¿\u009bàÊ\u0084vÓ\u0003iÁ\b î¿¹\u0006\u009f®ÒoÆû?S\u007f\u008cDa7Ó2|ç~Wê\u00adHÎ®\u0088ÆÊ\u0096\u0082Ú\u0094\u000070¨â¦\u0080I#Ò\u000fº \u0097¡Ôã\u0015dhò¯1\u008b\u008c\u001dTkÎn=\u0013-\t\u0092váeáLE[û\u009a\bpé[û|éàëf?s\u00921©ÐñÂÂKMé{ÉQç\u0083Æ÷Ë2e!¶ÊlÎ\u00977\u000b·k9\u009f\u0095¹Ð\u009f$¾%éB\\êQw\u0003í÷-UWÆ´!r<3C\u000eL»¯¸!\u0018\u008c¤\u0017à+\u009cuõ,yûÉ\u008dÎP®éýR1¸çþÔù}\u009aè\u0084\u009cÿÊch§\u0002xA\u001a \f¡i\u000e£¢\u0014Ê\u0018\u009aÙÊ\u0014O£\u0097{Æ;@\u008dH\u0004éùR\u0098 \u009e#\u0092%\rÄ8\u0012øEý¸i2\u008eü¿\u0001¾\\¢n°\u0097×^Ô!\u0003æ)vÿMF\u008f;\u001f¬\rÜ·\f\u009bv3 EáÌåF\u0085»½L/¢ýèÛA£\f\u0086\u0007\u0018\u0087;\u0081]\tÒ²í\u0097e÷ù´§«â@®ª\u007f\u0099\u008a\u0004v{\u00ad=ù@/=2²Ì*Ø\u0081,ë\bqx#µUUÞã]\u0007\u008dGþÄ ÷ÿ\u008c\u0085\u0080Y¸7yIïê\u0004\u000f\u0005cL»\u0090Âø\u00029ß÷ç\u008e\u0098\u0084÷í)=\nÍÈ_\u0098Ð\r2ÓE\u0018Ud-\u001f½ò»ÿâERYøAíG\u000bßÍÎÏ\bÝ\u0000\u008búq¶Ì:ÝÝ}\u0019OxÏØUkVI¾þ.]£lã¤¨\u008a¹\bT¹.\u0016\u0087ä§.+É1\u0090\u00adïõÕ¬!\u0090\"Sc¶´\u009cÈ\u0003ï°ÿC0m\u0012SV¢N$\u0091\u008fï\u0095f_\u008c\u0092=\u0014\u0002\u001crb\u008aã\u0098\u0018Ý¬Øê\u008b'¤¿nÎoïú\u0011{u%ÈA@\u0099\u0085Ü-º¶\u0092\u009fOÊÈQ`\u0084ÓÃ¥;ü½Ú"
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

      String[] var21 = new String[2];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aba(9798, var39 ^ -645735948, 50124)).length();
      int var17 = a(-605903840, var39 ^ -1255546364);
      int var16 = -1;

      while (true) {
         char[] var64;
         label115: {
            char[] var10001 = var18.substring(++var16, var16 + var17).toCharArray();
            int var10003 = var10001.length;
            int var22 = 0;
            var64 = var10001;
            int var50 = var10003;
            char[] var76;
            int var10004;
            if (var10003 <= 1) {
               var76 = var10001;
               var10004 = var22;
            } else {
               var64 = var10001;
               var50 = var10003;
               if (var10003 <= var22) {
                  break label115;
               }

               var76 = var10001;
               var10004 = var22;
            }

            while (true) {
               var76[var10004] = (char)(var76[var10004] ^ switch (var22 % a(-605903833, var39 ^ -1043361576)) {
                  case 0 -> a(-605903834, var39 ^ -1058176550);
                  case 1 -> a(-605903835, var39 ^ 1292702888);
                  case 2 -> a(-605903836, var39 ^ 1965665156);
                  case 3 -> a(-605903813, var39 ^ -242580889);
                  case 4 -> a(-605903814, var39 ^ 284142131);
                  case 5 -> a(-605903815, var39 ^ 596911983);
                  default -> a(-605903816, var39 ^ 1966510711);
               });
               var22++;
               if (var50 == 0) {
                  var10004 = var50;
                  var76 = var64;
               } else {
                  if (var50 <= var22) {
                     break;
                  }

                  var76 = var64;
                  var10004 = var22;
               }
            }
         }

         String var83 = new String(var64).intern();
         int var54 = -1;
         var21[var19++] = var83;
         if ((var16 += var17) >= var20) {
            ba = var21;
            aab = new String[2];
            long var8 = 2317211086245296761L;
            long[] var14 = new long[4];
            int var11 = 0;
            String var12;
            int var13 = (var12 = aba(18356, var39 ^ -885013547, 50125)).length();
            byte var10 = 0;

            label99:
            while (true) {
               var54 = var10;
               var10 += 8;
               String var44 = var12.substring(var54, var10);
               var54 = (short)28249;
               int var69 = var39 ^ -1720517308;
               char var84 = '쏎';
               byte[] var15 = var44.getBytes("ISO-8859-1");
               long[] var45 = var14;
               var54 = var11++;
               long var70 = (var15[0] & 255L) << a(-605903809, var39 ^ 609090702)
                  | (var15[1] & 255L) << a(-605903810, var39 ^ 1856246457)
                  | (var15[2] & 255L) << a(-605903811, var39 ^ -484533008)
                  | (var15[3] & 255L) << a(-605903812, var39 ^ -1090533894)
                  | (var15[4] & 255L) << a(-605903821, var39 ^ 585569510)
                  | (var15[5] & 255L) << a(-605903822, var39 ^ 1221246870)
                  | (var15[a(-605903823, var39 ^ -175322767)] & 255L) << a(-605903824, var39 ^ 1113555058)
                  | var15[a(-605903817, var39 ^ -352681274)] & 255L;
               byte var85 = -1;

               while (true) {
                  long var91 = var70 ^ var8;
                  switch (var85) {
                     case 0:
                        var45[var54] = var91;
                        if (var10 >= var13) {
                           a = var14;
                           ab = new Integer[4];
                           long var0 = 8198413818461675657L;
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = aba(20540, var39 ^ -1308589068, 50121)).length();
                           byte var2 = 0;

                           do {
                              int var60 = var2;
                              var2 += 8;
                              var44 = var4.substring(var60, var2);
                              var60 = (short)11248;
                              int var73 = var39 ^ -1850542821;
                              char var88 = '쏊';
                              byte[] var7 = var44.getBytes("ISO-8859-1");
                              var60 = var3++;
                              var91 = (
                                    (var7[0] & 255L) << a(-605903859, var39 ^ 88426374)
                                       | (var7[1] & 255L) << a(-605903860, var39 ^ 1829674086)
                                       | (var7[2] & 255L) << a(-605903869, var39 ^ 801214675)
                                       | (var7[3] & 255L) << a(-605903870, var39 ^ -1340672173)
                                       | (var7[4] & 255L) << a(-605903871, var39 ^ 187720703)
                                       | (var7[5] & 255L) << a(-605903872, var39 ^ -1565359788)
                                       | (var7[a(-605903865, var39 ^ 1330293795)] & 255L) << a(-605903866, var39 ^ 1569280279)
                                       | var7[a(-605903867, var39 ^ 1929643285)] & 255L
                                 )
                                 ^ var0;
                              byte var89 = -1;
                              var6[var60] = var91;
                           } while (var2 < var5);

                           abb = var6;
                           aaa = new Long[2];
                           bb = new String[2];
                           bb();
                           aba = new bbbaa();
                           aa = new bbbaa();
                           b = b();
                           return;
                        }
                        break;
                     default:
                        var45[var54] = var91;
                        if (var10 < var13) {
                           continue label99;
                        }

                        var13 = (var12 = aba(6242, var39 ^ 1059639320, 50127)).length();
                        var10 = 0;
                  }

                  short var58 = var10;
                  var10 += 8;
                  var44 = var12.substring(var58, var10);
                  var58 = 6718;
                  int var72 = var39 ^ -1307147280;
                  char var87 = '쏈';
                  var15 = var44.getBytes("ISO-8859-1");
                  var45 = var14;
                  var54 = var11++;
                  var70 = (var15[0] & 255L) << a(-605903818, var39 ^ 856094931)
                     | (var15[1] & 255L) << a(-605903819, var39 ^ 277831276)
                     | (var15[2] & 255L) << a(-605903820, var39 ^ 536848260)
                     | (var15[3] & 255L) << a(-605903861, var39 ^ -468169495)
                     | (var15[4] & 255L) << a(-605903862, var39 ^ -1805502377)
                     | (var15[5] & 255L) << a(-605903863, var39 ^ -2146352545)
                     | (var15[a(-605903864, var39 ^ 466351742)] & 255L) << a(-605903857, var39 ^ -1893935935)
                     | var15[a(-605903858, var39 ^ 1969513654)] & 255L;
                  var85 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   private static String aaa(char[] var0, long var1, int var3) {
      int var4 = aa(a(-605903868, -1219722163 ^ -1626461947), 8517702171286929225L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aa(a(-605903845, -1219722163 ^ -1177243641), 1505854972608855310L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String aba(int var0, int var1, int var2) {
      int var3 = var2 ^ 50124;
      char[] var4 = bab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 3420;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 27925;
         var10 ^= 55614;
         var10 += 35807;
         var10 ^= 35181;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = baa[var0 ^ -605903829] ^ var1 ^ var0;
      var2 ^= 1532;
      var2 += 20624;
      var2 += 52681;
      var2 -= 11640;
      var2 -= 44237;
      var2 ^= 21505;
      var2 -= 34651;
      var2 -= 16193;
      var2 += 64860;
      return var2 + 58607;
   }

   private static String aab(int var0, int var1) {
      int var9 = 1300403662;
      int var2 = (var0 ^ a(-605903846, var9 ^ -291694008)) & a(-605903847, var9 ^ 1649623691);
      if (aab[var2] == null) {
         char[] var3 = ba[var2].toCharArray();

         int var4 = switch (var3[0] & a(-605903848, var9 ^ -1043186584)) {
            case 0 -> a(-605903841, var9 ^ -1344146501);
            case 1 -> a(-605903842, var9 ^ 2088315476);
            case 2 -> a(-605903843, var9 ^ 948187908);
            case 3 -> a(-605903844, var9 ^ 2147084198);
            case 4 -> a(-605903853, var9 ^ 202565150);
            case 5 -> a(-605903854, var9 ^ 326195350);
            case 6 -> a(-605903855, var9 ^ -11003477);
            case 7 -> a(-605903856, var9 ^ 193616440);
            case 8 -> a(-605903849, var9 ^ -247048127);
            case 9 -> a(-605903850, var9 ^ 723849510);
            case 10 -> a(-605903851, var9 ^ -1757408632);
            case 11 -> a(-605903852, var9 ^ 551156703);
            case 12 -> a(-605903765, var9 ^ 683707540);
            case 13 -> a(-605903766, var9 ^ 1760963793);
            case 14 -> a(-605903767, var9 ^ -1570652361);
            case 15 -> a(-605903768, var9 ^ -421307938);
            case 16 -> a(-605903761, var9 ^ -2144516989);
            case 17 -> a(-605903762, var9 ^ -1579453334);
            case 18 -> a(-605903763, var9 ^ 1155331561);
            case 19 -> 2;
            case 20 -> a(-605903764, var9 ^ -1245032530);
            case 21 -> a(-605903773, var9 ^ -1537325123);
            case 22 -> a(-605903774, var9 ^ 1346562601);
            case 23 -> a(-605903775, var9 ^ -1719089143);
            case 24 -> a(-605903776, var9 ^ 1056381336);
            case 25 -> a(-605903769, var9 ^ 824116699);
            case 26 -> a(-605903770, var9 ^ -622040826);
            case 27 -> a(-605903771, var9 ^ 617898219);
            case 28 -> a(-605903772, var9 ^ 1821147825);
            case 29 -> a(-605903749, var9 ^ -1209337889);
            case 30 -> a(-605903750, var9 ^ -726061517);
            case 31 -> a(-605903751, var9 ^ -447178009);
            case 32 -> a(-605903752, var9 ^ 1561103566);
            case 33 -> a(-605903745, var9 ^ -1764775405);
            case 34 -> a(-605903746, var9 ^ 34444045);
            case 35 -> a(-605903747, var9 ^ 412837708);
            case 36 -> a(-605903748, var9 ^ 1469822710);
            case 37 -> a(-605903757, var9 ^ 1852911951);
            case 38 -> a(-605903758, var9 ^ -1795318971);
            case 39 -> a(-605903759, var9 ^ 731620147);
            case 40 -> a(-605903760, var9 ^ -414682421);
            case 41 -> a(-605903753, var9 ^ -1025119975);
            case 42 -> a(-605903754, var9 ^ 1827014893);
            case 43 -> a(-605903755, var9 ^ -161743204);
            case 44 -> a(-605903756, var9 ^ -1924938076);
            case 45 -> a(-605903797, var9 ^ 1504674289);
            case 46 -> a(-605903798, var9 ^ 1503034399);
            case 47 -> a(-605903799, var9 ^ -878329473);
            case 48 -> a(-605903800, var9 ^ 1881855918);
            case 49 -> a(-605903793, var9 ^ -2033204117);
            case 50 -> a(-605903794, var9 ^ -1496843191);
            case 51 -> a(-605903795, var9 ^ 1462055834);
            case 52 -> a(-605903796, var9 ^ 1430219124);
            case 53 -> a(-605903805, var9 ^ -1161003080);
            case 54 -> a(-605903806, var9 ^ 1466066193);
            case 55 -> a(-605903807, var9 ^ -257391176);
            case 56 -> a(-605903808, var9 ^ -1187463324);
            case 57 -> a(-605903801, var9 ^ -1965501774);
            case 58 -> a(-605903802, var9 ^ -1949024734);
            case 59 -> a(-605903803, var9 ^ -1205514308);
            case 60 -> a(-605903804, var9 ^ -1076443228);
            case 61 -> a(-605903781, var9 ^ -1297413021);
            case 62 -> a(-605903782, var9 ^ -1187371327);
            case 63 -> a(-605903783, var9 ^ 835004552);
            case 64 -> a(-605903784, var9 ^ 141870722);
            case 65 -> a(-605903777, var9 ^ 1798746640);
            case 66 -> a(-605903778, var9 ^ -1806904104);
            case 67 -> a(-605903779, var9 ^ -985057922);
            case 68 -> a(-605903780, var9 ^ 1380428459);
            case 69 -> a(-605903789, var9 ^ 1019021063);
            case 70 -> a(-605903790, var9 ^ -2088269956);
            case 71 -> a(-605903791, var9 ^ 979577830);
            case 72 -> a(-605903792, var9 ^ 2101649983);
            case 73 -> a(-605903785, var9 ^ 1902423290);
            case 74 -> a(-605903786, var9 ^ 95186739);
            case 75 -> a(-605903787, var9 ^ 1902764178);
            case 76 -> a(-605903788, var9 ^ 6921);
            case 77 -> a(-605903701, var9 ^ 2115002916);
            case 78 -> a(-605903702, var9 ^ 1924822530);
            case 79 -> a(-605903703, var9 ^ -700063687);
            case 80 -> a(-605903704, var9 ^ -1605901861);
            case 81 -> a(-605903697, var9 ^ -976727762);
            case 82 -> a(-605903698, var9 ^ -1193013776);
            case 83 -> a(-605903699, var9 ^ 549221743);
            case 84 -> a(-605903700, var9 ^ -1406514992);
            case 85 -> a(-605903709, var9 ^ -1318558605);
            case 86 -> a(-605903710, var9 ^ -1146155459);
            case 87 -> a(-605903711, var9 ^ 1728556954);
            case 88 -> a(-605903712, var9 ^ -1739271865);
            case 89 -> a(-605903705, var9 ^ 29645995);
            case 90 -> a(-605903706, var9 ^ 819706422);
            case 91 -> a(-605903707, var9 ^ -2045804938);
            case 92 -> a(-605903708, var9 ^ 1223276915);
            case 93 -> a(-605903685, var9 ^ 752372158);
            case 94 -> a(-605903686, var9 ^ -1773017133);
            case 95 -> a(-605903687, var9 ^ -1638800988);
            case 96 -> a(-605903688, var9 ^ 705592610);
            case 97 -> a(-605903681, var9 ^ -434901612);
            case 98 -> 0;
            case 99 -> a(-605903682, var9 ^ 778220749);
            case 100 -> a(-605903683, var9 ^ -1724658739);
            case 101 -> a(-605903684, var9 ^ -405371446);
            case 102 -> a(-605903693, var9 ^ -1340632960);
            case 103 -> a(-605903694, var9 ^ -376363129);
            case 104 -> a(-605903695, var9 ^ 406600077);
            case 105 -> a(-605903696, var9 ^ 574150894);
            case 106 -> a(-605903689, var9 ^ -1428985829);
            case 107 -> a(-605903690, var9 ^ -711813207);
            case 108 -> a(-605903691, var9 ^ 310060299);
            case 109 -> a(-605903692, var9 ^ -476917565);
            case 110 -> a(-605903733, var9 ^ -770322354);
            case 111 -> a(-605903734, var9 ^ -1873001793);
            case 112 -> a(-605903735, var9 ^ -647320677);
            case 113 -> a(-605903736, var9 ^ -962909991);
            case 114 -> a(-605903729, var9 ^ 213738668);
            case 115 -> a(-605903730, var9 ^ -181627918);
            case 116 -> a(-605903731, var9 ^ 853819539);
            case 117 -> a(-605903732, var9 ^ -350299976);
            case 118 -> a(-605903741, var9 ^ -1438123034);
            case 119 -> a(-605903742, var9 ^ -940720087);
            case 120 -> a(-605903743, var9 ^ -198955731);
            case 121 -> a(-605903744, var9 ^ 789031502);
            case 122 -> a(-605903737, var9 ^ -1641948169);
            case 123 -> a(-605903738, var9 ^ -179797006);
            case 124 -> a(-605903739, var9 ^ 410270567);
            case 125 -> a(-605903740, var9 ^ 1665561424);
            case 126 -> a(-605903717, var9 ^ 358327046);
            case 127 -> a(-605903718, var9 ^ 1892542589);
            case 128 -> a(-605903719, var9 ^ -376845237);
            case 129 -> a(-605903720, var9 ^ -307116042);
            case 130 -> a(-605903713, var9 ^ -1289260224);
            case 131 -> a(-605903714, var9 ^ -1882856561);
            case 132 -> a(-605903715, var9 ^ 1845794401);
            case 133 -> a(-605903716, var9 ^ -1652042775);
            case 134 -> a(-605903725, var9 ^ -205237788);
            case 135 -> a(-605903726, var9 ^ 1339419631);
            case 136 -> a(-605903727, var9 ^ -1398056530);
            case 137 -> a(-605903728, var9 ^ 1290349374);
            case 138 -> a(-605903721, var9 ^ 873090212);
            case 139 -> a(-605903722, var9 ^ 1371939162);
            case 140 -> a(-605903723, var9 ^ 1801592549);
            case 141 -> a(-605903724, var9 ^ -1120979965);
            case 142 -> a(-605903637, var9 ^ 2094807236);
            case 143 -> a(-605903638, var9 ^ -942923038);
            case 144 -> a(-605903639, var9 ^ 1421178156);
            case 145 -> a(-605903640, var9 ^ -136935703);
            case 146 -> a(-605903633, var9 ^ 1818930576);
            case 147 -> a(-605903634, var9 ^ -294214735);
            case 148 -> a(-605903635, var9 ^ -506425350);
            case 149 -> a(-605903636, var9 ^ 1107751527);
            case 150 -> a(-605903645, var9 ^ 1273614975);
            case 151 -> a(-605903646, var9 ^ 747646900);
            case 152 -> a(-605903647, var9 ^ -1196229484);
            case 153 -> a(-605903648, var9 ^ -1207698618);
            case 154 -> a(-605903641, var9 ^ -832235114);
            case 155 -> a(-605903642, var9 ^ 1984972583);
            case 156 -> a(-605903643, var9 ^ -804646854);
            case 157 -> a(-605903644, var9 ^ -510433838);
            case 158 -> a(-605903621, var9 ^ 454297500);
            case 159 -> a(-605903622, var9 ^ 1805445938);
            case 160 -> a(-605903623, var9 ^ 104843324);
            case 161 -> a(-605903624, var9 ^ 818376585);
            case 162 -> a(-605903617, var9 ^ 1389520961);
            case 163 -> a(-605903618, var9 ^ -588330841);
            case 164 -> a(-605903619, var9 ^ 2005511318);
            case 165 -> a(-605903620, var9 ^ 1964440637);
            case 166 -> a(-605903629, var9 ^ -638338046);
            case 167 -> a(-605903630, var9 ^ -1110458178);
            case 168 -> a(-605903631, var9 ^ -655546385);
            case 169 -> a(-605903632, var9 ^ -2145043282);
            case 170 -> a(-605903625, var9 ^ 1023887449);
            case 171 -> 5;
            case 172 -> a(-605903626, var9 ^ 1311368982);
            case 173 -> a(-605903627, var9 ^ 871193711);
            case 174 -> a(-605903628, var9 ^ -18001626);
            case 175 -> a(-605903669, var9 ^ -2068824417);
            case 176 -> a(-605903670, var9 ^ 476563903);
            case 177 -> a(-605903671, var9 ^ 600751111);
            case 178 -> a(-605903672, var9 ^ -1090004479);
            case 179 -> a(-605903665, var9 ^ -1258141209);
            case 180 -> a(-605903666, var9 ^ 523615351);
            case 181 -> a(-605903667, var9 ^ -627102276);
            case 182 -> a(-605903668, var9 ^ -1445200996);
            case 183 -> a(-605903677, var9 ^ -1719933308);
            case 184 -> a(-605903678, var9 ^ -1750035634);
            case 185 -> a(-605903679, var9 ^ -217692322);
            case 186 -> a(-605903680, var9 ^ 240237424);
            case 187 -> a(-605903673, var9 ^ 1638432662);
            case 188 -> a(-605903674, var9 ^ -1960142398);
            case 189 -> a(-605903675, var9 ^ 733754103);
            case 190 -> a(-605903676, var9 ^ -2023578365);
            case 191 -> a(-605903653, var9 ^ -1033780870);
            case 192 -> a(-605903654, var9 ^ -1704236330);
            case 193 -> a(-605903655, var9 ^ -623927441);
            case 194 -> a(-605903656, var9 ^ -2077506939);
            case 195 -> a(-605903649, var9 ^ 1067483019);
            case 196 -> a(-605903650, var9 ^ 2049873430);
            case 197 -> 1;
            case 198 -> a(-605903651, var9 ^ -894426846);
            case 199 -> a(-605903652, var9 ^ -560733490);
            case 200 -> a(-605903661, var9 ^ -983045583);
            case 201 -> a(-605903662, var9 ^ 1488899734);
            case 202 -> a(-605903663, var9 ^ 1365043279);
            case 203 -> a(-605903664, var9 ^ -563647740);
            case 204 -> a(-605903657, var9 ^ 362121575);
            case 205 -> a(-605903658, var9 ^ -5871361);
            case 206 -> a(-605903659, var9 ^ 794180812);
            case 207 -> a(-605903660, var9 ^ -1838018378);
            case 208 -> a(-605903573, var9 ^ -998620386);
            case 209 -> a(-605903574, var9 ^ 1624866860);
            case 210 -> a(-605903575, var9 ^ -791098887);
            case 211 -> a(-605903576, var9 ^ -1484849912);
            case 212 -> a(-605903569, var9 ^ 1584311001);
            case 213 -> a(-605903570, var9 ^ 589840483);
            case 214 -> a(-605903571, var9 ^ 1805440399);
            case 215 -> a(-605903572, var9 ^ -551191223);
            case 216 -> a(-605903581, var9 ^ -792671697);
            case 217 -> a(-605903582, var9 ^ -1546606578);
            case 218 -> a(-605903583, var9 ^ 439191589);
            case 219 -> a(-605903584, var9 ^ 2025821563);
            case 220 -> a(-605903577, var9 ^ 368312329);
            case 221 -> a(-605903578, var9 ^ 1917020380);
            case 222 -> a(-605903579, var9 ^ -1697251788);
            case 223 -> a(-605903580, var9 ^ -983427331);
            case 224 -> a(-605903557, var9 ^ -546920360);
            case 225 -> a(-605903558, var9 ^ 754485588);
            case 226 -> a(-605903559, var9 ^ -399533853);
            case 227 -> a(-605903560, var9 ^ -1394789266);
            case 228 -> a(-605903553, var9 ^ -350381855);
            case 229 -> a(-605903554, var9 ^ 1514015266);
            case 230 -> a(-605903555, var9 ^ -385937380);
            case 231 -> a(-605903556, var9 ^ 1903098851);
            case 232 -> a(-605903565, var9 ^ 159049216);
            case 233 -> a(-605903566, var9 ^ -997986948);
            case 234 -> a(-605903567, var9 ^ -1641082439);
            case 235 -> 4;
            case 236 -> a(-605903568, var9 ^ 154256074);
            case 237 -> a(-605903561, var9 ^ -2146865499);
            case 238 -> a(-605903562, var9 ^ 381151568);
            case 239 -> a(-605903563, var9 ^ -755832683);
            case 240 -> a(-605903564, var9 ^ -1224403403);
            case 241 -> a(-605903605, var9 ^ -1852581782);
            case 242 -> a(-605903606, var9 ^ 617149910);
            case 243 -> a(-605903607, var9 ^ 1679239288);
            case 244 -> a(-605903608, var9 ^ 1953621715);
            case 245 -> a(-605903601, var9 ^ 62311046);
            case 246 -> a(-605903602, var9 ^ -1304356236);
            case 247 -> a(-605903603, var9 ^ -1256566412);
            case 248 -> a(-605903604, var9 ^ 995436526);
            case 249 -> a(-605903613, var9 ^ -994091940);
            case 250 -> a(-605903614, var9 ^ -1946177683);
            case 251 -> a(-605903615, var9 ^ 8649352);
            case 252 -> a(-605903616, var9 ^ -381113613);
            case 253 -> 3;
            case 254 -> a(-605903609, var9 ^ 912011386);
            default -> a(-605903610, var9 ^ -278526508);
         };
         int var5 = (var1 & a(-605903611, var9 ^ -1560581832)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-605903612, var9 ^ -1850418484)) >>> a(-605903589, var9 ^ -303098747)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-605903590, var9 ^ -1544255688);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-605903591, var9 ^ 484178244);
            }
         }

         aab[var2] = new String(var3).intern();
      }

      return aab[var2];
   }
}
