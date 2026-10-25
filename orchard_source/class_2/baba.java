package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record baba(int a, double b, int c) {
   private final double aa;
   private final int b;

   public int aa() {
      return this.a;
   }

   private baba(int a, double b, int c) {
      this.b = a;
      this.aa = b;
      this.a = c;
   }

   public double ab() {
      return this.aa;
   }

   boolean b(baba param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.aa D
      // 08: iload 2
      // 09: ifne 33
      // 0c: aload 1
      // 0d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.aa D
      // 10: ldc2_w 1.0E-4
      // 13: dadd
      // 14: dcmpl
      // 15: ifle 1f
      // 18: goto 1c
      // 1b: athrow
      // 1c: bipush 1
      // 1d: ireturn
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.aa D
      // 23: iload 2
      // 24: ifne 68
      // 27: aload 1
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.aa D
      // 2b: dsub
      // 2c: invokestatic java/lang/Math.abs (D)D
      // 2f: goto 33
      // 32: athrow
      // 33: ldc2_w 1.0E-4
      // 36: dcmpg
      // 37: ifgt 54
      // 3a: aload 0
      // 3b: iload 2
      // 3c: ifne 55
      // 3f: goto 43
      // 42: athrow
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.a I
      // 46: aload 1
      // 47: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.a I
      // 4a: if_icmple 54
      // 4d: goto 51
      // 50: athrow
      // 51: bipush 1
      // 52: ireturn
      // 53: athrow
      // 54: aload 0
      // 55: iload 2
      // 56: ifne 74
      // 59: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.aa D
      // 5c: aload 1
      // 5d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.aa D
      // 60: dsub
      // 61: invokestatic java/lang/Math.abs (D)D
      // 64: goto 68
      // 67: athrow
      // 68: ldc2_w 1.0E-4
      // 6b: dcmpg
      // 6c: ifgt a5
      // 6f: aload 0
      // 70: goto 74
      // 73: athrow
      // 74: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.a I
      // 77: iload 2
      // 78: ifne 8e
      // 7b: aload 1
      // 7c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.a I
      // 7f: if_icmpne a5
      // 82: goto 86
      // 85: athrow
      // 86: aload 0
      // 87: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.b I
      // 8a: goto 8e
      // 8d: athrow
      // 8e: iload 2
      // 8f: ifne a2
      // 92: aload 1
      // 93: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baba.b I
      // 96: if_icmpge a5
      // 99: goto 9d
      // 9c: athrow
      // 9d: bipush 1
      // 9e: goto a2
      // a1: athrow
      // a2: goto a6
      // a5: bipush 0
      // a6: ireturn
   }

   public int ba() {
      return this.b;
   }
}
