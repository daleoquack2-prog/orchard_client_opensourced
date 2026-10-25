package nsc;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class baabaab extends baaabbaa {
   private final Class aa;
   private static final Integer[] ab;
   private static final String[] aaa;
   private static final Object[] aab;
   private static final int[] bb;
   private static final long[] ba;

   public void aa(Enum var1) {
      super.aab(this.ba(var1));
   }

   private Enum ba(Enum var1) {
      int var2 = baaabbaa.bba;

      label27: {
         try {
            if (var2 != 0) {
               return var1;
            }

            if (var1 instanceof bbaabba) {
               break label27;
            }
         } catch (NumberFormatException var4) {
            throw var4;
         }

         return var1;
      }

      bbaabba var3 = (bbaabba)var1;
      return var3.ba();
   }

   private boolean bb(Enum var1) {
      int var2 = baaabbaa.bba;

      try {
         boolean var10000 = var1 instanceof bbaabba;
         if (var2 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (NumberFormatException var5) {
         throw var5;
      }

      bbaabba var3 = (bbaabba)var1;

      try {
         boolean var6 = var3.bb();
         if (var2 != 0) {
            return var6;
         }

         if (var6) {
            return true;
         }
      } catch (NumberFormatException var4) {
         throw var4;
      }

      return false;
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 1210456050] ^ var1 ^ var0;
      var2 -= 23998;
      var2 ^= 60443;
      var2 -= 7852;
      var2 ^= 26941;
      var2 -= 34274;
      var2 += 43699;
      var2 -= 57272;
      return var2 - 9858;
   }

   @Override
   public void aab(Object var1) {
      this.aa((Enum)var1);
   }

   @Override
   public void ab(JsonElement var1) {
      int var2 = baaabbaa.bba;

      JsonElement var10000;
      label30: {
         try {
            var10000 = var1;
            if (var2 != 0) {
               break label30;
            }

            if (var1 == null) {
               return;
            }
         } catch (NumberFormatException var5) {
            throw var5;
         }

         var10000 = var1;
      }

      if (var10000.isJsonPrimitive()) {
         Enum var3 = this.b(var1.getAsString());

         try {
            if (var3 != null) {
               this.aa(var3);
            }
         } catch (NumberFormatException var4) {
            throw var4;
         }
      }
   }

   @Override
   public JsonElement aba() {
      return new JsonPrimitive(this.aaa((Enum)this.abbb()));
   }

   public String aaa(Enum param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 13
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.aa Ljava/lang/Class;
      // 08: aload 1
      // 09: invokevirtual java/lang/Class.isInstance (Ljava/lang/Object;)Z
      // 0c: ifne 17
      // 0f: goto 13
      // 12: athrow
      // 13: ldc ""
      // 15: areturn
      // 16: athrow
      // 17: new java/lang/StringBuilder
      // 1a: dup
      // 1b: bipush 4
      // 1c: invokespecial java/lang/StringBuilder.<init> (I)V
      // 1f: ldc 1210456032
      // 21: ldc -1332312560
      // 23: ldc 1736418209
      // 25: ixor
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.a (II)I
      // 29: ldc2_w 3880360952944456598
      // 2c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.baa (IJ)I
      // 2f: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 32: aload 1
      // 33: invokevirtual java/lang/Enum.ordinal ()I
      // 36: ldc 1210456033
      // 38: ldc -1332312560
      // 3a: ldc 656596159
      // 3c: ixor
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.a (II)I
      // 40: ldc2_w 7603973507107083716
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.baa (IJ)I
      // 46: invokestatic java/lang/Integer.toString (II)Ljava/lang/String;
      // 49: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 4c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 4f: areturn
   }

   public baabaab(Object var1, Class var2, Enum var3) {
      super(var1, var3);
      this.aa = var2;
   }

   public baabaab(String var1, Class var2, Enum var3) {
      this((Object)var1, var2, var3);
   }

   private static String bab(int var0, int var1) {
      int var3 = var0 ^ 1159678122;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 512229796;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 108;
            case 1 -> 137;
            case 2 -> 194;
            case 3 -> 88;
            case 4 -> 67;
            case 5 -> 98;
            case 6 -> 88;
            case 7 -> 167;
            case 8 -> 130;
            case 9 -> 46;
            case 10 -> 234;
            case 11 -> 46;
            case 12 -> 208;
            case 13 -> 184;
            case 14 -> 100;
            case 15 -> 197;
            case 16 -> 62;
            case 17 -> 193;
            case 18 -> 213;
            case 19 -> 130;
            case 20 -> 248;
            case 21 -> 36;
            case 22 -> 101;
            case 23 -> 234;
            case 24 -> 57;
            case 25 -> 78;
            case 26 -> 255;
            case 27 -> 226;
            case 28 -> 200;
            case 29 -> 181;
            case 30 -> 73;
            case 31 -> 230;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public void abb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.aa Ljava/lang/Class;
      // 07: invokevirtual java/lang/Class.getEnumConstants ()[Ljava/lang/Object;
      // 0a: checkcast [Ljava/lang/Enum;
      // 0d: astore 2
      // 0e: istore 1
      // 0f: aload 0
      // 10: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 13: checkcast java/lang/Enum
      // 16: invokevirtual java/lang/Enum.ordinal ()I
      // 19: istore 3
      // 1a: bipush 0
      // 1b: istore 4
      // 1d: iload 4
      // 1f: aload 2
      // 20: arraylength
      // 21: if_icmpge 4d
      // 24: iload 3
      // 25: bipush 1
      // 26: iadd
      // 27: aload 2
      // 28: arraylength
      // 29: irem
      // 2a: istore 3
      // 2b: iload 1
      // 2c: ifne 49
      // 2f: aload 0
      // 30: aload 2
      // 31: iload 3
      // 32: aaload
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.bb (Ljava/lang/Enum;)Z
      // 36: ifeq 46
      // 39: goto 3d
      // 3c: athrow
      // 3d: aload 0
      // 3e: aload 2
      // 3f: iload 3
      // 40: aaload
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.aa (Ljava/lang/Enum;)V
      // 44: return
      // 45: athrow
      // 46: iinc 4 1
      // 49: iload 1
      // 4a: ifeq 1d
      // 4d: return
   }

   public Enum b(String param1) {
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
      // 09: ifnull 17
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: invokevirtual java/lang/String.isBlank ()Z
      // 14: ifeq 1a
      // 17: aconst_null
      // 18: areturn
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.aa Ljava/lang/Class;
      // 1e: invokevirtual java/lang/Class.getEnumConstants ()[Ljava/lang/Object;
      // 21: checkcast [Ljava/lang/Enum;
      // 24: astore 3
      // 25: aload 1
      // 26: invokevirtual java/lang/String.length ()I
      // 29: iload 2
      // 2a: ifne 46
      // 2d: bipush 1
      // 2e: if_icmple 91
      // 31: goto 35
      // 34: athrow
      // 35: aload 1
      // 36: bipush 0
      // 37: iload 2
      // 38: ifne 6e
      // 3b: goto 3f
      // 3e: athrow
      // 3f: invokevirtual java/lang/String.charAt (I)C
      // 42: goto 46
      // 45: athrow
      // 46: ldc 1210456038
      // 48: ldc -81537898
      // 4a: ldc -1145621712
      // 4c: ixor
      // 4d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.a (II)I
      // 50: ldc2_w 8073605343563354521
      // 53: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.baa (IJ)I
      // 56: if_icmpne 91
      // 59: aload 1
      // 5a: bipush 1
      // 5b: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 5e: ldc 1210456039
      // 60: ldc -81537898
      // 62: ldc 1523602974
      // 64: ixor
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.a (II)I
      // 68: ldc2_w 3775797371686123893
      // 6b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.baa (IJ)I
      // 6e: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;I)I
      // 71: istore 4
      // 73: iload 4
      // 75: iload 2
      // 76: ifne 82
      // 79: iflt 8c
      // 7c: goto 80
      // 7f: athrow
      // 80: iload 4
      // 82: aload 3
      // 83: arraylength
      // 84: if_icmpge 8c
      // 87: aload 3
      // 88: iload 4
      // 8a: aaload
      // 8b: areturn
      // 8c: goto 91
      // 8f: astore 4
      // 91: aload 3
      // 92: astore 4
      // 94: aload 4
      // 96: arraylength
      // 97: istore 5
      // 99: bipush 0
      // 9a: istore 6
      // 9c: iload 6
      // 9e: iload 5
      // a0: if_icmpge c6
      // a3: aload 4
      // a5: iload 6
      // a7: aaload
      // a8: astore 7
      // aa: iload 2
      // ab: ifne c2
      // ae: aload 7
      // b0: aload 1
      // b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabaabaa.b (Ljava/lang/Enum;Ljava/lang/String;)Z
      // b4: ifeq bf
      // b7: goto bb
      // ba: athrow
      // bb: aload 7
      // bd: areturn
      // be: athrow
      // bf: iinc 6 1
      // c2: iload 2
      // c3: ifeq 9c
      // c6: aconst_null
      // c7: areturn
   }

   static {
      int var24 = -1728151795;
      int var18 = 0;
      String[] var10000 = new String[4];
      short var19 = 12086;
      int var17 = 0;
      String[] var16 = var10000;
      int var15 = "\u0010轮宧霮㮤鱎펦酮ᮢ肎箥膎玢髎殥鍮莤\n䠨\uf215崨訐䏨\uf211䄨툗奨\uda13\u0010ퟋ⫲\udfcb⋵툫䋰\udd4b뫴쬫鋷욋\u1af0\udeabꋴ욋틷\n浳ꓜ硳\udcd9暳ꓘ摳蓞簳賚".length();
      String var14 = "\u0010轮宧霮㮤鱎펦酮ᮢ肎箥膎玢髎殥鍮莤\n䠨\uf215崨訐䏨\uf211䄨툗奨\uda13\u0010ퟋ⫲\udfcb⋵툫䋰\udd4b뫴쬫鋷욋\u1af0\udeabꋴ욋틷\n浳ꓜ硳\udcd9暳ꓘ摳蓞簳賚";

      do {
         int var22 = 0;
         char var20 = var14.charAt(var18);
         char[] var21 = var14.substring(var18 + 1, var18 + 1 + var20).toCharArray();

         do {
            char var23 = var21[var22];
            if (var22 % 2 == 0) {
               var21[var22] = (char)((var23 >>> 5 | var23 << 11) & 65535 ^ var19);
            } else {
               var21[var22] = (char)((var23 << 5 | var23 >>> 11) & 65535 ^ var19);
            }
         } while (++var22 < var21.length);

         var16[var17] = new String(var21);
         var17++;
         var18 = var18 + var20 + 1;
      } while (var18 < var15);

      aaa = var16;
      aab = new Object[var16.length];
      int var10 = 160021077;
      byte[] var8 = "'9Îkv÷ÁóÇµü.Eöá5o\u00ad\u0000^â\u0004Å1ñ\u0013s¾\u009eáAHÞNþè}Q\u0003\u000f5¦\u009e|V\u009fÙ\nMð\"Ï]\u0004úGþõ(Q_Ò\u0019\u009cb¬õ\u00015À4ç\u0096F-¥Ö\u001a7j\u00019I¶à\\\u0085û+w\u0002\u0003"
         .getBytes("ISO-8859-1");
      int var9 = var8.length / 4;
      bb = new int[var9];
      byte var11 = 0;
      int var12 = 0;

      do {
         int var13 = (var8[var11] & 255) << 24 | (var8[var11 + 1] & 255) << 16 | (var8[var11 + 2] & 255) << 8 | var8[var11 + 3] & 255;
         var13 ^= var10;
         bb[var12] = var13;
         var11 += 4;
      } while (++var12 < var9);

      long var0 = 1081930581230569156L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4;
      int var5 = (var4 = bab(1159678122, var24 ^ -9825214)).length();
      byte var2 = 0;

      label55:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         String var27 = var4.substring(var10001, var2);
         var10001 = 1159678123;
         int var10002 = var24 ^ -909222938;
         byte[] var7 = var27.getBytes("ISO-8859-1");
         long[] var28 = var6;
         var10001 = var3++;
         long var34 = (var7[0] & 255L) << a(1210456050, var24 ^ -26692144)
            | (var7[1] & 255L) << a(1210456051, var24 ^ -1348027823)
            | (var7[2] & 255L) << a(1210456048, var24 ^ 518293383)
            | (var7[3] & 255L) << a(1210456049, var24 ^ -1666737499)
            | (var7[4] & 255L) << a(1210456054, var24 ^ -1224967231)
            | (var7[5] & 255L) << a(1210456055, var24 ^ 995475255)
            | (var7[a(1210456052, var24 ^ 675416497)] & 255L) << a(1210456053, var24 ^ 1202731844)
            | var7[a(1210456058, var24 ^ 119506154)] & 255L;
         byte var10003 = -1;

         while (true) {
            long var38 = var34 ^ var0;
            switch (var10003) {
               case 0:
                  var28[var10001] = var38;
                  if (var2 >= var5) {
                     ba = var6;
                     ab = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var28[var10001] = var38;
                  if (var2 < var5) {
                     continue label55;
                  }

                  var5 = (var4 = bab(1159678120, var24 ^ -710073659)).length();
                  var2 = 0;
            }

            int var32 = var2;
            var2 += 8;
            String var29 = var4.substring(var32, var2);
            var32 = 1159678121;
            var10002 = var24 ^ 283405678;
            var7 = var29.getBytes("ISO-8859-1");
            var28 = var6;
            var10001 = var3++;
            var34 = (var7[0] & 255L) << a(1210456059, var24 ^ -1543472963)
               | (var7[1] & 255L) << a(1210456056, var24 ^ -319298091)
               | (var7[2] & 255L) << a(1210456057, var24 ^ -1882283350)
               | (var7[3] & 255L) << a(1210456062, var24 ^ -1801365168)
               | (var7[4] & 255L) << a(1210456063, var24 ^ -2074770991)
               | (var7[5] & 255L) << a(1210456060, var24 ^ 665080412)
               | (var7[a(1210456061, var24 ^ -2038209638)] & 255L) << a(1210456034, var24 ^ -1141010662)
               | var7[a(1210456035, var24 ^ -326021380)] & 255L;
            var10003 = 0;
         }
      }
   }

   private static int baa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1210456036, 1069818279 ^ 1428069800);
      if (ab[var3] == null) {
         ab[var3] = (int)(ba[var3] ^ var1);
      }

      return ab[var3];
   }
}
