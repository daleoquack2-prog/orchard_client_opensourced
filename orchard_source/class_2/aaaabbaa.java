package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record aaaabbaa(boolean a, boolean b) {
   private final boolean aa;
   private static final aaaabbaa b = new aaaabbaa(false, false);
   private final boolean ab;

   private aaaabbaa aa(boolean var1, boolean var2) {
      aaaabbaa var10000;
      aaaabbaa var10001;
      boolean var10002;
      label29: {
         label28: {
            try {
               var10000 = new aaaabbaa;
               var10001 = var10000;
               if (this.ab || var1) {
                  break label28;
               }
            } catch (MatchException var3) {
               throw var3;
            }

            var10002 = false;
            break label29;
         }

         var10002 = true;
      }

      var10001./* $VF: Unable to resugar constructor */<init>(var10002, this.aa || var2);
      return var10000;
   }

   public boolean ab() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 18
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.ab Z
      // 0c: ifne 2a
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/aaaabbaa.aa Z
      // 1b: iload 1
      // 1c: ifne 27
      // 1f: ifne 2a
      // 22: goto 26
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2b
      // 2a: bipush 0
      // 2b: ireturn
   }

   public aaaabbaa(boolean a, boolean b) {
      this.ab = a;
      this.aa = b;
   }

   public boolean a() {
      return this.ab;
   }

   public boolean b() {
      return this.aa;
   }
}
