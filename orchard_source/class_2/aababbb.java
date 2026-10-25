package nsc;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
public final class aababbb extends abbaabbaa {
   private static final int[] baaa;
   private final baabaab aa;
   private final bababa ab;
   private static final Long[] ba;
   private final abbaaaaa bb;
   private static final String[] aaa;
   private static final long[] aab;
   private final aaabbbab aba;
   private static final String[] baab;
   private final bababa abb;
   private int baa;
   private long bab;
   private final baabaab bba;
   private int bbb;
   private static final String[] aaaa;
   private final aaabbbab aaab;
   private static final Integer[] aaba;
   private static final Object[] baba;
   private final baabaab aabb;
   private final ababbbbba abaa;
   private final abbaaaaa abab;
   private long abba;
   private static final long[] abbb;

   private aaabab aa(class_310 var1, class_1657 var2) {
      aaabab var4 = null;
      int var3 = aabbabbab.ab;
      double var5 = -1.0;
      Iterator var7 = this.aaaab(var2).iterator();

      aaabab var10000;
      while (true) {
         if (var7.hasNext()) {
            class_2338 var8 = (class_2338)var7.next();
            var10000 = this.aaaaa(var1, var8);
            if (var3 != 0) {
               break;
            }

            aaabab var9 = var10000;

            try {
               if (var9 == null) {
                  continue;
               }
            } catch (MatchException var12) {
               throw var12;
            }

            double var10 = this.baaa(var2, var8);

            label39: {
               label38: {
                  try {
                     if (var3 != 0) {
                        break label38;
                     }

                     if (!(var10 > var5)) {
                        break label39;
                     }
                  } catch (MatchException var13) {
                     throw var13;
                  }

                  var4 = var9;
               }

               var5 = var10;
            }

            if (var3 == 0) {
               continue;
            }
         }

         var10000 = var4;
         break;
      }

      return var10000;
   }

   private boolean ab(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual net/minecraft/class_1657.method_24828 ()Z
      // 17: iload 2
      // 18: ifne 73
      // 1b: ifne 6e
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: invokevirtual net/minecraft/class_1657.method_6101 ()Z
      // 26: iload 2
      // 27: ifne 73
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifne 6e
      // 31: goto 35
      // 34: athrow
      // 35: aload 1
      // 36: invokevirtual net/minecraft/class_1657.method_5799 ()Z
      // 39: iload 2
      // 3a: ifne 73
      // 3d: goto 41
      // 40: athrow
      // 41: ifne 6e
      // 44: goto 48
      // 47: athrow
      // 48: aload 1
      // 49: invokevirtual net/minecraft/class_1657.method_5771 ()Z
      // 4c: iload 2
      // 4d: ifne 73
      // 50: goto 54
      // 53: athrow
      // 54: ifne 6e
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 1
      // 5c: iload 2
      // 5d: ifne 75
      // 60: goto 64
      // 63: athrow
      // 64: invokevirtual net/minecraft/class_1657.method_6128 ()Z
      // 67: ifeq 74
      // 6a: goto 6e
      // 6d: athrow
      // 6e: bipush 0
      // 6f: goto 73
      // 72: athrow
      // 73: ireturn
      // 74: aload 1
      // 75: getfield net/minecraft/class_1657.field_6017 D
      // 78: dconst_0
      // 79: dcmpl
      // 7a: iload 2
      // 7b: ifne a0
      // 7e: ifgt 9f
      // 81: goto 85
      // 84: athrow
      // 85: aload 1
      // 86: invokevirtual net/minecraft/class_1657.method_18798 ()Lnet/minecraft/class_243;
      // 89: getfield net/minecraft/class_243.field_1351 D
      // 8c: ldc2_w -0.05
      // 8f: dcmpg
      // 90: iload 2
      // 91: ifne a0
      // 94: goto 98
      // 97: athrow
      // 98: ifge a3
      // 9b: goto 9f
      // 9e: athrow
      // 9f: bipush 1
      // a0: goto a4
      // a3: bipush 0
      // a4: ireturn
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
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 2
      // 007: istore 1
      // 008: aload 0
      // 009: aload 2
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bbb (Lnet/minecraft/class_310;)Z
      // 00d: iload 1
      // 00e: ifne 01c
      // 011: ifne 019
      // 014: goto 018
      // 017: athrow
      // 018: return
      // 019: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbbaba ()Z
      // 01c: iload 1
      // 01d: ifne 02a
      // 020: ifne 02d
      // 023: goto 027
      // 026: athrow
      // 027: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaaaba ()Z
      // 02a: ifeq 02e
      // 02d: return
      // 02e: aload 0
      // 02f: aload 2
      // 030: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abaa (Lnet/minecraft/class_310;)Lnet/minecraft/class_1657;
      // 033: astore 3
      // 034: iload 1
      // 035: aload 0
      // 036: aload 2
      // 037: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bab (Lnet/minecraft/class_310;)I
      // 03a: istore 4
      // 03c: ifne 05f
      // 03f: aload 3
      // 040: ifnull 050
      // 043: goto 047
      // 046: athrow
      // 047: iload 4
      // 049: ifge 060
      // 04c: goto 050
      // 04f: athrow
      // 050: aload 0
      // 051: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaaba ()V
      // 054: aload 0
      // 055: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 058: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aaaabba ()V
      // 05b: goto 05f
      // 05e: athrow
      // 05f: return
      // 060: aload 0
      // 061: aload 2
      // 062: aload 3
      // 063: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // 066: astore 5
      // 068: iload 1
      // 069: ifne 084
      // 06c: aload 5
      // 06e: ifnonnull 085
      // 071: goto 075
      // 074: athrow
      // 075: aload 0
      // 076: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaaba ()V
      // 079: aload 0
      // 07a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 07d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aaaabba ()V
      // 080: goto 084
      // 083: athrow
      // 084: return
      // 085: aload 0
      // 086: iload 1
      // 087: ifne 0b3
      // 08a: aload 2
      // 08b: aload 3
      // 08c: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 08f: iload 4
      // 091: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bbab (Lnet/minecraft/class_310;II)Z
      // 094: ifne 0a4
      // 097: goto 09b
      // 09a: athrow
      // 09b: aload 0
      // 09c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 09f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aaaabba ()V
      // 0a2: return
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: iload 1
      // 0a6: ifne 0be
      // 0a9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0ac: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbb;
      // 0b6: if_acmpne 17a
      // 0b9: aload 0
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 0c1: aload 2
      // 0c2: aload 5
      // 0c4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab.b ()Lnet/minecraft/class_3965;
      // 0c7: aload 0
      // 0c8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 0cb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0ce: checkcast java/lang/Double
      // 0d1: invokevirtual java/lang/Double.floatValue ()F
      // 0d4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.bbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;F)F
      // 0d7: fstore 6
      // 0d9: fload 6
      // 0db: fconst_1
      // 0dc: fcmpg
      // 0dd: iload 1
      // 0de: ifne 13d
      // 0e1: ifle 138
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: aload 2
      // 0e9: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 0ec: astore 9
      // 0ee: aload 9
      // 0f0: iload 1
      // 0f1: ifne 104
      // 0f4: instanceof net/minecraft/class_3965
      // 0f7: ifeq 140
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: aload 9
      // 100: goto 104
      // 103: athrow
      // 104: checkcast net/minecraft/class_3965
      // 107: astore 8
      // 109: aload 8
      // 10b: iload 1
      // 10c: ifne 12a
      // 10f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 112: aload 5
      // 114: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab.b ()Lnet/minecraft/class_3965;
      // 117: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 11a: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 11d: ifeq 140
      // 120: goto 124
      // 123: athrow
      // 124: aload 8
      // 126: goto 12a
      // 129: athrow
      // 12a: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 12d: aload 5
      // 12f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab.b ()Lnet/minecraft/class_3965;
      // 132: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 135: if_acmpne 140
      // 138: bipush 1
      // 139: goto 13d
      // 13c: athrow
      // 13d: goto 141
      // 140: bipush 0
      // 141: istore 7
      // 143: iload 1
      // 144: ifne 15b
      // 147: iload 7
      // 149: ifeq 179
      // 14c: goto 150
      // 14f: athrow
      // 150: aload 0
      // 151: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 154: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.aaaabba ()V
      // 157: goto 15b
      // 15a: athrow
      // 15b: aload 2
      // 15c: aload 0
      // 15d: iload 4
      // 15f: aload 2
      // 160: aload 5
      // 162: invokedynamic getAsBoolean (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aabab (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;)Z, ()Z ]
      // 167: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbaa (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 16a: istore 8
      // 16c: iload 8
      // 16e: ifeq 179
      // 171: aload 0
      // 172: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaaba ()V
      // 175: goto 179
      // 178: athrow
      // 179: return
      // 17a: aload 2
      // 17b: ldc 449021675
      // 17d: ldc -2053412679
      // 17f: ldc -1798149333
      // 181: ixor
      // 182: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.a (II)I
      // 185: ldc2_w 4732313262920532607
      // 188: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abb (IJ)I
      // 18b: aload 5
      // 18d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab.a ()Lnet/minecraft/class_243;
      // 190: aload 0
      // 191: aload 2
      // 192: iload 4
      // 194: aload 5
      // 196: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb;Lnet/minecraft/class_310;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abbb (Lnet/minecraft/class_310;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;)Z, ()Z ]
      // 19b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.abaaab (Lnet/minecraft/class_310;ILnet/minecraft/class_243;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 19e: istore 6
      // 1a0: return
   }

