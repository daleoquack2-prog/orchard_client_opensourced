package nsc;

public record aabaaaaab(double x, double y, double width, double height, double radius, double stroke) {
   private final double aa;
   private final double ab;
   private final double b;
   private final double ba;
   private final double a;
   private static final aabaaaaab bb = new aabaaaaab(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private final double aaa;

   public double ab() {
      return this.b;
   }

   public aabaaaaab(double x, double y, double width, double height, double radius, double stroke) {
      this.ba = x;
      this.ab = y;
      this.b = width;
      this.aa = height;
      this.a = radius;
      this.aaa = stroke;
   }

   public double ba() {
      return this.ab;
   }

   public double bb() {
      return this.ba;
   }

   public double b() {
      return this.aaa;
   }

   public double aaa() {
      return this.a;
   }

   public boolean aab() {
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
      // 06: ifne 1a
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaab.b D
      // 0c: dconst_0
      // 0d: dcmpl
      // 0e: ifle 2e
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: goto 1a
      // 19: athrow
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaaaaab.aa D
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
}
