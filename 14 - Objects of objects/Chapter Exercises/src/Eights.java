import java.util.ArrayList;
import java.util.Scanner;

public class Eights {

    /*
     * Exercise 14.3 One limitation of the program we wrote in this chapter is that
     * it only handles two players. Modify the Eights class to create an ArrayList
     * of players, and modify nextPlayer to select the next player.
     */

    /* Creating 2 Player objects for the Eights class */
    /* Changed from Player to BetterPlayer */
    private BetterPlayer playerOne;
    private BetterPlayer playerTwo;
    /* Creating more Player objects, for more than 2 players */
    private BetterPlayer playerThree;
    private BetterPlayer playerFour;
    /* ArrayList that holds multiple players */
    ArrayList<BetterPlayer> playerList = new ArrayList<>();
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

        playerThree = new BetterPlayer("Kristianna");
        gameDeck.dealCards(playerThree.getHand(), playerHandSize);

        playerFour = new BetterPlayer("Carina");
        gameDeck.dealCards(playerFour.getHand(), playerHandSize);

        /* Add all the players in playerList */
        playerList.add(playerOne);
        playerList.add(playerTwo);
        playerList.add(playerThree);
        playerList.add(playerFour);

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
        boolean hasNoCards = false;
        for (int i = 0; i < playerList.size(); i++) {
            if (playerList.get(i).getHand().isListEmpty()) {
                hasNoCards = true;
            }
        }
        return hasNoCards;
    }

    /* Moves all Cards from discardPile to drawPile and shuffles the Cards */
    public void reshuffleCards() {
        /*
         * Save the last Card to be the remaining Card for discardPile, removes Card
         * from discardPile
         */
        Card lastDiscard = discardPile.popCard();

        /* Move all of the remaining Cards in discardPile to drawPile */
        discardPile.dealAllCards(drawPile);

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
        /* Player index where we will store the position of the Player */
        int playerIndex = 0;
        /* Find the position of currentPlayer in the ArrayList */
        for (int i = 0; i < playerList.size(); i++) {
            if (currentPlayer == playerList.get(i)) {
                playerIndex = i;
            }
        }
        /* If currentPlayer == playerOne , return playerTwo. Else, return playerOne */
        /* Add other Player objets */
        switch (playerIndex) {
            case 0: 
            return playerList.get(1);
            case 1:   
            return playerList.get(2);
            case 2:
            return playerList.get(3);
            default:
            return playerList.get(0);
        }
    }

    /* Displays the state of the game */
    public void displayState() {
        /*
         * Display playerOne & playerTwo Labels & Cards using display method in their
         * class
         */
        for (int i = 0; i < playerList.size(); i++) {
            playerList.get(i).displayHand();
        }
        /* Display discardPile Cards */
        discardPile.displayHand();
        /* Display drawPile Cards amount, does not show Cards' elements */
        System.out.print("Draw Pile: ");
        System.out.println(drawPile.size() + " cards");
        drawPile.displayHand();
    }

    /* Prompt that asks the user to execute a turn */
    public void waitForUser() {
        System.out.print("[Press Enter to Continue]\n");
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
    public String playGame(int roundNum) {
        /* Make the currentPlayer be playerOne */
        BetterPlayer currentPlayer = playerList.get(0);
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
        for (int i = 0; i < playerList.size(); i++) {
            playerList.get(i).displayScore();
        }

        /* Return the name of the Player who won the game */
        int winnerIndex = 0;
        for (int i = 0; i < playerList.size(); i++) {
            if (playerList.get(i).score() == 0) {
                winnerIndex = i;
            }
        }
        return "\nRound " + roundNum + " Winner: " + playerList.get(winnerIndex).getPlayerName() + "\n"; 
    }
}
