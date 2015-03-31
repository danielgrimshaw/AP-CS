import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
   private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
   private static final String[] RANKS =
   	{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
   private static final String[] SUITS =
   	{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
   private static final int[] POINT_VALUES =
   	{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
   private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
   public ElevensBoard() {
      super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
   }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
   @Override
   public boolean isLegal(List<Integer> selectedCards) {
      if (selectedCards.size() == 2)
         return containsPairSum11(selectedCards);
      else if (selectedCards.size() == 3)
         return containsJQK(selectedCards);
      else
         return false;
   }

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
   @Override
   public boolean anotherPlayIsPossible() {
      List<Integer> indexes = this.cardIndexes();
      return containsPairSum11(indexes) || containsJQK(indexes);
   }

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
   private boolean containsPairSum11(List<Integer> selectedCards) {
      for (int i = 0; i < selectedCards.size()-1; i++) {
         Card card1 = cardAt(selectedCards.get(i));
         for (int j = i+1; j < selectedCards.size(); j++) {
            Card card2 = cardAt(selectedCards.get(j));
            if (card1.points()+card2.points() == 11)
               return true;
         }
      }
      return false;
   }

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
   private boolean containsJQK(List<Integer> selectedCards) {
      for (int i = 0; i < selectedCards.size()-2; i++) {
         Card card1 = cardAt(selectedCards.get(i));
         if (card1.points() == 0) // rank is a jack, queen or king
            for (int j = i+1; j < selectedCards.size()-1; j++) {
               Card card2 = cardAt(selectedCards.get(j));
               if (card2.points() == 0 && !(card1.rank().equals(card2.rank())))
                  for (int k = j+1; k < selectedCards.size(); k++) {
                     Card card3 = cardAt(selectedCards.get(k));
                     if (card3.points() == 0 && !(card1.rank().equals(card3.rank())) && !(card2.rank().equals(card3.rank())))
                        return true;
                  }
            }
      }
      return false;
   }
}
