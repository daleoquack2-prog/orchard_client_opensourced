package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
public final class aaabbbbb extends abbaabbaa {
   private static final String[] aa;
   private static final String[] baa;
   private static final long[] ab;
   private static final Object[] bab;
   private static String[] ba;
   private static final String[] bb;
   private static final long[] aaa;
   private static final Integer[] aab;
   private static final int[] abb;
   private static final Long[] aba;

   public boolean aa(class_310 param1, class_3965 param2) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbbb.babbaab ()Z
      // 08: iload 3
      // 09: ifne 37
      // 0c: ifeq 32
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: iload 3
      // 15: ifne 24
      // 18: goto 1c
      // 1b: athrow
      // 1c: ifnull 32
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 27: ifnull 32
      // 2a: aload 2
      // 2b: ifnonnull 38
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: goto 37
      // 36: athrow
      // 37: ireturn
      // 38: aload 1
      // 39: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3c: aload 2
      // 3d: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 40: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 43: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
      // 46: astore 4
      // 48: aload 4
      // 4a: iload 3
      // 4b: ifne 5e
      // 4e: getstatic net/minecraft/class_2246.field_10034 Lnet/minecraft/class_2248;
      // 51: if_acmpeq a8
      // 54: goto 58
      // 57: athrow
      // 58: aload 4
      // 5a: goto 5e
      // 5d: athrow
      // 5e: iload 3
      // 5f: ifne 72
      // 62: getstatic net/minecraft/class_2246.field_10380 Lnet/minecraft/class_2248;
      // 65: if_acmpeq a8
      // 68: goto 6c
      // 6b: athrow
      // 6c: aload 4
      // 6e: goto 72
      // 71: athrow
      // 72: iload 3
      // 73: ifne 86
      // 76: getstatic net/minecraft/class_2246.field_10443 Lnet/minecraft/class_2248;
      // 79: if_acmpeq a8
      // 7c: goto 80
      // 7f: athrow
      // 80: aload 4
      // 82: goto 86
      // 85: athrow
      // 86: iload 3
      // 87: ifne 9a
      // 8a: getstatic net/minecraft/class_2246.field_16328 Lnet/minecraft/class_2248;
      // 8d: if_acmpeq a8
      // 90: goto 94
      // 93: athrow
      // 94: aload 4
      // 96: goto 9a
      // 99: athrow
      // 9a: instanceof net/minecraft/class_2480
      // 9d: iload 3
      // 9e: ifne a9
      // a1: ifeq ac
      // a4: goto a8
      // a7: athrow
      // a8: bipush 1
      // a9: goto ad
      // ac: bipush 0
      // ad: ireturn
   }

   private static void ab() {
      int var0 = 635493670;
      ba[0] = aaa(
         aab(a(-399120600, var0 ^ 1953435616), a(-399120599, var0 ^ -1139339433)).toCharArray(),
         ba(a(-399120598, var0 ^ -960293933), 8349046705076827202L),
         bb(a(-399120597, var0 ^ 870509458), 2086284711519710749L)
      );
      ba[1] = aaa(
         aab(a(-399120604, var0 ^ 55647757), a(-399120603, var0 ^ 605715165)).toCharArray(),
         ba(a(-399120602, var0 ^ 2122631021), 7769444145498921636L),
         bb(a(-399120601, var0 ^ -824406565), 2693075296960494801L)
      );
   }

   private static long ba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-399120608, -1341764426 ^ 30414228)) & a(-399120607, -1341764426 ^ -955571874);
      if (aba[var3] == null) {
         aba[var3] = aaa[var3] ^ var1;
      }

      return aba[var3];
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-399120606, -1057760494 ^ 1137581962);
      if (aab[var3] == null) {
         aab[var3] = (int)(ab[var3] ^ var1);
      }

      return aab[var3];
   }

   public aaabbbbb() {
      super(
         aabbaaaba.aaab(ba[1]),
         bbaabbba.bba,
         aabbaaaba.aaab(ba[0])
      );
   }

   private static String aaa(char[] var0, long var1, int var3) {
      int var4 = bb(a(-399120605, 1217882351 ^ 1771857965), 2583761651128201172L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & bb(a(-399120580, 1217882351 ^ 105097031), 297590002807573903L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static int a(int var0, int var1) {
      int var2 = abb[var0 ^ -399120628] ^ var1 ^ var0;
      var2 -= 62164;
      var2 += 34903;
      var2 += 55272;
      var2 += 32230;
      var2 += 18547;
      var2 += 3184;
      var2 -= 53066;
      return var2 - 2018;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = 1016375332;
      short var23 = 16780;
      char[] var25 = "䇕䆜䆆䆜䆆䆜䆆".toCharArray();
      String var24 = "ἷ柟捒ꄠѽ휼Ẵꄇ\uf7c7솑數긁㭞黴\ude21钳ꭞ劎⒗잰陰喅쎠㗔\ued1c⇆\ue98f७秸容枧붱愇\ueebd尶픎幟薹\uf37a苼긲ᯯ찌\ufefe拓⦊ᖚ衃䙼툧ᗤꖓ涠시㖪肎즤牡蔕ા\uf63d璮嘍⾳审ಮ茒뜊ⓧꗻṕ᭽巷\udc78耻⪪훧Ḇ뙣䀏蘫Ⴂꐘ\ude2f\uf5b2쩴厗䣈螡ὕίὊῲΌᾳὟῠᾠἎ\u1f16ᾷἭἲἥἩ쏫쎨쎈쎨쎪쎟쏉쏻쎣쎮㷑㶥㴻㵆㷒㵒㷎㴎㷈㶌㷩㷵㶟㴇㴻㴘\ue851\ue812\ue832\ue812\ue810\ue825\ue873\ue841\ue819\ue814⡒⢾⣙⢏⠲⢿⠈⡤⡦⣕⣯⠌⡮⠟⠐⢵鮗鯔鯴鯔鯖鯣鮵鮇鯟鯒";
      String[] var26 = new String[var25.length];
      byte var30 = -1;

      while (true) {
         int var27 = 0;
         int var28 = 0;
         int var29 = 0;
         if (var30 == 0) {
            baa = var26;
            bab = new Object[var26.length];
            abb = new int[307];
            byte var38 = 0;
            int var10001 = 0;
            byte[] var10002 = "Òu\u0085o\u0010n\u001dâ¥\b/\u0017\u0087\täÕî.Z\u001eMJÀÆ½Q@T¥½ÞÔ\"|òÕª\"×\u0083>\u009e\u009dçÌ\n|\u0003+°¿\u0084~Ò\tjÖ²ò\u0096«G\u009dÑè=\u0091\u0013ÃM\u009b\u0012æ\u008e¨Ft¸\u00ad\u0083\r\u0002ú[(\fHÔÍR\u001bER²ô&=ï´Î%Q\u0017!\u008913\u008f\u0010Ýu\u0015ì\u000e<6Ã:\rFÝ¬é\u009cðïP\u009a\u0087Î®øÌ\u009f¥\u009e\u0082F@Ü\u0086Iâh2{'Ýú\u0003yÑ\u0080×\u0019\u000f\u008a\t\u000eÝEE6=b\u000eí\u00898\u0090ïZ\u0088Èº%Ò\"¢\u0090ë\u0006CFàÉb\u0096BÿÇ\u0019- V&¹\u0086Àr×k:ÂXH7=4ù³kªêmñ+\"7N\nTm\u001c³\rÜ8@úõëåçMsd1ÇI¯¬\u008cOíþCq\u0096\u0080¯ð×ÿ\u0014K9Ð}<+\\0x\u0086Ý\"[\u0084¯áºç\u008fù\u008c!½Ë\b¤\u009føG)\u0096ñ÷ÇÈ\u00ad{'{²\u00ad¦2Â\u0081Ò\u0016ÍH\u0011¨S¥_Vï\u0080\u008cb1îZY\u001fº,Ø\u009dæ56Õª1\u001a-¹°3\u0088-VÂÔñÜs[Á¶ÈÂB\u0097\u008aá\u0088Þk\rõç²peäYæÛì\u0004_óè\u0003\u0080AôÁÉ%\u0092GâcY\u0014c5\u0014Û\u00adXÆ·tù\u0087\u00018U\u0004£Ô\u001f9ÃÊ\bç\u0080¨¹\u0005ÛokÝØ uH\u009eJ\u009c\u0013îãT«eJ+Çi@»i0igÌc-ôä\u0082ÜM\u0083\r\u0011\u0086ôNt\u0011¸\u0099(\u0099©ÄÄÃ\u0098@£\u0015\u0003Ô«õ\u009e\u0003\u0093\u0004`@¬\u0016cú\u0096}É;µ\u0091On,x`=LN×\u0085©\u001aA£\u0004ù0u0\\-\u001a\u009db5ç\u0015\u0003ÌéZ\u0084ËÂ\u0007\u0089Ã<£GÖ8þÃö¢´¶)NP_X²&\u00182Åu\u009dEÖ)Ô\u008aÏ\u00833.Nlß\u0018æê\u0084º\u0081\u0099ÝåZ\u008c«¼%\u0089½¿¬:îW\u0083\u009b\u009e\u0081³\u008e\u000eëI¯7i\u0007¨qØ\u0006:¦Êå«(\u0086`\u0085Ê\t\u008b¹:Ð\u0019\u001b\u009eó\t´!\u00adàþ÷\u009aç|ûî\u0003&g\u0095MùÿGýù²©\u0084\u0005ÕõÀ\u001dôo\u0015#\fz?\u008e\u000fRÁgjàÓ/\u0096½ùßl#Ò\"C*à\u001d\u0010\th½*XV\u0091Ï;´\u0083â^@ògK{M\u001dLiÕ\r\u009eákKºjsX£»×Mf6»\fñè¾\u001a¢§U\u0004çãáÀöt¡§<ëEçD-1Và\u0005~ø\u00882S\u001f¨\u009dqèq§8¿¾ãSk¼\u001f&ÐTM\\\u009c\u0090\u009cì$¡î\u008d]8«\u0003Û«\"2\u008eÅ¡°\u0014C\u0083¶YÇÔ&T&Vay und Z9SK\u0088-¹Ø<éYV¾¶\u0001§\u0088WëI\u001eÖEÑíz«jlóÐk#O\u0013a\u009aíN\u0080Ejø)\u000f\u0018.\u009f3Øt¼}6T°\u0096nàìÔ'¿MÂ\u0091'bÎ¨\u009e\u0094Ç»\u0017\u00171À¥2æI\u0011Ï!+!\r\f\u0017éþtÒL4\"!\u0000\u0086ìP\u0089f\u0019pJ\u0086TA:£\bb\tÅ4¤¯H_H@Ôîìí\"/ú,6í)%\u0095\u0084E¶9¡\u0090×4×Û#\u0007\u0082xT«x²x©«÷Hr\u0012U\u0089\u00adÂ±\u0095U¸\u0085t#vnf\u0096¨\u001c»)!4VÂ\u0091GgöÛi\fh¹`)\u000e½Æ\u0095T\bj¹Û¾üt©\u001d¬wP$Q¹u\u0097E¾\u0015(Ó\u009fR=©Ï\\ÕG\u0085ñ·þß\u0017\u007f³WÁ\u0096ÖÚd¼ëÔ@Zrù3Ú\n*M\u008bÚ\tò[ÑÐÙ¯bé\u009f`\u00189H\u0000\u007fH\b\u0094\u0097\u0096½\u001e\u001e\u0082àÍ\u0094\u0099îõ\u009e\u0091\u0085û\f\u0099é´:óÂÓê\u0004nâ L¤ô\u0015\u0082àðì\u008bþ,7È\u001c\b\u0003\u0001\u0095g}£¬Þ0\u008e|\u009c£èÆhè´.\u0006\u008c_ \u0004Âs\u008a\u0012\u001aDZ/JSz¥k\u009euôê³å,µe'½ù\u0085AØ\u0089\u0086ïqô\u008bÃ´åyÞ¨'R\u0006>\u001cÆ0\u0087ë>Z¬ò\u0085ê\u0018/¿´ÄaÊ®+|V¡K¥æ\u0095\nÁF*Y\u0089\u009d\u0091^·\u007f"
               .getBytes("ISO-8859-1");

            int var76;
            do {
               abb[var38] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1950277496;
               var38 += 1;
               var76 = var10001 + 4;
               var10001 += 4;
            } while (var76 < var10002.length);

            String[] var21 = new String[2];
            int var19 = 0;
            String var18;
            int var20 = (var18 = b(28013, -411588402, (char)'\uf343', (byte)30, -315735405, (byte)-5)).length();
            int var17 = a(-399120628, var34 ^ -1927970177);
            int var16 = -1;

            while (true) {
               label117: {
                  char[] var42 = var18.substring(++var16, var16 + var17).toCharArray();
                  var76 = var42.length;
                  int var22 = 0;
                  var62 = var42;
                  var10001 = var76;
                  char[] var80;
                  int var97;
                  if (var76 <= 1) {
                     var80 = var42;
                     var97 = var22;
                  } else {
                     var62 = var42;
                     var10001 = var76;
                     if (var76 <= var22) {
                        break label117;
                     }

                     var80 = var42;
                     var97 = var22;
                  }

                  while (true) {
                     var80[var97] = (char)(var80[var97] ^ switch (var22 % a(-399120627, var34 ^ 1326324556)) {
                        case 0 -> a(-399120626, var34 ^ -93837207);
                        case 1 -> a(-399120625, var34 ^ -664149120);
                        case 2 -> a(-399120632, var34 ^ -1320264429);
                        case 3 -> a(-399120631, var34 ^ 304793594);
                        case 4 -> a(-399120630, var34 ^ -500086963);
                        case 5 -> a(-399120629, var34 ^ -86124138);
                        default -> a(-399120636, var34 ^ 2099049890);
                     });
                     var22++;
                     if (var10001 == 0) {
                        var97 = var10001;
                        var80 = var62;
                     } else {
                        if (var10001 <= var22) {
                           break;
                        }

                        var80 = var62;
                        var97 = var22;
                     }
                  }
               }

               String var87 = new String(var62).intern();
               int var49 = -1;
               var21[var19++] = var87;
               if ((var16 += var17) >= var20) {
                  bb = var21;
                  aa = new String[2];
                  long var8 = 7521647562607060128L;
                  long[] var14 = new long[4];
                  int var11 = 0;
                  String var12;
                  int var13 = (var12 = b((short)-26688, 1241276101, (char)'붼', (byte)-117, -315735406, (byte)8)).length();
                  byte var10 = 0;

                  label101:
                  while (true) {
                     var49 = var10;
                     var10 += 8;
                     byte[] var15 = var12.substring(var49, var10).getBytes(b(23675, -1874741555, '䈷', 59, -315735407, (byte)-41));
                     long[] var39 = var14;
                     var49 = var11++;
                     long var67 = (var15[0] & 255L) << a(-399120635, var34 ^ -180170518)
                        | (var15[1] & 255L) << a(-399120634, var34 ^ 1644075669)
                        | (var15[2] & 255L) << a(-399120633, var34 ^ -1821738120)
                        | (var15[3] & 255L) << a(-399120640, var34 ^ 1959835840)
                        | (var15[4] & 255L) << a(-399120639, var34 ^ 565317159)
                        | (var15[5] & 255L) << a(-399120638, var34 ^ -1982663232)
                        | (var15[a(-399120637, var34 ^ -198730896)] & 255L) << a(-399120612, var34 ^ -1218603437)
                        | var15[a(-399120611, var34 ^ -1674732116)] & 255L;
                     byte var88 = -1;

                     while (true) {
                        long var99 = var67 ^ var8;
                        switch (var88) {
                           case 0:
                              var39[var49] = var99;
                              if (var10 >= var13) {
                                 ab = var14;
                                 aab = new Integer[4];
                                 long var0 = 1014812094134733465L;
                                 long[] var6 = new long[2];
                                 int var3 = 0;
                                 String var4;
                                 int var5 = (var4 = b(11817, 288426320, (char)'鯐', (byte)6, -315735402, (byte)72)).length();
                                 byte var2 = 0;

                                 do {
                                    int var53 = var2;
                                    var2 += 8;
                                    byte[] var7 = var4.substring(var53, var2).getBytes(b((short)-4698, 745649252, 'ꤿ', (byte)-97, -315735403, (byte)119));
                                    var53 = var3++;
                                    var99 = (
                                          (var7[0] & 255L) << a(-399120617, var34 ^ 1337815662)
                                             | (var7[1] & 255L) << a(-399120624, var34 ^ -1284621486)
                                             | (var7[2] & 255L) << a(-399120623, var34 ^ -1671820757)
                                             | (var7[3] & 255L) << a(-399120622, var34 ^ -2100498742)
                                             | (var7[4] & 255L) << a(-399120621, var34 ^ -1349560379)
                                             | (var7[5] & 255L) << a(-399120596, var34 ^ -659641984)
                                             | (var7[a(-399120595, var34 ^ -1811963119)] & 255L) << a(-399120594, var34 ^ -584693842)
                                             | var7[a(-399120593, var34 ^ -651565852)] & 255L
                                       )
                                       ^ var0;
                                    var88 = -1;
                                    var6[var53] = var99;
                                 } while (var2 < var5);

                                 aaa = var6;
                                 aba = new Long[2];
                                 ba = new String[2];
                                 ab();
                                 return;
                              }
                              break;
                           default:
                              var39[var49] = var99;
                              if (var10 < var13) {
                                 continue label101;
                              }

                              var13 = (var12 = b((short)-1270, -2135395038, '\ud8eb', (byte)98, -315735408, (byte)-43)).length();
                              var10 = 0;
                        }

                        byte var52 = var10;
                        var10 += 8;
                        var15 = var12.substring(var52, var10).getBytes(b((short)-25913, -182219808, 28049, (byte)-99, -315735401, (byte)-6));
                        var39 = var14;
                        var49 = var11++;
                        var67 = (var15[0] & 255L) << a(-399120610, var34 ^ -1175539916)
                           | (var15[1] & 255L) << a(-399120609, var34 ^ 735619816)
                           | (var15[2] & 255L) << a(-399120616, var34 ^ 1382219071)
                           | (var15[3] & 255L) << a(-399120615, var34 ^ 2003586953)
                           | (var15[4] & 255L) << a(-399120614, var34 ^ -1842209773)
                           | (var15[5] & 255L) << a(-399120613, var34 ^ 231928681)
                           | (var15[a(-399120620, var34 ^ 1653584504)] & 255L) << a(-399120619, var34 ^ 2050035816)
                           | var15[a(-399120618, var34 ^ -699321030)] & 255L;
                        var88 = 0;
                     }
                  }
               }

               var17 = var18.charAt(var16);
            }
         }

         do {
            var29 = var25[var27] ^ var23;
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               byte var33 = switch (var32 % 5) {
                  default -> 105;
                  case 1 -> 49;
                  case 2 -> 14;
                  case 3 -> 77;
                  case 4 -> 93;
               };
               var31[var32] = (char)(var31[var32] ^ var33);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private static String b(short var0, int var1, char var2, byte var3, int var4, byte var5) {
      int var10 = var4 ^ -315735405;
      char[] var9 = baa[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])bab[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         bab[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 31358;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ var8 ^ var4 ^ var1 ^ var0 ^ var7 ^ var2 ^ var3 ^ var5);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   private static String aab(int var0, int var1) {
      int var9 = 1049829441;
      int var2 = (var0 ^ a(-399120579, var9 ^ -455011011)) & a(-399120578, var9 ^ 1978905650);
      if (aa[var2] == null) {
         char[] var3 = bb[var2].toCharArray();

         int var4 = switch (var3[0] & a(-399120577, var9 ^ 87013580)) {
            case 0 -> a(-399120584, var9 ^ 1771977746);
            case 1 -> a(-399120583, var9 ^ -141696376);
            case 2 -> a(-399120582, var9 ^ 1984280772);
            case 3 -> a(-399120581, var9 ^ 1463018012);
            case 4 -> a(-399120588, var9 ^ -295021569);
            case 5 -> a(-399120587, var9 ^ 496859801);
            case 6 -> a(-399120586, var9 ^ -1199521076);
            case 7 -> a(-399120585, var9 ^ 961956088);
            case 8 -> a(-399120592, var9 ^ -221576354);
            case 9 -> a(-399120591, var9 ^ -1332097946);
            case 10 -> a(-399120590, var9 ^ -874045319);
            case 11 -> a(-399120589, var9 ^ -1969710116);
            case 12 -> a(-399120564, var9 ^ 1689776662);
            case 13 -> a(-399120563, var9 ^ 1983627098);
            case 14 -> a(-399120562, var9 ^ -608522811);
            case 15 -> a(-399120561, var9 ^ -641175855);
            case 16 -> a(-399120568, var9 ^ -1159170374);
            case 17 -> a(-399120567, var9 ^ 2094679127);
            case 18 -> a(-399120566, var9 ^ -101156924);
            case 19 -> a(-399120565, var9 ^ 1961983547);
            case 20 -> a(-399120572, var9 ^ -1699798422);
            case 21 -> a(-399120571, var9 ^ 2048671012);
            case 22 -> a(-399120570, var9 ^ -78295760);
            case 23 -> a(-399120569, var9 ^ -1888402716);
            case 24 -> a(-399120576, var9 ^ 1288690938);
            case 25 -> a(-399120575, var9 ^ 36790395);
            case 26 -> a(-399120574, var9 ^ -788152808);
            case 27 -> a(-399120573, var9 ^ 121540715);
            case 28 -> a(-399120548, var9 ^ 1908347418);
            case 29 -> a(-399120547, var9 ^ 1750162119);
            case 30 -> a(-399120546, var9 ^ 1820172961);
            case 31 -> a(-399120545, var9 ^ -313260125);
            case 32 -> a(-399120552, var9 ^ 195386234);
            case 33 -> a(-399120551, var9 ^ -2129341089);
            case 34 -> a(-399120550, var9 ^ -340832873);
            case 35 -> a(-399120549, var9 ^ -890409298);
            case 36 -> a(-399120556, var9 ^ -2096332201);
            case 37 -> a(-399120555, var9 ^ -1160380539);
            case 38 -> a(-399120554, var9 ^ -1187092095);
            case 39 -> a(-399120553, var9 ^ -1318858553);
            case 40 -> a(-399120560, var9 ^ -1251733520);
            case 41 -> a(-399120559, var9 ^ -1448720708);
            case 42 -> a(-399120558, var9 ^ -819958314);
            case 43 -> a(-399120557, var9 ^ 74705934);
            case 44 -> a(-399120532, var9 ^ 1237066263);
            case 45 -> a(-399120531, var9 ^ -1680802836);
            case 46 -> a(-399120530, var9 ^ -630802624);
            case 47 -> a(-399120529, var9 ^ 1506040726);
            case 48 -> a(-399120536, var9 ^ 1688487274);
            case 49 -> a(-399120535, var9 ^ -1159256135);
            case 50 -> a(-399120534, var9 ^ 1488773343);
            case 51 -> a(-399120533, var9 ^ -2134954106);
            case 52 -> a(-399120540, var9 ^ 368690437);
            case 53 -> a(-399120539, var9 ^ 1317629117);
            case 54 -> a(-399120538, var9 ^ -167590617);
            case 55 -> a(-399120537, var9 ^ -1710305427);
            case 56 -> a(-399120544, var9 ^ 878175963);
            case 57 -> a(-399120543, var9 ^ -1861967223);
            case 58 -> a(-399120542, var9 ^ -1176153272);
            case 59 -> a(-399120541, var9 ^ -563437843);
            case 60 -> a(-399120516, var9 ^ -1456866438);
            case 61 -> a(-399120515, var9 ^ -436295887);
            case 62 -> a(-399120514, var9 ^ -190624922);
            case 63 -> a(-399120513, var9 ^ -987288422);
            case 64 -> a(-399120520, var9 ^ 1588798502);
            case 65 -> a(-399120519, var9 ^ -1016849200);
            case 66 -> a(-399120518, var9 ^ 1025975093);
            case 67 -> a(-399120517, var9 ^ 1050482948);
            case 68 -> a(-399120524, var9 ^ -1805894921);
            case 69 -> a(-399120523, var9 ^ 302621563);
            case 70 -> a(-399120522, var9 ^ 1029358537);
            case 71 -> a(-399120521, var9 ^ -1964890547);
            case 72 -> a(-399120528, var9 ^ 482642807);
            case 73 -> a(-399120527, var9 ^ 1829945226);
            case 74 -> a(-399120526, var9 ^ 1887244952);
            case 75 -> a(-399120525, var9 ^ 1753258596);
            case 76 -> a(-399120500, var9 ^ -1852910236);
            case 77 -> a(-399120499, var9 ^ -1767536564);
            case 78 -> a(-399120498, var9 ^ -1638191959);
            case 79 -> a(-399120497, var9 ^ -1956679169);
            case 80 -> a(-399120504, var9 ^ -1413137442);
            case 81 -> a(-399120503, var9 ^ 1948901370);
            case 82 -> 4;
            case 83 -> a(-399120502, var9 ^ 97888630);
            case 84 -> a(-399120501, var9 ^ 1872951911);
            case 85 -> a(-399120508, var9 ^ 414295629);
            case 86 -> a(-399120507, var9 ^ -676852511);
            case 87 -> a(-399120506, var9 ^ 1932125146);
            case 88 -> a(-399120505, var9 ^ 1166108085);
            case 89 -> a(-399120512, var9 ^ -404351327);
            case 90 -> a(-399120511, var9 ^ -1203961084);
            case 91 -> a(-399120510, var9 ^ -515766668);
            case 92 -> a(-399120509, var9 ^ -489966324);
            case 93 -> a(-399120484, var9 ^ 182719570);
            case 94 -> a(-399120483, var9 ^ -590085721);
            case 95 -> a(-399120482, var9 ^ -1238491073);
            case 96 -> a(-399120481, var9 ^ 878716772);
            case 97 -> a(-399120488, var9 ^ -2057194142);
            case 98 -> a(-399120487, var9 ^ -1753078620);
            case 99 -> a(-399120486, var9 ^ -620295575);
            case 100 -> a(-399120485, var9 ^ 1424766598);
            case 101 -> a(-399120492, var9 ^ -1921084248);
            case 102 -> a(-399120491, var9 ^ -1368507400);
            case 103 -> a(-399120490, var9 ^ -259558918);
            case 104 -> a(-399120489, var9 ^ -947850428);
            case 105 -> a(-399120496, var9 ^ -1285248579);
            case 106 -> a(-399120495, var9 ^ -936741241);
            case 107 -> a(-399120494, var9 ^ 446330494);
            case 108 -> a(-399120493, var9 ^ -186414541);
            case 109 -> a(-399120468, var9 ^ -1465412991);
            case 110 -> a(-399120467, var9 ^ 846376114);
            case 111 -> a(-399120466, var9 ^ 660078954);
            case 112 -> a(-399120465, var9 ^ 262596742);
            case 113 -> a(-399120472, var9 ^ -1112236029);
            case 114 -> a(-399120471, var9 ^ -526495512);
            case 115 -> a(-399120470, var9 ^ 2125835629);
            case 116 -> a(-399120469, var9 ^ 2005373557);
            case 117 -> a(-399120476, var9 ^ 1410282070);
            case 118 -> a(-399120475, var9 ^ 87105278);
            case 119 -> a(-399120474, var9 ^ 1725107290);
            case 120 -> a(-399120473, var9 ^ 52919616);
            case 121 -> a(-399120480, var9 ^ 370983492);
            case 122 -> a(-399120479, var9 ^ 286153216);
            case 123 -> a(-399120478, var9 ^ -1014569835);
            case 124 -> a(-399120477, var9 ^ -418513812);
            case 125 -> a(-399120452, var9 ^ -19113889);
            case 126 -> a(-399120451, var9 ^ 995177532);
            case 127 -> a(-399120450, var9 ^ -1399901860);
            case 128 -> a(-399120449, var9 ^ -4138387);
            case 129 -> a(-399120456, var9 ^ -1165726142);
            case 130 -> a(-399120455, var9 ^ -1424806377);
            case 131 -> a(-399120454, var9 ^ 1636616910);
            case 132 -> a(-399120453, var9 ^ 424328727);
            case 133 -> a(-399120460, var9 ^ -1117589074);
            case 134 -> a(-399120459, var9 ^ -715793272);
            case 135 -> a(-399120458, var9 ^ -168100099);
            case 136 -> a(-399120457, var9 ^ 750827490);
            case 137 -> a(-399120464, var9 ^ -477832130);
            case 138 -> a(-399120463, var9 ^ -512185954);
            case 139 -> a(-399120462, var9 ^ 153801505);
            case 140 -> a(-399120461, var9 ^ -839162907);
            case 141 -> a(-399120436, var9 ^ -58129916);
            case 142 -> a(-399120435, var9 ^ 1707904139);
            case 143 -> a(-399120434, var9 ^ -163201765);
            case 144 -> a(-399120433, var9 ^ -1731838077);
            case 145 -> a(-399120440, var9 ^ 518273335);
            case 146 -> a(-399120439, var9 ^ -1699501641);
            case 147 -> a(-399120438, var9 ^ 2066869916);
            case 148 -> a(-399120437, var9 ^ -49094349);
            case 149 -> a(-399120444, var9 ^ 2101196540);
            case 150 -> a(-399120443, var9 ^ 384803542);
            case 151 -> a(-399120442, var9 ^ -2057607603);
            case 152 -> a(-399120441, var9 ^ 198785348);
            case 153 -> a(-399120448, var9 ^ -84944864);
            case 154 -> a(-399120447, var9 ^ 343497067);
            case 155 -> a(-399120446, var9 ^ -1937050211);
            case 156 -> a(-399120445, var9 ^ 923499567);
            case 157 -> a(-399120420, var9 ^ 910475504);
            case 158 -> a(-399120419, var9 ^ 1023238838);
            case 159 -> 1;
            case 160 -> a(-399120418, var9 ^ -584915549);
            case 161 -> a(-399120417, var9 ^ 1953011640);
            case 162 -> a(-399120424, var9 ^ -1034659864);
            case 163 -> a(-399120423, var9 ^ -518342244);
            case 164 -> a(-399120422, var9 ^ -302915244);
            case 165 -> a(-399120421, var9 ^ -1313625967);
            case 166 -> a(-399120428, var9 ^ 279256779);
            case 167 -> a(-399120427, var9 ^ 1068050321);
            case 168 -> 0;
            case 169 -> a(-399120426, var9 ^ -912247704);
            case 170 -> a(-399120425, var9 ^ 1247170380);
            case 171 -> a(-399120432, var9 ^ 1870775918);
            case 172 -> a(-399120431, var9 ^ -1840864145);
            case 173 -> a(-399120430, var9 ^ 1349228602);
            case 174 -> a(-399120429, var9 ^ -1559012021);
            case 175 -> a(-399120404, var9 ^ 1766174455);
            case 176 -> a(-399120403, var9 ^ -611590381);
            case 177 -> a(-399120402, var9 ^ 998178634);
            case 178 -> a(-399120401, var9 ^ -617361896);
            case 179 -> a(-399120408, var9 ^ -26219015);
            case 180 -> a(-399120407, var9 ^ -1739379950);
            case 181 -> a(-399120406, var9 ^ 356042663);
            case 182 -> a(-399120405, var9 ^ -1987484694);
            case 183 -> a(-399120412, var9 ^ 2135455164);
            case 184 -> a(-399120411, var9 ^ 1804248696);
            case 185 -> a(-399120410, var9 ^ -924595569);
            case 186 -> a(-399120409, var9 ^ 1690705799);
            case 187 -> a(-399120416, var9 ^ 1773163676);
            case 188 -> a(-399120415, var9 ^ 1525020453);
            case 189 -> a(-399120414, var9 ^ -165724911);
            case 190 -> a(-399120413, var9 ^ -187926163);
            case 191 -> a(-399120388, var9 ^ 796252884);
            case 192 -> a(-399120387, var9 ^ -257605990);
            case 193 -> a(-399120386, var9 ^ 148834919);
            case 194 -> a(-399120385, var9 ^ 2115101081);
            case 195 -> a(-399120392, var9 ^ -875588816);
            case 196 -> a(-399120391, var9 ^ 1950792606);
            case 197 -> a(-399120390, var9 ^ -1611216755);
            case 198 -> a(-399120389, var9 ^ -1413683542);
            case 199 -> a(-399120396, var9 ^ 903802786);
            case 200 -> a(-399120395, var9 ^ 1406814539);
            case 201 -> a(-399120394, var9 ^ 158328140);
            case 202 -> a(-399120393, var9 ^ -2032569430);
            case 203 -> a(-399120400, var9 ^ -193322019);
            case 204 -> a(-399120399, var9 ^ 222551678);
            case 205 -> a(-399120398, var9 ^ 686869237);
            case 206 -> a(-399120397, var9 ^ 1213160469);
            case 207 -> a(-399120884, var9 ^ 257566557);
            case 208 -> a(-399120883, var9 ^ 28494223);
            case 209 -> a(-399120882, var9 ^ -1395625849);
            case 210 -> a(-399120881, var9 ^ 1243102640);
            case 211 -> a(-399120888, var9 ^ -1661904728);
            case 212 -> a(-399120887, var9 ^ 970679575);
            case 213 -> a(-399120886, var9 ^ 490601488);
            case 214 -> a(-399120885, var9 ^ 1857913892);
            case 215 -> a(-399120892, var9 ^ 283923560);
            case 216 -> a(-399120891, var9 ^ -1354997807);
            case 217 -> a(-399120890, var9 ^ -2067206922);
            case 218 -> a(-399120889, var9 ^ -1039690111);
            case 219 -> a(-399120896, var9 ^ 359133445);
            case 220 -> a(-399120895, var9 ^ 1441995116);
            case 221 -> a(-399120894, var9 ^ -528904105);
            case 222 -> a(-399120893, var9 ^ -1112925685);
            case 223 -> a(-399120868, var9 ^ -1282273232);
            case 224 -> a(-399120867, var9 ^ -660831551);
            case 225 -> 3;
            case 226 -> 5;
            case 227 -> a(-399120866, var9 ^ -1261194103);
            case 228 -> a(-399120865, var9 ^ -1615567826);
            case 229 -> a(-399120872, var9 ^ 864366086);
            case 230 -> a(-399120871, var9 ^ -107766978);
            case 231 -> a(-399120870, var9 ^ -1114152289);
            case 232 -> a(-399120869, var9 ^ -1555318398);
            case 233 -> a(-399120876, var9 ^ 1097829801);
            case 234 -> a(-399120875, var9 ^ -939461841);
            case 235 -> a(-399120874, var9 ^ -239485195);
            case 236 -> 2;
            case 237 -> a(-399120873, var9 ^ 570109271);
            case 238 -> a(-399120880, var9 ^ -1693489543);
            case 239 -> a(-399120879, var9 ^ 1935737468);
            case 240 -> a(-399120878, var9 ^ 2103659731);
            case 241 -> a(-399120877, var9 ^ -680160175);
            case 242 -> a(-399120852, var9 ^ 122209509);
            case 243 -> a(-399120851, var9 ^ 667084160);
            case 244 -> a(-399120850, var9 ^ 680748060);
            case 245 -> a(-399120849, var9 ^ -1203029240);
            case 246 -> a(-399120856, var9 ^ 2061137762);
            case 247 -> a(-399120855, var9 ^ 482281397);
            case 248 -> a(-399120854, var9 ^ -1307149793);
            case 249 -> a(-399120853, var9 ^ -1630311651);
            case 250 -> a(-399120860, var9 ^ -2083542747);
            case 251 -> a(-399120859, var9 ^ 1532596865);
            case 252 -> a(-399120858, var9 ^ 1843422614);
            case 253 -> a(-399120857, var9 ^ 130776300);
            case 254 -> a(-399120864, var9 ^ -1216372241);
            default -> a(-399120863, var9 ^ -375132196);
         };
         int var5 = (var1 & a(-399120862, var9 ^ -213060934)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-399120861, var9 ^ 64170507)) >>> a(-399120836, var9 ^ -932360381)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-399120835, var9 ^ 2000553838);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-399120834, var9 ^ -868664945);
            }
         }

         aa[var2] = new String(var3).intern();
      }

      return aa[var2];
   }
}
