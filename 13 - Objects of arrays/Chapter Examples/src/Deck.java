import java.util.Random;

public class Deck {
    private Card[] cardArr;

    /* Constructor that creates a deck with the size of n */
    public Deck(int n) {
        this.cardArr = new Card[n]; // sets size of deck
    }

    /* Constructor that creates a full 52 card deck */
    public Deck() {
        this.cardArr = new Card[52];
        int indexNum = 0;
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
            System.out.println(this.cardArr[i]);
        }
    }

    /* Method for shuffling deck */
    public void shuffleDeck() {
        for (int i = 0; i < this.cardArr.length; i++) {
            // choose a random number between i and length - 1
            int randomNum = randomInt(i, cardArr.length); // method that generates a random number
            // swap the ith card and the randomly-chosen card
            swapCards(i, randomNum); // method that swaps 2 cards at different indexes
        }
    }

    /* Method for creating a random number between two numbers */
    public int randomInt(int min, int max) {
        Random randOne = new Random(); // random object to create a random number between i and length - 1
        int randomNum = randOne.nextInt((max - 1 - min) + 1) + min;
        return randomNum;
    }

    /* Method for swapping 2 card's at different indexes */
    public void swapCards(int i, int newCardIndex) {
        Card tempCard = this.cardArr[i];
        this.cardArr[i] = cardArr[newCardIndex];
        cardArr[newCardIndex] = tempCard;
    }

    /* Method that finds the lowest value card in an array */
    public int indexLowest(int minNum, int maxNum) {
        int lowestCardIndex = Math.min(minNum, maxNum); // lowest number between the two
        for (int j = lowestCardIndex + 1; j < Math.max(minNum, maxNum); j++) { // .max - highest number between the two
            if (this.cardArr[lowestCardIndex].compareTo(this.cardArr[j]) == 1) {
                /*
                 * if the current card is lower than the one compared to it, replace
                 * lowestCardIndex with the compared card index (this.cardArr[j]).
                 */
                lowestCardIndex = j;
            }
        }
        return lowestCardIndex;
    }

    /* Method for putting the deck in original order */
    public void selectionSort() {
        for (int i = 0; i < this.cardArr.length; i++) {
            // find the lowest card at or to the right of i
            int indexLowestNum = indexLowest(i, this.cardArr.length);
            // swap the ith card and the lowest card found
            swapCards(i, indexLowestNum);
        }
    }

    /* Method for creating subdecks */
    public Deck subDeck(int lowNum, int highNum) {
        Deck subDeck = new Deck(highNum - lowNum + 1);
        for (int i = 0; i < subDeck.cardArr.length; i++) {
            subDeck.cardArr[i] = this.cardArr[lowNum + i]; // gets cards from current deck and adds them to subDeck
        }
        return subDeck;
    }

    /* Method that merges two decks */
    public static Deck mergeDecks(Deck deckOne, Deck deckTwo) {
        // create a new deck big enough for all the cards
        Deck mergedDeck = new Deck(deckOne.cardArr.length + deckTwo.cardArr.length);
        // use the index i to keep track of where we are at in
        int i = 0;
        // the first deck, and the index j for the second deck
        int j = 0;
        // the index k traverses the result deck
        for (int k = 0; k < mergedDeck.cardArr.length; k++) {
            // if d1 is empty, d2 wins
            if (deckOne.cardArr.length == 0) {
                mergedDeck = deckTwo;
            }
            // if d2 is empty, d1 wins
            else if (deckTwo.cardArr.length == 0) {
                mergedDeck = deckOne;
            } 
            // otherwise, compare the two cards
            else {
                // add the winner to the new deck at position k
                // increment either i or j
                if (deckOne.cardArr[k].compareTo(deckTwo.cardArr[k]) == 1) {
                    mergedDeck.cardArr[k] = deckOne.cardArr[i];
                    i++;
                } else if (deckOne.cardArr[k].compareTo(deckTwo.cardArr[k]) == -1) {
                    mergedDeck.cardArr[k] = deckTwo.cardArr[j];
                    j++;
                }
            }

        }
        // return the new deck
        return mergedDeck;
    }

}
