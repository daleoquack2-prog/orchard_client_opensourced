package nsc;

import java.util.function.BooleanSupplier;

public final class aaaaaaaa {
   public static final double aa = 0.02;
   public static final double a = 0.25;
   private static final long b;
   public static final float ab = 0.12F;

   public static double aa(double var0) {
      return Math.max(0.0, var0 - 0.02);
   }

   public static double ab(double var0, double var2, double var4) {
      double var6 = Math.min(var0, var2);
      double var8 = Math.max(var0, var2);
      return var6 + (var8 - var6) * aab(var4, 0.0, 1.0);
   }

   public static boolean ba(abaababa param0, abaababa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 014
      // 009: ifnonnull 013
      // 00c: goto 010
      // 00f: athrow
      // 010: bipush 0
      // 011: ireturn
      // 012: athrow
      // 013: aload 1
      // 014: iload 2
      // 015: ifne 023
      // 018: ifnonnull 022
      // 01b: goto 01f
      // 01e: athrow
      // 01f: bipush 1
      // 020: ireturn
      // 021: athrow
      // 022: aload 0
      // 023: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.ba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa;
      // 026: aload 1
      // 027: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.ba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa;
      // 02a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa.compareTo (Ljava/lang/Enum;)I
      // 02d: istore 3
      // 02e: iload 3
      // 02f: iload 2
      // 030: ifne 05c
      // 033: ifeq 050
      // 036: goto 03a
      // 039: athrow
      // 03a: iload 3
      // 03b: iload 2
      // 03c: ifne 04b
      // 03f: goto 043
      // 042: athrow
      // 043: ifle 04e
      // 046: goto 04a
      // 049: athrow
      // 04a: bipush 1
      // 04b: goto 04f
      // 04e: bipush 0
      // 04f: ireturn
      // 050: aload 0
      // 051: iload 2
      // 052: ifne 06a
      // 055: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.ab ()Z
      // 058: goto 05c
      // 05b: athrow
      // 05c: aload 1
      // 05d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.ab ()Z
      // 060: if_icmpeq 069
      // 063: aload 0
      // 064: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.ab ()Z
      // 067: ireturn
      // 068: athrow
      // 069: aload 0
      // 06a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.bb ()D
      // 06d: aload 1
      // 06e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.bb ()D
      // 071: invokestatic java/lang/Double.compare (DD)I
      // 074: istore 4
      // 076: iload 4
      // 078: iload 2
      // 079: ifne 0a5
      // 07c: ifeq 09a
      // 07f: goto 083
      // 082: athrow
      // 083: iload 4
      // 085: iload 2
      // 086: ifne 095
      // 089: goto 08d
      // 08c: athrow
      // 08d: ifge 098
      // 090: goto 094
      // 093: athrow
      // 094: bipush 1
      // 095: goto 099
      // 098: bipush 0
      // 099: ireturn
      // 09a: aload 0
      // 09b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.a ()D
      // 09e: aload 1
      // 09f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.a ()D
      // 0a2: invokestatic java/lang/Double.compare (DD)I
      // 0a5: istore 5
      // 0a7: iload 5
      // 0a9: iload 2
      // 0aa: ifne 0d6
      // 0ad: ifeq 0cb
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: iload 5
      // 0b6: iload 2
      // 0b7: ifne 0c6
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: ifge 0c9
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: bipush 1
      // 0c6: goto 0ca
      // 0c9: bipush 0
      // 0ca: ireturn
      // 0cb: aload 0
      // 0cc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.aa ()D
      // 0cf: aload 1
      // 0d0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.aa ()D
      // 0d3: invokestatic java/lang/Double.compare (DD)I
      // 0d6: istore 6
      // 0d8: iload 6
      // 0da: iload 2
      // 0db: ifne 100
      // 0de: ifeq 0fc
      // 0e1: goto 0e5
      // 0e4: athrow
      // 0e5: iload 6
      // 0e7: iload 2
      // 0e8: ifne 0f7
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: ifge 0fa
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: bipush 1
      // 0f7: goto 0fb
      // 0fa: bipush 0
      // 0fb: ireturn
      // 0fc: aload 0
      // 0fd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.b ()I
      // 100: iload 2
      // 101: ifne 114
      // 104: aload 1
      // 105: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.b ()I
      // 108: if_icmpge 117
      // 10b: goto 10f
      // 10e: athrow
      // 10f: bipush 1
      // 110: goto 114
      // 113: athrow
      // 114: goto 118
      // 117: bipush 0
      // 118: ireturn
   }

