public class RationalNumber {
   private int numerator, denominator;
   
   public RationalNumber() {
      this.setNumber(0);
   }
   
   public RationalNumber(int numerator) {
      this.setNumber(numerator);
   }
   
   public RationalNumber(int numerator, int denominator) {
      this.setNumber(numerator, denominator);
   }
   
   
   public int getDenominator() {
      return this.denominator;
   }
   
   public int getNumerator() {
      return this.numerator;
   }
   
   public void setNumber(int n) {
      setNumber(n, 1);
   }
   
   public void setNumber(int n, int d) {
      if (d == 0)
         throw new IllegalArgumentException("Zero is not a valid denominator");
      
      if (d > 0) {
         this.numerator = n;
         this.denominator = d;
      } 
      else {
         this.numerator = -n;
         this.denominator = -d;
      }
      this.simplify();
   }
   
   public RationalNumber add(RationalNumber other) {
      if (this.denominator == other.getDenominator())
         return new RationalNumber(this.numerator+other.getNumerator(), this.denominator);
      //denominators are not equal
      int newNumerator = this.numerator * other.getDenominator() + this.denominator * other.getNumerator();
      int newDenominator = this.denominator * other.getDenominator();
      return new RationalNumber(newNumerator, newDenominator);
   }
   
   public RationalNumber subtract(RationalNumber other) {
      if (this.denominator == other.getDenominator())
         return new RationalNumber(this.numerator-other.getNumerator(), this.denominator);
      //denominators are not equal
      int newNumerator = this.numerator * other.getDenominator() - this.denominator * other.getNumerator();
      int newDenominator = this.denominator * other.getDenominator();
      return new RationalNumber(newNumerator, newDenominator);
   }
   
   private int [] getFactors(int num) {
      int count = 1;
      for (int i = 2; i <= (int)Math.sqrt(Math.abs(num)); i++)
         if (Math.abs(num) % i == 0)
            count++;
      int [] factors = new int [count];
      int j = 0;
      for (int i = 2; i <= (int)Math.sqrt(Math.abs(num)); i++)
         if (Math.abs(num) % i == 0)
            factors[j++] = i;
      factors[count-1] = Math.abs(num);
      if (factors.length == 1) {
         if (num == 0)
            factors[0] = 1;//0
         else
            factors[0] = num; //prime numbers and 1
      }
      return factors;
   }
            
   
   private void simplify() {
      int test;
      do {
         test = this.numerator;
         if (this.numerator/this.denominator == 0) {
            int [] factors = this.getFactors(this.numerator);
            for (int i : factors)
               if (this.denominator % i == 0) {
                  this.numerator = this.numerator/i;
                  this.denominator = this.denominator/i;
                  break;
               }
         } 
         else {
            int [] factors = this.getFactors(this.denominator);
            for (int i : factors)
               if (this.numerator % i == 0) {
                  this.numerator = this.numerator/i;
                  this.denominator = this.denominator/i;
                  break;
               }
         }
      } while (this.numerator != test);
   }
   
   public String toString() {
      String ret = new String();
      ret += this.numerator;
      if (this.denominator != 1)
         ret += "/" + this.denominator;
      return ret;
   }
}