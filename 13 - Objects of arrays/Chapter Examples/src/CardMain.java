public class CardMain {

    public static void main(String[] args) {

        Deck deckOne = new Deck(); // creates a new deck
        // deckOne.printDeck(); // using the print instance method
        deckOne.shuffleDeck();
        System.out.println("[Shuffled Deck]");
        deckOne.printDeck();
        deckOne.selectionSort();
        System.out.println("[Sorted Deck]");
        deckOne.printDeck();

    }

}
