package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class baaaaaaa {
   public static double aa(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: dload 0
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaaa.bb (D)D
      // 08: dstore 3
      // 09: dload 3
      // 0a: iload 2
      // 0b: ifne 1d
      // 0e: dconst_1
      // 0f: dcmpl
      // 10: iflt 1c
      // 13: goto 17
      // 16: athrow
      // 17: dconst_1
      // 18: goto 29
      // 1b: athrow
      // 1c: dconst_1
      // 1d: ldc2_w 2.0
      // 20: ldc2_w -10.0
      // 23: dload 3
      // 24: dmul
      // 25: invokestatic java/lang/Math.pow (DD)D
      // 28: dsub
      // 29: dreturn
   }

   public static double ab(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: dload 0
      // 05: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaaa.bb (D)D
      // 08: dstore 3
      // 09: dload 3
      // 0a: iload 2
      // 0b: ifne 27
      // 0e: ldc2_w 0.5
      // 11: dcmpg
      // 12: ifge 26
      // 15: goto 19
      // 18: athrow
      // 19: ldc2_w 4.0
      // 1c: dload 3
      // 1d: dmul
      // 1e: dload 3
      // 1f: dmul
      // 20: dload 3
      // 21: dmul
      // 22: goto 3b
      // 25: athrow
      // 26: dconst_1
      // 27: ldc2_w -2.0
      // 2a: dload 3
      // 2b: dmul
      // 2c: ldc2_w 2.0
      // 2f: dadd
      // 30: ldc2_w 3.0
      // 33: invokestatic java/lang/Math.pow (DD)D
      // 36: ldc2_w 0.5
      // 39: dmul
      // 3a: dsub
      // 3b: dreturn
   }

   public static double ba(double var0) {
      double var2 = 1.0 - bb(var0);
      return 1.0 - var2 * var2 * var2;
   }

   public static double b(double var0, double var2) {
      double var4 = bb(var0);
      double var6 = Math.max(0.0, Math.min(8.0, var2 * 60.0));
      return 1.0 - Math.pow(1.0 - var4, var6);
   }

   public static double bb(double var0) {
      return Math.max(0.0, Math.min(1.0, var0));
   }

   public static double aaa(double var0) {
      double var2 = bb(var0) - 1.0;
      return 1.0 + var2 * var2 * (2.70158 * var2 + 1.70158);
   }

   public static double aab(double var0) {
      double var2 = bb(var0);
      return var2 * var2 * var2 * (var2 * (var2 * 6.0 - 15.0) + 10.0);
   }

   private baaaaaaa() {
   }

   public static double aba(double var0, double var2, double var4, double var6) {
      return var0 + (var2 - var0) * b(var4, var6);
   }
}
