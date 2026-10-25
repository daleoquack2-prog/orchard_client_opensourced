package nsc;

import java.util.Iterator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class bbabbbba implements Iterator {
   final ababababa aa;
   final Iterator b;

   public String a() {
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
      // 05: iload 1
      // 06: ifne 22
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbba.b Ljava/util/Iterator;
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifne 21
      // 14: goto 18
      // 17: athrow
      // 18: new java/util/NoSuchElementException
      // 1b: dup
      // 1c: invokespecial java/util/NoSuchElementException.<init> ()V
      // 1f: athrow
      // 20: athrow
      // 21: aload 0
      // 22: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbba.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababababa;
      // 25: aload 0
      // 26: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbba.b Ljava/util/Iterator;
      // 29: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2e: checkcast java/lang/Long
      // 31: invokevirtual java/lang/Long.longValue ()J
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababababa.aa (J)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaa;
      // 37: astore 2
      // 38: aload 2
      // 39: iload 1
      // 3a: ifne 4e
      // 3d: ifnonnull 4d
      // 40: goto 44
      // 43: athrow
      // 44: new java/util/NoSuchElementException
      // 47: dup
      // 48: invokespecial java/util/NoSuchElementException.<init> ()V
      // 4b: athrow
      // 4c: athrow
      // 4d: aload 2
      // 4e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaa.aaa ()Ljava/lang/String;
      // 51: areturn
   }

   @Override
   public boolean hasNext() {
      return this.b.hasNext();
   }

   @Override
   public Object next() {
      return this.a();
   }

   bbabbbba(ababababa var1, Iterator var2) {
      this.b = var2;
      this.aa = var1;
   }
}
