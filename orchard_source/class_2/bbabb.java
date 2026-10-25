package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum bbabb {
   private static final bbabb[] aa;
   public static final bbabb b;
   private final ababbbbaa ab;
   private static final int[] bb;
   public static final bbabb a;
   private static final String[] aaa;
   private static final Object[] aab;
   public static final bbabb ba;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 411784141;
      byte var14 = -1;
      String var8 = "蜩蝆螴螈螀蟟螑螴螉螛蝟蟹蝱螿蜨蜎螨蟶螾蝠螏螀蜝蜣蟕蜂蝣\u2cf5ⲔⱢⱊⱒⱰⱚⱊⰺⰤⲪⰻⳡ";
      short var7 = 10549;
      char[] var9 = "⤮⤸".toCharArray();
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            aaa = var10;
            aab = new Object[var10.length];
            byte var22 = 0;
            int var10001 = 0;
            byte[] var10002 = "Ó\u0015ô'\b×²'\f*ªt\u0096#üwm,-\u0084£ÿÿ\u000bLHýÊ\u0004ü¸ó".getBytes("ISO-8859-1");
            bb = new int[8];

            int var57;
            do {
               bb[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 465274353;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[a(-1301436024, var18 ^ -1648909253)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa(-2114407263, var18 ^ -1514074245)).length();
            char var2 = 4;
            int var20 = -1;

            label102:
            while (true) {
               String var23 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label97: {
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
                           break label97;
                        }

                        var61 = var29;
                        var75 = var6;
                     }

                     while (true) {
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(-1301436023, var18 ^ 1182130741)) {
                           case 0 -> a(-1301436022, var18 ^ 1116268278);
                           case 1 -> a(-1301436021, var18 ^ -662589136);
                           case 2 -> a(-1301436020, var18 ^ 596533517);
                           case 3 -> a(-1301436019, var18 ^ -312626189);
                           case 4 -> a(-1301436018, var18 ^ 48935290);
                           case 5 -> 4;
                           default -> a(-1301436017, var18 ^ 1247736847);
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
                           a = new bbabb(aabbaaaba.aaab(var0[2]));
                           ba = new bbabb(aabbaaaba.aaab(var0[5]));
                           b = new bbabb(aabbaaaba.aaab(var0[1]));
                           aa = b();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var68;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label102;
                        }

                        var5 = (var3 = aa(-2114407264, var18 ^ 236145633)).length();
                        var2 = 4;
                        var20 = -1;
                  }

                  var23 = var3.substring(++var20, var20 + var2);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 0;
                  case 1 -> 123;
                  case 2 -> 249;
                  case 3 -> 198;
                  case 4 -> 202;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ -1301436024] ^ var1 ^ var0;
      var2 += 21827;
      var2 -= 155;
      var2 -= 5121;
      var2 ^= 51647;
      var2 += 33507;
      var2 -= 38696;
      var2 += 30593;
      var2 -= 30656;
      var2 -= 11607;
      return var2 + 34801;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -2114407263;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 708550058;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 186;
            case 1 -> 231;
            case 2 -> 216;
            case 3 -> 206;
            case 4 -> 227;
            case 5 -> 43;
            case 6 -> 62;
            case 7 -> 219;
            case 8 -> 160;
            case 9 -> 158;
            case 10 -> 141;
            case 11 -> 63;
            case 12 -> 37;
            case 13 -> 208;
            case 14 -> 115;
            case 15 -> 217;
            case 16 -> 111;
            case 17 -> 146;
            case 18 -> 189;
            case 19 -> 60;
            case 20 -> 62;
            case 21 -> 17;
            case 22 -> 65;
            case 23 -> 124;
            case 24 -> 207;
            case 25 -> 130;
            case 26 -> 148;
            case 27 -> 212;
            case 28 -> 114;
            case 29 -> 109;
            case 30 -> 119;
            case 31 -> 199;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static bbabb[] b() {
      return new bbabb[]{a, ba, b};
   }

   private bbabb(ababbbbaa var3) {
      this.ab = var3;
   }

   @Override
   public String toString() {
      return this.ab.abab();
   }
}
