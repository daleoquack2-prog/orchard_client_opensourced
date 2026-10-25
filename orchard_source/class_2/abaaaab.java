package nsc;

import com.mojang.authlib.GameProfile;
import java.lang.reflect.Field;
import java.util.List;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_640;

@Environment(EnvType.CLIENT)
public final class abaaaab {
   private static final String[] aa;
   private static final int[] aab;
   private static final String[] aba;
   private static final List ab;
   private static final Object[] abb;
   private static final long[] a;
   private static final String[] ba;
   private static Field bb;
   private static boolean aaa;
   private static final Integer[] b;

   public static void aa(abaaaaba var0) {
   }

   private static int a(int var0, int var1) {
      int var2 = aab[var0 ^ -93131390] ^ var1 ^ var0;
      var2 -= 26847;
      var2 -= 39396;
      var2 -= 54380;
      var2 ^= 25970;
      var2 += 58561;
      var2 -= 65030;
      var2 ^= 28799;
      return var2 - 15168;
   }

   private static aaabbaab ab(class_2561 param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokeinterface net/minecraft/class_2561.method_10851 ()Lnet/minecraft/class_7417; 1
      // 006: astore 3
      // 007: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 00a: bipush 0
      // 00b: istore 4
      // 00d: iload 1
      // 00e: istore 5
      // 010: istore 2
      // 011: iload 5
      // 013: iload 2
      // 014: ifne 043
      // 017: ifeq 03d
      // 01a: goto 01e
      // 01d: athrow
      // 01e: aload 0
      // 01f: invokeinterface net/minecraft/class_2561.method_10866 ()Lnet/minecraft/class_2583; 1
      // 024: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaab.aab (Lnet/minecraft/class_2583;)Z
      // 027: iload 2
      // 028: ifne 043
      // 02b: goto 02f
      // 02e: athrow
      // 02f: ifeq 03d
      // 032: goto 036
      // 035: athrow
      // 036: bipush 0
      // 037: istore 5
      // 039: iload 2
      // 03a: ifeq 0cc
      // 03d: iload 5
      // 03f: goto 043
      // 042: athrow
      // 043: iload 2
      // 044: ifne 0a0
      // 047: ifeq 09a
      // 04a: goto 04e
      // 04d: athrow
      // 04e: aload 3
      // 04f: instanceof net/minecraft/class_8828
      // 052: iload 2
      // 053: ifne 0a0
      // 056: goto 05a
      // 059: athrow
      // 05a: ifeq 09a
      // 05d: goto 061
      // 060: athrow
      // 061: aload 3
      // 062: checkcast net/minecraft/class_8828
      // 065: astore 6
      // 067: iload 2
      // 068: aload 6
      // 06a: invokeinterface net/minecraft/class_8828.comp_737 ()Ljava/lang/String; 1
      // 06f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.baba (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbba;
      // 072: astore 7
      // 074: ifne 096
      // 077: aload 7
      // 079: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbba.aa ()Z
      // 07c: ifeq 08f
      // 07f: goto 083
      // 082: athrow
      // 083: aload 7
      // 085: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbba.b ()Ljava/lang/String;
      // 088: invokestatic net/minecraft/class_8828.method_54232 (Ljava/lang/String;)Lnet/minecraft/class_8828;
      // 08b: astore 3
      // 08c: bipush 1
      // 08d: istore 4
      // 08f: aload 7
      // 091: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbba.a ()Z
      // 094: istore 5
      // 096: iload 2
      // 097: ifeq 0cc
      // 09a: iload 5
      // 09c: goto 0a0
      // 09f: athrow
      // 0a0: iload 2
      // 0a1: ifne 0ca
      // 0a4: ifeq 0c5
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abb (Lnet/minecraft/class_2561;)Z
      // 0af: iload 2
      // 0b0: ifne 0ca
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: ifeq 0c5
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: bipush 1
      // 0bf: istore 5
      // 0c1: iload 2
      // 0c2: ifeq 0cc
      // 0c5: bipush 0
      // 0c6: goto 0ca
      // 0c9: athrow
      // 0ca: istore 5
      // 0cc: aload 3
      // 0cd: invokestatic net/minecraft/class_5250.method_43477 (Lnet/minecraft/class_7417;)Lnet/minecraft/class_5250;
      // 0d0: aload 0
      // 0d1: invokeinterface net/minecraft/class_2561.method_10866 ()Lnet/minecraft/class_2583; 1
      // 0d6: invokevirtual net/minecraft/class_5250.method_10862 (Lnet/minecraft/class_2583;)Lnet/minecraft/class_5250;
      // 0d9: astore 6
      // 0db: aload 0
      // 0dc: invokeinterface net/minecraft/class_2561.method_10855 ()Ljava/util/List; 1
      // 0e1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e6: astore 7
      // 0e8: aload 7
      // 0ea: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ef: ifeq 12b
      // 0f2: aload 7
      // 0f4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f9: checkcast net/minecraft/class_2561
      // 0fc: astore 8
      // 0fe: aload 8
      // 100: iload 5
      // 102: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.ab (Lnet/minecraft/class_2561;Z)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaab;
      // 105: iload 2
      // 106: ifne 142
      // 109: astore 9
      // 10b: iload 2
      // 10c: aload 6
      // 10e: aload 9
      // 110: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaab.ab ()Lnet/minecraft/class_2561;
      // 113: invokevirtual net/minecraft/class_5250.method_10852 (Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;
      // 116: pop
      // 117: iload 4
      // 119: aload 9
      // 11b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaab.aa ()Z
      // 11e: ior
      // 11f: istore 4
      // 121: aload 9
      // 123: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaab.b ()Z
      // 126: istore 5
      // 128: ifeq 0e8
      // 12b: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaab
      // 12e: dup
      // 12f: iload 4
      // 131: ifeq 13a
      // 134: aload 6
      // 136: goto 13b
      // 139: athrow
      // 13a: aload 0
      // 13b: iload 4
      // 13d: iload 5
      // 13f: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaab.<init> (Lnet/minecraft/class_2561;ZZ)V
      // 142: areturn
   }

   public static boolean ba(Object var0) {
      return aaba(baaa(var0));
   }

