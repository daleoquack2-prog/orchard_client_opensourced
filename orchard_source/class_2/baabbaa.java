package nsc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_8956;
import nsc.mixin.abababbaa;

@Environment(EnvType.CLIENT)
public final class baabbaa extends abbaabbaa {
   private static final double aa = 0.65;
   private static final Long[] ab;
   private final bababa ba;
   private static final String[] abaa;
   private static final long[] bb;
   private static final String[] aaa;
   private static final int aab;
   private static final long[] aba;
   private static final Object[] abab;
   private static final int[] aabb;
   private static final int abb;
   private int baa;
   private static final Integer[] bab;
   private static String[] bba;
   private final Map bbb;
   private static final double aaaa = 1.35;
   private static final String[] aaab;
   private Object aaba;

   private void aa() {
      this.bbb.clear();
      this.baa = 0;
      this.aaba = null;
   }

   private void ab(class_310 param1) {
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
      // 06: ifne 2b
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.aaba Ljava/lang/Object;
      // 0c: aload 1
      // 0d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 10: if_acmpne 19
      // 13: goto 17
      // 16: athrow
      // 17: return
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.aaba Ljava/lang/Object;
      // 21: aload 0
      // 22: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.bbb Ljava/util/Map;
      // 25: invokeinterface java/util/Map.clear ()V 1
      // 2a: aload 0
      // 2b: bipush 0
      // 2c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.baa I
      // 2f: return
   }

   @Override
   public void aabaa() {
      this.aa();
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(348362599, 41086607 ^ 67479343);
      if (bab[var3] == null) {
         bab[var3] = (int)(aba[var3] ^ var1);
      }

      return bab[var3];
   }

   private void bb(int var1) {
      int var2 = baaabbaa.bba;
      Iterator var3 = this.bbb.entrySet().iterator();

      while (var3.hasNext()) {
         Iterator var10000;
         label23: {
            try {
               var10000 = var3;
               if (var2 != 0) {
                  break label23;
               }

               if ((Integer)((Entry)var3.next()).getValue() > var1) {
                  continue;
               }
            } catch (MatchException var4) {
               throw var4;
            }

            var10000 = var3;
         }

         var10000.remove();
         if (var2 != 0) {
            break;
         }
      }
   }

   public boolean aaa(class_310 param1) {
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
      // 06: ifne 3e
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.babbaab ()Z
      // 0c: ifeq 3d
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 3e
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.bba (Lnet/minecraft/class_310;)Z
      // 20: ifeq 3d
      // 23: goto 27
      // 26: athrow
      // 27: aload 1
      // 28: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2b: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 2e: iload 2
      // 2f: ifne 60
      // 32: goto 36
      // 35: athrow
      // 36: ifne 44
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 0
      // 3e: bipush 0
      // 3f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.baa I
      // 42: bipush 0
      // 43: ireturn
      // 44: aload 0
      // 45: aload 1
      // 46: iload 2
      // 47: ifne 7a
      // 4a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.ab (Lnet/minecraft/class_310;)V
      // 4d: aload 0
      // 4e: aload 1
      // 4f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 52: getfield net/minecraft/class_746.field_6012 I
      // 55: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.bb (I)V
      // 58: aload 0
      // 59: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.baa I
      // 5c: goto 60
      // 5f: athrow
      // 60: ifle 78
      // 63: aload 0
      // 64: dup
      // 65: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.baa I
      // 68: bipush 1
      // 69: isub
      // 6a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.baa I
      // 6d: aload 0
      // 6e: aload 1
      // 6f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 72: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.aaaa (Lnet/minecraft/class_746;)V
      // 75: bipush 1
      // 76: ireturn
      // 77: athrow
      // 78: aload 0
      // 79: aload 1
      // 7a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.aba (Lnet/minecraft/class_310;)Lnet/minecraft/class_8956;
      // 7d: astore 3
      // 7e: iload 2
      // 7f: ifne c6
      // 82: aload 3
      // 83: ifnonnull 8d
      // 86: goto 8a
      // 89: athrow
      // 8a: bipush 0
      // 8b: ireturn
      // 8c: athrow
      // 8d: aload 0
      // 8e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.bbb Ljava/util/Map;
      // 91: aload 3
      // 92: invokevirtual net/minecraft/class_8956.method_5628 ()I
      // 95: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 98: aload 1
      // 99: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9c: getfield net/minecraft/class_746.field_6012 I
      // 9f: ldc 348362596
      // a1: ldc -522693572
      // a3: ldc 1702777974
      // a5: ixor
      // a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.a (II)I
      // a9: ldc2_w 523562138864940757
      // ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.ba (IJ)I
      // af: iadd
      // b0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // b3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // b8: pop
      // b9: aload 0
      // ba: bipush 1
      // bb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.baa I
      // be: aload 0
      // bf: aload 1
      // c0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.aaaa (Lnet/minecraft/class_746;)V
      // c6: bipush 1
      // c7: ireturn
   }

   private static void aab() {
      int var0 = -1960502595;
      bba[0] = abb(
         aaab(a(348362597, var0 ^ -100223293), a(348362594, var0 ^ 1336023425)).toCharArray(),
         bab(a(348362595, var0 ^ 161824323), 391857443683405416L),
         ba(a(348362592, var0 ^ 651226736), 7215563806610113708L)
      );
      bba[1] = abb(
         aaab(a(348362593, var0 ^ -916185089), a(348362606, var0 ^ -1531112199)).toCharArray(),
         bab(a(348362607, var0 ^ 314167988), 6795328867809597896L),
         ba(a(348362604, var0 ^ -757401298), 3589044448820140968L)
      );
      bba[2] = abb(
         aaab(a(348362605, var0 ^ -793396655), a(348362602, var0 ^ 1602322368)).toCharArray(),
         bab(a(348362603, var0 ^ -1992441952), 60394194362377298L),
         ba(a(348362600, var0 ^ 663176630), 4951192169693640895L)
      );
      bba[3] = abb(
         aaab(a(348362601, var0 ^ 923074708), a(348362518, var0 ^ 652225401)).toCharArray(),
         bab(a(348362519, var0 ^ 954295440), 6986131229052034695L),
         ba(a(348362516, var0 ^ 1168126224), 3065429628443022409L)
      );
   }

