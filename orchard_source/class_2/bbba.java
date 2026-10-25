package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bbba {
   public static final bbba b;
   private static final int[] a;
   private static final String[] aab;
   public static final bbba aa;
   public static final bbba ab;
   public static final bbba ba;
   public static final bbba bb;
   private static final Object[] aba;
   private static final bbba[] aaa;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -1196684618;
      String var8 = "쏕쏃쎖썔썪쏾쏖쏿쎚쌛쌷쏩쏥쏻쎡쌓썭쎴쏤쏊쎸쌡썵쏧쎳쏄쏾쌭썼쏥쎪쏓쎷쌒썸쏝쏒쎶쎧쌻썳쏽쏕쏥쏶쌴썜쏫쎪쏙쎶쌸쌄쏚쏓쏃쎍쌣썐쎆쏎쏸쎇쌁쌸쎶쏠쎊쏏썽쌎쎣쎪槓槆榁楘楥槿槎槬榆椒椦槾槩槾榫椀楽榡槲榩榭椛楢榧";
      char[] var9 = "I\u0018".toCharArray();
      short var7 = 16353;
      String[] var10000 = new String[var9.length];
      byte var14 = -1;
      String[] var10 = var10000;

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            aab = var10;
            aba = new Object[var10.length];
            byte var23 = 0;
            int var10001 = 0;
            a = new int[10];
            byte[] var10002 = "é'rl\n¥9ô\u0082Ñ\u008aZ:¨ç\u0097¬.Ø\u0015g²½\u009fÝÃËF\u0093\u0005óÃñÆÂ-\u0000È'\f".getBytes("ISO-8859-1");

            int var58;
            do {
               a[var23] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1862584660;
               var23 += 1;
               var58 = var10001 + 4;
               var10001 += 4;
            } while (var58 < var10002.length);

            String[] var0 = new String[5];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ab((char)'톎', (byte)-62, 181822303, 126517018, -1722706784, '쎓', '™')).length();
            int var2 = a(353392877, var18 ^ 731876985);
            int var20 = -1;

            label101:
            while (true) {
               String var24 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label96: {
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
                           break label96;
                        }

                        var62 = var30;
                        var76 = var6;
                     }

                     while (true) {
                        var62[var76] = (char)(var62[var76] ^ switch (var6 % a(353392879, var18 ^ 1080653426)) {
                           case 0 -> a(353392878, var18 ^ -133162099);
                           case 1 -> a(353392873, var18 ^ 1855333410);
                           case 2 -> a(353392872, var18 ^ -1526054575);
                           case 3 -> a(353392875, var18 ^ 528168882);
                           case 4 -> a(353392874, var18 ^ 1371344884);
                           case 5 -> a(353392869, var18 ^ 863911655);
                           default -> a(353392868, var18 ^ -1032791274);
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
                           bb = new bbba();
                           aa = new bbba();
                           ba = new bbba();
                           b = new bbba();
                           ab = new bbba();
                           aaa = b();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var69;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label101;
                        }

                        var5 = (var3 = ab((char)'蔍', 7, -507063713, 1159745045, -1722706783, (char)'\uf67c', (char)'閒')).length();
                        var2 = a(353392876, var18 ^ -937572885);
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
                  default -> 36;
                  case 1 -> 15;
                  case 2 -> 87;
                  case 3 -> 199;
                  case 4 -> 173;
                  case 5 -> 59;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static bbba[] b() {
      return new bbba[]{bb, aa, ba, b, ab};
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 353392877] ^ var1 ^ var0;
      var2 ^= 8426;
      var2 ^= 48802;
      var2 -= 48111;
      var2 += 50057;
      var2 -= 27901;
      var2 -= 15340;
      return var2 ^ 22553;
   }

   private static String ab(char var0, byte var1, int var2, int var3, int var4, char var5, char var6) {
      int var11 = var4 ^ -1722706784;
      char[] var10 = aab[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aba[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         aba[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 6483;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ var9 ^ 5678 ^ var0 ^ var4 ^ var5 ^ var1 ^ var6 ^ var8 ^ var2 ^ var3);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   public static bbba aa(String var0) {
      return Enum.valueOf(bbba.class, var0);
   }
}
