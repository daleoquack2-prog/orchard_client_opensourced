package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record bbbbaa(double a, double b, double c, double d, int e) {
   private final double aa;
   private final int b;
   private final double ab;
   private final double ba;

   public double aa() {
      return this.ab;
   }

   public double ab() {
      return this.ba;
   }

   public int ba() {
      return this.b;
   }

   public double bb() {
      return this.a;
   }

   private bbbbaa(double a, double b, double c, double d, int e) {
      this.aa = a;
      this.a = b;
      this.ab = c;
      this.ba = d;
      this.b = e;
   }

   public double aaa() {
      return this.aa;
   }

   private boolean b() {
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
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaa.b I
      // 0c: ifle 47
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaa.a D
      // 1b: iload 1
      // 1c: ifne 33
      // 1f: aload 0
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaa.aa D
      // 23: dcmpl
      // 24: ifle 47
      // 27: goto 2b
      // 2a: athrow
      // 2b: aload 0
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaa.ba D
      // 2f: goto 33
      // 32: athrow
      // 33: aload 0
      // 34: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaa.ab D
      // 37: dcmpl
      // 38: iload 1
      // 39: ifne 44
      // 3c: ifle 47
      // 3f: goto 43
      // 42: athrow
      // 43: bipush 1
      // 44: goto 48
      // 47: bipush 0
      // 48: ireturn
   }
}
