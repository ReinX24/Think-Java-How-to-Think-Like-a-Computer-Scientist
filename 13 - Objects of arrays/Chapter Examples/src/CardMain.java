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
        System.out.println("[Subdeck]");
        Deck subDeckOne = deckOne.subDeck(0, 4); // creates a subdeck fo the first 5 cards in deckOne
        subDeckOne.printDeck();
        Deck subDeckTwo = deckOne.subDeck(5, 9); // another subdeck of 5 cards
        subDeckTwo.printDeck();
        System.out.println("[Testing Merge Decks]");
        Deck mergeSortDeckOne = deckOne.subDeck(0, 4);
        Deck mergeSortDeckTwo = deckOne.subDeck(7, 11);
        Deck mergeSortTest = new Deck();
        mergeSortTest = Deck.mergeDecks(mergeSortDeckOne, mergeSortDeckTwo); // need to call the Class since it is a static method
        mergeSortTest.printDeck();

    }

}
