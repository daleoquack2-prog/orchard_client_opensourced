package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bbbbb {
   public static final bbbbb aa;
   public static final bbbbb ab;
   private static final int[] aab;
   private static final String[] aba;
   private static final Object[] abb;
   public static final bbbbb ba;
   private static final bbbbb[] bb;
   private final ababbbbaa b;
   public static final bbbbb a;
   public static final bbbbb aaa;

   public static bbbbb b(String var0) {
      return Enum.valueOf(bbbbb.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -918417816;
      int var10001 = "T꩜劮게ኳꭜ犴꠬劳ꠜ튬귬酼弔ㅻ릤劮곜늮만ᄘ弼튫廌\uf2e5ꠔ犩괬兿귴늭府銷를㊪ꭤ넘弜늱弬ㅰ\uab6c늭\uaac4銳\ua83c銭릜劫弄犫걔劳ꭼ焘弬㊮걔鄘䘤\uf17f귴\u12b7겴狥尌\uf2adꫬ劳계\uf2b1꩔튬幤鋦곔煺尌ㅰ庄ካꮤ㊲ꠜ鋥\u001c卒褅咒ॗ䆚ꤸ呲ꥉ䅚\ue949䅢⥏匊褆朒\ue954勪楍嗪꤅咪\ue99c暢褆柒楔咂쥗"
         .length();
      String[] var9 = new String[2];
      int var8 = var10001;
      short var12 = 29184;
      String var7 = "T꩜劮게ኳꭜ犴꠬劳ꠜ튬귬酼弔ㅻ릤劮곜늮만ᄘ弼튫廌\uf2e5ꠔ犩괬兿귴늭府銷를㊪ꭤ넘弜늱弬ㅰ\uab6c늭\uaac4銳\ua83c銭릜劫弄犫걔劳ꭼ焘弬㊮걔鄘䘤\uf17f귴\u12b7겴狥尌\uf2adꫬ劳계\uf2b1꩔튬幤鋦곔煺尌ㅰ庄ካꮤ㊲ꠜ鋥\u001c卒褅咒ॗ䆚ꤸ呲ꥉ䅚\ue949䅢⥏匊褆朒\ue954勪楍嗪꤅咪\ue99c暢褆柒楔咂쥗";
      int var11 = 0;
      int var10 = 0;

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << '\r') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> '\r') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      aba = var9;
      abb = new Object[var9.length];
      byte var10000 = 0;
      int var22 = 0;
      aab = new int[14];
      byte[] var10002 = "£U\u0084Ó,w\u0001ÊôÁü°dlë\u0014Sf\u0003{\u009dæÇW\u000b\u008cmN®÷k%!ê~D\u0080g\u0017\u0080GK#æ d\u009aÚ\u0002¶ì:\u0013qX\u009d"
         .getBytes("ISO-8859-1");

      int var55;
      do {
         aab[var10000] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ -1711645821;
         var10000 += 1;
         var55 = var22 + 4;
         var22 += 4;
      } while (var55 < var10002.length);

      String[] var0 = new String[a(1453110584, var17 ^ -1519305054)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab('퓇', var17 ^ 336139507, 25482)).length();
      int var2 = 4;
      int var19 = -1;

      label91:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var22 = (byte)-1;

         while (true) {
            label86: {
               char[] var27 = var20.toCharArray();
               var55 = var27.length;
               int var6 = 0;
               var42 = var27;
               var22 = var55;
               char[] var59;
               int var73;
               if (var55 <= 1) {
                  var59 = var27;
                  var73 = var6;
               } else {
                  var42 = var27;
                  var22 = var55;
                  if (var55 <= var6) {
                     break label86;
                  }

                  var59 = var27;
                  var73 = var6;
               }

               while (true) {
                  var59[var73] = (char)(var59[var73] ^ switch (var6 % a(1453110586, var17 ^ -219855052)) {
                     case 0 -> a(1453110587, var17 ^ 1648906374);
                     case 1 -> a(1453110588, var17 ^ 1430435992);
                     case 2 -> a(1453110589, var17 ^ -1681752909);
                     case 3 -> a(1453110590, var17 ^ 229168828);
                     case 4 -> a(1453110591, var17 ^ -1462513528);
                     case 5 -> a(1453110576, var17 ^ 667862522);
                     default -> a(1453110577, var17 ^ -2042385326);
                  });
                  var6++;
                  if (var22 == 0) {
                     var73 = var22;
                     var59 = var42;
                  } else {
                     if (var22 <= var6) {
                        break;
                     }

                     var59 = var42;
                     var73 = var6;
                  }
               }
            }

            String var66 = new String(var42).intern();
            switch (var22) {
               case 0:
                  var0[var4++] = var66;
                  if ((var19 += var2) >= var5) {
                     ab = new bbbbb(aabbaaaba.aaab(var0[1]));
                     aa = new bbbbb(aabbaaaba.aaab(var0[5]));
                     ba = new bbbbb(aabbaaaba.aaab(var0[a(1453110579, var17 ^ 641737046)]));
                     a = new bbbbb(aabbaaaba.aaab(var0[a(1453110580, var17 ^ 76699571)]));
                     aaa = new bbbbb(aabbaaaba.aaab(var0[3]));
                     bb = aa();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var66;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label91;
                  }

                  var5 = (var3 = ab('퉃', var17 ^ 1476152154, 25483)).length();
                  var2 = a(1453110585, var17 ^ 710130244);
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var22 = (byte)0;
         }
      }
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private static String ab(char var0, int var1, int var2) {
      int var3 = var2 ^ 25482;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         abb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 19747;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\uf693';
         var10 ^= 50093;
         var10 -= 39735;
         var10 ^= 64214;
         var10 -= 23475;
         var10 -= 7831;
         var10 += 47539;
         var10 ^= 42702;
         var10 -= 51225;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = aab[var0 ^ 1453110584] ^ var1 ^ var0;
      var2 ^= 53854;
      var2 -= 36491;
      var2 -= 16129;
      var2 ^= 41225;
      var2 += 9402;
      return var2 + 49367;
   }

   private bbbbb(ababbbbaa var3) {
      this.b = var3;
   }

   private static bbbbb[] aa() {
      return new bbbbb[]{ab, aa, ba, a, aaa};
   }
}
