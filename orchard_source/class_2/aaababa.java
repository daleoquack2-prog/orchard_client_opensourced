package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class aaababa {
   private static final int[] b;
   private static final long[] aa;
   private static final Object[] ba;
   private static final Integer[] a;
   private static final String[] ab;

   static {
      int var18 = -1276923747;
      int var10001 = "8禄\uf118뀥셣籄ᅭ댅\ue919砤\uf11a糄넘範⤛旤礙낅落禤焛硤ℛ녅ŭ涄\ue11e됥턙撄\ue11e듥ꤛ냅煭輅ᤙ돥㥭냥ᥬ湄녬녥ㄘ檄愙磤ꥬ曄煭닥℞恤㤟穄儘\n륙왮몙\uf66f쿹ﹳ\uf0d9홳뿙陼\u0010㪧\ue9c8㺇꧈㺧\u09c9\u2067맋⸧\ue1dc⸧⇋⋇秎㽧ǋ\n聶䶣龶ﶢ诖\uf5a2賶鶢诶嶢"
         .length();
      String[] var10002 = new String[4];
      int var11 = 0;
      int var12 = 0;
      short var13 = 20938;
      String[] var10 = var10002;
      int var9 = var10001;
      String var8 = "8禄\uf118뀥셣籄ᅭ댅\ue919砤\uf11a糄넘範⤛旤礙낅落禤焛硤ℛ녅ŭ涄\ue11e됥턙撄\ue11e듥ꤛ냅煭輅ᤙ돥㥭냥ᥬ湄녬녥ㄘ檄愙磤ꥬ曄煭닥℞恤㤟穄儘\n륙왮몙\uf66f쿹ﹳ\uf0d9홳뿙陼\u0010㪧\ue9c8㺇꧈㺧\u09c9\u2067맋⸧\ue1dc⸧⇋⋇秎㽧ǋ\n聶䶣龶ﶢ诖\uf5a2賶鶢诶嶢";

      do {
         char var14 = var8.charAt(var12);
         var10001 = var12 + 1;
         int var32 = var12 + 1 + var14;
         int var16 = 0;
         char[] var15 = var8.substring(var10001, var32).toCharArray();

         do {
            char var17 = var15[var16];
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
      byte var10000 = 0;
      int var24 = 0;
      b = new int[35];
      byte[] var33 = "\u0098\u00ad-@vøêi\u001c\u008aýÉ@åß±\u008eÎh;!¯\u0001\u009d%´w\u0082&v\u007f´o-\u001aÿ\u00adc\u0081\u0015¿Û½®7÷ä§u\u0002\bT¬z|c\u0005ÔAK?á5Ë\u0084)\u00ad\u001a¤ü\bÿ\u0097Ü\u0087\u00adVô&\u000fc\u0087\"Të(<n\u0018»J\u00952Á\u008c\"Íf0Ê(\u0099\u0098~á\u0099Ñ]\u0004>\u0014\u0098OÛz9¼B\u0014\u001c\u0099\u0019Î\u001c/´\u0006ëÇ{äh\n}>´ïe ×"
         .getBytes("ISO-8859-1");

      int var50;
      do {
         b[var10000] = ((var33[var24] & 255) << 24 | (var33[var24 + 1] & 255) << 16 | (var33[var24 + 2] & 255) << 8 | var33[var24 + 3] & 255) ^ 984797050;
         var10000 += 1;
         var50 = var24 + 4;
         var24 += 4;
      } while (var50 < var33.length);

      long var0 = 4439922788426576839L;
      long[] var6 = new long[b(1180068718, var18 ^ -1880979702)];
      int var3 = 0;
      String var4;
      int var5 = (var4 = abbb('턱', '\uf01e', var18 ^ -1651336093)).length();
      byte var2 = 0;

      label58:
      while (true) {
         var24 = var2;
         var2 += 8;
         String var20 = var4.substring(var24, var2);
         char var28 = '터';
         char var39 = 'ꄫ';
         var50 = var18 ^ 519614148;
         byte[] var7 = var20.getBytes("ISO-8859-1");
         long[] var21 = var6;
         var24 = var3++;
         long var40 = (var7[0] & 255L) << b(1180068713, var18 ^ 1103704142)
            | (var7[1] & 255L) << b(1180068712, var18 ^ -290956863)
            | (var7[2] & 255L) << b(1180068715, var18 ^ -357356027)
            | (var7[3] & 255L) << b(1180068714, var18 ^ -378460198)
            | (var7[4] & 255L) << b(1180068709, var18 ^ -1607843226)
            | (var7[5] & 255L) << b(1180068708, var18 ^ 1650776549)
            | (var7[b(1180068711, var18 ^ 1893524739)] & 255L) << b(1180068710, var18 ^ -118440947)
            | var7[b(1180068705, var18 ^ -1174056706)] & 255L;
         int var52 = -1;

         while (true) {
            long var62 = var40 ^ var0;
            switch (var52) {
               case 0:
                  var21[var24] = var62;
                  if (var2 >= var5) {
                     aa = var6;
                     a = new Integer[b(1180068731, var18 ^ -675540421)];
                     return;
                  }
                  break;
               default:
                  var21[var24] = var62;
                  if (var2 < var5) {
                     continue label58;
                  }

                  var5 = (var4 = abbb('턳', '⺱', var18 ^ -1656893229)).length();
                  var2 = 0;
            }

            byte var30 = var2;
            var2 += 8;
            String var22 = var4.substring(var30, var2);
            var28 = '턲';
            short var42 = 25638;
            var52 = var18 ^ -1610578124;
            var7 = var22.getBytes("ISO-8859-1");
            var21 = var6;
            var24 = var3++;
            var40 = (var7[0] & 255L) << b(1180068704, var18 ^ 1669145631)
               | (var7[1] & 255L) << b(1180068707, var18 ^ -892135140)
               | (var7[2] & 255L) << b(1180068706, var18 ^ -253334459)
               | (var7[3] & 255L) << b(1180068733, var18 ^ 1261368675)
               | (var7[4] & 255L) << b(1180068732, var18 ^ 1811632255)
               | (var7[5] & 255L) << b(1180068735, var18 ^ 1490804550)
               | (var7[b(1180068734, var18 ^ -1712095557)] & 255L) << b(1180068729, var18 ^ -1400866079)
               | var7[b(1180068728, var18 ^ 607085789)] & 255L;
            var52 = 0;
         }
      }
   }

   public static int aa(int var0, int var1) {
      return aaab(var1, 0, abb(b(1180068717, 590247438 ^ -949560555), 6391680653532991671L)) << abb(b(1180068716, 590247438 ^ 691177156), 8455484092775114139L)
         | var0 & abb(b(1180068719, 590247438 ^ 1128324630), 8001234559334294254L);
   }

   public static double ab(double var0, double var2, double var4, double var6) {
      double var8 = bab(var6 * var4, 0.0, 1.0);
      return (1.0 - var8) * var0 + var8 * var2;
   }

   public static boolean ba(double param0, double param2, double param4, double param6, double param8, double param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 4
      // 02: dload 4
      // 04: dload 8
      // 06: dadd
      // 07: invokestatic java/lang/Math.min (DD)D
      // 0a: dstore 13
      // 0c: dload 4
      // 0e: dload 4
      // 10: dload 8
      // 12: dadd
      // 13: invokestatic java/lang/Math.max (DD)D
      // 16: dstore 15
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 1b: dload 6
      // 1d: dload 6
      // 1f: dload 10
      // 21: dadd
      // 22: invokestatic java/lang/Math.min (DD)D
      // 25: dstore 17
      // 27: istore 12
      // 29: dload 6
      // 2b: dload 6
      // 2d: dload 10
      // 2f: dadd
      // 30: invokestatic java/lang/Math.max (DD)D
      // 33: dstore 19
      // 35: dload 0
      // 36: iload 12
      // 38: ifne 4a
      // 3b: dload 13
      // 3d: dcmpl
      // 3e: ifle 85
      // 41: goto 45
      // 44: athrow
      // 45: dload 0
      // 46: goto 4a
      // 49: athrow
      // 4a: dload 15
      // 4c: iload 12
      // 4e: ifne 60
      // 51: dcmpg
      // 52: ifge 85
      // 55: goto 59
      // 58: athrow
      // 59: dload 2
      // 5a: dload 17
      // 5c: goto 60
      // 5f: athrow
      // 60: iload 12
      // 62: ifne 74
      // 65: dcmpl
      // 66: ifle 85
      // 69: goto 6d
      // 6c: athrow
      // 6d: dload 2
      // 6e: dload 19
      // 70: goto 74
      // 73: athrow
      // 74: dcmpg
      // 75: iload 12
      // 77: ifne 82
      // 7a: ifge 85
      // 7d: goto 81
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
   }

   private static double bb(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifne 1a
      // 0b: invokestatic java/lang/Double.isFinite (D)Z
      // 0e: ifeq 30
      // 11: goto 15
      // 14: athrow
      // 15: dload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: iload 4
      // 1c: ifne 2d
      // 1f: dconst_0
      // 20: dcmpl
      // 21: ifle 30
      // 24: goto 28
      // 27: athrow
      // 28: dload 0
      // 29: goto 2d
      // 2c: athrow
      // 2d: goto 31
      // 30: dload 2
      // 31: dreturn
   }

   public static float aaa(float param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: fload 2
      // 04: f2d
      // 05: dconst_0
      // 06: dconst_1
      // 07: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababa.bab (DDD)D
      // 0a: d2f
      // 0b: fstore 4
      // 0d: istore 3
      // 0e: fload 0
      // 0f: fload 1
      // 10: invokestatic java/lang/Math.max (FF)F
      // 13: fload 0
      // 14: fload 1
      // 15: invokestatic java/lang/Math.min (FF)F
      // 18: fsub
      // 19: fstore 5
      // 1b: fload 5
      // 1d: fload 4
      // 1f: fmul
      // 20: fstore 6
      // 22: fload 1
      // 23: fload 0
      // 24: iload 3
      // 25: ifne 39
      // 28: fload 1
      // 29: fcmpl
      // 2a: ifle 37
      // 2d: goto 31
      // 30: athrow
      // 31: fload 6
      // 33: goto 3a
      // 36: athrow
      // 37: fload 6
      // 39: fneg
      // 3a: fadd
      // 3b: freturn
   }

   public static double aab(double var0, double var2, double var4, double var6) {
      double var8 = bb(var0, 0.0);
      double var10 = baa(var4, 1.0);
      double var12 = baa(var6, 0.0);
      double var14 = Math.max(0.0, var10 - var12);
      double var16 = bb(var2, var14);
      return var8 * Math.max(var16, var14);
   }

   public static int aba(int var0, double var1) {
      int var3 = var0 >>> abb(b(1180068730, -781716413 ^ -1623039276), 8455484092775114139L)
         & abb(b(1180068725, -781716413 ^ 1625663660), 5185091156418735285L);
      return aa(var0, (int)(var3 * bab(var1, 0.0, 1.0)));
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(1180068724, -1612060870 ^ -879490922);
      if (a[var3] == null) {
         a[var3] = (int)(aa[var3] ^ var1);
      }

      return a[var3];
   }

   private static double baa(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: dload 0
      // 06: iload 4
      // 08: ifne 1a
      // 0b: invokestatic java/lang/Double.isFinite (D)Z
      // 0e: ifeq 1d
      // 11: goto 15
      // 14: athrow
      // 15: dload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: goto 1e
      // 1d: dload 2
      // 1e: dreturn
   }

   public static double bab(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static double bba(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 1180068717] ^ var1 ^ var0;
      var2 -= 14867;
      var2 ^= 41307;
      var2 -= 57481;
      var2 ^= 36852;
      var2 += 36260;
      var2 ^= 5852;
      return var2 + 986;
   }

   private static String abbb(char var0, char var1, int var2) {
      int var3 = var0 ^ '턱';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 19491;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 5452;
         var10 += 32653;
         var10 += 17505;
         var10 -= 50405;
         var10 += 51134;
         var10 ^= 267;
         var10 ^= 47041;
         var10 -= 40295;
         var10 -= 54028;
         var10 += 14912;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static int bbb(int var0, int var1, double var2) {
      int var10 = 2089119752;
      double var4 = bab(var2, 0.0, 1.0);
      int var6 = aabb(var0, var1, abb(b(1180068727, var10 ^ -503763636), 3758383437552848060L), var4);
      int var7 = aabb(var0, var1, abb(b(1180068726, var10 ^ 73345239), 5369185754170510522L), var4);
      int var8 = aabb(var0, var1, abb(b(1180068721, var10 ^ 1337616908), 3432565889840299882L), var4);
      int var9 = aabb(var0, var1, 0, var4);
      return var6 << abb(b(1180068720, var10 ^ -1138524501), 8455484092775114139L)
         | var7 << abb(b(1180068723, var10 ^ -1720131278), 3619949539391445075L)
         | var8 << abb(b(1180068722, var10 ^ 802491582), 6690346322497553656L)
         | var9;
   }

   public static bbabbbab aaaa(bbabbbab param0, Iterable param1, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 6
      // 005: aload 0
      // 006: iload 6
      // 008: ifne 033
      // 00b: ifnull 02e
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: ifnull 02e
      // 016: goto 01a
      // 019: athrow
      // 01a: dload 4
      // 01c: iload 6
      // 01e: ifne 038
      // 021: goto 025
      // 024: athrow
      // 025: dconst_0
      // 026: dcmpg
      // 027: ifgt 034
      // 02a: goto 02e
      // 02d: athrow
      // 02e: aload 0
      // 02f: goto 033
      // 032: athrow
      // 033: areturn
      // 034: aload 0
      // 035: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.b ()D
      // 038: dstore 7
      // 03a: aload 0
      // 03b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.a ()D
      // 03e: dstore 9
      // 040: dload 7
      // 042: aload 0
      // 043: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.ab ()D
      // 046: ldc2_w 0.5
      // 049: dmul
      // 04a: dadd
      // 04b: dload 2
      // 04c: ldc2_w 0.5
      // 04f: dmul
      // 050: dcmpl
      // 051: iload 6
      // 053: ifne 05e
      // 056: iflt 061
      // 059: goto 05d
      // 05c: athrow
      // 05d: bipush 1
      // 05e: goto 062
      // 061: bipush 0
      // 062: istore 11
      // 064: aload 1
      // 065: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 06a: astore 12
      // 06c: aload 12
      // 06e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 073: ifeq 14c
      // 076: aload 12
      // 078: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 07d: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab
      // 080: iload 6
      // 082: ifne 15f
      // 085: astore 13
      // 087: aload 13
      // 089: iload 6
      // 08b: ifne 097
      // 08e: ifnull 06c
      // 091: goto 095
      // 094: athrow
      // 095: aload 13
      // 097: aload 0
      // 098: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.equals (Ljava/lang/Object;)Z
      // 09b: iload 6
      // 09d: ifne 0b2
      // 0a0: ifeq 0b0
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: iload 6
      // 0a9: ifeq 06c
      // 0ac: goto 0b0
      // 0af: athrow
      // 0b0: iload 11
      // 0b2: iload 6
      // 0b4: ifne 118
      // 0b7: ifeq 0fd
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: aload 13
      // 0c0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.b ()D
      // 0c3: aload 13
      // 0c5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.ab ()D
      // 0c8: dadd
      // 0c9: dstore 14
      // 0cb: dload 7
      // 0cd: aload 0
      // 0ce: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.ab ()D
      // 0d1: dadd
      // 0d2: dstore 16
      // 0d4: dload 14
      // 0d6: dload 16
      // 0d8: iload 6
      // 0da: ifne 0f5
      // 0dd: dsub
      // 0de: invokestatic java/lang/Math.abs (D)D
      // 0e1: dload 4
      // 0e3: dcmpg
      // 0e4: ifge 0f8
      // 0e7: goto 0eb
      // 0ea: athrow
      // 0eb: dload 14
      // 0ed: aload 0
      // 0ee: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.ab ()D
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: dsub
      // 0f6: dstore 7
      // 0f8: iload 6
      // 0fa: ifeq 122
      // 0fd: aload 13
      // 0ff: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.b ()D
      // 102: iload 6
      // 104: ifne 136
      // 107: goto 10b
      // 10a: athrow
      // 10b: dload 7
      // 10d: dsub
      // 10e: invokestatic java/lang/Math.abs (D)D
      // 111: dload 4
      // 113: dcmpg
      // 114: goto 118
      // 117: athrow
      // 118: ifge 122
      // 11b: aload 13
      // 11d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.b ()D
      // 120: dstore 7
      // 122: aload 13
      // 124: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.a ()D
      // 127: dload 9
      // 129: dsub
      // 12a: iload 6
      // 12c: ifne 145
      // 12f: invokestatic java/lang/Math.abs (D)D
      // 132: goto 136
      // 135: athrow
      // 136: dload 4
      // 138: dcmpg
      // 139: ifge 147
      // 13c: aload 13
      // 13e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.a ()D
      // 141: goto 145
      // 144: athrow
      // 145: dstore 9
      // 147: iload 6
      // 149: ifeq 06c
      // 14c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab
      // 14f: dup
      // 150: dload 7
      // 152: dload 9
      // 154: aload 0
      // 155: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.ab ()D
      // 158: aload 0
      // 159: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.aa ()D
      // 15c: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbab.<init> (DDDD)V
      // 15f: areturn
   }

   public static int aaab(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static double aaba(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * bab(var4, 0.0, 1.0);
   }

   private static int aabb(int var0, int var1, int var2, double var3) {
      int var5 = var0 >>> var2 & abb(b(1180068685, -634934899 ^ 1639457272), 5185091156418735285L);
      int var6 = var1 >>> var2 & abb(b(1180068684, -634934899 ^ -1396770011), 5185091156418735285L);
      return aaab((int)bba(var5, var6, var3), 0, abb(b(1180068687, -634934899 ^ 1235674437), 5185091156418735285L));
   }

   public static bbabbbab a(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = Math.max(0.0, var4);
      double var14 = Math.max(0.0, var6);
      double var16 = Math.max(0.0, var8 - var12);
      double var18 = Math.max(0.0, var10 - var14);
      return new bbabbbab(bab(var0, 0.0, var16), bab(var2, 0.0, var18), var12, var14);
   }

   public static aaaaabb abaa(double param0, double param2, double param4, double param6, double param8, double param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 12
      // 005: dload 0
      // 006: iload 12
      // 008: ifne 01a
      // 00b: invokestatic java/lang/Double.isFinite (D)Z
      // 00e: ifeq 079
      // 011: goto 015
      // 014: athrow
      // 015: dload 2
      // 016: goto 01a
      // 019: athrow
      // 01a: iload 12
      // 01c: ifne 02f
      // 01f: invokestatic java/lang/Double.isFinite (D)Z
      // 022: ifeq 079
      // 025: goto 029
      // 028: athrow
      // 029: dload 4
      // 02b: goto 02f
      // 02e: athrow
      // 02f: iload 12
      // 031: ifne 049
      // 034: invokestatic java/lang/Double.isFinite (D)Z
      // 037: ifeq 079
      // 03a: goto 03e
      // 03d: athrow
      // 03e: dload 6
      // 040: iload 12
      // 042: ifne 055
      // 045: goto 049
      // 048: athrow
      // 049: invokestatic java/lang/Double.isFinite (D)Z
      // 04c: ifeq 079
      // 04f: dload 8
      // 051: goto 055
      // 054: athrow
      // 055: iload 12
      // 057: ifne 06a
      // 05a: invokestatic java/lang/Double.isFinite (D)Z
      // 05d: ifeq 079
      // 060: goto 064
      // 063: athrow
      // 064: dload 10
      // 066: goto 06a
      // 069: athrow
      // 06a: iload 12
      // 06c: ifne 080
      // 06f: invokestatic java/lang/Double.isFinite (D)Z
      // 072: ifne 07e
      // 075: goto 079
      // 078: athrow
      // 079: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabb;
      // 07c: areturn
      // 07d: athrow
      // 07e: dload 4
      // 080: iload 12
      // 082: ifne 096
      // 085: dconst_0
      // 086: dcmpg
      // 087: ifge 099
      // 08a: goto 08e
      // 08d: athrow
      // 08e: dload 0
      // 08f: dload 4
      // 091: dadd
      // 092: goto 096
      // 095: athrow
      // 096: goto 09a
      // 099: dload 0
      // 09a: dstore 13
      // 09c: dload 6
      // 09e: iload 12
      // 0a0: ifne 0b4
      // 0a3: dconst_0
      // 0a4: dcmpg
      // 0a5: ifge 0b7
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: dload 2
      // 0ad: dload 6
      // 0af: dadd
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: goto 0b8
      // 0b7: dload 2
      // 0b8: dstore 15
      // 0ba: dload 4
      // 0bc: invokestatic java/lang/Math.abs (D)D
      // 0bf: dstore 17
      // 0c1: dload 6
      // 0c3: invokestatic java/lang/Math.abs (D)D
      // 0c6: dstore 19
      // 0c8: dload 17
      // 0ca: iload 12
      // 0cc: ifne 0de
      // 0cf: dconst_0
      // 0d0: dcmpg
      // 0d1: ifle 0ec
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: dload 19
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: iload 12
      // 0e0: ifne 0fc
      // 0e3: dconst_0
      // 0e4: dcmpg
      // 0e5: ifgt 0f1
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabb;
      // 0ef: areturn
      // 0f0: athrow
      // 0f1: dload 17
      // 0f3: dload 19
      // 0f5: invokestatic java/lang/Math.min (DD)D
      // 0f8: ldc2_w 0.5
      // 0fb: dmul
      // 0fc: dstore 21
      // 0fe: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabb
      // 101: dup
      // 102: dload 13
      // 104: dload 15
      // 106: dload 17
      // 108: dload 19
      // 10a: dload 8
      // 10c: dconst_0
      // 10d: dload 21
      // 10f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababa.bab (DDD)D
      // 112: dload 10
      // 114: dconst_0
      // 115: dload 21
      // 117: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababa.bab (DDD)D
      // 11a: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabb.<init> (DDDDDD)V
      // 11d: areturn
   }

   public static double abab(double var0, double var2, double var4, double var6) {
      double var8 = bb(var0, 0.0);
      double var10 = baa(var4, 1.0);
      double var12 = baa(var6, 0.0);
      double var14 = Math.max(0.0, var10 - var12);
      double var16 = Math.max(bb(var2, var14), var14);
      return var8 * (var10 + (var16 - var14) * 0.5);
   }

   public static double abba(double var0, double var2, double var4) {
      return bba(var0, var2, bab(var4, 0.0, 1.0));
   }

   private aaababa() {
   }
}
