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
        discardPile = new Hand("Discard Pile");
        gameDeck.dealCards(discardPile, 1);

        /* Create a Hand object for all the remaining Cards in gameDeck */
        drawPile = new Hand("Draw Pile");
        gameDeck.dealAllCards(drawPile);

        /* Finish creating our Scanner object */
        userInput = new Scanner(System.in);

    }

    /* Method that checks if one of the playerHands are emtpy */
    public boolean isDone() {
        return playerOne.getHand().isListEmpty() || playerTwo.getHand().isListEmpty();
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

    /* Method that switches players, triggered after each Player turn */
    public Player nextPlayer(Player currentPlayer) {
        /* If currentPlayer == playerOne , return playerTwo. Else, return playerOne */
        if (currentPlayer == playerOne) {
            return playerTwo;
        } else {
            return playerOne;
        }
    }

    /* Displays the state of the game */
    public void displayState() {
        /*
         * Display playerOne & playerTwo Labels & Cards using display method in their
         * class
         */
        playerOne.displayHand();
        playerTwo.displayHand();
        /* Display discardPile Cards */
        discardPile.displayHand();
        /* Display drawPile Cards amount, does not show Cards' elements */
        System.out.print("Draw Pile: ");
        System.out.println(drawPile.size() + " cards");
    }

    /* Prompt that asks the user to execute a turn */
    public void waitForUser() {
        System.out.print("[Press Enter to Continue]\n> ");
        userInput.nextLine();
    }

    /* One Player takes their turn */
    public void takeTurn(Player currentPlayer) {
        /* Get the lastCard in discardPile */
        Card topCard = discardPile.lastCard();
        /*
         * Finds a similar Card in the currentPlayer's hand, passes in current Eights
         * object & topCard.
         */
        Card matchCard = currentPlayer.playGame(this, topCard);
        /* Add matching Card to discardPile */
        discardPile.addCard(matchCard);
        /* Display the Card that the currentPlayer adds to discardPile */
        System.out.println(currentPlayer.getPlayerName() + " plays " + matchCard);
        System.out.println();
    }

    /* Method that loops the game until one of the player's Hand are out of Cards */
    public void playGame() {
        /* Make the currentPlayer be playerOne */
        Player currentPlayer = playerOne;
        /*
         * Show each player's Cards, prompt user to continue game, each player takes
         * their turn until one of them run out of Cards, replace the currentPlayer.
         */
        /*
         * Show each player's Cards, discarded Cards (discardPile), & amount of Cards in
         * drawPile
         */
        while (!isDone()) {
            displayState();
            waitForUser();
            takeTurn(currentPlayer);
            currentPlayer = nextPlayer(currentPlayer);
        }
        /* Display the total penalty points of each player, winner should have 0 */
        playerOne.displayScore();
        playerTwo.displayScore();
    }

}