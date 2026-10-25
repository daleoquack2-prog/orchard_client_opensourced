package nsc;

import com.google.gson.JsonObject;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
final class aabbaaaaa {
   private static final Object[] abab;
   private static final String[] abaa;
   private static final ababbbbaa aa;
   private static final int[] aabb;
   private static final ababbbbaa ab;
   private static volatile abbbaaba ba;
   private static final Map bb;
   private static final Map aaa;
   private static final long[] aab;
   private static final double aba = 9.0;
   private static final ababbbbaa b;
   private static final double abb = 11.0;
   private static final String[] a;
   private static volatile bbbbaabb baa;
   private static final ababbbbaa bab;
   private static final String[] bba;
   private static final ababbbbaa bbb;
   private static final int aaaa;
   private static final Integer[] aaab;
   private static final float aaba = 12.0F;

   private static int aa(bbbbaabb var0, String var1) {
      int var2 = baaabbaa.bba;

      try {
         if (var0 == null) {
            return -1;
         }
      } catch (MatchException var11) {
         throw var11;
      }

      double var3 = 0.0;

      String var10000;
      label59: {
         label58: {
            try {
               var10000 = var1;
               if (var2 != 0) {
                  break label59;
               }

               if (var1 == null) {
                  break label58;
               }
            } catch (MatchException var10) {
               throw var10;
            }

            var10000 = var1;
            break label59;
         }

         var10000 = "";
      }

      String var5 = var10000;
      int var6 = 0;

      while (true) {
         if (var6 < var5.length()) {
            var12 = var5.codePointAt(var6);
            if (var2 != 0) {
               break;
            }

            int var7 = var12;
            int var13 = var2;
            aabaababb var8 = aaa(var0, var7);

            label44: {
               label43: {
                  try {
                     if (var13 != 0) {
                        break label44;
                     }

                     if (var8 == null) {
                        break label43;
                     }
                  } catch (MatchException var9) {
                     throw var9;
                  }

                  var3 += var8.ab * 11.0;
               }

               var6 += Character.charCount(var7);
            }

            if (var2 == 0) {
               continue;
            }
         }

         var12 = (int)Math.ceil(var3);
         break;
      }

      return var12;
   }

   static boolean ab(
      ababbbbaa var0, class_332 var1, String var2, double var3, double var5, int var7, boolean var8, boolean var9
   ) {
      return bbb(bab(var0), var1, var2, var3, var5, var7, var8, var9);
   }

   private static void ba(
      bbbbaabb param0,
      class_332 param1,
      String param2,
      double param3,
      double param5,
      int param7,
      boolean param8,
      double param9,
      float param11
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 12
      // 005: aload 1
      // 006: ifnull 048
      // 009: aload 2
      // 00a: invokevirtual java/lang/String.isEmpty ()Z
      // 00d: iload 12
      // 00f: ifne 045
      // 012: goto 016
      // 015: athrow
      // 016: ifne 048
      // 019: goto 01d
      // 01c: athrow
      // 01d: iload 7
      // 01f: ldc 916052913
      // 021: ldc 1258971567
      // 023: ldc -1792345039
      // 025: ixor
      // 026: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 029: ldc2_w 773034712567609432
      // 02c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbba (IJ)I
      // 02f: iushr
      // 030: ldc 916052912
      // 032: ldc 1258971567
      // 034: ldc -1183571374
      // 036: ixor
      // 037: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 03a: ldc2_w 5019705969187208134
      // 03d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbba (IJ)I
      // 040: iand
      // 041: goto 045
      // 044: athrow
      // 045: ifgt 049
      // 048: return
      // 049: aload 1
      // 04a: aload 0
      // 04b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.bb Lnet/minecraft/class_2960;
      // 04e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.abab (Lnet/minecraft/class_332;Lnet/minecraft/class_2960;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababb;
      // 051: astore 13
      // 053: dload 3
      // 054: dstore 14
      // 056: dload 5
      // 058: ldc2_w 11.0
      // 05b: aload 0
      // 05c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.abb D
      // 05f: aload 0
      // 060: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.aab D
      // 063: aload 0
      // 064: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.aa D
      // 067: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababa.abab (DDDD)D
      // 06a: dadd
      // 06b: dstore 16
      // 06d: bipush 0
      // 06e: istore 18
      // 070: bipush 0
      // 071: istore 19
      // 073: iload 19
      // 075: aload 2
      // 076: invokevirtual java/lang/String.length ()I
      // 079: if_icmpge 1ee
      // 07c: aload 2
      // 07d: iload 19
      // 07f: invokevirtual java/lang/String.codePointAt (I)I
      // 082: istore 20
      // 084: iload 12
      // 086: aload 0
      // 087: iload 20
      // 089: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb;
      // 08c: astore 21
      // 08e: ifne 1e9
      // 091: aload 21
      // 093: ifnull 1dc
      // 096: goto 09a
      // 099: athrow
      // 09a: aload 21
      // 09c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.bb ()Z
      // 09f: iload 12
      // 0a1: ifne 0b1
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: ifeq 1cb
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: iload 8
      // 0b1: iload 12
      // 0b3: ifne 0f5
      // 0b6: ifeq 0f8
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: iload 7
      // 0bf: ldc 916052915
      // 0c1: ldc 1258971567
      // 0c3: ldc 924276538
      // 0c5: ixor
      // 0c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 0c9: ldc2_w 773034712567609432
      // 0cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbba (IJ)I
      // 0cf: iushr
      // 0d0: ldc 916052914
      // 0d2: ldc 1258971567
      // 0d4: ldc -1877436656
      // 0d6: ixor
      // 0d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 0da: ldc2_w 5019705969187208134
      // 0dd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbba (IJ)I
      // 0e0: iand
      // 0e1: dload 3
      // 0e2: invokestatic java/lang/Math.round (D)J
      // 0e5: l2i
      // 0e6: dload 5
      // 0e8: invokestatic java/lang/Math.round (D)J
      // 0eb: l2i
      // 0ec: iload 18
      // 0ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.ba (IIII)I
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: goto 0fa
      // 0f8: iload 7
      // 0fa: istore 22
      // 0fc: iload 12
      // 0fe: dload 14
      // 100: aload 21
      // 102: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.aba D
      // 105: ldc2_w 11.0
      // 108: dmul
      // 109: dadd
      // 10a: dstore 23
      // 10c: dload 16
      // 10e: aload 21
      // 110: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.abb D
      // 113: ldc2_w 11.0
      // 116: dmul
      // 117: dsub
      // 118: dstore 25
      // 11a: aload 21
      // 11c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.a D
      // 11f: aload 21
      // 121: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.aba D
      // 124: dsub
      // 125: ldc2_w 11.0
      // 128: dmul
      // 129: dstore 27
      // 12b: aload 21
      // 12d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.abb D
      // 130: aload 21
      // 132: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.b D
      // 135: dsub
      // 136: ldc2_w 11.0
      // 139: dmul
      // 13a: dstore 29
      // 13c: aload 21
      // 13e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.aab D
      // 141: aload 0
      // 142: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.aaa D
      // 145: ddiv
      // 146: d2f
      // 147: fstore 31
      // 149: dconst_1
      // 14a: aload 21
      // 14c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.ba D
      // 14f: aload 0
      // 150: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.a D
      // 153: ddiv
      // 154: dsub
      // 155: d2f
      // 156: fstore 32
      // 158: aload 21
      // 15a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.aaa D
      // 15d: aload 0
      // 15e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.aaa D
      // 161: ddiv
      // 162: d2f
      // 163: fstore 33
      // 165: dconst_1
      // 166: aload 21
      // 168: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.aa D
      // 16b: aload 0
      // 16c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.a D
      // 16f: ddiv
      // 170: dsub
      // 171: d2f
      // 172: fstore 34
      // 174: ifne 1a4
      // 177: fload 11
      // 179: fconst_0
      // 17a: fcmpl
      // 17b: ifle 1a9
      // 17e: goto 182
      // 181: athrow
      // 182: aload 1
      // 183: aload 13
      // 185: dload 23
      // 187: dload 25
      // 189: dload 27
      // 18b: dload 29
      // 18d: fload 31
      // 18f: fload 32
      // 191: fload 33
      // 193: fload 34
      // 195: iload 7
      // 197: aload 0
      // 198: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.aba F
      // 19b: fload 11
      // 19d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbab (Lnet/minecraft/class_332;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababb;DDDDFFFFIFF)V
      // 1a0: goto 1a4
      // 1a3: athrow
      // 1a4: iload 12
      // 1a6: ifeq 1cb
      // 1a9: aload 1
      // 1aa: aload 13
      // 1ac: dload 23
      // 1ae: dload 25
      // 1b0: dload 27
      // 1b2: dload 29
      // 1b4: fload 31
      // 1b6: fload 32
      // 1b8: fload 33
      // 1ba: fload 34
      // 1bc: iload 22
      // 1be: aload 0
      // 1bf: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.aba F
      // 1c2: fload 11
      // 1c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbb.bbab (Lnet/minecraft/class_332;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababb;DDDDFFFFIFF)V
      // 1c7: goto 1cb
      // 1ca: athrow
      // 1cb: dload 14
      // 1cd: aload 21
      // 1cf: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.ab D
      // 1d2: ldc2_w 11.0
      // 1d5: dmul
      // 1d6: dload 9
      // 1d8: dmul
      // 1d9: dadd
      // 1da: dstore 14
      // 1dc: iload 19
      // 1de: iload 20
      // 1e0: invokestatic java/lang/Character.charCount (I)I
      // 1e3: iadd
      // 1e4: istore 19
      // 1e6: iinc 18 1
      // 1e9: iload 12
      // 1eb: ifeq 073
      // 1ee: return
   }

   private static String bbbb(char var0, int var1, char var2) {
      int var3 = var0 ^ '\ue117';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 26301;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 30391;
         var10 -= 6255;
         var10 -= 31848;
         var10 += 56764;
         var10 += 13805;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static class_2960 bb(ababbbbaa var0, ababbbbaa var1) {
      return class_2960.method_60655(bab.abab(), ab.aab(var0).aab(var1).abab());
   }

   private static aabaababb aaa(bbbbaabb var0, int var1) {
      int var2 = baaabbaa.bba;

      try {
         if (var0 == null) {
            return null;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      int var10000;
      label48: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label48;
            }

            if (var1 < 0) {
               return var0.ba.getOrDefault(var1, var0.b);
            }
         } catch (MatchException var6) {
            throw var6;
         }

         var10000 = var1;
      }

      if (var10000 < bbba(a(916052895, 768841279 ^ 1662248794), 6258740627766407051L)) {
         aabaababb var3 = var0.ab[var1];

         try {
            if (var2 != 0) {
               return var3;
            }

            if (var3 != null) {
               return var3;
            }
         } catch (MatchException var5) {
            throw var5;
         }

         return var0.b;
      } else {
         return var0.ba.getOrDefault(var1, var0.b);
      }
   }

