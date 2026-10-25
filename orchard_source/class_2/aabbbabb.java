package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
record aabbbabb(
   abbaabbaa a,
   abbaabbab b,
   boolean c,
   abaaaaaba d,
   bbabab e,
   String f
) {
   private final abbaabbaa aa;
   private final boolean a;
   private final bbabab ab;
   private final abbaabbab ba;
   private final abaaaaaba b;
   private final String bb;

   public bbabab aa() {
      return this.ab;
   }

   public abbaabbab ab() {
      return this.ba;
   }

   static aabbbabb b(bbabab var0, String var1) {
      return new aabbbabb(null, null, false, null, var0, var1);
   }

   public String ba() {
      return this.bb;
   }

   void bb(class_306 param1) {
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
      // 06: ifne 34
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabb.a Z
      // 0c: ifeq 33
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 34
      // 18: goto 1c
      // 1b: athrow
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 1f: ifnull 33
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 2d: aload 1
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa.bbaab (Lnet/minecraft/class_3675$class_306;)V
      // 31: return
      // 32: athrow
      // 33: aload 0
      // 34: iload 2
      // 35: ifne 4d
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa;
      // 3b: ifnull 4c
      // 3e: goto 42
      // 41: athrow
      // 42: aload 0
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa;
      // 46: aload 1
      // 47: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbaa.baabbaa (Lnet/minecraft/class_3675$class_306;)V
      // 4a: return
      // 4b: athrow
      // 4c: aload 0
      // 4d: iload 2
      // 4e: ifne 66
      // 51: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbab;
      // 54: ifnull 65
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbab;
      // 5f: aload 1
      // 60: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbab.bb (Lnet/minecraft/class_3675$class_306;)V
      // 63: return
      // 64: athrow
      // 65: aload 0
      // 66: iload 2
      // 67: ifne 75
      // 6a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab;
      // 6d: ifnull 87
      // 70: goto 74
      // 73: athrow
      // 74: aload 0
      // 75: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab;
      // 78: aload 0
      // 79: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbbabb.bb Ljava/lang/String;
      // 7c: aload 1
      // 7d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbbaa (Ljava/lang/String;Lnet/minecraft/class_3675$class_306;)Ljava/util/Map;
      // 80: pop
      // 81: goto 87
      // 84: astore 3
      // 85: aload 3
      // 86: pop
      // 87: return
   }

   public abaaaaaba aaa() {
      return this.b;
   }

   public boolean aab() {
      return this.a;
   }

   static aabbbabb aba(abbaabbaa var0) {
      return new aabbbabb(var0, null, false, null, null, null);
   }

   private aabbbabb(
      abbaabbaa a,
      abbaabbab b,
      boolean c,
      abaaaaaba d,
      bbabab e,
      String f
   ) {
      this.aa = a;
      this.ba = b;
      this.a = c;
      this.b = d;
      this.ab = e;
      this.bb = f;
   }

   public abbaabbaa abb() {
      return this.aa;
   }

   static aabbbabb baa(abaaaaaba var0) {
      return new aabbbabb(null, null, true, var0, null, null);
   }

   static aabbbabb bab(abbaabbab var0) {
      return new aabbbabb(null, var0, false, null, null, null);
   }
}
