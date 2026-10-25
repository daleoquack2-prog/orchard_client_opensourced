package nsc;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class aabbbba extends LinkedHashMap {
   final babaabab aa;
   private static final long a;

   @Override
   protected boolean removeEldestEntry(Entry param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbba.size ()I
      // 08: iload 2
      // 09: ifne 1c
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbba.a J
      // 0f: l2i
      // 10: if_icmple 1f
      // 13: goto 17
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1c
      // 1b: athrow
      // 1c: goto 20
      // 1f: bipush 0
      // 20: ireturn
   }

   aabbbba(babaabab var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.aa = var1;
   }

   static {
      long var0 = 1518708242246546558L;
      long var10002 = -536204283405650850L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}
