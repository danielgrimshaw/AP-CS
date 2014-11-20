import java.util.Arrays;

public class GrimshawArrayMethods {
   public static void main(String[] args) {
      int [] findMinTest = {16, 12, 25, 44};
      System.out.println("The minimum of "+Arrays.toString(findMinTest)+" is "+findMin(findMinTest));
      
      int [] countTest = {3, 5, 2, 1, 92, 38, 3, 14, 5, 73, 5};
      System.out.println("There are "+count(countTest,3)+" 3's in "+Arrays.toString(findMinTest)+".");
      
      int [] stretchTest = {18, 7, 4, 24, 11};
      System.out.println("Before stretch: "+Arrays.toString(stretchTest)+"\nAfter stretch: "+Arrays.toString(stretch(stretchTest)));
      
      int[] list1 = {1, 6, 2, 1, 4, 1, 2, 3, 8}; 
      int[] list2 = {1, 2, 3}; 
      System.out.println(Arrays.toString(list1)+" contains "+Arrays.toString(list2)+" is "+contains(list1, list2));
   }
   public static int findMin(int [] vals) {
      int min = Integer.MAX_VALUE;
      for (int i : vals)
         if (i < min)
            min = i;
      return min;
   }
   
   public static int count(int [] vals, int pattern) {
      int cnt = 0;
      for (int i : vals)
         if (i == pattern)
            cnt++;
      return cnt;
   }
   
   public static int [] stretch(int [] original) {
      int [] stretched = new int [original.length*2];
      for (int i = 0; i < stretched.length; i += 2) {
         int val = original[i/2]/2;
         int val2;
         if (original[i/2]%2 != 0)
            val2 = val+1;
         else
            val2 = val;
         stretched[i] = val2;
         stretched[i+1] = val;
      }
      return stretched;
   }
   
   public static boolean contains(int [] source, int [] pattern) {
      for (int i = 0; i < source.length; i++) {
         int matches = 0;
         for (int j = 0; j < pattern.length; j++) {
            if (i+j >= source.length) return false;
            if (source[i+j] == pattern[j])
               matches++;
         }
         if (matches == pattern.length) return true;
      }
      return false;
   }
               
}