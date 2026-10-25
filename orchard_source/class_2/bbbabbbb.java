package nsc;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class bbbabbbb implements ababa {
   final List aa;
   final ababbbba a;

   @Override
   public int ba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbbb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.ba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0a: astore 2
      // 0b: istore 1
      // 0c: aload 2
      // 0d: iload 1
      // 0e: ifne 19
      // 11: ifnull 27
      // 14: goto 18
      // 17: athrow
      // 18: aload 2
      // 19: iload 1
      // 1a: ifne 2b
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.baaa ()Z
      // 20: ifeq 2a
      // 23: goto 27
      // 26: athrow
      // 27: bipush 0
      // 28: ireturn
      // 29: athrow
      // 2a: aload 2
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 2e: lstore 3
      // 2f: bipush 0
      // 30: istore 5
      // 32: iload 5
      // 34: aload 0
      // 35: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbbb.aa Ljava/util/List;
      // 38: invokeinterface java/util/List.size ()I 1
      // 3d: if_icmpge 76
      // 40: aload 0
      // 41: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabbbb.aa Ljava/util/List;
      // 44: iload 5
      // 46: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 4b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa
      // 4e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 51: lload 3
      // 52: lcmp
      // 53: iload 1
      // 54: ifne 77
      // 57: iload 1
      // 58: ifne 6e
      // 5b: goto 5f
      // 5e: athrow
      // 5f: ifne 6f
      // 62: goto 66
      // 65: athrow
      // 66: iload 5
      // 68: bipush 1
      // 69: iadd
      // 6a: goto 6e
      // 6d: athrow
      // 6e: ireturn
      // 6f: iinc 5 1
      // 72: iload 1
      // 73: ifeq 32
      // 76: bipush -1
      // 77: ireturn
   }

   @Override
   public void a(int var1) {
      ababbbba var10000;
      String var10001;
      label16: {
         try {
            var10000 = this.a;
            if (var1 == 0) {
               var10001 = "";
               break label16;
            }
         } catch (MatchException var2) {
            throw var2;
         }

         var10001 = ((ababbbbaa)this.aa.get(var1 - 1)).abab();
      }

      var10000.bb(var10001);
   }

   @Override
   public String aa(int var1) {
      try {
         if (var1 == 0) {
            return baaba.aaaabaa.abab();
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return ((ababbbbaa)this.aa.get(var1 - 1)).abab();
   }

   bbbabbbb(baaba var1, List var2, ababbbba var3) {
      this.aa = var2;
      this.a = var3;
   }

   @Override
   public int ab() {
      return this.aa.size() + 1;
   }
}
