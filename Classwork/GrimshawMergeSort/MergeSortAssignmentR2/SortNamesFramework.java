// Program to sort an input file of names, ignoring case, using the mergesort
// algorithm.

import java.io.*;
import java.util.*;

public class SortNamesFramework {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      System.out.print("What is the input file? ");
      String fileName = console.nextLine();
      Scanner input = new Scanner(new File(fileName));
      System.out.println();
   
      String[] names = readNames(input);
      mergeSort(names);
      for (String s : names) {
         System.out.println(s);
      }
   }
 
   public static String[] readNames(Scanner input) {
      List<String> data = new ArrayList<String>();
      while (input.hasNextLine()) {
         data.add(input.nextLine());
      }
      String[] result = new String[data.size()];
      data.toArray(result);
      return result;
   }

 // Add your three merge sort methods below.

}
