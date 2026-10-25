package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum bbbbbaab {
   private final ababbbbaa aa;
   private static final int[] bb;
   private static final Object[] aab;
   private static final bbbbbaab[] a;
   public static final bbbbbaab b;
   private static final String[] aaa;
   public static final bbbbbaab ab;
   public static final bbbbbaab ba;

   private static String aa(char var0, int var1, int var2) {
      int var3 = var2 ^ 33140;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12429;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '뮈';
         var10 -= 11580;
         var10 += 41856;
         var10 -= 61206;
         var10 += 24339;
         var10 ^= 34334;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private bbbbbaab(ababbbbaa var3) {
      this.aa = var3;
   }

   private static bbbbbaab[] b() {
      return new bbbbbaab[]{ba, ab, b};
   }

   @Override
   public String toString() {
      return this.aa.abab();
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ -516302810] ^ var1 ^ var0;
      var2 += 45391;
      var2 += 13261;
      var2 -= 47090;
      var2 += 30056;
      var2 += 19489;
      var2 += 50127;
      var2 ^= 30562;
      var2 ^= 25412;
      return var2 ^ 62416;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 364586709;
      short var12 = 5452;
      int var10 = 0;
      int var8 = "\u001f蟦羚먦禮붦冡苦ꆡ믦⦯蕦\ue9a1芦禡빦覮뮆즡聆ᆡ蒆즠莆놯뫆禮茦醠뼆ꆮ렆\u000e㍼܊\u2d7c܌⩜霌㗜뼊㔼⼍⥜윋⺼⼋".length();
      int var11 = 0;
      String[] var9 = new String[2];
      String var7 = "\u001f蟦羚먦禮붦冡苦ꆡ믦⦯蕦\ue9a1芦禡빦覮뮆즡聆ᆡ蒆즠莆놯뫆禮茦醠뼆ꆮ렆\u000e㍼܊\u2d7c܌⩜霌㗜뼊㔼⼍⥜윋⺼⼋";

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      aaa = var9;
      aab = new Object[var9.length];
      byte var10000 = 0;
      bb = new int[11];
      int var22 = 0;
      byte[] var34 = "\u0095£Ã\u0097\u0017eö_ÀHpr´UVþ4\u0016\u0016\u0081÷,µS¾!ñÓX¢¢ \u008aG«2T¡9½±BHß".getBytes("ISO-8859-1");

      int var56;
      do {
         bb[var10000] = ((var34[var22] & 255) << 24 | (var34[var22 + 1] & 255) << 16 | (var34[var22 + 2] & 255) << 8 | var34[var22 + 3] & 255) ^ -590862298;
         var10000 += 1;
         var56 = var22 + 4;
         var22 += 4;
      } while (var56 < var34.length);

      String[] var0 = new String[a(-516302810, var17 ^ 1108746284)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = aa('䅄', var17 ^ 1371224648, 33140)).length();
      int var2 = a(-516302809, var17 ^ -1060104717);
      int var19 = -1;

      label93:
      while (true) {
         String var20 = var3.substring(++var19, var19 + var2);
         var22 = (byte)-1;

         while (true) {
            label88: {
               char[] var27 = var20.toCharArray();
               var56 = var27.length;
               int var6 = 0;
               var43 = var27;
               var22 = var56;
               char[] var60;
               int var74;
               if (var56 <= 1) {
                  var60 = var27;
                  var74 = var6;
               } else {
                  var43 = var27;
                  var22 = var56;
                  if (var56 <= var6) {
                     break label88;
                  }

                  var60 = var27;
                  var74 = var6;
               }

               while (true) {
                  var60[var74] = (char)(var60[var74] ^ switch (var6 % a(-516302811, var17 ^ 1675670855)) {
                     case 0 -> a(-516302814, var17 ^ -475794073);
                     case 1 -> a(-516302813, var17 ^ 546920159);
                     case 2 -> a(-516302816, var17 ^ 1771311719);
                     case 3 -> a(-516302815, var17 ^ -1894301395);
                     case 4 -> a(-516302802, var17 ^ 1576159366);
                     case 5 -> a(-516302801, var17 ^ -2095785352);
                     default -> a(-516302804, var17 ^ 1727507215);
                  });
                  var6++;
                  if (var22 == 0) {
                     var74 = var22;
                     var60 = var43;
                  } else {
                     if (var22 <= var6) {
                        break;
                     }

                     var60 = var43;
                     var74 = var6;
                  }
               }
            }

            String var67 = new String(var43).intern();
            switch (var22) {
               case 0:
                  var0[var4++] = var67;
                  if ((var19 += var2) >= var5) {
                     ba = new bbbbbaab(aabbaaaba.aaab(var0[0]));
                     ab = new bbbbbaab(aabbaaaba.aaab(var0[4]));
                     b = new bbbbbaab(aabbaaaba.aaab(var0[1]));
                     a = b();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var67;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label93;
                  }

                  var5 = (var3 = aa('淉', var17 ^ -913893539, 33141)).length();
                  var2 = a(-516302812, var17 ^ 402494425);
                  var19 = -1;
            }

            var20 = var3.substring(++var19, var19 + var2);
            var22 = (byte)0;
         }
      }
   }
}
