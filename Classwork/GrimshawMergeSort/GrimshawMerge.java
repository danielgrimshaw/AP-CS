// Program to sort an input file of names, ignoring case, using the mergesort
// algorithm.

import java.io.*;
import java.util.*;

public class GrimshawMerge {
   public static void main (String [] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      System.out.print("What is the input file? ");
      String fileName = console.nextLine();
      Scanner input = new Scanner(new File(fileName));
      System.out.println();
   
      String[] names = readNames(input);
      mergeSort(names);
      for (String s : names)
         System.out.println(s);
   }
 
   public static String [] readNames(Scanner input) {
      List<String> data = new ArrayList<String>();
      while (input.hasNextLine())
         data.add(input.nextLine());
      
      String[] result = new String[data.size()];
      data.toArray(result);
      return result;
   }

   public static void mergeSort(String [] elements) {
      String [] temp = new String [elements.length];
      mergeSortHelper(elements, 0, elements.length - 1, temp);
   }
   
   private static void mergeSortHelper(String [] elements, int from, int to, String [] temp) {
      if (from < to) {
         int middle = (from + to) / 2;
         mergeSortHelper(elements, from, middle, temp);
         mergeSortHelper(elements, middle + 1, to, temp);
         merge(elements, from, middle, to, temp);
      }
   }

   private static void merge(String [] elements, int from, int mid, int to, String [] temp) {
      int i = from;
      int j = mid + 1;
      int k = from;
      for (k = from; i <= mid && j <= to; k++) {
         if (elements[i].compareToIgnoreCase(elements[j]) < 0) {
            temp[k] = elements[i];
            i++;
         }
         else {
            temp[k] = elements[j];
            j++;
         }
      }
      for (i = i, k = k; i <= mid; i++, k++)
         temp[k] = elements[i];
      for (j = j, k = k; j <= to; j++, k++)
         temp[k] = elements[j];
      for (k = from; k <= to; k++)
         elements[k] = temp[k];
   } 
}
