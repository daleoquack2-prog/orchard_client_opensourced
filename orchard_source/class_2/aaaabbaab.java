package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_639;
import net.minecraft.class_642;

@Environment(EnvType.CLIENT)
public final class aaaabbaab {
   public static boolean b(String var0) {
      return false;
   }

   public static boolean aa(class_437 var0, class_310 var1, class_639 var2, class_642 var3) {
      return false;
   }

   private aaaabbaab() {
   }

   public static String ab(class_639 param0, class_642 param1) {
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
      // 15: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 18: ifnull 2a
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 27: goto 40
      // 2a: aload 0
      // 2b: iload 2
      // 2c: ifne 3d
      // 2f: ifnonnull 3c
      // 32: goto 36
      // 35: athrow
      // 36: ldc ""
      // 38: goto 40
      // 3b: athrow
      // 3c: aload 0
      // 3d: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 40: areturn
   }
}
