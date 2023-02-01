public class CardMain {

    public static void main(String[] args) {

        System.out.println("Arrays of Objects Exercises");

        Card aceOfClubs = new Card(0, 1);
        System.out.println(aceOfClubs.toString()); // Ace of Clubs
        Card equalsTest = new Card(0, 1);
        System.out.println(aceOfClubs.equals(equalsTest)); // true

        /* Testing compareTo method */
        Card twoOfClubs = new Card(0, 2);
        System.out.println(aceOfClubs.compareTo(twoOfClubs)); // returns -1
        Card twoOfDiamonds = new Card(1, 2);
        System.out.println(twoOfDiamonds.compareTo(aceOfClubs)); // 1

        /* Creating a card array with cards */
        Card[] cardArr = makeDeck(); // creates a deck using a method

        /* Printing the array using a method */
        printDeck(cardArr);

        /* Using compareTo with Aces > Kings */
        System.out.println("[toString & compareTo]");
        Card kingOfClubs = new Card(0, 13);
        System.out.println(aceOfClubs.toString());
        System.out.println(kingOfClubs.toString());
        System.out.println(aceOfClubs.compareTo(kingOfClubs)); // returns 1
        System.out.println(kingOfClubs.compareTo(aceOfClubs)); // -1
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
        Card[] handOne = { aceOfClubs, twoOfClubs, threeOfClubs, kingOfClubs, fourOfClubs, threeOfDiamonds };
        System.out.println(hasFlush(handOne)); // true
        Card[] handTwo = { aceOfClubs, twoOfClubs, threeOfClubs, kingOfClubs, twoOfDiamonds, threeOfDiamonds };
        System.out.println(hasFlush(handTwo)); // false

        /* Using sequentialSearch */
        System.out.println(sequentialSearch(cardArr, threeOfDiamonds)); // 15, index of threeOfDiamonds
        Card nonCard = new Card(5, 15);
        System.out.println(sequentialSearch(cardArr, nonCard)); // -1
        /* binarySearch */
        System.out.println(binarySearch(cardArr, twoOfClubs)); // 1
        /* binarySearchRecursive */
        System.out.println(binarySearchRecursive(cardArr, threeOfClubs, 0, cardArr.length - 1)); // 2

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

    /* Sequential search */
    public static int sequentialSearch(Card[] cardArr, Card targetCard) {
        for (int i = 0; i < cardArr.length; i++) {
            if (cardArr[i].equals(targetCard)) {
                return i;
            }
        }
        return -1;
    }

    /* Binary search */
    public static int binarySearch(Card[] cardArr, Card targetCard) {
        int lowNum = 0;
        int highNum = cardArr.length - 1;
        while (lowNum <= highNum) {
            int midNum = (lowNum + highNum) / 2;
            int compareResult = cardArr[midNum].compareTo(targetCard);

            if (compareResult == 0) { // if matches targetCard
                return midNum;
            } else if (compareResult < 0) { // if lower than targetCard
                lowNum = midNum + 1;
            } else { // if higher than targetCard
                highNum = midNum - 1;
            }
        }
        return -1; // if no matches are found
    }

    /* Binary search recursive */
    public static int binarySearchRecursive(Card[] cardArr, Card targetCard, int lowNum, int highNum) {

        if (highNum < lowNum) {
            return -1;
        }
        
        int midNum = (lowNum + highNum) / 2; // step 1
        int currCard = cardArr[midNum].compareTo(targetCard);

        if (currCard == 0) { // step 2
            return midNum;
        } else if (currCard < 0) { // step 3
            return binarySearchRecursive(cardArr, targetCard, midNum + 1, highNum);
        } else { // step 4
            return binarySearchRecursive(cardArr, targetCard, lowNum, midNum - 1);
        }

    }

}