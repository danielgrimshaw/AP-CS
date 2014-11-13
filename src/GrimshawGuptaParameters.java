public class GrimshawGuptaParameters {
   public static void printNumbers(int max) {
      if (max < 1) {
         System.out.println("Error: Invalid Number!\nAbort.");
         System.exit(1);
      }
      for (int i = 1; i <= max; i++)
         System.out.print("["+i+"]");
      System.out.println();
   }
   
   public static void printSquare(int min, int max) {
     /* for (int i = min; i <= max + 1; i++) {
         for (int j = max - min + 1; j >= 1; j--){
            System.out.print(i);
            for (int k = 0; k <= max - min + 1; k++) {
               System.out.print(i);
            }
            System.out.println();
         }
      }//above (Commented out) is Suyash, below  is Daniel
      */   
      for (int i = min; i <= max; i++) {
         int tmp;
         for (int j = 0; j<=max-min;j++) {
            tmp = j;
            if (tmp <= max){
               System.out.print(i+tmp);
            } else {
               tmp = tmp%max+1; 
               System.out.print(tmp);
            }
         }
         System.out.println();
      }
   }
   
   public static void main(String[] args) {
      printNumbers(15);
      printNumbers(5);
      System.out.println();
      printSquare(3,7);
   }
}