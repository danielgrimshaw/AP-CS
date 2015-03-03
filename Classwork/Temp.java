import java.util.Arrays;

import java.util.Arrays;

public class Temp {
   public static void main(String []  args) {
      int [] primes = {2,3,5,7,11,13,17,19,23};
      backwardDisplay(primes);
      System.out.println("\n"+Arrays.toString(primes));
      
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
}