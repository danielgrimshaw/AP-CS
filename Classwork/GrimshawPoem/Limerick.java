public class Limerick extends Poem {
   public int numLines() {
      return 5;
   }
   
   public int getSyllables(int line) {
      if (line <= 5)
         return line < 3 ? 9 : line > 4 ? 9 : 6;
      else
         throw new IllegalArgumentException("Limericks have only five lines");
   }
}