   private static String b(byte var0, byte var1, char var2, short var3, char var4, int var5) {
      int var10 = var5 ^ -347205046;
      char[] var9 = baab[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])baba[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         baba[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 56275;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ 31709 ^ switch (var8 % 10) {
            default -> 248;
            case 1 -> 232;
            case 2 -> 145;
            case 3 -> 204;
            case 4 -> 44;
            case 5 -> 201;
            case 6 -> 3;
            case 7 -> 250;
            case 8 -> 152;
            case 9 -> 118;
         } ^ var7 ^ var2 ^ var1 ^ var4 ^ var3 ^ var5 ^ var0);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   private List ba(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
      // 004: astore 3
      // 005: aload 1
      // 006: invokevirtual net/minecraft/class_1657.method_23320 ()D
      // 009: invokestatic java/lang/Math.floor (D)D
      // 00c: d2i
      // 00d: istore 4
      // 00f: aload 1
      // 010: invokevirtual net/minecraft/class_1657.method_23317 ()D
      // 013: iload 4
      // 015: i2d
      // 016: aload 1
      // 017: invokevirtual net/minecraft/class_1657.method_23321 ()D
      // 01a: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 01d: astore 5
      // 01f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 022: new java/util/ArrayList
      // 025: dup
      // 026: invokespecial java/util/ArrayList.<init> ()V
      // 029: astore 6
      // 02b: aload 6
      // 02d: aload 5
      // 02f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 034: pop
      // 035: aload 0
      // 036: aload 1
      // 037: aload 3
      // 038: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaa (Lnet/minecraft/class_1657;Lnet/minecraft/class_238;)Lnet/minecraft/class_238;
      // 03b: astore 7
      // 03d: istore 2
      // 03e: aload 7
      // 040: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
      // 043: astore 8
      // 045: aload 3
      // 046: getfield net/minecraft/class_238.field_1323 D
      // 049: aload 7
      // 04b: getfield net/minecraft/class_238.field_1323 D
      // 04e: invokestatic java/lang/Math.min (DD)D
      // 051: invokestatic java/lang/Math.floor (D)D
      // 054: d2i
      // 055: istore 9
      // 057: aload 3
      // 058: getfield net/minecraft/class_238.field_1320 D
      // 05b: aload 7
      // 05d: getfield net/minecraft/class_238.field_1320 D
      // 060: invokestatic java/lang/Math.max (DD)D
      // 063: ldc2_w 1.0E-7
      // 066: dsub
      // 067: invokestatic java/lang/Math.floor (D)D
      // 06a: d2i
      // 06b: istore 10
      // 06d: aload 3
      // 06e: getfield net/minecraft/class_238.field_1321 D
      // 071: aload 7
      // 073: getfield net/minecraft/class_238.field_1321 D
      // 076: invokestatic java/lang/Math.min (DD)D
      // 079: invokestatic java/lang/Math.floor (D)D
      // 07c: d2i
      // 07d: istore 11
      // 07f: aload 3
      // 080: getfield net/minecraft/class_238.field_1324 D
      // 083: aload 7
      // 085: getfield net/minecraft/class_238.field_1324 D
      // 088: invokestatic java/lang/Math.max (DD)D
      // 08b: ldc2_w 1.0E-7
      // 08e: dsub
      // 08f: invokestatic java/lang/Math.floor (D)D
      // 092: d2i
      // 093: istore 12
      // 095: aload 3
      // 096: getfield net/minecraft/class_238.field_1325 D
      // 099: aload 1
      // 09a: invokevirtual net/minecraft/class_1657.method_23320 ()D
      // 09d: dsub
      // 09e: dstore 13
      // 0a0: aload 7
      // 0a2: getfield net/minecraft/class_238.field_1325 D
      // 0a5: dload 13
      // 0a7: dsub
      // 0a8: invokestatic java/lang/Math.floor (D)D
      // 0ab: d2i
      // 0ac: istore 15
      // 0ae: iload 9
      // 0b0: istore 16
      // 0b2: iload 16
      // 0b4: iload 10
      // 0b6: if_icmpgt 147
      // 0b9: iload 2
      // 0ba: ifne 158
      // 0bd: iload 11
      // 0bf: istore 17
      // 0c1: iload 17
      // 0c3: iload 12
      // 0c5: if_icmpgt 140
      // 0c8: new net/minecraft/class_2338
      // 0cb: dup
      // 0cc: iload 16
      // 0ce: iload 4
      // 0d0: iload 17
      // 0d2: invokespecial net/minecraft/class_2338.<init> (III)V
      // 0d5: astore 18
      // 0d7: iload 2
      // 0d8: ifne 143
      // 0db: aload 6
      // 0dd: aload 18
      // 0df: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0e4: iload 2
      // 0e5: ifne 103
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: ifne 101
      // 0ef: goto 0f3
      // 0f2: athrow
      // 0f3: aload 6
      // 0f5: aload 18
      // 0f7: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0fc: pop
      // 0fd: goto 101
      // 100: athrow
      // 101: iload 15
      // 103: iload 4
      // 105: if_icmpeq 139
      // 108: new net/minecraft/class_2338
      // 10b: dup
      // 10c: iload 16
      // 10e: iload 15
      // 110: iload 17
      // 112: invokespecial net/minecraft/class_2338.<init> (III)V
      // 115: astore 19
      // 117: iload 2
      // 118: ifne 13c
      // 11b: aload 6
      // 11d: aload 19
      // 11f: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 124: ifne 139
      // 127: goto 12b
      // 12a: athrow
      // 12b: aload 6
      // 12d: aload 19
      // 12f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 134: pop
      // 135: goto 139
      // 138: athrow
      // 139: iinc 17 1
      // 13c: iload 2
      // 13d: ifeq 0c1
      // 140: iinc 16 1
      // 143: iload 2
      // 144: ifeq 0b2
      // 147: aload 6
      // 149: aload 8
      // 14b: invokedynamic applyAsDouble (Lnet/minecraft/class_243;)Ljava/util/function/ToDoubleFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)D, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aba (Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)D, (Lnet/minecraft/class_2338;)D ]
      // 150: invokestatic java/util/Comparator.comparingDouble (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
      // 153: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 158: aload 6
      // 15a: areturn
   }

   private aaabab bb(class_310 param1, class_1657 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 39
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbba;
      // 12: if_acmpne 38
      // 15: goto 19
      // 18: athrow
      // 19: aload 0
      // 1a: iload 3
      // 1b: ifne 32
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: aload 2
      // 24: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Z
      // 27: ifeq 31
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aconst_null
      // 2f: areturn
      // 30: athrow
      // 31: aload 0
      // 32: aload 1
      // 33: aload 2
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bbba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // 37: areturn
      // 38: aload 0
      // 39: aload 2
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.ba (Lnet/minecraft/class_1657;)Ljava/util/List;
      // 3d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 42: astore 4
      // 44: aload 4
      // 46: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4b: ifeq 77
      // 4e: aload 4
      // 50: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 55: checkcast net/minecraft/class_2338
      // 58: astore 5
      // 5a: aload 0
      // 5b: aload 1
      // 5c: aload 5
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // 61: astore 6
      // 63: aload 6
      // 65: iload 3
      // 66: ifne 72
      // 69: ifnull 73
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 6
      // 72: areturn
      // 73: iload 3
      // 74: ifeq 44
      // 77: aconst_null
      // 78: areturn
   }

   private class_238 aaa(class_1657 param1, class_238 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraft/class_1657.method_18798 ()Lnet/minecraft/class_243;
      // 04: astore 4
      // 06: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 09: aload 4
      // 0b: getfield net/minecraft/class_243.field_1352 D
      // 0e: aload 4
      // 10: getfield net/minecraft/class_243.field_1350 D
      // 13: invokestatic java/lang/Math.hypot (DD)D
      // 16: dstore 5
      // 18: istore 3
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 20: checkcast java/lang/Boolean
      // 23: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 26: iload 3
      // 27: ifne 3b
      // 2a: ifeq 65
      // 2d: goto 31
      // 30: athrow
      // 31: dload 5
      // 33: ldc2_w 0.04
      // 36: dcmpl
      // 37: goto 3b
      // 3a: athrow
      // 3b: iload 3
      // 3c: ifne 62
      // 3f: ifgt 61
      // 42: goto 46
      // 45: athrow
      // 46: aload 4
      // 48: getfield net/minecraft/class_243.field_1351 D
      // 4b: invokestatic java/lang/Math.abs (D)D
      // 4e: ldc2_w 0.05
      // 51: dcmpl
      // 52: iload 3
      // 53: ifne 62
      // 56: goto 5a
      // 59: athrow
      // 5a: ifle 65
      // 5d: goto 61
      // 60: athrow
      // 61: bipush 1
      // 62: goto 66
      // 65: bipush 0
      // 66: istore 7
      // 68: iload 7
      // 6a: ifeq b1
      // 6d: aload 2
      // 6e: aload 4
      // 70: getfield net/minecraft/class_243.field_1352 D
      // 73: ldc2_w 1.8
      // 76: dload 5
      // 78: ldc2_w 2.5
      // 7b: dmul
      // 7c: invokestatic java/lang/Math.min (DD)D
      // 7f: dmul
      // 80: aload 4
      // 82: getfield net/minecraft/class_243.field_1351 D
      // 85: ldc2_w 1.2
      // 88: aload 4
      // 8a: getfield net/minecraft/class_243.field_1351 D
      // 8d: invokestatic java/lang/Math.abs (D)D
      // 90: ldc2_w 2.0
      // 93: dmul
      // 94: invokestatic java/lang/Math.min (DD)D
      // 97: dmul
      // 98: aload 4
      // 9a: getfield net/minecraft/class_243.field_1350 D
      // 9d: ldc2_w 1.8
      // a0: dload 5
      // a2: ldc2_w 2.5
      // a5: dmul
      // a6: invokestatic java/lang/Math.min (DD)D
      // a9: dmul
      // aa: invokevirtual net/minecraft/class_238.method_989 (DDD)Lnet/minecraft/class_238;
      // ad: goto b2
      // b0: athrow
      // b1: aload 2
      // b2: areturn
   }

   private double aab(class_238 var1, class_2338 var2) {
      double var3 = Math.max(var1.field_1322, var1.field_1325 - 0.8);
      double var5 = Math.max(0.0, Math.min(var1.field_1320, var2.method_10263() + 1.0) - Math.max(var1.field_1323, (double)var2.method_10263()));
      double var7 = Math.max(0.0, Math.min(var1.field_1325, var2.method_10264() + 1.0) - Math.max(var3, (double)var2.method_10264()));
      double var9 = Math.max(0.0, Math.min(var1.field_1324, var2.method_10260() + 1.0) - Math.max(var1.field_1321, (double)var2.method_10260()));
      return var5 * var7 * var9;
   }

   private static double aba(class_243 var0, class_2338 var1) {
      return class_243.method_24953(var1).method_1025(var0);
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(449021674, 607394236 ^ 1704612680);
      if (aaba[var3] == null) {
         aaba[var3] = (int)(abbb[var3] ^ var1);
      }

      return aaba[var3];
   }

   private int bab(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: bipush 0
      // 04: istore 3
      // 05: istore 2
      // 06: iload 3
      // 07: ldc_w 449021673
      // 0a: ldc_w -1541884024
      // 0d: ldc_w 279439287
      // 10: ixor
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.a (II)I
      // 14: ldc2_w 7707813165368963887
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abb (IJ)I
      // 1a: if_icmpge 57
      // 1d: aload 1
      // 1e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 21: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 24: iload 3
      // 25: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 28: astore 4
      // 2a: iload 2
      // 2b: ifne 53
      // 2e: aload 4
      // 30: ifnull 50
      // 33: goto 37
      // 36: athrow
      // 37: aload 4
      // 39: getstatic net/minecraft/class_1802.field_8786 Lnet/minecraft/class_1792;
      // 3c: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 3f: iload 2
      // 40: ifne 4f
      // 43: goto 47
      // 46: athrow
      // 47: ifeq 50
      // 4a: goto 4e
      // 4d: athrow
      // 4e: iload 3
      // 4f: ireturn
      // 50: iinc 3 1
      // 53: iload 2
      // 54: ifeq 06
      // 57: bipush -1
      // 58: ireturn
   }

   private aaabab bba(class_310 param1, class_1657 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 39
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbba;
      // 12: if_acmpne 38
      // 15: goto 19
      // 18: athrow
      // 19: aload 0
      // 1a: iload 3
      // 1b: ifne 32
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: aload 2
      // 24: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Z
      // 27: ifeq 31
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aconst_null
      // 2f: areturn
      // 30: athrow
      // 31: aload 0
      // 32: aload 1
      // 33: aload 2
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aa (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // 37: areturn
      // 38: aload 0
      // 39: aload 2
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaaab (Lnet/minecraft/class_1657;)Ljava/util/List;
      // 3d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 42: astore 4
      // 44: aload 4
      // 46: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4b: ifeq 77
      // 4e: aload 4
      // 50: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 55: checkcast net/minecraft/class_2338
      // 58: astore 5
      // 5a: aload 0
      // 5b: aload 1
      // 5c: aload 5
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // 61: astore 6
      // 63: aload 6
      // 65: iload 3
      // 66: ifne 72
      // 69: ifnull 73
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 6
      // 72: areturn
      // 73: iload 3
      // 74: ifeq 44
      // 77: aconst_null
      // 78: areturn
   }

   private static int a(int var0, int var1) {
      int var2 = baaa[var0 ^ 449021675] ^ var1 ^ var0;
      var2 ^= 24417;
      var2 -= 60855;
      var2 += 17079;
      var2 -= 53192;
      var2 -= 39413;
      return var2 + 14100;
   }

   private boolean bbb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull 85
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 85
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnull 85
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 3e: ifnull 85
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: iload 2
      // 4b: ifne 5d
      // 4e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 51: ifnonnull 85
      // 54: goto 58
      // 57: athrow
      // 58: aload 1
      // 59: goto 5d
      // 5c: athrow
      // 5d: iload 2
      // 5e: ifne 73
      // 61: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 64: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 67: ifeq 85
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 1
      // 6f: goto 73
      // 72: athrow
      // 73: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 76: iload 2
      // 77: ifne 82
      // 7a: ifne 85
      // 7d: goto 81
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
   }

   private aaabab aaaa(class_310 param1, class_1657 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 4f
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0f: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabb
      // 12: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabb.ordinal ()I
      // 15: tableswitch 28 0 2 48 39 57
      // 30: athrow
      // 31: new java/lang/MatchException
      // 34: dup
      // 35: aconst_null
      // 36: aconst_null
      // 37: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 3a: athrow
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 1
      // 3e: aload 2
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bb (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // 42: goto ca
      // 45: aload 0
      // 46: aload 1
      // 47: aload 2
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // 4b: goto ca
      // 4e: aload 0
      // 4f: aload 1
      // 50: iload 3
      // 51: ifne 84
      // 54: aload 2
      // 55: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Z
      // 58: ifne 7a
      // 5b: goto 5f
      // 5e: athrow
      // 5f: aload 0
      // 60: iload 3
      // 61: ifne 7b
      // 64: goto 68
      // 67: athrow
      // 68: aload 1
      // 69: aload 2
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // 6d: astore 4
      // 6f: aload 4
      // 71: ifnull 7a
      // 74: aload 4
      // 76: goto ca
      // 79: athrow
      // 7a: aload 0
      // 7b: iload 3
      // 7c: ifne a7
      // 7f: aload 1
      // 80: goto 84
      // 83: athrow
      // 84: aload 2
      // 85: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Z
      // 88: ifne a6
      // 8b: aload 0
      // 8c: iload 3
      // 8d: ifne a7
      // 90: goto 94
      // 93: athrow
      // 94: aload 1
      // 95: aload 2
      // 96: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bb (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // 99: astore 4
      // 9b: aload 4
      // 9d: ifnull a6
      // a0: aload 4
      // a2: goto ca
      // a5: athrow
      // a6: aload 0
      // a7: aload 1
      // a8: aload 2
      // a9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // ac: astore 4
      // ae: aload 4
      // b0: iload 3
      // b1: ifne c7
      // b4: ifnull c1
      // b7: goto bb
      // ba: athrow
      // bb: aload 4
      // bd: goto ca
      // c0: athrow
      // c1: aload 0
      // c2: aload 1
      // c3: aload 2
      // c4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bb (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab;
      // c7: goto ca
      // ca: areturn
   }

   private static String aaab(int var0, int var1) {
      int var9 = -628642882;
      int var2 = (var0 ^ a(449021672, var9 ^ -309615139)) & a(449021679, var9 ^ -1780250606);
      if (aaa[var2] == null) {
         char[] var3 = aaaa[var2].toCharArray();

         int var4 = switch (var3[0] & a(449021678, var9 ^ 1741868367)) {
            case 0 -> a(449021677, var9 ^ 1731136673);
            case 1 -> a(449021676, var9 ^ -1181386521);
            case 2 -> a(449021667, var9 ^ -521163118);
            case 3 -> a(449021666, var9 ^ 1419502049);
            case 4 -> a(449021665, var9 ^ 4678453);
            case 5 -> a(449021664, var9 ^ -301937571);
            case 6 -> a(449021671, var9 ^ 2053271135);
            case 7 -> a(449021670, var9 ^ -893401699);
            case 8 -> a(449021669, var9 ^ 485504809);
            case 9 -> a(449021668, var9 ^ -467924969);
            case 10 -> a(449021691, var9 ^ -1201181367);
            case 11 -> a(449021690, var9 ^ -1181464833);
            case 12 -> a(449021689, var9 ^ 1065260325);
            case 13 -> a(449021688, var9 ^ 640625203);
            case 14 -> a(449021695, var9 ^ -1223511605);
            case 15 -> a(449021694, var9 ^ -469149066);
            case 16 -> a(449021693, var9 ^ 1892673581);
            case 17 -> a(449021692, var9 ^ 1713944787);
            case 18 -> a(449021683, var9 ^ -1842516149);
            case 19 -> a(449021682, var9 ^ 952063978);
            case 20 -> a(449021681, var9 ^ -1850715074);
            case 21 -> a(449021680, var9 ^ -1578290663);
            case 22 -> a(449021687, var9 ^ -1056583914);
            case 23 -> a(449021686, var9 ^ 1556162693);
            case 24 -> a(449021685, var9 ^ -362111165);
            case 25 -> a(449021684, var9 ^ 1041287368);
            case 26 -> a(449021643, var9 ^ 1513868829);
            case 27 -> a(449021642, var9 ^ -724103033);
            case 28 -> a(449021641, var9 ^ -962303923);
            case 29 -> a(449021640, var9 ^ 652746799);
            case 30 -> a(449021647, var9 ^ 612166350);
            case 31 -> a(449021646, var9 ^ 1291037700);
            case 32 -> a(449021645, var9 ^ 981168934);
            case 33 -> a(449021644, var9 ^ 735301636);
            case 34 -> a(449021635, var9 ^ 989993455);
            case 35 -> a(449021634, var9 ^ -1450913974);
            case 36 -> a(449021633, var9 ^ 479286988);
            case 37 -> a(449021632, var9 ^ 284781633);
            case 38 -> a(449021639, var9 ^ 185070088);
            case 39 -> a(449021638, var9 ^ -1939940692);
            case 40 -> a(449021637, var9 ^ -1928536545);
            case 41 -> a(449021636, var9 ^ -1449309849);
            case 42 -> a(449021659, var9 ^ -6931611);
            case 43 -> a(449021658, var9 ^ 1916413425);
            case 44 -> a(449021657, var9 ^ -1897045974);
            case 45 -> a(449021656, var9 ^ -2040895086);
            case 46 -> a(449021663, var9 ^ 541873480);
            case 47 -> a(449021662, var9 ^ -731683003);
            case 48 -> a(449021661, var9 ^ 253614795);
            case 49 -> a(449021660, var9 ^ -103081908);
            case 50 -> a(449021651, var9 ^ 147568158);
            case 51 -> a(449021650, var9 ^ -1672072801);
            case 52 -> a(449021649, var9 ^ -2045972362);
            case 53 -> a(449021648, var9 ^ 811732723);
            case 54 -> a(449021655, var9 ^ -827190413);
            case 55 -> a(449021654, var9 ^ -1808831768);
            case 56 -> a(449021653, var9 ^ 1030319074);
            case 57 -> a(449021652, var9 ^ 377982875);
            case 58 -> a(449021611, var9 ^ -629891269);
            case 59 -> a(449021610, var9 ^ -8240796);
            case 60 -> a(449021609, var9 ^ -551408034);
            case 61 -> a(449021608, var9 ^ 67747672);
            case 62 -> a(449021615, var9 ^ 1760910646);
            case 63 -> a(449021614, var9 ^ -336090711);
            case 64 -> a(449021613, var9 ^ -2112252424);
            case 65 -> a(449021612, var9 ^ 933332123);
            case 66 -> a(449021603, var9 ^ -1346004625);
            case 67 -> a(449021602, var9 ^ 505794534);
            case 68 -> a(449021601, var9 ^ 1881562231);
            case 69 -> a(449021600, var9 ^ 2007322739);
            case 70 -> a(449021607, var9 ^ 756767528);
            case 71 -> a(449021606, var9 ^ -1073029137);
            case 72 -> a(449021605, var9 ^ 1617743966);
            case 73 -> a(449021604, var9 ^ -554450916);
            case 74 -> a(449021627, var9 ^ 348614787);
            case 75 -> a(449021626, var9 ^ 454423679);
            case 76 -> a(449021625, var9 ^ 1427697252);
            case 77 -> a(449021624, var9 ^ -1299276381);
            case 78 -> a(449021631, var9 ^ -772028417);
            case 79 -> a(449021630, var9 ^ 18941919);
            case 80 -> a(449021629, var9 ^ -184749262);
            case 81 -> a(449021628, var9 ^ 354524448);
            case 82 -> a(449021619, var9 ^ 86037559);
            case 83 -> a(449021618, var9 ^ -721728122);
            case 84 -> a(449021617, var9 ^ -2001348065);
            case 85 -> a(449021616, var9 ^ 386894702);
            case 86 -> a(449021623, var9 ^ -485171330);
            case 87 -> a(449021622, var9 ^ 963339189);
            case 88 -> a(449021621, var9 ^ 1622896837);
            case 89 -> a(449021620, var9 ^ -359400323);
            case 90 -> a(449021579, var9 ^ 2120302026);
            case 91 -> 2;
            case 92 -> a(449021578, var9 ^ 2104051976);
            case 93 -> a(449021577, var9 ^ -759592800);
            case 94 -> 4;
            case 95 -> a(449021576, var9 ^ -1650675662);
            case 96 -> a(449021583, var9 ^ 94793622);
            case 97 -> a(449021582, var9 ^ -2041183446);
            case 98 -> a(449021581, var9 ^ 1353733186);
            case 99 -> a(449021580, var9 ^ -913815698);
            case 100 -> a(449021571, var9 ^ 267345233);
            case 101 -> a(449021570, var9 ^ -1331867065);
            case 102 -> a(449021569, var9 ^ 220570932);
            case 103 -> a(449021568, var9 ^ -1903616448);
            case 104 -> a(449021575, var9 ^ -1717390830);
            case 105 -> 5;
            case 106 -> a(449021574, var9 ^ 1748073169);
            case 107 -> a(449021573, var9 ^ -239923840);
            case 108 -> a(449021572, var9 ^ -1603034521);
            case 109 -> a(449021595, var9 ^ 1215260294);
            case 110 -> a(449021594, var9 ^ 1870545405);
            case 111 -> a(449021593, var9 ^ -147582037);
            case 112 -> a(449021592, var9 ^ 2093959558);
            case 113 -> a(449021599, var9 ^ 1326772708);
            case 114 -> a(449021598, var9 ^ -328163801);
            case 115 -> a(449021597, var9 ^ 219142187);
            case 116 -> a(449021596, var9 ^ -1201177201);
            case 117 -> a(449021587, var9 ^ -1802858532);
            case 118 -> a(449021586, var9 ^ -413851917);
            case 119 -> a(449021585, var9 ^ 900474505);
            case 120 -> a(449021584, var9 ^ 21507425);
            case 121 -> a(449021591, var9 ^ -304479355);
            case 122 -> a(449021590, var9 ^ 720171019);
            case 123 -> a(449021589, var9 ^ 1377108636);
            case 124 -> a(449021588, var9 ^ -213001704);
            case 125 -> a(449021547, var9 ^ -76701651);
            case 126 -> a(449021546, var9 ^ 1080985216);
            case 127 -> a(449021545, var9 ^ -377637312);
            case 128 -> a(449021544, var9 ^ 2037886442);
            case 129 -> a(449021551, var9 ^ 259366343);
            case 130 -> a(449021550, var9 ^ -440358887);
            case 131 -> a(449021549, var9 ^ 1825367198);
            case 132 -> a(449021548, var9 ^ -2034398223);
            case 133 -> a(449021539, var9 ^ 126597015);
            case 134 -> a(449021538, var9 ^ 673649123);
            case 135 -> a(449021537, var9 ^ 735752456);
            case 136 -> a(449021536, var9 ^ 1252105490);
            case 137 -> a(449021543, var9 ^ -1377086850);
            case 138 -> a(449021542, var9 ^ -1302672194);
            case 139 -> a(449021541, var9 ^ 1873196684);
            case 140 -> a(449021540, var9 ^ 1630857477);
            case 141 -> a(449021563, var9 ^ 415802048);
            case 142 -> a(449021562, var9 ^ -1670045221);
            case 143 -> a(449021561, var9 ^ -1838368566);
            case 144 -> a(449021560, var9 ^ 1479093197);
            case 145 -> a(449021567, var9 ^ 1390062729);
            case 146 -> a(449021566, var9 ^ 1276565300);
            case 147 -> a(449021565, var9 ^ -1316479057);
            case 148 -> a(449021564, var9 ^ 1517703987);
            case 149 -> a(449021555, var9 ^ 1297501531);
            case 150 -> a(449021554, var9 ^ 2055972891);
            case 151 -> a(449021553, var9 ^ -637967086);
            case 152 -> a(449021552, var9 ^ -1027423391);
            case 153 -> a(449021559, var9 ^ 1304505105);
            case 154 -> a(449021558, var9 ^ 1573486090);
            case 155 -> a(449021557, var9 ^ 1863068935);
            case 156 -> a(449021556, var9 ^ -840693487);
            case 157 -> a(449021515, var9 ^ 295135440);
            case 158 -> a(449021514, var9 ^ -332535446);
            case 159 -> a(449021513, var9 ^ -1072403359);
            case 160 -> a(449021512, var9 ^ 1489288277);
            case 161 -> a(449021519, var9 ^ 761639945);
            case 162 -> a(449021518, var9 ^ -1929317720);
            case 163 -> a(449021517, var9 ^ 1946871224);
            case 164 -> a(449021516, var9 ^ -697640275);
            case 165 -> a(449021507, var9 ^ 466592202);
            case 166 -> a(449021506, var9 ^ -145281682);
            case 167 -> a(449021505, var9 ^ -1306168647);
            case 168 -> a(449021504, var9 ^ 510691914);
            case 169 -> a(449021511, var9 ^ -1966862175);
            case 170 -> a(449021510, var9 ^ -2115748038);
            case 171 -> a(449021509, var9 ^ 1733090712);
            case 172 -> a(449021508, var9 ^ -178166808);
            case 173 -> a(449021531, var9 ^ -600890801);
            case 174 -> a(449021530, var9 ^ 1475678345);
            case 175 -> 0;
            case 176 -> a(449021529, var9 ^ -1741706599);
            case 177 -> a(449021528, var9 ^ -817925317);
            case 178 -> a(449021535, var9 ^ -32739096);
            case 179 -> a(449021534, var9 ^ 295519351);
            case 180 -> a(449021533, var9 ^ -2028499247);
            case 181 -> a(449021532, var9 ^ 187163847);
            case 182 -> a(449021523, var9 ^ 1318855261);
            case 183 -> a(449021522, var9 ^ 1000031357);
            case 184 -> a(449021521, var9 ^ 119845291);
            case 185 -> a(449021520, var9 ^ -204272631);
            case 186 -> a(449021527, var9 ^ 626322634);
            case 187 -> a(449021526, var9 ^ 933360378);
            case 188 -> a(449021525, var9 ^ 790658078);
            case 189 -> a(449021524, var9 ^ -212996747);
            case 190 -> a(449021483, var9 ^ 1251824766);
            case 191 -> a(449021482, var9 ^ -921879241);
            case 192 -> a(449021481, var9 ^ -969543393);
            case 193 -> a(449021480, var9 ^ 2060601706);
            case 194 -> a(449021487, var9 ^ 7097810);
            case 195 -> a(449021486, var9 ^ 78582268);
            case 196 -> a(449021485, var9 ^ -1547211412);
            case 197 -> a(449021484, var9 ^ 643347786);
            case 198 -> a(449021475, var9 ^ 1135279965);
            case 199 -> a(449021474, var9 ^ 1959664278);
            case 200 -> a(449021473, var9 ^ -1745841036);
            case 201 -> a(449021472, var9 ^ -26470050);
            case 202 -> a(449021479, var9 ^ 1932277654);
            case 203 -> a(449021478, var9 ^ 191693829);
            case 204 -> a(449021477, var9 ^ -39173490);
            case 205 -> a(449021476, var9 ^ 1871963769);
            case 206 -> a(449021499, var9 ^ 1478672369);
            case 207 -> a(449021498, var9 ^ -121573633);
            case 208 -> a(449021497, var9 ^ 998640361);
            case 209 -> a(449021496, var9 ^ -173699572);
            case 210 -> a(449021503, var9 ^ -821843613);
            case 211 -> a(449021502, var9 ^ 1647868593);
            case 212 -> a(449021501, var9 ^ 1576919319);
            case 213 -> a(449021500, var9 ^ -278398989);
            case 214 -> a(449021491, var9 ^ -822023324);
            case 215 -> 1;
            case 216 -> a(449021490, var9 ^ -1149801317);
            case 217 -> a(449021489, var9 ^ -419165735);
            case 218 -> a(449021488, var9 ^ 976019439);
            case 219 -> a(449021495, var9 ^ 1040199046);
            case 220 -> a(449021494, var9 ^ 1637119033);
            case 221 -> a(449021493, var9 ^ -1999913364);
            case 222 -> a(449021492, var9 ^ 786322641);
            case 223 -> a(449021451, var9 ^ 109011323);
            case 224 -> a(449021450, var9 ^ -1323077782);
            case 225 -> a(449021449, var9 ^ 860257460);
            case 226 -> a(449021448, var9 ^ -1989916725);
            case 227 -> a(449021455, var9 ^ 868181200);
            case 228 -> a(449021454, var9 ^ -1693725426);
            case 229 -> a(449021453, var9 ^ -714210095);
            case 230 -> a(449021452, var9 ^ 1598086317);
            case 231 -> a(449021443, var9 ^ -123789002);
            case 232 -> a(449021442, var9 ^ -1437478361);
            case 233 -> a(449021441, var9 ^ -812515547);
            case 234 -> a(449021440, var9 ^ -1355799295);
            case 235 -> a(449021447, var9 ^ -1915621969);
            case 236 -> a(449021446, var9 ^ 1994150767);
            case 237 -> a(449021445, var9 ^ 1804188248);
            case 238 -> a(449021444, var9 ^ 1746264472);
            case 239 -> a(449021467, var9 ^ 1257823641);
            case 240 -> a(449021466, var9 ^ 999983245);
            case 241 -> a(449021465, var9 ^ 1077272729);
            case 242 -> a(449021464, var9 ^ -1885277287);
            case 243 -> a(449021471, var9 ^ 1667932170);
            case 244 -> 3;
            case 245 -> a(449021470, var9 ^ 1619012918);
            case 246 -> a(449021469, var9 ^ 1776543887);
            case 247 -> a(449021468, var9 ^ 1422195808);
            case 248 -> a(449021459, var9 ^ 2070175311);
            case 249 -> a(449021458, var9 ^ -1059490250);
            case 250 -> a(449021457, var9 ^ 4000896);
            case 251 -> a(449021456, var9 ^ 878214506);
            case 252 -> a(449021463, var9 ^ 264441969);
            case 253 -> a(449021462, var9 ^ -847006540);
            case 254 -> a(449021461, var9 ^ -1726770790);
            default -> a(449021460, var9 ^ -63999274);
         };
         int var5 = (var1 & a(449021931, var9 ^ 1243962651)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(449021930, var9 ^ 1750286609)) >>> a(449021929, var9 ^ 425644605)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(449021928, var9 ^ 2016228591);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(449021935, var9 ^ -63718912);
            }
         }

         aaa[var2] = new String(var3).intern();
      }

      return aaa[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var40 = 1545605209;
      char[] var31 = "ã!\u0010\n\u0010\n".toCharArray();
      String var30 = "硶磘磌磔砠硆硽砸硂磁砟碑砅碠砟硽硖碬砈硊硪碋磔碀砼碓磞碯硭砾硖碱碫磧硵碰砏硢硂硣砿砓砳砲磑磻磤碷磜碿碖碋碝砳硉砺砑碁砆碋碧硖碒硇研硂硁砜硞砍硥碮磕硄碮硚磿硪磶础磶硴碖碕硔硏砖碟磞硼硷碟磁磔硝砐碵砭硩磻磄碍磳硝砥磓硼碂磣磬碆硻碀碶砝碎硿硵硝硋硬磤碠磅硍砓硠砆碾碏碶砭砷磊砇硸硌硑砆硙磧磣磾磋硹碕硟硚磐碌砡碜硋硄磐磭碃磐硐砍砋硁碝碚碽磲磒硇砛砶磡磿砰磭硍砲磨砛碈磂碶磯硄碩磃砥磛碨碷硼硛砆硅磻磩碲磺砏碜硟砓碽硶砚硫磇硤硞砋磎砨硸磻磙砼硅磍砻砧碗磑碦磅码碤砬砲ᙄᘉᚗᚼᘦᛑᛚᙞᘨᙸᘱᙞᘣᙊᛕᘙᛄ\u169dᙡᙨᛍᘬᛓᘊᘓᘭᚓᛍᘣᙕᙢᙶᚫⷴⵆⴂⷓⷚⷡⴚⴄⷂⵜⵥⷳⴹ\u2d7a\u2d9aⷉ\ue4f3\ue418\ue4f3\ue4e7\ue4e9\ue4b3\ue495\ue4ee\ue4b3\ue4baꔶꗵꔉꕑꗪꖩꕇꔰꔞꗻꕺꗹꗿꔈꕗꕯ>Õ>*$~X#~w";
      short var29 = 22808;
      int var10000 = var31.length;
      byte var36 = -1;
      String[] var32 = new String[var10000];

      while (true) {
         int var33 = 0;
         char var34 = 0;
         char var35 = '\u0000';
         if (var36 == 0) {
            baab = var32;
            baba = new Object[var32.length];
            int var25 = -548000034;
            byte[] var23 = "ÔÞÕZ\u00849¢\u0094q(·\"ò\u009bãÜ\u008aó\tTxÁO\bx<\u008eF¦\u0086ú\u0003ÿü/\u0097K\u0088c\u0007\u001fTá¤ñ\u0013MbeqïhÕ¬G2\u0003ã¶\nû\u000f\u008aá§tïË¦\u0087ÇÄ m\u0017Ý9<«)¨\u00010åû\u001aÛkoÜi y;:^\u008d>íä'¬ÕS\u008e£Öî¾þ°\u008aÞ\u0016N\u001fCÒª\u001aõy\u001eQ!\u0003I\u008cE(LàËÄ\u0092cÙ·ê\u00119û¢§;okåSà-v%hñÜ4ÀQ $\u0011\u009bo¶\u0097N]\u0003\u0082×þ\u000fêî¸\u0014\u0014pS\u0093M[§\u0092\u001f\\}¶\u008eË\u0005à\u0085¹ªm)¤á\u0091þâµ\u0099Ièþ?_×ñËpå÷\u0010\u000eX\bæÈ\u009a¿\u0017Ø4à\u0083E°ü\u0099\u001fr:/q\u008fæÑ¡\u0092O\u008b<ëÏ\"zê\u0080\t\u0094\u000e\u0086Åg\u001d£à\u0091Ã\u009dÀ1¬µ\u001b\u001a=öwæß=ôä+t\u009d\n\u0014ç(²\u0006\u001d°Ö\u001bO\u00016MÚo5Ý7h¶Ñ\u001d2\bÚHß\u0019]|\u007f\u007fQMÁàBß\u000bÔò²\u0004\u0006v¥J\u000blÚ\u00ad\u009d\u001f¹ÎèEÛ\u001e2\u0085æëïq¿\n2\u001f¨\u001a3VéËèÏJ\u0097¦Xë\b\u001c\tÄü\u0007]ñ&xá[\u007f¨òoõ\u0080~Ðar¿pbzÈBÍª\tý\u0082\u008f1S\u001aµîõ\u0099E\u0082KO£ÖIÖ\u009bÅÇ\u0010üßº¯\u008eÐ\u008d\u00126'·\u0091\u009a\u009c\u009a\u0086±0\u0089w\"û\u0095î \u008f\u001e¿` lW|ä\u0000pmÃøè'\u0092ÊcÜÈûP\u0007sùóc\u001c)\u0012\u001cZû§tÿ|\u008b\u0099\rÜøF\u009c\u0017*¿¤\b\u001e[¯ òÉ\u0081\u00055ÿråM\u0006\u0080sì^XËä~\"È_}\u0004üön4<fd/¤\u0010f\u001c\u0011úÓ)\u008bsße \u0099®\tÈ\u0018\u00986074\u0090x4É3\fU²\u001f\u007f²øÓ£\u00adINçpµ7\u0013~'k6\u0007Û#@\u0083f£5\u008d\u007f:«G:©5MÉ.ÔS\u0005UI®\u009b\u009déEeÒ\u0084REÌ\u0090e\u0098*\bÆêçjÝÑBüRÒ©9BÚüÕp\u001f¬\u0092Ò÷\u008b7\u000e\u0084énó>hòß\u0007íòG×>\u00852v5\u009d\u0092\u0013s]k\u0019gÇÉy[.\u0004Ü#ãèD¯r\u00ad6ðÐ\u0001c\b\u0001\u0095×\u0092n\u009e÷¾¡x__Ýêrá-Ã<£ªHæ\u0092\u0088\u0087<(«Ð,ñ\u0016á\u001fò¸\u000e\u008eÆ¥\u0098\u0004\fè\u00144fäQ\u008f£Í$\u0088ÆT\u001873ÙìÀ\u008d\u00ad:GmQ(²s[03ýåì^o\u0005U\u008eÖ7Ö\u001e¿SÙ&s\feÁËG\u001f\u007fÏ©\u001b¼\u0090\u000b¼Ôï39K76\\¹}4kÝ\u009b\u000b\u0088ã\u0016Dá\u007f\u009b\u0002l?µ¢\u0014~\u0086\u0082â¹Àäp\u0080dtG1>wçÓl\u0084$\u0095\u0088Tê¶\f\u0013Ð\u0010+w}+ø\u0019Bî`Àðtu\u008bÐ\u0013jâ¤dí~ø\u0017\u008bz%?^\t!\u0013¯:~\u0087ö#\u0097Ø<\u00001ÍÖ¸\u0019là®®0ín,Uþ\u0018\u0096wÆ1,¬æZ\u0084\u0018O\u0099Ê}\u0086\u008a@S^\u00adç\u008c \u0086µBPiÐ\u0082~Ê°#¤É\u0092Âo\u0095iÏÒ\u009ft\u009a;\u0081w\u0006cèUë_¾$\u0089\n7_&b÷\u0090³qï|y!ê\u007f\u0093¯²vðjïK×}¤dwÜÿßÊô\u0004\u001f.\u008dl+KÿD\u0010Ð\u0092ñÒ\u00906/\u0086\u0000\u0013\u001eã<ðKU6ÞYwCÁR\u0006MRdg>·®ã 9F\u0019qdSÛ¨Èc§Õ à\n®àÕsÆID\u0015@×È\u0017áØôqý\u0090n'ÆÐ\u0090\u009f5\u0098àB\u0002\u00909ßåê¨\u0087z|y\u001c\u008aÀRÁ\u008dMâ4úßèÌDí!};/À\u0096÷Ë6Ö\u0092¦4ÑÔ4»\u009f9ÈV³ì\u0087\nì\u0004\ríàÒ\fVþo§Ý\u0004\u008fénmï}»?SþµAÊ¬Ø\u008c(Ï\fµÞN@\u008fº\u0090a¦>\u008ce;Û\u0012\b%Å¾¡so6N\u001eN\u0012\u009fB~<®A?LÅBøä\u0000¸\u00160ìï\u0083¡i' \u008fy&_f\\ÒôßØûè\u0093\u0018\u0083à\u009ex¢\ráXØ_\u008cê¯ü¯>|O\tø\u008eìÈqÆ\u0018\u0000ÑÄ|R\u0018Ö\u0096u¿\u0091\u0093ñí+T\u009d 4F\u0096\u001e\u0018ââ0k~\u001bp\u0005ñ£õÀ®ð¨\u0097Wsó\u0091E\tu\u0013\u0089H "
               .getBytes("ISO-8859-1");
            int var24 = var23.length / 4;
            baaa = new int[var24];
            byte var26 = 0;
            int var27 = 0;

            do {
               int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
               var28 ^= var25;
               baaa[var27] = var28;
               var26 += 4;
            } while (++var27 < var24);

            String[] var21 = new String[a(449021920, var40 ^ -1906973883)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = b(60, 117, '㵡', 23015, 1975, -347205046)).length();
            int var17 = a(449021927, var40 ^ -397825058);
            int var42 = -1;

            label122:
            while (true) {
               String var46 = var18.substring(++var42, var42 + var17);
               int var10001 = -1;

               while (true) {
                  char[] var62;
                  label117: {
                     char[] var49 = var46.toCharArray();
                     int var10003 = var49.length;
                     int var22 = 0;
                     var62 = var49;
                     var10001 = var10003;
                     char[] var70;
                     int var10004;
                     if (var10003 <= 1) {
                        var70 = var49;
                        var10004 = var22;
                     } else {
                        var62 = var49;
                        var10001 = var10003;
                        if (var10003 <= var22) {
                           break label117;
                        }

                        var70 = var49;
                        var10004 = var22;
                     }

                     while (true) {
                        var70[var10004] = (char)(var70[var10004] ^ switch (var22 % a(449021924, var40 ^ -608785525)) {
                           case 0 -> a(449021947, var40 ^ 1179767473);
                           case 1 -> a(449021946, var40 ^ 516835290);
                           case 2 -> a(449021945, var40 ^ -2059469943);
                           case 3 -> a(449021944, var40 ^ 1480160734);
                           case 4 -> a(449021951, var40 ^ -1387338705);
                           case 5 -> a(449021950, var40 ^ 1441847037);
                           default -> a(449021949, var40 ^ -460385232);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var70 = var62;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var70 = var62;
                           var10004 = var22;
                        }
                     }
                  }

                  String var77 = new String(var62).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var77;
                        if ((var42 += var17) >= var20) {
                           aaaa = var21;
                           aaa = new String[a(449021925, var40 ^ 109159252)];
                           long var8 = 8137678971398916951L;
                           long[] var14 = new long[2];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = b((byte)-55, (byte)-108, (char)'꠱', (short)16845, '\udf38', -347205048)).length();
                           byte var10 = 0;

                           do {
                              int var56 = var10;
                              var10 += 8;
                              byte[] var15 = var12.substring(var56, var10).getBytes(b((byte)-6, 49, '焮', -20, '躢', -347205047));
                              var56 = var11++;
                              long var80 = (
                                    (var15[0] & 255L) << a(449021948, var40 ^ 256110797)
                                       | (var15[1] & 255L) << a(449021939, var40 ^ 1327930872)
                                       | (var15[2] & 255L) << a(449021938, var40 ^ 1214254974)
                                       | (var15[3] & 255L) << a(449021937, var40 ^ 109966216)
                                       | (var15[4] & 255L) << a(449021936, var40 ^ 710458589)
                                       | (var15[5] & 255L) << a(449021943, var40 ^ 1974482501)
                                       | (var15[a(449021942, var40 ^ 2036742121)] & 255L) << a(449021941, var40 ^ 1742445695)
                                       | var15[a(449021940, var40 ^ -1657023796)] & 255L
                                 )
                                 ^ var8;
                              byte var78 = -1;
                              var14[var56] = var80;
                           } while (var10 < var13);

                           abbb = var14;
                           aaba = new Integer[2];
                           long var0 = 3140332537185960505L;
                           long[] var6 = new long[2];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = b((byte)-116, 88, (char)'챱', (short)-11110, 22921, -347205042)).length();
                           byte var2 = 0;

                           do {
                              int var58 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var58, var2).getBytes(b((byte)-32, 27, '쾊', 24500, 29861, -347205041));
                              var58 = var3++;
                              long var81 = (
                                    (var7[0] & 255L) << a(449021899, var40 ^ -195344777)
                                       | (var7[1] & 255L) << a(449021898, var40 ^ -1494760128)
                                       | (var7[2] & 255L) << a(449021897, var40 ^ -662792410)
                                       | (var7[3] & 255L) << a(449021896, var40 ^ 362607851)
                                       | (var7[4] & 255L) << a(449021903, var40 ^ 745174440)
                                       | (var7[5] & 255L) << a(449021902, var40 ^ 370060272)
                                       | (var7[a(449021901, var40 ^ 1066055649)] & 255L) << a(449021900, var40 ^ -1569773165)
                                       | var7[a(449021891, var40 ^ -1133411020)] & 255L
                                 )
                                 ^ var0;
                              byte var79 = -1;
                              var6[var58] = var81;
                           } while (var2 < var5);

                           aab = var6;
                           ba = new Long[2];
                           return;
                        }

                        var17 = var18.charAt(var42);
                        break;
                     default:
                        var21[var19++] = var77;
                        if ((var42 += var17) < var20) {
                           var17 = var18.charAt(var42);
                           continue label122;
                        }

                        var20 = (var18 = b((byte)104, 68, 'ꂗ', (short)-9785, '瑞', -347205045)).length();
                        var17 = a(449021926, var40 ^ -1099764955);
                        var42 = -1;
                  }

                  var46 = var18.substring(++var42, var42 + var17);
                  var10001 = 0;
               }
            }
         }

