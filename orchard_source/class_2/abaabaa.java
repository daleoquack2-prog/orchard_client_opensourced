package nsc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

@Environment(EnvType.CLIENT)
public final class abaabaa {
   private static final String[] ba;
   private static final String[] aa;
   private static final Object[] bb;
   private static final int[] a;
   private static final String[] b;
   private static final URL ab;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static Field aa(Class var0, String var1) {
      Class var3 = var0;
      int var2 = baaabbaa.bba;

      while (true) {
         Class var10000;
         label44: {
            try {
               var10000 = var3;
               if (var2 != 0) {
                  break label44;
               }

               if (var3 == null) {
                  break;
               }
            } catch (NoSuchFieldException var8) {
               throw var8;
            }

            var10000 = var3;
         }

         label36: {
            try {
               if (var2 != 0) {
                  break label36;
               }

               if (var10000 == Object.class) {
                  break;
               }
            } catch (NoSuchFieldException var7) {
               throw var7;
            }

            try {
               var10000 = var3;
            } catch (NoSuchFieldException var6) {
               var3 = var3.getSuperclass();
               if (var2 == 0) {
                  continue;
               }
               break;
            }
         }

         try {
            return var10000.getDeclaredField(var1);
         } catch (NoSuchFieldException var5) {
            var3 = var3.getSuperclass();
            if (var2 == 0) {
               continue;
            }
            break;
         }
      }

      return null;
   }

   private abaabaa() {
   }

   public static void ab() {
      aaa(ClientTickEvents.START_CLIENT_TICK);
      aaa(ClientTickEvents.END_CLIENT_TICK);
      aaa(HudRenderCallback.EVENT);
      aaa(bbbababa.aa);
      aaa(ClientPlayConnectionEvents.JOIN);
   }

