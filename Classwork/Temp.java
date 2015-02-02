import java.util.Arrays;

public class Temp {
   public static void main(String []  args) {
      int [] numbers = {3,8,15};
      int [] numbers2 = {-3,8,2,-5,1,9};
      
      System.out.println(Arrays.toString(numbers));
      System.out.println(Arrays.toString(numbers2));
      
    //  System.out.println(myAddAbsoluteDifference(numbers));
      //System.out.println(myAddAbsoluteDifference(numbers2));
      
      System.out.println(Arrays.toString(addAbsoluteDifference(numbers)));
      System.out.println(Arrays.toString(addAbsoluteDifference(numbers2)));
   }
   
   public static int [] myAddAbsoluteDifference(int [] numbers) {
      int [] addedNums = new int [2*numbers.length-1];
      if (numbers.length < 2) 
         return numbers;
      for (int i = 0; i < numbers.length; i++) {
         addedNums[2*i] = numbers[i];
         addedNums[2*i+1] = Math.abs(numbers[i+1]-numbers[i]);
      } 
      return addedNums;
   }
         
   public static int [] addAbsoluteDifference(int [] numbers) {
      if (numbers.length < 2) {
         return numbers;
      }
      int [] addedNums = new int[numbers.length+numbers.length-1];
         
      addedNums[0] = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
         addedNums[2*i-1] = Math.abs(numbers[i] - numbers[i-1]);
         addedNums[2*i] = numbers[i];
      }
      return addedNums;
   }
}