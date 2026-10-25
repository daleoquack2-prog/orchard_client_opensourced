package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aaaaaaab {
   private final boolean aa;
   private static final Object[] aba;
   private static final int[] aaa;
   private static final aaaaaaab[] b;
   private final boolean ab;
   public static final aaaaaaab a;
   public static final aaaaaaab ba;
   private static final String[] aab;
   public static final aaaaaaab bb;

   private aaaaaaab(boolean var3, boolean var4) {
      this.ab = var3;
      this.aa = var4;
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -388873253] ^ var1 ^ var0;
      var2 -= 30188;
      var2 ^= 13652;
      var2 ^= 35742;
      var2 -= 5052;
      var2 += 15876;
      return var2 - 717;
   }

   private static String bb(int var0, int var1) {
      int var3 = var0 ^ -886570106;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1761024679;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 43;
            case 1 -> 246;
            case 2 -> 67;
            case 3 -> 241;
            case 4 -> 186;
            case 5 -> 109;
            case 6 -> 103;
            case 7 -> 129;
            case 8 -> 58;
            case 9 -> 60;
            case 10 -> 52;
            case 11 -> 247;
            case 12 -> 80;
            case 13 -> 183;
            case 14 -> 170;
            case 15 -> 134;
            case 16 -> 166;
            case 17 -> 82;
            case 18 -> 55;
            case 19 -> 2;
            case 20 -> 246;
            case 21 -> 166;
            case 22 -> 90;
            case 23 -> 54;
            case 24 -> 219;
            case 25 -> 29;
            case 26 -> 133;
            case 27 -> 21;
            case 28 -> 233;
            case 29 -> 200;
            case 30 -> 131;
            case 31 -> 146;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 675251133;
      String[] var10001 = new String[1];
      short var12 = 1583;
      int var10 = 0;
      String[] var9 = var10001;
      int var11 = 0;
      int var8 = "\u0014㲥⯌㿀\ufbcdれ᮱㢑\udbfc㷡⭰㢡므㻰譫㔅鯋ぐ篇㦜\udbb7".length();
      String var7 = "\u0014㲥⯌㿀\ufbcdれ᮱㢑\udbfc㷡⭰㢡므㻰譫㔅鯋ぐ篇㦜\udbb7";

      do {
         char var13 = var7.charAt(var11);
         int var21 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var21, var10002 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 206;
               case 1 -> 250;
               case 2 -> 75;
               case 3 -> 250;
               case 4 -> 247;
               case 5 -> 139;
               case 6 -> 90;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      aab = var9;
      aba = new Object[var9.length];
      byte var20 = 0;
      byte var22 = 0;
      aaa = new int[9];
      byte[] var33 = "Â%¥Ñ©%aD-õ\u0018rýÏ\u0099m\u001ft±\u00ad\u0010a¢^gkæî{\u00059úEðP¿".getBytes("ISO-8859-1");

      int var53;
      do {
         aaa[var20] = ((var33[var22] & 255) << 24 | (var33[var22 + 1] & 255) << 16 | (var33[var22 + 2] & 255) << 8 | var33[var22 + 3] & 255) ^ -1855657029;
         var20 += 1;
         var53 = var22 + 4;
         var22 += 4;
      } while (var53 < var33.length);

      String[] var0 = new String[3];
      int var4 = 0;
      String var3;
      int var5 = (var3 = bb(-886570106, var17 ^ 727224017)).length();
      int var2 = b(-388873253, var17 ^ 1817399870);
      int var1 = -1;

      while (true) {
         label87: {
            char[] var25 = var3.substring(++var1, var1 + var2).toCharArray();
            var53 = var25.length;
            int var6 = 0;
            var41 = var25;
            int var28 = var53;
            char[] var57;
            int var71;
            if (var53 <= 1) {
               var57 = var25;
               var71 = var6;
            } else {
               var41 = var25;
               var28 = var53;
               if (var53 <= var6) {
                  break label87;
               }

               var57 = var25;
               var71 = var6;
            }

            while (true) {
               var57[var71] = (char)(var57[var71] ^ switch (var6 % b(-388873254, var17 ^ 122918570)) {
                  case 0 -> b(-388873255, var17 ^ -2088505371);
                  case 1 -> b(-388873256, var17 ^ 1404661421);
                  case 2 -> b(-388873249, var17 ^ -1325250956);
                  case 3 -> b(-388873250, var17 ^ -1105767018);
                  case 4 -> b(-388873251, var17 ^ -920841949);
                  case 5 -> b(-388873252, var17 ^ -713830839);
                  default -> b(-388873261, var17 ^ -343496915);
               });
               var6++;
               if (var28 == 0) {
                  var71 = var28;
                  var57 = var41;
               } else {
                  if (var28 <= var6) {
                     break;
                  }

                  var57 = var41;
                  var71 = var6;
               }
            }
         }

         String var64 = new String(var41).intern();
         byte var32 = -1;
         var0[var4++] = var64;
         if ((var1 += var2) >= var5) {
            a = new aaaaaaab(false, false);
            ba = new aaaaaaab(true, false);
            bb = new aaaaaaab(true, true);
            b = aa();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static aaaaaaab[] aa() {
      return new aaaaaaab[]{a, ba, bb};
   }

   boolean ab() {
      return this.ab;
   }

   public static aaaaaaab ba(String var0) {
      return Enum.valueOf(aaaaaaab.class, var0);
   }

   boolean a() {
      return this.aa;
   }
}
