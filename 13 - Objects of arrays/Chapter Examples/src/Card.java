public class Card {

    String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
    String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    private final int cardRank;
    private final int cardSuit;

    public Card(int suit, int rank) {
        this.cardSuit = suit;
        this.cardRank = rank;
    }

    public String toString() {
        return RANKS[this.cardRank] + " of " + SUITS[this.cardSuit]; // prints corresponding String in array
    }

    public boolean equals(Card comparedCard) {
        return this.cardSuit == comparedCard.cardSuit && this.cardRank == comparedCard.cardRank;
    }

    public int compareTo(Card comparedCard) {
        if (this.cardSuit > comparedCard.cardSuit) {
            return 1;
        }
        if (this.cardSuit < comparedCard.cardSuit) {
            return -1;
        }
        if (this.cardRank > comparedCard.cardRank) {
            return 1;
        }
        if (this.cardRank < comparedCard.cardRank) {
            return -1;
        }
        return 0; // if none of the if statements return a number
    }

    /*
     * Getters for cardSuit & cardRank, no setters since cardSuit & cardRank are
     * final
     */
    public int getSuit() {
        return this.cardSuit;
    }

    public int getRank() {
        return this.cardRank;
    }

}
