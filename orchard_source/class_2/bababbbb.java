package nsc;

public record bababbbb(String a, double b) {
   private final String aa;
   private final double a;

   public double aa() {
      return this.a;
   }

   public String b() {
      return this.aa;
   }

   public bababbbb(String a, double b) {
      this.aa = a;
      this.a = b;
   }
}
