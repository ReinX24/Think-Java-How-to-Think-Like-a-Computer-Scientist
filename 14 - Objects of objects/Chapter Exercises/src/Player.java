public class Player {

    private String playerName;
    private Hand playerHand;

    /* Constructor for Player objects */
    public Player(String playerName) {
        this.playerName = playerName;
        this.playerHand = new Hand(playerName + " Hand"); // creates a Hand object
    }

    /* Getter for playerHand */

    /* Displays the Card objects in playerHand */

    /* Displays playerName & score */

    /* Method that decides which Card is to be discarded during each turn */

    /* Method that searches for a similar Card in playerHand with the Card in parameter */
    
}
