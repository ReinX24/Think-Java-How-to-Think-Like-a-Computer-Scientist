public class Player {

    private String playerName;
    private Hand playerHand;

    /* Constructor for player object */
    public Player(String playerName) {
        this.playerName = playerName;
        this.playerHand = new Hand(playerName + " Hand");
    }

    /* Getters for playerHand */
    public Hand getHand() {
        return playerHand;
    }

    /* Displays the Hand of the Player */
    public void display() {
        playerHand.display();
    }

    /* Method that decides which card to discard during each turn */
    // DONE: play() method for Player class
    // TODO: Re-read The Player class
    public Card play(Eights eights, Card prev) { // prev is the top of the discardPile in Eights class
        Card cardMatch = searchForMatch(prev);
        if (cardMatch == null) {
            cardMatch = drawForMatch(eights, prev);
        }
        return cardMatch;
    }

    /* Method that searches for matches */
    public Card searchForMatch(Card prev) {
        for (int i = 0; i < playerHand.size(); i++) {
            Card currentCard = playerHand.getCard(i);
            if (cardMatches(currentCard, prev)) {
                return playerHand.popCard(i);
            }
        }
        return null;
    }

    /* Method that draws a card until a match is found */
    public Card drawForMatch(Eights eights, Card prev) {
        while (true) {
            Card drawnCard = eights.draw(); // gets one card from drawPile
            System.out.println(playerName + " draws " + drawnCard);
            if (cardMatches(drawnCard, prev)) { // if drawnCard is equal to prev card in parameter
                return drawnCard;
            }
            playerHand.addCard(drawnCard); // adds drawnCard to playerHand
        }
    }

    /* Method that checks if two Card objects match */
    public boolean cardMatches(Card cardOne, Card cardTwo) {
        if (cardOne.getSuit() == cardTwo.getSuit()) {
            return true;
        }
        if (cardOne.getRank() == cardTwo.getRank()) {
            return true;
        }
        if (cardOne.getRank() == 8) {
            return true;
        }
        return false;
    }

}
