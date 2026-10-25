package nsc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_5321;

@Environment(EnvType.CLIENT)
public final class aabaabba extends abbaabbaa {
   private static final int ba;
   private static final long[] aaa;
   private static final double aab = 1.0;
   private static final double aba = 12.0;
   private final aaaaa abb;
   private final bababa baa;
   private static final double bab = 2.0;
   private static final double bba = 3.0;
   private static final double bbb = 1.0;
   private static final String[] aaaa;
   private static final int[] abaaa;
   private static final double bb = 0.75;
   private static final double aaab = 12.0;
   private static final double aaba = 0.55;
   private final aaaaa aabb;
   private static final double ab = 2.0;
   private final List abaa;
   private final aaaaa abab;
   private final abbbaaaaa abba;
   private static final String[] abbb;
   private static final double baaa = 0.15;
   private static final int baab;
   private static final double baba = 3.0;
   private static final double babb = 0.75;
   private final bababa bbaa;
   private static final double bbab = 3.0;
   private final aaaaa bbba;
   private final aaaaa bbbb;
   private final Map aa;
   private final abaabbbb aaaaa;
   private static final double aaaab = -15.0;
   private static final double aaaba = 2.5;
   private static final double aaabb = 1.5;
   private static final String[] abaab;
   private static final Object[] ababa;
   private static final double aabaa = 6.5;
   private static final ababbbbaa[] aabab;
   private static final Integer[] aabba;
   private static final int aabbb;

