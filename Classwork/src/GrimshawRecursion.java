public class GrimshawRecursion {
   public static int multiplyEvens(int n) {
      if (n <= 0)
         throw new IllegalArgumentException();
      if (n == 1)
         return 2;
      return 2*n*multiplyEvens(n-1);
   }
   
   public static void writeSquares(int n) {
      if (n < 1) throw new IllegalArgumentException();
      if (n == 1) {
         System.out.print(1);
         return;
      }
      if (n%2 == 1)
         System.out.print(n*n + ", ");
      writeSquares(n-1);
      if (n%2 == 0)
         System.out.print(", " + n*n);
   }
   
   public static void main(String [] args) {
      int [] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      for (int i : test)
         System.out.println(multiplyEvens(i));
     writeSquares(5);
   }
}