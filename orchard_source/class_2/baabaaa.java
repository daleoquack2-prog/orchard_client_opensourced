package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum baabaaa {
   private static final baabaaa[] aa;
   private final ababbbbaa b;
   public static final baabaaa a;
   private static final int[] ba;
   private static final String[] bb;
   private static final Object[] aaa;
   public static final baabaaa ab;

   private static String aa(int var0, char var1, int var2) {
      int var3 = var0 ^ 26768;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 20133;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 31150;
         var10 += 41853;
         var10 += 36872;
         var10 -= 41446;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static baabaaa[] b() {
      return new baabaaa[]{a, ab};
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 1982540810] ^ var1 ^ var0;
      var2 ^= 8126;
      var2 ^= 6866;
      var2 ^= 33677;
      var2 += 23554;
      var2 ^= 63464;
      var2 ^= 28717;
      var2 -= 42669;
      var2 += 59974;
      var2 -= 50128;
      return var2 ^ 58725;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -996780273;
      char[] var10002 = "\u0010\u0010".toCharArray();
      byte var20 = -1;
      char[] var15 = var10002;
      String var14 = "\uec92\uecfe\uecce\uec5c\uecaa\uecae\uecdb\uecec\uec3b\uec22\uec16\uec1d\uec87\uecc0\uec70\uecf9⤔⺃⹒⦐⥨⤭⥌⤨⦝⦪⥹⤫⥘⤴⹋⧒";
      short var13 = 5225;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            bb = var16;
            aaa = new Object[var16.length];
            int var9 = 2045784387;
            byte[] var7 = "ÈÀ\u0001\u0084p\u0006\nYåa\u0006P\u008bÆ\u008bJÉe\u009d\u001c\u0013\u001f5Ø×D)ðê°&¯»ÄM\u0094".getBytes("ISO-8859-1");
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
            int var5 = (var3 = aa(26768, '㻞', var24 ^ -1710283671)).length();
            int var2 = a(1982540810, var24 ^ 59526012);
            int var26 = -1;

            label100:
            while (true) {
               String var29 = var3.substring(++var26, var26 + var2);
               int var10001 = -1;

               while (true) {
                  label95: {
                     char[] var32 = var29.toCharArray();
                     int var10003 = var32.length;
                     int var6 = 0;
                     var10002 = var32;
                     var10001 = var10003;
                     char[] var50;
                     int var10004;
                     if (var10003 <= 1) {
                        var50 = var32;
                        var10004 = var6;
                     } else {
                        var10002 = var32;
                        var10001 = var10003;
                        if (var10003 <= var6) {
                           break label95;
                        }

                        var50 = var32;
                        var10004 = var6;
                     }

                     while (true) {
                        var50[var10004] = (char)(var50[var10004] ^ switch (var6 % a(1982540811, var24 ^ -1152761691)) {
                           case 0 -> a(1982540808, var24 ^ 774720590);
                           case 1 -> a(1982540809, var24 ^ 1082835219);
                           case 2 -> a(1982540814, var24 ^ 36296519);
                           case 3 -> a(1982540815, var24 ^ -665616619);
                           case 4 -> a(1982540812, var24 ^ 470311702);
                           case 5 -> a(1982540813, var24 ^ 570190944);
                           default -> a(1982540802, var24 ^ 1887963071);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var10004 = var10001;
                           var50 = var10002;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var50 = var10002;
                           var10004 = var6;
                        }
                     }
                  }

                  String var57 = new String(var10002).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var57;
                        if ((var26 += var2) >= var5) {
                           a = new baabaaa(aabbaaaba.aaab(var0[0]));
                           ab = new baabaaa(aabbaaaba.aaab(var0[3]));
                           aa = b();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var57;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label100;
                        }

                        var5 = (var3 = aa(26769, '制', var24 ^ 813318764)).length();
                        var2 = 3;
                        var26 = -1;
                  }

                  var29 = var3.substring(++var26, var26 + var2);
                  var10001 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 147;
                  case 1 -> 181;
                  case 2 -> 120;
                  case 3 -> 65;
                  case 4 -> 191;
                  case 5 -> 166;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private baabaaa(ababbbbaa var3) {
      this.b = var3;
   }
}
