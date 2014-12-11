public class Book {

   private int numPages;
   private int currentPage;
   
   public Book(int newPage) {
      this.numPages = newPage;
      this.currentPage = 1;
   }
   
   public int getNumPages() {
      return numPages;
   }
   
   public int getCurrentPage() {
      return currentPage;
   }
   
   public void nextPage() {
      if (currentPage < numPages) {
         currentPage++;
      }
   }
   
   public String toString() {
      return currentPage + " ";
   }
}