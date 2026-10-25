package nsc;

import java.util.List;

public record aaaabbaba(List<bbabaaab> a, double width, double height) {
   private final double aa;
   private final List ab;
   private final double a;

   private static aaaabbaba aa() {
      return new aaaabbaba(List.of(), 0.0, 0.0);
   }

   public List a() {
      return this.ab;
   }

   public double b() {
      return this.a;
   }

   public aaaabbaba(List a, double width, double height) {
      this.ab = a;
      this.a = width;
      this.aa = height;
   }

   public double ab() {
      return this.aa;
   }
}
