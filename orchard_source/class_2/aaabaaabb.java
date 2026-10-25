package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaabaaabb(int a, int b, double c, double d) {
   private final int aa;
   private final double a;
   private final int ab;
   private final double b;

   public double ab() {
      return this.a;
   }

   double ba(double param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaabb.b D
      // 08: iload 3
      // 09: ifne 1f
      // 0c: dconst_0
      // 0d: dcmpl
      // 0e: ifle 22
      // 11: goto 15
      // 14: athrow
      // 15: dload 1
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaabb.b D
      // 1a: ddiv
      // 1b: goto 1f
      // 1e: athrow
      // 1f: goto 23
      // 22: dload 1
      // 23: dreturn
   }

   private aaabaaabb(int a, int b, double c, double d) {
      this.aa = a;
      this.ab = b;
      this.b = c;
      this.a = d;
   }

   public double a() {
      return this.b;
   }

   public int bb() {
      return this.ab;
   }

   double aaa(double param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaabb.a D
      // 08: iload 3
      // 09: ifne 1f
      // 0c: dconst_0
      // 0d: dcmpl
      // 0e: ifle 22
      // 11: goto 15
      // 14: athrow
      // 15: dload 1
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaabb.a D
      // 1a: ddiv
      // 1b: goto 1f
      // 1e: athrow
      // 1f: goto 23
      // 22: dload 1
      // 23: dreturn
   }
}
