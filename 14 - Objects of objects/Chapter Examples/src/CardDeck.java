public class CardDeck {

    public static void main(String[] args) {
        
        Deck deckOne = new Deck();
        deckOne.shuffleDeck(); // shuffles deck
        // deckOne.selectionSort(); // sorts deck
        // Deck subDeckOne = deckOne.subDeck(0, 4); // first 5 cards in deckOne
        // Deck subDeckTwo = deckOne.subDeck(8, 12);
        // Deck deckTwo = Deck.mergeSort(subDeckOne, subDeckTwo);
        // System.out.println(deckTwo.toString());
        // deckOne = deckOne.mergeSortRecursive();
        deckOne.insertionSort();
        System.out.println(deckOne.toString());

    }
    
}
