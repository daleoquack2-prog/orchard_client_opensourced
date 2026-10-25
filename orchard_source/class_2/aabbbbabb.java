package nsc;

import com.google.gson.JsonObject;
import java.util.LinkedHashSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class aabbbbabb extends abbaabbaa {
   private static final long ba;
   private aabbaabbb aaa;
   private final bababa aab;
   private static final long aba;
   private static final Integer[] abb;
   private static final long[] baa;
   private static final int bab = 1;
   private static final double bba = 0.2;
   private boolean bbb;
   private final baabaab aaaa;
   private int aaab;
   private static final double aaba = 1.0;
   private static final long aa;
   private boolean aabb;
   private int abaa;
   private float abab;
   private boolean abba;
   private static final int abbb;
   private class_2338 baaa;
   private float baab;
   private static final double baba = 0.22;
   private final abbaaaaa ab;
   private boolean babb;
   private static final double bbaa = 20.25;
   private static final long[] bbab;
   private static final double bbba = 0.38;
   private float bbbb;
   private static final double aaaaa = 0.05;
   private static final String[] aaaab;
   private static final int bb;
   private static final double aaaba = 0.08;
   private class_2338 aaabb;
   private static final double aabaa = 0.99;
   private final bababa aabab;
   private int aabba;
   private float aabbb;
   private float abaaa;
   private int abaab;
   private int ababa;
   private static final double ababb = 0.08;
   private static final double abbaa = 0.58;
   private int abbab;
   private static final double abbba = 0.1;
   private static final int abbbb = 1;
   private float baaaa;
   private static final long baaab;
   private static final int baaba;
   private int baabb;
   private abbbabaaa babaa;
   private class_1268 babab;
   private static final Object[] baaabb;
   private static final String[] baaaba;
   private static final double babba = 0.125;
   private static final double babbb = 0.0;
   private static final double bbaaa = 1.6;
   private int bbaab;
   private final ababbbbba bbaba;
   private long bbabb;
   private class_2680 bbbaa;
   private final baabaab bbbab;
   private final baabaab bbbba;
   private final abbaaaaa bbbbb;
   private boolean aaaaaa;
   private boolean aaaaab;
   private float aaaaba;
   private static final Long[] aaaabb;
   private int aaabaa;
   private final abbaaaaa aaabab;
   private static final int aaabba;
   private aaabaaaaa aaabbb;
   private final aaabbbab aabaaa;
   private static final double aabaab = 3.15;
   private static final ababbbbaa aababa;
   private float aababb;
   private class_2338 aabbaa;
   private static final float aabbab = 0.5F;
   private long aabbba;
   private static final double aabbbb = 0.0;
   private int abaaaa;
   private int abaaab;
   private final aaabbabb abaaba;
   private static final int[] baaaab;
   private abbbabaaa abaabb;
   private bbbbaaaa ababaa;
   private boolean ababab;
   private class_2338 ababba;
   private static final String[] ababbb;
   private class_2338 abbaaa;
   private static final int abbaab;
   private class_3965 abbaba;
   private static final double abbabb = 4.5;
   private static final ababbbbaa abbbaa;
   private final abbaaaaa abbbab;
   private static final double abbbba = 0.0625;
   private int abbbbb;
   private final baabaab baaaaa;

   private class_243 aa(class_2338 var1) {
      return this.bbabb(var1).method_1023(0.0, 0.0625, 0.0);
   }

   private boolean ab(class_310 var1, int var2, class_3965 var3) {
      return this.abbaba(var1, var2, var3);
   }

   private boolean ba(class_310 param1, int param2, class_3965 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: iload 2
      // 06: iload 4
      // 08: ifne 9f
      // 0b: aload 0
      // 0c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbbbb I
      // 0f: if_icmpne 9a
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 1a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 1d: if_acmpne 9a
      // 20: goto 24
      // 23: athrow
      // 24: aload 1
      // 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 28: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 2b: fstore 5
      // 2d: aload 1
      // 2e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 31: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 34: fstore 6
      // 36: aload 1
      // 37: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3a: aload 0
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baab F
      // 3e: invokevirtual net/minecraft/class_746.method_36456 (F)V
      // 41: aload 1
      // 42: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 45: aload 0
      // 46: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbb F
      // 49: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // 4c: aload 1
      // 4d: aload 3
      // 4e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbababa (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 51: istore 7
      // 53: iload 7
      // 55: iload 4
      // 57: ifne 6c
      // 5a: ifne 6a
      // 5d: goto 61
      // 60: athrow
      // 61: aload 1
      // 62: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;)Z
      // 68: istore 7
      // 6a: iload 7
      // 6c: istore 8
      // 6e: aload 1
      // 6f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 72: fload 5
      // 74: invokevirtual net/minecraft/class_746.method_36456 (F)V
      // 77: aload 1
      // 78: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7b: fload 6
      // 7d: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // 80: iload 8
      // 82: ireturn
      // 83: astore 9
      // 85: aload 1
      // 86: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 89: fload 5
      // 8b: invokevirtual net/minecraft/class_746.method_36456 (F)V
      // 8e: aload 1
      // 8f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 92: fload 6
      // 94: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // 97: aload 9
      // 99: athrow
      // 9a: aload 1
      // 9b: aload 3
      // 9c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbababa (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 9f: ireturn
   }

   private boolean bb(class_310 param1) {
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
      // 06: ifne 6a
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 0f: if_acmpne 65
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: iload 2
      // 18: ifne 6a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 22: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 25: if_acmpne 65
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: iload 2
      // 2e: ifne 6a
      // 31: goto 35
      // 34: athrow
      // 35: aload 1
      // 36: aload 0
      // 37: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 3d: ifeq 65
      // 40: goto 44
      // 43: athrow
      // 44: aload 0
      // 45: aload 1
      // 46: iload 2
      // 47: ifne 75
      // 4a: goto 4e
      // 4d: athrow
      // 4e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 51: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 54: aload 0
      // 55: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaab I
      // 58: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 5b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abababa (Lnet/minecraft/class_1799;)Z
      // 5e: ifne 6f
      // 61: goto 65
      // 64: athrow
      // 65: aload 0
      // 66: goto 6a
      // 69: athrow
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaab ()V
      // 6d: bipush 0
      // 6e: ireturn
      // 6f: aload 0
      // 70: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbaab ()V
      // 73: aload 0
      // 74: aload 1
      // 75: aload 0
      // 76: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaab I
      // 79: aload 0
      // 7a: aload 0
      // 7b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 7e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 81: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaba (Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Z
      // 84: istore 3
      // 85: iload 2
      // 86: ifne a7
      // 89: iload 3
      // 8a: ifeq ab
      // 8d: goto 91
      // 90: athrow
      // 91: aload 0
      // 92: dup
      // 93: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab I
      // 96: bipush 1
      // 97: iadd
      // 98: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab I
      // 9b: aload 0
      // 9c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 9f: aload 1
      // a0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // a3: goto a7
      // a6: athrow
      // a7: iload 2
      // a8: ifeq b3
      // ab: aload 0
      // ac: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaab ()V
      // af: goto b3
      // b2: athrow
      // b3: iload 3
      // b4: ireturn
   }

   static class_2338[] aaa(class_2338 var0, class_2350 var1) {
      class_2350 var3 = var1.method_10153();
      int var10000 = baaabbaa.bba;
      class_2350 var4 = var3.method_10170();
      LinkedHashSet var5 = new LinkedHashSet();
      var5.add(var0.method_10093(var3));
      var5.add(var0.method_10079(var3, 2));
      int var2 = var10000;
      var5.add(var0.method_10093(var4));
      var5.add(var0.method_10093(var3.method_10160()));
      int[] var6 = new int[]{0, 1, -1, 2, bbaaa(a(-462442855, 323368191 ^ 1741955588), 4732360392708722278L)};
      int var7 = var6.length;
      int var8 = 0;

      while (var8 < var7) {
         int var9 = var6[var8];
         int var10 = 1;

         while (true) {
            if (var10 <= 2) {
               if (var2 != 0) {
                  break;
               }

               int var11 = var10;

               label73: {
                  label72:
                  while (true) {
                     var10000 = var11;
                     int var10001 = -var10;

                     label70:
                     while (true) {
                        if (var10000 < var10001) {
                           break label72;
                        }

                        if (var2 != 0) {
                           break label73;
                        }

                        int var12 = -var10;

                        while (var12 <= var10) {
                           label63: {
                              try {
                                 if (var2 != 0) {
                                    break label63;
                                 }

                                 var10000 = Math.abs(var11);
                                 var10001 = Math.abs(var12);
                                 if (var2 != 0) {
                                    continue label70;
                                 }
                              } catch (RuntimeException var14) {
                                 throw var14;
                              }

                              try {
                                 if (Math.max(var10000, var10001) == var10) {
                                    var5.add(
                                       var0.method_10069(
                                          var3.method_10148() * var11 + var4.method_10148() * var12,
                                          var9,
                                          var3.method_10165() * var11 + var4.method_10165() * var12
                                       )
                                    );
                                 }
                              } catch (RuntimeException var13) {
                                 throw var13;
                              }
                           }

                           var12++;
                           if (var2 != 0) {
                              break;
                           }
                        }

                        var11--;
                        if (var2 != 0) {
                           break label72;
                        }
                        break;
                     }
                  }

                  var10++;
               }

               if (var2 == 0) {
                  continue;
               }
            }

            var8++;
            break;
         }

         if (var2 != 0) {
            break;
         }
      }

      return var5.toArray(aabbbbabb::aabbbab);
   }

   private abbbabaaa aab() {
      try {
         if (this.aaabb != null) {
            return abbbabaaa.aaa;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      return abbbabaaa.aba;
   }

   private class_1799 aba(class_310 param1) {
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
      // 09: ifnull 17
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnonnull 1c
      // 17: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 1a: areturn
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 2
      // 1e: ifne 38
      // 21: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babab Lnet/minecraft/class_1268;
      // 24: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 27: if_acmpne 37
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 1
      // 2f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 32: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 35: areturn
      // 36: athrow
      // 37: aload 0
      // 38: iload 2
      // 39: ifne 4b
      // 3c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa I
      // 3f: iflt 64
      // 42: goto 46
      // 45: athrow
      // 46: aload 0
      // 47: goto 4b
      // 4a: athrow
      // 4b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa I
      // 4e: ldc_w -462442856
      // 51: ldc_w -113359452
      // 54: ldc_w 1404824694
      // 57: ixor
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 5b: ldc2_w 7050441791445182372
      // 5e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 61: if_icmplt 69
      // 64: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 67: areturn
      // 68: athrow
      // 69: aload 1
      // 6a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 6d: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 70: aload 0
      // 71: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa I
      // 74: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 77: areturn
   }

   @Override
   public void abbbba(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 02c
      // 009: aload 1
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbba (Lnet/minecraft/class_310;)Z
      // 00d: ifne 01e
      // 010: goto 014
      // 013: athrow
      // 014: aload 0
      // 015: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abb ()V
      // 018: aload 0
      // 019: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaba ()V
      // 01c: return
      // 01d: athrow
      // 01e: aload 0
      // 01f: iload 2
      // 020: ifne 03a
      // 023: aload 1
      // 024: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbbb (Lnet/minecraft/class_310;)V
      // 027: aload 0
      // 028: goto 02c
      // 02b: athrow
      // 02c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 02f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 032: if_acmpne 0ce
      // 035: aload 0
      // 036: goto 03a
      // 039: athrow
      // 03a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaaba ()Z
      // 03d: iload 2
      // 03e: ifne 051
      // 041: ifne 049
      // 044: goto 048
      // 047: athrow
      // 048: return
      // 049: aload 1
      // 04a: aload 0
      // 04b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaabba ()Lnet/minecraft/class_3675$class_306;
      // 04e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbab (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 051: istore 3
      // 052: iload 3
      // 053: iload 2
      // 054: ifne 066
      // 057: ifeq 075
      // 05a: goto 05e
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaa Z
      // 062: goto 066
      // 065: athrow
      // 066: iload 2
      // 067: ifne 072
      // 06a: ifne 075
      // 06d: goto 071
      // 070: athrow
      // 071: bipush 1
      // 072: goto 076
      // 075: bipush 0
      // 076: istore 4
      // 078: aload 0
      // 079: iload 3
      // 07a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaa Z
      // 07d: iload 3
      // 07e: iload 2
      // 07f: ifne 094
      // 082: ifne 092
      // 085: goto 089
      // 088: athrow
      // 089: aload 0
      // 08a: bipush 0
      // 08b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abba Z
      // 08e: goto 092
      // 091: athrow
      // 092: iload 4
      // 094: iload 2
      // 095: ifne 0af
      // 098: ifeq 0b2
      // 09b: goto 09f
      // 09e: athrow
      // 09f: aload 0
      // 0a0: iload 2
      // 0a1: ifne 0b9
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abba Z
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: ifeq 0b3
      // 0b2: return
      // 0b3: aload 0
      // 0b4: bipush 1
      // 0b5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abba Z
      // 0b8: aload 0
      // 0b9: aload 1
      // 0ba: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababbb (Lnet/minecraft/class_310;)Z
      // 0bd: iload 2
      // 0be: ifne 0cf
      // 0c1: ifne 0ce
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaba ()V
      // 0cc: return
      // 0cd: athrow
      // 0ce: bipush 0
      // 0cf: istore 3
      // 0d0: iload 3
      // 0d1: ldc_w -462442853
      // 0d4: ldc_w 1792333781
      // 0d7: ldc_w -47188650
      // 0da: ixor
      // 0db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 0de: ldc2_w 5684377705467302658
      // 0e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 0e4: if_icmpge 22d
      // 0e7: invokestatic java/lang/System.currentTimeMillis ()J
      // 0ea: lstore 4
      // 0ec: lload 4
      // 0ee: aload 0
      // 0ef: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbba J
      // 0f2: lsub
      // 0f3: ldc_w -462442854
      // 0f6: ldc_w 1792333781
      // 0f9: ldc_w -2053677667
      // 0fc: ixor
      // 0fd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 100: ldc2_w 2611587416275597033
      // 103: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 106: lcmp
      // 107: iload 2
      // 108: ifne 11e
      // 10b: ifle 119
      // 10e: goto 112
      // 111: athrow
      // 112: aload 0
      // 113: aload 1
      // 114: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 117: return
      // 118: athrow
      // 119: aload 0
      // 11a: aload 1
      // 11b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbbaa (Lnet/minecraft/class_310;)Z
      // 11e: iload 2
      // 11f: ifne 134
      // 122: ifne 137
      // 125: goto 129
      // 128: athrow
      // 129: lload 4
      // 12b: aload 0
      // 12c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 12f: lcmp
      // 130: goto 134
      // 133: athrow
      // 134: ifge 138
      // 137: return
      // 138: aload 0
      // 139: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 13c: astore 6
      // 13e: aload 6
      // 140: iload 2
      // 141: ifne 211
      // 144: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.ordinal ()I
      // 147: tableswitch 190 0 9 190 80 93 106 54 67 119 132 145 158
      // 17c: athrow
      // 17d: aload 0
      // 17e: aload 1
      // 17f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab (Lnet/minecraft/class_310;)V
      // 182: iload 2
      // 183: ifeq 205
      // 186: goto 18a
      // 189: athrow
      // 18a: aload 0
      // 18b: aload 1
      // 18c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aababba (Lnet/minecraft/class_310;)V
      // 18f: iload 2
      // 190: ifeq 205
      // 193: goto 197
      // 196: athrow
      // 197: aload 0
      // 198: aload 1
      // 199: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baba (Lnet/minecraft/class_310;)V
      // 19c: iload 2
      // 19d: ifeq 205
      // 1a0: goto 1a4
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: aload 1
      // 1a6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabb (Lnet/minecraft/class_310;)V
      // 1a9: iload 2
      // 1aa: ifeq 205
      // 1ad: goto 1b1
      // 1b0: athrow
      // 1b1: aload 0
      // 1b2: aload 1
      // 1b3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaab (Lnet/minecraft/class_310;)V
      // 1b6: iload 2
      // 1b7: ifeq 205
      // 1ba: goto 1be
      // 1bd: athrow
      // 1be: aload 0
      // 1bf: aload 1
      // 1c0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbab (Lnet/minecraft/class_310;)V
      // 1c3: iload 2
      // 1c4: ifeq 205
      // 1c7: goto 1cb
      // 1ca: athrow
      // 1cb: aload 0
      // 1cc: aload 1
      // 1cd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaa (Lnet/minecraft/class_310;)V
      // 1d0: iload 2
      // 1d1: ifeq 205
      // 1d4: goto 1d8
      // 1d7: athrow
      // 1d8: aload 0
      // 1d9: aload 1
      // 1da: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaab (Lnet/minecraft/class_310;)V
      // 1dd: iload 2
      // 1de: ifeq 205
      // 1e1: goto 1e5
      // 1e4: athrow
      // 1e5: aload 0
      // 1e6: iload 2
      // 1e7: ifne 206
      // 1ea: goto 1ee
      // 1ed: athrow
      // 1ee: aload 1
      // 1ef: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababaaa (Lnet/minecraft/class_310;)Z
      // 1f2: ifeq 205
      // 1f5: goto 1f9
      // 1f8: athrow
      // 1f9: aload 0
      // 1fa: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abb ()V
      // 1fd: aload 0
      // 1fe: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaba ()V
      // 201: goto 205
      // 204: athrow
      // 205: aload 0
      // 206: iload 2
      // 207: ifne 21b
      // 20a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 20d: goto 211
      // 210: athrow
      // 211: aload 6
      // 213: if_acmpeq 224
      // 216: aload 0
      // 217: goto 21b
      // 21a: athrow
      // 21b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 21e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 221: if_acmpne 226
      // 224: return
      // 225: athrow
      // 226: iinc 3 1
      // 229: iload 2
      // 22a: ifeq 0d0
      // 22d: return
   }

   private void abb() {
      this.abaabb = abbbabaaa.aab;
      this.aabbaa = null;
      this.baaa = null;
      this.aabba = -1;
      this.abbbbb = -1;
      this.aaabbb = aaabaaaaa.b;
      this.aaab = -1;
      this.abaab = -1;
      this.ababba = null;
      this.bbbaa = null;
      this.aaaaab = false;
      this.aaabb = null;
      this.ababab = false;
      this.abaa = 1;
      this.abbab = 0;
      this.abaaaa = -1;
      this.babab = class_1268.field_5808;
      this.aabbba = 0L;
      this.bbabb = 0L;
      this.baab = 0.0F;
      this.aabbb = 0.0F;
      this.abab = 0.0F;
      this.aababb = 0.0F;
      this.bbbb = 0.0F;
      this.aaaaba = 0.0F;
      this.abaaa = 0.0F;
      this.baaaa = 0.0F;
      this.bbbbaab();
      this.babb = false;
      this.aaabaa = bbaaa(a(-462442851, -1273064887 ^ -1110653864), 5579952000272572156L);
      this.ababaa = null;
      this.abaaba.b();
   }

   static double[] bab(class_243 param0, class_2338 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 0
      // 05: ifnull 1c
      // 08: aload 1
      // 09: iload 3
      // 0a: ifne 20
      // 0d: goto 11
      // 10: athrow
      // 11: aload 2
      // 12: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bababb (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Z
      // 15: ifne 1f
      // 18: goto 1c
      // 1b: athrow
      // 1c: aconst_null
      // 1d: areturn
      // 1e: athrow
      // 1f: aload 2
      // 20: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 23: i2d
      // 24: ldc2_w 0.5
      // 27: dadd
      // 28: aload 0
      // 29: getfield net/minecraft/class_243.field_1350 D
      // 2c: dsub
      // 2d: aload 2
      // 2e: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 31: i2d
      // 32: ldc2_w 0.5
      // 35: dadd
      // 36: aload 0
      // 37: getfield net/minecraft/class_243.field_1352 D
      // 3a: dsub
      // 3b: invokestatic java/lang/Math.atan2 (DD)D
      // 3e: invokestatic java/lang/Math.toDegrees (D)D
      // 41: dstore 4
      // 43: aload 0
      // 44: aload 2
      // 45: dload 4
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabaa (Lnet/minecraft/class_243;Lnet/minecraft/class_2338;D)[D
      // 4a: astore 6
      // 4c: aload 0
      // 4d: aload 1
      // 4e: dload 4
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabaa (Lnet/minecraft/class_243;Lnet/minecraft/class_2338;D)[D
      // 53: astore 7
      // 55: aconst_null
      // 56: astore 8
      // 58: ldc2_w Infinity
      // 5b: dstore 9
      // 5d: bipush -1
      // 5e: istore 11
      // 60: iload 11
      // 62: bipush 1
      // 63: if_icmpgt dc
      // 66: aload 6
      // 68: iload 3
      // 69: ifne de
      // 6c: bipush 0
      // 6d: daload
      // 6e: aload 7
      // 70: bipush 0
      // 71: daload
      // 72: iload 11
      // 74: i2d
      // 75: ldc2_w 360.0
      // 78: dmul
      // 79: dadd
      // 7a: invokestatic java/lang/Math.max (DD)D
      // 7d: dstore 12
      // 7f: iload 3
      // 80: aload 6
      // 82: bipush 1
      // 83: daload
      // 84: aload 7
      // 86: bipush 1
      // 87: daload
      // 88: iload 11
      // 8a: i2d
      // 8b: ldc2_w 360.0
      // 8e: dmul
      // 8f: dadd
      // 90: invokestatic java/lang/Math.min (DD)D
      // 93: dstore 14
      // 95: ifne d8
      // 98: dload 12
      // 9a: dload 14
      // 9c: dcmpg
      // 9d: ifgt d5
      // a0: goto a4
      // a3: athrow
      // a4: dload 12
      // a6: dload 14
      // a8: dadd
      // a9: ldc2_w 0.5
      // ac: dmul
      // ad: invokestatic java/lang/Math.abs (D)D
      // b0: dstore 16
      // b2: iload 3
      // b3: ifne d8
      // b6: dload 16
      // b8: dload 9
      // ba: dcmpg
      // bb: ifge d5
      // be: goto c2
      // c1: athrow
      // c2: dload 16
      // c4: dstore 9
      // c6: bipush 2
      // c7: newarray 7
      // c9: dup
      // ca: bipush 0
      // cb: dload 12
      // cd: dastore
      // ce: dup
      // cf: bipush 1
      // d0: dload 14
      // d2: dastore
      // d3: astore 8
      // d5: iinc 11 1
      // d8: iload 3
      // d9: ifeq 60
      // dc: aload 8
      // de: areturn
   }

   private boolean bba(class_310 var1, int var2, class_3965 var3) {
      return this.ba(var1, var2, var3);
   }

   private boolean bbb(class_310 param1) {
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
      // 06: ifne 1b
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 0f: if_acmpne 29
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: goto 1b
      // 1a: athrow
      // 1b: iload 2
      // 1c: ifne 56
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb Z
      // 22: ifne 2c
      // 25: goto 29
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
      // 2b: athrow
      // 2c: aload 0
      // 2d: aconst_null
      // 2e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;
      // 31: aload 0
      // 32: iload 2
      // 33: ifne 92
      // 36: bipush 0
      // 37: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb Z
      // 3a: aload 0
      // 3b: ldc_w -462442852
      // 3e: ldc_w -53513527
      // 41: ldc_w -461654365
      // 44: ixor
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 48: ldc2_w 6346800741384915863
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 4e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaa I
      // 51: aload 0
      // 52: goto 56
      // 55: athrow
      // 56: aload 1
      // 57: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaa (Lnet/minecraft/class_310;)Z
      // 5a: ifeq 8d
      // 5d: aload 0
      // 5e: iload 2
      // 5f: ifne 92
      // 62: goto 66
      // 65: athrow
      // 66: aload 1
      // 67: aload 0
      // 68: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 6b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 6e: ifeq 8d
      // 71: goto 75
      // 74: athrow
      // 75: aload 0
      // 76: aload 1
      // 77: iload 2
      // 78: ifne 9a
      // 7b: goto 7f
      // 7e: athrow
      // 7f: aload 0
      // 80: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 83: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 86: ifne 98
      // 89: goto 8d
      // 8c: athrow
      // 8d: aload 0
      // 8e: goto 92
      // 91: athrow
      // 92: aload 1
      // 93: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 96: bipush 0
      // 97: ireturn
      // 98: aload 0
      // 99: aload 1
      // 9a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbbaa (Lnet/minecraft/class_310;)Z
      // 9d: istore 3
      // 9e: iload 2
      // 9f: ifne b6
      // a2: iload 3
      // a3: ifeq ba
      // a6: goto aa
      // a9: athrow
      // aa: aload 0
      // ab: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // ae: aload 1
      // af: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // b2: goto b6
      // b5: athrow
      // b6: iload 2
      // b7: ifeq c3
      // ba: aload 0
      // bb: aload 1
      // bc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // bf: goto c3
      // c2: athrow
      // c3: iload 3
      // c4: ireturn
   }

   private aaaaaabaa aaaa(class_1799 param1) {
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
      // 06: ifne 1c
      // 09: ifnonnull 15
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: goto 1f
      // 14: athrow
      // 15: aload 1
      // 16: getstatic net/minecraft/class_9334.field_49649 Lnet/minecraft/class_9331;
      // 19: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 1c: checkcast net/minecraft/class_9278
      // 1f: astore 3
      // 20: aload 3
      // 21: iload 2
      // 22: ifne 2d
      // 25: ifnull 42
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 3
      // 2d: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
      // 30: invokevirtual net/minecraft/class_9278.method_57438 (Lnet/minecraft/class_1792;)Z
      // 33: iload 2
      // 34: ifne 3f
      // 37: ifeq 42
      // 3a: goto 3e
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 43
      // 42: bipush 0
      // 43: istore 4
      // 45: iload 4
      // 47: ifeq 5c
      // 4a: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa
      // 4d: dup
      // 4e: ldc2_w 1.6
      // 51: ldc2_w 0.99
      // 54: dconst_0
      // 55: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.<init> (DDD)V
      // 58: goto 6c
      // 5b: athrow
      // 5c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa
      // 5f: dup
      // 60: ldc2_w 3.15
      // 63: ldc2_w 0.99
      // 66: ldc2_w 0.05
      // 69: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.<init> (DDD)V
      // 6c: areturn
   }

   private boolean aaab(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 4a
      // 17: iload 2
      // 18: iload 3
      // 19: ifne 54
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 4a
      // 23: goto 27
      // 26: athrow
      // 27: iload 2
      // 28: iload 3
      // 29: ifne 63
      // 2c: goto 30
      // 2f: athrow
      // 30: ldc_w -462442849
      // 33: ldc_w 1761530704
      // 36: ldc_w 780924315
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 3d: ldc2_w 7050441791445182372
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 43: if_icmplt 55
      // 46: goto 4a
      // 49: athrow
      // 4a: aload 0
      // 4b: aload 1
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 4f: bipush 0
      // 50: goto 54
      // 53: athrow
      // 54: ireturn
      // 55: aload 0
      // 56: iload 3
      // 57: ifne 6a
      // 5a: aload 1
      // 5b: iload 2
      // 5c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbb (Lnet/minecraft/class_310;I)Z
      // 5f: goto 63
      // 62: athrow
      // 63: ifne 69
      // 66: bipush 0
      // 67: ireturn
      // 68: athrow
      // 69: aload 0
      // 6a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaa ()Z
      // 6d: iload 3
      // 6e: ifne 97
      // 71: ifne 92
      // 74: goto 78
      // 77: athrow
      // 78: aload 1
      // 79: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 7f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 82: iload 3
      // 83: ifne ad
      // 86: goto 8a
      // 89: athrow
      // 8a: iload 2
      // 8b: if_icmpne 98
      // 8e: goto 92
      // 91: athrow
      // 92: bipush 1
      // 93: goto 97
      // 96: athrow
      // 97: ireturn
      // 98: aload 0
      // 99: aconst_null
      // 9a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaaaa;
      // 9d: aload 1
      // 9e: iload 2
      // 9f: bipush 1
      // a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaaa (Lnet/minecraft/class_310;IZ)V
      // a3: aload 1
      // a4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a7: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // ad: iload 3
      // ae: ifne be
      // b1: iload 2
      // b2: if_icmpne c1
      // b5: goto b9
      // b8: athrow
      // b9: bipush 1
      // ba: goto be
      // bd: athrow
      // be: goto c2
      // c1: bipush 0
      // c2: ireturn
   }

   private boolean aaba(
      class_310 param1, abbbabaaa param2, abbbabaaa param3, BooleanSupplier param4
   ) {
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
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 09: iload 5
      // 0b: ifne 27
      // 0e: aload 2
      // 0f: if_acmpne 2b
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: iload 5
      // 19: ifne 38
      // 1c: goto 20
      // 1f: athrow
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: if_acmpeq 2e
      // 2b: bipush 0
      // 2c: ireturn
      // 2d: athrow
      // 2e: aload 0
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbaab ()V
      // 32: aload 0
      // 33: aload 1
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb (Lnet/minecraft/class_310;)V
      // 37: aload 0
      // 38: aload 4
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbabb (Ljava/util/function/BooleanSupplier;)Z
      // 3d: istore 6
      // 3f: iload 5
      // 41: ifne 57
      // 44: iload 6
      // 46: ifeq 5c
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 0
      // 4e: aload 3
      // 4f: aload 1
      // 50: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // 53: goto 57
      // 56: athrow
      // 57: iload 5
      // 59: ifeq 7b
      // 5c: aload 0
      // 5d: invokestatic java/lang/System.currentTimeMillis ()J
      // 60: ldc_w -462442850
      // 63: ldc_w 1085925225
      // 66: ldc_w 901559929
      // 69: ixor
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 6d: ldc2_w 6474695175696088868
      // 70: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 73: ladd
      // 74: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 77: goto 7b
      // 7a: athrow
      // 7b: iload 6
      // 7d: ireturn
   }

   private boolean aabb(class_310 param1) {
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
      // 09: ifnull 3d
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 3d
      // 17: aload 0
      // 18: iload 2
      // 19: ifne 2f
      // 1c: goto 20
      // 1f: athrow
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 23: ifnull 3d
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 0
      // 2b: goto 2f
      // 2e: athrow
      // 2f: iload 2
      // 30: ifne 41
      // 33: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 36: ifnonnull 40
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: athrow
      // 40: aload 0
      // 41: aload 1
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aba (Lnet/minecraft/class_310;)Lnet/minecraft/class_1799;
      // 45: astore 3
      // 46: aload 0
      // 47: iload 2
      // 48: ifne 5a
      // 4b: aload 3
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaab (Lnet/minecraft/class_1799;)Z
      // 4f: ifne 59
      // 52: goto 56
      // 55: athrow
      // 56: bipush 0
      // 57: ireturn
      // 58: athrow
      // 59: aload 0
      // 5a: aload 3
      // 5b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaa (Lnet/minecraft/class_1799;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;
      // 5e: astore 4
      // 60: iload 2
      // 61: aload 0
      // 62: aload 1
      // 63: aload 4
      // 65: aload 0
      // 66: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 69: aload 0
      // 6a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 6d: aload 0
      // 6e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaa F
      // 71: aload 0
      // 72: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaa F
      // 75: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabbb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)[F
      // 78: astore 5
      // 7a: ifne 99
      // 7d: aload 5
      // 7f: ifnonnull 89
      // 82: goto 86
      // 85: athrow
      // 86: bipush 0
      // 87: ireturn
      // 88: athrow
      // 89: aload 0
      // 8a: aload 5
      // 8c: bipush 0
      // 8d: faload
      // 8e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaa F
      // 91: aload 0
      // 92: aload 5
      // 94: bipush 1
      // 95: faload
      // 96: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaa F
      // 99: aload 0
      // 9a: aload 1
      // 9b: aload 4
      // 9d: aload 0
      // 9e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // a1: aload 0
      // a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // a5: aload 0
      // a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaa F
      // a9: aload 0
      // aa: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaa F
      // ad: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)Z
      // b0: ireturn
   }

   private abbbaaaa abaa(
      class_310 param1, aaaaaabaa param2, class_2338[] param3, float param4, float param5, boolean param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: fload 4
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbaba (F)Lnet/minecraft/class_2350;
      // 09: astore 8
      // 0b: istore 7
      // 0d: aload 3
      // 0e: astore 9
      // 10: aload 9
      // 12: arraylength
      // 13: istore 10
      // 15: bipush 0
      // 16: istore 11
      // 18: iload 11
      // 1a: iload 10
      // 1c: if_icmpge d5
      // 1f: aload 9
      // 21: iload 11
      // 23: aaload
      // 24: astore 12
      // 26: iload 7
      // 28: ifne d0
      // 2b: aload 0
      // 2c: goto 30
      // 2f: athrow
      // 30: aload 1
      // 31: aload 12
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 36: ifeq cd
      // 39: aload 0
      // 3a: aload 1
      // 3b: iload 7
      // 3d: ifne 64
      // 40: aload 12
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 45: ifne 55
      // 48: goto 4c
      // 4b: athrow
      // 4c: iload 7
      // 4e: ifeq cd
      // 51: goto 55
      // 54: athrow
      // 55: aload 0
      // 56: iload 7
      // 58: ifne 7d
      // 5b: goto 5f
      // 5e: athrow
      // 5f: aload 1
      // 60: goto 64
      // 63: athrow
      // 64: aload 12
      // 66: ldc_w 48.0
      // 69: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;F)Z
      // 6c: ifne 78
      // 6f: iload 7
      // 71: ifeq cd
      // 74: goto 78
      // 77: athrow
      // 78: aload 0
      // 79: goto 7d
      // 7c: athrow
      // 7d: aload 12
      // 7f: aload 8
      // 81: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababbab (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)[Lnet/minecraft/class_2338;
      // 84: astore 13
      // 86: aload 13
      // 88: arraylength
      // 89: istore 14
      // 8b: bipush 0
      // 8c: istore 15
      // 8e: iload 15
      // 90: iload 14
      // 92: if_icmpge cd
      // 95: aload 13
      // 97: iload 15
      // 99: aaload
      // 9a: astore 16
      // 9c: aload 0
      // 9d: iload 7
      // 9f: ifne 30
      // a2: aload 1
      // a3: aload 2
      // a4: aload 16
      // a6: aload 12
      // a8: fload 4
      // aa: fload 5
      // ac: iload 6
      // ae: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // b1: astore 17
      // b3: iload 7
      // b5: ifne c8
      // b8: aload 17
      // ba: ifnull c5
      // bd: goto c1
      // c0: athrow
      // c1: aload 17
      // c3: areturn
      // c4: athrow
      // c5: iinc 15 1
      // c8: iload 7
      // ca: ifeq 8e
      // cd: iinc 11 1
      // d0: iload 7
      // d2: ifeq 18
      // d5: aconst_null
      // d6: areturn
   }

   private boolean abab(class_310 var1) {
      return this.bb(var1);
   }

   private abbbbbaa abba(class_310 param1, class_2338 param2, class_2350 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 13
      // 0b: ifnull 50
      // 0e: goto 12
      // 11: athrow
      // 12: aload 1
      // 13: iload 4
      // 15: ifne 27
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: ifnull 50
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: goto 27
      // 26: athrow
      // 27: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2a: ifnull 50
      // 2d: aload 2
      // 2e: ifnull 50
      // 31: goto 35
      // 34: athrow
      // 35: aload 3
      // 36: iload 4
      // 38: ifne 47
      // 3b: goto 3f
      // 3e: athrow
      // 3f: ifnull 50
      // 42: goto 46
      // 45: athrow
      // 46: aload 3
      // 47: invokevirtual net/minecraft/class_2350.method_10166 ()Lnet/minecraft/class_2350$class_2351;
      // 4a: invokevirtual net/minecraft/class_2350$class_2351.method_10179 ()Z
      // 4d: ifne 53
      // 50: aconst_null
      // 51: areturn
      // 52: athrow
      // 53: aload 2
      // 54: aload 3
      // 55: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 58: astore 5
      // 5a: aload 0
      // 5b: aload 1
      // 5c: aload 5
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 61: iload 4
      // 63: ifne 87
      // 66: ifeq 8a
      // 69: goto 6d
      // 6c: athrow
      // 6d: aload 1
      // 6e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 71: aconst_null
      // 72: new net/minecraft/class_238
      // 75: dup
      // 76: aload 5
      // 78: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 7b: invokevirtual net/minecraft/class_638.method_8335 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/util/List;
      // 7e: invokeinterface java/util/List.isEmpty ()Z 1
      // 83: goto 87
      // 86: athrow
      // 87: ifne 8d
      // 8a: aconst_null
      // 8b: areturn
      // 8c: athrow
      // 8d: aload 3
      // 8e: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
      // 91: invokestatic net/minecraft/class_243.method_24954 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 94: astore 6
      // 96: aload 2
      // 97: invokestatic net/minecraft/class_243.method_24955 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 9a: aload 6
      // 9c: ldc2_w 0.5
      // 9f: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // a2: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // a5: dconst_0
      // a6: ldc2_w 0.0625
      // a9: dconst_0
      // aa: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // ad: astore 7
      // af: aload 1
      // b0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // b3: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // b6: aload 7
      // b8: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // bb: ldc2_w 20.25
      // be: dcmpl
      // bf: ifle c5
      // c2: aconst_null
      // c3: areturn
      // c4: athrow
      // c5: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa
      // c8: dup
      // c9: aload 5
      // cb: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // ce: aload 7
      // d0: new net/minecraft/class_3965
      // d3: dup
      // d4: aload 7
      // d6: aload 3
      // d7: aload 2
      // d8: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // db: bipush 0
      // dc: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // df: fconst_0
      // e0: fconst_0
      // e1: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_3965;FF)V
      // e4: areturn
   }

   private boolean abbb(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 27
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 27
      // 17: aload 2
      // 18: iload 3
      // 19: ifne 39
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnonnull 2a
      // 23: goto 27
      // 26: athrow
      // 27: bipush 0
      // 28: ireturn
      // 29: athrow
      // 2a: aload 0
      // 2b: iload 3
      // 2c: ifne 5a
      // 2f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 32: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 35: goto 39
      // 38: athrow
      // 39: checkcast java/lang/Boolean
      // 3c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3f: ifne 55
      // 42: aload 0
      // 43: iload 3
      // 44: ifne a6
      // 47: goto 4b
      // 4a: athrow
      // 4b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabb Z
      // 4e: ifeq a5
      // 51: goto 55
      // 54: athrow
      // 55: aload 0
      // 56: goto 5a
      // 59: athrow
      // 5a: iload 3
      // 5b: ifne a6
      // 5e: aload 1
      // 5f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 62: aload 2
      // 63: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 66: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 69: ifeq a5
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 1
      // 71: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 74: invokevirtual net/minecraft/class_638.method_8621 ()Lnet/minecraft/class_2784;
      // 77: aload 2
      // 78: invokevirtual net/minecraft/class_2784.method_11952 (Lnet/minecraft/class_2338;)Z
      // 7b: iload 3
      // 7c: ifne 94
      // 7f: goto 83
      // 82: athrow
      // 83: ifeq a3
      // 86: goto 8a
      // 89: athrow
      // 8a: aload 0
      // 8b: aload 1
      // 8c: aload 2
      // 8d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 90: goto 94
      // 93: athrow
      // 94: iload 3
      // 95: ifne a0
      // 98: ifeq a3
      // 9b: goto 9f
      // 9e: athrow
      // 9f: bipush 1
      // a0: goto a4
      // a3: bipush 0
      // a4: ireturn
      // a5: aload 0
      // a6: aload 1
      // a7: aload 2
      // a8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbabbb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // ab: ireturn
   }

   private boolean baaa(class_310 var1) {
      return this.bbb(var1);
   }

   private static class_2350 baab(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: dload 0
      // 06: invokestatic java/lang/Math.abs (D)D
      // 09: dload 2
      // 0a: iload 4
      // 0c: ifne 31
      // 0f: invokestatic java/lang/Math.abs (D)D
      // 12: dcmpl
      // 13: iflt 2f
      // 16: goto 1a
      // 19: athrow
      // 1a: dload 0
      // 1b: dconst_0
      // 1c: dcmpl
      // 1d: iflt 2b
      // 20: goto 24
      // 23: athrow
      // 24: getstatic net/minecraft/class_2350.field_11034 Lnet/minecraft/class_2350;
      // 27: goto 2e
      // 2a: athrow
      // 2b: getstatic net/minecraft/class_2350.field_11039 Lnet/minecraft/class_2350;
      // 2e: areturn
      // 2f: dload 2
      // 30: dconst_0
      // 31: dcmpl
      // 32: iflt 3c
      // 35: getstatic net/minecraft/class_2350.field_11035 Lnet/minecraft/class_2350;
      // 38: goto 3f
      // 3b: athrow
      // 3c: getstatic net/minecraft/class_2350.field_11043 Lnet/minecraft/class_2350;
      // 3f: areturn
   }

   private void baba(class_310 param1) {
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
      // 06: ifne 45
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifeq 44
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 2
      // 1e: ifne 45
      // 21: goto 25
      // 24: athrow
      // 25: aload 1
      // 26: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 29: aload 0
      // 2a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 2d: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 30: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 33: ifeq 44
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 3e: aload 1
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // 42: return
      // 43: athrow
      // 44: aload 0
      // 45: iload 2
      // 46: ifne 75
      // 49: aload 1
      // 4a: aload 0
      // 4b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 4e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbabbb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 51: ifeq 70
      // 54: goto 58
      // 57: athrow
      // 58: aload 0
      // 59: aload 1
      // 5a: iload 2
      // 5b: ifne 84
      // 5e: goto 62
      // 61: athrow
      // 62: aload 0
      // 63: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 66: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 69: ifne 7a
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 0
      // 71: goto 75
      // 74: athrow
      // 75: aload 1
      // 76: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 79: return
      // 7a: aload 0
      // 7b: iload 2
      // 7c: ifne 91
      // 7f: aload 1
      // 80: goto 84
      // 83: athrow
      // 84: aload 0
      // 85: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaab I
      // 88: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaab (Lnet/minecraft/class_310;I)Z
      // 8b: ifne 90
      // 8e: return
      // 8f: athrow
      // 90: aload 0
      // 91: aload 1
      // 92: aload 0
      // 93: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 96: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 99: astore 3
      // 9a: aload 3
      // 9b: ifnonnull a0
      // 9e: return
      // 9f: athrow
      // a0: aload 1
      // a1: aload 3
      // a2: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // a8: astore 4
      // aa: iload 2
      // ab: ifne e5
      // ae: aload 4
      // b0: ifnonnull b9
      // b3: goto b7
      // b6: athrow
      // b7: return
      // b8: athrow
      // b9: aload 0
      // ba: aload 4
      // bc: bipush 0
      // bd: faload
      // be: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abab F
      // c1: aload 0
      // c2: aload 4
      // c4: bipush 1
      // c5: faload
      // c6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aababb F
      // c9: aload 0
      // ca: aload 1
      // cb: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // ce: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // d1: aload 0
      // d2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abab F
      // d5: aload 0
      // d6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aababb F
      // d9: aload 3
      // da: aload 0
      // db: aload 1
      // dc: aload 3
      // dd: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbabb (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z, ()Z ]
      // e2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababbbb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;FFLnet/minecraft/class_3965;Ljava/util/function/BooleanSupplier;)V
      // e5: return
   }

   private static long babb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-462442863, -268006405 ^ -149216914)) & a(-462442864, -268006405 ^ 1328029972);
      if (aaaabb[var3] == null) {
         aaaabb[var3] = baa[var3] ^ var1;
      }

      return aaaabb[var3];
   }

   private abbbaaaa bbab(
      class_310 var1, aaaaaabaa var2, class_2338[] var3, float var4, float var5
   ) {
      return this.abaa(var1, var2, var3, var4, var5, true);
   }

   private boolean bbba(class_310 param1, abbbaaaa param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 027
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 014: ifnull 027
      // 017: aload 2
      // 018: iload 3
      // 019: ifne 02b
      // 01c: goto 020
      // 01f: athrow
      // 020: ifnonnull 02a
      // 023: goto 027
      // 026: athrow
      // 027: bipush 0
      // 028: ireturn
      // 029: athrow
      // 02a: aload 2
      // 02b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.bb ()Lnet/minecraft/class_2338;
      // 02e: ifnonnull 040
      // 031: aload 0
      // 032: aload 1
      // 033: aload 2
      // 034: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ab ()Lnet/minecraft/class_2338;
      // 037: aload 2
      // 038: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 03b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababaab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Z
      // 03e: ireturn
      // 03f: athrow
      // 040: aload 0
      // 041: aload 1
      // 042: aload 2
      // 043: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 046: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 049: iload 3
      // 04a: ifne 055
      // 04d: ifne 056
      // 050: goto 054
      // 053: athrow
      // 054: bipush 0
      // 055: ireturn
      // 056: aload 1
      // 057: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 05a: aload 2
      // 05b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ab ()Lnet/minecraft/class_2338;
      // 05e: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 061: astore 4
      // 063: aload 4
      // 065: pop
      // 066: aload 0
      // 067: iload 3
      // 068: ifne 083
      // 06b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 06e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 071: checkcast java/lang/Boolean
      // 074: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 077: ifeq 09a
      // 07a: goto 07e
      // 07d: athrow
      // 07e: aload 0
      // 07f: goto 083
      // 082: athrow
      // 083: aload 1
      // 084: aload 2
      // 085: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ab ()Lnet/minecraft/class_2338;
      // 088: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 08b: iload 3
      // 08c: ifne 097
      // 08f: ifeq 09a
      // 092: goto 096
      // 095: athrow
      // 096: bipush 1
      // 097: goto 09b
      // 09a: bipush 0
      // 09b: istore 5
      // 09d: aload 1
      // 09e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0a1: aload 2
      // 0a2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.bb ()Lnet/minecraft/class_2338;
      // 0a5: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0a8: astore 6
      // 0aa: aload 6
      // 0ac: iload 3
      // 0ad: ifne 0b9
      // 0b0: ifnull 0df
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: aload 6
      // 0b9: iload 3
      // 0ba: ifne 0cd
      // 0bd: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 0c0: ifne 0df
      // 0c3: goto 0c7
      // 0c6: athrow
      // 0c7: aload 6
      // 0c9: goto 0cd
      // 0cc: athrow
      // 0cd: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 0d0: iload 3
      // 0d1: ifne 0dc
      // 0d4: ifne 0df
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: bipush 1
      // 0dc: goto 0e0
      // 0df: bipush 0
      // 0e0: istore 7
      // 0e2: aload 0
      // 0e3: aload 1
      // 0e4: aload 2
      // 0e5: iload 3
      // 0e6: ifne 10e
      // 0e9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ab ()Lnet/minecraft/class_2338;
      // 0ec: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0ef: ifne 107
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: iload 5
      // 0f8: iload 3
      // 0f9: ifne 114
      // 0fc: goto 100
      // 0ff: athrow
      // 100: ifeq 134
      // 103: goto 107
      // 106: athrow
      // 107: aload 0
      // 108: aload 1
      // 109: aload 2
      // 10a: goto 10e
      // 10d: athrow
      // 10e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.bb ()Lnet/minecraft/class_2338;
      // 111: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 114: iload 3
      // 115: ifne 131
      // 118: ifne 130
      // 11b: goto 11f
      // 11e: athrow
      // 11f: iload 7
      // 121: iload 3
      // 122: ifne 131
      // 125: goto 129
      // 128: athrow
      // 129: ifeq 134
      // 12c: goto 130
      // 12f: athrow
      // 130: bipush 1
      // 131: goto 135
      // 134: bipush 0
      // 135: ireturn
   }

   private boolean bbbb(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 4a
      // 17: iload 2
      // 18: iload 3
      // 19: ifne 4f
      // 1c: goto 20
      // 1f: athrow
      // 20: iflt 4a
      // 23: goto 27
      // 26: athrow
      // 27: iload 2
      // 28: iload 3
      // 29: ifne 60
      // 2c: goto 30
      // 2f: athrow
      // 30: ldc_w -462442861
      // 33: ldc_w -369357785
      // 36: ldc_w 330183621
      // 39: ixor
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 3d: ldc2_w 7050441791445182372
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 43: if_icmplt 50
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 0
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ireturn
      // 50: aload 0
      // 51: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabb;
      // 54: iload 2
      // 55: iload 3
      // 56: ifne a8
      // 59: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabb.ab (I)Z
      // 5c: goto 60
      // 5f: athrow
      // 60: ifne a3
      // 63: aload 1
      // 64: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabaab (Lnet/minecraft/class_310;)I
      // 67: iload 3
      // 68: ifne 7c
      // 6b: goto 6f
      // 6e: athrow
      // 6f: iload 2
      // 70: if_icmpeq 7f
      // 73: goto 77
      // 76: athrow
      // 77: bipush 1
      // 78: goto 7c
      // 7b: athrow
      // 7c: goto 80
      // 7f: bipush 0
      // 80: istore 4
      // 82: iload 4
      // 84: ifeq 93
      // 87: aload 0
      // 88: aload 0
      // 89: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 8c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 8f: goto 94
      // 92: athrow
      // 93: lconst_0
      // 94: lstore 5
      // 96: aload 0
      // 97: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabb;
      // 9a: iload 2
      // 9b: invokestatic java/lang/System.currentTimeMillis ()J
      // 9e: lload 5
      // a0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabb.aa (IJJ)V
      // a3: aload 0
      // a4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabb;
      // a7: iload 2
      // a8: invokestatic java/lang/System.currentTimeMillis ()J
      // ab: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbabb.ba (IJ)Z
      // ae: ireturn
   }

   private boolean aaaaa(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)I
      // 0a: iload 3
      // 0b: ifne 1b
      // 0e: bipush 1
      // 0f: if_icmplt 1e
      // 12: goto 16
      // 15: athrow
      // 16: bipush 1
      // 17: goto 1b
      // 1a: athrow
      // 1b: goto 1f
      // 1e: bipush 0
      // 1f: ireturn
   }

   private boolean aaaab(class_310 var1) {
      this.aaabb(var1);
      return this.bbbbabb(aabbbbabb::b);
   }

   private void aaaba(abbbabaaa var1, class_310 var2) {
      this.ababaa = null;
      this.abaaba.b();
      this.abaabb = var1;
      long var3 = System.currentTimeMillis();
      this.aabbba = var3;
      this.bbabb = var3 + Math.max(0L, this.aaabbb(var1) - babb(a(-462442862, -1786835129 ^ -535179231), 7894730656606348862L));
   }

   private void aaabb(class_310 param1) {
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
      // 09: ifnull 35
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnull 35
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 27: iload 2
      // 28: ifne 45
      // 2b: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 2e: ifnonnull 37
      // 31: goto 35
      // 34: athrow
      // 35: return
      // 36: athrow
      // 37: aload 1
      // 38: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 3b: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababaa (Lnet/minecraft/class_304;)V
      // 41: aload 1
      // 42: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 45: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 48: bipush 0
      // 49: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 4c: return
   }

   private boolean aabab(class_310 var1, class_3965 var2) {
      return this.abbaba(var1, this.abbbbb, var2);
   }

   private void aabba() {
      this.abaaab = bbaaa(a(-462442859, -1928301823 ^ -489799273), 5579952000272572156L);
      this.abbaba = null;
      this.ababa = -1;
      this.abbaaa = null;
      this.baabb = bbaaa(a(-462442860, -1928301823 ^ 664326658), 5579952000272572156L);
   }

   private abbbaaaa abaaa(class_310 var1, aaaaaabaa var2, float var3, float var4) {
      return this.aababa(var1, var2, var3, var4, true);
   }

   static class_2338[] ababb(class_3965 param0, class_2350 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 004: astore 3
      // 005: aload 0
      // 006: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 009: astore 4
      // 00b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 00e: new java/util/LinkedHashSet
      // 011: dup
      // 012: invokespecial java/util/LinkedHashSet.<init> ()V
      // 015: astore 5
      // 017: istore 2
      // 018: aload 4
      // 01a: iload 2
      // 01b: ifne 05f
      // 01e: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 021: if_acmpne 059
      // 024: goto 028
      // 027: athrow
      // 028: aload 5
      // 02a: aload 3
      // 02b: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 02e: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 031: pop
      // 032: iload 2
      // 033: aload 5
      // 035: aload 3
      // 036: aload 1
      // 037: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 03a: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 03d: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 040: pop
      // 041: aload 5
      // 043: aload 3
      // 044: aload 1
      // 045: invokevirtual net/minecraft/class_2350.method_10153 ()Lnet/minecraft/class_2350;
      // 048: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 04b: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 04e: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 051: pop
      // 052: ifeq 0aa
      // 055: goto 059
      // 058: athrow
      // 059: aload 4
      // 05b: goto 05f
      // 05e: athrow
      // 05f: invokevirtual net/minecraft/class_2350.method_10166 ()Lnet/minecraft/class_2350$class_2351;
      // 062: invokevirtual net/minecraft/class_2350$class_2351.method_10179 ()Z
      // 065: iload 2
      // 066: ifne 0a9
      // 069: ifeq 09c
      // 06c: goto 070
      // 06f: athrow
      // 070: aload 5
      // 072: aload 3
      // 073: aload 4
      // 075: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 078: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 07b: pop
      // 07c: iload 2
      // 07d: aload 5
      // 07f: aload 3
      // 080: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 083: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 086: pop
      // 087: aload 5
      // 089: aload 3
      // 08a: aload 1
      // 08b: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 08e: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 091: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 094: pop
      // 095: ifeq 0aa
      // 098: goto 09c
      // 09b: athrow
      // 09c: aload 5
      // 09e: aload 3
      // 09f: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 0a2: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 0a5: goto 0a9
      // 0a8: athrow
      // 0a9: pop
      // 0aa: bipush 3
      // 0ab: newarray 10
      // 0ad: dup
      // 0ae: bipush 0
      // 0af: bipush 1
      // 0b0: iastore
      // 0b1: dup
      // 0b2: bipush 1
      // 0b3: bipush 0
      // 0b4: iastore
      // 0b5: dup
      // 0b6: bipush 2
      // 0b7: bipush -1
      // 0b8: iastore
      // 0b9: astore 6
      // 0bb: aload 6
      // 0bd: arraylength
      // 0be: istore 7
      // 0c0: bipush 0
      // 0c1: istore 8
      // 0c3: iload 8
      // 0c5: iload 7
      // 0c7: if_icmpge 148
      // 0ca: aload 6
      // 0cc: iload 8
      // 0ce: iaload
      // 0cf: istore 9
      // 0d1: bipush 0
      // 0d2: istore 10
      // 0d4: iload 10
      // 0d6: bipush 2
      // 0d7: if_icmpgt 141
      // 0da: iload 10
      // 0dc: iload 2
      // 0dd: ifne 0c5
      // 0e0: ineg
      // 0e1: istore 11
      // 0e3: iload 11
      // 0e5: iload 10
      // 0e7: if_icmpgt 13a
      // 0ea: iload 10
      // 0ec: iload 2
      // 0ed: ifne 0d6
      // 0f0: ineg
      // 0f1: istore 12
      // 0f3: iload 12
      // 0f5: iload 10
      // 0f7: if_icmpgt 133
      // 0fa: iload 11
      // 0fc: iload 2
      // 0fd: ifne 12b
      // 100: invokestatic java/lang/Math.abs (I)I
      // 103: iload 12
      // 105: invokestatic java/lang/Math.abs (I)I
      // 108: iload 2
      // 109: ifne 0e7
      // 10c: goto 110
      // 10f: athrow
      // 110: invokestatic java/lang/Math.max (II)I
      // 113: iload 10
      // 115: if_icmpne 12c
      // 118: aload 5
      // 11a: aload 3
      // 11b: iload 11
      // 11d: iload 9
      // 11f: iload 12
      // 121: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
      // 124: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 127: goto 12b
      // 12a: athrow
      // 12b: pop
      // 12c: iinc 12 1
      // 12f: iload 2
      // 130: ifeq 0f3
      // 133: iinc 11 1
      // 136: iload 2
      // 137: ifeq 0e3
      // 13a: iinc 10 1
      // 13d: iload 2
      // 13e: ifeq 0d4
      // 141: iinc 8 1
      // 144: iload 2
      // 145: ifeq 0c3
      // 148: aload 3
      // 149: aload 4
      // 14b: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 14e: astore 6
      // 150: aload 5
      // 152: invokedynamic apply ()Ljava/util/function/IntFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabab (I)[Lnet/minecraft/class_2338;, (I)[Lnet/minecraft/class_2338; ]
      // 157: invokevirtual java/util/LinkedHashSet.toArray (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
      // 15a: checkcast [Lnet/minecraft/class_2338;
      // 15d: astore 7
      // 15f: aload 7
      // 161: aload 6
      // 163: aload 1
      // 164: invokedynamic compare (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Ljava/util/Comparator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)I, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabab (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)I, (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)I ]
      // 169: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;Ljava/util/Comparator;)V
      // 16c: aload 7
      // 16e: areturn
   }

   private boolean abbaa(class_310 param1) {
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
      // 09: ifnull 17
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnonnull 1a
      // 17: bipush 0
      // 18: ireturn
      // 19: athrow
      // 1a: aload 0
      // 1b: iload 2
      // 1c: ifne 3a
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babab Lnet/minecraft/class_1268;
      // 22: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 25: if_acmpne 39
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 1
      // 2e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 31: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaab (Lnet/minecraft/class_1799;)Z
      // 37: ireturn
      // 38: athrow
      // 39: aload 0
      // 3a: aload 1
      // 3b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 41: aload 0
      // 42: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa I
      // 45: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbaa (Lnet/minecraft/class_1661;I)Z
      // 48: ireturn
   }

   private class_3965 abbab(class_310 param1, class_243 param2, class_243 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 13
      // 0b: ifnull 22
      // 0e: goto 12
      // 11: athrow
      // 12: aload 1
      // 13: iload 4
      // 15: ifne 26
      // 18: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1b: ifnonnull 25
      // 1e: goto 22
      // 21: athrow
      // 22: aconst_null
      // 23: areturn
      // 24: athrow
      // 25: aload 1
      // 26: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 29: new net/minecraft/class_3959
      // 2c: dup
      // 2d: aload 2
      // 2e: aload 3
      // 2f: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
      // 32: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 35: aload 1
      // 36: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 39: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 3c: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 3f: areturn
   }

   private boolean abbba(class_310 param1) {
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
      // 09: ifnull 55
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 55
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnull 55
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 3e: ifnull 55
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 4d: ifnull 55
      // 50: bipush 1
      // 51: goto 56
      // 54: athrow
      // 55: bipush 0
      // 56: ireturn
   }

   private int abbbb(class_1661 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: bipush 0
      // 04: istore 3
      // 05: istore 2
      // 06: iload 3
      // 07: ldc_w -462442857
      // 0a: ldc_w -315543976
      // 0d: ldc_w 322529690
      // 10: ixor
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 14: ldc2_w 7050441791445182372
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 1a: if_icmpge 8d
      // 1d: aload 1
      // 1e: iload 3
      // 1f: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 22: astore 4
      // 24: aload 4
      // 26: getstatic net/minecraft/class_1802.field_8129 Lnet/minecraft/class_1792;
      // 29: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 2c: iload 2
      // 2d: ifne 8e
      // 30: iload 2
      // 31: ifne 85
      // 34: goto 38
      // 37: athrow
      // 38: ifne 84
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 4
      // 41: getstatic net/minecraft/class_1802.field_8848 Lnet/minecraft/class_1792;
      // 44: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 47: iload 2
      // 48: ifne 85
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ifne 84
      // 52: goto 56
      // 55: athrow
      // 56: aload 4
      // 58: getstatic net/minecraft/class_1802.field_8211 Lnet/minecraft/class_1792;
      // 5b: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 5e: iload 2
      // 5f: ifne 85
      // 62: goto 66
      // 65: athrow
      // 66: ifne 84
      // 69: goto 6d
      // 6c: athrow
      // 6d: aload 4
      // 6f: getstatic net/minecraft/class_1802.field_8655 Lnet/minecraft/class_1792;
      // 72: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 75: iload 2
      // 76: ifne 85
      // 79: goto 7d
      // 7c: athrow
      // 7d: ifeq 86
      // 80: goto 84
      // 83: athrow
      // 84: iload 3
      // 85: ireturn
      // 86: iinc 3 1
      // 89: iload 2
      // 8a: ifeq 06
      // 8d: bipush -1
      // 8e: ireturn
   }

   private abbbbbaa baaaa(class_310 param1, class_2338 param2, class_2338 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 13
      // 0b: ifnull 4b
      // 0e: goto 12
      // 11: athrow
      // 12: aload 1
      // 13: iload 4
      // 15: ifne 27
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: ifnull 4b
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: goto 27
      // 26: athrow
      // 27: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2a: ifnull 4b
      // 2d: aload 2
      // 2e: iload 4
      // 30: ifne 3f
      // 33: goto 37
      // 36: athrow
      // 37: ifnull 4b
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 3
      // 3f: iload 4
      // 41: ifne 52
      // 44: ifnonnull 4e
      // 47: goto 4b
      // 4a: athrow
      // 4b: aconst_null
      // 4c: areturn
      // 4d: athrow
      // 4e: aload 3
      // 4f: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 52: astore 5
      // 54: aload 0
      // 55: aload 1
      // 56: aload 5
      // 58: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 5b: iload 4
      // 5d: ifne 81
      // 60: ifeq b0
      // 63: goto 67
      // 66: athrow
      // 67: aload 1
      // 68: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 6b: aconst_null
      // 6c: new net/minecraft/class_238
      // 6f: dup
      // 70: aload 5
      // 72: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 75: invokevirtual net/minecraft/class_638.method_8335 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/util/List;
      // 78: invokeinterface java/util/List.isEmpty ()Z 1
      // 7d: goto 81
      // 80: athrow
      // 81: iload 4
      // 83: ifne a4
      // 86: ifeq b0
      // 89: goto 8d
      // 8c: athrow
      // 8d: new net/minecraft/class_238
      // 90: dup
      // 91: aload 5
      // 93: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 96: aload 1
      // 97: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9a: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
      // 9d: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
      // a0: goto a4
      // a3: athrow
      // a4: iload 4
      // a6: ifne c3
      // a9: ifeq b3
      // ac: goto b0
      // af: athrow
      // b0: aconst_null
      // b1: areturn
      // b2: athrow
      // b3: aload 0
      // b4: iload 4
      // b6: ifne d6
      // b9: aload 5
      // bb: aload 2
      // bc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbba (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Z
      // bf: goto c3
      // c2: athrow
      // c3: ifeq d5
      // c6: aload 0
      // c7: aload 1
      // c8: aload 2
      // c9: aload 0
      // ca: aload 2
      // cb: aload 5
      // cd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbb (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Lnet/minecraft/class_2350;
      // d0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa;
      // d3: areturn
      // d4: athrow
      // d5: aload 0
      // d6: aload 1
      // d7: aload 5
      // d9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // dc: astore 6
      // de: aload 6
      // e0: ifnonnull e8
      // e3: aconst_null
      // e4: goto fd
      // e7: athrow
      // e8: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa
      // eb: dup
      // ec: aload 5
      // ee: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // f1: aload 6
      // f3: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // f6: aload 6
      // f8: fconst_0
      // f9: fconst_0
      // fa: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_3965;FF)V
      // fd: areturn
   }

   private boolean baaab() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0b: iload 1
      // 0c: ifne 27
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifeq 32
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 23: goto 27
      // 26: athrow
      // 27: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaab;
      // 2a: if_acmpne 32
      // 2d: bipush 1
      // 2e: goto 33
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
   }

   private abbbabaaa baaba() {
      try {
         if (this.aaaaab) {
            return abbbabaaa.abb;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      return abbbabaaa.bab;
   }

   private void baabb(class_310 param1) {
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
      // 06: ifne 57
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifeq 56
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: aload 0
      // 1f: iload 2
      // 20: ifne 61
      // 23: goto 27
      // 26: athrow
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 2d: ifeq 56
      // 30: goto 34
      // 33: athrow
      // 34: aload 0
      // 35: iload 2
      // 36: ifne 57
      // 39: goto 3d
      // 3c: athrow
      // 3d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab I
      // 40: aload 0
      // 41: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaa I
      // 44: if_icmplt 56
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 0
      // 4c: aload 0
      // 4d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 50: aload 1
      // 51: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // 54: return
      // 55: athrow
      // 56: aload 0
      // 57: aload 1
      // 58: iload 2
      // 59: ifne 73
      // 5c: aload 0
      // 5d: goto 61
      // 60: athrow
      // 61: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 64: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 67: ifne 71
      // 6a: aload 0
      // 6b: aload 1
      // 6c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 6f: return
      // 70: athrow
      // 71: aload 0
      // 72: aload 1
      // 73: iload 2
      // 74: ifne df
      // 77: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 7a: aload 0
      // 7b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 7e: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 81: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 84: ifne d5
      // 87: goto 8b
      // 8a: athrow
      // 8b: invokestatic java/lang/System.currentTimeMillis ()J
      // 8e: lstore 3
      // 8f: iload 2
      // 90: ifne d4
      // 93: lload 3
      // 94: aload 0
      // 95: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbba J
      // 98: lsub
      // 99: ldc_w -462442858
      // 9c: ldc_w -327962304
      // 9f: ldc_w -1738972728
      // a2: ixor
      // a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // a6: ldc2_w 5561790771342195468
      // a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // ac: lcmp
      // ad: ifgt cf
      // b0: goto b4
      // b3: athrow
      // b4: aload 0
      // b5: lload 3
      // b6: ldc_w -462442871
      // b9: ldc_w -327962304
      // bc: ldc_w 118442404
      // bf: ixor
      // c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // c3: ldc2_w 6474695175696088868
      // c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // c9: ladd
      // ca: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // cd: return
      // ce: athrow
      // cf: aload 0
      // d0: aload 1
      // d1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // d4: return
      // d5: aload 0
      // d6: iload 2
      // d7: ifne ec
      // da: aload 1
      // db: goto df
      // de: athrow
      // df: aload 0
      // e0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaab I
      // e3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaab (Lnet/minecraft/class_310;I)Z
      // e6: ifne eb
      // e9: return
      // ea: athrow
      // eb: aload 0
      // ec: aload 1
      // ed: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaa (Lnet/minecraft/class_310;)V
      // f0: return
   }

   private boolean babaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 1d
      // 0d: ifnull 52
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 2c
      // 19: goto 1d
      // 1c: athrow
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 20: ifnull 52
      // 23: aload 2
      // 24: iload 1
      // 25: ifne 3a
      // 28: goto 2c
      // 2b: athrow
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // 32: ifnull 52
      // 35: aload 2
      // 36: goto 3a
      // 39: athrow
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 3d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.babba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa;
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabbaa.babbaab ()Z
      // 43: iload 1
      // 44: ifne 4f
      // 47: ifeq 52
      // 4a: goto 4e
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 53
      // 52: bipush 0
      // 53: ireturn
   }

   private boolean babab(class_310 var1) {
      return aabbabbbb.abaaba(var1, this.babab);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private abbbaaaa babba(
      class_310 var1, aaaaaabaa var2, class_3965 var3, float var4, float var5, boolean var6
   ) {
      int var7 = baaabbaa.bba;

      label31: {
         label30: {
            class_3965 var10000;
            label29: {
               try {
                  var10000 = var3;
                  if (var7 != 0) {
                     break label29;
                  }

                  if (var3 == null) {
                     break label30;
                  }
               } catch (RuntimeException var11) {
                  throw var11;
               }

               var10000 = var3;
            }

            try {
               if (var10000.method_17783() == class_240.field_1332) {
                  break label31;
               }
            } catch (RuntimeException var10) {
               throw var10;
            }
         }

         try {
            return null;
         } catch (RuntimeException var9) {
            throw var9;
         }
      }

      class_2350 var8 = this.bbbbaba(var4);
      return this.abaa(var1, var2, this.aabbaaa(var3, var8), var4, var5, var6);
   }

   private class_2350 babbb(class_2338 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 2
      // 04: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 07: aload 1
      // 08: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0b: isub
      // 0c: istore 4
      // 0e: istore 3
      // 0f: aload 2
      // 10: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 13: aload 1
      // 14: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 17: isub
      // 18: istore 5
      // 1a: iload 4
      // 1c: iload 3
      // 1d: ifne 45
      // 20: invokestatic java/lang/Math.abs (I)I
      // 23: iload 5
      // 25: invokestatic java/lang/Math.abs (I)I
      // 28: if_icmplt 43
      // 2b: goto 2f
      // 2e: athrow
      // 2f: iload 4
      // 31: iflt 3f
      // 34: goto 38
      // 37: athrow
      // 38: getstatic net/minecraft/class_2350.field_11034 Lnet/minecraft/class_2350;
      // 3b: goto 42
      // 3e: athrow
      // 3f: getstatic net/minecraft/class_2350.field_11039 Lnet/minecraft/class_2350;
      // 42: areturn
      // 43: iload 5
      // 45: iflt 4f
      // 48: getstatic net/minecraft/class_2350.field_11035 Lnet/minecraft/class_2350;
      // 4b: goto 52
      // 4e: athrow
      // 4f: getstatic net/minecraft/class_2350.field_11043 Lnet/minecraft/class_2350;
      // 52: areturn
   }

   private static int bbaaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-462442872, -943013528 ^ 446912672);
      if (abb[var3] == null) {
         abb[var3] = (int)(bbab[var3] ^ var1);
      }

      return abb[var3];
   }

   private class_2338 bbaab(class_310 param1, class_3965 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 27
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 27
      // 17: aload 2
      // 18: iload 3
      // 19: ifne 2b
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnonnull 2a
      // 23: goto 27
      // 26: athrow
      // 27: aconst_null
      // 28: areturn
      // 29: athrow
      // 2a: aload 2
      // 2b: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 2e: astore 4
      // 30: aload 4
      // 32: aload 2
      // 33: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 36: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 39: astore 5
      // 3b: aload 0
      // 3c: iload 3
      // 3d: ifne 5b
      // 40: aload 1
      // 41: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 44: aload 5
      // 46: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 49: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 4c: ifeq 5a
      // 4f: goto 53
      // 52: athrow
      // 53: aload 5
      // 55: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 58: areturn
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 1
      // 5c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 5f: aload 4
      // 61: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 64: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 67: ifeq 71
      // 6a: aload 4
      // 6c: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 6f: areturn
      // 70: athrow
      // 71: aload 5
      // 73: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 76: areturn
   }

   private class_243 bbaba(class_2338 var1) {
      return this.bbbbbaa(var1).method_1023(0.0, 0.0625, 0.0);
   }

   private class_243 bbabb(class_2338 var1) {
      return class_243.method_24955(var1);
   }

   private boolean bbbaa(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 1f
      // 17: aload 2
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 26: aload 2
      // 27: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2a: astore 4
      // 2c: aload 4
      // 2e: getstatic net/minecraft/class_2246.field_10036 Lnet/minecraft/class_2248;
      // 31: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 34: iload 3
      // 35: ifne 6e
      // 38: ifne 6d
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 4
      // 41: getstatic net/minecraft/class_2246.field_22089 Lnet/minecraft/class_2248;
      // 44: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 47: iload 3
      // 48: ifne 6e
      // 4b: goto 4f
      // 4e: athrow
      // 4f: ifne 6d
      // 52: goto 56
      // 55: athrow
      // 56: aload 4
      // 58: getstatic net/minecraft/class_2246.field_10164 Lnet/minecraft/class_2248;
      // 5b: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 5e: iload 3
      // 5f: ifne 6e
      // 62: goto 66
      // 65: athrow
      // 66: ifeq 71
      // 69: goto 6d
      // 6c: athrow
      // 6d: bipush 1
      // 6e: goto 72
      // 71: bipush 0
      // 72: ireturn
   }

   private int bbbab(class_1661 param1, class_1792 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: bipush 0
      // 04: istore 4
      // 06: istore 3
      // 07: iload 4
      // 09: ldc_w -462442869
      // 0c: ldc_w -726538546
      // 0f: ldc_w -521882768
      // 12: ixor
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 16: ldc2_w 7050441791445182372
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 1c: if_icmpge 46
      // 1f: aload 1
      // 20: iload 4
      // 22: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 25: aload 2
      // 26: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 29: iload 3
      // 2a: ifne 47
      // 2d: iload 3
      // 2e: ifne 3e
      // 31: goto 35
      // 34: athrow
      // 35: ifeq 3f
      // 38: goto 3c
      // 3b: athrow
      // 3c: iload 4
      // 3e: ireturn
      // 3f: iinc 4 1
      // 42: iload 3
      // 43: ifeq 07
      // 46: bipush -1
      // 47: ireturn
   }

   private boolean bbbba(class_2338 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 2f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 2
      // 11: iload 3
      // 12: ifne 1d
      // 15: ifnull 2f
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 20: aload 2
      // 21: iload 3
      // 22: ifne 37
      // 25: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 28: if_icmpeq 32
      // 2b: goto 2f
      // 2e: athrow
      // 2f: bipush 0
      // 30: ireturn
      // 31: athrow
      // 32: aload 1
      // 33: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 36: aload 2
      // 37: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 3a: isub
      // 3b: invokestatic java/lang/Math.abs (I)I
      // 3e: istore 4
      // 40: aload 1
      // 41: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 44: aload 2
      // 45: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 48: isub
      // 49: invokestatic java/lang/Math.abs (I)I
      // 4c: istore 5
      // 4e: iload 4
      // 50: iload 3
      // 51: ifne 64
      // 54: iload 5
      // 56: iadd
      // 57: bipush 1
      // 58: if_icmpne 67
      // 5b: goto 5f
      // 5e: athrow
      // 5f: bipush 1
      // 60: goto 64
      // 63: athrow
      // 64: goto 68
      // 67: bipush 0
      // 68: ireturn
   }

   public aabbbbabb() {
      int var1 = -1645239157;
      super(
         aabbaaaba.aaab(abbaaaa(a(-462442870, var1 ^ -1466174085), a(-462442867, var1 ^ -762204390))),
         bbaabbba.aa,
         aabbaaaba.aaab(abbaaaa(a(-462442868, var1 ^ 1124883128), a(-462442865, var1 ^ -230897413)))
      );
      this.baaaaa = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(abbaaaa(a(-462442866, var1 ^ 1056282225), a(-462442879, var1 ^ 390345719))),
            abaababaa.class,
            abaababaa.a
         )
      );
      this.aaaa = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(abbaaaa(a(-462442880, var1 ^ -1251291596), a(-462442877, var1 ^ 91198058))),
            ababab.class,
            ababab.aa
         )
      );
      this.bbbab = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(abbaaaa(a(-462442878, var1 ^ 2073263680), a(-462442875, var1 ^ -141805532))),
            bbbbbaab.class,
            bbbbbaab.b
         )
      );
      this.aab = (bababa)this.abbbaaa(
         (bababa)new bababa(
               aabbaaaba.aaab(abbaaaa(a(-462442876, var1 ^ 1638345474), a(-462442873, var1 ^ 2012131304))),
               50.0,
               1.0,
               100.0,
               1.0
            )
            .babb(this::baaabb)
      );
      this.bbaba = new ababbbbba();
      this.aabaaa = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(abbaaaa(a(-462442874, var1 ^ 523469309), a(-462442823, var1 ^ 2044598761))),
               45.0,
               45.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(abbaaaa(a(-462442824, var1 ^ 1203485464), a(-462442821, var1 ^ -1270584437))))
      );
      this.abbbab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(abbaaaa(a(-462442822, var1 ^ 1394912350), a(-462442819, var1 ^ 382814547))), true
         )
      );
      this.bbbbb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(abbaaaa(a(-462442820, var1 ^ 212331747), a(-462442817, var1 ^ -494349623))), false
         )
      );
      this.ab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(abbaaaa(a(-462442818, var1 ^ 377337957), a(-462442831, var1 ^ 488674277))), false
         )
      );
      this.bbbba = (baabaab)this.abbbaaa(
         (baabaab)new baabaab(
               aabbaaaba.aaab(abbaaaa(a(-462442832, var1 ^ -1952709495), a(-462442829, var1 ^ 1816773321))),
               abaabaab.class,
               abaabaab.ab
            )
            .babb(this.ab::abbb)
      );
      this.aabab = (bababa)this.abbbaaa(
         (bababa)new bababa(
               aabbaaaba.aaab(abbaaaa(a(-462442830, var1 ^ 1637525135), a(-462442827, var1 ^ 1344208303))), 9.0, 1.0, 9.0, 1.0
            )
            .babb(this::baaab)
      );
      this.aaabab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(abbaaaa(a(-462442828, var1 ^ -1873799268), a(-462442825, var1 ^ 1525034589))), false
         )
      );
      this.abaabb = abbbabaaa.aab;
      this.aabba = -1;
      this.abbbbb = -1;
      this.aaabbb = aaabaaaaa.b;
      this.aaab = -1;
      this.abaab = -1;
      this.abaa = 1;
      this.abbab = 0;
      this.abaaaa = -1;
      this.babab = class_1268.field_5808;
      this.babaa = abbbabaaa.aab;
      this.bbaab = bbaaa(a(-462442826, var1 ^ -1522809896), 5579952000272572156L);
      this.aaabaa = bbaaa(a(-462442839, var1 ^ 554970223), 5579952000272572156L);
      this.abaaba = new aaabbabb();
      this.abaaab = bbaaa(a(-462442840, var1 ^ 395325572), 5579952000272572156L);
      this.ababa = -1;
      this.baabb = bbaaa(a(-462442837, var1 ^ 286863093), 5579952000272572156L);
   }

   private double bbbbb(class_243 param1, class_243 param2, class_243 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 3
      // 006: iload 4
      // 008: ifne 018
      // 00b: ifnonnull 017
      // 00e: goto 012
      // 011: athrow
      // 012: ldc2_w NaN
      // 015: dreturn
      // 016: athrow
      // 017: aload 2
      // 018: getfield net/minecraft/class_243.field_1352 D
      // 01b: aload 1
      // 01c: getfield net/minecraft/class_243.field_1352 D
      // 01f: dsub
      // 020: dstore 5
      // 022: aload 2
      // 023: getfield net/minecraft/class_243.field_1351 D
      // 026: aload 1
      // 027: getfield net/minecraft/class_243.field_1351 D
      // 02a: dsub
      // 02b: dstore 7
      // 02d: aload 2
      // 02e: getfield net/minecraft/class_243.field_1350 D
      // 031: aload 1
      // 032: getfield net/minecraft/class_243.field_1350 D
      // 035: dsub
      // 036: dstore 9
      // 038: dload 5
      // 03a: invokestatic java/lang/Math.abs (D)D
      // 03d: dstore 11
      // 03f: dload 7
      // 041: invokestatic java/lang/Math.abs (D)D
      // 044: dstore 13
      // 046: dload 9
      // 048: invokestatic java/lang/Math.abs (D)D
      // 04b: dstore 15
      // 04d: dload 11
      // 04f: dload 13
      // 051: iload 4
      // 053: ifne 09b
      // 056: dcmpl
      // 057: iflt 097
      // 05a: goto 05e
      // 05d: athrow
      // 05e: dload 11
      // 060: dload 15
      // 062: iload 4
      // 064: ifne 09b
      // 067: goto 06b
      // 06a: athrow
      // 06b: dcmpl
      // 06c: iflt 097
      // 06f: goto 073
      // 072: athrow
      // 073: dload 11
      // 075: iload 4
      // 077: ifne 099
      // 07a: goto 07e
      // 07d: athrow
      // 07e: ldc2_w 1.0E-7
      // 081: dcmpl
      // 082: ifle 097
      // 085: goto 089
      // 088: athrow
      // 089: aload 3
      // 08a: getfield net/minecraft/class_243.field_1352 D
      // 08d: aload 1
      // 08e: getfield net/minecraft/class_243.field_1352 D
      // 091: dsub
      // 092: dload 5
      // 094: ddiv
      // 095: dreturn
      // 096: athrow
      // 097: dload 13
      // 099: dload 11
      // 09b: iload 4
      // 09d: ifne 0ef
      // 0a0: dcmpl
      // 0a1: iflt 0e1
      // 0a4: goto 0a8
      // 0a7: athrow
      // 0a8: dload 13
      // 0aa: dload 15
      // 0ac: iload 4
      // 0ae: ifne 0ef
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: dcmpl
      // 0b6: iflt 0e1
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: dload 13
      // 0bf: iload 4
      // 0c1: ifne 0e3
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: ldc2_w 1.0E-7
      // 0cb: dcmpl
      // 0cc: ifle 0e1
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: aload 3
      // 0d4: getfield net/minecraft/class_243.field_1351 D
      // 0d7: aload 1
      // 0d8: getfield net/minecraft/class_243.field_1351 D
      // 0db: dsub
      // 0dc: dload 7
      // 0de: ddiv
      // 0df: dreturn
      // 0e0: athrow
      // 0e1: dload 15
      // 0e3: iload 4
      // 0e5: ifne 104
      // 0e8: ldc2_w 1.0E-7
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: dcmpl
      // 0f0: ifle 101
      // 0f3: aload 3
      // 0f4: getfield net/minecraft/class_243.field_1350 D
      // 0f7: aload 1
      // 0f8: getfield net/minecraft/class_243.field_1350 D
      // 0fb: dsub
      // 0fc: dload 9
      // 0fe: ddiv
      // 0ff: dreturn
      // 100: athrow
      // 101: ldc2_w NaN
      // 104: dreturn
   }

   private void aaaaaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 035
      // 009: aload 1
      // 00a: aload 0
      // 00b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 00e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 011: ifeq 030
      // 014: goto 018
      // 017: athrow
      // 018: aload 0
      // 019: iload 2
      // 01a: ifne 035
      // 01d: goto 021
      // 020: athrow
      // 021: aload 1
      // 022: aload 0
      // 023: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 026: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 029: ifne 03a
      // 02c: goto 030
      // 02f: athrow
      // 030: aload 0
      // 031: goto 035
      // 034: athrow
      // 035: aload 1
      // 036: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 039: return
      // 03a: aload 1
      // 03b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 03e: aload 0
      // 03f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb Lnet/minecraft/class_2338;
      // 042: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 045: astore 3
      // 046: aload 0
      // 047: iload 2
      // 048: ifne 08b
      // 04b: aload 1
      // 04c: aload 0
      // 04d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb Lnet/minecraft/class_2338;
      // 050: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 053: ifne 08a
      // 056: goto 05a
      // 059: athrow
      // 05a: aload 3
      // 05b: aload 1
      // 05c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 05f: aload 0
      // 060: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb Lnet/minecraft/class_2338;
      // 063: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 066: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 069: ifeq 07d
      // 06c: goto 070
      // 06f: athrow
      // 070: aload 0
      // 071: aload 1
      // 072: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aababbb (Lnet/minecraft/class_310;)V
      // 075: iload 2
      // 076: ifeq 089
      // 079: goto 07d
      // 07c: athrow
      // 07d: aload 0
      // 07e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 081: aload 1
      // 082: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // 085: goto 089
      // 088: athrow
      // 089: return
      // 08a: aload 0
      // 08b: aload 1
      // 08c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaa (Lnet/minecraft/class_310;)I
      // 08f: istore 4
      // 091: iload 4
      // 093: ifge 09b
      // 096: aconst_null
      // 097: goto 0ac
      // 09a: athrow
      // 09b: aload 0
      // 09c: aload 1
      // 09d: aload 0
      // 09e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb Lnet/minecraft/class_2338;
      // 0a1: aload 0
      // 0a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 0a5: aload 0
      // 0a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 0a9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaababb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa;
      // 0ac: astore 5
      // 0ae: iload 2
      // 0af: ifne 0cc
      // 0b2: aload 5
      // 0b4: ifnonnull 0c2
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: aload 1
      // 0bd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aababbb (Lnet/minecraft/class_310;)V
      // 0c0: return
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: aload 1
      // 0c4: iload 4
      // 0c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababba (Lnet/minecraft/class_310;I)Lnet/minecraft/class_2680;
      // 0c9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 0cc: aload 0
      // 0cd: aload 1
      // 0ce: iload 4
      // 0d0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaab (Lnet/minecraft/class_310;I)Z
      // 0d3: ifne 0d8
      // 0d6: return
      // 0d7: athrow
      // 0d8: aload 1
      // 0d9: aload 5
      // 0db: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa.aa ()Lnet/minecraft/class_243;
      // 0de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 0e1: astore 6
      // 0e3: aload 6
      // 0e5: iload 2
      // 0e6: ifne 0f2
      // 0e9: ifnull 0f7
      // 0ec: goto 0f0
      // 0ef: athrow
      // 0f0: aload 6
      // 0f2: bipush 0
      // 0f3: faload
      // 0f4: goto 0fe
      // 0f7: aload 1
      // 0f8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0fb: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 0fe: fstore 7
      // 100: aload 6
      // 102: iload 2
      // 103: ifne 10f
      // 106: ifnull 114
      // 109: goto 10d
      // 10c: athrow
      // 10d: aload 6
      // 10f: bipush 1
      // 110: faload
      // 111: goto 11b
      // 114: aload 1
      // 115: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 118: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 11b: fstore 8
      // 11d: aload 5
      // 11f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa.b ()Lnet/minecraft/class_3965;
      // 122: astore 9
      // 124: aload 0
      // 125: aload 1
      // 126: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 129: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 12c: fload 7
      // 12e: fload 8
      // 130: aload 9
      // 132: aload 0
      // 133: aload 1
      // 134: iload 4
      // 136: aload 9
      // 138: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ab (Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Z, ()Z ]
      // 13d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababbbb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;FFLnet/minecraft/class_3965;Ljava/util/function/BooleanSupplier;)V
      // 140: return
   }

   private void aaaaab(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 067
      // 009: aload 1
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababbba (Lnet/minecraft/class_310;)Z
      // 00d: ifeq 062
      // 010: goto 014
      // 013: athrow
      // 014: aload 0
      // 015: iload 2
      // 016: ifne 067
      // 019: goto 01d
      // 01c: athrow
      // 01d: aload 1
      // 01e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 021: aload 0
      // 022: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 025: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 028: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 02b: ifeq 062
      // 02e: goto 032
      // 031: athrow
      // 032: aload 0
      // 033: iload 2
      // 034: ifne 067
      // 037: goto 03b
      // 03a: athrow
      // 03b: aload 1
      // 03c: aload 0
      // 03d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 040: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 043: ifeq 062
      // 046: goto 04a
      // 049: athrow
      // 04a: aload 0
      // 04b: iload 2
      // 04c: ifne 06d
      // 04f: goto 053
      // 052: athrow
      // 053: aload 1
      // 054: aload 0
      // 055: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 058: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 05b: ifne 06c
      // 05e: goto 062
      // 061: athrow
      // 062: aload 0
      // 063: goto 067
      // 066: athrow
      // 067: aload 1
      // 068: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 06b: return
      // 06c: aload 0
      // 06d: aload 1
      // 06e: iload 2
      // 06f: ifne 098
      // 072: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 075: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 078: aload 0
      // 079: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbbbb I
      // 07c: aload 0
      // 07d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 080: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabba (Lnet/minecraft/class_1661;ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;)Z
      // 083: ifeq 0a2
      // 086: goto 08a
      // 089: athrow
      // 08a: aload 0
      // 08b: iload 2
      // 08c: ifne 0a5
      // 08f: goto 093
      // 092: athrow
      // 093: aload 1
      // 094: goto 098
      // 097: athrow
      // 098: aload 0
      // 099: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbbbb I
      // 09c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaab (Lnet/minecraft/class_310;I)Z
      // 09f: ifne 0a4
      // 0a2: return
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: iload 2
      // 0a6: ifne 0c3
      // 0a9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 0ac: ifeq 0c2
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: aload 0
      // 0b5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 0b8: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 0bb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bababa (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 0be: goto 0cb
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: aload 1
      // 0c4: aload 0
      // 0c5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 0c8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 0cb: astore 3
      // 0cc: aload 3
      // 0cd: ifnonnull 0d2
      // 0d0: return
      // 0d1: athrow
      // 0d2: aload 1
      // 0d3: aload 3
      // 0d4: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 0d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 0da: astore 4
      // 0dc: iload 2
      // 0dd: ifne 117
      // 0e0: aload 4
      // 0e2: ifnonnull 0eb
      // 0e5: goto 0e9
      // 0e8: athrow
      // 0e9: return
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: aload 4
      // 0ee: bipush 0
      // 0ef: faload
      // 0f0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baab F
      // 0f3: aload 0
      // 0f4: aload 4
      // 0f6: bipush 1
      // 0f7: faload
      // 0f8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbb F
      // 0fb: aload 0
      // 0fc: aload 1
      // 0fd: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 100: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 103: aload 0
      // 104: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baab F
      // 107: aload 0
      // 108: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbb F
      // 10b: aload 3
      // 10c: aload 0
      // 10d: aload 1
      // 10e: aload 3
      // 10f: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabab (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z, ()Z ]
      // 114: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababbbb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;FFLnet/minecraft/class_3965;Ljava/util/function/BooleanSupplier;)V
      // 117: return
   }

   private static class_2338[] aaaaba(int var0) {
      return new class_2338[var0];
   }

   private class_243 aaaabb(class_2338 var1) {
      return new class_243(var1.method_10263() + 0.5, var1.method_10264() + 0.38, var1.method_10260() + 0.5);
   }

   private void aaabaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 025
      // 009: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 00c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 00f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababab;
      // 012: if_acmpne 0ab
      // 015: goto 019
      // 018: athrow
      // 019: aload 0
      // 01a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 01d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 020: aload 0
      // 021: goto 025
      // 024: athrow
      // 025: aload 1
      // 026: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 029: getfield net/minecraft/class_746.field_6012 I
      // 02c: bipush 1
      // 02d: iadd
      // 02e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaab I
      // 031: aload 1
      // 032: aload 0
      // 033: aload 0
      // 034: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 037: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 03a: bipush 1
      // 03b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.abbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;Z)Z
      // 03e: istore 3
      // 03f: aload 0
      // 040: aload 0
      // 041: aload 1
      // 042: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabbb (Lnet/minecraft/class_310;)Z, ()Z ]
      // 047: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;
      // 04a: aload 1
      // 04b: aload 0
      // 04c: ldc_w -462442838
      // 04f: ldc_w 804021476
      // 052: ldc_w -2003456900
      // 055: ixor
      // 056: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 059: ldc2_w 3688895270646010381
      // 05c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 05f: iload 3
      // 060: ifeq 06e
      // 063: aload 1
      // 064: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 067: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 06a: goto 072
      // 06d: athrow
      // 06e: aload 0
      // 06f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbb F
      // 072: iload 3
      // 073: ifeq 081
      // 076: aload 1
      // 077: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 07a: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 07d: goto 085
      // 080: athrow
      // 081: aload 0
      // 082: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaba F
      // 085: aload 0
      // 086: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;
      // 089: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaaab (Lnet/minecraft/class_310;Ljava/lang/Object;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 08c: istore 4
      // 08e: iload 2
      // 08f: ifne 0a3
      // 092: iload 4
      // 094: ifne 0aa
      // 097: goto 09b
      // 09a: athrow
      // 09b: aload 0
      // 09c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbaab ()V
      // 09f: goto 0a3
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: invokestatic java/lang/System.currentTimeMillis ()J
      // 0a7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 0aa: return
      // 0ab: aload 1
      // 0ac: aload 0
      // 0ad: aload 0
      // 0ae: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 0b1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 0b4: bipush 1
      // 0b5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.abbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;Z)Z
      // 0b8: istore 3
      // 0b9: iload 3
      // 0ba: ifeq 0c2
      // 0bd: fconst_0
      // 0be: goto 0df
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 0c6: aload 1
      // 0c7: aload 0
      // 0c8: aload 0
      // 0c9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 0cc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 0cf: aload 0
      // 0d0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 0d3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0d6: checkcast java/lang/Double
      // 0d9: invokevirtual java/lang/Double.floatValue ()F
      // 0dc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.bbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;F)F
      // 0df: fstore 4
      // 0e1: iload 2
      // 0e2: invokestatic java/lang/System.currentTimeMillis ()J
      // 0e5: lstore 5
      // 0e7: ifne 14b
      // 0ea: iload 3
      // 0eb: ifne 128
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: fload 4
      // 0f4: ldc 0.5
      // 0f6: fcmpg
      // 0f7: iload 2
      // 0f8: ifne 125
      // 0fb: goto 0ff
      // 0fe: athrow
      // 0ff: ifle 128
      // 102: goto 106
      // 105: athrow
      // 106: lload 5
      // 108: aload 0
      // 109: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbba J
      // 10c: lsub
      // 10d: ldc_w -462442835
      // 110: ldc_w 804021476
      // 113: ldc_w 687922964
      // 116: ixor
      // 117: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 11a: ldc2_w 603033607859111737
      // 11d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 120: lcmp
      // 121: goto 125
      // 124: athrow
      // 125: iflt 1ab
      // 128: aload 0
      // 129: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 12c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 12f: aload 0
      // 130: aload 1
      // 131: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 134: getfield net/minecraft/class_746.field_6012 I
      // 137: bipush 1
      // 138: iadd
      // 139: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaab I
      // 13c: aload 0
      // 13d: aload 0
      // 13e: aload 1
      // 13f: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abab (Lnet/minecraft/class_310;)Z, ()Z ]
      // 144: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;
      // 147: goto 14b
      // 14a: athrow
      // 14b: aload 1
      // 14c: aload 0
      // 14d: ldc_w -462442836
      // 150: ldc_w 804021476
      // 153: ldc_w -2137189622
      // 156: ixor
      // 157: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 15a: ldc2_w 3688895270646010381
      // 15d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 160: iload 3
      // 161: ifeq 16f
      // 164: aload 1
      // 165: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 168: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 16b: goto 173
      // 16e: athrow
      // 16f: aload 0
      // 170: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbb F
      // 173: iload 3
      // 174: ifeq 182
      // 177: aload 1
      // 178: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 17b: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 17e: goto 186
      // 181: athrow
      // 182: aload 0
      // 183: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaba F
      // 186: aload 0
      // 187: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;
      // 18a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaaab (Lnet/minecraft/class_310;Ljava/lang/Object;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 18d: istore 7
      // 18f: iload 2
      // 190: ifne 1a4
      // 193: iload 7
      // 195: ifne 1ab
      // 198: goto 19c
      // 19b: athrow
      // 19c: aload 0
      // 19d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbaab ()V
      // 1a0: goto 1a4
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: invokestatic java/lang/System.currentTimeMillis ()J
      // 1a8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 1ab: return
   }

   private static int aaabab(class_2338 param0, class_2350 param1, class_2338 param2, class_2338 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 2
      // 04: aload 0
      // 05: invokevirtual net/minecraft/class_2338.method_10262 (Lnet/minecraft/class_2382;)D
      // 08: dstore 5
      // 0a: aload 3
      // 0b: aload 0
      // 0c: invokevirtual net/minecraft/class_2338.method_10262 (Lnet/minecraft/class_2382;)D
      // 0f: dstore 7
      // 11: dload 5
      // 13: dload 7
      // 15: invokestatic java/lang/Double.compare (DD)I
      // 18: istore 9
      // 1a: istore 4
      // 1c: iload 9
      // 1e: iload 4
      // 20: ifne 38
      // 23: ifne 32
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 1
      // 2b: ifnonnull 39
      // 2e: goto 32
      // 31: athrow
      // 32: iload 9
      // 34: goto 38
      // 37: athrow
      // 38: ireturn
      // 39: aload 2
      // 3a: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 3d: aload 0
      // 3e: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 41: isub
      // 42: aload 1
      // 43: invokevirtual net/minecraft/class_2350.method_10148 ()I
      // 46: imul
      // 47: aload 2
      // 48: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 4b: aload 0
      // 4c: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 4f: isub
      // 50: aload 1
      // 51: invokevirtual net/minecraft/class_2350.method_10165 ()I
      // 54: imul
      // 55: iadd
      // 56: istore 10
      // 58: aload 3
      // 59: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 5c: aload 0
      // 5d: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 60: isub
      // 61: aload 1
      // 62: invokevirtual net/minecraft/class_2350.method_10148 ()I
      // 65: imul
      // 66: aload 3
      // 67: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 6a: aload 0
      // 6b: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 6e: isub
      // 6f: aload 1
      // 70: invokevirtual net/minecraft/class_2350.method_10165 ()I
      // 73: imul
      // 74: iadd
      // 75: istore 11
      // 77: iload 11
      // 79: iload 10
      // 7b: invokestatic java/lang/Integer.compare (II)I
      // 7e: ireturn
   }

   private static class_2338[] aaabba(int var0) {
      return new class_2338[var0];
   }

   private long aaabbb(abbbabaaa var1) {
      return babb(a(-462442833, 1854994931 ^ -850084565), 1916312134567979601L);
   }

   private int aabaaa(class_310 param1) {
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
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 31
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush -1
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 26: iload 2
      // 27: ifne c6
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 2d: goto 31
      // 30: athrow
      // 31: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaab;
      // 34: if_acmpne bf
      // 37: bipush 0
      // 38: istore 3
      // 39: iload 3
      // 3a: ldc_w -462442834
      // 3d: ldc_w -4225041
      // 40: ldc_w 1703615113
      // 43: ixor
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 47: ldc2_w 7050441791445182372
      // 4a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 4d: if_icmpge b3
      // 50: aload 1
      // 51: iload 2
      // 52: ifne b4
      // 55: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 58: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 5b: iload 3
      // 5c: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 5f: astore 4
      // 61: iload 2
      // 62: aload 4
      // 64: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 67: astore 6
      // 69: ifne af
      // 6c: aload 6
      // 6e: instanceof net/minecraft/class_1747
      // 71: ifeq ac
      // 74: goto 78
      // 77: athrow
      // 78: aload 6
      // 7a: checkcast net/minecraft/class_1747
      // 7d: astore 5
      // 7f: iload 2
      // 80: ifne af
      // 83: aload 5
      // 85: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
      // 88: instanceof net/minecraft/class_2482
      // 8b: ifeq ac
      // 8e: goto 92
      // 91: athrow
      // 92: aload 4
      // 94: aload 1
      // 95: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 98: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabab (Lnet/minecraft/class_1799;Lnet/minecraft/class_638;)Z
      // 9b: iload 2
      // 9c: ifne ab
      // 9f: goto a3
      // a2: athrow
      // a3: ifeq ac
      // a6: goto aa
      // a9: athrow
      // aa: iload 3
      // ab: ireturn
      // ac: iinc 3 1
      // af: iload 2
      // b0: ifeq 39
      // b3: aload 1
      // b4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // b7: aload 1
      // b8: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // bb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.baabbaa (Lnet/minecraft/class_746;Lnet/minecraft/class_638;)I
      // be: ireturn
      // bf: aload 0
      // c0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // c6: checkcast java/lang/Double
      // c9: invokevirtual java/lang/Double.doubleValue ()D
      // cc: invokestatic java/lang/Math.round (D)J
      // cf: l2i
      // d0: bipush 1
      // d1: isub
      // d2: istore 3
      // d3: aload 0
      // d4: aload 1
      // d5: iload 3
      // d6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbaaa (Lnet/minecraft/class_310;I)Z
      // d9: iload 2
      // da: ifne e5
      // dd: ifeq e8
      // e0: goto e4
      // e3: athrow
      // e4: iload 3
      // e5: goto e9
      // e8: bipush -1
      // e9: ireturn
   }

   private void aabaab(class_310 var1) {
      this.ababaaa(var1);
      this.abb();
      this.aabbaba();
   }

   private abbbaaaa aababa(
      class_310 param1, aaaaaabaa param2, float param3, float param4, boolean param5
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaba (Lnet/minecraft/class_310;)Lnet/minecraft/class_243;
      // 005: astore 7
      // 007: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 00a: aload 0
      // 00b: fload 3
      // 00c: fload 4
      // 00e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabab (FF)Lnet/minecraft/class_243;
      // 011: aload 2
      // 012: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.b ()D
      // 015: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 018: astore 8
      // 01a: istore 6
      // 01c: aconst_null
      // 01d: astore 9
      // 01f: bipush 0
      // 020: istore 10
      // 022: iload 10
      // 024: ldc_w -462442847
      // 027: ldc_w 2112103067
      // 02a: ldc_w 1358803164
      // 02d: ixor
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 031: ldc2_w 2094530860357947497
      // 034: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 037: if_icmpge 195
      // 03a: aload 7
      // 03c: aload 8
      // 03e: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 041: astore 11
      // 043: aload 0
      // 044: aload 1
      // 045: aload 7
      // 047: aload 11
      // 049: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_3965;
      // 04c: astore 12
      // 04e: aload 0
      // 04f: aload 12
      // 051: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbbb (Lnet/minecraft/class_3965;)Z
      // 054: iload 6
      // 056: ifne 081
      // 059: ifeq 080
      // 05c: goto 060
      // 05f: athrow
      // 060: aload 0
      // 061: aload 1
      // 062: aload 2
      // 063: aload 12
      // 065: fload 3
      // 066: fload 4
      // 068: iload 5
      // 06a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_3965;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 06d: astore 13
      // 06f: aload 13
      // 071: iload 6
      // 073: ifne 07f
      // 076: ifnull 080
      // 079: goto 07d
      // 07c: athrow
      // 07d: aload 13
      // 07f: areturn
      // 080: bipush 1
      // 081: istore 13
      // 083: iload 13
      // 085: ldc_w -462442848
      // 088: ldc_w 2112103067
      // 08b: ldc_w 1336575686
      // 08e: ixor
      // 08f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 092: ldc2_w 5697109675361375984
      // 095: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 098: if_icmpgt 143
      // 09b: iload 13
      // 09d: i2d
      // 09e: ldc2_w 10.0
      // 0a1: ddiv
      // 0a2: iload 6
      // 0a4: ifne 17a
      // 0a7: dstore 14
      // 0a9: iload 6
      // 0ab: aload 7
      // 0ad: aload 11
      // 0af: dload 14
      // 0b1: invokevirtual net/minecraft/class_243.method_35590 (Lnet/minecraft/class_243;D)Lnet/minecraft/class_243;
      // 0b4: astore 16
      // 0b6: aload 16
      // 0b8: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
      // 0bb: astore 17
      // 0bd: ifne 13e
      // 0c0: aload 9
      // 0c2: ifnull 137
      // 0c5: goto 0c9
      // 0c8: athrow
      // 0c9: aload 9
      // 0cb: iload 6
      // 0cd: ifne 139
      // 0d0: goto 0d4
      // 0d3: athrow
      // 0d4: aload 17
      // 0d6: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 0d9: ifne 137
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: aload 1
      // 0e2: aload 17
      // 0e4: ldc_w 48.0
      // 0e7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;F)Z
      // 0ea: iload 6
      // 0ec: ifne 111
      // 0ef: goto 0f3
      // 0f2: athrow
      // 0f3: ifeq 137
      // 0f6: goto 0fa
      // 0f9: athrow
      // 0fa: aload 1
      // 0fb: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0fe: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 101: aload 17
      // 103: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 106: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 109: ldc2_w 1.5
      // 10c: dcmpl
      // 10d: goto 111
      // 110: athrow
      // 111: iflt 137
      // 114: aload 0
      // 115: aload 1
      // 116: aload 2
      // 117: aload 9
      // 119: aload 17
      // 11b: fload 3
      // 11c: fload 4
      // 11e: iload 5
      // 120: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 123: astore 18
      // 125: iload 6
      // 127: ifne 13e
      // 12a: aload 18
      // 12c: ifnull 137
      // 12f: goto 133
      // 132: athrow
      // 133: aload 18
      // 135: areturn
      // 136: athrow
      // 137: aload 17
      // 139: astore 9
      // 13b: iinc 13 1
      // 13e: iload 6
      // 140: ifeq 083
      // 143: aload 0
      // 144: aload 12
      // 146: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbbb (Lnet/minecraft/class_3965;)Z
      // 149: iload 6
      // 14b: ifne 187
      // 14e: ifeq 158
      // 151: goto 155
      // 154: athrow
      // 155: aconst_null
      // 156: areturn
      // 157: athrow
      // 158: aload 11
      // 15a: astore 7
      // 15c: iload 6
      // 15e: ifne 190
      // 161: aload 8
      // 163: aload 2
      // 164: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.ab ()D
      // 167: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 16a: dconst_0
      // 16b: aload 2
      // 16c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.aa ()D
      // 16f: dconst_0
      // 170: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 173: astore 8
      // 175: aload 7
      // 177: getfield net/minecraft/class_243.field_1351 D
      // 17a: aload 1
      // 17b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 17e: invokevirtual net/minecraft/class_638.method_31607 ()I
      // 181: i2d
      // 182: ldc2_w 20.0
      // 185: dsub
      // 186: dcmpg
      // 187: ifge 18d
      // 18a: aconst_null
      // 18b: areturn
      // 18c: athrow
      // 18d: iinc 10 1
      // 190: iload 6
      // 192: ifeq 022
      // 195: aconst_null
      // 196: areturn
   }

   private static int aabbaa(class_243 param0, double param1, double param3, double param5, double param7, class_2338 param9, class_2338 param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 9
      // 05: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 08: i2d
      // 09: ldc2_w 0.5
      // 0c: dadd
      // 0d: aload 0
      // 0e: getfield net/minecraft/class_243.field_1352 D
      // 11: dsub
      // 12: dload 1
      // 13: dmul
      // 14: aload 9
      // 16: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 19: i2d
      // 1a: ldc2_w 0.5
      // 1d: dadd
      // 1e: aload 0
      // 1f: getfield net/minecraft/class_243.field_1350 D
      // 22: dsub
      // 23: dload 3
      // 24: dmul
      // 25: dadd
      // 26: dstore 12
      // 28: istore 11
      // 2a: aload 10
      // 2c: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 2f: i2d
      // 30: ldc2_w 0.5
      // 33: dadd
      // 34: aload 0
      // 35: getfield net/minecraft/class_243.field_1352 D
      // 38: dsub
      // 39: dload 1
      // 3a: dmul
      // 3b: aload 10
      // 3d: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 40: i2d
      // 41: ldc2_w 0.5
      // 44: dadd
      // 45: aload 0
      // 46: getfield net/minecraft/class_243.field_1350 D
      // 49: dsub
      // 4a: dload 3
      // 4b: dmul
      // 4c: dadd
      // 4d: dstore 14
      // 4f: dload 14
      // 51: dload 12
      // 53: invokestatic java/lang/Double.compare (DD)I
      // 56: istore 16
      // 58: iload 16
      // 5a: iload 11
      // 5c: ifne 6f
      // 5f: ifeq 6a
      // 62: goto 66
      // 65: athrow
      // 66: iload 16
      // 68: ireturn
      // 69: athrow
      // 6a: aload 9
      // 6c: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 6f: i2d
      // 70: ldc2_w 0.125
      // 73: dadd
      // 74: aload 0
      // 75: getfield net/minecraft/class_243.field_1351 D
      // 78: dsub
      // 79: dload 5
      // 7b: dmul
      // 7c: dload 12
      // 7e: dload 7
      // 80: dmul
      // 81: dadd
      // 82: dstore 17
      // 84: aload 10
      // 86: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 89: i2d
      // 8a: ldc2_w 0.125
      // 8d: dadd
      // 8e: aload 0
      // 8f: getfield net/minecraft/class_243.field_1351 D
      // 92: dsub
      // 93: dload 5
      // 95: dmul
      // 96: dload 14
      // 98: dload 7
      // 9a: dmul
      // 9b: dadd
      // 9c: dstore 19
      // 9e: dload 17
      // a0: invokestatic java/lang/Math.abs (D)D
      // a3: dload 19
      // a5: invokestatic java/lang/Math.abs (D)D
      // a8: invokestatic java/lang/Double.compare (DD)I
      // ab: ireturn
   }

   private boolean aabbab(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 53
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 53
      // 17: aload 2
      // 18: ifnull 53
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 1
      // 21: iload 3
      // 22: ifne 40
      // 25: goto 29
      // 28: athrow
      // 29: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2c: aload 2
      // 2d: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 30: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 33: ifeq 53
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 1
      // 3c: goto 40
      // 3f: athrow
      // 40: aload 2
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 44: iload 3
      // 45: ifne 50
      // 48: ifeq 53
      // 4b: goto 4f
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   static class_2338[] aabbbb(class_243 param0, float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: ifnull 01b
      // 008: fload 1
      // 009: iload 2
      // 00a: ifne 022
      // 00d: goto 011
      // 010: athrow
      // 011: invokestatic java/lang/Float.isFinite (F)Z
      // 014: ifne 021
      // 017: goto 01b
      // 01a: athrow
      // 01b: bipush 0
      // 01c: anewarray 317
      // 01f: areturn
      // 020: athrow
      // 021: fload 1
      // 022: f2d
      // 023: invokestatic java/lang/Math.toRadians (D)D
      // 026: dstore 3
      // 027: dload 3
      // 028: invokestatic java/lang/Math.sin (D)D
      // 02b: dneg
      // 02c: dstore 5
      // 02e: dload 3
      // 02f: invokestatic java/lang/Math.cos (D)D
      // 032: dstore 7
      // 034: new java/util/LinkedHashSet
      // 037: dup
      // 038: invokespecial java/util/LinkedHashSet.<init> ()V
      // 03b: astore 9
      // 03d: bipush 2
      // 03e: istore 10
      // 040: iload 10
      // 042: bipush 4
      // 043: if_icmpgt 157
      // 046: aload 0
      // 047: getfield net/minecraft/class_243.field_1352 D
      // 04a: dload 5
      // 04c: iload 10
      // 04e: i2d
      // 04f: dmul
      // 050: dadd
      // 051: aload 0
      // 052: getfield net/minecraft/class_243.field_1351 D
      // 055: aload 0
      // 056: getfield net/minecraft/class_243.field_1350 D
      // 059: dload 7
      // 05b: iload 10
      // 05d: i2d
      // 05e: dmul
      // 05f: dadd
      // 060: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 063: astore 11
      // 065: bipush 3
      // 066: newarray 10
      // 068: dup
      // 069: bipush 0
      // 06a: bipush 0
      // 06b: iastore
      // 06c: dup
      // 06d: bipush 1
      // 06e: bipush 1
      // 06f: iastore
      // 070: dup
      // 071: bipush 2
      // 072: bipush -1
      // 073: iastore
      // 074: astore 12
      // 076: aload 12
      // 078: arraylength
      // 079: istore 13
      // 07b: bipush 0
      // 07c: istore 14
      // 07e: iload 14
      // 080: iload 13
      // 082: if_icmpge 150
      // 085: aload 12
      // 087: iload 14
      // 089: iaload
      // 08a: iload 2
      // 08b: ifne 042
      // 08e: istore 15
      // 090: bipush -1
      // 091: istore 16
      // 093: iload 16
      // 095: bipush 1
      // 096: if_icmpgt 149
      // 099: iload 2
      // 09a: ifne 14c
      // 09d: bipush -1
      // 09e: istore 17
      // 0a0: iload 17
      // 0a2: bipush 1
      // 0a3: if_icmpgt 142
      // 0a6: aload 11
      // 0a8: iload 16
      // 0aa: iload 15
      // 0ac: iload 17
      // 0ae: invokevirtual net/minecraft/class_2338.method_10069 (III)Lnet/minecraft/class_2338;
      // 0b1: astore 18
      // 0b3: aload 18
      // 0b5: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0b8: i2d
      // 0b9: ldc2_w 0.5
      // 0bc: dadd
      // 0bd: aload 0
      // 0be: getfield net/minecraft/class_243.field_1352 D
      // 0c1: dsub
      // 0c2: dstore 19
      // 0c4: aload 18
      // 0c6: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0c9: i2d
      // 0ca: ldc2_w 0.5
      // 0cd: dadd
      // 0ce: aload 0
      // 0cf: getfield net/minecraft/class_243.field_1350 D
      // 0d2: dsub
      // 0d3: dstore 21
      // 0d5: dload 19
      // 0d7: dload 5
      // 0d9: dmul
      // 0da: dload 21
      // 0dc: dload 7
      // 0de: dmul
      // 0df: iload 2
      // 0e0: ifne 055
      // 0e3: dadd
      // 0e4: dstore 23
      // 0e6: iload 2
      // 0e7: dload 19
      // 0e9: dload 7
      // 0eb: dmul
      // 0ec: dload 21
      // 0ee: dload 5
      // 0f0: dmul
      // 0f1: dsub
      // 0f2: dstore 25
      // 0f4: ifne 13e
      // 0f7: dload 23
      // 0f9: dconst_1
      // 0fa: dcmpl
      // 0fb: iflt 13b
      // 0fe: goto 102
      // 101: athrow
      // 102: dload 23
      // 104: iload 2
      // 105: ifne 120
      // 108: goto 10c
      // 10b: athrow
      // 10c: ldc2_w 4.5
      // 10f: dcmpg
      // 110: ifgt 13b
      // 113: goto 117
      // 116: athrow
      // 117: dload 25
      // 119: invokestatic java/lang/Math.abs (D)D
      // 11c: goto 120
      // 11f: athrow
      // 120: ldc2_w 1.5
      // 123: dcmpg
      // 124: iload 2
      // 125: ifne 13a
      // 128: ifgt 13b
      // 12b: goto 12f
      // 12e: athrow
      // 12f: aload 9
      // 131: aload 18
      // 133: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 136: goto 13a
      // 139: athrow
      // 13a: pop
      // 13b: iinc 17 1
      // 13e: iload 2
      // 13f: ifeq 0a0
      // 142: iinc 16 1
      // 145: iload 2
      // 146: ifeq 093
      // 149: iinc 14 1
      // 14c: iload 2
      // 14d: ifeq 07e
      // 150: iinc 10 1
      // 153: iload 2
      // 154: ifeq 040
      // 157: aload 9
      // 159: invokedynamic apply ()Ljava/util/function/IntFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabba (I)[Lnet/minecraft/class_2338;, (I)[Lnet/minecraft/class_2338; ]
      // 15e: invokevirtual java/util/LinkedHashSet.toArray (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
      // 161: checkcast [Lnet/minecraft/class_2338;
      // 164: areturn
   }

   private class_2338 abaaaa(class_310 param1) {
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
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 36
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnonnull 35
      // 2e: goto 32
      // 31: athrow
      // 32: aconst_null
      // 33: areturn
      // 34: athrow
      // 35: aload 1
      // 36: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 39: astore 3
      // 3a: aload 3
      // 3b: iload 2
      // 3c: ifne 4e
      // 3f: instanceof net/minecraft/class_3965
      // 42: ifeq 5e
      // 45: goto 49
      // 48: athrow
      // 49: aload 3
      // 4a: goto 4e
      // 4d: athrow
      // 4e: checkcast net/minecraft/class_3965
      // 51: astore 4
      // 53: aload 4
      // 55: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 58: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 5b: if_acmpeq 61
      // 5e: aconst_null
      // 5f: areturn
      // 60: athrow
      // 61: aload 0
      // 62: aload 1
      // 63: aload 4
      // 65: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaab (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Lnet/minecraft/class_2338;
      // 68: areturn
   }

   private class_3965 abaaab(class_2338 var1) {
      return new class_3965(this.bbabb(var1), class_2350.field_11036, var1.method_10074(), false);
   }

   private abbbaaaa abaaba(
      class_2338 param1, class_2350 param2, class_310 param3, aaaaaabaa param4, float param5, float param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababbab (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)[Lnet/minecraft/class_2338;
      // 09: astore 8
      // 0b: istore 7
      // 0d: aload 8
      // 0f: arraylength
      // 10: istore 9
      // 12: bipush 0
      // 13: istore 10
      // 15: iload 10
      // 17: iload 9
      // 19: if_icmpge 4e
      // 1c: aload 8
      // 1e: iload 10
      // 20: aaload
      // 21: astore 11
      // 23: iload 7
      // 25: aload 0
      // 26: aload 3
      // 27: aload 4
      // 29: aload 11
      // 2b: aload 1
      // 2c: fload 5
      // 2e: fload 6
      // 30: bipush 1
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 34: astore 12
      // 36: ifne 49
      // 39: aload 12
      // 3b: ifnull 46
      // 3e: goto 42
      // 41: athrow
      // 42: aload 12
      // 44: areturn
      // 45: athrow
      // 46: iinc 10 1
      // 49: iload 7
      // 4b: ifeq 15
      // 4e: aconst_null
      // 4f: areturn
   }

   private class_243 abaabb(class_2338 var1) {
      return class_243.method_24955(var1).method_1031(0.0, 0.5, 0.0);
   }

   private static String aaaaabba(int var0, int var1) {
      int var3 = var0 ^ 1201985770;
      char[] var4 = baaaba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])baaabb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         baaabb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -644340080;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 145;
            case 1 -> 216;
            case 2 -> 119;
            case 3 -> 68;
            case 4 -> 253;
            case 5 -> 93;
            case 6 -> 12;
            case 7 -> 42;
            case 8 -> 111;
            case 9 -> 38;
            case 10 -> 172;
            case 11 -> 144;
            case 12 -> 122;
            case 13 -> 82;
            case 14 -> 213;
            case 15 -> 31;
            case 16 -> 106;
            case 17 -> 107;
            case 18 -> 123;
            case 19 -> 27;
            case 20 -> 230;
            case 21 -> 194;
            case 22 -> 7;
            case 23 -> 185;
            case 24 -> 128;
            case 25 -> 199;
            case 26 -> 73;
            case 27 -> 1;
            case 28 -> 208;
            case 29 -> 2;
            case 30 -> 214;
            case 31 -> 23;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private void ababaa(class_310 param1) {
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
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 30
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: return
      // 20: athrow
      // 21: aload 0
      // 22: iload 2
      // 23: ifne 44
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 2c: goto 30
      // 2f: athrow
      // 30: checkcast java/lang/Boolean
      // 33: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 36: ifne 43
      // 39: aload 1
      // 3a: aload 0
      // 3b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 41: return
      // 42: athrow
      // 43: aload 0
      // 44: iload 2
      // 45: ifne 57
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // 4b: iflt af
      // 4e: goto 52
      // 51: athrow
      // 52: aload 0
      // 53: goto 57
      // 56: athrow
      // 57: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // 5a: iload 2
      // 5b: ifne 97
      // 5e: ldc_w -462442845
      // 61: ldc_w -918817077
      // 64: ldc_w 1480392331
      // 67: ixor
      // 68: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 6b: ldc2_w 7050441791445182372
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 71: if_icmpge af
      // 74: goto 78
      // 77: athrow
      // 78: aload 1
      // 79: aload 0
      // 7a: aload 0
      // 7b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaabaa (Lnet/minecraft/class_310;Ljava/lang/Object;I)V
      // 81: iload 2
      // 82: ifne ab
      // 85: goto 89
      // 88: athrow
      // 89: aload 1
      // 8a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 8d: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 90: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 93: goto 97
      // 96: athrow
      // 97: aload 0
      // 98: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // 9b: if_icmpeq bb
      // 9e: aload 1
      // 9f: aload 0
      // a0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // a3: bipush 1
      // a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbab (Lnet/minecraft/class_310;II)V
      // a7: goto ab
      // aa: athrow
      // ab: iload 2
      // ac: ifeq bb
      // af: aload 1
      // b0: aload 0
      // b1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // b7: goto bb
      // ba: athrow
      // bb: return
   }

   private int ababab(aaabbbab var1) {
      return Math.max(0, (int)Math.ceil(this.babbaa(var1) / 50.0));
   }

   private abbbaaaa ababba(
      class_310 var1, aaaaaabaa var2, class_3965 var3, float var4, float var5
   ) {
      return this.babba(var1, var2, var3, var4, var5, true);
   }

   private boolean ababbb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 017
      // 009: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 00c: ifnull 016
      // 00f: goto 013
      // 012: athrow
      // 013: bipush 0
      // 014: ireturn
      // 015: athrow
      // 016: aload 1
      // 017: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01a: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 01d: astore 3
      // 01e: aload 0
      // 01f: aload 3
      // 020: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabbb (Lnet/minecraft/class_1661;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb;
      // 023: astore 4
      // 025: aload 0
      // 026: aload 3
      // 027: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbbb (Lnet/minecraft/class_1661;)I
      // 02a: istore 5
      // 02c: aload 0
      // 02d: aload 3
      // 02e: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
      // 031: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbab (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 034: istore 6
      // 036: aload 0
      // 037: aload 1
      // 038: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabaa (Lnet/minecraft/class_310;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba;
      // 03b: astore 7
      // 03d: aload 4
      // 03f: ifnull 053
      // 042: aload 7
      // 044: iload 2
      // 045: ifne 065
      // 048: goto 04c
      // 04b: athrow
      // 04c: ifnonnull 056
      // 04f: goto 053
      // 052: athrow
      // 053: bipush 0
      // 054: ireturn
      // 055: athrow
      // 056: aload 0
      // 057: iload 2
      // 058: ifne 09c
      // 05b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 05e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 061: goto 065
      // 064: athrow
      // 065: checkcast java/lang/Boolean
      // 068: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 06b: ifne 092
      // 06e: iload 5
      // 070: iload 2
      // 071: ifne 091
      // 074: goto 078
      // 077: athrow
      // 078: iflt 090
      // 07b: goto 07f
      // 07e: athrow
      // 07f: iload 6
      // 081: iload 2
      // 082: ifne 091
      // 085: goto 089
      // 088: athrow
      // 089: ifge 092
      // 08c: goto 090
      // 08f: athrow
      // 090: bipush 0
      // 091: ireturn
      // 092: aload 0
      // 093: aload 4
      // 095: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb.b ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 098: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 09b: aload 0
      // 09c: aload 1
      // 09d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa (Lnet/minecraft/class_310;)Lnet/minecraft/class_2338;
      // 0a0: astore 8
      // 0a2: aload 8
      // 0a4: ifnull 0b7
      // 0a7: aload 0
      // 0a8: aload 1
      // 0a9: aload 7
      // 0ab: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba.b ()Lnet/minecraft/class_1799;
      // 0ae: aload 8
      // 0b0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbab (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 0b3: goto 0c1
      // 0b6: athrow
      // 0b7: aload 0
      // 0b8: aload 1
      // 0b9: aload 7
      // 0bb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba.b ()Lnet/minecraft/class_1799;
      // 0be: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 0c1: astore 9
      // 0c3: aload 9
      // 0c5: ifnull 0de
      // 0c8: aload 0
      // 0c9: iload 2
      // 0ca: ifne 0e8
      // 0cd: goto 0d1
      // 0d0: athrow
      // 0d1: aload 1
      // 0d2: aload 9
      // 0d4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;)Z
      // 0d7: ifne 0e1
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: bipush 0
      // 0df: ireturn
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0e5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0e8: checkcast java/lang/Boolean
      // 0eb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ee: istore 10
      // 0f0: iload 10
      // 0f2: iload 2
      // 0f3: ifne 10b
      // 0f6: ifeq 11a
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: aload 1
      // 0ff: aload 9
      // 101: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 104: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 107: goto 10b
      // 10a: athrow
      // 10b: iload 2
      // 10c: ifne 117
      // 10f: ifeq 11a
      // 112: goto 116
      // 115: athrow
      // 116: bipush 1
      // 117: goto 11b
      // 11a: bipush 0
      // 11b: istore 11
      // 11d: iload 10
      // 11f: iload 2
      // 120: ifne 13e
      // 123: ifeq 14d
      // 126: goto 12a
      // 129: athrow
      // 12a: aload 0
      // 12b: aload 1
      // 12c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 12f: aload 9
      // 131: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 134: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 137: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 13a: goto 13e
      // 13d: athrow
      // 13e: iload 2
      // 13f: ifne 14a
      // 142: ifeq 14d
      // 145: goto 149
      // 148: athrow
      // 149: bipush 1
      // 14a: goto 14e
      // 14d: bipush 0
      // 14e: istore 12
      // 150: iload 11
      // 152: iload 2
      // 153: ifne 194
      // 156: ifne 192
      // 159: goto 15d
      // 15c: athrow
      // 15d: iload 12
      // 15f: iload 2
      // 160: ifne 194
      // 163: goto 167
      // 166: athrow
      // 167: ifne 192
      // 16a: goto 16e
      // 16d: athrow
      // 16e: iload 5
      // 170: iload 2
      // 171: ifne 191
      // 174: goto 178
      // 177: athrow
      // 178: iflt 190
      // 17b: goto 17f
      // 17e: athrow
      // 17f: iload 6
      // 181: iload 2
      // 182: ifne 191
      // 185: goto 189
      // 188: athrow
      // 189: ifge 1ae
      // 18c: goto 190
      // 18f: athrow
      // 190: bipush 0
      // 191: ireturn
      // 192: iload 11
      // 194: iload 2
      // 195: ifne 1a1
      // 198: ifne 1ae
      // 19b: goto 19f
      // 19e: athrow
      // 19f: iload 6
      // 1a1: iload 2
      // 1a2: ifne 1ad
      // 1a5: ifge 1ae
      // 1a8: goto 1ac
      // 1ab: athrow
      // 1ac: bipush 0
      // 1ad: ireturn
      // 1ae: aload 0
      // 1af: aload 9
      // 1b1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.bb ()Lnet/minecraft/class_2338;
      // 1b4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 1b7: aload 0
      // 1b8: aload 9
      // 1ba: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.bb ()Lnet/minecraft/class_2338;
      // 1bd: ifnull 1c5
      // 1c0: bipush 1
      // 1c1: goto 1c6
      // 1c4: athrow
      // 1c5: bipush 0
      // 1c6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 1c9: aload 0
      // 1ca: aload 0
      // 1cb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 1ce: ifeq 1de
      // 1d1: aload 1
      // 1d2: aload 0
      // 1d3: aload 1
      // 1d4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaa (Lnet/minecraft/class_310;)I
      // 1d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababba (Lnet/minecraft/class_310;I)Lnet/minecraft/class_2680;
      // 1da: goto 1df
      // 1dd: athrow
      // 1de: aconst_null
      // 1df: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 1e2: aload 0
      // 1e3: iload 2
      // 1e4: ifne 206
      // 1e7: aload 1
      // 1e8: aload 9
      // 1ea: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;)V
      // 1ed: aload 0
      // 1ee: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 1f1: ifeq 205
      // 1f4: goto 1f8
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: aload 9
      // 1fb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.bb ()Lnet/minecraft/class_2338;
      // 1fe: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 201: goto 20e
      // 204: athrow
      // 205: aload 0
      // 206: aload 9
      // 208: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ab ()Lnet/minecraft/class_2338;
      // 20b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbbaa (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 20e: astore 13
      // 210: aload 1
      // 211: aload 13
      // 213: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 216: astore 14
      // 218: aload 1
      // 219: aload 0
      // 21a: aload 9
      // 21c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 21f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 222: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 225: astore 15
      // 227: aload 1
      // 228: aload 0
      // 229: aload 9
      // 22b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 22e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 231: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 234: astore 16
      // 236: aload 14
      // 238: iload 2
      // 239: ifne 245
      // 23c: ifnull 255
      // 23f: goto 243
      // 242: athrow
      // 243: aload 15
      // 245: iload 2
      // 246: ifne 252
      // 249: ifnull 255
      // 24c: goto 250
      // 24f: athrow
      // 250: aload 16
      // 252: ifnonnull 258
      // 255: bipush 0
      // 256: ireturn
      // 257: athrow
      // 258: aload 0
      // 259: aload 3
      // 25a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 25d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // 260: aload 0
      // 261: aload 4
      // 263: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb.a ()I
      // 266: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbbbb I
      // 269: aload 0
      // 26a: iload 5
      // 26c: iload 2
      // 26d: ifne 297
      // 270: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaab I
      // 273: aload 0
      // 274: iload 6
      // 276: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaab I
      // 279: aload 0
      // 27a: aload 0
      // 27b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 27e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 281: checkcast java/lang/Boolean
      // 284: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 287: ifeq 2ab
      // 28a: goto 28e
      // 28d: athrow
      // 28e: aload 0
      // 28f: aload 3
      // 290: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabaa (Lnet/minecraft/class_1661;)I
      // 293: goto 297
      // 296: athrow
      // 297: iload 2
      // 298: ifne 2a8
      // 29b: bipush 2
      // 29c: if_icmplt 2ab
      // 29f: goto 2a3
      // 2a2: athrow
      // 2a3: bipush 2
      // 2a4: goto 2a8
      // 2a7: athrow
      // 2a8: goto 2ac
      // 2ab: bipush 1
      // 2ac: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaa I
      // 2af: aload 0
      // 2b0: iload 11
      // 2b2: iload 2
      // 2b3: ifne 2cb
      // 2b6: ifeq 2ce
      // 2b9: goto 2bd
      // 2bc: athrow
      // 2bd: aload 0
      // 2be: aload 1
      // 2bf: aload 9
      // 2c1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 2c4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)I
      // 2c7: goto 2cb
      // 2ca: athrow
      // 2cb: goto 2cf
      // 2ce: bipush 0
      // 2cf: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab I
      // 2d2: aload 0
      // 2d3: aload 7
      // 2d5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba.a ()I
      // 2d8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa I
      // 2db: aload 0
      // 2dc: aload 7
      // 2de: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba.aa ()Lnet/minecraft/class_1268;
      // 2e1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babab Lnet/minecraft/class_1268;
      // 2e4: aload 0
      // 2e5: aload 9
      // 2e7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ab ()Lnet/minecraft/class_2338;
      // 2ea: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 2ed: aload 0
      // 2ee: aload 9
      // 2f0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 2f3: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 2f6: aload 0
      // 2f7: aload 14
      // 2f9: bipush 0
      // 2fa: faload
      // 2fb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baab F
      // 2fe: aload 0
      // 2ff: aload 14
      // 301: bipush 1
      // 302: faload
      // 303: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbb F
      // 306: aload 0
      // 307: aload 15
      // 309: bipush 0
      // 30a: faload
      // 30b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abab F
      // 30e: aload 0
      // 30f: aload 15
      // 311: bipush 1
      // 312: faload
      // 313: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aababb F
      // 316: aload 0
      // 317: aload 16
      // 319: bipush 0
      // 31a: faload
      // 31b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbb F
      // 31e: aload 0
      // 31f: aload 16
      // 321: bipush 1
      // 322: faload
      // 323: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaba F
      // 326: aload 0
      // 327: aload 9
      // 329: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.a ()F
      // 32c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaa F
      // 32f: aload 0
      // 330: aload 9
      // 332: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ba ()F
      // 335: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaa F
      // 338: iload 11
      // 33a: iload 2
      // 33b: ifne 391
      // 33e: ifeq 38b
      // 341: goto 345
      // 344: athrow
      // 345: aload 0
      // 346: iload 2
      // 347: ifne 373
      // 34a: goto 34e
      // 34d: athrow
      // 34e: aload 1
      // 34f: aload 9
      // 351: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ab ()Lnet/minecraft/class_2338;
      // 354: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 357: ifeq 36e
      // 35a: goto 35e
      // 35d: athrow
      // 35e: aload 0
      // 35f: aload 0
      // 360: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 363: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 366: iload 2
      // 367: ifeq 3ae
      // 36a: goto 36e
      // 36d: athrow
      // 36e: aload 0
      // 36f: goto 373
      // 372: athrow
      // 373: aload 0
      // 374: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 377: ifeq 381
      // 37a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 37d: goto 384
      // 380: athrow
      // 381: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 384: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 387: iload 2
      // 388: ifeq 3ae
      // 38b: iload 12
      // 38d: goto 391
      // 390: athrow
      // 391: ifeq 3a3
      // 394: aload 0
      // 395: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 398: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 39b: iload 2
      // 39c: ifeq 3ae
      // 39f: goto 3a3
      // 3a2: athrow
      // 3a3: aload 0
      // 3a4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 3a7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 3aa: goto 3ae
      // 3ad: athrow
      // 3ae: aload 0
      // 3af: invokestatic java/lang/System.currentTimeMillis ()J
      // 3b2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbba J
      // 3b5: aload 0
      // 3b6: aload 0
      // 3b7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbba J
      // 3ba: lconst_0
      // 3bb: aload 0
      // 3bc: aload 0
      // 3bd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 3c0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;)J
      // 3c3: ldc_w -462442846
      // 3c6: ldc_w 575990458
      // 3c9: ldc_w -251322448
      // 3cc: ixor
      // 3cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 3d0: ldc2_w 7894730656606348862
      // 3d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 3d6: lsub
      // 3d7: invokestatic java/lang/Math.max (JJ)J
      // 3da: ladd
      // 3db: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 3de: bipush 1
      // 3df: ireturn
   }

   static class_2338[] abbaaa(class_243 param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 0
      // 005: ifnull 070
      // 008: fload 1
      // 009: invokestatic java/lang/Float.isFinite (F)Z
      // 00c: iload 3
      // 00d: ifne 075
      // 010: goto 014
      // 013: athrow
      // 014: ifeq 070
      // 017: goto 01b
      // 01a: athrow
      // 01b: fload 2
      // 01c: invokestatic java/lang/Float.isFinite (F)Z
      // 01f: iload 3
      // 020: ifne 075
      // 023: goto 027
      // 026: athrow
      // 027: ifeq 070
      // 02a: goto 02e
      // 02d: athrow
      // 02e: aload 0
      // 02f: getfield net/minecraft/class_243.field_1352 D
      // 032: invokestatic java/lang/Double.isFinite (D)Z
      // 035: iload 3
      // 036: ifne 075
      // 039: goto 03d
      // 03c: athrow
      // 03d: ifeq 070
      // 040: goto 044
      // 043: athrow
      // 044: aload 0
      // 045: getfield net/minecraft/class_243.field_1351 D
      // 048: invokestatic java/lang/Double.isFinite (D)Z
      // 04b: iload 3
      // 04c: ifne 075
      // 04f: goto 053
      // 052: athrow
      // 053: ifeq 070
      // 056: goto 05a
      // 059: athrow
      // 05a: aload 0
      // 05b: getfield net/minecraft/class_243.field_1350 D
      // 05e: iload 3
      // 05f: ifne 082
      // 062: goto 066
      // 065: athrow
      // 066: invokestatic java/lang/Double.isFinite (D)Z
      // 069: ifne 079
      // 06c: goto 070
      // 06f: athrow
      // 070: bipush 0
      // 071: goto 075
      // 074: athrow
      // 075: anewarray 317
      // 078: areturn
      // 079: fload 1
      // 07a: f2d
      // 07b: invokestatic java/lang/Math.toRadians (D)D
      // 07e: invokestatic java/lang/Math.sin (D)D
      // 081: dneg
      // 082: dstore 4
      // 084: fload 1
      // 085: f2d
      // 086: invokestatic java/lang/Math.toRadians (D)D
      // 089: invokestatic java/lang/Math.cos (D)D
      // 08c: dstore 6
      // 08e: fload 2
      // 08f: f2d
      // 090: invokestatic java/lang/Math.toRadians (D)D
      // 093: invokestatic java/lang/Math.cos (D)D
      // 096: dstore 8
      // 098: fload 2
      // 099: f2d
      // 09a: invokestatic java/lang/Math.toRadians (D)D
      // 09d: invokestatic java/lang/Math.sin (D)D
      // 0a0: dstore 10
      // 0a2: new java/util/LinkedHashSet
      // 0a5: dup
      // 0a6: invokespecial java/util/LinkedHashSet.<init> ()V
      // 0a9: astore 12
      // 0ab: ldc2_w 4.5
      // 0ae: dstore 13
      // 0b0: dload 13
      // 0b2: ldc2_w 0.25
      // 0b5: dcmpl
      // 0b6: iflt 17a
      // 0b9: aload 0
      // 0ba: getfield net/minecraft/class_243.field_1352 D
      // 0bd: dload 4
      // 0bf: dload 13
      // 0c1: dmul
      // 0c2: dadd
      // 0c3: invokestatic net/minecraft/class_3532.method_15357 (D)I
      // 0c6: istore 15
      // 0c8: aload 0
      // 0c9: getfield net/minecraft/class_243.field_1350 D
      // 0cc: dload 6
      // 0ce: dload 13
      // 0d0: dmul
      // 0d1: dadd
      // 0d2: invokestatic net/minecraft/class_3532.method_15357 (D)I
      // 0d5: istore 16
      // 0d7: iload 15
      // 0d9: i2d
      // 0da: ldc2_w 0.5
      // 0dd: dadd
      // 0de: aload 0
      // 0df: getfield net/minecraft/class_243.field_1352 D
      // 0e2: dsub
      // 0e3: dload 4
      // 0e5: dmul
      // 0e6: iload 16
      // 0e8: i2d
      // 0e9: ldc2_w 0.5
      // 0ec: dadd
      // 0ed: aload 0
      // 0ee: getfield net/minecraft/class_243.field_1350 D
      // 0f1: dsub
      // 0f2: dload 6
      // 0f4: dmul
      // 0f5: dadd
      // 0f6: dstore 17
      // 0f8: dload 17
      // 0fa: iload 3
      // 0fb: ifne 117
      // 0fe: dconst_1
      // 0ff: dcmpg
      // 100: ifge 10b
      // 103: iload 3
      // 104: ifeq 16e
      // 107: goto 10b
      // 10a: athrow
      // 10b: aload 0
      // 10c: getfield net/minecraft/class_243.field_1351 D
      // 10f: ldc2_w 4.5
      // 112: dsub
      // 113: goto 117
      // 116: athrow
      // 117: invokestatic net/minecraft/class_3532.method_15357 (D)I
      // 11a: istore 19
      // 11c: iload 19
      // 11e: aload 0
      // 11f: getfield net/minecraft/class_243.field_1351 D
      // 122: invokestatic net/minecraft/class_3532.method_15357 (D)I
      // 125: if_icmpgt 16e
      // 128: new net/minecraft/class_2338
      // 12b: dup
      // 12c: iload 15
      // 12e: iload 19
      // 130: iload 16
      // 132: invokespecial net/minecraft/class_2338.<init> (III)V
      // 135: astore 20
      // 137: iload 3
      // 138: ifne 16a
      // 13b: aload 0
      // 13c: iload 3
      // 13d: ifne 0c9
      // 140: goto 144
      // 143: athrow
      // 144: aload 20
      // 146: invokestatic net/minecraft/class_243.method_24955 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 149: dconst_0
      // 14a: ldc2_w 0.125
      // 14d: dconst_0
      // 14e: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 151: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 154: ldc2_w 20.25
      // 157: dcmpg
      // 158: ifgt 167
      // 15b: aload 12
      // 15d: aload 20
      // 15f: invokevirtual java/util/LinkedHashSet.add (Ljava/lang/Object;)Z
      // 162: pop
      // 163: goto 167
      // 166: athrow
      // 167: iinc 19 1
      // 16a: iload 3
      // 16b: ifeq 11c
      // 16e: dload 13
      // 170: ldc2_w 0.25
      // 173: dsub
      // 174: dstore 13
      // 176: iload 3
      // 177: ifeq 0b0
      // 17a: aload 12
      // 17c: invokedynamic apply ()Ljava/util/function/IntFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaba (I)[Lnet/minecraft/class_2338;, (I)[Lnet/minecraft/class_2338; ]
      // 181: invokevirtual java/util/LinkedHashSet.toArray (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
      // 184: checkcast [Lnet/minecraft/class_2338;
      // 187: astore 13
      // 189: aload 13
      // 18b: aload 0
      // 18c: dload 4
      // 18e: dload 6
      // 190: dload 8
      // 192: dload 10
      // 194: invokedynamic compare (Lnet/minecraft/class_243;DDDD)Ljava/util/Comparator; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)I, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa (Lnet/minecraft/class_243;DDDDLnet/minecraft/class_2338;Lnet/minecraft/class_2338;)I, (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)I ]
      // 199: invokestatic java/util/Arrays.sort ([Ljava/lang/Object;Ljava/util/Comparator;)V
      // 19c: aload 13
      // 19e: areturn
   }

   @Override
   public void bbaa() {
      this.babbbb(class_310.method_1551());
   }

   private double abbaab(class_310 param1, class_243 param2, class_243 param3, class_2338 param4, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 7
      // 005: aload 1
      // 006: iload 7
      // 008: ifne 013
      // 00b: ifnull 02d
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 016: ifnull 02d
      // 019: aload 0
      // 01a: iload 7
      // 01c: ifne 032
      // 01f: goto 023
      // 022: athrow
      // 023: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 026: ifnonnull 03e
      // 029: goto 02d
      // 02c: athrow
      // 02d: aload 0
      // 02e: goto 032
      // 031: athrow
      // 032: aload 2
      // 033: aload 3
      // 034: aload 4
      // 036: dload 5
      // 038: dconst_0
      // 039: dconst_1
      // 03a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;DDD)D
      // 03d: dreturn
      // 03e: ldc2_w NaN
      // 041: dstore 8
      // 043: aload 0
      // 044: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 047: aload 1
      // 048: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 04b: aload 4
      // 04d: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 050: invokevirtual net/minecraft/class_265.method_1090 ()Ljava/util/List;
      // 053: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 058: astore 10
      // 05a: aload 10
      // 05c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 061: ifeq 11d
      // 064: aload 10
      // 066: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06b: checkcast net/minecraft/class_238
      // 06e: astore 11
      // 070: new net/minecraft/class_238
      // 073: dup
      // 074: aload 4
      // 076: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 079: i2d
      // 07a: aload 11
      // 07c: getfield net/minecraft/class_238.field_1323 D
      // 07f: dadd
      // 080: aload 4
      // 082: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 085: i2d
      // 086: aload 11
      // 088: getfield net/minecraft/class_238.field_1322 D
      // 08b: dadd
      // 08c: aload 4
      // 08e: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 091: i2d
      // 092: aload 11
      // 094: getfield net/minecraft/class_238.field_1321 D
      // 097: dadd
      // 098: aload 4
      // 09a: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 09d: i2d
      // 09e: aload 11
      // 0a0: getfield net/minecraft/class_238.field_1320 D
      // 0a3: dadd
      // 0a4: aload 4
      // 0a6: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 0a9: i2d
      // 0aa: aload 11
      // 0ac: getfield net/minecraft/class_238.field_1325 D
      // 0af: dadd
      // 0b0: aload 4
      // 0b2: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0b5: i2d
      // 0b6: aload 11
      // 0b8: getfield net/minecraft/class_238.field_1324 D
      // 0bb: dadd
      // 0bc: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
      // 0bf: dload 5
      // 0c1: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 0c4: astore 12
      // 0c6: aload 0
      // 0c7: aload 2
      // 0c8: aload 3
      // 0c9: aload 12
      // 0cb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_238;)D
      // 0ce: iload 7
      // 0d0: ifne 11f
      // 0d3: dstore 13
      // 0d5: dload 13
      // 0d7: iload 7
      // 0d9: ifne 0ec
      // 0dc: invokestatic java/lang/Double.isNaN (D)Z
      // 0df: ifne 118
      // 0e2: goto 0e6
      // 0e5: athrow
      // 0e6: dload 8
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: iload 7
      // 0ee: ifne 116
      // 0f1: invokestatic java/lang/Double.isNaN (D)Z
      // 0f4: ifne 110
      // 0f7: goto 0fb
      // 0fa: athrow
      // 0fb: dload 13
      // 0fd: iload 7
      // 0ff: ifne 116
      // 102: goto 106
      // 105: athrow
      // 106: dload 8
      // 108: dcmpg
      // 109: ifge 118
      // 10c: goto 110
      // 10f: athrow
      // 110: dload 13
      // 112: goto 116
      // 115: athrow
      // 116: dstore 8
      // 118: iload 7
      // 11a: ifeq 05a
      // 11d: dload 8
      // 11f: dreturn
   }

   private boolean abbaba(class_310 param1, int param2, class_3965 param3) {
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
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaa ()Z
      // 09: iload 4
      // 0b: ifne 55
      // 0e: ifne 46
      // 11: goto 15
      // 14: athrow
      // 15: aload 1
      // 16: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 19: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 1c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 1f: iload 4
      // 21: ifne 45
      // 24: goto 28
      // 27: athrow
      // 28: iload 2
      // 29: if_icmpeq 33
      // 2c: goto 30
      // 2f: athrow
      // 30: bipush 0
      // 31: ireturn
      // 32: athrow
      // 33: aload 0
      // 34: aload 1
      // 35: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb (Lnet/minecraft/class_310;)V
      // 38: aload 0
      // 39: aload 0
      // 3a: aload 1
      // 3b: iload 2
      // 3c: aload 3
      // 3d: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaababa (Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Z, ()Z ]
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbabb (Ljava/util/function/BooleanSupplier;)Z
      // 45: ireturn
      // 46: aload 1
      // 47: aload 0
      // 48: iload 2
      // 49: aload 0
      // 4a: aload 1
      // 4b: iload 2
      // 4c: aload 3
      // 4d: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabaa (Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Z, ()Z ]
      // 52: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbaa (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 55: ireturn
   }

   private class_3965 abbabb(class_2338 var1) {
      return new class_3965(this.bbbbbaa(var1), class_2350.field_11036, var1.method_10074(), false);
   }

   @Override
   public void aabaa() {
      this.ababaa(class_310.method_1551());
      this.abba = false;
      this.aaaaaa = false;
      this.aabba();
      this.abb();
      this.bbaba.aaaa();
   }

   private boolean abbbaa(class_310 param1) {
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
      // 09: ifnull 2a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 2a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 27: ifnonnull 2d
      // 2a: bipush 0
      // 2b: ireturn
      // 2c: athrow
      // 2d: aload 0
      // 2e: iload 2
      // 2f: ifne 61
      // 32: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babab Lnet/minecraft/class_1268;
      // 35: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 38: if_acmpne 60
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 0
      // 40: iload 2
      // 41: ifne 61
      // 44: goto 48
      // 47: athrow
      // 48: aload 1
      // 49: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 4f: aload 0
      // 50: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa I
      // 53: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbaa (Lnet/minecraft/class_1661;I)Z
      // 56: ifne 60
      // 59: goto 5d
      // 5c: athrow
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: athrow
      // 60: aload 0
      // 61: iload 2
      // 62: ifne 85
      // 65: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babab Lnet/minecraft/class_1268;
      // 68: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 6b: if_acmpne 84
      // 6e: goto 72
      // 71: athrow
      // 72: aload 0
      // 73: aload 1
      // 74: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb (Lnet/minecraft/class_310;)V
      // 77: aload 0
      // 78: aload 0
      // 79: aload 1
      // 7a: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babab (Lnet/minecraft/class_310;)Z, ()Z ]
      // 7f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbabb (Ljava/util/function/BooleanSupplier;)Z
      // 82: ireturn
      // 83: athrow
      // 84: aload 0
      // 85: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaa ()Z
      // 88: iload 2
      // 89: ifne d3
      // 8c: ifne c3
      // 8f: goto 93
      // 92: athrow
      // 93: aload 1
      // 94: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 97: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 9d: iload 2
      // 9e: ifne c2
      // a1: goto a5
      // a4: athrow
      // a5: aload 0
      // a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa I
      // a9: if_icmpeq b3
      // ac: goto b0
      // af: athrow
      // b0: bipush 0
      // b1: ireturn
      // b2: athrow
      // b3: aload 0
      // b4: aload 1
      // b5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb (Lnet/minecraft/class_310;)V
      // b8: aload 0
      // b9: aload 1
      // ba: invokedynamic getAsBoolean (Lnet/minecraft/class_310;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaabb (Lnet/minecraft/class_310;)Z, ()Z ]
      // bf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbabb (Ljava/util/function/BooleanSupplier;)Z
      // c2: ireturn
      // c3: aload 1
      // c4: aload 0
      // c5: aload 0
      // c6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa I
      // c9: aload 0
      // ca: aload 1
      // cb: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaab (Lnet/minecraft/class_310;)Z, ()Z ]
      // d0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbaa (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // d3: ireturn
   }

   private boolean baaaaa(class_310 var1, int var2, class_3965 var3) {
      return this.abbaba(var1, var2, var3);
   }

   private class_3965 baaaab(class_2338 var1) {
      try {
         if (var1 == null) {
            return null;
         }
      } catch (RuntimeException var2) {
         throw var2;
      }

      return new class_3965(this.babaab(var1), class_2350.field_11036, var1, false);
   }

   private boolean baaaba(class_310 param1, class_2338 param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 13
      // 0b: ifnull 21
      // 0e: goto 12
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 16: ifnull 21
      // 19: aload 2
      // 1a: ifnonnull 24
      // 1d: goto 21
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: athrow
      // 24: aload 1
      // 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 28: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 2b: astore 5
      // 2d: aload 2
      // 2e: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 31: i2d
      // 32: ldc2_w 0.5
      // 35: dadd
      // 36: aload 5
      // 38: getfield net/minecraft/class_243.field_1352 D
      // 3b: dsub
      // 3c: dstore 6
      // 3e: aload 2
      // 3f: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 42: i2d
      // 43: ldc2_w 0.5
      // 46: dadd
      // 47: aload 5
      // 49: getfield net/minecraft/class_243.field_1350 D
      // 4c: dsub
      // 4d: dstore 8
      // 4f: dload 6
      // 51: dload 6
      // 53: dmul
      // 54: dload 8
      // 56: dload 8
      // 58: dmul
      // 59: dadd
      // 5a: dstore 10
      // 5c: dload 10
      // 5e: iload 4
      // 60: ifne 7c
      // 63: ldc2_w 0.25
      // 66: dcmpg
      // 67: ifge 71
      // 6a: goto 6e
      // 6d: athrow
      // 6e: bipush 0
      // 6f: ireturn
      // 70: athrow
      // 71: dload 6
      // 73: dneg
      // 74: dload 8
      // 76: invokestatic java/lang/Math.atan2 (DD)D
      // 79: invokestatic java/lang/Math.toDegrees (D)D
      // 7c: d2f
      // 7d: fstore 12
      // 7f: fload 12
      // 81: aload 1
      // 82: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 85: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 88: fsub
      // 89: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 8c: invokestatic java/lang/Math.abs (F)F
      // 8f: fstore 13
      // 91: fload 13
      // 93: fload 3
      // 94: fcmpg
      // 95: iload 4
      // 97: ifne a2
      // 9a: ifgt a5
      // 9d: goto a1
      // a0: athrow
      // a1: bipush 1
      // a2: goto a6
      // a5: bipush 0
      // a6: ireturn
   }

   private boolean baaabb() {
      try {
         if (this.aaaa.abbb() == ababab.ab) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      return false;
   }

   private aabaabbba baabaa(class_310 param1) {
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
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 23
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aconst_null
      // 20: areturn
      // 21: athrow
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 26: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 29: astore 3
      // 2a: aload 3
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 2e: istore 4
      // 30: aload 1
      // 31: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 34: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
      // 37: astore 5
      // 39: aload 0
      // 3a: aload 5
      // 3c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaab (Lnet/minecraft/class_1799;)Z
      // 3f: ifeq 52
      // 42: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba
      // 45: dup
      // 46: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 49: iload 4
      // 4b: aload 5
      // 4d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba.<init> (Lnet/minecraft/class_1268;ILnet/minecraft/class_1799;)V
      // 50: areturn
      // 51: athrow
      // 52: aload 1
      // 53: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 56: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 59: astore 6
      // 5b: aload 0
      // 5c: aload 6
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaab (Lnet/minecraft/class_1799;)Z
      // 61: iload 2
      // 62: ifne 7c
      // 65: ifeq 7b
      // 68: goto 6c
      // 6b: athrow
      // 6c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba
      // 6f: dup
      // 70: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 73: bipush -1
      // 74: aload 6
      // 76: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba.<init> (Lnet/minecraft/class_1268;ILnet/minecraft/class_1799;)V
      // 79: areturn
      // 7a: athrow
      // 7b: bipush 0
      // 7c: istore 7
      // 7e: iload 7
      // 80: ldc_w -462442843
      // 83: ldc_w -902437082
      // 86: ldc_w 437927397
      // 89: ixor
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 8d: ldc2_w 7050441791445182372
      // 90: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 93: if_icmpge c6
      // 96: aload 3
      // 97: iload 7
      // 99: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 9c: astore 8
      // 9e: iload 2
      // 9f: ifne c2
      // a2: aload 0
      // a3: aload 8
      // a5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaab (Lnet/minecraft/class_1799;)Z
      // a8: ifeq bf
      // ab: goto af
      // ae: athrow
      // af: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba
      // b2: dup
      // b3: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // b6: iload 7
      // b8: aload 8
      // ba: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba.<init> (Lnet/minecraft/class_1268;ILnet/minecraft/class_1799;)V
      // bd: areturn
      // be: athrow
      // bf: iinc 7 1
      // c2: iload 2
      // c3: ifeq 7e
      // c6: aconst_null
      // c7: areturn
   }

   private static class_2338[] baabab(int var0) {
      return new class_2338[var0];
   }

   private abbbaaaa baabba(
      class_310 param1, aaaaaabaa param2, class_2338 param3, class_2338 param4, float param5, float param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 7
      // 005: aload 1
      // 006: iload 7
      // 008: ifne 013
      // 00b: ifnull 053
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: iload 7
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 053
      // 01e: goto 022
      // 021: athrow
      // 022: aload 1
      // 023: goto 027
      // 026: athrow
      // 027: iload 7
      // 029: ifne 04a
      // 02c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 02f: ifnull 053
      // 032: goto 036
      // 035: athrow
      // 036: aload 0
      // 037: iload 7
      // 039: ifne 057
      // 03c: goto 040
      // 03f: athrow
      // 040: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 043: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 046: goto 04a
      // 049: athrow
      // 04a: checkcast java/lang/Boolean
      // 04d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 050: ifne 056
      // 053: aconst_null
      // 054: areturn
      // 055: athrow
      // 056: aload 0
      // 057: aload 1
      // 058: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaa (Lnet/minecraft/class_310;)I
      // 05b: istore 8
      // 05d: iload 8
      // 05f: ifge 065
      // 062: aconst_null
      // 063: areturn
      // 064: athrow
      // 065: aload 1
      // 066: iload 8
      // 068: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababba (Lnet/minecraft/class_310;I)Lnet/minecraft/class_2680;
      // 06b: astore 9
      // 06d: aload 9
      // 06f: iload 7
      // 071: ifne 07d
      // 074: ifnull 083
      // 077: goto 07b
      // 07a: athrow
      // 07b: aload 9
      // 07d: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 080: ifeq 086
      // 083: aconst_null
      // 084: areturn
      // 085: athrow
      // 086: aload 0
      // 087: aload 4
      // 089: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabb (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 08c: astore 10
      // 08e: aload 1
      // 08f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 092: aload 10
      // 094: ldc_w 11.5
      // 097: aconst_null
      // 098: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.bbb (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;FLnet/minecraft/class_2338;)F
      // 09b: fstore 11
      // 09d: aload 1
      // 09e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a1: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 0a4: astore 12
      // 0a6: aload 3
      // 0a7: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0aa: i2d
      // 0ab: ldc2_w 0.5
      // 0ae: dadd
      // 0af: aload 1
      // 0b0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0b3: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 0b6: dsub
      // 0b7: dstore 13
      // 0b9: aload 3
      // 0ba: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0bd: i2d
      // 0be: ldc2_w 0.5
      // 0c1: dadd
      // 0c2: aload 1
      // 0c3: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c6: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 0c9: dsub
      // 0ca: dstore 15
      // 0cc: aload 3
      // 0cd: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0d0: aload 12
      // 0d2: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0d5: isub
      // 0d6: invokestatic java/lang/Math.abs (I)I
      // 0d9: aload 3
      // 0da: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0dd: aload 12
      // 0df: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0e2: isub
      // 0e3: invokestatic java/lang/Math.abs (I)I
      // 0e6: invokestatic java/lang/Math.max (II)I
      // 0e9: istore 17
      // 0eb: aconst_null
      // 0ec: astore 18
      // 0ee: iload 17
      // 0f0: bipush 1
      // 0f1: isub
      // 0f2: istore 19
      // 0f4: iload 19
      // 0f6: bipush 1
      // 0f7: if_icmplt 243
      // 0fa: iload 19
      // 0fc: i2d
      // 0fd: iload 17
      // 0ff: i2d
      // 100: ddiv
      // 101: dstore 20
      // 103: iload 7
      // 105: aload 1
      // 106: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 109: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 10c: dload 13
      // 10e: dload 20
      // 110: dmul
      // 111: dadd
      // 112: aload 12
      // 114: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 117: i2d
      // 118: aload 1
      // 119: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 11c: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 11f: dload 15
      // 121: dload 20
      // 123: dmul
      // 124: dadd
      // 125: invokestatic net/minecraft/class_2338.method_49637 (DDD)Lnet/minecraft/class_2338;
      // 128: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 12b: astore 22
      // 12d: ifne 14b
      // 130: aload 22
      // 132: aload 18
      // 134: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 137: ifeq 147
      // 13a: goto 13e
      // 13d: athrow
      // 13e: iload 7
      // 140: ifeq 23b
      // 143: goto 147
      // 146: athrow
      // 147: aload 22
      // 149: astore 18
      // 14b: aload 0
      // 14c: aload 1
      // 14d: aload 22
      // 14f: aload 3
      // 150: aload 4
      // 152: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaababb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa;
      // 155: ifnonnull 161
      // 158: iload 7
      // 15a: ifeq 23b
      // 15d: goto 161
      // 160: athrow
      // 161: aload 1
      // 162: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 165: aload 10
      // 167: ldc_w 11.5
      // 16a: aload 22
      // 16c: aload 9
      // 16e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.abaa (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;FLnet/minecraft/class_2338;Lnet/minecraft/class_2680;)F
      // 171: fstore 23
      // 173: iload 7
      // 175: ifne 1a5
      // 178: fload 23
      // 17a: fload 11
      // 17c: ldc 0.5
      // 17e: fsub
      // 17f: fcmpl
      // 180: ifle 190
      // 183: goto 187
      // 186: athrow
      // 187: iload 7
      // 189: ifeq 23b
      // 18c: goto 190
      // 18f: athrow
      // 190: aload 0
      // 191: aload 22
      // 193: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 196: aload 0
      // 197: aload 9
      // 199: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 19c: aload 0
      // 19d: bipush 1
      // 19e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababab Z
      // 1a1: goto 1a5
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: aload 1
      // 1a7: aload 2
      // 1a8: aload 3
      // 1a9: aload 4
      // 1ab: fload 5
      // 1ad: fload 6
      // 1af: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabbb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)[F
      // 1b2: astore 24
      // 1b4: iload 7
      // 1b6: ifne 1f3
      // 1b9: aload 24
      // 1bb: ifnull 1e4
      // 1be: goto 1c2
      // 1c1: athrow
      // 1c2: aload 0
      // 1c3: iload 7
      // 1c5: ifne 1ef
      // 1c8: goto 1cc
      // 1cb: athrow
      // 1cc: aload 1
      // 1cd: aload 2
      // 1ce: aload 24
      // 1d0: bipush 0
      // 1d1: faload
      // 1d2: aload 24
      // 1d4: bipush 1
      // 1d5: faload
      // 1d6: aload 22
      // 1d8: aload 4
      // 1da: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;FFLnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Z
      // 1dd: ifeq 1f8
      // 1e0: goto 1e4
      // 1e3: athrow
      // 1e4: aload 0
      // 1e5: aconst_null
      // 1e6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 1e9: aload 0
      // 1ea: aconst_null
      // 1eb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 1ee: aload 0
      // 1ef: bipush 0
      // 1f0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababab Z
      // 1f3: iload 7
      // 1f5: ifeq 23b
      // 1f8: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa
      // 1fb: dup
      // 1fc: aload 3
      // 1fd: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 200: aload 4
      // 202: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 205: aload 24
      // 207: bipush 0
      // 208: faload
      // 209: aload 24
      // 20b: bipush 1
      // 20c: faload
      // 20d: aconst_null
      // 20e: aload 22
      // 210: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FFLnet/minecraft/class_2338;Lnet/minecraft/class_2338;)V
      // 213: astore 25
      // 215: aload 0
      // 216: aconst_null
      // 217: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 21a: aload 0
      // 21b: aconst_null
      // 21c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 21f: aload 0
      // 220: bipush 0
      // 221: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababab Z
      // 224: aload 25
      // 226: areturn
      // 227: astore 26
      // 229: aload 0
      // 22a: aconst_null
      // 22b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 22e: aload 0
      // 22f: aconst_null
      // 230: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 233: aload 0
      // 234: bipush 0
      // 235: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababab Z
      // 238: aload 26
      // 23a: athrow
      // 23b: iinc 19 -1
      // 23e: iload 7
      // 240: ifeq 0f4
      // 243: aconst_null
      // 244: areturn
   }

   private float[] baabbb(class_310 param1, aaaaaabaa param2, class_2338 param3, class_2338 param4, float param5, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 7
      // 005: aload 1
      // 006: iload 7
      // 008: ifne 013
      // 00b: ifnull 037
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 016: ifnull 037
      // 019: aload 2
      // 01a: ifnull 037
      // 01d: goto 021
      // 020: athrow
      // 021: aload 3
      // 022: iload 7
      // 024: ifne 034
      // 027: goto 02b
      // 02a: athrow
      // 02b: ifnull 037
      // 02e: goto 032
      // 031: athrow
      // 032: aload 4
      // 034: ifnonnull 03a
      // 037: aconst_null
      // 038: areturn
      // 039: athrow
      // 03a: aload 0
      // 03b: aload 4
      // 03d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabb (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 040: astore 8
      // 042: aload 1
      // 043: aload 8
      // 045: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 048: astore 9
      // 04a: aload 9
      // 04c: iload 7
      // 04e: ifne 05d
      // 051: ifnonnull 05b
      // 054: goto 058
      // 057: athrow
      // 058: aconst_null
      // 059: areturn
      // 05a: athrow
      // 05b: aload 9
      // 05d: bipush 0
      // 05e: faload
      // 05f: fstore 10
      // 061: aload 9
      // 063: bipush 1
      // 064: faload
      // 065: fstore 11
      // 067: aload 0
      // 068: aload 1
      // 069: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaba (Lnet/minecraft/class_310;)Lnet/minecraft/class_243;
      // 06c: aload 3
      // 06d: aload 4
      // 06f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bab (Lnet/minecraft/class_243;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)[D
      // 072: astore 12
      // 074: aload 12
      // 076: ifnonnull 07c
      // 079: aconst_null
      // 07a: areturn
      // 07b: athrow
      // 07c: bipush 5
      // 07d: newarray 6
      // 07f: dup
      // 080: bipush 0
      // 081: fload 5
      // 083: fastore
      // 084: dup
      // 085: bipush 1
      // 086: fload 10
      // 088: fastore
      // 089: dup
      // 08a: bipush 2
      // 08b: fload 10
      // 08d: f2d
      // 08e: aload 12
      // 090: bipush 0
      // 091: daload
      // 092: aload 12
      // 094: bipush 1
      // 095: daload
      // 096: dadd
      // 097: ldc2_w 0.5
      // 09a: dmul
      // 09b: dadd
      // 09c: d2f
      // 09d: fastore
      // 09e: dup
      // 09f: bipush 3
      // 0a0: fload 10
      // 0a2: f2d
      // 0a3: aload 12
      // 0a5: bipush 0
      // 0a6: daload
      // 0a7: dadd
      // 0a8: aload 12
      // 0aa: bipush 1
      // 0ab: daload
      // 0ac: aload 12
      // 0ae: bipush 0
      // 0af: daload
      // 0b0: dsub
      // 0b1: ldc2_w 0.25
      // 0b4: dmul
      // 0b5: dadd
      // 0b6: d2f
      // 0b7: fastore
      // 0b8: dup
      // 0b9: bipush 4
      // 0ba: fload 10
      // 0bc: f2d
      // 0bd: aload 12
      // 0bf: bipush 1
      // 0c0: daload
      // 0c1: dadd
      // 0c2: aload 12
      // 0c4: bipush 1
      // 0c5: daload
      // 0c6: aload 12
      // 0c8: bipush 0
      // 0c9: daload
      // 0ca: dsub
      // 0cb: ldc2_w 0.25
      // 0ce: dmul
      // 0cf: dsub
      // 0d0: d2f
      // 0d1: fastore
      // 0d2: astore 13
      // 0d4: ldc_w -462442844
      // 0d7: ldc_w 210391135
      // 0da: ldc_w 654908779
      // 0dd: ixor
      // 0de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 0e1: ldc2_w 5291072960463100451
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 0e7: newarray 6
      // 0e9: dup
      // 0ea: bipush 0
      // 0eb: fload 6
      // 0ed: fastore
      // 0ee: dup
      // 0ef: bipush 1
      // 0f0: fload 11
      // 0f2: fastore
      // 0f3: dup
      // 0f4: bipush 2
      // 0f5: fload 11
      // 0f7: fconst_1
      // 0f8: fadd
      // 0f9: fastore
      // 0fa: dup
      // 0fb: bipush 3
      // 0fc: fload 11
      // 0fe: fconst_2
      // 0ff: fadd
      // 100: fastore
      // 101: dup
      // 102: bipush 4
      // 103: fload 11
      // 105: fconst_1
      // 106: fsub
      // 107: fastore
      // 108: dup
      // 109: bipush 5
      // 10a: fload 11
      // 10c: fconst_2
      // 10d: fsub
      // 10e: fastore
      // 10f: dup
      // 110: ldc_w -462442841
      // 113: ldc_w 210391135
      // 116: ldc_w 588231290
      // 119: ixor
      // 11a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 11d: ldc2_w 5135398763581933685
      // 120: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 123: fload 11
      // 125: ldc_w 3.5
      // 128: fadd
      // 129: fastore
      // 12a: dup
      // 12b: ldc_w -462442842
      // 12e: ldc_w 210391135
      // 131: ldc_w 2048369581
      // 134: ixor
      // 135: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 138: ldc2_w 273401800826370127
      // 13b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 13e: fload 11
      // 140: ldc_w 3.5
      // 143: fsub
      // 144: fastore
      // 145: astore 14
      // 147: aconst_null
      // 148: astore 15
      // 14a: ldc2_w Infinity
      // 14d: dstore 16
      // 14f: aload 0
      // 150: aload 1
      // 151: aload 2
      // 152: aload 3
      // 153: aload 4
      // 155: fload 5
      // 157: fload 6
      // 159: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)D
      // 15c: dstore 18
      // 15e: dload 18
      // 160: invokestatic java/lang/Double.isNaN (D)Z
      // 163: iload 7
      // 165: ifne 170
      // 168: ifne 17d
      // 16b: goto 16f
      // 16e: athrow
      // 16f: bipush 2
      // 170: newarray 6
      // 172: dup
      // 173: bipush 0
      // 174: fload 5
      // 176: fastore
      // 177: dup
      // 178: bipush 1
      // 179: fload 6
      // 17b: fastore
      // 17c: areturn
      // 17d: aload 13
      // 17f: astore 20
      // 181: aload 20
      // 183: arraylength
      // 184: istore 21
      // 186: bipush 0
      // 187: istore 22
      // 189: iload 22
      // 18b: iload 21
      // 18d: if_icmpge 217
      // 190: aload 20
      // 192: iload 22
      // 194: faload
      // 195: fstore 23
      // 197: aload 14
      // 199: astore 24
      // 19b: aload 24
      // 19d: iload 7
      // 19f: ifne 219
      // 1a2: arraylength
      // 1a3: istore 25
      // 1a5: bipush 0
      // 1a6: istore 26
      // 1a8: iload 26
      // 1aa: iload 25
      // 1ac: if_icmpge 20f
      // 1af: aload 24
      // 1b1: iload 26
      // 1b3: faload
      // 1b4: fstore 27
      // 1b6: aload 0
      // 1b7: iload 7
      // 1b9: ifne 229
      // 1bc: aload 1
      // 1bd: aload 2
      // 1be: aload 3
      // 1bf: aload 4
      // 1c1: fload 23
      // 1c3: fload 27
      // 1c5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)D
      // 1c8: dstore 28
      // 1ca: iload 7
      // 1cc: ifne 20a
      // 1cf: dload 28
      // 1d1: invokestatic java/lang/Double.isNaN (D)Z
      // 1d4: ifne 207
      // 1d7: goto 1db
      // 1da: athrow
      // 1db: dload 28
      // 1dd: iload 7
      // 1df: ifne 1f6
      // 1e2: goto 1e6
      // 1e5: athrow
      // 1e6: dload 16
      // 1e8: dcmpg
      // 1e9: ifge 207
      // 1ec: goto 1f0
      // 1ef: athrow
      // 1f0: dload 28
      // 1f2: goto 1f6
      // 1f5: athrow
      // 1f6: dstore 16
      // 1f8: bipush 2
      // 1f9: newarray 6
      // 1fb: dup
      // 1fc: bipush 0
      // 1fd: fload 23
      // 1ff: fastore
      // 200: dup
      // 201: bipush 1
      // 202: fload 27
      // 204: fastore
      // 205: astore 15
      // 207: iinc 26 1
      // 20a: iload 7
      // 20c: ifeq 1a8
      // 20f: iinc 22 1
      // 212: iload 7
      // 214: ifeq 189
      // 217: aload 15
      // 219: iload 7
      // 21b: ifne 227
      // 21e: ifnull 228
      // 221: goto 225
      // 224: athrow
      // 225: aload 15
      // 227: areturn
      // 228: aload 0
      // 229: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 22c: ifnull 234
      // 22f: bipush 1
      // 230: goto 235
      // 233: athrow
      // 234: bipush 0
      // 235: istore 20
      // 237: iload 20
      // 239: aload 3
      // 23a: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 23d: iload 7
      // 23f: ifne 253
      // 242: aload 4
      // 244: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 247: if_icmpeq 256
      // 24a: goto 24e
      // 24d: athrow
      // 24e: bipush 1
      // 24f: goto 253
      // 252: athrow
      // 253: goto 257
      // 256: bipush 0
      // 257: ior
      // 258: istore 20
      // 25a: ldc2_w 32.0
      // 25d: iload 20
      // 25f: ifeq 269
      // 262: ldc2_w 6.0
      // 265: goto 26c
      // 268: athrow
      // 269: ldc2_w 4.0
      // 26c: aload 12
      // 26e: bipush 0
      // 26f: daload
      // 270: invokestatic java/lang/Math.abs (D)D
      // 273: aload 12
      // 275: bipush 1
      // 276: daload
      // 277: invokestatic java/lang/Math.abs (D)D
      // 27a: invokestatic java/lang/Math.max (DD)D
      // 27d: invokestatic java/lang/Math.max (DD)D
      // 280: invokestatic java/lang/Math.min (DD)D
      // 283: dstore 21
      // 285: iload 20
      // 287: ifeq 291
      // 28a: ldc2_w 32.0
      // 28d: goto 294
      // 290: athrow
      // 291: ldc2_w 10.0
      // 294: dstore 23
      // 296: iload 20
      // 298: ifeq 2a2
      // 29b: ldc2_w 1.5
      // 29e: goto 2a3
      // 2a1: athrow
      // 2a2: dconst_1
      // 2a3: dstore 25
      // 2a5: dload 21
      // 2a7: dneg
      // 2a8: aload 12
      // 2aa: bipush 0
      // 2ab: daload
      // 2ac: invokestatic java/lang/Math.max (DD)D
      // 2af: dstore 27
      // 2b1: dload 21
      // 2b3: aload 12
      // 2b5: bipush 1
      // 2b6: daload
      // 2b7: invokestatic java/lang/Math.min (DD)D
      // 2ba: dstore 29
      // 2bc: dload 27
      // 2be: dstore 31
      // 2c0: dload 31
      // 2c2: dload 29
      // 2c4: ldc2_w 0.001
      // 2c7: dadd
      // 2c8: dcmpg
      // 2c9: ifgt 359
      // 2cc: iload 7
      // 2ce: ifne 408
      // 2d1: dload 23
      // 2d3: dneg
      // 2d4: dstore 33
      // 2d6: dload 33
      // 2d8: dload 23
      // 2da: ldc2_w 0.001
      // 2dd: dadd
      // 2de: dcmpg
      // 2df: ifgt 34d
      // 2e2: fload 10
      // 2e4: f2d
      // 2e5: iload 7
      // 2e7: ifne 352
      // 2ea: dload 31
      // 2ec: dadd
      // 2ed: d2f
      // 2ee: fstore 35
      // 2f0: iload 7
      // 2f2: fload 11
      // 2f4: f2d
      // 2f5: dload 33
      // 2f7: dadd
      // 2f8: d2f
      // 2f9: fstore 36
      // 2fb: aload 0
      // 2fc: aload 1
      // 2fd: aload 2
      // 2fe: aload 3
      // 2ff: aload 4
      // 301: fload 35
      // 303: fload 36
      // 305: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)D
      // 308: dstore 37
      // 30a: ifne 348
      // 30d: dload 37
      // 30f: invokestatic java/lang/Double.isNaN (D)Z
      // 312: ifne 341
      // 315: goto 319
      // 318: athrow
      // 319: dload 37
      // 31b: iload 7
      // 31d: ifne 346
      // 320: goto 324
      // 323: athrow
      // 324: dload 16
      // 326: dcmpg
      // 327: ifge 341
      // 32a: goto 32e
      // 32d: athrow
      // 32e: dload 37
      // 330: dstore 16
      // 332: bipush 2
      // 333: newarray 6
      // 335: dup
      // 336: bipush 0
      // 337: fload 35
      // 339: fastore
      // 33a: dup
      // 33b: bipush 1
      // 33c: fload 36
      // 33e: fastore
      // 33f: astore 15
      // 341: dload 33
      // 343: dload 25
      // 345: dadd
      // 346: dstore 33
      // 348: iload 7
      // 34a: ifeq 2d6
      // 34d: dload 31
      // 34f: dload 25
      // 351: dadd
      // 352: dstore 31
      // 354: iload 7
      // 356: ifeq 2c0
      // 359: aload 15
      // 35b: iload 7
      // 35d: ifne 40a
      // 360: ifnull 408
      // 363: goto 367
      // 366: athrow
      // 367: aload 15
      // 369: bipush 0
      // 36a: faload
      // 36b: fstore 31
      // 36d: aload 15
      // 36f: bipush 1
      // 370: faload
      // 371: fstore 32
      // 373: ldc2_w -1.0
      // 376: dstore 33
      // 378: dload 33
      // 37a: ldc2_w 1.001
      // 37d: dcmpg
      // 37e: ifgt 408
      // 381: ldc2_w -1.0
      // 384: dstore 35
      // 386: dload 35
      // 388: ldc2_w 1.001
      // 38b: dcmpg
      // 38c: ifgt 3fb
      // 38f: fload 31
      // 391: f2d
      // 392: dload 33
      // 394: dadd
      // 395: d2f
      // 396: fstore 37
      // 398: fload 32
      // 39a: f2d
      // 39b: dload 35
      // 39d: dadd
      // 39e: iload 7
      // 3a0: ifne 401
      // 3a3: d2f
      // 3a4: fstore 38
      // 3a6: iload 7
      // 3a8: aload 0
      // 3a9: aload 1
      // 3aa: aload 2
      // 3ab: aload 3
      // 3ac: aload 4
      // 3ae: fload 37
      // 3b0: fload 38
      // 3b2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)D
      // 3b5: dstore 39
      // 3b7: ifne 3f6
      // 3ba: dload 39
      // 3bc: invokestatic java/lang/Double.isNaN (D)Z
      // 3bf: ifne 3ee
      // 3c2: goto 3c6
      // 3c5: athrow
      // 3c6: dload 39
      // 3c8: iload 7
      // 3ca: ifne 3f4
      // 3cd: goto 3d1
      // 3d0: athrow
      // 3d1: dload 16
      // 3d3: dcmpg
      // 3d4: ifge 3ee
      // 3d7: goto 3db
      // 3da: athrow
      // 3db: dload 39
      // 3dd: dstore 16
      // 3df: bipush 2
      // 3e0: newarray 6
      // 3e2: dup
      // 3e3: bipush 0
      // 3e4: fload 37
      // 3e6: fastore
      // 3e7: dup
      // 3e8: bipush 1
      // 3e9: fload 38
      // 3eb: fastore
      // 3ec: astore 15
      // 3ee: dload 35
      // 3f0: ldc2_w 0.25
      // 3f3: dadd
      // 3f4: dstore 35
      // 3f6: iload 7
      // 3f8: ifeq 386
      // 3fb: dload 33
      // 3fd: ldc2_w 0.25
      // 400: dadd
      // 401: dstore 33
      // 403: iload 7
      // 405: ifeq 378
      // 408: aload 15
      // 40a: areturn
   }

   private boolean babaaa(class_1799 param1) {
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
      // 06: ifne 19
      // 09: ifnull 7b
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: goto 19
      // 18: athrow
      // 19: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 1c: ifne 7b
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getstatic net/minecraft/class_1802.field_8129 Lnet/minecraft/class_1792;
      // 27: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 2a: iload 2
      // 2b: ifne 78
      // 2e: ifne 77
      // 31: goto 35
      // 34: athrow
      // 35: aload 1
      // 36: getstatic net/minecraft/class_1802.field_8848 Lnet/minecraft/class_1792;
      // 39: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 3c: iload 2
      // 3d: ifne 78
      // 40: goto 44
      // 43: athrow
      // 44: ifne 77
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 1
      // 4c: getstatic net/minecraft/class_1802.field_8211 Lnet/minecraft/class_1792;
      // 4f: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 52: iload 2
      // 53: ifne 78
      // 56: goto 5a
      // 59: athrow
      // 5a: ifne 77
      // 5d: goto 61
      // 60: athrow
      // 61: aload 1
      // 62: getstatic net/minecraft/class_1802.field_8655 Lnet/minecraft/class_1792;
      // 65: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 68: iload 2
      // 69: ifne 78
      // 6c: goto 70
      // 6f: athrow
      // 70: ifeq 7b
      // 73: goto 77
      // 76: athrow
      // 77: bipush 1
      // 78: goto 7c
      // 7b: bipush 0
      // 7c: ireturn
   }

   private class_243 babaab(class_2338 var1) {
      return class_243.method_24955(var1).method_1031(0.0, 0.125, 0.0);
   }

   private class_3965 bababa(class_2338 var1) {
      return this.aaabaaa(class_310.method_1551(), var1.method_10084());
   }

   static boolean bababb(class_2338 param0, class_2338 param1) {
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
      // 06: ifne 11
      // 09: ifnull 1c
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 20
      // 15: ifnonnull 1f
      // 18: goto 1c
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: athrow
      // 1f: aload 0
      // 20: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 23: aload 1
      // 24: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 27: isub
      // 28: invokestatic java/lang/Math.abs (I)I
      // 2b: istore 3
      // 2c: aload 0
      // 2d: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 30: aload 1
      // 31: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 34: isub
      // 35: invokestatic java/lang/Math.abs (I)I
      // 38: istore 4
      // 3a: iload 3
      // 3b: iload 4
      // 3d: iload 2
      // 3e: ifne 5f
      // 41: invokestatic java/lang/Math.max (II)I
      // 44: bipush 1
      // 45: if_icmplt 82
      // 48: goto 4c
      // 4b: athrow
      // 4c: iload 3
      // 4d: iload 4
      // 4f: iload 2
      // 50: ifne 7b
      // 53: goto 57
      // 56: athrow
      // 57: invokestatic java/lang/Math.max (II)I
      // 5a: bipush 2
      // 5b: goto 5f
      // 5e: athrow
      // 5f: if_icmpgt 82
      // 62: aload 0
      // 63: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 66: aload 1
      // 67: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 6a: isub
      // 6b: iload 2
      // 6c: ifne 7f
      // 6f: goto 73
      // 72: athrow
      // 73: invokestatic java/lang/Math.abs (I)I
      // 76: bipush 2
      // 77: goto 7b
      // 7a: athrow
      // 7b: if_icmpgt 82
      // 7e: bipush 1
      // 7f: goto 83
      // 82: bipush 0
      // 83: ireturn
   }

   private long babbaa(aaabbbab var1) {
      double var2 = var1.bab();
      double var4 = var1.abb();

      try {
         if (var2 >= var4) {
            return Math.max(0L, Math.round(var2));
         }
      } catch (RuntimeException var6) {
         throw var6;
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private abbbaaaa babbab(class_310 var1, class_1799 var2, class_2338 var3) {
      aaaaaabaa var5 = this.aaaa(var2);
      double var6 = var3.method_10263() + 0.5 - var1.field_1724.method_23317();
      double var8 = var3.method_10260() + 0.5 - var1.field_1724.method_23321();
      class_2350 var10 = baab(var6, var8);
      int var10000 = baaabbaa.bba;
      float var11 = var1.field_1724.method_36454();
      int var4 = var10000;
      float var12 = var1.field_1724.method_36455();
      this.aabb = true;

      try {
         abbbaaaa var13 = null;
         class_2338[] var14 = this.ababbab(var3, var10);
         int var15 = var14.length;
         int var16 = 0;

         while (true) {
            if (var16 < var15) {
               class_2338 var17 = var14[var16];

               label171: {
                  try {
                     if (var4 != 0) {
                        break label171;
                     }

                     var38 = this.bbabba(var1, var5, var17, var3, var11, var12, false);
                     if (var4 != 0) {
                        break;
                     }
                  } catch (RuntimeException var28) {
                     throw var28;
                  }

                  var13 = var38;
                  if (var13 != null) {
                     return var13;
                  }

                  var16++;
               }

               if (var4 == 0) {
                  continue;
               }
            }

            var38 = this.aaaabbb(this::abaaba);
            break;
         }

         abbbaaaa var31 = var38;

         label193: {
            try {
               if (var4 != 0) {
                  return var31;
               }

               if (var31 == null) {
                  break label193;
               }
            } catch (RuntimeException var27) {
               throw var27;
            }

            return var31;
         }

         class_2338[] var32 = this.ababbab(var3, var10);
         var16 = var32.length;
         int var36 = 0;

         while (var36 < var16) {
            class_2338 var37 = var32[var36];
            var10000 = var4;
            abbbaaaa var19 = this.bbabba(var1, var5, var37, var3, var11, var12, true);

            label121: {
               try {
                  if (var10000 != 0) {
                     break label121;
                  }

                  if (var19 != null) {
                     return var19;
                  }
               } catch (RuntimeException var26) {
                  throw var26;
               }

               var36++;
            }

            if (var4 != 0) {
               break;
            }
         }

         return null;
      } finally {
         this.aabb = false;
      }
   }

   private double babbba(class_243 param1, class_243 param2, class_238 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: getfield net/minecraft/class_243.field_1352 D
      // 04: aload 1
      // 05: getfield net/minecraft/class_243.field_1352 D
      // 08: dsub
      // 09: dstore 5
      // 0b: aload 2
      // 0c: getfield net/minecraft/class_243.field_1351 D
      // 0f: aload 1
      // 10: getfield net/minecraft/class_243.field_1351 D
      // 13: dsub
      // 14: dstore 7
      // 16: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 19: aload 2
      // 1a: getfield net/minecraft/class_243.field_1350 D
      // 1d: aload 1
      // 1e: getfield net/minecraft/class_243.field_1350 D
      // 21: dsub
      // 22: dstore 9
      // 24: dconst_0
      // 25: dstore 11
      // 27: istore 4
      // 29: dconst_1
      // 2a: dstore 13
      // 2c: iload 4
      // 2e: aload 0
      // 2f: aload 1
      // 30: getfield net/minecraft/class_243.field_1352 D
      // 33: dload 5
      // 35: aload 3
      // 36: getfield net/minecraft/class_238.field_1323 D
      // 39: aload 3
      // 3a: getfield net/minecraft/class_238.field_1320 D
      // 3d: dload 11
      // 3f: dload 13
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaaa (DDDDDD)[D
      // 44: astore 15
      // 46: ifne 80
      // 49: aload 15
      // 4b: ifnonnull 57
      // 4e: goto 52
      // 51: athrow
      // 52: ldc2_w NaN
      // 55: dreturn
      // 56: athrow
      // 57: aload 15
      // 59: bipush 0
      // 5a: daload
      // 5b: dstore 11
      // 5d: aload 15
      // 5f: bipush 1
      // 60: daload
      // 61: dstore 13
      // 63: aload 0
      // 64: aload 1
      // 65: iload 4
      // 67: ifne 9d
      // 6a: getfield net/minecraft/class_243.field_1351 D
      // 6d: dload 7
      // 6f: aload 3
      // 70: getfield net/minecraft/class_238.field_1322 D
      // 73: aload 3
      // 74: getfield net/minecraft/class_238.field_1325 D
      // 77: dload 11
      // 79: dload 13
      // 7b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaaa (DDDDDD)[D
      // 7e: astore 15
      // 80: aload 15
      // 82: ifnonnull 8a
      // 85: ldc2_w NaN
      // 88: dreturn
      // 89: athrow
      // 8a: aload 15
      // 8c: bipush 0
      // 8d: iload 4
      // 8f: ifne c2
      // 92: daload
      // 93: dstore 11
      // 95: aload 15
      // 97: bipush 1
      // 98: daload
      // 99: dstore 13
      // 9b: aload 0
      // 9c: aload 1
      // 9d: getfield net/minecraft/class_243.field_1350 D
      // a0: dload 9
      // a2: aload 3
      // a3: getfield net/minecraft/class_238.field_1321 D
      // a6: aload 3
      // a7: getfield net/minecraft/class_238.field_1324 D
      // aa: dload 11
      // ac: dload 13
      // ae: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaaa (DDDDDD)[D
      // b1: astore 15
      // b3: aload 15
      // b5: ifnonnull bf
      // b8: ldc2_w NaN
      // bb: goto c3
      // be: athrow
      // bf: aload 15
      // c1: bipush 0
      // c2: daload
      // c3: dreturn
   }

   private void babbbb(class_310 param1) {
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
      // 06: ifne 24
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaaa Lnet/minecraft/class_2338;
      // 0c: ifnonnull 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: iload 2
      // 17: ifne 86
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 20: goto 24
      // 23: athrow
      // 24: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababaa;
      // 27: if_acmpne 81
      // 2a: aload 0
      // 2b: iload 2
      // 2c: ifne 86
      // 2f: goto 33
      // 32: athrow
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbaab ()Z
      // 36: ifeq 81
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 0
      // 3e: iload 2
      // 3f: ifne 86
      // 42: goto 46
      // 45: athrow
      // 46: aload 1
      // 47: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbba (Lnet/minecraft/class_310;)Z
      // 4a: ifeq 81
      // 4d: goto 51
      // 50: athrow
      // 51: aload 0
      // 52: iload 2
      // 53: ifne 86
      // 56: goto 5a
      // 59: athrow
      // 5a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 5d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 60: if_acmpne 81
      // 63: goto 67
      // 66: athrow
      // 67: aload 1
      // 68: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 6b: getfield net/minecraft/class_746.field_6012 I
      // 6e: iload 2
      // 6f: ifne a1
      // 72: goto 76
      // 75: athrow
      // 76: aload 0
      // 77: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabb I
      // 7a: if_icmple 8a
      // 7d: goto 81
      // 80: athrow
      // 81: aload 0
      // 82: goto 86
      // 85: athrow
      // 86: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba ()V
      // 89: return
      // 8a: aload 0
      // 8b: iload 2
      // 8c: ifne a6
      // 8f: aload 1
      // 90: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 93: aload 0
      // 94: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaaa Lnet/minecraft/class_2338;
      // 97: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 9a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 9d: goto a1
      // a0: athrow
      // a1: ifne a5
      // a4: return
      // a5: aload 0
      // a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaaa Lnet/minecraft/class_2338;
      // a9: astore 3
      // aa: aload 0
      // ab: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababa I
      // ae: istore 4
      // b0: aload 0
      // b1: aconst_null
      // b2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaaa Lnet/minecraft/class_2338;
      // b5: aload 0
      // b6: ldc_w -462442791
      // b9: ldc_w -193577751
      // bc: ldc_w 849634722
      // bf: ixor
      // c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // c3: ldc2_w 5579952000272572156
      // c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // c9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabb I
      // cc: aload 0
      // cd: bipush -1
      // ce: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababa I
      // d1: aload 0
      // d2: bipush 1
      // d3: iload 2
      // d4: ifne ef
      // d7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abba Z
      // da: aload 0
      // db: aload 1
      // dc: aload 3
      // dd: iload 4
      // df: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;I)Z
      // e2: ifne f2
      // e5: goto e9
      // e8: athrow
      // e9: aload 0
      // ea: bipush 0
      // eb: goto ef
      // ee: athrow
      // ef: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abba Z
      // f2: return
   }

   private boolean bbaaaa(
      class_310 var1, abbbabaaa var2, abbbabaaa var3, BooleanSupplier var4
   ) {
      return this.aaba(var1, var2, var3, var4);
   }

   @Override
   public void abbbab(JsonObject var1) {
      super.abbbab(var1);
      this.babbbaa(var1, abbbaa.abab());
      this.bbabaaa(var1, aababa.abab(), new aaabbbab[]{this.aabaaa});
      this.bbabaaa(
         var1,
         aabbaaaba.abba(abbaaaa(a(-462442792, 278997486 ^ 506332641), a(-462442789, 278997486 ^ 1659789806))),
         new aaabbbab[]{this.aabaaa}
      );
   }

   private abbbaaaa bbaaab(class_310 param1, aaaaaabaa param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 1
      // 05: fload 3
      // 06: fload 4
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabab (Lnet/minecraft/class_310;FF)Lnet/minecraft/class_3965;
      // 0b: astore 6
      // 0d: istore 5
      // 0f: aload 6
      // 11: iload 5
      // 13: ifne 30
      // 16: ifnonnull 20
      // 19: goto 1d
      // 1c: athrow
      // 1d: aconst_null
      // 1e: areturn
      // 1f: athrow
      // 20: aload 0
      // 21: iload 5
      // 23: ifne 48
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 2c: goto 30
      // 2f: athrow
      // 30: checkcast java/lang/Boolean
      // 33: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 36: ifne 47
      // 39: aload 0
      // 3a: aload 1
      // 3b: aload 2
      // 3c: aload 6
      // 3e: fload 3
      // 3f: fload 4
      // 41: bipush 1
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_3965;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 45: areturn
      // 46: athrow
      // 47: aload 0
      // 48: aload 1
      // 49: aload 2
      // 4a: aload 6
      // 4c: fload 3
      // 4d: fload 4
      // 4f: bipush 0
      // 50: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_3965;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 53: astore 7
      // 55: aload 7
      // 57: iload 5
      // 59: ifne 78
      // 5c: ifnull 67
      // 5f: goto 63
      // 62: athrow
      // 63: aload 7
      // 65: areturn
      // 66: athrow
      // 67: aload 0
      // 68: aload 0
      // 69: aload 1
      // 6a: aload 2
      // 6b: aload 6
      // 6d: fload 3
      // 6e: fload 4
      // 70: invokedynamic get (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_3965;FF)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_3965;FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;, ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa; ]
      // 75: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabbb (Ljava/util/function/Supplier;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 78: astore 8
      // 7a: aload 8
      // 7c: iload 5
      // 7e: ifne 98
      // 81: ifnull 8c
      // 84: goto 88
      // 87: athrow
      // 88: aload 8
      // 8a: areturn
      // 8b: athrow
      // 8c: aload 0
      // 8d: aload 1
      // 8e: aload 2
      // 8f: aload 6
      // 91: fload 3
      // 92: fload 4
      // 94: bipush 1
      // 95: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_3965;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 98: areturn
   }

   private boolean bbaaba(class_310 var1, aaaaaabaa var2, class_2338 var3, class_2338 var4, float var5, float var6) {
      int var7 = baaabbaa.bba;

      try {
         boolean var10000 = Double.isNaN(this.aabaaaa(var1, var2, var3, var4, var5, var6));
         if (var7 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (RuntimeException var8) {
         throw var8;
      }

      return false;
   }

   private int bbabaa(class_1661 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: bipush 0
      // 04: istore 3
      // 05: istore 2
      // 06: bipush 0
      // 07: istore 4
      // 09: iload 4
      // 0b: ldc_w -462442982
      // 0e: ldc_w -1818582060
      // 11: ldc_w 492034694
      // 14: ixor
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 18: ldc2_w 7050441791445182372
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 1e: if_icmpge 53
      // 21: aload 1
      // 22: iload 4
      // 24: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 27: astore 5
      // 29: iload 2
      // 2a: ifne 4f
      // 2d: aload 5
      // 2f: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
      // 32: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 35: iload 2
      // 36: ifne 54
      // 39: goto 3d
      // 3c: athrow
      // 3d: ifeq 4c
      // 40: goto 44
      // 43: athrow
      // 44: iload 3
      // 45: aload 5
      // 47: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 4a: iadd
      // 4b: istore 3
      // 4c: iinc 4 1
      // 4f: iload 2
      // 50: ifeq 09
      // 53: iload 3
      // 54: ireturn
   }

   private class_243 bbabab(float var1, float var2) {
      double var3 = Math.toRadians(var1);
      double var5 = Math.toRadians(var2);
      double var7 = Math.cos(var5);
      return new class_243(-Math.sin(var3) * var7, -Math.sin(var5), Math.cos(var3) * var7).method_1029();
   }

   private abbbaaaa bbabba(
      class_310 param1, aaaaaabaa param2, class_2338 param3, class_2338 param4, float param5, float param6, boolean param7
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 8
      // 005: aload 3
      // 006: aload 4
      // 008: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bababb (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Z
      // 00b: iload 8
      // 00d: ifne 02b
      // 010: ifeq 05c
      // 013: goto 017
      // 016: athrow
      // 017: aload 0
      // 018: iload 8
      // 01a: ifne 02f
      // 01d: goto 021
      // 020: athrow
      // 021: aload 1
      // 022: aload 4
      // 024: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 027: goto 02b
      // 02a: athrow
      // 02b: ifeq 05c
      // 02e: aload 0
      // 02f: iload 8
      // 031: ifne 04a
      // 034: aload 1
      // 035: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaba (Lnet/minecraft/class_310;)Lnet/minecraft/class_243;
      // 038: aload 3
      // 039: aload 4
      // 03b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bab (Lnet/minecraft/class_243;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)[D
      // 03e: ifnull 05c
      // 041: goto 045
      // 044: athrow
      // 045: aload 0
      // 046: goto 04a
      // 049: athrow
      // 04a: iload 8
      // 04c: ifne 060
      // 04f: aload 1
      // 050: aload 4
      // 052: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 055: ifne 05f
      // 058: goto 05c
      // 05b: athrow
      // 05c: aconst_null
      // 05d: areturn
      // 05e: athrow
      // 05f: aload 0
      // 060: aload 1
      // 061: aload 2
      // 062: aload 3
      // 063: aload 4
      // 065: fload 5
      // 067: fload 6
      // 069: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 06c: astore 9
      // 06e: aload 9
      // 070: iload 8
      // 072: ifne 07e
      // 075: ifnull 07f
      // 078: goto 07c
      // 07b: athrow
      // 07c: aload 9
      // 07e: areturn
      // 07f: iload 7
      // 081: iload 8
      // 083: ifne 0a2
      // 086: ifeq 0a5
      // 089: goto 08d
      // 08c: athrow
      // 08d: aload 0
      // 08e: iload 8
      // 090: ifne 0a9
      // 093: goto 097
      // 096: athrow
      // 097: aload 1
      // 098: aload 3
      // 099: aload 4
      // 09b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababaab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Z
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: ifne 0a8
      // 0a5: aconst_null
      // 0a6: areturn
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: aload 1
      // 0aa: aload 2
      // 0ab: aload 3
      // 0ac: aload 4
      // 0ae: fload 5
      // 0b0: fload 6
      // 0b2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 0b5: astore 10
      // 0b7: aload 10
      // 0b9: iload 8
      // 0bb: ifne 0c7
      // 0be: ifnull 0c8
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: aload 10
      // 0c7: areturn
      // 0c8: aload 0
      // 0c9: iload 8
      // 0cb: ifne 0dc
      // 0ce: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbb Z
      // 0d1: ifeq 0db
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: aconst_null
      // 0d9: areturn
      // 0da: athrow
      // 0db: aload 0
      // 0dc: aload 1
      // 0dd: aload 2
      // 0de: aload 3
      // 0df: aload 4
      // 0e1: fload 5
      // 0e3: fload 6
      // 0e5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabbb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)[F
      // 0e8: astore 11
      // 0ea: aload 11
      // 0ec: ifnonnull 0f2
      // 0ef: aconst_null
      // 0f0: areturn
      // 0f1: athrow
      // 0f2: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa
      // 0f5: dup
      // 0f6: aload 3
      // 0f7: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 0fa: aload 4
      // 0fc: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 0ff: aload 11
      // 101: bipush 0
      // 102: faload
      // 103: aload 11
      // 105: bipush 1
      // 106: faload
      // 107: aconst_null
      // 108: aconst_null
      // 109: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FFLnet/minecraft/class_2338;Lnet/minecraft/class_2338;)V
      // 10c: areturn
   }

   private boolean bbabbb(class_310 var1) {
      return this.bb(var1);
   }

   private abbbaaaa bbbaaa(
      class_310 param1, aaaaaabaa param2, class_2338 param3, class_2338 param4, float param5, float param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 7
      // 005: aload 1
      // 006: iload 7
      // 008: ifne 013
      // 00b: ifnull 053
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: iload 7
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 053
      // 01e: goto 022
      // 021: athrow
      // 022: aload 1
      // 023: goto 027
      // 026: athrow
      // 027: iload 7
      // 029: ifne 04a
      // 02c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 02f: ifnull 053
      // 032: goto 036
      // 035: athrow
      // 036: aload 0
      // 037: iload 7
      // 039: ifne 057
      // 03c: goto 040
      // 03f: athrow
      // 040: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 043: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 046: goto 04a
      // 049: athrow
      // 04a: checkcast java/lang/Boolean
      // 04d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 050: ifne 056
      // 053: aconst_null
      // 054: areturn
      // 055: athrow
      // 056: aload 0
      // 057: aload 1
      // 058: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaa (Lnet/minecraft/class_310;)I
      // 05b: istore 8
      // 05d: iload 8
      // 05f: ifge 065
      // 062: aconst_null
      // 063: areturn
      // 064: athrow
      // 065: aload 1
      // 066: iload 8
      // 068: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababba (Lnet/minecraft/class_310;I)Lnet/minecraft/class_2680;
      // 06b: astore 9
      // 06d: aload 9
      // 06f: iload 7
      // 071: ifne 07d
      // 074: ifnull 083
      // 077: goto 07b
      // 07a: athrow
      // 07b: aload 9
      // 07d: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 080: ifeq 086
      // 083: aconst_null
      // 084: areturn
      // 085: athrow
      // 086: aload 3
      // 087: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 08a: astore 10
      // 08c: aload 10
      // 08e: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 091: astore 11
      // 093: aload 0
      // 094: aload 1
      // 095: aload 10
      // 097: iload 7
      // 099: ifne 0ae
      // 09c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 09f: ifeq 0bd
      // 0a2: goto 0a6
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: aload 1
      // 0a8: aload 11
      // 0aa: goto 0ae
      // 0ad: athrow
      // 0ae: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0b1: iload 7
      // 0b3: ifne 0ce
      // 0b6: ifne 0c0
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: aconst_null
      // 0be: areturn
      // 0bf: athrow
      // 0c0: aload 9
      // 0c2: aload 1
      // 0c3: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0c6: aload 10
      // 0c8: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 0cb: invokevirtual net/minecraft/class_2680.method_26206 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
      // 0ce: iload 7
      // 0d0: ifne 108
      // 0d3: ifne 0f2
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: aload 9
      // 0dc: invokevirtual net/minecraft/class_2680.method_50011 ()Z
      // 0df: iload 7
      // 0e1: ifne 108
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: ifne 0f2
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: aconst_null
      // 0f0: areturn
      // 0f1: athrow
      // 0f2: aload 1
      // 0f3: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0f6: aconst_null
      // 0f7: new net/minecraft/class_238
      // 0fa: dup
      // 0fb: aload 10
      // 0fd: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 100: invokevirtual net/minecraft/class_638.method_8335 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/util/List;
      // 103: invokeinterface java/util/List.isEmpty ()Z 1
      // 108: iload 7
      // 10a: ifne 12b
      // 10d: ifeq 12e
      // 110: goto 114
      // 113: athrow
      // 114: new net/minecraft/class_238
      // 117: dup
      // 118: aload 10
      // 11a: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 11d: aload 1
      // 11e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 121: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
      // 124: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
      // 127: goto 12b
      // 12a: athrow
      // 12b: ifeq 131
      // 12e: aconst_null
      // 12f: areturn
      // 130: athrow
      // 131: aload 0
      // 132: aload 1
      // 133: aload 4
      // 135: aload 11
      // 137: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa;
      // 13a: ifnonnull 140
      // 13d: aconst_null
      // 13e: areturn
      // 13f: athrow
      // 140: aload 1
      // 141: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 144: aload 0
      // 145: aload 4
      // 147: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabb (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 14a: ldc_w 11.5
      // 14d: aconst_null
      // 14e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.bbb (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;FLnet/minecraft/class_2338;)F
      // 151: fstore 12
      // 153: iload 7
      // 155: aload 1
      // 156: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 159: aload 0
      // 15a: aload 4
      // 15c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabb (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 15f: ldc_w 11.5
      // 162: aload 10
      // 164: aload 9
      // 166: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaa.abaa (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;FLnet/minecraft/class_2338;Lnet/minecraft/class_2680;)F
      // 169: fstore 13
      // 16b: ifne 18d
      // 16e: fload 13
      // 170: fload 12
      // 172: ldc_w 0.001
      // 175: fadd
      // 176: fcmpl
      // 177: ifle 181
      // 17a: goto 17e
      // 17d: athrow
      // 17e: aconst_null
      // 17f: areturn
      // 180: athrow
      // 181: aload 0
      // 182: aload 10
      // 184: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 187: aload 0
      // 188: aload 9
      // 18a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 18d: aload 0
      // 18e: aload 1
      // 18f: aload 2
      // 190: aload 11
      // 192: aload 4
      // 194: fload 5
      // 196: fload 6
      // 198: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabbb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)[F
      // 19b: astore 14
      // 19d: aload 14
      // 19f: ifnonnull 1b2
      // 1a2: aconst_null
      // 1a3: astore 15
      // 1a5: aload 0
      // 1a6: aconst_null
      // 1a7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 1aa: aload 0
      // 1ab: aconst_null
      // 1ac: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 1af: aload 15
      // 1b1: areturn
      // 1b2: aload 0
      // 1b3: aload 1
      // 1b4: aload 2
      // 1b5: aload 14
      // 1b7: bipush 0
      // 1b8: faload
      // 1b9: aload 14
      // 1bb: bipush 1
      // 1bc: faload
      // 1bd: aload 10
      // 1bf: aload 4
      // 1c1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;FFLnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Z
      // 1c4: ifeq 1d7
      // 1c7: aconst_null
      // 1c8: astore 15
      // 1ca: aload 0
      // 1cb: aconst_null
      // 1cc: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 1cf: aload 0
      // 1d0: aconst_null
      // 1d1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 1d4: aload 15
      // 1d6: areturn
      // 1d7: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa
      // 1da: dup
      // 1db: aload 11
      // 1dd: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 1e0: aload 4
      // 1e2: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 1e5: aload 14
      // 1e7: bipush 0
      // 1e8: faload
      // 1e9: aload 14
      // 1eb: bipush 1
      // 1ec: faload
      // 1ed: aload 10
      // 1ef: aconst_null
      // 1f0: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FFLnet/minecraft/class_2338;Lnet/minecraft/class_2338;)V
      // 1f3: astore 15
      // 1f5: aload 0
      // 1f6: aconst_null
      // 1f7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 1fa: aload 0
      // 1fb: aconst_null
      // 1fc: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 1ff: aload 15
      // 201: areturn
      // 202: astore 16
      // 204: aload 0
      // 205: aconst_null
      // 206: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 209: aload 0
      // 20a: aconst_null
      // 20b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 20e: aload 16
      // 210: athrow
   }

   private boolean bbbaba(class_310 param1, class_2338 param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 4
      // 005: aload 1
      // 006: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 009: ifnonnull 046
      // 00c: aload 2
      // 00d: ifnull 046
      // 010: goto 014
      // 013: athrow
      // 014: aload 0
      // 015: aload 1
      // 016: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 019: aload 2
      // 01a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 01d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 020: iload 4
      // 022: ifne 047
      // 025: goto 029
      // 028: athrow
      // 029: ifeq 046
      // 02c: goto 030
      // 02f: athrow
      // 030: aload 0
      // 031: aload 1
      // 032: aload 2
      // 033: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 036: iload 4
      // 038: ifne 047
      // 03b: goto 03f
      // 03e: athrow
      // 03f: ifne 048
      // 042: goto 046
      // 045: athrow
      // 046: bipush 0
      // 047: ireturn
      // 048: aload 1
      // 049: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 04f: astore 5
      // 051: aload 0
      // 052: aload 5
      // 054: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabbb (Lnet/minecraft/class_1661;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb;
      // 057: astore 6
      // 059: aload 0
      // 05a: aload 5
      // 05c: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
      // 05f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbab (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 062: istore 7
      // 064: aload 0
      // 065: aload 1
      // 066: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabaa (Lnet/minecraft/class_310;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba;
      // 069: astore 8
      // 06b: aload 6
      // 06d: ifnull 08b
      // 070: iload 7
      // 072: iload 4
      // 074: ifne 090
      // 077: goto 07b
      // 07a: athrow
      // 07b: iflt 08b
      // 07e: goto 082
      // 081: athrow
      // 082: aload 8
      // 084: ifnonnull 091
      // 087: goto 08b
      // 08a: athrow
      // 08b: bipush 0
      // 08c: goto 090
      // 08f: athrow
      // 090: ireturn
      // 091: aload 0
      // 092: aload 6
      // 094: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb.b ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 097: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 09a: iload 4
      // 09c: aload 0
      // 09d: aload 1
      // 09e: aload 8
      // 0a0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba.b ()Lnet/minecraft/class_1799;
      // 0a3: aload 2
      // 0a4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbab (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 0a7: astore 9
      // 0a9: ifne 0c1
      // 0ac: aload 9
      // 0ae: ifnonnull 0b8
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: bipush 0
      // 0b6: ireturn
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: aload 9
      // 0bb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.bb ()Lnet/minecraft/class_2338;
      // 0be: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 0c1: aload 0
      // 0c2: aload 9
      // 0c4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.bb ()Lnet/minecraft/class_2338;
      // 0c7: ifnull 0cf
      // 0ca: bipush 1
      // 0cb: goto 0d0
      // 0ce: athrow
      // 0cf: bipush 0
      // 0d0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 0d3: aload 0
      // 0d4: aload 0
      // 0d5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 0d8: ifeq 0e8
      // 0db: aload 1
      // 0dc: aload 0
      // 0dd: aload 1
      // 0de: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaa (Lnet/minecraft/class_310;)I
      // 0e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababba (Lnet/minecraft/class_310;I)Lnet/minecraft/class_2680;
      // 0e4: goto 0e9
      // 0e7: athrow
      // 0e8: aconst_null
      // 0e9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 0ec: aload 0
      // 0ed: iload 4
      // 0ef: ifne 111
      // 0f2: aload 1
      // 0f3: aload 9
      // 0f5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;)V
      // 0f8: aload 0
      // 0f9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 0fc: ifeq 110
      // 0ff: goto 103
      // 102: athrow
      // 103: aload 0
      // 104: aload 9
      // 106: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.bb ()Lnet/minecraft/class_2338;
      // 109: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 10c: goto 119
      // 10f: athrow
      // 110: aload 0
      // 111: aload 9
      // 113: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ab ()Lnet/minecraft/class_2338;
      // 116: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbbaa (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 119: astore 10
      // 11b: aload 1
      // 11c: aload 10
      // 11e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 121: astore 11
      // 123: aload 1
      // 124: aload 0
      // 125: aload 9
      // 127: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 12a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 12d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 130: astore 12
      // 132: aload 11
      // 134: iload 4
      // 136: ifne 142
      // 139: ifnull 145
      // 13c: goto 140
      // 13f: athrow
      // 140: aload 12
      // 142: ifnonnull 148
      // 145: bipush 0
      // 146: ireturn
      // 147: athrow
      // 148: aload 0
      // 149: aload 1
      // 14a: aload 9
      // 14c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 14f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 152: istore 13
      // 154: aload 0
      // 155: iload 3
      // 156: iload 4
      // 158: ifne 163
      // 15b: iflt 18a
      // 15e: goto 162
      // 161: athrow
      // 162: iload 3
      // 163: iload 4
      // 165: ifne 187
      // 168: ldc_w -462442979
      // 16b: ldc_w 1239072428
      // 16e: ldc_w 783947703
      // 171: ixor
      // 172: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 175: ldc2_w 7050441791445182372
      // 178: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 17b: if_icmpge 18a
      // 17e: goto 182
      // 181: athrow
      // 182: iload 3
      // 183: goto 187
      // 186: athrow
      // 187: goto 18f
      // 18a: aload 5
      // 18c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 18f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // 192: aload 0
      // 193: aload 6
      // 195: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb.a ()I
      // 198: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbbbb I
      // 19b: aload 0
      // 19c: bipush -1
      // 19d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaab I
      // 1a0: aload 0
      // 1a1: iload 7
      // 1a3: iload 4
      // 1a5: ifne 1ca
      // 1a8: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaab I
      // 1ab: aload 0
      // 1ac: aload 0
      // 1ad: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 1b0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 1b3: checkcast java/lang/Boolean
      // 1b6: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1b9: ifeq 1df
      // 1bc: goto 1c0
      // 1bf: athrow
      // 1c0: aload 0
      // 1c1: aload 5
      // 1c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabaa (Lnet/minecraft/class_1661;)I
      // 1c6: goto 1ca
      // 1c9: athrow
      // 1ca: iload 4
      // 1cc: ifne 1dc
      // 1cf: bipush 2
      // 1d0: if_icmplt 1df
      // 1d3: goto 1d7
      // 1d6: athrow
      // 1d7: bipush 2
      // 1d8: goto 1dc
      // 1db: athrow
      // 1dc: goto 1e0
      // 1df: bipush 1
      // 1e0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaa I
      // 1e3: aload 0
      // 1e4: iload 13
      // 1e6: iload 4
      // 1e8: ifne 200
      // 1eb: ifeq 203
      // 1ee: goto 1f2
      // 1f1: athrow
      // 1f2: aload 0
      // 1f3: aload 1
      // 1f4: aload 9
      // 1f6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 1f9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)I
      // 1fc: goto 200
      // 1ff: athrow
      // 200: goto 204
      // 203: bipush 0
      // 204: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab I
      // 207: aload 0
      // 208: aload 8
      // 20a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba.a ()I
      // 20d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa I
      // 210: aload 0
      // 211: aload 8
      // 213: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabbba.aa ()Lnet/minecraft/class_1268;
      // 216: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babab Lnet/minecraft/class_1268;
      // 219: aload 0
      // 21a: aload 9
      // 21c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ab ()Lnet/minecraft/class_2338;
      // 21f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 222: aload 0
      // 223: aload 9
      // 225: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aaa ()Lnet/minecraft/class_2338;
      // 228: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 22b: aload 0
      // 22c: aload 11
      // 22e: bipush 0
      // 22f: faload
      // 230: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baab F
      // 233: aload 0
      // 234: aload 11
      // 236: bipush 1
      // 237: faload
      // 238: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbb F
      // 23b: aload 0
      // 23c: iload 4
      // 23e: ifne 2c3
      // 241: fconst_0
      // 242: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abab F
      // 245: aload 0
      // 246: fconst_0
      // 247: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aababb F
      // 24a: aload 0
      // 24b: aload 12
      // 24d: bipush 0
      // 24e: faload
      // 24f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbb F
      // 252: aload 0
      // 253: aload 12
      // 255: bipush 1
      // 256: faload
      // 257: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaba F
      // 25a: aload 0
      // 25b: aload 9
      // 25d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.a ()F
      // 260: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaa F
      // 263: aload 0
      // 264: aload 9
      // 266: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ba ()F
      // 269: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaa F
      // 26c: iload 13
      // 26e: ifeq 2be
      // 271: goto 275
      // 274: athrow
      // 275: aload 0
      // 276: iload 4
      // 278: ifne 2a5
      // 27b: goto 27f
      // 27e: athrow
      // 27f: aload 1
      // 280: aload 9
      // 282: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.ab ()Lnet/minecraft/class_2338;
      // 285: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 288: ifeq 2a0
      // 28b: goto 28f
      // 28e: athrow
      // 28f: aload 0
      // 290: aload 0
      // 291: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 294: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 297: iload 4
      // 299: ifeq 2c9
      // 29c: goto 2a0
      // 29f: athrow
      // 2a0: aload 0
      // 2a1: goto 2a5
      // 2a4: athrow
      // 2a5: aload 0
      // 2a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 2a9: ifeq 2b3
      // 2ac: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 2af: goto 2b6
      // 2b2: athrow
      // 2b3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 2b6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 2b9: iload 4
      // 2bb: ifeq 2c9
      // 2be: aload 0
      // 2bf: goto 2c3
      // 2c2: athrow
      // 2c3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 2c6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 2c9: aload 0
      // 2ca: invokestatic java/lang/System.currentTimeMillis ()J
      // 2cd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbba J
      // 2d0: aload 0
      // 2d1: aload 0
      // 2d2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbba J
      // 2d5: lconst_0
      // 2d6: aload 0
      // 2d7: aload 0
      // 2d8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 2db: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;)J
      // 2de: ldc_w -462442980
      // 2e1: ldc_w 1239072428
      // 2e4: ldc_w -1303046870
      // 2e7: ixor
      // 2e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 2eb: ldc2_w 7894730656606348862
      // 2ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 2f1: lsub
      // 2f2: invokestatic java/lang/Math.max (JJ)J
      // 2f5: ladd
      // 2f6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 2f9: bipush 1
      // 2fa: ireturn
   }

   private boolean bbbabb(class_3965 param1, class_243 param2, class_243 param3, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 6
      // 05: aload 0
      // 06: aload 1
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbbb (Lnet/minecraft/class_3965;)Z
      // 0a: iload 6
      // 0c: ifne 46
      // 0f: ifeq 45
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: iload 6
      // 19: ifne 48
      // 1c: goto 20
      // 1f: athrow
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 23: ifnull 47
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 1
      // 2b: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 2e: aload 0
      // 2f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 32: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 35: iload 6
      // 37: ifne 46
      // 3a: goto 3e
      // 3d: athrow
      // 3e: ifeq 47
      // 41: goto 45
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
      // 47: aload 0
      // 48: aload 2
      // 49: aload 3
      // 4a: aload 1
      // 4b: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 4e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbb (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)D
      // 51: dstore 7
      // 53: dload 7
      // 55: invokestatic java/lang/Double.isNaN (D)Z
      // 58: iload 6
      // 5a: ifne 7a
      // 5d: ifne 79
      // 60: goto 64
      // 63: athrow
      // 64: dload 7
      // 66: dload 4
      // 68: dcmpg
      // 69: iload 6
      // 6b: ifne 7a
      // 6e: goto 72
      // 71: athrow
      // 72: ifge 7d
      // 75: goto 79
      // 78: athrow
      // 79: bipush 1
      // 7a: goto 7e
      // 7d: bipush 0
      // 7e: ireturn
   }

   private boolean bbbbaa(class_1661 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: ifnull 53
      // 08: iload 2
      // 09: iload 3
      // 0a: ifne 19
      // 0d: goto 11
      // 10: athrow
      // 11: iflt 53
      // 14: goto 18
      // 17: athrow
      // 18: iload 2
      // 19: iload 3
      // 1a: ifne 44
      // 1d: ldc_w -462442977
      // 20: ldc_w 1858254437
      // 23: ldc_w -182103394
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 2a: ldc2_w 1548822180505933046
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 30: if_icmpge 53
      // 33: goto 37
      // 36: athrow
      // 37: aload 0
      // 38: aload 1
      // 39: iload 2
      // 3a: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 3d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaab (Lnet/minecraft/class_1799;)Z
      // 40: goto 44
      // 43: athrow
      // 44: iload 3
      // 45: ifne 50
      // 48: ifeq 53
      // 4b: goto 4f
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 54
      // 53: bipush 0
      // 54: ireturn
   }

   private void bbbbab(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 020
      // 009: aload 1
      // 00a: aload 0
      // 00b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 00e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 011: ifne 01f
      // 014: goto 018
      // 017: athrow
      // 018: aload 0
      // 019: aload 1
      // 01a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 01d: return
      // 01e: athrow
      // 01f: aload 0
      // 020: aload 1
      // 021: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaa (Lnet/minecraft/class_310;)I
      // 024: istore 3
      // 025: aload 0
      // 026: iload 2
      // 027: ifne 039
      // 02a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 02d: ifnull 042
      // 030: goto 034
      // 033: athrow
      // 034: aload 0
      // 035: goto 039
      // 038: athrow
      // 039: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 03c: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 03f: goto 043
      // 042: aconst_null
      // 043: astore 4
      // 045: iload 2
      // 046: ifne 063
      // 049: iload 3
      // 04a: iflt 05a
      // 04d: goto 051
      // 050: athrow
      // 051: aload 4
      // 053: ifnonnull 064
      // 056: goto 05a
      // 059: athrow
      // 05a: aload 0
      // 05b: aload 1
      // 05c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbbbb (Lnet/minecraft/class_310;)V
      // 05f: goto 063
      // 062: athrow
      // 063: return
      // 064: aload 1
      // 065: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 068: aload 4
      // 06a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 06d: astore 5
      // 06f: aload 5
      // 071: iload 2
      // 072: ifne 085
      // 075: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 078: ifne 095
      // 07b: goto 07f
      // 07e: athrow
      // 07f: aload 5
      // 081: goto 085
      // 084: athrow
      // 085: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 088: ifne 095
      // 08b: aload 0
      // 08c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 08f: aload 1
      // 090: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // 093: return
      // 094: athrow
      // 095: aload 0
      // 096: aload 1
      // 097: aload 0
      // 098: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 09b: aload 0
      // 09c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 09f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa;
      // 0a2: astore 6
      // 0a4: iload 2
      // 0a5: ifne 0ca
      // 0a8: aload 6
      // 0aa: ifnonnull 0b8
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: aload 1
      // 0b3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbbbb (Lnet/minecraft/class_310;)V
      // 0b6: return
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: aload 6
      // 0bb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa.ba ()Lnet/minecraft/class_2338;
      // 0be: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 0c1: aload 0
      // 0c2: aload 1
      // 0c3: iload 3
      // 0c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababba (Lnet/minecraft/class_310;I)Lnet/minecraft/class_2680;
      // 0c7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 0ca: aload 0
      // 0cb: aload 1
      // 0cc: iload 3
      // 0cd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaab (Lnet/minecraft/class_310;I)Z
      // 0d0: ifne 0d5
      // 0d3: return
      // 0d4: athrow
      // 0d5: aload 1
      // 0d6: aload 6
      // 0d8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa.aa ()Lnet/minecraft/class_243;
      // 0db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 0de: astore 7
      // 0e0: aload 7
      // 0e2: iload 2
      // 0e3: ifne 0ef
      // 0e6: ifnull 0f4
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: aload 7
      // 0ef: bipush 0
      // 0f0: faload
      // 0f1: goto 0fb
      // 0f4: aload 1
      // 0f5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0f8: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 0fb: fstore 8
      // 0fd: aload 7
      // 0ff: iload 2
      // 100: ifne 10c
      // 103: ifnull 111
      // 106: goto 10a
      // 109: athrow
      // 10a: aload 7
      // 10c: bipush 1
      // 10d: faload
      // 10e: goto 118
      // 111: aload 1
      // 112: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 115: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 118: fstore 9
      // 11a: aload 6
      // 11c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa.b ()Lnet/minecraft/class_3965;
      // 11f: astore 10
      // 121: aload 0
      // 122: aload 1
      // 123: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 126: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 129: fload 8
      // 12b: fload 9
      // 12d: aload 10
      // 12f: aload 0
      // 130: aload 1
      // 131: iload 3
      // 132: aload 10
      // 134: invokedynamic getAsBoolean (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaaa (Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Z, ()Z ]
      // 139: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababbbb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;FFLnet/minecraft/class_3965;Ljava/util/function/BooleanSupplier;)V
      // 13c: return
   }

   private void bbbbba() {
      bbabbbb.baaa(this.aaa);
      this.aaa = null;
   }

   private boolean aaaaabb(class_310 var1) {
      aabbabbbb.bbabbab(var1, this.abaaa, this.baaaa);
      return this.abbbaa(var1);
   }

   private boolean aaaabaa(class_310 var1, int var2, class_3965 var3) {
      this.aaabb(var1);
      return this.bbbbabb(this::bba);
   }

   private boolean aaaabab(class_2680 param1) {
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
      // 09: ifnull 68
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getstatic net/minecraft/class_2246.field_10167 Lnet/minecraft/class_2248;
      // 14: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 17: iload 2
      // 18: ifne 65
      // 1b: ifne 64
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: getstatic net/minecraft/class_2246.field_10425 Lnet/minecraft/class_2248;
      // 26: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 29: iload 2
      // 2a: ifne 65
      // 2d: goto 31
      // 30: athrow
      // 31: ifne 64
      // 34: goto 38
      // 37: athrow
      // 38: aload 1
      // 39: getstatic net/minecraft/class_2246.field_10025 Lnet/minecraft/class_2248;
      // 3c: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 3f: iload 2
      // 40: ifne 65
      // 43: goto 47
      // 46: athrow
      // 47: ifne 64
      // 4a: goto 4e
      // 4d: athrow
      // 4e: aload 1
      // 4f: getstatic net/minecraft/class_2246.field_10546 Lnet/minecraft/class_2248;
      // 52: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 55: iload 2
      // 56: ifne 65
      // 59: goto 5d
      // 5c: athrow
      // 5d: ifeq 68
      // 60: goto 64
      // 63: athrow
      // 64: bipush 1
      // 65: goto 69
      // 68: bipush 0
      // 69: ireturn
   }

   private double aaaabba(class_243 param1, class_243 param2, class_2338 param3, double param4, double param6, double param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 04: i2d
      // 05: dload 4
      // 07: dsub
      // 08: dstore 11
      // 0a: aload 3
      // 0b: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0e: i2d
      // 0f: dconst_1
      // 10: dadd
      // 11: dload 4
      // 13: dadd
      // 14: dstore 13
      // 16: aload 3
      // 17: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 1a: i2d
      // 1b: dload 6
      // 1d: dadd
      // 1e: dload 4
      // 20: dsub
      // 21: dstore 15
      // 23: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 26: aload 3
      // 27: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 2a: i2d
      // 2b: dload 8
      // 2d: dadd
      // 2e: dload 4
      // 30: dadd
      // 31: dstore 17
      // 33: aload 3
      // 34: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 37: i2d
      // 38: dload 4
      // 3a: dsub
      // 3b: dstore 19
      // 3d: aload 3
      // 3e: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 41: i2d
      // 42: dconst_1
      // 43: dadd
      // 44: dload 4
      // 46: dadd
      // 47: dstore 21
      // 49: aload 2
      // 4a: getfield net/minecraft/class_243.field_1352 D
      // 4d: aload 1
      // 4e: getfield net/minecraft/class_243.field_1352 D
      // 51: dsub
      // 52: dstore 23
      // 54: aload 2
      // 55: getfield net/minecraft/class_243.field_1351 D
      // 58: aload 1
      // 59: getfield net/minecraft/class_243.field_1351 D
      // 5c: dsub
      // 5d: dstore 25
      // 5f: aload 2
      // 60: getfield net/minecraft/class_243.field_1350 D
      // 63: aload 1
      // 64: getfield net/minecraft/class_243.field_1350 D
      // 67: dsub
      // 68: dstore 27
      // 6a: istore 10
      // 6c: dconst_0
      // 6d: dstore 29
      // 6f: iload 10
      // 71: dconst_1
      // 72: dstore 31
      // 74: aload 0
      // 75: aload 1
      // 76: getfield net/minecraft/class_243.field_1352 D
      // 79: dload 23
      // 7b: dload 11
      // 7d: dload 13
      // 7f: dload 29
      // 81: dload 31
      // 83: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaaa (DDDDDD)[D
      // 86: astore 33
      // 88: ifne be
      // 8b: aload 33
      // 8d: ifnonnull 99
      // 90: goto 94
      // 93: athrow
      // 94: ldc2_w NaN
      // 97: dreturn
      // 98: athrow
      // 99: aload 33
      // 9b: bipush 0
      // 9c: daload
      // 9d: dstore 29
      // 9f: aload 33
      // a1: bipush 1
      // a2: daload
      // a3: dstore 31
      // a5: aload 0
      // a6: aload 1
      // a7: getfield net/minecraft/class_243.field_1351 D
      // aa: dload 25
      // ac: dload 15
      // ae: dload 17
      // b0: dload 29
      // b2: dload 31
      // b4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaaa (DDDDDD)[D
      // b7: iload 10
      // b9: ifne ef
      // bc: astore 33
      // be: aload 33
      // c0: ifnonnull c8
      // c3: ldc2_w NaN
      // c6: dreturn
      // c7: athrow
      // c8: aload 33
      // ca: bipush 0
      // cb: daload
      // cc: dstore 29
      // ce: aload 33
      // d0: bipush 1
      // d1: daload
      // d2: dstore 31
      // d4: aload 0
      // d5: aload 1
      // d6: getfield net/minecraft/class_243.field_1350 D
      // d9: dload 27
      // db: dload 19
      // dd: dload 21
      // df: dload 29
      // e1: dload 31
      // e3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaaa (DDDDDD)[D
      // e6: iload 10
      // e8: ifne f9
      // eb: astore 33
      // ed: aload 33
      // ef: ifnonnull f7
      // f2: ldc2_w NaN
      // f5: dreturn
      // f6: athrow
      // f7: aload 33
      // f9: bipush 0
      // fa: daload
      // fb: dreturn
   }

   private abbbaaaa aaaabbb(Supplier param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0b: iload 2
      // 0c: ifne 2a
      // 0f: checkcast java/lang/Boolean
      // 12: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 15: ifne 1f
      // 18: goto 1c
      // 1b: athrow
      // 1c: aconst_null
      // 1d: areturn
      // 1e: athrow
      // 1f: aload 0
      // 20: bipush 1
      // 21: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbb Z
      // 24: aload 1
      // 25: invokeinterface java/util/function/Supplier.get ()Ljava/lang/Object; 1
      // 2a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa
      // 2d: astore 3
      // 2e: aload 0
      // 2f: bipush 0
      // 30: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbb Z
      // 33: aload 3
      // 34: areturn
      // 35: astore 4
      // 37: aload 0
      // 38: bipush 0
      // 39: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbb Z
      // 3c: aload 4
      // 3e: athrow
   }

   private class_3965 aaabaaa(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 03a
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: iload 3
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 03a
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 027: ifnull 03a
      // 02a: aload 2
      // 02b: iload 3
      // 02c: ifne 041
      // 02f: goto 033
      // 032: athrow
      // 033: ifnonnull 03d
      // 036: goto 03a
      // 039: athrow
      // 03a: aconst_null
      // 03b: areturn
      // 03c: athrow
      // 03d: aload 2
      // 03e: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 041: astore 4
      // 043: aload 1
      // 044: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 047: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 04a: astore 5
      // 04c: bipush 3
      // 04d: newarray 7
      // 04f: dup
      // 050: bipush 0
      // 051: ldc2_w 0.5
      // 054: dastore
      // 055: dup
      // 056: bipush 1
      // 057: ldc2_w 0.2
      // 05a: dastore
      // 05b: dup
      // 05c: bipush 2
      // 05d: ldc2_w 0.8
      // 060: dastore
      // 061: astore 6
      // 063: aload 6
      // 065: arraylength
      // 066: istore 7
      // 068: bipush 0
      // 069: istore 8
      // 06b: iload 8
      // 06d: iload 7
      // 06f: if_icmpge 133
      // 072: aload 6
      // 074: iload 8
      // 076: daload
      // 077: dstore 9
      // 079: bipush 3
      // 07a: newarray 7
      // 07c: dup
      // 07d: bipush 0
      // 07e: ldc2_w 0.5
      // 081: dastore
      // 082: dup
      // 083: bipush 1
      // 084: ldc2_w 0.2
      // 087: dastore
      // 088: dup
      // 089: bipush 2
      // 08a: ldc2_w 0.8
      // 08d: dastore
      // 08e: astore 11
      // 090: aload 11
      // 092: arraylength
      // 093: istore 12
      // 095: bipush 0
      // 096: istore 13
      // 098: iload 13
      // 09a: iload 12
      // 09c: if_icmpge 12c
      // 09f: aload 11
      // 0a1: iload 13
      // 0a3: daload
      // 0a4: iload 3
      // 0a5: ifne 077
      // 0a8: dstore 14
      // 0aa: iload 3
      // 0ab: aload 4
      // 0ad: dload 9
      // 0af: dload 14
      // 0b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbbba (Lnet/minecraft/class_2338;DD)Lnet/minecraft/class_243;
      // 0b4: astore 16
      // 0b6: aload 1
      // 0b7: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0ba: new net/minecraft/class_3959
      // 0bd: dup
      // 0be: aload 5
      // 0c0: aload 16
      // 0c2: getstatic net/minecraft/class_3959$class_3960.field_17559 Lnet/minecraft/class_3959$class_3960;
      // 0c5: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 0c8: aload 1
      // 0c9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0cc: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 0cf: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 0d2: astore 17
      // 0d4: ifne 128
      // 0d7: aload 0
      // 0d8: aload 17
      // 0da: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbbb (Lnet/minecraft/class_3965;)Z
      // 0dd: ifeq 125
      // 0e0: goto 0e4
      // 0e3: athrow
      // 0e4: aload 17
      // 0e6: iload 3
      // 0e7: ifne 103
      // 0ea: goto 0ee
      // 0ed: athrow
      // 0ee: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 0f1: aload 4
      // 0f3: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 0f6: ifeq 125
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: aload 17
      // 0ff: goto 103
      // 102: athrow
      // 103: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 106: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 109: if_acmpne 125
      // 10c: aload 5
      // 10e: aload 17
      // 110: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 113: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 116: ldc2_w 20.25
      // 119: dcmpg
      // 11a: ifgt 125
      // 11d: goto 121
      // 120: athrow
      // 121: aload 17
      // 123: areturn
      // 124: athrow
      // 125: iinc 13 1
      // 128: iload 3
      // 129: ifeq 098
      // 12c: iinc 8 1
      // 12f: iload 3
      // 130: ifeq 06b
      // 133: aconst_null
      // 134: areturn
   }

   private void aaabaab(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 016
      // 009: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb Z
      // 00c: ifeq 015
      // 00f: goto 013
      // 012: athrow
      // 013: return
      // 014: athrow
      // 015: aload 0
      // 016: iload 2
      // 017: ifne 042
      // 01a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babab Lnet/minecraft/class_1268;
      // 01d: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 020: if_acmpne 041
      // 023: goto 027
      // 026: athrow
      // 027: aload 0
      // 028: iload 2
      // 029: ifne 042
      // 02c: goto 030
      // 02f: athrow
      // 030: aload 1
      // 031: aload 0
      // 032: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaa I
      // 035: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaab (Lnet/minecraft/class_310;I)Z
      // 038: ifne 041
      // 03b: goto 03f
      // 03e: athrow
      // 03f: return
      // 040: athrow
      // 041: aload 0
      // 042: iload 2
      // 043: ifne 086
      // 046: aload 1
      // 047: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaa (Lnet/minecraft/class_310;)Z
      // 04a: ifeq 081
      // 04d: goto 051
      // 050: athrow
      // 051: aload 0
      // 052: iload 2
      // 053: ifne 086
      // 056: goto 05a
      // 059: athrow
      // 05a: aload 1
      // 05b: aload 0
      // 05c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 05f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 062: ifeq 081
      // 065: goto 069
      // 068: athrow
      // 069: aload 0
      // 06a: aload 1
      // 06b: iload 2
      // 06c: ifne 095
      // 06f: goto 073
      // 072: athrow
      // 073: aload 0
      // 074: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 077: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 07a: ifne 08b
      // 07d: goto 081
      // 080: athrow
      // 081: aload 0
      // 082: goto 086
      // 085: athrow
      // 086: aload 1
      // 087: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 08a: return
      // 08b: aload 0
      // 08c: iload 2
      // 08d: ifne 0ac
      // 090: aload 1
      // 091: goto 095
      // 094: athrow
      // 095: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabb (Lnet/minecraft/class_310;)Z
      // 098: ifne 09d
      // 09b: return
      // 09c: athrow
      // 09d: aload 0
      // 09e: iload 2
      // 09f: ifne 12c
      // 0a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0a5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababab;
      // 0af: if_acmpne 12b
      // 0b2: aload 0
      // 0b3: bipush 1
      // 0b4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb Z
      // 0b7: iload 2
      // 0b8: aload 0
      // 0b9: aload 1
      // 0ba: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0bd: getfield net/minecraft/class_746.field_6012 I
      // 0c0: bipush 1
      // 0c1: iadd
      // 0c2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaa I
      // 0c5: aload 0
      // 0c6: aload 0
      // 0c7: aload 1
      // 0c8: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa (Lnet/minecraft/class_310;)Z, ()Z ]
      // 0cd: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;
      // 0d0: aload 1
      // 0d1: ldc_w -462442978
      // 0d4: ldc_w 1938895189
      // 0d7: ldc_w -2062914401
      // 0da: ixor
      // 0db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 0de: ldc2_w 1145486427514791491
      // 0e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 0e4: aload 0
      // 0e5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaa F
      // 0e8: aload 0
      // 0e9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaa F
      // 0ec: aload 0
      // 0ed: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;
      // 0f0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbbbb (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 0f3: istore 3
      // 0f4: ifne 123
      // 0f7: iload 3
      // 0f8: ifne 12a
      // 0fb: goto 0ff
      // 0fe: athrow
      // 0ff: aload 0
      // 100: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbba ()V
      // 103: aload 0
      // 104: bipush 0
      // 105: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb Z
      // 108: aload 0
      // 109: ldc_w -462442991
      // 10c: ldc_w 1938895189
      // 10f: ldc_w -379041383
      // 112: ixor
      // 113: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 116: ldc2_w 5579952000272572156
      // 119: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 11c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaa I
      // 11f: goto 123
      // 122: athrow
      // 123: aload 0
      // 124: invokestatic java/lang/System.currentTimeMillis ()J
      // 127: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 12a: return
      // 12b: aload 0
      // 12c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 12f: aload 1
      // 130: aload 0
      // 131: aload 1
      // 132: aload 0
      // 133: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaa F
      // 136: aload 0
      // 137: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaa F
      // 13a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaabb (Lnet/minecraft/class_310;FF)Lnet/minecraft/class_243;
      // 13d: aload 0
      // 13e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 141: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 144: checkcast java/lang/Double
      // 147: invokevirtual java/lang/Double.floatValue ()F
      // 14a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.baaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_243;F)F
      // 14d: fstore 3
      // 14e: invokestatic java/lang/System.currentTimeMillis ()J
      // 151: lstore 4
      // 153: fload 3
      // 154: ldc 0.5
      // 156: fcmpg
      // 157: iload 2
      // 158: ifne 195
      // 15b: ifle 18c
      // 15e: goto 162
      // 161: athrow
      // 162: lload 4
      // 164: aload 0
      // 165: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbba J
      // 168: lsub
      // 169: ldc_w -462442992
      // 16c: ldc_w 1938895189
      // 16f: ldc_w 605236055
      // 172: ixor
      // 173: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 176: ldc2_w 1798086400939184502
      // 179: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 17c: lcmp
      // 17d: iload 2
      // 17e: ifne 195
      // 181: goto 185
      // 184: athrow
      // 185: iflt 1b6
      // 188: goto 18c
      // 18b: athrow
      // 18c: aload 0
      // 18d: aload 1
      // 18e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaabb (Lnet/minecraft/class_310;)Z
      // 191: goto 195
      // 194: athrow
      // 195: istore 6
      // 197: iload 2
      // 198: ifne 1ad
      // 19b: iload 6
      // 19d: ifne 1ae
      // 1a0: goto 1a4
      // 1a3: athrow
      // 1a4: aload 0
      // 1a5: aload 1
      // 1a6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 1a9: goto 1ad
      // 1ac: athrow
      // 1ad: return
      // 1ae: aload 0
      // 1af: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 1b2: aload 1
      // 1b3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // 1b6: return
   }

   private boolean aaababa(class_310 var1, int var2, class_3965 var3) {
      return this.ba(var1, var2, var3);
   }

   private abbbbbaa aaababb(class_310 param1, class_2338 param2, class_2338 param3, class_2338 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 5
      // 005: aload 1
      // 006: iload 5
      // 008: ifne 013
      // 00b: ifnull 096
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: iload 5
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 096
      // 01e: goto 022
      // 021: athrow
      // 022: aload 1
      // 023: goto 027
      // 026: athrow
      // 027: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 02a: ifnull 096
      // 02d: aload 2
      // 02e: iload 5
      // 030: ifne 03f
      // 033: goto 037
      // 036: athrow
      // 037: ifnull 096
      // 03a: goto 03e
      // 03d: athrow
      // 03e: aload 2
      // 03f: aload 3
      // 040: iload 5
      // 042: ifne 056
      // 045: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 048: ifne 096
      // 04b: goto 04f
      // 04e: athrow
      // 04f: aload 2
      // 050: aload 4
      // 052: goto 056
      // 055: athrow
      // 056: iload 5
      // 058: ifne 077
      // 05b: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 05e: ifne 096
      // 061: goto 065
      // 064: athrow
      // 065: aload 2
      // 066: aload 3
      // 067: iload 5
      // 069: ifne 087
      // 06c: goto 070
      // 06f: athrow
      // 070: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 073: goto 077
      // 076: athrow
      // 077: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 07a: ifne 096
      // 07d: aload 2
      // 07e: aload 4
      // 080: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 083: goto 087
      // 086: athrow
      // 087: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 08a: iload 5
      // 08c: ifne 09f
      // 08f: ifeq 099
      // 092: goto 096
      // 095: athrow
      // 096: aconst_null
      // 097: areturn
      // 098: athrow
      // 099: aload 0
      // 09a: aload 1
      // 09b: aload 2
      // 09c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 09f: iload 5
      // 0a1: ifne 0c4
      // 0a4: ifeq 0e9
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: aload 1
      // 0ac: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0af: aconst_null
      // 0b0: new net/minecraft/class_238
      // 0b3: dup
      // 0b4: aload 2
      // 0b5: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 0b8: invokevirtual net/minecraft/class_638.method_8335 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/util/List;
      // 0bb: invokeinterface java/util/List.isEmpty ()Z 1
      // 0c0: goto 0c4
      // 0c3: athrow
      // 0c4: iload 5
      // 0c6: ifne 0e6
      // 0c9: ifeq 0e9
      // 0cc: goto 0d0
      // 0cf: athrow
      // 0d0: new net/minecraft/class_238
      // 0d3: dup
      // 0d4: aload 2
      // 0d5: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 0d8: aload 1
      // 0d9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0dc: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
      // 0df: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
      // 0e2: goto 0e6
      // 0e5: athrow
      // 0e6: ifeq 0ec
      // 0e9: aconst_null
      // 0ea: areturn
      // 0eb: athrow
      // 0ec: aload 2
      // 0ed: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 0f0: astore 6
      // 0f2: aload 1
      // 0f3: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0f6: aload 6
      // 0f8: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0fb: astore 7
      // 0fd: aload 7
      // 0ff: iload 5
      // 101: ifne 116
      // 104: ifnull 156
      // 107: goto 10b
      // 10a: athrow
      // 10b: aload 7
      // 10d: iload 5
      // 10f: ifne 127
      // 112: goto 116
      // 115: athrow
      // 116: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 119: ifne 156
      // 11c: aload 7
      // 11e: iload 5
      // 120: ifne 138
      // 123: goto 127
      // 126: athrow
      // 127: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 12a: ifne 156
      // 12d: aload 7
      // 12f: iload 5
      // 131: ifne 147
      // 134: goto 138
      // 137: athrow
      // 138: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 13b: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 13e: ifeq 156
      // 141: aload 7
      // 143: goto 147
      // 146: athrow
      // 147: aload 1
      // 148: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14b: aload 6
      // 14d: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 150: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 153: ifeq 159
      // 156: aconst_null
      // 157: areturn
      // 158: athrow
      // 159: aload 2
      // 15a: invokestatic net/minecraft/class_243.method_24955 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 15d: astore 8
      // 15f: aload 1
      // 160: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 163: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 166: aload 8
      // 168: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 16b: ldc2_w 20.25
      // 16e: dcmpl
      // 16f: iload 5
      // 171: ifne 190
      // 174: ifgt 193
      // 177: goto 17b
      // 17a: athrow
      // 17b: aload 0
      // 17c: aload 1
      // 17d: aload 8
      // 17f: dconst_0
      // 180: ldc2_w 0.0625
      // 183: dconst_0
      // 184: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 187: aload 6
      // 189: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaabb (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Z
      // 18c: goto 190
      // 18f: athrow
      // 190: ifne 196
      // 193: aconst_null
      // 194: areturn
      // 195: athrow
      // 196: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa
      // 199: dup
      // 19a: aload 2
      // 19b: aload 8
      // 19d: new net/minecraft/class_3965
      // 1a0: dup
      // 1a1: aload 8
      // 1a3: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 1a6: aload 6
      // 1a8: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 1ab: bipush 0
      // 1ac: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // 1af: fconst_0
      // 1b0: fconst_0
      // 1b1: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbaa.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_3965;FF)V
      // 1b4: areturn
   }

   private int aaabbaa(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 1f
      // 17: aload 2
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: new net/minecraft/class_238
      // 25: dup
      // 26: aload 2
      // 27: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 2a: ldc2_w 0.75
      // 2d: ldc2_w 0.6
      // 30: ldc2_w 0.75
      // 33: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
      // 36: astore 4
      // 38: aload 1
      // 39: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3c: aconst_null
      // 3d: aload 4
      // 3f: aload 2
      // 40: invokedynamic test (Lnet/minecraft/class_2338;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbab (Lnet/minecraft/class_2338;Lnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
      // 45: invokevirtual net/minecraft/class_638.method_8333 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;Ljava/util/function/Predicate;)Ljava/util/List;
      // 48: invokeinterface java/util/List.size ()I 1
      // 4d: ireturn
   }

   private static boolean aaabbab(class_2338 param0, class_1297 param1) {
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
      // 06: ifne 18
      // 09: instanceof net/minecraft/class_1701
      // 0c: ifeq 41
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: invokevirtual net/minecraft/class_1297.method_31481 ()Z
      // 1b: iload 2
      // 1c: ifne 32
      // 1f: ifne 41
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: aload 1
      // 28: invokevirtual net/minecraft/class_1297.method_73189 ()Lnet/minecraft/class_243;
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabab.bbaaa (Lnet/minecraft/class_2338;Lnet/minecraft/class_243;)Z
      // 2e: goto 32
      // 31: athrow
      // 32: iload 2
      // 33: ifne 3e
      // 36: ifeq 41
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
   }

   private boolean aaabbba(
      class_310 param1, aaaaaabaa param2, float param3, float param4, class_2338 param5, class_2338 param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 7
      // 005: aload 1
      // 006: iload 7
      // 008: ifne 013
      // 00b: ifnull 038
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 016: ifnull 038
      // 019: aload 2
      // 01a: ifnull 038
      // 01d: goto 021
      // 020: athrow
      // 021: aload 5
      // 023: iload 7
      // 025: ifne 035
      // 028: goto 02c
      // 02b: athrow
      // 02c: ifnull 038
      // 02f: goto 033
      // 032: athrow
      // 033: aload 6
      // 035: ifnonnull 03b
      // 038: bipush 0
      // 039: ireturn
      // 03a: athrow
      // 03b: aload 0
      // 03c: aload 1
      // 03d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaba (Lnet/minecraft/class_310;)Lnet/minecraft/class_243;
      // 040: astore 8
      // 042: aload 0
      // 043: fload 3
      // 044: fload 4
      // 046: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabab (FF)Lnet/minecraft/class_243;
      // 049: aload 2
      // 04a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.b ()D
      // 04d: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 050: astore 9
      // 052: bipush 0
      // 053: istore 10
      // 055: iload 10
      // 057: ldc_w -462442989
      // 05a: ldc_w -1068961127
      // 05d: ldc_w 241925501
      // 060: ixor
      // 061: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 064: ldc2_w 2094530860357947497
      // 067: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 06a: if_icmpge 137
      // 06d: aload 8
      // 06f: aload 9
      // 071: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 074: astore 11
      // 076: aload 0
      // 077: aload 8
      // 079: aload 11
      // 07b: aload 6
      // 07d: ldc2_w 0.08
      // 080: ldc2_w 0.22
      // 083: ldc2_w 0.58
      // 086: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;DDD)D
      // 089: dstore 12
      // 08b: aload 0
      // 08c: aload 1
      // 08d: aload 8
      // 08f: aload 11
      // 091: aload 5
      // 093: aload 0
      // 094: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaaab ()D
      // 097: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;D)D
      // 09a: dstore 14
      // 09c: dload 12
      // 09e: iload 7
      // 0a0: ifne 0e8
      // 0a3: invokestatic java/lang/Double.isNaN (D)Z
      // 0a6: iload 7
      // 0a8: ifne 138
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: ifne 0e6
      // 0b2: goto 0b6
      // 0b5: athrow
      // 0b6: dload 14
      // 0b8: iload 7
      // 0ba: ifne 0d1
      // 0bd: goto 0c1
      // 0c0: athrow
      // 0c1: invokestatic java/lang/Double.isNaN (D)Z
      // 0c4: ifne 0e4
      // 0c7: goto 0cb
      // 0ca: athrow
      // 0cb: dload 14
      // 0cd: goto 0d1
      // 0d0: athrow
      // 0d1: dload 12
      // 0d3: dcmpg
      // 0d4: iload 7
      // 0d6: ifne 0e1
      // 0d9: ifgt 0e4
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: bipush 1
      // 0e1: goto 0e5
      // 0e4: bipush 0
      // 0e5: ireturn
      // 0e6: dload 14
      // 0e8: iload 7
      // 0ea: ifne 11c
      // 0ed: invokestatic java/lang/Double.isNaN (D)Z
      // 0f0: ifne 0fa
      // 0f3: goto 0f7
      // 0f6: athrow
      // 0f7: bipush 1
      // 0f8: ireturn
      // 0f9: athrow
      // 0fa: aload 11
      // 0fc: astore 8
      // 0fe: iload 7
      // 100: ifne 132
      // 103: aload 9
      // 105: aload 2
      // 106: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.ab ()D
      // 109: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 10c: dconst_0
      // 10d: aload 2
      // 10e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.aa ()D
      // 111: dconst_0
      // 112: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 115: astore 9
      // 117: aload 8
      // 119: getfield net/minecraft/class_243.field_1351 D
      // 11c: aload 1
      // 11d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 120: invokevirtual net/minecraft/class_638.method_31607 ()I
      // 123: i2d
      // 124: ldc2_w 20.0
      // 127: dsub
      // 128: dcmpg
      // 129: ifge 12f
      // 12c: bipush 0
      // 12d: ireturn
      // 12e: athrow
      // 12f: iinc 10 1
      // 132: iload 7
      // 134: ifeq 055
      // 137: bipush 0
      // 138: ireturn
   }

   private boolean aaabbbb(class_3965 var1) {
      int var2 = baaabbaa.bba;

      class_3965 var10000;
      label27: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label27;
            }

            if (var1 == null) {
               return false;
            }
         } catch (RuntimeException var4) {
            throw var4;
         }

         var10000 = var1;
      }

      try {
         if (var10000.method_17783() == class_240.field_1332) {
            return true;
         }
      } catch (RuntimeException var3) {
         throw var3;
      }

      return false;
   }

   private double aabaaaa(class_310 param1, aaaaaabaa param2, class_2338 param3, class_2338 param4, float param5, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 7
      // 005: aload 1
      // 006: iload 7
      // 008: ifne 013
      // 00b: ifnull 04b
      // 00e: goto 012
      // 011: athrow
      // 012: aload 1
      // 013: iload 7
      // 015: ifne 027
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 04b
      // 01e: goto 022
      // 021: athrow
      // 022: aload 1
      // 023: goto 027
      // 026: athrow
      // 027: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 02a: ifnull 04b
      // 02d: aload 2
      // 02e: ifnull 04b
      // 031: goto 035
      // 034: athrow
      // 035: aload 3
      // 036: iload 7
      // 038: ifne 048
      // 03b: goto 03f
      // 03e: athrow
      // 03f: ifnull 04b
      // 042: goto 046
      // 045: athrow
      // 046: aload 4
      // 048: ifnonnull 050
      // 04b: ldc2_w NaN
      // 04e: dreturn
      // 04f: athrow
      // 050: aload 0
      // 051: aload 1
      // 052: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaaba (Lnet/minecraft/class_310;)Lnet/minecraft/class_243;
      // 055: astore 8
      // 057: aload 0
      // 058: fload 5
      // 05a: fload 6
      // 05c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabab (FF)Lnet/minecraft/class_243;
      // 05f: aload 2
      // 060: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.b ()D
      // 063: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 066: astore 9
      // 068: bipush 0
      // 069: istore 10
      // 06b: aload 0
      // 06c: aload 4
      // 06e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabb (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 071: astore 11
      // 073: bipush 0
      // 074: istore 12
      // 076: iload 12
      // 078: ldc_w -462442990
      // 07b: ldc_w -1959109893
      // 07e: ldc_w -69318181
      // 081: ixor
      // 082: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 085: ldc2_w 3727423847828213453
      // 088: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 08b: if_icmpge 21b
      // 08e: aload 8
      // 090: aload 9
      // 092: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 095: astore 13
      // 097: aload 0
      // 098: aload 1
      // 099: aload 8
      // 09b: aload 13
      // 09d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_3965;
      // 0a0: astore 14
      // 0a2: aload 0
      // 0a3: aload 8
      // 0a5: aload 13
      // 0a7: aload 3
      // 0a8: ldc2_w 0.08
      // 0ab: dconst_0
      // 0ac: dconst_1
      // 0ad: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;DDD)D
      // 0b0: iload 7
      // 0b2: ifne 21e
      // 0b5: dstore 15
      // 0b7: aload 0
      // 0b8: aload 8
      // 0ba: aload 13
      // 0bc: aload 4
      // 0be: ldc2_w 0.08
      // 0c1: ldc2_w 0.22
      // 0c4: ldc2_w 0.58
      // 0c7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;DDD)D
      // 0ca: dstore 17
      // 0cc: aload 0
      // 0cd: iload 7
      // 0cf: ifne 0e4
      // 0d2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 0d5: ifnonnull 0e3
      // 0d8: goto 0dc
      // 0db: athrow
      // 0dc: ldc2_w NaN
      // 0df: goto 0f4
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: aload 1
      // 0e5: aload 8
      // 0e7: aload 13
      // 0e9: aload 0
      // 0ea: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 0ed: aload 0
      // 0ee: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaaab ()D
      // 0f1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;D)D
      // 0f4: dstore 19
      // 0f6: dload 17
      // 0f8: iload 7
      // 0fa: ifne 19f
      // 0fd: invokestatic java/lang/Double.isNaN (D)Z
      // 100: ifne 19d
      // 103: goto 107
      // 106: athrow
      // 107: aload 0
      // 108: aload 14
      // 10a: aload 8
      // 10c: aload 13
      // 10e: dload 17
      // 110: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbabb (Lnet/minecraft/class_3965;Lnet/minecraft/class_243;Lnet/minecraft/class_243;D)Z
      // 113: iload 7
      // 115: ifne 12c
      // 118: goto 11c
      // 11b: athrow
      // 11c: ifne 14d
      // 11f: goto 123
      // 122: athrow
      // 123: dload 19
      // 125: invokestatic java/lang/Double.isNaN (D)Z
      // 128: goto 12c
      // 12b: athrow
      // 12c: iload 7
      // 12e: ifne 154
      // 131: ifne 152
      // 134: goto 138
      // 137: athrow
      // 138: dload 19
      // 13a: dload 17
      // 13c: dcmpg
      // 13d: iload 7
      // 13f: ifne 154
      // 142: goto 146
      // 145: athrow
      // 146: ifgt 152
      // 149: goto 14d
      // 14c: athrow
      // 14d: ldc2_w NaN
      // 150: dreturn
      // 151: athrow
      // 152: iload 10
      // 154: iload 7
      // 156: ifne 172
      // 159: ifne 192
      // 15c: goto 160
      // 15f: athrow
      // 160: dload 15
      // 162: iload 7
      // 164: ifne 191
      // 167: goto 16b
      // 16a: athrow
      // 16b: invokestatic java/lang/Double.isNaN (D)Z
      // 16e: goto 172
      // 171: athrow
      // 172: ifne 18a
      // 175: dload 15
      // 177: iload 7
      // 179: ifne 19c
      // 17c: goto 180
      // 17f: athrow
      // 180: dload 17
      // 182: dcmpl
      // 183: ifle 192
      // 186: goto 18a
      // 189: athrow
      // 18a: ldc2_w NaN
      // 18d: goto 191
      // 190: athrow
      // 191: dreturn
      // 192: aload 0
      // 193: aload 8
      // 195: aload 13
      // 197: aload 11
      // 199: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbbba (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)D
      // 19c: dreturn
      // 19d: dload 15
      // 19f: iload 7
      // 1a1: ifne 1b3
      // 1a4: invokestatic java/lang/Double.isNaN (D)Z
      // 1a7: ifne 1b1
      // 1aa: goto 1ae
      // 1ad: athrow
      // 1ae: bipush 1
      // 1af: istore 10
      // 1b1: dload 19
      // 1b3: iload 7
      // 1b5: ifne 1db
      // 1b8: invokestatic java/lang/Double.isNaN (D)Z
      // 1bb: ifeq 1d8
      // 1be: goto 1c2
      // 1c1: athrow
      // 1c2: aload 0
      // 1c3: aload 14
      // 1c5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abababb (Lnet/minecraft/class_3965;)Z
      // 1c8: iload 7
      // 1ca: ifne 20b
      // 1cd: goto 1d1
      // 1d0: athrow
      // 1d1: ifeq 1dc
      // 1d4: goto 1d8
      // 1d7: athrow
      // 1d8: ldc2_w NaN
      // 1db: dreturn
      // 1dc: aload 13
      // 1de: astore 8
      // 1e0: iload 7
      // 1e2: ifne 216
      // 1e5: aload 9
      // 1e7: aload 2
      // 1e8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.ab ()D
      // 1eb: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 1ee: dconst_0
      // 1ef: aload 2
      // 1f0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa.aa ()D
      // 1f3: dconst_0
      // 1f4: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 1f7: astore 9
      // 1f9: aload 8
      // 1fb: getfield net/minecraft/class_243.field_1351 D
      // 1fe: aload 1
      // 1ff: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 202: invokevirtual net/minecraft/class_638.method_31607 ()I
      // 205: i2d
      // 206: ldc2_w 20.0
      // 209: dsub
      // 20a: dcmpg
      // 20b: ifge 213
      // 20e: ldc2_w NaN
      // 211: dreturn
      // 212: athrow
      // 213: iinc 12 1
      // 216: iload 7
      // 218: ifeq 076
      // 21b: ldc2_w NaN
      // 21e: dreturn
   }

   private void aabaaab(class_310 param1) {
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
      // 05: aload 1
      // 06: iload 2
      // 07: ifne 27
      // 0a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0d: aload 0
      // 0e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 11: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 14: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabab (Lnet/minecraft/class_2680;)Z
      // 17: ifne 25
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 23: return
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: aload 0
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)I
      // 2e: istore 3
      // 2f: iload 3
      // 30: iload 2
      // 31: ifne 68
      // 34: aload 0
      // 35: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab I
      // 38: if_icmpge 5c
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 0
      // 40: invokestatic java/lang/System.currentTimeMillis ()J
      // 43: ldc_w -462442987
      // 46: ldc_w 1855206958
      // 49: ldc_w 1652748451
      // 4c: ixor
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 50: ldc2_w 6294676368082693568
      // 53: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 56: ladd
      // 57: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 5a: return
      // 5b: athrow
      // 5c: aload 0
      // 5d: iload 2
      // 5e: ifne af
      // 61: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab I
      // 64: goto 68
      // 67: athrow
      // 68: aload 0
      // 69: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaa I
      // 6c: if_icmpge ae
      // 6f: aload 0
      // 70: aload 1
      // 71: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 74: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 77: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
      // 7a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbab (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 7d: istore 4
      // 7f: iload 2
      // 80: ifne ad
      // 83: iload 4
      // 85: ifge 9f
      // 88: goto 8c
      // 8b: athrow
      // 8c: aload 0
      // 8d: aload 0
      // 8e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab I
      // 91: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaa I
      // 94: aload 0
      // 95: aload 0
      // 96: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 99: aload 1
      // 9a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // 9d: return
      // 9e: athrow
      // 9f: aload 0
      // a0: iload 4
      // a2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaab I
      // a5: aload 0
      // a6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // a9: aload 1
      // aa: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // ad: return
      // ae: aload 0
      // af: aload 0
      // b0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // b3: aload 1
      // b4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // b7: return
   }

   private void aabaaba(class_310 param1, abbbaaaa param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 2
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa.aa ()Lnet/minecraft/class_2338;
      // 08: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb Lnet/minecraft/class_2338;
      // 0b: istore 3
      // 0c: aload 0
      // 0d: aload 0
      // 0e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb Lnet/minecraft/class_2338;
      // 11: ifnull 19
      // 14: bipush 1
      // 15: goto 1a
      // 18: athrow
      // 19: bipush 0
      // 1a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababab Z
      // 1d: iload 3
      // 1e: ifne 38
      // 21: aload 0
      // 22: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababab Z
      // 25: ifeq 45
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: aload 0
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb Lnet/minecraft/class_2338;
      // 31: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 34: goto 38
      // 37: athrow
      // 38: aload 0
      // 39: aload 1
      // 3a: aload 0
      // 3b: aload 1
      // 3c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaaa (Lnet/minecraft/class_310;)I
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababba (Lnet/minecraft/class_310;I)Lnet/minecraft/class_2680;
      // 42: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 45: return
   }

   private static boolean aabaabb(class_310 var0) {
      return aabbabbbb.abaaba(var0, class_1268.field_5808);
   }

   private abbbaaaa aababaa(class_310 param1, class_1799 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 02a
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: iload 3
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 02a
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 027: ifnonnull 02d
      // 02a: aconst_null
      // 02b: areturn
      // 02c: athrow
      // 02d: aload 0
      // 02e: aload 2
      // 02f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaa (Lnet/minecraft/class_1799;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;
      // 032: astore 4
      // 034: aload 1
      // 035: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 038: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 03b: fstore 5
      // 03d: aload 1
      // 03e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 041: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 044: fstore 6
      // 046: aload 0
      // 047: aload 1
      // 048: aload 4
      // 04a: fload 5
      // 04c: fload 6
      // 04e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaab (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 051: astore 7
      // 053: aload 7
      // 055: iload 3
      // 056: ifne 062
      // 059: ifnull 063
      // 05c: goto 060
      // 05f: athrow
      // 060: aload 7
      // 062: areturn
      // 063: aload 0
      // 064: iload 3
      // 065: ifne 07b
      // 068: aload 1
      // 069: fload 5
      // 06b: fload 6
      // 06d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabab (Lnet/minecraft/class_310;FF)Lnet/minecraft/class_3965;
      // 070: ifnull 07a
      // 073: goto 077
      // 076: athrow
      // 077: aconst_null
      // 078: areturn
      // 079: athrow
      // 07a: aload 0
      // 07b: aload 1
      // 07c: aload 4
      // 07e: fload 5
      // 080: fload 6
      // 082: bipush 0
      // 083: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aababa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 086: astore 8
      // 088: aload 8
      // 08a: iload 3
      // 08b: ifne 0aa
      // 08e: ifnull 099
      // 091: goto 095
      // 094: athrow
      // 095: aload 8
      // 097: areturn
      // 098: athrow
      // 099: aload 0
      // 09a: aload 0
      // 09b: aload 1
      // 09c: aload 4
      // 09e: fload 5
      // 0a0: fload 6
      // 0a2: invokedynamic get (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;FF)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;, ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa; ]
      // 0a7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabbb (Ljava/util/function/Supplier;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 0aa: astore 9
      // 0ac: aload 9
      // 0ae: iload 3
      // 0af: ifne 0c9
      // 0b2: ifnull 0bd
      // 0b5: goto 0b9
      // 0b8: athrow
      // 0b9: aload 9
      // 0bb: areturn
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: aload 1
      // 0bf: aload 4
      // 0c1: fload 5
      // 0c3: fload 6
      // 0c5: bipush 1
      // 0c6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aababa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 0c9: astore 10
      // 0cb: aload 10
      // 0cd: iload 3
      // 0ce: ifne 0da
      // 0d1: ifnull 0db
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: aload 10
      // 0da: areturn
      // 0db: aload 1
      // 0dc: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0df: invokevirtual net/minecraft/class_746.method_73189 ()Lnet/minecraft/class_243;
      // 0e2: fload 5
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbbb (Lnet/minecraft/class_243;F)[Lnet/minecraft/class_2338;
      // 0e7: astore 11
      // 0e9: aload 0
      // 0ea: iload 3
      // 0eb: ifne 149
      // 0ee: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0f1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0f4: checkcast java/lang/Boolean
      // 0f7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0fa: ifeq 148
      // 0fd: goto 101
      // 100: athrow
      // 101: aload 0
      // 102: aload 1
      // 103: aload 4
      // 105: aload 11
      // 107: fload 5
      // 109: fload 6
      // 10b: bipush 0
      // 10c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;[Lnet/minecraft/class_2338;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 10f: astore 12
      // 111: aload 12
      // 113: iload 3
      // 114: ifne 13d
      // 117: ifnull 122
      // 11a: goto 11e
      // 11d: athrow
      // 11e: aload 12
      // 120: areturn
      // 121: athrow
      // 122: aload 0
      // 123: iload 3
      // 124: ifne 149
      // 127: aload 0
      // 128: aload 1
      // 129: aload 4
      // 12b: aload 11
      // 12d: fload 5
      // 12f: fload 6
      // 131: invokedynamic get (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;[Lnet/minecraft/class_2338;FF)Ljava/util/function/Supplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbab (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;[Lnet/minecraft/class_2338;FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;, ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa; ]
      // 136: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaabbb (Ljava/util/function/Supplier;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 139: goto 13d
      // 13c: athrow
      // 13d: astore 13
      // 13f: aload 13
      // 141: ifnull 148
      // 144: aload 13
      // 146: areturn
      // 147: athrow
      // 148: aload 0
      // 149: aload 1
      // 14a: aload 4
      // 14c: aload 11
      // 14e: fload 5
      // 150: fload 6
      // 152: bipush 1
      // 153: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaabaa;[Lnet/minecraft/class_2338;FFZ)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 156: areturn
   }

   public void aababab(class_310 param1, class_1268 param2, class_3965 param3, class_1269 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -890736294
      // 003: istore 9
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 5
      // 00a: aload 0
      // 00b: iload 5
      // 00d: ifne 03e
      // 010: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaab I
      // 013: ldc_w -462442988
      // 016: iload 9
      // 018: ldc_w 1007010701
      // 01b: ixor
      // 01c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 01f: ldc2_w 5579952000272572156
      // 022: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 025: if_icmpne 02e
      // 028: goto 02c
      // 02b: athrow
      // 02c: return
      // 02d: athrow
      // 02e: aload 0
      // 02f: iload 5
      // 031: ifne 0e9
      // 034: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 037: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 03a: goto 03e
      // 03d: athrow
      // 03e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababaa;
      // 041: if_acmpne 0d2
      // 044: aload 0
      // 045: iload 5
      // 047: ifne 0e9
      // 04a: goto 04e
      // 04d: athrow
      // 04e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbaab ()Z
      // 051: ifeq 0d2
      // 054: goto 058
      // 057: athrow
      // 058: aload 0
      // 059: iload 5
      // 05b: ifne 0e9
      // 05e: goto 062
      // 061: athrow
      // 062: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 065: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 068: if_acmpne 0d2
      // 06b: goto 06f
      // 06e: athrow
      // 06f: aload 4
      // 071: iload 5
      // 073: ifne 083
      // 076: goto 07a
      // 079: athrow
      // 07a: ifnull 0d2
      // 07d: goto 081
      // 080: athrow
      // 081: aload 4
      // 083: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 088: ifeq 0d2
      // 08b: aload 1
      // 08c: iload 5
      // 08e: ifne 09d
      // 091: goto 095
      // 094: athrow
      // 095: ifnull 0d2
      // 098: goto 09c
      // 09b: athrow
      // 09c: aload 1
      // 09d: iload 5
      // 09f: ifne 0b1
      // 0a2: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a5: ifnull 0d2
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: aload 1
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: iload 5
      // 0b3: ifne 0c5
      // 0b6: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0b9: ifnull 0d2
      // 0bc: goto 0c0
      // 0bf: athrow
      // 0c0: aload 1
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c8: getfield net/minecraft/class_746.field_6012 I
      // 0cb: aload 0
      // 0cc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaab I
      // 0cf: if_icmpeq 0ee
      // 0d2: aload 0
      // 0d3: ldc_w -462442985
      // 0d6: iload 9
      // 0d8: ldc_w -1954816511
      // 0db: ixor
      // 0dc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 0df: ldc2_w 5579952000272572156
      // 0e2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 0e5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaab I
      // 0e8: aload 0
      // 0e9: aconst_null
      // 0ea: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaba Lnet/minecraft/class_3965;
      // 0ed: return
      // 0ee: aload 0
      // 0ef: iload 5
      // 0f1: ifne 103
      // 0f4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaba Lnet/minecraft/class_3965;
      // 0f7: ifnull 109
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: goto 103
      // 102: athrow
      // 103: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaba Lnet/minecraft/class_3965;
      // 106: goto 10a
      // 109: aload 3
      // 10a: astore 6
      // 10c: iload 5
      // 10e: aload 0
      // 10f: aload 1
      // 110: aload 6
      // 112: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaab (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Lnet/minecraft/class_2338;
      // 115: astore 7
      // 117: ifne 16b
      // 11a: aload 7
      // 11c: ifnull 150
      // 11f: goto 123
      // 122: athrow
      // 123: aload 0
      // 124: aload 7
      // 126: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaaa Lnet/minecraft/class_2338;
      // 129: aload 0
      // 12a: aload 1
      // 12b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 12e: getfield net/minecraft/class_746.field_6012 I
      // 131: ldc_w -462442986
      // 134: iload 9
      // 136: ldc_w 806000385
      // 139: ixor
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 13d: ldc2_w 3016763936821255191
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 143: iadd
      // 144: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baabb I
      // 147: aload 0
      // 148: aload 1
      // 149: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbbb (Lnet/minecraft/class_310;)V
      // 14c: goto 150
      // 14f: athrow
      // 150: aload 0
      // 151: ldc_w -462442999
      // 154: iload 9
      // 156: ldc_w 655163341
      // 159: ixor
      // 15a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 15d: ldc2_w 5579952000272572156
      // 160: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 163: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaab I
      // 166: aload 0
      // 167: aconst_null
      // 168: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaba Lnet/minecraft/class_3965;
      // 16b: goto 18e
      // 16e: astore 8
      // 170: aload 0
      // 171: ldc_w -462443000
      // 174: iload 9
      // 176: ldc_w 90289791
      // 179: ixor
      // 17a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 17d: ldc2_w 5579952000272572156
      // 180: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 183: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaab I
      // 186: aload 0
      // 187: aconst_null
      // 188: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaba Lnet/minecraft/class_3965;
      // 18b: aload 8
      // 18d: athrow
      // 18e: return
   }

   private void aababba(class_310 param1) {
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
      // 05: aload 1
      // 06: iload 2
      // 07: ifne 29
      // 0a: aload 0
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaa Lnet/minecraft/class_2338;
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 11: ifne 1f
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 1d: return
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 2
      // 21: ifne 7e
      // 24: aload 1
      // 25: goto 29
      // 28: athrow
      // 29: aload 0
      // 2a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 2d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 30: ifne 7d
      // 33: invokestatic java/lang/System.currentTimeMillis ()J
      // 36: lstore 3
      // 37: iload 2
      // 38: ifne 7c
      // 3b: lload 3
      // 3c: aload 0
      // 3d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbba J
      // 40: lsub
      // 41: ldc_w -462442997
      // 44: ldc_w 864940972
      // 47: ldc_w 104983106
      // 4a: ixor
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 4e: ldc2_w 5585212528119718299
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 54: lcmp
      // 55: ifgt 77
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 0
      // 5d: lload 3
      // 5e: ldc_w -462442998
      // 61: ldc_w 864940972
      // 64: ldc_w -143482566
      // 67: ixor
      // 68: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 6b: ldc2_w 6474695175696088868
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 71: ladd
      // 72: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 75: return
      // 76: athrow
      // 77: aload 0
      // 78: aload 1
      // 79: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 7c: return
      // 7d: aload 0
      // 7e: aload 0
      // 7f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 82: aload 1
      // 83: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // 86: return
   }

   private void aababbb(class_310 var1) {
      this.aaabb = null;
      this.ababab = false;
      this.ababba = null;
      this.bbbaa = null;
      this.aaaba(abbbabaaa.aba, var1);
   }

   private class_2338[] aabbaaa(class_3965 var1, class_2350 var2) {
      return ababb(var1, var2);
   }

   private boolean aabbaab(class_1799 param1) {
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
      // 09: ifnull 48
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 14: iload 2
      // 15: ifne 4d
      // 18: ifne 48
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 23: instanceof net/minecraft/class_1764
      // 26: iload 2
      // 27: ifne 4d
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifeq 48
      // 31: goto 35
      // 34: athrow
      // 35: aload 1
      // 36: iload 2
      // 37: ifne 55
      // 3a: goto 3e
      // 3d: athrow
      // 3e: invokestatic net/minecraft/class_1764.method_7781 (Lnet/minecraft/class_1799;)Z
      // 41: ifne 4e
      // 44: goto 48
      // 47: athrow
      // 48: bipush 0
      // 49: goto 4d
      // 4c: athrow
      // 4d: ireturn
      // 4e: aload 1
      // 4f: getstatic net/minecraft/class_9334.field_49649 Lnet/minecraft/class_9331;
      // 52: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 55: checkcast net/minecraft/class_9278
      // 58: astore 3
      // 59: aload 3
      // 5a: iload 2
      // 5b: ifne 6e
      // 5e: ifnull 8e
      // 61: goto 65
      // 64: athrow
      // 65: aload 3
      // 66: iload 2
      // 67: ifne 79
      // 6a: goto 6e
      // 6d: athrow
      // 6e: invokevirtual net/minecraft/class_9278.method_57442 ()Z
      // 71: ifne 8e
      // 74: aload 3
      // 75: goto 79
      // 78: athrow
      // 79: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
      // 7c: invokevirtual net/minecraft/class_9278.method_57438 (Lnet/minecraft/class_1792;)Z
      // 7f: iload 2
      // 80: ifne 8b
      // 83: ifne 8e
      // 86: goto 8a
      // 89: athrow
      // 8a: bipush 1
      // 8b: goto 8f
      // 8e: bipush 0
      // 8f: ireturn
   }

   private void aabbaba() {
      this.abba = false;
   }

   private boolean aabbabb(class_310 var1, class_3965 var2) {
      return this.abbaba(var1, this.aaab, var2);
   }

   private boolean aabbbaa(class_310 param1) {
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
      // 06: ifne 42
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 0f: if_acmpeq 41
      // 12: goto 16
      // 15: athrow
      // 16: aload 1
      // 17: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1a: getfield net/minecraft/class_746.field_6012 I
      // 1d: iload 2
      // 1e: ifne 35
      // 21: goto 25
      // 24: athrow
      // 25: aload 0
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaab I
      // 29: if_icmpgt 36
      // 2c: goto 30
      // 2f: athrow
      // 30: bipush 1
      // 31: goto 35
      // 34: athrow
      // 35: ireturn
      // 36: aload 0
      // 37: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbaab ()V
      // 3a: aload 0
      // 3b: invokestatic java/lang/System.currentTimeMillis ()J
      // 3e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 41: aload 0
      // 42: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb Z
      // 45: iload 2
      // 46: ifne 98
      // 49: ifeq 97
      // 4c: goto 50
      // 4f: athrow
      // 50: aload 1
      // 51: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 54: getfield net/minecraft/class_746.field_6012 I
      // 57: iload 2
      // 58: ifne 6f
      // 5b: goto 5f
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaa I
      // 63: if_icmpgt 70
      // 66: goto 6a
      // 69: athrow
      // 6a: bipush 1
      // 6b: goto 6f
      // 6e: athrow
      // 6f: ireturn
      // 70: aload 0
      // 71: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbba ()V
      // 74: aload 0
      // 75: bipush 0
      // 76: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb Z
      // 79: aload 0
      // 7a: ldc_w -462442995
      // 7d: ldc_w -341471351
      // 80: ldc_w 1502961625
      // 83: ixor
      // 84: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 87: ldc2_w 5579952000272572156
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 8d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaa I
      // 90: aload 0
      // 91: invokestatic java/lang/System.currentTimeMillis ()J
      // 94: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 97: bipush 0
      // 98: ireturn
   }

   private static class_2338[] aabbbab(int var0) {
      return new class_2338[var0];
   }

   @Override
   public boolean abbabaa(class_310 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abba Z
      // 08: iload 2
      // 09: ifne 27
      // 0c: ifne 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaaa Z
      // 17: iload 2
      // 18: ifne 27
      // 1b: goto 1f
      // 1e: athrow
      // 1f: ifeq 2a
      // 22: goto 26
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: ireturn
   }

   private double aabbbba(class_243 param1, class_243 param2, class_243 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 13
      // 0b: ifnull 2c
      // 0e: goto 12
      // 11: athrow
      // 12: aload 2
      // 13: iload 4
      // 15: ifne 20
      // 18: ifnull 2c
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 3
      // 20: iload 4
      // 22: ifne 36
      // 25: ifnonnull 31
      // 28: goto 2c
      // 2b: athrow
      // 2c: ldc2_w Infinity
      // 2f: dreturn
      // 30: athrow
      // 31: aload 2
      // 32: aload 1
      // 33: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 36: astore 5
      // 38: aload 5
      // 3a: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 3d: dstore 6
      // 3f: dload 6
      // 41: iload 4
      // 43: ifne 65
      // 46: ldc2_w 1.0E-7
      // 49: dcmpg
      // 4a: ifge 58
      // 4d: goto 51
      // 50: athrow
      // 51: aload 1
      // 52: aload 3
      // 53: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 56: dreturn
      // 57: athrow
      // 58: aload 3
      // 59: aload 1
      // 5a: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 5d: aload 5
      // 5f: invokevirtual net/minecraft/class_243.method_1026 (Lnet/minecraft/class_243;)D
      // 62: dload 6
      // 64: ddiv
      // 65: dstore 8
      // 67: dconst_0
      // 68: dconst_1
      // 69: dload 8
      // 6b: invokestatic java/lang/Math.min (DD)D
      // 6e: invokestatic java/lang/Math.max (DD)D
      // 71: dstore 8
      // 73: aload 1
      // 74: aload 5
      // 76: dload 8
      // 78: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 7b: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 7e: aload 3
      // 7f: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 82: dreturn
   }

   private void aabbbbb(class_310 param1) {
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
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 0c: ifnull 21
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 1b: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 1e: goto 22
      // 21: aconst_null
      // 22: astore 3
      // 23: iload 2
      // 24: ifne 98
      // 27: aload 3
      // 28: ifnull 93
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 2
      // 31: ifne 94
      // 34: goto 38
      // 37: athrow
      // 38: aload 1
      // 39: aload 3
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbbab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 3d: ifeq 93
      // 40: goto 44
      // 43: athrow
      // 44: aload 0
      // 45: aload 3
      // 46: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 49: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 4c: iload 2
      // 4d: aload 0
      // 4e: bipush 0
      // 4f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 52: aload 0
      // 53: aconst_null
      // 54: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 57: aload 0
      // 58: aconst_null
      // 59: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 5c: aload 1
      // 5d: aload 0
      // 5e: aload 0
      // 5f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 62: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbbaa (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 68: astore 4
      // 6a: ifne 92
      // 6d: aload 4
      // 6f: ifnull 8a
      // 72: goto 76
      // 75: athrow
      // 76: aload 0
      // 77: aload 4
      // 79: bipush 0
      // 7a: faload
      // 7b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baab F
      // 7e: aload 0
      // 7f: aload 4
      // 81: bipush 1
      // 82: faload
      // 83: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbb F
      // 86: goto 8a
      // 89: athrow
      // 8a: aload 0
      // 8b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 8e: aload 1
      // 8f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // 92: return
      // 93: aload 0
      // 94: aload 1
      // 95: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabaab (Lnet/minecraft/class_310;)V
      // 98: return
   }

   private boolean abaaaaa(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 45
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 45
      // 17: aload 2
      // 18: ifnull 45
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 23: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 26: aload 0
      // 27: aload 2
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 2b: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 2e: ldc2_w 20.25
      // 31: dcmpg
      // 32: iload 3
      // 33: ifne 42
      // 36: goto 3a
      // 39: athrow
      // 3a: ifgt 45
      // 3d: goto 41
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   private void abaaaab() {
      this.bbbbaab();
      this.bbabb = System.currentTimeMillis() + babb(a(-462442996, -818105545 ^ 1232933075), 6474695175696088868L);
   }

   private boolean abaaaba(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 71
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 71
      // 17: aload 2
      // 18: ifnull 71
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 23: aload 2
      // 24: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 27: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 2a: iload 3
      // 2b: ifne 6e
      // 2e: goto 32
      // 31: athrow
      // 32: ifne 6d
      // 35: goto 39
      // 38: athrow
      // 39: aload 1
      // 3a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3d: aload 2
      // 3e: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 41: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 44: iload 3
      // 45: ifne 6e
      // 48: goto 4c
      // 4b: athrow
      // 4c: ifne 6d
      // 4f: goto 53
      // 52: athrow
      // 53: aload 1
      // 54: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 57: aload 2
      // 58: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 5b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.ababaa (Lnet/minecraft/class_2680;)Z
      // 5e: iload 3
      // 5f: ifne 6e
      // 62: goto 66
      // 65: athrow
      // 66: ifeq 71
      // 69: goto 6d
      // 6c: athrow
      // 6d: bipush 1
      // 6e: goto 72
      // 71: bipush 0
      // 72: ireturn
   }

   private boolean abaaabb(class_310 param1, class_243 param2, class_2338 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 13
      // 0b: ifnull 3d
      // 0e: goto 12
      // 11: athrow
      // 12: aload 1
      // 13: iload 4
      // 15: ifne 27
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: ifnull 3d
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: goto 27
      // 26: athrow
      // 27: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2a: ifnull 3d
      // 2d: aload 2
      // 2e: ifnull 3d
      // 31: goto 35
      // 34: athrow
      // 35: aload 3
      // 36: ifnonnull 40
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: athrow
      // 40: aload 1
      // 41: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 44: new net/minecraft/class_3959
      // 47: dup
      // 48: aload 1
      // 49: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4c: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 4f: aload 2
      // 50: getstatic net/minecraft/class_3959$class_3960.field_17559 Lnet/minecraft/class_3959$class_3960;
      // 53: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 56: aload 1
      // 57: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5a: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 5d: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 60: astore 5
      // 62: aload 5
      // 64: iload 4
      // 66: ifne 72
      // 69: ifnull 89
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 5
      // 72: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 75: aload 3
      // 76: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 79: iload 4
      // 7b: ifne 86
      // 7e: ifeq 89
      // 81: goto 85
      // 84: athrow
      // 85: bipush 1
      // 86: goto 8a
      // 89: bipush 0
      // 8a: ireturn
   }

   @Override
   public boolean bbbabba() {
      return this.bbbaaba();
   }

   private static double[] abaabaa(class_243 param0, class_2338 param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 004: i2d
      // 005: ldc2_w 0.08
      // 008: dsub
      // 009: dstore 5
      // 00b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 00e: aload 1
      // 00f: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 012: i2d
      // 013: dconst_1
      // 014: dadd
      // 015: ldc2_w 0.08
      // 018: dadd
      // 019: dstore 7
      // 01b: aload 1
      // 01c: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 01f: i2d
      // 020: ldc2_w 0.08
      // 023: dsub
      // 024: dstore 9
      // 026: aload 1
      // 027: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 02a: i2d
      // 02b: dconst_1
      // 02c: dadd
      // 02d: ldc2_w 0.08
      // 030: dadd
      // 031: dstore 11
      // 033: istore 4
      // 035: aload 0
      // 036: getfield net/minecraft/class_243.field_1352 D
      // 039: dload 5
      // 03b: iload 4
      // 03d: ifne 0ba
      // 040: dcmpl
      // 041: iflt 09e
      // 044: goto 048
      // 047: athrow
      // 048: aload 0
      // 049: getfield net/minecraft/class_243.field_1352 D
      // 04c: dload 7
      // 04e: iload 4
      // 050: ifne 0ba
      // 053: goto 057
      // 056: athrow
      // 057: dcmpg
      // 058: ifgt 09e
      // 05b: goto 05f
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield net/minecraft/class_243.field_1350 D
      // 063: dload 9
      // 065: iload 4
      // 067: ifne 0ba
      // 06a: goto 06e
      // 06d: athrow
      // 06e: dcmpl
      // 06f: iflt 09e
      // 072: goto 076
      // 075: athrow
      // 076: aload 0
      // 077: getfield net/minecraft/class_243.field_1350 D
      // 07a: dload 11
      // 07c: iload 4
      // 07e: ifne 0ba
      // 081: goto 085
      // 084: athrow
      // 085: dcmpg
      // 086: ifgt 09e
      // 089: goto 08d
      // 08c: athrow
      // 08d: bipush 2
      // 08e: newarray 7
      // 090: dup
      // 091: bipush 0
      // 092: ldc2_w -180.0
      // 095: dastore
      // 096: dup
      // 097: bipush 1
      // 098: ldc2_w 180.0
      // 09b: dastore
      // 09c: areturn
      // 09d: athrow
      // 09e: aload 1
      // 09f: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0a2: i2d
      // 0a3: ldc2_w 0.5
      // 0a6: dadd
      // 0a7: aload 0
      // 0a8: getfield net/minecraft/class_243.field_1350 D
      // 0ab: dsub
      // 0ac: aload 1
      // 0ad: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0b0: i2d
      // 0b1: ldc2_w 0.5
      // 0b4: dadd
      // 0b5: aload 0
      // 0b6: getfield net/minecraft/class_243.field_1352 D
      // 0b9: dsub
      // 0ba: invokestatic java/lang/Math.atan2 (DD)D
      // 0bd: invokestatic java/lang/Math.toDegrees (D)D
      // 0c0: dstore 13
      // 0c2: dload 13
      // 0c4: dload 2
      // 0c5: dsub
      // 0c6: invokestatic net/minecraft/class_3532.method_15338 (D)D
      // 0c9: dstore 15
      // 0cb: ldc2_w Infinity
      // 0ce: dstore 17
      // 0d0: ldc2_w -Infinity
      // 0d3: dstore 19
      // 0d5: bipush 2
      // 0d6: newarray 7
      // 0d8: dup
      // 0d9: bipush 0
      // 0da: dload 5
      // 0dc: dastore
      // 0dd: dup
      // 0de: bipush 1
      // 0df: dload 7
      // 0e1: dastore
      // 0e2: astore 21
      // 0e4: aload 21
      // 0e6: arraylength
      // 0e7: istore 22
      // 0e9: bipush 0
      // 0ea: istore 23
      // 0ec: iload 23
      // 0ee: iload 22
      // 0f0: if_icmpge 16e
      // 0f3: aload 21
      // 0f5: iload 23
      // 0f7: daload
      // 0f8: dstore 24
      // 0fa: bipush 2
      // 0fb: newarray 7
      // 0fd: dup
      // 0fe: iload 4
      // 100: ifne 177
      // 103: bipush 0
      // 104: dload 9
      // 106: dastore
      // 107: dup
      // 108: bipush 1
      // 109: dload 11
      // 10b: dastore
      // 10c: astore 26
      // 10e: aload 26
      // 110: arraylength
      // 111: istore 27
      // 113: bipush 0
      // 114: istore 28
      // 116: iload 28
      // 118: iload 27
      // 11a: if_icmpge 166
      // 11d: aload 26
      // 11f: iload 28
      // 121: daload
      // 122: dstore 29
      // 124: dload 29
      // 126: aload 0
      // 127: getfield net/minecraft/class_243.field_1350 D
      // 12a: dsub
      // 12b: dload 24
      // 12d: aload 0
      // 12e: getfield net/minecraft/class_243.field_1352 D
      // 131: dsub
      // 132: invokestatic java/lang/Math.atan2 (DD)D
      // 135: invokestatic java/lang/Math.toDegrees (D)D
      // 138: dstore 31
      // 13a: dload 15
      // 13c: dload 31
      // 13e: dload 13
      // 140: dsub
      // 141: invokestatic net/minecraft/class_3532.method_15338 (D)D
      // 144: dadd
      // 145: iload 4
      // 147: ifne 0f8
      // 14a: dstore 33
      // 14c: iload 4
      // 14e: dload 17
      // 150: dload 33
      // 152: invokestatic java/lang/Math.min (DD)D
      // 155: dstore 17
      // 157: dload 19
      // 159: dload 33
      // 15b: invokestatic java/lang/Math.max (DD)D
      // 15e: dstore 19
      // 160: iinc 28 1
      // 163: ifeq 116
      // 166: iinc 23 1
      // 169: iload 4
      // 16b: ifeq 0ec
      // 16e: bipush 2
      // 16f: newarray 7
      // 171: dup
      // 172: bipush 0
      // 173: dload 17
      // 175: dastore
      // 176: dup
      // 177: bipush 1
      // 178: dload 19
      // 17a: dastore
      // 17b: areturn
   }

   private class_3965 abaabab(class_310 param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 13
      // 0b: ifnull 22
      // 0e: goto 12
      // 11: athrow
      // 12: aload 1
      // 13: iload 4
      // 15: ifne 26
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: ifnonnull 25
      // 1e: goto 22
      // 21: athrow
      // 22: aconst_null
      // 23: areturn
      // 24: athrow
      // 25: aload 1
      // 26: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 29: astore 5
      // 2b: aload 5
      // 2d: iload 4
      // 2f: ifne 42
      // 32: instanceof net/minecraft/class_3965
      // 35: ifeq 62
      // 38: goto 3c
      // 3b: athrow
      // 3c: aload 5
      // 3e: goto 42
      // 41: athrow
      // 42: checkcast net/minecraft/class_3965
      // 45: astore 6
      // 47: aload 6
      // 49: iload 4
      // 4b: ifne 61
      // 4e: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 51: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 54: if_acmpne 62
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 6
      // 5d: goto 61
      // 60: athrow
      // 61: areturn
      // 62: aload 1
      // 63: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 66: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 69: astore 6
      // 6b: aload 0
      // 6c: fload 2
      // 6d: fload 3
      // 6e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabab (FF)Lnet/minecraft/class_243;
      // 71: astore 7
      // 73: aload 0
      // 74: aload 1
      // 75: aload 6
      // 77: aload 6
      // 79: aload 7
      // 7b: ldc2_w 4.5
      // 7e: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 81: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 84: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_3965;
      // 87: astore 8
      // 89: aload 0
      // 8a: aload 8
      // 8c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbbb (Lnet/minecraft/class_3965;)Z
      // 8f: ifeq 98
      // 92: aload 8
      // 94: goto 99
      // 97: athrow
      // 98: aconst_null
      // 99: areturn
   }

   @Override
   public void abaab() {
      this.abba = false;
      this.aaaaaa = false;
      this.aabba();
      this.abb();
      this.bbaba.babbbb();
   }

   private boolean abaabba(class_1661 param1, int param2, aaabaaaaa param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: ifnull 46
      // 09: iload 2
      // 0a: iload 4
      // 0c: ifne 4b
      // 0f: goto 13
      // 12: athrow
      // 13: iflt 46
      // 16: goto 1a
      // 19: athrow
      // 1a: iload 2
      // 1b: iload 4
      // 1d: ifne 4b
      // 20: goto 24
      // 23: athrow
      // 24: ldc_w -462442993
      // 27: ldc_w -862060442
      // 2a: ldc_w -129033563
      // 2d: ixor
      // 2e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 31: ldc2_w 7050441791445182372
      // 34: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 37: if_icmpge 46
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 3
      // 3f: ifnonnull 4c
      // 42: goto 46
      // 45: athrow
      // 46: bipush 0
      // 47: goto 4b
      // 4a: athrow
      // 4b: ireturn
      // 4c: aload 1
      // 4d: iload 2
      // 4e: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 51: astore 5
      // 53: aload 3
      // 54: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 57: if_acmpne 66
      // 5a: aload 5
      // 5c: getstatic net/minecraft/class_1802.field_8884 Lnet/minecraft/class_1792;
      // 5f: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 62: goto 6e
      // 65: athrow
      // 66: aload 5
      // 68: getstatic net/minecraft/class_1802.field_8187 Lnet/minecraft/class_1792;
      // 6b: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 6e: ireturn
   }

   private baabbabb abaabbb(class_1661 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: aload 1
      // 05: getstatic net/minecraft/class_1802.field_8884 Lnet/minecraft/class_1792;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbab (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 0b: istore 3
      // 0c: istore 2
      // 0d: aload 0
      // 0e: aload 1
      // 0f: getstatic net/minecraft/class_1802.field_8187 Lnet/minecraft/class_1792;
      // 12: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbab (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 15: istore 4
      // 17: aload 0
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 1e: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaab
      // 21: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbaab.ordinal ()I
      // 24: iload 2
      // 25: ifne 81
      // 28: tableswitch 29 0 2 40 63 88
      // 44: athrow
      // 45: new java/lang/MatchException
      // 48: dup
      // 49: aconst_null
      // 4a: aconst_null
      // 4b: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 4e: athrow
      // 4f: athrow
      // 50: iload 3
      // 51: ifge 59
      // 54: aconst_null
      // 55: goto b1
      // 58: athrow
      // 59: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb
      // 5c: dup
      // 5d: iload 3
      // 5e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 61: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb.<init> (ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;)V
      // 64: goto b1
      // 67: iload 4
      // 69: ifge 71
      // 6c: aconst_null
      // 6d: goto b1
      // 70: athrow
      // 71: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb
      // 74: dup
      // 75: iload 4
      // 77: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 7a: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb.<init> (ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;)V
      // 7d: goto b1
      // 80: iload 3
      // 81: iload 2
      // 82: ifne 9d
      // 85: iflt 9b
      // 88: goto 8c
      // 8b: athrow
      // 8c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb
      // 8f: dup
      // 90: iload 3
      // 91: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // 94: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb.<init> (ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;)V
      // 97: goto b1
      // 9a: athrow
      // 9b: iload 4
      // 9d: ifge a5
      // a0: aconst_null
      // a1: goto b1
      // a4: athrow
      // a5: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb
      // a8: dup
      // a9: iload 4
      // ab: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;
      // ae: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbabb.<init> (ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaaaa;)V
      // b1: areturn
   }

   private boolean ababaaa(class_310 param1) {
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
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 31
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 0
      // 23: iload 2
      // 24: ifne 46
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbbab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 2d: goto 31
      // 30: athrow
      // 31: checkcast java/lang/Boolean
      // 34: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 37: ifne 45
      // 3a: aload 1
      // 3b: aload 0
      // 3c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 3f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 42: bipush 1
      // 43: ireturn
      // 44: athrow
      // 45: aload 0
      // 46: iload 2
      // 47: ifne 59
      // 4a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // 4d: iflt b1
      // 50: goto 54
      // 53: athrow
      // 54: aload 0
      // 55: goto 59
      // 58: athrow
      // 59: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // 5c: iload 2
      // 5d: ifne 91
      // 60: ldc_w -462442994
      // 63: ldc_w 1625770215
      // 66: ldc_w 210196619
      // 69: ixor
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 6d: ldc2_w 7050441791445182372
      // 70: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 73: if_icmpge b1
      // 76: goto 7a
      // 79: athrow
      // 7a: aload 1
      // 7b: aload 0
      // 7c: aload 0
      // 7d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaaabaa (Lnet/minecraft/class_310;Ljava/lang/Object;I)V
      // 83: aload 1
      // 84: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 87: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 8d: goto 91
      // 90: athrow
      // 91: iload 2
      // 92: ifne be
      // 95: aload 0
      // 96: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // 99: if_icmpeq bd
      // 9c: goto a0
      // 9f: athrow
      // a0: aload 1
      // a1: aload 0
      // a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba I
      // a5: bipush 1
      // a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbab (Lnet/minecraft/class_310;II)V
      // a9: iload 2
      // aa: ifeq bd
      // ad: goto b1
      // b0: athrow
      // b1: aload 1
      // b2: aload 0
      // b3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // b9: goto bd
      // bc: athrow
      // bd: bipush 1
      // be: ireturn
   }

   private boolean ababaab(class_310 param1, class_2338 param2, class_2338 param3) {
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
      // 06: aload 1
      // 07: aload 2
      // 08: iload 4
      // 0a: ifne 23
      // 0d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbbab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 10: ifeq 43
      // 13: goto 17
      // 16: athrow
      // 17: aload 0
      // 18: aload 1
      // 19: aload 3
      // 1a: iload 4
      // 1c: ifne 30
      // 1f: goto 23
      // 22: athrow
      // 23: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 26: ifeq 43
      // 29: aload 0
      // 2a: aload 1
      // 2b: aload 3
      // 2c: goto 30
      // 2f: athrow
      // 30: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 33: iload 4
      // 35: ifne 40
      // 38: ifeq 43
      // 3b: goto 3f
      // 3e: athrow
      // 3f: bipush 1
      // 40: goto 44
      // 43: bipush 0
      // 44: ireturn
   }

   private boolean abababa(class_1799 param1) {
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
      // 06: ifne 19
      // 09: ifnull 39
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: goto 19
      // 18: athrow
      // 19: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 1c: ifne 39
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
      // 27: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 2a: iload 2
      // 2b: ifne 36
      // 2e: ifeq 39
      // 31: goto 35
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   private boolean abababb(class_3965 param1) {
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
      // 06: ifne 19
      // 09: aload 1
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabbbb (Lnet/minecraft/class_3965;)Z
      // 0d: ifeq 45
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: goto 19
      // 18: athrow
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 1c: iload 2
      // 1d: ifne 2f
      // 20: ifnull 41
      // 23: goto 27
      // 26: athrow
      // 27: aload 1
      // 28: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababba Lnet/minecraft/class_2338;
      // 33: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 36: iload 2
      // 37: ifne 42
      // 3a: ifne 45
      // 3d: goto 41
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var40 = 2764086;
      char[] var31 = "粆緉絰緪緰緪綸緪緰緪".toCharArray();
      short var29 = 32224;
      byte var36 = -1;
      String var30 = "≢⋆∿⋄⋸⋆∜⋒≇≬⊗⋗⊜≺⊌≶⋋⋽⊠∬≖∣⋪∺⊪≸⊥≧⋓≧∨⊹⊬⋽≿⊔≠∟⋺∅⊤⋓⊾⊋≊⊼⊾⊊∓⋑≗∳∠⊠≒≭≒∹≚⋷≮⋌⋌⊔⋝⊛∵⋳≮≁≓⋝≆⋨≒≥⋴⋌≁⋶∀⊫∌⋧∼∧≹⋟∡≖⊇∤⋟≁∠⋢≕∴≞∽∎∊⊨⋌⊨⋛⊱∱⋆⊍⊸≼⋘⋵⊻∗≟⊼≳⊈∩∆⊞∧⊳⋲⋴∅∡≯⋤⊸≼⋁⊸≲∛⊸⋝⊗∰≽⋪∯−⊨⋂⊹≦≂∝∦⋟⋾≩≃⊠⊸∸∴⋏∧≶⊩⋒⊕∨∤⋖≸⊐⋃≭⋄⊜⊎∋≩≊⋰⊈⋸⊇⊶⋁⊎≫⋯≻⋯⋓⊮⊿≃⊄⊬⊻∱∼≡⋶∭≵∭⋓⋣⋵⋽∗∈⊧⋲∬⋚≞⋻∎∾⋏≝∁⋃≍≡≚⋮⊥⊱≹∛≋∅⋃⊂⋽≇≂≌∯∴≟⋽≸≁⋵≕≆∁∯⊮⋼∃⋝∻⊽⊖⊶≙∌⊈⊫⋜∀⋛⊇∣≕≐≓≽∷⋴≪⋩≞∐≀∙≰∋∿⋥⊱⊡∮≎⋰⋸⊉⊙⋂∨≣⊀⊖∃⊹∾⋬⊜⊮⋄⋼⋄⊐⊕≘≪⋧∱≹≝⊨≓⋷≶≎⋅∊⊅⋁≦∳⊽⋡≊∼∊⋑⋀⊧⋜≝∬⋃∷⋢≾⋾⋖∠⊔⊺∤∍⋈⊽⋻⋛⋍⋀⊮∱≡⊈⋕≷⊸썍썁쌤썔썻썫쌤썖썌쎟쎹쌰쎹쌚썯썂쌝쏝썱썽쎊쏏쎦썕쎪썣쏵썃쌴썙썺쌬쌹썰쎲썮쌔쎶쏰쌖쏲\uf360\uf347\uf3a2\uf3f6\uf312\uf3da\uf336\uf307\uf38d\uf3e7\uf345\uf394\uf367\uf3d1\uf30f\uf3b6\uf362\uf359\uf3c3\uf3a8\uf306\uf34c\uf3e6\uf35a\uf356\uf37c\uf3f6\uf3cd\uf3b5\uf3de\uf33e\uf362\uf3e2\uf35d\uf397\uf343\uf39f\uf392\uf3bc\uf30e\uf33b\uf31d\uf3a0\uf37c\uf39d\uf399\uf3ec\uf38d\uf31b\uf3ea\uf30a\uf379\uf310\uf364\uf371\uf3ad\uf3d5\uf34f\uf39c\uf357\uf305\uf388\uf380\uf34c\uf35c\uf315\uf3c3\uf3e3\uf39d\uf3bd\uf3bf\uf35d\uf367\uf3bd\uf37c\uf3f3\uf3ca\uf37c\uf3a5\uf336\uf353\uf37f\uf31a\uf333\uf34b\uf391\uf380\uf3ff\uf344\uf304\uf32a\uf334\uf376\uf315\uf3aa\uf37b\uf337\uf30e\uf3ce\uf31d\uf3f5\uf305\uf3b3\uf396\uf328\uf391\uf34e\uf30b\uf319\uf3c7\uf356\uf3e4\uf319\uf3c3\uf3e8\uf348\uf39e\uf31f\uf37c\uf32e\uf3b9\uf39c\uf352\uf3ff\uf380\uf325\uf3f0\uf399\uf397\uf3c6\uf346\uf3a7\uf39b\uf35d\uf39a\uf3ba\uf333\uf3db\uf33c\uf3e4\uf304\uf3ce\uf31c\uf3fc䫭䫹䩥䩱䨿䩹䨌䩡䨟䨏↸⇰←↟ℰ⅞⇽⅔ⅱ⇡⅟⇺⇣⇠ℚℾܰܤ\u07b8ެߢޤߑ\u07bc߂ߒ㞿㜨㞈㞹㝓㝓㟍㝸㝾㞦㝆㟡㝽㜠㞾㜛㞵㝓㟏㟜㝂㞅㝞㞷㞼㟱㟊㞘㟕㞭㝿㟃㞾㝡㟧㝧㝤㜛㜾㞀㟍㟺㞜㝉㟰㞥㟎㝮㜉㝘㞱㞓㞬㟠㝁㝂㟭㜤㞊㜜㝀㟲㟵㞐㜇㜹㜽㝧㜂㜰㝅㟽㜖㝡㜻㟫㝇㜈㝌㟦㝛㟦㞏㟭㝼㝻㜢㟮\u2428\u243c⒠⒴⓺ⒼⓉ⒤ⓚⓊ珐猩珨獡玖珿玞珜猵珂獇玆珛獲猙猪鰱鰥鲹鲭鳣鲥鳐鲽鳃鳓";
      String[] var32 = new String[var31.length];

      while (true) {
         int var33 = 0;
         int var34 = 0;
         int var35 = 0;
         if (var36 == 0) {
            baaaba = var32;
            baaabb = new Object[var32.length];
            int var25 = -1848427027;
            byte[] var23 = "\u0001/B$ß8\u0088ùâF·\u0005\u009aþÉp|o¾rm\t\u0019\u009a3È\u0007ç\u0000¸§Úr ó3Ê\u0093\u008b\u0084\u008fï\u001eÂ\u0000Û,\u0087\u001acÚýß5Ii\u008bµfæ\u0001\u0097â^\u009eÁ\u000e9¨ÔÀºAèt\u0086@ÉÃA:ÂoÕ«^l\u0098\u001an\u0093¸Ö§ Dÿ\u0017³\u0081]8ø6í={Ñ\u0093ÁHH\u001fÞÛ}\u0089õ\u001d5\u009f¼³l÷a·ü\u0091\u008c\u008cd¯é\u008d\u0019\\\u0016Ðo»v\u009aiþ\u0083\u0019zäõÚþ\nÚï\u008eþ/\u008e_õsI§cÎ2\u0081\u0084\u001bå\b\u0089È\u0090\u0093¸M7\u009cx\u0002!\u0087²´º:Mi\u008f\u001bÉF`³ÿÂ|YùKb+ÒÄl,sQe\u0010ÚÌÓ\\Öy£sï\u0089¼{X¤D¼Gó\b<äº)P¦ì\u0006Û¥\u0092ûÕ^>ñ\u0087Z8<ò\u0003 ½\u000b³o±l{2¾Ú\u0007ò½öj\n¦ÿ»Õx3¤ÔE\u0016\u0001\u001f\u008d\u0082Á¥\u009b«m\u009fÔÂ*=H¶ùä\u00ad\u0001x¦®\u009cò¼3|sÃ¹)íæÙQM\u008d¶Ã>\u0090e0ÄÕ|üµJF\u0083¤w§Ò\u0083»¬k[¼Ãêw#è_\u0083@¦C\f\u0097\u0094\u0013éüÂ_\u008f6\u007fÛ¦Ì\u0011\u0097ÀË\u0084z\tõüð¶Ô-]pÐo´Å\u0088çö\tw·o\u0005Ë_UÍú\u0087-sâÏÞ\u0095úb\u0019ËL\u0095\u0003\u008b\u0081Z<¶ká\u009dÁ\rÙRxÑzÿAö?IXªÏØS&O\u007fÉ\u0086Y>\u0010\u0090\u001bØM\u0095A\u0019±»\u008c\u00ad;\u009e¢£Òó+¸]ãeÙZwxÖñ¥\u0095\u0011dì7\u0081m¾ª©àÃ^ PÜáüïdù'HiCÝ\u0087H\u0087¶L\u00ad\"D!z{Ü\u0080g¢eýr9 âB\n\u0096ûtXû\u0012Ý\u0088µ\u008e2XéîZv\u0016\u0083&¡\u0090ïD\u0090#\"?¾*»\u009eY\u00ad\u0005Y\u0007ùy«&\t\u0083PZ=4.G²\u008f_\bV\u0098Yf`º4/Ó@q-H±B¤ÈÇ\u008d8£óüU¼Al;\u007f\u0019Ý1Ñu,\u009cÞXÌ\u0096üõ©\u0002\u00053L>\u0015\npßKðÛ\u001f\u009aR\u009b|³^\u0096iÂP\u0085æ\u0081nW©æè\u009fyÐ-ªtÜ\b5g}ðÇèêKëY¼²\u001f¦\u0081\u007f¸½l\u000bÄßlæ\u0094Þxü÷Ùûé4OîAoÙ4\u0004\u0098sB´ÒWÊð\u0000WÔú¼G<qebËü\u00adv g.\u000bª\u001f+åLÒæ:n\u008cé^\u0005NGØLÜ\u009dº!\u0085\u0001^\u001c\b0I#\u008açedÕÖ\\\u0006(}\u0090x\u0007©l\fÛ^#\u0091¸Íj@ð=\u0080Àm¯\u0003j¥9D:M\u0084bã£\u009a^\n@\\«î·\u0019e½Áó¯ÊäôÞxG\fëtµî±ka\u0093øÏ{\u009c\u007f\u00012ãcn´öI=\u0005v^^\u0081:g|V¨Mp\u0093¯Ç¿4úó\u008dåä2\u009a$\u0096×½·Èq\u0083\u009c\u001eBv\u0087\u0014\u0096±\n\u001e~Ýw¢l3úT\u0085~-I[\u008dlj§\u0087\u000eH\u0001Å íÓ¸é=ý®mÍús2DEÃ¾\n\u0082r\u001dØéh\u0010ôé\u0096&#\u008e\u0096\u0081)Ïý\u0090¯\u0002ÿñr\u007f#\bêç\u0012À\u007fHí>\u008dí\u0003õ\u0091\u0091+¦*·µwP\u0085ß à Ç~\u0096ÖàQåb¸\u0010âµgxÛ¾8`U2ë\u0084l\u000f,¤\u0098\u0014«\u0088\u0013¾ºyÐ\u009c\u0086v¬HeeÁ+öð\u0015/ü1n³\u0088\b\u008a ¾\u009cø2`SEbôæØ\u0019.÷\u0001\u0083ÊÚP\rr\u0005ºäð´èÞdò\u00178õè\u0010~}ë\u0080÷Rý\u009c½U\u0085\"(BÂç\u0090\u0082\u0003¼\b\u008f\u000bÍÎ¥¬\u0093$ìÒ\u0097ÓàZ¸S1'éÛ>RÍ\u0099óÛlehM¬fô\u0011Á®ø\u0094\u008egØ@Ë\u0088õ¶±wÛ\u0097\nâ×ÖÓ\tN\u0094%= x¦4õ\u0095Á?Qðe~Mß¼ùâ\u0088ï\u0015¥ZÎ©QAýá¤+ÆJá\u0095vÏ\u0099\ríÍ\u001fY\u0091fA[-×}d&ã\u001aÌj\u009aiì(\u001bóf·\u008dXì~F¬\u007fÅ* \u009aWªÝý\u0006ìlx¾\u0017\"w³7Å\"\u008bJ\u0007\u0086\u0098û*£{\u0010î\u0096Ü\u0090Ï\u0090Ã \u001cW\u007fñØ\u000f¬Kz¶´Än\u008b\u0082sõ\u0011d8\u0089k}=\u001e!Ã\u008f\u0089Ü?Ã~\u0087`Ð®L\u0085I>I\u009d\u0088\u0080QB!7\u0087D¼XFd~\u0013½±w¬Hak:Ä\u009fÛ\u0012\u0097(\u0099®\u008b\u0010¶Ë\u0099O\"\u0080\u0093Î\u009e²»Õ\u009a{Æaµµñ\u00ad\n3\u0006R\u001bB\u0005¾úÍÞzú:iM¸\u008fgïäµÐ\u0093ñ/\u0006*M\f\u009cÙKü2a¾CÓe{æ\u009b\u0090°¿\u0091<ÃbÈL\u008c{\u00ad<Ç\u0013¸~\u0099\u001b\u0094É1þÝ\u009fÐ°tà`\u0092ê/ÇV\të\u0002ä\u009fâ¡ÐíÃéyW_{Ì&Q1ò=©4\u00142ãhb.È÷TñØÚ\u0083ÚP:A\u0098\u000f\u0005oL\u0017¹ÕP\u00adw ºà-\u0084ðgHßí*ñ¢h\rûÐ]¨Ä\u00885£ÝØÝ\u0095Ä\u0084ïaaFÞY²6:´h¹P§ð\u0015X÷Àác^ÅlSN½\u009eÓ5Ã/\u000b\fÌùú2i\u001dä ãìÿª\u0092í\u0086{\u008dp ;{íº¼ö.\u001aEp\u007f\\!z«÷9Ú\\\u0003\u0019\u009c×d¹\u009dN\u0084\tø?\u0090d\u009a\u008bÀà5eÆ:\u0082N\u008ea=\bgÞ\u0094\u0087\u001d÷®¨&yÅSqC\u0086kv/\u0010Ã\u0096\u001b¥¨Ða&Ïd\u0097y\u0010\u00004AöTP\u009c\u001fÆ4±DôQ\u0005ÅLáá\u0090y¡g\u008a"
               .getBytes("ISO-8859-1");
            int var24 = var23.length / 4;
            baaaab = new int[var24];
            byte var26 = 0;
            int var27 = 0;

            do {
               int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
               var28 ^= var25;
               baaaab[var27] = var28;
               var26 += 4;
            } while (++var27 < var24);

            String[] var21 = new String[a(-462442790, var40 ^ 530393366)];
            int var19 = 0;
            String var18;
            int var20 = (var18 = aaaaabba(1201985770, var40 ^ -1460125877)).length();
            int var17 = a(-462442787, var40 ^ -834472898);
            int var44 = -1;

            label141:
            while (true) {
               String var47 = var18.substring(++var44, var44 + var17);
               int var10001 = -1;

               while (true) {
                  char[] var75;
                  label136: {
                     char[] var56 = var47.toCharArray();
                     int var10003 = var56.length;
                     int var22 = 0;
                     var75 = var56;
                     var10001 = var10003;
                     char[] var91;
                     int var10004;
                     if (var10003 <= 1) {
                        var91 = var56;
                        var10004 = var22;
                     } else {
                        var75 = var56;
                        var10001 = var10003;
                        if (var10003 <= var22) {
                           break label136;
                        }

                        var91 = var56;
                        var10004 = var22;
                     }

                     while (true) {
                        var91[var10004] = (char)(var91[var10004] ^ switch (var22 % a(-462442786, var40 ^ -1271786432)) {
                           case 0 -> a(-462442799, var40 ^ 403199865);
                           case 1 -> a(-462442800, var40 ^ 1605028708);
                           case 2 -> a(-462442797, var40 ^ -1938608500);
                           case 3 -> a(-462442798, var40 ^ 221323934);
                           case 4 -> a(-462442795, var40 ^ -2027176812);
                           case 5 -> 4;
                           default -> a(-462442796, var40 ^ 106182360);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var91 = var75;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var91 = var75;
                           var10004 = var22;
                        }
                     }
                  }

                  String var98 = new String(var75).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var98;
                        if ((var44 += var17) >= var20) {
                           aaaab = var21;
                           ababbb = new String[a(-462442785, var40 ^ 1955070574)];
                           long var8 = 383462858521242442L;
                           long[] var14 = new long[a(-462442793, var40 ^ -1737403050)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = aaaaabba(1201985768, var40 ^ 2034185548)).length();
                           byte var10 = 0;

                           label115:
                           while (true) {
                              int var63 = var10;
                              var10 += 8;
                              var47 = var12.substring(var63, var10);
                              var63 = 1201985769;
                              int var81 = var40 ^ -1073654939;
                              byte[] var15 = var47.getBytes("ISO-8859-1");
                              long[] var50 = var14;
                              var63 = var11++;
                              long var82 = (var15[0] & 255L) << a(-462442794, var40 ^ 941241617)
                                 | (var15[1] & 255L) << a(-462442807, var40 ^ 1258809061)
                                 | (var15[2] & 255L) << a(-462442808, var40 ^ -1321009376)
                                 | (var15[3] & 255L) << a(-462442805, var40 ^ -1059206812)
                                 | (var15[4] & 255L) << a(-462442806, var40 ^ -773838788)
                                 | (var15[5] & 255L) << a(-462442803, var40 ^ -164879462)
                                 | (var15[a(-462442804, var40 ^ 774589456)] & 255L) << a(-462442801, var40 ^ 45377444)
                                 | var15[a(-462442802, var40 ^ -153671240)] & 255L;
                              byte var99 = -1;

                              while (true) {
                                 long var104 = var82 ^ var8;
                                 switch (var99) {
                                    case 0:
                                       var50[var63] = var104;
                                       if (var10 >= var13) {
                                          bbab = var14;
                                          abb = new Integer[a(-462442760, var40 ^ 2095070023)];
                                          abbb = bbaaa(a(-462442757, var40 ^ 1885105901), 6312799194636863118L);
                                          baaba = bbaaa(a(-462442758, var40 ^ -1200784120), 5617595577491691035L);
                                          bb = bbaaa(a(-462442755, var40 ^ 108348953), 5509438696831639101L);
                                          aaabba = bbaaa(a(-462442756, var40 ^ -529668551), 6204453680285769724L);
                                          abbaab = bbaaa(a(-462442753, var40 ^ -1092886040), 4231800338164289314L);
                                          long var0 = 6290665600288376853L;
                                          long[] var6 = new long[a(-462442754, var40 ^ -32057875)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = aaaaabba(1201985772, var40 ^ -1118364943)).length();
                                          byte var2 = 0;

                                          label105:
                                          while (true) {
                                             int var68 = var2;
                                             var2 += 8;
                                             var47 = var4.substring(var68, var2);
                                             var68 = 1201985773;
                                             int var85 = var40 ^ -1362883457;
                                             byte[] var7 = var47.getBytes("ISO-8859-1");
                                             long[] var53 = var6;
                                             var68 = var3++;
                                             long var86 = (var7[0] & 255L) << a(-462442767, var40 ^ -1006869912)
                                                | (var7[1] & 255L) << a(-462442768, var40 ^ -1264952642)
                                                | (var7[2] & 255L) << a(-462442765, var40 ^ 222755096)
                                                | (var7[3] & 255L) << a(-462442766, var40 ^ 878817431)
                                                | (var7[4] & 255L) << a(-462442763, var40 ^ 758988809)
                                                | (var7[5] & 255L) << a(-462442764, var40 ^ 649183415)
                                                | (var7[a(-462442761, var40 ^ -1139681537)] & 255L) << a(-462442762, var40 ^ 1694995482)
                                                | var7[a(-462442775, var40 ^ 939708101)] & 255L;
                                             byte var101 = -1;

                                             while (true) {
                                                var104 = var86 ^ var0;
                                                switch (var101) {
                                                   case 0:
                                                      var53[var68] = var104;
                                                      if (var2 >= var5) {
                                                         baa = var6;
                                                         aaaabb = new Long[a(-462442781, var40 ^ 625700400)];
                                                         baaab = babb(a(-462442782, var40 ^ -1695339637), 7749504432804258353L);
                                                         aba = babb(a(-462442779, var40 ^ 1040091156), 3594295124372319076L);
                                                         ba = babb(a(-462442780, var40 ^ -220221718), 8339491549705892347L);
                                                         aa = babb(a(-462442777, var40 ^ 960115350), 7919516238787028044L);
                                                         abbbaa = aabbaaaba.aaab(
                                                            abbaaaa(a(-462442778, var40 ^ 1424868405), a(-462442983, var40 ^ -168785435))
                                                         );
                                                         aababa = aabbaaaba.aaab(
                                                            abbaaaa(a(-462442984, var40 ^ -1998223872), a(-462442981, var40 ^ -1747586167))
                                                         );
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var53[var68] = var104;
                                                      if (var2 < var5) {
                                                         continue label105;
                                                      }

                                                      var5 = (var4 = aaaaabba(1201985762, var40 ^ -113611545)).length();
                                                      var2 = 0;
                                                }

                                                int var71 = var2;
                                                var2 += 8;
                                                var47 = var4.substring(var71, var2);
                                                var71 = 1201985763;
                                                int var88 = var40 ^ 383611685;
                                                var7 = var47.getBytes("ISO-8859-1");
                                                var53 = var6;
                                                var68 = var3++;
                                                var86 = (var7[0] & 255L) << a(-462442776, var40 ^ -1003745471)
                                                   | (var7[1] & 255L) << a(-462442773, var40 ^ 1309221204)
                                                   | (var7[2] & 255L) << a(-462442774, var40 ^ -1486575546)
                                                   | (var7[3] & 255L) << a(-462442771, var40 ^ 678750744)
                                                   | (var7[4] & 255L) << a(-462442772, var40 ^ 803272478)
                                                   | (var7[5] & 255L) << a(-462442769, var40 ^ -2077091134)
                                                   | (var7[a(-462442770, var40 ^ 293320793)] & 255L) << a(-462442783, var40 ^ 405349756)
                                                   | var7[a(-462442784, var40 ^ -1789603467)] & 255L;
                                                var101 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var50[var63] = var104;
                                       if (var10 < var13) {
                                          continue label115;
                                       }

                                       var13 = (var12 = aaaaabba(1201985774, var40 ^ -1411425387)).length();
                                       var10 = 0;
                                 }

                                 int var66 = var10;
                                 var10 += 8;
                                 var47 = var12.substring(var66, var10);
                                 var66 = 1201985775;
                                 int var84 = var40 ^ -1914938756;
                                 var15 = var47.getBytes("ISO-8859-1");
                                 var50 = var14;
                                 var63 = var11++;
                                 var82 = (var15[0] & 255L) << a(-462442815, var40 ^ 2030049238)
                                    | (var15[1] & 255L) << a(-462442816, var40 ^ -1670692477)
                                    | (var15[2] & 255L) << a(-462442813, var40 ^ -90047476)
                                    | (var15[3] & 255L) << a(-462442814, var40 ^ -748970375)
                                    | (var15[4] & 255L) << a(-462442811, var40 ^ -1252258917)
                                    | (var15[5] & 255L) << a(-462442812, var40 ^ 2086826760)
                                    | (var15[a(-462442809, var40 ^ -1018977620)] & 255L) << a(-462442810, var40 ^ 88596550)
                                    | var15[a(-462442759, var40 ^ -1340118982)] & 255L;
                                 var99 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var44);
                        break;
                     default:
                        var21[var19++] = var98;
                        if ((var44 += var17) < var20) {
                           var17 = var18.charAt(var44);
                           continue label141;
                        }

                        var20 = (var18 = aaaaabba(1201985771, var40 ^ 1227126335)).length();
                        var17 = a(-462442788, var40 ^ -784086758);
                        var44 = -1;
                  }

                  var47 = var18.substring(++var44, var44 + var17);
                  var10001 = 0;
               }
            }
         }

         do {
            var35 = var31[var33] ^ var29;
            char[] var37 = var30.substring(var34, var34 + var35).toCharArray();
            int var38 = 0;

            do {
               short var39 = switch (var38 % 6) {
                  default -> 246;
                  case 1 -> 177;
                  case 2 -> 158;
                  case 3 -> 219;
                  case 4 -> 57;
                  case 5 -> 223;
               };
               var37[var38] = (char)(var37[var38] ^ var39);
            } while (++var38 < var37.length);

            var32[var33] = new String(var37).intern();
            var34 += var35;
         } while (++var33 < var31.length);

         var36 = 0;
      }
   }

   private abbbaaaa ababbaa(class_310 param1, class_1799 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababaa.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababaa;
      // 0e: if_acmpeq 14
      // 11: aconst_null
      // 12: areturn
      // 13: athrow
      // 14: aload 1
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 1b: aload 1
      // 1c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1f: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 26: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaaa (Lnet/minecraft/class_243;FF)[Lnet/minecraft/class_2338;
      // 2c: astore 4
      // 2e: aload 4
      // 30: arraylength
      // 31: istore 5
      // 33: bipush 0
      // 34: istore 6
      // 36: iload 6
      // 38: iload 5
      // 3a: if_icmpge 92
      // 3d: aload 4
      // 3f: iload 6
      // 41: aaload
      // 42: astore 7
      // 44: aload 0
      // 45: iload 3
      // 46: ifne 63
      // 49: aload 1
      // 4a: aload 7
      // 4c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 4f: ifne 5e
      // 52: goto 56
      // 55: athrow
      // 56: iload 3
      // 57: ifeq 8b
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 0
      // 5f: goto 63
      // 62: athrow
      // 63: aload 1
      // 64: aload 2
      // 65: aload 7
      // 67: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbab (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;Lnet/minecraft/class_2338;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;
      // 6a: astore 8
      // 6c: iload 3
      // 6d: ifne 8e
      // 70: aload 8
      // 72: ifnull 8b
      // 75: goto 79
      // 78: athrow
      // 79: aload 0
      // 7a: aload 1
      // 7b: aload 8
      // 7d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbba (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaa;)Z
      // 80: ifeq 8b
      // 83: goto 87
      // 86: athrow
      // 87: aload 8
      // 89: areturn
      // 8a: athrow
      // 8b: iinc 6 1
      // 8e: iload 3
      // 8f: ifeq 36
      // 92: aconst_null
      // 93: areturn
   }

   private class_2338[] ababbab(class_2338 var1, class_2350 var2) {
      return aaa(var1, var2);
   }

   private boolean ababbba(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 011
      // 009: ifnull 03d
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: iload 2
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 018: ifnull 03d
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 027: ifnull 03d
      // 02a: aload 0
      // 02b: iload 2
      // 02c: ifne 041
      // 02f: goto 033
      // 032: athrow
      // 033: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 036: ifnonnull 040
      // 039: goto 03d
      // 03c: athrow
      // 03d: bipush 0
      // 03e: ireturn
      // 03f: athrow
      // 040: aload 0
      // 041: iload 2
      // 042: ifne 054
      // 045: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaaab Z
      // 048: ifne 05d
      // 04b: goto 04f
      // 04e: athrow
      // 04f: aload 0
      // 050: goto 054
      // 053: athrow
      // 054: aload 1
      // 055: aload 0
      // 056: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 059: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbbab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 05c: ireturn
      // 05d: aload 1
      // 05e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 061: aload 0
      // 062: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 065: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 068: astore 3
      // 069: aload 0
      // 06a: iload 2
      // 06b: ifne 086
      // 06e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 071: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 074: checkcast java/lang/Boolean
      // 077: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 07a: ifeq 09d
      // 07d: goto 081
      // 080: athrow
      // 081: aload 0
      // 082: goto 086
      // 085: athrow
      // 086: aload 1
      // 087: aload 0
      // 088: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 08b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 08e: iload 2
      // 08f: ifne 09a
      // 092: ifeq 09d
      // 095: goto 099
      // 098: athrow
      // 099: bipush 1
      // 09a: goto 09e
      // 09d: bipush 0
      // 09e: istore 4
      // 0a0: aload 3
      // 0a1: iload 2
      // 0a2: ifne 0b4
      // 0a5: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 0a8: ifne 0d1
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: aload 3
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 0b7: iload 2
      // 0b8: ifne 0c4
      // 0bb: ifne 0d1
      // 0be: goto 0c2
      // 0c1: athrow
      // 0c2: iload 4
      // 0c4: iload 2
      // 0c5: ifne 0d0
      // 0c8: ifne 0d1
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: bipush 0
      // 0d0: ireturn
      // 0d1: aload 0
      // 0d2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbaa Lnet/minecraft/class_2338;
      // 0d5: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 0d8: astore 5
      // 0da: aload 1
      // 0db: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0de: aload 5
      // 0e0: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0e3: astore 6
      // 0e5: aload 6
      // 0e7: iload 2
      // 0e8: ifne 0fc
      // 0eb: ifnull 169
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: aload 6
      // 0f4: iload 2
      // 0f5: ifne 10c
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 0ff: ifne 169
      // 102: aload 6
      // 104: iload 2
      // 105: ifne 11c
      // 108: goto 10c
      // 10b: athrow
      // 10c: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 10f: ifne 169
      // 112: aload 6
      // 114: iload 2
      // 115: ifne 12b
      // 118: goto 11c
      // 11b: athrow
      // 11c: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 11f: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 122: ifeq 169
      // 125: aload 6
      // 127: goto 12b
      // 12a: athrow
      // 12b: aload 1
      // 12c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 12f: aload 5
      // 131: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 134: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 137: iload 2
      // 138: ifne 15a
      // 13b: ifne 169
      // 13e: goto 142
      // 141: athrow
      // 142: aload 1
      // 143: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 146: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 149: aload 0
      // 14a: aload 5
      // 14c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 14f: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 152: ldc2_w 20.25
      // 155: dcmpg
      // 156: goto 15a
      // 159: athrow
      // 15a: iload 2
      // 15b: ifne 166
      // 15e: ifgt 169
      // 161: goto 165
      // 164: athrow
      // 165: bipush 1
      // 166: goto 16a
      // 169: bipush 0
      // 16a: ireturn
   }

   private void ababbbb(
      class_310 param1,
      abbbabaaa param2,
      abbbabaaa param3,
      float param4,
      float param5,
      class_3965 param6,
      BooleanSupplier param7
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 8
      // 005: aload 0
      // 006: iload 8
      // 008: ifne 025
      // 00b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 00e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 011: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababab;
      // 014: if_acmpne 0a9
      // 017: goto 01b
      // 01a: athrow
      // 01b: aload 0
      // 01c: aload 2
      // 01d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 020: aload 0
      // 021: goto 025
      // 024: athrow
      // 025: aload 1
      // 026: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 029: getfield net/minecraft/class_746.field_6012 I
      // 02c: bipush 1
      // 02d: iadd
      // 02e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaab I
      // 031: aload 1
      // 032: aload 6
      // 034: bipush 1
      // 035: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.abbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;Z)Z
      // 038: istore 9
      // 03a: aload 0
      // 03b: aload 0
      // 03c: aload 1
      // 03d: aload 2
      // 03e: aload 3
      // 03f: aload 7
      // 041: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb;Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Ljava/util/function/BooleanSupplier;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaaa (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Ljava/util/function/BooleanSupplier;)Z, ()Z ]
      // 046: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;
      // 049: aload 1
      // 04a: aload 0
      // 04b: ldc_w -462443007
      // 04e: ldc_w 899848667
      // 051: ldc_w 892576026
      // 054: ixor
      // 055: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 058: ldc2_w 3688895270646010381
      // 05b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 05e: iload 9
      // 060: ifeq 06e
      // 063: aload 1
      // 064: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 067: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 06a: goto 070
      // 06d: athrow
      // 06e: fload 4
      // 070: iload 9
      // 072: ifeq 080
      // 075: aload 1
      // 076: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 079: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 07c: goto 082
      // 07f: athrow
      // 080: fload 5
      // 082: aload 0
      // 083: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.aaaab (Lnet/minecraft/class_310;Ljava/lang/Object;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 089: istore 10
      // 08b: iload 8
      // 08d: ifne 0a1
      // 090: iload 10
      // 092: ifne 0a8
      // 095: goto 099
      // 098: athrow
      // 099: aload 0
      // 09a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbaab ()V
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: invokestatic java/lang/System.currentTimeMillis ()J
      // 0a5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 0a8: return
      // 0a9: aload 1
      // 0aa: aload 6
      // 0ac: bipush 1
      // 0ad: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.abbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;Z)Z
      // 0b0: istore 9
      // 0b2: iload 9
      // 0b4: ifeq 0bc
      // 0b7: fconst_0
      // 0b8: goto 0d3
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba;
      // 0c0: aload 1
      // 0c1: aload 6
      // 0c3: aload 0
      // 0c4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 0c7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0ca: checkcast java/lang/Double
      // 0cd: invokevirtual java/lang/Double.floatValue ()F
      // 0d0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.bbaba (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;F)F
      // 0d3: fstore 10
      // 0d5: invokestatic java/lang/System.currentTimeMillis ()J
      // 0d8: lstore 11
      // 0da: iload 9
      // 0dc: iload 8
      // 0de: ifne 12a
      // 0e1: ifne 128
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: fload 10
      // 0ea: ldc 0.5
      // 0ec: fcmpg
      // 0ed: iload 8
      // 0ef: ifne 12a
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: ifle 128
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: lload 11
      // 0ff: aload 0
      // 100: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabbba J
      // 103: lsub
      // 104: ldc_w -462443008
      // 107: ldc_w 899848667
      // 10a: ldc_w 416534890
      // 10d: ixor
      // 10e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 111: ldc2_w 603033607859111737
      // 114: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 117: lcmp
      // 118: iload 8
      // 11a: ifne 12a
      // 11d: goto 121
      // 120: athrow
      // 121: iflt 187
      // 124: goto 128
      // 127: athrow
      // 128: iload 9
      // 12a: iload 8
      // 12c: ifne 156
      // 12f: ifne 142
      // 132: goto 136
      // 135: athrow
      // 136: aload 1
      // 137: fload 4
      // 139: fload 5
      // 13b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabbab (Lnet/minecraft/class_310;FF)V
      // 13e: goto 142
      // 141: athrow
      // 142: aload 0
      // 143: iload 8
      // 145: ifne 16d
      // 148: aload 1
      // 149: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabb (Lnet/minecraft/class_310;)V
      // 14c: aload 0
      // 14d: aload 7
      // 14f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbabb (Ljava/util/function/BooleanSupplier;)Z
      // 152: goto 156
      // 155: athrow
      // 156: ifeq 168
      // 159: aload 0
      // 15a: aload 3
      // 15b: aload 1
      // 15c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;Lnet/minecraft/class_310;)V
      // 15f: iload 8
      // 161: ifeq 187
      // 164: goto 168
      // 167: athrow
      // 168: aload 0
      // 169: goto 16d
      // 16c: athrow
      // 16d: invokestatic java/lang/System.currentTimeMillis ()J
      // 170: ldc_w -462443005
      // 173: ldc_w 899848667
      // 176: ldc_w -1246335607
      // 179: ixor
      // 17a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 17d: ldc2_w 6474695175696088868
      // 180: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babb (IJ)J
      // 183: ladd
      // 184: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbabb J
      // 187: return
   }

   private static String abbaaaa(int var0, int var1) {
      int var9 = 603633048;
      int var2 = (var0 ^ a(-462443006, var9 ^ 1695226246)) & a(-462443003, var9 ^ 1546963757);
      if (ababbb[var2] == null) {
         char[] var3 = aaaab[var2].toCharArray();

         int var4 = switch (var3[0] & a(-462443004, var9 ^ -1499724547)) {
            case 0 -> a(-462443001, var9 ^ 81553376);
            case 1 -> a(-462443002, var9 ^ 147944075);
            case 2 -> a(-462442951, var9 ^ 113442292);
            case 3 -> a(-462442952, var9 ^ 940618399);
            case 4 -> 3;
            case 5 -> a(-462442949, var9 ^ -1093115312);
            case 6 -> a(-462442950, var9 ^ 2079158217);
            case 7 -> a(-462442947, var9 ^ 1584558272);
            case 8 -> a(-462442948, var9 ^ -1501498519);
            case 9 -> a(-462442945, var9 ^ 497828476);
            case 10 -> a(-462442946, var9 ^ -463946306);
            case 11 -> a(-462442959, var9 ^ 704621112);
            case 12 -> a(-462442960, var9 ^ 1568916568);
            case 13 -> a(-462442957, var9 ^ -1328298747);
            case 14 -> a(-462442958, var9 ^ -1431256539);
            case 15 -> a(-462442955, var9 ^ -1082959686);
            case 16 -> a(-462442956, var9 ^ 388547266);
            case 17 -> a(-462442953, var9 ^ 1390373045);
            case 18 -> a(-462442954, var9 ^ -493531958);
            case 19 -> a(-462442967, var9 ^ -1505276822);
            case 20 -> a(-462442968, var9 ^ -1392815986);
            case 21 -> a(-462442965, var9 ^ 656570823);
            case 22 -> a(-462442966, var9 ^ -1427477050);
            case 23 -> a(-462442963, var9 ^ 828969059);
            case 24 -> a(-462442964, var9 ^ 1231876382);
            case 25 -> a(-462442961, var9 ^ -2069814882);
            case 26 -> a(-462442962, var9 ^ -626113155);
            case 27 -> a(-462442975, var9 ^ 402703283);
            case 28 -> a(-462442976, var9 ^ -1965383335);
            case 29 -> a(-462442973, var9 ^ -750369343);
            case 30 -> a(-462442974, var9 ^ 1584878287);
            case 31 -> a(-462442971, var9 ^ -593464630);
            case 32 -> a(-462442972, var9 ^ -2087631059);
            case 33 -> a(-462442969, var9 ^ 2117766026);
            case 34 -> a(-462442970, var9 ^ 1374582592);
            case 35 -> a(-462442919, var9 ^ -1927726980);
            case 36 -> a(-462442920, var9 ^ -292916757);
            case 37 -> a(-462442917, var9 ^ -1501914199);
            case 38 -> a(-462442918, var9 ^ 1005066486);
            case 39 -> a(-462442915, var9 ^ -209821884);
            case 40 -> a(-462442916, var9 ^ 465795350);
            case 41 -> a(-462442913, var9 ^ -170048007);
            case 42 -> a(-462442914, var9 ^ 370917317);
            case 43 -> a(-462442927, var9 ^ -513900879);
            case 44 -> a(-462442928, var9 ^ -1749764959);
            case 45 -> a(-462442925, var9 ^ -1296841269);
            case 46 -> a(-462442926, var9 ^ 290189419);
            case 47 -> a(-462442923, var9 ^ -475420153);
            case 48 -> a(-462442924, var9 ^ 936698805);
            case 49 -> a(-462442921, var9 ^ 769352707);
            case 50 -> a(-462442922, var9 ^ 1688500459);
            case 51 -> a(-462442935, var9 ^ -491692293);
            case 52 -> a(-462442936, var9 ^ 1395738090);
            case 53 -> a(-462442933, var9 ^ -679641866);
            case 54 -> a(-462442934, var9 ^ 15685274);
            case 55 -> a(-462442931, var9 ^ -974594903);
            case 56 -> a(-462442932, var9 ^ 1656613025);
            case 57 -> a(-462442929, var9 ^ -1281152734);
            case 58 -> a(-462442930, var9 ^ 1926348928);
            case 59 -> a(-462442943, var9 ^ -510694699);
            case 60 -> a(-462442944, var9 ^ -900114030);
            case 61 -> a(-462442941, var9 ^ -783053483);
            case 62 -> a(-462442942, var9 ^ 1549363945);
            case 63 -> a(-462442939, var9 ^ 568686449);
            case 64 -> a(-462442940, var9 ^ -1408000306);
            case 65 -> 0;
            case 66 -> a(-462442937, var9 ^ 2064531471);
            case 67 -> a(-462442938, var9 ^ 976075892);
            case 68 -> a(-462442887, var9 ^ 1477384951);
            case 69 -> a(-462442888, var9 ^ 1990903922);
            case 70 -> a(-462442885, var9 ^ -1082464535);
            case 71 -> a(-462442886, var9 ^ 998957522);
            case 72 -> a(-462442883, var9 ^ 1677942432);
            case 73 -> a(-462442884, var9 ^ -397567547);
            case 74 -> a(-462442881, var9 ^ 1268773564);
            case 75 -> a(-462442882, var9 ^ 1186198042);
            case 76 -> a(-462442895, var9 ^ 1885640099);
            case 77 -> a(-462442896, var9 ^ -680602403);
            case 78 -> a(-462442893, var9 ^ -957867568);
            case 79 -> a(-462442894, var9 ^ -1489673201);
            case 80 -> a(-462442891, var9 ^ 1588460685);
            case 81 -> a(-462442892, var9 ^ -1774693502);
            case 82 -> 5;
            case 83 -> a(-462442889, var9 ^ 1758131743);
            case 84 -> a(-462442890, var9 ^ -1546220868);
            case 85 -> a(-462442903, var9 ^ -261250908);
            case 86 -> a(-462442904, var9 ^ 555192891);
            case 87 -> a(-462442901, var9 ^ -156779639);
            case 88 -> a(-462442902, var9 ^ 684838226);
            case 89 -> a(-462442899, var9 ^ 128088324);
            case 90 -> a(-462442900, var9 ^ 1185263262);
            case 91 -> a(-462442897, var9 ^ 782017823);
            case 92 -> a(-462442898, var9 ^ 907159284);
            case 93 -> a(-462442911, var9 ^ -768928644);
            case 94 -> a(-462442912, var9 ^ -220265645);
            case 95 -> a(-462442909, var9 ^ -564878044);
            case 96 -> 1;
            case 97 -> a(-462442910, var9 ^ 798459658);
            case 98 -> a(-462442907, var9 ^ 552293290);
            case 99 -> a(-462442908, var9 ^ 864432274);
            case 100 -> a(-462442905, var9 ^ -1504562110);
            case 101 -> a(-462442906, var9 ^ 1730783426);
            case 102 -> a(-462442599, var9 ^ 1590508038);
            case 103 -> a(-462442600, var9 ^ -893441802);
            case 104 -> a(-462442597, var9 ^ 84047084);
            case 105 -> a(-462442598, var9 ^ -1331753178);
            case 106 -> a(-462442595, var9 ^ -1589208587);
            case 107 -> a(-462442596, var9 ^ -1944643819);
            case 108 -> a(-462442593, var9 ^ 1409151259);
            case 109 -> a(-462442594, var9 ^ -491797271);
            case 110 -> a(-462442607, var9 ^ -1538252091);
            case 111 -> a(-462442608, var9 ^ -1101567892);
            case 112 -> a(-462442605, var9 ^ -1110974140);
            case 113 -> a(-462442606, var9 ^ -1411668028);
            case 114 -> a(-462442603, var9 ^ -748342575);
            case 115 -> a(-462442604, var9 ^ -1801417989);
            case 116 -> a(-462442601, var9 ^ 1442517646);
            case 117 -> a(-462442602, var9 ^ 1569379342);
            case 118 -> a(-462442615, var9 ^ -86753636);
            case 119 -> a(-462442616, var9 ^ -2066692850);
            case 120 -> a(-462442613, var9 ^ 218057212);
            case 121 -> a(-462442614, var9 ^ 1907278333);
            case 122 -> a(-462442611, var9 ^ 76186413);
            case 123 -> a(-462442612, var9 ^ -1926529076);
            case 124 -> a(-462442609, var9 ^ 468417689);
            case 125 -> a(-462442610, var9 ^ 1200010316);
            case 126 -> a(-462442623, var9 ^ -1026982648);
            case 127 -> a(-462442624, var9 ^ 378311352);
            case 128 -> a(-462442621, var9 ^ -520721062);
            case 129 -> a(-462442622, var9 ^ -1051854724);
            case 130 -> a(-462442619, var9 ^ -2137779366);
            case 131 -> a(-462442620, var9 ^ -1033753684);
            case 132 -> a(-462442617, var9 ^ 786509432);
            case 133 -> a(-462442618, var9 ^ -1014618685);
            case 134 -> a(-462442567, var9 ^ -1507695417);
            case 135 -> a(-462442568, var9 ^ -1979980986);
            case 136 -> a(-462442565, var9 ^ -559411217);
            case 137 -> a(-462442566, var9 ^ 210350875);
            case 138 -> a(-462442563, var9 ^ 398130083);
            case 139 -> a(-462442564, var9 ^ 2105626742);
            case 140 -> a(-462442561, var9 ^ -1020144372);
            case 141 -> a(-462442562, var9 ^ 1537922940);
            case 142 -> a(-462442575, var9 ^ 265714864);
            case 143 -> a(-462442576, var9 ^ 225103269);
            case 144 -> a(-462442573, var9 ^ 845281610);
            case 145 -> a(-462442574, var9 ^ -1708294027);
            case 146 -> a(-462442571, var9 ^ -1167126991);
            case 147 -> a(-462442572, var9 ^ 821073916);
            case 148 -> a(-462442569, var9 ^ -1170645837);
            case 149 -> a(-462442570, var9 ^ 696397989);
            case 150 -> a(-462442583, var9 ^ -871321398);
            case 151 -> a(-462442584, var9 ^ -1421739447);
            case 152 -> a(-462442581, var9 ^ 788073830);
            case 153 -> a(-462442582, var9 ^ 569647391);
            case 154 -> a(-462442579, var9 ^ 1959546903);
            case 155 -> a(-462442580, var9 ^ -790634050);
            case 156 -> a(-462442577, var9 ^ -180615621);
            case 157 -> a(-462442578, var9 ^ -1063549205);
            case 158 -> a(-462442591, var9 ^ -964412678);
            case 159 -> a(-462442592, var9 ^ 20506620);
            case 160 -> a(-462442589, var9 ^ 1508594120);
            case 161 -> a(-462442590, var9 ^ -520888808);
            case 162 -> a(-462442587, var9 ^ -574265908);
            case 163 -> a(-462442588, var9 ^ 1193484939);
            case 164 -> a(-462442585, var9 ^ 1027221349);
            case 165 -> a(-462442586, var9 ^ 2005177609);
            case 166 -> a(-462442535, var9 ^ -1971791485);
            case 167 -> a(-462442536, var9 ^ -785921375);
            case 168 -> a(-462442533, var9 ^ 448942899);
            case 169 -> a(-462442534, var9 ^ 534417951);
            case 170 -> a(-462442531, var9 ^ 117782385);
            case 171 -> a(-462442532, var9 ^ -788288775);
            case 172 -> a(-462442529, var9 ^ 270755034);
            case 173 -> a(-462442530, var9 ^ -336171727);
            case 174 -> a(-462442543, var9 ^ 505835779);
            case 175 -> a(-462442544, var9 ^ -1831288357);
            case 176 -> a(-462442541, var9 ^ -1049656421);
            case 177 -> a(-462442542, var9 ^ -581456644);
            case 178 -> a(-462442539, var9 ^ -821544883);
            case 179 -> a(-462442540, var9 ^ -980843323);
            case 180 -> a(-462442537, var9 ^ -309166064);
            case 181 -> a(-462442538, var9 ^ -1876512940);
            case 182 -> a(-462442551, var9 ^ -1477832617);
            case 183 -> a(-462442552, var9 ^ 1343553851);
            case 184 -> a(-462442549, var9 ^ 1408887924);
            case 185 -> a(-462442550, var9 ^ -2009210627);
            case 186 -> a(-462442547, var9 ^ 1057661461);
            case 187 -> a(-462442548, var9 ^ 833155328);
            case 188 -> a(-462442545, var9 ^ -2032866473);
            case 189 -> a(-462442546, var9 ^ 1349342987);
            case 190 -> a(-462442559, var9 ^ -895594099);
            case 191 -> a(-462442560, var9 ^ 1680254069);
            case 192 -> a(-462442557, var9 ^ -2061344491);
            case 193 -> a(-462442558, var9 ^ -841504083);
            case 194 -> a(-462442555, var9 ^ -948184732);
            case 195 -> a(-462442556, var9 ^ -1643407652);
            case 196 -> a(-462442553, var9 ^ -75771469);
            case 197 -> a(-462442554, var9 ^ -298220560);
            case 198 -> a(-462442503, var9 ^ -1030870080);
            case 199 -> a(-462442504, var9 ^ -1948726659);
            case 200 -> a(-462442501, var9 ^ 581401235);
            case 201 -> a(-462442502, var9 ^ -1133978174);
            case 202 -> a(-462442499, var9 ^ 1605113894);
            case 203 -> a(-462442500, var9 ^ -911885431);
            case 204 -> a(-462442497, var9 ^ -1148914878);
            case 205 -> a(-462442498, var9 ^ 18374970);
            case 206 -> a(-462442511, var9 ^ 1880501201);
            case 207 -> a(-462442512, var9 ^ 1810771484);
            case 208 -> a(-462442509, var9 ^ 1688498867);
            case 209 -> a(-462442510, var9 ^ 2022698296);
            case 210 -> a(-462442507, var9 ^ -1482702609);
            case 211 -> a(-462442508, var9 ^ -1944641297);
            case 212 -> a(-462442505, var9 ^ -834137314);
            case 213 -> a(-462442506, var9 ^ 441495484);
            case 214 -> 4;
            case 215 -> a(-462442519, var9 ^ 116026786);
            case 216 -> a(-462442520, var9 ^ -324585675);
            case 217 -> a(-462442517, var9 ^ -1507831141);
            case 218 -> a(-462442518, var9 ^ -1150424145);
            case 219 -> a(-462442515, var9 ^ 1045094775);
            case 220 -> a(-462442516, var9 ^ 200269421);
            case 221 -> a(-462442513, var9 ^ 1675937730);
            case 222 -> a(-462442514, var9 ^ -1949114824);
            case 223 -> a(-462442527, var9 ^ -1188660302);
            case 224 -> a(-462442528, var9 ^ -2011256804);
            case 225 -> a(-462442525, var9 ^ 1827893870);
            case 226 -> a(-462442526, var9 ^ 115403327);
            case 227 -> a(-462442523, var9 ^ 246471259);
            case 228 -> a(-462442524, var9 ^ 890888067);
            case 229 -> a(-462442521, var9 ^ 84518672);
            case 230 -> a(-462442522, var9 ^ -2056070773);
            case 231 -> a(-462442727, var9 ^ 1565251130);
            case 232 -> a(-462442728, var9 ^ -1401588790);
            case 233 -> a(-462442725, var9 ^ -1293420059);
            case 234 -> a(-462442726, var9 ^ -1444050879);
            case 235 -> a(-462442723, var9 ^ -801334519);
            case 236 -> a(-462442724, var9 ^ -159617694);
            case 237 -> a(-462442721, var9 ^ -319034152);
            case 238 -> a(-462442722, var9 ^ 1275226733);
            case 239 -> a(-462442735, var9 ^ 174484673);
            case 240 -> a(-462442736, var9 ^ -1585525557);
            case 241 -> a(-462442733, var9 ^ 1432258276);
            case 242 -> a(-462442734, var9 ^ 855541732);
            case 243 -> a(-462442731, var9 ^ -766579114);
            case 244 -> a(-462442732, var9 ^ -970748913);
            case 245 -> a(-462442729, var9 ^ -1767431411);
            case 246 -> a(-462442730, var9 ^ -1870818086);
            case 247 -> a(-462442743, var9 ^ -668588284);
            case 248 -> a(-462442744, var9 ^ 832147121);
            case 249 -> a(-462442741, var9 ^ 1269871806);
            case 250 -> a(-462442742, var9 ^ 1883168736);
            case 251 -> a(-462442739, var9 ^ 654613625);
            case 252 -> a(-462442740, var9 ^ 543689429);
            case 253 -> a(-462442737, var9 ^ -1067666630);
            case 254 -> 2;
            default -> a(-462442738, var9 ^ -2044314539);
         };
         int var5 = (var1 & a(-462442751, var9 ^ 852517746)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-462442752, var9 ^ 1450202261)) >>> a(-462442749, var9 ^ 35097222)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-462442750, var9 ^ -1871467739);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-462442747, var9 ^ -1575608413);
            }
         }

         ababbb[var2] = new String(var3).intern();
      }

      return ababbb[var2];
   }

   private double abbaaab() {
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
      // 06: ifne 19
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababab Z
      // 0c: ifeq 18
      // 0f: goto 13
      // 12: athrow
      // 13: ldc2_w 0.08
      // 16: dreturn
      // 17: athrow
      // 18: aload 0
      // 19: iload 1
      // 1a: ifne 2c
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 20: ifnull 3f
      // 23: goto 27
      // 26: athrow
      // 27: aload 0
      // 28: goto 2c
      // 2b: athrow
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa Lnet/minecraft/class_2680;
      // 2f: invokevirtual net/minecraft/class_2680.method_26204 ()Lnet/minecraft/class_2248;
      // 32: instanceof net/minecraft/class_2482
      // 35: ifne 3f
      // 38: ldc2_w 0.08
      // 3b: goto 42
      // 3e: athrow
      // 3f: ldc2_w 0.2
      // 42: dreturn
   }

   private boolean bbbabbb(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 32
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 3
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 27: ifnull 32
      // 2a: aload 2
      // 2b: ifnonnull 35
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: athrow
      // 35: aload 1
      // 36: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 39: aload 2
      // 3a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 3d: astore 4
      // 3f: aload 1
      // 40: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 43: aload 2
      // 44: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 47: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 4a: astore 5
      // 4c: aload 4
      // 4e: iload 3
      // 4f: ifne 76
      // 52: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 55: ifne 70
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 4
      // 5e: iload 3
      // 5f: ifne 76
      // 62: goto 66
      // 65: athrow
      // 66: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 69: ifeq ea
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 5
      // 72: goto 76
      // 75: athrow
      // 76: iload 3
      // 77: ifne 8b
      // 7a: ifnull ea
      // 7d: goto 81
      // 80: athrow
      // 81: aload 5
      // 83: iload 3
      // 84: ifne 9b
      // 87: goto 8b
      // 8a: athrow
      // 8b: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 8e: ifne ea
      // 91: aload 5
      // 93: iload 3
      // 94: ifne aa
      // 97: goto 9b
      // 9a: athrow
      // 9b: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 9e: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // a1: ifeq ea
      // a4: aload 5
      // a6: goto aa
      // a9: athrow
      // aa: aload 1
      // ab: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // ae: aload 2
      // af: iload 3
      // b0: ifne d2
      // b3: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // b6: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // b9: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // bc: ifne ea
      // bf: goto c3
      // c2: athrow
      // c3: getstatic net/minecraft/class_2246.field_10167 Lnet/minecraft/class_2248;
      // c6: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
      // c9: aload 1
      // ca: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // cd: aload 2
      // ce: goto d2
      // d1: athrow
      // d2: invokevirtual net/minecraft/class_2680.method_26184 (Lnet/minecraft/class_4538;Lnet/minecraft/class_2338;)Z
      // d5: ifeq ea
      // d8: aload 0
      // d9: aload 1
      // da: aload 2
      // db: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // de: ifnull ea
      // e1: goto e5
      // e4: athrow
      // e5: bipush 1
      // e6: goto eb
      // e9: athrow
      // ea: bipush 0
      // eb: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = baaaab[var0 ^ -462442855] ^ var1 ^ var0;
      var2 -= 40725;
      var2 ^= 35721;
      var2 ^= 37488;
      var2 -= 63204;
      var2 += 16867;
      var2 += 49107;
      var2 ^= 52368;
      var2 ^= 62081;
      var2 += 10976;
      return var2 - 54972;
   }

   private boolean bbbbaaa(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 5d
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 3
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 5d
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 27: ifnull 5d
      // 2a: iload 2
      // 2b: iload 3
      // 2c: ifne 62
      // 2f: goto 33
      // 32: athrow
      // 33: iflt 5d
      // 36: goto 3a
      // 39: athrow
      // 3a: iload 2
      // 3b: iload 3
      // 3c: ifne 62
      // 3f: goto 43
      // 42: athrow
      // 43: ldc_w -462442748
      // 46: ldc_w 244402724
      // 49: ldc_w 936217347
      // 4c: ixor
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.a (II)I
      // 50: ldc2_w 7050441791445182372
      // 53: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbaaa (IJ)I
      // 56: if_icmplt 63
      // 59: goto 5d
      // 5c: athrow
      // 5d: bipush 0
      // 5e: goto 62
      // 61: athrow
      // 62: ireturn
      // 63: aload 1
      // 64: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 67: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 6a: iload 2
      // 6b: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 6e: astore 4
      // 70: aload 4
      // 72: aload 1
      // 73: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 76: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabab (Lnet/minecraft/class_1799;Lnet/minecraft/class_638;)Z
      // 79: ireturn
   }

   private void bbbbaab() {
      this.bbbbba();
      this.babaa = abbbabaaa.aab;
      this.bbaab = bbaaa(a(-462442745, -600505591 ^ -802583174), 5579952000272572156L);
   }

   private class_2350 bbbbaba(float var1) {
      return class_2350.method_10150(var1);
   }

   private boolean bbbbabb(BooleanSupplier var1) {
      try {
         return aabbabbbb.aaabbb(var1);
      } catch (LinkageError | RuntimeException var3) {
         this.aabaab(class_310.method_1551());
         throw var3;
      }
   }

   private class_243 bbbbbaa(class_2338 var1) {
      return class_243.method_24955(var1);
   }

   private boolean bbbbbab(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 032
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: iload 3
      // 012: ifne 024
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: ifnull 032
      // 01b: goto 01f
      // 01e: athrow
      // 01f: aload 1
      // 020: goto 024
      // 023: athrow
      // 024: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 027: ifnull 032
      // 02a: aload 2
      // 02b: ifnonnull 035
      // 02e: goto 032
      // 031: athrow
      // 032: bipush 0
      // 033: ireturn
      // 034: athrow
      // 035: aload 1
      // 036: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 039: aload 2
      // 03a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 03d: astore 4
      // 03f: aload 1
      // 040: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 043: aload 2
      // 044: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 047: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 04a: astore 5
      // 04c: aload 0
      // 04d: iload 3
      // 04e: ifne 069
      // 051: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 054: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 057: checkcast java/lang/Boolean
      // 05a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 05d: ifeq 07d
      // 060: goto 064
      // 063: athrow
      // 064: aload 0
      // 065: goto 069
      // 068: athrow
      // 069: aload 1
      // 06a: aload 2
      // 06b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.bbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 06e: iload 3
      // 06f: ifne 07a
      // 072: ifeq 07d
      // 075: goto 079
      // 078: athrow
      // 079: bipush 1
      // 07a: goto 07e
      // 07d: bipush 0
      // 07e: istore 6
      // 080: aload 4
      // 082: iload 3
      // 083: ifne 0b3
      // 086: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 089: ifne 0ad
      // 08c: goto 090
      // 08f: athrow
      // 090: aload 4
      // 092: iload 3
      // 093: ifne 0b3
      // 096: goto 09a
      // 099: athrow
      // 09a: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 09d: ifne 0ad
      // 0a0: goto 0a4
      // 0a3: athrow
      // 0a4: iload 6
      // 0a6: ifeq 14e
      // 0a9: goto 0ad
      // 0ac: athrow
      // 0ad: aload 5
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: iload 3
      // 0b4: ifne 0c8
      // 0b7: ifnull 14e
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: aload 5
      // 0c0: iload 3
      // 0c1: ifne 0d8
      // 0c4: goto 0c8
      // 0c7: athrow
      // 0c8: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 0cb: ifne 14e
      // 0ce: aload 5
      // 0d0: iload 3
      // 0d1: ifne 0e7
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 0db: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 0de: ifeq 14e
      // 0e1: aload 5
      // 0e3: goto 0e7
      // 0e6: athrow
      // 0e7: aload 1
      // 0e8: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0eb: aload 2
      // 0ec: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 0ef: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 0f2: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 0f5: iload 3
      // 0f6: ifne 102
      // 0f9: ifne 14e
      // 0fc: goto 100
      // 0ff: athrow
      // 100: iload 6
      // 102: iload 3
      // 103: ifne 12e
      // 106: ifne 12c
      // 109: goto 10d
      // 10c: athrow
      // 10d: aload 1
      // 10e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 111: aload 2
      // 112: invokestatic net/minecraft/class_4770.method_24416 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 115: aload 1
      // 116: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 119: aload 2
      // 11a: invokevirtual net/minecraft/class_2680.method_26184 (Lnet/minecraft/class_4538;Lnet/minecraft/class_2338;)Z
      // 11d: iload 3
      // 11e: ifne 12e
      // 121: goto 125
      // 124: athrow
      // 125: ifeq 14e
      // 128: goto 12c
      // 12b: athrow
      // 12c: iload 6
      // 12e: iload 3
      // 12f: ifne 14b
      // 132: ifne 146
      // 135: goto 139
      // 138: athrow
      // 139: aload 0
      // 13a: aload 1
      // 13b: aload 2
      // 13c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aaabaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 13f: ifnull 14e
      // 142: goto 146
      // 145: athrow
      // 146: bipush 1
      // 147: goto 14b
      // 14a: athrow
      // 14b: goto 14f
      // 14e: bipush 0
      // 14f: ireturn
   }

   private static boolean b(class_310 var0) {
      return aabbabbbb.abaaba(var0, class_1268.field_5808);
   }

   static class_243 bbbbbba(class_2338 var0, double var1, double var3) {
      return new class_243(var0.method_10263() + var1, var0.method_10264() + 1.0 - 0.0625, var0.method_10260() + var3);
   }

   boolean bbbbbbb() {
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
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abba Z
      // 0c: ifeq 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 1e: if_acmpeq 26
      // 21: bipush 1
      // 22: goto 27
      // 25: athrow
      // 26: bipush 0
      // 27: ireturn
   }

   private double[] aaaaaaaa(double param1, double param3, double param5, double param7, double param9, double param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 13
      // 05: dload 3
      // 06: invokestatic java/lang/Math.abs (D)D
      // 09: iload 13
      // 0b: ifne 59
      // 0e: ldc2_w 1.0E-7
      // 11: dcmpg
      // 12: ifge 53
      // 15: goto 19
      // 18: athrow
      // 19: dload 1
      // 1a: iload 13
      // 1c: ifne 32
      // 1f: goto 23
      // 22: athrow
      // 23: dload 5
      // 25: dcmpl
      // 26: iflt 51
      // 29: goto 2d
      // 2c: athrow
      // 2d: dload 1
      // 2e: goto 32
      // 31: athrow
      // 32: dload 7
      // 34: dcmpg
      // 35: iload 13
      // 37: ifne 42
      // 3a: ifgt 51
      // 3d: goto 41
      // 40: athrow
      // 41: bipush 2
      // 42: newarray 7
      // 44: dup
      // 45: bipush 0
      // 46: dload 9
      // 48: dastore
      // 49: dup
      // 4a: bipush 1
      // 4b: dload 11
      // 4d: dastore
      // 4e: goto 52
      // 51: aconst_null
      // 52: areturn
      // 53: dload 5
      // 55: dload 1
      // 56: dsub
      // 57: dload 3
      // 58: ddiv
      // 59: dstore 14
      // 5b: dload 7
      // 5d: dload 1
      // 5e: dsub
      // 5f: dload 3
      // 60: ddiv
      // 61: dstore 16
      // 63: dload 14
      // 65: iload 13
      // 67: ifne 94
      // 6a: dload 16
      // 6c: dcmpl
      // 6d: ifle 80
      // 70: goto 74
      // 73: athrow
      // 74: dload 14
      // 76: dstore 18
      // 78: dload 16
      // 7a: dstore 14
      // 7c: dload 18
      // 7e: dstore 16
      // 80: dload 9
      // 82: dload 14
      // 84: invokestatic java/lang/Math.max (DD)D
      // 87: dstore 9
      // 89: dload 11
      // 8b: dload 16
      // 8d: invokestatic java/lang/Math.min (DD)D
      // 90: dstore 11
      // 92: dload 9
      // 94: dload 11
      // 96: dcmpg
      // 97: iload 13
      // 99: ifne a4
      // 9c: ifgt b3
      // 9f: goto a3
      // a2: athrow
      // a3: bipush 2
      // a4: newarray 7
      // a6: dup
      // a7: bipush 0
      // a8: dload 9
      // aa: dastore
      // ab: dup
      // ac: bipush 1
      // ad: dload 11
      // af: dastore
      // b0: goto b4
      // b3: aconst_null
      // b4: areturn
   }

   public void aaaaaaab(class_310 param1, class_1268 param2, class_3965 param3) {
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
      // 08: ifne 25
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.baaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 11: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababaa;
      // 14: if_acmpne a4
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 4
      // 1e: ifne 30
      // 21: goto 25
      // 24: athrow
      // 25: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babbaab ()Z
      // 28: ifeq a4
      // 2b: aload 0
      // 2c: goto 30
      // 2f: athrow
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 33: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabaaa;
      // 36: if_acmpne a4
      // 39: aload 1
      // 3a: iload 4
      // 3c: ifne 4b
      // 3f: goto 43
      // 42: athrow
      // 43: ifnull a4
      // 46: goto 4a
      // 49: athrow
      // 4a: aload 1
      // 4b: iload 4
      // 4d: ifne 5f
      // 50: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 53: ifnull a4
      // 56: goto 5a
      // 59: athrow
      // 5a: aload 1
      // 5b: goto 5f
      // 5e: athrow
      // 5f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 62: ifnull a4
      // 65: aload 2
      // 66: ifnull a4
      // 69: goto 6d
      // 6c: athrow
      // 6d: aload 3
      // 6e: iload 4
      // 70: ifne 7f
      // 73: goto 77
      // 76: athrow
      // 77: ifnull a4
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 3
      // 7f: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 82: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 85: if_acmpne a4
      // 88: aload 0
      // 89: iload 4
      // 8b: ifne bb
      // 8e: goto 92
      // 91: athrow
      // 92: aload 1
      // 93: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 96: aload 2
      // 97: invokevirtual net/minecraft/class_746.method_5998 (Lnet/minecraft/class_1268;)Lnet/minecraft/class_1799;
      // 9a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.babaaa (Lnet/minecraft/class_1799;)Z
      // 9d: ifne a6
      // a0: goto a4
      // a3: athrow
      // a4: return
      // a5: athrow
      // a6: aload 0
      // a7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.aabba ()V
      // aa: aload 0
      // ab: aload 1
      // ac: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // af: getfield net/minecraft/class_746.field_6012 I
      // b2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abaaab I
      // b5: aload 0
      // b6: aload 3
      // b7: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.abbaba Lnet/minecraft/class_3965;
      // ba: aload 0
      // bb: aload 1
      // bc: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // bf: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // c5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbabb.ababa I
      // c8: return
   }

   private class_243 aaaaaaba(class_310 var1) {
      return var1.field_1724.method_33571().method_1023(0.0, 0.1, 0.0);
   }

   private class_243 aaaaaabb(class_310 var1, float var2, float var3) {
      float var4 = var2 * (float) (Math.PI / 180.0);
      float var5 = var3 * (float) (Math.PI / 180.0);
      float var6 = class_3532.method_15362(var5);
      float var7 = class_3532.method_15374(var5);
      float var8 = class_3532.method_15362(var4);
      float var9 = class_3532.method_15374(var4);
      class_243 var10 = new class_243(-var9 * var6, -var7, var8 * var6);
      return var1.field_1724.method_33571().method_1019(var10.method_1021(5.0));
   }
}
