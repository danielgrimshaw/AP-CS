import java.util.*;
import java.awt.*;

public class GrimshawTechniques {
   public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4, 5, 6};
      System.out.println(Arrays.toString(numbers));
      rotateLeft(numbers);
      System.out.println(Arrays.toString(numbers));
      rotateRight(numbers);
      System.out.println(Arrays.toString(numbers));
      
      // The two steps needed when creating
      // an array of objects are:
      // 1) declare the array and create the object for the array
      // 2) declare each element and create the object for each element
      
      // What is printed?
      int[] data = {5, 8, 15, 18, 25};
      for (int i = 0; i < data.length - 1; i++) {
         for (int j = 0; j < data.length - 1; j++) {
            if (data[i]%5==0 && data[j]%5 ==0) {
               System.out.println(data[i] + " " + data[j] + " are divisible by 5");
            }
         }
      }
      
      // Declares a variable called points, 
      // that refers to an array of length 3
      // that stores references to Point objects
   
   
      // After declare points, have null in 
      // element locations [0], [1], and [2].
      // Now construct the Point objects.
     
      
      // Also can use the quick array 
      // initialization approach
   
   
   }


   /* 1.	Write the statement which, when placed within 
      the following for loop, will result in the code 
      shifting each element in the array to the left 
      by one index position and placing the first 
      element in the last position of the array.  
   */
   public static void rotateLeft(int[] numbers) {
      int first = numbers[0];
      for (int i = 0; i < numbers.length - 1; i++) {
         numbers[i] = numbers[i+1];
      }
      numbers[numbers.length - 1] = first;
   }
   
   /* Complete the for loop structure and statement 
      within the for loop needed to shift each element 
      in the array to the right by one index position 
      and place the last element in the first position 
      of the array.
   */
   public static void rotateRight(int[] numbers) {
      int last = numbers[numbers.length-1];
      for (int i = numbers.length-1; i > 0 ; i--) {
         numbers[i] = numbers[i-1];
      }
      numbers[0] = last;
   }
   
}