   private aaaaaaaa() {
   }

   private static double bb(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24
   ) {
      return bba(var2 - var8 * var0, var4 - var10 * var0, var6 - var12 * var0, var14, var16, var18, var20, var22, var24);
   }

   public static double aaa(double param0, double param2, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 6
      // 05: dload 0
      // 06: iload 6
      // 08: ifne 6c
      // 0b: invokestatic java/lang/Double.isFinite (D)Z
      // 0e: ifeq 67
      // 11: goto 15
      // 14: athrow
      // 15: dload 2
      // 16: iload 6
      // 18: ifne 6c
      // 1b: goto 1f
      // 1e: athrow
      // 1f: invokestatic java/lang/Double.isFinite (D)Z
      // 22: ifeq 67
      // 25: goto 29
      // 28: athrow
      // 29: dload 4
      // 2b: iload 6
      // 2d: ifne 6c
      // 30: goto 34
      // 33: athrow
      // 34: invokestatic java/lang/Double.isFinite (D)Z
      // 37: ifeq 67
      // 3a: goto 3e
      // 3d: athrow
      // 3e: dload 2
      // 3f: iload 6
      // 41: ifne 6c
      // 44: goto 48
      // 47: athrow
      // 48: ldc2_w 1.0E-4
      // 4b: dcmpg
      // 4c: ifle 67
      // 4f: goto 53
      // 52: athrow
      // 53: dload 4
      // 55: iload 6
      // 57: ifne 7c
      // 5a: goto 5e
      // 5d: athrow
      // 5e: dconst_0
      // 5f: dcmpg
      // 60: ifgt 6d
      // 63: goto 67
      // 66: athrow
      // 67: dconst_0
      // 68: goto 6c
      // 6b: athrow
      // 6c: dreturn
      // 6d: dload 0
      // 6e: dload 2
      // 6f: ddiv
      // 70: dconst_0
      // 71: ldc2_w 0.25
      // 74: dload 4
      // 76: invokestatic java/lang/Math.min (DD)D
      // 79: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaaa.aab (DDD)D
      // 7c: dreturn
   }

