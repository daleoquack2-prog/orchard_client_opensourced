package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbbabbab {
   private static final int[] bab;
   private static final Object[] bbb;
   public static final bbbabbab aa;
   private static final long[] ab;
   private static final bbbabbab[] ba;
   private static final String[] a;
   private static final String[] bb;
   private static String[] aaa;
   public static final bbbabbab b;
   private static final Integer[] aab;
   private static final String[] bba;
   private static final Long[] aba;
   public static final bbbabbab abb;
   private static final long[] baa;

   private static long aa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1211381072, 2020601932 ^ 232547373)) & a(-1211381071, 2020601932 ^ -1048266192);
      if (aba[var3] == null) {
         aba[var3] = baa[var3] ^ var1;
      }

      return aba[var3];
   }

   private static String ab(char[] var0, long var1, int var3) {
      int var4 = ba(a(-1211381070, -405782258 ^ 670664223), 7621376889277946854L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ba(a(-1211381069, -405782258 ^ -398350718), 309605392801110904L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = 1341391553;
      int var10001 = "$\udf5b\uebd7訇\udceb菛ﳊ\ue1a1⇺릒襦潰\ud83aꕲ馟順\ud9c5䖔ॐ\uf1be摼䃚\uf8e6ထ䑔唒\ue211⦒놴充腓鯪앴巳彁考홊\u0018\uf09c젌\uefcc킇\ueee1栗\uf6bc蠌\uec6cꢄ\ue601頔\ue57c倉\ue1cc傅\ue461점\uf05c\u200c\ue8cc墀\ue601뀑\n㍗㫼㍧쩰㶊拦㳗櫿㼧⩰\u0010䊯䓣䊿鑩䈒᳹䟏쳦彿둭䴲䓽䲯\uece7䈟Ⱪ\nꃼ퀘ꃌₔ긡蠂꽼耛게삔\u0018◜怸ℬ炱₁〥⤼ꀸ⽌Ⴕㆡ砤⚼蠺⧌肶◡&⒜倹⯌⢰㬡\ud827\nꙍ籙꙽賕ꢐ⑃꧍ⱚ\uaa3d法"
         .length();
      String[] var31 = new String[7];
      int var33 = 0;
      int var30 = var10001;
      short var34 = 9749;
      String var29 = "$\udf5b\uebd7訇\udceb菛ﳊ\ue1a1⇺릒襦潰\ud83aꕲ馟順\ud9c5䖔ॐ\uf1be摼䃚\uf8e6ထ䑔唒\ue211⦒놴充腓鯪앴巳彁考홊\u0018\uf09c젌\uefcc킇\ueee1栗\uf6bc蠌\uec6cꢄ\ue601頔\ue57c倉\ue1cc傅\ue461점\uf05c\u200c\ue8cc墀\ue601뀑\n㍗㫼㍧쩰㶊拦㳗櫿㼧⩰\u0010䊯䓣䊿鑩䈒᳹䟏쳦彿둭䴲䓽䲯\uece7䈟Ⱪ\nꃼ퀘ꃌₔ긡蠂꽼耛게삔\u0018◜怸ℬ炱₁〥⤼ꀸ⽌Ⴕㆡ砤⚼蠺⧌肶◡&⒜倹⯌⢰㬡\ud827\nꙍ籙꙽賕ꢐ⑃꧍ⱚ\uaa3d法";
      int var32 = 0;

      do {
         char var35 = var29.charAt(var33);
         int var37 = 0;
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            int var38 = var36[var37];

            var38 = (char)(switch (var37 % 6) {
               default -> 255;
               case 1 -> 240;
               case 2 -> 15;
               case 3 -> 127;
               case 4 -> 2;
               case 5 -> 233;
            }) ^ var38;
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

      bba = var31;
      bbb = new Object[var31.length];
      int var25 = -1025670415;
      byte[] var23 = "\u0000¥\u009fÍ3\u0002Í#µ?ÏSz\u0087îmç>ø\u000bÍÂ½é¥<¼\u009dÁ(\n-&4\u000b42DÉ/è¹M\u0015Ê[]\u0097¾NE4Ü\u009cF`\\9¤Z\u0083\u009d\u0010_(Cz¿2¢¨\u0006\u0089\u0001T1tN!9óåÄlçâ¢Ë\u0004r?Y\u0088>¦ã\u0090BÝä)\u0096é*Ã¡=¹6\r¤Ñ£bÖÇ\u0017Bt+\u009f\u0004Í\bP³â\u001c \u0084\u001bÿ¢/n\u000b\u009eMV\u0091]ÙÅC\u0087[\u0005Ö\u000ezè\u009b\u009a\u00ad½]\u008fe\u0018SO\u0085\n\u009c\u0017 %·\u0093S|ò\u008f(\u0085cÆSô¢\"\u0082;s+{\u0005M\u0092\u0088üP\u0006\u001a\u0080ä\u0005\u001c:p\u0081ûp\u0092gê\u0003\u009e£\u0092\u0080\u008f%7=2\u009føS\u009eîÅ#Ý°,\u0088ÿ%ó\u008c)I:üö\u0007\u0010Ä9¤ß8jý¦w\u001e|bfC×s[\u0004&¦§¡\u0011-²,Å\u0002V\u0093Ô³ò:õR\u0089Ö\b@¸Gìß\"\u0093\u0083S(£æ\u0092[|(&\u0082·×üxç\u0012m#\u000f«)@Z\b×\"om\u0015Á^Ö;o\u000f\u0091PãòY5\u0092m\n\u009d\bqAöT\u0087Ö\u0081\u0086\u009fDE{Ú\u0013ÝÞj\u009bí\u0000\u00adÔyn3\u001cö~¾\u0000~\u00153\u001aè:=\u0083:5¿¬\u008d'¬\u0083\u0094E`gË\u009e\u0014slèbÈ)©4r\u009fTÂ\u0014\u0018\u0007ovâªûå×ù\u0099fB\u0096\u001b<\u007fú£\u008bt\u008a¤£Àµ\u0092R¿\tý\u0082\u008d\u0001XÛ70xob¾å\u0002340<£\u0014Ü(ÛÔÈIRu;}þk\u008b=H½aç\u008e\u0016µ\u0081\u009dE^H¿_Î\u0003úø\u0001\u0001O²\u0093\u0017µ\u0082=7)9ú\u0088F![È\u0093¤~^<ä«©÷\u0018\u0017½Â!èUµ÷\u0091mË²\u0017[g\u0003Õ]»Ó¦ü·\u0081Ý\u0006\u0016\u008d\u008f_ÁdÃÂS_ö\u0006\u0097~\u0088\u0018aÙWe ·ý·} $\u009bkÕ#Æþ\u0000\u0016â\u0081ü§nÞ\u0096lòYVxÎ\u0085Q\u0080b@\u001cÕH5ü ¡An\u000f)\u0093\u0015u\u007fò¬ÎOÈÍ*^Îè±ÓB¥$\u009e×eÕ\u009fOn]ns\"à\u0099\u0095ÑV\u001f¬\u009c\u009f>\u0091\u0091U'tB\u0002\u0004\u0098Ñ\u0010Ø«°Ê \\Á%#L°Zªáj\u001e\u0096\u0082T\u0016¼L=Ý\u000eÍ¡õn¡ü\u008dM\u0092\u000eÕ;®ËæLQ<|§-?2q®Nàð\u0014?7È\u0002Xs\u001eXÒõùD:\u001a\u0002Ñòu1\u008d\u0087jb=\u0003\u008bk\u001bOikä\u0084Â¶ú÷`]\t¿\u001caßÖ9\u009bù#\u007fKVcÀÉ\u0097å³\u008d\u0084¶\u0015Ö\u001eªediI:Zr\u008cÓ»V\u001eÃR\u0016*s¬íµ\u001dx»ø70bp©{\fQÎùdiõ\u0013ÇU)í¯xªUuÃ.ðí*Ð\u001bû\u0089\u001a\u0088\u008b\u0097r\u009e6³Õúo M&´y`=µÍ\u00ad£¬j2\u008a\u0011±V\u000b\u008f/\u000b\u009cäõ¤z|\rCç6)\u0001b¼\u0080@Ð\rV\u0014\u0091\u001eå\u0004ô\r¶\u0017ÒÒ¦[V\u0019\u0092\r?\u001f \u0086lã\u0098Òrüð¼ù@÷o«-\u000bgª\u0095=Þb*®\u0087Ý\u009e\t?£à±\u0015ù\u0013ÐÜ[mÂCíñßDíA{1KcÚb\u0003ÈDÆSñ\u0003´oåÜÕ ¾\u0094CÍ4\u008aÁ×\u0093\u0000»*Nþ\u001bBjälT*fÃ\u0013RÒ§\u001dÄë:çÅ<\u0082\u0090Dç\u0018H\u001fêGÁgÝÖ#\u0096qÚ]5'\u0006\u009dCj>òièÏÉð\"z\u001eîÐÚÕEhB\u001aEÜ:\u0089ä°ê\u0091æy\u008bÿ\u0097p\u001dv»àÄð8Ç3ßíÊä;í·\u009c\u008c¼¦xBE:k?8½\u001e?©þ\\\"\u0092¯¥û\u007f½½·É¬\\>þ?çv\u009a\u0013h.C{ìwÄá\ru\u008eùPºÜ¡\u0000Úò\u000f=\u000bÇ ÂÒ\u0084b\u009bFÅL5\u0091\u0007\u0013ê\u0000Aµ\u0015\u0012·jâ\"\u001bæ'5UÎPQ3\u001aP¬ÌZ\f]èg·\u0011²~ è\u0081ìmg+W\u009d5ù\u0010\b\u001b\f\u0082²·²\u0004\u0092²©\u0084;Ë9)p\u0018\u0017\\@¶\u000fz×+\u0001SØÇ·óU\u001a\u0018í\u0014D\u007f\u009f9È\r¼\u009d!÷f\u0001d\u0080$dºÂÅz"
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
      int var20 = (var18 = aba('苏', (char)'뷃', 64, -1367560074)).length();
      int var17 = a(-1211381068, var39 ^ -572772608);
      int var16 = -1;

      while (true) {
         char[] var59;
         label114: {
            char[] var45 = var18.substring(++var16, var16 + var17).toCharArray();
            int var10003 = var45.length;
            int var22 = 0;
            var59 = var45;
            var10001 = var10003;
            char[] var68;
            int var10004;
            if (var10003 <= 1) {
               var68 = var45;
               var10004 = var22;
            } else {
               var59 = var45;
               var10001 = var10003;
               if (var10003 <= var22) {
                  break label114;
               }

               var68 = var45;
               var10004 = var22;
            }

            while (true) {
               var68[var10004] = (char)(var68[var10004] ^ switch (var22 % a(-1211381067, var39 ^ -148870629)) {
                  case 0 -> a(-1211381066, var39 ^ -1612813465);
                  case 1 -> a(-1211381065, var39 ^ -70591411);
                  case 2 -> 4;
                  case 3 -> a(-1211381064, var39 ^ 483843418);
                  case 4 -> a(-1211381063, var39 ^ 145104406);
                  case 5 -> a(-1211381062, var39 ^ -765748689);
                  default -> a(-1211381061, var39 ^ -256275789);
               });
               var22++;
               if (var10001 == 0) {
                  var10004 = var10001;
                  var68 = var59;
               } else {
                  if (var10001 <= var22) {
                     break;
                  }

                  var68 = var59;
                  var10004 = var22;
               }
            }
         }

         String var75 = new String(var59).intern();
         int var52 = -1;
         var21[var19++] = var75;
         if ((var16 += var17) >= var20) {
            bb = var21;
            a = new String[3];
            long var8 = 5654313487288374825L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12;
            int var13 = (var12 = aba('ᣗ', '\uf070', (byte)-125, -1367560073)).length();
            byte var10 = 0;

            label98:
            while (true) {
               var52 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var52, var10).getBytes(aba(26943, '\u20f6', (byte)5, -1367560076));
               long[] var44 = var14;
               var52 = var11++;
               long var64 = (var15[0] & 255L) << a(-1211381060, var39 ^ -2069065154)
                  | (var15[1] & 255L) << a(-1211381059, var39 ^ -427912861)
                  | (var15[2] & 255L) << a(-1211381058, var39 ^ 1725657986)
                  | (var15[3] & 255L) << a(-1211381057, var39 ^ -1182808178)
                  | (var15[4] & 255L) << a(-1211381088, var39 ^ 312585609)
                  | (var15[5] & 255L) << a(-1211381087, var39 ^ 138444601)
                  | (var15[a(-1211381086, var39 ^ -1276935201)] & 255L) << a(-1211381085, var39 ^ 1319958236)
                  | var15[a(-1211381084, var39 ^ -922283121)] & 255L;
               byte var76 = -1;

               while (true) {
                  long var80 = var64 ^ var8;
                  switch (var76) {
                     case 0:
                        var44[var52] = var80;
                        if (var10 >= var13) {
                           ab = var14;
                           aab = new Integer[5];
                           long var0 = 4311581359686604226L;
                           long[] var6 = new long[3];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = aba(3706, '\u1f5a', 3, -1367560077)).length();
                           byte var2 = 0;

                           do {
                              int var56 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var56, var2).getBytes(aba('嚟', '쮤', (byte)91, -1367560080));
                              var56 = var3++;
                              var80 = (
                                    (var7[0] & 255L) << a(-1211381074, var39 ^ -1511646704)
                                       | (var7[1] & 255L) << a(-1211381073, var39 ^ 1783706893)
                                       | (var7[2] & 255L) << a(-1211381104, var39 ^ -1704539127)
                                       | (var7[3] & 255L) << a(-1211381103, var39 ^ -1731347980)
                                       | (var7[4] & 255L) << a(-1211381102, var39 ^ -1532001899)
                                       | (var7[5] & 255L) << a(-1211381101, var39 ^ 1731924558)
                                       | (var7[a(-1211381100, var39 ^ -1111895538)] & 255L) << a(-1211381099, var39 ^ 882392904)
                                       | var7[a(-1211381098, var39 ^ -1605408116)] & 255L
                                 )
                                 ^ var0;
                              byte var78 = -1;
                              var6[var56] = var80;
                           } while (var2 < var5);

                           baa = var6;
                           aba = new Long[3];
                           aaa = new String[3];
                           aab();
                           abb = new bbbabbab();
                           aa = new bbbabbab();
                           b = new bbbabbab();
                           ba = bb();
                           return;
                        }
                        break;
                     default:
                        var44[var52] = var80;
                        if (var10 < var13) {
                           continue label98;
                        }

                        var13 = (var12 = aba('㎉', (char)'륆', 86, -1367560075)).length();
                        var10 = 0;
                  }

                  byte var55 = var10;
                  var10 += 8;
                  var15 = var12.substring(var55, var10).getBytes(aba('鎙', (char)'蚸', 118, -1367560078));
                  var44 = var14;
                  var52 = var11++;
                  var64 = (var15[0] & 255L) << a(-1211381083, var39 ^ -587172392)
                     | (var15[1] & 255L) << a(-1211381082, var39 ^ 1049684033)
                     | (var15[2] & 255L) << a(-1211381081, var39 ^ -1294175966)
                     | (var15[3] & 255L) << a(-1211381080, var39 ^ -1432352222)
                     | (var15[4] & 255L) << a(-1211381079, var39 ^ 326385173)
                     | (var15[5] & 255L) << a(-1211381078, var39 ^ -112989555)
                     | (var15[a(-1211381077, var39 ^ 217019190)] & 255L) << a(-1211381076, var39 ^ -1719664339)
                     | var15[a(-1211381075, var39 ^ 765502401)] & 255L;
                  var76 = 0;
               }
            }
         }

         var17 = var18.charAt(var16);
      }
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1211381097, 2022370177 ^ -2097577169);
      if (aab[var3] == null) {
         aab[var3] = (int)(ab[var3] ^ var1);
      }

      return aab[var3];
   }

   private static bbbabbab[] bb() {
      return new bbbabbab[]{abb, aa, b};
   }

   private static int a(int var0, int var1) {
      int var2 = bab[var0 ^ -1211381072] ^ var1 ^ var0;
      var2 -= 42457;
      var2 += 53254;
      var2 += 65498;
      var2 += 27211;
      var2 -= 15364;
      var2 ^= 23405;
      var2 -= 54221;
      var2 -= 33156;
      var2 ^= 6710;
      return var2 ^ 17254;
   }

   public static bbbabbab aaa(String var0) {
      return Enum.valueOf(bbbabbab.class, var0);
   }

   private static void aab() {
      int var0 = 1872024657;
      aaa[0] = ab(
         b(a(-1211381096, var0 ^ 1426583194), a(-1211381095, var0 ^ 228754484)).toCharArray(),
         aa(a(-1211381094, var0 ^ 1982727196), 3379359524009468667L),
         ba(a(-1211381093, var0 ^ -1783985065), 3689397958374266606L)
      );
      aaa[1] = ab(
         b(a(-1211381092, var0 ^ -590278433), a(-1211381091, var0 ^ -939538549)).toCharArray(),
         aa(a(-1211381090, var0 ^ -838455845), 9055439177067130958L),
         ba(a(-1211381089, var0 ^ -2012600969), 3454986003703236234L)
      );
      aaa[2] = ab(
         b(a(-1211381120, var0 ^ 479749375), a(-1211381119, var0 ^ 530486148)).toCharArray(),
         aa(a(-1211381118, var0 ^ -1686542803), 2885065121729091122L),
         ba(a(-1211381117, var0 ^ 2104024525), 164914568222546608L)
      );
   }

   private static String aba(char var0, char var1, byte var2, int var3) {
      int var8 = var3 ^ -1367560074;
      char[] var7 = bba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])bbb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         bbb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 25901;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ '즏' ^ var5 ^ var0 ^ var3 ^ var1 ^ var2);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   private static String b(int var0, int var1) {
      int var9 = -182251749;
      int var2 = (var0 ^ a(-1211381116, var9 ^ 598196128)) & a(-1211381115, var9 ^ -1526581950);
      if (a[var2] == null) {
         char[] var3 = bb[var2].toCharArray();

         int var4 = switch (var3[0] & a(-1211381114, var9 ^ 533563629)) {
            case 0 -> a(-1211381113, var9 ^ 1861286365);
            case 1 -> a(-1211381112, var9 ^ 806965954);
            case 2 -> a(-1211381111, var9 ^ -1513728312);
            case 3 -> a(-1211381110, var9 ^ -921753889);
            case 4 -> a(-1211381109, var9 ^ -2027610186);
            case 5 -> a(-1211381108, var9 ^ 619373544);
            case 6 -> a(-1211381107, var9 ^ 2106830306);
            case 7 -> a(-1211381106, var9 ^ -61359076);
            case 8 -> a(-1211381105, var9 ^ 1464240055);
            case 9 -> a(-1211381008, var9 ^ -1500283507);
            case 10 -> a(-1211381007, var9 ^ -1860671418);
            case 11 -> a(-1211381006, var9 ^ 1161267827);
            case 12 -> a(-1211381005, var9 ^ 1418078329);
            case 13 -> a(-1211381004, var9 ^ 1969705919);
            case 14 -> a(-1211381003, var9 ^ -2005573111);
            case 15 -> a(-1211381002, var9 ^ 1827338664);
            case 16 -> a(-1211381001, var9 ^ 57078648);
            case 17 -> a(-1211381000, var9 ^ 1722253470);
            case 18 -> a(-1211380999, var9 ^ -1475126932);
            case 19 -> a(-1211380998, var9 ^ 1472832181);
            case 20 -> a(-1211380997, var9 ^ -1839662770);
            case 21 -> a(-1211380996, var9 ^ 723294937);
            case 22 -> a(-1211380995, var9 ^ -1998389630);
            case 23 -> a(-1211380994, var9 ^ -316663230);
            case 24 -> a(-1211380993, var9 ^ 1443804501);
            case 25 -> a(-1211381024, var9 ^ 291846353);
            case 26 -> a(-1211381023, var9 ^ -654292959);
            case 27 -> a(-1211381022, var9 ^ -1968647633);
            case 28 -> a(-1211381021, var9 ^ -1044148386);
            case 29 -> a(-1211381020, var9 ^ 1454661023);
            case 30 -> a(-1211381019, var9 ^ -999250176);
            case 31 -> a(-1211381018, var9 ^ -1813511168);
            case 32 -> 1;
            case 33 -> a(-1211381017, var9 ^ 467196575);
            case 34 -> a(-1211381016, var9 ^ 1414313350);
            case 35 -> a(-1211381015, var9 ^ -1664899960);
            case 36 -> a(-1211381014, var9 ^ -2142515447);
            case 37 -> a(-1211381013, var9 ^ -1696733466);
            case 38 -> a(-1211381012, var9 ^ 51374411);
            case 39 -> a(-1211381011, var9 ^ 750321127);
            case 40 -> a(-1211381010, var9 ^ 60923461);
            case 41 -> a(-1211381009, var9 ^ -402766707);
            case 42 -> a(-1211381040, var9 ^ -212258196);
            case 43 -> a(-1211381039, var9 ^ 1209823780);
            case 44 -> a(-1211381038, var9 ^ -223703427);
            case 45 -> a(-1211381037, var9 ^ -1808933785);
            case 46 -> a(-1211381036, var9 ^ -153652796);
            case 47 -> a(-1211381035, var9 ^ 1709319549);
            case 48 -> a(-1211381034, var9 ^ -428389215);
            case 49 -> a(-1211381033, var9 ^ -1135992422);
            case 50 -> a(-1211381032, var9 ^ 188831298);
            case 51 -> a(-1211381031, var9 ^ 603287303);
            case 52 -> a(-1211381030, var9 ^ -762654207);
            case 53 -> a(-1211381029, var9 ^ 45669179);
            case 54 -> a(-1211381028, var9 ^ 1526917682);
            case 55 -> a(-1211381027, var9 ^ -279485938);
            case 56 -> a(-1211381026, var9 ^ -2113475006);
            case 57 -> a(-1211381025, var9 ^ -1130969072);
            case 58 -> a(-1211381056, var9 ^ -1460793732);
            case 59 -> a(-1211381055, var9 ^ -915951779);
            case 60 -> a(-1211381054, var9 ^ -36982295);
            case 61 -> a(-1211381053, var9 ^ -1115855185);
            case 62 -> a(-1211381052, var9 ^ 1740361072);
            case 63 -> a(-1211381051, var9 ^ 27828178);
            case 64 -> a(-1211381050, var9 ^ -930445903);
            case 65 -> a(-1211381049, var9 ^ -2083576936);
            case 66 -> a(-1211381048, var9 ^ -2122684171);
            case 67 -> a(-1211381047, var9 ^ -1753196128);
            case 68 -> a(-1211381046, var9 ^ -1222843098);
            case 69 -> a(-1211381045, var9 ^ 141818833);
            case 70 -> a(-1211381044, var9 ^ 1218870811);
            case 71 -> a(-1211381043, var9 ^ -569821100);
            case 72 -> a(-1211381042, var9 ^ 700630215);
            case 73 -> a(-1211381041, var9 ^ 1039662370);
            case 74 -> a(-1211381200, var9 ^ -713020036);
            case 75 -> a(-1211381199, var9 ^ -302093857);
            case 76 -> a(-1211381198, var9 ^ -615327524);
            case 77 -> a(-1211381197, var9 ^ -577894118);
            case 78 -> a(-1211381196, var9 ^ 2088917899);
            case 79 -> a(-1211381195, var9 ^ -2044504268);
            case 80 -> a(-1211381194, var9 ^ -537608597);
            case 81 -> a(-1211381193, var9 ^ 1114015100);
            case 82 -> a(-1211381192, var9 ^ -2036161913);
            case 83 -> a(-1211381191, var9 ^ -1739324632);
            case 84 -> a(-1211381190, var9 ^ -443191936);
            case 85 -> a(-1211381189, var9 ^ 927529600);
            case 86 -> a(-1211381188, var9 ^ 459149036);
            case 87 -> a(-1211381187, var9 ^ 1187765006);
            case 88 -> a(-1211381186, var9 ^ 1655972012);
            case 89 -> a(-1211381185, var9 ^ -286569224);
            case 90 -> a(-1211381216, var9 ^ 1919716768);
            case 91 -> a(-1211381215, var9 ^ 1320192645);
            case 92 -> 5;
            case 93 -> a(-1211381214, var9 ^ -495598013);
            case 94 -> a(-1211381213, var9 ^ -939514102);
            case 95 -> a(-1211381212, var9 ^ 561296552);
            case 96 -> a(-1211381211, var9 ^ -1448685960);
            case 97 -> a(-1211381210, var9 ^ -3705234);
            case 98 -> a(-1211381209, var9 ^ -805497110);
            case 99 -> a(-1211381208, var9 ^ -553962773);
            case 100 -> a(-1211381207, var9 ^ 1400340059);
            case 101 -> a(-1211381206, var9 ^ 518176504);
            case 102 -> a(-1211381205, var9 ^ 528135219);
            case 103 -> a(-1211381204, var9 ^ -297338398);
            case 104 -> a(-1211381203, var9 ^ 429919009);
            case 105 -> a(-1211381202, var9 ^ -1617344968);
            case 106 -> a(-1211381201, var9 ^ -1096528951);
            case 107 -> a(-1211381232, var9 ^ -1488872979);
            case 108 -> a(-1211381231, var9 ^ -2069033718);
            case 109 -> a(-1211381230, var9 ^ 1486776956);
            case 110 -> a(-1211381229, var9 ^ 543759180);
            case 111 -> a(-1211381228, var9 ^ -1552323882);
            case 112 -> a(-1211381227, var9 ^ 718583327);
            case 113 -> a(-1211381226, var9 ^ 381128451);
            case 114 -> a(-1211381225, var9 ^ 1014621921);
            case 115 -> a(-1211381224, var9 ^ -1896318433);
            case 116 -> a(-1211381223, var9 ^ -292282231);
            case 117 -> a(-1211381222, var9 ^ -844638919);
            case 118 -> a(-1211381221, var9 ^ -1147465336);
            case 119 -> a(-1211381220, var9 ^ -865802520);
            case 120 -> a(-1211381219, var9 ^ 655942854);
            case 121 -> a(-1211381218, var9 ^ -241462191);
            case 122 -> a(-1211381217, var9 ^ 1881269676);
            case 123 -> a(-1211381248, var9 ^ 1211597755);
            case 124 -> a(-1211381247, var9 ^ -1637021509);
            case 125 -> a(-1211381246, var9 ^ 2037506524);
            case 126 -> a(-1211381245, var9 ^ -2098976326);
            case 127 -> a(-1211381244, var9 ^ -1313317757);
            case 128 -> a(-1211381243, var9 ^ -502736756);
            case 129 -> a(-1211381242, var9 ^ -349269166);
            case 130 -> a(-1211381241, var9 ^ -338601743);
            case 131 -> a(-1211381240, var9 ^ 919547048);
            case 132 -> a(-1211381239, var9 ^ -583244565);
            case 133 -> a(-1211381238, var9 ^ -504754724);
            case 134 -> a(-1211381237, var9 ^ 466417697);
            case 135 -> a(-1211381236, var9 ^ -882657236);
            case 136 -> a(-1211381235, var9 ^ 1235369709);
            case 137 -> a(-1211381234, var9 ^ 229731611);
            case 138 -> a(-1211381233, var9 ^ 1445687330);
            case 139 -> a(-1211381136, var9 ^ -463694497);
            case 140 -> 2;
            case 141 -> a(-1211381135, var9 ^ -632858919);
            case 142 -> a(-1211381134, var9 ^ 996394367);
            case 143 -> a(-1211381133, var9 ^ -769396281);
            case 144 -> a(-1211381132, var9 ^ 752381507);
            case 145 -> a(-1211381131, var9 ^ -124902475);
            case 146 -> a(-1211381130, var9 ^ -1336432061);
            case 147 -> a(-1211381129, var9 ^ -80114693);
            case 148 -> a(-1211381128, var9 ^ 2035397221);
            case 149 -> a(-1211381127, var9 ^ -1812820298);
            case 150 -> a(-1211381126, var9 ^ 1838850944);
            case 151 -> a(-1211381125, var9 ^ -717219686);
            case 152 -> a(-1211381124, var9 ^ 1893265803);
            case 153 -> a(-1211381123, var9 ^ -1680977146);
            case 154 -> a(-1211381122, var9 ^ 146689379);
            case 155 -> a(-1211381121, var9 ^ 503539997);
            case 156 -> a(-1211381152, var9 ^ 2052749920);
            case 157 -> a(-1211381151, var9 ^ -1501453045);
            case 158 -> a(-1211381150, var9 ^ -1115680266);
            case 159 -> a(-1211381149, var9 ^ 597275060);
            case 160 -> a(-1211381148, var9 ^ 170158968);
            case 161 -> a(-1211381147, var9 ^ -1950681932);
            case 162 -> a(-1211381146, var9 ^ 483470852);
            case 163 -> a(-1211381145, var9 ^ -95825613);
            case 164 -> a(-1211381144, var9 ^ 1728312297);
            case 165 -> a(-1211381143, var9 ^ -494314714);
            case 166 -> a(-1211381142, var9 ^ 1345883173);
            case 167 -> a(-1211381141, var9 ^ 288046741);
            case 168 -> a(-1211381140, var9 ^ 1949855067);
            case 169 -> 0;
            case 170 -> a(-1211381139, var9 ^ 1390902746);
            case 171 -> a(-1211381138, var9 ^ -701741024);
            case 172 -> 3;
            case 173 -> a(-1211381137, var9 ^ -1087702440);
            case 174 -> a(-1211381168, var9 ^ -321502522);
            case 175 -> a(-1211381167, var9 ^ -221697395);
            case 176 -> a(-1211381166, var9 ^ 2037722551);
            case 177 -> a(-1211381165, var9 ^ 723046882);
            case 178 -> a(-1211381164, var9 ^ 715187883);
            case 179 -> a(-1211381163, var9 ^ -501255158);
            case 180 -> a(-1211381162, var9 ^ 1571541783);
            case 181 -> a(-1211381161, var9 ^ 601189046);
            case 182 -> a(-1211381160, var9 ^ 2032536079);
            case 183 -> a(-1211381159, var9 ^ -614983173);
            case 184 -> a(-1211381158, var9 ^ 1841563085);
            case 185 -> a(-1211381157, var9 ^ 1836361590);
            case 186 -> a(-1211381156, var9 ^ -883555994);
            case 187 -> a(-1211381155, var9 ^ -2080530606);
            case 188 -> a(-1211381154, var9 ^ -742074179);
            case 189 -> a(-1211381153, var9 ^ -271579296);
            case 190 -> a(-1211381184, var9 ^ -1601482916);
            case 191 -> a(-1211381183, var9 ^ 1291931886);
            case 192 -> a(-1211381182, var9 ^ 1470553000);
            case 193 -> a(-1211381181, var9 ^ -1434770059);
            case 194 -> a(-1211381180, var9 ^ -1033945231);
            case 195 -> a(-1211381179, var9 ^ -736117366);
            case 196 -> a(-1211381178, var9 ^ -1821964142);
            case 197 -> a(-1211381177, var9 ^ -1645137433);
            case 198 -> a(-1211381176, var9 ^ 1743841253);
            case 199 -> a(-1211381175, var9 ^ 275856504);
            case 200 -> a(-1211381174, var9 ^ -936759184);
            case 201 -> a(-1211381173, var9 ^ 1095895032);
            case 202 -> a(-1211381172, var9 ^ -1549554912);
            case 203 -> a(-1211381171, var9 ^ -587137742);
            case 204 -> a(-1211381170, var9 ^ 494317952);
            case 205 -> a(-1211381169, var9 ^ 1918644976);
            case 206 -> a(-1211380816, var9 ^ 1237712851);
            case 207 -> 4;
            case 208 -> a(-1211380815, var9 ^ -1629812167);
            case 209 -> a(-1211380814, var9 ^ 1433449250);
            case 210 -> a(-1211380813, var9 ^ -1703934196);
            case 211 -> a(-1211380812, var9 ^ 164719398);
            case 212 -> a(-1211380811, var9 ^ 299082352);
            case 213 -> a(-1211380810, var9 ^ 2141367234);
            case 214 -> a(-1211380809, var9 ^ -158450719);
            case 215 -> a(-1211380808, var9 ^ 1879907358);
            case 216 -> a(-1211380807, var9 ^ 1607995552);
            case 217 -> a(-1211380806, var9 ^ -1143444163);
            case 218 -> a(-1211380805, var9 ^ 210336752);
            case 219 -> a(-1211380804, var9 ^ -1032788026);
            case 220 -> a(-1211380803, var9 ^ -1089640951);
            case 221 -> a(-1211380802, var9 ^ -1080286183);
            case 222 -> a(-1211380801, var9 ^ -1566083912);
            case 223 -> a(-1211380832, var9 ^ 2068473430);
            case 224 -> a(-1211380831, var9 ^ 939292495);
            case 225 -> a(-1211380830, var9 ^ -1093933644);
            case 226 -> a(-1211380829, var9 ^ -156251709);
            case 227 -> a(-1211380828, var9 ^ -1367955881);
            case 228 -> a(-1211380827, var9 ^ -135185420);
            case 229 -> a(-1211380826, var9 ^ -172285406);
            case 230 -> a(-1211380825, var9 ^ 988379685);
            case 231 -> a(-1211380824, var9 ^ 1523045617);
            case 232 -> a(-1211380823, var9 ^ -1947043219);
            case 233 -> a(-1211380822, var9 ^ 1387379112);
            case 234 -> a(-1211380821, var9 ^ -957311390);
            case 235 -> a(-1211380820, var9 ^ 288540678);
            case 236 -> a(-1211380819, var9 ^ -2139853255);
            case 237 -> a(-1211380818, var9 ^ -1836928545);
            case 238 -> a(-1211380817, var9 ^ -1574028368);
            case 239 -> a(-1211380848, var9 ^ -1251994205);
            case 240 -> a(-1211380847, var9 ^ -788086361);
            case 241 -> a(-1211380846, var9 ^ 754548925);
            case 242 -> a(-1211380845, var9 ^ -572670733);
            case 243 -> a(-1211380844, var9 ^ -1853381238);
            case 244 -> a(-1211380843, var9 ^ 1756640781);
            case 245 -> a(-1211380842, var9 ^ -417428356);
            case 246 -> a(-1211380841, var9 ^ -1244869661);
            case 247 -> a(-1211380840, var9 ^ -1690740403);
            case 248 -> a(-1211380839, var9 ^ 931651498);
            case 249 -> a(-1211380838, var9 ^ 849108546);
            case 250 -> a(-1211380837, var9 ^ 1259139634);
            case 251 -> a(-1211380836, var9 ^ -1742567906);
            case 252 -> a(-1211380835, var9 ^ 909812213);
            case 253 -> a(-1211380834, var9 ^ -1422620285);
            case 254 -> a(-1211380833, var9 ^ 1199712327);
            default -> a(-1211380864, var9 ^ -1708312738);
         };
         int var5 = (var1 & a(-1211380863, var9 ^ -1001765555)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-1211380862, var9 ^ 1211676138)) >>> a(-1211380861, var9 ^ -1581073122)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-1211380860, var9 ^ -457834987);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-1211380859, var9 ^ 989273866);
            }
         }

         a[var2] = new String(var3).intern();
      }

      return a[var2];
   }
}
