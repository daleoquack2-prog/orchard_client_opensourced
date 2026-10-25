package nsc;

import java.awt.image.BufferedImage;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record baabaaaa(BufferedImage a, int scaledWidth, int scaledHeight, long d) {
   private final BufferedImage aa;
   private final int a;
   private final int b;
   private final long ab;

   public long aa() {
      return this.ab;
   }

   public baabaaaa(BufferedImage a, int scaledWidth, int scaledHeight, long d) {
      this.aa = a;
      this.a = scaledWidth;
      this.b = scaledHeight;
      this.ab = d;
   }

   public BufferedImage ab() {
      return this.aa;
   }
}
