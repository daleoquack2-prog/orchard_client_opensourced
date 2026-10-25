package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;

@Environment(EnvType.CLIENT)
public final class baa extends abbaabbaa {
   private double aa;
   private volatile long ab;
   private static final int[] baba;
   private static final double ba = 4.0;
   private static final String[] bb;
   private static final double aaa = 0.35;
   private long aab;
   private final baaaabaa aba;
   private static String[] abb;
   private static final Integer[] baa;
   private volatile int bab;
   private volatile boolean bba;
   private static final String[] bbb;
   private static final long[] aaaa;
   private final bababa aaab;
   private volatile int aaba;
   private volatile long aabb;
   private boolean abaa;
   private volatile int abab;
   private static final long[] abba;
   private static final String[] babb;
   private static final Object[] bbaa;
   private double abbb;
   private final baabaab baaa;
   private static final Long[] baab;

   public int aa() {
      return this.abab;
   }

   private int ab(double var1) {
      return (int)Math.round(Math.max(0.0, Math.min(1000.0, var1)));
   }

   @Override
   public String ababa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.get(ArrayList.java:427)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitchOnEnumJ21(SwitchHelper.java:341)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplify(SwitchHelper.java:41)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:388)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 04: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 07: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababab
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababab.ordinal ()I
      // 0d: lookupswitch 27 2 0 38 1 58
      // 28: new java/lang/MatchException
      // 2b: dup
      // 2c: aconst_null
      // 2d: aconst_null
      // 2e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 31: athrow
      // 32: athrow
      // 33: aload 0
      // 34: aload 0
      // 35: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 38: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 3b: checkcast java/lang/Double
      // 3e: invokevirtual java/lang/Double.doubleValue ()D
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aaaa (D)Ljava/lang/String;
      // 44: goto 4f
      // 47: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.abb [Ljava/lang/String;
      // 4a: bipush 0
      // 4b: aaload
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 4f: areturn
   }

   public boolean ba() {
      return this.bba;
   }

   private void bb(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: iload 1
      // 05: ifgt 0a
      // 08: return
      // 09: athrow
      // 0a: dconst_0
      // 0b: iload 1
      // 0c: i2l
      // 0d: aload 0
      // 0e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aab J
      // 11: lsub
      // 12: l2d
      // 13: invokestatic java/lang/Math.max (DD)D
      // 16: dstore 3
      // 17: iload 2
      // 18: ifne 45
      // 1b: aload 0
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.abaa Z
      // 1f: ifne 32
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: dload 3
      // 28: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aa D
      // 2b: aload 0
      // 2c: bipush 1
      // 2d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.abaa Z
      // 30: return
      // 31: athrow
      // 32: aload 0
      // 33: dup
      // 34: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aa D
      // 37: dload 3
      // 38: aload 0
      // 39: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aa D
      // 3c: dsub
      // 3d: ldc2_w 0.35
      // 40: dmul
      // 41: dadd
      // 42: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aa D
      // 45: return
   }

   private static int aaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ abbb(-1577006073, 289022349 ^ 1437293173);
      if (baa[var3] == null) {
         baa[var3] = (int)(abba[var3] ^ var1);
      }

      return baa[var3];
   }

   private static String aab(char[] var0, long var1, int var3) {
      int var4 = aaa(abbb(-1577006074, 1154739340 ^ 1553808899), 5210134754199687026L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aaa(abbb(-1577006075, 1154739340 ^ 1721467024), 299605727971434218L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public long aba() {
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
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.bba Z
      // 0c: ifeq 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aabb J
      // 1b: goto 1f
      // 1e: lconst_0
      // 1f: lreturn
   }

   private int abb(int param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.abaa Z
      // 08: iload 2
      // 09: ifne 22
      // 0c: ifeq 1d
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: aload 0
      // 15: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aa D
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.ab (D)I
      // 1b: ireturn
      // 1c: athrow
      // 1d: bipush 0
      // 1e: iload 1
      // 1f: invokestatic java/lang/Math.max (II)I
      // 22: ireturn
   }

   public baa(baaaabaa var1) {
      super(
         aabbaaaba.aaab(abb[3]),
         bbaabbba.bba,
         aabbaaaba.aaab(abb[2])
      );
      this.baaa = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(abb[5]),
            abaababab.class,
            abaababab.b
         )
      );
      this.aaab = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(abb[4]), 150.0, 0.0, 1000.0, 5.0)
            .bb(aabbaaaba.abba(abb[1]))
      );
      this.aba = var1;
      this.aaab.babb(this::aabb);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = -1575064051;
      String var24 = "癸쐄屜שּׁ뿾렅롤䫊궶⻗娋堝䅇㟈糖셄癍䆩逭쒠\ue39eힾ倝\uf441छ椷䄫᥊軚Ҳ伅ᑄ\ue770\udc0d穧텋␂ອ﹨\uf03f瞔棁⧾\udc61\uebb3⢳哰䚲櫶鏅\uf837觓鹈㖰憝鷻쨚單瑃\uf7e9왪ｦ\ue044̃ᮮ㬳⟣ꐚ⃬\ue029㹬䕠襏圹떎菅ꁥ䌆흂她\uf793ℶ㰽껖쎨鯿\uf6b9触铳\ue4b3喥᭥艼쓻餪畣䜜\u0e83끐ⱶ풮䟕⩭鞨\ud9c2혮໒ⲝ\ue38aᲹ椚텡㲚꼔钸臂즵\uf625踶佐＿煆랛帎㳕훂ࢽഘ潵濲濖潫澯澨潴澲澰漰濗潍潭潖濺濠濠漘濑漣潑澃濕漫演漝潄漿潊澣漳澑澢濚潔濪澸澷潾澳濷漒漹潧澞漅潀潫澿漼濶漮漬濵澅潚\ue2fc\ue27f\ue227\ue2de\ue295\ue255\ue2f2\ue2fb\ue20d\ue2e9␔④Ⓨ␆\u2439⑸ⓛⓟ⒘⑭ⓝ⑷⑴Ⓧ⒭Ⓙ횸혻홣횚훑협횶횿홉횭ᛄᚼᛌᙸᘸᚡᚍᙆᙓᛶᙾᘦᘍᚷᙓᛌᙦᙣᘤᛮᙷᛕᙩᚮᚺᙗᛑᚹᘕᚿᙁᙆӨѫгӊҁсӦӯЙӽ獞珪猯率猶珘玲玦玬猄獇珆猇猵猤獾阼隿雧阞陕隕防阻雍阩";
      char[] var25 = "⏈⎶⏗⏥⏿⏥⏏⏥⏿⏥".toCharArray();
      short var23 = 9199;
      byte var30 = -1;
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         int var28 = 0;
         int var29 = 0;
         if (var30 == 0) {
            babb = var26;
            bbaa = new Object[var26.length];
            byte var40 = 0;
            baba = new int[339];
            int var10001 = 0;
            byte[] var10002 = "8qÎíd®!G^¨ÁQãf¶Áá\u009a\u00adô\u001dD\u0001jÙe\rõáàõß\u0080#\u0015ö\u0017Å`ókß\u0087 !\u0004 \u001dã\u0017?\u008e®Ø3MI,3\u000bÙ\"LßÁ\u001eü-¬\u001cÇ\u0014]§u\u0098\t©ZèÀ\u0011@ºwuY\u0005¶í\u0083\u0087®³\u008aïÛ\u001e5A¸µh£Påµ\u0091£lÄ\u001aæ{\u0013\u0084üÒ!~ä\r\u008fÏ}íÿùóÚ\rÈMÚµHC4¦\u0084\u0084'Õ\u0018\u0097 \u0019¹ûg\u0093u\u008aÑB~Mäoä\túó\u0011_\u0093qBcÈ×Ê \u0017\thÙq\u0094\u001a)ìy\u0086\r\u0001¶\tE»É°bÓgÞp,èPçwhwwð\u008e\u0007SÁ\u0081ÑìòSé~\u0017ûC\u0013õc\u0087\u009eà\u0015®\u0081¶K62zÊQÄÙ\u008b\u0013.\u0003ÍÈö£¯½òÿß\fEÜ\u00adP\u009aìkQ»\u0092<~w\u0095óu\u00ad\u0088|Hµ\n\u0010Îóê¥ö\u001dEÛ¹\u008fCº\u001b¨È\u0012ñ¼k\u007f\u009cèª3\u001cßµ§ÍÕOJ\n\u0086ýri2¶OìÈ`ÙìjN2¾¡\u0006!gX\u0098¥ÀÍÎy¨öÙ¢-\u0082ö4Ä\u0088%Æ\u0092ÞR\u008c4Z3²×ÍßÇ%%ì\u0093°Óæ\u0007[v\u0080zxº¬\u008b¯\u009fFÚÒoQt\u0093\u0083Í\u0006yÍõg \u008cµ5\u0085V0|8oT\tìÊT\u00994å;GtÑÌ<#qÊKö\u001eªÚ\u001dC\u009b\u009c2ÌÄ\u0007¨Âï\u0092\u0016µ\u008eÖM·\u0014Â³¦\u0094\fG{¸Ù4Ö\u0092É\u001e\u008b\u001f ÌÚ\u007f9¿õBr\u009eÓ\u0082(îêrür·¬\u0017uêsUP¯\u0080\u00adñç¯ó\u0082OÉ\u0018{ \u008bª°\u008ekV\u0094PB½õÇûÙ\u00976sßF;\u007fC\u008f·Â¦$¾Ê\u0098\u009b`û?\u008c°\b>lÛh÷lk\u0098I\u0017\u0084t\u0000\u001b\u009dòZ\u001e²3H\u001e\u0007þ\u0000p,Ö.Pw»O\u008cLý\u0083©{eÒzç\u001d©b\u00903rX\u0081}å¶\u0014<Ep¬J\u0091\u0086(\u009cÚÆ\u0000MvÊ×W?¨j\u0004£ü=_ìÄeÙúè`¦x\u001e¡ÉãÂ $ð\u0085G|Ð\u0083¥Ý(vÎ(\u0000\u0003'Ê'ó·\u001f På\u0013òho¹¡aÂ/q\u001ai\u0016\u0002s\u0090\u008eóBÎsÙEà\u0005qÃ×bï\t\u0086õ¼\u0018¦Ñ\u0014·\u0090Ã\u008c\\\u008fÁ\u0000¢Ö$ãÚ\u007f\u0015OÏ{´C\u0015ÝFæ\u0093>\u0093Ùhá±\u001bZV±f\u009bw[L\u0000ó\u0082}/]$\u0010U·ó3þ\u0001\u001b³Mÿ\u0090/vµ®p\u0015\u009b\u0010\u0090)c\tUîðÃ\u001e¾ÿ\u0010\u0095-Ä\u0003<é¡SÛ\u009c\u0018½LëÚ¾)?\u00927\"Õ§@¨\u008eP\u009a\u0002\u0097\u0086bÃÙ¿òå\bÀáajKvÍd[\u0093¾q\u0088N\u001c\u0089Öl=\u0096\u001cA\u0019ôÐ*q~ÿB\u00adÇß#XÀ\u0089½l\u009aÿ\u009d-Uø¼Äà|Yù^\u0003¥Ç\u0084d]\u008fÿ¢\u0007u\u0084Ü»}\u001f7cëIh(s\u0080©í\u0080r\u0082ûôl¾\u001fzç|½?@³\u000brmât£Ê\u000f¦\u0083±\u0095`Á\u0018\u0007\u0099a\u0080~Ûh\u0081\u001a\u008e<Ø~æïP\u007fõcF¶ïòÀ7.)%p\u0005jý\u0005î¿O³f\u009dV\u0019\u0089JTu\u0083r\u008cº\u0013¸Ãa\u008a\u0095h~ýþÎ£ö$å\u001fêhµ\t§\u0081s¬\u0007Îäcö_@D\fm\u008ap\u0099Ù#³;Ô\u009d».§ÐÃ.¸\u0001\u0099ôp_\u0099gý\u0090.Ä·>;\u0092}e Ö\u008a»Þ\u0084¬!ï~&È\u0016üwº¡é\u0003g\n\u008bÉfqüÜ¡Q\u0080,µ\"ßG\u009aÎ±+\u0082\u009döÞ)Ô\u009a\u008fvõµËR|óv\u008cQg´ù\\[×\u0016¯W¯`a\u0092å²ætQY\u0001\u0087[L\u009a5\u0086ÒbáQ_5\u000bé\u0093\u0010D\u001c¬wA9cå+pÞ\u0004á´Æ]®\u0093\u000e\u009cW×¸\u008añQÕ\rÜuÈ?\u009f;§¨\u0087ªj\u008c\u001d\nÕ\nFq:+5\u009b(Z\u0093u;Í\u0001 ¾ªqÞDj&¹ìj\u0013¡Kn.öO¡\f\u000e÷ÔóÐº\u0082±Ð·SaX×\u0092-Æ\u009d\u0098Òµ\u0004ïÀok\u0006OÜþ\u000f\u0090O\u0005µ]~\\\u0090-hôIvËíº\u009e¹·\u00ad\u0089\u001c\u008d¯Q\u0083;\u0010Ú9\u001b¬8â\u0011\u008b\bø\u0088Æý\u001fGWÅ\u0001X\u0017%?ýÌ\u0004\fpß\u0085ÑåÕà4ÈÉÖn\u000bBÞ\u0012ád ¬\u000bÎß·¥\bigòùg\u0094a\\ýnQû²M\u0083ü\u0091Ü¹Óû\u00adóì\u001fö«Î\u0094És\u0017HóÃuMIb\u00ad\t¾\u0015"
               .getBytes("ISO-8859-1");

            int var99;
            do {
               baba[var40] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -555715572;
               var40 += 1;
               var99 = var10001 + 4;
               var10001 += 4;
            } while (var99 < var10002.length);

            String[] var21 = new String[abbb(-1577005800, var34 ^ 1410323175)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = baaa(298465697, var34 ^ -2021109151)).length();
            int var17 = abbb(-1577005785, var34 ^ -752683313);
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
                     int var121;
                     if (var99 <= 1) {
                        var103 = var53;
                        var121 = var22;
                     } else {
                        var78 = var53;
                        var10001 = var99;
                        if (var99 <= var22) {
                           break label137;
                        }

                        var103 = var53;
                        var121 = var22;
                     }

                     while (true) {
                        var103[var121] = (char)(var103[var121] ^ switch (var22 % abbb(-1577005788, var34 ^ 1390643674)) {
                           case 0 -> abbb(-1577005789, var34 ^ -726076039);
                           case 1 -> abbb(-1577005790, var34 ^ -171238858);
                           case 2 -> abbb(-1577005791, var34 ^ -2073169472);
                           case 3 -> abbb(-1577005792, var34 ^ 335521021);
                           case 4 -> abbb(-1577005777, var34 ^ 1955551895);
                           case 5 -> abbb(-1577005778, var34 ^ -1260897556);
                           default -> 4;
                        });
                        var22++;
                        if (var10001 == 0) {
                           var121 = var10001;
                           var103 = var78;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var103 = var78;
                           var121 = var22;
                        }
                     }
                  }

                  String var110 = new String(var78).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var110;
                        if ((var38 += var17) >= var20) {
                           bbb = var21;
                           bb = new String[abbb(-1577005787, var34 ^ 1987651941)];
                           long var8 = 6374362853425027088L;
                           long[] var14 = new long[abbb(-1577005779, var34 ^ -1259527605)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = baaa(298465699, var34 ^ -1446235915)).length();
                           byte var10 = 0;

                           label116:
                           while (true) {
                              int var60 = var10;
                              var10 += 8;
                              String var43 = var12.substring(var60, var10);
                              var60 = 298465698;
                              int var84 = var34 ^ 616111650;
                              byte[] var15 = var43.getBytes("ISO-8859-1");
                              long[] var44 = var14;
                              var60 = var11++;
                              long var85 = (var15[0] & 255L) << abbb(-1577005780, var34 ^ -1328516449)
                                 | (var15[1] & 255L) << abbb(-1577005781, var34 ^ 2146601496)
                                 | (var15[2] & 255L) << abbb(-1577005782, var34 ^ 168645724)
                                 | (var15[3] & 255L) << abbb(-1577005783, var34 ^ 1548702794)
                                 | (var15[4] & 255L) << abbb(-1577005784, var34 ^ -1918903261)
                                 | (var15[5] & 255L) << abbb(-1577005769, var34 ^ 1288914318)
                                 | (var15[abbb(-1577005770, var34 ^ 1177302552)] & 255L) << abbb(-1577005771, var34 ^ 826207346)
                                 | var15[abbb(-1577005772, var34 ^ -659464223)] & 255L;
                              byte var111 = -1;

                              while (true) {
                                 long var123 = var85 ^ var8;
                                 switch (var111) {
                                    case 0:
                                       var44[var60] = var123;
                                       if (var10 >= var13) {
                                          abba = var14;
                                          baa = new Integer[abbb(-1577005766, var34 ^ 1442216863)];
                                          long var0 = 4365931783001803898L;
                                          long[] var6 = new long[abbb(-1577005767, var34 ^ 402889812)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = baaa(298465703, var34 ^ -789958303)).length();
                                          byte var2 = 0;

                                          label106:
                                          while (true) {
                                             int var65 = var2;
                                             var2 += 8;
                                             String var46 = var4.substring(var65, var2);
                                             var65 = 298465702;
                                             int var88 = var34 ^ -1028848351;
                                             byte[] var7 = var46.getBytes("ISO-8859-1");
                                             long[] var47 = var6;
                                             var65 = var3++;
                                             long var89 = (var7[0] & 255L) << abbb(-1577005768, var34 ^ -1992587876)
                                                | (var7[1] & 255L) << abbb(-1577005753, var34 ^ -908346498)
                                                | (var7[2] & 255L) << abbb(-1577005754, var34 ^ 318408954)
                                                | (var7[3] & 255L) << abbb(-1577005755, var34 ^ 24860020)
                                                | (var7[4] & 255L) << abbb(-1577005756, var34 ^ 186560592)
                                                | (var7[5] & 255L) << abbb(-1577005757, var34 ^ 388558188)
                                                | (var7[abbb(-1577005758, var34 ^ -1675587191)] & 255L) << abbb(-1577005759, var34 ^ -1168232602)
                                                | var7[abbb(-1577005760, var34 ^ 270611662)] & 255L;
                                             var111 = -1;

                                             while (true) {
                                                var123 = var89 ^ var0;
                                                switch (var111) {
                                                   case 0:
                                                      var47[var65] = var123;
                                                      if (var2 >= var5) {
                                                         aaaa = var6;
                                                         baab = new Long[abbb(-1577005738, var34 ^ -1414280674)];
                                                         abb = new String[aaa(abbb(-1577005739, var34 ^ 1945592893), 2692626927174649578L)];
                                                         abaa();
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var47[var65] = var123;
                                                      if (var2 < var5) {
                                                         continue label106;
                                                      }

                                                      var5 = (var4 = baaa(298465705, var34 ^ -1256641543)).length();
                                                      var2 = 0;
                                                }

                                                int var68 = var2;
                                                var2 += 8;
                                                String var48 = var4.substring(var68, var2);
                                                var68 = 298465704;
                                                int var91 = var34 ^ 1350114078;
                                                var7 = var48.getBytes("ISO-8859-1");
                                                var47 = var6;
                                                var65 = var3++;
                                                var89 = (var7[0] & 255L) << abbb(-1577005745, var34 ^ -694688959)
                                                   | (var7[1] & 255L) << abbb(-1577005746, var34 ^ 664342763)
                                                   | (var7[2] & 255L) << abbb(-1577005747, var34 ^ -2113672496)
                                                   | (var7[3] & 255L) << abbb(-1577005748, var34 ^ 625789211)
                                                   | (var7[4] & 255L) << abbb(-1577005749, var34 ^ 577722414)
                                                   | (var7[5] & 255L) << abbb(-1577005750, var34 ^ 218443421)
                                                   | (var7[abbb(-1577005751, var34 ^ 853636552)] & 255L) << abbb(-1577005752, var34 ^ 275401239)
                                                   | var7[abbb(-1577005737, var34 ^ -910790465)] & 255L;
                                                var111 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var44[var60] = var123;
                                       if (var10 < var13) {
                                          continue label116;
                                       }

                                       var13 = (var12 = baaa(298465701, var34 ^ -500805329)).length();
                                       var10 = 0;
                                 }

                                 int var63 = var10;
                                 var10 += 8;
                                 String var45 = var12.substring(var63, var10);
                                 var63 = 298465700;
                                 int var87 = var34 ^ 285022580;
                                 var15 = var45.getBytes("ISO-8859-1");
                                 var44 = var14;
                                 var60 = var11++;
                                 var85 = (var15[0] & 255L) << abbb(-1577005773, var34 ^ -781268022)
                                    | (var15[1] & 255L) << abbb(-1577005774, var34 ^ 1805908650)
                                    | (var15[2] & 255L) << abbb(-1577005775, var34 ^ 1322511369)
                                    | (var15[3] & 255L) << abbb(-1577005776, var34 ^ -1752674551)
                                    | (var15[4] & 255L) << abbb(-1577005761, var34 ^ 1684028756)
                                    | (var15[5] & 255L) << abbb(-1577005762, var34 ^ 1937219479)
                                    | (var15[abbb(-1577005763, var34 ^ 1907294252)] & 255L) << abbb(-1577005764, var34 ^ -836453877)
                                    | var15[abbb(-1577005765, var34 ^ 1925603585)] & 255L;
                                 var111 = 0;
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

                        var20 = (var18 = baaa(298465696, var34 ^ -2139406870)).length();
                        var17 = abbb(-1577005786, var34 ^ -513689427);
                        var38 = -1;
                  }

                  var41 = var18.substring(++var38, var38 + var17);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var29 = var25[var27] ^ var23;
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               short var33 = switch (var32 % 6) {
                  default -> 183;
                  case 1 -> 168;
                  case 2 -> 3;
                  case 3 -> 202;
                  case 4 -> 67;
                  case 5 -> 197;
               };
               var31[var32] = (char)(var31[var32] ^ var33);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private double bab(int param1, int param2) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababab
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababab.ordinal ()I
      // 11: iload 3
      // 12: ifne 52
      // 15: lookupswitch 28 2 0 39 1 60
      // 30: athrow
      // 31: new java/lang/MatchException
      // 34: dup
      // 35: aconst_null
      // 36: aconst_null
      // 37: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 3a: athrow
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 0
      // 3e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 44: checkcast java/lang/Double
      // 47: invokevirtual java/lang/Double.doubleValue ()D
      // 4a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.ab (D)I
      // 4d: i2d
      // 4e: goto 6d
      // 51: iload 2
      // 52: iload 3
      // 53: ifne 6c
      // 56: ifle 63
      // 59: goto 5d
      // 5c: athrow
      // 5d: iload 2
      // 5e: i2d
      // 5f: goto 6d
      // 62: athrow
      // 63: iload 1
      // 64: aload 0
      // 65: iload 1
      // 66: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.abb (I)I
      // 69: invokestatic java/lang/Math.max (II)I
      // 6c: i2d
      // 6d: dreturn
   }

   private static long bba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ abbb(-1577006076, 1499133488 ^ 958604798)) & abbb(-1577006077, 1499133488 ^ -1004521479);
      if (baab[var3] == null) {
         baab[var3] = aaaa[var3] ^ var1;
      }

      return baab[var3];
   }

   private int bbb(int var1) {
      int var2 = this.ab(this.abbb);
      return Math.max(var1, var2);
   }

   @Override
   public void aabaa() {
      this.b();
      aabaaa.aababab();
   }

   private void a() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.bba Z
      // 08: iload 1
      // 09: ifne 3e
      // 0c: ifne 3d
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aabb J
      // 17: lconst_0
      // 18: lcmp
      // 19: iload 1
      // 1a: ifne 3e
      // 1d: goto 21
      // 20: athrow
      // 21: ifne 3d
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.ab J
      // 2c: lconst_0
      // 2d: lcmp
      // 2e: iload 1
      // 2f: ifne 3e
      // 32: goto 36
      // 35: athrow
      // 36: ifeq 41
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 42
      // 41: bipush 0
      // 42: istore 2
      // 43: aload 0
      // 44: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.b ()V
      // 47: iload 2
      // 48: ifeq 52
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababab ()V
      // 4e: goto 52
      // 51: athrow
      // 52: return
   }

   private String aaaa(double var1) {
      int var10000 = (int)Math.round(var1);
      String var4 = aabbaaaba.abba(abb[1]);
      int var3 = var10000;
      return var3 + var4;
   }

   private static String aaab(int var0, int var1) {
      int var9 = 419115406;
      int var2 = (var0 ^ abbb(-1577006078, var9 ^ 2036328052)) & abbb(-1577006079, var9 ^ -1115697084);
      if (bb[var2] == null) {
         char[] var3 = bbb[var2].toCharArray();

         int var4 = switch (var3[0] & abbb(-1577006080, var9 ^ -2047136913)) {
            case 0 -> abbb(-1577006065, var9 ^ -466040074);
            case 1 -> abbb(-1577006066, var9 ^ 1943977792);
            case 2 -> abbb(-1577006067, var9 ^ 264525964);
            case 3 -> abbb(-1577006068, var9 ^ 1159692090);
            case 4 -> abbb(-1577006069, var9 ^ -2029198836);
            case 5 -> abbb(-1577006070, var9 ^ -893128993);
            case 6 -> abbb(-1577006071, var9 ^ 758640256);
            case 7 -> abbb(-1577006072, var9 ^ -1120300052);
            case 8 -> abbb(-1577006057, var9 ^ -1526389177);
            case 9 -> abbb(-1577006058, var9 ^ -939058979);
            case 10 -> abbb(-1577006059, var9 ^ 968665745);
            case 11 -> abbb(-1577006060, var9 ^ 1840416620);
            case 12 -> abbb(-1577006061, var9 ^ -1542807698);
            case 13 -> abbb(-1577006062, var9 ^ 326009696);
            case 14 -> abbb(-1577006063, var9 ^ -755606440);
            case 15 -> abbb(-1577006064, var9 ^ -894938975);
            case 16 -> abbb(-1577006049, var9 ^ -1090130963);
            case 17 -> abbb(-1577006050, var9 ^ -592530136);
            case 18 -> abbb(-1577006051, var9 ^ 889088044);
            case 19 -> abbb(-1577006052, var9 ^ -948495406);
            case 20 -> abbb(-1577006053, var9 ^ -2107586060);
            case 21 -> abbb(-1577006054, var9 ^ -1731592488);
            case 22 -> abbb(-1577006055, var9 ^ -2146021152);
            case 23 -> abbb(-1577006056, var9 ^ 435560472);
            case 24 -> abbb(-1577006041, var9 ^ -1748904059);
            case 25 -> abbb(-1577006042, var9 ^ 700541918);
            case 26 -> abbb(-1577006043, var9 ^ 657422697);
            case 27 -> abbb(-1577006044, var9 ^ -532936517);
            case 28 -> abbb(-1577006045, var9 ^ -205797814);
            case 29 -> abbb(-1577006046, var9 ^ -1619243884);
            case 30 -> abbb(-1577006047, var9 ^ -288711345);
            case 31 -> abbb(-1577006048, var9 ^ 704624037);
            case 32 -> abbb(-1577006033, var9 ^ 1843472765);
            case 33 -> abbb(-1577006034, var9 ^ 998813362);
            case 34 -> abbb(-1577006035, var9 ^ 131270886);
            case 35 -> abbb(-1577006036, var9 ^ -1005792478);
            case 36 -> abbb(-1577006037, var9 ^ -1117107424);
            case 37 -> abbb(-1577006038, var9 ^ 1308074959);
            case 38 -> abbb(-1577006039, var9 ^ 1763339367);
            case 39 -> abbb(-1577006040, var9 ^ 564138985);
            case 40 -> abbb(-1577006025, var9 ^ 113819017);
            case 41 -> abbb(-1577006026, var9 ^ 339162959);
            case 42 -> abbb(-1577006027, var9 ^ -2090027119);
            case 43 -> abbb(-1577006028, var9 ^ 334188833);
            case 44 -> abbb(-1577006029, var9 ^ 937058003);
            case 45 -> abbb(-1577006030, var9 ^ -1997960170);
            case 46 -> abbb(-1577006031, var9 ^ 437002647);
            case 47 -> abbb(-1577006032, var9 ^ 2012133845);
            case 48 -> abbb(-1577006017, var9 ^ -84161902);
            case 49 -> abbb(-1577006018, var9 ^ -441609730);
            case 50 -> abbb(-1577006019, var9 ^ 1449201806);
            case 51 -> abbb(-1577006020, var9 ^ -1597877224);
            case 52 -> abbb(-1577006021, var9 ^ 1243092871);
            case 53 -> abbb(-1577006022, var9 ^ -1833406378);
            case 54 -> abbb(-1577006023, var9 ^ -1763441202);
            case 55 -> abbb(-1577006024, var9 ^ 566718695);
            case 56 -> abbb(-1577006009, var9 ^ -17321642);
            case 57 -> abbb(-1577006010, var9 ^ -544611535);
            case 58 -> 2;
            case 59 -> abbb(-1577006011, var9 ^ 328083933);
            case 60 -> 1;
            case 61 -> abbb(-1577006012, var9 ^ -913071298);
            case 62 -> abbb(-1577006013, var9 ^ -787361960);
            case 63 -> abbb(-1577006014, var9 ^ -1745780742);
            case 64 -> abbb(-1577006015, var9 ^ 2036203925);
            case 65 -> abbb(-1577006016, var9 ^ -346529609);
            case 66 -> abbb(-1577006001, var9 ^ -858534125);
            case 67 -> abbb(-1577006002, var9 ^ -663707287);
            case 68 -> abbb(-1577006003, var9 ^ -1934496620);
            case 69 -> abbb(-1577006004, var9 ^ -1146192527);
            case 70 -> abbb(-1577006005, var9 ^ -1319858147);
            case 71 -> abbb(-1577006006, var9 ^ -488198758);
            case 72 -> abbb(-1577006007, var9 ^ 1454216701);
            case 73 -> abbb(-1577006008, var9 ^ -1401224363);
            case 74 -> abbb(-1577005993, var9 ^ 240511003);
            case 75 -> abbb(-1577005994, var9 ^ -987890729);
            case 76 -> abbb(-1577005995, var9 ^ 1015249480);
            case 77 -> abbb(-1577005996, var9 ^ -1445616890);
            case 78 -> abbb(-1577005997, var9 ^ -1832748915);
            case 79 -> abbb(-1577005998, var9 ^ -420615907);
            case 80 -> abbb(-1577005999, var9 ^ -331474106);
            case 81 -> abbb(-1577006000, var9 ^ -1169599674);
            case 82 -> abbb(-1577005985, var9 ^ 1042836907);
            case 83 -> abbb(-1577005986, var9 ^ -1446766508);
            case 84 -> abbb(-1577005987, var9 ^ 1106726139);
            case 85 -> abbb(-1577005988, var9 ^ -1208099492);
            case 86 -> abbb(-1577005989, var9 ^ 312189038);
            case 87 -> abbb(-1577005990, var9 ^ -558411379);
            case 88 -> abbb(-1577005991, var9 ^ -77789404);
            case 89 -> abbb(-1577005992, var9 ^ 189443038);
            case 90 -> abbb(-1577005977, var9 ^ -405349123);
            case 91 -> abbb(-1577005978, var9 ^ -1443973114);
            case 92 -> abbb(-1577005979, var9 ^ -391190462);
            case 93 -> abbb(-1577005980, var9 ^ 841720657);
            case 94 -> abbb(-1577005981, var9 ^ 189781589);
            case 95 -> abbb(-1577005982, var9 ^ -1370536307);
            case 96 -> abbb(-1577005983, var9 ^ -2128568993);
            case 97 -> abbb(-1577005984, var9 ^ -1244142074);
            case 98 -> 4;
            case 99 -> abbb(-1577005969, var9 ^ 366056594);
            case 100 -> abbb(-1577005970, var9 ^ 2058421575);
            case 101 -> abbb(-1577005971, var9 ^ 662717994);
            case 102 -> abbb(-1577005972, var9 ^ -1461724976);
            case 103 -> abbb(-1577005973, var9 ^ -1493940078);
            case 104 -> abbb(-1577005974, var9 ^ -778761285);
            case 105 -> abbb(-1577005975, var9 ^ -753983621);
            case 106 -> abbb(-1577005976, var9 ^ -1030760864);
            case 107 -> abbb(-1577005961, var9 ^ 530776858);
            case 108 -> abbb(-1577005962, var9 ^ -1299639051);
            case 109 -> abbb(-1577005963, var9 ^ -284885705);
            case 110 -> abbb(-1577005964, var9 ^ -1100683583);
            case 111 -> abbb(-1577005965, var9 ^ -1856393901);
            case 112 -> abbb(-1577005966, var9 ^ -1214646990);
            case 113 -> abbb(-1577005967, var9 ^ -1905711382);
            case 114 -> abbb(-1577005968, var9 ^ -742930406);
            case 115 -> abbb(-1577005953, var9 ^ -1905750200);
            case 116 -> abbb(-1577005954, var9 ^ -879003651);
            case 117 -> abbb(-1577005955, var9 ^ -2085344255);
            case 118 -> abbb(-1577005956, var9 ^ 735232743);
            case 119 -> abbb(-1577005957, var9 ^ -997165620);
            case 120 -> abbb(-1577005958, var9 ^ -361722708);
            case 121 -> abbb(-1577005959, var9 ^ 878273076);
            case 122 -> abbb(-1577005960, var9 ^ -1545600252);
            case 123 -> abbb(-1577005945, var9 ^ 1382547513);
            case 124 -> abbb(-1577005946, var9 ^ 1600429714);
            case 125 -> abbb(-1577005947, var9 ^ -740721918);
            case 126 -> abbb(-1577005948, var9 ^ -623819003);
            case 127 -> abbb(-1577005949, var9 ^ 81847648);
            case 128 -> abbb(-1577005950, var9 ^ -736894136);
            case 129 -> abbb(-1577005951, var9 ^ -1082970751);
            case 130 -> abbb(-1577005952, var9 ^ 260281331);
            case 131 -> abbb(-1577005937, var9 ^ -529539157);
            case 132 -> abbb(-1577005938, var9 ^ -102136408);
            case 133 -> abbb(-1577005939, var9 ^ -701982817);
            case 134 -> abbb(-1577005940, var9 ^ 1676008808);
            case 135 -> abbb(-1577005941, var9 ^ 1221457061);
            case 136 -> abbb(-1577005942, var9 ^ 329290379);
            case 137 -> abbb(-1577005943, var9 ^ 686185697);
            case 138 -> abbb(-1577005944, var9 ^ 528354778);
            case 139 -> abbb(-1577005929, var9 ^ -2096729187);
            case 140 -> abbb(-1577005930, var9 ^ -198660852);
            case 141 -> abbb(-1577005931, var9 ^ -446285089);
            case 142 -> abbb(-1577005932, var9 ^ 1881643712);
            case 143 -> abbb(-1577005933, var9 ^ -934196406);
            case 144 -> abbb(-1577005934, var9 ^ 1283917166);
            case 145 -> abbb(-1577005935, var9 ^ 1683401097);
            case 146 -> abbb(-1577005936, var9 ^ -1286807532);
            case 147 -> abbb(-1577005921, var9 ^ 236943647);
            case 148 -> abbb(-1577005922, var9 ^ 1497641839);
            case 149 -> abbb(-1577005923, var9 ^ 29499424);
            case 150 -> abbb(-1577005924, var9 ^ 79537432);
            case 151 -> abbb(-1577005925, var9 ^ -976077096);
            case 152 -> abbb(-1577005926, var9 ^ -1002491934);
            case 153 -> abbb(-1577005927, var9 ^ 593955411);
            case 154 -> abbb(-1577005928, var9 ^ -1043925662);
            case 155 -> abbb(-1577005913, var9 ^ -1439440966);
            case 156 -> abbb(-1577005914, var9 ^ 1137834705);
            case 157 -> abbb(-1577005915, var9 ^ -754648396);
            case 158 -> abbb(-1577005916, var9 ^ -2130171739);
            case 159 -> abbb(-1577005917, var9 ^ 195197841);
            case 160 -> abbb(-1577005918, var9 ^ -1506496953);
            case 161 -> abbb(-1577005919, var9 ^ 219012195);
            case 162 -> abbb(-1577005920, var9 ^ -191550411);
            case 163 -> abbb(-1577005905, var9 ^ -1436023246);
            case 164 -> abbb(-1577005906, var9 ^ -2078364898);
            case 165 -> abbb(-1577005907, var9 ^ -1283903334);
            case 166 -> abbb(-1577005908, var9 ^ -487694056);
            case 167 -> abbb(-1577005909, var9 ^ -1026896136);
            case 168 -> abbb(-1577005910, var9 ^ -187149521);
            case 169 -> abbb(-1577005911, var9 ^ -337977550);
            case 170 -> abbb(-1577005912, var9 ^ -1304478636);
            case 171 -> abbb(-1577005897, var9 ^ 453939282);
            case 172 -> abbb(-1577005898, var9 ^ 531602705);
            case 173 -> abbb(-1577005899, var9 ^ -1185072032);
            case 174 -> 3;
            case 175 -> abbb(-1577005900, var9 ^ 1518864111);
            case 176 -> abbb(-1577005901, var9 ^ -2052406238);
            case 177 -> abbb(-1577005902, var9 ^ 850049519);
            case 178 -> abbb(-1577005903, var9 ^ 322999169);
            case 179 -> abbb(-1577005904, var9 ^ -1751539064);
            case 180 -> abbb(-1577005889, var9 ^ 960483271);
            case 181 -> abbb(-1577005890, var9 ^ -739710546);
            case 182 -> abbb(-1577005891, var9 ^ 1694525880);
            case 183 -> abbb(-1577005892, var9 ^ -1685327755);
            case 184 -> abbb(-1577005893, var9 ^ -776622199);
            case 185 -> abbb(-1577005894, var9 ^ -16035949);
            case 186 -> abbb(-1577005895, var9 ^ 118655602);
            case 187 -> abbb(-1577005896, var9 ^ -1797733140);
            case 188 -> abbb(-1577005881, var9 ^ -1693757507);
            case 189 -> abbb(-1577005882, var9 ^ -1608980867);
            case 190 -> abbb(-1577005883, var9 ^ -985136887);
            case 191 -> abbb(-1577005884, var9 ^ 2091291019);
            case 192 -> abbb(-1577005885, var9 ^ -1096420475);
            case 193 -> abbb(-1577005886, var9 ^ -164823790);
            case 194 -> abbb(-1577005887, var9 ^ -1017417029);
            case 195 -> abbb(-1577005888, var9 ^ 880926028);
            case 196 -> abbb(-1577005873, var9 ^ -495378794);
            case 197 -> abbb(-1577005874, var9 ^ -605470846);
            case 198 -> abbb(-1577005875, var9 ^ -1527071095);
            case 199 -> abbb(-1577005876, var9 ^ 795677282);
            case 200 -> abbb(-1577005877, var9 ^ 1065902898);
            case 201 -> abbb(-1577005878, var9 ^ -329924155);
            case 202 -> abbb(-1577005879, var9 ^ -1300766077);
            case 203 -> abbb(-1577005880, var9 ^ 2019214299);
            case 204 -> abbb(-1577005865, var9 ^ -1271813066);
            case 205 -> abbb(-1577005866, var9 ^ -1688635541);
            case 206 -> abbb(-1577005867, var9 ^ -1153923708);
            case 207 -> abbb(-1577005868, var9 ^ -307842581);
            case 208 -> abbb(-1577005869, var9 ^ -1685654898);
            case 209 -> abbb(-1577005870, var9 ^ -1666770504);
            case 210 -> abbb(-1577005871, var9 ^ 406987815);
            case 211 -> abbb(-1577005872, var9 ^ 1740512693);
            case 212 -> abbb(-1577005857, var9 ^ 4608691);
            case 213 -> abbb(-1577005858, var9 ^ -971199851);
            case 214 -> abbb(-1577005859, var9 ^ -1197432747);
            case 215 -> 5;
            case 216 -> abbb(-1577005860, var9 ^ 1400386694);
            case 217 -> abbb(-1577005861, var9 ^ 204713049);
            case 218 -> abbb(-1577005862, var9 ^ -839492892);
            case 219 -> abbb(-1577005863, var9 ^ -421517012);
            case 220 -> abbb(-1577005864, var9 ^ -637229143);
            case 221 -> abbb(-1577005849, var9 ^ 413590866);
            case 222 -> abbb(-1577005850, var9 ^ -686772436);
            case 223 -> abbb(-1577005851, var9 ^ -2039514057);
            case 224 -> abbb(-1577005852, var9 ^ 1807572049);
            case 225 -> abbb(-1577005853, var9 ^ -243590234);
            case 226 -> abbb(-1577005854, var9 ^ 1669511987);
            case 227 -> abbb(-1577005855, var9 ^ 448836112);
            case 228 -> abbb(-1577005856, var9 ^ 2123751867);
            case 229 -> abbb(-1577005841, var9 ^ 452800617);
            case 230 -> abbb(-1577005842, var9 ^ 468629987);
            case 231 -> 0;
            case 232 -> abbb(-1577005843, var9 ^ -755749616);
            case 233 -> abbb(-1577005844, var9 ^ 1396044701);
            case 234 -> abbb(-1577005845, var9 ^ 337557384);
            case 235 -> abbb(-1577005846, var9 ^ 1643470945);
            case 236 -> abbb(-1577005847, var9 ^ -679655447);
            case 237 -> abbb(-1577005848, var9 ^ 2106757319);
            case 238 -> abbb(-1577005833, var9 ^ 295218369);
            case 239 -> abbb(-1577005834, var9 ^ -569874439);
            case 240 -> abbb(-1577005835, var9 ^ 93407876);
            case 241 -> abbb(-1577005836, var9 ^ 451290188);
            case 242 -> abbb(-1577005837, var9 ^ -940705404);
            case 243 -> abbb(-1577005838, var9 ^ 2079438318);
            case 244 -> abbb(-1577005839, var9 ^ 1841061508);
            case 245 -> abbb(-1577005840, var9 ^ -937683716);
            case 246 -> abbb(-1577005825, var9 ^ 133005430);
            case 247 -> abbb(-1577005826, var9 ^ 538423930);
            case 248 -> abbb(-1577005827, var9 ^ 344064944);
            case 249 -> abbb(-1577005828, var9 ^ -685765116);
            case 250 -> abbb(-1577005829, var9 ^ -550143989);
            case 251 -> abbb(-1577005830, var9 ^ -1489673716);
            case 252 -> abbb(-1577005831, var9 ^ -34623557);
            case 253 -> abbb(-1577005832, var9 ^ -42196396);
            case 254 -> abbb(-1577005817, var9 ^ 1256156230);
            default -> abbb(-1577005818, var9 ^ 1602856505);
         };
         int var5 = (var1 & abbb(-1577005819, var9 ^ 1154307342)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & abbb(-1577005820, var9 ^ -1164021611)) >>> abbb(-1577005821, var9 ^ -1956251036)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & abbb(-1577005822, var9 ^ 1927784456);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & abbb(-1577005823, var9 ^ -973939498);
            }
         }

         bb[var2] = new String(var3).intern();
      }

      return bb[var2];
   }

   @Override
   public void aababb(class_1297 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.baaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababab.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababab;
      // 0e: if_acmpne 1c
      // 11: aload 1
      // 12: instanceof net/minecraft/class_1309
      // 15: ifne 1e
      // 18: goto 1c
      // 1b: athrow
      // 1c: return
      // 1d: athrow
      // 1e: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 21: astore 3
      // 22: aload 3
      // 23: iload 2
      // 24: ifne 36
      // 27: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2a: ifnull 3c
      // 2d: goto 31
      // 30: athrow
      // 31: aload 3
      // 32: goto 36
      // 35: athrow
      // 36: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 39: ifnonnull 3e
      // 3c: return
      // 3d: athrow
      // 3e: bipush 0
      // 3f: aload 0
      // 40: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 43: aload 3
      // 44: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.babb (Lnet/minecraft/class_310;)I
      // 47: invokestatic java/lang/Math.max (II)I
      // 4a: istore 4
      // 4c: iload 4
      // 4e: ifle 5c
      // 51: aload 0
      // 52: iload 4
      // 54: i2d
      // 55: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.abbb D
      // 58: goto 5c
      // 5b: athrow
      // 5c: return
   }

   private static String baaa(int var0, int var1) {
      int var3 = var0 ^ 298465697;
      char[] var4 = babb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bbaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bbaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1740781584;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 255;
            case 1 -> 121;
            case 2 -> 150;
            case 3 -> 196;
            case 4 -> 19;
            case 5 -> 85;
            case 6 -> 141;
            case 7 -> 151;
            case 8 -> 222;
            case 9 -> 239;
            case 10 -> 166;
            case 11 -> 171;
            case 12 -> 56;
            case 13 -> 58;
            case 14 -> 82;
            case 15 -> 235;
            case 16 -> 143;
            case 17 -> 168;
            case 18 -> 88;
            case 19 -> 209;
            case 20 -> 224;
            case 21 -> 66;
            case 22 -> 200;
            case 23 -> 3;
            case 24 -> 167;
            case 25 -> 250;
            case 26 -> 232;
            case 27 -> 104;
            case 28 -> 49;
            case 29 -> 25;
            case 30 -> 255;
            case 31 -> 1;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public int aaba() {
      return this.aaba;
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
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 1
      // 004: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 007: astore 2
      // 008: iload 1
      // 009: ifne 03d
      // 00c: aload 2
      // 00d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 010: ifnull 035
      // 013: goto 017
      // 016: athrow
      // 017: aload 2
      // 018: iload 1
      // 019: ifne 02f
      // 01c: goto 020
      // 01f: athrow
      // 020: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 023: ifnull 035
      // 026: goto 02a
      // 029: athrow
      // 02a: aload 2
      // 02b: goto 02f
      // 02e: athrow
      // 02f: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 032: ifnonnull 03e
      // 035: aload 0
      // 036: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.a ()V
      // 039: goto 03d
      // 03c: athrow
      // 03d: return
      // 03e: aload 0
      // 03f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 042: aload 2
      // 043: ldc2_w 4.0
      // 046: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.ba (Lnet/minecraft/class_310;D)Z
      // 049: iload 1
      // 04a: ifne 066
      // 04d: ifne 05a
      // 050: goto 054
      // 053: athrow
      // 054: aload 0
      // 055: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.a ()V
      // 058: return
      // 059: athrow
      // 05a: bipush 0
      // 05b: aload 0
      // 05c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 05f: aload 2
      // 060: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.baba (Lnet/minecraft/class_310;)I
      // 063: invokestatic java/lang/Math.max (II)I
      // 066: istore 3
      // 067: bipush 0
      // 068: aload 0
      // 069: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa;
      // 06c: aload 2
      // 06d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaabaa.babb (Lnet/minecraft/class_310;)I
      // 070: invokestatic java/lang/Math.max (II)I
      // 073: istore 4
      // 075: aload 0
      // 076: iload 3
      // 077: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.bb (I)V
      // 07a: aload 0
      // 07b: aload 0
      // 07c: iload 3
      // 07d: iload 4
      // 07f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.bab (II)D
      // 082: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.abbb D
      // 085: aload 0
      // 086: iload 3
      // 087: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.abb (I)I
      // 08a: istore 5
      // 08c: aload 0
      // 08d: iload 5
      // 08f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.bbb (I)I
      // 092: istore 6
      // 094: lconst_0
      // 095: iload 6
      // 097: iload 5
      // 099: isub
      // 09a: i2l
      // 09b: invokestatic java/lang/Math.max (JJ)J
      // 09e: lstore 7
      // 0a0: lconst_0
      // 0a1: lstore 9
      // 0a3: lload 7
      // 0a5: lstore 11
      // 0a7: lload 7
      // 0a9: lconst_0
      // 0aa: lcmp
      // 0ab: iload 1
      // 0ac: ifne 0b7
      // 0af: ifle 0ba
      // 0b2: goto 0b6
      // 0b5: athrow
      // 0b6: bipush 1
      // 0b7: goto 0bb
      // 0ba: bipush 0
      // 0bb: istore 13
      // 0bd: aload 0
      // 0be: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aabb J
      // 0c1: lload 9
      // 0c3: lcmp
      // 0c4: iload 1
      // 0c5: ifne 0ff
      // 0c8: ifne 0fa
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.ab J
      // 0d3: lload 11
      // 0d5: lcmp
      // 0d6: iload 1
      // 0d7: ifne 0ff
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: ifne 0fa
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.bba Z
      // 0e9: iload 1
      // 0ea: ifne 0ff
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: iload 13
      // 0f3: if_icmpeq 102
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: bipush 1
      // 0fb: goto 0ff
      // 0fe: athrow
      // 0ff: goto 103
      // 102: bipush 0
      // 103: istore 14
      // 105: aload 0
      // 106: iload 3
      // 107: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.bab I
      // 10a: aload 0
      // 10b: iload 4
      // 10d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aaba I
      // 110: aload 0
      // 111: iload 6
      // 113: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.abab I
      // 116: aload 0
      // 117: lload 9
      // 119: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aabb J
      // 11c: aload 0
      // 11d: lload 11
      // 11f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.ab J
      // 122: aload 0
      // 123: iload 13
      // 125: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.bba Z
      // 128: aload 0
      // 129: lload 7
      // 12b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.aab J
      // 12e: iload 14
      // 130: ifeq 13a
      // 133: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaa.aababab ()V
      // 136: goto 13a
      // 139: athrow
      // 13a: return
   }

   private boolean aabb() {
      try {
         if (this.baaa.abbb() == abaababab.b) {
            return true;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return false;
   }

   private static void abaa() {
      int var0 = 2133134978;
      abb[0] = aab(
         aaab(abbb(-1577005824, var0 ^ 156110965), abbb(-1577005809, var0 ^ 1916355835)).toCharArray(),
         bba(abbb(-1577005810, var0 ^ 1380308611), 8642407715332552437L),
         aaa(abbb(-1577005811, var0 ^ 555400608), 4619838575970240046L)
      );
      abb[1] = aab(
         aaab(abbb(-1577005812, var0 ^ -847973729), abbb(-1577005813, var0 ^ -1640814436)).toCharArray(),
         bba(abbb(-1577005814, var0 ^ -681627506), 1218813204848942542L),
         aaa(abbb(-1577005815, var0 ^ 160401246), 717094386860839102L)
      );
      abb[2] = aab(
         aaab(abbb(-1577005816, var0 ^ 2134290329), abbb(-1577005801, var0 ^ -1386384762)).toCharArray(),
         bba(abbb(-1577005802, var0 ^ 1604217034), 2185670837514182083L),
         aaa(abbb(-1577005803, var0 ^ 1399714045), 4384668684229577514L)
      );
      abb[3] = aab(
         aaab(abbb(-1577005804, var0 ^ 1649884342), abbb(-1577005805, var0 ^ -441323722)).toCharArray(),
         bba(abbb(-1577005806, var0 ^ -37937849), 4050568856762747538L),
         aaa(abbb(-1577005807, var0 ^ -1712317420), 2581473721841919690L)
      );
      abb[4] = aab(
         aaab(abbb(-1577005808, var0 ^ 1629784147), abbb(-1577005793, var0 ^ 919488710)).toCharArray(),
         bba(abbb(-1577005794, var0 ^ -327265838), 4052522125496705722L),
         aaa(abbb(-1577005795, var0 ^ 1954831158), 1471426239888170348L)
      );
      abb[5] = aab(
         aaab(abbb(-1577005796, var0 ^ -420566576), abbb(-1577005797, var0 ^ -119821485)).toCharArray(),
         bba(abbb(-1577005798, var0 ^ 1584097868), 2083990377729293904L),
         aaa(abbb(-1577005799, var0 ^ -1617809229), 7745158949122164101L)
      );
   }

   public int abab() {
      return this.bab;
   }

   private static int abbb(int var0, int var1) {
      int var2 = baba[var0 ^ -1577006073] ^ var1 ^ var0;
      var2 += 18118;
      var2 ^= 4545;
      var2 ^= 1919;
      var2 += 993;
      var2 -= 43771;
      var2 ^= 5231;
      var2 ^= 32712;
      var2 += 50036;
      return var2 - 20992;
   }

   public long abba() {
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
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.bba Z
      // 0c: ifeq 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baa.ab J
      // 1b: goto 1f
      // 1e: lconst_0
      // 1f: lreturn
   }

   private void b() {
      this.bab = 0;
      this.aaba = 0;
      this.abab = 0;
      this.aabb = 0L;
      this.ab = 0L;
      this.bba = false;
      this.abbb = 0.0;
      this.aa = 0.0;
      this.abaa = false;
      this.aab = 0L;
   }
}
