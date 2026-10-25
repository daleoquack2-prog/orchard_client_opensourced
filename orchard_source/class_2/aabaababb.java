package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aabaababb(int a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
   private final double aa;
   private final double ab;
   private final double ba;
   private final int bb;
   private final double a;
   private final double aaa;
   private final double aab;
   private final double aba;
   private final double abb;

   public double aa() {
      return this.a;
   }

   public double ab() {
      return this.aab;
   }

   boolean bb() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.a D
      // 08: aload 0
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.aba D
      // 0c: iload 1
      // 0d: ifne 2c
      // 10: dcmpl
      // 11: ifle 64
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.abb D
      // 1c: iload 1
      // 1d: ifne 38
      // 20: goto 24
      // 23: athrow
      // 24: aload 0
      // 25: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.b D
      // 28: goto 2c
      // 2b: athrow
      // 2c: dcmpl
      // 2d: ifle 64
      // 30: aload 0
      // 31: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.aaa D
      // 34: goto 38
      // 37: athrow
      // 38: aload 0
      // 39: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.aab D
      // 3c: iload 1
      // 3d: ifne 54
      // 40: dcmpl
      // 41: ifle 64
      // 44: goto 48
      // 47: athrow
      // 48: aload 0
      // 49: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.ba D
      // 4c: aload 0
      // 4d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaababb.aa D
      // 50: goto 54
      // 53: athrow
      // 54: dcmpl
      // 55: iload 1
      // 56: ifne 61
      // 59: ifle 64
      // 5c: goto 60
      // 5f: athrow
      // 60: bipush 1
      // 61: goto 65
      // 64: bipush 0
      // 65: ireturn
   }

   public double a() {
      return this.aaa;
   }

   private aabaababb(int a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
      this.bb = a;
      this.ab = b;
      this.aba = c;
      this.b = d;
      this.a = e;
      this.abb = f;
      this.aab = g;
      this.aa = h;
      this.aaa = i;
      this.ba = j;
   }

   public double aaa() {
      return this.aa;
   }

   public int aab() {
      return this.bb;
   }

   public double aba() {
      return this.abb;
   }

   public double abb() {
      return this.ab;
   }

   public double baa() {
      return this.aba;
   }
}
