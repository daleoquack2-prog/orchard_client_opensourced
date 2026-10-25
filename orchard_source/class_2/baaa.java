package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;

@Environment(EnvType.CLIENT)
final class baaa {
   private final class_2596 b;

   @Override
   public boolean equals(Object param1) {
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
      // 09: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // 0c: ifeq 2c
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: goto 18
      // 17: athrow
      // 18: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa
      // 1b: astore 3
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.b Lnet/minecraft/class_2596;
      // 20: aload 3
      // 21: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaa.b Lnet/minecraft/class_2596;
      // 24: if_acmpne 2c
      // 27: bipush 1
      // 28: goto 2d
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
   }

   @Override
   public int hashCode() {
      return System.identityHashCode(this.b);
   }

   private baaa(class_2596 var1) {
      this.b = var1;
   }
}
