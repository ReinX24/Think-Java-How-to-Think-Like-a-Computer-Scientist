public class Card {

    String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
    String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    private final int cardRank;
    private final int cardSuit;

    /* Constructor for Card objects */
    public Card(int suit, int rank) {
        this.cardSuit = suit;
        this.cardRank = rank;
    }

    /* toString method for Card objects */
    public String toString() {
        return RANKS[this.cardRank] + " of " + SUITS[this.cardSuit];
    }

    /* equals method for Card objects */
    public boolean equals(Card comparedCard) {
        return this.cardSuit == comparedCard.cardSuit && this.cardRank == comparedCard.cardRank;
    }

    /* Method for comparing the values of two cards */
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
        return 0; // if no differences were found
    }

    /* Getters for cardRank & cardSuit */
    public String getRank() {
        return RANKS[this.cardRank];
    }

    public String getSuit() {
        return SUITS[this.cardSuit];
    }

}
