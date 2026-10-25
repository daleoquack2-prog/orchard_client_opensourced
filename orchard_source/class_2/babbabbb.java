package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum babbabbb implements bbaabba {
   private final boolean aa;
   private static final int[] aaa;
   private static final String[] aab;
   public static final babbabbb b;
   private static final Object[] aba;
   public static final babbabbb ab;
   private final ababbbbaa ba;
   public static final babbabbb a;
   private static final babbabbb[] bb;

   private static String ab(int var0, char var1, char var2) {
      int var7 = var0 ^ 1980854717;
      char[] var6 = aab[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aba[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         aba[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 62509;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 25) {
            default -> 5;
            case 1 -> 27;
            case 2 -> 4;
            case 3 -> 61;
            case 4 -> 224;
            case 5 -> 99;
            case 6 -> 29;
            case 7 -> 42;
            case 8 -> 73;
            case 9 -> 36;
            case 10 -> 242;
            case 11 -> 25;
            case 12 -> 44;
            case 13 -> 74;
            case 14 -> 20;
            case 15 -> 208;
            case 16 -> 115;
            case 17 -> 181;
            case 18 -> 139;
            case 19 -> 157;
            case 20 -> 10;
            case 21 -> 72;
            case 22 -> 243;
            case 23 -> 204;
            case 24 -> 132;
         } ^ var0 ^ var2 ^ var4 ^ var1);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   @Override
   public Enum ba() {
      return this;
   }

   private babbabbb(ababbbbaa var3) {
      this(var3, true);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1566762942;
      byte var20 = -1;
      char[] var15 = "᧭᧕".toCharArray();
      String var14 = "톩텫퇺톂턠퇟톐턴퇃톆턐퇷톳턬톳텙톐텡턋퇤퇮톆텞턁턚텟톷톨퇷텗퇐텂톊퇆톋텽톔턯퇏톉턥톨턦퇭턮톃톢턲텩톝퇧퇓ລ\u0e78\u0edaຕ๎\u0eeaໜ๏\u0eefຢ฿\u0eec";
      short var13 = 6617;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            aab = var16;
            aba = new Object[var16.length];
            int var9 = 2122533895;
            byte[] var7 = "Ùÿâ\u0091¼!ÛXN\u008eË¤¯~¥\\00À\u0003\u0088\u0087Tc\u009eõJ®Ø\u0097\u0011ÁÝ*\u0097«Ô#sNÝ\t½0".getBytes("ISO-8859-1");
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

            String[] var0 = new String[a(-555370881, var24 ^ -620381792)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab(1980854717, '間', (char)'쓲')).length();
            int var2 = a(-555370882, var24 ^ -1092911034);
            int var26 = -1;

            label98:
            while (true) {
               String var29 = var3.substring(++var26, var26 + var2);
               int var10001 = -1;

               while (true) {
                  char[] var41;
                  label93: {
                     char[] var32 = var29.toCharArray();
                     int var10003 = var32.length;
                     int var6 = 0;
                     var41 = var32;
                     var10001 = var10003;
                     char[] var49;
                     int var10004;
                     if (var10003 <= 1) {
                        var49 = var32;
                        var10004 = var6;
                     } else {
                        var41 = var32;
                        var10001 = var10003;
                        if (var10003 <= var6) {
                           break label93;
                        }

                        var49 = var32;
                        var10004 = var6;
                     }

                     while (true) {
                        var49[var10004] = (char)(var49[var10004] ^ switch (var6 % a(-555370884, var24 ^ -1383793047)) {
                           case 0 -> a(-555370885, var24 ^ 852138898);
                           case 1 -> a(-555370886, var24 ^ -1971515641);
                           case 2 -> a(-555370887, var24 ^ -1676733965);
                           case 3 -> a(-555370888, var24 ^ -630373048);
                           case 4 -> a(-555370889, var24 ^ -539964252);
                           case 5 -> a(-555370890, var24 ^ -690411550);
                           default -> a(-555370891, var24 ^ -537663936);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var49 = var41;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var49 = var41;
                           var10004 = var6;
                        }
                     }
                  }

                  String var56 = new String(var41).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var56;
                        if ((var26 += var2) >= var5) {
                           b = new babbabbb(aabbaaaba.aaab(var0[1]));
                           ab = new babbabbb(aabbaaaba.aaab(var0[2]));
                           a = new babbabbb(aabbaaaba.aaab(var0[0]));
                           bb = b();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var56;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label98;
                        }

                        var5 = (var3 = ab(1980854716, '濅', (char)'\ue1bd')).length();
                        var2 = a(-555370883, var24 ^ 1282707607);
                        var26 = -1;
                  }

                  var29 = var3.substring(++var26, var26 + var2);
                  var10001 = 0;
               }
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 207;
                  case 1 -> 17;
                  case 2 -> 203;
                  case 3 -> 145;
                  case 4 -> 252;
                  case 5 -> 180;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static babbabbb[] b() {
      return new babbabbb[]{b, ab, a};
   }

   private static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ -555370881] ^ var1 ^ var0;
      var2 ^= 53551;
      var2 -= 12424;
      var2 ^= 1975;
      var2 -= 17687;
      var2 += 30891;
      var2 -= 45145;
      return var2 - 45920;
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   public static babbabbb aa(String var0) {
      return Enum.valueOf(babbabbb.class, var0);
   }

   @Override
   public boolean bb() {
      return this.aa;
   }

   private babbabbb(ababbbbaa var3, boolean var4) {
      this.ba = var3;
      this.aa = var4;
   }
}
