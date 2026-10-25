package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum baaabaaa {
   private static final String[] aba;
   private static final Object[] abb;
   private static final int[] aab;
   private static final baaabaaa[] aa;
   public static final baaabaaa b;
   public static final baaabaaa ab;
   private final ababbbbaa ba;
   public static final baaabaaa a;
   public static final baaabaaa bb;
   public static final baaabaaa aaa;

   private static int a(int var0, int var1) {
      int var2 = aab[var0 ^ -530077047] ^ var1 ^ var0;
      var2 -= 5309;
      var2 ^= 46543;
      var2 ^= 29811;
      var2 ^= 6167;
      var2 -= 27201;
      var2 ^= 23054;
      var2 ^= 29581;
      var2 ^= 22521;
      return var2 ^ 61818;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 2023483662;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         abb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -57795715;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 156;
            case 1 -> 96;
            case 2 -> 244;
            case 3 -> 40;
            case 4 -> 135;
            case 5 -> 137;
            case 6 -> 176;
            case 7 -> 222;
            case 8 -> 116;
            case 9 -> 44;
            case 10 -> 49;
            case 11 -> 101;
            case 12 -> 232;
            case 13 -> 22;
            case 14 -> 214;
            case 15 -> 232;
            case 16 -> 235;
            case 17 -> 159;
            case 18 -> 222;
            case 19 -> 188;
            case 20 -> 247;
            case 21 -> 33;
            case 22 -> 10;
            case 23 -> 204;
            case 24 -> 114;
            case 25 -> 146;
            case 26 -> 205;
            case 27 -> 20;
            case 28 -> 135;
            case 29 -> 107;
            case 30 -> 50;
            case 31 -> 57;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static baaabaaa[] b() {
      return new baaabaaa[]{b, bb, aaa, a, ab};
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   private baaabaaa(ababbbbaa var3) {
      this.ba = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1613668179;
      int var17 = 0;
      int var14 = "n킐胙푐ボ횰Õ훀냒\udc80샞\ud880⃟탠태큐\ue0d4퉰냐퍰\ue0d3퇠惚\udd60ꃐ\ud830ꃑ퍀⃛큰胛\uded0Ý홠탛토郘탠惗튀냒\udd00택\udd80Û텰ヘ퍰냔큰\uf0d6퀰郔퐀\uf0de\ud9e0\uf0d1\ud850ꃗ퍠䃚휀郚\udc30냛휐烜턀냘킰탕톐烓\udc40Ý\udaf0郞훰\uf0df퇰냔퍰胒퀐\ue0d3햠Ü\ud8f0ꃓ\udd30⃖팀택혐생\ude30\uf0df퓀䃙헀탟힠⃕킰\uf0d3\udae0䃝\udc40⃟혐냝\u000e\ue46dᷬ\ue09d뷩\ue20d緡\ue3fd巡\uedcd跨\uee9dᷬ\ue05dⷫ"
         .length();
      String var13 = "n킐胙푐ボ횰Õ훀냒\udc80샞\ud880⃟탠태큐\ue0d4퉰냐퍰\ue0d3퇠惚\udd60ꃐ\ud830ꃑ퍀⃛큰胛\uded0Ý홠탛토郘탠惗튀냒\udd00택\udd80Û텰ヘ퍰냔큰\uf0d6퀰郔퐀\uf0de\ud9e0\uf0d1\ud850ꃗ퍠䃚휀郚\udc30냛휐烜턀냘킰탕톐烓\udc40Ý\udaf0郞훰\uf0df퇰냔퍰胒퀐\ue0d3햠Ü\ud8f0ꃓ\udd30⃖팀택혐생\ude30\uf0df퓀䃙헀탟힠⃕킰\uf0d3\udae0䃝\udc40⃟혐냝\u000e\ue46dᷬ\ue09d뷩\ue20d緡\ue3fd巡\uedcd跨\uee9dᷬ\ue05dⷫ";
      int var16 = 0;
      String[] var10000 = new String[2];
      short var18 = 13084;
      String[] var15 = var10000;

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << '\f') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> '\f') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aba = var15;
      abb = new Object[var15.length];
      int var9 = -1626401377;
      byte[] var7 = "\u009b)\nâà)\u0011¯B§èuØv8æ×\f\u0095VG\u0012\u009e®Æ\u0004Y%R\u001bÖí\u009dI\u009d_ÎEf0öF\u001f\u0093Fã.¼Ö\u009dwsJ;Y\u001e\u001að\u001dÉ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      aab = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         aab[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[a(-530077047, var23 ^ -2073092294)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa(2023483662, var23 ^ 1100133325)).length();
      int var2 = a(-530077048, var23 ^ -9501621);
      int var25 = -1;

      label87:
      while (true) {
         String var27 = var3.substring(++var25, var25 + var2);
         int var10001 = -1;

         while (true) {
            char[] var39;
            label82: {
               char[] var30 = var27.toCharArray();
               int var10003 = var30.length;
               int var6 = 0;
               var39 = var30;
               var10001 = var10003;
               char[] var47;
               int var10004;
               if (var10003 <= 1) {
                  var47 = var30;
                  var10004 = var6;
               } else {
                  var39 = var30;
                  var10001 = var10003;
                  if (var10003 <= var6) {
                     break label82;
                  }

                  var47 = var30;
                  var10004 = var6;
               }

               while (true) {
                  var47[var10004] = (char)(var47[var10004] ^ switch (var6 % a(-530077046, var23 ^ -953144064)) {
                     case 0 -> a(-530077043, var23 ^ -934641521);
                     case 1 -> a(-530077044, var23 ^ 1481935372);
                     case 2 -> a(-530077041, var23 ^ -649966344);
                     case 3 -> a(-530077042, var23 ^ 1297990217);
                     case 4 -> a(-530077055, var23 ^ -2112910853);
                     case 5 -> a(-530077056, var23 ^ -788303166);
                     default -> a(-530077053, var23 ^ -385873131);
                  });
                  var6++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var47 = var39;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var47 = var39;
                     var10004 = var6;
                  }
               }
            }

            String var54 = new String(var39).intern();
            switch (var10001) {
               case 0:
                  var0[var4++] = var54;
                  if ((var25 += var2) >= var5) {
                     b = new baaabaaa(aabbaaaba.aaab(var0[5]));
                     bb = new baaabaaa(
                        aabbaaaba.aaab(var0[a(-530077054, var23 ^ 1504000859)])
                     );
                     aaa = new baaabaaa(aabbaaaba.aaab(var0[2]));
                     a = new baaabaaa(aabbaaaba.aaab(var0[a(-530077049, var23 ^ 95815714)]));
                     ab = new baaabaaa(aabbaaaba.aaab(var0[1]));
                     aa = b();
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

                  var5 = (var3 = aa(2023483663, var23 ^ -1832157118)).length();
                  var2 = a(-530077045, var23 ^ 1575091628);
                  var25 = -1;
            }

            var27 = var3.substring(++var25, var25 + var2);
            var10001 = 0;
         }
      }
   }
}
