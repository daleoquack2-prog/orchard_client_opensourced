package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_4604;
import net.minecraft.class_757;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
record abbabbbab(class_4184 a, class_4604 b, class_757 c, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
   private static final int[] bba;
   private final class_757 aa;
   private static final Long[] ab;
   private final Matrix4f ba;
   private static final Object[] aaaa;
   private static final String[] bb;
   private final class_4184 aaa;
   private static final long[] a;
   private static final Integer[] aab;
   private static final String[] bbb;
   private static final long[] aba;
   private final class_4604 abb;
   private static String[] b;
   private static final String[] baa;
   private final Matrix4f bab;

   private static Object aa(Object param0, Class param1, String[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: astore 4
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 06: aload 4
      // 08: arraylength
      // 09: istore 5
      // 0b: istore 3
      // 0c: bipush 0
      // 0d: istore 6
      // 0f: iload 6
      // 11: iload 5
      // 13: if_icmpge 66
      // 16: aload 4
      // 18: iload 6
      // 1a: aaload
      // 1b: astore 7
      // 1d: aload 0
      // 1e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 21: aload 7
      // 23: bipush 0
      // 24: anewarray 55
      // 27: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 2a: astore 8
      // 2c: aload 8
      // 2e: bipush 1
      // 2f: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
      // 32: aload 8
      // 34: aload 0
      // 35: bipush 0
      // 36: anewarray 49
      // 39: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3c: astore 9
      // 3e: aload 1
      // 3f: iload 3
      // 40: ifne 59
      // 43: aload 9
      // 45: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 48: ifeq 5a
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 1
      // 50: aload 9
      // 52: invokevirtual java/lang/Class.cast (Ljava/lang/Object;)Ljava/lang/Object;
      // 55: goto 59
      // 58: athrow
      // 59: areturn
      // 5a: goto 5f
      // 5d: astore 8
      // 5f: iinc 6 1
      // 62: iload 3
      // 63: ifeq 0f
      // 66: aconst_null
      // 67: areturn
   }

   public class_4184 ab() {
      return this.aaa;
   }

   public class_4604 ba() {
      return this.abb;
   }

   private static int b(int var0, int var1) {
      int var2 = bba[var0 ^ -2064788262] ^ var1 ^ var0;
      var2 -= 15006;
      var2 += 15178;
      var2 -= 23878;
      var2 ^= 30573;
      var2 ^= 25090;
      var2 ^= 23899;
      var2 += 7802;
      var2 += 30123;
      return var2 - 51840;
   }

   public class_757 bb() {
      return this.aa;
   }

   private static void aaa() {
      int var0 = -1047942678;
      b[0] = abb(
         bbb(b(-2064788241, var0 ^ -1580229623), b(-2064788244, var0 ^ -1932512973)).toCharArray(),
         a(b(-2064788243, var0 ^ 1911939590), 3611812871295536616L),
         aba(b(-2064788254, var0 ^ 1360409378), 1837862187972889281L)
      );
      b[1] = abb(
         bbb(b(-2064788253, var0 ^ 197825199), b(-2064788256, var0 ^ -597201413)).toCharArray(),
         a(b(-2064788255, var0 ^ 1683395508), 1887008471013780033L),
         aba(b(-2064788250, var0 ^ -710286640), 90448989894466929L)
      );
      b[2] = abb(
         bbb(b(-2064788249, var0 ^ 1116713090), b(-2064788252, var0 ^ 1905443648)).toCharArray(),
         a(b(-2064788251, var0 ^ 570928754), 3150307304021188291L),
         aba(b(-2064788326, var0 ^ -1691003128), 4954099115307082681L)
      );
      b[3] = abb(
         bbb(b(-2064788325, var0 ^ 1120193069), b(-2064788328, var0 ^ 1154093192)).toCharArray(),
         a(b(-2064788327, var0 ^ -579468380), 5512006226736035479L),
         aba(b(-2064788322, var0 ^ -363691938), 6825350353446907112L)
      );
      b[4] = abb(
         bbb(b(-2064788321, var0 ^ -757083249), b(-2064788324, var0 ^ 320904282)).toCharArray(),
         a(b(-2064788323, var0 ^ 314215525), 6484623385617680762L),
         aba(b(-2064788334, var0 ^ 828713085), 2143993074634617064L)
      );
      b[5] = abb(
         bbb(b(-2064788333, var0 ^ 923773668), b(-2064788336, var0 ^ -315800348)).toCharArray(),
         a(b(-2064788335, var0 ^ -1168888691), 7316245370816953008L),
         aba(b(-2064788330, var0 ^ -1094760987), 1035302963821599979L)
      );
   }

   private static Matrix4f aab(Object param0, String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: astore 3
      // 02: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 05: aload 3
      // 06: arraylength
      // 07: istore 4
      // 09: bipush 0
      // 0a: istore 5
      // 0c: istore 2
      // 0d: iload 5
      // 0f: iload 4
      // 11: if_icmpge 6c
      // 14: aload 3
      // 15: iload 5
      // 17: aaload
      // 18: astore 6
      // 1a: aload 0
      // 1b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1e: aload 6
      // 20: bipush 0
      // 21: anewarray 55
      // 24: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 27: astore 7
      // 29: aload 7
      // 2b: bipush 1
      // 2c: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
      // 2f: aload 7
      // 31: aload 0
      // 32: bipush 0
      // 33: anewarray 49
      // 36: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 39: astore 8
      // 3b: aload 8
      // 3d: iload 2
      // 3e: ifne 51
      // 41: instanceof org/joml/Matrix4fc
      // 44: ifeq 60
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 8
      // 4d: goto 51
      // 50: athrow
      // 51: checkcast org/joml/Matrix4fc
      // 54: astore 9
      // 56: new org/joml/Matrix4f
      // 59: dup
      // 5a: aload 9
      // 5c: invokespecial org/joml/Matrix4f.<init> (Lorg/joml/Matrix4fc;)V
      // 5f: areturn
      // 60: goto 65
      // 63: astore 7
      // 65: iinc 5 1
      // 68: iload 2
      // 69: ifeq 0d
      // 6c: aconst_null
      // 6d: areturn
   }

   private static int aba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-2064788329, -1558823431 ^ 1075181425);
      if (aab[var3] == null) {
         aab[var3] = (int)(aba[var3] ^ var1);
      }

      return aab[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = -1350869967;
      short var23 = 14357;
      char[] var25 = "K!8\n\u0010\n \n\u0010\n".toCharArray();
      byte var30 = -1;
      String var24 = "齡鸊ﬢﯣ阩\udd7d䨱ờ\ue34f愧ẓ\u09bb⸴㭁ฮ켻配莬\ue6fd癩ﺬ╌ﶯﳅ習\uf43f犜뇙ɺ웙팕︺齃渖\uee6d鐭魢\ue394䆖꿏㻍샥ஔ왿鶂䩖헟舏뉟禋缞\ue330\uf2c7\udf8b⻡︫ᔝ༿伵펢澧땺\ue3c0⺪䚪㖷즆翬격煢싪㱻\ude53⓫⟾㷏헂\u038b兡张陣䤉Ꝓ⤻諆癈\ud991ﶸ\ued75匚뒍袡犖ᜯ\ue953铤篟⚿㐭䝻ѣ貅䳆ㅉᗷꀆ⏎⋃쇹샒샅쿶쾶쀈샫쁜솪섷쇴쁾솲삎생쾩쁭섓솳쇉쾬섡샯솑쀂쁋삪셱쀯쁯쁮삸섒솾쇣쇩샄솸솣쾷솓삨켶쿬쁌쾇켕샥쿻쀪쀐케쁕쀰쇳쾄럄뜫띍랼럽럵띱띿랼럴咍䭯呭䬩䪊哦员䭔䭑䭝咕䨋䮫䮋吢䪡톞턹턗톮퇿퇷\udf13텥톮\udfae㕶㙑㙮㚯㛡㘾㙏㘑㔣㒋㒾㘨㐋㚓㚔㔢㗐㗊㔳㕀㕌㘤㖕㕱㗖㘻㗐㗻㛏㚓㔗㙉@\u0097ñH\u0019\u0011õ\u009bH\u0000䛟䝓䛝䘦䜾䙿䛽䛘䘪䛐䙈䚔䝌䘟䟋䘚郝邺邬鿕龤龬鼘鼦鿕遭";
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         char var28 = 0;
         char var29 = '\u0000';
         if (var30 == 0) {
            bbb = var26;
            aaaa = new Object[var26.length];
            byte var40 = 0;
            int var10001 = 0;
            byte[] var10002 = "ÎCÛ«|kG·i\u00017\u001cAC\"{\u009f\u009e½Ìï³\u0013g@¨¸z\u0014\u0090ïõû\u0088ýsQmHxt0]õÄ²fØÃB\u001e\u0080å´RZk~?\u008e\u0015Ù!m\t\u008ax\u0002\u0004O¿\u0094ª\u009f\u008a¤\u0012U>S\nÐ\u009d\"X\u0014è\u0018A>ÜG\u009b\u0093æYYY×tÒ1Ó®.f÷º´o¿Ñï³6Ë¹h\u0019\u0095m@X\u008eg\u00148å\u0007^Bº%PX±\u000eÍ\u000eÁû\b\u0014w@`Y\u008fÊN?ÜVz·\u009fµ#\u0087\u0015Ò*5\\è\u0018\u000bµ\u0088¹¡á\u009fÊçgM$Û\u009cr\u0000¾J\u001e\\\u000e\u0019\u000b\u0088\u0014 \\Ìß\u009f^\u0085]\u0013\u000eK\u0086{]8»,ì$Pü:ä\u00ad^è\u0004jp\u0015!¬N5Â¬Ü\u0090á£í¸³Þz\u0000\u0082<\u0012±}¬»Ù¤\u0081É\u0015FR\"FÓ\u0005Pÿá\u0000JÙïûñßá\u000f\\¹£\u0080Õ\u008e\u0086=ÏIôâºwôÙ\fvn\u009eíU°¡ú¬$\u009bÜ\u0089ù=÷Þ\u0080\u0093¦Úk\bgF^Ú\u0002&¦:yÿÂQÛ^\u0012D¯âèÃX\u001a\u001d\\áäÜ|oâ$,Â¡×Ú\u0006ªQ2WfÖº¢\u0094fª\u0013a\u008eFá\u0082Ù\u0011|\u000bí\u0003¬Ë]\u0019Hýö*Zâþa\u001fÅ+N´5ÉD/%}a\fkmì¼cOñ\u009cþ\u008d\u0095\u0091E\u0089\u001dÕ\u000ef?\u0097¸\u0090W ¾Ý\u001b\u008e®]¸ªá\u008eù\u0005uG\u001bN'\u0084\u0016`»D\u001ddO\r+\u0017\u008e¶:Þ\u009e©\u0085®\u008aÇ\u0005ê¼¾Kg¢+_`\u0014¾\"[ãª\u0002Ã\u001f¸ß¬<5U\u0094&¹\u000bc&¶³tPn¨áu»ý\u0019*\u008f\u0092\u0007Ã¯Ñ\u0091\u0094\u008c\u009eÂéþ\u0002t÷\u009eîll\u009b{\u0081ßñÔ\u0086ü·\u0013BïæX\u0092XØ\u0013\u001b\u0083Î\u0087#÷üUç ¶Ô0.\u0080À\u008aim=\u009bk3õ*¹e\u008dWk6=\u0003Y\u0092³J ï¨âÌ3I\u0010þë¦Yq}è\u009dÕÌG 'Éà\u0006£ÞBê\u0094\u001aÚ_\u0017\u0000³Yæ1\u0087\u0019o\u0091\u0090\u001d\u0093û?G/ý\u0014· )\u0082«}\u009c÷\u009dD\u0018õá½\u0081\u009fs4Y{[s\u009bfù\føL[ºKpØ$/\u001aµ\u0084X\u0012\u0011»\u0093g A÷æ «p90\\Å\u0080Ãq/¾\u0012ÈnÒÿJûû\u00ad(Âi\u0088 ¤×\u0094¼P\u008aê\u0098¯Oóò¡\u0010ðÑèÀ\u0099Ý8yL©\u009be>ÿÅT\u0003êxI(Ñ!\u0084Oî\u0006Ë\u000e~J\u009aXÖÎrÕ\u008bë]\u0015=\u00ad\u009cw`C¢þð/ó\u001e%îD\u001b\u008f\u0019Ààèêt)¹lX\u0086!\u0016â´\u001bQü|\u0091\u0014ö\u0085R q<x×xN\u007f*\u009brÀ\u009b\u0013V\u0099]±\u0087º¸N¯\u0082d¾\u0018ga\u0019ÄV· ±à?ÖÓ÷\u0016ÇéB¼î¥S\u0003,\u0088Ú|Q½c\u0083ë¥w\u0014\u0019f ¿Ê§\u009bÙf\u0089;Àfà\u001c)'D ,W«IxèÍ#{¨[ÒzÅ88]\u001aì\u008bÌÑ*+fF\u0089\u0003\u000b\u0005q(ÿÚzSû=ç[òôf`n®\u0005VqèDac;òª)\reáfi9¹\u0018#»£¬ÏV*ÚÉK\u0099\u0097ÚX¯ee_ø¾ÊÚ\"\u009f¢ê¤\u0089\u0096ääØél*ènÓo»ÒXh$\u000eUGBÀýb Ôx\tßOÒã£\u0004=\u009f\">\u0010 \"\u000bYx#C\u0098¡_ø²¥m\u0095\u000f\u0010\u0080X©\u008e¤X)\r´ ¸ÞÜ j\u000b7Ì\u0084IÇCÚí\n <LJÞÜ\u0097ü±¶Qé¬Ù\u0010(MÜ)£Â}Y°jÃP\u008fëçU¢\u0085*\u0003Ë\u008c\u000bDdü ì¹-·8>Ï\u001e\" ð¡!Aõ\fÊô\u0093ö\u0016X]#]m-O\u009d{ê5\u0013Ï\u001a/K21Kðã5j\bA\u0088m¢\u009adõ±¥®c<\u0081R\u008d´Úòz³¯C°«\u0096$fHÖ9Nu\u0002Òîà\u000bô Fö\u008cö\u00885¸\"\u0084+ ç;[âQz%¶\u0097¨²\u000b\u009dh·ûO\u009bX×çá-KU\u009d©\u0082\u0098nº\u0002a/ò\u000fÙ\u008b$²RÈ\f®Ã;|¼\u0083..\u008c\u0014è×\u008dRS\u0000§¶àc¶ò\u0096%>\u007f<\u0007Ï\u007fÐÍüm\u0007\u0017Ó\u0091ú\u0011Ñ§Ìèð\u008a\u008dßÈ\u00005¬\u0092ðd\u0014EmÕÞ7ÃRXzÉJR\u0088ã\u0002\rÊôRv\u00819\u009e\u0001Ó\u007f\u0002~²õPô\u0097ª;³\u0001¤y9\u0003Å\u009f÷\u008b6\u0012ÐÅþ,Y\u0003ö\u009dø¸\f-ä{¦\u0090\u0089¹ðQ¬l\u0087¯\u0018\u008dÀ\u008eh\\`"
               .getBytes("ISO-8859-1");
            bba = new int[340];

            int var99;
            do {
               bba[var40] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 565231058;
               var40 += 1;
               var99 = var10001 + 4;
               var10001 += 4;
            } while (var99 < var10002.length);

            String[] var21 = new String[b(-2064788262, var34 ^ -1000000387)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = aaaa(var34 ^ -697206532, 56229, '탣')).length();
            int var17 = b(-2064788261, var34 ^ 1984800894);
            int var38 = -1;

            label142:
            while (true) {
               String var41 = var18.substring(++var38, var38 + var17);
               var10001 = (byte)-1;

               while (true) {
                  label137: {
                     char[] var53 = var41.toCharArray();
                     var99 = var53.length;
                     int var22 = 0;
                     var78 = var53;
                     var10001 = var99;
                     char[] var103;
                     int var125;
                     if (var99 <= 1) {
                        var103 = var53;
                        var125 = var22;
                     } else {
                        var78 = var53;
                        var10001 = var99;
                        if (var99 <= var22) {
                           break label137;
                        }

                        var103 = var53;
                        var125 = var22;
                     }

                     while (true) {
                        var103[var125] = (char)(var103[var125] ^ switch (var22 % b(-2064788258, var34 ^ -1783082495)) {
                           case 0 -> b(-2064788257, var34 ^ -443155088);
                           case 1 -> b(-2064788260, var34 ^ 1250842226);
                           case 2 -> b(-2064788259, var34 ^ 515244427);
                           case 3 -> b(-2064788270, var34 ^ -240250182);
                           case 4 -> b(-2064788269, var34 ^ 1531684792);
                           case 5 -> b(-2064788272, var34 ^ 2115417064);
                           default -> b(-2064788271, var34 ^ -829126534);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var125 = var10001;
                           var103 = var78;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var103 = var78;
                           var125 = var22;
                        }
                     }
                  }

                  String var110 = new String(var78).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var110;
                        if ((var38 += var17) >= var20) {
                           baa = var21;
                           bb = new String[b(-2064788263, var34 ^ 1264962990)];
                           long var8 = 5169931031437637821L;
                           long[] var14 = new long[b(-2064788266, var34 ^ -916131489)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = aaaa(var34 ^ -1345295678, 19862, '탡')).length();
                           byte var10 = 0;

                           label116:
                           while (true) {
                              int var60 = var10;
                              var10 += 8;
                              String var43 = var12.substring(var60, var10);
                              var60 = var34 ^ 209415563;
                              short var84 = 19561;
                              char var111 = '탠';
                              byte[] var15 = var43.getBytes("ISO-8859-1");
                              long[] var44 = var14;
                              var60 = var11++;
                              long var85 = (var15[0] & 255L) << b(-2064788265, var34 ^ -275596241)
                                 | (var15[1] & 255L) << b(-2064788268, var34 ^ 1633210848)
                                 | (var15[2] & 255L) << b(-2064788267, var34 ^ 536858378)
                                 | (var15[3] & 255L) << b(-2064788278, var34 ^ 61642690)
                                 | (var15[4] & 255L) << b(-2064788277, var34 ^ 241782877)
                                 | (var15[5] & 255L) << b(-2064788280, var34 ^ -1598462602)
                                 | (var15[b(-2064788279, var34 ^ 410243478)] & 255L) << b(-2064788274, var34 ^ 16151294)
                                 | var15[b(-2064788273, var34 ^ 1379010500)] & 255L;
                              byte var112 = -1;

                              while (true) {
                                 long var127 = var85 ^ var8;
                                 switch (var112) {
                                    case 0:
                                       var44[var60] = var127;
                                       if (var10 >= var13) {
                                          aba = var14;
                                          aab = new Integer[b(-2064788283, var34 ^ 1832048425)];
                                          long var0 = 5080376327995745495L;
                                          long[] var6 = new long[b(-2064788230, var34 ^ 226012492)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = aaaa(var34 ^ -1646977392, 23052, '탥')).length();
                                          byte var2 = 0;

                                          label106:
                                          while (true) {
                                             int var65 = var2;
                                             var2 += 8;
                                             String var46 = var4.substring(var65, var2);
                                             var65 = var34 ^ 2002062136;
                                             char var88 = '햻';
                                             var111 = '탤';
                                             byte[] var7 = var46.getBytes("ISO-8859-1");
                                             long[] var47 = var6;
                                             var65 = var3++;
                                             long var89 = (var7[0] & 255L) << b(-2064788229, var34 ^ 796309224)
                                                | (var7[1] & 255L) << b(-2064788232, var34 ^ 82567299)
                                                | (var7[2] & 255L) << b(-2064788231, var34 ^ -248579524)
                                                | (var7[3] & 255L) << b(-2064788226, var34 ^ 1246148219)
                                                | (var7[4] & 255L) << b(-2064788225, var34 ^ -1066872799)
                                                | (var7[5] & 255L) << b(-2064788228, var34 ^ 1549555833)
                                                | (var7[b(-2064788227, var34 ^ -1090164508)] & 255L) << b(-2064788238, var34 ^ -670246212)
                                                | var7[b(-2064788237, var34 ^ -499194795)] & 255L;
                                             byte var116 = -1;

                                             while (true) {
                                                var127 = var89 ^ var0;
                                                switch (var116) {
                                                   case 0:
                                                      var47[var65] = var127;
                                                      if (var2 >= var5) {
                                                         a = var6;
                                                         ab = new Long[b(-2064788247, var34 ^ 1461605577)];
                                                         b = new String[aba(b(-2064788242, var34 ^ -436071683), 750982664663172424L)];
                                                         aaa();
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var47[var65] = var127;
                                                      if (var2 < var5) {
                                                         continue label106;
                                                      }

                                                      var5 = (var4 = aaaa(var34 ^ -1809440520, 50336, '탫')).length();
                                                      var2 = 0;
                                                }

                                                int var68 = var2;
                                                var2 += 8;
                                                String var48 = var4.substring(var68, var2);
                                                var68 = var34 ^ -1823203884;
                                                char var91 = 'ꆟ';
                                                var111 = '탪';
                                                var7 = var48.getBytes("ISO-8859-1");
                                                var47 = var6;
                                                var65 = var3++;
                                                var89 = (var7[0] & 255L) << b(-2064788240, var34 ^ -2103488589)
                                                   | (var7[1] & 255L) << b(-2064788239, var34 ^ -1779693268)
                                                   | (var7[2] & 255L) << b(-2064788234, var34 ^ 1191327192)
                                                   | (var7[3] & 255L) << b(-2064788233, var34 ^ 2015777207)
                                                   | (var7[4] & 255L) << b(-2064788236, var34 ^ 343597551)
                                                   | (var7[5] & 255L) << b(-2064788235, var34 ^ 28244943)
                                                   | (var7[b(-2064788246, var34 ^ 1458188409)] & 255L) << b(-2064788245, var34 ^ 1420014314)
                                                   | var7[b(-2064788248, var34 ^ 74279296)] & 255L;
                                                var116 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var44[var60] = var127;
                                       if (var10 < var13) {
                                          continue label116;
                                       }

                                       var13 = (var12 = aaaa(var34 ^ -1411039796, 52943, '탧')).length();
                                       var10 = 0;
                                 }

                                 int var63 = var10;
                                 var10 += 8;
                                 String var45 = var12.substring(var63, var10);
                                 var63 = var34 ^ 1503886151;
                                 char var87 = 'ꮯ';
                                 var111 = '탦';
                                 var15 = var45.getBytes("ISO-8859-1");
                                 var44 = var14;
                                 var60 = var11++;
                                 var85 = (var15[0] & 255L) << b(-2064788276, var34 ^ 1259876905)
                                    | (var15[1] & 255L) << b(-2064788275, var34 ^ -1850406866)
                                    | (var15[2] & 255L) << b(-2064788286, var34 ^ 1400846596)
                                    | (var15[3] & 255L) << b(-2064788285, var34 ^ -669565849)
                                    | (var15[4] & 255L) << b(-2064788288, var34 ^ 608180344)
                                    | (var15[5] & 255L) << b(-2064788287, var34 ^ -1102491638)
                                    | (var15[b(-2064788282, var34 ^ -443164415)] & 255L) << b(-2064788281, var34 ^ -1286670784)
                                    | var15[b(-2064788284, var34 ^ 1734784857)] & 255L;
                                 var112 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var38);
                        break;
                     default:
                        var21[var19++] = var110;
                        if ((var38 += var17) < var20) {
                           var17 = var18.charAt(var38);
                           continue label142;
                        }

                        var20 = (var18 = aaaa(var34 ^ 1692733512, 24098, '탢')).length();
                        var17 = b(-2064788264, var34 ^ 1663555806);
                        var38 = -1;
                  }

                  var41 = var18.substring(++var38, var38 + var17);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var29 = var25[var27];
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               short var33 = switch (var32 % 5) {
                  default -> 73;
                  case 1 -> 248;
                  case 2 -> 194;
                  case 3 -> 29;
                  case 4 -> 65;
               };
               var31[var32] = (char)(var31[var32] ^ var33 ^ var23);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private static String abb(char[] var0, long var1, int var3) {
      int var4 = aba(b(-2064788332, 208826109 ^ -1886821462), 1214286642826874174L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aba(b(-2064788331, 208826109 ^ 1458426695), 2413891194839643386L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public Matrix4f baa() {
      return this.bab;
   }

   public Matrix4f bab() {
      return this.ba;
   }

   private static String aaaa(int var0, int var1, char var2) {
      int var3 = var2 ^ '탣';
      char[] var4 = bbb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 20847;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '쀯';
         var10 += 57342;
         var10 -= 51852;
         var10 += 20317;
         var10 += 36745;
         var10 ^= 34012;
         var10 += 28069;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private abbabbbab(class_4184 a, class_4604 b, class_757 c, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
      this.aaa = a;
      this.abb = b;
      this.aa = c;
      this.bab = viewMatrix;
      this.ba = projectionMatrix;
   }

   private static abbabbbab bba(Object param0) {
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
      // 06: ifne 34
      // 09: ifnonnull 1e
      // 0c: goto 10
      // 0f: athrow
      // 10: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab
      // 13: dup
      // 14: aconst_null
      // 15: aconst_null
      // 16: aconst_null
      // 17: aconst_null
      // 18: aconst_null
      // 19: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.<init> (Lnet/minecraft/class_4184;Lnet/minecraft/class_4604;Lnet/minecraft/class_757;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V
      // 1c: areturn
      // 1d: athrow
      // 1e: aload 0
      // 1f: ldc_w net/minecraft/class_4184
      // 22: bipush 1
      // 23: anewarray 80
      // 26: dup
      // 27: bipush 0
      // 28: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.b [Ljava/lang/String;
      // 2b: bipush 2
      // 2c: aaload
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 30: aastore
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.aa (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;
      // 34: checkcast net/minecraft/class_4184
      // 37: astore 2
      // 38: aload 0
      // 39: ldc_w net/minecraft/class_4604
      // 3c: bipush 1
      // 3d: anewarray 80
      // 40: dup
      // 41: bipush 0
      // 42: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.b [Ljava/lang/String;
      // 45: bipush 1
      // 46: aaload
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 4a: aastore
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.aa (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;
      // 4e: checkcast net/minecraft/class_4604
      // 51: astore 3
      // 52: aload 0
      // 53: ldc_w net/minecraft/class_757
      // 56: bipush 1
      // 57: anewarray 80
      // 5a: dup
      // 5b: bipush 0
      // 5c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.b [Ljava/lang/String;
      // 5f: bipush 0
      // 60: aaload
      // 61: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 64: aastore
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.aa (Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/String;)Ljava/lang/Object;
      // 68: checkcast net/minecraft/class_757
      // 6b: astore 4
      // 6d: aload 0
      // 6e: bipush 1
      // 6f: anewarray 80
      // 72: dup
      // 73: bipush 0
      // 74: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.b [Ljava/lang/String;
      // 77: bipush 3
      // 78: aaload
      // 79: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 7c: aastore
      // 7d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.aab (Ljava/lang/Object;[Ljava/lang/String;)Lorg/joml/Matrix4f;
      // 80: astore 5
      // 82: aload 0
      // 83: bipush 2
      // 84: anewarray 80
      // 87: dup
      // 88: bipush 0
      // 89: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.b [Ljava/lang/String;
      // 8c: bipush 5
      // 8d: aaload
      // 8e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 91: aastore
      // 92: dup
      // 93: bipush 1
      // 94: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.b [Ljava/lang/String;
      // 97: bipush 4
      // 98: aaload
      // 99: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 9c: aastore
      // 9d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.aab (Ljava/lang/Object;[Ljava/lang/String;)Lorg/joml/Matrix4f;
      // a0: astore 6
      // a2: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab
      // a5: dup
      // a6: aload 2
      // a7: aload 3
      // a8: aload 4
      // aa: aload 5
      // ac: aload 6
      // ae: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbab.<init> (Lnet/minecraft/class_4184;Lnet/minecraft/class_4604;Lnet/minecraft/class_757;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V
      // b1: areturn
   }

   private static String bbb(int var0, int var1) {
      int var9 = -839547795;
      int var2 = (var0 ^ b(-2064788342, var9 ^ -918202354)) & b(-2064788341, var9 ^ -1975388828);
      if (bb[var2] == null) {
         char[] var3 = baa[var2].toCharArray();

         int var4 = switch (var3[0] & b(-2064788344, var9 ^ 1924492766)) {
            case 0 -> b(-2064788343, var9 ^ -1938535876);
            case 1 -> b(-2064788338, var9 ^ -1970529730);
            case 2 -> b(-2064788337, var9 ^ -914363315);
            case 3 -> b(-2064788340, var9 ^ -1023867831);
            case 4 -> b(-2064788339, var9 ^ 243174733);
            case 5 -> b(-2064788350, var9 ^ -53568401);
            case 6 -> b(-2064788349, var9 ^ 153515977);
            case 7 -> b(-2064788352, var9 ^ -361682966);
            case 8 -> b(-2064788351, var9 ^ 1665479966);
            case 9 -> b(-2064788346, var9 ^ -1544212543);
            case 10 -> b(-2064788345, var9 ^ -1788994305);
            case 11 -> b(-2064788348, var9 ^ -1974053110);
            case 12 -> b(-2064788347, var9 ^ -1383892763);
            case 13 -> b(-2064788294, var9 ^ 1566668077);
            case 14 -> b(-2064788293, var9 ^ 1305827182);
            case 15 -> b(-2064788296, var9 ^ 63298246);
            case 16 -> b(-2064788295, var9 ^ 199739231);
            case 17 -> b(-2064788290, var9 ^ -1775918334);
            case 18 -> b(-2064788289, var9 ^ 757148457);
            case 19 -> b(-2064788292, var9 ^ 1724778912);
            case 20 -> b(-2064788291, var9 ^ -801611381);
            case 21 -> b(-2064788302, var9 ^ -696963668);
            case 22 -> b(-2064788301, var9 ^ -956985724);
            case 23 -> b(-2064788304, var9 ^ -1993945190);
            case 24 -> b(-2064788303, var9 ^ 502214041);
            case 25 -> b(-2064788298, var9 ^ 1328292039);
            case 26 -> b(-2064788297, var9 ^ -739497333);
            case 27 -> b(-2064788300, var9 ^ 665132452);
            case 28 -> b(-2064788299, var9 ^ -434238348);
            case 29 -> b(-2064788310, var9 ^ -167660984);
            case 30 -> b(-2064788309, var9 ^ -496028784);
            case 31 -> b(-2064788312, var9 ^ -736723521);
            case 32 -> b(-2064788311, var9 ^ -897357515);
            case 33 -> b(-2064788306, var9 ^ 2081821849);
            case 34 -> b(-2064788305, var9 ^ -1962789731);
            case 35 -> b(-2064788308, var9 ^ 1997596958);
            case 36 -> b(-2064788307, var9 ^ 1419600491);
            case 37 -> b(-2064788318, var9 ^ 1309752638);
            case 38 -> b(-2064788317, var9 ^ 1310622330);
            case 39 -> b(-2064788320, var9 ^ 952540747);
            case 40 -> b(-2064788319, var9 ^ 487836598);
            case 41 -> b(-2064788314, var9 ^ 1109894631);
            case 42 -> b(-2064788313, var9 ^ -1425545227);
            case 43 -> b(-2064788316, var9 ^ -64706410);
            case 44 -> b(-2064788315, var9 ^ -2125056981);
            case 45 -> b(-2064788390, var9 ^ -1623795551);
            case 46 -> b(-2064788389, var9 ^ 70470963);
            case 47 -> b(-2064788392, var9 ^ -1218846122);
            case 48 -> b(-2064788391, var9 ^ -1809898202);
            case 49 -> b(-2064788386, var9 ^ -2024902952);
            case 50 -> b(-2064788385, var9 ^ 812655995);
            case 51 -> b(-2064788388, var9 ^ -345591309);
            case 52 -> b(-2064788387, var9 ^ -1621859381);
            case 53 -> b(-2064788398, var9 ^ 1209983671);
            case 54 -> b(-2064788397, var9 ^ 1177088363);
            case 55 -> b(-2064788400, var9 ^ 29690800);
            case 56 -> b(-2064788399, var9 ^ 60539423);
            case 57 -> b(-2064788394, var9 ^ -775046243);
            case 58 -> b(-2064788393, var9 ^ 60689297);
            case 59 -> b(-2064788396, var9 ^ 825918731);
            case 60 -> b(-2064788395, var9 ^ 1212653257);
            case 61 -> b(-2064788406, var9 ^ -1533313155);
            case 62 -> b(-2064788405, var9 ^ -1773956908);
            case 63 -> b(-2064788408, var9 ^ 433446410);
            case 64 -> b(-2064788407, var9 ^ -1117490704);
            case 65 -> b(-2064788402, var9 ^ 1331812103);
            case 66 -> b(-2064788401, var9 ^ -881429439);
            case 67 -> b(-2064788404, var9 ^ -55382901);
            case 68 -> b(-2064788403, var9 ^ 2141750753);
            case 69 -> b(-2064788414, var9 ^ -1902530187);
            case 70 -> b(-2064788413, var9 ^ 121218661);
            case 71 -> b(-2064788416, var9 ^ -78444249);
            case 72 -> b(-2064788415, var9 ^ 1196761745);
            case 73 -> 5;
            case 74 -> b(-2064788410, var9 ^ 1216459989);
            case 75 -> b(-2064788409, var9 ^ 355778745);
            case 76 -> b(-2064788412, var9 ^ 749781730);
            case 77 -> b(-2064788411, var9 ^ -718690015);
            case 78 -> b(-2064788358, var9 ^ 1559317794);
            case 79 -> b(-2064788357, var9 ^ 456348118);
            case 80 -> b(-2064788360, var9 ^ 1682995718);
            case 81 -> 2;
            case 82 -> b(-2064788359, var9 ^ -756856846);
            case 83 -> b(-2064788354, var9 ^ 1283927292);
            case 84 -> b(-2064788353, var9 ^ -319806229);
            case 85 -> b(-2064788356, var9 ^ -751085834);
            case 86 -> b(-2064788355, var9 ^ 694145427);
            case 87 -> 4;
            case 88 -> b(-2064788366, var9 ^ -1009250492);
            case 89 -> b(-2064788365, var9 ^ 879605416);
            case 90 -> b(-2064788368, var9 ^ 428312752);
            case 91 -> b(-2064788367, var9 ^ -1597578056);
            case 92 -> b(-2064788362, var9 ^ 575917400);
            case 93 -> b(-2064788361, var9 ^ 1080713050);
            case 94 -> b(-2064788364, var9 ^ 1208803515);
            case 95 -> b(-2064788363, var9 ^ -721896372);
            case 96 -> b(-2064788374, var9 ^ -267945552);
            case 97 -> b(-2064788373, var9 ^ -1710676478);
            case 98 -> b(-2064788376, var9 ^ -1186924829);
            case 99 -> b(-2064788375, var9 ^ -1248835439);
            case 100 -> b(-2064788370, var9 ^ -1053600926);
            case 101 -> b(-2064788369, var9 ^ -1754439025);
            case 102 -> b(-2064788372, var9 ^ -2100266761);
            case 103 -> b(-2064788371, var9 ^ -1182158245);
            case 104 -> b(-2064788382, var9 ^ -2035352114);
            case 105 -> b(-2064788381, var9 ^ 383954171);
            case 106 -> b(-2064788384, var9 ^ -1100593984);
            case 107 -> b(-2064788383, var9 ^ -482120844);
            case 108 -> b(-2064788378, var9 ^ 1426434596);
            case 109 -> b(-2064788377, var9 ^ 149656658);
            case 110 -> b(-2064788380, var9 ^ -1735932652);
            case 111 -> b(-2064788379, var9 ^ 1296462591);
            case 112 -> b(-2064788454, var9 ^ -407767301);
            case 113 -> b(-2064788453, var9 ^ -2143141352);
            case 114 -> b(-2064788456, var9 ^ -775655468);
            case 115 -> b(-2064788455, var9 ^ 1237242945);
            case 116 -> b(-2064788450, var9 ^ 1945750201);
            case 117 -> b(-2064788449, var9 ^ -105070418);
            case 118 -> b(-2064788452, var9 ^ 973621032);
            case 119 -> b(-2064788451, var9 ^ 276778607);
            case 120 -> b(-2064788462, var9 ^ 394439376);
            case 121 -> b(-2064788461, var9 ^ -1473043728);
            case 122 -> b(-2064788464, var9 ^ -235567149);
            case 123 -> b(-2064788463, var9 ^ -770672541);
            case 124 -> b(-2064788458, var9 ^ -355692631);
            case 125 -> b(-2064788457, var9 ^ 264843175);
            case 126 -> b(-2064788460, var9 ^ 1042257569);
            case 127 -> b(-2064788459, var9 ^ -2003312225);
            case 128 -> b(-2064788470, var9 ^ -1614876484);
            case 129 -> b(-2064788469, var9 ^ 706009200);
            case 130 -> b(-2064788472, var9 ^ 1001069534);
            case 131 -> b(-2064788471, var9 ^ -1294702851);
            case 132 -> b(-2064788466, var9 ^ 187423245);
            case 133 -> b(-2064788465, var9 ^ 532426570);
            case 134 -> b(-2064788468, var9 ^ 1209531444);
            case 135 -> b(-2064788467, var9 ^ -210677619);
            case 136 -> b(-2064788478, var9 ^ 1399345394);
            case 137 -> b(-2064788477, var9 ^ 1954615594);
            case 138 -> b(-2064788480, var9 ^ -930848330);
            case 139 -> b(-2064788479, var9 ^ 567336860);
            case 140 -> b(-2064788474, var9 ^ 1272159965);
            case 141 -> 1;
            case 142 -> b(-2064788473, var9 ^ -1160580140);
            case 143 -> b(-2064788476, var9 ^ 1358244878);
            case 144 -> b(-2064788475, var9 ^ -479926340);
            case 145 -> b(-2064788422, var9 ^ 1137602618);
            case 146 -> b(-2064788421, var9 ^ 1805857646);
            case 147 -> b(-2064788424, var9 ^ 1079504143);
            case 148 -> b(-2064788423, var9 ^ 995298070);
            case 149 -> b(-2064788418, var9 ^ 861585986);
            case 150 -> b(-2064788417, var9 ^ 147233014);
            case 151 -> b(-2064788420, var9 ^ 1054465685);
            case 152 -> b(-2064788419, var9 ^ 164302153);
            case 153 -> b(-2064788430, var9 ^ -1031717898);
            case 154 -> b(-2064788429, var9 ^ -1982963850);
            case 155 -> 0;
            case 156 -> b(-2064788432, var9 ^ -776989357);
            case 157 -> b(-2064788431, var9 ^ -888865077);
            case 158 -> b(-2064788426, var9 ^ 1114832783);
            case 159 -> b(-2064788425, var9 ^ -247468882);
            case 160 -> b(-2064788428, var9 ^ -942845102);
            case 161 -> b(-2064788427, var9 ^ -1877541448);
            case 162 -> b(-2064788438, var9 ^ 1245156206);
            case 163 -> b(-2064788437, var9 ^ -870211196);
            case 164 -> b(-2064788440, var9 ^ -1938759848);
            case 165 -> b(-2064788439, var9 ^ 1111513184);
            case 166 -> b(-2064788434, var9 ^ 118744186);
            case 167 -> b(-2064788433, var9 ^ 9189546);
            case 168 -> b(-2064788436, var9 ^ 803926382);
            case 169 -> b(-2064788435, var9 ^ 176743066);
            case 170 -> b(-2064788446, var9 ^ 1635219957);
            case 171 -> b(-2064788445, var9 ^ -1962200423);
            case 172 -> b(-2064788448, var9 ^ -141948729);
            case 173 -> b(-2064788447, var9 ^ 1217019282);
            case 174 -> b(-2064788442, var9 ^ 277575010);
            case 175 -> b(-2064788441, var9 ^ -906506698);
            case 176 -> b(-2064788444, var9 ^ -842685501);
            case 177 -> b(-2064788443, var9 ^ 2015915770);
            case 178 -> b(-2064788006, var9 ^ -435392536);
            case 179 -> b(-2064788005, var9 ^ 1696339513);
            case 180 -> b(-2064788008, var9 ^ -1233905796);
            case 181 -> b(-2064788007, var9 ^ 1671429042);
            case 182 -> b(-2064788002, var9 ^ 560952464);
            case 183 -> b(-2064788001, var9 ^ -2052974913);
            case 184 -> b(-2064788004, var9 ^ 618850579);
            case 185 -> b(-2064788003, var9 ^ -11237888);
            case 186 -> b(-2064788014, var9 ^ 960600956);
            case 187 -> 3;
            case 188 -> b(-2064788013, var9 ^ 2021686712);
            case 189 -> b(-2064788016, var9 ^ 1091302733);
            case 190 -> b(-2064788015, var9 ^ 823680434);
            case 191 -> b(-2064788010, var9 ^ 942136571);
            case 192 -> b(-2064788009, var9 ^ 1024111162);
            case 193 -> b(-2064788012, var9 ^ 1801698089);
            case 194 -> b(-2064788011, var9 ^ 751618950);
            case 195 -> b(-2064788022, var9 ^ -2079253940);
            case 196 -> b(-2064788021, var9 ^ 1352071359);
            case 197 -> b(-2064788024, var9 ^ 1250477865);
            case 198 -> b(-2064788023, var9 ^ 1240056452);
            case 199 -> b(-2064788018, var9 ^ -1570986785);
            case 200 -> b(-2064788017, var9 ^ 2129685124);
            case 201 -> b(-2064788020, var9 ^ 902109894);
            case 202 -> b(-2064788019, var9 ^ -170664504);
            case 203 -> b(-2064788030, var9 ^ 2070359369);
            case 204 -> b(-2064788029, var9 ^ 597296742);
            case 205 -> b(-2064788032, var9 ^ -1739914608);
            case 206 -> b(-2064788031, var9 ^ 1625931643);
            case 207 -> b(-2064788026, var9 ^ -902671362);
            case 208 -> b(-2064788025, var9 ^ -653420148);
            case 209 -> b(-2064788028, var9 ^ 1411999095);
            case 210 -> b(-2064788027, var9 ^ -596458051);
            case 211 -> b(-2064787974, var9 ^ -620268260);
            case 212 -> b(-2064787973, var9 ^ -1019341857);
            case 213 -> b(-2064787976, var9 ^ 545132072);
            case 214 -> b(-2064787975, var9 ^ 497738826);
            case 215 -> b(-2064787970, var9 ^ -2002533749);
            case 216 -> b(-2064787969, var9 ^ 777960326);
            case 217 -> b(-2064787972, var9 ^ -526545062);
            case 218 -> b(-2064787971, var9 ^ -326920425);
            case 219 -> b(-2064787982, var9 ^ 1408488794);
            case 220 -> b(-2064787981, var9 ^ 311263617);
            case 221 -> b(-2064787984, var9 ^ -1072022341);
            case 222 -> b(-2064787983, var9 ^ 2083914);
            case 223 -> b(-2064787978, var9 ^ -202317677);
            case 224 -> b(-2064787977, var9 ^ -1987740221);
            case 225 -> b(-2064787980, var9 ^ -184437427);
            case 226 -> b(-2064787979, var9 ^ 101855805);
            case 227 -> b(-2064787990, var9 ^ 1197095004);
            case 228 -> b(-2064787989, var9 ^ -477330132);
            case 229 -> b(-2064787992, var9 ^ -1599825450);
            case 230 -> b(-2064787991, var9 ^ 1406438597);
            case 231 -> b(-2064787986, var9 ^ 1183235030);
            case 232 -> b(-2064787985, var9 ^ -2139112483);
            case 233 -> b(-2064787988, var9 ^ 1000902693);
            case 234 -> b(-2064787987, var9 ^ -1999927642);
            case 235 -> b(-2064787998, var9 ^ -24311560);
            case 236 -> b(-2064787997, var9 ^ 1420818615);
            case 237 -> b(-2064788000, var9 ^ -1201288322);
            case 238 -> b(-2064787999, var9 ^ 1874846745);
            case 239 -> b(-2064787994, var9 ^ -1833310534);
            case 240 -> b(-2064787993, var9 ^ -1539258400);
            case 241 -> b(-2064787996, var9 ^ -445120723);
            case 242 -> b(-2064787995, var9 ^ 1560585614);
            case 243 -> b(-2064788070, var9 ^ 213676682);
            case 244 -> b(-2064788069, var9 ^ -1116340192);
            case 245 -> b(-2064788072, var9 ^ 988827099);
            case 246 -> b(-2064788071, var9 ^ 586858392);
            case 247 -> b(-2064788066, var9 ^ 1789263243);
            case 248 -> b(-2064788065, var9 ^ 987674152);
            case 249 -> b(-2064788068, var9 ^ -156638389);
            case 250 -> b(-2064788067, var9 ^ 1792443792);
            case 251 -> b(-2064788078, var9 ^ 945594419);
            case 252 -> b(-2064788077, var9 ^ 1394292241);
            case 253 -> b(-2064788080, var9 ^ 294728676);
            case 254 -> b(-2064788079, var9 ^ -144721127);
            default -> b(-2064788074, var9 ^ 2054746912);
         };
         int var5 = (var1 & b(-2064788073, var9 ^ 1156658134)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(-2064788076, var9 ^ -179204305)) >>> b(-2064788075, var9 ^ 1162628477)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(-2064788086, var9 ^ -132019763);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(-2064788085, var9 ^ 956587195);
            }
         }

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-2064788088, 428347164 ^ 332186579)) & b(-2064788087, 428347164 ^ 851206191);
      if (ab[var3] == null) {
         ab[var3] = a[var3] ^ var1;
      }

      return ab[var3];
   }
}
