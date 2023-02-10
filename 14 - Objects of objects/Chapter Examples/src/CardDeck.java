public class CardDeck {

    public static void main(String[] args) {

        // Deck deckOne = new Deck("Deck 1");
        // deckOne.shuffle(); // shuffles cards in deck, from CardCollection class

        // Hand handOne = new Hand("MY_HAND");
        // deckOne.deal(handOne, 5); // removes 5 Cards from the end of deckOne and transfers them to handOne
        // handOne.display(); // from Hand class

        // Hand drawPile = new Hand("DRAW_PILE");
        // deckOne.dealAll(drawPile); // removes all cards from deckOne and places then in drawPile
        // System.out.printf("DRAW_PILE has %d cards.\n", drawPile.size());

        Eights gameOne = new Eights();
        gameOne.playGame();

    }

}
