public class Card {

    /* Array that consists of the different suits */
    public static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

    /* Array that consists of the different ranks */
    public static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
            "King" };

    /*
     * We used static since these will be used by all objects made using the Card
     * class and final none of the elements in these arrays are going to be changed
     * in the future.
     * 
     * Instead of them being instantiated in the toString method, they are now
     * instantiated for all objects which makes them class variables.
     */

    private int rank;
    /*
     * Ace -> 1
     * Jack -> 11
     * Queen -> 12
     * King -> 13
     */
    private int suit;
    /*
     * Clubs -> 0
     * Diamonds -> 1
     * Hearts -> 2
     * Spades -> 3
     */

    /* Contructor for our card */
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /* Custom toString method for our Card objects */
    public String toString() {

        /* Stores card attributes in a String and returns the String */
        String cardString = RANKS[this.rank] + " of " + SUITS[this.suit];
        return cardString;

    }

    /*  */

}
