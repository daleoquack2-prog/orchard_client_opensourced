package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aabbaba {
   private static final String[] aab;
   public static final aabbaba aa;
   private static final aabbaba[] ab;
   public static final aabbaba b;
   private static final Object[] aba;
   public static final aabbaba ba;
   private final ababbbbaa bb;
   private static final int[] aaa;
   public static final aabbaba a;

   private aabbaba(ababbbbaa var3) {
      this.bb = var3;
   }

   public static aabbaba b(String var0) {
      return Enum.valueOf(aabbaba.class, var0);
   }

   private static aabbaba[] aa() {
      return new aabbaba[]{aa, b, a, ba};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -980259715;
      int var17 = 0;
      int var16 = 0;
      String[] var15 = new String[2];
      int var10001 = "?䖹鑺䚑鑂䕁푍䐭鑘䔹呈䞹푦䗹鑈䕑푟䒅푓䐝呻䟝푇䐵ᑏ䖩푛䐁푛䘡푩䒩鑐䑭呅䑝ᑊ䗝呮䘅푚䖝鑏䓅呀䔑푕䝍呲䗩鑄䐵ᑜ䗅ᑘ䕁ᑧ䞹鑀䗵푒䔍ᑛ䔹\u000f起㣡踟磜赯磎趓磇赋㣔踯㣧趛磖賋".length();
      short var18 = 6082;
      int var14 = var10001;
      String var13 = "?䖹鑺䚑鑂䕁푍䐭鑘䔹呈䞹푦䗹鑈䕑푟䒅푓䐝呻䟝푇䐵ᑏ䖩푛䐁푛䘡푩䒩鑐䑭呅䑝ᑊ䗝呮䘅푚䖝鑏䓅呀䔑푕䝍呲䗩鑄䐵ᑜ䗅ᑘ䕁ᑧ䞹鑀䗵푒䔍ᑛ䔹\u000f起㣡踟磜赯磎趓磇赋㣔踯㣧趛磖賋";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aab = var15;
      aba = new Object[var15.length];
      int var9 = -1404199669;
      byte[] var7 = "²Û\u0088ä¾\u0094ñ\u009b~}/åuêÅïu\u0019I|á¤8å\u000eØö^$W\u001d]õ\u0081\u009dâö\u000bghRp&\u0015\u008b\u009cÿÝ/£ä\f".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      aaa = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         aaa[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[a(1621398978, var23 ^ -1147048294)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(1774853922, (short)-14077, -1943381319, 1442900129, (short)-24436, (byte)-70)).length();
      int var2 = a(1621398979, var23 ^ -1209133084);
      int var25 = -1;

      label87:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var28 = -1;

         while (true) {
            char[] var39;
            label82: {
               char[] var30 = var10000.toCharArray();
               int var10003 = var30.length;
               int var6 = 0;
               var39 = var30;
               var28 = var10003;
               char[] var47;
               int var10004;
               if (var10003 <= 1) {
                  var47 = var30;
                  var10004 = var6;
               } else {
                  var39 = var30;
                  var28 = var10003;
                  if (var10003 <= var6) {
                     break label82;
                  }

                  var47 = var30;
                  var10004 = var6;
               }

               while (true) {
                  var47[var10004] = (char)(var47[var10004] ^ switch (var6 % a(1621398977, var23 ^ 2089821073)) {
                     case 0 -> a(1621398982, var23 ^ 2086907704);
                     case 1 -> a(1621398983, var23 ^ -388047092);
                     case 2 -> a(1621398980, var23 ^ 128061877);
                     case 3 -> a(1621398981, var23 ^ 757987957);
                     case 4 -> a(1621398986, var23 ^ -50627851);
                     case 5 -> a(1621398987, var23 ^ -9338737);
                     default -> a(1621398984, var23 ^ 1527431427);
                  });
                  var6++;
                  if (var28 == 0) {
                     var10004 = var28;
                     var47 = var39;
                  } else {
                     if (var28 <= var6) {
                        break;
                     }

                     var47 = var39;
                     var10004 = var6;
                  }
               }
            }

            String var54 = new String(var39).intern();
            switch (var28) {
               case 0:
                  var0[var4++] = var54;
                  if ((var25 += var2) >= var5) {
                     aa = new aabbaba(aabbaaaba.aaab(var0[0]));
                     b = new aabbaba(aabbaaaba.aaab(var0[3]));
                     a = new aabbaba(aabbaaaba.aaab(var0[1]));
                     ba = new aabbaba(aabbaaaba.aaab(var0[4]));
                     ab = aa();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var54;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label87;
                  }

                  var5 = (var3 = ab(1774853923, (short)24217, 821911034, 533173743, (short)-157, (byte)-43)).length();
                  var2 = a(1621398976, var23 ^ 1996999065);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var28 = 0;
         }
      }
   }

   private static String ab(int var0, short var1, int var2, int var3, short var4, byte var5) {
      int var10 = var0 ^ 1774853922;
      char[] var9 = aab[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])aba[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         aba[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 23710;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ '톅' ^ switch (var8 % 9) {
            default -> 29;
            case 1 -> 148;
            case 2 -> 143;
            case 3 -> 49;
            case 4 -> 71;
            case 5 -> 34;
            case 6 -> 107;
            case 7 -> 66;
            case 8 -> 114;
         } ^ var8 ^ var1 ^ var3 ^ var0 ^ var7 ^ var5 ^ var2 ^ var4);
      }

      return new String(var9).intern();
   }

   @Override
   public String toString() {
      return this.bb.abab();
   }

   private static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ 1621398978] ^ var1 ^ var0;
      var2 -= 58869;
      var2 -= 46318;
      var2 -= 21302;
      var2 += 33880;
      var2 ^= 62833;
      var2 ^= 3629;
      var2 += 46208;
      var2 -= 63518;
      return var2 - 40623;
   }
}
