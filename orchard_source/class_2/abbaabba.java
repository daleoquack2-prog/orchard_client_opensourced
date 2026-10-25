package nsc;

import java.util.ArrayDeque;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class abbaabba extends abbaabbaa {
   private final bababa aa;
   private static String[] ab;
   private static final int[] aaab;
   private static final long[] ba;
   private static final Object[] aabb;
   private static final Integer[] bb;
   private static final String[] aaba;
   private static final Long[] aaa;
   private final ArrayDeque aab;
   private final abbaabbab aba;
   private final abbaaaaa abb;
   private boolean baa;
   private static final String[] bab;
   private final abbaaaaa bba;
   private static final String[] bbb;
   private static final long[] aaaa;

   private static int a(int var0, int var1) {
      int var2 = aaab[var0 ^ 365375118] ^ var1 ^ var0;
      var2 += 47987;
      var2 += 2713;
      var2 -= 55216;
      var2 ^= 52822;
      var2 += 62537;
      var2 -= 18695;
      return var2 - 26521;
   }

   @Override
   public void aabaa() {
      int var1 = baaabbaa.bba;

      abbaabba var10000;
      while (true) {
         if (!this.aab.isEmpty()) {
            var10000 = this;
            if (var1 != 0) {
               break;
            }

            bbbaba var2 = (bbbaba)this.aab.pollFirst();

            label30: {
               label29: {
                  try {
                     var4 = var2;
                     if (var1 != 0) {
                        break label29;
                     }

                     if (var2 == null) {
                        break label30;
                     }
                  } catch (MatchException var3) {
                     throw var3;
                  }

                  var4 = var2;
               }

               var4.ba();
            }

            if (var1 == 0) {
               continue;
            }
         }

         var10000 = this;
         break;
      }

      var10000.baa = false;
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(365375118, -117360526 ^ 2110438475);
      if (bb[var3] == null) {
         bb[var3] = (int)(ba[var3] ^ var1);
      }

      return bb[var3];
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
      // 03: istore 1
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbab;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbab.abbb ()Ljava/lang/Object;
      // 0b: checkcast net/minecraft/class_3675$class_306
      // 0e: astore 2
      // 0f: aload 0
      // 10: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.babbaab ()Z
      // 13: iload 1
      // 14: ifne 26
      // 17: ifeq 4b
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 2
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 22: goto 26
      // 25: athrow
      // 26: iload 1
      // 27: ifne 3c
      // 2a: ifne 4b
      // 2d: goto 31
      // 30: athrow
      // 31: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 34: aload 2
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbab (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 38: goto 3c
      // 3b: athrow
      // 3c: iload 1
      // 3d: ifne 48
      // 40: ifeq 4b
      // 43: goto 47
      // 46: athrow
      // 47: bipush 1
      // 48: goto 4c
      // 4b: bipush 0
      // 4c: istore 3
      // 4d: iload 1
      // 4e: ifne a0
      // 51: iload 3
      // 52: ifeq 9b
      // 55: goto 59
      // 58: athrow
      // 59: aload 0
      // 5a: iload 1
      // 5b: ifne 9c
      // 5e: goto 62
      // 61: athrow
      // 62: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.baa Z
      // 65: ifne 9b
      // 68: goto 6c
      // 6b: athrow
      // 6c: aload 0
      // 6d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.ab [Ljava/lang/String;
      // 70: bipush 1
      // 71: aaload
      // 72: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 75: aload 0
      // 76: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.aab Ljava/util/ArrayDeque;
      // 79: invokevirtual java/util/ArrayDeque.size ()I
      // 7c: istore 5
      // 7e: astore 4
      // 80: new java/lang/StringBuilder
      // 83: dup
      // 84: invokespecial java/lang/StringBuilder.<init> ()V
      // 87: aload 4
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8c: iload 5
      // 8e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 91: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 94: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.b (Ljava/lang/String;)V
      // 97: goto 9b
      // 9a: athrow
      // 9b: aload 0
      // 9c: iload 3
      // 9d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.baa Z
      // a0: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = 1864651906;
      int var30 = "¡陵ᘢﲝ茹䣠䩁㗻뾭ꝅ硻㶺ༀ\ue7b0༏抈薶㐭違\uf631峑᳷\uf62eḠ門\ue312\uf51d㈍涯贉늀Ꮣ睛曾靖龵찝\udc22䆬\ude34艔귫勬작뚈䤍ꅷ㏵၇縩旑뚁쭙횭㥾鍪鍛⌻갏ꭞ\ue073\udfdd䗎ᅵ㸛⇢斶⺏涼莙줴\ue87b愯杁뼵콞\uf606З螫\ue58e틣朹ࡘ¥䓡巋栶疰뙞\uec93뻊ૌ邱ﯧ礳响汋쪭\u0ee8＄䛿୩ցժ㉌\uec97㉆ᠳ憟쒞\ue882麷└갫\uf055\u1f47\uea73鲍㵥敱\uebda轜熌\udf35炊⓱\ue9d1엒䖅怙♥觐齇ދ豗襌ﰶẶﱰ憩㫗¿\ud899༷ጪ縿\uec7b潞꯱柉쩤ꓠ솜ꂍ\udab7䉒砋葑\ufb18\uf344皕㿟!歪Ӓᨩ墲ꡎ꜊虻ᐝ硢ឿ﨔뿡\ue13e麟衕\ude3f䱬䄍㿪쎋ﴰぉ䀱뵕튵⅃䥑㕕僃뤍퉚ۣ郢hű萗ѱ搑\u0081ПݡЙܱЏڡ\ue416٩搙݉Оځ萖ǩ\ue412Бꐙ©ꐏܑꐊ߹Ђљ搃Ɂ䐛ɑ␚۩萁ȹ䐜ϱ搅͡搇ݙ␊ġ萁Չ搁ѡ䐂ġꐉс萎\u0379搌1쐜ޑЉi␅̑\ue40dˁ搐ر␕š萕ǡꐕˉꐅŉ搉܁搞ܡЖݱꐂѡГй萎Щꐚҩ䐁ԑДܹ\ue40a\u0379萅ƹ쐘֑䐊Щ\ue41eסЁ\n\uedd8䎷\uea50ζ\ue9a0ꎽ\uebe8\ue3a9\ueca0ꎨ\u0010\uf76b⿔\uf543濁\uf223꿍\uf28b꿃\uf17b\u0fdb\uf01b迊\uf06b꿛\uf183\uefd2\n噳\ued59击굘刋\u0d53偃䵇國െ0䇔\uf10f䌜\uf111䟴焊䒔ㄚ䊤ᄆ䁄儕䙔넎䁄\u3101䚌\uf115䈜焜䂄\uf112䄜鄁䔴ᄜ䐬넋䌴넔䝴\uf115䄬턀䇔儙䗤\uf109䝌턞䆔턎䇤儗䃌鄉䔄儈\n\uda18䍨\udd90ͩ\ude60ꍢ\udc28\ue376\udb60ꍷ\u0010倖祐取論倞饍兾륇准漏喦륉埖륂勎饖\nﮇ㿮ﰏ翯\uffff\udfe4ﶷ鿰\ufaff\udff1"
         .length();
      int var33 = 0;
      String[] var10001 = new String[10];
      short var34 = 21325;
      int var32 = 0;
      String[] var31 = var10001;
      String var29 = "¡陵ᘢﲝ茹䣠䩁㗻뾭ꝅ硻㶺ༀ\ue7b0༏抈薶㐭違\uf631峑᳷\uf62eḠ門\ue312\uf51d㈍涯贉늀Ꮣ睛曾靖龵찝\udc22䆬\ude34艔귫勬작뚈䤍ꅷ㏵၇縩旑뚁쭙횭㥾鍪鍛⌻갏ꭞ\ue073\udfdd䗎ᅵ㸛⇢斶⺏涼莙줴\ue87b愯杁뼵콞\uf606З螫\ue58e틣朹ࡘ¥䓡巋栶疰뙞\uec93뻊ૌ邱ﯧ礳响汋쪭\u0ee8＄䛿୩ցժ㉌\uec97㉆ᠳ憟쒞\ue882麷└갫\uf055\u1f47\uea73鲍㵥敱\uebda轜熌\udf35炊⓱\ue9d1엒䖅怙♥觐齇ދ豗襌ﰶẶﱰ憩㫗¿\ud899༷ጪ縿\uec7b潞꯱柉쩤ꓠ솜ꂍ\udab7䉒砋葑\ufb18\uf344皕㿟!歪Ӓᨩ墲ꡎ꜊虻ᐝ硢ឿ﨔뿡\ue13e麟衕\ude3f䱬䄍㿪쎋ﴰぉ䀱뵕튵⅃䥑㕕僃뤍퉚ۣ郢hű萗ѱ搑\u0081ПݡЙܱЏڡ\ue416٩搙݉Оځ萖ǩ\ue412Бꐙ©ꐏܑꐊ߹Ђљ搃Ɂ䐛ɑ␚۩萁ȹ䐜ϱ搅͡搇ݙ␊ġ萁Չ搁ѡ䐂ġꐉс萎\u0379搌1쐜ޑЉi␅̑\ue40dˁ搐ر␕š萕ǡꐕˉꐅŉ搉܁搞ܡЖݱꐂѡГй萎Щꐚҩ䐁ԑДܹ\ue40a\u0379萅ƹ쐘֑䐊Щ\ue41eסЁ\n\uedd8䎷\uea50ζ\ue9a0ꎽ\uebe8\ue3a9\ueca0ꎨ\u0010\uf76b⿔\uf543濁\uf223꿍\uf28b꿃\uf17b\u0fdb\uf01b迊\uf06b꿛\uf183\uefd2\n噳\ued59击굘刋\u0d53偃䵇國െ0䇔\uf10f䌜\uf111䟴焊䒔ㄚ䊤ᄆ䁄儕䙔넎䁄\u3101䚌\uf115䈜焜䂄\uf112䄜鄁䔴ᄜ䐬넋䌴넔䝴\uf115䄬턀䇔儙䗤\uf109䝌턞䆔턎䇤儗䃌鄉䔄儈\n\uda18䍨\udd90ͩ\ude60ꍢ\udc28\ue376\udb60ꍷ\u0010倖祐取論倞饍兾륇准漏喦륉埖륂勎饖\nﮇ㿮ﰏ翯\uffff\udfe4ﶷ鿰\ufaff\udff1";

      do {
         int var37 = 0;
         char var35 = var29.charAt(var33);
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            char var38 = var36[var37];
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 3 | var38 << '\r') & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 3 | var38 >>> '\r') & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      aaba = var31;
      aabb = new Object[var31.length];
      int var25 = -140528035;
      byte[] var23 = "\u0099l4\u0099\u0084YÄË»É]Õ\u009a\u0097q¢QÜ|<À¼\u0086\u0001=\u008aO\u001dT%ß\u0090\u0014E{½(×\u0015øÛxx@nn\u0082hO;\u0002\u00079\f×ZQ{Õ\u008dûÂ\u0001LÆ=\u001bõ\u009c\nþÉ/v\u008aCQô¼vE&\u00102p é\u0012OnÚùÕ\u001312Ü\u0099G\u0002É7\u0010\u0003ô-é\u0017@a$Z\"P\r\u001faãßLäl>°Ô^\u009e¬SìÌÒáy\u0091/\u0000=kP\u000fD\u0085X\u0013\u008e=Ð`¸ûy6É´Ú:8|\f»-ôÅÞò®\u0085±\u0081Ú`´Þ2Ê\u008fn\u001bàxîÐ\rÔr\u0092H[0fÊ[]ÌØ\u0010øø\u0016±û9\"\u008a\u001c\u0087)2\u0099óµQÔ\u008a\u0014Pi¶ð\u0015\u0083}R-\u008bð\u0085¬3°{\u0001Õ4\u008cè%]U\u00925£§ óÁ\u0098e\u00112³\u0087ê¢\u0087é\u008f\u0003`±h\u000f\u008e³4¨\u0083*}âøÙû\u0093DßªEG$\\\u0004È\u000f,¿C$~lMÏ:\u0015qí²°r\u0000\u0087\u0000}ÓV\u001a3ÿ\u0002\u0085HÕý\f.xþ#¾\u0089gFqçÁ@\u0011ÁÃïÊ1Z\u0014·àf\u0015\u0010¶[\u0018zà43\u007fß¥¯¡t=\u0011k\u0092â\u009b¬)é?\u0010q¤Îûl£\u0014%l´%\f8\u008f\u0001vä%\u0000¢S$ÄÞ³É\u0095ß¡½Ú\u0087q\u008f¼\u009c\u0012½\u0087útbS\u001d\u009f¬Ñ\u0016\bÉÅ_\u0086Ï\u0005\u007f\u0093ÔÝÌW¶I¨#@ôc\u0014ä²\u0090@²¦\u008fßæ;\\y\u001e\u0007\u009fÎáÆãS2s\u001a;zË-\u0080\u0085´\u008bpNòäóstî]\u0099Ê7â¼Ì\u00adeósÿÁ\u0011\u0007Ü³Dyÿæ\u0094R\u0087KÆ\u008c]¢Ø\u009cØ\u000bÕ²\u00128YÝá<&\u0016\u0019¼\u0087ú®\rÔR¯¤\u0090Õ´B¨µ\u0097ÊÝÁ\u0001~Ñ±`\u0019Ð\u009e\u0016íwW\u0010C\u0007ªnÎ\u0099\u0096\u0085Y@PÐr¶\u0080\u0000\fú°\u0003Ë·\u0095½\u009e\u0017\u009d¢Ð\u0088\u000bÿ7¸îlÒ:\nv\u0081\u0090Øí\u001c+*¹ó\u00060\u000bê\u0081\u0016PSuµú\u0014`õ¦Öp\u001a\u001eüïÃÜì\u0098\\\u0013Teè*vZ+~Ê¶¿iÍZ¥\tÓ\tÅ\u009f_x\u0094½\u009cAíÉqbá\u0097uíþù\r° Uö\u000bkHî)\u0003¾¯#\n\u0014×áý\u0011\u008e¤&? æ\u001ajÄGdMY+YA\u009cI\u0093¨Å4íäÖ£\bGE\u009cêS\u0006^l\u008bñ{\u0091&aL\u008fh\u0088¢·\u0018¯Dñ\u00adýz¹\u0000Ô\u00adáÚ}uEèÊÃm2\u000f%\u0092öq×\u0096y¹\bçÝÐ&ºÐv\u0007\u007f\u0014\f\u0093\u0007*F]s®³¦×q0çUBEr\u0019·\u009býµ¥[\u0005Ï£utaïË,\u00adaî\u0092\u0004\u009frlÁc_º\"\u0006\b\u0086\u0095)q\u0090 \u009a¾\u009ev\u0091côc\u0007~£\u0011Ï2RíÍµ\u008a6Æ+J~\u0005\u00adk\u0019-³-\"ÔÊ#Å\u001e]e6ÝÔ5=\u0089{\u0007ó¡\u0085+\u0087êé0K\u000fþ\u0080Ñ&\u008b]\u001aZ&\u0000¸©\u001d=ÎéÝt1{^+,9³[\u0011ÍÍbÃE¢vqãñ5\u008b\u009bïo<ò\u0002\u0093on\u009aNWc+ 1²¾:ð\u0087¬\u001cx SâªXÈ\u0099»\u008d(\u008880ÂxLí>)\u001bz·Vó\u0015\u0094\u001b\u0098÷ÃÊ\u0086?\u0014³Å\u0000\u009boè·\u0006\u00adX\u008f,¡JÊQ%ü4s5À{\f¤\u0016Ý³\u001cÁ\u009dwÁ\u001eé\u001cöyó¯ëf\t\u0012W;(J\u0089rO\nTÕ\u0096\u008c\u0096Þ_½¢sÖ\u001d÷×\u001aCwÄ2\u0097ý±\fh6J¹\n:¨\u0097\u00adl\u009b\\e\u0093óm«õ\u0011|\u0013\u001d\u0088\u000b\u0082·ªvbé\u0097~º¨þ´)]ÓÈ¦\u0012\u008aÇv¢Öw+ªÌ\u0097]¡\u0099\u0016þ\u008fÆúÞe\u0014ÛÝu<Æ\u008c|\u0099/Ú\n\u00adµ\u001añXCu\u0002\u001a\u0012\t\u0010Ï\f\u0017â\u0011òÏû\u0089XvjÓ\u0019©IÂ¤÷òª\u0090\u0093ï<=ÞÖQ©\u009eÈáÙ\u0010:B¨y^Î\u0082üt\u0012HboØgÔá5|hM)1\u009eT\u0080ñ¶\u0016zÍæ½\u009b}\u009d¨m\u008d5¿\u0080mY\u009fp=_~ÜÂ(aG·\u0096×¼ÔzÄ|\u008coîy\u008bC\u009cQ\f©oùÏPG\u000e,4égARgê«BÜC(³÷s5½á\u0088\u0086\u0014{ÇØ7Y\u001dY\u0083\u0004\u009d^N\u00017Ç{ ø¶®\u0085HÌ\u008e*Â#Z\u008a\u001c+¯IÖzNUï\u0097Ù%FÌ\u0091ÀàZ¾ãe\u0099ä\u008eö]È ô\u0098Î\u00123\u001fÒ¡.Òs\u0099ø\\\u0015&Ììr\u008e\u001d\u008aZý×Âå\u0087\u0082J¯±S\u001dÝc$\u0016T¡yõ!Q\u009e\u000eðzö/»ä\u0091\u0006´ª\u0089\u0084Ð\u008a\u001cÖ6¼Ê å2³ü\bs.4g!éS"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      aaab = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         aaab[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[a(365375149, var39 ^ 2110245511)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = aab(-257547990, var39 ^ -1575388143)).length();
      int var17 = a(365375146, var39 ^ 1628271920);
      int var43 = -1;

      label126:
      while (true) {
         String var10000 = var18.substring(++var43, var43 + var17);
         byte var52 = -1;

         while (true) {
            char[] var73;
            label121: {
               char[] var54 = var10000.toCharArray();
               int var10003 = var54.length;
               int var22 = 0;
               var73 = var54;
               int var57 = var10003;
               char[] var89;
               int var10004;
               if (var10003 <= 1) {
                  var89 = var54;
                  var10004 = var22;
               } else {
                  var73 = var54;
                  var57 = var10003;
                  if (var10003 <= var22) {
                     break label121;
                  }

                  var89 = var54;
                  var10004 = var22;
               }

               while (true) {
                  var89[var10004] = (char)(var89[var10004] ^ switch (var22 % a(365375145, var39 ^ 1220228054)) {
                     case 0 -> a(365375142, var39 ^ -911295354);
                     case 1 -> a(365375143, var39 ^ -1401821481);
                     case 2 -> a(365375140, var39 ^ -1023241599);
                     case 3 -> a(365375141, var39 ^ -966952255);
                     case 4 -> a(365375138, var39 ^ -34778043);
                     case 5 -> a(365375139, var39 ^ 174954498);
                     default -> a(365375136, var39 ^ -1494099443);
                  });
                  var22++;
                  if (var57 == 0) {
                     var10004 = var57;
                     var89 = var73;
                  } else {
                     if (var57 <= var22) {
                        break;
                     }

                     var89 = var73;
                     var10004 = var22;
                  }
               }
            }

            String var96 = new String(var73).intern();
            switch (var52) {
               case 0:
                  var21[var19++] = var96;
                  if ((var43 += var17) >= var20) {
                     bbb = var21;
                     bab = new String[a(365375144, var39 ^ 1145764608)];
                     long var8 = 8547989173192422175L;
                     long[] var14 = new long[a(365375137, var39 ^ 699607392)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = aab(-257547992, var39 ^ -1364111043)).length();
                     byte var10 = 0;

                     label100:
                     while (true) {
                        byte var61 = var10;
                        var10 += 8;
                        var10000 = var12.substring(var61, var10);
                        int var62 = -257547991;
                        int var79 = var39 ^ -1814819773;
                        byte[] var15 = var10000.getBytes("ISO-8859-1");
                        long[] var47 = var14;
                        int var63 = var11++;
                        long var80 = (var15[0] & 255L) << a(365375166, var39 ^ 702448836)
                           | (var15[1] & 255L) << a(365375167, var39 ^ 1652273155)
                           | (var15[2] & 255L) << a(365375164, var39 ^ -1015515508)
                           | (var15[3] & 255L) << a(365375165, var39 ^ -123746162)
                           | (var15[4] & 255L) << a(365375162, var39 ^ 1075493901)
                           | (var15[5] & 255L) << a(365375163, var39 ^ 592954789)
                           | (var15[a(365375160, var39 ^ 585824568)] & 255L) << a(365375161, var39 ^ 1728066201)
                           | var15[a(365375158, var39 ^ 1594408768)] & 255L;
                        byte var97 = -1;

                        while (true) {
                           long var102 = var80 ^ var8;
                           switch (var97) {
                              case 0:
                                 var47[var63] = var102;
                                 if (var10 >= var13) {
                                    ba = var14;
                                    bb = new Integer[a(365375180, var39 ^ -1044912316)];
                                    long var0 = 3242015295047936566L;
                                    long[] var6 = new long[a(365375181, var39 ^ 1493085511)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = aab(-257547988, var39 ^ 103421505)).length();
                                    byte var2 = 0;

                                    label90:
                                    while (true) {
                                       byte var66 = var2;
                                       var2 += 8;
                                       var10000 = var4.substring(var66, var2);
                                       int var67 = -257547987;
                                       int var83 = var39 ^ -1792271957;
                                       byte[] var7 = var10000.getBytes("ISO-8859-1");
                                       long[] var50 = var6;
                                       int var68 = var3++;
                                       long var84 = (var7[0] & 255L) << a(365375178, var39 ^ -1418142932)
                                          | (var7[1] & 255L) << a(365375179, var39 ^ -1389818586)
                                          | (var7[2] & 255L) << a(365375176, var39 ^ 1457474322)
                                          | (var7[3] & 255L) << a(365375177, var39 ^ 2108682384)
                                          | (var7[4] & 255L) << a(365375174, var39 ^ 1459430281)
                                          | (var7[5] & 255L) << a(365375175, var39 ^ -1111926084)
                                          | (var7[a(365375172, var39 ^ -1624113210)] & 255L) << a(365375173, var39 ^ 1912885194)
                                          | var7[a(365375170, var39 ^ -1579854462)] & 255L;
                                       byte var99 = -1;

                                       while (true) {
                                          var102 = var84 ^ var0;
                                          switch (var99) {
                                             case 0:
                                                var50[var68] = var102;
                                                if (var2 >= var5) {
                                                   aaaa = var6;
                                                   aaa = new Long[a(365375192, var39 ^ -1833468715)];
                                                   ab = new String[aa(a(365375193, var39 ^ 1389917072), 262914692073580590L)];
                                                   ab();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var50[var68] = var102;
                                                if (var2 < var5) {
                                                   continue label90;
                                                }

                                                var5 = (var4 = aab(-257547998, var39 ^ 1148090503)).length();
                                                var2 = 0;
                                          }

                                          byte var69 = var2;
                                          var2 += 8;
                                          var10000 = var4.substring(var69, var2);
                                          int var70 = -257547997;
                                          int var86 = var39 ^ 1897876999;
                                          var7 = var10000.getBytes("ISO-8859-1");
                                          var50 = var6;
                                          var68 = var3++;
                                          var84 = (var7[0] & 255L) << a(365375171, var39 ^ -1920873175)
                                             | (var7[1] & 255L) << a(365375168, var39 ^ -1484897212)
                                             | (var7[2] & 255L) << a(365375169, var39 ^ 175991917)
                                             | (var7[3] & 255L) << a(365375198, var39 ^ -68941387)
                                             | (var7[4] & 255L) << a(365375199, var39 ^ -1790832692)
                                             | (var7[5] & 255L) << a(365375196, var39 ^ -1287610340)
                                             | (var7[a(365375197, var39 ^ 1138318106)] & 255L) << a(365375194, var39 ^ -1830462792)
                                             | var7[a(365375195, var39 ^ -992454702)] & 255L;
                                          var99 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var47[var63] = var102;
                                 if (var10 < var13) {
                                    continue label100;
                                 }

                                 var13 = (var12 = aab(-257547986, var39 ^ -251699782)).length();
                                 var10 = 0;
                           }

                           byte var64 = var10;
                           var10 += 8;
                           var10000 = var12.substring(var64, var10);
                           int var65 = -257547985;
                           int var82 = var39 ^ -459208841;
                           var15 = var10000.getBytes("ISO-8859-1");
                           var47 = var14;
                           var63 = var11++;
                           var80 = (var15[0] & 255L) << a(365375159, var39 ^ -558827410)
                              | (var15[1] & 255L) << a(365375156, var39 ^ 1935047826)
                              | (var15[2] & 255L) << a(365375157, var39 ^ -1700392206)
                              | (var15[3] & 255L) << a(365375154, var39 ^ -524882929)
                              | (var15[4] & 255L) << a(365375155, var39 ^ 1383108137)
                              | (var15[5] & 255L) << a(365375152, var39 ^ 395476233)
                              | (var15[a(365375153, var39 ^ -177607354)] & 255L) << a(365375182, var39 ^ -1693692708)
                              | var15[a(365375183, var39 ^ -1007992782)] & 255L;
                           var97 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var96;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label126;
                  }

                  var20 = (var18 = aab(-257547989, var39 ^ 125253348)).length();
                  var17 = a(365375147, var39 ^ 305902808);
                  var43 = -1;
            }

            var10000 = var18.substring(++var43, var43 + var17);
            var52 = 0;
         }
      }
   }

   private static String aab(int var0, int var1) {
      int var3 = var0 ^ -257547990;
      char[] var4 = aaba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aabb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aabb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -515086306;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 172;
            case 1 -> 183;
            case 2 -> 91;
            case 3 -> 195;
            case 4 -> 82;
            case 5 -> 139;
            case 6 -> 22;
            case 7 -> 40;
            case 8 -> 231;
            case 9 -> 42;
            case 10 -> 186;
            case 11 -> 14;
            case 12 -> 229;
            case 13 -> 226;
            case 14 -> 237;
            case 15 -> 146;
            case 16 -> 96;
            case 17 -> 222;
            case 18 -> 39;
            case 19 -> 214;
            case 20 -> 102;
            case 21 -> 180;
            case 22 -> 53;
            case 23 -> 127;
            case 24 -> 102;
            case 25 -> 204;
            case 26 -> 49;
            case 27 -> 159;
            case 28 -> 40;
            case 29 -> 224;
            case 30 -> 52;
            case 31 -> 173;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private void b(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 3
      // 08: iload 2
      // 09: ifne 2b
      // 0c: aload 3
      // 0d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10: ifnull 22
      // 13: goto 17
      // 16: athrow
      // 17: aload 3
      // 18: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1b: ifnonnull 2c
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: bipush 0
      // 24: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.abbbaab (Z)V
      // 27: goto 2b
      // 2a: athrow
      // 2b: return
      // 2c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba
      // 2f: dup
      // 30: aload 3
      // 31: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 34: aload 1
      // 35: aload 0
      // 36: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 39: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 3c: checkcast java/lang/Double
      // 3f: invokevirtual java/lang/Double.floatValue ()F
      // 42: aload 0
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 46: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 49: checkcast java/lang/Boolean
      // 4c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4f: aload 0
      // 50: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 53: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 56: checkcast java/lang/Boolean
      // 59: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 5c: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.<init> (Lnet/minecraft/class_1657;Ljava/lang/String;FZZ)V
      // 5f: astore 4
      // 61: aload 4
      // 63: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaba.aa ()V
      // 66: aload 0
      // 67: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabba.aab Ljava/util/ArrayDeque;
      // 6a: aload 4
      // 6c: invokevirtual java/util/ArrayDeque.add (Ljava/lang/Object;)Z
      // 6f: pop
      // 70: return
   }

   private static void ab() {
      int var0 = 491645458;
      ab[0] = aaa(
         ba(a(365375119, var0 ^ -2068627556), a(365375116, var0 ^ -1155275637)).toCharArray(),
         bb(a(365375117, var0 ^ 1703073251), 5508438738701897921L),
         aa(a(365375114, var0 ^ -1362494206), 5577946426185184233L)
      );
      ab[1] = aaa(
         ba(a(365375115, var0 ^ -1068073645), a(365375112, var0 ^ 1029766415)).toCharArray(),
         bb(a(365375113, var0 ^ 1422884899), 7362600972229838790L),
         aa(a(365375110, var0 ^ 347033207), 8312522340441989877L)
      );
      ab[2] = aaa(
         ba(a(365375111, var0 ^ 675147432), a(365375108, var0 ^ -611138848)).toCharArray(),
         bb(a(365375109, var0 ^ -1854206296), 1676492569785531182L),
         aa(a(365375106, var0 ^ -1339125049), 2673867695303458212L)
      );
      ab[3] = aaa(
         ba(a(365375107, var0 ^ 971385869), a(365375104, var0 ^ 1368460533)).toCharArray(),
         bb(a(365375105, var0 ^ 81240310), 4407958806923070941L),
         aa(a(365375134, var0 ^ 958959522), 5907190888490385951L)
      );
      ab[4] = aaa(
         ba(a(365375135, var0 ^ -1663040140), a(365375132, var0 ^ 798810202)).toCharArray(),
         bb(a(365375133, var0 ^ -1361001937), 1915555241912133290L),
         aa(a(365375130, var0 ^ -1171015692), 5766295672657661092L)
      );
      ab[5] = aaa(
         ba(a(365375131, var0 ^ 1892291154), a(365375128, var0 ^ 1334061488)).toCharArray(),
         bb(a(365375129, var0 ^ 705119666), 4559861360044892284L),
         aa(a(365375126, var0 ^ 596437996), 7941979076204812842L)
      );
      ab[aa(a(365375127, var0 ^ -908205931), 2470750959592447712L)] = aaa(
         ba(a(365375124, var0 ^ -188280234), a(365375125, var0 ^ 1082904655)).toCharArray(),
         bb(a(365375122, var0 ^ 582628577), 6413642295131350055L),
         aa(a(365375123, var0 ^ 1628040578), 8637789898959798176L)
      );
      ab[aa(a(365375120, var0 ^ -460955689), 5572579070577251234L)] = aaa(
         ba(a(365375121, var0 ^ -726374933), a(365375150, var0 ^ 1392962443)).toCharArray(),
         bb(a(365375151, var0 ^ -510417805), 426771120533939459L),
         aa(a(365375148, var0 ^ 14090333), 408784958123382157L)
      );
   }

   private static String ba(int var0, int var1) {
      int var9 = -214330090;
      int var2 = (var0 ^ a(365375190, var9 ^ -1700555422)) & a(365375191, var9 ^ -2088561260);
      if (bab[var2] == null) {
         char[] var3 = bbb[var2].toCharArray();

         int var4 = switch (var3[0] & a(365375188, var9 ^ -948455893)) {
            case 0 -> a(365375189, var9 ^ -1623570478);
            case 1 -> a(365375186, var9 ^ -2109891287);
            case 2 -> a(365375187, var9 ^ -2111132872);
            case 3 -> 2;
            case 4 -> a(365375184, var9 ^ -703492298);
            case 5 -> a(365375185, var9 ^ 180062608);
            case 6 -> a(365375214, var9 ^ -1111863927);
            case 7 -> a(365375215, var9 ^ 1565989951);
            case 8 -> a(365375212, var9 ^ 1327715138);
            case 9 -> a(365375213, var9 ^ -1626262812);
            case 10 -> a(365375210, var9 ^ -64811493);
            case 11 -> a(365375211, var9 ^ -1694705000);
            case 12 -> a(365375208, var9 ^ 1899124964);
            case 13 -> a(365375209, var9 ^ -430486047);
            case 14 -> a(365375206, var9 ^ 1750174944);
            case 15 -> a(365375207, var9 ^ 2102023190);
            case 16 -> a(365375204, var9 ^ -1188511597);
            case 17 -> a(365375205, var9 ^ -841056964);
            case 18 -> a(365375202, var9 ^ -92652683);
            case 19 -> a(365375203, var9 ^ -1372836308);
            case 20 -> a(365375200, var9 ^ 829994273);
            case 21 -> a(365375201, var9 ^ -1753182641);
            case 22 -> a(365375230, var9 ^ 545214068);
            case 23 -> a(365375231, var9 ^ -1112736406);
            case 24 -> a(365375228, var9 ^ -706460333);
            case 25 -> a(365375229, var9 ^ 1847278924);
            case 26 -> a(365375226, var9 ^ -1630503969);
            case 27 -> a(365375227, var9 ^ 502135427);
            case 28 -> a(365375224, var9 ^ -1291369545);
            case 29 -> a(365375225, var9 ^ 203571917);
            case 30 -> a(365375222, var9 ^ -1955726664);
            case 31 -> a(365375223, var9 ^ 797937385);
            case 32 -> a(365375220, var9 ^ 1574631315);
            case 33 -> a(365375221, var9 ^ 134929160);
            case 34 -> a(365375218, var9 ^ -1520958130);
            case 35 -> a(365375219, var9 ^ 1279660714);
            case 36 -> a(365375216, var9 ^ -448054330);
            case 37 -> a(365375217, var9 ^ -691580004);
            case 38 -> a(365374990, var9 ^ -759652582);
            case 39 -> a(365374991, var9 ^ 1377399669);
            case 40 -> a(365374988, var9 ^ -481633209);
            case 41 -> a(365374989, var9 ^ 1242455527);
            case 42 -> a(365374986, var9 ^ -1405731973);
            case 43 -> a(365374987, var9 ^ 608391075);
            case 44 -> a(365374984, var9 ^ -1873856417);
            case 45 -> a(365374985, var9 ^ -145877431);
            case 46 -> a(365374982, var9 ^ 65658413);
            case 47 -> a(365374983, var9 ^ -1382473173);
            case 48 -> a(365374980, var9 ^ 537337827);
            case 49 -> a(365374981, var9 ^ -1210132020);
            case 50 -> a(365374978, var9 ^ -1675098022);
            case 51 -> a(365374979, var9 ^ -496748256);
            case 52 -> a(365374976, var9 ^ 623451323);
            case 53 -> a(365374977, var9 ^ 1888031880);
            case 54 -> a(365375006, var9 ^ 1041662904);
            case 55 -> a(365375007, var9 ^ -651794682);
            case 56 -> a(365375004, var9 ^ 1017414469);
            case 57 -> a(365375005, var9 ^ 1863209344);
            case 58 -> a(365375002, var9 ^ -222977125);
            case 59 -> a(365375003, var9 ^ 496548336);
            case 60 -> a(365375000, var9 ^ 69180940);
            case 61 -> a(365375001, var9 ^ -1108656955);
            case 62 -> a(365374998, var9 ^ -83985307);
            case 63 -> a(365374999, var9 ^ 955159476);
            case 64 -> a(365374996, var9 ^ 309414462);
            case 65 -> 5;
            case 66 -> 4;
            case 67 -> a(365374997, var9 ^ 34002421);
            case 68 -> a(365374994, var9 ^ -1157930511);
            case 69 -> a(365374995, var9 ^ -1731943782);
            case 70 -> a(365374992, var9 ^ 606615339);
            case 71 -> a(365374993, var9 ^ 600058783);
            case 72 -> a(365375022, var9 ^ 1033325753);
            case 73 -> a(365375023, var9 ^ -1310319305);
            case 74 -> a(365375020, var9 ^ 1927242885);
            case 75 -> a(365375021, var9 ^ -1610846401);
            case 76 -> a(365375018, var9 ^ -1686931655);
            case 77 -> a(365375019, var9 ^ -483481177);
            case 78 -> a(365375016, var9 ^ 412476091);
            case 79 -> a(365375017, var9 ^ 12028486);
            case 80 -> a(365375014, var9 ^ 1102938934);
            case 81 -> a(365375015, var9 ^ 964654451);
            case 82 -> a(365375012, var9 ^ 1614458678);
            case 83 -> a(365375013, var9 ^ 1316524922);
            case 84 -> a(365375010, var9 ^ 718925155);
            case 85 -> a(365375011, var9 ^ -1212821212);
            case 86 -> a(365375008, var9 ^ 1926699757);
            case 87 -> a(365375009, var9 ^ 732587226);
            case 88 -> a(365375038, var9 ^ 943554977);
            case 89 -> a(365375039, var9 ^ -1425906776);
            case 90 -> a(365375036, var9 ^ -390011647);
            case 91 -> a(365375037, var9 ^ 535107826);
            case 92 -> a(365375034, var9 ^ -1882061248);
            case 93 -> a(365375035, var9 ^ 1715224293);
            case 94 -> a(365375032, var9 ^ 1104836838);
            case 95 -> a(365375033, var9 ^ 333721659);
            case 96 -> a(365375030, var9 ^ 976447724);
            case 97 -> a(365375031, var9 ^ -1813263337);
            case 98 -> a(365375028, var9 ^ 610133227);
            case 99 -> a(365375029, var9 ^ -507831455);
            case 100 -> a(365375026, var9 ^ -1622597825);
            case 101 -> a(365375027, var9 ^ 1469476572);
            case 102 -> a(365375024, var9 ^ 1052259455);
            case 103 -> a(365375025, var9 ^ -1734740119);
            case 104 -> a(365375054, var9 ^ -502427961);
            case 105 -> a(365375055, var9 ^ -1463550597);
            case 106 -> a(365375052, var9 ^ 1563975391);
            case 107 -> a(365375053, var9 ^ -562438927);
            case 108 -> a(365375050, var9 ^ -1410559778);
            case 109 -> a(365375051, var9 ^ 1969437728);
            case 110 -> a(365375048, var9 ^ -1248115175);
            case 111 -> a(365375049, var9 ^ -1679103999);
            case 112 -> a(365375046, var9 ^ 632431840);
            case 113 -> a(365375047, var9 ^ 822711);
            case 114 -> a(365375044, var9 ^ -1661843124);
            case 115 -> a(365375045, var9 ^ -1322996856);
            case 116 -> 1;
            case 117 -> a(365375042, var9 ^ -434627418);
            case 118 -> a(365375043, var9 ^ -1626462050);
            case 119 -> a(365375040, var9 ^ 1342240832);
            case 120 -> a(365375041, var9 ^ -1922373010);
            case 121 -> a(365375070, var9 ^ -1875011454);
            case 122 -> a(365375071, var9 ^ -590584781);
            case 123 -> a(365375068, var9 ^ 1528086412);
            case 124 -> a(365375069, var9 ^ -975898807);
            case 125 -> a(365375066, var9 ^ 1140166908);
            case 126 -> a(365375067, var9 ^ 1572055969);
            case 127 -> a(365375064, var9 ^ 616385813);
            case 128 -> a(365375065, var9 ^ -1275347141);
            case 129 -> a(365375062, var9 ^ 984331662);
            case 130 -> a(365375063, var9 ^ -1785103731);
            case 131 -> a(365375060, var9 ^ 1807027850);
            case 132 -> a(365375061, var9 ^ 128893618);
            case 133 -> a(365375058, var9 ^ 270424244);
            case 134 -> a(365375059, var9 ^ 1707315778);
            case 135 -> a(365375056, var9 ^ -929156621);
            case 136 -> a(365375057, var9 ^ -207403160);
            case 137 -> a(365375086, var9 ^ 871020711);
            case 138 -> a(365375087, var9 ^ -1330273277);
            case 139 -> a(365375084, var9 ^ 1573230797);
            case 140 -> a(365375085, var9 ^ 603736670);
            case 141 -> a(365375082, var9 ^ 1290336332);
            case 142 -> a(365375083, var9 ^ 531301015);
            case 143 -> a(365375080, var9 ^ 32617010);
            case 144 -> a(365375081, var9 ^ -334633463);
            case 145 -> a(365375078, var9 ^ 1959845590);
            case 146 -> a(365375079, var9 ^ -985745203);
            case 147 -> a(365375076, var9 ^ 1352956168);
            case 148 -> a(365375077, var9 ^ 1115877384);
            case 149 -> a(365375074, var9 ^ -1115938194);
            case 150 -> a(365375075, var9 ^ 638005997);
            case 151 -> a(365375072, var9 ^ -971591661);
            case 152 -> a(365375073, var9 ^ 753321450);
            case 153 -> a(365375102, var9 ^ -793274989);
            case 154 -> a(365375103, var9 ^ 1506310733);
            case 155 -> a(365375100, var9 ^ 2055540945);
            case 156 -> a(365375101, var9 ^ 760483762);
            case 157 -> a(365375098, var9 ^ -97694535);
            case 158 -> a(365375099, var9 ^ 1978753458);
            case 159 -> a(365375096, var9 ^ -399257430);
            case 160 -> a(365375097, var9 ^ -1036008693);
            case 161 -> a(365375094, var9 ^ -1078234101);
            case 162 -> a(365375095, var9 ^ -1649717624);
            case 163 -> a(365375092, var9 ^ -499474474);
            case 164 -> a(365375093, var9 ^ 1568819253);
            case 165 -> a(365375090, var9 ^ -1721788617);
            case 166 -> a(365375091, var9 ^ -228003781);
            case 167 -> a(365375088, var9 ^ 1098247697);
            case 168 -> a(365375089, var9 ^ -53890520);
            case 169 -> a(365375374, var9 ^ -1541932335);
            case 170 -> a(365375375, var9 ^ -456499846);
            case 171 -> a(365375372, var9 ^ 1644713647);
            case 172 -> a(365375373, var9 ^ 1396505109);
            case 173 -> a(365375370, var9 ^ -211198099);
            case 174 -> a(365375371, var9 ^ -1377219400);
            case 175 -> a(365375368, var9 ^ 2036547082);
            case 176 -> a(365375369, var9 ^ -2035760456);
            case 177 -> a(365375366, var9 ^ -459005775);
            case 178 -> a(365375367, var9 ^ 1139938155);
            case 179 -> a(365375364, var9 ^ -1962050746);
            case 180 -> a(365375365, var9 ^ 1164679635);
            case 181 -> a(365375362, var9 ^ -41746275);
            case 182 -> 3;
            case 183 -> a(365375363, var9 ^ 1814635091);
            case 184 -> a(365375360, var9 ^ -1938352008);
            case 185 -> a(365375361, var9 ^ 1412854190);
            case 186 -> a(365375390, var9 ^ -943498739);
            case 187 -> a(365375391, var9 ^ 1217135173);
            case 188 -> a(365375388, var9 ^ -1740875393);
            case 189 -> a(365375389, var9 ^ -986430411);
            case 190 -> a(365375386, var9 ^ -1287712548);
            case 191 -> a(365375387, var9 ^ 269569623);
            case 192 -> a(365375384, var9 ^ 821795928);
            case 193 -> a(365375385, var9 ^ 871085115);
            case 194 -> a(365375382, var9 ^ 1658982844);
            case 195 -> a(365375383, var9 ^ 882124269);
            case 196 -> a(365375380, var9 ^ -193998440);
            case 197 -> a(365375381, var9 ^ -1684237678);
            case 198 -> a(365375378, var9 ^ -410106064);
            case 199 -> a(365375379, var9 ^ -109273345);
            case 200 -> a(365375376, var9 ^ 560267764);
            case 201 -> a(365375377, var9 ^ -1728816123);
            case 202 -> a(365375406, var9 ^ 1205291558);
            case 203 -> a(365375407, var9 ^ 426517046);
            case 204 -> a(365375404, var9 ^ 2104603789);
            case 205 -> a(365375405, var9 ^ 810080653);
            case 206 -> a(365375402, var9 ^ 1884711186);
            case 207 -> a(365375403, var9 ^ -22754580);
            case 208 -> a(365375400, var9 ^ -1749007944);
            case 209 -> a(365375401, var9 ^ 317364752);
            case 210 -> a(365375398, var9 ^ -1930340542);
            case 211 -> a(365375399, var9 ^ 981450188);
            case 212 -> a(365375396, var9 ^ -2032951073);
            case 213 -> a(365375397, var9 ^ 1892288779);
            case 214 -> a(365375394, var9 ^ 1485370820);
            case 215 -> a(365375395, var9 ^ 136516226);
            case 216 -> a(365375392, var9 ^ 1932977562);
            case 217 -> a(365375393, var9 ^ -618592135);
            case 218 -> a(365375422, var9 ^ -1224607568);
            case 219 -> a(365375423, var9 ^ -1310698301);
            case 220 -> a(365375420, var9 ^ -956313727);
            case 221 -> a(365375421, var9 ^ 2018063656);
            case 222 -> a(365375418, var9 ^ -1805978533);
            case 223 -> a(365375419, var9 ^ -2123304484);
            case 224 -> a(365375416, var9 ^ -1392320984);
            case 225 -> a(365375417, var9 ^ 1207005577);
            case 226 -> a(365375414, var9 ^ -1093040578);
            case 227 -> a(365375415, var9 ^ -629674171);
            case 228 -> a(365375412, var9 ^ -1124506902);
            case 229 -> a(365375413, var9 ^ -1404908725);
            case 230 -> a(365375410, var9 ^ 1567226887);
            case 231 -> a(365375411, var9 ^ 1400832152);
            case 232 -> a(365375408, var9 ^ -85635254);
            case 233 -> a(365375409, var9 ^ -641231400);
            case 234 -> a(365375438, var9 ^ 1838814606);
            case 235 -> a(365375439, var9 ^ -1600143364);
            case 236 -> a(365375436, var9 ^ -1791070141);
            case 237 -> a(365375437, var9 ^ 1075560662);
            case 238 -> a(365375434, var9 ^ 1622428253);
            case 239 -> a(365375435, var9 ^ -1273719716);
            case 240 -> a(365375432, var9 ^ 1104632088);
            case 241 -> a(365375433, var9 ^ -1597282516);
            case 242 -> a(365375430, var9 ^ 935054973);
            case 243 -> a(365375431, var9 ^ 2136893664);
            case 244 -> a(365375428, var9 ^ 1350430072);
            case 245 -> a(365375429, var9 ^ 168853066);
            case 246 -> a(365375426, var9 ^ 650017915);
            case 247 -> a(365375427, var9 ^ 546093824);
            case 248 -> a(365375424, var9 ^ 1010804600);
            case 249 -> a(365375425, var9 ^ -1660456797);
            case 250 -> a(365375454, var9 ^ -71810143);
            case 251 -> a(365375455, var9 ^ -1676635107);
            case 252 -> a(365375452, var9 ^ -1268555822);
            case 253 -> 0;
            case 254 -> a(365375453, var9 ^ 186190429);
            default -> a(365375450, var9 ^ 1093655325);
         };
         int var5 = (var1 & a(365375451, var9 ^ 872262690)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(365375448, var9 ^ 1170273986)) >>> a(365375449, var9 ^ -808513231)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(365375446, var9 ^ 518290966);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(365375447, var9 ^ 1434065214);
            }
         }

         bab[var2] = new String(var3).intern();
      }

      return bab[var2];
   }

   private static long bb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(365375444, -1862772238 ^ 972386122)) & a(365375445, -1862772238 ^ -1574183160);
      if (aaa[var3] == null) {
         aaa[var3] = aaaa[var3] ^ var1;
      }

      return aaa[var3];
   }

   @Override
   public void abaab() {
      this.aab.clear();
      this.b(aabbaaaba.abba(ab[0]));
   }

   public abbaabba() {
      super(
         aabbaaaba.aaab(ab[4]),
         bbaabbba.bba,
         aabbaaaba.aaab(ab[5])
      );
      this.aba = (abbaabbab)this.abbbaaa(
         new abbaabbab(
            aabbaaaba.aaab(ab[aa(a(365375442, -1383297713 ^ 2036979798), 4661932855337214631L)])
         )
      );
      this.abb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(aabbaaaba.aaab(ab[2]), true)
      );
      this.bba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(aabbaaaba.aaab(ab[3]), false)
      );
      this.aa = (bababa)this.abbbaaa(
         new bababa(
            aabbaaaba.aaab(ab[aa(a(365375443, -1383297713 ^ -1427747162), 4523302433797882113L)]), 20.0, 1.0, 40.0, 1.0
         )
      );
      this.aab = new ArrayDeque();
   }

   private static String aaa(char[] var0, long var1, int var3) {
      int var4 = aa(a(365375440, -1063475026 ^ 716699961), 241748868425794251L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aa(a(365375441, -1063475026 ^ 1172651461), 9015283758782726560L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
