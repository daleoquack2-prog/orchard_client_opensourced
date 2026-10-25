package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum abbababba {
   public static final abbababba aa;
   private static final abbababba[] ab;
   private static final Object[] aab;
   public static final abbababba b;
   private static final String[] aaa;
   private final ababbbbaa ba;
   private static final int[] bb;
   public static final abbababba a;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -1980276713;
      short var7 = 17599;
      String var8 = "揨捩捨氶沮沖插捀沋氠捥捗掔捱挵氰沬捷揺挜捱揥捲捭揅沣捖揾捊捚揻捧捆揪펥턄턮편팢폺팊팠팇펻패펼퍡폈폦펭폜폢펤팭폥퍵펃";
      char[] var9 = "\"\u0017".toCharArray();
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            aaa = var10;
            aab = new Object[var10.length];
            byte var22 = 0;
            int var10001 = 0;
            bb = new int[9];
            byte[] var10002 = "ÿ*ï@\u0084\u0011dµ\u0082Ït@ÇÄ\u008dLe¦Uå $\u0011w0\u0014!3\u008cÅ.\u0013\u0015\u001e\b#".getBytes("ISO-8859-1");

            int var57;
            do {
               bb[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 538644015;
               var22 += 1;
               var57 = var10001 + 4;
               var10001 += 4;
            } while (var57 < var10002.length);

            String[] var0 = new String[a(850987864, var18 ^ -1686082414)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = aa(var18 ^ 2031114021, '䋕', '꼃')).length();
            int var2 = 3;
            int var20 = -1;

            label103:
            while (true) {
               String var23 = var3.substring(++var20, var20 + var2);
               var10001 = (byte)-1;

               while (true) {
                  label98: {
                     char[] var29 = var23.toCharArray();
                     var57 = var29.length;
                     int var6 = 0;
                     var44 = var29;
                     var10001 = var57;
                     char[] var61;
                     int var75;
                     if (var57 <= 1) {
                        var61 = var29;
                        var75 = var6;
                     } else {
                        var44 = var29;
                        var10001 = var57;
                        if (var57 <= var6) {
                           break label98;
                        }

                        var61 = var29;
                        var75 = var6;
                     }

                     while (true) {
                        var61[var75] = (char)(var61[var75] ^ switch (var6 % a(850987866, var18 ^ -429525103)) {
                           case 0 -> a(850987867, var18 ^ -1553068766);
                           case 1 -> a(850987868, var18 ^ 17618276);
                           case 2 -> a(850987869, var18 ^ -997289481);
                           case 3 -> a(850987870, var18 ^ 1421779266);
                           case 4 -> a(850987871, var18 ^ -395334057);
                           case 5 -> 2;
                           default -> a(850987856, var18 ^ 1907656789);
                        });
                        var6++;
                        if (var10001 == 0) {
                           var75 = var10001;
                           var61 = var44;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var61 = var44;
                           var75 = var6;
                        }
                     }
                  }

                  String var68 = new String(var44).intern();
                  switch (var10001) {
                     case 0:
                        var0[var4++] = var68;
                        if ((var20 += var2) >= var5) {
                           b = new abbababba(aabbaaaba.aaab(var0[2]));
                           aa = new abbababba(aabbaaaba.aaab(var0[1]));
                           a = new abbababba(aabbaaaba.aaab(var0[5]));
                           ab = b();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var68;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label103;
                        }

                        var5 = (var3 = aa(var18 ^ 241115729, 'ꭏ', '꼂')).length();
                        var2 = a(850987865, var18 ^ -524556442);
                        var20 = -1;
                  }

                  var23 = var3.substring(++var20, var20 + var2);
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
                  default -> 157;
                  case 1 -> 11;
                  case 2 -> 37;
                  case 3 -> 154;
                  case 4 -> 4;
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

   private static String aa(int var0, char var1, char var2) {
      int var3 = var2 ^ '꼃';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 24362;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '荑';
         var10 += 16975;
         var10 += 17409;
         var10 -= 55873;
         var10 ^= 5893;
         var10 ^= 63508;
         var10 -= 49287;
         var10 ^= 4163;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.ba.abab();
   }

   private static abbababba[] b() {
      return new abbababba[]{b, aa, a};
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 850987864] ^ var1 ^ var0;
      var2 ^= 57162;
      var2 += 61968;
      var2 ^= 62153;
      var2 -= 62230;
      var2 ^= 60129;
      var2 += 34047;
      var2 += 4632;
      var2 -= 30081;
      return var2 + 56614;
   }

   private abbababba(ababbbbaa var3) {
      this.ba = var3;
   }
}
