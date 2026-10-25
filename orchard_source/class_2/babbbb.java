package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum babbbb {
   private static final babbbb[] aa;
   private static final int[] aab;
   public static final babbbb b;
   public static final babbbb ab;
   private static final String[] aba;
   public static final babbbb ba;
   private final ababbbbaa bb;
   public static final babbbb a;
   private static final Object[] abb;
   public static final babbbb aaa;

   private babbbb(ababbbbaa var3) {
      this.bb = var3;
   }

   public ababbbbaa aa() {
      return this.bb;
   }

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ 1184993901;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         abb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1914452346;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 53;
            case 1 -> 109;
            case 2 -> 84;
            case 3 -> 58;
            case 4 -> 175;
            case 5 -> 161;
            case 6 -> 120;
            case 7 -> 74;
            case 8 -> 8;
            case 9 -> 48;
            case 10 -> 217;
            case 11 -> 160;
            case 12 -> 138;
            case 13 -> 195;
            case 14 -> 203;
            case 15 -> 137;
            case 16 -> 121;
            case 17 -> 2;
            case 18 -> 224;
            case 19 -> 83;
            case 20 -> 137;
            case 21 -> 226;
            case 22 -> 106;
            case 23 -> 228;
            case 24 -> 144;
            case 25 -> 160;
            case 26 -> 119;
            case 27 -> 212;
            case 28 -> 93;
            case 29 -> 145;
            case 30 -> 10;
            case 31 -> 97;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 456618397;
      short var12 = 29794;
      int var10 = 0;
      String[] var10002 = new String[2];
      int var11 = 0;
      String[] var9 = var10002;
      int var8 = "Q쁱嶐욙붏텕궯줱\ued91챹綏\udcb5ᖬퟱ얗\ud979趉싕얪\uded1斐픙\udd89칵햬\ud9b1䖗쾙斉쓕疯웑ඐ좙햍쵵趩\ud951斔콙疌쮕㖫\udd11궔\uddd9\ued88\udab5疭옱喒\uded9붏혵㶬삱\udd96픹ֈ셕ᶬ족䖖쉹ᶌ섕䖪옱떒혹춋익춪성䶐푙։픕疯\uda11ⶖ쟙\r穖ﱿ稞汢棒\udc43瓶౽秞\udc60桒걂棖"
         .length();
      String var7 = "Q쁱嶐욙붏텕궯줱\ued91챹綏\udcb5ᖬퟱ얗\ud979趉싕얪\uded1斐픙\udd89칵햬\ud9b1䖗쾙斉쓕疯웑ඐ좙햍쵵趩\ud951斔콙疌쮕㖫\udd11궔\uddd9\ued88\udab5疭옱喒\uded9붏혵㶬삱\udd96픹ֈ셕ᶬ족䖖쉹ᶌ섕䖪옱떒혹춋익춪성䶐푙։픕疯\uda11ⶖ쟙\r穖ﱿ稞汢棒\udc43瓶౽秞\udc60桒걂棖";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 197;
               case 1 -> 161;
               case 2 -> 45;
               case 3 -> 190;
               case 4 -> 1;
               case 5 -> 154;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      aba = var9;
      abb = new Object[var9.length];
      byte var21 = 0;
      aab = new int[14];
      int var10001 = 0;
      byte[] var35 = "q¶C\n=B\u0010¹¸tÍ¢EY\u001c\u0011®e%\u009bjKï1³¬û\u0005\u0086üÖ?&7vº¸és68+\u0086X\u0099£k_\u0094M\"Sô\u001fdg".getBytes("ISO-8859-1");

      int var57;
      do {
         aab[var21] = ((var35[var10001] & 255) << 24 | (var35[var10001 + 1] & 255) << 16 | (var35[var10001 + 2] & 255) << 8 | var35[var10001 + 3] & 255)
            ^ 452776472;
         var21 += 1;
         var57 = var10001 + 4;
         var10001 += 4;
      } while (var57 < var35.length);

      String[] var0 = new String[b(1000560444, var17 ^ 1272922871)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ba(1184993901, var17 ^ -1134731852)).length();
      int var2 = 5;
      int var19 = -1;

      label103:
      while (true) {
         String var22 = var3.substring(++var19, var19 + var2);
         var10001 = (byte)-1;

         while (true) {
            label98: {
               char[] var28 = var22.toCharArray();
               var57 = var28.length;
               int var6 = 0;
               var44 = var28;
               var10001 = var57;
               char[] var61;
               int var75;
               if (var57 <= 1) {
                  var61 = var28;
                  var75 = var6;
               } else {
                  var44 = var28;
                  var10001 = var57;
                  if (var57 <= var6) {
                     break label98;
                  }

                  var61 = var28;
                  var75 = var6;
               }

               while (true) {
                  var61[var75] = (char)(var61[var75] ^ switch (var6 % b(1000560446, var17 ^ -2111976402)) {
                     case 0 -> b(1000560447, var17 ^ 2133859773);
                     case 1 -> b(1000560440, var17 ^ -1811143649);
                     case 2 -> b(1000560441, var17 ^ 1344466602);
                     case 3 -> b(1000560442, var17 ^ -1983519661);
                     case 4 -> b(1000560443, var17 ^ -1131030627);
                     case 5 -> b(1000560436, var17 ^ 475952933);
                     default -> b(1000560437, var17 ^ -2105511267);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var75 = var10001;
                     var61 = var44;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var61 = var44;
                     var75 = var6;
                  }
               }
            }

            String var68 = new String(var44).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var68;
                  if ((var19 += var2) >= var5) {
                     ba = new babbbb(aabbaaaba.aaab(var0[b(1000560438, var17 ^ 37914588)]));
                     b = new babbbb(aabbaaaba.aaab(var0[5]));
                     aaa = new babbbb(aabbaaaba.aaab(var0[2]));
                     ab = new babbbb(aabbaaaba.aaab(var0[b(1000560432, var17 ^ -1373363234)]));
                     a = new babbbb(aabbaaaba.aaab(var0[b(1000560433, var17 ^ -831101459)]));
                     aa = a();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var68;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label103;
                  }

                  var5 = (var3 = ba(1184993900, var17 ^ -2121464732)).length();
                  var2 = b(1000560445, var17 ^ 120262975);
                  var19 = -1;
            }

            var22 = var3.substring(++var19, var19 + var2);
            var10001 = (byte)0;
         }
      }
   }

   private static babbbb[] a() {
      return new babbbb[]{ba, b, aaa, ab, a};
   }

   @Override
   public String toString() {
      return this.bb.abab();
   }

   private static int b(int var0, int var1) {
      int var2 = aab[var0 ^ 1000560444] ^ var1 ^ var0;
      var2 -= 22661;
      var2 ^= 39700;
      var2 += 2835;
      var2 -= 56453;
      var2 ^= 126;
      var2 += 2528;
      var2 ^= 4910;
      return var2 ^ 21251;
   }

   public aaaabbba ab() {
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
      // 01: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbb.ordinal ()I
      // 04: tableswitch 36 0 4 65 65 47 53 59
      // 28: new java/lang/MatchException
      // 2b: dup
      // 2c: aconst_null
      // 2d: aconst_null
      // 2e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 31: athrow
      // 32: athrow
      // 33: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba;
      // 36: goto 46
      // 39: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba;
      // 3c: goto 46
      // 3f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba;
      // 42: goto 46
      // 45: aconst_null
      // 46: areturn
   }
}
