/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
      String [] ranks1 = {"A", "B", "C"};
      String [] ranks2 = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
      String [] ranks3 = {};
      String [] suits1 = {"giraffes", "Lions"};
      String [] suits2 = {"Clubs", "Hearts", "Diamonds", "Spades"};
      String [] suits3 = {};
      int [] points1 = {2,1,6};
      int [] points2 = {14,2,3,4,5,6,7,8,9,10,11,12,13};
      int [] points3 = {};
	   Deck [] decks = {new Deck(ranks1, suits1, points1), new Deck(ranks2, suits2, points2),
                       new Deck(ranks3, suits3, points3)};
      for (Deck deck : decks) {
         System.out.println(deck.size());
         while (!deck.isEmpty())
            System.out.println(deck.deal());
         System.out.println(deck.size());
         System.out.println();
      }
      System.out.println(Integer.MAX_VALUE);
	}
}
