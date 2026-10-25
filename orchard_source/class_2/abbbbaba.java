package nsc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_640;
import net.minecraft.class_327.class_6415;
import org.joml.Matrix4f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public final class abbbbaba {
   private static Method aa;
   private static final Logger ab;
   private static final String[] baab;
   private static final int[] baaa;
   private static Field a;
   private static Method ba;
   private static final float bb = -0.1F;
   private static boolean b;
   private static Field aaa;
   private static Method aab;
   private static final String[] aba;
   private static final String[] abb;
   private static final long[] baa;
   private static Method bab;
   private static Field bba;
   private static boolean bbb;
   private static final Object[] baba;
   private static Method aaaa;
   private static Class aaab;
   private static Class aaba;
   private static Class aabb;
   private static Field abaa;
   private static Field abab;
   private static final Integer[] abba;
   private static Method abbb;

   public static boolean aa() {
      try {
         if (aaab() != null) {
            return true;
         }
      } catch (MatchException var0) {
         throw var0;
      }

      return false;
   }

   private static aaabbaaab ab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 1a
      // 0d: ifnonnull 19
      // 10: goto 14
      // 13: athrow
      // 14: aconst_null
      // 15: goto 1d
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.aab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab;
      // 1d: areturn
   }

   public static int ba(class_2561 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bbab (Lnet/minecraft/class_2561;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 1b
      // 0e: ifnonnull 1a
      // 11: goto 15
      // 14: athrow
      // 15: bipush 0
      // 16: goto 1e
      // 19: athrow
      // 1a: aload 2
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.aa ()I
      // 1e: ireturn
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(995798668, -136512829 ^ -1211142691);
      if (abba[var3] == null) {
         abba[var3] = (int)(baa[var3] ^ var1);
      }

      return abba[var3];
   }

   private static boolean aaa(class_2561 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;
      // 06: astore 2
      // 07: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0a: astore 3
      // 0b: istore 1
      // 0c: aload 2
      // 0d: ifnull 2b
      // 10: aload 3
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 2b
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 1
      // 1d: ifne 32
      // 20: goto 24
      // 23: athrow
      // 24: ifnonnull 2e
      // 27: goto 2b
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
      // 2d: athrow
      // 2e: aload 0
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abab (Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 32: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.baab (Lnet/minecraft/class_2561;)Ljava/lang/String;
      // 35: astore 4
      // 37: aload 4
      // 39: iload 1
      // 3a: ifne 57
      // 3d: invokevirtual java/lang/String.isBlank ()Z
      // 40: ifeq 4a
      // 43: goto 47
      // 46: athrow
      // 47: bipush 0
      // 48: ireturn
      // 49: athrow
      // 4a: aload 3
      // 4b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4e: invokevirtual net/minecraft/class_746.method_5476 ()Lnet/minecraft/class_2561;
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abab (Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.baab (Lnet/minecraft/class_2561;)Ljava/lang/String;
      // 57: astore 5
      // 59: aload 5
      // 5b: iload 1
      // 5c: ifne 8c
      // 5f: invokevirtual java/lang/String.isBlank ()Z
      // 62: ifne 82
      // 65: goto 69
      // 68: athrow
      // 69: aload 4
      // 6b: iload 1
      // 6c: ifne 8c
      // 6f: goto 73
      // 72: athrow
      // 73: aload 5
      // 75: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 78: ifeq 82
      // 7b: goto 7f
      // 7e: athrow
      // 7f: bipush 1
      // 80: ireturn
      // 81: athrow
      // 82: aload 3
      // 83: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 86: invokevirtual net/minecraft/class_746.method_7334 ()Lcom/mojang/authlib/GameProfile;
      // 89: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.aab (Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;
      // 8c: astore 6
      // 8e: aload 6
      // 90: iload 1
      // 91: ifne 9d
      // 94: ifnull b1
      // 97: goto 9b
      // 9a: athrow
      // 9b: aload 4
      // 9d: aload 6
      // 9f: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // a2: iload 1
      // a3: ifne ae
      // a6: ifeq b1
      // a9: goto ad
      // ac: athrow
      // ad: bipush 1
      // ae: goto b2
      // b1: bipush 0
      // b2: ireturn
   }

   private abbbbaba() {
   }

   private static UUID aab(Object param0) {
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
      // 12: ifne 29
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.baa (Ljava/lang/Object;)Z
      // 18: ifne 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aconst_null
      // 20: areturn
      // 21: athrow
      // 22: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a Ljava/lang/reflect/Field;
      // 25: aload 0
      // 26: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 29: astore 2
      // 2a: aload 2
      // 2b: iload 1
      // 2c: ifne 3e
      // 2f: instanceof net/minecraft/class_1297
      // 32: ifeq 49
      // 35: goto 39
      // 38: athrow
      // 39: aload 2
      // 3a: goto 3e
      // 3d: athrow
      // 3e: checkcast net/minecraft/class_1297
      // 41: astore 3
      // 42: aload 3
      // 43: invokevirtual net/minecraft/class_1297.method_5667 ()Ljava/util/UUID;
      // 46: goto 4a
      // 49: aconst_null
      // 4a: areturn
      // 4b: astore 2
      // 4c: ldc 995798669
      // 4e: ldc 1136177523
      // 50: ldc -1205723910
      // 52: ixor
      // 53: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 56: ldc 995798670
      // 58: ldc 1136177523
      // 5a: ldc -1053836338
      // 5c: ixor
      // 5d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 60: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaba (II)Ljava/lang/String;
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 66: aload 2
      // 67: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bab (Ljava/lang/String;Ljava/lang/Exception;)V
      // 6a: aconst_null
      // 6b: areturn
   }

   private static void aba(aaabbaaab var0, class_4587 var1, class_4597 var2, float var3, float var4, boolean var5, int var6) {
      Matrix4f var7 = var1.method_23760().method_23761();
      class_1921 var8 = bba(var0.ab());

      try {
         if (var8 == null) {
            return;
         }
      } catch (MatchException var12) {
         throw var12;
      }

      class_4588 var9 = var2.method_73477(var8);
      float var10 = var0.bbb();
      float var11 = var0.a();
      var9.method_22918(var7, var3, var4 + var11, 0.0F).method_22913(0.0F, 1.0F).method_39415(-1).method_60803(var6);
      var9.method_22918(var7, var3 + var10, var4 + var11, 0.0F).method_22913(1.0F, 1.0F).method_39415(-1).method_60803(var6);
      var9.method_22918(var7, var3 + var10, var4, 0.0F).method_22913(1.0F, 0.0F).method_39415(-1).method_60803(var6);
      var9.method_22918(var7, var3, var4, 0.0F).method_22913(0.0F, 0.0F).method_39415(-1).method_60803(var6);
   }

   private static boolean abb(Object param0) {
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
      // 12: ifne 29
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.baa (Ljava/lang/Object;)Z
      // 18: ifne 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a Ljava/lang/reflect/Field;
      // 25: aload 0
      // 26: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 29: astore 2
      // 2a: aload 2
      // 2b: instanceof net/minecraft/class_1297
      // 2e: iload 1
      // 2f: ifne 4a
      // 32: ifne 3b
      // 35: goto 39
      // 38: athrow
      // 39: bipush 0
      // 3a: ireturn
      // 3b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.abab Ljava/lang/reflect/Field;
      // 3e: aload 0
      // 3f: iload 1
      // 40: ifne 5d
      // 43: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 46: goto 4a
      // 49: athrow
      // 4a: ifne 76
      // 4d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaa Ljava/lang/reflect/Field;
      // 50: iload 1
      // 51: ifne 6e
      // 54: goto 58
      // 57: athrow
      // 58: aload 0
      // 59: goto 5d
      // 5c: athrow
      // 5d: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 60: ifeq 76
      // 63: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.abaa Ljava/lang/reflect/Field;
      // 66: aload 0
      // 67: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 6a: goto 6e
      // 6d: athrow
      // 6e: ifnonnull 76
      // 71: bipush 1
      // 72: goto 77
      // 75: athrow
      // 76: bipush 0
      // 77: ireturn
      // 78: astore 2
      // 79: ldc 995798671
      // 7b: ldc 1253460122
      // 7d: ldc -1093864985
      // 7f: ixor
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 83: ldc 995798664
      // 85: ldc 1253460122
      // 87: ldc 901972011
      // 89: ixor
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 8d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaba (II)Ljava/lang/String;
      // 90: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 93: aload 2
      // 94: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bab (Ljava/lang/String;Ljava/lang/Exception;)V
      // 97: bipush 0
      // 98: ireturn
   }

   private static boolean baa(Object var0) {
      return false;
   }

   private static void bab(String var0, Exception var1) {
      int var2 = baaabbaa.bba;

      boolean var10000;
      label22: {
         try {
            var10000 = b;
            if (var2 != 0) {
               break label22;
            }

            if (b) {
               return;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = true;
      }

      b = var10000;
      ab.warn(aabbaaaba.abba(aaba(a(995798665, 1146954498 ^ 997108812), a(995798666, 1146954498 ^ 423731294))), var0, var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static class_1921 bba(class_2960 var0) {
      int var7 = -2114790792;
      int var1 = baaabbaa.bba;

      Object var10000;
      label53: {
         label46: {
            try {
               var10000 = bab;
               if (var1 != 0) {
                  break label53;
               }

               if (bab == null) {
                  break label46;
               }
            } catch (Exception var12) {
               throw var12;
            }

            try {
               var10000 = bab.invoke(null, var0);
               break label53;
            } catch (Exception var9) {
               bab(aabbaaaba.abba(aaba(a(995798667, var7 ^ 2062819086), a(995798660, var7 ^ 1220621643))), var9);
               return null;
            }
         }

         String[] var2 = new String[]{
            aabbaaaba.abba(aaba(a(995798661, var7 ^ 5796409), a(995798662, var7 ^ -1201817363))),
            aabbaaaba.abba(aaba(a(995798663, var7 ^ 831940576), a(995798656, var7 ^ 1854066633))),
            aabbaaaba.abba(aaba(a(995798657, var7 ^ 89748809), a(995798658, var7 ^ -384622279))),
            aabbaaaba.abba(aaba(a(995798659, var7 ^ 197845927), a(995798684, var7 ^ -433774617)))
         };
         int var3 = var2.length;
         int var4 = 0;

         while (var4 < var3) {
            String var5 = var2[var4];

            try {
               Method var6 = class_1921.class.getMethod(var5, class_2960.class);
               bab = var6;
               return (class_1921)var6.invoke(null, var0);
            } catch (NoSuchMethodException var10) {
               var4++;
               if (var1 == 0) {
                  continue;
               }
               break;
            } catch (Exception var11) {
               bab(aabbaaaba.abba(aaba(a(995798685, var7 ^ 852312405), a(995798686, var7 ^ 1476703820))), var11);
               return null;
            }
         }

         return null;
      }

      try {
         return (class_1921)var10000;
      } catch (Exception var8) {
         bab(aabbaaaba.abba(aaba(a(995798667, var7 ^ 2062819086), a(995798660, var7 ^ 1220621643))), var8);
         return null;
      }
   }

   public static abbbabba bbb(UUID param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 2094149114
      // 003: istore 5
      // 005: aload 0
      // 006: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.abba (Ljava/util/UUID;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab;
      // 009: astore 3
      // 00a: aload 3
      // 00b: ifnull 018
      // 00e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.b ()Z
      // 011: ifne 01d
      // 014: goto 018
      // 017: athrow
      // 018: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabba;
      // 01b: areturn
      // 01c: athrow
      // 01d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaaa Ljava/lang/reflect/Method;
      // 020: aconst_null
      // 021: ldc_w 995798687
      // 024: iload 5
      // 026: ldc_w 1051243879
      // 029: ixor
      // 02a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 02d: ldc2_w 1348254620047691372
      // 030: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 033: anewarray 4
      // 036: dup
      // 037: bipush 0
      // 038: aload 3
      // 039: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.ab ()Lnet/minecraft/class_2960;
      // 03c: aastore
      // 03d: dup
      // 03e: bipush 1
      // 03f: iload 1
      // 040: i2f
      // 041: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 044: aastore
      // 045: dup
      // 046: bipush 2
      // 047: iload 2
      // 048: i2f
      // 049: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 04c: aastore
      // 04d: dup
      // 04e: bipush 3
      // 04f: aload 3
      // 050: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.aba ()F
      // 053: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 056: aastore
      // 057: dup
      // 058: bipush 4
      // 059: aload 3
      // 05a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.bb ()F
      // 05d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 060: aastore
      // 061: dup
      // 062: bipush 5
      // 063: bipush 0
      // 064: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 067: aastore
      // 068: dup
      // 069: ldc_w 995798680
      // 06c: iload 5
      // 06e: ldc_w 1528067951
      // 071: ixor
      // 072: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 075: ldc2_w 67342648286987689
      // 078: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 07b: bipush 0
      // 07c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07f: aastore
      // 080: dup
      // 081: ldc_w 995798681
      // 084: iload 5
      // 086: ldc_w 944426986
      // 089: ixor
      // 08a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 08d: ldc2_w 4214062474332371944
      // 090: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 093: aload 3
      // 094: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.aaab ()I
      // 097: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09a: aastore
      // 09b: dup
      // 09c: ldc_w 995798682
      // 09f: iload 5
      // 0a1: ldc_w 947146213
      // 0a4: ixor
      // 0a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 0a8: ldc2_w 7751995338382067983
      // 0ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 0ae: aload 3
      // 0af: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.bba ()I
      // 0b2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0b5: aastore
      // 0b6: dup
      // 0b7: ldc_w 995798683
      // 0ba: iload 5
      // 0bc: ldc_w 2018689990
      // 0bf: ixor
      // 0c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 0c3: ldc2_w 384529605668592648
      // 0c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 0c9: aload 3
      // 0ca: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.aaab ()I
      // 0cd: i2f
      // 0ce: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0d1: aastore
      // 0d2: dup
      // 0d3: ldc_w 995798676
      // 0d6: iload 5
      // 0d8: ldc_w -680389234
      // 0db: ixor
      // 0dc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 0df: ldc2_w 7107919093220264790
      // 0e2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 0e5: aload 3
      // 0e6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.bba ()I
      // 0e9: i2f
      // 0ea: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0ed: aastore
      // 0ee: dup
      // 0ef: ldc_w 995798677
      // 0f2: iload 5
      // 0f4: ldc_w 1840704570
      // 0f7: ixor
      // 0f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 0fb: ldc2_w 5660933000669122534
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 101: bipush -1
      // 102: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 105: aastore
      // 106: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 109: pop
      // 10a: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabba
      // 10d: dup
      // 10e: bipush 1
      // 10f: aload 3
      // 110: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.ba ()I
      // 113: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabba.<init> (ZI)V
      // 116: areturn
      // 117: astore 4
      // 119: ldc_w 995798678
      // 11c: iload 5
      // 11e: ldc_w 1953134691
      // 121: ixor
      // 122: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 125: ldc_w 995798679
      // 128: iload 5
      // 12a: ldc_w -1631257334
      // 12d: ixor
      // 12e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 131: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaba (II)Ljava/lang/String;
      // 134: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 137: aload 4
      // 139: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bab (Ljava/lang/String;Ljava/lang/Exception;)V
      // 13c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbabba;
      // 13f: areturn
   }

   private static boolean aaaa(UUID var0) {
      int var10000 = baaabbaa.bba;
      abaaaaba var2 = aaab();
      int var1 = var10000;

      label33: {
         try {
            var5 = var2;
            if (var1 != 0) {
               break label33;
            }

            if (var2 == null) {
               return false;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var5 = var2;
      }

      try {
         boolean var6 = var5.ba(var0);
         if (var1 != 0) {
            return var6;
         }

         if (var6) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   private static abaaaaba aaab() {
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

   private static int a(int var0, int var1) {
      int var2 = baaa[var0 ^ 995798668] ^ var1 ^ var0;
      var2 += 17945;
      var2 += 3590;
      var2 ^= 37259;
      var2 += 32679;
      var2 -= 14753;
      var2 ^= 63308;
      var2 -= 31261;
      var2 -= 39483;
      return var2 ^ 18905;
   }

   private static String aaba(int var0, int var1) {
      int var9 = 2048462115;
      int var2 = (var0 ^ a(995798672, var9 ^ -1714627955)) & a(995798673, var9 ^ 615706631);
      if (aba[var2] == null) {
         char[] var3 = abb[var2].toCharArray();

         int var4 = switch (var3[0] & a(995798674, var9 ^ -151603006)) {
            case 0 -> a(995798675, var9 ^ 66496081);
            case 1 -> a(995798700, var9 ^ -1933516513);
            case 2 -> a(995798701, var9 ^ 1702476493);
            case 3 -> a(995798702, var9 ^ -833693413);
            case 4 -> a(995798703, var9 ^ -1726585317);
            case 5 -> a(995798696, var9 ^ -529626288);
            case 6 -> a(995798697, var9 ^ 157720673);
            case 7 -> a(995798698, var9 ^ -579781077);
            case 8 -> a(995798699, var9 ^ -705112812);
            case 9 -> a(995798692, var9 ^ -1157289931);
            case 10 -> a(995798693, var9 ^ 1728140872);
            case 11 -> a(995798694, var9 ^ -1558386871);
            case 12 -> a(995798695, var9 ^ 166449644);
            case 13 -> a(995798688, var9 ^ 1601012415);
            case 14 -> a(995798689, var9 ^ -1154883068);
            case 15 -> 2;
            case 16 -> a(995798690, var9 ^ 333266923);
            case 17 -> a(995798691, var9 ^ 2131334564);
            case 18 -> a(995798716, var9 ^ 5356469);
            case 19 -> 4;
            case 20 -> a(995798717, var9 ^ -561085174);
            case 21 -> a(995798718, var9 ^ -2117723511);
            case 22 -> a(995798719, var9 ^ -1884385234);
            case 23 -> a(995798712, var9 ^ -1023599862);
            case 24 -> a(995798713, var9 ^ -894548787);
            case 25 -> a(995798714, var9 ^ -1646320424);
            case 26 -> a(995798715, var9 ^ -697698444);
            case 27 -> a(995798708, var9 ^ 1361259816);
            case 28 -> a(995798709, var9 ^ 1597939854);
            case 29 -> a(995798710, var9 ^ 840036415);
            case 30 -> a(995798711, var9 ^ 1622200952);
            case 31 -> 1;
            case 32 -> a(995798704, var9 ^ 348552034);
            case 33 -> 3;
            case 34 -> a(995798705, var9 ^ -258698073);
            case 35 -> a(995798706, var9 ^ -1107661832);
            case 36 -> a(995798707, var9 ^ -640493297);
            case 37 -> a(995798732, var9 ^ 1246929712);
            case 38 -> a(995798733, var9 ^ 675911279);
            case 39 -> a(995798734, var9 ^ -1627952965);
            case 40 -> a(995798735, var9 ^ 1237906423);
            case 41 -> a(995798728, var9 ^ -1501363906);
            case 42 -> a(995798729, var9 ^ 1312314998);
            case 43 -> a(995798730, var9 ^ -91897537);
            case 44 -> a(995798731, var9 ^ -658965895);
            case 45 -> a(995798724, var9 ^ 349413613);
            case 46 -> a(995798725, var9 ^ -1138473170);
            case 47 -> a(995798726, var9 ^ 1997018646);
            case 48 -> a(995798727, var9 ^ -1349139054);
            case 49 -> a(995798720, var9 ^ 209952845);
            case 50 -> a(995798721, var9 ^ 1371376805);
            case 51 -> a(995798722, var9 ^ 453857849);
            case 52 -> a(995798723, var9 ^ -986732366);
            case 53 -> a(995798748, var9 ^ -1618399036);
            case 54 -> a(995798749, var9 ^ -62588934);
            case 55 -> a(995798750, var9 ^ -1254094910);
            case 56 -> a(995798751, var9 ^ -1868007578);
            case 57 -> a(995798744, var9 ^ 924063822);
            case 58 -> a(995798745, var9 ^ 1551110841);
            case 59 -> a(995798746, var9 ^ -1084443458);
            case 60 -> a(995798747, var9 ^ -1043305747);
            case 61 -> a(995798740, var9 ^ -732056075);
            case 62 -> a(995798741, var9 ^ -627375233);
            case 63 -> a(995798742, var9 ^ 1282447663);
            case 64 -> a(995798743, var9 ^ 269557810);
            case 65 -> a(995798736, var9 ^ -1858796750);
            case 66 -> a(995798737, var9 ^ -1411892879);
            case 67 -> a(995798738, var9 ^ -1767810608);
            case 68 -> a(995798739, var9 ^ 1042762922);
            case 69 -> a(995798764, var9 ^ 1147906112);
            case 70 -> a(995798765, var9 ^ -1856727829);
            case 71 -> a(995798766, var9 ^ -1940115451);
            case 72 -> a(995798767, var9 ^ -549850138);
            case 73 -> a(995798760, var9 ^ -1570838698);
            case 74 -> a(995798761, var9 ^ -453364832);
            case 75 -> a(995798762, var9 ^ 830929063);
            case 76 -> a(995798763, var9 ^ 175033792);
            case 77 -> a(995798756, var9 ^ 48774144);
            case 78 -> a(995798757, var9 ^ -1424095121);
            case 79 -> a(995798758, var9 ^ 2095006997);
            case 80 -> a(995798759, var9 ^ 568437314);
            case 81 -> a(995798752, var9 ^ 2010311314);
            case 82 -> a(995798753, var9 ^ -829498026);
            case 83 -> a(995798754, var9 ^ -561827235);
            case 84 -> a(995798755, var9 ^ -2058877429);
            case 85 -> a(995798780, var9 ^ -2085233419);
            case 86 -> a(995798781, var9 ^ 1989401421);
            case 87 -> a(995798782, var9 ^ 1046052073);
            case 88 -> a(995798783, var9 ^ 29076138);
            case 89 -> a(995798776, var9 ^ -2068504141);
            case 90 -> a(995798777, var9 ^ -798991704);
            case 91 -> a(995798778, var9 ^ -709437154);
            case 92 -> a(995798779, var9 ^ -1712787096);
            case 93 -> a(995798772, var9 ^ 704855465);
            case 94 -> a(995798773, var9 ^ 2062489116);
            case 95 -> a(995798774, var9 ^ -1233820767);
            case 96 -> 5;
            case 97 -> a(995798775, var9 ^ 1783894819);
            case 98 -> a(995798768, var9 ^ 832045031);
            case 99 -> a(995798769, var9 ^ -479771401);
            case 100 -> a(995798770, var9 ^ -1263545741);
            case 101 -> a(995798771, var9 ^ 1640516337);
            case 102 -> a(995798540, var9 ^ -1944681393);
            case 103 -> a(995798541, var9 ^ 689021829);
            case 104 -> a(995798542, var9 ^ 38633023);
            case 105 -> a(995798543, var9 ^ 1173115035);
            case 106 -> a(995798536, var9 ^ -1911205898);
            case 107 -> a(995798537, var9 ^ 869706633);
            case 108 -> a(995798538, var9 ^ 751395903);
            case 109 -> a(995798539, var9 ^ 815144339);
            case 110 -> a(995798532, var9 ^ -599080993);
            case 111 -> a(995798533, var9 ^ 1474633541);
            case 112 -> a(995798534, var9 ^ -775228615);
            case 113 -> a(995798535, var9 ^ 782332291);
            case 114 -> a(995798528, var9 ^ 431664911);
            case 115 -> a(995798529, var9 ^ -1036686020);
            case 116 -> a(995798530, var9 ^ 1044830684);
            case 117 -> a(995798531, var9 ^ -1795105239);
            case 118 -> a(995798556, var9 ^ 1318826107);
            case 119 -> a(995798557, var9 ^ 250635450);
            case 120 -> a(995798558, var9 ^ 850721206);
            case 121 -> a(995798559, var9 ^ -1324545485);
            case 122 -> a(995798552, var9 ^ -1767650711);
            case 123 -> a(995798553, var9 ^ 1927435500);
            case 124 -> a(995798554, var9 ^ -801747043);
            case 125 -> a(995798555, var9 ^ 960585812);
            case 126 -> a(995798548, var9 ^ 1911368307);
            case 127 -> a(995798549, var9 ^ -615951899);
            case 128 -> a(995798550, var9 ^ -1695818719);
            case 129 -> a(995798551, var9 ^ 197854014);
            case 130 -> a(995798544, var9 ^ -1157712613);
            case 131 -> a(995798545, var9 ^ -1354254261);
            case 132 -> a(995798546, var9 ^ -205240966);
            case 133 -> a(995798547, var9 ^ -640971929);
            case 134 -> a(995798572, var9 ^ 1537458524);
            case 135 -> a(995798573, var9 ^ 121779395);
            case 136 -> a(995798574, var9 ^ 486904054);
            case 137 -> a(995798575, var9 ^ 606051837);
            case 138 -> a(995798568, var9 ^ 688620140);
            case 139 -> a(995798569, var9 ^ 2008420821);
            case 140 -> a(995798570, var9 ^ 1539081668);
            case 141 -> a(995798571, var9 ^ -2141712192);
            case 142 -> a(995798564, var9 ^ 141901132);
            case 143 -> a(995798565, var9 ^ -1420768928);
            case 144 -> a(995798566, var9 ^ 484129700);
            case 145 -> a(995798567, var9 ^ 1346545781);
            case 146 -> a(995798560, var9 ^ 1580837366);
            case 147 -> a(995798561, var9 ^ 1277424627);
            case 148 -> a(995798562, var9 ^ 466266422);
            case 149 -> a(995798563, var9 ^ 1170748424);
            case 150 -> a(995798588, var9 ^ -2128812962);
            case 151 -> a(995798589, var9 ^ -1600868453);
            case 152 -> a(995798590, var9 ^ 670825020);
            case 153 -> a(995798591, var9 ^ 996002197);
            case 154 -> a(995798584, var9 ^ 621109920);
            case 155 -> a(995798585, var9 ^ -192653292);
            case 156 -> a(995798586, var9 ^ -1632301846);
            case 157 -> a(995798587, var9 ^ 1417055327);
            case 158 -> a(995798580, var9 ^ -1108044935);
            case 159 -> a(995798581, var9 ^ -1947094207);
            case 160 -> a(995798582, var9 ^ 1840695560);
            case 161 -> a(995798583, var9 ^ -713792614);
            case 162 -> a(995798576, var9 ^ -24089857);
            case 163 -> a(995798577, var9 ^ 1907419272);
            case 164 -> a(995798578, var9 ^ 590933966);
            case 165 -> a(995798579, var9 ^ -1751236915);
            case 166 -> a(995798604, var9 ^ 2124690378);
            case 167 -> a(995798605, var9 ^ -1545828289);
            case 168 -> a(995798606, var9 ^ -2126019551);
            case 169 -> a(995798607, var9 ^ 219230782);
            case 170 -> a(995798600, var9 ^ -1431480576);
            case 171 -> a(995798601, var9 ^ 550385390);
            case 172 -> a(995798602, var9 ^ -1647564393);
            case 173 -> a(995798603, var9 ^ 63239021);
            case 174 -> a(995798596, var9 ^ -1586212909);
            case 175 -> a(995798597, var9 ^ 94586230);
            case 176 -> a(995798598, var9 ^ 1694476060);
            case 177 -> a(995798599, var9 ^ -6811587);
            case 178 -> a(995798592, var9 ^ 753970070);
            case 179 -> a(995798593, var9 ^ -1077529496);
            case 180 -> a(995798594, var9 ^ 1209878775);
            case 181 -> a(995798595, var9 ^ 88079299);
            case 182 -> a(995798620, var9 ^ -1819247691);
            case 183 -> a(995798621, var9 ^ 1205296448);
            case 184 -> a(995798622, var9 ^ 1161350435);
            case 185 -> a(995798623, var9 ^ 536469144);
            case 186 -> a(995798616, var9 ^ 2099005897);
            case 187 -> a(995798617, var9 ^ 1133276461);
            case 188 -> a(995798618, var9 ^ -344696348);
            case 189 -> a(995798619, var9 ^ -692489706);
            case 190 -> a(995798612, var9 ^ -1326090901);
            case 191 -> a(995798613, var9 ^ -259335049);
            case 192 -> a(995798614, var9 ^ -981672990);
            case 193 -> 0;
            case 194 -> a(995798615, var9 ^ -1711136706);
            case 195 -> a(995798608, var9 ^ 719598221);
            case 196 -> a(995798609, var9 ^ 411561256);
            case 197 -> a(995798610, var9 ^ -1815804613);
            case 198 -> a(995798611, var9 ^ -848471907);
            case 199 -> a(995798636, var9 ^ 846209410);
            case 200 -> a(995798637, var9 ^ -381762355);
            case 201 -> a(995798638, var9 ^ 1462823050);
            case 202 -> a(995798639, var9 ^ -1874664538);
            case 203 -> a(995798632, var9 ^ -1435951330);
            case 204 -> a(995798633, var9 ^ -988005872);
            case 205 -> a(995798634, var9 ^ 1559469879);
            case 206 -> a(995798635, var9 ^ -791520576);
            case 207 -> a(995798628, var9 ^ 304581327);
            case 208 -> a(995798629, var9 ^ 584501771);
            case 209 -> a(995798630, var9 ^ 1232492065);
            case 210 -> a(995798631, var9 ^ -1190246521);
            case 211 -> a(995798624, var9 ^ 303894148);
            case 212 -> a(995798625, var9 ^ 1244725647);
            case 213 -> a(995798626, var9 ^ -108347736);
            case 214 -> a(995798627, var9 ^ -1402267436);
            case 215 -> a(995798652, var9 ^ -1840950610);
            case 216 -> a(995798653, var9 ^ -1427014553);
            case 217 -> a(995798654, var9 ^ -1608126317);
            case 218 -> a(995798655, var9 ^ -1364190993);
            case 219 -> a(995798648, var9 ^ 179649193);
            case 220 -> a(995798649, var9 ^ 1100283442);
            case 221 -> a(995798650, var9 ^ 846511413);
            case 222 -> a(995798651, var9 ^ 2041468761);
            case 223 -> a(995798644, var9 ^ -629041126);
            case 224 -> a(995798645, var9 ^ -1223153386);
            case 225 -> a(995798646, var9 ^ -206261222);
            case 226 -> a(995798647, var9 ^ 270998952);
            case 227 -> a(995798640, var9 ^ 977172614);
            case 228 -> a(995798641, var9 ^ -1142785169);
            case 229 -> a(995798642, var9 ^ 439091756);
            case 230 -> a(995798643, var9 ^ -1631811395);
            case 231 -> a(995798924, var9 ^ 52283007);
            case 232 -> a(995798925, var9 ^ 1977080603);
            case 233 -> a(995798926, var9 ^ 748742942);
            case 234 -> a(995798927, var9 ^ -887077325);
            case 235 -> a(995798920, var9 ^ -180778589);
            case 236 -> a(995798921, var9 ^ -877361724);
            case 237 -> a(995798922, var9 ^ -133256722);
            case 238 -> a(995798923, var9 ^ -548187974);
            case 239 -> a(995798916, var9 ^ 480885492);
            case 240 -> a(995798917, var9 ^ 86764918);
            case 241 -> a(995798918, var9 ^ -1418010971);
            case 242 -> a(995798919, var9 ^ -1390811702);
            case 243 -> a(995798912, var9 ^ -1047419780);
            case 244 -> a(995798913, var9 ^ -1460129366);
            case 245 -> a(995798914, var9 ^ 96703450);
            case 246 -> a(995798915, var9 ^ -1974314349);
            case 247 -> a(995798940, var9 ^ -1252635450);
            case 248 -> a(995798941, var9 ^ 258239444);
            case 249 -> a(995798942, var9 ^ 1638162813);
            case 250 -> a(995798943, var9 ^ 1802751272);
            case 251 -> a(995798936, var9 ^ 1651112024);
            case 252 -> a(995798937, var9 ^ 1228194265);
            case 253 -> a(995798938, var9 ^ -1763859822);
            case 254 -> a(995798939, var9 ^ 1720388103);
            default -> a(995798932, var9 ^ 592386985);
         };
         int var5 = (var1 & a(995798933, var9 ^ 474031351)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(995798934, var9 ^ 1322227411)) >>> a(995798935, var9 ^ 2116832663)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(995798928, var9 ^ -249392422);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(995798929, var9 ^ 819421134);
            }
         }

         aba[var2] = new String(var3).intern();
      }

      return aba[var2];
   }

   private static boolean aabb(Object var0, Object var1, Object var2) {
      return false;
   }

   public static void abaa(Object param0, class_2561 param1) {
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
      // 05: ifnull 1f
      // 08: aload 1
      // 09: iload 2
      // 0a: ifne 19
      // 0d: goto 11
      // 10: athrow
      // 11: ifnull 1f
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.baa (Ljava/lang/Object;)Z
      // 1c: ifne 21
      // 1f: return
      // 20: athrow
      // 21: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 24: astore 3
      // 25: aload 3
      // 26: iload 2
      // 27: ifne 37
      // 2a: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 2d: ifnonnull 36
      // 30: goto 34
      // 33: athrow
      // 34: return
      // 35: athrow
      // 36: aload 3
      // 37: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 3a: aload 1
      // 3b: invokevirtual net/minecraft/class_327.method_27525 (Lnet/minecraft/class_5348;)I
      // 3e: istore 4
      // 40: iload 2
      // 41: aload 0
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aab (Ljava/lang/Object;)Ljava/util/UUID;
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.abba (Ljava/util/UUID;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab;
      // 48: astore 5
      // 4a: ifne 69
      // 4d: aload 5
      // 4f: ifnull 60
      // 52: goto 56
      // 55: athrow
      // 56: iload 4
      // 58: aload 5
      // 5a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.aa ()I
      // 5d: iadd
      // 5e: istore 4
      // 60: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bba Ljava/lang/reflect/Field;
      // 63: aload 0
      // 64: iload 4
      // 66: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 69: goto 93
      // 6c: astore 4
      // 6e: ldc_w 995798930
      // 71: ldc_w 2017932784
      // 74: ldc_w -1383528940
      // 77: ixor
      // 78: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 7b: ldc_w 995798931
      // 7e: ldc_w 2017932784
      // 81: ldc_w 774573209
      // 84: ixor
      // 85: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 88: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaba (II)Ljava/lang/String;
      // 8b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 8e: aload 4
      // 90: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bab (Ljava/lang/String;Ljava/lang/Exception;)V
      // 93: return
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
      // 06: ifne 1b
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaa (Lnet/minecraft/class_2561;)Z
      // 0c: ifeq 1e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaab.abab (Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 17: goto 1b
      // 1a: athrow
      // 1b: goto 1f
      // 1e: aload 0
      // 1f: areturn
   }

   public static aaabbaaab abba(UUID param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 24
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 28
      // 19: aload 0
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.ba (Ljava/util/UUID;)Z
      // 1d: ifne 27
      // 20: goto 24
      // 23: athrow
      // 24: aconst_null
      // 25: areturn
      // 26: athrow
      // 27: aload 2
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaba.aab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab;
      // 2b: areturn
   }

   public static boolean abbb(Object param0, Object param1, float param2, float param3, Object param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1120744007
      // 003: istore 11
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: aload 1
      // 009: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aab (Ljava/lang/Object;)Ljava/util/UUID;
      // 00c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.abba (Ljava/util/UUID;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab;
      // 00f: astore 6
      // 011: istore 5
      // 013: aload 6
      // 015: iload 5
      // 017: ifne 022
      // 01a: ifnull 048
      // 01d: goto 021
      // 020: athrow
      // 021: aload 1
      // 022: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.abb (Ljava/lang/Object;)Z
      // 025: iload 5
      // 027: ifne 04d
      // 02a: ifeq 048
      // 02d: goto 031
      // 030: athrow
      // 031: aload 0
      // 032: iload 5
      // 034: ifne 091
      // 037: goto 03b
      // 03a: athrow
      // 03b: aload 1
      // 03c: aload 4
      // 03e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aabb (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 041: ifne 04e
      // 044: goto 048
      // 047: athrow
      // 048: bipush 0
      // 049: goto 04d
      // 04c: athrow
      // 04d: ireturn
      // 04e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aa Ljava/lang/reflect/Method;
      // 051: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.ba Ljava/lang/reflect/Method;
      // 054: aload 0
      // 055: bipush 0
      // 056: anewarray 4
      // 059: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 05c: bipush 3
      // 05d: anewarray 4
      // 060: dup
      // 061: bipush 0
      // 062: ldc_w 995798956
      // 065: iload 11
      // 067: ldc_w -941656048
      // 06a: ixor
      // 06b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 06e: ldc_w 995798957
      // 071: iload 11
      // 073: ldc_w 1900032871
      // 076: ixor
      // 077: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 07a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaba (II)Ljava/lang/String;
      // 07d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 080: aastore
      // 081: dup
      // 082: bipush 1
      // 083: aload 6
      // 085: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.ab ()Lnet/minecraft/class_2960;
      // 088: aastore
      // 089: dup
      // 08a: bipush 2
      // 08b: aload 4
      // 08d: aastore
      // 08e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 091: astore 7
      // 093: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.abbb Ljava/lang/reflect/Method;
      // 096: aload 0
      // 097: bipush 2
      // 098: anewarray 4
      // 09b: dup
      // 09c: bipush 0
      // 09d: bipush -1
      // 09e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a1: aastore
      // 0a2: dup
      // 0a3: bipush 1
      // 0a4: aload 1
      // 0a5: aastore
      // 0a6: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0a9: checkcast java/lang/Integer
      // 0ac: invokevirtual java/lang/Integer.intValue ()I
      // 0af: istore 8
      // 0b1: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bba Ljava/lang/reflect/Field;
      // 0b4: aload 1
      // 0b5: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0b8: ineg
      // 0b9: i2f
      // 0ba: fconst_2
      // 0bb: fdiv
      // 0bc: fload 2
      // 0bd: fadd
      // 0be: fstore 9
      // 0c0: fload 3
      // 0c1: aload 6
      // 0c3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.a ()F
      // 0c6: fconst_2
      // 0c7: fdiv
      // 0c8: fsub
      // 0c9: fstore 10
      // 0cb: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aab Ljava/lang/reflect/Method;
      // 0ce: aconst_null
      // 0cf: ldc_w 995798958
      // 0d2: iload 11
      // 0d4: ldc_w 553103033
      // 0d7: ixor
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 0db: ldc2_w 8200700196624584233
      // 0de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 0e1: anewarray 4
      // 0e4: dup
      // 0e5: bipush 0
      // 0e6: aload 7
      // 0e8: aastore
      // 0e9: dup
      // 0ea: bipush 1
      // 0eb: fload 9
      // 0ed: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0f0: aastore
      // 0f1: dup
      // 0f2: bipush 2
      // 0f3: fload 10
      // 0f5: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0f8: aastore
      // 0f9: dup
      // 0fa: bipush 3
      // 0fb: ldc -0.1
      // 0fd: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 100: aastore
      // 101: dup
      // 102: bipush 4
      // 103: aload 6
      // 105: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.bbb ()F
      // 108: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 10b: aastore
      // 10c: dup
      // 10d: bipush 5
      // 10e: aload 6
      // 110: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.a ()F
      // 113: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 116: aastore
      // 117: dup
      // 118: ldc_w 995798959
      // 11b: iload 11
      // 11d: ldc_w 1955183449
      // 120: ixor
      // 121: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 124: ldc2_w 7932783606955383712
      // 127: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 12a: aload 6
      // 12c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.aaab ()I
      // 12f: i2f
      // 130: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 133: aastore
      // 134: dup
      // 135: ldc_w 995798952
      // 138: iload 11
      // 13a: ldc_w 530665031
      // 13d: ixor
      // 13e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 141: ldc2_w 9140654039002921342
      // 144: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 147: aload 6
      // 149: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.bba ()I
      // 14c: i2f
      // 14d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 150: aastore
      // 151: dup
      // 152: ldc_w 995798953
      // 155: iload 11
      // 157: ldc_w -266526408
      // 15a: ixor
      // 15b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 15e: ldc2_w 276703270137354694
      // 161: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bb (IJ)I
      // 164: iload 8
      // 166: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 169: aastore
      // 16a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 16d: pop
      // 16e: bipush 1
      // 16f: ireturn
      // 170: astore 7
      // 172: ldc_w 995798954
      // 175: iload 11
      // 177: ldc_w 96685070
      // 17a: ixor
      // 17b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 17e: ldc_w 995798955
      // 181: iload 11
      // 183: ldc_w -1536059093
      // 186: ixor
      // 187: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.a (II)I
      // 18a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaba (II)Ljava/lang/String;
      // 18d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 190: aload 7
      // 192: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.bab (Ljava/lang/String;Ljava/lang/Exception;)V
      // 195: bipush 0
      // 196: ireturn
   }

   public static void baaa(class_2561 param0, class_327 param1, class_4587 param2, class_4597 param3, float param4, float param5, class_6415 param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aaa (Lnet/minecraft/class_2561;)Z
      // 04: ifeq 0e
      // 07: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.ab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab;
      // 0a: goto 0f
      // 0d: athrow
      // 0e: aconst_null
      // 0f: astore 8
      // 11: aload 8
      // 13: ifnull 2e
      // 16: aload 1
      // 17: ifnull 2e
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 2
      // 1f: ifnull 2e
      // 22: goto 26
      // 25: athrow
      // 26: aload 3
      // 27: ifnonnull 30
      // 2a: goto 2e
      // 2d: athrow
      // 2e: return
      // 2f: athrow
      // 30: fload 4
      // 32: aload 8
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.aa ()I
      // 37: i2f
      // 38: fsub
      // 39: fstore 9
      // 3b: fload 5
      // 3d: aload 1
      // 3e: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 41: pop
      // 42: ldc_w 9.0
      // 45: aload 8
      // 47: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.a ()F
      // 4a: fsub
      // 4b: fconst_2
      // 4c: fdiv
      // 4d: fadd
      // 4e: fstore 10
      // 50: aload 8
      // 52: aload 2
      // 53: aload 3
      // 54: fload 9
      // 56: fload 10
      // 58: aload 6
      // 5a: getstatic net/minecraft/class_327$class_6415.field_33994 Lnet/minecraft/class_327$class_6415;
      // 5d: if_acmpne 65
      // 60: bipush 1
      // 61: goto 66
      // 64: athrow
      // 65: bipush 0
      // 66: iload 7
      // 68: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.aba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab;Lnet/minecraft/class_4587;Lnet/minecraft/class_4597;FFZI)V
      // 6b: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var31 = 702489339;
      short var26 = 27309;
      int var25 = 0;
      String[] var23 = new String[6];
      int var24 = 0;
      int var22 = "Ʀ땻뻫놝縬란㻴뜭廮뉤\ude2d뒓\ude29럻麡냛廨땵븢눈\udefe뇵㻼럤Ḥ닳績낓纺덻뻴뉽ḯ됀绯똽黶됔㸡놃\ude3e띃뺠닋㻩끍븼뜈廲뚵뻡뗼븬늓㸷뗣\udea3놫ﻧ뗵\ude3f됐ợ닅廣랼㸮딋㸴넛ﺡ냛绿뉅ḻ놸\udee6뙽黴딤ḳ넓㸺땳㺫돋黦떕㸰됀\udee9뎍绣뛌鸡닃\ude22뚛㺺뒳㻴뇝㸧뛨\udef6됭뻸라鸥듋븶뗻뺬딛黽늭Ḷ둀뻠됅绨뒬帪뒫鸮뛋\udea0뚛绫눭鸮딐\udef6띥ﻨ댌︢뛃㸾뙃红띃黰뀵帪뎰黶눅续럼︠끋席냻㺣뛋㻿럕㸱듨ﻴ랥뻢뀴㸫뙛㸰됳Ằ됓黠덽席뉘廭댭㻾뎜ḿ뜣㸧띓麶뙳廥녵\ude25램ﻻ냅㻶뇔帻뜃︦럣㺬냃廸뜽︡띸黳덅黧눌︭됣\ude2c뗳麷럻\udee6닭︸랠\udefe뚥\udee3댴ḿ끻Ḩ뚳Ả덛Ứ딽븤놠黮뉕绿뀜븥낫︽띻㺥똣뻲똍㸵노绯둥\udefc딜㸸뗛븾뀫ﺲ듫ﻷ눥\ude35뗠ỹ눥绹똜帨똃帿넳麨뉻㻡녍븴냠\udee8넽廽둄㸧놃㸼둓㺼띃绥능Ḥ뚈㻸끵ﻩ뇴︤눳븶땣뺢뗛㻼뜽︾뒀ụ뎥黾댌\ude36뙓︯딣纴놻㻤끥鸦럨\udefb딍뻯돌ḹ뀛鸧뒻㺺덻\udeed덵Ḽ뜀廲덵뻧뚜\ude27낃\ude3d닓\udebc똳\udee7딵︮늰黱돵\ufeff냤︥뉳Ḫ뉻庻덃뻦땅ḷ뙐뻱딭\udef3뇤帩뗳\ude37덛\udea6넓黭뉵㸾띨뻼낕뻽덴㸧뚃ḷ뇣ﺯ뒳뻤낅븢랸廷닕ﻰ뛴鸮뒓縠됃Ẵ넳黡낝븵댈뻡럽绽돴\ude33닛㸯놓红딃绹락縱낐\udefe뚭ỷ똤㸷돓鸰뜋麡넓뻴-혛뽻ퟅ\udfb3폸齮푭ό폴羠픃羶훳㼺탳彻퓵龤튀\udf7b핅ὠ퀼ᾣ폓\udfba폋ἵ킻齻퀅羾ퟠὦ홍ｽ푴뾯헳龣헻㼢튣\udf7a풍Hꃾ䪤ꍀ\u0a60ꏽશꘘ檺꒹쩬ꊶꩫꆆૻꀖ\ueab6ꈨ橿ꕍ檫ꖀ檼\ua7e9쩦ꌞ੩ꃾ\ueae3ꖾꪻꐘ䩰ꊽ⪪ꚰꪡꊱꩳꇎꩩꅖ⫢Ꚗ䪤ꟸ橩ꘝ檵ꖠ\ueab8ꖁ詨ꆖ\u0a7aꕾ諡ꇦહꖈ䩰ꀭ⪸ꎨ⪷ꔱ詨ꇮ쩭꛶쫹ꂮ\ueaae\n蚈刦蓖鋷芃爾蒾鈸芯ዬ\u0010ɟ갲ӱೠ\u058cⰥɁ谪İ\u0cfd˗泽ܷ\uec69ſ氪\n鰑㙌鹏\uf69d頚ᙔ鸧\uf652頶皆"
         .length();
      String var21 = "Ʀ땻뻫놝縬란㻴뜭廮뉤\ude2d뒓\ude29럻麡냛廨땵븢눈\udefe뇵㻼럤Ḥ닳績낓纺덻뻴뉽ḯ됀绯똽黶됔㸡놃\ude3e띃뺠닋㻩끍븼뜈廲뚵뻡뗼븬늓㸷뗣\udea3놫ﻧ뗵\ude3f됐ợ닅廣랼㸮딋㸴넛ﺡ냛绿뉅ḻ놸\udee6뙽黴딤ḳ넓㸺땳㺫돋黦떕㸰됀\udee9뎍绣뛌鸡닃\ude22뚛㺺뒳㻴뇝㸧뛨\udef6됭뻸라鸥듋븶뗻뺬딛黽늭Ḷ둀뻠됅绨뒬帪뒫鸮뛋\udea0뚛绫눭鸮딐\udef6띥ﻨ댌︢뛃㸾뙃红띃黰뀵帪뎰黶눅续럼︠끋席냻㺣뛋㻿럕㸱듨ﻴ랥뻢뀴㸫뙛㸰됳Ằ됓黠덽席뉘廭댭㻾뎜ḿ뜣㸧띓麶뙳廥녵\ude25램ﻻ냅㻶뇔帻뜃︦럣㺬냃廸뜽︡띸黳덅黧눌︭됣\ude2c뗳麷럻\udee6닭︸랠\udefe뚥\udee3댴ḿ끻Ḩ뚳Ả덛Ứ딽븤놠黮뉕绿뀜븥낫︽띻㺥똣뻲똍㸵노绯둥\udefc딜㸸뗛븾뀫ﺲ듫ﻷ눥\ude35뗠ỹ눥绹똜帨똃帿넳麨뉻㻡녍븴냠\udee8넽廽둄㸧놃㸼둓㺼띃绥능Ḥ뚈㻸끵ﻩ뇴︤눳븶땣뺢뗛㻼뜽︾뒀ụ뎥黾댌\ude36뙓︯딣纴놻㻤끥鸦럨\udefb딍뻯돌ḹ뀛鸧뒻㺺덻\udeed덵Ḽ뜀廲덵뻧뚜\ude27낃\ude3d닓\udebc똳\udee7딵︮늰黱돵\ufeff냤︥뉳Ḫ뉻庻덃뻦땅ḷ뙐뻱딭\udef3뇤帩뗳\ude37덛\udea6넓黭뉵㸾띨뻼낕뻽덴㸧뚃ḷ뇣ﺯ뒳뻤낅븢랸廷닕ﻰ뛴鸮뒓縠됃Ẵ넳黡낝븵댈뻡럽绽돴\ude33닛㸯놓红딃绹락縱낐\udefe뚭ỷ똤㸷돓鸰뜋麡넓뻴-혛뽻ퟅ\udfb3폸齮푭ό폴羠픃羶훳㼺탳彻퓵龤튀\udf7b핅ὠ퀼ᾣ폓\udfba폋ἵ킻齻퀅羾ퟠὦ홍ｽ푴뾯헳龣헻㼢튣\udf7a풍Hꃾ䪤ꍀ\u0a60ꏽશꘘ檺꒹쩬ꊶꩫꆆૻꀖ\ueab6ꈨ橿ꕍ檫ꖀ檼\ua7e9쩦ꌞ੩ꃾ\ueae3ꖾꪻꐘ䩰ꊽ⪪ꚰꪡꊱꩳꇎꩩꅖ⫢Ꚗ䪤ꟸ橩ꘝ檵ꖠ\ueab8ꖁ詨ꆖ\u0a7aꕾ諡ꇦહꖈ䩰ꀭ⪸ꎨ⪷ꔱ詨ꇮ쩭꛶쫹ꂮ\ueaae\n蚈刦蓖鋷芃爾蒾鈸芯ዬ\u0010ɟ갲ӱೠ\u058cⰥɁ谪İ\u0cfd˗泽ܷ\uec69ſ氪\n鰑㙌鹏\uf69d頚ᙔ鸧\uf652頶皆";

      do {
         char var27 = var21.charAt(var25);
         String var10000 = var21.substring(var25 + 1, var25 + 1 + var27);
         int var29 = 0;
         char[] var28 = var10000.toCharArray();

         do {
            int var30 = var28[var29];

            var30 = (char)(switch (var29 % 7) {
               default -> 52;
               case 1 -> 51;
               case 2 -> 234;
               case 3 -> 236;
               case 4 -> 231;
               case 5 -> 60;
               case 6 -> 122;
            }) ^ var30;
            if (var29 % 2 == 0) {
               var28[var29] = (char)((var30 >>> 3 | var30 << 13) & 65535 ^ var26);
            } else {
               var28[var29] = (char)((var30 << 3 | var30 >>> 13) & 65535 ^ var26);
            }
         } while (++var29 < var28.length);

         var23[var24] = new String(var28);
         var24++;
         var25 = var25 + var27 + 1;
      } while (var25 < var22);

      baab = var23;
      baba = new Object[var23.length];
      int var17 = -1122369294;
      byte[] var15 = "ÆS\u0088\u0004}Û¥®\u0004×l\u001ar;¾}\u0006Êô\u0019ùr\u0088K$¢Ñ]}GÂ{OrÔ^\u0007ë d¿ï'\u009a6%º\u0094\u0096ÎcM\u0002ê¨.î¡\u009e\u007f\fy1ùá\u0096<²5~\u009cÂ_¶ÿOÄ;Dÿ¡\u0087\u0089ÝÂÙ\u001b\u0000ÂçH\u001e\u0082Áå;-áâÒ\u0097%\u001c-\u008eùR\u008e\u009b¨¨/e\u0094ÐLØëAÏ\n®º\tÿ®¤\tp\u0098ÜÕ\u0099!¸72\u0016Ú\u008deNd;\u001c6¶\u0098õ>¢:!)<Ë) é?G]*@\u009bYkª_Då2õ³ì<£5\u00819Gqá\u008dï\u0085=\u0087\u0083Q\u0097\u0092ü\t¹x\"Ö¸\t}\u009e\u0018\u0093sö\u0092\u0019>¥\u0019E6öy\u0017a\u0087'L*1Êz\u00ad{/\f£f¢ÖÎIÍ\u0092\u009cèÑüè\u009ey\u0017\fÌ\u0096ÄA¢i\u0010%\u008aÛò¶\n\u009eåÔ\u0011\u0094\u001bb¯j8µ\u0090Î\u0090ZÛ<Ç²`k¢\u0006Ýü\u0094$àø7è\u008b£\b@|z\u0097\u008bP+ÆSÍÇ\u009aðÛ£ \u00adå±eçUP\u00069wªýcÑ2¬\u0000\u001cô\u001eI\u0018:~lðJ\u0003ËL\u001b¨ ,/\u001fC\u0004¶º=\u0088hâ(\u0005\u0088J&Ã\u0001c°(¤¨ìI\"åmm\u0001*W\u0080\u0004ªjùd\u0015Â\u007fN\u0090¸3ªmm\f©up\u0004\fl#añð^\u0006å!\u0018¢0bÍÞú¸ö6Ï²þ°>·WF5\u0087\u0080\u0087G\u0007Ý¹\u0097Û\u008b\u008aè\u00ad2Öß}\"Û0\ty\u0010\u0004\u0017\u007fíÞñ\u008aËæôÂ\u0001Ayýã\u0097.xí\u001cY,8X\u0095)îÚÆe°óÎÖ[?\u0086\u0086·\u0014hJ-a\u0091\u0096\f\u0011\u0018ÍÏÂj\u001f?y´H÷ÐQ\u009d\u0090HMpN\u0086¥ÕI¡\u0013þ\u0015C\u0094¹´RdrMrBÏ\u008e¨§Ð\u0091fÐÌÎ # \u0012¼ä«½\u001d\u0082-\u0092ñ~Òùs]åâ¬3>mn\u0018Â\u001eÛ\u009biXãS²Ã²Äò¨Y\u0006ÎìÄ¦MU\bújûÈÂ\u008eºVü,nMÑÅ\u0019b\u001f\u008dµ(c'\u0011S\u0006f³Þº÷\u0093>\u0087F¦·çS\u001f»~\u000f\u009cxÐ%\u0093\u0089(§ûÃæû\u001a\bgá]\u00ad´ØG \u0091ÕS\u0080\u0098\u008bî\u0013\u0006§ä\u0087v|\u0000\u0012\u0003ô-?ûW\bË\u009fà\u0083\u0006\u0091¬\u001aª½¢aªà°{ñHç\u0092ª;¹\u0090\b¯}Dæe\\Ì\u00adLÛ£Ç Ç\u0005ôÃÙ]`k\bÜe@bí\u000eA¨.\u008e\u0087A¬\u0090pw©±6\u0091îËé),`\u0098\u0002Èh\u009d\u008dèÕ\u0015ß`ÒèkÆ=Ò\u0082ü\u000eÀ_\u0084\u008aù}\u001f\u0086#ñI0¢Võj8Ü\u0096\u000b¿a\u0094+pÿ\u009cÎ3],ròùûG¹\u0098§\u009a@\u0003À\u0013JÐ¨\u0096ÆC\u009e7\u0012´EJ\"ùgÆÉoÈyX»\u008f^>¹`Î]ã¡Ü\u001f\u0081DJ¥¿ÔPÉ\u0017,[,*áp\u0013L\u00adwÛ\fÒá=9$Ù\u0013fZ\"1Ö¼0\u0086äßï\u0082o\u009d\u0007Ï15e\u008eÎ(#»\u0015fùÚ«hÕ\u008bl\u001aÞ¿V1\u001dë9D8¬ «¢L,\u008ag\u0000î\u007f\u0088%Þ\u008eÈ©µ.T÷EVz\u0092îE\fN¶i<\u009b\u0005Ò\u0083®P3\u001a)n\u001dP\u008dV©~ä\\}òDRè\u001aSöí8M½ÌÃôÎ,\u0080%\u0085ök¡&Ù\u009a®K@+\u0081\u000fì¶\u0082ì\u007f\u001f8ÆfDpGºyÿæt\u0000\nbäµÐÿEÄÄ\u0089\u008fçîÐøê{7xzÈ\taµ77ì\u0087d\u0004V«^#\u000bSüàñ\u0086ßùsîSW\"Ü\u0011QAæK=É\u0098\u0094T 2cù\u009b\u0090ïv\nfwI\u000eO¦ó<h\u0010\u009dübw\u0097+Î´\u009e1û\u008bµlÂÂj\u0085¡è\u009aÓ\tmß\u0017\u0019\u0017à\u0019';²\u0096&\u001c\u0082tqd\rz\u0091\u0013Ì\u008f\\\u0006S\u008f5ûÐ-ì¢\u0003SCXµÍcÇä{@\u0004°\u0004\u0091\u0013Û-K¯4\u0091Å\u0000ÁOxk\u009f\u0002ð\u0087\u0086ã\u008f{ÎOéï\u0098\u0081\u0013\u0094ÞÐÐ§©\u008bÛ\u0099«*\u0001\to,è\u008dý_ÊZ\u008c<1\u007fÍ+S\u0087È·ð\u0098ÈKIôHë²ß¯·¸¦¦1I\u0010®\u009eî<ùçº®åa,³VS._\u0005r\u0096EÜmº)/ÒÝèÓ0ÒvþmÑ\u0001\u0093ÉxØ?·¦\u0006ò\u0091qI\u009a®CÄ\b't/\u0099ÿjtc\u0089\u00007"
         .getBytes("ISO-8859-1");
      int var16 = var15.length / 4;
      baaa = new int[var16];
      byte var18 = 0;
      int var19 = 0;

      do {
         int var20 = (var15[var18] & 255) << 24 | (var15[var18 + 1] & 255) << 16 | (var15[var18 + 2] & 255) << 8 | var15[var18 + 3] & 255;
         var20 ^= var17;
         baaa[var19] = var20;
         var18 += 4;
      } while (++var19 < var16);

      String[] var13 = new String[a(995798948, var31 ^ 696097892)];
      int var11 = 0;
      String var10;
      int var12 = (var10 = bbbb(-1291758244, (short)-2704, -1082605771, 1099359891, -294791254, (byte)-121)).length();
      int var9 = a(995798949, var31 ^ 1641151034);
      int var34 = -1;

      label121:
      while (true) {
         String var38 = var10.substring(++var34, var34 + var9);
         int var10001 = -1;

         while (true) {
            char[] var54;
            label116: {
               char[] var42 = var38.toCharArray();
               int var10003 = var42.length;
               int var14 = 0;
               var54 = var42;
               var10001 = var10003;
               char[] var64;
               int var10004;
               if (var10003 <= 1) {
                  var64 = var42;
                  var10004 = var14;
               } else {
                  var54 = var42;
                  var10001 = var10003;
                  if (var10003 <= var14) {
                     break label116;
                  }

                  var64 = var42;
                  var10004 = var14;
               }

               while (true) {
                  var64[var10004] = (char)(var64[var10004] ^ switch (var14 % a(995798944, var31 ^ 102090960)) {
                     case 0 -> a(995798945, var31 ^ 78909980);
                     case 1 -> a(995798946, var31 ^ -1062012016);
                     case 2 -> a(995798947, var31 ^ 1388439292);
                     case 3 -> a(995798972, var31 ^ 597828275);
                     case 4 -> a(995798973, var31 ^ 1656061750);
                     case 5 -> 5;
                     default -> a(995798974, var31 ^ 1730798491);
                  });
                  var14++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var64 = var54;
                  } else {
                     if (var10001 <= var14) {
                        break;
                     }

                     var64 = var54;
                     var10004 = var14;
                  }
               }
            }

            String var71 = new String(var54).intern();
            switch (var10001) {
               case 0:
                  var13[var11++] = var71;
                  if ((var34 += var9) >= var12) {
                     abb = var13;
                     aba = new String[a(995798951, var31 ^ 1900987323)];
                     long var0 = 7778126222323531821L;
                     long[] var6 = new long[a(995798975, var31 ^ 1742035598)];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = bbbb(-1291758242, (short)-7937, 2123331462, -170268149, 2147244999, (byte)95)).length();
                     byte var2 = 0;

                     label95:
                     while (true) {
                        int var49 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var49, var2).getBytes(bbbb(-1291758241, 32699, 1609443654, 650988365, 168624003, 54));
                        long[] var40 = var6;
                        var49 = var3++;
                        long var60 = (var7[0] & 255L) << a(995798968, var31 ^ -411721301)
                           | (var7[1] & 255L) << a(995798969, var31 ^ 2730875)
                           | (var7[2] & 255L) << a(995798970, var31 ^ 162487286)
                           | (var7[3] & 255L) << a(995798971, var31 ^ 16842227)
                           | (var7[4] & 255L) << a(995798964, var31 ^ 1450813878)
                           | (var7[5] & 255L) << a(995798965, var31 ^ 1258241986)
                           | (var7[a(995798966, var31 ^ -103989953)] & 255L) << a(995798967, var31 ^ -1427339954)
                           | var7[a(995798960, var31 ^ 1945348464)] & 255L;
                        byte var72 = -1;

                        while (true) {
                           long var75 = var60 ^ var0;
                           switch (var72) {
                              case 0:
                                 var40[var49] = var75;
                                 if (var2 >= var5) {
                                    baa = var6;
                                    abba = new Integer[a(995798986, var31 ^ -870902984)];
                                    ab = LoggerFactory.getLogger(abbbbaba.class);
                                    return;
                                 }
                                 break;
                              default:
                                 var40[var49] = var75;
                                 if (var2 < var5) {
                                    continue label95;
                                 }

                                 var5 = (var4 = bbbb(-1291758248, 15946, -494355455, 1454036597, 1562199750, (byte)30)).length();
                                 var2 = 0;
                           }

                           byte var51 = var2;
                           var2 += 8;
                           var7 = var4.substring(var51, var2).getBytes(bbbb(-1291758247, (short)-32697, -1562395592, 314800340, 361596318, (byte)101));
                           var40 = var6;
                           var49 = var3++;
                           var60 = (var7[0] & 255L) << a(995798961, var31 ^ -2142450027)
                              | (var7[1] & 255L) << a(995798962, var31 ^ 2091827616)
                              | (var7[2] & 255L) << a(995798963, var31 ^ 1374929902)
                              | (var7[3] & 255L) << a(995798988, var31 ^ 1012362080)
                              | (var7[4] & 255L) << a(995798989, var31 ^ -1876314777)
                              | (var7[5] & 255L) << a(995798990, var31 ^ 1561289283)
                              | (var7[a(995798991, var31 ^ 892358877)] & 255L) << a(995798984, var31 ^ -1481021605)
                              | var7[a(995798985, var31 ^ 912357716)] & 255L;
                           var72 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var34);
                  break;
               default:
                  var13[var11++] = var71;
                  if ((var34 += var9) < var12) {
                     var9 = var10.charAt(var34);
                     continue label121;
                  }

                  var12 = (var10 = bbbb(-1291758243, (short)-15051, -1842475375, -218464434, -1361788020, (byte)-49)).length();
                  var9 = a(995798950, var31 ^ 924778738);
                  var34 = -1;
            }

            var38 = var10.substring(++var34, var34 + var9);
            var10001 = 0;
         }
      }
   }

   private static String baab(class_2561 param0) {
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
      // 09: ifnonnull 17
      // 0c: goto 10
      // 0f: athrow
      // 10: ldc_w ""
      // 13: goto 20
      // 16: athrow
      // 17: aload 0
      // 18: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
      // 1d: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 20: areturn
   }

   private static String bbbb(int var0, short var1, int var2, int var3, int var4, byte var5) {
      int var10 = var0 ^ -1291758244;
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
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 38694;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 22) {
            default -> 163;
            case 1 -> 196;
            case 2 -> 245;
            case 3 -> 204;
            case 4 -> 73;
            case 5 -> 22;
            case 6 -> 144;
            case 7 -> 96;
            case 8 -> 67;
            case 9 -> 60;
            case 10 -> 98;
            case 11 -> 236;
            case 12 -> 108;
            case 13 -> 135;
            case 14 -> 108;
            case 15 -> 62;
            case 16 -> 44;
            case 17 -> 45;
            case 18 -> 44;
            case 19 -> 72;
            case 20 -> 44;
            case 21 -> 178;
         } ^ var1 ^ var2 ^ var7 ^ var0 ^ var5 ^ var4 ^ var3);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   public static aaabbaaab baba(class_1657 param0) {
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
      // 06: ifne 16
      // 09: ifnonnull 15
      // 0c: goto 10
      // 0f: athrow
      // 10: aconst_null
      // 11: goto 1c
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual net/minecraft/class_1657.method_5667 ()Ljava/util/UUID;
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.abba (Ljava/util/UUID;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab;
      // 1c: areturn
   }

   public static bbbaabaa babb(UUID var0) {
      try {
         if (aaaa(var0)) {
            return new bbbaabaa(true, null);
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return bbbaabaa.a;
   }

   static void bbaa() {
      aaaa = null;
      aab = null;
      aa = null;
      ba = null;
      abbb = null;
      bab = null;
      a = null;
      abab = null;
      aaa = null;
      abaa = null;
      bba = null;
      aabb = null;
      aaba = null;
      aaab = null;
      bbb = false;
      b = false;
   }

   public static aaabbaaab bbab(class_2561 var0) {
      try {
         if (aaa(var0)) {
            return ab();
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return null;
   }

   private static boolean b() {
      return false;
   }

   public static int bbba(class_332 param0, class_640 param1, class_327 param2, int param3, int param4) {
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
      // 06: ifnull 1a
      // 09: aload 1
      // 0a: iload 5
      // 0c: ifne 1e
      // 0f: goto 13
      // 12: athrow
      // 13: ifnonnull 1d
      // 16: goto 1a
      // 19: athrow
      // 1a: bipush 0
      // 1b: ireturn
      // 1c: athrow
      // 1d: aload 1
      // 1e: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababbb.bb (Lcom/mojang/authlib/GameProfile;)Ljava/util/UUID;
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaba.abba (Ljava/util/UUID;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab;
      // 27: astore 6
      // 29: aload 6
      // 2b: iload 5
      // 2d: ifne 3c
      // 30: ifnonnull 3a
      // 33: goto 37
      // 36: athrow
      // 37: bipush 0
      // 38: ireturn
      // 39: athrow
      // 3a: aload 6
      // 3c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.bb ()F
      // 3f: fstore 7
      // 41: aload 6
      // 43: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.aba ()F
      // 46: fstore 8
      // 48: iload 4
      // 4a: i2f
      // 4b: aload 2
      // 4c: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 4f: pop
      // 50: ldc_w 9.0
      // 53: fload 7
      // 55: fsub
      // 56: fconst_2
      // 57: fdiv
      // 58: fadd
      // 59: fstore 9
      // 5b: aload 0
      // 5c: aload 6
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.ab ()Lnet/minecraft/class_2960;
      // 61: iload 3
      // 62: i2d
      // 63: fload 9
      // 65: f2d
      // 66: fload 8
      // 68: f2d
      // 69: fload 7
      // 6b: f2d
      // 6c: aload 6
      // 6e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.aaab ()I
      // 71: aload 6
      // 73: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.bba ()I
      // 76: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaa.aaabba (Lnet/minecraft/class_332;Lnet/minecraft/class_2960;DDDDII)V
      // 79: aload 6
      // 7b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.ba ()I
      // 7e: ireturn
   }
}
