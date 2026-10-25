package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1937;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record aaabbbba(
   class_1937 bj, long bk, class_243 bl, class_243 bm, abaabb bn, int bo, abaaba bp
) {
   private final abaabb a;
   private final long b;
   private final class_243 aa;
   private final class_1937 ab;
   private final abaaba ba;
   private final int bb;
   private final class_243 aaa;

   private boolean b(class_1937 param1, long param2, class_243 param4, class_243 param5, abaabb param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 8
      // 05: aload 0
      // 06: iload 8
      // 08: ifne 1b
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba.ab Lnet/minecraft/class_1937;
      // 0e: aload 1
      // 0f: if_acmpne 8e
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: goto 1b
      // 1a: athrow
      // 1b: iload 8
      // 1d: ifne 31
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba.b J
      // 23: lload 2
      // 24: lcmp
      // 25: ifne 8e
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: goto 31
      // 30: athrow
      // 31: iload 8
      // 33: ifne 47
      // 36: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba.bb I
      // 39: iload 7
      // 3b: if_icmpne 8e
      // 3e: goto 42
      // 41: athrow
      // 42: aload 0
      // 43: goto 47
      // 46: athrow
      // 47: iload 8
      // 49: ifne 5d
      // 4c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabb;
      // 4f: aload 6
      // 51: if_acmpne 8e
      // 54: goto 58
      // 57: athrow
      // 58: aload 0
      // 59: goto 5d
      // 5c: athrow
      // 5d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba.aa Lnet/minecraft/class_243;
      // 60: iload 8
      // 62: ifne 79
      // 65: aload 4
      // 67: invokevirtual net/minecraft/class_243.equals (Ljava/lang/Object;)Z
      // 6a: ifeq 8e
      // 6d: goto 71
      // 70: athrow
      // 71: aload 0
      // 72: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbba.aaa Lnet/minecraft/class_243;
      // 75: goto 79
      // 78: athrow
      // 79: aload 5
      // 7b: invokevirtual net/minecraft/class_243.equals (Ljava/lang/Object;)Z
      // 7e: iload 8
      // 80: ifne 8b
      // 83: ifeq 8e
      // 86: goto 8a
      // 89: athrow
      // 8a: bipush 1
      // 8b: goto 8f
      // 8e: bipush 0
      // 8f: ireturn
   }

   private aaabbbba(
      class_1937 bj, long bk, class_243 bl, class_243 bm, abaabb bn, int bo, abaaba bp
   ) {
      this.ab = bj;
      this.b = bk;
      this.aa = bl;
      this.aaa = bm;
      this.a = bn;
      this.bb = bo;
      this.ba = bp;
   }

   public class_243 aa() {
      return this.aaa;
   }

   public int ab() {
      return this.bb;
   }

   public class_243 ba() {
      return this.aa;
   }

   public abaaba bb() {
      return this.ba;
   }

   public long aaa() {
      return this.b;
   }

   public class_1937 aab() {
      return this.ab;
   }
}
