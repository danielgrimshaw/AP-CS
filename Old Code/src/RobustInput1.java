import java.util.*;

public class RobustInput1 {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int guess = getIntBetween(console, "guess? ", 1, 100);
      System.out.println(guess);
   }

   public static int getIntBetween(Scanner console,
         String prompt, int low, int high) {
      int response = low - 1;
      while (response < low || response > high) {
         System.out.println("enter an integer between " +
                            low + " and " + high + " inclusive.");
         response = getInt(console, prompt);
      }
      return response;
   }

   public static int getInt(Scanner console, String prompt) {
      System.out.print(prompt);
      while (!console.hasNextInt()) {
         console.next();  // Discard the invalid input
         System.out.println("That is not an integer.  " + 
                            "Please try again.");
         System.out.print(prompt);
      }
      return console.nextInt();
   }
}
