package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abaabab(boolean a, double supportRatio, double leadingSupportRatio) {
   private final boolean aa;
   private final double a;
   private final double ab;

   public double aa() {
      return this.ab;
   }

   private boolean ab() {
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
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabab.aa Z
      // 0c: ifeq 45
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabab.ab D
      // 1b: ldc2_w 0.74
      // 1e: iload 1
      // 1f: ifne 35
      // 22: dcmpl
      // 23: iflt 45
      // 26: goto 2a
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabab.a D
      // 2e: ldc2_w 0.65
      // 31: goto 35
      // 34: athrow
      // 35: dcmpl
      // 36: iload 1
      // 37: ifne 42
      // 3a: iflt 45
      // 3d: goto 41
      // 40: athrow
      // 41: bipush 1
      // 42: goto 46
      // 45: bipush 0
      // 46: ireturn
   }

   private abaabab(boolean a, double supportRatio, double leadingSupportRatio) {
      this.aa = a;
      this.ab = supportRatio;
      this.a = leadingSupportRatio;
   }

   public boolean ba() {
      return this.aa;
   }
}
