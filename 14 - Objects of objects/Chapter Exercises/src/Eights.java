import java.util.Scanner;

public class Eights {

    /* Creating 2 Player objects for the Eights class */
    private Player playerOne;
    private Player playerTwo;
    /* Create 2 Hand objects, discardPile & drawPile */
    private Hand discardPile;
    private Hand drawPile;
    /* Create an instance of the Scanner class to accept user input */
    Scanner userInput;

    /* Constructor for Eights objects */
    public Eights() {
        /* Create a Deck containing Cards */
        Deck gameDeck = new Deck("Deck");

        /* Shuffle the Card in the Deck */
        gameDeck.shuffleCards(); // method from Deck class

        /* Give 5 Card objects to each player */
        int playerHandSize = 5;

        /* Create 2 Player objects and give each Player object Cards */
        playerOne = new Player("Rein");
        gameDeck.dealCards(playerOne.getHand(), playerHandSize);

        playerTwo = new Player("Reinne");
        gameDeck.dealCards(playerTwo.getHand(), playerHandSize);

        /*
         * Create a Hand object for discarded Cards & get one Card from gameDeck to be
         * the first Card in that Hand
         */
        Hand discardPile = new Hand("Discard Pile");
        gameDeck.dealCards(discardPile, 1);

        /* Create a Hand object for all the remaining Cards in gameDeck */
        Hand drawPile = new Hand("Draw Pile");

        /* Finish creating our Scanner object */
        userInput = new Scanner(System.in);

    }

    /* Method that checks if one of the playerHands are emtpy */
    public boolean isEmpty() {
        return playerOne.getHand().isListEmpty() || playerOne.getHand().isListEmpty();
    }

    /* Moves all Cards from discardPile to drawPile and shuffles the Cards */
    public void reshuffleCards() {
        /*
         * Save the last Card to be the remaining Card for discardPile, removes Card
         * from discardPile
         */
        Card lastDiscard = discardPile.popCard();

        /* Move all of the remaining Cards in discardPile to drawPile */
        drawPile.dealAllCards(discardPile);

        /* Return the top Card at discardPile */
        discardPile.addCard(lastDiscard);

        /* Shuffle the drawPile */
        drawPile.shuffleCards();

    }

    /* Draw a Card from the drawPile */
    public Card drawCard() {
        /* If the drawPile is empty, reshuffle all of the Cards */
        if (drawPile.isListEmpty()) {
            reshuffleCards();
        }
        /*
         * If there are Cards in drawPile, remove Card from drawPile & return the Card
         */
        return drawPile.popCard();
    }

}
