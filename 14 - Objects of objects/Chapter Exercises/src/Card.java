public class Card {

    String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
    String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    private final int cardRank;
    private final int cardSuit;

    /* Constructor for Card objects */
    public Card(int suitNum, int rankNum) {
        this.cardSuit = suitNum;
        this.cardRank = rankNum;
    }

    /* Method that checks if two Card objects are equal */
    public boolean equals(Card comparedCard) {
        return this.cardSuit == comparedCard.cardSuit && this.cardRank == comparedCard.cardRank;
    }

    /* Method that compares two Cards and checks which one is of higher value */
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
        return 0;
    }

    /* Method that returns the numerical value of the Card's rank */
    public int getRank() {
        return this.cardRank;
    }

    /* Method that returns the String value of the Card's suit */
    public String getSuit() {
        // DONE Auto-generated method stub
        return SUITS[this.cardSuit];
    }

    /* A toString method that prints a Card's rank */
    public String toString() {
        // DONE Auto-generated method stub
        return RANKS[this.cardRank] + " of " + SUITS[this.cardSuit];
    }

}