   private class_8956 aba(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 004: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 007: checkcast java/lang/Double
      // 00a: invokevirtual java/lang/Double.doubleValue ()D
      // 00d: dstore 3
      // 00e: dload 3
      // 00f: dload 3
      // 010: dmul
      // 011: dstore 5
      // 013: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 016: aload 1
      // 017: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01a: astore 7
      // 01c: istore 2
      // 01d: new net/minecraft/class_243
      // 020: dup
      // 021: aload 7
      // 023: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 026: aload 7
      // 028: invokevirtual net/minecraft/class_746.method_23318 ()D
      // 02b: ldc2_w 0.05
      // 02e: dadd
      // 02f: aload 7
      // 031: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 034: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 037: astore 8
      // 039: aconst_null
      // 03a: astore 9
      // 03c: ldc2_w 1.7976931348623157E308
      // 03f: dstore 10
      // 041: aload 1
      // 042: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 045: invokevirtual net/minecraft/class_638.method_18112 ()Ljava/lang/Iterable;
      // 048: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 04d: astore 12
      // 04f: aload 12
      // 051: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 056: ifeq 171
      // 059: aload 12
      // 05b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 060: checkcast net/minecraft/class_1297
      // 063: astore 13
      // 065: aload 13
      // 067: iload 2
      // 068: ifne 077
      // 06b: instanceof net/minecraft/class_8956
      // 06e: ifeq 04f
      // 071: goto 075
      // 074: athrow
      // 075: aload 13
      // 077: checkcast net/minecraft/class_8956
      // 07a: astore 14
      // 07c: aload 14
      // 07e: iload 2
      // 07f: ifne 08e
      // 082: invokevirtual net/minecraft/class_8956.method_31481 ()Z
      // 085: ifne 04f
      // 088: goto 08c
      // 08b: athrow
      // 08c: aload 14
      // 08e: invokevirtual net/minecraft/class_8956.method_5805 ()Z
      // 091: iload 2
      // 092: ifne 0ad
      // 095: ifeq 04f
      // 098: goto 09c
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.bbb Ljava/util/Map;
      // 0a0: aload 14
      // 0a2: invokevirtual net/minecraft/class_8956.method_5628 ()I
      // 0a5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a8: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0ad: ifeq 0b3
      // 0b0: goto 04f
      // 0b3: aload 14
      // 0b5: invokevirtual net/minecraft/class_8956.method_23318 ()D
      // 0b8: aload 14
      // 0ba: invokevirtual net/minecraft/class_8956.method_23318 ()D
      // 0bd: aload 14
      // 0bf: invokevirtual net/minecraft/class_8956.method_18798 ()Lnet/minecraft/class_243;
      // 0c2: getfield net/minecraft/class_243.field_1351 D
      // 0c5: dadd
      // 0c6: invokestatic java/lang/Math.min (DD)D
      // 0c9: dstore 15
      // 0cb: aload 14
      // 0cd: invokevirtual net/minecraft/class_8956.method_23318 ()D
      // 0d0: aload 14
      // 0d2: invokevirtual net/minecraft/class_8956.method_23318 ()D
      // 0d5: aload 14
      // 0d7: invokevirtual net/minecraft/class_8956.method_18798 ()Lnet/minecraft/class_243;
      // 0da: getfield net/minecraft/class_243.field_1351 D
      // 0dd: dadd
      // 0de: invokestatic java/lang/Math.max (DD)D
      // 0e1: dstore 17
      // 0e3: dload 15
      // 0e5: iload 2
      // 0e6: ifne 0fc
      // 0e9: aload 7
      // 0eb: invokevirtual net/minecraft/class_746.method_23318 ()D
      // 0ee: ldc2_w 1.35
      // 0f1: dadd
      // 0f2: dcmpl
      // 0f3: ifgt 04f
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: dload 17
      // 0fc: aload 7
      // 0fe: invokevirtual net/minecraft/class_746.method_23318 ()D
      // 101: ldc2_w 0.65
      // 104: dsub
      // 105: dcmpg
      // 106: ifge 10d
      // 109: goto 04f
      // 10c: athrow
      // 10d: new net/minecraft/class_243
      // 110: dup
      // 111: aload 14
      // 113: invokevirtual net/minecraft/class_8956.method_23317 ()D
      // 116: aload 14
      // 118: invokevirtual net/minecraft/class_8956.method_23318 ()D
      // 11b: aload 14
      // 11d: invokevirtual net/minecraft/class_8956.method_23321 ()D
      // 120: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 123: astore 19
      // 125: aload 19
      // 127: aload 14
      // 129: invokevirtual net/minecraft/class_8956.method_18798 ()Lnet/minecraft/class_243;
      // 12c: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 12f: astore 20
      // 131: aload 0
      // 132: aload 8
      // 134: aload 19
      // 136: aload 20
      // 138: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.bbb (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)D
      // 13b: dstore 21
      // 13d: dload 21
      // 13f: iload 2
      // 140: ifne 153
      // 143: dload 5
      // 145: dcmpg
      // 146: ifgt 16d
      // 149: goto 14d
      // 14c: athrow
      // 14d: dload 21
      // 14f: goto 153
      // 152: athrow
      // 153: iload 2
      // 154: ifne 167
      // 157: dload 10
      // 159: dcmpg
      // 15a: ifge 16d
      // 15d: goto 161
      // 160: athrow
      // 161: dload 21
      // 163: goto 167
      // 166: athrow
      // 167: dstore 10
      // 169: aload 14
      // 16b: astore 9
      // 16d: iload 2
      // 16e: ifeq 04f
      // 171: aload 9
      // 173: areturn
   }

