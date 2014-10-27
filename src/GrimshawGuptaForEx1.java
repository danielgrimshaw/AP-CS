public class GrimshawGuptaForEx1 {
   public static void disp(Object o) {
      System.out.print(o);
   }
   
   public static void disp() {
      System.out.println();
   }
   
   public static void main(String[] args) {
      int i;
      
      for (i = 8; i <= 62; i += 18) {
         disp(i+"\t");
      }
      
      disp();
      
      for (i = 1; i <= 4; i++) {
         disp(18*i-10+"\t");
      }
      
      disp();
      
      for (i = 62; i >= 8; i -= 18) {
         disp(i+"\t");
      }
      
      disp();
      
      for (i=1; i<=4; i++) {
         disp(80-18*i+"\t");
      }
      
      disp();
      
      for (i = 4; i >= 1; i--) {
         disp(18*i-10+"\t");
      }
   } 
      
}