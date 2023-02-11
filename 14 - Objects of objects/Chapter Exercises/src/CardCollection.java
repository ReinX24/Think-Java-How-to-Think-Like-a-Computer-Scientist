import java.util.ArrayList;

public class CardCollection {

    private String labelStr;
    private ArrayList<Card> cardList; // array list that stores Card objects

    /* Constructor for CardCollection */
    public CardCollection(String labelStr) {
        this.labelStr = labelStr;
        this.cardList = new ArrayList<>();
    }

    /* Method that adds cards to the Array List */
    public void addCard(Card addedCard) {
        cardList.add(addedCard);
    }

    /* Method that removes a Card from the Array List and returns that Card */
    public Card popCard(int cardIndex) {
        return cardList.remove(cardIndex); // removes & returns a Card at cardIndex
    }

    /* Removes a Card from the end of the Array List and returns said Card */
    public Card popCard() {
        int endCard = cardList.size() - 1; // gets index of the last Card in cardList
        return cardList.remove(endCard); // removes the Card and returns it
    }

    /* Method that returns the size of the array list of the object it is invoked on */
    public int size() {
        return cardList.size();
    }

    /* Method that checks if an array list is empty or not */
    public boolean isEmpty() {
        return cardList.size() == 0;
    }

    /* Remove Cards from this object to another object of the same type */
    public void dealCards(CardCollection newCardCollection, int cardAmount) {
        for (int i = 0; i < cardAmount; i++) {
            Card removedCard = popCard(); // removes a Card from the object it is invoked on
            newCardCollection.addCard(removedCard); // adds removedCard to newCardCol
        }
    }

    /* Removes all Cards from this object and puts them all another one */
    public void dealAllCards(CardCollection newCardCollection) {
        int currentListSize = size();
        dealCards(newCardCollection, currentListSize);
    }

}
