package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class aababaabb {
   private float aa;
   private final float b;
   private float ab;
   private float ba;
   private float a;
   private float bb;

   private aababaabb(float var1, float var2, float var3, float var4, float var5, abbbbba var6) {
      this.b = var1;
      this.ba = var2;
      this.aa = var3;
      this.ab = var4;
      this.bb = var1 * var4;
      this.a = this.bb * var5;
   }

   private float b() {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababaabb.bb F
      // 08: iload 1
      // 09: ifne 24
      // 0c: ldc 1.0E-4
      // 0e: fcmpg
      // 0f: ifgt 1b
      // 12: goto 16
      // 15: athrow
      // 16: fconst_1
      // 17: goto 29
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababaabb.a F
      // 1f: aload 0
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababaabb.bb F
      // 23: fdiv
      // 24: fconst_0
      // 25: fconst_1
      // 26: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 29: fstore 2
      // 2a: fload 2
      // 2b: fload 2
      // 2c: fmul
      // 2d: ldc 3.0
      // 2f: fconst_2
      // 30: fload 2
      // 31: fmul
      // 32: fsub
      // 33: fmul
      // 34: fstore 3
      // 35: fload 3
      // 36: aload 0
      // 37: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababaabb.ba F
      // 3a: aload 0
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aababaabb.aa F
      // 3e: invokestatic net/minecraft/class_3532.method_16439 (FFF)F
      // 41: freturn
   }
}
