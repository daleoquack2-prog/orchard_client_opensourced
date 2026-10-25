package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum aaabaaaba {
   public static final aaabaaaba aa;
   public static final aaabaaaba ab;
   public static final aaabaaaba ba;
   public static final aaabaaaba bb;
   public static final aaabaaaba aaa;
   private static final String[] bbb;
   private static final long[] aab;
   private static final Object[] aaaa;
   public static final aaabaaaba b;
   public static final aaabaaaba aba;
   public static final aaabaaaba abb;
   public static final aaabaaaba baa;
   private static final aaabaaaba[] bab;
   private static final int[] bba;
   private static final Integer[] a;

   private static String ba(char var0, int var1, char var2) {
      int var3 = var2 ^ 23575;
      char[] var4 = bbb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         aaaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10999;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '\ue96a';
         var10 ^= 34517;
         var10 -= 6264;
         var10 += 17224;
         var10 -= 26950;
         var10 += 52253;
         var10 += 29930;
         var10 ^= 8712;
         var10 += 48359;
         var10 -= 57821;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static aaabaaaba b(String var0) {
      return Enum.valueOf(aaabaaaba.class, var0);
   }

   private static int a(int var0, int var1) {
      int var2 = bba[var0 ^ -422488136] ^ var1 ^ var0;
      var2 += 49937;
      var2 -= 47869;
      var2 += 15765;
      var2 ^= 24801;
      var2 += 62017;
      var2 ^= 11457;
      return var2 ^ 59659;
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-422488136, 40649426 ^ -1055985159);
      if (a[var3] == null) {
         a[var3] = (int)(aab[var3] ^ var1);
      }

      return a[var3];
   }

   private static aaabaaaba[] ab() {
      aaabaaaba[] var10000 = new aaabaaaba[aa(
         a(-422488162, 1529177894 ^ -2145629133), 7518894407421557199L
      )];
      var10000[0] = abb;
      var10000[1] = ab;
      var10000[2] = aba;
      var10000[3] = baa;
      var10000[4] = aa;
      var10000[5] = ba;
      var10000[aa(a(-422488161, 1529177894 ^ -1710493359), 5490191141865109544L)] = aaa;
      var10000[aa(a(-422488176, 1529177894 ^ 1043576908), 3524169722229679921L)] = bb;
      var10000[aa(a(-422488175, 1529177894 ^ -1527452238), 7233556147058005320L)] = b;
      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var26 = 992907565;
      byte var22 = -1;
      char[] var17 = "\u0602ٿٷُٕٕ".toCharArray();
      String var16 = "\ue260\ue251\ue2d6\ue07a\ue236\ue262\ue25b\ue287\ue2dd\ue2ec\ue0bf\ue29c\ue260\ue251\ue2d6\ue07a\ue236\ue262\ue25b\ue287\ue233\ue2b8\ue0af\ue288\ue0f6\ue28f\ue2dd\ue247\ue0d0\ue2b5\ue2b9\ue2b4\ue20b\ue2ad\ue2e9\ue05a\ue261\ue24d\ue20b\ue29c\ue204\ue289\ue269\ue2a5\ue098\ue2aa\ue2e6\ue28e\ue247\ue24b\ue2da\ue292\ue2e6\ue26e\ue088\ue281\ue2da\ue2a9\ue230\ue28f\ue2b1\ue015\ue2c7\ue2af\ue20b\ue27e\ue2be\ue2a5\ue084\ue2ad\ue202\ue262\ue2b2\ue008\ue2da\ue292\ue2e6\ue26e\ue088\ue281\ue2da\ue2a9\ue230\ue28f\ue2b1\ue015\ue2c7\ue004\ue233\ue281\ue269\ue248\ue097\uef3c\uefd5\uee82\uee66\uee92\uefe6\ueecf\uefdb\ueeab\uefd7\ueea6\uefe3\uee83\uefc9\uef45\uefce\uef7d\uee42\uef3c\uefd5\uee82\uee66\uee92\uefe6\ueecf\uefdb\ueeaf\uee2d\ueecf\uefee\uef32\uee25Ჩᱏṳ᷉ứᱵᴳ᷈Უᶆ᳂ᷡᴋᱭ᳤ṃṌᷤᴹỳᲕờḡ\u1c3a᳟ᱹồᱝṜᶡẾẦᴅᰶỬ᳨᷼ᰚḻᰛ⛲♣⚓⣜⠡⢢⠆⢍⡍⣘쮾쯾춾쮴쯣쯵췿쯇췎쯙쯢쮗쭒컘춡총ઑ\u0a0c\u0ae4ஏ\u0b52\u0bd1ૅ௮ଞਫ";
      short var15 = 1631;
      String[] var18 = new String[var17.length];

      while (true) {
         int var19 = 0;
         int var20 = 0;
         int var21 = 0;
         if (var22 == 0) {
            bbb = var18;
            aaaa = new Object[var18.length];
            byte var31 = 0;
            int var10001 = 0;
            bba = new int[42];
            byte[] var10002 = "²[\røô\bhà\u0005\u0097©(ÝÚ\u0017f*\u0089å\u0011`\u000bæÇLl£\u0084::F¦\b\u0091|ðª\u00051±-_6\u008a9:Ö/¾'-»#y\u0081\u0085#%¤ê95ÈÑ×jJý\t\u0006â;×ZM\u008f\u00987Ù«\u001e\u0099\u0004Q\u0080\u008f\u0004L)\u0003Í\u008aÝÒ»\u0090\u008bÚ\u0080\u000bó\u0000y\n\u0086\u009aP\u008föZß\u009e$\u0006\u0012Ü\u0010còÊ/Ø.?\u0015\u00074©qÉQ\u0095jèj:©Ê\u0098¦T`²>Ð\u0011\t=þhgðª\u0000\u009b¾Oè`ÿ\u0014/\u0086Þ\u008eèà¶"
               .getBytes("ISO-8859-1");

            int var78;
            do {
               bba[var31] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1746371771;
               var31 += 1;
               var78 = var10001 + 4;
               var10001 += 4;
            } while (var78 < var10002.length);

            String[] var8 = new String[a(-422488135, var26 ^ -1105246347)];
            int var12 = 0;
            String var11;
            int var13 = (var11 = ba('\u1af3', var26 ^ 619221589, '尗')).length();
            int var10 = a(-422488134, var26 ^ 1333823164);
            int var29 = -1;

            label121:
            while (true) {
               String var32 = var11.substring(++var29, var29 + var10);
               var10001 = (byte)-1;

               while (true) {
                  label116: {
                     char[] var41 = var32.toCharArray();
                     var78 = var41.length;
                     int var14 = 0;
                     var61 = var41;
                     var10001 = var78;
                     char[] var82;
                     int var100;
                     if (var78 <= 1) {
                        var82 = var41;
                        var100 = var14;
                     } else {
                        var61 = var41;
                        var10001 = var78;
                        if (var78 <= var14) {
                           break label116;
                        }

                        var82 = var41;
                        var100 = var14;
                     }

                     while (true) {
                        var82[var100] = (char)(var82[var100] ^ switch (var14 % a(-422488132, var26 ^ 1621019391)) {
                           case 0 -> a(-422488131, var26 ^ 706529553);
                           case 1 -> a(-422488130, var26 ^ 108761021);
                           case 2 -> a(-422488129, var26 ^ 1882024211);
                           case 3 -> a(-422488144, var26 ^ 1116099340);
                           case 4 -> a(-422488143, var26 ^ -535683473);
                           case 5 -> a(-422488142, var26 ^ 1732778661);
                           default -> a(-422488141, var26 ^ 1932392950);
                        });
                        var14++;
                        if (var10001 == 0) {
                           var100 = var10001;
                           var82 = var61;
                        } else {
                           if (var10001 <= var14) {
                              break;
                           }

                           var82 = var61;
                           var100 = var14;
                        }
                     }
                  }

                  String var89 = new String(var61).intern();
                  switch (var10001) {
                     case 0:
                        var8[var12++] = var89;
                        if ((var29 += var10) >= var13) {
                           long var0 = 8099621867712589993L;
                           long[] var6 = new long[a(-422488140, var26 ^ -198180259)];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = ba('쏮', var26 ^ -906960012, '尕')).length();
                           byte var2 = 0;

                           label95:
                           while (true) {
                              int var48 = var2;
                              var2 += 8;
                              String var34 = var4.substring(var48, var2);
                              char var49 = 'ꪁ';
                              int var67 = var26 ^ 1257295082;
                              short var90 = 23572;
                              byte[] var7 = var34.getBytes("ISO-8859-1");
                              long[] var35 = var6;
                              var48 = var3++;
                              long var68 = (var7[0] & 255L) << a(-422488139, var26 ^ 1768861185)
                                 | (var7[1] & 255L) << a(-422488138, var26 ^ 1764920165)
                                 | (var7[2] & 255L) << a(-422488137, var26 ^ 1931667303)
                                 | (var7[3] & 255L) << a(-422488152, var26 ^ -1652726436)
                                 | (var7[4] & 255L) << a(-422488151, var26 ^ 1125240259)
                                 | (var7[5] & 255L) << a(-422488150, var26 ^ -1655872900)
                                 | (var7[a(-422488149, var26 ^ -769591721)] & 255L) << a(-422488148, var26 ^ 1418603484)
                                 | var7[a(-422488147, var26 ^ -895997005)] & 255L;
                              short var91 = -1;

                              while (true) {
                                 long var102 = var68 ^ var0;
                                 switch (var91) {
                                    case 0:
                                       var35[var48] = var102;
                                       if (var2 >= var5) {
                                          aab = var6;
                                          a = new Integer[a(-422488153, var26 ^ 1594891100)];
                                          abb = new aaabaaaba();
                                          ab = new aaabaaaba();
                                          aba = new aaabaaaba();
                                          baa = new aaabaaaba();
                                          aa = new aaabaaaba();
                                          ba = new aaabaaaba();
                                          aaa = new aaabaaaba();
                                          bb = new aaabaaaba();
                                          b = new aaabaaaba();
                                          bab = ab();
                                          return;
                                       }
                                       break;
                                    default:
                                       var35[var48] = var102;
                                       if (var2 < var5) {
                                          continue label95;
                                       }

                                       var5 = (var4 = ba('\ud893', var26 ^ 1606400044, '尓')).length();
                                       var2 = 0;
                                 }

                                 byte var51 = var2;
                                 var2 += 8;
                                 String var36 = var4.substring(var51, var2);
                                 short var52 = 10866;
                                 int var70 = var26 ^ 1860877590;
                                 var91 = 23570;
                                 var7 = var36.getBytes("ISO-8859-1");
                                 var35 = var6;
                                 var48 = var3++;
                                 var68 = (var7[0] & 255L) << a(-422488146, var26 ^ 1662312981)
                                    | (var7[1] & 255L) << a(-422488145, var26 ^ -1748659194)
                                    | (var7[2] & 255L) << a(-422488160, var26 ^ -1043484758)
                                    | (var7[3] & 255L) << a(-422488159, var26 ^ -1189652830)
                                    | (var7[4] & 255L) << a(-422488158, var26 ^ -863142020)
                                    | (var7[5] & 255L) << a(-422488157, var26 ^ -1135742876)
                                    | (var7[a(-422488156, var26 ^ 1846623535)] & 255L) << a(-422488155, var26 ^ 1517608270)
                                    | var7[a(-422488154, var26 ^ 1708065227)] & 255L;
                                 var91 = 0;
                              }
                           }
                        }

                        var10 = var11.charAt(var29);
                        break;
                     default:
                        var8[var12++] = var89;
                        if ((var29 += var10) < var13) {
                           var10 = var11.charAt(var29);
                           continue label121;
                        }

                        var13 = (var11 = ba('펩', var26 ^ -1152471885, '尖')).length();
                        var10 = a(-422488133, var26 ^ -1748158311);
                        var29 = -1;
                  }

                  var32 = var11.substring(++var29, var29 + var10);
                  var10001 = (byte)0;
               }
            }
         }

         do {
            var21 = var17[var19] ^ var15;
            char[] var23 = var16.substring(var20, var20 + var21).toCharArray();
            int var24 = 0;

            do {
               short var25 = switch (var24 % 6) {
                  default -> 54;
                  case 1 -> 217;
                  case 2 -> 85;
                  case 3 -> 196;
                  case 4 -> 110;
                  case 5 -> 237;
               };
               var23[var24] = (char)(var23[var24] ^ var25);
            } while (++var24 < var23.length);

            var18[var19] = new String(var23).intern();
            var20 += var21;
         } while (++var19 < var17.length);

         var22 = 0;
      }
   }
}
