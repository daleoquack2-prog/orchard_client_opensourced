package nsc;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
final class babaabab {
   private final Map aa;
   private static final long a;

   babaabab() {
      this.aa = new aabbbba(this, (int)a, 0.75F, true);
   }

   private static double aa(double param0, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 6
      // 05: dload 4
      // 07: dload 2
      // 08: dsub
      // 09: dstore 7
      // 0b: dload 7
      // 0d: iload 6
      // 0f: ifne 2d
      // 12: ldc2_w 1.0E-6
      // 15: dcmpg
      // 16: ifgt 22
      // 19: goto 1d
      // 1c: athrow
      // 1d: ldc2_w 0.5
      // 20: dreturn
      // 21: athrow
      // 22: dload 0
      // 23: dload 2
      // 24: dsub
      // 25: dload 7
      // 27: ddiv
      // 28: dconst_0
      // 29: dconst_1
      // 2a: invokestatic net/minecraft/class_3532.method_15350 (DDD)D
      // 2d: dreturn
   }

   void ab(int var1, aaaabbba var2) {
      this.aa.remove(new aabbababb(var1, bb(var2)));
   }

   private static class_243 ba(class_238 var0, class_243 var1) {
      return new class_243(
         class_3532.method_16436(var1.field_1352, var0.field_1323, var0.field_1320),
         class_3532.method_16436(var1.field_1351, var0.field_1322, var0.field_1325),
         class_3532.method_16436(var1.field_1350, var0.field_1321, var0.field_1324)
      );
   }

   private static aaaabbba bb(aaaabbba var0) {
      int var1 = baaabbaa.bba;

      try {
         if (var1 != 0) {
            return var0;
         }

         if (var0 == null) {
            return aaaabbba.ab;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return var0;
   }

   int aaa() {
      return this.aa.size();
   }

   private static class_243 b(class_238 var0, class_243 var1) {
      return new class_243(
         aa(var1.field_1352, var0.field_1323, var0.field_1320),
         aa(var1.field_1351, var0.field_1322, var0.field_1325),
         aa(var1.field_1350, var0.field_1321, var0.field_1324)
      );
   }

   void aab(int param1, aaaabbba param2, class_238 param3, class_243 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 3
      // 06: ifnull 1e
      // 09: aload 4
      // 0b: iload 5
      // 0d: ifne 3b
      // 10: goto 14
      // 13: athrow
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbba.baaab (Lnet/minecraft/class_243;)Z
      // 17: ifne 20
      // 1a: goto 1e
      // 1d: athrow
      // 1e: return
      // 1f: athrow
      // 20: aload 0
      // 21: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaabab.aa Ljava/util/Map;
      // 24: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbababb
      // 27: dup
      // 28: iload 1
      // 29: aload 2
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaabab.bb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba;
      // 2d: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbababb.<init> (ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba;)V
      // 30: aload 3
      // 31: aload 4
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaabab.b (Lnet/minecraft/class_238;Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 36: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3b: pop
      // 3c: return
   }

   void aba() {
      this.aa.clear();
   }

   class_243 abb(int param1, aaaabbba param2, class_238 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 3
      // 06: iload 4
      // 08: ifne 2a
      // 0b: ifnonnull 15
      // 0e: goto 12
      // 11: athrow
      // 12: aconst_null
      // 13: areturn
      // 14: athrow
      // 15: aload 0
      // 16: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaabab.aa Ljava/util/Map;
      // 19: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbababb
      // 1c: dup
      // 1d: iload 1
      // 1e: aload 2
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaabab.bb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba;
      // 22: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbababb.<init> (ILqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbba;)V
      // 25: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2a: checkcast net/minecraft/class_243
      // 2d: astore 5
      // 2f: aload 5
      // 31: ifnonnull 39
      // 34: aconst_null
      // 35: goto 3f
      // 38: athrow
      // 39: aload 3
      // 3a: aload 5
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaabab.ba (Lnet/minecraft/class_238;Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 3f: areturn
   }

   static {
      long var0 = 846285927444410211L;
      long var10002 = 8518400422199455555L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}
