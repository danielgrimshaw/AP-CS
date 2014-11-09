import java.util.*;

/*
 * 1) {5} : 0
 *    {3,12} : 9
 *    {4,2,10,8} : 6
 *    {1,9,3,5,7} : 8
 *    {8,2,10,4,10,9} : 2
 *
 * 2) {8} : 0
 *    {14,7} : 1
 *    {7,1,3,2,0,4} : 3
 *    {10,8,9,5,6} : 2
 *    {8,10,8,6,4,2} : 4
 */
public class GrimshawArrayPR {
   public static void main(String[] args) {
      // 1. Write a method swap that accepts an array of integers
      // and two indexes and swaps the elements at those indexes.
      int[] a1 = {12, 34, 56};
      swap(a1, 1, 2);
      System.out.println(Arrays.toString(a1));  // [12, 56, 34]

      // 2.	Write a method swapAll that accepts two arrays of integers
      // as parameters and swaps their entire contents.
      // Assume that the two arrays are the same length.
      int[] a1b = {12, 34, 56};
      int[] a2b = {20, 50, 80};
      //swapAll(a1b, a2b);
      //System.out.println(Arrays.toString(a1b));  // [20, 50, 80]
      //System.out.println(Arrays.toString(a2b));  // [12, 34, 56]

      // 3.	Write a method merge that accepts two arrays of integers
      // and returns a new array containing all elements of the first array
      // followed by all elements of the second.
      int[] a1c = {12, 34, 56};
      int[] a2c = {7, 8, 9, 10};
      int[] a3c = merge(a1c, a2c);
      System.out.println(Arrays.toString(a3c));
      // [12, 34, 56, 7, 8, 9, 10]

      // 4.	Write a method merge3 that merges 3 arrays similarly to problem 3.
      int[] a1d = {12, 34, 56};
      int[] a2d = {7, 8, 9, 10};
      int[] a3d = {444, 222, -1};
      //int[] a4d = merge3(a1d, a2d, a3d);
      //System.out.println(Arrays.toString(a4d));
      // [12, 34, 56, 7, 8, 9, 10, 444, 222, -1]
      //int[] a4e = merge3A(a1d, a2d, a3d);
      //System.out.println(Arrays.toString(a4e));

      // 5. Determines the percent of even numbers in an array of integers.
      int[] numbers = {6, 2, 9, 11, 3};
      double percent = percentEven(numbers);
      System.out.println("The percent of even numbers in "
         + Arrays.toString(numbers) + " is " + percent + ".");
   }

   public static void swap(int [] a, int index1, int index2) {
      int tmp = a[index2];
      a[index2] = a[index1];
      a[index1] = tmp;
   }

   public static int [] merge(int [] a1, int [] a2) {
      int [] ans = new int [a1.length+a2.length];
      for (int i = 0; i < a1.length; i++)
         ans[i] = a1[i];
      for (int i = a1.length; i < a1.length+a2.length; i++)
         ans[i] = a2[i-a1.length];
      return ans;
   }

   public static double percentEven(int [] nums) {
      int i = 0;
      for (int j : nums)
         if (j%2==0) i++;
      return 100*((double)i/nums.length);
   }

}
