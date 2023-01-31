public class CardMain {

    public static void main(String[] args) {

        System.out.println("Arrays of Objects Exercises");

        Card aceOfClubs = new Card(0, 1);
        System.out.println(aceOfClubs.toString()); // Ace of Clubs
        Card equalsTest = new Card(0, 1);
        System.out.println(aceOfClubs.equals(equalsTest)); // true

        /* Testing compareTo method */
        Card twoOfClubs = new Card(0, 2);
        System.out.println(aceOfClubs.comapreTo(twoOfClubs)); // returns -1
        Card twoOfDiamonds = new Card(1, 2);
        System.out.println(twoOfDiamonds.comapreTo(aceOfClubs)); // 1

        /* Creating a card array with cards */
        Card[] cardArr = makeDeck(); // creates a deck using a method

        /* Printing the array using a method */
        printDeck(cardArr);

        /* Using compareTo with Aces > Kings */
        System.out.println("[toString & compareTo]");
        Card kingOfClubs = new Card(0, 13);
        System.out.println(aceOfClubs.toString());
        System.out.println(kingOfClubs.toString());
        System.out.println(aceOfClubs.comapreTo(kingOfClubs)); // returns 1
        System.out.println(kingOfClubs.comapreTo(aceOfClubs)); // -1
        System.out.println("[Suit Histogram]");

        /* Using suitHist */
        int[] suitHist = suitHist(cardArr);
        for (int i : suitHist) {
            System.out.println(i);
        }
        
        /* Using hasFlust */
        System.out.println("[hasFlush method]");
        System.out.println(hasFlush(cardArr)); // true
        Card threeOfClubs = new Card(0, 3);
        Card fourOfClubs = new Card(0, 4);
        Card threeOfDiamonds = new Card(1, 3);
        Card[] handOne = {aceOfClubs, twoOfClubs, threeOfClubs, kingOfClubs, fourOfClubs, threeOfDiamonds};
        System.out.println(hasFlush(handOne)); // true
        Card[] handTwo = {aceOfClubs, twoOfClubs, threeOfClubs, kingOfClubs, twoOfDiamonds, threeOfDiamonds};
        System.out.println(hasFlush(handTwo)); // false

    }

    /* Method that prints a Card Array */
    public static void printDeck(Card[] cardArr) {
        for (int i = 0; i < cardArr.length; i++) {
            System.out.println(cardArr[i].toString());
        }
    }

    /*
     * Exercise 12.1 Encapsulate the deck-building code from Section 12.6 in
     * a method called makeDeck that takes no parameters and returns a fully-
     * populated array of Cards.
     */
    public static Card[] makeDeck() {
        int indexNum = 0;
        Card[] cardArr = new Card[52];
        for (int suitNum = 0; suitNum <= 3; suitNum++) {
            for (int rankNum = 1; rankNum <= 13; rankNum++) {
                cardArr[indexNum] = new Card(suitNum, rankNum);
                indexNum++;
            }
        }
        return cardArr;
    }

    /*
     * Exercise 12.3 In Poker a “flush” is a hand that contains five or more cards
     * of the same suit. A hand can contain any number of cards.
     */

    /*
     * 1. Write a method called suitHist that takes an array of cards as a pa-
     * rameter and that returns a histogram of the suits in the hand. Your
     * solution should only traverse the array once.
     */
    public static int[] suitHist(Card[] cardArr) {
        int[] suitArr = new int[4];
        for (int i = 0; i < cardArr.length; i++) {
            switch (cardArr[i].getSuit()) {
                case 0:
                    suitArr[0]++;
                    break;
                case 1:
                    suitArr[1]++;
                    break;
                case 2:
                    suitArr[2]++;
                    break;
                case 3:
                    suitArr[3]++;
                    break;
            }
        }
        return suitArr;
    }

    /*
     * 2. Write a method called hasFlush that takes an array of cards as a param-
     * eter and returns true if the hand contains a flush (and false otherwise).
     */
    public static boolean hasFlush(Card[] cardArr) {
        int[] suitArr = suitHist(cardArr);
        for (int i = 0; i < suitArr.length; i++) {
            if (suitArr[i] >= 5) {
                return true;
            }
        }
        return false;
    }

}