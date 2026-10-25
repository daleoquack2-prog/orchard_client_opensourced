package nsc;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class abbbaa extends abbaabbaa {
   private final Queue aa;
   private static final long[] ab;
   private int ba;
   private int bb;
   private final Map aaa;
   private static final int[] bbaa;
   private static final int aab;
   private final bb aba;
   private static final int abb;
   private static final int baa;
   private int bab;
   private final Map bba;
   private static final Set bbb;
   private static final int aaaa;
   private class_1937 aaab;
   private static final String[] bbab;
   private static final Object[] bbba;
   private static final long aaba;
   private static final int aabb;
   private static final int abaa;
   private int abab;
   private static final Integer[] abba;
   private static final String[] abbb;
   private static final String[] baaa;
   private final Map baab;
   private static final int baba;
   private final bababa babb;

   @Override
   public void abaab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: bipush -1
      // 05: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.abab I
      // 08: aload 0
      // 09: bipush 0
      // 0a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ba I
      // 0d: aload 0
      // 0e: aconst_null
      // 0f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaab Lnet/minecraft/class_1937;
      // 12: aload 0
      // 13: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bba Ljava/util/Map;
      // 16: invokeinterface java/util/Map.clear ()V 1
      // 1b: istore 1
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.baab Ljava/util/Map;
      // 20: invokeinterface java/util/Map.clear ()V 1
      // 25: aload 0
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa Ljava/util/Map;
      // 29: invokeinterface java/util/Map.clear ()V 1
      // 2e: aload 0
      // 2f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aa Ljava/util/Queue;
      // 32: invokeinterface java/util/Queue.clear ()V 1
      // 37: aload 0
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaaa ()Ljava/util/List;
      // 3e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 43: astore 2
      // 44: aload 2
      // 45: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4a: ifeq 8c
      // 4d: aload 2
      // 4e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 53: checkcast java/lang/String
      // 56: astore 3
      // 57: aload 3
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bba (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaa;
      // 5b: astore 4
      // 5d: aload 4
      // 5f: iload 1
      // 60: ifne 87
      // 63: ifnull 88
      // 66: goto 6a
      // 69: athrow
      // 6a: aload 0
      // 6b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.baab Ljava/util/Map;
      // 6e: aload 4
      // 70: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaa.b ()J
      // 73: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 76: aload 4
      // 78: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaa.a ()I
      // 7b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 83: goto 87
      // 86: athrow
      // 87: pop
      // 88: iload 1
      // 89: ifeq 44
      // 8c: return
   }

   private static int a(int var0, int var1) {
      int var2 = bbaa[var0 ^ -759088892] ^ var1 ^ var0;
      var2 -= 15360;
      var2 ^= 6700;
      var2 ^= 18252;
      var2 ^= 17870;
      var2 += 20928;
      var2 += 39503;
      var2 -= 55993;
      var2 ^= 36790;
      return var2 ^ 32039;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var28 = -2021992994;
      char[] var19 = "༩ྨ༅ྏྕྏ".toCharArray();
      byte var24 = -1;
      short var17 = 3973;
      String var18 = "\ue65c\ue7fe\ue6ba\ue6c8\ue64b\ue621\ue627\ue65e\ue6a6\ue641\ue681\ue609\ue6c1\ue62c\ue77c\ue614\ue7c4\ue62a\ue67d\ue6e2\ue6df\ue6b0\ue682\ue698\ue77a\ue666\ue600\ue6e4\ue706\ue699\ue69b\ue673\ue623\ue6f0\ue6ce\ue61f\ue6ef\ue677\ue6fa\ue68a\ue6ec\ue65c\ue65b\ue64b\ue694\ue752\ue696\ue625\ue6b5\ue6c1\ue6a0\ue7fc\ue79e\ue62f\ue64c\ue6f8\ue7fd\ue619\ue608\ue6f5\ue622\ue7e2\ue65e\ue700\ue701\ue691\ue69f\ue7b0\ue623\ue682\ue77c\ue60c\ue643\ue74c\ue609\ue7af\ue608\ue6e1\ue76a\ue6ef\ue63e\ue6b4\ue63b\ue6bc\ue696\ue6df\ue61e\ue6e8\ue62f\ue66a\ue7a9\ue637\ue6e5\ue761\ue670\ue61a\ue633\ue617\ue671\ue652\ue60c\ue6a3\ue6b3\ue6ec\ue6de\ue65d\ue634\ue6c4\ue780\ue642\ue604\ue615\ue6d5\ue6f3\ue6be\ue6ee\ue6ea\ue62e\ue6ae\ue6fb\ue625\ue651\ue6e8\ue6c2\ue778\ue643\ue7ad\ue655\ue620\ue6ec\ue65c\ue649\ue641\ue6b0\ue6ee\ue77c\ue6d8\ue662\ue6f0\ue6c6\ue6ed\ue632\ue6e9\ue6aa\ue6b2\ue6e1\ue659\ue7a1\ue748\ue696\ue762\ue65b\ue6bd\ue698\ue6bf\ue66b\ue60c\ue79c\ue640\ue6f0\ue601\ue69a\ue7ab\ue752\ue681\ue621\ue60e\ue65a\ue6fc\ue6d1\ue61f\ue7a5ྠྱ࿂ၔ\u0fddྚ༡༇༘\u0fde༼༉ჲႀ\u0fbdၢྜྲྀྣྻ࿈\u0fbdྼྦ\u0f6fၳ༼ད\u0fe0࿇ၤ༸༚࿓\u0fddཅྌ༹\u0fdbྷ༃ჵབྷ࿖ཬ䂤䁠䁠䃰䂪䆪䃭䃓䃉䁝䃖䁫䃄䁀䃝䃒䄨䆭䂥䂢䃖䂻䀇䀚䃏䀺䆭䂍䂰䄆䂮䀙䆛䀌䁦䀹䁿䁜䃽䁠䂀䁛䆦䂯䂳䁐䀅䃴䀝䃩䃌䁜䂐䂎䃘䂌䁿䁖䅚䂙䃐䀠䁞䃝䀏䃄䁟䀺䃘䂌䅼䆪䀄䃞䂢䀙䁼䀆䃬䂡䂐䇠䃓䃨䁬䂼䀡䃏䅪䂮䅒䁵䀲䀍䃟䅱䀖䀀䀥䁪䃔䃕䁈䀭䄝䃟䁾䆯䀰䀻䃊䀻䁵䀥䃞䃰䁨䃫䃐䅾䀕䁋䁮䅎䃑䀙䇌䃚᳀᱕ᱟᶀᴮᵻᷧᶥᶀᴭᆌᇤᇁᅶᆲᇖዄኤᄣᅪᆰዽ\u12b1ᄢᆤᇽ\uefb3\uef52\uef60\uf083\uf02d\uf078\uf0f4\uf0b6\uf083\uf02e";
      String[] var20 = new String[var19.length];

      while (true) {
         int var21 = 0;
         int var22 = 0;
         int var23 = 0;
         if (var24 == 0) {
            bbab = var20;
            bbba = new Object[var20.length];
            byte var33 = 0;
            int var10001 = 0;
            bbaa = new int[331];
            byte[] var10002 = "ç§fø<¥²ò `ÒkSX\u0092³gL\u001a\u0005\u0000\u0002J+\u000eÿÝ\u001b-ð\u009e\u000føýÀ°\u001e? \u0090))C\u0003\u001b¨[\u00018\u0016¥B'\u000f\u001aÛ]AÆü8¸\u007f$}ü\u0015z\u0088Ù<\u0013\u000e\u0016ÝõÝå\u0092\u007fq\u0019\u0010 À\n®|a·\u0019¦¥wÑ\u0089\u0010L\u0092\r]\u0080×£x{\u000fá°\u0003>é6=]lämÍ\u00ad\u0093üæq\u001d6\u0098FÉhÌ\u0085\u0013@\u0097s\u009d\u0097ëÐ\u0087Õ\u009dz\fZÌ*¡6\nû¥ã\u0004¿sË\u0088\u009fi%\u0011Å\u0082ÚÁG¥UÑÁþâ÷·6SM£\\!±5\u0087¯ü\u0002\u008f3\u009eoÙé\u00928ûéjþórñêvèkîp\u008d\u000b\u0016*R\u009apr&{Wâ1×~ W\u0091\u0080¾G\u008b¦ÖN\u0087_õ\u00adçÛ±\\;\u0098\u0087NÃ-ïÕ(Cµ<¾\u001eÈIàâB¡<'\u0096\u0018\u0006M\u0017X¾4ÏóÒ\u008c;³+·ÕEà>éËç;=]\u0092m\u007fÙ\u009e\u001aÜOlF\u0087Ù¾MF\u0093DÞÿÓOJ~êØ·U¦O@ûÊ\u009b®\u0014\u008b\u008f»ÖSûÏ \u0005;zï^\u0013C¹s÷¢Ë×dD\u0084MMfIÇN\u0093öz;Ð%¨\u0001tîÀ\u001e~d~1»*$y¡ßÏ{çÊ<¾(%i\u001e\t8½7ÑãR¼X·:´\u0093V`I`ÛË2bävÝÇî\u009eg\u0085±æ©\u000fÇÃoÇ¾åÄ²6+\u0080«ùS/íÚs\tê\f\u0092I\u008e\u00ad|~«7÷QÀºæm!55Ö\u009cóZ\u0084\u0088¬\u0081z 2Ôj´¥¥\u0091}\u001f/\u00009¿Ü6{æ\u009dÞ\u0017e\u0084ÀA\u0098áÚ~.ò^U\u000fXÔ\t\u007f\u001aØ\u000eî\u001cíè?\u009b÷Á[\u0081]&| ä¾²UC\f\u0000(\u0002\u008d¨ôf¡\u0081×¶úCGcÂ\u0002ÝùX¾\u009d\u0015W\u0019k\nÛ©\u009423q®/ËR.¿\u0015\u009a<àN2àwb\u0085Ã\u001f¥¹\u001chl\u009fkÁIÓ\u0085x\"©,eß¦¢]U\u0016J\u00916¬i;z\u00adïî%TÈ4vñ~¡o¾!»:h\u0081\u000e\u008a±sû\u0003®çëbh´\u00ad\u0082\u0083·\u0016µÌÆré\u001f\u0017\u0015\u009aHaEÙÈCe\u009a_¢\u0011C\u0013\u009c±È\u0011\u0005ç\u0013¾ýÆ\u008e\fêÂ\u0095\u0087J3ÊËO;g û\u009aÆA®\u0095lc\u0093K\u0089áG¿\u0096<\u009aÁ\"\u0088\u0081\u0088H\u0005=\u009aán÷\u008c\u0092®³w!~¸\u0004q\nC\u0095d\u0014\u009eç$ÅÅ3\u001c¹g]\u009dî\u0012c@Øá\u009b1ò§n@\u0001\u0084Ó\u0088\u0082a\u0080îÿ°ùCyX½\u0014ô·ÔÏ\u0093`\u009dD\u0006\u0010¾Ihwa@Ð;©\u008fÆã\u00adÎ¬\u00865p¹\u008c÷ä\f\u0096Àå\u0004\fYíµ½¦iÞ\u007f)Z\ra\u0016Z-0u_\u008ahá×&Þ\u008a-g÷èæ@H!2\u009b\u0010\u0012`$°/Ü\u0003: ¨btº»\u0081±Bä'¿©ä\u0001ay¬PG\u008e4XÇà~ý\u0002yVBÆ/³S\"þKÉV$\u0085û»\u000e8\u0002þ\u008a8Ý\u008bÒl-\"Ûz¯(\u000b»K¢Å\u009az¡ìþêa\t¶'ýï2\u009d:·JjÄ\u000e\u008a\u0088xä\u001cS\u001aÂs\r&.\u00886Û\u0010\u0005·\u0095EYX\u0085G)¹>Á)¯\u0018å\\ß\u0002\u0087\u0084¿²]¯m¹H\u001blwA?³¥\u0089\nC÷\u0093Æ^y6\u0017SÊ\u0081ª\u008c\u0019D\u00150.Ö\u009fJ\u0097IÂùÕç&d\u009apøÌ·HM\u0088±R\u009eNo\\¦ù\u0082IC¤x\u0001ÀâÏ\u0014Ö{¬ý\u008d\u00924d4B§ÆäC½H\u0010Ý\u0092æY\"ð®³jOÅV\u0097î\u001c\u0097\u009alq\u001eF*\u0090\u0016\u0093VpfeU»=%\u0085Âñè\u0086ç&o\u009fPQ#&\u0002Ä\u001f\\\u0011\u008eOeE\u008bÐñMU\tdîxöf\u00961ö|\u0088`\f\u0080®\u0096/rïª$ùtª\u0087lIk\f\u0092y5d ¨³\u009e>ð<Óp\u0011£½{\u0000Ñ1\u000brç\u0093pEçêYx|Y\u0096\u009a§\u000bB\u0006qÁÞ¢ºüÈwq\u0080gõ\u0007!ûï±\u0098Ð'D\u0082\u0087ÍY3¬ê\nS\fó\u0093Ç\u001e\u0087E#Wq\u0003´2ºqBË\u0012ËÑÞxF;([»\u009crì\u008dðëL\u000e\u0080ê[Ju[\u00adÓ\u009bûèËÀ{$Ã\u009d\u0089N Õ¥\u000eí\r\u000efyiÆ^mS\u007fvýÐ\u00033\u0015j\u001d\u000ffz\u008dz\u001b\u001f-Ô\u0005¨Æ\r³b¶Ùí°¤\u0084âå6\u009f\u0015"
               .getBytes("ISO-8859-1");

            int var82;
            do {
               bbaa[var33] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -732401513;
               var33 += 1;
               var82 = var10001 + 4;
               var10001 += 4;
            } while (var82 < var10002.length);

            String[] var15 = new String[a(-759089113, var28 ^ 1385347367)];
            int var13 = 0;
            String var12;
            int var14 = (var12 = b(var28 ^ 245947742, (short)8925, '\u1249')).length();
            int var11 = a(-759089120, var28 ^ 1016703033);
            int var31 = -1;

            label122:
            while (true) {
               String var34 = var12.substring(++var31, var31 + var11);
               var10001 = (byte)-1;

               while (true) {
                  label117: {
                     char[] var43 = var34.toCharArray();
                     var82 = var43.length;
                     int var16 = 0;
                     var64 = var43;
                     var10001 = var82;
                     char[] var86;
                     int var104;
                     if (var82 <= 1) {
                        var86 = var43;
                        var104 = var16;
                     } else {
                        var64 = var43;
                        var10001 = var82;
                        if (var82 <= var16) {
                           break label117;
                        }

                        var86 = var43;
                        var104 = var16;
                     }

                     while (true) {
                        var86[var104] = (char)(var86[var104] ^ switch (var16 % a(-759089117, var28 ^ 1807470840)) {
                           case 0 -> a(-759089108, var28 ^ -663473427);
                           case 1 -> a(-759089107, var28 ^ -1969181147);
                           case 2 -> a(-759089106, var28 ^ 1077676604);
                           case 3 -> a(-759089105, var28 ^ 2099961804);
                           case 4 -> a(-759089112, var28 ^ 25517489);
                           case 5 -> a(-759089111, var28 ^ -1608956140);
                           default -> a(-759089110, var28 ^ 422743984);
                        });
                        var16++;
                        if (var10001 == 0) {
                           var104 = var10001;
                           var86 = var64;
                        } else {
                           if (var10001 <= var16) {
                              break;
                           }

                           var86 = var64;
                           var104 = var16;
                        }
                     }
                  }

                  String var93 = new String(var64).intern();
                  switch (var10001) {
                     case 0:
                        var15[var13++] = var93;
                        if ((var31 += var11) >= var14) {
                           abbb = var15;
                           baaa = new String[a(-759089118, var28 ^ 311618918)];
                           long var2 = 8096991360946678502L;
                           long[] var8 = new long[a(-759089109, var28 ^ 56976824)];
                           int var5 = 0;
                           String var6;
                           int var7 = (var6 = b(var28 ^ -266689009, (short)26225, 'ቋ')).length();
                           byte var4 = 0;

                           label96:
                           while (true) {
                              int var50 = var4;
                              var4 += 8;
                              String var36 = var6.substring(var50, var4);
                              var50 = var28 ^ -1259604633;
                              short var70 = 18142;
                              short var94 = 4682;
                              byte[] var9 = var36.getBytes("ISO-8859-1");
                              long[] var37 = var8;
                              var50 = var5++;
                              long var71 = (var9[0] & 255L) << a(-759089100, var28 ^ -1303494006)
                                 | (var9[1] & 255L) << a(-759089099, var28 ^ -756131062)
                                 | (var9[2] & 255L) << a(-759089098, var28 ^ 1190932471)
                                 | (var9[3] & 255L) << a(-759089097, var28 ^ -1565140600)
                                 | (var9[4] & 255L) << a(-759089104, var28 ^ 902828693)
                                 | (var9[5] & 255L) << a(-759089103, var28 ^ -1020675530)
                                 | (var9[a(-759089102, var28 ^ 1346162898)] & 255L) << a(-759089101, var28 ^ -1161104596)
                                 | var9[a(-759089092, var28 ^ 495993878)] & 255L;
                              short var95 = -1;

                              while (true) {
                                 long var106 = var71 ^ var2;
                                 switch (var95) {
                                    case 0:
                                       var37[var50] = var106;
                                       if (var4 >= var7) {
                                          ab = var8;
                                          abba = new Integer[a(-759089082, var28 ^ -761405839)];
                                          baba = aaa(a(-759089081, var28 ^ 1373656474), 4180722647657690379L);
                                          aabb = aaa(a(-759089088, var28 ^ -335568285), 2559327595765067896L);
                                          aab = aaa(a(-759089087, var28 ^ -76668644), 8502340189350145660L);
                                          aaaa = aaa(a(-759089086, var28 ^ -1630622009), 4435511815261014330L);
                                          baa = aaa(a(-759089085, var28 ^ 690303387), 6585932944752313191L);
                                          abaa = aaa(a(-759089076, var28 ^ -480926972), 781018555777272089L);
                                          abb = aaa(a(-759089075, var28 ^ 826793068), 6510916414119653366L);
                                          long var0 = 2779075846450845257L;
                                          long var74 = 2779075846450847217L ^ var0;
                                          byte var55 = -1;
                                          aaba = var74;
                                          bbb = Set.of(
                                             class_2246.field_27116,
                                             class_2246.field_27121,
                                             class_2246.field_47035,
                                             class_2246.field_27133,
                                             class_2246.field_33407,
                                             class_2246.field_33408,
                                             class_2246.field_16328,
                                             class_2246.field_47076
                                          );
                                          return;
                                       }
                                       break;
                                    default:
                                       var37[var50] = var106;
                                       if (var4 < var7) {
                                          continue label96;
                                       }

                                       var7 = (var6 = b(var28 ^ 482073549, (short)'\ufb3f', 'ቍ')).length();
                                       var4 = 0;
                                 }

                                 int var53 = var4;
                                 var4 += 8;
                                 String var38 = var6.substring(var53, var4);
                                 var53 = var28 ^ -457325256;
                                 short var73 = 8577;
                                 var95 = 4684;
                                 var9 = var38.getBytes("ISO-8859-1");
                                 var37 = var8;
                                 var50 = var5++;
                                 var71 = (var9[0] & 255L) << a(-759089091, var28 ^ 1896473735)
                                    | (var9[1] & 255L) << a(-759089090, var28 ^ 17363928)
                                    | (var9[2] & 255L) << a(-759089089, var28 ^ -189201048)
                                    | (var9[3] & 255L) << a(-759089096, var28 ^ 437862479)
                                    | (var9[4] & 255L) << a(-759089095, var28 ^ 1100581934)
                                    | (var9[5] & 255L) << a(-759089094, var28 ^ 476833494)
                                    | (var9[a(-759089093, var28 ^ 1413981808)] & 255L) << a(-759089084, var28 ^ -1930637671)
                                    | var9[a(-759089083, var28 ^ -400230769)] & 255L;
                                 var95 = 0;
                              }
                           }
                        }

                        var11 = var12.charAt(var31);
                        break;
                     default:
                        var15[var13++] = var93;
                        if ((var31 += var11) < var14) {
                           var11 = var12.charAt(var31);
                           continue label122;
                        }

                        var14 = (var12 = b(var28 ^ -2117747304, (short)25705, 'ቈ')).length();
                        var11 = a(-759089119, var28 ^ -1326851570);
                        var31 = -1;
                  }

                  var34 = var12.substring(++var31, var31 + var11);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var23 = var19[var21] ^ var17;
            char[] var25 = var18.substring(var22, var22 + var23).toCharArray();
            int var26 = 0;

            do {
               short var27 = switch (var26 % 5) {
                  default -> 47;
                  case 1 -> 172;
                  case 2 -> 250;
                  case 3 -> 3;
                  case 4 -> 122;
               };
               var25[var26] = (char)(var25[var26] ^ var27);
            } while (++var26 < var25.length);

            var20[var21] = new String(var25).intern();
            var22 += var23;
         } while (++var21 < var19.length);

         var24 = 0;
      }
   }

   private boolean aa(class_2680 param1) {
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
      // 12: ifne 23
      // 15: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 18: ifeq 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
      // 26: astore 3
      // 27: aload 3
      // 28: instanceof net/minecraft/class_4739
      // 2b: iload 2
      // 2c: ifne a5
      // 2f: ifne a0
      // 32: goto 36
      // 35: athrow
      // 36: aload 3
      // 37: iload 2
      // 38: ifne 4e
      // 3b: goto 3f
      // 3e: athrow
      // 3f: getstatic net/minecraft/class_2246.field_16328 Lnet/minecraft/class_2248;
      // 42: if_acmpeq a0
      // 45: goto 49
      // 48: athrow
      // 49: aload 3
      // 4a: goto 4e
      // 4d: athrow
      // 4e: instanceof net/minecraft/class_2480
      // 51: iload 2
      // 52: ifne a5
      // 55: ifne a0
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 3
      // 5d: iload 2
      // 5e: ifne 74
      // 61: goto 65
      // 64: athrow
      // 65: getstatic net/minecraft/class_2246.field_10443 Lnet/minecraft/class_2248;
      // 68: if_acmpeq a0
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 3
      // 70: goto 74
      // 73: athrow
      // 74: instanceof net/minecraft/class_2363
      // 77: iload 2
      // 78: ifne a5
      // 7b: ifne a0
      // 7e: goto 82
      // 81: athrow
      // 82: aload 3
      // 83: instanceof net/minecraft/class_2315
      // 86: iload 2
      // 87: ifne a5
      // 8a: goto 8e
      // 8d: athrow
      // 8e: ifne a0
      // 91: goto 95
      // 94: athrow
      // 95: aload 3
      // 96: getstatic net/minecraft/class_2246.field_10312 Lnet/minecraft/class_2248;
      // 99: if_acmpne a8
      // 9c: goto a0
      // 9f: athrow
      // a0: bipush 1
      // a1: goto a5
      // a4: athrow
      // a5: goto a9
      // a8: bipush 0
      // a9: ireturn
   }

   private static String ab(int var0, int var1) {
      int var9 = -854233810;
      int var2 = (var0 ^ a(-759088892, var9 ^ 741061776)) & a(-759088891, var9 ^ -148261128);
      if (baaa[var2] == null) {
         char[] var3 = abbb[var2].toCharArray();

         int var4 = switch (var3[0] & a(-759088890, var9 ^ 1810744162)) {
            case 0 -> a(-759088889, var9 ^ -1730837702);
            case 1 -> a(-759088896, var9 ^ -1396634870);
            case 2 -> a(-759088895, var9 ^ -879797506);
            case 3 -> a(-759088894, var9 ^ -982331936);
            case 4 -> a(-759088893, var9 ^ -427978830);
            case 5 -> a(-759088884, var9 ^ 863031705);
            case 6 -> a(-759088883, var9 ^ -709709420);
            case 7 -> a(-759088882, var9 ^ -492547087);
            case 8 -> a(-759088881, var9 ^ -802862540);
            case 9 -> a(-759088888, var9 ^ -207899397);
            case 10 -> a(-759088887, var9 ^ -327021572);
            case 11 -> a(-759088886, var9 ^ -1764960379);
            case 12 -> a(-759088885, var9 ^ -214602193);
            case 13 -> a(-759088876, var9 ^ -1234106963);
            case 14 -> a(-759088875, var9 ^ 1129590150);
            case 15 -> a(-759088874, var9 ^ -979645115);
            case 16 -> a(-759088873, var9 ^ 375948043);
            case 17 -> a(-759088880, var9 ^ -1164705504);
            case 18 -> a(-759088879, var9 ^ 193445540);
            case 19 -> 4;
            case 20 -> a(-759088878, var9 ^ -1439037198);
            case 21 -> a(-759088877, var9 ^ 1861926917);
            case 22 -> a(-759088868, var9 ^ -608074853);
            case 23 -> a(-759088867, var9 ^ -1777482227);
            case 24 -> a(-759088866, var9 ^ -1275715810);
            case 25 -> a(-759088865, var9 ^ 2072915925);
            case 26 -> a(-759088872, var9 ^ -38777745);
            case 27 -> a(-759088871, var9 ^ 803265585);
            case 28 -> a(-759088870, var9 ^ 1483863851);
            case 29 -> a(-759088869, var9 ^ -692352845);
            case 30 -> a(-759088860, var9 ^ 48618800);
            case 31 -> a(-759088859, var9 ^ -657619421);
            case 32 -> a(-759088858, var9 ^ 1444608786);
            case 33 -> a(-759088857, var9 ^ 1280871920);
            case 34 -> a(-759088864, var9 ^ -942154393);
            case 35 -> a(-759088863, var9 ^ 1790647217);
            case 36 -> a(-759088862, var9 ^ 1852708294);
            case 37 -> a(-759088861, var9 ^ -1203332637);
            case 38 -> a(-759088852, var9 ^ -1566048142);
            case 39 -> a(-759088851, var9 ^ 1230492085);
            case 40 -> a(-759088850, var9 ^ 1859698827);
            case 41 -> a(-759088849, var9 ^ 896526136);
            case 42 -> a(-759088856, var9 ^ -35758755);
            case 43 -> a(-759088855, var9 ^ -1750294105);
            case 44 -> a(-759088854, var9 ^ 1277357266);
            case 45 -> a(-759088853, var9 ^ 1153339033);
            case 46 -> a(-759088844, var9 ^ 308577119);
            case 47 -> a(-759088843, var9 ^ 811891703);
            case 48 -> a(-759088842, var9 ^ 956293387);
            case 49 -> a(-759088841, var9 ^ -1117422954);
            case 50 -> a(-759088848, var9 ^ -1157620737);
            case 51 -> a(-759088847, var9 ^ -505443544);
            case 52 -> a(-759088846, var9 ^ -1179948096);
            case 53 -> a(-759088845, var9 ^ 700237813);
            case 54 -> a(-759088836, var9 ^ -338001688);
            case 55 -> a(-759088835, var9 ^ 1976211969);
            case 56 -> a(-759088834, var9 ^ 499357606);
            case 57 -> a(-759088833, var9 ^ 1042347670);
            case 58 -> a(-759088840, var9 ^ 2060528272);
            case 59 -> a(-759088839, var9 ^ 1287901796);
            case 60 -> a(-759088838, var9 ^ 609761409);
            case 61 -> a(-759088837, var9 ^ 2125573877);
            case 62 -> a(-759088828, var9 ^ 63238222);
            case 63 -> a(-759088827, var9 ^ -1993593579);
            case 64 -> a(-759088826, var9 ^ 1570051904);
            case 65 -> a(-759088825, var9 ^ -589975754);
            case 66 -> a(-759088832, var9 ^ 75416072);
            case 67 -> a(-759088831, var9 ^ -264357124);
            case 68 -> a(-759088830, var9 ^ 516485499);
            case 69 -> a(-759088829, var9 ^ 575076274);
            case 70 -> a(-759088820, var9 ^ -154107172);
            case 71 -> a(-759088819, var9 ^ -1269526877);
            case 72 -> a(-759088818, var9 ^ 398622062);
            case 73 -> a(-759088817, var9 ^ 1280618360);
            case 74 -> a(-759088824, var9 ^ -1927391766);
            case 75 -> a(-759088823, var9 ^ 878599740);
            case 76 -> a(-759088822, var9 ^ -1251489351);
            case 77 -> a(-759088821, var9 ^ -1641324910);
            case 78 -> a(-759088812, var9 ^ 809994927);
            case 79 -> a(-759088811, var9 ^ -553214362);
            case 80 -> a(-759088810, var9 ^ 501148465);
            case 81 -> a(-759088809, var9 ^ -343397389);
            case 82 -> a(-759088816, var9 ^ 617808393);
            case 83 -> a(-759088815, var9 ^ 1929307842);
            case 84 -> a(-759088814, var9 ^ 5928305);
            case 85 -> a(-759088813, var9 ^ 1338006540);
            case 86 -> a(-759088804, var9 ^ -2109055156);
            case 87 -> a(-759088803, var9 ^ 1039608517);
            case 88 -> a(-759088802, var9 ^ -299560942);
            case 89 -> a(-759088801, var9 ^ 625807156);
            case 90 -> a(-759088808, var9 ^ -1343020843);
            case 91 -> a(-759088807, var9 ^ -508991213);
            case 92 -> a(-759088806, var9 ^ 339897002);
            case 93 -> a(-759088805, var9 ^ 28421801);
            case 94 -> a(-759088796, var9 ^ -287043824);
            case 95 -> a(-759088795, var9 ^ -214948082);
            case 96 -> a(-759088794, var9 ^ 685747403);
            case 97 -> a(-759088793, var9 ^ 2092410304);
            case 98 -> a(-759088800, var9 ^ -1645389805);
            case 99 -> a(-759088799, var9 ^ 273031949);
            case 100 -> a(-759088798, var9 ^ 805031193);
            case 101 -> a(-759088797, var9 ^ 622032645);
            case 102 -> a(-759088788, var9 ^ 2053880282);
            case 103 -> a(-759088787, var9 ^ 206471030);
            case 104 -> a(-759088786, var9 ^ 1969804702);
            case 105 -> a(-759088785, var9 ^ -39415471);
            case 106 -> a(-759088792, var9 ^ 853425834);
            case 107 -> a(-759088791, var9 ^ 301865255);
            case 108 -> 0;
            case 109 -> a(-759088790, var9 ^ -954246935);
            case 110 -> a(-759088789, var9 ^ 1727098738);
            case 111 -> a(-759088780, var9 ^ -59096957);
            case 112 -> a(-759088779, var9 ^ 1902869615);
            case 113 -> a(-759088778, var9 ^ -21445070);
            case 114 -> a(-759088777, var9 ^ 953652603);
            case 115 -> a(-759088784, var9 ^ 1728867118);
            case 116 -> a(-759088783, var9 ^ -111576177);
            case 117 -> a(-759088782, var9 ^ 1848148402);
            case 118 -> a(-759088781, var9 ^ -727576346);
            case 119 -> a(-759088772, var9 ^ 1951475471);
            case 120 -> a(-759088771, var9 ^ 756076318);
            case 121 -> a(-759088770, var9 ^ -1375088440);
            case 122 -> a(-759088769, var9 ^ 1399638807);
            case 123 -> a(-759088776, var9 ^ -444641413);
            case 124 -> a(-759088775, var9 ^ -992623256);
            case 125 -> a(-759088774, var9 ^ -1265121058);
            case 126 -> a(-759088773, var9 ^ 630324245);
            case 127 -> a(-759088764, var9 ^ -199825883);
            case 128 -> a(-759088763, var9 ^ -1878242270);
            case 129 -> a(-759088762, var9 ^ -1221725029);
            case 130 -> a(-759088761, var9 ^ 2044220234);
            case 131 -> a(-759088768, var9 ^ -878373957);
            case 132 -> a(-759088767, var9 ^ 1668904674);
            case 133 -> a(-759088766, var9 ^ 1247455226);
            case 134 -> a(-759088765, var9 ^ -1999998451);
            case 135 -> a(-759088756, var9 ^ -917444468);
            case 136 -> a(-759088755, var9 ^ 1963984089);
            case 137 -> a(-759088754, var9 ^ -756671837);
            case 138 -> a(-759088753, var9 ^ 1645814670);
            case 139 -> a(-759088760, var9 ^ -1172095443);
            case 140 -> a(-759088759, var9 ^ -1717326195);
            case 141 -> a(-759088758, var9 ^ 1370616276);
            case 142 -> a(-759088757, var9 ^ -110270816);
            case 143 -> a(-759088748, var9 ^ 1313738723);
            case 144 -> a(-759088747, var9 ^ 1922136537);
            case 145 -> a(-759088746, var9 ^ 1424412848);
            case 146 -> a(-759088745, var9 ^ 403204513);
            case 147 -> a(-759088752, var9 ^ 1654748376);
            case 148 -> a(-759088751, var9 ^ 1831816410);
            case 149 -> a(-759088750, var9 ^ -574127897);
            case 150 -> a(-759088749, var9 ^ 1743006358);
            case 151 -> a(-759088740, var9 ^ 1717763664);
            case 152 -> a(-759088739, var9 ^ -1622858751);
            case 153 -> a(-759088738, var9 ^ 989049003);
            case 154 -> a(-759088737, var9 ^ 1974250005);
            case 155 -> a(-759088744, var9 ^ -1559486580);
            case 156 -> a(-759088743, var9 ^ 2063526412);
            case 157 -> a(-759088742, var9 ^ 1701509763);
            case 158 -> a(-759088741, var9 ^ -1556497250);
            case 159 -> a(-759088732, var9 ^ 1211762496);
            case 160 -> a(-759088731, var9 ^ 122380937);
            case 161 -> a(-759088730, var9 ^ -728103904);
            case 162 -> a(-759088729, var9 ^ -2081663521);
            case 163 -> a(-759088736, var9 ^ 63861848);
            case 164 -> a(-759088735, var9 ^ -1808858913);
            case 165 -> a(-759088734, var9 ^ -669933457);
            case 166 -> a(-759088733, var9 ^ -628558149);
            case 167 -> a(-759088724, var9 ^ 1970329285);
            case 168 -> a(-759088723, var9 ^ -949496916);
            case 169 -> a(-759088722, var9 ^ 1288118853);
            case 170 -> a(-759088721, var9 ^ 12725037);
            case 171 -> a(-759088728, var9 ^ -344552611);
            case 172 -> a(-759088727, var9 ^ -1977383785);
            case 173 -> a(-759088726, var9 ^ -1474405778);
            case 174 -> a(-759088725, var9 ^ 717926026);
            case 175 -> a(-759088716, var9 ^ -149434357);
            case 176 -> a(-759088715, var9 ^ 1124898869);
            case 177 -> a(-759088714, var9 ^ -827290884);
            case 178 -> a(-759088713, var9 ^ -1518690900);
            case 179 -> a(-759088720, var9 ^ 1698588335);
            case 180 -> a(-759088719, var9 ^ -1254812623);
            case 181 -> a(-759088718, var9 ^ -1043430214);
            case 182 -> a(-759088717, var9 ^ -552339636);
            case 183 -> a(-759088708, var9 ^ 239608376);
            case 184 -> a(-759088707, var9 ^ 1927957525);
            case 185 -> a(-759088706, var9 ^ 631206555);
            case 186 -> a(-759088705, var9 ^ 325880641);
            case 187 -> a(-759088712, var9 ^ 959086170);
            case 188 -> a(-759088711, var9 ^ -905329692);
            case 189 -> a(-759088710, var9 ^ 1240240502);
            case 190 -> a(-759088709, var9 ^ 876472551);
            case 191 -> a(-759088700, var9 ^ -1294619520);
            case 192 -> a(-759088699, var9 ^ 1060816318);
            case 193 -> a(-759088698, var9 ^ 1491963204);
            case 194 -> a(-759088697, var9 ^ -845303847);
            case 195 -> a(-759088704, var9 ^ -1543868084);
            case 196 -> a(-759088703, var9 ^ 464959524);
            case 197 -> a(-759088702, var9 ^ 225360971);
            case 198 -> a(-759088701, var9 ^ 1728783521);
            case 199 -> a(-759088692, var9 ^ 1912727545);
            case 200 -> a(-759088691, var9 ^ -954478386);
            case 201 -> a(-759088690, var9 ^ -813610840);
            case 202 -> 2;
            case 203 -> a(-759088689, var9 ^ 2117121954);
            case 204 -> a(-759088696, var9 ^ 368195728);
            case 205 -> a(-759088695, var9 ^ -957610060);
            case 206 -> a(-759088694, var9 ^ -423795703);
            case 207 -> a(-759088693, var9 ^ 1105588659);
            case 208 -> a(-759088684, var9 ^ -313287791);
            case 209 -> a(-759088683, var9 ^ -1401226868);
            case 210 -> a(-759088682, var9 ^ -1950011109);
            case 211 -> a(-759088681, var9 ^ 1352467438);
            case 212 -> a(-759088688, var9 ^ -281198596);
            case 213 -> a(-759088687, var9 ^ -927485767);
            case 214 -> a(-759088686, var9 ^ -1443255646);
            case 215 -> a(-759088685, var9 ^ 1245467576);
            case 216 -> 1;
            case 217 -> a(-759088676, var9 ^ -332219962);
            case 218 -> 3;
            case 219 -> a(-759088675, var9 ^ -890476292);
            case 220 -> a(-759088674, var9 ^ -1681220090);
            case 221 -> a(-759088673, var9 ^ -1823805362);
            case 222 -> a(-759088680, var9 ^ 915368309);
            case 223 -> a(-759088679, var9 ^ -1991557525);
            case 224 -> a(-759088678, var9 ^ -1733300621);
            case 225 -> a(-759088677, var9 ^ 47920377);
            case 226 -> a(-759088668, var9 ^ 808853413);
            case 227 -> 5;
            case 228 -> a(-759088667, var9 ^ -915170770);
            case 229 -> a(-759088666, var9 ^ 369542123);
            case 230 -> a(-759088665, var9 ^ -424686912);
            case 231 -> a(-759088672, var9 ^ 1688541738);
            case 232 -> a(-759088671, var9 ^ -2144348937);
            case 233 -> a(-759088670, var9 ^ -1322451612);
            case 234 -> a(-759088669, var9 ^ 569121191);
            case 235 -> a(-759088660, var9 ^ -328138889);
            case 236 -> a(-759088659, var9 ^ 1454876522);
            case 237 -> a(-759088658, var9 ^ -1589043542);
            case 238 -> a(-759088657, var9 ^ 1140192746);
            case 239 -> a(-759088664, var9 ^ -1734880696);
            case 240 -> a(-759088663, var9 ^ -961855860);
            case 241 -> a(-759088662, var9 ^ -44695135);
            case 242 -> a(-759088661, var9 ^ 2081969300);
            case 243 -> a(-759088652, var9 ^ -1828169869);
            case 244 -> a(-759088651, var9 ^ 1924386973);
            case 245 -> a(-759088650, var9 ^ 1687549111);
            case 246 -> a(-759088649, var9 ^ 344954485);
            case 247 -> a(-759088656, var9 ^ 1950305283);
            case 248 -> a(-759088655, var9 ^ -1506518578);
            case 249 -> a(-759088654, var9 ^ -1476767551);
            case 250 -> a(-759088653, var9 ^ 2015926379);
            case 251 -> a(-759088644, var9 ^ -2005236774);
            case 252 -> a(-759088643, var9 ^ -1779161164);
            case 253 -> a(-759088642, var9 ^ -1740140510);
            case 254 -> a(-759088641, var9 ^ 1200903519);
            default -> a(-759088648, var9 ^ -73152524);
         };
         int var5 = (var1 & a(-759088647, var9 ^ -2128979916)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-759088646, var9 ^ 844751827)) >>> a(-759088645, var9 ^ -1357422249)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-759089148, var9 ^ 121264198);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-759089147, var9 ^ 1128022676);
            }
         }

         baaa[var2] = new String(var3).intern();
      }

      return baaa[var2];
   }

   private void ba(class_1937 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: bipush 0
      // 04: istore 3
      // 05: istore 2
      // 06: aload 0
      // 07: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.abab I
      // 0a: iflt b7
      // 0d: aload 0
      // 0e: iload 2
      // 0f: ifne b8
      // 12: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.abab I
      // 15: iload 2
      // 16: ifne c3
      // 19: goto 1d
      // 1c: athrow
      // 1d: ldc_w -759089146
      // 20: ldc_w 1358080228
      // 23: ldc_w 403025212
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 2a: ldc2_w 4243437911393817370
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // 30: if_icmpge b7
      // 33: goto 37
      // 36: athrow
      // 37: iload 3
      // 38: iinc 3 1
      // 3b: iload 2
      // 3c: ifne c3
      // 3f: goto 43
      // 42: athrow
      // 43: bipush 2
      // 44: if_icmpge b7
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 0
      // 4c: dup
      // 4d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.abab I
      // 50: dup_x1
      // 51: bipush 1
      // 52: iadd
      // 53: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.abab I
      // 56: istore 4
      // 58: iload 4
      // 5a: ldc_w -759089145
      // 5d: ldc_w 1358080228
      // 60: ldc_w -1343658948
      // 63: ixor
      // 64: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 67: ldc2_w 6741148129267062628
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // 6d: irem
      // 6e: bipush 4
      // 6f: isub
      // 70: istore 5
      // 72: iload 4
      // 74: ldc_w -759089152
      // 77: ldc_w 1358080228
      // 7a: ldc_w -233641089
      // 7d: ixor
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 81: ldc2_w 275783559874046523
      // 84: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // 87: idiv
      // 88: bipush 4
      // 89: isub
      // 8a: istore 6
      // 8c: aload 1
      // 8d: invokevirtual net/minecraft/class_1937.method_8398 ()Lnet/minecraft/class_2802;
      // 90: aload 0
      // 91: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bab I
      // 94: iload 5
      // 96: iadd
      // 97: aload 0
      // 98: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bb I
      // 9b: iload 6
      // 9d: iadd
      // 9e: invokevirtual net/minecraft/class_2802.method_21730 (II)Lnet/minecraft/class_2818;
      // a1: astore 7
      // a3: aload 7
      // a5: ifnull b3
      // a8: aload 0
      // a9: aload 1
      // aa: aload 7
      // ac: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bab (Lnet/minecraft/class_1937;Lnet/minecraft/class_2818;)V
      // af: goto b3
      // b2: athrow
      // b3: iload 2
      // b4: ifeq 06
      // b7: aload 0
      // b8: iload 2
      // b9: ifne de
      // bc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.abab I
      // bf: goto c3
      // c2: athrow
      // c3: ldc_w -759089151
      // c6: ldc_w 1358080228
      // c9: ldc_w -1264301350
      // cc: ixor
      // cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // d0: ldc2_w 2054557047296893368
      // d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // d6: if_icmplt e2
      // d9: aload 0
      // da: goto de
      // dd: athrow
      // de: bipush -1
      // df: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.abab I
      // e2: return
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
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 36
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 28
      // 19: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c: ifnull 36
      // 1f: goto 23
      // 22: athrow
      // 23: aload 2
      // 24: goto 28
      // 27: athrow
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: iload 1
      // 2c: ifne 47
      // 2f: ifnonnull 37
      // 32: goto 36
      // 35: athrow
      // 36: return
      // 37: aload 0
      // 38: iload 1
      // 39: ifne 62
      // 3c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.abb ()V
      // 3f: aload 0
      // 40: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaab Lnet/minecraft/class_1937;
      // 43: goto 47
      // 46: athrow
      // 47: aload 2
      // 48: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 4b: if_acmpeq 61
      // 4e: aload 0
      // 4f: aload 2
      // 50: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 53: aload 2
      // 54: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 57: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 5a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bb (Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;)V
      // 5d: goto 61
      // 60: athrow
      // 61: aload 0
      // 62: aload 2
      // 63: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 66: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ba (Lnet/minecraft/class_1937;)V
      // 69: return
   }

   private void bb(class_1937 var1, class_2338 var2) {
      this.aaab = var1;
      this.abab = 0;
      this.bab = var2.method_10263() >> 4;
      this.bb = var2.method_10260() >> 4;
      this.bba.clear();
      this.aaa.clear();
      this.aa.clear();
   }

   private static int aaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-759089150, -663301986 ^ -1522285295);
      if (abba[var3] == null) {
         abba[var3] = (int)(ab[var3] ^ var1);
      }

      return abba[var3];
   }

   private void aab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 26
      // 19: invokevirtual net/minecraft/class_310.method_1483 ()Lnet/minecraft/class_1144;
      // 1c: ifnonnull 25
      // 1f: goto 23
      // 22: athrow
      // 23: return
      // 24: athrow
      // 25: aload 2
      // 26: invokevirtual net/minecraft/class_310.method_1483 ()Lnet/minecraft/class_1144;
      // 29: getstatic net/minecraft/class_3417.field_14793 Lnet/minecraft/class_6880$class_6883;
      // 2c: invokevirtual net/minecraft/class_6880$class_6883.comp_349 ()Ljava/lang/Object;
      // 2f: checkcast net/minecraft/class_3414
      // 32: ldc_w 1.25
      // 35: ldc_w 0.9
      // 38: invokestatic net/minecraft/class_1109.method_4757 (Lnet/minecraft/class_3414;FF)Lnet/minecraft/class_1109;
      // 3b: invokevirtual net/minecraft/class_1144.method_4873 (Lnet/minecraft/class_1113;)Lnet/minecraft/class_1140$class_11518;
      // 3e: pop
      // 3f: return
   }

   public void aba(class_310 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 0
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.babbaab ()Z
      // 09: ifeq 2d
      // 0c: aload 1
      // 0d: iload 4
      // 0f: ifne 1e
      // 12: goto 16
      // 15: athrow
      // 16: ifnull 2d
      // 19: goto 1d
      // 1c: athrow
      // 1d: aload 1
      // 1e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 21: iload 4
      // 23: ifne 32
      // 26: ifnonnull 2e
      // 29: goto 2d
      // 2c: athrow
      // 2d: return
      // 2e: aload 0
      // 2f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaab Lnet/minecraft/class_1937;
      // 32: aload 1
      // 33: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 36: if_acmpeq 75
      // 39: aload 1
      // 3a: iload 4
      // 3c: ifne 52
      // 3f: goto 43
      // 42: athrow
      // 43: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 46: ifnull 5b
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 1
      // 4e: goto 52
      // 51: athrow
      // 52: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 55: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 58: goto 69
      // 5b: new net/minecraft/class_2338
      // 5e: dup
      // 5f: iload 2
      // 60: bipush 4
      // 61: ishl
      // 62: bipush 0
      // 63: iload 3
      // 64: bipush 4
      // 65: ishl
      // 66: invokespecial net/minecraft/class_2338.<init> (III)V
      // 69: astore 5
      // 6b: aload 0
      // 6c: aload 1
      // 6d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 70: aload 5
      // 72: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bb (Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;)V
      // 75: aload 1
      // 76: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 79: invokevirtual net/minecraft/class_638.method_2935 ()Lnet/minecraft/class_631;
      // 7c: iload 2
      // 7d: iload 3
      // 7e: invokevirtual net/minecraft/class_631.method_21730 (II)Lnet/minecraft/class_2818;
      // 81: astore 5
      // 83: aload 5
      // 85: ifnull 96
      // 88: aload 0
      // 89: aload 1
      // 8a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 8d: aload 5
      // 8f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bab (Lnet/minecraft/class_1937;Lnet/minecraft/class_2818;)V
      // 92: goto 96
      // 95: athrow
      // 96: return
   }

   private void abb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 303975076
      // 003: istore 15
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 1
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifne 02d
      // 00e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ba I
      // 011: ifle 024
      // 014: goto 018
      // 017: athrow
      // 018: aload 0
      // 019: dup
      // 01a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ba I
      // 01d: bipush 1
      // 01e: isub
      // 01f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ba I
      // 022: return
      // 023: athrow
      // 024: aload 0
      // 025: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aa Ljava/util/Queue;
      // 028: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
      // 02d: checkcast java/lang/Long
      // 030: astore 2
      // 031: aload 2
      // 032: iload 1
      // 033: ifne 048
      // 036: ifnonnull 03e
      // 039: goto 03d
      // 03c: athrow
      // 03d: return
      // 03e: aload 0
      // 03f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa Ljava/util/Map;
      // 042: aload 2
      // 043: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 048: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa
      // 04b: astore 3
      // 04c: aload 3
      // 04d: iload 1
      // 04e: ifne 05a
      // 051: ifnonnull 059
      // 054: goto 058
      // 057: athrow
      // 058: return
      // 059: aload 3
      // 05a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa.aa ()I
      // 05d: bipush 4
      // 05e: ishl
      // 05f: ldc_w -759089149
      // 062: iload 15
      // 064: ldc_w -2035129588
      // 067: ixor
      // 068: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 06b: ldc2_w 5342391427929468787
      // 06e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // 071: iadd
      // 072: istore 4
      // 074: aload 3
      // 075: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa.ba ()I
      // 078: bipush 4
      // 079: ishl
      // 07a: ldc_w -759089140
      // 07d: iload 15
      // 07f: ldc_w 1445067928
      // 082: ixor
      // 083: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 086: ldc2_w 4572563564944423873
      // 089: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // 08c: iadd
      // 08d: istore 5
      // 08f: iload 4
      // 091: ldc_w -759089139
      // 094: iload 15
      // 096: ldc_w 1463467263
      // 099: ixor
      // 09a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 09d: ldc_w -759089138
      // 0a0: iload 15
      // 0a2: ldc_w 921330558
      // 0a5: ixor
      // 0a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ab (II)Ljava/lang/String;
      // 0ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0af: aload 3
      // 0b0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa.ab ()I
      // 0b3: ldc_w -759089137
      // 0b6: iload 15
      // 0b8: ldc_w 913791650
      // 0bb: ixor
      // 0bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 0bf: ldc_w -759089144
      // 0c2: iload 15
      // 0c4: ldc_w 2127163760
      // 0c7: ixor
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 0cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ab (II)Ljava/lang/String;
      // 0ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0d1: iload 5
      // 0d3: ldc_w -759089143
      // 0d6: iload 15
      // 0d8: ldc_w -2090211201
      // 0db: ixor
      // 0dc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 0df: ldc_w -759089142
      // 0e2: iload 15
      // 0e4: ldc_w -1897157561
      // 0e7: ixor
      // 0e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 0eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ab (II)Ljava/lang/String;
      // 0ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0f1: aload 3
      // 0f2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa.b ()I
      // 0f5: ldc_w -759089141
      // 0f8: iload 15
      // 0fa: ldc_w 1387095041
      // 0fd: ixor
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 101: ldc_w -759089132
      // 104: iload 15
      // 106: ldc_w 2016287914
      // 109: ixor
      // 10a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ab (II)Ljava/lang/String;
      // 110: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 113: astore 14
      // 115: istore 13
      // 117: astore 12
      // 119: istore 11
      // 11b: astore 10
      // 11d: istore 9
      // 11f: astore 8
      // 121: istore 7
      // 123: new java/lang/StringBuilder
      // 126: dup
      // 127: invokespecial java/lang/StringBuilder.<init> ()V
      // 12a: iload 7
      // 12c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 12f: aload 8
      // 131: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 134: iload 9
      // 136: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 139: aload 10
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13e: iload 11
      // 140: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 143: aload 12
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 148: iload 13
      // 14a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 14d: aload 14
      // 14f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 152: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 155: astore 6
      // 157: aload 0
      // 158: aload 6
      // 15a: aload 3
      // 15b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa.a ()J
      // 15e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaab (Ljava/lang/String;J)V
      // 161: aload 0
      // 162: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.baab Ljava/util/Map;
      // 165: aload 3
      // 166: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa.a ()J
      // 169: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 16c: aload 3
      // 16d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa.b ()I
      // 170: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 173: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 178: pop
      // 179: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abab.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abab;
      // 17c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaaaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaaaa;
      // 17f: ldc_w -759089131
      // 182: iload 15
      // 184: ldc_w 1909608392
      // 187: ixor
      // 188: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 18b: ldc_w -759089130
      // 18e: iload 15
      // 190: ldc_w 822223484
      // 193: ixor
      // 194: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 197: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ab (II)Ljava/lang/String;
      // 19a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 19d: aload 3
      // 19e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa.b ()I
      // 1a1: ldc_w -759089129
      // 1a4: iload 15
      // 1a6: ldc_w -67038418
      // 1a9: ixor
      // 1aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 1ad: ldc_w -759089136
      // 1b0: iload 15
      // 1b2: ldc_w -2065223027
      // 1b5: ixor
      // 1b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 1b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ab (II)Ljava/lang/String;
      // 1bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1bf: astore 9
      // 1c1: istore 8
      // 1c3: new java/lang/StringBuilder
      // 1c6: dup
      // 1c7: invokespecial java/lang/StringBuilder.<init> ()V
      // 1ca: iload 8
      // 1cc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1cf: aload 9
      // 1d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaba J
      // 1da: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abab.aba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaaaa;Ljava/lang/String;Ljava/lang/String;J)V
      // 1dd: aload 0
      // 1de: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aab ()V
      // 1e1: aload 0
      // 1e2: ldc_w -759089135
      // 1e5: iload 15
      // 1e7: ldc_w 933360640
      // 1ea: ixor
      // 1eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 1ee: ldc2_w 7650072397207059478
      // 1f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // 1f4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ba I
      // 1f7: return
   }

   @Override
   public void aabaa() {
      this.abab = -1;
      this.ba = 0;
      this.aaab = null;
      this.bba.clear();
      this.baab.clear();
      this.aaa.clear();
      this.aa.clear();
   }

   public abbbaa() {
      int var1 = -191265958;
      super(
         aabbaaaba.aaab(ab(a(-759089134, var1 ^ -312726395), a(-759089133, var1 ^ 1117403518))),
         bbaabbba.bab,
         aabbaaaba.aaab(ab(a(-759089124, var1 ^ 586248362), a(-759089123, var1 ^ 77313601)))
      );
      this.babb = (bababa)this.abbbaaa(
         new bababa(
            aabbaaaba.aaab(ab(a(-759089122, var1 ^ 73837513), a(-759089121, var1 ^ -75295404))), 5.0, 2.0, 32.0, 1.0
         )
      );
      this.aba = (bb)this.abbbaaa(
         new bb(
            aabbaaaba.aaab(ab(a(-759089128, var1 ^ -25128042), a(-759089127, var1 ^ 579712705))), List.of()
         )
      );
      this.bba = new HashMap();
      this.baab = new HashMap();
      this.aaa = new HashMap();
      this.aa = new ArrayDeque();
      this.abab = -1;
   }

   private void bab(class_1937 param1, class_2818 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaaa (Lnet/minecraft/class_1937;Lnet/minecraft/class_2818;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb;
      // 06: astore 4
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0b: bipush 1
      // 0c: aload 0
      // 0d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 10: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 13: checkcast java/lang/Double
      // 16: invokevirtual java/lang/Double.doubleValue ()D
      // 19: invokestatic java/lang/Math.round (D)J
      // 1c: l2i
      // 1d: invokestatic java/lang/Math.max (II)I
      // 20: istore 5
      // 22: istore 3
      // 23: aload 4
      // 25: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.bb ()I
      // 28: iload 5
      // 2a: if_icmpge 2f
      // 2d: return
      // 2e: athrow
      // 2f: aload 2
      // 30: invokevirtual net/minecraft/class_2818.method_12004 ()Lnet/minecraft/class_1923;
      // 33: astore 6
      // 35: aload 6
      // 37: getfield net/minecraft/class_1923.field_9181 I
      // 3a: aload 6
      // 3c: getfield net/minecraft/class_1923.field_9180 I
      // 3f: invokestatic net/minecraft/class_1923.method_8331 (II)J
      // 42: lstore 7
      // 44: aload 0
      // 45: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bba Ljava/util/Map;
      // 48: lload 7
      // 4a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 4d: aload 4
      // 4f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 54: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb
      // 57: astore 9
      // 59: aload 9
      // 5b: iload 3
      // 5c: ifne 8c
      // 5f: ifnull 7e
      // 62: goto 66
      // 65: athrow
      // 66: aload 9
      // 68: iload 3
      // 69: ifne 8c
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 4
      // 72: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb;)Z
      // 75: ifeq 7e
      // 78: goto 7c
      // 7b: athrow
      // 7c: return
      // 7d: athrow
      // 7e: aload 0
      // 7f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.baab Ljava/util/Map;
      // 82: lload 7
      // 84: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 87: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 8c: checkcast java/lang/Integer
      // 8f: astore 10
      // 91: iload 3
      // 92: ifne d0
      // 95: aload 9
      // 97: ifnonnull be
      // 9a: goto 9e
      // 9d: athrow
      // 9e: aload 10
      // a0: iload 3
      // a1: ifne b1
      // a4: goto a8
      // a7: athrow
      // a8: ifnull be
      // ab: goto af
      // ae: athrow
      // af: aload 10
      // b1: invokevirtual java/lang/Integer.intValue ()I
      // b4: aload 4
      // b6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.bb ()I
      // b9: if_icmpne be
      // bc: return
      // bd: athrow
      // be: aload 0
      // bf: aload 6
      // c1: getfield net/minecraft/class_1923.field_9181 I
      // c4: aload 6
      // c6: getfield net/minecraft/class_1923.field_9180 I
      // c9: aload 4
      // cb: lload 7
      // cd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bbb (IILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb;J)V
      // d0: return
   }

   private static bbaa bba(String param0) {
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
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: areturn
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 17: ldc_w -759089126
      // 1a: ldc_w -1099057060
      // 1d: ldc_w -1675791701
      // 20: ixor
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 24: ldc_w -759089125
      // 27: ldc_w -1099057060
      // 2a: ldc_w -1065881952
      // 2d: ixor
      // 2e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.ab (II)Ljava/lang/String;
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 37: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 3a: astore 2
      // 3b: aload 2
      // 3c: iload 1
      // 3d: ifne 4d
      // 40: arraylength
      // 41: bipush 5
      // 42: if_icmpge 4c
      // 45: goto 49
      // 48: athrow
      // 49: aconst_null
      // 4a: areturn
      // 4b: athrow
      // 4c: aload 2
      // 4d: bipush 0
      // 4e: aaload
      // 4f: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 52: istore 3
      // 53: aload 2
      // 54: bipush 2
      // 55: aaload
      // 56: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 59: istore 4
      // 5b: aload 2
      // 5c: bipush 4
      // 5d: aaload
      // 5e: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 61: istore 5
      // 63: iload 3
      // 64: ldc_w -759089116
      // 67: ldc_w -1099057060
      // 6a: ldc_w -1267305630
      // 6d: ixor
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 71: ldc2_w 5592584495162931941
      // 74: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // 77: invokestatic java/lang/Math.floorDiv (II)I
      // 7a: istore 6
      // 7c: iload 4
      // 7e: ldc_w -759089115
      // 81: ldc_w -1099057060
      // 84: ldc_w -591094874
      // 87: ixor
      // 88: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 8b: ldc2_w 2924574712880971053
      // 8e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // 91: invokestatic java/lang/Math.floorDiv (II)I
      // 94: istore 7
      // 96: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaa
      // 99: dup
      // 9a: iload 6
      // 9c: iload 7
      // 9e: invokestatic net/minecraft/class_1923.method_8331 (II)J
      // a1: iload 5
      // a3: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaa.<init> (JI)V
      // a6: areturn
      // a7: astore 3
      // a8: aconst_null
      // a9: areturn
   }

   private void bbb(int param1, int param2, abbbbaabb param3, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa
      // 06: dup
      // 07: iload 1
      // 08: iload 2
      // 09: aload 3
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.ab ()I
      // 0d: aload 3
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.bb ()I
      // 11: lload 4
      // 13: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbabbbaa.<init> (IIIIJ)V
      // 16: astore 7
      // 18: istore 6
      // 1a: aload 0
      // 1b: iload 6
      // 1d: ifne 48
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa Ljava/util/Map;
      // 23: lload 4
      // 25: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 28: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 2d: ifeq 47
      // 30: goto 34
      // 33: athrow
      // 34: aload 0
      // 35: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa Ljava/util/Map;
      // 38: lload 4
      // 3a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 3d: aload 7
      // 3f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 44: pop
      // 45: return
      // 46: athrow
      // 47: aload 0
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa Ljava/util/Map;
      // 4b: iload 6
      // 4d: ifne 81
      // 50: invokeinterface java/util/Map.size ()I 1
      // 55: ldc_w -759089114
      // 58: ldc_w -1212543902
      // 5b: ldc_w 790452707
      // 5e: ixor
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 62: ldc2_w 4283826679235032946
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // 68: if_icmplt 71
      // 6b: goto 6f
      // 6e: athrow
      // 6f: return
      // 70: athrow
      // 71: aload 0
      // 72: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa Ljava/util/Map;
      // 75: lload 4
      // 77: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7a: aload 7
      // 7c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 81: pop
      // 82: aload 0
      // 83: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aa Ljava/util/Queue;
      // 86: lload 4
      // 88: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 8b: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
      // 90: pop
      // 91: return
   }

   private abbbbaabb aaaa(class_1937 param1, class_2818 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 4
      // 003: bipush 0
      // 004: istore 5
      // 006: bipush 0
      // 007: istore 6
      // 009: bipush 0
      // 00a: istore 7
      // 00c: bipush 0
      // 00d: istore 8
      // 00f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 012: bipush 0
      // 013: istore 9
      // 015: bipush 0
      // 016: istore 10
      // 018: istore 3
      // 019: bipush 0
      // 01a: istore 11
      // 01c: aload 2
      // 01d: invokevirtual net/minecraft/class_2818.method_12214 ()Ljava/util/Map;
      // 020: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 025: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 02a: astore 12
      // 02c: aload 12
      // 02e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 033: ifeq 162
      // 036: aload 12
      // 038: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03d: checkcast net/minecraft/class_2586
      // 040: astore 13
      // 042: aload 13
      // 044: invokevirtual net/minecraft/class_2586.method_11016 ()Lnet/minecraft/class_2338;
      // 047: astore 14
      // 049: aload 13
      // 04b: invokevirtual net/minecraft/class_2586.method_11010 ()Lnet/minecraft/class_2680;
      // 04e: astore 15
      // 050: aload 0
      // 051: aload 15
      // 053: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aa (Lnet/minecraft/class_2680;)Z
      // 056: iload 3
      // 057: ifne 075
      // 05a: ifeq 02c
      // 05d: goto 061
      // 060: athrow
      // 061: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bbb Ljava/util/Set;
      // 064: aload 1
      // 065: aload 14
      // 067: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 06a: invokevirtual net/minecraft/class_1937.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 06d: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
      // 070: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 075: ifeq 080
      // 078: iload 3
      // 079: ifeq 02c
      // 07c: goto 080
      // 07f: athrow
      // 080: aload 15
      // 082: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
      // 085: astore 16
      // 087: aload 16
      // 089: iload 3
      // 08a: ifne 0a8
      // 08d: getstatic net/minecraft/class_2246.field_16328 Lnet/minecraft/class_2248;
      // 090: if_acmpne 0a2
      // 093: goto 097
      // 096: athrow
      // 097: iinc 5 1
      // 09a: iload 3
      // 09b: ifeq 154
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: aload 16
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: iload 3
      // 0a9: ifne 0c7
      // 0ac: instanceof net/minecraft/class_2480
      // 0af: ifeq 0c1
      // 0b2: goto 0b6
      // 0b5: athrow
      // 0b6: iinc 6 1
      // 0b9: iload 3
      // 0ba: ifeq 154
      // 0bd: goto 0c1
      // 0c0: athrow
      // 0c1: aload 16
      // 0c3: goto 0c7
      // 0c6: athrow
      // 0c7: iload 3
      // 0c8: ifne 0e6
      // 0cb: getstatic net/minecraft/class_2246.field_10443 Lnet/minecraft/class_2248;
      // 0ce: if_acmpne 0e0
      // 0d1: goto 0d5
      // 0d4: athrow
      // 0d5: iinc 7 1
      // 0d8: iload 3
      // 0d9: ifeq 154
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: aload 16
      // 0e2: goto 0e6
      // 0e5: athrow
      // 0e6: iload 3
      // 0e7: ifne 105
      // 0ea: instanceof net/minecraft/class_2363
      // 0ed: ifeq 0ff
      // 0f0: goto 0f4
      // 0f3: athrow
      // 0f4: iinc 8 1
      // 0f7: iload 3
      // 0f8: ifeq 154
      // 0fb: goto 0ff
      // 0fe: athrow
      // 0ff: aload 16
      // 101: goto 105
      // 104: athrow
      // 105: iload 3
      // 106: ifne 124
      // 109: instanceof net/minecraft/class_2315
      // 10c: ifeq 11e
      // 10f: goto 113
      // 112: athrow
      // 113: iinc 9 1
      // 116: iload 3
      // 117: ifeq 154
      // 11a: goto 11e
      // 11d: athrow
      // 11e: aload 16
      // 120: goto 124
      // 123: athrow
      // 124: iload 3
      // 125: ifne 143
      // 128: getstatic net/minecraft/class_2246.field_10312 Lnet/minecraft/class_2248;
      // 12b: if_acmpne 13d
      // 12e: goto 132
      // 131: athrow
      // 132: iinc 10 1
      // 135: iload 3
      // 136: ifeq 154
      // 139: goto 13d
      // 13c: athrow
      // 13d: aload 16
      // 13f: goto 143
      // 142: athrow
      // 143: instanceof net/minecraft/class_4739
      // 146: iload 3
      // 147: ifne 15c
      // 14a: ifeq 154
      // 14d: goto 151
      // 150: athrow
      // 151: iinc 4 1
      // 154: iload 11
      // 156: aload 14
      // 158: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 15b: iadd
      // 15c: istore 11
      // 15e: iload 3
      // 15f: ifeq 02c
      // 162: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb
      // 165: dup
      // 166: iload 4
      // 168: iload 5
      // 16a: iload 6
      // 16c: iload 7
      // 16e: iload 8
      // 170: iload 9
      // 172: iload 10
      // 174: iload 11
      // 176: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.<init> (IIIIIIII)V
      // 179: areturn
   }

   private static String b(int var0, short var1, char var2) {
      int var3 = var2 ^ 4681;
      char[] var4 = bbab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bbba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bbba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 29081;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '慠';
         var10 ^= 4005;
         var10 -= 57163;
         var10 += 26360;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private void aaab(String param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: invokespecial java/util/ArrayList.<init> ()V
      // 07: astore 5
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0c: aload 5
      // 0e: aload 1
      // 0f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 14: pop
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaaa ()Ljava/util/List;
      // 1c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 21: astore 6
      // 23: istore 4
      // 25: aload 6
      // 27: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2c: ifeq a9
      // 2f: aload 6
      // 31: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 36: checkcast java/lang/String
      // 39: astore 7
      // 3b: iload 4
      // 3d: aload 7
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.bba (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaa;
      // 42: astore 8
      // 44: ifne b2
      // 47: aload 8
      // 49: iload 4
      // 4b: ifne 5b
      // 4e: goto 52
      // 51: athrow
      // 52: ifnull 6c
      // 55: goto 59
      // 58: athrow
      // 59: aload 8
      // 5b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaa.b ()J
      // 5e: lload 2
      // 5f: lcmp
      // 60: iload 4
      // 62: ifne 81
      // 65: ifeq 7a
      // 68: goto 6c
      // 6b: athrow
      // 6c: aload 5
      // 6e: aload 7
      // 70: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 75: pop
      // 76: goto 7a
      // 79: athrow
      // 7a: aload 5
      // 7c: invokeinterface java/util/List.size ()I 1
      // 81: ldc_w -759089074
      // 84: ldc_w -591176249
      // 87: ldc_w 1064071765
      // 8a: ixor
      // 8b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.a (II)I
      // 8e: ldc2_w 9160771333873089474
      // 91: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aaa (IJ)I
      // 94: if_icmplt a0
      // 97: iload 4
      // 99: ifeq a9
      // 9c: goto a0
      // 9f: athrow
      // a0: iload 4
      // a2: ifeq 25
      // a5: goto a9
      // a8: athrow
      // a9: aload 0
      // aa: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // ad: aload 5
      // af: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaa (Ljava/util/List;)V
      // b2: return
   }
}
