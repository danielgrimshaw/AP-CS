public class PoemTest {
   public static void main(String[] args) {
      Haiku h = new Haiku();
      System.out.println(h.numLines());
      h.printRhythm();
      System.out.println();
      
      Limerick l = new Limerick();
      System.out.println(l.numLines());
      l.printRhythm();
      System.out.println();
   
      Poem[] poems = {new Haiku(), new Limerick()};
      System.out.println("Poems: Haiku then Limerick");
      for(int i = 0; i < poems.length; i++) {
         poems[i].printRhythm();
         System.out.println();
      }
   }
}
