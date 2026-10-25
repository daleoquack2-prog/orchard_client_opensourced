package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1937;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record bababb(
   class_1937 a, long b, class_243 position, class_243 velocity, aaabbab e, int f, babbabaa g
) {
   private final class_1937 aa;
   private final babbabaa a;
   private final class_243 ab;
   private final class_243 ba;
   private final int bb;
   private final long aaa;
   private final aaabbab b;

   public int aa() {
      return this.bb;
   }

   private bababb(
      class_1937 a,
      long b,
      class_243 position,
      class_243 velocity,
      aaabbab e,
      int f,
      babbabaa g
   ) {
      this.aa = a;
      this.aaa = b;
      this.ab = position;
      this.ba = velocity;
      this.b = e;
      this.bb = f;
      this.a = g;
   }

   private boolean ab(class_1937 param1, long param2, class_243 param4, class_243 param5, aaabbab param6, int param7) {
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
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababb.aa Lnet/minecraft/class_1937;
      // 0e: aload 1
      // 0f: if_acmpne 91
      // 12: goto 16
      // 15: athrow
      // 16: aload 0
      // 17: goto 1b
      // 1a: athrow
      // 1b: iload 8
      // 1d: ifne 31
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababb.aaa J
      // 23: lload 2
      // 24: lcmp
      // 25: ifne 91
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: goto 31
      // 30: athrow
      // 31: iload 8
      // 33: ifne 47
      // 36: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababb.bb I
      // 39: iload 7
      // 3b: if_icmpne 91
      // 3e: goto 42
      // 41: athrow
      // 42: aload 0
      // 43: goto 47
      // 46: athrow
      // 47: iload 8
      // 49: ifne 60
      // 4c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababb.ab Lnet/minecraft/class_243;
      // 4f: aload 4
      // 51: invokevirtual net/minecraft/class_243.equals (Ljava/lang/Object;)Z
      // 54: ifeq 91
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 0
      // 5c: goto 60
      // 5f: athrow
      // 60: iload 8
      // 62: ifne 79
      // 65: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababb.ba Lnet/minecraft/class_243;
      // 68: aload 5
      // 6a: invokevirtual net/minecraft/class_243.equals (Ljava/lang/Object;)Z
      // 6d: ifeq 91
      // 70: goto 74
      // 73: athrow
      // 74: aload 0
      // 75: goto 79
      // 78: athrow
      // 79: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbab;
      // 7c: aload 6
      // 7e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbab.equals (Ljava/lang/Object;)Z
      // 81: iload 8
      // 83: ifne 8e
      // 86: ifeq 91
      // 89: goto 8d
      // 8c: athrow
      // 8d: bipush 1
      // 8e: goto 92
      // 91: bipush 0
      // 92: ireturn
   }

   public class_1937 bb() {
      return this.aa;
   }

   public class_243 aaa() {
      return this.ab;
   }

   public aaabbab aab() {
      return this.b;
   }

   public long aba() {
      return this.aaa;
   }
}
