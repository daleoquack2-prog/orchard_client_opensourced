package nsc;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class aaaaaaaaa {
   private static final Color aa;
   private static final String[] bb;
   private static final Object[] aaa;
   private static final Integer[] b;
   private static final long[] ab;
   private static final int[] a;
   private static final Color ba;

   public static Color aa(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaaaa.ba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 1c
      // 0d: ifnonnull 1b
      // 10: goto 14
      // 13: athrow
      // 14: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaaaa.aa Ljava/awt/Color;
      // 17: goto 1f
      // 1a: athrow
      // 1b: aload 2
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab.bbab ()Ljava/awt/Color;
      // 1f: iload 0
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaaaa.b (Ljava/awt/Color;I)Ljava/awt/Color;
      // 23: areturn
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -943861565] ^ var1 ^ var0;
      var2 += 62353;
      var2 -= 32787;
      var2 -= 54595;
      var2 -= 7692;
      var2 += 19571;
      return var2 + 51397;
   }

   static {
      int var18 = 1637309229;
      int var11 = 0;
      int var12 = 0;
      String[] var10002 = new String[4];
      short var13 = 8452;
      String[] var10 = var10002;
      int var9 = "\u0018䲶薫佫╇䢲\ue585与於䮫앏䦲\ue58e乾▦䤛蕚䳪ꖕ䮮▢䧋앂䥢▊\n䅾ꖅ䂃앺䍪ָ䍮█䛓╩\u0010\ued31\udb24\uec5c믄\ue825㬛\ue9e1ᬭ\uebacᯖ\uec15鬏\ue8d1鬯\ue8cc믂\n늽ꩊ덀쪵납\u0a77낭⩇딐⪦"
         .length();
      String var8 = "\u0018䲶薫佫╇䢲\ue585与於䮫앏䦲\ue58e乾▦䤛蕚䳪ꖕ䮮▢䧋앂䥢▊\n䅾ꖅ䂃앺䍪ָ䍮█䛓╩\u0010\ued31\udb24\uec5c믄\ue825㬛\ue9e1ᬭ\uebacᯖ\uec15鬏\ue8d1鬯\ue8cc믂\n늽ꩊ덀쪵납\u0a77낭⩇딐⪦";

      do {
         char var14 = var8.charAt(var12);
         int var10001 = var12 + 1;
         int var29 = var12 + 1;
         int var16 = 0;
         char[] var15 = var8.substring(var10001, var29 + var14).toCharArray();

         do {
            int var17 = var15[var16];

            var17 = (char)(switch (var16 % 6) {
               default -> 31;
               case 1 -> 153;
               case 2 -> 218;
               case 3 -> 113;
               case 4 -> 83;
               case 5 -> 172;
            }) ^ var17;
            if (var16 % 2 == 0) {
               var15[var16] = (char)((var17 >>> 3 | var17 << 13) & 65535 ^ var13);
            } else {
               var15[var16] = (char)((var17 << 3 | var17 >>> 13) & 65535 ^ var13);
            }
         } while (++var16 < var15.length);

         var10[var11] = new String(var15);
         var11++;
         var12 = var12 + var14 + 1;
      } while (var12 < var9);

      bb = var10;
      aaa = new Object[var10.length];
      byte var21 = 0;
      int var23 = 0;
      a = new int[25];
      byte[] var30 = "\u0019å@ks\u0085*å©Ø\u0099S\u0017\u0086*\u0095«ß!¬g2íWLê6ÛcîN\u0006\u0080^iÒçÃÔx\u0092ÊBçb\u0004úë=Çd¤P\t\fº\u0017¡Ü^\u0095É\u0096\u0080»j\u000b¿ÓS\u009fx£pÓ\u008buí\u0003\u001f\u0094W´#\u0097Àw\u0018Ô\f¬|]Ç÷#c\u008d\u009bÃ"
         .getBytes("ISO-8859-1");

      int var45;
      do {
         a[var21] = ((var30[var23] & 255) << 24 | (var30[var23 + 1] & 255) << 16 | (var30[var23 + 2] & 255) << 8 | var30[var23 + 3] & 255) ^ -236586838;
         var21 += 1;
         var45 = var23 + 4;
         var23 += 4;
      } while (var45 < var30.length);

      long var0 = 4757299403529424115L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4;
      int var5 = (var4 = aaa(-1493843930, 1189916561, 17353, (byte)-50)).length();
      byte var2 = 0;

      label67:
      while (true) {
         var23 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var23, var2).getBytes(aaa(-1493843929, 1691910306, 28085, (byte)-104));
         long[] var22 = var6;
         var23 = var3++;
         long var36 = (var7[0] & 255L) << a(-943861566, var18 ^ -608881807)
            | (var7[1] & 255L) << a(-943861567, var18 ^ 32014556)
            | (var7[2] & 255L) << a(-943861568, var18 ^ -1078578413)
            | (var7[3] & 255L) << a(-943861561, var18 ^ 66009173)
            | (var7[4] & 255L) << a(-943861562, var18 ^ -821889881)
            | (var7[5] & 255L) << a(-943861563, var18 ^ -455463120)
            | (var7[a(-943861564, var18 ^ -874620966)] & 255L) << a(-943861557, var18 ^ 678326335)
            | var7[a(-943861558, var18 ^ 1341377941)] & 255L;
         byte var46 = -1;

         while (true) {
            long var55 = var36 ^ var0;
            switch (var46) {
               case 0:
                  var22[var23] = var55;
                  if (var2 >= var5) {
                     ab = var6;
                     b = new Integer[5];
                     ba = new Color(bb(a(-943861552, var18 ^ -572674247), 5528478383022995893L), 0, bb(a(-943861545, var18 ^ 1013427210), 5040129606850645391L));
                     aa = new Color(
                        bb(a(-943861546, var18 ^ 1072737807), 7059243892292956865L),
                        bb(a(-943861547, var18 ^ 2084350004), 1355332713798042090L),
                        bb(a(-943861548, var18 ^ -168338795), 4116237791970031906L)
                     );
                     return;
                  }
                  break;
               default:
                  var22[var23] = var55;
                  if (var2 < var5) {
                     continue label67;
                  }

                  var5 = (var4 = aaa(-1493843932, -420861004, (short)-13305, 101)).length();
                  var2 = 0;
            }

            byte var28 = var2;
            var2 += 8;
            var7 = var4.substring(var28, var2).getBytes(aaa(-1493843931, -517013877, (short)28044, (byte)-14));
            var22 = var6;
            var23 = var3++;
            var36 = (var7[0] & 255L) << a(-943861559, var18 ^ 989485944)
               | (var7[1] & 255L) << a(-943861560, var18 ^ -902503571)
               | (var7[2] & 255L) << a(-943861553, var18 ^ -1778942675)
               | (var7[3] & 255L) << a(-943861554, var18 ^ -130476726)
               | (var7[4] & 255L) << a(-943861555, var18 ^ -1080965723)
               | (var7[5] & 255L) << a(-943861556, var18 ^ 1039765346)
               | (var7[a(-943861549, var18 ^ 324670068)] & 255L) << a(-943861550, var18 ^ 2070120076)
               | var7[a(-943861551, var18 ^ 188795517)] & 255L;
            var46 = 0;
         }
      }
   }

   private static Color b(Color var0, int var1) {
      int var2 = aabbabbab.ab;

      Color var10000;
      label22: {
         label21: {
            try {
               var10000 = var0;
               if (var2 != 0) {
                  break label22;
               }

               if (var0 == null) {
                  break label21;
               }
            } catch (MatchException var4) {
               throw var4;
            }

            var10000 = var0;
            break label22;
         }

         var10000 = ba;
      }

      Color var3 = var10000;
      return new Color(
         var3.getRed(), var3.getGreen(), var3.getBlue(), Math.max(0, Math.min(bb(a(-943861565, -1435833269 ^ 2049465004), 4116237791970031906L), var1))
      );
   }

   private aaaaaaaaa() {
   }

   private static String aaa(int var0, int var1, short var2, byte var3) {
      int var8 = var0 ^ -1493843930;
      char[] var7 = bb[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aaa[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         aaa[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 61293;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ var6 ^ 20879 ^ switch (var6 % 16) {
            default -> 248;
            case 1 -> 42;
            case 2 -> 219;
            case 3 -> 237;
            case 4 -> 198;
            case 5 -> 0;
            case 6 -> 192;
            case 7 -> 42;
            case 8 -> 121;
            case 9 -> 100;
            case 10 -> 212;
            case 11 -> 62;
            case 12 -> 225;
            case 13 -> 148;
            case 14 -> 70;
            case 15 -> 248;
         } ^ var3 ^ var1 ^ var5 ^ var0 ^ var2);
      }

      return new String(var7).intern();
   }

   public static Color ab(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaaaa.ba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab;
      // 06: astore 2
      // 07: istore 1
      // 08: aload 2
      // 09: iload 1
      // 0a: ifne 1c
      // 0d: ifnonnull 1b
      // 10: goto 14
      // 13: athrow
      // 14: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaaaa.ba Ljava/awt/Color;
      // 17: goto 1f
      // 1a: athrow
      // 1b: aload 2
      // 1c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab.aaaba ()Ljava/awt/Color;
      // 1f: iload 0
      // 20: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaaaaaa.b (Ljava/awt/Color;I)Ljava/awt/Color;
      // 23: areturn
   }

   private static ababbbaab ba() {
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
      // 16: ifne 29
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 28
      // 1f: goto 23
      // 22: athrow
      // 23: aconst_null
      // 24: goto 2f
      // 27: athrow
      // 28: aload 1
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.abbab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababbbaab;
      // 2f: areturn
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-943861541, 1223470916 ^ -490314498);
      if (b[var3] == null) {
         b[var3] = (int)(ab[var3] ^ var1);
      }

      return b[var3];
   }
}
