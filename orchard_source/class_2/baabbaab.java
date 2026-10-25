package nsc;

import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11909;

@Environment(EnvType.CLIENT)
final class baabbaab {
   private final List aa;
   private final List b = new ArrayList();

   void aa() {
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
      // 06: ifne 30
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.aa Ljava/util/List;
      // 0c: invokeinterface java/util/List.isEmpty ()Z 1
      // 11: ifne 31
      // 14: goto 18
      // 17: athrow
      // 18: aload 0
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.aa Ljava/util/List;
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.aa Ljava/util/List;
      // 20: invokeinterface java/util/List.size ()I 1
      // 25: bipush 1
      // 26: isub
      // 27: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 2c: goto 30
      // 2f: athrow
      // 30: pop
      // 31: return
   }

   void ab(double var1, double var3, double var5, double var7, bababaab var9) {
      this.ba(var1, var3, var5, var7, var9, null);
   }

   void ba(
      double param1,
      double param3,
      double param5,
      double param7,
      bababaab param9,
      aaaababbb param10
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 11
      // 05: dload 5
      // 07: iload 11
      // 09: ifne 1b
      // 0c: dconst_0
      // 0d: dcmpg
      // 0e: ifle 29
      // 11: goto 15
      // 14: athrow
      // 15: dload 7
      // 17: goto 1b
      // 1a: athrow
      // 1b: iload 11
      // 1d: ifne 2c
      // 20: dconst_0
      // 21: dcmpg
      // 22: ifgt 2b
      // 25: goto 29
      // 28: athrow
      // 29: return
      // 2a: athrow
      // 2b: dload 1
      // 2c: dstore 12
      // 2e: dload 3
      // 2f: dstore 14
      // 31: dload 5
      // 33: dstore 16
      // 35: dload 7
      // 37: dstore 18
      // 39: aload 0
      // 3a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.aa Ljava/util/List;
      // 3d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 42: astore 20
      // 44: aload 20
      // 46: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4b: ifeq d5
      // 4e: aload 20
      // 50: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 55: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab
      // 58: astore 21
      // 5a: iload 11
      // 5c: ifne f2
      // 5f: dload 12
      // 61: aload 21
      // 63: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab.b D
      // 66: invokestatic java/lang/Math.max (DD)D
      // 69: dstore 22
      // 6b: dload 14
      // 6d: aload 21
      // 6f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab.ab D
      // 72: invokestatic java/lang/Math.max (DD)D
      // 75: dstore 24
      // 77: dload 12
      // 79: dload 16
      // 7b: dadd
      // 7c: aload 21
      // 7e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab.b D
      // 81: aload 21
      // 83: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab.aa D
      // 86: dadd
      // 87: invokestatic java/lang/Math.min (DD)D
      // 8a: dstore 26
      // 8c: dload 14
      // 8e: dload 18
      // 90: dadd
      // 91: aload 21
      // 93: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab.ab D
      // 96: aload 21
      // 98: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab.a D
      // 9b: dadd
      // 9c: invokestatic java/lang/Math.min (DD)D
      // 9f: dstore 28
      // a1: dload 22
      // a3: dstore 12
      // a5: dload 24
      // a7: dstore 14
      // a9: dload 26
      // ab: dload 22
      // ad: dsub
      // ae: iload 11
      // b0: ifne c9
      // b3: dstore 16
      // b5: dload 28
      // b7: dload 24
      // b9: dsub
      // ba: dstore 18
      // bc: dload 16
      // be: dconst_0
      // bf: dcmpg
      // c0: ifle ce
      // c3: dload 18
      // c5: goto c9
      // c8: athrow
      // c9: dconst_0
      // ca: dcmpg
      // cb: ifgt d0
      // ce: return
      // cf: athrow
      // d0: iload 11
      // d2: ifeq 44
      // d5: aload 0
      // d6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.b Ljava/util/List;
      // d9: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab
      // dc: dup
      // dd: dload 12
      // df: dload 14
      // e1: dload 16
      // e3: dload 18
      // e5: aload 9
      // e7: aload 10
      // e9: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.<init> (DDDDLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababaab;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababbb;)V
      // ec: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // f1: pop
      // f2: return
   }

