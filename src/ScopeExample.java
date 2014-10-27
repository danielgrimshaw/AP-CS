public class ScopeExample {
   public static void main(String[] args) {
      //int x = 3;
      //int y = 7;
      computeSum();
      int x;
      x = 0;
      for (int i = 0; i <= 10; i++)
         x = i*2+1;
      //computeSum(x,y);
      System.out.println(x);
      for (int i = 0; i <= 4; i++){
         for (int j = 0; j < 3; j++)
            System.out.print("*");
         for (int j = 0; j < 5; j += 2)
            System.out.print("+");
      }
   }
   
   public static void computeSum() {
      int x = 3;
      int y = 7;
      int sum = x+y;
      System.out.println("sum = "+sum);
   }
   
   public static void computeSum(int x, int y) {
      int sum = x+y;
      System.out.println("Sum = "+sum);
   }
}