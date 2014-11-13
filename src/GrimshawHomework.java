public class GrimshawHomework {
   public static void printRange(int start, int end) {
      System.out.print("[");
      if (start <= end){
         for (int i = start; i <= end; i++) {
            if (i == end)
               System.out.print(i);
            else
               System.out.print(i+", ");
         }
      }
      else {
         for (int i = start; i >= end; i--){
            if (i == end)
               System.out.print(i);
            else
               System.out.print(i+", ");
         }
      }
      System.out.println("]");
   }
   
   public static void smallestLargest(Scanner cnsl) {
      int max = 0; int min = Integer.MAX_VALUE;
      int reps = cnsl.nextInt();
      
   
   public static void main(String[] args) {
      printRange(2,7);
      printRange(19, 11);
      printRange(5,5);
   }
}