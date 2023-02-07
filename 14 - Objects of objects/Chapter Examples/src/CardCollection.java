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

    /* Method that removes a Card from the end of the ArrayList and returns that Card object */
    public Card popCard() { // no parameters this time
        int i = cardArrList.size() - 1; // goes to the end of the ArrayList
        return cardArrList.remove(i); // returns the removed Card
    }

}