   private static int b(int var0, int var1) {
      int var2 = a[var0 ^ 1988525455] ^ var1 ^ var0;
      var2 ^= 4301;
      var2 ^= 57834;
      var2 -= 22582;
      var2 ^= 7073;
      var2 += 41064;
      var2 += 61772;
      var2 -= 26069;
      var2 += 43450;
      return var2 + 26745;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static Method ba(Class var0, String var1) {
      Class var3 = var0;
      int var2 = baaabbaa.bba;

      while (true) {
         Class var10000;
         label44: {
            try {
               var10000 = var3;
               if (var2 != 0) {
                  break label44;
               }

               if (var3 == null) {
                  break;
               }
            } catch (NoSuchMethodException var8) {
               throw var8;
            }

            var10000 = var3;
         }

         label36: {
            try {
               if (var2 != 0) {
                  break label36;
               }

               if (var10000 == Object.class) {
                  break;
               }
            } catch (NoSuchMethodException var7) {
               throw var7;
            }

            try {
               var10000 = var3;
            } catch (NoSuchMethodException var6) {
               var3 = var3.getSuperclass();
               if (var2 == 0) {
                  continue;
               }
               break;
            }
         }

         try {
            return var10000.getDeclaredMethod(var1);
         } catch (NoSuchMethodException var5) {
            var3 = var3.getSuperclass();
            if (var2 == 0) {
               continue;
            }
            break;
         }
      }

      return null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 43862997;
      int var11 = 0;
      int var10 = 0;
      int var8 = "\u001d戞澙績\udf9b擞ޙ碾랞楞瞝溞ޙ燾㞚熾㾟精뾝窞螜旞辛缞ྜྷ慞ᾞ湾\uef9e禞".length();
      short var12 = 25922;
      String[] var9 = new String[1];
      String var7 = "\u001d戞澙績\udf9b擞ޙ碾랞楞瞝溞ޙ燾㞚熾㾟精뾝窞螜旞辛缞ྜྷ慞ᾞ湾\uef9e禞";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ba = var9;
      bb = new Object[var9.length];
      a = new int[271];
      byte var10000 = 0;
      int var10001 = 0;
      byte[] var10002 = "^®a=Ëø\u0005\u0082§8ÐJ\u0011«í·í$\u000b\u0010¦®\u0016©=ÉÉ~øW\u001f\u0099³,\u0005Fda\u0085áå}çX2%vÈTÄ\u008c\u0094\u000fOï+pÓ¨ÈUæ7\u008eóCK©Ã¥\u008fæÁÄ¯V82\u001a\u001f\u0085p\u0095\u0007\u007f\u0097\u0090*©É\\\u001c9o\u000f\u0084p\u0006Å\u0011å\tÙiª\u008a·ì=pRË\"±w]\u0091÷> \u001bÛ\u0019c-ü25\u009c}\u0087é¥«\u009fh]Cz\u008d²Ål#\u009eÒ[`M4æ'SÓ\u0083OÂnïF\u0007~?óÎ/\u000b\u00adXµr\u0010í\u009c\u009f9L\u009cÚë ÁÎ\u0000`B\u00adBÀ¡\\b¤\u0085OCõàQ$¥¿¶Ü\u0016%É¯?µ\u001cÚûDd9:lG\rc3\u009aÆû¹-\u0000\nTú3\u0087Û#¾<\u0018{æ%\u009a<\u0015fèQ0\u009e\u001d\u0080\u001bzW\u008eÑã(Nçó\u008d\u0096&b\u0098äÀ%\u000bá²<\u0082H\u0013ë3R$âà¾¯åmèc\u0082â[Ö\bâïYS!\u000eY%Ü\u001a\b¤äúP~F\u0017r4\u001fö\u009cðòMo\r½Q¹\u0010Ëø¼«\"\u009e¡\u00876b\u001b\u009d#Æ\tõRç\u0095.¶(w\u0006¦\bW¼\u009cÎ÷Rèf4¨\u0094\u0080\u0015A¤\u0013Æ²]A²ÇØ\u0083ÝÕÌlßT]|õs3Æ\u0005¯3öëÕºG\u0097çz\u00192BÔ\u008f\u0013ôQ`\u008eÎÉ\u0015?\u0093'Ä\u001c\u008cÍN\u007feªï\u008a×\u001e0\u0007á¡\u0016\b]&B/0'±w\u0099Ï\u0002ý:\u009b=\u0081k\u00108Ì~¿Er§Þ«ÐmxK\u0000\u0087¶\u009eÝr\u0082²/)ð½\u0087k¥pB \b\u001c´Soßæ¨ÕÛ'E\u0089\u0090P\u001cç\u0096¬\u0093Ù\u00112¹\u001c|\u0016á^\u0010+\u008d\u009d\u0003\u0087ª0sÖû\u001cÙ\u000e\u0099è\u0015±\u001d\u0019P\u0083ùHËN\u001a®I¬´r_U;ùæ\u0012<\u009dS\fä\u0013\tÎó\u0017\u0005/ù¨\u008c\u0006ÂT6Fò|þpåG\u0012ì³Æ#â\u008fÿã7\u0019Á7Âþ^cÙÒ\u007f¬²bØÄcW:Y\u0007\u0091fã\u0092èÕÈfAQ(î÷\u008dË«½¥\u0010\r§[-y÷Ó C¤wP\u008bÄð\u009e!\nV¾\u0016²Ö0\u0012\u0087?ai\u0017\u0097WõøE\u009e}¾*¨Ü\u008b¤\u0094r\u009e*¾äü5¶\u008aUë\u009a\u0095[Lw~Ã§ûtá=\u0086a\u001dÔoHN£ÎøÕ\u008e>TM-?àky@Jã\u0016e\u00068£ã\f,ÂÛr¸GUk¾õá\u0084p\u0004äIö\u0097\u0097L\u00adHô§å\u008be\u0087¥ß\t\u009eÊ\u0086ãCÃ\u009fIu¢\u0011\f\u0006j\u0011ìÊJæ/MâKAAxòÀ\u0005ËSô\u008cË4¬\u0002Z\u0095\u008b@Jçn\u00038JL\u008aôô¤\u0010â\u008eýÎ{¶á\u0093\u001eqÑÀ\u0001ÊZJF&¸¿[\u0087`\u0099\u000f\u009f\u008eòê¿(¿×µÜ\u001bmÌ#*\u009aMâM\u0094µ¡Þo¿a\u0007*Âü;e\u0080Þ\u0085\u0019\u000bq9b[\u00adç\u008aæ-\u0000µ\u008b\u0093ÿh\u001e\u0086ûj\u0003¸Û\u0087ÅÔ9a6\u0019zÍû\u000f\u0004ä¯°j\u0003\u008fé\u000fê7v{D¼È\u001b\u001d\u0006ó\u008e\u009blµ\u0081¼(9L\u001dûÆÌV@bNZtµ\u0083ÿ;\u009f\u0094Æ\u0097À\u001c0Z:æI+±¢±G£<ä©(ä\"û\u0098Ë¤ýu\u009dÄV>}º1_Sù¤Vp\u001c\u001a,ÿ^Ì]Ú\u000b\u0006\u0081\u009fÏÈ[\u0099\u001axi´\u008e\u009ei¼4LEE'*M\u000bé\u00828zÁ\u0098Rþzg\u008a\u009cÜ\u001dK\u0087\u0092§ \bhâzo\u001dÑ½gÅC{4\u0016ð\u00adE\b\bK[0\u008d,¼N_\u00ad$iþ$\u0003é««\u0096ç7\u0088À\"ÂYÞv0¥8"
         .getBytes("ISO-8859-1");

      int var48;
      do {
         a[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 889311928;
         var10000 += 1;
         var48 = var10001 + 4;
         var10001 += 4;
      } while (var48 < var10002.length);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = abb(-1858520110, var17 ^ 2041858115)).length();
      int var1 = b(1988525455, var17 ^ -532003219);
      int var0 = -1;

      while (true) {
         label75: {
            char[] var21 = var2.substring(++var0, var0 + var1).toCharArray();
            var48 = var21.length;
            int var6 = 0;
            var36 = var21;
            var10001 = var48;
            char[] var52;
            int var66;
            if (var48 <= 1) {
               var52 = var21;
               var66 = var6;
            } else {
               var36 = var21;
               var10001 = var48;
               if (var48 <= var6) {
                  break label75;
               }

               var52 = var21;
               var66 = var6;
            }

            while (true) {
               var52[var66] = (char)(var52[var66] ^ switch (var6 % b(1988525454, var17 ^ 1964778188)) {
                  case 0 -> b(1988525453, var17 ^ 433910877);
                  case 1 -> b(1988525452, var17 ^ -1353725187);
                  case 2 -> b(1988525451, var17 ^ 1405103198);
                  case 3 -> b(1988525450, var17 ^ 407515619);
                  case 4 -> b(1988525449, var17 ^ -2094142106);
                  case 5 -> b(1988525448, var17 ^ 1186151300);
                  default -> b(1988525447, var17 ^ 231219583);
               });
               var6++;
               if (var10001 == 0) {
                  var66 = var10001;
                  var52 = var36;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var52 = var36;
                  var66 = var6;
               }
            }
         }

         String var59 = new String(var36).intern();
         byte var28 = -1;
         var5[var3++] = var59;
         if ((var0 += var1) >= var4) {
            aa = var5;
            b = new String[2];
            ab = aab(abaabaa.class);
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static boolean bb(Object param0) {
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
      // 06: ifne 14
      // 09: ifnonnull 13
      // 0c: goto 10
      // 0f: athrow
      // 10: bipush 0
      // 11: ireturn
      // 12: athrow
      // 13: aload 0
      // 14: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 17: astore 2
      // 18: aload 2
      // 19: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 1c: astore 3
      // 1d: ldc qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa
      // 1f: invokevirtual java/lang/Class.getPackageName ()Ljava/lang/String;
      // 22: astore 4
      // 24: aload 4
      // 26: iload 1
      // 27: ifne 39
      // 2a: invokevirtual java/lang/String.isEmpty ()Z
      // 2d: ifne 4b
      // 30: goto 34
      // 33: athrow
      // 34: aload 3
      // 35: goto 39
      // 38: athrow
      // 39: aload 4
      // 3b: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 3e: iload 1
      // 3f: ifne 4a
      // 42: ifeq 4b
      // 45: goto 49
      // 48: athrow
      // 49: bipush 1
      // 4a: ireturn
      // 4b: aload 2
      // 4c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.aab (Ljava/lang/Class;)Ljava/net/URL;
      // 4f: astore 5
      // 51: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.ab Ljava/net/URL;
      // 54: iload 1
      // 55: ifne 62
      // 58: ifnull 76
      // 5b: goto 5f
      // 5e: athrow
      // 5f: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.ab Ljava/net/URL;
      // 62: aload 5
      // 64: invokevirtual java/net/URL.equals (Ljava/lang/Object;)Z
      // 67: iload 1
      // 68: ifne 73
      // 6b: ifeq 76
      // 6e: goto 72
      // 71: athrow
      // 72: bipush 1
      // 73: goto 77
      // 76: bipush 0
      // 77: ireturn
   }

   private static void aaa(Object var0) {
      try {
         a(var0);
      } catch (Throwable var2) {
      }
   }

   private static URL aab(Class param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 0f
      // 04: aload 0
      // 05: invokevirtual java/lang/Class.getProtectionDomain ()Ljava/security/ProtectionDomain;
      // 08: ifnonnull 12
      // 0b: goto 0f
      // 0e: athrow
      // 0f: aconst_null
      // 10: areturn
      // 11: athrow
      // 12: aload 0
      // 13: invokevirtual java/lang/Class.getProtectionDomain ()Ljava/security/ProtectionDomain;
      // 16: invokevirtual java/security/ProtectionDomain.getCodeSource ()Ljava/security/CodeSource;
      // 19: astore 1
      // 1a: aload 1
      // 1b: ifnonnull 23
      // 1e: aconst_null
      // 1f: goto 27
      // 22: athrow
      // 23: aload 1
      // 24: invokevirtual java/security/CodeSource.getLocation ()Ljava/net/URL;
      // 27: areturn
   }

   private static String abb(int var0, int var1) {
      int var3 = var0 ^ -1858520110;
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         bb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1789599539;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 74;
            case 1 -> 118;
            case 2 -> 163;
            case 3 -> 246;
            case 4 -> 22;
            case 5 -> 220;
            case 6 -> 127;
            case 7 -> 215;
            case 8 -> 38;
            case 9 -> 146;
            case 10 -> 180;
            case 11 -> 229;
            case 12 -> 170;
            case 13 -> 142;
            case 14 -> 104;
            case 15 -> 173;
            case 16 -> 57;
            case 17 -> 195;
            case 18 -> 30;
            case 19 -> 80;
            case 20 -> 195;
            case 21 -> 230;
            case 22 -> 51;
            case 23 -> 20;
            case 24 -> 211;
            case 25 -> 206;
            case 26 -> 60;
            case 27 -> 184;
            case 28 -> 193;
            case 29 -> 92;
            case 30 -> 162;
            case 31 -> 188;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static String aba(int var0, int var1) {
      int var9 = 456872201;
      int var2 = (var0 ^ b(1988525446, var9 ^ -1021056571)) & b(1988525445, var9 ^ 1111415497);
      if (b[var2] == null) {
         char[] var3 = aa[var2].toCharArray();

         int var4 = switch (var3[0] & b(1988525444, var9 ^ -1788393384)) {
            case 0 -> b(1988525443, var9 ^ -209276166);
            case 1 -> b(1988525442, var9 ^ -1475489319);
            case 2 -> b(1988525441, var9 ^ -678324714);
            case 3 -> b(1988525440, var9 ^ -224130391);
            case 4 -> b(1988525471, var9 ^ 1409381748);
            case 5 -> b(1988525470, var9 ^ 1692905823);
            case 6 -> b(1988525469, var9 ^ 1720095446);
            case 7 -> b(1988525468, var9 ^ -1620039899);
            case 8 -> b(1988525467, var9 ^ 573746166);
            case 9 -> b(1988525466, var9 ^ -657085173);
            case 10 -> b(1988525465, var9 ^ 244015865);
            case 11 -> b(1988525464, var9 ^ -1641205259);
            case 12 -> b(1988525463, var9 ^ -683345056);
            case 13 -> b(1988525462, var9 ^ 1112269922);
            case 14 -> b(1988525461, var9 ^ 231246193);
            case 15 -> b(1988525460, var9 ^ -1707970577);
            case 16 -> b(1988525459, var9 ^ -2047653311);
            case 17 -> 5;
            case 18 -> b(1988525458, var9 ^ 917831806);
            case 19 -> b(1988525457, var9 ^ -1130813656);
            case 20 -> b(1988525456, var9 ^ -1967256501);
            case 21 -> b(1988525487, var9 ^ 994032023);
            case 22 -> b(1988525486, var9 ^ 48865713);
            case 23 -> b(1988525485, var9 ^ -100580238);
            case 24 -> b(1988525484, var9 ^ 361189653);
            case 25 -> b(1988525483, var9 ^ 965764504);
            case 26 -> 4;
            case 27 -> b(1988525482, var9 ^ -361310103);
            case 28 -> b(1988525481, var9 ^ -191775469);
            case 29 -> b(1988525480, var9 ^ 1697436032);
            case 30 -> b(1988525479, var9 ^ -1606680274);
            case 31 -> b(1988525478, var9 ^ 1768764907);
            case 32 -> b(1988525477, var9 ^ -570170);
            case 33 -> b(1988525476, var9 ^ 1256104440);
            case 34 -> b(1988525475, var9 ^ -337714134);
            case 35 -> b(1988525474, var9 ^ 126087387);
            case 36 -> b(1988525473, var9 ^ -956263538);
            case 37 -> b(1988525472, var9 ^ 1742955026);
            case 38 -> b(1988525503, var9 ^ 63402601);
            case 39 -> b(1988525502, var9 ^ 1386377166);
            case 40 -> b(1988525501, var9 ^ 50170725);
            case 41 -> b(1988525500, var9 ^ -1318586502);
            case 42 -> b(1988525499, var9 ^ -1728634334);
            case 43 -> b(1988525498, var9 ^ 1543920203);
            case 44 -> b(1988525497, var9 ^ -1657898433);
            case 45 -> b(1988525496, var9 ^ -999185301);
            case 46 -> b(1988525495, var9 ^ 1559957512);
            case 47 -> b(1988525494, var9 ^ -1391016793);
            case 48 -> b(1988525493, var9 ^ 546905739);
            case 49 -> b(1988525492, var9 ^ -1688582443);
            case 50 -> b(1988525491, var9 ^ -2099773019);
            case 51 -> b(1988525490, var9 ^ -1045795820);
            case 52 -> b(1988525489, var9 ^ 962576099);
            case 53 -> b(1988525488, var9 ^ -585780231);
            case 54 -> b(1988525519, var9 ^ 1147826274);
            case 55 -> b(1988525518, var9 ^ 1422895239);
            case 56 -> b(1988525517, var9 ^ -975512879);
            case 57 -> b(1988525516, var9 ^ -2109087932);
            case 58 -> b(1988525515, var9 ^ -1681885870);
            case 59 -> b(1988525514, var9 ^ 1282501782);
            case 60 -> b(1988525513, var9 ^ 1168278495);
            case 61 -> b(1988525512, var9 ^ 1110431399);
            case 62 -> b(1988525511, var9 ^ 631268646);
            case 63 -> b(1988525510, var9 ^ -1348415107);
            case 64 -> b(1988525509, var9 ^ -194825440);
            case 65 -> b(1988525508, var9 ^ -2103564343);
            case 66 -> b(1988525507, var9 ^ 61261003);
            case 67 -> b(1988525506, var9 ^ -654038718);
            case 68 -> b(1988525505, var9 ^ -1822570366);
            case 69 -> b(1988525504, var9 ^ 1471181776);
            case 70 -> 1;
            case 71 -> b(1988525535, var9 ^ -1426101019);
            case 72 -> b(1988525534, var9 ^ -1215707577);
            case 73 -> b(1988525533, var9 ^ 207659091);
            case 74 -> b(1988525532, var9 ^ 544496846);
            case 75 -> b(1988525531, var9 ^ 979499045);
            case 76 -> b(1988525530, var9 ^ 1376835943);
            case 77 -> b(1988525529, var9 ^ -1980492193);
            case 78 -> b(1988525528, var9 ^ -1578879373);
            case 79 -> b(1988525527, var9 ^ 467596205);
            case 80 -> b(1988525526, var9 ^ -173385714);
            case 81 -> b(1988525525, var9 ^ 265731839);
            case 82 -> b(1988525524, var9 ^ -421122631);
            case 83 -> b(1988525523, var9 ^ 354385781);
            case 84 -> b(1988525522, var9 ^ 1620753906);
            case 85 -> b(1988525521, var9 ^ 1921929782);
            case 86 -> b(1988525520, var9 ^ -216055157);
            case 87 -> b(1988525551, var9 ^ -730728393);
            case 88 -> b(1988525550, var9 ^ 141674556);
            case 89 -> b(1988525549, var9 ^ 1928886690);
            case 90 -> 2;
            case 91 -> b(1988525548, var9 ^ 1077421834);
            case 92 -> b(1988525547, var9 ^ -443109109);
            case 93 -> b(1988525546, var9 ^ 1393778250);
            case 94 -> b(1988525545, var9 ^ 1770727527);
            case 95 -> b(1988525544, var9 ^ 879098456);
            case 96 -> b(1988525543, var9 ^ 730820694);
            case 97 -> b(1988525542, var9 ^ -1024929393);
            case 98 -> b(1988525541, var9 ^ 1885081124);
            case 99 -> b(1988525540, var9 ^ 1189292872);
            case 100 -> b(1988525539, var9 ^ -94077112);
            case 101 -> b(1988525538, var9 ^ -1754951708);
            case 102 -> b(1988525537, var9 ^ 1049443409);
            case 103 -> b(1988525536, var9 ^ -1646722229);
            case 104 -> b(1988525567, var9 ^ -867039730);
            case 105 -> b(1988525566, var9 ^ -637699234);
            case 106 -> b(1988525565, var9 ^ 10261999);
            case 107 -> b(1988525564, var9 ^ -902138571);
            case 108 -> b(1988525563, var9 ^ 552903588);
            case 109 -> b(1988525562, var9 ^ -708801388);
            case 110 -> b(1988525561, var9 ^ -1900903604);
            case 111 -> b(1988525560, var9 ^ -857256209);
            case 112 -> b(1988525559, var9 ^ -2025184748);
            case 113 -> b(1988525558, var9 ^ -198319765);
            case 114 -> b(1988525557, var9 ^ 261613146);
            case 115 -> b(1988525556, var9 ^ -489968196);
            case 116 -> b(1988525555, var9 ^ -1146771338);
            case 117 -> b(1988525554, var9 ^ 882585398);
            case 118 -> b(1988525553, var9 ^ 509493956);
            case 119 -> b(1988525552, var9 ^ 1176251733);
            case 120 -> b(1988525327, var9 ^ 719273421);
            case 121 -> b(1988525326, var9 ^ 225594656);
            case 122 -> b(1988525325, var9 ^ 1549723605);
            case 123 -> b(1988525324, var9 ^ 1051339644);
            case 124 -> b(1988525323, var9 ^ -1168412968);
            case 125 -> b(1988525322, var9 ^ 1577776484);
            case 126 -> b(1988525321, var9 ^ -1108576368);
            case 127 -> b(1988525320, var9 ^ 321937667);
            case 128 -> b(1988525319, var9 ^ -1665410978);
            case 129 -> b(1988525318, var9 ^ -1679856303);
            case 130 -> b(1988525317, var9 ^ 1129396157);
            case 131 -> b(1988525316, var9 ^ 1414871835);
            case 132 -> b(1988525315, var9 ^ 1592439405);
            case 133 -> b(1988525314, var9 ^ 1695942734);
            case 134 -> b(1988525313, var9 ^ 1430175823);
            case 135 -> b(1988525312, var9 ^ 1107635363);
            case 136 -> b(1988525343, var9 ^ 344202552);
            case 137 -> b(1988525342, var9 ^ 683531586);
            case 138 -> b(1988525341, var9 ^ -1098708285);
            case 139 -> b(1988525340, var9 ^ 1495031516);
            case 140 -> b(1988525339, var9 ^ 1966969563);
            case 141 -> b(1988525338, var9 ^ -979699065);
            case 142 -> b(1988525337, var9 ^ -260544530);
            case 143 -> b(1988525336, var9 ^ 908385849);
            case 144 -> b(1988525335, var9 ^ 1335358949);
            case 145 -> b(1988525334, var9 ^ -434956775);
            case 146 -> b(1988525333, var9 ^ 1355806131);
            case 147 -> b(1988525332, var9 ^ 451358434);
            case 148 -> b(1988525331, var9 ^ 1643389);
            case 149 -> b(1988525330, var9 ^ 1351687711);
            case 150 -> b(1988525329, var9 ^ 53833404);
            case 151 -> b(1988525328, var9 ^ 1672651652);
            case 152 -> b(1988525359, var9 ^ -1391165235);
            case 153 -> b(1988525358, var9 ^ 362024543);
            case 154 -> b(1988525357, var9 ^ 545087368);
            case 155 -> b(1988525356, var9 ^ -1328191100);
            case 156 -> b(1988525355, var9 ^ 1594335282);
            case 157 -> b(1988525354, var9 ^ 426284689);
            case 158 -> b(1988525353, var9 ^ 753314263);
            case 159 -> b(1988525352, var9 ^ 963149831);
            case 160 -> b(1988525351, var9 ^ 1534560263);
            case 161 -> b(1988525350, var9 ^ -223762654);
            case 162 -> b(1988525349, var9 ^ -66172671);
            case 163 -> b(1988525348, var9 ^ 1692780239);
            case 164 -> b(1988525347, var9 ^ 1182776273);
            case 165 -> b(1988525346, var9 ^ -1164553782);
            case 166 -> b(1988525345, var9 ^ -371068795);
            case 167 -> b(1988525344, var9 ^ 1925971992);
            case 168 -> b(1988525375, var9 ^ -361823948);
            case 169 -> b(1988525374, var9 ^ -868516300);
            case 170 -> b(1988525373, var9 ^ 1146379135);
            case 171 -> b(1988525372, var9 ^ -1612587657);
            case 172 -> b(1988525371, var9 ^ -1954486894);
            case 173 -> b(1988525370, var9 ^ 520448848);
            case 174 -> b(1988525369, var9 ^ 431480716);
            case 175 -> b(1988525368, var9 ^ -683222580);
            case 176 -> b(1988525367, var9 ^ 1372957280);
            case 177 -> b(1988525366, var9 ^ 168479289);
            case 178 -> b(1988525365, var9 ^ 1120492389);
            case 179 -> b(1988525364, var9 ^ 43857770);
            case 180 -> b(1988525363, var9 ^ 1841618269);
            case 181 -> b(1988525362, var9 ^ 1692235673);
            case 182 -> b(1988525361, var9 ^ 89338281);
            case 183 -> b(1988525360, var9 ^ -850144920);
            case 184 -> b(1988525391, var9 ^ -308014437);
            case 185 -> b(1988525390, var9 ^ 1158250313);
            case 186 -> b(1988525389, var9 ^ -542048669);
            case 187 -> b(1988525388, var9 ^ 1813105388);
            case 188 -> b(1988525387, var9 ^ 1819709937);
            case 189 -> b(1988525386, var9 ^ -36194647);
            case 190 -> b(1988525385, var9 ^ -307932168);
            case 191 -> b(1988525384, var9 ^ -1626836457);
            case 192 -> b(1988525383, var9 ^ 1404476058);
            case 193 -> b(1988525382, var9 ^ 1171047277);
            case 194 -> b(1988525381, var9 ^ -587931857);
            case 195 -> b(1988525380, var9 ^ -1187779582);
            case 196 -> b(1988525379, var9 ^ -1501010942);
            case 197 -> b(1988525378, var9 ^ -513505981);
            case 198 -> b(1988525377, var9 ^ -54173981);
            case 199 -> b(1988525376, var9 ^ -1461866469);
            case 200 -> b(1988525407, var9 ^ 1308432057);
            case 201 -> b(1988525406, var9 ^ 1895293427);
            case 202 -> b(1988525405, var9 ^ -896656008);
            case 203 -> b(1988525404, var9 ^ 1024450323);
            case 204 -> b(1988525403, var9 ^ 871866218);
            case 205 -> b(1988525402, var9 ^ -922919703);
            case 206 -> b(1988525401, var9 ^ -1920941501);
            case 207 -> b(1988525400, var9 ^ -1027416011);
            case 208 -> b(1988525399, var9 ^ -1102492423);
            case 209 -> b(1988525398, var9 ^ -988180309);
            case 210 -> b(1988525397, var9 ^ 765727642);
            case 211 -> b(1988525396, var9 ^ 315207115);
            case 212 -> b(1988525395, var9 ^ -816007102);
            case 213 -> b(1988525394, var9 ^ -851343832);
            case 214 -> b(1988525393, var9 ^ 545778238);
            case 215 -> b(1988525392, var9 ^ -965466284);
            case 216 -> b(1988525423, var9 ^ 1790521693);
            case 217 -> 0;
            case 218 -> b(1988525422, var9 ^ 1139641733);
            case 219 -> b(1988525421, var9 ^ -1530013784);
            case 220 -> b(1988525420, var9 ^ 1299532702);
            case 221 -> b(1988525419, var9 ^ -469830140);
            case 222 -> b(1988525418, var9 ^ -1169896119);
            case 223 -> b(1988525417, var9 ^ 1009682527);
            case 224 -> b(1988525416, var9 ^ 459933440);
            case 225 -> b(1988525415, var9 ^ -1162216695);
            case 226 -> b(1988525414, var9 ^ -251503576);
            case 227 -> b(1988525413, var9 ^ -46756973);
            case 228 -> b(1988525412, var9 ^ 1484366284);
            case 229 -> b(1988525411, var9 ^ 1641414328);
            case 230 -> b(1988525410, var9 ^ -1760033543);
            case 231 -> b(1988525409, var9 ^ -295071861);
            case 232 -> b(1988525408, var9 ^ 369466706);
            case 233 -> b(1988525439, var9 ^ 1139480317);
            case 234 -> b(1988525438, var9 ^ -2051430783);
            case 235 -> b(1988525437, var9 ^ 62867557);
            case 236 -> b(1988525436, var9 ^ 1662255154);
            case 237 -> b(1988525435, var9 ^ 494101172);
            case 238 -> b(1988525434, var9 ^ 1592158299);
            case 239 -> b(1988525433, var9 ^ -1151856256);
            case 240 -> b(1988525432, var9 ^ -108109774);
            case 241 -> b(1988525431, var9 ^ -1404780751);
            case 242 -> b(1988525430, var9 ^ 1753900776);
            case 243 -> b(1988525429, var9 ^ -1120250790);
            case 244 -> b(1988525428, var9 ^ 702306217);
            case 245 -> 3;
            case 246 -> b(1988525427, var9 ^ -1827767323);
            case 247 -> b(1988525426, var9 ^ -2140638333);
            case 248 -> b(1988525425, var9 ^ 1321207532);
            case 249 -> b(1988525424, var9 ^ 1725591348);
            case 250 -> b(1988525199, var9 ^ -584730954);
            case 251 -> b(1988525198, var9 ^ 2069853389);
            case 252 -> b(1988525197, var9 ^ 904241043);
            case 253 -> b(1988525196, var9 ^ -811580132);
            case 254 -> b(1988525195, var9 ^ -1164737981);
            default -> b(1988525194, var9 ^ 1644250237);
         };
         int var5 = (var1 & b(1988525193, var9 ^ -1313697064)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & b(1988525192, var9 ^ -1354008633)) >>> b(1988525191, var9 ^ -1748037600)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & b(1988525190, var9 ^ -383937866);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & b(1988525189, var9 ^ -826532974);
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   private static void a(Object param0) throws ReflectiveOperationException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 012
      // 009: ifnonnull 011
      // 00c: goto 010
      // 00f: athrow
      // 010: return
      // 011: aload 0
      // 012: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 015: ldc_w 1988525188
      // 018: ldc_w -693620735
      // 01b: ldc_w -2089113672
      // 01e: ixor
      // 01f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.b (II)I
      // 022: ldc_w 1988525187
      // 025: ldc_w -693620735
      // 028: ldc_w -1914350680
      // 02b: ixor
      // 02c: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.b (II)I
      // 02f: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.aba (II)Ljava/lang/String;
      // 032: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 035: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.aa (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 038: astore 2
      // 039: iload 1
      // 03a: ifne 04c
      // 03d: aload 2
      // 03e: ifnonnull 047
      // 041: goto 045
      // 044: athrow
      // 045: return
      // 046: athrow
      // 047: aload 2
      // 048: bipush 1
      // 049: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 04c: aload 2
      // 04d: aload 0
      // 04e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 051: astore 3
      // 052: aload 3
      // 053: iload 1
      // 054: ifne 066
      // 057: instanceof [Ljava/lang/Object;
      // 05a: ifeq 071
      // 05d: goto 061
      // 060: athrow
      // 061: aload 3
      // 062: goto 066
      // 065: athrow
      // 066: checkcast [Ljava/lang/Object;
      // 069: astore 4
      // 06b: aload 4
      // 06d: arraylength
      // 06e: ifne 073
      // 071: return
      // 072: athrow
      // 073: new java/util/ArrayList
      // 076: dup
      // 077: aload 4
      // 079: arraylength
      // 07a: invokespecial java/util/ArrayList.<init> (I)V
      // 07d: astore 5
      // 07f: aload 4
      // 081: astore 6
      // 083: aload 6
      // 085: arraylength
      // 086: istore 7
      // 088: bipush 0
      // 089: istore 8
      // 08b: iload 8
      // 08d: iload 7
      // 08f: if_icmpge 0d7
      // 092: aload 6
      // 094: iload 8
      // 096: aaload
      // 097: astore 9
      // 099: iload 1
      // 09a: ifne 102
      // 09d: iload 1
      // 09e: ifne 0d3
      // 0a1: goto 0a5
      // 0a4: athrow
      // 0a5: aload 9
      // 0a7: ifnull 0d0
      // 0aa: goto 0ae
      // 0ad: athrow
      // 0ae: aload 9
      // 0b0: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.bb (Ljava/lang/Object;)Z
      // 0b3: iload 1
      // 0b4: ifne 0cf
      // 0b7: goto 0bb
      // 0ba: athrow
      // 0bb: ifne 0d0
      // 0be: goto 0c2
      // 0c1: athrow
      // 0c2: aload 5
      // 0c4: aload 9
      // 0c6: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0cb: goto 0cf
      // 0ce: athrow
      // 0cf: pop
      // 0d0: iinc 8 1
      // 0d3: iload 1
      // 0d4: ifeq 08b
      // 0d7: aload 5
      // 0d9: iload 1
      // 0da: ifne 100
      // 0dd: invokeinterface java/util/List.size ()I 1
      // 0e2: aload 4
      // 0e4: arraylength
      // 0e5: if_icmpne 0ee
      // 0e8: goto 0ec
      // 0eb: athrow
      // 0ec: return
      // 0ed: athrow
      // 0ee: aload 4
      // 0f0: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0f3: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 0f6: aload 5
      // 0f8: invokeinterface java/util/List.size ()I 1
      // 0fd: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 100: astore 6
      // 102: bipush 0
      // 103: istore 7
      // 105: iload 7
      // 107: aload 5
      // 109: invokeinterface java/util/List.size ()I 1
      // 10e: if_icmpge 130
      // 111: aload 6
      // 113: iload 1
      // 114: ifne 138
      // 117: iload 7
      // 119: aload 5
      // 11b: iload 7
      // 11d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 122: invokestatic java/lang/reflect/Array.set (Ljava/lang/Object;ILjava/lang/Object;)V
      // 125: iload 1
      // 126: iinc 7 1
      // 129: ifeq 105
      // 12c: goto 130
      // 12f: athrow
      // 130: aload 2
      // 131: aload 0
      // 132: aload 6
      // 134: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 137: aload 0
      // 138: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 13b: ldc_w 1988525186
      // 13e: ldc_w -693620735
      // 141: ldc_w 1209226743
      // 144: ixor
      // 145: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.b (II)I
      // 148: ldc_w 1988525185
      // 14b: ldc_w -693620735
      // 14e: ldc_w 484598186
      // 151: ixor
      // 152: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.b (II)I
      // 155: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.aba (II)Ljava/lang/String;
      // 158: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbaaaba.abba (Ljava/lang/String;)Ljava/lang/String;
      // 15b: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaabaa.ba (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
      // 15e: astore 7
      // 160: iload 1
      // 161: ifne 177
      // 164: aload 7
      // 166: ifnull 182
      // 169: goto 16d
      // 16c: athrow
      // 16d: aload 7
      // 16f: bipush 1
      // 170: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
      // 173: goto 177
      // 176: athrow
      // 177: aload 7
      // 179: aload 0
      // 17a: bipush 0
      // 17b: anewarray 4
      // 17e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 181: pop
      // 182: return
   }
}
