import java.util.*;

public class GrimshawMidPoint {
   public static void main(String[] args) {
      if (hasMidpoint(7, 4, 10))
         System.out.println("7, 4, 10 has a midpoint.");
      else
         System.out.println("7, 4, 10 does not have a midpoint.");
         
      if (hasMidpoint(9, 15, 8))
         System.out.println("9, 15, 8 has a midpoint.");
      else
         System.out.println("9, 15, 8 does not have a midpoint.");
   }
   
   /* Place your method body below. */ 
   
   public static boolean hasMidpoint(int a, int b, int c) {
      return ((a+b)/2 == c || (a+c)/2 == b || (b+c)/2 == a);
   }
}
