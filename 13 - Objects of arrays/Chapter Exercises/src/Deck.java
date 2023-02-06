import java.util.Random;

public class Deck {

    /* Array that will contain our deck elements */
    private Card[] cardArr;

    /* Constructor that creates a deck with the size of n */
    public Deck(int n) {
        this.cardArr = new Card[n]; // sets cardArr length
    }

    /* Constructor that creates a full 52 card deck */
    public Deck() {
        this.cardArr = new Card[52]; // creates a cardArr of 52 elements
        int indexNum = 0; // indexNum uses
        for (int suitNum = 0; suitNum <= 3; suitNum++) {
            for (int rankNum = 1; rankNum <= 13; rankNum++) {
                cardArr[indexNum] = new Card(suitNum, rankNum);
                indexNum++;
            }
        }
    }

    // DONE: Create a toString method for the Deck class
    /*
     * Exercise 13.5 Write a toString method for the Deck class. It should return
     * a single string that represents the cards in the deck. When it’s printed,
     * this string should display the same results as the print method in Section
     * 13.1. Hint: You can use the + operator to concatenate strings, but it is not
     * very efficient. Consider using java.lang.StringBuilder; you can find the
     * documentation by doing a web search for “Java StringBuilder”.
     */

    public String toString() {
        StringBuilder deckStringBuilder = new StringBuilder();
        /* Adding each String to our StringBuilder object */
        for(int i = 0; i < this.cardArr.length; i++) {
            deckStringBuilder.append(this.cardArr[i] + "\n");
        }
        return deckStringBuilder.toString(); // converts StringBuilder object to String
    }

    /* Method for printing deck attributes */
    public void printDeck() {
        for (int i = 0; i < this.cardArr.length; i++) {
            System.out.println(this.cardArr[i]);
        }
    }

    /*
     * Exercise 13.2 The goal of this exercise is to implement the shuffling algo-
     * rithm from this chapter.
     */

    /*
     * 1. In the repository for this book, you should find a file called Deck.java
     * that contains the code in this chapter. Check that you can compile it in
     * your environment.
     */

    /* 4. Write a method called shuffle that uses the algorithm in Section 13.2. */

    /* Method for shuffling deck */
    public void shuffleDeck() {
        /* Iterate through the Deck using a loop */
        for (int i = 0; i < this.cardArr.length; i++) {
            /* Choose a random number between i and cardArr.length - 1 */
            int randomNum = randomInt(i, cardArr.length - 1);
            /* Swap the card at index i with the randomly chosen card */
            swapCard(i, randomNum);
        }
    }

    /*
     * 2. Add a Deck method called randomInt that takes two integers, low and
     * high, and returns a random integer between low and high, including
     * both. You can use the nextInt provided by java.util.Random, which
     * we saw in Section 8.7. But you should avoid creating a Random object
     * every time randomInt is invoked.
     */

    /* Method that generates a random number between two numbers (including both) */
    public int randomInt(int min, int max) {
        Random randOne = new Random(); // Random object to generate random number
        return randOne.nextInt((max - min) + 1) + min; // generates a random number between min & max (inclusive)
    }

    /*
     * 3. Write a method called swapCards that takes two indexes and swaps the
     * cards at the given locations.
     */

    /* Method that swaps two cards from each other */
    public void swapCard(int i, int newCardIndex) {
        Card tempCard = this.cardArr[i];
        this.cardArr[i] = this.cardArr[newCardIndex];
        this.cardArr[newCardIndex] = tempCard;
    }

    /*
     * Exercise 13.3 The goal of this exercise is to implement the sorting algo-
     * rithms from this chapter. Use the Deck.java file from the previous exercise
     * (or create a new one from scratch).
     */

    /*
     * 1. Write a method called indexLowest that uses the compareCard method
     * to find the lowest card in a given range of the deck (from lowIndex to
     * highIndex, including both).
     */

    /* Method that finds the index of the lowest value card in the array */
    public int indexLowest(int minNum, int maxNum) {
        int lowestCardIndex = Math.min(minNum, maxNum);
        for (int i = lowestCardIndex + 1; i < Math.max(minNum, maxNum); i++) {
            /*
             * If the current card has a higher value than the compared card, replace index
             */
            if (this.cardArr[lowestCardIndex].compareTo(this.cardArr[i]) == 1) {
                lowestCardIndex = i;
            }
        }
        return lowestCardIndex;
    }

    /*
     * 2. Write a method called selectionSort that implements the selection sort
     * algorithm in Section 13.3.
     */

    /* Method that sorts the cardArr from lowest to highest */
    public void selectionSort() {
        for (int i = 0; i < this.cardArr.length; i++) {
            /* Find the index of the lowest card in the array */
            int lowestCardIndex = indexLowest(i, this.cardArr.length);
            /* Swap the card at i to the lowest card found */
            swapCard(i, lowestCardIndex);
        }
    }

