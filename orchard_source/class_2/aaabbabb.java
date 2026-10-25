package nsc;

public final class aaabbabb {
   private static final Long[] aa;
   private static final String[] bb;
   private static final long[] ab;
   private long ba;
   private static final Object[] aaa;
   private static final int[] a;
   private int b = -1;

   public void aa(int var1, long var2, long var4) {
      this.b = var1;
      this.ba = var2 + Math.max(0L, var4);
   }

   public boolean ab(int param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabb.b I
      // 08: iload 2
      // 09: ifne 19
      // 0c: iload 1
      // 0d: if_icmpne 1c
      // 10: goto 14
      // 13: athrow
      // 14: bipush 1
      // 15: goto 19
      // 18: athrow
      // 19: goto 1d
      // 1c: bipush 0
      // 1d: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -7179619] ^ var1 ^ var0;
      var2 += 56537;
      var2 -= 14354;
      var2 += 63816;
      var2 -= 9146;
      var2 ^= 32322;
      var2 -= 13397;
      var2 += 27095;
      var2 ^= 5814;
      var2 -= 23092;
      return var2 + 52337;
   }

   public boolean ba(int param1, long param2) {
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
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabb.b I
      // 09: iload 4
      // 0b: ifne 20
      // 0e: iload 1
      // 0f: if_icmpne 30
      // 12: goto 16
      // 15: athrow
      // 16: lload 2
      // 17: aload 0
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabb.ba J
      // 1b: lcmp
      // 1c: goto 20
      // 1f: athrow
      // 20: iload 4
      // 22: ifne 2d
      // 25: iflt 30
      // 28: goto 2c
      // 2b: athrow
      // 2c: bipush 1
      // 2d: goto 31
      // 30: bipush 0
      // 31: ireturn
   }

   private static String aab(byte var0, short var1, int var2, int var3, byte var4, short var5) {
      int var10 = var3 ^ -1976343793;
      char[] var9 = bb[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])aaa[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         aaa[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 55187;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 19) {
            default -> 220;
            case 1 -> 45;
            case 2 -> 114;
            case 3 -> 80;
            case 4 -> 7;
            case 5 -> 87;
            case 6 -> 8;
            case 7 -> 12;
            case 8 -> 253;
            case 9 -> 42;
            case 10 -> 31;
            case 11 -> 58;
            case 12 -> 201;
            case 13 -> 133;
            case 14 -> 246;
            case 15 -> 37;
            case 16 -> 181;
            case 17 -> 147;
            case 18 -> 238;
         } ^ var5 ^ var7 ^ var3 ^ var2 ^ var0 ^ var1 ^ var4);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   public static int bb(long var0) {
      return Math.max(0, (int)Math.ceil(Math.max(0L, var0) / 50.0));
   }

   static {
      int var24 = 3932246;
      String[] var10000 = new String[2];
      int var18 = 0;
      String[] var16 = var10000;
      int var17 = 0;
      short var19 = 20058;
      int var15 = "\u0010\uda1b붩\udbd3붳\ud8f3㶛\ud8b3붬\udb83붝\ud963綎\ud8bb㶮\uda4b\ufd91\nﵾ\u2fed\uffde\uefedￖ濩\uffde\uefffﱪ濴".length();
      String var14 = "\u0010\uda1b붩\udbd3붳\ud8f3㶛\ud8b3붬\udb83붝\ud963綎\ud8bb㶮\uda4b\ufd91\nﵾ\u2fed\uffde\uefedￖ濩\uffde\uefffﱪ濴";

      do {
         char var20 = var14.charAt(var18);
         int var10001 = var18 + 1;
         int var22 = 0;
         char[] var21 = var14.substring(var10001, var10001 + var20).toCharArray();

         do {
            char var23 = var21[var22];
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

      bb = var16;
      aaa = new Object[var16.length];
      int var10 = -1885949460;
      byte[] var8 = "Rm\u00ad2Í|¿ð\u0097ú¹*@¥\u0081\u0000'¨°!þ2ù\u0011\f\u0006\u0000m\u0080OVtËg\u008euÛ\u001aö\nÉ\u0003Øþ\u001a\u0090 ÁF*\u000e\u001b"
         .getBytes("ISO-8859-1");
      int var9 = var8.length / 4;
      a = new int[var9];
      byte var11 = 0;
      int var12 = 0;

      do {
         int var13 = (var8[var11] & 255) << 24 | (var8[var11 + 1] & 255) << 16 | (var8[var11 + 2] & 255) << 8 | var8[var11 + 3] & 255;
         var13 ^= var10;
         a[var12] = var13;
         var11 += 4;
      } while (++var12 < var9);

      long var0 = 1786882837898294003L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4;
      int var5 = (var4 = aab((byte)-39, (short)-8064, 536053306, -1976343793, (byte)68, (short)14635)).length();
      byte var2 = 0;

      do {
         int var26 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var26, var2).getBytes(aab(91, 18241, 236797352, -1976343794, (byte)-79, (short)27719));
         var26 = var3++;
         long var10004 = (
               (var7[0] & 255L) << a(-7179619, var24 ^ -576139487)
                  | (var7[1] & 255L) << a(-7179620, var24 ^ 1119477242)
                  | (var7[2] & 255L) << a(-7179617, var24 ^ 406838091)
                  | (var7[3] & 255L) << a(-7179618, var24 ^ -815733992)
                  | (var7[4] & 255L) << a(-7179623, var24 ^ -1469197738)
                  | (var7[5] & 255L) << a(-7179624, var24 ^ 1912052607)
                  | (var7[a(-7179621, var24 ^ -2084347354)] & 255L) << a(-7179622, var24 ^ 260715568)
                  | var7[a(-7179627, var24 ^ 1151527993)] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var26] = var10004;
      } while (var2 < var5);

      ab = var6;
      aa = new Long[2];
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-7179628, 1421648315 ^ 6064497)) & a(-7179625, 1421648315 ^ 306551653);
      if (aa[var3] == null) {
         aa[var3] = ab[var3] ^ var1;
      }

      return aa[var3];
   }

   public aaabbabb() {
      this.ba = aaa(a(-7179626, 522424325 ^ -1974911219), 437848590607815954L);
   }

   public void b() {
      this.b = -1;
      this.ba = aaa(a(-7179631, -168192870 ^ 1009439994), 4738997803828893134L);
   }
}
