package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class aabbabb {
   public static void b(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 2
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 1a
      // 0d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10: ifnonnull 19
      // 13: goto 17
      // 16: athrow
      // 17: return
      // 18: athrow
      // 19: aload 2
      // 1a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1d: aload 0
      // 1e: invokestatic net/minecraft/class_2561.method_43470 (Ljava/lang/String;)Lnet/minecraft/class_5250;
      // 21: bipush 0
      // 22: invokevirtual net/minecraft/class_746.method_7353 (Lnet/minecraft/class_2561;Z)V
      // 25: return
   }

   private aabbabb() {
   }
}
