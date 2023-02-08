public class Deck extends CardCollection{

    /* Constructor for DeckCollection objects */
    public Deck(String label) {
        super(label); // invokes the CardCollection constructor, instantiates labelStr & cardArrList

        /* Adding Card objects to cardArrList in our Deck object */
        for (int suitNum = 0; suitNum <= 3; suitNum++) {
            for(int rankNum = 1; rankNum <= 13; rankNum++) {
                addCard(new Card(suitNum, rankNum)); // adds card object to cardArrList
            }
        }
    }
    
}
