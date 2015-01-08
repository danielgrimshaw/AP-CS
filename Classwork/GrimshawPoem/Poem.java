public abstract class Poem {
   public abstract int numLines();
   public abstract int getSyllables(int line);
   
   public void printRhythm() {
      String TA = "ta-";
      for (int i = 0; i < numLines(); i++) {
         for (int j = 0; j < getSyllables(i+1); j++)
            System.out.print(TA);
         System.out.println("ta");
      }
   }
}