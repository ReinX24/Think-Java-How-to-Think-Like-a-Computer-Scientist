public class Player {

    private String playerName;
    private Hand playerHand;

    /* Constructor for Player objects */
    public Player(String playerName) {
        this.playerName = playerName;
        this.playerHand = new Hand(playerName + " Hand"); // creates a Hand object
    }

    /* Getter for playerHand */
    public Hand getHand() {
        return playerHand;
    }

    /* Displays the Card objects in playerHand */
    public void displayHand() {
        playerHand.displayHand(); // prints Card objects in Hand
    }

    /* Displays playerName & score */
    public void displayScore() {
        System.out.println(playerName + " has " + score() + " points");
    }

    /* Method that decides which Card is to be discarded during each turn */
    public Card playGame(Eights eights, Card topCard) {
        /* Store the most recent Card discarded, topCard */
        Card targetCard = searchForMatch(topCard);
    }

    /*
     * Method that searches for a similar Card in playerHand with the Card in
     * parameter
     */
    public Card searchMatch(Card topCard) {
        /* Iterating through the Array List in playerHand */
        for (int i = 0; i < playerHand.size(); i++) {
            Card eachPlayerCard = playerHand.getCard(i); // gets a Card from playerHand
            if (cardMatches(eachPlayerCard, topCard)) {
                return playerHand.popCard(i); // remove & return the Card that is similar to topCard
            }
        }
    }

    /*
     * Draws Cards from the drawPile until a match for the Card in the parameter is
     * found
     */
    public Card drawForMatch(Eights eights, Card topCard) {
        while (true) {
            /* Get one Card from drawPile in eights object */
            Card drawnCard = eights.draw();
            System.out.println(playerName + " draws " + drawnCard);
            /* Check if the drawnCard is similar in rank or suit with topCard */
            if (cardMatches(drawnCard, topCard)) {
                return drawnCard;
            }
            /* If it is not similar in rank or suit, addCard to existing playerHand */
            playerHand.addCard(drawnCard);
        }
    }

    /*
     * Checks if two Card objects are similar in rank or suit, also checks if the
     * Card has a rank of 8
     */
    public boolean cardMatches(Card playerCard, Card topCard) {
        if (playerCard.getSuit() == topCard.getSuit()) {
            return true;
        }
        if (playerCard.getRank() == topCard.getRank()) {
            return true;
        }
        if (playerCard.getRank() == 8) {
            return true;
        }
        return false;
    }

    /*
     * Method that computes for penalty points, returns a negative number if the
     * game ends and a player still has Cards
     */
    public int score() {
        /* Variable where we will store our penalty points */
        int penaltyPoints = 0;
        for (int i = 0; i < playerHand.size(); i++) {
            /* Get the rank of each Card left in playerHand */
            Card eachRemainingCard = playerHand.getCard(i);
            int eachCardRank = eachRemainingCard.getRank();
            /* Compute for the penalty points */
            /* If the Card rank is equal to 8, subtract 20 points */
            if (eachCardRank == 8) {
                penaltyPoints -= 20;
            } else if (eachCardRank > 10) {
                penaltyPoints -= 10;
            } else {
                penaltyPoints -= eachCardRank;
            }
        }
    }

    /* Getter for playerName */

}
