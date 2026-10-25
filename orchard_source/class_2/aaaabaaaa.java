package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class aaaabaaaa extends abbaabbaa {
   private final bababa aa;
   private static final String[] ab;
   private static final int ba;
   private static final float bb = 32.0F;
   private static final int aaa;
   private static final long[] aab;
   private static final String[] aba;
   private int abb;
   private static final Integer[] baa;
   private static final float bab = 6.0F;
   private final ababbbba bba;
   private int bbb;
   private static final float aaaa = 75.0F;
   private static final long[] aaab;
   private static final Long[] aaba;
   private static final float aabb = 4.5F;
   private static final String[] baab;
   private static String[] abaa;
   private static final float abab = 8.0F;
   private static final Object[] baba;
   private static final int[] baaa;
   private static final float abba = 7.5F;
   private int abbb;

   private class_1657 aa(class_310 param1) {
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
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba;
      // 08: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbba.abbb ()Ljava/lang/Object;
      // 0b: checkcast java/lang/String
      // 0e: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 11: astore 3
      // 12: aload 3
      // 13: iload 2
      // 14: ifne 2b
      // 17: invokevirtual java/lang/String.isEmpty ()Z
      // 1a: ifeq 24
      // 1d: goto 21
      // 20: athrow
      // 21: aconst_null
      // 22: areturn
      // 23: athrow
      // 24: aload 0
      // 25: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 2b: checkcast java/lang/Double
      // 2e: invokevirtual java/lang/Double.doubleValue ()D
      // 31: aload 0
      // 32: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa;
      // 35: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bababa.abbb ()Ljava/lang/Object;
      // 38: checkcast java/lang/Double
      // 3b: invokevirtual java/lang/Double.doubleValue ()D
      // 3e: dmul
      // 3f: dstore 4
      // 41: aload 1
      // 42: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 45: invokevirtual net/minecraft/class_638.method_18456 ()Ljava/util/List;
      // 48: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4d: astore 6
      // 4f: aload 6
      // 51: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 56: ifeq b9
      // 59: aload 6
      // 5b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 60: checkcast net/minecraft/class_1657
      // 63: astore 7
      // 65: aload 7
      // 67: iload 2
      // 68: ifne 7c
      // 6b: aload 1
      // 6c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 6f: if_acmpne 7a
      // 72: goto 76
      // 75: athrow
      // 76: goto 4f
      // 79: athrow
      // 7a: aload 7
      // 7c: iload 2
      // 7d: ifne 99
      // 80: invokevirtual net/minecraft/class_1657.method_5477 ()Lnet/minecraft/class_2561;
      // 83: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
      // 88: aload 3
      // 89: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 8c: ifne 97
      // 8f: goto 93
      // 92: athrow
      // 93: goto 4f
      // 96: athrow
      // 97: aload 7
      // 99: iload 2
      // 9a: ifne b4
      // 9d: aload 1
      // 9e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a1: invokevirtual net/minecraft/class_1657.method_5858 (Lnet/minecraft/class_1297;)D
      // a4: dload 4
      // a6: dcmpg
      // a7: ifgt b5
      // aa: goto ae
      // ad: athrow
      // ae: aload 7
      // b0: goto b4
      // b3: athrow
      // b4: areturn
      // b5: iload 2
      // b6: ifeq 4f
      // b9: aconst_null
      // ba: areturn
   }

   private static String b(short var0, int var1, int var2) {
      int var3 = var2 ^ 59479;
      char[] var4 = baab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])baba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         baba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 4915;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 25625;
         var10 -= 6067;
         var10 -= 43587;
         var10 ^= 3126;
         var10 += 21863;
         var10 ^= 764;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private float ab(float param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: fload 2
      // 06: fload 1
      // 07: fsub
      // 08: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 0b: fstore 5
      // 0d: fload 5
      // 0f: invokestatic java/lang/Math.abs (F)F
      // 12: iload 4
      // 14: ifne 2b
      // 17: fload 3
      // 18: fcmpg
      // 19: ifgt 23
      // 1c: goto 20
      // 1f: athrow
      // 20: fload 2
      // 21: freturn
      // 22: athrow
      // 23: fload 1
      // 24: fload 3
      // 25: fload 5
      // 27: invokestatic java/lang/Math.copySign (FF)F
      // 2a: fadd
      // 2b: freturn
   }

   @Override
   public void bbaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 2
      // 08: iload 1
      // 09: ifne 43
      // 0c: aload 2
      // 0d: ifnull 3a
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 2c
      // 19: goto 1d
      // 1c: athrow
      // 1d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 20: ifnull 3a
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: goto 2c
      // 2b: athrow
      // 2c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2f: iload 1
      // 30: ifne 49
      // 33: ifnonnull 44
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: bipush 0
      // 3c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.abb I
      // 3f: goto 43
      // 42: athrow
      // 43: return
      // 44: aload 0
      // 45: aload 2
      // 46: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.aa (Lnet/minecraft/class_310;)Lnet/minecraft/class_1657;
      // 49: astore 3
      // 4a: iload 1
      // 4b: ifne 69
      // 4e: aload 3
      // 4f: ifnonnull 6a
      // 52: goto 56
      // 55: athrow
      // 56: aload 0
      // 57: bipush 0
      // 58: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.abb I
      // 5b: aload 0
      // 5c: bipush -1
      // 5d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.abbb I
      // 60: aload 0
      // 61: bipush 0
      // 62: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.bbb I
      // 65: goto 69
      // 68: athrow
      // 69: return
      // 6a: aload 0
      // 6b: iload 1
      // 6c: ifne af
      // 6f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.abbb I
      // 72: aload 3
      // 73: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 76: if_icmpeq 9d
      // 79: goto 7d
      // 7c: athrow
      // 7d: aload 0
      // 7e: aload 3
      // 7f: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 82: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.abbb I
      // 85: aload 0
      // 86: ldc -715986146
      // 88: ldc -1541645232
      // 8a: ldc -907775569
      // 8c: ixor
      // 8d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.a (II)I
      // 90: ldc2_w 2413846638505329691
      // 93: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.bb (IJ)I
      // 96: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.bbb I
      // 99: goto 9d
      // 9c: athrow
      // 9d: aload 0
      // 9e: iload 1
      // 9f: ifne d1
      // a2: aload 2
      // a3: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a6: aload 3
      // a7: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.aba (Lnet/minecraft/class_1657;Lnet/minecraft/class_1657;)V
      // aa: aload 0
      // ab: goto af
      // ae: athrow
      // af: dup
      // b0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.abb I
      // b3: bipush 1
      // b4: iadd
      // b5: dup_x1
      // b6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.abb I
      // b9: ldc -715986145
      // bb: ldc -1541645232
      // bd: ldc -1587371578
      // bf: ixor
      // c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.a (II)I
      // c3: ldc2_w 4425904952552744382
      // c6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.bb (IJ)I
      // c9: if_icmplt dc
      // cc: aload 0
      // cd: goto d1
      // d0: athrow
      // d1: bipush 0
      // d2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.abb I
      // d5: aload 3
      // d6: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // d9: invokevirtual net/minecraft/class_1657.method_6104 (Lnet/minecraft/class_1268;)V
      // dc: return
   }

   private static String ba(int var0, int var1) {
      int var9 = 44247561;
      int var2 = (var0 ^ a(-715986148, var9 ^ -942197783)) & a(-715986147, var9 ^ 861665867);
      if (aba[var2] == null) {
         char[] var3 = ab[var2].toCharArray();

         int var4 = switch (var3[0] & a(-715986150, var9 ^ 1797597189)) {
            case 0 -> a(-715986149, var9 ^ 330396476);
            case 1 -> a(-715986152, var9 ^ -1598545101);
            case 2 -> a(-715986151, var9 ^ -445824164);
            case 3 -> a(-715986154, var9 ^ -1028987407);
            case 4 -> a(-715986153, var9 ^ -823111595);
            case 5 -> a(-715986156, var9 ^ 1803294320);
            case 6 -> a(-715986155, var9 ^ -73958996);
            case 7 -> a(-715986158, var9 ^ 1421195375);
            case 8 -> a(-715986157, var9 ^ 754674878);
            case 9 -> a(-715986160, var9 ^ 2139664017);
            case 10 -> a(-715986159, var9 ^ -2139778061);
            case 11 -> a(-715986162, var9 ^ 458806982);
            case 12 -> a(-715986161, var9 ^ 734148955);
            case 13 -> a(-715986164, var9 ^ 786416343);
            case 14 -> a(-715986163, var9 ^ -1788134870);
            case 15 -> a(-715986166, var9 ^ -938246020);
            case 16 -> a(-715986165, var9 ^ 350386312);
            case 17 -> a(-715986168, var9 ^ -1267427814);
            case 18 -> a(-715986167, var9 ^ -1517520148);
            case 19 -> a(-715986170, var9 ^ -888982888);
            case 20 -> a(-715986169, var9 ^ -1856609646);
            case 21 -> a(-715986172, var9 ^ -1855064273);
            case 22 -> a(-715986171, var9 ^ 8385);
            case 23 -> a(-715986174, var9 ^ 560462813);
            case 24 -> a(-715986173, var9 ^ -815361582);
            case 25 -> a(-715986176, var9 ^ 295381946);
            case 26 -> a(-715986175, var9 ^ 1232310001);
            case 27 -> a(-715986114, var9 ^ 1746612270);
            case 28 -> a(-715986113, var9 ^ 847701084);
            case 29 -> a(-715986116, var9 ^ 79701079);
            case 30 -> a(-715986115, var9 ^ -1652342626);
            case 31 -> a(-715986118, var9 ^ -298988947);
            case 32 -> a(-715986117, var9 ^ 64656533);
            case 33 -> a(-715986120, var9 ^ -108380095);
            case 34 -> a(-715986119, var9 ^ -1890083031);
            case 35 -> a(-715986122, var9 ^ 707945512);
            case 36 -> a(-715986121, var9 ^ -1332785704);
            case 37 -> a(-715986124, var9 ^ 1779158868);
            case 38 -> a(-715986123, var9 ^ 374132021);
            case 39 -> 1;
            case 40 -> a(-715986126, var9 ^ 2061926745);
            case 41 -> a(-715986125, var9 ^ 1911797931);
            case 42 -> a(-715986128, var9 ^ -1236018051);
            case 43 -> a(-715986127, var9 ^ 1998991055);
            case 44 -> a(-715986130, var9 ^ -154355480);
            case 45 -> a(-715986129, var9 ^ -1807500153);
            case 46 -> a(-715986132, var9 ^ 636122382);
            case 47 -> a(-715986131, var9 ^ -1262805211);
            case 48 -> a(-715986134, var9 ^ 1534466811);
            case 49 -> a(-715986133, var9 ^ 614075318);
            case 50 -> a(-715986136, var9 ^ -46357701);
            case 51 -> a(-715986135, var9 ^ -1831449072);
            case 52 -> 2;
            case 53 -> a(-715986138, var9 ^ 1329199284);
            case 54 -> a(-715986137, var9 ^ 1607252079);
            case 55 -> a(-715986140, var9 ^ -550539672);
            case 56 -> a(-715986139, var9 ^ 39958069);
            case 57 -> a(-715986142, var9 ^ -562329978);
            case 58 -> a(-715986141, var9 ^ -1512672084);
            case 59 -> a(-715986144, var9 ^ 1764237617);
            case 60 -> a(-715986143, var9 ^ -1779497237);
            case 61 -> a(-715986082, var9 ^ -1845306594);
            case 62 -> a(-715986081, var9 ^ -1519557767);
            case 63 -> a(-715986084, var9 ^ 1839745933);
            case 64 -> a(-715986083, var9 ^ 1326135150);
            case 65 -> a(-715986086, var9 ^ 1656048739);
            case 66 -> a(-715986085, var9 ^ -1206786378);
            case 67 -> a(-715986088, var9 ^ 308510030);
            case 68 -> a(-715986087, var9 ^ -1122315458);
            case 69 -> a(-715986090, var9 ^ 1926353359);
            case 70 -> a(-715986089, var9 ^ 1533494537);
            case 71 -> a(-715986092, var9 ^ 1582021522);
            case 72 -> a(-715986091, var9 ^ -1276347484);
            case 73 -> a(-715986094, var9 ^ 2068575946);
            case 74 -> a(-715986093, var9 ^ 528041486);
            case 75 -> a(-715986096, var9 ^ 366834690);
            case 76 -> a(-715986095, var9 ^ -1413077003);
            case 77 -> a(-715986098, var9 ^ 2003575167);
            case 78 -> a(-715986097, var9 ^ -1095364167);
            case 79 -> a(-715986100, var9 ^ -1653552411);
            case 80 -> a(-715986099, var9 ^ 1939633155);
            case 81 -> a(-715986102, var9 ^ -345492350);
            case 82 -> a(-715986101, var9 ^ 1121996962);
            case 83 -> a(-715986104, var9 ^ -1721518954);
            case 84 -> a(-715986103, var9 ^ -1230241814);
            case 85 -> a(-715986106, var9 ^ -1195300723);
            case 86 -> a(-715986105, var9 ^ 2099596634);
            case 87 -> a(-715986108, var9 ^ 1498601290);
            case 88 -> a(-715986107, var9 ^ 1492227723);
            case 89 -> a(-715986110, var9 ^ 178509002);
            case 90 -> a(-715986109, var9 ^ -121127309);
            case 91 -> a(-715986112, var9 ^ -1861872832);
            case 92 -> 5;
            case 93 -> a(-715986111, var9 ^ 5363592);
            case 94 -> a(-715986050, var9 ^ -1277808367);
            case 95 -> a(-715986049, var9 ^ -1533265766);
            case 96 -> a(-715986052, var9 ^ 478334919);
            case 97 -> a(-715986051, var9 ^ -949019048);
            case 98 -> a(-715986054, var9 ^ -336309751);
            case 99 -> a(-715986053, var9 ^ 1307698914);
            case 100 -> a(-715986056, var9 ^ 2074660865);
            case 101 -> a(-715986055, var9 ^ -655009451);
            case 102 -> a(-715986058, var9 ^ 1887283136);
            case 103 -> a(-715986057, var9 ^ -691700828);
            case 104 -> a(-715986060, var9 ^ 381508412);
            case 105 -> a(-715986059, var9 ^ -774276560);
            case 106 -> a(-715986062, var9 ^ -1254007322);
            case 107 -> a(-715986061, var9 ^ 547055504);
            case 108 -> a(-715986064, var9 ^ 1811896952);
            case 109 -> a(-715986063, var9 ^ 892581976);
            case 110 -> a(-715986066, var9 ^ 1902053886);
            case 111 -> a(-715986065, var9 ^ 1790729205);
            case 112 -> a(-715986068, var9 ^ -1885005851);
            case 113 -> a(-715986067, var9 ^ 667614397);
            case 114 -> a(-715986070, var9 ^ 1833075757);
            case 115 -> a(-715986069, var9 ^ 750670124);
            case 116 -> a(-715986072, var9 ^ 1847586556);
            case 117 -> a(-715986071, var9 ^ 2050411500);
            case 118 -> a(-715986074, var9 ^ 1724380194);
            case 119 -> a(-715986073, var9 ^ 510380155);
            case 120 -> a(-715986076, var9 ^ -1391564186);
            case 121 -> a(-715986075, var9 ^ 2137210468);
            case 122 -> a(-715986078, var9 ^ 862676408);
            case 123 -> a(-715986077, var9 ^ -1045232363);
            case 124 -> a(-715986080, var9 ^ 785768832);
            case 125 -> a(-715986079, var9 ^ 301356812);
            case 126 -> a(-715986018, var9 ^ 677577372);
            case 127 -> a(-715986017, var9 ^ 1428291807);
            case 128 -> a(-715986020, var9 ^ -1803085843);
            case 129 -> a(-715986019, var9 ^ 10450316);
            case 130 -> a(-715986022, var9 ^ 2069213391);
            case 131 -> a(-715986021, var9 ^ 166619012);
            case 132 -> a(-715986024, var9 ^ -1548983455);
            case 133 -> a(-715986023, var9 ^ 1052784132);
            case 134 -> a(-715986026, var9 ^ 2032058237);
            case 135 -> a(-715986025, var9 ^ 424099403);
            case 136 -> a(-715986028, var9 ^ 1644295234);
            case 137 -> a(-715986027, var9 ^ -1465932982);
            case 138 -> a(-715986030, var9 ^ 63174435);
            case 139 -> a(-715986029, var9 ^ 310007441);
            case 140 -> a(-715986032, var9 ^ -1363313962);
            case 141 -> 4;
            case 142 -> a(-715986031, var9 ^ 357451066);
            case 143 -> a(-715986034, var9 ^ 1591235144);
            case 144 -> a(-715986033, var9 ^ 192643410);
            case 145 -> a(-715986036, var9 ^ -52463578);
            case 146 -> a(-715986035, var9 ^ -1992553941);
            case 147 -> a(-715986038, var9 ^ 667779065);
            case 148 -> a(-715986037, var9 ^ -912235226);
            case 149 -> a(-715986040, var9 ^ 88958418);
            case 150 -> a(-715986039, var9 ^ -1072077524);
            case 151 -> a(-715986042, var9 ^ -1255751017);
            case 152 -> a(-715986041, var9 ^ -126779393);
            case 153 -> a(-715986044, var9 ^ -60108189);
            case 154 -> a(-715986043, var9 ^ -1184222857);
            case 155 -> a(-715986046, var9 ^ 2125442228);
            case 156 -> a(-715986045, var9 ^ 2137465382);
            case 157 -> a(-715986048, var9 ^ -412602517);
            case 158 -> a(-715986047, var9 ^ 1011338600);
            case 159 -> a(-715985986, var9 ^ 1281551664);
            case 160 -> a(-715985985, var9 ^ 1665901932);
            case 161 -> a(-715985988, var9 ^ 609669505);
            case 162 -> a(-715985987, var9 ^ 1330942167);
            case 163 -> a(-715985990, var9 ^ -352787370);
            case 164 -> a(-715985989, var9 ^ 2129418019);
            case 165 -> a(-715985992, var9 ^ 406009755);
            case 166 -> a(-715985991, var9 ^ 563494424);
            case 167 -> a(-715985994, var9 ^ 627766277);
            case 168 -> a(-715985993, var9 ^ 2086478891);
            case 169 -> a(-715985996, var9 ^ -925564841);
            case 170 -> a(-715985995, var9 ^ 1513439155);
            case 171 -> a(-715985998, var9 ^ 1019313490);
            case 172 -> a(-715985997, var9 ^ 1864632960);
            case 173 -> a(-715986000, var9 ^ 299070512);
            case 174 -> a(-715985999, var9 ^ -204202684);
            case 175 -> a(-715986002, var9 ^ -120493068);
            case 176 -> a(-715986001, var9 ^ -991849729);
            case 177 -> a(-715986004, var9 ^ 89080995);
            case 178 -> a(-715986003, var9 ^ 183679589);
            case 179 -> a(-715986006, var9 ^ 1941133777);
            case 180 -> a(-715986005, var9 ^ -1571791010);
            case 181 -> a(-715986008, var9 ^ -1255057635);
            case 182 -> a(-715986007, var9 ^ 125277407);
            case 183 -> a(-715986010, var9 ^ 1950018408);
            case 184 -> a(-715986009, var9 ^ -1060488003);
            case 185 -> 0;
            case 186 -> a(-715986012, var9 ^ 1466926143);
            case 187 -> a(-715986011, var9 ^ -416760478);
            case 188 -> a(-715986014, var9 ^ 255586842);
            case 189 -> a(-715986013, var9 ^ -938408385);
            case 190 -> a(-715986016, var9 ^ -104238071);
            case 191 -> a(-715986015, var9 ^ -1883880225);
            case 192 -> a(-715985954, var9 ^ -1552929783);
            case 193 -> a(-715985953, var9 ^ -544280102);
            case 194 -> a(-715985956, var9 ^ 1347312138);
            case 195 -> a(-715985955, var9 ^ -1431729615);
            case 196 -> a(-715985958, var9 ^ 686561141);
            case 197 -> a(-715985957, var9 ^ -797600513);
            case 198 -> 3;
            case 199 -> a(-715985960, var9 ^ -1607097301);
            case 200 -> a(-715985959, var9 ^ -1406466008);
            case 201 -> a(-715985962, var9 ^ -587904139);
            case 202 -> a(-715985961, var9 ^ -7694835);
            case 203 -> a(-715985964, var9 ^ -1233539285);
            case 204 -> a(-715985963, var9 ^ -1840499825);
            case 205 -> a(-715985966, var9 ^ 777814975);
            case 206 -> a(-715985965, var9 ^ -1152331645);
            case 207 -> a(-715985968, var9 ^ -153008357);
            case 208 -> a(-715985967, var9 ^ -526247104);
            case 209 -> a(-715985970, var9 ^ -1780059809);
            case 210 -> a(-715985969, var9 ^ 127611279);
            case 211 -> a(-715985972, var9 ^ -639376102);
            case 212 -> a(-715985971, var9 ^ -933093561);
            case 213 -> a(-715985974, var9 ^ -101665707);
            case 214 -> a(-715985973, var9 ^ -2093000690);
            case 215 -> a(-715985976, var9 ^ 1418733679);
            case 216 -> a(-715985975, var9 ^ 1455987111);
            case 217 -> a(-715985978, var9 ^ -1906303786);
            case 218 -> a(-715985977, var9 ^ 1488498342);
            case 219 -> a(-715985980, var9 ^ 746156794);
            case 220 -> a(-715985979, var9 ^ -963583060);
            case 221 -> a(-715985982, var9 ^ 496228103);
            case 222 -> a(-715985981, var9 ^ 2055487573);
            case 223 -> a(-715985984, var9 ^ -1306957649);
            case 224 -> a(-715985983, var9 ^ -857294243);
            case 225 -> a(-715985922, var9 ^ -483399174);
            case 226 -> a(-715985921, var9 ^ -1442500148);
            case 227 -> a(-715985924, var9 ^ 951780159);
            case 228 -> a(-715985923, var9 ^ -217028254);
            case 229 -> a(-715985926, var9 ^ -62973073);
            case 230 -> a(-715985925, var9 ^ 1813220785);
            case 231 -> a(-715985928, var9 ^ -364300126);
            case 232 -> a(-715985927, var9 ^ -209123568);
            case 233 -> a(-715985930, var9 ^ 1610939852);
            case 234 -> a(-715985929, var9 ^ 1457531760);
            case 235 -> a(-715985932, var9 ^ -150106716);
            case 236 -> a(-715985931, var9 ^ -755678250);
            case 237 -> a(-715985934, var9 ^ -1233389272);
            case 238 -> a(-715985933, var9 ^ -1191072266);
            case 239 -> a(-715985936, var9 ^ -1289900049);
            case 240 -> a(-715985935, var9 ^ -1221932974);
            case 241 -> a(-715985938, var9 ^ -1788709696);
            case 242 -> a(-715985937, var9 ^ -779722881);
            case 243 -> a(-715985940, var9 ^ 1594614290);
            case 244 -> a(-715985939, var9 ^ 865029008);
            case 245 -> a(-715985942, var9 ^ -1873607791);
            case 246 -> a(-715985941, var9 ^ -1147664942);
            case 247 -> a(-715985944, var9 ^ 1561093315);
            case 248 -> a(-715985943, var9 ^ -1579862740);
            case 249 -> a(-715985946, var9 ^ 1520040143);
            case 250 -> a(-715985945, var9 ^ 1776564791);
            case 251 -> a(-715985948, var9 ^ 1246021347);
            case 252 -> a(-715985947, var9 ^ -1660573775);
            case 253 -> a(-715985950, var9 ^ 2067867436);
            case 254 -> a(-715985949, var9 ^ -1652309186);
            default -> a(-715985952, var9 ^ 1980270927);
         };
         int var5 = (var1 & a(-715985951, var9 ^ -1526912578)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-715986402, var9 ^ 2007818389)) >>> a(-715986401, var9 ^ 500612344)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-715986404, var9 ^ 1701615719);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-715986403, var9 ^ 138492492);
            }
         }

         aba[var2] = new String(var3).intern();
      }

      return aba[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var34 = 886126522;
      char[] var25 = "^\u0019X\n\u0010\n \n\u0010\n".toCharArray();
      String var24 = "溘䷕鷭쁙ώ퍰쵩嗊\ue7eb徎㥊㊘嚤稈Φ‖黦互ᆤ\ue071㹿邱㳖\ue3f3캟訃\uda7a臑\ud86d祾곛㣚鼚鷞퐈튓⛻䎔곯녜\ue590좱ᑽ惤럇\ue5ab됏䞂뱨⠝組⟿⮟뭤䲋砉؊謐\ude44\\ᖣ硻\ued1e虧鞃㏧㸩툂⋐讃랬奕뫁롢蠫幜ᴦ\ue4a4\ue8f4░쪴鯄帪\uf6b4ᣕᴦ辸ܷኒ\u0de1\udfda퉘꿵ꥯ쾢⧺殊裋챲宭ꖻ\uf042_困\udd5a玛\ue7c4趂藔ꤑ唍桃㔧ⲇ杽ո箻ꍹ錋옞욂짴왊즨짹옴쥉쥤쥏왎짫욬줍줵왜쥥쥉웟웠짓왎옶욈웮옆즎즐줂쥚즾옹옋줓왷쥶직옍즽워욍욍왾웨줲즪짓즉줮웜즹왕옢쥣욮즱옽증쥝왢즵짰짿욓즀짢짰왢욄웨욍짣옲월줚욂짋짖쥏줕즺쥲왡즩증쥿즼즹༇ມ༻ຌ\u0e83\u0e72\u0e83แຌ\u0e7e聴聺肭膄膼胊聢胐肴肄腇膔胏臛耦胰ོི\u0f48㓇ཐྡ㐈ྚ㓇㓥綠\uf8e1爛\uf80c\uf803讀撚\uf8e0痢領諾\uf866\uf89a\uf812僚寧聾\uf86d痢\uf841\uf8e4稜累\uf863醴\uf8bf\uf8dc\uf8ff\uf85b\uf819\uf877\uf86f梦检梒栕栺棋桪棠栕梟괊괰괕궙굦곅곘걆궘궻곒굌굏걌겎괼ՐՖլ\u05ebׄԵԴն\u05ebי";
      byte var30 = -1;
      short var23 = 24240;
      String[] var26 = new String[var25.length];

      while (true) {
         int var27 = 0;
         char var28 = 0;
         char var29 = '\u0000';
         if (var30 == 0) {
            baab = var26;
            baba = new Object[var26.length];
            byte var40 = 0;
            baaa = new int[340];
            int var10001 = 0;
            byte[] var10002 = ">T\u0003ÛVÒ²\u0011\u0096Ø&ybUU|:*¸5B¾Ý\u0012ñ·\u008d\u001f´bíÝ\u0093¥K`\u009fÿß¤:s¸øª\u0098×Í\u0005º\u00160}ôãh.\u0087>©Ñz=NJWY%zÍ\u0097g\u007fÐlnÄd\u0094y\u0099\u001c.lEíÖçå{\u0019êô\u0083õ:\u009a\f½gÀYí]ÀbY,Q\u000f\u008eyphUé\u009ei??@\u0094¤u\u0018|\u001eÚ9\u0014\u009e\u009ac\u0089J\u0004UÏ\u008a\bÌ\u008cîÔ¿\"dÞRÕ:Ã¨\u0085Ï³ÞX\u0010Î{=ëòá\u0080ã\u0081;\u0004@\u00adGCc¯+é/\u0015 ü\u0016Ýç\\S¿&)\u0080\u008c§Ã\u0016æÅL3ItåÛ$å´±Y\ny´\u0082u\u0095¥Á¬3\rlÃÙàf\u001e6wS\u000eÃ\u0016Y\u008e À}Sn9Ö\u008ft('ôÙä¦8'®ïÄà¨\u0091Ã\ru<ôbÍ\u008e<§Ä\u0016\u001e\u0004\u0099p3ºâYé\u001ei\u0012ClÓ\u0013ì\u0015}i#Þ\u007f\u0086\nhëÁ\u000fD\u0015Mâãô2*DX\u008aNvÉ¹DÒû\u0081úÉ\u00892&c\u008fxï¹¿cÌ\u007fd£\"\u0093Ú\u0014ºg\u009a¡\u0013ïþ\u0093Èl\u001aåç¤Q·éÎ\u0086¸,*ãu\b]y[\tþ8U[¬zÜ©È\u0010bÀ\t½=Q^yAâÙ¾¹õ\u0093·4M\u008d@F\u0096`°dºûü_\u001cþH/*§~ã\u0089úÖÖ!r\t\u0086\u0087Êô\u0018G²õù\u0080ÖÔjäNóÓq\u0094É@:ðôXd<\u00161 P§Ô;³ÔFÞª¹\u0006vÅs,<M*\u000f}±ÿ+?\u0010@Ú+9e.7ÈZ]OdX7ü\u0001ú,.l\u0090\u0012bdË£\u0090¼«É\u007fÚOè@ùùiyl¬\u009c\u0004-\u008f°Å\u0088\u0098\u0085Q\u0090Ûi*Z\u001e$XáÉ¦ò£ÍToÏ\u0098Û(\u0011\u0011[HH±\u00153\u000eZìù\u0090\rFRÌxhCuøwÿ²ÔþDAÊL\u000f×üàZt/_\u00adÐÖ\u0010Ø3¤ÝvÂÑý\u0098¯Ë\u0016TBËA\u0091\u0016Ë\u009aä)l{©~ð\u008f\u00ade|Uèe\u009fÌ/ \u0002z.h\u008cî¶g ;mHci\u001dmC£2D\u000bñuY^Æ\u001e[>j»÷Jq/ãù¡I<¸ñp\u0099\u0090\u000bteZê-R«\\\u0099Ú®\u009e\u000b:\u0091ºmÎÓq>+¤\u000f@ÜÚ\u008f¢Û³\u001d©ÞÅß\u0095î<RT@ê\u009b[ý\u0014l\"¼÷öó_ñ\u0083ä>ù\u0091Vx\u001b®%5E¾\u0091Å\u0092\u0006\u0006`*£¶'21^4\\î\u0099\u001e¨w¨ÆÚ\u008eÞ¹êLò\u007f\u0082Q\u008e\u0081_\u0092\u0001Aô³û¦$çyã¹\u001b\u0081z:4ñ:\näý$¦Ò\u008dúÄR®\u00858\u009açv\u0001ZÃC\u009d\r\u007fS-Êê_~g§îéÝ±\u00ad\u0094rÄéß/V\u0094\u009fó\u0088ìK\u0094\u0099m±¯¨ÿ\u001a\u0092Ò0ö®\u0005\u009f\u0086&\u0007Ç7êßo²ù\t·\u0000\u007f}vÜf\u0097\u009fl\u009aL\u009cX'+\u008bî\u001aã\u0016Æ\r\u009dé5s² G%û\n¾Öi´\u00adÀ¢\u001fÇÂ\u00ad0µ;=\u001c#W»F\u0096ø¢\u0086©ü1\u000bSª\u0007ï¤Z¦\u0002\u0002\u009e\u0083úí/çtWmè\u000e\u0003jâ\u0012\u0001Pæ%GoÄmÚH\u0080\u0089ñ\u0099\u000e\u0004m$b\u0080å7Á\\\u008c¹ê\u0097«X\f\u0003ëÞðÚ\u009bl\u000b\u0096wí8ë\u0094C\u001bKIçÌ\n\tU*N¨\u0015Ì\u008cm7'\u0007'=õò¹u&¢N¡LÙ\u0013J4c\tQYN«{/\u0018KÚDÝDhð\u0092ï\u001b¡¤m@zù>¡ËüÒ#\u0087FpWûX\u009dTÆ`T£}é\u008fzú\u0081ô¾¼6þ|1u¥\u009cÃxv\u0092&\u009dê\u0006X¯¤c\u0017\u008f©é¢i°\u0011\u0099jÄ¼Õ\u0017(\u00ad\u0088à\bø\fbÑXÑX©¢A\u0017í\u009d\u0011\u008d¿\\Û¬eÆi«#)k'Äÿ\u008b¶\u001fõVt4M 6\u0082\r*Ô³f\u00ad\u0098DÇC\u001f\u0090(×ïY¯\u0099þ~4¾\u0013\u007f«V\u0097\u009e\u001eåù\u001aÓ\t§ô[Q¨\u008d=`~~+\u0083\u00017»\u00ad\u0003\u001fóm²5UÜ÷\u000e\u0091ñ\u0087Äý\u000f\u0090Lþ\r×\u0019¢\u0017f\u009e\u0084e\u008al\u009f\u0081\u0093É\u0016HQßºàN\u008fzÆ\u001fp1üÚ{X\u001dª\u009b{o\u0015¿^Ö+íÚ\r\tL\u008b\u0000î\u0092\u0092\u0007\u0083·4\u0001\u001e¹^\u009e%Û\\óÞPÐ+\u001erÀÂ\u001fÆõ\u0005âè&\u009a\u0003Ë*\t\u0087Ïv\u008b\u0097%Ü\u0080µÀ¬³J\u000f\u0011\u000b\u0092,\u0010Ó+gk\u0083VTIÊ\u009eê¡+\u0089J\u0002¤\u009aºú\u0095W\u0002 "
               .getBytes("ISO-8859-1");

            int var99;
            do {
               baaa[var40] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -2030272804;
               var40 += 1;
               var99 = var10001 + 4;
               var10001 += 4;
            } while (var99 < var10002.length);

            String[] var21 = new String[5];
            int var19 = 0;
            String var18;
            int var20 = (var18 = b((short)'퉕', var34 ^ -1403383122, 59479)).length();
            int var17 = a(-715986431, var34 ^ 207255092);
            int var38 = -1;

            label139:
            while (true) {
               String var41 = var18.substring(++var38, var38 + var17);
               var10001 = (byte)-1;

               while (true) {
                  label134: {
                     char[] var53 = var41.toCharArray();
                     var99 = var53.length;
                     int var22 = 0;
                     var78 = var53;
                     var10001 = var99;
                     char[] var103;
                     int var125;
                     if (var99 <= 1) {
                        var103 = var53;
                        var125 = var22;
                     } else {
                        var78 = var53;
                        var10001 = var99;
                        if (var99 <= var22) {
                           break label134;
                        }

                        var103 = var53;
                        var125 = var22;
                     }

                     while (true) {
                        var103[var125] = (char)(var103[var125] ^ switch (var22 % a(-715986369, var34 ^ 822707811)) {
                           case 0 -> a(-715986372, var34 ^ -951373579);
                           case 1 -> a(-715986371, var34 ^ 1302921595);
                           case 2 -> a(-715986374, var34 ^ -890898898);
                           case 3 -> a(-715986373, var34 ^ 610411065);
                           case 4 -> a(-715986376, var34 ^ -1332548766);
                           case 5 -> a(-715986375, var34 ^ -24916989);
                           default -> a(-715986378, var34 ^ -647049835);
                        });
                        var22++;
                        if (var10001 == 0) {
                           var125 = var10001;
                           var103 = var78;
                        } else {
                           if (var10001 <= var22) {
                              break;
                           }

                           var103 = var78;
                           var125 = var22;
                        }
                     }
                  }

                  String var110 = new String(var78).intern();
                  switch (var10001) {
                     case 0:
                        var21[var19++] = var110;
                        if ((var38 += var17) >= var20) {
                           ab = var21;
                           aba = new String[5];
                           long var8 = 8469852769923464561L;
                           long[] var14 = new long[a(-715986377, var34 ^ 837430306)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = b((short)11715, var34 ^ -422969064, 59477)).length();
                           byte var10 = 0;

                           label113:
                           while (true) {
                              int var60 = var10;
                              var10 += 8;
                              String var43 = var12.substring(var60, var10);
                              int var61 = 60870;
                              int var84 = var34 ^ -114490972;
                              char var111 = '\ue854';
                              byte[] var15 = var43.getBytes("ISO-8859-1");
                              long[] var44 = var14;
                              var60 = var11++;
                              long var85 = (var15[0] & 255L) << a(-715986380, var34 ^ -2105235255)
                                 | (var15[1] & 255L) << a(-715986379, var34 ^ 1859798616)
                                 | (var15[2] & 255L) << a(-715986382, var34 ^ 919945009)
                                 | (var15[3] & 255L) << a(-715986381, var34 ^ 117689374)
                                 | (var15[4] & 255L) << a(-715986384, var34 ^ -461601403)
                                 | (var15[5] & 255L) << a(-715986383, var34 ^ -897667628)
                                 | (var15[a(-715986386, var34 ^ 181372779)] & 255L) << a(-715986385, var34 ^ -1148535648)
                                 | var15[a(-715986388, var34 ^ -1761970496)] & 255L;
                              byte var112 = -1;

                              while (true) {
                                 long var127 = var85 ^ var8;
                                 switch (var112) {
                                    case 0:
                                       var44[var60] = var127;
                                       if (var10 >= var13) {
                                          aab = var14;
                                          baa = new Integer[a(-715986398, var34 ^ 2060921170)];
                                          aaa = bb(a(-715986397, var34 ^ 141067235), 4944039244100030474L);
                                          ba = bb(a(-715986400, var34 ^ -1319730060), 8763232546089047315L);
                                          long var0 = 3180622618722000131L;
                                          long[] var6 = new long[a(-715986399, var34 ^ 1786052282)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = b((short)'\uf2b5', var34 ^ 681382328, 59473)).length();
                                          byte var2 = 0;

                                          label103:
                                          while (true) {
                                             short var65 = var2;
                                             var2 += 8;
                                             String var46 = var4.substring(var65, var2);
                                             var65 = 20818;
                                             int var88 = var34 ^ 1000093236;
                                             var111 = '\ue850';
                                             byte[] var7 = var46.getBytes("ISO-8859-1");
                                             long[] var47 = var6;
                                             var61 = var3++;
                                             long var89 = (var7[0] & 255L) << a(-715986338, var34 ^ 1737695458)
                                                | (var7[1] & 255L) << a(-715986337, var34 ^ 1627260253)
                                                | (var7[2] & 255L) << a(-715986340, var34 ^ 1717766972)
                                                | (var7[3] & 255L) << a(-715986339, var34 ^ -111646457)
                                                | (var7[4] & 255L) << a(-715986342, var34 ^ -1801198972)
                                                | (var7[5] & 255L) << a(-715986341, var34 ^ 1281605773)
                                                | (var7[a(-715986344, var34 ^ -1520274243)] & 255L) << a(-715986343, var34 ^ 1654610529)
                                                | var7[a(-715986346, var34 ^ -42043027)] & 255L;
                                             byte var116 = -1;

                                             while (true) {
                                                var127 = var89 ^ var0;
                                                switch (var116) {
                                                   case 0:
                                                      var47[var61] = var127;
                                                      if (var2 >= var5) {
                                                         aaab = var6;
                                                         aaba = new Long[a(-715986356, var34 ^ -1008269146)];
                                                         abaa = new String[bb(a(-715986355, var34 ^ -232118921), 4415687708961951738L)];
                                                         abb();
                                                         return;
                                                      }
                                                      break;
                                                   default:
                                                      var47[var61] = var127;
                                                      if (var2 < var5) {
                                                         continue label103;
                                                      }

                                                      var5 = (var4 = b((short)30016, var34 ^ -620076842, 59487)).length();
                                                      var2 = 0;
                                                }

                                                short var68 = var2;
                                                var2 += 8;
                                                String var48 = var4.substring(var68, var2);
                                                var68 = 322;
                                                int var91 = var34 ^ 124137694;
                                                var111 = '\ue85e';
                                                var7 = var48.getBytes("ISO-8859-1");
                                                var47 = var6;
                                                var61 = var3++;
                                                var89 = (var7[0] & 255L) << a(-715986345, var34 ^ 1861909775)
                                                   | (var7[1] & 255L) << a(-715986348, var34 ^ -320170050)
                                                   | (var7[2] & 255L) << a(-715986347, var34 ^ -406293817)
                                                   | (var7[3] & 255L) << a(-715986350, var34 ^ -734544571)
                                                   | (var7[4] & 255L) << a(-715986349, var34 ^ 1827642957)
                                                   | (var7[5] & 255L) << a(-715986352, var34 ^ -1269377747)
                                                   | (var7[a(-715986351, var34 ^ -466885112)] & 255L) << a(-715986354, var34 ^ -1377609487)
                                                   | var7[a(-715986353, var34 ^ 1291122780)] & 255L;
                                                var116 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var44[var60] = var127;
                                       if (var10 < var13) {
                                          continue label113;
                                       }

                                       var13 = (var12 = b((short)'ﱁ', var34 ^ 1585531910, 59475)).length();
                                       var10 = 0;
                                 }

                                 short var63 = var10;
                                 var10 += 8;
                                 String var45 = var12.substring(var63, var10);
                                 var63 = 7473;
                                 int var87 = var34 ^ 145839899;
                                 var111 = '\ue852';
                                 var15 = var45.getBytes("ISO-8859-1");
                                 var44 = var14;
                                 var60 = var11++;
                                 var85 = (var15[0] & 255L) << a(-715986387, var34 ^ 1760427773)
                                    | (var15[1] & 255L) << a(-715986390, var34 ^ 1789569982)
                                    | (var15[2] & 255L) << a(-715986389, var34 ^ 1880829073)
                                    | (var15[3] & 255L) << a(-715986392, var34 ^ 49798833)
                                    | (var15[4] & 255L) << a(-715986391, var34 ^ -420578511)
                                    | (var15[5] & 255L) << a(-715986394, var34 ^ 791440778)
                                    | (var15[a(-715986393, var34 ^ -2026685107)] & 255L) << a(-715986396, var34 ^ -1587363317)
                                    | var15[a(-715986395, var34 ^ -1683502740)] & 255L;
                                 var112 = 0;
                              }
                           }
                        }

                        var17 = var18.charAt(var38);
                        break;
                     default:
                        var21[var19++] = var110;
                        if ((var38 += var17) < var20) {
                           var17 = var18.charAt(var38);
                           continue label139;
                        }

                        var20 = (var18 = b((short)22638, var34 ^ 2034973400, 59478)).length();
                        var17 = a(-715986370, var34 ^ -322196011);
                        var38 = -1;
                  }

                  var41 = var18.substring(++var38, var38 + var17);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var29 = var25[var27];
            char[] var31 = var24.substring(var28, var28 + var29).toCharArray();
            int var32 = 0;

            do {
               short var33 = switch (var32 % 5) {
                  default -> 182;
                  case 1 -> 182;
                  case 2 -> 128;
                  case 3 -> 97;
                  case 4 -> 71;
               };
               var31[var32] = (char)(var31[var32] ^ var33 ^ var23);
            } while (++var32 < var31.length);

            var26[var27] = new String(var31).intern();
            var28 += var29;
         } while (++var27 < var25.length);

         var30 = 0;
      }
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-715986406, -1383083635 ^ -784613013);
      if (baa[var3] == null) {
         baa[var3] = (int)(aab[var3] ^ var1);
      }

      return baa[var3];
   }

   private static int a(int var0, int var1) {
      int var2 = baaa[var0 ^ -715986146] ^ var1 ^ var0;
      var2 -= 45307;
      var2 ^= 12342;
      var2 -= 46881;
      var2 -= 36867;
      var2 -= 53413;
      var2 += 11015;
      var2 += 11953;
      var2 += 28689;
      var2 ^= 30478;
      return var2 - 30013;
   }

   public aaaabaaaa() {
      super(
         aabbaaaba.aaab(abaa[2]),
         bbaabbba.bab,
         aabbaaaba.aaab(abaa[4])
      );
      this.bba = (ababbbba)this.abbbaaa(
         new ababbbba(aabbaaaba.aaab(abaa[3]), abaa[5])
      );
      this.aa = (bababa)this.abbbaaa(
         new bababa(aabbaaaba.aaab(abaa[1]), 8.0, 1.0, 64.0, 0.5)
            .bb(aabbaaaba.abba(abaa[0]))
      );
      this.abbb = -1;
   }

   private static String aaa(char[] var0, long var1, int var3) {
      int var4 = bb(a(-715986405, -1034296041 ^ -718739827), 3728098790146580293L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & bb(a(-715986408, -1034296041 ^ 1634159419), 2565414218236763663L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static long aab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-715986407, -1471369363 ^ 1514500194)) & a(-715986410, -1471369363 ^ -2129029639);
      if (aaba[var3] == null) {
         aaba[var3] = aaab[var3] ^ var1;
      }

      return aaba[var3];
   }

   private void aba(class_1657 param1, class_1657 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: invokevirtual net/minecraft/class_1657.method_33571 ()Lnet/minecraft/class_243;
      // 004: astore 4
      // 006: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 009: aload 1
      // 00a: invokevirtual net/minecraft/class_1657.method_33571 ()Lnet/minecraft/class_243;
      // 00d: astore 5
      // 00f: istore 3
      // 010: aload 5
      // 012: getfield net/minecraft/class_243.field_1352 D
      // 015: aload 4
      // 017: getfield net/minecraft/class_243.field_1352 D
      // 01a: dsub
      // 01b: dstore 6
      // 01d: iload 3
      // 01e: aload 5
      // 020: getfield net/minecraft/class_243.field_1351 D
      // 023: aload 4
      // 025: getfield net/minecraft/class_243.field_1351 D
      // 028: dsub
      // 029: dstore 8
      // 02b: aload 5
      // 02d: getfield net/minecraft/class_243.field_1350 D
      // 030: aload 4
      // 032: getfield net/minecraft/class_243.field_1350 D
      // 035: dsub
      // 036: dstore 10
      // 038: dload 6
      // 03a: dload 6
      // 03c: dmul
      // 03d: dload 10
      // 03f: dload 10
      // 041: dmul
      // 042: dadd
      // 043: invokestatic java/lang/Math.sqrt (D)D
      // 046: dstore 12
      // 048: dload 10
      // 04a: dload 6
      // 04c: invokestatic net/minecraft/class_3532.method_15349 (DD)D
      // 04f: ldc2_w 57.2957763671875
      // 052: dmul
      // 053: d2f
      // 054: ldc_w 90.0
      // 057: fsub
      // 058: fstore 14
      // 05a: dload 8
      // 05c: dload 12
      // 05e: invokestatic net/minecraft/class_3532.method_15349 (DD)D
      // 061: ldc2_w 57.2957763671875
      // 064: dmul
      // 065: dneg
      // 066: d2f
      // 067: fstore 15
      // 069: ifne 085
      // 06c: aload 0
      // 06d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.bbb I
      // 070: ifle 086
      // 073: goto 077
      // 076: athrow
      // 077: aload 0
      // 078: dup
      // 079: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.bbb I
      // 07c: bipush 1
      // 07d: isub
      // 07e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.bbb I
      // 081: goto 085
      // 084: athrow
      // 085: return
      // 086: aload 2
      // 087: getfield net/minecraft/class_1657.field_6283 F
      // 08a: fstore 16
      // 08c: fload 14
      // 08e: fload 16
      // 090: fsub
      // 091: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 094: ldc_w -75.0
      // 097: ldc 75.0
      // 099: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 09c: fstore 17
      // 09e: fload 16
      // 0a0: fload 17
      // 0a2: fadd
      // 0a3: fstore 18
      // 0a5: aload 0
      // 0a6: aload 2
      // 0a7: getfield net/minecraft/class_1657.field_6241 F
      // 0aa: fload 18
      // 0ac: ldc 8.0
      // 0ae: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.ab (FFF)F
      // 0b1: fstore 19
      // 0b3: fload 16
      // 0b5: fstore 20
      // 0b7: fload 19
      // 0b9: fload 20
      // 0bb: fsub
      // 0bc: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 0bf: fstore 21
      // 0c1: fload 21
      // 0c3: invokestatic java/lang/Math.abs (F)F
      // 0c6: iload 3
      // 0c7: ifne 0ef
      // 0ca: ldc 32.0
      // 0cc: fcmpl
      // 0cd: ifle 0ea
      // 0d0: goto 0d4
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: fload 20
      // 0d7: fload 14
      // 0d9: ldc 4.5
      // 0db: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.ab (FFF)F
      // 0de: fstore 20
      // 0e0: fload 19
      // 0e2: fload 20
      // 0e4: fsub
      // 0e5: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 0e8: fstore 21
      // 0ea: fload 21
      // 0ec: invokestatic java/lang/Math.abs (F)F
      // 0ef: iload 3
      // 0f0: ifne 12c
      // 0f3: ldc 75.0
      // 0f5: fcmpl
      // 0f6: ifle 11f
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: fload 19
      // 0ff: ldc 75.0
      // 101: fload 21
      // 103: invokestatic java/lang/Math.copySign (FF)F
      // 106: fsub
      // 107: fstore 22
      // 109: aload 0
      // 10a: fload 20
      // 10c: fload 22
      // 10e: ldc 7.5
      // 110: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.ab (FFF)F
      // 113: fstore 20
      // 115: fload 19
      // 117: fload 20
      // 119: fsub
      // 11a: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 11d: fstore 21
      // 11f: fload 21
      // 121: iload 3
      // 122: ifne 14a
      // 125: invokestatic java/lang/Math.abs (F)F
      // 128: goto 12c
      // 12b: athrow
      // 12c: ldc 75.0
      // 12e: fcmpl
      // 12f: ifle 13e
      // 132: fload 20
      // 134: ldc 75.0
      // 136: fload 21
      // 138: invokestatic java/lang/Math.copySign (FF)F
      // 13b: fadd
      // 13c: fstore 19
      // 13e: aload 0
      // 13f: aload 2
      // 140: invokevirtual net/minecraft/class_1657.method_36455 ()F
      // 143: fload 15
      // 145: ldc 6.0
      // 147: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaaa.ab (FFF)F
      // 14a: fstore 22
      // 14c: aload 2
      // 14d: fload 20
      // 14f: invokevirtual net/minecraft/class_1657.method_36456 (F)V
      // 152: aload 2
      // 153: fload 20
      // 155: putfield net/minecraft/class_1657.field_6283 F
      // 158: aload 2
      // 159: fload 19
      // 15b: putfield net/minecraft/class_1657.field_6241 F
      // 15e: aload 2
      // 15f: fload 22
      // 161: invokevirtual net/minecraft/class_1657.method_36457 (F)V
      // 164: return
   }

   private static void abb() {
      int var0 = -514860711;
      abaa[0] = aaa(
         ba(a(-715986409, var0 ^ 2032088553), a(-715986412, var0 ^ 900015392)).toCharArray(),
         aab(a(-715986411, var0 ^ 1236994302), 4423840224725550004L),
         bb(a(-715986414, var0 ^ 1954799448), 9215115197743204751L)
      );
      abaa[1] = aaa(
         ba(a(-715986413, var0 ^ -821401433), a(-715986416, var0 ^ 1214417927)).toCharArray(),
         aab(a(-715986415, var0 ^ 248850411), 1185548438188423049L),
         bb(a(-715986418, var0 ^ -2087320111), 3012174655662356030L)
      );
      abaa[2] = aaa(
         ba(a(-715986417, var0 ^ 1906020693), a(-715986420, var0 ^ -1803651764)).toCharArray(),
         aab(a(-715986419, var0 ^ -364052751), 8967350998665462421L),
         bb(a(-715986422, var0 ^ -1519647717), 8637514650798953468L)
      );
      abaa[3] = aaa(
         ba(a(-715986421, var0 ^ 277501893), a(-715986424, var0 ^ 730422414)).toCharArray(),
         aab(a(-715986423, var0 ^ 1744104793), 7170037041819021937L),
         bb(a(-715986426, var0 ^ 973234532), 8435395256619183697L)
      );
      abaa[4] = aaa(
         ba(a(-715986425, var0 ^ -1098828157), a(-715986428, var0 ^ 1673244599)).toCharArray(),
         aab(a(-715986427, var0 ^ -202082806), 7551952523437814175L),
         bb(a(-715986430, var0 ^ -1553022254), 8570813757036831344L)
      );
      abaa[5] = aaa("".toCharArray(), aab(a(-715986429, var0 ^ 1766834298), 1686469984940446641L), bb(a(-715986432, var0 ^ -616031893), 467886929739597880L));
   }
}