    /* Method for creating subdecks */
    public Deck subDeck(int lowNum, int highNum) {
        Deck subDeck = new Deck(highNum - lowNum + 1); // where we will store our subDeck
        for (int i = 0; i < subDeck.cardArr.length; i++) { // iterates through the subDeck
            subDeck.cardArr[i] = this.cardArr[lowNum + i]; // gets a card from the original array
        }
        return subDeck;
    }

    /*
     * 3. Using the pseudocode in Section 13.4, write the method called merge.
     * The best way to test it is to build and shuffle a deck. Then use subdeck
     * to form two small subdecks, and use selection sort to sort them. Then
     * you can pass the two halves to merge to see if it works.
     */

    /* Merges two decks and sorts them from lowest to highest */
    public static Deck mergeDecks(Deck deckOne, Deck deckTwo) {
        /* Create 2 card arrays that holds each deck */
        Card[] deckOneCardArr = deckOne.cardArr;
        Card[] deckTwoCardArr = deckTwo.cardArr;
        /* Create variables that holds each deck length */
        int deckOneLength = deckOneCardArr.length;
        int deckTwoLength = deckTwoCardArr.length;
        /* Create an array that will store the sorted array */
        Card[] sortedArr = new Card[deckOneLength + deckTwoLength];
        /* Create index i & j to be used to track first and second deck indexes */
        int i = 0;
        int j = 0;
        /* If the first deck is empty, second deck is the returned deck */
        if (deckOneLength == 0) {
            sortedArr = deckTwoCardArr;
        }
        /* If the second deck is empty, return the first deck */
        else if (deckTwoLength == 0) {
            sortedArr = deckOneCardArr;
        }
        /*
         * If both have elements within, sort card arrays and add them to sortedCardArr
         */
        else {
            for (int k = 0; k < sortedArr.length; k++) {
                // add the winner to the new deck at position k
                // increment either i or j
                /* If j is >= cardTwoArr length and deckOne card is less than deckTwo card */
                if (j >= deckTwoCardArr.length
                        || i < deckOneCardArr.length && deckOneCardArr[i].compareTo(deckTwoCardArr[j]) <= 0) {
                    sortedArr[k] = deckOneCardArr[i]; // since the deckOne card is lower, add it first to the sortedArr
                    i++;
                } else {
                    sortedArr[k] = deckTwoCardArr[j];
                    j++;
                }
            }
        }
        Deck sortedMergedDeck = new Deck(deckOneLength + deckTwoLength); // Deck object to hold sortedMergedDeck
        sortedMergedDeck.cardArr = sortedArr; // replaces cards in sortedMergedDeck
        /* Returning the new Deck */
        return sortedMergedDeck;

    }

    /*
     * 4. Write the simple version of mergeSort, the one that divides the deck
     * in half, uses selectionSort to sort the two halves, and uses merge to
     * create a new, sorted deck.
     */

    /* Method that is similar to mergeSort but uses recursion */
    public Deck mergeSortRecursive() {
        int deckLength = this.cardArr.length;
        if (deckLength == 0 || deckLength == 1) {
            return this;
        } else {
            // DONE: Recursive version of this method
            // divide the deck into 2 subdecks
            int midNum = this.cardArr.length / 2; // middle point of our cardArr
            /* First half (subDeck) of the cardArr then call current method */
            // Deck deckOne = subDeck(0, midNum - 1);
            // deckOne.selectionSort();
            /* Recursive version */
            Deck deckOne = subDeck(0, midNum - 1).mergeSortRecursive();
            /* Second half (subDeck) if the cardArr then call current method */
            // Deck deckTwo = subDeck(midNum, this.cardArr.length - 1);
            // deckTwo.selectionSort();
            /* Recursive version */
            Deck deckTwo = subDeck(midNum, this.cardArr.length - 1).mergeSortRecursive();
            /* Return mergedDecks deck */
            return mergeDecks(deckOne, deckTwo);
        }
    }

    /*
     * Exercise 13.4 The goal of this exercise is to practice top-down program-
     * ming by implementing “insertion sort”. Read about insertion sort at http:
     * //www.sorting-algorithms.com/insertion-sort. Write a method named
     * insertionSort that implements this algorithm.
     */

    /*
     * Insertion sorts sorts the objects from lowest to highest value by replacing
     * their positions
     */
    public void insertionSort() {
        for (int i = 0; i < this.cardArr.length - 1; i++) {
            for (int j = i + 1; j < this.cardArr.length; j++) {
                /*
                 * If the card at the left side of the array has a higher value than the right
                 * one, swap places
                 */
                if (this.cardArr[i].compareTo(this.cardArr[j]) == 1) {
                    swapCard(i, j);
                }
            }
        }
    }

}
