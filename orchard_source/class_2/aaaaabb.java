package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record aaaaabb(double cv, double cw, double cx, double cy, double cz, double cA) {
   private final double b;
   private final double aa;
   private final double ab;
   private static final aaaaabb ba = new aaaaabb(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private final double a;
   private final double bb;
   private final double aaa;

   public double ab() {
      return this.a;
   }

   public boolean ba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabb.ab D
      // 08: iload 1
      // 09: ifne 1d
      // 0c: dconst_0
      // 0d: dcmpl
      // 0e: ifle 2e
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabb.aa D
      // 19: goto 1d
      // 1c: athrow
      // 1d: dconst_0
      // 1e: dcmpl
      // 1f: iload 1
      // 20: ifne 2b
      // 23: ifle 2e
      // 26: goto 2a
      // 29: athrow
      // 2a: bipush 1
      // 2b: goto 2f
      // 2e: bipush 0
      // 2f: ireturn
   }

   public double a() {
      return this.aaa;
   }

   public double bb() {
      return this.ab;
   }

   public aaaaabb(double cv, double cw, double cx, double cy, double cz, double cA) {
      this.aaa = cv;
      this.bb = cw;
      this.ab = cx;
      this.aa = cy;
      this.b = cz;
      this.a = cA;
   }

   public double aaa() {
      return this.bb;
   }
}
