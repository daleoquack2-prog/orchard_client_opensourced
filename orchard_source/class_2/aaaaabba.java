package nsc;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_238;

@Environment(EnvType.CLIENT)
public final class aaaaabba {
   private static final int[] aaab;
   private long aa;
   private static final double ab = 1.70158;
   private static final double ba = 0.18;
   private static final double bb = 1.4E9;
   private class_2338 aaa;
   private final boolean aab;
   private static final String[] aaba;
   private class_2338 aba;
   private static final long abb;
   private double b;
   private long baa;
   private static final Object[] aabb;
   private long bab;
   private static final long[] bba;
   private static final long bbb;
   private static final long a;
   private static final Long[] aaaa;

   void aa(class_2338 param1, long param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: aload 1
      // 06: iload 4
      // 08: ifne 28
      // 0b: ifnonnull 19
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: lload 2
      // 14: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaa (J)V
      // 17: return
      // 18: athrow
      // 19: aload 0
      // 1a: iload 4
      // 1c: ifne 42
      // 1f: lconst_0
      // 20: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.baa J
      // 23: aload 1
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaa Lnet/minecraft/class_2338;
      // 2c: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 2f: ifeq 34
      // 32: return
      // 33: athrow
      // 34: aload 0
      // 35: lload 2
      // 36: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.bab (J)V
      // 39: aload 0
      // 3a: aload 1
      // 3b: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 3e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaa Lnet/minecraft/class_2338;
      // 41: aload 0
      // 42: lload 2
      // 43: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.bab J
      // 46: return
   }

