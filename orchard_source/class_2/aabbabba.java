package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10042;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class aabbabba extends abbaabbaa {
   private static final int aa;
   private float ab;
   private float ba;
   private float bb;
   private static final String[] abbb;
   private boolean aaa;
   private static final float aab = 0.3F;
   private int aba;
   private static final int[] abba;
   private static final Integer[] abb;
   private static final String[] baa;
   private static final float bab = 0.15F;
   private final bababa bba;
   private float bbb;
   private float aaaa;
   private static final long[] aaab;
   private static final Object[] baaa;
   private final abbaaaaa aaba;
   private final baabaab aabb;
   private float abaa;
   private static final String[] abab;

   private static String aab(short var0, char var1, int var2) {
      int var3 = var1 ^ 8219;
      char[] var4 = abbb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])baaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         baaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 24571;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 19451;
         var10 -= 20555;
         var10 ^= 23193;
         var10 ^= 2337;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-765235786, 768644296 ^ 73001649);
      if (abb[var3] == null) {
         abb[var3] = (int)(aaab[var3] ^ var1);
      }

      return abb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var25 = 2083018736;
      int var19 = 0;
      int var16 = ";鬋纋ꆽ﹒髣㻖ꆫ\ude95鮍\ude47黣绖骋庌驍㺭ꄻ帢鿣㺔ꂥ庭鬣ḿ麛庀鵍鹛ꁻ帿骣干鮽Ậꅛ绛鸻ﹾ鴕幂鯓鸤麣ﺎ鲝ṓ鬣師ꁛ纔ꂵ\ude5d鹻뻐驃麈鱭庬黣q\ued91\uf745\uf177鞄\uf359矧\ued41띍\uf18f힘\uf0b1랗\ued21坂\uec57埪\uf169㟦\ueac1뜼\uea0f\uf786\ued01矾\uf001\uf742\uf007埬\uee91埧\uf1e1ᝂ\uf0c7垘\ueb39០\ued11흍\ued07\uf798\ueb29럢\uedf1띍\ueaef鞙\uee89힗\uee69坃\uf05f㞘\uef91矾\ueb39띅\ueaf7\u17ee\uf051ퟹ\ueb49ᝏ\uec0f\u17ec\uebd1\uf7ee\uef99\u173d\uec27瞕\uf049韪\uf1f9圲\uea87힗\uf0a9랒\uf079\uf739\uebefឆ\uec31韸\uea19ᝀ\uef37\uf7e0\uee79ព\uef29眾\ued57\u17ef\uea91埥\uf029ᝁ\uedc7\uf799\uee21\uf7f9\ueb51㝔\uf03f垝\uf191鞚\ued29㝎\uf03f垑\uefc9\u0010쑳΅쌕鼵쭻｜웋㿰쌽㼼읻\udf70쐓忘쓕缷\n\uec17潃\uece9꾂\uea07俿\ueb37⽖\uebf9⾄"
         .length();
      String var15 = ";鬋纋ꆽ﹒髣㻖ꆫ\ude95鮍\ude47黣绖骋庌驍㺭ꄻ帢鿣㺔ꂥ庭鬣ḿ麛庀鵍鹛ꁻ帿骣干鮽Ậꅛ绛鸻ﹾ鴕幂鯓鸤麣ﺎ鲝ṓ鬣師ꁛ纔ꂵ\ude5d鹻뻐驃麈鱭庬黣q\ued91\uf745\uf177鞄\uf359矧\ued41띍\uf18f힘\uf0b1랗\ued21坂\uec57埪\uf169㟦\ueac1뜼\uea0f\uf786\ued01矾\uf001\uf742\uf007埬\uee91埧\uf1e1ᝂ\uf0c7垘\ueb39០\ued11흍\ued07\uf798\ueb29럢\uedf1띍\ueaef鞙\uee89힗\uee69坃\uf05f㞘\uef91矾\ueb39띅\ueaf7\u17ee\uf051ퟹ\ueb49ᝏ\uec0f\u17ec\uebd1\uf7ee\uef99\u173d\uec27瞕\uf049韪\uf1f9圲\uea87힗\uf0a9랒\uf079\uf739\uebefឆ\uec31韸\uea19ᝀ\uef37\uf7e0\uee79ព\uef29眾\ued57\u17ef\uea91埥\uf029ᝁ\uedc7\uf799\uee21\uf7f9\ueb51㝔\uf03f垝\uf191鞚\ued29㝎\uf03f垑\uefc9\u0010쑳΅쌕鼵쭻｜웋㿰쌽㼼읻\udf70쐓忘쓕缷\n\uec17潃\uece9꾂\uea07俿\ueb37⽖\uebf9⾄";
      String[] var10000 = new String[4];
      short var20 = 5056;
      int var18 = 0;
      String[] var17 = var10000;

      do {
         char var21 = var15.charAt(var19);
         int var23 = 0;
         char[] var22 = var15.substring(var19 + 1, var19 + 1 + var21).toCharArray();

         do {
            int var24 = var22[var23];

            var24 = (char)(switch (var23 % 6) {
               default -> 28;
               case 1 -> 252;
               case 2 -> 146;
               case 3 -> 47;
               case 4 -> 148;
               case 5 -> 85;
            }) ^ var24;
            if (var23 % 2 == 0) {
               var22[var23] = (char)((var24 >>> 3 | var24 << 13) & 65535 ^ var20);
            } else {
               var22[var23] = (char)((var24 << 3 | var24 >>> 13) & 65535 ^ var20);
            }
         } while (++var23 < var22.length);

         var17[var18] = new String(var22);
         var18++;
         var19 = var19 + var21 + 1;
      } while (var19 < var16);

      abbb = var17;
      baaa = new Object[var17.length];
      byte var30 = 0;
      abba = new int[294];
      int var10001 = 0;
      byte[] var10002 = "+\u0081zqºe!°I\u0097\u007fÄ&5\u0085\u009e\u008c\u0002\u008aB;\u0086³ú«\u0018Lv>\u008eZ\u008e¸ï\u0082d\u0012^ß\u0013è*Þ\u00161ïI?\u007f´ÇcÖz<\u008fz\\#ºô¦;tm\u001e0õ\u008a E\u008f('UØàÊ2C\u00ad!\u0018\u0017Dy\u0097\u0083(MåÀ\u008d \u009bÑ\u0080Q\u0082|\u0089\u008dM`\u000f\u009e\u007f\u009d:[µ>;\rm¶T\u0085EìOÅ©ç6ÛF\u009fò\\½óÛ\rN\u0019@ÆO\u001eG ÿÕ})\u0096\u0011ó\u0003ø¸\u008d\u0096´ói¥ª&\u000e4\u0094E;(;Üe@¾F\u0016!v[¤ìß\u0091Fè\u009bs¼KÞ\u008a\u0081YÍäüTº0\u0010ávÒÝÄ\u0099½\u008e:°ô\u008e\u0004¤²|\b\u0010©E±V \u00adÃõØòx\u009f\u008dAkøR^K~Ã\u001a8t\u0002½N°»õcÿØÄ¾É¿Ô\u0091ÃâµÊq\u008d°uza\u009càÛ\u0094\u0081½÷À¢*ÆÆHñ\u000b=´\b¾ÐÊF,FQfET¿XVgb\u0089<_uÇçÇh\u0092r\u0095¨³ª%f\u009f\u0095\u0092\u00adòó\u0090×Ì(\u0093WÒHÖO_Ä,õ±$\u0018§Dý\u008bòöµX ¶3\u0001µ?B\u00914¤)^·\u0001\r\u008d+=ÑÊB\u0095\u0089\u0089\u00867êB\u0015¯E>=\u000eýô\u0084a¾´\u0018\u0014\u009f!\u0087ààÏ\u0011¬ÚqñY£[tÔfv@¡\u0006jI\u00057Þø SÔÅXÜòQ^c8üÒ´_tê\u00837IÊ\u000b\u0011_á\u0095¨\u0014DÚï\b^]t¦\u001c\u0010\u008aô«?SH%ªF8?\\»H$,F\u0007ç7\u0012[\u00ad¡ \u008f\u009f»VÂYà8\u009dùé§0t0lkeI\u007f\u0005d[!£?_*ELäE\u0098ö\u0087ÈÉ¸ÎW`N\u000f\u007fÕ\u0096\u0014\u0085¾´3Ä\u0083\u0098\u000b\u000fF\u0084H?¦z``lYòEVêú\tI\u0086Î\u0083mxd\u0084ÙÁ\u0006R¢&ÛUÅ\u000fÝ\u0093\u0011ÿÐ(\u000f0Ù²ÔW³WÅlì)A/ òÉ¯lIï\u0017^Ï®® juál<|ÊàÃ\u0012|\u0018mZv¥~ú°ÍÇ4Ç¬A¬u\u0086ó9_9ÓD\u0007ì\u0097ì\u0082ëê¬\u008c%»{[d\u0089\u0082\u0095ãP\u001c\u000f«Aw)\u001aÊ¬«mÆøGh´J\\\u008fj\u00150y\u000e\\\u0013æúO,\u0093\u001b\u0086ÝÎwúÍ\u0088PÎQÙv=¦\b6.\u008aÉ¼WBf\u0093\u00973ò\\Åî\u009bqÁ\u0019Ê\u0098\nÕ¸î¬:\u0089¿ÿM\u000f>Ú\u009bo8\rf\u0004\u0015Èx¾ø3\b#ïÂË\u0007L Í\u0013zEö8@\u0088K®\u0013`ë¹å\u0010 Þ&\u007fÂ¹±ÃCD\u0003¡\f2òCA\u0080t\u0098ª\u0087\u008b\u0094Õ\u0082\\¸\u0000y¦\u0084Ð³¨±H`äE¥\u0095Ï@X\u0081Ò¥\u0093J8\f]N77°èØN«ð@]\u001e+£Ünä\u0083^ºÜ¬@1!¡°DðaSI,Ï\u0093o\u008aXj\u0087úO(¿\u0004\u0086\u008a4åë\u0090ô¿Nå\u008eùo\u0083Gag\u0082ñËú;y¹:Åú>Íæ,½1ÿÒXÖ\u0007u¨&Iª³\u008f\u0087di=ÐO{Ð\u0012èùÿÚ\u0012¡ªùb  \u0011\u008aÎ®\u0092/»\u0002×ç\rÖÎ6©\u0000\u000e\u009aðp\u0087B\u0099d§ËQ\u009f:¶_-fîå¡\u007fF\u0082qÝ0ìûØ¨\u009bMå\u008b\bÅ;Õß\u0082%Ûò\u0012F\t ALPËlÀkø\u0012êÔ\u007f\u001cãÈª_\u001aT¸\u0085ÆU\u0005mû\u001c>þ\u0099l\u009bBª\u0002=\u0086\u0005\u0080íN\u0082>É#ÔS»\u0097\u0088c^\u0012\u008aÖcâÜu\u008ej& Ò\u009a\u0015þ\u008a&VË8\t?u#PhãS| \u009fÝgÖ®RZö[ß\u008e<¤\u000b©i¢\u0086Ì\u0087^g\u001d\"¢\u000e?\u0081ßæ®B½òr®y\u0018Ke^\u0019\r\u009eå\\¥AÆ\u0007\f~\u0007\\¿åç\u008b|\u0016±@à§<QøñÇ¨3\u000e\u0087\tÖì_\u008e\u000f4K?i\b\u0012úÄþáþe¤ü\u001f%bp\u0083%"
         .getBytes("ISO-8859-1");

      int var67;
      do {
         abba[var30] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -798282616;
         var30 += 1;
         var67 = var10001 + 4;
         var10001 += 4;
      } while (var67 < var10002.length);

      String[] var13 = new String[a(-765235785, var25 ^ -1002053715)];
      int var11 = 0;
      String var10;
      int var12 = (var10 = aab((short)4230, '‛', var25 ^ -1780085456)).length();
      int var9 = a(-765235788, var25 ^ 934773204);
      int var27 = -1;

      label114:
      while (true) {
         String var31 = var10.substring(++var27, var27 + var9);
         var10001 = (byte)-1;

         while (true) {
            label109: {
               char[] var37 = var31.toCharArray();
               var67 = var37.length;
               int var14 = 0;
               var54 = var37;
               var10001 = var67;
               char[] var71;
               int var86;
               if (var67 <= 1) {
                  var71 = var37;
                  var86 = var14;
               } else {
                  var54 = var37;
                  var10001 = var67;
                  if (var67 <= var14) {
                     break label109;
                  }

                  var71 = var37;
                  var86 = var14;
               }

               while (true) {
                  var71[var86] = (char)(var71[var86] ^ switch (var14 % a(-765235789, var25 ^ 1168526816)) {
                     case 0 -> a(-765235792, var25 ^ -717705203);
                     case 1 -> a(-765235791, var25 ^ 1085186332);
                     case 2 -> a(-765235778, var25 ^ -959481351);
                     case 3 -> a(-765235777, var25 ^ 1820205925);
                     case 4 -> a(-765235780, var25 ^ -1777720643);
                     case 5 -> a(-765235779, var25 ^ 1339012589);
                     default -> a(-765235782, var25 ^ 26492119);
                  });
                  var14++;
                  if (var10001 == 0) {
                     var86 = var10001;
                     var71 = var54;
                  } else {
                     if (var10001 <= var14) {
                        break;
                     }

                     var71 = var54;
                     var86 = var14;
                  }
               }
            }

            String var78 = new String(var54).intern();
            switch (var10001) {
               case 0:
                  var13[var11++] = var78;
                  if ((var27 += var9) >= var12) {
                     baa = var13;
                     abab = new String[a(-765235790, var25 ^ -232623014)];
                     long var0 = 3607895186116798582L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = aab((short)'錛', '’', var25 ^ 493887535)).length();
                     byte var2 = 0;

                     do {
                        int var44 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var44, var2).getBytes(aab((short)30357, '‘', var25 ^ 2111647477));
                        var44 = var3++;
                        long var87 = (
                              (var7[0] & 255L) << a(-765235781, var25 ^ -1470447540)
                                 | (var7[1] & 255L) << a(-765235784, var25 ^ 75292530)
                                 | (var7[2] & 255L) << a(-765235783, var25 ^ -1970880315)
                                 | (var7[3] & 255L) << a(-765235802, var25 ^ 322882387)
                                 | (var7[4] & 255L) << a(-765235801, var25 ^ -192890576)
                                 | (var7[5] & 255L) << a(-765235804, var25 ^ 1443342700)
                                 | (var7[a(-765235803, var25 ^ -1628779444)] & 255L) << a(-765235806, var25 ^ -754850275)
                                 | var7[a(-765235805, var25 ^ 978938249)] & 255L
                           )
                           ^ var0;
                        byte var79 = -1;
                        var6[var44] = var87;
                     } while (var2 < var5);

                     aaab = var6;
                     abb = new Integer[2];
                     aa = aa(a(-765235808, var25 ^ 1450031819), 4278859648248710614L);
                     return;
                  }

                  var9 = var10.charAt(var27);
                  break;
               default:
                  var13[var11++] = var78;
                  if ((var27 += var9) < var12) {
                     var9 = var10.charAt(var27);
                     continue label114;
                  }

                  var12 = (var10 = aab((short)'菉', '‚', var25 ^ -934540844)).length();
                  var9 = a(-765235787, var25 ^ 1477802467);
                  var27 = -1;
            }

            var31 = var10.substring(++var27, var27 + var9);
            var10001 = (byte)0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = abba[var0 ^ -765235786] ^ var1 ^ var0;
      var2 ^= 64148;
      var2 ^= 35789;
      var2 -= 16560;
      var2 ^= 43072;
      var2 ^= 58818;
      var2 -= 39212;
      var2 ^= 29908;
      return var2 + 63245;
   }

   public static aabbabba ab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 0
      // 16: ifne 29
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 28
      // 1f: goto 23
      // 22: athrow
      // 23: aconst_null
      // 24: goto 2f
      // 27: athrow
      // 28: aload 1
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.aabaabb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba;
      // 2f: areturn
   }

   public aabbabba() {
      int var1 = 2130519566;
      super(
         aabbaaaba.aaab(bb(a(-765235807, var1 ^ 246046743), a(-765235794, var1 ^ 56320387))),
         bbaabbba.bab,
         aabbaaaba.aaab(bb(a(-765235793, var1 ^ 176666044), a(-765235796, var1 ^ 1936418104)))
      );
      this.bba = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(bb(a(-765235795, var1 ^ -1185853706), a(-765235798, var1 ^ -1207498834))), 25.0, 1.0, 90.0, 1.0
            )
            .bba(aabbaaaba.aaab(bb(a(-765235797, var1 ^ -678445769), a(-765235800, var1 ^ -858824533))))
      );
      this.aaba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(bb(a(-765235799, var1 ^ -1244545468), a(-765235818, var1 ^ -1901516621))), false
         )
      );
      this.aabb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(bb(a(-765235817, var1 ^ 1476900330), a(-765235820, var1 ^ 1010000302))),
            baaaba.class,
            baaaba.aa
         )
      );
   }

   public static boolean ba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: ifnull 3a
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 0
      // 16: ifne 28
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.babbaab ()Z
      // 1c: ifeq 3a
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: goto 28
      // 27: athrow
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaa Z
      // 2b: iload 0
      // 2c: ifne 37
      // 2f: ifeq 3a
      // 32: goto 36
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3b
      // 3a: bipush 0
      // 3b: ireturn
   }

   private static String bb(int var0, int var1) {
      int var9 = -1101872537;
      int var2 = (var0 ^ a(-765235819, var9 ^ 75882574)) & a(-765235822, var9 ^ -1049428555);
      if (abab[var2] == null) {
         char[] var3 = baa[var2].toCharArray();

         int var4 = switch (var3[0] & a(-765235821, var9 ^ 1331271197)) {
            case 0 -> a(-765235824, var9 ^ 835508855);
            case 1 -> a(-765235823, var9 ^ -704658412);
            case 2 -> a(-765235810, var9 ^ -1301349778);
            case 3 -> a(-765235809, var9 ^ -2022550838);
            case 4 -> a(-765235812, var9 ^ -652552310);
            case 5 -> a(-765235811, var9 ^ -1434771978);
            case 6 -> a(-765235814, var9 ^ 414627413);
            case 7 -> a(-765235813, var9 ^ -88935124);
            case 8 -> a(-765235816, var9 ^ 1159371);
            case 9 -> a(-765235815, var9 ^ 1023649019);
            case 10 -> 2;
            case 11 -> a(-765235834, var9 ^ 1074713707);
            case 12 -> a(-765235833, var9 ^ -1397024521);
            case 13 -> a(-765235836, var9 ^ 1637806292);
            case 14 -> a(-765235835, var9 ^ 845207937);
            case 15 -> a(-765235838, var9 ^ 845072901);
            case 16 -> a(-765235837, var9 ^ -1068336688);
            case 17 -> a(-765235840, var9 ^ -102023171);
            case 18 -> a(-765235839, var9 ^ 295279497);
            case 19 -> a(-765235826, var9 ^ 1310914059);
            case 20 -> a(-765235825, var9 ^ -47081792);
            case 21 -> a(-765235828, var9 ^ -502198061);
            case 22 -> a(-765235827, var9 ^ -1503519369);
            case 23 -> a(-765235830, var9 ^ 18145006);
            case 24 -> a(-765235829, var9 ^ 1228510772);
            case 25 -> a(-765235832, var9 ^ 2028249153);
            case 26 -> a(-765235831, var9 ^ 1758177850);
            case 27 -> a(-765235722, var9 ^ 160438523);
            case 28 -> a(-765235721, var9 ^ 204411801);
            case 29 -> a(-765235724, var9 ^ 549106408);
            case 30 -> a(-765235723, var9 ^ 1038588296);
            case 31 -> a(-765235726, var9 ^ 510701393);
            case 32 -> a(-765235725, var9 ^ -190095119);
            case 33 -> a(-765235728, var9 ^ 139646759);
            case 34 -> a(-765235727, var9 ^ 1981564397);
            case 35 -> a(-765235714, var9 ^ -314823471);
            case 36 -> a(-765235713, var9 ^ 50478506);
            case 37 -> a(-765235716, var9 ^ -556576065);
            case 38 -> a(-765235715, var9 ^ -912421877);
            case 39 -> a(-765235718, var9 ^ -725082881);
            case 40 -> a(-765235717, var9 ^ 350864493);
            case 41 -> a(-765235720, var9 ^ -624558505);
            case 42 -> a(-765235719, var9 ^ 296262994);
            case 43 -> a(-765235738, var9 ^ 1805010499);
            case 44 -> a(-765235737, var9 ^ -343400119);
            case 45 -> a(-765235740, var9 ^ -217732522);
            case 46 -> a(-765235739, var9 ^ 1240157618);
            case 47 -> a(-765235742, var9 ^ 454988668);
            case 48 -> a(-765235741, var9 ^ 1319951573);
            case 49 -> a(-765235744, var9 ^ -1662231839);
            case 50 -> a(-765235743, var9 ^ 157625496);
            case 51 -> a(-765235730, var9 ^ -1996601456);
            case 52 -> a(-765235729, var9 ^ 190538712);
            case 53 -> a(-765235732, var9 ^ -1754808563);
            case 54 -> a(-765235731, var9 ^ -19929220);
            case 55 -> a(-765235734, var9 ^ 980255533);
            case 56 -> a(-765235733, var9 ^ -1443550258);
            case 57 -> a(-765235736, var9 ^ -2125163268);
            case 58 -> a(-765235735, var9 ^ 943445782);
            case 59 -> a(-765235754, var9 ^ -1538328925);
            case 60 -> a(-765235753, var9 ^ 1002080598);
            case 61 -> a(-765235756, var9 ^ -1376341180);
            case 62 -> a(-765235755, var9 ^ 1292094888);
            case 63 -> a(-765235758, var9 ^ -930213929);
            case 64 -> a(-765235757, var9 ^ -50630687);
            case 65 -> a(-765235760, var9 ^ -178299321);
            case 66 -> a(-765235759, var9 ^ 1148861858);
            case 67 -> a(-765235746, var9 ^ 2030219923);
            case 68 -> a(-765235745, var9 ^ -318502695);
            case 69 -> a(-765235748, var9 ^ 1082710606);
            case 70 -> a(-765235747, var9 ^ -927929746);
            case 71 -> a(-765235750, var9 ^ -175086898);
            case 72 -> a(-765235749, var9 ^ -474219582);
            case 73 -> a(-765235752, var9 ^ -1474383053);
            case 74 -> a(-765235751, var9 ^ -1274793027);
            case 75 -> a(-765235770, var9 ^ 440827538);
            case 76 -> a(-765235769, var9 ^ 1223774500);
            case 77 -> 5;
            case 78 -> a(-765235772, var9 ^ -192953287);
            case 79 -> a(-765235771, var9 ^ -2073742762);
            case 80 -> a(-765235774, var9 ^ -193052006);
            case 81 -> a(-765235773, var9 ^ -1145217483);
            case 82 -> a(-765235776, var9 ^ -403191672);
            case 83 -> a(-765235775, var9 ^ 868603316);
            case 84 -> a(-765235762, var9 ^ 2114161082);
            case 85 -> a(-765235761, var9 ^ 564363415);
            case 86 -> a(-765235764, var9 ^ -1943119401);
            case 87 -> a(-765235763, var9 ^ -683728648);
            case 88 -> a(-765235766, var9 ^ -1187105409);
            case 89 -> a(-765235765, var9 ^ 526726764);
            case 90 -> a(-765235768, var9 ^ -115963209);
            case 91 -> a(-765235767, var9 ^ 615312982);
            case 92 -> a(-765235914, var9 ^ 1977786504);
            case 93 -> a(-765235913, var9 ^ -602642870);
            case 94 -> a(-765235916, var9 ^ 1775009267);
            case 95 -> a(-765235915, var9 ^ 49175179);
            case 96 -> a(-765235918, var9 ^ 1069703728);
            case 97 -> a(-765235917, var9 ^ -86105755);
            case 98 -> a(-765235920, var9 ^ 438308559);
            case 99 -> a(-765235919, var9 ^ -805069597);
            case 100 -> a(-765235906, var9 ^ -357526567);
            case 101 -> a(-765235905, var9 ^ -170090384);
            case 102 -> a(-765235908, var9 ^ -786298257);
            case 103 -> a(-765235907, var9 ^ 1704683726);
            case 104 -> a(-765235910, var9 ^ 511488659);
            case 105 -> a(-765235909, var9 ^ 2035660443);
            case 106 -> a(-765235912, var9 ^ -1381648028);
            case 107 -> a(-765235911, var9 ^ -1284853544);
            case 108 -> a(-765235930, var9 ^ 1745739172);
            case 109 -> a(-765235929, var9 ^ 2033615385);
            case 110 -> a(-765235932, var9 ^ -42612440);
            case 111 -> a(-765235931, var9 ^ 1978991975);
            case 112 -> a(-765235934, var9 ^ 1397567695);
            case 113 -> a(-765235933, var9 ^ 318000723);
            case 114 -> 3;
            case 115 -> a(-765235936, var9 ^ -910490929);
            case 116 -> a(-765235935, var9 ^ -1064268208);
            case 117 -> a(-765235922, var9 ^ -1373212352);
            case 118 -> a(-765235921, var9 ^ -433271750);
            case 119 -> a(-765235924, var9 ^ 1189782678);
            case 120 -> a(-765235923, var9 ^ -2002926912);
            case 121 -> a(-765235926, var9 ^ 271575151);
            case 122 -> a(-765235925, var9 ^ -2063247517);
            case 123 -> a(-765235928, var9 ^ -128089450);
            case 124 -> a(-765235927, var9 ^ 1356366398);
            case 125 -> a(-765235946, var9 ^ 282479497);
            case 126 -> a(-765235945, var9 ^ -956233167);
            case 127 -> a(-765235948, var9 ^ 1053789692);
            case 128 -> a(-765235947, var9 ^ -1604992493);
            case 129 -> a(-765235950, var9 ^ -881626085);
            case 130 -> a(-765235949, var9 ^ 284230463);
            case 131 -> a(-765235952, var9 ^ 1142751662);
            case 132 -> a(-765235951, var9 ^ -167320059);
            case 133 -> a(-765235938, var9 ^ -1452664952);
            case 134 -> a(-765235937, var9 ^ -532051893);
            case 135 -> a(-765235940, var9 ^ -210305638);
            case 136 -> a(-765235939, var9 ^ 981968691);
            case 137 -> a(-765235942, var9 ^ 1184360091);
            case 138 -> a(-765235941, var9 ^ 1913368635);
            case 139 -> a(-765235944, var9 ^ -2114165061);
            case 140 -> a(-765235943, var9 ^ -1831821230);
            case 141 -> a(-765235962, var9 ^ -350746498);
            case 142 -> a(-765235961, var9 ^ 728341423);
            case 143 -> a(-765235964, var9 ^ 2041901609);
            case 144 -> a(-765235963, var9 ^ 2101584903);
            case 145 -> a(-765235966, var9 ^ -1232087498);
            case 146 -> a(-765235965, var9 ^ 274784351);
            case 147 -> a(-765235968, var9 ^ 1125607090);
            case 148 -> a(-765235967, var9 ^ 1723924736);
            case 149 -> a(-765235954, var9 ^ -1321440579);
            case 150 -> a(-765235953, var9 ^ 1948440469);
            case 151 -> a(-765235956, var9 ^ -1890431699);
            case 152 -> a(-765235955, var9 ^ 2123458951);
            case 153 -> a(-765235958, var9 ^ -1667794403);
            case 154 -> a(-765235957, var9 ^ -106146151);
            case 155 -> a(-765235960, var9 ^ 873580526);
            case 156 -> a(-765235959, var9 ^ -592326547);
            case 157 -> a(-765235850, var9 ^ -1401243857);
            case 158 -> a(-765235849, var9 ^ -1013393437);
            case 159 -> a(-765235852, var9 ^ 2132356403);
            case 160 -> a(-765235851, var9 ^ 492198887);
            case 161 -> a(-765235854, var9 ^ -14948032);
            case 162 -> a(-765235853, var9 ^ 619769463);
            case 163 -> a(-765235856, var9 ^ 680520715);
            case 164 -> a(-765235855, var9 ^ 73011330);
            case 165 -> a(-765235842, var9 ^ 948624766);
            case 166 -> a(-765235841, var9 ^ 219285906);
            case 167 -> a(-765235844, var9 ^ -100664112);
            case 168 -> a(-765235843, var9 ^ -66916498);
            case 169 -> a(-765235846, var9 ^ 432612106);
            case 170 -> a(-765235845, var9 ^ -1341710192);
            case 171 -> a(-765235848, var9 ^ -1947565622);
            case 172 -> a(-765235847, var9 ^ -219046254);
            case 173 -> a(-765235866, var9 ^ -515620172);
            case 174 -> a(-765235865, var9 ^ 1614056840);
            case 175 -> a(-765235868, var9 ^ -488589908);
            case 176 -> a(-765235867, var9 ^ -60076067);
            case 177 -> a(-765235870, var9 ^ 203333269);
            case 178 -> a(-765235869, var9 ^ -283949790);
            case 179 -> a(-765235872, var9 ^ 792060766);
            case 180 -> a(-765235871, var9 ^ -690121764);
            case 181 -> a(-765235858, var9 ^ -1796903512);
            case 182 -> a(-765235857, var9 ^ 913214471);
            case 183 -> a(-765235860, var9 ^ 749654333);
            case 184 -> a(-765235859, var9 ^ 1507104566);
            case 185 -> a(-765235862, var9 ^ 1058867295);
            case 186 -> a(-765235861, var9 ^ 1051436326);
            case 187 -> a(-765235864, var9 ^ -2027694094);
            case 188 -> a(-765235863, var9 ^ 2040551389);
            case 189 -> a(-765235882, var9 ^ 1517736998);
            case 190 -> a(-765235881, var9 ^ 1133000216);
            case 191 -> 0;
            case 192 -> a(-765235884, var9 ^ -1154498055);
            case 193 -> a(-765235883, var9 ^ -168763934);
            case 194 -> a(-765235886, var9 ^ 993920955);
            case 195 -> 4;
            case 196 -> a(-765235885, var9 ^ 1813320978);
            case 197 -> a(-765235888, var9 ^ -1364029366);
            case 198 -> a(-765235887, var9 ^ 1716047687);
            case 199 -> a(-765235874, var9 ^ 1161349563);
            case 200 -> 1;
            case 201 -> a(-765235873, var9 ^ -1378836381);
            case 202 -> a(-765235876, var9 ^ 779473583);
            case 203 -> a(-765235875, var9 ^ 1807573794);
            case 204 -> a(-765235878, var9 ^ 1919729872);
            case 205 -> a(-765235877, var9 ^ -1296000567);
            case 206 -> a(-765235880, var9 ^ 991490109);
            case 207 -> a(-765235879, var9 ^ 462502080);
            case 208 -> a(-765235898, var9 ^ -2031339897);
            case 209 -> a(-765235897, var9 ^ -625701740);
            case 210 -> a(-765235900, var9 ^ -1021514830);
            case 211 -> a(-765235899, var9 ^ 1634370905);
            case 212 -> a(-765235902, var9 ^ 1693644234);
            case 213 -> a(-765235901, var9 ^ 1506895440);
            case 214 -> a(-765235904, var9 ^ -2020626072);
            case 215 -> a(-765235903, var9 ^ -1719559254);
            case 216 -> a(-765235890, var9 ^ -95204887);
            case 217 -> a(-765235889, var9 ^ -267738529);
            case 218 -> a(-765235892, var9 ^ 2083624699);
            case 219 -> a(-765235891, var9 ^ 1452152490);
            case 220 -> a(-765235894, var9 ^ 1603454170);
            case 221 -> a(-765235893, var9 ^ -1508977140);
            case 222 -> a(-765235896, var9 ^ 2047831242);
            case 223 -> a(-765235895, var9 ^ 1195792193);
            case 224 -> a(-765236042, var9 ^ 624358626);
            case 225 -> a(-765236041, var9 ^ 374887068);
            case 226 -> a(-765236044, var9 ^ -1176862114);
            case 227 -> a(-765236043, var9 ^ 1046783671);
            case 228 -> a(-765236046, var9 ^ 1745474789);
            case 229 -> a(-765236045, var9 ^ 876163468);
            case 230 -> a(-765236048, var9 ^ 915148006);
            case 231 -> a(-765236047, var9 ^ 1613750528);
            case 232 -> a(-765236034, var9 ^ -1694843491);
            case 233 -> a(-765236033, var9 ^ -1448811799);
            case 234 -> a(-765236036, var9 ^ -359575334);
            case 235 -> a(-765236035, var9 ^ -2094052497);
            case 236 -> a(-765236038, var9 ^ -726057954);
            case 237 -> a(-765236037, var9 ^ 482719135);
            case 238 -> a(-765236040, var9 ^ 1794391539);
            case 239 -> a(-765236039, var9 ^ 1241626564);
            case 240 -> a(-765236058, var9 ^ -2130812157);
            case 241 -> a(-765236057, var9 ^ -705107644);
            case 242 -> a(-765236060, var9 ^ 990121954);
            case 243 -> a(-765236059, var9 ^ -1627887889);
            case 244 -> a(-765236062, var9 ^ 1032162881);
            case 245 -> a(-765236061, var9 ^ -18375358);
            case 246 -> a(-765236064, var9 ^ 304314311);
            case 247 -> a(-765236063, var9 ^ -654018965);
            case 248 -> a(-765236050, var9 ^ 582955813);
            case 249 -> a(-765236049, var9 ^ -40081232);
            case 250 -> a(-765236052, var9 ^ -1034079487);
            case 251 -> a(-765236051, var9 ^ 1505616782);
            case 252 -> a(-765236054, var9 ^ -1427429308);
            case 253 -> a(-765236053, var9 ^ 459684146);
            case 254 -> a(-765236056, var9 ^ 1302185905);
            default -> a(-765236055, var9 ^ -1294113087);
         };
         int var5 = (var1 & a(-765236074, var9 ^ 1342562735)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-765236073, var9 ^ -2012195384)) >>> a(-765236076, var9 ^ -1270312849)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-765236075, var9 ^ 1119588806);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-765236078, var9 ^ 413560961);
            }
         }

         abab[var2] = new String(var3).intern();
      }

      return abab[var2];
   }

   @Override
   public void abaab() {
      this.aaa = false;
      this.abaa = 0.0F;
      this.aba = 0;
   }

   private float aaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 57
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0f: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaba
      // 12: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaba.ordinal ()I
      // 15: tableswitch 32 0 3 43 53 59 65
      // 34: athrow
      // 35: new java/lang/MatchException
      // 38: dup
      // 39: aconst_null
      // 3a: aconst_null
      // 3b: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 3e: athrow
      // 3f: athrow
      // 40: aload 1
      // 41: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 44: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 47: goto 92
      // 4a: ldc_w 90.0
      // 4d: goto 92
      // 50: ldc_w -90.0
      // 53: goto 92
      // 56: aload 0
      // 57: iload 2
      // 58: ifne 8f
      // 5b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aba I
      // 5e: ldc_w -765236077
      // 61: ldc_w 1045124313
      // 64: ldc_w -1580463339
      // 67: ixor
      // 68: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.a (II)I
      // 6b: ldc2_w 8136744467366017908
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aa (IJ)I
      // 71: irem
      // 72: ifne 8e
      // 75: goto 79
      // 78: athrow
      // 79: aload 0
      // 7a: invokestatic java/util/concurrent/ThreadLocalRandom.current ()Ljava/util/concurrent/ThreadLocalRandom;
      // 7d: ldc2_w -90.0
      // 80: ldc2_w 90.0
      // 83: invokevirtual java/util/concurrent/ThreadLocalRandom.nextDouble (DD)D
      // 86: d2f
      // 87: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bb F
      // 8a: goto 8e
      // 8d: athrow
      // 8e: aload 0
      // 8f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bb F
      // 92: freturn
   }

   public void b(class_10042 param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 18
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.babbaab ()Z
      // 0c: ifeq 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaa Z
      // 1b: ifne 20
      // 1e: return
      // 1f: athrow
      // 20: fload 2
      // 21: fconst_0
      // 22: fconst_1
      // 23: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 26: fstore 4
      // 28: aload 1
      // 29: fload 4
      // 2b: aload 0
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaaa F
      // 2f: aload 0
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bbb F
      // 33: invokestatic net/minecraft/class_3532.method_16439 (FFF)F
      // 36: putfield net/minecraft/class_10042.field_53446 F
      // 39: aload 1
      // 3a: fconst_0
      // 3b: putfield net/minecraft/class_10042.field_53447 F
      // 3e: aload 1
      // 3f: fload 4
      // 41: aload 0
      // 42: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ba F
      // 45: aload 0
      // 46: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ab F
      // 49: invokestatic net/minecraft/class_3532.method_16439 (FFF)F
      // 4c: ldc_w -90.0
      // 4f: ldc_w 90.0
      // 52: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 55: putfield net/minecraft/class_10042.field_53448 F
      // 58: return
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
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 1
      // 004: iload 1
      // 005: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 008: astore 2
      // 009: ifne 028
      // 00c: aload 2
      // 00d: ifnull 01f
      // 010: goto 014
      // 013: athrow
      // 014: aload 2
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnonnull 029
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 0
      // 020: bipush 0
      // 021: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaa Z
      // 024: goto 028
      // 027: athrow
      // 028: return
      // 029: aload 0
      // 02a: iload 1
      // 02b: ifne 080
      // 02e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaa Z
      // 031: ifne 06f
      // 034: goto 038
      // 037: athrow
      // 038: aload 0
      // 039: aload 2
      // 03a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03d: invokevirtual net/minecraft/class_746.method_73188 ()F
      // 040: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bbb F
      // 043: aload 0
      // 044: aload 2
      // 045: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 048: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 04b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ab F
      // 04e: aload 0
      // 04f: aload 0
      // 050: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bbb F
      // 053: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaaa F
      // 056: aload 0
      // 057: aload 0
      // 058: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ab F
      // 05b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ba F
      // 05e: aload 0
      // 05f: aload 0
      // 060: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ab F
      // 063: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bb F
      // 066: aload 0
      // 067: bipush 1
      // 068: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaa Z
      // 06b: goto 06f
      // 06e: athrow
      // 06f: aload 0
      // 070: dup
      // 071: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aba I
      // 074: bipush 1
      // 075: iadd
      // 076: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aba I
      // 079: aload 0
      // 07a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 07d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 080: checkcast java/lang/Double
      // 083: invokevirtual java/lang/Double.floatValue ()F
      // 086: fstore 3
      // 087: aload 0
      // 088: dup
      // 089: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.abaa F
      // 08c: fload 3
      // 08d: aload 0
      // 08e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.abaa F
      // 091: fsub
      // 092: ldc 0.15
      // 094: fmul
      // 095: fadd
      // 096: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.abaa F
      // 099: aload 0
      // 09a: aload 0
      // 09b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bbb F
      // 09e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaaa F
      // 0a1: aload 0
      // 0a2: dup
      // 0a3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bbb F
      // 0a6: aload 0
      // 0a7: iload 1
      // 0a8: ifne 0c8
      // 0ab: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0ae: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0b1: checkcast java/lang/Boolean
      // 0b4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b7: ifeq 0c7
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.abaa F
      // 0c2: fneg
      // 0c3: goto 0cb
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.abaa F
      // 0cb: fadd
      // 0cc: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bbb F
      // 0cf: iload 1
      // 0d0: ifne 122
      // 0d3: aload 0
      // 0d4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bbb F
      // 0d7: invokestatic java/lang/Math.abs (F)F
      // 0da: ldc_w 3600.0
      // 0dd: fcmpl
      // 0de: ifle 104
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bbb F
      // 0e9: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 0ec: fstore 4
      // 0ee: aload 0
      // 0ef: dup
      // 0f0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaaa F
      // 0f3: fload 4
      // 0f5: aload 0
      // 0f6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bbb F
      // 0f9: fsub
      // 0fa: fadd
      // 0fb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaaa F
      // 0fe: aload 0
      // 0ff: fload 4
      // 101: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.bbb F
      // 104: aload 0
      // 105: aload 0
      // 106: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ab F
      // 109: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ba F
      // 10c: aload 0
      // 10d: dup
      // 10e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ab F
      // 111: aload 0
      // 112: aload 2
      // 113: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.aaa (Lnet/minecraft/class_310;)F
      // 116: aload 0
      // 117: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ab F
      // 11a: fsub
      // 11b: ldc 0.3
      // 11d: fmul
      // 11e: fadd
      // 11f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabba.ab F
      // 122: return
   }

   @Override
   public String ababa() {
      return ((baaaba)this.aabb.abbb()).toString();
   }
}
