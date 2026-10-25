package nsc;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_10799;
import net.minecraft.class_12245;
import net.minecraft.class_12246;
import net.minecraft.class_12247;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import org.joml.Matrix4f;
import org.joml.Vector4f;

@Environment(EnvType.CLIENT)
public final class bbaabbaa {
   private static final Object aa;
   private static final long[] ab;
   private static final Method ba;
   private static final Method bb;
   private static final Method aaa;
   private static String[] aab;
   private static final class_1921 aba;
   private static final Method abb;
   private static final Method baa;
   private static final Matrix4f bab;
   private static final String[] b;
   private static final Method bba;
   private static final Object bbb;
   private static float aaaa;
   private static final Method aaab;
   private static final int aaba;
   private static final class_1921 a;
   private static final long[] aabb;
   private static final Method abaa;
   private static final Integer[] abab;
   private static final Method abba;
   private static final int[] aaabb;
   private static final Method abbb;
   private static final String[] aabaa;
   private static final class_1921 baaa;
   private static final Method baab;
   private static final Object baba;
   private static final String[] babb;
   private static final Long[] bbaa;
   private static final Object bbab;
   private static final Method bbba;
   private static final class_1921 bbbb;
   private static final Method aaaaa;
   private static final Vector4f aaaab;
   private static final Object[] aabab;
   private static final Method aaaba;

   private static int a(int var0, int var1) {
      int var2 = aaabb[var0 ^ 1176327980] ^ var1 ^ var0;
      var2 -= 30024;
      var2 += 1854;
      var2 -= 17151;
      var2 += 65010;
      var2 -= 55054;
      var2 -= 41444;
      var2 += 49897;
      var2 -= 49191;
      var2 += 54760;
      return var2 - 10283;
   }

   public static class_243 aa(class_1297 var0, float var1) {
      return var0.method_30950(var1);
   }

   public static void ab(aabbbbaaa var0, class_243 var1, double var2, int var4, Color var5, double var6, float var8) {
      bbbbb(var0, var1, var2, var4, var5, var6, var8, true, bbaabbaa::aaaab);
   }

   public static boolean ba(class_310 param0, class_1657 param1) {
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
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 4a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 27: ifnull 4a
      // 2a: aload 1
      // 2b: iload 2
      // 2c: ifne 3b
      // 2f: goto 33
      // 32: athrow
      // 33: ifnull 4a
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 1
      // 3b: iload 2
      // 3c: ifne 4e
      // 3f: aload 0
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: if_acmpne 4d
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 0
      // 4b: ireturn
      // 4c: athrow
      // 4d: aload 1
      // 4e: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 51: iload 2
      // 52: ifne 74
      // 55: ifeq 6f
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 1
      // 5d: iload 2
      // 5e: ifne 76
      // 61: goto 65
      // 64: athrow
      // 65: invokevirtual net/minecraft/class_1657.method_7325 ()Z
      // 68: ifeq 75
      // 6b: goto 6f
      // 6e: athrow
      // 6f: bipush 0
      // 70: goto 74
      // 73: athrow
      // 74: ireturn
      // 75: aload 1
      // 76: iload 2
      // 77: ifne 88
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbba.ab (Lnet/minecraft/class_1657;)Z
      // 7d: ifeq 87
      // 80: goto 84
      // 83: athrow
      // 84: bipush 0
      // 85: ireturn
      // 86: athrow
      // 87: aload 1
      // 88: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabaab.aa (Lnet/minecraft/class_1297;)Z
      // 8b: iload 2
      // 8c: ifne 97
      // 8f: ifne 9a
      // 92: goto 96
      // 95: athrow
      // 96: bipush 1
      // 97: goto 9b
      // 9a: bipush 0
      // 9b: ireturn
   }

   private static void bb(aabbbbaaa var0, class_238 var1, Color var2, double var3, float var5) {
      bab(var5, bbaabbaa::aba);
      aabab(var0);
   }

   private static void aaa(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: fload 0
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 08: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaa F
      // 0b: iload 1
      // 0c: ifne 30
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 12: ifnonnull 1b
      // 15: goto 19
      // 18: athrow
      // 19: return
      // 1a: athrow
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 1e: aconst_null
      // 1f: bipush 1
      // 20: anewarray 4
      // 23: dup
      // 24: bipush 0
      // 25: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaa F
      // 28: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 2b: aastore
      // 2c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2f: pop
      // 30: goto 36
      // 33: astore 2
      // 34: aload 2
      // 35: pop
      // 36: return
   }

   private static class_243[] aab(class_243 var0, float var1, float var2, float var3) {
      double var5 = Math.toRadians(var3);
      double var7 = Math.cos(var5);
      double var9 = Math.sin(var5);
      double var11 = var0.field_1351 - var2 / 2.0;
      double var13 = var0.field_1351 + var2 / 2.0;
      double[][] var15 = new double[][]{{-var1, -var1}, {var1, -var1}, {var1, var1}, {-var1, var1}};
      int var10000 = baaabbaa.bba;
      class_243[] var16 = new class_243[aaabba(a(1176327980, 1190605131 ^ 762745873), 6259397949108581650L)];
      int var4 = var10000;
      int var17 = 0;

      while (true) {
         if (var17 < var15.length) {
            double var18 = var15[var17][0];
            double var20 = var15[var17][1];
            double var22 = var18 * var7 - var20 * var9;
            double var24 = var18 * var9 + var20 * var7;

            try {
               var27 = var16;
               if (var4 != 0) {
                  break;
               }

               var16[var17] = new class_243(var0.field_1352 + var22, var11, var0.field_1350 + var24);
               var16[var17 + 4] = new class_243(var0.field_1352 + var22, var13, var0.field_1350 + var24);
               var17++;
               if (var4 == 0) {
                  continue;
               }
            } catch (MatchException var26) {
               throw var26;
            }
         }

         var27 = var16;
         break;
      }

      return var27;
   }

   private static void aba(class_238 var0, aabbbbaaa var1, Color var2, double var3) {
      class_243 var5 = new class_243(var0.field_1323, var0.field_1322, var0.field_1321);
      class_243 var6 = new class_243(var0.field_1320, var0.field_1322, var0.field_1321);
      class_243 var7 = new class_243(var0.field_1320, var0.field_1325, var0.field_1321);
      class_243 var8 = new class_243(var0.field_1323, var0.field_1325, var0.field_1321);
      class_243 var9 = new class_243(var0.field_1323, var0.field_1322, var0.field_1324);
      class_243 var10 = new class_243(var0.field_1320, var0.field_1322, var0.field_1324);
      class_243 var11 = new class_243(var0.field_1320, var0.field_1325, var0.field_1324);
      class_243 var12 = new class_243(var0.field_1323, var0.field_1325, var0.field_1324);
      aabbab(var1, var5, var6, var2, var3);
      aabbab(var1, var6, var7, var2, var3);
      aabbab(var1, var7, var8, var2, var3);
      aabbab(var1, var8, var5, var2, var3);
      aabbab(var1, var9, var10, var2, var3);
      aabbab(var1, var10, var11, var2, var3);
      aabbab(var1, var11, var12, var2, var3);
      aabbab(var1, var12, var9, var2, var3);
      aabbab(var1, var5, var9, var2, var3);
      aabbab(var1, var6, var10, var2, var3);
      aabbab(var1, var7, var11, var2, var3);
      aabbab(var1, var8, var12, var2, var3);
   }

   private static void abb(class_4588 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, Color var8, double var9) {
      float var11 = var8.getRed() / 255.0F;
      float var12 = var8.getGreen() / 255.0F;
      float var13 = var8.getBlue() / 255.0F;
      float var14 = baab(var9) / 255.0F;
      var0.method_22918(var1, var2, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var3, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var3, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var3, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var7).method_22915(var11, var12, var13, var14);
   }

   private static float baa(float param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: fload 2
      // 05: iload 3
      // 06: ifne 16
      // 09: fconst_0
      // 0a: fcmpg
      // 0b: ifgt 15
      // 0e: goto 12
      // 11: athrow
      // 12: fconst_0
      // 13: freturn
      // 14: athrow
      // 15: fload 0
      // 16: iload 3
      // 17: ifne 69
      // 1a: fload 2
      // 1b: fcmpg
      // 1c: ifge 64
      // 1f: goto 23
      // 22: athrow
      // 23: fload 2
      // 24: fload 0
      // 25: fsub
      // 26: fstore 4
      // 28: fload 4
      // 2a: iload 3
      // 2b: ifne 3d
      // 2e: fconst_0
      // 2f: fcmpl
      // 30: ifle 60
      // 33: goto 37
      // 36: athrow
      // 37: fload 4
      // 39: goto 3d
      // 3c: athrow
      // 3d: iload 3
      // 3e: ifne 5f
      // 41: fload 2
      // 42: fcmpg
      // 43: ifge 60
      // 46: goto 4a
      // 49: athrow
      // 4a: fload 2
      // 4b: f2d
      // 4c: fload 2
      // 4d: fload 2
      // 4e: fmul
      // 4f: fload 4
      // 51: fload 4
      // 53: fmul
      // 54: fsub
      // 55: f2d
      // 56: invokestatic java/lang/Math.sqrt (D)D
      // 59: dsub
      // 5a: d2f
      // 5b: goto 5f
      // 5e: athrow
      // 5f: freturn
      // 60: iload 3
      // 61: ifeq b4
      // 64: fload 0
      // 65: goto 69
      // 68: athrow
      // 69: iload 3
      // 6a: ifne b5
      // 6d: fload 1
      // 6e: fload 2
      // 6f: fsub
      // 70: fcmpl
      // 71: ifle b4
      // 74: goto 78
      // 77: athrow
      // 78: fload 0
      // 79: iload 3
      // 7a: ifne b5
      // 7d: goto 81
      // 80: athrow
      // 81: fload 1
      // 82: fload 2
      // 83: fsub
      // 84: fsub
      // 85: fstore 4
      // 87: fload 4
      // 89: fconst_0
      // 8a: fcmpl
      // 8b: ifle b4
      // 8e: fload 4
      // 90: iload 3
      // 91: ifne b5
      // 94: goto 98
      // 97: athrow
      // 98: fload 2
      // 99: fcmpg
      // 9a: ifge b4
      // 9d: goto a1
      // a0: athrow
      // a1: fload 2
      // a2: f2d
      // a3: fload 2
      // a4: fload 2
      // a5: fmul
      // a6: fload 4
      // a8: fload 4
      // aa: fmul
      // ab: fsub
      // ac: f2d
      // ad: invokestatic java/lang/Math.sqrt (D)D
      // b0: dsub
      // b1: d2f
      // b2: freturn
      // b3: athrow
      // b4: fconst_0
      // b5: freturn
   }

   private static void bab(float var0, Runnable var1) {
      float var2 = aaaa;
      aaa(var0);

      try {
         var1.run();
      } finally {
         aaaa = var2;
      }
   }

   public static boolean bba(Object var0) {
      int var1 = baaabbaa.bba;

      label110: {
         Object var10000;
         label90: {
            try {
               var10000 = var0;
               if (var1 != 0) {
                  break label90;
               }

               if (var0 instanceof aabbbbaaa) {
                  break label110;
               }
            } catch (MatchException var8) {
               throw var8;
            }

            var10000 = var0;
         }

         label106: {
            try {
               boolean var12 = var10000 instanceof WorldRenderContext;
               if (var1 != 0) {
                  return var12;
               }

               if (var12) {
                  break label106;
               }
            } catch (MatchException var7) {
               throw var7;
            }

            return false;
         }

         WorldRenderContext var9 = (WorldRenderContext)var0;

         label68: {
            try {
               var10000 = var9;
               if (var1 != 0) {
                  break label68;
               }

               if (var9 == null) {
                  return false;
               }
            } catch (MatchException var6) {
               throw var6;
            }

            var10000 = var9;
         }

         try {
            if (var10000.matrices() != null) {
               return true;
            }
         } catch (MatchException var5) {
            throw var5;
         }

         return false;
      }

      aabbbbaaa var2 = (aabbbbaaa)var0;

      aabbbbaaa var10;
      label54: {
         try {
            var10 = var2;
            if (var1 != 0) {
               break label54;
            }

            if (var2 == null) {
               return false;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var10 = var2;
      }

      try {
         if (var10.ba() != null) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   public static void bbb(
      aabbbbaaa param0, Matrix4f param1, float param2, float param3, float param4, float param5, int param6, int param7
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w 1630144315
      // 003: istore 20
      // 005: iload 6
      // 007: ldc_w 1176327981
      // 00a: iload 20
      // 00c: ldc_w 42462188
      // 00f: ixor
      // 010: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 013: ldc2_w 4885984412288499008
      // 016: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 019: iushr
      // 01a: ldc_w 1176327982
      // 01d: iload 20
      // 01f: ldc_w -745495884
      // 022: ixor
      // 023: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 026: ldc2_w 2950445323226043918
      // 029: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 02c: iand
      // 02d: istore 9
      // 02f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 032: iload 7
      // 034: ldc_w 1176327983
      // 037: iload 20
      // 039: ldc_w 1829756087
      // 03c: ixor
      // 03d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 040: ldc2_w 1870077572757942372
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 046: iushr
      // 047: ldc_w 1176327976
      // 04a: iload 20
      // 04c: ldc_w 2139978962
      // 04f: ixor
      // 050: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 053: ldc2_w 345831143669751952
      // 056: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 059: iand
      // 05a: istore 10
      // 05c: istore 8
      // 05e: aload 0
      // 05f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 062: ifeq 0b5
      // 065: aload 1
      // 066: ifnull 0b5
      // 069: goto 06d
      // 06c: athrow
      // 06d: iload 9
      // 06f: iload 8
      // 071: ifne 0a2
      // 074: goto 078
      // 077: athrow
      // 078: ifgt 091
      // 07b: goto 07f
      // 07e: athrow
      // 07f: iload 10
      // 081: iload 8
      // 083: ifne 0a2
      // 086: goto 08a
      // 089: athrow
      // 08a: ifle 0b5
      // 08d: goto 091
      // 090: athrow
      // 091: fload 4
      // 093: iload 8
      // 095: ifne 0a7
      // 098: goto 09c
      // 09b: athrow
      // 09c: fload 2
      // 09d: fcmpg
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: ifle 0b5
      // 0a5: fload 5
      // 0a7: iload 8
      // 0a9: ifne 0e4
      // 0ac: fload 3
      // 0ad: fcmpg
      // 0ae: ifgt 0b7
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: return
      // 0b6: athrow
      // 0b7: iload 6
      // 0b9: ldc_w 1176327977
      // 0bc: iload 20
      // 0be: ldc_w 18150047
      // 0c1: ixor
      // 0c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0c5: ldc2_w 7415974265760647254
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0cb: ishr
      // 0cc: ldc_w 1176327978
      // 0cf: iload 20
      // 0d1: ldc_w -387644932
      // 0d4: ixor
      // 0d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0d8: ldc2_w 345831143669751952
      // 0db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0de: iand
      // 0df: i2f
      // 0e0: ldc_w 255.0
      // 0e3: fdiv
      // 0e4: fstore 11
      // 0e6: iload 6
      // 0e8: ldc_w 1176327979
      // 0eb: iload 20
      // 0ed: ldc_w 95941927
      // 0f0: ixor
      // 0f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0f4: ldc2_w 6259397949108581650
      // 0f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0fa: ishr
      // 0fb: ldc_w 1176327972
      // 0fe: iload 20
      // 100: ldc_w 325397547
      // 103: ixor
      // 104: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 107: ldc2_w 345831143669751952
      // 10a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 10d: iand
      // 10e: i2f
      // 10f: ldc_w 255.0
      // 112: fdiv
      // 113: fstore 12
      // 115: iload 6
      // 117: ldc_w 1176327973
      // 11a: iload 20
      // 11c: ldc_w 938316811
      // 11f: ixor
      // 120: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 123: ldc2_w 345831143669751952
      // 126: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 129: iand
      // 12a: i2f
      // 12b: ldc_w 255.0
      // 12e: fdiv
      // 12f: fstore 13
      // 131: iload 9
      // 133: i2f
      // 134: ldc_w 255.0
      // 137: fdiv
      // 138: fstore 14
      // 13a: iload 7
      // 13c: ldc_w 1176327974
      // 13f: iload 20
      // 141: ldc_w -472344480
      // 144: ixor
      // 145: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 148: ldc2_w 2831087545420420755
      // 14b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 14e: ishr
      // 14f: ldc_w 1176327975
      // 152: iload 20
      // 154: ldc_w -454090850
      // 157: ixor
      // 158: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 15b: ldc2_w 345831143669751952
      // 15e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 161: iand
      // 162: i2f
      // 163: ldc_w 255.0
      // 166: fdiv
      // 167: fstore 15
      // 169: iload 7
      // 16b: ldc_w 1176327968
      // 16e: iload 20
      // 170: ldc_w -1389441307
      // 173: ixor
      // 174: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 177: ldc2_w 6259397949108581650
      // 17a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 17d: ishr
      // 17e: ldc_w 1176327969
      // 181: iload 20
      // 183: ldc_w 935882753
      // 186: ixor
      // 187: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 18a: ldc2_w 345831143669751952
      // 18d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 190: iand
      // 191: i2f
      // 192: ldc_w 255.0
      // 195: fdiv
      // 196: fstore 16
      // 198: iload 7
      // 19a: ldc_w 1176327970
      // 19d: iload 20
      // 19f: ldc_w 583765588
      // 1a2: ixor
      // 1a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 1a6: ldc2_w 345831143669751952
      // 1a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 1ac: iand
      // 1ad: i2f
      // 1ae: ldc_w 255.0
      // 1b1: fdiv
      // 1b2: fstore 17
      // 1b4: iload 10
      // 1b6: i2f
      // 1b7: ldc_w 255.0
      // 1ba: fdiv
      // 1bb: fstore 18
      // 1bd: aload 0
      // 1be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 1c1: invokestatic net/minecraft/class_12249.method_76023 ()Lnet/minecraft/class_1921;
      // 1c4: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 1c9: astore 19
      // 1cb: aload 19
      // 1cd: aload 1
      // 1ce: fload 2
      // 1cf: fload 3
      // 1d0: fconst_0
      // 1d1: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1d6: fload 11
      // 1d8: fload 12
      // 1da: fload 13
      // 1dc: fload 14
      // 1de: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1e3: pop
      // 1e4: aload 19
      // 1e6: aload 1
      // 1e7: fload 2
      // 1e8: fload 5
      // 1ea: fconst_0
      // 1eb: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1f0: fload 15
      // 1f2: fload 16
      // 1f4: fload 17
      // 1f6: fload 18
      // 1f8: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1fd: pop
      // 1fe: aload 19
      // 200: aload 1
      // 201: fload 4
      // 203: fload 5
      // 205: fconst_0
      // 206: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 20b: fload 15
      // 20d: fload 16
      // 20f: fload 17
      // 211: fload 18
      // 213: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 218: pop
      // 219: aload 19
      // 21b: aload 1
      // 21c: fload 4
      // 21e: fload 3
      // 21f: fconst_0
      // 220: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 225: fload 11
      // 227: fload 12
      // 229: fload 13
      // 22b: fload 14
      // 22d: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 232: pop
      // 233: return
   }

   public static void aaaa(aabbbbaaa var0) {
      aabab(var0);
   }

   public static class_243 aaab() {
      class_4184 var0 = class_310.method_1551().field_1773.method_19418();
      float var1 = (float) Math.PI;
      float var2 = (float)Math.toRadians(-var0.method_19330());
      float var3 = (float)Math.toRadians(-var0.method_19329());
      float var4 = class_3532.method_15374(var2 - var1);
      float var5 = class_3532.method_15362(var2 - var1);
      float var6 = -class_3532.method_15374(var3);
      float var7 = class_3532.method_15362(var3);
      return new class_243(var5 * var6, var7, var4 * var6).method_1019(var0.method_71156());
   }

   public static void aaba(
      aabbbbaaa param0, class_243 param1, float param2, float param3, float param4, Color param5, double param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 8
      // 05: aload 0
      // 06: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 09: ifeq 31
      // 0c: aload 1
      // 0d: ifnull 31
      // 10: goto 14
      // 13: athrow
      // 14: fload 2
      // 15: iload 8
      // 17: ifne 2c
      // 1a: goto 1e
      // 1d: athrow
      // 1e: fconst_0
      // 1f: fcmpg
      // 20: ifle 31
      // 23: goto 27
      // 26: athrow
      // 27: fload 3
      // 28: goto 2c
      // 2b: athrow
      // 2c: fconst_0
      // 2d: fcmpg
      // 2e: ifgt 33
      // 31: return
      // 32: athrow
      // 33: aload 0
      // 34: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 39: aload 0
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 3d: aload 1
      // 3e: fload 2
      // 3f: fload 3
      // 40: fload 4
      // 42: aload 5
      // 44: dload 6
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaba (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_243;FFFLjava/awt/Color;D)V
      // 49: return
   }

   public static boolean aabb(class_310 param0, aabbbbaaa param1, class_1297 param2, class_243 param3) {
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
      // 06: ifnull 22
      // 09: aload 2
      // 0a: ifnull 22
      // 0d: goto 11
      // 10: athrow
      // 11: aload 3
      // 12: iload 4
      // 14: ifne 29
      // 17: goto 1b
      // 1a: athrow
      // 1b: ifnonnull 25
      // 1e: goto 22
      // 21: athrow
      // 22: bipush 0
      // 23: ireturn
      // 24: athrow
      // 25: aload 1
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaab (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 29: astore 5
      // 2b: aload 1
      // 2c: iload 4
      // 2e: ifne 39
      // 31: ifnull 6f
      // 34: goto 38
      // 37: athrow
      // 38: aload 1
      // 39: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.b ()Lnet/minecraft/class_4604; 1
      // 3e: ifnull 6f
      // 41: aload 0
      // 42: invokevirtual net/minecraft/class_310.method_1561 ()Lnet/minecraft/class_898;
      // 45: aload 2
      // 46: aload 1
      // 47: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.b ()Lnet/minecraft/class_4604; 1
      // 4c: aload 3
      // 4d: getfield net/minecraft/class_243.field_1352 D
      // 50: aload 5
      // 52: getfield net/minecraft/class_243.field_1352 D
      // 55: dsub
      // 56: aload 3
      // 57: getfield net/minecraft/class_243.field_1351 D
      // 5a: aload 5
      // 5c: getfield net/minecraft/class_243.field_1351 D
      // 5f: dsub
      // 60: aload 3
      // 61: getfield net/minecraft/class_243.field_1350 D
      // 64: aload 5
      // 66: getfield net/minecraft/class_243.field_1350 D
      // 69: dsub
      // 6a: invokevirtual net/minecraft/class_898.method_3950 (Lnet/minecraft/class_1297;Lnet/minecraft/class_4604;DDD)Z
      // 6d: ireturn
      // 6e: athrow
      // 6f: aload 3
      // 70: aload 5
      // 72: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
      // 75: ldc2_w 16384.0
      // 78: dcmpg
      // 79: iload 4
      // 7b: ifne 86
      // 7e: ifgt 89
      // 81: goto 85
      // 84: athrow
      // 85: bipush 1
      // 86: goto 8a
      // 89: bipush 0
      // 8a: ireturn
   }

   public static void abaa(aabbbbaaa var0, class_243 var1, class_243 var2, Color var3, double var4, float var6) {
      bab(var6, bbaabbaa::aabbba);
   }

   private static int abab(Color var0, double var1) {
      int var4 = -225819287;
      int var3 = baab(var1);
      return (var3 & aaabba(a(1176327971, var4 ^ -1370281829), 345831143669751952L)) << aaabba(a(1176327996, var4 ^ -1779204982), 1870077572757942372L)
         | (var0.getRed() & aaabba(a(1176327997, var4 ^ 356657054), 345831143669751952L)) << aaabba(a(1176327998, var4 ^ 780536364), 2831087545420420755L)
         | (var0.getGreen() & aaabba(a(1176327999, var4 ^ -1903697429), 345831143669751952L))
            << aaabba(a(1176327992, var4 ^ -2100670770), 6259397949108581650L)
         | var0.getBlue() & aaabba(a(1176327993, var4 ^ 1460915851), 345831143669751952L);
   }

   private static void abba(aabbbbaaa var0, class_243[] var1, Color var2, double var3) {
      bbbab(var0, var1, var2, var3);
   }

   private static Method abbb() {
      Method var0 = aaaaa(
         aabbaaaba.abba(aab[aaabba(a(1176327994, 751771611 ^ -605432026), 1438114724584815358L)]),
         aabbaaaba.abba(aab[aaabba(a(1176327995, 751771611 ^ 616005593), 7717963154518017580L)]),
         1
      );
      if (var0 == null) {
         var0 = aaaaa(
            aabbaaaba.abba(aab[aaabba(a(1176327988, 751771611 ^ -1094946089), 130133272969105020L)]),
            aabbaaaba.abba(aab[aaabba(a(1176327989, 751771611 ^ 1030071625), 1759357993700649541L)]),
            1
         );
      }

      return var0;
   }

   private static void baaa(
      class_4588 param0,
      Matrix4f param1,
      float param2,
      float param3,
      float param4,
      float param5,
      float param6,
      float param7,
      float param8,
      float param9,
      float param10,
      float param11,
      float param12,
      float param13,
      float param14
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 1
      // 01: fload 4
      // 03: invokestatic net/minecraft/class_3532.method_15386 (F)I
      // 06: invokestatic java/lang/Math.max (II)I
      // 09: istore 16
      // 0b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0e: bipush 0
      // 0f: istore 17
      // 11: istore 15
      // 13: iload 17
      // 15: iload 16
      // 17: if_icmpge fd
      // 1a: fload 4
      // 1c: iload 17
      // 1e: i2f
      // 1f: invokestatic java/lang/Math.min (FF)F
      // 22: fstore 18
      // 24: fload 4
      // 26: iload 17
      // 28: i2f
      // 29: fconst_1
      // 2a: fadd
      // 2b: invokestatic java/lang/Math.min (FF)F
      // 2e: fstore 19
      // 30: fload 19
      // 32: iload 15
      // 34: ifne 4e
      // 37: fload 18
      // 39: fcmpg
      // 3a: ifgt 45
      // 3d: goto 41
      // 40: athrow
      // 41: goto f5
      // 44: athrow
      // 45: fload 18
      // 47: fload 19
      // 49: fadd
      // 4a: ldc_w 0.5
      // 4d: fmul
      // 4e: fstore 20
      // 50: iload 15
      // 52: fload 20
      // 54: fload 4
      // 56: fload 6
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baa (FFF)F
      // 5b: fstore 21
      // 5d: fload 20
      // 5f: fload 4
      // 61: fload 5
      // 63: fload 6
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaba (FFFF)F
      // 68: fstore 22
      // 6a: ifne d7
      // 6d: fload 22
      // 6f: fload 21
      // 71: fcmpg
      // 72: ifgt 7d
      // 75: goto 79
      // 78: athrow
      // 79: goto f5
      // 7c: athrow
      // 7d: aload 0
      // 7e: aload 1
      // 7f: fload 2
      // 80: fload 18
      // 82: fadd
      // 83: fload 3
      // 84: fload 21
      // 86: fadd
      // 87: fconst_0
      // 88: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 8d: fload 7
      // 8f: fload 8
      // 91: fload 9
      // 93: fload 10
      // 95: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 9a: pop
      // 9b: aload 0
      // 9c: aload 1
      // 9d: fload 2
      // 9e: fload 18
      // a0: fadd
      // a1: fload 3
      // a2: fload 22
      // a4: fadd
      // a5: fconst_0
      // a6: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // ab: fload 11
      // ad: fload 12
      // af: fload 13
      // b1: fload 14
      // b3: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // b8: pop
      // b9: aload 0
      // ba: aload 1
      // bb: fload 2
      // bc: fload 19
      // be: fadd
      // bf: fload 3
      // c0: fload 22
      // c2: fadd
      // c3: fconst_0
      // c4: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // c9: fload 11
      // cb: fload 12
      // cd: fload 13
      // cf: fload 14
      // d1: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // d6: pop
      // d7: aload 0
      // d8: aload 1
      // d9: fload 2
      // da: fload 19
      // dc: fadd
      // dd: fload 3
      // de: fload 21
      // e0: fadd
      // e1: fconst_0
      // e2: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // e7: fload 7
      // e9: fload 8
      // eb: fload 9
      // ed: fload 10
      // ef: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // f4: pop
      // f5: iinc 17 1
      // f8: iload 15
      // fa: ifeq 13
      // fd: return
   }

   private static int baab(double var0) {
      return Math.max(0, Math.min(aaabba(a(1176327990, -1233771588 ^ -259779593), 345831143669751952L), (int)Math.round(var0)));
   }

   public static void baba(Object param0, class_243 param1, float param2, float param3, float param4, Color param5, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 8
      // 05: aload 0
      // 06: iload 8
      // 08: ifne 33
      // 0b: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 0e: ifeq 2e
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 19: astore 9
      // 1b: iload 8
      // 1d: aload 9
      // 1f: aload 1
      // 20: fload 2
      // 21: fload 3
      // 22: fload 4
      // 24: aload 5
      // 26: dload 6
      // 28: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_243;FFFLjava/awt/Color;D)V
      // 2b: ifeq 64
      // 2e: aload 0
      // 2f: goto 33
      // 32: athrow
      // 33: iload 8
      // 35: ifne 47
      // 38: instanceof net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 3b: ifeq 64
      // 3e: goto 42
      // 41: athrow
      // 42: aload 0
      // 43: goto 47
      // 46: athrow
      // 47: checkcast net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 4a: astore 10
      // 4c: aload 10
      // 4e: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.matrices ()Lnet/minecraft/class_4587; 1
      // 53: aload 10
      // 55: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 58: aload 1
      // 59: fload 2
      // 5a: fload 3
      // 5b: fload 4
      // 5d: aload 5
      // 5f: dload 6
      // 61: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaba (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_243;FFFLjava/awt/Color;D)V
      // 64: return
   }

   private static Object babb(Method param0, Object[] param1) {
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
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: areturn
      // 12: athrow
      // 13: aload 0
      // 14: aconst_null
      // 15: aload 1
      // 16: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 19: areturn
      // 1a: astore 3
      // 1b: aload 3
      // 1c: pop
      // 1d: aconst_null
      // 1e: areturn
   }

   public static aaaaaaa bbaa(aabbbbaaa param0, class_243 param1) {
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
      // 005: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 008: ifeq 013
      // 00b: aload 1
      // 00c: ifnonnull 016
      // 00f: goto 013
      // 012: athrow
      // 013: aconst_null
      // 014: areturn
      // 015: athrow
      // 016: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 019: astore 3
      // 01a: aload 3
      // 01b: iload 2
      // 01c: ifne 02d
      // 01f: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 022: ifnonnull 02c
      // 025: goto 029
      // 028: athrow
      // 029: aconst_null
      // 02a: areturn
      // 02b: athrow
      // 02c: aload 3
      // 02d: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 030: invokevirtual net/minecraft/class_1041.method_4486 ()I
      // 033: istore 4
      // 035: aload 3
      // 036: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 039: invokevirtual net/minecraft/class_1041.method_4502 ()I
      // 03c: istore 5
      // 03e: iload 4
      // 040: iload 2
      // 041: ifne 04d
      // 044: ifle 050
      // 047: goto 04b
      // 04a: athrow
      // 04b: iload 5
      // 04d: ifgt 053
      // 050: aconst_null
      // 051: areturn
      // 052: athrow
      // 053: aload 0
      // 054: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.aaa ()Lorg/joml/Matrix4f; 1
      // 059: astore 6
      // 05b: aload 0
      // 05c: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.aba ()Lorg/joml/Matrix4f; 1
      // 061: astore 7
      // 063: aload 0
      // 064: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaab (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 067: astore 8
      // 069: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bab Lorg/joml/Matrix4f;
      // 06c: aload 6
      // 06e: invokevirtual org/joml/Matrix4f.set (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 071: aload 7
      // 073: invokevirtual org/joml/Matrix4f.mul (Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;
      // 076: pop
      // 077: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaab Lorg/joml/Vector4f;
      // 07a: aload 1
      // 07b: getfield net/minecraft/class_243.field_1352 D
      // 07e: aload 8
      // 080: getfield net/minecraft/class_243.field_1352 D
      // 083: dsub
      // 084: d2f
      // 085: aload 1
      // 086: getfield net/minecraft/class_243.field_1351 D
      // 089: aload 8
      // 08b: getfield net/minecraft/class_243.field_1351 D
      // 08e: dsub
      // 08f: d2f
      // 090: aload 1
      // 091: getfield net/minecraft/class_243.field_1350 D
      // 094: aload 8
      // 096: getfield net/minecraft/class_243.field_1350 D
      // 099: dsub
      // 09a: d2f
      // 09b: fconst_1
      // 09c: invokevirtual org/joml/Vector4f.set (FFFF)Lorg/joml/Vector4f;
      // 09f: astore 9
      // 0a1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bab Lorg/joml/Matrix4f;
      // 0a4: aload 9
      // 0a6: invokevirtual org/joml/Matrix4f.transform (Lorg/joml/Vector4f;)Lorg/joml/Vector4f;
      // 0a9: iload 2
      // 0aa: ifne 0c3
      // 0ad: pop
      // 0ae: aload 9
      // 0b0: getfield org/joml/Vector4f.x F
      // 0b3: invokestatic java/lang/Float.isFinite (F)Z
      // 0b6: ifeq 11a
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: aload 9
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: iload 2
      // 0c4: ifne 0da
      // 0c7: getfield org/joml/Vector4f.y F
      // 0ca: invokestatic java/lang/Float.isFinite (F)Z
      // 0cd: ifeq 11a
      // 0d0: goto 0d4
      // 0d3: athrow
      // 0d4: aload 9
      // 0d6: goto 0da
      // 0d9: athrow
      // 0da: getfield org/joml/Vector4f.z F
      // 0dd: iload 2
      // 0de: ifne 0fc
      // 0e1: invokestatic java/lang/Float.isFinite (F)Z
      // 0e4: ifeq 11a
      // 0e7: goto 0eb
      // 0ea: athrow
      // 0eb: aload 9
      // 0ed: iload 2
      // 0ee: ifne 108
      // 0f1: goto 0f5
      // 0f4: athrow
      // 0f5: getfield org/joml/Vector4f.w F
      // 0f8: goto 0fc
      // 0fb: athrow
      // 0fc: invokestatic java/lang/Float.isFinite (F)Z
      // 0ff: ifeq 11a
      // 102: aload 9
      // 104: goto 108
      // 107: athrow
      // 108: iload 2
      // 109: ifne 11f
      // 10c: getfield org/joml/Vector4f.w F
      // 10f: ldc_w 0.05
      // 112: fcmpg
      // 113: ifge 11d
      // 116: goto 11a
      // 119: athrow
      // 11a: aconst_null
      // 11b: areturn
      // 11c: athrow
      // 11d: aload 9
      // 11f: getfield org/joml/Vector4f.x F
      // 122: aload 9
      // 124: getfield org/joml/Vector4f.w F
      // 127: fdiv
      // 128: fstore 10
      // 12a: aload 9
      // 12c: getfield org/joml/Vector4f.y F
      // 12f: aload 9
      // 131: getfield org/joml/Vector4f.w F
      // 134: fdiv
      // 135: fstore 11
      // 137: aload 9
      // 139: getfield org/joml/Vector4f.z F
      // 13c: aload 9
      // 13e: getfield org/joml/Vector4f.w F
      // 141: fdiv
      // 142: fstore 12
      // 144: fload 10
      // 146: iload 2
      // 147: ifne 15a
      // 14a: invokestatic java/lang/Float.isFinite (F)Z
      // 14d: ifeq 1a4
      // 150: goto 154
      // 153: athrow
      // 154: fload 11
      // 156: goto 15a
      // 159: athrow
      // 15a: iload 2
      // 15b: ifne 16e
      // 15e: invokestatic java/lang/Float.isFinite (F)Z
      // 161: ifeq 1a4
      // 164: goto 168
      // 167: athrow
      // 168: fload 12
      // 16a: goto 16e
      // 16d: athrow
      // 16e: iload 2
      // 16f: ifne 182
      // 172: invokestatic java/lang/Float.isFinite (F)Z
      // 175: ifeq 1a4
      // 178: goto 17c
      // 17b: athrow
      // 17c: fload 12
      // 17e: goto 182
      // 181: athrow
      // 182: iload 2
      // 183: ifne 197
      // 186: ldc_w -1.0
      // 189: fcmpg
      // 18a: iflt 1a4
      // 18d: goto 191
      // 190: athrow
      // 191: fload 12
      // 193: goto 197
      // 196: athrow
      // 197: iload 2
      // 198: ifne 1b5
      // 19b: fconst_1
      // 19c: fcmpl
      // 19d: ifle 1a7
      // 1a0: goto 1a4
      // 1a3: athrow
      // 1a4: aconst_null
      // 1a5: areturn
      // 1a6: athrow
      // 1a7: fload 10
      // 1a9: ldc_w 0.5
      // 1ac: fmul
      // 1ad: ldc_w 0.5
      // 1b0: fadd
      // 1b1: iload 4
      // 1b3: i2f
      // 1b4: fmul
      // 1b5: f2d
      // 1b6: dstore 13
      // 1b8: fload 11
      // 1ba: fneg
      // 1bb: ldc_w 0.5
      // 1be: fmul
      // 1bf: ldc_w 0.5
      // 1c2: fadd
      // 1c3: iload 5
      // 1c5: i2f
      // 1c6: fmul
      // 1c7: f2d
      // 1c8: dstore 15
      // 1ca: dload 13
      // 1cc: iload 2
      // 1cd: ifne 1e0
      // 1d0: invokestatic java/lang/Double.isFinite (D)Z
      // 1d3: ifeq 1e6
      // 1d6: goto 1da
      // 1d9: athrow
      // 1da: dload 15
      // 1dc: goto 1e0
      // 1df: athrow
      // 1e0: invokestatic java/lang/Double.isFinite (D)Z
      // 1e3: ifne 1e9
      // 1e6: aconst_null
      // 1e7: areturn
      // 1e8: athrow
      // 1e9: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaa
      // 1ec: dup
      // 1ed: dload 13
      // 1ef: dload 15
      // 1f1: fload 12
      // 1f3: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaa.<init> (DDF)V
      // 1f6: areturn
   }

   public static void bbab(aabbbbaaa param0, Iterable param1, Function param2, Function param3, ToDoubleFunction param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 5
      // 005: aload 0
      // 006: iload 5
      // 008: ifne 018
      // 00b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 00e: ifne 017
      // 011: goto 015
      // 014: athrow
      // 015: return
      // 016: athrow
      // 017: aload 0
      // 018: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaab (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 01b: astore 6
      // 01d: aload 0
      // 01e: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 023: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 026: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 029: astore 7
      // 02b: aload 0
      // 02c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 02f: invokestatic net/minecraft/class_12249.method_76023 ()Lnet/minecraft/class_1921;
      // 032: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 037: astore 8
      // 039: aload 1
      // 03a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 03f: astore 9
      // 041: aload 9
      // 043: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 048: ifeq 11c
      // 04b: aload 9
      // 04d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 052: checkcast java/lang/Iterable
      // 055: astore 10
      // 057: aload 10
      // 059: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 05e: astore 11
      // 060: aload 11
      // 062: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 067: ifeq 117
      // 06a: aload 11
      // 06c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 071: astore 12
      // 073: iload 5
      // 075: aload 2
      // 076: aload 12
      // 078: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 07d: checkcast net/minecraft/class_2338
      // 080: astore 13
      // 082: aload 3
      // 083: aload 12
      // 085: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 08a: checkcast java/awt/Color
      // 08d: astore 14
      // 08f: ldc_w 0.06
      // 092: fstore 15
      // 094: aload 13
      // 096: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 099: i2d
      // 09a: aload 6
      // 09c: getfield net/minecraft/class_243.field_1352 D
      // 09f: dsub
      // 0a0: d2f
      // 0a1: fload 15
      // 0a3: fadd
      // 0a4: fstore 16
      // 0a6: aload 13
      // 0a8: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 0ab: i2d
      // 0ac: aload 6
      // 0ae: getfield net/minecraft/class_243.field_1351 D
      // 0b1: dsub
      // 0b2: d2f
      // 0b3: ldc_w 0.02
      // 0b6: fadd
      // 0b7: fstore 17
      // 0b9: aload 13
      // 0bb: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0be: i2d
      // 0bf: aload 6
      // 0c1: getfield net/minecraft/class_243.field_1350 D
      // 0c4: dsub
      // 0c5: d2f
      // 0c6: fload 15
      // 0c8: fadd
      // 0c9: fstore 18
      // 0cb: aload 13
      // 0cd: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0d0: i2d
      // 0d1: aload 6
      // 0d3: getfield net/minecraft/class_243.field_1352 D
      // 0d6: dsub
      // 0d7: dconst_1
      // 0d8: dadd
      // 0d9: d2f
      // 0da: fload 15
      // 0dc: fsub
      // 0dd: fstore 19
      // 0df: aload 13
      // 0e1: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0e4: i2d
      // 0e5: aload 6
      // 0e7: getfield net/minecraft/class_243.field_1350 D
      // 0ea: dsub
      // 0eb: dconst_1
      // 0ec: dadd
      // 0ed: d2f
      // 0ee: fload 15
      // 0f0: fsub
      // 0f1: fstore 20
      // 0f3: ifne 041
      // 0f6: aload 8
      // 0f8: aload 7
      // 0fa: fload 16
      // 0fc: fload 17
      // 0fe: fload 18
      // 100: fload 19
      // 102: fload 20
      // 104: aload 14
      // 106: aload 4
      // 108: aload 12
      // 10a: invokeinterface java/util/function/ToDoubleFunction.applyAsDouble (Ljava/lang/Object;)D 2
      // 10f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.b (Lnet/minecraft/class_4588;Lorg/joml/Matrix4f;FFFFFLjava/awt/Color;D)V
      // 112: iload 5
      // 114: ifeq 060
      // 117: iload 5
      // 119: ifeq 041
      // 11c: return
   }

   public static void bbba(aabbbbaaa param0, class_2960 param1, class_243 param2, double param3, double param5, Color param7) {
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
      // 006: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 009: ifeq 032
      // 00c: aload 1
      // 00d: ifnull 032
      // 010: goto 014
      // 013: athrow
      // 014: dload 3
      // 015: dconst_0
      // 016: iload 8
      // 018: ifne 02e
      // 01b: goto 01f
      // 01e: athrow
      // 01f: dcmpg
      // 020: ifle 032
      // 023: goto 027
      // 026: athrow
      // 027: dload 5
      // 029: dconst_0
      // 02a: goto 02e
      // 02d: athrow
      // 02e: dcmpg
      // 02f: ifgt 034
      // 032: return
      // 033: athrow
      // 034: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 037: astore 9
      // 039: aload 0
      // 03a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 03d: astore 10
      // 03f: aload 10
      // 041: ifnonnull 046
      // 044: return
      // 045: athrow
      // 046: aload 0
      // 047: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaab (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 04a: astore 11
      // 04c: aload 9
      // 04e: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 051: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 054: astore 12
      // 056: aload 10
      // 058: aload 1
      // 059: invokestatic net/minecraft/class_12249.method_75990 (Lnet/minecraft/class_2960;)Lnet/minecraft/class_1921;
      // 05c: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 061: astore 13
      // 063: dload 3
      // 064: ldc2_w 2.0
      // 067: ddiv
      // 068: d2f
      // 069: fstore 14
      // 06b: dload 5
      // 06d: ldc2_w 2.0
      // 070: ddiv
      // 071: d2f
      // 072: fstore 15
      // 074: aload 7
      // 076: iload 8
      // 078: ifne 085
      // 07b: ifnonnull 088
      // 07e: goto 082
      // 081: athrow
      // 082: getstatic java/awt/Color.WHITE Ljava/awt/Color;
      // 085: goto 08a
      // 088: aload 7
      // 08a: astore 16
      // 08c: aload 16
      // 08e: invokevirtual java/awt/Color.getAlpha ()I
      // 091: istore 17
      // 093: aload 0
      // 094: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 099: invokevirtual net/minecraft/class_4587.method_22903 ()V
      // 09c: aload 0
      // 09d: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 0a2: aload 2
      // 0a3: getfield net/minecraft/class_243.field_1352 D
      // 0a6: aload 11
      // 0a8: getfield net/minecraft/class_243.field_1352 D
      // 0ab: dsub
      // 0ac: aload 2
      // 0ad: getfield net/minecraft/class_243.field_1351 D
      // 0b0: aload 11
      // 0b2: getfield net/minecraft/class_243.field_1351 D
      // 0b5: dsub
      // 0b6: aload 2
      // 0b7: getfield net/minecraft/class_243.field_1350 D
      // 0ba: aload 11
      // 0bc: getfield net/minecraft/class_243.field_1350 D
      // 0bf: dsub
      // 0c0: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
      // 0c3: aload 0
      // 0c4: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 0c9: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
      // 0cc: aload 12
      // 0ce: invokevirtual net/minecraft/class_4184.method_19330 ()F
      // 0d1: fneg
      // 0d2: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
      // 0d7: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
      // 0da: aload 0
      // 0db: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 0e0: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
      // 0e3: aload 12
      // 0e5: invokevirtual net/minecraft/class_4184.method_19329 ()F
      // 0e8: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
      // 0ed: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
      // 0f0: aload 0
      // 0f1: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 0f6: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0f9: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 0fc: astore 18
      // 0fe: aload 13
      // 100: aload 18
      // 102: fload 14
      // 104: fneg
      // 105: fload 15
      // 107: fneg
      // 108: fconst_0
      // 109: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 10e: aload 16
      // 110: invokevirtual java/awt/Color.getRed ()I
      // 113: aload 16
      // 115: invokevirtual java/awt/Color.getGreen ()I
      // 118: aload 16
      // 11a: invokevirtual java/awt/Color.getBlue ()I
      // 11d: iload 17
      // 11f: invokeinterface net/minecraft/class_4588.method_1336 (IIII)Lnet/minecraft/class_4588; 5
      // 124: fconst_0
      // 125: fconst_1
      // 126: invokeinterface net/minecraft/class_4588.method_22913 (FF)Lnet/minecraft/class_4588; 3
      // 12b: getstatic net/minecraft/class_4608.field_21444 I
      // 12e: invokeinterface net/minecraft/class_4588.method_22922 (I)Lnet/minecraft/class_4588; 2
      // 133: ldc_w 1176327991
      // 136: ldc_w -714700242
      // 139: ldc_w 1621007141
      // 13c: ixor
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 140: ldc2_w 8465416955397884776
      // 143: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 146: invokeinterface net/minecraft/class_4588.method_60803 (I)Lnet/minecraft/class_4588; 2
      // 14b: fconst_0
      // 14c: fconst_0
      // 14d: fconst_1
      // 14e: invokeinterface net/minecraft/class_4588.method_22914 (FFF)Lnet/minecraft/class_4588; 4
      // 153: pop
      // 154: aload 13
      // 156: aload 18
      // 158: fload 14
      // 15a: fload 15
      // 15c: fneg
      // 15d: fconst_0
      // 15e: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 163: aload 16
      // 165: invokevirtual java/awt/Color.getRed ()I
      // 168: aload 16
      // 16a: invokevirtual java/awt/Color.getGreen ()I
      // 16d: aload 16
      // 16f: invokevirtual java/awt/Color.getBlue ()I
      // 172: iload 17
      // 174: invokeinterface net/minecraft/class_4588.method_1336 (IIII)Lnet/minecraft/class_4588; 5
      // 179: fconst_1
      // 17a: fconst_1
      // 17b: invokeinterface net/minecraft/class_4588.method_22913 (FF)Lnet/minecraft/class_4588; 3
      // 180: getstatic net/minecraft/class_4608.field_21444 I
      // 183: invokeinterface net/minecraft/class_4588.method_22922 (I)Lnet/minecraft/class_4588; 2
      // 188: ldc_w 1176327984
      // 18b: ldc_w -714700242
      // 18e: ldc_w 1514694838
      // 191: ixor
      // 192: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 195: ldc2_w 8465416955397884776
      // 198: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 19b: invokeinterface net/minecraft/class_4588.method_60803 (I)Lnet/minecraft/class_4588; 2
      // 1a0: fconst_0
      // 1a1: fconst_0
      // 1a2: fconst_1
      // 1a3: invokeinterface net/minecraft/class_4588.method_22914 (FFF)Lnet/minecraft/class_4588; 4
      // 1a8: pop
      // 1a9: aload 13
      // 1ab: aload 18
      // 1ad: fload 14
      // 1af: fload 15
      // 1b1: fconst_0
      // 1b2: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1b7: aload 16
      // 1b9: invokevirtual java/awt/Color.getRed ()I
      // 1bc: aload 16
      // 1be: invokevirtual java/awt/Color.getGreen ()I
      // 1c1: aload 16
      // 1c3: invokevirtual java/awt/Color.getBlue ()I
      // 1c6: iload 17
      // 1c8: invokeinterface net/minecraft/class_4588.method_1336 (IIII)Lnet/minecraft/class_4588; 5
      // 1cd: fconst_1
      // 1ce: fconst_0
      // 1cf: invokeinterface net/minecraft/class_4588.method_22913 (FF)Lnet/minecraft/class_4588; 3
      // 1d4: getstatic net/minecraft/class_4608.field_21444 I
      // 1d7: invokeinterface net/minecraft/class_4588.method_22922 (I)Lnet/minecraft/class_4588; 2
      // 1dc: ldc_w 1176327985
      // 1df: ldc_w -714700242
      // 1e2: ldc_w -2032686121
      // 1e5: ixor
      // 1e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 1e9: ldc2_w 8465416955397884776
      // 1ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 1ef: invokeinterface net/minecraft/class_4588.method_60803 (I)Lnet/minecraft/class_4588; 2
      // 1f4: fconst_0
      // 1f5: fconst_0
      // 1f6: fconst_1
      // 1f7: invokeinterface net/minecraft/class_4588.method_22914 (FFF)Lnet/minecraft/class_4588; 4
      // 1fc: pop
      // 1fd: aload 13
      // 1ff: aload 18
      // 201: fload 14
      // 203: fneg
      // 204: fload 15
      // 206: fconst_0
      // 207: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 20c: aload 16
      // 20e: invokevirtual java/awt/Color.getRed ()I
      // 211: aload 16
      // 213: invokevirtual java/awt/Color.getGreen ()I
      // 216: aload 16
      // 218: invokevirtual java/awt/Color.getBlue ()I
      // 21b: iload 17
      // 21d: invokeinterface net/minecraft/class_4588.method_1336 (IIII)Lnet/minecraft/class_4588; 5
      // 222: fconst_0
      // 223: fconst_0
      // 224: invokeinterface net/minecraft/class_4588.method_22913 (FF)Lnet/minecraft/class_4588; 3
      // 229: getstatic net/minecraft/class_4608.field_21444 I
      // 22c: invokeinterface net/minecraft/class_4588.method_22922 (I)Lnet/minecraft/class_4588; 2
      // 231: ldc_w 1176327986
      // 234: ldc_w -714700242
      // 237: ldc_w 600805516
      // 23a: ixor
      // 23b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 23e: ldc2_w 8465416955397884776
      // 241: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 244: invokeinterface net/minecraft/class_4588.method_60803 (I)Lnet/minecraft/class_4588; 2
      // 249: fconst_0
      // 24a: fconst_0
      // 24b: fconst_1
      // 24c: invokeinterface net/minecraft/class_4588.method_22914 (FFF)Lnet/minecraft/class_4588; 4
      // 251: pop
      // 252: aload 0
      // 253: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 258: invokevirtual net/minecraft/class_4587.method_22909 ()V
      // 25b: return
   }

   private static void bbbb(class_4587 param0, class_238 param1, Color param2, double param3, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 6
      // 005: aload 0
      // 006: ifnull 019
      // 009: aload 1
      // 00a: ifnull 019
      // 00d: goto 011
      // 010: athrow
      // 011: aload 2
      // 012: ifnonnull 01b
      // 015: goto 019
      // 018: athrow
      // 019: return
      // 01a: athrow
      // 01b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 01e: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 021: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 024: astore 7
      // 026: aload 7
      // 028: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
      // 02b: astore 8
      // 02d: aload 1
      // 02e: getfield net/minecraft/class_238.field_1323 D
      // 031: aload 8
      // 033: getfield net/minecraft/class_243.field_1352 D
      // 036: dsub
      // 037: d2f
      // 038: fstore 9
      // 03a: aload 1
      // 03b: getfield net/minecraft/class_238.field_1322 D
      // 03e: aload 8
      // 040: getfield net/minecraft/class_243.field_1351 D
      // 043: dsub
      // 044: d2f
      // 045: fstore 10
      // 047: aload 1
      // 048: getfield net/minecraft/class_238.field_1321 D
      // 04b: aload 8
      // 04d: getfield net/minecraft/class_243.field_1350 D
      // 050: dsub
      // 051: d2f
      // 052: fstore 11
      // 054: aload 1
      // 055: getfield net/minecraft/class_238.field_1320 D
      // 058: aload 8
      // 05a: getfield net/minecraft/class_243.field_1352 D
      // 05d: dsub
      // 05e: d2f
      // 05f: fstore 12
      // 061: aload 1
      // 062: getfield net/minecraft/class_238.field_1325 D
      // 065: aload 8
      // 067: getfield net/minecraft/class_243.field_1351 D
      // 06a: dsub
      // 06b: d2f
      // 06c: fstore 13
      // 06e: aload 1
      // 06f: getfield net/minecraft/class_238.field_1324 D
      // 072: aload 8
      // 074: getfield net/minecraft/class_243.field_1350 D
      // 077: dsub
      // 078: d2f
      // 079: fstore 14
      // 07b: aload 2
      // 07c: invokevirtual java/awt/Color.getRed ()I
      // 07f: i2f
      // 080: ldc_w 255.0
      // 083: fdiv
      // 084: fstore 15
      // 086: aload 2
      // 087: invokevirtual java/awt/Color.getGreen ()I
      // 08a: i2f
      // 08b: ldc_w 255.0
      // 08e: fdiv
      // 08f: fstore 16
      // 091: aload 2
      // 092: invokevirtual java/awt/Color.getBlue ()I
      // 095: i2f
      // 096: ldc_w 255.0
      // 099: fdiv
      // 09a: fstore 17
      // 09c: dload 3
      // 09d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baab (D)I
      // 0a0: i2f
      // 0a1: ldc_w 255.0
      // 0a4: fdiv
      // 0a5: fstore 18
      // 0a7: aload 0
      // 0a8: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0ab: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 0ae: astore 19
      // 0b0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ba Ljava/lang/reflect/Method;
      // 0b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 0b6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaa Ljava/lang/reflect/Method;
      // 0b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 0bc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaa Ljava/lang/reflect/Method;
      // 0bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 0c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babbb ()V
      // 0c5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbba Ljava/lang/reflect/Method;
      // 0c8: bipush 1
      // 0c9: anewarray 4
      // 0cc: dup
      // 0cd: bipush 0
      // 0ce: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aa Ljava/lang/Object;
      // 0d1: aastore
      // 0d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 0d5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 0d8: bipush 1
      // 0d9: anewarray 4
      // 0dc: dup
      // 0dd: bipush 0
      // 0de: fload 5
      // 0e0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 0e3: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0e6: aastore
      // 0e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 0ea: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abba Ljava/lang/reflect/Method;
      // 0ed: bipush 0
      // 0ee: anewarray 4
      // 0f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babb (Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0f4: astore 20
      // 0f6: iload 6
      // 0f8: aload 20
      // 0fa: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baa Ljava/lang/reflect/Method;
      // 0fd: bipush 2
      // 0fe: anewarray 4
      // 101: dup
      // 102: bipush 0
      // 103: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baba Ljava/lang/Object;
      // 106: aastore
      // 107: dup
      // 108: bipush 1
      // 109: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbb Ljava/lang/Object;
      // 10c: aastore
      // 10d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaa (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 110: checkcast net/minecraft/class_4588
      // 113: astore 21
      // 115: ifne 3fa
      // 118: aload 21
      // 11a: ifnonnull 142
      // 11d: goto 121
      // 120: athrow
      // 121: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 124: bipush 1
      // 125: anewarray 4
      // 128: dup
      // 129: bipush 0
      // 12a: fconst_1
      // 12b: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 12e: aastore
      // 12f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 132: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 135: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 138: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 13b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 13e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 141: return
      // 142: aload 21
      // 144: aload 19
      // 146: fload 9
      // 148: fload 10
      // 14a: fload 11
      // 14c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 151: fload 15
      // 153: fload 16
      // 155: fload 17
      // 157: fload 18
      // 159: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 15e: pop
      // 15f: aload 21
      // 161: aload 19
      // 163: fload 12
      // 165: fload 10
      // 167: fload 11
      // 169: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 16e: fload 15
      // 170: fload 16
      // 172: fload 17
      // 174: fload 18
      // 176: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 17b: pop
      // 17c: aload 21
      // 17e: aload 19
      // 180: fload 12
      // 182: fload 10
      // 184: fload 11
      // 186: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 18b: fload 15
      // 18d: fload 16
      // 18f: fload 17
      // 191: fload 18
      // 193: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 198: pop
      // 199: aload 21
      // 19b: aload 19
      // 19d: fload 12
      // 19f: fload 13
      // 1a1: fload 11
      // 1a3: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1a8: fload 15
      // 1aa: fload 16
      // 1ac: fload 17
      // 1ae: fload 18
      // 1b0: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1b5: pop
      // 1b6: aload 21
      // 1b8: aload 19
      // 1ba: fload 12
      // 1bc: fload 13
      // 1be: fload 11
      // 1c0: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1c5: fload 15
      // 1c7: fload 16
      // 1c9: fload 17
      // 1cb: fload 18
      // 1cd: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1d2: pop
      // 1d3: aload 21
      // 1d5: aload 19
      // 1d7: fload 9
      // 1d9: fload 13
      // 1db: fload 11
      // 1dd: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1e2: fload 15
      // 1e4: fload 16
      // 1e6: fload 17
      // 1e8: fload 18
      // 1ea: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1ef: pop
      // 1f0: aload 21
      // 1f2: aload 19
      // 1f4: fload 9
      // 1f6: fload 13
      // 1f8: fload 11
      // 1fa: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1ff: fload 15
      // 201: fload 16
      // 203: fload 17
      // 205: fload 18
      // 207: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 20c: pop
      // 20d: aload 21
      // 20f: aload 19
      // 211: fload 9
      // 213: fload 10
      // 215: fload 11
      // 217: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 21c: fload 15
      // 21e: fload 16
      // 220: fload 17
      // 222: fload 18
      // 224: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 229: pop
      // 22a: aload 21
      // 22c: aload 19
      // 22e: fload 9
      // 230: fload 10
      // 232: fload 14
      // 234: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 239: fload 15
      // 23b: fload 16
      // 23d: fload 17
      // 23f: fload 18
      // 241: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 246: pop
      // 247: aload 21
      // 249: aload 19
      // 24b: fload 12
      // 24d: fload 10
      // 24f: fload 14
      // 251: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 256: fload 15
      // 258: fload 16
      // 25a: fload 17
      // 25c: fload 18
      // 25e: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 263: pop
      // 264: aload 21
      // 266: aload 19
      // 268: fload 12
      // 26a: fload 10
      // 26c: fload 14
      // 26e: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 273: fload 15
      // 275: fload 16
      // 277: fload 17
      // 279: fload 18
      // 27b: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 280: pop
      // 281: aload 21
      // 283: aload 19
      // 285: fload 12
      // 287: fload 13
      // 289: fload 14
      // 28b: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 290: fload 15
      // 292: fload 16
      // 294: fload 17
      // 296: fload 18
      // 298: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 29d: pop
      // 29e: aload 21
      // 2a0: aload 19
      // 2a2: fload 12
      // 2a4: fload 13
      // 2a6: fload 14
      // 2a8: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2ad: fload 15
      // 2af: fload 16
      // 2b1: fload 17
      // 2b3: fload 18
      // 2b5: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2ba: pop
      // 2bb: aload 21
      // 2bd: aload 19
      // 2bf: fload 9
      // 2c1: fload 13
      // 2c3: fload 14
      // 2c5: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2ca: fload 15
      // 2cc: fload 16
      // 2ce: fload 17
      // 2d0: fload 18
      // 2d2: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2d7: pop
      // 2d8: aload 21
      // 2da: aload 19
      // 2dc: fload 9
      // 2de: fload 13
      // 2e0: fload 14
      // 2e2: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2e7: fload 15
      // 2e9: fload 16
      // 2eb: fload 17
      // 2ed: fload 18
      // 2ef: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2f4: pop
      // 2f5: aload 21
      // 2f7: aload 19
      // 2f9: fload 9
      // 2fb: fload 10
      // 2fd: fload 14
      // 2ff: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 304: fload 15
      // 306: fload 16
      // 308: fload 17
      // 30a: fload 18
      // 30c: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 311: pop
      // 312: aload 21
      // 314: aload 19
      // 316: fload 9
      // 318: fload 10
      // 31a: fload 11
      // 31c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 321: fload 15
      // 323: fload 16
      // 325: fload 17
      // 327: fload 18
      // 329: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 32e: pop
      // 32f: aload 21
      // 331: aload 19
      // 333: fload 9
      // 335: fload 10
      // 337: fload 14
      // 339: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 33e: fload 15
      // 340: fload 16
      // 342: fload 17
      // 344: fload 18
      // 346: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 34b: pop
      // 34c: aload 21
      // 34e: aload 19
      // 350: fload 12
      // 352: fload 10
      // 354: fload 11
      // 356: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 35b: fload 15
      // 35d: fload 16
      // 35f: fload 17
      // 361: fload 18
      // 363: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 368: pop
      // 369: aload 21
      // 36b: aload 19
      // 36d: fload 12
      // 36f: fload 10
      // 371: fload 14
      // 373: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 378: fload 15
      // 37a: fload 16
      // 37c: fload 17
      // 37e: fload 18
      // 380: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 385: pop
      // 386: aload 21
      // 388: aload 19
      // 38a: fload 12
      // 38c: fload 13
      // 38e: fload 11
      // 390: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 395: fload 15
      // 397: fload 16
      // 399: fload 17
      // 39b: fload 18
      // 39d: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 3a2: pop
      // 3a3: aload 21
      // 3a5: aload 19
      // 3a7: fload 12
      // 3a9: fload 13
      // 3ab: fload 14
      // 3ad: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 3b2: fload 15
      // 3b4: fload 16
      // 3b6: fload 17
      // 3b8: fload 18
      // 3ba: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 3bf: pop
      // 3c0: aload 21
      // 3c2: aload 19
      // 3c4: fload 9
      // 3c6: fload 13
      // 3c8: fload 11
      // 3ca: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 3cf: fload 15
      // 3d1: fload 16
      // 3d3: fload 17
      // 3d5: fload 18
      // 3d7: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 3dc: pop
      // 3dd: aload 21
      // 3df: aload 19
      // 3e1: fload 9
      // 3e3: fload 13
      // 3e5: fload 14
      // 3e7: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 3ec: fload 15
      // 3ee: fload 16
      // 3f0: fload 17
      // 3f2: fload 18
      // 3f4: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 3f9: pop
      // 3fa: aload 21
      // 3fc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abbb Ljava/lang/reflect/Method;
      // 3ff: bipush 0
      // 400: anewarray 4
      // 403: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaa (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 406: astore 22
      // 408: iload 6
      // 40a: ifne 449
      // 40d: aload 22
      // 40f: ifnull 429
      // 412: goto 416
      // 415: athrow
      // 416: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaab Ljava/lang/reflect/Method;
      // 419: bipush 1
      // 41a: anewarray 4
      // 41d: dup
      // 41e: bipush 0
      // 41f: aload 22
      // 421: aastore
      // 422: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 425: goto 429
      // 428: athrow
      // 429: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 42c: bipush 1
      // 42d: anewarray 4
      // 430: dup
      // 431: bipush 0
      // 432: fconst_1
      // 433: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 436: aastore
      // 437: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 43a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 43d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 440: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 443: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 446: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 449: goto 471
      // 44c: astore 23
      // 44e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 451: bipush 1
      // 452: anewarray 4
      // 455: dup
      // 456: bipush 0
      // 457: fconst_1
      // 458: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 45b: aastore
      // 45c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 45f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 462: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 465: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 468: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 46b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 46e: aload 23
      // 470: athrow
      // 471: return
   }

   private static Method aaaaa(String param0, String param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 04: astore 3
      // 05: aload 3
      // 06: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 09: astore 4
      // 0b: aload 4
      // 0d: arraylength
      // 0e: istore 5
      // 10: bipush 0
      // 11: istore 6
      // 13: iload 6
      // 15: iload 5
      // 17: if_icmpge 4d
      // 1a: aload 4
      // 1c: iload 6
      // 1e: aaload
      // 1f: astore 7
      // 21: aload 7
      // 23: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 26: aload 1
      // 27: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a: ifeq 47
      // 2d: aload 7
      // 2f: invokevirtual java/lang/reflect/Method.getParameterCount ()I
      // 32: iload 2
      // 33: if_icmpeq 3e
      // 36: goto 3a
      // 39: athrow
      // 3a: goto 47
      // 3d: athrow
      // 3e: aload 7
      // 40: bipush 1
      // 41: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
      // 44: aload 7
      // 46: areturn
      // 47: iinc 6 1
      // 4a: goto 13
      // 4d: goto 51
      // 50: astore 3
      // 51: aconst_null
      // 52: areturn
   }

   private static boolean aaaab(int var0) {
      return true;
   }

   public static void aaaba(aabbbbaaa param0, class_238 param1, Color param2, double param3, float param5) {
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
      // 06: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 09: ifeq 31
      // 0c: aload 1
      // 0d: ifnull 31
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: ifnull 31
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 6
      // 1f: ifne 34
      // 22: goto 26
      // 25: athrow
      // 26: aload 1
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaa (Ljava/lang/Object;Lnet/minecraft/class_238;)Z
      // 2a: ifne 33
      // 2d: goto 31
      // 30: athrow
      // 31: return
      // 32: athrow
      // 33: aload 0
      // 34: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 39: aload 0
      // 3a: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.a ()Lnet/minecraft/class_4597; 1
      // 3f: aload 1
      // 40: aload 2
      // 41: dload 3
      // 42: fload 5
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babaa (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_238;Ljava/awt/Color;DF)V
      // 47: return
   }

   public static void aaabb(
      aabbbbaaa param0, class_243 param1, float param2, float param3, float param4, Color param5, double param6, float param8
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 9
      // 05: aload 0
      // 06: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 09: ifeq 31
      // 0c: aload 1
      // 0d: ifnull 31
      // 10: goto 14
      // 13: athrow
      // 14: fload 2
      // 15: iload 9
      // 17: ifne 2c
      // 1a: goto 1e
      // 1d: athrow
      // 1e: fconst_0
      // 1f: fcmpg
      // 20: ifle 31
      // 23: goto 27
      // 26: athrow
      // 27: fload 3
      // 28: goto 2c
      // 2b: athrow
      // 2c: fconst_0
      // 2d: fcmpg
      // 2e: ifgt 33
      // 31: return
      // 32: athrow
      // 33: aload 1
      // 34: fload 2
      // 35: fload 3
      // 36: fload 4
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aab (Lnet/minecraft/class_243;FFF)[Lnet/minecraft/class_243;
      // 3b: astore 10
      // 3d: fload 8
      // 3f: aload 0
      // 40: aload 10
      // 42: aload 5
      // 44: dload 6
      // 46: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;[Lnet/minecraft/class_243;Ljava/awt/Color;D)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;[Lnet/minecraft/class_243;Ljava/awt/Color;D)V, ()V ]
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bab (FLjava/lang/Runnable;)V
      // 4e: return
   }

   private static Object aabaa(Object param0, Method param1, Object[] param2) {
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
      // 05: ifnull 18
      // 08: aload 1
      // 09: iload 3
      // 0a: ifne 21
      // 0d: goto 11
      // 10: athrow
      // 11: ifnonnull 1b
      // 14: goto 18
      // 17: athrow
      // 18: aconst_null
      // 19: areturn
      // 1a: athrow
      // 1b: aload 1
      // 1c: aload 0
      // 1d: aload 2
      // 1e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 21: areturn
      // 22: astore 4
      // 24: aload 4
      // 26: pop
      // 27: aconst_null
      // 28: areturn
   }

   private static void aabab(aabbbbaaa param0) {
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
      // 09: ifnull 21
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.a ()Lnet/minecraft/class_4597; 1
      // 1a: ifnull 23
      // 1d: goto 21
      // 20: athrow
      // 21: return
      // 22: athrow
      // 23: aload 0
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 27: astore 2
      // 28: aload 2
      // 29: iload 1
      // 2a: ifne 3c
      // 2d: instanceof net/minecraft/class_4597$class_4598
      // 30: ifeq 44
      // 33: goto 37
      // 36: athrow
      // 37: aload 2
      // 38: goto 3c
      // 3b: athrow
      // 3c: checkcast net/minecraft/class_4597$class_4598
      // 3f: astore 3
      // 40: aload 3
      // 41: invokevirtual net/minecraft/class_4597$class_4598.method_22993 ()V
      // 44: return
   }

   public static void aabba(Object param0, class_243 param1, float param2, float param3, float param4, Color param5, double param6, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 9
      // 05: aload 0
      // 06: iload 9
      // 08: ifne 1a
      // 0b: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 0e: ifeq 2f
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 1d: astore 10
      // 1f: aload 10
      // 21: aload 1
      // 22: fload 2
      // 23: fload 3
      // 24: fload 4
      // 26: aload 5
      // 28: dload 6
      // 2a: fload 8
      // 2c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_243;FFFLjava/awt/Color;DF)V
      // 2f: return
   }

   private static String aabbb(int var0, int var1) {
      int var9 = 822949988;
      int var2 = (var0 ^ a(1176327987, var9 ^ -1361188042)) & a(1176327948, var9 ^ -1066728771);
      if (b[var2] == null) {
         char[] var3 = babb[var2].toCharArray();

         int var4 = switch (var3[0] & a(1176327949, var9 ^ -1163201044)) {
            case 0 -> a(1176327950, var9 ^ -940447912);
            case 1 -> a(1176327951, var9 ^ -666931244);
            case 2 -> 2;
            case 3 -> 0;
            case 4 -> a(1176327944, var9 ^ -234840369);
            case 5 -> a(1176327945, var9 ^ -1621492621);
            case 6 -> a(1176327946, var9 ^ -11599784);
            case 7 -> a(1176327947, var9 ^ 860252615);
            case 8 -> a(1176327940, var9 ^ 620903478);
            case 9 -> a(1176327941, var9 ^ -1636827289);
            case 10 -> a(1176327942, var9 ^ -972318725);
            case 11 -> a(1176327943, var9 ^ -457941985);
            case 12 -> a(1176327936, var9 ^ -2066145190);
            case 13 -> a(1176327937, var9 ^ -1221654123);
            case 14 -> a(1176327938, var9 ^ 1696433807);
            case 15 -> a(1176327939, var9 ^ -1003005400);
            case 16 -> a(1176327964, var9 ^ -1260062615);
            case 17 -> a(1176327965, var9 ^ -1547477227);
            case 18 -> a(1176327966, var9 ^ 660886726);
            case 19 -> a(1176327967, var9 ^ -333357386);
            case 20 -> a(1176327960, var9 ^ 663535057);
            case 21 -> a(1176327961, var9 ^ 299108640);
            case 22 -> a(1176327962, var9 ^ -1866829749);
            case 23 -> a(1176327963, var9 ^ -1962244393);
            case 24 -> a(1176327956, var9 ^ -1692789113);
            case 25 -> a(1176327957, var9 ^ -818278509);
            case 26 -> a(1176327958, var9 ^ -662150731);
            case 27 -> a(1176327959, var9 ^ -1976697890);
            case 28 -> a(1176327952, var9 ^ -1846114101);
            case 29 -> a(1176327953, var9 ^ 1906126159);
            case 30 -> a(1176327954, var9 ^ 440826065);
            case 31 -> a(1176327955, var9 ^ -565054815);
            case 32 -> a(1176328044, var9 ^ 1065209994);
            case 33 -> a(1176328045, var9 ^ 582228780);
            case 34 -> a(1176328046, var9 ^ 834618751);
            case 35 -> a(1176328047, var9 ^ -1689260811);
            case 36 -> a(1176328040, var9 ^ 63368504);
            case 37 -> a(1176328041, var9 ^ 1440006961);
            case 38 -> a(1176328042, var9 ^ -1167122320);
            case 39 -> a(1176328043, var9 ^ 1545578298);
            case 40 -> a(1176328036, var9 ^ 959219022);
            case 41 -> a(1176328037, var9 ^ 309801832);
            case 42 -> a(1176328038, var9 ^ 2110546291);
            case 43 -> a(1176328039, var9 ^ 1167726021);
            case 44 -> a(1176328032, var9 ^ 986162887);
            case 45 -> a(1176328033, var9 ^ 1837253521);
            case 46 -> a(1176328034, var9 ^ 1021174995);
            case 47 -> a(1176328035, var9 ^ -579800248);
            case 48 -> a(1176328060, var9 ^ -1680478371);
            case 49 -> a(1176328061, var9 ^ 583071670);
            case 50 -> a(1176328062, var9 ^ -1930365070);
            case 51 -> a(1176328063, var9 ^ 214312680);
            case 52 -> a(1176328056, var9 ^ -538170293);
            case 53 -> a(1176328057, var9 ^ 1767625083);
            case 54 -> a(1176328058, var9 ^ -1722612934);
            case 55 -> a(1176328059, var9 ^ -2049512863);
            case 56 -> a(1176328052, var9 ^ 1588804302);
            case 57 -> a(1176328053, var9 ^ 681714102);
            case 58 -> a(1176328054, var9 ^ 874115836);
            case 59 -> a(1176328055, var9 ^ -602966225);
            case 60 -> a(1176328048, var9 ^ 292843814);
            case 61 -> a(1176328049, var9 ^ 2017647741);
            case 62 -> a(1176328050, var9 ^ -1306862077);
            case 63 -> a(1176328051, var9 ^ -1889670900);
            case 64 -> a(1176328012, var9 ^ -1644903582);
            case 65 -> a(1176328013, var9 ^ -534244996);
            case 66 -> a(1176328014, var9 ^ 1581328520);
            case 67 -> 4;
            case 68 -> a(1176328015, var9 ^ -63598302);
            case 69 -> a(1176328008, var9 ^ 1354408952);
            case 70 -> a(1176328009, var9 ^ 605932047);
            case 71 -> a(1176328010, var9 ^ 514707153);
            case 72 -> a(1176328011, var9 ^ 1286601274);
            case 73 -> 5;
            case 74 -> a(1176328004, var9 ^ 1440101206);
            case 75 -> a(1176328005, var9 ^ 2047520472);
            case 76 -> a(1176328006, var9 ^ -717252476);
            case 77 -> a(1176328007, var9 ^ 2036451237);
            case 78 -> a(1176328000, var9 ^ -1835299220);
            case 79 -> 3;
            case 80 -> a(1176328001, var9 ^ 194543684);
            case 81 -> a(1176328002, var9 ^ -1589496369);
            case 82 -> a(1176328003, var9 ^ 1936999101);
            case 83 -> a(1176328028, var9 ^ 295905586);
            case 84 -> a(1176328029, var9 ^ 494552558);
            case 85 -> a(1176328030, var9 ^ -612504357);
            case 86 -> a(1176328031, var9 ^ -676201370);
            case 87 -> a(1176328024, var9 ^ 1301924174);
            case 88 -> a(1176328025, var9 ^ -1695284459);
            case 89 -> a(1176328026, var9 ^ 90180076);
            case 90 -> a(1176328027, var9 ^ -1086929880);
            case 91 -> a(1176328020, var9 ^ -1791681270);
            case 92 -> a(1176328021, var9 ^ 1250139633);
            case 93 -> a(1176328022, var9 ^ -1870023760);
            case 94 -> a(1176328023, var9 ^ -264098523);
            case 95 -> a(1176328016, var9 ^ 129365049);
            case 96 -> a(1176328017, var9 ^ 100048304);
            case 97 -> a(1176328018, var9 ^ 696192921);
            case 98 -> a(1176328019, var9 ^ 1834348727);
            case 99 -> a(1176328108, var9 ^ 1759472629);
            case 100 -> a(1176328109, var9 ^ -1916210128);
            case 101 -> a(1176328110, var9 ^ 2026057621);
            case 102 -> a(1176328111, var9 ^ -1470681772);
            case 103 -> a(1176328104, var9 ^ 1218247529);
            case 104 -> a(1176328105, var9 ^ -2102268330);
            case 105 -> a(1176328106, var9 ^ 1778160705);
            case 106 -> a(1176328107, var9 ^ -554179781);
            case 107 -> a(1176328100, var9 ^ 615418760);
            case 108 -> a(1176328101, var9 ^ 920784508);
            case 109 -> a(1176328102, var9 ^ -89542564);
            case 110 -> a(1176328103, var9 ^ -670459662);
            case 111 -> a(1176328096, var9 ^ 1384082974);
            case 112 -> a(1176328097, var9 ^ -1958341468);
            case 113 -> a(1176328098, var9 ^ 1549405582);
            case 114 -> a(1176328099, var9 ^ 795998222);
            case 115 -> a(1176328124, var9 ^ -1534984505);
            case 116 -> a(1176328125, var9 ^ 1449906198);
            case 117 -> a(1176328126, var9 ^ -1663558678);
            case 118 -> a(1176328127, var9 ^ 261602692);
            case 119 -> a(1176328120, var9 ^ -1500910372);
            case 120 -> a(1176328121, var9 ^ 1709868372);
            case 121 -> a(1176328122, var9 ^ 1718596989);
            case 122 -> a(1176328123, var9 ^ 2121575542);
            case 123 -> a(1176328116, var9 ^ -1454902053);
            case 124 -> a(1176328117, var9 ^ 524221365);
            case 125 -> a(1176328118, var9 ^ -387371576);
            case 126 -> a(1176328119, var9 ^ -1467583274);
            case 127 -> a(1176328112, var9 ^ 496564974);
            case 128 -> a(1176328113, var9 ^ -290034783);
            case 129 -> a(1176328114, var9 ^ -672936754);
            case 130 -> a(1176328115, var9 ^ 1345130783);
            case 131 -> a(1176328076, var9 ^ -639254878);
            case 132 -> a(1176328077, var9 ^ 409820571);
            case 133 -> a(1176328078, var9 ^ -1074519820);
            case 134 -> a(1176328079, var9 ^ 1919348484);
            case 135 -> a(1176328072, var9 ^ -88688887);
            case 136 -> a(1176328073, var9 ^ -356905174);
            case 137 -> a(1176328074, var9 ^ -738733851);
            case 138 -> a(1176328075, var9 ^ 91631478);
            case 139 -> a(1176328068, var9 ^ 1701645270);
            case 140 -> a(1176328069, var9 ^ -958967610);
            case 141 -> a(1176328070, var9 ^ -689702819);
            case 142 -> a(1176328071, var9 ^ -1871251691);
            case 143 -> a(1176328064, var9 ^ 357259204);
            case 144 -> a(1176328065, var9 ^ 305066982);
            case 145 -> a(1176328066, var9 ^ 478079208);
            case 146 -> a(1176328067, var9 ^ -2056537496);
            case 147 -> a(1176328092, var9 ^ -104795563);
            case 148 -> a(1176328093, var9 ^ -617619550);
            case 149 -> a(1176328094, var9 ^ -707076350);
            case 150 -> a(1176328095, var9 ^ 947282203);
            case 151 -> a(1176328088, var9 ^ -402054417);
            case 152 -> a(1176328089, var9 ^ -294240595);
            case 153 -> a(1176328090, var9 ^ -2118199371);
            case 154 -> a(1176328091, var9 ^ -152938384);
            case 155 -> a(1176328084, var9 ^ 346956137);
            case 156 -> a(1176328085, var9 ^ 1504571794);
            case 157 -> a(1176328086, var9 ^ -1046083704);
            case 158 -> a(1176328087, var9 ^ 1295482987);
            case 159 -> a(1176328080, var9 ^ -1060840037);
            case 160 -> a(1176328081, var9 ^ -222562797);
            case 161 -> a(1176328082, var9 ^ -1416649071);
            case 162 -> a(1176328083, var9 ^ -420051658);
            case 163 -> a(1176328172, var9 ^ 1369762557);
            case 164 -> a(1176328173, var9 ^ -1456415573);
            case 165 -> a(1176328174, var9 ^ 361134248);
            case 166 -> a(1176328175, var9 ^ -940561936);
            case 167 -> a(1176328168, var9 ^ -780673472);
            case 168 -> a(1176328169, var9 ^ -398684592);
            case 169 -> a(1176328170, var9 ^ -1787823320);
            case 170 -> a(1176328171, var9 ^ -1591303103);
            case 171 -> 1;
            case 172 -> a(1176328164, var9 ^ -1235710165);
            case 173 -> a(1176328165, var9 ^ -431449281);
            case 174 -> a(1176328166, var9 ^ 784639273);
            case 175 -> a(1176328167, var9 ^ -841594066);
            case 176 -> a(1176328160, var9 ^ -311707028);
            case 177 -> a(1176328161, var9 ^ -1693758942);
            case 178 -> a(1176328162, var9 ^ -450414842);
            case 179 -> a(1176328163, var9 ^ 938647340);
            case 180 -> a(1176328188, var9 ^ 797962139);
            case 181 -> a(1176328189, var9 ^ 725925245);
            case 182 -> a(1176328190, var9 ^ 578872538);
            case 183 -> a(1176328191, var9 ^ 1344939127);
            case 184 -> a(1176328184, var9 ^ -807438898);
            case 185 -> a(1176328185, var9 ^ 590212553);
            case 186 -> a(1176328186, var9 ^ -77554284);
            case 187 -> a(1176328187, var9 ^ 922652535);
            case 188 -> a(1176328180, var9 ^ -933680345);
            case 189 -> a(1176328181, var9 ^ 700105073);
            case 190 -> a(1176328182, var9 ^ -1004672937);
            case 191 -> a(1176328183, var9 ^ 698079635);
            case 192 -> a(1176328176, var9 ^ -279754270);
            case 193 -> a(1176328177, var9 ^ 1774179462);
            case 194 -> a(1176328178, var9 ^ 481568017);
            case 195 -> a(1176328179, var9 ^ -1020580481);
            case 196 -> a(1176328140, var9 ^ 587915991);
            case 197 -> a(1176328141, var9 ^ -409036896);
            case 198 -> a(1176328142, var9 ^ 1950066079);
            case 199 -> a(1176328143, var9 ^ 1446923730);
            case 200 -> a(1176328136, var9 ^ -412153216);
            case 201 -> a(1176328137, var9 ^ 1120081260);
            case 202 -> a(1176328138, var9 ^ 754271871);
            case 203 -> a(1176328139, var9 ^ -204860452);
            case 204 -> a(1176328132, var9 ^ -1953557929);
            case 205 -> a(1176328133, var9 ^ 720156224);
            case 206 -> a(1176328134, var9 ^ 417493767);
            case 207 -> a(1176328135, var9 ^ -1955719991);
            case 208 -> a(1176328128, var9 ^ 954906967);
            case 209 -> a(1176328129, var9 ^ -148170273);
            case 210 -> a(1176328130, var9 ^ 61069555);
            case 211 -> a(1176328131, var9 ^ 2010772767);
            case 212 -> a(1176328156, var9 ^ -787269787);
            case 213 -> a(1176328157, var9 ^ 75238518);
            case 214 -> a(1176328158, var9 ^ -1264784665);
            case 215 -> a(1176328159, var9 ^ -1533789644);
            case 216 -> a(1176328152, var9 ^ -2098870240);
            case 217 -> a(1176328153, var9 ^ -762484789);
            case 218 -> a(1176328154, var9 ^ -580068851);
            case 219 -> a(1176328155, var9 ^ -264754199);
            case 220 -> a(1176328148, var9 ^ -1835920851);
            case 221 -> a(1176328149, var9 ^ -605406072);
            case 222 -> a(1176328150, var9 ^ -1952866769);
            case 223 -> a(1176328151, var9 ^ 1090474943);
            case 224 -> a(1176328144, var9 ^ 800116513);
            case 225 -> a(1176328145, var9 ^ -7744307);
            case 226 -> a(1176328146, var9 ^ 315640558);
            case 227 -> a(1176328147, var9 ^ -1295721729);
            case 228 -> a(1176327724, var9 ^ 123570465);
            case 229 -> a(1176327725, var9 ^ 966368865);
            case 230 -> a(1176327726, var9 ^ 1910083327);
            case 231 -> a(1176327727, var9 ^ -928400559);
            case 232 -> a(1176327720, var9 ^ 770028416);
            case 233 -> a(1176327721, var9 ^ -583843173);
            case 234 -> a(1176327722, var9 ^ 1606713135);
            case 235 -> a(1176327723, var9 ^ 1440684163);
            case 236 -> a(1176327716, var9 ^ 1068318511);
            case 237 -> a(1176327717, var9 ^ -922151606);
            case 238 -> a(1176327718, var9 ^ -1525604436);
            case 239 -> a(1176327719, var9 ^ -604105861);
            case 240 -> a(1176327712, var9 ^ 426907655);
            case 241 -> a(1176327713, var9 ^ -193620363);
            case 242 -> a(1176327714, var9 ^ 1828323100);
            case 243 -> a(1176327715, var9 ^ 1617527478);
            case 244 -> a(1176327740, var9 ^ 982774196);
            case 245 -> a(1176327741, var9 ^ 1363569093);
            case 246 -> a(1176327742, var9 ^ 1290167369);
            case 247 -> a(1176327743, var9 ^ -1534723190);
            case 248 -> a(1176327736, var9 ^ -1043470547);
            case 249 -> a(1176327737, var9 ^ 1326598546);
            case 250 -> a(1176327738, var9 ^ 1546174646);
            case 251 -> a(1176327739, var9 ^ -289723419);
            case 252 -> a(1176327732, var9 ^ 447573684);
            case 253 -> a(1176327733, var9 ^ 1037646716);
            case 254 -> a(1176327734, var9 ^ 805544438);
            default -> a(1176327735, var9 ^ -645896237);
         };
         int var5 = (var1 & a(1176327728, var9 ^ 193215996)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(1176327729, var9 ^ 1130701804)) >>> a(1176327730, var9 ^ 1910014836)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(1176327731, var9 ^ -1440561627);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(1176327692, var9 ^ -211883698);
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static boolean abaaa(Object param0, class_238 param1) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 17: iload 2
      // 18: ifne 58
      // 1b: ifeq 57
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 26: astore 3
      // 27: aload 3
      // 28: iload 2
      // 29: ifne 3d
      // 2c: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.b ()Lnet/minecraft/class_4604; 1
      // 31: ifnull 51
      // 34: goto 38
      // 37: athrow
      // 38: aload 3
      // 39: goto 3d
      // 3c: athrow
      // 3d: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.b ()Lnet/minecraft/class_4604; 1
      // 42: aload 1
      // 43: invokevirtual net/minecraft/class_4604.method_23093 (Lnet/minecraft/class_238;)Z
      // 46: iload 2
      // 47: ifne 52
      // 4a: ifeq 55
      // 4d: goto 51
      // 50: athrow
      // 51: bipush 1
      // 52: goto 56
      // 55: bipush 0
      // 56: ireturn
      // 57: bipush 1
      // 58: ireturn
   }

   private static void abaab(class_4587 param0, class_4597 param1, class_238 param2, Color param3, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 6
      // 005: aload 0
      // 006: ifnull 019
      // 009: aload 2
      // 00a: ifnull 019
      // 00d: goto 011
      // 010: athrow
      // 011: aload 3
      // 012: ifnonnull 01b
      // 015: goto 019
      // 018: athrow
      // 019: return
      // 01a: athrow
      // 01b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 01e: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 021: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 024: astore 7
      // 026: iload 6
      // 028: aload 7
      // 02a: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
      // 02d: astore 8
      // 02f: aload 2
      // 030: getfield net/minecraft/class_238.field_1323 D
      // 033: aload 8
      // 035: getfield net/minecraft/class_243.field_1352 D
      // 038: dsub
      // 039: d2f
      // 03a: fstore 9
      // 03c: aload 2
      // 03d: getfield net/minecraft/class_238.field_1322 D
      // 040: aload 8
      // 042: getfield net/minecraft/class_243.field_1351 D
      // 045: dsub
      // 046: d2f
      // 047: fstore 10
      // 049: aload 2
      // 04a: getfield net/minecraft/class_238.field_1321 D
      // 04d: aload 8
      // 04f: getfield net/minecraft/class_243.field_1350 D
      // 052: dsub
      // 053: d2f
      // 054: fstore 11
      // 056: aload 2
      // 057: getfield net/minecraft/class_238.field_1320 D
      // 05a: aload 8
      // 05c: getfield net/minecraft/class_243.field_1352 D
      // 05f: dsub
      // 060: d2f
      // 061: fstore 12
      // 063: aload 2
      // 064: getfield net/minecraft/class_238.field_1325 D
      // 067: aload 8
      // 069: getfield net/minecraft/class_243.field_1351 D
      // 06c: dsub
      // 06d: d2f
      // 06e: fstore 13
      // 070: aload 2
      // 071: getfield net/minecraft/class_238.field_1324 D
      // 074: aload 8
      // 076: getfield net/minecraft/class_243.field_1350 D
      // 079: dsub
      // 07a: d2f
      // 07b: fstore 14
      // 07d: aload 3
      // 07e: invokevirtual java/awt/Color.getRed ()I
      // 081: i2f
      // 082: ldc_w 255.0
      // 085: fdiv
      // 086: fstore 15
      // 088: aload 3
      // 089: invokevirtual java/awt/Color.getGreen ()I
      // 08c: i2f
      // 08d: ldc_w 255.0
      // 090: fdiv
      // 091: fstore 16
      // 093: aload 3
      // 094: invokevirtual java/awt/Color.getBlue ()I
      // 097: i2f
      // 098: ldc_w 255.0
      // 09b: fdiv
      // 09c: fstore 17
      // 09e: dload 4
      // 0a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baab (D)I
      // 0a3: i2f
      // 0a4: ldc_w 255.0
      // 0a7: fdiv
      // 0a8: fstore 18
      // 0aa: aload 0
      // 0ab: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0ae: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 0b1: astore 19
      // 0b3: ifne 3a7
      // 0b6: aload 1
      // 0b7: ifnull 382
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: aload 1
      // 0bf: invokestatic net/minecraft/class_12249.method_76023 ()Lnet/minecraft/class_1921;
      // 0c2: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 0c7: astore 20
      // 0c9: aload 20
      // 0cb: aload 19
      // 0cd: fload 9
      // 0cf: fload 10
      // 0d1: fload 11
      // 0d3: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 0d8: fload 15
      // 0da: fload 16
      // 0dc: fload 17
      // 0de: fload 18
      // 0e0: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 0e5: pop
      // 0e6: aload 20
      // 0e8: aload 19
      // 0ea: fload 12
      // 0ec: fload 10
      // 0ee: fload 11
      // 0f0: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 0f5: fload 15
      // 0f7: fload 16
      // 0f9: fload 17
      // 0fb: fload 18
      // 0fd: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 102: pop
      // 103: aload 20
      // 105: aload 19
      // 107: fload 12
      // 109: fload 13
      // 10b: fload 11
      // 10d: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 112: fload 15
      // 114: fload 16
      // 116: fload 17
      // 118: fload 18
      // 11a: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 11f: pop
      // 120: aload 20
      // 122: aload 19
      // 124: fload 9
      // 126: fload 13
      // 128: fload 11
      // 12a: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 12f: fload 15
      // 131: fload 16
      // 133: fload 17
      // 135: fload 18
      // 137: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 13c: pop
      // 13d: aload 20
      // 13f: aload 19
      // 141: fload 9
      // 143: fload 10
      // 145: fload 14
      // 147: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 14c: fload 15
      // 14e: fload 16
      // 150: fload 17
      // 152: fload 18
      // 154: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 159: pop
      // 15a: aload 20
      // 15c: aload 19
      // 15e: fload 9
      // 160: fload 13
      // 162: fload 14
      // 164: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 169: fload 15
      // 16b: fload 16
      // 16d: fload 17
      // 16f: fload 18
      // 171: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 176: pop
      // 177: aload 20
      // 179: aload 19
      // 17b: fload 12
      // 17d: fload 13
      // 17f: fload 14
      // 181: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 186: fload 15
      // 188: fload 16
      // 18a: fload 17
      // 18c: fload 18
      // 18e: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 193: pop
      // 194: aload 20
      // 196: aload 19
      // 198: fload 12
      // 19a: fload 10
      // 19c: fload 14
      // 19e: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1a3: fload 15
      // 1a5: fload 16
      // 1a7: fload 17
      // 1a9: fload 18
      // 1ab: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1b0: pop
      // 1b1: aload 20
      // 1b3: aload 19
      // 1b5: fload 9
      // 1b7: fload 10
      // 1b9: fload 11
      // 1bb: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1c0: fload 15
      // 1c2: fload 16
      // 1c4: fload 17
      // 1c6: fload 18
      // 1c8: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1cd: pop
      // 1ce: aload 20
      // 1d0: aload 19
      // 1d2: fload 9
      // 1d4: fload 10
      // 1d6: fload 14
      // 1d8: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1dd: fload 15
      // 1df: fload 16
      // 1e1: fload 17
      // 1e3: fload 18
      // 1e5: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1ea: pop
      // 1eb: aload 20
      // 1ed: aload 19
      // 1ef: fload 12
      // 1f1: fload 10
      // 1f3: fload 14
      // 1f5: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1fa: fload 15
      // 1fc: fload 16
      // 1fe: fload 17
      // 200: fload 18
      // 202: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 207: pop
      // 208: aload 20
      // 20a: aload 19
      // 20c: fload 12
      // 20e: fload 10
      // 210: fload 11
      // 212: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 217: fload 15
      // 219: fload 16
      // 21b: fload 17
      // 21d: fload 18
      // 21f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 224: pop
      // 225: aload 20
      // 227: aload 19
      // 229: fload 9
      // 22b: fload 13
      // 22d: fload 11
      // 22f: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 234: fload 15
      // 236: fload 16
      // 238: fload 17
      // 23a: fload 18
      // 23c: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 241: pop
      // 242: aload 20
      // 244: aload 19
      // 246: fload 12
      // 248: fload 13
      // 24a: fload 11
      // 24c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 251: fload 15
      // 253: fload 16
      // 255: fload 17
      // 257: fload 18
      // 259: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 25e: pop
      // 25f: aload 20
      // 261: aload 19
      // 263: fload 12
      // 265: fload 13
      // 267: fload 14
      // 269: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 26e: fload 15
      // 270: fload 16
      // 272: fload 17
      // 274: fload 18
      // 276: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 27b: pop
      // 27c: aload 20
      // 27e: aload 19
      // 280: fload 9
      // 282: fload 13
      // 284: fload 14
      // 286: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 28b: fload 15
      // 28d: fload 16
      // 28f: fload 17
      // 291: fload 18
      // 293: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 298: pop
      // 299: aload 20
      // 29b: aload 19
      // 29d: fload 9
      // 29f: fload 10
      // 2a1: fload 11
      // 2a3: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2a8: fload 15
      // 2aa: fload 16
      // 2ac: fload 17
      // 2ae: fload 18
      // 2b0: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2b5: pop
      // 2b6: aload 20
      // 2b8: aload 19
      // 2ba: fload 9
      // 2bc: fload 13
      // 2be: fload 11
      // 2c0: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2c5: fload 15
      // 2c7: fload 16
      // 2c9: fload 17
      // 2cb: fload 18
      // 2cd: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2d2: pop
      // 2d3: aload 20
      // 2d5: aload 19
      // 2d7: fload 9
      // 2d9: fload 13
      // 2db: fload 14
      // 2dd: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2e2: fload 15
      // 2e4: fload 16
      // 2e6: fload 17
      // 2e8: fload 18
      // 2ea: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2ef: pop
      // 2f0: aload 20
      // 2f2: aload 19
      // 2f4: fload 9
      // 2f6: fload 10
      // 2f8: fload 14
      // 2fa: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2ff: fload 15
      // 301: fload 16
      // 303: fload 17
      // 305: fload 18
      // 307: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 30c: pop
      // 30d: aload 20
      // 30f: aload 19
      // 311: fload 12
      // 313: fload 10
      // 315: fload 11
      // 317: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 31c: fload 15
      // 31e: fload 16
      // 320: fload 17
      // 322: fload 18
      // 324: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 329: pop
      // 32a: aload 20
      // 32c: aload 19
      // 32e: fload 12
      // 330: fload 10
      // 332: fload 14
      // 334: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 339: fload 15
      // 33b: fload 16
      // 33d: fload 17
      // 33f: fload 18
      // 341: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 346: pop
      // 347: aload 20
      // 349: aload 19
      // 34b: fload 12
      // 34d: fload 13
      // 34f: fload 14
      // 351: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 356: fload 15
      // 358: fload 16
      // 35a: fload 17
      // 35c: fload 18
      // 35e: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 363: pop
      // 364: aload 20
      // 366: aload 19
      // 368: fload 12
      // 36a: fload 13
      // 36c: fload 11
      // 36e: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 373: fload 15
      // 375: fload 16
      // 377: fload 17
      // 379: fload 18
      // 37b: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 380: pop
      // 381: return
      // 382: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ba Ljava/lang/reflect/Method;
      // 385: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 388: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaa Ljava/lang/reflect/Method;
      // 38b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 38e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaa Ljava/lang/reflect/Method;
      // 391: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 394: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babbb ()V
      // 397: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbba Ljava/lang/reflect/Method;
      // 39a: bipush 1
      // 39b: anewarray 4
      // 39e: dup
      // 39f: bipush 0
      // 3a0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aa Ljava/lang/Object;
      // 3a3: aastore
      // 3a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 3a7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abba Ljava/lang/reflect/Method;
      // 3aa: bipush 0
      // 3ab: anewarray 4
      // 3ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babb (Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3b1: astore 20
      // 3b3: iload 6
      // 3b5: aload 20
      // 3b7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baa Ljava/lang/reflect/Method;
      // 3ba: bipush 2
      // 3bb: anewarray 4
      // 3be: dup
      // 3bf: bipush 0
      // 3c0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbab Ljava/lang/Object;
      // 3c3: aastore
      // 3c4: dup
      // 3c5: bipush 1
      // 3c6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbb Ljava/lang/Object;
      // 3c9: aastore
      // 3ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaa (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3cd: checkcast net/minecraft/class_4588
      // 3d0: astore 21
      // 3d2: ifne 6a6
      // 3d5: aload 21
      // 3d7: ifnonnull 3ee
      // 3da: goto 3de
      // 3dd: athrow
      // 3de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 3e1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 3e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 3e7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 3ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 3ed: return
      // 3ee: aload 21
      // 3f0: aload 19
      // 3f2: fload 9
      // 3f4: fload 10
      // 3f6: fload 11
      // 3f8: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 3fd: fload 15
      // 3ff: fload 16
      // 401: fload 17
      // 403: fload 18
      // 405: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 40a: pop
      // 40b: aload 21
      // 40d: aload 19
      // 40f: fload 12
      // 411: fload 10
      // 413: fload 11
      // 415: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 41a: fload 15
      // 41c: fload 16
      // 41e: fload 17
      // 420: fload 18
      // 422: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 427: pop
      // 428: aload 21
      // 42a: aload 19
      // 42c: fload 12
      // 42e: fload 13
      // 430: fload 11
      // 432: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 437: fload 15
      // 439: fload 16
      // 43b: fload 17
      // 43d: fload 18
      // 43f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 444: pop
      // 445: aload 21
      // 447: aload 19
      // 449: fload 9
      // 44b: fload 13
      // 44d: fload 11
      // 44f: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 454: fload 15
      // 456: fload 16
      // 458: fload 17
      // 45a: fload 18
      // 45c: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 461: pop
      // 462: aload 21
      // 464: aload 19
      // 466: fload 9
      // 468: fload 10
      // 46a: fload 14
      // 46c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 471: fload 15
      // 473: fload 16
      // 475: fload 17
      // 477: fload 18
      // 479: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 47e: pop
      // 47f: aload 21
      // 481: aload 19
      // 483: fload 9
      // 485: fload 13
      // 487: fload 14
      // 489: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 48e: fload 15
      // 490: fload 16
      // 492: fload 17
      // 494: fload 18
      // 496: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 49b: pop
      // 49c: aload 21
      // 49e: aload 19
      // 4a0: fload 12
      // 4a2: fload 13
      // 4a4: fload 14
      // 4a6: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 4ab: fload 15
      // 4ad: fload 16
      // 4af: fload 17
      // 4b1: fload 18
      // 4b3: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 4b8: pop
      // 4b9: aload 21
      // 4bb: aload 19
      // 4bd: fload 12
      // 4bf: fload 10
      // 4c1: fload 14
      // 4c3: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 4c8: fload 15
      // 4ca: fload 16
      // 4cc: fload 17
      // 4ce: fload 18
      // 4d0: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 4d5: pop
      // 4d6: aload 21
      // 4d8: aload 19
      // 4da: fload 9
      // 4dc: fload 10
      // 4de: fload 11
      // 4e0: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 4e5: fload 15
      // 4e7: fload 16
      // 4e9: fload 17
      // 4eb: fload 18
      // 4ed: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 4f2: pop
      // 4f3: aload 21
      // 4f5: aload 19
      // 4f7: fload 9
      // 4f9: fload 10
      // 4fb: fload 14
      // 4fd: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 502: fload 15
      // 504: fload 16
      // 506: fload 17
      // 508: fload 18
      // 50a: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 50f: pop
      // 510: aload 21
      // 512: aload 19
      // 514: fload 12
      // 516: fload 10
      // 518: fload 14
      // 51a: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 51f: fload 15
      // 521: fload 16
      // 523: fload 17
      // 525: fload 18
      // 527: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 52c: pop
      // 52d: aload 21
      // 52f: aload 19
      // 531: fload 12
      // 533: fload 10
      // 535: fload 11
      // 537: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 53c: fload 15
      // 53e: fload 16
      // 540: fload 17
      // 542: fload 18
      // 544: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 549: pop
      // 54a: aload 21
      // 54c: aload 19
      // 54e: fload 9
      // 550: fload 13
      // 552: fload 11
      // 554: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 559: fload 15
      // 55b: fload 16
      // 55d: fload 17
      // 55f: fload 18
      // 561: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 566: pop
      // 567: aload 21
      // 569: aload 19
      // 56b: fload 12
      // 56d: fload 13
      // 56f: fload 11
      // 571: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 576: fload 15
      // 578: fload 16
      // 57a: fload 17
      // 57c: fload 18
      // 57e: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 583: pop
      // 584: aload 21
      // 586: aload 19
      // 588: fload 12
      // 58a: fload 13
      // 58c: fload 14
      // 58e: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 593: fload 15
      // 595: fload 16
      // 597: fload 17
      // 599: fload 18
      // 59b: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 5a0: pop
      // 5a1: aload 21
      // 5a3: aload 19
      // 5a5: fload 9
      // 5a7: fload 13
      // 5a9: fload 14
      // 5ab: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 5b0: fload 15
      // 5b2: fload 16
      // 5b4: fload 17
      // 5b6: fload 18
      // 5b8: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 5bd: pop
      // 5be: aload 21
      // 5c0: aload 19
      // 5c2: fload 9
      // 5c4: fload 10
      // 5c6: fload 11
      // 5c8: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 5cd: fload 15
      // 5cf: fload 16
      // 5d1: fload 17
      // 5d3: fload 18
      // 5d5: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 5da: pop
      // 5db: aload 21
      // 5dd: aload 19
      // 5df: fload 9
      // 5e1: fload 13
      // 5e3: fload 11
      // 5e5: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 5ea: fload 15
      // 5ec: fload 16
      // 5ee: fload 17
      // 5f0: fload 18
      // 5f2: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 5f7: pop
      // 5f8: aload 21
      // 5fa: aload 19
      // 5fc: fload 9
      // 5fe: fload 13
      // 600: fload 14
      // 602: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 607: fload 15
      // 609: fload 16
      // 60b: fload 17
      // 60d: fload 18
      // 60f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 614: pop
      // 615: aload 21
      // 617: aload 19
      // 619: fload 9
      // 61b: fload 10
      // 61d: fload 14
      // 61f: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 624: fload 15
      // 626: fload 16
      // 628: fload 17
      // 62a: fload 18
      // 62c: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 631: pop
      // 632: aload 21
      // 634: aload 19
      // 636: fload 12
      // 638: fload 10
      // 63a: fload 11
      // 63c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 641: fload 15
      // 643: fload 16
      // 645: fload 17
      // 647: fload 18
      // 649: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 64e: pop
      // 64f: aload 21
      // 651: aload 19
      // 653: fload 12
      // 655: fload 10
      // 657: fload 14
      // 659: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 65e: fload 15
      // 660: fload 16
      // 662: fload 17
      // 664: fload 18
      // 666: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 66b: pop
      // 66c: aload 21
      // 66e: aload 19
      // 670: fload 12
      // 672: fload 13
      // 674: fload 14
      // 676: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 67b: fload 15
      // 67d: fload 16
      // 67f: fload 17
      // 681: fload 18
      // 683: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 688: pop
      // 689: aload 21
      // 68b: aload 19
      // 68d: fload 12
      // 68f: fload 13
      // 691: fload 11
      // 693: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 698: fload 15
      // 69a: fload 16
      // 69c: fload 17
      // 69e: fload 18
      // 6a0: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 6a5: pop
      // 6a6: aload 21
      // 6a8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abbb Ljava/lang/reflect/Method;
      // 6ab: bipush 0
      // 6ac: anewarray 4
      // 6af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaa (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 6b2: astore 22
      // 6b4: iload 6
      // 6b6: ifne 6e4
      // 6b9: aload 22
      // 6bb: ifnull 6d5
      // 6be: goto 6c2
      // 6c1: athrow
      // 6c2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaab Ljava/lang/reflect/Method;
      // 6c5: bipush 1
      // 6c6: anewarray 4
      // 6c9: dup
      // 6ca: bipush 0
      // 6cb: aload 22
      // 6cd: aastore
      // 6ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 6d1: goto 6d5
      // 6d4: athrow
      // 6d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 6d8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 6db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 6de: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 6e1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 6e4: goto 6fb
      // 6e7: astore 23
      // 6e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 6ec: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 6ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 6f2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 6f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 6f8: aload 23
      // 6fa: athrow
      // 6fb: return
   }

   private static Method ababa(String param0, String param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 04: astore 3
      // 05: aload 3
      // 06: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 09: astore 4
      // 0b: aload 4
      // 0d: arraylength
      // 0e: istore 5
      // 10: bipush 0
      // 11: istore 6
      // 13: iload 6
      // 15: iload 5
      // 17: if_icmpge 52
      // 1a: aload 4
      // 1c: iload 6
      // 1e: aaload
      // 1f: astore 7
      // 21: aload 7
      // 23: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 26: aload 1
      // 27: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a: ifeq 4c
      // 2d: aload 7
      // 2f: invokevirtual java/lang/reflect/Method.getParameterCount ()I
      // 32: iload 2
      // 33: if_icmpne 4c
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 7
      // 3c: invokevirtual java/lang/reflect/Method.getModifiers ()I
      // 3f: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 42: ifne 4c
      // 45: goto 49
      // 48: athrow
      // 49: aload 7
      // 4b: areturn
      // 4c: iinc 6 1
      // 4f: goto 13
      // 52: goto 56
      // 55: astore 3
      // 56: aconst_null
      // 57: areturn
   }

   public static void ababb(aabbbbaaa param0, class_2338 param1, Color param2, double param3) {
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
      // 06: iload 5
      // 08: ifne 18
      // 0b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 0e: ifne 17
      // 11: goto 15
      // 14: athrow
      // 15: return
      // 16: athrow
      // 17: aload 0
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaab (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 1b: astore 6
      // 1d: ldc_w 0.06
      // 20: fstore 7
      // 22: aload 1
      // 23: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 26: i2d
      // 27: aload 6
      // 29: getfield net/minecraft/class_243.field_1352 D
      // 2c: dsub
      // 2d: d2f
      // 2e: fload 7
      // 30: fadd
      // 31: fstore 8
      // 33: aload 1
      // 34: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 37: i2d
      // 38: aload 6
      // 3a: getfield net/minecraft/class_243.field_1351 D
      // 3d: dsub
      // 3e: d2f
      // 3f: ldc_w 0.02
      // 42: fadd
      // 43: fstore 9
      // 45: aload 1
      // 46: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 49: i2d
      // 4a: aload 6
      // 4c: getfield net/minecraft/class_243.field_1350 D
      // 4f: dsub
      // 50: d2f
      // 51: fload 7
      // 53: fadd
      // 54: fstore 10
      // 56: aload 1
      // 57: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 5a: i2d
      // 5b: aload 6
      // 5d: getfield net/minecraft/class_243.field_1352 D
      // 60: dsub
      // 61: dconst_1
      // 62: dadd
      // 63: d2f
      // 64: fload 7
      // 66: fsub
      // 67: fstore 11
      // 69: aload 1
      // 6a: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 6d: i2d
      // 6e: aload 6
      // 70: getfield net/minecraft/class_243.field_1350 D
      // 73: dsub
      // 74: dconst_1
      // 75: dadd
      // 76: d2f
      // 77: fload 7
      // 79: fsub
      // 7a: fstore 12
      // 7c: aload 0
      // 7d: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 82: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 85: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 88: astore 13
      // 8a: aload 0
      // 8b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 8e: invokestatic net/minecraft/class_12249.method_76023 ()Lnet/minecraft/class_1921;
      // 91: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 96: astore 14
      // 98: aload 14
      // 9a: aload 13
      // 9c: fload 8
      // 9e: fload 9
      // a0: fload 10
      // a2: fload 11
      // a4: fload 12
      // a6: aload 2
      // a7: dload 3
      // a8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.b (Lnet/minecraft/class_4588;Lorg/joml/Matrix4f;FFFFFLjava/awt/Color;D)V
      // ab: return
   }

   public static void abbaa(Object param0, class_238 param1, Color param2, double param3) {
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
      // 06: iload 5
      // 08: ifne 1a
      // 0b: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 0e: ifeq 27
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 1d: astore 6
      // 1f: aload 6
      // 21: aload 1
      // 22: aload 2
      // 23: dload 3
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbbaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_238;Ljava/awt/Color;D)V
      // 27: return
   }

   public static void abbab(
      aabbbbaaa param0, class_243 param1, class_243 param2, class_243 param3, Color param4, double param5
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
      // 005: aload 0
      // 006: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 009: ifeq 037
      // 00c: aload 1
      // 00d: iload 7
      // 00f: ifne 01e
      // 012: goto 016
      // 015: athrow
      // 016: ifnull 037
      // 019: goto 01d
      // 01c: athrow
      // 01d: aload 2
      // 01e: iload 7
      // 020: ifne 02b
      // 023: ifnull 037
      // 026: goto 02a
      // 029: athrow
      // 02a: aload 3
      // 02b: ifnull 037
      // 02e: aload 4
      // 030: ifnonnull 039
      // 033: goto 037
      // 036: athrow
      // 037: return
      // 038: athrow
      // 039: aload 0
      // 03a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaab (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 03d: astore 8
      // 03f: aload 0
      // 040: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 045: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 048: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 04b: astore 9
      // 04d: aload 0
      // 04e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 051: invokestatic net/minecraft/class_12249.method_76023 ()Lnet/minecraft/class_1921;
      // 054: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 059: astore 10
      // 05b: aload 4
      // 05d: invokevirtual java/awt/Color.getRed ()I
      // 060: i2f
      // 061: ldc_w 255.0
      // 064: fdiv
      // 065: fstore 11
      // 067: aload 4
      // 069: invokevirtual java/awt/Color.getGreen ()I
      // 06c: i2f
      // 06d: ldc_w 255.0
      // 070: fdiv
      // 071: fstore 12
      // 073: aload 4
      // 075: invokevirtual java/awt/Color.getBlue ()I
      // 078: i2f
      // 079: ldc_w 255.0
      // 07c: fdiv
      // 07d: fstore 13
      // 07f: dload 5
      // 081: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baab (D)I
      // 084: i2f
      // 085: ldc_w 255.0
      // 088: fdiv
      // 089: fstore 14
      // 08b: aload 10
      // 08d: aload 9
      // 08f: aload 1
      // 090: getfield net/minecraft/class_243.field_1352 D
      // 093: aload 8
      // 095: getfield net/minecraft/class_243.field_1352 D
      // 098: dsub
      // 099: d2f
      // 09a: aload 1
      // 09b: getfield net/minecraft/class_243.field_1351 D
      // 09e: aload 8
      // 0a0: getfield net/minecraft/class_243.field_1351 D
      // 0a3: dsub
      // 0a4: d2f
      // 0a5: aload 1
      // 0a6: getfield net/minecraft/class_243.field_1350 D
      // 0a9: aload 8
      // 0ab: getfield net/minecraft/class_243.field_1350 D
      // 0ae: dsub
      // 0af: d2f
      // 0b0: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 0b5: fload 11
      // 0b7: fload 12
      // 0b9: fload 13
      // 0bb: fload 14
      // 0bd: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 0c2: pop
      // 0c3: aload 10
      // 0c5: aload 9
      // 0c7: aload 2
      // 0c8: getfield net/minecraft/class_243.field_1352 D
      // 0cb: aload 8
      // 0cd: getfield net/minecraft/class_243.field_1352 D
      // 0d0: dsub
      // 0d1: d2f
      // 0d2: aload 2
      // 0d3: getfield net/minecraft/class_243.field_1351 D
      // 0d6: aload 8
      // 0d8: getfield net/minecraft/class_243.field_1351 D
      // 0db: dsub
      // 0dc: d2f
      // 0dd: aload 2
      // 0de: getfield net/minecraft/class_243.field_1350 D
      // 0e1: aload 8
      // 0e3: getfield net/minecraft/class_243.field_1350 D
      // 0e6: dsub
      // 0e7: d2f
      // 0e8: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 0ed: fload 11
      // 0ef: fload 12
      // 0f1: fload 13
      // 0f3: fload 14
      // 0f5: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 0fa: pop
      // 0fb: aload 10
      // 0fd: aload 9
      // 0ff: aload 3
      // 100: getfield net/minecraft/class_243.field_1352 D
      // 103: aload 8
      // 105: getfield net/minecraft/class_243.field_1352 D
      // 108: dsub
      // 109: d2f
      // 10a: aload 3
      // 10b: getfield net/minecraft/class_243.field_1351 D
      // 10e: aload 8
      // 110: getfield net/minecraft/class_243.field_1351 D
      // 113: dsub
      // 114: d2f
      // 115: aload 3
      // 116: getfield net/minecraft/class_243.field_1350 D
      // 119: aload 8
      // 11b: getfield net/minecraft/class_243.field_1350 D
      // 11e: dsub
      // 11f: d2f
      // 120: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 125: fload 11
      // 127: fload 12
      // 129: fload 13
      // 12b: fload 14
      // 12d: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 132: pop
      // 133: aload 10
      // 135: aload 9
      // 137: aload 1
      // 138: getfield net/minecraft/class_243.field_1352 D
      // 13b: aload 8
      // 13d: getfield net/minecraft/class_243.field_1352 D
      // 140: dsub
      // 141: d2f
      // 142: aload 1
      // 143: getfield net/minecraft/class_243.field_1351 D
      // 146: aload 8
      // 148: getfield net/minecraft/class_243.field_1351 D
      // 14b: dsub
      // 14c: d2f
      // 14d: aload 1
      // 14e: getfield net/minecraft/class_243.field_1350 D
      // 151: aload 8
      // 153: getfield net/minecraft/class_243.field_1350 D
      // 156: dsub
      // 157: d2f
      // 158: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 15d: fload 11
      // 15f: fload 12
      // 161: fload 13
      // 163: fload 14
      // 165: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 16a: pop
      // 16b: return
   }

   public static void abbba(
      aabbbbaaa param0, Matrix4f param1, float param2, float param3, float param4, float param5, int param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -56481424
      // 003: istore 14
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 7
      // 00a: iload 6
      // 00c: ldc_w 1176327693
      // 00f: iload 14
      // 011: ldc_w 1918945056
      // 014: ixor
      // 015: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 018: ldc2_w 1870077572757942372
      // 01b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 01e: iushr
      // 01f: ldc_w 1176327694
      // 022: iload 14
      // 024: ldc_w 348927028
      // 027: ixor
      // 028: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 02b: ldc2_w 345831143669751952
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 031: iand
      // 032: istore 8
      // 034: aload 0
      // 035: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 038: ifeq 079
      // 03b: aload 1
      // 03c: ifnull 079
      // 03f: goto 043
      // 042: athrow
      // 043: iload 8
      // 045: iload 7
      // 047: ifne 066
      // 04a: goto 04e
      // 04d: athrow
      // 04e: ifle 079
      // 051: goto 055
      // 054: athrow
      // 055: fload 4
      // 057: iload 7
      // 059: ifne 06b
      // 05c: goto 060
      // 05f: athrow
      // 060: fload 2
      // 061: fcmpg
      // 062: goto 066
      // 065: athrow
      // 066: ifle 079
      // 069: fload 5
      // 06b: iload 7
      // 06d: ifne 0a8
      // 070: fload 3
      // 071: fcmpg
      // 072: ifgt 07b
      // 075: goto 079
      // 078: athrow
      // 079: return
      // 07a: athrow
      // 07b: iload 6
      // 07d: ldc_w 1176327695
      // 080: iload 14
      // 082: ldc_w -1719522359
      // 085: ixor
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 089: ldc2_w 2831087545420420755
      // 08c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 08f: ishr
      // 090: ldc_w 1176327688
      // 093: iload 14
      // 095: ldc_w -897978104
      // 098: ixor
      // 099: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 09c: ldc2_w 345831143669751952
      // 09f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0a2: iand
      // 0a3: i2f
      // 0a4: ldc_w 255.0
      // 0a7: fdiv
      // 0a8: fstore 9
      // 0aa: iload 6
      // 0ac: ldc_w 1176327689
      // 0af: iload 14
      // 0b1: ldc_w -1725325200
      // 0b4: ixor
      // 0b5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0b8: ldc2_w 6259397949108581650
      // 0bb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0be: ishr
      // 0bf: ldc_w 1176327690
      // 0c2: iload 14
      // 0c4: ldc_w -1538639040
      // 0c7: ixor
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0cb: ldc2_w 345831143669751952
      // 0ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0d1: iand
      // 0d2: i2f
      // 0d3: ldc_w 255.0
      // 0d6: fdiv
      // 0d7: fstore 10
      // 0d9: iload 6
      // 0db: ldc_w 1176327691
      // 0de: iload 14
      // 0e0: ldc_w 957580338
      // 0e3: ixor
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0e7: ldc2_w 345831143669751952
      // 0ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0ed: iand
      // 0ee: i2f
      // 0ef: ldc_w 255.0
      // 0f2: fdiv
      // 0f3: fstore 11
      // 0f5: iload 8
      // 0f7: i2f
      // 0f8: ldc_w 255.0
      // 0fb: fdiv
      // 0fc: fstore 12
      // 0fe: aload 0
      // 0ff: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 102: invokestatic net/minecraft/class_12249.method_76023 ()Lnet/minecraft/class_1921;
      // 105: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 10a: astore 13
      // 10c: aload 13
      // 10e: aload 1
      // 10f: fload 2
      // 110: fload 3
      // 111: fconst_0
      // 112: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 117: fload 9
      // 119: fload 10
      // 11b: fload 11
      // 11d: fload 12
      // 11f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 124: pop
      // 125: aload 13
      // 127: aload 1
      // 128: fload 2
      // 129: fload 5
      // 12b: fconst_0
      // 12c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 131: fload 9
      // 133: fload 10
      // 135: fload 11
      // 137: fload 12
      // 139: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 13e: pop
      // 13f: aload 13
      // 141: aload 1
      // 142: fload 4
      // 144: fload 5
      // 146: fconst_0
      // 147: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 14c: fload 9
      // 14e: fload 10
      // 150: fload 11
      // 152: fload 12
      // 154: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 159: pop
      // 15a: aload 13
      // 15c: aload 1
      // 15d: fload 4
      // 15f: fload 3
      // 160: fconst_0
      // 161: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 166: fload 9
      // 168: fload 10
      // 16a: fload 11
      // 16c: fload 12
      // 16e: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 173: pop
      // 174: return
   }

   private static float abbbb() {
      return ababaa(aaaa);
   }

   public static void baaaa(aabbbbaaa param0, String param1, class_243 param2, Color param3, double param4, boolean param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 7
      // 005: aload 0
      // 006: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 009: ifne 00e
      // 00c: return
      // 00d: athrow
      // 00e: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 011: astore 8
      // 013: aload 8
      // 015: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 018: astore 9
      // 01a: aload 0
      // 01b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 01e: astore 10
      // 020: aload 9
      // 022: ifnull 02e
      // 025: aload 10
      // 027: ifnonnull 030
      // 02a: goto 02e
      // 02d: athrow
      // 02e: return
      // 02f: athrow
      // 030: aload 0
      // 031: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaab (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 034: astore 11
      // 036: ldc_w 1176327684
      // 039: ldc_w 774590187
      // 03c: ldc_w -315356322
      // 03f: ixor
      // 040: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 043: aload 8
      // 045: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 048: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 04b: astore 12
      // 04d: ldc2_w 7854791707595472852
      // 050: aload 0
      // 051: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 056: invokevirtual net/minecraft/class_4587.method_22903 ()V
      // 059: aload 0
      // 05a: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 05f: aload 2
      // 060: getfield net/minecraft/class_243.field_1352 D
      // 063: aload 11
      // 065: getfield net/minecraft/class_243.field_1352 D
      // 068: dsub
      // 069: aload 2
      // 06a: getfield net/minecraft/class_243.field_1351 D
      // 06d: aload 11
      // 06f: getfield net/minecraft/class_243.field_1351 D
      // 072: dsub
      // 073: aload 2
      // 074: getfield net/minecraft/class_243.field_1350 D
      // 077: aload 11
      // 079: getfield net/minecraft/class_243.field_1350 D
      // 07c: dsub
      // 07d: invokevirtual net/minecraft/class_4587.method_22904 (DDD)V
      // 080: aload 0
      // 081: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 086: getstatic net/minecraft/class_7833.field_40716 Lnet/minecraft/class_7833;
      // 089: aload 12
      // 08b: invokevirtual net/minecraft/class_4184.method_19330 ()F
      // 08e: fneg
      // 08f: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
      // 094: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
      // 097: aload 0
      // 098: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 09d: getstatic net/minecraft/class_7833.field_40714 Lnet/minecraft/class_7833;
      // 0a0: aload 12
      // 0a2: invokevirtual net/minecraft/class_4184.method_19329 ()F
      // 0a5: invokeinterface net/minecraft/class_7833.rotationDegrees (F)Lorg/joml/Quaternionf; 2
      // 0aa: invokevirtual net/minecraft/class_4587.method_22907 (Lorg/joml/Quaternionfc;)V
      // 0ad: ldc2_w 0.025
      // 0b0: dload 4
      // 0b2: dmul
      // 0b3: d2f
      // 0b4: fstore 13
      // 0b6: aload 0
      // 0b7: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 0bc: fload 13
      // 0be: fneg
      // 0bf: fload 13
      // 0c1: fneg
      // 0c2: fload 13
      // 0c4: invokevirtual net/minecraft/class_4587.method_22905 (FFF)V
      // 0c7: aload 0
      // 0c8: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 0cd: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0d0: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 0d3: astore 14
      // 0d5: aload 9
      // 0d7: aload 1
      // 0d8: invokevirtual net/minecraft/class_327.method_1727 (Ljava/lang/String;)I
      // 0db: ineg
      // 0dc: i2f
      // 0dd: fconst_2
      // 0de: fdiv
      // 0df: fstore 15
      // 0e1: aload 9
      // 0e3: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e6: pop
      // 0e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0ea: ineg
      // 0eb: i2f
      // 0ec: fconst_2
      // 0ed: fdiv
      // 0ee: fstore 16
      // 0f0: aload 3
      // 0f1: aload 3
      // 0f2: invokevirtual java/awt/Color.getAlpha ()I
      // 0f5: i2d
      // 0f6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abab (Ljava/awt/Color;D)I
      // 0f9: istore 17
      // 0fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab.abbba ()Z
      // 0fe: iload 7
      // 100: ifne 124
      // 103: ifeq 1c9
      // 106: goto 10a
      // 109: athrow
      // 10a: iload 17
      // 10c: ldc_w 1176327685
      // 10f: ldc_w 774590187
      // 112: ldc_w -654950387
      // 115: ixor
      // 116: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 119: ldc2_w 9001171167018045174
      // 11c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 11f: iand
      // 120: goto 124
      // 123: athrow
      // 124: ifeq 1c9
      // 127: fload 15
      // 129: fstore 18
      // 12b: bipush 0
      // 12c: istore 19
      // 12e: bipush 0
      // 12f: istore 20
      // 131: iload 20
      // 133: aload 1
      // 134: invokevirtual java/lang/String.length ()I
      // 137: if_icmpge 1c4
      // 13a: aload 1
      // 13b: iload 20
      // 13d: invokevirtual java/lang/String.codePointAt (I)I
      // 140: istore 21
      // 142: iload 7
      // 144: ifne 1ff
      // 147: new java/lang/String
      // 14a: dup
      // 14b: iload 21
      // 14d: invokestatic java/lang/Character.toChars (I)[C
      // 150: invokespecial java/lang/String.<init> ([C)V
      // 153: astore 22
      // 155: iload 21
      // 157: iload 7
      // 159: ifne 1ba
      // 15c: invokestatic java/lang/Character.isWhitespace (I)Z
      // 15f: ifne 1a5
      // 162: goto 166
      // 165: athrow
      // 166: aload 3
      // 167: invokevirtual java/awt/Color.getAlpha ()I
      // 16a: fload 15
      // 16c: invokestatic java/lang/Math.round (F)I
      // 16f: fload 16
      // 171: invokestatic java/lang/Math.round (F)I
      // 174: iload 19
      // 176: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.ba (IIII)I
      // 179: istore 23
      // 17b: aload 9
      // 17d: aload 22
      // 17f: fload 18
      // 181: fload 16
      // 183: iload 23
      // 185: iload 6
      // 187: aload 14
      // 189: aload 10
      // 18b: getstatic net/minecraft/class_327$class_6415.field_33993 Lnet/minecraft/class_327$class_6415;
      // 18e: bipush 0
      // 18f: ldc_w 1176327686
      // 192: ldc_w 774590187
      // 195: ldc_w 488838864
      // 198: ixor
      // 199: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 19c: ldc2_w 6376768113977362750
      // 19f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 1a2: invokevirtual net/minecraft/class_327.method_27521 (Ljava/lang/String;FFIZLorg/joml/Matrix4f;Lnet/minecraft/class_4597;Lnet/minecraft/class_327$class_6415;II)V
      // 1a5: fload 18
      // 1a7: aload 9
      // 1a9: aload 22
      // 1ab: invokevirtual net/minecraft/class_327.method_1727 (Ljava/lang/String;)I
      // 1ae: i2f
      // 1af: fadd
      // 1b0: fstore 18
      // 1b2: iload 20
      // 1b4: iload 21
      // 1b6: invokestatic java/lang/Character.charCount (I)I
      // 1b9: iadd
      // 1ba: istore 20
      // 1bc: iload 7
      // 1be: iinc 19 1
      // 1c1: ifeq 131
      // 1c4: iload 7
      // 1c6: ifeq 1f6
      // 1c9: aload 9
      // 1cb: aload 1
      // 1cc: fload 15
      // 1ce: fload 16
      // 1d0: iload 17
      // 1d2: iload 6
      // 1d4: aload 14
      // 1d6: aload 10
      // 1d8: getstatic net/minecraft/class_327$class_6415.field_33993 Lnet/minecraft/class_327$class_6415;
      // 1db: bipush 0
      // 1dc: ldc_w 1176327687
      // 1df: ldc_w 774590187
      // 1e2: ldc_w 463340730
      // 1e5: ixor
      // 1e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 1e9: ldc2_w 8465416955397884776
      // 1ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 1ef: invokevirtual net/minecraft/class_327.method_27521 (Ljava/lang/String;FFIZLorg/joml/Matrix4f;Lnet/minecraft/class_4597;Lnet/minecraft/class_327$class_6415;II)V
      // 1f2: goto 1f6
      // 1f5: athrow
      // 1f6: aload 0
      // 1f7: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 1fc: invokevirtual net/minecraft/class_4587.method_22909 ()V
      // 1ff: return
   }

   public static class_243 baaab(Object param0) {
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
      // 09: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 0c: ifeq 47
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 1b: astore 2
      // 1c: aload 2
      // 1d: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.aaaa ()Lnet/minecraft/class_4184; 1
      // 22: iload 1
      // 23: ifne 43
      // 26: ifnull 3a
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 2
      // 2e: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.aaaa ()Lnet/minecraft/class_4184; 1
      // 33: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
      // 36: goto 46
      // 39: athrow
      // 3a: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 3d: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 40: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 43: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
      // 46: areturn
      // 47: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 4a: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 4d: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 50: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
      // 53: areturn
   }

   private static float baaba(float param0, float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: fload 3
      // 06: fconst_0
      // 07: iload 4
      // 09: ifne 22
      // 0c: fcmpg
      // 0d: ifgt 17
      // 10: goto 14
      // 13: athrow
      // 14: fload 2
      // 15: freturn
      // 16: athrow
      // 17: fload 0
      // 18: iload 4
      // 1a: ifne 71
      // 1d: fload 3
      // 1e: goto 22
      // 21: athrow
      // 22: fcmpg
      // 23: ifge 6c
      // 26: fload 3
      // 27: fload 0
      // 28: fsub
      // 29: fstore 5
      // 2b: fload 5
      // 2d: fconst_0
      // 2e: iload 4
      // 30: ifne 4b
      // 33: fcmpl
      // 34: ifle 67
      // 37: goto 3b
      // 3a: athrow
      // 3b: fload 5
      // 3d: iload 4
      // 3f: ifne 66
      // 42: goto 46
      // 45: athrow
      // 46: fload 3
      // 47: goto 4b
      // 4a: athrow
      // 4b: fcmpg
      // 4c: ifge 67
      // 4f: fload 2
      // 50: fload 3
      // 51: fsub
      // 52: f2d
      // 53: fload 3
      // 54: fload 3
      // 55: fmul
      // 56: fload 5
      // 58: fload 5
      // 5a: fmul
      // 5b: fsub
      // 5c: f2d
      // 5d: invokestatic java/lang/Math.sqrt (D)D
      // 60: dadd
      // 61: d2f
      // 62: goto 66
      // 65: athrow
      // 66: freturn
      // 67: iload 4
      // 69: ifeq c1
      // 6c: fload 0
      // 6d: goto 71
      // 70: athrow
      // 71: iload 4
      // 73: ifne c2
      // 76: fload 1
      // 77: fload 3
      // 78: fsub
      // 79: fcmpl
      // 7a: ifle c1
      // 7d: goto 81
      // 80: athrow
      // 81: fload 0
      // 82: fload 1
      // 83: fload 3
      // 84: fsub
      // 85: fsub
      // 86: iload 4
      // 88: ifne c2
      // 8b: goto 8f
      // 8e: athrow
      // 8f: fstore 5
      // 91: fload 5
      // 93: fconst_0
      // 94: fcmpl
      // 95: ifle c1
      // 98: fload 5
      // 9a: iload 4
      // 9c: ifne c2
      // 9f: goto a3
      // a2: athrow
      // a3: fload 3
      // a4: fcmpg
      // a5: ifge c1
      // a8: goto ac
      // ab: athrow
      // ac: fload 2
      // ad: fload 3
      // ae: fsub
      // af: f2d
      // b0: fload 3
      // b1: fload 3
      // b2: fmul
      // b3: fload 5
      // b5: fload 5
      // b7: fmul
      // b8: fsub
      // b9: f2d
      // ba: invokestatic java/lang/Math.sqrt (D)D
      // bd: dadd
      // be: d2f
      // bf: freturn
      // c0: athrow
      // c1: fload 2
      // c2: freturn
   }

   private static void baabb(class_4587 param0, class_4597 param1, class_238 param2, Color param3, double param4, class_1921 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ifnull 025
      // 004: aload 1
      // 005: ifnull 025
      // 008: goto 00c
      // 00b: athrow
      // 00c: aload 2
      // 00d: ifnull 025
      // 010: goto 014
      // 013: athrow
      // 014: aload 3
      // 015: ifnull 025
      // 018: goto 01c
      // 01b: athrow
      // 01c: aload 6
      // 01e: ifnonnull 027
      // 021: goto 025
      // 024: athrow
      // 025: return
      // 026: athrow
      // 027: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 02a: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 02d: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 030: astore 7
      // 032: aload 7
      // 034: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
      // 037: astore 8
      // 039: aload 2
      // 03a: getfield net/minecraft/class_238.field_1323 D
      // 03d: aload 8
      // 03f: getfield net/minecraft/class_243.field_1352 D
      // 042: dsub
      // 043: d2f
      // 044: fstore 9
      // 046: aload 2
      // 047: getfield net/minecraft/class_238.field_1322 D
      // 04a: aload 8
      // 04c: getfield net/minecraft/class_243.field_1351 D
      // 04f: dsub
      // 050: d2f
      // 051: fstore 10
      // 053: aload 2
      // 054: getfield net/minecraft/class_238.field_1321 D
      // 057: aload 8
      // 059: getfield net/minecraft/class_243.field_1350 D
      // 05c: dsub
      // 05d: d2f
      // 05e: fstore 11
      // 060: aload 2
      // 061: getfield net/minecraft/class_238.field_1320 D
      // 064: aload 8
      // 066: getfield net/minecraft/class_243.field_1352 D
      // 069: dsub
      // 06a: d2f
      // 06b: fstore 12
      // 06d: aload 2
      // 06e: getfield net/minecraft/class_238.field_1325 D
      // 071: aload 8
      // 073: getfield net/minecraft/class_243.field_1351 D
      // 076: dsub
      // 077: d2f
      // 078: fstore 13
      // 07a: aload 2
      // 07b: getfield net/minecraft/class_238.field_1324 D
      // 07e: aload 8
      // 080: getfield net/minecraft/class_243.field_1350 D
      // 083: dsub
      // 084: d2f
      // 085: fstore 14
      // 087: aload 3
      // 088: invokevirtual java/awt/Color.getRed ()I
      // 08b: i2f
      // 08c: ldc_w 255.0
      // 08f: fdiv
      // 090: fstore 15
      // 092: aload 3
      // 093: invokevirtual java/awt/Color.getGreen ()I
      // 096: i2f
      // 097: ldc_w 255.0
      // 09a: fdiv
      // 09b: fstore 16
      // 09d: aload 3
      // 09e: invokevirtual java/awt/Color.getBlue ()I
      // 0a1: i2f
      // 0a2: ldc_w 255.0
      // 0a5: fdiv
      // 0a6: fstore 17
      // 0a8: dload 4
      // 0aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baab (D)I
      // 0ad: i2f
      // 0ae: ldc_w 255.0
      // 0b1: fdiv
      // 0b2: fstore 18
      // 0b4: aload 0
      // 0b5: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0b8: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 0bb: astore 19
      // 0bd: aload 1
      // 0be: aload 6
      // 0c0: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 0c5: astore 20
      // 0c7: aload 20
      // 0c9: aload 19
      // 0cb: fload 9
      // 0cd: fload 10
      // 0cf: fload 11
      // 0d1: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 0d6: fload 15
      // 0d8: fload 16
      // 0da: fload 17
      // 0dc: fload 18
      // 0de: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 0e3: pop
      // 0e4: aload 20
      // 0e6: aload 19
      // 0e8: fload 12
      // 0ea: fload 10
      // 0ec: fload 11
      // 0ee: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 0f3: fload 15
      // 0f5: fload 16
      // 0f7: fload 17
      // 0f9: fload 18
      // 0fb: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 100: pop
      // 101: aload 20
      // 103: aload 19
      // 105: fload 12
      // 107: fload 13
      // 109: fload 11
      // 10b: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 110: fload 15
      // 112: fload 16
      // 114: fload 17
      // 116: fload 18
      // 118: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 11d: pop
      // 11e: aload 20
      // 120: aload 19
      // 122: fload 9
      // 124: fload 13
      // 126: fload 11
      // 128: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 12d: fload 15
      // 12f: fload 16
      // 131: fload 17
      // 133: fload 18
      // 135: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 13a: pop
      // 13b: aload 20
      // 13d: aload 19
      // 13f: fload 9
      // 141: fload 10
      // 143: fload 14
      // 145: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 14a: fload 15
      // 14c: fload 16
      // 14e: fload 17
      // 150: fload 18
      // 152: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 157: pop
      // 158: aload 20
      // 15a: aload 19
      // 15c: fload 9
      // 15e: fload 13
      // 160: fload 14
      // 162: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 167: fload 15
      // 169: fload 16
      // 16b: fload 17
      // 16d: fload 18
      // 16f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 174: pop
      // 175: aload 20
      // 177: aload 19
      // 179: fload 12
      // 17b: fload 13
      // 17d: fload 14
      // 17f: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 184: fload 15
      // 186: fload 16
      // 188: fload 17
      // 18a: fload 18
      // 18c: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 191: pop
      // 192: aload 20
      // 194: aload 19
      // 196: fload 12
      // 198: fload 10
      // 19a: fload 14
      // 19c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1a1: fload 15
      // 1a3: fload 16
      // 1a5: fload 17
      // 1a7: fload 18
      // 1a9: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1ae: pop
      // 1af: aload 20
      // 1b1: aload 19
      // 1b3: fload 9
      // 1b5: fload 10
      // 1b7: fload 11
      // 1b9: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1be: fload 15
      // 1c0: fload 16
      // 1c2: fload 17
      // 1c4: fload 18
      // 1c6: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1cb: pop
      // 1cc: aload 20
      // 1ce: aload 19
      // 1d0: fload 9
      // 1d2: fload 10
      // 1d4: fload 14
      // 1d6: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1db: fload 15
      // 1dd: fload 16
      // 1df: fload 17
      // 1e1: fload 18
      // 1e3: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1e8: pop
      // 1e9: aload 20
      // 1eb: aload 19
      // 1ed: fload 12
      // 1ef: fload 10
      // 1f1: fload 14
      // 1f3: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1f8: fload 15
      // 1fa: fload 16
      // 1fc: fload 17
      // 1fe: fload 18
      // 200: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 205: pop
      // 206: aload 20
      // 208: aload 19
      // 20a: fload 12
      // 20c: fload 10
      // 20e: fload 11
      // 210: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 215: fload 15
      // 217: fload 16
      // 219: fload 17
      // 21b: fload 18
      // 21d: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 222: pop
      // 223: aload 20
      // 225: aload 19
      // 227: fload 9
      // 229: fload 13
      // 22b: fload 11
      // 22d: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 232: fload 15
      // 234: fload 16
      // 236: fload 17
      // 238: fload 18
      // 23a: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 23f: pop
      // 240: aload 20
      // 242: aload 19
      // 244: fload 12
      // 246: fload 13
      // 248: fload 11
      // 24a: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 24f: fload 15
      // 251: fload 16
      // 253: fload 17
      // 255: fload 18
      // 257: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 25c: pop
      // 25d: aload 20
      // 25f: aload 19
      // 261: fload 12
      // 263: fload 13
      // 265: fload 14
      // 267: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 26c: fload 15
      // 26e: fload 16
      // 270: fload 17
      // 272: fload 18
      // 274: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 279: pop
      // 27a: aload 20
      // 27c: aload 19
      // 27e: fload 9
      // 280: fload 13
      // 282: fload 14
      // 284: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 289: fload 15
      // 28b: fload 16
      // 28d: fload 17
      // 28f: fload 18
      // 291: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 296: pop
      // 297: aload 20
      // 299: aload 19
      // 29b: fload 9
      // 29d: fload 10
      // 29f: fload 11
      // 2a1: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2a6: fload 15
      // 2a8: fload 16
      // 2aa: fload 17
      // 2ac: fload 18
      // 2ae: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2b3: pop
      // 2b4: aload 20
      // 2b6: aload 19
      // 2b8: fload 9
      // 2ba: fload 13
      // 2bc: fload 11
      // 2be: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2c3: fload 15
      // 2c5: fload 16
      // 2c7: fload 17
      // 2c9: fload 18
      // 2cb: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2d0: pop
      // 2d1: aload 20
      // 2d3: aload 19
      // 2d5: fload 9
      // 2d7: fload 13
      // 2d9: fload 14
      // 2db: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2e0: fload 15
      // 2e2: fload 16
      // 2e4: fload 17
      // 2e6: fload 18
      // 2e8: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2ed: pop
      // 2ee: aload 20
      // 2f0: aload 19
      // 2f2: fload 9
      // 2f4: fload 10
      // 2f6: fload 14
      // 2f8: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2fd: fload 15
      // 2ff: fload 16
      // 301: fload 17
      // 303: fload 18
      // 305: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 30a: pop
      // 30b: aload 20
      // 30d: aload 19
      // 30f: fload 12
      // 311: fload 10
      // 313: fload 11
      // 315: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 31a: fload 15
      // 31c: fload 16
      // 31e: fload 17
      // 320: fload 18
      // 322: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 327: pop
      // 328: aload 20
      // 32a: aload 19
      // 32c: fload 12
      // 32e: fload 10
      // 330: fload 14
      // 332: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 337: fload 15
      // 339: fload 16
      // 33b: fload 17
      // 33d: fload 18
      // 33f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 344: pop
      // 345: aload 20
      // 347: aload 19
      // 349: fload 12
      // 34b: fload 13
      // 34d: fload 14
      // 34f: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 354: fload 15
      // 356: fload 16
      // 358: fload 17
      // 35a: fload 18
      // 35c: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 361: pop
      // 362: aload 20
      // 364: aload 19
      // 366: fload 12
      // 368: fload 13
      // 36a: fload 11
      // 36c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 371: fload 15
      // 373: fload 16
      // 375: fload 17
      // 377: fload 18
      // 379: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 37e: pop
      // 37f: return
   }

   private static void babaa(class_4587 param0, class_4597 param1, class_238 param2, Color param3, double param4, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 7
      // 005: aload 0
      // 006: ifnull 019
      // 009: aload 2
      // 00a: ifnull 019
      // 00d: goto 011
      // 010: athrow
      // 011: aload 3
      // 012: ifnonnull 01b
      // 015: goto 019
      // 018: athrow
      // 019: return
      // 01a: athrow
      // 01b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 01e: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 021: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 024: astore 8
      // 026: iload 7
      // 028: aload 8
      // 02a: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
      // 02d: astore 9
      // 02f: aload 2
      // 030: getfield net/minecraft/class_238.field_1323 D
      // 033: aload 9
      // 035: getfield net/minecraft/class_243.field_1352 D
      // 038: dsub
      // 039: d2f
      // 03a: fstore 10
      // 03c: aload 2
      // 03d: getfield net/minecraft/class_238.field_1322 D
      // 040: aload 9
      // 042: getfield net/minecraft/class_243.field_1351 D
      // 045: dsub
      // 046: d2f
      // 047: fstore 11
      // 049: aload 2
      // 04a: getfield net/minecraft/class_238.field_1321 D
      // 04d: aload 9
      // 04f: getfield net/minecraft/class_243.field_1350 D
      // 052: dsub
      // 053: d2f
      // 054: fstore 12
      // 056: aload 2
      // 057: getfield net/minecraft/class_238.field_1320 D
      // 05a: aload 9
      // 05c: getfield net/minecraft/class_243.field_1352 D
      // 05f: dsub
      // 060: d2f
      // 061: fstore 13
      // 063: aload 2
      // 064: getfield net/minecraft/class_238.field_1325 D
      // 067: aload 9
      // 069: getfield net/minecraft/class_243.field_1351 D
      // 06c: dsub
      // 06d: d2f
      // 06e: fstore 14
      // 070: aload 2
      // 071: getfield net/minecraft/class_238.field_1324 D
      // 074: aload 9
      // 076: getfield net/minecraft/class_243.field_1350 D
      // 079: dsub
      // 07a: d2f
      // 07b: fstore 15
      // 07d: aload 3
      // 07e: invokevirtual java/awt/Color.getRed ()I
      // 081: i2f
      // 082: ldc_w 255.0
      // 085: fdiv
      // 086: fstore 16
      // 088: aload 3
      // 089: invokevirtual java/awt/Color.getGreen ()I
      // 08c: i2f
      // 08d: ldc_w 255.0
      // 090: fdiv
      // 091: fstore 17
      // 093: aload 3
      // 094: invokevirtual java/awt/Color.getBlue ()I
      // 097: i2f
      // 098: ldc_w 255.0
      // 09b: fdiv
      // 09c: fstore 18
      // 09e: dload 4
      // 0a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baab (D)I
      // 0a3: i2f
      // 0a4: ldc_w 255.0
      // 0a7: fdiv
      // 0a8: fstore 19
      // 0aa: aload 0
      // 0ab: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0ae: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 0b1: astore 20
      // 0b3: ifne 5dc
      // 0b6: aload 1
      // 0b7: ifnull 5a2
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: aload 1
      // 0bf: invokestatic net/minecraft/class_12249.method_76015 ()Lnet/minecraft/class_1921;
      // 0c2: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 0c7: astore 21
      // 0c9: aload 21
      // 0cb: aload 20
      // 0cd: fload 10
      // 0cf: fload 11
      // 0d1: fload 12
      // 0d3: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 0d8: fload 16
      // 0da: fload 17
      // 0dc: fload 18
      // 0de: fload 19
      // 0e0: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 0e5: aload 0
      // 0e6: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0e9: fconst_1
      // 0ea: fconst_0
      // 0eb: fconst_0
      // 0ec: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 0f1: fload 6
      // 0f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 0f6: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 0fb: pop
      // 0fc: aload 21
      // 0fe: aload 20
      // 100: fload 13
      // 102: fload 11
      // 104: fload 12
      // 106: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 10b: fload 16
      // 10d: fload 17
      // 10f: fload 18
      // 111: fload 19
      // 113: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 118: aload 0
      // 119: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 11c: fconst_1
      // 11d: fconst_0
      // 11e: fconst_0
      // 11f: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 124: fload 6
      // 126: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 129: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 12e: pop
      // 12f: aload 21
      // 131: aload 20
      // 133: fload 13
      // 135: fload 11
      // 137: fload 12
      // 139: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 13e: fload 16
      // 140: fload 17
      // 142: fload 18
      // 144: fload 19
      // 146: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 14b: aload 0
      // 14c: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 14f: fconst_0
      // 150: fconst_1
      // 151: fconst_0
      // 152: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 157: fload 6
      // 159: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 15c: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 161: pop
      // 162: aload 21
      // 164: aload 20
      // 166: fload 13
      // 168: fload 14
      // 16a: fload 12
      // 16c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 171: fload 16
      // 173: fload 17
      // 175: fload 18
      // 177: fload 19
      // 179: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 17e: aload 0
      // 17f: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 182: fconst_0
      // 183: fconst_1
      // 184: fconst_0
      // 185: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 18a: fload 6
      // 18c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 18f: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 194: pop
      // 195: aload 21
      // 197: aload 20
      // 199: fload 13
      // 19b: fload 14
      // 19d: fload 12
      // 19f: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1a4: fload 16
      // 1a6: fload 17
      // 1a8: fload 18
      // 1aa: fload 19
      // 1ac: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1b1: aload 0
      // 1b2: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 1b5: ldc_w -1.0
      // 1b8: fconst_0
      // 1b9: fconst_0
      // 1ba: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 1bf: fload 6
      // 1c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 1c4: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 1c9: pop
      // 1ca: aload 21
      // 1cc: aload 20
      // 1ce: fload 10
      // 1d0: fload 14
      // 1d2: fload 12
      // 1d4: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1d9: fload 16
      // 1db: fload 17
      // 1dd: fload 18
      // 1df: fload 19
      // 1e1: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1e6: aload 0
      // 1e7: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 1ea: ldc_w -1.0
      // 1ed: fconst_0
      // 1ee: fconst_0
      // 1ef: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 1f4: fload 6
      // 1f6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 1f9: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 1fe: pop
      // 1ff: aload 21
      // 201: aload 20
      // 203: fload 10
      // 205: fload 14
      // 207: fload 12
      // 209: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 20e: fload 16
      // 210: fload 17
      // 212: fload 18
      // 214: fload 19
      // 216: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 21b: aload 0
      // 21c: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 21f: fconst_0
      // 220: ldc_w -1.0
      // 223: fconst_0
      // 224: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 229: fload 6
      // 22b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 22e: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 233: pop
      // 234: aload 21
      // 236: aload 20
      // 238: fload 10
      // 23a: fload 11
      // 23c: fload 12
      // 23e: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 243: fload 16
      // 245: fload 17
      // 247: fload 18
      // 249: fload 19
      // 24b: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 250: aload 0
      // 251: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 254: fconst_0
      // 255: ldc_w -1.0
      // 258: fconst_0
      // 259: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 25e: fload 6
      // 260: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 263: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 268: pop
      // 269: aload 21
      // 26b: aload 20
      // 26d: fload 10
      // 26f: fload 11
      // 271: fload 15
      // 273: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 278: fload 16
      // 27a: fload 17
      // 27c: fload 18
      // 27e: fload 19
      // 280: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 285: aload 0
      // 286: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 289: fconst_1
      // 28a: fconst_0
      // 28b: fconst_0
      // 28c: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 291: fload 6
      // 293: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 296: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 29b: pop
      // 29c: aload 21
      // 29e: aload 20
      // 2a0: fload 13
      // 2a2: fload 11
      // 2a4: fload 15
      // 2a6: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2ab: fload 16
      // 2ad: fload 17
      // 2af: fload 18
      // 2b1: fload 19
      // 2b3: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2b8: aload 0
      // 2b9: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 2bc: fconst_1
      // 2bd: fconst_0
      // 2be: fconst_0
      // 2bf: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 2c4: fload 6
      // 2c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 2c9: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 2ce: pop
      // 2cf: aload 21
      // 2d1: aload 20
      // 2d3: fload 13
      // 2d5: fload 11
      // 2d7: fload 15
      // 2d9: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2de: fload 16
      // 2e0: fload 17
      // 2e2: fload 18
      // 2e4: fload 19
      // 2e6: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2eb: aload 0
      // 2ec: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 2ef: fconst_0
      // 2f0: fconst_1
      // 2f1: fconst_0
      // 2f2: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 2f7: fload 6
      // 2f9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 2fc: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 301: pop
      // 302: aload 21
      // 304: aload 20
      // 306: fload 13
      // 308: fload 14
      // 30a: fload 15
      // 30c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 311: fload 16
      // 313: fload 17
      // 315: fload 18
      // 317: fload 19
      // 319: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 31e: aload 0
      // 31f: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 322: fconst_0
      // 323: fconst_1
      // 324: fconst_0
      // 325: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 32a: fload 6
      // 32c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 32f: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 334: pop
      // 335: aload 21
      // 337: aload 20
      // 339: fload 13
      // 33b: fload 14
      // 33d: fload 15
      // 33f: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 344: fload 16
      // 346: fload 17
      // 348: fload 18
      // 34a: fload 19
      // 34c: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 351: aload 0
      // 352: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 355: ldc_w -1.0
      // 358: fconst_0
      // 359: fconst_0
      // 35a: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 35f: fload 6
      // 361: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 364: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 369: pop
      // 36a: aload 21
      // 36c: aload 20
      // 36e: fload 10
      // 370: fload 14
      // 372: fload 15
      // 374: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 379: fload 16
      // 37b: fload 17
      // 37d: fload 18
      // 37f: fload 19
      // 381: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 386: aload 0
      // 387: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 38a: ldc_w -1.0
      // 38d: fconst_0
      // 38e: fconst_0
      // 38f: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 394: fload 6
      // 396: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 399: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 39e: pop
      // 39f: aload 21
      // 3a1: aload 20
      // 3a3: fload 10
      // 3a5: fload 14
      // 3a7: fload 15
      // 3a9: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 3ae: fload 16
      // 3b0: fload 17
      // 3b2: fload 18
      // 3b4: fload 19
      // 3b6: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 3bb: aload 0
      // 3bc: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 3bf: fconst_0
      // 3c0: ldc_w -1.0
      // 3c3: fconst_0
      // 3c4: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 3c9: fload 6
      // 3cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 3ce: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 3d3: pop
      // 3d4: aload 21
      // 3d6: aload 20
      // 3d8: fload 10
      // 3da: fload 11
      // 3dc: fload 15
      // 3de: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 3e3: fload 16
      // 3e5: fload 17
      // 3e7: fload 18
      // 3e9: fload 19
      // 3eb: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 3f0: aload 0
      // 3f1: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 3f4: fconst_0
      // 3f5: ldc_w -1.0
      // 3f8: fconst_0
      // 3f9: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 3fe: fload 6
      // 400: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 403: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 408: pop
      // 409: aload 21
      // 40b: aload 20
      // 40d: fload 10
      // 40f: fload 11
      // 411: fload 12
      // 413: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 418: fload 16
      // 41a: fload 17
      // 41c: fload 18
      // 41e: fload 19
      // 420: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 425: aload 0
      // 426: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 429: fconst_0
      // 42a: fconst_0
      // 42b: fconst_1
      // 42c: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 431: fload 6
      // 433: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 436: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 43b: pop
      // 43c: aload 21
      // 43e: aload 20
      // 440: fload 10
      // 442: fload 11
      // 444: fload 15
      // 446: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 44b: fload 16
      // 44d: fload 17
      // 44f: fload 18
      // 451: fload 19
      // 453: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 458: aload 0
      // 459: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 45c: fconst_0
      // 45d: fconst_0
      // 45e: fconst_1
      // 45f: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 464: fload 6
      // 466: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 469: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 46e: pop
      // 46f: aload 21
      // 471: aload 20
      // 473: fload 13
      // 475: fload 11
      // 477: fload 12
      // 479: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 47e: fload 16
      // 480: fload 17
      // 482: fload 18
      // 484: fload 19
      // 486: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 48b: aload 0
      // 48c: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 48f: fconst_0
      // 490: fconst_0
      // 491: fconst_1
      // 492: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 497: fload 6
      // 499: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 49c: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 4a1: pop
      // 4a2: aload 21
      // 4a4: aload 20
      // 4a6: fload 13
      // 4a8: fload 11
      // 4aa: fload 15
      // 4ac: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 4b1: fload 16
      // 4b3: fload 17
      // 4b5: fload 18
      // 4b7: fload 19
      // 4b9: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 4be: aload 0
      // 4bf: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 4c2: fconst_0
      // 4c3: fconst_0
      // 4c4: fconst_1
      // 4c5: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 4ca: fload 6
      // 4cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 4cf: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 4d4: pop
      // 4d5: aload 21
      // 4d7: aload 20
      // 4d9: fload 13
      // 4db: fload 14
      // 4dd: fload 12
      // 4df: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 4e4: fload 16
      // 4e6: fload 17
      // 4e8: fload 18
      // 4ea: fload 19
      // 4ec: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 4f1: aload 0
      // 4f2: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 4f5: fconst_0
      // 4f6: fconst_0
      // 4f7: fconst_1
      // 4f8: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 4fd: fload 6
      // 4ff: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 502: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 507: pop
      // 508: aload 21
      // 50a: aload 20
      // 50c: fload 13
      // 50e: fload 14
      // 510: fload 15
      // 512: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 517: fload 16
      // 519: fload 17
      // 51b: fload 18
      // 51d: fload 19
      // 51f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 524: aload 0
      // 525: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 528: fconst_0
      // 529: fconst_0
      // 52a: fconst_1
      // 52b: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 530: fload 6
      // 532: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 535: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 53a: pop
      // 53b: aload 21
      // 53d: aload 20
      // 53f: fload 10
      // 541: fload 14
      // 543: fload 12
      // 545: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 54a: fload 16
      // 54c: fload 17
      // 54e: fload 18
      // 550: fload 19
      // 552: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 557: aload 0
      // 558: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 55b: fconst_0
      // 55c: fconst_0
      // 55d: fconst_1
      // 55e: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 563: fload 6
      // 565: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 568: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 56d: pop
      // 56e: aload 21
      // 570: aload 20
      // 572: fload 10
      // 574: fload 14
      // 576: fload 15
      // 578: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 57d: fload 16
      // 57f: fload 17
      // 581: fload 18
      // 583: fload 19
      // 585: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 58a: aload 0
      // 58b: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 58e: fconst_0
      // 58f: fconst_0
      // 590: fconst_1
      // 591: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 596: fload 6
      // 598: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 59b: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 5a0: pop
      // 5a1: return
      // 5a2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ba Ljava/lang/reflect/Method;
      // 5a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 5a8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaa Ljava/lang/reflect/Method;
      // 5ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 5ae: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaa Ljava/lang/reflect/Method;
      // 5b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 5b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babbb ()V
      // 5b7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbba Ljava/lang/reflect/Method;
      // 5ba: bipush 1
      // 5bb: anewarray 4
      // 5be: dup
      // 5bf: bipush 0
      // 5c0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aa Ljava/lang/Object;
      // 5c3: aastore
      // 5c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 5c7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 5ca: bipush 1
      // 5cb: anewarray 4
      // 5ce: dup
      // 5cf: bipush 0
      // 5d0: fload 6
      // 5d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 5d5: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 5d8: aastore
      // 5d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 5dc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abba Ljava/lang/reflect/Method;
      // 5df: bipush 0
      // 5e0: anewarray 4
      // 5e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babb (Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5e6: astore 21
      // 5e8: iload 7
      // 5ea: aload 21
      // 5ec: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baa Ljava/lang/reflect/Method;
      // 5ef: bipush 2
      // 5f0: anewarray 4
      // 5f3: dup
      // 5f4: bipush 0
      // 5f5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baba Ljava/lang/Object;
      // 5f8: aastore
      // 5f9: dup
      // 5fa: bipush 1
      // 5fb: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbb Ljava/lang/Object;
      // 5fe: aastore
      // 5ff: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaa (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 602: checkcast net/minecraft/class_4588
      // 605: astore 22
      // 607: ifne 8ec
      // 60a: aload 22
      // 60c: ifnonnull 634
      // 60f: goto 613
      // 612: athrow
      // 613: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 616: bipush 1
      // 617: anewarray 4
      // 61a: dup
      // 61b: bipush 0
      // 61c: fconst_1
      // 61d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 620: aastore
      // 621: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 624: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 627: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 62a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 62d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 630: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 633: return
      // 634: aload 22
      // 636: aload 20
      // 638: fload 10
      // 63a: fload 11
      // 63c: fload 12
      // 63e: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 643: fload 16
      // 645: fload 17
      // 647: fload 18
      // 649: fload 19
      // 64b: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 650: pop
      // 651: aload 22
      // 653: aload 20
      // 655: fload 13
      // 657: fload 11
      // 659: fload 12
      // 65b: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 660: fload 16
      // 662: fload 17
      // 664: fload 18
      // 666: fload 19
      // 668: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 66d: pop
      // 66e: aload 22
      // 670: aload 20
      // 672: fload 13
      // 674: fload 11
      // 676: fload 12
      // 678: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 67d: fload 16
      // 67f: fload 17
      // 681: fload 18
      // 683: fload 19
      // 685: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 68a: pop
      // 68b: aload 22
      // 68d: aload 20
      // 68f: fload 13
      // 691: fload 14
      // 693: fload 12
      // 695: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 69a: fload 16
      // 69c: fload 17
      // 69e: fload 18
      // 6a0: fload 19
      // 6a2: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 6a7: pop
      // 6a8: aload 22
      // 6aa: aload 20
      // 6ac: fload 13
      // 6ae: fload 14
      // 6b0: fload 12
      // 6b2: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 6b7: fload 16
      // 6b9: fload 17
      // 6bb: fload 18
      // 6bd: fload 19
      // 6bf: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 6c4: pop
      // 6c5: aload 22
      // 6c7: aload 20
      // 6c9: fload 10
      // 6cb: fload 14
      // 6cd: fload 12
      // 6cf: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 6d4: fload 16
      // 6d6: fload 17
      // 6d8: fload 18
      // 6da: fload 19
      // 6dc: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 6e1: pop
      // 6e2: aload 22
      // 6e4: aload 20
      // 6e6: fload 10
      // 6e8: fload 14
      // 6ea: fload 12
      // 6ec: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 6f1: fload 16
      // 6f3: fload 17
      // 6f5: fload 18
      // 6f7: fload 19
      // 6f9: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 6fe: pop
      // 6ff: aload 22
      // 701: aload 20
      // 703: fload 10
      // 705: fload 11
      // 707: fload 12
      // 709: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 70e: fload 16
      // 710: fload 17
      // 712: fload 18
      // 714: fload 19
      // 716: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 71b: pop
      // 71c: aload 22
      // 71e: aload 20
      // 720: fload 10
      // 722: fload 11
      // 724: fload 15
      // 726: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 72b: fload 16
      // 72d: fload 17
      // 72f: fload 18
      // 731: fload 19
      // 733: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 738: pop
      // 739: aload 22
      // 73b: aload 20
      // 73d: fload 13
      // 73f: fload 11
      // 741: fload 15
      // 743: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 748: fload 16
      // 74a: fload 17
      // 74c: fload 18
      // 74e: fload 19
      // 750: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 755: pop
      // 756: aload 22
      // 758: aload 20
      // 75a: fload 13
      // 75c: fload 11
      // 75e: fload 15
      // 760: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 765: fload 16
      // 767: fload 17
      // 769: fload 18
      // 76b: fload 19
      // 76d: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 772: pop
      // 773: aload 22
      // 775: aload 20
      // 777: fload 13
      // 779: fload 14
      // 77b: fload 15
      // 77d: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 782: fload 16
      // 784: fload 17
      // 786: fload 18
      // 788: fload 19
      // 78a: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 78f: pop
      // 790: aload 22
      // 792: aload 20
      // 794: fload 13
      // 796: fload 14
      // 798: fload 15
      // 79a: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 79f: fload 16
      // 7a1: fload 17
      // 7a3: fload 18
      // 7a5: fload 19
      // 7a7: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 7ac: pop
      // 7ad: aload 22
      // 7af: aload 20
      // 7b1: fload 10
      // 7b3: fload 14
      // 7b5: fload 15
      // 7b7: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 7bc: fload 16
      // 7be: fload 17
      // 7c0: fload 18
      // 7c2: fload 19
      // 7c4: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 7c9: pop
      // 7ca: aload 22
      // 7cc: aload 20
      // 7ce: fload 10
      // 7d0: fload 14
      // 7d2: fload 15
      // 7d4: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 7d9: fload 16
      // 7db: fload 17
      // 7dd: fload 18
      // 7df: fload 19
      // 7e1: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 7e6: pop
      // 7e7: aload 22
      // 7e9: aload 20
      // 7eb: fload 10
      // 7ed: fload 11
      // 7ef: fload 15
      // 7f1: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 7f6: fload 16
      // 7f8: fload 17
      // 7fa: fload 18
      // 7fc: fload 19
      // 7fe: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 803: pop
      // 804: aload 22
      // 806: aload 20
      // 808: fload 10
      // 80a: fload 11
      // 80c: fload 12
      // 80e: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 813: fload 16
      // 815: fload 17
      // 817: fload 18
      // 819: fload 19
      // 81b: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 820: pop
      // 821: aload 22
      // 823: aload 20
      // 825: fload 10
      // 827: fload 11
      // 829: fload 15
      // 82b: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 830: fload 16
      // 832: fload 17
      // 834: fload 18
      // 836: fload 19
      // 838: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 83d: pop
      // 83e: aload 22
      // 840: aload 20
      // 842: fload 13
      // 844: fload 11
      // 846: fload 12
      // 848: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 84d: fload 16
      // 84f: fload 17
      // 851: fload 18
      // 853: fload 19
      // 855: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 85a: pop
      // 85b: aload 22
      // 85d: aload 20
      // 85f: fload 13
      // 861: fload 11
      // 863: fload 15
      // 865: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 86a: fload 16
      // 86c: fload 17
      // 86e: fload 18
      // 870: fload 19
      // 872: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 877: pop
      // 878: aload 22
      // 87a: aload 20
      // 87c: fload 13
      // 87e: fload 14
      // 880: fload 12
      // 882: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 887: fload 16
      // 889: fload 17
      // 88b: fload 18
      // 88d: fload 19
      // 88f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 894: pop
      // 895: aload 22
      // 897: aload 20
      // 899: fload 13
      // 89b: fload 14
      // 89d: fload 15
      // 89f: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 8a4: fload 16
      // 8a6: fload 17
      // 8a8: fload 18
      // 8aa: fload 19
      // 8ac: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 8b1: pop
      // 8b2: aload 22
      // 8b4: aload 20
      // 8b6: fload 10
      // 8b8: fload 14
      // 8ba: fload 12
      // 8bc: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 8c1: fload 16
      // 8c3: fload 17
      // 8c5: fload 18
      // 8c7: fload 19
      // 8c9: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 8ce: pop
      // 8cf: aload 22
      // 8d1: aload 20
      // 8d3: fload 10
      // 8d5: fload 14
      // 8d7: fload 15
      // 8d9: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 8de: fload 16
      // 8e0: fload 17
      // 8e2: fload 18
      // 8e4: fload 19
      // 8e6: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 8eb: pop
      // 8ec: aload 22
      // 8ee: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abbb Ljava/lang/reflect/Method;
      // 8f1: bipush 0
      // 8f2: anewarray 4
      // 8f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaa (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 8f8: astore 23
      // 8fa: iload 7
      // 8fc: ifne 93b
      // 8ff: aload 23
      // 901: ifnull 91b
      // 904: goto 908
      // 907: athrow
      // 908: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaab Ljava/lang/reflect/Method;
      // 90b: bipush 1
      // 90c: anewarray 4
      // 90f: dup
      // 910: bipush 0
      // 911: aload 23
      // 913: aastore
      // 914: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 917: goto 91b
      // 91a: athrow
      // 91b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 91e: bipush 1
      // 91f: anewarray 4
      // 922: dup
      // 923: bipush 0
      // 924: fconst_1
      // 925: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 928: aastore
      // 929: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 92c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 92f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 932: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 935: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 938: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 93b: goto 963
      // 93e: astore 24
      // 940: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 943: bipush 1
      // 944: anewarray 4
      // 947: dup
      // 948: bipush 0
      // 949: fconst_1
      // 94a: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 94d: aastore
      // 94e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 951: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 954: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 957: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 95a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 95d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 960: aload 24
      // 962: athrow
      // 963: return
   }

   public static boolean babab(class_310 param0, class_1297 param1) {
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
      // 09: ifnull 4a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 4a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 27: ifnull 4a
      // 2a: aload 1
      // 2b: iload 2
      // 2c: ifne 3b
      // 2f: goto 33
      // 32: athrow
      // 33: ifnull 4a
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 1
      // 3b: iload 2
      // 3c: ifne 4e
      // 3f: aload 0
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: if_acmpne 4d
      // 46: goto 4a
      // 49: athrow
      // 4a: bipush 0
      // 4b: ireturn
      // 4c: athrow
      // 4d: aload 1
      // 4e: iload 2
      // 4f: ifne 68
      // 52: instanceof net/minecraft/class_1657
      // 55: ifeq 67
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 1
      // 5d: checkcast net/minecraft/class_1657
      // 60: astore 3
      // 61: aload 0
      // 62: aload 3
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ba (Lnet/minecraft/class_310;Lnet/minecraft/class_1657;)Z
      // 66: ireturn
      // 67: aload 1
      // 68: iload 2
      // 69: ifne 7b
      // 6c: invokevirtual net/minecraft/class_1297.method_5805 ()Z
      // 6f: ifeq 8d
      // 72: goto 76
      // 75: athrow
      // 76: aload 1
      // 77: goto 7b
      // 7a: athrow
      // 7b: invokevirtual net/minecraft/class_1297.method_7325 ()Z
      // 7e: iload 2
      // 7f: ifne 8a
      // 82: ifne 8d
      // 85: goto 89
      // 88: athrow
      // 89: bipush 1
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: ireturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void babba(Method var0, Object[] var1) {
      int var2 = baaabbaa.bba;

      label30: {
         try {
            if (var2 != 0) {
               break label30;
            }

            if (var0 == null) {
               return;
            }
         } catch (ReflectiveOperationException var6) {
            throw var6;
         }

         try {
            var0.invoke(null, var1);
         } catch (ReflectiveOperationException var5) {
            return;
         }
      }

      try {
         ;
      } catch (ReflectiveOperationException var4) {
      }
   }

   private static void babbb() {
      babba(bba, new Object[]{false});
      aaaaaa(baab);
   }

   public static void bbaaa(Object param0, class_238 param1, Color param2, double param3, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 6
      // 05: aload 1
      // 06: ifnull 2b
      // 09: aload 2
      // 0a: iload 6
      // 0c: ifne 1b
      // 0f: goto 13
      // 12: athrow
      // 13: ifnull 2b
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 0
      // 1b: iload 6
      // 1d: ifne 2e
      // 20: aload 1
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaa (Ljava/lang/Object;Lnet/minecraft/class_238;)Z
      // 24: ifne 2d
      // 27: goto 2b
      // 2a: athrow
      // 2b: return
      // 2c: athrow
      // 2d: aload 0
      // 2e: iload 6
      // 30: ifne 7b
      // 33: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 36: ifeq 76
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 0
      // 3e: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 41: astore 7
      // 43: aload 7
      // 45: iload 6
      // 47: ifne 7b
      // 4a: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 4f: ifnull 76
      // 52: goto 56
      // 55: athrow
      // 56: aload 7
      // 58: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 5d: aload 7
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 62: aload 1
      // 63: aload 2
      // 64: dload 3
      // 65: fload 5
      // 67: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aba Lnet/minecraft/class_1921;
      // 6a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaba (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_238;Ljava/awt/Color;DFLnet/minecraft/class_1921;)V
      // 6d: iload 6
      // 6f: ifeq c2
      // 72: goto 76
      // 75: athrow
      // 76: aload 0
      // 77: goto 7b
      // 7a: athrow
      // 7b: iload 6
      // 7d: ifne 8f
      // 80: instanceof net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 83: ifeq c2
      // 86: goto 8a
      // 89: athrow
      // 8a: aload 0
      // 8b: goto 8f
      // 8e: athrow
      // 8f: checkcast net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 92: astore 8
      // 94: aload 8
      // 96: iload 6
      // 98: ifne ad
      // 9b: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.matrices ()Lnet/minecraft/class_4587; 1
      // a0: ifnull c2
      // a3: goto a7
      // a6: athrow
      // a7: aload 8
      // a9: goto ad
      // ac: athrow
      // ad: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.matrices ()Lnet/minecraft/class_4587; 1
      // b2: aload 8
      // b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // b7: aload 1
      // b8: aload 2
      // b9: dload 3
      // ba: fload 5
      // bc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aba Lnet/minecraft/class_1921;
      // bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaba (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_238;Ljava/awt/Color;DFLnet/minecraft/class_1921;)V
      // c2: return
   }

   private static Object bbaab() {
      Object var0 = abaaaa(aabbaaaba.abba(aab[1]), aabbaaaba.abba(aab[2]));
      if (var0 == null) {
         var0 = abaaaa(aabbaaaba.abba(aab[0]), aabbaaaba.abba(aab[2]));
      }

      return var0;
   }

   public static void bbaba(aabbbbaaa var0, class_2960 var1, class_243 var2, double var3, double var5) {
      bbba(var0, var1, var2, var3, var5, Color.WHITE);
   }

   private static void bbabb(
      class_4588 var0, Matrix4f var1, class_243 var2, class_243 var3, class_243 var4, class_243 var5, class_243 var6, Color var7, double var8
   ) {
      float var10 = var7.getRed() / 255.0F;
      float var11 = var7.getGreen() / 255.0F;
      float var12 = var7.getBlue() / 255.0F;
      float var13 = baab(var8) / 255.0F;
      var0.method_22918(
            var1, (float)(var3.field_1352 - var2.field_1352), (float)(var3.field_1351 - var2.field_1351), (float)(var3.field_1350 - var2.field_1350)
         )
         .method_22915(var10, var11, var12, var13);
      var0.method_22918(
            var1, (float)(var4.field_1352 - var2.field_1352), (float)(var4.field_1351 - var2.field_1351), (float)(var4.field_1350 - var2.field_1350)
         )
         .method_22915(var10, var11, var12, var13);
      var0.method_22918(
            var1, (float)(var5.field_1352 - var2.field_1352), (float)(var5.field_1351 - var2.field_1351), (float)(var5.field_1350 - var2.field_1350)
         )
         .method_22915(var10, var11, var12, var13);
      var0.method_22918(
            var1, (float)(var6.field_1352 - var2.field_1352), (float)(var6.field_1351 - var2.field_1351), (float)(var6.field_1350 - var2.field_1350)
         )
         .method_22915(var10, var11, var12, var13);
   }

   public static void bbbaa(aabbbbaaa var0, class_238 var1, Color var2, double var3) {
      aaaba(var0, var1, var2, var3, 1.0F);
   }

   private static void bbbab(aabbbbaaa var0, class_243[] var1, Color var2, double var3) {
      int var11 = -1144198897;
      int[][] var10000 = new int[aaabba(a(1176327680, var11 ^ 1632025194), 4363260457508827522L)][];
      var10000[0] = new int[]{0, 1};
      var10000[1] = new int[]{1, 2};
      var10000[2] = new int[]{2, 3};
      var10000[3] = new int[]{3, 0};
      var10000[4] = new int[]{4, 5};
      var10000[5] = new int[]{5, aaabba(a(1176327681, var11 ^ -1147904964), 1647438643987489992L)};
      var10000[aaabba(a(1176327682, var11 ^ -236551844), 1904657688269837851L)] = new int[]{
         aaabba(a(1176327683, var11 ^ -2007901379), 1904657688269837851L), aaabba(a(1176327708, var11 ^ -1280234370), 2826706788746440848L)
      };
      var10000[aaabba(a(1176327709, var11 ^ 522579531), 5458041514074840325L)] = new int[]{aaabba(a(1176327710, var11 ^ 1334482076), 5458041514074840325L), 4};
      var10000[aaabba(a(1176327711, var11 ^ -1721085193), 9099102645414680019L)] = new int[]{0, 4};
      var10000[aaabba(a(1176327704, var11 ^ 1960586203), 5543310673330266760L)] = new int[]{1, 5};
      var10000[aaabba(a(1176327705, var11 ^ -263524206), 4557375266056203515L)] = new int[]{2, aaabba(a(1176327706, var11 ^ -103554711), 1904657688269837851L)};
      var10000[aaabba(a(1176327707, var11 ^ 335818983), 3280181492327072002L)] = new int[]{3, aaabba(a(1176327700, var11 ^ -1524158397), 5458041514074840325L)};
      int[][] var6 = var10000;
      int[][] var7 = var6;
      int var8 = var6.length;
      int var9 = 0;
      int var5 = baaabbaa.bba;

      while (var9 < var8) {
         int[] var10 = var7[var9];
         aabbab(var0, var1[var10[0]], var1[var10[1]], var2, var3);
         var9++;
         if (var5 != 0) {
            break;
         }
      }
   }

   private static float bbbba(float var0, float var1, float var2) {
      return Math.min(Math.min(var0, var1) / 2.0F, Math.max(0.0F, var2));
   }

   public static void bbbbb(
      aabbbbaaa param0,
      class_243 param1,
      double param2,
      int param4,
      Color param5,
      double param6,
      float param8,
      boolean param9,
      IntPredicate param10
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 11
      // 005: aload 0
      // 006: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 009: ifeq 036
      // 00c: aload 1
      // 00d: ifnull 036
      // 010: goto 014
      // 013: athrow
      // 014: dload 2
      // 015: dconst_0
      // 016: dcmpg
      // 017: iload 11
      // 019: ifne 029
      // 01c: goto 020
      // 01f: athrow
      // 020: ifle 036
      // 023: goto 027
      // 026: athrow
      // 027: iload 4
      // 029: bipush 3
      // 02a: if_icmplt 036
      // 02d: aload 5
      // 02f: ifnonnull 038
      // 032: goto 036
      // 035: athrow
      // 036: return
      // 037: athrow
      // 038: aload 0
      // 039: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaab (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 03c: astore 12
      // 03e: aload 0
      // 03f: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 044: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 047: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 04a: astore 13
      // 04c: aload 0
      // 04d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 050: iload 9
      // 052: ifeq 05c
      // 055: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbbb Lnet/minecraft/class_1921;
      // 058: goto 05f
      // 05b: athrow
      // 05c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaa Lnet/minecraft/class_1921;
      // 05f: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 064: astore 14
      // 066: aload 5
      // 068: invokevirtual java/awt/Color.getRed ()I
      // 06b: i2f
      // 06c: ldc_w 255.0
      // 06f: fdiv
      // 070: fstore 15
      // 072: aload 5
      // 074: invokevirtual java/awt/Color.getGreen ()I
      // 077: i2f
      // 078: ldc_w 255.0
      // 07b: fdiv
      // 07c: fstore 16
      // 07e: aload 5
      // 080: invokevirtual java/awt/Color.getBlue ()I
      // 083: i2f
      // 084: ldc_w 255.0
      // 087: fdiv
      // 088: fstore 17
      // 08a: dload 6
      // 08c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baab (D)I
      // 08f: i2f
      // 090: ldc_w 255.0
      // 093: fdiv
      // 094: fstore 18
      // 096: fload 8
      // 098: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 09b: fstore 19
      // 09d: bipush 0
      // 09e: istore 20
      // 0a0: iload 20
      // 0a2: iload 4
      // 0a4: if_icmpge 1ee
      // 0a7: aload 10
      // 0a9: iload 11
      // 0ab: ifne 0b7
      // 0ae: ifnull 0c5
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: aload 10
      // 0b7: iload 20
      // 0b9: invokeinterface java/util/function/IntPredicate.test (I)Z 2
      // 0be: ifne 0c5
      // 0c1: goto 1e6
      // 0c4: athrow
      // 0c5: ldc2_w 6.283185307179586
      // 0c8: iload 20
      // 0ca: i2d
      // 0cb: dmul
      // 0cc: iload 4
      // 0ce: i2d
      // 0cf: ddiv
      // 0d0: dstore 21
      // 0d2: ldc2_w 6.283185307179586
      // 0d5: iload 20
      // 0d7: bipush 1
      // 0d8: iadd
      // 0d9: i2d
      // 0da: dmul
      // 0db: iload 4
      // 0dd: i2d
      // 0de: ddiv
      // 0df: dstore 23
      // 0e1: aload 1
      // 0e2: getfield net/minecraft/class_243.field_1352 D
      // 0e5: dload 21
      // 0e7: invokestatic java/lang/Math.cos (D)D
      // 0ea: dload 2
      // 0eb: dmul
      // 0ec: dadd
      // 0ed: aload 12
      // 0ef: getfield net/minecraft/class_243.field_1352 D
      // 0f2: dsub
      // 0f3: d2f
      // 0f4: fstore 25
      // 0f6: aload 1
      // 0f7: getfield net/minecraft/class_243.field_1351 D
      // 0fa: aload 12
      // 0fc: getfield net/minecraft/class_243.field_1351 D
      // 0ff: dsub
      // 100: d2f
      // 101: fstore 26
      // 103: aload 1
      // 104: getfield net/minecraft/class_243.field_1350 D
      // 107: dload 21
      // 109: invokestatic java/lang/Math.sin (D)D
      // 10c: dload 2
      // 10d: dmul
      // 10e: dadd
      // 10f: aload 12
      // 111: getfield net/minecraft/class_243.field_1350 D
      // 114: dsub
      // 115: d2f
      // 116: fstore 27
      // 118: aload 1
      // 119: getfield net/minecraft/class_243.field_1352 D
      // 11c: dload 23
      // 11e: invokestatic java/lang/Math.cos (D)D
      // 121: dload 2
      // 122: dmul
      // 123: dadd
      // 124: aload 12
      // 126: getfield net/minecraft/class_243.field_1352 D
      // 129: dsub
      // 12a: d2f
      // 12b: fstore 28
      // 12d: fload 26
      // 12f: fstore 29
      // 131: aload 1
      // 132: getfield net/minecraft/class_243.field_1350 D
      // 135: dload 23
      // 137: invokestatic java/lang/Math.sin (D)D
      // 13a: dload 2
      // 13b: dmul
      // 13c: dadd
      // 13d: aload 12
      // 13f: getfield net/minecraft/class_243.field_1350 D
      // 142: dsub
      // 143: d2f
      // 144: fstore 30
      // 146: fload 28
      // 148: fload 25
      // 14a: fsub
      // 14b: fstore 31
      // 14d: fload 30
      // 14f: fload 27
      // 151: fsub
      // 152: fstore 32
      // 154: ldc_w 1.0E-4
      // 157: fload 31
      // 159: fload 31
      // 15b: fmul
      // 15c: fload 32
      // 15e: fload 32
      // 160: fmul
      // 161: fadd
      // 162: invokestatic net/minecraft/class_3532.method_15355 (F)F
      // 165: invokestatic java/lang/Math.max (FF)F
      // 168: fstore 33
      // 16a: fload 31
      // 16c: fload 33
      // 16e: fdiv
      // 16f: fstore 31
      // 171: fload 32
      // 173: fload 33
      // 175: fdiv
      // 176: fstore 32
      // 178: aload 14
      // 17a: aload 13
      // 17c: fload 25
      // 17e: fload 26
      // 180: fload 27
      // 182: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 187: fload 15
      // 189: fload 16
      // 18b: fload 17
      // 18d: fload 18
      // 18f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 194: aload 0
      // 195: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 19a: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 19d: fload 31
      // 19f: fconst_0
      // 1a0: fload 32
      // 1a2: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 1a7: fload 19
      // 1a9: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 1ae: pop
      // 1af: aload 14
      // 1b1: aload 13
      // 1b3: fload 28
      // 1b5: fload 29
      // 1b7: fload 30
      // 1b9: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1be: fload 15
      // 1c0: fload 16
      // 1c2: fload 17
      // 1c4: fload 18
      // 1c6: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1cb: aload 0
      // 1cc: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 1d1: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 1d4: fload 31
      // 1d6: fconst_0
      // 1d7: fload 32
      // 1d9: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 1de: fload 19
      // 1e0: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 1e5: pop
      // 1e6: iinc 20 1
      // 1e9: iload 11
      // 1eb: ifeq 0a0
      // 1ee: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var33 = -1372499882;
      int var10001 = "Ώ엖鳪㇁顄呦\ueaec⍻ꞡ顥ᇢ爲ㆉ៩ལ펰욮笧惐큺︵폽ﯴꀐ꼺华襔ࠩ柾Ɓ둮\ufdea\ue1b3グ畐咡ヰ\ueb79䩃Ꙩﴊፏᦔ洟쑟\uf0caד짭\ue065둿擄䇖銈ᘙ㭁煂鞲䜡\uee47㏖堹쭰溚⍒Ṝ௵鶦䒮蛕뉵⊐Ϸೡ膤㤥എ餽旈샞ځ䟞몣\uab00쩘鹇В诨ꑑꋳ鳞ᝓꐷ爈三㰙\uf686藗ꤊ탘ꏬ쐆셏ힷ쥢乣긑\uf711ᙾ\ue1fc\uf8ff璚᷈ꀒ뛑熯车鳊\ue74d\uede4\udf0eே\ue972쀞ѣங찣䬋\uf060뭠뱥╳볉␋묬ᔚ딟⧼\udd02\uee3cᬎ\uf6fb譸횅ᾰᆾ塊躭쟥ು\ue89f똱\udfd0浲䷩茕ക⿰앢熬庹烾\udd6f⫦꒡霅놄䗓殏\ue127蝓氍ฦ\uf0ba堢쮷玚\udddb㘎탩ਂ婟鯮㯬ࡅ텈\ueb06\uf13f\u0e7e﹊풓憫\ue374끼ℓ늗㣣ȭ甑㶆㺫씠ವ瘙ຫ棻\u1afeＲ\uf772ꔮ﹐洄狖䢥틸ᆌ\ude5eᎵ릐\ue7b9✌췆ᄗ䙃徙⢃ꯅ趨핋鰃\uf8d0ⵖ㪎英䜔ꍫ뙚⟪ﾜ쨘쬻悹ﰏ띈≿\ued68细ח㜲ꗞ₻綟ᇕ㪴\udd2dᥒ䍽\u0bd8ꡏᰡ\uece9醹\udfe4\uf6bd㊽\uf684亞몱駯븿\ue019䮱崪墀ө葐豈␦줜㜡㭂\ud82e锹氨䷜쿲䕛\ud823癙\uddb5䧻휸烑\uf055岹裋䧶\ue0bb䟸瘓큁\uda34뼍뮕\ue008蹤\u209e삵銵셎鍽쟟\u19ce\uef11ా\ue0a1⨶嵰뵹쥷ẩ백\uec19먊䷐읨렅蔛岈▮\u0ba6ꙍ⇲ↂ懭\uf6b8䀻ﻢ椻\udf50搽팈ὐࠖ\ue74eঃ蘷왿텱䇋\ue6e7떮\ue490릭瞥롒蟰距\ua62c斯䈒ᯅꕂ括䂨鿁黙Ⰼ푱퓬켏掛玪툘晿\uf1f7䍎\ued1d鱆빣塂\ue079摼욳類钧౾협ᆒາ\ue9cf龉䎢蓱\uecb2芲ꖀ뼉㈻\ueed0쯆늞뜐쪍쐏덏冫맨⏟ꍰ鹁\uf261㙏ᓳ辤旔ﬆ鞨먛\ue455衊\uf468킴\ueab6\uf199㮝苅䄸\uf5ba떼ꡃ噺\uf700ꬹ卯旁싽\uddca䚆镎뜣衲ɸ쾕믩떸䊀塆ꅴ㱷뗢\uf291\ud87aꇩㆧ拱쳙늙夒\udced칔ꞣⲌ듙귮\ue309ﾥ㪓֚鏃揨序ǒ⯆腤䨝萨컰鎾翩癔煣⢩\uf4f7裄廞Ḝ\uf376狟ꐅЄ⚿㶙왂烊ƻᧄ㥏掸⟕ഃ䕝瀜ꌎ\u0ffa\uebd8褥苠枟\uf04d\uedaf\ue15bࠃ䨑Ȋꞝ騣\uef90鐣켸璂鿱銬ꌞﵭ瓦\ue9ca\ue036ꕅ騮翍緇쑡砥\u0dc8挽捎၅韠安个ꨑℎ喻浲\uedd8ꓪ藝ꆘꟘ\u05ff⽯읺昷ൾ䅛\uf49b鹏櫍꜅ꔷ鿬웹㼩ᘔᕣ쁁怒봒쒦\ueec9Ὁ⇦\uec0f㎝旐㟔솘엘孊咞핝ರꌁ렷녋瀔嫈ጻ쯙㒾ꖛฎ믫릚鋝擠竴࡞ḉ긔偱ﶎ喟⚇\ue5d7\ud8f4ꎗ䇬▽ᇜ위㠏\u12b7뚀ᖲ㎹\ue822呬㱋䍁啦\ue109\ueb86겤\ud84dቒ\ue6d8괻뇆횢⇜ॊ⧽\ue75b犱辮ݎǾ귮쓘띫蚐쪐ꗞ充㌆㕬혨闒\uf80c\ue094\ua87f\uf342秊◗䉫掷蟽鵖痓✃凎梓塞䦟黪쑿ꞧ芯㨭偉ꞠꬤΧ玍ꍘ叜ࢲ蕳\u0efe抾쮂䫿텟＃\u1754昢ⴏꗓꉒ\ueb73\uf5ba삙\uf6e0\udb11\ufbc4㫨Ǿ풀⠨햽潚ಾ\uf159\ude47\u20fd၂ᯞ䂘묨᷻率憏棣֪轝뒜㗎읆血Ṩ眂\udd23ᗹK㇣婉鯚\uee42\uf52d⟂清헡儠הּᎅ⁾쇳阄鍆\uf70fꔁ\u086d찒\ue652≄嵿橔⬤褏똸\ueac7ᛜ䷀\ufbd2妧퓸馆࣬찳聅荒犯\ud950\u173dﴲ䡱战뛍ƻ\ud9d5冢빅\udecbꊖǾ✝≥仴蘮ⴄ䚵쿲쾥帲\u1bf8歕辮밊\u0ee6椣檠䗗⌶燺ᮾ☐ⴣ蒩嚯誓竌‒뗣雃玃㪗ꉞ쟶礑ﲷ赚\ud8bb\uf88f㺟毅粛黉ˊ锘悸ᙙꌒ\udb70\ue254迚估릌\uef60僯ﱐ쬍熋톉㑞\uedc1\uf19b숥䇣\uf588粸퍩\ue730ꎫ\n\uf677曅킰⪰㳲╵ꪘ穳⦒榕ꝓ캝\udce5菝嘤꽿騈ꝝ㖸촵\uef50薼뵒勵绱◗䉶庹\ue4eb溆鐨욌㲎ᨡ퇜䖥癱뿊흰\uebee\u2fd9ӝ棰\ue22bԬ챐찞썱ꦧ僧Ǿ峑敃鎎亳ﻶɻƔ紂仆约ꌂ溝諥㾌▦靶aꞓ\udbc3跣⬨ꚭ栒췉毚ꙥ烋\uf865㓞ퟐ\ue7f7\ud946⧫槂ॉ嬖贋ˌ쨏亀㛤\ue406﮶渢\u19af\uf2e8泲弣剭逮\ue5a2\ue54f䍆娼폠టퟹ땞⛍䤸⛘ଢ佀뻿㙶㱦袬ᚨ뽺⃖钡랺译\uea7a멭ꓒ钒曹䵞皷ￎ悑ꐾꢲ❘ᆾ莨鿰ƕ퇓껁嗒裻⩮橷\uf7fb릮䴜얋\ue043穽∄ₚ葯㯁귟콪칄岼⤞\ude03\uf577䉓\ue9b8̀☥௪㓵㬙㇚嬝⠥쏰␕ꬂ䏺䌄㗅Ꮹ䃕ꌜ㌺\ue304❅\uebf1㶕쬆┺\ue319⚅䯳伵ଝ㙺指㌥篮㍵ጜ►̘䴅珪併⬀孺茘㳥ꏮㄕ䬙㒚팙䳥ᯮ㻕㬀䫚\ueb04䧅珬䊕⬚乺㬚䷅㯯䦵\ue31d䨚笆㵅可㇕⌙䞺ᬝ䈅폰㎕挞⤺\uab18⚅寪⛕묀╚댇䂅쏪◕ᬃ⣺鬂㮅ﯴ㼕ᬝ侚묙⒅毱侵㬙⣺ﬅ☥篪㍵ጃ嫚㬘㓅믮❵挜⣚䬘㐥믵⿕猝㥚ጙ╅珮㸵ᬃ㠺猙㛥菪㙕\ue302㇚ଇ⢅\udbf0㈵\ueb02㳺\uf318♥菪㍵䌀㑚䬘䧅诮␕嬀䄺猝䊥\ue3f4⠵錃㡺謇䭅꯰㼕\ue301䨺㌛䪅鏳ふ䬟㴚錂䌥⯭䃕ꌃ䄚ଙ㗥篪䨕ᬃぺ\ueb06㧥珮▵䬝㊚謂俅\ue3f1㏕댝㐺鬆★㯭䏕ꬆ㲚\udb1b䮥\uebed䉵嬟䊚\ue318䊥寰㦵쬙㞚\udb07╥Ϫヵ쬙㹚䬞㤅믮⢵\uab1f䰺ጝ〥㏭婕ﬞ䮚㬛㎥鏵㲕鬟䧚\u0b04Ⓟϳ䄕鬙䉺鬆㐥쏪❕㬚⣚\uf31b⡅Ꮽ⚕ଞ䇚䌙亅ϰ䲵茂㮺鬄㽥돬㋕\uf302㻚㌇ヅ돰䋕쌆㻚䌛ㄅ鯪㷵錙䍺\ue305ぅϩ㓵笃㼚鬝㾥寪㚵㌞ㆺ\uf318㞥台⤕⬟ㇺጇ䫥\udbf1⑵范◺\uf318㣥揭䞵쬀\u2fda쬙䇅毮㰵쬝◚欘侅쯯㖕ጞヺ묙㝥䏩㻵謝⓺ጚ䈅㏩㳵䬙〺猝⛅揪䟵⬚⡺쌘媥Ϭ䍕\uf300㛚ꌘ䋅돪㒵㬜孚\uab1b仅揭⿕\udb06䄚茛㼥䯮㦵謂⓺ᬝ⥅⏳ふ挙ペ⌝䮥\ue3ed䰵ጀ\u243a挝㺅诵㻵\ue307仚㌚䄥鯬㜵\ue31d㷚䌛ㄥ㯪井匟䀺\ueb06㻅돬⥕ꬆ䷺猆俅㏬媵팜\u243a̞䏥ϳ❵鬜㤺쌂䷅᯳⑵欀㳚\ue31a䷥珰伵挝䧺\ufb07㕅ﯱ㗕\udb06㵚ꬆ伅㯮䬵㬝㗚묙々诪侵匝䄚ଇ㯥菱㋕\ueb1e㰺錄孅⏳嬵̞㰚猂佅菬㶵猆⚚⬙䪅寬㤵\ufb07㡚挘䵥믬▕茆䃺ꌛ⚥௩孕茟Ⓔ̝佥쯬㌵⬞㥚䌄䈅\uf3ee㍕謟⚺\uf305䮅诮㉕쬙䭚錝㶥叮◵팟㕺錂䪥௯㱕\uf31e侺䬚⣅叭䧵묆䫺錝䈅揪㮵ﬞ㣺ଙ䩥䯰❵鬙䲺㌞⚅\ue3f1㹵ଃ䀺挆䇅䏬ㇵ팆㐺猂ュ⏳♕\uf31b㑺猄婅鯪䋕ଟ仚쌝俥௩\u2435댂㜚䌇㺅ϳ㽕䬜㶺ጇづ\udbf5㎕ꌝ⤺\udb19❅\uebf4念錀㤚\uab1d㊥쏮䊕欙䍺ꌙ䌅쏰仵⬟〚쬙㕅⏬㼵ጟ䅚䬝㔥\uebf4䋵㌟ペ匞㷅㏳㶵ጃ䧺㬝䀥䯪◕\ueb1d䄚̝⡅⯩㔕ﬁ为̇䴥\uf3f1㗵ጀ㢺茂㊅叮㷵묝䆚錄♥ꏰ㥕댙为쬄䲅诱䋵\ue300⤚댘Ⓟ쯯䊕\ueb1d䭚猇⾥䏩ㄕ㬃◺欚䏥寪㈵茂㋺쌙䀥돱⚕嬟䴚ꬆ㞅菱伵錀㟺㌇䷥寯㟕댜䃺嬘┥ᯪ䆵錂䴺猘㺥폯㗵댟㶚\udb06㎅\uf3ed䊵\udb02⛺ꌘ㸥鏳䇵묝㷚\uab18▥포㣵ﬂ⠺쌘䞥폱ヵ\uab1c㕚錙䋅ᯰ〕笜㎚⌘䶥ꏵ㲕笀嫺䌙㏅鏳䷵䬜䴚⬞䴅௮媕欞❚̛㷥右䵕猆䌺댂⒥ꏮ⚕ﬃ㖺\ueb04㺅⯮␕\udb02㸚猆㊅Ϫ孵묂⒚嬄嬅䏮㈵ଙ㯚ጙ❅䯮㓕欞㶺㬛\n\ue8a8聡ﶘ偩\ue737졭\ue628낚\ue558灩\u0010磜\u0d80烬半豣ꕶ曼⎹马赍耣畴珜떿皌알\n\u197f畭᥏斚ᝠ\udd91\u16ff앦⦏薕Ā镊䀁蘺\ue0f8ꂕჼ鹪〆뾚胵꾵裵ꪪ\ue00a餺샷鐵僱鍪砋ꂺჱ鰕ꃼ饪㠁鼺䃵颕烺闊ꀇ뾺\ud8f7阕주裊怄铺惺뾕烰鉊ဇ邺ᣴ鯵ー雪倅鞺䃻ꇵᣲ鷊렄Ꞛ\ue0f4钵\uf8fc闊\ue80cꍚ郴阵\uf8fe韪\uf004鱺\ue8f6鋵\ue8fc靪전꽺郻褵䃳鰪蠉ꍚ\ue8fa陵棵藊㠂鿚郴ꏕ惿袊耉괺䣴隕냾ꇪ。ꯚ\ue8f6鄕壳ꃊ⠂ꧺ⣻蒕\uf8f0虪렄裺棺ꊕ胼鴪。꿺\u20f2ꂕ䣱ꉪ䀂ꍚ\u18f6餵ჶ꾊\u0001陚샺鎵ჳ韪⠈걚僷铵룾꺊\ue806\ua7da棴銵⣵ꂪ瀆ꇺ탸蓕ࣵ裪䠆阺탾ꏕ僰몊퀍邚\ud8f8ꏵ탿鷪ꠄ뾺磴ꀵ䣶锪쀈藺惷곕ꃵ藪\ud806멚ꃴꂕ룵꧊젍ꏺ탾굵惼곪젍\uabfa䃻鋕ン隊\uf00b꽺⣻꾕䃶饪\u0001ꧺ僱衵ࣵ鈪퀄衚õ곕\ue8ff蔊 궚㣷邕ࣵ陊뀍襺탻馵郾醊瀍頚냵鐵胳蕪뀈긚\u20f5궵\u18ff袪⠁먚ࣸꮵ냺꺊耄鼚⣻꽵⣶酊頇闚\u20f4鱵䃰꭪ဆꞺ\ud8f1\n㕧獮㕗掃學\udb82嫧썵䶗莆\u0010欽跸响蔅稂唏䒝跶檭Ԅ欂䴀坽淲䣍괄\n㲦茬㆖叜㌹쯘㈦댯ㅖ珜"
         .length();
      int var26 = 0;
      int var27 = 0;
      short var28 = 22622;
      String[] var25 = new String[10];
      int var24 = var10001;
      String var23 = "Ώ엖鳪㇁顄呦\ueaec⍻ꞡ顥ᇢ爲ㆉ៩ལ펰욮笧惐큺︵폽ﯴꀐ꼺华襔ࠩ柾Ɓ둮\ufdea\ue1b3グ畐咡ヰ\ueb79䩃Ꙩﴊፏᦔ洟쑟\uf0caד짭\ue065둿擄䇖銈ᘙ㭁煂鞲䜡\uee47㏖堹쭰溚⍒Ṝ௵鶦䒮蛕뉵⊐Ϸೡ膤㤥എ餽旈샞ځ䟞몣\uab00쩘鹇В诨ꑑꋳ鳞ᝓꐷ爈三㰙\uf686藗ꤊ탘ꏬ쐆셏ힷ쥢乣긑\uf711ᙾ\ue1fc\uf8ff璚᷈ꀒ뛑熯车鳊\ue74d\uede4\udf0eே\ue972쀞ѣங찣䬋\uf060뭠뱥╳볉␋묬ᔚ딟⧼\udd02\uee3cᬎ\uf6fb譸횅ᾰᆾ塊躭쟥ು\ue89f똱\udfd0浲䷩茕ക⿰앢熬庹烾\udd6f⫦꒡霅놄䗓殏\ue127蝓氍ฦ\uf0ba堢쮷玚\udddb㘎탩ਂ婟鯮㯬ࡅ텈\ueb06\uf13f\u0e7e﹊풓憫\ue374끼ℓ늗㣣ȭ甑㶆㺫씠ವ瘙ຫ棻\u1afeＲ\uf772ꔮ﹐洄狖䢥틸ᆌ\ude5eᎵ릐\ue7b9✌췆ᄗ䙃徙⢃ꯅ趨핋鰃\uf8d0ⵖ㪎英䜔ꍫ뙚⟪ﾜ쨘쬻悹ﰏ띈≿\ued68细ח㜲ꗞ₻綟ᇕ㪴\udd2dᥒ䍽\u0bd8ꡏᰡ\uece9醹\udfe4\uf6bd㊽\uf684亞몱駯븿\ue019䮱崪墀ө葐豈␦줜㜡㭂\ud82e锹氨䷜쿲䕛\ud823癙\uddb5䧻휸烑\uf055岹裋䧶\ue0bb䟸瘓큁\uda34뼍뮕\ue008蹤\u209e삵銵셎鍽쟟\u19ce\uef11ా\ue0a1⨶嵰뵹쥷ẩ백\uec19먊䷐읨렅蔛岈▮\u0ba6ꙍ⇲ↂ懭\uf6b8䀻ﻢ椻\udf50搽팈ὐࠖ\ue74eঃ蘷왿텱䇋\ue6e7떮\ue490릭瞥롒蟰距\ua62c斯䈒ᯅꕂ括䂨鿁黙Ⰼ푱퓬켏掛玪툘晿\uf1f7䍎\ued1d鱆빣塂\ue079摼욳類钧౾협ᆒາ\ue9cf龉䎢蓱\uecb2芲ꖀ뼉㈻\ueed0쯆늞뜐쪍쐏덏冫맨⏟ꍰ鹁\uf261㙏ᓳ辤旔ﬆ鞨먛\ue455衊\uf468킴\ueab6\uf199㮝苅䄸\uf5ba떼ꡃ噺\uf700ꬹ卯旁싽\uddca䚆镎뜣衲ɸ쾕믩떸䊀塆ꅴ㱷뗢\uf291\ud87aꇩㆧ拱쳙늙夒\udced칔ꞣⲌ듙귮\ue309ﾥ㪓֚鏃揨序ǒ⯆腤䨝萨컰鎾翩癔煣⢩\uf4f7裄廞Ḝ\uf376狟ꐅЄ⚿㶙왂烊ƻᧄ㥏掸⟕ഃ䕝瀜ꌎ\u0ffa\uebd8褥苠枟\uf04d\uedaf\ue15bࠃ䨑Ȋꞝ騣\uef90鐣켸璂鿱銬ꌞﵭ瓦\ue9ca\ue036ꕅ騮翍緇쑡砥\u0dc8挽捎၅韠安个ꨑℎ喻浲\uedd8ꓪ藝ꆘꟘ\u05ff⽯읺昷ൾ䅛\uf49b鹏櫍꜅ꔷ鿬웹㼩ᘔᕣ쁁怒봒쒦\ueec9Ὁ⇦\uec0f㎝旐㟔솘엘孊咞핝ರꌁ렷녋瀔嫈ጻ쯙㒾ꖛฎ믫릚鋝擠竴࡞ḉ긔偱ﶎ喟⚇\ue5d7\ud8f4ꎗ䇬▽ᇜ위㠏\u12b7뚀ᖲ㎹\ue822呬㱋䍁啦\ue109\ueb86겤\ud84dቒ\ue6d8괻뇆횢⇜ॊ⧽\ue75b犱辮ݎǾ귮쓘띫蚐쪐ꗞ充㌆㕬혨闒\uf80c\ue094\ua87f\uf342秊◗䉫掷蟽鵖痓✃凎梓塞䦟黪쑿ꞧ芯㨭偉ꞠꬤΧ玍ꍘ叜ࢲ蕳\u0efe抾쮂䫿텟＃\u1754昢ⴏꗓꉒ\ueb73\uf5ba삙\uf6e0\udb11\ufbc4㫨Ǿ풀⠨햽潚ಾ\uf159\ude47\u20fd၂ᯞ䂘묨᷻率憏棣֪轝뒜㗎읆血Ṩ眂\udd23ᗹK㇣婉鯚\uee42\uf52d⟂清헡儠הּᎅ⁾쇳阄鍆\uf70fꔁ\u086d찒\ue652≄嵿橔⬤褏똸\ueac7ᛜ䷀\ufbd2妧퓸馆࣬찳聅荒犯\ud950\u173dﴲ䡱战뛍ƻ\ud9d5冢빅\udecbꊖǾ✝≥仴蘮ⴄ䚵쿲쾥帲\u1bf8歕辮밊\u0ee6椣檠䗗⌶燺ᮾ☐ⴣ蒩嚯誓竌‒뗣雃玃㪗ꉞ쟶礑ﲷ赚\ud8bb\uf88f㺟毅粛黉ˊ锘悸ᙙꌒ\udb70\ue254迚估릌\uef60僯ﱐ쬍熋톉㑞\uedc1\uf19b숥䇣\uf588粸퍩\ue730ꎫ\n\uf677曅킰⪰㳲╵ꪘ穳⦒榕ꝓ캝\udce5菝嘤꽿騈ꝝ㖸촵\uef50薼뵒勵绱◗䉶庹\ue4eb溆鐨욌㲎ᨡ퇜䖥癱뿊흰\uebee\u2fd9ӝ棰\ue22bԬ챐찞썱ꦧ僧Ǿ峑敃鎎亳ﻶɻƔ紂仆约ꌂ溝諥㾌▦靶aꞓ\udbc3跣⬨ꚭ栒췉毚ꙥ烋\uf865㓞ퟐ\ue7f7\ud946⧫槂ॉ嬖贋ˌ쨏亀㛤\ue406﮶渢\u19af\uf2e8泲弣剭逮\ue5a2\ue54f䍆娼폠టퟹ땞⛍䤸⛘ଢ佀뻿㙶㱦袬ᚨ뽺⃖钡랺译\uea7a멭ꓒ钒曹䵞皷ￎ悑ꐾꢲ❘ᆾ莨鿰ƕ퇓껁嗒裻⩮橷\uf7fb릮䴜얋\ue043穽∄ₚ葯㯁귟콪칄岼⤞\ude03\uf577䉓\ue9b8̀☥௪㓵㬙㇚嬝⠥쏰␕ꬂ䏺䌄㗅Ꮹ䃕ꌜ㌺\ue304❅\uebf1㶕쬆┺\ue319⚅䯳伵ଝ㙺指㌥篮㍵ጜ►̘䴅珪併⬀孺茘㳥ꏮㄕ䬙㒚팙䳥ᯮ㻕㬀䫚\ueb04䧅珬䊕⬚乺㬚䷅㯯䦵\ue31d䨚笆㵅可㇕⌙䞺ᬝ䈅폰㎕挞⤺\uab18⚅寪⛕묀╚댇䂅쏪◕ᬃ⣺鬂㮅ﯴ㼕ᬝ侚묙⒅毱侵㬙⣺ﬅ☥篪㍵ጃ嫚㬘㓅믮❵挜⣚䬘㐥믵⿕猝㥚ጙ╅珮㸵ᬃ㠺猙㛥菪㙕\ue302㇚ଇ⢅\udbf0㈵\ueb02㳺\uf318♥菪㍵䌀㑚䬘䧅诮␕嬀䄺猝䊥\ue3f4⠵錃㡺謇䭅꯰㼕\ue301䨺㌛䪅鏳ふ䬟㴚錂䌥⯭䃕ꌃ䄚ଙ㗥篪䨕ᬃぺ\ueb06㧥珮▵䬝㊚謂俅\ue3f1㏕댝㐺鬆★㯭䏕ꬆ㲚\udb1b䮥\uebed䉵嬟䊚\ue318䊥寰㦵쬙㞚\udb07╥Ϫヵ쬙㹚䬞㤅믮⢵\uab1f䰺ጝ〥㏭婕ﬞ䮚㬛㎥鏵㲕鬟䧚\u0b04Ⓟϳ䄕鬙䉺鬆㐥쏪❕㬚⣚\uf31b⡅Ꮽ⚕ଞ䇚䌙亅ϰ䲵茂㮺鬄㽥돬㋕\uf302㻚㌇ヅ돰䋕쌆㻚䌛ㄅ鯪㷵錙䍺\ue305ぅϩ㓵笃㼚鬝㾥寪㚵㌞ㆺ\uf318㞥台⤕⬟ㇺጇ䫥\udbf1⑵范◺\uf318㣥揭䞵쬀\u2fda쬙䇅毮㰵쬝◚欘侅쯯㖕ጞヺ묙㝥䏩㻵謝⓺ጚ䈅㏩㳵䬙〺猝⛅揪䟵⬚⡺쌘媥Ϭ䍕\uf300㛚ꌘ䋅돪㒵㬜孚\uab1b仅揭⿕\udb06䄚茛㼥䯮㦵謂⓺ᬝ⥅⏳ふ挙ペ⌝䮥\ue3ed䰵ጀ\u243a挝㺅诵㻵\ue307仚㌚䄥鯬㜵\ue31d㷚䌛ㄥ㯪井匟䀺\ueb06㻅돬⥕ꬆ䷺猆俅㏬媵팜\u243a̞䏥ϳ❵鬜㤺쌂䷅᯳⑵欀㳚\ue31a䷥珰伵挝䧺\ufb07㕅ﯱ㗕\udb06㵚ꬆ伅㯮䬵㬝㗚묙々诪侵匝䄚ଇ㯥菱㋕\ueb1e㰺錄孅⏳嬵̞㰚猂佅菬㶵猆⚚⬙䪅寬㤵\ufb07㡚挘䵥믬▕茆䃺ꌛ⚥௩孕茟Ⓔ̝佥쯬㌵⬞㥚䌄䈅\uf3ee㍕謟⚺\uf305䮅诮㉕쬙䭚錝㶥叮◵팟㕺錂䪥௯㱕\uf31e侺䬚⣅叭䧵묆䫺錝䈅揪㮵ﬞ㣺ଙ䩥䯰❵鬙䲺㌞⚅\ue3f1㹵ଃ䀺挆䇅䏬ㇵ팆㐺猂ュ⏳♕\uf31b㑺猄婅鯪䋕ଟ仚쌝俥௩\u2435댂㜚䌇㺅ϳ㽕䬜㶺ጇづ\udbf5㎕ꌝ⤺\udb19❅\uebf4念錀㤚\uab1d㊥쏮䊕欙䍺ꌙ䌅쏰仵⬟〚쬙㕅⏬㼵ጟ䅚䬝㔥\uebf4䋵㌟ペ匞㷅㏳㶵ጃ䧺㬝䀥䯪◕\ueb1d䄚̝⡅⯩㔕ﬁ为̇䴥\uf3f1㗵ጀ㢺茂㊅叮㷵묝䆚錄♥ꏰ㥕댙为쬄䲅诱䋵\ue300⤚댘Ⓟ쯯䊕\ueb1d䭚猇⾥䏩ㄕ㬃◺欚䏥寪㈵茂㋺쌙䀥돱⚕嬟䴚ꬆ㞅菱伵錀㟺㌇䷥寯㟕댜䃺嬘┥ᯪ䆵錂䴺猘㺥폯㗵댟㶚\udb06㎅\uf3ed䊵\udb02⛺ꌘ㸥鏳䇵묝㷚\uab18▥포㣵ﬂ⠺쌘䞥폱ヵ\uab1c㕚錙䋅ᯰ〕笜㎚⌘䶥ꏵ㲕笀嫺䌙㏅鏳䷵䬜䴚⬞䴅௮媕欞❚̛㷥右䵕猆䌺댂⒥ꏮ⚕ﬃ㖺\ueb04㺅⯮␕\udb02㸚猆㊅Ϫ孵묂⒚嬄嬅䏮㈵ଙ㯚ጙ❅䯮㓕欞㶺㬛\n\ue8a8聡ﶘ偩\ue737졭\ue628낚\ue558灩\u0010磜\u0d80烬半豣ꕶ曼⎹马赍耣畴珜떿皌알\n\u197f畭᥏斚ᝠ\udd91\u16ff앦⦏薕Ā镊䀁蘺\ue0f8ꂕჼ鹪〆뾚胵꾵裵ꪪ\ue00a餺샷鐵僱鍪砋ꂺჱ鰕ꃼ饪㠁鼺䃵颕烺闊ꀇ뾺\ud8f7阕주裊怄铺惺뾕烰鉊ဇ邺ᣴ鯵ー雪倅鞺䃻ꇵᣲ鷊렄Ꞛ\ue0f4钵\uf8fc闊\ue80cꍚ郴阵\uf8fe韪\uf004鱺\ue8f6鋵\ue8fc靪전꽺郻褵䃳鰪蠉ꍚ\ue8fa陵棵藊㠂鿚郴ꏕ惿袊耉괺䣴隕냾ꇪ。ꯚ\ue8f6鄕壳ꃊ⠂ꧺ⣻蒕\uf8f0虪렄裺棺ꊕ胼鴪。꿺\u20f2ꂕ䣱ꉪ䀂ꍚ\u18f6餵ჶ꾊\u0001陚샺鎵ჳ韪⠈걚僷铵룾꺊\ue806\ua7da棴銵⣵ꂪ瀆ꇺ탸蓕ࣵ裪䠆阺탾ꏕ僰몊퀍邚\ud8f8ꏵ탿鷪ꠄ뾺磴ꀵ䣶锪쀈藺惷곕ꃵ藪\ud806멚ꃴꂕ룵꧊젍ꏺ탾굵惼곪젍\uabfa䃻鋕ン隊\uf00b꽺⣻꾕䃶饪\u0001ꧺ僱衵ࣵ鈪퀄衚õ곕\ue8ff蔊 궚㣷邕ࣵ陊뀍襺탻馵郾醊瀍頚냵鐵胳蕪뀈긚\u20f5궵\u18ff袪⠁먚ࣸꮵ냺꺊耄鼚⣻꽵⣶酊頇闚\u20f4鱵䃰꭪ဆꞺ\ud8f1\n㕧獮㕗掃學\udb82嫧썵䶗莆\u0010欽跸响蔅稂唏䒝跶檭Ԅ欂䴀坽淲䣍괄\n㲦茬㆖叜㌹쯘㈦댯ㅖ珜";

      do {
         char var29 = var23.charAt(var27);
         int var31 = 0;
         char[] var30 = var23.substring(var27 + 1, var27 + 1 + var29).toCharArray();

         do {
            int var32 = var30[var31];

            var32 = (char)(switch (var31 % 6) {
               default -> 106;
               case 1 -> 35;
               case 2 -> 26;
               case 3 -> 208;
               case 4 -> 21;
               case 5 -> 212;
            }) ^ var32;
            if (var31 % 2 == 0) {
               var30[var31] = (char)((var32 >>> 5 | var32 << 11) & 65535 ^ var28);
            } else {
               var30[var31] = (char)((var32 << 5 | var32 >>> 11) & 65535 ^ var28);
            }
         } while (++var31 < var30.length);

         var25[var26] = new String(var30);
         var26++;
         var27 = var27 + var29 + 1;
      } while (var27 < var24);

      aabaa = var25;
      aabab = new Object[var25.length];
      byte var39 = 0;
      aaabb = new int[589];
      int var48 = 0;
      byte[] var10002 = "\u0086òÍ~\u008eÞü¬_Éè¾áV¸¿óÔ\t@\u008dMî°d¼tl\u0089î\u009a?\u009f<Yµ»´á\u0094o\u0081\u0093\u0089h¶j\u0003!w¡ö»\u0091\u0005\u009a®\u0092ûÌ±ª\u001fP\u008a\nZÃ\n»\u0010K1\u007fC\u008f\u0091~Ö<\u009d3c\u0097HêùZ\u001aU 5å\u000b}\u0006\u007f\u0000(yüÙÃ\u0098«\u0081BüX\u008bK~b]¸ê¾Â{\u008a\u001bÚ@Òr£ÛO\u001c\u0014ÊüfÔ:¬\u001b\u008f(ö\u0004A \b.~Q]C'3ô#1Ï\u0098ï8¡Äù|ó¬B\u00110\u0089\u001auXp8Ê\u0093åX§ïýkQÆ&¹cNÜ\u0018I\u0092\"h\u009a7Ð\u007f½\u0097!û\u001a\u009cé0_\u0096ÙûòuÖÍªÆ\u009fLÄ¿àWtNøGdÞÉ\u0013DÀC\u0004ö®PVS3\u00adM\u0088GI\u00adãâ\u0091Æ8°·\u0002/:Óã\u0003\u001f_þÊÔÈíÁ\u008dHG1$¯ß¸%F\u0089ª\f£f\u0011è\u0006\u0080ah\u009dåRJâÎ\tüµ¡²®\u0086\u0099äÚ$æ¹iq±ü\u008bóà£,\u0093\u0001\u000e;^G« Èþ¾?åP\u008e8\u0094Ð¸î\u008f\u0003\u0092ä$µ%\u0019lE-Ë1Y¨\"\u0001\u0082Íò\u0090ôÜîgèg=N\u0000q¸¬Í\n¾¬¤<\u0014(nd\u0011áS#!YA\u008a\u000bL<VÞ\u0099\u0082?çr KY0\u008cÄl\u0000øc\u0005\u0088ÂÓ\u0006\u0086\u0090Ñ5ý\u0089¨ü\u0089¦tfÂ\tAWH¥\u001f\u000f\u0094NåAh×æOà}<ýº¯\n\u008d\u001eÍÝázÁ\u0004\u008aW\u0007\u0003$»\u000bÏ4K\u0091ç\u0006ÇF\u008aÌÿÙ\u001eÆUcH\u000b÷IKÒ \u0096ýRäL÷|S,<åWÛË;\u009bÙ\u0088UÝõ\u0001Ç¸±+?3´¡¤\u0098Q¶<\u009c¤½à\u0080t)å\u0087\u0094â3ø^Ï&Óµ\u0082[h\u0002\u0089,YøÐCQê\u009cÁn&×xª\u0004wWÚ\u008e\u0001¡;W8Üc\u0080$Å\fó\u000f0\u009fxÿ1Ð\u008a\u0015\u001f=@¦Ó.ÓérÙz÷$v¹\u0094J«º\u0011zZ¢\nc#u9;²Ã@3y4\u0097âïtø»¡Áæ2n2È£C\u000b\u009d\u0004F\u008cSÞ\u0010\u0005\u009bqÖÄ\u0013\u0095uc\u008aï\u009d®\u0018'´&È\u007f\u00916ÄÇ°\u000f\u0089\u0018jÙ\bà/¹\u0013Ä¢\u001a©\u009fá\n\u009d7,L\b?½É5\u0098\u0007ÎP<¿À\u0000 YY\u0015r³%¾=%\u0007Q\u0017\u0018\t¤\u0017\u0096ä\b©\u00844wêb2\bñÅ]À\u0018\u0083*\u009c\u0097EÈÐî$\u0085Ó>è\u001dØÈR\u0091IH\u0091\u001cº\u0015\u001a.Å9\\wñiµ:\u0088MÅ\u008dÚ%ÁuN\u0013«Éø·Ä\u001b\u008eæ\u0094\r\t\u001144BA\u0018I\u001144}Xk\u0010j&GÍ:6T\u000fòºmª\u0011¨\u0083ò1\u0015r¯Gu\u0085}9Yÿ\u008fë\u008cW\u0098óñ ç÷:r|þþ,M\u008cTì\u008e\u0013¡½dÿS\"§'\u001eUEê\u0080@\u0004\u0014'ãÊõÄ\tú\u0018c'Tõå\u0011\u00133-\u0086\u0087µÁ\u001czÀÊí\u009c\u001fUåØÿt-\u0082;à_\u0001¨EmU\u008a@\u0082ü;\u0011Å·\u009e½Ý®ð\u008b\u008eã/´ÜZWñÝ\fö\u0092~êÄ\u009c»àW\u0010Û\u00adä\u0094q¿+UÑvßÝ\u0010\t«§:[\rmÿ£Ø\u0002Ã`hâ%|xêòµ^\u009b\u0007:\u000eó¯i\u0001\u0012\u0012ê,FäpNìÝV\u0007\u0094ô\bWçQS\u009c\u0081\u009cüóÎ\u0007ý#÷\u001bÃÎ®\u00822nº\u0015ÕÛ#G°åçP\u008f\u00ad§G\u008d\u0014×r\u0014ñ\u009bzÏ\u0001M\u008cu\u0083º±È\u0089¡Ñ\u009eãÓñÑ\u0015wÛîyoÖ§\u0007\u0080ÚSÅ\fÖÏ(\u000bXë°\u00871Ø¼\u0017K\u0092æí?b\u008d8§¿\u0090\u0098\u00ad,xû5\u001c\u001d³.\u000b\u0093l\u0087ê\u0080V\u000eX2Åâ¦ÆÓ \\á§õäì}o\u0006\u0005þ©?×úó\u0081\u009f\u001aê\u0090\u00ad¦J\u0010v\\\b[/ '\u000fc±\u008cA\u0005\u001dnË\u0088S\u000fBÛ¨«ñ\u0088øà\u0001µ\u009ba»(ÂÞÈ.l\u0011q\u001b®K\u0017Þ{B\u009aØÆ\u0011\u00147ù1\u0089í+\u008aê§Y$IÞî~)å\u000eæ\u009bI\u009aö*\u00195\u008cþÏÕõ\u0018\"c³`¦õ~J¯lDdB»\u0084øó\u0098(+V,±ì}eR7ßÔö¿!$1[\u001b¶A\u0018\u007fQ\u0098ú\fz\u0006Qz{\u009b¶!`Ñü\u00972Ò\u009e8`¾DÖìq\u0084\u009d\u0083«Æ\u0085\u001aÎhh7\u009dïç-TÒ|\u009eÀ\u001f¿6\u0004Á\u0095Î1mc\u008aµ\u0002e-y\u009e%Ñ\u0000ñHV^\u0000§¥%e%\u0085~Çý\u008f\u001a¢?I2'æ#\u000fS÷±¡ ;\u0095æ<\u0013W\u0082gJuNµö\u0094\u0084&à\u0005º5&#w$ÆPb96ê\u0012\u001b\u0017hÊJ\u001a\u0088\u0084\u0094\u0080Þòñ(zv\u001e±\rw¨\u0081ú»dÎ±p\f|Ë\u0091\u007fßg¨\u0012s°\u001d\u000f\u0087\u008bcM:\u0096s\u00ad7\u0086\u0081`!¶Ï\u0089j÷#ú\fmð*\u0002\u009eÜ~::½\u0097ÓuÜ/\u0088¹D\t\u0017_ÊCK\u000e¡à§`ß>\u0088\t\u0093>V~f\n¨ê\u0016e¼¼6Ú\u0096^\u0097ºì\u0084\u0014&¾GÄß*Å4\u008a\u007f\u0086õâL/\u009e\u007f\u0088öàÛ\u009e\u008e<jº Ût¥\bgß5Î\u0098¤~\u009b\u008d\u0014÷4Ä\\\u008f÷Ã¸ZÊ0x9^&*&Ñ\u000eôN`\u001diE8\u0091°Ò\rÔ\u0081\u0096ºeÙ1Ä'KrM\u008aPývÐ\u008aÇ{\u00ad-1Âð¹]ÕÐÍWü\u0092tñJ\r\u0083Óe\u000eC\u001f!Ø\u009d\u000e\u0087¶\u0011\u008e\u008c7 tFÅCu7Üli¦^\u0082ì><çûÁ'ë\u001aÀ\u001b\bÑ\u0097æå[\u000eËQ_¸¢`5î5¯)ÚR\u0013\u0089\u009ekç]zþ\u0085çZ\"oP£\u001c\u0017?Gßã>\u0007}ôU<àÐ\u0099+,\u0014\u0080ç*\u0099ë/bÿÃ$£ÓåÊ~ý½\"uÎ\u0085Ù6[=\rAÖtá\u009e°]à\u008c\u008a°½zä_Ü\"/à\u0002Ã¨ù°m\u0093÷è='\u0017bvÔ\u0014÷\bå«¶,hÂÓ¼IóMyV\u00adFØ\u000b\u0090\u000e\u008f'< [[½\u008b¬uf \u000bOcPgõgèÐ\u0083fÌ\u0011\u0080Áù&â\u0088»\u008eÖ%ó\u0007xß\u009f\u0080¨þ[[Á#\u0015ÚÒ\u000fbwÇÙÎ\u0094\u0006?ú3â\u00adüÛ\u009et\u009d\u0015æÄ\u0084è\u0018î\"\u0014ü\u000e\u001f\u0081Ö\u0099w]\u009b;\u009bÈË\u0081Q×á:\u0012ØÐ§\u0083ùX\n\u0093\u0092C\u0082Vîí5ãúæSÎUÙôG>\u0007wÝ\u0085f'®Ù\u0001£Í·éÔ¼Â\u0019@Ö¯¶Á\u0089öz.6j¯«-\u0001Ù¸\u0000Û]é\u008eã\u000bÏò\u008f4\u001c\fKB¬\u0097q*¸n¤]´à\u008a±p\u001ci¸¢$]Æ+\u009a½\u008d\u009c\u0092½Ã;\u008d\fw\u000f\u0097?\u0082\u0002!-\u001bÛ\u008bõN|Ï\u0004\u001d6ù<\u000fûj\u000fÆOâ\u0005%\u0084L\u0013 )è\b^º\u0095O»Nàý\u0087P÷@TOª\u007fC¹\fÝPÏO\u008cÔ²`\u009aT\u0001ñU\u0080\u0090{Ö=ø¥¸£T\"í\u0081Þ\u00835È\u000e%j\u008eüOQ\rþ\u00951\u009fËæöü\u000f\u0083ÿì8Ì,\u009f\u0016¤\n\u0096\u0086\u009bÙÈTâ\u000bs<\u0098jr\u0014h\u0083tÞÇ\u001b\u008a:G¨l\u0086øØ\r\u00997\u008a'ÌpúP©ýîn©G^º~Ö\"Òùúf«\u0084ÒE\u0088ºü¨3\u007f`JR\f[µ-¹¯¨òôaÔT·üð{(D\u0092Ê\u001b¶!t¹\u0087b\u008e¹©©\u0081\u009bsÚ\u0094(p\b\u0012É¹\u008c\u000bð^\tH\u001cbþvrÏx¹\bï[\u0095ôÑ\u009dÐ¿A\u00ad%yn \u009cÊWPB\u0013\u0012m\u0015\u0006Û\u001c®ükÍ\u0019Â\u007f\u008a\u0015\u007føãñN4¶[&¼#\u0080$?\u000b\u0006æE×Ò\u009dá\u0093aºæ\u0094\u0011UC\u0005à\u0013æn\u000f\u0002Qd\u0082\u008cö:3é\u009cî\u0092#¥\u009fM5ú\u0084j\u001a½; i\u0090d(ÔËR\u00ad³\"¤È (5&yÝä !:\u0086\u0004Ú\u008e@H"
         .getBytes("ISO-8859-1");

      int var99;
      do {
         aaabb[var39] = ((var10002[var48] & 255) << 24 | (var10002[var48 + 1] & 255) << 16 | (var10002[var48 + 2] & 255) << 8 | var10002[var48 + 3] & 255)
            ^ -1418797920;
         var39 += 1;
         var99 = var48 + 4;
         var48 += 4;
      } while (var99 < var10002.length);

      String[] var21 = new String[a(1176327889, var33 ^ -103289296)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = ababba(var33 ^ 283978073, '\ue07e', '⽕')).length();
      int var17 = a(1176327890, var33 ^ 228744197);
      int var37 = -1;

      label141:
      while (true) {
         String var40 = var18.substring(++var37, var37 + var17);
         var48 = (byte)-1;

         while (true) {
            label136: {
               char[] var53 = var40.toCharArray();
               var99 = var53.length;
               int var22 = 0;
               var78 = var53;
               var48 = var99;
               char[] var103;
               int var125;
               if (var99 <= 1) {
                  var103 = var53;
                  var125 = var22;
               } else {
                  var78 = var53;
                  var48 = var99;
                  if (var99 <= var22) {
                     break label136;
                  }

                  var103 = var53;
                  var125 = var22;
               }

               while (true) {
                  var103[var125] = (char)(var103[var125] ^ switch (var22 % a(1176327469, var33 ^ -95518950)) {
                     case 0 -> a(1176327470, var33 ^ -1945293143);
                     case 1 -> a(1176327471, var33 ^ -249415619);
                     case 2 -> a(1176327464, var33 ^ 1119088730);
                     case 3 -> a(1176327465, var33 ^ -751209467);
                     case 4 -> a(1176327466, var33 ^ -1142482223);
                     case 5 -> a(1176327467, var33 ^ 392187873);
                     default -> a(1176327460, var33 ^ -1648259043);
                  });
                  var22++;
                  if (var48 == 0) {
                     var125 = var48;
                     var103 = var78;
                  } else {
                     if (var48 <= var22) {
                        break;
                     }

                     var103 = var78;
                     var125 = var22;
                  }
               }
            }

            String var110 = new String(var78).intern();
            switch (var48) {
               case 0:
                  var21[var19++] = var110;
                  if ((var37 += var17) >= var20) {
                     babb = var21;
                     b = new String[a(1176327468, var33 ^ 216587573)];
                     long var8 = 7366186908309475953L;
                     long[] var14 = new long[a(1176327461, var33 ^ 1298647217)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = ababba(var33 ^ 745363724, '\ue07c', '\udd88')).length();
                     byte var10 = 0;

                     label115:
                     while (true) {
                        int var60 = var10;
                        var10 += 8;
                        String var42 = var12.substring(var60, var10);
                        var60 = var33 ^ 410217408;
                        char var84 = '\ue07d';
                        short var111 = 24372;
                        byte[] var15 = var42.getBytes("ISO-8859-1");
                        long[] var43 = var14;
                        var60 = var11++;
                        long var85 = (var15[0] & 255L) << a(1176327462, var33 ^ -1089604833)
                           | (var15[1] & 255L) << a(1176327463, var33 ^ -1109945356)
                           | (var15[2] & 255L) << a(1176327456, var33 ^ -2002496360)
                           | (var15[3] & 255L) << a(1176327457, var33 ^ 1287740817)
                           | (var15[4] & 255L) << a(1176327458, var33 ^ 2072940265)
                           | (var15[5] & 255L) << a(1176327459, var33 ^ 1441179865)
                           | (var15[a(1176327484, var33 ^ -975602798)] & 255L) << a(1176327485, var33 ^ 396405034)
                           | var15[a(1176327486, var33 ^ 2145044523)] & 255L;
                        short var112 = -1;

                        while (true) {
                           long var127 = var85 ^ var8;
                           switch (var112) {
                              case 0:
                                 var43[var60] = var127;
                                 if (var10 >= var13) {
                                    aabb = var14;
                                    abab = new Integer[a(1176327472, var33 ^ -1162296191)];
                                    aaba = aaabba(a(1176327473, var33 ^ -946850506), 4617849656359563494L);
                                    long var0 = 3332627117354940314L;
                                    long[] var6 = new long[a(1176327474, var33 ^ -104986021)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = ababba(var33 ^ -2147469282, '\ue078', '뒟')).length();
                                    byte var2 = 0;

                                    label105:
                                    while (true) {
                                       int var65 = var2;
                                       var2 += 8;
                                       String var45 = var4.substring(var65, var2);
                                       var65 = var33 ^ -850234008;
                                       char var88 = '\ue079';
                                       char var115 = '곷';
                                       byte[] var7 = var45.getBytes("ISO-8859-1");
                                       long[] var46 = var6;
                                       var65 = var3++;
                                       long var89 = (var7[0] & 255L) << a(1176327475, var33 ^ 1008920661)
                                          | (var7[1] & 255L) << a(1176327436, var33 ^ 1327044461)
                                          | (var7[2] & 255L) << a(1176327437, var33 ^ -85128517)
                                          | (var7[3] & 255L) << a(1176327438, var33 ^ -1222412794)
                                          | (var7[4] & 255L) << a(1176327439, var33 ^ -188853728)
                                          | (var7[5] & 255L) << a(1176327432, var33 ^ 1795567790)
                                          | (var7[a(1176327433, var33 ^ 1492419355)] & 255L) << a(1176327434, var33 ^ -87703328)
                                          | var7[a(1176327435, var33 ^ -85259283)] & 255L;
                                       var112 = (byte)-1;

                                       while (true) {
                                          var127 = var89 ^ var0;
                                          switch (var112) {
                                             case 0:
                                                var46[var65] = var127;
                                                if (var2 >= var5) {
                                                   ab = var6;
                                                   bbaa = new Long[a(1176327453, var33 ^ 975962843)];
                                                   aab = new String[aaabba(a(1176327454, var33 ^ -1995090566), 3984876321067465741L)];
                                                   aababa();
                                                   bab = new Matrix4f();
                                                   aaaab = new Vector4f();
                                                   bb = aaaaa(
                                                      aabbaaaba.abba(aab[4]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327455, var33 ^ 1347442516), 6259397949108581650L)]
                                                      ),
                                                      1
                                                   );
                                                   baab = aaaaa(
                                                      aabbaaaba.abba(aab[4]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327448, var33 ^ 1167671828), 2831087545420420755L)]
                                                      ),
                                                      0
                                                   );
                                                   abb = aaaaa(
                                                      aabbaaaba.abba(aab[4]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327449, var33 ^ -1087770261), 7832319141969721158L)]
                                                      ),
                                                      0
                                                   );
                                                   ba = aaaaa(
                                                      aabbaaaba.abba(aab[4]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327450, var33 ^ -2126659834), 313790487937313863L)]
                                                      ),
                                                      0
                                                   );
                                                   aaaaa = aaaaa(
                                                      aabbaaaba.abba(aab[4]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327451, var33 ^ 1018876576), 1870077572757942372L)]
                                                      ),
                                                      0
                                                   );
                                                   abaa = aaaaa(
                                                      aabbaaaba.abba(aab[4]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327444, var33 ^ 225894157), 5257741902594058250L)]
                                                      ),
                                                      0
                                                   );
                                                   aaaba = aaaaa(
                                                      aabbaaaba.abba(aab[4]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327445, var33 ^ 1711178160), 5458041514074840325L)]
                                                      ),
                                                      0
                                                   );
                                                   aaa = aaaaa(
                                                      aabbaaaba.abba(aab[4]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327446, var33 ^ 1736250462), 1904657688269837851L)]
                                                      ),
                                                      0
                                                   );
                                                   bba = aaaaa(
                                                      aabbaaaba.abba(aab[4]),
                                                      aabbaaaba.abba(aab[5]),
                                                      1
                                                   );
                                                   bbba = aaaaa(
                                                      aabbaaaba.abba(aab[4]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327447, var33 ^ -1526214726), 2708060333556193440L)]
                                                      ),
                                                      1
                                                   );
                                                   abba = aaaaa(
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327440, var33 ^ -559706246), 4104325421034723169L)]
                                                      ),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327441, var33 ^ -106644086), 4130340221642041766L)]
                                                      ),
                                                      0
                                                   );
                                                   baa = ababa(
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327442, var33 ^ 369170937), 4104325421034723169L)]
                                                      ),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327443, var33 ^ 1352948784), 1379162987990281540L)]
                                                      ),
                                                      2
                                                   );
                                                   abbb = ababa(
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327532, var33 ^ 1091785938), 1201239241580671762L)]
                                                      ),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327533, var33 ^ -810271563), 6593470566645431993L)]
                                                      ),
                                                      0
                                                   );
                                                   aaab = abbb();
                                                   baba = abaaaa(
                                                      aabbaaaba.abba(aab[3]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327534, var33 ^ -1428251740), 5700827511645580301L)]
                                                      )
                                                   );
                                                   bbab = abaaaa(
                                                      aabbaaaba.abba(aab[3]),
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327535, var33 ^ 1625815988), 1297164288851401926L)]
                                                      )
                                                   );
                                                   bbb = abaaaa(
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327528, var33 ^ 1991803796), 7854791707595472852L)]
                                                      ),
                                                      aabbaaaba.abba(aab[2])
                                                   );
                                                   aa = bbaab();
                                                   aba = class_1921.method_75940(
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327529, var33 ^ 1509889884), 1862059406873486564L)]
                                                      ),
                                                      class_12247.method_75927(
                                                            RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
                                                               .withLocation(
                                                                  aabbaaaba.abba(
                                                                     aab[aaabba(a(1176327530, var33 ^ 718424999), 98885281080502225L)]
                                                                  )
                                                               )
                                                               .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                                                               .withDepthWrite(false)
                                                               .build()
                                                         )
                                                         .method_75930(class_12245.field_63976)
                                                         .method_75931(class_12246.field_63983)
                                                         .method_75938()
                                                   );
                                                   bbbb = class_1921.method_75940(
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327531, var33 ^ -1752624364), 671331427773546971L)]
                                                      ),
                                                      class_12247.method_75927(
                                                            RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
                                                               .withLocation(
                                                                  aabbaaaba.abba(
                                                                     aab[aaabba(a(1176327524, var33 ^ -262094217), 5166755547813011198L)]
                                                                  )
                                                               )
                                                               .withDepthWrite(false)
                                                               .build()
                                                         )
                                                         .method_75930(class_12245.field_63976)
                                                         .method_75938()
                                                   );
                                                   baaa = class_1921.method_75940(
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327525, var33 ^ 1667918580), 1833882908110919612L)]
                                                      ),
                                                      class_12247.method_75927(
                                                            RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
                                                               .withLocation(
                                                                  aabbaaaba.abba(
                                                                     aab[aaabba(a(1176327526, var33 ^ 983539912), 176125464063360166L)]
                                                                  )
                                                               )
                                                               .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                                                               .withDepthWrite(false)
                                                               .build()
                                                         )
                                                         .method_75930(class_12245.field_63976)
                                                         .method_75938()
                                                   );
                                                   a = class_1921.method_75940(
                                                      aabbaaaba.abba(
                                                         aab[aaabba(a(1176327527, var33 ^ 1652070019), 1314958031631437964L)]
                                                      ),
                                                      class_12247.method_75927(
                                                            RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
                                                               .withLocation(
                                                                  aabbaaaba.abba(
                                                                     aab[aaabba(a(1176327520, var33 ^ -1714667017), 4113093237427782062L)]
                                                                  )
                                                               )
                                                               .withCull(false)
                                                               .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                                                               .withDepthWrite(false)
                                                               .build()
                                                         )
                                                         .method_75937()
                                                         .method_75930(class_12245.field_63976)
                                                         .method_75938()
                                                   );
                                                   aaaa = 1.0F;
                                                   return;
                                                }
                                                break;
                                             default:
                                                var46[var65] = var127;
                                                if (var2 < var5) {
                                                   continue label105;
                                                }

                                                var5 = (var4 = ababba(var33 ^ 774514944, '\ue076', '鰨')).length();
                                                var2 = 0;
                                          }

                                          int var68 = var2;
                                          var2 += 8;
                                          String var47 = var4.substring(var68, var2);
                                          var68 = var33 ^ 600383082;
                                          char var91 = '\ue077';
                                          var112 = 31406;
                                          var7 = var47.getBytes("ISO-8859-1");
                                          var46 = var6;
                                          var65 = var3++;
                                          var89 = (var7[0] & 255L) << a(1176327428, var33 ^ -667846492)
                                             | (var7[1] & 255L) << a(1176327429, var33 ^ 1798482523)
                                             | (var7[2] & 255L) << a(1176327430, var33 ^ -1963250103)
                                             | (var7[3] & 255L) << a(1176327431, var33 ^ -1289966829)
                                             | (var7[4] & 255L) << a(1176327424, var33 ^ 1595956258)
                                             | (var7[5] & 255L) << a(1176327425, var33 ^ 831380180)
                                             | (var7[a(1176327426, var33 ^ 1269692913)] & 255L) << a(1176327427, var33 ^ -1215086665)
                                             | var7[a(1176327452, var33 ^ -66908322)] & 255L;
                                          var112 = (byte)0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var43[var60] = var127;
                                 if (var10 < var13) {
                                    continue label115;
                                 }

                                 var13 = (var12 = ababba(var33 ^ 1358047537, '\ue07a', '箅')).length();
                                 var10 = 0;
                           }

                           int var63 = var10;
                           var10 += 8;
                           String var44 = var12.substring(var63, var10);
                           var63 = var33 ^ -278310654;
                           char var87 = '\ue07b';
                           char var114 = '쾬';
                           var15 = var44.getBytes("ISO-8859-1");
                           var43 = var14;
                           var60 = var11++;
                           var85 = (var15[0] & 255L) << a(1176327487, var33 ^ 1462378879)
                              | (var15[1] & 255L) << a(1176327480, var33 ^ -1652180482)
                              | (var15[2] & 255L) << a(1176327481, var33 ^ 2030373393)
                              | (var15[3] & 255L) << a(1176327482, var33 ^ -977634709)
                              | (var15[4] & 255L) << a(1176327483, var33 ^ -629856184)
                              | (var15[5] & 255L) << a(1176327476, var33 ^ -1892526072)
                              | (var15[a(1176327477, var33 ^ -356561859)] & 255L) << a(1176327478, var33 ^ -368706328)
                              | var15[a(1176327479, var33 ^ 1033142402)] & 255L;
                           var112 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var37);
                  break;
               default:
                  var21[var19++] = var110;
                  if ((var37 += var17) < var20) {
                     var17 = var18.charAt(var37);
                     continue label141;
                  }

                  var20 = (var18 = ababba(var33 ^ 1957128666, '\ue07f', '䊚')).length();
                  var17 = a(1176327891, var33 ^ 330686899);
                  var37 = -1;
            }

            var40 = var18.substring(++var37, var37 + var17);
            var48 = (byte)0;
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static void aaaaaa(Method var0) {
      int var1 = baaabbaa.bba;

      label30: {
         try {
            if (var1 != 0) {
               break label30;
            }

            if (var0 == null) {
               return;
            }
         } catch (ReflectiveOperationException var5) {
            throw var5;
         }

         try {
            var0.invoke(null);
         } catch (ReflectiveOperationException var4) {
            return;
         }
      }

      try {
         ;
      } catch (ReflectiveOperationException var3) {
      }
   }

   public static void aaaaab(Object param0, Iterable param1, Function param2, Function param3, ToDoubleFunction param4) {
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
      // 06: iload 5
      // 08: ifne 1a
      // 0b: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 0e: ifeq 27
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 1d: astore 6
      // 1f: aload 6
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 24: ifne 29
      // 27: return
      // 28: athrow
      // 29: aload 1
      // 2a: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2f: astore 7
      // 31: aload 7
      // 33: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 38: ifeq db
      // 3b: aload 7
      // 3d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 42: checkcast java/lang/Iterable
      // 45: astore 8
      // 47: aload 8
      // 49: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 4e: astore 9
      // 50: aload 9
      // 52: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 57: ifeq d6
      // 5a: aload 9
      // 5c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 61: astore 10
      // 63: iload 5
      // 65: ifne 31
      // 68: aload 2
      // 69: aload 10
      // 6b: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 70: checkcast net/minecraft/class_2338
      // 73: astore 11
      // 75: iload 5
      // 77: ifne d1
      // 7a: aload 11
      // 7c: ifnonnull 87
      // 7f: goto 83
      // 82: athrow
      // 83: goto 50
      // 86: athrow
      // 87: aload 6
      // 89: new net/minecraft/class_238
      // 8c: dup
      // 8d: aload 11
      // 8f: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 92: i2d
      // 93: aload 11
      // 95: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 98: i2d
      // 99: aload 11
      // 9b: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 9e: i2d
      // 9f: aload 11
      // a1: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // a4: i2d
      // a5: dconst_1
      // a6: dadd
      // a7: aload 11
      // a9: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // ac: i2d
      // ad: dconst_1
      // ae: dadd
      // af: aload 11
      // b1: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // b4: i2d
      // b5: dconst_1
      // b6: dadd
      // b7: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
      // ba: aload 3
      // bb: aload 10
      // bd: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // c2: checkcast java/awt/Color
      // c5: aload 4
      // c7: aload 10
      // c9: invokeinterface java/util/function/ToDoubleFunction.applyAsDouble (Ljava/lang/Object;)D 2
      // ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaaa (Ljava/lang/Object;Lnet/minecraft/class_238;Ljava/awt/Color;D)V
      // d1: iload 5
      // d3: ifeq 50
      // d6: iload 5
      // d8: ifeq 31
      // db: return
   }

   private static void aaaaba(class_4587 param0, class_4597 param1, class_238 param2, Color param3, double param4, float param6, class_1921 param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ifnull 025
      // 004: aload 1
      // 005: ifnull 025
      // 008: goto 00c
      // 00b: athrow
      // 00c: aload 2
      // 00d: ifnull 025
      // 010: goto 014
      // 013: athrow
      // 014: aload 3
      // 015: ifnull 025
      // 018: goto 01c
      // 01b: athrow
      // 01c: aload 7
      // 01e: ifnonnull 027
      // 021: goto 025
      // 024: athrow
      // 025: return
      // 026: athrow
      // 027: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 02a: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 02d: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 030: astore 8
      // 032: aload 8
      // 034: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
      // 037: astore 9
      // 039: aload 2
      // 03a: getfield net/minecraft/class_238.field_1323 D
      // 03d: aload 9
      // 03f: getfield net/minecraft/class_243.field_1352 D
      // 042: dsub
      // 043: d2f
      // 044: fstore 10
      // 046: aload 2
      // 047: getfield net/minecraft/class_238.field_1322 D
      // 04a: aload 9
      // 04c: getfield net/minecraft/class_243.field_1351 D
      // 04f: dsub
      // 050: d2f
      // 051: fstore 11
      // 053: aload 2
      // 054: getfield net/minecraft/class_238.field_1321 D
      // 057: aload 9
      // 059: getfield net/minecraft/class_243.field_1350 D
      // 05c: dsub
      // 05d: d2f
      // 05e: fstore 12
      // 060: aload 2
      // 061: getfield net/minecraft/class_238.field_1320 D
      // 064: aload 9
      // 066: getfield net/minecraft/class_243.field_1352 D
      // 069: dsub
      // 06a: d2f
      // 06b: fstore 13
      // 06d: aload 2
      // 06e: getfield net/minecraft/class_238.field_1325 D
      // 071: aload 9
      // 073: getfield net/minecraft/class_243.field_1351 D
      // 076: dsub
      // 077: d2f
      // 078: fstore 14
      // 07a: aload 2
      // 07b: getfield net/minecraft/class_238.field_1324 D
      // 07e: aload 9
      // 080: getfield net/minecraft/class_243.field_1350 D
      // 083: dsub
      // 084: d2f
      // 085: fstore 15
      // 087: aload 3
      // 088: invokevirtual java/awt/Color.getRed ()I
      // 08b: i2f
      // 08c: ldc_w 255.0
      // 08f: fdiv
      // 090: fstore 16
      // 092: aload 3
      // 093: invokevirtual java/awt/Color.getGreen ()I
      // 096: i2f
      // 097: ldc_w 255.0
      // 09a: fdiv
      // 09b: fstore 17
      // 09d: aload 3
      // 09e: invokevirtual java/awt/Color.getBlue ()I
      // 0a1: i2f
      // 0a2: ldc_w 255.0
      // 0a5: fdiv
      // 0a6: fstore 18
      // 0a8: dload 4
      // 0aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baab (D)I
      // 0ad: i2f
      // 0ae: ldc_w 255.0
      // 0b1: fdiv
      // 0b2: fstore 19
      // 0b4: aload 0
      // 0b5: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0b8: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 0bb: astore 20
      // 0bd: aload 1
      // 0be: aload 7
      // 0c0: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 0c5: astore 21
      // 0c7: aload 21
      // 0c9: aload 20
      // 0cb: fload 10
      // 0cd: fload 11
      // 0cf: fload 12
      // 0d1: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 0d6: fload 16
      // 0d8: fload 17
      // 0da: fload 18
      // 0dc: fload 19
      // 0de: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 0e3: aload 0
      // 0e4: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0e7: fconst_1
      // 0e8: fconst_0
      // 0e9: fconst_0
      // 0ea: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 0ef: fload 6
      // 0f1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 0f4: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 0f9: pop
      // 0fa: aload 21
      // 0fc: aload 20
      // 0fe: fload 13
      // 100: fload 11
      // 102: fload 12
      // 104: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 109: fload 16
      // 10b: fload 17
      // 10d: fload 18
      // 10f: fload 19
      // 111: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 116: aload 0
      // 117: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 11a: fconst_1
      // 11b: fconst_0
      // 11c: fconst_0
      // 11d: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 122: fload 6
      // 124: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 127: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 12c: pop
      // 12d: aload 21
      // 12f: aload 20
      // 131: fload 13
      // 133: fload 11
      // 135: fload 12
      // 137: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 13c: fload 16
      // 13e: fload 17
      // 140: fload 18
      // 142: fload 19
      // 144: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 149: aload 0
      // 14a: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 14d: fconst_0
      // 14e: fconst_1
      // 14f: fconst_0
      // 150: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 155: fload 6
      // 157: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 15a: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 15f: pop
      // 160: aload 21
      // 162: aload 20
      // 164: fload 13
      // 166: fload 14
      // 168: fload 12
      // 16a: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 16f: fload 16
      // 171: fload 17
      // 173: fload 18
      // 175: fload 19
      // 177: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 17c: aload 0
      // 17d: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 180: fconst_0
      // 181: fconst_1
      // 182: fconst_0
      // 183: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 188: fload 6
      // 18a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 18d: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 192: pop
      // 193: aload 21
      // 195: aload 20
      // 197: fload 13
      // 199: fload 14
      // 19b: fload 12
      // 19d: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1a2: fload 16
      // 1a4: fload 17
      // 1a6: fload 18
      // 1a8: fload 19
      // 1aa: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1af: aload 0
      // 1b0: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 1b3: ldc_w -1.0
      // 1b6: fconst_0
      // 1b7: fconst_0
      // 1b8: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 1bd: fload 6
      // 1bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 1c2: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 1c7: pop
      // 1c8: aload 21
      // 1ca: aload 20
      // 1cc: fload 10
      // 1ce: fload 14
      // 1d0: fload 12
      // 1d2: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1d7: fload 16
      // 1d9: fload 17
      // 1db: fload 18
      // 1dd: fload 19
      // 1df: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1e4: aload 0
      // 1e5: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 1e8: ldc_w -1.0
      // 1eb: fconst_0
      // 1ec: fconst_0
      // 1ed: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 1f2: fload 6
      // 1f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 1f7: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 1fc: pop
      // 1fd: aload 21
      // 1ff: aload 20
      // 201: fload 10
      // 203: fload 14
      // 205: fload 12
      // 207: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 20c: fload 16
      // 20e: fload 17
      // 210: fload 18
      // 212: fload 19
      // 214: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 219: aload 0
      // 21a: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 21d: fconst_0
      // 21e: ldc_w -1.0
      // 221: fconst_0
      // 222: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 227: fload 6
      // 229: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 22c: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 231: pop
      // 232: aload 21
      // 234: aload 20
      // 236: fload 10
      // 238: fload 11
      // 23a: fload 12
      // 23c: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 241: fload 16
      // 243: fload 17
      // 245: fload 18
      // 247: fload 19
      // 249: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 24e: aload 0
      // 24f: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 252: fconst_0
      // 253: ldc_w -1.0
      // 256: fconst_0
      // 257: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 25c: fload 6
      // 25e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 261: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 266: pop
      // 267: aload 21
      // 269: aload 20
      // 26b: fload 10
      // 26d: fload 11
      // 26f: fload 15
      // 271: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 276: fload 16
      // 278: fload 17
      // 27a: fload 18
      // 27c: fload 19
      // 27e: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 283: aload 0
      // 284: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 287: fconst_1
      // 288: fconst_0
      // 289: fconst_0
      // 28a: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 28f: fload 6
      // 291: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 294: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 299: pop
      // 29a: aload 21
      // 29c: aload 20
      // 29e: fload 13
      // 2a0: fload 11
      // 2a2: fload 15
      // 2a4: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2a9: fload 16
      // 2ab: fload 17
      // 2ad: fload 18
      // 2af: fload 19
      // 2b1: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2b6: aload 0
      // 2b7: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 2ba: fconst_1
      // 2bb: fconst_0
      // 2bc: fconst_0
      // 2bd: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 2c2: fload 6
      // 2c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 2c7: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 2cc: pop
      // 2cd: aload 21
      // 2cf: aload 20
      // 2d1: fload 13
      // 2d3: fload 11
      // 2d5: fload 15
      // 2d7: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2dc: fload 16
      // 2de: fload 17
      // 2e0: fload 18
      // 2e2: fload 19
      // 2e4: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2e9: aload 0
      // 2ea: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 2ed: fconst_0
      // 2ee: fconst_1
      // 2ef: fconst_0
      // 2f0: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 2f5: fload 6
      // 2f7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 2fa: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 2ff: pop
      // 300: aload 21
      // 302: aload 20
      // 304: fload 13
      // 306: fload 14
      // 308: fload 15
      // 30a: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 30f: fload 16
      // 311: fload 17
      // 313: fload 18
      // 315: fload 19
      // 317: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 31c: aload 0
      // 31d: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 320: fconst_0
      // 321: fconst_1
      // 322: fconst_0
      // 323: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 328: fload 6
      // 32a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 32d: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 332: pop
      // 333: aload 21
      // 335: aload 20
      // 337: fload 13
      // 339: fload 14
      // 33b: fload 15
      // 33d: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 342: fload 16
      // 344: fload 17
      // 346: fload 18
      // 348: fload 19
      // 34a: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 34f: aload 0
      // 350: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 353: ldc_w -1.0
      // 356: fconst_0
      // 357: fconst_0
      // 358: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 35d: fload 6
      // 35f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 362: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 367: pop
      // 368: aload 21
      // 36a: aload 20
      // 36c: fload 10
      // 36e: fload 14
      // 370: fload 15
      // 372: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 377: fload 16
      // 379: fload 17
      // 37b: fload 18
      // 37d: fload 19
      // 37f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 384: aload 0
      // 385: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 388: ldc_w -1.0
      // 38b: fconst_0
      // 38c: fconst_0
      // 38d: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 392: fload 6
      // 394: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 397: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 39c: pop
      // 39d: aload 21
      // 39f: aload 20
      // 3a1: fload 10
      // 3a3: fload 14
      // 3a5: fload 15
      // 3a7: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 3ac: fload 16
      // 3ae: fload 17
      // 3b0: fload 18
      // 3b2: fload 19
      // 3b4: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 3b9: aload 0
      // 3ba: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 3bd: fconst_0
      // 3be: ldc_w -1.0
      // 3c1: fconst_0
      // 3c2: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 3c7: fload 6
      // 3c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 3cc: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 3d1: pop
      // 3d2: aload 21
      // 3d4: aload 20
      // 3d6: fload 10
      // 3d8: fload 11
      // 3da: fload 15
      // 3dc: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 3e1: fload 16
      // 3e3: fload 17
      // 3e5: fload 18
      // 3e7: fload 19
      // 3e9: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 3ee: aload 0
      // 3ef: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 3f2: fconst_0
      // 3f3: ldc_w -1.0
      // 3f6: fconst_0
      // 3f7: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 3fc: fload 6
      // 3fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 401: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 406: pop
      // 407: aload 21
      // 409: aload 20
      // 40b: fload 10
      // 40d: fload 11
      // 40f: fload 12
      // 411: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 416: fload 16
      // 418: fload 17
      // 41a: fload 18
      // 41c: fload 19
      // 41e: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 423: aload 0
      // 424: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 427: fconst_0
      // 428: fconst_0
      // 429: fconst_1
      // 42a: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 42f: fload 6
      // 431: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 434: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 439: pop
      // 43a: aload 21
      // 43c: aload 20
      // 43e: fload 10
      // 440: fload 11
      // 442: fload 15
      // 444: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 449: fload 16
      // 44b: fload 17
      // 44d: fload 18
      // 44f: fload 19
      // 451: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 456: aload 0
      // 457: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 45a: fconst_0
      // 45b: fconst_0
      // 45c: fconst_1
      // 45d: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 462: fload 6
      // 464: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 467: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 46c: pop
      // 46d: aload 21
      // 46f: aload 20
      // 471: fload 13
      // 473: fload 11
      // 475: fload 12
      // 477: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 47c: fload 16
      // 47e: fload 17
      // 480: fload 18
      // 482: fload 19
      // 484: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 489: aload 0
      // 48a: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 48d: fconst_0
      // 48e: fconst_0
      // 48f: fconst_1
      // 490: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 495: fload 6
      // 497: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 49a: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 49f: pop
      // 4a0: aload 21
      // 4a2: aload 20
      // 4a4: fload 13
      // 4a6: fload 11
      // 4a8: fload 15
      // 4aa: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 4af: fload 16
      // 4b1: fload 17
      // 4b3: fload 18
      // 4b5: fload 19
      // 4b7: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 4bc: aload 0
      // 4bd: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 4c0: fconst_0
      // 4c1: fconst_0
      // 4c2: fconst_1
      // 4c3: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 4c8: fload 6
      // 4ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 4cd: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 4d2: pop
      // 4d3: aload 21
      // 4d5: aload 20
      // 4d7: fload 13
      // 4d9: fload 14
      // 4db: fload 12
      // 4dd: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 4e2: fload 16
      // 4e4: fload 17
      // 4e6: fload 18
      // 4e8: fload 19
      // 4ea: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 4ef: aload 0
      // 4f0: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 4f3: fconst_0
      // 4f4: fconst_0
      // 4f5: fconst_1
      // 4f6: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 4fb: fload 6
      // 4fd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 500: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 505: pop
      // 506: aload 21
      // 508: aload 20
      // 50a: fload 13
      // 50c: fload 14
      // 50e: fload 15
      // 510: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 515: fload 16
      // 517: fload 17
      // 519: fload 18
      // 51b: fload 19
      // 51d: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 522: aload 0
      // 523: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 526: fconst_0
      // 527: fconst_0
      // 528: fconst_1
      // 529: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 52e: fload 6
      // 530: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 533: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 538: pop
      // 539: aload 21
      // 53b: aload 20
      // 53d: fload 10
      // 53f: fload 14
      // 541: fload 12
      // 543: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 548: fload 16
      // 54a: fload 17
      // 54c: fload 18
      // 54e: fload 19
      // 550: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 555: aload 0
      // 556: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 559: fconst_0
      // 55a: fconst_0
      // 55b: fconst_1
      // 55c: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 561: fload 6
      // 563: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 566: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 56b: pop
      // 56c: aload 21
      // 56e: aload 20
      // 570: fload 10
      // 572: fload 14
      // 574: fload 15
      // 576: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 57b: fload 16
      // 57d: fload 17
      // 57f: fload 18
      // 581: fload 19
      // 583: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 588: aload 0
      // 589: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 58c: fconst_0
      // 58d: fconst_0
      // 58e: fconst_1
      // 58f: invokeinterface net/minecraft/class_4588.method_60831 (Lnet/minecraft/class_4587$class_4665;FFF)Lnet/minecraft/class_4588; 5
      // 594: fload 6
      // 596: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 599: invokeinterface net/minecraft/class_4588.method_75298 (F)Lnet/minecraft/class_4588; 2
      // 59e: pop
      // 59f: return
   }

   private static long aaaabb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(1176327701, 238985803 ^ -1251920179)) & a(1176327702, 238985803 ^ -1641512637);
      if (bbaa[var3] == null) {
         bbaa[var3] = ab[var3] ^ var1;
      }

      return bbaa[var3];
   }

   public static void aaabaa(
      aabbbbaaa param0,
      Matrix4f param1,
      float param2,
      float param3,
      float param4,
      float param5,
      float param6,
      int param7,
      int param8
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w 802707001
      // 003: istore 22
      // 005: iload 7
      // 007: ldc_w 1176327703
      // 00a: iload 22
      // 00c: ldc_w 494912141
      // 00f: ixor
      // 010: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 013: ldc2_w 1870077572757942372
      // 016: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 019: iushr
      // 01a: ldc_w 1176327696
      // 01d: iload 22
      // 01f: ldc_w -477162253
      // 022: ixor
      // 023: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 026: ldc2_w 345831143669751952
      // 029: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 02c: iand
      // 02d: istore 10
      // 02f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 032: iload 8
      // 034: ldc_w 1176327697
      // 037: iload 22
      // 039: ldc_w -652380884
      // 03c: ixor
      // 03d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 040: ldc2_w 1870077572757942372
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 046: iushr
      // 047: ldc_w 1176327698
      // 04a: iload 22
      // 04c: ldc_w -1107641008
      // 04f: ixor
      // 050: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 053: ldc2_w 345831143669751952
      // 056: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 059: iand
      // 05a: istore 11
      // 05c: istore 9
      // 05e: aload 0
      // 05f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 062: ifeq 0b9
      // 065: aload 1
      // 066: ifnull 0b9
      // 069: goto 06d
      // 06c: athrow
      // 06d: iload 10
      // 06f: iload 9
      // 071: ifne 0a2
      // 074: goto 078
      // 077: athrow
      // 078: ifgt 091
      // 07b: goto 07f
      // 07e: athrow
      // 07f: iload 11
      // 081: iload 9
      // 083: ifne 0a2
      // 086: goto 08a
      // 089: athrow
      // 08a: ifle 0b9
      // 08d: goto 091
      // 090: athrow
      // 091: fload 4
      // 093: fconst_0
      // 094: iload 9
      // 096: ifne 0b5
      // 099: goto 09d
      // 09c: athrow
      // 09d: fcmpg
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: ifle 0b9
      // 0a5: fload 5
      // 0a7: iload 9
      // 0a9: ifne 0c4
      // 0ac: goto 0b0
      // 0af: athrow
      // 0b0: fconst_0
      // 0b1: goto 0b5
      // 0b4: athrow
      // 0b5: fcmpg
      // 0b6: ifgt 0bb
      // 0b9: return
      // 0ba: athrow
      // 0bb: fload 4
      // 0bd: fload 5
      // 0bf: fload 6
      // 0c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbbba (FFF)F
      // 0c4: fstore 12
      // 0c6: fload 12
      // 0c8: ldc_w 0.01
      // 0cb: iload 9
      // 0cd: ifne 119
      // 0d0: fcmpg
      // 0d1: ifgt 0ed
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: aload 1
      // 0da: fload 2
      // 0db: fload 3
      // 0dc: fload 2
      // 0dd: fload 4
      // 0df: fadd
      // 0e0: fload 3
      // 0e1: fload 5
      // 0e3: fadd
      // 0e4: iload 7
      // 0e6: iload 8
      // 0e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lorg/joml/Matrix4f;FFFFII)V
      // 0eb: return
      // 0ec: athrow
      // 0ed: iload 7
      // 0ef: ldc_w 1176327699
      // 0f2: iload 22
      // 0f4: ldc_w -825139825
      // 0f7: ixor
      // 0f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0fb: ldc2_w 2831087545420420755
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 101: ishr
      // 102: ldc_w 1176327788
      // 105: iload 22
      // 107: ldc_w -1194279326
      // 10a: ixor
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 10e: ldc2_w 345831143669751952
      // 111: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 114: iand
      // 115: i2f
      // 116: ldc_w 255.0
      // 119: fdiv
      // 11a: fstore 13
      // 11c: iload 7
      // 11e: ldc_w 1176327789
      // 121: iload 22
      // 123: ldc_w -473174368
      // 126: ixor
      // 127: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 12a: ldc2_w 6259397949108581650
      // 12d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 130: ishr
      // 131: ldc_w 1176327790
      // 134: iload 22
      // 136: ldc_w 1436153672
      // 139: ixor
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 13d: ldc2_w 345831143669751952
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 143: iand
      // 144: i2f
      // 145: ldc_w 255.0
      // 148: fdiv
      // 149: fstore 14
      // 14b: iload 7
      // 14d: ldc_w 1176327791
      // 150: iload 22
      // 152: ldc_w -87319661
      // 155: ixor
      // 156: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 159: ldc2_w 345831143669751952
      // 15c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 15f: iand
      // 160: i2f
      // 161: ldc_w 255.0
      // 164: fdiv
      // 165: fstore 15
      // 167: iload 10
      // 169: i2f
      // 16a: ldc_w 255.0
      // 16d: fdiv
      // 16e: fstore 16
      // 170: iload 8
      // 172: ldc_w 1176327784
      // 175: iload 22
      // 177: ldc_w 340208161
      // 17a: ixor
      // 17b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 17e: ldc2_w 2831087545420420755
      // 181: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 184: ishr
      // 185: ldc_w 1176327785
      // 188: iload 22
      // 18a: ldc_w 1596493335
      // 18d: ixor
      // 18e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 191: ldc2_w 345831143669751952
      // 194: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 197: iand
      // 198: i2f
      // 199: ldc_w 255.0
      // 19c: fdiv
      // 19d: fstore 17
      // 19f: iload 8
      // 1a1: ldc_w 1176327786
      // 1a4: iload 22
      // 1a6: ldc_w 1202843955
      // 1a9: ixor
      // 1aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 1ad: ldc2_w 6259397949108581650
      // 1b0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 1b3: ishr
      // 1b4: ldc_w 1176327787
      // 1b7: iload 22
      // 1b9: ldc_w -1432569796
      // 1bc: ixor
      // 1bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 1c0: ldc2_w 345831143669751952
      // 1c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 1c6: iand
      // 1c7: i2f
      // 1c8: ldc_w 255.0
      // 1cb: fdiv
      // 1cc: fstore 18
      // 1ce: iload 8
      // 1d0: ldc_w 1176327780
      // 1d3: iload 22
      // 1d5: ldc_w 629567758
      // 1d8: ixor
      // 1d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 1dc: ldc2_w 345831143669751952
      // 1df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 1e2: iand
      // 1e3: i2f
      // 1e4: ldc_w 255.0
      // 1e7: fdiv
      // 1e8: fstore 19
      // 1ea: iload 11
      // 1ec: i2f
      // 1ed: ldc_w 255.0
      // 1f0: fdiv
      // 1f1: fstore 20
      // 1f3: aload 0
      // 1f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 1f7: invokestatic net/minecraft/class_12249.method_76023 ()Lnet/minecraft/class_1921;
      // 1fa: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 1ff: astore 21
      // 201: aload 21
      // 203: aload 1
      // 204: fload 2
      // 205: fload 3
      // 206: fload 4
      // 208: fload 5
      // 20a: fload 12
      // 20c: fload 13
      // 20e: fload 14
      // 210: fload 15
      // 212: fload 16
      // 214: fload 17
      // 216: fload 18
      // 218: fload 19
      // 21a: fload 20
      // 21c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix4f;FFFFFFFFFFFFF)V
      // 21f: return
   }

   private static void aaabab() {
      babba(bba, new Object[]{true});
      aaaaaa(abb);
   }

   private static int aaabba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1176327781, -1640453735 ^ 265649122);
      if (abab[var3] == null) {
         abab[var3] = (int)(aabb[var3] ^ var1);
      }

      return abab[var3];
   }

   private static String ababba(int var0, char var1, char var2) {
      int var3 = var1 ^ '\ue07e';
      char[] var4 = aabaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aabab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aabab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 27817;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\ueb64';
         var10 ^= 24496;
         var10 -= 51736;
         var10 -= 31840;
         var10 += 58347;
         var10 ^= 4223;
         var10 += 60304;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static babbaaaa aaabbb(aabbbbaaa param0, Iterable param1) {
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
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 08: ifeq 13
      // 0b: aload 1
      // 0c: ifnonnull 16
      // 0f: goto 13
      // 12: athrow
      // 13: aconst_null
      // 14: areturn
      // 15: athrow
      // 16: ldc2_w Infinity
      // 19: dstore 3
      // 1a: ldc2_w Infinity
      // 1d: dstore 5
      // 1f: ldc2_w -Infinity
      // 22: dstore 7
      // 24: ldc2_w -Infinity
      // 27: dstore 9
      // 29: bipush 0
      // 2a: istore 11
      // 2c: aload 1
      // 2d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 32: astore 12
      // 34: aload 12
      // 36: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3b: ifeq 9c
      // 3e: aload 12
      // 40: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 45: checkcast net/minecraft/class_243
      // 48: astore 13
      // 4a: iload 2
      // 4b: ifne a7
      // 4e: aload 0
      // 4f: aload 13
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lnet/minecraft/class_243;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaa;
      // 54: astore 14
      // 56: iload 2
      // 57: ifne 98
      // 5a: aload 14
      // 5c: ifnonnull 67
      // 5f: goto 63
      // 62: athrow
      // 63: goto 34
      // 66: athrow
      // 67: iinc 11 1
      // 6a: dload 3
      // 6b: aload 14
      // 6d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaa.ab ()D
      // 70: invokestatic java/lang/Math.min (DD)D
      // 73: dstore 3
      // 74: dload 5
      // 76: aload 14
      // 78: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaa.aa ()D
      // 7b: invokestatic java/lang/Math.min (DD)D
      // 7e: dstore 5
      // 80: dload 7
      // 82: aload 14
      // 84: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaa.ab ()D
      // 87: invokestatic java/lang/Math.max (DD)D
      // 8a: dstore 7
      // 8c: dload 9
      // 8e: aload 14
      // 90: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaa.aa ()D
      // 93: invokestatic java/lang/Math.max (DD)D
      // 96: dstore 9
      // 98: iload 2
      // 99: ifeq 34
      // 9c: iload 11
      // 9e: bipush 2
      // 9f: if_icmpge a7
      // a2: aconst_null
      // a3: goto b5
      // a6: athrow
      // a7: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaaaa
      // aa: dup
      // ab: dload 3
      // ac: dload 5
      // ae: dload 7
      // b0: dload 9
      // b2: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaaaa.<init> (DDDD)V
      // b5: areturn
   }

   public static void aabaaa(Object param0, class_238 param1, Color param2, double param3) {
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
      // 06: iload 5
      // 08: ifne 19
      // 0b: aload 1
      // 0c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaa (Ljava/lang/Object;Lnet/minecraft/class_238;)Z
      // 0f: ifne 18
      // 12: goto 16
      // 15: athrow
      // 16: return
      // 17: athrow
      // 18: aload 0
      // 19: iload 5
      // 1b: ifne 4c
      // 1e: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 21: ifeq 47
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 2c: astore 6
      // 2e: iload 5
      // 30: aload 6
      // 32: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 37: aload 6
      // 39: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.a ()Lnet/minecraft/class_4597; 1
      // 3e: aload 1
      // 3f: aload 2
      // 40: dload 3
      // 41: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaab (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_238;Ljava/awt/Color;D)V
      // 44: ifeq 79
      // 47: aload 0
      // 48: goto 4c
      // 4b: athrow
      // 4c: iload 5
      // 4e: ifne 60
      // 51: instanceof net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 54: ifeq 79
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 60
      // 5f: athrow
      // 60: checkcast net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 63: astore 7
      // 65: aload 7
      // 67: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.matrices ()Lnet/minecraft/class_4587; 1
      // 6c: aload 7
      // 6e: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.consumers ()Lnet/minecraft/class_4597; 1
      // 73: aload 1
      // 74: aload 2
      // 75: dload 3
      // 76: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaab (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_238;Ljava/awt/Color;D)V
      // 79: return
   }

   private bbaabbaa() {
   }

   private static String aabaab(char[] var0, long var1, int var3) {
      int var4 = aaabba(a(1176327782, -1421551594 ^ -117342039), 4047003930152683059L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aaabba(a(1176327783, -1421551594 ^ -738616675), 345831143669751952L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static void aababa() {
      int var0 = 945210383;
      aab[0] = aabaab(
         aabbb(a(1176327776, var0 ^ -1230014363), a(1176327777, var0 ^ -1341608410)).toCharArray(),
         aaaabb(a(1176327778, var0 ^ -252409196), 3070810581961375055L),
         aaabba(a(1176327779, var0 ^ -1653344269), 1406941039313352379L)
      );
      aab[1] = aabaab(
         aabbb(a(1176327804, var0 ^ 1921050648), a(1176327805, var0 ^ -257915791)).toCharArray(),
         aaaabb(a(1176327806, var0 ^ 682263107), 6398001313965371114L),
         aaabba(a(1176327807, var0 ^ -361982555), 5471553996679573718L)
      );
      aab[2] = aabaab(
         aabbb(a(1176327800, var0 ^ 856080923), a(1176327801, var0 ^ 580170589)).toCharArray(),
         aaaabb(a(1176327802, var0 ^ -290427753), 1668654305463729322L),
         aaabba(a(1176327803, var0 ^ -965579879), 2137758154416109271L)
      );
      aab[3] = aabaab(
         aabbb(a(1176327796, var0 ^ -1622113285), a(1176327797, var0 ^ 598848883)).toCharArray(),
         aaaabb(a(1176327798, var0 ^ 891296475), 6821887543057499896L),
         aaabba(a(1176327799, var0 ^ -217649974), 3280158106110051483L)
      );
      aab[4] = aabaab(
         aabbb(a(1176327792, var0 ^ 326479736), a(1176327793, var0 ^ -472963819)).toCharArray(),
         aaaabb(a(1176327794, var0 ^ -1035136428), 1859607658616893280L),
         aaabba(a(1176327795, var0 ^ -810714529), 8792835758391732622L)
      );
      aab[5] = aabaab(
         aabbb(a(1176327756, var0 ^ 1442529203), a(1176327757, var0 ^ -44092200)).toCharArray(),
         aaaabb(a(1176327758, var0 ^ 1680379286), 2978104606048914689L),
         aaabba(a(1176327759, var0 ^ 1423907199), 8468282134489590838L)
      );
      aab[aaabba(a(1176327752, var0 ^ 462747731), 1904657688269837851L)] = aabaab(
         aabbb(a(1176327753, var0 ^ -1443996650), a(1176327754, var0 ^ 172148846)).toCharArray(),
         aaaabb(a(1176327755, var0 ^ -1500127704), 5179249966257415795L),
         aaabba(a(1176327748, var0 ^ 1387173995), 2840487651792594712L)
      );
      aab[aaabba(a(1176327749, var0 ^ -273463660), 5458041514074840325L)] = aabaab(
         aabbb(a(1176327750, var0 ^ -492614615), a(1176327751, var0 ^ -191641421)).toCharArray(),
         aaaabb(a(1176327744, var0 ^ -1076714481), 2286470077609474527L),
         aaabba(a(1176327745, var0 ^ -649562669), 2859578151342199514L)
      );
      aab[aaabba(a(1176327746, var0 ^ -675581637), 6259397949108581650L)] = aabaab(
         aabbb(a(1176327747, var0 ^ -283152143), a(1176327772, var0 ^ 105957161)).toCharArray(),
         aaaabb(a(1176327773, var0 ^ 1570546217), 7335409068369746194L),
         aaabba(a(1176327774, var0 ^ -1032190949), 6605228336315373673L)
      );
      aab[aaabba(a(1176327775, var0 ^ -1641336464), 7854791707595472852L)] = aabaab(
         aabbb(a(1176327768, var0 ^ 1917129307), a(1176327769, var0 ^ 1563189582)).toCharArray(),
         aaaabb(a(1176327770, var0 ^ -2091127925), 3930008885434151839L),
         aaabba(a(1176327771, var0 ^ 2110762954), 4572805291047511765L)
      );
      aab[aaabba(a(1176327764, var0 ^ 1771685185), 1297164288851401926L)] = aabaab(
         aabbb(a(1176327765, var0 ^ 1132157661), a(1176327766, var0 ^ 966884434)).toCharArray(),
         aaaabb(a(1176327767, var0 ^ 1801647600), 6217814682241773594L),
         aaabba(a(1176327760, var0 ^ -2039913), 5943178551524079437L)
      );
      aab[aaabba(a(1176327761, var0 ^ -1432157135), 5166755547813011198L)] = aabaab(
         aabbb(a(1176327762, var0 ^ -1727376618), a(1176327763, var0 ^ 1574166457)).toCharArray(),
         aaaabb(a(1176327852, var0 ^ 1269562352), 9175777413592758856L),
         aaabba(a(1176327853, var0 ^ 1871012401), 4622597870364321410L)
      );
      aab[aaabba(a(1176327854, var0 ^ 1882047777), 313790487937313863L)] = aabaab(
         aabbb(a(1176327855, var0 ^ -521448191), a(1176327848, var0 ^ -1413606087)).toCharArray(),
         aaaabb(a(1176327849, var0 ^ 571567202), 4880910275470581483L),
         aaabba(a(1176327850, var0 ^ 1523732671), 1265576369155701801L)
      );
      aab[aaabba(a(1176327851, var0 ^ -1880124171), 4124458202797175728L)] = aabaab(
         aabbb(a(1176327844, var0 ^ -327423055), a(1176327845, var0 ^ -202058942)).toCharArray(),
         aaaabb(a(1176327846, var0 ^ -1689921871), 2589712012485803524L),
         aaabba(a(1176327847, var0 ^ -1877130499), 4874216603034500246L)
      );
      aab[aaabba(a(1176327840, var0 ^ 120121106), 7648433384292556616L)] = aabaab(
         aabbb(a(1176327841, var0 ^ 1134536772), a(1176327842, var0 ^ -454968502)).toCharArray(),
         aaaabb(a(1176327843, var0 ^ -1486356318), 5814692960212778288L),
         aaabba(a(1176327868, var0 ^ 676535962), 2997706805027707234L)
      );
      aab[aaabba(a(1176327869, var0 ^ 308167571), 1488881133891041287L)] = aabaab(
         aabbb(a(1176327870, var0 ^ -454607567), a(1176327871, var0 ^ -1997511550)).toCharArray(),
         aaaabb(a(1176327864, var0 ^ -2099700475), 41796323520475543L),
         aaabba(a(1176327865, var0 ^ 611316281), 2155996957309807370L)
      );
      aab[aaabba(a(1176327866, var0 ^ 104908546), 2831087545420420755L)] = aabaab(
         aabbb(a(1176327867, var0 ^ -905702099), a(1176327860, var0 ^ -610109983)).toCharArray(),
         aaaabb(a(1176327861, var0 ^ 1537862600), 4180834865549025952L),
         aaabba(a(1176327862, var0 ^ -1587324654), 36338345745173382L)
      );
      aab[aaabba(a(1176327863, var0 ^ -1609412991), 3054942307099409514L)] = aabaab(
         aabbb(a(1176327856, var0 ^ -1132227790), a(1176327857, var0 ^ 958104705)).toCharArray(),
         aaaabb(a(1176327858, var0 ^ 786746027), 5593466997795263375L),
         aaabba(a(1176327859, var0 ^ -807039323), 7670499915937873160L)
      );
      aab[aaabba(a(1176327820, var0 ^ 78829016), 4995698774660652192L)] = aabaab(
         aabbb(a(1176327821, var0 ^ -1909782785), a(1176327822, var0 ^ -1969390447)).toCharArray(),
         aaaabb(a(1176327823, var0 ^ -523516197), 6341949062021445010L),
         aaabba(a(1176327816, var0 ^ -50338619), 6714745820821938260L)
      );
      aab[aaabba(a(1176327817, var0 ^ 1555815666), 7004421401589506272L)] = aabaab(
         aabbb(a(1176327818, var0 ^ -2007026895), a(1176327819, var0 ^ 847194006)).toCharArray(),
         aaaabb(a(1176327812, var0 ^ -2054774618), 7735975109855822671L),
         aaabba(a(1176327813, var0 ^ -362658731), 6929836998748194614L)
      );
      aab[aaabba(a(1176327814, var0 ^ -350056344), 2863301381234865468L)] = aabaab(
         aabbb(a(1176327815, var0 ^ -2145833611), a(1176327808, var0 ^ 1276008940)).toCharArray(),
         aaaabb(a(1176327809, var0 ^ 1438840859), 7609010321054930288L),
         aaabba(a(1176327810, var0 ^ 1040897706), 4249307489581589437L)
      );
      aab[aaabba(a(1176327811, var0 ^ 369166748), 640266673021154719L)] = aabaab(
         aabbb(a(1176327836, var0 ^ 821015399), a(1176327837, var0 ^ 1745293910)).toCharArray(),
         aaaabb(a(1176327838, var0 ^ 1358730640), 2020112598987753010L),
         aaabba(a(1176327839, var0 ^ -399967016), 2421157008457722541L)
      );
      aab[aaabba(a(1176327832, var0 ^ -1580980303), 3094901017500247782L)] = aabaab(
         aabbb(a(1176327833, var0 ^ -2000338661), a(1176327834, var0 ^ 1704509340)).toCharArray(),
         aaaabb(a(1176327835, var0 ^ -1963332940), 583859472589406052L),
         aaabba(a(1176327828, var0 ^ 891759682), 7482042849978596175L)
      );
      aab[aaabba(a(1176327829, var0 ^ 748009101), 3835437148605351101L)] = aabaab(
         aabbb(a(1176327830, var0 ^ 583921800), a(1176327831, var0 ^ -1035482667)).toCharArray(),
         aaaabb(a(1176327824, var0 ^ -1043148587), 3023628840424222421L),
         aaabba(a(1176327825, var0 ^ 2123606455), 3263440806096096600L)
      );
      aab[aaabba(a(1176327826, var0 ^ 402004680), 1870077572757942372L)] = aabaab(
         aabbb(a(1176327827, var0 ^ 644396273), a(1176327916, var0 ^ 2019814293)).toCharArray(),
         aaaabb(a(1176327917, var0 ^ 1160478393), 4613652530630848543L),
         aaabba(a(1176327918, var0 ^ -385488975), 5397505693959383651L)
      );
      aab[aaabba(a(1176327919, var0 ^ 1756254175), 4276347289853472636L)] = aabaab(
         aabbb(a(1176327912, var0 ^ -1283078482), a(1176327913, var0 ^ -1233843677)).toCharArray(),
         aaaabb(a(1176327914, var0 ^ -1295164456), 7022355664355327439L),
         aaabba(a(1176327915, var0 ^ -1276520663), 3105819845728669735L)
      );
      aab[aaabba(a(1176327908, var0 ^ 350004972), 3094374854353866650L)] = aabaab(
         aabbb(a(1176327909, var0 ^ 1570652928), a(1176327910, var0 ^ -254359527)).toCharArray(),
         aaaabb(a(1176327911, var0 ^ 179989455), 4440970104314666483L),
         aaabba(a(1176327904, var0 ^ 729727981), 358500124456175591L)
      );
      aab[aaabba(a(1176327905, var0 ^ -164594944), 7916785763704400151L)] = aabaab(
         aabbb(a(1176327906, var0 ^ -632833535), a(1176327907, var0 ^ 216733902)).toCharArray(),
         aaaabb(a(1176327932, var0 ^ -354436920), 5069111088283549106L),
         aaabba(a(1176327933, var0 ^ 2027501824), 4890735092557294604L)
      );
      aab[aaabba(a(1176327934, var0 ^ -1581739037), 4943008624104329712L)] = aabaab(
         aabbb(a(1176327935, var0 ^ 295773648), a(1176327928, var0 ^ 990360779)).toCharArray(),
         aaaabb(a(1176327929, var0 ^ -616923565), 4573899073132626493L),
         aaabba(a(1176327930, var0 ^ 1280499480), 2632218437964942429L)
      );
      aab[aaabba(a(1176327931, var0 ^ -289532804), 2581182154481863242L)] = aabaab(
         aabbb(a(1176327924, var0 ^ 1416895008), a(1176327925, var0 ^ -281546426)).toCharArray(),
         aaaabb(a(1176327926, var0 ^ 1923503436), 6565131307430040195L),
         aaabba(a(1176327927, var0 ^ -541690724), 8885823717269189099L)
      );
      aab[aaabba(a(1176327920, var0 ^ 1467184834), 5799374923608115198L)] = aabaab(
         aabbb(a(1176327921, var0 ^ -523880657), a(1176327922, var0 ^ -2031416570)).toCharArray(),
         aaaabb(a(1176327923, var0 ^ 560136059), 5060611538403108816L),
         aaabba(a(1176327884, var0 ^ -1560784619), 5393892058780959652L)
      );
      aab[aaabba(a(1176327885, var0 ^ -225748606), 130133272969105020L)] = aabaab(
         aabbb(a(1176327886, var0 ^ 1994947115), a(1176327887, var0 ^ 26846383)).toCharArray(),
         aaaabb(a(1176327880, var0 ^ -1779227814), 3845693784866681672L),
         aaabba(a(1176327881, var0 ^ 346821301), 6684257650101793362L)
      );
      aab[aaabba(a(1176327882, var0 ^ -82577446), 3970179215407434396L)] = aabaab(
         aabbb(a(1176327883, var0 ^ 2114505779), a(1176327876, var0 ^ 1831143225)).toCharArray(),
         aaaabb(a(1176327877, var0 ^ 1017869959), 4695594732852466703L),
         aaabba(a(1176327878, var0 ^ 450318266), 2774048864095538691L)
      );
      aab[aaabba(a(1176327879, var0 ^ -920025314), 7463976841697958788L)] = aabaab(
         aabbb(a(1176327872, var0 ^ 2041756903), a(1176327873, var0 ^ 1833689387)).toCharArray(),
         aaaabb(a(1176327874, var0 ^ 1640317641), 5061567217910070981L),
         aaabba(a(1176327875, var0 ^ -1522949380), 1131960855697364115L)
      );
   }

   public static void aababb(
      aabbbbaaa param0, Matrix4f param1, float param2, float param3, float param4, float param5, float param6, int param7
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 96068235
      // 003: istore 16
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 8
      // 00a: iload 7
      // 00c: ldc_w 1176327900
      // 00f: iload 16
      // 011: ldc_w 1257168269
      // 014: ixor
      // 015: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 018: ldc2_w 1870077572757942372
      // 01b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 01e: iushr
      // 01f: ldc_w 1176327901
      // 022: iload 16
      // 024: ldc_w -1018155942
      // 027: ixor
      // 028: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 02b: ldc2_w 345831143669751952
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 031: iand
      // 032: istore 9
      // 034: aload 0
      // 035: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 038: ifeq 079
      // 03b: aload 1
      // 03c: ifnull 079
      // 03f: goto 043
      // 042: athrow
      // 043: iload 9
      // 045: iload 8
      // 047: ifne 066
      // 04a: goto 04e
      // 04d: athrow
      // 04e: ifle 079
      // 051: goto 055
      // 054: athrow
      // 055: fload 4
      // 057: iload 8
      // 059: ifne 06b
      // 05c: goto 060
      // 05f: athrow
      // 060: fconst_0
      // 061: fcmpg
      // 062: goto 066
      // 065: athrow
      // 066: ifle 079
      // 069: fload 5
      // 06b: iload 8
      // 06d: ifne 084
      // 070: fconst_0
      // 071: fcmpg
      // 072: ifgt 07b
      // 075: goto 079
      // 078: athrow
      // 079: return
      // 07a: athrow
      // 07b: fload 4
      // 07d: fload 5
      // 07f: fload 6
      // 081: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbbba (FFF)F
      // 084: fstore 10
      // 086: fload 10
      // 088: ldc_w 0.01
      // 08b: iload 8
      // 08d: ifne 0d7
      // 090: fcmpg
      // 091: ifgt 0ab
      // 094: goto 098
      // 097: athrow
      // 098: aload 0
      // 099: aload 1
      // 09a: fload 2
      // 09b: fload 3
      // 09c: fload 2
      // 09d: fload 4
      // 09f: fadd
      // 0a0: fload 3
      // 0a1: fload 5
      // 0a3: fadd
      // 0a4: iload 7
      // 0a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abbba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Lorg/joml/Matrix4f;FFFFI)V
      // 0a9: return
      // 0aa: athrow
      // 0ab: iload 7
      // 0ad: ldc_w 1176327902
      // 0b0: iload 16
      // 0b2: ldc_w 1951945314
      // 0b5: ixor
      // 0b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0b9: ldc2_w 2831087545420420755
      // 0bc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0bf: ishr
      // 0c0: ldc_w 1176327903
      // 0c3: iload 16
      // 0c5: ldc_w -750281310
      // 0c8: ixor
      // 0c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0cc: ldc2_w 345831143669751952
      // 0cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0d2: iand
      // 0d3: i2f
      // 0d4: ldc_w 255.0
      // 0d7: fdiv
      // 0d8: fstore 11
      // 0da: iload 7
      // 0dc: ldc_w 1176327896
      // 0df: iload 16
      // 0e1: ldc_w -413289255
      // 0e4: ixor
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0e8: ldc2_w 6259397949108581650
      // 0eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0ee: ishr
      // 0ef: ldc_w 1176327897
      // 0f2: iload 16
      // 0f4: ldc_w -353649464
      // 0f7: ixor
      // 0f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0fb: ldc2_w 345831143669751952
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 101: iand
      // 102: i2f
      // 103: ldc_w 255.0
      // 106: fdiv
      // 107: fstore 12
      // 109: iload 7
      // 10b: ldc_w 1176327898
      // 10e: iload 16
      // 110: ldc_w 859923614
      // 113: ixor
      // 114: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 117: ldc2_w 345831143669751952
      // 11a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 11d: iand
      // 11e: i2f
      // 11f: ldc_w 255.0
      // 122: fdiv
      // 123: fstore 13
      // 125: iload 9
      // 127: i2f
      // 128: ldc_w 255.0
      // 12b: fdiv
      // 12c: fstore 14
      // 12e: aload 0
      // 12f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 132: invokestatic net/minecraft/class_12249.method_76023 ()Lnet/minecraft/class_1921;
      // 135: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 13a: astore 15
      // 13c: aload 15
      // 13e: aload 1
      // 13f: fload 2
      // 140: fload 3
      // 141: fload 4
      // 143: fload 5
      // 145: fload 10
      // 147: fload 11
      // 149: fload 12
      // 14b: fload 13
      // 14d: fload 14
      // 14f: fload 11
      // 151: fload 12
      // 153: fload 13
      // 155: fload 14
      // 157: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaa (Lnet/minecraft/class_4588;Lorg/joml/Matrix4f;FFFFFFFFFFFFF)V
      // 15a: return
   }

   private static void aabbaa(class_4587 param0, class_238 param1, Color param2, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 5
      // 005: aload 0
      // 006: ifnull 019
      // 009: aload 1
      // 00a: ifnull 019
      // 00d: goto 011
      // 010: athrow
      // 011: aload 2
      // 012: ifnonnull 01b
      // 015: goto 019
      // 018: athrow
      // 019: return
      // 01a: athrow
      // 01b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 01e: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 021: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 024: astore 6
      // 026: aload 6
      // 028: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
      // 02b: astore 7
      // 02d: aload 1
      // 02e: getfield net/minecraft/class_238.field_1323 D
      // 031: aload 7
      // 033: getfield net/minecraft/class_243.field_1352 D
      // 036: dsub
      // 037: d2f
      // 038: fstore 8
      // 03a: aload 1
      // 03b: getfield net/minecraft/class_238.field_1322 D
      // 03e: aload 7
      // 040: getfield net/minecraft/class_243.field_1351 D
      // 043: dsub
      // 044: d2f
      // 045: fstore 9
      // 047: aload 1
      // 048: getfield net/minecraft/class_238.field_1321 D
      // 04b: aload 7
      // 04d: getfield net/minecraft/class_243.field_1350 D
      // 050: dsub
      // 051: d2f
      // 052: fstore 10
      // 054: aload 1
      // 055: getfield net/minecraft/class_238.field_1320 D
      // 058: aload 7
      // 05a: getfield net/minecraft/class_243.field_1352 D
      // 05d: dsub
      // 05e: d2f
      // 05f: fstore 11
      // 061: aload 1
      // 062: getfield net/minecraft/class_238.field_1325 D
      // 065: aload 7
      // 067: getfield net/minecraft/class_243.field_1351 D
      // 06a: dsub
      // 06b: d2f
      // 06c: fstore 12
      // 06e: aload 1
      // 06f: getfield net/minecraft/class_238.field_1324 D
      // 072: aload 7
      // 074: getfield net/minecraft/class_243.field_1350 D
      // 077: dsub
      // 078: d2f
      // 079: fstore 13
      // 07b: aload 2
      // 07c: invokevirtual java/awt/Color.getRed ()I
      // 07f: i2f
      // 080: ldc_w 255.0
      // 083: fdiv
      // 084: fstore 14
      // 086: aload 2
      // 087: invokevirtual java/awt/Color.getGreen ()I
      // 08a: i2f
      // 08b: ldc_w 255.0
      // 08e: fdiv
      // 08f: fstore 15
      // 091: aload 2
      // 092: invokevirtual java/awt/Color.getBlue ()I
      // 095: i2f
      // 096: ldc_w 255.0
      // 099: fdiv
      // 09a: fstore 16
      // 09c: dload 3
      // 09d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baab (D)I
      // 0a0: i2f
      // 0a1: ldc_w 255.0
      // 0a4: fdiv
      // 0a5: fstore 17
      // 0a7: aload 0
      // 0a8: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0ab: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 0ae: astore 18
      // 0b0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ba Ljava/lang/reflect/Method;
      // 0b3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 0b6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaa Ljava/lang/reflect/Method;
      // 0b9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 0bc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaa Ljava/lang/reflect/Method;
      // 0bf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 0c2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babbb ()V
      // 0c5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbba Ljava/lang/reflect/Method;
      // 0c8: bipush 1
      // 0c9: anewarray 4
      // 0cc: dup
      // 0cd: bipush 0
      // 0ce: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aa Ljava/lang/Object;
      // 0d1: aastore
      // 0d2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 0d5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abba Ljava/lang/reflect/Method;
      // 0d8: bipush 0
      // 0d9: anewarray 4
      // 0dc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babb (Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0df: astore 19
      // 0e1: iload 5
      // 0e3: aload 19
      // 0e5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baa Ljava/lang/reflect/Method;
      // 0e8: bipush 2
      // 0e9: anewarray 4
      // 0ec: dup
      // 0ed: bipush 0
      // 0ee: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbab Ljava/lang/Object;
      // 0f1: aastore
      // 0f2: dup
      // 0f3: bipush 1
      // 0f4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbb Ljava/lang/Object;
      // 0f7: aastore
      // 0f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaa (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0fb: checkcast net/minecraft/class_4588
      // 0fe: astore 20
      // 100: ifne 3d4
      // 103: aload 20
      // 105: ifnonnull 11c
      // 108: goto 10c
      // 10b: athrow
      // 10c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 10f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 112: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 115: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 118: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 11b: return
      // 11c: aload 20
      // 11e: aload 18
      // 120: fload 8
      // 122: fload 9
      // 124: fload 10
      // 126: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 12b: fload 14
      // 12d: fload 15
      // 12f: fload 16
      // 131: fload 17
      // 133: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 138: pop
      // 139: aload 20
      // 13b: aload 18
      // 13d: fload 11
      // 13f: fload 9
      // 141: fload 10
      // 143: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 148: fload 14
      // 14a: fload 15
      // 14c: fload 16
      // 14e: fload 17
      // 150: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 155: pop
      // 156: aload 20
      // 158: aload 18
      // 15a: fload 11
      // 15c: fload 12
      // 15e: fload 10
      // 160: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 165: fload 14
      // 167: fload 15
      // 169: fload 16
      // 16b: fload 17
      // 16d: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 172: pop
      // 173: aload 20
      // 175: aload 18
      // 177: fload 8
      // 179: fload 12
      // 17b: fload 10
      // 17d: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 182: fload 14
      // 184: fload 15
      // 186: fload 16
      // 188: fload 17
      // 18a: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 18f: pop
      // 190: aload 20
      // 192: aload 18
      // 194: fload 8
      // 196: fload 9
      // 198: fload 13
      // 19a: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 19f: fload 14
      // 1a1: fload 15
      // 1a3: fload 16
      // 1a5: fload 17
      // 1a7: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1ac: pop
      // 1ad: aload 20
      // 1af: aload 18
      // 1b1: fload 8
      // 1b3: fload 12
      // 1b5: fload 13
      // 1b7: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1bc: fload 14
      // 1be: fload 15
      // 1c0: fload 16
      // 1c2: fload 17
      // 1c4: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1c9: pop
      // 1ca: aload 20
      // 1cc: aload 18
      // 1ce: fload 11
      // 1d0: fload 12
      // 1d2: fload 13
      // 1d4: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1d9: fload 14
      // 1db: fload 15
      // 1dd: fload 16
      // 1df: fload 17
      // 1e1: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 1e6: pop
      // 1e7: aload 20
      // 1e9: aload 18
      // 1eb: fload 11
      // 1ed: fload 9
      // 1ef: fload 13
      // 1f1: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 1f6: fload 14
      // 1f8: fload 15
      // 1fa: fload 16
      // 1fc: fload 17
      // 1fe: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 203: pop
      // 204: aload 20
      // 206: aload 18
      // 208: fload 8
      // 20a: fload 9
      // 20c: fload 10
      // 20e: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 213: fload 14
      // 215: fload 15
      // 217: fload 16
      // 219: fload 17
      // 21b: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 220: pop
      // 221: aload 20
      // 223: aload 18
      // 225: fload 8
      // 227: fload 9
      // 229: fload 13
      // 22b: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 230: fload 14
      // 232: fload 15
      // 234: fload 16
      // 236: fload 17
      // 238: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 23d: pop
      // 23e: aload 20
      // 240: aload 18
      // 242: fload 11
      // 244: fload 9
      // 246: fload 13
      // 248: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 24d: fload 14
      // 24f: fload 15
      // 251: fload 16
      // 253: fload 17
      // 255: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 25a: pop
      // 25b: aload 20
      // 25d: aload 18
      // 25f: fload 11
      // 261: fload 9
      // 263: fload 10
      // 265: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 26a: fload 14
      // 26c: fload 15
      // 26e: fload 16
      // 270: fload 17
      // 272: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 277: pop
      // 278: aload 20
      // 27a: aload 18
      // 27c: fload 8
      // 27e: fload 12
      // 280: fload 10
      // 282: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 287: fload 14
      // 289: fload 15
      // 28b: fload 16
      // 28d: fload 17
      // 28f: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 294: pop
      // 295: aload 20
      // 297: aload 18
      // 299: fload 11
      // 29b: fload 12
      // 29d: fload 10
      // 29f: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2a4: fload 14
      // 2a6: fload 15
      // 2a8: fload 16
      // 2aa: fload 17
      // 2ac: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2b1: pop
      // 2b2: aload 20
      // 2b4: aload 18
      // 2b6: fload 11
      // 2b8: fload 12
      // 2ba: fload 13
      // 2bc: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2c1: fload 14
      // 2c3: fload 15
      // 2c5: fload 16
      // 2c7: fload 17
      // 2c9: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2ce: pop
      // 2cf: aload 20
      // 2d1: aload 18
      // 2d3: fload 8
      // 2d5: fload 12
      // 2d7: fload 13
      // 2d9: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2de: fload 14
      // 2e0: fload 15
      // 2e2: fload 16
      // 2e4: fload 17
      // 2e6: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 2eb: pop
      // 2ec: aload 20
      // 2ee: aload 18
      // 2f0: fload 8
      // 2f2: fload 9
      // 2f4: fload 10
      // 2f6: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 2fb: fload 14
      // 2fd: fload 15
      // 2ff: fload 16
      // 301: fload 17
      // 303: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 308: pop
      // 309: aload 20
      // 30b: aload 18
      // 30d: fload 8
      // 30f: fload 12
      // 311: fload 10
      // 313: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 318: fload 14
      // 31a: fload 15
      // 31c: fload 16
      // 31e: fload 17
      // 320: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 325: pop
      // 326: aload 20
      // 328: aload 18
      // 32a: fload 8
      // 32c: fload 12
      // 32e: fload 13
      // 330: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 335: fload 14
      // 337: fload 15
      // 339: fload 16
      // 33b: fload 17
      // 33d: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 342: pop
      // 343: aload 20
      // 345: aload 18
      // 347: fload 8
      // 349: fload 9
      // 34b: fload 13
      // 34d: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 352: fload 14
      // 354: fload 15
      // 356: fload 16
      // 358: fload 17
      // 35a: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 35f: pop
      // 360: aload 20
      // 362: aload 18
      // 364: fload 11
      // 366: fload 9
      // 368: fload 10
      // 36a: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 36f: fload 14
      // 371: fload 15
      // 373: fload 16
      // 375: fload 17
      // 377: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 37c: pop
      // 37d: aload 20
      // 37f: aload 18
      // 381: fload 11
      // 383: fload 9
      // 385: fload 13
      // 387: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 38c: fload 14
      // 38e: fload 15
      // 390: fload 16
      // 392: fload 17
      // 394: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 399: pop
      // 39a: aload 20
      // 39c: aload 18
      // 39e: fload 11
      // 3a0: fload 12
      // 3a2: fload 13
      // 3a4: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 3a9: fload 14
      // 3ab: fload 15
      // 3ad: fload 16
      // 3af: fload 17
      // 3b1: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 3b6: pop
      // 3b7: aload 20
      // 3b9: aload 18
      // 3bb: fload 11
      // 3bd: fload 12
      // 3bf: fload 10
      // 3c1: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 3c6: fload 14
      // 3c8: fload 15
      // 3ca: fload 16
      // 3cc: fload 17
      // 3ce: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 3d3: pop
      // 3d4: aload 20
      // 3d6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abbb Ljava/lang/reflect/Method;
      // 3d9: bipush 0
      // 3da: anewarray 4
      // 3dd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaa (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3e0: astore 21
      // 3e2: iload 5
      // 3e4: ifne 412
      // 3e7: aload 21
      // 3e9: ifnull 403
      // 3ec: goto 3f0
      // 3ef: athrow
      // 3f0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaab Ljava/lang/reflect/Method;
      // 3f3: bipush 1
      // 3f4: anewarray 4
      // 3f7: dup
      // 3f8: bipush 0
      // 3f9: aload 21
      // 3fb: aastore
      // 3fc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 3ff: goto 403
      // 402: athrow
      // 403: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 406: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 409: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 40c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 40f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 412: goto 429
      // 415: astore 22
      // 417: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 41a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 41d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 420: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 423: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 426: aload 22
      // 428: athrow
      // 429: return
   }

   public static void aabbab(aabbbbaaa param0, class_243 param1, class_243 param2, Color param3, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 6
      // 005: aload 0
      // 006: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bba (Ljava/lang/Object;)Z
      // 009: ifeq 029
      // 00c: aload 1
      // 00d: iload 6
      // 00f: ifne 01e
      // 012: goto 016
      // 015: athrow
      // 016: ifnull 029
      // 019: goto 01d
      // 01c: athrow
      // 01d: aload 2
      // 01e: ifnull 029
      // 021: aload 3
      // 022: ifnonnull 02b
      // 025: goto 029
      // 028: athrow
      // 029: return
      // 02a: athrow
      // 02b: aload 0
      // 02c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baaab (Ljava/lang/Object;)Lnet/minecraft/class_243;
      // 02f: astore 7
      // 031: aload 1
      // 032: getfield net/minecraft/class_243.field_1352 D
      // 035: aload 7
      // 037: getfield net/minecraft/class_243.field_1352 D
      // 03a: dsub
      // 03b: d2f
      // 03c: fstore 8
      // 03e: aload 1
      // 03f: getfield net/minecraft/class_243.field_1351 D
      // 042: aload 7
      // 044: getfield net/minecraft/class_243.field_1351 D
      // 047: dsub
      // 048: d2f
      // 049: fstore 9
      // 04b: aload 1
      // 04c: getfield net/minecraft/class_243.field_1350 D
      // 04f: aload 7
      // 051: getfield net/minecraft/class_243.field_1350 D
      // 054: dsub
      // 055: d2f
      // 056: fstore 10
      // 058: aload 2
      // 059: getfield net/minecraft/class_243.field_1352 D
      // 05c: aload 7
      // 05e: getfield net/minecraft/class_243.field_1352 D
      // 061: dsub
      // 062: d2f
      // 063: fstore 11
      // 065: aload 2
      // 066: getfield net/minecraft/class_243.field_1351 D
      // 069: aload 7
      // 06b: getfield net/minecraft/class_243.field_1351 D
      // 06e: dsub
      // 06f: d2f
      // 070: fstore 12
      // 072: aload 2
      // 073: getfield net/minecraft/class_243.field_1350 D
      // 076: aload 7
      // 078: getfield net/minecraft/class_243.field_1350 D
      // 07b: dsub
      // 07c: d2f
      // 07d: fstore 13
      // 07f: aload 3
      // 080: invokevirtual java/awt/Color.getRed ()I
      // 083: i2f
      // 084: ldc_w 255.0
      // 087: fdiv
      // 088: fstore 14
      // 08a: aload 3
      // 08b: invokevirtual java/awt/Color.getGreen ()I
      // 08e: i2f
      // 08f: ldc_w 255.0
      // 092: fdiv
      // 093: fstore 15
      // 095: aload 3
      // 096: invokevirtual java/awt/Color.getBlue ()I
      // 099: i2f
      // 09a: ldc_w 255.0
      // 09d: fdiv
      // 09e: fstore 16
      // 0a0: dload 4
      // 0a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baab (D)I
      // 0a5: i2f
      // 0a6: ldc_w 255.0
      // 0a9: fdiv
      // 0aa: fstore 17
      // 0ac: aload 0
      // 0ad: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 0b2: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 0b5: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 0b8: astore 18
      // 0ba: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ba Ljava/lang/reflect/Method;
      // 0bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 0c0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaa Ljava/lang/reflect/Method;
      // 0c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 0c6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaa Ljava/lang/reflect/Method;
      // 0c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 0cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babbb ()V
      // 0cf: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbba Ljava/lang/reflect/Method;
      // 0d2: bipush 1
      // 0d3: anewarray 4
      // 0d6: dup
      // 0d7: bipush 0
      // 0d8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aa Ljava/lang/Object;
      // 0db: aastore
      // 0dc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 0df: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 0e2: bipush 1
      // 0e3: anewarray 4
      // 0e6: dup
      // 0e7: bipush 0
      // 0e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abbbb ()F
      // 0eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababaa (F)F
      // 0ee: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0f1: aastore
      // 0f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 0f5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abba Ljava/lang/reflect/Method;
      // 0f8: bipush 0
      // 0f9: anewarray 4
      // 0fc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babb (Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ff: astore 19
      // 101: iload 6
      // 103: aload 19
      // 105: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baa Ljava/lang/reflect/Method;
      // 108: bipush 2
      // 109: anewarray 4
      // 10c: dup
      // 10d: bipush 0
      // 10e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baba Ljava/lang/Object;
      // 111: aastore
      // 112: dup
      // 113: bipush 1
      // 114: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbb Ljava/lang/Object;
      // 117: aastore
      // 118: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaa (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 11b: checkcast net/minecraft/class_4588
      // 11e: astore 20
      // 120: ifne 187
      // 123: aload 20
      // 125: ifnonnull 14d
      // 128: goto 12c
      // 12b: athrow
      // 12c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 12f: bipush 1
      // 130: anewarray 4
      // 133: dup
      // 134: bipush 0
      // 135: fconst_1
      // 136: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 139: aastore
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 140: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 143: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 146: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 149: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 14c: return
      // 14d: aload 20
      // 14f: aload 18
      // 151: fload 8
      // 153: fload 9
      // 155: fload 10
      // 157: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 15c: fload 14
      // 15e: fload 15
      // 160: fload 16
      // 162: fload 17
      // 164: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 169: pop
      // 16a: aload 20
      // 16c: aload 18
      // 16e: fload 11
      // 170: fload 12
      // 172: fload 13
      // 174: invokeinterface net/minecraft/class_4588.method_22918 (Lorg/joml/Matrix4fc;FFF)Lnet/minecraft/class_4588; 5
      // 179: fload 14
      // 17b: fload 15
      // 17d: fload 16
      // 17f: fload 17
      // 181: invokeinterface net/minecraft/class_4588.method_22915 (FFFF)Lnet/minecraft/class_4588; 5
      // 186: pop
      // 187: aload 20
      // 189: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abbb Ljava/lang/reflect/Method;
      // 18c: bipush 0
      // 18d: anewarray 4
      // 190: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aabaa (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
      // 193: astore 21
      // 195: iload 6
      // 197: ifne 1d6
      // 19a: aload 21
      // 19c: ifnull 1b6
      // 19f: goto 1a3
      // 1a2: athrow
      // 1a3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaab Ljava/lang/reflect/Method;
      // 1a6: bipush 1
      // 1a7: anewarray 4
      // 1aa: dup
      // 1ab: bipush 0
      // 1ac: aload 21
      // 1ae: aastore
      // 1af: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 1b2: goto 1b6
      // 1b5: athrow
      // 1b6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 1b9: bipush 1
      // 1ba: anewarray 4
      // 1bd: dup
      // 1be: bipush 0
      // 1bf: fconst_1
      // 1c0: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1c3: aastore
      // 1c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 1c7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 1ca: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 1cd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 1d0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 1d3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 1d6: goto 1fe
      // 1d9: astore 22
      // 1db: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bb Ljava/lang/reflect/Method;
      // 1de: bipush 1
      // 1df: anewarray 4
      // 1e2: dup
      // 1e3: bipush 0
      // 1e4: fconst_1
      // 1e5: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 1e8: aastore
      // 1e9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babba (Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
      // 1ec: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabab ()V
      // 1ef: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaba Ljava/lang/reflect/Method;
      // 1f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 1f5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaa Ljava/lang/reflect/Method;
      // 1f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaaaaa (Ljava/lang/reflect/Method;)V
      // 1fb: aload 22
      // 1fd: athrow
      // 1fe: return
   }

   private static void aabbba(aabbbbaaa var0, class_243 var1, class_243 var2, Color var3, double var4) {
      aabbab(var0, var1, var2, var3, var4);
   }

   public static void aabbbb(Object param0, class_238 param1, Color param2, double param3, float param5) {
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
      // 06: iload 6
      // 08: ifne 19
      // 0b: aload 1
      // 0c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaa (Ljava/lang/Object;Lnet/minecraft/class_238;)Z
      // 0f: ifne 18
      // 12: goto 16
      // 15: athrow
      // 16: return
      // 17: athrow
      // 18: aload 0
      // 19: iload 6
      // 1b: ifne 4e
      // 1e: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 21: ifeq 49
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 2c: astore 7
      // 2e: iload 6
      // 30: aload 7
      // 32: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 37: aload 7
      // 39: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.a ()Lnet/minecraft/class_4597; 1
      // 3e: aload 1
      // 3f: aload 2
      // 40: dload 3
      // 41: fload 5
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babaa (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_238;Ljava/awt/Color;DF)V
      // 46: ifeq 7d
      // 49: aload 0
      // 4a: goto 4e
      // 4d: athrow
      // 4e: iload 6
      // 50: ifne 62
      // 53: instanceof net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 56: ifeq 7d
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 0
      // 5e: goto 62
      // 61: athrow
      // 62: checkcast net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 65: astore 8
      // 67: aload 8
      // 69: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.matrices ()Lnet/minecraft/class_4587; 1
      // 6e: aload 8
      // 70: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.consumers ()Lnet/minecraft/class_4597; 1
      // 75: aload 1
      // 76: aload 2
      // 77: dload 3
      // 78: fload 5
      // 7a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.babaa (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_238;Ljava/awt/Color;DF)V
      // 7d: return
   }

   private static Object abaaaa(String var0, String var1) {
      try {
         Class var2 = Class.forName(var0);
         Field var3 = var2.getDeclaredField(var1);
         var3.setAccessible(true);
         return var3.get(null);
      } catch (ReflectiveOperationException var4) {
         return null;
      }
   }

   public static void abaaab(Object param0, class_238 param1, Color param2, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 1
      // 06: ifnull 2b
      // 09: aload 2
      // 0a: iload 5
      // 0c: ifne 1b
      // 0f: goto 13
      // 12: athrow
      // 13: ifnull 2b
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 0
      // 1b: iload 5
      // 1d: ifne 2e
      // 20: aload 1
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.abaaa (Ljava/lang/Object;Lnet/minecraft/class_238;)Z
      // 24: ifne 2d
      // 27: goto 2b
      // 2a: athrow
      // 2b: return
      // 2c: athrow
      // 2d: aload 0
      // 2e: iload 5
      // 30: ifne 79
      // 33: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 36: ifeq 74
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 0
      // 3e: iload 5
      // 40: ifne 79
      // 43: goto 47
      // 46: athrow
      // 47: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 4a: astore 6
      // 4c: aload 6
      // 4e: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 53: ifnull 74
      // 56: aload 6
      // 58: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.ba ()Lnet/minecraft/class_4587; 1
      // 5d: aload 6
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // 62: aload 1
      // 63: aload 2
      // 64: dload 3
      // 65: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a Lnet/minecraft/class_1921;
      // 68: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baabb (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_238;Ljava/awt/Color;DLnet/minecraft/class_1921;)V
      // 6b: iload 5
      // 6d: ifeq be
      // 70: goto 74
      // 73: athrow
      // 74: aload 0
      // 75: goto 79
      // 78: athrow
      // 79: iload 5
      // 7b: ifne 8d
      // 7e: instanceof net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 81: ifeq be
      // 84: goto 88
      // 87: athrow
      // 88: aload 0
      // 89: goto 8d
      // 8c: athrow
      // 8d: checkcast net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 90: astore 7
      // 92: aload 7
      // 94: iload 5
      // 96: ifne ab
      // 99: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.matrices ()Lnet/minecraft/class_4587; 1
      // 9e: ifnull be
      // a1: goto a5
      // a4: athrow
      // a5: aload 7
      // a7: goto ab
      // aa: athrow
      // ab: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.matrices ()Lnet/minecraft/class_4587; 1
      // b0: aload 7
      // b2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.ababab (Ljava/lang/Object;)Lnet/minecraft/class_4597;
      // b5: aload 1
      // b6: aload 2
      // b7: dload 3
      // b8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a Lnet/minecraft/class_1921;
      // bb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.baabb (Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;Lnet/minecraft/class_238;Ljava/awt/Color;DLnet/minecraft/class_1921;)V
      // be: return
   }

   private static void abaaba(class_4587 param0, class_4597 param1, class_243 param2, float param3, float param4, float param5, Color param6, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 337130313
      // 003: istore 15
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 9
      // 00a: aload 0
      // 00b: ifnull 027
      // 00e: aload 1
      // 00f: ifnull 027
      // 012: goto 016
      // 015: athrow
      // 016: aload 2
      // 017: iload 9
      // 019: ifne 029
      // 01c: goto 020
      // 01f: athrow
      // 020: ifnonnull 028
      // 023: goto 027
      // 026: athrow
      // 027: return
      // 028: aload 2
      // 029: fload 3
      // 02a: fload 4
      // 02c: fload 5
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aab (Lnet/minecraft/class_243;FFF)[Lnet/minecraft/class_243;
      // 031: astore 10
      // 033: aload 0
      // 034: invokevirtual net/minecraft/class_4587.method_23760 ()Lnet/minecraft/class_4587$class_4665;
      // 037: invokevirtual net/minecraft/class_4587$class_4665.method_23761 ()Lorg/joml/Matrix4f;
      // 03a: astore 11
      // 03c: aload 1
      // 03d: invokestatic net/minecraft/class_12249.method_76023 ()Lnet/minecraft/class_1921;
      // 040: invokeinterface net/minecraft/class_4597.method_73477 (Lnet/minecraft/class_1921;)Lnet/minecraft/class_4588; 2
      // 045: astore 12
      // 047: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 04a: getfield net/minecraft/class_310.field_1773 Lnet/minecraft/class_757;
      // 04d: invokevirtual net/minecraft/class_757.method_19418 ()Lnet/minecraft/class_4184;
      // 050: invokevirtual net/minecraft/class_4184.method_71156 ()Lnet/minecraft/class_243;
      // 053: astore 13
      // 055: aload 12
      // 057: aload 11
      // 059: aload 13
      // 05b: aload 10
      // 05d: bipush 0
      // 05e: aaload
      // 05f: aload 10
      // 061: bipush 1
      // 062: aaload
      // 063: aload 10
      // 065: bipush 2
      // 066: aaload
      // 067: aload 10
      // 069: bipush 3
      // 06a: aaload
      // 06b: aload 6
      // 06d: dload 7
      // 06f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix4f;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;D)V
      // 072: aload 12
      // 074: aload 11
      // 076: aload 13
      // 078: aload 10
      // 07a: bipush 4
      // 07b: aaload
      // 07c: aload 10
      // 07e: bipush 5
      // 07f: aaload
      // 080: aload 10
      // 082: ldc_w 1176327899
      // 085: iload 15
      // 087: ldc_w -2052818025
      // 08a: ixor
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 08e: ldc2_w 1904657688269837851
      // 091: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 094: aaload
      // 095: aload 10
      // 097: ldc_w 1176327892
      // 09a: iload 15
      // 09c: ldc_w -812450079
      // 09f: ixor
      // 0a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0a3: ldc2_w 5458041514074840325
      // 0a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0a9: aaload
      // 0aa: aload 6
      // 0ac: dload 7
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix4f;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;D)V
      // 0b1: aload 12
      // 0b3: aload 11
      // 0b5: aload 13
      // 0b7: aload 10
      // 0b9: bipush 0
      // 0ba: aaload
      // 0bb: aload 10
      // 0bd: bipush 1
      // 0be: aaload
      // 0bf: aload 10
      // 0c1: bipush 5
      // 0c2: aaload
      // 0c3: aload 10
      // 0c5: bipush 4
      // 0c6: aaload
      // 0c7: aload 6
      // 0c9: dload 7
      // 0cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix4f;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;D)V
      // 0ce: aload 12
      // 0d0: aload 11
      // 0d2: aload 13
      // 0d4: aload 10
      // 0d6: bipush 1
      // 0d7: aaload
      // 0d8: aload 10
      // 0da: bipush 2
      // 0db: aaload
      // 0dc: aload 10
      // 0de: ldc_w 1176327893
      // 0e1: iload 15
      // 0e3: ldc_w 33648706
      // 0e6: ixor
      // 0e7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 0ea: ldc2_w 1904657688269837851
      // 0ed: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 0f0: aaload
      // 0f1: aload 10
      // 0f3: bipush 5
      // 0f4: aaload
      // 0f5: aload 6
      // 0f7: dload 7
      // 0f9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix4f;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;D)V
      // 0fc: aload 12
      // 0fe: aload 11
      // 100: aload 13
      // 102: aload 10
      // 104: bipush 2
      // 105: aaload
      // 106: aload 10
      // 108: bipush 3
      // 109: aaload
      // 10a: aload 10
      // 10c: ldc_w 1176327894
      // 10f: iload 15
      // 111: ldc_w -1232484407
      // 114: ixor
      // 115: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 118: ldc2_w 5458041514074840325
      // 11b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 11e: aaload
      // 11f: aload 10
      // 121: ldc_w 1176327895
      // 124: iload 15
      // 126: ldc_w 2099735718
      // 129: ixor
      // 12a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 12d: ldc2_w 1904657688269837851
      // 130: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 133: aaload
      // 134: aload 6
      // 136: dload 7
      // 138: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix4f;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;D)V
      // 13b: aload 12
      // 13d: aload 11
      // 13f: aload 13
      // 141: aload 10
      // 143: bipush 3
      // 144: aaload
      // 145: aload 10
      // 147: bipush 0
      // 148: aaload
      // 149: aload 10
      // 14b: bipush 4
      // 14c: aaload
      // 14d: aload 10
      // 14f: ldc_w 1176327888
      // 152: iload 15
      // 154: ldc_w -796669260
      // 157: ixor
      // 158: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.a (II)I
      // 15b: ldc2_w 5458041514074840325
      // 15e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.aaabba (IJ)I
      // 161: aaload
      // 162: aload 6
      // 164: dload 7
      // 166: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbabb (Lnet/minecraft/class_4588;Lorg/joml/Matrix4f;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;D)V
      // 169: aload 1
      // 16a: iload 9
      // 16c: ifne 17e
      // 16f: instanceof net/minecraft/class_4597$class_4598
      // 172: ifeq 188
      // 175: goto 179
      // 178: athrow
      // 179: aload 1
      // 17a: goto 17e
      // 17d: athrow
      // 17e: checkcast net/minecraft/class_4597$class_4598
      // 181: astore 14
      // 183: aload 14
      // 185: invokevirtual net/minecraft/class_4597$class_4598.method_22993 ()V
      // 188: return
   }

   public static void abaabb(Object param0, Iterable param1, Function param2, Function param3, ToDoubleFunction param4) {
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
      // 06: iload 5
      // 08: ifne 1a
      // 0b: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 0e: ifeq 29
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 1d: astore 6
      // 1f: aload 6
      // 21: aload 1
      // 22: aload 2
      // 23: aload 3
      // 24: aload 4
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaabbaa.bbab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa;Ljava/lang/Iterable;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/ToDoubleFunction;)V
      // 29: return
   }

   private static float ababaa(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: fload 0
      // 05: iload 1
      // 06: ifne 1d
      // 09: invokestatic java/lang/Float.isFinite (F)Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: fconst_1
      // 14: freturn
      // 15: athrow
      // 16: ldc_w 0.5
      // 19: fload 0
      // 1a: invokestatic java/lang/Math.max (FF)F
      // 1d: freturn
   }

   private static void b(class_4588 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, Color var7, double var8) {
      float var10 = var7.getRed() / 255.0F;
      float var11 = var7.getGreen() / 255.0F;
      float var12 = var7.getBlue() / 255.0F;
      float var13 = baab(var8) / 255.0F;
      var0.method_22918(var1, var2, var3, var4).method_22915(var10, var11, var12, var13);
      var0.method_22918(var1, var2, var3, var6).method_22915(var10, var11, var12, var13);
      var0.method_22918(var1, var5, var3, var6).method_22915(var10, var11, var12, var13);
      var0.method_22918(var1, var5, var3, var4).method_22915(var10, var11, var12, var13);
   }

   public static class_4597 ababab(Object param0) {
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
      // 06: ifne 41
      // 09: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 0c: ifeq 40
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa
      // 17: astore 2
      // 18: aload 2
      // 19: iload 1
      // 1a: ifne 2e
      // 1d: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.a ()Lnet/minecraft/class_4597; 1
      // 22: ifnull 36
      // 25: goto 29
      // 28: athrow
      // 29: aload 2
      // 2a: goto 2e
      // 2d: athrow
      // 2e: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbbaaa.a ()Lnet/minecraft/class_4597; 1
      // 33: goto 3f
      // 36: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 39: invokevirtual net/minecraft/class_310.method_22940 ()Lnet/minecraft/class_4599;
      // 3c: invokevirtual net/minecraft/class_4599.method_23000 ()Lnet/minecraft/class_4597$class_4598;
      // 3f: areturn
      // 40: aload 0
      // 41: iload 1
      // 42: ifne 54
      // 45: instanceof net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 48: ifeq 80
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 0
      // 50: goto 54
      // 53: athrow
      // 54: checkcast net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext
      // 57: astore 2
      // 58: aload 2
      // 59: iload 1
      // 5a: ifne 6e
      // 5d: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.consumers ()Lnet/minecraft/class_4597; 1
      // 62: ifnull 76
      // 65: goto 69
      // 68: athrow
      // 69: aload 2
      // 6a: goto 6e
      // 6d: athrow
      // 6e: invokeinterface net/fabricmc/fabric/api/client/rendering/v1/world/WorldRenderContext.consumers ()Lnet/minecraft/class_4597; 1
      // 73: goto 7f
      // 76: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 79: invokevirtual net/minecraft/class_310.method_22940 ()Lnet/minecraft/class_4599;
      // 7c: invokevirtual net/minecraft/class_4599.method_23000 ()Lnet/minecraft/class_4597$class_4598;
      // 7f: areturn
      // 80: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 83: invokevirtual net/minecraft/class_310.method_22940 ()Lnet/minecraft/class_4599;
      // 86: invokevirtual net/minecraft/class_4599.method_23000 ()Lnet/minecraft/class_4597$class_4598;
      // 89: areturn
   }
}
