package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class abbbababb implements aaabbbaaa {
   private static final float aa = 0.5F;
   private static final float ab = 1.25F;
   private float b = Float.NaN;
   private float ba;
   private static final float bb = 8.0F;

   @Override
   public void aaa() {
      this.ba = 0.0F;
      this.b = Float.NaN;
   }

   @Override
   public babb bb(
      babb var1, babb var2, float var3, float var4
   ) {
      return this.ab(var1, var2, var3, 10.0F, var4);
   }

   @Override
   public babb ab(
      babb param1, babb param2, float param3, float param4, float param5
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 6
      // 005: fload 4
      // 007: ldc 9.95
      // 009: iload 6
      // 00b: ifne 025
      // 00e: fcmpl
      // 00f: ifge 029
      // 012: goto 016
      // 015: athrow
      // 016: fload 3
      // 017: iload 6
      // 019: ifne 04b
      // 01c: goto 020
      // 01f: athrow
      // 020: fconst_0
      // 021: goto 025
      // 024: athrow
      // 025: fcmpg
      // 026: ifgt 044
      // 029: aload 0
      // 02a: fconst_0
      // 02b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbababb.ba F
      // 02e: aload 0
      // 02f: ldc NaN
      // 031: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbababb.b F
      // 034: aload 1
      // 035: aload 1
      // 036: aload 2
      // 037: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 03a: aload 1
      // 03b: aload 2
      // 03c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 03f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.aba (FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;
      // 042: areturn
      // 043: athrow
      // 044: fconst_1
      // 045: fload 3
      // 046: fsub
      // 047: fconst_1
      // 048: fload 3
      // 049: fsub
      // 04a: fmul
      // 04b: fstore 7
      // 04d: ldc 8.0
      // 04f: fconst_1
      // 050: fload 7
      // 052: fsub
      // 053: fmul
      // 054: fstore 8
      // 056: ldc 0.1
      // 058: fload 4
      // 05a: ldc 1.5
      // 05c: fmul
      // 05d: ldc 5.0
      // 05f: fdiv
      // 060: invokestatic java/lang/Math.max (FF)F
      // 063: fstore 9
      // 065: fload 8
      // 067: fload 9
      // 069: fdiv
      // 06a: fstore 10
      // 06c: aload 1
      // 06d: aload 2
      // 06e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 071: invokestatic java/lang/Math.abs (F)F
      // 074: aload 1
      // 075: aload 2
      // 076: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 079: invokestatic java/lang/Math.abs (F)F
      // 07c: fadd
      // 07d: fstore 11
      // 07f: aload 0
      // 080: iload 6
      // 082: ifne 0b4
      // 085: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbababb.b F
      // 088: invokestatic java/lang/Float.isFinite (F)Z
      // 08b: ifeq 0af
      // 08e: goto 092
      // 091: athrow
      // 092: fload 11
      // 094: aload 0
      // 095: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbababb.b F
      // 098: iload 6
      // 09a: ifne 0c7
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: ldc 1.25
      // 0a3: fmul
      // 0a4: ldc 0.5
      // 0a6: fadd
      // 0a7: fcmpl
      // 0a8: ifle 0b8
      // 0ab: goto 0af
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: fconst_0
      // 0b5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbababb.ba F
      // 0b8: aload 0
      // 0b9: fload 11
      // 0bb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbababb.b F
      // 0be: ldc 1.0E-4
      // 0c0: fload 10
      // 0c2: aload 0
      // 0c3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbababb.ba F
      // 0c6: fsub
      // 0c7: invokestatic java/lang/Math.max (FF)F
      // 0ca: fstore 12
      // 0cc: fload 10
      // 0ce: aload 0
      // 0cf: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbababb.ba F
      // 0d2: fload 5
      // 0d4: fadd
      // 0d5: fsub
      // 0d6: fstore 13
      // 0d8: aload 0
      // 0d9: dup
      // 0da: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbababb.ba F
      // 0dd: fload 5
      // 0df: fadd
      // 0e0: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbbababb.ba F
      // 0e3: fload 13
      // 0e5: iload 6
      // 0e7: ifne 0f9
      // 0ea: fconst_0
      // 0eb: fcmpg
      // 0ec: ifgt 0f8
      // 0ef: goto 0f3
      // 0f2: athrow
      // 0f3: fconst_0
      // 0f4: goto 101
      // 0f7: athrow
      // 0f8: fconst_1
      // 0f9: fload 13
      // 0fb: fload 12
      // 0fd: fdiv
      // 0fe: invokestatic java/lang/Math.min (FF)F
      // 101: fstore 14
      // 103: fconst_1
      // 104: fload 14
      // 106: fload 14
      // 108: fmul
      // 109: fload 14
      // 10b: fmul
      // 10c: fsub
      // 10d: fstore 15
      // 10f: aload 1
      // 110: aload 1
      // 111: aload 2
      // 112: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.b (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 115: fload 15
      // 117: fmul
      // 118: aload 1
      // 119: aload 2
      // 11a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;)F
      // 11d: fload 15
      // 11f: fmul
      // 120: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb.aba (FF)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babb;
      // 123: areturn
   }
}
