package nsc;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class baabbbaa extends abbaabbaa {
   private final abbaaaaa ba;
   private boolean aaa;
   private static final String[] aab;
   private static final ababbbbaa bb;
   private aaaaabab aba;
   private static final ababbbbaa abb;
   private long baa;
   private static final ababbbbaa ab;
   private final baabaab bab;
   private static final ababbbbaa bba;
   private int bbb;
   private static final List aaaa;
   private final abaabbbb aaab;
   private final aaabbbab aaba;
   private long aabb;
   private boolean abaa;
   private long abab;
   private boolean abba;
   private static final Long[] abbb;
   private class_2338 baaa;
   private int baab;
   private long baba;
   private static final ababbbbaa aa;
   private static final String[] baabb;
   private static final ababbbbaa babb;
   private final abbaaaaa bbaa;
   private static final long[] bbab;
   private boolean bbba;
   private static final Object[] babaa;
   private static final double bbbb = 0.1;
   private class_3965 aaaaa;
   private class_239 aaaab;
   private final aaabbbab aaaba;
   private static final long[] aaabb;
   private static final Integer[] aabaa;
   private int aabab;
   private final abbaaaaa aabba;
   private static final ababbbbaa aabbb;
   private long abaaa;
   private class_3965 abaab;
   private static final int[] baaba;
   private static final double ababa = 0.1;
   private int ababb;
   private static final int abbaa;
   private static final int abbab = 1;
   private static final ababbbbaa abbba;
   private long abbbb;
   private static final String[] baaaa;
   private static final long baaab;

   private static long aa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-879059642, 1499605104 ^ 1203565820)) & a(-879059641, 1499605104 ^ -805051670);
      if (abbb[var3] == null) {
         abbb[var3] = bbab[var3] ^ var1;
      }

      return abbb[var3];
   }

   @Override
   public void abbbab(JsonObject var1) {
      int var2 = -9350130;
      this.ab(var1);
      super.abbbab(var1);
      this.bbabaaa(var1, babb.abab(), new aaabbbab[]{this.aaba, this.aaaba});
      this.bbabaaa(
         var1,
         aabbaaaba.abba(abbab(a(-879059644, var2 ^ 1598346216), a(-879059643, var2 ^ -1848906484))),
         new aaabbbab[]{this.aaba}
      );
      this.bbabaaa(
         var1,
         aabbaaaba.abba(abbab(a(-879059646, var2 ^ 106626601), a(-879059645, var2 ^ -1430231360))),
         new aaabbbab[]{this.aaaba}
      );
      this.bbabaaa(
         var1,
         aabbaaaba.abba(abbab(a(-879059648, var2 ^ -554442400), a(-879059647, var2 ^ -874331464))),
         new aaabbbab[]{this.aaaba}
      );
      this.bbabaaa(
         var1,
         aabbaaaba.abba(abbab(a(-879059634, var2 ^ 1229114228), a(-879059633, var2 ^ -97291507))),
         new aaabbbab[]{this.aaaba}
      );
   }

   private void ab(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 011
      // 009: ifnull 039
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: iload 2
      // 012: ifne 059
      // 015: ldc -879059636
      // 017: ldc 697584547
      // 019: ldc -1101663399
      // 01b: ixor
      // 01c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.a (II)I
      // 01f: ldc -879059635
      // 021: ldc 697584547
      // 023: ldc 2107685021
      // 025: ixor
      // 026: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.a (II)I
      // 029: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbab (II)Ljava/lang/String;
      // 02c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 02f: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 032: ifne 03b
      // 035: goto 039
      // 038: athrow
      // 039: return
      // 03a: athrow
      // 03b: aload 1
      // 03c: ldc -879059638
      // 03e: ldc 697584547
      // 040: ldc -641985557
      // 042: ixor
      // 043: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.a (II)I
      // 046: ldc -879059637
      // 048: ldc 697584547
      // 04a: ldc 656444571
      // 04c: ixor
      // 04d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.a (II)I
      // 050: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbab (II)Ljava/lang/String;
      // 053: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 056: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 059: astore 3
      // 05a: aload 3
      // 05b: iload 2
      // 05c: ifne 071
      // 05f: ifnonnull 067
      // 062: goto 066
      // 065: athrow
      // 066: return
      // 067: aload 3
      // 068: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 06b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 06e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbbbab (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 071: astore 4
      // 073: aload 3
      // 074: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 077: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 07a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbbbab (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 07d: astore 5
      // 07f: aload 3
      // 080: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 083: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 086: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbbbab (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 089: astore 6
      // 08b: aload 3
      // 08c: iload 2
      // 08d: ifne 15d
      // 090: aload 0
      // 091: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 094: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.baab ()J
      // 097: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbbbab (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 09a: ifnonnull 15b
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: aload 4
      // 0a3: iload 2
      // 0a4: ifne 0b4
      // 0a7: goto 0ab
      // 0aa: athrow
      // 0ab: ifnonnull 0c5
      // 0ae: goto 0b2
      // 0b1: athrow
      // 0b2: aload 5
      // 0b4: iload 2
      // 0b5: ifne 0c1
      // 0b8: ifnonnull 0c5
      // 0bb: goto 0bf
      // 0be: athrow
      // 0bf: aload 6
      // 0c1: ifnonnull 0c5
      // 0c4: return
      // 0c5: new com/google/gson/JsonArray
      // 0c8: dup
      // 0c9: invokespecial com/google/gson/JsonArray.<init> ()V
      // 0cc: astore 7
      // 0ce: aload 4
      // 0d0: iload 2
      // 0d1: ifne 0ef
      // 0d4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbabb (Lcom/google/gson/JsonElement;)Z
      // 0d7: ifeq 0ed
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: aload 7
      // 0e0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 0e3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 0e6: invokevirtual com/google/gson/JsonArray.add (Ljava/lang/String;)V
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: aload 5
      // 0ef: iload 2
      // 0f0: ifne 10e
      // 0f3: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbabb (Lcom/google/gson/JsonElement;)Z
      // 0f6: ifeq 10c
      // 0f9: goto 0fd
      // 0fc: athrow
      // 0fd: aload 7
      // 0ff: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 102: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 105: invokevirtual com/google/gson/JsonArray.add (Ljava/lang/String;)V
      // 108: goto 10c
      // 10b: athrow
      // 10c: aload 6
      // 10e: bipush 1
      // 10f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbbaa (Lcom/google/gson/JsonElement;Z)Z
      // 112: ifeq 124
      // 115: aload 7
      // 117: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 11a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 11d: invokevirtual com/google/gson/JsonArray.add (Ljava/lang/String;)V
      // 120: goto 124
      // 123: athrow
      // 124: aload 7
      // 126: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 129: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 12c: invokevirtual com/google/gson/JsonArray.add (Ljava/lang/String;)V
      // 12f: aload 3
      // 130: aload 0
      // 131: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 134: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.baab ()J
      // 137: aload 7
      // 139: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bababbb (Lcom/google/gson/JsonObject;JLcom/google/gson/JsonElement;)V
      // 13c: aload 3
      // 13d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 140: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 143: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaabaa (Lcom/google/gson/JsonObject;J)V
      // 146: aload 3
      // 147: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabbb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 14a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 14d: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaabaa (Lcom/google/gson/JsonObject;J)V
      // 150: aload 3
      // 151: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 154: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 157: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaabaa (Lcom/google/gson/JsonObject;J)V
      // 15a: return
      // 15b: aload 6
      // 15d: iload 2
      // 15e: ifne 16a
      // 161: ifnull 2e2
      // 164: goto 168
      // 167: athrow
      // 168: aload 6
      // 16a: iload 2
      // 16b: ifne 17e
      // 16e: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 171: ifeq 2e2
      // 174: goto 178
      // 177: athrow
      // 178: aload 6
      // 17a: goto 17e
      // 17d: athrow
      // 17e: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 181: invokevirtual com/google/gson/JsonPrimitive.isBoolean ()Z
      // 184: ifeq 2e2
      // 187: aload 0
      // 188: aload 3
      // 189: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbb (Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonArray;
      // 18c: astore 7
      // 18e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 191: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 194: astore 8
      // 196: bipush 0
      // 197: istore 9
      // 199: aload 7
      // 19b: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 19e: astore 10
      // 1a0: aload 10
      // 1a2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1a7: ifeq 209
      // 1aa: aload 10
      // 1ac: iload 2
      // 1ad: ifne 2f9
      // 1b0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1b5: checkcast com/google/gson/JsonElement
      // 1b8: astore 11
      // 1ba: aload 11
      // 1bc: iload 2
      // 1bd: ifne 1d0
      // 1c0: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 1c3: ifeq 201
      // 1c6: goto 1ca
      // 1c9: athrow
      // 1ca: aload 11
      // 1cc: goto 1d0
      // 1cf: athrow
      // 1d0: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 1d3: invokevirtual com/google/gson/JsonPrimitive.isString ()Z
      // 1d6: iload 2
      // 1d7: ifne 1ef
      // 1da: ifeq 201
      // 1dd: goto 1e1
      // 1e0: athrow
      // 1e1: aload 8
      // 1e3: aload 11
      // 1e5: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 1e8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1eb: goto 1ef
      // 1ee: athrow
      // 1ef: iload 2
      // 1f0: ifne 1fb
      // 1f3: ifeq 201
      // 1f6: goto 1fa
      // 1f9: athrow
      // 1fa: bipush 1
      // 1fb: istore 9
      // 1fd: iload 2
      // 1fe: ifeq 209
      // 201: iload 2
      // 202: ifeq 1a0
      // 205: goto 209
      // 208: athrow
      // 209: aload 6
      // 20b: iload 2
      // 20c: ifne 23f
      // 20f: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 212: ifeq 239
      // 215: goto 219
      // 218: athrow
      // 219: iload 9
      // 21b: iload 2
      // 21c: ifne 242
      // 21f: goto 223
      // 222: athrow
      // 223: ifne 239
      // 226: goto 22a
      // 229: athrow
      // 22a: aload 7
      // 22c: aload 8
      // 22e: invokevirtual com/google/gson/JsonArray.add (Ljava/lang/String;)V
      // 231: iload 2
      // 232: ifeq 2cb
      // 235: goto 239
      // 238: athrow
      // 239: aload 6
      // 23b: goto 23f
      // 23e: athrow
      // 23f: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 242: iload 2
      // 243: ifne 24f
      // 246: ifne 2cb
      // 249: goto 24d
      // 24c: athrow
      // 24d: iload 9
      // 24f: ifeq 2cb
      // 252: new com/google/gson/JsonArray
      // 255: dup
      // 256: invokespecial com/google/gson/JsonArray.<init> ()V
      // 259: astore 10
      // 25b: aload 7
      // 25d: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 260: astore 11
      // 262: aload 11
      // 264: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 269: ifeq 2c7
      // 26c: aload 11
      // 26e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 273: checkcast com/google/gson/JsonElement
      // 276: astore 12
      // 278: iload 2
      // 279: ifne 2d8
      // 27c: aload 12
      // 27e: iload 2
      // 27f: ifne 296
      // 282: goto 286
      // 285: athrow
      // 286: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 289: ifeq 2b8
      // 28c: goto 290
      // 28f: athrow
      // 290: aload 12
      // 292: goto 296
      // 295: athrow
      // 296: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 299: invokevirtual com/google/gson/JsonPrimitive.isString ()Z
      // 29c: iload 2
      // 29d: ifne 2b5
      // 2a0: ifeq 2b8
      // 2a3: goto 2a7
      // 2a6: athrow
      // 2a7: aload 8
      // 2a9: aload 12
      // 2ab: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 2ae: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2b1: goto 2b5
      // 2b4: athrow
      // 2b5: ifne 2c3
      // 2b8: aload 10
      // 2ba: aload 12
      // 2bc: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 2bf: goto 2c3
      // 2c2: athrow
      // 2c3: iload 2
      // 2c4: ifeq 262
      // 2c7: aload 10
      // 2c9: astore 7
      // 2cb: aload 3
      // 2cc: aload 0
      // 2cd: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 2d0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.baab ()J
      // 2d3: aload 7
      // 2d5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bababbb (Lcom/google/gson/JsonObject;JLcom/google/gson/JsonElement;)V
      // 2d8: aload 3
      // 2d9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 2dc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.bbb ()J
      // 2df: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaabaa (Lcom/google/gson/JsonObject;J)V
      // 2e2: aload 0
      // 2e3: aload 3
      // 2e4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbb (Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonArray;
      // 2e7: astore 7
      // 2e9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 2ec: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa.abab ()Ljava/lang/String;
      // 2ef: astore 8
      // 2f1: bipush 0
      // 2f2: istore 9
      // 2f4: aload 7
      // 2f6: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 2f9: astore 10
      // 2fb: aload 10
      // 2fd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 302: ifeq 368
      // 305: aload 10
      // 307: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 30c: checkcast com/google/gson/JsonElement
      // 30f: astore 11
      // 311: iload 2
      // 312: ifne 385
      // 315: aload 11
      // 317: iload 2
      // 318: ifne 32f
      // 31b: goto 31f
      // 31e: athrow
      // 31f: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 322: ifeq 360
      // 325: goto 329
      // 328: athrow
      // 329: aload 11
      // 32b: goto 32f
      // 32e: athrow
      // 32f: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 332: invokevirtual com/google/gson/JsonPrimitive.isString ()Z
      // 335: iload 2
      // 336: ifne 34e
      // 339: ifeq 360
      // 33c: goto 340
      // 33f: athrow
      // 340: aload 8
      // 342: aload 11
      // 344: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 347: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 34a: goto 34e
      // 34d: athrow
      // 34e: iload 2
      // 34f: ifne 35a
      // 352: ifeq 360
      // 355: goto 359
      // 358: athrow
      // 359: bipush 1
      // 35a: istore 9
      // 35c: iload 2
      // 35d: ifeq 368
      // 360: iload 2
      // 361: ifeq 2fb
      // 364: goto 368
      // 367: athrow
      // 368: iload 9
      // 36a: ifne 385
      // 36d: aload 7
      // 36f: aload 8
      // 371: invokevirtual com/google/gson/JsonArray.add (Ljava/lang/String;)V
      // 374: aload 3
      // 375: aload 0
      // 376: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 379: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.baab ()J
      // 37c: aload 7
      // 37e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bababbb (Lcom/google/gson/JsonObject;JLcom/google/gson/JsonElement;)V
      // 381: goto 385
      // 384: athrow
      // 385: return
   }

   private long ba() {
      return aa(a(-879059640, -2036037555 ^ 704604643), 5134616621861537854L)
         + aa(a(-879059639, -2036037555 ^ -32693290), 2401947537818368754L) * this.bbaab(this.aaba)
         + aa(a(-879059626, -2036037555 ^ -1743762474), 5727719562806725730L) * this.bbaab(this.aaaba);
   }

   private static int a(int var0, int var1) {
      int var2 = baaba[var0 ^ -879059642] ^ var1 ^ var0;
      var2 -= 14283;
      var2 ^= 19662;
      var2 ^= 59133;
      var2 += 46183;
      var2 -= 33107;
      return var2 ^ 13661;
   }

   public boolean bb() {
      try {
         if (this.aba != aaaaabab.bb) {
            return true;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      return false;
   }

   private boolean aaa(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 07: aload 2
      // 08: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0b: astore 4
      // 0d: istore 3
      // 0e: aload 4
      // 10: iload 3
      // 11: ifne 27
      // 14: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
      // 17: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 1a: ifne 82
      // 1d: goto 21
      // 20: athrow
      // 21: aload 4
      // 23: goto 27
      // 26: athrow
      // 27: iload 3
      // 28: ifne 56
      // 2b: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
      // 2e: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 31: ifeq 54
      // 34: goto 38
      // 37: athrow
      // 38: aload 0
      // 39: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 3c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 3f: checkcast java/lang/Boolean
      // 42: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 45: iload 3
      // 46: ifne 5c
      // 49: goto 4d
      // 4c: athrow
      // 4d: ifeq 82
      // 50: goto 54
      // 53: athrow
      // 54: aload 4
      // 56: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 59: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 5c: iload 3
      // 5d: ifne 73
      // 60: ifne 82
      // 63: goto 67
      // 66: athrow
      // 67: aload 0
      // 68: aload 1
      // 69: aload 2
      // 6a: aload 4
      // 6c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baba (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)Z
      // 6f: goto 73
      // 72: athrow
      // 73: iload 3
      // 74: ifne 7f
      // 77: ifne 82
      // 7a: goto 7e
      // 7d: athrow
      // 7e: bipush 1
      // 7f: goto 83
      // 82: bipush 0
      // 83: ireturn
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
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 20
      // 09: aload 1
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bba (Lnet/minecraft/class_310;)V
      // 0d: aload 0
      // 0e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 11: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 14: if_acmpne 23
      // 17: goto 1b
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 20
      // 1f: athrow
      // 20: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 23: return
   }

   private boolean aab(class_310 param1) {
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
      // 09: ifnull 85
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 85
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2b: ifnull 85
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4a
      // 3b: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 3e: ifnull 85
      // 41: goto 45
      // 44: athrow
      // 45: aload 1
      // 46: goto 4a
      // 49: athrow
      // 4a: iload 2
      // 4b: ifne 5d
      // 4e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 51: ifnull 85
      // 54: goto 58
      // 57: athrow
      // 58: aload 1
      // 59: goto 5d
      // 5c: athrow
      // 5d: iload 2
      // 5e: ifne 70
      // 61: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 64: ifnonnull 85
      // 67: goto 6b
      // 6a: athrow
      // 6b: aload 1
      // 6c: goto 70
      // 6f: athrow
      // 70: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 73: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 76: iload 2
      // 77: ifne 82
      // 7a: ifeq 85
      // 7d: goto 81
      // 80: athrow
      // 81: bipush 1
      // 82: goto 86
      // 85: bipush 0
      // 86: ireturn
   }

   public boolean aba(class_310 param1) {
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
      // 006: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aab (Lnet/minecraft/class_310;)Z
      // 009: iload 2
      // 00a: ifne 061
      // 00d: ifeq 05c
      // 010: goto 014
      // 013: athrow
      // 014: aload 0
      // 015: iload 2
      // 016: ifne 035
      // 019: goto 01d
      // 01c: athrow
      // 01d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 020: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 023: if_acmpne 05c
      // 026: goto 02a
      // 029: athrow
      // 02a: aload 0
      // 02b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 02e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 031: goto 035
      // 034: athrow
      // 035: checkcast java/lang/Boolean
      // 038: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03b: iload 2
      // 03c: ifne 06c
      // 03f: ifeq 062
      // 042: goto 046
      // 045: athrow
      // 046: aload 1
      // 047: iload 2
      // 048: ifne 063
      // 04b: goto 04f
      // 04e: athrow
      // 04f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 052: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 055: ifne 062
      // 058: goto 05c
      // 05b: athrow
      // 05c: bipush 0
      // 05d: goto 061
      // 060: athrow
      // 061: ireturn
      // 062: aload 1
      // 063: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 066: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 069: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 06c: iload 2
      // 06d: ifne 0ab
      // 070: ifne 0aa
      // 073: goto 077
      // 076: athrow
      // 077: aload 1
      // 078: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 07b: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 07e: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbba (Lnet/minecraft/class_304;)I
      // 081: iload 2
      // 082: ifne 0ab
      // 085: goto 089
      // 088: athrow
      // 089: ifgt 0aa
      // 08c: goto 090
      // 08f: athrow
      // 090: aload 1
      // 091: aload 1
      // 092: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 095: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 098: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 09b: iload 2
      // 09c: ifne 0ab
      // 09f: goto 0a3
      // 0a2: athrow
      // 0a3: ifeq 0ae
      // 0a6: goto 0aa
      // 0a9: athrow
      // 0aa: bipush 1
      // 0ab: goto 0af
      // 0ae: bipush 0
      // 0af: istore 3
      // 0b0: aload 1
      // 0b1: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0b4: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 0b7: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 0ba: iload 2
      // 0bb: ifne 0f9
      // 0be: ifne 0f8
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: aload 1
      // 0c6: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0c9: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 0cc: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbba (Lnet/minecraft/class_304;)I
      // 0cf: iload 2
      // 0d0: ifne 0f9
      // 0d3: goto 0d7
      // 0d6: athrow
      // 0d7: ifgt 0f8
      // 0da: goto 0de
      // 0dd: athrow
      // 0de: aload 1
      // 0df: aload 1
      // 0e0: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0e3: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 0e6: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aaab (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 0e9: iload 2
      // 0ea: ifne 0f9
      // 0ed: goto 0f1
      // 0f0: athrow
      // 0f1: ifeq 0fc
      // 0f4: goto 0f8
      // 0f7: athrow
      // 0f8: bipush 1
      // 0f9: goto 0fd
      // 0fc: bipush 0
      // 0fd: istore 4
      // 0ff: aload 0
      // 100: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab;
      // 103: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabaab.abbb ()Ljava/lang/Object;
      // 106: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaba
      // 109: astore 5
      // 10b: aload 5
      // 10d: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaba.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaaaaba;
      // 110: if_acmpne 126
      // 113: iload 3
      // 114: iload 2
      // 115: ifne 13b
      // 118: goto 11c
      // 11b: athrow
      // 11c: ifne 136
      // 11f: goto 123
      // 122: athrow
      // 123: goto 133
      // 126: iload 4
      // 128: iload 2
      // 129: ifne 13b
      // 12c: ifne 136
      // 12f: goto 133
      // 132: athrow
      // 133: bipush 0
      // 134: ireturn
      // 135: athrow
      // 136: aload 0
      // 137: aload 1
      // 138: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbaaa (Lnet/minecraft/class_310;)Z
      // 13b: ireturn
   }

   private boolean abb(class_746 param1) {
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
      // 06: ifne 18
      // 09: ifnonnull 17
      // 0c: goto 10
      // 0f: athrow
      // 10: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 13: goto 1b
      // 16: athrow
      // 17: aload 1
      // 18: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
      // 1b: astore 3
      // 1c: aload 3
      // 1d: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 20: iload 2
      // 21: ifne 61
      // 24: ifne 70
      // 27: goto 2b
      // 2a: athrow
      // 2b: getstatic net/minecraft/class_7923.field_41178 Lnet/minecraft/class_7922;
      // 2e: aload 3
      // 2f: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 32: invokeinterface net/minecraft/class_7922.method_10221 (Ljava/lang/Object;)Lnet/minecraft/class_2960; 2
      // 37: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 3a: ldc_w -879059625
      // 3d: ldc_w 1152607035
      // 40: ldc_w -301149426
      // 43: ixor
      // 44: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.a (II)I
      // 47: ldc_w -879059628
      // 4a: ldc_w 1152607035
      // 4d: ldc_w 334816922
      // 50: ixor
      // 51: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.a (II)I
      // 54: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbab (II)Ljava/lang/String;
      // 57: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 5a: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 5d: goto 61
      // 60: athrow
      // 61: iload 2
      // 62: ifne 6d
      // 65: ifeq 70
      // 68: goto 6c
      // 6b: athrow
      // 6c: bipush 1
      // 6d: goto 71
      // 70: bipush 0
      // 71: ireturn
   }

   private void bab(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 1
      // 005: iload 2
      // 006: ifne 011
      // 009: ifnull 017
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 014: ifnonnull 019
      // 017: return
      // 018: athrow
      // 019: aload 0
      // 01a: aload 1
      // 01b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.babb (Lnet/minecraft/class_310;)Lnet/minecraft/class_1511;
      // 01e: astore 3
      // 01f: iload 2
      // 020: ifne 041
      // 023: aload 3
      // 024: ifnull 036
      // 027: goto 02b
      // 02a: athrow
      // 02b: aload 3
      // 02c: invokevirtual net/minecraft/class_1511.method_31481 ()Z
      // 02f: ifeq 042
      // 032: goto 036
      // 035: athrow
      // 036: aload 0
      // 037: invokestatic java/lang/System.currentTimeMillis ()J
      // 03a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baba J
      // 03d: goto 041
      // 040: athrow
      // 041: return
      // 042: aload 1
      // 043: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 046: astore 5
      // 048: aload 5
      // 04a: iload 2
      // 04b: ifne 05e
      // 04e: instanceof net/minecraft/class_3966
      // 051: ifeq 079
      // 054: goto 058
      // 057: athrow
      // 058: aload 5
      // 05a: goto 05e
      // 05d: athrow
      // 05e: checkcast net/minecraft/class_3966
      // 061: iload 2
      // 062: ifne 07f
      // 065: astore 4
      // 067: aload 4
      // 069: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 06c: aload 3
      // 06d: if_acmpeq 079
      // 070: aload 0
      // 071: invokestatic java/lang/System.currentTimeMillis ()J
      // 074: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baba J
      // 077: return
      // 078: athrow
      // 079: aload 0
      // 07a: aload 1
      // 07b: aload 3
      // 07c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaa (Lnet/minecraft/class_310;Lnet/minecraft/class_1511;)Lnet/minecraft/class_3966;
      // 07f: astore 4
      // 081: iload 2
      // 082: ifne 0a1
      // 085: aload 4
      // 087: ifnull 0c8
      // 08a: goto 08e
      // 08d: athrow
      // 08e: aload 0
      // 08f: iload 2
      // 090: ifne 0bb
      // 093: goto 097
      // 096: athrow
      // 097: invokestatic java/lang/System.currentTimeMillis ()J
      // 09a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baba J
      // 09d: goto 0a1
      // 0a0: athrow
      // 0a1: aload 1
      // 0a2: aload 4
      // 0a4: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabbb (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;)Z
      // 0a7: ifeq 0b6
      // 0aa: aload 0
      // 0ab: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 0ae: iload 2
      // 0af: ifeq 0c7
      // 0b2: goto 0b6
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: aload 1
      // 0bc: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0bf: getfield net/minecraft/class_746.field_6012 I
      // 0c2: bipush 1
      // 0c3: iadd
      // 0c4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabab I
      // 0c7: return
      // 0c8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbbaba ()Z
      // 0cb: ifeq 0d0
      // 0ce: return
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: aload 1
      // 0d2: aload 3
      // 0d3: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbba (Lnet/minecraft/class_310;Lnet/minecraft/class_1511;)Lnet/minecraft/class_243;
      // 0d6: astore 5
      // 0d8: aload 5
      // 0da: ifnonnull 0e2
      // 0dd: aconst_null
      // 0de: goto 0e8
      // 0e1: athrow
      // 0e2: aload 1
      // 0e3: aload 5
      // 0e5: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.babaab (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 0e8: astore 6
      // 0ea: aload 0
      // 0eb: invokestatic java/lang/System.currentTimeMillis ()J
      // 0ee: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baba J
      // 0f1: aload 6
      // 0f3: ifnonnull 0f8
      // 0f6: return
      // 0f7: athrow
      // 0f8: aload 1
      // 0f9: ldc_w -879059627
      // 0fc: ldc_w 2029956389
      // 0ff: ldc_w -1049669313
      // 102: ixor
      // 103: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.a (II)I
      // 106: ldc2_w 282185627062610213
      // 109: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.ababb (IJ)I
      // 10c: aload 6
      // 10e: bipush 0
      // 10f: faload
      // 110: aload 6
      // 112: bipush 1
      // 113: faload
      // 114: aload 0
      // 115: invokedynamic run (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa;)Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaba ()Z, ()Z ]
      // 11a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbbbb (Lnet/minecraft/class_310;IFFLqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaabbb;)Z
      // 11d: istore 7
      // 11f: iload 7
      // 121: ifne 135
      // 124: aload 0
      // 125: aload 1
      // 126: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 129: getfield net/minecraft/class_746.field_6012 I
      // 12c: bipush 1
      // 12d: iadd
      // 12e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabab I
      // 131: goto 135
      // 134: athrow
      // 135: return
   }

   @Override
   public void aabaa() {
      this.bba(class_310.method_1551());
      this.abab();
   }

   private void bba(class_310 param1) {
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
      // 06: ifne 31
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaa Z
      // 0c: ifeq 2b
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: iload 2
      // 15: ifne 24
      // 18: goto 1c
      // 1b: athrow
      // 1c: ifnull 2b
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: aload 0
      // 25: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaab Lnet/minecraft/class_239;
      // 28: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 2b: aload 0
      // 2c: aconst_null
      // 2d: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaab Lnet/minecraft/class_239;
      // 30: aload 0
      // 31: bipush 0
      // 32: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaa Z
      // 35: return
   }

   static class_243 bbb(class_243 var0, class_238 var1) {
      return new class_243(
         class_3532.method_15350(var0.field_1352, var1.field_1323, var1.field_1320),
         class_3532.method_15350(var0.field_1351, var1.field_1322, var1.field_1325),
         class_3532.method_15350(var0.field_1350, var1.field_1321, var1.field_1324)
      );
   }

   private boolean aaaa(class_310 param1, class_2338 param2) {
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
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 1f
      // 17: aload 2
      // 18: ifnonnull 22
      // 1b: goto 1f
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
      // 21: athrow
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 26: aload 2
      // 27: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2a: astore 4
      // 2c: aload 4
      // 2e: getstatic net/minecraft/class_2246.field_10540 Lnet/minecraft/class_2248;
      // 31: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 34: iload 3
      // 35: ifne 73
      // 38: ifne 72
      // 3b: goto 3f
      // 3e: athrow
      // 3f: aload 4
      // 41: iload 3
      // 42: ifne 61
      // 45: goto 49
      // 48: athrow
      // 49: getstatic net/minecraft/class_2246.field_9987 Lnet/minecraft/class_2248;
      // 4c: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 4f: ifeq 76
      // 52: goto 56
      // 55: athrow
      // 56: aload 0
      // 57: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 5a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 5d: goto 61
      // 60: athrow
      // 61: checkcast java/lang/Boolean
      // 64: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 67: iload 3
      // 68: ifne 73
      // 6b: ifeq 76
      // 6e: goto 72
      // 71: athrow
      // 72: bipush 1
      // 73: goto 77
      // 76: bipush 0
      // 77: ireturn
   }

   public boolean aaab() {
      return this.bb();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var39 = -598719698;
      int var33 = 0;
      int var10001 = "Ǭ㒙ፔ㈉퍀㎅协㏭鍅㎅匾㏹퍟㎝ጚ㔱ጯ㋱鍆㑑팛\u31e5錣㏭匨㓥ጹ㑽팿㌁ጭ㉁ጢ㊍协㓩팺㈅錧ㆵ鍅㕁匜㑑ጸ㑍팘㕩匾㕹ጽ㓍匾㐕ጤ㕑錮㊑퍃㏝匪㇅퍕㑡ፉ㈽퍆㍽錮㐥錨\u31e5ጟㇱ鍟㑥鍐㐩匢㉩卋㉹錼㍕퍎㌹팵\u31e9ጛ㑽錶㒁匝㎁卑㈹鍒㍝팯㍥ፔ㔽鍃㇉匤㌑錸㌕協㍹팥㏥匽ㆡ鍐㈕퍌ㇵ팷ㆁ錠㌑팢㎹ጮ㌕匡㔁ጷ㐩ጟ㍕ፌ㉡匝㎵ጣ㌍퍂㔩鍖㎍錥㎕鍃㒉卋㒥錿㌱錾㉙錳㔙錞㒕퍅㋙팱\u31e5医㑅鍟㒱퍍㔙华\u31edፄㆵ匱㎉鍇㑭ጩㆥ匬㑽鍟㊙匞㈅鍐㈑鍌㓵匜㓑ጦ㎽卓㏉匤㏵鍊㑥ጪ㍹ጸ㑵匩㆕팻㐙錺㋽팚㔉鍇㌑匞㕽錥㏉팩㋕匚㔽鍖㍩匱㒵ጛ㈵卐㓩ጷ㉱ፈㆭ録ㇵ卌㆕ጵ㒑匱㎉匜㔍ጛ㑁匮㐑ፆ㉑ጩ㇁匝㔕匤㌉ጳ㎙퍕㋹匲㔉匠㗽팾㕁ጞ㓡퍅㉵錺㒑鍃㊵錨㗹ጝㇵ卖㎍ጺ㌑퍄㊽匲㑵錰㔑ፅ㓕鍐㋩匞㑡匞㈹ጺ㇙팸㇅錚㉉ጛ㊡팩㈭錾㔵퍉㏑錴㒕匪㈁卓ㇵ鍂㒵팬㍅匲㈑鍐㎥ጚ㑵팚㑥鍊ㆥ匥㒙匟㎙팥㏕팧㈩卋㕹錺㈑錱㊅卆㏉팪ㆥ팦ㆅጦ㕭鍋ㆡ팥㑑十㋹鍑㔥匾㏽匞㔍ጷ㋝匴㐁ጪ㒝鍍㎙팬㉵ጧ㐥匿㈅팪㈁鍊㆙卓㇕ፄ㉵千㎍錼㓙팮㏵卋㇝錳㕑卆㍡卂㐕ፖ㍵匘㎅팳㋕鍄㐽匭㊩ጚ㊝ፍ㔥ጚ㎥ፑ㉉匫ㆩ팰㎵팭㋹錬㒍ፋ㔁팥㊕匽㒁ፆ㇉鍖㓵錜㓕鍊ㆱጤ㕉錘㎩匡㉁华㔍錹㌡匰㕙팛㎉ጭ㉩錠㕡ፋ㓉錝㊩팴㌹ፓ㊽鍉㋅ጵ㓕匮㊥錼㌹ፐ㌥퍁ㆱ匴㎭鍖㇝ጽ㏕匿㓡퍑㕁鍓㌉팮㌵鍋㒩팜㍥匚\u001d뀃ﬅ뀯볨켳糛뀧볮낗볠넣糥켟笃칻ﳯ캏糝켇糞콣㬈칫볙춷ﳱ넳볷췫 ᒓ\uf12eᐫ焞ᆟ\uf138ቛ煑᎗ㄝᏏ焽ᓃ\uf12fᆯ녎\u1317ㅈᇟ焿ቓㅖፋ넬\u12d7煗Ꮇㄢᕧ네ᓯㅌ\n鼤짳鼬䧛鷠\u09de鷔䧞鶴䧜\u0010\uf518켢\uf4f4༴\uf248輠\uf5f8ང\uf220켙\uf33c佅\uf528轒\uf2e0传\n꼏竷꼇\ufae7귋뫜귟\ufadc깿\ufade \ue889\ude76\ue6fd鹡\ue6e1麀\ue819幰\ue8d5鹸\ue7b5\ude97\ue639麑\ue589幱\ue7fd麏\ue841庆\ue8e1Ṣ\ue905鹭\ue8f5\ude85\ue835\ude88\ue83d\ude5b\ue585麋\n漄웵漌䛙淀ۜ淴䛜涔䛞\u0010ㄙ퓬佥哸亽哲ㄕᓼ䶑ᓜ〩퓱き錅侭퓩\n濊⛻濂ꔓ儎\ue510儚ꔐ儺ꔒ"
         .length();
      String[] var31 = new String[10];
      int var30 = var10001;
      String var29 = "Ǭ㒙ፔ㈉퍀㎅协㏭鍅㎅匾㏹퍟㎝ጚ㔱ጯ㋱鍆㑑팛\u31e5錣㏭匨㓥ጹ㑽팿㌁ጭ㉁ጢ㊍协㓩팺㈅錧ㆵ鍅㕁匜㑑ጸ㑍팘㕩匾㕹ጽ㓍匾㐕ጤ㕑錮㊑퍃㏝匪㇅퍕㑡ፉ㈽퍆㍽錮㐥錨\u31e5ጟㇱ鍟㑥鍐㐩匢㉩卋㉹錼㍕퍎㌹팵\u31e9ጛ㑽錶㒁匝㎁卑㈹鍒㍝팯㍥ፔ㔽鍃㇉匤㌑錸㌕協㍹팥㏥匽ㆡ鍐㈕퍌ㇵ팷ㆁ錠㌑팢㎹ጮ㌕匡㔁ጷ㐩ጟ㍕ፌ㉡匝㎵ጣ㌍퍂㔩鍖㎍錥㎕鍃㒉卋㒥錿㌱錾㉙錳㔙錞㒕퍅㋙팱\u31e5医㑅鍟㒱퍍㔙华\u31edፄㆵ匱㎉鍇㑭ጩㆥ匬㑽鍟㊙匞㈅鍐㈑鍌㓵匜㓑ጦ㎽卓㏉匤㏵鍊㑥ጪ㍹ጸ㑵匩㆕팻㐙錺㋽팚㔉鍇㌑匞㕽錥㏉팩㋕匚㔽鍖㍩匱㒵ጛ㈵卐㓩ጷ㉱ፈㆭ録ㇵ卌㆕ጵ㒑匱㎉匜㔍ጛ㑁匮㐑ፆ㉑ጩ㇁匝㔕匤㌉ጳ㎙퍕㋹匲㔉匠㗽팾㕁ጞ㓡퍅㉵錺㒑鍃㊵錨㗹ጝㇵ卖㎍ጺ㌑퍄㊽匲㑵錰㔑ፅ㓕鍐㋩匞㑡匞㈹ጺ㇙팸㇅錚㉉ጛ㊡팩㈭錾㔵퍉㏑錴㒕匪㈁卓ㇵ鍂㒵팬㍅匲㈑鍐㎥ጚ㑵팚㑥鍊ㆥ匥㒙匟㎙팥㏕팧㈩卋㕹錺㈑錱㊅卆㏉팪ㆥ팦ㆅጦ㕭鍋ㆡ팥㑑十㋹鍑㔥匾㏽匞㔍ጷ㋝匴㐁ጪ㒝鍍㎙팬㉵ጧ㐥匿㈅팪㈁鍊㆙卓㇕ፄ㉵千㎍錼㓙팮㏵卋㇝錳㕑卆㍡卂㐕ፖ㍵匘㎅팳㋕鍄㐽匭㊩ጚ㊝ፍ㔥ጚ㎥ፑ㉉匫ㆩ팰㎵팭㋹錬㒍ፋ㔁팥㊕匽㒁ፆ㇉鍖㓵錜㓕鍊ㆱጤ㕉錘㎩匡㉁华㔍錹㌡匰㕙팛㎉ጭ㉩錠㕡ፋ㓉錝㊩팴㌹ፓ㊽鍉㋅ጵ㓕匮㊥錼㌹ፐ㌥퍁ㆱ匴㎭鍖㇝ጽ㏕匿㓡퍑㕁鍓㌉팮㌵鍋㒩팜㍥匚\u001d뀃ﬅ뀯볨켳糛뀧볮낗볠넣糥켟笃칻ﳯ캏糝켇糞콣㬈칫볙춷ﳱ넳볷췫 ᒓ\uf12eᐫ焞ᆟ\uf138ቛ煑᎗ㄝᏏ焽ᓃ\uf12fᆯ녎\u1317ㅈᇟ焿ቓㅖፋ넬\u12d7煗Ꮇㄢᕧ네ᓯㅌ\n鼤짳鼬䧛鷠\u09de鷔䧞鶴䧜\u0010\uf518켢\uf4f4༴\uf248輠\uf5f8ང\uf220켙\uf33c佅\uf528轒\uf2e0传\n꼏竷꼇\ufae7귋뫜귟\ufadc깿\ufade \ue889\ude76\ue6fd鹡\ue6e1麀\ue819幰\ue8d5鹸\ue7b5\ude97\ue639麑\ue589幱\ue7fd麏\ue841庆\ue8e1Ṣ\ue905鹭\ue8f5\ude85\ue835\ude88\ue83d\ude5b\ue585麋\n漄웵漌䛙淀ۜ淴䛜涔䛞\u0010ㄙ퓬佥哸亽哲ㄕᓼ䶑ᓜ〩퓱き錅侭퓩\n濊⛻濂ꔓ儎\ue510儚ꔐ儺ꔒ";
      short var34 = 23582;
      int var32 = 0;

      do {
         char var35 = var29.charAt(var33);
         var10001 = var33 + 1;
         int var10002 = var33 + 1;
         int var37 = 0;
         char[] var36 = var29.substring(var10001, var10002 + var35).toCharArray();

         do {
            char var38 = var36[var37];
            if (var37 % 2 == 0) {
               var36[var37] = (char)((var38 >>> 2 | var38 << 14) & 65535 ^ var34);
            } else {
               var36[var37] = (char)((var38 << 2 | var38 >>> 14) & 65535 ^ var34);
            }
         } while (++var37 < var36.length);

         var31[var32] = new String(var36);
         var32++;
         var33 = var33 + var35 + 1;
      } while (var33 < var30);

      baabb = var31;
      babaa = new Object[var31.length];
      int var25 = -76685231;
      byte[] var23 = ".)xÜ¹\u0096B\u0004o=p¦¡²\u008cÑ6#]\\eF]Oî\u008aB)\u0004dÛÌy;h45µj°XÉOª\u009b<·Î? ¯\u001c>C~Ø\u009f¬}ó·¡eýÑ¼26e·Gð\u0098O»\u008bv\u0099\u0017bÝòxæx\u008eg\u0000¯¿ø\u0013«O\u0010ÄU\\ñ\u001a\u009b7ný\u001d\u0004O¸\u0097\u0081d:\u0093é\u0095\u008bNðk\u0019î\u001cQv&*ýIô\u0010ä\u0080]\u0099t\u0082á½,CùW¬;e¸.]b\u0010®n\"½ªÐ\u00adçU\u00ad\u0091\u001b\b8fÃ\u008e\u0017±\u0003\u0088Ì\u00160ZÜ\u001df\u007fí¿ö¶¶\u001c£XG\u0081ÚÁ@ÔlÈ*Á{[5ô\u0082ÎÑ§I^#j\u008dØÂ1=¤AÕ9\u0089)Ã \u0001ÿ0\u0010Z[±\u0093` ´\u0007£q\u0080^PDÁ\u008de³]»÷TÏÞ¡\u0012.\u0019;æÒa\u00103zÿs\u0093ÿ½/Ï\u008e ²C¥\u0017zÿ\u0005µ=3l\u0081\u008dü½×\u0007âaë-\u0096É/P\u008aùôÁä¿¥d\u008c:ç\u000b!!`!\n¼!n\u0001èÚ\u0091È\u0096\u0096uOéÑ\u008cj\f\u0001¹n\u009c¶\u0014gq\u009f\u0007ólúIÔO[?Ó\u0090\u0004pB\u001d,6õ\u0090Cß\u0085\u001a\u0012É«\u0016@\u0083±\u0081\u0014+\f,¬\u008d±A\u0088\u009fÑä\u0006ÿ\u0090=+\u0084¹\"A\u008e1\n\u0001æ²\u001aUR¶îì¨\u008c³æ\u000bY\u0086\u0002É\fÙÚD\u0016\bFfÐUöÅÑVp\u0091ÛÔ\u0084¸6\u0007Ä\u0019\u009c_\u0098Ã^Ë/>\u008b$\u001eÇõR\f²Ã<÷ÃZPÃ\u0000Nþ|\u001cfÜ²Å&\u001b\u001c\u0012JÅZ9U\u0088Y¾nÉù _I\u0012LÓÚD%\u000f\u0006Øi\u009cÔ7UM¸éð\u009b_\u001aö}\u00979D\u0007àÅÄ°\u000f\b¹Ì\n]{»\u008ay¹»5\f$ç\u0093\u0006ÙWú\u0090B2u\u000e6û\b+f\u0089bÝ\u0090\u0099¾1{ \u0099ÇôZ}\u001a\u0082>B\u001a¤9IX\u0099×\u0005\u0088\u008a¦Äç\u008a\u0096Ã,m&Ê¾¤ ùic\u001aæô'x\u009a\f\u0095ï\u0005èVÈ@ú\u001c\u0013[7}Si\u0091ªª \u0081ØÔA#\u001be\u0083ùNP\u001e\u0082$Æ\u001fF\u0018\u0004é\u0081\u0012 S3I\u008fÁQÿó»ê~I¿;+# \u001a A©\u0091Ög»úøãnÄ\u008d¾DIî\u0017M\u009aFàª¦\u0010¹ª\u007f\u001f8\b4j\u0006\u008fCX\u00ad\u0011ÄãÅ®L\u0092W\u0015=|ô:VÝiQzÂy\u001c\r^\u0090qÄe0ß¾Ô?Ò\u0091p_ÌæøñÓ%gÐñR\u008e=åÃ-\b`2Ô\u009c\u0011À\u00adlF\u009a\u007f¼©Õ¡Í°d.Ý\u0000^º\u0092\u0086RõÄ©\u0088qø-ã2*`*\u008el\u009dSôoyø\u0000U{»\u001a*U-º,õeX$µ\u001cþ\n'\u0005Â\"#ÊÕ\\ÄIY\u0010jl´QÐ\u0001\u008e\u009fê£Ô|·xùíbÀÕ%É ´.½s^*x\u0096\u0099ðÈX{GkÑkJj$y9V\u008eï\b0³²\u0097\u000fZjåÞ\u009dï\u007fðWy\u0083Ù¼\u0099ðµU0-v0ôÝ¤î\u0018ºEÞÑ\u0003>\u0092èÈ\u0093\u0085¶\u000bë?\u0085\u009e\r\u008bÎ\u0017K'\u0006èF7Ü[´\u0001PE\u001fçÖ\u0003]!ID\u0007e\u001còú\u0010J\"mfÙ«äº$&\u0006ìh\u0004?w©#1~h1\u0088\u0001¦¥íº»kex¤\u000bT\u0002Íf\u0013Ó\u0014ÑLÍe\u001c\u0091\u0086üÙµC\u007fRV \u009e\tk±l\u000e!Ú\u0094lõùÇ-÷\u0016=\u008bz«Âq\u008bz\u0080¹.æã\u0094Z¼~;TQôp\u008cm\u0099bm:a~xÚ3|nQ`ëO©ákÝ£}&nF\u0002çª\u0084¹ÚÛµ\u0086õ9RK{¼ùf\u0092Úª¤A\u0096XóGn7x\u009a\u008bC\u0090Ã\u009bF@gÓ©)Âÿ_\u00919\t\u0012@<ütòì>g»\u0014 èm®á%QóðgÈe\u0001ÛÔz&\u0094\u0085õ®\u0081\u008dV+5s\u009d\u001axªÆ\u00855þ£5\u00adðGqq\u0001A<üíçB:úÈÂd×\u001båMÃRø!\u0081=Û\u0004pIjÄ-\u0095Ð *Ý\u008cçáî¡\u0093Ó\u009f¨ \u008fÛkQ\u009c&\u0000\u001cj¸_ìÒ\u0015ßÉV|G\u0004L«mõ?çö1û\u0011þl¼RuqDb\\/Ç\u0010ç\u008b\\¬[\u0019\u0088¥þa\u0010DI?\u001e\u0081ÐIç3a-Ï|Îõ×(Bæ\u001cúÉ^Ü#Wx\u0090üª¶Cb}¸\u0091e\\à\u0090\u0088½\u0083WSK\u0085¢;Ó<û§Ò\u0099n\\»ß$~M\u0081\u0085\u0002OT3RÊ\u0088\u0017\b\u008cà@¶ÈÙlD©Åhò¤\u001d¿\u001e\u0007\u001dy´öLè\nN«÷\u001fí\u0099\"9ÈPýàµVÑ\u0098¹ZAEe\u0007D\u009c\u000bå¹äo\r\u0006\u0095)#¦Ì(è\u001a\u0012©ÂFÑ y\u001fÌCÓ\u0087\u0013H~¨d;wa4\u0098tÝT\u009d\u0092Ê4¡\u0001²\u0013Y\u0088\u00ad\u0005ÙðÂÌÇÏ?\u0010²î§\u009crre\"ûËw\u008f{\\½Y\u009b×\u0097\t6Äm/e¸§Õ*ÑýèÚ\u0091C\u00850½\u007fÛ\u009ePyA"
         .getBytes("ISO-8859-1");
      int var24 = var23.length / 4;
      baaba = new int[var24];
      byte var26 = 0;
      int var27 = 0;

      do {
         int var28 = (var23[var26] & 255) << 24 | (var23[var26 + 1] & 255) << 16 | (var23[var26 + 2] & 255) << 8 | var23[var26 + 3] & 255;
         var28 ^= var25;
         baaba[var27] = var28;
         var26 += 4;
      } while (++var27 < var24);

      String[] var21 = new String[a(-879059856, var39 ^ 446045134)];
      int var19 = 0;
      String var18;
      int var20 = (var18 = b((short)9574, var39 ^ 1198732970, 'Ὺ')).length();
      int var17 = a(-879059855, var39 ^ 315317389);
      int var43 = -1;

      label129:
      while (true) {
         String var10000 = var18.substring(++var43, var43 + var17);
         int var53 = -1;

         while (true) {
            char[] var75;
            label124: {
               char[] var55 = var10000.toCharArray();
               int var10003 = var55.length;
               int var22 = 0;
               var75 = var55;
               var53 = var10003;
               char[] var91;
               int var10004;
               if (var10003 <= 1) {
                  var91 = var55;
                  var10004 = var22;
               } else {
                  var75 = var55;
                  var53 = var10003;
                  if (var10003 <= var22) {
                     break label124;
                  }

                  var91 = var55;
                  var10004 = var22;
               }

               while (true) {
                  var91[var10004] = (char)(var91[var10004] ^ switch (var22 % a(-879059844, var39 ^ 187466735)) {
                     case 0 -> a(-879059843, var39 ^ -1212263380);
                     case 1 -> a(-879059846, var39 ^ 315018472);
                     case 2 -> a(-879059845, var39 ^ -1516700040);
                     case 3 -> a(-879059848, var39 ^ 1022245805);
                     case 4 -> a(-879059847, var39 ^ -1920323657);
                     case 5 -> a(-879059962, var39 ^ 575802305);
                     default -> 1;
                  });
                  var22++;
                  if (var53 == 0) {
                     var10004 = var53;
                     var91 = var75;
                  } else {
                     if (var53 <= var22) {
                        break;
                     }

                     var91 = var75;
                     var10004 = var22;
                  }
               }
            }

            String var98 = new String(var75).intern();
            switch (var53) {
               case 0:
                  var21[var19++] = var98;
                  if ((var43 += var17) >= var20) {
                     aab = var21;
                     baaaa = new String[a(-879059841, var39 ^ -1333254208)];
                     long var8 = 3016283880596991585L;
                     long[] var14 = new long[a(-879059961, var39 ^ -1371421763)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = b((short)'︻', var39 ^ 73273541, 'Ῠ')).length();
                     byte var10 = 0;

                     label103:
                     while (true) {
                        int var62 = var10;
                        var10 += 8;
                        var10000 = var12.substring(var62, var10);
                        int var63 = 42065;
                        int var81 = var39 ^ -1284932982;
                        short var99 = 8169;
                        byte[] var15 = var10000.getBytes("ISO-8859-1");
                        long[] var47 = var14;
                        var62 = var11++;
                        long var82 = (var15[0] & 255L) << a(-879059964, var39 ^ 637076341)
                           | (var15[1] & 255L) << a(-879059963, var39 ^ -1142992973)
                           | (var15[2] & 255L) << a(-879059966, var39 ^ 1175559170)
                           | (var15[3] & 255L) << a(-879059965, var39 ^ -1860219332)
                           | (var15[4] & 255L) << a(-879059968, var39 ^ -1337495494)
                           | (var15[5] & 255L) << a(-879059967, var39 ^ 1361360888)
                           | (var15[a(-879059954, var39 ^ -1490911883)] & 255L) << a(-879059953, var39 ^ 1067132138)
                           | var15[a(-879059956, var39 ^ 1044296047)] & 255L;
                        byte var100 = -1;

                        while (true) {
                           long var108 = var82 ^ var8;
                           switch (var100) {
                              case 0:
                                 var47[var62] = var108;
                                 if (var10 >= var13) {
                                    aaabb = var14;
                                    aabaa = new Integer[a(-879059950, var39 ^ 451622744)];
                                    abbaa = ababb(a(-879059949, var39 ^ 1576232277), 4712725080879537355L);
                                    long var0 = 461306459252070040L;
                                    long[] var6 = new long[a(-879059952, var39 ^ 20905321)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = b((short)31138, var39 ^ 874924810, 'Ῥ')).length();
                                    byte var2 = 0;

                                    label93:
                                    while (true) {
                                       short var67 = var2;
                                       var2 += 8;
                                       var10000 = var4.substring(var67, var2);
                                       var67 = 3188;
                                       int var85 = var39 ^ 658780047;
                                       short var103 = 8173;
                                       byte[] var7 = var10000.getBytes("ISO-8859-1");
                                       long[] var50 = var6;
                                       var63 = var3++;
                                       long var86 = (var7[0] & 255L) << a(-879059951, var39 ^ 620176035)
                                          | (var7[1] & 255L) << a(-879059938, var39 ^ 1508970188)
                                          | (var7[2] & 255L) << a(-879059937, var39 ^ 1442684472)
                                          | (var7[3] & 255L) << a(-879059940, var39 ^ -1985963046)
                                          | (var7[4] & 255L) << a(-879059939, var39 ^ -415082165)
                                          | (var7[5] & 255L) << a(-879059942, var39 ^ -2085951963)
                                          | (var7[a(-879059941, var39 ^ -981173865)] & 255L) << a(-879059944, var39 ^ -1001405112)
                                          | var7[a(-879059943, var39 ^ 1164286455)] & 255L;
                                       byte var104 = -1;

                                       while (true) {
                                          var108 = var86 ^ var0;
                                          switch (var104) {
                                             case 0:
                                                var50[var63] = var108;
                                                if (var2 >= var5) {
                                                   bbab = var6;
                                                   abbb = new Long[a(-879059921, var39 ^ 728293503)];
                                                   baaab = aa(a(-879059924, var39 ^ -1581850501), 6666836464068338573L);
                                                   babb = aabbaaaba.aaab(
                                                      abbab(a(-879059923, var39 ^ 1630195774), a(-879059926, var39 ^ -392989396))
                                                   );
                                                   ab = aabbaaaba.aaab(
                                                      abbab(a(-879059925, var39 ^ 1745094859), a(-879059928, var39 ^ 2003853650))
                                                   );
                                                   abb = aabbaaaba.aaab(
                                                      abbab(a(-879059927, var39 ^ 631035923), a(-879059914, var39 ^ 1994391961))
                                                   );
                                                   bba = aabbaaaba.aaab(
                                                      abbab(a(-879059913, var39 ^ 965298412), a(-879059916, var39 ^ -909508808))
                                                   );
                                                   abbba = aabbaaaba.aaab(
                                                      abbab(a(-879059915, var39 ^ 602262264), a(-879059918, var39 ^ 1928825313))
                                                   );
                                                   aaaa = List.of(
                                                      new aaaa(ab, ab),
                                                      new aaaa(abb, abb),
                                                      new aaaa(bba, bba),
                                                      new aaaa(abbba, abbba)
                                                   );
                                                   bb = ab;
                                                   aabbb = abb;
                                                   aa = bba;
                                                   return;
                                                }
                                                break;
                                             default:
                                                var50[var63] = var108;
                                                if (var2 < var5) {
                                                   continue label93;
                                                }

                                                var5 = (var4 = b((short)27581, var39 ^ 143020239, 'ῢ')).length();
                                                var2 = 0;
                                          }

                                          short var70 = var2;
                                          var2 += 8;
                                          var10000 = var4.substring(var70, var2);
                                          var70 = 25018;
                                          int var88 = var39 ^ -897755761;
                                          short var106 = 8163;
                                          var7 = var10000.getBytes("ISO-8859-1");
                                          var50 = var6;
                                          var63 = var3++;
                                          var86 = (var7[0] & 255L) << a(-879059930, var39 ^ 1289666744)
                                             | (var7[1] & 255L) << a(-879059929, var39 ^ -1351329666)
                                             | (var7[2] & 255L) << a(-879059932, var39 ^ -1529252062)
                                             | (var7[3] & 255L) << a(-879059931, var39 ^ -674185653)
                                             | (var7[4] & 255L) << a(-879059934, var39 ^ 1960000964)
                                             | (var7[5] & 255L) << a(-879059933, var39 ^ 1899309757)
                                             | (var7[a(-879059936, var39 ^ 1302752627)] & 255L) << a(-879059935, var39 ^ -1255181722)
                                             | var7[a(-879059922, var39 ^ 894901725)] & 255L;
                                          var104 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var47[var62] = var108;
                                 if (var10 < var13) {
                                    continue label103;
                                 }

                                 var13 = (var12 = b((short)'휼', var39 ^ -440706447, '΅')).length();
                                 var10 = 0;
                           }

                           byte var65 = var10;
                           var10 += 8;
                           var10000 = var12.substring(var65, var10);
                           char var66 = '\udfec';
                           int var84 = var39 ^ 81423594;
                           short var102 = 8175;
                           var15 = var10000.getBytes("ISO-8859-1");
                           var47 = var14;
                           var62 = var11++;
                           var82 = (var15[0] & 255L) << a(-879059955, var39 ^ 1467546401)
                              | (var15[1] & 255L) << a(-879059958, var39 ^ -1591322046)
                              | (var15[2] & 255L) << a(-879059957, var39 ^ -1544295365)
                              | (var15[3] & 255L) << a(-879059960, var39 ^ 640665690)
                              | (var15[4] & 255L) << a(-879059959, var39 ^ 1615306765)
                              | (var15[5] & 255L) << a(-879059946, var39 ^ 612273400)
                              | (var15[a(-879059945, var39 ^ 1164097445)] & 255L) << a(-879059948, var39 ^ 1220173896)
                              | var15[a(-879059947, var39 ^ -340089186)] & 255L;
                           var100 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var43);
                  break;
               default:
                  var21[var19++] = var98;
                  if ((var43 += var17) < var20) {
                     var17 = var18.charAt(var43);
                     continue label129;
                  }

                  var20 = (var18 = b((short)'谄', var39 ^ 1338852691, 'Ύ')).length();
                  var17 = a(-879059842, var39 ^ -1713988770);
                  var43 = -1;
            }

            var10000 = var18.substring(++var43, var43 + var17);
            var53 = 0;
         }
      }
   }

   private boolean aaba() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 0
      // 09: aload 2
      // 0a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.babb (Lnet/minecraft/class_310;)Lnet/minecraft/class_1511;
      // 0d: astore 3
      // 0e: aload 3
      // 0f: iload 1
      // 10: ifne 1b
      // 13: ifnull 29
      // 16: goto 1a
      // 19: athrow
      // 1a: aload 3
      // 1b: invokevirtual net/minecraft/class_1511.method_31481 ()Z
      // 1e: iload 1
      // 1f: ifne 2a
      // 22: ifeq 2b
      // 25: goto 29
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
      // 2b: aload 0
      // 2c: aload 2
      // 2d: aload 3
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbba (Lnet/minecraft/class_310;Lnet/minecraft/class_1511;)Lnet/minecraft/class_243;
      // 31: astore 4
      // 33: aload 4
      // 35: ifnonnull 3b
      // 38: bipush 0
      // 39: ireturn
      // 3a: athrow
      // 3b: aload 2
      // 3c: new net/minecraft/class_3966
      // 3f: dup
      // 40: aload 3
      // 41: aload 4
      // 43: invokespecial net/minecraft/class_3966.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_243;)V
      // 46: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbabbb (Lnet/minecraft/class_310;Lnet/minecraft/class_3966;)Z
      // 49: istore 5
      // 4b: iload 5
      // 4d: iload 1
      // 4e: ifne 62
      // 51: ifeq 60
      // 54: goto 58
      // 57: athrow
      // 58: aload 0
      // 59: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 5c: goto 60
      // 5f: athrow
      // 60: iload 5
      // 62: ireturn
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
      // 03: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 0
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 0c: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 0f: if_acmpne 14
      // 12: return
      // 13: athrow
      // 14: invokestatic java/lang/System.currentTimeMillis ()J
      // 17: lstore 3
      // 18: aload 0
      // 19: iload 1
      // 1a: ifne 3f
      // 1d: aload 2
      // 1e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aab (Lnet/minecraft/class_310;)Z
      // 21: ifeq 3a
      // 24: goto 28
      // 27: athrow
      // 28: lload 3
      // 29: aload 0
      // 2a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baa J
      // 2d: lsub
      // 2e: aload 0
      // 2f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.ba ()J
      // 32: lcmp
      // 33: ifle 42
      // 36: goto 3a
      // 39: athrow
      // 3a: aload 0
      // 3b: goto 3f
      // 3e: athrow
      // 3f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 42: return
   }

   private boolean aabb(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: aload 1
      // 04: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 07: aload 2
      // 08: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0b: astore 4
      // 0d: istore 3
      // 0e: aload 4
      // 10: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 13: iload 3
      // 14: ifne 33
      // 17: ifne 32
      // 1a: goto 1e
      // 1d: athrow
      // 1e: aload 4
      // 20: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 23: iload 3
      // 24: ifne 33
      // 27: goto 2b
      // 2a: athrow
      // 2b: ifeq 36
      // 2e: goto 32
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   private long abaa(aaabbbab var1) {
      double var2 = var1.bab();
      double var4 = var1.abb();

      try {
         if (var2 == var4) {
            return Math.max(0L, Math.round(var2));
         }
      } catch (MatchException var6) {
         throw var6;
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private void abab() {
      this.aba = aaaaabab.bb;
      this.abaaa = aa(a(-879059630, -1918246316 ^ 1621907538), 8743967248540265310L);
      this.abab = 0L;
      this.baba = 0L;
      this.baa = 0L;
      this.aabab = ababb(a(-879059629, -1918246316 ^ 976186757), 8842807631996398073L);
      this.bbb = -1;
      this.baaa = null;
      this.baab = -1;
      this.abba = false;
      this.bbba = false;
      this.ababb = ababb(a(-879059632, -1918246316 ^ -316738923), 8842807631996398073L);
      this.aaa = false;
      this.aaaaa = null;
      this.abaab = null;
   }

   public baabbbaa() {
      int var1 = 1034871061;
      super(
         aabbaaaba.aaab(abbab(a(-879059631, var1 ^ 1508443777), a(-879059618, var1 ^ -1476735391))),
         bbaabbba.aa,
         aabbaaaba.aaab(abbab(a(-879059617, var1 ^ 1771141158), a(-879059620, var1 ^ -274566625)))
      );
      this.bab = (baabaab)this.abbbaaa(
         new baabaab(
            aabbaaaba.aaab(abbab(a(-879059619, var1 ^ 1697084023), a(-879059622, var1 ^ 1632601594))),
            baaaaaba.class,
            baaaaaba.ab
         )
      );
      this.aaba = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(abbab(a(-879059621, var1 ^ -1135182398), a(-879059624, var1 ^ 481974331))),
               0.0,
               0.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(abbab(a(-879059623, var1 ^ -728962069), a(-879059610, var1 ^ 112651127))))
      );
      this.aaaba = (aaabbbab)this.abbbaaa(
         new aaabbbab(
               aabbaaaba.aaab(abbab(a(-879059609, var1 ^ -1354800541), a(-879059612, var1 ^ 320595390))),
               0.0,
               0.0,
               0.0,
               300.0,
               5.0
            )
            .bbb(aabbaaaba.aaab(abbab(a(-879059611, var1 ^ 200391249), a(-879059614, var1 ^ -1759634599))))
      );
      this.bbaa = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(abbab(a(-879059613, var1 ^ -1867073396), a(-879059616, var1 ^ -803507184))), true
         )
      );
      this.aaab = (abaabbbb)this.abbbaaa(
         new abaabbbb(
            aabbaaaba.aaab(abbab(a(-879059615, var1 ^ 1598112751), a(-879059602, var1 ^ -1673373062))),
            aaaa,
            List.of(ab, abb, bba, abbba)
         )
      );
      this.ba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(abbab(a(-879059601, var1 ^ -1805281170), a(-879059604, var1 ^ -1134895141))), false
         )
      );
      this.aabba = (abbaaaaa)this.abbbaaa(
         new abbaaaaa(
            aabbaaaba.aaab(abbab(a(-879059603, var1 ^ -459912026), a(-879059606, var1 ^ 272615718))), true
         )
      );
      this.aba = aaaaabab.bb;
      this.abaaa = aa(a(-879059605, var1 ^ -1297096113), 5697820324773154859L);
      this.aabab = ababb(a(-879059608, var1 ^ 301600463), 1781198827932181834L);
      this.bbb = -1;
      this.baab = -1;
      this.ababb = ababb(a(-879059607, var1 ^ 1937557694), 8842807631996398073L);
   }

   private void abba(class_310 param1) {
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
      // 06: ifne 2b
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaa Lnet/minecraft/class_2338;
      // 0c: ifnull 26
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 3c
      // 18: goto 1c
      // 1b: athrow
      // 1c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbb I
      // 1f: ifge 2f
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: goto 2b
      // 2a: athrow
      // 2b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 2e: return
      // 2f: aload 0
      // 30: aload 0
      // 31: aload 0
      // 32: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaa Lnet/minecraft/class_2338;
      // 35: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 38: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaab Lnet/minecraft/class_3965;
      // 3b: aload 0
      // 3c: aload 1
      // 3d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 40: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 43: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 46: iload 2
      // 47: ifne 5a
      // 4a: aload 0
      // 4b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbb I
      // 4e: if_icmpeq 5d
      // 51: goto 55
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5a
      // 59: athrow
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaa Z
      // 61: aload 0
      // 62: invokestatic java/lang/System.currentTimeMillis ()J
      // 65: aload 0
      // 66: iload 2
      // 67: ifne 79
      // 6a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaa Z
      // 6d: ifeq 83
      // 70: goto 74
      // 73: athrow
      // 74: aload 0
      // 75: goto 79
      // 78: athrow
      // 79: aload 0
      // 7a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 7d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 80: goto 84
      // 83: lconst_0
      // 84: ladd
      // 85: aload 0
      // 86: aload 0
      // 87: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 8a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 8d: ladd
      // 8e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab J
      // 91: aload 0
      // 92: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 95: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 98: return
   }

   private JsonArray abbb(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: new com/google/gson/JsonArray
      // 06: dup
      // 07: invokespecial com/google/gson/JsonArray.<init> ()V
      // 0a: astore 3
      // 0b: istore 2
      // 0c: aload 1
      // 0d: aload 0
      // 0e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 11: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.baab ()J
      // 14: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbbbab (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 17: astore 4
      // 19: aload 4
      // 1b: iload 2
      // 1c: ifne 28
      // 1f: ifnull 6e
      // 22: goto 26
      // 25: athrow
      // 26: aload 4
      // 28: iload 2
      // 29: ifne 3c
      // 2c: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 2f: ifeq 6e
      // 32: goto 36
      // 35: athrow
      // 36: aload 4
      // 38: goto 3c
      // 3b: athrow
      // 3c: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 3f: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 42: astore 5
      // 44: aload 5
      // 46: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4b: ifeq 6c
      // 4e: aload 5
      // 50: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 55: checkcast com/google/gson/JsonElement
      // 58: astore 6
      // 5a: aload 3
      // 5b: iload 2
      // 5c: ifne 6d
      // 5f: aload 6
      // 61: invokevirtual com/google/gson/JsonArray.add (Lcom/google/gson/JsonElement;)V
      // 64: iload 2
      // 65: ifeq 44
      // 68: goto 6c
      // 6b: athrow
      // 6c: aload 3
      // 6d: areturn
      // 6e: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaa Ljava/util/List;
      // 71: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 76: astore 5
      // 78: aload 5
      // 7a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 7f: ifeq a3
      // 82: aload 5
      // 84: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 89: checkcast qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaa
      // 8c: astore 6
      // 8e: aload 3
      // 8f: iload 2
      // 90: ifne a4
      // 93: aload 6
      // 95: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaa.aab ()Ljava/lang/String;
      // 98: invokevirtual com/google/gson/JsonArray.add (Ljava/lang/String;)V
      // 9b: iload 2
      // 9c: ifeq 78
      // 9f: goto a3
      // a2: athrow
      // a3: aload 3
      // a4: areturn
   }

   private class_3966 baaa(class_310 param1, class_1511 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 3
      // 004: aload 1
      // 005: iload 3
      // 006: ifne 011
      // 009: ifnull 02e
      // 00c: goto 010
      // 00f: athrow
      // 010: aload 1
      // 011: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 014: ifnull 02e
      // 017: aload 2
      // 018: iload 3
      // 019: ifne 028
      // 01c: goto 020
      // 01f: athrow
      // 020: ifnull 02e
      // 023: goto 027
      // 026: athrow
      // 027: aload 2
      // 028: invokevirtual net/minecraft/class_1511.method_31481 ()Z
      // 02b: ifeq 031
      // 02e: aconst_null
      // 02f: areturn
      // 030: athrow
      // 031: aload 1
      // 032: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 035: astore 5
      // 037: aload 5
      // 039: iload 3
      // 03a: ifne 04d
      // 03d: instanceof net/minecraft/class_3966
      // 040: ifeq 06a
      // 043: goto 047
      // 046: athrow
      // 047: aload 5
      // 049: goto 04d
      // 04c: athrow
      // 04d: checkcast net/minecraft/class_3966
      // 050: astore 4
      // 052: aload 4
      // 054: iload 3
      // 055: ifne 069
      // 058: invokevirtual net/minecraft/class_3966.method_17782 ()Lnet/minecraft/class_1297;
      // 05b: aload 2
      // 05c: if_acmpne 06a
      // 05f: goto 063
      // 062: athrow
      // 063: aload 4
      // 065: goto 069
      // 068: athrow
      // 069: areturn
      // 06a: aload 1
      // 06b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 06e: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 071: astore 4
      // 073: ldc2_w 3.0
      // 076: aload 1
      // 077: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 07a: invokevirtual net/minecraft/class_746.method_55755 ()D
      // 07d: invokestatic java/lang/Math.min (DD)D
      // 080: dstore 5
      // 082: dload 5
      // 084: dconst_0
      // 085: dcmpg
      // 086: ifgt 08c
      // 089: aconst_null
      // 08a: areturn
      // 08b: athrow
      // 08c: aload 4
      // 08e: aload 1
      // 08f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 092: fconst_1
      // 093: invokevirtual net/minecraft/class_746.method_5828 (F)Lnet/minecraft/class_243;
      // 096: dload 5
      // 098: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 09b: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 09e: astore 7
      // 0a0: aload 2
      // 0a1: invokevirtual net/minecraft/class_1511.method_5829 ()Lnet/minecraft/class_238;
      // 0a4: aload 4
      // 0a6: aload 7
      // 0a8: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
      // 0ab: astore 8
      // 0ad: aload 8
      // 0af: iload 3
      // 0b0: ifne 0c5
      // 0b3: invokevirtual java/util/Optional.isEmpty ()Z
      // 0b6: ifeq 0c0
      // 0b9: goto 0bd
      // 0bc: athrow
      // 0bd: aconst_null
      // 0be: areturn
      // 0bf: athrow
      // 0c0: aload 8
      // 0c2: invokevirtual java/util/Optional.get ()Ljava/lang/Object;
      // 0c5: checkcast net/minecraft/class_243
      // 0c8: astore 9
      // 0ca: aload 0
      // 0cb: aload 1
      // 0cc: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baabb (Lnet/minecraft/class_310;)Lnet/minecraft/class_243;
      // 0cf: astore 10
      // 0d1: aload 1
      // 0d2: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0d5: invokevirtual net/minecraft/class_746.method_55755 ()D
      // 0d8: ldc2_w 0.1
      // 0db: dsub
      // 0dc: dstore 11
      // 0de: dload 11
      // 0e0: iload 3
      // 0e1: ifne 0f8
      // 0e4: dconst_0
      // 0e5: dcmpg
      // 0e6: ifle 101
      // 0e9: goto 0ed
      // 0ec: athrow
      // 0ed: aload 10
      // 0ef: aload 9
      // 0f1: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 0f4: goto 0f8
      // 0f7: athrow
      // 0f8: dload 11
      // 0fa: dload 11
      // 0fc: dmul
      // 0fd: dcmpl
      // 0fe: ifle 104
      // 101: aconst_null
      // 102: areturn
      // 103: athrow
      // 104: new net/minecraft/class_3966
      // 107: dup
      // 108: aload 2
      // 109: aload 9
      // 10b: invokespecial net/minecraft/class_3966.<init> (Lnet/minecraft/class_1297;Lnet/minecraft/class_243;)V
      // 10e: areturn
   }

   private static String b(short var0, int var1, char var2) {
      int var3 = var2 ^ 8170;
      char[] var4 = baabb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])babaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         babaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 14082;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '촩';
         var10 += 45213;
         var10 += 40735;
         var10 += 62692;
         var10 -= 38187;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private boolean baab(class_310 var1, class_2338 var2) {
      return this.bbaba(var1, var2.method_10084());
   }

   private boolean baba(class_310 param1, class_2338 param2, class_2680 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 4
      // 05: aload 1
      // 06: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 09: invokevirtual net/minecraft/class_746.method_5715 ()Z
      // 0c: iload 4
      // 0e: ifne 20
      // 11: ifne 44
      // 14: goto 18
      // 17: athrow
      // 18: aload 3
      // 19: invokevirtual net/minecraft/class_2680.method_31709 ()Z
      // 1c: goto 20
      // 1f: athrow
      // 20: iload 4
      // 22: ifne 41
      // 25: ifne 3c
      // 28: goto 2c
      // 2b: athrow
      // 2c: aload 3
      // 2d: aload 1
      // 2e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 31: aload 2
      // 32: invokevirtual net/minecraft/class_2680.method_26196 (Lnet/minecraft/class_1937;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3908;
      // 35: ifnull 44
      // 38: goto 3c
      // 3b: athrow
      // 3c: bipush 1
      // 3d: goto 41
      // 40: athrow
      // 41: goto 45
      // 44: bipush 0
      // 45: ireturn
   }

   private class_1511 babb(class_310 param1) {
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
      // 09: ifnull 2a
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14: ifnull 2a
      // 17: aload 0
      // 18: iload 2
      // 19: ifne 2e
      // 1c: goto 20
      // 1f: athrow
      // 20: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaa Lnet/minecraft/class_2338;
      // 23: ifnonnull 2d
      // 26: goto 2a
      // 29: athrow
      // 2a: aconst_null
      // 2b: areturn
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaa Lnet/minecraft/class_2338;
      // 31: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 34: astore 3
      // 35: new net/minecraft/class_238
      // 38: dup
      // 39: aload 3
      // 3a: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 3d: dconst_1
      // 3e: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 41: astore 4
      // 43: aconst_null
      // 44: astore 5
      // 46: ldc2_w 1.7976931348623157E308
      // 49: dstore 6
      // 4b: aload 3
      // 4c: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 4f: astore 8
      // 51: aload 1
      // 52: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 55: aconst_null
      // 56: aload 4
      // 58: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.babab (Lnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
      // 5d: invokevirtual net/minecraft/class_638.method_8333 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;Ljava/util/function/Predicate;)Ljava/util/List;
      // 60: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 65: astore 9
      // 67: aload 9
      // 69: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6e: ifeq e7
      // 71: aload 9
      // 73: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 78: checkcast net/minecraft/class_1297
      // 7b: astore 10
      // 7d: aload 10
      // 7f: iload 2
      // 80: ifne 8f
      // 83: instanceof net/minecraft/class_1511
      // 86: ifeq 67
      // 89: goto 8d
      // 8c: athrow
      // 8d: aload 10
      // 8f: checkcast net/minecraft/class_1511
      // 92: astore 11
      // 94: aload 11
      // 96: iload 2
      // 97: ifne aa
      // 9a: invokevirtual net/minecraft/class_1511.method_31481 ()Z
      // 9d: ifne 67
      // a0: goto a4
      // a3: athrow
      // a4: aload 11
      // a6: iload 2
      // a7: ifne be
      // aa: invokevirtual net/minecraft/class_1511.method_24515 ()Lnet/minecraft/class_2338;
      // ad: aload 3
      // ae: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // b1: ifne bc
      // b4: iload 2
      // b5: ifeq 67
      // b8: goto bc
      // bb: athrow
      // bc: aload 11
      // be: invokevirtual net/minecraft/class_1511.method_5829 ()Lnet/minecraft/class_238;
      // c1: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
      // c4: aload 8
      // c6: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // c9: dstore 12
      // cb: iload 2
      // cc: ifne df
      // cf: dload 12
      // d1: dload 6
      // d3: dcmpg
      // d4: ifge e3
      // d7: goto db
      // da: athrow
      // db: dload 12
      // dd: dstore 6
      // df: aload 11
      // e1: astore 5
      // e3: iload 2
      // e4: ifeq 67
      // e7: aload 5
      // e9: areturn
   }

   private void bbab(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic java/lang/System.currentTimeMillis ()J
      // 06: lstore 3
      // 07: istore 2
      // 08: lload 3
      // 09: aload 0
      // 0a: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaaa J
      // 0d: lcmp
      // 0e: iload 2
      // 0f: ifne 1d
      // 12: ifge 1a
      // 15: goto 19
      // 18: athrow
      // 19: return
      // 1a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbbaba ()Z
      // 1d: iload 2
      // 1e: ifne 38
      // 21: ifne 3b
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: iload 2
      // 2a: ifne 3d
      // 2d: goto 31
      // 30: athrow
      // 31: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaaa ()Z
      // 34: goto 38
      // 37: athrow
      // 38: ifeq 3c
      // 3b: return
      // 3c: aload 0
      // 3d: aload 1
      // 3e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbbb (Lnet/minecraft/class_310;)V
      // 41: return
   }

   private boolean bbba(class_746 param1) {
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
      // 14: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
      // 17: astore 3
      // 18: aload 3
      // 19: iload 2
      // 1a: ifne 60
      // 1d: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 20: ifeq 5f
      // 23: goto 27
      // 26: athrow
      // 27: aload 0
      // 28: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 2b: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 2e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 31: iload 2
      // 32: ifne 5a
      // 35: goto 39
      // 38: athrow
      // 39: ifne 59
      // 3c: goto 40
      // 3f: athrow
      // 40: aload 0
      // 41: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 44: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 47: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 4a: iload 2
      // 4b: ifne 5a
      // 4e: goto 52
      // 51: athrow
      // 52: ifeq 5d
      // 55: goto 59
      // 58: athrow
      // 59: bipush 1
      // 5a: goto 5e
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: aload 3
      // 60: iload 2
      // 61: ifne 7e
      // 64: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 67: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 6a: ifeq 7d
      // 6d: goto 71
      // 70: athrow
      // 71: aload 0
      // 72: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 75: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 78: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 7b: ireturn
      // 7c: athrow
      // 7d: aload 3
      // 7e: getstatic net/minecraft/class_1802.field_8281 Lnet/minecraft/class_1792;
      // 81: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 84: iload 2
      // 85: ifne ad
      // 88: ifeq 9b
      // 8b: goto 8f
      // 8e: athrow
      // 8f: aload 0
      // 90: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 93: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // 96: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // 99: ireturn
      // 9a: athrow
      // 9b: aload 0
      // 9c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // 9f: iload 2
      // a0: ifne cb
      // a3: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // a6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // a9: goto ad
      // ac: athrow
      // ad: ifeq c7
      // b0: aload 0
      // b1: iload 2
      // b2: ifne c8
      // b5: goto b9
      // b8: athrow
      // b9: aload 1
      // ba: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abb (Lnet/minecraft/class_746;)Z
      // bd: ifeq c7
      // c0: goto c4
      // c3: athrow
      // c4: bipush 1
      // c5: ireturn
      // c6: athrow
      // c7: aload 0
      // c8: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb;
      // cb: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;
      // ce: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabbbb.aaab (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbbaa;)Z
      // d1: iload 2
      // d2: ifne e7
      // d5: ifeq f6
      // d8: goto dc
      // db: athrow
      // dc: aload 3
      // dd: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
      // e0: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // e3: goto e7
      // e6: athrow
      // e7: iload 2
      // e8: ifne f3
      // eb: ifeq f6
      // ee: goto f2
      // f1: athrow
      // f2: bipush 1
      // f3: goto f7
      // f6: bipush 0
      // f7: ireturn
   }

   private void bbbb(class_310 param1) {
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
      // 09: ifnull 1f
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 22
      // 15: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 18: ifnonnull 21
      // 1b: goto 1f
      // 1e: athrow
      // 1f: return
      // 20: athrow
      // 21: aload 1
      // 22: iload 2
      // 23: ifne 4d
      // 26: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 29: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 2c: ifnull 4c
      // 2f: goto 33
      // 32: athrow
      // 33: aload 1
      // 34: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 37: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 3a: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababaa (Lnet/minecraft/class_304;)V
      // 3d: aload 1
      // 3e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 41: getfield net/minecraft/class_315.field_1886 Lnet/minecraft/class_304;
      // 44: bipush 0
      // 45: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 48: goto 4c
      // 4b: athrow
      // 4c: aload 1
      // 4d: iload 2
      // 4e: ifne 6d
      // 51: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 54: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 57: ifnull 77
      // 5a: goto 5e
      // 5d: athrow
      // 5e: aload 1
      // 5f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 62: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 65: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bababaa (Lnet/minecraft/class_304;)V
      // 68: aload 1
      // 69: goto 6d
      // 6c: athrow
      // 6d: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 70: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 73: bipush 0
      // 74: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 77: return
   }

   private boolean aaaaa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa ()J
      // 07: aload 0
      // 08: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabb J
      // 0b: lcmp
      // 0c: iload 1
      // 0d: ifne 44
      // 10: ifne 43
      // 13: goto 17
      // 16: athrow
      // 17: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aab ()J
      // 1a: aload 0
      // 1b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbbb J
      // 1e: lcmp
      // 1f: iload 1
      // 20: ifne 44
      // 23: goto 27
      // 26: athrow
      // 27: ifne 43
      // 2a: goto 2e
      // 2d: athrow
      // 2e: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 31: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aabbbab (Lnet/minecraft/class_310;)Z
      // 34: iload 1
      // 35: ifne 44
      // 38: goto 3c
      // 3b: athrow
      // 3c: ifeq 47
      // 3f: goto 43
      // 42: athrow
      // 43: bipush 1
      // 44: goto 48
      // 47: bipush 0
      // 48: ireturn
   }

   private void aaaab(class_310 param1) {
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
      // 006: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba (Lnet/minecraft/class_310;)Z
      // 009: ifne 00e
      // 00c: return
      // 00d: athrow
      // 00e: aload 1
      // 00f: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 012: checkcast net/minecraft/class_3965
      // 015: astore 3
      // 016: aload 0
      // 017: aload 1
      // 018: aload 3
      // 019: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 01c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 01f: istore 4
      // 021: iload 4
      // 023: ifeq 031
      // 026: aload 3
      // 027: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 02a: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 02d: goto 03f
      // 030: athrow
      // 031: aload 3
      // 032: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 035: aload 3
      // 036: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 039: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 03c: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 03f: astore 5
      // 041: aload 1
      // 042: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 045: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 048: astore 6
      // 04a: iload 4
      // 04c: iload 2
      // 04d: ifne 058
      // 050: ifeq 05b
      // 053: goto 057
      // 056: athrow
      // 057: bipush -1
      // 058: goto 064
      // 05b: aload 0
      // 05c: aload 6
      // 05e: getstatic net/minecraft/class_1802.field_8281 Lnet/minecraft/class_1792;
      // 061: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaaa (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 064: istore 7
      // 066: aload 0
      // 067: aload 6
      // 069: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 06c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaaa (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 06f: istore 8
      // 071: aload 0
      // 072: aload 1
      // 073: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbbb (Lnet/minecraft/class_310;)V
      // 076: aload 0
      // 077: aload 1
      // 078: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaabb (Lnet/minecraft/class_310;)Z
      // 07b: istore 9
      // 07d: aload 0
      // 07e: iload 8
      // 080: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbb I
      // 083: aload 0
      // 084: aload 5
      // 086: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaa Lnet/minecraft/class_2338;
      // 089: aload 0
      // 08a: aload 0
      // 08b: aload 5
      // 08d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 090: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaab Lnet/minecraft/class_3965;
      // 093: aload 0
      // 094: iload 4
      // 096: ifeq 09e
      // 099: aconst_null
      // 09a: goto 09f
      // 09d: athrow
      // 09e: aload 3
      // 09f: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaaa Lnet/minecraft/class_3965;
      // 0a2: iload 2
      // 0a3: ifne 101
      // 0a6: aload 0
      // 0a7: invokestatic java/lang/System.currentTimeMillis ()J
      // 0aa: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baa J
      // 0ad: aload 0
      // 0ae: ldc_w -879059594
      // 0b1: ldc_w -2102147154
      // 0b4: ldc_w 1713950016
      // 0b7: ixor
      // 0b8: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.a (II)I
      // 0bb: ldc2_w 8743967248540265310
      // 0be: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aa (IJ)J
      // 0c1: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaaa J
      // 0c4: iload 4
      // 0c6: ifeq 0f3
      // 0c9: goto 0cd
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: aload 1
      // 0cf: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abba (Lnet/minecraft/class_310;)V
      // 0d2: aload 0
      // 0d3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 0d6: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 0d9: if_acmpne 0f2
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: iload 9
      // 0e2: ifne 0f2
      // 0e5: goto 0e9
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: aload 1
      // 0eb: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.babaa (Lnet/minecraft/class_310;)V
      // 0ee: goto 0f2
      // 0f1: athrow
      // 0f2: return
      // 0f3: aload 0
      // 0f4: iload 7
      // 0f6: iload 2
      // 0f7: ifne 116
      // 0fa: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baab I
      // 0fd: goto 101
      // 100: athrow
      // 101: aload 0
      // 102: aload 1
      // 103: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 106: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 109: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abaabaa (Lnet/minecraft/class_1661;)I
      // 10c: iload 7
      // 10e: if_icmpeq 119
      // 111: bipush 1
      // 112: goto 116
      // 115: athrow
      // 116: goto 11a
      // 119: bipush 0
      // 11a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abba Z
      // 11d: aload 0
      // 11e: invokestatic java/lang/System.currentTimeMillis ()J
      // 121: aload 0
      // 122: iload 2
      // 123: ifne 135
      // 126: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abba Z
      // 129: ifeq 13f
      // 12c: goto 130
      // 12f: athrow
      // 130: aload 0
      // 131: goto 135
      // 134: athrow
      // 135: aload 0
      // 136: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 139: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 13c: goto 140
      // 13f: lconst_0
      // 140: ladd
      // 141: aload 0
      // 142: aload 0
      // 143: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;
      // 146: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaa (Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaabbbab;)J
      // 149: ladd
      // 14a: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaaa J
      // 14d: aload 0
      // 14e: iload 2
      // 14f: ifne 166
      // 152: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 155: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 158: iload 9
      // 15a: ifne 16a
      // 15d: goto 161
      // 160: athrow
      // 161: aload 0
      // 162: goto 166
      // 165: athrow
      // 166: aload 1
      // 167: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbab (Lnet/minecraft/class_310;)V
      // 16a: return
   }

   private boolean aaaba(class_310 param1, class_3965 param2) {
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
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 36
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 36
      // 17: aload 2
      // 18: iload 3
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnull 36
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 2b: iload 3
      // 2c: ifne 3e
      // 2f: ifnonnull 39
      // 32: goto 36
      // 35: athrow
      // 36: bipush 0
      // 37: ireturn
      // 38: athrow
      // 39: aload 0
      // 3a: aload 1
      // 3b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baabb (Lnet/minecraft/class_310;)Lnet/minecraft/class_243;
      // 3e: astore 4
      // 40: aload 1
      // 41: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 44: invokevirtual net/minecraft/class_746.method_55754 ()D
      // 47: ldc2_w 0.1
      // 4a: dsub
      // 4b: dstore 5
      // 4d: dload 5
      // 4f: iload 3
      // 50: ifne 69
      // 53: dconst_0
      // 54: dcmpl
      // 55: ifle 7e
      // 58: goto 5c
      // 5b: athrow
      // 5c: aload 4
      // 5e: aload 2
      // 5f: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 62: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 65: goto 69
      // 68: athrow
      // 69: dload 5
      // 6b: dload 5
      // 6d: dmul
      // 6e: dcmpg
      // 6f: iload 3
      // 70: ifne 7b
      // 73: ifgt 7e
      // 76: goto 7a
      // 79: athrow
      // 7a: bipush 1
      // 7b: goto 7f
      // 7e: bipush 0
      // 7f: ireturn
   }

   private boolean aaabb(class_310 param1) {
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
      // 09: ifnull 48
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: iload 2
      // 12: ifne 24
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: ifnull 48
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 1
      // 20: goto 24
      // 23: athrow
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 2b: ifnull 48
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: iload 2
      // 38: ifne 4c
      // 3b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3e: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // 41: ifne 4b
      // 44: goto 48
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
      // 4a: athrow
      // 4b: aload 1
      // 4c: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 4f: aload 1
      // 50: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 53: invokevirtual net/minecraft/class_636.method_2897 (Lnet/minecraft/class_1657;)V
      // 56: bipush 1
      // 57: ireturn
   }

   private void aabab(class_310 param1, class_239 param2) {
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
      // 05: ifnull 10
      // 08: aload 2
      // 09: ifnonnull 12
      // 0c: goto 10
      // 0f: athrow
      // 10: return
      // 11: athrow
      // 12: aload 0
      // 13: iload 3
      // 14: ifne 33
      // 17: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaa Z
      // 1a: ifne 2d
      // 1d: goto 21
      // 20: athrow
      // 21: aload 0
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 26: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaab Lnet/minecraft/class_239;
      // 29: goto 2d
      // 2c: athrow
      // 2d: aload 1
      // 2e: aload 2
      // 2f: putfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 32: aload 0
      // 33: bipush 1
      // 34: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaa Z
      // 37: return
   }

   public boolean aabba(class_310 param1) {
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
      // 06: ifne 18
      // 09: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.babbaab ()Z
      // 0c: ifeq 3e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaab ()Z
      // 1b: iload 2
      // 1c: ifne 3b
      // 1f: ifne 3a
      // 22: goto 26
      // 25: athrow
      // 26: aload 0
      // 27: aload 1
      // 28: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba (Lnet/minecraft/class_310;)Z
      // 2b: iload 2
      // 2c: ifne 3b
      // 2f: goto 33
      // 32: athrow
      // 33: ifeq 3e
      // 36: goto 3a
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   private int abaaa(class_1661 param1, class_1792 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: bipush 0
      // 04: istore 4
      // 06: istore 3
      // 07: iload 4
      // 09: ldc_w -879059593
      // 0c: ldc_w 1298551883
      // 0f: ldc_w 1125452485
      // 12: ixor
      // 13: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.a (II)I
      // 16: ldc2_w 8126147500454253383
      // 19: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.ababb (IJ)I
      // 1c: if_icmpge 46
      // 1f: aload 1
      // 20: iload 4
      // 22: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 25: aload 2
      // 26: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 29: iload 3
      // 2a: ifne 47
      // 2d: iload 3
      // 2e: ifne 3e
      // 31: goto 35
      // 34: athrow
      // 35: ifeq 3f
      // 38: goto 3c
      // 3b: athrow
      // 3c: iload 4
      // 3e: ireturn
      // 3f: iinc 4 1
      // 42: iload 3
      // 43: ifeq 07
      // 46: bipush -1
      // 47: ireturn
   }

   private static int ababb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-879059596, 1664847471 ^ 1488032967);
      if (aabaa[var3] == null) {
         aabaa[var3] = (int)(aaabb[var3] ^ var1);
      }

      return aabaa[var3];
   }

   private static boolean abbaa(boolean[] var0, class_310 var1, class_3965 var2) {
      var0[0] = true;
      return aabbabbbb.bbababa(var1, var2);
   }

   @Override
   public void abaab() {
      this.abab();
   }

   private static String abbab(int var0, int var1) {
      int var9 = -1954532782;
      int var2 = (var0 ^ a(-879059595, var9 ^ -473851135)) & a(-879059598, var9 ^ -772087237);
      if (baaaa[var2] == null) {
         char[] var3 = aab[var2].toCharArray();

         int var4 = switch (var3[0] & a(-879059597, var9 ^ -1974858823)) {
            case 0 -> a(-879059600, var9 ^ 1850615451);
            case 1 -> a(-879059599, var9 ^ 2019012294);
            case 2 -> a(-879059586, var9 ^ -1956121116);
            case 3 -> a(-879059585, var9 ^ 182767447);
            case 4 -> a(-879059588, var9 ^ 259001393);
            case 5 -> a(-879059587, var9 ^ 992608191);
            case 6 -> a(-879059590, var9 ^ 2063256210);
            case 7 -> a(-879059589, var9 ^ -422815516);
            case 8 -> a(-879059592, var9 ^ 1957236291);
            case 9 -> a(-879059591, var9 ^ -1787915106);
            case 10 -> a(-879059706, var9 ^ 1763082478);
            case 11 -> a(-879059705, var9 ^ -1047993494);
            case 12 -> a(-879059708, var9 ^ 1154121871);
            case 13 -> a(-879059707, var9 ^ 894901734);
            case 14 -> a(-879059710, var9 ^ 509662584);
            case 15 -> a(-879059709, var9 ^ -1094537782);
            case 16 -> a(-879059712, var9 ^ -671736556);
            case 17 -> a(-879059711, var9 ^ 111192158);
            case 18 -> a(-879059698, var9 ^ -627277280);
            case 19 -> a(-879059697, var9 ^ 1918435318);
            case 20 -> a(-879059700, var9 ^ 1115909490);
            case 21 -> a(-879059699, var9 ^ 80923450);
            case 22 -> a(-879059702, var9 ^ -2121227093);
            case 23 -> a(-879059701, var9 ^ -1709732302);
            case 24 -> a(-879059704, var9 ^ 123126406);
            case 25 -> a(-879059703, var9 ^ 1403862355);
            case 26 -> a(-879059690, var9 ^ 769776218);
            case 27 -> a(-879059689, var9 ^ 1386618015);
            case 28 -> a(-879059692, var9 ^ -1216997880);
            case 29 -> a(-879059691, var9 ^ 667007926);
            case 30 -> a(-879059694, var9 ^ -890722079);
            case 31 -> a(-879059693, var9 ^ -678569684);
            case 32 -> a(-879059696, var9 ^ -198398161);
            case 33 -> a(-879059695, var9 ^ 729014091);
            case 34 -> a(-879059682, var9 ^ -1503946368);
            case 35 -> a(-879059681, var9 ^ 724856924);
            case 36 -> a(-879059684, var9 ^ -1587190111);
            case 37 -> a(-879059683, var9 ^ -1388899519);
            case 38 -> a(-879059686, var9 ^ 979601283);
            case 39 -> a(-879059685, var9 ^ -1747246568);
            case 40 -> a(-879059688, var9 ^ -83939131);
            case 41 -> a(-879059687, var9 ^ 1601262360);
            case 42 -> a(-879059674, var9 ^ -2040779847);
            case 43 -> a(-879059673, var9 ^ -1724505694);
            case 44 -> a(-879059676, var9 ^ -1317648033);
            case 45 -> a(-879059675, var9 ^ -1591542366);
            case 46 -> a(-879059678, var9 ^ 1436223409);
            case 47 -> a(-879059677, var9 ^ 143762537);
            case 48 -> a(-879059680, var9 ^ 1031100925);
            case 49 -> a(-879059679, var9 ^ 1655564455);
            case 50 -> a(-879059666, var9 ^ -1288571376);
            case 51 -> 3;
            case 52 -> a(-879059665, var9 ^ -293508456);
            case 53 -> a(-879059668, var9 ^ -318308049);
            case 54 -> a(-879059667, var9 ^ 1878202122);
            case 55 -> a(-879059670, var9 ^ -1129072941);
            case 56 -> a(-879059669, var9 ^ -454077525);
            case 57 -> a(-879059672, var9 ^ 1884852694);
            case 58 -> a(-879059671, var9 ^ -1620481935);
            case 59 -> a(-879059658, var9 ^ -377807430);
            case 60 -> a(-879059657, var9 ^ -2021633144);
            case 61 -> a(-879059660, var9 ^ -340480160);
            case 62 -> a(-879059659, var9 ^ 1158394691);
            case 63 -> a(-879059662, var9 ^ 1740991101);
            case 64 -> a(-879059661, var9 ^ -1603551885);
            case 65 -> a(-879059664, var9 ^ 2116916740);
            case 66 -> a(-879059663, var9 ^ 858657138);
            case 67 -> a(-879059650, var9 ^ 1921912677);
            case 68 -> a(-879059649, var9 ^ -228203662);
            case 69 -> a(-879059652, var9 ^ 1630767696);
            case 70 -> a(-879059651, var9 ^ -1112553821);
            case 71 -> a(-879059654, var9 ^ 1866529525);
            case 72 -> a(-879059653, var9 ^ 60710891);
            case 73 -> a(-879059656, var9 ^ -462592366);
            case 74 -> a(-879059655, var9 ^ 743369629);
            case 75 -> a(-879059514, var9 ^ 1538419654);
            case 76 -> a(-879059513, var9 ^ -1266734612);
            case 77 -> a(-879059516, var9 ^ -1322587254);
            case 78 -> a(-879059515, var9 ^ 823006970);
            case 79 -> a(-879059518, var9 ^ -1904495379);
            case 80 -> a(-879059517, var9 ^ 678524559);
            case 81 -> a(-879059520, var9 ^ 1105718695);
            case 82 -> a(-879059519, var9 ^ -830891669);
            case 83 -> a(-879059506, var9 ^ -1285764838);
            case 84 -> a(-879059505, var9 ^ -643154097);
            case 85 -> a(-879059508, var9 ^ 88528126);
            case 86 -> a(-879059507, var9 ^ 581985405);
            case 87 -> a(-879059510, var9 ^ -965930473);
            case 88 -> a(-879059509, var9 ^ -110294069);
            case 89 -> a(-879059512, var9 ^ -231787132);
            case 90 -> a(-879059511, var9 ^ -1090574596);
            case 91 -> a(-879059498, var9 ^ 2140153137);
            case 92 -> a(-879059497, var9 ^ 2019279444);
            case 93 -> a(-879059500, var9 ^ 1909000985);
            case 94 -> a(-879059499, var9 ^ 1109314776);
            case 95 -> a(-879059502, var9 ^ 1568913227);
            case 96 -> a(-879059501, var9 ^ 561723957);
            case 97 -> a(-879059504, var9 ^ -1096812117);
            case 98 -> a(-879059503, var9 ^ -74599571);
            case 99 -> a(-879059490, var9 ^ -532622665);
            case 100 -> a(-879059489, var9 ^ -756677157);
            case 101 -> a(-879059492, var9 ^ -1678358319);
            case 102 -> a(-879059491, var9 ^ -95111984);
            case 103 -> a(-879059494, var9 ^ 948888093);
            case 104 -> a(-879059493, var9 ^ -1510634701);
            case 105 -> a(-879059496, var9 ^ -1540257776);
            case 106 -> a(-879059495, var9 ^ 1391901990);
            case 107 -> a(-879059482, var9 ^ -398137648);
            case 108 -> a(-879059481, var9 ^ 2049331326);
            case 109 -> a(-879059484, var9 ^ 10342790);
            case 110 -> a(-879059483, var9 ^ 72123488);
            case 111 -> a(-879059486, var9 ^ -1687342994);
            case 112 -> a(-879059485, var9 ^ 317081197);
            case 113 -> a(-879059488, var9 ^ 9262862);
            case 114 -> a(-879059487, var9 ^ -709681792);
            case 115 -> a(-879059474, var9 ^ -12681706);
            case 116 -> a(-879059473, var9 ^ -152180399);
            case 117 -> a(-879059476, var9 ^ 298958825);
            case 118 -> a(-879059475, var9 ^ 285782897);
            case 119 -> a(-879059478, var9 ^ -1287404102);
            case 120 -> a(-879059477, var9 ^ 875874460);
            case 121 -> a(-879059480, var9 ^ -1431079966);
            case 122 -> a(-879059479, var9 ^ 356203798);
            case 123 -> a(-879059466, var9 ^ -1370827992);
            case 124 -> a(-879059465, var9 ^ -2128514806);
            case 125 -> a(-879059468, var9 ^ -368218704);
            case 126 -> a(-879059467, var9 ^ -1485115108);
            case 127 -> a(-879059470, var9 ^ -894175947);
            case 128 -> a(-879059469, var9 ^ 1690911786);
            case 129 -> a(-879059472, var9 ^ 1776737286);
            case 130 -> a(-879059471, var9 ^ 2006013751);
            case 131 -> a(-879059458, var9 ^ 1750255789);
            case 132 -> a(-879059457, var9 ^ 1243946558);
            case 133 -> a(-879059460, var9 ^ 1588888280);
            case 134 -> a(-879059459, var9 ^ -616203489);
            case 135 -> a(-879059462, var9 ^ -1430846763);
            case 136 -> a(-879059461, var9 ^ -34745364);
            case 137 -> a(-879059464, var9 ^ 312610347);
            case 138 -> a(-879059463, var9 ^ 185843434);
            case 139 -> a(-879059578, var9 ^ -1154935474);
            case 140 -> a(-879059577, var9 ^ 1025858010);
            case 141 -> a(-879059580, var9 ^ 318758488);
            case 142 -> a(-879059579, var9 ^ -1768645171);
            case 143 -> a(-879059582, var9 ^ -614653483);
            case 144 -> a(-879059581, var9 ^ 639916864);
            case 145 -> a(-879059584, var9 ^ -1030770713);
            case 146 -> a(-879059583, var9 ^ -1060337059);
            case 147 -> a(-879059570, var9 ^ -296086051);
            case 148 -> a(-879059569, var9 ^ 1309865979);
            case 149 -> a(-879059572, var9 ^ 241914315);
            case 150 -> a(-879059571, var9 ^ -1670222339);
            case 151 -> a(-879059574, var9 ^ -1732412774);
            case 152 -> a(-879059573, var9 ^ 2134832867);
            case 153 -> a(-879059576, var9 ^ -786752553);
            case 154 -> a(-879059575, var9 ^ 1802903279);
            case 155 -> a(-879059562, var9 ^ 1372879767);
            case 156 -> a(-879059561, var9 ^ 202331901);
            case 157 -> a(-879059564, var9 ^ -642286971);
            case 158 -> a(-879059563, var9 ^ 1918311294);
            case 159 -> a(-879059566, var9 ^ 100987319);
            case 160 -> a(-879059565, var9 ^ -1008650711);
            case 161 -> a(-879059568, var9 ^ 1932514507);
            case 162 -> 4;
            case 163 -> a(-879059567, var9 ^ -794377008);
            case 164 -> a(-879059554, var9 ^ -783034874);
            case 165 -> a(-879059553, var9 ^ -302432076);
            case 166 -> a(-879059556, var9 ^ -1950081710);
            case 167 -> a(-879059555, var9 ^ -1272068755);
            case 168 -> a(-879059558, var9 ^ 1709850816);
            case 169 -> a(-879059557, var9 ^ 1260443346);
            case 170 -> a(-879059560, var9 ^ 1657485017);
            case 171 -> a(-879059559, var9 ^ 237150091);
            case 172 -> a(-879059546, var9 ^ -850961617);
            case 173 -> a(-879059545, var9 ^ 530167626);
            case 174 -> a(-879059548, var9 ^ -22446534);
            case 175 -> a(-879059547, var9 ^ -2048571572);
            case 176 -> a(-879059550, var9 ^ 686954969);
            case 177 -> a(-879059549, var9 ^ 1346906725);
            case 178 -> a(-879059552, var9 ^ -1224973766);
            case 179 -> a(-879059551, var9 ^ -263149112);
            case 180 -> a(-879059538, var9 ^ -46107774);
            case 181 -> a(-879059537, var9 ^ 259440663);
            case 182 -> a(-879059540, var9 ^ -1534048644);
            case 183 -> a(-879059539, var9 ^ -430512506);
            case 184 -> a(-879059542, var9 ^ -1139625742);
            case 185 -> a(-879059541, var9 ^ 1097325140);
            case 186 -> a(-879059544, var9 ^ -703498588);
            case 187 -> a(-879059543, var9 ^ 1607305219);
            case 188 -> a(-879059530, var9 ^ -1113864265);
            case 189 -> 0;
            case 190 -> a(-879059529, var9 ^ -2080373161);
            case 191 -> a(-879059532, var9 ^ -1979071469);
            case 192 -> a(-879059531, var9 ^ 863373692);
            case 193 -> a(-879059534, var9 ^ 1456286473);
            case 194 -> a(-879059533, var9 ^ -569439456);
            case 195 -> a(-879059536, var9 ^ -277521118);
            case 196 -> a(-879059535, var9 ^ -1465599186);
            case 197 -> a(-879059522, var9 ^ -138742447);
            case 198 -> a(-879059521, var9 ^ 720458662);
            case 199 -> a(-879059524, var9 ^ 238350139);
            case 200 -> a(-879059523, var9 ^ -304664151);
            case 201 -> a(-879059526, var9 ^ -792265644);
            case 202 -> a(-879059525, var9 ^ -1699937236);
            case 203 -> a(-879059528, var9 ^ 1317955829);
            case 204 -> a(-879059527, var9 ^ 1281462714);
            case 205 -> a(-879059898, var9 ^ -1042518800);
            case 206 -> a(-879059897, var9 ^ 806170245);
            case 207 -> a(-879059900, var9 ^ -1785639514);
            case 208 -> a(-879059899, var9 ^ -506736568);
            case 209 -> a(-879059902, var9 ^ -282699226);
            case 210 -> a(-879059901, var9 ^ 924464927);
            case 211 -> a(-879059904, var9 ^ -699543647);
            case 212 -> a(-879059903, var9 ^ -1012032120);
            case 213 -> a(-879059890, var9 ^ -718877158);
            case 214 -> a(-879059889, var9 ^ -186757364);
            case 215 -> a(-879059892, var9 ^ 1725223696);
            case 216 -> a(-879059891, var9 ^ -718164787);
            case 217 -> a(-879059894, var9 ^ 301143958);
            case 218 -> a(-879059893, var9 ^ 1623337113);
            case 219 -> a(-879059896, var9 ^ -2111445754);
            case 220 -> a(-879059895, var9 ^ 126798051);
            case 221 -> a(-879059882, var9 ^ 1641876126);
            case 222 -> a(-879059881, var9 ^ 758078752);
            case 223 -> a(-879059884, var9 ^ -717170962);
            case 224 -> a(-879059883, var9 ^ 808714601);
            case 225 -> a(-879059886, var9 ^ 540143247);
            case 226 -> a(-879059885, var9 ^ 1759413279);
            case 227 -> a(-879059888, var9 ^ 1143472317);
            case 228 -> a(-879059887, var9 ^ -1301942566);
            case 229 -> a(-879059874, var9 ^ 1191404355);
            case 230 -> a(-879059873, var9 ^ -2062543553);
            case 231 -> a(-879059876, var9 ^ -1684028592);
            case 232 -> a(-879059875, var9 ^ 1515372630);
            case 233 -> a(-879059878, var9 ^ 1259362779);
            case 234 -> a(-879059877, var9 ^ -1163101617);
            case 235 -> a(-879059880, var9 ^ -1646056677);
            case 236 -> a(-879059879, var9 ^ 368450771);
            case 237 -> a(-879059866, var9 ^ -1874666073);
            case 238 -> a(-879059865, var9 ^ -1592837261);
            case 239 -> a(-879059868, var9 ^ 1044533440);
            case 240 -> a(-879059867, var9 ^ -1898291544);
            case 241 -> a(-879059870, var9 ^ -905531542);
            case 242 -> a(-879059869, var9 ^ -2020916465);
            case 243 -> a(-879059872, var9 ^ -112366760);
            case 244 -> a(-879059871, var9 ^ 2031306412);
            case 245 -> a(-879059858, var9 ^ 1580887360);
            case 246 -> 1;
            case 247 -> 2;
            case 248 -> a(-879059857, var9 ^ 1129721725);
            case 249 -> a(-879059860, var9 ^ 1618206393);
            case 250 -> a(-879059859, var9 ^ -776764501);
            case 251 -> a(-879059862, var9 ^ 1800897685);
            case 252 -> 5;
            case 253 -> a(-879059861, var9 ^ 932204347);
            case 254 -> a(-879059864, var9 ^ 451181971);
            default -> a(-879059863, var9 ^ 332865088);
         };
         int var5 = (var1 & a(-879059850, var9 ^ -802802981)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & a(-879059849, var9 ^ -1150594748)) >>> a(-879059852, var9 ^ -459572129)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & a(-879059851, var9 ^ 1690237058);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & a(-879059854, var9 ^ -59514286);
            }
         }

         baaaa[var2] = new String(var3).intern();
      }

      return baaaa[var2];
   }

   private class_243 abbba(class_310 param1, class_1511 param2) {
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
      // 05: iload 3
      // 06: ifne 11
      // 09: ifnull 2e
      // 0c: goto 10
      // 0f: athrow
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnull 2e
      // 17: aload 2
      // 18: iload 3
      // 19: ifne 28
      // 1c: goto 20
      // 1f: athrow
      // 20: ifnull 2e
      // 23: goto 27
      // 26: athrow
      // 27: aload 2
      // 28: invokevirtual net/minecraft/class_1511.method_31481 ()Z
      // 2b: ifeq 31
      // 2e: aconst_null
      // 2f: areturn
      // 30: athrow
      // 31: aload 0
      // 32: aload 1
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baabb (Lnet/minecraft/class_310;)Lnet/minecraft/class_243;
      // 36: astore 4
      // 38: aload 2
      // 39: invokevirtual net/minecraft/class_1511.method_5829 ()Lnet/minecraft/class_238;
      // 3c: astore 5
      // 3e: aload 4
      // 40: aload 5
      // 42: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbb (Lnet/minecraft/class_243;Lnet/minecraft/class_238;)Lnet/minecraft/class_243;
      // 45: astore 6
      // 47: aload 1
      // 48: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4b: invokevirtual net/minecraft/class_746.method_55755 ()D
      // 4e: dstore 7
      // 50: dload 7
      // 52: ldc2_w 0.1
      // 55: dsub
      // 56: dstore 9
      // 58: dload 9
      // 5a: dconst_0
      // 5b: iload 3
      // 5c: ifne 7f
      // 5f: dcmpg
      // 60: ifle 83
      // 63: goto 67
      // 66: athrow
      // 67: aload 4
      // 69: iload 3
      // 6a: ifne 93
      // 6d: goto 71
      // 70: athrow
      // 71: aload 6
      // 73: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 76: dload 9
      // 78: dload 9
      // 7a: dmul
      // 7b: goto 7f
      // 7e: athrow
      // 7f: dcmpl
      // 80: ifle 86
      // 83: aconst_null
      // 84: areturn
      // 85: athrow
      // 86: aload 6
      // 88: aload 5
      // 8a: invokevirtual net/minecraft/class_238.method_1005 ()Lnet/minecraft/class_243;
      // 8d: ldc2_w 1.0E-4
      // 90: invokevirtual net/minecraft/class_243.method_35590 (Lnet/minecraft/class_243;D)Lnet/minecraft/class_243;
      // 93: areturn
   }

   private void abbbb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: iload 2
      // 05: aload 0
      // 06: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaaa Lnet/minecraft/class_3965;
      // 09: astore 3
      // 0a: ifne 43
      // 0d: aload 1
      // 0e: ifnull 3b
      // 11: goto 15
      // 14: athrow
      // 15: aload 1
      // 16: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 19: ifnull 3b
      // 1c: goto 20
      // 1f: athrow
      // 20: aload 3
      // 21: ifnull 3b
      // 24: goto 28
      // 27: athrow
      // 28: aload 0
      // 29: iload 2
      // 2a: ifne 45
      // 2d: goto 31
      // 30: athrow
      // 31: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baab I
      // 34: ifge 44
      // 37: goto 3b
      // 3a: athrow
      // 3b: aload 0
      // 3c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 3f: goto 43
      // 42: athrow
      // 43: return
      // 44: aload 0
      // 45: aload 1
      // 46: aload 3
      // 47: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 4a: iload 2
      // 4b: ifne 5c
      // 4e: ifne 5b
      // 51: goto 55
      // 54: athrow
      // 55: aload 0
      // 56: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 59: return
      // 5a: athrow
      // 5b: bipush 1
      // 5c: newarray 4
      // 5e: dup
      // 5f: bipush 0
      // 60: bipush 0
      // 61: bastore
      // 62: astore 4
      // 64: aload 1
      // 65: aload 0
      // 66: aload 0
      // 67: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baab I
      // 6a: aload 4
      // 6c: aload 1
      // 6d: aload 3
      // 6e: invokedynamic getAsBoolean ([ZLnet/minecraft/class_310;Lnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbaa ([ZLnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z, ()Z ]
      // 73: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbaa (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 76: istore 5
      // 78: aload 4
      // 7a: bipush 0
      // 7b: baload
      // 7c: iload 2
      // 7d: ifne 8a
      // 80: ifne 88
      // 83: goto 87
      // 86: athrow
      // 87: return
      // 88: iload 5
      // 8a: ifne 93
      // 8d: aload 0
      // 8e: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 91: return
      // 92: athrow
      // 93: aload 0
      // 94: bipush 1
      // 95: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbba Z
      // 98: aload 0
      // 99: aload 1
      // 9a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9d: getfield net/minecraft/class_746.field_6012 I
      // a0: ldc_w -879059853
      // a3: ldc_w 1218548160
      // a6: ldc_w 363007804
      // a9: ixor
      // aa: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.a (II)I
      // ad: ldc2_w 8871024395388439748
      // b0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.ababb (IJ)I
      // b3: iadd
      // b4: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.ababb I
      // b7: aload 0
      // b8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // bb: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // be: aload 0
      // bf: aload 1
      // c0: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaba (Lnet/minecraft/class_310;)V
      // c3: return
   }

   @Override
   public void abbbba(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 0
      // 005: iload 2
      // 006: ifne 03c
      // 009: aload 1
      // 00a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aab (Lnet/minecraft/class_310;)Z
      // 00d: ifne 01f
      // 010: goto 014
      // 013: athrow
      // 014: aload 0
      // 015: aload 1
      // 016: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bba (Lnet/minecraft/class_310;)V
      // 019: aload 0
      // 01a: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 01d: return
      // 01e: athrow
      // 01f: aload 0
      // 020: iload 2
      // 021: ifne 05f
      // 024: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbbaa ()J
      // 027: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabb J
      // 02a: aload 0
      // 02b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.aab ()J
      // 02e: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abbbb J
      // 031: aload 0
      // 032: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 035: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 038: goto 03c
      // 03b: athrow
      // 03c: checkcast java/lang/Boolean
      // 03f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 042: ifeq 05e
      // 045: aload 1
      // 046: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 049: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 04c: ifne 05e
      // 04f: goto 053
      // 052: athrow
      // 053: aload 0
      // 054: aload 1
      // 055: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bba (Lnet/minecraft/class_310;)V
      // 058: aload 0
      // 059: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 05c: return
      // 05d: athrow
      // 05e: aload 0
      // 05f: iload 2
      // 060: ifne 15c
      // 063: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 066: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.bb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 069: if_acmpeq 15b
      // 06c: goto 070
      // 06f: athrow
      // 070: aload 0
      // 071: aload 1
      // 072: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbbb (Lnet/minecraft/class_310;)V
      // 075: aload 0
      // 076: aload 1
      // 077: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaabb (Lnet/minecraft/class_310;)Z
      // 07a: ifeq 083
      // 07d: goto 081
      // 080: athrow
      // 081: return
      // 082: athrow
      // 083: invokestatic java/lang/System.currentTimeMillis ()J
      // 086: lstore 3
      // 087: aload 0
      // 088: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 08b: iload 2
      // 08c: ifne 0ae
      // 08f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.abb Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 092: if_acmpne 0a6
      // 095: goto 099
      // 098: athrow
      // 099: aload 0
      // 09a: aload 1
      // 09b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbab (Lnet/minecraft/class_310;)V
      // 09e: iload 2
      // 09f: ifeq 15a
      // 0a2: goto 0a6
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 0aa: goto 0ae
      // 0ad: athrow
      // 0ae: iload 2
      // 0af: ifne 0d9
      // 0b2: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.aaa Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 0b5: if_acmpne 0c9
      // 0b8: goto 0bc
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: aload 1
      // 0be: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaba (Lnet/minecraft/class_310;)V
      // 0c1: iload 2
      // 0c2: ifeq 15a
      // 0c5: goto 0c9
      // 0c8: athrow
      // 0c9: aload 0
      // 0ca: iload 2
      // 0cb: ifne 0fe
      // 0ce: goto 0d2
      // 0d1: athrow
      // 0d2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 0d5: goto 0d9
      // 0d8: athrow
      // 0d9: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 0dc: if_acmpne 0f9
      // 0df: lload 3
      // 0e0: aload 0
      // 0e1: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab J
      // 0e4: lcmp
      // 0e5: iflt 0f9
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: aload 1
      // 0ee: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abba (Lnet/minecraft/class_310;)V
      // 0f1: iload 2
      // 0f2: ifeq 15a
      // 0f5: goto 0f9
      // 0f8: athrow
      // 0f9: aload 0
      // 0fa: goto 0fe
      // 0fd: athrow
      // 0fe: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 101: iload 2
      // 102: ifne 124
      // 105: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 108: if_acmpne 11c
      // 10b: goto 10f
      // 10e: athrow
      // 10f: aload 0
      // 110: aload 1
      // 111: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.babaa (Lnet/minecraft/class_310;)V
      // 114: iload 2
      // 115: ifeq 15a
      // 118: goto 11c
      // 11b: athrow
      // 11c: aload 0
      // 11d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 120: goto 124
      // 123: athrow
      // 124: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 127: if_acmpne 15a
      // 12a: lload 3
      // 12b: aload 0
      // 12c: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baba J
      // 12f: lcmp
      // 130: iload 2
      // 131: ifne 14a
      // 134: goto 138
      // 137: athrow
      // 138: iflt 15a
      // 13b: goto 13f
      // 13e: athrow
      // 13f: aload 1
      // 140: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 143: getfield net/minecraft/class_746.field_6012 I
      // 146: goto 14a
      // 149: athrow
      // 14a: aload 0
      // 14b: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabab I
      // 14e: if_icmplt 15a
      // 151: aload 0
      // 152: aload 1
      // 153: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bab (Lnet/minecraft/class_310;)V
      // 156: goto 15a
      // 159: athrow
      // 15a: return
      // 15b: aload 0
      // 15c: aload 1
      // 15d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaab (Lnet/minecraft/class_310;)V
      // 160: return
   }

   public void baaaa(class_310 var1) {
      this.bba(var1);
      this.abab();
   }

   private class_3965 baaab(class_2338 var1) {
      try {
         if (var1 == null) {
            return null;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      class_243 var2 = new class_243(var1.method_10263() + 0.5, var1.method_10264() + 1.0, var1.method_10260() + 0.5);
      return new class_3965(var2, class_2350.field_11036, var1, false);
   }

   private void baaba(class_310 param1) {
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
      // 06: ifne 42
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaa Lnet/minecraft/class_2338;
      // 0c: ifnull 3d
      // 0f: goto 13
      // 12: athrow
      // 13: aload 1
      // 14: iload 2
      // 15: ifne 24
      // 18: goto 1c
      // 1b: athrow
      // 1c: ifnull 3d
      // 1f: goto 23
      // 22: athrow
      // 23: aload 1
      // 24: iload 2
      // 25: ifne 37
      // 28: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2b: ifnull 3d
      // 2e: goto 32
      // 31: athrow
      // 32: aload 1
      // 33: goto 37
      // 36: athrow
      // 37: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3a: ifnonnull 46
      // 3d: aload 0
      // 3e: goto 42
      // 41: athrow
      // 42: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 45: return
      // 46: aload 0
      // 47: iload 2
      // 48: ifne 9d
      // 4b: aload 1
      // 4c: aload 0
      // 4d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaa Lnet/minecraft/class_2338;
      // 50: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 53: ifne 75
      // 56: goto 5a
      // 59: athrow
      // 5a: aload 1
      // 5b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5e: getfield net/minecraft/class_746.field_6012 I
      // 61: aload 0
      // 62: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.ababb I
      // 65: if_icmple 74
      // 68: goto 6c
      // 6b: athrow
      // 6c: aload 0
      // 6d: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 70: goto 74
      // 73: athrow
      // 74: return
      // 75: aload 0
      // 76: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 79: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 7c: aload 0
      // 7d: aload 0
      // 7e: aload 0
      // 7f: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaa Lnet/minecraft/class_2338;
      // 82: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaab (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 85: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaab Lnet/minecraft/class_3965;
      // 88: aload 0
      // 89: invokestatic java/lang/System.currentTimeMillis ()J
      // 8c: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab J
      // 8f: aload 0
      // 90: iload 2
      // 91: ifne ab
      // 94: aload 1
      // 95: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abba (Lnet/minecraft/class_310;)V
      // 98: aload 0
      // 99: goto 9d
      // 9c: athrow
      // 9d: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // a0: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.b Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // a3: if_acmpne af
      // a6: aload 0
      // a7: goto ab
      // aa: athrow
      // ab: aload 1
      // ac: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.babaa (Lnet/minecraft/class_310;)V
      // af: return
   }

   private class_243 baabb(class_310 var1) {
      class_746 var2 = var1.field_1724;
      class_243 var3 = var2.method_33571();
      class_243 var4 = new class_243(var2.method_23317(), var2.method_23318(), var2.method_23321());
      return new class_243(
            bbbabaa.baa(var2),
            bbbabaa.aaaba(var2),
            bbbabaa.baba(var2)
         )
         .method_1019(var3.method_1020(var4));
   }

   private void babaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.bbbaba ()Z
      // 07: iload 2
      // 08: ifne 22
      // 0b: ifne 25
      // 0e: goto 12
      // 11: athrow
      // 12: aload 0
      // 13: iload 2
      // 14: ifne 27
      // 17: goto 1b
      // 1a: athrow
      // 1b: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaaa ()Z
      // 1e: goto 22
      // 21: athrow
      // 22: ifeq 26
      // 25: return
      // 26: aload 0
      // 27: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baaa Lnet/minecraft/class_2338;
      // 2a: ifnull 3c
      // 2d: invokestatic java/lang/System.currentTimeMillis ()J
      // 30: aload 0
      // 31: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab J
      // 34: lcmp
      // 35: ifge 3e
      // 38: goto 3c
      // 3b: athrow
      // 3c: return
      // 3d: athrow
      // 3e: aload 0
      // 3f: aload 1
      // 40: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.babbb (Lnet/minecraft/class_310;)V
      // 43: return
   }

   private static boolean babab(class_1297 var0) {
      return var0 instanceof class_1511;
   }

   private static boolean babba(boolean[] var0, class_310 var1, class_3965 var2) {
      var0[0] = true;
      return aabbabbbb.bbababa(var1, var2);
   }

   private void babbb(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: iload 2
      // 005: aload 0
      // 006: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaab Lnet/minecraft/class_3965;
      // 009: astore 3
      // 00a: ifne 043
      // 00d: aload 1
      // 00e: ifnull 03b
      // 011: goto 015
      // 014: athrow
      // 015: aload 1
      // 016: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 019: ifnull 03b
      // 01c: goto 020
      // 01f: athrow
      // 020: aload 3
      // 021: ifnull 03b
      // 024: goto 028
      // 027: athrow
      // 028: aload 0
      // 029: iload 2
      // 02a: ifne 045
      // 02d: goto 031
      // 030: athrow
      // 031: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbb I
      // 034: ifge 044
      // 037: goto 03b
      // 03a: athrow
      // 03b: aload 0
      // 03c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 03f: goto 043
      // 042: athrow
      // 043: return
      // 044: aload 0
      // 045: iload 2
      // 046: ifne 06e
      // 049: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbba Z
      // 04c: ifne 06d
      // 04f: goto 053
      // 052: athrow
      // 053: aload 0
      // 054: aload 1
      // 055: aload 3
      // 056: iload 2
      // 057: ifne 070
      // 05a: goto 05e
      // 05d: athrow
      // 05e: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 061: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 064: ifne 06d
      // 067: goto 06b
      // 06a: athrow
      // 06b: return
      // 06c: athrow
      // 06d: aload 0
      // 06e: aload 1
      // 06f: aload 3
      // 070: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaba (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 073: iload 2
      // 074: ifne 08a
      // 077: ifne 084
      // 07a: goto 07e
      // 07d: athrow
      // 07e: aload 0
      // 07f: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 082: return
      // 083: athrow
      // 084: aload 1
      // 085: aload 3
      // 086: bipush 0
      // 087: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbabbbb.abbbaa (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;Z)Z
      // 08a: iload 2
      // 08b: ifne 097
      // 08e: ifne 096
      // 091: goto 095
      // 094: athrow
      // 095: return
      // 096: bipush 1
      // 097: newarray 4
      // 099: dup
      // 09a: bipush 0
      // 09b: bipush 0
      // 09c: bastore
      // 09d: astore 4
      // 09f: aload 1
      // 0a0: aload 0
      // 0a1: aload 0
      // 0a2: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbb I
      // 0a5: aload 4
      // 0a7: aload 1
      // 0a8: aload 3
      // 0a9: invokedynamic getAsBoolean ([ZLnet/minecraft/class_310;Lnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.babba ([ZLnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z, ()Z ]
      // 0ae: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.abbbbaa (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 0b1: istore 5
      // 0b3: aload 4
      // 0b5: bipush 0
      // 0b6: baload
      // 0b7: iload 2
      // 0b8: ifne 0c5
      // 0bb: ifne 0c3
      // 0be: goto 0c2
      // 0c1: athrow
      // 0c2: return
      // 0c3: iload 5
      // 0c5: iload 2
      // 0c6: ifne 0f3
      // 0c9: ifne 0d6
      // 0cc: goto 0d0
      // 0cf: athrow
      // 0d0: aload 0
      // 0d1: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abab ()V
      // 0d4: return
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: aload 0
      // 0d8: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;
      // 0db: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbbb.bbaaabb (Lnet/minecraft/class_310;Ljava/lang/Object;Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaabba;)V
      // 0de: iload 2
      // 0df: ifne 11a
      // 0e2: aload 0
      // 0e3: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa;
      // 0e6: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaaaaa.abbb ()Ljava/lang/Object;
      // 0e9: checkcast java/lang/Boolean
      // 0ec: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ef: goto 0f3
      // 0f2: athrow
      // 0f3: ifne 0ff
      // 0f6: aload 0
      // 0f7: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 0fa: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 0fd: return
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab.aab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 103: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabab;
      // 106: aload 0
      // 107: aload 1
      // 108: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10b: getfield net/minecraft/class_746.field_6012 I
      // 10e: bipush 1
      // 10f: iadd
      // 110: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabab I
      // 113: aload 0
      // 114: invokestatic java/lang/System.currentTimeMillis ()J
      // 117: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baba J
      // 11a: return
   }

   private boolean bbaaa(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 2
      // 004: aload 1
      // 005: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/bbbbbbaa.aabb (Lnet/minecraft/class_310;)Z
      // 008: iload 2
      // 009: ifne 055
      // 00c: ifne 050
      // 00f: goto 013
      // 012: athrow
      // 013: aload 0
      // 014: aload 1
      // 015: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 018: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.bbba (Lnet/minecraft/class_746;)Z
      // 01b: iload 2
      // 01c: ifne 055
      // 01f: goto 023
      // 022: athrow
      // 023: ifeq 050
      // 026: goto 02a
      // 029: athrow
      // 02a: aload 1
      // 02b: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 02e: astore 4
      // 030: aload 4
      // 032: instanceof net/minecraft/class_3965
      // 035: iload 2
      // 036: ifne 055
      // 039: ifeq 050
      // 03c: goto 040
      // 03f: athrow
      // 040: aload 4
      // 042: checkcast net/minecraft/class_3965
      // 045: astore 3
      // 046: aload 3
      // 047: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 04a: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 04d: if_acmpeq 056
      // 050: bipush 0
      // 051: goto 055
      // 054: athrow
      // 055: ireturn
      // 056: aload 0
      // 057: aload 1
      // 058: aload 3
      // 059: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 05c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 05f: istore 4
      // 061: iload 4
      // 063: iload 2
      // 064: ifne 08b
      // 067: ifne 089
      // 06a: goto 06e
      // 06d: athrow
      // 06e: aload 0
      // 06f: aload 1
      // 070: aload 3
      // 071: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 074: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aaa (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 077: iload 2
      // 078: ifne 08b
      // 07b: goto 07f
      // 07e: athrow
      // 07f: ifne 089
      // 082: goto 086
      // 085: athrow
      // 086: bipush 0
      // 087: ireturn
      // 088: athrow
      // 089: iload 4
      // 08b: ifeq 099
      // 08e: aload 3
      // 08f: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 092: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 095: goto 0a7
      // 098: athrow
      // 099: aload 3
      // 09a: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 09d: aload 3
      // 09e: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 0a1: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 0a4: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 0a7: astore 5
      // 0a9: iload 4
      // 0ab: iload 2
      // 0ac: ifne 0d5
      // 0af: ifeq 0ce
      // 0b2: goto 0b6
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: aload 1
      // 0b8: aload 5
      // 0ba: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0bd: iload 2
      // 0be: ifne 0cd
      // 0c1: goto 0c5
      // 0c4: athrow
      // 0c5: ifne 0f8
      // 0c8: goto 0cc
      // 0cb: athrow
      // 0cc: bipush 0
      // 0cd: ireturn
      // 0ce: aload 0
      // 0cf: aload 1
      // 0d0: aload 5
      // 0d2: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.aabb (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0d5: iload 2
      // 0d6: ifne 0f7
      // 0d9: ifeq 0f6
      // 0dc: goto 0e0
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: aload 1
      // 0e2: aload 5
      // 0e4: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.baab (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0e7: iload 2
      // 0e8: ifne 0f7
      // 0eb: goto 0ef
      // 0ee: athrow
      // 0ef: ifne 0f8
      // 0f2: goto 0f6
      // 0f5: athrow
      // 0f6: bipush 0
      // 0f7: ireturn
      // 0f8: aload 1
      // 0f9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0fc: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 0ff: astore 6
      // 101: iload 4
      // 103: iload 2
      // 104: ifne 133
      // 107: ifne 126
      // 10a: goto 10e
      // 10d: athrow
      // 10e: aload 0
      // 10f: aload 6
      // 111: getstatic net/minecraft/class_1802.field_8281 Lnet/minecraft/class_1792;
      // 114: iload 2
      // 115: ifne 130
      // 118: goto 11c
      // 11b: athrow
      // 11c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaaa (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 11f: iflt 142
      // 122: goto 126
      // 125: athrow
      // 126: aload 0
      // 127: aload 6
      // 129: getstatic net/minecraft/class_1802.field_8301 Lnet/minecraft/class_1792;
      // 12c: goto 130
      // 12f: athrow
      // 130: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baabbbaa.abaaa (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 133: iload 2
      // 134: ifne 13f
      // 137: iflt 142
      // 13a: goto 13e
      // 13d: athrow
      // 13e: bipush 1
      // 13f: goto 143
      // 142: bipush 0
      // 143: ireturn
   }

   private long bbaab(aaabbbab var1) {
      return Math.max(0L, Math.round(Math.max(var1.bab(), var1.abb())));
   }

   private boolean bbaba(class_310 param1, class_2338 param2) {
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
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: iload 3
      // 09: ifne 1f
      // 0c: aload 2
      // 0d: invokevirtual net/minecraft/class_638.method_22347 (Lnet/minecraft/class_2338;)Z
      // 10: ifeq 64
      // 13: goto 17
      // 16: athrow
      // 17: aload 1
      // 18: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aconst_null
      // 20: new net/minecraft/class_238
      // 23: dup
      // 24: aload 2
      // 25: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 28: i2d
      // 29: aload 2
      // 2a: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 2d: i2d
      // 2e: aload 2
      // 2f: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 32: i2d
      // 33: aload 2
      // 34: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 37: i2d
      // 38: dconst_1
      // 39: dadd
      // 3a: aload 2
      // 3b: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 3e: i2d
      // 3f: ldc2_w 2.0
      // 42: dadd
      // 43: aload 2
      // 44: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 47: i2d
      // 48: dconst_1
      // 49: dadd
      // 4a: invokespecial net/minecraft/class_238.<init> (DDDDDD)V
      // 4d: invokevirtual net/minecraft/class_638.method_8335 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/util/List;
      // 50: invokeinterface java/util/List.isEmpty ()Z 1
      // 55: iload 3
      // 56: ifne 61
      // 59: ifeq 64
      // 5c: goto 60
      // 5f: athrow
      // 60: bipush 1
      // 61: goto 65
      // 64: bipush 0
      // 65: ireturn
   }

   private static boolean bbabb(JsonElement var0) {
      return bbbaa(var0, false);
   }

   private static boolean bbbaa(JsonElement param0, boolean param1) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: iload 1
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: iload 2
      // 15: ifne 27
      // 18: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 1b: ifeq 43
      // 1e: goto 22
      // 21: athrow
      // 22: aload 0
      // 23: goto 27
      // 26: athrow
      // 27: invokevirtual com/google/gson/JsonElement.getAsJsonPrimitive ()Lcom/google/gson/JsonPrimitive;
      // 2a: iload 2
      // 2b: ifne 3d
      // 2e: invokevirtual com/google/gson/JsonPrimitive.isBoolean ()Z
      // 31: ifeq 43
      // 34: goto 38
      // 37: athrow
      // 38: aload 0
      // 39: goto 3d
      // 3c: athrow
      // 3d: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 40: goto 44
      // 43: iload 1
      // 44: ireturn
   }
}
