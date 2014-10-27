/**Prints three asterisk figures
 * @author "Daniel Grimshaw"
 * @version "0.0.1"
*/

public class GrimshawAsterisks {
   public static void main(String[] args) {
      GrimshawAsterisks a = new GrimshawAsterisks();
      a.printFigures();
   }
   
   public GrimshawAsterisks(){}
   public void printFigures() {
      printFig1();
      System.out.println();
      printFig2();
      System.out.println();
      printFig3();
      System.out.println();
   }
   
   private void printFig1() {
      printDoubleFive(1);
      printFiveAsDice(1);
   }
   
   private void printFig2() {
      printDoubleFive(1);
      printFiveAsDice(1);
      printDoubleFive(1);
   }
   
   private void printFig3() {
      printAsterisk(3);
      printDoubleFive(1);
      printFiveAsDice(1);
   }
   
   private int printDoubleFive(int count) {
      if (count == 0) return 0;
      System.out.println("* * * * *\n* * * * *");
      return printDoubleFive(count - 1);
   }
   
   private int printFiveAsDice(int count) {
   return 0;
   }
   
   private int printAsterisk(int count) {
   return 0;
   }
}