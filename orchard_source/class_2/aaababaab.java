package nsc;

import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class aaababaab
   extends abbaabbaa
   implements bababba {
   private static final Integer[] aa;
   private static final bbabbab ab;
   private static final int[] aabb;
   private static final String[] ba;
   private static final Long[] bb;
   private double aaa;
   private static String[] aab;
   private final bababa aba;
   private static final long[] abb;
   private static final double baa = 18.0;
   private static final double bab = 4.0;
   private static final double bba = 7.0;
   private static final Object[] abab;
   private static final String[] bbb;
   private static final long[] aaaa;
   private final bababa aaab;
   private final bababa aaba;
   private static final String[] abaa;

   private static int a(int var0, int var1) {
      int var2 = aabb[var0 ^ -130981428] ^ var1 ^ var0;
      var2 -= 46578;
      var2 += 15692;
      var2 ^= 42842;
      var2 += 38680;
      var2 -= 49552;
      var2 -= 34154;
      var2 ^= 58970;
      return var2 ^ 26910;
   }

   public aaababaab() {
      super(
         aabbaaaba.aaab(aab[2]),
         bbaabbba.ba,
         aabbaaaba.aaab(aab[aaaa(a(-130981428, -1607020465 ^ 1293570203), 7806751564373523334L)])
      );
      this.aba = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(aab[3]), 18.0, 0.0, 4000.0, 1.0)
            .bb(aabbaaaba.abba(aab[0]))
      );
      this.aaba = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(aab[5]), 99.0, 0.0, 4000.0, 1.0)
            .bb(aabbaaaba.abba(aab[0]))
      );
      this.aaab = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(aab[4]), 100.0, 75.0, 200.0, 5.0)
            .bb(aabbaaaba.abba(aab[1]))
      );
   }

   private static long aa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-130981427, -1393972070 ^ -1536475801)) & a(-130981426, -1393972070 ^ -877092621);
      if (bb[var3] == null) {
         bb[var3] = abb[var3] ^ var1;
      }

      return bb[var3];
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @Override
   public double aaaaa() {
      int var1 = baaabbaa.bba;
      class_310 var2 = class_310.method_1551();

      label30: {
         class_310 var10000;
         label29: {
            try {
               var10000 = var2;
               if (var1 != 0) {
                  break label29;
               }

               if (var2 == null) {
                  break label30;
               }
            } catch (MatchException var5) {
               throw var5;
            }

            var10000 = var2;
         }

         try {
            if (var10000.field_1772 != null) {
               return this.bb(var2.field_1772, this.ab()) * this.bba();
            }
         } catch (MatchException var4) {
            throw var4;
         }
      }

      try {
         return 48.0 * this.bba();
      } catch (MatchException var3) {
         throw var3;
      }
   }

   private static String b(char var0, int var1, int var2) {
      int var3 = var1 ^ 33086;
      char[] var4 = abaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         abab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 7947;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\ue00f';
         var10 += 63461;
         var10 ^= 59394;
         var10 += 39886;
         var10 += 33658;
         var10 -= 61027;
         var10 ^= 63529;
         var10 ^= 19000;
         var10 += 47848;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
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
      // 03: istore 1
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 2
      // 08: iload 1
      // 09: ifne 30
      // 0c: aload 2
      // 0d: ifnull 27
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 32
      // 19: goto 1d
      // 1c: athrow
      // 1d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 20: ifnonnull 31
      // 23: goto 27
      // 26: athrow
      // 27: aload 0
      // 28: dconst_0
      // 29: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.aaa D
      // 2c: goto 30
      // 2f: athrow
      // 30: return
      // 31: aload 2
      // 32: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 35: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 38: astore 3
      // 39: aload 0
      // 3a: aload 3
      // 3b: getfield net/minecraft/class_243.field_1352 D
      // 3e: aload 3
      // 3f: getfield net/minecraft/class_243.field_1350 D
      // 42: invokestatic java/lang/Math.hypot (DD)D
      // 45: ldc2_w 20.0
      // 48: dmul
      // 49: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.aaa D
      // 4c: return
   }

   @Override
   public void abbb(double var1, double var3) {
      this.aba.aaa(Math.max(0.0, var1));
      this.aaba.aaa(Math.max(0.0, var3));
   }

   private String ab() {
      return String.format(
         Locale.ROOT, aabbaaaba.abba(aab[aaaa(a(-130981382, -788611195 ^ 1014002152), 3384517843130523885L)]), this.aaa
      );
   }

   private static void ba(class_332 var0, class_327 var1, String var2, double var3, double var5) {
      abbaa.b(
         var0, var1, var2, var3, var5, bbbbbaa.baa(aaaa(a(-130981381, -1060813119 ^ 1917689905), 5972158356470627447L))
      );
   }

   private double bb(class_327 var1, String var2) {
      return 14.0
         + abbaa.baabba(
            var1, aabbaaaba.abba(aab[aaaa(a(-130981388, -711818093 ^ 1381723509), 9017596969226794114L)])
         )
         + 4.0
         + abbaa.baabba(var1, var2);
   }

   private static void aaa() {
      int var0 = 1151070511;
      aab[0] = aab(
         aaab(a(-130981387, var0 ^ 513819270), a(-130981386, var0 ^ -111650652)).toCharArray(),
         aa(a(-130981385, var0 ^ -692301895), 5445326525445638307L),
         aaaa(a(-130981392, var0 ^ 1107502687), 275200945089914463L)
      );
      aab[1] = aab(
         aaab(a(-130981391, var0 ^ -776806584), a(-130981390, var0 ^ -741442731)).toCharArray(),
         aa(a(-130981389, var0 ^ -708189219), 902819783708548180L),
         aaaa(a(-130981492, var0 ^ 1963116448), 3238166528881506573L)
      );
      aab[2] = aab(
         aaab(a(-130981491, var0 ^ -712858139), a(-130981490, var0 ^ -302560763)).toCharArray(),
         aa(a(-130981489, var0 ^ -1156474994), 5664692569278638739L),
         aaaa(a(-130981496, var0 ^ 1884277611), 3409664554403555105L)
      );
      aab[3] = aab(
         aaab(a(-130981495, var0 ^ 520064152), a(-130981494, var0 ^ 1441387328)).toCharArray(),
         aa(a(-130981493, var0 ^ -2048736602), 4884576208816054618L),
         aaaa(a(-130981500, var0 ^ 1242632844), 8292241874746385482L)
      );
      aab[4] = aab(
         aaab(a(-130981499, var0 ^ 1160187505), a(-130981498, var0 ^ 1641404119)).toCharArray(),
         aa(a(-130981497, var0 ^ 776996020), 5152238188628868063L),
         aaaa(a(-130981504, var0 ^ 1179941569), 7027120547385391427L)
      );
      aab[5] = aab(
         aaab(a(-130981503, var0 ^ 1433356132), a(-130981502, var0 ^ 2036881284)).toCharArray(),
         aa(a(-130981501, var0 ^ -1016045774), 7404601896033604757L),
         aaaa(a(-130981476, var0 ^ -1581923909), 8146397010228141276L)
      );
      aab[aaaa(a(-130981475, var0 ^ 1593277205), 351126561815545904L)] = aab(
         aaab(a(-130981474, var0 ^ 1507180012), a(-130981473, var0 ^ 1927273129)).toCharArray(),
         aa(a(-130981480, var0 ^ -1824044041), 3467176309276664772L),
         aaaa(a(-130981479, var0 ^ -797700395), 6118710224650358661L)
      );
      aab[aaaa(a(-130981478, var0 ^ -41612478), 677726721266052242L)] = aab(
         aaab(a(-130981477, var0 ^ -555569183), a(-130981484, var0 ^ -1253365117)).toCharArray(),
         aa(a(-130981483, var0 ^ 2026557418), 5755507188653979303L),
         aaaa(a(-130981482, var0 ^ 1499547418), 1485616077377471757L)
      );
      aab[aaaa(a(-130981481, var0 ^ -1715652048), 3282105468128959396L)] = aab(
         aaab(a(-130981488, var0 ^ 1895859909), a(-130981487, var0 ^ -898709622)).toCharArray(),
         aa(a(-130981486, var0 ^ 726060263), 3587672261519761239L),
         aaaa(a(-130981485, var0 ^ -1486016049), 3285374353173723031L)
      );
   }

   @Override
   public void aabbb(class_332 var1, int var2, int var3, float var4) {
      this.aba(var1, false);
   }

   private static String aab(char[] var0, long var1, int var3) {
      int var4 = aaaa(a(-130981460, -2134554247 ^ 1299476850), 7479690698038443032L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aaaa(a(-130981459, -2134554247 ^ -148614700), 5539497743379715230L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private void aba(class_332 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 007: astore 4
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
      // 029: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.bba ()D
      // 02c: dstore 5
      // 02e: aload 0
      // 02f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.aabb ()D
      // 032: dstore 7
      // 034: aload 0
      // 035: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.abb ()D
      // 038: dstore 9
      // 03a: aload 4
      // 03c: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 03f: astore 11
      // 041: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.aab [Ljava/lang/String;
      // 044: ldc_w -130981458
      // 047: ldc_w 2139705964
      // 04a: ldc_w -1990169342
      // 04d: ixor
      // 04e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.a (II)I
      // 051: ldc2_w 9017596969226794114
      // 054: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.aaaa (IJ)I
      // 057: aaload
      // 058: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 05b: astore 12
      // 05d: aload 0
      // 05e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.ab ()Ljava/lang/String;
      // 061: astore 13
      // 063: aload 0
      // 064: aload 11
      // 066: aload 13
      // 068: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.bb (Lnet/minecraft/class_327;Ljava/lang/String;)D
      // 06b: dstore 14
      // 06d: aload 1
      // 06e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.abbaab (Lnet/minecraft/class_332;)V
      // 071: aload 1
      // 072: dload 7
      // 074: dload 9
      // 076: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bb (Lnet/minecraft/class_332;DD)V
      // 079: aload 1
      // 07a: dload 5
      // 07c: dload 5
      // 07e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bbbbba (Lnet/minecraft/class_332;DD)V
      // 081: aload 1
      // 082: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbab;
      // 085: dconst_0
      // 086: dconst_0
      // 087: dload 14
      // 089: ldc2_w 18.0
      // 08c: iload 2
      // 08d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaa.babb (Lnet/minecraft/class_332;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbab;DDDDZ)V
      // 090: ldc2_w 7.0
      // 093: dstore 16
      // 095: dload 16
      // 097: aload 11
      // 099: aload 12
      // 09b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.baabba (Lnet/minecraft/class_327;Ljava/lang/String;)I
      // 09e: i2d
      // 09f: dadd
      // 0a0: ldc2_w 4.0
      // 0a3: dadd
      // 0a4: dstore 18
      // 0a6: ldc2_w 18.0
      // 0a9: aload 11
      // 0ab: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ae: pop
      // 0af: ldc2_w 9.0
      // 0b2: dsub
      // 0b3: ldc2_w 0.5
      // 0b6: dmul
      // 0b7: dstore 20
      // 0b9: bipush 1
      // 0ba: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0bd: aload 1
      // 0be: aload 11
      // 0c0: aload 12
      // 0c2: dload 16
      // 0c4: dload 20
      // 0c6: invokedynamic run (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DD)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.ba (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DD)V, ()V ]
      // 0cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bbaaba (Ljava/lang/Boolean;Ljava/lang/Runnable;)V
      // 0ce: aload 1
      // 0cf: aload 11
      // 0d1: aload 13
      // 0d3: dload 18
      // 0d5: dload 20
      // 0d7: ldc_w -130981457
      // 0da: ldc_w 2139705964
      // 0dd: ldc_w -1294041481
      // 0e0: ixor
      // 0e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.a (II)I
      // 0e4: ldc2_w 8587738658284784686
      // 0e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.aaaa (IJ)I
      // 0ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaa.baa (I)I
      // 0ed: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.b (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)V
      // 0f0: aload 1
      // 0f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.ababbb (Lnet/minecraft/class_332;)V
      // 0f4: goto 100
      // 0f7: astore 22
      // 0f9: aload 1
      // 0fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.ababbb (Lnet/minecraft/class_332;)V
      // 0fd: aload 22
      // 0ff: athrow
      // 100: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var40 = 1693801109;
      byte var36 = -1;
      String var30 = "\uea10줯躾狢⋤䖇ꭜ◼\u1ccd폧쐇ᇏ⽐醶ꌂ麕\ud966뛃ᣝ齒䁭\ud909쳅缜ꐽ芿䇨\u0f6e뛗윉伩诘땭㻬堟㱋㿭悦쬶㣣ᤈ䵘㾉㉴攉敷\uf093㐪箝ᙬ䵰\uf48f쏍㕸㤈龪횔諘᧵\uea6a载武뿞ﰊ뮡놐뉽亯屼쐵埠䋋㺂蹗㥥貍ខ鵖ꗟ膡퉅箰⽒ꉝﲹ콞\ue8b0伒鯺⍩椛驅᪻\uf1f6⌴⹋ᝑ鱐⽭⍥쾍䋏ਸ誊⏟佪\uf05e圀챔떨⮯큿쨴⌅子癔썚\ue32f⫷튞\ud9aa䏣嗫\ue703敚ꤿ摨蟊\ufaee멹囡奖娺奒娞妴娒嫳妝奔婮姕婑嫛娐嫌姿奻婒她姎夼姟娻太奈妀夔姾婑夷夛娩嫌婝姬婺夑娕媪婸娙姇太娲奚婀妸委妨奦媻婱奡姯嫴娾夸姃姲婊夝妰嫅妩婆婱奴妈媹婛妈娣夭奐复夿姊婿妫娡媘妯奬妓奸奋夝夶妓妍嫜姖奎头婏妸妶娛嫙娉娌娍奣妈夛婺妒妷嫂奭媦娯娕夿嫕妙夗娨姗姩変妞夸婵姹夓嫢如夷妍娕婭夓妺夤姅姞姭奎妫夁妘婆姮폠팟펅팍팓퍎폼팑폛퍱淴ꅖ氤洍泍沰汃沀涁浀汧沰沫洯泥氣偧傔倶僊傄僙傫傖倜倦䞺䟖䟔䟹䞧䟖䜉㡓䜏䡯䟯䟛㣫䟉䢳䞳䞹䟯㢝䟌䝨䞿䞫䜩䝥䞜䟉䜝䟢䜕䝡䠔䝓䟑䝶䞧䜃䞹䝑䡗䞕䞥䣔䝯䝇䞙䝈䟂䝉䞃䢏㡻㡾䟧䝡䞉⍴⏃〈⌙⍧⌺⎨⎅⏏⌥\ue810\ue8f4\ue825\ue88a\ue89a\ue94a\ue834\ue87c\uedd2\ued28\ue90b\ue89e\ue9eb\ue872\ue85d\ue8cd琎璱瑓琫瑡琼璊瑿瓽琟";
      char[] var31 = "ਊ\u0a79ૠ\u0a7a\u0a60\u0a7aੈ\u0a7a\u0a60\u0a7a".toCharArray();
      short var29 = 2672;
      String[] var32 = new String[var31.length];

      while (true) {
         int var33 = 0;
         int var34 = 0;
         int var35 = 0;
         if (var36 == 0) {
            abaa = var32;
            abab = new Object[var32.length];
            int var25 = -1001411760;
            byte[] var23 = "ÑP\u0010ý4þ*À[.F\u009a×\u0000\u000fæ\u0017z@\u00044¡0Æp\u0094ZT\u0099\u0095¡d\u001d\u008beû¦\u0001EæUÅ:2MºßvMÐ\u0082+.Ò5È\u0096µôC\u0010\u0085ÞN\u0002?ÿL\u0085±x\u0083\u008c(\u008a`´\"\\\u0087u\u0004\u008c\u00adVZö\u000en¹A\\\u001bÌ4b%\u0015Tu0Ê\u001d¬K\u008eVó[-JPöYÑÞýb\u008b\u008dm\u0084'6ï©ë³:¬ÂåG\u0084¨¿\u0098®F\u0091!\u000f¾\u0005ÔÞ°LÝ¬\u0016\u008aÑ¤/áÐ\u0081\u0082\u009e -*C\u0089Ã{!-ØH\u0006é\u0015a\"E¨\u0019\u0017]÷\u0016¯kù\nÚ\u000b%\u0090Æ:\u009eI&,¼\u008d=\u0005·¤½Ê ,qÀÃÐÎQ\u001cÇOÐòW\u0080\u008eôq\u0084»µFô\u0099º\u0096~~B\u0091Õ®[\u001e|:äE¸V¨\u000b²«)\u0006\u009b\u00ad.åa\ræe\u0010R\u0098qbjí°¸Ãöç}\b¨çÝ\u0099åX\b-\u000e¶\u001cý\u0005ëj2ö\u007f\u001cÂ=Úø\u00191E\u0095V´¤\u0088>°Ø\u009fÒu\u0093ó\u0001\u008cÂ/»\u0094à3ÙRÇ§&\u0010*hÞÏib\n8\u008dÖë #½¨\u0093[\u009f\u0085b=\u0011Yø{kÍ¯\u0096'\u0000.\\J!\u0085ÉÀáYzÊö\u001aRB²\u0089¦)S¢w:ß\u0089¬\u0089ñÍ¬ÊK\u009d\u0097éÊ\u0095\u0090&ñ+\u0088w\u0088ZÊ2\u0002`¾PæÅø@BhÖ\u0018¶Hîe?F\u0011D?\u000bW\u008cñ\u009aÕ¤\u0000\u009dåî±-Ü\u009cÊt\u0093ú\u001b+ø¬bÙ\u0003~\u009dß\u0083ð`,\\vÅ\u0017U\b\u0004Òo0\"}ë§í´á\u0083\u008fÑÆ;\u0003\u009b\u0011Â\u0088\u0086\u000b\u0017/µù\u001c\u0094vâð)N ¿ÿ,\u001aÅ ;{æ\u0007ñ\u0006°e>.AÂ\u0004ùk_tô-\u000b\u008c\u0000\u0090ûÛ\u009c\u001aß²Ñ5¶ç\u0000Z\u009cp£¯ó!\u0089$ÒrÙî\n\u0095ý\u009d½\\±2{xò±ÓE\u0084Lÿ\u0082íÀýB\u0085\u0085ù¦öíËØ\u001aFF\u008a¥d-\u0084Lz\u0082^Xº«\u0006!\u0017µ\u008cIf\u009fÆTm\u00032\u00915m \u009dâÄ\u0085[YÇ\u001cf\u0080ú\u0015\u009coå\u000b\u0012!¿wëÃìéÂF\u0004c¯T?æ\u0015\u0000þ0¤4\u0016/V\\´1s\"2ÖÐÄÊÇ²´éI\u0093£)©\u009c{ý¼µ¼\u001a\u001c¦»\u0016\u0004å\u000eöo\u0003þ:v\u0089·ûDQ\b\u008fµzÑ¯\u0012©_ß\u0089wp,úLf\u0000u\u0019T²¼\u0015\u0093^Ñ\t\u0015o\u009cûó\u0015\u0084ËñÐ¦Î×\u0085_À'NO\u0014{ßj¿!\u0003\u0005w@ïÑÁµF\u0094lí+ñÔ±¬\u0001\u007fúå\u0014_\u0087\u008c'&\u0098\u008aÓÃA´\u0082\rk\u0011ÿf\u008d_ï!\u008f6»\u0096\u0019 \u000b\u001dxÞDC\u0005Ê\u000fû\u008a@:N\u008c-z×\u001e¨á\u000f\u007foËæ©°^â»á\u001cô\u0014·,3uµ%'Ø\u0092k£\u0086\u0085yë\"!½B¢\u000b~×É%[%ýª\u0087ljû\u009c\u008b\u0004;.:«rNm\u008fÅy\u008e\u001cv\u0099Z\u001e\u009b÷Ðï£»ë0g\u0086\u0011 \u0083\u008d\u0000ó\u0083ð\u001a9\u0098\"\u0001\u009f@)\u0015ôàIÓ§\u000e¼çR%'s\u009f\u0019);\u001fá\u0016µLSnvù¤!\u0092h}Í9xº\u0083Ãx\\RoíÖ(,\u0018©Fõ\u009e\u0092ûsÐàsV\u0015?±k lî\u0002Ð2HËé0Ø\n\u007fv\u0006±ù\u0096Í\\8ÿ\u0007f\nR\u0093B;§\u0082Y¬ù¿ã!\u0095fl$ó\u0085\u0005ª\"e0 ó°Ë\u0094fÂ¢ý%C&¼Iã\u0098\u008eøÍ\u009cæ5u\u0099oÿÊÛ0\u0092µã\u0082Ïó¥àøÖudN¿ÙÔpèwÙÓ)¶i¦\u0015<LéMú|¦\u009d\u000f\u008bÃß,ÈÍ½ÿò\u0019\u008aæ7¼)|¥0ù;\u009dÔrR°Ë{\u009bbp\u0014\u009aÄÃý\u001dú»'¿d\u0018\u009a/Wë`R\u0005\u0018±d\u008fáöYòî\u0083¯ûòl0ôÇ)\"~fA\u0093Ë\u0080¼6ojã\u0017-à/ \u0004.t\u0013dÊP\u0091Üfß\u0012\u0099=\u008faf\u008du\u008c\u001b\u0081ºØù¶8\u0016n*$\u0018a©W¤MÈã2}E%9\u0091HÍó\u0014·-aÀ\"öõó\tifXßSØ\u0012¦\u0013ÇðÄ\u0007\u008d)âßH?ÁÜÊÐ\u008eÒm\u001eæ²²Îö2\u0018Ðü\u0084í\u0011g9Ýñ\u009c3cCþHM\u0005ìi\u0095ôD\u00933¢±\u008f9\u0005L4ð\u0007®Rßð{j°«\u008aL\u000e¥±ùr?|Þ×EÓy&)Ï\u0006\u0011W\u009c\u0080×åø<~{-Kdêèw·$=V\u0081â|à\r¹Ï»\u001e^|\u008aÖþ\u0093CWs·\u0016\u008aí\u0006\u0082^-%XILOh2ÅWÅ\u0006=.\u00ad\b©\u001bôÓi°  (ÁY\u0092´cqíE\u008f\u001eI«\u00851ýþÓ¾Üetu\u0097Ñï\u0086Âb\u0099Ç1Øá\u0019óY\u0090xÌHá¢ò\u0081"
               .getBytes("ISO-8859-1");
            int var24 = var23.length / 4;
            aabb = new int[var24];
            byte var26 = 0;
            int var27 = 0;

            do {
               int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
               var28 ^= var25;
               aabb[var27] = var28;
               var26 += 4;
            } while (++var27 < var24);

            String[] var21 = new String[a(-130981425, var40 ^ -1886810377)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = b('濺', 33086, var40 ^ 531909833)).length();
            char var17 = 4;
            int var44 = -1;

            label140:
            while (true) {
               String var47 = var18.substring(++var44, var44 + var17);
               int var10001 = -1;

               while (true) {
                  char[] var75;
                  label135: {
                     char[] var56 = var47.toCharArray();
                     int var10003 = var56.length;
                     int var22 = 0;
                     var75 = var56;
                     var10001 = var10003;
                     char[] var91;
                     int var10004;
                     if (var10003 <= 1) {
                        var91 = var56;
                        var10004 = var22;
                     } else {
                        var75 = var56;
                        var10001 = var10003;
                        if (var10003 <= var22) {
                           break label135;
                        }

                        var91 = var56;
                        var10004 = var22;
                     }

                     while (true) {
                        var91[var10004] = (char)(var91[var10004] ^ switch (var22 % a(-130981431, var40 ^ 1814606319)) {
                           case 0 -> a(-130981430, var40 ^ 673045323);
                           case 1 -> a(-130981429, var40 ^ -1055121304);
                           case 2 -> a(-130981436, var40 ^ 1157818271);
                           case 3 -> a(-130981435, var40 ^ -24591162);
                           case 4 -> a(-130981434, var40 ^ 223132362);
                           case 5 -> a(-130981433, var40 ^ 355688331);
                           default -> a(-130981440, var40 ^ 358154367);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var91 = var75;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var91 = var75;
                           var10004 = var22;
                        }
                     }
                  }

                  String var98 = new String(var75).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var98;
                        if ((var44 += var17) >= var20) {
                           ba = var21;
                           bbb = new String[a(-130981432, var40 ^ 1341374738)];
                           long var8 = 50656549573118036L;
                           long[] var14 = new long[a(-130981439, var40 ^ 1985721538)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = b('쭒', 33084, var40 ^ -467050816)).length();
                           byte var10 = 0;

                           label114:
                           while (true) {
                              int var63 = var10;
                              var10 += 8;
                              var47 = var12.substring(var63, var10);
                              var63 = (short)3879;
                              char var81 = '脽';
                              int var99 = var40 ^ 793253937;
                              byte[] var15 = var47.getBytes("ISO-8859-1");
                              long[] var50 = var14;
                              var63 = var11++;
                              long var82 = (var15[0] & 255L) << a(-130981438, var40 ^ -834898706)
                                 | (var15[1] & 255L) << a(-130981437, var40 ^ 1208770298)
                                 | (var15[2] & 255L) << a(-130981412, var40 ^ 1521909743)
                                 | (var15[3] & 255L) << a(-130981411, var40 ^ -583468967)
                                 | (var15[4] & 255L) << a(-130981410, var40 ^ -727643279)
                                 | (var15[5] & 255L) << a(-130981409, var40 ^ -324280945)
                                 | (var15[a(-130981416, var40 ^ 764218772)] & 255L) << a(-130981415, var40 ^ 248739592)
                                 | var15[a(-130981414, var40 ^ 909164646)] & 255L;
                              byte var100 = -1;

                              while (true) {
                                 long var108 = var82 ^ var8;
                                 switch (var100) {
                                    case 0:
                                       var50[var63] = var108;
                                       if (var10 >= var13) {
                                          aaaa = var14;
                                          aa = new Integer[a(-130981396, var40 ^ 1646609346)];
                                          long var0 = 5015420520915086368L;
                                          long[] var6 = new long[a(-130981395, var40 ^ 520956300)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = b('蓳', 33080, var40 ^ -1924105759)).length();
                                          byte var2 = 0;

                                          label104:
                                          while (true) {
                                             int var68 = var2;
                                             var2 += 8;
                                             var47 = var4.substring(var68, var2);
                                             var68 = (short)20306;
                                             char var85 = '脹';
                                             int var103 = var40 ^ 585713622;
                                             byte[] var7 = var47.getBytes("ISO-8859-1");
                                             long[] var53 = var6;
                                             var68 = var3++;
                                             long var86 = (var7[0] & 255L) << a(-130981394, var40 ^ -1071135216)
                                                | (var7[1] & 255L) << a(-130981393, var40 ^ 2038840989)
                                                | (var7[2] & 255L) << a(-130981400, var40 ^ -1940442917)
                                                | (var7[3] & 255L) << a(-130981399, var40 ^ -2061134236)
                                                | (var7[4] & 255L) << a(-130981398, var40 ^ -1993494844)
                                                | (var7[5] & 255L) << a(-130981397, var40 ^ -2012740702)
                                                | (var7[a(-130981404, var40 ^ 2024057670)] & 255L) << a(-130981403, var40 ^ -783615461)
                                                | var7[a(-130981402, var40 ^ 1968294144)] & 255L;
                                             byte var104 = -1;

                                             while (true) {
                                                var108 = var86 ^ var0;
                                                switch (var104) {
                                                   case 0:
                                                      var53[var68] = var108;
                                                      if (var2 >= var5) {
                                                         abb = var6;
                                                         bb = new Long[a(-130981384, var40 ^ -1739959832)];
                                                         aab = new String[aaaa(a(-130981383, var40 ^ 160776733), 5042476144504988994L)];
                                                         aaa();
                                                         ab = bbabbab.bba;
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var53[var68] = var108;
                                                      if (var2 < var5) {
                                                         continue label104;
                                                      }

                                                      var5 = (var4 = b('\ue010', 33078, var40 ^ -1703799121)).length();
                                                      var2 = 0;
                                                }

                                                short var71 = var2;
                                                var2 += 8;
                                                var47 = var4.substring(var71, var2);
                                                var71 = 14221;
                                                char var88 = '脷';
                                                int var106 = var40 ^ -920117620;
                                                var7 = var47.getBytes("ISO-8859-1");
                                                var53 = var6;
                                                var68 = var3++;
                                                var86 = (var7[0] & 255L) << a(-130981401, var40 ^ -1315118678)
                                                   | (var7[1] & 255L) << a(-130981408, var40 ^ 488741248)
                                                   | (var7[2] & 255L) << a(-130981407, var40 ^ 92182065)
                                                   | (var7[3] & 255L) << a(-130981406, var40 ^ 863013439)
                                                   | (var7[4] & 255L) << a(-130981405, var40 ^ 1403785706)
                                                   | (var7[5] & 255L) << a(-130981380, var40 ^ 1645725709)
                                                   | (var7[a(-130981379, var40 ^ 1949633569)] & 255L) << a(-130981378, var40 ^ 1564353948)
                                                   | var7[a(-130981377, var40 ^ -1834373778)] & 255L;
                                                var104 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var50[var63] = var108;
                                       if (var10 < var13) {
                                          continue label114;
                                       }

                                       var13 = (var12 = b('놞', 33082, var40 ^ 1195380772)).length();
                                       var10 = 0;
                                 }

                                 byte var66 = var10;
                                 var10 += 8;
                                 var47 = var12.substring(var66, var10);
                                 char var67 = '膞';
                                 char var84 = '脻';
                                 int var102 = var40 ^ 589064737;
                                 var15 = var47.getBytes("ISO-8859-1");
                                 var50 = var14;
                                 var63 = var11++;
                                 var82 = (var15[0] & 255L) << a(-130981413, var40 ^ 1128641750)
                                    | (var15[1] & 255L) << a(-130981420, var40 ^ 2107430102)
                                    | (var15[2] & 255L) << a(-130981419, var40 ^ 1749261574)
                                    | (var15[3] & 255L) << a(-130981418, var40 ^ 319280674)
                                    | (var15[4] & 255L) << a(-130981417, var40 ^ 61131592)
                                    | (var15[5] & 255L) << a(-130981424, var40 ^ -1362079527)
                                    | (var15[a(-130981423, var40 ^ -1511322947)] & 255L) << a(-130981422, var40 ^ 890086971)
                                    | var15[a(-130981421, var40 ^ -1222612352)] & 255L;
                                 var100 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var44);
                        break;
                     default:
                        var21[var19++] = var98;
                        if ((var44 += var17) < var20) {
                           var17 = var18.charAt(var44);
                           continue label140;
                        }

                        var20 = (var18 = b('裧', 33087, var40 ^ -1504362855)).length();
                        var17 = 4;
                        var44 = -1;
                  }

                  var47 = var18.substring(++var44, var44 + var17);
                  var10001 = 0;
               }
            }
         }

         do {
            var35 = var31[var33] ^ var29;
            char[] var37 = var30.substring(var34, var34 + var35).toCharArray();
            int var38 = 0;

            do {
               short var39 = switch (var38 % 6) {
                  default -> 196;
                  case 1 -> 5;
                  case 2 -> 155;
                  case 3 -> 77;
                  case 4 -> 28;
                  case 5 -> 65;
               };
               var37[var38] = (char)(var37[var38] ^ var39);
            } while (++var38 < var37.length);

            var32[var33] = new String(var37).intern();
            var34 += var35;
         } while (++var33 < var31.length);

         var36 = 0;
      }
   }

   @Override
   public void bab(class_332 var1, int var2, int var3, float var4) {
      this.aba(var1, false);
   }

   @Override
   public double baab() {
      return 18.0 * this.bba();
   }

   private double bba() {
      return (Double)this.aaab.abbb() / 100.0;
   }

   @Override
   public void bbb(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.aba(var1, var5);
   }

   private static int aaaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-130981464, -1821161772 ^ 660010034);
      if (aa[var3] == null) {
         aa[var3] = (int)(aaaa[var3] ^ var1);
      }

      return aa[var3];
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
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: dload 1
      // 06: aload 0
      // 07: iload 5
      // 09: ifne 1d
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.aabb ()D
      // 0f: dcmpl
      // 10: iflt 67
      // 13: goto 17
      // 16: athrow
      // 17: dload 1
      // 18: aload 0
      // 19: goto 1d
      // 1c: athrow
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.aabb ()D
      // 20: iload 5
      // 22: ifne 3b
      // 25: aload 0
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.aaaaa ()D
      // 29: dadd
      // 2a: dcmpg
      // 2b: ifgt 67
      // 2e: goto 32
      // 31: athrow
      // 32: dload 3
      // 33: aload 0
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.abb ()D
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
      // 4a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.abb ()D
      // 4d: aload 0
      // 4e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababaab.baab ()D
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

   private static String aaab(int var0, int var1) {
      int var9 = -2116198894;
      int var2 = (var0 ^ a(-130981463, var9 ^ 1077724629)) & a(-130981462, var9 ^ 1533308101);
      if (bbb[var2] == null) {
         char[] var3 = ba[var2].toCharArray();

         int var4 = switch (var3[0] & a(-130981461, var9 ^ -3583076)) {
            case 0 -> a(-130981468, var9 ^ 199846475);
            case 1 -> a(-130981467, var9 ^ -2098752451);
            case 2 -> a(-130981466, var9 ^ -2102734104);
            case 3 -> a(-130981465, var9 ^ 1278955966);
            case 4 -> a(-130981472, var9 ^ -1120116679);
            case 5 -> a(-130981471, var9 ^ 210524428);
            case 6 -> a(-130981470, var9 ^ 2010453321);
            case 7 -> a(-130981469, var9 ^ -1500873482);
            case 8 -> a(-130981444, var9 ^ -545749173);
            case 9 -> a(-130981443, var9 ^ 545129996);
            case 10 -> a(-130981442, var9 ^ -577906276);
            case 11 -> 0;
            case 12 -> a(-130981441, var9 ^ 2025246972);
            case 13 -> a(-130981448, var9 ^ -1183585698);
            case 14 -> a(-130981447, var9 ^ -1612943473);
            case 15 -> a(-130981446, var9 ^ 1343579241);
            case 16 -> a(-130981445, var9 ^ 846218054);
            case 17 -> a(-130981452, var9 ^ -1103457251);
            case 18 -> a(-130981451, var9 ^ 891784578);
            case 19 -> a(-130981450, var9 ^ -1844151128);
            case 20 -> a(-130981449, var9 ^ 701982462);
            case 21 -> a(-130981456, var9 ^ -1796234098);
            case 22 -> a(-130981455, var9 ^ 1116577487);
            case 23 -> a(-130981454, var9 ^ 496696878);
            case 24 -> a(-130981453, var9 ^ -1169128660);
            case 25 -> a(-130981556, var9 ^ -660624445);
            case 26 -> a(-130981555, var9 ^ 2141551735);
            case 27 -> a(-130981554, var9 ^ -489328205);
            case 28 -> a(-130981553, var9 ^ -1238530594);
            case 29 -> a(-130981560, var9 ^ 1182406829);
            case 30 -> a(-130981559, var9 ^ 1645433876);
            case 31 -> a(-130981558, var9 ^ 189171046);
            case 32 -> a(-130981557, var9 ^ 567354821);
            case 33 -> a(-130981564, var9 ^ 1317014604);
            case 34 -> a(-130981563, var9 ^ 1876122934);
            case 35 -> a(-130981562, var9 ^ -1221297213);
            case 36 -> a(-130981561, var9 ^ 16593997);
            case 37 -> a(-130981568, var9 ^ -958826540);
            case 38 -> a(-130981567, var9 ^ 1860436308);
            case 39 -> a(-130981566, var9 ^ 1109617018);
            case 40 -> a(-130981565, var9 ^ 1088618742);
            case 41 -> a(-130981540, var9 ^ 1141339002);
            case 42 -> a(-130981539, var9 ^ 1987682162);
            case 43 -> a(-130981538, var9 ^ -81059729);
            case 44 -> a(-130981537, var9 ^ -1876571874);
            case 45 -> a(-130981544, var9 ^ 1073732899);
            case 46 -> a(-130981543, var9 ^ 380086101);
            case 47 -> a(-130981542, var9 ^ 137219150);
            case 48 -> a(-130981541, var9 ^ 577228963);
            case 49 -> a(-130981548, var9 ^ -1097657269);
            case 50 -> a(-130981547, var9 ^ -805234490);
            case 51 -> a(-130981546, var9 ^ 2032459369);
            case 52 -> a(-130981545, var9 ^ 2059264555);
            case 53 -> a(-130981552, var9 ^ 1202985101);
            case 54 -> a(-130981551, var9 ^ 1487574116);
            case 55 -> a(-130981550, var9 ^ 47607540);
            case 56 -> a(-130981549, var9 ^ 1363691192);
            case 57 -> a(-130981524, var9 ^ -1178457808);
            case 58 -> 5;
            case 59 -> a(-130981523, var9 ^ -2109238803);
            case 60 -> a(-130981522, var9 ^ 1133584751);
            case 61 -> a(-130981521, var9 ^ -1416703290);
            case 62 -> a(-130981528, var9 ^ 160495564);
            case 63 -> a(-130981527, var9 ^ -1888004763);
            case 64 -> a(-130981526, var9 ^ 2003187585);
            case 65 -> a(-130981525, var9 ^ 1424496352);
            case 66 -> a(-130981532, var9 ^ -1811408715);
            case 67 -> a(-130981531, var9 ^ 1075654818);
            case 68 -> a(-130981530, var9 ^ -1480776898);
            case 69 -> a(-130981529, var9 ^ -1415225254);
            case 70 -> a(-130981536, var9 ^ 1271825792);
            case 71 -> a(-130981535, var9 ^ -2015949772);
            case 72 -> a(-130981534, var9 ^ 1189467149);
            case 73 -> a(-130981533, var9 ^ 840236917);
            case 74 -> a(-130981508, var9 ^ 313732133);
            case 75 -> a(-130981507, var9 ^ 1646850633);
            case 76 -> a(-130981506, var9 ^ -1856255541);
            case 77 -> a(-130981505, var9 ^ -1110139902);
            case 78 -> a(-130981512, var9 ^ 253595782);
            case 79 -> a(-130981511, var9 ^ -479162918);
            case 80 -> a(-130981510, var9 ^ -767721675);
            case 81 -> a(-130981509, var9 ^ -1473949996);
            case 82 -> a(-130981516, var9 ^ 1829194334);
            case 83 -> a(-130981515, var9 ^ 956188247);
            case 84 -> a(-130981514, var9 ^ -202469217);
            case 85 -> a(-130981513, var9 ^ 1657485874);
            case 86 -> a(-130981520, var9 ^ -1096486002);
            case 87 -> a(-130981519, var9 ^ 1383090134);
            case 88 -> a(-130981518, var9 ^ -80353236);
            case 89 -> a(-130981517, var9 ^ -1773121135);
            case 90 -> a(-130981620, var9 ^ 295762563);
            case 91 -> a(-130981619, var9 ^ 1488312996);
            case 92 -> a(-130981618, var9 ^ 830907365);
            case 93 -> a(-130981617, var9 ^ 930235722);
            case 94 -> a(-130981624, var9 ^ 153323532);
            case 95 -> a(-130981623, var9 ^ -1403067556);
            case 96 -> a(-130981622, var9 ^ -498162607);
            case 97 -> a(-130981621, var9 ^ -1961225565);
            case 98 -> a(-130981628, var9 ^ 497719704);
            case 99 -> a(-130981627, var9 ^ 1676003309);
            case 100 -> a(-130981626, var9 ^ 2007924580);
            case 101 -> 2;
            case 102 -> a(-130981625, var9 ^ -40121525);
            case 103 -> a(-130981632, var9 ^ -1864674377);
            case 104 -> a(-130981631, var9 ^ 356551572);
            case 105 -> a(-130981630, var9 ^ -764779575);
            case 106 -> a(-130981629, var9 ^ 234842052);
            case 107 -> a(-130981604, var9 ^ 1555919164);
            case 108 -> a(-130981603, var9 ^ 177059465);
            case 109 -> a(-130981602, var9 ^ 142909969);
            case 110 -> a(-130981601, var9 ^ 801777430);
            case 111 -> a(-130981608, var9 ^ 953707814);
            case 112 -> a(-130981607, var9 ^ -1675835498);
            case 113 -> a(-130981606, var9 ^ -1226878311);
            case 114 -> a(-130981605, var9 ^ -1728405121);
            case 115 -> a(-130981612, var9 ^ 388425873);
            case 116 -> a(-130981611, var9 ^ 1178406152);
            case 117 -> a(-130981610, var9 ^ -2037400029);
            case 118 -> a(-130981609, var9 ^ -806360716);
            case 119 -> a(-130981616, var9 ^ 2027424606);
            case 120 -> a(-130981615, var9 ^ -885465456);
            case 121 -> a(-130981614, var9 ^ 643191881);
            case 122 -> a(-130981613, var9 ^ 505048998);
            case 123 -> a(-130981588, var9 ^ -634940240);
            case 124 -> a(-130981587, var9 ^ 1043104853);
            case 125 -> a(-130981586, var9 ^ 1045536416);
            case 126 -> a(-130981585, var9 ^ 629376220);
            case 127 -> a(-130981592, var9 ^ -41381518);
            case 128 -> a(-130981591, var9 ^ 1575507522);
            case 129 -> a(-130981590, var9 ^ -1289919946);
            case 130 -> a(-130981589, var9 ^ -1735985354);
            case 131 -> a(-130981596, var9 ^ -1534541927);
            case 132 -> a(-130981595, var9 ^ 1555509285);
            case 133 -> a(-130981594, var9 ^ -288362283);
            case 134 -> a(-130981593, var9 ^ 427824940);
            case 135 -> a(-130981600, var9 ^ -1066615678);
            case 136 -> a(-130981599, var9 ^ 119687095);
            case 137 -> a(-130981598, var9 ^ -504108368);
            case 138 -> a(-130981597, var9 ^ 1804184050);
            case 139 -> a(-130981572, var9 ^ 350711960);
            case 140 -> a(-130981571, var9 ^ 794490750);
            case 141 -> a(-130981570, var9 ^ 1574097759);
            case 142 -> a(-130981569, var9 ^ -2112819610);
            case 143 -> a(-130981576, var9 ^ -783317380);
            case 144 -> a(-130981575, var9 ^ -1880535406);
            case 145 -> a(-130981574, var9 ^ -1921413329);
            case 146 -> a(-130981573, var9 ^ -878234394);
            case 147 -> a(-130981580, var9 ^ 728553722);
            case 148 -> a(-130981579, var9 ^ 1118233346);
            case 149 -> a(-130981578, var9 ^ -281884693);
            case 150 -> a(-130981577, var9 ^ 438557868);
            case 151 -> a(-130981584, var9 ^ 1142842902);
            case 152 -> a(-130981583, var9 ^ 684189875);
            case 153 -> a(-130981582, var9 ^ 1311015267);
            case 154 -> a(-130981581, var9 ^ -1614498172);
            case 155 -> a(-130981684, var9 ^ 1309757180);
            case 156 -> a(-130981683, var9 ^ -614258811);
            case 157 -> a(-130981682, var9 ^ -1729977988);
            case 158 -> a(-130981681, var9 ^ -196993933);
            case 159 -> a(-130981688, var9 ^ 1164712334);
            case 160 -> a(-130981687, var9 ^ -1999364756);
            case 161 -> a(-130981686, var9 ^ 1114333090);
            case 162 -> a(-130981685, var9 ^ 789866384);
            case 163 -> a(-130981692, var9 ^ 1917984903);
            case 164 -> a(-130981691, var9 ^ 1165488630);
            case 165 -> a(-130981690, var9 ^ -216114020);
            case 166 -> a(-130981689, var9 ^ -850791589);
            case 167 -> a(-130981696, var9 ^ 1854419625);
            case 168 -> a(-130981695, var9 ^ 464828798);
            case 169 -> a(-130981694, var9 ^ 1424784985);
            case 170 -> a(-130981693, var9 ^ 456952584);
            case 171 -> a(-130981668, var9 ^ 2122229851);
            case 172 -> a(-130981667, var9 ^ 1880914942);
            case 173 -> a(-130981666, var9 ^ -1540660575);
            case 174 -> a(-130981665, var9 ^ 25754464);
            case 175 -> a(-130981672, var9 ^ -1923563661);
            case 176 -> a(-130981671, var9 ^ 1775490968);
            case 177 -> a(-130981670, var9 ^ 1994006051);
            case 178 -> a(-130981669, var9 ^ -843768232);
            case 179 -> a(-130981676, var9 ^ 2119997800);
            case 180 -> a(-130981675, var9 ^ 109460338);
            case 181 -> a(-130981674, var9 ^ -1522816510);
            case 182 -> a(-130981673, var9 ^ 1455544121);
            case 183 -> a(-130981680, var9 ^ -1525620604);
            case 184 -> a(-130981679, var9 ^ 1549261958);
            case 185 -> a(-130981678, var9 ^ 1394748404);
            case 186 -> a(-130981677, var9 ^ 1338881272);
            case 187 -> a(-130981652, var9 ^ 2055776061);
            case 188 -> a(-130981651, var9 ^ -606071027);
            case 189 -> a(-130981650, var9 ^ 1025356183);
            case 190 -> a(-130981649, var9 ^ -683503003);
            case 191 -> a(-130981656, var9 ^ 1569597386);
            case 192 -> a(-130981655, var9 ^ -1814718514);
            case 193 -> a(-130981654, var9 ^ 2012288211);
            case 194 -> a(-130981653, var9 ^ -612460571);
            case 195 -> 3;
            case 196 -> a(-130981660, var9 ^ -2144409970);
            case 197 -> a(-130981659, var9 ^ 819202078);
            case 198 -> a(-130981658, var9 ^ 1008426752);
            case 199 -> a(-130981657, var9 ^ 194614067);
            case 200 -> a(-130981664, var9 ^ -1752850552);
            case 201 -> a(-130981663, var9 ^ 351674489);
            case 202 -> a(-130981662, var9 ^ 1967306322);
            case 203 -> a(-130981661, var9 ^ -125518602);
            case 204 -> 1;
            case 205 -> a(-130981636, var9 ^ -177441544);
            case 206 -> a(-130981635, var9 ^ 177005763);
            case 207 -> a(-130981634, var9 ^ -1621659399);
            case 208 -> a(-130981633, var9 ^ -1261903062);
            case 209 -> a(-130981640, var9 ^ 1660050754);
            case 210 -> a(-130981639, var9 ^ 464667446);
            case 211 -> a(-130981638, var9 ^ 2040924229);
            case 212 -> a(-130981637, var9 ^ 1602145450);
            case 213 -> a(-130981644, var9 ^ 2088587002);
            case 214 -> a(-130981643, var9 ^ 863234514);
            case 215 -> a(-130981642, var9 ^ 1527985690);
            case 216 -> a(-130981641, var9 ^ 1267965355);
            case 217 -> 4;
            case 218 -> a(-130981648, var9 ^ 1092970577);
            case 219 -> a(-130981647, var9 ^ -627549966);
            case 220 -> a(-130981646, var9 ^ 563275713);
            case 221 -> a(-130981645, var9 ^ 1139394591);
            case 222 -> a(-130981748, var9 ^ 1372066413);
            case 223 -> a(-130981747, var9 ^ -114116941);
            case 224 -> a(-130981746, var9 ^ 204389853);
            case 225 -> a(-130981745, var9 ^ -241862763);
            case 226 -> a(-130981752, var9 ^ 334715739);
            case 227 -> a(-130981751, var9 ^ -959760939);
            case 228 -> a(-130981750, var9 ^ 938314474);
            case 229 -> a(-130981749, var9 ^ 207156671);
            case 230 -> a(-130981756, var9 ^ -1048620103);
            case 231 -> a(-130981755, var9 ^ 1859690891);
            case 232 -> a(-130981754, var9 ^ 1923585113);
            case 233 -> a(-130981753, var9 ^ 555832156);
            case 234 -> a(-130981760, var9 ^ 1167981046);
            case 235 -> a(-130981759, var9 ^ -1863655390);
            case 236 -> a(-130981758, var9 ^ 1440100924);
            case 237 -> a(-130981757, var9 ^ -2131294802);
            case 238 -> a(-130981732, var9 ^ -1052669398);
            case 239 -> a(-130981731, var9 ^ 1914345991);
            case 240 -> a(-130981730, var9 ^ -1054125072);
            case 241 -> a(-130981729, var9 ^ 786616854);
            case 242 -> a(-130981736, var9 ^ 179768999);
            case 243 -> a(-130981735, var9 ^ -1155278134);
            case 244 -> a(-130981734, var9 ^ -1728459695);
            case 245 -> a(-130981733, var9 ^ -221661603);
            case 246 -> a(-130981740, var9 ^ -362511567);
            case 247 -> a(-130981739, var9 ^ -1827893859);
            case 248 -> a(-130981738, var9 ^ -1504356793);
            case 249 -> a(-130981737, var9 ^ 218178836);
            case 250 -> a(-130981744, var9 ^ 2096633449);
            case 251 -> a(-130981743, var9 ^ -556766807);
            case 252 -> a(-130981742, var9 ^ 851430534);
            case 253 -> a(-130981741, var9 ^ 948992638);
            case 254 -> a(-130981716, var9 ^ 1847548261);
            default -> a(-130981715, var9 ^ -908848500);
         };
         int var5 = (var1 & a(-130981714, var9 ^ 1378305763)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-130981713, var9 ^ 610706520)) >>> a(-130981720, var9 ^ 1555593129)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-130981719, var9 ^ 769214670);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-130981718, var9 ^ 1543730692);
            }
         }

         bbb[var2] = new String(var3).intern();
      }

      return bbb[var2];
   }

   @Override
   public double abb() {
      return (Double)this.aaba.abbb();
   }

   @Override
   public double aabb() {
      return (Double)this.aba.abbb();
   }
}
