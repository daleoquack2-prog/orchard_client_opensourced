package nsc.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_6396;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oshi.SystemInfo;
import nsc.aabbaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_6396.class})
public abstract class abaabbabb {
   @Shadow
   public abstract void method_37122(String var1, String var2);

   @Inject(
      method = {"method_37128"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(SystemInfo var1, CallbackInfo var2) {
      String var3 = System.getProperty(aabbaaaba.abba("XQGUyzwlTCtb"), "").toLowerCase();
      if (var3.contains(aabbaaaba.abba("uOTkqA8="))) {
         this.method_37122(
            aabbaaaba.abba("4r72LpZGZQ+tMfqe6dkmkrz6"),
            aabbaaaba.abba("gt4162MWgV6xrcwPMV/sPX+nJNJDMqU3jZ7hIRF/lx5XhVCgJgk=")
         );
         this.method_37122(
            aabbaaaba.abba("x5uAHiPlN/mWbRjeQPyj6Q=="),
            aabbaaaba.abba("gt4162MWgV6xrcwPMV/sPX+nJNJDMqU3jZ7hIRF/lx5XhVCgJgk=")
         );
         this.method_37122(
            aabbaaaba.abba("PGCX88GKxvOYx1Q/"),
            aabbaaaba.abba("gt4162MWgV6xrcwPMV/sPX+nJNJDMqU3jZ7hIRF/lx5XhVCgJgk=")
         );
         this.method_37122(
            aabbaaaba.abba("zJDasKUqa3AzrEgsdiY+AP8lMg=="),
            aabbaaaba.abba("gt4162MWgV6xrcwPMV/sPX+nJNJDMqU3jZ7hIRF/lx5XhVCgJgk=")
         );
         this.method_37122(
            aabbaaaba.abba("DFD3ehskzxHLq1ss+kdjHV8="),
            aabbaaaba.abba("gt4162MWgV6xrcwPMV/sPX+nJNJDMqU3jZ7hIRF/lx5XhVCgJgk=")
         );
         this.method_37122(
            aabbaaaba.abba("i9f1HuaFERRykLYeKGNiaG8Mard7Z+XViS7nK1s="),
            aabbaaaba.abba("gt4162MWgV6xrcwPMV/sPX+nJNJDMqU3jZ7hIRF/lx5XhVCgJgk=")
         );
         this.method_37122(
            aabbaaaba.abba("Rhrpt3PksfkLapGb5qErkJiYpk5eJeQ++A=="),
            aabbaaaba.abba("gt4162MWgV6xrcwPMV/sPX+nJNJDMqU3jZ7hIRF/lx5XhVCgJgk=")
         );
         this.method_37122(
            aabbaaaba.abba("NmofZRsSe6+K5QnzhM6pE7InXZCVgKvO"),
            aabbaaaba.abba("gt4162MWgV6xrcwPMV/sPX+nJNJDMqU3jZ7hIRF/lx5XhVCgJgk=")
         );
         var2.cancel();
      }
   }
}
