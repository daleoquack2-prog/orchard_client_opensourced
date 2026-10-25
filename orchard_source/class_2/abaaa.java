package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abaaa {
   private static final abaaa[] aa;
   private final ababbbbaa b;
   private static final int[] ba;
   private static final Object[] aaa;
   private static final String[] bb;
   public static final abaaa a;
   public static final abaaa ab;

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ -1264973243] ^ var1 ^ var0;
      var2 += 18374;
      var2 ^= 5442;
      var2 += 20932;
      var2 ^= 52542;
      var2 += 49335;
      var2 -= 54281;
      var2 += 63017;
      var2 -= 60576;
      var2 ^= 31547;
      return var2 + 39919;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 865261863;
      char[] var9 = "\r\u0019".toCharArray();
      String var8 = "孚孚嬠嬖嬘嬃孵宭寙孈孓嬃宨焵焖焩煡煚煸焕燃熓焤焑焄燞煮熔焬燝燼熏焭煰焤熽焍煠";
      short var7 = 25512;
      String[] var10000 = new String[var9.length];
      byte var14 = -1;
      String[] var10 = var10000;

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            bb = var10;
            aaa = new Object[var10.length];
            byte var23 = 0;
            int var10001 = 0;
            ba = new int[9];
            byte[] var10002 = "\u0013\u008d¨\u0017ìË\u0093®aH»\u009d\u001cµnÜ\u0004Z®\u0014\u0083à¯\u0001\u009ayu²A\u001c\u0006¤\u0095¶Ö\u001a"
               .getBytes("ISO-8859-1");

            int var58;
            do {
               ba[var23] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1944141808;
               var23 += 1;
               var58 = var10001 + 4;
               var10001 += 4;
            } while (var58 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab(-438449561, var18 ^ 925616990)).length();
            int var2 = a(-1264973243, var18 ^ -412843494);
            int var20 = -1;

            label103:
            while (true) {
               String var24 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label98: {
                     char[] var30 = var24.toCharArray();
                     var58 = var30.length;
                     int var6 = 0;
                     var45 = var30;
                     var10001 = var58;
                     char[] var62;
                     int var76;
                     if (var58 <= 1) {
                        var62 = var30;
                        var76 = var6;
                     } else {
                        var45 = var30;
                        var10001 = var58;
                        if (var58 <= var6) {
                           break label98;
                        }

                        var62 = var30;
                        var76 = var6;
                     }

                     while (true) {
                        var62[var76] = (char)(var62[var76] ^ switch (var6 % a(-1264973241, var18 ^ -1784573589)) {
                           case 0 -> a(-1264973242, var18 ^ -396606743);
                           case 1 -> a(-1264973247, var18 ^ -256670528);
                           case 2 -> 5;
                           case 3 -> a(-1264973248, var18 ^ 1997112205);
                           case 4 -> a(-1264973245, var18 ^ 1854953884);
                           case 5 -> a(-1264973246, var18 ^ -1242223990);
                           default -> a(-1264973235, var18 ^ 1633680577);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var76 = var10001;
                           var62 = var45;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var62 = var45;
                           var76 = var6;
                        }
                     }
                  }

                  String var69 = new String(var45).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var69;
                        if ((var20 += var2) >= var5) {
                           ab = new abaaa(aabbaaaba.aaab(var0[3]));
                           a = new abaaa(aabbaaaba.aaab(var0[2]));
                           aa = aa();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var69;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label103;
                        }

                        var5 = (var3 = ab(-438449562, var18 ^ 492815002)).length();
                        var2 = a(-1264973244, var18 ^ 404928852);
                        var20 = -1;
                  }

                  var24 = var3.substring(++var20, var20 + var2);
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
                  default -> 233;
                  case 1 -> 246;
                  case 2 -> 19;
                  case 3 -> 247;
                  case 4 -> 26;
                  case 5 -> 174;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public static abaaa b(String var0) {
      return Enum.valueOf(abaaa.class, var0);
   }

   private abaaa(ababbbbaa var3) {
      this.b = var3;
   }

   private static abaaa[] aa() {
      return new abaaa[]{ab, a};
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -438449561;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2069980338;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 188;
            case 1 -> 200;
            case 2 -> 100;
            case 3 -> 214;
            case 4 -> 32;
            case 5 -> 187;
            case 6 -> 154;
            case 7 -> 73;
            case 8 -> 168;
            case 9 -> 246;
            case 10 -> 118;
            case 11 -> 128;
            case 12 -> 79;
            case 13 -> 203;
            case 14 -> 155;
            case 15 -> 232;
            case 16 -> 130;
            case 17 -> 19;
            case 18 -> 26;
            case 19 -> 234;
            case 20 -> 44;
            case 21 -> 188;
            case 22 -> 135;
            case 23 -> 144;
            case 24 -> 163;
            case 25 -> 134;
            case 26 -> 5;
            case 27 -> 157;
            case 28 -> 131;
            case 29 -> 117;
            case 30 -> 54;
            case 31 -> 18;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.b.abab();
   }
}
