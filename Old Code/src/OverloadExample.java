public class OverloadExample {
   public static void main(String[] args) {
      drawLine();
      System.out.println();
      drawLine(10);
      System.out.println();
      drawLine("ABC");
      System.out.println();
      drawLine(10, "ABC");
      System.out.println();
      drawLine("ABC", 10);
      System.out.println();
   }
   
   public static void drawLine(Object o, int len) {
      System.out.print(o);
      drawLine(len);
   }
   
   public static void drawLine(Object o){
      drawLine();
      System.out.print(o);
   }
   
   public static void drawLine(int len, Object o) {
      drawLine(len);
      System.out.print(o);
   }
   
   public static void drawLine() {
      drawUnderScore(5);
   }
   
   public static void drawLine(int len) {
      drawUnderScore(len);
   }
   
   private static void drawUnderScore(int length) {
      for (int i = 0; i < length; i++) 
         System.out.print('_');
   }
}
