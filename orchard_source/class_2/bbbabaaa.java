package nsc;

import com.sun.jna.platform.win32.BaseTSD.ULONG_PTR;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.LONG;
import com.sun.jna.platform.win32.WinUser.INPUT;
import com.sun.jna.platform.win32.WinUser.MOUSEINPUT;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class bbbabaaa {
   private static final Integer[] aa;
   private static final Object[] aaba;
   private static final boolean ab;
   private static final int ba;
   private static final int bb;
   private static final int aaa;
   private static final String[] aaab;
   private static final int b;
   private static final int aab;
   private static final int aba = 1;
   private static final int abb;
   private static final int baa = 0;
   private static final int bab;
   private static final long[] bba;
   private static final int[] aaaa;
   private static final int bbb;
   private static final int a;

   private static void aa(INPUT param0, ababaaba param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: ldc -1761206945
      // 05: ldc 875936543
      // 07: ldc 130096292
      // 09: ixor
      // 0a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 0d: ldc2_w 39953230275709575
      // 10: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 13: istore 4
      // 15: istore 3
      // 16: aload 1
      // 17: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaba.b ()Z
      // 1a: iload 3
      // 1b: ifne 2c
      // 1e: ifeq 2b
      // 21: goto 25
      // 24: athrow
      // 25: iload 4
      // 27: bipush 1
      // 28: ior
      // 29: istore 4
      // 2b: iload 2
      // 2c: iload 3
      // 2d: ifne 3f
      // 30: ifeq 41
      // 33: goto 37
      // 36: athrow
      // 37: iload 4
      // 39: bipush 2
      // 3a: ior
      // 3b: goto 3f
      // 3e: athrow
      // 3f: istore 4
      // 41: aload 0
      // 42: new com/sun/jna/platform/win32/WinDef$DWORD
      // 45: dup
      // 46: lconst_1
      // 47: invokespecial com/sun/jna/platform/win32/WinDef$DWORD.<init> (J)V
      // 4a: putfield com/sun/jna/platform/win32/WinUser$INPUT.type Lcom/sun/jna/platform/win32/WinDef$DWORD;
      // 4d: aload 0
      // 4e: getfield com/sun/jna/platform/win32/WinUser$INPUT.input Lcom/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION;
      // 51: ldc com/sun/jna/platform/win32/WinUser$KEYBDINPUT
      // 53: invokevirtual com/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION.setType (Ljava/lang/Class;)V
      // 56: aload 0
      // 57: getfield com/sun/jna/platform/win32/WinUser$INPUT.input Lcom/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION;
      // 5a: new com/sun/jna/platform/win32/WinUser$KEYBDINPUT
      // 5d: dup
      // 5e: invokespecial com/sun/jna/platform/win32/WinUser$KEYBDINPUT.<init> ()V
      // 61: putfield com/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION.ki Lcom/sun/jna/platform/win32/WinUser$KEYBDINPUT;
      // 64: aload 0
      // 65: getfield com/sun/jna/platform/win32/WinUser$INPUT.input Lcom/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION;
      // 68: getfield com/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION.ki Lcom/sun/jna/platform/win32/WinUser$KEYBDINPUT;
      // 6b: new com/sun/jna/platform/win32/WinDef$WORD
      // 6e: dup
      // 6f: lconst_0
      // 70: invokespecial com/sun/jna/platform/win32/WinDef$WORD.<init> (J)V
      // 73: putfield com/sun/jna/platform/win32/WinUser$KEYBDINPUT.wVk Lcom/sun/jna/platform/win32/WinDef$WORD;
      // 76: aload 0
      // 77: getfield com/sun/jna/platform/win32/WinUser$INPUT.input Lcom/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION;
      // 7a: getfield com/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION.ki Lcom/sun/jna/platform/win32/WinUser$KEYBDINPUT;
      // 7d: new com/sun/jna/platform/win32/WinDef$WORD
      // 80: dup
      // 81: aload 1
      // 82: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaba.a ()I
      // 85: i2l
      // 86: invokespecial com/sun/jna/platform/win32/WinDef$WORD.<init> (J)V
      // 89: putfield com/sun/jna/platform/win32/WinUser$KEYBDINPUT.wScan Lcom/sun/jna/platform/win32/WinDef$WORD;
      // 8c: aload 0
      // 8d: getfield com/sun/jna/platform/win32/WinUser$INPUT.input Lcom/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION;
      // 90: getfield com/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION.ki Lcom/sun/jna/platform/win32/WinUser$KEYBDINPUT;
      // 93: new com/sun/jna/platform/win32/WinDef$DWORD
      // 96: dup
      // 97: iload 4
      // 99: i2l
      // 9a: invokespecial com/sun/jna/platform/win32/WinDef$DWORD.<init> (J)V
      // 9d: putfield com/sun/jna/platform/win32/WinUser$KEYBDINPUT.dwFlags Lcom/sun/jna/platform/win32/WinDef$DWORD;
      // a0: aload 0
      // a1: getfield com/sun/jna/platform/win32/WinUser$INPUT.input Lcom/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION;
      // a4: getfield com/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION.ki Lcom/sun/jna/platform/win32/WinUser$KEYBDINPUT;
      // a7: new com/sun/jna/platform/win32/WinDef$DWORD
      // aa: dup
      // ab: lconst_0
      // ac: invokespecial com/sun/jna/platform/win32/WinDef$DWORD.<init> (J)V
      // af: putfield com/sun/jna/platform/win32/WinUser$KEYBDINPUT.time Lcom/sun/jna/platform/win32/WinDef$DWORD;
      // b2: aload 0
      // b3: getfield com/sun/jna/platform/win32/WinUser$INPUT.input Lcom/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION;
      // b6: getfield com/sun/jna/platform/win32/WinUser$INPUT$INPUT_UNION.ki Lcom/sun/jna/platform/win32/WinUser$KEYBDINPUT;
      // b9: new com/sun/jna/platform/win32/BaseTSD$ULONG_PTR
      // bc: dup
      // bd: lconst_0
      // be: invokespecial com/sun/jna/platform/win32/BaseTSD$ULONG_PTR.<init> (J)V
      // c1: putfield com/sun/jna/platform/win32/WinUser$KEYBDINPUT.dwExtraInfo Lcom/sun/jna/platform/win32/BaseTSD$ULONG_PTR;
      // c4: aload 0
      // c5: invokevirtual com/sun/jna/platform/win32/WinUser$INPUT.write ()V
      // c8: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var26 = 1595707254;
      String var16 = "䑎䑛䑘䒵䑓䐞䑭䓗䐛䐕䓸䑵䑲䒑䑔䑥䒸䑒䒵䑛䓑䒏䓊䐋䑖釾醏酧釜酰釥醚鄤酓醧酃醯酲醎鄂醠釲釰鄉醡鄁醫酟醐釡釚釉鄭醠釾醏酀鄏鄡酂鄄釮鄗鄋酻鄾酘醾鄳釠鄆醹酑醒醫酛醞醝醧醽釻酯鄆酦釁釥酋鄣酸鄙醻酢鄎醟醢鄃釳釳釣酞醓釃酢鄐醉醹醇酌醘釠酪醦鄽酸酼釢釚酚酧釁酚酾釋釨鄕鄕量酦酂酘鄂醼釾里酒醵釙鄨醟鄷酚醭釿鄚醃醂鄺醔醷鄵鄋醧鄯鄢醥醏鄰酏釮酦酦鄤醧酘醄醅鄗里釄采酝醋醻鄥醬鄡釭醄醷鄹酊醛酫醹酔鄮酈鄘釺鄶鄨鄡鄒酯采酟鄸酕醯酌醖鄇酄酮酱釄鄙酮鄆醯酲鄼鄮釮釕酶鄯鄚酱鄢釛釋釅鄘醽釤鄯酝釬醵醐鄈釋鄾釠酾醏酆醧鄕酘鄈酾醳釯釟醗醋鄷醬鄫醝釘醵醃重釡醧醕鄿鄈酞酸鄣醈鄑醤鄊醍酙酽釁鄛鄬酜鄧醭釢酨鄗醑鄣酟醡鄨鄐鄥鄙醊醠鄐鄉酜醓醆鄃釫鄷酤釕酦释鄊鄈鄘鄏鄭釹釺酣酝鄲醫配釲配釻鄾醅醍醎釬醊鄺醓釵酩酓酊酻鄂釷酎酓鄓酎醵酪醔醬鄄釤醅配醉酞鄽醳醮釫醸酳酜野醫醴酦鄬醨酓鄏鄖醩醵鄷醗醙醋釷醮釙酀醙醵鄪金酿酅酗酿酑醄酎鄢醰酣酏釘釆醲鄫醜鄏釅醻醍釸釨酴酙鄙释釡鄒鄋酇鄐醿鄣鄧酼酠酈配鄔酣酥釘酕鄠醟鄪釅醰醍釗酇鄷鄵釂鄕酭釫醟鄱釽酳野釙鄫醒釮酣鄜醣酓鄁酟酷酒鄭釬鄇釸酲醩鄟酸酿醎鄃醽酃醪鄐酩鄕醥鄹醸鄃鄦釐釰鄯鄙醰醡酹鄝酁釖酲酪酱酊醫鄊鄓酣醌鄕酞鄋酫酖釗醷醸醒釈酥釤酪酃醃重釸針酟醌釾釢醷醒釔酆酙醱鄮醖鄘鄊釘鄨釷釷醻鄸鄇鄙釵醸酯醭釫酨酊酘醷酈醞醅鄂醄酹鄿醗釃醢酣釺酫酹鄦醬鄭釹酲醘酚釖釠醨金酲醯醟鄉鄤醖醮釨酲酨鄋鄍鄈酵釾釨酲酱釃釀釴酏醫醇酾酄釱醏量醕鄰酰酎醫釾酀金醑醗酅釓鄪鄝酝엷얯엳씅엻얓염씱얆엔\uf010\uf022\uf01c\uf032\uf09c\uf02d\uf012\uf010\uf0a9\uf0f6\uf093\uf051\uf046\uf044\uf0cd\uf0a0㭮㬶㭪㮜㭢㬊㭥㮨㬟㭍";
      short var15 = 6387;
      char[] var17 = "ᣪ᪻\u18f9ᣣ\u18f9".toCharArray();
      String[] var10000 = new String[var17.length];
      byte var22 = -1;
      String[] var18 = var10000;

      while (true) {
         int var19 = 0;
         int var20 = 0;
         int var21 = 0;
         if (var22 == 0) {
            aaab = var18;
            aaba = new Object[var18.length];
            byte var31 = 0;
            int var10001 = 0;
            aaaa = new int[107];
            byte[] var10002 = "\u0011Q¿LøFëÜ\u001d\u0080(?ÇfÑäÎßJz%s\u0095Í·ô\u00125GÒ}\u008f\u0089åÓå\u009a\u0084k©BÀP«\u008e¢{Ô\u008ca5Tcô\u000f\u0011òxfØím\u0002'hÕ{\u0007ìN!!ÿ\u001fS\u0019ôr;\u0091h\u001b½²\u0086¾3\u0091*Æïþù^\u0083I9?2x\u0012\u0094\u0005\u0082Wùa¶>mU\u001c9\u000bË\u0019\u0006\u001b\u0015wa¯\u0017°\u000e÷\fJ\b\u0003ùP¾¯ö¥\u0092ÊrÚ,\u009f\u0095³\u0080\u008f¬ï\u0089,¢\u0098°\u008cÌÜóY\u0002àK\u0012\u001a¢§!]ø\u0085?ï9«r\u009bV\u0000\u001d`?¢_\u00843ç·ð\u0084\u0093¶\n\u0001\u0084a@1^ªØÏ7yÇù!=\u0012É\u008bÙªVÀ\u0000pÌu\u007f\u0087{FEP\u0017¾\u000eE¦ß\u0016/\f§\u0096i|Ýt\u009eî\u009b¥Ì7L\u008aÆ*þan×Ø\u0016sÊ@\u001e `û\u0017ÂÚCÁ|Ý\u0080H*Ó¯ûãÒáßEºÞ\u008ai³4ÂXà÷\u001fï\u0014ìÔ\u0004Ås¦Çç¹9zM»\u008e\u008fÙTBV)\u0084ºóHÝ\u008fWâS¹h\u0082Mû\u0002ðë\u0013¯Öýn«ä\u008euY$¡GfUéc«5\u001dåï\u008bÜ\u0002¯É5\u0005\t\u007f\u009e1\u008c©ÓÍ± 5\u0000aßó\u0084Zül\u0012+¤jÊt¶Y=\u001cù«~pa\u0093µòÏëE«uú|\u009dükß\u0086]ë\u009d\u0084ö'?^«äHó\u000b\u008d±(aÝ«5Z"
               .getBytes("ISO-8859-1");

            int var73;
            do {
               aaaa[var31] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1247558921;
               var31 += 1;
               var73 = var10001 + 4;
               var10001 += 4;
            } while (var73 < var10002.length);

            String[] var8 = new String[2];
            int var12 = 0;
            String var11;
            int var13 = (var11 = bbb(151418926, var26 ^ -886641418)).length();
            int var10 = a(-1761207014, var26 ^ -1670995118);
            int var9 = -1;

            while (true) {
               label106: {
                  char[] var37 = var11.substring(++var9, var9 + var10).toCharArray();
                  var73 = var37.length;
                  int var14 = 0;
                  var57 = var37;
                  var10001 = var73;
                  char[] var77;
                  int var93;
                  if (var73 <= 1) {
                     var77 = var37;
                     var93 = var14;
                  } else {
                     var57 = var37;
                     var10001 = var73;
                     if (var73 <= var14) {
                        break label106;
                     }

                     var77 = var37;
                     var93 = var14;
                  }

                  while (true) {
                     var77[var93] = (char)(var77[var93] ^ switch (var14 % a(-1761207015, var26 ^ -1556902051)) {
                        case 0 -> a(-1761207016, var26 ^ 1232845012);
                        case 1 -> a(-1761207017, var26 ^ -1968830182);
                        case 2 -> a(-1761207018, var26 ^ -1855069050);
                        case 3 -> a(-1761207019, var26 ^ 236921092);
                        case 4 -> a(-1761207020, var26 ^ -998204246);
                        case 5 -> a(-1761207021, var26 ^ -969447118);
                        default -> a(-1761207022, var26 ^ 704360510);
                     });
                     var14++;
                     if (var10001 == 0) {
                        var93 = var10001;
                        var77 = var57;
                     } else {
                        if (var10001 <= var14) {
                           break;
                        }

                        var77 = var57;
                        var93 = var14;
                     }
                  }
               }

               String var84 = new String(var57).intern();
               int var44 = -1;
               var8[var12++] = var84;
               if ((var9 += var10) >= var13) {
                  long var0 = 1442980043176824567L;
                  long[] var6 = new long[a(-1761207023, var26 ^ -117238934)];
                  int var3 = 0;
                  String var4;
                  int var5 = (var4 = bbb(151418927, var26 ^ 511877073)).length();
                  byte var2 = 0;

                  label90:
                  while (true) {
                     var44 = var2;
                     var2 += 8;
                     String var32 = var4.substring(var44, var2);
                     var44 = 151418924;
                     int var62 = var26 ^ 1257871801;
                     byte[] var7 = var32.getBytes("ISO-8859-1");
                     long[] var33 = var6;
                     var44 = var3++;
                     long var63 = (var7[0] & 255L) << a(-1761207024, var26 ^ -1607026732)
                        | (var7[1] & 255L) << a(-1761207025, var26 ^ 771788435)
                        | (var7[2] & 255L) << a(-1761207026, var26 ^ 809690344)
                        | (var7[3] & 255L) << a(-1761207027, var26 ^ -1767224875)
                        | (var7[4] & 255L) << a(-1761207028, var26 ^ -2133373458)
                        | (var7[5] & 255L) << a(-1761207029, var26 ^ -204685359)
                        | (var7[a(-1761207030, var26 ^ -587300697)] & 255L) << a(-1761207031, var26 ^ -1797632566)
                        | var7[a(-1761207032, var26 ^ 1616644468)] & 255L;
                     byte var85 = -1;

                     while (true) {
                        long var95 = var63 ^ var0;
                        switch (var85) {
                           case 0:
                              var33[var44] = var95;
                              if (var2 >= var5) {
                                 bba = var6;
                                 aa = new Integer[a(-1761206978, var26 ^ -691564436)];
                                 b = abb(a(-1761206979, var26 ^ -301138867), 4340542306585342975L);
                                 aab = abb(a(-1761206980, var26 ^ -1761834875), 2454916791661676199L);
                                 bab = abb(a(-1761206981, var26 ^ -2017094428), 5627790564143431539L);
                                 ba = abb(a(-1761206982, var26 ^ 375828659), 6408229922658970515L);
                                 aaa = abb(a(-1761206983, var26 ^ -1775985638), 4001464115995471252L);
                                 a = abb(a(-1761206984, var26 ^ 1518775710), 6848442947340187512L);
                                 abb = abb(a(-1761206985, var26 ^ -1712252715), 2202387523645611893L);
                                 bbb = abb(a(-1761206986, var26 ^ -267908197), 2454916791661676199L);
                                 bb = abb(a(-1761206987, var26 ^ -1609381717), 4422072727755391117L);
                                 ab = System.getProperty(aabbaaaba.abba(var8[1]), "")
                                    .toLowerCase()
                                    .contains(aabbaaaba.abba(var8[0]));
                                 return;
                              }
                              break;
                           default:
                              var33[var44] = var95;
                              if (var2 < var5) {
                                 continue label90;
                              }

                              var5 = (var4 = bbb(151418925, var26 ^ 2136077688)).length();
                              var2 = 0;
                        }

                        int var48 = var2;
                        var2 += 8;
                        String var34 = var4.substring(var48, var2);
                        var48 = 151418922;
                        int var65 = var26 ^ -1268728206;
                        var7 = var34.getBytes("ISO-8859-1");
                        var33 = var6;
                        var44 = var3++;
                        var63 = (var7[0] & 255L) << a(-1761207033, var26 ^ -1581559832)
                           | (var7[1] & 255L) << a(-1761207034, var26 ^ 1220341607)
                           | (var7[2] & 255L) << a(-1761207035, var26 ^ -477599046)
                           | (var7[3] & 255L) << a(-1761207036, var26 ^ -1368107094)
                           | (var7[4] & 255L) << a(-1761207037, var26 ^ 1220118490)
                           | (var7[5] & 255L) << a(-1761207038, var26 ^ -1908556800)
                           | (var7[a(-1761207039, var26 ^ 296471901)] & 255L) << a(-1761207040, var26 ^ 393450048)
                           | var7[a(-1761206977, var26 ^ 612694577)] & 255L;
                        var85 = 0;
                     }
                  }
               }

               var10 = var11.charAt(var9);
            }
         }

         do {
            var21 = var17[var19] ^ var15;
            char[] var23 = var16.substring(var20, var20 + var21).toCharArray();
            int var24 = 0;

            do {
               short var25 = switch (var24 % 5) {
                  default -> 201;
                  case 1 -> 41;
                  case 2 -> 59;
                  case 3 -> 61;
                  case 4 -> 149;
               };
               var23[var24] = (char)(var23[var24] ^ var25);
            } while (++var24 < var23.length);

            var18[var19] = new String(var23).intern();
            var20 += var21;
         } while (++var19 < var17.length);

         var22 = 0;
      }
   }

   private static boolean ab(int var0) {
      int var1 = aabbabbab.ab;

      try {
         if (var1 != 0) {
            return (boolean)var0;
         }

         switch (var0) {
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
            case 265:
            case 266:
            case 267:
            case 268:
            case 269:
            case 282:
            case 283:
            case 331:
            case 335:
            case 343:
            case 345:
            case 346:
            case 347:
            case 348:
               return (boolean)1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return (boolean)0;
   }

   private static String bbb(int var0, int var1) {
      int var3 = var0 ^ 151418926;
      char[] var4 = aaab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aaba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 2115166912;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 137;
            case 1 -> 43;
            case 2 -> 121;
            case 3 -> 235;
            case 4 -> 168;
            case 5 -> 156;
            case 6 -> 30;
            case 7 -> 205;
            case 8 -> 104;
            case 9 -> 142;
            case 10 -> 95;
            case 11 -> 12;
            case 12 -> 100;
            case 13 -> 163;
            case 14 -> 182;
            case 15 -> 136;
            case 16 -> 255;
            case 17 -> 18;
            case 18 -> 229;
            case 19 -> 206;
            case 20 -> 53;
            case 21 -> 231;
            case 22 -> 136;
            case 23 -> 89;
            case 24 -> 134;
            case 25 -> 214;
            case 26 -> 137;
            case 27 -> 240;
            case 28 -> 76;
            case 29 -> 249;
            case 30 -> 207;
            case 31 -> 233;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private bbbabaaa() {
   }

   private static baabbbab ba(int var0) {
      int var1 = 529374252;

      try {
         switch (var0) {
            case 0:
               return new baabbbab(2, 4, 0);
            case 1:
               return new baabbbab(
                  abb(a(-1761206946, var1 ^ -982592169), 6020864093281800430L), abb(a(-1761206947, var1 ^ 547940178), 9001636946907406527L), 0
               );
            case 2:
               return new baabbbab(
                  abb(a(-1761206948, var1 ^ -95547801), 7845377502221021653L), abb(a(-1761206949, var1 ^ -201874860), 8948972035945070922L), 0
               );
            case 3:
               return new baabbbab(
                  abb(a(-1761206950, var1 ^ 408663155), 8183956844803127176L), abb(a(-1761206951, var1 ^ -1965284283), 1506720767173245888L), 1
               );
            case 4:
               return new baabbbab(
                  abb(a(-1761206952, var1 ^ 2063227525), 1654451478484478510L), abb(a(-1761206953, var1 ^ -1261571574), 7930943974688913318L), 2
               );
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return null;
   }

   public static boolean bb(class_310 param0, class_306 param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.ab Z
      // 08: iload 4
      // 0a: ifne 53
      // 0d: ifeq 52
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: ifnull 52
      // 18: goto 1c
      // 1b: athrow
      // 1c: iload 2
      // 1d: iload 4
      // 1f: ifne 46
      // 22: goto 26
      // 25: athrow
      // 26: ifne 3e
      // 29: goto 2d
      // 2c: athrow
      // 2d: iload 3
      // 2e: iload 4
      // 30: ifne 46
      // 33: goto 37
      // 36: athrow
      // 37: ifne 54
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 0
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.baa (Lnet/minecraft/class_310;)Z
      // 42: goto 46
      // 45: athrow
      // 46: iload 4
      // 48: ifne 53
      // 4b: ifne 54
      // 4e: goto 52
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
      // 54: aload 1
      // 55: iload 4
      // 57: ifne 9f
      // 5a: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 5d: getstatic net/minecraft/class_3675$class_307.field_1672 Lnet/minecraft/class_3675$class_307;
      // 60: if_acmpne 9e
      // 63: goto 67
      // 66: athrow
      // 67: aload 1
      // 68: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 6b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.ba (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbab;
      // 6e: astore 5
      // 70: aload 5
      // 72: ifnonnull 77
      // 75: bipush 0
      // 76: ireturn
      // 77: iload 2
      // 78: iload 4
      // 7a: ifne 8d
      // 7d: ifeq 90
      // 80: goto 84
      // 83: athrow
      // 84: aload 5
      // 86: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbab.a ()I
      // 89: goto 8d
      // 8c: athrow
      // 8d: goto 95
      // 90: aload 5
      // 92: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbab.aa ()I
      // 95: aload 5
      // 97: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbab.b ()I
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.bba (II)Z
      // 9d: ireturn
      // 9e: aload 1
      // 9f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.aab (Lnet/minecraft/class_3675$class_306;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaba;
      // a2: astore 5
      // a4: aload 5
      // a6: iload 4
      // a8: ifne b4
      // ab: ifnull d9
      // ae: goto b2
      // b1: athrow
      // b2: aload 5
      // b4: iload 2
      // b5: iload 4
      // b7: ifne c2
      // ba: ifne c5
      // bd: goto c1
      // c0: athrow
      // c1: bipush 1
      // c2: goto c6
      // c5: bipush 0
      // c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaba;Z)Z
      // c9: iload 4
      // cb: ifne d6
      // ce: ifeq d9
      // d1: goto d5
      // d4: athrow
      // d5: bipush 1
      // d6: goto da
      // d9: bipush 0
      // da: ireturn
      // db: astore 5
      // dd: bipush 0
      // de: ireturn
   }

   private static int aaa(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -2110433739
      // 003: istore 2
      // 004: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 007: istore 1
      // 008: iload 0
      // 009: iload 1
      // 00a: ifne 04b
      // 00d: ldc_w -1761206954
      // 010: iload 2
      // 011: ldc_w 974433312
      // 014: ixor
      // 015: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 018: ldc2_w 3671343983183619031
      // 01b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 01e: if_icmplt 046
      // 021: goto 025
      // 024: athrow
      // 025: iload 0
      // 026: iload 1
      // 027: ifne 08d
      // 02a: goto 02e
      // 02d: athrow
      // 02e: ldc_w -1761206955
      // 031: iload 2
      // 032: ldc_w -498028059
      // 035: ixor
      // 036: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 039: ldc2_w 2339673208150150164
      // 03c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 03f: if_icmple 088
      // 042: goto 046
      // 045: athrow
      // 046: iload 0
      // 047: goto 04b
      // 04a: athrow
      // 04b: iload 1
      // 04c: ifne 08f
      // 04f: ldc_w -1761206956
      // 052: iload 2
      // 053: ldc_w 775062357
      // 056: ixor
      // 057: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 05a: ldc2_w 1100060416776389878
      // 05d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 060: if_icmplt 08e
      // 063: goto 067
      // 066: athrow
      // 067: iload 0
      // 068: iload 1
      // 069: ifne 08f
      // 06c: goto 070
      // 06f: athrow
      // 070: ldc_w -1761206957
      // 073: iload 2
      // 074: ldc_w 754046132
      // 077: ixor
      // 078: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 07b: ldc2_w 4626206336809029026
      // 07e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 081: if_icmpgt 08e
      // 084: goto 088
      // 087: athrow
      // 088: iload 0
      // 089: goto 08d
      // 08c: athrow
      // 08d: ireturn
      // 08e: iload 0
      // 08f: iload 1
      // 090: ifne 0f4
      // 093: ldc_w -1761206958
      // 096: iload 2
      // 097: ldc_w -1016799883
      // 09a: ixor
      // 09b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 09e: ldc2_w 2742676491494027712
      // 0a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 0a4: if_icmplt 0f3
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: iload 0
      // 0ac: iload 1
      // 0ad: ifne 0f4
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: ldc_w -1761206959
      // 0b7: iload 2
      // 0b8: ldc_w 1390953017
      // 0bb: ixor
      // 0bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 0bf: ldc2_w 7873961483257020768
      // 0c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 0c5: if_icmpgt 0f3
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: ldc_w -1761206960
      // 0cf: iload 2
      // 0d0: ldc_w 1308438586
      // 0d3: ixor
      // 0d4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 0d7: ldc2_w 7853622720450273147
      // 0da: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 0dd: iload 0
      // 0de: iadd
      // 0df: ldc_w -1761206961
      // 0e2: iload 2
      // 0e3: ldc_w -934966323
      // 0e6: ixor
      // 0e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 0ea: ldc2_w 4555980377246719156
      // 0ed: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 0f0: isub
      // 0f1: ireturn
      // 0f2: athrow
      // 0f3: iload 0
      // 0f4: iload 1
      // 0f5: ifne 159
      // 0f8: ldc_w -1761206962
      // 0fb: iload 2
      // 0fc: ldc_w 1289673789
      // 0ff: ixor
      // 100: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 103: ldc2_w 3049152640135707260
      // 106: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 109: if_icmplt 158
      // 10c: goto 110
      // 10f: athrow
      // 110: iload 0
      // 111: iload 1
      // 112: ifne 159
      // 115: goto 119
      // 118: athrow
      // 119: ldc_w -1761206963
      // 11c: iload 2
      // 11d: ldc_w 1603214128
      // 120: ixor
      // 121: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 124: ldc2_w 1650877111769634649
      // 127: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 12a: if_icmpgt 158
      // 12d: goto 131
      // 130: athrow
      // 131: ldc_w -1761206964
      // 134: iload 2
      // 135: ldc_w 1424106136
      // 138: ixor
      // 139: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 13c: ldc2_w 7060583214414440048
      // 13f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 142: iload 0
      // 143: iadd
      // 144: ldc_w -1761206965
      // 147: iload 2
      // 148: ldc_w -930394711
      // 14b: ixor
      // 14c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 14f: ldc2_w 4471629668851080522
      // 152: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 155: isub
      // 156: ireturn
      // 157: athrow
      // 158: iload 0
      // 159: iload 1
      // 15a: ifne 2f2
      // 15d: lookupswitch 1328 47 32 388 39 408 44 428 45 448 46 468 47 488 59 508 61 528 91 548 92 568 93 588 96 608 256 628 257 648 258 668 259 688 260 708 261 728 262 748 263 768 264 788 265 808 266 828 267 848 268 868 269 888 280 908 281 928 282 948 283 968 284 988 330 1008 331 1028 332 1048 333 1068 334 1088 335 1108 336 1128 340 1148 341 1168 342 1188 343 1208 344 1228 345 1248 346 1268 347 1288 348 1308
      // 2e0: athrow
      // 2e1: ldc_w -1761206966
      // 2e4: iload 2
      // 2e5: ldc_w 640559950
      // 2e8: ixor
      // 2e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 2ec: ldc2_w 8492310074285139077
      // 2ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 2f2: goto 68e
      // 2f5: ldc_w -1761206967
      // 2f8: iload 2
      // 2f9: ldc_w -1974013029
      // 2fc: ixor
      // 2fd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 300: ldc2_w 6649401307665242945
      // 303: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 306: goto 68e
      // 309: ldc_w -1761206968
      // 30c: iload 2
      // 30d: ldc_w 1506712428
      // 310: ixor
      // 311: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 314: ldc2_w 2602583125458954042
      // 317: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 31a: goto 68e
      // 31d: ldc_w -1761206969
      // 320: iload 2
      // 321: ldc_w -1716525956
      // 324: ixor
      // 325: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 328: ldc2_w 1874826934217274204
      // 32b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 32e: goto 68e
      // 331: ldc_w -1761206970
      // 334: iload 2
      // 335: ldc_w -1308302881
      // 338: ixor
      // 339: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 33c: ldc2_w 580515042356675332
      // 33f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 342: goto 68e
      // 345: ldc_w -1761206971
      // 348: iload 2
      // 349: ldc_w -144089216
      // 34c: ixor
      // 34d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 350: ldc2_w 331688612419149171
      // 353: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 356: goto 68e
      // 359: ldc_w -1761206972
      // 35c: iload 2
      // 35d: ldc_w -1627538345
      // 360: ixor
      // 361: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 364: ldc2_w 1064972008649552957
      // 367: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 36a: goto 68e
      // 36d: ldc_w -1761206973
      // 370: iload 2
      // 371: ldc_w -1717883387
      // 374: ixor
      // 375: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 378: ldc2_w 2190971374860714569
      // 37b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 37e: goto 68e
      // 381: ldc_w -1761206974
      // 384: iload 2
      // 385: ldc_w -1500830702
      // 388: ixor
      // 389: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 38c: ldc2_w 7460172834687818757
      // 38f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 392: goto 68e
      // 395: ldc_w -1761206975
      // 398: iload 2
      // 399: ldc_w -1052782795
      // 39c: ixor
      // 39d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 3a0: ldc2_w 5098961349882307809
      // 3a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 3a6: goto 68e
      // 3a9: ldc_w -1761206976
      // 3ac: iload 2
      // 3ad: ldc_w -1368926816
      // 3b0: ixor
      // 3b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 3b4: ldc2_w 208163174707193469
      // 3b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 3ba: goto 68e
      // 3bd: ldc_w -1761206913
      // 3c0: iload 2
      // 3c1: ldc_w -1466698705
      // 3c4: ixor
      // 3c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 3c8: ldc2_w 957301218995914766
      // 3cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 3ce: goto 68e
      // 3d1: ldc_w -1761206914
      // 3d4: iload 2
      // 3d5: ldc_w 507447629
      // 3d8: ixor
      // 3d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 3dc: ldc2_w 6644352353513552774
      // 3df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 3e2: goto 68e
      // 3e5: ldc_w -1761206915
      // 3e8: iload 2
      // 3e9: ldc_w 844782091
      // 3ec: ixor
      // 3ed: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 3f0: ldc2_w 2207677137447203996
      // 3f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 3f6: goto 68e
      // 3f9: ldc_w -1761206916
      // 3fc: iload 2
      // 3fd: ldc_w -1945151610
      // 400: ixor
      // 401: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 404: ldc2_w 3433667471698194203
      // 407: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 40a: goto 68e
      // 40d: ldc_w -1761206917
      // 410: iload 2
      // 411: ldc_w 538925144
      // 414: ixor
      // 415: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 418: ldc2_w 6020864093281800430
      // 41b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 41e: goto 68e
      // 421: ldc_w -1761206918
      // 424: iload 2
      // 425: ldc_w 700220111
      // 428: ixor
      // 429: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 42c: ldc2_w 5140881687917596630
      // 42f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 432: goto 68e
      // 435: ldc_w -1761206919
      // 438: iload 2
      // 439: ldc_w 270273037
      // 43c: ixor
      // 43d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 440: ldc2_w 8148836811360035711
      // 443: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 446: goto 68e
      // 449: ldc_w -1761206920
      // 44c: iload 2
      // 44d: ldc_w 1405691698
      // 450: ixor
      // 451: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 454: ldc2_w 3519951880049656385
      // 457: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 45a: goto 68e
      // 45d: ldc_w -1761206921
      // 460: iload 2
      // 461: ldc_w -343741942
      // 464: ixor
      // 465: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 468: ldc2_w 6309682336842964208
      // 46b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 46e: goto 68e
      // 471: ldc_w -1761206922
      // 474: iload 2
      // 475: ldc_w 129064814
      // 478: ixor
      // 479: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 47c: ldc2_w 8474145546146459266
      // 47f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 482: goto 68e
      // 485: ldc_w -1761206923
      // 488: iload 2
      // 489: ldc_w 632228687
      // 48c: ixor
      // 48d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 490: ldc2_w 5118628291383968520
      // 493: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 496: goto 68e
      // 499: ldc_w -1761206924
      // 49c: iload 2
      // 49d: ldc_w 199404494
      // 4a0: ixor
      // 4a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 4a4: ldc2_w 5076801360541457644
      // 4a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 4aa: goto 68e
      // 4ad: ldc_w -1761206925
      // 4b0: iload 2
      // 4b1: ldc_w -1601333942
      // 4b4: ixor
      // 4b5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 4b8: ldc2_w 55573009522380842
      // 4bb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 4be: goto 68e
      // 4c1: ldc_w -1761206926
      // 4c4: iload 2
      // 4c5: ldc_w 47172097
      // 4c8: ixor
      // 4c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 4cc: ldc2_w 2413828880306408276
      // 4cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 4d2: goto 68e
      // 4d5: ldc_w -1761206927
      // 4d8: iload 2
      // 4d9: ldc_w 1193739432
      // 4dc: ixor
      // 4dd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 4e0: ldc2_w 193821929583923540
      // 4e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 4e6: goto 68e
      // 4e9: ldc_w -1761206928
      // 4ec: iload 2
      // 4ed: ldc_w 858139056
      // 4f0: ixor
      // 4f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 4f4: ldc2_w 5647533128690995148
      // 4f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 4fa: goto 68e
      // 4fd: ldc_w -1761206929
      // 500: iload 2
      // 501: ldc_w 619794890
      // 504: ixor
      // 505: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 508: ldc2_w 872447078320979414
      // 50b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 50e: goto 68e
      // 511: ldc_w -1761206930
      // 514: iload 2
      // 515: ldc_w -29738722
      // 518: ixor
      // 519: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 51c: ldc2_w 7112150081710935592
      // 51f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 522: goto 68e
      // 525: ldc_w -1761206931
      // 528: iload 2
      // 529: ldc_w -1746301020
      // 52c: ixor
      // 52d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 530: ldc2_w 2276702340510390199
      // 533: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 536: goto 68e
      // 539: ldc_w -1761206932
      // 53c: iload 2
      // 53d: ldc_w -2119306338
      // 540: ixor
      // 541: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 544: ldc2_w 6688427171396734151
      // 547: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 54a: goto 68e
      // 54d: ldc_w -1761206933
      // 550: iload 2
      // 551: ldc_w 726249637
      // 554: ixor
      // 555: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 558: ldc2_w 326281478399600308
      // 55b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 55e: goto 68e
      // 561: ldc_w -1761206934
      // 564: iload 2
      // 565: ldc_w 1620082915
      // 568: ixor
      // 569: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 56c: ldc2_w 4057328097904909656
      // 56f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 572: goto 68e
      // 575: ldc_w -1761206935
      // 578: iload 2
      // 579: ldc_w -705708910
      // 57c: ixor
      // 57d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 580: ldc2_w 7657034722244429713
      // 583: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 586: goto 68e
      // 589: ldc_w -1761206936
      // 58c: iload 2
      // 58d: ldc_w -422199608
      // 590: ixor
      // 591: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 594: ldc2_w 391418443669203828
      // 597: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 59a: goto 68e
      // 59d: ldc_w -1761206937
      // 5a0: iload 2
      // 5a1: ldc_w 513690379
      // 5a4: ixor
      // 5a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 5a8: ldc2_w 4270688033711639281
      // 5ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 5ae: goto 68e
      // 5b1: ldc_w -1761206938
      // 5b4: iload 2
      // 5b5: ldc_w 2139552717
      // 5b8: ixor
      // 5b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 5bc: ldc2_w 2323084669898191002
      // 5bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 5c2: goto 68e
      // 5c5: ldc_w -1761206939
      // 5c8: iload 2
      // 5c9: ldc_w 117843943
      // 5cc: ixor
      // 5cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 5d0: ldc2_w 1545577897053424312
      // 5d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 5d6: goto 68e
      // 5d9: ldc_w -1761206940
      // 5dc: iload 2
      // 5dd: ldc_w 2112139640
      // 5e0: ixor
      // 5e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 5e4: ldc2_w 8067087333534378923
      // 5e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 5ea: goto 68e
      // 5ed: ldc_w -1761206941
      // 5f0: iload 2
      // 5f1: ldc_w 993344389
      // 5f4: ixor
      // 5f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 5f8: ldc2_w 3461500213610107887
      // 5fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 5fe: goto 68e
      // 601: ldc_w -1761206942
      // 604: iload 2
      // 605: ldc_w -333828925
      // 608: ixor
      // 609: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 60c: ldc2_w 1486552616191456996
      // 60f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 612: goto 68e
      // 615: ldc_w -1761206943
      // 618: iload 2
      // 619: ldc_w 1592871232
      // 61c: ixor
      // 61d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 620: ldc2_w 2386815943925072884
      // 623: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 626: goto 68e
      // 629: ldc_w -1761206944
      // 62c: iload 2
      // 62d: ldc_w 2022066688
      // 630: ixor
      // 631: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 634: ldc2_w 4811795224154179170
      // 637: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 63a: goto 68e
      // 63d: ldc_w -1761207009
      // 640: iload 2
      // 641: ldc_w -527563973
      // 644: ixor
      // 645: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 648: ldc2_w 5185571408657746019
      // 64b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 64e: goto 68e
      // 651: ldc_w -1761207010
      // 654: iload 2
      // 655: ldc_w 1535634569
      // 658: ixor
      // 659: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 65c: ldc2_w 8967398048692153162
      // 65f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 662: goto 68e
      // 665: ldc_w -1761207011
      // 668: iload 2
      // 669: ldc_w -481201119
      // 66c: ixor
      // 66d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 670: ldc2_w 8979094187581560050
      // 673: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 676: goto 68e
      // 679: ldc_w -1761207012
      // 67c: iload 2
      // 67d: ldc_w 551034109
      // 680: ixor
      // 681: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.a (II)I
      // 684: ldc2_w 8408209491583964624
      // 687: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.abb (IJ)I
      // 68a: goto 68e
      // 68d: bipush -1
      // 68e: ireturn
   }

   private static boolean b(ababaaba param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new com/sun/jna/platform/win32/WinUser$INPUT
      // 03: dup
      // 04: invokespecial com/sun/jna/platform/win32/WinUser$INPUT.<init> ()V
      // 07: bipush 1
      // 08: invokevirtual com/sun/jna/platform/win32/WinUser$INPUT.toArray (I)[Lcom/sun/jna/Structure;
      // 0b: checkcast [Lcom/sun/jna/platform/win32/WinUser$INPUT;
      // 0e: astore 3
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 12: aload 3
      // 13: bipush 0
      // 14: aaload
      // 15: aload 0
      // 16: iload 1
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.aa (Lcom/sun/jna/platform/win32/WinUser$INPUT;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaba;Z)V
      // 1a: istore 2
      // 1b: getstatic com/sun/jna/platform/win32/User32.INSTANCE Lcom/sun/jna/platform/win32/User32;
      // 1e: new com/sun/jna/platform/win32/WinDef$DWORD
      // 21: dup
      // 22: lconst_1
      // 23: invokespecial com/sun/jna/platform/win32/WinDef$DWORD.<init> (J)V
      // 26: aload 3
      // 27: aload 3
      // 28: bipush 0
      // 29: aaload
      // 2a: invokevirtual com/sun/jna/platform/win32/WinUser$INPUT.size ()I
      // 2d: invokeinterface com/sun/jna/platform/win32/User32.SendInput (Lcom/sun/jna/platform/win32/WinDef$DWORD;[Lcom/sun/jna/platform/win32/WinUser$INPUT;I)Lcom/sun/jna/platform/win32/WinDef$DWORD; 4
      // 32: invokevirtual com/sun/jna/platform/win32/WinDef$DWORD.intValue ()I
      // 35: iload 2
      // 36: ifne 46
      // 39: bipush 1
      // 3a: if_icmpne 49
      // 3d: goto 41
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: athrow
      // 46: goto 4a
      // 49: bipush 0
      // 4a: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = aaaa[var0 ^ -1761206945] ^ var1 ^ var0;
      var2 -= 13516;
      var2 += 65087;
      var2 += 3623;
      var2 += 53255;
      var2 ^= 4856;
      return var2 - 58314;
   }

   private static ababaaba aab(class_306 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 11
      // 09: ifnull 22
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 26
      // 15: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 18: getstatic net/minecraft/class_3675$class_307.field_1672 Lnet/minecraft/class_3675$class_307;
      // 1b: if_acmpne 25
      // 1e: goto 22
      // 21: athrow
      // 22: aconst_null
      // 23: areturn
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.aaa (I)I
      // 2c: istore 2
      // 2d: iload 2
      // 2e: iload 1
      // 2f: ifne 4f
      // 32: ifge 3c
      // 35: goto 39
      // 38: athrow
      // 39: aconst_null
      // 3a: areturn
      // 3b: athrow
      // 3c: getstatic com/sun/jna/platform/win32/User32.INSTANCE Lcom/sun/jna/platform/win32/User32;
      // 3f: iload 2
      // 40: bipush 0
      // 41: getstatic com/sun/jna/platform/win32/User32.INSTANCE Lcom/sun/jna/platform/win32/User32;
      // 44: bipush 0
      // 45: invokeinterface com/sun/jna/platform/win32/User32.GetKeyboardLayout (I)Lcom/sun/jna/platform/win32/WinDef$HKL; 2
      // 4a: invokeinterface com/sun/jna/platform/win32/User32.MapVirtualKeyEx (IILcom/sun/jna/platform/win32/WinDef$HKL;)I 4
      // 4f: istore 3
      // 50: iload 3
      // 51: ifne 57
      // 54: aconst_null
      // 55: areturn
      // 56: athrow
      // 57: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaba
      // 5a: dup
      // 5b: iload 3
      // 5c: aload 0
      // 5d: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 60: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.ab (I)Z
      // 63: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaba.<init> (IZ)V
      // 66: areturn
   }

   public static boolean aba() {
      return ab;
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1761207013, -1654672599 ^ 268510192);
      if (aa[var3] == null) {
         aa[var3] = (int)(bba[var3] ^ var1);
      }

      return aa[var3];
   }

   private static boolean baa(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 1
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.ab Z
      // 07: ifeq 48
      // 0a: aload 0
      // 0b: iload 1
      // 0c: ifne 1b
      // 0f: goto 13
      // 12: athrow
      // 13: ifnull 48
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 0
      // 1b: iload 1
      // 1c: ifne 32
      // 1f: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 22: ifnonnull 48
      // 25: goto 29
      // 28: athrow
      // 29: aload 0
      // 2a: iload 1
      // 2b: ifne 3d
      // 2e: goto 32
      // 31: athrow
      // 32: invokevirtual net/minecraft/class_310.method_1569 ()Z
      // 35: ifeq 48
      // 38: aload 0
      // 39: goto 3d
      // 3c: athrow
      // 3d: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 40: ifnull 48
      // 43: bipush 1
      // 44: goto 49
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
   }

   private static void bab(INPUT var0, int var1, int var2) {
      var0.type = new DWORD(0L);
      var0.input.setType(MOUSEINPUT.class);
      var0.input.mi = new MOUSEINPUT();
      var0.input.mi.dx = new LONG(0L);
      var0.input.mi.dy = new LONG(0L);
      var0.input.mi.mouseData = new DWORD(var2);
      var0.input.mi.dwFlags = new DWORD(var1);
      var0.input.mi.time = new DWORD(0L);
      var0.input.mi.dwExtraInfo = new ULONG_PTR(0L);
      var0.write();
   }

   private static boolean bba(int param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: new com/sun/jna/platform/win32/WinUser$INPUT
      // 06: dup
      // 07: invokespecial com/sun/jna/platform/win32/WinUser$INPUT.<init> ()V
      // 0a: bipush 1
      // 0b: invokevirtual com/sun/jna/platform/win32/WinUser$INPUT.toArray (I)[Lcom/sun/jna/Structure;
      // 0e: checkcast [Lcom/sun/jna/platform/win32/WinUser$INPUT;
      // 11: astore 3
      // 12: istore 2
      // 13: aload 3
      // 14: bipush 0
      // 15: aaload
      // 16: iload 0
      // 17: iload 1
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.bab (Lcom/sun/jna/platform/win32/WinUser$INPUT;II)V
      // 1b: getstatic com/sun/jna/platform/win32/User32.INSTANCE Lcom/sun/jna/platform/win32/User32;
      // 1e: new com/sun/jna/platform/win32/WinDef$DWORD
      // 21: dup
      // 22: lconst_1
      // 23: invokespecial com/sun/jna/platform/win32/WinDef$DWORD.<init> (J)V
      // 26: aload 3
      // 27: aload 3
      // 28: bipush 0
      // 29: aaload
      // 2a: invokevirtual com/sun/jna/platform/win32/WinUser$INPUT.size ()I
      // 2d: invokeinterface com/sun/jna/platform/win32/User32.SendInput (Lcom/sun/jna/platform/win32/WinDef$DWORD;[Lcom/sun/jna/platform/win32/WinUser$INPUT;I)Lcom/sun/jna/platform/win32/WinDef$DWORD; 4
      // 32: invokevirtual com/sun/jna/platform/win32/WinDef$DWORD.intValue ()I
      // 35: iload 2
      // 36: ifne 46
      // 39: bipush 1
      // 3a: if_icmpne 49
      // 3d: goto 41
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: athrow
      // 46: goto 4a
      // 49: bipush 0
      // 4a: ireturn
   }
}
