package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;

@Environment(EnvType.CLIENT)
public final class bbabbaab {
   private static final Object[] ba;
   private static final String[] ab;
   private static final int[] a;
   private static final Integer[] aa;
   private static final long[] b;

   private bbabbaab() {
   }

   private static class_2583 aa(class_2583 var0, class_124 var1) {
      try {
         switch (babbabab.b[var1.ordinal()]) {
            case 1:
               return var0.method_10982(true);
            case 2:
               return var0.method_10978(true);
            case 3:
               return var0.method_30938(true);
            case 4:
               return var0.method_36140(true);
            case 5:
               return var0.method_36141(true);
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return var0;
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-107425914, 1550568012 ^ 991730259);
      if (aa[var3] == null) {
         aa[var3] = (int)(b[var3] ^ var1);
      }

      return aa[var3];
   }

   static {
      int var18 = 1403409862;
      short var13 = 11360;
      int var12 = 0;
      int var11 = 0;
      String[] var10 = new String[4];
      int var9 = "X쩓㤓앤ᥛﶞ\ud993촳䄝\uf284셙쩞\ue99fﺓ\ue91d켄煙\uf49e⦜졓餛컄祕\uf75e\ue993ｳꄜ\uf184ꅙ졞醐\uf673脞\ue284煖쇾憟잳餑\uf704奙칞↝\uf693ㄞ츄奛쵾증솓褑ﲄक़쑞冑싓亂\ue384ᥘ쮾⦟\uf4b3愓찤腗샾즙칓\ud95a숄腙︾㦟쯳䤞\uf764䅚ﱾ覝ﬓ\ue11c쟄텔셾ᦓ칳⤐쳄腗\n捷㠽揠⡵筺\ue0bf篷䠾砠衵\u0010㊏㸣㡸㹨ൂ㚣㵯긣➘٩ଂ纭㙏ᘢࡸ♫\n俔郱䩃䂺俙졲䑔惲䖃ꂺ"
         .length();
      String var8 = "X쩓㤓앤ᥛﶞ\ud993촳䄝\uf284셙쩞\ue99fﺓ\ue91d켄煙\uf49e⦜졓餛컄祕\uf75e\ue993ｳꄜ\uf184ꅙ졞醐\uf673脞\ue284煖쇾憟잳餑\uf704奙칞↝\uf693ㄞ츄奛쵾증솓褑ﲄक़쑞冑싓亂\ue384ᥘ쮾⦟\uf4b3愓찤腗샾즙칓\ud95a숄腙︾㦟쯳䤞\uf764䅚ﱾ覝ﬓ\ue11c쟄텔셾ᦓ칳⤐쳄腗\n捷㠽揠⡵筺\ue0bf篷䠾砠衵\u0010㊏㸣㡸㹨ൂ㚣㵯긣➘٩ଂ纭㙏ᘢࡸ♫\n俔郱䩃䂺俙졲䑔惲䖃ꂺ";

      do {
         char var14 = var8.charAt(var12);
         int var10001 = var12 + 1;
         int var10002 = var12 + 1;
         int var16 = 0;
         char[] var15 = var8.substring(var10001, var10002 + var14).toCharArray();

         do {
            int var17 = var15[var16];

            var17 = (char)(switch (var16 % 6) {
               default -> 85;
               case 1 -> 163;
               case 2 -> 130;
               case 3 -> 235;
               case 4 -> 248;
               case 5 -> 33;
            }) ^ var17;
            if (var16 % 2 == 0) {
               var15[var16] = (char)((var17 >>> 5 | var17 << 11) & 65535 ^ var13);
            } else {
               var15[var16] = (char)((var17 << 5 | var17 >>> 11) & 65535 ^ var13);
            }
         } while (++var16 < var15.length);

         var10[var11] = new String(var15);
         var11++;
         var12 = var12 + var14 + 1;
      } while (var12 < var9);

      ab = var10;
      ba = new Object[var10.length];
      a = new int[34];
      byte var21 = 0;
      int var25 = 0;
      byte[] var33 = "L\u0001ÁV·bÁY¯µ\u0097¬Lp\u009e\u0013w\u0082M®C\u0000Â\u009e¢Iþ@\u0005+nûåúJk\u0080\u0012ªr._·)\u009eÔZ¨\u0011rA\u008ciÞ&¼\u0087 À¾eÈ^4ú¶\u009a\u00049fc<1C¦ö\u008b5\u009a\u0015¥±Àj\u0006ÑXéÐÿº,®¨ùZ\u0080²\u0098\u0088\u000f\u0084\bLë\u009eÙËLÜ\u0097®Â;þ@ªÍ\u0014sX\u001d6a[\u008bm\u0007¼_\bá£\u00905Þ"
         .getBytes("ISO-8859-1");

      int var50;
      do {
         a[var21] = ((var33[var25] & 255) << 24 | (var33[var25 + 1] & 255) << 16 | (var33[var25 + 2] & 255) << 8 | var33[var25 + 3] & 255) ^ 996058611;
         var21 += 1;
         var50 = var25 + 4;
         var25 += 4;
      } while (var50 < var33.length);

      long var0 = 8452286356489343859L;
      long[] var6 = new long[a(-107425902, var18 ^ -580840012)];
      int var3 = 0;
      String var4;
      int var5 = (var4 = aaa((short)19412, '쇲', var18 ^ 1331630751)).length();
      byte var2 = 0;

      label68:
      while (true) {
         var25 = var2;
         var2 += 8;
         String var22 = var4.substring(var25, var2);
         var25 = (short)8774;
         char var39 = '쇳';
         var50 = var18 ^ 986655418;
         byte[] var7 = var22.getBytes("ISO-8859-1");
         long[] var23 = var6;
         var25 = var3++;
         long var40 = (var7[0] & 255L) << a(-107425901, var18 ^ 637670029)
            | (var7[1] & 255L) << a(-107425904, var18 ^ 1054164067)
            | (var7[2] & 255L) << a(-107425903, var18 ^ -586134891)
            | (var7[3] & 255L) << a(-107425898, var18 ^ -421357289)
            | (var7[4] & 255L) << a(-107425897, var18 ^ -765454802)
            | (var7[5] & 255L) << a(-107425900, var18 ^ 858335979)
            | (var7[a(-107425899, var18 ^ -1806976413)] & 255L) << a(-107425894, var18 ^ 1956290182)
            | var7[a(-107425893, var18 ^ 292716267)] & 255L;
         int var52 = -1;

         while (true) {
            long var62 = var40 ^ var0;
            switch (var52) {
               case 0:
                  var23[var25] = var62;
                  if (var2 >= var5) {
                     b = var6;
                     aa = new Integer[a(-107425919, var18 ^ 441798372)];
                     return;
                  }
                  break;
               default:
                  var23[var25] = var62;
                  if (var2 < var5) {
                     continue label68;
                  }

                  var5 = (var4 = aaa((short)'ꊚ', '쇰', var18 ^ 2015392852)).length();
                  var2 = 0;
            }

            short var31 = var2;
            var2 += 8;
            String var24 = var4.substring(var31, var2);
            var31 = 16029;
            char var42 = '쇱';
            var52 = var18 ^ 780490935;
            var7 = var24.getBytes("ISO-8859-1");
            var23 = var6;
            var25 = var3++;
            var40 = (var7[0] & 255L) << a(-107425896, var18 ^ -1086364426)
               | (var7[1] & 255L) << a(-107425895, var18 ^ 263489902)
               | (var7[2] & 255L) << a(-107425890, var18 ^ -2146265851)
               | (var7[3] & 255L) << a(-107425889, var18 ^ -121703924)
               | (var7[4] & 255L) << a(-107425892, var18 ^ 381686789)
               | (var7[5] & 255L) << a(-107425891, var18 ^ -190281066)
               | (var7[a(-107425918, var18 ^ 1809206923)] & 255L) << a(-107425917, var18 ^ -1475954744)
               | var7[a(-107425920, var18 ^ -1608289676)] & 255L;
            var52 = 0;
         }
      }
   }

   private static String aaa(short var0, char var1, int var2) {
      int var3 = var1 ^ '쇲';
      char[] var4 = ab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])ba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         ba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 882;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 20230;
         var10 += 50059;
         var10 ^= 1045;
         var10 -= 50278;
         var10 += 40347;
         var10 += 40796;
         var10 += 60292;
         var10 -= 23036;
         var10 += 16108;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static class_124 ba(char var0) {
      var0 = Character.toLowerCase(var0);

      try {
         switch (var0) {
            case '0':
               return class_124.field_1074;
            case '1':
               return class_124.field_1058;
            case '2':
               return class_124.field_1077;
            case '3':
               return class_124.field_1062;
            case '4':
               return class_124.field_1079;
            case '5':
               return class_124.field_1064;
            case '6':
               return class_124.field_1065;
            case '7':
               return class_124.field_1080;
            case '8':
               return class_124.field_1063;
            case '9':
               return class_124.field_1078;
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'p':
            case 'q':
            default:
               return null;
            case 'a':
               return class_124.field_1060;
            case 'b':
               return class_124.field_1075;
            case 'c':
               return class_124.field_1061;
            case 'd':
               return class_124.field_1076;
            case 'e':
               return class_124.field_1054;
            case 'f':
               return class_124.field_1068;
            case 'k':
               return class_124.field_1051;
            case 'l':
               return class_124.field_1067;
            case 'm':
               return class_124.field_1055;
            case 'n':
               return class_124.field_1073;
            case 'o':
               return class_124.field_1056;
            case 'r':
               return class_124.field_1070;
         }
      } catch (MatchException var1) {
         throw var1;
      }
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -107425902] ^ var1 ^ var0;
      var2 -= 8583;
      var2 ^= 29096;
      var2 -= 9838;
      var2 ^= 36349;
      var2 -= 44269;
      var2 += 30797;
      var2 += 48630;
      var2 ^= 58996;
      var2 -= 19744;
      return var2 + 2382;
   }

   private static boolean bb(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 183484838
      // 003: istore 5
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 1
      // 009: aload 0
      // 00a: invokevirtual java/lang/String.length ()I
      // 00d: iload 1
      // 00e: ifne 02e
      // 011: ldc_w -107425913
      // 014: iload 5
      // 016: ldc_w -822547402
      // 019: ixor
      // 01a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 01d: ldc2_w 227831184568121790
      // 020: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 023: if_icmpeq 02d
      // 026: goto 02a
      // 029: athrow
      // 02a: bipush 0
      // 02b: ireturn
      // 02c: athrow
      // 02d: bipush 0
      // 02e: istore 2
      // 02f: iload 2
      // 030: ldc_w -107425916
      // 033: iload 5
      // 035: ldc_w 416740669
      // 038: ixor
      // 039: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 03c: ldc2_w 7394492740876403906
      // 03f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 042: if_icmpge 139
      // 045: aload 0
      // 046: iload 2
      // 047: invokevirtual java/lang/String.charAt (I)C
      // 04a: iload 1
      // 04b: ifne 13a
      // 04e: istore 3
      // 04f: iload 3
      // 050: iload 1
      // 051: ifne 094
      // 054: ldc_w -107425915
      // 057: iload 5
      // 059: ldc_w 1719746660
      // 05c: ixor
      // 05d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 060: ldc2_w 8959249493478076178
      // 063: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 066: if_icmplt 08f
      // 069: goto 06d
      // 06c: athrow
      // 06d: iload 3
      // 06e: iload 1
      // 06f: ifne 11c
      // 072: goto 076
      // 075: athrow
      // 076: ldc_w -107425910
      // 079: iload 5
      // 07b: ldc_w 1218170494
      // 07e: ixor
      // 07f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 082: ldc2_w 7968204601294684252
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 088: if_icmple 117
      // 08b: goto 08f
      // 08e: athrow
      // 08f: iload 3
      // 090: goto 094
      // 093: athrow
      // 094: iload 1
      // 095: ifne 0d8
      // 098: ldc_w -107425909
      // 09b: iload 5
      // 09d: ldc_w 944955927
      // 0a0: ixor
      // 0a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 0a4: ldc2_w 407095080179424484
      // 0a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 0aa: if_icmplt 0d3
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: iload 3
      // 0b2: iload 1
      // 0b3: ifne 11c
      // 0b6: goto 0ba
      // 0b9: athrow
      // 0ba: ldc_w -107425912
      // 0bd: iload 5
      // 0bf: ldc_w -599241338
      // 0c2: ixor
      // 0c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 0c6: ldc2_w 5915086558890445265
      // 0c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 0cc: if_icmple 117
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: iload 3
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: iload 1
      // 0d9: ifne 0fa
      // 0dc: ldc_w -107425911
      // 0df: iload 5
      // 0e1: ldc_w 2064258113
      // 0e4: ixor
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 0e8: ldc2_w 5173884563929502027
      // 0eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 0ee: if_icmplt 11f
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: iload 3
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: iload 1
      // 0fb: ifne 11c
      // 0fe: ldc_w -107425906
      // 101: iload 5
      // 103: ldc_w 168971212
      // 106: ixor
      // 107: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 10a: ldc2_w 6970479752765400003
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 110: if_icmpgt 11f
      // 113: goto 117
      // 116: athrow
      // 117: bipush 1
      // 118: goto 11c
      // 11b: athrow
      // 11c: goto 120
      // 11f: bipush 0
      // 120: istore 4
      // 122: iload 1
      // 123: ifne 135
      // 126: iload 4
      // 128: ifne 132
      // 12b: goto 12f
      // 12e: athrow
      // 12f: bipush 0
      // 130: ireturn
      // 131: athrow
      // 132: iinc 2 1
      // 135: iload 1
      // 136: ifeq 02f
      // 139: bipush 1
      // 13a: ireturn
   }

   public static class_2561 b(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1629380650
      // 003: istore 10
      // 005: invokestatic net/minecraft/class_2561.method_43473 ()Lnet/minecraft/class_5250;
      // 008: astore 2
      // 009: new java/lang/StringBuilder
      // 00c: dup
      // 00d: invokespecial java/lang/StringBuilder.<init> ()V
      // 010: astore 3
      // 011: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 014: getstatic net/minecraft/class_2583.field_24360 Lnet/minecraft/class_2583;
      // 017: astore 4
      // 019: istore 1
      // 01a: bipush 0
      // 01b: istore 5
      // 01d: iload 5
      // 01f: aload 0
      // 020: invokevirtual java/lang/String.length ()I
      // 023: if_icmpge 1d1
      // 026: aload 0
      // 027: iload 5
      // 029: invokevirtual java/lang/String.charAt (I)C
      // 02c: iload 1
      // 02d: ifne 1d5
      // 030: istore 6
      // 032: iload 1
      // 033: ifne 1cd
      // 036: iload 6
      // 038: ldc_w -107425905
      // 03b: iload 10
      // 03d: ldc_w 152427399
      // 040: ixor
      // 041: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 044: ldc2_w 3266837980804721423
      // 047: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 04a: if_icmpne 1c3
      // 04d: goto 051
      // 050: athrow
      // 051: iload 5
      // 053: iload 1
      // 054: ifne 070
      // 057: goto 05b
      // 05a: athrow
      // 05b: bipush 1
      // 05c: iadd
      // 05d: aload 0
      // 05e: invokevirtual java/lang/String.length ()I
      // 061: if_icmpge 1c3
      // 064: goto 068
      // 067: athrow
      // 068: aload 3
      // 069: invokevirtual java/lang/StringBuilder.isEmpty ()Z
      // 06c: goto 070
      // 06f: athrow
      // 070: iload 1
      // 071: ifne 09d
      // 074: ifne 095
      // 077: goto 07b
      // 07a: athrow
      // 07b: aload 2
      // 07c: aload 3
      // 07d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 080: invokestatic net/minecraft/class_2561.method_43470 (Ljava/lang/String;)Lnet/minecraft/class_5250;
      // 083: aload 4
      // 085: invokevirtual net/minecraft/class_5250.method_10862 (Lnet/minecraft/class_2583;)Lnet/minecraft/class_5250;
      // 088: invokevirtual net/minecraft/class_5250.method_10852 (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
      // 08b: pop
      // 08c: aload 3
      // 08d: bipush 0
      // 08e: invokevirtual java/lang/StringBuilder.setLength (I)V
      // 091: goto 095
      // 094: athrow
      // 095: aload 0
      // 096: iload 5
      // 098: bipush 1
      // 099: iadd
      // 09a: invokevirtual java/lang/String.charAt (I)C
      // 09d: dup
      // 09e: istore 8
      // 0a0: iload 1
      // 0a1: ifne 141
      // 0a4: ldc_w -107425908
      // 0a7: iload 10
      // 0a9: ldc_w 70913151
      // 0ac: ixor
      // 0ad: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 0b0: ldc2_w 3624315009325128190
      // 0b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 0b6: if_icmpne 13f
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: iload 5
      // 0bf: iload 1
      // 0c0: ifne 141
      // 0c3: goto 0c7
      // 0c6: athrow
      // 0c7: ldc_w -107425907
      // 0ca: iload 10
      // 0cc: ldc_w -128748051
      // 0cf: ixor
      // 0d0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 0d3: ldc2_w 6692273784619036202
      // 0d6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 0d9: iadd
      // 0da: aload 0
      // 0db: invokevirtual java/lang/String.length ()I
      // 0de: if_icmpge 13f
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: iload 5
      // 0e8: bipush 2
      // 0e9: iadd
      // 0ea: iload 5
      // 0ec: ldc_w -107425870
      // 0ef: iload 10
      // 0f1: ldc_w 528944588
      // 0f4: ixor
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 0f8: ldc2_w 3238221465645517222
      // 0fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 0fe: iadd
      // 0ff: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 102: dup
      // 103: astore 7
      // 105: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.bb (Ljava/lang/String;)Z
      // 108: iload 1
      // 109: ifne 141
      // 10c: ifeq 13f
      // 10f: goto 113
      // 112: athrow
      // 113: aload 7
      // 115: ldc_w -107425869
      // 118: iload 10
      // 11a: ldc_w -4754944
      // 11d: ixor
      // 11e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.a (II)I
      // 121: ldc2_w 1776625710109848512
      // 124: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ab (IJ)I
      // 127: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 12a: istore 9
      // 12c: iload 1
      // 12d: aload 4
      // 12f: iload 9
      // 131: invokestatic net/minecraft/class_5251.method_27717 (I)Lnet/minecraft/class_5251;
      // 134: invokevirtual net/minecraft/class_2583.method_27703 (Lnet/minecraft/class_5251;)Lnet/minecraft/class_2583;
      // 137: astore 4
      // 139: iinc 5 8
      // 13c: ifeq 01d
      // 13f: iload 8
      // 141: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.ba (C)Lnet/minecraft/class_124;
      // 144: astore 9
      // 146: iload 1
      // 147: ifne 1cd
      // 14a: aload 9
      // 14c: ifnull 1c3
      // 14f: goto 153
      // 152: athrow
      // 153: aload 9
      // 155: iload 1
      // 156: ifne 176
      // 159: goto 15d
      // 15c: athrow
      // 15d: getstatic net/minecraft/class_124.field_1070 Lnet/minecraft/class_124;
      // 160: if_acmpne 170
      // 163: goto 167
      // 166: athrow
      // 167: getstatic net/minecraft/class_2583.field_24360 Lnet/minecraft/class_2583;
      // 16a: astore 4
      // 16c: iload 1
      // 16d: ifeq 1bc
      // 170: aload 9
      // 172: goto 176
      // 175: athrow
      // 176: invokevirtual net/minecraft/class_124.method_543 ()Z
      // 179: ifeq 1b3
      // 17c: aload 4
      // 17e: aload 9
      // 180: invokestatic net/minecraft/class_5251.method_27718 (Lnet/minecraft/class_124;)Lnet/minecraft/class_5251;
      // 183: invokevirtual net/minecraft/class_2583.method_27703 (Lnet/minecraft/class_5251;)Lnet/minecraft/class_2583;
      // 186: astore 4
      // 188: iload 1
      // 189: aload 4
      // 18b: bipush 0
      // 18c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 18f: invokevirtual net/minecraft/class_2583.method_10982 (Ljava/lang/Boolean;)Lnet/minecraft/class_2583;
      // 192: bipush 0
      // 193: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 196: invokevirtual net/minecraft/class_2583.method_10978 (Ljava/lang/Boolean;)Lnet/minecraft/class_2583;
      // 199: bipush 0
      // 19a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 19d: invokevirtual net/minecraft/class_2583.method_30938 (Ljava/lang/Boolean;)Lnet/minecraft/class_2583;
      // 1a0: bipush 0
      // 1a1: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1a4: invokevirtual net/minecraft/class_2583.method_36140 (Ljava/lang/Boolean;)Lnet/minecraft/class_2583;
      // 1a7: bipush 0
      // 1a8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 1ab: invokevirtual net/minecraft/class_2583.method_36141 (Ljava/lang/Boolean;)Lnet/minecraft/class_2583;
      // 1ae: astore 4
      // 1b0: ifeq 1bc
      // 1b3: aload 4
      // 1b5: aload 9
      // 1b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbaab.aa (Lnet/minecraft/class_2583;Lnet/minecraft/class_124;)Lnet/minecraft/class_2583;
      // 1ba: astore 4
      // 1bc: iinc 5 2
      // 1bf: iload 1
      // 1c0: ifeq 01d
      // 1c3: aload 3
      // 1c4: iload 6
      // 1c6: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1c9: pop
      // 1ca: iinc 5 1
      // 1cd: iload 1
      // 1ce: ifeq 01d
      // 1d1: aload 3
      // 1d2: invokevirtual java/lang/StringBuilder.isEmpty ()Z
      // 1d5: ifne 1ed
      // 1d8: aload 2
      // 1d9: aload 3
      // 1da: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1dd: invokestatic net/minecraft/class_2561.method_43470 (Ljava/lang/String;)Lnet/minecraft/class_5250;
      // 1e0: aload 4
      // 1e2: invokevirtual net/minecraft/class_5250.method_10862 (Lnet/minecraft/class_2583;)Lnet/minecraft/class_5250;
      // 1e5: invokevirtual net/minecraft/class_5250.method_10852 (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
      // 1e8: pop
      // 1e9: goto 1ed
      // 1ec: athrow
      // 1ed: aload 2
      // 1ee: areturn
   }
}
