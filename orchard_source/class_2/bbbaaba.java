package nsc;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.Context;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_8710;
import net.minecraft.class_9139;
import net.minecraft.class_8710.class_9154;

@Environment(EnvType.CLIENT)
public final class bbbaaba extends abbaabbaa {
   private static final Object[] baaab;
   private ababaaabb ba;
   private static final long aaa;
   private static final ConcurrentMap aab;
   private static final ababbbbaa aba;
   private static final ababbbbaa abb;
   static final byte baa = 0;
   private static final ababbbbaa bab;
   private byte[] bba;
   private static final int[] abbbb;
   private static final String[] bbb;
   static final byte bb;
   private static final long[] aaaa;
   private static volatile Field aaab;
   private static final long aaba;
   private static volatile Boolean aabb;
   private static final ThreadLocal abaa;
   static final byte abab = 1;
   private static final long[] abba;
   private final abbaaaaa abbb;
   private final abbaaaaa baaa;
   private long baab;
   private static volatile Boolean baba;
   static final byte aa;
   private static final ababbbbaa babb;
   private static final ababbbbaa bbaa;
   private boolean bbab;
   private static final ababbbbaa bbba;
   private static final Long[] bbbb;
   private static final Set aaaaa;
   private final abbaaaaa aaaab;
   private static final ababbbbaa aaaba;
   private static final ababbbbaa aaabb;
   private static final Set aabaa;
   static final byte ab;
   private final baabaab aabab;
   private static final ababbbbaa aabba;
   private static final Integer[] aabbb;
   private static final ababbbbaa abaaa;
   static final byte abaab = 1;
   static final byte ababa;
   private static final ababbbbaa ababb;
   private static final String[] abbaa;
   private static final ababbbbaa abbab;
   private static volatile Constructor abbba;
   private static final String[] baaaa;

   public static String aa(byte[] param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc 1551007269
      // 02: istore 7
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 07: istore 1
      // 08: aload 0
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 19
      // 10: goto 14
      // 13: athrow
      // 14: aload 0
      // 15: arraylength
      // 16: ifne 35
      // 19: ldc -110129848
      // 1b: iload 7
      // 1d: ldc -2139415539
      // 1f: ixor
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 23: ldc -110129847
      // 25: iload 7
      // 27: ldc 1981256925
      // 29: ixor
      // 2a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 33: areturn
      // 34: athrow
      // 35: new java/lang/StringBuilder
      // 38: dup
      // 39: aload 0
      // 3a: arraylength
      // 3b: bipush 3
      // 3c: imul
      // 3d: invokespecial java/lang/StringBuilder.<init> (I)V
      // 40: astore 2
      // 41: aload 0
      // 42: astore 3
      // 43: aload 3
      // 44: arraylength
      // 45: istore 4
      // 47: bipush 0
      // 48: istore 5
      // 4a: iload 5
      // 4c: iload 4
      // 4e: if_icmpge f0
      // 51: aload 3
      // 52: iload 5
      // 54: baload
      // 55: istore 6
      // 57: iload 1
      // 58: ifne ec
      // 5b: aload 2
      // 5c: iload 1
      // 5d: ifne f1
      // 60: goto 64
      // 63: athrow
      // 64: invokevirtual java/lang/StringBuilder.length ()I
      // 67: ifle 91
      // 6a: goto 6e
      // 6d: athrow
      // 6e: aload 2
      // 6f: ldc -110129846
      // 71: iload 7
      // 73: ldc 1093391266
      // 75: ixor
      // 76: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 79: ldc -110129845
      // 7b: iload 7
      // 7d: ldc 893646735
      // 7f: ixor
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 83: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 86: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 89: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8c: pop
      // 8d: goto 91
      // 90: athrow
      // 91: aload 2
      // 92: iload 6
      // 94: bipush 4
      // 95: ishr
      // 96: ldc -110129844
      // 98: iload 7
      // 9a: ldc -1626174157
      // 9c: ixor
      // 9d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // a0: ldc2_w 5159898826254650056
      // a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // a6: iand
      // a7: ldc -110129843
      // a9: iload 7
      // ab: ldc -758052438
      // ad: ixor
      // ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // b1: ldc2_w 2232179179270769098
      // b4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // b7: invokestatic java/lang/Character.forDigit (II)C
      // ba: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // bd: pop
      // be: aload 2
      // bf: iload 6
      // c1: ldc -110129842
      // c3: iload 7
      // c5: ldc -915905977
      // c7: ixor
      // c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // cb: ldc2_w 839816596628020565
      // ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // d1: iand
      // d2: ldc -110129841
      // d4: iload 7
      // d6: ldc -378742338
      // d8: ixor
      // d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // dc: ldc2_w 2682352533816358388
      // df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // e2: invokestatic java/lang/Character.forDigit (II)C
      // e5: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // e8: pop
      // e9: iinc 5 1
      // ec: iload 1
      // ed: ifeq 4a
      // f0: aload 2
      // f1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // f4: areturn
   }

   public static void ab(String param0, byte[] param1, class_310 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc 103283941
      // 02: istore 8
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 07: ldc -110129856
      // 09: iload 8
      // 0b: ldc 1291646643
      // 0d: ixor
      // 0e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 11: ldc -110129855
      // 13: iload 8
      // 15: ldc 874701467
      // 17: ixor
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 1e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 21: aload 0
      // 22: ldc -110129854
      // 24: iload 8
      // 26: ldc -399700623
      // 28: ixor
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 2c: ldc -110129853
      // 2e: iload 8
      // 30: ldc -180383542
      // 32: ixor
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 39: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 3c: aload 1
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aa ([B)Ljava/lang/String;
      // 40: astore 7
      // 42: astore 6
      // 44: astore 5
      // 46: astore 4
      // 48: new java/lang/StringBuilder
      // 4b: dup
      // 4c: invokespecial java/lang/StringBuilder.<init> ()V
      // 4f: aload 4
      // 51: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 54: aload 5
      // 56: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 59: aload 6
      // 5b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 5e: aload 7
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 63: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 66: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 69: istore 3
      // 6a: aload 0
      // 6b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.a (Ljava/lang/String;)Z
      // 6e: iload 3
      // 6f: ifne 86
      // 72: ifne 7a
      // 75: goto 79
      // 78: athrow
      // 79: return
      // 7a: aload 1
      // 7b: iload 3
      // 7c: ifne cb
      // 7f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baab ([B)Z
      // 82: goto 86
      // 85: athrow
      // 86: ifeq ca
      // 89: aload 0
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaba ()[B
      // 8d: aload 2
      // 8e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baaab (Ljava/lang/String;[BLnet/minecraft/class_310;)Z
      // 91: pop
      // 92: ldc -110129852
      // 94: iload 8
      // 96: ldc -106105043
      // 98: ixor
      // 99: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 9c: ldc -110129851
      // 9e: iload 8
      // a0: ldc 14031626
      // a2: ixor
      // a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // ac: aload 0
      // ad: astore 6
      // af: astore 5
      // b1: new java/lang/StringBuilder
      // b4: dup
      // b5: invokespecial java/lang/StringBuilder.<init> ()V
      // b8: aload 5
      // ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // bd: aload 6
      // bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // c2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // c5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // c8: return
      // c9: athrow
      // ca: aload 1
      // cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babb ([B)Z
      // ce: iload 3
      // cf: ifne f9
      // d2: ifeq fa
      // d5: goto d9
      // d8: athrow
      // d9: aload 0
      // da: aload 1
      // db: bipush 1
      // dc: baload
      // dd: ldc -110129850
      // df: iload 8
      // e1: ldc -252153893
      // e3: ixor
      // e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // e7: ldc2_w 2506837414679983424
      // ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // ed: iand
      // ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbbb (I)[B
      // f1: aload 2
      // f2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baaab (Ljava/lang/String;[BLnet/minecraft/class_310;)Z
      // f5: goto f9
      // f8: athrow
      // f9: pop
      // fa: return
   }

   private static String ba(int var0, int var1) {
      int var9 = -794165140;
      int var2 = (var0 ^ bbaba(-110129849, var9 ^ -892706462)) & bbaba(-110129832, var9 ^ 1946160312);
      if (abbaa[var2] == null) {
         char[] var3 = bbb[var2].toCharArray();

         int var4 = switch (var3[0] & bbaba(-110129831, var9 ^ -1184459415)) {
            case 0 -> bbaba(-110129830, var9 ^ 2108607968);
            case 1 -> bbaba(-110129829, var9 ^ -1314859138);
            case 2 -> bbaba(-110129828, var9 ^ -179301642);
            case 3 -> bbaba(-110129827, var9 ^ 278146437);
            case 4 -> bbaba(-110129826, var9 ^ -1903087218);
            case 5 -> bbaba(-110129825, var9 ^ -739919604);
            case 6 -> bbaba(-110129840, var9 ^ -1815868393);
            case 7 -> bbaba(-110129839, var9 ^ -507422764);
            case 8 -> bbaba(-110129838, var9 ^ -393261753);
            case 9 -> bbaba(-110129837, var9 ^ -791317602);
            case 10 -> bbaba(-110129836, var9 ^ -844178970);
            case 11 -> bbaba(-110129835, var9 ^ 140707580);
            case 12 -> bbaba(-110129834, var9 ^ 1984297264);
            case 13 -> bbaba(-110129833, var9 ^ 1780934314);
            case 14 -> bbaba(-110129816, var9 ^ -2096959047);
            case 15 -> bbaba(-110129815, var9 ^ 1626393212);
            case 16 -> bbaba(-110129814, var9 ^ 1210014842);
            case 17 -> bbaba(-110129813, var9 ^ -1892634474);
            case 18 -> bbaba(-110129812, var9 ^ -1368425565);
            case 19 -> bbaba(-110129811, var9 ^ -896430330);
            case 20 -> bbaba(-110129810, var9 ^ 1949808402);
            case 21 -> bbaba(-110129809, var9 ^ 408344393);
            case 22 -> bbaba(-110129824, var9 ^ 878693054);
            case 23 -> bbaba(-110129823, var9 ^ 1396404644);
            case 24 -> bbaba(-110129822, var9 ^ -405889037);
            case 25 -> bbaba(-110129821, var9 ^ -2059276988);
            case 26 -> bbaba(-110129820, var9 ^ 2091968366);
            case 27 -> bbaba(-110129819, var9 ^ 366162040);
            case 28 -> bbaba(-110129818, var9 ^ -143155170);
            case 29 -> bbaba(-110129817, var9 ^ 1604943992);
            case 30 -> bbaba(-110129800, var9 ^ -1427685677);
            case 31 -> bbaba(-110129799, var9 ^ -1544020661);
            case 32 -> bbaba(-110129798, var9 ^ 1786885904);
            case 33 -> bbaba(-110129797, var9 ^ -432384118);
            case 34 -> bbaba(-110129796, var9 ^ 1407635122);
            case 35 -> bbaba(-110129795, var9 ^ -578368098);
            case 36 -> bbaba(-110129794, var9 ^ -358212003);
            case 37 -> bbaba(-110129793, var9 ^ -403875757);
            case 38 -> bbaba(-110129808, var9 ^ 1008303402);
            case 39 -> bbaba(-110129807, var9 ^ -594292347);
            case 40 -> bbaba(-110129806, var9 ^ 1647446436);
            case 41 -> bbaba(-110129805, var9 ^ 1924540936);
            case 42 -> bbaba(-110129804, var9 ^ 1854139325);
            case 43 -> bbaba(-110129803, var9 ^ -1741324065);
            case 44 -> bbaba(-110129802, var9 ^ 533664077);
            case 45 -> bbaba(-110129801, var9 ^ -1921841859);
            case 46 -> bbaba(-110129912, var9 ^ -851599921);
            case 47 -> bbaba(-110129911, var9 ^ 871042790);
            case 48 -> bbaba(-110129910, var9 ^ -1715224301);
            case 49 -> bbaba(-110129909, var9 ^ -78175250);
            case 50 -> bbaba(-110129908, var9 ^ 257780480);
            case 51 -> bbaba(-110129907, var9 ^ 642773580);
            case 52 -> bbaba(-110129906, var9 ^ -1245248605);
            case 53 -> bbaba(-110129905, var9 ^ 697783984);
            case 54 -> bbaba(-110129920, var9 ^ -2023470024);
            case 55 -> bbaba(-110129919, var9 ^ 1957779088);
            case 56 -> bbaba(-110129918, var9 ^ -1447926646);
            case 57 -> bbaba(-110129917, var9 ^ 170945471);
            case 58 -> bbaba(-110129916, var9 ^ -528658380);
            case 59 -> bbaba(-110129915, var9 ^ 1286720788);
            case 60 -> bbaba(-110129914, var9 ^ 1024456428);
            case 61 -> bbaba(-110129913, var9 ^ -1447523839);
            case 62 -> bbaba(-110129896, var9 ^ -1873877509);
            case 63 -> bbaba(-110129895, var9 ^ -1737673781);
            case 64 -> bbaba(-110129894, var9 ^ 941774676);
            case 65 -> bbaba(-110129893, var9 ^ -1615290147);
            case 66 -> bbaba(-110129892, var9 ^ 1925159599);
            case 67 -> bbaba(-110129891, var9 ^ -2087500842);
            case 68 -> bbaba(-110129890, var9 ^ 1180566598);
            case 69 -> 0;
            case 70 -> bbaba(-110129889, var9 ^ -960413683);
            case 71 -> bbaba(-110129904, var9 ^ 1156709534);
            case 72 -> bbaba(-110129903, var9 ^ 2031892016);
            case 73 -> bbaba(-110129902, var9 ^ 537584018);
            case 74 -> bbaba(-110129901, var9 ^ 857174730);
            case 75 -> bbaba(-110129900, var9 ^ 1772988133);
            case 76 -> bbaba(-110129899, var9 ^ 340428559);
            case 77 -> bbaba(-110129898, var9 ^ 1558155666);
            case 78 -> bbaba(-110129897, var9 ^ -1801348305);
            case 79 -> bbaba(-110129880, var9 ^ 1746892741);
            case 80 -> 2;
            case 81 -> bbaba(-110129879, var9 ^ 2096538522);
            case 82 -> bbaba(-110129878, var9 ^ -460453389);
            case 83 -> bbaba(-110129877, var9 ^ -787713222);
            case 84 -> bbaba(-110129876, var9 ^ 529828579);
            case 85 -> bbaba(-110129875, var9 ^ -928395143);
            case 86 -> bbaba(-110129874, var9 ^ -763257139);
            case 87 -> bbaba(-110129873, var9 ^ -761638994);
            case 88 -> bbaba(-110129888, var9 ^ -1277873175);
            case 89 -> bbaba(-110129887, var9 ^ -693615249);
            case 90 -> bbaba(-110129886, var9 ^ -1749152658);
            case 91 -> bbaba(-110129885, var9 ^ -2000391516);
            case 92 -> bbaba(-110129884, var9 ^ -547854094);
            case 93 -> bbaba(-110129883, var9 ^ -902578905);
            case 94 -> bbaba(-110129882, var9 ^ 749289185);
            case 95 -> bbaba(-110129881, var9 ^ -505372818);
            case 96 -> bbaba(-110129864, var9 ^ 1051314878);
            case 97 -> bbaba(-110129863, var9 ^ -459650522);
            case 98 -> bbaba(-110129862, var9 ^ 798124987);
            case 99 -> bbaba(-110129861, var9 ^ -98552418);
            case 100 -> bbaba(-110129860, var9 ^ 872670154);
            case 101 -> bbaba(-110129859, var9 ^ -1413639540);
            case 102 -> bbaba(-110129858, var9 ^ -824814654);
            case 103 -> bbaba(-110129857, var9 ^ 1436388188);
            case 104 -> bbaba(-110129872, var9 ^ -857130637);
            case 105 -> bbaba(-110129871, var9 ^ -581487762);
            case 106 -> bbaba(-110129870, var9 ^ 1472064541);
            case 107 -> bbaba(-110129869, var9 ^ -423636142);
            case 108 -> bbaba(-110129868, var9 ^ 1084931614);
            case 109 -> bbaba(-110129867, var9 ^ -794983504);
            case 110 -> bbaba(-110129866, var9 ^ -551349945);
            case 111 -> bbaba(-110129865, var9 ^ -257844929);
            case 112 -> bbaba(-110129720, var9 ^ -529145857);
            case 113 -> bbaba(-110129719, var9 ^ 653845);
            case 114 -> bbaba(-110129718, var9 ^ 356358552);
            case 115 -> bbaba(-110129717, var9 ^ -24234078);
            case 116 -> bbaba(-110129716, var9 ^ -2121060979);
            case 117 -> bbaba(-110129715, var9 ^ -661324812);
            case 118 -> bbaba(-110129714, var9 ^ 1988759597);
            case 119 -> bbaba(-110129713, var9 ^ 2102849103);
            case 120 -> bbaba(-110129728, var9 ^ 435293360);
            case 121 -> bbaba(-110129727, var9 ^ -1012111439);
            case 122 -> bbaba(-110129726, var9 ^ 2111729761);
            case 123 -> bbaba(-110129725, var9 ^ 2022497555);
            case 124 -> bbaba(-110129724, var9 ^ 1235484278);
            case 125 -> bbaba(-110129723, var9 ^ -125134748);
            case 126 -> bbaba(-110129722, var9 ^ -2094131305);
            case 127 -> bbaba(-110129721, var9 ^ -1350200211);
            case 128 -> bbaba(-110129704, var9 ^ -1195755570);
            case 129 -> bbaba(-110129703, var9 ^ -525616682);
            case 130 -> bbaba(-110129702, var9 ^ -1729060764);
            case 131 -> bbaba(-110129701, var9 ^ -414835686);
            case 132 -> bbaba(-110129700, var9 ^ 1175449701);
            case 133 -> bbaba(-110129699, var9 ^ -529945894);
            case 134 -> bbaba(-110129698, var9 ^ 914687592);
            case 135 -> bbaba(-110129697, var9 ^ -1794259394);
            case 136 -> bbaba(-110129712, var9 ^ -1152108381);
            case 137 -> bbaba(-110129711, var9 ^ 1383104893);
            case 138 -> bbaba(-110129710, var9 ^ -1530930634);
            case 139 -> bbaba(-110129709, var9 ^ -1047369121);
            case 140 -> bbaba(-110129708, var9 ^ -1596030621);
            case 141 -> bbaba(-110129707, var9 ^ 577558132);
            case 142 -> bbaba(-110129706, var9 ^ 349347433);
            case 143 -> bbaba(-110129705, var9 ^ -2013946684);
            case 144 -> 1;
            case 145 -> bbaba(-110129688, var9 ^ 546516346);
            case 146 -> bbaba(-110129687, var9 ^ -1391467977);
            case 147 -> bbaba(-110129686, var9 ^ -949119074);
            case 148 -> bbaba(-110129685, var9 ^ 744940140);
            case 149 -> bbaba(-110129684, var9 ^ -1594801921);
            case 150 -> bbaba(-110129683, var9 ^ 1573871049);
            case 151 -> bbaba(-110129682, var9 ^ 1564391877);
            case 152 -> bbaba(-110129681, var9 ^ -1141618134);
            case 153 -> bbaba(-110129696, var9 ^ 915347073);
            case 154 -> bbaba(-110129695, var9 ^ 1727419248);
            case 155 -> bbaba(-110129694, var9 ^ -726128925);
            case 156 -> bbaba(-110129693, var9 ^ 1516972358);
            case 157 -> bbaba(-110129692, var9 ^ -1342779489);
            case 158 -> bbaba(-110129691, var9 ^ 396939544);
            case 159 -> bbaba(-110129690, var9 ^ 2101623159);
            case 160 -> bbaba(-110129689, var9 ^ -2087571255);
            case 161 -> bbaba(-110129672, var9 ^ 331463016);
            case 162 -> bbaba(-110129671, var9 ^ -139572597);
            case 163 -> bbaba(-110129670, var9 ^ -1485589318);
            case 164 -> 3;
            case 165 -> bbaba(-110129669, var9 ^ -1180868830);
            case 166 -> bbaba(-110129668, var9 ^ 1523608219);
            case 167 -> bbaba(-110129667, var9 ^ 521863227);
            case 168 -> bbaba(-110129666, var9 ^ 1375135632);
            case 169 -> bbaba(-110129665, var9 ^ -1531404284);
            case 170 -> bbaba(-110129680, var9 ^ 553149646);
            case 171 -> bbaba(-110129679, var9 ^ 1882132415);
            case 172 -> bbaba(-110129678, var9 ^ 1891855920);
            case 173 -> bbaba(-110129677, var9 ^ 1867488897);
            case 174 -> bbaba(-110129676, var9 ^ -353010314);
            case 175 -> bbaba(-110129675, var9 ^ 1401208123);
            case 176 -> bbaba(-110129674, var9 ^ 665184355);
            case 177 -> bbaba(-110129673, var9 ^ 368866455);
            case 178 -> bbaba(-110129784, var9 ^ -1528846456);
            case 179 -> bbaba(-110129783, var9 ^ 271257144);
            case 180 -> bbaba(-110129782, var9 ^ 872899270);
            case 181 -> bbaba(-110129781, var9 ^ -302047256);
            case 182 -> bbaba(-110129780, var9 ^ 1542639390);
            case 183 -> bbaba(-110129779, var9 ^ -690532384);
            case 184 -> bbaba(-110129778, var9 ^ 1639274609);
            case 185 -> bbaba(-110129777, var9 ^ -542544081);
            case 186 -> bbaba(-110129792, var9 ^ 1026019425);
            case 187 -> bbaba(-110129791, var9 ^ 1646486266);
            case 188 -> bbaba(-110129790, var9 ^ -856964400);
            case 189 -> bbaba(-110129789, var9 ^ 1434333519);
            case 190 -> bbaba(-110129788, var9 ^ 1227708009);
            case 191 -> bbaba(-110129787, var9 ^ -1553681401);
            case 192 -> bbaba(-110129786, var9 ^ 882894880);
            case 193 -> bbaba(-110129785, var9 ^ 1704451746);
            case 194 -> bbaba(-110129768, var9 ^ -358445184);
            case 195 -> bbaba(-110129767, var9 ^ 2106100345);
            case 196 -> bbaba(-110129766, var9 ^ 695973679);
            case 197 -> bbaba(-110129765, var9 ^ -1585318210);
            case 198 -> bbaba(-110129764, var9 ^ 247696108);
            case 199 -> bbaba(-110129763, var9 ^ -1109825300);
            case 200 -> bbaba(-110129762, var9 ^ -1595271646);
            case 201 -> bbaba(-110129761, var9 ^ -403523920);
            case 202 -> bbaba(-110129776, var9 ^ 1889803232);
            case 203 -> bbaba(-110129775, var9 ^ -1582501662);
            case 204 -> bbaba(-110129774, var9 ^ -302123187);
            case 205 -> bbaba(-110129773, var9 ^ -282452642);
            case 206 -> bbaba(-110129772, var9 ^ -1176592676);
            case 207 -> bbaba(-110129771, var9 ^ -1892379193);
            case 208 -> bbaba(-110129770, var9 ^ -974190712);
            case 209 -> bbaba(-110129769, var9 ^ 1957823199);
            case 210 -> bbaba(-110129752, var9 ^ -315441595);
            case 211 -> bbaba(-110129751, var9 ^ -345370472);
            case 212 -> bbaba(-110129750, var9 ^ 2139762154);
            case 213 -> bbaba(-110129749, var9 ^ 515908750);
            case 214 -> bbaba(-110129748, var9 ^ 964348622);
            case 215 -> bbaba(-110129747, var9 ^ -887255369);
            case 216 -> bbaba(-110129746, var9 ^ -78028717);
            case 217 -> bbaba(-110129745, var9 ^ 1620469629);
            case 218 -> 5;
            case 219 -> bbaba(-110129760, var9 ^ -1233619284);
            case 220 -> bbaba(-110129759, var9 ^ -3043721);
            case 221 -> bbaba(-110129758, var9 ^ 2071737936);
            case 222 -> bbaba(-110129757, var9 ^ -257472602);
            case 223 -> bbaba(-110129756, var9 ^ 1097653440);
            case 224 -> bbaba(-110129755, var9 ^ -266061717);
            case 225 -> bbaba(-110129754, var9 ^ -1318621988);
            case 226 -> bbaba(-110129753, var9 ^ 169029759);
            case 227 -> bbaba(-110129736, var9 ^ -578241660);
            case 228 -> bbaba(-110129735, var9 ^ -1751110504);
            case 229 -> bbaba(-110129734, var9 ^ -1138329215);
            case 230 -> 4;
            case 231 -> bbaba(-110129733, var9 ^ 2114845389);
            case 232 -> bbaba(-110129732, var9 ^ 100081608);
            case 233 -> bbaba(-110129731, var9 ^ -46159477);
            case 234 -> bbaba(-110129730, var9 ^ 107687482);
            case 235 -> bbaba(-110129729, var9 ^ 1458444362);
            case 236 -> bbaba(-110129744, var9 ^ 1933201596);
            case 237 -> bbaba(-110129743, var9 ^ -1112822029);
            case 238 -> bbaba(-110129742, var9 ^ -821605686);
            case 239 -> bbaba(-110129741, var9 ^ -1096767753);
            case 240 -> bbaba(-110129740, var9 ^ 1506983914);
            case 241 -> bbaba(-110129739, var9 ^ -627697267);
            case 242 -> bbaba(-110129738, var9 ^ 1142352222);
            case 243 -> bbaba(-110129737, var9 ^ -191272344);
            case 244 -> bbaba(-110130104, var9 ^ -619948861);
            case 245 -> bbaba(-110130103, var9 ^ -797927834);
            case 246 -> bbaba(-110130102, var9 ^ -1547855679);
            case 247 -> bbaba(-110130101, var9 ^ -609592934);
            case 248 -> bbaba(-110130100, var9 ^ 145443752);
            case 249 -> bbaba(-110130099, var9 ^ -1671762264);
            case 250 -> bbaba(-110130098, var9 ^ -1824916929);
            case 251 -> bbaba(-110130097, var9 ^ 515742104);
            case 252 -> bbaba(-110130112, var9 ^ -1485870563);
            case 253 -> bbaba(-110130111, var9 ^ -1162094876);
            case 254 -> bbaba(-110130110, var9 ^ 741714045);
            default -> bbaba(-110130109, var9 ^ 1979203487);
         };
         int var5 = (var1 & bbaba(-110130108, var9 ^ 1182977925)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & bbaba(-110130107, var9 ^ 687580448)) >>> bbaba(-110130106, var9 ^ -700231327)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & bbaba(-110130105, var9 ^ 1469266090);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & bbaba(-110130088, var9 ^ 1616460152);
            }
         }

         abbaa[var2] = new String(var3).intern();
      }

      return abbaa[var2];
   }

