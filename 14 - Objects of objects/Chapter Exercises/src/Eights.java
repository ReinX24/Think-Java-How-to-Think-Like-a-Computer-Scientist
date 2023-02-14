import java.util.Scanner;

public class Eights {

    /* Creating 2 Player objects for the Eights class */
    /* Changed from Player to BetterPlayer */
    private BetterPlayer playerOne;
    private BetterPlayer playerTwo;
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
        playerOne = new BetterPlayer("Rein");
        gameDeck.dealCards(playerOne.getHand(), playerHandSize);

        playerTwo = new BetterPlayer("Reinne");
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
    public BetterPlayer nextPlayer(Player currentPlayer) {
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
    /*
     * Exercise 14.2 Write a loop that plays the game 100 times and keeps track
     * of how many times each player wins. If you implemented multiple strategies in
     * the previous exercise, you can play them against each other to evaluate which
     * one works best.
     * 
     * Hint: Design a Genius class that extends Player and overrides the play
     * method, and then replace one of the players with a Genius object.
     */
    public void playGame() {
        /* rountCounter to keep track of which round we are on */
        // int roundCounter = 1;
        /* Looping the game to run 100 times */
        // while (roundCounter <= 3) {
            /* Make the currentPlayer be playerOne */
            BetterPlayer currentPlayer = playerOne;
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

            /* Find the winner of each round */
            // StringBuilder winnerLog = new StringBuilder();
            // String roundWinner = "";
            // if (playerTwo.score() < playerOne.score()) {
            //     roundWinner = playerOne.getPlayerName();
            // } else {
            //     roundWinner = playerTwo.getPlayerName();
            // }
            /* Add roundWinner to StringBuilder & print winnerLog */
            // winnerLog.append("Round " + roundCounter + " Winner :" + roundWinner + "\n");
            // System.out.println(winnerLog);
            /* Increment roundCounter */
            // roundCounter++;
        }
    }

