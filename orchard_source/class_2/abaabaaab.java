package nsc;

import com.google.gson.JsonElement;
import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class abaabaaab extends baaabbaa {
   private static final Color aa;
   private static final long[] ab;
   private static final String[] ba;
   private static final Long[] bb;
   private static final Integer[] aaa;
   private static final String[] aaba;
   private static final Object[] aabb;
   private static final String[] aab;
   private static String[] aba;
   private static final int[] aaab;
   private static final long[] abb;

   private static String baa(int var0, int var1) {
      int var3 = var0 ^ 1148660368;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -648956884;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 143;
            case 1 -> 118;
            case 2 -> 179;
            case 3 -> 59;
            case 4 -> 164;
            case 5 -> 255;
            case 6 -> 212;
            case 7 -> 219;
            case 8 -> 246;
            case 9 -> 46;
            case 10 -> 51;
            case 11 -> 160;
            case 12 -> 33;
            case 13 -> 150;
            case 14 -> 72;
            case 15 -> 192;
            case 16 -> 232;
            case 17 -> 9;
            case 18 -> 240;
            case 19 -> 90;
            case 20 -> 191;
            case 21 -> 122;
            case 22 -> 186;
            case 23 -> 40;
            case 24 -> 137;
            case 25 -> 25;
            case 26 -> 38;
            case 27 -> 169;
            case 28 -> 32;
            case 29 -> 58;
            case 30 -> 33;
            case 31 -> 219;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static String aa(char[] var0, long var1, int var3) {
      int var4 = b(a(-361334929, 2113570541 ^ -218530947), 46336769562551929L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & b(a(-361334930, 2113570541 ^ -592903886), 5902769265347305896L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public void ba(Color param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 0
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.abab ()Ljava/lang/Object;
      // 08: checkcast java/awt/Color
      // 0b: astore 3
      // 0c: aload 0
      // 0d: aload 1
      // 0e: iload 2
      // 0f: ifne 1a
      // 12: ifnonnull 30
      // 15: goto 19
      // 18: athrow
      // 19: aload 3
      // 1a: iload 2
      // 1b: ifne 2d
      // 1e: ifnonnull 2c
      // 21: goto 25
      // 24: athrow
      // 25: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.aa Ljava/awt/Color;
      // 28: goto 31
      // 2b: athrow
      // 2c: aload 3
      // 2d: goto 31
      // 30: aload 1
      // 31: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.aab (Ljava/lang/Object;)V
      // 34: return
   }

   private static int a(int var0, int var1) {
      int var2 = aaab[var0 ^ -361334929] ^ var1 ^ var0;
      var2 -= 5890;
      var2 += 54174;
      var2 -= 39248;
      var2 ^= 63815;
      var2 -= 9670;
      var2 += 32971;
      return var2 + 26958;
   }

   public abaabaaab(Object var1, Color var2) {
      super(var1, var2 == null ? aa : var2);
   }

   @Override
   public void aab(Object var1) {
      this.ba((Color)var1);
   }

   @Override
   public void ab(JsonElement param1) {
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
      // 12: ifne 22
      // 15: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 18: ifne 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: return
      // 20: athrow
      // 21: aload 1
      // 22: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 25: astore 3
      // 26: aload 0
      // 27: new java/awt/Color
      // 2a: dup
      // 2b: aload 3
      // 2c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.aba [Ljava/lang/String;
      // 2f: bipush 2
      // 30: aaload
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 34: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 37: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 3a: aload 3
      // 3b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.aba [Ljava/lang/String;
      // 3e: bipush 0
      // 3f: aaload
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 43: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 46: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 49: aload 3
      // 4a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.aba [Ljava/lang/String;
      // 4d: bipush 3
      // 4e: aaload
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 52: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 55: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 58: aload 3
      // 59: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.aba [Ljava/lang/String;
      // 5c: bipush 1
      // 5d: aaload
      // 5e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 61: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 64: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 67: invokespecial java/awt/Color.<init> (IIII)V
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.ba (Ljava/awt/Color;)V
      // 6d: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -462902089;
      String[] var31 = new String[10];
      int var33 = 0;
      int var30 = "\t棓䶅뎷㣽솅믌竧\uef78\ue366\t\u1ae2旖捙鄄ꆕ䫲Ο낡⊔(‣\udc3b⃯籟➎\udc35♈屧↬\udc0b–밵␇\udc58⛎㰢⊘籱∼鰔⎳ᰩ❿屚⚮簦⌨뱽⒤\udc0bⓛ\udc2b⑷᱕⊆밭↨籿 \udc11\n埢秶噶ᦜ唇㧹囉馹坵㧗\u0010Ὣ峆ṏ岷\u1c8e峀ᦠᲜẴﳣᬣ糛᷷鲮᥆᳃\n꤬䈍ꢸ≧ꯉȂꠇꉂꦻȬ\u0010锎\u0ae4鎢છ锻ꫨ钅쪢鑉쫎韖䫣遲誑韻\ueaf3\n伉햕亝뗿䷬閚丢㗚侞閴\u0010\u03a2颲ޖ룍̏㢾ܹ\uf8ea}碌Ԛ\u18acɞ磛ҷ碨\n꿳㸖깧幼괖縙께\ude59꽤縷"
         .length();
      int var32 = 0;
      String var29 = "\t棓䶅뎷㣽솅믌竧\uef78\ue366\t\u1ae2旖捙鄄ꆕ䫲Ο낡⊔(‣\udc3b⃯籟➎\udc35♈屧↬\udc0b–밵␇\udc58⛎㰢⊘籱∼鰔⎳ᰩ❿屚⚮簦⌨뱽⒤\udc0bⓛ\udc2b⑷᱕⊆밭↨籿 \udc11\n埢秶噶ᦜ唇㧹囉馹坵㧗\u0010Ὣ峆ṏ岷\u1c8e峀ᦠᲜẴﳣᬣ糛᷷鲮᥆᳃\n꤬䈍ꢸ≧ꯉȂꠇꉂꦻȬ\u0010锎\u0ae4鎢છ锻ꫨ钅쪢鑉쫎韖䫣遲誑韻\ueaf3\n伉햕亝뗿䷬閚丢㗚侞閴\u0010\u03a2颲ޖ룍̏㢾ܹ\uf8ea}碌Ԛ\u18acɞ磛ҷ碨\n꿳㸖깧幼괖縙께\ude59꽤縷";
      short var34 = 20376;

      do {
         char var35 = var29.charAt(var33);
         int var10001 = var33 + 1;
         int var10002 = var33 + 1;
         int var37 = 0;
         char[] var36 = var29.substring(var10001, var10002 + var35).toCharArray();

         do {
            int var38 = var36[var37];

            var38 = (char)(switch (var37 % 5) {
               default -> 164;
               case 1 -> 183;
               case 2 -> 224;
               case 3 -> 219;
               case 4 -> 145;
            }) ^ var38;
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 3 | var38 << 13) & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 3 | var38 >>> 13) & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      aaba = var31;
      aabb = new Object[var31.length];
      int var25 = -2127704868;
      byte[] var23 = "\u001b§cl5÷\rÎ½Y\u0092eó©Tn\u000bæ\u0083ªo\u008fTÅ-\u0098ù\u001b\u0004m\u0016oùÀ÷¦\u0019ñ\u0002höf¹Ç§\u001c\u0000¹\"Çnf/\u000f¯ú2`\u0010þ\u0012l³á8°\u0014t¨\u008eL¿\u001eª«R\u0096F\u0011¸\u001dó2RS\u0014\u0017è/×H·\u0002¾¨oÝ\u001fâÃT6nï¸¢Ï\u0086=Ô\u0017\u008a³^l¾¾\n/\u000b\u0089Ý!\u0088{¶\u0087øÉÉz#vv:\u008aÁ\u0006?Mp\u001e\u0017\u000e1Wùü«·!º\u0082\u0095µ\tYÐ\u0088õf\b R\u0089¤Ô\u008b:¾\u009e±VñÄ\u009eÁ¾~Ô\u001céÖH?\u0094\u001eÛÎ\u0095\u009bp\u001bg;¢J\u000f¯öz¼òt\u0087Àç!i\u009dÇÒí°Nj«.®Æá´\u0014\u0017VwóµcÜ\u001d*\"RôNÃ  \u0005\rnG\u0011eEH2*ïÚþY\u0019LU\u0012 eB·}5æjÜÛVYÁ\u0090¸K\u0002ë£\u0001¶v=\u0012da\u001fæk5Ú+\u0012(¾\u000543\u0000Gm£}í\u0086¸Q\u001c£õÀÚ0²Û)\u007f#\u008aU\u001d\u001cÌCé93ñæ\u0010¾nyî×\u0016bïæê©\u008b\u000eKêðÑm¾¸4ew];«ª¬\u008cÛÙùÂúQ»c\u009cGe`õÉô´\u0019\u001e[è\u001f,;¸\u009c\u001eÙ\u0089ëG~\u0084¼\u0092xÚ\u0004\u0095?|eø¶\u009b_dWÿ½àâ\u009b;´\u0099üG\u0093¬yâdX6Ë\u0013\u008e´\f\u0092,z\u0081Tï/=¬\u008c\u000fØ£Î\u000fF\u00139=FfH\n/\u001d4X\u0083\u0093Å_\u0019(ÿ\u0012ï½\u008c/Ó¹ìè\u0002·\u008c\u0082«êHK\u0016ïD\u0010\u009f[\u009cg\r¥Gx\u0001(\u001dW\u0088æßP>V_·¤ºÓfFê@Iniæ\u0081Ñ\u0083¤\u0082e\u009aÖu`#\u0094\u001d\u0013×\u008c¸\u0011\u0094\t®-çq\u000bÎ;Ó\u008aÇ<-åcOfÆ\u0090¿MwuÆH´`¿äKZ\u0004`\u0013UX\u0015Éµ5#ç\u009d\u0099\u0080nq%×\u001cÜÒ¢\u0013þ\u0010\u001b¤\u009c0\u008a8\u0003Í`ÇÌR393\u009eå\f¸\u0082\u0003CðÔèiÄ!Ô1\\KëE/f\u0083r/á\"`?]\u009bâãùº©w)\u0013Z\u001c5¨ØQ\u0094Ý$Üí\u0098¼×Ï¥¹.\u0004«A±£\u0016XW5\u009fÌ\u001bÑ{\u000b}õ\u0090;1°¦\u008b7Ë\u008cN`õÂ?½ç8\u0003æ\u0013tÙø\u0092\u008br-Ë\u0012±cY\u0095Û·_ô|ëå\u0015\rWòR\u000eÛU)\u000fdîÁéÑ¡Ì!²3õF¡Oq;\"1\u0098S\u008fº,\r·²Ô\u0098ï\tÐÚ¹¦t\u0019\u00ad¨×\u0096\u001eKa\u0088(\u009d\u009a\u0094U\u009eà\u0089ó\u0094©¸v\u0006\u0090d\u009a¨Ñ¼¦RLO¶|ÙØ\u0080ØêÊ\u009e\u001e±ë¼²¯\u0086I¢\u001e\u0085íÆ\u000eq\nf\u009c\u0088U\t»\u0016³å)5±è\tb\u000fQÂÅ{Æ½{ì\u00adË\u008d\u0084\u0081\u0017RÜOQ\u0084÷'Í\u008d\n\u0015\u008c\u0084\"×\u0000\u0019Ë\u0015±Çä\u0088§\u0080YEæ\u0095Ä\u0004\u001e-2¬7\nx\u009du}\u0017Ya×Öi.®\u009a¦\u0091Út©AòÂtOõ\u0085éÁ¬Ê§àÿ ôDXn®>ú'?WB!ÂjÂ~âK#/\u0095\u00ad>,\u009aÕ4G4{\u0091Á:Êë\u0099\u0087\u0096\u0086y\u0088ã|0\u001e'\u009cª#h^p\u009bÌ?ÌånA½0]\u008c\u009b\u0096kð¸ç\u009a×\u0003ÒÀÔ÷£ûÕ\u0010tµ\u008fÍ\"²XH\tA\u001e\u0010V4Ä@AXóÒ(µ°´{\u0000\u0086ºE¹ò8ÏË\u008e\u0095Ç\u000eá\n/\u009cÚ\u0092\u0011\u0011Ë\u0091åa\u0095\u00810\u0016\u0002X\u0098\u001fµ°\u001ew\u0085&á\u0090cÄ\u008c\u0007³;^\u008dÿ8½£¤Î\u0085\u0094µ»-\u0010Ý´âù»^Q\u0090E\u008cwDT\u000eTö\u0088À\u0010¤\u0085»39ïeÞrÍ\u008b\u0001ù\u0085éZ¢iÔ\u0004õ\u0083õÞ[¹Í\u008d\u0088&ÚÌíTZ.qè\u009b\u000eè\t>\u0093xÎ|µ\u0013#Iß\u0013ãRCP¾a\u009c\"j\u009bª\u0004f¨\u009eVòê¯\u0003ÜQÖmkøG^\u0080*\u0010'òº½\u000fmÝÒS¾<\u001e`vu9\u000eÁ\u009d].ò\r\u001aT\u0082ôô8\u0087Úì2g\u0096ÿ%ñÐô÷Ç\u009c¾a~^&\u0091\u0084&~\u0097Å \u008d6\u0096àAôèlÞÜUè}û\u008a¯\u0096ý\u009euiP£e½k\u008b\u00adñØô¾:\u0082'Á\u0081æ¾¤\u008aÐ-áµÅó\u0089TÊÊ/Ëþ\u001aövä\u0005|²B\tf\u0018·;¸\u009aé\u0004\u0096¦¾H"
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

      String[] var21 = new String[4];
      int var19 = 0;
      String var18;
      int var20 = (var18 = baa(1148660368, var39 ^ 1526504641)).length();
      char var17 = 4;
      int var43 = -1;

      label137:
      while (true) {
         String var46 = var18.substring(++var43, var43 + var17);
         int var54 = -1;

         while (true) {
            char[] var76;
            label132: {
               char[] var56 = var46.toCharArray();
               int var10003 = var56.length;
               int var22 = 0;
               var76 = var56;
               var54 = var10003;
               char[] var92;
               int var10004;
               if (var10003 <= 1) {
                  var92 = var56;
                  var10004 = var22;
               } else {
                  var76 = var56;
                  var54 = var10003;
                  if (var10003 <= var22) {
                     break label132;
                  }

                  var92 = var56;
                  var10004 = var22;
               }

               while (true) {
                  var92[var10004] = (char)(var92[var10004] ^ switch (var22 % a(-361335189, var39 ^ -488794004)) {
                     case 0 -> a(-361335190, var39 ^ -517347131);
                     case 1 -> a(-361335191, var39 ^ -235101662);
                     case 2 -> a(-361335192, var39 ^ 676632286);
                     case 3 -> a(-361335193, var39 ^ -1059914183);
                     case 4 -> a(-361335194, var39 ^ 1445796108);
                     case 5 -> a(-361335195, var39 ^ -1270828112);
                     default -> a(-361335196, var39 ^ 1267860687);
                  });
                  var22++;
                  if (var54 == 0) {
                     var10004 = var54;
                     var92 = var76;
                  } else {
                     if (var54 <= var22) {
                        break;
                     }

                     var92 = var76;
                     var10004 = var22;
                  }
               }
            }

            String var99 = new String(var76).intern();
            switch (var54) {
               case 0:
                  var21[var19++] = var99;
                  if ((var43 += var17) >= var20) {
                     ba = var21;
                     aab = new String[4];
                     long var8 = 6702230738576096440L;
                     long[] var14 = new long[a(-361335197, var39 ^ 1215375883)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = baa(1148660370, var39 ^ 643866895)).length();
                     byte var10 = 0;

                     label111:
                     while (true) {
                        int var63 = var10;
                        var10 += 8;
                        var46 = var12.substring(var63, var10);
                        var63 = 1148660371;
                        int var82 = var39 ^ 139525069;
                        byte[] var15 = var46.getBytes("ISO-8859-1");
                        long[] var49 = var14;
                        var63 = var11++;
                        long var83 = (var15[0] & 255L) << a(-361335198, var39 ^ -1102504470)
                           | (var15[1] & 255L) << a(-361335199, var39 ^ -874407527)
                           | (var15[2] & 255L) << a(-361335200, var39 ^ -1003589386)
                           | (var15[3] & 255L) << a(-361335169, var39 ^ 782047599)
                           | (var15[4] & 255L) << a(-361335170, var39 ^ -54801033)
                           | (var15[5] & 255L) << a(-361335171, var39 ^ 2123923248)
                           | (var15[a(-361335172, var39 ^ -1327747782)] & 255L) << a(-361335173, var39 ^ -872435623)
                           | var15[a(-361335174, var39 ^ 353565563)] & 255L;
                        byte var100 = -1;

                        while (true) {
                           long var105 = var83 ^ var8;
                           switch (var100) {
                              case 0:
                                 var49[var63] = var105;
                                 if (var10 >= var13) {
                                    abb = var14;
                                    aaa = new Integer[a(-361335184, var39 ^ 209296031)];
                                    long var0 = 3350388065950664630L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = baa(1148660374, var39 ^ -1877484873)).length();
                                    byte var2 = 0;

                                    label101:
                                    while (true) {
                                       int var68 = var2;
                                       var2 += 8;
                                       var46 = var4.substring(var68, var2);
                                       var68 = 1148660375;
                                       int var86 = var39 ^ 1800249464;
                                       byte[] var7 = var46.getBytes("ISO-8859-1");
                                       long[] var52 = var6;
                                       var68 = var3++;
                                       long var87 = (var7[0] & 255L) << a(-361335217, var39 ^ 957586065)
                                          | (var7[1] & 255L) << a(-361335218, var39 ^ 579852757)
                                          | (var7[2] & 255L) << a(-361335219, var39 ^ 290499338)
                                          | (var7[3] & 255L) << a(-361335220, var39 ^ -345600641)
                                          | (var7[4] & 255L) << a(-361335221, var39 ^ -665657372)
                                          | (var7[5] & 255L) << a(-361335222, var39 ^ -1704752557)
                                          | (var7[a(-361335223, var39 ^ 555410657)] & 255L) << a(-361335224, var39 ^ -2004101371)
                                          | var7[a(-361335225, var39 ^ 1524412025)] & 255L;
                                       byte var102 = -1;

                                       while (true) {
                                          var105 = var87 ^ var0;
                                          switch (var102) {
                                             case 0:
                                                var52[var68] = var105;
                                                if (var2 >= var5) {
                                                   ab = var6;
                                                   bb = new Long[4];
                                                   aba = new String[4];
                                                   abb();
                                                   aa = new Color(
                                                      b(a(-361335203, var39 ^ -1606899032), 5841925599299013732L),
                                                      b(a(-361335204, var39 ^ -328055062), 5902769265347305896L),
                                                      b(a(-361335205, var39 ^ 787133975), 5902769265347305896L),
                                                      b(a(-361335206, var39 ^ 1454551127), 5902769265347305896L)
                                                   );
                                                   return;
                                                }
                                                break;
                                             default:
                                                var52[var68] = var105;
                                                if (var2 < var5) {
                                                   continue label101;
                                                }

                                                var5 = (var4 = baa(1148660376, var39 ^ 50234331)).length();
                                                var2 = 0;
                                          }

                                          int var71 = var2;
                                          var2 += 8;
                                          var46 = var4.substring(var71, var2);
                                          var71 = 1148660377;
                                          int var89 = var39 ^ 928173034;
                                          var7 = var46.getBytes("ISO-8859-1");
                                          var52 = var6;
                                          var68 = var3++;
                                          var87 = (var7[0] & 255L) << a(-361335226, var39 ^ -898529770)
                                             | (var7[1] & 255L) << a(-361335227, var39 ^ -1390486818)
                                             | (var7[2] & 255L) << a(-361335228, var39 ^ 1288890655)
                                             | (var7[3] & 255L) << a(-361335229, var39 ^ 99977175)
                                             | (var7[4] & 255L) << a(-361335230, var39 ^ -309221395)
                                             | (var7[5] & 255L) << a(-361335231, var39 ^ 2111233286)
                                             | (var7[a(-361335232, var39 ^ -2076659452)] & 255L) << a(-361335201, var39 ^ -1440695307)
                                             | var7[a(-361335202, var39 ^ -432821149)] & 255L;
                                          var102 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var49[var63] = var105;
                                 if (var10 < var13) {
                                    continue label111;
                                 }

                                 var13 = (var12 = baa(1148660372, var39 ^ 554734481)).length();
                                 var10 = 0;
                           }

                           int var66 = var10;
                           var10 += 8;
                           var46 = var12.substring(var66, var10);
                           var66 = 1148660373;
                           int var85 = var39 ^ -678850770;
                           var15 = var46.getBytes("ISO-8859-1");
                           var49 = var14;
                           var63 = var11++;
                           var83 = (var15[0] & 255L) << a(-361335175, var39 ^ -70422335)
                              | (var15[1] & 255L) << a(-361335176, var39 ^ -1718211788)
                              | (var15[2] & 255L) << a(-361335177, var39 ^ -1530364711)
                              | (var15[3] & 255L) << a(-361335178, var39 ^ -2062364006)
                              | (var15[4] & 255L) << a(-361335179, var39 ^ -1119813362)
                              | (var15[5] & 255L) << a(-361335180, var39 ^ -1442814747)
                              | (var15[a(-361335181, var39 ^ 719517784)] & 255L) << a(-361335182, var39 ^ -339582538)
                              | var15[a(-361335183, var39 ^ 1314910579)] & 255L;
                           var100 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var99;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label137;
                  }

                  var20 = (var18 = baa(1148660369, var39 ^ 1459528394)).length();
                  var17 = 4;
                  var43 = -1;
            }

            var46 = var18.substring(++var43, var43 + var17);
            var54 = 0;
         }
      }
   }

   @Override
   public JsonElement aba() {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.abbb ()Ljava/lang/Object;
      // 08: checkcast java/awt/Color
      // 0b: astore 2
      // 0c: aload 2
      // 0d: iload 1
      // 0e: ifne 23
      // 11: ifnonnull 26
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.abab ()Ljava/lang/Object;
      // 1c: checkcast java/awt/Color
      // 1f: goto 23
      // 22: athrow
      // 23: goto 27
      // 26: aload 2
      // 27: astore 3
      // 28: aload 3
      // 29: iload 1
      // 2a: ifne 37
      // 2d: ifnonnull 38
      // 30: goto 34
      // 33: athrow
      // 34: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.aa Ljava/awt/Color;
      // 37: astore 3
      // 38: new com/google/gson/JsonObject
      // 3b: dup
      // 3c: invokespecial com/google/gson/JsonObject.<init> ()V
      // 3f: astore 4
      // 41: aload 4
      // 43: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.aba [Ljava/lang/String;
      // 46: bipush 2
      // 47: aaload
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 4b: aload 3
      // 4c: invokevirtual java/awt/Color.getRed ()I
      // 4f: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 52: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 55: aload 4
      // 57: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.aba [Ljava/lang/String;
      // 5a: bipush 0
      // 5b: aaload
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 5f: aload 3
      // 60: invokevirtual java/awt/Color.getGreen ()I
      // 63: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 66: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 69: aload 4
      // 6b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.aba [Ljava/lang/String;
      // 6e: bipush 3
      // 6f: aaload
      // 70: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 73: aload 3
      // 74: invokevirtual java/awt/Color.getBlue ()I
      // 77: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 7a: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 7d: aload 4
      // 7f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaaab.aba [Ljava/lang/String;
      // 82: bipush 1
      // 83: aaload
      // 84: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 87: aload 3
      // 88: invokevirtual java/awt/Color.getAlpha ()I
      // 8b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 8e: invokevirtual com/google/gson/JsonObject.addProperty (Ljava/lang/String;Ljava/lang/Number;)V
      // 91: aload 4
      // 93: areturn
   }

   private static String bb(int var0, int var1) {
      int var9 = -1682411226;
      int var2 = (var0 ^ a(-361334931, var9 ^ -1304097177)) & a(-361334932, var9 ^ 55181671);
      if (aab[var2] == null) {
         char[] var3 = ba[var2].toCharArray();

         int var4 = switch (var3[0] & a(-361334933, var9 ^ 83553188)) {
            case 0 -> a(-361334934, var9 ^ 1620261971);
            case 1 -> a(-361334935, var9 ^ 579113542);
            case 2 -> a(-361334936, var9 ^ 191987447);
            case 3 -> a(-361334937, var9 ^ -153313500);
            case 4 -> a(-361334938, var9 ^ 384658152);
            case 5 -> a(-361334939, var9 ^ -109391531);
            case 6 -> a(-361334940, var9 ^ -1476373144);
            case 7 -> a(-361334941, var9 ^ 769328844);
            case 8 -> a(-361334942, var9 ^ 538167268);
            case 9 -> a(-361334943, var9 ^ 1031568348);
            case 10 -> a(-361334944, var9 ^ 493938243);
            case 11 -> a(-361334913, var9 ^ 934051623);
            case 12 -> a(-361334914, var9 ^ -1483597496);
            case 13 -> a(-361334915, var9 ^ 297205424);
            case 14 -> a(-361334916, var9 ^ -1722123530);
            case 15 -> a(-361334917, var9 ^ 317676286);
            case 16 -> a(-361334918, var9 ^ 1544060048);
            case 17 -> a(-361334919, var9 ^ 550183902);
            case 18 -> a(-361334920, var9 ^ 228769869);
            case 19 -> a(-361334921, var9 ^ -771508365);
            case 20 -> a(-361334922, var9 ^ 1529494358);
            case 21 -> a(-361334923, var9 ^ -1212242707);
            case 22 -> a(-361334924, var9 ^ 851999971);
            case 23 -> a(-361334925, var9 ^ -1136510604);
            case 24 -> a(-361334926, var9 ^ -1323926996);
            case 25 -> a(-361334927, var9 ^ -2034153064);
            case 26 -> a(-361334928, var9 ^ 1957359446);
            case 27 -> a(-361334961, var9 ^ -959107126);
            case 28 -> a(-361334962, var9 ^ 2037011009);
            case 29 -> a(-361334963, var9 ^ -837135323);
            case 30 -> a(-361334964, var9 ^ 2130854532);
            case 31 -> a(-361334965, var9 ^ 1045140141);
            case 32 -> a(-361334966, var9 ^ -1532267471);
            case 33 -> a(-361334967, var9 ^ -1920344491);
            case 34 -> a(-361334968, var9 ^ 1456267465);
            case 35 -> a(-361334969, var9 ^ 1762937031);
            case 36 -> 3;
            case 37 -> a(-361334970, var9 ^ -2034728635);
            case 38 -> a(-361334971, var9 ^ 899872379);
            case 39 -> a(-361334972, var9 ^ 1508749213);
            case 40 -> a(-361334973, var9 ^ -828238419);
            case 41 -> a(-361334974, var9 ^ 334872205);
            case 42 -> a(-361334975, var9 ^ 814238558);
            case 43 -> a(-361334976, var9 ^ -1047923861);
            case 44 -> a(-361334945, var9 ^ 343626642);
            case 45 -> a(-361334946, var9 ^ 1158937114);
            case 46 -> a(-361334947, var9 ^ 1973459232);
            case 47 -> a(-361334948, var9 ^ -1998811219);
            case 48 -> a(-361334949, var9 ^ 1719774412);
            case 49 -> a(-361334950, var9 ^ -492037229);
            case 50 -> a(-361334951, var9 ^ -1540176452);
            case 51 -> a(-361334952, var9 ^ -290962952);
            case 52 -> a(-361334953, var9 ^ 1500227147);
            case 53 -> a(-361334954, var9 ^ 1824552338);
            case 54 -> a(-361334955, var9 ^ 760127889);
            case 55 -> a(-361334956, var9 ^ -860075854);
            case 56 -> a(-361334957, var9 ^ 41030382);
            case 57 -> a(-361334958, var9 ^ 1784226017);
            case 58 -> a(-361334959, var9 ^ 636718873);
            case 59 -> a(-361334960, var9 ^ 1443178266);
            case 60 -> a(-361334993, var9 ^ 498872512);
            case 61 -> a(-361334994, var9 ^ -1201577830);
            case 62 -> a(-361334995, var9 ^ 1707127554);
            case 63 -> a(-361334996, var9 ^ 1457388421);
            case 64 -> a(-361334997, var9 ^ 1142849704);
            case 65 -> a(-361334998, var9 ^ 246031238);
            case 66 -> a(-361334999, var9 ^ 494406082);
            case 67 -> a(-361335000, var9 ^ -378053239);
            case 68 -> a(-361335001, var9 ^ 604914573);
            case 69 -> a(-361335002, var9 ^ 170419843);
            case 70 -> a(-361335003, var9 ^ 1215416447);
            case 71 -> a(-361335004, var9 ^ -493163231);
            case 72 -> a(-361335005, var9 ^ 331324726);
            case 73 -> a(-361335006, var9 ^ -718480972);
            case 74 -> a(-361335007, var9 ^ 644052496);
            case 75 -> a(-361335008, var9 ^ 1510045672);
            case 76 -> a(-361334977, var9 ^ 1291145570);
            case 77 -> a(-361334978, var9 ^ -17152738);
            case 78 -> a(-361334979, var9 ^ 1634043310);
            case 79 -> a(-361334980, var9 ^ 427722549);
            case 80 -> a(-361334981, var9 ^ -441065426);
            case 81 -> a(-361334982, var9 ^ 1157012458);
            case 82 -> a(-361334983, var9 ^ 1654838018);
            case 83 -> a(-361334984, var9 ^ 1785411066);
            case 84 -> a(-361334985, var9 ^ -1531512532);
            case 85 -> a(-361334986, var9 ^ -725249350);
            case 86 -> a(-361334987, var9 ^ -179441929);
            case 87 -> a(-361334988, var9 ^ -1822749090);
            case 88 -> a(-361334989, var9 ^ -86663951);
            case 89 -> a(-361334990, var9 ^ 369242326);
            case 90 -> a(-361334991, var9 ^ 271602683);
            case 91 -> a(-361334992, var9 ^ -1828539967);
            case 92 -> a(-361335025, var9 ^ -463792519);
            case 93 -> a(-361335026, var9 ^ -1282534447);
            case 94 -> a(-361335027, var9 ^ 193550081);
            case 95 -> a(-361335028, var9 ^ 1793385221);
            case 96 -> a(-361335029, var9 ^ 1350057749);
            case 97 -> a(-361335030, var9 ^ -1292060712);
            case 98 -> a(-361335031, var9 ^ 883477597);
            case 99 -> a(-361335032, var9 ^ 1217382216);
            case 100 -> a(-361335033, var9 ^ -310889709);
            case 101 -> a(-361335034, var9 ^ -1005591153);
            case 102 -> a(-361335035, var9 ^ 59655199);
            case 103 -> a(-361335036, var9 ^ -1907836276);
            case 104 -> a(-361335037, var9 ^ 850453759);
            case 105 -> a(-361335038, var9 ^ -675305771);
            case 106 -> a(-361335039, var9 ^ 1225740745);
            case 107 -> a(-361335040, var9 ^ 1232741194);
            case 108 -> a(-361335009, var9 ^ 536960050);
            case 109 -> a(-361335010, var9 ^ -1936748293);
            case 110 -> a(-361335011, var9 ^ 372550315);
            case 111 -> a(-361335012, var9 ^ -526261051);
            case 112 -> a(-361335013, var9 ^ -593131582);
            case 113 -> a(-361335014, var9 ^ 229369065);
            case 114 -> a(-361335015, var9 ^ -1527372941);
            case 115 -> a(-361335016, var9 ^ 435367732);
            case 116 -> a(-361335017, var9 ^ -1874343504);
            case 117 -> a(-361335018, var9 ^ 45690764);
            case 118 -> a(-361335019, var9 ^ 238319055);
            case 119 -> a(-361335020, var9 ^ -2013623784);
            case 120 -> a(-361335021, var9 ^ 826946742);
            case 121 -> a(-361335022, var9 ^ -1415136468);
            case 122 -> a(-361335023, var9 ^ 1240869043);
            case 123 -> a(-361335024, var9 ^ 1635093924);
            case 124 -> a(-361334801, var9 ^ -559952714);
            case 125 -> a(-361334802, var9 ^ 1787215272);
            case 126 -> a(-361334803, var9 ^ 1866464374);
            case 127 -> a(-361334804, var9 ^ 483124354);
            case 128 -> a(-361334805, var9 ^ 512254356);
            case 129 -> a(-361334806, var9 ^ 586881769);
            case 130 -> a(-361334807, var9 ^ -1054374155);
            case 131 -> a(-361334808, var9 ^ -937409072);
            case 132 -> a(-361334809, var9 ^ 1817382562);
            case 133 -> a(-361334810, var9 ^ -1616697874);
            case 134 -> a(-361334811, var9 ^ 2061115525);
            case 135 -> a(-361334812, var9 ^ 1872990105);
            case 136 -> a(-361334813, var9 ^ 1427639222);
            case 137 -> a(-361334814, var9 ^ 1514422450);
            case 138 -> a(-361334815, var9 ^ -1171698721);
            case 139 -> a(-361334816, var9 ^ -1836722923);
            case 140 -> a(-361334785, var9 ^ 2117713763);
            case 141 -> a(-361334786, var9 ^ -741422457);
            case 142 -> a(-361334787, var9 ^ -250843022);
            case 143 -> a(-361334788, var9 ^ -1825775045);
            case 144 -> a(-361334789, var9 ^ 215026469);
            case 145 -> a(-361334790, var9 ^ -1018275011);
            case 146 -> a(-361334791, var9 ^ 1015188754);
            case 147 -> a(-361334792, var9 ^ -1214355267);
            case 148 -> a(-361334793, var9 ^ -3636333);
            case 149 -> 4;
            case 150 -> a(-361334794, var9 ^ -885146557);
            case 151 -> a(-361334795, var9 ^ 1398244219);
            case 152 -> a(-361334796, var9 ^ 544925856);
            case 153 -> 5;
            case 154 -> a(-361334797, var9 ^ 553470341);
            case 155 -> a(-361334798, var9 ^ 809619112);
            case 156 -> a(-361334799, var9 ^ -320482969);
            case 157 -> a(-361334800, var9 ^ 2016770180);
            case 158 -> a(-361334833, var9 ^ 321518978);
            case 159 -> a(-361334834, var9 ^ 1586017684);
            case 160 -> a(-361334835, var9 ^ -739118966);
            case 161 -> a(-361334836, var9 ^ -657198901);
            case 162 -> a(-361334837, var9 ^ 555270978);
            case 163 -> a(-361334838, var9 ^ -1094746374);
            case 164 -> a(-361334839, var9 ^ 1479133873);
            case 165 -> a(-361334840, var9 ^ 348983527);
            case 166 -> a(-361334841, var9 ^ 1927936972);
            case 167 -> a(-361334842, var9 ^ 1051512149);
            case 168 -> a(-361334843, var9 ^ 953673611);
            case 169 -> a(-361334844, var9 ^ 1877579594);
            case 170 -> a(-361334845, var9 ^ -1292151830);
            case 171 -> a(-361334846, var9 ^ -384884299);
            case 172 -> a(-361334847, var9 ^ -141631233);
            case 173 -> a(-361334848, var9 ^ 584546678);
            case 174 -> a(-361334817, var9 ^ 1816510543);
            case 175 -> a(-361334818, var9 ^ -1203527192);
            case 176 -> a(-361334819, var9 ^ -453411414);
            case 177 -> a(-361334820, var9 ^ 1491994399);
            case 178 -> a(-361334821, var9 ^ -733381532);
            case 179 -> a(-361334822, var9 ^ 1811065265);
            case 180 -> a(-361334823, var9 ^ -557996909);
            case 181 -> a(-361334824, var9 ^ -1120952683);
            case 182 -> a(-361334825, var9 ^ -1370282961);
            case 183 -> a(-361334826, var9 ^ 757976395);
            case 184 -> a(-361334827, var9 ^ -2136586256);
            case 185 -> 1;
            case 186 -> a(-361334828, var9 ^ -1196523024);
            case 187 -> a(-361334829, var9 ^ -535446752);
            case 188 -> a(-361334830, var9 ^ -1229317096);
            case 189 -> a(-361334831, var9 ^ -1565213605);
            case 190 -> a(-361334832, var9 ^ 290927820);
            case 191 -> a(-361334865, var9 ^ 662818668);
            case 192 -> a(-361334866, var9 ^ 1518515645);
            case 193 -> a(-361334867, var9 ^ -58146270);
            case 194 -> a(-361334868, var9 ^ 2031811557);
            case 195 -> a(-361334869, var9 ^ -1783318176);
            case 196 -> a(-361334870, var9 ^ -1454496763);
            case 197 -> a(-361334871, var9 ^ -1184845431);
            case 198 -> a(-361334872, var9 ^ -1882931215);
            case 199 -> a(-361334873, var9 ^ -1862084030);
            case 200 -> a(-361334874, var9 ^ -1280391252);
            case 201 -> a(-361334875, var9 ^ 1186887373);
            case 202 -> a(-361334876, var9 ^ -489003538);
            case 203 -> a(-361334877, var9 ^ 91933044);
            case 204 -> a(-361334878, var9 ^ 1511379084);
            case 205 -> a(-361334879, var9 ^ -1124515379);
            case 206 -> a(-361334880, var9 ^ -1091280171);
            case 207 -> a(-361334849, var9 ^ 5089938);
            case 208 -> a(-361334850, var9 ^ 1960498463);
            case 209 -> a(-361334851, var9 ^ -474897452);
            case 210 -> a(-361334852, var9 ^ -1952628141);
            case 211 -> a(-361334853, var9 ^ -749520413);
            case 212 -> a(-361334854, var9 ^ -130312065);
            case 213 -> a(-361334855, var9 ^ 84534476);
            case 214 -> a(-361334856, var9 ^ 768300302);
            case 215 -> a(-361334857, var9 ^ -1005984730);
            case 216 -> a(-361334858, var9 ^ -342569141);
            case 217 -> a(-361334859, var9 ^ 1448719280);
            case 218 -> a(-361334860, var9 ^ -887589450);
            case 219 -> a(-361334861, var9 ^ 1034968887);
            case 220 -> a(-361334862, var9 ^ 2004951043);
            case 221 -> 2;
            case 222 -> a(-361334863, var9 ^ 407177475);
            case 223 -> a(-361334864, var9 ^ -646625580);
            case 224 -> a(-361334897, var9 ^ -1782922232);
            case 225 -> a(-361334898, var9 ^ 2075470243);
            case 226 -> a(-361334899, var9 ^ -848812277);
            case 227 -> a(-361334900, var9 ^ -1963611827);
            case 228 -> a(-361334901, var9 ^ -977553973);
            case 229 -> a(-361334902, var9 ^ -1343745769);
            case 230 -> a(-361334903, var9 ^ 1639082968);
            case 231 -> a(-361334904, var9 ^ 673398583);
            case 232 -> a(-361334905, var9 ^ 786301484);
            case 233 -> a(-361334906, var9 ^ 1912479899);
            case 234 -> a(-361334907, var9 ^ 545900282);
            case 235 -> a(-361334908, var9 ^ 596032857);
            case 236 -> a(-361334909, var9 ^ 1210592921);
            case 237 -> a(-361334910, var9 ^ -836328829);
            case 238 -> a(-361334911, var9 ^ -1768176807);
            case 239 -> a(-361334912, var9 ^ 1989457502);
            case 240 -> a(-361334881, var9 ^ 1057115201);
            case 241 -> a(-361334882, var9 ^ -1522596977);
            case 242 -> a(-361334883, var9 ^ 2139596721);
            case 243 -> a(-361334884, var9 ^ -1007089999);
            case 244 -> a(-361334885, var9 ^ -1305737078);
            case 245 -> a(-361334886, var9 ^ -1802879286);
            case 246 -> a(-361334887, var9 ^ -1208234026);
            case 247 -> a(-361334888, var9 ^ 214870063);
            case 248 -> a(-361334889, var9 ^ -121662536);
            case 249 -> a(-361334890, var9 ^ 526966298);
            case 250 -> a(-361334891, var9 ^ -1036064898);
            case 251 -> a(-361334892, var9 ^ 1192563744);
            case 252 -> 0;
            case 253 -> a(-361334893, var9 ^ 524968395);
            case 254 -> a(-361334894, var9 ^ 1331507341);
            default -> a(-361334895, var9 ^ -583738045);
         };
         int var5 = (var1 & a(-361334896, var9 ^ -1150850957)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-361335185, var9 ^ 1252453880)) >>> a(-361335186, var9 ^ 936615868)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-361335187, var9 ^ -1696897047);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-361335188, var9 ^ 87291347);
            }
         }

         aab[var2] = new String(var3).intern();
      }

      return aab[var2];
   }

   public abaabaaab(String var1, Color var2) {
      this((Object)var1, var2);
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-361335207, -765445262 ^ 1716119023)) & a(-361335208, -765445262 ^ -1501205887);
      if (bb[var3] == null) {
         bb[var3] = ab[var3] ^ var1;
      }

      return bb[var3];
   }

   private static void abb() {
      int var0 = -48386308;
      aba[0] = aa(
         bb(a(-361335209, var0 ^ 90676865), a(-361335210, var0 ^ -2117732841)).toCharArray(),
         aaa(a(-361335211, var0 ^ -969971540), 9077368315592110807L),
         b(a(-361335212, var0 ^ 483404696), 2556195682311299197L)
      );
      aba[1] = aa(
         bb(a(-361335213, var0 ^ 201599340), a(-361335214, var0 ^ -1001895088)).toCharArray(),
         aaa(a(-361335215, var0 ^ -679237264), 2578113264212316025L),
         b(a(-361335216, var0 ^ -1472677323), 1975597112691132679L)
      );
      aba[2] = aa(
         bb(a(-361335249, var0 ^ -852258121), a(-361335250, var0 ^ -2012357909)).toCharArray(),
         aaa(a(-361335251, var0 ^ -521316663), 4729946464197592706L),
         b(a(-361335252, var0 ^ 1181919218), 1209656153046752410L)
      );
      aba[3] = aa(
         bb(a(-361335253, var0 ^ -1613781352), a(-361335254, var0 ^ 352953143)).toCharArray(),
         aaa(a(-361335255, var0 ^ 262245629), 5493262111073615452L),
         b(a(-361335256, var0 ^ -786194474), 4804937507988476899L)
      );
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-361335257, 387878005 ^ 354207658);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(abb[var3] ^ var1);
      }

      return aaa[var3];
   }
}