   private void bb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bba [B
      // 07: astore 2
      // 08: istore 1
      // 09: aload 2
      // 0a: ifnonnull 0f
      // 0d: return
      // 0e: athrow
      // 0f: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 12: astore 3
      // 13: aload 3
      // 14: iload 1
      // 15: ifne 20
      // 18: ifnull 26
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 3
      // 20: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 23: ifnonnull 53
      // 26: invokestatic java/lang/System.currentTimeMillis ()J
      // 29: aload 0
      // 2a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baab J
      // 2d: lsub
      // 2e: ldc_w -110130087
      // 31: ldc_w -1161884659
      // 34: ldc_w -121433332
      // 37: ixor
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 3b: ldc2_w 3601388725674504363
      // 3e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abab (IJ)J
      // 41: lcmp
      // 42: ifle 52
      // 45: goto 49
      // 48: athrow
      // 49: aload 0
      // 4a: aconst_null
      // 4b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bba [B
      // 4e: goto 52
      // 51: athrow
      // 52: return
      // 53: aload 0
      // 54: aconst_null
      // 55: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bba [B
      // 58: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 5b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 5e: aload 2
      // 5f: aload 3
      // 60: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baaab (Ljava/lang/String;[BLnet/minecraft/class_310;)Z
      // 63: pop
      // 64: return
   }

   public static void aaa(String var0) {
   }

   private static Class aab() {
      try {
         return Class.forName(babb.abab(), false, bbbaaba.class.getClassLoader());
      } catch (Throwable var2) {
         try {
            return Class.forName(abb.abab(), false, bbbaaba.class.getClassLoader());
         } catch (Throwable var1) {
            return null;
         }
      }
   }

   private static boolean aba(List param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 09: astore 3
      // 0a: istore 2
      // 0b: aload 3
      // 0c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 11: ifeq 41
      // 14: aload 3
      // 15: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1a: checkcast net/minecraft/class_2960
      // 1d: astore 4
      // 1f: aload 1
      // 20: aload 4
      // 22: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 25: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 28: iload 2
      // 29: ifne 42
      // 2c: iload 2
      // 2d: ifne 3c
      // 30: goto 34
      // 33: athrow
      // 34: ifeq 3d
      // 37: goto 3b
      // 3a: athrow
      // 3b: bipush 1
      // 3c: ireturn
      // 3d: iload 2
      // 3e: ifeq 0b
      // 41: bipush 0
      // 42: ireturn
   }

   public boolean abb() {
      return false;
   }

   public static boolean bab() {
      return false;
   }

   public boolean bba() {
      return (Boolean)this.abbb.abbb();
   }

   private static Boolean bbb() {
      return Boolean.FALSE;
   }

   private void aaaa(byte[] var1) {
      this.bba = var1;
      this.baab = System.currentTimeMillis();
   }

