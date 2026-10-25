package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaabbaba {
   private static final Object[] aab;
   public static final aaabbaba aa;
   private static final String[] aaa;
   private static final int[] bb;
   public static final aaabbaba ab;
   private final ababbbbaa ba;
   private static final aaabbaba[] a;
   public static final aaabbaba b;

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ -368901981] ^ var1 ^ var0;
      var2 += 12606;
      var2 -= 22555;
      var2 ^= 13289;
      var2 ^= 13019;
      var2 ^= 63051;
      var2 -= 3722;
      var2 += 26852;
      var2 -= 33298;
      var2 ^= 19404;
      return var2 + 55120;
   }

   public ababbbbaa aa() {
      return this.ba;
   }

   public float ab(float param1) {
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
      // 05: iload 2
      // 06: ifne 23
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaba;
      // 0c: if_acmpne 22
      // 0f: goto 13
      // 12: athrow
      // 13: fload 1
      // 14: invokestatic net/minecraft/class_3532.method_15355 (F)F
      // 17: ldc 3.1415927
      // 19: fmul
      // 1a: f2d
      // 1b: invokestatic net/minecraft/class_3532.method_15374 (D)F
      // 1e: goto 2e
      // 21: athrow
      // 22: aload 0
      // 23: fload 1
      // 24: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaba.a (F)F
      // 27: ldc 3.1415927
      // 29: fmul
      // 2a: f2d
      // 2b: invokestatic net/minecraft/class_3532.method_15374 (D)F
      // 2e: freturn
   }

   private static String aaa(int var0, int var1) {
      int var3 = var0 ^ -24050314;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1178429740;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 125;
            case 1 -> 179;
            case 2 -> 252;
            case 3 -> 26;
            case 4 -> 194;
            case 5 -> 100;
            case 6 -> 23;
            case 7 -> 124;
            case 8 -> 80;
            case 9 -> 56;
            case 10 -> 70;
            case 11 -> 204;
            case 12 -> 11;
            case 13 -> 93;
            case 14 -> 46;
            case 15 -> 197;
            case 16 -> 252;
            case 17 -> 135;
            case 18 -> 66;
            case 19 -> 201;
            case 20 -> 162;
            case 21 -> 131;
            case 22 -> 167;
            case 23 -> 166;
            case 24 -> 103;
            case 25 -> 67;
            case 26 -> 213;
            case 27 -> 65;
            case 28 -> 205;
            case 29 -> 29;
            case 30 -> 225;
            case 31 -> 85;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1700442051;
      int var17 = 0;
      int var16 = 0;
      String[] var15 = new String[2];
      short var18 = 16680;
      int var14 = "(\uf3d6\ue91fﰝ樂\uf825짨\uf08c褱\uf652ভ\uf746ᤜ\uf74d㦼\uf6d5秢ﾌ뤸\uf6e2覡ￆ⤛︽\u09b4\uf055觫\ufddc夷輸즮臘\ud912\uf6bd禴ﺵ䧭\uf80c\ud937\uf1e2\u09a9\u0013紐龐珛༱疓罤纺徸穔伡羰従罋伴緓⽮甊\uefb6穴"
         .length();
      String var13 = "(\uf3d6\ue91fﰝ樂\uf825짨\uf08c褱\uf652ভ\uf746ᤜ\uf74d㦼\uf6d5秢ﾌ뤸\uf6e2覡ￆ⤛︽\u09b4\uf055觫\ufddc夷輸즮臘\ud912\uf6bd禴ﺵ䧭\uf80c\ud937\uf1e2\u09a9\u0013紐龐珛༱疓罤纺徸穔伡羰従罋伴緓⽮甊\uefb6穴";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 31;
               case 1 -> 229;
               case 2 -> 196;
               case 3 -> 75;
               case 4 -> 92;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aaa = var15;
      aab = new Object[var15.length];
      int var9 = 1238919119;
      byte[] var7 = "vT\u0013\u0014×(\u0089\u008cÄ¡Ì8Ý\u0001í½\u0092dô\u001eÔGqði\u0002\u0014N\u0089ò10r¬\u0000\u0010Òô\u0092«û\u009eaW".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      bb = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         bb[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[b(-368901981, var23 ^ 1328183443)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aaa(-24050314, var23 ^ 2114624087)).length();
      int var2 = b(-368901982, var23 ^ -296295926);
      int var25 = -1;

      label96:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var40;
            label91: {
               char[] var31 = var28.toCharArray();
               int var10003 = var31.length;
               int var6 = 0;
               var40 = var31;
               var10001 = var10003;
               char[] var48;
               int var10004;
               if (var10003 <= 1) {
                  var48 = var31;
                  var10004 = var6;
               } else {
                  var40 = var31;
                  var10001 = var10003;
                  if (var10003 <= var6) {
                     break label91;
                  }

                  var48 = var31;
                  var10004 = var6;
               }

               while (true) {
                  var48[var10004] = (char)(var48[var10004] ^ switch (var6 % b(-368901984, var23 ^ -461404618)) {
                     case 0 -> b(-368901977, var23 ^ -1424318566);
                     case 1 -> b(-368901978, var23 ^ -315024086);
                     case 2 -> b(-368901979, var23 ^ 1350334506);
                     case 3 -> b(-368901980, var23 ^ -1332978374);
                     case 4 -> b(-368901973, var23 ^ 1272081285);
                     case 5 -> b(-368901974, var23 ^ -343213613);
                     default -> b(-368901975, var23 ^ -1025503928);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var48 = var40;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var48 = var40;
                     var10004 = var6;
                  }
               }
            }

            String var55 = new String(var40).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var55;
                  if ((var25 += var2) >= var5) {
                     aa = new aaabbaba(aabbaaaba.aaab(var0[4]));
                     b = new aaabbaba(aabbaaaba.aaab(var0[2]));
                     ab = new aaabbaba(aabbaaaba.aaab(var0[1]));
                     a = ba();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var55;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label96;
                  }

                  var5 = (var3 = aaa(-24050313, var23 ^ 383967397)).length();
                  var2 = b(-368901983, var23 ^ -35674181);
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   private static aaabbaba[] ba() {
      return new aaabbaba[]{aa, b, ab};
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   public static aaabbaba bb(String var0) {
      return Enum.valueOf(aaabbaba.class, var0);
   }

   private aaabbaba(ababbbbaa var3) {
      this.ba = var3;
   }

   public float a(float param1) {
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
      // 05: iload 2
      // 06: ifne 20
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaba.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaba;
      // 0c: if_acmpne 1f
      // 0f: goto 13
      // 12: athrow
      // 13: fload 1
      // 14: fload 1
      // 15: fmul
      // 16: ldc 3.0
      // 18: fconst_2
      // 19: fload 1
      // 1a: fmul
      // 1b: fsub
      // 1c: fmul
      // 1d: freturn
      // 1e: athrow
      // 1f: aload 0
      // 20: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaba;
      // 23: if_acmpne 35
      // 26: fconst_1
      // 27: fconst_1
      // 28: fload 1
      // 29: fsub
      // 2a: f2d
      // 2b: ldc2_w 2.4
      // 2e: invokestatic java/lang/Math.pow (DD)D
      // 31: d2f
      // 32: fsub
      // 33: freturn
      // 34: athrow
      // 35: fload 1
      // 36: freturn
   }
}
