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

    /* Method for printing deck attributes */
    public void printDeck() {
        for (int i = 0; i < this.cardArr.length; i++) {
            System.out.println(cardArr[i].toString());
        }
    }

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

    /* Method that generates a random number between two numbers (including both) */
    public int randomInt(int min, int max) {
        Random randOne = new Random(); // Random object to generate random number
        return randOne.nextInt((max - min) + 1) + min; // generates a random number between min & max (inclusive)
    }

    /* Method that swaps two cards from each other */
    public void swapCard(int i, int newCardIndex) {
        Card tempCard = this.cardArr[i];
        this.cardArr[i] = this.cardArr[newCardIndex];
        this.cardArr[newCardIndex] = tempCard;
    }

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

    /* Merges two decks and sorts them from lowest to highest */
    public static Deck mergeDecks(Deck deckOne, Deck deckTwo) {
        /* Create 2 card arrays that holds each deck */
        Card[] deckOneCards = deckOne.cardArr;
        Card[] deckTwoCards = deckTwo.cardArr;
        /* Create variables that holds each deck length */
        int deckOneLength = deckOneCards.length;
        int deckTwoLegth = deckTwoCards.length;
        /* Create an array that will store the sorted array */
        Card[] sortedCardArr = new Card[deckOneLength + deckTwoLegth];
        /* Create index i & j to be used to track first and second deck indexes */
        int i = 0;
        int j = 0;
        /* If the first deck is empty, second deck is the returned deck */
        if (deckOneLength == 0) {
            return deckTwo;
        }
        /* If the second deck is empty, return the first deck */
        else if (deckTwoLegth == 0) {
            return deckOne;
        }
        /*
         * If both have elements within, sort card arrays and add them to sortedCardArr
         */
        else {
            for (int k = 0; k < sortedCardArr.length; k++) {
                /*
                 * if the deckOne card is less than the iterated card in deckTwo, place deckOne
                 * card in sortedCardArr
                 */
                if (j >= deckTwoCards.length || i < deckOneCards.length && deckOneCards[i].compareTo(deckTwoCards[j]) <= 0) {
                    sortedCardArr[k] = deckOneCards[i];
                    i++;
                } else {
                    sortedCardArr[k] = deckOneCards[j];
                    j++;
                }
            }
        }
        Deck sortedMergedDeck = new Deck(sortedCardArr.length); // Deck object to hold sortedMergedDeck
        sortedMergedDeck.cardArr = sortedCardArr; // replaces cards in sortedMergedDeck
        /* Returning the new Deck */
        return sortedMergedDeck;

    }

}
