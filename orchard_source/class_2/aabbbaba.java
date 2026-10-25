package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aabbbaba {
   public static final aabbbaba aa;
   public static final aabbbaba ab;
   public static final aabbbaba ba;
   public static final aabbbaba bb;
   private static final aabbbaba[] aaa;
   private static final int[] a;
   private static final Object[] aba;
   private final ababbbbaa b;
   private static final String[] aab;

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -1888738543] ^ var1 ^ var0;
      var2 -= 17071;
      var2 += 29655;
      var2 -= 11500;
      var2 -= 14826;
      var2 += 29777;
      var2 += 19132;
      var2 -= 9309;
      var2 -= 43248;
      return var2 - 52920;
   }

   public static aabbbaba b(String var0) {
      return Enum.valueOf(aabbbaba.class, var0);
   }

   private static String ab(int var0, int var1, int var2, byte var3, byte var4, int var5) {
      int var10 = var0 ^ 552694974;
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
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 48789;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 10) {
            default -> 181;
            case 1 -> 83;
            case 2 -> 122;
            case 3 -> 194;
            case 4 -> 43;
            case 5 -> 85;
            case 6 -> 98;
            case 7 -> 96;
            case 8 -> 71;
            case 9 -> 208;
         } ^ 62997 ^ var8 ^ var7 ^ var0 ^ var5 ^ var1 ^ var3 ^ var2 ^ var4);
      }

      return new String(var9).intern();
   }

   private static aabbbaba[] aa() {
      return new aabbbaba[]{ab, ba, aa, bb};
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -671274033;
      byte var20 = -1;
      char[] var15 = "祌祤".toCharArray();
      String var14 = "▸▸┹├┗┻▒═◥▲◶▭┬┄┱╽▾┸▰▃▅▓┖╡╆╺◢┌◣◸▂▤┮├╍└◕╯◑◓▽▰┗┣╽┑░═▧▧▣▐╌╶┅╉◘╗▬⋦⊴≖∔≩≝⋦∔⊎⊐⋚⋨∤≭≒≭⋦∩⊁";
      short var13 = 31095;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            aab = var16;
            aba = new Object[var16.length];
            int var9 = -357548690;
            byte[] var7 = "i»\u009f;9¶Ç\u001cåFEôk\u0089M±\u0099½\u00ad>\u0014Â.¾Ú*(öü\u001c©;²ÿII7¨*8þ5T\u008dè±\u0018CpYð2".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            a = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               a[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[a(-1888738543, var24 ^ -610551771)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab(552694974, -2043520694, 740500499, (byte)-52, 78, -1751632515)).length();
            int var2 = a(-1888738544, var24 ^ -1953046528);
            int var26 = -1;

            label99:
            while (true) {
               String var29 = var3.substring(++var26, var26 + var2);
               int var10001 = -1;

               while (true) {
                  char[] var41;
                  label94: {
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
                           break label94;
                        }

                        var49 = var32;
                        var10004 = var6;
                     }

                     while (true) {
                        var49[var10004] = (char)(var49[var10004] ^ switch (var6 % a(-1888738542, var24 ^ -643208529)) {
                           case 0 -> a(-1888738539, var24 ^ 731745154);
                           case 1 -> a(-1888738540, var24 ^ -1495136235);
                           case 2 -> a(-1888738537, var24 ^ 1745489819);
                           case 3 -> a(-1888738538, var24 ^ 1312591747);
                           case 4 -> a(-1888738535, var24 ^ 14642703);
                           case 5 -> a(-1888738536, var24 ^ -2054681285);
                           default -> a(-1888738533, var24 ^ 1276473877);
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
                           ab = new aabbbaba(aabbaaaba.aaab(var0[2]));
                           ba = new aabbbaba(
                              aabbaaaba.aaab(var0[a(-1888738534, var24 ^ 1519468372)])
                           );
                           aa = new aabbbaba(aabbaaaba.aaab(var0[1]));
                           bb = new aabbbaba(aabbaaaba.aaab(var0[3]));
                           aaa = aa();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var56;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label99;
                        }

                        var5 = (var3 = ab(552694975, -1707239321, -619532428, (byte)-73, (byte)-101, -1806006281)).length();
                        var2 = a(-1888738541, var24 ^ 1466327796);
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
               short var23 = switch (var22 % 5) {
                  default -> 182;
                  case 1 -> 68;
                  case 2 -> 161;
                  case 3 -> 125;
                  case 4 -> 191;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private aabbbaba(ababbbbaa var3) {
      this.b = var3;
   }
}
