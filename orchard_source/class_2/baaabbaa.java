package nsc;

import com.google.gson.JsonElement;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public abstract class baaabbaa {
   private final Object baa;
   private static final BooleanSupplier bab = baaabbaa::aaaaa;
   private boolean a;
   public static int bba;
   private final ababbbbaa bbb;
   private BooleanSupplier b = bab;
   private Object aaaa;

   public long baab() {
      return this.bbb.bbb();
   }

   public void abba() {
      this.aab(this.baa);
   }

   public baaabbaa baba() {
      this.a = false;
      return this;
   }

   public baaabbaa babb(BooleanSupplier var1) {
      int var2 = bba;

      baaabbaa var10000;
      BooleanSupplier var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = var1;
               if (var2 != 0) {
                  break label22;
               }

               if (var1 == null) {
                  break label21;
               }
            } catch (MatchException var3) {
               throw var3;
            }

            var10001 = var1;
            break label22;
         }

         var10001 = bab;
      }

      var10000.b = var10001;
      return this;
   }

   protected baaabbaa(Object var1, Object var2) {
      this.a = true;
      this.bbb = aabbaaaba.aaaa(var1);
      this.baa = var2;
      this.aaaa = var2;
   }

   protected baaabbaa(String var1, Object var2) {
      this((Object)var1, var2);
   }

   protected final void bbaa() {
      int var10000 = bba;
      abaaaaaba var2 = abaaaaaba.aaaaa();
      int var1 = var10000;

      label20: {
         try {
            var4 = var2;
            if (var1 != 0) {
               break label20;
            }

            if (var2 == null) {
               return;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var4 = var2;
      }

      var4.aaaa();
   }

   public ababbbbaa bbab() {
      return this.bbb;
   }

   public abstract JsonElement aba();

   public String bbba() {
      return this.bbb.abab();
   }

   public boolean bbbb() {
      return this.a;
   }

   public Object abbb() {
      return this.aaaa;
   }

   public abstract void ab(JsonElement var1);

   public Object abab() {
      return this.baa;
   }

   private static boolean aaaaa() {
      return true;
   }

   public void aab(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bba I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.aaaa Ljava/lang/Object;
      // 08: aload 1
      // 09: invokestatic java/util/Objects.equals (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0c: iload 2
      // 0d: ifne 18
      // 10: ifne 1b
      // 13: goto 17
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1c
      // 1b: bipush 0
      // 1c: istore 3
      // 1d: aload 0
      // 1e: iload 2
      // 1f: ifne 33
      // 22: aload 1
      // 23: putfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.aaaa Ljava/lang/Object;
      // 26: iload 3
      // 27: ifeq 36
      // 2a: goto 2e
      // 2d: athrow
      // 2e: aload 0
      // 2f: goto 33
      // 32: athrow
      // 33: invokevirtual qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.bbaa ()V
      // 36: return
   }

   public boolean aaaab() {
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
      // 09: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.b Ljava/util/function/BooleanSupplier;
      // 0c: ifnull 2b
      // 0f: goto 13
      // 12: athrow
      // 13: aload 0
      // 14: goto 18
      // 17: athrow
      // 18: getfield qeaa361f143ee4a0894bd168fd9b30c66/qf4ccf8f5435d4a78bdca4d6a018b578e/baaabbaa.b Ljava/util/function/BooleanSupplier;
      // 1b: invokeinterface java/util/function/BooleanSupplier.getAsBoolean ()Z 1
      // 20: iload 1
      // 21: ifne 2c
      // 24: ifeq 2f
      // 27: goto 2b
      // 2a: athrow
      // 2b: bipush 1
      // 2c: goto 30
      // 2f: bipush 0
      // 30: ireturn
   }
}
