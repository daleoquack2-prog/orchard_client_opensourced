package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record baabaaab(
   double x, double y, double w, double h, bababaab e, aaaababbb f
) {
   private final bababaab aa;
   private final double ab;
   private final double ba;
   private final aaaababbb bb;
   private final double aaa;
   private final double b;

   public double aa() {
      return this.b;
   }

   public aaaababbb ab() {
      return this.bb;
   }

   public double bb() {
      return this.aaa;
   }

   public bababaab b() {
      return this.aa;
   }

   private baabaaab(
      double x, double y, double w, double h, bababaab e, aaaababbb f
   ) {
      this.b = x;
      this.aaa = y;
      this.ba = w;
      this.ab = h;
      this.aa = e;
      this.bb = f;
   }

   boolean aaa(double param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: dload 1
      // 06: aload 0
      // 07: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.b D
      // 0a: iload 5
      // 0c: ifne 25
      // 0f: dcmpl
      // 10: iflt 67
      // 13: goto 17
      // 16: athrow
      // 17: dload 1
      // 18: aload 0
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.b D
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.ba D
      // 20: dadd
      // 21: goto 25
      // 24: athrow
      // 25: iload 5
      // 27: ifne 3b
      // 2a: dcmpg
      // 2b: ifgt 67
      // 2e: goto 32
      // 31: athrow
      // 32: dload 3
      // 33: aload 0
      // 34: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.aaa D
      // 37: goto 3b
      // 3a: athrow
      // 3b: iload 5
      // 3d: ifne 56
      // 40: dcmpl
      // 41: iflt 67
      // 44: goto 48
      // 47: athrow
      // 48: dload 3
      // 49: aload 0
      // 4a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.aaa D
      // 4d: aload 0
      // 4e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.ab D
      // 51: dadd
      // 52: goto 56
      // 55: athrow
      // 56: dcmpg
      // 57: iload 5
      // 59: ifne 64
      // 5c: ifgt 67
      // 5f: goto 63
      // 62: athrow
      // 63: bipush 1
      // 64: goto 68
      // 67: bipush 0
      // 68: ireturn
   }

   public double a() {
      return this.ab;
   }
}
