public class CardMain {

    public static void main(String[] args) {

        Card threeOfClubs = new Card(3, 0); // 3 of Clubs
        System.out.println(threeOfClubs.toString()); // using our own custom toString method to print attributes

        Card jackOfDiamonds = new Card(11, 1);
        System.out.println(jackOfDiamonds.toString()); // Jack of Diamonds

        Card queenOfHearts = new Card(12, 2);
        System.out.println(queenOfHearts.toString()); // Queen of Hearts

        /* Testing equals method */
        Card queenOfHeartsTest = new Card(12, 2); // another Queen of Hearts object to test equals method
        System.out.println(queenOfHearts.equals(queenOfHeartsTest)); // returns true
        System.out.println(queenOfHearts.equals(jackOfDiamonds)); // returns false

        /* Testing compareTo method */
        Card twoOfClubs = new Card(2, 0); // 2 of Clubs
        System.out.println(twoOfClubs.compareTo(threeOfClubs)); // returns -1 since twoOfClubs is less than threeOfClubs

        Card threeOfDiamonds = new Card(3, 1); // three of Diamonds
        System.out.println(threeOfDiamonds.compareTo(threeOfClubs)); // returns 1 threeOfDiamonds > threeOfClubs

        Card twoOfDiamonds = new Card(2, 1);
        System.out.println(twoOfDiamonds.compareTo(threeOfClubs));
        // returns 1 since twoOfDiamonds has a higher suit value than threeOfClubs
        System.out.println(threeOfDiamonds.compareTo(threeOfDiamonds)); // returns 0 since they have the same value

        /* Creating an Array of Cards */
        Card[] cardsArr = new Card[52];

        if (cardsArr[0] == null) {
            System.out.println("No Card Yet!");
        }

        /* Filling in the Array with a nested for loop */
        int indexNum = 0;
        for (int suitNum = 0; suitNum <= 3; suitNum++) {
            for (int rankNum = 1; rankNum <= 13; rankNum++) {
                cardsArr[indexNum] = new Card(rankNum, suitNum);
                indexNum++;
            }
        }

        /* Printing our cardsArr */
        printDeck(cardsArr);

        /* Finding a certain card in cardsArr */
        System.out.println(searchDeck(cardsArr, threeOfClubs)); // 2
        System.out.println(searchDeck(cardsArr, twoOfDiamonds)); // 14

        /* Finding a certain card in the array */
        Card binaryTestOne = new Card(11, 0); // Jack of Clubs
        System.out.println(binarySearch(cardsArr, binaryTestOne)); // index of 10
        Card binaryTestTwo = new Card(15, 1); // 15 of Diamonds
        System.out.println(binarySearch(cardsArr, binaryTestTwo)); // -1, does not exist

    }

    /* Method that prints the contents of a card arrray */
    public static void printDeck(Card[] cardsArr) { // stores Card array in paraCard
        for (int i = 0; i < cardsArr.length; i++) { // for loop that prints each element in the array
            System.out.println(cardsArr[i]);
        }
    }

    /*
     * Method that searches for a certain card in the cardsArr, uses sequential
     * search
     */
    public static int searchDeck(Card[] cardsArr, Card targetCard) {
        for (int i = 0; i < cardsArr.length; i++) {
            if (cardsArr[i].equals(targetCard)) {
                return i; // returns index of that card
            }
        }
        return -1; // returns -1 of no matches are found
    }

    /* Method that searches for a card using binary search */
    // DONE: Finish binarySearch method
    public static int binarySearch(Card[] cardsArr, Card targetCard) {
        int lowNum = 0; // min number
        int highNum = cardsArr.length - 1; // max number
        while (lowNum <= highNum) {
            System.out.println(lowNum + ", " + highNum);
            /* Step 1 */
            int midNum = (lowNum + highNum) / 2;
            int currCard = cardsArr[midNum].compareTo(targetCard);
            /* Step 2 */
            if (currCard == 0) { // if there are no differences, same card
                return midNum; // returns the index
            }
            /* Step 3 */
            else if (currCard < 0) { // if the current card is less than target
                lowNum = midNum + 1; // goes to the right of the array
            }
            /* Step 4 */
            else { // if the current card is higher than target
                highNum = midNum - 1; // goes to the left of the array
            }
        }
        return -1; // if not matches are found
    }

}