   private static double aab(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static bbaaabaa aba(boolean param0, boolean param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: iload 0
      // 05: iload 3
      // 06: ifne 16
      // 09: ifne 15
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa;
      // 13: areturn
      // 14: athrow
      // 15: iload 1
      // 16: iload 3
      // 17: ifne 27
      // 1a: ifeq 26
      // 1d: goto 21
      // 20: athrow
      // 21: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa;
      // 24: areturn
      // 25: athrow
      // 26: iload 2
      // 27: ifeq 31
      // 2a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa;
      // 2d: goto 34
      // 30: athrow
      // 31: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa;
      // 34: areturn
   }

   public static boolean abb(boolean var0, BooleanSupplier var1) {
      int var2 = baaabbaa.bba;

      label65: {
         try {
            if (var2 != 0) {
               return var0;
            }

            if (!var0) {
               break label65;
            }
         } catch (MatchException var5) {
            throw var5;
         }

         return true;
      }

      BooleanSupplier var6;
      label40: {
         try {
            var6 = var1;
            if (var2 != 0) {
               break label40;
            }

            if (var1 == null) {
               return false;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var6 = var1;
      }

      try {
         boolean var7 = var6.getAsBoolean();
         if (var2 != 0) {
            return var7;
         }

         if (var7) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   public static boolean baa(double var0, double var2) {
      int var4 = baaabbaa.bba;

      try {
         double var6;
         int var10000 = (var6 = var0 - Math.max(0.0, var2)) == 0.0 ? 0 : (var6 < 0.0 ? -1 : 1);
         if (var4 != 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (MatchException var5) {
         throw var5;
      }

      return (boolean)0;
   }

   public static double b(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: dconst_0
      // 05: dload 0
      // 06: invokestatic java/lang/Math.max (DD)D
      // 09: dstore 3
      // 0a: dload 3
      // 0b: ldc2_w 3.0
      // 0e: iload 2
      // 0f: ifne 2d
      // 12: dcmpg
      // 13: ifgt 21
      // 16: goto 1a
      // 19: athrow
      // 1a: ldc2_w 4.0
      // 1d: dload 3
      // 1e: dmul
      // 1f: dreturn
      // 20: athrow
      // 21: dload 3
      // 22: iload 2
      // 23: ifne 49
      // 26: ldc2_w 8.0
      // 29: goto 2d
      // 2c: athrow
      // 2d: dcmpg
      // 2e: ifgt 40
      // 31: ldc2_w 12.0
      // 34: ldc2_w 2.0
      // 37: dload 3
      // 38: ldc2_w 3.0
      // 3b: dsub
      // 3c: dmul
      // 3d: dadd
      // 3e: dreturn
      // 3f: athrow
      // 40: ldc2_w 22.0
      // 43: dload 3
      // 44: ldc2_w 8.0
      // 47: dsub
      // 48: dadd
      // 49: dreturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static boolean bab(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24
   ) {
      double var27 = Math.max(0.0, var24);
      double var29 = var27 * var27;
      double var31 = 0.0;
      int var26 = baaabbaa.bba;
      double var33 = 1.0;
      int var35 = 0;

      double var10000;
      while (true) {
         if (var35 < (int)b) {
            double var36 = (var31 * 2.0 + var33) / 3.0;
            var10000 = (var31 + var33 * 2.0) / 3.0;
            if (var26 != 0) {
               break;
            }

            double var38 = var10000;
            double var40 = bb(var36, var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22);
            double var42 = bb(var38, var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22);

            label61: {
               label60: {
                  label71: {
                     try {
                        var10000 = var40;
                        if (var26 != 0) {
                           break label60;
                        }

                        if (!(var40 <= var42)) {
                           break label71;
                        }
                     } catch (MatchException var47) {
                        throw var47;
                     }

                     var33 = var38;

                     try {
                        if (var26 == 0) {
                           break label61;
                        }
                     } catch (MatchException var46) {
                        throw var46;
                     }
                  }

                  try {
                     var10000 = var36;
                  } catch (MatchException var44) {
                     throw var44;
                  }
               }

               var31 = var10000;
            }

            var35++;
            if (var26 == 0) {
               continue;
            }
         }

         var10000 = (var31 + var33) * 0.5;
         break;
      }

      double var48 = var10000;

      try {
         double var51;
         int var50 = (
                  var51 = Math.min(
                        bb(0.0, var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22),
                        Math.min(
                           bb(var48, var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22),
                           bb(1.0, var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22)
                        )
                     )
                     - var29
               )
               == 0.0
            ? 0
            : (var51 < 0.0 ? -1 : 1);
         if (var26 != 0) {
            return (boolean)var50;
         }

         if (var50 <= 0) {
            return (boolean)1;
         }
      } catch (MatchException var45) {
         throw var45;
      }

      return (boolean)0;
   }

   public static double bba(double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16) {
      double var18 = Math.max(var6 - var0, Math.max(0.0, var0 - var12));
      double var20 = Math.max(var8 - var2, Math.max(0.0, var2 - var14));
      double var22 = Math.max(var10 - var4, Math.max(0.0, var4 - var16));
      return var18 * var18 + var20 * var20 + var22 * var22;
   }

   public static double bbb(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: dconst_0
      // 06: dload 0
      // 07: invokestatic java/lang/Math.max (DD)D
      // 0a: dstore 5
      // 0c: dload 2
      // 0d: dconst_0
      // 0e: iload 4
      // 10: ifne 2b
      // 13: dcmpl
      // 14: ifle 1e
      // 17: goto 1b
      // 1a: athrow
      // 1b: dconst_0
      // 1c: dreturn
      // 1d: athrow
      // 1e: dload 2
      // 1f: iload 4
      // 21: ifne 48
      // 24: ldc2_w -0.5
      // 27: goto 2b
      // 2a: athrow
      // 2b: dcmpl
      // 2c: ifle 46
      // 2f: dload 5
      // 31: iload 4
      // 33: ifne 48
      // 36: goto 3a
      // 39: athrow
      // 3a: dconst_1
      // 3b: dcmpl
      // 3c: ifle 46
      // 3f: goto 43
      // 42: athrow
      // 43: dconst_1
      // 44: dreturn
      // 45: athrow
      // 46: dload 5
      // 48: dreturn
   }

   public static boolean aaaa(boolean var0, boolean var1) {
      int var2 = baaabbaa.bba;

      boolean var10000;
      label33: {
         try {
            var10000 = var0;
            if (var2 != 0) {
               break label33;
            }

            if (!var0) {
               return false;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var10000 = var1;
      }

      try {
         if (var2 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return false;
   }

   static {
      long var0 = 1887891545545144655L;
      long var10002 = 7513299290185169235L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }

   public static float aaab(double var0, boolean var2) {
      float var3 = (float)aab(var0 / 100.0, 0.0, 1.0);

      try {
         if (var2) {
            return Math.min(var3, 0.12F);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return var3;
   }

   public static boolean aaba(abaababa param0, abaababa param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 0
      // 06: iload 4
      // 08: ifne 16
      // 0b: ifnonnull 15
      // 0e: goto 12
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: athrow
      // 15: aload 1
      // 16: iload 4
      // 18: ifne 26
      // 1b: ifnonnull 25
      // 1e: goto 22
      // 21: athrow
      // 22: bipush 1
      // 23: ireturn
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.ba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa;
      // 29: aload 1
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.ba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa;
      // 2d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbaaabaa.compareTo (Ljava/lang/Enum;)I
      // 30: istore 5
      // 32: iload 5
      // 34: iload 4
      // 36: ifne 65
      // 39: ifeq 58
      // 3c: goto 40
      // 3f: athrow
      // 40: iload 5
      // 42: iload 4
      // 44: ifne 53
      // 47: goto 4b
      // 4a: athrow
      // 4b: ifle 56
      // 4e: goto 52
      // 51: athrow
      // 52: bipush 1
      // 53: goto 57
      // 56: bipush 0
      // 57: ireturn
      // 58: aload 0
      // 59: iload 4
      // 5b: ifne 71
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.ab ()Z
      // 61: goto 65
      // 64: athrow
      // 65: aload 1
      // 66: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.ab ()Z
      // 69: if_icmpeq 75
      // 6c: aload 0
      // 6d: goto 71
      // 70: athrow
      // 71: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.ab ()Z
      // 74: ireturn
      // 75: dconst_0
      // 76: dload 2
      // 77: invokestatic java/lang/Math.max (DD)D
      // 7a: dstore 6
      // 7c: aload 0
      // 7d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.bb ()D
      // 80: dload 6
      // 82: dadd
      // 83: aload 1
      // 84: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaababa.bb ()D
      // 87: dcmpg
      // 88: iload 4
      // 8a: ifne 95
      // 8d: ifge 98
      // 90: goto 94
      // 93: athrow
      // 94: bipush 1
      // 95: goto 99
      // 98: bipush 0
      // 99: ireturn
   }

   public static double aabb(double var0, int var2, int var3, double var4, double var6) {
      double var8 = Math.max(0.0, var0);
      double var10 = 5.0 + b(var8) + var8 * 0.5 * Math.max(0, var3);
      double var12 = Math.max(0.0, var4);
      double var14 = 2.0 + Math.max(0.0, var6) / 4.0;
      double var16 = aab(var12 - var10 / var14, var12 * 0.2, 20.0) / 25.0;
      var16 = aab(var16 - 0.15 * Math.max(0, var2), 0.0, 1.0);
      return var10 * (1.0 - var16);
   }
}
