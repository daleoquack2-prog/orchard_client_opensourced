package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class aabbaaa {
   private final int aa;
   private static final long b;
   private final long ab;

   @Override
   public boolean equals(Object param1) {
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
      // 06: ifne 4f
      // 09: instanceof java/lang/String
      // 0c: ifeq 4e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: checkcast java/lang/String
      // 17: astore 3
      // 18: aload 3
      // 19: iload 2
      // 1a: ifne 35
      // 1d: bipush 0
      // 1e: aload 3
      // 1f: invokevirtual java/lang/String.length ()I
      // 22: invokevirtual java/lang/String.codePointCount (II)I
      // 25: aload 0
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaa.aa I
      // 29: if_icmpne 4c
      // 2c: goto 30
      // 2f: athrow
      // 30: aload 3
      // 31: goto 35
      // 34: athrow
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.baba (Ljava/lang/String;)J
      // 38: aload 0
      // 39: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaa.ab J
      // 3c: lcmp
      // 3d: iload 2
      // 3e: ifne 49
      // 41: ifne 4c
      // 44: goto 48
      // 47: athrow
      // 48: bipush 1
      // 49: goto 4d
      // 4c: bipush 0
      // 4d: ireturn
      // 4e: aload 1
      // 4f: instanceof qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 52: iload 2
      // 53: ifne 94
      // 56: ifeq 93
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 1
      // 5e: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 61: astore 3
      // 62: aload 3
      // 63: iload 2
      // 64: ifne 7a
      // 67: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbba ()I
      // 6a: aload 0
      // 6b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaa.aa I
      // 6e: if_icmpne 91
      // 71: goto 75
      // 74: athrow
      // 75: aload 3
      // 76: goto 7a
      // 79: athrow
      // 7a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 7d: aload 0
      // 7e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaa.ab J
      // 81: lcmp
      // 82: iload 2
      // 83: ifne 8e
      // 86: ifne 91
      // 89: goto 8d
      // 8c: athrow
      // 8d: bipush 1
      // 8e: goto 92
      // 91: bipush 0
      // 92: ireturn
      // 93: bipush 0
      // 94: ireturn
   }

   static {
      long var0 = 9212902342521166547L;
      long var10002 = -9094323953415578932L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }

   private static aabbaaa b(ababbbbaa var0) {
      return new aabbaaa(var0.bbb(), var0.bbba());
   }

   private aabbaaa(long var1, int var3) {
      this.ab = var1;
      this.aa = var3;
   }

   @Override
   public int hashCode() {
      return Long.hashCode(this.ab) * (int)b + this.aa;
   }
}
