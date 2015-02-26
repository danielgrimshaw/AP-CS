import java.util.Arrays;

public class Temp {
   public static void main(String []  args) {
      mystery2(100);
   }
   
   public static void mystery2(int n) {
      if (n <= 1)
         System.out.print(n);
      else {
         mystery2(n / 2);
         System.out.print(", " + n);
      }
   }

}