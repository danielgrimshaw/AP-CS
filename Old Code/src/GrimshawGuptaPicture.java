public final class GrimshawGuptaPicture {
   public static final int scale = 26;
   public static final boolean DEBUG = false;
   
   private static void disp(Object o) {
      System.out.print(o);
   }
   
   private static void newLine(){
      System.out.println();
   }
   
   private static void printHorizBorder() {
      disp("*");
      for (int i = 0; i < 4*scale; i++)
         disp("^");
      disp("*");
      newLine();
   }
   
   private static void printDesign(int dots) {
      disp("!");
      for (int i = 0; i < (4*scale-(4+dots))/2; i++) {
         disp(" ");
      }
      disp("><");
      for (int i = 0; i < dots; i++) {
         disp(".");
      }
      disp("><");
      for (int i = 0; i < (4*scale-(4+dots))/2; i++) {
         disp(" ");
      }
      disp("!");
      newLine();
   }
   
   public static void main(String[] args) {
      printHorizBorder();
      for (int i = 0; i <scale; i++) {
         if (DEBUG)
            System.out.print("Top Half: "+i+"\t");
         printDesign(i*4);
      } 
      for (int i = 0; i < scale; i++) {
         if (DEBUG)
            System.out.print("Low Half: "+i+"\t");
         printDesign((i*-4)+(4*scale-4));
      }
      printHorizBorder();
   }
}