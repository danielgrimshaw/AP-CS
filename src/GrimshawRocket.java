/*
 * Prints an ASCII rocket that is 
 * scaled according to class constant
 * SCALE
 *
 * @author "Daniel Grimshaw"
 * @version "0.0.1"
 */

public class GrimshawRocket {
   public static final int SCALE = 3;
   
   public static void printUpperBody() {
      //prints the section of body with the /\
      for (int i = 1; i <= SCALE; i++) {
         System.out.print("|"); //print left side
         for (int j = 1; j <= 2; j++) {
            //second level for loop repeats the
            //left half pattern (exc. |) again
            for (int k = 1; k <= SCALE-i; k++)
               System.out.print(".");
            for (int k = 1; k <= i; k++)
               System.out.print("/\\");
            for (int k = 1; k <= SCALE-i; k++)
               System.out.print(".");
         }
         System.out.println("|"); //print right side
      }
   }

   public static void printLowerBody() {
      //prints the section of body with the \/
      for (int i = SCALE; i >= 1; i--) {
         System.out.print("|");     //print left side
         for (int j = 1; j <= 2; j++) {
            //second level for loop repeats the
            //left half pattern (exc. |) again
            for (int k = 1; k <= SCALE-i; k++)
               System.out.print(".");
            for (int k = 1; k <= i; k++)
               System.out.print("\\/");
            for (int k = 1; k <= SCALE-i; k++)
               System.out.print(".");
         }
         System.out.println("|"); //print right side
      }
   }
      
   public static void printCone() {
      //prints the cone that is at the
      //top and bottom of every rocket
      
      //calculate the number of slashes
      int numSlashes = 2*SCALE-1;
      
      for (int i = 1; i <= numSlashes; i++) {
         //print spaces
         for (int j = 1; j <= 2*SCALE-i; j++)
            System.out.print(" ");
         //print /
         for (int j = 1; j <= i; j++)
            System.out.print("/");
         
         System.out.print("**");
         //print \
         for (int j = 1; j <= i; j++)
            System.out.print("\\");
         System.out.println();
      }
   }
   
   public static void printSeparator() {
      //prints the separating line
      if (SCALE > 0 ) {
         System.out.print("+");
         for (int i = 1; i <= 2*SCALE; i++) 
            System.out.print("=*");
         System.out.println("+");
      }
   }
   
   public static void printTopBody() {
      //prints the top half of the rocket
      printLowerBody();
      printUpperBody();
      printSeparator();
   }
   
   public static void printBottomBody() {
      //prints the bottom half of the rocket
      printUpperBody();
      printLowerBody();
      printSeparator();
   }
   
   public static void main(String[] args) {
      printCone();
      printSeparator();
      printTopBody();
      printBottomBody();
      printCone();
   }
}