import java.util.*;

public class Grimshaw_CoordinatesFactoringFramework {
   public static void main(String[] args) {
   
      // Keeping the following code, rewrite the getCoordinates method below using 
      // factoring to eliminate redundancy.  Your method must still produce the same 
      // output and result under all cases.
   
      System.out.println(getCoordinates(new Scanner(System.in)));
   
   }

   public static double getCoordinates(Scanner console) {
      System.out.print("What is the x coordinate? ");
      double x = console.nextDouble();
      int negatives;
      System.out.print("What is the y coordinate? ");
      double y = console.nextDouble();
      if (x < 0.0 && y < 0.0)
            negatives = 2;
      else if (x < 0.0 || y < 0.0)
         negatives = 1;
      else 
         negatives = 0;
      System.out.println("negatives = " + negatives);
      return x + y + negatives;
   }
}
