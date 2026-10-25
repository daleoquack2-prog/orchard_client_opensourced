package nsc;

import com.mojang.authlib.GameProfile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_640;

@Environment(EnvType.CLIENT)
public final class babaaabb {
   private static boolean aa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 0
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 1
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 1c
      // 0d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10: ifnull 27
      // 13: goto 17
      // 16: athrow
      // 17: aload 1
      // 18: goto 1c
      // 1b: athrow
      // 1c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1f: ifnull 27
      // 22: bipush 1
      // 23: goto 28
      // 26: athrow
      // 27: bipush 0
      // 28: ireturn
   }

   public static String b(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab;
      // 07: astore 2
      // 08: aload 2
      // 09: ifnull 31
      // 0c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaabb.aa ()Z
      // 0f: iload 1
      // 10: ifne 2e
      // 13: goto 17
      // 16: athrow
      // 17: ifeq 31
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 2
      // 1f: iload 1
      // 20: ifne 35
      // 23: goto 27
      // 26: athrow
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaab ()Z
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifne 34
      // 31: aload 0
      // 32: areturn
      // 33: athrow
      // 34: aload 2
      // 35: aload 0
      // 36: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaabab (Ljava/lang/String;)Ljava/lang/String;
      // 39: areturn
   }

   public static class_2561 ab(class_640 param0, class_2561 param1) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: areturn
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual net/minecraft/class_640.method_2966 ()Lcom/mojang/authlib/GameProfile;
      // 17: aload 1
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaabb.aaa (Lcom/mojang/authlib/GameProfile;Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 1b: areturn
   }

   public static boolean ba() {
      try {
         if (baaaaaab.abbaaa() != null) {
            return true;
         }
      } catch (MatchException var0) {
         throw var0;
      }

      return false;
   }

   public static Object bb(GameProfile param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab;
      // 07: astore 2
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 1a
      // 0d: ifnonnull 19
      // 10: goto 14
      // 13: athrow
      // 14: aconst_null
      // 15: goto 1e
      // 18: athrow
      // 19: aload 2
      // 1a: aload 0
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbabb (Lcom/mojang/authlib/GameProfile;)Ljava/lang/Object;
      // 1e: astore 3
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 22: astore 4
      // 24: aload 4
      // 26: iload 1
      // 27: ifne 36
      // 2a: ifnonnull 34
      // 2d: goto 31
      // 30: athrow
      // 31: aload 3
      // 32: areturn
      // 33: athrow
      // 34: aload 4
      // 36: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 39: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.bab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaaab;
      // 3c: astore 5
      // 3e: aload 5
      // 40: iload 1
      // 41: ifne 52
      // 44: ifnonnull 50
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 3
      // 4c: goto 57
      // 4f: athrow
      // 50: aload 5
      // 52: aload 0
      // 53: aload 3
      // 54: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbaaab.aaba (Lcom/mojang/authlib/GameProfile;Ljava/lang/Object;)Ljava/lang/Object;
      // 57: areturn
   }

   private babaaabb() {
   }

   public static class_2561 aaa(GameProfile param0, class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab;
      // 07: astore 3
      // 08: aload 3
      // 09: iload 2
      // 0a: ifne 1a
      // 0d: ifnonnull 19
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: goto 1f
      // 18: athrow
      // 19: aload 3
      // 1a: aload 0
      // 1b: aload 1
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbaaa (Lcom/mojang/authlib/GameProfile;Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 1f: areturn
   }

   public static class_2561 aab(class_2561 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.abbaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab;
      // 07: astore 2
      // 08: aload 2
      // 09: ifnull 31
      // 0c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaabb.aa ()Z
      // 0f: iload 1
      // 10: ifne 2e
      // 13: goto 17
      // 16: athrow
      // 17: ifeq 31
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 2
      // 1f: iload 1
      // 20: ifne 35
      // 23: goto 27
      // 26: athrow
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.aaaab ()Z
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ifne 34
      // 31: aload 0
      // 32: areturn
      // 33: athrow
      // 34: aload 2
      // 35: aload 0
      // 36: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaab.bbba (Lnet/minecraft/class_2561;)Lnet/minecraft/class_2561;
      // 39: areturn
   }
}