   private double ab(long var1) {
      try {
         if (this.aba == null) {
            return 0.0;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return 1.0 - (var1 - this.aa) / 1.5E8;
   }

   class_238 ba(long param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 5
      // 05: iload 5
      // 07: aload 0
      // 08: lload 1
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.ab (J)D
      // 0c: dstore 6
      // 0e: ifne 25
      // 11: dload 6
      // 13: dconst_0
      // 14: dcmpl
      // 15: ifgt 27
      // 18: goto 1c
      // 1b: athrow
      // 1c: aload 0
      // 1d: aconst_null
      // 1e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aba Lnet/minecraft/class_2338;
      // 21: goto 25
      // 24: athrow
      // 25: aconst_null
      // 26: areturn
      // 27: aload 0
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aba Lnet/minecraft/class_2338;
      // 2b: aload 0
      // 2c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.b D
      // 2f: dload 3
      // 30: dmul
      // 31: dload 6
      // 33: dmul
      // 34: dload 6
      // 36: dmul
      // 37: aload 0
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aab Z
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaba (Lnet/minecraft/class_2338;DZ)Lnet/minecraft/class_238;
      // 3e: areturn
   }

   public void bb() {
      this.aaa = null;
      this.aba = null;
      this.baa = 0L;
   }

   void aaa(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaa Lnet/minecraft/class_2338;
      // 0c: ifnull 42
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: iload 3
      // 19: ifne 2d
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.baa J
      // 1f: lconst_0
      // 20: lcmp
      // 21: ifne 42
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: goto 2d
      // 2c: athrow
      // 2d: lload 1
      // 2e: ldc 2056449692
      // 30: ldc -846363265
      // 32: ldc -1963030486
      // 34: ixor
      // 35: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aabb (II)I
      // 38: ldc2_w 4924498823371401490
      // 3b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.bbb (IJ)J
      // 3e: ladd
      // 3f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.baa J
      // 42: return
   }

   static long aab() {
      return bbb(aabb(2056449693, -1023926093 ^ 1029786203), 5589929008227218147L);
   }

   public aaaaabba(boolean var1) {
      this.aab = var1;
   }

   public void aba() {
      this.aaa(System.nanoTime());
   }

   static long abb() {
      return bbb(aabb(2056449694, 1182859278 ^ -798422356), 1688717794426138376L);
   }

   static {
      int var25 = -1738675659;
      String var15 = "\uf8d0\uf720\uf73d\uf779\uf7da\uf88f\uf8b4\uf75f\uf8ec\uf7fe\uf73e\uf73a\uf72c\uf8e1\uf7a8\uf892\uf8a2\uf736\uf883\uf7cb\uf8f2\uf8b6\uf722\uf77a\uf80d\uf713\uf8f7\uf882\uf8d3\uf898\uf875\uf76e\uf8e6\uf8d9\uf893\uf750\uf78d\uf8fd\uf762\uf834\uf883\uf77d\uf76f\uf746\uf825\uf8a8\uf73d\uf8c0ᓯᑍᒂᓋᑽᒜᒫᓴᓋᑶ콣켪탸탘콖켪쾉킛쿸퀮콠켩탆콒쿴켜ྯญ࿂ྋ༽\u0fdc\u0febྴྋ༶";
      short var14 = 2758;
      byte var21 = -1;
      char[] var16 = "\u0af6ૌ\u0ad6ૌ".toCharArray();
      String[] var17 = new String[var16.length];

      while (true) {
         int var18 = 0;
         int var19 = 0;
         int var20 = 0;
         if (var21 == 0) {
            aaba = var17;
            aabb = new Object[var17.length];
            int var10 = -174887469;
            byte[] var8 = "7\u008dLÁ\u008fgbJæ\u0017±<\u0083i) \u0084\u0080Y\f\u0016½\f¾ë°Þ÷\u0082ý\"S \u0088\u0093ÁyËi\n\u000f\u0082_=)¹||;#Ü7¸\u008bÎiÛ9\u0002\u0082Á_6ø\u0014B)\u001f@NÏC\u000bX©Y(òÌû&À\u00006\u0019EHw\u0088%èf\u0093µ~XÞ$\u001cév`*¬á×\u001f:gØrÛ{qÏ\u0094,`oCÙrhË\bS\u009dl"
               .getBytes("ISO-8859-1");
            int var9 = var8.length / 4;
            aaab = new int[var9];
            byte var11 = 0;
            int var12 = 0;

            do {
               int var13 = (var8[var11] & 255) << 24 | (var8[var11 + 1] & 255) << 16 | (var8[var11 + 2] & 255) << 8 | var8[var11 + 3] & 255;
               var13 ^= var10;
               aaab[var12] = var13;
               var11 += 4;
            } while (++var12 < var9);

            long var0 = 8319295844591683837L;
            long[] var6 = new long[aabb(2056449685, var25 ^ -1855377138)];
            int var3 = 0;
            String var4;
            int var5 = (var4 = abaa('蕰', (short)'\uf281', var25 ^ -410339781)).length();
            byte var2 = 0;

            label65:
            while (true) {
               int var10001 = var2;
               var2 += 8;
               String var29 = var4.substring(var10001, var2);
               char var32 = '蕱';
               char var10002 = '\ueb8c';
               int var10003 = var25 ^ 446399641;
               byte[] var7 = var29.getBytes("ISO-8859-1");
               long[] var30 = var6;
               var10001 = var3++;
               long var36 = (var7[0] & 255L) << aabb(2056449686, var25 ^ -417331350)
                  | (var7[1] & 255L) << aabb(2056449687, var25 ^ -1055185902)
                  | (var7[2] & 255L) << aabb(2056449680, var25 ^ -746486698)
                  | (var7[3] & 255L) << aabb(2056449681, var25 ^ 1344902673)
                  | (var7[4] & 255L) << aabb(2056449682, var25 ^ 865819377)
                  | (var7[5] & 255L) << aabb(2056449683, var25 ^ 704474866)
                  | (var7[aabb(2056449676, var25 ^ -52399844)] & 255L) << aabb(2056449677, var25 ^ -1460889761)
                  | var7[aabb(2056449678, var25 ^ -470093479)] & 255L;
               int var39 = -1;

               while (true) {
                  long var42 = var36 ^ var0;
                  switch (var39) {
                     case 0:
                        var30[var10001] = var42;
                        if (var2 >= var5) {
                           bba = var6;
                           aaaa = new Long[aabb(2056449664, var25 ^ -1814849659)];
                           abb = bbb(aabb(2056449665, var25 ^ -993812099), 2872564481328076439L);
                           bbb = bbb(aabb(2056449666, var25 ^ 835831635), 2005502050159244785L);
                           a = bbb(aabb(2056449667, var25 ^ -521115090), 7480780010049031259L);
                           return;
                        }
                        break;
                     default:
                        var30[var10001] = var42;
                        if (var2 < var5) {
                           continue label65;
                        }

                        var5 = (var4 = abaa('蕲', (short)'\uda68', var25 ^ -1747010998)).length();
                        var2 = 0;
                  }

                  byte var34 = var2;
                  var2 += 8;
                  var29 = var4.substring(var34, var2);
                  var32 = '蕳';
                  short var38 = 11682;
                  var39 = var25 ^ 670417545;
                  var7 = var29.getBytes("ISO-8859-1");
                  var30 = var6;
                  var10001 = var3++;
                  var36 = (var7[0] & 255L) << aabb(2056449679, var25 ^ -1068460875)
                     | (var7[1] & 255L) << aabb(2056449672, var25 ^ -832415673)
                     | (var7[2] & 255L) << aabb(2056449673, var25 ^ -236515313)
                     | (var7[3] & 255L) << aabb(2056449674, var25 ^ 1619505157)
                     | (var7[4] & 255L) << aabb(2056449675, var25 ^ 2065114674)
                     | (var7[5] & 255L) << aabb(2056449668, var25 ^ 914769140)
                     | (var7[aabb(2056449669, var25 ^ -1631423834)] & 255L) << aabb(2056449670, var25 ^ 158680877)
                     | var7[aabb(2056449671, var25 ^ -1887819054)] & 255L;
                  var39 = 0;
               }
            }
         }

         do {
            var20 = var16[var18] ^ var14;
            char[] var22 = var15.substring(var19, var19 + var20).toCharArray();
            int var23 = 0;

            do {
               short var24 = switch (var23 % 5) {
                  default -> 192;
                  case 1 -> 248;
                  case 2 -> 171;
                  case 3 -> 128;
                  case 4 -> 33;
               };
               var22[var23] = (char)(var22[var23] ^ var24);
            } while (++var23 < var22.length);

            var17[var18] = new String(var22).intern();
            var19 += var20;
         } while (++var18 < var16.length);

         var21 = 0;
      }
   }

   public aaaaabba() {
      this(false);
   }

   public void baa(Object var1, Color var2, double var3, double var5, float var7, double var8) {
      long var10 = System.nanoTime();
      class_238 var12 = this.aaab(var10, var8);
      double var13 = this.ab(var10);

      try {
         aaaa(var1, this.ba(var10, var8), var2, var3 * var13, var5 * var13, var7);
         if (var12 == null) {
            return;
         }
      } catch (MatchException var22) {
         throw var22;
      }

      long var15 = var10 - this.bab;
      double var17 = Math.min(1.0, Math.max(0.0, var15 / 1.3E8));

      double var10000;
      label22: {
         try {
            if (var15 < bbb(aabb(2056449695, 1795560828 ^ -1735304194), 5673539822231294948L)) {
               var10000 = 1.0;
               break label22;
            }
         } catch (MatchException var21) {
            throw var21;
         }

         var10000 = 1.0 - 0.09 * (1.0 - Math.cos((var15 - bbb(aabb(2056449688, 1795560828 ^ -1619514411), 5673539822231294948L)) / 1.4E9 * 2.0 * Math.PI));
      }

      double var19 = var10000;
      aaaa(var1, var12, var2, var3 * var17 * var19, var5 * var17, var7);
   }

   private void bab(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 39
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaa Lnet/minecraft/class_2338;
      // 0c: ifnonnull 15
      // 0f: goto 13
      // 12: athrow
      // 13: return
      // 14: athrow
      // 15: aload 0
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaa Lnet/minecraft/class_2338;
      // 1a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aba Lnet/minecraft/class_2338;
      // 1d: aload 0
      // 1e: dconst_1
      // 1f: lload 1
      // 20: aload 0
      // 21: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.bab J
      // 24: lsub
      // 25: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.b (J)D
      // 28: invokestatic java/lang/Math.min (DD)D
      // 2b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.b D
      // 2e: aload 0
      // 2f: lload 1
      // 30: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aa J
      // 33: aload 0
      // 34: aconst_null
      // 35: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaa Lnet/minecraft/class_2338;
      // 38: aload 0
      // 39: lconst_0
      // 3a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.baa J
      // 3d: return
   }

   static double b(long param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: lload 0
      // 05: lconst_0
      // 06: iload 2
      // 07: ifne 31
      // 0a: lcmp
      // 0b: ifgt 15
      // 0e: goto 12
      // 11: athrow
      // 12: dconst_0
      // 13: dreturn
      // 14: athrow
      // 15: lload 0
      // 16: iload 2
      // 17: ifne 39
      // 1a: ldc_w 2056449689
      // 1d: ldc_w 1276918486
      // 20: ldc_w 710889932
      // 23: ixor
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aabb (II)I
      // 27: ldc2_w 5673539822231294948
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.bbb (IJ)J
      // 2d: goto 31
      // 30: athrow
      // 31: lcmp
      // 32: iflt 38
      // 35: dconst_1
      // 36: dreturn
      // 37: athrow
      // 38: lload 0
      // 39: l2d
      // 3a: ldc2_w 2.6E8
      // 3d: ddiv
      // 3e: dconst_1
      // 3f: dsub
      // 40: dstore 3
      // 41: dconst_1
      // 42: ldc2_w 2.70158
      // 45: dload 3
      // 46: dmul
      // 47: dload 3
      // 48: dmul
      // 49: dload 3
      // 4a: dmul
      // 4b: dadd
      // 4c: ldc2_w 1.70158
      // 4f: dload 3
      // 50: dmul
      // 51: dload 3
      // 52: dmul
      // 53: dadd
      // 54: dreturn
   }

   public void bba(class_2338 var1) {
      this.aa(var1, System.nanoTime());
   }

   private static int aabb(int var0, int var1) {
      int var2 = aaab[var0 ^ 2056449692] ^ var1 ^ var0;
      var2 ^= 50119;
      var2 += 61187;
      var2 -= 10283;
      var2 -= 59756;
      var2 += 55631;
      var2 += 43559;
      var2 -= 29161;
      return var2 + 7775;
   }

   private static long bbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aabb(2056449690, -1953801544 ^ 281403083)) & aabb(2056449691, -1953801544 ^ 2038975171);
      if (aaaa[var3] == null) {
         aaaa[var3] = bba[var3] ^ var1;
      }

      return aaaa[var3];
   }

