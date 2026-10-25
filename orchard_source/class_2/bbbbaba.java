package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;

@Environment(EnvType.CLIENT)
record bbbbaba(String a, int b, int c) {
   private final int aa;
   private final int ab;
   private final String b;

   public String aa() {
      return this.b;
   }

   boolean ab(class_1799 param1) {
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
      // 05: iload 2
      // 06: ifne 1c
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaba.ab I
      // 0c: aload 1
      // 0d: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 10: if_icmpne 38
      // 13: goto 17
      // 16: athrow
      // 17: aload 0
      // 18: goto 1c
      // 1b: athrow
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbaba.b Ljava/lang/String;
      // 1f: aload 1
      // 20: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 23: invokevirtual net/minecraft/class_1792.toString ()Ljava/lang/String;
      // 26: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 29: iload 2
      // 2a: ifne 35
      // 2d: ifeq 38
      // 30: goto 34
      // 33: athrow
      // 34: bipush 1
      // 35: goto 39
      // 38: bipush 0
      // 39: ireturn
   }

   public int a() {
      return this.ab;
   }

   private bbbbaba(String a, int b, int c) {
      this.b = a;
      this.ab = b;
      this.aa = c;
   }

   public int b() {
      return this.aa;
   }
}