   private static void bb(class_634 var0, PacketSender var1, class_310 var2) {
      try {
         if (abbabaa.aa()) {
            return;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      aa(baab());
   }

   public static void aaa() {
      int var0 = baaabbaa.bba;

      boolean var10000;
      label22: {
         try {
            var10000 = aaa;
            if (var0 != 0) {
               break label22;
            }

            if (aaa) {
               return;
            }
         } catch (MatchException var1) {
            throw var1;
         }

         var10000 = true;
      }

      aaa = var10000;
      ClientPlayConnectionEvents.JOIN.register(abaaaab::bb);
   }

   public static boolean aab(GameProfile var0) {
      int var1 = baaabbaa.bba;

      GameProfile var10000;
      label33: {
         try {
            var10000 = var0;
            if (var1 != 0) {
               break label33;
            }

            if (var0 == null) {
               return false;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = var0;
      }

      try {
         boolean var4 = b(baababbb.bb(var10000));
         if (var1 != 0) {
            return var4;
         }

         if (var4) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   private static String bbaa(int var0, int var1) {
      int var3 = var0 ^ 917988987;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         abb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 323890073;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 245;
            case 1 -> 56;
            case 2 -> 87;
            case 3 -> 209;
            case 4 -> 162;
            case 5 -> 252;
            case 6 -> 11;
            case 7 -> 112;
            case 8 -> 54;
            case 9 -> 124;
            case 10 -> 147;
            case 11 -> 37;
            case 12 -> 166;
            case 13 -> 15;
            case 14 -> 96;
            case 15 -> 23;
            case 16 -> 199;
            case 17 -> 32;
            case 18 -> 63;
            case 19 -> 130;
            case 20 -> 186;
            case 21 -> 48;
            case 22 -> 241;
            case 23 -> 93;
            case 24 -> 33;
            case 25 -> 20;
            case 26 -> 224;
            case 27 -> 86;
            case 28 -> 175;
            case 29 -> 227;
            case 30 -> 158;
            case 31 -> 70;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public static boolean aba(class_1657 var0) {
      int var1 = baaabbaa.bba;

      class_1657 var10000;
      label33: {
         try {
            var10000 = var0;
            if (var1 != 0) {
               break label33;
            }

            if (var0 == null) {
               return false;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = var0;
      }

      try {
         boolean var4 = b(var10000.method_5667());
         if (var1 != 0) {
            return var4;
         }

         if (var4) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   private static boolean abb(class_2561 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: invokeinterface net/minecraft/class_2561.method_10851 ()Lnet/minecraft/class_7417; 1
      // 09: astore 3
      // 0a: istore 1
      // 0b: aload 3
      // 0c: iload 1
      // 0d: ifne 1f
      // 10: instanceof net/minecraft/class_8828
      // 13: ifeq 3b
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 3
      // 1b: goto 1f
      // 1e: athrow
      // 1f: checkcast net/minecraft/class_8828
      // 22: astore 2
      // 23: aload 2
      // 24: invokeinterface net/minecraft/class_8828.comp_737 ()Ljava/lang/String; 1
      // 29: invokevirtual java/lang/String.isEmpty ()Z
      // 2c: iload 1
      // 2d: ifne 38
      // 30: ifeq 3b
      // 33: goto 37
      // 36: athrow
      // 37: bipush 1
      // 38: goto 3c
      // 3b: bipush 0
      // 3c: ireturn
   }

   private static boolean baa(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 2095167314
      // 002: istore 2
      // 003: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 006: istore 1
      // 007: iload 0
      // 008: iload 1
      // 009: ifne 10e
      // 00c: ldc -93131390
      // 00e: iload 2
      // 00f: ldc 1061937972
      // 011: ixor
      // 012: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 015: ldc2_w 3275380353298075882
      // 018: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // 01b: if_icmpeq 109
      // 01e: goto 022
      // 021: athrow
      // 022: iload 0
      // 023: iload 1
      // 024: ifne 10e
      // 027: goto 02b
      // 02a: athrow
      // 02b: ldc_w -93131389
      // 02e: iload 2
      // 02f: ldc_w 1141538318
      // 032: ixor
      // 033: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 036: ldc2_w 8645518301076808768
      // 039: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // 03c: if_icmpeq 109
      // 03f: goto 043
      // 042: athrow
      // 043: iload 0
      // 044: iload 1
      // 045: ifne 08a
      // 048: goto 04c
      // 04b: athrow
      // 04c: ldc_w -93131392
      // 04f: iload 2
      // 050: ldc_w 1921950729
      // 053: ixor
      // 054: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 057: ldc2_w 9111704625607260754
      // 05a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // 05d: if_icmplt 085
      // 060: goto 064
      // 063: athrow
      // 064: iload 0
      // 065: iload 1
      // 066: ifne 10e
      // 069: goto 06d
      // 06c: athrow
      // 06d: ldc_w -93131391
      // 070: iload 2
      // 071: ldc_w 946074893
      // 074: ixor
      // 075: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 078: ldc2_w 8603771257026307739
      // 07b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // 07e: if_icmple 109
      // 081: goto 085
      // 084: athrow
      // 085: iload 0
      // 086: goto 08a
      // 089: athrow
      // 08a: iload 1
      // 08b: ifne 0cc
      // 08e: ldc_w -93131386
      // 091: iload 2
      // 092: ldc_w -2053401844
      // 095: ixor
      // 096: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 099: ldc2_w 8613857032813973337
      // 09c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // 09f: if_icmplt 0c7
      // 0a2: goto 0a6
      // 0a5: athrow
      // 0a6: iload 0
      // 0a7: iload 1
      // 0a8: ifne 10e
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: ldc_w -93131385
      // 0b2: iload 2
      // 0b3: ldc_w -685608956
      // 0b6: ixor
      // 0b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 0ba: ldc2_w 5073253968003214416
      // 0bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // 0c0: if_icmple 109
      // 0c3: goto 0c7
      // 0c6: athrow
      // 0c7: iload 0
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: iload 1
      // 0cd: ifne 0ed
      // 0d0: ldc_w -93131388
      // 0d3: iload 2
      // 0d4: ldc_w -610554735
      // 0d7: ixor
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 0db: ldc2_w 6790179177800860638
      // 0de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // 0e1: if_icmplt 111
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: iload 0
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: iload 1
      // 0ee: ifne 10e
      // 0f1: ldc_w -93131387
      // 0f4: iload 2
      // 0f5: ldc_w -1003171591
      // 0f8: ixor
      // 0f9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 0fc: ldc2_w 6723942353887062821
      // 0ff: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // 102: if_icmpgt 111
      // 105: goto 109
      // 108: athrow
      // 109: bipush 1
      // 10a: goto 10e
      // 10d: athrow
      // 10e: goto 112
      // 111: bipush 0
      // 112: ireturn
   }

   public static boolean bab(UUID var0) {
      return b(var0);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static class_2561 bba(Object var0, class_2561 var1) {
      int var10000 = baaabbaa.bba;
      abaaaaba var3 = baab();
      int var2 = var10000;

      label30: {
         label29: {
            try {
               var7 = var3;
               if (var2 != 0) {
                  break label29;
               }

               if (var3 == null) {
                  break label30;
               }
            } catch (MatchException var6) {
               throw var6;
            }

            var7 = var3;
         }

         try {
            if (var7.ba(baaa(var0))) {
               return abab(var1);
            }
         } catch (MatchException var5) {
            throw var5;
         }
      }

      try {
         return var1;
      } catch (MatchException var4) {
         throw var4;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var32 = 1012070971;
      byte var28 = -1;
      char[] var23 = "!\u0019H\n\u0010\n".toCharArray();
      short var21 = 15168;
      String var22 = "硷磨磉碖碽碛碪碁硎磝磟碿硲磌磮碨硁磞磚硭碵硍磦破砽磩碫砑碖碨硐碊硅杏杫朔染柙枇柄松柪柦朙柀柶染柉枎朻木柇枸柚杤柳枪松цпӠѪӿшӝҷѝфЗЮҤӾҾсҷњЃҒѠГӯяіѪәҩЮӚӱЛЂЊҕҿҜШҴӏӧЂӁоѯӻЫѣҾӝѼчѧӅҬҹџѿ҅ҴВѿҕЂӣЅ҆ҋѕџІҸ囃囱嘽嚦噾嚻嚤噬噁嚩寞孢寮宧宫嬏嬻孷孭実孑孞嬵孮孞孎䲁䲳䱿䳤䰼䳹䳦䰮䰃䳫";
      String[] var24 = new String[var23.length];

      while (true) {
         int var25 = 0;
         char var26 = 0;
         char var27 = '\u0000';
         if (var28 == 0) {
            aba = var24;
            abb = new Object[var24.length];
            int var17 = 1699409598;
            byte[] var15 = "Ü\u0090N\u0085§Ñ\u009fö\u0091UOÆÛ¸u\u008cfA\u0019÷4ù\u0099ú8ASß'ï+®üU\u009f\u0002¼\u0003\u0014\u0092Z©Þ+©5·Õát+<\u0087h£\u001f\u001b!tÇ·É\nV¸q¹j¼ðÂ\u009d§I\u000eÎ\u0093þÊâÚ½\r\u0017=/HJj\b\u0005\u0002fJ¯DÌ;d«dO!V\u001c#\u000eC\u0089ó¡_þ\u0098â¼\u000e\u001c\u001d\b¨\u001dòZÖ-å®Ë<éÞ\u0089í}±\u0093µ3¬8áqã\u0090J÷5(áè ô>8\n\u000b\u0090F3\u009bØÈañ\u0093J\tu>-ø\u0004\u0019ÌÈÙôªË\u0089\fD=³Ê3\u009f\u008f\t\u001f4Ø\u008cjs\u009cÜ*î\u009b³\u001ee\u0017\u0018\u008c¥\u0010¡½E\u0099ã8¢\u000b´>\u0081\u0098\u0013Oì\u0013îf\u0014\u009cô\r[¦Ãö\u0006Ë¾\tÙU©>Ò~H¹~Á8µ¥\u0099#Í\u001at\b\u0000½\u0012ù\u009dÂùÜ$L\"\u0001äÄ\u008fïG@È\u001bó©ê\u0097;7ç¿HH>S\u009f§I¾Ô´\u0004\u0005\u0096\u0091\u0013¥\u001bìl34\u001c\u00170ÔGBä\u008e\u009bÅ\u0087c\u00129¦Âû\u0085\u008f\u0099ý5GæUÿéÖ\f¬Ð¼ô\u001eñÏ#;\u009a%wO|»¿\u008c\u0091\u0004\n·d\u009fÓ¤\u0006\\½ù\u007fÍ¬J7aTS\böË[q])o\u001f)ò¹\u0091¿?~}\u008co©b\u0089û\u0012¸tIE/ºÀæH¨ï\u0014RþëB,]n\u0081\nõxÂVé3\bi\u0089\u0098±Èui\\\u009dïã«®í=a¥&é'«Uïº\u008dN¨\u008c£àQ\u0085ý\u0082Ñá\u0085\u008b`ç|IëÀ-\u0004ô6D·`ª\u0094D§L¢SøA>fàíº\u001b\u0005u\u0016á/}ÒÁ\u008büí\u000bäÃÙ\u0082Rùo\u001dÊøoZFmé\u0017Op\u0002}6ý\u0083Uì\u0015O¶7Tã\u007fk'34ib¹ÔHjz¡¸ç\u0088\t3®Öè3Îx¿~²¢\u001e\"\u0085h\fÒB+-@GL6\u0094ÿ¿¢#©yCk`\u000f\u0000A^sp\u00ad«nq÷\u0013\u0003\u0013akc)\u0007\u0087\u0006ûje±t\r«ó¨§\u008c.\u008dâ`cqÅ2D\u009ebv\u0090âêÁ\\¸\u009c\u0011\u0090Ï>¢Å\u009dã £&ÇkLÈÕôÃh\u0081\u0007\u0001Â\u00adoÇ\u007fs\u0012íÇ\b½\u008c(òe2øö\u008b\u0098{\u0080\u009dQ\u001by\u0081v\u0098.\u0099ÚºI\u0004¸\u001aayÂÍ·<Oï~\bJªÀ-G\n©>T¡äSûÖJ_Vg÷û\u0011\u0006%]\u009alcQ¹ý\"LE<\u0004·Åz\u001an\u009eÓ^Ú\u0014Pä|¸\r\rA\u0016U¢ê\u0010\u008e\f´½ÆH\u009c{{p\u001f4ÝÏ\u0080N,PèÑæoT\u007fty\u0019^Ò1ú\u007fv\u009b1â\u00admÛßl\nR\u009bnè\u0001'Ñ\u008e\u0014ý ÷.¦ÎH\u0002¶Ð\u0000íBAi¼o|äõádg\u0090\u001cDÒ\u0097GE±³ù¹¶¦\u008d9ÕÔW\u0018_;Äá\u001dûýãWfNì\r\u008a% Ç\u001alàÞn\u0019ê\u009d_5\u0097ÌÔÆ\u0097L\u008fÅL6\t¿\u0005\u0097HÂ!\u0019É]ù\u0085\n«Núÿ°gÊU\u00149¯\t>Iîúr\u00ad\u008b,8,\n\u0098´\u0095/\u0003.¾Hz\u0011Õ\u0017d\u0017ýø\u0012j\u008b5'\u009b\rj\u009e8³\u0094\u0091\u009fë ö\u0083 è[]ëþ\u0019ÆJítêXjR\u0014Ê.\u0001\u0087Åòsïõ\u0006ôS\u00120\rÿ}ÄäQjõ+Ô)¤Ö\u001f¬\u00ad}\rÚ\u0018´Ö¸ÞÜ\u009aÚ®>°N\u00ad'\u0087Çõ\u0083¡±Âp×l\u0089piá\u008f\u008fgIà\u0015\\ ¼vXðmLì«\u0013{\u0090\u00906WV\u0002dc÷g)f\u000eò\u0080\u0002usî\u0013ZùÐÐÖ\u009eh\u001açú\u0083C\t®:¬ÝÏM«0â\u00adÎ÷\u0090v\u0015\u0098sÌ¶è\u0086ô7Ôª£b®£^3\n¤s+\u0007oÑÓ\u0088ëÛ½§\u009b\u00026\u009ck\\±5Û\u0001\nE4ÝD\u0005P\u0085\u00906?øu&Å«Ä×ª\u009b\u001e1BV¦dYËDk\u0097©lSøJHoµa¬\u0014ÎÒPsOl¡Á\u0081ÖÛÎñÐÔs7\u009d¿þÂ4K8W§»Ü\u009f¯\u001a\u009cÒ#Çv¢\u009e÷Éqú¦\u008aºn"
               .getBytes("ISO-8859-1");
            int var16 = var15.length / 4;
            aab = new int[var16];
            byte var18 = 0;
            int var19 = 0;

            do {
               int var20 = (var15[var18] & 255) << 24 | (var15[var18 + 1] & 255) << 16 | (var15[var18 + 2] & 255) << 8 | var15[var18 + 3] & 255;
               var20 ^= var17;
               aab[var19] = var20;
               var18 += 4;
            } while (++var19 < var16);

            String[] var13 = new String[4];
            int var11 = 0;
            String var10;
            int var12 = (var10 = bbaa(917988987, var32 ^ -1494117359)).length();
            int var9 = a(-93131382, var32 ^ 1597947448);
            int var35 = -1;

            label118:
            while (true) {
               String var38 = var10.substring(++var35, var35 + var9);
               int var10001 = -1;

               while (true) {
                  char[] var58;
                  label113: {
                     char[] var44 = var38.toCharArray();
                     int var10003 = var44.length;
                     int var14 = 0;
                     var58 = var44;
                     var10001 = var10003;
                     char[] var70;
                     int var10004;
                     if (var10003 <= 1) {
                        var70 = var44;
                        var10004 = var14;
                     } else {
                        var58 = var44;
                        var10001 = var10003;
                        if (var10003 <= var14) {
                           break label113;
                        }

                        var70 = var44;
                        var10004 = var14;
                     }

                     while (true) {
                        var70[var10004] = (char)(var70[var10004] ^ switch (var14 % a(-93131384, var32 ^ -104661224)) {
                           case 0 -> a(-93131383, var32 ^ 173971825);
                           case 1 -> a(-93131378, var32 ^ 1109330558);
                           case 2 -> a(-93131377, var32 ^ 604209734);
                           case 3 -> a(-93131380, var32 ^ -1203086773);
                           case 4 -> a(-93131379, var32 ^ 346170563);
                           case 5 -> a(-93131374, var32 ^ 454727656);
                           default -> a(-93131373, var32 ^ 530310091);
                        });
                        var14++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var70 = var58;
                        } else {
                           if (var10001 <= var14) {
                              break;
                           }

                           var70 = var58;
                           var10004 = var14;
                        }
                     }
                  }

                  String var77 = new String(var58).intern();
                  switch (var10001) {
                     case 0:
                        var13[var11++] = var77;
                        if ((var35 += var9) >= var12) {
                           aa = var13;
                           ba = new String[4];
                           long var0 = 6084653684076082883L;
                           long[] var6 = new long[a(-93131376, var32 ^ 69349345)];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = bbaa(917988985, var32 ^ -633945669)).length();
                           byte var2 = 0;

                           label92:
                           while (true) {
                              int var51 = var2;
                              var2 += 8;
                              var38 = var4.substring(var51, var2);
                              var51 = 917988984;
                              int var64 = var32 ^ -1996639136;
                              byte[] var7 = var38.getBytes("ISO-8859-1");
                              long[] var41 = var6;
                              var51 = var3++;
                              long var65 = (var7[0] & 255L) << a(-93131375, var32 ^ 815131547)
                                 | (var7[1] & 255L) << a(-93131370, var32 ^ 2044079185)
                                 | (var7[2] & 255L) << a(-93131369, var32 ^ -1639683835)
                                 | (var7[3] & 255L) << a(-93131372, var32 ^ -916249514)
                                 | (var7[4] & 255L) << a(-93131371, var32 ^ -987656679)
                                 | (var7[5] & 255L) << a(-93131366, var32 ^ 1867531649)
                                 | (var7[a(-93131365, var32 ^ -953941901)] & 255L) << a(-93131368, var32 ^ -1085788317)
                                 | var7[a(-93131367, var32 ^ 714637437)] & 255L;
                              byte var78 = -1;

                              while (true) {
                                 long var81 = var65 ^ var0;
                                 switch (var78) {
                                    case 0:
                                       var41[var51] = var81;
                                       if (var2 >= var5) {
                                          a = var6;
                                          b = new Integer[a(-93131353, var32 ^ -1953838792)];
                                          ab = List.of(
                                             aabbaaaba.aaab(
                                                abbb(a(-93131356, var32 ^ 1465219067), a(-93131355, var32 ^ -1459926630))
                                             ),
                                             aabbaaaba.aaab(
                                                abbb(a(-93131350, var32 ^ 951289729), a(-93131349, var32 ^ 1392223026))
                                             ),
                                             aabbaaaba.aaab(
                                                abbb(a(-93131352, var32 ^ -699047417), a(-93131351, var32 ^ -1485751020))
                                             )
                                          );
                                          return;
                                       }
                                       break;
                                    default:
                                       var41[var51] = var81;
                                       if (var2 < var5) {
                                          continue label92;
                                       }

                                       var5 = (var4 = bbaa(917988991, var32 ^ -2050821538)).length();
                                       var2 = 0;
                                 }

                                 int var54 = var2;
                                 var2 += 8;
                                 var38 = var4.substring(var54, var2);
                                 var54 = 917988990;
                                 int var67 = var32 ^ -1832928452;
                                 var7 = var38.getBytes("ISO-8859-1");
                                 var41 = var6;
                                 var51 = var3++;
                                 var65 = (var7[0] & 255L) << a(-93131362, var32 ^ 1576256458)
                                    | (var7[1] & 255L) << a(-93131361, var32 ^ -1384694713)
                                    | (var7[2] & 255L) << a(-93131364, var32 ^ 192336670)
                                    | (var7[3] & 255L) << a(-93131363, var32 ^ 1967572211)
                                    | (var7[4] & 255L) << a(-93131358, var32 ^ 1750583476)
                                    | (var7[5] & 255L) << a(-93131357, var32 ^ 713448610)
                                    | (var7[a(-93131360, var32 ^ 819860146)] & 255L) << a(-93131359, var32 ^ -1685434118)
                                    | var7[a(-93131354, var32 ^ 857855528)] & 255L;
                                 var78 = 0;
                              }
                           }
                        }

                        var9 = var10.charAt(var35);
                        break;
                     default:
                        var13[var11++] = var77;
                        if ((var35 += var9) < var12) {
                           var9 = var10.charAt(var35);
                           continue label118;
                        }

                        var12 = (var10 = bbaa(917988986, var32 ^ -1182495418)).length();
                        var9 = a(-93131381, var32 ^ 526923173);
                        var35 = -1;
                  }

                  var38 = var10.substring(++var35, var35 + var9);
                  var10001 = 0;
               }
            }
         }

         do {
            var27 = var23[var25];
            char[] var29 = var22.substring(var26, var26 + var27).toCharArray();
            int var30 = 0;

            do {
               short var31 = switch (var30 % 5) {
                  default -> 129;
                  case 1 -> 100;
                  case 2 -> 219;
                  case 3 -> 164;
                  case 4 -> 26;
               };
               var29[var30] = (char)(var29[var30] ^ var31 ^ var21);
            } while (++var30 < var29.length);

            var24[var25] = new String(var29).intern();
            var26 += var27;
         } while (++var25 < var23.length);

         var28 = 0;
      }
   }

   private static boolean bbb(String var0, String var1) {
      return var0.regionMatches(true, 0, var1, 0, var1.length());
   }

   public static class_2561 aaaa(class_1657 param0, class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.baab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 1c
      // 08: aload 0
      // 09: ifnull 1c
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 2
      // 11: aload 0
      // 12: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.aba (Lnet/minecraft/class_1657;)Z
      // 15: ifne 1f
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 1
      // 1d: areturn
      // 1e: athrow
      // 1f: aload 1
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abab (Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 23: areturn
   }

   private abaaaab() {
   }

   private static boolean aaab(UUID var0) {
      return b(var0);
   }

   public static boolean aaba(UUID param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.aaab (Ljava/util/UUID;)Z
      // 04: ifeq 16
      // 07: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.baab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;
      // 0a: ifnull 16
      // 0d: goto 11
      // 10: athrow
      // 11: bipush 1
      // 12: goto 17
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
   }

   private static String aabb(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: astore 2
      // 05: istore 1
      // 06: bipush 0
      // 07: istore 3
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.ab Ljava/util/List;
      // 0b: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 10: astore 4
      // 12: aload 4
      // 14: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 19: ifeq c0
      // 1c: aload 4
      // 1e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 23: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 26: astore 5
      // 28: iload 1
      // 29: aload 5
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 2e: astore 6
      // 30: ifne 08
      // 33: aload 2
      // 34: iload 1
      // 35: ifne 51
      // 38: aload 6
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.bbb (Ljava/lang/String;Ljava/lang/String;)Z
      // 3d: ifeq bc
      // 40: goto 44
      // 43: athrow
      // 44: aload 2
      // 45: aload 6
      // 47: invokevirtual java/lang/String.length ()I
      // 4a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4d: goto 51
      // 50: athrow
      // 51: astore 2
      // 52: aload 2
      // 53: invokevirtual java/lang/String.isEmpty ()Z
      // 56: ifne ba
      // 59: aload 2
      // 5a: iload 1
      // 5b: ifne c9
      // 5e: bipush 0
      // 5f: invokevirtual java/lang/String.codePointAt (I)I
      // 62: istore 7
      // 64: iload 1
      // 65: ifne b6
      // 68: iload 7
      // 6a: invokestatic java/lang/Character.isWhitespace (I)Z
      // 6d: ifne ac
      // 70: goto 74
      // 73: athrow
      // 74: iload 7
      // 76: iload 1
      // 77: ifne 8e
      // 7a: goto 7e
      // 7d: athrow
      // 7e: invokestatic java/lang/Character.isSpaceChar (I)Z
      // 81: ifne ac
      // 84: goto 88
      // 87: athrow
      // 88: iload 7
      // 8a: goto 8e
      // 8d: athrow
      // 8e: ldc_w -93131346
      // 91: ldc_w -2041438193
      // 94: ldc_w -1063403903
      // 97: ixor
      // 98: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 9b: ldc2_w 3394336794520433439
      // 9e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // a1: if_icmpeq ac
      // a4: iload 1
      // a5: ifeq ba
      // a8: goto ac
      // ab: athrow
      // ac: aload 2
      // ad: iload 7
      // af: invokestatic java/lang/Character.charCount (I)I
      // b2: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // b5: astore 2
      // b6: iload 1
      // b7: ifeq 52
      // ba: bipush 1
      // bb: istore 3
      // bc: iload 1
      // bd: ifeq 12
      // c0: iload 3
      // c1: ifne 06
      // c4: iload 1
      // c5: ifne c0
      // c8: aload 2
      // c9: areturn
   }

   private static int abaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-93131345, 226036851 ^ 458096898);
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static class_2561 abab(class_2561 param0) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: areturn
      // 12: athrow
      // 13: aload 0
      // 14: bipush 1
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.ab (Lnet/minecraft/class_2561;Z)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaab;
      // 18: astore 2
      // 19: aload 2
      // 1a: iload 1
      // 1b: ifne 2d
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaab.aa ()Z
      // 21: ifeq 33
      // 24: goto 28
      // 27: athrow
      // 28: aload 2
      // 29: goto 2d
      // 2c: athrow
      // 2d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaab.ab ()Lnet/minecraft/class_2561;
      // 30: goto 34
      // 33: aload 0
      // 34: areturn
   }

   public static class_2561 abba(class_640 param0, class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.baab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 1f
      // 08: aload 0
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 2
      // 11: aload 0
      // 12: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
      // 15: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.bbb (Lcom/mojang/authlib/GameProfile;)Z
      // 18: ifne 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: areturn
      // 21: athrow
      // 22: aload 1
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abab (Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 26: areturn
   }

   private static String abbb(int var0, int var1) {
      int var9 = -1836804916;
      int var2 = (var0 ^ a(-93131348, var9 ^ -1099492717)) & a(-93131347, var9 ^ -2101915187);
      if (ba[var2] == null) {
         char[] var3 = aa[var2].toCharArray();

         int var4 = switch (var3[0] & a(-93131342, var9 ^ -718199403)) {
            case 0 -> a(-93131341, var9 ^ -1855887895);
            case 1 -> a(-93131344, var9 ^ -1777446592);
            case 2 -> a(-93131343, var9 ^ 447073424);
            case 3 -> a(-93131338, var9 ^ 488436411);
            case 4 -> 0;
            case 5 -> 3;
            case 6 -> a(-93131337, var9 ^ -1805748297);
            case 7 -> 5;
            case 8 -> a(-93131340, var9 ^ 101282117);
            case 9 -> a(-93131339, var9 ^ -1783758840);
            case 10 -> a(-93131334, var9 ^ 508766519);
            case 11 -> a(-93131333, var9 ^ -1857469915);
            case 12 -> a(-93131336, var9 ^ -1417759157);
            case 13 -> a(-93131335, var9 ^ -972863932);
            case 14 -> a(-93131330, var9 ^ 1477734729);
            case 15 -> a(-93131329, var9 ^ 1945499950);
            case 16 -> a(-93131332, var9 ^ -863634848);
            case 17 -> a(-93131331, var9 ^ -1801551232);
            case 18 -> a(-93131326, var9 ^ 2041925614);
            case 19 -> a(-93131325, var9 ^ 524603993);
            case 20 -> a(-93131328, var9 ^ -194942042);
            case 21 -> a(-93131327, var9 ^ 800893791);
            case 22 -> a(-93131322, var9 ^ -2108553017);
            case 23 -> a(-93131321, var9 ^ -978928592);
            case 24 -> a(-93131324, var9 ^ -416648128);
            case 25 -> a(-93131323, var9 ^ -368965538);
            case 26 -> a(-93131318, var9 ^ 871289002);
            case 27 -> a(-93131317, var9 ^ 1141087181);
            case 28 -> a(-93131320, var9 ^ 163109138);
            case 29 -> a(-93131319, var9 ^ 504912810);
            case 30 -> a(-93131314, var9 ^ 1636727678);
            case 31 -> a(-93131313, var9 ^ 445488056);
            case 32 -> a(-93131316, var9 ^ 1331282428);
            case 33 -> a(-93131315, var9 ^ -935711600);
            case 34 -> a(-93131310, var9 ^ 874218192);
            case 35 -> a(-93131309, var9 ^ -2009933372);
            case 36 -> a(-93131312, var9 ^ 955951405);
            case 37 -> a(-93131311, var9 ^ -229337541);
            case 38 -> a(-93131306, var9 ^ -1586629869);
            case 39 -> a(-93131305, var9 ^ 323780762);
            case 40 -> a(-93131308, var9 ^ 908552767);
            case 41 -> a(-93131307, var9 ^ 1120009147);
            case 42 -> a(-93131302, var9 ^ -2127803526);
            case 43 -> a(-93131301, var9 ^ -1160130542);
            case 44 -> a(-93131304, var9 ^ -1447357493);
            case 45 -> a(-93131303, var9 ^ -188579256);
            case 46 -> a(-93131298, var9 ^ 1200238291);
            case 47 -> a(-93131297, var9 ^ 1588967685);
            case 48 -> a(-93131300, var9 ^ 1456217467);
            case 49 -> a(-93131299, var9 ^ 1654810196);
            case 50 -> a(-93131294, var9 ^ -1272123197);
            case 51 -> a(-93131293, var9 ^ 1942012865);
            case 52 -> a(-93131296, var9 ^ -1528838561);
            case 53 -> a(-93131295, var9 ^ 520436705);
            case 54 -> a(-93131290, var9 ^ 1217591971);
            case 55 -> a(-93131289, var9 ^ -336205608);
            case 56 -> a(-93131292, var9 ^ 435138929);
            case 57 -> a(-93131291, var9 ^ 1334910303);
            case 58 -> a(-93131286, var9 ^ -1934117519);
            case 59 -> a(-93131285, var9 ^ -806639356);
            case 60 -> a(-93131288, var9 ^ 97831339);
            case 61 -> a(-93131287, var9 ^ -1133167907);
            case 62 -> a(-93131282, var9 ^ 1361096682);
            case 63 -> a(-93131281, var9 ^ -1508659934);
            case 64 -> a(-93131284, var9 ^ 1813539141);
            case 65 -> a(-93131283, var9 ^ 706091668);
            case 66 -> a(-93131278, var9 ^ -1221587270);
            case 67 -> a(-93131277, var9 ^ -2128699228);
            case 68 -> a(-93131280, var9 ^ -2009019036);
            case 69 -> a(-93131279, var9 ^ -331822231);
            case 70 -> a(-93131274, var9 ^ -356447982);
            case 71 -> a(-93131273, var9 ^ -846183410);
            case 72 -> a(-93131276, var9 ^ 1006237536);
            case 73 -> a(-93131275, var9 ^ -1490482359);
            case 74 -> a(-93131270, var9 ^ 1092557925);
            case 75 -> a(-93131269, var9 ^ 1283664216);
            case 76 -> a(-93131272, var9 ^ -536390590);
            case 77 -> a(-93131271, var9 ^ 2024517367);
            case 78 -> a(-93131266, var9 ^ 1886355965);
            case 79 -> a(-93131265, var9 ^ -246397852);
            case 80 -> a(-93131268, var9 ^ -832257490);
            case 81 -> a(-93131267, var9 ^ -187539986);
            case 82 -> a(-93131518, var9 ^ -170781232);
            case 83 -> a(-93131517, var9 ^ 1616140123);
            case 84 -> a(-93131520, var9 ^ 2109682180);
            case 85 -> a(-93131519, var9 ^ -264365482);
            case 86 -> a(-93131514, var9 ^ 418576067);
            case 87 -> a(-93131513, var9 ^ 1499344970);
            case 88 -> a(-93131516, var9 ^ 713980880);
            case 89 -> a(-93131515, var9 ^ 1862572845);
            case 90 -> a(-93131510, var9 ^ 1741152672);
            case 91 -> a(-93131509, var9 ^ -365606597);
            case 92 -> a(-93131512, var9 ^ -1553225960);
            case 93 -> a(-93131511, var9 ^ -1010438033);
            case 94 -> a(-93131506, var9 ^ -1088466666);
            case 95 -> a(-93131505, var9 ^ -1999289475);
            case 96 -> a(-93131508, var9 ^ 1335255552);
            case 97 -> a(-93131507, var9 ^ 1257339190);
            case 98 -> a(-93131502, var9 ^ -234689031);
            case 99 -> a(-93131501, var9 ^ -1530655732);
            case 100 -> a(-93131504, var9 ^ 1840398552);
            case 101 -> a(-93131503, var9 ^ 1406021808);
            case 102 -> a(-93131498, var9 ^ -1496105254);
            case 103 -> a(-93131497, var9 ^ 515789714);
            case 104 -> a(-93131500, var9 ^ 1725852141);
            case 105 -> a(-93131499, var9 ^ -1967410140);
            case 106 -> a(-93131494, var9 ^ 1745630224);
            case 107 -> a(-93131493, var9 ^ -1504778486);
            case 108 -> a(-93131496, var9 ^ -2121022841);
            case 109 -> a(-93131495, var9 ^ 1843278173);
            case 110 -> 4;
            case 111 -> a(-93131490, var9 ^ 1073340159);
            case 112 -> a(-93131489, var9 ^ 2066591198);
            case 113 -> a(-93131492, var9 ^ -857606035);
            case 114 -> a(-93131491, var9 ^ 472747988);
            case 115 -> a(-93131486, var9 ^ -1351036295);
            case 116 -> a(-93131485, var9 ^ -1390515885);
            case 117 -> a(-93131488, var9 ^ 1727104828);
            case 118 -> a(-93131487, var9 ^ -109172622);
            case 119 -> a(-93131482, var9 ^ 180129189);
            case 120 -> a(-93131481, var9 ^ 1652174859);
            case 121 -> a(-93131484, var9 ^ 525371313);
            case 122 -> a(-93131483, var9 ^ -1338939270);
            case 123 -> a(-93131478, var9 ^ 1754249140);
            case 124 -> a(-93131477, var9 ^ -2044380345);
            case 125 -> a(-93131480, var9 ^ -1863558180);
            case 126 -> a(-93131479, var9 ^ -1932798099);
            case 127 -> 2;
            case 128 -> a(-93131474, var9 ^ -1805125019);
            case 129 -> a(-93131473, var9 ^ 151344431);
            case 130 -> a(-93131476, var9 ^ 1954516330);
            case 131 -> a(-93131475, var9 ^ 837988228);
            case 132 -> a(-93131470, var9 ^ 100132314);
            case 133 -> a(-93131469, var9 ^ 553272619);
            case 134 -> a(-93131472, var9 ^ 870968938);
            case 135 -> a(-93131471, var9 ^ 1581684358);
            case 136 -> a(-93131466, var9 ^ 1391143074);
            case 137 -> a(-93131465, var9 ^ -156481269);
            case 138 -> a(-93131468, var9 ^ 1344742160);
            case 139 -> a(-93131467, var9 ^ 1543814601);
            case 140 -> a(-93131462, var9 ^ 1106801506);
            case 141 -> a(-93131461, var9 ^ -1166527133);
            case 142 -> a(-93131464, var9 ^ 1663275929);
            case 143 -> a(-93131463, var9 ^ -676782166);
            case 144 -> a(-93131458, var9 ^ 1896172991);
            case 145 -> a(-93131457, var9 ^ 1286280599);
            case 146 -> a(-93131460, var9 ^ -408043131);
            case 147 -> a(-93131459, var9 ^ -1191147857);
            case 148 -> a(-93131454, var9 ^ -1849281450);
            case 149 -> a(-93131453, var9 ^ 311008644);
            case 150 -> a(-93131456, var9 ^ -1913429180);
            case 151 -> a(-93131455, var9 ^ -445864207);
            case 152 -> a(-93131450, var9 ^ 1505899693);
            case 153 -> a(-93131449, var9 ^ 350461395);
            case 154 -> a(-93131452, var9 ^ -138266914);
            case 155 -> a(-93131451, var9 ^ 1012916878);
            case 156 -> a(-93131446, var9 ^ -698211547);
            case 157 -> a(-93131445, var9 ^ 1596337782);
            case 158 -> a(-93131448, var9 ^ 211459770);
            case 159 -> a(-93131447, var9 ^ 423653256);
            case 160 -> a(-93131442, var9 ^ 589005136);
            case 161 -> a(-93131441, var9 ^ 252420055);
            case 162 -> a(-93131444, var9 ^ -520158773);
            case 163 -> a(-93131443, var9 ^ -1311622082);
            case 164 -> a(-93131438, var9 ^ -128178979);
            case 165 -> a(-93131437, var9 ^ -1650390223);
            case 166 -> a(-93131440, var9 ^ -1694889277);
            case 167 -> a(-93131439, var9 ^ -1102776047);
            case 168 -> a(-93131434, var9 ^ -1422886509);
            case 169 -> a(-93131433, var9 ^ -638953556);
            case 170 -> a(-93131436, var9 ^ 913944111);
            case 171 -> a(-93131435, var9 ^ -163535897);
            case 172 -> a(-93131430, var9 ^ 1811131514);
            case 173 -> a(-93131429, var9 ^ -2020057014);
            case 174 -> a(-93131432, var9 ^ 399617977);
            case 175 -> a(-93131431, var9 ^ 1671734694);
            case 176 -> a(-93131426, var9 ^ 1384699953);
            case 177 -> a(-93131425, var9 ^ -646195208);
            case 178 -> a(-93131428, var9 ^ -2106061713);
            case 179 -> a(-93131427, var9 ^ 67259126);
            case 180 -> a(-93131422, var9 ^ 1165979149);
            case 181 -> a(-93131421, var9 ^ -991906088);
            case 182 -> a(-93131424, var9 ^ 118885984);
            case 183 -> a(-93131423, var9 ^ -234018622);
            case 184 -> a(-93131418, var9 ^ 1487500988);
            case 185 -> a(-93131417, var9 ^ 75695811);
            case 186 -> a(-93131420, var9 ^ -137368301);
            case 187 -> a(-93131419, var9 ^ 562389790);
            case 188 -> a(-93131414, var9 ^ -1794516379);
            case 189 -> a(-93131413, var9 ^ 244576696);
            case 190 -> a(-93131416, var9 ^ 2007800395);
            case 191 -> a(-93131415, var9 ^ 1772797343);
            case 192 -> a(-93131410, var9 ^ 534234246);
            case 193 -> a(-93131409, var9 ^ 707150463);
            case 194 -> a(-93131412, var9 ^ -1819935684);
            case 195 -> a(-93131411, var9 ^ -1675451368);
            case 196 -> a(-93131406, var9 ^ -79761584);
            case 197 -> a(-93131405, var9 ^ 1457562869);
            case 198 -> a(-93131408, var9 ^ 343606770);
            case 199 -> a(-93131407, var9 ^ 2035750871);
            case 200 -> a(-93131402, var9 ^ 1604945229);
            case 201 -> a(-93131401, var9 ^ 205161749);
            case 202 -> a(-93131404, var9 ^ 2119350987);
            case 203 -> a(-93131403, var9 ^ -101818917);
            case 204 -> a(-93131398, var9 ^ 4338302);
            case 205 -> a(-93131397, var9 ^ -370399815);
            case 206 -> a(-93131400, var9 ^ 644441800);
            case 207 -> a(-93131399, var9 ^ -610082025);
            case 208 -> a(-93131394, var9 ^ 1890620745);
            case 209 -> a(-93131393, var9 ^ -1184106547);
            case 210 -> a(-93131396, var9 ^ -785934956);
            case 211 -> a(-93131395, var9 ^ 856493650);
            case 212 -> a(-93131646, var9 ^ 708479414);
            case 213 -> a(-93131645, var9 ^ -1910702104);
            case 214 -> a(-93131648, var9 ^ 2104107541);
            case 215 -> a(-93131647, var9 ^ 2111086597);
            case 216 -> a(-93131642, var9 ^ -2099640403);
            case 217 -> a(-93131641, var9 ^ 417459961);
            case 218 -> a(-93131644, var9 ^ 2078650673);
            case 219 -> a(-93131643, var9 ^ 1095886171);
            case 220 -> a(-93131638, var9 ^ 1982717554);
            case 221 -> a(-93131637, var9 ^ 1525369941);
            case 222 -> a(-93131640, var9 ^ 1850354066);
            case 223 -> a(-93131639, var9 ^ 1806941221);
            case 224 -> a(-93131634, var9 ^ 264778377);
            case 225 -> 1;
            case 226 -> a(-93131633, var9 ^ 518502288);
            case 227 -> a(-93131636, var9 ^ -580133115);
            case 228 -> a(-93131635, var9 ^ 391822212);
            case 229 -> a(-93131630, var9 ^ 1320476722);
            case 230 -> a(-93131629, var9 ^ -1587510810);
            case 231 -> a(-93131632, var9 ^ -1500667104);
            case 232 -> a(-93131631, var9 ^ -1018503532);
            case 233 -> a(-93131626, var9 ^ 405093681);
            case 234 -> a(-93131625, var9 ^ -1152006020);
            case 235 -> a(-93131628, var9 ^ 980018206);
            case 236 -> a(-93131627, var9 ^ 1863577017);
            case 237 -> a(-93131622, var9 ^ 1052240592);
            case 238 -> a(-93131621, var9 ^ 649735884);
            case 239 -> a(-93131624, var9 ^ -566909611);
            case 240 -> a(-93131623, var9 ^ -1340418723);
            case 241 -> a(-93131618, var9 ^ 992029378);
            case 242 -> a(-93131617, var9 ^ -1131898244);
            case 243 -> a(-93131620, var9 ^ 133723570);
            case 244 -> a(-93131619, var9 ^ 1236803236);
            case 245 -> a(-93131614, var9 ^ -1651802530);
            case 246 -> a(-93131613, var9 ^ 2023459759);
            case 247 -> a(-93131616, var9 ^ -915739728);
            case 248 -> a(-93131615, var9 ^ 327943012);
            case 249 -> a(-93131610, var9 ^ -1411836072);
            case 250 -> a(-93131609, var9 ^ 1238816501);
            case 251 -> a(-93131612, var9 ^ 1643034191);
            case 252 -> a(-93131611, var9 ^ 1171453133);
            case 253 -> a(-93131606, var9 ^ -1582723221);
            case 254 -> a(-93131605, var9 ^ 1573781848);
            default -> a(-93131608, var9 ^ -1401110279);
         };
         int var5 = (var1 & a(-93131607, var9 ^ -697057491)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-93131602, var9 ^ -640845721)) >>> a(-93131601, var9 ^ -1304195884)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-93131604, var9 ^ 1183127903);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-93131603, var9 ^ -1235103402);
            }
         }

         ba[var2] = new String(var3).intern();
      }

      return ba[var2];
   }

   private static UUID baaa(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: ifnonnull 0b
      // 08: aconst_null
      // 09: areturn
      // 0a: athrow
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.bb Ljava/lang/reflect/Field;
      // 0e: iload 1
      // 0f: ifne 63
      // 12: ifnull 32
      // 15: goto 19
      // 18: athrow
      // 19: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.bb Ljava/lang/reflect/Field;
      // 1c: iload 1
      // 1d: ifne 6e
      // 20: goto 24
      // 23: athrow
      // 24: invokevirtual java/lang/reflect/Field.getDeclaringClass ()Ljava/lang/Class;
      // 27: aload 0
      // 28: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2b: if_acmpeq 67
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 36: ldc_w -93131598
      // 39: ldc_w 478845595
      // 3c: ldc_w -1724908447
      // 3f: ixor
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 43: ldc_w -93131597
      // 46: ldc_w 478845595
      // 49: ldc_w 1153839775
      // 4c: ixor
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abbb (II)Ljava/lang/String;
      // 53: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 56: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 59: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.bb Ljava/lang/reflect/Field;
      // 5c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.bb Ljava/lang/reflect/Field;
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 1
      // 64: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 67: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.bb Ljava/lang/reflect/Field;
      // 6a: aload 0
      // 6b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6e: astore 2
      // 6f: aload 2
      // 70: iload 1
      // 71: ifne 83
      // 74: instanceof net/minecraft/class_1297
      // 77: ifeq 8e
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 2
      // 7f: goto 83
      // 82: athrow
      // 83: checkcast net/minecraft/class_1297
      // 86: astore 3
      // 87: aload 3
      // 88: invokevirtual net/minecraft/class_1297.method_5667 ()Ljava/util/UUID;
      // 8b: goto 8f
      // 8e: aconst_null
      // 8f: areturn
      // 90: astore 2
      // 91: aconst_null
      // 92: areturn
   }

   private static boolean b(UUID param0) {
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
      // 05: ifnonnull 0b
      // 08: bipush 0
      // 09: ireturn
      // 0a: athrow
      // 0b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0e: astore 2
      // 0f: aload 2
      // 10: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 13: ifnonnull 19
      // 16: bipush 0
      // 17: ireturn
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifne 3c
      // 1e: aload 2
      // 1f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 22: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 25: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 28: ifeq 32
      // 2b: goto 2f
      // 2e: athrow
      // 2f: bipush 1
      // 30: ireturn
      // 31: athrow
      // 32: aload 2
      // 33: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 36: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 39: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 3c: astore 3
      // 3d: aload 3
      // 3e: iload 1
      // 3f: ifne 4a
      // 42: ifnull 5d
      // 45: goto 49
      // 48: athrow
      // 49: aload 0
      // 4a: aload 3
      // 4b: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 4e: iload 1
      // 4f: ifne 5a
      // 52: ifeq 5d
      // 55: goto 59
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
   }

   private static abaaaaba baab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 18
      // 0d: ifnonnull 17
      // 10: goto 14
      // 13: athrow
      // 14: aconst_null
      // 15: areturn
      // 16: athrow
      // 17: aload 1
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.ab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;
      // 1e: astore 2
      // 1f: aload 2
      // 20: iload 0
      // 21: ifne 2c
      // 24: ifnull 42
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 2
      // 2c: iload 0
      // 2d: ifne 3f
      // 30: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.babbaab ()Z
      // 33: ifeq 42
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 2
      // 3b: goto 3f
      // 3e: athrow
      // 3f: goto 43
      // 42: aconst_null
      // 43: areturn
   }

   private static abbba baba(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 011
      // 009: ifnull 01f
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 0
      // 011: invokevirtual java/lang/String.isEmpty ()Z
      // 014: iload 1
      // 015: ifne 02e
      // 018: ifeq 02d
      // 01b: goto 01f
      // 01e: athrow
      // 01f: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbba
      // 022: dup
      // 023: ldc_w ""
      // 026: bipush 0
      // 027: bipush 1
      // 028: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbba.<init> (Ljava/lang/String;ZZ)V
      // 02b: areturn
      // 02c: athrow
      // 02d: bipush 0
      // 02e: istore 2
      // 02f: bipush 0
      // 030: istore 3
      // 031: iload 2
      // 032: aload 0
      // 033: invokevirtual java/lang/String.length ()I
      // 036: if_icmpge 0b7
      // 039: aload 0
      // 03a: iload 1
      // 03b: ifne 0bc
      // 03e: iload 2
      // 03f: invokevirtual java/lang/String.codePointAt (I)I
      // 042: istore 4
      // 044: iload 4
      // 046: iload 1
      // 047: ifne 065
      // 04a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.baa (I)Z
      // 04d: ifne 05c
      // 050: goto 054
      // 053: athrow
      // 054: iload 1
      // 055: ifeq 0b7
      // 058: goto 05c
      // 05b: athrow
      // 05c: bipush 1
      // 05d: istore 3
      // 05e: iload 2
      // 05f: iload 4
      // 061: invokestatic java/lang/Character.charCount (I)I
      // 064: iadd
      // 065: istore 2
      // 066: iload 2
      // 067: aload 0
      // 068: invokevirtual java/lang/String.length ()I
      // 06b: if_icmpge 0b3
      // 06e: aload 0
      // 06f: iload 2
      // 070: invokevirtual java/lang/String.codePointAt (I)I
      // 073: istore 5
      // 075: iload 1
      // 076: ifne 0af
      // 079: iload 1
      // 07a: ifne 031
      // 07d: goto 081
      // 080: athrow
      // 081: iload 5
      // 083: invokestatic java/lang/Character.isWhitespace (I)Z
      // 086: ifne 0a5
      // 089: iload 5
      // 08b: iload 1
      // 08c: ifne 0ae
      // 08f: goto 093
      // 092: athrow
      // 093: invokestatic java/lang/Character.isSpaceChar (I)Z
      // 096: ifne 0a5
      // 099: goto 09d
      // 09c: athrow
      // 09d: iload 1
      // 09e: ifeq 0b3
      // 0a1: goto 0a5
      // 0a4: athrow
      // 0a5: bipush 1
      // 0a6: istore 3
      // 0a7: iload 2
      // 0a8: iload 5
      // 0aa: invokestatic java/lang/Character.charCount (I)I
      // 0ad: iadd
      // 0ae: istore 2
      // 0af: iload 1
      // 0b0: ifeq 066
      // 0b3: iload 1
      // 0b4: ifeq 031
      // 0b7: aload 0
      // 0b8: iload 2
      // 0b9: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0bc: astore 4
      // 0be: aload 4
      // 0c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.aabb (Ljava/lang/String;)Ljava/lang/String;
      // 0c3: astore 5
      // 0c5: iload 3
      // 0c6: aload 5
      // 0c8: aload 4
      // 0ca: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0cd: iload 1
      // 0ce: ifne 0d9
      // 0d1: ifne 0dc
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: bipush 1
      // 0d9: goto 0dd
      // 0dc: bipush 0
      // 0dd: ior
      // 0de: istore 3
      // 0df: aload 5
      // 0e1: invokevirtual java/lang/String.isEmpty ()Z
      // 0e4: ifne 175
      // 0e7: aload 5
      // 0e9: bipush 0
      // 0ea: invokevirtual java/lang/String.codePointAt (I)I
      // 0ed: istore 6
      // 0ef: iload 1
      // 0f0: ifne 171
      // 0f3: iload 6
      // 0f5: invokestatic java/lang/Character.isWhitespace (I)Z
      // 0f8: ifne 163
      // 0fb: goto 0ff
      // 0fe: athrow
      // 0ff: iload 6
      // 101: iload 1
      // 102: ifne 170
      // 105: goto 109
      // 108: athrow
      // 109: invokestatic java/lang/Character.isSpaceChar (I)Z
      // 10c: ifne 163
      // 10f: goto 113
      // 112: athrow
      // 113: iload 6
      // 115: iload 1
      // 116: ifne 170
      // 119: goto 11d
      // 11c: athrow
      // 11d: ldc_w -93131600
      // 120: ldc_w 935121164
      // 123: ldc_w 1598987244
      // 126: ixor
      // 127: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 12a: ldc2_w 2913470671607991750
      // 12d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // 130: if_icmpeq 163
      // 133: goto 137
      // 136: athrow
      // 137: iload 6
      // 139: iload 1
      // 13a: ifne 170
      // 13d: goto 141
      // 140: athrow
      // 141: ldc_w -93131599
      // 144: ldc_w 935121164
      // 147: ldc_w 235674288
      // 14a: ixor
      // 14b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.a (II)I
      // 14e: ldc2_w 7442869035869439873
      // 151: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abaa (IJ)I
      // 154: if_icmpeq 163
      // 157: goto 15b
      // 15a: athrow
      // 15b: iload 1
      // 15c: ifeq 175
      // 15f: goto 163
      // 162: athrow
      // 163: aload 5
      // 165: iload 6
      // 167: invokestatic java/lang/Character.charCount (I)I
      // 16a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 16d: astore 5
      // 16f: bipush 1
      // 170: istore 3
      // 171: iload 1
      // 172: ifeq 0df
      // 175: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbba
      // 178: dup
      // 179: aload 5
      // 17b: iload 3
      // 17c: aload 5
      // 17e: invokevirtual java/lang/String.isBlank ()Z
      // 181: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbba.<init> (Ljava/lang/String;ZZ)V
      // 184: areturn
   }

   static void babb() {
      bb = null;
   }
}
