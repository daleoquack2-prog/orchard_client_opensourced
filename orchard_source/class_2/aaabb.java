package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class aaabb
   extends abbaabbaa
   implements bababba {
   private static final String[] aaba;
   private final bababa aa;
   private static final String[] ab;
   private final bababa ba;
   private static final Object[] aabb;
   private static final int[] aaab;
   private static final double bb = 7.0;
   private static final long aaa;
   private static final double aab = 18.0;
   private final bababa aba;
   private final abbaaaaa abb;
   private final abbaaaaa baa;
   private final abbaaaaa bab;
   private static final String[] bba;
   private final ababbbba bbb;
   private static final bbabbab aaaa;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var19 = -1096306005;
      String[] var11 = new String[2];
      int var10001 = "ë粖떀紩唉砊ᕬ磶啴篂ᗡ稚㗢簇㔓紮\uf590磩唉箊해缦镠磒ᗢ缲痬羇딄篾喘穉디簚啮績啺縂㗻稊헿罿\uf51a穆햕篹\uf51e禲핻碆啷禲뗴繒헤竏㔀磎㖚砡锜繂镳礶ᕷ綺ᗨ绢ᗣ累딍策喐筙딑箺땦砮㕼禚闾纊㗯纏唀砶떐篑㔟罂镪籞镺礒\uf5f8羊痾租픉祎햄緱甝缢畡竎㕺秚㗽硒闸緿픎竦閌碩唀穂啿翾啶紂痰篪\uf5e9緯딅穆떀粉㔁纚畹置畧碊闪縲嗸罗ᔋ窞喘粱㔂籒ᕠ砶镴稒嗼空\uf5f8罗甓緦햋绉唅繪땼缎镦穂헨署헲簯锑紆㖋缹㔀磊镻磞镴竺뗷羪㗵经㔟翾\uf58c禡唓红ᕣ稾畷粲뗱篚嗣竟딏筎떁磩ᔛ綺㕤罶㕡绢嗤穲뗼磟㔖竦疝秉甌穲땧縦\uf56b缂\uf5f7確痪簇딝笶閕磹\uf507綂해碖핺绢\uf5e5礪\u0019䑆镮䕁ᗴ䉲喐䑦喋䏒\uf508䅊\uf500䐏뗺䆦畫䛙뗽䙲ᖊ䕾間䔺\uf508䚚"
         .length();
      int var13 = 0;
      int var10 = var10001;
      short var14 = 27420;
      int var12 = 0;
      String var9 = "ë粖떀紩唉砊ᕬ磶啴篂ᗡ稚㗢簇㔓紮\uf590磩唉箊해缦镠磒ᗢ缲痬羇딄篾喘穉디簚啮績啺縂㗻稊헿罿\uf51a穆햕篹\uf51e禲핻碆啷禲뗴繒헤竏㔀磎㖚砡锜繂镳礶ᕷ綺ᗨ绢ᗣ累딍策喐筙딑箺땦砮㕼禚闾纊㗯纏唀砶떐篑㔟罂镪籞镺礒\uf5f8羊痾租픉祎햄緱甝缢畡竎㕺秚㗽硒闸緿픎竦閌碩唀穂啿翾啶紂痰篪\uf5e9緯딅穆떀粉㔁纚畹置畧碊闪縲嗸罗ᔋ窞喘粱㔂籒ᕠ砶镴稒嗼空\uf5f8罗甓緦햋绉唅繪땼缎镦穂헨署헲簯锑紆㖋缹㔀磊镻磞镴竺뗷羪㗵经㔟翾\uf58c禡唓红ᕣ稾畷粲뗱篚嗣竟딏筎떁磩ᔛ綺㕤罶㕡绢嗤穲뗼磟㔖竦疝秉甌穲땧縦\uf56b缂\uf5f7確痪簇딝笶閕磹\uf507綂해碖핺绢\uf5e5礪\u0019䑆镮䕁ᗴ䉲喐䑦喋䏒\uf508䅊\uf500䐏뗺䆦畫䛙뗽䙲ᖊ䕾間䔺\uf508䚚";

      do {
         char var15 = var9.charAt(var13);
         int var17 = 0;
         char[] var16 = var9.substring(var13 + 1, var13 + 1 + var15).toCharArray();

         do {
            int var18 = var16[var17];

            var18 = (char)(switch (var17 % 7) {
               default -> 139;
               case 1 -> 127;
               case 2 -> 20;
               case 3 -> 231;
               case 4 -> 23;
               case 5 -> 130;
               case 6 -> 251;
            }) ^ var18;
            if (var17 % 2 == 0) {
               var16[var17] = (char)((var18 >>> 3 | var18 << 13) & 65535 ^ var14);
            } else {
               var16[var17] = (char)((var18 << 3 | var18 >>> 13) & 65535 ^ var14);
            }
         } while (++var17 < var16.length);

         var11[var12] = new String(var16);
         var12++;
         var13 = var13 + var15 + 1;
      } while (var13 < var10);

      aaba = var11;
      aabb = new Object[var11.length];
      byte var23 = 0;
      int var26 = 0;
      aaab = new int[298];
      byte[] var10002 = "¨-Ä0\u008a«z={@÷µæ^K\u0010ÏòUä:ôpï\tº\u009d\u000f:à\u001d\u0094\\RYºár¶\u0095<ËN Ñ\u001dyòc\u0097úË³\u009f:Â\u0018ò\u0018\u0005fp\u0016ËM\u0098åÒ\u0081ZßôOÐkë\u0090\u0092\u008cÜ\u001b²\u001ayr\rÜc¿ðÅ\u009ciU\u008a\u0091Q\fQí#òH}8àðb\u0083{\u0094ðÛê\u000f\u001déàObdÏ\u0093\f{æ\u0019áí`\u007fEëõUBþ½Åµd~±w¨ð¦ÕÉ¹\u0019?S\u0081cÎzaSêO\u009fD\u0091ñÌÍH\u0080sö\u0084¥T\u001f\u0002<&\u0091½W\u0014ñ®\u0098©\u0019\u0083\u0002·>ÛÛw'E<\\\ry§Ï\u009dS\\8uQîîúWDâ\u0094³\u0086ücg¹a\u0005¬À\u0095Ó\u0089bÉú±àê¨h¦\u000fðÖ¹vâ{Õ\u0017m¥mä\u0016\u008dèg§¸ÍúóÁÓÈ:b\u0003²\u0002\u000biÐd\u0004v\u00163âTö´\u00177qu0$\u001fÓ^Þ\u001f¤e(ÚFäõ\fL¶'Ý\u000b¡Q§\u0092 r\u0091Rà\u0016pº_¢\u001ch\u0089$\u0019\u0082ûV=\u0018h§\u009a¬ìû\u001a\u000f\u008d¯odä\u009a\u0099D+±\u007f\u008c6±´\u0099\u0084oà¨\u008a)·rz\u008c\u000e\u001cÏ\u000f\u0002tkE\füJ^\bö*Ç}Xí@¸r\u009a÷\u0002$\u0017188\u000f~e\u0099úX\u0084ã\u000fv\u001e\u0012[4þFcT\u0092ê9\u008d5\r\u008b¦zÛ¸ÎtAé\u0098¢@¡Q\u0091¡^6l\u00ad¼°©@Ô jÅ\u0007\u0016©÷ÕèGøÉ.\u001bÀ+Ébà\u0000Í\u009dÆ\u0006Ä\u001cù«¯a\b1½Ý_vH \u001ej¥+Wëxä\u009d¹\b\u000f\u0080)xvÊ\u0000d~\u0085\u0005j\f\u000ea\u009b3\"\u0019*#(\u00967úÙÛ\u001f¹vì¡\u009a\u00ad,'\u009aG\u008bÛ4@á½)I>°±Z;\u009fË&d©?\u0082OmHÇ\"\u0080Ûuobw|¼Þ\u0019WÂÕ¢Ê\u0010{Ê¡ÿhË\u0017×¹9\u00183Z3d\bøÄ?hrß¯°\u0082\u009dò|ò÷\u0098KlÒ\u008fµ\\\u0004\b¡Ý\u008aÂ\u0080\u0099\u0099>mN\u0014êgöUD+Ð7°Ðw/IË\u009f\u001a¶ãÏaÃë©ÂhÝP\u009e\u001c|}\u00942Æ[º\u001f\u009b³øü¹ª0ò= \u0082[WnÇ$%\u009bU\u0005\u0084ÂÜn/\u0093æ\u0085r(Ïi0û\u0010Æ¡\u0013XE!Ï\u001a\u0083\u0010\f>\u009a\u0017yr\u008fez§\u009e\u0001\u0005QÝÓÐå?jË¹üB|¥þO¾?¬\u0004\u000b\u00ad\u001aø/µFÄ\u0017ÊN´\u008b[\u0088 \u0086_.ïØo\u009c¾OÞÛZ\u0085\u0005fv@§\u00ad\u0017Ãî#\u0018å\u0001Îïojæ fg2û\u007f\u0003Å\u0091arÃW\u0018¼9j»ÚðQRÞÃ\u0018æ5¿u\u0001«I¼\u0003ißp6¾\u0010«Ó¸E³Ú\u0012\u0004ó]m\u0019\f q¿Ât\u009em³\r\u0013\u0097%ÊÒH#ï¥H\u0005Ñ\u0099mD¡\u0001Øù\u0092\u000e\u008d\u009cM¬L?\u0006\u001fÛÿ\u000bVg\u0089-;Ñ/\u0098oÖ`ñ Qóìõ\u0096Z&ë\u0094\u0099\\æ\u0088íÝÌý*\u008fÙq\u0087eU¼\t\u0005ÈZ¹À\u009aÁ\fô\u0084Íl\u009d\u0097\u0081¶û0\u008atÍ\u001e\u001c\u001dÜ\u009f\u0000«\u0090r\b±Z\u001d\u0093\u00122\u0094©YT\u008aw|\u0098ªÏÆÀ\rº\u0002ßÎüÁ:º \u0016õN%\b²ßÓçJú/:]ü£\u0088 \u0092ÏB\u0012\u0002r@Ã(Pýbn\u0007RTMÇ\u0089ð¤×!2\u0080ã:\u0098Wû\u008bO\u0083\u0010fJ\u0097\u008b-\u008e,ª k\u0015þå{§ðy!\u00ad\u0013\u001e\u00ad\u009d\u008eJjw\u0091\u0089Ä¶Þºÿ2d\u0089I*\u0017\u007f\u0010Zû/\" ÷{jI³|g\u0087S\u0091kQ\u0084\u000e\u0086´\u0012\u0012ßÝ¯$l\u0081TL#)çNdk|×\u001bH¡Ág@\u0007ëÍ(êSmºL\u0007*\u007f\u009bÿI!>Ø,H\u0002\u0003\u0096\u0092Cß³Å®ìþÂ|XC\u0081¾\u001eý°\\\u0002e$Ã\u0013éùë?ÇXÙzÅyDì\u0089ïF@\u009c\u001a0\u0015ò±mQI\u0094\u0001ù\u00170´\u0099a\nã\u0080"
         .getBytes("ISO-8859-1");

      int var61;
      do {
         aaab[var23] = ((var10002[var26] & 255) << 24 | (var10002[var26 + 1] & 255) << 16 | (var10002[var26 + 2] & 255) << 8 | var10002[var26 + 3] & 255)
            ^ 1968166700;
         var23 += 1;
         var61 = var26 + 4;
         var26 += 4;
      } while (var61 < var10002.length);

      String[] var7 = new String[a(-1938589496, var19 ^ -1020900682)];
      int var5 = 0;
      String var4;
      int var6 = (var4 = aab(-1044258579, (short)27205, (byte)-70, -470040839)).length();
      int var3 = a(-1938589495, var19 ^ 1580791408);
      int var21 = -1;

      label106:
      while (true) {
         String var24 = var4.substring(++var21, var21 + var3);
         var26 = (byte)-1;

         while (true) {
            label101: {
               char[] var31 = var24.toCharArray();
               var61 = var31.length;
               int var8 = 0;
               var47 = var31;
               var26 = var61;
               char[] var65;
               int var79;
               if (var61 <= 1) {
                  var65 = var31;
                  var79 = var8;
               } else {
                  var47 = var31;
                  var26 = var61;
                  if (var61 <= var8) {
                     break label101;
                  }

                  var65 = var31;
                  var79 = var8;
               }

               while (true) {
                  var65[var79] = (char)(var65[var79] ^ switch (var8 % a(-1938589492, var19 ^ -1310973943)) {
                     case 0 -> a(-1938589491, var19 ^ -2105105701);
                     case 1 -> a(-1938589502, var19 ^ -466295548);
                     case 2 -> a(-1938589501, var19 ^ 1494485543);
                     case 3 -> a(-1938589504, var19 ^ -2068974767);
                     case 4 -> a(-1938589503, var19 ^ 1769719114);
                     case 5 -> a(-1938589498, var19 ^ -604945023);
                     default -> a(-1938589497, var19 ^ 200901917);
                  });
                  var8++;
                  if (var26 == 0) {
                     var79 = var26;
                     var65 = var47;
                  } else {
                     if (var26 <= var8) {
                        break;
                     }

                     var65 = var47;
                     var79 = var8;
                  }
               }
            }

            String var72 = new String(var47).intern();
            switch (var26) {
               case 0:
                  var7[var5++] = var72;
                  if ((var21 += var3) >= var6) {
                     bba = var7;
                     ab = new String[a(-1938589489, var19 ^ -2104308245)];
                     long var0 = 1267090442142502688L;
                     long var53 = -5955625393750650923L ^ var0;
                     byte var38 = -1;
                     aaa = var53;
                     aaaa = bbabbab.bba;
                     return;
                  }

                  var3 = var4.charAt(var21);
                  break;
               default:
                  var7[var5++] = var72;
                  if ((var21 += var3) < var6) {
                     var3 = var4.charAt(var21);
                     continue label106;
                  }

                  var6 = (var4 = aab(-1044258580, (short)-23999, 24, -859468281)).length();
                  var3 = a(-1938589490, var19 ^ 2006247679);
                  var21 = -1;
            }

            var24 = var4.substring(++var21, var21 + var3);
            var26 = (byte)0;
         }
      }
   }

   private void b(class_332 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 4
      // 008: istore 3
      // 009: aload 1
      // 00a: ifnull 026
      // 00d: aload 4
      // 00f: iload 3
      // 010: ifne 020
      // 013: goto 017
      // 016: athrow
      // 017: ifnull 026
      // 01a: goto 01e
      // 01d: athrow
      // 01e: aload 4
      // 020: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 023: ifnonnull 028
      // 026: return
      // 027: athrow
      // 028: aload 0
      // 029: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.bb ()Ljava/lang/String;
      // 02c: astore 5
      // 02e: aload 5
      // 030: iload 3
      // 031: ifne 051
      // 034: invokevirtual java/lang/String.isEmpty ()Z
      // 037: ifeq 04f
      // 03a: goto 03e
      // 03d: athrow
      // 03e: iload 2
      // 03f: iload 3
      // 040: ifne 05c
      // 043: goto 047
      // 046: athrow
      // 047: ifne 04f
      // 04a: goto 04e
      // 04d: athrow
      // 04e: return
      // 04f: aload 5
      // 051: iload 3
      // 052: ifne 07d
      // 055: invokevirtual java/lang/String.isEmpty ()Z
      // 058: goto 05c
      // 05b: athrow
      // 05c: ifeq 07f
      // 05f: ldc -1938589494
      // 061: ldc -1511260309
      // 063: ldc 185071162
      // 065: ixor
      // 066: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.a (II)I
      // 069: ldc -1938589493
      // 06b: ldc -1511260309
      // 06d: ldc 696467184
      // 06f: ixor
      // 070: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.a (II)I
      // 073: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.aaa (II)Ljava/lang/String;
      // 076: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 079: goto 07d
      // 07c: athrow
      // 07d: astore 5
      // 07f: aload 0
      // 080: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.ab ()D
      // 083: dstore 6
      // 085: aload 0
      // 086: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.aabb ()D
      // 089: dstore 8
      // 08b: aload 0
      // 08c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.abb ()D
      // 08f: dstore 10
      // 091: aload 4
      // 093: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 096: astore 12
      // 098: aload 0
      // 099: aload 12
      // 09b: aload 5
      // 09d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.aa (Lnet/minecraft/class_327;Ljava/lang/String;)D
      // 0a0: dstore 13
      // 0a2: aload 1
      // 0a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.abbaab (Lnet/minecraft/class_332;)V
      // 0a6: aload 1
      // 0a7: iload 3
      // 0a8: ifne 0d7
      // 0ab: dload 8
      // 0ad: dload 10
      // 0af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bb (Lnet/minecraft/class_332;DD)V
      // 0b2: aload 1
      // 0b3: dload 6
      // 0b5: dload 6
      // 0b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bbbbba (Lnet/minecraft/class_332;DD)V
      // 0ba: aload 0
      // 0bb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0be: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0c1: checkcast java/lang/Boolean
      // 0c4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0c7: ifne 0d6
      // 0ca: iload 2
      // 0cb: iload 3
      // 0cc: ifne 0f2
      // 0cf: ifeq 0e5
      // 0d2: goto 0d6
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbab;
      // 0da: dconst_0
      // 0db: dconst_0
      // 0dc: dload 13
      // 0de: ldc2_w 18.0
      // 0e1: iload 2
      // 0e2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaa.babb (Lnet/minecraft/class_332;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbab;DDDDZ)V
      // 0e5: aload 0
      // 0e6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0e9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0ec: checkcast java/lang/Boolean
      // 0ef: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f2: ifeq 0fc
      // 0f5: ldc2_w 7.0
      // 0f8: goto 0fd
      // 0fb: athrow
      // 0fc: dconst_0
      // 0fd: dstore 15
      // 0ff: ldc2_w 18.0
      // 102: aload 12
      // 104: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 107: pop
      // 108: ldc2_w 9.0
      // 10b: dsub
      // 10c: ldc2_w 0.5
      // 10f: dmul
      // 110: dstore 17
      // 112: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.aaa J
      // 115: l2i
      // 116: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaa.baa (I)I
      // 119: istore 19
      // 11b: aload 0
      // 11c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 11f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 122: checkcast java/lang/Boolean
      // 125: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 128: istore 20
      // 12a: aload 5
      // 12c: astore 21
      // 12e: aload 0
      // 12f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 132: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 135: checkcast java/lang/Boolean
      // 138: iload 20
      // 13a: aload 1
      // 13b: aload 12
      // 13d: aload 21
      // 13f: dload 15
      // 141: dload 17
      // 143: iload 19
      // 145: invokedynamic run (ZLnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.ba (ZLnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)V, ()V ]
      // 14a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bbaaba (Ljava/lang/Boolean;Ljava/lang/Runnable;)V
      // 14d: aload 1
      // 14e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.ababbb (Lnet/minecraft/class_332;)V
      // 151: goto 15d
      // 154: astore 22
      // 156: aload 1
      // 157: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.ababbb (Lnet/minecraft/class_332;)V
      // 15a: aload 22
      // 15c: athrow
      // 15d: return
   }

   @Override
   public double aabb() {
      return (Double)this.aba.abbb();
   }

   private double aa(class_327 var1, String var2) {
      double var3 = abbaa.baabba(var1, var2);

      try {
         if ((Boolean)this.bab.abbb()) {
            return 14.0 + var3;
         }
      } catch (MatchException var5) {
         throw var5;
      }

      return var3;
   }

   public aaabb() {
      int var1 = 1494669326;
      super(
         aabbaaaba.aaab(aaa(a(-1938589500, var1 ^ 1193610603), a(-1938589499, var1 ^ 967298589))),
         bbaabbba.ba,
         aabbaaaba.aaab(aaa(a(-1938589478, var1 ^ 307228833), a(-1938589477, var1 ^ -561035395)))
      );
      this.bbb = (ababbbba)this.abbbaaa(
         new ababbbba(
            aabbaaaba.aaab(aaa(a(-1938589480, var1 ^ 268926621), a(-1938589479, var1 ^ -817525094))),
            aabbaaaba.aaab(aaa(a(-1938589474, var1 ^ 1147473071), a(-1938589473, var1 ^ 769310331)))
         )
      );
      this.abb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaa(a(-1938589476, var1 ^ -534260927), a(-1938589475, var1 ^ 914370214))), true
         )
      );
      this.baa = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaa(a(-1938589486, var1 ^ 249250964), a(-1938589485, var1 ^ 2082841881))), true
         )
      );
      this.bab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaa(a(-1938589488, var1 ^ 1731716374), a(-1938589487, var1 ^ -592527199))), true
         )
      );
      this.aba = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aaa(a(-1938589482, var1 ^ -2076370488), a(-1938589481, var1 ^ -1237847209))),
               18.0,
               0.0,
               4000.0,
               1.0
            )
            .bba(aabbaaaba.aaab(aaa(a(-1938589484, var1 ^ 991463016), a(-1938589483, var1 ^ 607280026))))
      );
      this.aa = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aaa(a(-1938589462, var1 ^ -1296602381), a(-1938589461, var1 ^ -1272841366))),
               94.0,
               0.0,
               4000.0,
               1.0
            )
            .bba(aabbaaaba.aaab(aaa(a(-1938589464, var1 ^ -1586835217), a(-1938589463, var1 ^ 1001035672))))
      );
      this.ba = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aaa(a(-1938589458, var1 ^ -148393066), a(-1938589457, var1 ^ -1771297818))),
               100.0,
               75.0,
               200.0,
               5.0
            )
            .bba(aabbaaaba.aaab(aaa(a(-1938589460, var1 ^ 206993045), a(-1938589459, var1 ^ 632606204))))
      );
   }

   @Override
   public void abbb(double var1, double var3) {
      this.aba.aaa(Math.max(0.0, var1));
      this.aa.aaa(Math.max(0.0, var3));
   }

   private double ab() {
      return Math.max(0.75, Math.min(2.0, (Double)this.ba.abbb() / 100.0));
   }

   @Override
   public double abb() {
      return (Double)this.aa.abbb();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @Override
   public double aaaaa() {
      int var10000 = aabbabbab.ab;
      class_310 var2 = class_310.method_1551();
      int var1 = var10000;

      label30: {
         label29: {
            try {
               var6 = var2;
               if (var1 != 0) {
                  break label29;
               }

               if (var2 == null) {
                  break label30;
               }
            } catch (MatchException var5) {
               throw var5;
            }

            var6 = var2;
         }

         try {
            if (var6.field_1772 != null) {
               return this.aa(var2.field_1772, this.bb()) * this.ab();
            }
         } catch (MatchException var4) {
            throw var4;
         }
      }

      try {
         return 42.0 * this.ab();
      } catch (MatchException var3) {
         throw var3;
      }
   }

   private static void ba(boolean param0, class_332 param1, class_327 param2, String param3, double param4, double param6, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 9
      // 05: iload 0
      // 06: ifeq 1e
      // 09: aload 1
      // 0a: aload 2
      // 0b: aload 3
      // 0c: dload 4
      // 0e: dload 6
      // 10: iload 8
      // 12: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.aaabb (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)V
      // 15: iload 9
      // 17: ifeq 2e
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 1
      // 1f: aload 2
      // 20: aload 3
      // 21: dload 4
      // 23: dload 6
      // 25: iload 8
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.b (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)V
      // 2a: goto 2e
      // 2d: athrow
      // 2e: return
   }

   private static int a(int var0, int var1) {
      int var2 = aaab[var0 ^ -1938589494] ^ var1 ^ var0;
      var2 += 60429;
      var2 ^= 15492;
      var2 += 49881;
      var2 ^= 22459;
      var2 -= 15554;
      var2 += 10446;
      var2 ^= 57167;
      var2 -= 29307;
      var2 ^= 50436;
      return var2 + 26159;
   }

   @Override
   public void bbb(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.b(var1, var5);
   }

   @Override
   public double baab() {
      return 18.0 * this.ab();
   }

   private static String aab(int var0, short var1, byte var2, int var3) {
      int var8 = var0 ^ -1044258579;
      char[] var7 = aaba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aabb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         aabb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 43171;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ var6 ^ switch (var6 % 19) {
            default -> 101;
            case 1 -> 189;
            case 2 -> 229;
            case 3 -> 105;
            case 4 -> 135;
            case 5 -> 152;
            case 6 -> 75;
            case 7 -> 5;
            case 8 -> 216;
            case 9 -> 41;
            case 10 -> 37;
            case 11 -> 143;
            case 12 -> 194;
            case 13 -> 150;
            case 14 -> 25;
            case 15 -> 18;
            case 16 -> 9;
            case 17 -> 226;
            case 18 -> 161;
         } ^ var0 ^ var5 ^ var2 ^ var1 ^ var3);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   @Override
   public boolean abba(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 5
      // 05: dload 1
      // 06: iload 5
      // 08: ifne 1c
      // 0b: aload 0
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.aabb ()D
      // 0f: dcmpl
      // 10: iflt 67
      // 13: goto 17
      // 16: athrow
      // 17: dload 1
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.aabb ()D
      // 20: iload 5
      // 22: ifne 3b
      // 25: aload 0
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.aaaaa ()D
      // 29: dadd
      // 2a: dcmpg
      // 2b: ifgt 67
      // 2e: goto 32
      // 31: athrow
      // 32: dload 3
      // 33: aload 0
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.abb ()D
      // 37: goto 3b
      // 3a: athrow
      // 3b: iload 5
      // 3d: ifne 56
      // 40: dcmpl
      // 41: iflt 67
      // 44: goto 48
      // 47: athrow
      // 48: dload 3
      // 49: aload 0
      // 4a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.abb ()D
      // 4d: aload 0
      // 4e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabb.baab ()D
      // 51: dadd
      // 52: goto 56
      // 55: athrow
      // 56: dcmpg
      // 57: iload 5
      // 59: ifne 64
      // 5c: ifgt 67
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 1
      // 64: goto 68
      // 67: bipush 0
      // 68: ireturn
   }

   private String bb() {
      int var10000 = aabbabbab.ab;
      String var2 = this.bbb.abb();
      int var1 = var10000;

      try {
         if (var1 != 0) {
            return var2;
         }

         if (var2 == null) {
            return "";
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return var2;
   }

   @Override
   public void aabbb(class_332 var1, int var2, int var3, float var4) {
      this.b(var1, false);
   }

   @Override
   public void bab(class_332 var1, int var2, int var3, float var4) {
      this.b(var1, false);
   }

   private static String aaa(int var0, int var1) {
      int var9 = 1032582503;
      int var2 = (var0 ^ a(-1938589470, var9 ^ 1960148158)) & a(-1938589469, var9 ^ -897239547);
      if (ab[var2] == null) {
         char[] var3 = bba[var2].toCharArray();

         int var4 = switch (var3[0] & a(-1938589472, var9 ^ -1153879862)) {
            case 0 -> a(-1938589471, var9 ^ -1642141776);
            case 1 -> 5;
            case 2 -> a(-1938589466, var9 ^ 124545876);
            case 3 -> a(-1938589465, var9 ^ 1818102610);
            case 4 -> a(-1938589468, var9 ^ -1545347137);
            case 5 -> a(-1938589467, var9 ^ 972932871);
            case 6 -> a(-1938589446, var9 ^ -532816882);
            case 7 -> a(-1938589445, var9 ^ 118945667);
            case 8 -> a(-1938589448, var9 ^ -1668979569);
            case 9 -> a(-1938589447, var9 ^ 1735560574);
            case 10 -> a(-1938589442, var9 ^ -710671644);
            case 11 -> a(-1938589441, var9 ^ 2141744708);
            case 12 -> a(-1938589444, var9 ^ -1112106142);
            case 13 -> a(-1938589443, var9 ^ -2111046178);
            case 14 -> a(-1938589454, var9 ^ -69260351);
            case 15 -> a(-1938589453, var9 ^ 1501758230);
            case 16 -> a(-1938589456, var9 ^ -610243007);
            case 17 -> a(-1938589455, var9 ^ -1656408341);
            case 18 -> a(-1938589450, var9 ^ -2109990387);
            case 19 -> a(-1938589449, var9 ^ -295856884);
            case 20 -> a(-1938589452, var9 ^ 1454305071);
            case 21 -> a(-1938589451, var9 ^ -752000656);
            case 22 -> a(-1938589558, var9 ^ -156235479);
            case 23 -> a(-1938589557, var9 ^ -394083839);
            case 24 -> a(-1938589560, var9 ^ 955841128);
            case 25 -> a(-1938589559, var9 ^ 1385865800);
            case 26 -> a(-1938589554, var9 ^ 1297927152);
            case 27 -> 4;
            case 28 -> a(-1938589553, var9 ^ 1874611263);
            case 29 -> a(-1938589556, var9 ^ 205230006);
            case 30 -> a(-1938589555, var9 ^ 525674973);
            case 31 -> a(-1938589566, var9 ^ -447390323);
            case 32 -> a(-1938589565, var9 ^ 328253047);
            case 33 -> a(-1938589568, var9 ^ -834237720);
            case 34 -> a(-1938589567, var9 ^ 479720384);
            case 35 -> a(-1938589562, var9 ^ 1793944284);
            case 36 -> a(-1938589561, var9 ^ 1239127135);
            case 37 -> a(-1938589564, var9 ^ 758807583);
            case 38 -> a(-1938589563, var9 ^ -1722380058);
            case 39 -> a(-1938589542, var9 ^ 525564557);
            case 40 -> a(-1938589541, var9 ^ 1836572859);
            case 41 -> a(-1938589544, var9 ^ -1664068439);
            case 42 -> a(-1938589543, var9 ^ -1068435570);
            case 43 -> a(-1938589538, var9 ^ -1809473588);
            case 44 -> a(-1938589537, var9 ^ -1579958518);
            case 45 -> a(-1938589540, var9 ^ -1976208165);
            case 46 -> a(-1938589539, var9 ^ -1963040272);
            case 47 -> a(-1938589550, var9 ^ 1420447833);
            case 48 -> a(-1938589549, var9 ^ 318605921);
            case 49 -> a(-1938589552, var9 ^ -1220224402);
            case 50 -> a(-1938589551, var9 ^ 877169761);
            case 51 -> a(-1938589546, var9 ^ 2118518488);
            case 52 -> 1;
            case 53 -> a(-1938589545, var9 ^ 1698828252);
            case 54 -> a(-1938589548, var9 ^ -63463079);
            case 55 -> a(-1938589547, var9 ^ 2079492745);
            case 56 -> a(-1938589526, var9 ^ -867640269);
            case 57 -> a(-1938589525, var9 ^ 175293212);
            case 58 -> a(-1938589528, var9 ^ 1160732945);
            case 59 -> a(-1938589527, var9 ^ 1674454280);
            case 60 -> a(-1938589522, var9 ^ 1297410369);
            case 61 -> a(-1938589521, var9 ^ 263503445);
            case 62 -> a(-1938589524, var9 ^ 1876431573);
            case 63 -> a(-1938589523, var9 ^ -1233128031);
            case 64 -> a(-1938589534, var9 ^ -1657791017);
            case 65 -> a(-1938589533, var9 ^ -180438954);
            case 66 -> a(-1938589536, var9 ^ -1545042281);
            case 67 -> a(-1938589535, var9 ^ 1792760188);
            case 68 -> a(-1938589530, var9 ^ 220621778);
            case 69 -> a(-1938589529, var9 ^ -1948010271);
            case 70 -> a(-1938589532, var9 ^ 455097478);
            case 71 -> a(-1938589531, var9 ^ 769855275);
            case 72 -> a(-1938589510, var9 ^ -754122497);
            case 73 -> a(-1938589509, var9 ^ 357644749);
            case 74 -> 0;
            case 75 -> a(-1938589512, var9 ^ -232252709);
            case 76 -> a(-1938589511, var9 ^ -153666302);
            case 77 -> a(-1938589506, var9 ^ -11124959);
            case 78 -> a(-1938589505, var9 ^ -1809068514);
            case 79 -> a(-1938589508, var9 ^ -2036881439);
            case 80 -> a(-1938589507, var9 ^ 1936385980);
            case 81 -> a(-1938589518, var9 ^ -1637765584);
            case 82 -> a(-1938589517, var9 ^ 1135502758);
            case 83 -> a(-1938589520, var9 ^ 860191378);
            case 84 -> a(-1938589519, var9 ^ 1128018141);
            case 85 -> a(-1938589514, var9 ^ 1597275660);
            case 86 -> a(-1938589513, var9 ^ 1363604667);
            case 87 -> a(-1938589516, var9 ^ -1602627404);
            case 88 -> a(-1938589515, var9 ^ 292154911);
            case 89 -> a(-1938589622, var9 ^ 212870120);
            case 90 -> a(-1938589621, var9 ^ 619941410);
            case 91 -> a(-1938589624, var9 ^ -1697622655);
            case 92 -> a(-1938589623, var9 ^ 483442479);
            case 93 -> a(-1938589618, var9 ^ -528565583);
            case 94 -> a(-1938589617, var9 ^ -2040286887);
            case 95 -> a(-1938589620, var9 ^ -1946443046);
            case 96 -> a(-1938589619, var9 ^ -1534992797);
            case 97 -> a(-1938589630, var9 ^ -1837808438);
            case 98 -> a(-1938589629, var9 ^ 1442987970);
            case 99 -> a(-1938589632, var9 ^ -1148079344);
            case 100 -> a(-1938589631, var9 ^ 1497203722);
            case 101 -> a(-1938589626, var9 ^ -447500510);
            case 102 -> a(-1938589625, var9 ^ -286773154);
            case 103 -> a(-1938589628, var9 ^ 1082153304);
            case 104 -> a(-1938589627, var9 ^ 1401024168);
            case 105 -> a(-1938589606, var9 ^ -2106335194);
            case 106 -> a(-1938589605, var9 ^ 1635360292);
            case 107 -> a(-1938589608, var9 ^ -1014053577);
            case 108 -> a(-1938589607, var9 ^ 1234523927);
            case 109 -> a(-1938589602, var9 ^ -1177089241);
            case 110 -> a(-1938589601, var9 ^ -910335860);
            case 111 -> a(-1938589604, var9 ^ 1469609370);
            case 112 -> a(-1938589603, var9 ^ 1733226539);
            case 113 -> a(-1938589614, var9 ^ -423609803);
            case 114 -> a(-1938589613, var9 ^ -1563179965);
            case 115 -> a(-1938589616, var9 ^ 1969099388);
            case 116 -> a(-1938589615, var9 ^ -853557974);
            case 117 -> a(-1938589610, var9 ^ -344110987);
            case 118 -> a(-1938589609, var9 ^ 1281724331);
            case 119 -> a(-1938589612, var9 ^ -1538241269);
            case 120 -> a(-1938589611, var9 ^ -198507156);
            case 121 -> a(-1938589590, var9 ^ -1836543959);
            case 122 -> 3;
            case 123 -> a(-1938589589, var9 ^ 1809115047);
            case 124 -> a(-1938589592, var9 ^ 1189016684);
            case 125 -> a(-1938589591, var9 ^ 1626400481);
            case 126 -> a(-1938589586, var9 ^ -2001598771);
            case 127 -> a(-1938589585, var9 ^ -1854272707);
            case 128 -> a(-1938589588, var9 ^ -1681349682);
            case 129 -> a(-1938589587, var9 ^ 1435360436);
            case 130 -> a(-1938589598, var9 ^ -1608516166);
            case 131 -> a(-1938589597, var9 ^ -107571467);
            case 132 -> a(-1938589600, var9 ^ -1465090291);
            case 133 -> a(-1938589599, var9 ^ 327521078);
            case 134 -> a(-1938589594, var9 ^ -1067827523);
            case 135 -> a(-1938589593, var9 ^ 672316499);
            case 136 -> a(-1938589596, var9 ^ -196051999);
            case 137 -> a(-1938589595, var9 ^ 930374484);
            case 138 -> a(-1938589574, var9 ^ 1110996987);
            case 139 -> a(-1938589573, var9 ^ 1106077528);
            case 140 -> a(-1938589576, var9 ^ 1041966573);
            case 141 -> a(-1938589575, var9 ^ -340801787);
            case 142 -> a(-1938589570, var9 ^ -252509064);
            case 143 -> a(-1938589569, var9 ^ 1206859929);
            case 144 -> a(-1938589572, var9 ^ -2055907718);
            case 145 -> a(-1938589571, var9 ^ 820503125);
            case 146 -> a(-1938589582, var9 ^ 352288893);
            case 147 -> a(-1938589581, var9 ^ 746632742);
            case 148 -> a(-1938589584, var9 ^ -1341043060);
            case 149 -> a(-1938589583, var9 ^ -1122642797);
            case 150 -> a(-1938589578, var9 ^ -484091369);
            case 151 -> a(-1938589577, var9 ^ 1955864054);
            case 152 -> a(-1938589580, var9 ^ -1102078240);
            case 153 -> a(-1938589579, var9 ^ 2079151825);
            case 154 -> a(-1938589686, var9 ^ -123413699);
            case 155 -> a(-1938589685, var9 ^ -565496271);
            case 156 -> a(-1938589688, var9 ^ 1411391640);
            case 157 -> a(-1938589687, var9 ^ 1563282341);
            case 158 -> a(-1938589682, var9 ^ 1145650461);
            case 159 -> a(-1938589681, var9 ^ 1513620846);
            case 160 -> a(-1938589684, var9 ^ 603389937);
            case 161 -> a(-1938589683, var9 ^ -2138044380);
            case 162 -> a(-1938589694, var9 ^ 1771321970);
            case 163 -> a(-1938589693, var9 ^ -578861477);
            case 164 -> a(-1938589696, var9 ^ 987869501);
            case 165 -> a(-1938589695, var9 ^ 941827424);
            case 166 -> a(-1938589690, var9 ^ 234154075);
            case 167 -> a(-1938589689, var9 ^ -386759814);
            case 168 -> a(-1938589692, var9 ^ -514276803);
            case 169 -> a(-1938589691, var9 ^ 1713889240);
            case 170 -> a(-1938589670, var9 ^ -1690613812);
            case 171 -> a(-1938589669, var9 ^ 1339331877);
            case 172 -> a(-1938589672, var9 ^ 911830365);
            case 173 -> a(-1938589671, var9 ^ -241651089);
            case 174 -> a(-1938589666, var9 ^ -722489028);
            case 175 -> a(-1938589665, var9 ^ -355232484);
            case 176 -> a(-1938589668, var9 ^ -1706352610);
            case 177 -> a(-1938589667, var9 ^ -1455131307);
            case 178 -> a(-1938589678, var9 ^ 1994831405);
            case 179 -> a(-1938589677, var9 ^ 1028989870);
            case 180 -> a(-1938589680, var9 ^ 807182288);
            case 181 -> a(-1938589679, var9 ^ 376514832);
            case 182 -> a(-1938589674, var9 ^ -1557844147);
            case 183 -> a(-1938589673, var9 ^ -890590974);
            case 184 -> a(-1938589676, var9 ^ -675320099);
            case 185 -> a(-1938589675, var9 ^ 497118254);
            case 186 -> a(-1938589654, var9 ^ 1739354805);
            case 187 -> 2;
            case 188 -> a(-1938589653, var9 ^ -427423899);
            case 189 -> a(-1938589656, var9 ^ -1265399298);
            case 190 -> a(-1938589655, var9 ^ 1579107505);
            case 191 -> a(-1938589650, var9 ^ 1048748726);
            case 192 -> a(-1938589649, var9 ^ -70239599);
            case 193 -> a(-1938589652, var9 ^ -808569774);
            case 194 -> a(-1938589651, var9 ^ -1495447715);
            case 195 -> a(-1938589662, var9 ^ -1065717709);
            case 196 -> a(-1938589661, var9 ^ -162208703);
            case 197 -> a(-1938589664, var9 ^ -405407535);
            case 198 -> a(-1938589663, var9 ^ -1422331256);
            case 199 -> a(-1938589658, var9 ^ 1633113575);
            case 200 -> a(-1938589657, var9 ^ 165564509);
            case 201 -> a(-1938589660, var9 ^ 1874889975);
            case 202 -> a(-1938589659, var9 ^ -1545586931);
            case 203 -> a(-1938589638, var9 ^ -79215931);
            case 204 -> a(-1938589637, var9 ^ -461096390);
            case 205 -> a(-1938589640, var9 ^ 32528522);
            case 206 -> a(-1938589639, var9 ^ -838540309);
            case 207 -> a(-1938589634, var9 ^ -1986712708);
            case 208 -> a(-1938589633, var9 ^ 1907415037);
            case 209 -> a(-1938589636, var9 ^ 1723226776);
            case 210 -> a(-1938589635, var9 ^ 467154912);
            case 211 -> a(-1938589646, var9 ^ 692619906);
            case 212 -> a(-1938589645, var9 ^ -127752123);
            case 213 -> a(-1938589648, var9 ^ 1495581015);
            case 214 -> a(-1938589647, var9 ^ 1862730118);
            case 215 -> a(-1938589642, var9 ^ -873583252);
            case 216 -> a(-1938589641, var9 ^ 164240195);
            case 217 -> a(-1938589644, var9 ^ -1558380081);
            case 218 -> a(-1938589643, var9 ^ 1959389735);
            case 219 -> a(-1938589238, var9 ^ 1910338201);
            case 220 -> a(-1938589237, var9 ^ -1251585121);
            case 221 -> a(-1938589240, var9 ^ 1348404571);
            case 222 -> a(-1938589239, var9 ^ 1089276854);
            case 223 -> a(-1938589234, var9 ^ 451406535);
            case 224 -> a(-1938589233, var9 ^ -1764264177);
            case 225 -> a(-1938589236, var9 ^ 1362974348);
            case 226 -> a(-1938589235, var9 ^ -252027);
            case 227 -> a(-1938589246, var9 ^ -998727891);
            case 228 -> a(-1938589245, var9 ^ 1918947361);
            case 229 -> a(-1938589248, var9 ^ 722484256);
            case 230 -> a(-1938589247, var9 ^ 426380944);
            case 231 -> a(-1938589242, var9 ^ 1359170215);
            case 232 -> a(-1938589241, var9 ^ 1556982291);
            case 233 -> a(-1938589244, var9 ^ 1343963913);
            case 234 -> a(-1938589243, var9 ^ -1107372676);
            case 235 -> a(-1938589222, var9 ^ -459839425);
            case 236 -> a(-1938589221, var9 ^ 1472966635);
            case 237 -> a(-1938589224, var9 ^ 409149129);
            case 238 -> a(-1938589223, var9 ^ 1596032391);
            case 239 -> a(-1938589218, var9 ^ 537025448);
            case 240 -> a(-1938589217, var9 ^ 1544224475);
            case 241 -> a(-1938589220, var9 ^ -161344602);
            case 242 -> a(-1938589219, var9 ^ 1458615589);
            case 243 -> a(-1938589230, var9 ^ 288709817);
            case 244 -> a(-1938589229, var9 ^ 1919665765);
            case 245 -> a(-1938589232, var9 ^ 386071330);
            case 246 -> a(-1938589231, var9 ^ -1378305444);
            case 247 -> a(-1938589226, var9 ^ -2003871901);
            case 248 -> a(-1938589225, var9 ^ -980908605);
            case 249 -> a(-1938589228, var9 ^ 2026588017);
            case 250 -> a(-1938589227, var9 ^ -956654620);
            case 251 -> a(-1938589206, var9 ^ 1584282201);
            case 252 -> a(-1938589205, var9 ^ -760016543);
            case 253 -> a(-1938589208, var9 ^ -65921002);
            case 254 -> a(-1938589207, var9 ^ -30178505);
            default -> a(-1938589202, var9 ^ -1297760266);
         };
         int var5 = (var1 & a(-1938589201, var9 ^ -1487866028)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-1938589204, var9 ^ -906455277)) >>> a(-1938589203, var9 ^ 1927215641)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-1938589214, var9 ^ 746222549);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-1938589213, var9 ^ 1514153165);
            }
         }

         ab[var2] = new String(var3).intern();
      }

      return ab[var2];
   }
}
