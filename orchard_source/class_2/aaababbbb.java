package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record aaababbbb(float a, float b) {
   private final float aa;
   private static final aaababbbb b = new aaababbbb(0.0F, 0.0F);

   public float aa() {
      return this.a;
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbbb.aa F
      // 08: invokestatic java/lang/Math.abs (F)F
      // 0b: ldc 1.0E-4
      // 0d: fcmpl
      // 0e: iload 1
      // 0f: ifne 33
      // 12: ifgt 32
      // 15: goto 19
      // 18: athrow
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaababbbb.a F
      // 1d: invokestatic java/lang/Math.abs (F)F
      // 20: ldc 1.0E-4
      // 22: fcmpl
      // 23: iload 1
      // 24: ifne 33
      // 27: goto 2b
      // 2a: athrow
      // 2b: ifle 36
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public float a() {
      return this.aa;
   }

   aaababbbb(float a, float b) {
      this.aa = a;
      this.a = b;
   }
}
