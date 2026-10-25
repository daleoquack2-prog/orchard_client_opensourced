package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaaaaab {
   public static final aaaaaab aa;
   private static final int[] ba;
   private static final String[] bb;
   private static final aaaaaab[] ab;
   private final ababbbbaa b;
   private static final Object[] aaa;
   public static final aaaaaab a;

   public static aaaaaab b(String var0) {
      return Enum.valueOf(aaaaaab.class, var0);
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ -1552005862] ^ var1 ^ var0;
      var2 += 5680;
      var2 -= 64567;
      var2 -= 42058;
      var2 ^= 41910;
      var2 -= 17971;
      var2 -= 65320;
      var2 += 59862;
      var2 ^= 17031;
      var2 ^= 23384;
      return var2 + 42202;
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private aaaaaab(ababbbbaa var3) {
      this.b = var3;
   }

   private static String ab(int var0, char var1, int var2) {
      int var3 = var0 ^ 30032;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 8210;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 10669;
         var10 -= 13149;
         var10 -= 8252;
         var10 += 33768;
         var10 -= 8090;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -763657556;
      int var17 = 0;
      int var16 = 0;
      String[] var10001 = new String[2];
      short var18 = 27069;
      String[] var15 = var10001;
      int var14 = "\u0013浩鵈漍綇濉㶚淖\udd3c潝絃利ᵸ澂\udd31汁絈氽綊渉\u0012ๆ胎൚ ༖怞റ¸དྷ惆བꃻཱུ聏\u0c4eꃈల而".length();
      String var13 = "\u0013浩鵈漍綇濉㶚淖\udd3c潝絃利ᵸ澂\udd31汁絈氽綊渉\u0012ๆ胎൚ ༖怞റ¸དྷ惆བꃻཱུ聏\u0c4eꃈల而";

      do {
         char var19 = var13.charAt(var17);
         int var30 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var30, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 142;
               case 1 -> 250;
               case 2 -> 242;
               case 3 -> 54;
               case 4 -> 206;
               case 5 -> 37;
               case 6 -> 121;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      bb = var15;
      aaa = new Object[var15.length];
      int var9 = -1883986330;
      byte[] var7 = "9¨JÍJT\f\u008d\u0017=NV%Ôm¾Ñ¹{ýn0E\u009ej\u0096hùÁ¬ó)fcüó\u0004JP>".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      ba = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         ba[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab(30032, '\uf0cb', var23 ^ -1727341600)).length();
      int var2 = a(-1552005862, var23 ^ -954604792);
      int var25 = -1;

      label99:
      while (true) {
         String var28 = var3.substring(++var25, var25 + var2);
         byte var31 = -1;

         while (true) {
            char[] var43;
            label94: {
               char[] var33 = var28.toCharArray();
               int var10003 = var33.length;
               int var6 = 0;
               var43 = var33;
               int var36 = var10003;
               char[] var51;
               int var10004;
               if (var10003 <= 1) {
                  var51 = var33;
                  var10004 = var6;
               } else {
                  var43 = var33;
                  var36 = var10003;
                  if (var10003 <= var6) {
                     break label94;
                  }

                  var51 = var33;
                  var10004 = var6;
               }

               while (true) {
                  var51[var10004] = (char)(var51[var10004] ^ switch (var6 % a(-1552005864, var23 ^ -376641642)) {
                     case 0 -> a(-1552005863, var23 ^ -614087553);
                     case 1 -> a(-1552005858, var23 ^ 789107234);
                     case 2 -> a(-1552005857, var23 ^ -1870535757);
                     case 3 -> a(-1552005860, var23 ^ -1809333912);
                     case 4 -> a(-1552005859, var23 ^ 1058888292);
                     case 5 -> a(-1552005870, var23 ^ -1731045988);
                     default -> a(-1552005869, var23 ^ -84149975);
                  });
                  var6++;
                  if (var36 == 0) {
                     var10004 = var36;
                     var51 = var43;
                  } else {
                     if (var36 <= var6) {
                        break;
                     }

                     var51 = var43;
                     var10004 = var6;
                  }
               }
            }

            String var58 = new String(var43).intern();
            switch (var31) {
               case 0:
                  var0[var4++] = var58;
                  if ((var25 += var2) >= var5) {
                     aa = new aaaaaab(aabbaaaba.aaab(var0[0]));
                     a = new aaaaaab(aabbaaaba.aaab(var0[2]));
                     ab = aa();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var58;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label99;
                  }

                  var5 = (var3 = ab(30033, '\ue7d6', var23 ^ -1441078119)).length();
                  var2 = a(-1552005861, var23 ^ -1260018359);
                  var25 = -1;
            }

            var28 = var3.substring(++var25, var25 + var2);
            var31 = 0;
         }
      }
   }

   private static aaaaaab[] aa() {
      return new aaaaaab[]{aa, a};
   }
}
