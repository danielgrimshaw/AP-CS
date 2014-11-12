import java.util.*;

public class Grimshaw2D {
   public static void main(String[] args) {
      //creates a 2D int array of 5 rows 4 columns
      int [] [] numsGrid = new int[5][4];
      //System.out.println(Arrays.deepToString(numsGrid));
      for (int [] i : numsGrid)
         System.out.println(Arrays.toString(i));
      
      System.out.println();
      
      //declare a 2d array
      double[][] dblGrid;
      //initialize array of 5 references
      dblGrid = new double[5][];
      //create an array of length 4 for each reference
      for (int i = 0; i < 5; i++)
         dblGrid[i] = new double[4];
      //System.out.println(Arrays.deepToString(dblGrid));
      for (double [] i : dblGrid)
         System.out.println(Arrays.toString(i));
   }
}