public class BookTest {
   
   public static void main(String[] args) {
      Book test = new Book(3);
      for (int i = 1; i <= 4; i++) {
         System.out.print(test);
         test.nextPage();
      }   
   }
}