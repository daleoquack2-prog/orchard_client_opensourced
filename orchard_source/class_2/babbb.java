package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum babbb {
   private static final babbb[] aa;
   private static final Object[] aab;
   public static final babbb b;
   private static final String[] aaa;
   private final ababbbbaa ab;
   private static final int[] bb;
   public static final babbb a;
   public static final babbb ba;

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ -1144115247] ^ var1 ^ var0;
      var2 ^= 16502;
      var2 += 28963;
      var2 += 59042;
      var2 += 53243;
      var2 -= 10621;
      var2 += 55533;
      var2 -= 38053;
      var2 -= 52422;
      var2 -= 7329;
      return var2 ^ 47177;
   }

   private static String ba(int var0, short var1, int var2, int var3, char var4, byte var5) {
      int var10 = var2 ^ -1112187128;
      char[] var9 = aaa[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])aab[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         aab[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 54890;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 14) {
            default -> 4;
            case 1 -> 56;
            case 2 -> 29;
            case 3 -> 22;
            case 4 -> 144;
            case 5 -> 121;
            case 6 -> 63;
            case 7 -> 141;
            case 8 -> 217;
            case 9 -> 51;
            case 10 -> 251;
            case 11 -> 212;
            case 12 -> 232;
            case 13 -> 57;
         } ^ var4 ^ var1 ^ var3 ^ var0 ^ var5 ^ var7 ^ var2);
      }

      return new String(var9).intern();
   }

   public static babbb aa(String var0) {
      return Enum.valueOf(babbb.class, var0);
   }

   public ababbbbaa ab() {
      return this.ab;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -485738719;
      int var17 = 0;
      short var18 = 9116;
      int var16 = 0;
      String[] var15 = new String[2];
      int var14 = "+\uee8c\ue8f3\ue348ࣕ虜낯\ueb0c\ue0f6\uf648⃗\uf0b6肨\uf20c냲\uea48\uf8d4\ue516좯\uf6ec\ue8f2\uee08磑ﱶ킯\uf1cc샴\uf1c8磗\uec16\u18af\ue3ac\ue8f0\uf428\uf0d5\uead6\ue8a9בֿヰ\uf768\ue8d1\uf2b6炬\ueeec5䔊녛䬎㥿偐꤄䍊\uf15e微兿囐餀妪酛䁮셿俰넄坊㥚䬮텹奰鄄唊煟幮륿䈐䄄䂊襚媎셿䓐脂寊兘冮\ue179帰句䏊煙佮륾卐\uf107䃪ꅜ后酼圐"
         .length();
      String var13 = "+\uee8c\ue8f3\ue348ࣕ虜낯\ueb0c\ue0f6\uf648⃗\uf0b6肨\uf20c냲\uea48\uf8d4\ue516좯\uf6ec\ue8f2\uee08磑ﱶ킯\uf1cc샴\uf1c8磗\uec16\u18af\ue3ac\ue8f0\uf428\uf0d5\uead6\ue8a9בֿヰ\uf768\ue8d1\uf2b6炬\ueeec5䔊녛䬎㥿偐꤄䍊\uf15e微兿囐餀妪酛䁮셿俰넄坊㥚䬮텹奰鄄唊煟幮륿䈐䄄䂊襚媎셿䓐脂寊兘冮\ue179帰句䏊煙佮륾卐\uf107䃪ꅜ后酼圐";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 76;
               case 1 -> 201;
               case 2 -> 200;
               case 3 -> 237;
               case 4 -> 214;
               case 5 -> 150;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aaa = var15;
      aab = new Object[var15.length];
      int var9 = -594856033;
      byte[] var7 = "\u008e6\u001cÍNHIµkÊeE\u0004\u0097Â±fôöÙ\u0086\u0001\u0094Ê\u0007Öaénò\u00ad#hÒ^Ëà\u008b\u0003Q5ï\u0013¥".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      bb = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         bb[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[b(-1144115247, var23 ^ -176149249)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ba(1467593091, (short)-9254, -1112187128, 2103626991, '걺', 29)).length();
      int var2 = b(-1144115248, var23 ^ 905869744);
      int var25 = -1;

      label99:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var40;
            label94: {
               char[] var31 = var28.toCharArray();
               int var10003 = var31.length;
               int var6 = 0;
               var40 = var31;
               var10001 = var10003;
               char[] var48;
               int var10004;
               if (var10003 <= 1) {
                  var48 = var31;
                  var10004 = var6;
               } else {
                  var40 = var31;
                  var10001 = var10003;
                  if (var10003 <= var6) {
                     break label94;
                  }

                  var48 = var31;
                  var10004 = var6;
               }

               while (true) {
                  var48[var10004] = (char)(var48[var10004] ^ switch (var6 % b(-1144115246, var23 ^ 2132931201)) {
                     case 0 -> b(-1144115243, var23 ^ 490915621);
                     case 1 -> b(-1144115244, var23 ^ -38296282);
                     case 2 -> b(-1144115241, var23 ^ 2086687140);
                     case 3 -> b(-1144115242, var23 ^ 356818301);
                     case 4 -> b(-1144115239, var23 ^ 325349079);
                     case 5 -> b(-1144115240, var23 ^ -1690487992);
                     default -> b(-1144115237, var23 ^ 1314464346);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var48 = var40;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var48 = var40;
                     var10004 = var6;
                  }
               }
            }

            String var55 = new String(var40).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var55;
                  if ((var25 += var2) >= var5) {
                     a = new babbb(aabbaaaba.aaab(var0[2]));
                     ba = new babbb(aabbaaaba.aaab(var0[5]));
                     b = new babbb(aabbaaaba.aaab(var0[4]));
                     aa = a();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var55;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label99;
                  }

                  var5 = (var3 = ba(1721784512, (short)9655, -1112187127, 1166412564, 18896, (byte)7)).length();
                  var2 = b(-1144115245, var23 ^ 276583791);
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }

   private static babbb[] a() {
      return new babbb[]{a, ba, b};
   }

   private babbb(ababbbbaa var3) {
      this.ab = var3;
   }
}
