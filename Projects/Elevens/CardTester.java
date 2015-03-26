/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
   public static void main(String[] args) {
      Card  [] cards = {new Card("Queen", "Spades", 13), new Card("Two", "Clubs", 0), new Card("Queen", "Spades", 13)};
      for (int i = 0; i < cards.length; i++) {
         System.out.println(cards[i]);
         System.out.println("\tRank: " + cards[i].rank());
         System.out.println("\tSuit: " + cards[i].suit());
         System.out.println("\tPoints: " + cards[i].points());
         for (int j = i+1; j < cards.length; j++)
            System.out.println("\t" + cards[i] + " == " + cards[j] + ": " + cards[i].matches(cards[j]));
         System.out.println();
      }
   }
}
