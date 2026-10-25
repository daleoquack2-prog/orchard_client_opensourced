package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record bbbbaaaa(int a, int b, int c, int d, boolean e, boolean f, abaabbba g) {
   private final int aa;
   private final boolean ab;
   private final boolean ba;
   private static final Integer[] bb;
   private final int aaa;
   private final abaabbba b;
   private static final Object[] bab;
   private final int aab;
   private static final int[] abb;
   private static final String[] baa;
   private static final long[] aba;

   public int aa() {
      return this.a;
   }

   public boolean b() {
      return this.ba;
   }

   public int ab() {
      return this.aa;
   }

   private static String baa(char var0, int var1, char var2) {
      int var3 = var2 ^ 16694;
      char[] var4 = baa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 29450;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 6337;
         var10 += 16031;
         var10 ^= 20265;
         var10 ^= 7038;
         var10 ^= 58051;
         var10 += 64007;
         var10 -= 44775;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   static {
      int var18 = 1693844586;
      String[] var10 = new String[2];
      int var12 = 0;
      int var11 = 0;
      short var13 = 7831;
      int var9 = "\u0010ǹ假Ùဝ۱ၴޥ偽ީ偰ߝ偂Å큹ѝ큲\n筎枲策\ue7ad窊Ꞩ窾\ue7a8竞\ue7aa".length();
      String var8 = "\u0010ǹ假Ùဝ۱ၴޥ偽ީ偰ߝ偂Å큹ѝ큲\n筎枲策\ue7ad窊Ꞩ窾\ue7a8竞\ue7aa";

      do {
         char var14 = var8.charAt(var12);
         int var16 = 0;
         char[] var15 = var8.substring(var12 + 1, var12 + 1 + var14).toCharArray();

         do {
            char var17 = var15[var16];
            if (var16 % 2 == 0) {
               var15[var16] = (char)((var17 >>> 2 | var17 << 14) & 65535 ^ var13);
            } else {
               var15[var16] = (char)((var17 << 2 | var17 >>> 14) & 65535 ^ var13);
            }
         } while (++var16 < var15.length);

         var10[var11] = new String(var15);
         var11++;
         var12 = var12 + var14 + 1;
      } while (var12 < var9);

      baa = var10;
      bab = new Object[var10.length];
      byte var10000 = 0;
      int var10001 = 0;
      abb = new int[12];
      byte[] var10002 = "ÌäØýºQ[>NM\u0011Dê\u0095\u008a:®+å?t(A\u001b4\u0081Tô|¬·\u008c´9Ë\u00139»*-óC² åÒ\u001eá".getBytes("ISO-8859-1");

      int var35;
      do {
         abb[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1443523829;
         var10000 += 1;
         var35 = var10001 + 4;
         var10001 += 4;
      } while (var35 < var10002.length);

      long var0 = 7247379944157643234L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4;
      int var5 = (var4 = baa('᜴', var18 ^ 2040034061, '䄶')).length();
      byte var2 = 0;

      do {
         var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(baa('ᾓ', var18 ^ -1766104848, '䄷'));
         var10001 = var3++;
         long var43 = (
               (var7[0] & 255L) << abb(867979492, var18 ^ 844744654)
                  | (var7[1] & 255L) << abb(867979493, var18 ^ 1156334692)
                  | (var7[2] & 255L) << abb(867979494, var18 ^ -1326445019)
                  | (var7[3] & 255L) << abb(867979495, var18 ^ 338204018)
                  | (var7[4] & 255L) << abb(867979488, var18 ^ 1352071784)
                  | (var7[5] & 255L) << abb(867979489, var18 ^ -1969922331)
                  | (var7[abb(867979490, var18 ^ -902018061)] & 255L) << abb(867979491, var18 ^ -2112771960)
                  | var7[abb(867979500, var18 ^ 1250219033)] & 255L
            )
            ^ var0;
         byte var36 = -1;
         var6[var10001] = var43;
      } while (var2 < var5);

      aba = var6;
      bb = new Integer[2];
   }

   public int ba() {
      return this.aab;
   }

   public bbbbaaaa(int a, int b, int c, int d, boolean e, boolean f, abaabbba g) {
      this.aaa = a;
      this.a = b;
      this.aa = c;
      this.aab = d;
      this.ab = e;
      this.ba = f;
      this.b = g;
   }

   public boolean bb() {
      return this.ab;
   }

   private static int aaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ abb(867979501, 182634620 ^ -1458370362);
      if (bb[var3] == null) {
         bb[var3] = (int)(aba[var3] ^ var1);
      }

      return bb[var3];
   }

   public int aab() {
      return this.aaa;
   }

   static bbbbaaaa aba(int var0) {
      return new bbbbaaaa(
         -1,
         var0,
         aaa(abb(867979502, -1683428642 ^ -224290787), 5792562219908625929L),
         aaa(abb(867979503, -1683428642 ^ -466602851), 5891531985922848712L),
         false,
         false,
         null
      );
   }

   private static int abb(int var0, int var1) {
      int var2 = abb[var0 ^ 867979492] ^ var1 ^ var0;
      var2 += 16364;
      var2 ^= 58323;
      var2 ^= 17917;
      var2 ^= 28665;
      var2 += 23994;
      var2 += 8449;
      var2 += 32937;
      var2 += 41056;
      return var2 + 45457;
   }

   public abaabbba a() {
      return this.b;
   }
}
