package nsc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class bbabaab extends abbaabbaa {
   private static final Object[] bbbb;
   private static final Long[] aa;
   private final aaaaa ab;
   private final aaaaa ba;
   private final baabaab bb;
   private final aaaaa aaa;
   private static final String[] aab;
   private static final String[] bbba;
   private final aaaaa aba;
   private final aaaaa abb;
   private final bababa baa;
   private UUID bab;
   private static final long bba;
   private static final String[] bbb;
   private final aaaaa aaaa;
   private static final long[] aaab;
   private Object aaba;
   private final Map aabb;
   private abbbbbb abaa;
   private static final ababbbbaa[] abab;
   private static final double abba = 0.005;
   private final abaabbbb abbb;
   private static final long[] baaa;
   private static final double baab = 144.0;
   private static final int[] bbab;
   private final aaaaa baba;
   private static final Integer[] babb;
   private final aaaaa bbaa;

   public bbabaab() {
      int var1 = -2059076214;
      super(
         aabbaaaba.aaab(bab(a(1125508324, var1 ^ -1538942849), a(1125508325, var1 ^ 1423549532))),
         bbaabbba.aa,
         aabbaaaba.aaab(bab(a(1125508326, var1 ^ -416815582), a(1125508327, var1 ^ -588176945)))
      );
      this.bb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(bab(a(1125508320, var1 ^ 1911292378), a(1125508321, var1 ^ 1450925325))),
            ababbab.class,
            ababbab.bbb
         )
      );
      this.abbb = (abaabbbb)this.abbbaaa(
         new abaabbbb(
            aabbaaaba.aaab(bab(a(1125508322, var1 ^ 180688635), a(1125508323, var1 ^ 1159171872))),
            bbabbab(abab),
            List.of(abab)
         )
      );
      this.aaa = abbbaba(this.abbb, 0);
      this.bbaa = abbbaba(this.abbb, 1);
      this.baba = abbbaba(this.abbb, 2);
      this.aba = abbbaba(this.abbb, 3);
      this.abb = abbbaba(this.abbb, 4);
      this.ba = abbbaba(this.abbb, 5);
      this.ab = abbbaba(this.abbb, ab(a(1125508332, var1 ^ -1651310869), 82009280623144705L));
      this.aaaa = abbbaba(this.abbb, ab(a(1125508333, var1 ^ 1653830961), 8868220427596626716L));
      this.baa = (bababa)this.abbbaaa(
         new bababa(
               aabbaaaba.aaab(bab(a(1125508334, var1 ^ 1909050246), a(1125508335, var1 ^ 971796295))), 40.0, 0.0, 200.0, 10.0
            )
            .bba(aabbaaaba.aaab(bab(a(1125508328, var1 ^ 1296146768), a(1125508329, var1 ^ -1809085498))))
      );
      this.aabb = new HashMap();
      this.bbbabab(this.abbb, new ababbbbaa[0]);
   }

   private static boolean aa(long var0, Entry var2) {
      return abababba.bbb(
         var0, ((baabaa)var2.getValue()).bb, aab(a(1125508330, 76879978 ^ 1028965734), 6451720844978287167L)
      );
   }

   @Override
   public void aabaa() {
      this.bba();
   }

   private static int a(int var0, int var1) {
      int var2 = bbab[var0 ^ 1125508324] ^ var1 ^ var0;
      var2 += 63054;
      var2 += 19748;
      var2 += 54274;
      var2 ^= 21442;
      var2 += 41654;
      return var2 - 12830;
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1125508331, 1749292009 ^ -925882285);
      if (babb[var3] == null) {
         babb[var3] = (int)(aaab[var3] ^ var1);
      }

      return babb[var3];
   }

   @Override
   public void bbaa() {
      int var10000 = baaabbaa.bba;
      class_310 var2 = class_310.method_1551();
      int var1 = var10000;

      try {
         if (!this.aba(var2)) {
            return;
         }
      } catch (MatchException var8) {
         throw var8;
      }

      long var3 = var2.field_1687.method_75260();
      Iterator var5 = var2.field_1687.method_18456().iterator();

      while (true) {
         if (var5.hasNext()) {
            class_1657 var6 = (class_1657)var5.next();

            try {
               if (var1 != 0) {
                  break;
               }

               this.aaab(var2, var6, var3);
               if (var1 == 0) {
                  continue;
               }
            } catch (MatchException var7) {
               throw var7;
            }
         }

         this.aabb.entrySet().removeIf(bbabaab::aa);
         break;
      }
   }

   private boolean ba(class_310 param1, class_1657 param2, String param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 2
      // 004: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 007: astore 5
      // 009: istore 4
      // 00b: aload 5
      // 00d: iload 4
      // 00f: ifne 020
      // 012: ifnonnull 01e
      // 015: goto 019
      // 018: athrow
      // 019: aconst_null
      // 01a: goto 023
      // 01d: athrow
      // 01e: aload 5
      // 020: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 023: astore 6
      // 025: aload 1
      // 026: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 029: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // 02c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 031: astore 7
      // 033: aload 7
      // 035: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03a: ifeq 129
      // 03d: aload 7
      // 03f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 044: checkcast net/minecraft/class_1657
      // 047: astore 8
      // 049: aload 8
      // 04b: iload 4
      // 04d: ifne 05a
      // 050: aload 2
      // 051: if_acmpeq 033
      // 054: goto 058
      // 057: athrow
      // 058: aload 8
      // 05a: iload 4
      // 05c: ifne 06b
      // 05f: invokevirtual net/minecraft/class_1657.method_31481 ()Z
      // 062: ifne 033
      // 065: goto 069
      // 068: athrow
      // 069: aload 8
      // 06b: iload 4
      // 06d: ifne 080
      // 070: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 073: ifne 07e
      // 076: goto 07a
      // 079: athrow
      // 07a: goto 033
      // 07d: athrow
      // 07e: aload 8
      // 080: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.abb (Lnet/minecraft/class_1657;)Ljava/lang/String;
      // 083: astore 9
      // 085: aload 8
      // 087: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 08a: astore 10
      // 08c: aload 10
      // 08e: iload 4
      // 090: ifne 0a1
      // 093: ifnonnull 09f
      // 096: goto 09a
      // 099: athrow
      // 09a: aconst_null
      // 09b: goto 0a4
      // 09e: athrow
      // 09f: aload 10
      // 0a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 0a4: astore 11
      // 0a6: aload 3
      // 0a7: iload 4
      // 0a9: ifne 0b5
      // 0ac: ifnull 0d7
      // 0af: goto 0b3
      // 0b2: athrow
      // 0b3: aload 9
      // 0b5: iload 4
      // 0b7: ifne 0c2
      // 0ba: ifnull 0d7
      // 0bd: goto 0c1
      // 0c0: athrow
      // 0c1: aload 3
      // 0c2: aload 9
      // 0c4: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 0c7: iload 4
      // 0c9: ifne 0d4
      // 0cc: ifeq 0d7
      // 0cf: goto 0d3
      // 0d2: athrow
      // 0d3: bipush 1
      // 0d4: goto 0d8
      // 0d7: bipush 0
      // 0d8: istore 12
      // 0da: aload 6
      // 0dc: iload 4
      // 0de: ifne 0ea
      // 0e1: ifnull 0ff
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: aload 6
      // 0ea: aload 11
      // 0ec: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 0ef: iload 4
      // 0f1: ifne 0fc
      // 0f4: ifeq 0ff
      // 0f7: goto 0fb
      // 0fa: athrow
      // 0fb: bipush 1
      // 0fc: goto 100
      // 0ff: bipush 0
      // 100: istore 13
      // 102: iload 12
      // 104: iload 4
      // 106: ifne 123
      // 109: ifne 122
      // 10c: goto 110
      // 10f: athrow
      // 110: iload 13
      // 112: iload 4
      // 114: ifne 123
      // 117: goto 11b
      // 11a: athrow
      // 11b: ifeq 124
      // 11e: goto 122
      // 121: athrow
      // 122: bipush 1
      // 123: ireturn
      // 124: iload 4
      // 126: ifeq 033
      // 129: bipush 0
      // 12a: ireturn
   }

   private boolean bb(class_1657 param1) {
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
      // 05: invokevirtual net/minecraft/class_1657.method_24828 ()Z
      // 08: iload 2
      // 09: ifne 1c
      // 0c: ifne 5d
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: aload 1
      // 15: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bbb (Lnet/minecraft/class_1657;)Z
      // 18: goto 1c
      // 1b: athrow
      // 1c: iload 2
      // 1d: ifne 41
      // 20: ifne 5d
      // 23: goto 27
      // 26: athrow
      // 27: aload 1
      // 28: invokevirtual net/minecraft/class_1657.method_18798 ()Lnet/minecraft/class_243;
      // 2b: getfield net/minecraft/class_243.field_1351 D
      // 2e: invokestatic java/lang/Math.abs (D)D
      // 31: ldc2_w 0.005
      // 34: iload 2
      // 35: ifne 4d
      // 38: goto 3c
      // 3b: athrow
      // 3c: dcmpg
      // 3d: goto 41
      // 40: athrow
      // 41: ifgt 5d
      // 44: aload 1
      // 45: getfield net/minecraft/class_1657.field_6017 D
      // 48: dconst_0
      // 49: goto 4d
      // 4c: athrow
      // 4d: dcmpg
      // 4e: iload 2
      // 4f: ifne 5a
      // 52: ifgt 5d
      // 55: goto 59
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
   }

   private void aaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: iload 1
      // 05: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbb
      // 08: dup
      // 09: aload 0
      // 0a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 10: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbab
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 17: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 1a: aload 0
      // 1b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 21: aload 0
      // 22: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 25: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 28: aload 0
      // 29: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 2f: aload 0
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 36: aload 0
      // 37: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 3d: aload 0
      // 3e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 44: aload 0
      // 45: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 4b: aload 0
      // 4c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 4f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 52: checkcast java/lang/Double
      // 55: invokevirtual java/lang/Double.doubleValue ()D
      // 58: invokestatic java/lang/Double.doubleToLongBits (D)J
      // 5b: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbb.<init> (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbab;ZZZZZZZZJ)V
      // 5e: astore 2
      // 5f: ifne 7e
      // 62: aload 2
      // 63: aload 0
      // 64: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbb;
      // 67: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbb.equals (Ljava/lang/Object;)Z
      // 6a: ifne 83
      // 6d: goto 71
      // 70: athrow
      // 71: aload 0
      // 72: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aabb Ljava/util/Map;
      // 75: invokeinterface java/util/Map.clear ()V 1
      // 7a: goto 7e
      // 7d: athrow
      // 7e: aload 0
      // 7f: aload 2
      // 80: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.abaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbbb;
      // 83: return
   }

   private static String b(int var0, int var1) {
      int var3 = var0 ^ 1433239910;
      char[] var4 = bbba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bbbb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bbbb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2124391300;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 61;
            case 1 -> 2;
            case 2 -> 198;
            case 3 -> 43;
            case 4 -> 195;
            case 5 -> 7;
            case 6 -> 88;
            case 7 -> 178;
            case 8 -> 72;
            case 9 -> 54;
            case 10 -> 44;
            case 11 -> 18;
            case 12 -> 214;
            case 13 -> 110;
            case 14 -> 73;
            case 15 -> 60;
            case 16 -> 1;
            case 17 -> 23;
            case 18 -> 27;
            case 19 -> 65;
            case 20 -> 15;
            case 21 -> 25;
            case 22 -> 12;
            case 23 -> 83;
            case 24 -> 57;
            case 25 -> 17;
            case 26 -> 144;
            case 27 -> 69;
            case 28 -> 26;
            case 29 -> 182;
            case 30 -> 115;
            case 31 -> 135;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static long aab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(1125508340, 336116648 ^ -198999596)) & a(1125508341, 336116648 ^ 462159048);
      if (aa[var3] == null) {
         aa[var3] = baaa[var3] ^ var1;
      }

      return aa[var3];
   }

   @Override
   public void abaab() {
      this.bba();
   }

   private boolean aba(class_310 param1) {
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
      // 15: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 18: ifnull 32
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 3a
      // 28: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2b: ifnonnull 39
      // 2e: goto 32
      // 31: athrow
      // 32: aload 0
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bba ()V
      // 36: bipush 0
      // 37: ireturn
      // 38: athrow
      // 39: aload 1
      // 3a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3d: invokevirtual net/minecraft/class_746.method_5667 ()Ljava/util/UUID;
      // 40: astore 3
      // 41: iload 2
      // 42: ifne 80
      // 45: aload 0
      // 46: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aaba Ljava/lang/Object;
      // 49: aload 1
      // 4a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 4d: if_acmpne 6b
      // 50: goto 54
      // 53: athrow
      // 54: aload 3
      // 55: aload 0
      // 56: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bab Ljava/util/UUID;
      // 59: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 5c: iload 2
      // 5d: ifne 8a
      // 60: goto 64
      // 63: athrow
      // 64: ifne 85
      // 67: goto 6b
      // 6a: athrow
      // 6b: aload 0
      // 6c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aabb Ljava/util/Map;
      // 6f: invokeinterface java/util/Map.clear ()V 1
      // 74: aload 0
      // 75: aload 1
      // 76: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 79: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aaba Ljava/lang/Object;
      // 7c: goto 80
      // 7f: athrow
      // 80: aload 0
      // 81: aload 3
      // 82: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bab Ljava/util/UUID;
      // 85: aload 0
      // 86: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aaa ()V
      // 89: bipush 1
      // 8a: ireturn
   }

   private static String abb(class_1657 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 1b
      // 0e: ifnonnull 1a
      // 11: goto 15
      // 14: athrow
      // 15: aconst_null
      // 16: goto 1e
      // 19: athrow
      // 1a: aload 2
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 1e: areturn
   }

   private static String bab(int var0, int var1) {
      int var9 = 701272545;
      int var2 = (var0 ^ a(1125508267, var9 ^ -1503584548)) & a(1125508276, var9 ^ -1349331110);
      if (bbb[var2] == null) {
         char[] var3 = aab[var2].toCharArray();

         int var4 = switch (var3[0] & a(1125508277, var9 ^ 617732124)) {
            case 0 -> a(1125508278, var9 ^ -131466853);
            case 1 -> a(1125508279, var9 ^ 527619479);
            case 2 -> a(1125508272, var9 ^ -1860003190);
            case 3 -> a(1125508273, var9 ^ -1457156204);
            case 4 -> a(1125508274, var9 ^ 64346112);
            case 5 -> a(1125508275, var9 ^ -1077863248);
            case 6 -> a(1125508284, var9 ^ 2035725833);
            case 7 -> a(1125508285, var9 ^ -1041486449);
            case 8 -> a(1125508286, var9 ^ -1538194752);
            case 9 -> a(1125508287, var9 ^ -1366838907);
            case 10 -> a(1125508280, var9 ^ -337345601);
            case 11 -> a(1125508281, var9 ^ -1897861331);
            case 12 -> a(1125508282, var9 ^ 1351832979);
            case 13 -> a(1125508283, var9 ^ 225927576);
            case 14 -> a(1125508228, var9 ^ 1415887622);
            case 15 -> a(1125508229, var9 ^ 1080869962);
            case 16 -> a(1125508230, var9 ^ -863398311);
            case 17 -> a(1125508231, var9 ^ 1465340843);
            case 18 -> a(1125508224, var9 ^ -1104132884);
            case 19 -> a(1125508225, var9 ^ 1370779792);
            case 20 -> a(1125508226, var9 ^ -1198162971);
            case 21 -> a(1125508227, var9 ^ 669558864);
            case 22 -> a(1125508236, var9 ^ 767127399);
            case 23 -> a(1125508237, var9 ^ -1701749900);
            case 24 -> a(1125508238, var9 ^ 295711181);
            case 25 -> a(1125508239, var9 ^ -190329951);
            case 26 -> a(1125508232, var9 ^ -775561128);
            case 27 -> a(1125508233, var9 ^ -1150414388);
            case 28 -> a(1125508234, var9 ^ -1427240984);
            case 29 -> a(1125508235, var9 ^ 793442349);
            case 30 -> a(1125508244, var9 ^ -1988161050);
            case 31 -> a(1125508245, var9 ^ 2019638943);
            case 32 -> a(1125508246, var9 ^ 1081444124);
            case 33 -> a(1125508247, var9 ^ 854135814);
            case 34 -> a(1125508240, var9 ^ -221366260);
            case 35 -> a(1125508241, var9 ^ 549169208);
            case 36 -> 0;
            case 37 -> a(1125508242, var9 ^ 928703601);
            case 38 -> a(1125508243, var9 ^ -2048069246);
            case 39 -> a(1125508252, var9 ^ -617977586);
            case 40 -> a(1125508253, var9 ^ 614651628);
            case 41 -> a(1125508254, var9 ^ -1669068555);
            case 42 -> a(1125508255, var9 ^ 316728286);
            case 43 -> a(1125508248, var9 ^ -1966310941);
            case 44 -> a(1125508249, var9 ^ -394629630);
            case 45 -> a(1125508250, var9 ^ -439290777);
            case 46 -> a(1125508251, var9 ^ -287602086);
            case 47 -> a(1125508196, var9 ^ -2111585487);
            case 48 -> a(1125508197, var9 ^ 1512823929);
            case 49 -> a(1125508198, var9 ^ 1245570413);
            case 50 -> a(1125508199, var9 ^ -1745068876);
            case 51 -> a(1125508192, var9 ^ -1772626226);
            case 52 -> a(1125508193, var9 ^ -2034145182);
            case 53 -> a(1125508194, var9 ^ -158864136);
            case 54 -> a(1125508195, var9 ^ -49164106);
            case 55 -> a(1125508204, var9 ^ 1042104009);
            case 56 -> a(1125508205, var9 ^ -1076148504);
            case 57 -> a(1125508206, var9 ^ -1180638167);
            case 58 -> a(1125508207, var9 ^ 1857813498);
            case 59 -> a(1125508200, var9 ^ 809067173);
            case 60 -> a(1125508201, var9 ^ -1636840852);
            case 61 -> a(1125508202, var9 ^ -231858884);
            case 62 -> a(1125508203, var9 ^ -799689508);
            case 63 -> a(1125508212, var9 ^ -480675403);
            case 64 -> 2;
            case 65 -> a(1125508213, var9 ^ 1704982695);
            case 66 -> a(1125508214, var9 ^ 1218616015);
            case 67 -> a(1125508215, var9 ^ -2037012146);
            case 68 -> a(1125508208, var9 ^ 1490293259);
            case 69 -> a(1125508209, var9 ^ 874409725);
            case 70 -> a(1125508210, var9 ^ -549742243);
            case 71 -> a(1125508211, var9 ^ 330022011);
            case 72 -> a(1125508220, var9 ^ -1700052906);
            case 73 -> a(1125508221, var9 ^ 431795457);
            case 74 -> a(1125508222, var9 ^ -653946217);
            case 75 -> a(1125508223, var9 ^ -31319128);
            case 76 -> a(1125508216, var9 ^ 1729066681);
            case 77 -> a(1125508217, var9 ^ -710105460);
            case 78 -> a(1125508218, var9 ^ 1806710296);
            case 79 -> a(1125508219, var9 ^ -10550691);
            case 80 -> a(1125508164, var9 ^ -1428158503);
            case 81 -> a(1125508165, var9 ^ 118770598);
            case 82 -> a(1125508166, var9 ^ -65794664);
            case 83 -> a(1125508167, var9 ^ -1792298807);
            case 84 -> a(1125508160, var9 ^ 435875786);
            case 85 -> a(1125508161, var9 ^ -1809248398);
            case 86 -> a(1125508162, var9 ^ 1417977881);
            case 87 -> a(1125508163, var9 ^ 1378463517);
            case 88 -> a(1125508172, var9 ^ -28800541);
            case 89 -> a(1125508173, var9 ^ -1926309931);
            case 90 -> a(1125508174, var9 ^ -912320209);
            case 91 -> a(1125508175, var9 ^ 15323219);
            case 92 -> a(1125508168, var9 ^ 1134015300);
            case 93 -> a(1125508169, var9 ^ 1636783715);
            case 94 -> a(1125508170, var9 ^ -1278504885);
            case 95 -> a(1125508171, var9 ^ -126900518);
            case 96 -> a(1125508180, var9 ^ 703328114);
            case 97 -> a(1125508181, var9 ^ -1066241203);
            case 98 -> a(1125508182, var9 ^ -1014628122);
            case 99 -> a(1125508183, var9 ^ 1293717079);
            case 100 -> a(1125508176, var9 ^ 1486554817);
            case 101 -> a(1125508177, var9 ^ 204841439);
            case 102 -> a(1125508178, var9 ^ 91495014);
            case 103 -> a(1125508179, var9 ^ -240122900);
            case 104 -> a(1125508188, var9 ^ -457760086);
            case 105 -> a(1125508189, var9 ^ -1717815125);
            case 106 -> a(1125508190, var9 ^ -7360663);
            case 107 -> a(1125508191, var9 ^ -1270521287);
            case 108 -> a(1125508184, var9 ^ -538382731);
            case 109 -> a(1125508185, var9 ^ 243857256);
            case 110 -> a(1125508186, var9 ^ -2047238427);
            case 111 -> a(1125508187, var9 ^ -131379496);
            case 112 -> a(1125508132, var9 ^ -1586896811);
            case 113 -> a(1125508133, var9 ^ 1240083308);
            case 114 -> a(1125508134, var9 ^ 461681974);
            case 115 -> a(1125508135, var9 ^ 965356077);
            case 116 -> a(1125508128, var9 ^ -272150851);
            case 117 -> a(1125508129, var9 ^ -72103774);
            case 118 -> a(1125508130, var9 ^ -732696348);
            case 119 -> a(1125508131, var9 ^ 1482464369);
            case 120 -> a(1125508140, var9 ^ -379457015);
            case 121 -> a(1125508141, var9 ^ -810346187);
            case 122 -> a(1125508142, var9 ^ -113252704);
            case 123 -> a(1125508143, var9 ^ 1485413982);
            case 124 -> 1;
            case 125 -> a(1125508136, var9 ^ 2034475258);
            case 126 -> a(1125508137, var9 ^ -2110292459);
            case 127 -> a(1125508138, var9 ^ 1077632634);
            case 128 -> a(1125508139, var9 ^ 1345891655);
            case 129 -> a(1125508148, var9 ^ -155796946);
            case 130 -> a(1125508149, var9 ^ 545244356);
            case 131 -> a(1125508150, var9 ^ 1809951085);
            case 132 -> a(1125508151, var9 ^ -826342409);
            case 133 -> a(1125508144, var9 ^ -91251158);
            case 134 -> a(1125508145, var9 ^ 1359861708);
            case 135 -> a(1125508146, var9 ^ 731187746);
            case 136 -> a(1125508147, var9 ^ -466573790);
            case 137 -> a(1125508156, var9 ^ -582867590);
            case 138 -> a(1125508157, var9 ^ -1166116229);
            case 139 -> a(1125508158, var9 ^ -272980289);
            case 140 -> a(1125508159, var9 ^ -571326875);
            case 141 -> a(1125508152, var9 ^ -428597956);
            case 142 -> a(1125508153, var9 ^ -1002141222);
            case 143 -> a(1125508154, var9 ^ 1614418600);
            case 144 -> a(1125508155, var9 ^ -519055342);
            case 145 -> a(1125508100, var9 ^ 701600861);
            case 146 -> a(1125508101, var9 ^ -2341427);
            case 147 -> a(1125508102, var9 ^ -1566371437);
            case 148 -> a(1125508103, var9 ^ 391848405);
            case 149 -> a(1125508096, var9 ^ -812206850);
            case 150 -> a(1125508097, var9 ^ 990158961);
            case 151 -> a(1125508098, var9 ^ -1192422152);
            case 152 -> a(1125508099, var9 ^ 1068982280);
            case 153 -> a(1125508108, var9 ^ 1151202293);
            case 154 -> a(1125508109, var9 ^ 1175216689);
            case 155 -> a(1125508110, var9 ^ -524401965);
            case 156 -> a(1125508111, var9 ^ -1924561537);
            case 157 -> a(1125508104, var9 ^ -434318776);
            case 158 -> a(1125508105, var9 ^ 1329295688);
            case 159 -> a(1125508106, var9 ^ 1904734075);
            case 160 -> a(1125508107, var9 ^ -1066500721);
            case 161 -> a(1125508116, var9 ^ 342626807);
            case 162 -> a(1125508117, var9 ^ -799154811);
            case 163 -> a(1125508118, var9 ^ 921141820);
            case 164 -> a(1125508119, var9 ^ 1228525581);
            case 165 -> a(1125508112, var9 ^ -458333400);
            case 166 -> a(1125508113, var9 ^ 1280530513);
            case 167 -> a(1125508114, var9 ^ -2001484164);
            case 168 -> a(1125508115, var9 ^ 1223016890);
            case 169 -> a(1125508124, var9 ^ -164349841);
            case 170 -> 5;
            case 171 -> a(1125508125, var9 ^ -669514582);
            case 172 -> a(1125508126, var9 ^ 1215428364);
            case 173 -> a(1125508127, var9 ^ 667840461);
            case 174 -> a(1125508120, var9 ^ 1602641626);
            case 175 -> a(1125508121, var9 ^ -1085181624);
            case 176 -> a(1125508122, var9 ^ -2133336062);
            case 177 -> a(1125508123, var9 ^ -1260056532);
            case 178 -> a(1125508580, var9 ^ -298427828);
            case 179 -> a(1125508581, var9 ^ -1408365115);
            case 180 -> a(1125508582, var9 ^ 1823474174);
            case 181 -> a(1125508583, var9 ^ -797347090);
            case 182 -> a(1125508576, var9 ^ 1251165676);
            case 183 -> a(1125508577, var9 ^ 615009351);
            case 184 -> a(1125508578, var9 ^ -621066252);
            case 185 -> a(1125508579, var9 ^ -1787744862);
            case 186 -> a(1125508588, var9 ^ -1790777506);
            case 187 -> a(1125508589, var9 ^ -1849350120);
            case 188 -> a(1125508590, var9 ^ 1242695441);
            case 189 -> a(1125508591, var9 ^ 1003529742);
            case 190 -> a(1125508584, var9 ^ -942632621);
            case 191 -> a(1125508585, var9 ^ -1022145911);
            case 192 -> a(1125508586, var9 ^ 1147961013);
            case 193 -> 4;
            case 194 -> a(1125508587, var9 ^ -65400044);
            case 195 -> a(1125508596, var9 ^ 1434727525);
            case 196 -> a(1125508597, var9 ^ 1677820507);
            case 197 -> a(1125508598, var9 ^ -1809282901);
            case 198 -> a(1125508599, var9 ^ 1049183921);
            case 199 -> a(1125508592, var9 ^ -1481548821);
            case 200 -> a(1125508593, var9 ^ 1729961668);
            case 201 -> a(1125508594, var9 ^ 1118628473);
            case 202 -> a(1125508595, var9 ^ -740199993);
            case 203 -> a(1125508604, var9 ^ -109840318);
            case 204 -> a(1125508605, var9 ^ -1052038278);
            case 205 -> a(1125508606, var9 ^ -1293753543);
            case 206 -> a(1125508607, var9 ^ -1453235539);
            case 207 -> a(1125508600, var9 ^ -408293111);
            case 208 -> a(1125508601, var9 ^ 1090810912);
            case 209 -> a(1125508602, var9 ^ -1042480375);
            case 210 -> a(1125508603, var9 ^ 443632222);
            case 211 -> a(1125508548, var9 ^ -1140559499);
            case 212 -> 3;
            case 213 -> a(1125508549, var9 ^ 2022628857);
            case 214 -> a(1125508550, var9 ^ 1144210751);
            case 215 -> a(1125508551, var9 ^ 1091946593);
            case 216 -> a(1125508544, var9 ^ 673319839);
            case 217 -> a(1125508545, var9 ^ -830287932);
            case 218 -> a(1125508546, var9 ^ 1463136440);
            case 219 -> a(1125508547, var9 ^ 208613114);
            case 220 -> a(1125508556, var9 ^ 916302836);
            case 221 -> a(1125508557, var9 ^ 483255265);
            case 222 -> a(1125508558, var9 ^ -1853872609);
            case 223 -> a(1125508559, var9 ^ 939968771);
            case 224 -> a(1125508552, var9 ^ 1953991130);
            case 225 -> a(1125508553, var9 ^ 1877993551);
            case 226 -> a(1125508554, var9 ^ 216192054);
            case 227 -> a(1125508555, var9 ^ 404746123);
            case 228 -> a(1125508564, var9 ^ -1536047825);
            case 229 -> a(1125508565, var9 ^ 1774956492);
            case 230 -> a(1125508566, var9 ^ 141836340);
            case 231 -> a(1125508567, var9 ^ -1143078165);
            case 232 -> a(1125508560, var9 ^ 130560801);
            case 233 -> a(1125508561, var9 ^ 1999572764);
            case 234 -> a(1125508562, var9 ^ -1311793883);
            case 235 -> a(1125508563, var9 ^ 766636016);
            case 236 -> a(1125508572, var9 ^ 1349984148);
            case 237 -> a(1125508573, var9 ^ -437969468);
            case 238 -> a(1125508574, var9 ^ -796983098);
            case 239 -> a(1125508575, var9 ^ -473389482);
            case 240 -> a(1125508568, var9 ^ -1307974044);
            case 241 -> a(1125508569, var9 ^ -891468387);
            case 242 -> a(1125508570, var9 ^ 1322178714);
            case 243 -> a(1125508571, var9 ^ -1309345465);
            case 244 -> a(1125508516, var9 ^ -633461457);
            case 245 -> a(1125508517, var9 ^ -1860684151);
            case 246 -> a(1125508518, var9 ^ 1307943694);
            case 247 -> a(1125508519, var9 ^ 306126430);
            case 248 -> a(1125508512, var9 ^ -1408976428);
            case 249 -> a(1125508513, var9 ^ 36707954);
            case 250 -> a(1125508514, var9 ^ -1150805681);
            case 251 -> a(1125508515, var9 ^ 1247183792);
            case 252 -> a(1125508524, var9 ^ -134980162);
            case 253 -> a(1125508525, var9 ^ 87573263);
            case 254 -> a(1125508526, var9 ^ -1144874244);
            default -> a(1125508527, var9 ^ 715370060);
         };
         int var5 = (var1 & a(1125508520, var9 ^ 2070771784)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1125508521, var9 ^ -1092124679)) >>> a(1125508522, var9 ^ -1403313927)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1125508523, var9 ^ 153027421);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1125508532, var9 ^ 995175573);
            }
         }

         bbb[var2] = new String(var3).intern();
      }

      return bbb[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -1717266070;
      int var30 = "ŋ阍鶔鬍鶟鰽嶟鐍嶐黝㶕閍鶔雭㶜闍ﶔ雽涒馝\ufd90鎍춗鹝䶞麝\udd95鹝涖鄽鶛遝\u2d97銝궔靽\u2d9f髍趒邍鶕额綝頍䶙霍綒鲍嶚逝涙霍鶑馭嶜鳽ග郍嶔鶭\ued92錝\ued95鳭\udd9f銽趟饝추钭ᶞ馍嶓騍趔颍涒顝\ued99鏍ⶒ骭㶕錍ᶙ錍鶔鳽趛醝嶔髭붒酽ﶝ钽涜雝鶓鯭嶓鸝㶝逍涞駭ᶓ鮍\udd96都붓鬽涛鰝䶕馭涓陝嶛馽綟餭䶘釽춙鉭\u2d97頽鶛重붗鎭ﶛ鉽춗額ﶗ餍ᶙ鑍鶛鍍ﶚ闍䶝驝ᶗ阝䶙霽궐鳭綘鹽ﶝ餽ﶓ髭춖陽鶑鄭ඓ閭㶐麽㶚鸽涖鞽\ued93鬝붕隽궝鮽\ued97鶝綟邭䶞鈽涘鯭嶘镭\ued92鞽ⶒ驍붘鏽ᶖ鎽\udd9f麽涙镽ﶝ鷝붟鐭\u2d97遍涙頍ᶔ鹍එ鹝출鐽\u0d98馝ᶓ鶝ᶓ饭춟鋍ᶖ飝추頍\ued95鲝\ued93駝\u2d9f鎝嶒镍䶐鶝鶟铽ᶖ錍涖鮽綛顽춞锽綝靽ᶔ龍ඕ鳍趙龝궓闝嶟額嶔钽궛醽ﶔ铽붒霽ᶗ韭\udd95鋽䶝鎍ⶑ颍\ued93駭\ued91鮍㶞黽ඛ骽涕鿝㶟髍趒鶽궘隝\udd9d龭ඛ鵭趜驭ﶖ鉍㶑逽ﶙ龝\ufd91鳭䶒闍嶒麝嶞鹍추騽ඒ鄽궒鐍\udd97鑝\udd91配축隭\ued95醍\udd98鞝涝鸭궟髽ඐ雝趕钭=ꇅ떤꼥喦궕㖩ꁕ֧곥֬꽅얣꠵\ue5a4ꥵ閣ꢥ喩꾕□괥疤괕薣곕薫ꉵᖫꋥ䖭ꦅ얥ꍕᖧꈅ\ue5a0ꘕ▬귥疦ꛥ▥ꨥ떤ꈕ薩겕떫꩕얨ꣵ閯ꞅ㖪꽕㖪깵㖤ꙕ䖧ꁵ 뵙㦵뚙妾뙙禹냩禾뽙馵똉馼뾉\u09bb냩র늩립뱉즵뚩㦿녹妳믹覱뗙覲뾹覹눹\ue9bd\n韃鎕頓\ue390鼳玓陓㎘雓\uf390\u0010岄呑年\uf451勄鑙叔摕墄둝娤\uf453厔\ue450妤\uf450\n削ᩐ嶚橕媺節叚멝博穕\u0010诎Ẋ葾躁賞꺁诎庅辎躉轮⺎萾躁膾캎\n᜴搕ᣤᐐῄ萓ᚤ쐘ᘤА"
         .length();
      String var29 = "ŋ阍鶔鬍鶟鰽嶟鐍嶐黝㶕閍鶔雭㶜闍ﶔ雽涒馝\ufd90鎍춗鹝䶞麝\udd95鹝涖鄽鶛遝\u2d97銝궔靽\u2d9f髍趒邍鶕额綝頍䶙霍綒鲍嶚逝涙霍鶑馭嶜鳽ග郍嶔鶭\ued92錝\ued95鳭\udd9f銽趟饝추钭ᶞ馍嶓騍趔颍涒顝\ued99鏍ⶒ骭㶕錍ᶙ錍鶔鳽趛醝嶔髭붒酽ﶝ钽涜雝鶓鯭嶓鸝㶝逍涞駭ᶓ鮍\udd96都붓鬽涛鰝䶕馭涓陝嶛馽綟餭䶘釽춙鉭\u2d97頽鶛重붗鎭ﶛ鉽춗額ﶗ餍ᶙ鑍鶛鍍ﶚ闍䶝驝ᶗ阝䶙霽궐鳭綘鹽ﶝ餽ﶓ髭춖陽鶑鄭ඓ閭㶐麽㶚鸽涖鞽\ued93鬝붕隽궝鮽\ued97鶝綟邭䶞鈽涘鯭嶘镭\ued92鞽ⶒ驍붘鏽ᶖ鎽\udd9f麽涙镽ﶝ鷝붟鐭\u2d97遍涙頍ᶔ鹍එ鹝출鐽\u0d98馝ᶓ鶝ᶓ饭춟鋍ᶖ飝추頍\ued95鲝\ued93駝\u2d9f鎝嶒镍䶐鶝鶟铽ᶖ錍涖鮽綛顽춞锽綝靽ᶔ龍ඕ鳍趙龝궓闝嶟額嶔钽궛醽ﶔ铽붒霽ᶗ韭\udd95鋽䶝鎍ⶑ颍\ued93駭\ued91鮍㶞黽ඛ骽涕鿝㶟髍趒鶽궘隝\udd9d龭ඛ鵭趜驭ﶖ鉍㶑逽ﶙ龝\ufd91鳭䶒闍嶒麝嶞鹍추騽ඒ鄽궒鐍\udd97鑝\udd91配축隭\ued95醍\udd98鞝涝鸭궟髽ඐ雝趕钭=ꇅ떤꼥喦궕㖩ꁕ֧곥֬꽅얣꠵\ue5a4ꥵ閣ꢥ喩꾕□괥疤괕薣곕薫ꉵᖫꋥ䖭ꦅ얥ꍕᖧꈅ\ue5a0ꘕ▬귥疦ꛥ▥ꨥ떤ꈕ薩겕떫꩕얨ꣵ閯ꞅ㖪꽕㖪깵㖤ꙕ䖧ꁵ 뵙㦵뚙妾뙙禹냩禾뽙馵똉馼뾉\u09bb냩র늩립뱉즵뚩㦿녹妳믹覱뗙覲뾹覹눹\ue9bd\n韃鎕頓\ue390鼳玓陓㎘雓\uf390\u0010岄呑年\uf451勄鑙叔摕墄둝娤\uf453厔\ue450妤\uf450\n削ᩐ嶚橕媺節叚멝博穕\u0010诎Ẋ葾躁賞꺁诎庅辎躉轮⺎萾躁膾캎\n᜴搕ᣤᐐῄ萓ᚤ쐘ᘤА";
      String[] var10000 = new String[8];
      int var32 = 0;
      short var34 = 17670;
      String[] var31 = var10000;
      int var33 = 0;

      do {
         char var35 = var29.charAt(var33);
         String var44 = var29.substring(var33 + 1, var33 + 1 + var35);
         int var37 = 0;
         char[] var36 = var44.toCharArray();

         do {
            char var38 = var36[var37];
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 4 | var38 << '\f') & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 4 | var38 >>> '\f') & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      bbba = var31;
      bbbb = new Object[var31.length];
      int var25 = -1773551564;
      byte[] var23 = "\u000b P¨û<ãÜHÂ-ss\u0014\u008eßÞ\tÉ\bù\u009ePE¥ Þ6êòN\u00162w½»ÍvÂjÞ,\u0000Ý\u0096\t{³â¤i\u0089;ÎäQ\u0013`$±\u008a5\u009f\u009aÊ\u008a\u0091x%!&\u0090\u000ei\faÓ\u001f\u0003ú-¨\u0015ö»çkXs\u0097ªÅã\r$_ÑDB\nÐø\"Þ\u001do_\by\u001e1ÈÙÎ.mF\u0080\u0007\u0099[4»\bòqnA#þS9]>â6\u0004§\u001d<öKÖ\u001c`ß\\>\u0091T\u009e\u0016\u0013Ô-®\u009f\u009b\u001dèa\tà\u008d\u009c\u0085ü¶^véáé¨Tû\u0015töìZÒÎ\u0004\r\u000f\u009de\u008dÊ\u000bg\u00045\u0094¾'8\t¥êNë)g&s©\u009e\u00862bòòÈã©ÂÌV\u001dtLþ¾\u0018^\u0098Ø\u009bñ:\u009c^è\u001bÒ·\u0093\u007fåÕ©äpxi¹\u0010×ðBg¦½)8z~~\u0012à\u0083`êËý/\u0088æxÏü+\u0004\u0016ø\";qP\n8äfNÓê\u008eP\u009aXØ\u0083©R&¹\u009bì\u0090'âÝ¦\u001eÂ\u0006\u0086¯±ÔW\u0016Pü¥\fº0¬ü§\n'¼ÁMûDàæ\u001c\u001fÌí\u0092O\u0083ÇªH\u0096¢\u0000¸Á\u0014¼¬\u0005\u00adz;ÇöÂ\u00814o§<\u001bÿ\u00adêÁÑè\u0089òz\u008d\u008dö[Sþ%Á\u000e\u001axÑW\tÊûC\u0001µÆÏä\u008fhT:J\u008d½]5KRÙ\u0001U»ø\nr$\u0085±l.ÔvA\u0099ü+.\u0012Í@\u0003÷ÊÒ}Ò¨ù ¸\u0003`h©\u0083\u001e7,'\u0089í\u008a\u0012`\u0018{\fO\u0012C\u0018÷\u00171\u0084d\u000fñ£!\u0018#ÖÙÓ47ý#\u0086\u0081\u0081\u0086ØG\u0018\u0089'ÏÏÅ\u009féy\u001d\u0011\u008d\u0092*\u0089¡\b\bë\u0017\u001fÙæ½\u0084,í¶û\u0098\u0081N²\u0014YFÅ¹IP\u0094~\u0094\u0091E^\u0095:ÇZ\u0085¬\u0019Nõê\u009dÒþ|ÉW=pOÒ¼¶_ÓºÍ\u0095pmÖ\u008a¨3T\u0013è\u009d\u0002»jñClyÓ8Å®à4`Yfòá\u0010KÏëÛ\u0085øØ9[¹\u000bÁ7swsÜV\u0080Ü\u0010ÆÍp\u0099Æ1f\u001aÑ´åÚh\u008b-ýO\u0002\u0011dboMÖÁ¿\u0010hÝ/éü2\u001b\u008f©\u008dwq\u0004yR_ÿy\u0014:\u0096FÁª\u001a\u0097öC\u0097D~LWéÑAQD¶\tý%ùz\u008eC¦ÑÊòhl\u0003\u0084 È@úÂ%bâ'^°¦áaû\u0002¿)*\u0086\u009eTÃ\u001f\u0003\u0084Àëq¢Nq\u0097÷[öw³\u000fX¸#\u0006\u0019\u0003`òÝr\u0089çÚ;\r\u009añ!yüâÞ\u0005·(\u0012´Ü\u0085\u009f\r\råîa\u0086\u0094ï\u0084ûF>^¢\u0004\u0091\u0012J\u00872ú\u0018éÄy:ç3Ñìª?¡øÞÑe×>\u0081Ñ[1\u0085\u0095ê\f\u0083cÌÞh)úRÿ?[ä\u0087»z.¹v\u0081Z\u000e\u00adCV/cSUÝ¼õÛ£â#\u0012´\"h\u008cØ=ÍÒ\u001a5ùâ\u0087\u0090R`Î\u001a(ø{Hç]¿ºÞ/<\u001a¹\u0013\u000b7ì××¢Þ\u009f'úå\u0019l>Ç)\u0090ScWcéâbÁ²*¼\u008dþü±\\u¡Î`Ò\u00146PôÌûÅõ8iÐà»\u0080eì<Ú\u0011\u0005Gðê8Ea\u0013gãÓ[\u001e\u008e$\u009cÜåq£uLV\u0001×rêö\u008bÃ\u0003\f\u0095\u0017\u0001`©Ó0\u00ad\u00055\u008a\u009bÖJT¡UçÃ\u0012\u0006O>Aï\u008bÞ·jK\u0088°çõYIYÛuu\u0096K\u001cî\u009a$£vz\\ëG\u009d¼<\u0000?\u0083º\u0091\f·\u0088\t\u0094í[B.¯c\u0015\u0099oÝ\u0019\u0091Ó\u0014j÷Iþ4á'ÅT\u007fÙ\u00967f\u0096\u001c\\Õ\u0096/\u0097\u009c\u0092¨0uI\u007fvm8½ÖíÄ½á³À~RÖG\u0001\u000e!ÿwc\u0092Vé,_glòô\u0097Eø^=ä6*¤Ü+\u007fdpn2AÁ\u009a\u008eÐ\u008ciìú\u001e\u0088¢Â&[ï±\u008f\u0093¦ª\fz\u009aäÄérBil\u0087Â°sñ\u0019\u001c:¸¿i\u0001»{ã¬êG^4%Bx¹5+O\u0013\u009aÍï¿yTX¨ \u000f\u0002_Ð5ð³\u0083\u001f û©\u0092íW;;k¹ôw\u001aù&l\u0082\u0098\u0099\u000f\u008fÌB\u001br\u009e\u009e§\u001cµýj¦ß5\u000b\u0019Xl¸³\u001a\u0089\u0004¥C\u0096tB\u007fÌ²¢íä.Ü÷\u0091S\u001a\u0007\u0084æ\u0088m\\Ó\u0012\u0018éà¥Ö\u0099±d\u0096\u0094É°]²M£ÀÚ²\u0099\u0088CÙST\u0014\u0092uF\u0015N\u0098Ó\u0083\u0011R\u0006«¯iÉj\u0001]nì¸\u0005\u0001\u0014I;ó\u001cô\u0099EC\u0006U3Ç¸¯\u0082ð)ÎÞÓx\u0000`\u0004½\u0089\u000e´¯6Q¸\nr\u001b\u00128<4Å¾æá\u008d"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      bbab = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         bbab[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[a(1125508342, var39 ^ -1116965751)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b(1433239910, var39 ^ 1719768355)).length();
      int var17 = a(1125508343, var39 ^ 1612348061);
      int var42 = -1;

      label120:
      while (true) {
         String var45 = var18.substring(++var42, var42 + var17);
         int var10001 = -1;

         while (true) {
            char[] var70;
            label115: {
               char[] var53 = var45.toCharArray();
               int var10003 = var53.length;
               int var22 = 0;
               var70 = var53;
               var10001 = var10003;
               char[] var83;
               int var10004;
               if (var10003 <= 1) {
                  var83 = var53;
                  var10004 = var22;
               } else {
                  var70 = var53;
                  var10001 = var10003;
                  if (var10003 <= var22) {
                     break label115;
                  }

                  var83 = var53;
                  var10004 = var22;
               }

               while (true) {
                  var83[var10004] = (char)(var83[var10004] ^ switch (var22 % a(1125508338, var39 ^ -1064119728)) {
                     case 0 -> a(1125508339, var39 ^ 1342725369);
                     case 1 -> a(1125508348, var39 ^ 1648442232);
                     case 2 -> a(1125508349, var39 ^ 1677548153);
                     case 3 -> a(1125508350, var39 ^ -1368774680);
                     case 4 -> a(1125508351, var39 ^ -904181618);
                     case 5 -> a(1125508344, var39 ^ 1791711064);
                     default -> a(1125508345, var39 ^ -175800459);
                  });
                  var22++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var83 = var70;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var83 = var70;
                     var10004 = var22;
                  }
               }
            }

            String var90 = new String(var70).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var90;
                  if ((var42 += var17) >= var20) {
                     aab = var21;
                     bbb = new String[a(1125508337, var39 ^ 149033911)];
                     long var8 = 2427102644616038254L;
                     long[] var14 = new long[a(1125508346, var39 ^ -399391852)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = b(1433239908, var39 ^ 610380245)).length();
                     byte var10 = 0;

                     label94:
                     while (true) {
                        int var60 = var10;
                        var10 += 8;
                        String var47 = var12.substring(var60, var10);
                        var60 = 1433239909;
                        int var76 = var39 ^ -2042255112;
                        byte[] var15 = var47.getBytes("ISO-8859-1");
                        long[] var48 = var14;
                        var60 = var11++;
                        long var77 = (var15[0] & 255L) << a(1125508347, var39 ^ 1098127114)
                           | (var15[1] & 255L) << a(1125508292, var39 ^ -1862587835)
                           | (var15[2] & 255L) << a(1125508293, var39 ^ -298083469)
                           | (var15[3] & 255L) << a(1125508294, var39 ^ -1214094222)
                           | (var15[4] & 255L) << a(1125508295, var39 ^ 1162784587)
                           | (var15[5] & 255L) << a(1125508288, var39 ^ -740678426)
                           | (var15[a(1125508289, var39 ^ 575792817)] & 255L) << a(1125508290, var39 ^ -1596893940)
                           | var15[a(1125508291, var39 ^ 748578124)] & 255L;
                        byte var91 = -1;

                        while (true) {
                           long var95 = var77 ^ var8;
                           switch (var91) {
                              case 0:
                                 var48[var60] = var95;
                                 if (var10 >= var13) {
                                    aaab = var14;
                                    babb = new Integer[a(1125508309, var39 ^ -1807912682)];
                                    long var0 = 4877687866893766027L;
                                    long[] var6 = new long[2];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = b(1433239904, var39 ^ 1473703401)).length();
                                    byte var2 = 0;

                                    do {
                                       int var65 = var2;
                                       var2 += 8;
                                       String var50 = var4.substring(var65, var2);
                                       var65 = 1433239905;
                                       int var80 = var39 ^ -28650386;
                                       byte[] var7 = var50.getBytes("ISO-8859-1");
                                       var65 = var3++;
                                       var95 = (
                                             (var7[0] & 255L) << a(1125508310, var39 ^ 1498124879)
                                                | (var7[1] & 255L) << a(1125508311, var39 ^ -735900986)
                                                | (var7[2] & 255L) << a(1125508304, var39 ^ 763579186)
                                                | (var7[3] & 255L) << a(1125508305, var39 ^ 1106751930)
                                                | (var7[4] & 255L) << a(1125508306, var39 ^ 449295636)
                                                | (var7[5] & 255L) << a(1125508307, var39 ^ -1368312779)
                                                | (var7[a(1125508316, var39 ^ 220014114)] & 255L) << a(1125508317, var39 ^ 1805552007)
                                                | var7[a(1125508318, var39 ^ 794529954)] & 255L
                                          )
                                          ^ var0;
                                       byte var93 = -1;
                                       var6[var65] = var95;
                                    } while (var2 < var5);

                                    baaa = var6;
                                    aa = new Long[2];
                                    bba = aab(a(1125508319, var39 ^ 1639114163), 7531221642828203016L);
                                    ababbbbaa[] var51 = new ababbbbaa[ab(
                                       a(1125508312, var39 ^ 1456514299), 8164076626272202796L
                                    )];
                                    var51[0] = aabbaaaba.aaab(
                                       bab(a(1125508313, var39 ^ -1015167434), a(1125508314, var39 ^ -1546581260))
                                    );
                                    var51[1] = aabbaaaba.aaab(
                                       bab(a(1125508315, var39 ^ -727510724), a(1125508260, var39 ^ -1954594448))
                                    );
                                    var51[2] = aabbaaaba.aaab(
                                       bab(a(1125508261, var39 ^ -1578815735), a(1125508262, var39 ^ 1506710743))
                                    );
                                    var51[3] = aabbaaaba.aaab(
                                       bab(a(1125508263, var39 ^ 1004786853), a(1125508256, var39 ^ 1328465932))
                                    );
                                    var51[4] = aabbaaaba.aaab(
                                       bab(a(1125508257, var39 ^ 1260885129), a(1125508258, var39 ^ -485515969))
                                    );
                                    var51[5] = aabbaaaba.aaab(
                                       bab(a(1125508259, var39 ^ -716472423), a(1125508268, var39 ^ 1029025890))
                                    );
                                    var51[ab(a(1125508269, var39 ^ 1803983853), 4320033432050424278L)] = aabbaaaba.aaab(
                                       bab(a(1125508270, var39 ^ -1782828006), a(1125508271, var39 ^ 589458299))
                                    );
                                    var51[ab(a(1125508264, var39 ^ 354096255), 8397446821495733520L)] = aabbaaaba.aaab(
                                       bab(a(1125508265, var39 ^ 900341289), a(1125508266, var39 ^ -468457295))
                                    );
                                    abab = var51;
                                    return;
                                 }
                                 break;
                              default:
                                 var48[var60] = var95;
                                 if (var10 < var13) {
                                    continue label94;
                                 }

                                 var13 = (var12 = b(1433239906, var39 ^ -88031938)).length();
                                 var10 = 0;
                           }

                           int var63 = var10;
                           var10 += 8;
                           String var49 = var12.substring(var63, var10);
                           var63 = 1433239907;
                           int var79 = var39 ^ 438153923;
                           var15 = var49.getBytes("ISO-8859-1");
                           var48 = var14;
                           var60 = var11++;
                           var77 = (var15[0] & 255L) << a(1125508300, var39 ^ -770926095)
                              | (var15[1] & 255L) << a(1125508301, var39 ^ 796952003)
                              | (var15[2] & 255L) << a(1125508302, var39 ^ -311193425)
                              | (var15[3] & 255L) << a(1125508303, var39 ^ 1521298876)
                              | (var15[4] & 255L) << a(1125508296, var39 ^ -1502507084)
                              | (var15[5] & 255L) << a(1125508297, var39 ^ -371738923)
                              | (var15[a(1125508298, var39 ^ -1106582071)] & 255L) << a(1125508299, var39 ^ 1053782988)
                              | var15[a(1125508308, var39 ^ -1221530611)] & 255L;
                           var91 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var42);
                  break;
               default:
                  var21[var19++] = var90;
                  if ((var42 += var17) < var20) {
                     var17 = var18.charAt(var42);
                     continue label120;
                  }

                  var20 = (var18 = b(1433239911, var39 ^ -436746805)).length();
                  var17 = a(1125508336, var39 ^ -1632801662);
                  var42 = -1;
            }

            var45 = var18.substring(++var42, var42 + var17);
            var10001 = 0;
         }
      }
   }

   private void bba() {
      this.aabb.clear();
      this.aaba = null;
      this.bab = null;
      this.abaa = null;
   }

   private boolean bbb(class_1657 param1) {
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
      // 05: invokevirtual net/minecraft/class_1657.method_6128 ()Z
      // 08: iload 2
      // 09: ifne db
      // 0c: ifne da
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual net/minecraft/class_1657.method_5765 ()Z
      // 17: iload 2
      // 18: ifne db
      // 1b: goto 1f
      // 1e: athrow
      // 1f: ifne da
      // 22: goto 26
      // 25: athrow
      // 26: aload 1
      // 27: invokevirtual net/minecraft/class_1657.method_7325 ()Z
      // 2a: iload 2
      // 2b: ifne db
      // 2e: goto 32
      // 31: athrow
      // 32: ifne da
      // 35: goto 39
      // 38: athrow
      // 39: aload 1
      // 3a: invokevirtual net/minecraft/class_1657.method_31549 ()Lnet/minecraft/class_1656;
      // 3d: getfield net/minecraft/class_1656.field_7479 Z
      // 40: iload 2
      // 41: ifne db
      // 44: goto 48
      // 47: athrow
      // 48: ifne da
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 1
      // 50: invokevirtual net/minecraft/class_1657.method_5799 ()Z
      // 53: iload 2
      // 54: ifne db
      // 57: goto 5b
      // 5a: athrow
      // 5b: ifne da
      // 5e: goto 62
      // 61: athrow
      // 62: aload 1
      // 63: invokevirtual net/minecraft/class_1657.method_5869 ()Z
      // 66: iload 2
      // 67: ifne db
      // 6a: goto 6e
      // 6d: athrow
      // 6e: ifne da
      // 71: goto 75
      // 74: athrow
      // 75: aload 1
      // 76: invokevirtual net/minecraft/class_1657.method_5771 ()Z
      // 79: iload 2
      // 7a: ifne db
      // 7d: goto 81
      // 80: athrow
      // 81: ifne da
      // 84: goto 88
      // 87: athrow
      // 88: aload 1
      // 89: invokevirtual net/minecraft/class_1657.method_6101 ()Z
      // 8c: iload 2
      // 8d: ifne db
      // 90: goto 94
      // 93: athrow
      // 94: ifne da
      // 97: goto 9b
      // 9a: athrow
      // 9b: aload 1
      // 9c: getstatic net/minecraft/class_1294.field_5902 Lnet/minecraft/class_6880;
      // 9f: invokevirtual net/minecraft/class_1657.method_6059 (Lnet/minecraft/class_6880;)Z
      // a2: iload 2
      // a3: ifne db
      // a6: goto aa
      // a9: athrow
      // aa: ifne da
      // ad: goto b1
      // b0: athrow
      // b1: aload 1
      // b2: getstatic net/minecraft/class_1294.field_5906 Lnet/minecraft/class_6880;
      // b5: invokevirtual net/minecraft/class_1657.method_6059 (Lnet/minecraft/class_6880;)Z
      // b8: iload 2
      // b9: ifne db
      // bc: goto c0
      // bf: athrow
      // c0: ifne da
      // c3: goto c7
      // c6: athrow
      // c7: aload 1
      // c8: invokevirtual net/minecraft/class_1657.method_6123 ()Z
      // cb: iload 2
      // cc: ifne db
      // cf: goto d3
      // d2: athrow
      // d3: ifeq de
      // d6: goto da
      // d9: athrow
      // da: bipush 1
      // db: goto df
      // de: bipush 0
      // df: ireturn
   }

   public boolean aaaa(class_1657 param1) {
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
      // 005: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.babbaab ()Z
      // 008: iload 2
      // 009: ifne 046
      // 00c: ifeq 045
      // 00f: goto 013
      // 012: athrow
      // 013: aload 1
      // 014: iload 2
      // 015: ifne 024
      // 018: goto 01c
      // 01b: athrow
      // 01c: ifnull 045
      // 01f: goto 023
      // 022: athrow
      // 023: aload 1
      // 024: invokevirtual net/minecraft/class_1657.method_31481 ()Z
      // 027: iload 2
      // 028: ifne 046
      // 02b: ifne 045
      // 02e: goto 032
      // 031: athrow
      // 032: aload 1
      // 033: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 036: iload 2
      // 037: ifne 046
      // 03a: goto 03e
      // 03d: athrow
      // 03e: ifne 047
      // 041: goto 045
      // 044: athrow
      // 045: bipush 0
      // 046: ireturn
      // 047: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 04a: astore 3
      // 04b: aload 0
      // 04c: aload 3
      // 04d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aba (Lnet/minecraft/class_310;)Z
      // 050: iload 2
      // 051: ifne 06c
      // 054: ifeq 067
      // 057: goto 05b
      // 05a: athrow
      // 05b: aload 1
      // 05c: aload 3
      // 05d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 060: if_acmpne 06d
      // 063: goto 067
      // 066: athrow
      // 067: bipush 0
      // 068: goto 06c
      // 06b: athrow
      // 06c: ireturn
      // 06d: aload 3
      // 06e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 071: invokevirtual net/minecraft/class_638.method_75260 ()J
      // 074: lstore 4
      // 076: aload 0
      // 077: aload 3
      // 078: aload 1
      // 079: lload 4
      // 07b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;J)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa;
      // 07e: astore 6
      // 080: aload 6
      // 082: ifnull 0ae
      // 085: lload 4
      // 087: aload 6
      // 089: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa.ab J
      // 08c: lsub
      // 08d: aload 0
      // 08e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 091: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 094: checkcast java/lang/Double
      // 097: invokevirtual java/lang/Double.longValue ()J
      // 09a: lcmp
      // 09b: iload 2
      // 09c: ifne 0ab
      // 09f: goto 0a3
      // 0a2: athrow
      // 0a3: iflt 0ae
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: bipush 1
      // 0ab: goto 0af
      // 0ae: bipush 0
      // 0af: istore 7
      // 0b1: iload 7
      // 0b3: iload 2
      // 0b4: ifne 1a6
      // 0b7: ifeq 19f
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 0c2: iload 2
      // 0c3: ifne 1a3
      // 0c6: goto 0ca
      // 0c9: athrow
      // 0ca: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 0cd: ifeq 19f
      // 0d0: goto 0d4
      // 0d3: athrow
      // 0d4: aload 3
      // 0d5: iload 2
      // 0d6: ifne 0ec
      // 0d9: goto 0dd
      // 0dc: athrow
      // 0dd: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 0e0: ifnull 19f
      // 0e3: goto 0e7
      // 0e6: athrow
      // 0e7: aload 3
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 0ef: aload 1
      // 0f0: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 0f3: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
      // 0f6: astore 8
      // 0f8: aload 8
      // 0fa: iload 2
      // 0fb: ifne 10a
      // 0fe: ifnonnull 108
      // 101: goto 105
      // 104: athrow
      // 105: bipush 1
      // 106: ireturn
      // 107: athrow
      // 108: aload 8
      // 10a: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
      // 10d: astore 9
      // 10f: aload 1
      // 110: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 113: astore 10
      // 115: aload 9
      // 117: iload 2
      // 118: ifne 129
      // 11b: ifnonnull 127
      // 11e: goto 122
      // 121: athrow
      // 122: aconst_null
      // 123: goto 12c
      // 126: athrow
      // 127: aload 9
      // 129: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 12c: astore 11
      // 12e: aload 10
      // 130: iload 2
      // 131: ifne 142
      // 134: ifnonnull 140
      // 137: goto 13b
      // 13a: athrow
      // 13b: aconst_null
      // 13c: goto 145
      // 13f: athrow
      // 140: aload 10
      // 142: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 145: astore 12
      // 147: aload 11
      // 149: iload 2
      // 14a: ifne 156
      // 14d: ifnull 173
      // 150: goto 154
      // 153: athrow
      // 154: aload 12
      // 156: iload 2
      // 157: ifne 163
      // 15a: ifnull 173
      // 15d: goto 161
      // 160: athrow
      // 161: aload 11
      // 163: aload 12
      // 165: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 168: iload 2
      // 169: ifne 185
      // 16c: ifne 176
      // 16f: goto 173
      // 172: athrow
      // 173: bipush 1
      // 174: ireturn
      // 175: athrow
      // 176: aload 0
      // 177: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 17a: iload 2
      // 17b: ifne 1a3
      // 17e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 181: goto 185
      // 184: athrow
      // 185: ifeq 19f
      // 188: aload 8
      // 18a: invokevirtual net/minecraft/class_640.method_2959 ()I
      // 18d: iload 2
      // 18e: ifne 1a6
      // 191: goto 195
      // 194: athrow
      // 195: ifge 19f
      // 198: goto 19c
      // 19b: athrow
      // 19c: bipush 1
      // 19d: ireturn
      // 19e: athrow
      // 19f: aload 0
      // 1a0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 1a3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 1a6: iload 2
      // 1a7: ifne 223
      // 1aa: ifeq 221
      // 1ad: goto 1b1
      // 1b0: athrow
      // 1b1: aload 1
      // 1b2: invokevirtual net/minecraft/class_1657.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 1b5: astore 8
      // 1b7: aload 8
      // 1b9: iload 2
      // 1ba: ifne 1cb
      // 1bd: ifnonnull 1c9
      // 1c0: goto 1c4
      // 1c3: athrow
      // 1c4: aconst_null
      // 1c5: goto 1ce
      // 1c8: athrow
      // 1c9: aload 8
      // 1cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 1ce: astore 9
      // 1d0: aload 8
      // 1d2: iload 2
      // 1d3: ifne 1e4
      // 1d6: ifnonnull 1e2
      // 1d9: goto 1dd
      // 1dc: athrow
      // 1dd: aconst_null
      // 1de: goto 1e7
      // 1e1: athrow
      // 1e2: aload 8
      // 1e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 1e7: astore 10
      // 1e9: aload 9
      // 1eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababba.bba (Ljava/lang/String;)Z
      // 1ee: iload 2
      // 1ef: ifne 220
      // 1f2: ifeq 21b
      // 1f5: goto 1f9
      // 1f8: athrow
      // 1f9: aload 10
      // 1fb: iload 2
      // 1fc: ifne 20c
      // 1ff: goto 203
      // 202: athrow
      // 203: ifnull 221
      // 206: goto 20a
      // 209: athrow
      // 20a: aload 10
      // 20c: invokevirtual java/util/UUID.version ()I
      // 20f: iload 2
      // 210: ifne 223
      // 213: bipush 2
      // 214: if_icmpne 221
      // 217: goto 21b
      // 21a: athrow
      // 21b: bipush 1
      // 21c: goto 220
      // 21f: athrow
      // 220: ireturn
      // 221: iload 7
      // 223: iload 2
      // 224: ifne 26b
      // 227: ifeq 25c
      // 22a: goto 22e
      // 22d: athrow
      // 22e: aload 0
      // 22f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 232: iload 2
      // 233: ifne 268
      // 236: goto 23a
      // 239: athrow
      // 23a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 23d: ifeq 25c
      // 240: goto 244
      // 243: athrow
      // 244: aload 0
      // 245: iload 2
      // 246: ifne 25d
      // 249: goto 24d
      // 24c: athrow
      // 24d: aload 3
      // 24e: aload 1
      // 24f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aaba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Z
      // 252: ifeq 25c
      // 255: goto 259
      // 258: athrow
      // 259: bipush 1
      // 25a: ireturn
      // 25b: athrow
      // 25c: aload 0
      // 25d: iload 2
      // 25e: ifne 28b
      // 261: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 264: goto 268
      // 267: athrow
      // 268: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 26b: ifeq 28a
      // 26e: aload 0
      // 26f: iload 2
      // 270: ifne 28b
      // 273: goto 277
      // 276: athrow
      // 277: aload 3
      // 278: aload 1
      // 279: aload 1
      // 27a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.abb (Lnet/minecraft/class_1657;)Ljava/lang/String;
      // 27d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.ba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;Ljava/lang/String;)Z
      // 280: ifeq 28a
      // 283: goto 287
      // 286: athrow
      // 287: bipush 1
      // 288: ireturn
      // 289: athrow
      // 28a: aload 0
      // 28b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 28e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 291: iload 2
      // 292: ifne 2a4
      // 295: ifeq 2db
      // 298: goto 29c
      // 29b: athrow
      // 29c: aload 1
      // 29d: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 2a0: goto 2a4
      // 2a3: athrow
      // 2a4: iload 2
      // 2a5: ifne 2da
      // 2a8: iflt 2d5
      // 2ab: goto 2af
      // 2ae: athrow
      // 2af: aload 1
      // 2b0: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 2b3: iload 2
      // 2b4: ifne 2da
      // 2b7: goto 2bb
      // 2ba: athrow
      // 2bb: ldc_w 1125508533
      // 2be: ldc_w 501862896
      // 2c1: ldc_w -1985022188
      // 2c4: ixor
      // 2c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.a (II)I
      // 2c8: ldc2_w 9081241784233272958
      // 2cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.ab (IJ)I
      // 2ce: if_icmplt 2db
      // 2d1: goto 2d5
      // 2d4: athrow
      // 2d5: bipush 1
      // 2d6: goto 2da
      // 2d9: athrow
      // 2da: ireturn
      // 2db: aload 6
      // 2dd: iload 2
      // 2de: ifne 2ea
      // 2e1: ifnull 30c
      // 2e4: goto 2e8
      // 2e7: athrow
      // 2e8: aload 6
      // 2ea: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababba;
      // 2ed: aload 0
      // 2ee: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 2f1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 2f4: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbab
      // 2f7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababba.ba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbab;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaab;
      // 2fa: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaab.ab ()Z
      // 2fd: iload 2
      // 2fe: ifne 309
      // 301: ifeq 30c
      // 304: goto 308
      // 307: athrow
      // 308: bipush 1
      // 309: goto 30d
      // 30c: bipush 0
      // 30d: ireturn
   }

   private baabaa aaab(class_310 param1, class_1657 param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 5
      // 005: aload 2
      // 006: iload 5
      // 008: ifne 013
      // 00b: ifnull 023
      // 00e: goto 012
      // 011: athrow
      // 012: aload 2
      // 013: iload 5
      // 015: ifne 036
      // 018: aload 1
      // 019: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01c: if_acmpne 026
      // 01f: goto 023
      // 022: athrow
      // 023: aconst_null
      // 024: areturn
      // 025: athrow
      // 026: aload 0
      // 027: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aabb Ljava/util/Map;
      // 02a: aload 2
      // 02b: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 02e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 031: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 036: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa
      // 039: astore 6
      // 03b: iload 5
      // 03d: ifne 06a
      // 040: aload 6
      // 042: ifnull 05f
      // 045: goto 049
      // 048: athrow
      // 049: aload 6
      // 04b: iload 5
      // 04d: ifne 08e
      // 050: goto 054
      // 053: athrow
      // 054: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa.aaa Lnet/minecraft/class_1657;
      // 057: aload 2
      // 058: if_acmpeq 07d
      // 05b: goto 05f
      // 05e: athrow
      // 05f: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa
      // 062: dup
      // 063: aload 2
      // 064: lload 3
      // 065: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa.<init> (Lnet/minecraft/class_1657;J)V
      // 068: astore 6
      // 06a: aload 0
      // 06b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aabb Ljava/util/Map;
      // 06e: aload 2
      // 06f: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 072: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 075: aload 6
      // 077: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 07c: pop
      // 07d: aload 6
      // 07f: iload 5
      // 081: ifne 09c
      // 084: lload 3
      // 085: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa.bb J
      // 088: aload 6
      // 08a: goto 08e
      // 08d: athrow
      // 08e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa.b J
      // 091: lload 3
      // 092: lcmp
      // 093: ifne 09a
      // 096: aload 6
      // 098: areturn
      // 099: athrow
      // 09a: aload 6
      // 09c: lload 3
      // 09d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa.b J
      // 0a0: lload 3
      // 0a1: aload 6
      // 0a3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa.ab J
      // 0a6: lsub
      // 0a7: aload 0
      // 0a8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 0ab: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 0ae: checkcast java/lang/Double
      // 0b1: invokevirtual java/lang/Double.longValue ()J
      // 0b4: lcmp
      // 0b5: iload 5
      // 0b7: ifne 0c2
      // 0ba: iflt 0c5
      // 0bd: goto 0c1
      // 0c0: athrow
      // 0c1: bipush 1
      // 0c2: goto 0c6
      // 0c5: bipush 0
      // 0c6: istore 7
      // 0c8: aload 0
      // 0c9: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 0cc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 0cf: iload 5
      // 0d1: ifne 106
      // 0d4: ifeq 101
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: aload 1
      // 0dc: iload 5
      // 0de: ifne 0f4
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 0e8: ifnull 101
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: aload 1
      // 0f0: goto 0f4
      // 0f3: athrow
      // 0f4: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 0f7: aload 2
      // 0f8: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 0fb: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
      // 0fe: ifnull 109
      // 101: bipush 1
      // 102: goto 106
      // 105: athrow
      // 106: goto 10a
      // 109: bipush 0
      // 10a: istore 8
      // 10c: aload 2
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.abb (Lnet/minecraft/class_1657;)Ljava/lang/String;
      // 110: astore 9
      // 112: aload 0
      // 113: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.baba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 116: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 119: iload 5
      // 11b: ifne 13b
      // 11e: ifeq 13a
      // 121: goto 125
      // 124: athrow
      // 125: aload 9
      // 127: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababba.bba (Ljava/lang/String;)Z
      // 12a: iload 5
      // 12c: ifne 13b
      // 12f: goto 133
      // 132: athrow
      // 133: ifeq 13e
      // 136: goto 13a
      // 139: athrow
      // 13a: bipush 1
      // 13b: goto 13f
      // 13e: bipush 0
      // 13f: istore 10
      // 141: aload 0
      // 142: iload 5
      // 144: ifne 159
      // 147: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 14a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 14d: ifeq 170
      // 150: goto 154
      // 153: athrow
      // 154: aload 0
      // 155: goto 159
      // 158: athrow
      // 159: aload 1
      // 15a: aload 2
      // 15b: aload 9
      // 15d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.ba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;Ljava/lang/String;)Z
      // 160: iload 5
      // 162: ifne 16d
      // 165: ifeq 170
      // 168: goto 16c
      // 16b: athrow
      // 16c: bipush 1
      // 16d: goto 171
      // 170: bipush 0
      // 171: istore 11
      // 173: aload 2
      // 174: aload 1
      // 175: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 178: invokevirtual net/minecraft/class_1657.method_5858 (Lnet/minecraft/class_1297;)D
      // 17b: ldc2_w 144.0
      // 17e: dcmpg
      // 17f: iload 5
      // 181: ifne 18c
      // 184: ifgt 18f
      // 187: goto 18b
      // 18a: athrow
      // 18b: bipush 1
      // 18c: goto 190
      // 18f: bipush 0
      // 190: istore 12
      // 192: aload 0
      // 193: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 196: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 199: iload 5
      // 19b: ifne 1bb
      // 19e: ifeq 1ba
      // 1a1: goto 1a5
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: aload 2
      // 1a7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bbb (Lnet/minecraft/class_1657;)Z
      // 1aa: iload 5
      // 1ac: ifne 1bb
      // 1af: goto 1b3
      // 1b2: athrow
      // 1b3: ifeq 1be
      // 1b6: goto 1ba
      // 1b9: athrow
      // 1ba: bipush 1
      // 1bb: goto 1bf
      // 1be: bipush 0
      // 1bf: istore 13
      // 1c1: aload 0
      // 1c2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 1c5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 1c8: iload 5
      // 1ca: ifne 1d6
      // 1cd: ifeq 1fb
      // 1d0: goto 1d4
      // 1d3: athrow
      // 1d4: iload 12
      // 1d6: iload 5
      // 1d8: ifne 1eb
      // 1db: ifeq 1fb
      // 1de: goto 1e2
      // 1e1: athrow
      // 1e2: aload 0
      // 1e3: aload 2
      // 1e4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bb (Lnet/minecraft/class_1657;)Z
      // 1e7: goto 1eb
      // 1ea: athrow
      // 1eb: iload 5
      // 1ed: ifne 1f8
      // 1f0: ifeq 1fb
      // 1f3: goto 1f7
      // 1f6: athrow
      // 1f7: bipush 1
      // 1f8: goto 1fc
      // 1fb: bipush 0
      // 1fc: istore 14
      // 1fe: aload 2
      // 1ff: invokevirtual net/minecraft/class_1657.method_18798 ()Lnet/minecraft/class_243;
      // 202: getfield net/minecraft/class_243.field_1352 D
      // 205: aload 2
      // 206: invokevirtual net/minecraft/class_1657.method_18798 ()Lnet/minecraft/class_243;
      // 209: getfield net/minecraft/class_243.field_1350 D
      // 20c: invokestatic java/lang/Math.hypot (DD)D
      // 20f: dstore 15
      // 211: aload 6
      // 213: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababba;
      // 216: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababaa
      // 219: dup
      // 21a: lload 3
      // 21b: iload 7
      // 21d: iload 8
      // 21f: iload 10
      // 221: aload 0
      // 222: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 225: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 228: ifeq 249
      // 22b: iload 12
      // 22d: ifeq 249
      // 230: goto 234
      // 233: athrow
      // 234: aload 2
      // 235: invokevirtual net/minecraft/class_1657.method_5767 ()Z
      // 238: ifeq 249
      // 23b: aload 2
      // 23c: getstatic net/minecraft/class_1294.field_5905 Lnet/minecraft/class_6880;
      // 23f: invokevirtual net/minecraft/class_1657.method_6059 (Lnet/minecraft/class_6880;)Z
      // 242: ifne 249
      // 245: bipush 1
      // 246: goto 24a
      // 249: bipush 0
      // 24a: iload 11
      // 24c: iload 14
      // 24e: iload 13
      // 250: iload 12
      // 252: aload 2
      // 253: invokevirtual net/minecraft/class_1657.method_23317 ()D
      // 256: aload 2
      // 257: invokevirtual net/minecraft/class_1657.method_23318 ()D
      // 25a: aload 2
      // 25b: invokevirtual net/minecraft/class_1657.method_23321 ()D
      // 25e: dload 15
      // 260: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababaa.<init> (JZZZZZZZZDDDD)V
      // 263: aload 0
      // 264: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 267: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 26a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbab
      // 26d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababba.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbababaa;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbab;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaab;
      // 270: pop
      // 271: aload 6
      // 273: areturn
   }

   private boolean aaba(class_310 param1, class_1657 param2) {
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
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: iload 3
      // 09: ifne 14
      // 0c: ifnull 56
      // 0f: goto 13
      // 12: athrow
      // 13: aload 2
      // 14: aload 1
      // 15: iload 3
      // 16: ifne 29
      // 19: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c: if_acmpeq 56
      // 1f: goto 23
      // 22: athrow
      // 23: aload 2
      // 24: aload 1
      // 25: goto 29
      // 28: athrow
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: invokevirtual net/minecraft/class_1657.method_5858 (Lnet/minecraft/class_1297;)D
      // 2f: ldc2_w 144.0
      // 32: dcmpg
      // 33: iload 3
      // 34: ifne 47
      // 37: ifgt 56
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 0
      // 3f: aload 2
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabaab.bb (Lnet/minecraft/class_1657;)Z
      // 43: goto 47
      // 46: athrow
      // 47: iload 3
      // 48: ifne 53
      // 4b: ifeq 56
      // 4e: goto 52
      // 51: athrow
      // 52: bipush 1
      // 53: goto 57
      // 56: bipush 0
      // 57: ireturn
   }
}