   private static void aaaa(Object var0, class_238 var1, Color var2, double var3, double var5, float var7) {
      int var8 = aabbabbab.ab;

      Object var10000;
      label22: {
         try {
            var10000 = var1;
            if (var8 != 0) {
               break label22;
            }

            if (var1 == null) {
               return;
            }
         } catch (MatchException var9) {
            throw var9;
         }

         bbaabbaa.abaaab(var0, var1, var2, var3);
         var10000 = var0;
      }

      bbaabbaa.bbaaa(var10000, var1, var2, var5, var7);
   }

   private static String abaa(char var0, short var1, int var2) {
      int var3 = var0 ^ '蕰';
      char[] var4 = aaba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aabb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aabb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 25205;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '镛';
         var10 += 24647;
         var10 -= 63488;
         var10 += 47533;
         var10 += 44865;
         var10 ^= 31157;
         var10 += 62993;
         var10 ^= 18641;
         var10 ^= 25554;
         var10 ^= 29992;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   class_238 aaab(long param1, double param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 5
      // 05: aload 0
      // 06: iload 5
      // 08: ifne 42
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaa Lnet/minecraft/class_2338;
      // 0e: ifnull 41
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: iload 5
      // 18: ifne 42
      // 1b: goto 1f
      // 1e: athrow
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.baa J
      // 22: lconst_0
      // 23: lcmp
      // 24: ifeq 41
      // 27: goto 2b
      // 2a: athrow
      // 2b: lload 1
      // 2c: aload 0
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.baa J
      // 30: lcmp
      // 31: iflt 41
      // 34: goto 38
      // 37: athrow
      // 38: aload 0
      // 39: lload 1
      // 3a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.bab (J)V
      // 3d: goto 41
      // 40: athrow
      // 41: aload 0
      // 42: iload 5
      // 44: ifne 57
      // 47: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaa Lnet/minecraft/class_2338;
      // 4a: ifnonnull 56
      // 4d: goto 51
      // 50: athrow
      // 51: aconst_null
      // 52: goto 6c
      // 55: athrow
      // 56: aload 0
      // 57: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaa Lnet/minecraft/class_2338;
      // 5a: lload 1
      // 5b: aload 0
      // 5c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.bab J
      // 5f: lsub
      // 60: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.b (J)D
      // 63: dload 3
      // 64: dmul
      // 65: aload 0
      // 66: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aab Z
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabba.aaba (Lnet/minecraft/class_2338;DZ)Lnet/minecraft/class_238;
      // 6c: areturn
   }

   static class_238 aaba(class_2338 param0, double param1, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: aload 0
      // 06: ifnull 1e
      // 09: dload 1
      // 0a: iload 4
      // 0c: ifne 26
      // 0f: goto 13
      // 12: athrow
      // 13: ldc2_w 0.001
      // 16: dcmpl
      // 17: ifgt 21
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aconst_null
      // 1f: areturn
      // 20: athrow
      // 21: ldc2_w 0.5
      // 24: dload 1
      // 25: dmul
      // 26: dstore 5
      // 28: aload 0
      // 29: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 2c: i2d
      // 2d: ldc2_w 0.5
      // 30: dadd
      // 31: dstore 7
      // 33: aload 0
      // 34: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 37: i2d
      // 38: ldc2_w 0.5
      // 3b: dadd
      // 3c: dstore 9
      // 3e: iload 3
      // 3f: iload 4
      // 41: ifne 58
      // 44: ifeq 54
      // 47: goto 4b
      // 4a: athrow
      // 4b: aload 0
      // 4c: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 4f: i2d
      // 50: goto 60
      // 53: athrow
      // 54: aload 0
      // 55: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 58: i2d
      // 59: ldc2_w 0.5
      // 5c: dadd
      // 5d: dload 5
      // 5f: dsub
      // 60: dstore 11
      // 62: new net/minecraft/class_238
      // 65: dup
      // 66: dload 7
      // 68: dload 5
      // 6a: dsub
      // 6b: dload 11
      // 6d: dload 9
      // 6f: dload 5
      // 71: dsub
      // 72: dload 7
      // 74: dload 5
      // 76: dadd
      // 77: dload 11
      // 79: dload 1
      // 7a: dadd
      // 7b: dload 9
      // 7d: dload 5
      // 7f: dadd
      // 80: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
      // 83: areturn
   }

   static long a() {
      return bbb(aabb(2056449684, 696340405 ^ -101219001), 5371580238073135212L);
   }
}
