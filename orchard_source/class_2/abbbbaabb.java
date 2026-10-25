package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record abbbbaabb(int e, int f, int g, int h, int j, int k, int l, int m) {
   private final int a;
   private final int b;
   private final int aa;
   private final int ab;
   private final int ba;
   private final int bb;
   private final int aaa;
   private final int aab;

   public int aa() {
      return this.a;
   }

   int ab() {
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
      // 06: ifne 19
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.bb ()I
      // 0c: ifne 18
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: goto 26
      // 17: athrow
      // 18: aload 0
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.ba I
      // 1c: i2f
      // 1d: aload 0
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.bb ()I
      // 21: i2f
      // 22: fdiv
      // 23: invokestatic java/lang/Math.round (F)I
      // 26: ireturn
   }

   public int b() {
      return this.ab;
   }

   private abbbbaabb(int e, int f, int g, int h, int j, int k, int l, int m) {
      this.bb = e;
      this.aa = f;
      this.b = g;
      this.aaa = h;
      this.ab = j;
      this.aab = k;
      this.a = l;
      this.ba = m;
   }

   boolean ba(abbbbaabb param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 11
      // 09: ifnull b5
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.bb I
      // 14: aload 1
      // 15: iload 2
      // 16: ifne 34
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.bb I
      // 1c: if_icmpne b5
      // 1f: goto 23
      // 22: athrow
      // 23: aload 0
      // 24: iload 2
      // 25: ifne 3f
      // 28: goto 2c
      // 2b: athrow
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.aa I
      // 2f: aload 1
      // 30: goto 34
      // 33: athrow
      // 34: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.aa I
      // 37: if_icmpne b5
      // 3a: aload 0
      // 3b: goto 3f
      // 3e: athrow
      // 3f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.b I
      // 42: iload 2
      // 43: ifne 59
      // 46: aload 1
      // 47: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.b I
      // 4a: if_icmpne b5
      // 4d: goto 51
      // 50: athrow
      // 51: aload 0
      // 52: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.aaa I
      // 55: goto 59
      // 58: athrow
      // 59: aload 1
      // 5a: iload 2
      // 5b: ifne 71
      // 5e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.aaa I
      // 61: if_icmpne b5
      // 64: goto 68
      // 67: athrow
      // 68: aload 0
      // 69: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.ab I
      // 6c: aload 1
      // 6d: goto 71
      // 70: athrow
      // 71: iload 2
      // 72: ifne 90
      // 75: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.ab I
      // 78: if_icmpne b5
      // 7b: goto 7f
      // 7e: athrow
      // 7f: aload 0
      // 80: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.aab I
      // 83: iload 2
      // 84: ifne 9e
      // 87: goto 8b
      // 8a: athrow
      // 8b: aload 1
      // 8c: goto 90
      // 8f: athrow
      // 90: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.aab I
      // 93: if_icmpne b5
      // 96: aload 0
      // 97: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.a I
      // 9a: goto 9e
      // 9d: athrow
      // 9e: iload 2
      // 9f: ifne b2
      // a2: aload 1
      // a3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbbaabb.a I
      // a6: if_icmpne b5
      // a9: goto ad
      // ac: athrow
      // ad: bipush 1
      // ae: goto b2
      // b1: athrow
      // b2: goto b6
      // b5: bipush 0
      // b6: ireturn
   }

   int bb() {
      return this.bb + this.aa + this.b + this.aaa + this.ab + this.aab + this.a;
   }

   public int a() {
      return this.aa;
   }

   public int aaa() {
      return this.b;
   }

   public int aab() {
      return this.bb;
   }

   public int aba() {
      return this.ba;
   }

   public int abb() {
      return this.aaa;
   }

   public int baa() {
      return this.aab;
   }
}
