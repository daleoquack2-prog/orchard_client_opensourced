package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class baababba {
   private static final String[] aab;
   private static final Object[] aba;
   private long aa;
   private static final int[] aaa;
   private static final long[] ab;
   private static final double ba = 1.0E9;
   private static final long b;
   static final double bb = 20.0;
   private static final Long[] a;

   private static String aaa(int var0, char var1, char var2, int var3) {
      int var8 = var0 ^ 929409556;
      char[] var7 = aab[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aba[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         aba[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 56977;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ var6 ^ 13757 ^ var2 ^ var0 ^ var5 ^ var3 ^ var1);
      }

      return new String(var7).intern();
   }

   static {
      int var24 = -1804352012;
      String[] var16 = new String[2];
      int var17 = 0;
      int var18 = 0;
      int var10001 = "\u0010滶햯皍唩竂ᔝ穃씅映跪澖疬昍ᴭ捂\ue51a\n\uefeb⋌\uef70쉌\ue1bf婺\ue01e䉡\ue25d犎".length();
      short var19 = 15715;
      int var15 = var10001;
      String var14 = "\u0010滶햯皍唩竂ᔝ穃씅映跪澖疬昍ᴭ捂\ue51a\n\uefeb⋌\uef70쉌\ue1bf婺\ue01e䉡\ue25d犎";

      do {
         char var20 = var14.charAt(var18);
         var10001 = var18 + 1;
         int var22 = 0;
         char[] var21 = var14.substring(var10001, var10001 + var20).toCharArray();

         do {
            int var23 = var21[var22];

            var23 = (char)(switch (var22 % 5) {
               default -> 2;
               case 1 -> 183;
               case 2 -> 25;
               case 3 -> 52;
               case 4 -> 246;
            }) ^ var23;
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

      aab = var16;
      aba = new Object[var16.length];
      int var10 = 1413144347;
      byte[] var8 = "¬ÞxIÀ\u0013#\u007f;9\u0001$Ï]%39&\u0015y^6\u001e\u001aO\u0014ðí\u0089H\u00915Þ\u001b15D\u0010[\u0002Ñ\u009aIÚÓû1×=b ,"
         .getBytes("ISO-8859-1");
      int var9 = var8.length / 4;
      aaa = new int[var9];
      byte var11 = 0;
      int var12 = 0;

      do {
         int var13 = (var8[var11] & 255) << 24 | (var8[var11 + 1] & 255) << 16 | (var8[var11 + 2] & 255) << 8 | var8[var11 + 3] & 255;
         var13 ^= var10;
         aaa[var12] = var13;
         var11 += 4;
      } while (++var12 < var9);

      long var0 = 1243160026189519879L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4;
      int var5 = (var4 = aaa(929409556, '䀒', '窼', 934011290)).length();
      byte var2 = 0;

      do {
         int var28 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var28, var2).getBytes(aaa(929409557, (char)'諆', '\uf198', 1083788315));
         var28 = var3++;
         long var10004 = (
               (var7[0] & 255L) << b(-661750948, var24 ^ -1273446192)
                  | (var7[1] & 255L) << b(-661750947, var24 ^ -657089633)
                  | (var7[2] & 255L) << b(-661750946, var24 ^ 603961775)
                  | (var7[3] & 255L) << b(-661750945, var24 ^ -677667423)
                  | (var7[4] & 255L) << b(-661750952, var24 ^ 568372612)
                  | (var7[5] & 255L) << b(-661750951, var24 ^ 1190176606)
                  | (var7[b(-661750950, var24 ^ 1473398784)] & 255L) << b(-661750949, var24 ^ -1852954149)
                  | var7[b(-661750956, var24 ^ -958559783)] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var28] = var10004;
      } while (var2 < var5);

      ab = var6;
      a = new Long[2];
      b = ab(b(-661750955, var24 ^ 1557567624), 2314119697122654558L);
   }

   boolean aa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic java/lang/System.nanoTime ()J
      // 07: lstore 2
      // 08: aload 0
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababba.aa J
      // 0c: lconst_0
      // 0d: lcmp
      // 0e: iload 1
      // 0f: ifne 2f
      // 12: ifle 2e
      // 15: goto 19
      // 18: athrow
      // 19: lload 2
      // 1a: aload 0
      // 1b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababba.aa J
      // 1e: lcmp
      // 1f: iload 1
      // 20: ifne 2f
      // 23: goto 27
      // 26: athrow
      // 27: iflt 32
      // 2a: goto 2e
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -661750948] ^ var1 ^ var0;
      var2 -= 59687;
      var2 -= 58285;
      var2 += 60088;
      var2 ^= 27530;
      var2 ^= 37469;
      var2 += 35133;
      return var2 ^ 38958;
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-661750954, 1487591207 ^ 92639650)) & b(-661750953, 1487591207 ^ 132434915);
      if (a[var3] == null) {
         a[var3] = ab[var3] ^ var1;
      }

      return a[var3];
   }

   private long ba(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 0.1
      // 03: ldc2_w 20.0
      // 06: dload 1
      // 07: invokestatic java/lang/Math.min (DD)D
      // 0a: invokestatic java/lang/Math.max (DD)D
      // 0d: dstore 6
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 12: dload 6
      // 14: ldc2_w 20.0
      // 17: dload 3
      // 18: invokestatic java/lang/Math.min (DD)D
      // 1b: invokestatic java/lang/Math.max (DD)D
      // 1e: dstore 8
      // 20: istore 5
      // 22: dload 6
      // 24: iload 5
      // 26: ifne 39
      // 29: dload 8
      // 2b: dcmpl
      // 2c: ifne 3c
      // 2f: goto 33
      // 32: athrow
      // 33: dload 6
      // 35: goto 39
      // 38: athrow
      // 39: goto 46
      // 3c: invokestatic java/util/concurrent/ThreadLocalRandom.current ()Ljava/util/concurrent/ThreadLocalRandom;
      // 3f: dload 6
      // 41: dload 8
      // 43: invokevirtual java/util/concurrent/ThreadLocalRandom.nextDouble (DD)D
      // 46: dstore 10
      // 48: lconst_1
      // 49: ldc2_w 1.0E9
      // 4c: dload 10
      // 4e: ddiv
      // 4f: invokestatic java/lang/Math.round (D)J
      // 52: invokestatic java/lang/Math.max (JJ)J
      // 55: lreturn
   }

   void bb(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: invokestatic java/lang/System.nanoTime ()J
      // 08: lstore 6
      // 0a: aload 0
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababba.aa J
      // 0e: lconst_0
      // 0f: iload 5
      // 11: ifne 40
      // 14: lcmp
      // 15: ifle 4f
      // 18: goto 1c
      // 1b: athrow
      // 1c: lload 6
      // 1e: iload 5
      // 20: ifne 4c
      // 23: goto 27
      // 26: athrow
      // 27: aload 0
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababba.aa J
      // 2b: lsub
      // 2c: ldc -661750960
      // 2e: ldc 430640208
      // 30: ldc 1468165012
      // 32: ixor
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababba.b (II)I
      // 36: ldc2_w 8043049974410460114
      // 39: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababba.ab (IJ)J
      // 3c: goto 40
      // 3f: athrow
      // 40: lcmp
      // 41: ifgt 4f
      // 44: aload 0
      // 45: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababba.aa J
      // 48: goto 4c
      // 4b: athrow
      // 4c: goto 51
      // 4f: lload 6
      // 51: lstore 8
      // 53: aload 0
      // 54: lload 8
      // 56: aload 0
      // 57: dload 1
      // 58: dload 3
      // 59: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababba.ba (DD)J
      // 5c: ladd
      // 5d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababba.aa J
      // 60: return
   }

   void a() {
      this.aa = 0L;
   }
}
