package nsc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class babbabb {
   private static final Integer[] aa;
   private static final Object[] abb;
   private static final double ab = 4.0;
   private static final int b;
   public static final double ba = 0.5;
   private static final int[] aab;
   private static final double bb = 4.0;
   private static final double a = 2.0;
   private static final long[] aaa;
   private static final String[] aba;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1744819837, 377785404 ^ 1596598867);
      if (aa[var3] == null) {
         aa[var3] = (int)(aaa[var3] ^ var1);
      }

      return aa[var3];
   }

   public static void ab(class_332 var0, bababba var1, boolean var2) {
   }

   private babbabb() {
   }

   private static boolean ba(double param0, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 6
      // 05: dload 0
      // 06: iload 6
      // 08: ifne 1d
      // 0b: ldc2_w -0.01
      // 0e: dcmpl
      // 0f: iflt 34
      // 12: goto 16
      // 15: athrow
      // 16: dload 0
      // 17: dload 2
      // 18: dadd
      // 19: goto 1d
      // 1c: athrow
      // 1d: dload 4
      // 1f: ldc2_w 0.01
      // 22: dadd
      // 23: dcmpg
      // 24: iload 6
      // 26: ifne 31
      // 29: ifgt 34
      // 2c: goto 30
      // 2f: athrow
      // 30: bipush 1
      // 31: goto 35
      // 34: bipush 0
      // 35: ireturn
   }

   static {
      int var18 = -1923710357;
      String[] var10000 = new String[4];
      int var12 = 0;
      int var11 = 0;
      String[] var10 = var10000;
      int var10001 = "\u0018ꥒ\u2e60ꥭ껮귫並껬⹏ꪎ⻆굲\u2e6e깅⻩\ua8db츦꼌湘ꮆ滑ꩂ칡ꥵ\ueef8\nⳟᡵⲀ飸⾎\uf83e⽉顁⽻壇\u0010\uf4b5댌\uf642玌\uf1bc퍂\uf2e3猹\uf3e1厺\uf1fdጒ\uf5ea玅\uf764鍜\n魾麫鬡Ḧ頯绠飨ẟ飚\ude19"
         .length();
      short var13 = 29073;
      int var9 = var10001;
      String var8 = "\u0018ꥒ\u2e60ꥭ껮귫並껬⹏ꪎ⻆굲\u2e6e깅⻩\ua8db츦꼌湘ꮆ滑ꩂ칡ꥵ\ueef8\nⳟᡵⲀ飸⾎\uf83e⽉顁⽻壇\u0010\uf4b5댌\uf642玌\uf1bc퍂\uf2e3猹\uf3e1厺\uf1fdጒ\uf5ea玅\uf764鍜\n魾麫鬡Ḧ頯绠飨ẟ飚\ude19";

      do {
         int var16 = 0;
         char var14 = var8.charAt(var12);
         char[] var15 = var8.substring(var12 + 1, var12 + 1 + var14).toCharArray();

         do {
            int var17 = var15[var16];

            var17 = (char)(switch (var16 % 5) {
               default -> 129;
               case 1 -> 199;
               case 2 -> 254;
               case 3 -> 69;
               case 4 -> 120;
            }) ^ var17;
            if (var16 % 2 == 0) {
               var15[var16] = (char)((var17 >>> 3 | var17 << 13) & 65535 ^ var13);
            } else {
               var15[var16] = (char)((var17 << 3 | var17 >>> 13) & 65535 ^ var13);
            }
         } while (++var16 < var15.length);

         var10[var11] = new String(var15);
         var11++;
         var12 = var12 + var14 + 1;
      } while (var12 < var9);

      aba = var10;
      abb = new Object[var10.length];
      byte var22 = 0;
      aab = new int[24];
      int var26 = 0;
      byte[] var10002 = "*\u0085M\u00020Öç\u0087\u001a\u0019\"Åë!\u0099\u008b\u0013¾ÚòÆ»K..0KêÇ¸°M¢©D¾ï\u0089âØ\u0012\u0088Çz\"ë¤+ÁÑ,\u0018];_¨6*¦Ö\u0091\f²\u0017\u0005.·_Ûàt½\u009b\u0010.O\u00941·ïU]\u0014Wî¤>#W\u0015\u00889D¨ö÷"
         .getBytes("ISO-8859-1");

      int var50;
      do {
         aab[var22] = ((var10002[var26] & 255) << 24 | (var10002[var26 + 1] & 255) << 16 | (var10002[var26 + 2] & 255) << 8 | var10002[var26 + 3] & 255)
            ^ 81051735;
         var22 += 1;
         var50 = var26 + 4;
         var26 += 4;
      } while (var50 < var10002.length);

      long var0 = 6616486245601089379L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4;
      int var5 = (var4 = bba(-305011351, 305342, (byte)-15)).length();
      byte var2 = 0;

      label66:
      while (true) {
         var26 = var2;
         var2 += 8;
         String var23 = var4.substring(var26, var2);
         var26 = -305011352;
         int var39 = -1223760014;
         byte var51 = 91;
         byte[] var7 = var23.getBytes("ISO-8859-1");
         long[] var24 = var6;
         var26 = var3++;
         long var40 = (var7[0] & 255L) << a(1744819832, var18 ^ 684077470)
            | (var7[1] & 255L) << a(1744819835, var18 ^ -1068682799)
            | (var7[2] & 255L) << a(1744819834, var18 ^ 700828431)
            | (var7[3] & 255L) << a(1744819829, var18 ^ 1288978427)
            | (var7[4] & 255L) << a(1744819828, var18 ^ 32807108)
            | (var7[5] & 255L) << a(1744819831, var18 ^ -51004051)
            | (var7[a(1744819830, var18 ^ -862527985)] & 255L) << a(1744819825, var18 ^ 799823409)
            | var7[a(1744819824, var18 ^ -1287248497)] & 255L;
         var51 = -1;

         while (true) {
            long var62 = var40 ^ var0;
            switch (var51) {
               case 0:
                  var24[var26] = var62;
                  if (var2 >= var5) {
                     aaa = var6;
                     aa = new Integer[5];
                     b = aa(a(1744819818, var18 ^ -1428841499), 356242105565054463L);
                     return;
                  }
                  break;
               default:
                  var24[var26] = var62;
                  if (var2 < var5) {
                     continue label66;
                  }

                  var5 = (var4 = bba(-305011349, 27507815, (byte)15)).length();
                  var2 = 0;
            }

            int var32 = var2;
            var2 += 8;
            String var25 = var4.substring(var32, var2);
            var32 = -305011350;
            int var42 = 1868681639;
            var51 = 120;
            var7 = var25.getBytes("ISO-8859-1");
            var24 = var6;
            var26 = var3++;
            var40 = (var7[0] & 255L) << a(1744819827, var18 ^ -665330579)
               | (var7[1] & 255L) << a(1744819826, var18 ^ 2138163237)
               | (var7[2] & 255L) << a(1744819821, var18 ^ -346829814)
               | (var7[3] & 255L) << a(1744819820, var18 ^ 899485665)
               | (var7[4] & 255L) << a(1744819823, var18 ^ 1970099272)
               | (var7[5] & 255L) << a(1744819822, var18 ^ 2051853793)
               | (var7[a(1744819817, var18 ^ -1155502484)] & 255L) << a(1744819816, var18 ^ 14238739)
               | var7[a(1744819819, var18 ^ -1184304635)] & 255L;
            var51 = 0;
         }
      }
   }

   private static String bba(int var0, int var1, byte var2) {
      int var7 = var0 ^ -305011351;
      char[] var6 = aba[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])abb[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         abb[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 64087;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ var5 ^ 29069 ^ var1 ^ var2 ^ var4 ^ var0);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   public static babbbaaa bb(double var0, double var2, double var4, double var6, double var8, double var10, List var12) {
      ArrayList var13 = new ArrayList(2);
      double var14 = abb(true, var0, var4, var8, var12, var13);
      double var16 = abb(false, var2, var6, var10, var12, var13);
      var14 = bab(var14, 0.0, Math.max(0.0, var8 - var4));
      var16 = bab(var16, 0.0, Math.max(0.0, var10 - var6));
      return new babbbaaa(var14, var16, var13);
   }

   public static List aaa(List param0, bababba param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/ArrayList
      // 03: dup
      // 04: aload 0
      // 05: invokeinterface java/util/List.size ()I 1
      // 0a: invokespecial java/util/ArrayList.<init> (I)V
      // 0d: astore 3
      // 0e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 11: aload 0
      // 12: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 17: astore 4
      // 19: istore 2
      // 1a: aload 4
      // 1c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 21: ifeq a0
      // 24: aload 4
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba
      // 2e: astore 5
      // 30: aload 5
      // 32: iload 2
      // 33: ifne 44
      // 36: aload 1
      // 37: if_acmpeq 9c
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 5
      // 40: goto 44
      // 43: athrow
      // 44: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.aaaaa ()D 1
      // 49: iload 2
      // 4a: ifne 61
      // 4d: dconst_0
      // 4e: dcmpl
      // 4f: ifle 9c
      // 52: goto 56
      // 55: athrow
      // 56: aload 5
      // 58: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.baab ()D 1
      // 5d: goto 61
      // 60: athrow
      // 61: dconst_0
      // 62: dcmpl
      // 63: iload 2
      // 64: ifne 9b
      // 67: ifle 9c
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 3
      // 6f: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaababa
      // 72: dup
      // 73: aload 5
      // 75: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.aabb ()D 1
      // 7a: aload 5
      // 7c: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.abb ()D 1
      // 81: aload 5
      // 83: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.aaaaa ()D 1
      // 88: aload 5
      // 8a: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.baab ()D 1
      // 8f: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaababa.<init> (DDDD)V
      // 92: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 97: goto 9b
      // 9a: athrow
      // 9b: pop
      // 9c: iload 2
      // 9d: ifeq 1a
      // a0: aload 3
      // a1: areturn
   }

   private static int a(int var0, int var1) {
      int var2 = aab[var0 ^ 1744819837] ^ var1 ^ var0;
      var2 ^= 27161;
      var2 ^= 38377;
      var2 += 28213;
      var2 ^= 37561;
      var2 -= 35157;
      return var2 ^ 25619;
   }

   public static void aab(class_332 param0, boolean param1, double param2, double param4, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 7
      // 005: aload 0
      // 006: ifnull 062
      // 009: dload 4
      // 00b: iload 7
      // 00d: ifne 022
      // 010: goto 014
      // 013: athrow
      // 014: dconst_0
      // 015: dcmpl
      // 016: ifle 062
      // 019: goto 01d
      // 01c: athrow
      // 01d: dload 2
      // 01e: goto 022
      // 021: athrow
      // 022: invokestatic java/lang/Double.isFinite (D)Z
      // 025: iload 7
      // 027: ifne 05f
      // 02a: ifeq 062
      // 02d: goto 031
      // 030: athrow
      // 031: iload 6
      // 033: ldc_w 1744819836
      // 036: ldc_w 1479565963
      // 039: ldc_w -197994448
      // 03c: ixor
      // 03d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabb.a (II)I
      // 040: ldc2_w 4784576685734752592
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabb.aa (IJ)I
      // 046: iushr
      // 047: ldc_w 1744819839
      // 04a: ldc_w 1479565963
      // 04d: ldc_w -553823452
      // 050: ixor
      // 051: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabb.a (II)I
      // 054: ldc2_w 221297095590946824
      // 057: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabb.aa (IJ)I
      // 05a: iand
      // 05b: goto 05f
      // 05e: athrow
      // 05f: ifgt 063
      // 062: return
      // 063: aload 0
      // 064: invokevirtual net/minecraft/class_332.method_51448 ()Lorg/joml/Matrix3x2fStack;
      // 067: astore 8
      // 069: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06c: astore 9
      // 06e: aload 9
      // 070: iload 7
      // 072: ifne 07e
      // 075: ifnull 084
      // 078: goto 07c
      // 07b: athrow
      // 07c: aload 9
      // 07e: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 081: ifnonnull 089
      // 084: dconst_1
      // 085: goto 096
      // 088: athrow
      // 089: dconst_1
      // 08a: aload 9
      // 08c: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 08f: invokevirtual net/minecraft/class_1041.method_4495 ()I
      // 092: i2d
      // 093: invokestatic java/lang/Math.max (DD)D
      // 096: dstore 10
      // 098: iload 1
      // 099: ifeq 0a5
      // 09c: aload 8
      // 09e: invokevirtual org/joml/Matrix3x2fStack.m00 ()F
      // 0a1: goto 0aa
      // 0a4: athrow
      // 0a5: aload 8
      // 0a7: invokevirtual org/joml/Matrix3x2fStack.m11 ()F
      // 0aa: f2d
      // 0ab: dload 10
      // 0ad: dmul
      // 0ae: dstore 12
      // 0b0: iload 1
      // 0b1: ifeq 0bd
      // 0b4: aload 8
      // 0b6: invokevirtual org/joml/Matrix3x2fStack.m20 ()F
      // 0b9: goto 0c2
      // 0bc: athrow
      // 0bd: aload 8
      // 0bf: invokevirtual org/joml/Matrix3x2fStack.m21 ()F
      // 0c2: f2d
      // 0c3: dload 10
      // 0c5: dmul
      // 0c6: dstore 14
      // 0c8: iload 7
      // 0ca: ifne 105
      // 0cd: dload 12
      // 0cf: dconst_0
      // 0d0: dcmpl
      // 0d1: ifle 102
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: dload 12
      // 0da: iload 7
      // 0dc: ifne 106
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: invokestatic java/lang/Double.isFinite (D)Z
      // 0e6: ifeq 102
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: dload 14
      // 0ef: iload 7
      // 0f1: ifne 116
      // 0f4: goto 0f8
      // 0f7: athrow
      // 0f8: invokestatic java/lang/Double.isFinite (D)Z
      // 0fb: ifne 108
      // 0fe: goto 102
      // 101: athrow
      // 102: dconst_1
      // 103: dstore 12
      // 105: dconst_0
      // 106: dstore 14
      // 108: dconst_1
      // 109: ldc2_w 0.5
      // 10c: dload 12
      // 10e: dmul
      // 10f: invokestatic java/lang/Math.round (D)J
      // 112: l2d
      // 113: invokestatic java/lang/Math.max (DD)D
      // 116: dstore 16
      // 118: dload 2
      // 119: dload 12
      // 11b: dmul
      // 11c: dload 14
      // 11e: dadd
      // 11f: dload 16
      // 121: ldc2_w 0.5
      // 124: dmul
      // 125: dsub
      // 126: invokestatic java/lang/Math.round (D)J
      // 129: l2d
      // 12a: dstore 18
      // 12c: dload 18
      // 12e: dload 14
      // 130: dsub
      // 131: dload 12
      // 133: ddiv
      // 134: dstore 20
      // 136: dload 16
      // 138: dload 12
      // 13a: ddiv
      // 13b: dstore 22
      // 13d: aload 8
      // 13f: iload 7
      // 141: ifne 180
      // 144: invokevirtual org/joml/Matrix3x2fStack.pushMatrix ()Lorg/joml/Matrix3x2fStack;
      // 147: pop
      // 148: iload 1
      // 149: ifeq 167
      // 14c: aload 8
      // 14e: dload 20
      // 150: d2f
      // 151: fconst_0
      // 152: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
      // 155: pop
      // 156: iload 7
      // 158: aload 8
      // 15a: dload 22
      // 15c: d2f
      // 15d: dload 4
      // 15f: d2f
      // 160: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
      // 163: pop
      // 164: ifeq 181
      // 167: aload 8
      // 169: fconst_0
      // 16a: dload 20
      // 16c: d2f
      // 16d: invokevirtual org/joml/Matrix3x2fStack.translate (FF)Lorg/joml/Matrix3x2f;
      // 170: pop
      // 171: aload 8
      // 173: dload 4
      // 175: d2f
      // 176: dload 22
      // 178: d2f
      // 179: invokevirtual org/joml/Matrix3x2fStack.scale (FF)Lorg/joml/Matrix3x2f;
      // 17c: goto 180
      // 17f: athrow
      // 180: pop
      // 181: aload 0
      // 182: bipush 0
      // 183: bipush 0
      // 184: bipush 1
      // 185: bipush 1
      // 186: iload 6
      // 188: invokevirtual net/minecraft/class_332.method_25294 (IIIII)V
      // 18b: aload 8
      // 18d: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
      // 190: pop
      // 191: goto 19f
      // 194: astore 24
      // 196: aload 8
      // 198: invokevirtual org/joml/Matrix3x2fStack.popMatrix ()Lorg/joml/Matrix3x2fStack;
      // 19b: pop
      // 19c: aload 24
      // 19e: athrow
      // 19f: return
   }

   private static boolean aba(bababba param0, double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 4.0
      // 03: aload 0
      // 04: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.aaaaa ()D 1
      // 09: invokestatic java/lang/Math.max (DD)D
      // 0c: dstore 6
      // 0e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 11: ldc2_w 4.0
      // 14: aload 0
      // 15: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.baab ()D 1
      // 1a: invokestatic java/lang/Math.max (DD)D
      // 1d: dstore 8
      // 1f: istore 5
      // 21: dload 1
      // 22: aload 0
      // 23: iload 5
      // 25: ifne 3b
      // 28: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.aabb ()D 1
      // 2d: dcmpl
      // 2e: iflt 87
      // 31: goto 35
      // 34: athrow
      // 35: dload 1
      // 36: aload 0
      // 37: goto 3b
      // 3a: athrow
      // 3b: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.aabb ()D 1
      // 40: iload 5
      // 42: ifne 5b
      // 45: dload 6
      // 47: dadd
      // 48: dcmpg
      // 49: ifgt 87
      // 4c: goto 50
      // 4f: athrow
      // 50: dload 3
      // 51: aload 0
      // 52: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.abb ()D 1
      // 57: goto 5b
      // 5a: athrow
      // 5b: iload 5
      // 5d: ifne 76
      // 60: dcmpl
      // 61: iflt 87
      // 64: goto 68
      // 67: athrow
      // 68: dload 3
      // 69: aload 0
      // 6a: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba.abb ()D 1
      // 6f: dload 8
      // 71: dadd
      // 72: goto 76
      // 75: athrow
      // 76: dcmpg
      // 77: iload 5
      // 79: ifne 84
      // 7c: ifgt 87
      // 7f: goto 83
      // 82: athrow
      // 83: bipush 1
      // 84: goto 88
      // 87: bipush 0
      // 88: ireturn
   }

   private static double abb(boolean param0, double param1, double param3, double param5, List param7, List param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc2_w 1.7976931348623157E308
      // 003: dstore 10
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: dconst_0
      // 009: dstore 12
      // 00b: bipush 3
      // 00c: newarray 7
      // 00e: dup
      // 00f: bipush 0
      // 010: dconst_0
      // 011: dastore
      // 012: dup
      // 013: bipush 1
      // 014: dload 3
      // 015: ldc2_w 0.5
      // 018: dmul
      // 019: dastore
      // 01a: dup
      // 01b: bipush 2
      // 01c: dload 3
      // 01d: dastore
      // 01e: astore 14
      // 020: ldc_w 1744819838
      // 023: ldc_w -838797742
      // 026: ldc_w -1175101708
      // 029: ixor
      // 02a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabb.a (II)I
      // 02d: ldc2_w 145632121733059897
      // 030: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabb.aa (IJ)I
      // 033: newarray 7
      // 035: dup
      // 036: bipush 0
      // 037: dconst_0
      // 038: dastore
      // 039: dup
      // 03a: bipush 1
      // 03b: ldc2_w 4.0
      // 03e: dastore
      // 03f: dup
      // 040: bipush 2
      // 041: dload 5
      // 043: ldc2_w 3.0
      // 046: ddiv
      // 047: dastore
      // 048: dup
      // 049: bipush 3
      // 04a: dload 5
      // 04c: ldc2_w 0.5
      // 04f: dmul
      // 050: dastore
      // 051: dup
      // 052: bipush 4
      // 053: dload 5
      // 055: ldc2_w 2.0
      // 058: dmul
      // 059: ldc2_w 3.0
      // 05c: ddiv
      // 05d: dastore
      // 05e: dup
      // 05f: bipush 5
      // 060: dload 5
      // 062: ldc2_w 4.0
      // 065: dsub
      // 066: dastore
      // 067: dup
      // 068: ldc_w 1744819833
      // 06b: ldc_w -838797742
      // 06e: ldc_w 1097487135
      // 071: ixor
      // 072: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabb.a (II)I
      // 075: ldc2_w 1463423326143927769
      // 078: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabb.aa (IJ)I
      // 07b: dload 5
      // 07d: dastore
      // 07e: astore 15
      // 080: istore 9
      // 082: aload 15
      // 084: astore 16
      // 086: aload 16
      // 088: arraylength
      // 089: istore 17
      // 08b: bipush 0
      // 08c: istore 18
      // 08e: iload 18
      // 090: iload 17
      // 092: if_icmpge 10d
      // 095: aload 16
      // 097: iload 18
      // 099: daload
      // 09a: dstore 19
      // 09c: aload 14
      // 09e: astore 21
      // 0a0: aload 21
      // 0a2: arraylength
      // 0a3: istore 22
      // 0a5: bipush 0
      // 0a6: istore 23
      // 0a8: iload 23
      // 0aa: iload 22
      // 0ac: if_icmpge 105
      // 0af: aload 21
      // 0b1: iload 23
      // 0b3: iload 9
      // 0b5: ifne 099
      // 0b8: daload
      // 0b9: dstore 24
      // 0bb: iload 9
      // 0bd: dload 19
      // 0bf: dload 1
      // 0c0: dload 24
      // 0c2: dadd
      // 0c3: dsub
      // 0c4: dstore 26
      // 0c6: ifne 100
      // 0c9: dload 26
      // 0cb: invokestatic java/lang/Math.abs (D)D
      // 0ce: dload 10
      // 0d0: invokestatic java/lang/Math.abs (D)D
      // 0d3: dcmpg
      // 0d4: ifge 0fd
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: dload 1
      // 0dc: iload 9
      // 0de: ifne 0fb
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: dload 26
      // 0e7: dadd
      // 0e8: dload 3
      // 0e9: dload 5
      // 0eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabb.ba (DDD)Z
      // 0ee: ifeq 0fd
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: dload 26
      // 0f7: dstore 10
      // 0f9: dload 19
      // 0fb: dstore 12
      // 0fd: iinc 23 1
      // 100: iload 9
      // 102: ifeq 0a8
      // 105: iinc 18 1
      // 108: iload 9
      // 10a: ifeq 08e
      // 10d: aload 7
      // 10f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 114: astore 16
      // 116: aload 16
      // 118: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11d: ifeq 221
      // 120: aload 16
      // 122: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 127: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaababa
      // 12a: astore 17
      // 12c: iload 9
      // 12e: ifne 24b
      // 131: iload 0
      // 132: ifeq 13e
      // 135: aload 17
      // 137: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaababa.b ()D
      // 13a: goto 143
      // 13d: athrow
      // 13e: aload 17
      // 140: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaababa.ab ()D
      // 143: dstore 18
      // 145: iload 0
      // 146: ifeq 152
      // 149: aload 17
      // 14b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaababa.a ()D
      // 14e: goto 157
      // 151: athrow
      // 152: aload 17
      // 154: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaababa.aa ()D
      // 157: dstore 20
      // 159: bipush 5
      // 15a: newarray 7
      // 15c: dup
      // 15d: bipush 0
      // 15e: dload 18
      // 160: dastore
      // 161: dup
      // 162: bipush 1
      // 163: dload 18
      // 165: dload 20
      // 167: ldc2_w 0.5
      // 16a: dmul
      // 16b: dadd
      // 16c: dastore
      // 16d: dup
      // 16e: bipush 2
      // 16f: dload 18
      // 171: dload 20
      // 173: dadd
      // 174: dastore
      // 175: dup
      // 176: bipush 3
      // 177: dload 18
      // 179: ldc2_w 2.0
      // 17c: dsub
      // 17d: dastore
      // 17e: dup
      // 17f: bipush 4
      // 180: dload 18
      // 182: dload 20
      // 184: dadd
      // 185: ldc2_w 2.0
      // 188: dadd
      // 189: dastore
      // 18a: astore 22
      // 18c: aload 22
      // 18e: astore 23
      // 190: aload 23
      // 192: arraylength
      // 193: istore 24
      // 195: bipush 0
      // 196: istore 25
      // 198: iload 25
      // 19a: iload 24
      // 19c: if_icmpge 21c
      // 19f: aload 23
      // 1a1: iload 25
      // 1a3: daload
      // 1a4: dstore 26
      // 1a6: aload 14
      // 1a8: astore 28
      // 1aa: aload 28
      // 1ac: iload 9
      // 1ae: ifne 127
      // 1b1: arraylength
      // 1b2: istore 29
      // 1b4: bipush 0
      // 1b5: istore 30
      // 1b7: iload 30
      // 1b9: iload 29
      // 1bb: if_icmpge 214
      // 1be: aload 28
      // 1c0: iload 30
      // 1c2: daload
      // 1c3: dstore 31
      // 1c5: dload 26
      // 1c7: iload 9
      // 1c9: ifne 22f
      // 1cc: dload 1
      // 1cd: dload 31
      // 1cf: dadd
      // 1d0: dsub
      // 1d1: dstore 33
      // 1d3: iload 9
      // 1d5: ifne 20f
      // 1d8: dload 33
      // 1da: invokestatic java/lang/Math.abs (D)D
      // 1dd: dload 10
      // 1df: invokestatic java/lang/Math.abs (D)D
      // 1e2: dcmpg
      // 1e3: ifge 20c
      // 1e6: goto 1ea
      // 1e9: athrow
      // 1ea: dload 1
      // 1eb: iload 9
      // 1ed: ifne 20a
      // 1f0: goto 1f4
      // 1f3: athrow
      // 1f4: dload 33
      // 1f6: dadd
      // 1f7: dload 3
      // 1f8: dload 5
      // 1fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbabb.ba (DDD)Z
      // 1fd: ifeq 20c
      // 200: goto 204
      // 203: athrow
      // 204: dload 33
      // 206: dstore 10
      // 208: dload 26
      // 20a: dstore 12
      // 20c: iinc 30 1
      // 20f: iload 9
      // 211: ifeq 1b7
      // 214: iinc 25 1
      // 217: iload 9
      // 219: ifeq 198
      // 21c: iload 9
      // 21e: ifeq 116
      // 221: dload 10
      // 223: iload 9
      // 225: ifne 24f
      // 228: invokestatic java/lang/Math.abs (D)D
      // 22b: goto 22f
      // 22e: athrow
      // 22f: ldc2_w 4.0
      // 232: dcmpl
      // 233: ifle 239
      // 236: dload 1
      // 237: dreturn
      // 238: athrow
      // 239: aload 8
      // 23b: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabb
      // 23e: dup
      // 23f: iload 0
      // 240: dload 12
      // 242: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaabb.<init> (ZD)V
      // 245: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 24a: pop
      // 24b: dload 1
      // 24c: dload 10
      // 24e: dadd
      // 24f: dreturn
   }

   public static List baa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: ifnull 1b
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 18: ifnonnull 20
      // 1b: invokestatic java/util/List.of ()Ljava/util/List;
      // 1e: areturn
      // 1f: athrow
      // 20: new java/util/ArrayList
      // 23: dup
      // 24: invokespecial java/util/ArrayList.<init> ()V
      // 27: astore 2
      // 28: aload 1
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.ababbba ()Ljava/util/List;
      // 2f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 34: astore 3
      // 35: aload 3
      // 36: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3b: ifeq 95
      // 3e: aload 3
      // 3f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 44: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababba
      // 47: astore 4
      // 49: aload 4
      // 4b: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa
      // 4e: iload 0
      // 4f: ifne 90
      // 52: ifeq 84
      // 55: goto 59
      // 58: athrow
      // 59: aload 4
      // 5b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa
      // 5e: astore 5
      // 60: aload 5
      // 62: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa.babbaab ()Z
      // 65: iload 0
      // 66: ifne 90
      // 69: ifne 84
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 5
      // 72: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa.abbbbbb ()Z
      // 75: iload 0
      // 76: ifne 90
      // 79: goto 7d
      // 7c: athrow
      // 7d: ifne 91
      // 80: goto 84
      // 83: athrow
      // 84: aload 2
      // 85: aload 4
      // 87: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8c: goto 90
      // 8f: athrow
      // 90: pop
      // 91: iload 0
      // 92: ifeq 35
      // 95: aload 2
      // 96: areturn
   }

   private static double bab(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static void b(class_332 var0, List var1, double var2, double var4, int var6) {
      int var10000 = aabbabbab.ab;
      Iterator var8 = var1.iterator();
      int var7 = var10000;

      while (var8.hasNext()) {
         abaaabb var9 = (abaaabb)var8.next();

         boolean var10001;
         double var10002;
         double var10003;
         label24: {
            try {
               var11 = var0;
               var10001 = var9.a();
               var10002 = var9.b();
               if (var9.a()) {
                  var10003 = var4;
                  break label24;
               }
            } catch (MatchException var10) {
               throw var10;
            }

            var10003 = var2;
         }

         aab(var11, var10001, var10002, var10003, var6);
         if (var7 != 0) {
            break;
         }
      }
   }
}
