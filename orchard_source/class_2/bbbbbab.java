package nsc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record bbbbbab(
   List<aaabbaaab> b, Map<Long, aaabbaaab> c, aaabbaaab a
) {
   private final aaabbaaab aa;
   private final List a;
   private final Map b;

   private aaabbaaab aa(String param1) {
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
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 32
      // 15: invokevirtual java/lang/String.isBlank ()Z
      // 18: ifeq 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aconst_null
      // 20: areturn
      // 21: athrow
      // 22: aload 0
      // 23: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbab.b Ljava/util/Map;
      // 26: aload 1
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.baba (Ljava/lang/String;)J
      // 2a: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 32: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab
      // 35: astore 3
      // 36: aload 3
      // 37: iload 2
      // 38: ifne 43
      // 3b: ifnull 5b
      // 3e: goto 42
      // 41: athrow
      // 42: aload 3
      // 43: iload 2
      // 44: ifne 5a
      // 47: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.baa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 4a: aload 1
      // 4b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.baba (Ljava/lang/CharSequence;)Z
      // 4e: ifeq 5b
      // 51: goto 55
      // 54: athrow
      // 55: aload 3
      // 56: goto 5a
      // 59: athrow
      // 5a: areturn
      // 5b: aload 0
      // 5c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbab.a Ljava/util/List;
      // 5f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 64: astore 4
      // 66: aload 4
      // 68: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6d: ifeq 9b
      // 70: aload 4
      // 72: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 77: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab
      // 7a: astore 5
      // 7c: aload 5
      // 7e: iload 2
      // 7f: ifne 96
      // 82: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbaaab.baa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 85: aload 1
      // 86: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.baba (Ljava/lang/CharSequence;)Z
      // 89: ifeq 97
      // 8c: goto 90
      // 8f: athrow
      // 90: aload 5
      // 92: goto 96
      // 95: athrow
      // 96: areturn
      // 97: iload 2
      // 98: ifeq 66
      // 9b: aconst_null
      // 9c: areturn
   }

   public aaabbaaab ab() {
      return this.aa;
   }

   private List ba() {
      int var10000 = baaabbaa.bba;
      ArrayList var2 = new ArrayList(this.a.size() + 1);
      int var1 = var10000;
      var2.add("");
      Iterator var3 = this.a.iterator();

      while (true) {
         if (var3.hasNext()) {
            aaabbaaab var4 = (aaabbaaab)var3.next();

            try {
               var6 = var2;
               if (var1 != 0) {
                  break;
               }

               var2.add(var4.aaa());
               if (var1 == 0) {
                  continue;
               }
            } catch (MatchException var5) {
               throw var5;
            }
         }

         var6 = List.copyOf(var2);
         break;
      }

      return (List)var6;
   }

   private bbbbbab(List b, Map c, aaabbaaab a) {
      this.a = b;
      this.b = c;
      this.aa = a;
   }
}
