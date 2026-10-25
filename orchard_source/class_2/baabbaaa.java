package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class baabbaaa {
   private static final int[] aaa;
   private final bb aa;
   private static final String b;
   private final boolean ab;
   private final ababbbba ba;
   private final boolean a;
   private static final Object[] aba;
   private final int bb;
   private static final String[] aab;

   private static String abb(char var0, int var1, short var2) {
      int var3 = var0 ^ 12876;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 555;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '픵';
         var10 -= 40826;
         var10 += 53038;
         var10 -= 32137;
         var10 ^= 26156;
         var10 -= 20079;
         var10 ^= 9393;
         var10 ^= 25139;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   static baabbaaa aa() {
      return new baabbaaa(null, null, -1, true, false);
   }

   boolean ab(baabbaaa param1) {
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
      // 09: ifnull 87
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 2
      // 12: ifne 28
      // 15: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 18: aload 1
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 1c: if_acmpne 87
      // 1f: goto 23
      // 22: athrow
      // 23: aload 0
      // 24: goto 28
      // 27: athrow
      // 28: iload 2
      // 29: ifne 3f
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // 2f: aload 1
      // 30: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // 33: if_acmpne 87
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: goto 3f
      // 3e: athrow
      // 3f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.bb I
      // 42: aload 1
      // 43: iload 2
      // 44: ifne 62
      // 47: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.bb I
      // 4a: if_icmpne 87
      // 4d: goto 51
      // 50: athrow
      // 51: aload 0
      // 52: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.a Z
      // 55: iload 2
      // 56: ifne 70
      // 59: goto 5d
      // 5c: athrow
      // 5d: aload 1
      // 5e: goto 62
      // 61: athrow
      // 62: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.a Z
      // 65: if_icmpne 87
      // 68: aload 0
      // 69: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.ab Z
      // 6c: goto 70
      // 6f: athrow
      // 70: iload 2
      // 71: ifne 84
      // 74: aload 1
      // 75: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.ab Z
      // 78: if_icmpne 87
      // 7b: goto 7f
      // 7e: athrow
      // 7f: bipush 1
      // 80: goto 84
      // 83: athrow
      // 84: goto 88
      // 87: bipush 0
      // 88: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var11 = 1998303699;
      String[] var3 = new String[1];
      short var6 = 27773;
      int var2 = "\b錎⊃踲拙谺\ue269蹎\ue28e".length();
      int var5 = 0;
      int var4 = 0;
      String var1 = "\b錎⊃踲拙谺\ue269蹎\ue28e";

      do {
         int var9 = 0;
         char var7 = var1.charAt(var5);
         char[] var8 = var1.substring(var5 + 1, var5 + 1 + var7).toCharArray();

         do {
            int var10 = var8[var9];

            var10 = (char)(switch (var9 % 6) {
               default -> 206;
               case 1 -> 181;
               case 2 -> 10;
               case 3 -> 239;
               case 4 -> 162;
               case 5 -> 95;
            }) ^ var10;
            if (var9 % 2 == 0) {
               var8[var9] = (char)((var10 >>> 3 | var10 << 13) & 65535 ^ var6);
            } else {
               var8[var9] = (char)((var10 << 3 | var10 >>> 13) & 65535 ^ var6);
            }
         } while (++var9 < var8.length);

         var3[var4] = new String(var8);
         var4++;
         var5 = var5 + var7 + 1;
      } while (var5 < var2);

      aab = var3;
      aba = new Object[var3.length];
      byte var13 = 0;
      int var10001 = 0;
      aaa = new int[8];
      byte[] var10002 = "«\n|g\u0002bòñ}3\u0003»R4«lìj9Çz1\u009b?\u001eëë0Z\u0003w»".getBytes("ISO-8859-1");

      int var43;
      do {
         aaa[var13] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1116935272;
         var13 += 1;
         var43 = var10001 + 4;
         var10001 += 4;
      } while (var43 < var10002.length);

      char[] var16 = abb('㉌', var11 ^ -1158440177, (short)25463).toCharArray();
      var43 = var16.length;
      int var0 = 0;
      char[] var32 = var16;
      var10001 = var43;
      char[] var47;
      int var62;
      if (var43 <= 1) {
         var47 = var16;
         var62 = var0;
      } else {
         var32 = var16;
         var10001 = var43;
         if (var43 <= var0) {
            String var55 = new String(var16).intern();
            byte var24 = -1;
            b = var55;
            return;
         }

         var47 = var16;
         var62 = var0;
      }

      while (true) {
         var47[var62] = (char)(var47[var62] ^ switch (var0 % a(-2002782323, var11 ^ 371003544)) {
            case 0 -> a(-2002782324, var11 ^ -1082810682);
            case 1 -> a(-2002782321, var11 ^ -1071354062);
            case 2 -> a(-2002782322, var11 ^ -282867779);
            case 3 -> a(-2002782327, var11 ^ 1367168329);
            case 4 -> a(-2002782328, var11 ^ -953747703);
            case 5 -> a(-2002782325, var11 ^ -1543731436);
            default -> a(-2002782326, var11 ^ -418112701);
         });
         var0++;
         if (var10001 == 0) {
            var62 = var10001;
            var47 = var32;
         } else {
            if (var10001 <= var0) {
               String var54 = new String(var32).intern();
               byte var23 = -1;
               b = var54;
               return;
            }

            var47 = var32;
            var62 = var0;
         }
      }
   }

   private baabbaaa(
      ababbbba var1, bb var2, int var3, boolean var4, boolean var5
   ) {
      this.ba = var1;
      this.aa = var2;
      this.bb = var3;
      this.a = var4;
      this.ab = var5;
   }

   static baabbaaa ba(bb var0, int var1) {
      return new baabbaaa(null, var0, var1, false, false);
   }

   static baabbaaa bb(ababbbba var0) {
      return new baabbaaa(var0, null, -1, false, false);
   }

   static baabbaaa aaa() {
      return new baabbaaa(null, null, -1, false, true);
   }

   boolean aab(bb param1, int param2) {
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
      // 05: iload 3
      // 06: ifne 19
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // 0c: aload 1
      // 0d: if_acmpne 30
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: goto 19
      // 18: athrow
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.bb I
      // 1c: iload 3
      // 1d: ifne 2d
      // 20: iload 2
      // 21: if_icmpne 30
      // 24: goto 28
      // 27: athrow
      // 28: bipush 1
      // 29: goto 2d
      // 2c: athrow
      // 2d: goto 31
      // 30: bipush 0
      // 31: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ -2002782323] ^ var1 ^ var0;
      var2 ^= 22055;
      var2 -= 3087;
      var2 -= 652;
      var2 ^= 44593;
      var2 += 48543;
      var2 += 17466;
      return var2 ^ 10380;
   }

   static baabbaaa b(bb var0) {
      return new baabbaaa(null, var0, -1, false, false);
   }

   void aba(String param1) {
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
      // 06: ifne 1e
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 0c: ifnull 1d
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 17: aload 1
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.bb (Ljava/lang/String;)V
      // 1b: return
      // 1c: athrow
      // 1d: aload 0
      // 1e: iload 2
      // 1f: ifne 31
      // 22: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // 25: ifnull e4
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 0
      // 2d: goto 31
      // 30: athrow
      // 31: iload 2
      // 32: ifne 44
      // 35: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.bb I
      // 38: iflt 7f
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 0
      // 40: goto 44
      // 43: athrow
      // 44: iload 2
      // 45: ifne 73
      // 48: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.bb I
      // 4b: aload 0
      // 4c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // 4f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaaa ()Ljava/util/List;
      // 52: invokeinterface java/util/List.size ()I 1
      // 57: if_icmplt 6e
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 0
      // 5f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // 62: aload 1
      // 63: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.baaa (Ljava/lang/String;)V
      // 66: iload 2
      // 67: ifeq 7e
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 0
      // 6f: goto 73
      // 72: athrow
      // 73: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // 76: aload 0
      // 77: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.bb I
      // 7a: aload 1
      // 7b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.abb (ILjava/lang/String;)V
      // 7e: return
      // 7f: new java/util/ArrayList
      // 82: dup
      // 83: invokespecial java/util/ArrayList.<init> ()V
      // 86: astore 3
      // 87: aload 1
      // 88: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.b Ljava/lang/String;
      // 8b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 8e: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 91: astore 4
      // 93: aload 4
      // 95: arraylength
      // 96: istore 5
      // 98: bipush 0
      // 99: istore 6
      // 9b: iload 6
      // 9d: iload 5
      // 9f: if_icmpge dc
      // a2: aload 4
      // a4: iload 6
      // a6: aaload
      // a7: astore 7
      // a9: iload 2
      // aa: aload 7
      // ac: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // af: astore 8
      // b1: ifne e4
      // b4: iload 2
      // b5: ifne d8
      // b8: goto bc
      // bb: athrow
      // bc: aload 8
      // be: invokevirtual java/lang/String.isEmpty ()Z
      // c1: ifne d5
      // c4: goto c8
      // c7: athrow
      // c8: aload 3
      // c9: aload 8
      // cb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // d0: pop
      // d1: goto d5
      // d4: athrow
      // d5: iinc 6 1
      // d8: iload 2
      // d9: ifeq 9b
      // dc: aload 0
      // dd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb;
      // e0: aload 3
      // e1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bb.aaa (Ljava/util/List;)V
      // e4: return
   }
}