   private static String abb(char[] var0, long var1, int var3) {
      int var4 = ba(a(348362517, -1325171824 ^ -992139815), 662567569230240454L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ba(a(348362514, -1325171824 ^ 1660371316), 8694546288562032977L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public baabbaa() {
      super(
         aabbaaaba.aaab(bba[0]),
         bbaabbba.aaa,
         aabbaaaba.aaab(bba[1])
      );
      this.ba = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(bba[2]), 1.15, 0.5, 2.5, 0.05)
            .bb(aabbaaaba.abba(bba[3]))
      );
      this.bbb = new HashMap();
   }

   private static String b(int var0, int var1, int var2) {
      int var3 = var1 ^ 36314;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 28191;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 9738;
         var10 += 5713;
         var10 -= 5420;
         var10 += 29120;
         var10 ^= 48059;
         var10 += 19630;
         var10 += 47663;
         var10 += 5509;
         var10 += 46632;
         var10 ^= 21104;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static long bab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(348362515, 1278777763 ^ -1368791609)) & a(348362512, 1278777763 ^ -1339080203);
      if (ab[var3] == null) {
         ab[var3] = bb[var3] ^ var1;
      }

      return ab[var3];
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
      // 09: ifne 2e
      // 0c: aload 0
      // 0d: aload 2
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.bba (Lnet/minecraft/class_310;)Z
      // 11: ifne 1e
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.aa ()V
      // 1c: return
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 2
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.ab (Lnet/minecraft/class_310;)V
      // 23: aload 0
      // 24: aload 2
      // 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 28: getfield net/minecraft/class_746.field_6012 I
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaa.bb (I)V
      // 2e: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = -339198258;
      int var26 = 0;
      int var10001 = "\u001d珿㨎ἣ惓㿔ꠈണ୍얦\u0c73\ue277궄ṽ肧齬\uea15\ue848\udb68昗\uf65a餤萒즂鎨鿓ｘ㝨偟ຕi䠻㲌睕⒉\uf53d燝䫊쳕\uf108割ᝬ뱘俞鋨㍰咠憎뱞չ降荙⛿䆓䎨す⇭캿抭㗴償岛\u085f贱檬\uf862\uf15bὯᳯꏅ漎ꏉꪥ횵ⱳ괁먿ⅿ괔帚垰褹缧㸻䳁\ue8a6᭲坏ꀍ잙蟙㑄潠蜫ꮦ릞䒙\ueb23᭑虫륱\uf604膐矎잊牓貊\uee5c죐∽뭢⍮休꧱髟䳢ᩜࢰ쑪౺\ue4e1\ue239똊䒔乙쪍╴\ue531삷醍ퟟ点锵어冖䤙8Ĥ쇵ǁ䃗հꃦ`肹ߑ\u209dߤǋՑꃗ䎘胬买₴乁\ue08b䎼ú䱑ǫݘꃱ仰삺ә\ue09d<쇇䳩ꇮŰ\ue0ef䎨ꂵ䴉䆍丌샻䰡ǩ䱀\ue0f2`憋ߑ肃t\ue1c3佑⇞䱰⃭\n㩣ﰓ㫮밭㭷\udc03㬗㱙㿾㱩\u0010窟구摢ഹ碃贏礓贫羲굦穇\ued6e搒洲晣洃\nｄ挆）⌵敖䌄侮ꍙ慄ꍩ\u0010愖\ue843⹛䥑撊⡣⸂\ue802Ⱛऀ\u2d7e⥾ⴻ楎Ⰺ⥩\n\ue9a9坏\ue9c4靱\ue85d睏\ue81dᜒ\ue8f4\u173c\u0010䂦䧻軓⧑䝊ꧣ䆊즷菳⦞䊦槦蹛䫫䂂觲\n㲞蠋㳳䠥り⠬ㄪ졶㷃졀"
         .length();
      int var27 = 0;
      String[] var25 = new String[10];
      short var28 = 24427;
      int var24 = var10001;
      String var23 = "\u001d珿㨎ἣ惓㿔ꠈണ୍얦\u0c73\ue277궄ṽ肧齬\uea15\ue848\udb68昗\uf65a餤萒즂鎨鿓ｘ㝨偟ຕi䠻㲌睕⒉\uf53d燝䫊쳕\uf108割ᝬ뱘俞鋨㍰咠憎뱞չ降荙⛿䆓䎨す⇭캿抭㗴償岛\u085f贱檬\uf862\uf15bὯᳯꏅ漎ꏉꪥ횵ⱳ괁먿ⅿ괔帚垰褹缧㸻䳁\ue8a6᭲坏ꀍ잙蟙㑄潠蜫ꮦ릞䒙\ueb23᭑虫륱\uf604膐矎잊牓貊\uee5c죐∽뭢⍮休꧱髟䳢ᩜࢰ쑪౺\ue4e1\ue239똊䒔乙쪍╴\ue531삷醍ퟟ点锵어冖䤙8Ĥ쇵ǁ䃗հꃦ`肹ߑ\u209dߤǋՑꃗ䎘胬买₴乁\ue08b䎼ú䱑ǫݘꃱ仰삺ә\ue09d<쇇䳩ꇮŰ\ue0ef䎨ꂵ䴉䆍丌샻䰡ǩ䱀\ue0f2`憋ߑ肃t\ue1c3佑⇞䱰⃭\n㩣ﰓ㫮밭㭷\udc03㬗㱙㿾㱩\u0010窟구摢ഹ碃贏礓贫羲굦穇\ued6e搒洲晣洃\nｄ挆）⌵敖䌄侮ꍙ慄ꍩ\u0010愖\ue843⹛䥑撊⡣⸂\ue802Ⱛऀ\u2d7e⥾ⴻ楎Ⰺ⥩\n\ue9a9坏\ue9c4靱\ue85d睏\ue81dᜒ\ue8f4\u173c\u0010䂦䧻軓⧑䝊ꧣ䆊즷菳⦞䊦槦蹛䫫䂂觲\n㲞蠋㳳䠥り⠬ㄪ졶㷃졀";

      do {
         char var29 = var23.charAt(var27);
         var10001 = var27 + 1;
         int var10002 = var27 + 1;
         int var31 = 0;
         char[] var30 = var23.substring(var10001, var10002 + var29).toCharArray();

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 5) {
               default -> 236;
               case 1 -> 248;
               case 2 -> 177;
               case 3 -> 209;
               case 4 -> 128;
            }) ^ var32;
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 3 | var32 << 13) & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 3 | var32 >>> 13) & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      abaa = var25;
      abab = new Object[var25.length];
      byte var39 = 0;
      int var49 = 0;
      aabb = new int[329];
      byte[] var71 = "\u008bW\u0091\b\u0014\u0007.\u008bË¼\u008co6åÆ\u0094\u001bPéöcF\\0\u0007Ù¼?é0Ã®\u009ecÝÎ\u008c\u0018ªOW6U\u000e\u0098÷Å3tr\u0095à{\u0007\u009bøv\u0092ú\u0018\u009e\u0080\u001cès^\u0083Õ\b;\n\u001c{K\u0016\b¢X@ÅôþÒ\u0095\u0091at+\u008bò\u0016\u001925\u008f\u008b¸\\UÜ\u009f¨«#R\u007fxo[Y}±\u00adÀd\u0012F\u0094¥÷¸r\u00183öcà j)PkYó¾]`\u008aC»¯9\b\u001f\u0083¹Aé\u0002£\u0081j\u0087ÕÑôNU\t¹úÁ\f8gRNä^\u0003\u001d\\]\u0099ó1AÕ±!\u009e\"ITûq\u0093\u0005\u0018ËÏ»\u0015î¨¼/ç\u000bC¬6\u0095iX³ó?í\u0015Æ;«\u0010¹/\u0084er]kÑZ\t\u0006\b»ª°\fc7poZ\u000er\u0000ÿ¨ý7k¾+\u0088RÏ\u00852Å\u0081\u0095°Ek\u0084U\u0080É\u009aU\u0012·ç\u0015íõ\\Næ\u0094údÊÈËÁï|Õ\u0087n¶p\u0018ÔSåÀ¯\u0095Å²\u0093Ü\u009aäÀh\u0013ïÑ[íÿB/©\n\u009e#ÞÍË\u0088ûíÅå4É¢\u0098¤Gßï\u0098Ù_\u000fÏvÛêµîó·8èC\n\u001f\u001bHxÒÙ\u0019e\u0096Ô¸h£îs±2gc¥\u0091&\u001cïRÄTU«\u001f\u0018T©Î\u009b·ÐÑ\u0019K)s¿óG\nÐ©ÈeÖ\u0014[´Wj\u009dYDÀ½\u0011ªý\u0090\u0006rm\u0013Þ\u0083)«yðùOî<C\u000b\u008d\u0019ºè\u0096ó¡Ë\nI§¥\u009fÂ¨\u0083}$\u0093ø2ËÈ\u0088%\u0094A÷\u001f\u0016(È\u008e@'4ýv\u000fX©û¶é6ÄÍàärÉø\u0094æD\u001eî\u009aÀ\bJAîfÐo¨\u0013Â8â\u0088¯7â'\u0004\\Æt \u0081\u00188«Wv»}/\u0084¦ðË\u009eU\u001a\"ù\u0080ýp«@«*ËÛ\u008d|\u008dÛ\rNÃ5©Wç¦½\u008c\u0095\u0099{UÛ\u0016t~FIm\u0093â=ÑãA\u0085*îE\u008aËÂ\u001f\u0098Ú113±¨\u0017©B\u0004Ô¡\u0014¢J0\u009aìª±\u00978¨lT0Q\u0016\u00ad\u000f\u0003ëøè¾Biß:Î\u0087\u0003\u0082udÀ.ÿ!6\u0014(|Û!^@ã¬\u008e`\u0005*yæ\u0011\u0015HýjFëF{~\u0014Ð×¹ª\u0010»ÕÚ_Jk¨\u00adÛ£¬\u0099k\u0084y}>ó\u0083²E\u0087=3¡U\u0081\u0096µXÚÄq\u008c\u0003à\u0007³öÏ\u008a\u009e(C[ý:\u0092\u0085r3;aÐÔ#W\u000e¬\u0011Â_T\u0011\u0007l\u0080\u009cxKùv\u00ad\u0094\u0015ý]Æb\u009fd~OÞ¨Ð\u000f¡t[R\u009aâ\u0095¥\u0083àI\u0002\u0084\u0092\u000215Z\u0089 \n«ì\u0094×¼Ð\u0085\u001e½EÐé\u0084\u001a»¥«\u0096\u0013Ð8÷c»\u008e¯É¹t\u0099\u0084\u0017\u0088\u0004Ãtoû:W.\u009fêé%õõôÆ\u001b®=Ëã¶\u0096ÄùÚÊ}\u000e\u0007\u0016äzî\u008f\u008a6j8ê³\u0018ò\u000b?yÍ/\u0087ÜcJà yur\u0080Û\u0083à\u0095))È§:á\u000e\u00ad~\u0092¾\rô# \u0088÷Y\u0095\u0093\u0007bAô\u001f\u0083\u0093ô\u0080ì\u000eñ\u0000i\u000b@CN|\u00199×wÅ\u0085d\u008f\u0011hzQ^«uA\u0085A\u00adg_x\u000ef\u0014ÒanÕ\u0014¥xþ¨éxuCVÝ\u0014ÉÑLÏ\u0006\u0016C'á:\u009a\u0082î¬¿\u000bõ3ð\u007fª\u0005®=`fO\u008c¹\r\u0010Wé\u000b\u0088\bÅ'j\u0005Ñ¬\u009cçAÇIT(\u008f\u0085D\u0084¦\u008cÔ,\u0085\u0085\u0017<³Æ\u001deS\u0010êI¬\u001b\u0098\u0006#EìôÞ\u0004o¾`º\u0011\u0096~ãá:\u0000\u008d®\u0098+{ËYóK\u0084þÓ8°moBÌyS<\u009b\u000b!¥Få\u001eì¢Ï°9¨ÿ»`\u007fè/\u0096S\u0093åg\u0017¬&1¡U\r ¹às\u009eã=\u009b\u007f²(Õ'+\u0016\u0007\u00820Çå(\u001d\u0088ÞÈ^ì\u009a\u0003Ø\u009e<\u0006rùÉU@â0EÆ ®b\u008f,âÇy\u0082)\u0018ÿÔÃ8\u001fY\u001f_Ò5ØC=\u0016Úm´\u001d\u0007\u009c\u008b,nAC\u001cÜ\u001f-ú2\u000f\u0014\u009bÂ\u0084\u0002\u008eô,é{6\u0018tÂþCq\u0014ø\u000bE\f3\u001f¢þC\u0084=ýk\u000eë\u0002Ë\u0007m}Ôªî¿{\u009c\u0010\u0097RR\u000eé*W~´iËFw°¿É\u0083r}}Ö;.ÙgÈFKÉ\u001dÔ\u0019 a\u0011¹\u008cHVÃùg\u007fPùy¬\u0011}Âk\u0083âUl\" Z\u0086&§z\u0087nyQ\u008a¯&¹\u001f\u0015\u0010\u0082\u0092\u0099Tå¿\u009fÔmÁ:Àí>]Í]Y\u0084\u0002\u00912\bJÙ>\u0005¾\u0003\u0003\u0090®?Ó"
         .getBytes("ISO-8859-1");

      int var101;
      do {
         aabb[var39] = ((var71[var49] & 255) << 24 | (var71[var49 + 1] & 255) << 16 | (var71[var49 + 2] & 255) << 8 | var71[var49 + 3] & 255) ^ -1028895037;
         var39 += 1;
         var101 = var49 + 4;
         var49 += 4;
      } while (var101 < var71.length);

      String[] var21 = new String[4];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b(var33 ^ -1832908163, 36314, 57840)).length();
      int var17 = a(348362582, var33 ^ 1225721537);
      int var37 = -1;

      label138:
      while (true) {
         String var40 = var18.substring(++var37, var37 + var17);
         var49 = (byte)-1;

         while (true) {
            label133: {
               char[] var54 = var40.toCharArray();
               var101 = var54.length;
               int var22 = 0;
               var80 = var54;
               var49 = var101;
               char[] var105;
               int var127;
               if (var101 <= 1) {
                  var105 = var54;
                  var127 = var22;
               } else {
                  var80 = var54;
                  var49 = var101;
                  if (var101 <= var22) {
                     break label133;
                  }

                  var105 = var54;
                  var127 = var22;
               }

               while (true) {
                  var105[var127] = (char)(var105[var127] ^ switch (var22 % a(348362580, var33 ^ 165938381)) {
                     case 0 -> a(348362581, var33 ^ -188919417);
                     case 1 -> a(348362578, var33 ^ -653762239);
                     case 2 -> 4;
                     case 3 -> a(348362579, var33 ^ -1591817279);
                     case 4 -> a(348362576, var33 ^ -981390340);
                     case 5 -> a(348362577, var33 ^ 728257608);
                     default -> a(348362590, var33 ^ 1547389492);
                  });
                  var22++;
                  if (var49 == 0) {
                     var127 = var49;
                     var105 = var80;
                  } else {
                     if (var49 <= var22) {
                        break;
                     }

                     var105 = var80;
                     var127 = var22;
                  }
               }
            }

            String var112 = new String(var80).intern();
            switch (var49) {
               case 0:
                  var21[var19++] = var112;
                  if ((var37 += var17) >= var20) {
                     aaab = var21;
                     aaa = new String[4];
                     long var8 = 7275401959066439390L;
                     long[] var14 = new long[a(348362591, var33 ^ 1312832796)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = b(var33 ^ 134875615, 36312, 51420)).length();
                     byte var10 = 0;

                     label112:
                     while (true) {
                        int var61 = var10;
                        var10 += 8;
                        String var42 = var12.substring(var61, var10);
                        var61 = var33 ^ -388423448;
                        char var86 = '跙';
                        short var113 = 32713;
                        byte[] var15 = var42.getBytes("ISO-8859-1");
                        long[] var43 = var14;
                        var61 = var11++;
                        long var87 = (var15[0] & 255L) << a(348362588, var33 ^ -1787896403)
                           | (var15[1] & 255L) << a(348362589, var33 ^ 1521438089)
                           | (var15[2] & 255L) << a(348362586, var33 ^ -1238753963)
                           | (var15[3] & 255L) << a(348362587, var33 ^ -1184951436)
                           | (var15[4] & 255L) << a(348362584, var33 ^ -1261802017)
                           | (var15[5] & 255L) << a(348362585, var33 ^ 1557695286)
                           | (var15[a(348362566, var33 ^ -1325003934)] & 255L) << a(348362567, var33 ^ -899441324)
                           | var15[a(348362564, var33 ^ -1189896518)] & 255L;
                        short var114 = -1;

                        while (true) {
                           long var129 = var87 ^ var8;
                           switch (var114) {
                              case 0:
                                 var43[var61] = var129;
                                 if (var10 >= var13) {
                                    aba = var14;
                                    bab = new Integer[a(348362570, var33 ^ 1872294740)];
                                    abb = ba(a(348362571, var33 ^ -2066978619), 8873685285254287595L);
                                    aab = ba(a(348362568, var33 ^ 2049602395), 7340005829069584290L);
                                    long var0 = 6606197465320167320L;
                                    long[] var6 = new long[4];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = b(var33 ^ 1671714201, 36316, 28444)).length();
                                    byte var2 = 0;

                                    label102:
                                    while (true) {
                                       int var66 = var2;
                                       var2 += 8;
                                       String var45 = var4.substring(var66, var2);
                                       var66 = var33 ^ -1442180504;
                                       char var90 = '距';
                                       var114 = 7997;
                                       byte[] var7 = var45.getBytes("ISO-8859-1");
                                       long[] var46 = var6;
                                       var66 = var3++;
                                       long var91 = (var7[0] & 255L) << a(348362569, var33 ^ 876308502)
                                          | (var7[1] & 255L) << a(348362614, var33 ^ -1468933894)
                                          | (var7[2] & 255L) << a(348362615, var33 ^ -1683278139)
                                          | (var7[3] & 255L) << a(348362612, var33 ^ -1563243752)
                                          | (var7[4] & 255L) << a(348362613, var33 ^ 1835114485)
                                          | (var7[5] & 255L) << a(348362610, var33 ^ 1105319452)
                                          | (var7[a(348362611, var33 ^ -1057289752)] & 255L) << a(348362608, var33 ^ 1166886539)
                                          | var7[a(348362609, var33 ^ -1945272002)] & 255L;
                                       short var118 = -1;

                                       while (true) {
                                          var129 = var91 ^ var0;
                                          switch (var118) {
                                             case 0:
                                                var46[var66] = var129;
                                                if (var2 >= var5) {
                                                   bb = var6;
                                                   ab = new Long[4];
                                                   bba = new String[4];
                                                   aab();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var46[var66] = var129;
                                                if (var2 < var5) {
                                                   continue label102;
                                                }

                                                var5 = (var4 = b(var33 ^ 410277317, 36306, 144)).length();
                                                var2 = 0;
                                          }

                                          int var69 = var2;
                                          var2 += 8;
                                          String var47 = var4.substring(var69, var2);
                                          var69 = var33 ^ 459739363;
                                          char var93 = '跓';
                                          var118 = 11702;
                                          var7 = var47.getBytes("ISO-8859-1");
                                          var46 = var6;
                                          var66 = var3++;
                                          var91 = (var7[0] & 255L) << a(348362622, var33 ^ 949585081)
                                             | (var7[1] & 255L) << a(348362623, var33 ^ -1526020484)
                                             | (var7[2] & 255L) << a(348362620, var33 ^ -1671719473)
                                             | (var7[3] & 255L) << a(348362621, var33 ^ -1614709861)
                                             | (var7[4] & 255L) << a(348362618, var33 ^ -2087901500)
                                             | (var7[5] & 255L) << a(348362619, var33 ^ 1551556264)
                                             | (var7[a(348362616, var33 ^ 958995340)] & 255L) << a(348362617, var33 ^ -627877683)
                                             | var7[a(348362598, var33 ^ -675930068)] & 255L;
                                          var118 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var43[var61] = var129;
                                 if (var10 < var13) {
                                    continue label112;
                                 }

                                 var13 = (var12 = b(var33 ^ 1289315163, 36318, 41827)).length();
                                 var10 = 0;
                           }

                           int var64 = var10;
                           var10 += 8;
                           String var44 = var12.substring(var64, var10);
                           var64 = var33 ^ -814787366;
                           char var89 = '跟';
                           var114 = 4107;
                           var15 = var44.getBytes("ISO-8859-1");
                           var43 = var14;
                           var61 = var11++;
                           var87 = (var15[0] & 255L) << a(348362565, var33 ^ 1610664063)
                              | (var15[1] & 255L) << a(348362562, var33 ^ 916871728)
                              | (var15[2] & 255L) << a(348362563, var33 ^ 1396309127)
                              | (var15[3] & 255L) << a(348362560, var33 ^ 1235918478)
                              | (var15[4] & 255L) << a(348362561, var33 ^ -261285803)
                              | (var15[5] & 255L) << a(348362574, var33 ^ 2047132181)
                              | (var15[a(348362575, var33 ^ 1576018845)] & 255L) << a(348362572, var33 ^ -1876431060)
                              | var15[a(348362573, var33 ^ -1727924982)] & 255L;
                           var114 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var37);
                  break;
               default:
                  var21[var19++] = var112;
                  if ((var37 += var17) < var20) {
                     var17 = var18.charAt(var37);
                     continue label138;
                  }

                  var20 = (var18 = b(var33 ^ -772647207, 36315, 53620)).length();
                  var17 = a(348362583, var33 ^ -698369633);
                  var37 = -1;
            }

            var40 = var18.substring(++var37, var37 + var17);
            var49 = (byte)0;
         }
      }
   }

   private static int a(int var0, int var1) {
      int var2 = aabb[var0 ^ 348362582] ^ var1 ^ var0;
      var2 += 17060;
      var2 -= 9700;
      var2 += 22186;
      var2 += 60751;
      var2 ^= 38978;
      var2 += 3907;
      var2 += 24685;
      var2 ^= 57147;
      return var2 ^ 26522;
   }

   private boolean bba(class_310 param1) {
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
      // 09: ifnull e3
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull e3
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnull e3
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 3e: ifnull e3
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: iload 2
      // 4b: ifne 5d
      // 4e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 51: ifnonnull e3
      // 54: goto 58
      // 57: athrow
      // 58: aload 1
      // 59: goto 5d
      // 5c: athrow
      // 5d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 60: iload 2
      // 61: ifne 7e
      // 64: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 67: ifeq e3
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 1
      // 6f: iload 2
      // 70: ifne 8c
      // 73: goto 77
      // 76: athrow
      // 77: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7a: goto 7e
      // 7d: athrow
      // 7e: invokevirtual net/minecraft/class_746.method_31549 ()Lnet/minecraft/class_1656;
      // 81: getfield net/minecraft/class_1656.field_7479 Z
      // 84: ifne e3
      // 87: aload 1
      // 88: goto 8c
      // 8b: athrow
      // 8c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 8f: iload 2
      // 90: ifne ad
      // 93: invokevirtual net/minecraft/class_746.method_5799 ()Z
      // 96: ifne e3
      // 99: goto 9d
      // 9c: athrow
      // 9d: aload 1
      // 9e: iload 2
      // 9f: ifne b8
      // a2: goto a6
      // a5: athrow
      // a6: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a9: goto ad
      // ac: athrow
      // ad: invokevirtual net/minecraft/class_746.method_5869 ()Z
      // b0: ifne e3
      // b3: aload 1
      // b4: goto b8
      // b7: athrow
      // b8: iload 2
      // b9: ifne ce
      // bc: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // bf: invokevirtual net/minecraft/class_746.method_5771 ()Z
      // c2: ifne e3
      // c5: goto c9
      // c8: athrow
      // c9: aload 1
      // ca: goto ce
      // cd: athrow
      // ce: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // d1: invokevirtual net/minecraft/class_746.method_6101 ()Z
      // d4: iload 2
      // d5: ifne e0
      // d8: ifne e3
      // db: goto df
      // de: athrow
      // df: bipush 1
      // e0: goto e4
      // e3: bipush 0
      // e4: ireturn
   }

   private double bbb(class_243 param1, class_243 param2, class_243 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: aload 2
      // 02: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 05: astore 5
      // 07: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0a: aload 5
      // 0c: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 0f: dstore 6
      // 11: istore 4
      // 13: dload 6
      // 15: iload 4
      // 17: ifne 39
      // 1a: ldc2_w 1.0E-8
      // 1d: dcmpg
      // 1e: ifgt 2c
      // 21: goto 25
      // 24: athrow
      // 25: aload 1
      // 26: aload 2
      // 27: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 2a: dreturn
      // 2b: athrow
      // 2c: aload 1
      // 2d: aload 2
      // 2e: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 31: aload 5
      // 33: invokevirtual net/minecraft/class_243.method_1026 (Lnet/minecraft/class_243;)D
      // 36: dload 6
      // 38: ddiv
      // 39: dstore 8
      // 3b: dconst_0
      // 3c: dconst_1
      // 3d: dload 8
      // 3f: invokestatic java/lang/Math.min (DD)D
      // 42: invokestatic java/lang/Math.max (DD)D
      // 45: dstore 8
      // 47: aload 1
      // 48: aload 2
      // 49: aload 5
      // 4b: dload 8
      // 4d: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 50: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 53: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 56: dreturn
   }

   private void aaaa(class_746 var1) {
      ((abababbaa)var1).wq$setJumpingCooldown(0);
   }

   private static String aaab(int var0, int var1) {
      int var9 = 841732103;
      int var2 = (var0 ^ a(348362513, var9 ^ 1805867873)) & a(348362526, var9 ^ -25605764);
      if (aaa[var2] == null) {
         char[] var3 = aaab[var2].toCharArray();

         int var4 = switch (var3[0] & a(348362527, var9 ^ -569775564)) {
            case 0 -> a(348362524, var9 ^ -2124432928);
            case 1 -> a(348362525, var9 ^ 139765771);
            case 2 -> a(348362522, var9 ^ -163300519);
            case 3 -> a(348362523, var9 ^ -1296959445);
            case 4 -> a(348362520, var9 ^ -982076844);
            case 5 -> a(348362521, var9 ^ -531186528);
            case 6 -> a(348362502, var9 ^ 796050580);
            case 7 -> a(348362503, var9 ^ -1073961333);
            case 8 -> a(348362500, var9 ^ -2090719648);
            case 9 -> a(348362501, var9 ^ -724721025);
            case 10 -> a(348362498, var9 ^ -1370122763);
            case 11 -> 3;
            case 12 -> a(348362499, var9 ^ 592651685);
            case 13 -> a(348362496, var9 ^ 77607178);
            case 14 -> a(348362497, var9 ^ -916299638);
            case 15 -> a(348362510, var9 ^ -1922055773);
            case 16 -> a(348362511, var9 ^ -1202386225);
            case 17 -> a(348362508, var9 ^ 702285073);
            case 18 -> a(348362509, var9 ^ -1969390944);
            case 19 -> a(348362506, var9 ^ 1233072893);
            case 20 -> a(348362507, var9 ^ -1331396865);
            case 21 -> a(348362504, var9 ^ -1300897214);
            case 22 -> a(348362505, var9 ^ -882213043);
            case 23 -> a(348362550, var9 ^ 852023660);
            case 24 -> 0;
            case 25 -> a(348362551, var9 ^ 1555147233);
            case 26 -> a(348362548, var9 ^ -740380685);
            case 27 -> a(348362549, var9 ^ 1074736811);
            case 28 -> a(348362546, var9 ^ -2031993454);
            case 29 -> a(348362547, var9 ^ -1498754252);
            case 30 -> a(348362544, var9 ^ -1950542742);
            case 31 -> a(348362545, var9 ^ 140900937);
            case 32 -> a(348362558, var9 ^ -1329424762);
            case 33 -> a(348362559, var9 ^ 1414874395);
            case 34 -> a(348362556, var9 ^ 272006957);
            case 35 -> a(348362557, var9 ^ -215116481);
            case 36 -> a(348362554, var9 ^ -793694323);
            case 37 -> a(348362555, var9 ^ -1104889019);
            case 38 -> a(348362552, var9 ^ -1731837272);
            case 39 -> a(348362553, var9 ^ -477515112);
            case 40 -> a(348362534, var9 ^ -1818301167);
            case 41 -> a(348362535, var9 ^ -324767706);
            case 42 -> a(348362532, var9 ^ -751486465);
            case 43 -> a(348362533, var9 ^ 793120598);
            case 44 -> a(348362530, var9 ^ 1125293445);
            case 45 -> a(348362531, var9 ^ -225592025);
            case 46 -> a(348362528, var9 ^ -77657188);
            case 47 -> a(348362529, var9 ^ -483426185);
            case 48 -> a(348362542, var9 ^ 89521361);
            case 49 -> a(348362543, var9 ^ 334575650);
            case 50 -> a(348362540, var9 ^ 2104170198);
            case 51 -> a(348362541, var9 ^ 142171872);
            case 52 -> a(348362538, var9 ^ -1827385809);
            case 53 -> a(348362539, var9 ^ 1019165297);
            case 54 -> a(348362536, var9 ^ 1864104139);
            case 55 -> a(348362537, var9 ^ 588263884);
            case 56 -> a(348362710, var9 ^ -1597617828);
            case 57 -> a(348362711, var9 ^ -1119113971);
            case 58 -> a(348362708, var9 ^ 1319191559);
            case 59 -> a(348362709, var9 ^ -1689905576);
            case 60 -> a(348362706, var9 ^ 1527796616);
            case 61 -> a(348362707, var9 ^ -1070196155);
            case 62 -> a(348362704, var9 ^ -1061803850);
            case 63 -> a(348362705, var9 ^ 772943443);
            case 64 -> a(348362718, var9 ^ -1123617460);
            case 65 -> a(348362719, var9 ^ -2101333216);
            case 66 -> a(348362716, var9 ^ 231671616);
            case 67 -> a(348362717, var9 ^ 1389819294);
            case 68 -> a(348362714, var9 ^ 644515247);
            case 69 -> a(348362715, var9 ^ -1634625633);
            case 70 -> a(348362712, var9 ^ -1854888724);
            case 71 -> a(348362713, var9 ^ -2090776450);
            case 72 -> a(348362694, var9 ^ 671797552);
            case 73 -> a(348362695, var9 ^ -1292279286);
            case 74 -> a(348362692, var9 ^ -1162880231);
            case 75 -> a(348362693, var9 ^ 723621307);
            case 76 -> 4;
            case 77 -> a(348362690, var9 ^ -1439940174);
            case 78 -> a(348362691, var9 ^ 2012170692);
            case 79 -> a(348362688, var9 ^ 219575879);
            case 80 -> a(348362689, var9 ^ -264007987);
            case 81 -> a(348362702, var9 ^ 1506977330);
            case 82 -> a(348362703, var9 ^ -717462145);
            case 83 -> a(348362700, var9 ^ 1860151001);
            case 84 -> a(348362701, var9 ^ -459649198);
            case 85 -> a(348362698, var9 ^ 868728178);
            case 86 -> a(348362699, var9 ^ 1174111703);
            case 87 -> a(348362696, var9 ^ -1780777825);
            case 88 -> a(348362697, var9 ^ 1650292731);
            case 89 -> a(348362742, var9 ^ 1397101401);
            case 90 -> a(348362743, var9 ^ -251854321);
            case 91 -> a(348362740, var9 ^ 258716000);
            case 92 -> a(348362741, var9 ^ -1314136789);
            case 93 -> a(348362738, var9 ^ -1042009269);
            case 94 -> a(348362739, var9 ^ -1290355209);
            case 95 -> a(348362736, var9 ^ -1222505024);
            case 96 -> a(348362737, var9 ^ 1657161548);
            case 97 -> a(348362750, var9 ^ -1744225097);
            case 98 -> a(348362751, var9 ^ 646502604);
            case 99 -> a(348362748, var9 ^ -1708274588);
            case 100 -> a(348362749, var9 ^ -1048639426);
            case 101 -> a(348362746, var9 ^ 408649412);
            case 102 -> a(348362747, var9 ^ -311102566);
            case 103 -> a(348362744, var9 ^ 871899867);
            case 104 -> a(348362745, var9 ^ 556393373);
            case 105 -> a(348362726, var9 ^ 679479061);
            case 106 -> a(348362727, var9 ^ -812109488);
            case 107 -> a(348362724, var9 ^ -1213553650);
            case 108 -> a(348362725, var9 ^ 1336573526);
            case 109 -> a(348362722, var9 ^ -1691942577);
            case 110 -> a(348362723, var9 ^ -489827215);
            case 111 -> a(348362720, var9 ^ 239477885);
            case 112 -> a(348362721, var9 ^ 2032409938);
            case 113 -> a(348362734, var9 ^ 1415958163);
            case 114 -> a(348362735, var9 ^ 337251821);
            case 115 -> a(348362732, var9 ^ 1226939186);
            case 116 -> a(348362733, var9 ^ -1103591764);
            case 117 -> a(348362730, var9 ^ 423619458);
            case 118 -> a(348362731, var9 ^ 713958157);
            case 119 -> a(348362728, var9 ^ -1145974143);
            case 120 -> a(348362729, var9 ^ -1888691565);
            case 121 -> a(348362646, var9 ^ -1633303420);
            case 122 -> a(348362647, var9 ^ -883753587);
            case 123 -> a(348362644, var9 ^ -1608592809);
            case 124 -> a(348362645, var9 ^ 141246747);
            case 125 -> a(348362642, var9 ^ 2013329265);
            case 126 -> a(348362643, var9 ^ -771617449);
            case 127 -> a(348362640, var9 ^ -1616055833);
            case 128 -> a(348362641, var9 ^ -657517026);
            case 129 -> a(348362654, var9 ^ 569136971);
            case 130 -> a(348362655, var9 ^ -246267009);
            case 131 -> a(348362652, var9 ^ -296771537);
            case 132 -> a(348362653, var9 ^ -1249465002);
            case 133 -> a(348362650, var9 ^ -1389518211);
            case 134 -> a(348362651, var9 ^ -1049557811);
            case 135 -> a(348362648, var9 ^ 481133310);
            case 136 -> a(348362649, var9 ^ -181081067);
            case 137 -> a(348362630, var9 ^ 1904446511);
            case 138 -> a(348362631, var9 ^ 55145030);
            case 139 -> a(348362628, var9 ^ 1651922624);
            case 140 -> a(348362629, var9 ^ -942132453);
            case 141 -> a(348362626, var9 ^ 1002572960);
            case 142 -> a(348362627, var9 ^ -1688143220);
            case 143 -> a(348362624, var9 ^ -1903014129);
            case 144 -> a(348362625, var9 ^ -1132357406);
            case 145 -> a(348362638, var9 ^ -1228543044);
            case 146 -> a(348362639, var9 ^ 374299215);
            case 147 -> a(348362636, var9 ^ -1823727458);
            case 148 -> a(348362637, var9 ^ -2000938053);
            case 149 -> a(348362634, var9 ^ -274400567);
            case 150 -> a(348362635, var9 ^ -281310540);
            case 151 -> a(348362632, var9 ^ -356839505);
            case 152 -> 1;
            case 153 -> a(348362633, var9 ^ 1542993834);
            case 154 -> a(348362678, var9 ^ 42119559);
            case 155 -> a(348362679, var9 ^ -566361440);
            case 156 -> a(348362676, var9 ^ 181601124);
            case 157 -> a(348362677, var9 ^ 1158679684);
            case 158 -> a(348362674, var9 ^ -1627728721);
            case 159 -> a(348362675, var9 ^ 1153660736);
            case 160 -> a(348362672, var9 ^ 258545756);
            case 161 -> a(348362673, var9 ^ -827341845);
            case 162 -> a(348362686, var9 ^ -451702833);
            case 163 -> a(348362687, var9 ^ 1861759185);
            case 164 -> a(348362684, var9 ^ 259172411);
            case 165 -> a(348362685, var9 ^ -725782306);
            case 166 -> a(348362682, var9 ^ 1012554757);
            case 167 -> a(348362683, var9 ^ -1722430823);
            case 168 -> a(348362680, var9 ^ 273566230);
            case 169 -> a(348362681, var9 ^ 1678867550);
            case 170 -> a(348362662, var9 ^ 651894633);
            case 171 -> a(348362663, var9 ^ -1761449199);
            case 172 -> a(348362660, var9 ^ 1280470417);
            case 173 -> a(348362661, var9 ^ 327048766);
            case 174 -> a(348362658, var9 ^ 510317893);
            case 175 -> a(348362659, var9 ^ -50676123);
            case 176 -> a(348362656, var9 ^ 1335096998);
            case 177 -> a(348362657, var9 ^ 1598013473);
            case 178 -> a(348362670, var9 ^ -812123016);
            case 179 -> a(348362671, var9 ^ 210228678);
            case 180 -> a(348362668, var9 ^ 115225890);
            case 181 -> a(348362669, var9 ^ -235746645);
            case 182 -> a(348362666, var9 ^ -2084742654);
            case 183 -> a(348362667, var9 ^ -145770444);
            case 184 -> a(348362664, var9 ^ 1946491335);
            case 185 -> a(348362665, var9 ^ 170727524);
            case 186 -> a(348362326, var9 ^ -92182549);
            case 187 -> a(348362327, var9 ^ -1255976074);
            case 188 -> a(348362324, var9 ^ -790459535);
            case 189 -> a(348362325, var9 ^ -1622823937);
            case 190 -> a(348362322, var9 ^ -1412032535);
            case 191 -> a(348362323, var9 ^ -675138344);
            case 192 -> a(348362320, var9 ^ -2135926405);
            case 193 -> a(348362321, var9 ^ 1566467684);
            case 194 -> a(348362334, var9 ^ -1183528772);
            case 195 -> a(348362335, var9 ^ -1287339081);
            case 196 -> a(348362332, var9 ^ 1683183365);
            case 197 -> a(348362333, var9 ^ 1210621398);
            case 198 -> a(348362330, var9 ^ 202850654);
            case 199 -> a(348362331, var9 ^ -1158777425);
            case 200 -> a(348362328, var9 ^ -1571091660);
            case 201 -> a(348362329, var9 ^ -125371335);
            case 202 -> a(348362310, var9 ^ -1449939480);
            case 203 -> a(348362311, var9 ^ 816668779);
            case 204 -> a(348362308, var9 ^ 729587108);
            case 205 -> a(348362309, var9 ^ 104048199);
            case 206 -> a(348362306, var9 ^ 1163394425);
            case 207 -> a(348362307, var9 ^ -1020967790);
            case 208 -> a(348362304, var9 ^ 1765977601);
            case 209 -> a(348362305, var9 ^ 1532578008);
            case 210 -> 2;
            case 211 -> a(348362318, var9 ^ -576989490);
            case 212 -> a(348362319, var9 ^ -1802009290);
            case 213 -> a(348362316, var9 ^ 1647922923);
            case 214 -> a(348362317, var9 ^ -462439539);
            case 215 -> a(348362314, var9 ^ 81950772);
            case 216 -> a(348362315, var9 ^ -913391795);
            case 217 -> a(348362312, var9 ^ 648913501);
            case 218 -> a(348362313, var9 ^ -1348042800);
            case 219 -> a(348362358, var9 ^ -1869146435);
            case 220 -> a(348362359, var9 ^ 1487381547);
            case 221 -> a(348362356, var9 ^ 910248634);
            case 222 -> a(348362357, var9 ^ 253803033);
            case 223 -> a(348362354, var9 ^ 422941510);
            case 224 -> a(348362355, var9 ^ -222278129);
            case 225 -> a(348362352, var9 ^ 1870235374);
            case 226 -> a(348362353, var9 ^ 1789886607);
            case 227 -> a(348362366, var9 ^ 1589073104);
            case 228 -> a(348362367, var9 ^ -1186645101);
            case 229 -> a(348362364, var9 ^ 642124901);
            case 230 -> a(348362365, var9 ^ -256265334);
            case 231 -> a(348362362, var9 ^ 1992731706);
            case 232 -> a(348362363, var9 ^ -184286421);
            case 233 -> a(348362360, var9 ^ 187446684);
            case 234 -> a(348362361, var9 ^ 357715377);
            case 235 -> a(348362342, var9 ^ 1695486332);
            case 236 -> a(348362343, var9 ^ 1573701818);
            case 237 -> a(348362340, var9 ^ -768076524);
            case 238 -> 5;
            case 239 -> a(348362341, var9 ^ 1718436768);
            case 240 -> a(348362338, var9 ^ -1025724513);
            case 241 -> a(348362339, var9 ^ 1349679745);
            case 242 -> a(348362336, var9 ^ 43719029);
            case 243 -> a(348362337, var9 ^ -1573441296);
            case 244 -> a(348362350, var9 ^ -666755098);
            case 245 -> a(348362351, var9 ^ 1262617025);
            case 246 -> a(348362348, var9 ^ 180796145);
            case 247 -> a(348362349, var9 ^ -1738986167);
            case 248 -> a(348362346, var9 ^ 966468104);
            case 249 -> a(348362347, var9 ^ 1025252726);
            case 250 -> a(348362344, var9 ^ 1975658759);
            case 251 -> a(348362345, var9 ^ -1264722222);
            case 252 -> a(348362262, var9 ^ 246146360);
            case 253 -> a(348362263, var9 ^ -2098225829);
            case 254 -> a(348362260, var9 ^ -2073094889);
            default -> a(348362261, var9 ^ 561747274);
         };
         int var5 = (var1 & a(348362258, var9 ^ 1182148028)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(348362259, var9 ^ -1615104298)) >>> a(348362256, var9 ^ 334602728)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(348362257, var9 ^ 503675877);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(348362270, var9 ^ -1961539782);
            }
         }

         aaa[var2] = new String(var3).intern();
      }

      return aaa[var2];
   }
}
