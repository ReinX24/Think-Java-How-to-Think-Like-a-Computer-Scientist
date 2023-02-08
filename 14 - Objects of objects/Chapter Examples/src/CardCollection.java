import java.util.ArrayList;
import java.util.Random;

public class CardCollection {

    private String labelStr;
    private ArrayList<Card> cardArrList; // ArrayList that contains Card objects

    /* Constructor for CardCollection */
    public CardCollection(String labelStr) {
        this.labelStr = labelStr; // assigns a String for labelStr
        this.cardArrList = new ArrayList<>(); // completes the instantiation of ArrayList
    }

    /* Method that adds a Card to the ArrayList */
    public void addCard(Card paraCard) {
        cardArrList.add(paraCard);
    }

    /* Method that removes a Card from ArrayList and returns that Card object */
    public Card popCard(int cardIndex) {
        return cardArrList.remove(cardIndex);
    }

    /*
     * Method that removes a Card from the end of the ArrayList and returns that
     * Card object
     */
    public Card popCard() { // no parameters this time
        int i = cardArrList.size() - 1; // goes to the end of the ArrayList
        return cardArrList.remove(i); // returns the removed Card
    }

    /* Method that returns the size of the ArrayList in a CardCollection object */
    public int size() {
        return cardArrList.size(); // returns the size of the array list
    }

    /* Method that checks if the ArrayList is empty or not */
    public boolean empty() {
        return cardArrList.size() == 0; // returns either true or false
    }

    /*
     * Removes cards from a CardCollection and adds to the CardCollection in the
     * parameter
     */
    public void deal(CardCollection cardCol, int n) {
        /* Removes n card from a CardCollection and adds same amount to cardCol */
        for (int i = 0; i < n; i++) {
            Card removedCard = popCard(); // removes a card from the object it is invoked on
            cardCol.addCard(removedCard); // adds removed card to cardCol
        }
    }

    /* Removes all cards from a CardCollection and adds them to a new one */
    public void dealAll(CardCollection cardCol) {
        int n = size(); // size of this.cardArrList
        deal(cardCol, n); // moves all elements of cardArrList to cardCol
    }

    /* Getter for an element in the ArrayList within CardCollection */
    public Card getCard(int i) {
        return cardArrList.get(i); // gets Card at index i
    }

    /* Getter for the last card in ArrayList, does not remove it */
    public Card lastCard() {
        Card lastCard = cardArrList.get(size() - 1);
        return lastCard;
    }

    /* Method that swaps the places of two cards */
    // DONE: swapCards method
    public void swapCards(int i, int j) {
        /* Place first card in a temporary card holder */
        Card tempCard = cardArrList.get(i);
        /* Replace first card with second card */
        cardArrList.set(i, cardArrList.get(j));
        /* Replace second card with tempCard */
        cardArrList.set(j, tempCard);
    }

    /* Method that shuffles the cards in the cardArrList */
    public void shuffle() {
        /* Creating a Random object */
        Random random = new Random();
        /* Looping from cardArrList, starts at the end */
        for (int i = size() - 1; i > 0; i--) {
            int randomNum = random.nextInt(i); // generates a random number >= 0 but < i
            swapCards(i, randomNum); // swaps card at the end with a random card to the left
        }
    }

    /* Getter for CardCollection label */
    public String getLabel() {
        return this.labelStr;
    }

}
