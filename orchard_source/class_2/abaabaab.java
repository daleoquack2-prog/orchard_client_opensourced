package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abaabaab {
   private static final abaabaab[] aa;
   private static final Object[] aaa;
   private final ababbbbaa b;
   private static final int[] ba;
   public static final abaabaab a;
   private static final String[] bb;
   public static final abaabaab ab;

   private abaabaab(ababbbbaa var3) {
      this.b = var3;
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 1711144573] ^ var1 ^ var0;
      var2 -= 45682;
      var2 ^= 39094;
      var2 += 29419;
      var2 -= 12232;
      var2 -= 33633;
      var2 -= 44333;
      var2 += 2954;
      return var2 + 32396;
   }

   private static abaabaab[] b() {
      return new abaabaab[]{ab, a};
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1523413481;
      byte var14 = -1;
      String var8 = "꼦ꩮꫲ꿽꾕ꨙ꼿\uaa5bꪮ꿭ꩭꨨ꼫\uebf1\ueb70\ueb89\ue8eb\ueb46\ue8d5\uebb7\ue895\ueb8d\ueb02\ue8aa\ueb3d\uebc8\ue8a5\ue87b\ueb1f\ue891\ueb0e\ue812";
      short var7 = 1771;
      char[] var9 = "\r\u0013".toCharArray();
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            bb = var10;
            aaa = new Object[var10.length];
            byte var22 = 0;
            ba = new int[10];
            int var10001 = 0;
            byte[] var10002 = ")d°¤W.l\u0083/aæÛH\u009dP\u0007ù¸¨?¼\u000e\tlEýÝmgOîíf/Ô\u009eÿ\u0088!\u009b".getBytes("ISO-8859-1");

            int var57;
            do {
               ba[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 645058857;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa((short)'骬', 59864, var18 ^ -1338504795)).length();
            int var2 = a(1711144573, var18 ^ 807878724);
            int var20 = -1;

            label103:
            while (true) {
               String var23 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label98: {
                     char[] var29 = var23.toCharArray();
                     var57 = var29.length;
                     int var6 = 0;
                     var44 = var29;
                     var10001 = var57;
                     char[] var61;
                     int var75;
                     if (var57 <= 1) {
                        var61 = var29;
                        var75 = var6;
                     } else {
                        var44 = var29;
                        var10001 = var57;
                        if (var57 <= var6) {
                           break label98;
                        }

                        var61 = var29;
                        var75 = var6;
                     }

                     while (true) {
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(1711144575, var18 ^ 908203576)) {
                           case 0 -> a(1711144574, var18 ^ 1373544691);
                           case 1 -> a(1711144569, var18 ^ -520397835);
                           case 2 -> a(1711144568, var18 ^ -1521616217);
                           case 3 -> a(1711144571, var18 ^ 1555967459);
                           case 4 -> a(1711144570, var18 ^ 2114723112);
                           case 5 -> a(1711144565, var18 ^ 2137793644);
                           default -> a(1711144564, var18 ^ -422849889);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var75 = var10001;
                           var61 = var44;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var61 = var44;
                           var75 = var6;
                        }
                     }
                  }

                  String var68 = new String(var44).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var68;
                        if ((var20 += var2) >= var5) {
                           ab = new abaabaab(aabbaaaba.aaab(var0[0]));
                           a = new abaabaab(aabbaaaba.aaab(var0[3]));
                           aa = b();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var68;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label103;
                        }

                        var5 = (var3 = aa((short)19952, 59865, var18 ^ -1537529611)).length();
                        var2 = a(1711144572, var18 ^ 1315806304);
                        var20 = -1;
                  }

                  var23 = var3.substring(++var20, var20 + var2);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 104;
                  case 1 -> 214;
                  case 2 -> 52;
                  case 3 -> 139;
                  case 4 -> 230;
                  case 5 -> 156;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static String aa(short var0, int var1, int var2) {
      int var3 = var1 ^ 59864;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10817;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 20234;
         var10 ^= 54935;
         var10 -= 3205;
         var10 -= 22781;
         var10 += 23759;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }
}
