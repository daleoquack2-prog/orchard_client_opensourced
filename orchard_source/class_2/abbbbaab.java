package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbbbaab(int bE, String bF, String bG, String bH) {
   private final int aa;
   private final String ab;
   private final String ba;
   private static final String[] aab;
   private static final long[] bb;
   private static final Integer[] a;
   private static final int[] aaa;
   private static final Object[] aba;
   private final String b;

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aaa(236722072, -802296620 ^ 1945289870);
      if (a[var3] == null) {
         a[var3] = (int)(bb[var3] ^ var1);
      }

      return a[var3];
   }

   static {
      int var24 = -582160809;
      int var18 = 0;
      int var10001 = "\u0010䘘ꑞ䗁摇䐿ꓔ䙘\ue45a䓍摶䕷ꓝ䒄\ue443䝅\ue45f\nጕ焚ጸ넙\u12b6\uf1afኹ\uf117ᆨ넟".length();
      short var19 = 19825;
      int var15 = var10001;
      String var14 = "\u0010䘘ꑞ䗁摇䐿ꓔ䙘\ue45a䓍摶䕷ꓝ䒄\ue443䝅\ue45f\nጕ焚ጸ넙\u12b6\uf1afኹ\uf117ᆨ넟";
      String[] var10000 = new String[2];
      int var17 = 0;
      String[] var16 = var10000;

      do {
         char var20 = var14.charAt(var18);
         int var22 = 0;
         char[] var21 = var14.substring(var18 + 1, var18 + 1 + var20).toCharArray();

         do {
            int var23 = var21[var22];

            var23 = (char)(switch (var22 % 6) {
               default -> 26;
               case 1 -> 37;
               case 2 -> 63;
               case 3 -> 58;
               case 4 -> 109;
               case 5 -> 145;
            }) ^ var23;
            if (var22 % 2 == 0) {
               var21[var22] = (char)((var23 >>> 2 | var23 << 14) & 65535 ^ var19);
            } else {
               var21[var22] = (char)((var23 << 2 | var23 >>> 14) & 65535 ^ var19);
            }
         } while (++var22 < var21.length);

         var16[var17] = new String(var21);
         var17++;
         var18 = var18 + var20 + 1;
      } while (var18 < var15);

      aab = var16;
      aba = new Object[var16.length];
      int var10 = -1123555147;
      byte[] var8 = "M¦H\u009dªCE3\u0096\u0000\u009d´\fÔZó\u009dR~Î\u0091\u0089Àm÷\u0097x\u0005\u0005)e¾ëw+ë\u0010Å5\u0087GÎûVsÓ\u0015\u00ad"
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

      long var0 = 4684420747099949335L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4;
      int var5 = (var4 = aab(731999780, var24 ^ -494999492)).length();
      byte var2 = 0;

      do {
         int var28 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var28, var2).getBytes(aab(731999781, var24 ^ -1212088627));
         var28 = var3++;
         long var10004 = (
               (var7[0] & 255L) << aaa(236722065, var24 ^ 603158930)
                  | (var7[1] & 255L) << aaa(236722064, var24 ^ -1005161291)
                  | (var7[2] & 255L) << aaa(236722067, var24 ^ -128603095)
                  | (var7[3] & 255L) << aaa(236722066, var24 ^ 1652648807)
                  | (var7[4] & 255L) << aaa(236722069, var24 ^ -217624795)
                  | (var7[5] & 255L) << aaa(236722068, var24 ^ -2297457)
                  | (var7[aaa(236722071, var24 ^ -1715320566)] & 255L) << aaa(236722070, var24 ^ 1803310150)
                  | var7[aaa(236722073, var24 ^ -2061362453)] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var28] = var10004;
      } while (var2 < var5);

      bb = var6;
      a = new Integer[2];
   }

   public String aa() {
      return this.b;
   }

   private static String aab(int var0, int var1) {
      int var3 = var0 ^ 731999780;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 766523648;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 155;
            case 1 -> 191;
            case 2 -> 159;
            case 3 -> 178;
            case 4 -> 159;
            case 5 -> 210;
            case 6 -> 140;
            case 7 -> 227;
            case 8 -> 89;
            case 9 -> 182;
            case 10 -> 83;
            case 11 -> 73;
            case 12 -> 142;
            case 13 -> 240;
            case 14 -> 12;
            case 15 -> 181;
            case 16 -> 238;
            case 17 -> 100;
            case 18 -> 196;
            case 19 -> 114;
            case 20 -> 65;
            case 21 -> 134;
            case 22 -> 9;
            case 23 -> 35;
            case 24 -> 87;
            case 25 -> 20;
            case 26 -> 17;
            case 27 -> 121;
            case 28 -> 189;
            case 29 -> 96;
            case 30 -> 67;
            case 31 -> 248;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private abbbbaab(int bE, String bF, String bG, String bH) {
      this.aa = bE;
      this.b = bF;
      this.ab = bG;
      this.ba = bH;
   }

   boolean ab() {
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
      // 06: ifne 28
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.aa I
      // 0c: ldc 236722075
      // 0e: ldc -1671828511
      // 10: ldc 1754079418
      // 12: ixor
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.aaa (II)I
      // 16: ldc2_w 2515383566038774866
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.b (IJ)I
      // 1c: if_icmplt 4e
      // 1f: goto 23
      // 22: athrow
      // 23: aload 0
      // 24: goto 28
      // 27: athrow
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.aa I
      // 2b: iload 1
      // 2c: ifne 4b
      // 2f: ldc 236722074
      // 31: ldc -1671828511
      // 33: ldc 1553139979
      // 35: ixor
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.aaa (II)I
      // 39: ldc2_w 3580795107117857672
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaab.b (IJ)I
      // 3f: if_icmpge 4e
      // 42: goto 46
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4b
      // 4a: athrow
      // 4b: goto 4f
      // 4e: bipush 0
      // 4f: ireturn
   }

   public String a() {
      return this.ba;
   }

   private static int aaa(int var0, int var1) {
      int var2 = aaa[var0 ^ 236722065] ^ var1 ^ var0;
      var2 -= 10998;
      var2 ^= 52029;
      var2 ^= 30941;
      var2 ^= 19495;
      var2 -= 30562;
      return var2 ^ 37607;
   }

   public int ba() {
      return this.aa;
   }

   public String bb() {
      return this.ab;
   }
}
