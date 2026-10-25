package nsc;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class aaaabba {
   private static final Map aa = new ConcurrentHashMap();
   private static final Map b = new ConcurrentHashMap();
   private static final Map ab = new ConcurrentHashMap();
   private static volatile int a;

   public static void aa(UUID param0, int param1) {
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
      // 06: ifne 21
      // 09: ifnull 22
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.aa Ljava/util/Map;
      // 13: aload 0
      // 14: iload 1
      // 15: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 18: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1d: goto 21
      // 20: athrow
      // 21: pop
      // 22: return
   }

   public static boolean ab(UUID param0) {
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
      // 05: ifnull 54
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.ab Ljava/util/Map;
      // 0b: aload 0
      // 0c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11: iload 1
      // 12: ifne 51
      // 15: goto 19
      // 18: athrow
      // 19: ifne 50
      // 1c: goto 20
      // 1f: athrow
      // 20: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.aa Ljava/util/Map;
      // 23: aload 0
      // 24: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 29: iload 1
      // 2a: ifne 51
      // 2d: goto 31
      // 30: athrow
      // 31: ifne 50
      // 34: goto 38
      // 37: athrow
      // 38: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.b Ljava/util/Map;
      // 3b: aload 0
      // 3c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 41: iload 1
      // 42: ifne 51
      // 45: goto 49
      // 48: athrow
      // 49: ifeq 54
      // 4c: goto 50
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: ireturn
   }

   public static void ba() {
      aa.clear();
   }

   public static void bb() {
      b.clear();
   }

   public static int aaa(UUID param0) {
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
      // 06: ifne 1e
      // 09: ifnonnull 15
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.a I
      // 13: ireturn
      // 14: athrow
      // 15: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.aa Ljava/util/Map;
      // 18: aload 0
      // 19: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1e: checkcast java/lang/Integer
      // 21: astore 2
      // 22: aload 2
      // 23: iload 1
      // 24: ifne 40
      // 27: ifnull 34
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 2
      // 2f: invokevirtual java/lang/Integer.intValue ()I
      // 32: ireturn
      // 33: athrow
      // 34: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.b Ljava/util/Map;
      // 37: aload 0
      // 38: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3d: checkcast java/lang/Integer
      // 40: astore 3
      // 41: aload 3
      // 42: iload 1
      // 43: ifne 5f
      // 46: ifnull 53
      // 49: goto 4d
      // 4c: athrow
      // 4d: aload 3
      // 4e: invokevirtual java/lang/Integer.intValue ()I
      // 51: ireturn
      // 52: athrow
      // 53: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.ab Ljava/util/Map;
      // 56: aload 0
      // 57: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 5c: checkcast java/lang/Integer
      // 5f: astore 4
      // 61: aload 4
      // 63: iload 1
      // 64: ifne 70
      // 67: ifnull 76
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 4
      // 70: invokevirtual java/lang/Integer.intValue ()I
      // 73: goto 79
      // 76: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.a I
      // 79: ireturn
   }

   static {
      long var2 = 9081196721420005670L;
      long var10002 = 109469483073094420L ^ var2;
      byte var10001 = -1;
      long var0 = var10002;
      a = (int)var0;
   }

   public static void aab(UUID param0, int param1) {
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
      // 06: ifne 21
      // 09: ifnull 22
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.b Ljava/util/Map;
      // 13: aload 0
      // 14: iload 1
      // 15: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 18: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1d: goto 21
      // 20: athrow
      // 21: pop
      // 22: return
   }

   public static void b(UUID param0) {
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
      // 06: ifne 23
      // 09: ifnull 24
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.ab Ljava/util/Map;
      // 13: aload 0
      // 14: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabba.a I
      // 17: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1f: goto 23
      // 22: athrow
      // 23: pop
      // 24: return
   }

   public static int aba() {
      return a;
   }

   public static void abb() {
      ab.clear();
   }

   private aaaabba() {
   }

   public static void baa(int var0) {
      a = var0;
   }
}
