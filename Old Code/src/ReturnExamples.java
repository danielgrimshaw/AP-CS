public class ReturnExamples {
   public static void main(String[] args) {
      System.out.println("The slope is "+slope(10,6,6,3));
      
      double value = 144.;
      System.out.println("The square root of "+value+" is "+Math.sqrt(value));
      
      System.out.println(Math.abs(-10.5));
      
      int base = 3, exponent=5;
      double result = Math.pow(base, exponent);
      System.out.println(result);
   }
   
   public static double slope(double x1, double y1, double x2, double y2) {
      return ((y2-y1)/(x2-x1));
   }
}