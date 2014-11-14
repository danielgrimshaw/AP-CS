import java.util.*;
public class GrimshawTallyFreqDigit {
	public static void main(String[] args) {
		// Problem 1
		System.out.println("Problem 1");
		int n = 669260267;
		int digit = mostFrequentDigit(n);
		System.out.println("The most freqent digit occurring in the number " 
         + n + " is " + digit + ".");
		n = 57135203;
		digit = mostFrequentDigit(n);
		System.out.println("The most freqent digit occurring in the number " 
         + n + " is " + digit + ".");
		System.out.println();
	}
	
	// Problem 1 method
   public static int mostFrequentDigit(int n) {
      int [] counts = new int [10];
      while (n>0) {
         int digit = n%10;
         counts[digit]++;
         n /= 10;
      }
      int max = 0;
      for (int i = 0; i < counts.length; i++)
         if (counts[i] > max)
            max = i;
      return max;
   }
}