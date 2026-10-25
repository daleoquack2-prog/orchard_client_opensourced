package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aaaaabab {
   private static final int[] baa;
   private static final Object[] bba;
   private static final Integer[] aa;
   public static final aaaaabab ab;
   private static final long[] ba;
   public static final aaaaabab b;
   public static final aaaaabab bb;
   public static final aaaaabab aaa;
   public static final aaaaabab aab;
   private static final aaaaabab[] aba;
   public static final aaaaabab a;
   public static final aaaaabab abb;
   private static final String[] bab;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var25 = -2017529895;
      int var19 = 0;
      int var18 = 0;
      int var10001 = "T⸗\ue346㭆ꌉ㫹\ue23b⹋戕㿮⍏㽡ꌟ⹗ꈟ⦎⌅㫙戹\u2e5f\ue210㭦\ue34e㽍\ue376⸗≩⽶\ue30a㫥挥㰏∐⸆戞㾑\ue377\u2e5f\ue210㭦\ue34e㽍\ue376⹇∕\u2e5e挄㬥振㰃\ue214⦲戙㽹⍭⦳\ue210㭦\ue34e㽍\ue376⦿ꈐ⸂⌅㭁ꌙ㵿ꈕ⸆\ue34c㬹ꌭ㪗\ue215⹚戟㾑⍫㼏ꌱ⹆扠⼉\ue36b\u001a쵩䱫짜౪칧谩줁豣쵄賵켏䰉츱谗쁼య삇䰨콡谞줘챧촳\u0cdb쵭ఞ\u0018짛ⳋ쉊氠상氋쎧\uecdf츲\uecc8숹Ⰶ쀣곕샂汪썝泺샟氘쎶Ⱋ쳕\uecd8\n倡\u05fc僘藜劓䗰剑藟剠蔣"
         .length();
      String[] var17 = new String[4];
      short var20 = 17934;
      int var16 = var10001;
      String var15 = "T⸗\ue346㭆ꌉ㫹\ue23b⹋戕㿮⍏㽡ꌟ⹗ꈟ⦎⌅㫙戹\u2e5f\ue210㭦\ue34e㽍\ue376⸗≩⽶\ue30a㫥挥㰏∐⸆戞㾑\ue377\u2e5f\ue210㭦\ue34e㽍\ue376⹇∕\u2e5e挄㬥振㰃\ue214⦲戙㽹⍭⦳\ue210㭦\ue34e㽍\ue376⦿ꈐ⸂⌅㭁ꌙ㵿ꈕ⸆\ue34c㬹ꌭ㪗\ue215⹚戟㾑⍫㼏ꌱ⹆扠⼉\ue36b\u001a쵩䱫짜౪칧谩줁豣쵄賵켏䰉츱谗쁼య삇䰨콡谞줘챧촳\u0cdb쵭ఞ\u0018짛ⳋ쉊氠상氋쎧\uecdf츲\uecc8숹Ⰶ쀣곕샂汪썝泺샟氘쎶Ⱋ쳕\uecd8\n倡\u05fc僘藜劓䗰剑藟剠蔣";

      do {
         int var23 = 0;
         char var21 = var15.charAt(var19);
         char[] var22 = var15.substring(var19 + 1, var19 + 1 + var21).toCharArray();

         do {
            int var24 = var22[var23];

            var24 = (char)(switch (var23 % 6) {
               default -> 217;
               case 1 -> 252;
               case 2 -> 200;
               case 3 -> 246;
               case 4 -> 183;
               case 5 -> 210;
            }) ^ var24;
            if (var23 % 2 == 0) {
               var22[var23] = (char)((var24 >>> 2 | var24 << 14) & 65535 ^ var20);
            } else {
               var22[var23] = (char)((var24 << 2 | var24 >>> 14) & 65535 ^ var20);
            }
         } while (++var23 < var22.length);

         var17[var18] = new String(var22);
         var18++;
         var19 = var19 + var21 + 1;
      } while (var19 < var16);

      bab = var17;
      bba = new Object[var17.length];
      byte var29 = 0;
      baa = new int[24];
      int var32 = 0;
      byte[] var10002 = "£\u0002%/àÝC\u0092pÇ\u00839\u009aZtä\u000e-ÆÊ øW©\u0019\u001a\u0087W\u0017\u0080\u0018µØÔÌv\u001f8ó\u0093\u0093ÀÍBF·¦ö«Q»(År(½¥\u0084*\u001f^ïÅ\u0088¨Ù<ïU°\rjjëåú\n¶Øxô\u00139ûlÉ\u000f\u0013¨yÖ\u000fÀî0q"
         .getBytes("ISO-8859-1");

      int var67;
      do {
         baa[var29] = ((var10002[var32] & 255) << 24 | (var10002[var32 + 1] & 255) << 16 | (var10002[var32 + 2] & 255) << 8 | var10002[var32 + 3] & 255)
            ^ 1297120663;
         var29 += 1;
         var67 = var32 + 4;
         var32 += 4;
      } while (var67 < var10002.length);

      String[] var8 = new String[a(-1285463360, var25 ^ 155783936)];
      int var12 = 0;
      String var11;
      int var13 = (var11 = ba(var25 ^ 928572510, (short)31287, '䳯')).length();
      int var10 = a(-1285463359, var25 ^ -472587047);
      int var27 = -1;

      label113:
      while (true) {
         String var30 = var11.substring(++var27, var27 + var10);
         var32 = (byte)-1;

         while (true) {
            label108: {
               char[] var37 = var30.toCharArray();
               var67 = var37.length;
               int var14 = 0;
               var54 = var37;
               var32 = var67;
               char[] var71;
               int var86;
               if (var67 <= 1) {
                  var71 = var37;
                  var86 = var14;
               } else {
                  var54 = var37;
                  var32 = var67;
                  if (var67 <= var14) {
                     break label108;
                  }

                  var71 = var37;
                  var86 = var14;
               }

               while (true) {
                  var71[var86] = (char)(var71[var86] ^ switch (var14 % a(-1285463354, var25 ^ 2007193333)) {
                     case 0 -> a(-1285463353, var25 ^ 1500956608);
                     case 1 -> a(-1285463356, var25 ^ 1620318055);
                     case 2 -> a(-1285463355, var25 ^ 1846446228);
                     case 3 -> a(-1285463350, var25 ^ -1587913222);
                     case 4 -> a(-1285463349, var25 ^ 1723229150);
                     case 5 -> a(-1285463352, var25 ^ -363963076);
                     default -> a(-1285463351, var25 ^ 1060714137);
                  });
                  var14++;
                  if (var32 == 0) {
                     var86 = var32;
                     var71 = var54;
                  } else {
                     if (var32 <= var14) {
                        break;
                     }

                     var71 = var54;
                     var86 = var14;
                  }
               }
            }

            String var78 = new String(var54).intern();
            switch (var32) {
               case 0:
                  var8[var12++] = var78;
                  if ((var27 += var10) >= var13) {
                     long var0 = 1238328579319141029L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4;
                     int var5 = (var4 = ba(var25 ^ -856097070, (short)26824, '䳭')).length();
                     byte var2 = 0;

                     do {
                        int var44 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var44, var2).getBytes(ba(var25 ^ 1372294857, (short)'馕', '䳬'));
                        var44 = var3++;
                        long var87 = (
                              (var7[0] & 255L) << a(-1285463346, var25 ^ -757126276)
                                 | (var7[1] & 255L) << a(-1285463345, var25 ^ -1124288272)
                                 | (var7[2] & 255L) << a(-1285463348, var25 ^ -603276711)
                                 | (var7[3] & 255L) << a(-1285463347, var25 ^ 660690231)
                                 | (var7[4] & 255L) << a(-1285463342, var25 ^ -782783289)
                                 | (var7[5] & 255L) << a(-1285463341, var25 ^ 742301019)
                                 | (var7[a(-1285463344, var25 ^ 325416402)] & 255L) << a(-1285463343, var25 ^ 1933068355)
                                 | var7[a(-1285463338, var25 ^ -1919047212)] & 255L
                           )
                           ^ var0;
                        byte var79 = -1;
                        var6[var44] = var87;
                     } while (var2 < var5);

                     ba = var6;
                     aa = new Integer[3];
                     bb = new aaaaabab();
                     abb = new aaaaabab();
                     aaa = new aaaaabab();
                     ab = new aaaaabab();
                     b = new aaaaabab();
                     a = new aaaaabab();
                     aab = new aaaaabab();
                     aba = b();
                     return;
                  }

                  var10 = var11.charAt(var27);
                  break;
               default:
                  var8[var12++] = var78;
                  if ((var27 += var10) < var13) {
                     var10 = var11.charAt(var27);
                     continue label113;
                  }

                  var13 = (var11 = ba(var25 ^ 1167308555, (short)24839, '䳮')).length();
                  var10 = 4;
                  var27 = -1;
            }

            var30 = var11.substring(++var27, var27 + var10);
            var32 = (byte)0;
         }
      }
   }

   private static aaaaabab[] b() {
      aaaaabab[] var10000 = new aaaaabab[aa(
         a(-1285463358, 1458435462 ^ 199208717), 8912386868315105628L
      )];
      var10000[0] = bb;
      var10000[1] = abb;
      var10000[2] = aaa;
      var10000[3] = ab;
      var10000[4] = b;
      var10000[5] = a;
      var10000[aa(a(-1285463357, 1458435462 ^ 1208002595), 3662325412619012811L)] = aab;
      return var10000;
   }

   private static int a(int var0, int var1) {
      int var2 = baa[var0 ^ -1285463358] ^ var1 ^ var0;
      var2 ^= 29884;
      var2 += 32764;
      var2 ^= 43862;
      var2 += 2368;
      var2 -= 41628;
      var2 += 6266;
      var2 ^= 61817;
      return var2 ^ 20241;
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1285463339, 1396529447 ^ 1843605936);
      if (aa[var3] == null) {
         aa[var3] = (int)(ba[var3] ^ var1);
      }

      return aa[var3];
   }

   public static aaaaabab ab(String var0) {
      return Enum.valueOf(aaaaabab.class, var0);
   }

   private static String ba(int var0, short var1, char var2) {
      int var3 = var2 ^ 19695;
      char[] var4 = bab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         bba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 2433;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 4799;
         var10 ^= 20963;
         var10 -= 34350;
         var10 ^= 16528;
         var10 -= 30877;
         var10 ^= 15098;
         var10 ^= 33917;
         var10 ^= 24798;
         var10 += 23846;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }
}
