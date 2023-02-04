public class CardDeckMain {

    public static void main(String[] args) {
        
        Deck deckOne = new Deck();
        deckOne.shuffleDeck();
        Deck subDeckOne = deckOne.subDeck(0, 4); // first 5 cards
        subDeckOne.printDeck();

    }
    
}
