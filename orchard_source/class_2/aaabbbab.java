package nsc;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class aaabbbab extends baaabbaa {
   private static final long aa;
   private static final ababbbbaa ab;
   private final double ba;
   private static final int[] abb;
   private static final String[] aaab;
   private final double bb;
   private final double aaa;
   private static final ababbbbaa aab;
   private static final Object[] aaba;
   private ababbbbaa aba = aabbaaaba.aa("");

   private int aa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.ba D
      // 04: invokestatic java/lang/Math.abs (D)D
      // 07: dstore 2
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: istore 1
      // 0f: iload 4
      // 11: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.aa J
      // 14: l2i
      // 15: if_icmpge 45
      // 18: dload 2
      // 19: dload 2
      // 1a: invokestatic java/lang/Math.rint (D)D
      // 1d: dsub
      // 1e: invokestatic java/lang/Math.abs (D)D
      // 21: ldc2_w 1.0E-6
      // 24: dcmpl
      // 25: iload 1
      // 26: ifne 47
      // 29: iload 1
      // 2a: ifne 47
      // 2d: goto 31
      // 30: athrow
      // 31: ifle 45
      // 34: goto 38
      // 37: athrow
      // 38: dload 2
      // 39: ldc2_w 10.0
      // 3c: dmul
      // 3d: dstore 2
      // 3e: iload 1
      // 3f: iinc 4 1
      // 42: ifeq 0f
      // 45: iload 4
      // 47: ireturn
   }

   public double ba() {
      return this.aaa;
   }

   @Override
   public void aab(Object var1) {
      this.a((double[])var1);
   }

   public ababbbbaa bb() {
      return this.aba;
   }

   @Override
   public JsonElement aba() {
      JsonArray var1 = new JsonArray();
      var1.add(new JsonPrimitive(((double[])this.abbb())[0]));
      var1.add(new JsonPrimitive(((double[])this.abbb())[1]));
      return var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var20 = 85485481;
      char[] var11 = "喳".toCharArray();
      String var10 = "ӕӷӸҺҨѠӞӤӶӖҚБҮӛҨөҳВӜӺӲӦҜжӳӋӊӚҍгӏӏӉ";
      short var9 = 21906;
      String[] var10000 = new String[var11.length];
      byte var16 = -1;
      String[] var12 = var10000;

      while (true) {
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         if (var16 == 0) {
            aaab = var12;
            aaba = new Object[var12.length];
            byte var24 = 0;
            int var10001 = 0;
            byte[] var10002 = "u)^þ+(¬u)\u0087ynA=ä5b^\u0085ÔpÞ]\ncÂð\\ÎòKÑ\u001elí'".getBytes("ISO-8859-1");
            abb = new int[9];

            int var56;
            do {
               abb[var24] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1997383180;
               var24 += 1;
               var56 = var10001 + 4;
               var10001 += 4;
            } while (var56 < var10002.length);

            String[] var2 = new String[2];
            int var6 = 0;
            String var5;
            int var7 = (var5 = abaa(10, '㺺', 2039180691)).length();
            int var4 = aabb(1219184982, var20 ^ -1335306688);
            int var3 = -1;

            while (true) {
               label92: {
                  char[] var27 = var5.substring(++var3, var3 + var4).toCharArray();
                  var56 = var27.length;
                  int var8 = 0;
                  var43 = var27;
                  var10001 = var56;
                  char[] var60;
                  int var74;
                  if (var56 <= 1) {
                     var60 = var27;
                     var74 = var8;
                  } else {
                     var43 = var27;
                     var10001 = var56;
                     if (var56 <= var8) {
                        break label92;
                     }

                     var60 = var27;
                     var74 = var8;
                  }

                  while (true) {
                     var60[var74] = (char)(var60[var74] ^ switch (var8 % aabb(1219184983, var20 ^ -295099177)) {
                        case 0 -> aabb(1219184980, var20 ^ -322506451);
                        case 1 -> aabb(1219184981, var20 ^ -2072220555);
                        case 2 -> aabb(1219184978, var20 ^ -1491137126);
                        case 3 -> aabb(1219184979, var20 ^ -1247816279);
                        case 4 -> aabb(1219184976, var20 ^ -1501333498);
                        case 5 -> aabb(1219184977, var20 ^ 196329692);
                        default -> aabb(1219184990, var20 ^ -617781909);
                     });
                     var8++;
                     if (var10001 == 0) {
                        var74 = var10001;
                        var60 = var43;
                     } else {
                        if (var10001 <= var8) {
                           break;
                        }

                        var60 = var43;
                        var74 = var8;
                     }
                  }
               }

               String var67 = new String(var43).intern();
               byte var34 = -1;
               var2[var6++] = var67;
               if ((var3 += var4) >= var7) {
                  long var0 = 1657245764922588529L;
                  long var48 = -667178647203136137L ^ var0;
                  var34 = -1;
                  aa = var48;
                  ab = aabbaaaba.aaab(var2[0]);
                  aab = aabbaaaba.aaab(var2[1]);
                  return;
               }

               var4 = var5.charAt(var3);
            }
         }

         do {
            var15 = var11[var13] ^ var9;
            char[] var17 = var10.substring(var14, var14 + var15).toCharArray();
            int var18 = 0;

            do {
               short var19 = switch (var18 % 6) {
                  default -> 240;
                  case 1 -> 192;
                  case 2 -> 134;
                  case 3 -> 254;
                  case 4 -> 110;
                  case 5 -> 55;
               };
               var17[var18] = (char)(var17[var18] ^ var19);
            } while (++var18 < var17.length);

            var12[var13] = new String(var17).intern();
            var14 += var15;
         } while (++var13 < var11.length);

         var16 = 0;
      }
   }

   @Override
   public void ab(JsonElement param1) {
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
      // 06: ifne 53
      // 09: ifnull 52
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 53
      // 15: goto 19
      // 18: athrow
      // 19: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 1c: ifeq 52
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 27: astore 3
      // 28: aload 3
      // 29: invokevirtual com/google/gson/JsonArray.size ()I
      // 2c: bipush 2
      // 2d: if_icmplt 51
      // 30: aload 0
      // 31: bipush 2
      // 32: newarray 7
      // 34: dup
      // 35: bipush 0
      // 36: aload 3
      // 37: bipush 0
      // 38: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 3b: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 3e: dastore
      // 3f: dup
      // 40: bipush 1
      // 41: aload 3
      // 42: bipush 1
      // 43: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 46: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 49: dastore
      // 4a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.a ([D)V
      // 4d: goto 51
      // 50: athrow
      // 51: return
      // 52: aload 1
      // 53: iload 2
      // 54: ifne 5f
      // 57: ifnull 9b
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 1
      // 5f: iload 2
      // 60: ifne 72
      // 63: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 66: ifeq 9b
      // 69: goto 6d
      // 6c: athrow
      // 6d: aload 1
      // 6e: goto 72
      // 71: athrow
      // 72: iload 2
      // 73: ifne 88
      // 76: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 79: invokevirtual com/google/gson/JsonPrimitive.isNumber ()Z
      // 7c: ifeq 9b
      // 7f: goto 83
      // 82: athrow
      // 83: aload 1
      // 84: goto 88
      // 87: athrow
      // 88: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 8b: dstore 3
      // 8c: aload 0
      // 8d: bipush 2
      // 8e: newarray 7
      // 90: dup
      // 91: bipush 0
      // 92: dload 3
      // 93: dastore
      // 94: dup
      // 95: bipush 1
      // 96: dload 3
      // 97: dastore
      // 98: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.a ([D)V
      // 9b: return
   }

   public aaabbbab aaa(String var1) {
      return this.bbb(var1);
   }

   public aaabbbab(String var1, double var2, double var4, double var6, double var8, double var10) {
      this((Object)var1, var2, var4, var6, var8, var10);
   }

   public double abb() {
      return ((double[])this.abbb())[1];
   }

   private double baa(double param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.ba D
      // 08: iload 3
      // 09: ifne 1e
      // 0c: dconst_0
      // 0d: dcmpg
      // 0e: ifgt 18
      // 11: goto 15
      // 14: athrow
      // 15: dload 1
      // 16: dreturn
      // 17: athrow
      // 18: dload 1
      // 19: aload 0
      // 1a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.ba D
      // 1d: ddiv
      // 1e: invokestatic java/lang/Math.round (D)J
      // 21: lstore 4
      // 23: aload 0
      // 24: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.ba D
      // 27: invokestatic java/math/BigDecimal.valueOf (D)Ljava/math/BigDecimal;
      // 2a: lload 4
      // 2c: invokestatic java/math/BigDecimal.valueOf (J)Ljava/math/BigDecimal;
      // 2f: invokevirtual java/math/BigDecimal.multiply (Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
      // 32: aload 0
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.aa ()I
      // 36: getstatic java/math/RoundingMode.HALF_UP Ljava/math/RoundingMode;
      // 39: invokevirtual java/math/BigDecimal.setScale (ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
      // 3c: invokevirtual java/math/BigDecimal.doubleValue ()D
      // 3f: dreturn
   }

   public double bab() {
      return ((double[])this.abbb())[0];
   }

   @Override
   public String bbba() {
      return this.aaaa().abab();
   }

   public double bba() {
      return this.bb;
   }

   private static String abaa(byte var0, char var1, int var2) {
      int var7 = var2 ^ 2039180691;
      char[] var6 = aaab[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aaba[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         aaba[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 3058;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 6) {
            default -> 219;
            case 1 -> 212;
            case 2 -> 204;
            case 3 -> 216;
            case 4 -> 20;
            case 5 -> 219;
         } ^ var5 ^ 61496 ^ var0 ^ var1 ^ var4 ^ var2);
      }

      return new String(var6).intern();
   }

   public aaabbbab(Object var1, double var2, double var4, double var6, double var8, double var10) {
      super(var1, new double[]{var2, var4});
      this.bb = var6;
      this.aaa = var8;
      this.ba = var10;
   }

   public aaabbbab bbb(Object var1) {
      this.aba = bababa.ba(var1);
      return this;
   }

   @Override
   public long baab() {
      return this.aaaa().bbb();
   }

   private ababbbbaa aaaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bbab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: iload 1
      // 0b: ifne 2d
      // 0e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 11: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.aaaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 14: ifeq 2c
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 2
      // 1c: aload 2
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbba ()I
      // 20: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 23: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbba ()I
      // 26: isub
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.babb (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 2a: areturn
      // 2b: athrow
      // 2c: aload 2
      // 2d: iload 1
      // 2e: ifne 50
      // 31: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.aaaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 37: ifeq 4f
      // 3a: goto 3e
      // 3d: athrow
      // 3e: aload 2
      // 3f: aload 2
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbba ()I
      // 43: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 46: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbba ()I
      // 49: isub
      // 4a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.babb (I)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 4d: areturn
      // 4e: athrow
      // 4f: aload 2
      // 50: areturn
   }

   private static int aabb(int var0, int var1) {
      int var2 = abb[var0 ^ 1219184982] ^ var1 ^ var0;
      var2 ^= 10823;
      var2 ^= 13681;
      var2 ^= 25296;
      var2 -= 22935;
      var2 -= 4018;
      var2 ^= 34908;
      var2 += 15562;
      return var2 + 9996;
   }

   public String b() {
      return this.aba.abab();
   }

   public void aaab(double var1, double var3) {
      this.a(new double[]{var1, var3});
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public void a(double[] var1) {
      int var2 = baaabbaa.bba;

      label54: {
         double[] var10000;
         label47: {
            try {
               var10000 = var1;
               if (var2 != 0) {
                  break label47;
               }

               if (var1 == null) {
                  break label54;
               }
            } catch (MatchException var12) {
               throw var12;
            }

            var10000 = var1;
         }

         try {
            if (var10000.length < 2) {
               break label54;
            }
         } catch (MatchException var11) {
            throw var11;
         }

         double var3 = this.baa(Math.max(this.bb, Math.min(this.aaa, var1[0])));
         int var13 = var2;
         double var5 = this.baa(Math.max(this.bb, Math.min(this.aaa, var1[1])));

         label33: {
            try {
               if (var13 != 0) {
                  return;
               }

               if (!(var3 > var5)) {
                  break label33;
               }
            } catch (MatchException var10) {
               throw var10;
            }

            double var7 = var3;
            var3 = var5;
            var5 = var7;
         }

         super.aab(new double[]{var3, var5});
         return;
      }

      try {
         ;
      } catch (MatchException var9) {
         throw var9;
      }
   }

   public double aaba() {
      return this.ba;
   }
}
