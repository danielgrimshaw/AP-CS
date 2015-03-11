import java.util.Arrays;

import java.util.Arrays;

public class Temp {
   public static void main(String []  args) {
      int[] vals = {-10, -5, 0, 5, 10, 20, 30, 40, 50, 60, 70, 100};
      binarySearch(vals, 100);
   }
   
   public static void forwardDisplay(int [] primes) {
      if (primes.length > 0) {
         System.out.print(primes[0] + "  ");
         
         int [] newPrimes = new int [primes.length-1];
         for (int i = 1; i < primes.length; i++)
            newPrimes[i-1] = primes[i];
      
         forwardDisplay(newPrimes);
      }
   }
         
   public static void backwardDisplay(int [] primes) {
      if (primes.length > 0) {
         reverse(primes);
         System.out.print(primes[0] + "  ");
         reverse(primes);
         
         int [] newPrimes = new int [primes.length-1];
         for (int i = 0; i < primes.length-1; i++)
            newPrimes[i] = primes[i];
         
         backwardDisplay(newPrimes);
      }
   }

   private static void reverse(int [] toReverse) {
      for (int i = 0; i < toReverse.length/2; i++) {
         int tmp = toReverse[i];
         toReverse[i] = toReverse[toReverse.length-1-i];
         toReverse[toReverse.length-1-i] = tmp;
      }
   }
   
   public static int binarySearch(int[] elements, int target) {
      int left = 0;
      int right = elements.length-1;
      while (left <= right) {
         int middle = (left + right) / 2;
         if (target < elements[middle])
            right = middle -  1;
         else if (target > elements[middle])
            left = middle + 1;
         else
            return middle;
      } 
      return -1; 
   } 

}