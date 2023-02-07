import java.util.ArrayList;

public class CardCollection {

    private String labelStr;
    private ArrayList<Card> cardArrList; // ArrayList that contains Card objects

    /* Constructor for CardCollection */
    public CardCollection(String labelStr) {
        this.labelStr = labelStr; // assigns a String for labelStr
        this.cardArrList = new ArrayList<Card>(); // completes the instantiation of ArrayList
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
    // TODO: swapCards method

}
