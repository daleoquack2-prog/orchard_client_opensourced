package nsc;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class abbaababa {
   private static final String[] aaa;
   private static final double aa = 1.6E-4;
   private static final int[] bb;
   private static final Object[] aab;
   private static final double a = 0.0027;
   private static final long[] ab;
   private static final double ba = 0.0042;
   private static final Integer[] b;

   private static Color aa(float var0, float var1, float var2, int var3) {
      int var5 = 1588506222;
      int var4 = Color.HSBtoRGB(var0, var1, var2);
      return new Color(
         var4 >> aaa(b(471702168, var5 ^ -232430564), 297618408571530278L) & aaa(b(471702169, var5 ^ -1360016689), 3050146453825288954L),
         var4 >> aaa(b(471702170, var5 ^ 1762814885), 5223832918713368669L) & aaa(b(471702171, var5 ^ -670941079), 3050146453825288954L),
         var4 & aaa(b(471702172, var5 ^ 252371339), 3050146453825288954L),
         aba(var3)
      );
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 471702168] ^ var1 ^ var0;
      var2 -= 44787;
      var2 -= 61299;
      var2 += 20714;
      var2 ^= 56965;
      var2 ^= 203;
      var2 += 62506;
      var2 += 50868;
      var2 += 9040;
      return var2 + 57111;
   }

   public static Color ab(Color var0, double var1) {
      int var3 = baaabbaa.bba;

      Color var10000;
      label22: {
         label21: {
            try {
               var10000 = var0;
               if (var3 != 0) {
                  break label22;
               }

               if (var0 == null) {
                  break label21;
               }
            } catch (MatchException var5) {
               throw var5;
            }

            var10000 = var0;
            break label22;
         }

         var10000 = Color.WHITE;
      }

      Color var4 = var10000;
      return bbb(var4, (int)Math.round(var4.getAlpha() * Math.max(0.0, var1)));
   }

   private static Color ba(double var0, int var2) {
      float var3 = (float)((System.currentTimeMillis() * 1.6E-4 + var0 * 0.173) % 1.0);
      return aa(var3, 0.78F, 1.0F, var2);
   }

   static {
      int var24 = 1798539852;
      int var18 = 0;
      short var19 = 925;
      int var10001 = "0ꌓ೭뺳ᳩ뢓볪됳ᳬꅓ峭떓\uecee띳擬ꇳᳪꟳﳪꂓ峭뗓\ue4efꁓ೫놓㓭뇳䳯껳듯넓糫ꍓ\ue4ed꺓೨뺳곪ꞓ볯껳\ue4ea꿳ᳫꭳ瓮꩓볫\n퐻뻷툻ᛷ헻훷킛黵튻ᛵ\u0010ꄉ뉫ꠉ詫꧉ᩩ\ua8c9鉩ꆩ쩨릉쉭됉䉩녩婨\n哣裗勣⃗唣\ue0d7偃꣕剣⃕".length();
      int var17 = 0;
      int var15 = var10001;
      String var14 = "0ꌓ೭뺳ᳩ뢓볪됳ᳬꅓ峭떓\uecee띳擬ꇳᳪꟳﳪꂓ峭뗓\ue4efꁓ೫놓㓭뇳䳯껳듯넓糫ꍓ\ue4ed꺓೨뺳곪ꞓ볯껳\ue4ea꿳ᳫꭳ瓮꩓볫\n퐻뻷툻ᛷ헻훷킛黵튻ᛵ\u0010ꄉ뉫ꠉ詫꧉ᩩ\ua8c9鉩ꆩ쩨릉쉭됉䉩녩婨\n哣裗勣⃗唣\ue0d7偃꣕剣⃕";
      String[] var16 = new String[4];

      do {
         char var20 = var14.charAt(var18);
         var10001 = var18 + 1;
         int var10002 = var18 + 1 + var20;
         int var22 = 0;
         char[] var21 = var14.substring(var10001, var10002).toCharArray();

         do {
            char var23 = var21[var22];
            if (var22 % 2 == 0) {
               var21[var22] = (char)((var23 >>> 5 | var23 << 11) & 65535 ^ var19);
            } else {
               var21[var22] = (char)((var23 << 5 | var23 >>> 11) & 65535 ^ var19);
            }
         } while (++var22 < var21.length);

         var16[var17] = new String(var21);
         var17++;
         var18 = var18 + var20 + 1;
      } while (var18 < var15);

      aaa = var16;
      aab = new Object[var16.length];
      int var10 = -1189921470;
      byte[] var8 = "ö{´tª±\fØmL«\u0017Ü\\\u0086|\u000bT'\u0099Ý\"3\u009fj\u009d\tN¹MR\u008f\u008c'ÍàÒÈ\u001e-\u0092\u0084ã³\u000f_!\u0087NÍ·\u0006G.g4_p3î\t\u0099dZ\u001a¥(\u007fÿÑ\u0001Ê\u0090i´ìä\u009fª\u009bÐ¼\u00162Ú:'¿p¶\u0016\u0088AüêD|ý\u001dós\u0090;[LÃ\u0094ÚÒb¾m.\r\u0013íÓçºÅ\u0096A\u0013\u0091TÉ*'Ex¾E5T\u0081=i\u000bõÙ\u0094@J5µ\u008f\u00182"
         .getBytes("ISO-8859-1");
      int var9 = var8.length / 4;
      bb = new int[var9];
      byte var11 = 0;
      int var12 = 0;

      do {
         int var13 = (var8[var11] & 255) << 24 | (var8[var11 + 1] & 255) << 16 | (var8[var11 + 2] & 255) << 8 | var8[var11 + 3] & 255;
         var13 ^= var10;
         bb[var12] = var13;
         var11 += 4;
      } while (++var12 < var9);

      long var0 = 7819874665968101186L;
      long[] var6 = new long[b(471702161, var24 ^ -485762629)];
      int var3 = 0;
      String var4;
      int var5 = (var4 = aaab(-1654532607, var24 ^ 2121852931)).length();
      byte var2 = 0;

      label53:
      while (true) {
         int var30 = var2;
         var2 += 8;
         String var10000 = var4.substring(var30, var2);
         var30 = -1654532608;
         int var35 = var24 ^ 1024631090;
         byte[] var7 = var10000.getBytes("ISO-8859-1");
         long[] var27 = var6;
         var30 = var3++;
         long var36 = (var7[0] & 255L) << b(471702162, var24 ^ -1555618794)
            | (var7[1] & 255L) << b(471702163, var24 ^ 1050469947)
            | (var7[2] & 255L) << b(471702164, var24 ^ 2131652789)
            | (var7[3] & 255L) << b(471702165, var24 ^ 1995284670)
            | (var7[4] & 255L) << b(471702166, var24 ^ 1857287279)
            | (var7[5] & 255L) << b(471702167, var24 ^ 945464258)
            | (var7[b(471702152, var24 ^ 728166386)] & 255L) << b(471702153, var24 ^ -837630396)
            | var7[b(471702154, var24 ^ -1582664864)] & 255L;
         byte var10003 = -1;

         while (true) {
            long var40 = var36 ^ var0;
            switch (var10003) {
               case 0:
                  var27[var30] = var40;
                  if (var2 >= var5) {
                     ab = var6;
                     b = new Integer[b(471702148, var24 ^ 533648494)];
                     return;
                  }
                  break;
               default:
                  var27[var30] = var40;
                  if (var2 < var5) {
                     continue label53;
                  }

                  var5 = (var4 = aaab(-1654532605, var24 ^ -1372075322)).length();
                  var2 = 0;
            }

            int var33 = var2;
            var2 += 8;
            var10000 = var4.substring(var33, var2);
            var33 = -1654532606;
            var35 = var24 ^ -116092537;
            var7 = var10000.getBytes("ISO-8859-1");
            var27 = var6;
            var30 = var3++;
            var36 = (var7[0] & 255L) << b(471702155, var24 ^ -715363033)
               | (var7[1] & 255L) << b(471702156, var24 ^ -511716975)
               | (var7[2] & 255L) << b(471702157, var24 ^ -335945707)
               | (var7[3] & 255L) << b(471702158, var24 ^ 1098240281)
               | (var7[4] & 255L) << b(471702159, var24 ^ 1883188700)
               | (var7[5] & 255L) << b(471702144, var24 ^ 1295964796)
               | (var7[b(471702145, var24 ^ 1112800479)] & 255L) << b(471702146, var24 ^ 2097173343)
               | var7[b(471702147, var24 ^ -475956760)] & 255L;
            var10003 = 0;
         }
      }
   }

   public static Color bb(Color param0, abbbab param1, double param2, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 0
      // 06: iload 5
      // 08: ifne 50
      // 0b: ifnonnull 4f
      // 0e: goto 12
      // 11: athrow
      // 12: new java/awt/Color
      // 15: dup
      // 16: ldc 471702173
      // 18: ldc -1345587476
      // 1a: ldc 672790129
      // 1c: ixor
      // 1d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.b (II)I
      // 20: ldc2_w 7313415444392457504
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.aaa (IJ)I
      // 26: ldc 471702174
      // 28: ldc -1345587476
      // 2a: ldc -1616472100
      // 2c: ixor
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.b (II)I
      // 30: ldc2_w 3050146453825288954
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.aaa (IJ)I
      // 36: ldc 471702175
      // 38: ldc -1345587476
      // 3a: ldc 1282853916
      // 3c: ixor
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.b (II)I
      // 40: ldc2_w 3050146453825288954
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.aaa (IJ)I
      // 46: iload 4
      // 48: invokespecial java/awt/Color.<init> (IIII)V
      // 4b: goto 55
      // 4e: athrow
      // 4f: aload 0
      // 50: iload 4
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.bbb (Ljava/awt/Color;I)Ljava/awt/Color;
      // 55: astore 6
      // 57: aload 1
      // 58: iload 5
      // 5a: ifne 67
      // 5d: ifnonnull 6a
      // 60: goto 64
      // 63: athrow
      // 64: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbab.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbab;
      // 67: goto 6b
      // 6a: aload 1
      // 6b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbab.ordinal ()I
      // 6e: tableswitch 30 0 3 41 46 55 66
      // 8c: new java/lang/MatchException
      // 8f: dup
      // 90: aconst_null
      // 91: aconst_null
      // 92: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 95: athrow
      // 96: athrow
      // 97: aload 6
      // 99: goto b8
      // 9c: dload 2
      // 9d: iload 4
      // 9f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.ba (DI)Ljava/awt/Color;
      // a2: goto b8
      // a5: aload 6
      // a7: dload 2
      // a8: iload 4
      // aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.abb (Ljava/awt/Color;DI)Ljava/awt/Color;
      // ad: goto b8
      // b0: aload 6
      // b2: dload 2
      // b3: iload 4
      // b5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.a (Ljava/awt/Color;DI)Ljava/awt/Color;
      // b8: areturn
   }

   private static int aaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(471702160, -880079193 ^ 492609834);
      if (b[var3] == null) {
         b[var3] = (int)(ab[var3] ^ var1);
      }

      return b[var3];
   }

   public static Color aab(Color var0, abbbab var1, double var2) {
      return bba(var0, var1, var2 + 0.19);
   }

   private static String aaab(int var0, int var1) {
      int var3 = var0 ^ -1654532607;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -99253795;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 19;
            case 1 -> 95;
            case 2 -> 37;
            case 3 -> 52;
            case 4 -> 108;
            case 5 -> 57;
            case 6 -> 74;
            case 7 -> 113;
            case 8 -> 67;
            case 9 -> 104;
            case 10 -> 148;
            case 11 -> 192;
            case 12 -> 26;
            case 13 -> 105;
            case 14 -> 94;
            case 15 -> 161;
            case 16 -> 162;
            case 17 -> 114;
            case 18 -> 56;
            case 19 -> 66;
            case 20 -> 202;
            case 21 -> 79;
            case 22 -> 142;
            case 23 -> 71;
            case 24 -> 106;
            case 25 -> 200;
            case 26 -> 225;
            case 27 -> 154;
            case 28 -> 137;
            case 29 -> 253;
            case 30 -> 121;
            case 31 -> 194;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int aba(int var0) {
      return Math.max(0, Math.min(aaa(b(471702149, -105752375 ^ 1889897065), 3050146453825288954L), var0));
   }

   private static Color abb(Color var0, double var1, int var3) {
      double var4 = bab(var1);
      Color var6 = baa(var0, 0.72);
      Color var7 = baa(var0, 1.28);
      return bbb(aaaa(var6, var7, var4), var3);
   }

   public static Color baa(Color var0, double var1) {
      int var3 = baaabbaa.bba;

      Color var10000;
      label22: {
         label21: {
            try {
               var10000 = var0;
               if (var3 != 0) {
                  break label22;
               }

               if (var0 == null) {
                  break label21;
               }
            } catch (MatchException var5) {
               throw var5;
            }

            var10000 = var0;
            break label22;
         }

         var10000 = Color.WHITE;
      }

      Color var4 = var10000;
      return new Color(
         aba((int)Math.round(var4.getRed() * var1)), aba((int)Math.round(var4.getGreen() * var1)), aba((int)Math.round(var4.getBlue() * var1)), var4.getAlpha()
      );
   }

   private abbaababa() {
   }

   public static double bab(double var0) {
      return 0.5 + 0.5 * Math.sin(System.currentTimeMillis() * 0.0042 + var0 * 5.0);
   }

   public static Color bba(Color param0, abbbab param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 2a
      // 0b: ifnonnull 29
      // 0e: goto 12
      // 11: athrow
      // 12: ldc_w 471702150
      // 15: ldc_w 412856842
      // 18: ldc_w -735393283
      // 1b: ixor
      // 1c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.b (II)I
      // 1f: ldc2_w 3050146453825288954
      // 22: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.aaa (IJ)I
      // 25: goto 2d
      // 28: athrow
      // 29: aload 0
      // 2a: invokevirtual java/awt/Color.getAlpha ()I
      // 2d: istore 5
      // 2f: aload 0
      // 30: aload 1
      // 31: dload 2
      // 32: iload 5
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaababa.bb (Ljava/awt/Color;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbab;DI)Ljava/awt/Color;
      // 37: areturn
   }

   public static Color bbb(Color var0, int var1) {
      int var2 = baaabbaa.bba;

      Color var10000;
      label22: {
         label21: {
            try {
               var10000 = var0;
               if (var2 != 0) {
                  break label22;
               }

               if (var0 == null) {
                  break label21;
               }
            } catch (MatchException var4) {
               throw var4;
            }

            var10000 = var0;
            break label22;
         }

         var10000 = Color.WHITE;
      }

      Color var3 = var10000;
      return new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), aba(var1));
   }

   public static Color aaaa(Color var0, Color var1, double var2) {
      int var4 = baaabbaa.bba;

      Color var10000;
      label41: {
         label40: {
            try {
               var10000 = var0;
               if (var4 != 0) {
                  break label41;
               }

               if (var0 == null) {
                  break label40;
               }
            } catch (MatchException var10) {
               throw var10;
            }

            var10000 = var0;
            break label41;
         }

         var10000 = Color.WHITE;
      }

      Color var5 = var10000;

      label31: {
         label30: {
            try {
               var10000 = var1;
               if (var4 != 0) {
                  break label31;
               }

               if (var1 == null) {
                  break label30;
               }
            } catch (MatchException var9) {
               throw var9;
            }

            var10000 = var1;
            break label31;
         }

         var10000 = Color.WHITE;
      }

      Color var6 = var10000;
      double var7 = Math.max(0.0, Math.min(1.0, var2));
      return new Color(
         aba((int)Math.round(var5.getRed() + (var6.getRed() - var5.getRed()) * var7)),
         aba((int)Math.round(var5.getGreen() + (var6.getGreen() - var5.getGreen()) * var7)),
         aba((int)Math.round(var5.getBlue() + (var6.getBlue() - var5.getBlue()) * var7)),
         aba((int)Math.round(var5.getAlpha() + (var6.getAlpha() - var5.getAlpha()) * var7))
      );
   }

   private static Color a(Color var0, double var1, int var3) {
      int var10 = 1791419724;
      double var4 = System.currentTimeMillis() * 0.0027 + var1 * 2.2;
      Color var6 = bbb(
         new Color(
            aaa(b(471702151, var10 ^ 1694480600), 491067792426597033L),
            aaa(b(471702200, var10 ^ 1968069232), 9204737582329374685L),
            aaa(b(471702201, var10 ^ 90311720), 3050146453825288954L)
         ),
         var3
      );
      Color var7 = bbb(
         new Color(
            aaa(b(471702202, var10 ^ 1497199004), 3825479458752595921L),
            aaa(b(471702203, var10 ^ -1535744888), 8248588849167834453L),
            aaa(b(471702204, var10 ^ -2051435230), 3050146453825288954L)
         ),
         var3
      );
      Color var8 = bbb(baa(var0, 1.18), var3);
      Color var9 = aaaa(var6, var7, 0.5 + 0.5 * Math.sin(var4));
      return bbb(aaaa(var8, var9, 0.42 + 0.28 * Math.cos(var4 * 0.7)), var3);
   }
}
