public class CardMain {

    public static void main(String[] args) {

        Deck deckOne = new Deck(); // creates a new deck
        // deckOne.printDeck(); // using the print instance method
        deckOne.shuffleDeck();
        deckOne.printDeck();
        deckOne.selectionSort();
        deckOne.printDeck();

    }

}
