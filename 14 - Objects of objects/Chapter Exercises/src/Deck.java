public class Deck extends CardCollection {

    /* Constructor for Deck objects */
    public Deck(String labelStr) {
        /* Invoke the constructor of our Parent Class (CardCollection). */
        super(labelStr);

        /* Adding Card objects to cardList in our Deck object (from) */
        for (int suitNum = 0; suitNum <= 3; suitNum++) {
            for (int rankNum = 1; rankNum <= 13; rankNum++) {
                addCard(new Card(suitNum, rankNum));
            }
        }

    }
    
}
