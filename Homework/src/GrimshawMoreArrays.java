/*
 * 1.	What	is	the	output	of	the	following	program?
 * public	class	ReferenceMystery {
 *    public static	void	main(String[]	args) {
 *       int	x	=	1;
 *       int[]	a	=	new	int[2];
 *       mystery(x,	a);
 *       System.out.println(x	+			+	Arrays.toString(a));
 *       x--;
 *       a[1]	=	a.length;
 *       mystery(x,	a);
 *       System.out.println(x	+			+	Arrays.toString(a));
 *    }
 *    public	static	void	mystery(int	x,	int[]	list) {
 *       list[x]++;
 *       x++
 *       System.out.println(x	+			+	Arrays.toString(list));
 *    }
 * }
 * Output:
 * _2 [0,1]____________________________________
 * _1 [0,1]____________________________________
 * _1 [1,2]____________________________________
 * _0 [1,2]____________________________________
 */

import java.util.Arrays;

public class GrimshawMoreArrays {
   public static void main(String[] args) {
      String [] strs = {"belt",	"hat",	"jelly",	"bubble	gum"};
      double avgLength = avgLength(strs);
      System.out.println(avgLength);
      
      String [] palindrome = {"alpha",	"beta",	"gamma",	"delta",	"gamma",	"beta",	"alpha"};
      if (isPalindrome(palindrome))
         System.out.println(Arrays.toString(palindrome) + " is a palindrome");
         
      double [] list1 = {16.1,       12.3,   22.2,   14.4};
      double [] list2 = {1.5,   4.3,    7.0,    19.5,   25.1,   46.2};
      if (isSorted(list1))
         System.out.println(Arrays.toString(list1) + " is a sorted array");
      else
         System.out.println(Arrays.toString(list1) + " is not a sorted array");
      if (isSorted(list2))
         System.out.println(Arrays.toString(list2) + " is a sorted array");
      else
         System.out.println(Arrays.toString(list2) + " is not a sorted array");
      int [] test1 = {3,     8,      12,     2,      9,      17,     43, -8, 46};
      int [] test2 = {4,  7,      3,      9,      12,     -47,    3,      74};
      System.out.println(isUnique(test1)+"\n"+isUnique(test2));
   }
   
   public static double avgLength(String [] strings) {
      int elements = strings.length;
      int totalLength = 0;
      for (String s : strings)
         totalLength += s.length();
      return (double)totalLength/elements;
   }
   
   public static boolean isPalindrome(String [] strings) {
      for (int i = 0; i < strings.length; i++)
         if (!(strings[i].equals(strings[strings.length-1-i])))
            return false;
      return true;
   }
   
   public static boolean isSorted(double [] doubles) {
      if (doubles.length == 1) return true;
      for (int i = 1; i < doubles.length; i++)
         if (doubles[i-1] > doubles[i]) return false;
      return true;
   }

   public static boolean isUnique(int [] nums) {
      for (int i = 0; i < nums.length-1; i++)
         for (int j = i+1; j < nums.length; j++)
            if (nums[i] == nums[j]) return false;
      return true;
   }

   public static int getMax4D(int [][][][] nums) {
      //finds the larges single value in a four dimensional array
      int max = Integer.MIN_VALUE;
      for (int [][][] threeD : nums)
         for (int [][] twoD : threeD)
            for (int [] oneD : twoD)
               for (int i : oneD)
                  if (i > max)
                     max = i;
      return max;
   }
}
