import java.util.Arrays;

public class GrimshawSelection {
   public static void main(String [] args) {
      int [] array1 = {22, 18, 12, -4, 27, 30, 36, 50, 7, 68, 91, 56, 2, 85, 42, 98, 25};
      int [] array2 = {55};
      int [] array3 = {98, 88, 76, 54, 45, 36, 32, 31, 31, 25, 19, 17, 12, 7, 5, 0, -10};
      int [] array4 = {22, 18, 12, -4, 27, 30, 36, 50, 7, 68, 91, 56, 2, 85, 42, 98, 25};
      int [] array5 = {55};
      int [] array6 = {98, 88, 76, 54, 45, 36, 32, 31, 31, 25, 19, 17, 12, 7, 5, 0, -10};
      
      reverseSelectionSort(array1);
      reverseSelectionSort(array2);
      reverseSelectionSort(array3);
      
      System.out.println(Arrays.toString(array1));
      System.out.println(Arrays.toString(array2));
      System.out.println(Arrays.toString(array3));
      
      dualSelectionSort(array4);
      dualSelectionSort(array5);
      dualSelectionSort(array6);
      
      System.out.println(Arrays.toString(array4));
      System.out.println(Arrays.toString(array5));
      System.out.println(Arrays.toString(array6));
   }
   
   public static void reverseSelectionSort(int [] a) {
      int maxPos;
   
      for (int j = 0; j < a.length-1; j++) {
         maxPos = j;
         for (int i = j+1; i < a.length; i++)
            if (a[i] > a[maxPos])
               maxPos = i;
         int tmp = a[j];
         a[j] = a[maxPos];
         a[maxPos] = tmp;
      }
   }
   
   public static void dualSelectionSort(int [] a) {
      int maxPos;
      int minPos;
   
      for (int j = 0; j < a.length/2-1; j++) {
         maxPos = j+1;
         minPos = j;
         
         for (int i = j+1; i < a.length-j; i++)
            if (a[i] < a[minPos])
               minPos = i;
               
         int tmp = a[j];
         a[j] = a[minPos];
         a[minPos] = tmp;
         
         for (int i = j+2; i < a.length-j; i++)
            if (a[i] > a[maxPos])
               maxPos = i;
         
         tmp = a[a.length-1-j];
         a[a.length-1-j] = a[maxPos];
         a[maxPos] = tmp;
      }
   }
}