   void bb(double param1, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 9
      // 05: dload 5
      // 07: dconst_0
      // 08: dcmpg
      // 09: iload 9
      // 0b: ifne 41
      // 0e: ifle 29
      // 11: goto 15
      // 14: athrow
      // 15: dload 7
      // 17: dconst_0
      // 18: dcmpg
      // 19: iload 9
      // 1b: ifne 59
      // 1e: goto 22
      // 21: athrow
      // 22: ifgt 43
      // 25: goto 29
      // 28: athrow
      // 29: aload 0
      // 2a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.aa Ljava/util/List;
      // 2d: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab
      // 30: dup
      // 31: dconst_0
      // 32: dconst_0
      // 33: dconst_0
      // 34: dconst_0
      // 35: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab.<init> (DDDD)V
      // 38: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 3d: goto 41
      // 40: athrow
      // 41: pop
      // 42: return
      // 43: aload 0
      // 44: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.aa Ljava/util/List;
      // 47: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab
      // 4a: dup
      // 4b: dload 1
      // 4c: dload 3
      // 4d: dload 5
      // 4f: dload 7
      // 51: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbab.<init> (DDDD)V
      // 54: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 59: pop
      // 5a: return
   }

   boolean aaa(double param1, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 9
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.b Ljava/util/List;
      // 09: invokeinterface java/util/List.size ()I 1
      // 0e: bipush 1
      // 0f: isub
      // 10: istore 10
      // 12: iload 10
      // 14: iflt 79
      // 17: aload 0
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.b Ljava/util/List;
      // 1b: iload 10
      // 1d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 22: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab
      // 25: astore 11
      // 27: iload 9
      // 29: ifne 74
      // 2c: aload 11
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababbb;
      // 31: ifnull 71
      // 34: goto 38
      // 37: athrow
      // 38: aload 11
      // 3a: iload 9
      // 3c: ifne 55
      // 3f: goto 43
      // 42: athrow
      // 43: dload 1
      // 44: dload 3
      // 45: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.aaa (DD)Z
      // 48: ifeq 71
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 11
      // 51: goto 55
      // 54: athrow
      // 55: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababbb;
      // 58: dload 1
      // 59: dload 3
      // 5a: dload 5
      // 5c: dload 7
      // 5e: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaababbb.b (DDDD)Z 9
      // 63: iload 9
      // 65: ifne 70
      // 68: ifeq 71
      // 6b: goto 6f
      // 6e: athrow
      // 6f: bipush 1
      // 70: ireturn
      // 71: iinc 10 -1
      // 74: iload 9
      // 76: ifeq 12
      // 79: bipush 0
      // 7a: ireturn
   }

   baabbaab() {
      this.aa = new ArrayList();
   }

   void b() {
      this.b.clear();
   }

   boolean aab(class_11909 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.b Ljava/util/List;
      // 08: invokeinterface java/util/List.size ()I 1
      // 0d: bipush 1
      // 0e: isub
      // 0f: istore 4
      // 11: iload 4
      // 13: iflt 76
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaab.b Ljava/util/List;
      // 1a: iload 4
      // 1c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 21: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab
      // 24: astore 5
      // 26: iload 3
      // 27: ifne 72
      // 2a: aload 5
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababaab;
      // 2f: ifnull 6f
      // 32: goto 36
      // 35: athrow
      // 36: aload 5
      // 38: iload 3
      // 39: ifne 58
      // 3c: goto 40
      // 3f: athrow
      // 40: aload 1
      // 41: invokevirtual net/minecraft/class_11909.comp_4798 ()D
      // 44: aload 1
      // 45: invokevirtual net/minecraft/class_11909.comp_4799 ()D
      // 48: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.aaa (DD)Z
      // 4b: ifeq 6f
      // 4e: goto 52
      // 51: athrow
      // 52: aload 5
      // 54: goto 58
      // 57: athrow
      // 58: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaaab.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababaab;
      // 5b: aload 1
      // 5c: iload 2
      // 5d: invokeinterface qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababaab.b (Lnet/minecraft/class_11909;Z)Z 3
      // 62: iload 3
      // 63: ifne 6e
      // 66: ifeq 6f
      // 69: goto 6d
      // 6c: athrow
      // 6d: bipush 1
      // 6e: ireturn
      // 6f: iinc 4 -1
      // 72: iload 3
      // 73: ifeq 11
      // 76: bipush 0
      // 77: ireturn
   }
}
