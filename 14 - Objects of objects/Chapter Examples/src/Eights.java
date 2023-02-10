import java.util.Scanner;

public class Eights {

    private Player playerOne;
    private Player playerTwo;
    private Hand drawPile;
    private Hand discardPile;
    private Scanner scanOne;

    /* Constructor for Eights objects */
    public Eights() {
        /* Creating a Deck object for our game */
        Deck deckOne = new Deck("Deck");
        /* Shuffling the deck */
        deckOne.shuffle();

        /* Give cards to each player */
        int handSize = 5; // 5 cards for each player

        playerOne = new Player("Rein");
        deckOne.deal(playerOne.getHand(), handSize);

        playerTwo = new Player("Reinne");
        deckOne.deal(playerTwo.getHand(), handSize);

        /* Turn one card face up and add to discardPile */
        discardPile = new Hand("Discards");
        deckOne.deal(discardPile, 1); // removes a Card at the end of deckOne

        /* Put the rest of the deck face down */
        drawPile = new Hand("Draw Pile");
        deckOne.dealAll(drawPile); // moves all remaining Cards in deckOne to drawPile

        /* Create a Scanner object */
        scanOne = new Scanner(System.in);

    }

    /*
     * Method that checks if all the hands are empty, if true it indicates that the
     * game is over
     */
    public boolean isDone() {
        return playerOne.getHand().empty() || playerTwo.getHand().empty();
    }

    /* Moves all cards from discardPile to drawPile and shuffles */
    public void reshuffle() {
        /* Save the top card */
        Card prevTopCard = discardPile.popCard();

        /* Moves the rest of discardPile to drawPile */
        discardPile.dealAll(drawPile);

        /* Put the top card back in the discardPile */
        discardPile.addCard(prevTopCard);

        /* Shuffle the drawPile */
        drawPile.shuffle();
    }

    /* Returns a Card from the drawPile */
    public Card draw() {
        /* If the drawPile is empty, reshuffle all the cards */
        if (drawPile.empty()) {
            reshuffle();
        }
        return drawPile.popCard(); // gets one card from drawPile
    }

    /* Switches players */
    public Player nextPlayer(Player currentPlayer) {
        /*
         * if the currentPlayer is playerOne, return playerTwo. Else, return playerOne
         */
        if (currentPlayer == playerOne) {
            return playerTwo;
        } else {
            return playerOne;
        }
    }

    /* Displays the state of the game */
    public void displayState() {
        /* Displays the cards of different objects */
        playerOne.display();
        playerTwo.display();
        discardPile.display();
        System.out.print("Draw Pile: ");
        System.out.println(drawPile.size() + " cards");
    }

    /* Waiting for the user to press enter */
    public void waitForUser() {
        scanOne.nextLine();
    }

    /* One player takes a turn */
    public void takeTurn(Player currentPlayer) {
        Card prevTopCard = discardPile.lastCard();
        Card nextCard = currentPlayer.play(this, prevTopCard); // passes 
        discardPile.addCard(nextCard);

        System.out.println(currentPlayer.getName() + " plays " + nextCard);
        System.out.println();
    }

    /* Method that uses methods above to play the game */
    public void playGame() {
        Player currentPlayer = playerOne;
        /* keep playing the game until there is a winner */
        // DONE: Implement playGame() method
        while (!isDone()) {
            displayState();
            waitForUser();
            takeTurn(currentPlayer);
            currentPlayer = nextPlayer(currentPlayer);
        }

        /* display the final score */
        playerOne.displayScore();
        playerTwo.displayScore();
    }

}
