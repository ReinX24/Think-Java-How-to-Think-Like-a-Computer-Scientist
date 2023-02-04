public class CardDeckMain {

    public static void main(String[] args) {
        
        Deck deckOne = new Deck();
        // deckOne.shuffleDeck();
        Deck subDeckOne = deckOne.subDeck(0, 4); // first 5 cards
        Deck subDeckTwo = deckOne.subDeck(7, 11);
        subDeckOne.printDeck();
        subDeckTwo.printDeck();
        Deck mergedSortedDeck = new Deck();
        mergedSortedDeck = Deck.mergeDecks(subDeckOne, subDeckTwo);
        mergedSortedDeck.printDeck();

    }
    
}
