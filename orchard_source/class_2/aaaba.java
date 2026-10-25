package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
public final class aaaba extends abbaabbaa {
   private static final String[] aa;
   private final abbaaaaa ab;
   private static volatile aaaba ba;
   private static final int[] aaa;
   private static final Object[] aba;
   private static final String[] bb;
   private static final String[] aab;

   public static void aa() {
      ba = null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1014300045;
      short var18 = 16652;
      int var10001 = "r\ua8cb⩆ꫤꨃꪶ檽ꪫ⩞ꯐ樆ꮺꪐꥋ橃ꬤ\uaa39ꦆꪧꯛꩊꢐ樁\ua83a\ueabe\uaa3b⩅ꪔꨐ꣖⪽\uab0f\uea7dꭼ\uea16\ua95eꪨ꧳⩁ꪘ樤ꪢ⪰ꩃꩵꦀ樁ꬖ\uea97ꯛ꩷ꯀ\uaa3eꢖꪾꤟꩣꡈꨉꯒ⪥ꢫ橱ꥐ樢ꩪ\ueab5꠷橜ꮘ樂ꦶꪖꣷ橫ꢼ\uaa3cꦾ⪜ꬿ\uea7aꮀ\uea3dꫢꪷꪃ⩦ꯐ樽ꩾ⪫ꪫ⩍꣠\uea1dꠎꪭ\uab6f橹꣸樮ꢪꪉ\uabff⩊ꪄ\uea21ꦪ⪥ꡟ橗ꩀ\uea0e꣮ꪠ"
         .length();
      int var17 = 0;
      int var14 = var10001;
      String[] var15 = new String[1];
      String var13 = "r\ua8cb⩆ꫤꨃꪶ檽ꪫ⩞ꯐ樆ꮺꪐꥋ橃ꬤ\uaa39ꦆꪧꯛꩊꢐ樁\ua83a\ueabe\uaa3b⩅ꪔꨐ꣖⪽\uab0f\uea7dꭼ\uea16\ua95eꪨ꧳⩁ꪘ樤ꪢ⪰ꩃꩵꦀ樁ꬖ\uea97ꯛ꩷ꯀ\uaa3eꢖꪾꤟꩣꡈꨉꯒ⪥ꢫ橱ꥐ樢ꩪ\ueab5꠷橜ꮘ樂ꦶꪖꣷ橫ꢼ\uaa3cꦾ⪜ꬿ\uea7aꮀ\uea3dꫢꪷꪃ⩦ꯐ樽ꩾ⪫ꪫ⩍꣠\uea1dꠎꪭ\uab6f橹꣸樮ꢪꪉ\uabff⩊ꪄ\uea21ꦪ⪥ꡟ橗ꩀ\uea0e꣮ꪠ";
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         char[] var10000 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;
         char[] var20 = var10000;

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 181;
               case 1 -> 202;
               case 2 -> 174;
               case 3 -> 191;
               case 4 -> 92;
               case 5 -> 13;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aab = var15;
      aba = new Object[var15.length];
      int var9 = -898511840;
      byte[] var7 = "É¢éÏ_èÀx=ê¬\u0098\u0006\u0085¶\u009c\u0099p\u00ad)\b¯tmVì\u0013\u009e+¶Å¯ZNÇ\u009aO\u008c\u0084Ó§þ\u0017\u0016\u0006³ä\u0095ê\t\t¾SÑÖ+@¸ÜEõöÆ>ç¶5\u0005ÉÇØ2é\u0016àOÂ-n7§ý\u009cµ\u001d\u001bl\u0087\f\u008c\u008bòK\u000e_pâ\u0086\"\u0006_ÀÖþ]nSc?\u0087°\bòJ\u0089Ã\u0091+\\\u0019p_«u\u00935_¦µ\u009dY\u008d4Ö¸Á\u0096¶\u0099â(|5¢°\u0090ecx&)\u0013\u0090?ñí,EÎyuOEd;\u0013#3âc[M£\u001c\u001f\\\u000b¡\u001f\u0007;\u0086'\u008c^\u0006\u0092Vôº@#\rè0\u008cF/ÿ]iÜ(³ë*x\u0018\u0095GÛ¦ãx@\u0090\u0085 FÂpüÈ\u0087\u001a»¢\bPü/©@Àý°²\u0086áZh\u008bhØ\u0085>óÕ\\¹\u0083C\u001c(u¡+õ\u0014+Ý¶\u0082hÆì\u001ce0\u0016\u00969\u0002I\u009a\u0088º±\u0004Üçñ\u0090\u008aÝÛ\u0090\u0010P\u00956\u0006{2Aç$|\u0013\u0098°\u0004\t²4\\\u0095$5 \u0088\u0007ái\u000eäõ³\u001c\u0081>1ðõ\u0099#×Jâ¦ï!¥\u001e\u0080ÖF\t·[äï@)\u0081\u00051ÀfÌ\u0006É/ñÌ\u0090}UÑ³\u008f\u0083·»\u008c/\u0017Ø\u001a\u0093\u009bVZ\\\u001dñÑ3Õc\u009cS§\u001fkUÔìå\u0015\u0099]ÿu\u009f¥oÝ1ã!,#\u0091'\u0019¹ý\u001dL\b\u0013? \u0016\u0013-\u008f®ß\">È0\u0000.(2 ÃÉ¯ºÏ¥4\u0004\u009fûB\u00adk\t!³¢,~ú<äy\u0087ø\u001e9¹åÌ\u0010©§\u0001\u0016`¼\u0017ªüWÚÒú©ú©\u0097ÏQl\u009d;F÷T`$¶\u008eAO<nÄ\u001c\u0005ìª+]¬?Ú7Xó¨S±\u0096.P°ÞÂ©S{½¾\u0082à´%Þ«\u0015/\n\u008d\u0015A\u0001KõÐoIÛê\u0085ÛX±´ÛvòM\u008d\u0094\u0013\u0010P`ÿb\u0089\u0091£¤$§B.´4ÅHj\u000f-Ø\u009a9\u0094Þ{\u001cõ\u0019\u008f×j\f3®Ã+\u0010\t£®>\u000e:\u0098üí\u0089Ýí\u009e\u0002¦\u0015p\u0091²\u0089>á\u0015©g¼J\u0090Ñ¼qÈo6\u0010\u001dà\u0001wÉ\u001fJ»¢Â\u008aÚ/8(ÝG\u009aûî\u008d»úK¾\u001dò>\fã®e\u0019Íø°\u0092«\u009aR\u0089tÏq®~äbæ\u008aGBó\\\u0097è¾\u0098=º J;×ÈÅ{¶SÎè`wKUÃ\u001d\u0002\u0010\u0004ò¸û>ÂºUC\u001b\u000eÕÉZ\u001d ¸\u000b\u0000ü¼\u001a\u0081E\u0010=F74&«.\u0091X\u001cæ-ÚÕªh\u00adµqô\u0007ö|9ôû_/\u001b\u000f\u001d¹\u009ba\u008f\nï¶\u00adu\u008e=ªK8\u0001¦ù\u001d$ÊrªKI\u0098\u0084a!\u0010o\bQ,ÙÛ\u0010\tï \u001dOás\u0014æ(\u0082í\u0016\u0091\u009c\u001c\\¼§Ãäfã=]9òròßì½\u0007Û¾\u0011\u001fuÞrÅnØ\u0098ú°¸×\u0000J:@>\u0007¢ìá¬9S\u008fÌ`Çàçx2æ\u009e\u0088Ív+°\u0013«Ù\u008dpô¯½$\u008aynõ\u000e\u0099hø\u0007&Q¾(aÊØ·è\u001e\u0006\n \u0007¬:zøh\nâî°¼Íú?ÙØ\u0090æ\u0019h\u0095w\u00165ñÜÝOp½\u0088h\u0015|Å\u0087½¢ã[\u0001&M]à·HÉ9ògíÚÞàx\u0011Hv¤{8KR\u0097\u0082;ÁXÉ\u0004\u0080õ»wß%\u0085A3\u0083\u0016I\u0001\\Bh°ð\u009b\u0001R!&gÍbÂ0Ë\u0088«æhPªÊ\u0098\u001f§î)D\u00186\u008c\u0095|Dß\u00138-\u0010fM»¸·\u0093©á¢pzR\t\u007f\u0082\u0016Â$\u0007\u000bì\u0014\u0091¾+|Je5øAqæ'ô\u009c1*2Ö=¯ÐÞ¹Ï\u0013F[Ðô\u007fÛðN×f^[\u008dÓ¨\u001eybÃ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      aaa = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         aaa[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[3];
      int var3 = 0;
      String var2;
      int var4 = (var2 = aab(-906203421, var23 ^ -955095477)).length();
      int var1 = a(-2142791667, var23 ^ 548292984);
      int var0 = -1;

      while (true) {
         char[] var37;
         label85: {
            char[] var28 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10003 = var28.length;
            int var6 = 0;
            var37 = var28;
            var10001 = var10003;
            char[] var44;
            int var10004;
            if (var10003 <= 1) {
               var44 = var28;
               var10004 = var6;
            } else {
               var37 = var28;
               var10001 = var10003;
               if (var10003 <= var6) {
                  break label85;
               }

               var44 = var28;
               var10004 = var6;
            }

            while (true) {
               var44[var10004] = (char)(var44[var10004] ^ switch (var6 % a(-2142791668, var23 ^ 1576312645)) {
                  case 0 -> a(-2142791677, var23 ^ 739024179);
                  case 1 -> a(-2142791678, var23 ^ 969858674);
                  case 2 -> a(-2142791679, var23 ^ -776188539);
                  case 3 -> a(-2142791680, var23 ^ 1894891024);
                  case 4 -> a(-2142791673, var23 ^ -1672785147);
                  case 5 -> a(-2142791674, var23 ^ 630426758);
                  default -> a(-2142791675, var23 ^ 922388145);
               });
               var6++;
               if (var10001 == 0) {
                  var10004 = var10001;
                  var44 = var37;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var44 = var37;
                  var10004 = var6;
               }
            }
         }

         String var51 = new String(var37).intern();
         byte var35 = -1;
         var5[var3++] = var51;
         if ((var0 += var1) >= var4) {
            bb = var5;
            aa = new String[3];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private boolean ab(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 1
      // 004: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
      // 007: ldc2_w 0.05
      // 00a: ldc2_w 0.05
      // 00d: ldc2_w 0.05
      // 010: invokevirtual net/minecraft/class_238.method_35580 (DDD)Lnet/minecraft/class_238;
      // 013: astore 3
      // 014: istore 2
      // 015: aload 3
      // 016: invokevirtual net/minecraft/class_238.method_17939 ()D
      // 019: dconst_0
      // 01a: dcmpg
      // 01b: iload 2
      // 01c: ifne 051
      // 01f: ifle 050
      // 022: goto 026
      // 025: athrow
      // 026: aload 3
      // 027: invokevirtual net/minecraft/class_238.method_17940 ()D
      // 02a: dconst_0
      // 02b: dcmpg
      // 02c: iload 2
      // 02d: ifne 051
      // 030: goto 034
      // 033: athrow
      // 034: ifle 050
      // 037: goto 03b
      // 03a: athrow
      // 03b: aload 3
      // 03c: invokevirtual net/minecraft/class_238.method_17941 ()D
      // 03f: dconst_0
      // 040: dcmpg
      // 041: iload 2
      // 042: ifne 051
      // 045: goto 049
      // 048: athrow
      // 049: ifgt 052
      // 04c: goto 050
      // 04f: athrow
      // 050: bipush 0
      // 051: ireturn
      // 052: aload 1
      // 053: invokevirtual net/minecraft/class_1657.method_73183 ()Lnet/minecraft/class_1937;
      // 056: astore 4
      // 058: aload 3
      // 059: getfield net/minecraft/class_238.field_1323 D
      // 05c: aload 3
      // 05d: getfield net/minecraft/class_238.field_1322 D
      // 060: aload 3
      // 061: getfield net/minecraft/class_238.field_1321 D
      // 064: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 067: astore 5
      // 069: aload 3
      // 06a: getfield net/minecraft/class_238.field_1320 D
      // 06d: aload 3
      // 06e: getfield net/minecraft/class_238.field_1325 D
      // 071: aload 3
      // 072: getfield net/minecraft/class_238.field_1324 D
      // 075: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 078: astore 6
      // 07a: aload 5
      // 07c: aload 6
      // 07e: invokestatic net/minecraft/class_2338.method_10097 (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Ljava/lang/Iterable;
      // 081: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 086: astore 7
      // 088: aload 7
      // 08a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 08f: ifeq 130
      // 092: aload 7
      // 094: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 099: checkcast net/minecraft/class_2338
      // 09c: astore 8
      // 09e: aload 4
      // 0a0: aload 8
      // 0a2: invokevirtual net/minecraft/class_1937.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0a5: astore 9
      // 0a7: aload 9
      // 0a9: iload 2
      // 0aa: ifne 0c9
      // 0ad: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 0b0: iload 2
      // 0b1: ifne 131
      // 0b4: goto 0b8
      // 0b7: athrow
      // 0b8: ifeq 0c7
      // 0bb: goto 0bf
      // 0be: athrow
      // 0bf: iload 2
      // 0c0: ifeq 088
      // 0c3: goto 0c7
      // 0c6: athrow
      // 0c7: aload 9
      // 0c9: aload 4
      // 0cb: aload 8
      // 0cd: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 0d0: astore 10
      // 0d2: aload 10
      // 0d4: iload 2
      // 0d5: ifne 0ec
      // 0d8: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 0db: ifeq 0ea
      // 0de: goto 0e2
      // 0e1: athrow
      // 0e2: iload 2
      // 0e3: ifeq 088
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: aload 10
      // 0ec: invokevirtual net/minecraft/class_265.method_1090 ()Ljava/util/List;
      // 0ef: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0f4: astore 11
      // 0f6: aload 11
      // 0f8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0fd: ifeq 12c
      // 100: aload 11
      // 102: iload 2
      // 103: ifne 08a
      // 106: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10b: checkcast net/minecraft/class_238
      // 10e: astore 12
      // 110: aload 12
      // 112: aload 8
      // 114: invokevirtual net/minecraft/class_238.method_996 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_238;
      // 117: aload 3
      // 118: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
      // 11b: iload 2
      // 11c: ifne 127
      // 11f: ifeq 128
      // 122: goto 126
      // 125: athrow
      // 126: bipush 1
      // 127: ireturn
      // 128: iload 2
      // 129: ifeq 0f6
      // 12c: iload 2
      // 12d: ifeq 088
      // 130: bipush 0
      // 131: ireturn
   }

   public aaaba() {
      int var1 = -1970870957;
      super(
         aabbaaaba.aaab(bb(a(-2142791669, var1 ^ -152237252), a(-2142791670, var1 ^ 1621589706))),
         bbaabbba.aaa,
         aabbaaaba.aaab(bb(a(-2142791671, var1 ^ 44387942), a(-2142791672, var1 ^ 969657029)))
      );
      this.ab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(bb(a(-2142791665, var1 ^ -1505800228), a(-2142791666, var1 ^ 937466381))), false
         )
      );
      ba = this;
   }

   public static boolean ba(class_1297 param0, class_1297 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaba;
      // 06: astore 3
      // 07: istore 2
      // 08: aload 3
      // 09: iload 2
      // 0a: ifne 1d
      // 0d: ifnull 58
      // 10: goto 14
      // 13: athrow
      // 14: aload 3
      // 15: iload 2
      // 16: ifne 2e
      // 19: goto 1d
      // 1c: athrow
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaba.babbaab ()Z
      // 20: ifeq 58
      // 23: aload 3
      // 24: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 2a: goto 2e
      // 2d: athrow
      // 2e: checkcast java/lang/Boolean
      // 31: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 34: iload 2
      // 35: ifne 55
      // 38: ifeq 54
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 3
      // 40: aload 0
      // 41: aload 1
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaba.aaa (Lnet/minecraft/class_1297;Lnet/minecraft/class_1297;)Z
      // 45: iload 2
      // 46: ifne 55
      // 49: goto 4d
      // 4c: athrow
      // 4d: ifne 58
      // 50: goto 54
      // 53: athrow
      // 54: bipush 1
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
   }

   private static String aab(int var0, int var1) {
      int var3 = var0 ^ -906203421;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1221347432;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 2;
            case 1 -> 13;
            case 2 -> 244;
            case 3 -> 33;
            case 4 -> 90;
            case 5 -> 108;
            case 6 -> 207;
            case 7 -> 157;
            case 8 -> 13;
            case 9 -> 29;
            case 10 -> 138;
            case 11 -> 69;
            case 12 -> 144;
            case 13 -> 120;
            case 14 -> 143;
            case 15 -> 195;
            case 16 -> 62;
            case 17 -> 176;
            case 18 -> 75;
            case 19 -> 72;
            case 20 -> 97;
            case 21 -> 100;
            case 22 -> 182;
            case 23 -> 189;
            case 24 -> 51;
            case 25 -> 35;
            case 26 -> 220;
            case 27 -> 99;
            case 28 -> 145;
            case 29 -> 216;
            case 30 -> 36;
            case 31 -> 159;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ -2142791669] ^ var1 ^ var0;
      var2 ^= 14297;
      var2 ^= 13514;
      var2 += 15111;
      var2 += 43432;
      var2 += 30157;
      var2 += 38877;
      var2 -= 12521;
      var2 -= 17631;
      return var2 - 35888;
   }

