package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum aaaaabbb {
   private static final aaaaabbb[] aa;
   private final ababbbbaa b;
   public static final aaaaabbb a;
   private static final int[] bb;
   private static final Object[] aab;
   public static final aaaaabbb ab;
   private static final String[] aaa;
   public static final aaaaabbb ba;

   private static aaaaabbb[] b() {
      return new aaaaabbb[]{a, ab, ba};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -440153082;
      int var17 = 0;
      int var10001 = "%\ue0cb㸙\ue0ef縟\ue06b︑\ue1ff븍\ue1f7縂\ue13f︄\ue1df㸉\ue137㸕\ue03b븜\ue133\ufe1c\ue1cf縞\ue0af\ufe1a\ue0b3\ufe1a\ue03f㸓\ue1c3㸎\ue1df︌\ue197㸋\ue1bf︃\ue10b\u001d澇㛻湃\uf6fe湛뛢潿뛮漗㛩漛盠潯㛿濟㛨漫㛯濣뛣潻뛦漫뛷滣\uf6fe滿뛼漓"
         .length();
      short var18 = 22062;
      int var16 = 0;
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "%\ue0cb㸙\ue0ef縟\ue06b︑\ue1ff븍\ue1f7縂\ue13f︄\ue1df㸉\ue137㸕\ue03b븜\ue133\ufe1c\ue1cf縞\ue0af\ufe1a\ue0b3\ufe1a\ue03f㸓\ue1c3㸎\ue1df︌\ue197㸋\ue1bf︃\ue10b\u001d澇㛻湃\uf6fe湛뛢潿뛮漗㛩漛盠潯㛿濟㛨漫㛯濣뛣潻뛦漫뛷滣\uf6fe滿뛼漓";

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      aaa = var15;
      aab = new Object[var15.length];
      int var9 = 1170249993;
      byte[] var7 = "\u0096\u0084ã\u0094ú¦ Ôy,\u0005RDÄ,¦9ÏX$µ\u0089\u001e¯KÆ¿JU\u00adÈÏ@\u0099«!\u000fj\u0087\u008fðx³\u001d".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      bb = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         bb[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[a(2064339783, var23 ^ 1301104617)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ab('ᬬ', var23 ^ -1453667748, 36347)).length();
      int var2 = a(2064339782, var23 ^ 565118122);
      int var25 = -1;

      label89:
      while (true) {
         String var10000 = var3.substring(++var25, var25 + var2);
         int var28 = -1;

         while (true) {
            char[] var39;
            label84: {
               char[] var30 = var10000.toCharArray();
               int var10003 = var30.length;
               int var6 = 0;
               var39 = var30;
               var28 = var10003;
               char[] var47;
               int var10004;
               if (var10003 <= 1) {
                  var47 = var30;
                  var10004 = var6;
               } else {
                  var39 = var30;
                  var28 = var10003;
                  if (var10003 <= var6) {
                     break label84;
                  }

                  var47 = var30;
                  var10004 = var6;
               }

               while (true) {
                  var47[var10004] = (char)(var47[var10004] ^ switch (var6 % a(2064339780, var23 ^ -1613920039)) {
                     case 0 -> a(2064339779, var23 ^ -490275749);
                     case 1 -> a(2064339778, var23 ^ 1853930274);
                     case 2 -> a(2064339777, var23 ^ -1865475272);
                     case 3 -> a(2064339776, var23 ^ -1901826728);
                     case 4 -> a(2064339791, var23 ^ -1685057779);
                     case 5 -> a(2064339790, var23 ^ -731700638);
                     default -> a(2064339789, var23 ^ 728831781);
                  });
                  var6++;
                  if (var28 == 0) {
                     var10004 = var28;
                     var47 = var39;
                  } else {
                     if (var28 <= var6) {
                        break;
                     }

                     var47 = var39;
                     var10004 = var6;
                  }
               }
            }

            String var54 = new String(var39).intern();
            switch (var28) {
               case 0:
                  var0[var4++] = var54;
                  if ((var25 += var2) >= var5) {
                     a = new aaaaabbb(aabbaaaba.aaab(var0[5]));
                     ab = new aaaaabbb(aabbaaaba.aaab(var0[1]));
                     ba = new aaaaabbb(aabbaaaba.aaab(var0[4]));
                     aa = b();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var54;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label89;
                  }

                  var5 = (var3 = ab('\uf826', var23 ^ 1776802733, 36346)).length();
                  var2 = a(2064339781, var23 ^ -1574584697);
                  var25 = -1;
            }

            var10000 = var3.substring(++var25, var25 + var2);
            var28 = 0;
         }
      }
   }

   public boolean aa(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aabbabbab.ab I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 18
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbb.ab Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbb;
      // 0c: if_acmpeq 2e
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbb.ba Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaaabbb;
      // 1b: if_acmpne 32
      // 1e: iload 1
      // 1f: iload 2
      // 20: ifne 2f
      // 23: goto 27
      // 26: athrow
      // 27: ifeq 32
      // 2a: goto 2e
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 33
      // 32: bipush 0
      // 33: ireturn
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 2064339783] ^ var1 ^ var0;
      var2 ^= 4708;
      var2 -= 20203;
      var2 -= 39924;
      var2 ^= 29707;
      var2 ^= 10439;
      var2 += 13832;
      var2 += 9413;
      var2 ^= 37908;
      var2 ^= 26626;
      return var2 ^ 2203;
   }

   private static String ab(char var0, int var1, int var2) {
      int var3 = var2 ^ 36347;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 32184;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '켪';
         var10 ^= 16474;
         var10 ^= 14180;
         var10 ^= 36864;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.b.abab();
   }

   private aaaaabbb(ababbbbaa var3) {
      this.b = var3;
   }
}