   static int aab(ababbbbaa var0, String var1) {
      return aa(bab(var0), var1);
   }

   static double[] aba(ababbbbaa param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // 07: astore 3
      // 08: istore 2
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifne 19
      // 0e: ifnonnull 18
      // 11: goto 15
      // 14: athrow
      // 15: aconst_null
      // 16: areturn
      // 17: athrow
      // 18: aload 3
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.baaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;)D
      // 1c: ldc2_w 11.0
      // 1f: aload 3
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.abb D
      // 23: aload 3
      // 24: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.aab D
      // 27: aload 3
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.aa D
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababa.abab (DDDD)D
      // 2e: dadd
      // 2f: dstore 4
      // 31: ldc2_w Infinity
      // 34: dstore 6
      // 36: ldc2_w -Infinity
      // 39: dstore 8
      // 3b: aload 1
      // 3c: iload 2
      // 3d: ifne 49
      // 40: ifnonnull 4c
      // 43: goto 47
      // 46: athrow
      // 47: ldc ""
      // 49: goto 4d
      // 4c: aload 1
      // 4d: astore 10
      // 4f: bipush 0
      // 50: istore 11
      // 52: iload 11
      // 54: aload 10
      // 56: invokevirtual java/lang/String.length ()I
      // 59: if_icmpge c6
      // 5c: aload 10
      // 5e: iload 11
      // 60: invokevirtual java/lang/String.codePointAt (I)I
      // 63: istore 12
      // 65: iload 2
      // 66: ifne e7
      // 69: aload 3
      // 6a: iload 12
      // 6c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb;
      // 6f: astore 13
      // 71: iload 2
      // 72: ifne c2
      // 75: aload 13
      // 77: ifnull b8
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 13
      // 80: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.bb ()Z
      // 83: iload 2
      // 84: ifne c0
      // 87: goto 8b
      // 8a: athrow
      // 8b: ifeq b8
      // 8e: goto 92
      // 91: athrow
      // 92: dload 6
      // 94: dload 4
      // 96: aload 13
      // 98: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.abb D
      // 9b: ldc2_w 11.0
      // 9e: dmul
      // 9f: dsub
      // a0: invokestatic java/lang/Math.min (DD)D
      // a3: dstore 6
      // a5: dload 8
      // a7: dload 4
      // a9: aload 13
      // ab: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.b D
      // ae: ldc2_w 11.0
      // b1: dmul
      // b2: dsub
      // b3: invokestatic java/lang/Math.max (DD)D
      // b6: dstore 8
      // b8: iload 11
      // ba: iload 12
      // bc: invokestatic java/lang/Character.charCount (I)I
      // bf: iadd
      // c0: istore 11
      // c2: iload 2
      // c3: ifeq 52
      // c6: dload 6
      // c8: invokestatic java/lang/Double.isFinite (D)Z
      // cb: iload 2
      // cc: ifne e8
      // cf: ifeq e7
      // d2: goto d6
      // d5: athrow
      // d6: bipush 2
      // d7: newarray 7
      // d9: dup
      // da: bipush 0
      // db: dload 6
      // dd: dastore
      // de: dup
      // df: bipush 1
      // e0: dload 8
      // e2: dastore
      // e3: goto f2
      // e6: athrow
      // e7: bipush 2
      // e8: newarray 7
      // ea: dup
      // eb: bipush 0
      // ec: dconst_0
      // ed: dastore
      // ee: dup
      // ef: bipush 1
      // f0: dconst_0
      // f1: dastore
      // f2: areturn
   }

   private static double abb(bbbbaabb var0, String var1) {
      int var2 = baaabbaa.bba;

      try {
         if (var0 == null) {
            return -1.0;
         }
      } catch (MatchException var11) {
         throw var11;
      }

      double var3 = 0.0;

      String var10000;
      label55: {
         label54: {
            try {
               var10000 = var1;
               if (var2 != 0) {
                  break label55;
               }

               if (var1 == null) {
                  break label54;
               }
            } catch (MatchException var10) {
               throw var10;
            }

            var10000 = var1;
            break label55;
         }

         var10000 = "";
      }

      String var5 = var10000;
      int var6 = 0;

      while (var6 < var5.length()) {
         int var7 = var5.codePointAt(var6);
         int var12 = var2;
         aabaababb var8 = aaa(var0, var7);

         label42: {
            label41: {
               try {
                  if (var12 != 0) {
                     break label42;
                  }

                  if (var8 == null) {
                     break label41;
                  }
               } catch (MatchException var9) {
                  throw var9;
               }

               var3 += var8.ab * 11.0;
            }

            var6 += Character.charCount(var7);
         }

         if (var2 != 0) {
            break;
         }
      }

      return var3;
   }

   private static int a(int var0, int var1) {
      int var2 = aabb[var0 ^ 916052913] ^ var1 ^ var0;
      var2 -= 16754;
      var2 ^= 14817;
      var2 ^= 48643;
      var2 += 27742;
      var2 -= 13388;
      return var2 - 61706;
   }

   private aabbaaaaa() {
   }

   static double baa() {
      bbbbaabb var0 = bba();

      try {
         if (var0 == null) {
            return -1.0;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return 9.0;
   }

   private static bbbbaabb bab(ababbbbaa param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 23
      // 15: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bb ()Z
      // 18: ifeq 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aconst_null
      // 20: areturn
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 26: lstore 2
      // 27: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aaa Ljava/util/Map;
      // 2a: dup
      // 2b: astore 4
      // 2d: monitorenter
      // 2e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aaa Ljava/util/Map;
      // 31: lload 2
      // 32: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 35: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb
      // 3d: astore 5
      // 3f: aload 5
      // 41: iload 1
      // 42: ifne 56
      // 45: ifnull 52
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 5
      // 4e: aload 4
      // 50: monitorexit
      // 51: areturn
      // 52: aload 0
      // 53: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // 56: astore 6
      // 58: iload 1
      // 59: ifne 86
      // 5c: aload 6
      // 5e: ifnonnull 77
      // 61: goto 65
      // 64: athrow
      // 65: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aaa Ljava/util/Map;
      // 68: lload 2
      // 69: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 6c: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 71: pop
      // 72: aconst_null
      // 73: aload 4
      // 75: monitorexit
      // 76: areturn
      // 77: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aaa Ljava/util/Map;
      // 7a: lload 2
      // 7b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 7e: aload 6
      // 80: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 85: pop
      // 86: aload 6
      // 88: aload 4
      // 8a: monitorexit
      // 8b: areturn
      // 8c: astore 7
      // 8e: aload 4
      // 90: monitorexit
      // 91: aload 7
      // 93: athrow
   }

   private static bbbbaabb bba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab.bbabb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 20
      // 0d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaba.aa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 10: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bb ()Z
      // 13: ifeq 1d
      // 16: goto 1a
      // 19: athrow
      // 1a: aconst_null
      // 1b: areturn
      // 1c: athrow
      // 1d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaba;
      // 20: aload 1
      // 21: if_acmpne 3a
      // 24: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // 27: iload 0
      // 28: ifne 39
      // 2b: goto 2f
      // 2e: athrow
      // 2f: ifnull 3a
      // 32: goto 36
      // 35: athrow
      // 36: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // 39: areturn
      // 3a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bb Ljava/util/Map;
      // 3d: dup
      // 3e: astore 2
      // 3f: monitorenter
      // 40: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bb Ljava/util/Map;
      // 43: aload 1
      // 44: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 49: checkcast java/lang/ref/WeakReference
      // 4c: astore 3
      // 4d: aload 3
      // 4e: iload 0
      // 4f: ifne 62
      // 52: ifnonnull 5e
      // 55: goto 59
      // 58: athrow
      // 59: aconst_null
      // 5a: goto 65
      // 5d: athrow
      // 5e: aload 3
      // 5f: invokevirtual java/lang/ref/WeakReference.get ()Ljava/lang/Object;
      // 62: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb
      // 65: astore 4
      // 67: aload 4
      // 69: iload 0
      // 6a: ifne 86
      // 6d: ifnull 82
      // 70: goto 74
      // 73: athrow
      // 74: aload 4
      // 76: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // 79: aload 1
      // 7a: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaba;
      // 7d: aload 4
      // 7f: aload 2
      // 80: monitorexit
      // 81: areturn
      // 82: aload 1
      // 83: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaba;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // 86: astore 5
      // 88: iload 0
      // 89: ifne cb
      // 8c: aload 5
      // 8e: ifnull b9
      // 91: goto 95
      // 94: athrow
      // 95: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bb Ljava/util/Map;
      // 98: aload 1
      // 99: new java/lang/ref/WeakReference
      // 9c: dup
      // 9d: aload 5
      // 9f: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // a2: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // a7: pop
      // a8: iload 0
      // a9: aload 5
      // ab: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // ae: aload 1
      // af: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaba;
      // b2: ifeq de
      // b5: goto b9
      // b8: athrow
      // b9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bb Ljava/util/Map;
      // bc: aload 1
      // bd: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // c2: pop
      // c3: iload 0
      // c4: ifne da
      // c7: goto cb
      // ca: athrow
      // cb: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaba;
      // ce: aload 1
      // cf: if_acmpne de
      // d2: aconst_null
      // d3: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // d6: goto da
      // d9: athrow
      // da: aconst_null
      // db: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaba;
      // de: aload 5
      // e0: aload 2
      // e1: monitorexit
      // e2: areturn
      // e3: astore 6
      // e5: aload 2
      // e6: monitorexit
      // e7: aload 6
      // e9: athrow
   }

   private static boolean bbb(
      bbbbaabb var0, class_332 var1, String var2, double var3, double var5, int var7, boolean var8, boolean var9
   ) {
      int var10 = baaabbaa.bba;

      try {
         if (var0 == null) {
            return false;
         }
      } catch (MatchException var13) {
         throw var13;
      }

      String var10000;
      label47: {
         label46: {
            try {
               var10000 = var2;
               if (var10 != 0) {
                  break label47;
               }

               if (var2 == null) {
                  break label46;
               }
            } catch (MatchException var15) {
               throw var15;
            }

            var10000 = var2;
            break label47;
         }

         var10000 = "";
      }

      String var11 = var10000;

      label36: {
         try {
            if (var10 != 0) {
               return true;
            }

            if (!var8) {
               break label36;
            }
         } catch (MatchException var14) {
            throw var14;
         }

         int var12 = (
               var7 >>> bbba(a(916052894, -168631164 ^ -1359149009), 8613307550373006966L) & bbba(a(916052865, -168631164 ^ -2009968096), 2622821613503898361L)
            )
            << bbba(a(916052864, -168631164 ^ -1095145508), 773034712567609432L);
         ba(var0, var1, var11, var3 + 1.0, var5 + 1.0 + baaa(var0), var12, false, 1.0, 0.0F);
      }

      ba(var0, var1, var11, var3, var5 + baaa(var0), var7, var9, 1.0, 0.0F);
      return true;
   }

   static double aaaa(ababbbbaa var0, String var1) {
      return abb(bab(var0), var1);
   }

   static void aaab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bb Ljava/util/Map;
      // 06: dup
      // 07: astore 1
      // 08: monitorenter
      // 09: istore 0
      // 0a: aconst_null
      // 0b: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // 0e: aconst_null
      // 0f: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaba;
      // 12: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bb Ljava/util/Map;
      // 15: invokeinterface java/util/Map.values ()Ljava/util/Collection; 1
      // 1a: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 1f: astore 2
      // 20: aload 2
      // 21: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 26: ifeq 4f
      // 29: aload 2
      // 2a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2f: checkcast java/lang/ref/WeakReference
      // 32: astore 3
      // 33: iload 0
      // 34: ifne 59
      // 37: aload 3
      // 38: iload 0
      // 39: ifne 48
      // 3c: goto 40
      // 3f: athrow
      // 40: ifnull 4b
      // 43: goto 47
      // 46: athrow
      // 47: aload 3
      // 48: invokevirtual java/lang/ref/WeakReference.clear ()V
      // 4b: iload 0
      // 4c: ifeq 20
      // 4f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bb Ljava/util/Map;
      // 52: invokeinterface java/util/Map.clear ()V 1
      // 57: aload 1
      // 58: monitorexit
      // 59: goto 63
      // 5c: astore 4
      // 5e: aload 1
      // 5f: monitorexit
      // 60: aload 4
      // 62: athrow
      // 63: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aaa Ljava/util/Map;
      // 66: dup
      // 67: astore 1
      // 68: monitorenter
      // 69: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aaa Ljava/util/Map;
      // 6c: invokeinterface java/util/Map.clear ()V 1
      // 71: aload 1
      // 72: monitorexit
      // 73: goto 7d
      // 76: astore 5
      // 78: aload 1
      // 79: monitorexit
      // 7a: aload 5
      // 7c: athrow
      // 7d: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var25 = -1304204136;
      int var18 = 0;
      int var10001 = "ƚ蛖汒硇శ艆\uec97蜬谺瀡ి禢届蟼籕脖粮筗䰵祦屪粼찾磑糂艒ు稼ⲩ苖汖耗찴篶粑竼밻砑谼篂᱀礜鲬符鲨臷\uecc9肆䲗脬곆笁\udcc4礲沾肬籓苖鱒絷갴藆\uec95穜谽硡\uec3a萂ⱀ経䲯蓖\udc55荧\uecca篦汨緼᰻笱尿窒벽硌岮细ﲯ蓇䳋砖걪蟜ⰸ翱ⰺ萢\udc42萌Წ纶\uecaa笗簳蔖걪萌쳇硁ﳇ萲\uec41臌첩螦粬籇ﳉ籆Ⲓ筬峅灁尹箢豇纜鱐縶籝茷\u0ccf綖㱬薌쳅穡\uecc0笲\udc43萜鲯篖㱑腗ᰶ蚆䱬緬簻箁峀荒豂蛜뱑艶屒筇\uec35臖벗罜볅羑밸窒Ჹ礼벩茦粬篗ᰳ簖㱨莼\uec39烱泃稢뱄緼㲫磆Ჯ翧谲筆겗筜\udcc3瀡泀蛂鱃祜\udca9禶Შ箇\u0ccf苦첐缼鰸翡ೀ簲챆繬粪磖粫筗尲蝖첔腼鰼蕑㰾竂豇蚜䲨蓦걖腗泍菖첔籌谸萑ﰸ笢\u1cbc竜ⱓ礆沫蕧泏糖鱫穜\uec3e藑簼硲벿稼ﲪ翖뱓緧氵绦ﲒ糼변蕡簾蔂\uecba瀌ಬ薦\ueca8藷㳌蟆\uec69艬᰽螑峋箢경络粬艖㲬苷簳篆粓竼糇码\uecc0笒汁砼ⱕ蘦籗羇鳎蓦貔篌鰼稁곅膂\uecbe蚌岮耶粯祗䰵箖뱭籼㳇纱尺苂鲾竬ⱕ笖ⱑ翧\uecca腆㲕脼ి蓡㳀粂㲽芬\uecab艖汓筗쳈蒖\uec95筜泃虑ⰸ砲ే篼ಬ耶䲬苗ೌ紆鱨禼ⰽ秡峄罒\uec41般籗笆岩菗್箖ﲒ烜ೇ穡糂箢벾蟜屔虖\uec52縇\u1ccc蒦粒礌簾罁곀茢䱆蓼㲫蜦\uecaa稧ⰳ籖겒羜尿臁곀腲Ⲿ窼㲨罦䲪荷㰷\u001d䡊ၢ呛ယ俺遞䷠샪圽탮䤞偩丐肁出ま䰋ယ俺聇俰\u20f6不䃶䴎끴䶠\u0087上0ゝ眖䇬ݱ㱍뜭㯗랄䞪柾㪙靿䞇⟠㰍霕㾬ꝲ㳽읗㻇蟸㱚⟸㲩蜂䆧➔䊽朗䈬䜉䏽읔䓇\uf781㨺ក㦙읺㲇럨䏍뜓䕌띱㿭✨\nﵑ䯐ﴰꮵ瑱鯪ﯻ\ueb40ﮆ歀\u0010溪ꁅ毫瀮溪ၥ欰ꃌ沭샋淞O盰\ue0a0歺ぇ\nᎆ尹Ꭷ籛ᘶఆᔬ㲬ᕑ벮"
         .length();
      String[] var17 = new String[6];
      int var16 = var10001;
      String var15 = "ƚ蛖汒硇శ艆\uec97蜬谺瀡ి禢届蟼籕脖粮筗䰵祦屪粼찾磑糂艒ు稼ⲩ苖汖耗찴篶粑竼밻砑谼篂᱀礜鲬符鲨臷\uecc9肆䲗脬곆笁\udcc4礲沾肬籓苖鱒絷갴藆\uec95穜谽硡\uec3a萂ⱀ経䲯蓖\udc55荧\uecca篦汨緼᰻笱尿窒벽硌岮细ﲯ蓇䳋砖걪蟜ⰸ翱ⰺ萢\udc42萌Წ纶\uecaa笗簳蔖걪萌쳇硁ﳇ萲\uec41臌첩螦粬籇ﳉ籆Ⲓ筬峅灁尹箢豇纜鱐縶籝茷\u0ccf綖㱬薌쳅穡\uecc0笲\udc43萜鲯篖㱑腗ᰶ蚆䱬緬簻箁峀荒豂蛜뱑艶屒筇\uec35臖벗罜볅羑밸窒Ჹ礼벩茦粬篗ᰳ簖㱨莼\uec39烱泃稢뱄緼㲫磆Ჯ翧谲筆겗筜\udcc3瀡泀蛂鱃祜\udca9禶Შ箇\u0ccf苦첐缼鰸翡ೀ簲챆繬粪磖粫筗尲蝖첔腼鰼蕑㰾竂豇蚜䲨蓦걖腗泍菖첔籌谸萑ﰸ笢\u1cbc竜ⱓ礆沫蕧泏糖鱫穜\uec3e藑簼硲벿稼ﲪ翖뱓緧氵绦ﲒ糼변蕡簾蔂\uecba瀌ಬ薦\ueca8藷㳌蟆\uec69艬᰽螑峋箢경络粬艖㲬苷簳篆粓竼糇码\uecc0笒汁砼ⱕ蘦籗羇鳎蓦貔篌鰼稁곅膂\uecbe蚌岮耶粯祗䰵箖뱭籼㳇纱尺苂鲾竬ⱕ笖ⱑ翧\uecca腆㲕脼ి蓡㳀粂㲽芬\uecab艖汓筗쳈蒖\uec95筜泃虑ⰸ砲ే篼ಬ耶䲬苗ೌ紆鱨禼ⰽ秡峄罒\uec41般籗笆岩菗್箖ﲒ烜ೇ穡糂箢벾蟜屔虖\uec52縇\u1ccc蒦粒礌簾罁곀茢䱆蓼㲫蜦\uecaa稧ⰳ籖겒羜尿臁곀腲Ⲿ窼㲨罦䲪荷㰷\u001d䡊ၢ呛ယ俺遞䷠샪圽탮䤞偩丐肁出ま䰋ယ俺聇俰\u20f6不䃶䴎끴䶠\u0087上0ゝ眖䇬ݱ㱍뜭㯗랄䞪柾㪙靿䞇⟠㰍霕㾬ꝲ㳽읗㻇蟸㱚⟸㲩蜂䆧➔䊽朗䈬䜉䏽읔䓇\uf781㨺ក㦙읺㲇럨䏍뜓䕌띱㿭✨\nﵑ䯐ﴰꮵ瑱鯪ﯻ\ueb40ﮆ歀\u0010溪ꁅ毫瀮溪ၥ欰ꃌ沭샋淞O盰\ue0a0歺ぇ\nᎆ尹Ꭷ籛ᘶఆᔬ㲬ᕑ벮";
      short var20 = 16506;
      int var19 = 0;

      do {
         char var21 = var15.charAt(var19);
         String var10000 = var15.substring(var19 + 1, var19 + 1 + var21);
         int var23 = 0;
         char[] var22 = var10000.toCharArray();

         do {
            int var24 = var22[var23];

            var24 = (char)(switch (var23 % 7) {
               default -> 186;
               case 1 -> 45;
               case 2 -> 187;
               case 3 -> 78;
               case 4 -> 58;
               case 5 -> 16;
               case 6 -> 208;
            }) ^ var24;
            if (var23 % 2 == 0) {
               var22[var23] = (char)((var24 >>> 4 | var24 << 12) & 65535 ^ var20);
            } else {
               var22[var23] = (char)((var24 << 4 | var24 >>> 12) & 65535 ^ var20);
            }
         } while (++var23 < var22.length);

         var17[var18] = new String(var22);
         var18++;
         var19 = var19 + var21 + 1;
      } while (var19 < var16);

      abaa = var17;
      abab = new Object[var17.length];
      byte var31 = 0;
      int var37 = 0;
      byte[] var10002 = "\u0090´\u00adì¼ê²á2\u0089\u0006å\u0095\u0086\u0007¡\u0087µ\u001bÓW§âg4Q¹Ï æ\u001cì\u0003<a\u009f#t¤ö«\u0007ùÎ\u0001»\u0090\u0081Öo\u0090Ò§\u001ec.Ü\\oîé#\u0085\u00ad¿àj¥ºWÈ²\u0003'¹×)Ã]ÖÇfqÁ\u0013ò\u000fM\u0086\u009a\u0005Ãr?{p)1\u009a\u0019,\u001f`¹B\u009f\u0090\u001cEþ\u0005\u0093o4îàAN _\u0000\u001a¡÷æe\u000f¢\u0016Ä\u001dM$wSY\u0016ö\u0017àönW\u001ci²i\u0016\u0090õ±I\u008bCjh\\ÃÆ)}Oë\u0007¦Øcß¤¹VîÇ\u0095\u008fúoùñ\u001f\u009cÃÝO\u0000U7È\u0015\u009a\u009a®3UíF\u0005ß³\u001b¦ö\u0003\u0005¨£\u000f×Ðµ\u001f\u0013<÷+\u009b\u0010äý\u0084Æ«\u0080pé\u0081\r©`·¤6\u007f\u00834Y®\fäøLA\u0007\u0014\u008by\u0097ô\u0001fäcI`¸\u0085>T]ô}\u009dWk\u0085n\u008bbúRGí\u008a2\u0016Ù\u0091\u0011û\u0097\u0012ÑYár\u0092¿\u0081S3H§|\u0000çr°\u007fÔ-\u0004\u001c\u009eg \u0087*\u008b-Øa)åªI\u000fzï^(ú\u009b\u009d«k}\u009d@÷)è\u0011òaîM\u0016\u000b\u00ad¥Ty'7*\u008ezO\u0090êÉÂ\u000f\u008eù[|ÿñÇ\u0084±ßlôÎ\\\u000f\u0083£\u0081ãñ\r\u001añ7³ÒM\u0011ã¼)¦)<³\u0084\u0083ÙmO«ªR<\u0084/»´\u0019\u0001. Ü\u009cÒ$µ0Qðõ\u008f\u008aäoiÂ{\u001a\u0018\"w\u0005Uý\u0002I\u008dþlûaÏ\u009c\u001e5³\u008b@F÷Cmi£-\tÎ\u008eôhfï\u0092ºd¹\u001dãé{\u0080´)·3FÅæ\u0084\f#[í0h´\u008eV\"\u001b\u008c¥Ð\u0012\u0095RÌêÇQ\u009e-³\u0002Àø\u0013ÉpÔ©o\u0018cÅ\u001c\u0002À×TØ£\u001fé\f\u001dÕ|\u0090k\u0019ß¹\u00165cW\u008d\u001b¨n\u001e\u0019vÊì1¦\u0000\u0096\u0087l\u000bN\u008b\u0095o\u009b\u000bµ4±\u0097Û\u009c\u0092\u0097±:\\>åÌ.(a/âR\u0007ÅN|s\u0081¥½9\u0092\u00ad\u008eÜ3.\u0006ö{14\u0092\u0087kÅD{ÒªOþ\u0088S\r¢ já¸(\u0099®½\u001d\u000eº\u008eÆÆ)§s9&M>\u0084\u0092ÇkO¥O~kõ\u009e|\u0096\u009avtîk\u0097ëK\u008dÐV\u001a×þÜ¢w\u000b!`\u007f\u0017èô3û+çôùÉ³\u001e\u009e <\u0005U\u0014»¢g+NýD\u001d/³\u0086}\u008c]±\u008d\u009a*®\u008bö\u008aÀüöëï\u009b ù {ï\u0004T\u0087ÞÒ\u008a³6È\u0096\u0000Öx*\u0001\u0084\u0083`¾òüj>ËR\u0097ªq\u0095m@X\u0094¤\u009c$Öâì¹J\u0016\u001eËu\u0096ÿ]\u0017,]ÅºõEÖØ`\u009aen\u0088\u008a¤k\u0084\u009d¿0Ä\u009aªòQx®!w\u009c\u009f\u009cé8ñ\u008a\u0080V§r'Ã7\\M\u0091w#$ÌGÚS\u008e1&±Ü\u0097\u0002½?\u0093ä>¸ä\u001bé\u009a\u0091\u001a\u009fw$Ûmuì:pLy×\u009a0¯³\u0080\u0007Öé´-»q\tÄ\u00ad´P(úÛ\u009f\u009d\u0095á\u0005\u000fâ\u0097\u00adSNø\u0084\u0019q\u0093Ìýs\u008e\u008càö~\u0088¨\u0010û\rA.Re\u0003¹èL£\u0012\u0001\u0000K®w\u0096%[\u008aÛ gDm\u008bÐ·4\u0095¯¸?ÓXÍ\u0000\u008a\u0006Ô2Ìr\u0095\u001e\u0012#Ç®\r\u0099»À\u0087\u0099çÏCu.ÙWM{ûñçNñ:\u009f\u0005'%éL(¹±E³ìÑá'\u008bC¦âµJ£!8 Å\u0099D»£Ô\u009d\u0091H\u0086³K\u0090\u009cÖ3=)¡D¸ å0wj2pÌ\u0092#h\u0090\u0090_(]\u000fê\u0015\u0090'Ä%\u0010¤C\u0004y¢{\u001c\u0000zAÃV\u0018³\\ëÆZÍ \u0087\u0095\u008f.îº©2D;HëÓád°ý\u0084Ù\u0014K\u00899/\u0004@Që\u001dh\u0082\u00ad\u00110\u0099fIã\u008eë\u009a%Tåh²<AýjXg\u00958¦\u009c]yoü2\u0013O\u0098¶'åo+\u0014µÁEo\u0010\u0087\u00ad\u009f\u007f\u0002h\u0094\u0013\\\u0086\u0001v¾\u0081M\u0092íL\tºepµD¨]\u009e|h ¶2LH\u0093\u009d\u0088°\u0001\u0004\u0087¤Iñ9\u0006\u000b\u000fº¾en.\u008eRfa z\u0097\rÚ\u0017ýq¿±¬\u0012\u0013\u008d\u0088£ixß\u0097\u001aÌ\u009a`çQ²\u0016Äo\u0004\u0004*\u001fk\u000b\u0007\u0096±\u0098wa{ÎOV.ûl¶Ð\u0083å¶u\r;ûÔ;\n+Ó\u0001V\u00adÜtc<&=\u009c+º\u0083E©H\u0000Pj\u009d\u0084ÉBÉrhôÚw_Ý±\u0098\u009fj °ç:4?Z\u007fs\u001d\u001e¯~7ì¾{\u0097u\u009b,\r5±õ¨\u0095ràÏ¾\u0087\u0085`é\u0004\u001c.Y\u009d\u0014Ñþfóm\u00058\u0083uýB£z°2;§\u009aÅ\rH\u000bé\u0000`sR\u0004\u007fCXû¶òÑH_è\u0017\u0014\u0093\u0000ºÛ\u0086:4tómL_{\u0018\u001bñN<÷°¸ÛGjin9Tó\u0094\u008c\u0017$ªYðU\u0087\u0090~=\u0004¸\u000fl\u0082ó\u0005,iä\u0012Dåo\u009c\u0091?\u0000CÌrö7³¡åkL\u0094S¿Ï\u008caGA\u001atx¹îY"
         .getBytes("ISO-8859-1");
      aabb = new int[362];

      int var79;
      do {
         aabb[var31] = ((var10002[var37] & 255) << 24 | (var10002[var37 + 1] & 255) << 16 | (var10002[var37 + 2] & 255) << 8 | var10002[var37 + 3] & 255)
            ^ 2014139558;
         var31 += 1;
         var79 = var37 + 4;
         var37 += 4;
      } while (var79 < var10002.length);

      String[] var13 = new String[a(916052917, var25 ^ 2070050865)];
      int var11 = 0;
      String var10;
      int var12 = (var10 = bbbb('\ue117', var25 ^ 437196568, 'ῆ')).length();
      int var9 = a(916052916, var25 ^ -1418690127);
      int var28 = -1;

      label123:
      while (true) {
         String var32 = var10.substring(++var28, var28 + var9);
         var37 = (byte)-1;

         while (true) {
            label118: {
               char[] var42 = var32.toCharArray();
               var79 = var42.length;
               int var14 = 0;
               var62 = var42;
               var37 = var79;
               char[] var83;
               int var101;
               if (var79 <= 1) {
                  var83 = var42;
                  var101 = var14;
               } else {
                  var62 = var42;
                  var37 = var79;
                  if (var79 <= var14) {
                     break label118;
                  }

                  var83 = var42;
                  var101 = var14;
               }

               while (true) {
                  var83[var101] = (char)(var83[var101] ^ switch (var14 % a(916052921, var25 ^ -1375593)) {
                     case 0 -> a(916052920, var25 ^ -542914753);
                     case 1 -> a(916052923, var25 ^ 1473288750);
                     case 2 -> a(916052922, var25 ^ -43191469);
                     case 3 -> a(916052925, var25 ^ 716763925);
                     case 4 -> 5;
                     case 5 -> a(916052924, var25 ^ 1539899568);
                     default -> a(916052927, var25 ^ 545983490);
                  });
                  var14++;
                  if (var37 == 0) {
                     var101 = var37;
                     var83 = var62;
                  } else {
                     if (var37 <= var14) {
                        break;
                     }

                     var83 = var62;
                     var101 = var14;
                  }
               }
            }

            String var90 = new String(var62).intern();
            switch (var37) {
               case 0:
                  var13[var11++] = var90;
                  if ((var28 += var9) >= var12) {
                     bba = var13;
                     a = new String[a(916052918, var25 ^ -600735987)];
                     long var0 = 8624933594435872839L;
                     long[] var6 = new long[a(916052926, var25 ^ 368371321)];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = bbbb('\ue115', var25 ^ 140791798, '夺')).length();
                     byte var2 = 0;

                     label97:
                     while (true) {
                        int var49 = var2;
                        var2 += 8;
                        String var34 = var4.substring(var49, var2);
                        char var50 = '\ue114';
                        int var68 = var25 ^ 31226845;
                        char var91 = '谰';
                        byte[] var7 = var34.getBytes("ISO-8859-1");
                        long[] var35 = var6;
                        var49 = var3++;
                        long var69 = (var7[0] & 255L) << a(916052897, var25 ^ 1127680382)
                           | (var7[1] & 255L) << a(916052896, var25 ^ 1182837520)
                           | (var7[2] & 255L) << a(916052899, var25 ^ -992642)
                           | (var7[3] & 255L) << a(916052898, var25 ^ -720093658)
                           | (var7[4] & 255L) << a(916052901, var25 ^ 1001460286)
                           | (var7[5] & 255L) << a(916052900, var25 ^ -282760053)
                           | (var7[a(916052903, var25 ^ 2051892948)] & 255L) << a(916052902, var25 ^ -1897391940)
                           | var7[a(916052905, var25 ^ -706283263)] & 255L;
                        byte var92 = -1;

                        while (true) {
                           long var103 = var69 ^ var0;
                           switch (var92) {
                              case 0:
                                 var35[var49] = var103;
                                 if (var2 >= var5) {
                                    aab = var6;
                                    aaab = new Integer[a(916052883, var25 ^ -366906343)];
                                    aaaa = bbba(a(916052882, var25 ^ 179912622), 4208464899014274064L);
                                    bab = aabbaaaba.aaab(
                                       b(a(916052885, var25 ^ -1788569004), a(916052884, var25 ^ 1814275707))
                                    );
                                    ab = aabbaaaba.aaab(b(a(916052887, var25 ^ 2006292755), a(916052886, var25 ^ -1609221646)));
                                    b = aabbaaaba.aaab(b(a(916052889, var25 ^ -2120673213), a(916052888, var25 ^ 1510988296)));
                                    aa = aabbaaaba.aaab(b(a(916052891, var25 ^ 1483711896), a(916052890, var25 ^ 994181434)));
                                    bbb = aabbaaaba.aaab(
                                       b(a(916052893, var25 ^ -1825635740), a(916052892, var25 ^ 1612049752))
                                    );
                                    bb = new EnumMap<>(abbbaaba.class);
                                    aaa = new HashMap();
                                    return;
                                 }
                                 break;
                              default:
                                 var35[var49] = var103;
                                 if (var2 < var5) {
                                    continue label97;
                                 }

                                 var5 = (var4 = bbbb('\ue113', var25 ^ 1262763726, '࿐')).length();
                                 var2 = 0;
                           }

                           byte var52 = var2;
                           var2 += 8;
                           String var36 = var4.substring(var52, var2);
                           var50 = '\ue112';
                           int var71 = var25 ^ -85376612;
                           var91 = '\uf4fa';
                           var7 = var36.getBytes("ISO-8859-1");
                           var35 = var6;
                           var49 = var3++;
                           var69 = (var7[0] & 255L) << a(916052904, var25 ^ -792198293)
                              | (var7[1] & 255L) << a(916052907, var25 ^ -1102515275)
                              | (var7[2] & 255L) << a(916052906, var25 ^ -1188469197)
                              | (var7[3] & 255L) << a(916052909, var25 ^ -1813803745)
                              | (var7[4] & 255L) << a(916052908, var25 ^ -1114029143)
                              | (var7[5] & 255L) << a(916052911, var25 ^ -53624262)
                              | (var7[a(916052910, var25 ^ 447900860)] & 255L) << a(916052881, var25 ^ -367821130)
                              | var7[a(916052880, var25 ^ -660590472)] & 255L;
                           var92 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var28);
                  break;
               default:
                  var13[var11++] = var90;
                  if ((var28 += var9) < var12) {
                     var9 = var10.charAt(var28);
                     continue label123;
                  }

                  var12 = (var10 = bbbb('\ue116', var25 ^ -1422903977, '\ue98e')).length();
                  var9 = a(916052919, var25 ^ -930686438);
                  var28 = -1;
            }

            var32 = var10.substring(++var28, var28 + var9);
            var37 = (byte)0;
         }
      }
   }

   private static bbbbaabb aaba(ababbbbaa param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 522619008
      // 003: istore 34
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: aload 0
      // 009: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 00c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Lnet/minecraft/class_2960;
      // 00f: astore 2
      // 010: aload 0
      // 011: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 014: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Lnet/minecraft/class_2960;
      // 017: astore 3
      // 018: istore 1
      // 019: aconst_null
      // 01a: astore 4
      // 01c: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 01f: astore 5
      // 021: aload 5
      // 023: iload 1
      // 024: ifne 030
      // 027: ifnull 06a
      // 02a: goto 02e
      // 02d: athrow
      // 02e: aload 5
      // 030: iload 1
      // 031: ifne 051
      // 034: invokevirtual net/minecraft/class_310.method_1478 ()Lnet/minecraft/class_3300;
      // 037: ifnull 06a
      // 03a: goto 03e
      // 03d: athrow
      // 03e: aload 5
      // 040: invokevirtual net/minecraft/class_310.method_1478 ()Lnet/minecraft/class_3300;
      // 043: aload 2
      // 044: invokeinterface net/minecraft/class_3300.method_14486 (Lnet/minecraft/class_2960;)Ljava/util/Optional; 2
      // 049: aconst_null
      // 04a: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 04d: goto 051
      // 050: athrow
      // 051: checkcast net/minecraft/class_3298
      // 054: astore 6
      // 056: aload 6
      // 058: iload 1
      // 059: ifne 065
      // 05c: ifnull 06a
      // 05f: goto 063
      // 062: athrow
      // 063: aload 6
      // 065: invokevirtual net/minecraft/class_3298.method_14482 ()Ljava/io/InputStream;
      // 068: astore 4
      // 06a: goto 06f
      // 06d: astore 5
      // 06f: aload 4
      // 071: iload 1
      // 072: ifne 0f6
      // 075: ifnonnull 0f4
      // 078: goto 07c
      // 07b: athrow
      // 07c: ldc_w 916052867
      // 07f: iload 34
      // 081: ldc_w -146467769
      // 084: ixor
      // 085: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 088: ldc_w 916052866
      // 08b: iload 34
      // 08d: ldc_w -116297129
      // 090: ixor
      // 091: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 094: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 097: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 09a: aload 2
      // 09b: invokevirtual net/minecraft/class_2960.method_12836 ()Ljava/lang/String;
      // 09e: ldc_w 916052869
      // 0a1: iload 34
      // 0a3: ldc_w -2130311057
      // 0a6: ixor
      // 0a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 0aa: ldc_w 916052868
      // 0ad: iload 34
      // 0af: ldc_w 1833237090
      // 0b2: ixor
      // 0b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 0b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 0b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0bc: aload 2
      // 0bd: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 0c0: astore 33
      // 0c2: astore 32
      // 0c4: astore 31
      // 0c6: astore 30
      // 0c8: new java/lang/StringBuilder
      // 0cb: dup
      // 0cc: invokespecial java/lang/StringBuilder.<init> ()V
      // 0cf: aload 30
      // 0d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0d4: aload 31
      // 0d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0d9: aload 32
      // 0db: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0de: aload 33
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e6: astore 5
      // 0e8: ldc qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa
      // 0ea: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 0ed: aload 5
      // 0ef: invokevirtual java/lang/ClassLoader.getResourceAsStream (Ljava/lang/String;)Ljava/io/InputStream;
      // 0f2: astore 4
      // 0f4: aload 4
      // 0f6: ifnonnull 0fb
      // 0f9: aconst_null
      // 0fa: areturn
      // 0fb: new java/io/InputStreamReader
      // 0fe: dup
      // 0ff: aload 4
      // 101: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 104: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
      // 107: astore 5
      // 109: aload 5
      // 10b: invokestatic com/google/gson/JsonParser.parseReader (Ljava/io/Reader;)Lcom/google/gson/JsonElement;
      // 10e: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 111: astore 6
      // 113: aload 6
      // 115: ldc_w 916052871
      // 118: iload 34
      // 11a: ldc_w 1096280768
      // 11d: ixor
      // 11e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 121: ldc_w 916052870
      // 124: iload 34
      // 126: ldc_w -1759999734
      // 129: ixor
      // 12a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 12d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 130: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 133: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 136: astore 7
      // 138: aload 6
      // 13a: ldc_w 916052873
      // 13d: iload 34
      // 13f: ldc_w -1204675885
      // 142: ixor
      // 143: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 146: ldc_w 916052872
      // 149: iload 34
      // 14b: ldc_w 822473298
      // 14e: ixor
      // 14f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 152: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 155: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 158: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 15b: astore 8
      // 15d: aload 7
      // 15f: ldc_w 916052875
      // 162: iload 34
      // 164: ldc_w 774906646
      // 167: ixor
      // 168: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 16b: ldc_w 916052874
      // 16e: iload 34
      // 170: ldc_w -4307467
      // 173: ixor
      // 174: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 177: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 17a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 17d: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 180: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 183: dstore 9
      // 185: aload 7
      // 187: ldc_w 916052877
      // 18a: iload 34
      // 18c: ldc_w 502403505
      // 18f: ixor
      // 190: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 193: ldc_w 916052876
      // 196: iload 34
      // 198: ldc_w -624249661
      // 19b: ixor
      // 19c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 19f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 1a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1a5: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1a8: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 1ab: dstore 11
      // 1ad: aload 7
      // 1af: iload 1
      // 1b0: ifne 1d2
      // 1b3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 1b6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 1b9: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 1bc: ifeq 1d8
      // 1bf: goto 1c3
      // 1c2: athrow
      // 1c3: aload 7
      // 1c5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 1c8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 1cb: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1ce: goto 1d2
      // 1d1: athrow
      // 1d2: invokevirtual com/google/gson/JsonElement.getAsFloat ()F
      // 1d5: goto 1da
      // 1d8: ldc 12.0
      // 1da: fstore 13
      // 1dc: aload 8
      // 1de: ldc_w 916052879
      // 1e1: iload 34
      // 1e3: ldc_w 1356198675
      // 1e6: ixor
      // 1e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 1ea: ldc_w 916052878
      // 1ed: iload 34
      // 1ef: ldc_w 416515061
      // 1f2: ixor
      // 1f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 1f6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 1f9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1fc: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1ff: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 202: dstore 14
      // 204: aload 8
      // 206: ldc_w 916052977
      // 209: iload 34
      // 20b: ldc_w 1877428981
      // 20e: ixor
      // 20f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 212: ldc_w 916052976
      // 215: iload 34
      // 217: ldc_w 741244339
      // 21a: ixor
      // 21b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 21e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 221: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 224: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 227: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 22a: dstore 16
      // 22c: aload 8
      // 22e: ldc_w 916052979
      // 231: iload 34
      // 233: ldc_w -723674026
      // 236: ixor
      // 237: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 23a: ldc_w 916052978
      // 23d: iload 34
      // 23f: ldc_w -1411277719
      // 242: ixor
      // 243: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 246: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 249: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 24c: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 24f: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 252: dstore 18
      // 254: new java/util/HashMap
      // 257: dup
      // 258: invokespecial java/util/HashMap.<init> ()V
      // 25b: astore 20
      // 25d: aload 6
      // 25f: ldc_w 916052981
      // 262: iload 34
      // 264: ldc_w -612302384
      // 267: ixor
      // 268: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 26b: ldc_w 916052980
      // 26e: iload 34
      // 270: ldc_w -1063059006
      // 273: ixor
      // 274: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 277: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 27a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 27d: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 280: astore 21
      // 282: aload 21
      // 284: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 287: astore 22
      // 289: aload 22
      // 28b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 290: ifeq 3cc
      // 293: aload 22
      // 295: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 29a: checkcast com/google/gson/JsonElement
      // 29d: astore 23
      // 29f: aload 23
      // 2a1: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 2a4: astore 24
      // 2a6: aload 24
      // 2a8: ldc_w 916052983
      // 2ab: iload 34
      // 2ad: ldc_w 1130516199
      // 2b0: ixor
      // 2b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 2b4: ldc_w 916052982
      // 2b7: iload 34
      // 2b9: ldc_w 589384127
      // 2bc: ixor
      // 2bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 2c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 2c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2c6: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 2c9: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 2cc: iload 1
      // 2cd: ifne 3de
      // 2d0: istore 25
      // 2d2: aload 24
      // 2d4: ldc_w 916052985
      // 2d7: iload 34
      // 2d9: ldc_w 41967516
      // 2dc: ixor
      // 2dd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 2e0: ldc_w 916052984
      // 2e3: iload 34
      // 2e5: ldc_w 766720220
      // 2e8: ixor
      // 2e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 2ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 2ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2f2: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 2f5: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 2f8: dstore 26
      // 2fa: aload 24
      // 2fc: ldc_w 916052987
      // 2ff: iload 34
      // 301: ldc_w -506674463
      // 304: ixor
      // 305: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 308: ldc_w 916052986
      // 30b: iload 34
      // 30d: ldc_w 1437553794
      // 310: ixor
      // 311: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 314: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 317: iload 1
      // 318: ifne 34c
      // 31b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 31e: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 321: ifeq 352
      // 324: goto 328
      // 327: athrow
      // 328: aload 24
      // 32a: ldc_w 916052989
      // 32d: iload 34
      // 32f: ldc_w 1899248730
      // 332: ixor
      // 333: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 336: ldc_w 916052988
      // 339: iload 34
      // 33b: ldc_w 2087420563
      // 33e: ixor
      // 33f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 342: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 345: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 348: goto 34c
      // 34b: athrow
      // 34c: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 34f: goto 353
      // 352: aconst_null
      // 353: astore 28
      // 355: aload 24
      // 357: ldc_w 916052991
      // 35a: iload 34
      // 35c: ldc_w -1273405477
      // 35f: ixor
      // 360: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 363: ldc_w 916052990
      // 366: iload 34
      // 368: ldc_w 727578103
      // 36b: ixor
      // 36c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 36f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 372: iload 1
      // 373: ifne 3a7
      // 376: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 379: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 37c: ifeq 3ad
      // 37f: goto 383
      // 382: athrow
      // 383: aload 24
      // 385: ldc_w 916052961
      // 388: iload 34
      // 38a: ldc_w -1423406454
      // 38d: ixor
      // 38e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 391: ldc_w 916052960
      // 394: iload 34
      // 396: ldc_w 986615596
      // 399: ixor
      // 39a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 39d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.b (II)Ljava/lang/String;
      // 3a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 3a3: goto 3a7
      // 3a6: athrow
      // 3a7: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 3aa: goto 3ae
      // 3ad: aconst_null
      // 3ae: astore 29
      // 3b0: iload 1
      // 3b1: aload 20
      // 3b3: iload 25
      // 3b5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3b8: iload 25
      // 3ba: dload 26
      // 3bc: aload 28
      // 3be: aload 29
      // 3c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.abba (IDLcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb;
      // 3c3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3c8: pop
      // 3c9: ifeq 289
      // 3cc: ldc_w 916052963
      // 3cf: iload 34
      // 3d1: ldc_w -1499754021
      // 3d4: ixor
      // 3d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 3d8: ldc2_w 1308268617401809858
      // 3db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbba (IJ)I
      // 3de: anewarray 11
      // 3e1: astore 22
      // 3e3: aload 20
      // 3e5: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 3ea: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 3ef: astore 23
      // 3f1: aload 23
      // 3f3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f8: ifeq 451
      // 3fb: aload 23
      // 3fd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 402: checkcast java/util/Map$Entry
      // 405: astore 24
      // 407: aload 24
      // 409: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 40e: checkcast java/lang/Integer
      // 411: invokevirtual java/lang/Integer.intValue ()I
      // 414: istore 25
      // 416: iload 25
      // 418: iload 1
      // 419: ifne 425
      // 41c: iflt 44d
      // 41f: goto 423
      // 422: athrow
      // 423: iload 25
      // 425: ldc_w 916052962
      // 428: iload 34
      // 42a: ldc_w -1546510307
      // 42d: ixor
      // 42e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 431: ldc2_w 6258740627766407051
      // 434: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbba (IJ)I
      // 437: if_icmpge 44d
      // 43a: aload 22
      // 43c: iload 25
      // 43e: aload 24
      // 440: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 445: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb
      // 448: aastore
      // 449: goto 44d
      // 44c: athrow
      // 44d: iload 1
      // 44e: ifeq 3f1
      // 451: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb
      // 454: dup
      // 455: aload 3
      // 456: dload 9
      // 458: dload 11
      // 45a: fload 13
      // 45c: dload 14
      // 45e: dload 16
      // 460: dload 18
      // 462: aload 20
      // 464: aload 22
      // 466: aload 20
      // 468: ldc_w 916052965
      // 46b: iload 34
      // 46d: ldc_w 1203312826
      // 470: ixor
      // 471: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 474: ldc2_w 1440284783123432658
      // 477: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbba (IJ)I
      // 47a: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 47d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 482: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb
      // 485: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb.<init> (Lnet/minecraft/class_2960;DDFDDDLjava/util/Map;[Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb;)V
      // 488: astore 23
      // 48a: aload 5
      // 48c: invokevirtual java/io/InputStreamReader.close ()V
      // 48f: aload 23
      // 491: areturn
      // 492: astore 6
      // 494: aload 5
      // 496: invokevirtual java/io/InputStreamReader.close ()V
      // 499: goto 4a5
      // 49c: astore 7
      // 49e: aload 6
      // 4a0: aload 7
      // 4a2: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 4a5: aload 6
      // 4a7: athrow
      // 4a8: astore 4
      // 4aa: aconst_null
      // 4ab: areturn
   }

   static double aabb(String var0) {
      bbbbaabb var1 = bba();
      return abb(var1, var0);
   }

   static boolean abaa() {
      int var0 = baaabbaa.bba;

      try {
         boolean var10000 = ababbbaab.bbabb().aa().bb();
         if (var0 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return false;
   }

   static int abab(ababbbbaa var0, String var1, double var2) {
      int var10000 = baaabbaa.bba;
      bbbbaabb var5 = bab(var0);
      int var4 = var10000;

      try {
         if (var5 == null) {
            return -1;
         }
      } catch (MatchException var14) {
         throw var14;
      }

      double var6 = 0.0;

      label59: {
         label58: {
            try {
               var15 = var1;
               if (var4 != 0) {
                  break label59;
               }

               if (var1 == null) {
                  break label58;
               }
            } catch (MatchException var13) {
               throw var13;
            }

            var15 = var1;
            break label59;
         }

         var15 = "";
      }

      String var8 = var15;
      int var9 = 0;

      while (true) {
         if (var9 < var8.length()) {
            var10000 = var8.codePointAt(var9);
            if (var4 != 0) {
               break;
            }

            int var10 = var10000;
            var10000 = var4;
            aabaababb var11 = aaa(var5, var10);

            label44: {
               label43: {
                  try {
                     if (var10000 != 0) {
                        break label44;
                     }

                     if (var11 == null) {
                        break label43;
                     }
                  } catch (MatchException var12) {
                     throw var12;
                  }

                  var6 += var11.ab * 11.0 * var2;
               }

               var9 += Character.charCount(var10);
            }

            if (var4 == 0) {
               continue;
            }
         }

         var10000 = (int)Math.ceil(var6);
         break;
      }

      return var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static aabaababb abba(int var0, double var1, JsonObject var3, JsonObject var4) {
      int var6 = -104022710;
      int var5 = baaabbaa.bba;

      label30: {
         JsonObject var10000;
         label29: {
            try {
               var10000 = var3;
               if (var5 != 0) {
                  break label29;
               }

               if (var3 == null) {
                  break label30;
               }
            } catch (MatchException var9) {
               throw var9;
            }

            var10000 = var4;
         }

         try {
            if (var10000 != null) {
               return new aabaababb(
                  var0,
                  var1,
                  var3.get(aabbaaaba.abba(b(a(916052964, var6 ^ -484441040), a(916052967, var6 ^ -1646814829)))).getAsDouble(),
                  var3.get(aabbaaaba.abba(b(a(916052966, var6 ^ 666102467), a(916052969, var6 ^ -1193909607)))).getAsDouble(),
                  var3.get(aabbaaaba.abba(b(a(916052968, var6 ^ -878259433), a(916052971, var6 ^ 870843502)))).getAsDouble(),
                  var3.get(aabbaaaba.abba(b(a(916052970, var6 ^ 1134001879), a(916052973, var6 ^ 888919181)))).getAsDouble(),
                  var4.get(aabbaaaba.abba(b(a(916052972, var6 ^ 1179924989), a(916052975, var6 ^ -2132042277)))).getAsDouble(),
                  var4.get(aabbaaaba.abba(b(a(916052974, var6 ^ -1497718981), a(916052945, var6 ^ 292640382)))).getAsDouble(),
                  var4.get(aabbaaaba.abba(b(a(916052944, var6 ^ 869989305), a(916052947, var6 ^ -118314613)))).getAsDouble(),
                  var4.get(aabbaaaba.abba(b(a(916052946, var6 ^ -1948447387), a(916052949, var6 ^ 54610102)))).getAsDouble()
               );
            }
         } catch (MatchException var8) {
            throw var8;
         }
      }

      try {
         return new aabaababb(var0, var1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      } catch (MatchException var7) {
         throw var7;
      }
   }

   static double[] abbb(ababbbbaa param0, String param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // 07: astore 5
      // 09: istore 4
      // 0b: aload 5
      // 0d: ifnonnull 13
      // 10: aconst_null
      // 11: areturn
      // 12: athrow
      // 13: dconst_0
      // 14: dstore 6
      // 16: ldc2_w Infinity
      // 19: dstore 8
      // 1b: ldc2_w -Infinity
      // 1e: dstore 10
      // 20: aload 1
      // 21: iload 4
      // 23: ifne 2f
      // 26: ifnonnull 32
      // 29: goto 2d
      // 2c: athrow
      // 2d: ldc ""
      // 2f: goto 33
      // 32: aload 1
      // 33: astore 12
      // 35: bipush 0
      // 36: istore 13
      // 38: iload 13
      // 3a: aload 12
      // 3c: invokevirtual java/lang/String.length ()I
      // 3f: if_icmpge b8
      // 42: aload 12
      // 44: iload 13
      // 46: invokevirtual java/lang/String.codePointAt (I)I
      // 49: istore 14
      // 4b: iload 4
      // 4d: ifne da
      // 50: aload 5
      // 52: iload 14
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.aaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb;
      // 57: astore 15
      // 59: iload 4
      // 5b: ifne b3
      // 5e: aload 15
      // 60: ifnull a9
      // 63: goto 67
      // 66: athrow
      // 67: aload 15
      // 69: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.bb ()Z
      // 6c: ifeq 99
      // 6f: goto 73
      // 72: athrow
      // 73: dload 8
      // 75: dload 6
      // 77: aload 15
      // 79: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.aba D
      // 7c: ldc2_w 11.0
      // 7f: dmul
      // 80: dadd
      // 81: invokestatic java/lang/Math.min (DD)D
      // 84: dstore 8
      // 86: dload 10
      // 88: dload 6
      // 8a: aload 15
      // 8c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.a D
      // 8f: ldc2_w 11.0
      // 92: dmul
      // 93: dadd
      // 94: invokestatic java/lang/Math.max (DD)D
      // 97: dstore 10
      // 99: dload 6
      // 9b: aload 15
      // 9d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.ab D
      // a0: ldc2_w 11.0
      // a3: dmul
      // a4: dload 2
      // a5: dmul
      // a6: dadd
      // a7: dstore 6
      // a9: iload 13
      // ab: iload 14
      // ad: invokestatic java/lang/Character.charCount (I)I
      // b0: iadd
      // b1: istore 13
      // b3: iload 4
      // b5: ifeq 38
      // b8: dload 8
      // ba: invokestatic java/lang/Double.isFinite (D)Z
      // bd: iload 4
      // bf: ifne db
      // c2: ifeq da
      // c5: goto c9
      // c8: athrow
      // c9: bipush 2
      // ca: newarray 7
      // cc: dup
      // cd: bipush 0
      // ce: dload 8
      // d0: dastore
      // d1: dup
      // d2: bipush 1
      // d3: dload 10
      // d5: dastore
      // d6: goto e5
      // d9: athrow
      // da: bipush 2
      // db: newarray 7
      // dd: dup
      // de: bipush 0
      // df: dconst_0
      // e0: dastore
      // e1: dup
      // e2: bipush 1
      // e3: dconst_0
      // e4: dastore
      // e5: areturn
   }

   private static String b(int var0, int var1) {
      int var9 = -57209220;
      int var2 = (var0 ^ a(916052948, var9 ^ -1830941430)) & a(916052951, var9 ^ -1766379045);
      if (a[var2] == null) {
         char[] var3 = bba[var2].toCharArray();

         int var4 = switch (var3[0] & a(916052950, var9 ^ 1123447041)) {
            case 0 -> a(916052953, var9 ^ 1449945238);
            case 1 -> a(916052952, var9 ^ -921101964);
            case 2 -> a(916052955, var9 ^ -989440793);
            case 3 -> a(916052954, var9 ^ -1337298170);
            case 4 -> a(916052957, var9 ^ -554147691);
            case 5 -> a(916052956, var9 ^ 773704551);
            case 6 -> a(916052959, var9 ^ 960710614);
            case 7 -> a(916052958, var9 ^ -244422457);
            case 8 -> a(916052929, var9 ^ -1626722204);
            case 9 -> a(916052928, var9 ^ 1181444055);
            case 10 -> a(916052931, var9 ^ 549034573);
            case 11 -> a(916052930, var9 ^ -1344215021);
            case 12 -> a(916052933, var9 ^ 850908929);
            case 13 -> a(916052932, var9 ^ -2126134122);
            case 14 -> 0;
            case 15 -> a(916052935, var9 ^ 907009337);
            case 16 -> a(916052934, var9 ^ 1597216280);
            case 17 -> a(916052937, var9 ^ 1012212578);
            case 18 -> a(916052936, var9 ^ 1051078389);
            case 19 -> a(916052939, var9 ^ 659672480);
            case 20 -> a(916052938, var9 ^ 1968333037);
            case 21 -> a(916052941, var9 ^ 16858669);
            case 22 -> a(916052940, var9 ^ -1580568092);
            case 23 -> a(916052943, var9 ^ 460069187);
            case 24 -> a(916052942, var9 ^ 1998521298);
            case 25 -> a(916052785, var9 ^ 1700210226);
            case 26 -> a(916052784, var9 ^ -1377169977);
            case 27 -> a(916052787, var9 ^ 1736404500);
            case 28 -> a(916052786, var9 ^ -1411598170);
            case 29 -> a(916052789, var9 ^ -2023708214);
            case 30 -> a(916052788, var9 ^ -1448374158);
            case 31 -> a(916052791, var9 ^ -1418343664);
            case 32 -> a(916052790, var9 ^ -2086273379);
            case 33 -> a(916052793, var9 ^ 896469730);
            case 34 -> a(916052792, var9 ^ 966169039);
            case 35 -> a(916052795, var9 ^ -1179202923);
            case 36 -> a(916052794, var9 ^ 634938020);
            case 37 -> a(916052797, var9 ^ 632472637);
            case 38 -> a(916052796, var9 ^ -1931070892);
            case 39 -> a(916052799, var9 ^ -1704799794);
            case 40 -> a(916052798, var9 ^ -536593588);
            case 41 -> a(916052769, var9 ^ -831487895);
            case 42 -> a(916052768, var9 ^ 255487222);
            case 43 -> a(916052771, var9 ^ 1021260537);
            case 44 -> a(916052770, var9 ^ -1258978015);
            case 45 -> a(916052773, var9 ^ -2037286564);
            case 46 -> a(916052772, var9 ^ 2001173099);
            case 47 -> a(916052775, var9 ^ 407699285);
            case 48 -> a(916052774, var9 ^ -519134334);
            case 49 -> a(916052777, var9 ^ -656259537);
            case 50 -> a(916052776, var9 ^ 732775232);
            case 51 -> a(916052779, var9 ^ -1128697723);
            case 52 -> a(916052778, var9 ^ 1948952212);
            case 53 -> a(916052781, var9 ^ -1960463584);
            case 54 -> a(916052780, var9 ^ 915523321);
            case 55 -> a(916052783, var9 ^ -39432497);
            case 56 -> a(916052782, var9 ^ -638164945);
            case 57 -> a(916052753, var9 ^ 614037399);
            case 58 -> a(916052752, var9 ^ 1550358069);
            case 59 -> a(916052755, var9 ^ -108122574);
            case 60 -> a(916052754, var9 ^ -1462435971);
            case 61 -> a(916052757, var9 ^ 276100377);
            case 62 -> a(916052756, var9 ^ -763619794);
            case 63 -> a(916052759, var9 ^ 1177615015);
            case 64 -> a(916052758, var9 ^ 1442314317);
            case 65 -> a(916052761, var9 ^ 18718680);
            case 66 -> a(916052760, var9 ^ -1912165603);
            case 67 -> a(916052763, var9 ^ 161572518);
            case 68 -> a(916052762, var9 ^ -50444802);
            case 69 -> a(916052765, var9 ^ -1649379265);
            case 70 -> a(916052764, var9 ^ 1046392859);
            case 71 -> a(916052767, var9 ^ 673796343);
            case 72 -> a(916052766, var9 ^ 1149878567);
            case 73 -> a(916052737, var9 ^ 1156059564);
            case 74 -> a(916052736, var9 ^ -1829085627);
            case 75 -> a(916052739, var9 ^ 1560783507);
            case 76 -> a(916052738, var9 ^ 1825666069);
            case 77 -> a(916052741, var9 ^ -2067044300);
            case 78 -> a(916052740, var9 ^ 1685836805);
            case 79 -> a(916052743, var9 ^ 914383206);
            case 80 -> a(916052742, var9 ^ 1090481144);
            case 81 -> a(916052745, var9 ^ 2035390000);
            case 82 -> a(916052744, var9 ^ -1013551943);
            case 83 -> a(916052747, var9 ^ -359179536);
            case 84 -> a(916052746, var9 ^ -1764367505);
            case 85 -> a(916052749, var9 ^ 189392961);
            case 86 -> a(916052748, var9 ^ 2037815063);
            case 87 -> a(916052751, var9 ^ -283848076);
            case 88 -> a(916052750, var9 ^ 2008615730);
            case 89 -> a(916052849, var9 ^ 1692114581);
            case 90 -> a(916052848, var9 ^ -680687238);
            case 91 -> a(916052851, var9 ^ 375945947);
            case 92 -> a(916052850, var9 ^ 221461231);
            case 93 -> a(916052853, var9 ^ 418468060);
            case 94 -> a(916052852, var9 ^ 472025549);
            case 95 -> a(916052855, var9 ^ 765400922);
            case 96 -> a(916052854, var9 ^ 1133084203);
            case 97 -> a(916052857, var9 ^ 359782867);
            case 98 -> a(916052856, var9 ^ -2057352100);
            case 99 -> a(916052859, var9 ^ -987702644);
            case 100 -> a(916052858, var9 ^ -170283599);
            case 101 -> a(916052861, var9 ^ -2094682066);
            case 102 -> a(916052860, var9 ^ 620870803);
            case 103 -> a(916052863, var9 ^ 568836257);
            case 104 -> a(916052862, var9 ^ 1444419474);
            case 105 -> a(916052833, var9 ^ 588881546);
            case 106 -> a(916052832, var9 ^ -1764201325);
            case 107 -> a(916052835, var9 ^ 1580830252);
            case 108 -> a(916052834, var9 ^ -875259004);
            case 109 -> a(916052837, var9 ^ 498105865);
            case 110 -> a(916052836, var9 ^ 1693076203);
            case 111 -> a(916052839, var9 ^ 158529452);
            case 112 -> a(916052838, var9 ^ 532131410);
            case 113 -> a(916052841, var9 ^ 1222155876);
            case 114 -> a(916052840, var9 ^ 669186857);
            case 115 -> a(916052843, var9 ^ 1351920846);
            case 116 -> a(916052842, var9 ^ -50628013);
            case 117 -> a(916052845, var9 ^ -1013920397);
            case 118 -> a(916052844, var9 ^ -1047687840);
            case 119 -> a(916052847, var9 ^ 1149077880);
            case 120 -> a(916052846, var9 ^ -1560802054);
            case 121 -> a(916052817, var9 ^ -1672373429);
            case 122 -> a(916052816, var9 ^ 199970048);
            case 123 -> a(916052819, var9 ^ -1610481176);
            case 124 -> a(916052818, var9 ^ 477390854);
            case 125 -> a(916052821, var9 ^ -376841630);
            case 126 -> a(916052820, var9 ^ -716729441);
            case 127 -> 2;
            case 128 -> a(916052823, var9 ^ 1655977289);
            case 129 -> a(916052822, var9 ^ 498844126);
            case 130 -> a(916052825, var9 ^ -355597969);
            case 131 -> a(916052824, var9 ^ -1260925731);
            case 132 -> a(916052827, var9 ^ -1063854004);
            case 133 -> a(916052826, var9 ^ -1849380982);
            case 134 -> a(916052829, var9 ^ 733494974);
            case 135 -> a(916052828, var9 ^ 736415400);
            case 136 -> a(916052831, var9 ^ -953342189);
            case 137 -> a(916052830, var9 ^ -8848837);
            case 138 -> a(916052801, var9 ^ 1431113483);
            case 139 -> a(916052800, var9 ^ 755423569);
            case 140 -> a(916052803, var9 ^ 1531914595);
            case 141 -> a(916052802, var9 ^ 54939028);
            case 142 -> a(916052805, var9 ^ 1675811246);
            case 143 -> a(916052804, var9 ^ -240837380);
            case 144 -> a(916052807, var9 ^ -123674854);
            case 145 -> a(916052806, var9 ^ -1832491187);
            case 146 -> a(916052809, var9 ^ 161491662);
            case 147 -> a(916052808, var9 ^ 592148696);
            case 148 -> a(916052811, var9 ^ -107781412);
            case 149 -> a(916052810, var9 ^ -2126588009);
            case 150 -> a(916052813, var9 ^ -155475614);
            case 151 -> a(916052812, var9 ^ -2106299453);
            case 152 -> a(916052815, var9 ^ -1026593779);
            case 153 -> a(916052814, var9 ^ -627872255);
            case 154 -> a(916052657, var9 ^ -1705111593);
            case 155 -> a(916052656, var9 ^ -1483528251);
            case 156 -> a(916052659, var9 ^ -1760338972);
            case 157 -> a(916052658, var9 ^ -1233477088);
            case 158 -> a(916052661, var9 ^ -1375503753);
            case 159 -> a(916052660, var9 ^ 1901455183);
            case 160 -> a(916052663, var9 ^ -286734734);
            case 161 -> a(916052662, var9 ^ 2133030951);
            case 162 -> a(916052665, var9 ^ 1026363820);
            case 163 -> a(916052664, var9 ^ 456244097);
            case 164 -> a(916052667, var9 ^ -85404734);
            case 165 -> a(916052666, var9 ^ -692911472);
            case 166 -> a(916052669, var9 ^ 1796715671);
            case 167 -> a(916052668, var9 ^ -1959986267);
            case 168 -> a(916052671, var9 ^ -471276909);
            case 169 -> a(916052670, var9 ^ 816714089);
            case 170 -> a(916052641, var9 ^ 728058241);
            case 171 -> a(916052640, var9 ^ 1021863329);
            case 172 -> a(916052643, var9 ^ -421107462);
            case 173 -> a(916052642, var9 ^ -1908276548);
            case 174 -> a(916052645, var9 ^ -362517830);
            case 175 -> a(916052644, var9 ^ 345988369);
            case 176 -> 4;
            case 177 -> a(916052647, var9 ^ -570438242);
            case 178 -> a(916052646, var9 ^ -40154631);
            case 179 -> a(916052649, var9 ^ 1466750207);
            case 180 -> 1;
            case 181 -> a(916052648, var9 ^ 130172199);
            case 182 -> a(916052651, var9 ^ -1568386556);
            case 183 -> a(916052650, var9 ^ -855533732);
            case 184 -> a(916052653, var9 ^ -1587578623);
            case 185 -> a(916052652, var9 ^ -994213575);
            case 186 -> a(916052655, var9 ^ 552514539);
            case 187 -> a(916052654, var9 ^ 140931232);
            case 188 -> 3;
            case 189 -> a(916052625, var9 ^ -156541504);
            case 190 -> a(916052624, var9 ^ -831791222);
            case 191 -> a(916052627, var9 ^ -2142287643);
            case 192 -> a(916052626, var9 ^ 797683786);
            case 193 -> a(916052629, var9 ^ -1232839819);
            case 194 -> a(916052628, var9 ^ 1127938533);
            case 195 -> a(916052631, var9 ^ -1111932587);
            case 196 -> a(916052630, var9 ^ -601001511);
            case 197 -> a(916052633, var9 ^ -731766751);
            case 198 -> a(916052632, var9 ^ 621730388);
            case 199 -> a(916052635, var9 ^ 1332920240);
            case 200 -> a(916052634, var9 ^ 504435523);
            case 201 -> a(916052637, var9 ^ 983591181);
            case 202 -> a(916052636, var9 ^ 1838422695);
            case 203 -> a(916052639, var9 ^ 677635915);
            case 204 -> a(916052638, var9 ^ 1391519);
            case 205 -> a(916052609, var9 ^ -1241044393);
            case 206 -> a(916052608, var9 ^ -653785096);
            case 207 -> a(916052611, var9 ^ 60520252);
            case 208 -> a(916052610, var9 ^ -909266773);
            case 209 -> a(916052613, var9 ^ -1661440780);
            case 210 -> a(916052612, var9 ^ 1652562529);
            case 211 -> a(916052615, var9 ^ -955333510);
            case 212 -> a(916052614, var9 ^ 1714948690);
            case 213 -> a(916052617, var9 ^ 1627564315);
            case 214 -> a(916052616, var9 ^ 1853317961);
            case 215 -> a(916052619, var9 ^ -1807850525);
            case 216 -> a(916052618, var9 ^ 142624240);
            case 217 -> a(916052621, var9 ^ -100446190);
            case 218 -> a(916052620, var9 ^ 797427978);
            case 219 -> a(916052623, var9 ^ 2071042010);
            case 220 -> a(916052622, var9 ^ 1752457109);
            case 221 -> a(916052721, var9 ^ 60530497);
            case 222 -> a(916052720, var9 ^ 313780083);
            case 223 -> a(916052723, var9 ^ -2042865042);
            case 224 -> a(916052722, var9 ^ -1054990682);
            case 225 -> a(916052725, var9 ^ -869002427);
            case 226 -> a(916052724, var9 ^ -913017433);
            case 227 -> a(916052727, var9 ^ -1643197842);
            case 228 -> a(916052726, var9 ^ 1202416317);
            case 229 -> a(916052729, var9 ^ 1389117715);
            case 230 -> a(916052728, var9 ^ 929240737);
            case 231 -> a(916052731, var9 ^ -1372740063);
            case 232 -> a(916052730, var9 ^ -1496186448);
            case 233 -> a(916052733, var9 ^ 1097729315);
            case 234 -> a(916052732, var9 ^ 829817495);
            case 235 -> a(916052735, var9 ^ 293187711);
            case 236 -> a(916052734, var9 ^ -1985701235);
            case 237 -> a(916052705, var9 ^ -1085541375);
            case 238 -> 5;
            case 239 -> a(916052704, var9 ^ -1302105334);
            case 240 -> a(916052707, var9 ^ -1233339167);
            case 241 -> a(916052706, var9 ^ 1236602130);
            case 242 -> a(916052709, var9 ^ -94627868);
            case 243 -> a(916052708, var9 ^ -1500446927);
            case 244 -> a(916052711, var9 ^ 1770338936);
            case 245 -> a(916052710, var9 ^ -957321950);
            case 246 -> a(916052713, var9 ^ -310843558);
            case 247 -> a(916052712, var9 ^ 1129169665);
            case 248 -> a(916052715, var9 ^ 45819053);
            case 249 -> a(916052714, var9 ^ -664113657);
            case 250 -> a(916052717, var9 ^ -420441036);
            case 251 -> a(916052716, var9 ^ -1524148851);
            case 252 -> a(916052719, var9 ^ 1112967080);
            case 253 -> a(916052718, var9 ^ -868350777);
            case 254 -> a(916052689, var9 ^ -1116766852);
            default -> a(916052688, var9 ^ -1221618030);
         };
         int var5 = (var1 & a(916052691, var9 ^ -1605952799)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(916052690, var9 ^ 781401999)) >>> a(916052693, var9 ^ -238062931)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(916052692, var9 ^ -2052039060);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(916052695, var9 ^ -649106471);
            }
         }

         a[var2] = new String(var3).intern();
      }

      return a[var2];
   }

   private static double baaa(bbbbaabb var0) {
      double var1 = aaababa.aab(11.0, var0.abb, var0.aab, var0.aa);
      return (9.0 - var1) * 0.5;
   }

   static boolean baab(class_332 var0, String var1, double var2, double var4, int var6, boolean var7, boolean var8) {
      bbbbaabb var9 = bba();
      return bbb(var9, var0, var1, var2, var4, var6, var7, var8);
   }

   static int baba(String var0) {
      bbbbaabb var1 = bba();
      return aa(var1, var0);
   }

   static boolean babb(
      ababbbbaa param0,
      class_332 param1,
      String param2,
      double param3,
      double param5,
      int param7,
      double param8,
      float param10
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 11
      // 05: iload 7
      // 07: ldc_w 916052694
      // 0a: ldc_w 770719578
      // 0d: ldc_w -592739794
      // 10: ixor
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 14: ldc2_w 773034712567609432
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbba (IJ)I
      // 1a: iushr
      // 1b: iload 11
      // 1d: ifne 50
      // 20: ldc_w 916052697
      // 23: ldc_w 770719578
      // 26: ldc_w 606459227
      // 29: ixor
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.a (II)I
      // 2d: ldc2_w 5019705969187208134
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bbba (IJ)I
      // 33: iand
      // 34: ifle 4f
      // 37: goto 3b
      // 3a: athrow
      // 3b: fload 10
      // 3d: fconst_0
      // 3e: fcmpg
      // 3f: iload 11
      // 41: ifne 50
      // 44: goto 48
      // 47: athrow
      // 48: ifgt 51
      // 4b: goto 4f
      // 4e: athrow
      // 4f: bipush 0
      // 50: ireturn
      // 51: aload 0
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.bab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;
      // 55: astore 12
      // 57: aload 12
      // 59: ifnonnull 5f
      // 5c: bipush 0
      // 5d: ireturn
      // 5e: athrow
      // 5f: aload 2
      // 60: iload 11
      // 62: ifne 6e
      // 65: ifnonnull 71
      // 68: goto 6c
      // 6b: athrow
      // 6c: ldc ""
      // 6e: goto 72
      // 71: aload 2
      // 72: astore 13
      // 74: aload 12
      // 76: aload 1
      // 77: aload 13
      // 79: dload 3
      // 7a: dload 5
      // 7c: aload 12
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.baaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;)D
      // 81: dadd
      // 82: iload 7
      // 84: bipush 0
      // 85: dload 8
      // 87: fload 10
      // 89: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaaa.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaabb;Lnet/minecraft/class_332;Ljava/lang/String;DDIZDF)V
      // 8c: bipush 1
      // 8d: ireturn
   }

   static boolean bbaa(
      ababbbbaa var0, class_332 var1, String var2, double var3, double var5, int var7, double var8, boolean var10, float var11
   ) {
      int var10000 = baaabbaa.bba;
      bbbbaabb var13 = bab(var0);
      int var12 = var10000;

      try {
         if (var13 == null) {
            return false;
         }
      } catch (MatchException var15) {
         throw var15;
      }

      label29: {
         label28: {
            try {
               var17 = var2;
               if (var12 != 0) {
                  break label29;
               }

               if (var2 == null) {
                  break label28;
               }
            } catch (MatchException var16) {
               throw var16;
            }

            var17 = var2;
            break label29;
         }

         var17 = "";
      }

      String var14 = var17;
      ba(var13, var1, var14, var3, var5 + baaa(var13), var7, var10, var8, -var11);
      return true;
   }

   private static bbbbaabb bbab(abbbaaba var0) {
      return aaba(var0.aa());
   }

   private static int bbba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(916052696, 1824918798 ^ 1525406306);
      if (aaab[var3] == null) {
         aaab[var3] = (int)(aab[var3] ^ var1);
      }

      return aaab[var3];
   }
}
