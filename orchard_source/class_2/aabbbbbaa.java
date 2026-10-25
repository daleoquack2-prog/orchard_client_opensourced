package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aabbbbbaa {
   public static final aabbbbbaa aa;
   private static final String[] bb;
   private static final int[] ba;
   private static final Object[] aaa;
   private static final aabbbbbaa[] ab;
   private final ababbbbaa b;
   public static final aabbbbbaa a;

   private aabbbbbaa(ababbbbaa var3) {
      this.b = var3;
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 771522640] ^ var1 ^ var0;
      var2 += 921;
      var2 ^= 27160;
      var2 += 36900;
      var2 -= 549;
      var2 += 28194;
      return var2 ^ 20051;
   }

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ 1556941734;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -53868016;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 163;
            case 1 -> 153;
            case 2 -> 140;
            case 3 -> 129;
            case 4 -> 99;
            case 5 -> 200;
            case 6 -> 95;
            case 7 -> 174;
            case 8 -> 67;
            case 9 -> 216;
            case 10 -> 25;
            case 11 -> 216;
            case 12 -> 101;
            case 13 -> 205;
            case 14 -> 45;
            case 15 -> 115;
            case 16 -> 85;
            case 17 -> 231;
            case 18 -> 116;
            case 19 -> 182;
            case 20 -> 255;
            case 21 -> 8;
            case 22 -> 78;
            case 23 -> 204;
            case 24 -> 163;
            case 25 -> 38;
            case 26 -> 146;
            case 27 -> 70;
            case 28 -> 109;
            case 29 -> 239;
            case 30 -> 47;
            case 31 -> 180;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1607542453;
      byte var20 = -1;
      String var14 = "篃筎笸箥箍笐筢筛篰箰箴答策笒箧筑箉笨筻筣筥筄箂筹算篯筕笉箤筢誛訄詛諜諵詺詶訮誾諘読訋詙詡誤詼誔詸詹詓訔試論詝誾誂訚";
      short var13 = 13492;
      char[] var15 = "\u001e\u001b".toCharArray();
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            bb = var16;
            aaa = new Object[var16.length];
            int var9 = 2044826834;
            byte[] var7 = "-U\u0086Û\u0002\u001a½q?¦\u0087\u009dÍ½\u001bÛt\u009f\u00998\u0094ª\u0016\u0010P6/6y¾ù2Sï\b4¸=\u001b\u0014".getBytes("ISO-8859-1");
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
            int var5 = (var3 = ba(1556941734, var24 ^ 1228465806)).length();
            int var2 = a(771522640, var24 ^ 647593911);
            int var26 = -1;

            label101:
            while (true) {
               String var29 = var3.substring(++var26, var26 + var2);
               int var10001 = -1;

               while (true) {
                  char[] var41;
                  label96: {
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
                           break label96;
                        }

                        var49 = var32;
                        var10004 = var6;
                     }

                     while (true) {
                        var49[var10004] = (char)(var49[var10004] ^ switch (var6 % a(771522642, var24 ^ 879394500)) {
                           case 0 -> a(771522643, var24 ^ -965611954);
                           case 1 -> a(771522644, var24 ^ 2136173733);
                           case 2 -> a(771522645, var24 ^ -1620643926);
                           case 3 -> a(771522646, var24 ^ 1543165498);
                           case 4 -> a(771522647, var24 ^ 1920073871);
                           case 5 -> a(771522648, var24 ^ 1478750551);
                           default -> a(771522649, var24 ^ -1275990347);
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
                           aa = new aabbbbbaa(aabbaaaba.aaab(var0[0]));
                           a = new aabbbbbaa(aabbaaaba.aaab(var0[3]));
                           ab = ab();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var56;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label101;
                        }

                        var5 = (var3 = ba(1556941735, var24 ^ -1202532246)).length();
                        var2 = a(771522641, var24 ^ 165037118);
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
                  default -> 158;
                  case 1 -> 53;
                  case 2 -> 89;
                  case 3 -> 153;
                  case 4 -> 4;
                  case 5 -> 68;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   public ababbbbaa aa() {
      return this.b;
   }

   private static aabbbbbaa[] ab() {
      return new aabbbbbaa[]{aa, a};
   }

   public static aabbbbbaa b(String var0) {
      return Enum.valueOf(aabbbbbaa.class, var0);
   }
}
