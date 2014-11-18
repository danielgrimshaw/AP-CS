import java.util.Arrays;

public class GrimshawArrayMethods {
   public static void main(String[] args) {
      int [][] arr = new int[4][4];
      
      for (int [] i : arr)
         System.out.println(Arrays.toString(i));
      System.out.println();
      setValues(arr);
      for (int [] i : arr)
         System.out.println(Arrays.toString(i));
         
      int [][] arr2 = {{1,4,6},{7,2,5},{9,8,3}};
      System.out.println();
      for (int [] i : arr2)
         System.out.println(Arrays.toString(i));
      System.out.println();
      reverseValues(arr2);
      for (int [] i : arr2)
         System.out.println(Arrays.toString(i));
   }
   
   public static void setValues(int [][] nums) {
      for (int i = 0; i < nums[2].length; i++)
         nums[2][i] = 3;
      for (int i = 0; i < nums.length; i++)
         nums[i][3] = 4;
   }
   
   public static void reverseValues(int [][] nums) {
      for (int i = 0; i < nums.length; i++){
          for (int j = 0; j < nums[i].length/2; j++) {
             int tmp = nums[i][j];
             nums[i][j] = nums[i][nums[i].length-j-1];
             nums[i][nums[i].length-j-1] = tmp;
          }
      }
   }
}