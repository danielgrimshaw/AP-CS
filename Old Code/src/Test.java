public class Test {
   public static void main(String[] args) {
      int [][] matrix = new int [5][10];
      for (int i = 0; i < matrix.length; i++)
         matrix[i][1] = i+1;
      for (int [] i : matrix) {
         int count = 0;
         System.out.print("["+i[0]);
         for (int j : i) {
            if (count != 0)
               System.out.print(j);
            count++;
            if (count != matrix[0].length)
               System.out.print(", ");
         }
         System.out.println("]");
      }
   }
}