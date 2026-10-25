package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface aabaabaa {
   static boolean b(Enum param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: ifnull 10
      // 08: aload 1
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 44
      // 18: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabaa
      // 1b: ifeq 43
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabaa
      // 26: astore 3
      // 27: aload 3
      // 28: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabaa.aa ()J 1
      // 2d: aload 1
      // 2e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.baba (Ljava/lang/String;)J
      // 31: lcmp
      // 32: iload 2
      // 33: ifne 3e
      // 36: ifne 41
      // 39: goto 3d
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 42
      // 41: bipush 0
      // 42: ireturn
      // 43: aload 0
      // 44: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 47: aload 1
      // 48: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4b: ireturn
   }

   long aa();
}
