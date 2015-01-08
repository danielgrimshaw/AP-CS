public class Haiku extends Poem {
   public int numLines() {
      return 3;
   }
   
   public int getSyllables(int line) {
      if (line <= 3)
         return line == 2 ? 7 : 5;
      else
         throw new IllegalArgumentException("Haikus have only three lines");
   }
}