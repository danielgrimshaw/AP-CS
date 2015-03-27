/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 *
 * @author Daniel Grimshaw
 *
 * @version 0.0.1
 */
public class Card {
   private final int points;
   private final String rank, suit;

   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		this.points = cardPointValue;
      this.rank = cardRank;
      this.suit = cardSuit;
	}


	/**
	 * Accesses this <code>Card</code>'s suit.
	 * @return this <code>Card</code>'s suit.
	 */
	public String suit() {
		return this.suit;
   }

	/**
	 * Accesses this <code>Card</code>'s rank.
	 * @return this <code>Card</code>'s rank.
	 */
	public String rank() {
		return this.rank;
	}

   /**
	 * Accesses this <code>Card</code>'s point value.
	 * @return this <code>Card</code>'s point value.
	 */
	public int points() {
      return this.points;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
      return (this.rank().equals(otherCard.rank())) && (this.suit().equals(otherCard.suit()))
             && (this.points() == otherCard.points());
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
      return this.rank() + " of " + this.suit() + " (point value = " + this.points() + ")";
	}
}