   private static String aa(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   public static boolean ab(class_1297 var0) {
      int var1 = baaabbaa.bba;

      boolean var10000;
      label33: {
         try {
            var10000 = var0 instanceof class_1657;
            if (var1 != 0) {
               break label33;
            }

            if (!var10000) {
               return false;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = aaaaa();
      }

      try {
         if (var1 != 0) {
            return var10000;
         }

         if (var10000) {
            return true;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return false;
   }

   public aabaabba() {
      int var1 = 1549091546;
      super(
         aabbaaaba.aaab(bba(a(804651557, var1 ^ 1179447311), a(804651556, var1 ^ 1302995090))),
         bbaabbba.bab,
         aabbaaaba.aaab(bba(a(804651559, var1 ^ -1167226282), a(804651558, var1 ^ 768755470)))
      );
      this.baa = (bababa)this.abbbaaa(
         new bababa(
            aabbaaaba.aaab(bba(a(804651553, var1 ^ 1434091726), a(804651552, var1 ^ 1771664331))), 1.0, 0.5, 2.0, 0.05
         )
      );
      this.bbaa = (bababa)this.abbbaaa(
         new bababa(
            aabbaaaba.aaab(bba(a(804651555, var1 ^ 1204899411), a(804651554, var1 ^ 389940771))), 200.0, 0.0, 255.0, 5.0
         )
      );
      this.aaaaa = (abaabbbb)this.abbbaaa(
         new abaabbbb(
            aabbaaaba.aaab(bba(a(804651565, var1 ^ 1104363122), a(804651564, var1 ^ -452617572))),
            bbabbab(aabab),
            List.of(aabab[0], aabab[1], aabab[2], aabab[3])
         )
      );
      this.bbbb = abbbaba(this.aaaaa, 0);
      this.aabb = abbbaba(this.aaaaa, 1);
      this.bbba = abbbaba(this.aaaaa, 2);
      this.abb = abbbaba(this.aaaaa, 3);
      this.abab = abbbaba(this.aaaaa, 4);
      this.abba = new abbbaaaaa();
      this.abaa = new ArrayList();
      this.aa = new ConcurrentHashMap();
      this.bbbabab(this.aaaaa, new ababbbbaa[0]);
   }

   private void ba(class_332 var1, class_327 var2, bbaababb var3, int var4) {
      double var6 = var3.aaa() + 2.5;
      int var10000 = baaabbaa.bba;
      double var8 = var3.ba() + 3.0;
      int var5 = var10000;

      class_327 var10001;
      label37: {
         label38: {
            label30: {
               try {
                  var11 = var3.ab();
                  if (var5 != 0) {
                     break label38;
                  }

                  if (var11.isEmpty()) {
                     break label30;
                  }
               } catch (MatchException var10) {
                  throw var10;
               }

               bbbb(
                  var1,
                  var2,
                  var3.ab(),
                  var8,
                  var6,
                  ababbbaba.bb(aabb(a(804651567, 208992038 ^ -1967844039), 2596591389815187717L), var4)
               );
               var8 += this.abab(var2, var3.ab()) + 3.0;
            }

            var12 = var1;
            var10001 = var2;
            if (var5 != 0) {
               break label37;
            }

            bbbb(
               var1,
               var2,
               var3.b(),
               var8,
               var6,
               ababbbaba.bb(aabb(a(804651566, 208992038 ^ -1681991547), 507905803115978060L), var4)
            );
            var8 += this.abab(var2, var3.b());
            var11 = var3.bb();
         }

         if (var11.isEmpty()) {
            return;
         }

         var8 += 3.0;
         var12 = var1;
         var10001 = var2;
      }

      bbbb(var12, var10001, var3.bb(), var8, var6, ababbbaba.bb(var3.a(), var4));
   }

   private List bb(class_310 var1, boolean var2) {
      int var10000 = baaabbaa.bba;
      ArrayList var4 = new ArrayList();
      int var3 = var10000;

      for (class_1657 var6 : var1.field_1687.method_18456()) {
         this.aab(var1, var4, var6, var2);
         if (var3 != 0) {
            break;
         }
      }

      return var4;
   }

   private double aaa(double var1) {
      double var3 = Math.sqrt(var1);
      return Math.max(0.6, Math.min(1.0, 1.0 - (var3 - 10.0) * 0.005));
   }

   private void aab(class_310 param1, List param2, class_1657 param3, boolean param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 3
      // 06: iload 5
      // 08: ifne 14
      // 0b: ifnonnull 13
      // 0e: goto 12
      // 11: athrow
      // 12: return
      // 13: aload 3
      // 14: iload 5
      // 16: ifne 38
      // 19: aload 1
      // 1a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1d: if_acmpne 37
      // 20: goto 24
      // 23: athrow
      // 24: iload 4
      // 26: iload 5
      // 28: ifne 44
      // 2b: goto 2f
      // 2e: athrow
      // 2f: ifne 37
      // 32: goto 36
      // 35: athrow
      // 36: return
      // 37: aload 3
      // 38: iload 5
      // 3a: ifne 48
      // 3d: invokevirtual net/minecraft/class_1657.method_31481 ()Z
      // 40: goto 44
      // 43: athrow
      // 44: ifne 57
      // 47: aload 3
      // 48: iload 5
      // 4a: ifne 5a
      // 4d: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 50: ifne 59
      // 53: goto 57
      // 56: athrow
      // 57: return
      // 58: athrow
      // 59: aload 3
      // 5a: iload 5
      // 5c: ifne 6f
      // 5f: aload 1
      // 60: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 63: if_acmpeq 7f
      // 66: goto 6a
      // 69: athrow
      // 6a: aload 3
      // 6b: goto 6f
      // 6e: athrow
      // 6f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbba.ab (Lnet/minecraft/class_1657;)Z
      // 72: iload 5
      // 74: ifne 86
      // 77: ifeq 7f
      // 7a: goto 7e
      // 7d: athrow
      // 7e: return
      // 7f: aload 2
      // 80: aload 3
      // 81: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 86: pop
      // 87: return
   }

   @Override
   public void aabaa() {
      this.abba.b();
      this.abaa.clear();
      this.aa.clear();
   }

   @Override
   public void baa(aabbbbaaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abaa Ljava/util/List;
      // 07: invokeinterface java/util/List.clear ()V 1
      // 0c: istore 2
      // 0d: aload 0
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.babbaab ()Z
      // 11: iload 2
      // 12: ifne 24
      // 15: ifeq 27
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 20: goto 24
      // 23: athrow
      // 24: ifne 28
      // 27: return
      // 28: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 2b: astore 3
      // 2c: aload 3
      // 2d: iload 2
      // 2e: ifne 40
      // 31: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 34: ifnull 4e
      // 37: goto 3b
      // 3a: athrow
      // 3b: aload 3
      // 3c: goto 40
      // 3f: athrow
      // 40: iload 2
      // 41: ifne 51
      // 44: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 47: ifnonnull 50
      // 4a: goto 4e
      // 4d: athrow
      // 4e: return
      // 4f: athrow
      // 50: aload 3
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbaa (Lnet/minecraft/class_310;)F
      // 54: fstore 4
      // 56: aload 0
      // 57: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 5a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 5d: istore 5
      // 5f: aload 0
      // 60: aload 3
      // 61: iload 5
      // 63: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bb (Lnet/minecraft/class_310;Z)Ljava/util/List;
      // 66: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 6b: astore 6
      // 6d: aload 6
      // 6f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 74: ifeq ac
      // 77: aload 6
      // 79: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7e: checkcast net/minecraft/class_1657
      // 81: astore 7
      // 83: aload 0
      // 84: aload 1
      // 85: aload 3
      // 86: aload 7
      // 88: fload 4
      // 8a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aaaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_310;Lnet/minecraft/class_1657;F)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbb;
      // 8d: astore 8
      // 8f: aload 8
      // 91: ifnull a8
      // 94: aload 0
      // 95: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abaa Ljava/util/List;
      // 98: aload 0
      // 99: aload 8
      // 9b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbb;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbb;
      // 9e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a3: pop
      // a4: goto a8
      // a7: athrow
      // a8: iload 2
      // a9: ifeq 6d
      // ac: return
   }

   private static int aba(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w 400610471
      // 03: istore 2
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 07: istore 1
      // 08: iload 0
      // 09: iload 1
      // 0a: ifne 39
      // 0d: ldc_w 804651561
      // 10: iload 2
      // 11: ldc_w 606867029
      // 14: ixor
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 18: ldc2_w 7815452619953685155
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb (IJ)I
      // 1e: if_icmpge 38
      // 21: goto 25
      // 24: athrow
      // 25: ldc_w 804651560
      // 28: iload 2
      // 29: ldc_w -648462309
      // 2c: ixor
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 30: ldc2_w 7365527828607995815
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb (IJ)I
      // 36: ireturn
      // 37: athrow
      // 38: iload 0
      // 39: iload 1
      // 3a: ifne 69
      // 3d: ldc_w 804651563
      // 40: iload 2
      // 41: ldc_w -1452446003
      // 44: ixor
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 48: ldc2_w 398961216437257210
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb (IJ)I
      // 4e: if_icmpge 68
      // 51: goto 55
      // 54: athrow
      // 55: ldc_w 804651562
      // 58: iload 2
      // 59: ldc_w -2084344681
      // 5c: ixor
      // 5d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 60: ldc2_w 876608960547165612
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb (IJ)I
      // 66: ireturn
      // 67: athrow
      // 68: iload 0
      // 69: iload 1
      // 6a: ifne a9
      // 6d: ldc_w 804651573
      // 70: iload 2
      // 71: ldc_w 984095631
      // 74: ixor
      // 75: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 78: ldc2_w 7927935156242366329
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb (IJ)I
      // 7e: if_icmpge 98
      // 81: goto 85
      // 84: athrow
      // 85: ldc_w 804651572
      // 88: iload 2
      // 89: ldc_w -666601272
      // 8c: ixor
      // 8d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 90: ldc2_w 8045409671158314329
      // 93: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb (IJ)I
      // 96: ireturn
      // 97: athrow
      // 98: ldc_w 804651575
      // 9b: iload 2
      // 9c: ldc_w 220462524
      // 9f: ixor
      // a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // a3: ldc2_w 7065669915162299913
      // a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb (IJ)I
      // a9: ireturn
   }

   private void abb(class_332 var1, class_1799 var2, double var3, double var5, class_327 var7, int var8) {
      int var10000 = baaabbaa.bba;
      List var10 = this.aaba(var2);
      int var9 = var10000;

      try {
         if (var10.isEmpty()) {
            return;
         }
      } catch (MatchException var19) {
         throw var19;
      }

      double var11 = var5 - 1.0 - var10.size() * 6.5;
      int var13 = 0;

      while (var13 < var10.size()) {
         String var14 = (String)var10.get(var13);
         double var15 = var3 + 6.0 - this.abab(var7, var14) * 0.75 * 0.5;
         double var17 = var11 + var13 * 6.5;
         abbaa.abbaab(var1);
         abbaa.bb(var1, var15, var17);
         abbaa.bbbbba(var1, 0.75, 0.75);
         var1.method_51433(var7, var14, 0, 0, ababbbaba.bb(-1, var8), true);
         abbaa.ababbb(var1);
         var13++;
         if (var9 != 0) {
            break;
         }
      }
   }

   private baabbb bab(baabbb var1) {
      class_1657 var2 = var1.ab();

      try {
         if (var2 == null) {
            return var1;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      aaa var3 = this.abba.aa(var2.method_5628(), var1.bb(), var1.a(), var1.ba());
      return new baabbb(var2, var3.ab(), var3.a(), var1.ba(), var1.aa());
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
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1f
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.babbaab ()Z
      // 0c: ifne 27
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaaa;
      // 17: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbaaaaa.b ()V
      // 1a: aload 0
      // 1b: goto 1f
      // 1e: athrow
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aa Ljava/util/Map;
      // 22: invokeinterface java/util/Map.clear ()V 1
      // 27: return
   }

   @Override
   public void abbaaba(class_1297 param1, byte param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: iload 2
      // 05: iload 3
      // 06: ifne 33
      // 09: ldc_w 804651574
      // 0c: ldc_w 1230459973
      // 0f: ldc_w -836687317
      // 12: ixor
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 16: ldc2_w 5419486811136986396
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb (IJ)I
      // 1c: if_icmpne 54
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: iload 3
      // 25: ifne 37
      // 28: goto 2c
      // 2b: athrow
      // 2c: instanceof net/minecraft/class_1657
      // 2f: goto 33
      // 32: athrow
      // 33: ifeq 54
      // 36: aload 1
      // 37: checkcast net/minecraft/class_1657
      // 3a: astore 4
      // 3c: aload 0
      // 3d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aa Ljava/util/Map;
      // 40: aload 4
      // 42: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 45: bipush 1
      // 46: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 49: invokedynamic apply ()Ljava/util/function/BiFunction; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, java/lang/Integer.sum (II)I, (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer; ]
      // 4e: invokeinterface java/util/Map.merge (Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object; 4
      // 53: pop
      // 54: return
   }

   private static String bba(int var0, int var1) {
      int var9 = 1451389596;
      int var2 = (var0 ^ a(804651569, var9 ^ 1491299095)) & a(804651568, var9 ^ -1405791851);
      if (abbb[var2] == null) {
         char[] var3 = aaaa[var2].toCharArray();

         int var4 = switch (var3[0] & a(804651571, var9 ^ -2061967421)) {
            case 0 -> a(804651570, var9 ^ 976017192);
            case 1 -> a(804651581, var9 ^ -790966687);
            case 2 -> a(804651580, var9 ^ 2078070721);
            case 3 -> a(804651583, var9 ^ -16509899);
            case 4 -> a(804651582, var9 ^ 1647985887);
            case 5 -> a(804651577, var9 ^ -1153145765);
            case 6 -> a(804651576, var9 ^ 1681408368);
            case 7 -> a(804651579, var9 ^ 1625443123);
            case 8 -> a(804651578, var9 ^ -1661861678);
            case 9 -> a(804651525, var9 ^ -247518832);
            case 10 -> a(804651524, var9 ^ -1390180135);
            case 11 -> a(804651527, var9 ^ -98740080);
            case 12 -> a(804651526, var9 ^ -1631037277);
            case 13 -> a(804651521, var9 ^ -873513293);
            case 14 -> a(804651520, var9 ^ -41128638);
            case 15 -> a(804651523, var9 ^ 1523776948);
            case 16 -> a(804651522, var9 ^ -857495860);
            case 17 -> a(804651533, var9 ^ 650693665);
            case 18 -> a(804651532, var9 ^ -1209278986);
            case 19 -> a(804651535, var9 ^ 42790825);
            case 20 -> a(804651534, var9 ^ -28491264);
            case 21 -> a(804651529, var9 ^ -1410862960);
            case 22 -> a(804651528, var9 ^ -1549381859);
            case 23 -> a(804651531, var9 ^ 1579274740);
            case 24 -> a(804651530, var9 ^ 2088269201);
            case 25 -> a(804651541, var9 ^ -1630753757);
            case 26 -> a(804651540, var9 ^ 1327604179);
            case 27 -> a(804651543, var9 ^ 2027368318);
            case 28 -> a(804651542, var9 ^ 1663377405);
            case 29 -> a(804651537, var9 ^ 1757325764);
            case 30 -> a(804651536, var9 ^ -230203883);
            case 31 -> a(804651539, var9 ^ -115733304);
            case 32 -> a(804651538, var9 ^ -1925104292);
            case 33 -> a(804651549, var9 ^ -149786280);
            case 34 -> a(804651548, var9 ^ -723016836);
            case 35 -> a(804651551, var9 ^ -606174122);
            case 36 -> a(804651550, var9 ^ -2047581313);
            case 37 -> a(804651545, var9 ^ 269030434);
            case 38 -> a(804651544, var9 ^ 1362408200);
            case 39 -> a(804651547, var9 ^ -170887277);
            case 40 -> a(804651546, var9 ^ 1648121010);
            case 41 -> a(804651621, var9 ^ -670100509);
            case 42 -> a(804651620, var9 ^ 1880795575);
            case 43 -> a(804651623, var9 ^ -2118964692);
            case 44 -> a(804651622, var9 ^ 1455252133);
            case 45 -> a(804651617, var9 ^ -1022720069);
            case 46 -> a(804651616, var9 ^ 93311828);
            case 47 -> a(804651619, var9 ^ -1651219191);
            case 48 -> a(804651618, var9 ^ -685449476);
            case 49 -> a(804651629, var9 ^ 2147086668);
            case 50 -> a(804651628, var9 ^ -2000057483);
            case 51 -> a(804651631, var9 ^ 741706690);
            case 52 -> a(804651630, var9 ^ -1458566520);
            case 53 -> a(804651625, var9 ^ -2114883941);
            case 54 -> a(804651624, var9 ^ 564139349);
            case 55 -> a(804651627, var9 ^ -1504754548);
            case 56 -> a(804651626, var9 ^ 1592280828);
            case 57 -> a(804651637, var9 ^ 406238014);
            case 58 -> a(804651636, var9 ^ -1653342876);
            case 59 -> a(804651639, var9 ^ -1038401998);
            case 60 -> a(804651638, var9 ^ -1592630139);
            case 61 -> a(804651633, var9 ^ -851988371);
            case 62 -> a(804651632, var9 ^ 1124533849);
            case 63 -> a(804651635, var9 ^ -2012047413);
            case 64 -> a(804651634, var9 ^ 1982380306);
            case 65 -> a(804651645, var9 ^ -1656469256);
            case 66 -> a(804651644, var9 ^ 2058165838);
            case 67 -> a(804651647, var9 ^ 850203286);
            case 68 -> a(804651646, var9 ^ -567604141);
            case 69 -> a(804651641, var9 ^ 1140629952);
            case 70 -> a(804651640, var9 ^ 300347363);
            case 71 -> a(804651643, var9 ^ -1182519576);
            case 72 -> a(804651642, var9 ^ -1127858372);
            case 73 -> a(804651589, var9 ^ 797744747);
            case 74 -> a(804651588, var9 ^ 344716945);
            case 75 -> a(804651591, var9 ^ -1547897517);
            case 76 -> a(804651590, var9 ^ -1530291983);
            case 77 -> a(804651585, var9 ^ -99119501);
            case 78 -> a(804651584, var9 ^ 1964599919);
            case 79 -> a(804651587, var9 ^ -1242694796);
            case 80 -> 3;
            case 81 -> a(804651586, var9 ^ 477818244);
            case 82 -> a(804651597, var9 ^ -272981459);
            case 83 -> a(804651596, var9 ^ 62347590);
            case 84 -> a(804651599, var9 ^ 1041619358);
            case 85 -> a(804651598, var9 ^ -955805664);
            case 86 -> a(804651593, var9 ^ 1210021043);
            case 87 -> a(804651592, var9 ^ -1093622763);
            case 88 -> a(804651595, var9 ^ 424505717);
            case 89 -> a(804651594, var9 ^ -1717580900);
            case 90 -> a(804651605, var9 ^ -516535463);
            case 91 -> a(804651604, var9 ^ 1786804984);
            case 92 -> a(804651607, var9 ^ -1878933082);
            case 93 -> a(804651606, var9 ^ -1969982842);
            case 94 -> a(804651601, var9 ^ 1726472383);
            case 95 -> a(804651600, var9 ^ -546086384);
            case 96 -> 1;
            case 97 -> a(804651603, var9 ^ -1330801103);
            case 98 -> 5;
            case 99 -> a(804651602, var9 ^ 2002044585);
            case 100 -> a(804651613, var9 ^ -1588319410);
            case 101 -> a(804651612, var9 ^ -1968857723);
            case 102 -> a(804651615, var9 ^ -245439293);
            case 103 -> a(804651614, var9 ^ -689841907);
            case 104 -> a(804651609, var9 ^ -695223362);
            case 105 -> a(804651608, var9 ^ 75855547);
            case 106 -> a(804651611, var9 ^ 791965974);
            case 107 -> a(804651610, var9 ^ 220121844);
            case 108 -> a(804651685, var9 ^ -1446606953);
            case 109 -> a(804651684, var9 ^ -1180701995);
            case 110 -> a(804651687, var9 ^ -881309142);
            case 111 -> a(804651686, var9 ^ 1606568778);
            case 112 -> a(804651681, var9 ^ -344097643);
            case 113 -> a(804651680, var9 ^ 810644689);
            case 114 -> a(804651683, var9 ^ -1463626186);
            case 115 -> a(804651682, var9 ^ 1769602708);
            case 116 -> a(804651693, var9 ^ 1651390918);
            case 117 -> a(804651692, var9 ^ 496173194);
            case 118 -> a(804651695, var9 ^ 1512142569);
            case 119 -> a(804651694, var9 ^ -2072695057);
            case 120 -> a(804651689, var9 ^ -143757178);
            case 121 -> a(804651688, var9 ^ -2118200450);
            case 122 -> a(804651691, var9 ^ -806416468);
            case 123 -> a(804651690, var9 ^ 1914206185);
            case 124 -> a(804651701, var9 ^ -271943229);
            case 125 -> a(804651700, var9 ^ 1196715180);
            case 126 -> a(804651703, var9 ^ 519098896);
            case 127 -> a(804651702, var9 ^ -224825796);
            case 128 -> a(804651697, var9 ^ -2117444142);
            case 129 -> a(804651696, var9 ^ -1422191239);
            case 130 -> a(804651699, var9 ^ -1930650778);
            case 131 -> a(804651698, var9 ^ -810911076);
            case 132 -> a(804651709, var9 ^ 1474142618);
            case 133 -> a(804651708, var9 ^ -1616195358);
            case 134 -> a(804651711, var9 ^ -986108097);
            case 135 -> a(804651710, var9 ^ 243122086);
            case 136 -> a(804651705, var9 ^ -1622110024);
            case 137 -> a(804651704, var9 ^ -599615567);
            case 138 -> a(804651707, var9 ^ 482111383);
            case 139 -> a(804651706, var9 ^ 1276814280);
            case 140 -> a(804651653, var9 ^ -845840872);
            case 141 -> a(804651652, var9 ^ -1137206916);
            case 142 -> a(804651655, var9 ^ -1438413625);
            case 143 -> 0;
            case 144 -> a(804651654, var9 ^ -117236511);
            case 145 -> a(804651649, var9 ^ 1816226389);
            case 146 -> a(804651648, var9 ^ -1330516168);
            case 147 -> a(804651651, var9 ^ -1239936528);
            case 148 -> a(804651650, var9 ^ 2118256728);
            case 149 -> a(804651661, var9 ^ -1993170399);
            case 150 -> 2;
            case 151 -> a(804651660, var9 ^ -1949907319);
            case 152 -> a(804651663, var9 ^ -1230211081);
            case 153 -> a(804651662, var9 ^ 1741584895);
            case 154 -> a(804651657, var9 ^ 1076030245);
            case 155 -> a(804651656, var9 ^ 1222201401);
            case 156 -> a(804651659, var9 ^ -2109038595);
            case 157 -> a(804651658, var9 ^ 709466047);
            case 158 -> a(804651669, var9 ^ 1399395950);
            case 159 -> a(804651668, var9 ^ -265243081);
            case 160 -> a(804651671, var9 ^ -582507430);
            case 161 -> a(804651670, var9 ^ 744337285);
            case 162 -> a(804651665, var9 ^ 954339094);
            case 163 -> a(804651664, var9 ^ 556819879);
            case 164 -> a(804651667, var9 ^ -1075561851);
            case 165 -> a(804651666, var9 ^ -1841983291);
            case 166 -> a(804651677, var9 ^ 1374887902);
            case 167 -> a(804651676, var9 ^ -451719398);
            case 168 -> a(804651679, var9 ^ 1250639892);
            case 169 -> a(804651678, var9 ^ 1778703034);
            case 170 -> a(804651673, var9 ^ 1080888577);
            case 171 -> a(804651672, var9 ^ 269522850);
            case 172 -> a(804651675, var9 ^ 733099742);
            case 173 -> a(804651674, var9 ^ -1430070385);
            case 174 -> a(804651749, var9 ^ 2012930418);
            case 175 -> a(804651748, var9 ^ 791171789);
            case 176 -> a(804651751, var9 ^ -711323560);
            case 177 -> a(804651750, var9 ^ 1433592336);
            case 178 -> a(804651745, var9 ^ -986019415);
            case 179 -> a(804651744, var9 ^ 403258568);
            case 180 -> a(804651747, var9 ^ 815084260);
            case 181 -> a(804651746, var9 ^ -1017487477);
            case 182 -> a(804651757, var9 ^ -1959707532);
            case 183 -> a(804651756, var9 ^ -537347574);
            case 184 -> a(804651759, var9 ^ -323011414);
            case 185 -> a(804651758, var9 ^ 1117814596);
            case 186 -> a(804651753, var9 ^ 174097914);
            case 187 -> a(804651752, var9 ^ 1500086871);
            case 188 -> a(804651755, var9 ^ -1575754654);
            case 189 -> a(804651754, var9 ^ 639301914);
            case 190 -> a(804651765, var9 ^ 421215357);
            case 191 -> a(804651764, var9 ^ -1357423083);
            case 192 -> a(804651767, var9 ^ 1582781622);
            case 193 -> a(804651766, var9 ^ 1688001214);
            case 194 -> 4;
            case 195 -> a(804651761, var9 ^ -1955161440);
            case 196 -> a(804651760, var9 ^ -983748487);
            case 197 -> a(804651763, var9 ^ -1170928726);
            case 198 -> a(804651762, var9 ^ 1181808294);
            case 199 -> a(804651773, var9 ^ -147061223);
            case 200 -> a(804651772, var9 ^ -1651850964);
            case 201 -> a(804651775, var9 ^ 1946319009);
            case 202 -> a(804651774, var9 ^ 828571587);
            case 203 -> a(804651769, var9 ^ -582904531);
            case 204 -> a(804651768, var9 ^ 435222947);
            case 205 -> a(804651771, var9 ^ -1511442252);
            case 206 -> a(804651770, var9 ^ 2111027544);
            case 207 -> a(804651717, var9 ^ -1633593071);
            case 208 -> a(804651716, var9 ^ 737545072);
            case 209 -> a(804651719, var9 ^ 1660484093);
            case 210 -> a(804651718, var9 ^ -1893951078);
            case 211 -> a(804651713, var9 ^ 1005221420);
            case 212 -> a(804651712, var9 ^ 1326881183);
            case 213 -> a(804651715, var9 ^ 992611054);
            case 214 -> a(804651714, var9 ^ -1883709592);
            case 215 -> a(804651725, var9 ^ 659704344);
            case 216 -> a(804651724, var9 ^ 1891465500);
            case 217 -> a(804651727, var9 ^ 1548228911);
            case 218 -> a(804651726, var9 ^ -768260960);
            case 219 -> a(804651721, var9 ^ 68504172);
            case 220 -> a(804651720, var9 ^ 1885466410);
            case 221 -> a(804651723, var9 ^ 1072710377);
            case 222 -> a(804651722, var9 ^ -2068410045);
            case 223 -> a(804651733, var9 ^ -41494823);
            case 224 -> a(804651732, var9 ^ -653733084);
            case 225 -> a(804651735, var9 ^ 514446392);
            case 226 -> a(804651734, var9 ^ -23356540);
            case 227 -> a(804651729, var9 ^ 395227520);
            case 228 -> a(804651728, var9 ^ -1951691834);
            case 229 -> a(804651731, var9 ^ 22964587);
            case 230 -> a(804651730, var9 ^ 1127752421);
            case 231 -> a(804651741, var9 ^ 1609421850);
            case 232 -> a(804651740, var9 ^ 318856091);
            case 233 -> a(804651743, var9 ^ 547062799);
            case 234 -> a(804651742, var9 ^ -810020347);
            case 235 -> a(804651737, var9 ^ 1654958491);
            case 236 -> a(804651736, var9 ^ 32504355);
            case 237 -> a(804651739, var9 ^ -1908567975);
            case 238 -> a(804651738, var9 ^ 1532320051);
            case 239 -> a(804651813, var9 ^ -725750077);
            case 240 -> a(804651812, var9 ^ 385721624);
            case 241 -> a(804651815, var9 ^ -1193573992);
            case 242 -> a(804651814, var9 ^ 1646906601);
            case 243 -> a(804651809, var9 ^ 1635793688);
            case 244 -> a(804651808, var9 ^ 116671339);
            case 245 -> a(804651811, var9 ^ 582565590);
            case 246 -> a(804651810, var9 ^ -1063700494);
            case 247 -> a(804651821, var9 ^ -769438594);
            case 248 -> a(804651820, var9 ^ -1926467582);
            case 249 -> a(804651823, var9 ^ -621804885);
            case 250 -> a(804651822, var9 ^ -730955640);
            case 251 -> a(804651817, var9 ^ -1758230451);
            case 252 -> a(804651816, var9 ^ 1751141814);
            case 253 -> a(804651819, var9 ^ -492262551);
            case 254 -> a(804651818, var9 ^ 1697210184);
            default -> a(804651829, var9 ^ -1067790948);
         };
         int var5 = (var1 & a(804651828, var9 ^ -1973724396)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(804651831, var9 ^ -2030376556)) >>> a(804651830, var9 ^ 620931202)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(804651825, var9 ^ 1744035084);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(804651824, var9 ^ 921514457);
            }
         }

         abbb[var2] = new String(var3).intern();
      }

      return abbb[var2];
   }

   private int bbb(class_310 param1, class_1657 param2) {
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
      // 11: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 14: ifnull 1f
      // 17: aload 2
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush -1
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 26: aload 2
      // 27: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 2a: invokevirtual net/minecraft/class_634.method_2871 (Ljava/util/UUID;)Lnet/minecraft/class_640;
      // 2d: astore 4
      // 2f: aload 4
      // 31: iload 3
      // 32: ifne 3e
      // 35: ifnull 44
      // 38: goto 3c
      // 3b: athrow
      // 3c: aload 4
      // 3e: invokevirtual net/minecraft/class_640.method_2959 ()I
      // 41: goto 45
      // 44: bipush -1
      // 45: ireturn
   }

   private static String aaaa(String param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -807603348
      // 003: istore 34
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 0
      // 00a: iload 2
      // 00b: ifne 016
      // 00e: ifnull 024
      // 011: goto 015
      // 014: athrow
      // 015: aload 0
      // 016: iload 2
      // 017: ifne 02e
      // 01a: invokevirtual java/lang/String.isEmpty ()Z
      // 01d: ifeq 027
      // 020: goto 024
      // 023: athrow
      // 024: aconst_null
      // 025: areturn
      // 026: athrow
      // 027: aload 0
      // 028: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 02b: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 02e: invokevirtual java/lang/String.hashCode ()I
      // 031: istore 3
      // 032: iload 3
      // 033: iload 2
      // 034: ifne 87c
      // 037: lookupswitch 2105 34 -1964679349 631 -1924883326 399 -1684858151 282 -1571105471 1045 -1393639857 1161 -1380923823 1840 -1242897082 1989 -1206031437 1956 -1056264474 1393 -874519716 664 -720514431 1277 -677216191 1542 -675252731 2047 -161290517 515 97513267 1716 106858757 1600 107028782 1658 109556736 1103 173173288 1749 350056506 1335 620514517 1509 686066415 457 915847580 573 949868500 1012 961218153 1451 976288699 1219 1168154088 896 1386075689 1898 1430090624 341 1552717032 1782 1603571740 954 1640856381 722 1766328849 780 2052708091 838
      // 150: athrow
      // 151: ldc_w 804651879
      // 154: iload 34
      // 156: ldc_w 552754915
      // 159: ixor
      // 15a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 15d: ldc_w 804651878
      // 160: iload 34
      // 162: ldc_w 212754244
      // 165: ixor
      // 166: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 169: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 16c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 16f: iload 1
      // 170: istore 5
      // 172: astore 4
      // 174: new java/lang/StringBuilder
      // 177: dup
      // 178: invokespecial java/lang/StringBuilder.<init> ()V
      // 17b: aload 4
      // 17d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 180: iload 5
      // 182: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 185: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 188: goto 8b0
      // 18b: athrow
      // 18c: ldc_w 804651873
      // 18f: iload 34
      // 191: ldc_w 482626300
      // 194: ixor
      // 195: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 198: ldc_w 804651872
      // 19b: iload 34
      // 19d: ldc_w -940696664
      // 1a0: ixor
      // 1a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 1a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 1a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1aa: iload 1
      // 1ab: istore 6
      // 1ad: astore 5
      // 1af: new java/lang/StringBuilder
      // 1b2: dup
      // 1b3: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b6: aload 5
      // 1b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1bb: iload 6
      // 1bd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1c0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c3: goto 8b0
      // 1c6: ldc_w 804651875
      // 1c9: iload 34
      // 1cb: ldc_w -1164142553
      // 1ce: ixor
      // 1cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 1d2: ldc_w 804651874
      // 1d5: iload 34
      // 1d7: ldc_w 1267529070
      // 1da: ixor
      // 1db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 1de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 1e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1e4: iload 1
      // 1e5: istore 7
      // 1e7: astore 6
      // 1e9: new java/lang/StringBuilder
      // 1ec: dup
      // 1ed: invokespecial java/lang/StringBuilder.<init> ()V
      // 1f0: aload 6
      // 1f2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1f5: iload 7
      // 1f7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1fa: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1fd: goto 8b0
      // 200: ldc_w 804651885
      // 203: iload 34
      // 205: ldc_w -802623131
      // 208: ixor
      // 209: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 20c: ldc_w 804651884
      // 20f: iload 34
      // 211: ldc_w -1065236713
      // 214: ixor
      // 215: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 218: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 21b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 21e: iload 1
      // 21f: istore 8
      // 221: astore 7
      // 223: new java/lang/StringBuilder
      // 226: dup
      // 227: invokespecial java/lang/StringBuilder.<init> ()V
      // 22a: aload 7
      // 22c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 22f: iload 8
      // 231: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 234: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 237: goto 8b0
      // 23a: ldc_w 804651887
      // 23d: iload 34
      // 23f: ldc_w 711516332
      // 242: ixor
      // 243: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 246: ldc_w 804651886
      // 249: iload 34
      // 24b: ldc_w 1321841145
      // 24e: ixor
      // 24f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 252: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 255: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 258: iload 1
      // 259: istore 9
      // 25b: astore 8
      // 25d: new java/lang/StringBuilder
      // 260: dup
      // 261: invokespecial java/lang/StringBuilder.<init> ()V
      // 264: aload 8
      // 266: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 269: iload 9
      // 26b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 26e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 271: goto 8b0
      // 274: ldc_w 804651881
      // 277: iload 34
      // 279: ldc_w -2137344995
      // 27c: ixor
      // 27d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 280: ldc_w 804651880
      // 283: iload 34
      // 285: ldc_w -1985175186
      // 288: ixor
      // 289: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 28c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 28f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 292: iload 1
      // 293: istore 10
      // 295: astore 9
      // 297: new java/lang/StringBuilder
      // 29a: dup
      // 29b: invokespecial java/lang/StringBuilder.<init> ()V
      // 29e: aload 9
      // 2a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2a3: iload 10
      // 2a5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 2a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2ab: goto 8b0
      // 2ae: ldc_w 804651883
      // 2b1: iload 34
      // 2b3: ldc_w 442756658
      // 2b6: ixor
      // 2b7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 2ba: ldc_w 804651882
      // 2bd: iload 34
      // 2bf: ldc_w -965615304
      // 2c2: ixor
      // 2c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 2c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 2c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2cc: goto 8b0
      // 2cf: ldc_w 804651893
      // 2d2: iload 34
      // 2d4: ldc_w 1861873477
      // 2d7: ixor
      // 2d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 2db: ldc_w 804651892
      // 2de: iload 34
      // 2e0: ldc_w -1825521481
      // 2e3: ixor
      // 2e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 2e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 2ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2ed: iload 1
      // 2ee: istore 11
      // 2f0: astore 10
      // 2f2: new java/lang/StringBuilder
      // 2f5: dup
      // 2f6: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f9: aload 10
      // 2fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 2fe: iload 11
      // 300: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 303: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 306: goto 8b0
      // 309: ldc_w 804651895
      // 30c: iload 34
      // 30e: ldc_w 1059386755
      // 311: ixor
      // 312: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 315: ldc_w 804651894
      // 318: iload 34
      // 31a: ldc_w 335390544
      // 31d: ixor
      // 31e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 321: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 324: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 327: iload 1
      // 328: istore 12
      // 32a: astore 11
      // 32c: new java/lang/StringBuilder
      // 32f: dup
      // 330: invokespecial java/lang/StringBuilder.<init> ()V
      // 333: aload 11
      // 335: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 338: iload 12
      // 33a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 33d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 340: goto 8b0
      // 343: ldc_w 804651889
      // 346: iload 34
      // 348: ldc_w -43652182
      // 34b: ixor
      // 34c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 34f: ldc_w 804651888
      // 352: iload 34
      // 354: ldc_w 28451604
      // 357: ixor
      // 358: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 35b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 35e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 361: iload 1
      // 362: istore 13
      // 364: astore 12
      // 366: new java/lang/StringBuilder
      // 369: dup
      // 36a: invokespecial java/lang/StringBuilder.<init> ()V
      // 36d: aload 12
      // 36f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 372: iload 13
      // 374: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 377: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 37a: goto 8b0
      // 37d: ldc_w 804651891
      // 380: iload 34
      // 382: ldc_w -699405780
      // 385: ixor
      // 386: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 389: ldc_w 804651890
      // 38c: iload 34
      // 38e: ldc_w 1711719793
      // 391: ixor
      // 392: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 395: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 398: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 39b: iload 1
      // 39c: istore 14
      // 39e: astore 13
      // 3a0: new java/lang/StringBuilder
      // 3a3: dup
      // 3a4: invokespecial java/lang/StringBuilder.<init> ()V
      // 3a7: aload 13
      // 3a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3ac: iload 14
      // 3ae: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3b1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3b4: goto 8b0
      // 3b7: ldc_w 804651901
      // 3ba: iload 34
      // 3bc: ldc_w 840463202
      // 3bf: ixor
      // 3c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 3c3: ldc_w 804651900
      // 3c6: iload 34
      // 3c8: ldc_w -1334511193
      // 3cb: ixor
      // 3cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 3cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 3d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 3d5: iload 1
      // 3d6: istore 15
      // 3d8: astore 14
      // 3da: new java/lang/StringBuilder
      // 3dd: dup
      // 3de: invokespecial java/lang/StringBuilder.<init> ()V
      // 3e1: aload 14
      // 3e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 3e6: iload 15
      // 3e8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 3eb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3ee: goto 8b0
      // 3f1: ldc_w 804651903
      // 3f4: iload 34
      // 3f6: ldc_w -1599903272
      // 3f9: ixor
      // 3fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 3fd: ldc_w 804651902
      // 400: iload 34
      // 402: ldc_w -1168090786
      // 405: ixor
      // 406: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 409: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 40c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 40f: iload 1
      // 410: istore 16
      // 412: astore 15
      // 414: new java/lang/StringBuilder
      // 417: dup
      // 418: invokespecial java/lang/StringBuilder.<init> ()V
      // 41b: aload 15
      // 41d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 420: iload 16
      // 422: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 425: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 428: goto 8b0
      // 42b: ldc_w 804651897
      // 42e: iload 34
      // 430: ldc_w 198201989
      // 433: ixor
      // 434: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 437: ldc_w 804651896
      // 43a: iload 34
      // 43c: ldc_w 1989432160
      // 43f: ixor
      // 440: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 443: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 446: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 449: goto 8b0
      // 44c: ldc_w 804651899
      // 44f: iload 34
      // 451: ldc_w 680584748
      // 454: ixor
      // 455: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 458: ldc_w 804651898
      // 45b: iload 34
      // 45d: ldc_w -1325886815
      // 460: ixor
      // 461: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 464: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 467: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 46a: iload 1
      // 46b: istore 17
      // 46d: astore 16
      // 46f: new java/lang/StringBuilder
      // 472: dup
      // 473: invokespecial java/lang/StringBuilder.<init> ()V
      // 476: aload 16
      // 478: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 47b: iload 17
      // 47d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 480: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 483: goto 8b0
      // 486: ldc_w 804651845
      // 489: iload 34
      // 48b: ldc_w 1370501335
      // 48e: ixor
      // 48f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 492: ldc_w 804651844
      // 495: iload 34
      // 497: ldc_w 1935843564
      // 49a: ixor
      // 49b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 49e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 4a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 4a4: iload 1
      // 4a5: istore 18
      // 4a7: astore 17
      // 4a9: new java/lang/StringBuilder
      // 4ac: dup
      // 4ad: invokespecial java/lang/StringBuilder.<init> ()V
      // 4b0: aload 17
      // 4b2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4b5: iload 18
      // 4b7: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4ba: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4bd: goto 8b0
      // 4c0: ldc_w 804651847
      // 4c3: iload 34
      // 4c5: ldc_w -260390013
      // 4c8: ixor
      // 4c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 4cc: ldc_w 804651846
      // 4cf: iload 34
      // 4d1: ldc_w -2014096857
      // 4d4: ixor
      // 4d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 4d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 4db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 4de: iload 1
      // 4df: istore 19
      // 4e1: astore 18
      // 4e3: new java/lang/StringBuilder
      // 4e6: dup
      // 4e7: invokespecial java/lang/StringBuilder.<init> ()V
      // 4ea: aload 18
      // 4ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 4ef: iload 19
      // 4f1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 4f4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4f7: goto 8b0
      // 4fa: ldc_w 804651841
      // 4fd: iload 34
      // 4ff: ldc_w -1436942102
      // 502: ixor
      // 503: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 506: ldc_w 804651840
      // 509: iload 34
      // 50b: ldc_w -1117625417
      // 50e: ixor
      // 50f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 512: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 515: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 518: iload 1
      // 519: istore 20
      // 51b: astore 19
      // 51d: new java/lang/StringBuilder
      // 520: dup
      // 521: invokespecial java/lang/StringBuilder.<init> ()V
      // 524: aload 19
      // 526: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 529: iload 20
      // 52b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 52e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 531: goto 8b0
      // 534: ldc_w 804651843
      // 537: iload 34
      // 539: ldc_w -877320172
      // 53c: ixor
      // 53d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 540: ldc_w 804651842
      // 543: iload 34
      // 545: ldc_w -624909207
      // 548: ixor
      // 549: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 54c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 54f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 552: iload 1
      // 553: istore 21
      // 555: astore 20
      // 557: new java/lang/StringBuilder
      // 55a: dup
      // 55b: invokespecial java/lang/StringBuilder.<init> ()V
      // 55e: aload 20
      // 560: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 563: iload 21
      // 565: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 568: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 56b: goto 8b0
      // 56e: ldc_w 804651853
      // 571: iload 34
      // 573: ldc_w 261061513
      // 576: ixor
      // 577: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 57a: ldc_w 804651852
      // 57d: iload 34
      // 57f: ldc_w 356185845
      // 582: ixor
      // 583: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 586: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 589: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 58c: iload 1
      // 58d: istore 22
      // 58f: astore 21
      // 591: new java/lang/StringBuilder
      // 594: dup
      // 595: invokespecial java/lang/StringBuilder.<init> ()V
      // 598: aload 21
      // 59a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 59d: iload 22
      // 59f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5a2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5a5: goto 8b0
      // 5a8: ldc_w 804651855
      // 5ab: iload 34
      // 5ad: ldc_w -1767061932
      // 5b0: ixor
      // 5b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 5b4: ldc_w 804651854
      // 5b7: iload 34
      // 5b9: ldc_w -1502294519
      // 5bc: ixor
      // 5bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 5c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 5c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 5c6: iload 1
      // 5c7: istore 23
      // 5c9: astore 22
      // 5cb: new java/lang/StringBuilder
      // 5ce: dup
      // 5cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 5d2: aload 22
      // 5d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 5d7: iload 23
      // 5d9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5dc: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5df: goto 8b0
      // 5e2: ldc_w 804651849
      // 5e5: iload 34
      // 5e7: ldc_w 648618171
      // 5ea: ixor
      // 5eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 5ee: ldc_w 804651848
      // 5f1: iload 34
      // 5f3: ldc_w -668053616
      // 5f6: ixor
      // 5f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 5fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 5fd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 600: iload 1
      // 601: istore 24
      // 603: astore 23
      // 605: new java/lang/StringBuilder
      // 608: dup
      // 609: invokespecial java/lang/StringBuilder.<init> ()V
      // 60c: aload 23
      // 60e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 611: iload 24
      // 613: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 616: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 619: goto 8b0
      // 61c: ldc_w 804651851
      // 61f: iload 34
      // 621: ldc_w -2083603534
      // 624: ixor
      // 625: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 628: ldc_w 804651850
      // 62b: iload 34
      // 62d: ldc_w -1210611989
      // 630: ixor
      // 631: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 634: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 637: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 63a: goto 8b0
      // 63d: ldc_w 804651861
      // 640: iload 34
      // 642: ldc_w 1070583158
      // 645: ixor
      // 646: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 649: ldc_w 804651860
      // 64c: iload 34
      // 64e: ldc_w 909442203
      // 651: ixor
      // 652: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 655: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 658: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 65b: iload 1
      // 65c: istore 25
      // 65e: astore 24
      // 660: new java/lang/StringBuilder
      // 663: dup
      // 664: invokespecial java/lang/StringBuilder.<init> ()V
      // 667: aload 24
      // 669: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 66c: iload 25
      // 66e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 671: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 674: goto 8b0
      // 677: ldc_w 804651863
      // 67a: iload 34
      // 67c: ldc_w 1506290001
      // 67f: ixor
      // 680: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 683: ldc_w 804651862
      // 686: iload 34
      // 688: ldc_w 1805753091
      // 68b: ixor
      // 68c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 68f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 692: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 695: iload 1
      // 696: istore 26
      // 698: astore 25
      // 69a: new java/lang/StringBuilder
      // 69d: dup
      // 69e: invokespecial java/lang/StringBuilder.<init> ()V
      // 6a1: aload 25
      // 6a3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 6a6: iload 26
      // 6a8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6ae: goto 8b0
      // 6b1: ldc_w 804651857
      // 6b4: iload 34
      // 6b6: ldc_w 2079635153
      // 6b9: ixor
      // 6ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 6bd: ldc_w 804651856
      // 6c0: iload 34
      // 6c2: ldc_w -1279491339
      // 6c5: ixor
      // 6c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 6c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 6cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 6cf: iload 1
      // 6d0: istore 27
      // 6d2: astore 26
      // 6d4: new java/lang/StringBuilder
      // 6d7: dup
      // 6d8: invokespecial java/lang/StringBuilder.<init> ()V
      // 6db: aload 26
      // 6dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 6e0: iload 27
      // 6e2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 6e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 6e8: goto 8b0
      // 6eb: ldc_w 804651859
      // 6ee: iload 34
      // 6f0: ldc_w 1959217403
      // 6f3: ixor
      // 6f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 6f7: ldc_w 804651858
      // 6fa: iload 34
      // 6fc: ldc_w -1771490170
      // 6ff: ixor
      // 700: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 703: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 706: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 709: goto 8b0
      // 70c: ldc_w 804651869
      // 70f: iload 34
      // 711: ldc_w 2450063
      // 714: ixor
      // 715: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 718: ldc_w 804651868
      // 71b: iload 34
      // 71d: ldc_w 1625523111
      // 720: ixor
      // 721: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 724: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 727: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 72a: goto 8b0
      // 72d: ldc_w 804651871
      // 730: iload 34
      // 732: ldc_w -265137707
      // 735: ixor
      // 736: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 739: ldc_w 804651870
      // 73c: iload 34
      // 73e: ldc_w -2025828763
      // 741: ixor
      // 742: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 745: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 748: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 74b: iload 1
      // 74c: istore 28
      // 74e: astore 27
      // 750: new java/lang/StringBuilder
      // 753: dup
      // 754: invokespecial java/lang/StringBuilder.<init> ()V
      // 757: aload 27
      // 759: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 75c: iload 28
      // 75e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 761: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 764: goto 8b0
      // 767: ldc_w 804651865
      // 76a: iload 34
      // 76c: ldc_w -423593339
      // 76f: ixor
      // 770: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 773: ldc_w 804651864
      // 776: iload 34
      // 778: ldc_w -1796804337
      // 77b: ixor
      // 77c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 77f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 782: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 785: iload 1
      // 786: istore 29
      // 788: astore 28
      // 78a: new java/lang/StringBuilder
      // 78d: dup
      // 78e: invokespecial java/lang/StringBuilder.<init> ()V
      // 791: aload 28
      // 793: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 796: iload 29
      // 798: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 79b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 79e: goto 8b0
      // 7a1: ldc_w 804651867
      // 7a4: iload 34
      // 7a6: ldc_w -505264279
      // 7a9: ixor
      // 7aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 7ad: ldc_w 804651866
      // 7b0: iload 34
      // 7b2: ldc_w -1566923922
      // 7b5: ixor
      // 7b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 7b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 7bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 7bf: iload 1
      // 7c0: istore 30
      // 7c2: astore 29
      // 7c4: new java/lang/StringBuilder
      // 7c7: dup
      // 7c8: invokespecial java/lang/StringBuilder.<init> ()V
      // 7cb: aload 29
      // 7cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7d0: iload 30
      // 7d2: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 7d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 7d8: goto 8b0
      // 7db: ldc_w 804651941
      // 7de: iload 34
      // 7e0: ldc_w 259953784
      // 7e3: ixor
      // 7e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 7e7: ldc_w 804651940
      // 7ea: iload 34
      // 7ec: ldc_w -103659802
      // 7ef: ixor
      // 7f0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 7f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 7f6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 7f9: goto 8b0
      // 7fc: ldc_w 804651943
      // 7ff: iload 34
      // 801: ldc_w -112252968
      // 804: ixor
      // 805: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 808: ldc_w 804651942
      // 80b: iload 34
      // 80d: ldc_w 1523048582
      // 810: ixor
      // 811: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 814: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 817: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 81a: iload 1
      // 81b: istore 31
      // 81d: astore 30
      // 81f: new java/lang/StringBuilder
      // 822: dup
      // 823: invokespecial java/lang/StringBuilder.<init> ()V
      // 826: aload 30
      // 828: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 82b: iload 31
      // 82d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 830: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 833: goto 8b0
      // 836: ldc_w 804651937
      // 839: iload 34
      // 83b: ldc_w 1529585893
      // 83e: ixor
      // 83f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 842: ldc_w 804651936
      // 845: iload 34
      // 847: ldc_w 274209944
      // 84a: ixor
      // 84b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 84e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 851: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 854: iload 1
      // 855: istore 32
      // 857: astore 31
      // 859: new java/lang/StringBuilder
      // 85c: dup
      // 85d: invokespecial java/lang/StringBuilder.<init> ()V
      // 860: aload 31
      // 862: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 865: iload 32
      // 867: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 86a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 86d: goto 8b0
      // 870: aload 0
      // 871: iload 2
      // 872: ifne 891
      // 875: invokevirtual java/lang/String.length ()I
      // 878: goto 87c
      // 87b: athrow
      // 87c: bipush 2
      // 87d: if_icmpgt 88b
      // 880: aload 0
      // 881: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 884: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 887: goto 897
      // 88a: athrow
      // 88b: aload 0
      // 88c: bipush 0
      // 88d: bipush 2
      // 88e: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 891: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 894: invokevirtual java/lang/String.toUpperCase (Ljava/util/Locale;)Ljava/lang/String;
      // 897: iload 1
      // 898: istore 33
      // 89a: astore 32
      // 89c: new java/lang/StringBuilder
      // 89f: dup
      // 8a0: invokespecial java/lang/StringBuilder.<init> ()V
      // 8a3: aload 32
      // 8a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8a8: iload 33
      // 8aa: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 8ad: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 8b0: areturn
   }

   private void aaab(class_332 var1, bbaababb var2, double var3, int var5) {
      int var10000 = a(804651939, 2026053108 ^ -1228673951);
      double var6 = var2.ba();
      double var8 = var2.aaa();
      double var10 = var2.aa();
      int var12 = (int)Math.round(Math.min(aabb(var10000, 5369109183100390965L), var5) * 0.55);
      abbaa.aabab(
         var1,
         var6,
         var8,
         var10,
         12.0,
         3.0,
         ababbbaba.bb(aabb(a(804651938, 2026053108 ^ -1359273537), 3863627233696259414L), var12)
      );
      int var13 = ababbbaba.bb(ababbbaba.aaa(var3).getRGB(), var5);
      abbaa.bbbbbb(
         var1, var6 + 1.5, var8 + 12.0 + 1.0, var10 - 3.0, 2.0, var3, abbb(aabb(a(804651949, 2026053108 ^ 2085228697), 5731583558190877208L), var5), var13
      );
   }

   @Override
   public void aabbb(class_332 var1, int var2, int var3, float var4) {
      int var5 = baaabbaa.bba;

      try {
         if (this.abaa.isEmpty()) {
            return;
         }
      } catch (MatchException var10) {
         throw var10;
      }

      class_310 var6 = class_310.method_1551();

      try {
         if (var6.field_1772 == null) {
            return;
         }
      } catch (MatchException var9) {
         throw var9;
      }

      for (baabbb var8 : this.abaa) {
         this.bbab(var1, var6, var8);
         if (var5 != 0) {
            break;
         }
      }
   }

   private List aaba(class_1799 param1) {
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
      // 12: ifne 2e
      // 15: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 18: ifeq 24
      // 1b: goto 1f
      // 1e: athrow
      // 1f: invokestatic java/util/List.of ()Ljava/util/List;
      // 22: areturn
      // 23: athrow
      // 24: aload 1
      // 25: getstatic net/minecraft/class_9334.field_49633 Lnet/minecraft/class_9331;
      // 28: getstatic net/minecraft/class_9304.field_49385 Lnet/minecraft/class_9304;
      // 2b: invokevirtual net/minecraft/class_1799.method_58695 (Lnet/minecraft/class_9331;Ljava/lang/Object;)Ljava/lang/Object;
      // 2e: checkcast net/minecraft/class_9304
      // 31: astore 3
      // 32: aload 3
      // 33: invokevirtual net/minecraft/class_9304.method_57543 ()Z
      // 36: ifeq 3e
      // 39: invokestatic java/util/List.of ()Ljava/util/List;
      // 3c: areturn
      // 3d: athrow
      // 3e: new java/util/ArrayList
      // 41: dup
      // 42: bipush 4
      // 43: invokespecial java/util/ArrayList.<init> (I)V
      // 46: astore 4
      // 48: aload 3
      // 49: invokevirtual net/minecraft/class_9304.method_57534 ()Ljava/util/Set;
      // 4c: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 51: astore 5
      // 53: aload 5
      // 55: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5a: ifeq c1
      // 5d: aload 5
      // 5f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 64: checkcast net/minecraft/class_6880
      // 67: astore 6
      // 69: aload 3
      // 6a: aload 6
      // 6c: invokevirtual net/minecraft/class_9304.method_57536 (Lnet/minecraft/class_6880;)I
      // 6f: istore 7
      // 71: aload 6
      // 73: invokeinterface net/minecraft/class_6880.method_40230 ()Ljava/util/Optional; 1
      // 78: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aa (Lnet/minecraft/class_5321;)Ljava/lang/String;, (Lnet/minecraft/class_5321;)Ljava/lang/String; ]
      // 7d: invokevirtual java/util/Optional.map (Ljava/util/function/Function;)Ljava/util/Optional;
      // 80: aconst_null
      // 81: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 84: checkcast java/lang/String
      // 87: astore 8
      // 89: aload 8
      // 8b: iload 7
      // 8d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aaaa (Ljava/lang/String;I)Ljava/lang/String;
      // 90: astore 9
      // 92: aload 9
      // 94: iload 2
      // 95: ifne a1
      // 98: ifnull bd
      // 9b: goto 9f
      // 9e: athrow
      // 9f: aload 9
      // a1: invokevirtual java/lang/String.isEmpty ()Z
      // a4: iload 2
      // a5: ifne bc
      // a8: ifne bd
      // ab: goto af
      // ae: athrow
      // af: aload 4
      // b1: aload 9
      // b3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // b8: goto bc
      // bb: athrow
      // bc: pop
      // bd: iload 2
      // be: ifeq 53
      // c1: aload 4
      // c3: areturn
   }

   private static int aabb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(804651948, 1299494599 ^ -592520019);
      if (aabba[var3] == null) {
         aabba[var3] = (int)(aaa[var3] ^ var1);
      }

      return aabba[var3];
   }

   private static int a(int var0, int var1) {
      int var2 = abaaa[var0 ^ 804651557] ^ var1 ^ var0;
      var2 ^= 26017;
      var2 -= 54582;
      var2 -= 25816;
      var2 += 42731;
      var2 ^= 28498;
      var2 += 8010;
      var2 ^= 26235;
      var2 ^= 18551;
      var2 += 15808;
      return var2 - 27749;
   }

   private List abaa(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: new java/util/ArrayList
      // 06: dup
      // 07: ldc_w 804651951
      // 0a: ldc_w 172608393
      // 0d: ldc_w 2061067471
      // 10: ixor
      // 11: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 14: ldc2_w 8692910243437614934
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb (IJ)I
      // 1a: invokespecial java/util/ArrayList.<init> (I)V
      // 1d: astore 3
      // 1e: istore 2
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/class_1657.method_6047 ()Lnet/minecraft/class_1799;
      // 23: astore 4
      // 25: iload 2
      // 26: ifne 66
      // 29: aload 4
      // 2b: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 2e: ifne 42
      // 31: goto 35
      // 34: athrow
      // 35: aload 3
      // 36: aload 4
      // 38: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3d: pop
      // 3e: goto 42
      // 41: athrow
      // 42: aload 0
      // 43: aload 1
      // 44: getstatic net/minecraft/class_1304.field_6169 Lnet/minecraft/class_1304;
      // 47: aload 3
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.baab (Lnet/minecraft/class_1657;Lnet/minecraft/class_1304;Ljava/util/List;)V
      // 4b: aload 0
      // 4c: aload 1
      // 4d: getstatic net/minecraft/class_1304.field_6174 Lnet/minecraft/class_1304;
      // 50: aload 3
      // 51: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.baab (Lnet/minecraft/class_1657;Lnet/minecraft/class_1304;Ljava/util/List;)V
      // 54: aload 0
      // 55: aload 1
      // 56: getstatic net/minecraft/class_1304.field_6172 Lnet/minecraft/class_1304;
      // 59: aload 3
      // 5a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.baab (Lnet/minecraft/class_1657;Lnet/minecraft/class_1304;Ljava/util/List;)V
      // 5d: aload 0
      // 5e: aload 1
      // 5f: getstatic net/minecraft/class_1304.field_6166 Lnet/minecraft/class_1304;
      // 62: aload 3
      // 63: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.baab (Lnet/minecraft/class_1657;Lnet/minecraft/class_1304;Ljava/util/List;)V
      // 66: aload 1
      // 67: invokevirtual net/minecraft/class_1657.method_6079 ()Lnet/minecraft/class_1799;
      // 6a: astore 5
      // 6c: aload 5
      // 6e: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 71: iload 2
      // 72: ifne 88
      // 75: ifne 89
      // 78: goto 7c
      // 7b: athrow
      // 7c: aload 3
      // 7d: aload 5
      // 7f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 84: goto 88
      // 87: athrow
      // 88: pop
      // 89: aload 3
      // 8a: areturn
   }

   private int abab(class_327 var1, String var2) {
      return var1.method_1727(var2);
   }

   private void abba(class_332 param1, class_1799 param2, double param3, double param5, class_327 param7, int param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.abbaab (Lnet/minecraft/class_332;)V
      // 07: istore 9
      // 09: aload 1
      // 0a: dload 3
      // 0b: dload 5
      // 0d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bb (Lnet/minecraft/class_332;DD)V
      // 10: aload 1
      // 11: ldc2_w 0.75
      // 14: ldc2_w 0.75
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bbbbba (Lnet/minecraft/class_332;DD)V
      // 1a: aload 1
      // 1b: aload 7
      // 1d: aload 2
      // 1e: bipush 0
      // 1f: bipush 0
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.aab (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Lnet/minecraft/class_1799;II)V
      // 23: aload 1
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.ababbb (Lnet/minecraft/class_332;)V
      // 27: aload 0
      // 28: iload 9
      // 2a: ifne 3f
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 30: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 33: ifeq 4b
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 1
      // 40: aload 2
      // 41: dload 3
      // 42: dload 5
      // 44: aload 7
      // 46: iload 8
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abb (Lnet/minecraft/class_332;Lnet/minecraft/class_1799;DDLnet/minecraft/class_327;I)V
      // 4b: return
   }

   private static int abbb(int var0, int var1) {
      int var3 = 759259824;
      int var2 = (int)Math.round(
         (var0 >>> aabb(a(804651950, var3 ^ -960005994), 3443729306276369716L) & aabb(a(804651945, var3 ^ -1193273450), 116273926695047738L))
               * Math.max(0, Math.min(aabb(a(804651944, var3 ^ 1971982830), 116273926695047738L), var1))
            / 255.0
      );
      return var2 << aabb(a(804651947, var3 ^ -749596549), 5201148036518019049L) | var0 & aabb(a(804651946, var3 ^ 1668791264), 507905803115978060L);
   }

   private aaaaaaabb baaa(aabbbbaaa param1, class_238 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: aload 2
      // 004: getfield net/minecraft/class_238.field_1323 D
      // 007: dstore 4
      // 009: aload 2
      // 00a: getfield net/minecraft/class_238.field_1323 D
      // 00d: aload 2
      // 00e: getfield net/minecraft/class_238.field_1320 D
      // 011: dadd
      // 012: ldc2_w 0.5
      // 015: dmul
      // 016: dstore 6
      // 018: aload 2
      // 019: getfield net/minecraft/class_238.field_1320 D
      // 01c: dstore 8
      // 01e: istore 3
      // 01f: aload 2
      // 020: getfield net/minecraft/class_238.field_1321 D
      // 023: dstore 10
      // 025: aload 2
      // 026: getfield net/minecraft/class_238.field_1321 D
      // 029: aload 2
      // 02a: getfield net/minecraft/class_238.field_1324 D
      // 02d: dadd
      // 02e: ldc2_w 0.5
      // 031: dmul
      // 032: dstore 12
      // 034: aload 2
      // 035: getfield net/minecraft/class_238.field_1324 D
      // 038: dstore 14
      // 03a: aload 2
      // 03b: getfield net/minecraft/class_238.field_1325 D
      // 03e: ldc2_w 0.15
      // 041: dadd
      // 042: dstore 16
      // 044: new net/minecraft/class_243
      // 047: dup
      // 048: dload 6
      // 04a: dload 16
      // 04c: dload 12
      // 04e: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 051: new net/minecraft/class_243
      // 054: dup
      // 055: dload 4
      // 057: dload 16
      // 059: dload 10
      // 05b: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 05e: new net/minecraft/class_243
      // 061: dup
      // 062: dload 4
      // 064: dload 16
      // 066: dload 12
      // 068: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 06b: new net/minecraft/class_243
      // 06e: dup
      // 06f: dload 4
      // 071: dload 16
      // 073: dload 14
      // 075: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 078: new net/minecraft/class_243
      // 07b: dup
      // 07c: dload 6
      // 07e: dload 16
      // 080: dload 10
      // 082: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 085: new net/minecraft/class_243
      // 088: dup
      // 089: dload 6
      // 08b: dload 16
      // 08d: dload 14
      // 08f: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 092: new net/minecraft/class_243
      // 095: dup
      // 096: dload 8
      // 098: dload 16
      // 09a: dload 10
      // 09c: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 09f: new net/minecraft/class_243
      // 0a2: dup
      // 0a3: dload 8
      // 0a5: dload 16
      // 0a7: dload 12
      // 0a9: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 0ac: new net/minecraft/class_243
      // 0af: dup
      // 0b0: dload 8
      // 0b2: dload 16
      // 0b4: dload 14
      // 0b6: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 0b9: invokestatic java/util/List.of (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
      // 0bc: astore 18
      // 0be: dconst_0
      // 0bf: dstore 19
      // 0c1: ldc2_w Infinity
      // 0c4: dstore 21
      // 0c6: bipush 0
      // 0c7: istore 23
      // 0c9: aload 18
      // 0cb: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0d0: astore 24
      // 0d2: aload 24
      // 0d4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d9: ifeq 126
      // 0dc: aload 24
      // 0de: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0e3: checkcast net/minecraft/class_243
      // 0e6: astore 25
      // 0e8: iload 3
      // 0e9: ifne 14f
      // 0ec: aload 1
      // 0ed: aload 25
      // 0ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_243;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaa;
      // 0f2: astore 26
      // 0f4: iload 3
      // 0f5: ifne 122
      // 0f8: aload 26
      // 0fa: ifnonnull 109
      // 0fd: goto 101
      // 100: athrow
      // 101: iload 3
      // 102: ifeq 0d2
      // 105: goto 109
      // 108: athrow
      // 109: dload 19
      // 10b: aload 26
      // 10d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaa.ab ()D
      // 110: dadd
      // 111: dstore 19
      // 113: dload 21
      // 115: aload 26
      // 117: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaa.aa ()D
      // 11a: invokestatic java/lang/Math.min (DD)D
      // 11d: dstore 21
      // 11f: iinc 23 1
      // 122: iload 3
      // 123: ifeq 0d2
      // 126: iload 23
      // 128: iload 3
      // 129: ifne 144
      // 12c: ifeq 14f
      // 12f: goto 133
      // 132: athrow
      // 133: dload 19
      // 135: iload 3
      // 136: ifne 149
      // 139: goto 13d
      // 13c: athrow
      // 13d: invokestatic java/lang/Double.isFinite (D)Z
      // 140: goto 144
      // 143: athrow
      // 144: ifeq 14f
      // 147: dload 21
      // 149: invokestatic java/lang/Double.isFinite (D)Z
      // 14c: ifne 151
      // 14f: aconst_null
      // 150: areturn
      // 151: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaabb
      // 154: dup
      // 155: dload 19
      // 157: iload 23
      // 159: i2d
      // 15a: ddiv
      // 15b: dload 21
      // 15d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaabb.<init> (DD)V
      // 160: areturn
   }

   private void baab(class_1657 param1, class_1304 param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: aload 2
      // 05: invokevirtual net/minecraft/class_1657.method_6118 (Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;
      // 08: astore 5
      // 0a: istore 4
      // 0c: aload 5
      // 0e: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 11: iload 4
      // 13: ifne 29
      // 16: ifne 2a
      // 19: goto 1d
      // 1c: athrow
      // 1d: aload 3
      // 1e: aload 5
      // 20: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 25: goto 29
      // 28: athrow
      // 29: pop
      // 2a: return
   }

   private void baba(class_332 param1, class_1657 param2, class_327 param3, double param4, int param6) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abaa (Lnet/minecraft/class_1657;)Ljava/util/List;
      // 08: astore 8
      // 0a: istore 7
      // 0c: aload 8
      // 0e: iload 7
      // 10: ifne 23
      // 13: invokeinterface java/util/List.isEmpty ()Z 1
      // 18: ifeq 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: return
      // 20: athrow
      // 21: aload 8
      // 23: invokeinterface java/util/List.size ()I 1
      // 28: i2d
      // 29: ldc2_w 12.0
      // 2c: dmul
      // 2d: aload 8
      // 2f: invokeinterface java/util/List.size ()I 1
      // 34: bipush 1
      // 35: isub
      // 36: i2d
      // 37: dconst_1
      // 38: dmul
      // 39: dadd
      // 3a: dstore 9
      // 3c: dload 9
      // 3e: dneg
      // 3f: ldc2_w 2.0
      // 42: ddiv
      // 43: dstore 11
      // 45: aload 8
      // 47: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4c: astore 13
      // 4e: aload 13
      // 50: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 55: ifeq 7f
      // 58: aload 13
      // 5a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5f: checkcast net/minecraft/class_1799
      // 62: astore 14
      // 64: iload 7
      // 66: aload 0
      // 67: aload 1
      // 68: aload 14
      // 6a: dload 11
      // 6c: dload 4
      // 6e: aload 3
      // 6f: iload 6
      // 71: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abba (Lnet/minecraft/class_332;Lnet/minecraft/class_1799;DDLnet/minecraft/class_327;I)V
      // 74: dload 11
      // 76: ldc2_w 13.0
      // 79: dadd
      // 7a: dstore 11
      // 7c: ifeq 4e
      // 7f: return
   }

   private double babb(class_1657 var1) {
      float var2 = var1.method_6063() + var1.method_6067();

      try {
         if (var2 <= 0.0F) {
            return 0.0;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return Math.max(0.0, Math.min(1.0, (double)((var1.method_6032() + var1.method_6067()) / var2)));
   }

   private void bbab(class_332 param1, class_310 param2, baabbb param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbb.ab ()Lnet/minecraft/class_1657;
      // 04: astore 5
      // 06: aload 2
      // 07: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 0a: astore 6
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0f: aload 0
      // 10: aload 5
      // 12: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.babb (Lnet/minecraft/class_1657;)D
      // 15: dstore 7
      // 17: aload 0
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 1e: checkcast java/lang/Double
      // 21: invokevirtual java/lang/Double.doubleValue ()D
      // 24: aload 0
      // 25: aload 3
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbb.ba ()D
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aaa (D)D
      // 2c: dmul
      // 2d: dstore 9
      // 2f: aload 0
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 36: checkcast java/lang/Double
      // 39: invokevirtual java/lang/Double.doubleValue ()D
      // 3c: invokestatic java/lang/Math.round (D)J
      // 3f: l2i
      // 40: istore 11
      // 42: aload 0
      // 43: aload 6
      // 45: aload 5
      // 47: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bbba (Lnet/minecraft/class_327;Lnet/minecraft/class_1657;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaababb;
      // 4a: astore 12
      // 4c: istore 4
      // 4e: aload 1
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.abbaab (Lnet/minecraft/class_332;)V
      // 52: iload 4
      // 54: aload 1
      // 55: aload 3
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbb.bb ()D
      // 59: aload 3
      // 5a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbb.a ()D
      // 5d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bb (Lnet/minecraft/class_332;DD)V
      // 60: aload 1
      // 61: dload 9
      // 63: dload 9
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.bbbbba (Lnet/minecraft/class_332;DD)V
      // 68: aload 0
      // 69: aload 1
      // 6a: aload 12
      // 6c: dload 7
      // 6e: iload 11
      // 70: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aaab (Lnet/minecraft/class_332;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaababb;DI)V
      // 73: ifne af
      // 76: aload 0
      // 77: aload 1
      // 78: aload 6
      // 7a: aload 12
      // 7c: iload 11
      // 7e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.ba (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaababb;I)V
      // 81: aload 0
      // 82: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bbbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 85: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 88: ifeq ab
      // 8b: goto 8f
      // 8e: athrow
      // 8f: aload 0
      // 90: aload 1
      // 91: aload 5
      // 93: aload 6
      // 95: aload 12
      // 97: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaababb.aaa ()D
      // 9a: ldc2_w 2.0
      // 9d: dsub
      // 9e: ldc2_w 12.0
      // a1: dsub
      // a2: iload 11
      // a4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.baba (Lnet/minecraft/class_332;Lnet/minecraft/class_1657;Lnet/minecraft/class_327;DI)V
      // a7: goto ab
      // aa: athrow
      // ab: aload 1
      // ac: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.ababbb (Lnet/minecraft/class_332;)V
      // af: return
   }

   private bbaababb bbba(class_327 param1, class_1657 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 89248940
      // 003: istore 18
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: ldc_w ""
      // 00b: astore 4
      // 00d: istore 3
      // 00e: ldc_w 804651957
      // 011: iload 18
      // 013: ldc_w 1827307817
      // 016: ixor
      // 017: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 01a: ldc2_w 9167102877955677117
      // 01d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aabb (IJ)I
      // 020: istore 5
      // 022: aload 0
      // 023: iload 3
      // 024: ifne 039
      // 027: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 02a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 02d: ifeq 0b5
      // 030: goto 034
      // 033: athrow
      // 034: aload 0
      // 035: goto 039
      // 038: athrow
      // 039: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03c: aload 2
      // 03d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bbb (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)I
      // 040: istore 6
      // 042: iload 3
      // 043: ifne 0ae
      // 046: iload 6
      // 048: iflt 0b5
      // 04b: goto 04f
      // 04e: athrow
      // 04f: ldc_w 804651956
      // 052: iload 18
      // 054: ldc_w 1539576434
      // 057: ixor
      // 058: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 05b: ldc_w 804651959
      // 05e: iload 18
      // 060: ldc_w -1779493914
      // 063: ixor
      // 064: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 067: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 06a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 06d: iload 6
      // 06f: ldc_w 804651958
      // 072: iload 18
      // 074: ldc_w -967000884
      // 077: ixor
      // 078: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 07b: ldc_w 804651953
      // 07e: iload 18
      // 080: ldc_w 58775403
      // 083: ixor
      // 084: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 087: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 08a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 08d: astore 16
      // 08f: istore 15
      // 091: astore 14
      // 093: new java/lang/StringBuilder
      // 096: dup
      // 097: invokespecial java/lang/StringBuilder.<init> ()V
      // 09a: aload 14
      // 09c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 09f: iload 15
      // 0a1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a4: aload 16
      // 0a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0a9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ac: astore 4
      // 0ae: iload 6
      // 0b0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aba (I)I
      // 0b3: istore 5
      // 0b5: ldc_w ""
      // 0b8: astore 6
      // 0ba: aload 0
      // 0bb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa;
      // 0be: iload 3
      // 0bf: ifne 0e1
      // 0c2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaa.b ()Z
      // 0c5: ifeq 14d
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.aa Ljava/util/Map;
      // 0d0: aload 2
      // 0d1: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 0d4: bipush 0
      // 0d5: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d8: invokeinterface java/util/Map.getOrDefault (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0dd: goto 0e1
      // 0e0: athrow
      // 0e1: checkcast java/lang/Integer
      // 0e4: invokevirtual java/lang/Integer.intValue ()I
      // 0e7: istore 7
      // 0e9: iload 7
      // 0eb: ifle 14d
      // 0ee: ldc_w 804651952
      // 0f1: iload 18
      // 0f3: ldc_w 696005303
      // 0f6: ixor
      // 0f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 0fa: ldc_w 804651955
      // 0fd: iload 18
      // 0ff: ldc_w 1057525446
      // 102: ixor
      // 103: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 106: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 109: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 10c: iload 7
      // 10e: ldc_w 804651954
      // 111: iload 18
      // 113: ldc_w -2102028077
      // 116: ixor
      // 117: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 11a: ldc_w 804651965
      // 11d: iload 18
      // 11f: ldc_w -677089914
      // 122: ixor
      // 123: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.a (II)I
      // 126: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.bba (II)Ljava/lang/String;
      // 129: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 12c: astore 17
      // 12e: istore 16
      // 130: astore 15
      // 132: new java/lang/StringBuilder
      // 135: dup
      // 136: invokespecial java/lang/StringBuilder.<init> ()V
      // 139: aload 15
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13e: iload 16
      // 140: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 143: aload 17
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 148: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 14b: astore 6
      // 14d: aload 2
      // 14e: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
      // 151: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
      // 156: astore 7
      // 158: aload 0
      // 159: aload 1
      // 15a: aload 7
      // 15c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abab (Lnet/minecraft/class_327;Ljava/lang/String;)I
      // 15f: i2d
      // 160: dstore 8
      // 162: aload 6
      // 164: iload 3
      // 165: ifne 185
      // 168: invokevirtual java/lang/String.isEmpty ()Z
      // 16b: ifne 183
      // 16e: goto 172
      // 171: athrow
      // 172: dload 8
      // 174: ldc2_w 3.0
      // 177: aload 0
      // 178: aload 1
      // 179: aload 6
      // 17b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abab (Lnet/minecraft/class_327;Ljava/lang/String;)I
      // 17e: i2d
      // 17f: dadd
      // 180: dadd
      // 181: dstore 8
      // 183: aload 4
      // 185: invokevirtual java/lang/String.isEmpty ()Z
      // 188: ifne 19c
      // 18b: dload 8
      // 18d: ldc2_w 3.0
      // 190: aload 0
      // 191: aload 1
      // 192: aload 4
      // 194: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.abab (Lnet/minecraft/class_327;Ljava/lang/String;)I
      // 197: i2d
      // 198: dadd
      // 199: dadd
      // 19a: dstore 8
      // 19c: dload 8
      // 19e: ldc2_w 6.0
      // 1a1: dadd
      // 1a2: invokestatic java/lang/Math.ceil (D)D
      // 1a5: dstore 10
      // 1a7: dload 10
      // 1a9: dneg
      // 1aa: ldc2_w 2.0
      // 1ad: ddiv
      // 1ae: dstore 12
      // 1b0: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaababb
      // 1b3: dup
      // 1b4: aload 7
      // 1b6: aload 6
      // 1b8: aload 4
      // 1ba: iload 5
      // 1bc: dload 12
      // 1be: ldc2_w -15.0
      // 1c1: dload 10
      // 1c3: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaababb.<init> (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDDD)V
      // 1c6: areturn
   }

   private static String b(char var0, short var1, int var2) {
      int var3 = var0 ^ 3772;
      char[] var4 = abaab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])ababa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         ababa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 16225;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\udb11';
         var10 += 37947;
         var10 += 46370;
         var10 ^= 39029;
         var10 ^= 8858;
         var10 += 15870;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var32 = -366008377;
      short var21 = 14302;
      byte var28 = -1;
      char[] var23 = "Ǒ\u0015\u0098\n\u0010\n".toCharArray();
      String var22 = "Ⳑⱥⴎⴼⷽⵦ⸙\u2d69ⵊⴱⳏⶤⵒ\u2d29ⷉⴉⴒ\u2d75ⴎⶎⷣⷛⳑⳈⴵⲃⰷⷧⵁⷭⴻⶎ\u2d78ⵊⶩⷠⱖⲤⵞⷩ\u2d26ⶨⷧⴿⷥⵤⴇⲴⴸⷞⷨⱉⷱⵙⷂⷽⱬⲴⶄⶖⲲⰠⴾⲳⴺⲼⶣⴲⵈⷎ\u2d2fⴇⴊ\u2d28ⱳⲱ\u2dd7\u2d28ⳁⰉⷡ\u2dd7⻳\u2d69ⰀⲎⷛⲜⳗⷽⵎⱚ\u2d78ⳇⰊⴻⷬⲗⲮⴡⵄⷘ\u2d2b\u2d9eⷥⲛⱫⷺⳐⶑⲴ\u2dafⵅⵙⷶⴆⱃⵌⴁⰜⲎⴜⴾⵁⶡⳍ\u2d9bⴲ\u2d26ⴿⲴ\u2dbfⴂⳕⴥⴜⷛⴙⴘ\u2dd7ⵙⶫⵊⲵⶬⴷⷈ⻰Ⲻⱙⴻⰽ\u2d7b\u2d7eⶕⳞⷼⲀⴵⷩⲑⱰ\u2d2fⴴⷡⳅⶨⲸⳤ\u2dd7ⴸⱂⴑⲾⱷⵎⷐ\u2d2aⳁⱝⴲⶇⷃⵊⰞⲺⱣⳓⲷⶂⴖⶄⷁⳮⷥⳞⱬⵉⶖ\u2d26ⵁⱌⳇⶕⶬⵎ\u2dafⳑ\u2cf6ⷆ\u2d6bⶁⷬⵛⱗⵈⶄⲪ\u2d6eⰂⲎ\u2dd7ⵤⲮⶖⲆⷦⷾⵤⴺⷷⴝⲓⴙⴼⲻⰸ\u2d6e⳦ⴳⴝⱳ\u2d76\u2d99ⴗⴎⰠⲵⲠⷾⲕⴑⲪⶖⱪⴶⰭⵏⳐⴲⷳⴂⴉⴗⱸⲓⴏⲅⳓⱾⴊⶺⴾⴱⱕⴸ\u2d9fⴲ\u2d74ⶈⷷⱦⲌⳣⷺⷈⷛⷡ\u2d7cⴔⵌⱓⳈⴡⱠⴻⶖⷸⲹⱈⷳⰻⲒ\u2d9eⷥⴱⱐⵛⴥⱍⷵⶊⵛⵙ\u2d29Ⳍⶡⲓ\u2d2fⷔ\u2d7dⷙⴶⳗⰂⷨⷛⲔⳠⶇⲡⴝⲥⴳⴴⴻⱬⴗ⳿\u2d99Ⳕⴆⴥ⳦ⷥⵕⴔⲒ⳽ⷨⴓⴓⴁⵙⰐⲚⱠⴇⳢ\u2d9eⵃⷴⴲⲭⷖⴭⰡⷤⳤⷼⴶⷃⴠ\u2cf5ⶄⷤ\u2db7ⳄⶇⱫⳟⴄⴒⳛⷨⲻⶠ\u2d68ⵙⱤⵍⶁⳑⵇⶈⷻⰵⴾ⳦Ɱⷣⷾⴲⵟ\u2d2eⴘⶓⳓ\u2d7cⶊⴵⷛ\u2d2aⶓⶏⵍⶢⲽⴵⶢⴻⷨⵉⳉⱶⲻⷾⴜⵗⷥⲟⶃⵢⲭⷹⵚⰫⷠⵙⶄⲭⰽⲣⴽⱔⲿⰹⴲⴗⱂⴥⱼ\u2d79\u2d74ⶂⲆⷛⴾⴏⱳⳞⴅⲍⵝⶨ놃눜뉟뇳닦눷넡놽눹눯놁눕닢눏눬뇕늰뉼눤녷뇝硫虜龍獵揄𤋮陋全摒漢烈者濾笠遲\ufaeb陋暈靖飼硫\ufae0溜里酪兀陋郞啕𥳐視謁切舘豈勤樂濾﨟弄韛菉殮行異吏㮝行靈瘝墨\ufae4﨓兀\ufafc突睊\ufaf9侮卵簾戴利着爵見嬨漣獵慎廬𧻓著流流念絛塚煮﨣龍襁降輪晴鶴兩撚懲\ufae1祖𧻓簾褐韛\ufae3歹𤋮艹\ufae2神龜逸謁諸\ufaef盛\ufaf8難糧廬者社\ufa6e𧻓礪遲墨率謹\ufaea愈\ufaf8婢\ufaf7\ufaee﨏零暴若念瘝例喙磊了靖列婢沈祥惘奄裡癩見猪奔利兩\ufaf5略ĜǢėŒǵīǘĥŒǺ⒙⑻Ⓖ┕☧╢◠◤▃◿ⓓ◇⒴┶◡┗暭晗暢朋晀暞晱暔朋晋";
      String[] var24 = new String[var23.length];

      while (true) {
         int var25 = 0;
         char var26 = 0;
         char var27 = '\u0000';
         if (var28 == 0) {
            abaab = var24;
            ababa = new Object[var24.length];
            int var17 = 808478128;
            byte[] var15 = "\u0005Þ5\u0007\u000e95lùÿL®n@x\u0015\u0016èEÁ*\u000bM\r\u0004C\u008b\u0095«Ré\u008c\u0002Aû{¦\u0096#µ\u0099\u0007ÏO\u0088\f±_,\u000bPÄÑ\u007fX:¡K\u007fR\u008båo\u00052\u008ep{Ðb\u001a\u008c\u0005\u0004¡\u009f\u0098°·}\u0011¦\u009eçåp\u0000\u0007Ì\\\u008fRsh\u0087¸\u0099\u009e\u009f³2\u0098\u0086Ô¶@F\u009d+~\u0016rò\u00004Ó-|\u0010\u0015)¦\u001bñÕ¶Q\u0086¸{xRägÙ¥³Y\by×\u008c\b\u0012\u0082«oÙ´È=å\u0013\u0096¬Û\u0085§÷ªo\u008c\u009c&þ¯\u008c2KÈ¿¡·\t\u0012 â£¢\u0016êâ\u001d\u008c\u0017e\u0081â5<$H×\u0088üÝ\u0006eóK1\u0093\u007f\u0092*aN)!úù\u0001»\u0003\u000eö°^\\ÅÄ\u0005l(¾V!\u0092\u009d£òY\u0092\u009aÔ·Ì°3ÊYMEj\u0018pã\u0000¼\u0094&(+x\u0006&\u0091KB³9^û~È÷{\u0007\u001fù3¼\u008aN×ÚLË\u0082\u001eÔÐ5Â\u009e`\u008fX6½¡#Á\u008dÚieqÛ\u001eàTXlÈµ>\u001bhäDaï\u000b\u0015¥\u0017¬\u0017¬Qrã·Ô7¬a\u008b_n\u008aèV5#\u0084sâ\u009c\nCWãÁVÇH?lëåÔ\u0000\u0018`3éN*{éBå\u0097o\\,\n¸ðàX¢¾ ðÀ\u007fÆõ\u0082mÍfÈÏ\u0084]Ï¦Ïêø¤Tí\u008dÉá³SÞÚ<]:\u0000ü©«!U>¿A¦þðøJó\tÓwQ\u0089Æ\u008eCÂæ\u0001[&g÷\u0094ô»P\t \u0001ÐÛ\u009a;¨r\u001aJ#Ä*\u0005ÙE\u0090.ÃÐ#¹/£²l\u009673vùéÇ<>\u0010\u0097^è\u0010{\u0016ÃáÌ\u001d¸\u001aµ¬\u009f¥\u008bÇ\u009fËê£MÁ&\u0000fp!øDZ\u0098\u0002à\u0082×þðÛ»\u0013\u0082<\u001bÚ\u0016\u0086\u001a³¢9,;y\u0015%\bá\u0086\u00861 =¯^+*i\u008bT×Q\u0006\u0013e':Í1\u007f\f¾*\"®Èú\u0082µ\u0086«_\u0012;\\'n¦\u008e)u\u000e\u0010<âW´\u0082\u001d»Ý?5È\u008e\u000fÌâ\u007fEÒÅ¨ËÇ\u0086î+\u0005\u001e\u0099ñÖÖî\u0080¬\u008c}~EG9î9Ö\u0014ÁJ\u0095\u0006ÆÜUø?\u0092\u0005^ñû\u0084Ñ/KõsÈ\u008dã\u0007Ü½°GM5%\u0005:Ýùõ¾Êÿ\\Ax7\u0006XÆÀvò¤Â\u0082\u0097Dÿè&¤.\u008a(\u0002\tf»K\u0001\u009d\u0001ÊË\u000eÎ5c\rÆ\u0010\u001a-F\u0011¹tçä\u0094\u0003õ\u0084e\u0019þVq¦_qht4@ö k>ÛqÁq\u0018·N\u001b¬W\u001eÈ\u0003Ï\u0011K#@\u0088¶\t)\\ýYTÇ.bög\rã\u0086\u008ah>¾°°fl\u0002\u0099\u009cÞAð\u001c6²@\u008c~ØjQMn´yÑcj\u008a\u001e\u000e¢Âul\u0094\u0096¼êÿ¥ûl¡\u000bä-'C$Ô°\u0010-Ò]ëW´\u008fo^«nP_m¿æS\u000e?\u0017\u0013\u0006Å-Ø\u008adÂ2Ër\u008c\u0019aãóq[J\u000f4§\u0095¾xWÜÔÎ\u0091Á=F*Ïx&\u00ad¢\u0094\u0005Ä\u0017P´¨jì\u00adhP4\u0097ë2×å\t5b²[\r+¼¨\u0004ÆXÈ\u0095r®'0\u0006RÉ¨rn[YÆü\u008eÊn\u0016\u001bû9ù(·\u0015\fHÔ\u009bq\u0015\u0082MQ\u001aZ9%¾,v´\u0012,ÍòÁ\u008d´Â\u0087W\u0090L\u0081eWí\u0086y·ßÊ\u0080^Êà\u000bÂïÚ*H\u001a8\u009c\n|rÃ\u0016©\u0085ôZE\u000b¿ißÔb\u0086üC¡+àûÙH«««ÇyÂ\u0001\u0012\u0011\u000bo\u009dù¾Ô_¹õJñ\u009fÑ\u0082+m\u009dw(ÄjôO°\u0013\u009akýn/\u0089ÝdJ\u009bg\u001c\u0000Äh O\u0093´Rú\u009d*ÐòÞwÙ\u0091!$\u001dñ«ìúù,m\u000f(\u0089\u001e\u009c\u001dÃ\u001f\n\u0082Ï¿¹\u0001lFø\u0011.·\u008c\u009f\u007f©`KK\u0087ê\u008baàÂ\u0003\u008b\u000f\u0017R½O\u0007_-o\u0018 fRÐ\u000fÛ\u000e\u001eZ[=Ä\"'á\u0006¿9ÌùB3qY\u0004\u001d5¨¬G)'\u0098}*\u009c\u0098Ã¶E\u0013B\u0012ðÄ0\u008cõ\u0083\u0015±\u0097\u008c+ûÉ\u0004/U\u0094ÿ\b*\"E}wÎç]%\u009c\r.®üÎc>\u007f\u008a¼\u0086\u008a|3\u0087¹FxõÇq\\®\u001eÀ\u0083bÓß\u001bã§|c··é$.y\u001e9c\u0086\u0088l\rþ{T\u0018\u0005¡\u001eèAÈ¢Ïì\u0088ýIÒD´fGÊ\\JËÄl?T÷¢Q\u009a\u0018\u0083YD2ðé+¯Üµ?PÌß?\u0003\u0017ô¬*j\u0087íÓ\u009b\u0096iw\u00003\u0084\u0089\u0010\u009aBNús\u0095ó\u009eÓ÷ªP\u0081ÁYY·&ÚÊx\u009b`\u0016k«¤¾â\u009a©C+J\u009eï?\u0080¡ÃæÚ\\-~\u009e\u0081.Wr7\u0006T\u009f}¶\u001cíûâ\u0003\u0006(`n!\u0096p¸\u001fÃj{»IÛË$\u0081¦\u008e|<ø\u008b\u0093\u0007`â \u001f\u0081«E\u0010£yÚ\u001f a¶AWéz\u008czAu\u0091mxÖ4\u001b®]b\nÛR(ß\u0094\u000eõÅ!qqF·°|vnc«ö²U½\b4Z\u008bSÕÎµgÍ*^ïÔ¸©\u0019Ñ¼u\u0089Ó\\\u008e»»\"<«ïÃ\u0003c¦\u0019\u0015¤Ü=\u009cFsÐ8Ð>\u0017Y°ù\u0016½ )'õWZ÷v6Û\u000f\u008aDüû\u00861ù2cr\u0080À`ßeáò)È\\\u0017)TRù\u008aÝRë\u008b0ÕzÀCé\u0002ÑÆ8eÉþã/\u001bN\u0080å\u008e\u001c\u00adHoVz;ô@Ê\u0017\u008agàÞG\ræ§áÔ\u000b\u0097QðF(v}ô\u0099AR@0\u008fx\u0016\u0090ÜÊî\u0089\u0019\u0017Ú'3ê`G%\u009fn,\u0098#Ê5Í3ê³"
               .getBytes("ISO-8859-1");
            int var16 = var15.length / 4;
            abaaa = new int[var16];
            byte var18 = 0;
            int var19 = 0;

            do {
               int var20 = (var15[var18] & 255) << 24 | (var15[var18 + 1] & 255) << 16 | (var15[var18 + 2] & 255) << 8 | var15[var18 + 3] & 255;
               var20 ^= var17;
               abaaa[var19] = var20;
               var18 += 4;
            } while (++var19 < var16);

            String[] var13 = new String[a(804651827, var32 ^ -1100026770)];
            int var11 = 0;
            String var10;
            int var12 = (var10 = b('ຼ', (short)31360, var32 ^ -276291849)).length();
            int var9 = 4;
            int var35 = -1;

            label120:
            while (true) {
               String var38 = var10.substring(++var35, var35 + var9);
               int var10001 = -1;

               while (true) {
                  char[] var58;
                  label115: {
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
                           break label115;
                        }

                        var70 = var44;
                        var10004 = var14;
                     }

                     while (true) {
                        var70[var10004] = (char)(var70[var10004] ^ switch (var14 % a(804651836, var32 ^ 1218839186)) {
                           case 0 -> a(804651839, var32 ^ -662298932);
                           case 1 -> a(804651838, var32 ^ -1816406773);
                           case 2 -> a(804651833, var32 ^ 786897783);
                           case 3 -> a(804651832, var32 ^ -1361788659);
                           case 4 -> a(804651835, var32 ^ -771227566);
                           case 5 -> a(804651834, var32 ^ -869924930);
                           default -> a(804651781, var32 ^ -963093366);
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
                           aaaa = var13;
                           abbb = new String[a(804651837, var32 ^ 2129007033)];
                           long var0 = 5360242120067063291L;
                           long[] var6 = new long[a(804651780, var32 ^ -388190945)];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = b('\u0ebe', (short)'룇', var32 ^ -528271602)).length();
                           byte var2 = 0;

                           label94:
                           while (true) {
                              int var51 = var2;
                              var2 += 8;
                              var38 = var4.substring(var51, var2);
                              var51 = (short)3775;
                              char var64 = '襹';
                              int var78 = var32 ^ 944855514;
                              byte[] var7 = var38.getBytes("ISO-8859-1");
                              long[] var41 = var6;
                              var51 = var3++;
                              long var65 = (var7[0] & 255L) << a(804651783, var32 ^ -1296031055)
                                 | (var7[1] & 255L) << a(804651782, var32 ^ -2000446904)
                                 | (var7[2] & 255L) << a(804651777, var32 ^ 912212108)
                                 | (var7[3] & 255L) << a(804651776, var32 ^ -1208224446)
                                 | (var7[4] & 255L) << a(804651779, var32 ^ -983175154)
                                 | (var7[5] & 255L) << a(804651778, var32 ^ -531066312)
                                 | (var7[a(804651789, var32 ^ -569193235)] & 255L) << a(804651788, var32 ^ -625176307)
                                 | var7[a(804651791, var32 ^ -37541957)] & 255L;
                              byte var79 = -1;

                              while (true) {
                                 long var83 = var65 ^ var0;
                                 switch (var79) {
                                    case 0:
                                       var41[var51] = var83;
                                       if (var2 >= var5) {
                                          aaa = var6;
                                          aabba = new Integer[a(804651793, var32 ^ -301292838)];
                                          baab = aabb(a(804651792, var32 ^ -1772204042), 5523105811802430896L);
                                          ba = aabb(a(804651795, var32 ^ -775446582), 216361376869483687L);
                                          aabbb = aabb(a(804651794, var32 ^ -863349787), 213552075495011505L);
                                          aabab = new ababbbbaa[]{
                                             aabbaaaba.aaab(
                                                bba(a(804651805, var32 ^ -1713021789), a(804651804, var32 ^ -1578039729))
                                             ),
                                             aabbaaaba.aaab(
                                                bba(a(804651807, var32 ^ -352264143), a(804651806, var32 ^ 1462117929))
                                             ),
                                             aabbaaaba.aaab(
                                                bba(a(804651801, var32 ^ 144798682), a(804651800, var32 ^ 1099901216))
                                             ),
                                             aabbaaaba.aaab(
                                                bba(a(804651803, var32 ^ -1448973732), a(804651802, var32 ^ -1713985260))
                                             ),
                                             aabbaaaba.aaab(
                                                bba(a(804651877, var32 ^ 1471756458), a(804651876, var32 ^ 1991316547))
                                             )
                                          };
                                          return;
                                       }
                                       break;
                                    default:
                                       var41[var51] = var83;
                                       if (var2 < var5) {
                                          continue label94;
                                       }

                                       var5 = (var4 = b('ຸ', (short)13751, var32 ^ -1462683798)).length();
                                       var2 = 0;
                                 }

                                 short var54 = var2;
                                 var2 += 8;
                                 var38 = var4.substring(var54, var2);
                                 var54 = 3769;
                                 short var67 = 29459;
                                 int var81 = var32 ^ -1530129628;
                                 var7 = var38.getBytes("ISO-8859-1");
                                 var41 = var6;
                                 var51 = var3++;
                                 var65 = (var7[0] & 255L) << a(804651790, var32 ^ -2002859065)
                                    | (var7[1] & 255L) << a(804651785, var32 ^ -1462986030)
                                    | (var7[2] & 255L) << a(804651784, var32 ^ -616040104)
                                    | (var7[3] & 255L) << a(804651787, var32 ^ -1764263417)
                                    | (var7[4] & 255L) << a(804651786, var32 ^ 1232048120)
                                    | (var7[5] & 255L) << a(804651797, var32 ^ -965821211)
                                    | (var7[a(804651796, var32 ^ -1927495039)] & 255L) << a(804651799, var32 ^ -1454957783)
                                    | var7[a(804651798, var32 ^ 1988875832)] & 255L;
                                 var79 = 0;
                              }
                           }
                        }

                        var9 = var10.charAt(var35);
                        break;
                     default:
                        var13[var11++] = var77;
                        if ((var35 += var9) < var12) {
                           var9 = var10.charAt(var35);
                           continue label120;
                        }

                        var12 = (var10 = b('ຽ', (short)'逼', var32 ^ -1335621448)).length();
                        var9 = a(804651826, var32 ^ -1811298397);
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
                  default -> 167;
                  case 1 -> 71;
                  case 2 -> 174;
                  case 3 -> 197;
                  case 4 -> 121;
               };
               var29[var30] = (char)(var29[var30] ^ var31 ^ var21);
            } while (++var30 < var29.length);

            var24[var25] = new String(var29).intern();
            var26 += var27;
         } while (++var25 < var23.length);

         var28 = 0;
      }
   }

   private static void bbbb(class_332 var0, class_327 var1, String var2, double var3, double var5, int var7) {
      abbaa.abbaab(var0);
      abbaa.bb(var0, var3, var5);
      var0.method_51433(var1, var2, 0, 0, var7, false);
      abbaa.ababbb(var0);
   }

   public static boolean aaaaa() {
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
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 0
      // 16: ifne 27
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 26
      // 1f: goto 23
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: athrow
      // 26: aload 1
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.aaabb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba;
      // 2d: astore 2
      // 2e: aload 2
      // 2f: iload 0
      // 30: ifne 3b
      // 33: ifnull 4d
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 2
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.babbaab ()Z
      // 3e: iload 0
      // 3f: ifne 4a
      // 42: ifeq 4d
      // 45: goto 49
      // 48: athrow
      // 49: bipush 1
      // 4a: goto 4e
      // 4d: bipush 0
      // 4e: ireturn
   }

   private baabbb aaaab(aabbbbaaa param1, class_310 param2, class_1657 param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 3
      // 04: fload 4
      // 06: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aa (Lnet/minecraft/class_1297;F)Lnet/minecraft/class_243;
      // 09: astore 6
      // 0b: aload 3
      // 0c: aload 3
      // 0d: invokevirtual net/minecraft/class_1657.method_18376 ()Lnet/minecraft/class_4050;
      // 10: invokevirtual net/minecraft/class_1657.method_18377 (Lnet/minecraft/class_4050;)Lnet/minecraft/class_4048;
      // 13: aload 6
      // 15: invokevirtual net/minecraft/class_4048.method_30757 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
      // 18: astore 7
      // 1a: istore 5
      // 1c: aload 0
      // 1d: aload 1
      // 1e: aload 7
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabba.baaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_238;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaabb;
      // 23: astore 8
      // 25: aload 8
      // 27: iload 5
      // 29: ifne 47
      // 2c: ifnonnull 45
      // 2f: goto 33
      // 32: athrow
      // 33: aload 2
      // 34: aload 1
      // 35: aload 3
      // 36: aload 6
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabb (Lnet/minecraft/class_310;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_1297;Lnet/minecraft/class_243;)Z
      // 3b: ifne 45
      // 3e: goto 42
      // 41: athrow
      // 42: aconst_null
      // 43: areturn
      // 44: athrow
      // 45: aload 8
      // 47: ifnonnull 4d
      // 4a: aconst_null
      // 4b: areturn
      // 4c: athrow
      // 4d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbb
      // 50: dup
      // 51: aload 3
      // 52: aload 8
      // 54: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaabb.aa ()D
      // 57: aload 8
      // 59: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaabb.a ()D
      // 5c: aload 2
      // 5d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 60: aload 6
      // 62: invokevirtual net/minecraft/class_746.method_5707 (Lnet/minecraft/class_243;)D
      // 65: aload 8
      // 67: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaabb.a ()D
      // 6a: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbb.<init> (Lnet/minecraft/class_1657;DDDD)V
      // 6d: areturn
   }
}
