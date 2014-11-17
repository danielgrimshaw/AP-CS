import java.util.Arrays;

public class GrimshawTallying {
   public static void main(String[] args) {
      int [] problem1 = {27, 15, 15, 11, 27};
      System.out.println("The mode of "+Arrays.toString(problem1)+" is "+mode(problem1)+".\n");

      int [] problem3 = {74, 85, 102, 99, 101, 85, 56};
      System.out.println("Before: "+Arrays.toString(problem3));
      System.out.println("The last index of value 85 in "+Arrays.toString(problem3)+" is "+lastIndexOf(problem3, 85));

      int [] problem4 = {36, 12, 25, 19, 46, 31, 22};
      System.out.println("\nThe range of "+Arrays.toString(problem4)+" is "+range(problem4));

      int [] problem6 = {200, 300, 250, 1, 950, 40};
      System.out.println("\nThe closest value to 280 in "+Arrays.toString(problem6)+" is "+priceIsRight(problem6, 280));
   }

   public static int mode(int [] nums) {
      int [][] numbers = new int [nums.length][2];
      int next = 0;
      boolean found = false;
      for (int i : nums) {
         for (int [] j : numbers){
            if (j[0] == i){
               j[1]++;
               found = true;
            }
         }
         if (!found) {
            numbers[next][0] = i;
            numbers[next][1] = 1;
            next++;
         }
      }
      int max = 0;
      int maxCount = 0;
      for (int [] i : numbers){
         if (i[1] > maxCount){
            max = i[0];
            maxCount = i[1];
         } else if (i[1] == maxCount) {
            if (i[0] < max)
               max = i[0];
         }
      }
      return max;
   }

   public static int lastIndexOf(int [] arr, int num) {
      int index = -1;
      for (int i = 0; i < arr.length; i++)
         if (arr[i] == num) index = i;
      return index;
   }

   public static int range(int [] nums) {
      int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
      for (int i : nums) {
         if (i < min) min = i;
         if (i > max) max = i;
      }
      return 1 + (max-min);
   }

   public static int priceIsRight(int [] guesses, int price) {
      int closest = -1;
      int distance = Integer.MAX_VALUE;
      int [] difference = new int [guesses.length];
      for (int i = 0; i < guesses.length; i++)
         difference[i] = price - guesses[i];
      for (int i = 0; i < guesses.length; i++)
         if (difference[i] < distance && difference[i] >= 0){
            distance = difference[i];
            closest = guesses[i];
         }
      return closest;
   }
}
