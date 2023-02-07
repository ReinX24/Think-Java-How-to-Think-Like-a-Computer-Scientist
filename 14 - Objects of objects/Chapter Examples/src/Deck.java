import java.util.Random;

public class Deck {

    Card[] cardArr;

    /* Creates a deck of 52 cards */
    public Deck() {
        cardArr = new Card[52];
        /* Filling the deck */
        int indexNum = 0;
        for (int suitNum = 0; suitNum <= 3; suitNum++) {
            for (int rankNum = 1; rankNum <= 13; rankNum++) {
                /* Creating Card objects for each array index */
                cardArr[indexNum] = new Card(suitNum, rankNum);
                indexNum++;
            }
        }
    }

    /* Creates a deck with n cards */
    public Deck(int n) {
        this.cardArr = new Card[n];
    }

    /* toString method for the Deck class */
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < this.cardArr.length; i++) {
            strBuilder.append(this.cardArr[i].toString() + "\n");
        }
        String strDeck = strBuilder.toString(); // converts StringBuilder to a String
        return strDeck;
    }

    /* Print method for deck */
    public void printDeck() {
        for (int i = 0; i < this.cardArr.length; i++) {
            System.out.println(this.cardArr[i].toString());
        }
    }

    /* Method for shuffling Deck */
    public void shuffleDeck() {
        /* Iterate through the Deck */
        for (int i = 0; i < this.cardArr.length; i++) {
            /* Choose a random number between i & cardArr.length - 1 */
            int randomInt = randomInt(i, this.cardArr.length - 1);
            /* Swap current card with the random card that the randomInt falls on */
            swapCards(i, randomInt);
        }
    }

    /* Method for generating a random number between 2 numbers (inclusive) */
    public int randomInt(int minVal, int maxVal) {
        Random randObject = new Random();
        /* minVal + random number between (maxVal - minVal + 1) */
        int randomInt = minVal + randObject.nextInt(maxVal - minVal + 1);
        return randomInt;
    }

    /* Swaps 2 card using their indexes */
    public void swapCards(int cardOneIndex, int cardTwoIndex) {
        Card tempCard = this.cardArr[cardOneIndex];
        this.cardArr[cardOneIndex] = this.cardArr[cardTwoIndex];
        this.cardArr[cardTwoIndex] = tempCard;
    }

    /* Method that finds the index of the lowest value card in the array */
    public int lowestIndex(int startNum, int endNum) {
        int lowestCardIndex = Math.min(startNum, endNum); // stores the smallest of the two numbers
        /* Looping through cardArr starting from lowestCardIndex */
        for (int i = lowestCardIndex + 1; i < Math.max(startNum, endNum); i++) {
            if (this.cardArr[lowestCardIndex].compareTo(this.cardArr[i]) == 1) {
                lowestCardIndex = i; // replaces lowestCardIndex with a new value (new lowest card index)
            }
        }
        return lowestCardIndex;
    }

    /* Method that sorts the cardArr from lowest to highest */
    public void selectionSort() {
        for (int i = 0; i < this.cardArr.length; i++) {
            /* Find the lowest value card within the range of 2 indexes (inclusive) */
            int lowestCardValueIndex = lowestIndex(i, this.cardArr.length);
            /* Swap the current card with the lowest card in the cardArr */
            swapCards(i, lowestCardValueIndex);
        }
    }

    /* Method that creates a sub deck between 2 indexes (inclusive) */
    public Deck subDeck(int startIndex, int endIndex) {
        /* Creating a Deck object with a specific size as the subDeck */
        Deck subDeck = new Deck(endIndex - startIndex + 1);
        /* Adding Cards to subDeck, iterates through subDeck */
        for (int i = 0; i < subDeck.cardArr.length; i++) {
            subDeck.cardArr[i] = this.cardArr[startIndex + i]; // we start from startIndex + i in cardArr
        }
        return subDeck;
    }

    /* Merge two decks together and sort them */
    public static Deck mergeSort(Deck deckOne, Deck deckTwo) {
        /* Array that will store the cards of the Deck */
        Card[] sortedCardArr = new Card[deckOne.cardArr.length + deckTwo.cardArr.length];
        /* i & j indexes to keep track of indexes in our decks */
        int i = 0;
        int j = 0;
        /* if deckOne is empty, return deckTwo. */
        if (deckOne.cardArr.length == 0) {
            return deckTwo;
        }
        /* if deckTwo is emptya, return deckOne */
        else if (deckTwo.cardArr.length == 0) {
            return deckOne;
        }
        /* if both deckOne & deckTwo have elements or cards within them */
        else {
            for (int k = 0; k < sortedCardArr.length; k++) {
                if(j >= deckTwo.cardArr.length || i < deckOne.cardArr.length && deckOne.cardArr[i].compareTo(deckTwo.cardArr[j]) <= 0) {
                    sortedCardArr[k] = deckOne.cardArr[i];
                    i++;
                } else {
                    sortedCardArr[k] = deckTwo.cardArr[j];
                    j++;
                }
            }
        }
        Deck mergeSortDeck = new Deck();
        mergeSortDeck.cardArr = sortedCardArr;
        return mergeSortDeck;
    }

    /* mergeSort but uses recursion */
    public Deck mergeSortRecursive() {
        int deckLength = this.cardArr.length;
        if (deckLength == 0 || deckLength == 1) {
            return this;
        } else {
            int midNumHalf = this.cardArr.length / 2;
            Deck deckOne = subDeck(0, midNumHalf - 1).mergeSortRecursive();
            Deck deckTwo = subDeck(midNumHalf, this.cardArr.length - 1).mergeSortRecursive();
            return mergeSort(deckOne, deckTwo);
        }
    }

    /* Sorts Cards from highest to lowest value by swapping their positions */
    public void insertionSort() {
        for(int i = 0; i < this.cardArr.length - 1; i++) {
            for(int j = i + 1; j < this.cardArr.length; j++) {
                /* if the first card is greater than the second card */
                if(this.cardArr[i].compareTo(this.cardArr[j]) == 1) {
                    swapCards(i, j);
                }
            }
        }
    }

}