         do {
            var35 = var31[var33];
            char[] var37 = var30.substring(var34, var34 + var35).toCharArray();
            int var38 = 0;

            do {
               short var39 = switch (var38 % 5) {
                  default -> 87;
                  case 1 -> 182;
                  case 2 -> 56;
                  case 3 -> 19;
                  case 4 -> 232;
               };
               var37[var38] = (char)(var37[var38] ^ var39 ^ var29);
            } while (++var38 < var37.length);

            var32[var33] = new String(var37).intern();
            var34 += var35;
         } while (++var33 < var31.length);

         var36 = 0;
      }
   }

   private static class_3965 aaba(class_310 param0, class_243 param1, class_243 param2, class_2338 param3, class_2338 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 07: new net/minecraft/class_3959
      // 0a: dup
      // 0b: aload 1
      // 0c: aload 2
      // 0d: getstatic net/minecraft/class_3959$class_3960.field_17559 Lnet/minecraft/class_3959$class_3960;
      // 10: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 13: aload 0
      // 14: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 17: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 1a: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 1d: astore 6
      // 1f: istore 5
      // 21: aload 6
      // 23: iload 5
      // 25: ifne 31
      // 28: ifnull 43
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 6
      // 31: iload 5
      // 33: ifne 48
      // 36: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 39: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 3c: if_acmpeq 46
      // 3f: goto 43
      // 42: athrow
      // 43: aconst_null
      // 44: areturn
      // 45: athrow
      // 46: aload 6
      // 48: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 4b: aload 3
      // 4c: iload 5
      // 4e: ifne 84
      // 51: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 54: ifeq 7d
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 4
      // 5d: aload 3
      // 5e: aload 6
      // 60: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 63: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 66: iload 5
      // 68: ifne 84
      // 6b: goto 6f
      // 6e: athrow
      // 6f: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 72: ifeq 7d
      // 75: goto 79
      // 78: athrow
      // 79: aload 6
      // 7b: areturn
      // 7c: athrow
      // 7d: aload 6
      // 7f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 82: aload 4
      // 84: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 87: iload 5
      // 89: ifne a3
      // 8c: ifeq aa
      // 8f: goto 93
      // 92: athrow
      // 93: aload 0
      // 94: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 97: aload 4
      // 99: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 9c: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 9f: goto a3
      // a2: athrow
      // a3: ifne aa
      // a6: aload 6
      // a8: areturn
      // a9: athrow
      // aa: aconst_null
      // ab: areturn
   }

   private double aabb(class_238 var1, class_2338 var2) {
      double var3 = Math.min(var1.field_1325, var1.field_1322 + 0.8);
      double var5 = Math.max(0.0, Math.min(var1.field_1320, var2.method_10263() + 1.0) - Math.max(var1.field_1323, (double)var2.method_10263()));
      double var7 = Math.max(0.0, Math.min(var3, var2.method_10264() + 1.0) - Math.max(var1.field_1322, (double)var2.method_10264()));
      double var9 = Math.max(0.0, Math.min(var1.field_1324, var2.method_10260() + 1.0) - Math.max(var1.field_1321, (double)var2.method_10260()));
      return var5 * var7 * var9;
   }

   private class_1657 abaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 004: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 007: checkcast java/lang/Double
      // 00a: invokevirtual java/lang/Double.doubleValue ()D
      // 00d: aload 0
      // 00e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 011: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 014: checkcast java/lang/Double
      // 017: invokevirtual java/lang/Double.doubleValue ()D
      // 01a: dmul
      // 01b: dstore 3
      // 01c: aconst_null
      // 01d: astore 5
      // 01f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 022: ldc2_w Infinity
      // 025: dstore 6
      // 027: aload 1
      // 028: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 02b: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // 02e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 033: astore 8
      // 035: istore 2
      // 036: aload 8
      // 038: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03d: ifeq 10c
      // 040: aload 8
      // 042: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 047: checkcast net/minecraft/class_1657
      // 04a: iload 2
      // 04b: ifne 10e
      // 04e: goto 052
      // 051: athrow
      // 052: astore 9
      // 054: aload 9
      // 056: iload 2
      // 057: ifne 067
      // 05a: aload 1
      // 05b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 05e: if_acmpeq 036
      // 061: goto 065
      // 064: athrow
      // 065: aload 9
      // 067: iload 2
      // 068: ifne 077
      // 06b: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 06e: ifeq 036
      // 071: goto 075
      // 074: athrow
      // 075: aload 9
      // 077: iload 2
      // 078: ifne 087
      // 07b: invokevirtual net/minecraft/class_1657.method_7325 ()Z
      // 07e: ifne 036
      // 081: goto 085
      // 084: athrow
      // 085: aload 9
      // 087: iload 2
      // 088: ifne 097
      // 08b: invokevirtual net/minecraft/class_1657.method_68878 ()Z
      // 08e: ifne 036
      // 091: goto 095
      // 094: athrow
      // 095: aload 9
      // 097: iload 2
      // 098: ifne 0b8
      // 09b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbba.ab (Lnet/minecraft/class_1657;)Z
      // 09e: ifeq 0a9
      // 0a1: goto 0a5
      // 0a4: athrow
      // 0a5: goto 036
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: iload 2
      // 0ab: ifne 0c6
      // 0ae: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0b1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0b4: goto 0b8
      // 0b7: athrow
      // 0b8: checkcast java/lang/Boolean
      // 0bb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0be: ifeq 0d2
      // 0c1: aload 0
      // 0c2: goto 0c6
      // 0c5: athrow
      // 0c6: aload 9
      // 0c8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.ab (Lnet/minecraft/class_1657;)Z
      // 0cb: ifne 0d2
      // 0ce: goto 036
      // 0d1: athrow
      // 0d2: aload 1
      // 0d3: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0d6: aload 9
      // 0d8: invokevirtual net/minecraft/class_746.method_5858 (Lnet/minecraft/class_1297;)D
      // 0db: dstore 10
      // 0dd: dload 10
      // 0df: iload 2
      // 0e0: ifne 0f2
      // 0e3: dload 3
      // 0e4: dcmpg
      // 0e5: ifgt 108
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: dload 10
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: iload 2
      // 0f3: ifne 106
      // 0f6: dload 6
      // 0f8: dcmpg
      // 0f9: ifge 108
      // 0fc: goto 100
      // 0ff: athrow
      // 100: aload 9
      // 102: astore 5
      // 104: dload 10
      // 106: dstore 6
      // 108: iload 2
      // 109: ifeq 036
      // 10c: aload 5
      // 10e: areturn
   }

   private long abab(aaabbbab var1) {
      double var2 = var1.bab();
      double var4 = var1.abb();

      try {
         if (var2 == var4) {
            return Math.max(0L, Math.round(var2));
         }
      } catch (MatchException var6) {
         throw var6;
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private boolean abba(class_310 param1, class_1657 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: aload 2
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.ba (Lnet/minecraft/class_1657;)Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 4
      // 0f: istore 3
      // 10: aload 4
      // 12: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17: ifeq 4e
      // 1a: aload 4
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast net/minecraft/class_2338
      // 24: astore 5
      // 26: aload 1
      // 27: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2a: aload 5
      // 2c: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2f: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // 32: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 35: iload 3
      // 36: ifne 4f
      // 39: iload 3
      // 3a: ifne 49
      // 3d: goto 41
      // 40: athrow
      // 41: ifeq 4a
      // 44: goto 48
      // 47: athrow
      // 48: bipush 1
      // 49: ireturn
      // 4a: iload 3
      // 4b: ifeq 10
      // 4e: bipush 0
      // 4f: ireturn
   }

   private boolean abbb(class_310 var1, int var2, aaabab var3) {
      return aabbabbbb.abbbbaa(var1, this, var2, this::baab);
   }

   private double baaa(class_1657 var1, class_2338 var2) {
      class_238 var3 = var1.method_5829();
      class_238 var4 = this.aaa(var1, var3);
      double var5 = this.aabb(var3, var2);
      if (var4 != var3) {
         var5 += this.aabb(var4, var2);
      }

      return var5;
   }

   private boolean baab(class_310 param1, aaabab param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 1
      // 04: aload 2
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab.b ()Lnet/minecraft/class_3965;
      // 08: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbababa (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 0b: istore 4
      // 0d: istore 3
      // 0e: iload 4
      // 10: iload 3
      // 11: ifne 25
      // 14: ifeq 23
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaaba ()V
      // 1f: goto 23
      // 22: athrow
      // 23: iload 4
      // 25: ireturn
   }

   private double baba(class_1657 var1, class_2338 var2) {
      class_238 var3 = var1.method_5829();
      class_238 var4 = this.aaa(var1, var3);
      double var5 = this.aab(var3, var2);
      if (var4 != var3) {
         var5 += this.aab(var4, var2);
      }

      return var5;
   }

   private static long babb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(449021934, 284746285 ^ -870432727)) & a(449021933, 284746285 ^ 247955892);
      if (ba[var3] == null) {
         ba[var3] = aab[var3] ^ var1;
      }

      return ba[var3];
   }

   private boolean bbab(class_310 param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: lstore 5
      // 08: istore 4
      // 0a: aload 0
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bbb I
      // 0e: iload 4
      // 10: ifne 42
      // 13: iload 2
      // 14: if_icmpne 30
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.baa I
      // 1f: iload 4
      // 21: ifne 9a
      // 24: goto 28
      // 27: athrow
      // 28: iload 3
      // 29: if_icmpeq 8a
      // 2c: goto 30
      // 2f: athrow
      // 30: aload 0
      // 31: iload 2
      // 32: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bbb I
      // 35: aload 0
      // 36: iload 3
      // 37: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.baa I
      // 3a: aload 1
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 3e: goto 42
      // 41: athrow
      // 42: iload 4
      // 44: ifne 54
      // 47: iload 3
      // 48: if_icmpeq 57
      // 4b: goto 4f
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: athrow
      // 54: goto 58
      // 57: bipush 0
      // 58: istore 7
      // 5a: aload 0
      // 5b: lload 5
      // 5d: iload 7
      // 5f: ifeq 6e
      // 62: aload 0
      // 63: aload 0
      // 64: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 67: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 6a: goto 6f
      // 6d: athrow
      // 6e: lconst_0
      // 6f: ladd
      // 70: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abba J
      // 73: aload 0
      // 74: ldc_w 449021932
      // 77: ldc_w -1180429097
      // 7a: ldc_w -605664986
      // 7d: ixor
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.a (II)I
      // 81: ldc2_w 4409055151339012036
      // 84: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.babb (IJ)J
      // 87: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bab J
      // 8a: lload 5
      // 8c: iload 4
      // 8e: ifne a4
      // 91: aload 0
      // 92: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abba J
      // 95: lcmp
      // 96: goto 9a
      // 99: athrow
      // 9a: ifge a0
      // 9d: bipush 0
      // 9e: ireturn
      // 9f: athrow
      // a0: aload 0
      // a1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bab J
      // a4: iload 4
      // a6: ifne d9
      // a9: ldc_w 449021923
      // ac: ldc_w -1180429097
      // af: ldc_w 1990002972
      // b2: ixor
      // b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.a (II)I
      // b6: ldc2_w 4409055151339012036
      // b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.babb (IJ)J
      // bc: lcmp
      // bd: ifne d7
      // c0: goto c4
      // c3: athrow
      // c4: aload 0
      // c5: lload 5
      // c7: aload 0
      // c8: aload 0
      // c9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // cc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.abab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // cf: ladd
      // d0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bab J
      // d3: goto d7
      // d6: athrow
      // d7: lload 5
      // d9: aload 0
      // da: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bab J
      // dd: lcmp
      // de: iload 4
      // e0: ifne eb
      // e3: iflt ee
      // e6: goto ea
      // e9: athrow
      // ea: bipush 1
      // eb: goto ef
      // ee: bipush 0
      // ef: ireturn
   }

   private aaabab bbba(class_310 var1, class_1657 var2) {
      aaabab var4 = null;
      int var3 = aabbabbab.ab;
      double var5 = -1.0;
      Iterator var7 = this.ba(var2).iterator();

      aaabab var10000;
      while (true) {
         if (var7.hasNext()) {
            class_2338 var8 = (class_2338)var7.next();
            var10000 = this.aaaaa(var1, var8);
            if (var3 != 0) {
               break;
            }

            aaabab var9 = var10000;

            try {
               if (var9 == null) {
                  continue;
               }
            } catch (MatchException var12) {
               throw var12;
            }

            double var10 = this.baba(var2, var8);

            label39: {
               label38: {
                  try {
                     if (var3 != 0) {
                        break label38;
                     }

                     if (!(var10 > var5)) {
                        break label39;
                     }
                  } catch (MatchException var13) {
                     throw var13;
                  }

                  var4 = var9;
               }

               var5 = var10;
            }

            if (var3 == 0) {
               continue;
            }
         }

         var10000 = var4;
         break;
      }

      return var10000;
   }

   private boolean bbbb(class_310 var1, class_243 var2) {
      int var10000 = aabbabbab.ab;
      double var4 = Math.max(0.0, var1.field_1724.method_55754() - 0.1);
      int var3 = var10000;

      try {
         double var8;
         var10000 = (var8 = var1.field_1724.method_33571().method_1025(var2) - var4 * var4) == 0.0 ? 0 : (var8 < 0.0 ? -1 : 1);
         if (var3 != 0) {
            return (boolean)var10000;
         }

         if (var10000 <= 0) {
            return (boolean)1;
         }
      } catch (MatchException var6) {
         throw var6;
      }

      return (boolean)0;
   }

   private aaabab aaaaa(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: aload 1
      // 004: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 007: aload 2
      // 008: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 00b: astore 4
      // 00d: istore 3
      // 00e: aload 4
      // 010: iload 3
      // 011: ifne 027
      // 014: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 017: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 01a: ifeq 05b
      // 01d: goto 021
      // 020: athrow
      // 021: aload 4
      // 023: goto 027
      // 026: athrow
      // 027: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
      // 02a: iload 3
      // 02b: ifne 049
      // 02e: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 031: ifne 05b
      // 034: goto 038
      // 037: athrow
      // 038: aload 4
      // 03a: iload 3
      // 03b: ifne 055
      // 03e: goto 042
      // 041: athrow
      // 042: getstatic net/minecraft/class_2246.field_10164 Lnet/minecraft/class_2248;
      // 045: goto 049
      // 048: athrow
      // 049: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 04c: ifne 05b
      // 04f: aload 4
      // 051: goto 055
      // 054: athrow
      // 055: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 058: ifne 05e
      // 05b: aconst_null
      // 05c: areturn
      // 05d: athrow
      // 05e: aload 1
      // 05f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 062: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 065: astore 5
      // 067: aload 1
      // 068: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 06b: aload 5
      // 06d: aload 2
      // 06e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababbbb.babb (Lnet/minecraft/class_1937;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 071: astore 6
      // 073: aload 6
      // 075: iload 3
      // 076: ifne 082
      // 079: ifnull 172
      // 07c: goto 080
      // 07f: athrow
      // 080: aload 6
      // 082: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 085: astore 7
      // 087: aload 1
      // 088: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08b: aload 7
      // 08d: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 090: astore 8
      // 092: aload 8
      // 094: iload 3
      // 095: ifne 0a8
      // 098: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 09b: ifne 172
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: aload 8
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: iload 3
      // 0a9: ifne 0bc
      // 0ac: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 0af: ifne 172
      // 0b2: goto 0b6
      // 0b5: athrow
      // 0b6: aload 8
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: iload 3
      // 0bd: ifne 0d3
      // 0c0: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 0c3: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 0c6: ifeq 172
      // 0c9: goto 0cd
      // 0cc: athrow
      // 0cd: aload 8
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: iload 3
      // 0d4: ifne 0ea
      // 0d7: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
      // 0da: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0dd: ifne 172
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: aload 8
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: iload 3
      // 0eb: ifne 101
      // 0ee: getstatic net/minecraft/class_2246.field_10164 Lnet/minecraft/class_2248;
      // 0f1: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0f4: ifne 172
      // 0f7: goto 0fb
      // 0fa: athrow
      // 0fb: aload 8
      // 0fd: goto 101
      // 100: athrow
      // 101: iload 3
      // 102: ifne 11e
      // 105: aload 1
      // 106: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 109: aload 7
      // 10b: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 10e: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 111: ifeq 127
      // 114: goto 118
      // 117: athrow
      // 118: aload 8
      // 11a: goto 11e
      // 11d: athrow
      // 11e: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // 121: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 124: ifeq 172
      // 127: aload 6
      // 129: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 12c: astore 9
      // 12e: aload 0
      // 12f: aload 1
      // 130: aload 9
      // 132: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bbbb (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)Z
      // 135: ifeq 172
      // 138: aload 9
      // 13a: aload 6
      // 13c: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 13f: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
      // 142: invokestatic net/minecraft/class_243.method_24954 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 145: ldc2_w 0.01
      // 148: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 14b: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 14e: astore 10
      // 150: aload 1
      // 151: aload 5
      // 153: aload 10
      // 155: aload 7
      // 157: aload 2
      // 158: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaba (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 15b: astore 11
      // 15d: aload 11
      // 15f: ifnull 172
      // 162: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab
      // 165: dup
      // 166: aload 11
      // 168: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 16b: aload 11
      // 16d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_3965;)V
      // 170: areturn
      // 171: athrow
      // 172: invokestatic net/minecraft/class_2350.values ()[Lnet/minecraft/class_2350;
      // 175: astore 7
      // 177: aload 7
      // 179: arraylength
      // 17a: istore 8
      // 17c: bipush 0
      // 17d: istore 9
      // 17f: iload 9
      // 181: iload 8
      // 183: if_icmpge 2a8
      // 186: aload 7
      // 188: iload 9
      // 18a: aaload
      // 18b: astore 10
      // 18d: iload 3
      // 18e: aload 2
      // 18f: aload 10
      // 191: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 194: astore 11
      // 196: aload 1
      // 197: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 19a: aload 11
      // 19c: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 19f: astore 12
      // 1a1: ifne 2a4
      // 1a4: aload 12
      // 1a6: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 1a9: ifne 2a1
      // 1ac: goto 1b0
      // 1af: athrow
      // 1b0: aload 12
      // 1b2: iload 3
      // 1b3: ifne 1ca
      // 1b6: goto 1ba
      // 1b9: athrow
      // 1ba: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 1bd: ifne 2a1
      // 1c0: goto 1c4
      // 1c3: athrow
      // 1c4: aload 12
      // 1c6: goto 1ca
      // 1c9: athrow
      // 1ca: iload 3
      // 1cb: ifne 1e1
      // 1ce: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 1d1: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 1d4: ifeq 2a1
      // 1d7: goto 1db
      // 1da: athrow
      // 1db: aload 12
      // 1dd: goto 1e1
      // 1e0: athrow
      // 1e1: getstatic net/minecraft/class_2246.field_10382 Lnet/minecraft/class_2248;
      // 1e4: iload 3
      // 1e5: ifne 203
      // 1e8: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 1eb: ifne 2a1
      // 1ee: goto 1f2
      // 1f1: athrow
      // 1f2: aload 12
      // 1f4: iload 3
      // 1f5: ifne 20f
      // 1f8: goto 1fc
      // 1fb: athrow
      // 1fc: getstatic net/minecraft/class_2246.field_10164 Lnet/minecraft/class_2248;
      // 1ff: goto 203
      // 202: athrow
      // 203: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 206: ifne 2a1
      // 209: aload 12
      // 20b: goto 20f
      // 20e: athrow
      // 20f: iload 3
      // 210: ifne 22c
      // 213: aload 1
      // 214: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 217: aload 11
      // 219: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 21c: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 21f: ifeq 239
      // 222: goto 226
      // 225: athrow
      // 226: aload 12
      // 228: goto 22c
      // 22b: athrow
      // 22c: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // 22f: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 232: ifne 239
      // 235: goto 2a1
      // 238: athrow
      // 239: aload 10
      // 23b: invokevirtual net/minecraft/class_2350.method_10153 ()Lnet/minecraft/class_2350;
      // 23e: astore 13
      // 240: aload 11
      // 242: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 245: aload 13
      // 247: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
      // 24a: invokestatic net/minecraft/class_243.method_24954 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 24d: ldc2_w 0.5
      // 250: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 253: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 256: astore 14
      // 258: aload 0
      // 259: aload 1
      // 25a: aload 14
      // 25c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.bbbb (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)Z
      // 25f: ifne 266
      // 262: goto 2a1
      // 265: athrow
      // 266: aload 14
      // 268: aload 13
      // 26a: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
      // 26d: invokestatic net/minecraft/class_243.method_24954 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 270: ldc2_w 0.01
      // 273: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 276: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 279: astore 15
      // 27b: iload 3
      // 27c: ifne 2a4
      // 27f: aload 1
      // 280: aload 5
      // 282: aload 15
      // 284: aload 11
      // 286: aload 2
      // 287: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaba (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 28a: astore 16
      // 28c: aload 16
      // 28e: ifnull 2a1
      // 291: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab
      // 294: dup
      // 295: aload 16
      // 297: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 29a: aload 16
      // 29c: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabab.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_3965;)V
      // 29f: areturn
      // 2a0: athrow
      // 2a1: iinc 9 1
      // 2a4: iload 3
      // 2a5: ifeq 17f
      // 2a8: aconst_null
      // 2a9: areturn
   }

   private List aaaab(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual net/minecraft/class_1657.method_5829 ()Lnet/minecraft/class_238;
      // 004: astore 3
      // 005: aload 1
      // 006: invokevirtual net/minecraft/class_1657.method_23318 ()D
      // 009: invokestatic java/lang/Math.floor (D)D
      // 00c: d2i
      // 00d: istore 4
      // 00f: aload 1
      // 010: invokevirtual net/minecraft/class_1657.method_23317 ()D
      // 013: iload 4
      // 015: i2d
      // 016: aload 1
      // 017: invokevirtual net/minecraft/class_1657.method_23321 ()D
      // 01a: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 01d: astore 5
      // 01f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 022: new java/util/ArrayList
      // 025: dup
      // 026: invokespecial java/util/ArrayList.<init> ()V
      // 029: astore 6
      // 02b: aload 6
      // 02d: aload 5
      // 02f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 034: pop
      // 035: aload 0
      // 036: aload 1
      // 037: aload 3
      // 038: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaa (Lnet/minecraft/class_1657;Lnet/minecraft/class_238;)Lnet/minecraft/class_238;
      // 03b: astore 7
      // 03d: aload 7
      // 03f: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
      // 042: astore 8
      // 044: istore 2
      // 045: aload 3
      // 046: getfield net/minecraft/class_238.field_1323 D
      // 049: aload 7
      // 04b: getfield net/minecraft/class_238.field_1323 D
      // 04e: invokestatic java/lang/Math.min (DD)D
      // 051: invokestatic java/lang/Math.floor (D)D
      // 054: d2i
      // 055: istore 9
      // 057: aload 3
      // 058: getfield net/minecraft/class_238.field_1320 D
      // 05b: aload 7
      // 05d: getfield net/minecraft/class_238.field_1320 D
      // 060: invokestatic java/lang/Math.max (DD)D
      // 063: ldc2_w 1.0E-7
      // 066: dsub
      // 067: invokestatic java/lang/Math.floor (D)D
      // 06a: d2i
      // 06b: istore 10
      // 06d: aload 3
      // 06e: getfield net/minecraft/class_238.field_1321 D
      // 071: aload 7
      // 073: getfield net/minecraft/class_238.field_1321 D
      // 076: invokestatic java/lang/Math.min (DD)D
      // 079: invokestatic java/lang/Math.floor (D)D
      // 07c: d2i
      // 07d: istore 11
      // 07f: aload 3
      // 080: getfield net/minecraft/class_238.field_1324 D
      // 083: aload 7
      // 085: getfield net/minecraft/class_238.field_1324 D
      // 088: invokestatic java/lang/Math.max (DD)D
      // 08b: ldc2_w 1.0E-7
      // 08e: dsub
      // 08f: invokestatic java/lang/Math.floor (D)D
      // 092: d2i
      // 093: istore 12
      // 095: aload 7
      // 097: getfield net/minecraft/class_238.field_1322 D
      // 09a: invokestatic java/lang/Math.floor (D)D
      // 09d: d2i
      // 09e: istore 13
      // 0a0: iload 9
      // 0a2: istore 14
      // 0a4: iload 14
      // 0a6: iload 10
      // 0a8: if_icmpgt 139
      // 0ab: iload 2
      // 0ac: ifne 14a
      // 0af: iload 11
      // 0b1: istore 15
      // 0b3: iload 15
      // 0b5: iload 12
      // 0b7: if_icmpgt 132
      // 0ba: new net/minecraft/class_2338
      // 0bd: dup
      // 0be: iload 14
      // 0c0: iload 4
      // 0c2: iload 15
      // 0c4: invokespecial net/minecraft/class_2338.<init> (III)V
      // 0c7: astore 16
      // 0c9: iload 2
      // 0ca: ifne 135
      // 0cd: aload 6
      // 0cf: aload 16
      // 0d1: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 0d6: iload 2
      // 0d7: ifne 0f5
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: ifne 0f3
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: aload 6
      // 0e7: aload 16
      // 0e9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0ee: pop
      // 0ef: goto 0f3
      // 0f2: athrow
      // 0f3: iload 13
      // 0f5: iload 4
      // 0f7: if_icmpeq 12b
      // 0fa: new net/minecraft/class_2338
      // 0fd: dup
      // 0fe: iload 14
      // 100: iload 13
      // 102: iload 15
      // 104: invokespecial net/minecraft/class_2338.<init> (III)V
      // 107: astore 17
      // 109: iload 2
      // 10a: ifne 12e
      // 10d: aload 6
      // 10f: aload 17
      // 111: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 116: ifne 12b
      // 119: goto 11d
      // 11c: athrow
      // 11d: aload 6
      // 11f: aload 17
      // 121: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 126: pop
      // 127: goto 12b
      // 12a: athrow
      // 12b: iinc 15 1
      // 12e: iload 2
      // 12f: ifeq 0b3
      // 132: iinc 14 1
      // 135: iload 2
      // 136: ifeq 0a4
      // 139: aload 6
      // 13b: aload 8
      // 13d: invokedynamic applyAsDouble (Lnet/minecraft/class_243;)Ljava/util/function/ToDoubleFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)D, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aabba (Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)D, (Lnet/minecraft/class_2338;)D ]
      // 142: invokestatic java/util/Comparator.comparingDouble (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
      // 145: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 14a: aload 6
      // 14c: areturn
   }

   private void aaaba() {
      this.bbb = -1;
      this.baa = -1;
      this.abba = babb(a(449021922, -1009508007 ^ 1971696644), 3602432637446823623L);
      this.bab = babb(a(449021921, -1009508007 ^ 318966669), 4409055151339012036L);
   }

   private boolean aaabb(class_310 param1, class_1657 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: aload 2
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababbb.aaaab (Lnet/minecraft/class_1657;)Ljava/util/List;
      // 08: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d: astore 4
      // 0f: istore 3
      // 10: aload 4
      // 12: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17: ifeq 4e
      // 1a: aload 4
      // 1c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21: checkcast net/minecraft/class_2338
      // 24: astore 5
      // 26: aload 1
      // 27: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2a: aload 5
      // 2c: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2f: getstatic net/minecraft/class_2246.field_10343 Lnet/minecraft/class_2248;
      // 32: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 35: iload 3
      // 36: ifne 4f
      // 39: iload 3
      // 3a: ifne 49
      // 3d: goto 41
      // 40: athrow
      // 41: ifeq 4a
      // 44: goto 48
      // 47: athrow
      // 48: bipush 1
      // 49: ireturn
      // 4a: iload 3
      // 4b: ifeq 10
      // 4e: bipush 0
      // 4f: ireturn
   }

   private static boolean aabab(class_310 var0, aaabab var1) {
      return aabbabbbb.bbababa(var0, var1.b());
   }

   @Override
   public void aabaa() {
      this.aaaba();
      this.abaa.aaaa();
      this.abaa.aaaabba();
   }

   public aababbb() {
      int var1 = 1154340922;
      super(
         aabbaaaba.aaab(aaab(a(449021890, var1 ^ -231406868), a(449021889, var1 ^ -1625834094))),
         bbaabbba.aa,
         aabbaaaba.aaab(aaab(a(449021888, var1 ^ -1021048780), a(449021895, var1 ^ -1066995748)))
      );
      this.aabb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aaab(a(449021894, var1 ^ -1012739937), a(449021893, var1 ^ 961306143))),
            bbabb.class,
            bbabb.b
         )
      );
      this.bba = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aaab(a(449021892, var1 ^ 1859753419), a(449021915, var1 ^ -1493577860))),
            bbbba.class,
            bbbba.a
         )
      );
      this.aa = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(aaab(a(449021914, var1 ^ -1492823327), a(449021913, var1 ^ 1403967185))),
            bbb.class,
            bbb.b
         )
      );
      this.ab = (bababa)this.abbbaaa(
         (bababa)new bababa(
               aabbaaaba.aaab(aaab(a(449021912, var1 ^ 2058528677), a(449021919, var1 ^ 45807358))), 50.0, 1.0, 100.0, 1.0
            )
            .babb(this::abaaa)
      );
      this.abb = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(aaab(a(449021918, var1 ^ 592958946), a(449021917, var1 ^ 1493630138))), 4.5, 1.0, 6.0, 0.1
            )
            .bba(aabbaaaba.aaab(aaab(a(449021916, var1 ^ 782670720), a(449021907, var1 ^ -48925430))))
      );
      this.aba = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(aaab(a(449021906, var1 ^ 263650555), a(449021905, var1 ^ 1195539113))),
               0.0,
               0.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(aaab(a(449021904, var1 ^ 1160144531), a(449021911, var1 ^ 1473012118))))
      );
      this.aaab = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(aaab(a(449021910, var1 ^ 281658712), a(449021909, var1 ^ -1441980732))),
               50.0,
               75.0,
               0.0,
               500.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(aaab(a(449021908, var1 ^ -1256414553), a(449021867, var1 ^ -1715750308))))
      );
      this.abab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaab(a(449021866, var1 ^ -366727237), a(449021865, var1 ^ -2069113746))), true
         )
      );
      this.bb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(aaab(a(449021864, var1 ^ 1106560094), a(449021871, var1 ^ 370032304))), false
         )
      );
      this.abaa = new ababbbbba();
      this.bbb = -1;
      this.baa = -1;
      this.abba = babb(a(449021870, var1 ^ 270478364), 4409055151339012036L);
      this.bab = babb(a(449021869, var1 ^ -1831637686), 4409055151339012036L);
   }

   @Override
   public void abaab() {
      this.aaaba();
      this.abaa.babbbb();
   }

   private static double aabba(class_243 var0, class_2338 var1) {
      return class_243.method_24953(var1).method_1025(var0);
   }

   private boolean abaaa() {
      try {
         if (this.aa.abbb() == bbb.aa) {
            return true;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return false;
   }
}