   public static boolean aaab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aabb Ljava/lang/Boolean;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 8b
      // 0d: ifnonnull 8a
      // 10: goto 14
      // 13: athrow
      // 14: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 1a: iload 0
      // 1b: ifne 7e
      // 1e: goto 22
      // 21: athrow
      // 22: ifne 7d
      // 25: goto 29
      // 28: athrow
      // 29: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 2c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 2f: iload 0
      // 30: ifne 7e
      // 33: goto 37
      // 36: athrow
      // 37: ifne 7d
      // 3a: goto 3e
      // 3d: athrow
      // 3e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 41: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 44: iload 0
      // 45: ifne 7e
      // 48: goto 4c
      // 4b: athrow
      // 4c: ifne 7d
      // 4f: goto 53
      // 52: athrow
      // 53: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 56: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 59: iload 0
      // 5a: ifne 7e
      // 5d: goto 61
      // 60: athrow
      // 61: ifne 7d
      // 64: goto 68
      // 67: athrow
      // 68: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 6b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 6e: iload 0
      // 6f: ifne 7e
      // 72: goto 76
      // 75: athrow
      // 76: ifeq 81
      // 79: goto 7d
      // 7c: athrow
      // 7d: bipush 1
      // 7e: goto 82
      // 81: bipush 0
      // 82: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 85: astore 1
      // 86: aload 1
      // 87: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aabb Ljava/lang/Boolean;
      // 8a: aload 1
      // 8b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 8e: ireturn
   }

   public static byte[] aaba() {
      int var10000 = aabbabbab.ab;
      ByteArrayOutputStream var1 = new ByteArrayOutputStream(aaabb(bbaba(-110130086, -589586641 ^ 96495313), 8423761263757430777L));
      var1.write(1);
      int var0 = var10000;
      var1.write(1);
      String[] var2 = abbab.abab()
         .split(aabbaaaba.abba(ba(bbaba(-110130085, -589586641 ^ 308510832), bbaba(-110130084, -589586641 ^ -66792132))));
      bbab(var1, var2.length);
      String[] var3 = var2;
      int var4 = var2.length;
      int var5 = 0;

      while (true) {
         if (var5 < var4) {
            String var6 = var3[var5];

            try {
               aaaba(var1, var6);
               if (var0 != 0) {
                  break;
               }

               var5++;
               if (var0 == 0) {
                  continue;
               }
            } catch (MatchException var7) {
               throw var7;
            }
         }

         var1.write(2);
         aaaba(var1, aaaba.abab());
         break;
      }

      return var1.toByteArray();
   }

   public static void aabb(List param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1579942955
      // 003: istore 11
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: istore 1
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifne 016
      // 00e: ifnull 01e
      // 011: goto 015
      // 014: athrow
      // 015: aload 0
      // 016: invokeinterface java/util/List.isEmpty ()Z 1
      // 01b: ifeq 020
      // 01e: return
      // 01f: athrow
      // 020: new java/lang/StringBuilder
      // 023: dup
      // 024: invokespecial java/lang/StringBuilder.<init> ()V
      // 027: astore 2
      // 028: aload 0
      // 029: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 02e: astore 3
      // 02f: aload 3
      // 030: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 035: ifeq 08f
      // 038: aload 3
      // 039: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 03e: checkcast net/minecraft/class_2960
      // 041: astore 4
      // 043: iload 1
      // 044: ifne 0cc
      // 047: iload 1
      // 048: ifne 08b
      // 04b: goto 04f
      // 04e: athrow
      // 04f: aload 2
      // 050: invokevirtual java/lang/StringBuilder.length ()I
      // 053: ifle 081
      // 056: goto 05a
      // 059: athrow
      // 05a: aload 2
      // 05b: ldc_w -110130083
      // 05e: iload 11
      // 060: ldc_w -2063668864
      // 063: ixor
      // 064: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 067: ldc_w -110130082
      // 06a: iload 11
      // 06c: ldc_w 553402298
      // 06f: ixor
      // 070: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 073: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 076: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 079: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 07c: pop
      // 07d: goto 081
      // 080: athrow
      // 081: aload 2
      // 082: aload 4
      // 084: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 087: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08a: pop
      // 08b: iload 1
      // 08c: ifeq 02f
      // 08f: ldc_w -110130081
      // 092: iload 11
      // 094: ldc_w -1915688801
      // 097: ixor
      // 098: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 09b: ldc_w -110130096
      // 09e: iload 11
      // 0a0: ldc_w -1849409827
      // 0a3: ixor
      // 0a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 0a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 0aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0ad: aload 2
      // 0ae: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 0b1: astore 10
      // 0b3: astore 9
      // 0b5: new java/lang/StringBuilder
      // 0b8: dup
      // 0b9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0bc: aload 9
      // 0be: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0c1: aload 10
      // 0c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0c6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 0cc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0cf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 0d2: astore 3
      // 0d3: aload 0
      // 0d4: aload 3
      // 0d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aba (Ljava/util/List;Ljava/lang/String;)Z
      // 0d8: iload 1
      // 0d9: ifne 0eb
      // 0dc: ifeq 0ee
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: aload 3
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.a (Ljava/lang/String;)Z
      // 0e7: goto 0eb
      // 0ea: athrow
      // 0eb: ifne 0ef
      // 0ee: return
      // 0ef: invokestatic java/lang/System.currentTimeMillis ()J
      // 0f2: lstore 4
      // 0f4: iload 1
      // 0f5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aab Ljava/util/concurrent/ConcurrentMap;
      // 0f8: aload 3
      // 0f9: invokeinterface java/util/concurrent/ConcurrentMap.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0fe: checkcast java/lang/Long
      // 101: astore 6
      // 103: ifne 142
      // 106: aload 6
      // 108: ifnull 133
      // 10b: goto 10f
      // 10e: athrow
      // 10f: lload 4
      // 111: aload 6
      // 113: invokevirtual java/lang/Long.longValue ()J
      // 116: lsub
      // 117: ldc_w -110130095
      // 11a: iload 11
      // 11c: ldc_w 5795906
      // 11f: ixor
      // 120: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 123: ldc2_w 7557608870006329585
      // 126: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abab (IJ)J
      // 129: lcmp
      // 12a: ifge 133
      // 12d: goto 131
      // 130: athrow
      // 131: return
      // 132: athrow
      // 133: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aab Ljava/util/concurrent/ConcurrentMap;
      // 136: aload 3
      // 137: lload 4
      // 139: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 13c: invokeinterface java/util/concurrent/ConcurrentMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 141: pop
      // 142: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 145: astore 7
      // 147: aload 7
      // 149: iload 1
      // 14a: ifne 156
      // 14d: ifnull 173
      // 150: goto 154
      // 153: athrow
      // 154: aload 7
      // 156: iload 1
      // 157: ifne 16a
      // 15a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 15d: ifnull 173
      // 160: goto 164
      // 163: athrow
      // 164: aload 7
      // 166: goto 16a
      // 169: athrow
      // 16a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 16d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba;
      // 170: goto 174
      // 173: aconst_null
      // 174: astore 8
      // 176: iload 1
      // 177: ifne 18d
      // 17a: aload 8
      // 17c: ifnonnull 185
      // 17f: goto 183
      // 182: athrow
      // 183: return
      // 184: athrow
      // 185: aload 8
      // 187: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abaaa ()[B
      // 18a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaaa ([B)V
      // 18d: return
   }

   public boolean abaa(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 404018182
      // 003: istore 4
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: istore 2
      // 009: aload 0
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bba ()Z
      // 00d: iload 2
      // 00e: ifne 029
      // 011: ifeq 028
      // 014: goto 018
      // 017: athrow
      // 018: aload 1
      // 019: iload 2
      // 01a: ifne 02e
      // 01d: goto 021
      // 020: athrow
      // 021: ifnonnull 02a
      // 024: goto 028
      // 027: athrow
      // 028: bipush 0
      // 029: ireturn
      // 02a: aload 1
      // 02b: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 02e: astore 3
      // 02f: aload 3
      // 030: ldc_w -110130094
      // 033: iload 4
      // 035: ldc_w 457293591
      // 038: ixor
      // 039: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 03c: ldc_w -110130093
      // 03f: iload 4
      // 041: ldc_w -503016195
      // 044: ixor
      // 045: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 048: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 04b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 04e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 051: iload 2
      // 052: ifne 247
      // 055: ifne 246
      // 058: goto 05c
      // 05b: athrow
      // 05c: aload 3
      // 05d: ldc_w -110130092
      // 060: iload 4
      // 062: ldc_w 983504217
      // 065: ixor
      // 066: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 069: ldc_w -110130091
      // 06c: iload 4
      // 06e: ldc_w -1945583217
      // 071: ixor
      // 072: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 075: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 078: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 07b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 07e: iload 2
      // 07f: ifne 247
      // 082: goto 086
      // 085: athrow
      // 086: ifne 246
      // 089: goto 08d
      // 08c: athrow
      // 08d: aload 3
      // 08e: ldc_w -110130090
      // 091: iload 4
      // 093: ldc_w 2093495692
      // 096: ixor
      // 097: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 09a: ldc_w -110130089
      // 09d: iload 4
      // 09f: ldc_w 1473553444
      // 0a2: ixor
      // 0a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 0a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 0a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0ac: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 0af: iload 2
      // 0b0: ifne 247
      // 0b3: goto 0b7
      // 0b6: athrow
      // 0b7: ifne 246
      // 0ba: goto 0be
      // 0bd: athrow
      // 0be: aload 3
      // 0bf: ldc_w -110130072
      // 0c2: iload 4
      // 0c4: ldc_w 2090925535
      // 0c7: ixor
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 0cb: ldc_w -110130071
      // 0ce: iload 4
      // 0d0: ldc_w 953981764
      // 0d3: ixor
      // 0d4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 0d7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 0da: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0dd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0e0: iload 2
      // 0e1: ifne 247
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: ifne 246
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: aload 3
      // 0f0: ldc_w -110130070
      // 0f3: iload 4
      // 0f5: ldc_w 532421047
      // 0f8: ixor
      // 0f9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 0fc: ldc_w -110130069
      // 0ff: iload 4
      // 101: ldc_w 1719649940
      // 104: ixor
      // 105: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 108: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 10e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 111: iload 2
      // 112: ifne 247
      // 115: goto 119
      // 118: athrow
      // 119: ifne 246
      // 11c: goto 120
      // 11f: athrow
      // 120: aload 3
      // 121: ldc_w -110130068
      // 124: iload 4
      // 126: ldc_w 282106439
      // 129: ixor
      // 12a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 12d: ldc_w -110130067
      // 130: iload 4
      // 132: ldc_w 704194900
      // 135: ixor
      // 136: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 139: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 13c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 13f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 142: iload 2
      // 143: ifne 247
      // 146: goto 14a
      // 149: athrow
      // 14a: ifne 246
      // 14d: goto 151
      // 150: athrow
      // 151: aload 3
      // 152: ldc_w -110130066
      // 155: iload 4
      // 157: ldc_w -1666802575
      // 15a: ixor
      // 15b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 15e: ldc_w -110130065
      // 161: iload 4
      // 163: ldc_w -1875024290
      // 166: ixor
      // 167: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 16a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 16d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 170: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 173: iload 2
      // 174: ifne 247
      // 177: goto 17b
      // 17a: athrow
      // 17b: ifne 246
      // 17e: goto 182
      // 181: athrow
      // 182: aload 3
      // 183: ldc_w -110130080
      // 186: iload 4
      // 188: ldc_w -466156642
      // 18b: ixor
      // 18c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 18f: ldc_w -110130079
      // 192: iload 4
      // 194: ldc_w 1502769863
      // 197: ixor
      // 198: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 19b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 19e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1a1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a4: iload 2
      // 1a5: ifne 247
      // 1a8: goto 1ac
      // 1ab: athrow
      // 1ac: ifne 246
      // 1af: goto 1b3
      // 1b2: athrow
      // 1b3: aload 3
      // 1b4: ldc_w -110130078
      // 1b7: iload 4
      // 1b9: ldc_w -1355092581
      // 1bc: ixor
      // 1bd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 1c0: ldc_w -110130077
      // 1c3: iload 4
      // 1c5: ldc_w 1568617098
      // 1c8: ixor
      // 1c9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 1cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 1cf: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1d2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1d5: iload 2
      // 1d6: ifne 247
      // 1d9: goto 1dd
      // 1dc: athrow
      // 1dd: ifne 246
      // 1e0: goto 1e4
      // 1e3: athrow
      // 1e4: aload 3
      // 1e5: ldc_w -110130076
      // 1e8: iload 4
      // 1ea: ldc_w 585454735
      // 1ed: ixor
      // 1ee: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 1f1: ldc_w -110130075
      // 1f4: iload 4
      // 1f6: ldc_w -67044521
      // 1f9: ixor
      // 1fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 1fd: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 200: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 203: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 206: iload 2
      // 207: ifne 247
      // 20a: goto 20e
      // 20d: athrow
      // 20e: ifne 246
      // 211: goto 215
      // 214: athrow
      // 215: aload 3
      // 216: ldc_w -110130074
      // 219: iload 4
      // 21b: ldc_w -499042694
      // 21e: ixor
      // 21f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 222: ldc_w -110130073
      // 225: iload 4
      // 227: ldc_w -1332637749
      // 22a: ixor
      // 22b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 22e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 231: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 234: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 237: iload 2
      // 238: ifne 247
      // 23b: goto 23f
      // 23e: athrow
      // 23f: ifeq 24a
      // 242: goto 246
      // 245: athrow
      // 246: bipush 1
      // 247: goto 24b
      // 24a: bipush 0
      // 24b: ireturn
   }

   private static long abab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ bbaba(-110130056, -941353312 ^ 1736005061)) & bbaba(-110130055, -941353312 ^ -179500201);
      if (bbbb[var3] == null) {
         bbbb[var3] = aaaa[var3] ^ var1;
      }

      return bbbb[var3];
   }

   public static boolean abba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 0
      // 16: ifne 27
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 26
      // 1f: goto 23
      // 22: athrow
      // 23: bipush 0
      // 24: ireturn
      // 25: athrow
      // 26: aload 1
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba;
      // 2d: astore 2
      // 2e: aload 2
      // 2f: iload 0
      // 30: ifne 3b
      // 33: ifnull 6f
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 2
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babbaab ()Z
      // 3e: iload 0
      // 3f: ifne 74
      // 42: ifeq 6f
      // 45: goto 49
      // 48: athrow
      // 49: aload 2
      // 4a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bba ()Z
      // 4d: iload 0
      // 4e: ifne 74
      // 51: goto 55
      // 54: athrow
      // 55: ifeq 6f
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 2
      // 5d: iload 0
      // 5e: ifne 76
      // 61: goto 65
      // 64: athrow
      // 65: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babbb ()Z
      // 68: ifne 75
      // 6b: goto 6f
      // 6e: athrow
      // 6f: bipush 0
      // 70: goto 74
      // 73: athrow
      // 74: ireturn
      // 75: aload 2
      // 76: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb;
      // 79: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb;
      // 7c: if_acmpne 84
      // 7f: bipush 1
      // 80: goto 85
      // 83: athrow
      // 84: bipush 0
      // 85: ireturn
   }

   private static boolean abbb(ababbbbaa param0) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 17: bipush 0
      // 18: ldc qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba
      // 1a: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 1d: invokestatic java/lang/Class.forName (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
      // 20: pop
      // 21: bipush 1
      // 22: ireturn
      // 23: astore 2
      // 24: aload 2
      // 25: pop
      // 26: bipush 0
      // 27: ireturn
   }

   private static boolean baaa() {
      return false;
   }

   public static boolean baab(byte[] param0) {
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
      // 09: ifnull 4b
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 22
      // 15: arraylength
      // 16: ifle 4b
      // 19: goto 1d
      // 1c: athrow
      // 1d: aload 0
      // 1e: goto 22
      // 21: athrow
      // 22: bipush 0
      // 23: baload
      // 24: iload 1
      // 25: ifne 48
      // 28: ldc_w -110130054
      // 2b: ldc_w -310293877
      // 2e: ldc_w 493045220
      // 31: ixor
      // 32: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 35: ldc2_w 2401425178683335106
      // 38: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // 3b: iand
      // 3c: ifne 4b
      // 3f: goto 43
      // 42: athrow
      // 43: bipush 1
      // 44: goto 48
      // 47: athrow
      // 48: goto 4c
      // 4b: bipush 0
      // 4c: ireturn
   }

   private static boolean baba(byte[] param0, class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -395359866
      // 003: istore 14
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 008: istore 2
      // 009: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbba Ljava/lang/reflect/Constructor;
      // 00c: astore 3
      // 00d: aload 3
      // 00e: iload 2
      // 00f: ifne 1b8
      // 012: ifnonnull 163
      // 015: goto 019
      // 018: athrow
      // 019: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aab ()Ljava/lang/Class;
      // 01c: astore 4
      // 01e: aload 4
      // 020: iload 2
      // 021: ifne 086
      // 024: ifnonnull 084
      // 027: goto 02b
      // 02a: athrow
      // 02b: ldc_w -110130053
      // 02e: iload 14
      // 030: ldc_w 1658827564
      // 033: ixor
      // 034: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 037: ldc_w -110130052
      // 03a: iload 14
      // 03c: ldc_w -1855066735
      // 03f: ixor
      // 040: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 046: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 049: ldc_w -110130051
      // 04c: iload 14
      // 04e: ldc_w -216486513
      // 051: ixor
      // 052: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 055: ldc_w -110130050
      // 058: iload 14
      // 05a: ldc_w -761199178
      // 05d: ixor
      // 05e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 061: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 064: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 067: astore 11
      // 069: astore 10
      // 06b: new java/lang/StringBuilder
      // 06e: dup
      // 06f: invokespecial java/lang/StringBuilder.<init> ()V
      // 072: aload 10
      // 074: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 077: aload 11
      // 079: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 07c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 082: bipush 0
      // 083: ireturn
      // 084: aload 4
      // 086: invokevirtual java/lang/Class.getDeclaredConstructors ()[Ljava/lang/reflect/Constructor;
      // 089: astore 5
      // 08b: aload 5
      // 08d: arraylength
      // 08e: istore 6
      // 090: bipush 0
      // 091: istore 7
      // 093: iload 7
      // 095: iload 6
      // 097: if_icmpge 0fe
      // 09a: aload 5
      // 09c: iload 7
      // 09e: aaload
      // 09f: astore 8
      // 0a1: iload 2
      // 0a2: aload 8
      // 0a4: invokevirtual java/lang/reflect/Constructor.getParameterTypes ()[Ljava/lang/Class;
      // 0a7: astore 9
      // 0a9: ifne 163
      // 0ac: iload 2
      // 0ad: ifne 0fa
      // 0b0: goto 0b4
      // 0b3: athrow
      // 0b4: aload 9
      // 0b6: arraylength
      // 0b7: bipush 2
      // 0b8: if_icmpne 0f7
      // 0bb: goto 0bf
      // 0be: athrow
      // 0bf: ldc_w net/minecraft/class_8710$class_9154
      // 0c2: iload 2
      // 0c3: ifne 0e0
      // 0c6: goto 0ca
      // 0c9: athrow
      // 0ca: aload 9
      // 0cc: bipush 0
      // 0cd: aaload
      // 0ce: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 0d1: ifeq 0f7
      // 0d4: goto 0d8
      // 0d7: athrow
      // 0d8: aload 9
      // 0da: bipush 1
      // 0db: aaload
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: ldc [B
      // 0e2: if_acmpne 0f7
      // 0e5: aload 8
      // 0e7: bipush 1
      // 0e8: invokevirtual java/lang/reflect/Constructor.setAccessible (Z)V
      // 0eb: iload 2
      // 0ec: aload 8
      // 0ee: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbba Ljava/lang/reflect/Constructor;
      // 0f1: aload 8
      // 0f3: astore 3
      // 0f4: ifeq 0fe
      // 0f7: iinc 7 1
      // 0fa: iload 2
      // 0fb: ifeq 093
      // 0fe: aload 3
      // 0ff: iload 2
      // 100: ifne 1b8
      // 103: ifnonnull 163
      // 106: goto 10a
      // 109: athrow
      // 10a: ldc_w -110130049
      // 10d: iload 14
      // 10f: ldc_w 1991061477
      // 112: ixor
      // 113: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 116: ldc_w -110130064
      // 119: iload 14
      // 11b: ldc_w 553151014
      // 11e: ixor
      // 11f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 122: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 125: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 128: ldc_w -110130063
      // 12b: iload 14
      // 12d: ldc_w -273966220
      // 130: ixor
      // 131: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 134: ldc_w -110130062
      // 137: iload 14
      // 139: ldc_w -2100112699
      // 13c: ixor
      // 13d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 140: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 143: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 146: astore 12
      // 148: astore 11
      // 14a: new java/lang/StringBuilder
      // 14d: dup
      // 14e: invokespecial java/lang/StringBuilder.<init> ()V
      // 151: aload 11
      // 153: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 156: aload 12
      // 158: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 15b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 161: bipush 0
      // 162: ireturn
      // 163: aload 3
      // 164: bipush 2
      // 165: anewarray 1068
      // 168: dup
      // 169: bipush 0
      // 16a: new net/minecraft/class_8710$class_9154
      // 16d: dup
      // 16e: ldc_w -110130061
      // 171: iload 14
      // 173: ldc_w -1026580988
      // 176: ixor
      // 177: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 17a: ldc_w -110130060
      // 17d: iload 14
      // 17f: ldc_w 2090376517
      // 182: ixor
      // 183: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 186: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 189: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 18c: ldc_w -110130059
      // 18f: iload 14
      // 191: ldc_w 167789654
      // 194: ixor
      // 195: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 198: ldc_w -110130058
      // 19b: iload 14
      // 19d: ldc_w -927235941
      // 1a0: ixor
      // 1a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 1a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 1a7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1aa: invokestatic net/minecraft/class_2960.method_60655 (Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/class_2960;
      // 1ad: invokespecial net/minecraft/class_8710$class_9154.<init> (Lnet/minecraft/class_2960;)V
      // 1b0: aastore
      // 1b1: dup
      // 1b2: bipush 1
      // 1b3: aload 0
      // 1b4: aastore
      // 1b5: invokevirtual java/lang/reflect/Constructor.newInstance ([Ljava/lang/Object;)Ljava/lang/Object;
      // 1b8: checkcast net/minecraft/class_8710
      // 1bb: astore 4
      // 1bd: aload 1
      // 1be: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 1c1: new net/minecraft/class_2817
      // 1c4: dup
      // 1c5: aload 4
      // 1c7: invokespecial net/minecraft/class_2817.<init> (Lnet/minecraft/class_8710;)V
      // 1ca: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 1cd: bipush 1
      // 1ce: ireturn
      // 1cf: astore 3
      // 1d0: ldc_w -110130057
      // 1d3: iload 14
      // 1d5: ldc_w -287929612
      // 1d8: ixor
      // 1d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 1dc: ldc_w -110130168
      // 1df: iload 14
      // 1e1: ldc_w -1037413121
      // 1e4: ixor
      // 1e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 1e8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 1eb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1ee: aload 3
      // 1ef: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1f2: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 1f5: astore 13
      // 1f7: astore 12
      // 1f9: new java/lang/StringBuilder
      // 1fc: dup
      // 1fd: invokespecial java/lang/StringBuilder.<init> ()V
      // 200: aload 12
      // 202: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 205: aload 13
      // 207: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 20a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 20d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 210: bipush 0
      // 211: ireturn
   }

   @Override
   public void abaab() {
      super.abaab();
      this.b();
   }

   public static boolean babb(byte[] param0) {
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
      // 09: ifnull 5f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: arraylength
      // 12: iload 1
      // 13: ifne 41
      // 16: bipush 2
      // 17: if_icmplt 5f
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 0
      // 1f: bipush 0
      // 20: baload
      // 21: iload 1
      // 22: ifne 5c
      // 25: goto 29
      // 28: athrow
      // 29: ldc_w -110130167
      // 2c: ldc_w 265872598
      // 2f: ldc_w -60903730
      // 32: ixor
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 36: ldc2_w 5203053315050684846
      // 39: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // 3c: iand
      // 3d: goto 41
      // 40: athrow
      // 41: ldc_w -110130166
      // 44: ldc_w 265872598
      // 47: ldc_w -171126526
      // 4a: ixor
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 4e: ldc2_w 839816596628020565
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // 54: if_icmpne 5f
      // 57: bipush 1
      // 58: goto 5c
      // 5b: athrow
      // 5c: goto 60
      // 5f: bipush 0
      // 60: ireturn
   }

   private static void bbab(ByteArrayOutputStream param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: iload 1
      // 05: ldc_w -110130165
      // 08: ldc_w -935654612
      // 0b: ldc_w 213299705
      // 0e: ixor
      // 0f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 12: ldc2_w 1100984719181916516
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // 18: iand
      // 19: ifne 2b
      // 1c: aload 0
      // 1d: iload 2
      // 1e: ifne 2c
      // 21: goto 25
      // 24: athrow
      // 25: iload 1
      // 26: invokevirtual java/io/ByteArrayOutputStream.write (I)V
      // 29: return
      // 2a: athrow
      // 2b: aload 0
      // 2c: iload 1
      // 2d: ldc_w -110130164
      // 30: ldc_w -935654612
      // 33: ldc_w 415773109
      // 36: ixor
      // 37: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 3a: ldc2_w 1052722441784454926
      // 3d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // 40: iand
      // 41: ldc_w -110130163
      // 44: ldc_w -935654612
      // 47: ldc_w 958018702
      // 4a: ixor
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 4e: ldc2_w 4594477028043590749
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // 54: ior
      // 55: invokevirtual java/io/ByteArrayOutputStream.write (I)V
      // 58: iload 1
      // 59: ldc_w -110130162
      // 5c: ldc_w -935654612
      // 5f: ldc_w -1967825742
      // 62: ixor
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 66: ldc2_w 6430786797634080791
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // 6c: iushr
      // 6d: istore 1
      // 6e: goto 04
   }

   private static int bbaba(int var0, int var1) {
      int var2 = abbbb[var0 ^ -110129848] ^ var1 ^ var0;
      var2 ^= 33910;
      var2 += 26834;
      var2 -= 28499;
      var2 -= 32980;
      var2 ^= 53717;
      var2 ^= 60299;
      return var2 + 21425;
   }

   public static byte[] bbba(class_8710 param0) {
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
      // 05: ifnull 12
      // 08: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaab ()Z
      // 0b: ifne 15
      // 0e: goto 12
      // 11: athrow
      // 12: aconst_null
      // 13: areturn
      // 14: athrow
      // 15: aload 0
      // 16: invokeinterface net/minecraft/class_8710.getClass ()Ljava/lang/Class; 1
      // 1b: astore 2
      // 1c: aload 2
      // 1d: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 20: astore 3
      // 21: aload 3
      // 22: iload 1
      // 23: ifne 3b
      // 26: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 2c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f: ifne 49
      // 32: goto 36
      // 35: athrow
      // 36: aload 3
      // 37: goto 3b
      // 3a: athrow
      // 3b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 41: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 44: ifne 49
      // 47: aconst_null
      // 48: areturn
      // 49: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaab Ljava/lang/reflect/Field;
      // 4c: astore 4
      // 4e: aload 4
      // 50: iload 1
      // 51: ifne c0
      // 54: ifnonnull ba
      // 57: goto 5b
      // 5a: athrow
      // 5b: aload 2
      // 5c: invokevirtual java/lang/Class.getDeclaredFields ()[Ljava/lang/reflect/Field;
      // 5f: astore 5
      // 61: aload 5
      // 63: arraylength
      // 64: istore 6
      // 66: bipush 0
      // 67: istore 7
      // 69: iload 7
      // 6b: iload 6
      // 6d: if_icmpge ab
      // 70: aload 5
      // 72: iload 7
      // 74: aaload
      // 75: astore 8
      // 77: iload 1
      // 78: ifne ba
      // 7b: iload 1
      // 7c: ifne a7
      // 7f: goto 83
      // 82: athrow
      // 83: aload 8
      // 85: invokevirtual java/lang/reflect/Field.getType ()Ljava/lang/Class;
      // 88: ldc [B
      // 8a: if_acmpne a4
      // 8d: goto 91
      // 90: athrow
      // 91: aload 8
      // 93: bipush 1
      // 94: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 97: iload 1
      // 98: aload 8
      // 9a: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaab Ljava/lang/reflect/Field;
      // 9d: aload 8
      // 9f: astore 4
      // a1: ifeq ab
      // a4: iinc 7 1
      // a7: iload 1
      // a8: ifeq 69
      // ab: aload 4
      // ad: iload 1
      // ae: ifne c0
      // b1: ifnonnull ba
      // b4: goto b8
      // b7: athrow
      // b8: aconst_null
      // b9: areturn
      // ba: aload 4
      // bc: aload 0
      // bd: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // c0: checkcast [B
      // c3: areturn
      // c4: astore 2
      // c5: aconst_null
      // c6: areturn
   }

   @Override
   public String ababa() {
      return "";
   }

   private static void bbbb(class_9154 param0, Function param1, ababbbbaa param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 4
      // 05: iload 3
      // 06: iload 4
      // 08: ifne 66
      // 0b: ifeq 56
      // 0e: goto 12
      // 11: athrow
      // 12: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaaaa Ljava/util/Set;
      // 15: aload 2
      // 16: iload 4
      // 18: ifne 40
      // 1b: goto 1f
      // 1e: athrow
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 22: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 27: ifeq 30
      // 2a: goto 2e
      // 2d: athrow
      // 2e: return
      // 2f: athrow
      // 30: aload 0
      // 31: aload 2
      // 32: aload 1
      // 33: invokedynamic receive (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;Ljava/util/function/Function;)Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$PlayPayloadHandler; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Lnet/minecraft/class_8710;Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$Context;)V, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ababb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;Ljava/util/function/Function;Lnet/minecraft/class_8710;Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$Context;)V, (Lnet/minecraft/class_8710;Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$Context;)V ]
      // 38: invokestatic net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.registerGlobalReceiver (Lnet/minecraft/class_8710$class_9154;Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$PlayPayloadHandler;)Z
      // 3b: pop
      // 3c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaaaa Ljava/util/Set;
      // 3f: aload 2
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 43: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 48: pop
      // 49: goto 7a
      // 4c: astore 5
      // 4e: aload 5
      // 50: pop
      // 51: iload 4
      // 53: ifeq 7a
      // 56: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaaaa Ljava/util/Set;
      // 59: aload 2
      // 5a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 5d: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 62: goto 66
      // 65: athrow
      // 66: ifne 6a
      // 69: return
      // 6a: aload 0
      // 6b: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 6e: invokestatic net/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking.unregisterGlobalReceiver (Lnet/minecraft/class_2960;)Lnet/fabricmc/fabric/api/client/networking/v1/ClientPlayNetworking$PlayPayloadHandler;
      // 71: pop
      // 72: goto 7a
      // 75: astore 5
      // 77: aload 5
      // 79: pop
      // 7a: return
   }

   static boolean aaaaa() {
      return (Boolean)abaa.get();
   }

   public static void aaaab() {
      aaaaa.clear();
      aabaa.clear();
      aab.clear();
      abbba = null;
      aaab = null;
      aabb = null;
      baba = null;
   }

   private static void aaaba(ByteArrayOutputStream var0, String var1) {
      byte[] var2 = var1.getBytes(StandardCharsets.UTF_8);
      bbab(var0, var2.length);
      var0.write(var2, 0, var2.length);
   }

   private static int aaabb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ bbaba(-110129978, -1867673246 ^ -1563427772);
      if (aabbb[var3] == null) {
         aabbb[var3] = (int)(abba[var3] ^ var1);
      }

      return aabbb[var3];
   }

   private static void aabab(class_9154 var0, class_9139 var1, ababbbbaa var2) {
      try {
         if (!aabaa.add(var2.abab())) {
            return;
         }
      } catch (Throwable var6) {
         throw var6;
      }

      try {
         PayloadTypeRegistry.playS2C().register(var0, var1);
      } catch (Throwable var5) {
      }

      try {
         PayloadTypeRegistry.playC2S().register(var0, var1);
      } catch (Throwable var4) {
      }
   }

   public static byte[] aabba() {
      int var3 = 1097569278;
      ByteArrayOutputStream var0 = new ByteArrayOutputStream(aaabb(bbaba(-110129977, var3 ^ -99085503), 5230011529941092062L));
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeByte(1);
         var1.writeUTF(aabbaaaba.abba(ba(bbaba(-110129960, var3 ^ 1550697833), bbaba(-110129959, var3 ^ -1847148013))));
         var1.writeUTF(aabbaaaba.abba(ba(bbaba(-110129958, var3 ^ 1760831818), bbaba(-110129957, var3 ^ 1614360432))));
         var1.close();
      } catch (IOException var4) {
      }

      return var0.toByteArray();
   }

   public static byte[] abaaa() {
      return new byte[]{0, (byte)aaabb(bbaba(-110129956, 457781070 ^ -1735145624), 7278181366548744699L)};
   }

   private static void ababb(ababbbbaa var0, Function var1, class_8710 var2, Context var3) {
      ab(var0.abab(), (byte[])var1.apply(var2), var3.client());
   }

   public boolean abbaa(String var1) {
      return bbaab((ababaaabb)this.aabab.abbb(), var1);
   }

   @Override
   public void bbaa() {
      this.b();
      this.bb();
   }

   public bbbaaba() {
      int var1 = 754824248;
      super(
         aabbaaaba.aaab(ba(bbaba(-110129955, var1 ^ 118494816), bbaba(-110129954, var1 ^ 1228050528))),
         bbaabbba.bba,
         aabbaaaba.aaab(ba(bbaba(-110129953, var1 ^ -884744384), bbaba(-110129968, var1 ^ 1340874395)))
      );
      this.aabab = new baabaab(
         aabbaaaba.aaab(ba(bbaba(-110129967, var1 ^ 506103187), bbaba(-110129966, var1 ^ 394730630))),
         ababaaabb.class,
         ababaaabb.b
      );
      this.abbb = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(ba(bbaba(-110129965, var1 ^ 1381181406), bbaba(-110129964, var1 ^ -1139899376))), true
         )
      );
      this.aaaab = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(ba(bbaba(-110129963, var1 ^ -945489208), bbaba(-110129962, var1 ^ -1659528505))), false
         )
      );
      this.baaa = (abbaaaaa)this.abbbaaa(
         (abbaaaaa)new abbaaaaa(
               aabbaaaba.aaab(ba(bbaba(-110129961, var1 ^ 1244857825), bbaba(-110129944, var1 ^ 1737160848))), false
            )
            .babb(bbbaaba::baaa)
      );
      abbab();
      this.b();
   }

   public static void abbab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 0
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaab ()Z
      // 07: iload 0
      // 08: ifne 25
      // 0b: ifne 22
      // 0e: goto 12
      // 11: athrow
      // 12: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabba.b Lnet/minecraft/class_8710$class_9154;
      // 15: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabba.aa Lnet/minecraft/class_9139;
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aabab (Lnet/minecraft/class_8710$class_9154;Lnet/minecraft/class_9139;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)V
      // 1e: goto 22
      // 21: athrow
      // 22: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babba ()Z
      // 25: ifne 38
      // 28: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbb.b Lnet/minecraft/class_8710$class_9154;
      // 2b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbb.ab Lnet/minecraft/class_9139;
      // 2e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aabab (Lnet/minecraft/class_8710$class_9154;Lnet/minecraft/class_9139;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)V
      // 34: goto 38
      // 37: athrow
      // 38: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbabb.ab Lnet/minecraft/class_8710$class_9154;
      // 3b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbabb.a Lnet/minecraft/class_9139;
      // 3e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 41: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aabab (Lnet/minecraft/class_8710$class_9154;Lnet/minecraft/class_9139;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)V
      // 44: return
   }

   private static boolean abbba(ababbbbaa var0) {
      try {
         return FabricLoader.getInstance().isModLoaded(var0.abab());
      } catch (Throwable var2) {
         return false;
      }
   }

   public static byte[] abbbb(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 454309906
      // 003: istore 9
      // 005: new java/io/ByteArrayOutputStream
      // 008: dup
      // 009: ldc_w -110129943
      // 00c: iload 9
      // 00e: ldc_w -464984482
      // 011: ixor
      // 012: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 015: ldc2_w 8946698186989912004
      // 018: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // 01b: invokespecial java/io/ByteArrayOutputStream.<init> (I)V
      // 01e: astore 2
      // 01f: aload 2
      // 020: ldc_w -110129942
      // 023: iload 9
      // 025: ldc_w -1494648212
      // 028: ixor
      // 029: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 02c: ldc2_w 6430786797634080791
      // 02f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb (IJ)I
      // 032: invokevirtual java/io/ByteArrayOutputStream.write (I)V
      // 035: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 038: aload 2
      // 039: iload 0
      // 03a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbab (Ljava/io/ByteArrayOutputStream;I)V
      // 03d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 040: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 043: ldc_w -110129941
      // 046: iload 9
      // 048: ldc_w -618091251
      // 04b: ixor
      // 04c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 04f: ldc_w -110129940
      // 052: iload 9
      // 054: ldc_w -1964243910
      // 057: ixor
      // 058: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 05b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 05e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 061: invokevirtual java/lang/String.split (Ljava/lang/String;)[Ljava/lang/String;
      // 064: astore 3
      // 065: aload 2
      // 066: aload 3
      // 067: arraylength
      // 068: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbab (Ljava/io/ByteArrayOutputStream;I)V
      // 06b: aload 3
      // 06c: astore 4
      // 06e: istore 1
      // 06f: aload 4
      // 071: arraylength
      // 072: istore 5
      // 074: bipush 0
      // 075: istore 6
      // 077: iload 6
      // 079: iload 5
      // 07b: if_icmpge 108
      // 07e: aload 4
      // 080: iload 6
      // 082: aaload
      // 083: astore 7
      // 085: aload 7
      // 087: ldc_w -110129939
      // 08a: iload 9
      // 08c: ldc_w 1486798690
      // 08f: ixor
      // 090: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 093: ldc_w -110129938
      // 096: iload 9
      // 098: ldc_w 351720180
      // 09b: ixor
      // 09c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 09f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 0a2: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0a5: bipush 0
      // 0a6: invokevirtual java/lang/String.charAt (I)C
      // 0a9: invokevirtual java/lang/String.indexOf (I)I
      // 0ac: istore 8
      // 0ae: aload 2
      // 0af: iload 1
      // 0b0: ifne 109
      // 0b3: iload 8
      // 0b5: ifle 0c8
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: aload 7
      // 0be: bipush 0
      // 0bf: iload 8
      // 0c1: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 0c4: goto 0ca
      // 0c7: athrow
      // 0c8: aload 7
      // 0ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaaba (Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)V
      // 0cd: aload 2
      // 0ce: iload 8
      // 0d0: iload 1
      // 0d1: ifne 0e3
      // 0d4: ifle 0f8
      // 0d7: goto 0db
      // 0da: athrow
      // 0db: iload 8
      // 0dd: bipush 1
      // 0de: iadd
      // 0df: goto 0e3
      // 0e2: athrow
      // 0e3: aload 7
      // 0e5: invokevirtual java/lang/String.length ()I
      // 0e8: if_icmpge 0f8
      // 0eb: aload 7
      // 0ed: iload 8
      // 0ef: bipush 1
      // 0f0: iadd
      // 0f1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0f4: goto 0fe
      // 0f7: athrow
      // 0f8: ldc_w ""
      // 0fb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaaba (Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)V
      // 101: iload 1
      // 102: iinc 6 1
      // 105: ifeq 077
      // 108: aload 2
      // 109: invokevirtual java/io/ByteArrayOutputStream.toByteArray ()[B
      // 10c: areturn
   }

   @Override
   public void aabaa() {
      super.aabaa();
      this.b();
   }

   public String baaaa() {
      return ((ababaaabb)this.aabab.abbb()).b();
   }

   private static boolean baaab(String param0, byte[] param1, class_310 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 003: istore 3
      // 004: aload 2
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 017
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 2
      // 011: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 014: ifnonnull 01a
      // 017: bipush 0
      // 018: ireturn
      // 019: athrow
      // 01a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abaa Ljava/lang/ThreadLocal;
      // 01d: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 020: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 023: aload 0
      // 024: iload 3
      // 025: ifne 052
      // 028: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 02b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 02e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 031: ifeq 051
      // 034: aload 2
      // 035: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 038: new net/minecraft/class_2817
      // 03b: dup
      // 03c: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbb
      // 03f: dup
      // 040: aload 1
      // 041: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbb.<init> ([B)V
      // 044: invokespecial net/minecraft/class_2817.<init> (Lnet/minecraft/class_8710;)V
      // 047: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 04a: iload 3
      // 04b: bipush 1
      // 04c: istore 4
      // 04e: ifeq 0dd
      // 051: aload 0
      // 052: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 055: iload 3
      // 056: ifne 0ac
      // 059: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 05c: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 05f: ifeq 0a4
      // 062: goto 066
      // 065: athrow
      // 066: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaab ()Z
      // 069: iload 3
      // 06a: ifne 09e
      // 06d: goto 071
      // 070: athrow
      // 071: ifeq 083
      // 074: goto 078
      // 077: athrow
      // 078: aload 1
      // 079: aload 2
      // 07a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baba ([BLnet/minecraft/class_310;)Z
      // 07d: istore 4
      // 07f: iload 3
      // 080: ifeq 0dd
      // 083: aload 2
      // 084: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 087: new net/minecraft/class_2817
      // 08a: dup
      // 08b: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabba
      // 08e: dup
      // 08f: aload 1
      // 090: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabba.<init> ([B)V
      // 093: invokespecial net/minecraft/class_2817.<init> (Lnet/minecraft/class_8710;)V
      // 096: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 099: bipush 1
      // 09a: goto 09e
      // 09d: athrow
      // 09e: istore 4
      // 0a0: iload 3
      // 0a1: ifeq 0dd
      // 0a4: aload 0
      // 0a5: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0a8: goto 0ac
      // 0ab: athrow
      // 0ac: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 0af: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0b2: iload 3
      // 0b3: ifne 0db
      // 0b6: ifeq 0da
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: aload 2
      // 0be: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 0c1: new net/minecraft/class_2817
      // 0c4: dup
      // 0c5: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbabb
      // 0c8: dup
      // 0c9: aload 1
      // 0ca: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbabb.<init> ([B)V
      // 0cd: invokespecial net/minecraft/class_2817.<init> (Lnet/minecraft/class_8710;)V
      // 0d0: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 0d3: iload 3
      // 0d4: bipush 1
      // 0d5: istore 4
      // 0d7: ifeq 0dd
      // 0da: bipush 0
      // 0db: istore 4
      // 0dd: iload 4
      // 0df: iload 3
      // 0e0: ifne 15e
      // 0e3: ifeq 15c
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: ldc_w -110129937
      // 0ed: ldc_w -1681802671
      // 0f0: ldc_w 100276120
      // 0f3: ixor
      // 0f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 0f7: ldc_w -110129952
      // 0fa: ldc_w -1681802671
      // 0fd: ldc_w -1440712935
      // 100: ixor
      // 101: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 104: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 107: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 10a: aload 0
      // 10b: ldc_w -110129951
      // 10e: ldc_w -1681802671
      // 111: ldc_w 1022856537
      // 114: ixor
      // 115: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 118: ldc_w -110129950
      // 11b: ldc_w -1681802671
      // 11e: ldc_w 1067690061
      // 121: ixor
      // 122: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 125: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 128: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 12b: aload 1
      // 12c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aa ([B)Ljava/lang/String;
      // 12f: astore 10
      // 131: astore 9
      // 133: astore 8
      // 135: astore 7
      // 137: new java/lang/StringBuilder
      // 13a: dup
      // 13b: invokespecial java/lang/StringBuilder.<init> ()V
      // 13e: aload 7
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 143: aload 8
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 148: aload 9
      // 14a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 14d: aload 10
      // 14f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 152: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 155: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaa (Ljava/lang/String;)V
      // 158: goto 15c
      // 15b: athrow
      // 15c: iload 4
      // 15e: istore 5
      // 160: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abaa Ljava/lang/ThreadLocal;
      // 163: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 166: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 169: iload 5
      // 16b: ireturn
      // 16c: astore 6
      // 16e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abaa Ljava/lang/ThreadLocal;
      // 171: getstatic java/lang/Boolean.FALSE Ljava/lang/Boolean;
      // 174: invokevirtual java/lang/ThreadLocal.set (Ljava/lang/Object;)V
      // 177: aload 6
      // 179: athrow
   }

   public boolean baaba(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -859915987
      // 03: istore 4
      // 05: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 08: istore 2
      // 09: aload 1
      // 0a: iload 2
      // 0b: ifne 16
      // 0e: ifnull 24
      // 11: goto 15
      // 14: athrow
      // 15: aload 1
      // 16: iload 2
      // 17: ifne 2b
      // 1a: invokevirtual java/lang/String.isEmpty ()Z
      // 1d: ifeq 27
      // 20: goto 24
      // 23: athrow
      // 24: bipush 0
      // 25: ireturn
      // 26: athrow
      // 27: aload 1
      // 28: invokevirtual java/lang/String.toLowerCase ()Ljava/lang/String;
      // 2b: astore 3
      // 2c: aload 3
      // 2d: ldc_w -110129949
      // 30: iload 4
      // 32: ldc_w -1232421260
      // 35: ixor
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 39: ldc_w -110129948
      // 3c: iload 4
      // 3e: ldc_w 790386698
      // 41: ixor
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 45: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 4b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 4e: iload 2
      // 4f: ifne bc
      // 52: ifne bb
      // 55: goto 59
      // 58: athrow
      // 59: aload 3
      // 5a: ldc_w -110129947
      // 5d: iload 4
      // 5f: ldc_w -2008726459
      // 62: ixor
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 66: ldc_w -110129946
      // 69: iload 4
      // 6b: ldc_w -29066181
      // 6e: ixor
      // 6f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 72: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 75: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 78: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 7b: iload 2
      // 7c: ifne bc
      // 7f: goto 83
      // 82: athrow
      // 83: ifne bb
      // 86: goto 8a
      // 89: athrow
      // 8a: aload 3
      // 8b: ldc_w -110129945
      // 8e: iload 4
      // 90: ldc_w 447686334
      // 93: ixor
      // 94: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 97: ldc_w -110129928
      // 9a: iload 4
      // 9c: ldc_w -972290129
      // 9f: ixor
      // a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // a6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // a9: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // ac: iload 2
      // ad: ifne bc
      // b0: goto b4
      // b3: athrow
      // b4: ifeq bf
      // b7: goto bb
      // ba: athrow
      // bb: bipush 1
      // bc: goto c0
      // bf: bipush 0
      // c0: ireturn
   }

   public boolean baabb(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1b
      // 09: ifnull 21
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aabab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 14: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 17: goto 1b
      // 1a: athrow
      // 1b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb;
      // 1e: if_acmpeq 24
      // 21: bipush 0
      // 22: ireturn
      // 23: athrow
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaab ()Z
      // 27: iload 2
      // 28: ifne 40
      // 2b: ifeq 4f
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 36: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 39: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 3c: goto 40
      // 3f: athrow
      // 40: iload 2
      // 41: ifne 4c
      // 44: ifeq 4f
      // 47: goto 4b
      // 4a: athrow
      // 4b: bipush 1
      // 4c: goto 50
      // 4f: bipush 0
      // 50: ireturn
   }

   private void b() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: aload 0
      // 04: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aabab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 07: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0a: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb
      // 0d: astore 2
      // 0e: istore 1
      // 0f: aload 0
      // 10: iload 1
      // 11: ifne 29
      // 14: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babbaab ()Z
      // 17: ifeq 3e
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 22: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 25: goto 29
      // 28: athrow
      // 29: checkcast java/lang/Boolean
      // 2c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f: iload 1
      // 30: ifne 3b
      // 33: ifeq 3e
      // 36: goto 3a
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: istore 3
      // 40: iload 1
      // 41: ifne 68
      // 44: aload 2
      // 45: aload 0
      // 46: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb;
      // 49: if_acmpne 5e
      // 4c: goto 50
      // 4f: athrow
      // 50: iload 3
      // 51: aload 0
      // 52: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbab Z
      // 55: if_icmpne 5e
      // 58: goto 5c
      // 5b: athrow
      // 5c: return
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 2
      // 60: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb;
      // 63: aload 0
      // 64: iload 3
      // 65: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbab Z
      // 68: aload 2
      // 69: iload 1
      // 6a: ifne 7c
      // 6d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb;
      // 70: if_acmpeq 82
      // 73: goto 77
      // 76: athrow
      // 77: aload 2
      // 78: goto 7c
      // 7b: athrow
      // 7c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb;
      // 7f: if_acmpne 87
      // 82: bipush 1
      // 83: goto 88
      // 86: athrow
      // 87: bipush 0
      // 88: istore 4
      // 8a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabba.b Lnet/minecraft/class_8710$class_9154;
      // 8d: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabba.aa ()[B, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabba;)[B ]
      // 92: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 95: iload 3
      // 96: iload 1
      // 97: ifne a3
      // 9a: ifeq c0
      // 9d: goto a1
      // a0: athrow
      // a1: iload 4
      // a3: iload 1
      // a4: ifne b1
      // a7: ifeq c0
      // aa: goto ae
      // ad: athrow
      // ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaab ()Z
      // b1: iload 1
      // b2: ifne bd
      // b5: ifne c0
      // b8: goto bc
      // bb: athrow
      // bc: bipush 1
      // bd: goto c1
      // c0: bipush 0
      // c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbbb (Lnet/minecraft/class_8710$class_9154;Ljava/util/function/Function;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;Z)V
      // c4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbb.b Lnet/minecraft/class_8710$class_9154;
      // c7: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbb.b ()[B, (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbb;)[B ]
      // cc: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // cf: iload 3
      // d0: ifeq f4
      // d3: aload 2
      // d4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb;
      // d7: if_acmpne f4
      // da: goto de
      // dd: athrow
      // de: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babba ()Z
      // e1: iload 1
      // e2: ifne f1
      // e5: goto e9
      // e8: athrow
      // e9: ifne f4
      // ec: goto f0
      // ef: athrow
      // f0: bipush 1
      // f1: goto f5
      // f4: bipush 0
      // f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbbb (Lnet/minecraft/class_8710$class_9154;Ljava/util/function/Function;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;Z)V
      // f8: return
   }

   public static boolean babaa(class_2960 param0) {
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
      // 05: ifnonnull 0b
      // 08: bipush 0
      // 09: ireturn
      // 0a: athrow
      // 0b: ldc_w -110129927
      // 0e: ldc_w 1238684415
      // 11: ldc_w -291202779
      // 14: ixor
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 18: ldc_w -110129926
      // 1b: ldc_w 1238684415
      // 1e: ldc_w 540955155
      // 21: ixor
      // 22: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 25: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 28: iload 1
      // 29: ifne 61
      // 2c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2f: aload 0
      // 30: invokevirtual net/minecraft/class_2960.method_12836 ()Ljava/lang/String;
      // 33: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 36: ifeq 77
      // 39: goto 3d
      // 3c: athrow
      // 3d: ldc_w -110129925
      // 40: ldc_w 1238684415
      // 43: ldc_w -795444901
      // 46: ixor
      // 47: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 4a: ldc_w -110129924
      // 4d: ldc_w 1238684415
      // 50: ldc_w 1003407148
      // 53: ixor
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bbaba (II)I
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ba (II)Ljava/lang/String;
      // 5a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 5d: goto 61
      // 60: athrow
      // 61: aload 0
      // 62: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 65: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 68: iload 1
      // 69: ifne 74
      // 6c: ifeq 77
      // 6f: goto 73
      // 72: athrow
      // 73: bipush 1
      // 74: goto 78
      // 77: bipush 0
      // 78: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -477796419;
      int var33 = 0;
      String[] var31 = new String[8];
      int var32 = 0;
      int var30 = "ٲ눁䅰ꢦ㥃뎮禀믁ᅶꌦ륀ꑎ놆ꬡ煳ꗆ煅꼎㦁ꞁ慶ꨆॄ뼮놄ꖁ녳굆祁꺎ꆄ눡Ű녦楆뉮ঁ뿁ㅱꈆ쥁녮憀뵁ꅳꎦ᥀럎\ue984뚁ㅱꀦ셃ꉎ概빁㥲꤆ꅂꌎ\u0984ꅡ辰ꡦ\ue144ꊮƀꮡ\uf173ꦦ饁맮\ud985ꟁ\uf177ꌆूꈎᆆ볡\uf171걦륀닮\ud987덁\uf177밆ꅇ뎮要몡腲귦\ue142ꋮ\ue984뢁ⅰꗦ텅뇎ꦄꅡ\ue972볦ꥄ긎\ue980꜁奷렦ᅀ렮Ƅꀁ\ue971뛆祁ꩮ⦆뤡慴닆ꥇꊮ솆ꙁ亮ꫦ\ue146뷎놂떁셶Ꞇ煄ꔮᆅ꼡奱럦륂뎮⦄ꎡŲ꾦텄깎ᦆ뉁䅶갆聾늎憀뎡\uf177ꦦ\ue140땎熄뻁ॷꬆ酁넎톁ꑁ煳뼦\ud944ꇮᆆ뽁⥳ꀆ酁떮憅ꯁ亮넆䥁ꪎ榄ꆁ쥳ꭦ奂괮ㆆ궁䥵딦煂ꕎ놃ꦡ腵ꏆ楆ꫮ톀밁㥱놦\ud941ꑎᆂ룡饴Ᶎ년ꧮ冇긁ꥱ븦䅅룎㦇ꗡ祷룆酄ꨎ톁ꬡ殺뺆\uf146돮ᆁꯁ腷딦⅄땮즄뉁祷뮆充궮禅뷡腲뚆楀ꮮ\ud981밡饷밦ꥄ蜮\ud98c蜁ㅾ豆\ue94d胎즈芁ㅼ袆륈趮㦋謡䅺臦ᅌ陮ᦊ鏡腹荆㥉鿎覎蒡兺鬆㥎蠮䆈舁\uf178飆慊龮릈餡㥹躦\ue94d袎즋譡셿霆\ud94a襮憋驁셻藆\ue14b萎ꦏ顁襽逆慍轎醈蟁\ue17a韆慉蒮馋裁楹集⅍蟮䦎鍁慿蒦䅎賎膈鶁襹鐦쥏蕎膌黡\uf17a螆酈野ↈ赁䅺隆饊蛎\u218f铡ſ轆祈鈮\ue98f萡ॿ蛆\ud94b鬮⦈钡ⅹ陦饊鹎䦏郁\ue17b趦\ud94b迮歷詡䅾魦ᅎ襮醉要\ud97f肆\ud94e舮ᆋ鍡酻裦\ud948趎ᦌ舡典铆兏鶮\ue98c財녻遦\ue94e麎㦌郡Ź褆光錎覊銡\u197b芆᥊鿎ꦈ놁\ud97e鐦텊鷮榌鼁糧衆慏鴮솉譁ㅹ蒦兎覮禈趡腹肆腉鏮Ɖ趡ź鳦酉閎福駡祺髦\ud949裮ꆈ鄁ॿ脆屢蕮놏遁륿辦ꥎ逮膍薡셽迦ᅍ蕮膌锡ॾ鉦⅌詮福觡\ue97c账腋贎ঌ阁\ud97e螆態黎禌逡\ue979遆녈貎⦊駡䥹貦\ud94b葮릊肁를鵦녉脮농鴡\uf178\ue866ꅑ\ue3ce憐\ueea1셤\uf8e6\ue955\uf32e禒\uf2a1䥡\uf3e6慓\ue4ce榒\ue821ꥡ\ue846慐\uf1ce톑\ue721⥤\ue786煑\uf26e憕\uf721饧ﾆ䅖\ue8ae솗\ueae1ᅧ\uedc6ॖ\uf6ee膔\uec01饡\ue026襒ﭮᦕ\ue201।\uec26饗ﴎᦓ\ue1e1煥\ue3e6쥖\uf04e놖\uf621ᅤ\uf7e6煗ﲎ醗\uef01텡\uf746酔\ueeae熗\uf5c1쥡\ued06酖\uf8ce솒\ue761慣ﳆ㥖\uf18e榔\ue8a1⥡\uefe6酒\uefce憐\uea81祤\uecc6襗\uea6eᦑ\uf461\ud964\ueda6⥔\uf72e䦒ﲁᥡ\uee86셓\ue1ee䆒﵁Ⅲ\uf4a6텐\ue4ae릒度ᥣ︆祗\uf1ae솓\uf461셠Ｆ\uf152\ueb8eᦖ\ue041䥠\uf446ꅒ\uea0e馑\uef41襢\ue9e6쥗\ue56e즒更襣\uec26ㅐ漏妓\uf581䥥\ue246ॗﳮᆔ\uefa1ㅦ\ue446\ua955\uecae䦑\ue141Ⅵ\uf546ᥐﭮ妔\uef81襠\uef26ꅗ\ue06e熒\ueba1\ud964\ue766䅒\uf06eꆐ\ue301륡\uece6\ue150\uf6ae㦐ﻁ煦\ue9e6酓\uee6eƓ\uf141慡\uf5a6⅐\ue6ae즒\uf321\ud961\uea46ㅕ搜䦖ﷁㅡ\uf0e6㥒\ue20e煉\ue5a1쥣ﬆ⅔\ue64e\ud991\uf201酠\uf826녕搜ᆕ\uf321楡復œ\ue46eᦑ\uf141䥠\uee66煓\ue20e練\uf7c1쥠\ue746兖\ue10eᆕ\ue101楥ￆ\ue951\ue58e릐\ue5a1ᅠﻦ⅔\uf02e榔\ueaa1쥦惘祕\ue38e冔\ue381ㅧ\uf806⅗癩ꆔ쿁\ue16f쏦⥜쀮㦞육䥭큦煘왮ᦛ웁酯챦煛숎즙튁饪퇆쥟씎⦛힁\ue96c푦ㅛ\uda0eᦜ\ud9a1쥪쩦樂\uddceƘ읡⥭풦腟쓎ꆜ쇡\ue968팦䥞\udf8e榟툡⥬쀆\ue95d죮즚\ud8e1\ue16e퇦饟찎놝쒁酯챆慘턎军\ud841ꥭ튆酘틮톟슡ㅭ웦\ua959탮솛쒁셮젦奙숮톝\ud8e1楯\udee6ㅟ쩎禞쐁२\ud806ख़읮\ue19a\udd61ꅨ솆䅜쟎톚젡७줦템햮Ɲ짡\ue96f펦㥘옎⦙쾁ꅬ셆텚\udb8e솝펡텯왦⥘춮\ue198ퟡ祪홆ㅚ톮禞즡५\udec6䥘챮㆟퐁⥬킦楜쌎\ue998\ud941\ue169삦ꅛ쁮䆘\ud981ᅬ\ud9e6煘\uddaeᦝ\ud861⥯\ud8e6楘쒮㦞짡奯핦楙쥮톘쀡饫욦襟웮㆝쑡八쎆奘줎㆙쪡煮\ud7a6慘\udf0e⦚얁奪챆셚캎ꦙ팁㥩쨆क़턎\uf199홁ㅭퟦᥚ씎ꦛ퉁Ⅸ욦ड़죎즞\ud921\uf169좆⥜츎ꦛ헁ꅮ쵆⥞졎톜쮡祪썦\ua95bퟮꦛ혁텮\udac6य़썮禜틁煪턆奛챎䆟\udf81慩퐆丹쑎䦚싡ㅭ\udda6ज़\udc6e憘영䅨칆Ŝ⎮\ud9a7㝁䅔㐦䅢〮禦⧁॓⧦內㬎ᆥ⣡兗ㄦㅦ㱮\ud9a6┡楐ㅦ不⏎\ud9a3、ꅔ㢆ꥦ⒮থ\u3101\ud953⯆㥤⃮憧╁煐⒦祡㾎ꦡ㘁텕⩆ᅤ㋎놦⍁䅖⸆㥣ℎ醢㼡॔⭆煥⠮톣㸁楒㎦녠⎮䆢ॡ⅐…쥦㔮↧㳁襒㜦祦ㄎ禡ⱡ奕㬆ᅣ⑮\ue9a2⎡ᅔⲆ酤⤮禠␡ᅗ㫦䥥㾎廉㨁륔⥆酥㯮㦤㙁兑⡆奣㛎놥\u2061ꅑ㵆ꅦ㕮榦㺡ᅔ㒦\ue966㱮릣㗁䥕㰆⥠▮㦢㕁\ue156㖆률❮覦㐡祓㩆祣⋮ᦤ━綾㙆쥥㟮妢㷡稜㸦ꅢⳮ토∡\ud956㬦Š❎톦□㥖㠦ㅢ㣎↧\u20c1祓㡦녣㠮簾₡ꅖ㝆\ud962\u2d2e솢⏡奐㗆Ţ㈮토㑡ᅐ⣆녠㍮ꦡ㫁祒㝆륤ⴎ熧℁ㅓ㲦楢㴮冢㏡\uf156㍦ㅢ㣮殮⊁煓⾆쥡⥮즣㡡⥐㯦ꅣ㩮冣㒡奕㚆兤≎\ue1a6㽡慓㭆兡㯮ㆥ㵁륒⡦텢㋎ꆥ℡慕㢦酥㸮솤㨡ㅔ㔦率㼮즧㭡奖\u2d26㥠㘮ᦠ┡慑ᵆŬ\u0feeꆫᶁ拏Ӧ쥫ᖮ榬ց\uf15a&셩೮즮ᶁ⥞ದꅯ\u008e㦭ᑁ煙ᎦⅬ\u1cce↨ౡ饟Ԇ煮î禭ॡ楝ᝦ셮\u0b0e솫၁셚ࠦ२ޮ馯ᬡꅜ߆녩౮ᦪ၁륙ᛆ慯ྎƭᤁ륜ሦŨ֎醮Ꮑᥜǆ腨ڮㆫǡ\ue158ᅦ奨Ꭾƪଁᅟឆᅬᱎ憨ᄡ饘ֆ業၎妩ޡ慝ྦ楨ൎꆩᵁ\uf15bḆ녪ቮ\uf1a9ᓡ酘ᧆ索ཎ톯́樂ࢦů࣎নԁग़ᬦ腬᭮নᑡ菱҆텩Ἆ嶺ݡ녙ᗦ\uf168മ醮ᤡ祜ᧆ酩ᬎবᐁ䅛ᬆ\u196eൎᆯׁ腜ๆꥨሮ\uf1adᬁ腝Æꥩᎎ囹\u12c1क़ᬦ煮̎ᦨˁ襟ጆ४ᚎ禫ᄡ륚Ꭶ\ud969\u192e⦬ມ慞ަ㥬Ӯ톬ᮁ䥞Ԇ參\u086eꦬᄡ\ua95eԦŮɮ↯ᓁ楝ኆ\ue16cᯮ⦫ม酘Ủ䅩\u0a0e즮ȡ煛͆參\u0c4eᦪᯡ奞ᛆ⥯ͮ冯࿁śᡦꥪஎ馬࣡拏զᅯ\u098e馩ف⅘ෆ녫ᖮᆬց楚Ḇ\ue96cᇮ妩အᅙ\u0ac6祬\u0eee놮᠁慜ᢆᅬ\u1b4e\u19acρ⅚ᘆ奩ᆮ䆪杁煁甦慴禮\uf1b5溡ᅃ氦\ue974毎\ue9b4筡Ń沆\ud977檎馶樁䅅椆\ue177斎榰眡᥆沆\ue976挮憶湁⥄祆兰櫮䆵繡酃綆ᅱ碎䦰湁ु碦饲磮↲澡\ue944抆\ue175獮↱竡⅃糦\uf174汮禰斁ㅁ祆ᥱ熎膱涁ु慆\ud971枎\u09b1拁慅稦䅱羮禶朁ㅂ璦关敮䆴恡⥆眦\uf176猎⦳癁ń怦䅶朮熱摁쥄璦祲绮㦱扁녀焦䅰痎ꦶ痁ń符酲揮\u09b31苨ጿ蛏䬌蘧㏍須ጻ蟏⬎銧寍譨欹遏⌌龧ꯍ諨ꌾ邏㌈鬇Ꮙ耨쬻頏⌌茧叉踨⌽軏쬎蛇㯏軨\udb3e鶏\uab0f鴧ᯋ苈\ueb3c阏\uab08醇\udbcf黨\u0080眷ೀ罰\uf4f0涘琲泗\udcc4潐\uecf3磸\uf431獷䳁礐퓰熘谳旗쳀怐ᓱ歘氵獷䳆瘐쳲瀘ᐰ朷蓅溰쳵稸찳滗Ⓚ洰\u2cf7睸䰲泗㳄新擴澘ﰴ杷ﳂ熐쓷罸就斷铀翐鳰柸ఱ灷瓅盐\ue4f6沘㐰猗ᓂ琐ﳱ煘\udc36竗Ӏ湰\uf4f0眸氷捗듀纐㓱擸ᰴ碗\uecc6籐곳殸琲煗铂楐\u2cf7泸퐰溗\udcc4曐泴殸\uec37稷꓁疰복炘\u2433瀗\uf4c2现ꓳ涸氵籗铁楰곴炘吰籗哄欰糴永吴缗쳆\n몞ꚳꖹ溆긱鹄뵞嚶ꮙꚇ\u0010\ued07ᣥ\ueb80裑ﳈ젒\uf0a7⣢\ue000プ\ue528젓\uf107\uf0e7\uf860ზ\n\udc56ᒪ썱\udc9f죹ⱝ\udb96\ue4af쵑ᒞ\u0018欳㗂擴鷳燼봳痓᷅猴䷰猜㔶瑳\uddc3栴엱楼鴰矓ⷀ泴旴玜\udd30\n歬\uda07瑋ሲ翃\ue2f0沬⨂穫\uda33"
         .length();
      short var34 = 28867;
      String var29 = "ٲ눁䅰ꢦ㥃뎮禀믁ᅶꌦ륀ꑎ놆ꬡ煳ꗆ煅꼎㦁ꞁ慶ꨆॄ뼮놄ꖁ녳굆祁꺎ꆄ눡Ű녦楆뉮ঁ뿁ㅱꈆ쥁녮憀뵁ꅳꎦ᥀럎\ue984뚁ㅱꀦ셃ꉎ概빁㥲꤆ꅂꌎ\u0984ꅡ辰ꡦ\ue144ꊮƀꮡ\uf173ꦦ饁맮\ud985ꟁ\uf177ꌆूꈎᆆ볡\uf171걦륀닮\ud987덁\uf177밆ꅇ뎮要몡腲귦\ue142ꋮ\ue984뢁ⅰꗦ텅뇎ꦄꅡ\ue972볦ꥄ긎\ue980꜁奷렦ᅀ렮Ƅꀁ\ue971뛆祁ꩮ⦆뤡慴닆ꥇꊮ솆ꙁ亮ꫦ\ue146뷎놂떁셶Ꞇ煄ꔮᆅ꼡奱럦륂뎮⦄ꎡŲ꾦텄깎ᦆ뉁䅶갆聾늎憀뎡\uf177ꦦ\ue140땎熄뻁ॷꬆ酁넎톁ꑁ煳뼦\ud944ꇮᆆ뽁⥳ꀆ酁떮憅ꯁ亮넆䥁ꪎ榄ꆁ쥳ꭦ奂괮ㆆ궁䥵딦煂ꕎ놃ꦡ腵ꏆ楆ꫮ톀밁㥱놦\ud941ꑎᆂ룡饴Ᶎ년ꧮ冇긁ꥱ븦䅅룎㦇ꗡ祷룆酄ꨎ톁ꬡ殺뺆\uf146돮ᆁꯁ腷딦⅄땮즄뉁祷뮆充궮禅뷡腲뚆楀ꮮ\ud981밡饷밦ꥄ蜮\ud98c蜁ㅾ豆\ue94d胎즈芁ㅼ袆륈趮㦋謡䅺臦ᅌ陮ᦊ鏡腹荆㥉鿎覎蒡兺鬆㥎蠮䆈舁\uf178飆慊龮릈餡㥹躦\ue94d袎즋譡셿霆\ud94a襮憋驁셻藆\ue14b萎ꦏ顁襽逆慍轎醈蟁\ue17a韆慉蒮馋裁楹集⅍蟮䦎鍁慿蒦䅎賎膈鶁襹鐦쥏蕎膌黡\uf17a螆酈野ↈ赁䅺隆饊蛎\u218f铡ſ轆祈鈮\ue98f萡ॿ蛆\ud94b鬮⦈钡ⅹ陦饊鹎䦏郁\ue17b趦\ud94b迮歷詡䅾魦ᅎ襮醉要\ud97f肆\ud94e舮ᆋ鍡酻裦\ud948趎ᦌ舡典铆兏鶮\ue98c財녻遦\ue94e麎㦌郡Ź褆光錎覊銡\u197b芆᥊鿎ꦈ놁\ud97e鐦텊鷮榌鼁糧衆慏鴮솉譁ㅹ蒦兎覮禈趡腹肆腉鏮Ɖ趡ź鳦酉閎福駡祺髦\ud949裮ꆈ鄁ॿ脆屢蕮놏遁륿辦ꥎ逮膍薡셽迦ᅍ蕮膌锡ॾ鉦⅌詮福觡\ue97c账腋贎ঌ阁\ud97e螆態黎禌逡\ue979遆녈貎⦊駡䥹貦\ud94b葮릊肁를鵦녉脮농鴡\uf178\ue866ꅑ\ue3ce憐\ueea1셤\uf8e6\ue955\uf32e禒\uf2a1䥡\uf3e6慓\ue4ce榒\ue821ꥡ\ue846慐\uf1ce톑\ue721⥤\ue786煑\uf26e憕\uf721饧ﾆ䅖\ue8ae솗\ueae1ᅧ\uedc6ॖ\uf6ee膔\uec01饡\ue026襒ﭮᦕ\ue201।\uec26饗ﴎᦓ\ue1e1煥\ue3e6쥖\uf04e놖\uf621ᅤ\uf7e6煗ﲎ醗\uef01텡\uf746酔\ueeae熗\uf5c1쥡\ued06酖\uf8ce솒\ue761慣ﳆ㥖\uf18e榔\ue8a1⥡\uefe6酒\uefce憐\uea81祤\uecc6襗\uea6eᦑ\uf461\ud964\ueda6⥔\uf72e䦒ﲁᥡ\uee86셓\ue1ee䆒﵁Ⅲ\uf4a6텐\ue4ae릒度ᥣ︆祗\uf1ae솓\uf461셠Ｆ\uf152\ueb8eᦖ\ue041䥠\uf446ꅒ\uea0e馑\uef41襢\ue9e6쥗\ue56e즒更襣\uec26ㅐ漏妓\uf581䥥\ue246ॗﳮᆔ\uefa1ㅦ\ue446\ua955\uecae䦑\ue141Ⅵ\uf546ᥐﭮ妔\uef81襠\uef26ꅗ\ue06e熒\ueba1\ud964\ue766䅒\uf06eꆐ\ue301륡\uece6\ue150\uf6ae㦐ﻁ煦\ue9e6酓\uee6eƓ\uf141慡\uf5a6⅐\ue6ae즒\uf321\ud961\uea46ㅕ搜䦖ﷁㅡ\uf0e6㥒\ue20e煉\ue5a1쥣ﬆ⅔\ue64e\ud991\uf201酠\uf826녕搜ᆕ\uf321楡復œ\ue46eᦑ\uf141䥠\uee66煓\ue20e練\uf7c1쥠\ue746兖\ue10eᆕ\ue101楥ￆ\ue951\ue58e릐\ue5a1ᅠﻦ⅔\uf02e榔\ueaa1쥦惘祕\ue38e冔\ue381ㅧ\uf806⅗癩ꆔ쿁\ue16f쏦⥜쀮㦞육䥭큦煘왮ᦛ웁酯챦煛숎즙튁饪퇆쥟씎⦛힁\ue96c푦ㅛ\uda0eᦜ\ud9a1쥪쩦樂\uddceƘ읡⥭풦腟쓎ꆜ쇡\ue968팦䥞\udf8e榟툡⥬쀆\ue95d죮즚\ud8e1\ue16e퇦饟찎놝쒁酯챆慘턎军\ud841ꥭ튆酘틮톟슡ㅭ웦\ua959탮솛쒁셮젦奙숮톝\ud8e1楯\udee6ㅟ쩎禞쐁२\ud806ख़읮\ue19a\udd61ꅨ솆䅜쟎톚젡७줦템햮Ɲ짡\ue96f펦㥘옎⦙쾁ꅬ셆텚\udb8e솝펡텯왦⥘춮\ue198ퟡ祪홆ㅚ톮禞즡५\udec6䥘챮㆟퐁⥬킦楜쌎\ue998\ud941\ue169삦ꅛ쁮䆘\ud981ᅬ\ud9e6煘\uddaeᦝ\ud861⥯\ud8e6楘쒮㦞짡奯핦楙쥮톘쀡饫욦襟웮㆝쑡八쎆奘줎㆙쪡煮\ud7a6慘\udf0e⦚얁奪챆셚캎ꦙ팁㥩쨆क़턎\uf199홁ㅭퟦᥚ씎ꦛ퉁Ⅸ욦ड़죎즞\ud921\uf169좆⥜츎ꦛ헁ꅮ쵆⥞졎톜쮡祪썦\ua95bퟮꦛ혁텮\udac6य़썮禜틁煪턆奛챎䆟\udf81慩퐆丹쑎䦚싡ㅭ\udda6ज़\udc6e憘영䅨칆Ŝ⎮\ud9a7㝁䅔㐦䅢〮禦⧁॓⧦內㬎ᆥ⣡兗ㄦㅦ㱮\ud9a6┡楐ㅦ不⏎\ud9a3、ꅔ㢆ꥦ⒮থ\u3101\ud953⯆㥤⃮憧╁煐⒦祡㾎ꦡ㘁텕⩆ᅤ㋎놦⍁䅖⸆㥣ℎ醢㼡॔⭆煥⠮톣㸁楒㎦녠⎮䆢ॡ⅐…쥦㔮↧㳁襒㜦祦ㄎ禡ⱡ奕㬆ᅣ⑮\ue9a2⎡ᅔⲆ酤⤮禠␡ᅗ㫦䥥㾎廉㨁륔⥆酥㯮㦤㙁兑⡆奣㛎놥\u2061ꅑ㵆ꅦ㕮榦㺡ᅔ㒦\ue966㱮릣㗁䥕㰆⥠▮㦢㕁\ue156㖆률❮覦㐡祓㩆祣⋮ᦤ━綾㙆쥥㟮妢㷡稜㸦ꅢⳮ토∡\ud956㬦Š❎톦□㥖㠦ㅢ㣎↧\u20c1祓㡦녣㠮簾₡ꅖ㝆\ud962\u2d2e솢⏡奐㗆Ţ㈮토㑡ᅐ⣆녠㍮ꦡ㫁祒㝆륤ⴎ熧℁ㅓ㲦楢㴮冢㏡\uf156㍦ㅢ㣮殮⊁煓⾆쥡⥮즣㡡⥐㯦ꅣ㩮冣㒡奕㚆兤≎\ue1a6㽡慓㭆兡㯮ㆥ㵁륒⡦텢㋎ꆥ℡慕㢦酥㸮솤㨡ㅔ㔦率㼮즧㭡奖\u2d26㥠㘮ᦠ┡慑ᵆŬ\u0feeꆫᶁ拏Ӧ쥫ᖮ榬ց\uf15a&셩೮즮ᶁ⥞ದꅯ\u008e㦭ᑁ煙ᎦⅬ\u1cce↨ౡ饟Ԇ煮î禭ॡ楝ᝦ셮\u0b0e솫၁셚ࠦ२ޮ馯ᬡꅜ߆녩౮ᦪ၁륙ᛆ慯ྎƭᤁ륜ሦŨ֎醮Ꮑᥜǆ腨ڮㆫǡ\ue158ᅦ奨Ꭾƪଁᅟឆᅬᱎ憨ᄡ饘ֆ業၎妩ޡ慝ྦ楨ൎꆩᵁ\uf15bḆ녪ቮ\uf1a9ᓡ酘ᧆ索ཎ톯́樂ࢦů࣎নԁग़ᬦ腬᭮নᑡ菱҆텩Ἆ嶺ݡ녙ᗦ\uf168മ醮ᤡ祜ᧆ酩ᬎবᐁ䅛ᬆ\u196eൎᆯׁ腜ๆꥨሮ\uf1adᬁ腝Æꥩᎎ囹\u12c1क़ᬦ煮̎ᦨˁ襟ጆ४ᚎ禫ᄡ륚Ꭶ\ud969\u192e⦬ມ慞ަ㥬Ӯ톬ᮁ䥞Ԇ參\u086eꦬᄡ\ua95eԦŮɮ↯ᓁ楝ኆ\ue16cᯮ⦫ม酘Ủ䅩\u0a0e즮ȡ煛͆參\u0c4eᦪᯡ奞ᛆ⥯ͮ冯࿁śᡦꥪஎ馬࣡拏զᅯ\u098e馩ف⅘ෆ녫ᖮᆬց楚Ḇ\ue96cᇮ妩အᅙ\u0ac6祬\u0eee놮᠁慜ᢆᅬ\u1b4e\u19acρ⅚ᘆ奩ᆮ䆪杁煁甦慴禮\uf1b5溡ᅃ氦\ue974毎\ue9b4筡Ń沆\ud977檎馶樁䅅椆\ue177斎榰眡᥆沆\ue976挮憶湁⥄祆兰櫮䆵繡酃綆ᅱ碎䦰湁ु碦饲磮↲澡\ue944抆\ue175獮↱竡⅃糦\uf174汮禰斁ㅁ祆ᥱ熎膱涁ु慆\ud971枎\u09b1拁慅稦䅱羮禶朁ㅂ璦关敮䆴恡⥆眦\uf176猎⦳癁ń怦䅶朮熱摁쥄璦祲绮㦱扁녀焦䅰痎ꦶ痁ń符酲揮\u09b31苨ጿ蛏䬌蘧㏍須ጻ蟏⬎銧寍譨欹遏⌌龧ꯍ諨ꌾ邏㌈鬇Ꮙ耨쬻頏⌌茧叉踨⌽軏쬎蛇㯏軨\udb3e鶏\uab0f鴧ᯋ苈\ueb3c阏\uab08醇\udbcf黨\u0080眷ೀ罰\uf4f0涘琲泗\udcc4潐\uecf3磸\uf431獷䳁礐퓰熘谳旗쳀怐ᓱ歘氵獷䳆瘐쳲瀘ᐰ朷蓅溰쳵稸찳滗Ⓚ洰\u2cf7睸䰲泗㳄新擴澘ﰴ杷ﳂ熐쓷罸就斷铀翐鳰柸ఱ灷瓅盐\ue4f6沘㐰猗ᓂ琐ﳱ煘\udc36竗Ӏ湰\uf4f0眸氷捗듀纐㓱擸ᰴ碗\uecc6籐곳殸琲煗铂楐\u2cf7泸퐰溗\udcc4曐泴殸\uec37稷꓁疰복炘\u2433瀗\uf4c2现ꓳ涸氵籗铁楰곴炘吰籗哄欰糴永吴缗쳆\n몞ꚳꖹ溆긱鹄뵞嚶ꮙꚇ\u0010\ued07ᣥ\ueb80裑ﳈ젒\uf0a7⣢\ue000プ\ue528젓\uf107\uf0e7\uf860ზ\n\udc56ᒪ썱\udc9f죹ⱝ\udb96\ue4af쵑ᒞ\u0018欳㗂擴鷳燼봳痓᷅猴䷰猜㔶瑳\uddc3栴엱楼鴰矓ⷀ泴旴玜\udd30\n歬\uda07瑋ሲ翃\ue2f0沬⨂穫\uda33";

      do {
         char var35 = var29.charAt(var33);
         int var37 = 0;
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            int var38 = var36[var37];

            var38 = (char)(switch (var37 % 6) {
               default -> 38;
               case 1 -> 155;
               case 2 -> 225;
               case 3 -> 172;
               case 4 -> 233;
               case 5 -> 106;
            }) ^ var38;
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 5 | var38 << 11) & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 5 | var38 >>> 11) & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      baaaa = var31;
      baaab = new Object[var31.length];
      int var25 = 1795630552;
      byte[] var23 = "Na\u008f\u009cGòO\u007f\u008f1@_ûY\u008d¹Q\bÖv\u001cËR_\u0007r´w'vçîØ³ç\u008f_\u0092Û»|b\u001cDaph4mãæ8\u0094\u0099Ð|d·Ó#\u0088\b\u008cÄ6Ã=Gû¤§\u0097?lÿµóbæu·\u0092 TRV\u001c\u0093ÌS\u0000è\u0091'\u008b´Ñ\u0006>Á£\u0003eüªM\u007f\u0007\u0092\u0017A¸\u008flè\tJ¡4L4\u0087Ë¹(äÔ\u009fÁÀÀD\"2ûD\nÝn\u009dÍò\u0082<ì\u00adI\u001d\u0088S¾B6õ\u0086cZ\u0094åñv\u009dûi\u0011ù@Ñ¥\f®ÖÇ\u0083Ü\u0014>rÕòW\u0011\u0001[µµ\u0091o\u001dk²wè%\fiá:/S(C\u0085Í¤øe5\u0011$ÿí\u009fDÿd¨d,ú¥/j\u0081~ÛOL\u009eQã÷ ð;³0t\u0018\u0080,AÚWÚ÷±\b]\r#òÏ±79\u008fÿ¬øq)?ÎÛ\u0001ó\u001b¹\u0095\u0012ÞM\u009fZ2d\u008dÀ,÷\u00051\u0003kUgúÅ¦~×6sg«ëpVïHòZð¢¿a\u001b\u000esÿo\u007fÍÄãëz¸óÒ\u008cÔÚÚ¯\u0001¼zàf\fÝz\u0091ì0}««ÁQr\u0081\u0004\u009c6Ë\u0084\u0003r\u009c\u00063ÍÏ;Þ\u0007\u009dbÈÓJqÕ@)+o\u0097eV\u0088¶:\u001e\u001d£\u0015Öc©ì*ÝE(>4\u0091`¦L8A\u0093ÎAÙ]V»p\u008akâ¨\u0090C¬b\u0090X}Lñ\u0017\u0002Ò\u0094jtzÕ|=dÊ\u0006C\u009e\u009d\u009aZ\\\u0088ñ\u008f\tnk\u000fz£\"\u00adZ|køn¦Xx\u001emPZ½¸â\u0004\u0093vÁÑ-é\u007f Ú\u008c\u0014a\u0015\u0017_º+\u008e+\bf\u009f\u0095\u0001;\u0015\u007fÞÄ¤}ád\u0002h\u008cÈ\u0092_±T\u009dá#ý²c¨=¢·íKBËÈuWÿ«=¼L\u0006EÃQ\u001f\u0081\u009aVÊ¢4H!Î?\u0094Üà[0=ì\u0081nUû?\u001cBP:Nï>\u000baÌ2ºHª%Áì%ýíG¦(úx\u0005û¢i\u0088@Ú2\u0092Æ¥\u0084.n\u0004ÍÁù¢«\u0098ÌtG4\u001e×Ïô»ù\u0096\t=\u0010²³\u001fæ}ë]\u0083PX\u0005â\u001c°\u0099`®ä¯V\u0010¯ìÅ7®ÜbQ\u001cÑïÍÓÀ\u0085¯¥#n¤Ðóâ3r\u0017\u001f\roÝ\u001fü\u008b-ù6x\u0003tM$\u001b$4b\u000e\u0096z\u0017L\u0018©\u001b´í4þ-Ujãð?\u0086\u000bgÁP\u0002éQ\u0003\u0088\nµlx-å±\u0086;û_mK\u0018\u0012X\u0011]Ù2\u009a\u00134ÖÐæz\u0091Ob:VÁ2í=N2\u0001\\\u001c-\u008d¬~¨7OÖ\u0011F\u008f/egÙ/W>EGæ\u001d\u0095]Ré<ÀvÅSh¯=-\u0091\u00190ýN\u0094\u0015~ô#wiê\u009dk]×\u007fåá¨ áPí\u008e)ð>\u0017¼\u0000ê\u000bïgñá¦\u00862v]Ú%'Uì/¨`½g?J¸ðk¹\u0085íãCÄ L\u0001¸\u0081ÿ\u001bYÉâ($V¥0\u0084Ï2f)\u008dãnÂ\u0084¯?Å\u0005\u00adè/\u007fû\u001c¯uÍö§ \u0087-5¯6p3z¯ð\u008cH©¨\"X=H\u001co\\\u0002\u0016ó{¸ø\u0084\u0089ß¼à¹\u009bR \"TU´ôºDÂ½\u0013¼\u00889¾\u0004§²eu®\u0003®îë²æ\n\"ó¥^\u0099HÑ\u0001ï\u009fJ\u0089´Õb\u001d\u0011þäK\u008d<ÏÈ\u0015G5-\u001e¿ý\u009b¦D©\u001f\u009e\u0014,*¬1øb|ÿi\u009cE\u008dÅ{ïüb\u0097\u0000\u001b\u0010\u008d#\u0098T+û\u0006ÔÛ$¶[X+\u0099ÎgÐ\u0092²¦\u009aá\u007f«S\u0099hiàJix4Þ\u0098ÝíÑûÉ¤\\\u007fª3å\u00adZ@øyå\u000fn÷\u0098m7:\u000fþ\u0004@üfj8\u0095Â\u0094\u0081a»\u0015Q\u000bJ\"\u009b\n\u0087Ð\u0014a\u0005KsÂ\u0087\\Ðóî²·h\u0080·Eþî\u0013G@\u0089¾kÿ\u009b¢\u007f÷r3ãÕ\u0013\u0091=\u0087Ìhx\\.°ã-\u0090\u0006th?ö´\f\u009dÝ¨á#öÜÅ ² MÑ\u0095À!<ì\u0003\u0094¼\u009a¬¢Î£\u0085ìÂ\u0016Ú¤ò\u001aAá\u0083nK;\u0019Óî¯£%FÕN(üAÈ¨\u0099la\u0089\u0083÷°h=\u000e\u008a:íG\u00932õ\n} Á\u00adEb\u008a\u0092:\u0018Ø\u0016.ëj7H\u0089\u001f\bÍWYé$\fª\u008aªZÿyÈ\u0095¬?ÙøÕ\u00866¸È;\u0019\u0006\u009fÂôp\u0007áL²¼A>\u0094Ñ/³¸-Giaî6¦h|\u009c\u0085Våÿ«B\u009b¤\u0080cI\u0006ªÐæº[ÐåÚ$øþ\u009b0\u0082It>\u007f¯2I®W\u007f23³\u008fÚW@Íì2f\u0091va\u0013Ô¢6ÈeuJC/·ý8¨a}ÁB-Î{F³¨ªP\u009cº\u000f\u0081\u0090Wªn\u00adè&ìfdD\u0096\u0001\u0000È7â\u0001\u0019¢+R-Gø\u001a\u001c\u001ci\u0090Î÷d+\u008foÐN½Í\u0011\u000bÓ\u0087æuÀ\u0015È´\u0018iº¦i¸¯Ñ\u0098-óÄ\u009døî9èít¼\u0091PÙ\u001d àÓmô½áïO\u0087\u0016æK\u001cÀ\fZC\u000fê\u0015\u0092M/zLZ\u0081ÿ»OÓ=gSb.\\%a^·\u0097^\u0012Ý&¢ðx\u0084\u0019£\u0094S%\u00882 dDä\u0004zøÒ÷{ny\u0004\u000f\u001a#\u009b\u009b^×ãÛ:1²\u0005ßº@I>o×\u0085óTC \u0099(ÝíDm\u0098D»\u0086çUÝ®ûó\u0018wÒ\u009b¿ÄfÜ®¢pFo\u0094*\u0094²À\t\u008a\u0091ç¶ë¹X³Tþl¹¥¤[. \nPò)\u001b³ü\u008fnºÇBåg'»÷VäLÅq¿\u0011²\u008dÚ¹\u0085Ng\bXä\u0096uÖ\u0087Bñy!K ¿Ý\u0080VíhSìÆ\u007fÛ\u0002\u009bWÝy1¢È#\u0080\u001cøô¦\\SÙ\u001f2jm4\u0095s/\u0095¯_RTygüoý\u0083Ñâkcbu1\u0095\fSA\u009d\\vr)5^Û^6\n\u009eÍè\\ë\t\u008e5<IÖ\u0093\u0011m \u0092°\u0092Dysà\u0098Ú\u0099ð5\u0018§´û\u0082m\u0019\u000b*GÉàr½\u0000"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      abbbb = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         abbbb[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[bbaba(-110130161, var39 ^ -1593274857)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = bbabb((short)14978, 25314, -1274329709, (byte)33, 1116246104, 'ῶ')).length();
      int var17 = bbaba(-110130176, var39 ^ -1995191123);
      int var42 = -1;

      label130:
      while (true) {
         String var45 = var18.substring(++var42, var42 + var17);
         int var10001 = -1;

         while (true) {
            char[] var63;
            label125: {
               char[] var49 = var45.toCharArray();
               int var10003 = var49.length;
               int var22 = 0;
               var63 = var49;
               var10001 = var10003;
               char[] var73;
               int var10004;
               if (var10003 <= 1) {
                  var73 = var49;
                  var10004 = var22;
               } else {
                  var63 = var49;
                  var10001 = var10003;
                  if (var10003 <= var22) {
                     break label125;
                  }

                  var73 = var49;
                  var10004 = var22;
               }

               while (true) {
                  var73[var10004] = (char)(var73[var10004] ^ switch (var22 % bbaba(-110130173, var39 ^ -541448065)) {
                     case 0 -> bbaba(-110130172, var39 ^ 1113512838);
                     case 1 -> bbaba(-110130171, var39 ^ 648911318);
                     case 2 -> bbaba(-110130170, var39 ^ 1133233500);
                     case 3 -> bbaba(-110130169, var39 ^ 285115224);
                     case 4 -> bbaba(-110130152, var39 ^ 1193619785);
                     case 5 -> bbaba(-110130151, var39 ^ 1001290741);
                     default -> bbaba(-110130150, var39 ^ -1932132479);
                  });
                  var22++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var73 = var63;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var73 = var63;
                     var10004 = var22;
                  }
               }
            }

            String var80 = new String(var63).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var80;
                  if ((var42 += var17) >= var20) {
                     bbb = var21;
                     abbaa = new String[bbaba(-110130174, var39 ^ 239232631)];
                     long var8 = 2500896879131935465L;
                     long[] var14 = new long[bbaba(-110130149, var39 ^ 204215729)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = bbabb((short)28691, (short)14786, -1274329711, (byte)-42, -1019995348, (char)'쳁')).length();
                     byte var10 = 0;

                     label104:
                     while (true) {
                        int var56 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var56, var10).getBytes(bbabb(8720, (short)-14541, -1274329712, (byte)-4, -1188657605, (char)'덊'));
                        long[] var47 = var14;
                        var56 = var11++;
                        long var69 = (var15[0] & 255L) << bbaba(-110130148, var39 ^ -1080683886)
                           | (var15[1] & 255L) << bbaba(-110130147, var39 ^ -649656348)
                           | (var15[2] & 255L) << bbaba(-110130146, var39 ^ -874326301)
                           | (var15[3] & 255L) << bbaba(-110130145, var39 ^ 642201895)
                           | (var15[4] & 255L) << bbaba(-110130160, var39 ^ -1714701333)
                           | (var15[5] & 255L) << bbaba(-110130159, var39 ^ 363446613)
                           | (var15[bbaba(-110130158, var39 ^ 1898274947)] & 255L) << bbaba(-110130157, var39 ^ 1895101813)
                           | var15[bbaba(-110130156, var39 ^ 599789730)] & 255L;
                        byte var81 = -1;

                        while (true) {
                           long var85 = var69 ^ var8;
                           switch (var81) {
                              case 0:
                                 var47[var56] = var85;
                                 if (var10 >= var13) {
                                    abba = var14;
                                    aabbb = new Integer[bbaba(-110130130, var39 ^ -1250906297)];
                                    aa = (byte)aaabb(bbaba(-110130129, var39 ^ 1208350385), 565428919908581952L);
                                    bb = (byte)aaabb(bbaba(-110130144, var39 ^ -847494367), 5842326573814660409L);
                                    ababa = (byte)aaabb(bbaba(-110130143, var39 ^ 1817012546), 1159728203439595304L);
                                    ab = (byte)aaabb(bbaba(-110130142, var39 ^ 471413875), 1159728203439595304L);
                                    long var0 = 2175786283186484227L;
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = bbabb((short)18724, (short)-4104, -1274329707, (byte)-39, -1295134132, '쩐')).length();
                                    byte var2 = 0;

                                    do {
                                       int var59 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var59, var2)
                                          .getBytes(bbabb((short)1224, (short)-10109, -1274329708, (byte)-37, -1534497183, (char)'\uf4d4'));
                                       var59 = var3++;
                                       var85 = (
                                             (var7[0] & 255L) << bbaba(-110130141, var39 ^ -1633496312)
                                                | (var7[1] & 255L) << bbaba(-110130140, var39 ^ -1750709375)
                                                | (var7[2] & 255L) << bbaba(-110130139, var39 ^ 2109150279)
                                                | (var7[3] & 255L) << bbaba(-110130138, var39 ^ -1678195202)
                                                | (var7[4] & 255L) << bbaba(-110130137, var39 ^ 1586961376)
                                                | (var7[5] & 255L) << bbaba(-110130120, var39 ^ -267195342)
                                                | (var7[bbaba(-110130119, var39 ^ -1563414503)] & 255L) << bbaba(-110130118, var39 ^ 331549522)
                                                | var7[bbaba(-110130117, var39 ^ 280223970)] & 255L
                                          )
                                          ^ var0;
                                       byte var83 = -1;
                                       var6[var59] = var85;
                                    } while (var2 < var5);

                                    aaaa = var6;
                                    bbbb = new Long[3];
                                    aaba = abab(bbaba(-110130116, var39 ^ 805245627), 4922225525297163629L);
                                    aaa = abab(bbaba(-110130115, var39 ^ -753027304), 4922225525297163629L);
                                    ababb = aabbaaaba.aaab(
                                       ba(bbaba(-110130114, var39 ^ 1749950301), bbaba(-110130113, var39 ^ -1415936152))
                                    );
                                    bbaa = aabbaaaba.aaab(
                                       ba(bbaba(-110130128, var39 ^ 363425595), bbaba(-110130127, var39 ^ -185985248))
                                    );
                                    bab = aabbaaaba.aaab(
                                       ba(bbaba(-110130126, var39 ^ 176419358), bbaba(-110130125, var39 ^ 2130129390))
                                    );
                                    bbba = aabbaaaba.aaab(
                                       ba(bbaba(-110130124, var39 ^ -357344123), bbaba(-110130123, var39 ^ -1428718021))
                                    );
                                    abbab = aabbaaaba.aaab(
                                       ba(bbaba(-110130122, var39 ^ 1949446439), bbaba(-110130121, var39 ^ 953366021))
                                    );
                                    aaaba = aabbaaaba.aaab(
                                       ba(bbaba(-110129976, var39 ^ -199303250), bbaba(-110129975, var39 ^ -780898868))
                                    );
                                    aabba = aabbaaaba.aaab(
                                       ba(bbaba(-110129974, var39 ^ -1666587049), bbaba(-110129973, var39 ^ -894883977))
                                    );
                                    babb = aabbaaaba.aaab(
                                       ba(bbaba(-110129972, var39 ^ 607135039), bbaba(-110129971, var39 ^ 2097868415))
                                    );
                                    abb = aabbaaaba.aaab(
                                       ba(bbaba(-110129970, var39 ^ -363704411), bbaba(-110129969, var39 ^ 1388061555))
                                    );
                                    aba = aabbaaaba.aaab(
                                       ba(bbaba(-110129984, var39 ^ 931274675), bbaba(-110129983, var39 ^ -446756024))
                                    );
                                    abaaa = aabbaaaba.aaab(
                                       ba(bbaba(-110129982, var39 ^ -75731562), bbaba(-110129981, var39 ^ -1705732986))
                                    );
                                    aaabb = aabbaaaba.aaab(
                                       ba(bbaba(-110129980, var39 ^ 622061373), bbaba(-110129979, var39 ^ -733396487))
                                    );
                                    aabaa = ConcurrentHashMap.newKeySet();
                                    aaaaa = ConcurrentHashMap.newKeySet();
                                    aab = new ConcurrentHashMap();
                                    abaa = ThreadLocal.withInitial(bbbaaba::bbb);
                                    return;
                                 }
                                 break;
                              default:
                                 var47[var56] = var85;
                                 if (var10 < var13) {
                                    continue label104;
                                 }

                                 var13 = (var12 = bbabb((short)-17492, (short)-20426, -1274329705, (byte)88, 2100502072, '\uf056')).length();
                                 var10 = 0;
                           }

                           byte var58 = var10;
                           var10 += 8;
                           var15 = var12.substring(var58, var10).getBytes(bbabb((short)-26052, (short)-9016, -1274329706, (byte)115, 1986616323, '瘚'));
                           var47 = var14;
                           var56 = var11++;
                           var69 = (var15[0] & 255L) << bbaba(-110130155, var39 ^ 1810974785)
                              | (var15[1] & 255L) << bbaba(-110130154, var39 ^ -517758953)
                              | (var15[2] & 255L) << bbaba(-110130153, var39 ^ 1516386474)
                              | (var15[3] & 255L) << bbaba(-110130136, var39 ^ 1062247084)
                              | (var15[4] & 255L) << bbaba(-110130135, var39 ^ 2050936914)
                              | (var15[5] & 255L) << bbaba(-110130134, var39 ^ 70075047)
                              | (var15[bbaba(-110130133, var39 ^ -973783326)] & 255L) << bbaba(-110130132, var39 ^ -679153714)
                              | var15[bbaba(-110130131, var39 ^ -1602913648)] & 255L;
                           var81 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var42);
                  break;
               default:
                  var21[var19++] = var80;
                  if ((var42 += var17) < var20) {
                     var17 = var18.charAt(var42);
                     continue label130;
                  }

                  var20 = (var18 = bbabb((short)-11296, 10808, -1274329710, (byte)87, -1351913562, 'ࣟ')).length();
                  var17 = bbaba(-110130175, var39 ^ -207346770);
                  var42 = -1;
            }

            var45 = var18.substring(++var42, var42 + var17);
            var10001 = 0;
         }
      }
   }

   public boolean babab() {
      return (Boolean)this.aaaab.abbb();
   }

   public static boolean babba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baba Ljava/lang/Boolean;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 4c
      // 0d: ifnonnull 4b
      // 10: goto 14
      // 13: athrow
      // 14: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaabb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 1a: iload 0
      // 1b: ifne 3f
      // 1e: goto 22
      // 21: athrow
      // 22: ifne 3e
      // 25: goto 29
      // 28: athrow
      // 29: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 2c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbb (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 2f: iload 0
      // 30: ifne 3f
      // 33: goto 37
      // 36: athrow
      // 37: ifeq 42
      // 3a: goto 3e
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto 43
      // 42: bipush 0
      // 43: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 46: astore 1
      // 47: aload 1
      // 48: putstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baba Ljava/lang/Boolean;
      // 4b: aload 1
      // 4c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 4f: ireturn
   }

   public boolean babbb() {
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
      // 06: ifne 1d
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babbaab ()Z
      // 0c: ifne 16
      // 0f: goto 13
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: athrow
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.aaaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 1a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 1d: checkcast java/lang/Boolean
      // 20: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 23: iload 1
      // 24: ifne 2f
      // 27: ifne 30
      // 2a: goto 2e
      // 2d: athrow
      // 2e: bipush 1
      // 2f: ireturn
      // 30: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 33: astore 2
      // 34: aload 2
      // 35: iload 1
      // 36: ifne 44
      // 39: ifnonnull 43
      // 3c: goto 40
      // 3f: athrow
      // 40: bipush 1
      // 41: ireturn
      // 42: athrow
      // 43: aload 2
      // 44: invokevirtual net/minecraft/class_310.method_1558 ()Lnet/minecraft/class_642;
      // 47: astore 3
      // 48: aload 3
      // 49: iload 1
      // 4a: ifne 74
      // 4d: ifnonnull 73
      // 50: goto 54
      // 53: athrow
      // 54: aload 2
      // 55: iload 1
      // 56: ifne 6c
      // 59: goto 5d
      // 5c: athrow
      // 5d: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 60: ifnull 73
      // 63: goto 67
      // 66: athrow
      // 67: aload 2
      // 68: goto 6c
      // 6b: athrow
      // 6c: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 6f: invokevirtual net/minecraft/class_634.method_45734 ()Lnet/minecraft/class_642;
      // 72: astore 3
      // 73: aload 3
      // 74: iload 1
      // 75: ifne 80
      // 78: ifnull 86
      // 7b: goto 7f
      // 7e: athrow
      // 7f: aload 3
      // 80: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 83: ifnonnull 89
      // 86: bipush 1
      // 87: ireturn
      // 88: athrow
      // 89: aload 0
      // 8a: aload 3
      // 8b: getfield net/minecraft/class_642.field_3761 Ljava/lang/String;
      // 8e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.baaba (Ljava/lang/String;)Z
      // 91: ireturn
   }

   public ababaaabb bbaaa() {
      return (ababaaabb)this.aabab.abbb();
   }

   public static boolean bbaab(ababaaabb param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: ifnull 10
      // 08: aload 1
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 5b
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb;
      // 1b: if_acmpne 5a
      // 1e: goto 22
      // 21: athrow
      // 22: aload 1
      // 23: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 26: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 29: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c: iload 2
      // 2d: ifne 55
      // 30: goto 34
      // 33: athrow
      // 34: ifne 54
      // 37: goto 3b
      // 3a: athrow
      // 3b: aload 1
      // 3c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 42: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 45: iload 2
      // 46: ifne 55
      // 49: goto 4d
      // 4c: athrow
      // 4d: ifeq 58
      // 50: goto 54
      // 53: athrow
      // 54: bipush 1
      // 55: goto 59
      // 58: bipush 0
      // 59: ireturn
      // 5a: aload 0
      // 5b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababaaabb;
      // 5e: if_acmpne 6d
      // 61: aload 1
      // 62: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.ababb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 65: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 68: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 6b: ireturn
      // 6c: athrow
      // 6d: bipush 0
      // 6e: ireturn
   }

   private static String bbabb(short var0, short var1, int var2, byte var3, int var4, char var5) {
      int var10 = var2 ^ -1274329709;
      char[] var9 = baaaa[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])baaab[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         baaab[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 18830;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ '꧲' ^ var8 ^ switch (var8 % 22) {
            default -> 153;
            case 1 -> 67;
            case 2 -> 98;
            case 3 -> 102;
            case 4 -> 79;
            case 5 -> 235;
            case 6 -> 221;
            case 7 -> 145;
            case 8 -> 123;
            case 9 -> 73;
            case 10 -> 146;
            case 11 -> 43;
            case 12 -> 158;
            case 13 -> 108;
            case 14 -> 1;
            case 15 -> 126;
            case 16 -> 196;
            case 17 -> 62;
            case 18 -> 91;
            case 19 -> 46;
            case 20 -> 12;
            case 21 -> 61;
         } ^ var7 ^ var0 ^ var1 ^ var2 ^ var3 ^ var4 ^ var5);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   private static boolean a(String param0) {
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
      // 05: ifnonnull 0b
      // 08: bipush 0
      // 09: ireturn
      // 0a: athrow
      // 0b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 0e: astore 2
      // 0f: aload 2
      // 10: iload 1
      // 11: ifne 1c
      // 14: ifnull 2a
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 2
      // 1c: iload 1
      // 1d: ifne 2e
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 23: ifnonnull 2d
      // 26: goto 2a
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
      // 2c: athrow
      // 2d: aload 2
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbbbb ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba;
      // 34: astore 3
      // 35: aload 3
      // 36: iload 1
      // 37: ifne 42
      // 3a: ifnull 76
      // 3d: goto 41
      // 40: athrow
      // 41: aload 3
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babbaab ()Z
      // 45: iload 1
      // 46: ifne 7b
      // 49: ifeq 76
      // 4c: goto 50
      // 4f: athrow
      // 50: aload 3
      // 51: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.bba ()Z
      // 54: iload 1
      // 55: ifne 7b
      // 58: goto 5c
      // 5b: athrow
      // 5c: ifeq 76
      // 5f: goto 63
      // 62: athrow
      // 63: aload 3
      // 64: iload 1
      // 65: ifne 7d
      // 68: goto 6c
      // 6b: athrow
      // 6c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.babbb ()Z
      // 6f: ifne 7c
      // 72: goto 76
      // 75: athrow
      // 76: bipush 0
      // 77: goto 7b
      // 7a: athrow
      // 7b: ireturn
      // 7c: aload 3
      // 7d: aload 0
      // 7e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbaaba.abbaa (Ljava/lang/String;)Z
      // 81: ireturn
   }
}
