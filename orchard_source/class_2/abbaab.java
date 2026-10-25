package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;

@Environment(EnvType.CLIENT)
public final class abbaab {
   public static float aa(ababb param0, float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaab.ab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaa;
      // 06: astore 3
      // 07: istore 2
      // 08: aload 0
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababb;
      // 0c: if_acmpne 27
      // 0f: aload 3
      // 10: iload 2
      // 11: ifne 20
      // 14: goto 18
      // 17: athrow
      // 18: ifnull 27
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 3
      // 20: fload 1
      // 21: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaa.ababaa (F)F
      // 24: goto 28
      // 27: fconst_0
      // 28: freturn
   }

   private static abbaabaa ab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaaaa ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba;
      // 06: astore 1
      // 07: istore 0
      // 08: aload 1
      // 09: iload 0
      // 0a: ifne 15
      // 0d: ifnull 23
      // 10: goto 14
      // 13: athrow
      // 14: aload 1
      // 15: iload 0
      // 16: ifne 29
      // 19: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 1c: ifnonnull 28
      // 1f: goto 23
      // 22: athrow
      // 23: aconst_null
      // 24: goto 2f
      // 27: athrow
      // 28: aload 1
      // 29: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abaaaaaba.aaba ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba;
      // 2c: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/babbaba.b ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaa;
      // 2f: areturn
   }

   public static boolean b(ababb var0, class_1297 var1) {
      int var2 = baaabbaa.bba;
      if (var0 == ababb.a) {
         abbaabaa var3 = ab();

         abbaabaa var10000;
         label35: {
            try {
               var10000 = var3;
               if (var2 != 0) {
                  break label35;
               }

               if (var3 == null) {
                  return false;
               }
            } catch (MatchException var5) {
               throw var5;
            }

            var10000 = var3;
         }

         try {
            boolean var6 = var10000.aababa(var1);
            if (var2 != 0) {
               return var6;
            }

            if (var6) {
               return true;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         return false;
      } else {
         return false;
      }
   }

   private abbaab() {
   }

   public static ababb ba() {
      int var10000 = baaabbaa.bba;
      abbaabaa var1 = ab();
      int var0 = var10000;

      label27: {
         try {
            var4 = var1;
            if (var0 != 0) {
               break label27;
            }

            if (var1 == null) {
               return ababb.aa;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var4 = var1;
      }

      try {
         if (var4.babb()) {
            return ababb.a;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return ababb.aa;
   }

   public static float bb(ababb param0, float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: invokestatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaab.ab ()Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaa;
      // 06: astore 3
      // 07: istore 2
      // 08: aload 0
      // 09: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababb.a Lqeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/ababb;
      // 0c: if_acmpne 27
      // 0f: aload 3
      // 10: iload 2
      // 11: ifne 20
      // 14: goto 18
      // 17: athrow
      // 18: ifnull 27
      // 1b: goto 1f
      // 1e: athrow
      // 1f: aload 3
      // 20: fload 1
      // 21: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/abbaabaa.aaab (F)F
      // 24: goto 28
      // 27: fconst_0
      // 28: freturn
   }

   public static void aaa(ababb var0, float var1, float var2, float var3, float var4) {
      int var5 = baaabbaa.bba;
      if (var0 == ababb.a) {
         abbaabaa var6 = ab();

         abbaabaa var10000;
         label21: {
            try {
               var10000 = var6;
               if (var5 != 0) {
                  break label21;
               }

               if (var6 == null) {
                  return;
               }
            } catch (MatchException var7) {
               throw var7;
            }

            var10000 = var6;
         }

         var10000.babab(var1, var2, var3, var4);
      }
   }
}
