package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record aaabbaa(
   long a,
   ababaaaaa b,
   ababbbbaa u,
   ababbbbaa v,
   long c,
   long d
) {
   private final ababbbbaa aa;
   private final ababaaaaa ab;
   private final ababbbbaa b;
   private final long ba;
   private final long bb;

   public String aa() {
      return this.b.abab();
   }

   public ababbbbaa b() {
      return this.aa;
   }

   public ababbbbaa ab() {
      return this.aa;
   }

   public ababbbbaa ba() {
      return this.b;
   }

   public long bb() {
      return this.ba;
   }

   public aaabbaa(
      long a,
      ababaaaaa b,
      ababbbbaa u,
      ababbbbaa v,
      long c,
      long d
   ) {
      this.bb = a;
      this.ab = b;
      this.aa = u;
      this.b = v;
      this.ba = c;
      this.a = d;
   }

   public long aaa() {
      return this.a;
   }

   public String aab() {
      return this.aa.abab();
   }

   public long a() {
      return this.bb;
   }

   public long aba() {
      return this.ba + this.a;
   }

   public ababaaaaa abb() {
      return this.ab;
   }

   public ababbbbaa baa() {
      return this.b;
   }
}