   private static String bb(int var0, int var1) {
      int var9 = -384531242;
      int var2 = (var0 ^ a(-2142791676, var9 ^ -1456782009)) & a(-2142791653, var9 ^ 1150609765);
      if (aa[var2] == null) {
         char[] var3 = bb[var2].toCharArray();

         int var4 = switch (var3[0] & a(-2142791654, var9 ^ -1793451181)) {
            case 0 -> a(-2142791655, var9 ^ -1244971932);
            case 1 -> a(-2142791656, var9 ^ -1628392939);
            case 2 -> a(-2142791649, var9 ^ -81772295);
            case 3 -> a(-2142791650, var9 ^ 1103540006);
            case 4 -> 4;
            case 5 -> a(-2142791651, var9 ^ 1347508196);
            case 6 -> a(-2142791652, var9 ^ 399737715);
            case 7 -> a(-2142791661, var9 ^ -1101274641);
            case 8 -> a(-2142791662, var9 ^ 52237675);
            case 9 -> a(-2142791663, var9 ^ 28545209);
            case 10 -> a(-2142791664, var9 ^ 1666870275);
            case 11 -> a(-2142791657, var9 ^ -1365816779);
            case 12 -> a(-2142791658, var9 ^ -839483368);
            case 13 -> a(-2142791659, var9 ^ 746747696);
            case 14 -> a(-2142791660, var9 ^ -806839182);
            case 15 -> a(-2142791637, var9 ^ -381642196);
            case 16 -> a(-2142791638, var9 ^ 1745582970);
            case 17 -> a(-2142791639, var9 ^ -898939424);
            case 18 -> a(-2142791640, var9 ^ 1956771331);
            case 19 -> a(-2142791633, var9 ^ -330455382);
            case 20 -> a(-2142791634, var9 ^ 620492040);
            case 21 -> a(-2142791635, var9 ^ -857591277);
            case 22 -> a(-2142791636, var9 ^ 1889013029);
            case 23 -> a(-2142791645, var9 ^ 697468635);
            case 24 -> a(-2142791646, var9 ^ 1741618956);
            case 25 -> a(-2142791647, var9 ^ -1094805303);
            case 26 -> a(-2142791648, var9 ^ -4072310);
            case 27 -> a(-2142791641, var9 ^ 1467794280);
            case 28 -> a(-2142791642, var9 ^ 1734075431);
            case 29 -> a(-2142791643, var9 ^ 47926850);
            case 30 -> a(-2142791644, var9 ^ -1469611168);
            case 31 -> a(-2142791621, var9 ^ 1362490233);
            case 32 -> a(-2142791622, var9 ^ 452076399);
            case 33 -> a(-2142791623, var9 ^ 889318397);
            case 34 -> a(-2142791624, var9 ^ -1208507376);
            case 35 -> a(-2142791617, var9 ^ -912648166);
            case 36 -> a(-2142791618, var9 ^ -1079665412);
            case 37 -> a(-2142791619, var9 ^ -637691228);
            case 38 -> 0;
            case 39 -> a(-2142791620, var9 ^ 740365556);
            case 40 -> a(-2142791629, var9 ^ 1181114857);
            case 41 -> a(-2142791630, var9 ^ 203551674);
            case 42 -> a(-2142791631, var9 ^ 471678564);
            case 43 -> a(-2142791632, var9 ^ -296017155);
            case 44 -> a(-2142791625, var9 ^ 878095211);
            case 45 -> a(-2142791626, var9 ^ -639422349);
            case 46 -> a(-2142791627, var9 ^ 6577955);
            case 47 -> a(-2142791628, var9 ^ 1089844782);
            case 48 -> 5;
            case 49 -> a(-2142791605, var9 ^ 1999165314);
            case 50 -> a(-2142791606, var9 ^ -2123669996);
            case 51 -> a(-2142791607, var9 ^ -1708007550);
            case 52 -> a(-2142791608, var9 ^ 1825262197);
            case 53 -> a(-2142791601, var9 ^ 1586775757);
            case 54 -> a(-2142791602, var9 ^ -429078707);
            case 55 -> 2;
            case 56 -> a(-2142791603, var9 ^ -1154722971);
            case 57 -> a(-2142791604, var9 ^ -2130291751);
            case 58 -> a(-2142791613, var9 ^ 206107951);
            case 59 -> a(-2142791614, var9 ^ 670007822);
            case 60 -> a(-2142791615, var9 ^ 2023870585);
            case 61 -> a(-2142791616, var9 ^ -321271168);
            case 62 -> a(-2142791609, var9 ^ 1753303358);
            case 63 -> a(-2142791610, var9 ^ 1778209877);
            case 64 -> a(-2142791611, var9 ^ -1112224512);
            case 65 -> a(-2142791612, var9 ^ -1452351714);
            case 66 -> a(-2142791589, var9 ^ 1659646807);
            case 67 -> a(-2142791590, var9 ^ -973204292);
            case 68 -> a(-2142791591, var9 ^ -1099223896);
            case 69 -> a(-2142791592, var9 ^ -104643795);
            case 70 -> a(-2142791585, var9 ^ 450128728);
            case 71 -> a(-2142791586, var9 ^ -1204649018);
            case 72 -> a(-2142791587, var9 ^ -572985928);
            case 73 -> a(-2142791588, var9 ^ 974248594);
            case 74 -> a(-2142791597, var9 ^ 1932267751);
            case 75 -> a(-2142791598, var9 ^ 562564528);
            case 76 -> a(-2142791599, var9 ^ -748784627);
            case 77 -> a(-2142791600, var9 ^ -789392311);
            case 78 -> a(-2142791593, var9 ^ 1179539612);
            case 79 -> a(-2142791594, var9 ^ 109174398);
            case 80 -> a(-2142791595, var9 ^ -1913776440);
            case 81 -> a(-2142791596, var9 ^ -1064404213);
            case 82 -> a(-2142791573, var9 ^ 931665782);
            case 83 -> a(-2142791574, var9 ^ -1178051958);
            case 84 -> a(-2142791575, var9 ^ -1549247303);
            case 85 -> a(-2142791576, var9 ^ 855700200);
            case 86 -> a(-2142791569, var9 ^ 2113011648);
            case 87 -> a(-2142791570, var9 ^ 2076468644);
            case 88 -> a(-2142791571, var9 ^ 1100076065);
            case 89 -> a(-2142791572, var9 ^ 1677579727);
            case 90 -> a(-2142791581, var9 ^ 1901228706);
            case 91 -> a(-2142791582, var9 ^ 2128808869);
            case 92 -> a(-2142791583, var9 ^ 1559489456);
            case 93 -> a(-2142791584, var9 ^ -65140176);
            case 94 -> a(-2142791577, var9 ^ -435001701);
            case 95 -> a(-2142791578, var9 ^ 1480734886);
            case 96 -> a(-2142791579, var9 ^ -239678766);
            case 97 -> a(-2142791580, var9 ^ -276828186);
            case 98 -> a(-2142791557, var9 ^ -1495193751);
            case 99 -> a(-2142791558, var9 ^ -618275337);
            case 100 -> a(-2142791559, var9 ^ -449310684);
            case 101 -> a(-2142791560, var9 ^ -176497294);
            case 102 -> a(-2142791553, var9 ^ 1013044314);
            case 103 -> a(-2142791554, var9 ^ -1601562311);
            case 104 -> a(-2142791555, var9 ^ -1502337340);
            case 105 -> a(-2142791556, var9 ^ -887975198);
            case 106 -> a(-2142791565, var9 ^ -1041857235);
            case 107 -> a(-2142791566, var9 ^ 146667655);
            case 108 -> a(-2142791567, var9 ^ -761492427);
            case 109 -> a(-2142791568, var9 ^ 840548438);
            case 110 -> a(-2142791561, var9 ^ -1334319012);
            case 111 -> a(-2142791562, var9 ^ -253622697);
            case 112 -> a(-2142791563, var9 ^ 70151131);
            case 113 -> a(-2142791564, var9 ^ -313790987);
            case 114 -> a(-2142791541, var9 ^ -335347274);
            case 115 -> a(-2142791542, var9 ^ 262562073);
            case 116 -> a(-2142791543, var9 ^ -566397120);
            case 117 -> a(-2142791544, var9 ^ -2106144321);
            case 118 -> a(-2142791537, var9 ^ 1448138415);
            case 119 -> a(-2142791538, var9 ^ 1570122075);
            case 120 -> a(-2142791539, var9 ^ 865343518);
            case 121 -> 1;
            case 122 -> a(-2142791540, var9 ^ -653878386);
            case 123 -> a(-2142791549, var9 ^ -402216375);
            case 124 -> a(-2142791550, var9 ^ 290477922);
            case 125 -> a(-2142791551, var9 ^ 1284350878);
            case 126 -> a(-2142791552, var9 ^ 1045713545);
            case 127 -> a(-2142791545, var9 ^ -117873567);
            case 128 -> a(-2142791546, var9 ^ 1919547179);
            case 129 -> a(-2142791547, var9 ^ 347589829);
            case 130 -> a(-2142791548, var9 ^ -2075663103);
            case 131 -> a(-2142791525, var9 ^ -2102992935);
            case 132 -> a(-2142791526, var9 ^ 1163004875);
            case 133 -> a(-2142791527, var9 ^ 1357804134);
            case 134 -> a(-2142791528, var9 ^ 2009975390);
            case 135 -> a(-2142791521, var9 ^ -219951671);
            case 136 -> a(-2142791522, var9 ^ -1004457650);
            case 137 -> a(-2142791523, var9 ^ -2127543664);
            case 138 -> a(-2142791524, var9 ^ -87511993);
            case 139 -> a(-2142791533, var9 ^ -296426923);
            case 140 -> a(-2142791534, var9 ^ 1232381094);
            case 141 -> a(-2142791535, var9 ^ 374149805);
            case 142 -> a(-2142791536, var9 ^ 756395087);
            case 143 -> a(-2142791529, var9 ^ 1287660352);
            case 144 -> a(-2142791530, var9 ^ 722787443);
            case 145 -> a(-2142791531, var9 ^ -411106925);
            case 146 -> a(-2142791532, var9 ^ -2030902097);
            case 147 -> 3;
            case 148 -> a(-2142791509, var9 ^ -2120595869);
            case 149 -> a(-2142791510, var9 ^ -1303349077);
            case 150 -> a(-2142791511, var9 ^ 392413554);
            case 151 -> a(-2142791512, var9 ^ 1657872542);
            case 152 -> a(-2142791505, var9 ^ 969150138);
            case 153 -> a(-2142791506, var9 ^ -330340159);
            case 154 -> a(-2142791507, var9 ^ 240433092);
            case 155 -> a(-2142791508, var9 ^ 762559906);
            case 156 -> a(-2142791517, var9 ^ 1044072760);
            case 157 -> a(-2142791518, var9 ^ 506371918);
            case 158 -> a(-2142791519, var9 ^ -1268556968);
            case 159 -> a(-2142791520, var9 ^ -419591902);
            case 160 -> a(-2142791513, var9 ^ -1961556472);
            case 161 -> a(-2142791514, var9 ^ -359789180);
            case 162 -> a(-2142791515, var9 ^ 1017808896);
            case 163 -> a(-2142791516, var9 ^ -1614750022);
            case 164 -> a(-2142791493, var9 ^ 1479500820);
            case 165 -> a(-2142791494, var9 ^ 1646225104);
            case 166 -> a(-2142791495, var9 ^ 533123665);
            case 167 -> a(-2142791496, var9 ^ -1786257674);
            case 168 -> a(-2142791489, var9 ^ -455687361);
            case 169 -> a(-2142791490, var9 ^ -523812206);
            case 170 -> a(-2142791491, var9 ^ 1289788068);
            case 171 -> a(-2142791492, var9 ^ 1761306635);
            case 172 -> a(-2142791501, var9 ^ -846864434);
            case 173 -> a(-2142791502, var9 ^ 1896286534);
            case 174 -> a(-2142791503, var9 ^ 879785649);
            case 175 -> a(-2142791504, var9 ^ -1462097254);
            case 176 -> a(-2142791497, var9 ^ 1697200238);
            case 177 -> a(-2142791498, var9 ^ 1942408217);
            case 178 -> a(-2142791499, var9 ^ -448355680);
            case 179 -> a(-2142791500, var9 ^ 1446147553);
            case 180 -> a(-2142791477, var9 ^ 693363060);
            case 181 -> a(-2142791478, var9 ^ 400933607);
            case 182 -> a(-2142791479, var9 ^ -1514080246);
            case 183 -> a(-2142791480, var9 ^ 779589516);
            case 184 -> a(-2142791473, var9 ^ -1000758778);
            case 185 -> a(-2142791474, var9 ^ 1286788253);
            case 186 -> a(-2142791475, var9 ^ 1879316559);
            case 187 -> a(-2142791476, var9 ^ 1429398351);
            case 188 -> a(-2142791485, var9 ^ 322744192);
            case 189 -> a(-2142791486, var9 ^ -1158324634);
            case 190 -> a(-2142791487, var9 ^ 1246511346);
            case 191 -> a(-2142791488, var9 ^ 6382813);
            case 192 -> a(-2142791481, var9 ^ -1195687942);
            case 193 -> a(-2142791482, var9 ^ 31732086);
            case 194 -> a(-2142791483, var9 ^ -1375588270);
            case 195 -> a(-2142791484, var9 ^ 1527151872);
            case 196 -> a(-2142791461, var9 ^ 1135084200);
            case 197 -> a(-2142791462, var9 ^ -1716321268);
            case 198 -> a(-2142791463, var9 ^ -1502780358);
            case 199 -> a(-2142791464, var9 ^ 1553463804);
            case 200 -> a(-2142791457, var9 ^ 1658478991);
            case 201 -> a(-2142791458, var9 ^ -1116603799);
            case 202 -> a(-2142791459, var9 ^ -753818666);
            case 203 -> a(-2142791460, var9 ^ -1137001723);
            case 204 -> a(-2142791469, var9 ^ -1169992619);
            case 205 -> a(-2142791470, var9 ^ 720794484);
            case 206 -> a(-2142791471, var9 ^ -150712724);
            case 207 -> a(-2142791472, var9 ^ -1468891513);
            case 208 -> a(-2142791465, var9 ^ -693849586);
            case 209 -> a(-2142791466, var9 ^ 1380232179);
            case 210 -> a(-2142791467, var9 ^ 1543212370);
            case 211 -> a(-2142791468, var9 ^ 1958480376);
            case 212 -> a(-2142791445, var9 ^ -348798283);
            case 213 -> a(-2142791446, var9 ^ 1459471585);
            case 214 -> a(-2142791447, var9 ^ 1722229915);
            case 215 -> a(-2142791448, var9 ^ 1446981090);
            case 216 -> a(-2142791441, var9 ^ -535807553);
            case 217 -> a(-2142791442, var9 ^ -2063250392);
            case 218 -> a(-2142791443, var9 ^ 1169508822);
            case 219 -> a(-2142791444, var9 ^ 1256731288);
            case 220 -> a(-2142791453, var9 ^ -2121092120);
            case 221 -> a(-2142791454, var9 ^ -726280691);
            case 222 -> a(-2142791455, var9 ^ -1722122612);
            case 223 -> a(-2142791456, var9 ^ -1081687388);
            case 224 -> a(-2142791449, var9 ^ 293616658);
            case 225 -> a(-2142791450, var9 ^ 336919246);
            case 226 -> a(-2142791451, var9 ^ 993008120);
            case 227 -> a(-2142791452, var9 ^ -1129984636);
            case 228 -> a(-2142791429, var9 ^ 712620197);
            case 229 -> a(-2142791430, var9 ^ 395269297);
            case 230 -> a(-2142791431, var9 ^ 1729922082);
            case 231 -> a(-2142791432, var9 ^ 1482503812);
            case 232 -> a(-2142791425, var9 ^ 721610428);
            case 233 -> a(-2142791426, var9 ^ 502153367);
            case 234 -> a(-2142791427, var9 ^ 366780209);
            case 235 -> a(-2142791428, var9 ^ 879571929);
            case 236 -> a(-2142791437, var9 ^ 1569717708);
            case 237 -> a(-2142791438, var9 ^ 990953066);
            case 238 -> a(-2142791439, var9 ^ 1813400359);
            case 239 -> a(-2142791440, var9 ^ -1162507178);
            case 240 -> a(-2142791433, var9 ^ -1773806360);
            case 241 -> a(-2142791434, var9 ^ -1292597393);
            case 242 -> a(-2142791435, var9 ^ 1783712138);
            case 243 -> a(-2142791436, var9 ^ 402837688);
            case 244 -> a(-2142791413, var9 ^ 1909302328);
            case 245 -> a(-2142791414, var9 ^ -412781193);
            case 246 -> a(-2142791415, var9 ^ -180592615);
            case 247 -> a(-2142791416, var9 ^ 646958002);
            case 248 -> a(-2142791409, var9 ^ -557121340);
            case 249 -> a(-2142791410, var9 ^ 1540763319);
            case 250 -> a(-2142791411, var9 ^ -849090066);
            case 251 -> a(-2142791412, var9 ^ 381217010);
            case 252 -> a(-2142791421, var9 ^ 497826562);
            case 253 -> a(-2142791422, var9 ^ -1472072720);
            case 254 -> a(-2142791423, var9 ^ 1846272140);
            default -> a(-2142791424, var9 ^ -1945928936);
         };
         int var5 = (var1 & a(-2142791417, var9 ^ 1335597484)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-2142791418, var9 ^ 1465714317)) >>> a(-2142791419, var9 ^ 302693145)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-2142791420, var9 ^ 122687959);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-2142791397, var9 ^ 1118085283);
            }
         }

         aa[var2] = new String(var3).intern();
      }

      return aa[var2];
   }

   private boolean aaa(class_1297 param1, class_1297 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaba.b (Lnet/minecraft/class_1297;)Z
      // 09: iload 3
      // 0a: ifne 29
      // 0d: ifne 28
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: aload 2
      // 16: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaba.b (Lnet/minecraft/class_1297;)Z
      // 19: iload 3
      // 1a: ifne 29
      // 1d: goto 21
      // 20: athrow
      // 21: ifeq 2c
      // 24: goto 28
      // 27: athrow
      // 28: bipush 1
      // 29: goto 2d
      // 2c: bipush 0
      // 2d: ireturn
   }

   private boolean b(class_1297 param1) {
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
      // 05: instanceof net/minecraft/class_1657
      // 08: iload 2
      // 09: ifne 2c
      // 0c: ifeq 27
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: checkcast net/minecraft/class_1657
      // 17: astore 3
      // 18: aload 3
      // 19: iload 2
      // 1a: ifne 2e
      // 1d: invokevirtual net/minecraft/class_1657.method_73183 ()Lnet/minecraft/class_1937;
      // 20: ifnonnull 2d
      // 23: goto 27
      // 26: athrow
      // 27: bipush 0
      // 28: goto 2c
      // 2b: athrow
      // 2c: ireturn
      // 2d: aload 3
      // 2e: invokevirtual net/minecraft/class_1657.method_5757 ()Z
      // 31: iload 2
      // 32: ifne 51
      // 35: ifne 50
      // 38: goto 3c
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 3
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaba.ab (Lnet/minecraft/class_1657;)Z
      // 41: iload 2
      // 42: ifne 51
      // 45: goto 49
      // 48: athrow
      // 49: ifeq 54
      // 4c: goto 50
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: ireturn
   }
}
