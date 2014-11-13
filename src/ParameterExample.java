public class ParameterExample {
   public static void main(String[] args) {
      printNums('3',3);
      printNums('5',5);
      printNums('7',7);
      printNums('1', 876);
      printNums((char)238497, 6);
      printNums('0', 0);
   }

   public static void printNums(char num, int quantity) {
      if (quantity < 0) {
         System.out.println("Error: Illeagal Parameter!");
         System.exit(1);
      }
      
      for (int i = 0; i < quantity; i++)
         System.out.print(num);
      System.out.println();
   }
}   