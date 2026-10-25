package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class babbbabb {
   private static final String[] aa;
   private static final int ab;
   private static final Object[] abb;
   private static final String[] ba;
   private static final int bb;
   private static final int aaa;
   private static final int aab = 0;
   private static final int[] b;
   private static final int a = 1;
   private static final String[] aba;

   public static boolean aa() {
      int var0 = aabbabbab.ab;

      try {
         if (var0 != 0) {
            return (boolean)ab;
         }

         switch (ab) {
            case 1:
               return bbbabaaa.aba();
            case 2:
               return aaaabbbb.aba();
            case 3:
               return abababb.b();
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return (boolean)0;
   }

   public static boolean b(class_310 param0, class_306 param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ab I
      // 08: iload 4
      // 0a: ifne 21
      // 0d: bipush 1
      // 0e: if_icmpne 1e
      // 11: goto 15
      // 14: athrow
      // 15: aload 0
      // 16: aload 1
      // 17: iload 2
      // 18: iload 3
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbabaaa.bb (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;ZZ)Z
      // 1c: ireturn
      // 1d: athrow
      // 1e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ab I
      // 21: iload 4
      // 23: ifne 6c
      // 26: ifeq 6b
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 1
      // 2e: ifnull 6b
      // 31: goto 35
      // 34: athrow
      // 35: iload 2
      // 36: iload 4
      // 38: ifne 5f
      // 3b: goto 3f
      // 3e: athrow
      // 3f: ifne 57
      // 42: goto 46
      // 45: athrow
      // 46: iload 3
      // 47: iload 4
      // 49: ifne 70
      // 4c: goto 50
      // 4f: athrow
      // 50: ifne 6d
      // 53: goto 57
      // 56: athrow
      // 57: aload 0
      // 58: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aaa (Lnet/minecraft/class_310;)Z
      // 5b: goto 5f
      // 5e: athrow
      // 5f: iload 4
      // 61: ifne 70
      // 64: ifne 6d
      // 67: goto 6b
      // 6a: athrow
      // 6b: bipush 0
      // 6c: ireturn
      // 6d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ab I
      // 70: iload 4
      // 72: ifne 87
      // 75: bipush 2
      // 76: if_icmpne 8a
      // 79: goto 7d
      // 7c: athrow
      // 7d: aload 0
      // 7e: aload 1
      // 7f: iload 2
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.aab (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;Z)Z
      // 83: goto 87
      // 86: athrow
      // 87: goto 90
      // 8a: aload 0
      // 8b: aload 1
      // 8c: iload 2
      // 8d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababb.aaa (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;Z)Z
      // 90: ireturn
      // 91: astore 5
      // 93: aload 5
      // 95: pop
      // 96: bipush 0
      // 97: ireturn
   }

   private static String aba(short var0, int var1, int var2, short var3) {
      int var8 = var2 ^ -425852935;
      char[] var7 = aba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])abb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         abb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 58580;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ var6 ^ switch (var6 % 9) {
            default -> 213;
            case 1 -> 232;
            case 2 -> 36;
            case 3 -> 33;
            case 4 -> 175;
            case 5 -> 142;
            case 6 -> 33;
            case 7 -> 148;
            case 8 -> 196;
         } ^ var5 ^ var3 ^ var2 ^ var1 ^ var0);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   private static int ab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc -998055785
      // 02: istore 1
      // 03: ldc 98388715
      // 05: iload 1
      // 06: ldc -1930776090
      // 08: ixor
      // 09: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // 0c: ldc 98388714
      // 0e: iload 1
      // 0f: ldc -297491284
      // 11: ixor
      // 12: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ba (II)Ljava/lang/String;
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1b: ldc ""
      // 1d: invokestatic java/lang/System.getProperty (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 20: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 23: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 26: astore 0
      // 27: aload 0
      // 28: ldc 98388713
      // 2a: iload 1
      // 2b: ldc 2106643891
      // 2d: ixor
      // 2e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // 31: ldc 98388712
      // 33: iload 1
      // 34: ldc -1535696206
      // 36: ixor
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ba (II)Ljava/lang/String;
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 40: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 43: ifeq 49
      // 46: bipush 1
      // 47: ireturn
      // 48: athrow
      // 49: aload 0
      // 4a: ldc 98388719
      // 4c: iload 1
      // 4d: ldc 1788483932
      // 4f: ixor
      // 50: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // 53: ldc 98388718
      // 55: iload 1
      // 56: ldc 2080906166
      // 58: ixor
      // 59: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // 5c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ba (II)Ljava/lang/String;
      // 5f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 62: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 65: ifne 8b
      // 68: aload 0
      // 69: ldc 98388717
      // 6b: iload 1
      // 6c: ldc 1891893716
      // 6e: ixor
      // 6f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // 72: ldc 98388716
      // 74: iload 1
      // 75: ldc 1447692268
      // 77: ixor
      // 78: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // 7b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ba (II)Ljava/lang/String;
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 81: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 84: ifeq 8e
      // 87: goto 8b
      // 8a: athrow
      // 8b: bipush 2
      // 8c: ireturn
      // 8d: athrow
      // 8e: aload 0
      // 8f: ldc 98388707
      // 91: iload 1
      // 92: ldc 244109264
      // 94: ixor
      // 95: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // 98: ldc 98388706
      // 9a: iload 1
      // 9b: ldc -762474861
      // 9d: ixor
      // 9e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ba (II)Ljava/lang/String;
      // a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // a7: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // aa: ifne f3
      // ad: aload 0
      // ae: ldc 98388705
      // b0: iload 1
      // b1: ldc -1419661819
      // b3: ixor
      // b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // b7: ldc 98388704
      // b9: iload 1
      // ba: ldc -137653504
      // bc: ixor
      // bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // c0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ba (II)Ljava/lang/String;
      // c3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // c6: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // c9: ifne f3
      // cc: goto d0
      // cf: athrow
      // d0: aload 0
      // d1: ldc 98388711
      // d3: iload 1
      // d4: ldc -1085851690
      // d6: ixor
      // d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // da: ldc 98388710
      // dc: iload 1
      // dd: ldc 1858680733
      // df: ixor
      // e0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.aab (II)I
      // e3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ba (II)Ljava/lang/String;
      // e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // e9: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // ec: ifeq f8
      // ef: goto f3
      // f2: athrow
      // f3: bipush 3
      // f4: goto f9
      // f7: athrow
      // f8: bipush 0
      // f9: ireturn
   }

   private static String ba(int var0, int var1) {
      int var9 = 1618429486;
      int var2 = (var0 ^ aab(98388709, var9 ^ 875407945)) & aab(98388708, var9 ^ -511880025);
      if (aa[var2] == null) {
         char[] var3 = ba[var2].toCharArray();

         int var4 = switch (var3[0] & aab(98388731, var9 ^ -1971074712)) {
            case 0 -> aab(98388730, var9 ^ -742051582);
            case 1 -> aab(98388729, var9 ^ 228712534);
            case 2 -> aab(98388728, var9 ^ 272190041);
            case 3 -> aab(98388735, var9 ^ -1785721556);
            case 4 -> aab(98388734, var9 ^ 1236664277);
            case 5 -> aab(98388733, var9 ^ 1254888368);
            case 6 -> aab(98388732, var9 ^ -1858483891);
            case 7 -> aab(98388723, var9 ^ -476786962);
            case 8 -> aab(98388722, var9 ^ -1515921235);
            case 9 -> aab(98388721, var9 ^ -2113090815);
            case 10 -> aab(98388720, var9 ^ -1616432668);
            case 11 -> aab(98388727, var9 ^ 810214627);
            case 12 -> aab(98388726, var9 ^ -917246341);
            case 13 -> aab(98388725, var9 ^ 1456982181);
            case 14 -> aab(98388724, var9 ^ 1220613369);
            case 15 -> aab(98388683, var9 ^ 1362831778);
            case 16 -> aab(98388682, var9 ^ 2019014820);
            case 17 -> aab(98388681, var9 ^ 1469223080);
            case 18 -> aab(98388680, var9 ^ -1881081004);
            case 19 -> aab(98388687, var9 ^ -1836309689);
            case 20 -> aab(98388686, var9 ^ 471175029);
            case 21 -> aab(98388685, var9 ^ 1673040735);
            case 22 -> aab(98388684, var9 ^ 796941762);
            case 23 -> aab(98388675, var9 ^ -518566594);
            case 24 -> aab(98388674, var9 ^ -2025438243);
            case 25 -> aab(98388673, var9 ^ -795668915);
            case 26 -> aab(98388672, var9 ^ -219961680);
            case 27 -> aab(98388679, var9 ^ 1679003398);
            case 28 -> aab(98388678, var9 ^ -711013947);
            case 29 -> aab(98388677, var9 ^ -566166192);
            case 30 -> aab(98388676, var9 ^ 55142990);
            case 31 -> aab(98388699, var9 ^ -2139063432);
            case 32 -> aab(98388698, var9 ^ 1071540942);
            case 33 -> aab(98388697, var9 ^ -1786790088);
            case 34 -> aab(98388696, var9 ^ -943417105);
            case 35 -> aab(98388703, var9 ^ -1148018105);
            case 36 -> aab(98388702, var9 ^ 1536267645);
            case 37 -> aab(98388701, var9 ^ 1587344374);
            case 38 -> aab(98388700, var9 ^ 1812316112);
            case 39 -> aab(98388691, var9 ^ 70226213);
            case 40 -> aab(98388690, var9 ^ 184196493);
            case 41 -> aab(98388689, var9 ^ 64182811);
            case 42 -> aab(98388688, var9 ^ -1583494471);
            case 43 -> aab(98388695, var9 ^ 976636661);
            case 44 -> aab(98388694, var9 ^ 1765211635);
            case 45 -> aab(98388693, var9 ^ -601702325);
            case 46 -> aab(98388692, var9 ^ 433500205);
            case 47 -> aab(98388651, var9 ^ 827285596);
            case 48 -> 3;
            case 49 -> aab(98388650, var9 ^ -1366728567);
            case 50 -> aab(98388649, var9 ^ 322299683);
            case 51 -> aab(98388648, var9 ^ -79456678);
            case 52 -> aab(98388655, var9 ^ -35650153);
            case 53 -> aab(98388654, var9 ^ -502839190);
            case 54 -> aab(98388653, var9 ^ 1498142599);
            case 55 -> aab(98388652, var9 ^ 1833356732);
            case 56 -> aab(98388643, var9 ^ 1030402151);
            case 57 -> aab(98388642, var9 ^ 1304478365);
            case 58 -> aab(98388641, var9 ^ 308039209);
            case 59 -> aab(98388640, var9 ^ 2079386325);
            case 60 -> aab(98388647, var9 ^ 120732911);
            case 61 -> aab(98388646, var9 ^ -1335708545);
            case 62 -> aab(98388645, var9 ^ 1950065855);
            case 63 -> aab(98388644, var9 ^ 1748575797);
            case 64 -> aab(98388667, var9 ^ -443323159);
            case 65 -> aab(98388666, var9 ^ 1121206270);
            case 66 -> aab(98388665, var9 ^ -1048115186);
            case 67 -> aab(98388664, var9 ^ -153160573);
            case 68 -> aab(98388671, var9 ^ 2134048148);
            case 69 -> aab(98388670, var9 ^ -1992081508);
            case 70 -> aab(98388669, var9 ^ -498116266);
            case 71 -> aab(98388668, var9 ^ -650837387);
            case 72 -> aab(98388659, var9 ^ -389512168);
            case 73 -> aab(98388658, var9 ^ 146522022);
            case 74 -> aab(98388657, var9 ^ -1646618624);
            case 75 -> aab(98388656, var9 ^ 1041172760);
            case 76 -> aab(98388663, var9 ^ -1409295819);
            case 77 -> aab(98388662, var9 ^ -1222906510);
            case 78 -> aab(98388661, var9 ^ -1228823562);
            case 79 -> aab(98388660, var9 ^ 153592940);
            case 80 -> aab(98388619, var9 ^ 365650467);
            case 81 -> aab(98388618, var9 ^ 1710481248);
            case 82 -> aab(98388617, var9 ^ -1125440904);
            case 83 -> aab(98388616, var9 ^ -190214382);
            case 84 -> aab(98388623, var9 ^ -1589978126);
            case 85 -> aab(98388622, var9 ^ 1080702426);
            case 86 -> aab(98388621, var9 ^ -659513914);
            case 87 -> aab(98388620, var9 ^ 198119526);
            case 88 -> aab(98388611, var9 ^ 1460235833);
            case 89 -> aab(98388610, var9 ^ 2035448766);
            case 90 -> aab(98388609, var9 ^ -751132984);
            case 91 -> aab(98388608, var9 ^ -583191305);
            case 92 -> aab(98388615, var9 ^ -1493753724);
            case 93 -> aab(98388614, var9 ^ -960995297);
            case 94 -> aab(98388613, var9 ^ 1599888013);
            case 95 -> aab(98388612, var9 ^ 607662549);
            case 96 -> aab(98388635, var9 ^ -306174710);
            case 97 -> aab(98388634, var9 ^ 1733363873);
            case 98 -> aab(98388633, var9 ^ -880169624);
            case 99 -> aab(98388632, var9 ^ 478254560);
            case 100 -> aab(98388639, var9 ^ 2098612963);
            case 101 -> aab(98388638, var9 ^ 970382868);
            case 102 -> aab(98388637, var9 ^ -234204073);
            case 103 -> aab(98388636, var9 ^ 1999662997);
            case 104 -> aab(98388627, var9 ^ 1604083686);
            case 105 -> aab(98388626, var9 ^ -1786109209);
            case 106 -> aab(98388625, var9 ^ -1082747148);
            case 107 -> aab(98388624, var9 ^ -1001925565);
            case 108 -> aab(98388631, var9 ^ 685753436);
            case 109 -> aab(98388630, var9 ^ 2064333008);
            case 110 -> aab(98388629, var9 ^ -190312638);
            case 111 -> aab(98388628, var9 ^ -431348388);
            case 112 -> aab(98388587, var9 ^ 1499152380);
            case 113 -> aab(98388586, var9 ^ -1098292282);
            case 114 -> aab(98388585, var9 ^ -1565794540);
            case 115 -> aab(98388584, var9 ^ -99461688);
            case 116 -> aab(98388591, var9 ^ 1328871868);
            case 117 -> aab(98388590, var9 ^ 1525117727);
            case 118 -> aab(98388589, var9 ^ -123529945);
            case 119 -> aab(98388588, var9 ^ -736277015);
            case 120 -> aab(98388579, var9 ^ -351521870);
            case 121 -> aab(98388578, var9 ^ 2029384971);
            case 122 -> aab(98388577, var9 ^ 1578882656);
            case 123 -> aab(98388576, var9 ^ 274379726);
            case 124 -> aab(98388583, var9 ^ 962359630);
            case 125 -> aab(98388582, var9 ^ 1621245057);
            case 126 -> aab(98388581, var9 ^ -1657030377);
            case 127 -> aab(98388580, var9 ^ -675033233);
            case 128 -> aab(98388603, var9 ^ 1106034579);
            case 129 -> aab(98388602, var9 ^ 1945355500);
            case 130 -> aab(98388601, var9 ^ -943517520);
            case 131 -> aab(98388600, var9 ^ -1304557929);
            case 132 -> aab(98388607, var9 ^ -826060420);
            case 133 -> aab(98388606, var9 ^ -629976175);
            case 134 -> aab(98388605, var9 ^ 514494023);
            case 135 -> aab(98388604, var9 ^ 1819438204);
            case 136 -> aab(98388595, var9 ^ 687147988);
            case 137 -> aab(98388594, var9 ^ 1277744535);
            case 138 -> 5;
            case 139 -> aab(98388593, var9 ^ 463508747);
            case 140 -> aab(98388592, var9 ^ -849540633);
            case 141 -> aab(98388599, var9 ^ 564352110);
            case 142 -> aab(98388598, var9 ^ -1402617196);
            case 143 -> aab(98388597, var9 ^ -1640336547);
            case 144 -> aab(98388596, var9 ^ 1564075906);
            case 145 -> aab(98388555, var9 ^ 1373007699);
            case 146 -> aab(98388554, var9 ^ -1317186968);
            case 147 -> aab(98388553, var9 ^ -588343629);
            case 148 -> aab(98388552, var9 ^ 1119337818);
            case 149 -> aab(98388559, var9 ^ -809469250);
            case 150 -> aab(98388558, var9 ^ 994505634);
            case 151 -> aab(98388557, var9 ^ -1501004679);
            case 152 -> aab(98388556, var9 ^ -227119805);
            case 153 -> 1;
            case 154 -> aab(98388547, var9 ^ 106986177);
            case 155 -> aab(98388546, var9 ^ 2123706021);
            case 156 -> aab(98388545, var9 ^ -115379479);
            case 157 -> aab(98388544, var9 ^ -1868405482);
            case 158 -> aab(98388551, var9 ^ 613152663);
            case 159 -> aab(98388550, var9 ^ 1791409351);
            case 160 -> aab(98388549, var9 ^ -340157788);
            case 161 -> aab(98388548, var9 ^ -1064201167);
            case 162 -> aab(98388571, var9 ^ 1597288588);
            case 163 -> aab(98388570, var9 ^ -684620221);
            case 164 -> aab(98388569, var9 ^ 1675764435);
            case 165 -> aab(98388568, var9 ^ 1368645812);
            case 166 -> aab(98388575, var9 ^ 1068374636);
            case 167 -> aab(98388574, var9 ^ 408065389);
            case 168 -> aab(98388573, var9 ^ -361325627);
            case 169 -> aab(98388572, var9 ^ 358563221);
            case 170 -> aab(98388563, var9 ^ 460744007);
            case 171 -> aab(98388562, var9 ^ -1548417554);
            case 172 -> aab(98388561, var9 ^ 1778562229);
            case 173 -> aab(98388560, var9 ^ -1068902648);
            case 174 -> aab(98388567, var9 ^ -189624445);
            case 175 -> aab(98388566, var9 ^ 1203653018);
            case 176 -> aab(98388565, var9 ^ 1708392132);
            case 177 -> aab(98388564, var9 ^ -1674103704);
            case 178 -> aab(98388523, var9 ^ 1020275202);
            case 179 -> aab(98388522, var9 ^ 1987648693);
            case 180 -> aab(98388521, var9 ^ -947995390);
            case 181 -> aab(98388520, var9 ^ 1764503380);
            case 182 -> aab(98388527, var9 ^ 847642166);
            case 183 -> aab(98388526, var9 ^ -644004983);
            case 184 -> aab(98388525, var9 ^ -906316192);
            case 185 -> aab(98388524, var9 ^ 1390749064);
            case 186 -> aab(98388515, var9 ^ 228223411);
            case 187 -> aab(98388514, var9 ^ 124194842);
            case 188 -> aab(98388513, var9 ^ -417489523);
            case 189 -> aab(98388512, var9 ^ -474780129);
            case 190 -> aab(98388519, var9 ^ 1625233782);
            case 191 -> aab(98388518, var9 ^ 152212940);
            case 192 -> aab(98388517, var9 ^ -1760343846);
            case 193 -> aab(98388516, var9 ^ 1701613976);
            case 194 -> aab(98388539, var9 ^ -19741224);
            case 195 -> aab(98388538, var9 ^ 2013072602);
            case 196 -> aab(98388537, var9 ^ 1449298503);
            case 197 -> aab(98388536, var9 ^ -1650873024);
            case 198 -> 4;
            case 199 -> aab(98388543, var9 ^ -769574434);
            case 200 -> 2;
            case 201 -> aab(98388542, var9 ^ 538903175);
            case 202 -> aab(98388541, var9 ^ 1178120865);
            case 203 -> aab(98388540, var9 ^ 1334537554);
            case 204 -> aab(98388531, var9 ^ -1398162561);
            case 205 -> aab(98388530, var9 ^ 880840457);
            case 206 -> 0;
            case 207 -> aab(98388529, var9 ^ 2117323253);
            case 208 -> aab(98388528, var9 ^ -842932184);
            case 209 -> aab(98388535, var9 ^ 58805661);
            case 210 -> aab(98388534, var9 ^ 1346339044);
            case 211 -> aab(98388533, var9 ^ -1022963079);
            case 212 -> aab(98388532, var9 ^ -1314200970);
            case 213 -> aab(98388491, var9 ^ -1798680436);
            case 214 -> aab(98388490, var9 ^ -1897378751);
            case 215 -> aab(98388489, var9 ^ 1901107208);
            case 216 -> aab(98388488, var9 ^ 994079675);
            case 217 -> aab(98388495, var9 ^ 562082954);
            case 218 -> aab(98388494, var9 ^ 517261834);
            case 219 -> aab(98388493, var9 ^ -658794401);
            case 220 -> aab(98388492, var9 ^ -2000074183);
            case 221 -> aab(98388483, var9 ^ -692396386);
            case 222 -> aab(98388482, var9 ^ 854663617);
            case 223 -> aab(98388481, var9 ^ 308216681);
            case 224 -> aab(98388480, var9 ^ -37575027);
            case 225 -> aab(98388487, var9 ^ 1474499815);
            case 226 -> aab(98388486, var9 ^ 359329616);
            case 227 -> aab(98388485, var9 ^ -931477656);
            case 228 -> aab(98388484, var9 ^ 1873761391);
            case 229 -> aab(98388507, var9 ^ 2125416803);
            case 230 -> aab(98388506, var9 ^ 363572039);
            case 231 -> aab(98388505, var9 ^ -743711760);
            case 232 -> aab(98388504, var9 ^ -2050407705);
            case 233 -> aab(98388511, var9 ^ -1919701482);
            case 234 -> aab(98388510, var9 ^ -2032922618);
            case 235 -> aab(98388509, var9 ^ -2010633430);
            case 236 -> aab(98388508, var9 ^ 241919778);
            case 237 -> aab(98388499, var9 ^ 1637163519);
            case 238 -> aab(98388498, var9 ^ -2135094349);
            case 239 -> aab(98388497, var9 ^ -1046078718);
            case 240 -> aab(98388496, var9 ^ -789028163);
            case 241 -> aab(98388503, var9 ^ -2119426312);
            case 242 -> aab(98388502, var9 ^ -2147376004);
            case 243 -> aab(98388501, var9 ^ -1319330518);
            case 244 -> aab(98388500, var9 ^ -31264405);
            case 245 -> aab(98388971, var9 ^ -2036646647);
            case 246 -> aab(98388970, var9 ^ -1932362047);
            case 247 -> aab(98388969, var9 ^ -1893080972);
            case 248 -> aab(98388968, var9 ^ -1525830787);
            case 249 -> aab(98388975, var9 ^ 695596194);
            case 250 -> aab(98388974, var9 ^ 2035865829);
            case 251 -> aab(98388973, var9 ^ -1875560861);
            case 252 -> aab(98388972, var9 ^ 1218725079);
            case 253 -> aab(98388963, var9 ^ 823099521);
            case 254 -> aab(98388962, var9 ^ 1786963645);
            default -> aab(98388961, var9 ^ -192099248);
         };
         int var5 = (var1 & aab(98388960, var9 ^ -2097752230)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & aab(98388967, var9 ^ 1720119347)) >>> aab(98388966, var9 ^ 788894474)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & aab(98388965, var9 ^ 837676492);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & aab(98388964, var9 ^ 178640575);
            }
         }

         aa[var2] = new String(var3).intern();
      }

      return aa[var2];
   }

   private babbbabb() {
   }

   private static int aab(int var0, int var1) {
      int var2 = b[var0 ^ 98388715] ^ var1 ^ var0;
      var2 -= 47018;
      var2 ^= 19604;
      var2 += 34876;
      var2 += 42202;
      var2 ^= 60873;
      var2 -= 48631;
      return var2 ^ 6771;
   }

   public static void bb() {
      try {
         if (ab == 2) {
            aaaabbbb.ab();
         }
      } catch (MatchException var0) {
         throw var0;
      }
   }

   private static boolean aaa(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 11
      // 09: ifnull 3e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 28
      // 15: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 18: ifnonnull 3e
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: iload 1
      // 21: ifne 33
      // 24: goto 28
      // 27: athrow
      // 28: invokevirtual net/minecraft/class_310.method_1569 ()Z
      // 2b: ifeq 3e
      // 2e: aload 0
      // 2f: goto 33
      // 32: athrow
      // 33: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 36: ifnull 3e
      // 39: bipush 1
      // 3a: goto 3f
      // 3d: athrow
      // 3e: bipush 0
      // 3f: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var31 = 188532761;
      String[] var23 = new String[4];
      short var26 = 21534;
      int var22 = "8겮玪꒮\uf3ab몮ꎫ뷮쮨뗮鎬ꛮᮨ냮让뀮ꎫꕎ莯ꈎ鮯닎뮪ꊎ\ue3aeꠎ厮뷮莫많\ueba8믮㎮룮ﮭ먮\uf3aeꇎ쎮뿎뮨갎쎪걮\ue3ae뙮⮮ꢎ宫뼮环ꮎ뎭눎뮭멮㮫\u0019䥟࿑䵿韒䏟\udfd1夿俔䵿ￗ僿ￗ帿濕䴟濔废쟖䇟迗䍟\u1fd4嫿࿗幟\u0010ॶ閃ᘖ䖇ᮖ趇੶\ue581শ\udd83ึ\udd81ୖ얆ẖք\n鎕핥贵絠鉵鵥艕啥鰵浧"
         .length();
      String var21 = "8겮玪꒮\uf3ab몮ꎫ뷮쮨뗮鎬ꛮᮨ냮让뀮ꎫꕎ莯ꈎ鮯닎뮪ꊎ\ue3aeꠎ厮뷮莫많\ueba8믮㎮룮ﮭ먮\uf3aeꇎ쎮뿎뮨갎쎪걮\ue3ae뙮⮮ꢎ宫뼮环ꮎ뎭눎뮭멮㮫\u0019䥟࿑䵿韒䏟\udfd1夿俔䵿ￗ僿ￗ帿濕䴟濔废쟖䇟迗䍟\u1fd4嫿࿗幟\u0010ॶ閃ᘖ䖇ᮖ趇੶\ue581শ\udd83ึ\udd81ୖ얆ẖք\n鎕핥贵絠鉵鵥艕啥鰵浧";
      int var24 = 0;
      int var25 = 0;

      do {
         char var27 = var21.charAt(var25);
         char[] var10000 = var21.substring(var25 + 1, var25 + 1 + var27).toCharArray();
         int var29 = 0;
         char[] var28 = var10000;

         do {
            char var30 = var28[var29];
            if (var29 % 2 == 0) {
               var28[var29] = (char)((var30 >>> 5 | var30 << 11) & 65535 ^ var26);
            } else {
               var28[var29] = (char)((var30 << 5 | var30 >>> 11) & 65535 ^ var26);
            }
         } while (++var29 < var28.length);

         var23[var24] = new String(var28);
         var24++;
         var25 = var25 + var27 + 1;
      } while (var25 < var22);

      aba = var23;
      abb = new Object[var23.length];
      int var17 = 479737006;
      byte[] var15 = "®ÒC\"3\u00834·_¨'J\u0086Oc%H¢ë\u0085¡Ï´{Rüó$\u008b\u008d»w,´=/ðµs¡\u0089Y\\ÿÕóË\u009b\u009d\u007fÅ ³\u000e\u0088g²àþ\u000e\u0098NI\u0089\fN\rYU\bò«\u008bl$\u0089\u0096ô\u008e\u001d\u0013]É\u0015Ïx;ëÌ\u0001Ð\u007f\u0017ô\r\feY\n×#i$\u007f\u0004Á\b\u009aæ\u0095\n\u0086¶\u0087 =O\u009e*<Ð\u001a\f£Î\fÐÔ×öí\u009eþ\u009a|¢Ñ_QÔ\t-?\u0080\u0014Aà¥\u009aØKGåuPÆV²f\u009bgÚ\u0089\u0018\u0001\u008b\u0087áV^Íåt.bU\u001d!´OSS\nyX\u008d9´\u0085\u0084©Ï\u0006M¿D¹\u0013®\t\u0013²{9A\t[V=_fWÝ\\Q\u0002ØQ7±êÈ|T\u0082âUü\u008c7^h\u0085\u001e\u009e\u0003'P\tP¼û\u008b\u0090\u0010\u0004Æ¶Zï\u0004v\u009f\u001bt\b·\u0082¤þ(D¤\u008c\u0095ø#_\u0082q\u00ad[{-Æ_dÊ\u008b\u009fß\u0086\u0014|\u0014tö³»§tÐË\r\u0006\u0084\u0094\u0091\u008a\u0016ý=.\u009e\u0081ÿÿ\u00056¯w½òögQîôâPc^¨YÄ\u0019þð¸µ3 p\u00130§ùÿ<õ\u000f\u008eü\fd\u0082\u009aµ_øÁ\u0086n\u0005GÖ\u008ev{\u0090\u001b\u0017\\f¸ÂÍ\u008c-2\u001ep1Ö)n0\fg[\u008fêg¬\u0093\u0006¦Uã>\u001c\u0098:&æàrdLÀ'÷\u001a¢Æ§ñ¾^}YY\u008d\u0002ÔìÑÄª£ÿ\u009f¸Wª\b¥ë[ð÷= :äÍ@u¤\u0083Ù\u0091\u009eÕ¢õõýk\ræþá\u009cËXMDn\u0089\u009aLQ\u009cûÛ\u008eÑ¿\u001b\u001a\u000f\u008b8oZñý®±ÙQ\u009b\u008e\u0013GækÆD\u00adîB\u008a\u0010)®\u0012\u0000T\u00029\u0003ËreÌ¿\u009fx\u001e`ß\u0096ü÷8D \u0087Û\u0099äé|ß\u0096\u009dÉù:\u008fÜ*°&~nÖ3RÐ\u0089\u0095mÁ÷\u000bþ86\u0018ØÖ\u0012î\u0096\u0097w\u0011¿\u0091µ\u000e\u0019\u0090\u0007\u007f\u001böz<Q\u000e\u000b¥8Þ\u0084yõ>\u0007ÏA\u000eÓ²4óÅ\u009c·ñj\u0089\\¾\u0097-\u0098gM\u000fê¿¨\"®8Ï`Êå\u00116\u009dmVPK\u0090Êò§n\u0097KÕWùG\u0018÷·\u0083Ûô$«×\u001b«\u009e7°\u0091rZ#UÉÄz~.I\r¾\t½\u008b0\u008aßºG¸t»®7\u0080\u00ad¹ïøXê]\u007fÒ±\u0096\u0016o¡S¢F3\u0002ì\u000bx\u0081mt^\u0018F\\PòÙùs\u0096QüB\u0099å/æV×^#\u0080¹cÙF\u009e\u009fQûl»_L\u0093\u0092þ\u008f\u009d»¡\u0018%xÁ³ìÏp\u0012F\u0084\u0013Gr\u007fLîÁs\u008a\u0099ã\u001e:U\u001aúðñº\u001dénð´Ø/A³yËïáì-´H:¾_P\u0087¯°È\u008dÂÔ(áM\u008bW\u00ad\u0094\u0081ªÓNaÐ^îe~ª2æ\u0012Ú\u001dp ®N\u0011Þ\u008c_ã¡RÂx\u001f\u0001Tñ0ÈãÐ¯N÷\u001bTi³Tìýï¦ÒÆ®Àõq¬ÉF©¾*dx\"²MLYøþ\rçK\f!¡\u0085L\u0089IÖòCæEË\u0016ò7g&@\u0012\u0007\u0094V\b%\u0088]÷\u009d\\·½\u008d°ì§Mp\u0006\u0098\u0019\u000eé¡\u0089£Ë\u000e\u0004\u008b\u0086Pw\u001a\u001f´<å^\u0094\u0092ÇÎ{\u000fb\u0005Ñ.Ð\u0010\u0093§+\u0080N·\u0003xéb\u0097\u0017øb\u008dy\u0093fh-Uf\u001a\u000füûyi\u000b^j\u0092\u0000\u0019ÔÛ\u000eåè\u0006\u0088¦¤\u0012çXâ\u0093\u0006pÈ\u009aGkßÿV5¡í\u0007aÚÇ\u0006ÌgU7\u0091Y8xï5\u009d\u0000Vø\f\n\u001f¼\\\tä%X#Àna¯¸1Ìÿ\u0095\u001dê\u0016øóUÎi\u0081 ·ÂEqìO# rA\tD\u0004;\u0012p\u001fµì\u001e©ÈQ·· (ã\u008ch\u0013\u0091J\biÔ¥ïu\u0019É1\u0015\u0003Ï\u0018ò\u0011èT¤,¸?òàî\t1\u0010_¥åØ]LúÄ\u0096Û\u008dÈÁ\u0086\\-cFp*\u008f\u007fÇ Ø\u0090Þ\u0007½¢&\u00adP\u008fú»\u0004\u0080°ü=Û8\u0086*h\u0001\u0099YRSÅ;+Æ4"
         .getBytes("ISO-8859-1");
      int var16 = var15.length / 4;
      b = new int[var16];
      byte var18 = 0;
      int var19 = 0;

      do {
         int var20 = (var15[var18] & 255) << 24 | (var15[var18 + 1] & 255) << 16 | (var15[var18 + 2] & 255) << 8 | var15[var18 + 3] & 255;
         var20 ^= var17;
         b[var19] = var20;
         var18 += 4;
      } while (++var19 < var16);

      String[] var13 = new String[aab(98388987, var31 ^ -1483856550)];
      int var11 = 0;
      String var10;
      int var12 = (var10 = aba(30356, 388946103, -425852935, (short)-28260)).length();
      int var9 = aab(98388986, var31 ^ 1214855567);
      int var33 = -1;

      label99:
      while (true) {
         String var35 = var10.substring(++var33, var33 + var9);
         int var10001 = -1;

         while (true) {
            char[] var49;
            label94: {
               char[] var38 = var35.toCharArray();
               int var10003 = var38.length;
               int var14 = 0;
               var49 = var38;
               var10001 = var10003;
               char[] var57;
               int var10004;
               if (var10003 <= 1) {
                  var57 = var38;
                  var10004 = var14;
               } else {
                  var49 = var38;
                  var10001 = var10003;
                  if (var10003 <= var14) {
                     break label94;
                  }

                  var57 = var38;
                  var10004 = var14;
               }

               while (true) {
                  var57[var10004] = (char)(var57[var10004] ^ switch (var14 % aab(98388991, var31 ^ 97708198)) {
                     case 0 -> aab(98388990, var31 ^ 1438236267);
                     case 1 -> aab(98388989, var31 ^ 59734619);
                     case 2 -> aab(98388988, var31 ^ -1306285738);
                     case 3 -> aab(98388979, var31 ^ -1328893565);
                     case 4 -> aab(98388978, var31 ^ 2069743276);
                     case 5 -> aab(98388977, var31 ^ 738201773);
                     default -> aab(98388976, var31 ^ -1900003751);
                  });
                  var14++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var57 = var49;
                  } else {
                     if (var10001 <= var14) {
                        break;
                     }

                     var57 = var49;
                     var10004 = var14;
                  }
               }
            }

            String var64 = new String(var49).intern();
            switch (var10001) {
               case 0:
                  var13[var11++] = var64;
                  if ((var33 += var9) >= var12) {
                     ba = var13;
                     aa = new String[aab(98388984, var31 ^ 580828828)];
                     long var1 = 3082744496924750763L;
                     long[] var0 = new long[2];
                     int var4 = 0;
                     String var5;
                     int var6 = (var5 = aba((short)18927, -653856224, -425852933, 16666)).length();
                     byte var3 = 0;

                     do {
                        int var45 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var45, var3).getBytes(aba((short)-3045, 765532397, -425852934, (short)2597));
                        var45 = var4++;
                        long var66 = (
                              (var7[0] & 255L) << aab(98388983, var31 ^ 1660521707)
                                 | (var7[1] & 255L) << aab(98388982, var31 ^ 890671797)
                                 | (var7[2] & 255L) << aab(98388981, var31 ^ 1344563796)
                                 | (var7[3] & 255L) << aab(98388980, var31 ^ -1123438245)
                                 | (var7[4] & 255L) << aab(98388939, var31 ^ -385418197)
                                 | (var7[5] & 255L) << aab(98388938, var31 ^ -799181976)
                                 | (var7[aab(98388937, var31 ^ -940683998)] & 255L) << aab(98388936, var31 ^ -1261166751)
                                 | var7[aab(98388943, var31 ^ -693269874)] & 255L
                           )
                           ^ var1;
                        byte var65 = -1;
                        var0[var45] = var66;
                     } while (var3 < var6);

                     aaa = (int)var0[1];
                     bb = (int)var0[0];
                     ab = ab();
                     return;
                  }

                  var9 = var10.charAt(var33);
                  break;
               default:
                  var13[var11++] = var64;
                  if ((var33 += var9) < var12) {
                     var9 = var10.charAt(var33);
                     continue label99;
                  }

                  var12 = (var10 = aba((short)-10461, 1415146572, -425852936, (short)2926)).length();
                  var9 = aab(98388985, var31 ^ 615995818);
                  var33 = -1;
            }

            var35 = var10.substring(++var33, var33 + var9);
            var10001 = 0;
         }
      }
   }

   public static void a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 0
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ab I
      // 07: iload 0
      // 08: ifne 25
      // 0b: bipush 2
      // 0c: if_icmpne 1e
      // 0f: goto 13
      // 12: athrow
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbbb.aaa ()V
      // 16: iload 0
      // 17: ifeq 30
      // 1a: goto 1e
      // 1d: athrow
      // 1e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbbabb.ab I
      // 21: goto 25
      // 24: athrow
      // 25: bipush 3
      // 26: if_icmpne 30
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abababb.aa ()V
      // 2c: goto 30
      // 2f: athrow
      // 30: return
   }
}
