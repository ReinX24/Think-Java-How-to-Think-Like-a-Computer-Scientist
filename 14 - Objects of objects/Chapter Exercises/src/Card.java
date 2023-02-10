public class Card implements CardMethods {

    String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
    String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    private final int cardRank;
    private final int cardSuit;

    public Card(int suitNum, int rankNum) {
        // DONE Auto-generated method stub
        this.cardSuit = suitNum;
        this.cardRank = rankNum;
    }

    @Override
    public boolean equals(Card comparedCard) {
        // DONE Auto-generated method stub
        return this.cardSuit == comparedCard.cardSuit && this.cardRank == comparedCard.cardRank;
    }

    @Override
    public int compareTo(Card comparedCard) {
        // DONE Auto-generated method stub
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

    @Override
    public int getRank() {
        // DONE Auto-generated method stub
        return this.cardRank;
    }

    @Override
    public String getSuit() {
        // DONE Auto-generated method stub
        return SUITS[this.cardSuit];
    }

    @Override
    public String toStringCard() {
        // DONE Auto-generated method stub
        return this.cardRank + " of " + this.getSuit();
    }

}
