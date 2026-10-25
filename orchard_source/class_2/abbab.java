package nsc;

import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class abbab extends abbaabbaa {
   private static final long[] aa;
   private static final int ab;
   private static final Integer[] ba;
   private static final Object[] abab;
   private final abbaaaaa bb;
   private int aaa;
   private static final int aab;
   private final abbaaaaa aba;
   private final bababa abb;
   private final bababa baa;
   private static final String[] bab;
   private class_1937 bba;
   private static final int[] aabb;
   private final bababa bbb;
   private static final String[] abaa;
   private static final String[] aaaa;
   private final abbaaaaa aaab;
   private final Map aaba;

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
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 2
      // 007: istore 1
      // 008: aload 2
      // 009: iload 1
      // 00a: ifne 015
      // 00d: ifnull 036
      // 010: goto 014
      // 013: athrow
      // 014: aload 2
      // 015: iload 1
      // 016: ifne 028
      // 019: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01c: ifnull 036
      // 01f: goto 023
      // 022: athrow
      // 023: aload 2
      // 024: goto 028
      // 027: athrow
      // 028: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 02b: iload 1
      // 02c: ifne 043
      // 02f: ifnonnull 037
      // 032: goto 036
      // 035: athrow
      // 036: return
      // 037: aload 0
      // 038: iload 1
      // 039: ifne 05b
      // 03c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.bba Lnet/minecraft/class_1937;
      // 03f: goto 043
      // 042: athrow
      // 043: aload 2
      // 044: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 047: if_acmpeq 05a
      // 04a: aload 0
      // 04b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.ab ()V
      // 04e: aload 0
      // 04f: aload 2
      // 050: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 053: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.bba Lnet/minecraft/class_1937;
      // 056: goto 05a
      // 059: athrow
      // 05a: aload 0
      // 05b: aload 2
      // 05c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaa (Lnet/minecraft/class_310;)I
      // 05f: istore 3
      // 060: iload 3
      // 061: bipush 2
      // 062: imul
      // 063: bipush 1
      // 064: iadd
      // 065: istore 4
      // 067: iload 4
      // 069: iload 4
      // 06b: imul
      // 06c: istore 5
      // 06e: aload 2
      // 06f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 072: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 075: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 078: bipush 4
      // 079: ishr
      // 07a: istore 6
      // 07c: aload 2
      // 07d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 080: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 083: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 086: bipush 4
      // 087: ishr
      // 088: istore 7
      // 08a: bipush 4
      // 08b: iload 5
      // 08d: ldc 1002181709
      // 08f: ldc -946264667
      // 091: ldc 658395347
      // 093: ixor
      // 094: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.a (II)I
      // 097: ldc2_w 7709814150210240704
      // 09a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aa (IJ)I
      // 09d: idiv
      // 09e: invokestatic java/lang/Math.max (II)I
      // 0a1: istore 8
      // 0a3: bipush 0
      // 0a4: istore 9
      // 0a6: iload 9
      // 0a8: iload 8
      // 0aa: if_icmpge 168
      // 0ad: aload 0
      // 0ae: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaa I
      // 0b1: iload 1
      // 0b2: ifne 0dc
      // 0b5: iload 5
      // 0b7: if_icmplt 0d0
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: bipush 0
      // 0c0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaa I
      // 0c3: aload 0
      // 0c4: iload 6
      // 0c6: iload 7
      // 0c8: iload 3
      // 0c9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.abb (III)V
      // 0cc: goto 0d0
      // 0cf: athrow
      // 0d0: iload 6
      // 0d2: iload 3
      // 0d3: isub
      // 0d4: aload 0
      // 0d5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaa I
      // 0d8: iload 4
      // 0da: irem
      // 0db: iadd
      // 0dc: istore 10
      // 0de: iload 7
      // 0e0: iload 3
      // 0e1: isub
      // 0e2: aload 0
      // 0e3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaa I
      // 0e6: iload 4
      // 0e8: idiv
      // 0e9: iadd
      // 0ea: istore 11
      // 0ec: aload 0
      // 0ed: dup
      // 0ee: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaa I
      // 0f1: bipush 1
      // 0f2: iadd
      // 0f3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaa I
      // 0f6: iload 10
      // 0f8: iload 11
      // 0fa: invokestatic net/minecraft/class_1923.method_8331 (II)J
      // 0fd: lstore 12
      // 0ff: aload 2
      // 100: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 103: invokevirtual net/minecraft/class_638.method_2935 ()Lnet/minecraft/class_631;
      // 106: iload 10
      // 108: iload 11
      // 10a: invokevirtual net/minecraft/class_631.method_21730 (II)Lnet/minecraft/class_2818;
      // 10d: astore 14
      // 10f: aload 14
      // 111: iload 1
      // 112: ifne 123
      // 115: ifnonnull 121
      // 118: goto 11c
      // 11b: athrow
      // 11c: aconst_null
      // 11d: goto 126
      // 120: athrow
      // 121: aload 14
      // 123: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aab (Lnet/minecraft/class_2818;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaba;
      // 126: astore 15
      // 128: aload 15
      // 12a: iload 1
      // 12b: ifne 160
      // 12e: ifnonnull 14c
      // 131: goto 135
      // 134: athrow
      // 135: aload 0
      // 136: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaba Ljava/util/Map;
      // 139: lload 12
      // 13b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13e: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 143: pop
      // 144: iload 1
      // 145: ifeq 161
      // 148: goto 14c
      // 14b: athrow
      // 14c: aload 0
      // 14d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaba Ljava/util/Map;
      // 150: lload 12
      // 152: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 155: aload 15
      // 157: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 15c: goto 160
      // 15f: athrow
      // 160: pop
      // 161: iinc 9 1
      // 164: iload 1
      // 165: ifeq 0a6
      // 168: return
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1002181708, 1642285116 ^ 803347962);
      if (ba[var3] == null) {
         ba[var3] = (int)(aa[var3] ^ var1);
      }

      return ba[var3];
   }

   private static String b(int var0, int var1, short var2, short var3, char var4, int var5) {
      int var10 = var5 ^ -835996302;
      char[] var9 = abaa[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])abab[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         abab[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 4039;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ '젼' ^ var5 ^ var4 ^ var3 ^ var0 ^ var7 ^ var2 ^ var1);
      }

      return new String(var9).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var25 = 305082236;
      int var18 = 0;
      String[] var17 = new String[6];
      int var16 = "³擹駉捤禍托餔怃玲憃륈捱杻旬馊攈礟懳릨掣勒抁\ud9c0撼\ud99b摀夃攓零愻᥆拡㧗惌禙挐蘿斓禴愓祖曹輪昜㦜恀餑斃\ud9bf斓᥇拉駞悔㦄掸餟抓릯撫丹搁租敤릑所ᤕ撻禧戣奒擉\ud9c6攌馚攈夊挫\ud9b3枛\ud947暡秊挼ᦛ惸礒旻\ud9b2撃\ud940悱駌慄㦇掀뤏撫릤挋奕憁陸本릆摈\ud914愫\u19ac敻㥓早秆拌妐杘㤀怣僚旣饞柱맓擤歷撠餜戓馡拓\ud94e攩맍押馍摰礍搋\ud9b8慣論拁ᧇ撄妊扸外枫禭暣륔擙\ud9c7掼練恀㤇搫ᦻ拳\ud953旉駉掬黎怨礜杓令扣壘攑\ud9cc杄릔摰礄憋鈴撃\u0019꼭ꫠꪈ쪦ꯤ\u0a3a걧쪖꾷ꩯ꣕쫵검檲꯬⨼ꥯ䪂곏쩪긭櫥ꫀꪵꩄ(ᅱ頌ᅌ硂ᎀ\ud8dcᗋ\uf868ၳ\ud89fᕉ\ud819ᚼ顑ᅨ㣂ᘋᡩါ碏Ꭹ\u181c\u17ec㡔ᕀ룗፫롩ᘣ碘႙砃ᜬ顗Ⴘᣝᖫ롵ᄃ墝\nᳲ퐯ᱧᑰἻ듨Ῐ鑍Ὀ钨\u0010껞ۺꫣ蚾ꭷ☷ꦜ\ue68c꿤꙾꼶웠깓蚽꤇ؤ\n眜涀瞉귟瓕േ琶ⷢ璦ⴇ"
         .length();
      short var20 = 4133;
      int var19 = 0;
      String var15 = "³擹駉捤禍托餔怃玲憃륈捱杻旬馊攈礟懳릨掣勒抁\ud9c0撼\ud99b摀夃攓零愻᥆拡㧗惌禙挐蘿斓禴愓祖曹輪昜㦜恀餑斃\ud9bf斓᥇拉駞悔㦄掸餟抓릯撫丹搁租敤릑所ᤕ撻禧戣奒擉\ud9c6攌馚攈夊挫\ud9b3枛\ud947暡秊挼ᦛ惸礒旻\ud9b2撃\ud940悱駌慄㦇掀뤏撫릤挋奕憁陸本릆摈\ud914愫\u19ac敻㥓早秆拌妐杘㤀怣僚旣饞柱맓擤歷撠餜戓馡拓\ud94e攩맍押馍摰礍搋\ud9b8慣論拁ᧇ撄妊扸外枫禭暣륔擙\ud9c7掼練恀㤇搫ᦻ拳\ud953旉駉掬黎怨礜杓令扣壘攑\ud9cc杄릔摰礄憋鈴撃\u0019꼭ꫠꪈ쪦ꯤ\u0a3a걧쪖꾷ꩯ꣕쫵검檲꯬⨼ꥯ䪂곏쩪긭櫥ꫀꪵꩄ(ᅱ頌ᅌ硂ᎀ\ud8dcᗋ\uf868ၳ\ud89fᕉ\ud819ᚼ顑ᅨ㣂ᘋᡩါ碏Ꭹ\u181c\u17ec㡔ᕀ룗፫롩ᘣ碘႙砃ᜬ顗Ⴘᣝᖫ롵ᄃ墝\nᳲ퐯ᱧᑰἻ듨Ῐ鑍Ὀ钨\u0010껞ۺꫣ蚾ꭷ☷ꦜ\ue68c꿤꙾꼶웠깓蚽꤇ؤ\n眜涀瞉귟瓕േ琶ⷢ璦ⴇ";

      do {
         int var23 = 0;
         char var21 = var15.charAt(var19);
         char[] var22 = var15.substring(var19 + 1, var19 + 1 + var21).toCharArray();

         do {
            int var24 = var22[var23];

            var24 = (char)(switch (var23 % 5) {
               default -> 151;
               case 1 -> 93;
               case 2 -> 50;
               case 3 -> 13;
               case 4 -> 214;
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

      abaa = var17;
      abab = new Object[var17.length];
      aabb = new int[320];
      byte var30 = 0;
      int var10001 = 0;
      byte[] var10002 = "zL¼`+\u0015\\Ö\u001eZã\u0006uÄ%\u0097¸[\u0011¨ô6þ\u001a\u0097yÆ\u0005Ò¸\b:`\u0085\u009d{Lö\u00925¿\u0011\f×\u0094Y5VC'rî/=êxC\u001aÿi¢îRGï\u0085\u001dY`¯Lmc%ª×%½«ãÁ¢ð´\u001aG\u001bzÃo¼C\u0016LîÚ¡v\u0015Mhc\u0012\u0080ÓËW·\u001ci5?¹Ô4µE´â\u0014??YÆ±Ï(\u0091aÙ2ÑçGåø3õ;+7\\\u0019´êä\u0085]°<7\u0018a\u000eéÄr!lVê|\u0092çù(\u008fë=ÔÀ¢?b>²ð^zþ\u009e Ö\u0006\tè|\u0092\u0094\u0089Þ\u0084@ÌÃª\u001eô{\u0096å÷\u0083,\u0099Ê\u0012ÄR\u0019\u0082ÿ\u001eaFÂ\u0016éj075ß\u0095nÄ\u008604=\u001e4;ý4\u001b\u00984É\u009f'-\u008c\u0014\u009b¡Ð¶:¿iã\u008a\fné\"A«2\u0088\u000fÔ\u0000Ôu«e©(\u001dÚÇ\u0083\u0000¡¥'8¥ç¦\u009a\u0080{¸zt\u009e4Æ£c\u0080\u008b\u008em¿\u0080\u0089\u0013±\u00909»¦¦&\\®\u0082ùB-àR\u0095¸Ü;¨ µFÎ\u0089PCä&/\u0085ÑO\u0012óA>Ò(\u0006É¼\u0090t\u0091\u0082Ë|u\fZGÓÐ$o{ÏÐã\u009eüç¬.B\u0084b<\u0002cxAÙ\u0012Â^èdÒnaÿÖ*\u001fi_!\\wì+sn\b9¯IQ\u001a\nßB\u000e\u0082Ñ#FHWÄ¢PÎAVv\u0096ý@\u0012YLlGkdè»\\M\bFj\u0092_\u009a½\u0085([$oÑvnê\u007fÈ\u001dZß?Pc=EÍ§t\u000eàß\u008aÉ=\u0094\u0018\u0005&½\u0090*\u008d_HÒ0äï\u0081×\u008f)®\u001e\u008dêÚP\u0082¶\u0013\u0090Ä%#}\u008bÅ¨\u0096»³Û\u0087µ\u0099\u008a\u0012ÿêåÁ\u0003\u0003¶=ÍU)\u0095ûoý\u0082\u0099DfÛ28ü\u008d\u0083Ê÷×¯tì\u0094©\u009b*\u0085ïFÐ\u008c\u0098?UÚ9(9\u0004$pãÀ\u0088|C \u0085`Ö_ \u0086\u000e\u001e\u008b*7È\u001dr7PË\u0092M\u0092ºX\\ÎD\u00adÜ !¬åÓ%hñvßRÌ\u009fþ\u0085Ç\u0096«\u0001Ä\u0001å¾w¨Ñ`æ\r9ã&pèß A\u0005\u001aªº¼Ã\u0017gÓ\u0015\u008eO ¤\u009b\u0000\u0088¾h\u000e~\u0012Ïº½\u008c\u0084N4\rÌÆ\nS¦\u0000M¤\u0002\u0014\u0012_\u001b\u0099E\"å»\u009a\tß÷\u0087\u001eLÜÅ\u0013áÌ3/ï\u0089÷%Ô$\u0005t\u0084\u001a²\u00107ëgüî;\u0087\u00adú®+ \u0098/G¦q»\u008bCò¹\u0083K\u0005à\u0005\u0018\u001fñG3PÙL¿î\u0003Ócp¢>÷¯d\"]ÞeYÓ\u001e\u0094lº\u0098ß'ñð\u0014(ÂÕO\u0087Aò²¸Ù½#²\u0003®FXÎ ÙQ\u008c\u0019M¨ýèUYZT{o&`ädÖù82iÕ\u0095G#Dä\u0012ñ°\u0012+ \u0085\u000efì@?'bÞÓ\u0017íó7</ô\u0095%\"kÆ+®\bNÂ&Ü©WNÎ\u0081ò1¼x+\u008a\u0099â'¢\u0007½Ñ\u00adØ7\u009bgfð¢ó·«ÒúT¯·\u008f\u000fk^\u0011ÄWÄ\u0018I«\u0015I\u0019¬\u0080£®0¦jñN\u008e\u009e!ÎP\u001eØ%ÙÅ\u001f¬%t\u0011ñ\u0092J¸w7ÞµK¸\u0012[Á\u0015ÑØKð\u0094¡©ñ\u0085y§\u0087\u0087üËõÌÎ\u008eQ}Îô3ö0öaÐÁ£\u0001°?fþ-zÍ¨¡\u009b'j\u000e¢»¬ñq\t\u008cñj\u008a=¯Ë\u008f+&lZóôþ¨»\u008c3\f\u008dxÕWÄ\u001d\u0016\b\u0010\u008e\u0017óéu\u0093G¶\u0013ñs,\u0003d¼[ëBXûêÊ\u0098\u0099\u008aû}ê¦$X_z½V5\u0081·\u009c\u000eM\u0094³\u007fO\f\u0090Ð¹Í/ß$µ_ý¥ðñíË\u0080\u0080^iêºG\u0005\u008báý\u0095iZtª\u0089\u0001}ÍeuN\u0010ºöÚM=\u0002}\u0088\u009c6Pù;WÍÚ\u0097\u0092*Ù\u0080\u0092®ø`y!¶\u0088W\u0090\u0003¸\u00145\u0003É\\O³È\u008bF¥AB\u0096©\u001aêo\u008dÈ0¨ù,'\u0090!\u0091 ¸«¢ÒÉMÀ×\u0004Lªþü²\u0004àê\u0007þAPÔççCzÞ\u000f.þ;.\u008e%H\u008f´ÔQy2úê}ò\u00990\u008b(d¡7§àç½òLôËúrÒ\u001bØúL\u009eû©·\u008d(È\u008fæ\u0007u@´J[\u000b4\u0019\u00adLù\u0002b«Fåê\u000fîFõïë\u007f¨âS=Xg®E\u0080Då\u0084Ü0¬"
         .getBytes("ISO-8859-1");

      int var71;
      do {
         aabb[var30] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1588099876;
         var30 += 1;
         var71 = var10001 + 4;
         var10001 += 4;
      } while (var71 < var10002.length);

      String[] var13 = new String[a(1002181971, var25 ^ 832455055)];
      int var11 = 0;
      String var10;
      int var12 = (var10 = b(1849531878, 1731773644, (short)15985, 2584, 25631, -835996302)).length();
      int var9 = a(1002181970, var25 ^ -510518752);
      int var28 = -1;

      label122:
      while (true) {
         String var31 = var10.substring(++var28, var28 + var9);
         var10001 = (byte)-1;

         while (true) {
            label117: {
               char[] var38 = var31.toCharArray();
               var71 = var38.length;
               int var14 = 0;
               var56 = var38;
               var10001 = var71;
               char[] var75;
               int var91;
               if (var71 <= 1) {
                  var75 = var38;
                  var91 = var14;
               } else {
                  var56 = var38;
                  var10001 = var71;
                  if (var71 <= var14) {
                     break label117;
                  }

                  var75 = var38;
                  var91 = var14;
               }

               while (true) {
                  var75[var91] = (char)(var75[var91] ^ switch (var14 % a(1002181999, var25 ^ -417689262)) {
                     case 0 -> a(1002181998, var25 ^ -812604977);
                     case 1 -> a(1002181993, var25 ^ -1099512895);
                     case 2 -> a(1002181992, var25 ^ 1937222049);
                     case 3 -> a(1002181995, var25 ^ -1953953957);
                     case 4 -> a(1002181994, var25 ^ -1656947253);
                     case 5 -> a(1002181989, var25 ^ 670032980);
                     default -> a(1002181988, var25 ^ 876731819);
                  });
                  var14++;
                  if (var10001 == 0) {
                     var91 = var10001;
                     var75 = var56;
                  } else {
                     if (var10001 <= var14) {
                        break;
                     }

                     var75 = var56;
                     var91 = var14;
                  }
               }
            }

            String var82 = new String(var56).intern();
            switch (var10001) {
               case 0:
                  var13[var11++] = var82;
                  if ((var28 += var9) >= var12) {
                     aaaa = var13;
                     bab = new String[a(1002181996, var25 ^ -540922667)];
                     long var0 = 2759436677861954484L;
                     long[] var6 = new long[a(1002181991, var25 ^ 1506098132)];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = b(-624600410, -374708700, 12428, 2419, 644, -835996304)).length();
                     byte var2 = 0;

                     label96:
                     while (true) {
                        int var45 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var45, var2).getBytes(b(-2006060883, 297115068, (short)-4443, (short)-20298, 21815, -835996303));
                        long[] var33 = var6;
                        var45 = var3++;
                        long var62 = (var7[0] & 255L) << a(1002181990, var25 ^ -115455035)
                           | (var7[1] & 255L) << a(1002181985, var25 ^ -1007726036)
                           | (var7[2] & 255L) << a(1002181984, var25 ^ 1170336033)
                           | (var7[3] & 255L) << a(1002181987, var25 ^ -2052968340)
                           | (var7[4] & 255L) << a(1002181986, var25 ^ 1600102873)
                           | (var7[5] & 255L) << a(1002182013, var25 ^ -790894764)
                           | (var7[a(1002182012, var25 ^ -2055736299)] & 255L) << a(1002182015, var25 ^ -1924541704)
                           | var7[a(1002182014, var25 ^ -1346286467)] & 255L;
                        byte var83 = -1;

                        while (true) {
                           long var93 = var62 ^ var0;
                           switch (var83) {
                              case 0:
                                 var33[var45] = var93;
                                 if (var2 >= var5) {
                                    aa = var6;
                                    ba = new Integer[a(1002182000, var25 ^ 1248028483)];
                                    aab = aa(a(1002182003, var25 ^ 851116255), 9119674414024466525L);
                                    ab = aa(a(1002182002, var25 ^ 202952984), 4996438420333034210L);
                                    return;
                                 }
                                 break;
                              default:
                                 var33[var45] = var93;
                                 if (var2 < var5) {
                                    continue label96;
                                 }

                                 var5 = (var4 = b(1427601700, -2071831239, 32177, (short)-21462, 'ך', -835996298)).length();
                                 var2 = 0;
                           }

                           byte var47 = var2;
                           var2 += 8;
                           var7 = var4.substring(var47, var2).getBytes(b(2044232901, 1244627616, (short)-21161, 26696, 26676, -835996297));
                           var33 = var6;
                           var45 = var3++;
                           var62 = (var7[0] & 255L) << a(1002182009, var25 ^ -1936542504)
                              | (var7[1] & 255L) << a(1002182008, var25 ^ 1609796778)
                              | (var7[2] & 255L) << a(1002182011, var25 ^ 1884177395)
                              | (var7[3] & 255L) << a(1002182010, var25 ^ 1029704650)
                              | (var7[4] & 255L) << a(1002182005, var25 ^ 1855343616)
                              | (var7[5] & 255L) << a(1002182004, var25 ^ 1968810918)
                              | (var7[a(1002182007, var25 ^ -1831792837)] & 255L) << a(1002182006, var25 ^ 835645185)
                              | var7[a(1002182001, var25 ^ 143909567)] & 255L;
                           var83 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var28);
                  break;
               default:
                  var13[var11++] = var82;
                  if ((var28 += var9) < var12) {
                     var9 = var10.charAt(var28);
                     continue label122;
                  }

                  var12 = (var10 = b(-1962226458, -1384543527, (short)-26447, (short)-17039, (char)'\uf397', -835996301)).length();
                  var9 = a(1002181997, var25 ^ 414632133);
                  var28 = -1;
            }

            var31 = var10.substring(++var28, var28 + var9);
            var10001 = (byte)0;
         }
      }
   }

   private void ab() {
      this.aaba.clear();
      this.bba = null;
      this.aaa = 0;
   }

   private static boolean ba(class_2680 var0) {
      return var0.method_27852(class_2246.field_27161);
   }

   private static boolean bb(int param0, int param1, int param2, Long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: invokevirtual java/lang/Long.longValue ()J
      // 04: invokestatic net/minecraft/class_1923.method_8325 (J)I
      // 07: istore 5
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 0c: aload 3
      // 0d: invokevirtual java/lang/Long.longValue ()J
      // 10: invokestatic net/minecraft/class_1923.method_8332 (J)I
      // 13: istore 6
      // 15: istore 4
      // 17: iload 5
      // 19: iload 0
      // 1a: isub
      // 1b: iload 4
      // 1d: ifne 48
      // 20: invokestatic java/lang/Math.abs (I)I
      // 23: iload 1
      // 24: if_icmpgt 43
      // 27: goto 2b
      // 2a: athrow
      // 2b: iload 6
      // 2d: iload 4
      // 2f: ifne 48
      // 32: goto 36
      // 35: athrow
      // 36: iload 2
      // 37: isub
      // 38: invokestatic java/lang/Math.abs (I)I
      // 3b: iload 1
      // 3c: if_icmple 4b
      // 3f: goto 43
      // 42: athrow
      // 43: bipush 1
      // 44: goto 48
      // 47: athrow
      // 48: goto 4c
      // 4b: bipush 0
      // 4c: ireturn
   }

   public abbab() {
      int var1 = -955226198;
      super(
         aabbaaaba.aaab(aba(a(1002181711, var1 ^ 1134631265), a(1002181710, var1 ^ 675224303))),
         bbaabbba.bab,
         aabbaaaba.aaab(aba(a(1002181705, var1 ^ -442438706), a(1002181704, var1 ^ -1446162992)))
      );
      this.bbb = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aba(a(1002181707, var1 ^ -897434600), a(1002181706, var1 ^ 1891370653))), 8.0, 2.0, 32.0, 1.0
            )
            .bba(aabbaaaba.aaab(aba(a(1002181701, var1 ^ 1031694096), a(1002181700, var1 ^ 286106370))))
      );
      this.abb = (bababa)this.abbbaaa(
         new bababa(
            aabbaaaba.aaab(aba(a(1002181703, var1 ^ -487917901), a(1002181702, var1 ^ 912085925))), 1.0, 1.0, 32.0, 1.0
         )
      );
      this.aba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aba(a(1002181697, var1 ^ 517769350), a(1002181696, var1 ^ -1925595583))), true
         )
      );
      this.aaab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aba(a(1002181699, var1 ^ 518063487), a(1002181698, var1 ^ -15360222))), true
         )
      );
      this.baa = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aba(a(1002181725, var1 ^ -1300306136), a(1002181724, var1 ^ 1028933801))), 22.0, 0.0, 100.0, 1.0
            )
            .bba(aabbaaaba.aaab(aba(a(1002181727, var1 ^ 1054757026), a(1002181726, var1 ^ -2017853603))))
      );
      this.bb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aba(a(1002181721, var1 ^ -1671886144), a(1002181720, var1 ^ -1203546724))), false
         )
      );
      this.aaba = new HashMap();
   }

   @Override
   public void aabaa() {
      this.ab();
   }

   private static int a(int var0, int var1) {
      int var2 = aabb[var0 ^ 1002181709] ^ var1 ^ var0;
      var2 ^= 2053;
      var2 ^= 23525;
      var2 -= 42660;
      var2 ^= 37601;
      var2 ^= 21579;
      var2 ^= 7159;
      return var2 + 26019;
   }

   @Override
   public void baa(aabbbbaaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 026
      // 009: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.babbaab ()Z
      // 00c: ifeq 06e
      // 00f: goto 013
      // 012: athrow
      // 013: aload 0
      // 014: iload 2
      // 015: ifne 050
      // 018: goto 01c
      // 01b: athrow
      // 01c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 01f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 022: goto 026
      // 025: athrow
      // 026: checkcast java/lang/Boolean
      // 029: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 02c: ifne 04b
      // 02f: aload 0
      // 030: iload 2
      // 031: ifne 050
      // 034: goto 038
      // 037: athrow
      // 038: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 03b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 03e: checkcast java/lang/Boolean
      // 041: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 044: ifeq 06e
      // 047: goto 04b
      // 04a: athrow
      // 04b: aload 0
      // 04c: goto 050
      // 04f: athrow
      // 050: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaba Ljava/util/Map;
      // 053: invokeinterface java/util/Map.isEmpty ()Z 1
      // 058: iload 2
      // 059: ifne 06b
      // 05c: ifne 06e
      // 05f: goto 063
      // 062: athrow
      // 063: aload 1
      // 064: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 067: goto 06b
      // 06a: athrow
      // 06b: ifne 06f
      // 06e: return
      // 06f: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 072: astore 3
      // 073: aload 3
      // 074: iload 2
      // 075: ifne 087
      // 078: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 07b: ifnull 0ac
      // 07e: goto 082
      // 081: athrow
      // 082: aload 3
      // 083: goto 087
      // 086: athrow
      // 087: iload 2
      // 088: ifne 09a
      // 08b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08e: ifnull 0ac
      // 091: goto 095
      // 094: athrow
      // 095: aload 3
      // 096: goto 09a
      // 099: athrow
      // 09a: iload 2
      // 09b: ifne 0b5
      // 09e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0a1: aload 0
      // 0a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.bba Lnet/minecraft/class_1937;
      // 0a5: if_acmpeq 0ae
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: return
      // 0ad: athrow
      // 0ae: aload 0
      // 0af: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 0b2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0b5: checkcast java/lang/Double
      // 0b8: invokevirtual java/lang/Double.doubleValue ()D
      // 0bb: invokestatic java/lang/Math.round (D)J
      // 0be: l2i
      // 0bf: istore 4
      // 0c1: aload 0
      // 0c2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 0c5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0c8: checkcast java/lang/Double
      // 0cb: invokevirtual java/lang/Double.doubleValue ()D
      // 0ce: ldc2_w 100.0
      // 0d1: ddiv
      // 0d2: ldc2_w 255.0
      // 0d5: dmul
      // 0d6: dstore 5
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaa.baab ()Ljava/awt/Color;
      // 0db: astore 7
      // 0dd: aload 3
      // 0de: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0e1: invokevirtual net/minecraft/class_638.method_31607 ()I
      // 0e4: i2d
      // 0e5: dstore 8
      // 0e7: aload 3
      // 0e8: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0eb: invokevirtual net/minecraft/class_638.method_31600 ()I
      // 0ee: i2d
      // 0ef: dconst_1
      // 0f0: dadd
      // 0f1: dstore 10
      // 0f3: aload 0
      // 0f4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaba Ljava/util/Map;
      // 0f7: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 0fc: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 101: astore 12
      // 103: aload 12
      // 105: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 10a: ifeq 23b
      // 10d: aload 12
      // 10f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 114: checkcast java/util/Map$Entry
      // 117: astore 13
      // 119: aload 13
      // 11b: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 120: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaba
      // 123: astore 14
      // 125: aload 14
      // 127: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaba.a ()I
      // 12a: iload 2
      // 12b: ifne 151
      // 12e: iload 4
      // 130: if_icmpge 13f
      // 133: goto 137
      // 136: athrow
      // 137: iload 2
      // 138: ifeq 103
      // 13b: goto 13f
      // 13e: athrow
      // 13f: aload 13
      // 141: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 146: checkcast java/lang/Long
      // 149: invokevirtual java/lang/Long.longValue ()J
      // 14c: invokestatic net/minecraft/class_1923.method_8325 (J)I
      // 14f: bipush 4
      // 150: ishl
      // 151: i2d
      // 152: dstore 15
      // 154: aload 13
      // 156: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 15b: checkcast java/lang/Long
      // 15e: invokevirtual java/lang/Long.longValue ()J
      // 161: invokestatic net/minecraft/class_1923.method_8332 (J)I
      // 164: bipush 4
      // 165: ishl
      // 166: i2d
      // 167: dstore 17
      // 169: aload 0
      // 16a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 16d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 170: checkcast java/lang/Boolean
      // 173: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 176: iload 2
      // 177: ifne 18c
      // 17a: ifeq 187
      // 17d: goto 181
      // 180: athrow
      // 181: dload 8
      // 183: goto 18f
      // 186: athrow
      // 187: aload 14
      // 189: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaba.b ()I
      // 18c: i2d
      // 18d: dconst_1
      // 18e: dsub
      // 18f: dstore 19
      // 191: aload 0
      // 192: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 195: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 198: checkcast java/lang/Boolean
      // 19b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19e: iload 2
      // 19f: ifne 1b4
      // 1a2: ifeq 1af
      // 1a5: goto 1a9
      // 1a8: athrow
      // 1a9: dload 10
      // 1ab: goto 1b9
      // 1ae: athrow
      // 1af: aload 14
      // 1b1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaba.aa ()I
      // 1b4: i2d
      // 1b5: ldc2_w 2.0
      // 1b8: dadd
      // 1b9: dstore 21
      // 1bb: new net/minecraft/class_238
      // 1be: dup
      // 1bf: dload 15
      // 1c1: dload 19
      // 1c3: dload 17
      // 1c5: dload 15
      // 1c7: ldc2_w 16.0
      // 1ca: dadd
      // 1cb: dload 21
      // 1cd: dload 17
      // 1cf: ldc2_w 16.0
      // 1d2: dadd
      // 1d3: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
      // 1d6: astore 23
      // 1d8: aload 1
      // 1d9: iload 2
      // 1da: ifne 1f8
      // 1dd: aload 23
      // 1df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaa (Ljava/lang/Object;Lnet/minecraft/class_238;)Z
      // 1e2: ifne 1f1
      // 1e5: goto 1e9
      // 1e8: athrow
      // 1e9: iload 2
      // 1ea: ifeq 103
      // 1ed: goto 1f1
      // 1f0: athrow
      // 1f1: aload 0
      // 1f2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 1f5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 1f8: checkcast java/lang/Boolean
      // 1fb: iload 2
      // 1fc: ifne 221
      // 1ff: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 202: ifeq 217
      // 205: goto 209
      // 208: athrow
      // 209: aload 1
      // 20a: aload 23
      // 20c: aload 7
      // 20e: dload 5
      // 210: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaab (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;D)V
      // 213: goto 217
      // 216: athrow
      // 217: aload 0
      // 218: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 21b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 21e: checkcast java/lang/Boolean
      // 221: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 224: ifeq 237
      // 227: aload 1
      // 228: aload 23
      // 22a: aload 7
      // 22c: ldc2_w 255.0
      // 22f: fconst_2
      // 230: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbaaa (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;DF)V
      // 233: goto 237
      // 236: athrow
      // 237: iload 2
      // 238: ifeq 103
      // 23b: return
   }

   private int aaa(class_310 var1) {
      int var2 = (Integer)var1.field_1690.method_42503().method_41753();
      return Math.max(1, Math.min(var2, (int)Math.round((Double)this.bbb.abbb())));
   }

   private static aaaabaaba aab(class_2818 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 635088865
      // 003: istore 13
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: aload 0
      // 009: invokevirtual net/minecraft/class_2818.method_12006 ()[Lnet/minecraft/class_2826;
      // 00c: astore 2
      // 00d: aload 0
      // 00e: invokevirtual net/minecraft/class_2818.method_31607 ()I
      // 011: istore 3
      // 012: bipush 0
      // 013: istore 4
      // 015: istore 1
      // 016: ldc_w 1002181723
      // 019: iload 13
      // 01b: ldc_w -2086568536
      // 01e: ixor
      // 01f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.a (II)I
      // 022: ldc2_w 4691663121564149168
      // 025: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aa (IJ)I
      // 028: istore 5
      // 02a: ldc_w 1002181722
      // 02d: iload 13
      // 02f: ldc_w -1451386392
      // 032: ixor
      // 033: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.a (II)I
      // 036: ldc2_w 2006003406093937003
      // 039: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aa (IJ)I
      // 03c: istore 6
      // 03e: bipush 0
      // 03f: istore 7
      // 041: iload 7
      // 043: aload 2
      // 044: arraylength
      // 045: if_icmpge 15b
      // 048: aload 2
      // 049: iload 7
      // 04b: aaload
      // 04c: astore 8
      // 04e: iload 1
      // 04f: ifne 165
      // 052: iload 1
      // 053: ifne 157
      // 056: goto 05a
      // 059: athrow
      // 05a: aload 8
      // 05c: goto 060
      // 05f: athrow
      // 060: ifnull 154
      // 063: aload 8
      // 065: iload 1
      // 066: ifne 079
      // 069: invokevirtual net/minecraft/class_2826.method_38292 ()Z
      // 06c: ifne 154
      // 06f: goto 073
      // 072: athrow
      // 073: aload 8
      // 075: goto 079
      // 078: athrow
      // 079: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.ba (Lnet/minecraft/class_2680;)Z, (Lnet/minecraft/class_2680;)Z ]
      // 07e: invokevirtual net/minecraft/class_2826.method_19523 (Ljava/util/function/Predicate;)Z
      // 081: iload 1
      // 082: ifne 0af
      // 085: ifne 094
      // 088: goto 08c
      // 08b: athrow
      // 08c: iload 1
      // 08d: ifeq 154
      // 090: goto 094
      // 093: athrow
      // 094: iload 3
      // 095: iload 7
      // 097: ldc_w 1002181717
      // 09a: iload 13
      // 09c: ldc_w 507994081
      // 09f: ixor
      // 0a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.a (II)I
      // 0a3: ldc2_w 6650608874989120517
      // 0a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aa (IJ)I
      // 0a9: imul
      // 0aa: iadd
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: istore 9
      // 0b1: bipush 0
      // 0b2: istore 10
      // 0b4: iload 10
      // 0b6: ldc_w 1002181716
      // 0b9: iload 13
      // 0bb: ldc_w 682474970
      // 0be: ixor
      // 0bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.a (II)I
      // 0c2: ldc2_w 5895684060986655383
      // 0c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aa (IJ)I
      // 0c8: if_icmpge 154
      // 0cb: iload 1
      // 0cc: ifne 157
      // 0cf: bipush 0
      // 0d0: istore 11
      // 0d2: iload 11
      // 0d4: ldc_w 1002181719
      // 0d7: iload 13
      // 0d9: ldc_w -1828325138
      // 0dc: ixor
      // 0dd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.a (II)I
      // 0e0: ldc2_w 5895684060986655383
      // 0e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aa (IJ)I
      // 0e6: if_icmpge 14d
      // 0e9: iload 1
      // 0ea: ifne 150
      // 0ed: bipush 0
      // 0ee: istore 12
      // 0f0: iload 12
      // 0f2: ldc_w 1002181718
      // 0f5: iload 13
      // 0f7: ldc_w 1554487911
      // 0fa: ixor
      // 0fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.a (II)I
      // 0fe: ldc2_w 5895684060986655383
      // 101: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.aa (IJ)I
      // 104: if_icmpge 146
      // 107: aload 8
      // 109: iload 1
      // 10a: ifne 060
      // 10d: iload 12
      // 10f: iload 10
      // 111: iload 11
      // 113: invokevirtual net/minecraft/class_2826.method_12254 (III)Lnet/minecraft/class_2680;
      // 116: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbab.ba (Lnet/minecraft/class_2680;)Z
      // 119: iload 1
      // 11a: ifne 13d
      // 11d: ifeq 13f
      // 120: goto 124
      // 123: athrow
      // 124: iinc 4 1
      // 127: iload 5
      // 129: iload 9
      // 12b: iload 10
      // 12d: iadd
      // 12e: invokestatic java/lang/Math.min (II)I
      // 131: istore 5
      // 133: iload 6
      // 135: iload 9
      // 137: iload 10
      // 139: iadd
      // 13a: invokestatic java/lang/Math.max (II)I
      // 13d: istore 6
      // 13f: iinc 12 1
      // 142: iload 1
      // 143: ifeq 0f0
      // 146: iinc 11 1
      // 149: iload 1
      // 14a: ifeq 0d2
      // 14d: iinc 10 1
      // 150: iload 1
      // 151: ifeq 0b4
      // 154: iinc 7 1
      // 157: iload 1
      // 158: ifeq 041
      // 15b: iload 4
      // 15d: ifne 165
      // 160: aconst_null
      // 161: goto 172
      // 164: athrow
      // 165: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaba
      // 168: dup
      // 169: iload 4
      // 16b: iload 5
      // 16d: iload 6
      // 16f: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaba.<init> (III)V
      // 172: areturn
   }

   @Override
   public void abaab() {
      this.ab();
   }

   private static String aba(int var0, int var1) {
      int var9 = 1206502613;
      int var2 = (var0 ^ a(1002181713, var9 ^ 1691774389)) & a(1002181712, var9 ^ -1732900856);
      if (bab[var2] == null) {
         char[] var3 = aaaa[var2].toCharArray();

         int var4 = switch (var3[0] & a(1002181715, var9 ^ 499299033)) {
            case 0 -> a(1002181714, var9 ^ -1825390259);
            case 1 -> a(1002181741, var9 ^ 1126488199);
            case 2 -> a(1002181740, var9 ^ -977662030);
            case 3 -> a(1002181743, var9 ^ 285790646);
            case 4 -> a(1002181742, var9 ^ 362935058);
            case 5 -> a(1002181737, var9 ^ -937857497);
            case 6 -> a(1002181736, var9 ^ -1832788954);
            case 7 -> a(1002181739, var9 ^ 1139999478);
            case 8 -> a(1002181738, var9 ^ 1356629377);
            case 9 -> a(1002181733, var9 ^ -931039060);
            case 10 -> a(1002181732, var9 ^ -606771846);
            case 11 -> a(1002181735, var9 ^ 522791630);
            case 12 -> a(1002181734, var9 ^ 497014227);
            case 13 -> a(1002181729, var9 ^ -761031915);
            case 14 -> a(1002181728, var9 ^ -1126351098);
            case 15 -> a(1002181731, var9 ^ 722835141);
            case 16 -> a(1002181730, var9 ^ -1233898080);
            case 17 -> a(1002181757, var9 ^ 1647388822);
            case 18 -> a(1002181756, var9 ^ 1007259823);
            case 19 -> a(1002181759, var9 ^ -955619314);
            case 20 -> a(1002181758, var9 ^ -1153959512);
            case 21 -> a(1002181753, var9 ^ 1894017200);
            case 22 -> a(1002181752, var9 ^ 1016901499);
            case 23 -> a(1002181755, var9 ^ 873759547);
            case 24 -> a(1002181754, var9 ^ 365442323);
            case 25 -> a(1002181749, var9 ^ 1278831890);
            case 26 -> a(1002181748, var9 ^ 381744311);
            case 27 -> a(1002181751, var9 ^ 419486978);
            case 28 -> a(1002181750, var9 ^ -1161224128);
            case 29 -> a(1002181745, var9 ^ 97543425);
            case 30 -> a(1002181744, var9 ^ -1185137949);
            case 31 -> a(1002181747, var9 ^ 407011981);
            case 32 -> a(1002181746, var9 ^ -1460566652);
            case 33 -> a(1002181645, var9 ^ 12337795);
            case 34 -> a(1002181644, var9 ^ -1426965179);
            case 35 -> a(1002181647, var9 ^ -158842164);
            case 36 -> a(1002181646, var9 ^ -1948912523);
            case 37 -> a(1002181641, var9 ^ -444667452);
            case 38 -> a(1002181640, var9 ^ -2015702777);
            case 39 -> a(1002181643, var9 ^ -983863198);
            case 40 -> a(1002181642, var9 ^ 1497732070);
            case 41 -> a(1002181637, var9 ^ -1127665818);
            case 42 -> a(1002181636, var9 ^ 1098736037);
            case 43 -> a(1002181639, var9 ^ 1329752571);
            case 44 -> a(1002181638, var9 ^ 827095372);
            case 45 -> a(1002181633, var9 ^ -1722069794);
            case 46 -> a(1002181632, var9 ^ 2119395813);
            case 47 -> a(1002181635, var9 ^ 1624247160);
            case 48 -> a(1002181634, var9 ^ -1220201073);
            case 49 -> a(1002181661, var9 ^ -1973592156);
            case 50 -> a(1002181660, var9 ^ -327894632);
            case 51 -> a(1002181663, var9 ^ -958675387);
            case 52 -> 2;
            case 53 -> a(1002181662, var9 ^ -206374432);
            case 54 -> a(1002181657, var9 ^ 1673739091);
            case 55 -> a(1002181656, var9 ^ 607409654);
            case 56 -> a(1002181659, var9 ^ 1449945972);
            case 57 -> a(1002181658, var9 ^ 1586029834);
            case 58 -> a(1002181653, var9 ^ 1697528193);
            case 59 -> a(1002181652, var9 ^ 1300636824);
            case 60 -> a(1002181655, var9 ^ -1050470496);
            case 61 -> a(1002181654, var9 ^ -1898730740);
            case 62 -> a(1002181649, var9 ^ 1086449973);
            case 63 -> a(1002181648, var9 ^ 1522283030);
            case 64 -> a(1002181651, var9 ^ -526187660);
            case 65 -> a(1002181650, var9 ^ -258766713);
            case 66 -> a(1002181677, var9 ^ -187173814);
            case 67 -> a(1002181676, var9 ^ 2111616408);
            case 68 -> a(1002181679, var9 ^ -824796540);
            case 69 -> a(1002181678, var9 ^ 717505860);
            case 70 -> a(1002181673, var9 ^ 1944576495);
            case 71 -> a(1002181672, var9 ^ 1626565417);
            case 72 -> a(1002181675, var9 ^ 29073862);
            case 73 -> a(1002181674, var9 ^ -429934055);
            case 74 -> a(1002181669, var9 ^ 1672191384);
            case 75 -> a(1002181668, var9 ^ -541197366);
            case 76 -> a(1002181671, var9 ^ 1855040943);
            case 77 -> a(1002181670, var9 ^ 1175802541);
            case 78 -> a(1002181665, var9 ^ 1878372153);
            case 79 -> a(1002181664, var9 ^ -1331530950);
            case 80 -> a(1002181667, var9 ^ -1479167293);
            case 81 -> a(1002181666, var9 ^ 1294769959);
            case 82 -> a(1002181693, var9 ^ -930995490);
            case 83 -> a(1002181692, var9 ^ 2015548764);
            case 84 -> a(1002181695, var9 ^ 1103146722);
            case 85 -> a(1002181694, var9 ^ -2054560292);
            case 86 -> a(1002181689, var9 ^ -42523699);
            case 87 -> a(1002181688, var9 ^ -1226445616);
            case 88 -> a(1002181691, var9 ^ -1620196942);
            case 89 -> a(1002181690, var9 ^ 2109028692);
            case 90 -> a(1002181685, var9 ^ -971872190);
            case 91 -> a(1002181684, var9 ^ -1378597869);
            case 92 -> a(1002181687, var9 ^ -1357434108);
            case 93 -> a(1002181686, var9 ^ -1605633638);
            case 94 -> a(1002181681, var9 ^ -421999914);
            case 95 -> a(1002181680, var9 ^ -1455931117);
            case 96 -> a(1002181683, var9 ^ -1722928609);
            case 97 -> a(1002181682, var9 ^ -1755028560);
            case 98 -> a(1002181837, var9 ^ -585691194);
            case 99 -> a(1002181836, var9 ^ 570318688);
            case 100 -> a(1002181839, var9 ^ -274153261);
            case 101 -> a(1002181838, var9 ^ -644737183);
            case 102 -> a(1002181833, var9 ^ -1145467655);
            case 103 -> a(1002181832, var9 ^ 281351618);
            case 104 -> a(1002181835, var9 ^ -1590223154);
            case 105 -> a(1002181834, var9 ^ -1920399541);
            case 106 -> a(1002181829, var9 ^ -1956200116);
            case 107 -> 0;
            case 108 -> a(1002181828, var9 ^ -843367757);
            case 109 -> a(1002181831, var9 ^ -1161642401);
            case 110 -> a(1002181830, var9 ^ 466997273);
            case 111 -> a(1002181825, var9 ^ 109906221);
            case 112 -> a(1002181824, var9 ^ -1434343350);
            case 113 -> a(1002181827, var9 ^ -1482866713);
            case 114 -> a(1002181826, var9 ^ -2105809151);
            case 115 -> a(1002181853, var9 ^ -1445470528);
            case 116 -> a(1002181852, var9 ^ 1066393139);
            case 117 -> a(1002181855, var9 ^ -378559430);
            case 118 -> a(1002181854, var9 ^ -1733970191);
            case 119 -> a(1002181849, var9 ^ 1716533162);
            case 120 -> a(1002181848, var9 ^ 55643314);
            case 121 -> a(1002181851, var9 ^ 127211541);
            case 122 -> 3;
            case 123 -> a(1002181850, var9 ^ -38853226);
            case 124 -> a(1002181845, var9 ^ -596103521);
            case 125 -> a(1002181844, var9 ^ -1979961609);
            case 126 -> a(1002181847, var9 ^ -951869715);
            case 127 -> a(1002181846, var9 ^ -207810652);
            case 128 -> a(1002181841, var9 ^ 455003211);
            case 129 -> a(1002181840, var9 ^ -903722680);
            case 130 -> a(1002181843, var9 ^ 669467007);
            case 131 -> a(1002181842, var9 ^ -1640038805);
            case 132 -> a(1002181869, var9 ^ -236427471);
            case 133 -> a(1002181868, var9 ^ 39416441);
            case 134 -> a(1002181871, var9 ^ -1438416370);
            case 135 -> a(1002181870, var9 ^ 1559176212);
            case 136 -> a(1002181865, var9 ^ -1619956465);
            case 137 -> a(1002181864, var9 ^ 384837020);
            case 138 -> a(1002181867, var9 ^ 682512196);
            case 139 -> a(1002181866, var9 ^ 1868163922);
            case 140 -> a(1002181861, var9 ^ 815985318);
            case 141 -> a(1002181860, var9 ^ 1742671719);
            case 142 -> a(1002181863, var9 ^ -1191954797);
            case 143 -> 4;
            case 144 -> a(1002181862, var9 ^ -1511807602);
            case 145 -> a(1002181857, var9 ^ -403830145);
            case 146 -> a(1002181856, var9 ^ 298976298);
            case 147 -> a(1002181859, var9 ^ -707248396);
            case 148 -> a(1002181858, var9 ^ 663318499);
            case 149 -> a(1002181885, var9 ^ -1863459155);
            case 150 -> a(1002181884, var9 ^ 1157694713);
            case 151 -> a(1002181887, var9 ^ -1521479584);
            case 152 -> a(1002181886, var9 ^ 157118896);
            case 153 -> a(1002181881, var9 ^ 1700501699);
            case 154 -> a(1002181880, var9 ^ -1447158891);
            case 155 -> a(1002181883, var9 ^ -1581846529);
            case 156 -> a(1002181882, var9 ^ 669382124);
            case 157 -> a(1002181877, var9 ^ 1708046752);
            case 158 -> a(1002181876, var9 ^ 1849820173);
            case 159 -> a(1002181879, var9 ^ -241264333);
            case 160 -> a(1002181878, var9 ^ 470435343);
            case 161 -> a(1002181873, var9 ^ 10500093);
            case 162 -> a(1002181872, var9 ^ 2066675003);
            case 163 -> a(1002181875, var9 ^ 1313304916);
            case 164 -> a(1002181874, var9 ^ 84679056);
            case 165 -> a(1002181773, var9 ^ 171916399);
            case 166 -> a(1002181772, var9 ^ -1514399374);
            case 167 -> a(1002181775, var9 ^ -1708895177);
            case 168 -> a(1002181774, var9 ^ -1862383695);
            case 169 -> a(1002181769, var9 ^ 2050214576);
            case 170 -> a(1002181768, var9 ^ 1936847039);
            case 171 -> a(1002181771, var9 ^ -1979710474);
            case 172 -> a(1002181770, var9 ^ 2074590729);
            case 173 -> a(1002181765, var9 ^ 1306233100);
            case 174 -> a(1002181764, var9 ^ 1177227949);
            case 175 -> a(1002181767, var9 ^ 278150959);
            case 176 -> a(1002181766, var9 ^ 1709092127);
            case 177 -> a(1002181761, var9 ^ 806115588);
            case 178 -> a(1002181760, var9 ^ 157117535);
            case 179 -> a(1002181763, var9 ^ 1142008170);
            case 180 -> a(1002181762, var9 ^ 94319883);
            case 181 -> a(1002181789, var9 ^ 890247781);
            case 182 -> a(1002181788, var9 ^ 517086636);
            case 183 -> a(1002181791, var9 ^ 132087903);
            case 184 -> a(1002181790, var9 ^ 156492131);
            case 185 -> a(1002181785, var9 ^ -522504512);
            case 186 -> a(1002181784, var9 ^ 1974674494);
            case 187 -> a(1002181787, var9 ^ -791915130);
            case 188 -> a(1002181786, var9 ^ 158822643);
            case 189 -> a(1002181781, var9 ^ 90173166);
            case 190 -> a(1002181780, var9 ^ -212848329);
            case 191 -> a(1002181783, var9 ^ -1181052945);
            case 192 -> a(1002181782, var9 ^ -2146542007);
            case 193 -> a(1002181777, var9 ^ -267927706);
            case 194 -> a(1002181776, var9 ^ -1787632371);
            case 195 -> a(1002181779, var9 ^ 2095852888);
            case 196 -> a(1002181778, var9 ^ -421158843);
            case 197 -> a(1002181805, var9 ^ 934605799);
            case 198 -> a(1002181804, var9 ^ -1570879529);
            case 199 -> a(1002181807, var9 ^ -2070471946);
            case 200 -> a(1002181806, var9 ^ -1402746044);
            case 201 -> a(1002181801, var9 ^ 1927491874);
            case 202 -> a(1002181800, var9 ^ -80152959);
            case 203 -> a(1002181803, var9 ^ 126482583);
            case 204 -> a(1002181802, var9 ^ -1330163156);
            case 205 -> a(1002181797, var9 ^ 354639833);
            case 206 -> a(1002181796, var9 ^ -1695567547);
            case 207 -> a(1002181799, var9 ^ 925643709);
            case 208 -> a(1002181798, var9 ^ -764851230);
            case 209 -> a(1002181793, var9 ^ -747072523);
            case 210 -> a(1002181792, var9 ^ -1518725644);
            case 211 -> a(1002181795, var9 ^ -684644448);
            case 212 -> a(1002181794, var9 ^ 1937778586);
            case 213 -> a(1002181821, var9 ^ 285989647);
            case 214 -> a(1002181820, var9 ^ 1127032993);
            case 215 -> a(1002181823, var9 ^ 592303234);
            case 216 -> a(1002181822, var9 ^ -590311240);
            case 217 -> a(1002181817, var9 ^ -1973653301);
            case 218 -> a(1002181816, var9 ^ 1223903292);
            case 219 -> a(1002181819, var9 ^ -1911776600);
            case 220 -> a(1002181818, var9 ^ -1374912290);
            case 221 -> a(1002181813, var9 ^ 525476445);
            case 222 -> a(1002181812, var9 ^ 165381852);
            case 223 -> a(1002181815, var9 ^ -787933266);
            case 224 -> a(1002181814, var9 ^ -1720592033);
            case 225 -> a(1002181809, var9 ^ -1350222697);
            case 226 -> a(1002181808, var9 ^ -421462226);
            case 227 -> a(1002181811, var9 ^ 846462594);
            case 228 -> a(1002181810, var9 ^ -880248587);
            case 229 -> a(1002181965, var9 ^ -1796335073);
            case 230 -> a(1002181964, var9 ^ 251563794);
            case 231 -> a(1002181967, var9 ^ 2031528575);
            case 232 -> a(1002181966, var9 ^ -652795313);
            case 233 -> a(1002181961, var9 ^ -1149824069);
            case 234 -> a(1002181960, var9 ^ -933507563);
            case 235 -> a(1002181963, var9 ^ 2106021415);
            case 236 -> a(1002181962, var9 ^ 394026042);
            case 237 -> a(1002181957, var9 ^ 749763668);
            case 238 -> 1;
            case 239 -> a(1002181956, var9 ^ 1572005504);
            case 240 -> a(1002181959, var9 ^ -230414480);
            case 241 -> a(1002181958, var9 ^ -36086035);
            case 242 -> a(1002181953, var9 ^ -547874768);
            case 243 -> a(1002181952, var9 ^ -818517948);
            case 244 -> a(1002181955, var9 ^ 2090074751);
            case 245 -> a(1002181954, var9 ^ 1710777323);
            case 246 -> a(1002181981, var9 ^ -546798865);
            case 247 -> a(1002181980, var9 ^ 1448567634);
            case 248 -> a(1002181983, var9 ^ 1597017908);
            case 249 -> a(1002181982, var9 ^ 1827492551);
            case 250 -> a(1002181977, var9 ^ -122628498);
            case 251 -> 5;
            case 252 -> a(1002181976, var9 ^ 1601533110);
            case 253 -> a(1002181979, var9 ^ 1912918926);
            case 254 -> a(1002181978, var9 ^ -282624149);
            default -> a(1002181973, var9 ^ 136604358);
         };
         int var5 = (var1 & a(1002181972, var9 ^ -1945793951)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1002181975, var9 ^ -55286964)) >>> a(1002181974, var9 ^ -1291955337)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1002181969, var9 ^ 402531137);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1002181968, var9 ^ 1833837207);
            }
         }

         bab[var2] = new String(var3).intern();
      }

      return bab[var2];
   }

   private void abb(int var1, int var2, int var3) {
      this.aaba.keySet().removeIf(abbab::bb);
   }
}
