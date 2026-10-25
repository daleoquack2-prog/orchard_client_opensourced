package nsc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1293;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class bbabab extends abbaabbaa {
   private static final int aa;
   private boolean ba;
   private static final String[] aaabb;
   private List aaa;
   private static final String[] aab;
   private static final int bb;
   private final Map aba;
   private static final Gson abb;
   private boolean baa;
   private static final int[] aaaba;
   private long bab;
   private String bba;
   private final baabaab bbb;
   private static final Object[] aabaa;
   private long aaaa;
   private static final int aaab;
   private static final long[] aaba;
   private static final String[] aabb;
   private static final long ab;
   private static final String abaa;
   private static final Integer[] abab;
   private final abbaaaaa abba;
   private boolean abbb;
   private static String[] baaa;
   public static final String baab;
   private String baba;
   private static final Long[] babb;
   private static final long[] bbaa;
   private boolean bbab;
   private final aaabbbab bbba;
   private static final int[] bbbb;
   private baababab aaaaa;
   private long aaaab;

   private boolean aa(class_1799 param1, aaaabaaa param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 2
      // 05: ifnull 20
      // 08: aload 0
      // 09: aload 1
      // 0a: aload 2
      // 0b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.b Ljava/lang/String;
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbaba (Lnet/minecraft/class_1799;Ljava/lang/String;)Z
      // 11: iload 3
      // 12: ifne 21
      // 15: goto 19
      // 18: athrow
      // 19: ifne 22
      // 1c: goto 20
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: aload 2
      // 23: iload 3
      // 24: ifne 36
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.bb Ljava/lang/String;
      // 2a: ifnull 47
      // 2d: goto 31
      // 30: athrow
      // 31: aload 2
      // 32: goto 36
      // 35: athrow
      // 36: iload 3
      // 37: ifne 4b
      // 3a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.bb Ljava/lang/String;
      // 3d: invokevirtual java/lang/String.isBlank ()Z
      // 40: ifeq 4a
      // 43: goto 47
      // 46: athrow
      // 47: bipush 1
      // 48: ireturn
      // 49: athrow
      // 4a: aload 2
      // 4b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.bb Ljava/lang/String;
      // 4e: aload 0
      // 4f: aload 1
      // 50: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbbbb (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 53: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 56: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = aaaba[var0 ^ -2056749461] ^ var1 ^ var0;
      var2 += 8611;
      var2 ^= 28500;
      var2 -= 14337;
      var2 -= 15120;
      var2 ^= 10978;
      var2 ^= 30880;
      return var2 - 61131;
   }

   private Map ab(aaaabaaa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 1848323230
      // 002: istore 8
      // 004: new java/util/LinkedHashMap
      // 007: dup
      // 008: invokespecial java/util/LinkedHashMap.<init> ()V
      // 00b: astore 3
      // 00c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 00f: aload 3
      // 010: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 013: ldc -2056749461
      // 015: iload 8
      // 017: ldc 1118661784
      // 019: ixor
      // 01a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 01d: ldc2_w 4906604562489436828
      // 020: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 023: aaload
      // 024: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 027: aload 1
      // 028: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aa Ljava/lang/String;
      // 02b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 030: pop
      // 031: istore 2
      // 032: aload 3
      // 033: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 036: iload 2
      // 037: ifne 0ed
      // 03a: ldc -2056749462
      // 03c: iload 8
      // 03e: ldc -65650566
      // 040: ixor
      // 041: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 044: ldc2_w 6374038210040943849
      // 047: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 04a: aaload
      // 04b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 04e: aload 1
      // 04f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.ba I
      // 052: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 055: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 05a: pop
      // 05b: aload 3
      // 05c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 05f: ldc -2056749463
      // 061: iload 8
      // 063: ldc -1511644818
      // 065: ixor
      // 066: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 069: ldc2_w 3129256868961797594
      // 06c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 06f: aaload
      // 070: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 073: aload 1
      // 074: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // 077: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 07a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 07f: pop
      // 080: aload 3
      // 081: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 084: ldc -2056749464
      // 086: iload 8
      // 088: ldc -7831317
      // 08a: ixor
      // 08b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 08e: ldc2_w 1021556750500799323
      // 091: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 094: aaload
      // 095: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 098: aload 1
      // 099: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.b Ljava/lang/String;
      // 09c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0a1: pop
      // 0a2: aload 1
      // 0a3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.bb Ljava/lang/String;
      // 0a6: ifnull 0e9
      // 0a9: goto 0ad
      // 0ac: athrow
      // 0ad: aload 1
      // 0ae: iload 2
      // 0af: ifne 0e8
      // 0b2: goto 0b6
      // 0b5: athrow
      // 0b6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.bb Ljava/lang/String;
      // 0b9: invokevirtual java/lang/String.isBlank ()Z
      // 0bc: ifne 0e9
      // 0bf: goto 0c3
      // 0c2: athrow
      // 0c3: aload 3
      // 0c4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 0c7: ldc -2056749457
      // 0c9: iload 8
      // 0cb: ldc 1601292647
      // 0cd: ixor
      // 0ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 0d1: ldc2_w 5142412099584819102
      // 0d4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 0d7: aaload
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0db: aload 1
      // 0dc: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.bb Ljava/lang/String;
      // 0df: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0e4: goto 0e8
      // 0e7: athrow
      // 0e8: pop
      // 0e9: aload 3
      // 0ea: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 0ed: ldc -2056749458
      // 0ef: iload 8
      // 0f1: ldc 312434468
      // 0f3: ixor
      // 0f4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 0f7: ldc2_w 5856780897868962494
      // 0fa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 0fd: aaload
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 101: aload 1
      // 102: iload 2
      // 103: ifne 12b
      // 106: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.ab Ljava/lang/String;
      // 109: ifnull 126
      // 10c: goto 110
      // 10f: athrow
      // 110: aload 1
      // 111: iload 2
      // 112: ifne 132
      // 115: goto 119
      // 118: athrow
      // 119: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.ab Ljava/lang/String;
      // 11c: invokevirtual java/lang/String.isBlank ()Z
      // 11f: ifeq 131
      // 122: goto 126
      // 125: athrow
      // 126: aload 1
      // 127: goto 12b
      // 12a: athrow
      // 12b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.b Ljava/lang/String;
      // 12e: goto 135
      // 131: aload 1
      // 132: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.ab Ljava/lang/String;
      // 135: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 13a: pop
      // 13b: aload 3
      // 13c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 13f: ldc -2056749459
      // 141: iload 8
      // 143: ldc -1925292465
      // 145: ixor
      // 146: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 149: ldc2_w 4650418216296062164
      // 14c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 14f: aaload
      // 150: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 153: aload 1
      // 154: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.a I
      // 157: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 15a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 15f: pop
      // 160: aload 3
      // 161: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 164: ldc -2056749460
      // 166: iload 8
      // 168: ldc -1819822025
      // 16a: ixor
      // 16b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 16e: ldc2_w 2831886229554607818
      // 171: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 174: aaload
      // 175: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 178: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 17b: ldc -2056749469
      // 17d: iload 8
      // 17f: ldc -1909385184
      // 181: ixor
      // 182: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 185: ldc2_w 4431921873440465663
      // 188: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 18b: aaload
      // 18c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 18f: aload 1
      // 190: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.b Ljava/lang/String;
      // 193: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 196: invokestatic java/net/URLEncoder.encode (Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
      // 199: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 19c: ldc -2056749470
      // 19e: iload 8
      // 1a0: ldc 1981412827
      // 1a2: ixor
      // 1a3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 1a6: ldc2_w 7700694776926534489
      // 1a9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 1ac: aaload
      // 1ad: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1b0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abaa Ljava/lang/String;
      // 1b3: astore 7
      // 1b5: astore 6
      // 1b7: astore 5
      // 1b9: astore 4
      // 1bb: new java/lang/StringBuilder
      // 1be: dup
      // 1bf: invokespecial java/lang/StringBuilder.<init> ()V
      // 1c2: aload 4
      // 1c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1c7: aload 5
      // 1c9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1cc: aload 6
      // 1ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1d1: aload 7
      // 1d3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1d6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1de: pop
      // 1df: aload 3
      // 1e0: areturn
   }

   private String ba(String param1) {
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
      // 06: ifne 1a
      // 09: ifnonnull 19
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 13: bipush 1
      // 14: aaload
      // 15: goto 2a
      // 18: athrow
      // 19: aload 1
      // 1a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 1d: bipush 0
      // 1e: aaload
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 22: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 25: bipush 1
      // 26: aaload
      // 27: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 2a: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private List bb() {
      int var1 = baaabbaa.bba;
      Path var2 = this.abaa();

      label71: {
         Path var10000;
         label66: {
            try {
               var10000 = var2;
               if (var1 != 0) {
                  break label66;
               }

               if (var2 == null) {
                  break label71;
               }
            } catch (Throwable var13) {
               throw var13;
            }

            var10000 = var2;
         }

         try {
            if (!Files.isDirectory(var10000)) {
               break label71;
            }
         } catch (Throwable var12) {
            throw var12;
         }

         ArrayList var3 = new ArrayList();

         try {
            Stream var4 = Files.list(var2);
            if (var1 == 0) {
               try {
                  var4.filter(bbabab::abbb)
                     .map(this::babab)
                     .filter(bbabab::bbbb)
                     .forEach(var3::add);
               } catch (Throwable var10) {
                  try {
                     if (var1 != 0 || var4 == null) {
                        throw var10;
                     }
                  } catch (Throwable var9) {
                     throw var9;
                  }

                  try {
                     var4.close();
                  } catch (Throwable var8) {
                     var10.addSuppressed(var8);
                  }

                  throw var10;
               }

               if (var4 != null) {
                  var4.close();
               }
            }
         } catch (IOException var11) {
         }

         var3.sort(
            Comparator.comparingLong(bbabab::aaaaaa).reversed().thenComparing(this::bbab, String.CASE_INSENSITIVE_ORDER)
         );
         return var3;
      }

      try {
         return List.of();
      } catch (Throwable var7) {
         throw var7;
      }
   }

   public List aaa() {
      ArrayList var2 = new ArrayList();
      int var10000 = baaabbaa.bba;
      Iterator var3 = this.aaaaba().iterator();
      int var1 = var10000;

      while (var3.hasNext()) {
         baababab var4 = (baababab)var3.next();

         label44: {
            try {
               var8 = var4;
               if (var1 != 0) {
                  break label44;
               }

               if (var4 == null) {
                  continue;
               }
            } catch (IllegalStateException var7) {
               throw var7;
            }

            var8 = var4;
         }

         try {
            if (var8.ab == null) {
               continue;
            }
         } catch (IllegalStateException var5) {
            throw var5;
         }

         abb var10001;
         abb var10002;
         String var10003;
         String var10004;
         String var10005;
         int var10006;
         label37: {
            try {
               var9 = var2;
               var10001 = new abb;
               var10002 = var10001;
               var10003 = var4.ab;
               var10004 = this.abaaa(var4);
               var10005 = this.bbbab(var4);
               if (var4.a == null) {
                  var10006 = 0;
                  break label37;
               }
            } catch (IllegalStateException var6) {
               throw var6;
            }

            var10006 = var4.a.size();
         }

         var10002./* $VF: Unable to resugar constructor */<init>(var10003, var10004, var10005, var10006);
         var9.add(var10001);
         if (var1 != 0) {
            break;
         }
      }

      return var2;
   }

   private aaabaaab aab(class_746 param1, baababab param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 2f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 2
      // 11: iload 3
      // 12: ifne 24
      // 15: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 18: ifnull 2f
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 2
      // 20: goto 24
      // 23: athrow
      // 24: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 27: invokeinterface java/util/List.isEmpty ()Z 1
      // 2c: ifeq 32
      // 2f: aconst_null
      // 30: areturn
      // 31: athrow
      // 32: aload 0
      // 33: aload 2
      // 34: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)Ljava/util/Map;
      // 37: astore 4
      // 39: aload 2
      // 3a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 3d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 42: astore 5
      // 44: aload 5
      // 46: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4b: ifeq c6
      // 4e: aload 5
      // 50: iload 3
      // 51: ifne 46
      // 54: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 59: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa
      // 5c: astore 6
      // 5e: aload 6
      // 60: ifnull 44
      // 63: aload 0
      // 64: aload 6
      // 66: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // 69: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaabba (I)Z
      // 6c: iload 3
      // 6d: ifne 4b
      // 70: ifeq 44
      // 73: aload 6
      // 75: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.b Ljava/lang/String;
      // 78: ifnonnull 7f
      // 7b: goto 44
      // 7e: athrow
      // 7f: aload 0
      // 80: aload 1
      // 81: aload 6
      // 83: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // 86: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaab (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 89: astore 7
      // 8b: aload 0
      // 8c: iload 3
      // 8d: ifne a3
      // 90: aload 7
      // 92: aload 6
      // 94: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aa (Lnet/minecraft/class_1799;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa;)Z
      // 97: ifeq a2
      // 9a: goto 9e
      // 9d: athrow
      // 9e: goto 44
      // a1: athrow
      // a2: aload 0
      // a3: aload 1
      // a4: aload 4
      // a6: aload 6
      // a8: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaabb (Lnet/minecraft/class_746;Ljava/util/Map;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa;)I
      // ab: istore 8
      // ad: iload 8
      // af: iflt c2
      // b2: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaab
      // b5: dup
      // b6: iload 8
      // b8: aload 6
      // ba: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // bd: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaab.<init> (II)V
      // c0: areturn
      // c1: athrow
      // c2: iload 3
      // c3: ifeq 44
      // c6: aconst_null
      // c7: areturn
   }

   private boolean aba(class_1799 param1, int param2, Map param3) {
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
      // 06: iload 2
      // 07: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0f: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa
      // 12: astore 5
      // 14: aload 5
      // 16: ifnull 34
      // 19: aload 0
      // 1a: aload 1
      // 1b: aload 5
      // 1d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aa (Lnet/minecraft/class_1799;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa;)Z
      // 20: iload 4
      // 22: ifne 31
      // 25: goto 29
      // 28: athrow
      // 29: ifeq 34
      // 2c: goto 30
      // 2f: athrow
      // 30: bipush 1
      // 31: goto 35
      // 34: bipush 0
      // 35: ireturn
   }

   private baababab abb(class_746 param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 0
      // 005: aload 2
      // 006: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaba (Ljava/lang/String;)Ljava/lang/String;
      // 009: astore 4
      // 00b: aload 4
      // 00d: iload 3
      // 00e: ifne 05c
      // 011: invokevirtual java/lang/String.isBlank ()Z
      // 014: ifeq 05e
      // 017: goto 01b
      // 01a: athrow
      // 01b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 01e: ldc_w -2056749471
      // 021: ldc_w -304052778
      // 024: ldc_w 1699714120
      // 027: ixor
      // 028: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 02b: ldc2_w 2827147514688624662
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 031: aaload
      // 032: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 035: aload 0
      // 036: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bb ()Ljava/util/List;
      // 039: invokeinterface java/util/List.size ()I 1
      // 03e: bipush 1
      // 03f: iadd
      // 040: istore 13
      // 042: astore 12
      // 044: new java/lang/StringBuilder
      // 047: dup
      // 048: invokespecial java/lang/StringBuilder.<init> ()V
      // 04b: aload 12
      // 04d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 050: iload 13
      // 052: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 055: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 058: goto 05c
      // 05b: athrow
      // 05c: astore 4
      // 05e: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab
      // 061: dup
      // 062: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.<init> ()V
      // 065: astore 5
      // 067: aload 5
      // 069: bipush 1
      // 06a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.bb I
      // 06d: aload 5
      // 06f: aload 4
      // 071: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.aa Ljava/lang/String;
      // 074: aload 5
      // 076: aload 0
      // 077: aload 4
      // 079: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbb (Ljava/lang/String;)Ljava/lang/String;
      // 07c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 07f: aload 5
      // 081: invokestatic java/lang/System.currentTimeMillis ()J
      // 084: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.b J
      // 087: aload 5
      // 089: new java/util/ArrayList
      // 08c: dup
      // 08d: invokespecial java/util/ArrayList.<init> ()V
      // 090: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 093: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbbb [I
      // 096: astore 6
      // 098: aload 6
      // 09a: arraylength
      // 09b: istore 7
      // 09d: bipush 0
      // 09e: istore 8
      // 0a0: iload 8
      // 0a2: iload 7
      // 0a4: if_icmpge 12c
      // 0a7: aload 6
      // 0a9: iload 8
      // 0ab: iaload
      // 0ac: istore 9
      // 0ae: aload 0
      // 0af: aload 1
      // 0b0: iload 9
      // 0b2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaab (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 0b5: astore 10
      // 0b7: aload 10
      // 0b9: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 0bc: ifeq 0c3
      // 0bf: goto 125
      // 0c2: athrow
      // 0c3: new qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa
      // 0c6: dup
      // 0c7: invokespecial qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.<init> ()V
      // 0ca: astore 11
      // 0cc: aload 11
      // 0ce: aload 0
      // 0cf: iload 9
      // 0d1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbaa (I)Ljava/lang/String;
      // 0d4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aa Ljava/lang/String;
      // 0d7: aload 11
      // 0d9: aload 0
      // 0da: iload 9
      // 0dc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaba (I)I
      // 0df: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.ba I
      // 0e2: aload 11
      // 0e4: iload 9
      // 0e6: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // 0e9: aload 11
      // 0eb: aload 0
      // 0ec: aload 10
      // 0ee: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abba (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 0f1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.b Ljava/lang/String;
      // 0f4: aload 11
      // 0f6: aload 0
      // 0f7: aload 10
      // 0f9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbbbb (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 0fc: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.bb Ljava/lang/String;
      // 0ff: aload 11
      // 101: aload 10
      // 103: invokevirtual net/minecraft/class_1799.method_7964 ()Lnet/minecraft/class_2561;
      // 106: invokeinterface net/minecraft/class_2561.getString ()Ljava/lang/String; 1
      // 10b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.ab Ljava/lang/String;
      // 10e: aload 11
      // 110: aload 10
      // 112: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 115: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.a I
      // 118: aload 5
      // 11a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 11d: aload 11
      // 11f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 124: pop
      // 125: iinc 8 1
      // 128: iload 3
      // 129: ifeq 0a0
      // 12c: aload 5
      // 12e: areturn
   }

   @Override
   public int bbbbbb() {
      return baaa(a(-2056749472, -480123607 ^ 1054490641), 4983167009535372380L);
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
      // 000: ldc_w -1878924184
      // 003: istore 9
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 1
      // 009: aload 0
      // 00a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba Z
      // 00d: ifne 012
      // 010: return
      // 011: athrow
      // 012: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 015: astore 2
      // 016: aload 0
      // 017: iload 1
      // 018: ifne 02b
      // 01b: aload 2
      // 01c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbbb (Lnet/minecraft/class_310;)Z
      // 01f: ifne 049
      // 022: goto 026
      // 025: athrow
      // 026: aload 0
      // 027: goto 02b
      // 02a: athrow
      // 02b: aload 2
      // 02c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 02f: ldc_w -2056749465
      // 032: iload 9
      // 034: ldc_w -1571773912
      // 037: ixor
      // 038: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 03b: ldc2_w 1688867642304754128
      // 03e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 041: aaload
      // 042: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 045: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbba (Lnet/minecraft/class_310;Ljava/lang/String;)V
      // 048: return
      // 049: aload 2
      // 04a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04d: astore 3
      // 04e: aload 3
      // 04f: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 052: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 055: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 058: iload 1
      // 059: ifne 090
      // 05c: ifne 083
      // 05f: goto 063
      // 062: athrow
      // 063: aload 0
      // 064: aload 2
      // 065: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 068: ldc_w -2056749466
      // 06b: iload 9
      // 06d: ldc_w 377465127
      // 070: ixor
      // 071: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 074: ldc2_w 2421256004164397932
      // 077: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 07a: aaload
      // 07b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 07e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbba (Lnet/minecraft/class_310;Ljava/lang/String;)V
      // 081: return
      // 082: athrow
      // 083: aload 0
      // 084: iload 1
      // 085: ifne 094
      // 088: aload 2
      // 089: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ababb (Lnet/minecraft/class_310;)Z
      // 08c: goto 090
      // 08f: athrow
      // 090: ifne 0dd
      // 093: aload 0
      // 094: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbb Z
      // 097: iload 1
      // 098: ifne 0ce
      // 09b: ifeq 0c2
      // 09e: goto 0a2
      // 0a1: athrow
      // 0a2: aload 0
      // 0a3: aload 2
      // 0a4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 0a7: ldc_w -2056749467
      // 0aa: iload 9
      // 0ac: ldc_w -2065886005
      // 0af: ixor
      // 0b0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 0b3: ldc2_w 1501784246011046034
      // 0b6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 0b9: aaload
      // 0ba: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0bd: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbba (Lnet/minecraft/class_310;Ljava/lang/String;)V
      // 0c0: return
      // 0c1: athrow
      // 0c2: aload 2
      // 0c3: iload 1
      // 0c4: ifne 0d9
      // 0c7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.abaa (Lnet/minecraft/class_310;)Z
      // 0ca: goto 0ce
      // 0cd: athrow
      // 0ce: ifne 0d2
      // 0d1: return
      // 0d2: aload 0
      // 0d3: aload 2
      // 0d4: aload 3
      // 0d5: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_746;)V
      // 0d8: aload 2
      // 0d9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.bbb (Lnet/minecraft/class_310;)V
      // 0dc: return
      // 0dd: invokestatic java/lang/System.currentTimeMillis ()J
      // 0e0: lstore 4
      // 0e2: lload 4
      // 0e4: aload 0
      // 0e5: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaa J
      // 0e8: lsub
      // 0e9: aload 0
      // 0ea: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaab J
      // 0ed: lcmp
      // 0ee: ifge 0f3
      // 0f1: return
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: aload 3
      // 0f5: aload 0
      // 0f6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;
      // 0f9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aab (Lnet/minecraft/class_746;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaab;
      // 0fc: astore 6
      // 0fe: iload 1
      // 0ff: ifne 114
      // 102: aload 6
      // 104: ifnonnull 115
      // 107: goto 10b
      // 10a: athrow
      // 10b: aload 0
      // 10c: aload 2
      // 10d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aabb (Lnet/minecraft/class_310;)V
      // 110: goto 114
      // 113: athrow
      // 114: return
      // 115: aload 2
      // 116: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.abaa (Lnet/minecraft/class_310;)Z
      // 119: iload 1
      // 11a: ifne 147
      // 11d: ifne 125
      // 120: goto 124
      // 123: athrow
      // 124: return
      // 125: aload 0
      // 126: iload 1
      // 127: ifne 179
      // 12a: aload 2
      // 12b: aload 3
      // 12c: aload 6
      // 12e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaab.aa I
      // 131: aload 6
      // 133: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabaaab.a I
      // 136: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaabab (Lnet/minecraft/class_310;Lnet/minecraft/class_746;II)V
      // 139: aload 3
      // 13a: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 13d: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 140: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 143: goto 147
      // 146: athrow
      // 147: ifne 16a
      // 14a: aload 0
      // 14b: aload 2
      // 14c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 14f: ldc_w -2056749468
      // 152: iload 9
      // 154: ldc_w 1556209647
      // 157: ixor
      // 158: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 15b: ldc2_w 246283230317569016
      // 15e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 161: aaload
      // 162: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 165: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbba (Lnet/minecraft/class_310;Ljava/lang/String;)V
      // 168: return
      // 169: athrow
      // 16a: aload 0
      // 16b: lload 4
      // 16d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaa J
      // 170: aload 0
      // 171: aload 0
      // 172: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaabb ()J
      // 175: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaab J
      // 178: aload 0
      // 179: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 17c: ldc_w -2056749445
      // 17f: iload 9
      // 181: ldc_w 427726405
      // 184: ixor
      // 185: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 188: ldc2_w 1508600671652716875
      // 18b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 18e: aaload
      // 18f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 192: aload 0
      // 193: aload 0
      // 194: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;
      // 197: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)Ljava/lang/String;
      // 19a: astore 8
      // 19c: astore 7
      // 19e: new java/lang/StringBuilder
      // 1a1: dup
      // 1a2: invokespecial java/lang/StringBuilder.<init> ()V
      // 1a5: aload 7
      // 1a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1aa: aload 8
      // 1ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1af: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b2: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baba Ljava/lang/String;
      // 1b5: return
   }

   @Override
   public void bbaabb(class_310 param1) {
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
      // 005: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.babbaab ()Z
      // 008: ifeq 02a
      // 00b: aload 1
      // 00c: iload 2
      // 00d: ifne 01c
      // 010: goto 014
      // 013: athrow
      // 014: ifnull 02a
      // 017: goto 01b
      // 01a: athrow
      // 01b: aload 1
      // 01c: iload 2
      // 01d: ifne 02d
      // 020: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 023: ifnonnull 02c
      // 026: goto 02a
      // 029: athrow
      // 02a: return
      // 02b: athrow
      // 02c: aload 1
      // 02d: iload 2
      // 02e: ifne 040
      // 031: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 034: ifnull 04b
      // 037: goto 03b
      // 03a: athrow
      // 03b: aload 1
      // 03c: goto 040
      // 03f: athrow
      // 040: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 043: instanceof net/minecraft/class_490
      // 046: ifne 04b
      // 049: return
      // 04a: athrow
      // 04b: aload 0
      // 04c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaaba ()Ljava/util/List;
      // 04f: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 054: astore 3
      // 055: aload 3
      // 056: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 05b: ifeq 140
      // 05e: aload 3
      // 05f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 064: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab
      // 067: astore 4
      // 069: aload 4
      // 06b: iload 2
      // 06c: ifne 078
      // 06f: ifnull 055
      // 072: goto 076
      // 075: athrow
      // 076: aload 4
      // 078: iload 2
      // 079: ifne 088
      // 07c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 07f: ifnull 055
      // 082: goto 086
      // 085: athrow
      // 086: aload 4
      // 088: iload 2
      // 089: ifne 098
      // 08c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ba Ljava/lang/String;
      // 08f: ifnull 055
      // 092: goto 096
      // 095: athrow
      // 096: aload 4
      // 098: iload 2
      // 099: ifne 0af
      // 09c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ba Ljava/lang/String;
      // 09f: invokevirtual java/lang/String.isBlank ()Z
      // 0a2: ifeq 0ad
      // 0a5: goto 0a9
      // 0a8: athrow
      // 0a9: goto 055
      // 0ac: athrow
      // 0ad: aload 4
      // 0af: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ba Ljava/lang/String;
      // 0b2: invokestatic net/minecraft/class_3675.method_15981 (Ljava/lang/String;)Lnet/minecraft/class_3675$class_306;
      // 0b5: astore 5
      // 0b7: goto 0bf
      // 0ba: astore 6
      // 0bc: goto 055
      // 0bf: aload 5
      // 0c1: iload 2
      // 0c2: ifne 0ce
      // 0c5: ifnull 055
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: aload 5
      // 0ce: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 0d1: invokevirtual net/minecraft/class_3675$class_306.equals (Ljava/lang/Object;)Z
      // 0d4: iload 2
      // 0d5: ifne 0e8
      // 0d8: ifeq 0e2
      // 0db: goto 0df
      // 0de: athrow
      // 0df: goto 055
      // 0e2: aload 1
      // 0e3: aload 5
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbab (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 0e8: istore 6
      // 0ea: aload 0
      // 0eb: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aba Ljava/util/Map;
      // 0ee: aload 4
      // 0f0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 0f3: bipush 0
      // 0f4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0f7: invokeinterface java/util/Map.getOrDefault (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0fc: checkcast java/lang/Boolean
      // 0ff: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 102: istore 7
      // 104: aload 0
      // 105: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aba Ljava/util/Map;
      // 108: aload 4
      // 10a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 10d: iload 6
      // 10f: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 112: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 117: pop
      // 118: iload 6
      // 11a: iload 2
      // 11b: ifne 127
      // 11e: ifeq 13c
      // 121: goto 125
      // 124: athrow
      // 125: iload 7
      // 127: ifne 13c
      // 12a: aload 0
      // 12b: aload 4
      // 12d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 130: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaaa (Ljava/lang/String;)Ljava/util/Map;
      // 133: pop
      // 134: goto 13c
      // 137: astore 8
      // 139: aload 8
      // 13b: pop
      // 13c: iload 2
      // 13d: ifeq 055
      // 140: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -1303035012;
      short var34 = 25308;
      int var33 = 0;
      int var10001 = "Ҟ婺꓿\ue0b4⍟쨛딞䙣ᇔￇ凌曑竰륢\u2d79\uf699蓝褧✠빿\ue67b⭂恵႑曘ꦴ蛋ు㗰\uedbc\ud863ﭠࣇ獾맵力縔㲯ﭨꓚ椗䄫谮퍧콢\uee0a鼷\ue8ff樞䟰툦⎃ი䢎䏝媢藯댜㿲綹蠬\uf418ႊ㤑ﬗ㑏貧丁䗊\ued89刹ꢉ蒜ꚁ骬䙶雟ﲲ첮⩋᪷ꏕᘘ槍ס籹쾧㈱䮗ꬠ餮苕䵦䛥菸ꎁ㇙聞୰閭﹪㥩槹ޚ\u2e6b皾纈덶ꈄ\u197a抡뢚\uefc3\uf5ceᘶ쳖\udd60㷨韾텵ℚ荩顭\uf807졹ҁ䞜尾踲罯ޣ\uec97쮠핒᠀䱾Ꭷꋾ\ud820\u2d6c䎴잉䈯앏失䉠깇퇮赎䰎\ue22c繮\ue25a⎤䟔ᶵ뇁ǥɇ唱∁\udd3a䯮㸖࢘⸑켔\ue3a6Ỡ笥餴瑻좷鱗ꁟ扽瑰‐\uf0b4ᩄ蔤굂ᆾ䷞䜟浶塶㆟蔓塩\udf61姑隯䧛粺琇\ud938⼬抂㡹₨从娫\ufaf1˴霘ꛇ硠ꢩ᩶疴ଽ퇹酺ல忢芵㘲餻ᕰ饰ࡴꙖ举\udc4b마팆䍡죷\uf35d췱㫮㜨\ued3d꺱꺍괶\uf3b7\udf54䎯ꐌ晄玧쨆ᯠ汙拧敆夿\uf509뷦\ud81f헴檦\ue783쬛㳬ꓶᒂ鯑\u0602䅎龢ꦃ늉\ue06a⣙꽓嵶ꉡ⊚墙堤\ud8e2旛ᮗ㳀ᖓ刹\uf028膦ꋦꦧ₸ᔂࠣ禱ꄉꨊꭨ鑧褼č퀏䗑⤐섯칑\uf85f␝\uea0f\uf623顥\uec60鸛煵餄\uf759ᨌῗ忝謐㪓둗䐀쵦⭡\uf694\uf37b\ued01愸ꑘᱨ脙㼁嫨ƈ䉞쀸\ueea4ꎔ朽䤿悻ᯎ蓾\u0be0尼ᇀ觟\ud90a䏚哺뾊쬩䈎ु甒᰾\u2439咓쏠䊳傃焊㛴甅폯宯鷍쌒駫\u2064䛇\uf4d2䌖Ⱦ⪞铫짯養朏\uea5aൾ⣄庠㳡犈Ԭ깹\ud918\ueae0Ͳ襬⧋脗༰뙐쏊崿ꉗꗛ僚䋋擌\udde1Η鿛퍕틓\udb7eꊹᖣ⮺艥ᣂ⧨䒞\udfec⼸\uec05ෘ\ud912\ue9a3芓㪷鸋\ue1d9\ue6f5㭯撨쾶䚟\uf0cbꘁ䗮짣埄ퟍ䉔。탳폂=\uf52eឬ\ue5c2磀\ud86a圡囹鶯溓\uf6a8\uec39湫ᤖ婸㰌銰ㆯ䧞냘剻ಈ斮䫝殿㞭䛾搞䝍坺㴙鸨\uf604ꡇ]蒀ꔊ鞳᳨捕댁곰ׯဩ\udb3e᨞\udd00多◕맴鑊뿢넪禿㷂媝폳\uf649ﭲ쯓䜮\ufaf4⪔軄喌揞雼㳘굑餟鳿琴ɸ炱Ծ㺪䜰\uf013䞞橤揷ช샵\ud8a4댺ⱂ盹≲鸓ꇅ㲶\ud960죻▭럁뜶\ued98챮뿱㷬\ue2a6\ueaf5认什墮\udd4d拮뀢⊽虍툟ྃ雍\uf8bc맻લ晑ᥦ\uec25\uf8f4W龫觼㋣큰阋諺\uee07⟴喯꽭欹孶棕禥壧ㆊ噲妾ﳁ痮넧솮⣾\uf05a㵡ꢥᅾ퓆ߵ\uf45c奩\udb8c딲㸸ࠏ㩵犢㏖भ\uea6fԭ苖땚嫮殯겘\ue76c柇硊弚嵷쌯ᥪ숪罚洭Ⱏ숒줳膷拆ራㆉ츁\ue5c8娾\uf8c2氡掜雼\u001d\uefbe䛺嶓뜑\ue9d4\ueb62ນᴛꅑ龈䆴\uf45a\udf72\u0cfc쉿惬뗩閟앨ᨵज़茴❎ᖼϣ齷ڡ臤⪫횪欸镍ⴜ젷枣Ṭ鐷\ue7ef⟻\ud973\ue897膬≔읐链듍舎鮄嵮얧陌ဤ\ueed8쳠筧⿄㝤ᮂ⬭剺戭饱\ue919ზ擰뿅\uf33f\ueb3d鞤㾕ݿᔈḺ跨\udb48鍺哢蟛\u2fef\u05fbẎ\uebb8풌춌戞\ue1d1㢯ܤ珉릤欩섻䍏ㄋ彾㳴䢌╩醺๖Ḽ晪ʛꀼ偩\uec58뀱䭺㣮㷹ᘦ艱\uf6e7\ud92a醛ᣓ෯籹ꗌ츭봂\uea59౻偽᱒\uf707㜣奼춢惯뭦उ\uf121䥕䢤縜ሹ⥊䍎ⶴ忎傇뻊\ud90f\uf06e\u1941࠽鋋⭾骊譮Ჿ㻮蚔僞虾䚯镧ᑬㆮ㗥⊵䖟쫼䨬൛翰\u2fdcϭ퀊鑩奂搀㷮\ue264\uef04叫Ž\udce9翣凮d厴摒鞣껱ヲ羯\ud844쟅㏭嶺\udf6dỾᩓ頬귉叔꤬蘁嗥費Ʞ맂\uf0f4饅猍ꉠ鯹\uf206㮯\udf28\uf3d7펴鱋㊐箆\ueb78憪\ueb69\ueafa隓勾㲱\uda17勉㧳\uec98涋㽈䇖䧦쩀Ā┫ゝ蚑컋䋩奊ﮐ־㷉\udd44\ud834⢑\uf5b3젚⌬ᳱ鿱馤匮ཅŊ퐙ㄵ했ㄖ\ud7fe\uebb1饍띰飵魛ᩄ緝\ud853\u0be1쐈\ue4b0\uf7d4穝곩亨轼ǭ쳧\uef7a\uefe6\uf173턝캸\u1ccaꁁ\uf10b咞㢩ヌᬬ낧\udbbe꽝挛\u2e78诗峭䆌籲ḝ줱爽垃荎緯粂\uecb5㇘\ueeb1\ue5d1쎖鳗塂\ue3cf쮝奔\uf75a竳ꐛ坙ꦡ䦙汾\ue83b嗎\uf188Ő讳\udedb\ud836\uebdc\ue76bⰇ䰷ퟚ腄\uebdaᥙ↼㊖犗骾北⯮쥨\uda5c嘾盻뮷ﷄ䵪䨈\ud9efᓆ즤鱔硅栆搇\ud95b沘뜥\uf7aeꫠ\uf6b2\ufbc4Ꜯ 坎Ạ\ue559吱ᮣ韝욡ꪕ륦饗ᶭ퇳Ớ㋅姶鍷啜⮩䗐鷩ⶓ\u0ea6ﵨ땖Ῥꠒ饿\uec99፮亐㎧梚歩ỿ䳊磻폻Ἤ\ue0e9\uecafಶ⡨ꤡ浸赭揧ߞḐ\ueac4\uaa3b퉞鍽\uebd5Õ첅Ⓤ\uf71d\ue7c1⒦藺撻푥ჩ翲樿邽ᓰ\uf4f2밮졧䛲\uea8bᩍᬏ횺縞⑬킀鴳쥅䎛歙㗿浖Ⱍ้﮺窑㎨껚偆퀤ý钦榾⹗❗泙⏺\u2fe7\uf099ᵩꔉ\ud9a9菐ꃂ\ue5d8\ue2e5贔怶㊓ஜ櫮Ᏼ柺≹䃀ꫦ␝䝥烜\ud9b2몒㙙⋑ᦫ\ueef5‼鏎ꖮ歞舚\u1ccaꭳꧨভ\ue1fc俇㞊\ud9af테썂悳爀菌䇆\ue7beႛ呯뛞ꙮ뭽敦\u2fe9콌艀艖ጫ꿞퓐沮Ţ櫻炲昋ﯛ\ue52f鰮\uda47鸐嵜睐整뭠칐겖뢑숻Փ暫䎻馳\uea9c뵲솶\ueafd퓴잒侦햳\u001d셽况箥픑餲\udcc5ꚏ⹊ẛ헹⦞ꠉ⭝ᘉ别윏鳄车衼熍߫\udcecꤎ챯反픛췼峹駵ٰ\ue3e3꾉\ue783⾈\ue2fb쾊\ue7f3꾄\ue4bb\uef94\ue76b꾙\ue6a3侜\ue7eb쾑\ue4cbྏ\ue053侚\ue3e3\uef82\ue0e3ྐ\ue783澃\ue4e3來\ue6b3ྞ\ue7c3꾜\ue69b\uef90\ue5eb\uef83\ue1fb澜\ue77b例\ue27b쾄\ue153\uef8a\ue263쾙\ue15b侁\ue603ྐ\ue143⾛\ue773ྊ\ue7c3澄\ue56b⾐\ue123辀\ue0bb\uef96\ue0f3⾊\ue2c3侃\ue613辑\ue243꾝\ue70b쾈\ue60b꾗\ue743侅\ue463ྍ\ue313依\ue4b3辚\ue213꾇\ue67b꾇\ue06b⾑\ue53b澟\ue4db辜\ue35b꾈\ue4f3\uef89\ue07b⾟\ue72bྊ\ue02b⾞\ue513ྎ\ue65b澝\ue313ྋ\ue66b꾑\ue293⾃\ue74b꾂\ue50b쾘\ue58b쾔\ue7a3澆\ue303\uef92\ue53b澕\ue0c3쾝\ue093依\ue213澜\ue13b⾚\ue3b3ྍ\ue5cb쾀\ue763쾞\ue33b辌\ue133⾂\ue29b辇\ue27b⾍\ue6b3⾆\ue3a3⾞\ue753澜\ue47b澙\ue3c3쾙\ue683쾁\ue3db꾈\ue0db꾑\ue14b꾃\ue7b3侃\ue663꾞\ue2ebྍ\ue73b쾚\ue29b꾙\ue16b⾓\ue04b澌\ue40b⾔\ue073澍\ue4cb澔\ue043쾕\ue7c3꾚\ue063꾈\ue353辔\ue693꾓\ue00b꾗\ue3c3侁\ue103⾅\ue113澅\ue523쾆\ue2f3ྍ\ue63b꾏\ue343꾎\ue633ྟ\ue3ab\uef9c\ue403ྀ\ue183꾇\ue563\uef85\ue333澕\ue793⾆\ue76b侂\ue113⾇\ue55b꾈\ue2eb쾖\ue59b쾍\ue16b\uef8f\ue6a3澍\ue0c3⾖\ue5ab辌\ue593ྀ\ue7cb쾕\ue0d3⾀\ue35b侔\ue3db쾋\ue633澌\ue12b辐\uec93꾺\ued83ྺ\ueccb꾯\ueb0b쾾\uebd3쾻\uef8b澶\ued83ྫ\ued93쾨\ueb8b澴\ueb6b\uefac\ue8db쾦\uec9b\uefab\uec6b쾤\ue873\uefa0\ueddb⾧\ueee3\uefac\ueb6b\uefbd\uecc3\uefa4\uedebྩ\uec8b農\uea03辤\uee43꾵\uecab꾢\uef8b쾲\uec1b辶\ue9d3侵\uef23澱\uebcb澤\uea73꾳\ue91b⾠\ueecb澦\uec2b쾴\uedd3⾺\ued7b⾲\ueac3辿\uea8b澲\ue8db澴\ueac3쾮\ue9e3꾩\ue8d3쾮\ueddb\uefb4\ue9c3⾸\uea43꾯\ue89b⾴\uec9b꾥\uee83⾰\ue96b达\ued5b쾨\ue8db⾱\ue9cb⾥\uef53꾯\ue863\uefae\ue8e3辿\ueab3⾫\uea33ྠ\ue8cb쾥\uea43辳\uedbb辸\uec83澷\uebe3꾸\uece3澣\uee8b⾽\uee73쾻\ueb1bྣ\uef13辸\ueaa3侢\uec03ྨ\ue8eb⾻\uef8b辪\uec83侣\ue803쾹\uedab侳\ue8e3澿\ueecb쾠\uecc3辤\ueeb3辠\uefe3澴\ue8ab辩\uea33辰\ueb2b\uefa4\ueed3྾\uecf3꾩\ue99b쾩\uec23ྪ\uee4b辮\ue87b\uefae\uef9bླ\uea33辩\ued83⾧\ue91b澨\ue893澬\uefab澧\uec73\uefb3\ueb23⾢\uefab澡\ueb53⾲\uef43꾷\ue893\uefa9\ue82b쾣\ueeab꾠\uef4bྨ\uec03쾮\ue83b⾶\ue92b辻\ueebb⾫\ued2bྦ\ue923쾻\uedf3\uefaa\ue8fb澠\uea43쾥\uef6b\uefa9\ue993侹\uea23꾢\ue80b⾻\ue8db꾻\uee8b⾽\uec5b辸\ueb23\uefb6\ue8b3꾸\ue823쾸\ue9bb澻\ue89b辣\ueb7b澺\uebab侬\uee4b侥\uef5b辫\ueff3쾬\ueabb쾦\uf59b\uefcc\uf6d3\u0fdd\uf683࿁\uf543࿌\uf15b࿕\uf3db꿞\uf4a3쿍\uf09b쿔\uf313\uefc7\uf57b\u2fd7\uf7d3⿆\uf54b\uefc3\uf743࿔\uf723\u0fdc\uf143濂\uf0bb濃\uf58b⿇\uf66b俓\uf453保\uf323俛\uf5fb\uefc9\uf523濂\uf683࿓\uf193迓\uf283쿛\uf043\uefcf\uf3db쿄\uf063쿎\uf3fb࿇\uf023\uefda\uf4b3꿒\uf0ab\u0fdc\uf17b꿙\uf6eb迅\uf2eb濎\uf423濓\uf1ab\u0fdb\uf0cb꿜\uf57b\uefde\uf533俏\uf33b࿈\uf5eb俓\uf523\u0fcd\uf32b俉\uf1fb迌\uf60b\u2fdb\uf63b쿇\uf293俁\uf373返\uf2cb迓\uf1e3迌\uf353쿍\uf7c3迓\uf37b迟\uf513\uefc7\uf143꿝\uf64b\u0fdb\uf22b쿛\uf48b濍\uf69b俏\uf62b࿆\uf243࿎\uf0a3࿆\uf23b迒\uf593꿟\uf70b\u2fd9\uf01b쿊\uf25b࿁\uf773\uefc5\uf723࿄\uf2a3迁\uf133\uefc1\uf3db⿀\uf083激\uf633꿕\uf303\uefdb\uf7cb濜\uf7bb꿈\uf483꿅\uf773꿈\uf233俙\uf25b俕\uf05b⿔\uf3ab\u2fda\uf7d3俅\uf733쿄\uf40b쿌\uf20b濈\uf113濉\uf1a3\uefc3\uf403࿎\uf72b濂\uf0ab⿐\uf55b俙\uf10b俀\uf11b\u0fdf\uf183⿊\uf1e3꿍\uf34b俅\uf363\uefc1\uf513迏\uf2eb\uefd0\uf7fb⿊\uf083远\uf223⿇\uf07b濄\uf2fb\u2fd8\uf22b濎\uf2d3俙\uf28b\uefde\uf14b쿆\uf2eb迌\uf313࿌\uf56b꿉\uf71b迏\uf5bb运\uf0e3\uefd6\uf3eb⿕\uf4d3\uefd8\uf77b꿇\uf70b⿋\uf58b迓\uf723还\uf513⿀\uf583꿇\uf673迂\uf063⿀\uf46b迊Ｓ\uefebﮫ\uefe4ﭻ迦ﲳ꿨\ufaeb濹ﻋ쿿\ufae3쿷ﻃ俺ﶫ\u0ff3ﳋ⿹︫⿳ﲣ꿠\uf863\u0ff8ﻃ\ueffa￣俯￫쿥ﰻ\u2ffeﰫ⿷糧迵ﾫ俧ﰓ俶\uf87b\u0ff0ｓ迷ﲋ\ueff1\uf8c3\u0ff7暑濽ﺫ꿪ﳫ\u2fea禎迢Ｓ꿾泥俾\ufbc3\u0ff2ﬣ俠ﷳ濱瀞迤﵋\ueff5﨣\u2fefﲛ迧ﾣ\uefe9ﯻ俠ￓ迬ﰛ俼﵋⿴ףּ꿢暑꿴＃濱層\u2fe9ﱫ쿨﮳信遼꿲遼\ueff7\ufafb俱\uf8cb\ueff9旅\u2fee\uf833꿩恵꿬﹋꿼ﭣ迻ﾣ濪ﱫ\ueff7ﯳ俻\uf81b\ueff4\uf86b⿰דּ濪\ufdd3\u0ff9拾꿺肋\ueff3\uf863\u2fe1︫쿼ﰃ濳ﮣ꿷肋濦\uf8c3\u0fe5北濿ﲋ濳ﷃ\ueff5︣\ueff4肋\u2fe9ﴋ\u0fe8\ufbcb⿴䀘俬\uf87b쿥ﳣ쿭ﱳ쿰靈\u0fe5者迼ﻣ\u0fe7﨓\u2ffcﺃ\u0fef狼濹北迪ﳫ꿿\uf843濱者濯ｳ迿ﭳ迢ﻃ\u0ffcﻃ⿵ﶻ追ﵻ俽屢꿽溜濫荒꿺曆⿺︻꿯\ufffb쿮ﴫ쿥ﮋ\u0feeﻣ\u2fe5﹣迭\uf82b迸弄\u2fe8匿쿮炙꿻Ｓ꿷邏쿦\uf8c3꿮ﳛ\u0fea藍迱ﻻ\ueffd\ufe53濺ﶫ꿡\ufffb꿰\uf8e3\ueffe率迭︻迹ﻫ述\uf8e3\uefe9욃伀쎃꼂옳⼒앳꼋쌃⼅앋伖쏣伌쏓꼔앛載읛꼝쐃\uef01잃\uef02얃輍엃\uef00욳漕솓\uef10숳꼗쓫伐샋⼝쌋漝얳漚윳켚썃༂쒫輅삃\uef0c샃꼗옫伇앓꼕읻\uef1b삳伇쌫伊쁳༞슫켔쁫漋쉓漏웳་쒣꼘쏋\uef01쉃輏숋⼂삋\uef0b쑫⼍앓輄읛⼆윳輈씫켑섓輚쀫༛쐫꼖읃漌썫༇쎃꼔쟳漓쉣漒솣\uef1d얛켌샓伊쐋༝윣༞쌛伔셫\uef0d쀛伏썛⼋잳⼐씳\uef01엓輁샣༒왣꼀엓꼁삻켔섛伞쏛伋윻伅솻꼇쌻輌쇳༅섓꼉윓켋섻伍엫輔왻꼆쇣伛썋⼕쎫켐욣།윣漌웓漅앓\uef1b옳\uef1b윻꼉욣ༀ삣\uef16윳꼝쑋켎씛⼗싳載씓꼚쓻\uef1e얻༟씫⼂쀓༝잓༃쎻켈샣\uef1f쟓伇씳켗쇃༇섻⼞쒳꼌쀣꼑삛\uef18썻꼚욻⼗쉓会쌻輍솳伃섛伞옳켖쓋輛쏳༛쐃켃쉳漝슃伇앻⼏쐃⼖쟫輟쓋漛쏻⼏쵳⼠챻伸컻伵춃꼣즋\uef36쯋漡챓⼹컃輢촋⼴죃漡쵫켷젳漽쾣⼺젛꼻첛켷캓传촛輱졻似첋༴찻꼱칛伴죃⼺쳛켤쿓輸쩣༵칣\uef2b칋伿켻༿챛꼿쿣\uef22쪣伢켳\uef36좫⼨짫꼯촣\uef28쾳輻졃輺촳༼쿛⼺쥫⼡젋\uef2d줳켼칻\uef2b찣\uef3a젋༻졻漫컃꼷츓༬쾛꼮졳켻쪣輤즛⼪츳켢쫫⼧쨛\uef31첳꼫쿣꼫즫켨쬳輡쭻伥촛꼹챣༵쩃⼬첛켯쥻꼭컋輺콣伥쾻⼣쾓輩쨓༥츳漸쮫⼶좳伹췫輣좳輺컃\uef23콛꼷찃켰쬃⼿쳋꼸쵓伢찫켨쩣༿줳꼠쬳꼥춛伮춋༼츛༽죛伯좓켡츫\uef3e쳃輼쩛漵젳꼺컣켣쪋\uef3f즫༴쩫\uef23캛\uef2f첻\uef2b쨃⼰젓\uef34찓༪촳⼱쪣輸쵻⼶쫃漫줫켺콣\uef37컃꼶졫伮쬣漹찻⼾쩻\uef21칛漲콫漲쯣⼥첻⼪쵣༤줳꼺찫輻쾃⼰쳣⼹첳꼯촻輵캫輧졛༥쾣漴흓콑툃潙큣佃푛\uef50틻꽁큳潀푃꽈횻⽘휓꽄턳⽐톣콆폻콟톃潍푣ཆ틣佛픫\uef41턳轎힣潊훫\uef4e혫꽟헳\uef41퐛轉퇋콊퐻ཐ킛轐킛⽊툣\uef49힋\uef48폓佇풳潒퍛ད턳体펃མ툛콚퇳코횫ཁ킋何퍃潀휣⽟혃潛ퟳཞ틫콂펻轋턃꽄퇻⽔핛潃휓⽖팃佌핻潒톫轅팫꽐핻⽄흳潟휛\uef59폛꽛풳佈\n뼅盿뼥\uf6f0벭雲볕\uf6f2뱥㛲\u0010⧏㲨⫏ﲺ⸏ﲮⵏ岡ⳏ粲⩏벥ⵇ岮\u2e7f㲹\n疹藕疙ך瘑旘癩ט盙엘Ȱ힓콜푛코퐻佛툣꽐혃꽉횫佛홳佖픓⽍훳轟퓓ཅ푋⽖핋མퟃ콉흃콏홫轑퉳콞휃何펳佝퓻꽔훫⽇풛콛톃⽊헛꽑튻低풋\uef5c톋꽄홋作혳콞헫⽞힛콄탫潘펓꽖핫佂흻轛흓콛폻潊푋潂턋⽔핳⽉퀫轓햃콗톻콄픣པ휋轟ퟓ佉힣潚텋⽏훳轌ퟛ⽅퍣何횻꽙혣꽏흳ཏ퇻⽞풃佇펳ཝ픻潆혋\uef47햳\uef58홣콖휛\uef4b퇫潇탋\uef5e흓⽞폛⽊핻\uef5c틛ཋ흳ཛྷ틛ཙ큳\uef5a턓⽁흣\uef59펣\uef52툛콉퉛轍힛ད퉓\uef5d틛\uef59힃꽕푃潀퍋ན팳⽆풋\uef5f퐫轅퇫\uef51퉫⽐흋轑턫콍틃潄탳ཆ헓\u0f48틳콑툛潖퍫佝햫꽍탓꽉틃轒틳꽄퐋\uef56픳\uef42텳콖퀫轘힣\uef54틻佗툣\uef43힣⽜툳꽐퇃佑튳⽆흫⽘ퟫ⽂탃⽊퀓佂퍫潎텣佃풣潕툃轊푣\uef4d퇃꽛헫佄폣⽀퇓콜횓潞킻\uef53턳꽑홓轟퇻ག폻潟\udc23\uef6c\udb23콹\udee3佡\udff3꽱\ude63⽱\udcd3\uef7c\ud89b潰\ud903ལ\udec3⽨\udffb콲\udf2bཀྵ\uda83콩\udedb佡\udfeb潸\udd0bཪ\udfcb꽭\udd2b꽢\uddbb潾\udc03⽴\udd93콵\udef3콵\udc1b\uef67\ud83bཪ\udf4b佷\udf23轤\ud80b콿\udb63ཽ\ud99b⽵\udf3b⽧\udd0b\uef68\udce3콰\udf03ྲྀ\udc9b콩\udbf3佥\ude1b꽿\uda7b\uef74\uddbb콹\ud9b3潴\ud97b콶\udf4b⽮\udc53轳\ud903ཾ\uddbb车\udb23\uef68\ude9b轢\udaf3콳\udafb佷\uda03꽫\udeb3ལ\ud8a3佴\ud83b\uef6a\udeeb\uef68\udf0bཱ\udd2bཨ\uda0b潫\udbd3轾\ude93꽴\udc6b⽰\udfdb⽰\ud863ླྀ\udd93꽢\udbdb\uef67\udd73潫\udedb⽮\ud943潶\udbdb\uef6e\udd83佼\udacb佥\ud873⽥\uda1b⽰\udc3b\uef62\udf13⽬\ud813꽭\udea3꽤\udc73潱\udfcb使\ud85b潣\ud9e3⽭\uddd3轩\ud93b꽧\ud9ab轤\ud9a3\uef65\ud82b轼\ud953ཱུ\udb93⽥\ude33⽱\uda5b⽮\ud98b佼\udb93ཪ\uddab轷\udd43⽣\ud853꽫\uda73콣\ud9a3ི\udd83⽯\ude53佡\ud833潠\ud9e3\uef7b\ud8e3\uef6d\ude13ཨ\ud963佳\udf13轴\ud81b⽤\ude93\uef6b\ud9abལ\udba3⽽\ude93轡\udb63佽\udb3b콽\ud92b轮\ud9bb轶\uddd3轾\ud8bb⽳\udba3潧\ud9db\u0f70\ud8e3⽵\ud90b潦\ude9b潹\ud85b콽\uda8b꽭\udb3b꽸\udcab\uef6e\udf43콱\udee3⽾\udaeb⽤\udcb3콨\udb93\uef61\udd3b콣잓⼓솣켚쟓漟삋\uef03엃輈왓ༀ쀛༒쒣\uef0b쐫\uef1d엫輁쐋輄쀃輘쑛༞썋༔셃漇숛漃앓漓쑣伋왣\uef14읻⼟왓꼌쑳켐쓻༊샓\uef03\n哥\uf550哅畟坍ᕝ圵畝垅땝\u0010斖馈揎妓摖禍掖妋擎如撆馝晦禈怎禖\n圠\ue15f圀慐咈Œ哰慒呀ꅒ"
         .length();
      int var32 = 0;
      String[] var31 = new String[10];
      int var30 = var10001;
      String var29 = "Ҟ婺꓿\ue0b4⍟쨛딞䙣ᇔￇ凌曑竰륢\u2d79\uf699蓝褧✠빿\ue67b⭂恵႑曘ꦴ蛋ు㗰\uedbc\ud863ﭠࣇ獾맵力縔㲯ﭨꓚ椗䄫谮퍧콢\uee0a鼷\ue8ff樞䟰툦⎃ი䢎䏝媢藯댜㿲綹蠬\uf418ႊ㤑ﬗ㑏貧丁䗊\ued89刹ꢉ蒜ꚁ骬䙶雟ﲲ첮⩋᪷ꏕᘘ槍ס籹쾧㈱䮗ꬠ餮苕䵦䛥菸ꎁ㇙聞୰閭﹪㥩槹ޚ\u2e6b皾纈덶ꈄ\u197a抡뢚\uefc3\uf5ceᘶ쳖\udd60㷨韾텵ℚ荩顭\uf807졹ҁ䞜尾踲罯ޣ\uec97쮠핒᠀䱾Ꭷꋾ\ud820\u2d6c䎴잉䈯앏失䉠깇퇮赎䰎\ue22c繮\ue25a⎤䟔ᶵ뇁ǥɇ唱∁\udd3a䯮㸖࢘⸑켔\ue3a6Ỡ笥餴瑻좷鱗ꁟ扽瑰‐\uf0b4ᩄ蔤굂ᆾ䷞䜟浶塶㆟蔓塩\udf61姑隯䧛粺琇\ud938⼬抂㡹₨从娫\ufaf1˴霘ꛇ硠ꢩ᩶疴ଽ퇹酺ல忢芵㘲餻ᕰ饰ࡴꙖ举\udc4b마팆䍡죷\uf35d췱㫮㜨\ued3d꺱꺍괶\uf3b7\udf54䎯ꐌ晄玧쨆ᯠ汙拧敆夿\uf509뷦\ud81f헴檦\ue783쬛㳬ꓶᒂ鯑\u0602䅎龢ꦃ늉\ue06a⣙꽓嵶ꉡ⊚墙堤\ud8e2旛ᮗ㳀ᖓ刹\uf028膦ꋦꦧ₸ᔂࠣ禱ꄉꨊꭨ鑧褼č퀏䗑⤐섯칑\uf85f␝\uea0f\uf623顥\uec60鸛煵餄\uf759ᨌῗ忝謐㪓둗䐀쵦⭡\uf694\uf37b\ued01愸ꑘᱨ脙㼁嫨ƈ䉞쀸\ueea4ꎔ朽䤿悻ᯎ蓾\u0be0尼ᇀ觟\ud90a䏚哺뾊쬩䈎ु甒᰾\u2439咓쏠䊳傃焊㛴甅폯宯鷍쌒駫\u2064䛇\uf4d2䌖Ⱦ⪞铫짯養朏\uea5aൾ⣄庠㳡犈Ԭ깹\ud918\ueae0Ͳ襬⧋脗༰뙐쏊崿ꉗꗛ僚䋋擌\udde1Η鿛퍕틓\udb7eꊹᖣ⮺艥ᣂ⧨䒞\udfec⼸\uec05ෘ\ud912\ue9a3芓㪷鸋\ue1d9\ue6f5㭯撨쾶䚟\uf0cbꘁ䗮짣埄ퟍ䉔。탳폂=\uf52eឬ\ue5c2磀\ud86a圡囹鶯溓\uf6a8\uec39湫ᤖ婸㰌銰ㆯ䧞냘剻ಈ斮䫝殿㞭䛾搞䝍坺㴙鸨\uf604ꡇ]蒀ꔊ鞳᳨捕댁곰ׯဩ\udb3e᨞\udd00多◕맴鑊뿢넪禿㷂媝폳\uf649ﭲ쯓䜮\ufaf4⪔軄喌揞雼㳘굑餟鳿琴ɸ炱Ծ㺪䜰\uf013䞞橤揷ช샵\ud8a4댺ⱂ盹≲鸓ꇅ㲶\ud960죻▭럁뜶\ued98챮뿱㷬\ue2a6\ueaf5认什墮\udd4d拮뀢⊽虍툟ྃ雍\uf8bc맻લ晑ᥦ\uec25\uf8f4W龫觼㋣큰阋諺\uee07⟴喯꽭欹孶棕禥壧ㆊ噲妾ﳁ痮넧솮⣾\uf05a㵡ꢥᅾ퓆ߵ\uf45c奩\udb8c딲㸸ࠏ㩵犢㏖भ\uea6fԭ苖땚嫮殯겘\ue76c柇硊弚嵷쌯ᥪ숪罚洭Ⱏ숒줳膷拆ራㆉ츁\ue5c8娾\uf8c2氡掜雼\u001d\uefbe䛺嶓뜑\ue9d4\ueb62ນᴛꅑ龈䆴\uf45a\udf72\u0cfc쉿惬뗩閟앨ᨵज़茴❎ᖼϣ齷ڡ臤⪫횪欸镍ⴜ젷枣Ṭ鐷\ue7ef⟻\ud973\ue897膬≔읐链듍舎鮄嵮얧陌ဤ\ueed8쳠筧⿄㝤ᮂ⬭剺戭饱\ue919ზ擰뿅\uf33f\ueb3d鞤㾕ݿᔈḺ跨\udb48鍺哢蟛\u2fef\u05fbẎ\uebb8풌춌戞\ue1d1㢯ܤ珉릤欩섻䍏ㄋ彾㳴䢌╩醺๖Ḽ晪ʛꀼ偩\uec58뀱䭺㣮㷹ᘦ艱\uf6e7\ud92a醛ᣓ෯籹ꗌ츭봂\uea59౻偽᱒\uf707㜣奼춢惯뭦उ\uf121䥕䢤縜ሹ⥊䍎ⶴ忎傇뻊\ud90f\uf06e\u1941࠽鋋⭾骊譮Ჿ㻮蚔僞虾䚯镧ᑬㆮ㗥⊵䖟쫼䨬൛翰\u2fdcϭ퀊鑩奂搀㷮\ue264\uef04叫Ž\udce9翣凮d厴摒鞣껱ヲ羯\ud844쟅㏭嶺\udf6dỾᩓ頬귉叔꤬蘁嗥費Ʞ맂\uf0f4饅猍ꉠ鯹\uf206㮯\udf28\uf3d7펴鱋㊐箆\ueb78憪\ueb69\ueafa隓勾㲱\uda17勉㧳\uec98涋㽈䇖䧦쩀Ā┫ゝ蚑컋䋩奊ﮐ־㷉\udd44\ud834⢑\uf5b3젚⌬ᳱ鿱馤匮ཅŊ퐙ㄵ했ㄖ\ud7fe\uebb1饍띰飵魛ᩄ緝\ud853\u0be1쐈\ue4b0\uf7d4穝곩亨轼ǭ쳧\uef7a\uefe6\uf173턝캸\u1ccaꁁ\uf10b咞㢩ヌᬬ낧\udbbe꽝挛\u2e78诗峭䆌籲ḝ줱爽垃荎緯粂\uecb5㇘\ueeb1\ue5d1쎖鳗塂\ue3cf쮝奔\uf75a竳ꐛ坙ꦡ䦙汾\ue83b嗎\uf188Ő讳\udedb\ud836\uebdc\ue76bⰇ䰷ퟚ腄\uebdaᥙ↼㊖犗骾北⯮쥨\uda5c嘾盻뮷ﷄ䵪䨈\ud9efᓆ즤鱔硅栆搇\ud95b沘뜥\uf7aeꫠ\uf6b2\ufbc4Ꜯ 坎Ạ\ue559吱ᮣ韝욡ꪕ륦饗ᶭ퇳Ớ㋅姶鍷啜⮩䗐鷩ⶓ\u0ea6ﵨ땖Ῥꠒ饿\uec99፮亐㎧梚歩ỿ䳊磻폻Ἤ\ue0e9\uecafಶ⡨ꤡ浸赭揧ߞḐ\ueac4\uaa3b퉞鍽\uebd5Õ첅Ⓤ\uf71d\ue7c1⒦藺撻푥ჩ翲樿邽ᓰ\uf4f2밮졧䛲\uea8bᩍᬏ횺縞⑬킀鴳쥅䎛歙㗿浖Ⱍ้﮺窑㎨껚偆퀤ý钦榾⹗❗泙⏺\u2fe7\uf099ᵩꔉ\ud9a9菐ꃂ\ue5d8\ue2e5贔怶㊓ஜ櫮Ᏼ柺≹䃀ꫦ␝䝥烜\ud9b2몒㙙⋑ᦫ\ueef5‼鏎ꖮ歞舚\u1ccaꭳꧨভ\ue1fc俇㞊\ud9af테썂悳爀菌䇆\ue7beႛ呯뛞ꙮ뭽敦\u2fe9콌艀艖ጫ꿞퓐沮Ţ櫻炲昋ﯛ\ue52f鰮\uda47鸐嵜睐整뭠칐겖뢑숻Փ暫䎻馳\uea9c뵲솶\ueafd퓴잒侦햳\u001d셽况箥픑餲\udcc5ꚏ⹊ẛ헹⦞ꠉ⭝ᘉ别윏鳄车衼熍߫\udcecꤎ챯反픛췼峹駵ٰ\ue3e3꾉\ue783⾈\ue2fb쾊\ue7f3꾄\ue4bb\uef94\ue76b꾙\ue6a3侜\ue7eb쾑\ue4cbྏ\ue053侚\ue3e3\uef82\ue0e3ྐ\ue783澃\ue4e3來\ue6b3ྞ\ue7c3꾜\ue69b\uef90\ue5eb\uef83\ue1fb澜\ue77b例\ue27b쾄\ue153\uef8a\ue263쾙\ue15b侁\ue603ྐ\ue143⾛\ue773ྊ\ue7c3澄\ue56b⾐\ue123辀\ue0bb\uef96\ue0f3⾊\ue2c3侃\ue613辑\ue243꾝\ue70b쾈\ue60b꾗\ue743侅\ue463ྍ\ue313依\ue4b3辚\ue213꾇\ue67b꾇\ue06b⾑\ue53b澟\ue4db辜\ue35b꾈\ue4f3\uef89\ue07b⾟\ue72bྊ\ue02b⾞\ue513ྎ\ue65b澝\ue313ྋ\ue66b꾑\ue293⾃\ue74b꾂\ue50b쾘\ue58b쾔\ue7a3澆\ue303\uef92\ue53b澕\ue0c3쾝\ue093依\ue213澜\ue13b⾚\ue3b3ྍ\ue5cb쾀\ue763쾞\ue33b辌\ue133⾂\ue29b辇\ue27b⾍\ue6b3⾆\ue3a3⾞\ue753澜\ue47b澙\ue3c3쾙\ue683쾁\ue3db꾈\ue0db꾑\ue14b꾃\ue7b3侃\ue663꾞\ue2ebྍ\ue73b쾚\ue29b꾙\ue16b⾓\ue04b澌\ue40b⾔\ue073澍\ue4cb澔\ue043쾕\ue7c3꾚\ue063꾈\ue353辔\ue693꾓\ue00b꾗\ue3c3侁\ue103⾅\ue113澅\ue523쾆\ue2f3ྍ\ue63b꾏\ue343꾎\ue633ྟ\ue3ab\uef9c\ue403ྀ\ue183꾇\ue563\uef85\ue333澕\ue793⾆\ue76b侂\ue113⾇\ue55b꾈\ue2eb쾖\ue59b쾍\ue16b\uef8f\ue6a3澍\ue0c3⾖\ue5ab辌\ue593ྀ\ue7cb쾕\ue0d3⾀\ue35b侔\ue3db쾋\ue633澌\ue12b辐\uec93꾺\ued83ྺ\ueccb꾯\ueb0b쾾\uebd3쾻\uef8b澶\ued83ྫ\ued93쾨\ueb8b澴\ueb6b\uefac\ue8db쾦\uec9b\uefab\uec6b쾤\ue873\uefa0\ueddb⾧\ueee3\uefac\ueb6b\uefbd\uecc3\uefa4\uedebྩ\uec8b農\uea03辤\uee43꾵\uecab꾢\uef8b쾲\uec1b辶\ue9d3侵\uef23澱\uebcb澤\uea73꾳\ue91b⾠\ueecb澦\uec2b쾴\uedd3⾺\ued7b⾲\ueac3辿\uea8b澲\ue8db澴\ueac3쾮\ue9e3꾩\ue8d3쾮\ueddb\uefb4\ue9c3⾸\uea43꾯\ue89b⾴\uec9b꾥\uee83⾰\ue96b达\ued5b쾨\ue8db⾱\ue9cb⾥\uef53꾯\ue863\uefae\ue8e3辿\ueab3⾫\uea33ྠ\ue8cb쾥\uea43辳\uedbb辸\uec83澷\uebe3꾸\uece3澣\uee8b⾽\uee73쾻\ueb1bྣ\uef13辸\ueaa3侢\uec03ྨ\ue8eb⾻\uef8b辪\uec83侣\ue803쾹\uedab侳\ue8e3澿\ueecb쾠\uecc3辤\ueeb3辠\uefe3澴\ue8ab辩\uea33辰\ueb2b\uefa4\ueed3྾\uecf3꾩\ue99b쾩\uec23ྪ\uee4b辮\ue87b\uefae\uef9bླ\uea33辩\ued83⾧\ue91b澨\ue893澬\uefab澧\uec73\uefb3\ueb23⾢\uefab澡\ueb53⾲\uef43꾷\ue893\uefa9\ue82b쾣\ueeab꾠\uef4bྨ\uec03쾮\ue83b⾶\ue92b辻\ueebb⾫\ued2bྦ\ue923쾻\uedf3\uefaa\ue8fb澠\uea43쾥\uef6b\uefa9\ue993侹\uea23꾢\ue80b⾻\ue8db꾻\uee8b⾽\uec5b辸\ueb23\uefb6\ue8b3꾸\ue823쾸\ue9bb澻\ue89b辣\ueb7b澺\uebab侬\uee4b侥\uef5b辫\ueff3쾬\ueabb쾦\uf59b\uefcc\uf6d3\u0fdd\uf683࿁\uf543࿌\uf15b࿕\uf3db꿞\uf4a3쿍\uf09b쿔\uf313\uefc7\uf57b\u2fd7\uf7d3⿆\uf54b\uefc3\uf743࿔\uf723\u0fdc\uf143濂\uf0bb濃\uf58b⿇\uf66b俓\uf453保\uf323俛\uf5fb\uefc9\uf523濂\uf683࿓\uf193迓\uf283쿛\uf043\uefcf\uf3db쿄\uf063쿎\uf3fb࿇\uf023\uefda\uf4b3꿒\uf0ab\u0fdc\uf17b꿙\uf6eb迅\uf2eb濎\uf423濓\uf1ab\u0fdb\uf0cb꿜\uf57b\uefde\uf533俏\uf33b࿈\uf5eb俓\uf523\u0fcd\uf32b俉\uf1fb迌\uf60b\u2fdb\uf63b쿇\uf293俁\uf373返\uf2cb迓\uf1e3迌\uf353쿍\uf7c3迓\uf37b迟\uf513\uefc7\uf143꿝\uf64b\u0fdb\uf22b쿛\uf48b濍\uf69b俏\uf62b࿆\uf243࿎\uf0a3࿆\uf23b迒\uf593꿟\uf70b\u2fd9\uf01b쿊\uf25b࿁\uf773\uefc5\uf723࿄\uf2a3迁\uf133\uefc1\uf3db⿀\uf083激\uf633꿕\uf303\uefdb\uf7cb濜\uf7bb꿈\uf483꿅\uf773꿈\uf233俙\uf25b俕\uf05b⿔\uf3ab\u2fda\uf7d3俅\uf733쿄\uf40b쿌\uf20b濈\uf113濉\uf1a3\uefc3\uf403࿎\uf72b濂\uf0ab⿐\uf55b俙\uf10b俀\uf11b\u0fdf\uf183⿊\uf1e3꿍\uf34b俅\uf363\uefc1\uf513迏\uf2eb\uefd0\uf7fb⿊\uf083远\uf223⿇\uf07b濄\uf2fb\u2fd8\uf22b濎\uf2d3俙\uf28b\uefde\uf14b쿆\uf2eb迌\uf313࿌\uf56b꿉\uf71b迏\uf5bb运\uf0e3\uefd6\uf3eb⿕\uf4d3\uefd8\uf77b꿇\uf70b⿋\uf58b迓\uf723还\uf513⿀\uf583꿇\uf673迂\uf063⿀\uf46b迊Ｓ\uefebﮫ\uefe4ﭻ迦ﲳ꿨\ufaeb濹ﻋ쿿\ufae3쿷ﻃ俺ﶫ\u0ff3ﳋ⿹︫⿳ﲣ꿠\uf863\u0ff8ﻃ\ueffa￣俯￫쿥ﰻ\u2ffeﰫ⿷糧迵ﾫ俧ﰓ俶\uf87b\u0ff0ｓ迷ﲋ\ueff1\uf8c3\u0ff7暑濽ﺫ꿪ﳫ\u2fea禎迢Ｓ꿾泥俾\ufbc3\u0ff2ﬣ俠ﷳ濱瀞迤﵋\ueff5﨣\u2fefﲛ迧ﾣ\uefe9ﯻ俠ￓ迬ﰛ俼﵋⿴ףּ꿢暑꿴＃濱層\u2fe9ﱫ쿨﮳信遼꿲遼\ueff7\ufafb俱\uf8cb\ueff9旅\u2fee\uf833꿩恵꿬﹋꿼ﭣ迻ﾣ濪ﱫ\ueff7ﯳ俻\uf81b\ueff4\uf86b⿰דּ濪\ufdd3\u0ff9拾꿺肋\ueff3\uf863\u2fe1︫쿼ﰃ濳ﮣ꿷肋濦\uf8c3\u0fe5北濿ﲋ濳ﷃ\ueff5︣\ueff4肋\u2fe9ﴋ\u0fe8\ufbcb⿴䀘俬\uf87b쿥ﳣ쿭ﱳ쿰靈\u0fe5者迼ﻣ\u0fe7﨓\u2ffcﺃ\u0fef狼濹北迪ﳫ꿿\uf843濱者濯ｳ迿ﭳ迢ﻃ\u0ffcﻃ⿵ﶻ追ﵻ俽屢꿽溜濫荒꿺曆⿺︻꿯\ufffb쿮ﴫ쿥ﮋ\u0feeﻣ\u2fe5﹣迭\uf82b迸弄\u2fe8匿쿮炙꿻Ｓ꿷邏쿦\uf8c3꿮ﳛ\u0fea藍迱ﻻ\ueffd\ufe53濺ﶫ꿡\ufffb꿰\uf8e3\ueffe率迭︻迹ﻫ述\uf8e3\uefe9욃伀쎃꼂옳⼒앳꼋쌃⼅앋伖쏣伌쏓꼔앛載읛꼝쐃\uef01잃\uef02얃輍엃\uef00욳漕솓\uef10숳꼗쓫伐샋⼝쌋漝얳漚윳켚썃༂쒫輅삃\uef0c샃꼗옫伇앓꼕읻\uef1b삳伇쌫伊쁳༞슫켔쁫漋쉓漏웳་쒣꼘쏋\uef01쉃輏숋⼂삋\uef0b쑫⼍앓輄읛⼆윳輈씫켑섓輚쀫༛쐫꼖읃漌썫༇쎃꼔쟳漓쉣漒솣\uef1d얛켌샓伊쐋༝윣༞쌛伔셫\uef0d쀛伏썛⼋잳⼐씳\uef01엓輁샣༒왣꼀엓꼁삻켔섛伞쏛伋윻伅솻꼇쌻輌쇳༅섓꼉윓켋섻伍엫輔왻꼆쇣伛썋⼕쎫켐욣།윣漌웓漅앓\uef1b옳\uef1b윻꼉욣ༀ삣\uef16윳꼝쑋켎씛⼗싳載씓꼚쓻\uef1e얻༟씫⼂쀓༝잓༃쎻켈샣\uef1f쟓伇씳켗쇃༇섻⼞쒳꼌쀣꼑삛\uef18썻꼚욻⼗쉓会쌻輍솳伃섛伞옳켖쓋輛쏳༛쐃켃쉳漝슃伇앻⼏쐃⼖쟫輟쓋漛쏻⼏쵳⼠챻伸컻伵춃꼣즋\uef36쯋漡챓⼹컃輢촋⼴죃漡쵫켷젳漽쾣⼺젛꼻첛켷캓传촛輱졻似첋༴찻꼱칛伴죃⼺쳛켤쿓輸쩣༵칣\uef2b칋伿켻༿챛꼿쿣\uef22쪣伢켳\uef36좫⼨짫꼯촣\uef28쾳輻졃輺촳༼쿛⼺쥫⼡젋\uef2d줳켼칻\uef2b찣\uef3a젋༻졻漫컃꼷츓༬쾛꼮졳켻쪣輤즛⼪츳켢쫫⼧쨛\uef31첳꼫쿣꼫즫켨쬳輡쭻伥촛꼹챣༵쩃⼬첛켯쥻꼭컋輺콣伥쾻⼣쾓輩쨓༥츳漸쮫⼶좳伹췫輣좳輺컃\uef23콛꼷찃켰쬃⼿쳋꼸쵓伢찫켨쩣༿줳꼠쬳꼥춛伮춋༼츛༽죛伯좓켡츫\uef3e쳃輼쩛漵젳꼺컣켣쪋\uef3f즫༴쩫\uef23캛\uef2f첻\uef2b쨃⼰젓\uef34찓༪촳⼱쪣輸쵻⼶쫃漫줫켺콣\uef37컃꼶졫伮쬣漹찻⼾쩻\uef21칛漲콫漲쯣⼥첻⼪쵣༤줳꼺찫輻쾃⼰쳣⼹첳꼯촻輵캫輧졛༥쾣漴흓콑툃潙큣佃푛\uef50틻꽁큳潀푃꽈횻⽘휓꽄턳⽐톣콆폻콟톃潍푣ཆ틣佛픫\uef41턳轎힣潊훫\uef4e혫꽟헳\uef41퐛轉퇋콊퐻ཐ킛轐킛⽊툣\uef49힋\uef48폓佇풳潒퍛ད턳体펃མ툛콚퇳코횫ཁ킋何퍃潀휣⽟혃潛ퟳཞ틫콂펻轋턃꽄퇻⽔핛潃휓⽖팃佌핻潒톫轅팫꽐핻⽄흳潟휛\uef59폛꽛풳佈\n뼅盿뼥\uf6f0벭雲볕\uf6f2뱥㛲\u0010⧏㲨⫏ﲺ⸏ﲮⵏ岡ⳏ粲⩏벥ⵇ岮\u2e7f㲹\n疹藕疙ך瘑旘癩ט盙엘Ȱ힓콜푛코퐻佛툣꽐혃꽉횫佛홳佖픓⽍훳轟퓓ཅ푋⽖핋མퟃ콉흃콏홫轑퉳콞휃何펳佝퓻꽔훫⽇풛콛톃⽊헛꽑튻低풋\uef5c톋꽄홋作혳콞헫⽞힛콄탫潘펓꽖핫佂흻轛흓콛폻潊푋潂턋⽔핳⽉퀫轓햃콗톻콄픣པ휋轟ퟓ佉힣潚텋⽏훳轌ퟛ⽅퍣何횻꽙혣꽏흳ཏ퇻⽞풃佇펳ཝ픻潆혋\uef47햳\uef58홣콖휛\uef4b퇫潇탋\uef5e흓⽞폛⽊핻\uef5c틛ཋ흳ཛྷ틛ཙ큳\uef5a턓⽁흣\uef59펣\uef52툛콉퉛轍힛ད퉓\uef5d틛\uef59힃꽕푃潀퍋ན팳⽆풋\uef5f퐫轅퇫\uef51퉫⽐흋轑턫콍틃潄탳ཆ헓\u0f48틳콑툛潖퍫佝햫꽍탓꽉틃轒틳꽄퐋\uef56픳\uef42텳콖퀫轘힣\uef54틻佗툣\uef43힣⽜툳꽐퇃佑튳⽆흫⽘ퟫ⽂탃⽊퀓佂퍫潎텣佃풣潕툃轊푣\uef4d퇃꽛헫佄폣⽀퇓콜횓潞킻\uef53턳꽑홓轟퇻ག폻潟\udc23\uef6c\udb23콹\udee3佡\udff3꽱\ude63⽱\udcd3\uef7c\ud89b潰\ud903ལ\udec3⽨\udffb콲\udf2bཀྵ\uda83콩\udedb佡\udfeb潸\udd0bཪ\udfcb꽭\udd2b꽢\uddbb潾\udc03⽴\udd93콵\udef3콵\udc1b\uef67\ud83bཪ\udf4b佷\udf23轤\ud80b콿\udb63ཽ\ud99b⽵\udf3b⽧\udd0b\uef68\udce3콰\udf03ྲྀ\udc9b콩\udbf3佥\ude1b꽿\uda7b\uef74\uddbb콹\ud9b3潴\ud97b콶\udf4b⽮\udc53轳\ud903ཾ\uddbb车\udb23\uef68\ude9b轢\udaf3콳\udafb佷\uda03꽫\udeb3ལ\ud8a3佴\ud83b\uef6a\udeeb\uef68\udf0bཱ\udd2bཨ\uda0b潫\udbd3轾\ude93꽴\udc6b⽰\udfdb⽰\ud863ླྀ\udd93꽢\udbdb\uef67\udd73潫\udedb⽮\ud943潶\udbdb\uef6e\udd83佼\udacb佥\ud873⽥\uda1b⽰\udc3b\uef62\udf13⽬\ud813꽭\udea3꽤\udc73潱\udfcb使\ud85b潣\ud9e3⽭\uddd3轩\ud93b꽧\ud9ab轤\ud9a3\uef65\ud82b轼\ud953ཱུ\udb93⽥\ude33⽱\uda5b⽮\ud98b佼\udb93ཪ\uddab轷\udd43⽣\ud853꽫\uda73콣\ud9a3ི\udd83⽯\ude53佡\ud833潠\ud9e3\uef7b\ud8e3\uef6d\ude13ཨ\ud963佳\udf13轴\ud81b⽤\ude93\uef6b\ud9abལ\udba3⽽\ude93轡\udb63佽\udb3b콽\ud92b轮\ud9bb轶\uddd3轾\ud8bb⽳\udba3潧\ud9db\u0f70\ud8e3⽵\ud90b潦\ude9b潹\ud85b콽\uda8b꽭\udb3b꽸\udcab\uef6e\udf43콱\udee3⽾\udaeb⽤\udcb3콨\udb93\uef61\udd3b콣잓⼓솣켚쟓漟삋\uef03엃輈왓ༀ쀛༒쒣\uef0b쐫\uef1d엫輁쐋輄쀃輘쑛༞썋༔셃漇숛漃앓漓쑣伋왣\uef14읻⼟왓꼌쑳켐쓻༊샓\uef03\n哥\uf550哅畟坍ᕝ圵畝垅땝\u0010斖馈揎妓摖禍掖妋擎如撆馝晦禈怎禖\n圠\ue15f圀慐咈Œ哰慒呀ꅒ";

      do {
         int var37 = 0;
         char var35 = var29.charAt(var33);
         char[] var36 = var29.substring(var33 + 1, var33 + 1 + var35).toCharArray();

         do {
            char var38 = var36[var37];
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 3 | var38 << '\r') & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 3 | var38 >>> '\r') & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      aaabb = var31;
      aabaa = new Object[var31.length];
      int var25 = 471923713;
      byte[] var23 = "µÏ\u0091Ü\u000bt\u008cZR\u0084 D\bê¼\u0007¨\u0013Jçåý\u0095ºz\\ZÛdåÖ[yS\u009a\b\u0081{Ñ0\u0011æõ\u009cDò½¾«\u0018_\u0086\u001f7U\"\u008d\u0095æ\u0082U\u0089è\u0084\u00106\u009cSzÖdý\u000b\u0016ÿ,\u009aæ?/è\u0099\nÿDB¯\u008d\u009b¾\u0007É Â:XàÁÞxÛÚ`mÔ&G\u0084ü«\u000e\u0086ÛTUÖ\u0019ó\r\u001c\nÅñB\u009cI-\u001eA\"$j!\u008aÛTï¼¸\u0095zmÊY`\u0016\u0010<\u0006\u0003\u0006\u008c\u0087\u0000-\u000e¹\u008f\u0098\u00ad.\u0082HRgU\u0094<©[JgóþOÒ\u0006o\u0093h6väl\u001e\u0004cõâ>àï0Ø\u0098\u0018\u0017\u0006!>\u0011\u0092]F#5ø|\u0098¿Ìj wÄ1k«\u0080ë\u0017»r`\u0084\u0086¯\u001fØà¦¼z3\u0017#¢\u0082¢åÅë\u0081å6A\u0089\u0011ùñ\u008bÐq3P\u000fù\u009eQ¾\u0082\u008a\b*ÖÖ¦\u0019\u0087\u0092\u0018l}Q¸\u0002Nr\u0000l4¨\u000e¢26Òÿ\u0086Ðgp\t)ÿ\u0080\u0091Ö\u000eF\u0088\u008cä]\u0089\u0086Ú3ß\u008dÔ(ÞLÊ¶\u0092O\u0092k\u0012ºZuÄS\u008cÑ´U\u00adÒ¯\u0087Y-\u001dH\u000eÃ\u0085e\u0019À\u007f\u0002þÃ¤CÊ\u0089P¶ìì6¶\u0007C H¡\u0088\u0088\u0080\u009cÐ¤52õÑL]\u001e\u0012ió\u0093Þ\u0002ñ\u0090\u008f\u0082ð\u0097\u0085I\u0016üy\u009c|X£\u0083Åä\f+Ç8¼~íÿ1»yo\u0095ÝÄgi1`\bÃSø\u0005üH¨éøÞ²çq#ÅO\u000fö\u0012ä\u001duÛ[\u0017ñ\u009bÿ4Z~\u008f%\bFh$Á¦F3g\u0088n\u0088ù<\u000b9\fS?T/\u0092\bkê\u0010rR.6TNäD\u0014w\u0003Æ\u0011H¦*ë#ÓT.\u0016{\r¦oG\u0083E'PSÉÒ£3`ªQ\u0007\u009bÂo\u007f,ØP\u0091~ª\u0005®\u001c\u0006T\u000eLdÇàé1¹AuÙ\u0083\u0080¥\u0012jÒ/-\fë\rß\u008dßu\u008e\u007fÂ.ß\u001f\u0011F)\u009c\u008bøxáX\u009d¢b&\u000eðw\u008e\u0019«Éµ0°·\u0013)óÊF¯â\u0005¹@\u0081ó8\u00034\u0080>z¶nT¬gxÿÛM\u009cý7ÝT²\u008dL\u0081Ü»\u0089O1K\u0001Ä¹¡=d\nÕxÆ\"£\u009dÀT8¯\føUî_\u0015\u000e\f\u009bq7O\u001d\u001cõ\b\u0092*\tÛj¤Òw\u001d~Ä\u0007·ág/,\u000eQk±¡¸¦X°\u0003ò\u009dîËÿKM-÷PÉ5:É\u0011\u009d+TqÄ\u009d×6Î¤\u0002\u0000\u008cêî*L\u0082dºfòBÏoÁK\u001d{1Ä\u0010ÇÌñäðTÉMbÎp'\u000b5\u0086Âî¨ÿ\u0090©ÆÓ¹@\u0084ð\u0016ø¹ÙU\nì\u0004\u0096\u0088¶cóÊV0\u0018\u0019aý\u001dÛÔJ\u001a?Çµ\u001aîÑ\u0018\u0015\u00176\u001e²½x2äý\\j\t\u0092{óÓ2Ýï\u00146ï\u0095j\u001d\\\u0001q\u0019ý&>\u008f\u0085çºÄ£j\u0018\u0010Bâ=½\u0083\u0018c»V?_Á\u001cE\t\u0016`\u008c0Ø'3;\n\bÇ©ê»fäñ\u008cjoæÀwÝFÝÛßÒû\ro«\u0090¶Ìêý;\u0012Ok\u0086°\u008bí2Åº \u0094·l-e/'¹^C\u001cT\u0016¹Nû\t\u0091Øý\u001e)\u008c*ôKÜÒsYhÄP8Ëf|4\u000bñájÔÊwÄÅ\u001fZ\u0085\u009d\u0016÷ykçsXíé\u008cu\u0084\u008bB¯\u0086\u001a!\u001c\u0005å\u009b!]²3î\u00133\u000fàé\u0016#?\\\u0010-¡Î\u001b¬UcÑù%éû}í¾Ä&ã¤x\u00157ùÑÝ¸2¼ñbBk\u0018\u009cº9ú8¼î2\u0012ÀF5obÐkz+£ÃL¤5;½/\u0095i9:I\rû~Kê<^Z@tàJ²ï\u0007\u0083¥B\u009e»²C\u0002äcj(\u0006\u0090ÿÚ¿ÿ=°ÚH\u008a\u001bO àÛçÚ¤©\u0004\u0012Ó¬Àó\u000fI:.#ÝwSú\u000b3\r(({]\u0091\u0001ûlóÎ\u000bIñû?\føÃñM\u001eQ<¡\u0012\u0006\u0010~§Ë\u00151àæ¥Ù\u0016\u0012\u00142ÍiU\u0096)±6ç\u0007\u0016½÷)þm\u0090åVt;½Æ?\u008e\u0081\u001c'|êë\u008fy\u0081ÕÚÚF\u008e_¹z~o\u0083¯Õ«Æ\u0087ßïÂ\u0000(Q¤+\u0015úÿ»WØÞ|ù\u000f±k[1`&PÄ\u0082\u0019\u0019\u009f\u0093þZÀö¬\u0088\u0003h\u0015B&4í\f|\u009bÃÜ*{ÄÉ&H\u0010ó²qw\u000ew\u0015\u009f\u008a\u0099\u0006?\u0099é\u0015\u001axk¥#3cÂùr \u0018ªÇváo7ò>â?\u0017\\g\u0082\u001eU\"8Ú#\u0005Ì\u00858¹ÝZ!I\u0082\u008aÝ/Ü`U¤Ü\u007f\u001bRNuÖ\"@ÅLÂ`Âdÿ/\u009eè\u0090\u0010\u00ad\bRL\u000b§\u0004kÂ\u0096Üõ nÎU\u0081¦~,ã3\rvîî±ç@I\u0088²\t\u001a¬8r9SSì:@dÛOÙô\u0000ô(Ê%Ö³\u0091yX\u008d\u0018\u0088#OÀb\u0086\u0090Ud¦1\u0005Ü0Â\u009eA0h\u0080Û\u009b=\u0087Q\u009b\u008a\u00911@¬õv%Ys\u0019âN5à\u0080-\rõ\u001eÇëì5Öb\u009e:÷ç]ÆÕj\u0000yH5\u0096ÅÚ\u008dÄJ5\u0096\u0094âÂ\u008ce\u0093ÎGéM3Çá{ È·Ô\u009by\u0085;\u001b\u007f|\u0096\u0092\u0087\u0004\u001e\u001b\u0007»|¬*\u0000û¾(Þ©\u0018\u0015¢×k'BÂ#I¥w¸\u0088¡!\u0010n*\u000e7ñ)\u0088üøºV\u0085\u0097ÏaÛÉyË9ey¨nrK\u0084uÁÏ¥Ã\u0014ý\u009b±\u00adÓ?ô:ãÖ\u0013\u0096ãícöömt\u0016 ÞúãÅ\u008d\u0082,\u0081£~Á\u0083Sp]:\u00ad¯\u0003ú{\u0081\u0093\u008dÖm#\u0081©>¾\u0019\u0089a\u0099®>\u001f\u001e7\u008bóh\u001fÝ1\u0001\u0093k\u0082´ÚYõ¡-¡aU\u001bCG\u0016û»\u0004ÏÅÁN\u0085ßÄÅ¿\u0081&ÆÕ³\u0096BÚûg\u0016,¾5®¼ºM\u0002è\u008afÖ\u000fh\u0011 v\u009c}y^Ì\u008ef²r¾Ê¼è\u0090\u009fçå\u0019B\u009cÀ\u000b[\u001e|\u0085¢ZÎ$Ã ñ9¨\u009cFÚ\u0098º\u0016c6mÙ\u008f\u009b\u00962¨óò\"\u0003þ¢d\u0014NÄ B\u001f+Ì\u0095âz_\u008a§\u0006\u001cÚ\u0012ÅVï¾iu9Å]£\u0082@*E\u008d5Ê\t\u0016çÉ$ì¹'6Þ'\u009f \u007f^p¢\u008e7^,¨'V \r\u0006z®\u0005Û'Ç`ÿÅz\u000b1\u0098ßÚLa\u009cZ]D\b,+#ø\"^Ã½³-°h\u0011ý )ì;ä\u000eÉê\u0090¾9\u0015%(P\u009c3\bË9\u0094Ï#Ë\u000b\u0018¬K¤T\u0013åI\u0012\tÆQ\u0003\r{(|\u001c0\\ýJc\u0096Ôë¨5¬Á\u0013ÁÞ0\u0016\u0016D´\u0095ñÑÔÚíD\u0087\u009590£ 7\u0097@C@L\u0087@®®ôvøæ¿\f \u001c[\u000f\u009bËOítKÓJt\u000e\u0090¥©\u008dÝ\b+?©Ex\u0010FÆ\u0017O¾\u001f\f\u001ewe\u007fâiøoù\u0001¨òmûðK Ö@\u0093\u0099\u009bn\u0002õÌ<ýì#¥H\u0095ýÈH\u009c°$PI\t%3ÛnðPBÆ0\u008aö\u0003ðù\u0006ß°>/·Â\n¹)\u001ap\u008d³Ü3n\u009f¬Æ~¤ìÓ\u0007Õyï\u00ad\u008f£\u0000¯È \"ømºåÃ\u0091JâBÕ\u0083k\u0080Ègd\u0082\u0084Ç\u0006\u0014r4³¸!n\u0011X\u0082>ÊF·,Ò\t-\u0092ä·]\u001a\u0018áÕ|Q*;[V\u008eü\u00ad¯àÇ=íð¹\u007f?+)4\u0002ca¯cÍ\u0013ûà¼ÁÊ4«\u008fû_TÎ¼wx=\u0004Z?4®]÷ª.|\u0088p#}\u009b#-P\u001cAXù'Xº&3åwÑ\u0005\u0083Ë\u0096uÙ\u001c?¨¹®\u008f+\u0003%|Á\u009e\u009b\u0007©\u0097Ë\u0013T¿³è¶B_fT}\u0007êzÿ\u0087¥ã1\u0084\f_[\u009b\u0094N\u0083ÆÎ\u0003`ÆoF\u008cëqá ¹3Nô\u009a40¦Ù\u0018ñ\u009bÚ\u008c\u009eÈ\u001eç /óÎ\u0007\u009b£I\"lè\u009dqVÍjeª\u0085QC¤|Íûm;d\u009ak4\u008cÂ\u0007[\u008eE\u000bØ%=þ&\u0015~¤\u001bq ´æ/\u008eà\u0095\u008c\u0017ýÜ\u00805@Ô=d¯V²\u0085,|\u008fÒ\u0080\u0090\u0001\u0003JÓ°\u0012\u008bãìÆ\u0094\u000e\u008cØAc°bÝ\fæÒtÅ\u0096(àD\u0083_\u0001\u009a\u0014\n\u000b\u009b?Øt8°p^\u0084¢ê&T0¤õ\u000e\tÙ\u009f\u0000òÛõHQ\u0087'ÉGºÊTæÖ¯èPÓèbðB\u009aKiówRÉ\u008a.¨>\u009em§\\¢\u000e\u0011âF\u0098ÝçJG\u001b\u008fÒI\u0019Ê(\u0000ÇF\u0087\\x^å\u008d\u0084\u0016[\u0092\u0014ÃOÆØj\u0011\u0080\u00112ª\u0086í£èªIÆqe[\u0099\u001c@0Î\u0089ð\njgÒ¹úã2\r`vAt\u0094\u008a4ZXÆ\u009c×\u000fá\u0099¾ß\u009ch\u0095¬\\è\u0090¤\u00018ì\u0013|ÃeG®?\u0087^#éNB\u00adä\u0005\u000eÍ<ÛUV\u009ewªLfÖi.n¶9â*ÔR½\u0093\u008fstèM\n\u0097î\u0015\u008aé\u0095R\u0016Ò»ã\u008c©\u007fÖ9\u009cæ§\u000brï¨ñPxB3Õa\u0095÷i%Üé 1q\u0081\u009b[7¥Ä*Ê÷@\b*ºß¤`ÔÆ\u0005Á»;\u008e\rOBüêµ \u000f×\u0082\u009d:\u0002¼\u009b(\u0000j\u008f<É5yQ^\u0082ö\u0002\u0005Lûv\u009f\u001a\u0095¥ê\u0083\u009b\u008d§m\u009b>ÞÏÆ¿¸Õ\u0089\u0017\u0086\u007fÿ0|S\u0093ï¤\u008c;ÝÂ\fÞ,\u008f\u009dÆd\u001e\u0094`\u0082\u008fo¬t\u0097\u008bîÖ\"5f\rªlli®2YrQ¢Æÿ\u009a(_ñ,\u0018Ì\u000b$\u0006µ+j\u0000¨\u009c\u008cü\u0081%Y[\u0017\u009acç\u0088\u001bO_ÜêÞ\u0004^\u0005\u00ad@\u0000]Ü\u009cB\u009dÙ_\u0099\u0006\u0000VÊ\u0082\u0080\u00ad§z\u0013\u0019uGH6YãÅkÜ(\u0006<¾\u0010\u0089ú^£së58×§×G7æ\u009bà[\u0082\u001e-¥_7cVÁjæ\u0091\u008d\u0099\u001es\\Bª?9¸Ñ@Yl2>òàV.ö%^\u0083Ä\u0088¿r_Ù\u009b~X»!\u0080®\u0093ê)\u0017¶ý#\u008d\u0097²ú\\:°ÓhP:\u0085i\u000eýU:\u0007@\t\u0099ÕV:P®^\u0005\u009ar¯É!y£\u0084[i±Çé@\\\u0006¿M\u0018_\u0083Q[\u001fX%éiò×TLÖ\u0007f\u0081\u008b\u00069¶\u0098\u0091º¼Ü$\u00920y\u000f´\u0098\"\r\u0017ûèEÝ\u0000>³\b\u0080\u008fÅ% °ÚÃ¥ÞÝ-j\u009cE\u0098\u009b\u0004Pü·¬?qÈ&\u0082£\\Óç\u008eFã4\u000fªMÉ«<\u0018G\u0000Å\u0016\u0005S\u0095Çð\u008f)ËØÂ%Ü\u001c»I÷\u00841\\\u0001\u0012îeØÕ~\tQ\u0007ûO\u0088ãªÉÒ\u0087\u0094\u0084õ\u008b#ONHÄ65"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      aaaba = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         aaaba[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[a(-2056749883, var39 ^ 1961742900)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b(1270891583, (byte)30, 101, '龜', (short)-3368)).length();
      int var17 = a(-2056749884, var39 ^ -417859256);
      int var43 = -1;

      label128:
      while (true) {
         String var10000 = var18.substring(++var43, var43 + var17);
         int var48 = -1;

         while (true) {
            char[] var65;
            label123: {
               char[] var50 = var10000.toCharArray();
               int var10003 = var50.length;
               int var22 = 0;
               var65 = var50;
               var48 = var10003;
               char[] var77;
               int var10004;
               if (var10003 <= 1) {
                  var77 = var50;
                  var10004 = var22;
               } else {
                  var65 = var50;
                  var48 = var10003;
                  if (var10003 <= var22) {
                     break label123;
                  }

                  var77 = var50;
                  var10004 = var22;
               }

               while (true) {
                  var77[var10004] = (char)(var77[var10004] ^ switch (var22 % a(-2056749863, var39 ^ -1439070803)) {
                     case 0 -> a(-2056749864, var39 ^ 1015463682);
                     case 1 -> a(-2056749857, var39 ^ -1559776567);
                     case 2 -> a(-2056749858, var39 ^ -134864691);
                     case 3 -> a(-2056749859, var39 ^ 1964593370);
                     case 4 -> a(-2056749860, var39 ^ 725688992);
                     case 5 -> a(-2056749869, var39 ^ 1770071240);
                     default -> a(-2056749870, var39 ^ -1306853791);
                  });
                  var22++;
                  if (var48 == 0) {
                     var10004 = var48;
                     var77 = var65;
                  } else {
                     if (var48 <= var22) {
                        break;
                     }

                     var77 = var65;
                     var10004 = var22;
                  }
               }
            }

            String var84 = new String(var65).intern();
            switch (var48) {
               case 0:
                  var21[var19++] = var84;
                  if ((var43 += var17) >= var20) {
                     aabb = var21;
                     aab = new String[a(-2056749862, var39 ^ -2088734001)];
                     long var8 = 4864182826097222077L;
                     long[] var14 = new long[a(-2056749871, var39 ^ -509706982)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = b(1270891581, (byte)14, (byte)35, 'ོ', (short)-19868)).length();
                     byte var10 = 0;

                     label102:
                     while (true) {
                        int var57 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var57, var10).getBytes(b(1270891580, (byte)-16, (byte)-74, '暓', (short)4115));
                        long[] var46 = var14;
                        var57 = var11++;
                        long var71 = (var15[0] & 255L) << a(-2056749872, var39 ^ -1939411497)
                           | (var15[1] & 255L) << a(-2056749865, var39 ^ 1583060327)
                           | (var15[2] & 255L) << a(-2056749866, var39 ^ 1929320499)
                           | (var15[3] & 255L) << a(-2056749867, var39 ^ -147531041)
                           | (var15[4] & 255L) << a(-2056749868, var39 ^ -1794353904)
                           | (var15[5] & 255L) << a(-2056749909, var39 ^ 1975496550)
                           | (var15[a(-2056749910, var39 ^ 505678653)] & 255L) << a(-2056749911, var39 ^ -61084831)
                           | var15[a(-2056749912, var39 ^ -1325627643)] & 255L;
                        byte var85 = -1;

                        while (true) {
                           long var90 = var71 ^ var8;
                           switch (var85) {
                              case 0:
                                 var46[var57] = var90;
                                 if (var10 >= var13) {
                                    bbaa = var14;
                                    abab = new Integer[a(-2056749914, var39 ^ -1549561953)];
                                    aaab = baaa(a(-2056749915, var39 ^ -226019127), 5900621637994445140L);
                                    bb = baaa(a(-2056749916, var39 ^ -1875035687), 1275842195222352264L);
                                    aa = baaa(a(-2056749893, var39 ^ -1191819987), 5225567414810559731L);
                                    long var0 = 386794861482047090L;
                                    long[] var6 = new long[a(-2056749894, var39 ^ -1646141991)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = b(1270891577, 59, (byte)121, '솾', 31243)).length();
                                    byte var2 = 0;

                                    label92:
                                    while (true) {
                                       int var60 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var60, var2).getBytes(b(1270891576, 54, 2, '爩', (short)6563));
                                       long[] var47 = var6;
                                       var60 = var3++;
                                       long var73 = (var7[0] & 255L) << a(-2056749895, var39 ^ -1129446149)
                                          | (var7[1] & 255L) << a(-2056749896, var39 ^ 296488534)
                                          | (var7[2] & 255L) << a(-2056749889, var39 ^ 2066110552)
                                          | (var7[3] & 255L) << a(-2056749890, var39 ^ 635537842)
                                          | (var7[4] & 255L) << a(-2056749891, var39 ^ 744281370)
                                          | (var7[5] & 255L) << a(-2056749892, var39 ^ -28645686)
                                          | (var7[a(-2056749901, var39 ^ -2059216615)] & 255L) << a(-2056749902, var39 ^ 1504908733)
                                          | var7[a(-2056749903, var39 ^ 1388271813)] & 255L;
                                       byte var87 = -1;

                                       while (true) {
                                          var90 = var73 ^ var0;
                                          switch (var87) {
                                             case 0:
                                                var47[var60] = var90;
                                                if (var2 >= var5) {
                                                   aaba = var6;
                                                   babb = new Long[a(-2056749937, var39 ^ 261017112)];
                                                   ab = aaaaab(a(-2056749938, var39 ^ 615030738), 8471301559724267843L);
                                                   baaa = new String[baaa(a(-2056749939, var39 ^ 638299407), 4727324321763437149L)];
                                                   babb();
                                                   baab = aabbaaaba.abba(
                                                      baaa[baaa(a(-2056749940, var39 ^ 1858162666), 400157608671756762L)]
                                                   );
                                                   abb = new GsonBuilder().setPrettyPrinting().create();
                                                   abaa = aabbaaaba.abba(
                                                      baaa[baaa(a(-2056749949, var39 ^ -1743408227), 4048752012138612410L)]
                                                   );
                                                   bbbb = babaa();
                                                   return;
                                                }
                                                break;
                                             default:
                                                var47[var60] = var90;
                                                if (var2 < var5) {
                                                   continue label92;
                                                }

                                                var5 = (var4 = b(1270891575, 74, (byte)-105, 6044, (short)-6690)).length();
                                                var2 = 0;
                                          }

                                          byte var62 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var62, var2).getBytes(b(1270891574, 17, (byte)-17, '悠', (short)21654));
                                          var47 = var6;
                                          var60 = var3++;
                                          var73 = (var7[0] & 255L) << a(-2056749904, var39 ^ 1118648647)
                                             | (var7[1] & 255L) << a(-2056749897, var39 ^ 1799412622)
                                             | (var7[2] & 255L) << a(-2056749898, var39 ^ 1711571643)
                                             | (var7[3] & 255L) << a(-2056749899, var39 ^ 2051523547)
                                             | (var7[4] & 255L) << a(-2056749900, var39 ^ 250983800)
                                             | (var7[5] & 255L) << a(-2056749941, var39 ^ -62353285)
                                             | (var7[a(-2056749942, var39 ^ 746216753)] & 255L) << a(-2056749943, var39 ^ 757426751)
                                             | var7[a(-2056749944, var39 ^ -1163501445)] & 255L;
                                          var87 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var46[var57] = var90;
                                 if (var10 < var13) {
                                    continue label102;
                                 }

                                 var13 = (var12 = b(1270891579, (byte)47, (byte)17, 20962, 30168)).length();
                                 var10 = 0;
                           }

                           byte var59 = var10;
                           var10 += 8;
                           var15 = var12.substring(var59, var10).getBytes(b(1270891578, (byte)-23, (byte)-55, '珶', (short)-25535));
                           var46 = var14;
                           var57 = var11++;
                           var71 = (var15[0] & 255L) << a(-2056749905, var39 ^ 892427246)
                              | (var15[1] & 255L) << a(-2056749906, var39 ^ 478120937)
                              | (var15[2] & 255L) << a(-2056749907, var39 ^ 1106922670)
                              | (var15[3] & 255L) << a(-2056749908, var39 ^ -1308446778)
                              | (var15[4] & 255L) << a(-2056749917, var39 ^ 1773593508)
                              | (var15[5] & 255L) << a(-2056749918, var39 ^ -1815241507)
                              | (var15[a(-2056749919, var39 ^ 1194254947)] & 255L) << a(-2056749920, var39 ^ -884280712)
                              | var15[a(-2056749913, var39 ^ 239230796)] & 255L;
                           var85 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var84;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label128;
                  }

                  var20 = (var18 = b(1270891582, 81, (byte)-94, '\ue47d', 28806)).length();
                  var17 = a(-2056749861, var39 ^ -1640515867);
                  var43 = -1;
            }

            var10000 = var18.substring(++var43, var43 + var17);
            var48 = 0;
         }
      }
   }

   public Map bab(String param1) {
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
      // 005: aload 1
      // 006: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba (Ljava/lang/String;)Ljava/lang/String;
      // 009: astore 3
      // 00a: aload 3
      // 00b: invokevirtual java/lang/String.isBlank ()Z
      // 00e: ifeq 034
      // 011: new java/lang/IllegalArgumentException
      // 014: dup
      // 015: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 018: ldc_w -2056749446
      // 01b: ldc_w 2084306221
      // 01e: ldc_w -1616608495
      // 021: ixor
      // 022: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 025: ldc2_w 5295245431196199746
      // 028: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 02b: aaload
      // 02c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 02f: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 032: athrow
      // 033: athrow
      // 034: aload 0
      // 035: aload 3
      // 036: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.babba (Ljava/lang/String;)Ljava/nio/file/Path;
      // 039: astore 4
      // 03b: aload 4
      // 03d: iload 2
      // 03e: ifne 04a
      // 041: ifnull 05c
      // 044: goto 048
      // 047: athrow
      // 048: aload 4
      // 04a: iload 2
      // 04b: ifne 081
      // 04e: bipush 0
      // 04f: anewarray 230
      // 052: invokestatic java/nio/file/Files.exists (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
      // 055: ifne 07f
      // 058: goto 05c
      // 05b: athrow
      // 05c: new java/lang/IllegalArgumentException
      // 05f: dup
      // 060: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 063: ldc_w -2056749447
      // 066: ldc_w 2084306221
      // 069: ldc_w -295424293
      // 06c: ixor
      // 06d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 070: ldc2_w 1095684364347392217
      // 073: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 076: aaload
      // 077: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 07a: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 07d: athrow
      // 07e: athrow
      // 07f: aload 4
      // 081: invokestatic java/nio/file/Files.deleteIfExists (Ljava/nio/file/Path;)Z
      // 084: pop
      // 085: goto 0cb
      // 088: astore 5
      // 08a: new java/lang/IllegalStateException
      // 08d: dup
      // 08e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 091: ldc_w -2056749448
      // 094: ldc_w 2084306221
      // 097: ldc_w 2140413845
      // 09a: ixor
      // 09b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 09e: ldc2_w 7808326772986860680
      // 0a1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 0a4: aaload
      // 0a5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0a8: aload 5
      // 0aa: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 0ad: astore 7
      // 0af: astore 6
      // 0b1: new java/lang/StringBuilder
      // 0b4: dup
      // 0b5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0b8: aload 6
      // 0ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0bd: aload 7
      // 0bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0c2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0c5: aload 5
      // 0c7: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 0ca: athrow
      // 0cb: aload 3
      // 0cc: iload 2
      // 0cd: ifne 10d
      // 0d0: aload 0
      // 0d1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bba Ljava/lang/String;
      // 0d4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d7: ifeq 103
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: aload 0
      // 0df: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0e2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 0e5: ldc_w -2056749441
      // 0e8: ldc_w 2084306221
      // 0eb: ldc_w 233554296
      // 0ee: ixor
      // 0ef: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 0f2: ldc2_w 5674900775615121943
      // 0f5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 0f8: aaload
      // 0f9: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0fc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbba (Lnet/minecraft/class_310;Ljava/lang/String;)V
      // 0ff: goto 103
      // 102: athrow
      // 103: aload 0
      // 104: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aba Ljava/util/Map;
      // 107: aload 3
      // 108: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 10d: pop
      // 10e: aload 0
      // 10f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aabab ()V
      // 112: aload 0
      // 113: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbabb ()Ljava/util/Map;
      // 116: areturn
   }

   private static String bba(int var0, int var1) {
      int var9 = -1348852154;
      int var2 = (var0 ^ a(-2056749442, var9 ^ 1922135332)) & a(-2056749443, var9 ^ -1385251623);
      if (aab[var2] == null) {
         char[] var3 = aabb[var2].toCharArray();

         int var4 = switch (var3[0] & a(-2056749444, var9 ^ -1777229751)) {
            case 0 -> a(-2056749453, var9 ^ -703437454);
            case 1 -> a(-2056749454, var9 ^ -318121308);
            case 2 -> a(-2056749455, var9 ^ -487203424);
            case 3 -> a(-2056749456, var9 ^ -898066469);
            case 4 -> a(-2056749449, var9 ^ -309866549);
            case 5 -> a(-2056749450, var9 ^ 790664306);
            case 6 -> a(-2056749451, var9 ^ 1008101532);
            case 7 -> a(-2056749452, var9 ^ -1432701131);
            case 8 -> a(-2056749493, var9 ^ 2012323616);
            case 9 -> a(-2056749494, var9 ^ 391733672);
            case 10 -> a(-2056749495, var9 ^ -647028282);
            case 11 -> a(-2056749496, var9 ^ 1287549207);
            case 12 -> a(-2056749489, var9 ^ 1455786526);
            case 13 -> a(-2056749490, var9 ^ 818986109);
            case 14 -> a(-2056749491, var9 ^ -1311533077);
            case 15 -> a(-2056749492, var9 ^ -1889795752);
            case 16 -> a(-2056749501, var9 ^ 408015313);
            case 17 -> a(-2056749502, var9 ^ 1367739907);
            case 18 -> a(-2056749503, var9 ^ -1618423701);
            case 19 -> a(-2056749504, var9 ^ -986851660);
            case 20 -> a(-2056749497, var9 ^ 817629891);
            case 21 -> a(-2056749498, var9 ^ 10845444);
            case 22 -> a(-2056749499, var9 ^ 685242935);
            case 23 -> a(-2056749500, var9 ^ -722634422);
            case 24 -> a(-2056749477, var9 ^ 101393235);
            case 25 -> a(-2056749478, var9 ^ 567654598);
            case 26 -> a(-2056749479, var9 ^ 658630155);
            case 27 -> a(-2056749480, var9 ^ 367419675);
            case 28 -> a(-2056749473, var9 ^ -1368631918);
            case 29 -> a(-2056749474, var9 ^ -1767612932);
            case 30 -> a(-2056749475, var9 ^ 1568160679);
            case 31 -> a(-2056749476, var9 ^ 560515221);
            case 32 -> a(-2056749485, var9 ^ -1303047102);
            case 33 -> a(-2056749486, var9 ^ -298639891);
            case 34 -> a(-2056749487, var9 ^ 1289785005);
            case 35 -> a(-2056749488, var9 ^ -1806615751);
            case 36 -> a(-2056749481, var9 ^ -214427324);
            case 37 -> a(-2056749482, var9 ^ 9572450);
            case 38 -> a(-2056749483, var9 ^ -819850661);
            case 39 -> a(-2056749484, var9 ^ 1205913774);
            case 40 -> a(-2056749525, var9 ^ -816986017);
            case 41 -> a(-2056749526, var9 ^ -1269198427);
            case 42 -> a(-2056749527, var9 ^ -536527784);
            case 43 -> a(-2056749528, var9 ^ -1321106894);
            case 44 -> a(-2056749521, var9 ^ 1266819683);
            case 45 -> a(-2056749522, var9 ^ 2023856529);
            case 46 -> a(-2056749523, var9 ^ 41653467);
            case 47 -> a(-2056749524, var9 ^ 82135888);
            case 48 -> a(-2056749533, var9 ^ -1341915524);
            case 49 -> a(-2056749534, var9 ^ 1073374705);
            case 50 -> a(-2056749535, var9 ^ -1492805802);
            case 51 -> a(-2056749536, var9 ^ -1101038444);
            case 52 -> a(-2056749529, var9 ^ -1084931122);
            case 53 -> a(-2056749530, var9 ^ -379695661);
            case 54 -> a(-2056749531, var9 ^ -392211701);
            case 55 -> a(-2056749532, var9 ^ -1533277224);
            case 56 -> a(-2056749509, var9 ^ 610911201);
            case 57 -> a(-2056749510, var9 ^ -226486601);
            case 58 -> a(-2056749511, var9 ^ -2105133957);
            case 59 -> a(-2056749512, var9 ^ -1722498826);
            case 60 -> a(-2056749505, var9 ^ 731624937);
            case 61 -> a(-2056749506, var9 ^ -1279876381);
            case 62 -> a(-2056749507, var9 ^ 1238451707);
            case 63 -> a(-2056749508, var9 ^ -1836035509);
            case 64 -> a(-2056749517, var9 ^ 1717917655);
            case 65 -> 3;
            case 66 -> a(-2056749518, var9 ^ 6659377);
            case 67 -> a(-2056749519, var9 ^ -1768212354);
            case 68 -> a(-2056749520, var9 ^ -1101855284);
            case 69 -> a(-2056749513, var9 ^ -1830376918);
            case 70 -> a(-2056749514, var9 ^ -408959835);
            case 71 -> a(-2056749515, var9 ^ 616196714);
            case 72 -> a(-2056749516, var9 ^ -388929393);
            case 73 -> a(-2056749557, var9 ^ -1185846558);
            case 74 -> a(-2056749558, var9 ^ -1281717089);
            case 75 -> a(-2056749559, var9 ^ 1330636136);
            case 76 -> 4;
            case 77 -> a(-2056749560, var9 ^ -1789894742);
            case 78 -> a(-2056749553, var9 ^ 989355525);
            case 79 -> a(-2056749554, var9 ^ -1968343107);
            case 80 -> a(-2056749555, var9 ^ 124314424);
            case 81 -> a(-2056749556, var9 ^ -1559339880);
            case 82 -> a(-2056749565, var9 ^ 1608702727);
            case 83 -> a(-2056749566, var9 ^ -176135949);
            case 84 -> a(-2056749567, var9 ^ -895806898);
            case 85 -> a(-2056749568, var9 ^ -837997793);
            case 86 -> a(-2056749561, var9 ^ 1206935347);
            case 87 -> a(-2056749562, var9 ^ 958761772);
            case 88 -> a(-2056749563, var9 ^ 732316296);
            case 89 -> a(-2056749564, var9 ^ 555876906);
            case 90 -> a(-2056749541, var9 ^ 42583102);
            case 91 -> a(-2056749542, var9 ^ 333184379);
            case 92 -> a(-2056749543, var9 ^ 303184924);
            case 93 -> a(-2056749544, var9 ^ 95687116);
            case 94 -> a(-2056749537, var9 ^ -1104501374);
            case 95 -> a(-2056749538, var9 ^ 266332204);
            case 96 -> a(-2056749539, var9 ^ 1660684369);
            case 97 -> a(-2056749540, var9 ^ 1564051792);
            case 98 -> a(-2056749549, var9 ^ 1694346288);
            case 99 -> a(-2056749550, var9 ^ 2016927194);
            case 100 -> a(-2056749551, var9 ^ 1104174187);
            case 101 -> a(-2056749552, var9 ^ 2121642852);
            case 102 -> a(-2056749545, var9 ^ 352374396);
            case 103 -> a(-2056749546, var9 ^ 547919847);
            case 104 -> 0;
            case 105 -> a(-2056749547, var9 ^ 1502885928);
            case 106 -> a(-2056749548, var9 ^ 293849631);
            case 107 -> a(-2056749333, var9 ^ -462386886);
            case 108 -> a(-2056749334, var9 ^ -1669161714);
            case 109 -> a(-2056749335, var9 ^ -188946856);
            case 110 -> a(-2056749336, var9 ^ -293393622);
            case 111 -> a(-2056749329, var9 ^ -1663682729);
            case 112 -> a(-2056749330, var9 ^ 814200253);
            case 113 -> a(-2056749331, var9 ^ 1377073638);
            case 114 -> a(-2056749332, var9 ^ 124451474);
            case 115 -> a(-2056749341, var9 ^ -279954622);
            case 116 -> a(-2056749342, var9 ^ 616123235);
            case 117 -> a(-2056749343, var9 ^ 467620178);
            case 118 -> a(-2056749344, var9 ^ -379697600);
            case 119 -> a(-2056749337, var9 ^ -1196663958);
            case 120 -> a(-2056749338, var9 ^ -372471768);
            case 121 -> a(-2056749339, var9 ^ 525276129);
            case 122 -> a(-2056749340, var9 ^ 1311949293);
            case 123 -> a(-2056749317, var9 ^ -1800299448);
            case 124 -> a(-2056749318, var9 ^ -962324964);
            case 125 -> a(-2056749319, var9 ^ -1659228264);
            case 126 -> a(-2056749320, var9 ^ -2040231530);
            case 127 -> a(-2056749313, var9 ^ -988161022);
            case 128 -> a(-2056749314, var9 ^ -724164460);
            case 129 -> a(-2056749315, var9 ^ -1222606260);
            case 130 -> a(-2056749316, var9 ^ 39036136);
            case 131 -> a(-2056749325, var9 ^ -2135044562);
            case 132 -> a(-2056749326, var9 ^ 1370187440);
            case 133 -> a(-2056749327, var9 ^ 2068800800);
            case 134 -> a(-2056749328, var9 ^ -343463022);
            case 135 -> a(-2056749321, var9 ^ 2052212092);
            case 136 -> a(-2056749322, var9 ^ -1080252327);
            case 137 -> a(-2056749323, var9 ^ 924262597);
            case 138 -> a(-2056749324, var9 ^ 196579455);
            case 139 -> a(-2056749365, var9 ^ 1310046264);
            case 140 -> a(-2056749366, var9 ^ -1424765673);
            case 141 -> a(-2056749367, var9 ^ -1713413817);
            case 142 -> a(-2056749368, var9 ^ -661876851);
            case 143 -> a(-2056749361, var9 ^ 977857466);
            case 144 -> a(-2056749362, var9 ^ 2043577808);
            case 145 -> a(-2056749363, var9 ^ 1044484547);
            case 146 -> a(-2056749364, var9 ^ -306626974);
            case 147 -> a(-2056749373, var9 ^ 1104077901);
            case 148 -> a(-2056749374, var9 ^ 828668062);
            case 149 -> a(-2056749375, var9 ^ 436180861);
            case 150 -> a(-2056749376, var9 ^ 1566718199);
            case 151 -> a(-2056749369, var9 ^ -1869927950);
            case 152 -> a(-2056749370, var9 ^ -1001490630);
            case 153 -> a(-2056749371, var9 ^ -912730227);
            case 154 -> a(-2056749372, var9 ^ -1048358856);
            case 155 -> a(-2056749349, var9 ^ 203065474);
            case 156 -> a(-2056749350, var9 ^ 495446051);
            case 157 -> a(-2056749351, var9 ^ -1425756441);
            case 158 -> a(-2056749352, var9 ^ -1831757274);
            case 159 -> a(-2056749345, var9 ^ -599944824);
            case 160 -> a(-2056749346, var9 ^ -1263066330);
            case 161 -> a(-2056749347, var9 ^ -997108105);
            case 162 -> a(-2056749348, var9 ^ -140999334);
            case 163 -> a(-2056749357, var9 ^ 118991626);
            case 164 -> a(-2056749358, var9 ^ -98403067);
            case 165 -> a(-2056749359, var9 ^ 1645925513);
            case 166 -> a(-2056749360, var9 ^ -123486718);
            case 167 -> a(-2056749353, var9 ^ 55925529);
            case 168 -> a(-2056749354, var9 ^ -1641280962);
            case 169 -> a(-2056749355, var9 ^ -268427150);
            case 170 -> a(-2056749356, var9 ^ -1306292266);
            case 171 -> a(-2056749397, var9 ^ -1895116859);
            case 172 -> a(-2056749398, var9 ^ -623432555);
            case 173 -> a(-2056749399, var9 ^ -2135921969);
            case 174 -> a(-2056749400, var9 ^ 1625522544);
            case 175 -> a(-2056749393, var9 ^ 1462667030);
            case 176 -> a(-2056749394, var9 ^ -493255763);
            case 177 -> a(-2056749395, var9 ^ -244932287);
            case 178 -> a(-2056749396, var9 ^ -406081868);
            case 179 -> a(-2056749405, var9 ^ 13445226);
            case 180 -> a(-2056749406, var9 ^ 1323400710);
            case 181 -> a(-2056749407, var9 ^ 1790546792);
            case 182 -> a(-2056749408, var9 ^ 1293961812);
            case 183 -> 5;
            case 184 -> a(-2056749401, var9 ^ -348344435);
            case 185 -> a(-2056749402, var9 ^ -649661664);
            case 186 -> a(-2056749403, var9 ^ 1792206967);
            case 187 -> a(-2056749404, var9 ^ -873094050);
            case 188 -> a(-2056749381, var9 ^ -1288437400);
            case 189 -> a(-2056749382, var9 ^ -1782996455);
            case 190 -> a(-2056749383, var9 ^ 1949411175);
            case 191 -> a(-2056749384, var9 ^ -1244923349);
            case 192 -> a(-2056749377, var9 ^ 1626137708);
            case 193 -> a(-2056749378, var9 ^ 714511311);
            case 194 -> a(-2056749379, var9 ^ 1449109916);
            case 195 -> a(-2056749380, var9 ^ 299925762);
            case 196 -> a(-2056749389, var9 ^ 1041510541);
            case 197 -> a(-2056749390, var9 ^ -1917485685);
            case 198 -> a(-2056749391, var9 ^ -1162226643);
            case 199 -> 2;
            case 200 -> a(-2056749392, var9 ^ -157005889);
            case 201 -> a(-2056749385, var9 ^ -351779150);
            case 202 -> a(-2056749386, var9 ^ -841026235);
            case 203 -> a(-2056749387, var9 ^ -1503308331);
            case 204 -> a(-2056749388, var9 ^ -873952469);
            case 205 -> a(-2056749429, var9 ^ 1565862185);
            case 206 -> a(-2056749430, var9 ^ -605987632);
            case 207 -> a(-2056749431, var9 ^ -1773720009);
            case 208 -> a(-2056749432, var9 ^ 464959158);
            case 209 -> a(-2056749425, var9 ^ -1886521053);
            case 210 -> a(-2056749426, var9 ^ 1657086856);
            case 211 -> a(-2056749427, var9 ^ -841348872);
            case 212 -> a(-2056749428, var9 ^ -875712296);
            case 213 -> a(-2056749437, var9 ^ 472371513);
            case 214 -> a(-2056749438, var9 ^ -459227032);
            case 215 -> a(-2056749439, var9 ^ -226254457);
            case 216 -> a(-2056749440, var9 ^ 1353690370);
            case 217 -> a(-2056749433, var9 ^ -952963058);
            case 218 -> a(-2056749434, var9 ^ -56337033);
            case 219 -> a(-2056749435, var9 ^ 696851603);
            case 220 -> a(-2056749436, var9 ^ 539287674);
            case 221 -> a(-2056749413, var9 ^ -777993742);
            case 222 -> a(-2056749414, var9 ^ -547361602);
            case 223 -> a(-2056749415, var9 ^ -1114556738);
            case 224 -> a(-2056749416, var9 ^ 754091757);
            case 225 -> a(-2056749409, var9 ^ -750208958);
            case 226 -> a(-2056749410, var9 ^ -2065664805);
            case 227 -> a(-2056749411, var9 ^ 98327422);
            case 228 -> a(-2056749412, var9 ^ 552641971);
            case 229 -> a(-2056749421, var9 ^ 654194834);
            case 230 -> 1;
            case 231 -> a(-2056749422, var9 ^ 763350974);
            case 232 -> a(-2056749423, var9 ^ -416629573);
            case 233 -> a(-2056749424, var9 ^ -844205043);
            case 234 -> a(-2056749417, var9 ^ -218793283);
            case 235 -> a(-2056749418, var9 ^ 1321643773);
            case 236 -> a(-2056749419, var9 ^ -418504414);
            case 237 -> a(-2056749420, var9 ^ -1977427498);
            case 238 -> a(-2056749205, var9 ^ 1573586146);
            case 239 -> a(-2056749206, var9 ^ 254386232);
            case 240 -> a(-2056749207, var9 ^ -656307567);
            case 241 -> a(-2056749208, var9 ^ 1894184750);
            case 242 -> a(-2056749201, var9 ^ -424090914);
            case 243 -> a(-2056749202, var9 ^ -1794058976);
            case 244 -> a(-2056749203, var9 ^ 65545568);
            case 245 -> a(-2056749204, var9 ^ -1548050265);
            case 246 -> a(-2056749213, var9 ^ 2145271976);
            case 247 -> a(-2056749214, var9 ^ 2100929696);
            case 248 -> a(-2056749215, var9 ^ 1821633593);
            case 249 -> a(-2056749216, var9 ^ 2086762128);
            case 250 -> a(-2056749209, var9 ^ -1250501940);
            case 251 -> a(-2056749210, var9 ^ -1922966558);
            case 252 -> a(-2056749211, var9 ^ -760155444);
            case 253 -> a(-2056749212, var9 ^ 809723807);
            case 254 -> a(-2056749189, var9 ^ -1993563088);
            default -> a(-2056749190, var9 ^ -325381229);
         };
         int var5 = (var1 & a(-2056749191, var9 ^ 2037611471)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-2056749192, var9 ^ -787865924)) >>> a(-2056749185, var9 ^ 851536327)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-2056749186, var9 ^ -165637030);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-2056749187, var9 ^ 217954509);
            }
         }

         aab[var2] = new String(var3).intern();
      }

      return aab[var2];
   }

   private String bbb(String var1) {
      int var11 = 1194974072;
      int var2 = baaabbaa.bba;
      String var3 = this.aaba(var1)
         .toLowerCase(Locale.ROOT)
         .replaceAll(
            aabbaaaba.abba(baaa[baaa(a(-2056749188, var11 ^ -1457272819), 509865818432625513L)]),
            aabbaaaba.abba(baaa[baaa(a(-2056749197, var11 ^ -310568921), 5870252835469745603L)])
         )
         .replaceAll(aabbaaaba.abba(baaa[baaa(a(-2056749198, var11 ^ -1523749519), 495789266417949234L)]), baaa[1]);

      String var10000;
      label34: {
         label33: {
            try {
               var10000 = var3;
               if (var2 != 0) {
                  break label34;
               }

               if (!var3.isBlank()) {
                  break label33;
               }
            } catch (IllegalStateException var12) {
               throw var12;
            }

            var3 = aabbaaaba.abba(baaa[baaa(a(-2056749199, var11 ^ 622606413), 4919260127716125153L)]);
         }

         String var10001 = aabbaaaba.abba(baaa[baaa(a(-2056749200, var11 ^ -717635081), 5870252835469745603L)]);
         String var9 = Long.toString(System.currentTimeMillis(), baaa(a(-2056749193, var11 ^ -511915832), 5870252835469745603L));
         String var8 = var10001;
         var10000 = var3 + var8 + var9;
      }

      String var4 = var10000;
      String var5 = var4;
      int var6 = 2;

      while (this.babba(var5) != null && Files.exists(this.babba(var5))) {
         String var14 = aabbaaaba.abba(baaa[baaa(a(-2056749194, var11 ^ 792538715), 5870252835469745603L)]);
         int var10 = var6++;
         String var13 = var14;
         var5 = var4 + var13 + var10;
         if (var2 != 0) {
            break;
         }
      }

      return var5;
   }

   public Map aaaa() {
      return this.bbabb();
   }

   private baababab aaab(Path param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abb Lcom/google/gson/Gson;
      // 07: aload 1
      // 08: invokestatic java/nio/file/Files.readString (Ljava/nio/file/Path;)Ljava/lang/String;
      // 0b: ldc qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab
      // 0d: invokevirtual com/google/gson/Gson.fromJson (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
      // 10: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab
      // 13: astore 3
      // 14: aload 3
      // 15: iload 2
      // 16: ifne 21
      // 19: ifnull 2f
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 3
      // 21: iload 2
      // 22: ifne 32
      // 25: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 28: ifnonnull 31
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aconst_null
      // 30: areturn
      // 31: aload 3
      // 32: iload 2
      // 33: ifne 50
      // 36: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 39: ifnonnull 4f
      // 3c: goto 40
      // 3f: athrow
      // 40: aload 3
      // 41: new java/util/ArrayList
      // 44: dup
      // 45: invokespecial java/util/ArrayList.<init> ()V
      // 48: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 4b: goto 4f
      // 4e: athrow
      // 4f: aload 3
      // 50: areturn
      // 51: astore 3
      // 52: aconst_null
      // 53: areturn
   }

   private String aaba(String param1) {
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
      // 06: ifne 3c
      // 09: ifnonnull 19
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 13: bipush 1
      // 14: aaload
      // 15: goto 3f
      // 18: athrow
      // 19: aload 1
      // 1a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 1d: ldc_w -2056749195
      // 20: ldc_w -1720322781
      // 23: ldc_w 1016976484
      // 26: ixor
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 2a: ldc2_w 8030006744696669547
      // 2d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 30: aaload
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 34: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 37: bipush 1
      // 38: aaload
      // 39: invokevirtual java/lang/String.replaceAll (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      // 3c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 3f: areturn
   }

   private void aabb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 04: ldc_w -2056749196
      // 07: ldc_w 642194650
      // 0a: ldc_w -1351567812
      // 0d: ixor
      // 0e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 11: ldc2_w 2214882237130694261
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 17: aaload
      // 18: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1b: aload 0
      // 1c: aload 0
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)Ljava/lang/String;
      // 23: astore 4
      // 25: astore 3
      // 26: new java/lang/StringBuilder
      // 29: dup
      // 2a: invokespecial java/lang/StringBuilder.<init> ()V
      // 2d: aload 3
      // 2e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 31: aload 4
      // 33: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 36: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 39: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baba Ljava/lang/String;
      // 3c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 3f: aload 0
      // 40: bipush 0
      // 41: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba Z
      // 44: istore 2
      // 45: aload 0
      // 46: iload 2
      // 47: ifne 87
      // 4a: aconst_null
      // 4b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;
      // 4e: aload 0
      // 4f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 52: bipush 1
      // 53: aaload
      // 54: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bba Ljava/lang/String;
      // 57: aload 0
      // 58: bipush 0
      // 59: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbb Z
      // 5c: aload 0
      // 5d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 60: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 63: checkcast java/lang/Boolean
      // 66: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 69: ifeq 7d
      // 6c: goto 70
      // 6f: athrow
      // 70: aload 0
      // 71: aload 1
      // 72: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbbba (Lnet/minecraft/class_310;)V
      // 75: iload 2
      // 76: ifeq 8b
      // 79: goto 7d
      // 7c: athrow
      // 7d: aload 0
      // 7e: bipush 0
      // 7f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbab Z
      // 82: aload 0
      // 83: goto 87
      // 86: athrow
      // 87: bipush 0
      // 88: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baa Z
      // 8b: return
   }

   private Path abaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 07: astore 2
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 2
      // 15: iload 1
      // 16: ifne 27
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 1c: ifnonnull 26
      // 1f: goto 23
      // 22: athrow
      // 23: aconst_null
      // 24: areturn
      // 25: athrow
      // 26: aload 2
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa;
      // 2a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babaaaa.aabbaa ()Ljava/nio/file/Path;
      // 2d: areturn
   }

   private int abab(class_746 param1, baababab param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: ifnull 1f
      // 08: aload 2
      // 09: iload 3
      // 0a: ifne 19
      // 0d: goto 11
      // 10: athrow
      // 11: ifnull 1f
      // 14: goto 18
      // 17: athrow
      // 18: aload 2
      // 19: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 1c: ifnonnull 22
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: bipush 0
      // 23: istore 4
      // 25: aload 0
      // 26: aload 2
      // 27: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)Ljava/util/Map;
      // 2a: astore 5
      // 2c: aload 2
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 30: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 35: astore 6
      // 37: aload 6
      // 39: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3e: ifeq a8
      // 41: aload 6
      // 43: iload 3
      // 44: ifne 39
      // 47: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4c: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa
      // 4f: astore 7
      // 51: aload 7
      // 53: ifnull 37
      // 56: aload 0
      // 57: aload 7
      // 59: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // 5c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaabba (I)Z
      // 5f: iload 3
      // 60: ifne 3e
      // 63: ifeq 37
      // 66: aload 7
      // 68: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.b Ljava/lang/String;
      // 6b: ifnonnull 72
      // 6e: goto 37
      // 71: athrow
      // 72: aload 0
      // 73: iload 3
      // 74: ifne 92
      // 77: aload 0
      // 78: aload 1
      // 79: aload 7
      // 7b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // 7e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaab (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 81: aload 7
      // 83: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aa (Lnet/minecraft/class_1799;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa;)Z
      // 86: ifeq 91
      // 89: goto 8d
      // 8c: athrow
      // 8d: goto 37
      // 90: athrow
      // 91: aload 0
      // 92: aload 1
      // 93: aload 5
      // 95: aload 7
      // 97: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaabb (Lnet/minecraft/class_746;Ljava/util/Map;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa;)I
      // 9a: iflt a4
      // 9d: iinc 4 1
      // a0: goto a4
      // a3: athrow
      // a4: iload 3
      // a5: ifeq 37
      // a8: iload 4
      // aa: ireturn
   }

   private String abba(class_1799 var1) {
      return class_7923.field_41178.method_10221(var1.method_7909()).toString();
   }

   private static boolean abbb(Path var0) {
      return var0.getFileName().toString().endsWith(aabbaaaba.abba(baaa[3]));
   }

   private static int baaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-2056749237, -36539750 ^ 1907023218);
      if (abab[var3] == null) {
         abab[var3] = (int)(bbaa[var3] ^ var1);
      }

      return abab[var3];
   }

   private Map baab(baababab param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 226032626
      // 003: istore 7
      // 005: new java/util/LinkedHashMap
      // 008: dup
      // 009: invokespecial java/util/LinkedHashMap.<init> ()V
      // 00c: astore 3
      // 00d: aload 3
      // 00e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 011: ldc_w -2056749238
      // 014: iload 7
      // 016: ldc_w 837305043
      // 019: ixor
      // 01a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 01d: ldc2_w 4721400821856264803
      // 020: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 023: aaload
      // 024: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 027: aload 1
      // 028: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 02b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 030: pop
      // 031: aload 3
      // 032: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 035: ldc_w -2056749239
      // 038: iload 7
      // 03a: ldc_w -2147332915
      // 03d: ixor
      // 03e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 041: ldc2_w 4118587417745722991
      // 044: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 047: aaload
      // 048: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 04b: aload 0
      // 04c: aload 1
      // 04d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)Ljava/lang/String;
      // 050: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 055: pop
      // 056: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 059: aload 3
      // 05a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 05d: ldc_w -2056749240
      // 060: iload 7
      // 062: ldc_w -1045966227
      // 065: ixor
      // 066: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 069: ldc2_w 4646803034698512751
      // 06c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 06f: aaload
      // 070: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 073: aload 1
      // 074: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.b J
      // 077: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 07a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 07f: pop
      // 080: istore 2
      // 081: aload 3
      // 082: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 085: ldc_w -2056749233
      // 088: iload 7
      // 08a: ldc_w -1562974368
      // 08d: ixor
      // 08e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 091: ldc2_w 965017689024376367
      // 094: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 097: aaload
      // 098: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 09b: aload 1
      // 09c: iload 2
      // 09d: ifne 0b0
      // 0a0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 0a3: ifnonnull 0af
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: bipush 0
      // 0ab: goto 0b8
      // 0ae: athrow
      // 0af: aload 1
      // 0b0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 0b3: invokeinterface java/util/List.size ()I 1
      // 0b8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0bb: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0c0: pop
      // 0c1: aload 3
      // 0c2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 0c5: ldc_w -2056749234
      // 0c8: iload 7
      // 0ca: ldc_w 700905084
      // 0cd: ixor
      // 0ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 0d1: ldc2_w 2988550755620919228
      // 0d4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 0d7: aaload
      // 0d8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0db: aload 1
      // 0dc: iload 2
      // 0dd: ifne 0f4
      // 0e0: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ba Ljava/lang/String;
      // 0e3: ifnonnull 0f3
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 0ed: bipush 1
      // 0ee: aaload
      // 0ef: goto 0f7
      // 0f2: athrow
      // 0f3: aload 1
      // 0f4: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ba Ljava/lang/String;
      // 0f7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0fc: pop
      // 0fd: iload 2
      // 0fe: aload 3
      // 0ff: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 102: ldc_w -2056749235
      // 105: iload 7
      // 107: ldc_w -106928709
      // 10a: ixor
      // 10b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 10e: ldc2_w 8830916006124063846
      // 111: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 114: aaload
      // 115: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 118: aload 0
      // 119: aload 1
      // 11a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbbab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)Ljava/lang/String;
      // 11d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 122: pop
      // 123: aload 3
      // 124: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 127: ldc_w -2056749236
      // 12a: iload 7
      // 12c: ldc_w -536137465
      // 12f: ixor
      // 130: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 133: ldc2_w 7098780564945078813
      // 136: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 139: aaload
      // 13a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 13d: aload 0
      // 13e: aload 1
      // 13f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baba (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)Ljava/util/Map;
      // 142: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 147: pop
      // 148: new java/util/ArrayList
      // 14b: dup
      // 14c: invokespecial java/util/ArrayList.<init> ()V
      // 14f: astore 4
      // 151: ifne 1d9
      // 154: aload 1
      // 155: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 158: ifnull 1b7
      // 15b: goto 15f
      // 15e: athrow
      // 15f: aload 1
      // 160: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 163: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 168: astore 5
      // 16a: aload 5
      // 16c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 171: ifeq 1b7
      // 174: aload 5
      // 176: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 17b: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa
      // 17e: iload 2
      // 17f: ifne 1d8
      // 182: astore 6
      // 184: aload 6
      // 186: ifnull 1b3
      // 189: aload 0
      // 18a: aload 6
      // 18c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // 18f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaabba (I)Z
      // 192: iload 2
      // 193: ifne 1b2
      // 196: goto 19a
      // 199: athrow
      // 19a: ifeq 1b3
      // 19d: goto 1a1
      // 1a0: athrow
      // 1a1: aload 4
      // 1a3: aload 0
      // 1a4: aload 6
      // 1a6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa;)Ljava/util/Map;
      // 1a9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1ae: goto 1b2
      // 1b1: athrow
      // 1b2: pop
      // 1b3: iload 2
      // 1b4: ifeq 16a
      // 1b7: aload 3
      // 1b8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 1bb: ldc_w -2056749245
      // 1be: iload 7
      // 1c0: ldc_w -1413536545
      // 1c3: ixor
      // 1c4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 1c7: ldc2_w 4539028540740341548
      // 1ca: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 1cd: aaload
      // 1ce: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 1d1: aload 4
      // 1d3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1d8: pop
      // 1d9: aload 3
      // 1da: areturn
   }

   @Override
   public void abaab() {
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
      // 06: ifne 3a
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba Z
      // 0c: ifne 35
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 17: ldc_w -2056749246
      // 1a: ldc_w 1810023720
      // 1d: ldc_w -707317589
      // 20: ixor
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 24: ldc2_w 7381897532694786218
      // 27: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 2a: aaload
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 2e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baba Ljava/lang/String;
      // 31: goto 35
      // 34: athrow
      // 35: aload 0
      // 36: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aabab ()V
      // 39: aload 0
      // 3a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aba Ljava/util/Map;
      // 3d: invokeinterface java/util/Map.clear ()V 1
      // 42: return
   }

   private Map baba(baababab var1) {
      int var6 = 1534761899;
      class_306 var3 = this.aaaaa(var1);
      int var10000 = baaabbaa.bba;
      byte var4 = aabbabbbb.bbaaaaa(var3);
      LinkedHashMap var5 = new LinkedHashMap();
      var5.put(
         aabbaaaba.abba(baaa[baaa(a(-2056749247, var6 ^ 1296753313), 2627473596664500526L)]), Boolean.valueOf((boolean)var4)
      );
      int var2 = var10000;

      String var10001;
      String var10002;
      label58: {
         try {
            var11 = var5;
            var10001 = aabbaaaba.abba(baaa[baaa(a(-2056749248, var6 ^ 417936185), 2606741438773837577L)]);
            if (var4 != 0) {
               var10002 = baaa[1];
               break label58;
            }
         } catch (IllegalStateException var10) {
            throw var10;
         }

         var10002 = aabbabbbb.abbbbb(var3);
      }

      label51: {
         try {
            var11.put(var10001, var10002);
            var12 = var5;
            var10001 = aabbaaaba.abba(baaa[baaa(a(-2056749241, var6 ^ -1651838402), 6853684792425653042L)]);
            if (var4 != 0) {
               var10002 = baaa[1];
               break label51;
            }
         } catch (IllegalStateException var9) {
            throw var9;
         }

         var10002 = var3.method_1441();
      }

      label44: {
         try {
            var12.put(var10001, var10002);
            var13 = var5;
            var10001 = aabbaaaba.abba(baaa[baaa(a(-2056749242, var6 ^ -1380944840), 8916080645655934069L)]);
            if (var4 != 0) {
               var10002 = aabbaaaba.abba(baaa[baaa(a(-2056749243, var6 ^ 1777686432), 8285396276985937440L)]);
               break label44;
            }
         } catch (IllegalStateException var8) {
            throw var8;
         }

         var10002 = var3.method_1442().name().toLowerCase(Locale.ROOT);
      }

      label37: {
         label36: {
            try {
               var13.put(var10001, var10002);
               var14 = var5;
               var10001 = aabbaaaba.abba(baaa[baaa(a(-2056749244, var6 ^ 770824526), 7371516103592195000L)]);
               var20 = var4;
               if (var2 != 0) {
                  break label37;
               }

               if (var4 != 0) {
                  break label36;
               }
            } catch (IllegalStateException var7) {
               throw var7;
            }

            var20 = var3.method_1444();
            break label37;
         }

         var20 = -1;
      }

      var14.put(var10001, var20);
      return var5;
   }

   private static void babb() {
      int var0 = -1594649801;
      baaa[0] = abbba(
         bba(a(-2056749221, var0 ^ 1746814215), a(-2056749222, var0 ^ -1018825828)).toCharArray(),
         aaaaab(a(-2056749223, var0 ^ -513434688), 5536759784114841510L),
         baaa(a(-2056749224, var0 ^ 906701781), 5637828944468272768L)
      );
      baaa[1] = abbba(
         "".toCharArray(), aaaaab(a(-2056749217, var0 ^ 148569500), 1001295927726105080L), baaa(a(-2056749218, var0 ^ -46612206), 2154939510445031065L)
      );
      baaa[2] = abbba(
         bba(a(-2056749219, var0 ^ -1507233171), a(-2056749220, var0 ^ -112444032)).toCharArray(),
         aaaaab(a(-2056749229, var0 ^ 986875300), 2159233775346456303L),
         baaa(a(-2056749230, var0 ^ 529440184), 6540070575007684289L)
      );
      baaa[3] = abbba(
         bba(a(-2056749231, var0 ^ 1159834914), a(-2056749232, var0 ^ 331471313)).toCharArray(),
         aaaaab(a(-2056749225, var0 ^ 535990269), 5802722835847136574L),
         baaa(a(-2056749226, var0 ^ -1949628692), 1148422226913252145L)
      );
      baaa[4] = abbba(
         bba(a(-2056749227, var0 ^ 1320153288), a(-2056749228, var0 ^ -1598245385)).toCharArray(),
         aaaaab(a(-2056749269, var0 ^ -793816574), 4774900135623954146L),
         baaa(a(-2056749270, var0 ^ 1377808064), 5099494502755290766L)
      );
      baaa[5] = abbba(
         bba(a(-2056749271, var0 ^ 1517852248), a(-2056749272, var0 ^ 430054616)).toCharArray(),
         aaaaab(a(-2056749265, var0 ^ 1331423996), 804672938273851223L),
         baaa(a(-2056749266, var0 ^ -880528446), 1137058724416205603L)
      );
      baaa[baaa(a(-2056749267, var0 ^ 786872987), 839901926917931714L)] = abbba(
         bba(a(-2056749268, var0 ^ 669994267), a(-2056749277, var0 ^ -476489292)).toCharArray(),
         aaaaab(a(-2056749278, var0 ^ -1132302600), 9132307675644909800L),
         baaa(a(-2056749279, var0 ^ 1671128065), 474720008135438095L)
      );
      baaa[baaa(a(-2056749280, var0 ^ -1285078791), 8019979306392481875L)] = abbba(
         bba(a(-2056749273, var0 ^ 1508887116), a(-2056749274, var0 ^ 1184962142)).toCharArray(),
         aaaaab(a(-2056749275, var0 ^ 1282190437), 7663860653919448992L),
         baaa(a(-2056749276, var0 ^ -50921783), 3840874217750429606L)
      );
      baaa[baaa(a(-2056749253, var0 ^ -69289030), 1015603400483433177L)] = abbba(
         bba(a(-2056749254, var0 ^ -1487733063), a(-2056749255, var0 ^ -1800257663)).toCharArray(),
         aaaaab(a(-2056749256, var0 ^ 840803088), 255500889821850929L),
         baaa(a(-2056749249, var0 ^ -80975214), 1021762045638285558L)
      );
      baaa[baaa(a(-2056749250, var0 ^ -1714083360), 7898420243710774702L)] = abbba(
         bba(a(-2056749251, var0 ^ -1206120278), a(-2056749252, var0 ^ -628515111)).toCharArray(),
         aaaaab(a(-2056749261, var0 ^ -682273771), 6456435185449461422L),
         baaa(a(-2056749262, var0 ^ 2045983945), 6667736625381972567L)
      );
      baaa[baaa(a(-2056749263, var0 ^ 815800145), 9202266301193001437L)] = abbba(
         bba(a(-2056749264, var0 ^ 1266892250), a(-2056749257, var0 ^ -712973919)).toCharArray(),
         aaaaab(a(-2056749258, var0 ^ -487259384), 4185895259843877776L),
         baaa(a(-2056749259, var0 ^ 961461942), 509935715097147599L)
      );
      baaa[baaa(a(-2056749260, var0 ^ 476848615), 9009224476574577785L)] = abbba(
         bba(a(-2056749301, var0 ^ 1088611233), a(-2056749302, var0 ^ -1315335556)).toCharArray(),
         aaaaab(a(-2056749303, var0 ^ 1530718455), 8051955632999251618L),
         baaa(a(-2056749304, var0 ^ 1562162420), 6167302481649969103L)
      );
      baaa[baaa(a(-2056749297, var0 ^ -443919293), 460968746146363566L)] = abbba(
         bba(a(-2056749298, var0 ^ 2022311465), a(-2056749299, var0 ^ -501113680)).toCharArray(),
         aaaaab(a(-2056749300, var0 ^ 1746993594), 6648199879368035440L),
         baaa(a(-2056749309, var0 ^ 150655224), 3640778768009372128L)
      );
      baaa[baaa(a(-2056749310, var0 ^ 1335872674), 1209464470209853291L)] = abbba(
         bba(a(-2056749311, var0 ^ 542646408), a(-2056749312, var0 ^ -650481107)).toCharArray(),
         aaaaab(a(-2056749305, var0 ^ -861637352), 1409260237058176047L),
         baaa(a(-2056749306, var0 ^ -712030744), 6563637437249157880L)
      );
      baaa[baaa(a(-2056749307, var0 ^ -1484761319), 3111102719821072030L)] = abbba(
         bba(a(-2056749308, var0 ^ 1685896132), a(-2056749285, var0 ^ 969048435)).toCharArray(),
         aaaaab(a(-2056749286, var0 ^ -1350591356), 8688644454255986542L),
         baaa(a(-2056749287, var0 ^ -34569769), 6134247548413745816L)
      );
      baaa[baaa(a(-2056749288, var0 ^ -1386716747), 6128754087123731627L)] = abbba(
         bba(a(-2056749281, var0 ^ 1546232013), a(-2056749282, var0 ^ -789092720)).toCharArray(),
         aaaaab(a(-2056749283, var0 ^ -658404491), 5440966420295643601L),
         baaa(a(-2056749284, var0 ^ -1905377395), 8978247589006166681L)
      );
      baaa[baaa(a(-2056749293, var0 ^ -1132357775), 7381897532694786218L)] = abbba(
         bba(a(-2056749294, var0 ^ 1160519405), a(-2056749295, var0 ^ 1034182525)).toCharArray(),
         aaaaab(a(-2056749296, var0 ^ -2100868613), 9010031901986121373L),
         baaa(a(-2056749289, var0 ^ 960624732), 7556211883983332865L)
      );
      baaa[baaa(a(-2056749290, var0 ^ -418145298), 743935833716500974L)] = abbba(
         bba(a(-2056749291, var0 ^ -1687353983), a(-2056749292, var0 ^ 2071584893)).toCharArray(),
         aaaaab(a(-2056749077, var0 ^ -1664233671), 5461892269108903302L),
         baaa(a(-2056749078, var0 ^ -1734646297), 1174866256710195464L)
      );
      baaa[baaa(a(-2056749079, var0 ^ 330627736), 7859298096660525174L)] = abbba(
         bba(a(-2056749080, var0 ^ 271749908), a(-2056749073, var0 ^ -2081631853)).toCharArray(),
         aaaaab(a(-2056749074, var0 ^ -153417294), 2922403457884574890L),
         baaa(a(-2056749075, var0 ^ 1081173847), 7792043794889040026L)
      );
      baaa[baaa(a(-2056749076, var0 ^ 1074973159), 6919340060282079123L)] = abbba(
         bba(a(-2056749085, var0 ^ 1916672950), a(-2056749086, var0 ^ -165793982)).toCharArray(),
         aaaaab(a(-2056749087, var0 ^ -1004457586), 7945510179384411539L),
         baaa(a(-2056749088, var0 ^ -360346004), 7220183191332052068L)
      );
      baaa[baaa(a(-2056749081, var0 ^ -630405174), 2844987638648060513L)] = abbba(
         bba(a(-2056749082, var0 ^ -631829488), a(-2056749083, var0 ^ -807977966)).toCharArray(),
         aaaaab(a(-2056749084, var0 ^ -1721475125), 2092906503009117883L),
         baaa(a(-2056749061, var0 ^ -63443312), 3320814712592781938L)
      );
      baaa[baaa(a(-2056749062, var0 ^ -1206269585), 6039600429979376898L)] = abbba(
         bba(a(-2056749063, var0 ^ -1159127134), a(-2056749064, var0 ^ 51872760)).toCharArray(),
         aaaaab(a(-2056749057, var0 ^ -1010754116), 2536841638423601749L),
         baaa(a(-2056749058, var0 ^ -1267935048), 7053188471272446295L)
      );
      baaa[baaa(a(-2056749059, var0 ^ -1206669046), 1169721355999122716L)] = abbba(
         bba(a(-2056749060, var0 ^ 540217307), a(-2056749069, var0 ^ -1752936205)).toCharArray(),
         aaaaab(a(-2056749070, var0 ^ 238031040), 3367215586998905218L),
         baaa(a(-2056749071, var0 ^ 644308157), 1616918177026289602L)
      );
      baaa[baaa(a(-2056749072, var0 ^ -1429120286), 8285396276985937440L)] = abbba(
         bba(a(-2056749065, var0 ^ -471623081), a(-2056749066, var0 ^ 337290572)).toCharArray(),
         aaaaab(a(-2056749067, var0 ^ 586779572), 7190385122147357238L),
         baaa(a(-2056749068, var0 ^ -1040104229), 3285489915828463265L)
      );
      baaa[baaa(a(-2056749109, var0 ^ -59045220), 7045909219213896194L)] = abbba(
         bba(a(-2056749110, var0 ^ -427906088), a(-2056749111, var0 ^ -1197710296)).toCharArray(),
         aaaaab(a(-2056749112, var0 ^ -1976778118), 8990706171462633146L),
         baaa(a(-2056749105, var0 ^ -1025703969), 6513639867999424162L)
      );
      baaa[baaa(a(-2056749106, var0 ^ -2020658184), 1142520160383189182L)] = abbba(
         bba(a(-2056749107, var0 ^ -2080936672), a(-2056749108, var0 ^ -1277394499)).toCharArray(),
         aaaaab(a(-2056749117, var0 ^ 1370200879), 4237914691632628197L),
         baaa(a(-2056749118, var0 ^ -1513672551), 4348314913522347595L)
      );
      baaa[baaa(a(-2056749119, var0 ^ -181042155), 2085496592848061137L)] = abbba(
         bba(a(-2056749120, var0 ^ 1258595528), a(-2056749113, var0 ^ -785759730)).toCharArray(),
         aaaaab(a(-2056749114, var0 ^ -593233850), 8831298081568127785L),
         baaa(a(-2056749115, var0 ^ -105806189), 7355572117683871602L)
      );
      baaa[baaa(a(-2056749116, var0 ^ 1161766975), 5658109523827371040L)] = abbba(
         bba(a(-2056749093, var0 ^ -140595749), a(-2056749094, var0 ^ -930930286)).toCharArray(),
         aaaaab(a(-2056749095, var0 ^ 2137012832), 810947615156347854L),
         baaa(a(-2056749096, var0 ^ 802795551), 7341669620024158290L)
      );
      baaa[baaa(a(-2056749089, var0 ^ -533384486), 6485775008526584816L)] = abbba(
         bba(a(-2056749090, var0 ^ 185769359), a(-2056749091, var0 ^ 465132052)).toCharArray(),
         aaaaab(a(-2056749092, var0 ^ 1571738755), 7441295227533599068L),
         baaa(a(-2056749101, var0 ^ 435708917), 7931461084666863998L)
      );
      baaa[baaa(a(-2056749102, var0 ^ -181534438), 1313145524123142650L)] = abbba(
         bba(a(-2056749103, var0 ^ 1714473177), a(-2056749104, var0 ^ 627170030)).toCharArray(),
         aaaaab(a(-2056749097, var0 ^ 1867891679), 42268093182558623L),
         baaa(a(-2056749098, var0 ^ 1283682346), 4578546662074324948L)
      );
      baaa[baaa(a(-2056749099, var0 ^ -1707550226), 6166313455875521954L)] = abbba(
         bba(a(-2056749100, var0 ^ 2084002645), a(-2056749141, var0 ^ 816610474)).toCharArray(),
         aaaaab(a(-2056749142, var0 ^ 492190458), 5383339949686309778L),
         baaa(a(-2056749143, var0 ^ 258238003), 7155802347900102238L)
      );
      baaa[baaa(a(-2056749144, var0 ^ -1715082584), 6259864850067232841L)] = abbba(
         bba(a(-2056749137, var0 ^ -1691068070), a(-2056749138, var0 ^ 353519837)).toCharArray(),
         aaaaab(a(-2056749139, var0 ^ -1716021386), 2064285461941490663L),
         baaa(a(-2056749140, var0 ^ -1749072569), 6027707722377969413L)
      );
      baaa[baaa(a(-2056749149, var0 ^ -19194682), 272171629857999175L)] = abbba(
         bba(a(-2056749150, var0 ^ 1135697764), a(-2056749151, var0 ^ -429899325)).toCharArray(),
         aaaaab(a(-2056749152, var0 ^ -1511990543), 1150619097435916373L),
         baaa(a(-2056749145, var0 ^ 831919730), 4119006593115029278L)
      );
      baaa[baaa(a(-2056749146, var0 ^ -1046992844), 7318329953240111303L)] = abbba(
         bba(a(-2056749147, var0 ^ -2079767623), a(-2056749148, var0 ^ 1370206164)).toCharArray(),
         aaaaab(a(-2056749125, var0 ^ 274116499), 868508974282447270L),
         baaa(a(-2056749126, var0 ^ 930323638), 2358601681873000563L)
      );
      baaa[baaa(a(-2056749127, var0 ^ -2021423952), 5151770366979143313L)] = abbba(
         bba(a(-2056749128, var0 ^ 300610090), a(-2056749121, var0 ^ 829503535)).toCharArray(),
         aaaaab(a(-2056749122, var0 ^ -157718512), 5958182290699790836L),
         baaa(a(-2056749123, var0 ^ 555155383), 8602822994676751084L)
      );
      baaa[baaa(a(-2056749124, var0 ^ 1839831019), 4530959452799390277L)] = abbba(
         bba(a(-2056749133, var0 ^ 733194366), a(-2056749134, var0 ^ 985092248)).toCharArray(),
         aaaaab(a(-2056749135, var0 ^ 1168535133), 5907160232732262628L),
         baaa(a(-2056749136, var0 ^ -990896032), 3177576248199407908L)
      );
      baaa[baaa(a(-2056749129, var0 ^ -313405263), 5870252835469745603L)] = abbba(
         bba(a(-2056749130, var0 ^ -1787068982), a(-2056749131, var0 ^ -410374899)).toCharArray(),
         aaaaab(a(-2056749132, var0 ^ 2098092037), 8093279684071812918L),
         baaa(a(-2056749173, var0 ^ -395364071), 6095054882270118722L)
      );
      baaa[baaa(a(-2056749174, var0 ^ 2101211014), 509865818432625513L)] = abbba(
         bba(a(-2056749175, var0 ^ 152686088), a(-2056749176, var0 ^ -1359236507)).toCharArray(),
         aaaaab(a(-2056749169, var0 ^ 1966996299), 8659528218648017812L),
         baaa(a(-2056749170, var0 ^ -1756495702), 67221655184988170L)
      );
      baaa[baaa(a(-2056749171, var0 ^ -553295615), 743612732633165814L)] = abbba(
         bba(a(-2056749172, var0 ^ 635527197), a(-2056749181, var0 ^ -218807057)).toCharArray(),
         aaaaab(a(-2056749182, var0 ^ 1919459463), 5171026282467715728L),
         baaa(a(-2056749183, var0 ^ 925511662), 9061177766481570710L)
      );
      baaa[baaa(a(-2056749184, var0 ^ -1268298652), 5396589009270696293L)] = abbba(
         bba(a(-2056749177, var0 ^ 101919650), a(-2056749178, var0 ^ 704388108)).toCharArray(),
         aaaaab(a(-2056749179, var0 ^ 1980022704), 5843859625195840866L),
         baaa(a(-2056749180, var0 ^ 667754973), 924050542968564101L)
      );
      baaa[baaa(a(-2056749157, var0 ^ -606988242), 4048752012138612410L)] = abbba(
         bba(a(-2056749158, var0 ^ -1061435848), a(-2056749159, var0 ^ 1413564826)).toCharArray(),
         aaaaab(a(-2056749160, var0 ^ -1720937832), 6773774899390600405L),
         baaa(a(-2056749153, var0 ^ -1608445280), 2877768821758828851L)
      );
      baaa[baaa(a(-2056749154, var0 ^ -864561950), 6479601137449208657L)] = abbba(
         bba(a(-2056749155, var0 ^ -711341187), a(-2056749156, var0 ^ -1404569825)).toCharArray(),
         aaaaab(a(-2056749165, var0 ^ -1526043684), 5539616120694157359L),
         baaa(a(-2056749166, var0 ^ 1890822158), 7633476503688335315L)
      );
      baaa[baaa(a(-2056749167, var0 ^ -489386765), 1508600671652716875L)] = abbba(
         bba(a(-2056749168, var0 ^ 2071748275), a(-2056749161, var0 ^ -809895063)).toCharArray(),
         aaaaab(a(-2056749162, var0 ^ 1063595632), 4403353581487021959L),
         baaa(a(-2056749163, var0 ^ 369976604), 1692915415874424507L)
      );
      baaa[baaa(a(-2056749164, var0 ^ -2137807760), 1095684364347392217L)] = abbba(
         bba(a(-2056749973, var0 ^ -1274433028), a(-2056749974, var0 ^ 1462003011)).toCharArray(),
         aaaaab(a(-2056749975, var0 ^ 1193171195), 4113393309863279905L),
         baaa(a(-2056749976, var0 ^ 1047478728), 3297982009904914890L)
      );
      baaa[baaa(a(-2056749969, var0 ^ -1808455429), 7173665647413341756L)] = abbba(
         bba(a(-2056749970, var0 ^ -1770894252), a(-2056749971, var0 ^ -1042867683)).toCharArray(),
         aaaaab(a(-2056749972, var0 ^ -97792593), 4759958317989218669L),
         baaa(a(-2056749981, var0 ^ 2070932517), 8591006831050117569L)
      );
      baaa[baaa(a(-2056749982, var0 ^ -1183709131), 1713110305060377005L)] = abbba(
         bba(a(-2056749983, var0 ^ -1153520789), a(-2056749984, var0 ^ 768122212)).toCharArray(),
         aaaaab(a(-2056749977, var0 ^ -2120542794), 953946607038610914L),
         baaa(a(-2056749978, var0 ^ 1631095644), 5118222168034252985L)
      );
      baaa[baaa(a(-2056749979, var0 ^ 2131563767), 1680520282823614870L)] = abbba(
         bba(a(-2056749980, var0 ^ 815267622), a(-2056749957, var0 ^ -1897450422)).toCharArray(),
         aaaaab(a(-2056749958, var0 ^ -663751398), 6209969408969591669L),
         baaa(a(-2056749959, var0 ^ 327225461), 4909189139242118719L)
      );
      baaa[baaa(a(-2056749960, var0 ^ -1220140912), 4164121250743914697L)] = abbba(
         bba(a(-2056749953, var0 ^ -646098904), a(-2056749954, var0 ^ -922540352)).toCharArray(),
         aaaaab(a(-2056749955, var0 ^ 311659596), 8051064655343025265L),
         baaa(a(-2056749956, var0 ^ 1524315982), 3601298866578899241L)
      );
      baaa[baaa(a(-2056749965, var0 ^ -190200633), 7731564340759388908L)] = abbba(
         bba(a(-2056749966, var0 ^ -2055494049), a(-2056749967, var0 ^ -1841971884)).toCharArray(),
         aaaaab(a(-2056749968, var0 ^ 1836368240), 5806085469134708387L),
         baaa(a(-2056749961, var0 ^ 1099381667), 5665595070186454941L)
      );
      baaa[baaa(a(-2056749962, var0 ^ 110000157), 8397263111464630983L)] = abbba(
         bba(a(-2056749963, var0 ^ -837794901), a(-2056749964, var0 ^ -1312138881)).toCharArray(),
         aaaaab(a(-2056750005, var0 ^ -1567044057), 5728865912505427266L),
         baaa(a(-2056750006, var0 ^ 637259023), 2376428686768601183L)
      );
      baaa[baaa(a(-2056750007, var0 ^ 518177325), 4650108826489528751L)] = abbba(
         bba(a(-2056750008, var0 ^ 174005147), a(-2056750001, var0 ^ 1010416415)).toCharArray(),
         aaaaab(a(-2056750002, var0 ^ 1281609376), 7139220369442165575L),
         baaa(a(-2056750003, var0 ^ -1862062061), 5490213495224688632L)
      );
      baaa[baaa(a(-2056750004, var0 ^ 314148690), 7444526870111864181L)] = abbba(
         bba(a(-2056750013, var0 ^ -131795242), a(-2056750014, var0 ^ -1876123045)).toCharArray(),
         aaaaab(a(-2056750015, var0 ^ 1828998690), 2221088151523254280L),
         baaa(a(-2056750016, var0 ^ -1879521820), 3699517180846307878L)
      );
      baaa[baaa(a(-2056750009, var0 ^ 1841799155), 5399675883050123729L)] = abbba(
         bba(a(-2056750010, var0 ^ 1128655864), a(-2056750011, var0 ^ -628409240)).toCharArray(),
         aaaaab(a(-2056750012, var0 ^ 1726039112), 8804600965253005156L),
         baaa(a(-2056749989, var0 ^ 2000167760), 677399587591718697L)
      );
      baaa[baaa(a(-2056749990, var0 ^ 987411471), 115164612352661067L)] = abbba(
         bba(a(-2056749991, var0 ^ 2134279801), a(-2056749992, var0 ^ -669338174)).toCharArray(),
         aaaaab(a(-2056749985, var0 ^ 2001658586), 280895798080881144L),
         baaa(a(-2056749986, var0 ^ 152874594), 1687832249506879872L)
      );
      baaa[baaa(a(-2056749987, var0 ^ -937322113), 6955349438586906351L)] = abbba(
         bba(a(-2056749988, var0 ^ -1485671748), a(-2056749997, var0 ^ -1718260202)).toCharArray(),
         aaaaab(a(-2056749998, var0 ^ 1042352460), 1331121574526987109L),
         baaa(a(-2056749999, var0 ^ 467054091), 2428023866668344943L)
      );
      baaa[baaa(a(-2056750000, var0 ^ 1223443474), 5710303571935144882L)] = abbba(
         bba(a(-2056749993, var0 ^ 1544611996), a(-2056749994, var0 ^ 2048844569)).toCharArray(),
         aaaaab(a(-2056749995, var0 ^ -1026067827), 6615877624659217647L),
         baaa(a(-2056749996, var0 ^ -1546542453), 501321955562125194L)
      );
      baaa[baaa(a(-2056750037, var0 ^ -71441665), 3760213767032413232L)] = abbba(
         bba(a(-2056750038, var0 ^ 2092021183), a(-2056750039, var0 ^ 71586932)).toCharArray(),
         aaaaab(a(-2056750040, var0 ^ 1193195584), 6361583739227121147L),
         baaa(a(-2056750033, var0 ^ 420399326), 1935686799271489303L)
      );
      baaa[baaa(a(-2056750034, var0 ^ -1218821726), 613861979102165026L)] = abbba(
         bba(a(-2056750035, var0 ^ 776450322), a(-2056750036, var0 ^ 217735993)).toCharArray(),
         aaaaab(a(-2056750045, var0 ^ 1561664158), 6494948716051738831L),
         baaa(a(-2056750046, var0 ^ -1131007813), 1550836604131365006L)
      );
      baaa[baaa(a(-2056750047, var0 ^ -348465184), 5557890939723507998L)] = abbba(
         bba(a(-2056750048, var0 ^ 988830966), a(-2056750041, var0 ^ 724667839)).toCharArray(),
         aaaaab(a(-2056750042, var0 ^ -13720607), 3526687433681686773L),
         baaa(a(-2056750043, var0 ^ -503588580), 8591448949374524360L)
      );
      baaa[baaa(a(-2056750044, var0 ^ 1533526894), 1690861306653061863L)] = abbba(
         bba(a(-2056750021, var0 ^ -338778062), a(-2056750022, var0 ^ 291118779)).toCharArray(),
         aaaaab(a(-2056750023, var0 ^ 1723592537), 738573618716751542L),
         baaa(a(-2056750024, var0 ^ 867254386), 1208397532227845278L)
      );
      baaa[baaa(a(-2056750017, var0 ^ -506547453), 5295245431196199746L)] = abbba(
         bba(a(-2056750018, var0 ^ 1239738665), a(-2056750019, var0 ^ -744694141)).toCharArray(),
         aaaaab(a(-2056750020, var0 ^ -1655738035), 1455646090585882758L),
         baaa(a(-2056750029, var0 ^ -534452854), 4039609785989236749L)
      );
      baaa[baaa(a(-2056750030, var0 ^ -498163340), 6070729998361299965L)] = abbba(
         bba(a(-2056750031, var0 ^ -1096964909), a(-2056750032, var0 ^ -2089804521)).toCharArray(),
         aaaaab(a(-2056750025, var0 ^ -283818818), 3494460132077196450L),
         baaa(a(-2056750026, var0 ^ -363624097), 8691753177837865949L)
      );
      baaa[baaa(a(-2056750027, var0 ^ 2065704105), 6142409876531630841L)] = abbba(
         bba(a(-2056750028, var0 ^ -892478056), a(-2056750069, var0 ^ -1282060367)).toCharArray(),
         aaaaab(a(-2056750070, var0 ^ -1479042439), 8975847861218746208L),
         baaa(a(-2056750071, var0 ^ -1682667465), 6790619701192850607L)
      );
      baaa[baaa(a(-2056750072, var0 ^ 2132936011), 1073544589460504929L)] = abbba(
         bba(a(-2056750065, var0 ^ 1945991053), a(-2056750066, var0 ^ -336375304)).toCharArray(),
         aaaaab(a(-2056750067, var0 ^ 297451050), 956488193329871539L),
         baaa(a(-2056750068, var0 ^ -1092171294), 5509370399838475321L)
      );
      baaa[baaa(a(-2056750077, var0 ^ -600350896), 5078231472991321777L)] = abbba(
         bba(a(-2056750078, var0 ^ 1646819695), a(-2056750079, var0 ^ 1987952277)).toCharArray(),
         aaaaab(a(-2056750080, var0 ^ 674940690), 2879007232272489083L),
         baaa(a(-2056750073, var0 ^ -1824761362), 769248503319633349L)
      );
      baaa[baaa(a(-2056750074, var0 ^ -787415607), 2833594740070619046L)] = abbba(
         bba(a(-2056750075, var0 ^ 1222587914), a(-2056750076, var0 ^ 637256898)).toCharArray(),
         aaaaab(a(-2056750053, var0 ^ -1337283757), 2189733993339069287L),
         baaa(a(-2056750054, var0 ^ 1583898795), 7979849421681671418L)
      );
      baaa[baaa(a(-2056750055, var0 ^ -628596232), 4705745189158713005L)] = abbba(
         bba(a(-2056750056, var0 ^ 1341914083), a(-2056750049, var0 ^ -1282480547)).toCharArray(),
         aaaaab(a(-2056750050, var0 ^ -14249358), 1234682659188115120L),
         baaa(a(-2056750051, var0 ^ -668781730), 4069773591692710056L)
      );
      baaa[baaa(a(-2056750052, var0 ^ -1512949883), 3030391702656009964L)] = abbba(
         bba(a(-2056750061, var0 ^ 1699937551), a(-2056750062, var0 ^ 948086671)).toCharArray(),
         aaaaab(a(-2056750063, var0 ^ 1165606106), 5095689365458542947L),
         baaa(a(-2056750064, var0 ^ -1752928898), 5606435446351203897L)
      );
      baaa[baaa(a(-2056750057, var0 ^ 441687831), 2655804047313482934L)] = abbba(
         bba(a(-2056750058, var0 ^ -1805752151), a(-2056750059, var0 ^ -192486800)).toCharArray(),
         aaaaab(a(-2056750060, var0 ^ 1864632698), 1597512773083127471L),
         baaa(a(-2056749845, var0 ^ 1977394155), 8012177945687152800L)
      );
      baaa[baaa(a(-2056749846, var0 ^ 399776804), 638899834246253550L)] = abbba(
         bba(a(-2056749847, var0 ^ -611272205), a(-2056749848, var0 ^ -2077633425)).toCharArray(),
         aaaaab(a(-2056749841, var0 ^ 1297270169), 7648308266574269324L),
         baaa(a(-2056749842, var0 ^ -1370175666), 5549973394512000708L)
      );
   }

   private String bbab(baababab var1) {
      return this.abaaa(var1);
   }

   private void bbba(class_310 param1, String param2) {
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
      // 06: ifne 46
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba Z
      // 0c: ifeq 3c
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 3
      // 15: ifne 46
      // 18: goto 1c
      // 1b: athrow
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 1f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 22: checkcast java/lang/Boolean
      // 25: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 28: ifeq 3c
      // 2b: goto 2f
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 1
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbbba (Lnet/minecraft/class_310;)V
      // 34: iload 3
      // 35: ifeq 4a
      // 38: goto 3c
      // 3b: athrow
      // 3c: aload 0
      // 3d: bipush 0
      // 3e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbab Z
      // 41: aload 0
      // 42: goto 46
      // 45: athrow
      // 46: bipush 0
      // 47: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baa Z
      // 4a: aload 0
      // 4b: bipush 0
      // 4c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba Z
      // 4f: aload 0
      // 50: aconst_null
      // 51: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;
      // 54: aload 0
      // 55: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 58: bipush 1
      // 59: iload 3
      // 5a: ifne 9c
      // 5d: aaload
      // 5e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bba Ljava/lang/String;
      // 61: aload 0
      // 62: bipush 0
      // 63: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbb Z
      // 66: aload 0
      // 67: aload 2
      // 68: ifnull 82
      // 6b: goto 6f
      // 6e: athrow
      // 6f: aload 2
      // 70: iload 3
      // 71: ifne a0
      // 74: goto 78
      // 77: athrow
      // 78: invokevirtual java/lang/String.isBlank ()Z
      // 7b: ifeq a3
      // 7e: goto 82
      // 81: athrow
      // 82: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 85: ldc_w -2056749843
      // 88: ldc_w -691682308
      // 8b: ldc_w -1508274899
      // 8e: ixor
      // 8f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 92: ldc2_w 7381897532694786218
      // 95: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 98: goto 9c
      // 9b: athrow
      // 9c: aaload
      // 9d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // a0: goto a4
      // a3: aload 2
      // a4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baba Ljava/lang/String;
      // a7: return
   }

   private static boolean bbbb(baababab param0) {
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
      // 06: ifne 11
      // 09: ifnull 2f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 0
      // 11: iload 1
      // 12: ifne 24
      // 15: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 18: ifnull 2f
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 0
      // 20: goto 24
      // 23: athrow
      // 24: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 27: ifnull 2f
      // 2a: bipush 1
      // 2b: goto 30
      // 2e: athrow
      // 2f: bipush 0
      // 30: ireturn
   }

   private class_306 aaaaa(baababab param1) {
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
      // 09: ifnull 35
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ba Ljava/lang/String;
      // 18: ifnull 35
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 3b
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ba Ljava/lang/String;
      // 2b: invokevirtual java/lang/String.isBlank ()Z
      // 2e: ifeq 3a
      // 31: goto 35
      // 34: athrow
      // 35: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 38: areturn
      // 39: athrow
      // 3a: aload 1
      // 3b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ba Ljava/lang/String;
      // 3e: invokestatic net/minecraft/class_3675.method_15981 (Ljava/lang/String;)Lnet/minecraft/class_3675$class_306;
      // 41: areturn
      // 42: astore 3
      // 43: aload 3
      // 44: pop
      // 45: getstatic net/minecraft/class_3675.field_16237 Lnet/minecraft/class_3675$class_306;
      // 48: areturn
   }

   private class_1799 aaaab(class_746 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: ifnull 26
      // 08: iload 2
      // 09: iload 3
      // 0a: ifne 19
      // 0d: goto 11
      // 10: athrow
      // 11: iflt 26
      // 14: goto 18
      // 17: athrow
      // 18: iload 2
      // 19: aload 1
      // 1a: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 1d: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 20: invokevirtual net/minecraft/class_2371.size ()I
      // 23: if_icmplt 2b
      // 26: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 29: areturn
      // 2a: athrow
      // 2b: aload 1
      // 2c: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 2f: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 32: iload 2
      // 33: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 36: checkcast net/minecraft/class_1735
      // 39: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 3c: areturn
   }

   private void aaaba(class_310 param1, class_746 param2) {
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
      // 06: ifne 6f
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 0c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 0f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbbb.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbbb;
      // 12: if_acmpne 5d
      // 15: goto 19
      // 18: athrow
      // 19: aload 1
      // 1a: iload 3
      // 1b: ifne 5e
      // 1e: goto 22
      // 21: athrow
      // 22: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 25: ifnonnull 5d
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 1
      // 2d: iload 3
      // 2e: ifne 5e
      // 31: goto 35
      // 34: athrow
      // 35: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 38: ifnull 5d
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 1
      // 40: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 43: new net/minecraft/class_2848
      // 46: dup
      // 47: aload 2
      // 48: getstatic net/minecraft/class_2848$class_2849.field_12988 Lnet/minecraft/class_2848$class_2849;
      // 4b: invokespecial net/minecraft/class_2848.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_2848$class_2849;)V
      // 4e: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 51: aload 0
      // 52: bipush 1
      // 53: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baa Z
      // 56: aload 0
      // 57: bipush 1
      // 58: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbb Z
      // 5b: return
      // 5c: athrow
      // 5d: aload 1
      // 5e: new net/minecraft/class_490
      // 61: dup
      // 62: aload 2
      // 63: invokespecial net/minecraft/class_490.<init> (Lnet/minecraft/class_1657;)V
      // 66: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // 69: aload 0
      // 6a: bipush 1
      // 6b: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbab Z
      // 6e: aload 0
      // 6f: bipush 1
      // 70: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbb Z
      // 73: return
   }

   public bbabab() {
      int var1 = 1150750403;
      super(
         baab,
         bbaabbba.bba,
         aabbaaaba.abba(baaa[baaa(a(-2056749844, var1 ^ 258280748), 7976089619104716375L)])
      );
      this.bbba = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(baaa[baaa(a(-2056749853, var1 ^ 1956766932), 6387711572809421505L)]),
               75.0,
               125.0,
               0.0,
               1000.0,
               5.0
            )
            .aaa(aabbaaaba.abba(baaa[baaa(a(-2056749854, var1 ^ 1094227250), 7821061747870208486L)]))
      );
      this.abba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(baaa[baaa(a(-2056749855, var1 ^ -1355706644), 1709392060997573645L)]), true
         )
      );
      this.bbb = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(baaa[baaa(a(-2056749856, var1 ^ -1918472958), 1630254786099877606L)]),
            abbaabbbb.class,
            abbaabbbb.aba
         )
      );
      this.bba = baaa[1];
      this.baba = aabbaaaba.abba(baaa[baaa(a(-2056749849, var1 ^ 146727193), 1987633409748962472L)]);
      this.aaa = new ArrayList();
      this.bab = 0L;
      this.aba = new HashMap();
   }

   private long aaabb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 04: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.bab ()D
      // 07: dstore 2
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0b: aload 0
      // 0c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 0f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab.abb ()D
      // 12: dstore 4
      // 14: istore 1
      // 15: dload 2
      // 16: iload 1
      // 17: ifne 33
      // 1a: dload 4
      // 1c: dcmpl
      // 1d: ifne 2a
      // 20: goto 24
      // 23: athrow
      // 24: dload 2
      // 25: invokestatic java/lang/Math.round (D)J
      // 28: lreturn
      // 29: athrow
      // 2a: invokestatic java/util/concurrent/ThreadLocalRandom.current ()Ljava/util/concurrent/ThreadLocalRandom;
      // 2d: dload 2
      // 2e: dload 4
      // 30: invokevirtual java/util/concurrent/ThreadLocalRandom.nextDouble (DD)D
      // 33: invokestatic java/lang/Math.round (D)J
      // 36: lreturn
   }

   private void aabab() {
      this.aaa = this.bb();
      this.bab = System.currentTimeMillis();
   }

   private static String aabba(class_1293 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: getstatic net/minecraft/class_7923.field_41174 Lnet/minecraft/class_2378;
      // 07: aload 0
      // 08: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
      // 0b: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
      // 10: checkcast net/minecraft/class_1291
      // 13: invokeinterface net/minecraft/class_2378.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 18: astore 2
      // 19: aload 2
      // 1a: iload 1
      // 1b: ifne 2f
      // 1e: ifnonnull 2e
      // 21: goto 25
      // 24: athrow
      // 25: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 28: bipush 1
      // 29: aaload
      // 2a: goto 32
      // 2d: athrow
      // 2e: aload 2
      // 2f: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 32: areturn
   }

   private String abaaa(baababab param1) {
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
      // 09: ifnull 35
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.aa Ljava/lang/String;
      // 14: iload 2
      // 15: ifne 41
      // 18: ifnull 35
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: iload 2
      // 21: ifne 45
      // 24: goto 28
      // 27: athrow
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.aa Ljava/lang/String;
      // 2b: invokevirtual java/lang/String.isBlank ()Z
      // 2e: ifeq 44
      // 31: goto 35
      // 34: athrow
      // 35: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 38: bipush 4
      // 39: aaload
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 3d: goto 41
      // 40: athrow
      // 41: goto 48
      // 44: aload 1
      // 45: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.aa Ljava/lang/String;
      // 48: areturn
   }

   private boolean ababb(class_310 param1) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 1
      // 14: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 17: instanceof net/minecraft/class_490
      // 1a: iload 2
      // 1b: ifne 34
      // 1e: ifeq 28
      // 21: goto 25
      // 24: athrow
      // 25: bipush 1
      // 26: ireturn
      // 27: athrow
      // 28: aload 0
      // 29: iload 2
      // 2a: ifne 42
      // 2d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baa Z
      // 30: goto 34
      // 33: athrow
      // 34: ifeq 58
      // 37: aload 0
      // 38: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 3e: goto 42
      // 41: athrow
      // 42: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbbb.baa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabbbb;
      // 45: if_acmpne 58
      // 48: aload 1
      // 49: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 4c: ifnonnull 58
      // 4f: goto 53
      // 52: athrow
      // 53: bipush 1
      // 54: goto 59
      // 57: athrow
      // 58: bipush 0
      // 59: ireturn
   }

   private String abbaa(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -1303135349
      // 03: istore 3
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 07: istore 2
      // 08: iload 1
      // 09: iload 2
      // 0a: ifne 61
      // 0d: ldc_w -2056749850
      // 10: iload 3
      // 11: ldc_w 1111461760
      // 14: ixor
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 18: ldc2_w 5870252835469745603
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 1e: if_icmplt 60
      // 21: goto 25
      // 24: athrow
      // 25: iload 1
      // 26: iload 2
      // 27: ifne 61
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ldc_w -2056749851
      // 31: iload 3
      // 32: ldc_w 187381483
      // 35: ixor
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 39: ldc2_w 1713110305060377005
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 3f: if_icmpge 60
      // 42: goto 46
      // 45: athrow
      // 46: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 49: ldc_w -2056749852
      // 4c: iload 3
      // 4d: ldc_w -1337894604
      // 50: ixor
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 54: ldc2_w 9068956471494993822
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 5a: aaload
      // 5b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 5e: areturn
      // 5f: athrow
      // 60: iload 1
      // 61: ldc_w -2056749829
      // 64: iload 3
      // 65: ldc_w -282030717
      // 68: ixor
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 6c: ldc2_w 1713110305060377005
      // 6f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 72: if_icmpne 8f
      // 75: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 78: ldc_w -2056749830
      // 7b: iload 3
      // 7c: ldc_w 1796464677
      // 7f: ixor
      // 80: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 83: ldc2_w 6398879717141578388
      // 86: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 89: aaload
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 8d: areturn
      // 8e: athrow
      // 8f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 92: ldc_w -2056749831
      // 95: iload 3
      // 96: ldc_w -188837685
      // 99: ixor
      // 9a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 9d: ldc2_w 4021428097361445273
      // a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // a3: aaload
      // a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // a7: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private baababab abbab(String var1) {
      int var2 = baaabbaa.bba;

      label64: {
         String var10000;
         label57: {
            try {
               var10000 = var1;
               if (var2 != 0) {
                  break label57;
               }

               if (var1 == null) {
                  break label64;
               }
            } catch (IllegalStateException var9) {
               throw var9;
            }

            var10000 = var1;
         }

         try {
            if (var10000.isBlank()) {
               break label64;
            }
         } catch (IllegalStateException var8) {
            throw var8;
         }

         Path var3 = this.babba(var1);

         label43: {
            label42: {
               try {
                  var10 = var3;
                  if (var2 != 0) {
                     break label42;
                  }

                  if (var3 == null) {
                     break label43;
                  }
               } catch (IllegalStateException var7) {
                  throw var7;
               }

               var10 = var3;
            }

            try {
               if (Files.exists(var10)) {
                  return this.aaab(var3);
               }
            } catch (IllegalStateException var6) {
               throw var6;
            }
         }

         try {
            return null;
         } catch (IllegalStateException var5) {
            throw var5;
         }
      }

      try {
         return null;
      } catch (IllegalStateException var4) {
         throw var4;
      }
   }

   private static String abbba(char[] var0, long var1, int var3) {
      int var4 = baaa(a(-2056749832, 207568598 ^ 1393775871), 3228857899065729314L) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & baaa(a(-2056749825, 207568598 ^ -1365758266), 9024307461142966423L);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private boolean abbbb(class_310 param1) {
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
      // 09: ifnull 58
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 58
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnull 58
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 3e: ifnull 58
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4d: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 50: ifnull 58
      // 53: bipush 1
      // 54: goto 59
      // 57: athrow
      // 58: bipush 0
      // 59: ireturn
   }

   public Map baaaa(String param1) {
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
      // 005: aload 0
      // 006: aload 1
      // 007: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba (Ljava/lang/String;)Ljava/lang/String;
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbab (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;
      // 00d: astore 3
      // 00e: aload 3
      // 00f: ifnonnull 035
      // 012: new java/lang/IllegalArgumentException
      // 015: dup
      // 016: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 019: ldc_w -2056749826
      // 01c: ldc_w -821443332
      // 01f: ldc_w 347865108
      // 022: ixor
      // 023: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 026: ldc2_w 1095684364347392217
      // 029: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 02c: aaload
      // 02d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 030: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 033: athrow
      // 034: athrow
      // 035: aload 0
      // 036: iload 2
      // 037: ifne 0b1
      // 03a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.babbaab ()Z
      // 03d: ifne 0a3
      // 040: goto 044
      // 043: athrow
      // 044: new java/lang/IllegalStateException
      // 047: dup
      // 048: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 04b: ldc_w -2056749827
      // 04e: ldc_w -821443332
      // 051: ldc_w 1984892919
      // 054: ixor
      // 055: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 058: ldc2_w 2990441503411368500
      // 05b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 05e: aaload
      // 05f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 062: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baab Ljava/lang/String;
      // 065: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 068: ldc_w -2056749828
      // 06b: ldc_w -821443332
      // 06e: ldc_w -881182024
      // 071: ixor
      // 072: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 075: ldc2_w 1713110305060377005
      // 078: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 07b: aaload
      // 07c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 07f: astore 7
      // 081: astore 6
      // 083: astore 5
      // 085: new java/lang/StringBuilder
      // 088: dup
      // 089: invokespecial java/lang/StringBuilder.<init> ()V
      // 08c: aload 5
      // 08e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 091: aload 6
      // 093: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 096: aload 7
      // 098: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 09b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09e: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 0a1: athrow
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: aload 3
      // 0a5: iload 2
      // 0a6: ifne 0c2
      // 0a9: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;
      // 0ac: aload 0
      // 0ad: goto 0b1
      // 0b0: athrow
      // 0b1: aload 3
      // 0b2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 0b5: ifnonnull 0c1
      // 0b8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 0bb: bipush 1
      // 0bc: aaload
      // 0bd: goto 0c5
      // 0c0: athrow
      // 0c1: aload 3
      // 0c2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 0c5: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bba Ljava/lang/String;
      // 0c8: aload 0
      // 0c9: bipush 1
      // 0ca: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba Z
      // 0cd: aload 0
      // 0ce: bipush 0
      // 0cf: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbab Z
      // 0d2: aload 0
      // 0d3: bipush 0
      // 0d4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baa Z
      // 0d7: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 0da: astore 4
      // 0dc: aload 0
      // 0dd: aload 4
      // 0df: iload 2
      // 0e0: ifne 0ec
      // 0e3: ifnull 101
      // 0e6: goto 0ea
      // 0e9: athrow
      // 0ea: aload 4
      // 0ec: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0ef: instanceof net/minecraft/class_490
      // 0f2: iload 2
      // 0f3: ifne 0fe
      // 0f6: ifeq 101
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: bipush 1
      // 0fe: goto 102
      // 101: bipush 0
      // 102: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbb Z
      // 105: aload 0
      // 106: lconst_0
      // 107: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaa J
      // 10a: aload 0
      // 10b: lconst_0
      // 10c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaab J
      // 10f: aload 0
      // 110: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 113: ldc_w -2056749837
      // 116: ldc_w -821443332
      // 119: ldc_w -848768518
      // 11c: ixor
      // 11d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 120: ldc2_w 9019898539715798911
      // 123: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 126: aaload
      // 127: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 12a: aload 0
      // 12b: aload 3
      // 12c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)Ljava/lang/String;
      // 12f: astore 7
      // 131: astore 6
      // 133: new java/lang/StringBuilder
      // 136: dup
      // 137: invokespecial java/lang/StringBuilder.<init> ()V
      // 13a: aload 6
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13f: aload 7
      // 141: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 144: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 147: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baba Ljava/lang/String;
      // 14a: aload 0
      // 14b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbabb ()Ljava/util/Map;
      // 14e: areturn
   }

   private void baaab(baababab param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abaa ()Ljava/nio/file/Path;
      // 08: astore 3
      // 09: iload 2
      // 0a: ifne 7a
      // 0d: aload 3
      // 0e: ifnonnull 38
      // 11: goto 15
      // 14: athrow
      // 15: new java/lang/IllegalStateException
      // 18: dup
      // 19: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 1c: ldc_w -2056749838
      // 1f: ldc_w 1979766865
      // 22: ldc_w 1618331062
      // 25: ixor
      // 26: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 29: ldc2_w 8176974664949328303
      // 2c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 2f: aaload
      // 30: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 33: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 36: athrow
      // 37: athrow
      // 38: aload 3
      // 39: bipush 0
      // 3a: anewarray 2979
      // 3d: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 40: pop
      // 41: aload 3
      // 42: aload 1
      // 43: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ab Ljava/lang/String;
      // 46: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 49: bipush 3
      // 4a: aaload
      // 4b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 4e: astore 6
      // 50: astore 5
      // 52: new java/lang/StringBuilder
      // 55: dup
      // 56: invokespecial java/lang/StringBuilder.<init> ()V
      // 59: aload 5
      // 5b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 5e: aload 6
      // 60: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 63: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 66: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 6b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abb Lcom/google/gson/Gson;
      // 6e: aload 1
      // 6f: invokevirtual com/google/gson/Gson.toJson (Ljava/lang/Object;)Ljava/lang/String;
      // 72: bipush 0
      // 73: anewarray 2992
      // 76: invokestatic java/nio/file/Files.writeString (Ljava/nio/file/Path;Ljava/lang/CharSequence;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;
      // 79: pop
      // 7a: goto ae
      // 7d: astore 4
      // 7f: new java/lang/IllegalStateException
      // 82: dup
      // 83: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 86: bipush 5
      // 87: aaload
      // 88: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 8b: aload 4
      // 8d: invokevirtual java/io/IOException.getMessage ()Ljava/lang/String;
      // 90: astore 7
      // 92: astore 6
      // 94: new java/lang/StringBuilder
      // 97: dup
      // 98: invokespecial java/lang/StringBuilder.<init> ()V
      // 9b: aload 6
      // 9d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // a0: aload 7
      // a2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // a5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a8: aload 4
      // aa: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // ad: athrow
      // ae: return
   }

   private int baaba(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w 575903274
      // 03: istore 3
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 07: istore 2
      // 08: iload 1
      // 09: iload 2
      // 0a: ifne 5c
      // 0d: ldc_w -2056749839
      // 10: iload 3
      // 11: ldc_w -1035263907
      // 14: ixor
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 18: ldc2_w 5870252835469745603
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 1e: if_icmplt 5b
      // 21: goto 25
      // 24: athrow
      // 25: iload 1
      // 26: iload 2
      // 27: ifne 5c
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ldc_w -2056749840
      // 31: iload 3
      // 32: ldc_w 1293447058
      // 35: ixor
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 39: ldc2_w 1713110305060377005
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 3f: if_icmpge 5b
      // 42: goto 46
      // 45: athrow
      // 46: iload 1
      // 47: ldc_w -2056749833
      // 4a: iload 3
      // 4b: ldc_w 1080877507
      // 4e: ixor
      // 4f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 52: ldc2_w 5870252835469745603
      // 55: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 58: isub
      // 59: ireturn
      // 5a: athrow
      // 5b: iload 1
      // 5c: iload 2
      // 5d: ifne 8e
      // 60: ldc_w -2056749834
      // 63: iload 3
      // 64: ldc_w 784302171
      // 67: ixor
      // 68: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 6b: ldc2_w 1713110305060377005
      // 6e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 71: if_icmpne 7b
      // 74: goto 78
      // 77: athrow
      // 78: bipush 0
      // 79: ireturn
      // 7a: athrow
      // 7b: iload 1
      // 7c: ldc_w -2056749835
      // 7f: iload 3
      // 80: ldc_w 546719246
      // 83: ixor
      // 84: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 87: ldc2_w 7898420243710774702
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 8d: isub
      // 8e: ireturn
   }

   public Map baabb(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 07: astore 3
      // 08: aload 0
      // 09: iload 2
      // 0a: ifne 3c
      // 0d: aload 3
      // 0e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbbb (Lnet/minecraft/class_310;)Z
      // 11: ifne 3b
      // 14: goto 18
      // 17: athrow
      // 18: new java/lang/IllegalStateException
      // 1b: dup
      // 1c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 1f: ldc_w -2056749836
      // 22: ldc_w -339354751
      // 25: ldc_w -374190555
      // 28: ixor
      // 29: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 2c: ldc2_w 6355611668569456896
      // 2f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 32: aaload
      // 33: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 36: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 39: athrow
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 3
      // 3d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 40: aload 1
      // 41: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abb (Lnet/minecraft/class_746;Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;
      // 44: astore 4
      // 46: aload 0
      // 47: aload 4
      // 49: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)V
      // 4c: aload 0
      // 4d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aabab ()V
      // 50: aload 0
      // 51: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbabb ()Ljava/util/Map;
      // 54: areturn
   }

   private static int[] babaa() {
      int var4 = 640805450;
      int var0 = baaa(a(-2056749877, var4 ^ 2043104580), 4656597249682772202L);
      int var10000 = a(-2056749878, var4 ^ 913276115);
      int[] var1 = new int[var0];
      int var2 = 0;
      int var3 = baaa(var10000, 1615664887281165654L);

      try {
         while (var3 < baaa(a(-2056749879, var4 ^ 1078494628), 5615163272962910687L)) {
            var1[var2++] = var3++;
         }
      } catch (IllegalStateException var6) {
         throw var6;
      }

      var3 = 0;

      try {
         while (var3 < baaa(a(-2056749880, var4 ^ 748042674), 7898420243710774702L)) {
            var1[var2++] = baaa(a(-2056749873, var4 ^ -2069512051), 5870252835469745603L) + var3;
            var3++;
         }
      } catch (IllegalStateException var5) {
         throw var5;
      }

      var1[var2] = baaa(a(-2056749874, var4 ^ 1632940267), 2668385269895063160L);
      return var1;
   }

   private baababab babab(Path var1) {
      return this.aaab(var1);
   }

   private Path babba(String param1) {
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
      // 05: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abaa ()Ljava/nio/file/Path;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifne 1b
      // 0e: ifnonnull 1a
      // 11: goto 15
      // 14: athrow
      // 15: aconst_null
      // 16: goto 41
      // 19: athrow
      // 1a: aload 3
      // 1b: aload 1
      // 1c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 1f: bipush 3
      // 20: aaload
      // 21: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 24: astore 5
      // 26: astore 4
      // 28: new java/lang/StringBuilder
      // 2b: dup
      // 2c: invokespecial java/lang/StringBuilder.<init> ()V
      // 2f: aload 4
      // 31: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 34: aload 5
      // 36: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 39: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3c: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 41: areturn
   }

   public String babbb() {
      return this.baba;
   }

   private Map bbaaa(baababab param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: new java/util/HashMap
      // 07: dup
      // 08: invokespecial java/util/HashMap.<init> ()V
      // 0b: astore 3
      // 0c: aload 1
      // 0d: iload 2
      // 0e: ifne 19
      // 11: ifnull 27
      // 14: goto 18
      // 17: athrow
      // 18: aload 1
      // 19: iload 2
      // 1a: ifne 2b
      // 1d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 20: ifnonnull 2a
      // 23: goto 27
      // 26: athrow
      // 27: aload 3
      // 28: areturn
      // 29: athrow
      // 2a: aload 1
      // 2b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.a Ljava/util/List;
      // 2e: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 33: astore 4
      // 35: aload 4
      // 37: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3c: ifeq 81
      // 3f: aload 4
      // 41: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 46: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa
      // 49: astore 5
      // 4b: aload 5
      // 4d: ifnull 7d
      // 50: aload 0
      // 51: iload 2
      // 52: ifne 7c
      // 55: goto 59
      // 58: athrow
      // 59: aload 5
      // 5b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // 5e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaabba (I)Z
      // 61: ifeq 7d
      // 64: goto 68
      // 67: athrow
      // 68: aload 3
      // 69: aload 5
      // 6b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // 6e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 71: aload 5
      // 73: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 78: goto 7c
      // 7b: athrow
      // 7c: pop
      // 7d: iload 2
      // 7e: ifeq 35
      // 81: aload 3
      // 82: areturn
   }

   private Map bbaab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new java/util/LinkedHashMap
      // 03: dup
      // 04: invokespecial java/util/LinkedHashMap.<init> ()V
      // 07: astore 2
      // 08: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 0b: aload 2
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 0f: ldc_w -2056749875
      // 12: ldc_w 1560772288
      // 15: ldc_w 36343183
      // 18: ixor
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 1c: ldc2_w 4219737466822730342
      // 1f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 22: aaload
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 26: aload 0
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba Z
      // 2a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 32: pop
      // 33: istore 1
      // 34: aload 2
      // 35: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 38: ldc_w -2056749876
      // 3b: ldc_w 1560772288
      // 3e: ldc_w -1530081805
      // 41: ixor
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 45: ldc2_w 3472534397667021421
      // 48: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 4b: aaload
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 4f: aload 0
      // 50: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bba Ljava/lang/String;
      // 53: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 58: pop
      // 59: aload 2
      // 5a: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 5d: ldc_w -2056749885
      // 60: ldc_w 1560772288
      // 63: ldc_w 1748737588
      // 66: ixor
      // 67: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 6a: ldc2_w 7898420243710774702
      // 6d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 70: aaload
      // 71: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 74: aload 0
      // 75: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baba Ljava/lang/String;
      // 78: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 7d: pop
      // 7e: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 81: astore 3
      // 82: aload 0
      // 83: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba Z
      // 86: ifeq b0
      // 89: aload 3
      // 8a: iload 1
      // 8b: ifne 9a
      // 8e: goto 92
      // 91: athrow
      // 92: ifnull b0
      // 95: goto 99
      // 98: athrow
      // 99: aload 3
      // 9a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9d: ifnull b0
      // a0: aload 0
      // a1: aload 3
      // a2: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a5: aload 0
      // a6: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;
      // a9: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abab (Lnet/minecraft/class_746;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)I
      // ac: goto b1
      // af: athrow
      // b0: bipush 0
      // b1: istore 4
      // b3: aload 2
      // b4: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // b7: ldc_w -2056749886
      // ba: ldc_w 1560772288
      // bd: ldc_w 714639694
      // c0: ixor
      // c1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // c4: ldc2_w 5043563558624618379
      // c7: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // ca: aaload
      // cb: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // ce: iload 4
      // d0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // d3: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // d8: pop
      // d9: aload 2
      // da: areturn
   }

   @Override
   public void aabaa() {
      this.bbba(
         class_310.method_1551(), aabbaaaba.abba(baaa[baaa(a(-2056749887, 370127378 ^ -380902188), 8573207836930822826L)])
      );
      this.aba.clear();
   }

   private boolean bbaba(class_1799 param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 3
      // 04: aload 1
      // 05: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 08: ifne 33
      // 0b: aload 2
      // 0c: iload 3
      // 0d: ifne 1c
      // 10: goto 14
      // 13: athrow
      // 14: ifnull 33
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 2
      // 1c: aload 0
      // 1d: aload 1
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abba (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 21: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 24: iload 3
      // 25: ifne 30
      // 28: ifeq 33
      // 2b: goto 2f
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   private Map bbabb() {
      LinkedHashMap var2 = new LinkedHashMap();
      var2.put(aabbaaaba.abba(baaa[baaa(a(-2056749888, 956939544 ^ -869766785), 1399851961515674778L)]), true);
      ArrayList var3 = new ArrayList();
      int var10000 = baaabbaa.bba;
      Iterator var4 = this.bb().iterator();
      int var1 = var10000;

      while (true) {
         if (var4.hasNext()) {
            baababab var6 = (baababab)var4.next();
            if (var1 != 0) {
               break;
            }

            baababab var5 = var6;
            var3.add(this.baab(var5));
            if (var1 == 0) {
               continue;
            }
         }

         var2.put(aabbaaaba.abba(baaa[baaa(a(-2056749881, 956939544 ^ -114162374), 6981805607312710988L)]), var3);
         var2.put(aabbaaaba.abba(baaa[baaa(a(-2056749882, 956939544 ^ 1723794758), 3571308371759667507L)]), this.bbaab());
         break;
      }

      return var2;
   }

   public Map bbbaa(String param1, class_306 param2) {
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
      // 05: aload 1
      // 06: aload 2
      // 07: iload 3
      // 08: ifne 1b
      // 0b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 0e: ifeq 1a
      // 11: goto 15
      // 14: athrow
      // 15: aconst_null
      // 16: goto 1e
      // 19: athrow
      // 1a: aload 2
      // 1b: invokevirtual net/minecraft/class_3675$class_306.method_1441 ()Ljava/lang/String;
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaabaa (Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
      // 21: areturn
   }

   private String bbbab(baababab param1) {
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
      // 05: aload 1
      // 06: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)Lnet/minecraft/class_3675$class_306;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 23
      // 0f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaaaa (Lnet/minecraft/class_3675$class_306;)Z
      // 12: ifeq 22
      // 15: goto 19
      // 18: athrow
      // 19: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 1c: bipush 1
      // 1d: aaload
      // 1e: goto 26
      // 21: athrow
      // 22: aload 3
      // 23: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbb (Lnet/minecraft/class_3675$class_306;)Ljava/lang/String;
      // 26: areturn
   }

   private static String b(int var0, byte var1, byte var2, char var3, short var4) {
      int var9 = var0 ^ 1270891583;
      char[] var8 = aaabb[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aabaa[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         aabaa[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 957;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ var7 ^ 22460 ^ var3 ^ var4 ^ var1 ^ var0 ^ var2 ^ var6);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   private void bbbba(class_310 param1) {
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
      // 06: ifne 67
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baa Z
      // 0c: ifeq 66
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: iload 2
      // 15: ifne 24
      // 18: goto 1c
      // 1b: athrow
      // 1c: ifnull 61
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: iload 2
      // 25: ifne 37
      // 28: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 2b: ifnull 61
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3e: ifnull 61
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 4d: new net/minecraft/class_2815
      // 50: dup
      // 51: aload 1
      // 52: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 55: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 58: getfield net/minecraft/class_1723.field_7763 I
      // 5b: invokespecial net/minecraft/class_2815.<init> (I)V
      // 5e: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 61: aload 0
      // 62: bipush 0
      // 63: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baa Z
      // 66: aload 0
      // 67: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbab Z
      // 6a: ifne 6f
      // 6d: return
      // 6e: athrow
      // 6f: aload 1
      // 70: iload 2
      // 71: ifne 7c
      // 74: ifnull 96
      // 77: goto 7b
      // 7a: athrow
      // 7b: aload 1
      // 7c: iload 2
      // 7d: ifne 92
      // 80: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 83: instanceof net/minecraft/class_490
      // 86: ifeq 96
      // 89: goto 8d
      // 8c: athrow
      // 8d: aload 1
      // 8e: goto 92
      // 91: athrow
      // 92: aconst_null
      // 93: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // 96: aload 0
      // 97: bipush 0
      // 98: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbab Z
      // 9b: return
   }

   private String bbbbb(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -18410911
      // 003: istore 9
      // 005: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 008: istore 2
      // 009: aload 1
      // 00a: iload 2
      // 00b: ifne 016
      // 00e: ifnull 024
      // 011: goto 015
      // 014: athrow
      // 015: aload 1
      // 016: iload 2
      // 017: ifne 02e
      // 01a: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 01d: ifeq 027
      // 020: goto 024
      // 023: athrow
      // 024: aconst_null
      // 025: areturn
      // 026: athrow
      // 027: aload 1
      // 028: getstatic net/minecraft/class_9334.field_49651 Lnet/minecraft/class_9331;
      // 02b: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 02e: checkcast net/minecraft/class_1844
      // 031: astore 3
      // 032: aload 3
      // 033: ifnonnull 039
      // 036: aconst_null
      // 037: areturn
      // 038: athrow
      // 039: new java/lang/StringBuilder
      // 03c: dup
      // 03d: invokespecial java/lang/StringBuilder.<init> ()V
      // 040: astore 4
      // 042: aload 3
      // 043: invokevirtual net/minecraft/class_1844.comp_2378 ()Ljava/util/Optional;
      // 046: invokevirtual java/util/Optional.isPresent ()Z
      // 049: ifeq 08c
      // 04c: getstatic net/minecraft/class_7923.field_41179 Lnet/minecraft/class_2378;
      // 04f: aload 3
      // 050: invokevirtual net/minecraft/class_1844.comp_2378 ()Ljava/util/Optional;
      // 053: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 056: checkcast net/minecraft/class_6880
      // 059: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
      // 05e: checkcast net/minecraft/class_1842
      // 061: invokeinterface net/minecraft/class_2378.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 066: astore 5
      // 068: aload 4
      // 06a: aload 5
      // 06c: iload 2
      // 06d: ifne 085
      // 070: ifnonnull 083
      // 073: goto 077
      // 076: athrow
      // 077: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 07a: bipush 2
      // 07b: aaload
      // 07c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 07f: goto 088
      // 082: athrow
      // 083: aload 5
      // 085: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 088: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08b: pop
      // 08c: new java/util/ArrayList
      // 08f: dup
      // 090: invokespecial java/util/ArrayList.<init> ()V
      // 093: astore 5
      // 095: aload 3
      // 096: invokevirtual net/minecraft/class_1844.comp_2380 ()Ljava/util/List;
      // 099: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 09e: astore 6
      // 0a0: aload 6
      // 0a2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0a7: ifeq 0cc
      // 0aa: aload 6
      // 0ac: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0b1: checkcast net/minecraft/class_1293
      // 0b4: astore 7
      // 0b6: aload 5
      // 0b8: iload 2
      // 0b9: ifne 0ce
      // 0bc: aload 7
      // 0be: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0c3: pop
      // 0c4: iload 2
      // 0c5: ifeq 0a0
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: aload 5
      // 0ce: invokeinterface java/util/List.isEmpty ()Z 1
      // 0d3: iload 2
      // 0d4: ifne 1ce
      // 0d7: ifne 1c7
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: aload 5
      // 0e0: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aabba (Lnet/minecraft/class_1293;)Ljava/lang/String;, (Lnet/minecraft/class_1293;)Ljava/lang/String; ]
      // 0e5: invokestatic java/util/Comparator.comparing (Ljava/util/function/Function;)Ljava/util/Comparator;
      // 0e8: invokeinterface java/util/List.sort (Ljava/util/Comparator;)V 2
      // 0ed: aload 4
      // 0ef: ldc_w -2056749950
      // 0f2: iload 9
      // 0f4: ldc_w -1567943028
      // 0f7: ixor
      // 0f8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 0fb: ldc2_w 9134141490467150352
      // 0fe: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 101: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 104: pop
      // 105: bipush 0
      // 106: istore 6
      // 108: iload 6
      // 10a: aload 5
      // 10c: invokeinterface java/util/List.size ()I 1
      // 111: if_icmpge 1c7
      // 114: aload 5
      // 116: iload 6
      // 118: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 11d: checkcast net/minecraft/class_1293
      // 120: astore 7
      // 122: iload 2
      // 123: getstatic net/minecraft/class_7923.field_41174 Lnet/minecraft/class_2378;
      // 126: aload 7
      // 128: invokevirtual net/minecraft/class_1293.method_5579 ()Lnet/minecraft/class_6880;
      // 12b: invokeinterface net/minecraft/class_6880.comp_349 ()Ljava/lang/Object; 1
      // 130: checkcast net/minecraft/class_1291
      // 133: invokeinterface net/minecraft/class_2378.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 138: astore 8
      // 13a: ifne 205
      // 13d: iload 6
      // 13f: ifle 162
      // 142: goto 146
      // 145: athrow
      // 146: aload 4
      // 148: ldc_w -2056749951
      // 14b: iload 9
      // 14d: ldc_w -1116885091
      // 150: ixor
      // 151: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 154: ldc2_w 7173665647413341756
      // 157: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 15a: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 15d: pop
      // 15e: goto 162
      // 161: athrow
      // 162: aload 4
      // 164: aload 8
      // 166: iload 2
      // 167: ifne 17f
      // 16a: ifnonnull 17d
      // 16d: goto 171
      // 170: athrow
      // 171: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 174: bipush 2
      // 175: aaload
      // 176: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 179: goto 182
      // 17c: athrow
      // 17d: aload 8
      // 17f: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 182: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 185: ldc_w -2056749952
      // 188: iload 9
      // 18a: ldc_w -1165775734
      // 18d: ixor
      // 18e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 191: ldc2_w 5557890939723507998
      // 194: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 197: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 19a: aload 7
      // 19c: invokevirtual net/minecraft/class_1293.method_5578 ()I
      // 19f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1a2: ldc_w -2056749945
      // 1a5: iload 9
      // 1a7: ldc_w 573988117
      // 1aa: ixor
      // 1ab: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 1ae: ldc2_w 5557890939723507998
      // 1b1: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 1b4: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1b7: aload 7
      // 1b9: invokevirtual net/minecraft/class_1293.method_5584 ()I
      // 1bc: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 1bf: pop
      // 1c0: iload 2
      // 1c1: iinc 6 1
      // 1c4: ifeq 108
      // 1c7: aload 3
      // 1c8: invokevirtual net/minecraft/class_1844.comp_2379 ()Ljava/util/Optional;
      // 1cb: invokevirtual java/util/Optional.isPresent ()Z
      // 1ce: iload 2
      // 1cf: ifne 212
      // 1d2: ifeq 205
      // 1d5: goto 1d9
      // 1d8: athrow
      // 1d9: aload 4
      // 1db: ldc_w -2056749946
      // 1de: iload 9
      // 1e0: ldc_w 928139106
      // 1e3: ixor
      // 1e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 1e7: ldc2_w 4530959452799390277
      // 1ea: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 1ed: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 1f0: aload 3
      // 1f1: invokevirtual net/minecraft/class_1844.comp_2379 ()Ljava/util/Optional;
      // 1f4: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 1f7: checkcast java/lang/Integer
      // 1fa: invokevirtual java/lang/Integer.intValue ()I
      // 1fd: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 200: pop
      // 201: goto 205
      // 204: athrow
      // 205: aload 4
      // 207: iload 2
      // 208: ifne 21c
      // 20b: invokevirtual java/lang/StringBuilder.length ()I
      // 20e: goto 212
      // 211: athrow
      // 212: ifne 21a
      // 215: aconst_null
      // 216: goto 21f
      // 219: athrow
      // 21a: aload 4
      // 21c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 21f: areturn
   }

   private static long aaaaaa(baababab var0) {
      return var0.b;
   }

   private static long aaaaab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-2056749947, -1520807564 ^ 56776448)) & a(-2056749948, -1520807564 ^ -1095757304);
      if (babb[var3] == null) {
         babb[var3] = aaba[var3] ^ var1;
      }

      return babb[var3];
   }

   private List aaaaba() {
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
      // 06: ifne 3b
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaa Ljava/util/List;
      // 0c: ifnull 36
      // 0f: goto 13
      // 12: athrow
      // 13: invokestatic java/lang/System.currentTimeMillis ()J
      // 16: aload 0
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bab J
      // 1a: lsub
      // 1b: ldc_w -2056749925
      // 1e: ldc_w -673666445
      // 21: ldc_w -1457525113
      // 24: ixor
      // 25: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 28: ldc2_w 7954544784378205410
      // 2b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaaab (IJ)J
      // 2e: lcmp
      // 2f: ifle 3e
      // 32: goto 36
      // 35: athrow
      // 36: aload 0
      // 37: goto 3b
      // 3a: athrow
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aabab ()V
      // 3e: aload 0
      // 3f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaa Ljava/util/List;
      // 42: areturn
   }

   private int aaaabb(class_746 param1, Map param2, aaaabaaa param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush -1
      // 01: istore 5
      // 03: ldc_w -2056749926
      // 06: ldc_w -94029017
      // 09: ldc_w 1461957838
      // 0c: ixor
      // 0d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 10: ldc2_w 3897381353822591392
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 16: istore 6
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbbb [I
      // 1b: astore 7
      // 1d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 20: aload 7
      // 22: arraylength
      // 23: istore 8
      // 25: istore 4
      // 27: bipush 0
      // 28: istore 9
      // 2a: iload 9
      // 2c: iload 8
      // 2e: if_icmpge df
      // 31: aload 7
      // 33: iload 9
      // 35: iaload
      // 36: iload 4
      // 38: ifne e1
      // 3b: istore 10
      // 3d: iload 10
      // 3f: aload 3
      // 40: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.aaa I
      // 43: if_icmpne 4a
      // 46: goto d7
      // 49: athrow
      // 4a: aload 0
      // 4b: aload 1
      // 4c: iload 10
      // 4e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aaaab (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 51: astore 11
      // 53: iload 4
      // 55: ifne da
      // 58: aload 0
      // 59: aload 11
      // 5b: aload 3
      // 5c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aa (Lnet/minecraft/class_1799;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa;)Z
      // 5f: ifeq d7
      // 62: goto 66
      // 65: athrow
      // 66: aload 0
      // 67: aload 11
      // 69: iload 10
      // 6b: aload 2
      // 6c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aba (Lnet/minecraft/class_1799;ILjava/util/Map;)Z
      // 6f: iload 4
      // 71: ifne a3
      // 74: goto 78
      // 77: athrow
      // 78: ifeq 82
      // 7b: goto 7f
      // 7e: athrow
      // 7f: goto d7
      // 82: ldc_w -2056749927
      // 85: ldc_w -94029017
      // 88: ldc_w -1434029993
      // 8b: ixor
      // 8c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 8f: ldc2_w 1940779355011943447
      // 92: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 95: aload 11
      // 97: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 9a: aload 3
      // 9b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabaaa.a I
      // 9e: isub
      // 9f: invokestatic java/lang/Math.abs (I)I
      // a2: isub
      // a3: istore 12
      // a5: aload 2
      // a6: iload 10
      // a8: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // ab: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // b0: iload 4
      // b2: ifne c1
      // b5: ifne bf
      // b8: goto bc
      // bb: athrow
      // bc: iinc 12 100
      // bf: iload 12
      // c1: iload 4
      // c3: ifne d5
      // c6: iload 6
      // c8: if_icmple d7
      // cb: goto cf
      // ce: athrow
      // cf: iload 12
      // d1: istore 6
      // d3: iload 10
      // d5: istore 5
      // d7: iinc 9 1
      // da: iload 4
      // dc: ifeq 2a
      // df: iload 5
      // e1: ireturn
   }

   public Map aaabaa(String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.ba (Ljava/lang/String;)Ljava/lang/String;
      // 009: astore 4
      // 00b: aload 4
      // 00d: invokevirtual java/lang/String.isBlank ()Z
      // 010: ifeq 036
      // 013: new java/lang/IllegalArgumentException
      // 016: dup
      // 017: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 01a: ldc_w -2056749928
      // 01d: ldc_w -1609172831
      // 020: ldc_w 2120015453
      // 023: ixor
      // 024: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 027: ldc2_w 8162273387296578000
      // 02a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 02d: aaload
      // 02e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 031: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 034: athrow
      // 035: athrow
      // 036: aload 0
      // 037: aload 4
      // 039: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.abbab (Ljava/lang/String;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;
      // 03c: astore 5
      // 03e: aload 5
      // 040: ifnonnull 066
      // 043: new java/lang/IllegalArgumentException
      // 046: dup
      // 047: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 04a: ldc_w -2056749921
      // 04d: ldc_w -1609172831
      // 050: ldc_w 1007669342
      // 053: ixor
      // 054: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 057: ldc2_w 2245040306305822488
      // 05a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 05d: aaload
      // 05e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 061: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 064: athrow
      // 065: athrow
      // 066: aload 2
      // 067: iload 3
      // 068: ifne 073
      // 06b: ifnull 0ae
      // 06e: goto 072
      // 071: athrow
      // 072: aload 2
      // 073: iload 3
      // 074: ifne 0a7
      // 077: invokevirtual java/lang/String.isBlank ()Z
      // 07a: ifne 0ae
      // 07d: goto 081
      // 080: athrow
      // 081: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 084: ldc_w -2056749922
      // 087: ldc_w -1609172831
      // 08a: ldc_w -908861339
      // 08d: ixor
      // 08e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 091: ldc2_w 8481537014583640880
      // 094: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 097: aaload
      // 098: iload 3
      // 099: ifne 0bd
      // 09c: goto 0a0
      // 09f: athrow
      // 0a0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0a3: goto 0a7
      // 0a6: athrow
      // 0a7: aload 2
      // 0a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ab: ifeq 0bc
      // 0ae: aload 5
      // 0b0: aconst_null
      // 0b1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ba Ljava/lang/String;
      // 0b4: iload 3
      // 0b5: ifeq 10a
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: aload 2
      // 0bd: invokestatic net/minecraft/class_3675.method_15981 (Ljava/lang/String;)Lnet/minecraft/class_3675$class_306;
      // 0c0: pop
      // 0c1: goto 104
      // 0c4: astore 6
      // 0c6: aload 6
      // 0c8: pop
      // 0c9: new java/lang/IllegalArgumentException
      // 0cc: dup
      // 0cd: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa [Ljava/lang/String;
      // 0d0: ldc_w -2056749923
      // 0d3: ldc_w -1609172831
      // 0d6: ldc_w -509685937
      // 0d9: ixor
      // 0da: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 0dd: ldc2_w 5523309202443545002
      // 0e0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 0e3: aaload
      // 0e4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 0e7: aload 2
      // 0e8: astore 8
      // 0ea: astore 7
      // 0ec: new java/lang/StringBuilder
      // 0ef: dup
      // 0f0: invokespecial java/lang/StringBuilder.<init> ()V
      // 0f3: aload 7
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0f8: aload 8
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0fd: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 100: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 103: athrow
      // 104: aload 5
      // 106: aload 2
      // 107: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab.ba Ljava/lang/String;
      // 10a: aload 0
      // 10b: aload 5
      // 10d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baababab;)V
      // 110: aload 0
      // 111: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aabab ()V
      // 114: aload 0
      // 115: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.aba Ljava/util/Map;
      // 118: aload 4
      // 11a: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 11f: pop
      // 120: aload 0
      // 121: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.bbabb ()Ljava/util/Map;
      // 124: areturn
   }

   private void aaabab(class_310 param1, class_746 param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 5
      // 05: aload 2
      // 06: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 09: getfield net/minecraft/class_1723.field_7763 I
      // 0c: istore 6
      // 0e: iload 3
      // 0f: iload 5
      // 11: ifne 54
      // 14: ldc_w -2056749924
      // 17: ldc_w 464849836
      // 1a: ldc_w -1639465277
      // 1d: ixor
      // 1e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 21: ldc2_w 1713110305060377005
      // 24: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 27: if_icmpne 52
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 1
      // 2f: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 32: iload 6
      // 34: iload 4
      // 36: ldc_w -2056749933
      // 39: ldc_w 464849836
      // 3c: ldc_w 114102296
      // 3f: ixor
      // 40: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 43: ldc2_w 7183833297726486337
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 49: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
      // 4c: aload 2
      // 4d: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 50: return
      // 51: athrow
      // 52: iload 4
      // 54: iload 5
      // 56: ifne c8
      // 59: ldc_w -2056749934
      // 5c: ldc_w 464849836
      // 5f: ldc_w -1877830942
      // 62: ixor
      // 63: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 66: ldc2_w 1713110305060377005
      // 69: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 6c: if_icmpne 96
      // 6f: goto 73
      // 72: athrow
      // 73: aload 1
      // 74: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 77: iload 6
      // 79: iload 3
      // 7a: ldc_w -2056749935
      // 7d: ldc_w 464849836
      // 80: ldc_w 1468232321
      // 83: ixor
      // 84: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 87: ldc2_w 4048752012138612410
      // 8a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 8d: getstatic net/minecraft/class_1713.field_7791 Lnet/minecraft/class_1713;
      // 90: aload 2
      // 91: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 94: return
      // 95: athrow
      // 96: aload 1
      // 97: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 9a: iload 6
      // 9c: iload 3
      // 9d: bipush 0
      // 9e: iload 5
      // a0: ifne d7
      // a3: getstatic net/minecraft/class_1713.field_7790 Lnet/minecraft/class_1713;
      // a6: aload 2
      // a7: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // aa: aload 1
      // ab: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // ae: iload 6
      // b0: iload 4
      // b2: bipush 0
      // b3: getstatic net/minecraft/class_1713.field_7790 Lnet/minecraft/class_1713;
      // b6: aload 2
      // b7: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // ba: aload 2
      // bb: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // be: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // c1: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // c4: goto c8
      // c7: athrow
      // c8: ifne de
      // cb: aload 1
      // cc: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // cf: iload 6
      // d1: iload 3
      // d2: bipush 0
      // d3: goto d7
      // d6: athrow
      // d7: getstatic net/minecraft/class_1713.field_7790 Lnet/minecraft/class_1713;
      // da: aload 2
      // db: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // de: return
   }

   private boolean aaabba(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w 1980357930
      // 03: istore 3
      // 04: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 07: istore 2
      // 08: iload 1
      // 09: iload 2
      // 0a: ifne 4b
      // 0d: ldc_w -2056749936
      // 10: iload 3
      // 11: ldc_w -390404722
      // 14: ixor
      // 15: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 18: ldc2_w 7898420243710774702
      // 1b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 1e: if_icmplt 46
      // 21: goto 25
      // 24: athrow
      // 25: iload 1
      // 26: iload 2
      // 27: ifne ae
      // 2a: goto 2e
      // 2d: athrow
      // 2e: ldc_w -2056749929
      // 31: iload 3
      // 32: ldc_w 216726635
      // 35: ixor
      // 36: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 39: ldc2_w 5870252835469745603
      // 3c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 3f: if_icmplt a9
      // 42: goto 46
      // 45: athrow
      // 46: iload 1
      // 47: goto 4b
      // 4a: athrow
      // 4b: iload 2
      // 4c: ifne 8d
      // 4f: ldc_w -2056749930
      // 52: iload 3
      // 53: ldc_w 1758769485
      // 56: ixor
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 5a: ldc2_w 5870252835469745603
      // 5d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 60: if_icmplt 88
      // 63: goto 67
      // 66: athrow
      // 67: iload 1
      // 68: iload 2
      // 69: ifne ae
      // 6c: goto 70
      // 6f: athrow
      // 70: ldc_w -2056749931
      // 73: iload 3
      // 74: ldc_w 1684238069
      // 77: ixor
      // 78: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 7b: ldc2_w 1713110305060377005
      // 7e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // 81: if_icmplt a9
      // 84: goto 88
      // 87: athrow
      // 88: iload 1
      // 89: goto 8d
      // 8c: athrow
      // 8d: iload 2
      // 8e: ifne ae
      // 91: ldc_w -2056749932
      // 94: iload 3
      // 95: ldc_w -1484515441
      // 98: ixor
      // 99: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.a (II)I
      // 9c: ldc2_w 1713110305060377005
      // 9f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabab.baaa (IJ)I
      // a2: if_icmpne b1
      // a5: goto a9
      // a8: athrow
      // a9: bipush 1
      // aa: goto ae
      // ad: athrow
      // ae: goto b2
      // b1: bipush 0
      // b2: ireturn
   }
}
