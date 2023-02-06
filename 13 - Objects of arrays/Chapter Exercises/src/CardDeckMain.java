public class CardDeckMain {

    public static void main(String[] args) {
        
        Deck deckOne = new Deck();
        deckOne.shuffleDeck();
        Deck subDeckOne = deckOne.subDeck(0, 4); // 5 random cards
        Deck subDeckTwo = deckOne.subDeck(10, 14); // another set of 5 cards
        System.out.println("\n[Deck One]");
        subDeckOne.selectionSort();
        subDeckOne.printDeck();
        System.out.println("[DeckTwo]");
        subDeckTwo.selectionSort();
        subDeckTwo.printDeck();
        System.out.println("\n[Merged and Sorted Deck]");
        Deck mergedSortedDeck = new Deck();
        mergedSortedDeck = Deck.mergeDecks(subDeckOne, subDeckTwo);
        mergedSortedDeck.printDeck();
        System.out.println("\n[Merge Sort Deck]");
        mergedSortedDeck = mergedSortedDeck.mergeSortRecursive();
        mergedSortedDeck.printDeck();
        System.out.println("\n[Insertion Sort]");
        Deck insertionSortDeck = new Deck();
        insertionSortDeck = Deck.mergeDecks(subDeckOne, subDeckTwo);
        insertionSortDeck.insertionSort();
        insertionSortDeck.printDeck();
        System.out.println("\n[Testing toStringDeck]");
        System.out.println(insertionSortDeck.toString());

    }
    
}
