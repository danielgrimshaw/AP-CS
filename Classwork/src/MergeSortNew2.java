import java.util.*;  

public class MergeSortNew2
{

   public static void main(String[] args)
   {
     
      // int nums[] = {22, 18, 12, -4, 27, 30, 36, 50, 7, 68, 91, 56, 2, 85, 42, 98, 25};   
      //int nums[] = {22, 18, 12, -4, 58, 7, 31, 43 };
      int nums[] = {37, 29, 19, 48, 23, 55, 74, 12};
      System.out.println("Before merge sort: " + Arrays.toString(nums));
      mergeSort(nums);
      System.out.println("After merge sort: " + Arrays.toString(nums));
   	
      /*
      int[] values = { 75, 45, 35, 22, 83, 18,  13 };  
      System.out.println("Before merge sort: " + Arrays.toString(values));
      mergeSort(values);
      System.out.println("After merge sort: " + Arrays.toString(values));
      */
   }
   
   /*
    * Sort an array of integers into ascendin order.
    *
    * @param elements an array containing the items to be sorted.
    *
    * Postcondition: elements contains its original items and items in elements
    * are sorted in ascending order.
    */
   public static void mergeSort(int[] elements)
   {
      int n = elements.length;
      int[] temp = new int[n];
      mergeSortHelper(elements, 0, n - 1, temp);
   }
   
   /**
    * Sorts elements[from] ... elements[to] inclusive into ascending order.
    * @param elements an array containing the items to be sorted.
    * @param from the beginning index of the items in elements to be sorted.
    * @param to the ending index of the items in elements to be sorted.
    * @param temp a temporary array to use during the merge process.
    * 
    * Precondition:
    *    (elements.length == 0 or
    *     0 <= from <= to <= elements.length) and
    *    elements.length == temp.length
    * Postcondition: elements contains its original items and the items
    *    in elements[from]...<= elements[to] are sorted in ascending order.
    */
   private static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
   {
      if (from < to) 
      {
         int middle = (from + to) / 2;
         mergeSortHelper(elements, from, middle, temp);
         mergeSortHelper(elements, middle + 1, to, temp);
         merge(elements, from, middle, to, temp);
      }
   }
   
   /**
    * Merges two adjacent arrays parts, each of which has been sorted into ascending
    * order, into one array part that is sorted into ascending order.
    *
    * @param elements an arry contain the parts to be merged.
    * @param from the beginning index in elements of the first part.
    * @param mid the ending index in elements of the first part.
    *        mid+1 is the beginning index in elements of the second part.
    * @param to the ending index in elements of the second part.
    * @param temp a temporary array to use during the merge process.
    * 
    * Precondition: 0 <= from <= mid <= to <= elements.length and
    *    elements[from] ... <= elements[mid] are sorted in ascending order and
    *    elements[mid+1] ... <= elements[to] are sorted in ascending order and 
    *    elements.length == temp.length
    * Postcondition: elements contains its original items and
    *    elements[from] ... <= elements[to] are sorted in ascending order and
    *    elements[0] ... elements[from - 1] are in original order and
    *    elements[to+1] ... elements[elements.length-1] are in original order.
    */
   private static void merge(int[] elements, int from, int mid, int to, int[] temp)
   {
      int i = from;
      int j = mid + 1;
      int k = from;
      while (i <= mid && j <= to)
      {
         if (elements[i] < elements[j])
         {
            temp[k] = elements[i];
            i++;
         }
         else
         {
            temp[k] = elements[j];
            j++;
         }
         k++;
      }
      while (i <= mid)
      {
         temp[k] = elements[i];
         i++;
         k++;
      }
      while (j <= to)
      {
         temp[k] = elements[j];
         j++;
         k++;
      }
      for (k = from; k <= to; k++)
      {
         elements[k] = temp[k];
      }
   }   
}






