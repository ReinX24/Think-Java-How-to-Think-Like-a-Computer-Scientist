public class Card {

    String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
    String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    private final int cardRank;
    private final int cardSuit;

    public Card(int suit, int rank) {
        this.cardRank = rank;
        this.cardSuit = suit;
    }

    public String toString() {
        return RANKS[this.cardRank] + " of " + SUITS[this.cardSuit];
    }

    public boolean equals(Card paraCard) {
        return this.cardSuit == paraCard.cardSuit && this.cardRank == paraCard.cardRank;
    }

    public int comapreTo(Card paraCard) {
        if (this.cardSuit < paraCard.cardSuit) {
            return -1;
        }
        if (this.cardSuit > paraCard.cardSuit) {
            return 1;
        }
        if (this.cardRank < paraCard.cardRank) {
            return -1;
        }
        if (this.cardRank > paraCard.cardRank) {
            return 1;
        }
        return 0; // return 0 if no differences
    }

}
